package com.tkzsoft.basketball.util.myfragment;

import com.tkzsoft.basketball.util.config.Config;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class BaseFragment extends Fragment {

	private static final String TAG = "BaseFragment";

	public FragmentManager mFragmentManager;
	public FragmentTransaction mFragmentTransaction;

	protected Config config;
	protected Context context;
	protected Handler handler;
	protected boolean isInit; // �Ƿ���Կ�ʼ��������

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		config = (Config) getActivity().getApplicationContext();
		context = getActivity();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		return super.onCreateView(inflater, container, savedInstanceState);
	}

	/**
	 * �ú�����Ҫ�����ж���Ƭ�Ƿ�����ʾ����ʾ�Ļ�����Ҫ�������ݣ�����ʾ�Ļ���ʱ���������ݣ������������app��ʱ����ٶ�
	 */
	@Override
	public void setUserVisibleHint(boolean isVisibleToUser) {
		super.setUserVisibleHint(isVisibleToUser);
		Log.v(TAG, "isVisibleToUser::" + isVisibleToUser);
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
	}

	@Override
	public void onResume() {
		super.onResume();
	}

	@Override
	public void onDestroyView() {
		super.onDestroyView();
	}

	protected void init() {
	}

	protected void initTitleBar() {
	}

	protected void initView() {
	}

	protected void loadView() {
	}

	protected void initHandler() {
	}

	protected void sendMsg(int whatId, Object objs) {
		Message msg = new Message();
		msg.what = whatId;
		msg.obj = objs;
		Log.v("sendMsg", "msg.what=" + msg.what);
		if (handler != null) {
			handler.sendMessage(msg);
		}
	}

	protected void showTip(String mString) {
		Toast.makeText(context, mString, 1000).show();
	}

	protected void showTip(int mString) {
		Toast.makeText(context, mString, 1000).show();
	}
}
