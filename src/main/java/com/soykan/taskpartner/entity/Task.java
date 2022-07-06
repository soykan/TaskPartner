package com.soykan.taskpartner.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;


@Entity(name = "task_partner_task")
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private int duration;
/*
	@Column(nullable = false)
	private LocalDate startDate;

	@Column(nullable = false)
	private LocalTime startTime;

	private LocalTime endTime;

	@Column(nullable = false)
	private User user;
*/

	

}
