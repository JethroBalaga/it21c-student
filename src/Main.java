/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[]args){
        student student = new student();
        
        student.name = "Jethro Jay U. Balaga";
        student.section = student.setSection();
        student.motto = student.getMotto();
        
        System.out.println(student.name);
        System.out.println(student.section);
        System.out.println(student.motto);
    }
}
