package com.tkzsoft.basketball.circle;

import com.tkzsoft.basketball.R;
import com.tkzsoft.basketball.util.myfragment.BaseFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CircleFragment extends BaseFragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View layout = inflater.inflate(R.layout.fragment_circle, null);
		return layout;
	}
}