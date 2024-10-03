package com.shopping;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventory {
	Statement stmt;
	ResultSet rs;
	String qry=null;
	dbcon db=new dbcon();
	Connection con;
	List <watch> l=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	public void add(watch w)
	{
		int count=0;
//		l.add(w);
//		System.out.println("Successfully added");
		try {
			con=db.getDBConeection();
			stmt=con.createStatement();
			count=stmt.executeUpdate("insert into table1 (name,brand,model,cost) values('"+w.getName()+"','"+w.getBrand()+"',"+w.getModel()+","+w.getCost()+")");
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("Successfully added");
	}
	public void delete(int id)
	{
		 try
		 {
			 con = db.getDBConeection();
			 stmt = con.createStatement();
		     String query = "delete FROM table1 WHERE id=" + id;
		     int count = stmt.executeUpdate(query);          
		 }
		 catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
         
		System.out.println("Successfully Deleted");
	}
	public void update(watch w,int o)
	{
		 int count=0;
		 try
		 {
			 con=db.getDBConeection();
			 stmt=con.createStatement();
			 switch(o)
			 {
		         case 1:
		        	 qry="update table1 set name='"+w.getName()+"'where id="+w.getId();
		        	 break;
		         case 2:
		        	 qry="update table1 set brand='"+w.getBrand()+"'where id="+w.getId();
		        	 break;
		         case 3:
		        	 qry="update table1 set model='"+w.getModel()+"'where id="+w.getId();
		        	 break;
		         case 4:
		        	 qry="update table1 set cost='"+w.getCost()+"'where id="+w.getId();
		        	 break;
			 }
			 count =stmt.executeUpdate(qry);
		 }
		 catch(Exception e)
		 {
			 System.out.println(e.getMessage());
		 }
		System.out.println("Successfully Updated");
	}
	
	  public watch search(int id) {
	        watch w = null;
	        try {
	            con = db.getDBConeection();
	            stmt = con.createStatement();
	            String query = "SELECT * FROM table1 WHERE id=" + id;
	            rs = stmt.executeQuery(query);
	            if (rs.next()) {
	                w = new watch();
	                w.setId(rs.getInt("id"));
	                w.setName(rs.getString("name"));
	                w.setBrand(rs.getString("brand"));
	                w.setModel(rs.getInt("model"));
	                w.setCost(rs.getFloat("cost"));
	            }
	        } catch (Exception ex) {
	            System.out.println(ex.getMessage());
	        }
	        return w;
	    }
	public void display()
	{
		/*System.out.print("Enter 1 to sort by name and 2 to sort by cost:");
		int d=sc.nextInt();

		if(d==1) {
			System.out.println("Records After Sorting by name:");
			Collections.sort(l,new Nsort());
			System.out.println(l);
		}
		
		else if(d==2) {
			System.out.println("Records After Sorting by name:");
			Collections.sort(l,new Csort());
			System.out.println(l);
		}*/
		try
		{
			con=db.getDBConeection();
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from table1");
			while(rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getFloat(5));
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		}
			
	}



