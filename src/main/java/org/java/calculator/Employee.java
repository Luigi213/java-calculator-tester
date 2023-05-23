package org.java.calculator;

import java.time.LocalDate;

public class Employee {
	private String name;
	private String lastname;
	private LocalDate date_of_birth;
	private String role;
	
	public Employee(String name, String lastname, LocalDate date_of_birth, String role) throws Exception {
		setName(name);
		setLastname(lastname);
		setDate_of_birth(date_of_birth);
		setRole(role);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) throws Exception {
		if(name.length() <= 0) throw new Exception("Il nome non può essere vuoto");
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) throws Exception {
		if(lastname.length() <= 0) throw new Exception("Il cognome non può essere vuoto");
		this.lastname = lastname;
	}
	public LocalDate getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(LocalDate date_of_birth) throws Exception {
		if(LocalDate.now().isAfter(date_of_birth)) throw new Exception("La data deve essere del passato");
		this.date_of_birth = date_of_birth;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) throws Exception {
		if (!(role.equals("employee") || role.equals("boss"))) throw new Exception("Ruolo non coretto");
		this.role = role;
	}
	
}
