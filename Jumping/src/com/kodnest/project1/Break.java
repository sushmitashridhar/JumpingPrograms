package com.kodnest.project1;
import java.util.Scanner;

public class Break {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
			if(i==4) {
				break;
			}
			else {
				System.out.println(i);
			}
		}
	}

}
