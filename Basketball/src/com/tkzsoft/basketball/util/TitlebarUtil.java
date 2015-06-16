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

	// 标题========================================================================
	/**
	 * 显示标题
	 * 
	 * @param activity
	 *            当前的activity
	 * @param titleName
	 *            标题
	 * @return
	 */
	public static TextView showTitleName(Activity activity, String titleName) {
		TextView tvTitleName = (TextView) activity.findViewById(R.id.title_tv);
		tvTitleName.setText(titleName);
		tvTitleName.setVisibility(View.VISIBLE);
		return tvTitleName;
	}

	/**
	 * 右边文字
	 * 
	 * @param activity
	 *            当前的activity
	 * @param titleName
	 *            标题
	 * @return
	 */
	public static TextView showRightName(Activity activity, int titleName) {
		TextView tvTitleName = (TextView) activity.findViewById(R.id.title_right_tv);
		tvTitleName.setText(titleName);
		tvTitleName.setVisibility(View.VISIBLE);
		return tvTitleName;
	}

	/**
	 * 左边文字
	 * 
	 * @param activity
	 *            当前的activity
	 * @param titleName
	 *            标题
	 * @return
	 */
	public static TextView showLeftName(Activity activity, int titleName) {
		TextView tvTitleName = (TextView) activity.findViewById(R.id.title_left_tv);
		tvTitleName.setText(titleName);
		tvTitleName.setVisibility(View.VISIBLE);
		return tvTitleName;
	}

	/**
	 * 左边文字
	 * 
	 * @param activity
	 *            当前的activity
	 * @param titleName
	 *            标题
	 * @return
	 */
	public static TextView showLeftName(View view, int titleName) {
		TextView tvTitleName = (TextView) view.findViewById(R.id.title_left_tv);
		tvTitleName.setText(titleName);
		tvTitleName.setVisibility(View.VISIBLE);
		return tvTitleName;
	}

	/**
	 * 右边文字
	 * 
	 * @param activity
	 *            当前的activity
	 * @param titleName
	 *            标题
	 * @return
	 */
	public static TextView showRightName(View view, int titleName) {
		TextView tvTitleName = (TextView) view.findViewById(R.id.title_right_tv);
		tvTitleName.setText(titleName);
		tvTitleName.setVisibility(View.VISIBLE);
		return tvTitleName;
	}

	/**
	 * 显示标题
	 * 
	 * @param activity
	 *            当前的activity
	 * @param titleNameId
	 *            标题id
	 */
	public static TextView showTitleName(Activity activity, int titleNameId) {
		TextView tvTitleName = (TextView) activity.findViewById(R.id.title_tv);
		tvTitleName.setText(titleNameId);
		tvTitleName.setVisibility(View.VISIBLE);
		return tvTitleName;
	}

	/**
	 * 显示标题
	 * 
	 * @param activity
	 *            当前的activity
	 * @param titleNameId
	 *            标题id
	 */
	public static TextView showTitleName(View view, int titleNameId) {
		TextView tvTitleName = (TextView) view.findViewById(R.id.title_tv);
		tvTitleName.setText(titleNameId);
		tvTitleName.setVisibility(View.VISIBLE);
		return tvTitleName;
	}

	// 左右按钮========================================================================

	/**
	 * 显示左边Button按钮
	 * 
	 * @param activity
	 *            当前的activity
	 * @return
	 */
	public static Button showBtnLeft(Activity activity, int stringId) {
		Button btnLeft = (Button) activity.findViewById(R.id.title_btn_left);
		btnLeft.setText(stringId);
		btnLeft.setVisibility(View.VISIBLE);
		return btnLeft;
	}

	/**
	 * 显示右边的Button按钮
	 * 
	 * @param activity
	 *            当前的activity
	 * @return
	 */
	public static Button showBtnRight(Activity activity, int stringId) {
		Button btnRight = (Button) activity.findViewById(R.id.title_btn_right);
		btnRight.setText(stringId);
		btnRight.setVisibility(View.VISIBLE);
		return btnRight;
	}

	/**
	 * 显示左边的ImageButton按钮
	 * 
	 * @param activity
	 *            当前的activity
	 * @param drawableId
	 *            iamgebutton的图标按钮
	 * @return
	 */
	public static ImageButton showIbLeft(Activity activity, int drawableId) {
		ImageButton btnLeft = (ImageButton) activity.findViewById(R.id.title_ib_left);
		btnLeft.setVisibility(View.VISIBLE);
		btnLeft.setImageResource(drawableId);
		return btnLeft;
	}

	/**
	 * 显示右边的ImageButton按钮，要传ID改变显示
	 * 
	 * @param activity
	 *            当前的activity
	 * @param drawableId
	 *            imageButton的图标按钮
	 * @return
	 */
	public static ImageButton showIbRight(Activity activity, int drawableId) {
		ImageButton btnRight = (ImageButton) activity.findViewById(R.id.title_ib_right);
		btnRight.setVisibility(View.VISIBLE);
		btnRight.setImageResource(drawableId);
		return btnRight;
	}

	/**
	 * 显示右边的ImageButton按钮，右边靠内的按钮
	 * 
	 * @param activity
	 *            当前的activity
	 * @param drawableId
	 *            imageButton的图标按钮
	 * @return
	 */
	public static ImageButton showIbRight2(Activity activity, int drawableId) {
		ImageButton btnRight = (ImageButton) activity.findViewById(R.id.title_ib_right2);
		btnRight.setVisibility(View.VISIBLE);
		btnRight.setImageResource(drawableId);
		return btnRight;
	}

	/**
	 * 使用资源文件的设置下一页返回按钮的文本
	 * 
	 * @param intent
	 * @param context
	 * @param currentTitle
	 */
	public static void setNext_pageBackBtn(Intent intent, Context context, int currentTitle) {
		intent.putExtra(TitlebarUtil.BACKTITLE, context.getString(currentTitle));
	}

	/**
	 * 显示左边的ImageButton按钮
	 * 
	 * @param activity
	 *            当前的activity
	 * @param drawableId
	 *            iamgebutton的图标按钮
	 * @return
	 */
	public static ImageButton showIbHome(Activity activity) {
		ImageButton title_home_right = (ImageButton) activity.findViewById(R.id.title_home_right);
		title_home_right.setVisibility(View.VISIBLE);
		return title_home_right;
	}

}
