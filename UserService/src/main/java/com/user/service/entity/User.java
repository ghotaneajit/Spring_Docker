package com.user.service.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "micro_users")
public class User {

	@Id
	@Column(name = "ID")
	private String userId;

	@Column(name = "NAME" )
	private String name;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "About")
	private String about;

	@Transient
	private List<Rating> ratings = new ArrayList();
}
