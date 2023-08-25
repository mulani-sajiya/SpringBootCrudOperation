package com.rt.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "student")
public class Student {
	
	

		@Id
		@GeneratedValue
		@Column(name = "id")
		private int id;
		
		@Column(name = "name")
		private String name;
		
		@Column(name = "rollNo")
		private int rollNo;

		public Student () {
		}

		public Student(int id, String name, int rollNo  ) {
			super();
			this.id = id;
			this.name = name;
			this.rollNo = rollNo;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getRollNo() {
			return rollNo;
		}

		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}

		

}

