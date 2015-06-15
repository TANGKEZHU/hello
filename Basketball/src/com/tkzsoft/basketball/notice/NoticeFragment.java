package com.tkzsoft.basketball.notice;

import com.tkzsoft.basketball.R;
import com.tkzsoft.basketball.util.myfragment.BaseFragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class NoticeFragment extends BaseFragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View layout = inflater.inflate(R.layout.fragment_notice, null);
		return layout;
	}
}