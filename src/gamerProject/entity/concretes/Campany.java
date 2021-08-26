package gamerProject.entity.concretes;

import java.time.LocalDate;

import gamerProject.entity.abstracts.Entity;

public class Campany implements Entity{
	private int id;
	private String name;
	private String description;
	private LocalDate startDate;
	private LocalDate endDate;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	

}
