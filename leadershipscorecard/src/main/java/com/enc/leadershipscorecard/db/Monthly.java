package com.enc.leadershipscorecard.db;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Monthly {
	
	public Monthly()
	{
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@Column(name="youth_service_attendance")
	private int youth_service_attendance;
	
	@Column(name="tno_envelope")
	private int tno_envelope;
	
	@Column(name="salvation_story")
	private String salvation_story;
	
	@Column(name="evangelism_Story")
	private String evangelism_Story;
	
	@Column(name="new_victory_weekend_story")
	private String new_victory_weekend_story;
	
	@Column(name="new_vgl_story")
	private String new_vgl_story;
	
	@Column(name="created_by")
	private String created_by;
	
	@Column(name="created_date")
	private Date created_date;
	
	@Column(name="last_mod_date")
	private Date last_mod_date;
	
	@Column(name="month_report")
	private Date month_report;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getYouth_service_attendance() {
		return youth_service_attendance;
	}

	public void setYouth_service_attendance(int youth_service_attendance) {
		this.youth_service_attendance = youth_service_attendance;
	}

	public int getTno_envelope() {
		return tno_envelope;
	}

	public void setTno_envelope(int tno_envelope) {
		this.tno_envelope = tno_envelope;
	}

	public String getSalvation_story() {
		return salvation_story;
	}

	public void setSalvation_story(String salvation_story) {
		this.salvation_story = salvation_story;
	}

	public String getEvangelism_Story() {
		return evangelism_Story;
	}

	public void setEvangelism_Story(String evangelism_Story) {
		this.evangelism_Story = evangelism_Story;
	}

	public String getNew_victory_weekend_story() {
		return new_victory_weekend_story;
	}

	public void setNew_victory_weekend_story(String new_victory_weekend_story) {
		this.new_victory_weekend_story = new_victory_weekend_story;
	}

	public String getNew_vgl_story() {
		return new_vgl_story;
	}

	public void setNew_vgl_story(String new_vgl_story) {
		this.new_vgl_story = new_vgl_story;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public Date getLast_mod_date() {
		return last_mod_date;
	}

	public void setLast_mod_date(Date last_mod_date) {
		this.last_mod_date = last_mod_date;
	}

	public Date getMonth_report() {
		return month_report;
	}

	public void setMonth_report(Date month_report) {
		this.month_report = month_report;
	}
	
	

}
