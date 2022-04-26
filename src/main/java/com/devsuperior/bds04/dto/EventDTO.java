package com.devsuperior.bds04.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.devsuperior.bds04.entities.Event;

public class EventDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	@NotBlank(message ="Campo requerido")
	private String name;
	
	@Future(message = "A data do evento não pode ser passada")
	private LocalDate date;
	private String url;
	
	@NotNull(message ="Campo requerido")
	private Long cityId;
	
	public EventDTO() {
	}

	public EventDTO(Long id, String name, LocalDate date, String url, Long cityId) {
		this.id = id;
		this.name = name;
		this.date = date;
		this.url = url;
		this.cityId = cityId;
	}
	
	public EventDTO(Event entity) {
		id = entity.getId();
		name = entity.getName();
		date = entity.getDate();
		url = entity.getUrl();
		cityId = entity.getCity().getId();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}
}
