package com.tkzsoft.basketball;

import com.tkzsoft.basketball.circle.CircleFragment;
import com.tkzsoft.basketball.home.HomeFragment;
import com.tkzsoft.basketball.mine.MineFragment;
import com.tkzsoft.basketball.notice.NoticeFragment;
import com.tkzsoft.basketball.set.SetFragment;
import com.tkzsoft.basketball.team.TeamFragment;
import com.tkzsoft.basketball.util.adapter.MenuListViewAdapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.SlidingPaneLayout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends FragmentActivity implements OnItemClickListener {

	private SlidingPaneLayout mDrawer_layout; // 抽屉式布局
	private LinearLayout mMenu_layout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mDrawer_layout = (SlidingPaneLayout) findViewById(R.id.drawer_layout);
		mMenu_layout = (LinearLayout) findViewById(R.id.menu_layout);
		ListView menu_listview = (ListView) mMenu_layout.findViewById(R.id.menu_listView);
		String[] tempMapList = new String[] { "首页", "知道", "球队", "叮圈", "我的", "设置" };
		menu_listview.setAdapter(new MenuListViewAdapter(getApplicationContext(), tempMapList));
		// 菜单ListView设置监听事件
		menu_listview.setOnItemClickListener(this);

		// mDrawer_layout.openDrawer(Gravity.LEFT);
		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
		Fragment fragment = null;
		fragment = new HomeFragment();
		ft.replace(R.id.fragment_layout, fragment);
		ft.commit();
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
		Fragment fragment = null;
		// 根据item点击行号判断启用指定Fragment 首页 知道 球队 叮圈 我的 设置
		switch (position) {
		case 0:
			fragment = new HomeFragment();
			break;
		case 1:
			fragment = new NoticeFragment();
			break;
		case 2:
			fragment = new TeamFragment();
			break;
		case 3:
			fragment = new CircleFragment();
			break;
		case 4:
			fragment = new MineFragment();
			break;
		case 5:
			fragment = new SetFragment();
			break;
		default:
			fragment = new HomeFragment();
			break;
		}
		ft.replace(R.id.fragment_layout, fragment);
		ft.commit();
		// mDrawer_layout.closeDrawer(mMenu_layout);// 点击后关闭mMenu_layout
		mDrawer_layout.closePane();
	}
}