package com.practice.user_demoPractice_jdbc;

import java.util.List;
import java.util.Scanner;

import com.practice.user_demoPractice_jdbc.model.User;
import com.practice.user_demoPractice_jdbc.service.UserService;
import com.practice.user_demoPractice_jdbc.service.UserServiceImpl;


public class UserController {
	public static void main( String[] args )
    {
        UserService userService = new UserServiceImpl();
        String decision ="";
        Scanner input = new Scanner(System.in);
       
        do {
        	System.out.println("Enter your choice:  Save,Update,Delete,Get, List");
        	 String choice = input.next();
             
             switch(choice) {
             
             case "save":
           	  
           	  User saveUser = getUserData(choice, input);
           	              
                 int saved = userService.saveUserInfo(saveUser);
                 
                 if(saved>=1) {
                 	System.out.println("User info is saved sucessfully!!!");
                 }else {
                 	System.out.println("Error in Database!!!");
                 }
           	  break;
             case "update":
           	  User userUser = getUserData(choice, input);
                 
                 int updated = userService.saveUserInfo(userUser);
                 
                 if(updated>=1) {
                 	System.out.println("User info is updated sucessfully!!!");
                 }else {
                 	System.out.println("Error in Database!!!");
                 }
           	  
           	  break;
             case "delete":
           	 System.out.println("Enter Id:");
           	  int deleteId = input.nextInt();	  
           	  userService.delteUserInfo(deleteId);
           	  System.out.println("user info is deleted");
           	  break;
           	  
             case "get":
           	
           	  System.out.println("Enter id: ");
           	  int getId = input.nextInt();
           	  User user= userService.getUserById(getId);
           	  
           	  System.out.println("User id is: "+user.getId());
           	  System.out.println("User password is: "+user.getUsername());
           	  System.out.println("User password is: "+user.getPassword());
           	  System.out.println("User address is: "+user.getAddress());
           	  System.out.println("User mobile number is: "+user.getMobileNum());
           	  break;
           	  
             case "list":
           	  List<User> userList = userService.getAllUserInfo();
           	  
           	  for(User u: userList) {
           		  System.out.println("User id is: "+u.getId());
               	  System.out.println("User password is: "+u.getUsername());
               	  System.out.println("User password is: "+u.getPassword());
               	  System.out.println("User address is: "+u.getAddress());
               	  System.out.println("User mobile number is: "+u.getMobileNum());
               	  System.out.println("");
           	  }
           	          	  
           	  break;
             }
             System.out.println("Do you want to continue? Y/N");
             decision=input.next().toLowerCase();
        }while (decision.equals("y")); 
    }
    
    public static User getUserData(String type, Scanner input) {
    	User user = new User();
        if(type.equals("update")) {
        	System.out.println("Enter id");
        	int id = input.nextInt();
        	user.setId(id);
        }
        System.out.println("Enter user name: ");
        String username = input.next();
        System.out.println("Enter user password: ");
        String password = input.next();
        System.out.println("Enter user phone number: ");
        long phoneNum = input.nextLong();
        System.out.println("Enter user address: ");
        String address = input.next();
        
        user.setUsername(username);
        user.setPassword(password);
        user.setAddress(address);
        user.setMobileNum(phoneNum);
        
        return user;
    }

}
