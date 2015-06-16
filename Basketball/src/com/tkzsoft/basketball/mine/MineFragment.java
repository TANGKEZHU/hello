package com.tkzsoft.basketball.mine;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tkzsoft.basketball.R;
import com.tkzsoft.basketball.util.myfragment.BaseFragment;

public class MineFragment extends BaseFragment {
	private View view;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.fragment_mine, null);
		initTitleBar();
		return view;
	}

	protected void initTitleBar() {
//		TextView mTitleName = TitlebarUtil.showTitleName(view, R.string.mine);
		// TitlebarUtil.showLeftName(this,
		// R.string.back).setOnClickListener(this);
		// mSave = TitlebarUtil.showRightNa
	}
}