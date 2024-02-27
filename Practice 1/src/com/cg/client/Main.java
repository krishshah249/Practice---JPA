package com.cg.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.cg.entities.Author;
import com.cg.service.AuthorServiceImpl;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		AuthorServiceImpl service = new AuthorServiceImpl();
		String choice;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Author a = new Author();
		
		while(true) {
			
			System.out.println("1.Add Author");
			System.out.println("2.Update Author");
			System.out.println("3.Remove Author");
			System.out.println("4.Find Author");
			System.out.println("5.Exit");
			choice= br.readLine();
			switch(choice) {
			
			case "1":	System.out.println("Enter FirstName,MiddleName,LastName and Phone Number");
						//a.setFirstName(br.readLine());
						//a.setLastName(br.readLine());
						//a.setMiddleName(br.readLine());
						//a.setPhoneNo(Long.parseLong(br.readLine()));
						service.addAuthor(new Author(br.readLine(),br.readLine(),br.readLine(),Long.parseLong(br.readLine())));
						System.out.println("Author Added");
						break;
			case "2": 	System.out.println("Enter Author Id");
						a=service.findAuthor(Integer.parseInt(br.readLine()));
						System.out.println("Enter the new FirstName,MiddleName,LastName and Phone Number");
						a.setFirstName(br.readLine());
						a.setLastName(br.readLine());
						a.setMiddleName(br.readLine());
						a.setPhoneNo(Long.parseLong(br.readLine()));
						service.updateAuthor(a);
						System.out.println("Author Details Updated");
						break;
			case "3":	System.out.println("Enter Author Id");
						service.removeAuthor(Integer.parseInt(br.readLine()));
						System.out.println("Author Removed");
						break;
			case "4":	System.out.println("Enter Author Id");
						a=service.findAuthor(Integer.parseInt(br.readLine()));
						System.out.println("The details of the Author are");
						System.out.println("First Name:"+a.getFirstName()+"\nMiddle Name:"+a.getLastName()+"\nLast Name:"+a.getLastName()+"\nPhone No:"+a.getPhoneNo());
						break;
			case "5":  	System.exit(0);
			
			default:	System.out.println("Enter Valid Option");
			}
		}
		
		
	}

}
