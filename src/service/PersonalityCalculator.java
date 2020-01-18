package service;

import java.time.LocalDate;
import java.time.Period;

import model.Person;

public class PersonalityCalculator {

public String toString(Person person) {
	return "Name:"+person.getName()+"\nGender:"+person.getGender()+"\nDOB:"+person.getDob();
}

public String findPersonality(Person person) {
	int sum=0;
	sum=person.getQ1()+person.getQ2()+person.getQ3()+person.getQ4()+person.getQ5()+person.getQ6()+person.getQ7()+person.getQ8()+person.getQ9()+person.getQ10();
	if(sum>45 && sum<=50) {
		
		return "you are a Very Very Happy Person! Everyone loves to enjoy with you and spend time with you.Welcome Aboard Prograd";
	}
	else if(sum>35 && sum <=45) {
	
		return "you are Almost Happy but somethings in life quite disturb you a lot. Come on push aside your thoughts and enjoy your life Chap. Welcome aboard Prograd.Your life will be always happy and fun.";
	}
	else if(sum>25 && sum<=35 ) {
		
		return "you are Searching for Happiness, instead of searching around you.Find the happiness which is inside you. Say all is well and get on with life. Now we are a Prograd so no worries be happyyyyy!!!!" ;
	}
	else {
		
		return "you are Not Very Happy with your life. Don't think about your past. Think about your present and put your best efforts. You have a wonderful future.Now that you are a Prograd, there is no one Stopping you.Your future is what we build here";
	}
		
}
public String findSign(Person person) {
	String[] date=String.valueOf(person.getDob()).split("-");
	int day=Integer.parseInt(date[2]);
	int month=Integer.parseInt(date[1]);
	
	System.out.println(day);
	System.out.println(month);
	String astro_sign=""; 
    
    // checks month and date within the  
    // valid range of a specified zodiac 
    if (month == 12){ 
          
        if (day < 22) 
        astro_sign = "Sagittarius"; 
        else
        astro_sign ="Capricorn"; 
    } 
          
    else if (month == 1){ 
        if (day < 20) 
        astro_sign = "Capricorn"; 
        else
        astro_sign = "Aquarius"; 
    } 
          
    else if (month == 2){ 
        if (day < 19) 
        astro_sign = "Aquarius"; 
        else
        astro_sign = "Pisces"; 
    } 
          
    else if(month == 3){ 
        if (day < 21)  
        astro_sign = "Pisces"; 
        else
        astro_sign = "Aries"; 
    } 
    else if (month == 4){ 
        if (day < 20) 
        astro_sign = "Aries"; 
        else
        astro_sign = "Taurus"; 
    } 
          
    else if (month == 5){ 
        if (day < 21) 
        astro_sign = "Taurus"; 
        else
        astro_sign = "Gemini"; 
    } 
          
    else if( month == 6){ 
        if (day < 21) 
        astro_sign = "Gemini"; 
        else
        astro_sign = "Cancer"; 
    } 
          
    else if (month == 7){ 
        if (day < 23) 
        astro_sign = "Cancer"; 
        else
        astro_sign = "Leo"; 
    } 
          
    else if( month == 8){ 
        if (day < 23)  
        astro_sign = "Leo"; 
        else
        astro_sign = "Virgo"; 
    } 
          
    else if (month == 9){ 
        if (day < 23) 
        astro_sign = "Virgo"; 
        else
        astro_sign = "Libra"; 
    } 
          
    else if (month == 10){ 
        if (day < 23) 
        astro_sign = "Libra"; 
        else
        astro_sign = "Scorpio"; 
    } 
          
    else if (month == 11){ 
        if (day < 22) 
        astro_sign = "Scorpio"; 
        else
        astro_sign = "Sagittarius"; 
    } 
          
   return astro_sign;
} 
	
	
public String findYourMatch(Person person) {

	String match=findSign(person);
	String yourPartner="";
	if(match.equalsIgnoreCase("Aries")) {
		//yourPartner="Aquarius";
		yourPartner="Chimpanzee";
	}
	else if(match.equalsIgnoreCase("Taurus")) {
		//yourPartner="Cancer";
		yourPartner="Orangutan";
	}
	else if(match.equalsIgnoreCase("Gemini")) {
		//yourPartner="Aquarius";
		yourPartner="Monkey";
	}
	else if(match.equalsIgnoreCase("Cancer")) {
		//yourPartner="Pisces";
		yourPartner="Pig";
	}
	else if(match.equalsIgnoreCase("Leo")) {
		//yourPartner="Sagittarius";
		yourPartner="Sloth bear";
	}
	else if(match.equalsIgnoreCase("Virgo")) {
		//yourPartner="Taurus";
		yourPartner="Macaque";
	}
	else if(match.equalsIgnoreCase("Libra")) {
		//yourPartner="Gemini";
		yourPartner="Gorilla";
	}
	else if(match.equalsIgnoreCase("Scorpio")) {
		//yourPartner="Cancer";
		yourPartner="Orangutan";
	}
	else if(match.equalsIgnoreCase("Sagittarius")) {
		//yourPartner="Aries";
		yourPartner="Baboon";
	}
	else if(match.equalsIgnoreCase("Capricorn")) {
		//yourPartner="Taurus";
		yourPartner="Baboon";
	}
	else if(match.equalsIgnoreCase("Aquarius")) {
		//yourPartner="Gemini";
		yourPartner="Chimpanzee";
	}
	else if(match.equalsIgnoreCase("Pisces")) {
		//yourPartner="Scorpio";
		yourPartner="Baboon";
	}
	return yourPartner;
}
public Period ageCalculator(Person person) {
	LocalDate today=LocalDate.now();
	Period age=Period.between(person.getDob(), today);
	
	return age;
}
}
