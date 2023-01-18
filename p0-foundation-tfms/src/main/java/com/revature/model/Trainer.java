package com.revature.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Trainer{
	

	private String trainerId;
	private String trainerName;
	private String track;
	private String qualification;
	private int experience;
	
	
	public Trainer(String trainerId, String trainerName, String track, String qualification, int experience) {
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.track = track;
		this.qualification = qualification;
		this.experience = experience;
	}
	public String getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(String trainerId) {
		this.trainerId = trainerId;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getTrack() {
		return track;
	}
	public void setTrack(String track) {
		this.track = track;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", track=" + track
				+ ", qualification=" + qualification + ", experience=" + experience + "]";
	}
	public int getExperience1() {
		// TODO Auto-generated method stub
		return 0;
	}
	

	}