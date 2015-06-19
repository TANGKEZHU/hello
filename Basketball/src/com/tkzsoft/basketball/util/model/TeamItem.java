package com.tkzsoft.basketball.util.model;

import android.graphics.Bitmap;

public class TeamItem {

	private Bitmap imageID;
	private String teamName;
	private int memberCount;
	private int age;
	private int wins;
	private int ballMorality;
	private String distance;

	public Bitmap getImageID() {
		return imageID;
	}

	public void setImageID(Bitmap imageID) {
		this.imageID = imageID;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getMemberCount() {
		return memberCount;
	}

	public void setMemberCount(int memberCount) {
		this.memberCount = memberCount;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getBallMorality() {
		return ballMorality;
	}

	public void setBallMorality(int ballMorality) {
		this.ballMorality = ballMorality;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

}
