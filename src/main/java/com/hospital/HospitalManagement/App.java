package com.hospital.HospitalManagement;

import java.util.*;

public class App 
{
	private static HashSet<String> patientList = new HashSet<String>();
	private static Scanner sc  = new Scanner(System.in);
	public static void addPatient()
	{
		System.out.println("Enter the Patient Name: ");
		String patientName = sc.nextLine();
		patientList.add(patientName);
		System.out.println("Patient successfully added.");
	}
	
	public static void removePatient()
	{
		System.out.println("Enter the Patient Name: ");
		String patientName = sc.nextLine();
		patientList.remove(patientName);
		System.out.println("Patient has been removed successfully.");
	}
	public static void displayPatients()
	{
		if(patientList.isEmpty())
		{
			System.out.println("No patient to display.");
			return;
		}
		else
		{			
			System.out.println(patientList);
		}
	}
	public static void checkPatient()
	{
		System.out.println("Enter the Patient Name: ");
		String patientName = sc.nextLine();
		
		if(patientList.contains(patientName))
		{
			System.out.println("Patient exists.");
		}
		else
		{
			System.out.println("Patient do not exist.");
		}
	}
    public static void main( String[] args )
    {
		while(true)
		{
			System.out.println("1.Add Patient");
			System.out.println("2.Remove Patient");
			System.out.println("3.Check Patient");
			System.out.println("4.Display Patient");
			System.out.println("5.Exit");
			System.out.println("Choose an option: ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
				case 1:
					addPatient();
					break;
				case 2:
					removePatient();
					break;
				case 3:
					checkPatient();
					break;
				case 4:
					displayPatients();
					break;
				case 5:
					System.exit(0);
				default:
					System.out.println("Invalid choice. Please try again.");
			}
		}
    }
}
