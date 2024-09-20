package org.java.ch6.singleton;

public class CompanyTest {
	public static void main(String[] args) {
		Company company = Company.getInstance();
		Company company1 = Company.getInstance();
		System.out.println(company == company1);
	}
}
