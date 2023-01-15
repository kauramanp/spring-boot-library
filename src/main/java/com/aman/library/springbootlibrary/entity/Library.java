package com.aman.library.springbootlibrary.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Library {
	@Id
	private int id;
	private String name;
	private String commaSeparatedBookName;

}
