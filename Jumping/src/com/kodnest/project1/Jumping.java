package com.kodnest.project1;
import java.util.Scanner;
public class Jumping {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
			if(i==4) {
				continue;
			}
			else {
				System.out.println(i);
			}
		}
	}

}
