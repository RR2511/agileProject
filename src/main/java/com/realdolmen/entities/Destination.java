package com.realdolmen.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Destination {
	@Id @GeneratedValue
	private Long id;
}
