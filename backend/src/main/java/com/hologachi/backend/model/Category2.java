package com.hologachi.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import lombok.Data;

@Data
// =======
// import javax.persistence.JoinColumn;
// import javax.persistence.JoinTable;
// import javax.persistence.ManyToOne;
// import javax.persistence.Table;

// import lombok.AccessLevel;
// import lombok.Getter;
// import lombok.NoArgsConstructor;
// import lombok.Setter;

// @NoArgsConstructor(access = AccessLevel.PROTECTED)
// @Getter
// @Setter
// >>>>>>> main
@Entity
@Table(name="TBL_CATEGORY2")
public class Category2 {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CATEGORY2_ID")
	private int id2;
	
	@Column(name = "NAME", nullable=false)
	private String cat2;
	
	@Id @GeneratedValue
	@Column(name="category2_id")
	private int category2Id;
	private String name;
// =======
// 	@ManyToOne
// 	@JoinColumn(name = "CATEGORY1_ID")
// 	private Category1 category1;
// >>>>>>> main
	
	public Category2(Category1 category1, String cat2) { // 대분류 이름, 소분류 이름 
		this.category1 = category1;
		this.cat2 = cat2;
	}
	
}
