package com.greatlearning.services;

import java.util.Random;

import com.greatlearning.interfaces.Credentials;
import com.greatlearning.model.Employee;

public class CredentialServices implements Credentials {

	public String generateEmailAddress(String firstName, String lastName, String department) {

		return firstName + lastName + "@" + department + ".gl.in";

	}

	public String generatePassword() {

		String capitalLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*";
		String values = capitalLetter + smallLetters + specialCharacters + numbers;
		
		Random random = new Random();
		String password = "";
		for (int i = 0; i < 8; i++) {
			
			password += String.valueOf(values.charAt(random.nextInt(values.length())));
		
		}
		return password;

	}

	public void showCredentials(Employee employee) {
		System.out.println("Dear " + employee.getFirstName()+" "+employee.getLastName()+" Your Generated Credentials are as follows");
		System.out.println("Email\t\t----> " + employee.getEmail());
		System.out.println("Password\t----> " + employee.getPassword());
	}

}
