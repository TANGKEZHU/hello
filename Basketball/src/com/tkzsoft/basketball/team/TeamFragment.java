package com.tkzsoft.basketball.team;

import java.util.ArrayList;
import java.util.List;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;

import com.tkzsoft.basketball.R;
import com.tkzsoft.basketball.util.TitlebarUtil;
import com.tkzsoft.basketball.util.adapter.TeamAdapter;
import com.tkzsoft.basketball.util.model.TeamItem;
import com.tkzsoft.basketball.util.myfragment.BaseFragment;

public class TeamFragment extends BaseFragment {

	private ListView mListView;
	private EditText mEditText;
	private TeamAdapter adapter;
	private List<TeamItem> namesList = new ArrayList<TeamItem>();
	private InitAsyncTask asyncTask = new InitAsyncTask();
	private int[] teamIDs = { R.drawable.team_image_1, R.drawable.team_image_2,
			R.drawable.team_image_3, R.drawable.team_image_4,
			R.drawable.team_image_5, R.drawable.team_image_6,
			R.drawable.team_image_7, R.drawable.team_image_8,
			R.drawable.team_image_9, R.drawable.team_image_10,
			R.drawable.team_image_11 };
	private View layout;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		layout = inflater.inflate(R.layout.fragment_team, null);
		mListView = (ListView) layout.findViewById(R.id.list_team_view);
		mEditText = (EditText) layout.findViewById(R.id.edit_search);
		asyncTask.execute("start");
		initTitleBar();
		return layout;
	}

	protected void initTitleBar() {
		TitlebarUtil.showTitleName(layout, R.string.team_search);
	}

	private void initData() {
		for (int i = 0; i < 11; i++) {
			TeamItem item = new TeamItem();
			item.setAge(i);
			item.setBallMorality(i);
			item.setTeamName("ÏÈ·æ" + i);
			item.setImageID(getImage(teamIDs[i]));
			item.setMemberCount(i);
			item.setWins(i);
			item.setDistance(i + "km×óÓÒ");
			namesList.add(item);
		}

	}

	private Bitmap getImage(int id) {
		Bitmap bitmap = BitmapFactory
				.decodeResource(context.getResources(), id);
		return bitmap;
	}

	class InitAsyncTask extends AsyncTask<String, Integer, String> {

		@Override
		protected String doInBackground(String... arg0) {
			initData();
			return null;
		}

		@Override
		protected void onPostExecute(String result) {
			adapter = new TeamAdapter(getActivity(), namesList);
			mListView.setAdapter(adapter);
		}

	}

}