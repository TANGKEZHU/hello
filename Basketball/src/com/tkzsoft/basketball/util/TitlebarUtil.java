package com.tkzsoft.basketball.util;

import com.tkzsoft.basketball.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class TitlebarUtil {

	public static final String BACKTITLE = "backTitle";

	// ����========================================================================
	/**
	 * ��ʾ����
	 * 
	 * @param activity
	 *            ��ǰ��activity
	 * @param titleName
	 *            ����
	 * @return
	 */
	public static TextView showTitleName(Activity activity, String titleName) {
		TextView tvTitleName = (TextView) activity.findViewById(R.id.title_tv);
		tvTitleName.setText(titleName);
		tvTitleName.setVisibility(View.VISIBLE);
		return tvTitleName;
	}

	/**
	 * �ұ�����
	 * 
	 * @param activity
	 *            ��ǰ��activity
	 * @param titleName
	 *            ����
	 * @return
	 */
	public static TextView showRightName(Activity activity, int titleName) {
		TextView tvTitleName = (TextView) activity.findViewById(R.id.title_right_tv);
		tvTitleName.setText(titleName);
		tvTitleName.setVisibility(View.VISIBLE);
		return tvTitleName;
	}

	/**
	 * �������
	 * 
	 * @param activity
	 *            ��ǰ��activity
	 * @param titleName
	 *            ����
	 * @return
	 */
	public static TextView showLeftName(Activity activity, int titleName) {
		TextView tvTitleName = (TextView) activity.findViewById(R.id.title_left_tv);
		tvTitleName.setText(titleName);
		tvTitleName.setVisibility(View.VISIBLE);
		return tvTitleName;
	}

	/**
	 * �������
	 * 
	 * @param activity
	 *            ��ǰ��activity
	 * @param titleName
	 *            ����
	 * @return
	 */
	public static TextView showLeftName(View view, int titleName) {
		TextView tvTitleName = (TextView) view.findViewById(R.id.title_left_tv);
		tvTitleName.setText(titleName);
		tvTitleName.setVisibility(View.VISIBLE);
		return tvTitleName;
	}

	/**
	 * �ұ�����
	 * 
	 * @param activity
	 *            ��ǰ��activity
	 * @param titleName
	 *            ����
	 * @return
	 */
	public static TextView showRightName(View view, int titleName) {
		TextView tvTitleName = (TextView) view.findViewById(R.id.title_right_tv);
		tvTitleName.setText(titleName);
		tvTitleName.setVisibility(View.VISIBLE);
		return tvTitleName;
	}

	/**
	 * ��ʾ����
	 * 
	 * @param activity
	 *            ��ǰ��activity
	 * @param titleNameId
	 *            ����id
	 */
	public static TextView showTitleName(Activity activity, int titleNameId) {
		TextView tvTitleName = (TextView) activity.findViewById(R.id.title_tv);
		tvTitleName.setText(titleNameId);
		tvTitleName.setVisibility(View.VISIBLE);
		return tvTitleName;
	}

	/**
	 * ��ʾ����
	 * 
	 * @param activity
	 *            ��ǰ��activity
	 * @param titleNameId
	 *            ����id
	 */
	public static TextView showTitleName(View view, int titleNameId) {
		TextView tvTitleName = (TextView) view.findViewById(R.id.title_tv);
		tvTitleName.setText(titleNameId);
		tvTitleName.setVisibility(View.VISIBLE);
		return tvTitleName;
	}

	// ���Ұ�ť========================================================================

	/**
	 * ��ʾ���Button��ť
	 * 
	 * @param activity
	 *            ��ǰ��activity
	 * @return
	 */
	public static Button showBtnLeft(Activity activity, int stringId) {
		Button btnLeft = (Button) activity.findViewById(R.id.title_btn_left);
		btnLeft.setText(stringId);
		btnLeft.setVisibility(View.VISIBLE);
		return btnLeft;
	}

	/**
	 * ��ʾ�ұߵ�Button��ť
	 * 
	 * @param activity
	 *            ��ǰ��activity
	 * @return
	 */
	public static Button showBtnRight(Activity activity, int stringId) {
		Button btnRight = (Button) activity.findViewById(R.id.title_btn_right);
		btnRight.setText(stringId);
		btnRight.setVisibility(View.VISIBLE);
		return btnRight;
	}

	/**
	 * ��ʾ��ߵ�ImageButton��ť
	 * 
	 * @param activity
	 *            ��ǰ��activity
	 * @param drawableId
	 *            iamgebutton��ͼ�갴ť
	 * @return
	 */
	public static ImageButton showIbLeft(Activity activity, int drawableId) {
		ImageButton btnLeft = (ImageButton) activity.findViewById(R.id.title_ib_left);
		btnLeft.setVisibility(View.VISIBLE);
		btnLeft.setImageResource(drawableId);
		return btnLeft;
	}

	/**
	 * ��ʾ�ұߵ�ImageButton��ť��Ҫ��ID�ı���ʾ
	 * 
	 * @param activity
	 *            ��ǰ��activity
	 * @param drawableId
	 *            imageButton��ͼ�갴ť
	 * @return
	 */
	public static ImageButton showIbRight(Activity activity, int drawableId) {
		ImageButton btnRight = (ImageButton) activity.findViewById(R.id.title_ib_right);
		btnRight.setVisibility(View.VISIBLE);
		btnRight.setImageResource(drawableId);
		return btnRight;
	}

	/**
	 * ��ʾ�ұߵ�ImageButton��ť���ұ߿��ڵİ�ť
	 * 
	 * @param activity
	 *            ��ǰ��activity
	 * @param drawableId
	 *            imageButton��ͼ�갴ť
	 * @return
	 */
	public static ImageButton showIbRight2(Activity activity, int drawableId) {
		ImageButton btnRight = (ImageButton) activity.findViewById(R.id.title_ib_right2);
		btnRight.setVisibility(View.VISIBLE);
		btnRight.setImageResource(drawableId);
		return btnRight;
	}

	/**
	 * ʹ����Դ�ļ���������һҳ���ذ�ť���ı�
	 * 
	 * @param intent
	 * @param context
	 * @param currentTitle
	 */
	public static void setNext_pageBackBtn(Intent intent, Context context, int currentTitle) {
		intent.putExtra(TitlebarUtil.BACKTITLE, context.getString(currentTitle));
	}

	/**
	 * ��ʾ��ߵ�ImageButton��ť
	 * 
	 * @param activity
	 *            ��ǰ��activity
	 * @param drawableId
	 *            iamgebutton��ͼ�갴ť
	 * @return
	 */
	public static ImageButton showIbHome(Activity activity) {
		ImageButton title_home_right = (ImageButton) activity.findViewById(R.id.title_home_right);
		title_home_right.setVisibility(View.VISIBLE);
		return title_home_right;
	}

}
