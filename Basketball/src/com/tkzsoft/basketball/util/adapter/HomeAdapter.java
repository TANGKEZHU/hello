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

public class HomeAdapter extends BaseAdapter {

	private Context context;
	private List<BasketballItem> basketballItems;
	private LayoutInflater laInflater;

	public HomeAdapter(Context context, List<BasketballItem> basketballItems) {
		this.context = context;
		this.basketballItems = basketballItems;
		laInflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		return basketballItems.size();
	}

	@Override
	public Object getItem(int arg0) {
		return basketballItems.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		return 0;
	}

	@Override
	public View getView(int arg0, View view, ViewGroup arg2) {
		if (view == null) {
			view = laInflater.inflate(R.layout.adapter_home_layout, null);
		}
		BasketballItem basketballItem = basketballItems.get(arg0);
		TextView item = BaseViewHolder.get(view, R.id.tv_home_gird_item);
		item.setCompoundDrawablesWithIntrinsicBounds(null, context
				.getResources().getDrawable(basketballItem.getImageID()), null,
				null);
		item.setText(basketballItem.getItemName());
		return view;
	}
}
