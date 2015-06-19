package com.tkzsoft.basketball.util.adapter;

import java.util.List;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.tkzsoft.basketball.R;
import com.tkzsoft.basketball.util.BaseViewHolder;
import com.tkzsoft.basketball.util.model.TeamItem;

public class TeamAdapter extends BaseAdapter {

	private Context context;
	private List<TeamItem> namesList;
	private LayoutInflater laInflater;

	public TeamAdapter(Context context, List<TeamItem> namesList) {
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
			view = laInflater.inflate(R.layout.adapter_team_layout, null);
		}
		ImageView teamImage = BaseViewHolder.get(view, R.id.team_image);
		TextView itemName = BaseViewHolder.get(view, R.id.team_name);
		TextView itemDistance = BaseViewHolder.get(view, R.id.team_distance);
		TextView itemCount = BaseViewHolder.get(view, R.id.team_count);
		TextView itemAge = BaseViewHolder.get(view, R.id.team_member_age);
		TextView itemWin = BaseViewHolder.get(view, R.id.team_win);
		TextView itemMorality = BaseViewHolder.get(view, R.id.team_morality);
		TeamItem teamItem = namesList.get(arg0);
		teamImage.setImageBitmap(teamItem.getImageID());
		itemName.setText(teamItem.getTeamName());
		itemDistance.setText(teamItem.getDistance());
		itemCount.setText(teamItem.getMemberCount() + "");
		itemAge.setText(teamItem.getAge() + "");
		itemWin.setText(teamItem.getWins() + "%");
		itemMorality.setText(teamItem.getBallMorality() + "");
		return view;
	}
}
