package com.tkzsoft.basketball.home;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.PopupWindow;

import com.tkzsoft.basketball.R;
import com.tkzsoft.basketball.util.adapter.HomeAdapter;
import com.tkzsoft.basketball.util.model.BasketballItem;
import com.tkzsoft.basketball.util.myfragment.BaseFragment;

public class HomeFragment extends BaseFragment implements OnClickListener {
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
	private PopupWindow popWindow;
	private LayoutInflater laInflater;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View layout = inflater.inflate(R.layout.fragment_home, null);
		listView = (GridView) layout.findViewById(R.id.home_grid_view);
		initData();
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
	}

	@Override
	public void onClick(View v) {

	}

	private void popWindow(View view) {
		View layout = laInflater.inflate(R.layout.activity_main,
				null);
		popWindow = new PopupWindow(layout,
				ViewGroup.LayoutParams.MATCH_PARENT,
				ViewGroup.LayoutParams.MATCH_PARENT, true);
		popWindow.showAsDropDown(view);
	}

}