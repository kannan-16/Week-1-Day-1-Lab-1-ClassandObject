package service;

//import the package for Local date and time (java --> time --> LocalDate)
 
//import the package for period (java --> time --> Period)

//import the package for person (model.person)

//Create a public class called PersonalityCalculator

//Impart a toString method with a parameter person of type Person
//Return name, gender and DOB as given below
//Name: *User's Name*
//Gender: *User's Gender*
//DOB: *User's DOB*

//Create a method called findPersonality of type String with the same parameter person of type Person
/*This method would determine the personality of the person by a few computations 
 that is to be defined inside the method*/

	
//Declare a variable called sum and initialize it 0
//This variable would sum the responses captured from the user

//Now, sum all the values and assign it to the sum variable 
//Revive the integer values(question's responses) using the getter method
//Use the person object to call the getter methods from the person class
	
//If sum is greater than 45 and lesser than or equal to 50 
//return "You are contented with your life. Everyone is happy around you. Welcome aboard ProGrad"
	
//If sum is greater than 35 and lesser than or equal to 45
//return "You are almost happy but something disturbs you. Push aside your thoughts and enjoy your life. Welcome aboard ProGrad".
	
//If sum is greater than 25 and lesser than or equal to 35
//return "You are searching for happiness. Find the happiness in you. You are a Prograd now. So no worries be happyyyyy!!!!"".
	
//For all the other sum values
//return "You are not very happy with your life. Don't think about your past. Think about your present and put your best efforts. You have a wonderful future. Now that you are a Prograd, it proves your worth. Your future is what we build here"
	 

//Create a method called findSign of String return type with the same parameter person of type Person

//Create an array named date of type string, 

//Split the dob by '-' and store it in the date array. Hope you know to split the string by a space. Extend the same by "-".

//Store the day and month in 2 separate variables (Make sure that they are converted tp integer)

//Print the day and month values using the two new variables created

//Create a new String variable called astro_sign and assign null ("")
    
//Checks month and date within the valid range of a specified zodiac

//March 21 - April 20 --> Aries
//April 21 - May 21 --> Taurus
//May 22 - June 23 --> Gemini
//June 24 - July 23 --> Cancer
//July 24 - August 23 --> Leo
//August 24 - September 22 --> Virgo
//September 23 - October 23 --> Libra
//October 24 - November 22 --> Scorpius
//November 23 - December 21 --> Saggitarius
//December 22 - January 19 --> Capricornus
//January 20 - February 18 --> Aquarius
//February 19 - March 20 --> Pisces

//return the astro_sign          


//Create a method named findYourMatch of String return type with the same parameter person of type Person
	
//Create a String variable named match that would receive the return value by calling the method findSign with the value as person.

//Create an empty string variable named yourPartner

//Assign a suitable partner for the respective zodiac signs as below. Use switch case or cascaded if to assign the values to yourPartner variable
//Aries --> Chimpanzee
//Taurus --> Orangutan
//Gemini --> Monkey
//Cancer --> Pig
//Leo --> Sloth bear
//Virgo --> Macaque
//Libra --> Gorilla
//Scorpio --> Orangutan
//Sagittarius --> Baboon
//Aquarius --> Chimpanzee
//Pisces --> Baboon
//Doesn't it sound wonderful. Do you feel like trying it with your friends? Take the blame!!!

//return yourPartner 


//Create the ageCalculator method of the type Period with a parameter person of type Person

//Create a variable named today of type LocalDate and assign the current date.
//Know the use of method now()

//Calculate the age using the method between() and assign it to a new variable named age of type Period

//return age

//Note: Make sure that you uncomment the lines in PersonalityCalculator.java file