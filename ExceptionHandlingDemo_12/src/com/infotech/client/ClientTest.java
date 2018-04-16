package com.infotech.client;

import java.util.Scanner;

import com.infotech.exception.InvalidAgeException;

public class ClientTest {

	public static void main(String[] args) throws ClassNotFoundException {
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter person age:");
			int age = scanner.nextInt();
			new ClientTest().calculateExtraBenefits(age);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void calculateExtraBenefits(int age) {
		// If age is less than 60 throw exception
		if (age < 60) {
			throw new InvalidAgeException(age);
		}else {
			System.out.println("Recognized as senior citizen..");
			System.out.println("Calculate ExtraBenefit for senior citizen..");
		}
	}
}
