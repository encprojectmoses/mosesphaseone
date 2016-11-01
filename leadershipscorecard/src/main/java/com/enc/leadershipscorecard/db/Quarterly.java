package com.enc.leadershipscorecard.db;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Quarterly {
	
	public Quarterly(){
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@Column(name="number_of_lgl")
	private int number_of_lgl;
	
	@Column(name="number_of_vgl")
	private int number_of_vgl;
	
	@Column(name="number_of_vgm")
	private int number_of_vgm;
	
	@Column(name="created_by")
	private String created_by;
	
	@Column(name="created_date")
	private Date created_date;
	
	@Column(name="last_mod_date")
	private Date last_mod_date;
	
	@Column(name="quarter_report")
	private Date quarter_report;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getNumber_of_lgl() {
		return number_of_lgl;
	}

	public void setNumber_of_lgl(int number_of_lgl) {
		this.number_of_lgl = number_of_lgl;
	}

	public int getNumber_of_vgl() {
		return number_of_vgl;
	}

	public void setNumber_of_vgl(int number_of_vgl) {
		this.number_of_vgl = number_of_vgl;
	}

	public int getNumber_of_vgm() {
		return number_of_vgm;
	}

	public void setNumber_of_vgm(int number_of_vgm) {
		this.number_of_vgm = number_of_vgm;
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

	public Date getQuarter_report() {
		return quarter_report;
	}

	public void setQuarter_report(Date quarter_report) {
		this.quarter_report = quarter_report;
	}

}
