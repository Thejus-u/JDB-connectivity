package com.shopping;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		watch w=new watch();
		int opt,ch;
		User u=new User();
		login l=new login();
		Inventory inv=new Inventory();
		
		
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Welcome to shopping store");
		System.out.print("Enter username:");
		u.setUsername(sc.next());
		System.out.print("Enter password:");
		u.setPassword(sc.next());
		if(l.usertype(u))
		{
			int op;
			do {
				System.out.println("1.Add\n2.Delete\n3.Update\n4.Search\n5.Display\n-1 to logout");
				op=sc.nextInt();
				switch(op)
				{
				case 1:
					//watch w1=new watch();
					System.out.print("Enter Name:");
					w.setName(sc.next());
					System.out.print("Enter Brand:");
					w.setBrand(sc.next());
					System.out.print("Enter Model:");
					w.setModel(sc.nextInt());
					System.out.print("Enter Cost:");
					w.setCost(sc.nextFloat());
					inv.add(w);
					break;
				case 2:
					System.out.print("Enter Id to be deleted:");
					inv.delete(sc.nextInt());
					break;
				case 3:
					System.out.print("Enter the id to be updated: ");
					w=inv.search(sc.nextInt());
					if(w==null)
						System.out.println("Item not found");
					else {
						System.out.println("1.Change name\n2.Change Brand\n3.Change Model\n4.Change Cost");
						int o=sc.nextInt();
						switch(o)
						{
						case 1:
							System.out.print("Enter Name:");
							w.setName(sc.next());
							break;
						case 2:
							System.out.print("Enter Brand:");
							w.setBrand(sc.next());
							break;
						case 3 :
							System.out.print("Enter Model:");
							w.setModel(sc.nextInt());
							break;
						case 4:
							System.out.print("Enter Cost:");
						    w.setCost(sc.nextFloat());
						    break;							
						}
						inv.update(w,o);
					}
					break;
				case 4:
					System.out.print("Enter Id to be searched:");
					w=inv.search(sc.nextInt());
					System.out.println(w);
					break;
				case 5:
					inv.display();
					break;
				}
		}while(op!=-1);
			System.out.println("Session Logged out");
		}
		
		else
			inv.display();
		
		System.out.print("Enter 1 to relogin or -1 to Exit:");
		ch=sc.nextInt();
		}while(ch!=-1);

	}

}


