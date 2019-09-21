package com.tyss.JfsBharathi;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserImplim implements UserInterface{
	static Scanner sc=new Scanner(System.in);
	static UserInterface ui=new UserImplim();
	EntityManagerFactory factory=null;
	EntityManager manager=null;
	EntityTransaction transaction=null;
	
	
	public boolean login() {
		// Accepts mail and password
		
		factory=Persistence.createEntityManagerFactory("MyPersistence");
		System.out.println("Enter the Mail-Id");
		String mail=sc.nextLine();
		System.out.println("Enter the password");
		String pwd=sc.nextLine();
//		Account acc=new Account();
		Account account=manager.find(Account.class, 101);
		if(account!=null) {
			System.err.println("Login success");
			System.out.println("Press A to compose");
			System.out.println("Press B to Show Inbox");
			String str=sc.nextLine();
			switch (str) {
			case "A":ui.compose();
					break;
			case "B":ui.showInbox();
					break;
			default:System.out.println("please enter either A or B");
				break;
			
		}
			}else {
			System.err.println("Account doesn't exsits");
			System.err.println("Please provide valid mail and password");
		}
		
		return false;
	}

	
	
	public void register() {
		// Accepts the mail and password 
		// adds to DB
		System.out.println("Enter the UserName");
		String uname=sc.nextLine();
		System.out.println("Enter the Mail-Id");
		String mail=sc.nextLine();
		System.out.println("Enter the Password");
		String pwd=sc.nextLine();
		Account acc=new Account();
		acc.setUserName(uname);
		acc.setEmail(mail);
		acc.setPassword(pwd);
		try {
			factory=Persistence.createEntityManagerFactory("MyPersistence");
			manager=factory.createEntityManager();
			transaction=manager.getTransaction();
			transaction.begin();
			manager.persist(acc);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}finally {
			manager.close();
		}
	}

	public void compose() {
//		Accepts mail-id and message
//		sends the message to respected mail-id in DB
		System.err.println("*********Composing Mail**********");
		System.out.println("Enter the mail-id ");
		String mail=sc.nextLine();
		System.out.println("Enter the message to compose the mail");
		String msg=sc.nextLine();
		
		
		
		
		
		
		
		ui.login();
	}

	public void showInbox() {
		// TODO Auto-generated method stub
		
	}

}
