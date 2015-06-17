package com.tkzsoft.basketball.util.adapter;

import java.util.List;

import com.tkzsoft.basketball.R;
import com.tkzsoft.basketball.util.BaseViewHolder;
import com.tkzsoft.basketball.util.model.BasketballItem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class HomePopAdapter extends BaseAdapter {

	private Context context;
	private List<String> namesList;
	private LayoutInflater laInflater;

	public HomePopAdapter(Context context, List<String> namesList) {
		this.context = context;
		this.namesList = namesList;
		laInflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		return namesList.size();
	}

	@Override
	public Object getItem(int arg0) {
		return namesList.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		return 0;
	}

	@Override
	public View getView(int arg0, View view, ViewGroup arg2) {
		if (view == null) {
			view = laInflater.inflate(R.layout.adapter_home_pop_layout, null);
		}
		TextView item = BaseViewHolder.get(view, R.id.tv_home_gird_item);
		item.setText(namesList.get(arg0));
		return view;
	}
}
