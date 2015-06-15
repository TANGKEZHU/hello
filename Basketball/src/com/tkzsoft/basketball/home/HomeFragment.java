package com.tkzsoft.basketball.home;

import com.tkzsoft.basketball.R;
import com.tkzsoft.basketball.util.myfragment.BaseFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.TextView;

public class HomeFragment extends BaseFragment implements OnClickListener {
	private TextView textView;
	private ListView listView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View layout = inflater.inflate(R.layout.fragment_home, null);
		return layout;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}
}