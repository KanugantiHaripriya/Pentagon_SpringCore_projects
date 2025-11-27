package com.sample;

import lombok.Data;

import lombok.AllArgsConstructor;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;

//@Setter
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
//@EqualsAndHashCode

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	private String name;
	private int id;
	private int age;
	

}
