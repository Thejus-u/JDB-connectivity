package com.shopping;

import java.util.Comparator;

public class Csort implements Comparator <watch>
{
	public int compare(watch i,watch j)
	{
		if (i.getCost()>j.getCost())
			return 1;
		else
			return -1;
	}
}
