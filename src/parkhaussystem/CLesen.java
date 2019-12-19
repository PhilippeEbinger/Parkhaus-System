/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkhaussystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CLesen
{
    	public static char readChar()
	{
		BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
		String strEingabe = "";
		try 
		{
			strEingabe = keyb.readLine();
		}
		catch( IOException ex )
		{
			System.out.println( ex.getMessage() );
		}
		
		return strEingabe.charAt(0);
	}
	public static int readInt()
	{
		BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
		String strEingabe = "";
		try 
		{
			strEingabe = keyb.readLine();
		}
		catch( IOException ex )
		{
			System.out.println( ex.getMessage() );
		}
		
		return Integer.parseInt(strEingabe);
	}
	public static Double readDouble()
	{
		BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
		String strEingabe = "";
		try 
		{
			strEingabe = keyb.readLine();
		}
		catch( IOException ex )
		{
			System.out.println( ex.getMessage() );
		}
		
		return Double.parseDouble(strEingabe);
	}
	public static String readString()
	{
		BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
		String strEingabe = "";
		try 
		{
			strEingabe = keyb.readLine();
		}
		catch( IOException ex )
		{
			System.out.println( ex.getMessage() );
		}
		
		return strEingabe;
	}
}
