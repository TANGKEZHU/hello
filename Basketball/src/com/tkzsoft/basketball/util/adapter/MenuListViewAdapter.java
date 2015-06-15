package com.tkzsoft.basketball.util.adapter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tkzsoft.basketball.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MenuListViewAdapter extends BaseAdapter {
	private LayoutInflater mInflater;
	private Context context;
	private String[] lists;

	public MenuListViewAdapter(Context context, String[] dataList) {
		mInflater = LayoutInflater.from(context);
		this.context = context;
		lists = dataList;
	}

	@Override
	public int getCount() {
		return lists.length;
	}

	@Override
	public Object getItem(int position) {
		return lists[position];
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(final int position, View convertView, ViewGroup parent) {
		ViewHolder holder = null;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = mInflater.inflate(R.layout.main_listitem, null);
			holder.menu = (TextView) convertView.findViewById(R.id.menu);
			holder.menu_item_bg = convertView.findViewById(R.id.menu_item_bg);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		holder.menu.setText(lists[position]);
		holder.menu_item_bg.setBackgroundResource(R.drawable.menu_home_bg);
		return convertView;
	}

	static class ViewHolder {
		TextView menu; // ²Ëµ¥Ãû³Æ
		View menu_item_bg;
	}
}