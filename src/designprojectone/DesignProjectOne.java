/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package designprojectone;
import java.util.*;
import java.text.*;
/***************************************************
*  Program: Tech Fair Cost Calculator
*  Author: Paul Marin
*  Date: 2024/03/08
*  Description: Calculates the price of an admission ticket given the manufacturers dubious criteria
****************************************************/

/**************** IPO CHART ************************
*INPUT:
* Number of Arduino projects
* Number of Raspberry PI projects
* Number of Vr projects
*PROCESSING:
* Calculate number of students
* Check for fixed cost discount
* Calculate price for each project
* Calculate total price
* Calculate price per student
*OUTPUT:
* Output price per ticket
***************************************************/
  
/**************** TEST CASES ************************
*Test      Input      Desired Output
* 1       15,15,15      $65.00
* 2       0,0,100       $70.00  
* 3       100,25,0      $57.10
* 4       0,0,0         Nobody is attending the tech fair
* 5       500,500,500   $61.17
* 6       34,56,12      $59.44
* 7       1,2,3         $66.67
***************************************************/
public class DesignProjectOne {
    public static void main(String[] args) {
  //Write Pseudocode FIRST as comments and THEN write the code
  /*
  Get input from the user (number of arduino, rasberry PI and Vr projects)
  Calculate total number of students
  Check if there are over 100 students.
  Apply discount
  Calculate the price of each project 
  Calculate the total cost
  Divide total cost by number of students
  Output final ticket price
  */ 
  
  //CONSTANTS
  final double FIVE_DISCOUNT = 0.95;
  
  //VARIABLES
  Scanner kb = new Scanner(System.in);
  DecimalFormat df = new DecimalFormat("#.00");
  int arduino = 0;
  int rasberry = 0;
  int vr = 0;
  int students = 0;
  double fixedCost = 50;
  int costArduino = 0;
  int costRaspberry = 0;
  int costVr = 0;
  double total = 0;
  double price = 0;
  
  //CODE
  
  // Get input from the user
  System.out.print("Enter the number of students doing the arduino project: ");
  arduino = kb.nextInt();
  System.out.print("Enter the number of students doing the Raspberry PI project: ");
  rasberry = kb.nextInt();
  System.out.print("Enter the number of students doing the VR project: ");
  vr = kb.nextInt();
  
  // Calculate total number of students
  students = arduino + rasberry + vr;
  
  // Check if there are zero students
  if (students > 0){
      
  // Check if there is more than 100 students to apply discount
  if (students > 100){
      fixedCost = fixedCost * FIVE_DISCOUNT;
  }
  
  // Check if arduino and/or rasberry are elgible for the discount and calculate cost
  if (arduino > 15){
      costArduino = arduino * 9;
  }
  else{
      costArduino = arduino * 10;
  }
  if (rasberry > 20){
      costRaspberry = rasberry * 12;
  }
  else{
      costRaspberry = rasberry * 15;
  }
  
  // Calculate cost of vr projects
  costVr = vr * 20;
  
  // Calculate total cost
  total = ((students * fixedCost) + costArduino + costRaspberry + costVr);
  
  // Find price per ticket
  price = total/students;
  
  // Output price per ticket
  System.out.println("Each student must pay $" + df.format(price) + " to attend the tech fair!");
  }
  
  // If there are zero students there is nobody coming
  else{
  System.out.println("No students are attending the tech fair!");    
  }
  
   }   
 }
   

