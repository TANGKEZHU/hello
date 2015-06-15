package com.tkzsoft.basketball.util.config;

import android.app.Application;
import android.os.Handler;
import android.os.Message;

public class Config extends Application {

	private String loginIp;

	private int memberId;
	private String clientKey;
	public Handler mainBoothFoodWeightHandler;
	public Handler avatorHandler;// 设置头像后返回更新头像
	public boolean isUserChange;
	private static Config instance;

	private Handler firstMainHandler;
	private String email;
	private String password;
	public boolean isFamilyChange;
	private Handler hideTabHandler;// 更新头像
	private String UserName;
	private String ClientKey;
	private Handler UnitsChangeHandler;
	/**
	 * 登录成功后发送handler，同步
	 */
	private Handler loginHandler;

	/**
	 * 退出登录，成功后发送handler
	 */
	private Handler logoutHandler;
	/**
	 * 区分注册弹出窗口
	 */
	public int isNewTopic = 0;

	/**
	 * 点击Home按钮，跳转到今天
	 */
	public Handler todayHandler;

	public Handler getFirstMainHandler() {
		return firstMainHandler;
	}

	public void setUnitsChangeHandler(Handler handler) {
		UnitsChangeHandler = handler;
	}

	public void sendUnitsChangeHandler(int what) {
		Message msg = new Message();
		msg.what = what;
		if (UnitsChangeHandler != null) {
			UnitsChangeHandler.sendMessage(msg);
		}
	}

	public void setFirstMainHandler(Handler handler) {
		this.firstMainHandler = handler;
	}

	public Handler getTodayHandler() {
		return todayHandler;
	}

	public void setTodayHandler(Handler todayHandler) {
		this.todayHandler = todayHandler;
	}

	public void sendTodayHandler(Message msg) {
		if (todayHandler != null) {
			todayHandler.sendMessage(msg);
		}
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public void setClientKey(String clientKey) {
		this.clientKey = clientKey;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLoginIp() {
		return loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	public void isFamilyChange() {
		isFamilyChange = true;
	}

	public void sethideTabHandler(Handler handler) {
		hideTabHandler = handler;
	}

	public void sendhideTabmsg(int witch) {
		Message msg = new Message();
		msg.what = witch;
		if (hideTabHandler != null) {
			hideTabHandler.sendMessage(msg);
		}
	}

	public void sendhideTabmsg(Message msg) {
		if (hideTabHandler != null) {
			hideTabHandler.sendMessage(msg);
		}
	}

	/**
	 * 设置登录刷新Handler
	 * 
	 * @param handler
	 */
	public void setLoginHandler(Handler handler) {
		this.loginHandler = handler;
	}

	/**
	 * 获取登录刷新Handler
	 * 
	 * @return
	 */
	public Handler getLoginHandler() {
		return loginHandler;
	}

	/**
	 * 设置退出登录刷新Handler
	 * 
	 * @param handler
	 */
	public void setLogoutHandler(Handler handler) {
		this.logoutHandler = handler;
	}

	/**
	 * 获取退出登录刷新Handler
	 * 
	 * @return
	 */
	public Handler getLogoutHandler() {
		return logoutHandler;
	}

	@Override
	public void onCreate() {
		super.onCreate();
		instance = this;
	}

	public void setUserName(String UserName) {
		this.UserName = UserName;

	}

}
