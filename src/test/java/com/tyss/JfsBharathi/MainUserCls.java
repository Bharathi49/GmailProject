package com.tyss.JfsBharathi;

import java.util.Scanner;

public class MainUserCls {

	static Scanner sc=new Scanner(System.in);
	static UserImplim mu=new UserImplim();
	public static void main(String[] args) {
		
		System.out.println("Press 1 to Login");
		System.out.println("Press 2 to Register");
		
		int ip=sc.nextInt();
		switch (ip) {
		case 1:mu.login();
			break;
		case 2:mu.register();
			break;
		default:System.out.println("Please enter either 1 or 2");
			break;
		}
				
	}

}
