/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity8;

/**
 *Author: Varshan Nair A/L Narayanan
 *Program Name: Student information system
 */
public class StudentInformationSystem {
    public static void main(String[] args) {
        String studentName="Varshan Nair"; //Store student details
        String studentID="S87372";
        
        double mark1=87.5; //Store two marks using display
        double mark2=94.0;
        double totalMark= mark1+mark2;//Calculate total marks
        
        System.out.println("====Student Information System====");//display student name,id and total marks
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Mark 1  :" + mark1);
        System.out.println("Mark 2  :" + mark2);
        System.out.println("----------------------------------");
        System.out.println("Total mark: " +totalMark);
        
        System.out.println("Performance : ");//displaying a message based on total marks
        if (totalMark >=160) {
            System.out.println("Excellent");
        } else if (totalMark >=120) {
            System.out.println("Good");
        } else {
            System.out.println("Needs Improvement");
        }
        System.out.println("==================================");
        }
        
        
    }
    
