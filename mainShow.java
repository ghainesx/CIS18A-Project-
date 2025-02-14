package cisfinalpackext;

import java.util.*;

//Implement our classes with our interfaces here in our main file (mainShow has main) - using inheritance 
//Display/get all of our data in this file, use our interfaces methods here 
class movieDateInfo implements showData, getData{
    
//String array to hold movies 
	public String[] movies = {"1.Nosferatu\n", "2.Wolfman\n", "3.Hereditary\n", 
                              "4.Sinister\n", "5.28 Days Later\n", "6.Longlegs\n",
                              "7.The Ring\n", "8.Saw\n"};
    
//Delivery dates 
    public String[] dates = {"1.Monday\n", "2.Tuesday\n", "3.Wednesday\n",                                    "4.Thursday\n","5.Friday\n" };
    
//Delivery times
     public String[] times = {"\n1:00 PM", "\n2:00 PM", "\n3:00 PM", "\n4:00 PM",                            "\n5:00 PM", "\n6:00 PM\n"};
        
//Input variable names, pick movie + delivery times
    public String myMovie;
    public String deliDay;
    public String deliTime; 
    
//Implementing our showdata interface  
    //Show our movies 
    //First for loop
    public void movOptions(){
        for(int i = 0; i < movies.length; i++)
        System.out.print(movies[i]);
    };
    //Second for loop to show our delivery days  
    public void dateOptions(){
        for(int i = 0; i < dates.length; i++)
        System.out.print(dates[i]);
    };
    //Third for loop to display times for delivery 
    public void timeOptions(){
        for(int i = 0; i < times.length; i++)
        System.out.print(times[i]);
    };
//Implementing getdata interface to choose a movie - utilizing class inheritance
    public void userChoice() {
    Scanner sc = new Scanner(System.in);
	//Prompt for movie choice 
	  System.out.println("\nTo select your movie, type in the number corresponding with the movie's title (e.g. 1 for Nosferatu) ");
	    String myMovie = sc.nextLine(); 
        //Reference to refer  back to in our receipt 
        this.myMovie = myMovie;
        //Using our first switch statement to display user choice for movie 
        switch(myMovie) {
            case "1": 
            System.out.println("\nYou chose: "+ movies[0]);
            break;
        case "2": 
            System.out.println("\nYou chose: "+ movies[1]);
            break;
        case "3": 
            System.out.println("\nYou chose: "+ movies[2]);
            break;
        case "4": 
            System.out.println("\nYou chose: "+ movies[3]);
            break;
        case "5": 
            System.out.println("\nYou chose: "+ movies[4]);
            break;
        case "6": 
            System.out.println("\nYou chose: "+ movies[5]);
            break;
        case "7":
            System.out.println("\nYou chose: "+ movies[6]);
            break;
        case "8":
            System.out.println("\nYou chose: "+ movies[7]);
            break;
        }
    }    

//Pick a date 
    //Creating our own local method here, not from an interface
    public void delivery() {
        Scanner sc = new Scanner(System.in);
	//Prompt for date choice 
      System.out.println("\nYour item will be shipped next week on the day of your choice.");
	  System.out.println("\nTo select your delivery date, type in the number corresponding with the day of the week (e.g. 2 for Tuesday): ");
	    String deliDay = sc.nextLine(); 
     //Reference to refer  back to in our receipt 
        this.deliDay = deliDay;
        //Switch statement to choose a delivery date
        switch(deliDay) {
        case "1": 
            System.out.println("\nYou chose: "+ dates[0]);
            break;
        case "2": 
            System.out.println("\nYou chose: "+ dates[1]);
            break;
        case "3": 
            System.out.println("\nYou chose: "+ dates[2]);
            break;
        case "4": 
            System.out.println("\nYou chose: "+ dates[3]);
            break;
        case "5": 
            System.out.println("\nYou chose: "+ dates[4]);
            break;
    }
        
}

//Pick a time
    //Another local method 
    public void time() {
        Scanner sc = new Scanner(System.in);
        //Time choice
        System.out.println("\nDeliveries will go out from 1-6 PM, please select a time for us to deliver your movie selection (type in 1 for 1PM, etc.): ");
	    String deliTime = sc.nextLine(); 
        //Reference to refer  back to in our receipt 
        this.deliTime = deliTime; 
        //Switch statement when picking a time  
        switch(deliTime) {
        case "1": 
            System.out.println("\nYou chose: "+ times[0]);
            break;
        case "2": 
            System.out.println("\nYou chose: "+ times[1]);
            break;
        case "3": 
            System.out.println("\nYou chose: "+ times[2]);
            break;
        case "4": 
            System.out.println("\nYou chose: "+ times[3]);
            break;
        case "5": 
            System.out.println("\nYou chose: "+ times[4]);
            break;
        case "6": 
            System.out.println("\nYou chose: "+ times[5]);
            break;
        }

    }
        
//Put our movie info in a receipt to refer to later
    //Couldn't figure out how to get everything into one "receipt()" method - which was my original goal
    //I think this is the weakest part of my program 
    public void receipt(){
        System.out.println("Movie: ");
        System.out.println(this.myMovie);
    }
    public void receipt2() {
        System.out.println("Delivery Day: ");
        System.out.println(this.deliDay);
    }
    public void receipt3() {
        System.out.println("Delivery Time:");
        System.out.println(this.deliTime);
    }
}

//Second class with user info 
//Implementing our first interface getData here 
class usersInfo implements getData {
    public String firstname;
    public String lastname;
    public String address; 
    
//User choice to implement from getData 
 public void userChoice() {
     Scanner sc = new Scanner(System.in);
	//Ask for first name 
      System.out.println("\nPlease input your first and last name and address in order for us to proceed with your delivery.");
	  System.out.println("\nFirst Name: ");
        firstname = sc.nextLine(); 

     //Ask for last name 
     System.out.println("\nLast Name: ");
       lastname = sc.nextLine();
     
     //Ask for address
     System.out.println("\nAddress: ");
        address = sc.nextLine(); 
     
     System.out.println("\nYou input: ");
     System.out.println(firstname);
     System.out.println(lastname);
     System.out.println(address);     
    }           
    
//Receipt information - taking our input and outputting it later in main is the goal 
//For our order summary     
    public void receipt() {
        System.out.println(firstname);
    }
    public void receipt2() {
        System.out.println(lastname);
    }
    public void receipt3() {
        System.out.println(address);
    }
}

//Finally, our main class with our main method and class implementaiton with objects 
class mainShow {
public static void main(String args[]){
System.out.println("\nWelcome to Virus VHS!\n OPEN 11-6PM M-F\n");
//Display movie options 
System.out.println("Please take a look at our movie selection:\n");
    //New object to access our movieDateInfo class and show options 
    movieDateInfo Mov = new movieDateInfo();
    Mov.movOptions();
    //Access getdata
    Mov.userChoice();
    
//Show the options for delivery dates  
System.out.println("\nDelivery dates are as follows:\n");
    Mov.dateOptions();
//Pick a day 
    Mov.delivery();
//Display time options & pick a time
System.out.println("\nDelivery times are as follows: ");
    Mov.timeOptions();
    Mov.time(); 
    
//Input user info to ship our movie 
   usersInfo nameAddress = new usersInfo();
    nameAddress.userChoice(); 
    
//Output our receipt
System.out.println("\nYour receipt is as follows: \n");
    Mov.receipt();
    Mov.receipt2();
    Mov.receipt3();
    System.out.println("\n");
    nameAddress.receipt(); 
    nameAddress.receipt2();
    nameAddress.receipt3();
    System.out.println("\n");
    System.out.println("Thank you for shopping with Virus VHS!");


    }
}