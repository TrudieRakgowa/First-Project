/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.trudie;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class TaskClassTest {
    
    public TaskClassTest() {
    }
   
    @Test
    public void testCheckTaskDescription1() {
        System.out.println("checkTaskDescription");
        String taskDescription = "Create Login to authenticate users";
        TaskClass instance = new TaskClass();
        boolean expResult = true;
        boolean result = instance.checkTaskDescription(taskDescription);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testCheckTaskDescription2() {
        System.out.println("checkTaskDescription");
        String taskDescription = "Create add Task feature to add task users";
        TaskClass instance = new TaskClass();
        boolean expResult = true;
        boolean result = instance.checkTaskDescription(taskDescription);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testCreateTaskID() {
        System.out.println("createTaskID");
        String taskName = "Login Feature";
        String developerDetails = "Robyn Harrison";
        int taskNumber = 0;
        TaskClass instance = new TaskClass();
        String expResult = "LO:0:SON"; 
        String result = instance.createTaskID(taskName, taskNumber, developerDetails);
        assertEquals(expResult, result);
    }

    @Test
    public void testCreateTaskID2() {
        System.out.println("createTaskID");
        String taskName = "Add task Feature";
        String developerDetails = "Mike Smith";
        int taskNumber = 1;
        TaskClass instance = new TaskClass();
        String expResult = "AD:1:ITH"; 
        String result = instance.createTaskID(taskName, taskNumber, developerDetails);
        assertEquals(expResult, result);
    }

    @Test
    public void testPrintTaskDetails() {
        System.out.println("printTaskDetails");
        int details = 0;
        TaskClass instance = new TaskClass();
        
        String expResult = "Task Status: To Do\n" +
                           "Developer Details: Robyn Harrison\n" +
                           "Task Number: 0\n" +
                           "Task Name: Login Feature\n" +
                           "Task Description: \n" + 
                           "Task ID: LO:0:SON\n" +
                           "Task Duration: 8hours"; 
        String result = instance.printTaskDetails(details);
        assertEquals(expResult, result);
    }

    @Test
    public void testPrintTaskDetails2() {
        System.out.println("printTaskDetails");
        int details = 1;
        TaskClass instance = new TaskClass();
       
        String expResult = "Task Status: Doing\n" +
                           "Developer Details: Mike Smith\n" +
                           "Task Number: 1\n" +
                           "Task Name: Add Task Feature\n" +
                           "Task Description: \n" + 
                           "Task ID: AD:1:ITH\n" +
                           "Task Duration: 10hours"; 
        String result = instance.printTaskDetails(details);
        assertEquals(expResult, result);
    }

    @Test
    public void testReturnTaskDuration1() {
        System.out.println("returnTaskDuration");
        int taskDuration = 8;
        TaskClass instance = new TaskClass();
        int expResult = 8;
        int result = instance.returnTaskDuration(taskDuration);
        assertEquals(expResult, result);
    }

    @Test
    public void testReturnTaskDuration2() {
        System.out.println("returnTaskDuration");
        int taskDuration = 10;
        TaskClass instance = new TaskClass();
        int expResult = 10;
        int result = instance.returnTaskDuration(taskDuration);
        assertEquals(expResult, result);
    }
   
   
    
}
