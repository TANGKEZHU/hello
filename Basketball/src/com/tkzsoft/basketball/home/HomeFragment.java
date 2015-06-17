package com.tkzsoft.basketball.home;

import java.util.ArrayList;
import java.util.List;

import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.tkzsoft.basketball.R;
import com.tkzsoft.basketball.util.TitlebarUtil;
import com.tkzsoft.basketball.util.adapter.HomeAdapter;
import com.tkzsoft.basketball.util.adapter.HomePopAdapter;
import com.tkzsoft.basketball.util.model.BasketballItem;
import com.tkzsoft.basketball.util.myfragment.BaseFragment;

public class HomeFragment extends BaseFragment {
	private GridView listView;
	private List<BasketballItem> basketballItems;
	private int[] imageIDs = { R.drawable.home_club, R.drawable.home_disciple,
			R.drawable.home_search_field, R.drawable.home_angel_man,
			R.drawable.home_major_league, R.drawable.home_fight };
	private int[] itemNames = { R.string.home_gird_item_name_club,
			R.string.home_gird_item_name_disciple,
			R.string.home_gird_item_name_search_field,
			R.string.home_gird_item_name_angel_man,
			R.string.home_gird_item_name_major_league,
			R.string.home_gird_item_name_fight };
	private HomeAdapter homeAdapter;
	private HomePopAdapter homePopAdapter;
	private PopupWindow popWindow;
	private LayoutInflater laInflater;
	private View layout;
	private TextView rightTextView;
	private View includeView;
	private List<String> cityNamesList = new ArrayList<String>();

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		layout = inflater.inflate(R.layout.fragment_home, null);
		listView = (GridView) layout.findViewById(R.id.home_grid_view);
		includeView = layout.findViewById(R.id.titlebar);
		initData();
		initTitleBar();
		return layout;
	}

	private void initData() {
		basketballItems = new ArrayList<BasketballItem>();
		laInflater = LayoutInflater.from(getActivity());
		for (int i = 0; i < imageIDs.length; i++) {
			BasketballItem basketballItem = new BasketballItem();
			basketballItem.setImageID(imageIDs[i]);
			basketballItem.setItemName(getString(itemNames[i]));
			basketballItems.add(basketballItem);
		}
		homeAdapter = new HomeAdapter(getActivity(), basketballItems);
		listView.setAdapter(homeAdapter);
		cityNamesList.add("龙岗区");
		cityNamesList.add("罗湖区");
		cityNamesList.add("福田区");
		cityNamesList.add("盐田区");
		cityNamesList.add("宝安区");
		cityNamesList.add("南山区");
		homePopAdapter = new HomePopAdapter(getActivity(), cityNamesList);
	}

	protected void initTitleBar() {
		TitlebarUtil.showTitleName(layout, R.string.home);
		rightTextView = TitlebarUtil.showRightName(layout,
				R.string.home_right_text);
		rightTextView.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				popWindow(includeView);
			}
		});
		rightTextView.setCompoundDrawablesWithIntrinsicBounds(getActivity()
				.getResources().getDrawable(R.drawable.home_location), null,
				null, null);
	}

	private void popWindow(View view) {
		View layout = laInflater.inflate(R.layout.home_pop_window_layout, null);
		popWindow = new PopupWindow(layout,
				ViewGroup.LayoutParams.MATCH_PARENT,
				ViewGroup.LayoutParams.MATCH_PARENT, true);
		popWindow.setFocusable(true);
		popWindow.setOutsideTouchable(true);
		popWindow.setBackgroundDrawable(new BitmapDrawable());
		popWindow.showAsDropDown(view);
		GridView gridView = (GridView) layout
				.findViewById(R.id.home_pop_grid_view);
		LinearLayout linearLayout = (LinearLayout) layout
				.findViewById(R.id.home_pop_window);
		final TextView city = (TextView) layout
				.findViewById(R.id.home_pop_city);
		TextView changeView = (TextView) layout
				.findViewById(R.id.home_change_city);

		gridView.setAdapter(homePopAdapter);
		linearLayout.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				popWindow.dismiss();
			}
		});
		changeView.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				rightTextView.setText(city.getText().toString());
			}
		});
		gridView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				city.setText(cityNamesList.get(arg2));
			}
		});

	}

}