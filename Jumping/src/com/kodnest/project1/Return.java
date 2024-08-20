package com.kodnest.project1;

import java.util.Scanner;

public class Return {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
			if(i==4) {
				return;
			}
			else {
				System.out.println(i);
			}
		}
	}


}
