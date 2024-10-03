package com.shopping;

import java.util.Comparator;

public class Nsort implements Comparator <watch>
{
	public int compare(watch i,watch j)
	{
		return (i.getName().compareTo(j.getName()));
			
	}
}