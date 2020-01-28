package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Uncomment the below lines
//import model.Person;
//import service.PersonalityCalculator;


@WebServlet(urlPatterns= {"/personality"})
public class PersonalityViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public PersonalityViewController() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/personalityView.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//Uncomment the below lines
		/*
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-yyyy");
		String name=request.getParameter("name");
		String gender=request.getParameter("gender");
		String date=request.getParameter("dob");
		LocalDate dob=null;
		dob=LocalDate.parse(date);  
		
		System.out.println(dob);
		int q1=Integer.parseInt(request.getParameter("answer1"));
		int q2=Integer.parseInt(request.getParameter("answer2"));
		int q3=Integer.parseInt(request.getParameter("answer3"));
		int q4=Integer.parseInt(request.getParameter("answer4"));
		int q5=Integer.parseInt(request.getParameter("answer5"));
		int q6=Integer.parseInt(request.getParameter("answer6"));
		int q7=Integer.parseInt(request.getParameter("answer7"));
		int q8=Integer.parseInt(request.getParameter("answer8"));
		int q9=Integer.parseInt(request.getParameter("answer9"));
		int q10=Integer.parseInt(request.getParameter("answer10"));
		Person person=new Person(name,gender,dob,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10);
		PersonalityCalculator personalitycalc=new PersonalityCalculator();
		
		person.setName(name);
		person.setGender(gender);
		person.setDob(dob);
		person.setQ1(q1);
		person.setQ2(q2);
		person.setQ3(q3);
		person.setQ4(q4);
		person.setQ5(q5);
		person.setQ6(q6);
		person.setQ7(q7);
		person.setQ8(q8);
		person.setQ9(q9);
		person.setQ10(q10);
		
		System.out.println(personalitycalc.toString(person));
		String message=personalitycalc.findPersonality(person);
		String astro=personalitycalc.findSign(person);
		String match=personalitycalc.findYourMatch(person);
		Period age=personalitycalc.ageCalculator(person);
		if(!message.equals("")){
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/outputView.jsp");
			request.setAttribute("person", person);
			request.setAttribute("message", message);
			request.setAttribute("astro", astro);
			request.setAttribute("match", match);
			request.setAttribute("age", age);
			rd.forward(request, response);
		}*/
	}
}
