package com.tkzsoft.basketball.util.config;

import android.app.Application;
import android.os.Handler;
import android.os.Message;

public class Config extends Application {

	private String loginIp;

	private int memberId;
	private String clientKey;
	public Handler mainBoothFoodWeightHandler;
	public Handler avatorHandler;// ����ͷ��󷵻ظ���ͷ��
	public boolean isUserChange;
	private static Config instance;

	private Handler firstMainHandler;
	private String email;
	private String password;
	public boolean isFamilyChange;
	private Handler hideTabHandler;// ����ͷ��
	private String UserName;
	private String ClientKey;
	private Handler UnitsChangeHandler;
	/**
	 * ��¼�ɹ�����handler��ͬ��
	 */
	private Handler loginHandler;

	/**
	 * �˳���¼���ɹ�����handler
	 */
	private Handler logoutHandler;
	/**
	 * ����ע�ᵯ������
	 */
	public int isNewTopic = 0;

	/**
	 * ���Home��ť����ת������
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
	 * ���õ�¼ˢ��Handler
	 * 
	 * @param handler
	 */
	public void setLoginHandler(Handler handler) {
		this.loginHandler = handler;
	}

	/**
	 * ��ȡ��¼ˢ��Handler
	 * 
	 * @return
	 */
	public Handler getLoginHandler() {
		return loginHandler;
	}

	/**
	 * �����˳���¼ˢ��Handler
	 * 
	 * @param handler
	 */
	public void setLogoutHandler(Handler handler) {
		this.logoutHandler = handler;
	}

	/**
	 * ��ȡ�˳���¼ˢ��Handler
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
