package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.interfaces.Credentials;
import com.greatlearning.model.Employee;
import com.greatlearning.services.CredentialServices;

public class DriverClass {

	public static void main(String[] args) {
		Employee employee = new Employee("Harshit", "Chaudhary");
		Credentials cs = new CredentialServices();

		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Huamn Resource");
		System.out.println("4. Legal");

		Scanner in = new Scanner(System.in);
		int option = in.nextInt();

		String generatedEmail = null;
		String generatedPassword = null;

		switch (option) {
		case 1: {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "tech");
			generatedPassword = cs.generatePassword();
			break;
		}

		case 2: {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "adm");
			break;
		}
		case 3: {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "hr");
			break;
		}
		case 4: {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "legal");
			break;
		}

		default: {
			System.out.println("Enter a valid option");

		}
		}
		employee.setEmail(generatedEmail);
		employee.setPassword(generatedPassword);
		cs.showCredentials(employee);
		in.close();

	}

}
