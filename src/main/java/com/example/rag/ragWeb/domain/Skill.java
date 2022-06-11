package com.example.rag.ragWeb.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "skill")
public class Skill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	String skillName;

}
