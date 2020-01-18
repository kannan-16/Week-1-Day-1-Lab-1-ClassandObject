<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Guess Me</title>
<link rel="stylesheet" href="/Week-1-Day-1-Lab-1/assets/style.css" /> 

</head>
<body>
<script type="text/javascript" type="module" src="/Week-1-Day-1-Lab-1/appscript/script.js"></script>
<link href="https://fonts.googleapis.com/css?family=Nunito+Sans&display=swap" rel="stylesheet">

<header class="header">
<img class="logo" src="/Week-1-Day-1-Lab-1/assets/Logo.svg" alt="logo"></img>
</header>
<main class="main"><h1>A simple game to identify your personality</h1> </main>
<section class="quiz">
<form id="myform" action="/Week-1-Day-1-Lab-1/personality" method="post">
<div class="mydetails">
This game let you identify your happiness index based on some simple questions.Please enter the details given below.<label>Name:<input type="text" name="name"></label>
My gender is <label>Gender:
Male<input type="radio" name="gender" value="Male">
Female<input type="radio" name="gender" value="Female"></label>
<label>DOB:<input type="date" name="dob"></label>
</div>

<div class="question">
<h1>Are you clear of what you will be doing with your life?</h1> 
<div class="options">
<label>Strongly Agree</label>
<input type="radio" name="answer1" value="5">
<input type="radio" name="answer1" value="4">
<input type="radio" name="answer1" value="3">
<input type="radio" name="answer1" value="2">
<input type="radio" name="answer1" value="1">
<label>Strongly Disagree</label>
</div>
</div>
<div class="question">
<h1>Do you have healthy relationships?</h1>
<div class="options">
<label>Strongly Agree</label>
<input type="radio" name="answer2" value="5">
<input type="radio" name="answer2" value="4">
<input type="radio" name="answer2" value="3">
<input type="radio" name="answer2" value="2">
<input type="radio" name="answer2" value="1">
<label>Strongly Disagree</label>
</div>
</div>
<div class="question">
<h1>Are you driven by purpose?</h1>
<div class="options">
<label>Strongly Agree</label>
<input type="radio" name="answer3" value="5">
<input type="radio" name="answer3" value="4">
<input type="radio" name="answer3" value="3">
<input type="radio" name="answer3" value="2">
<input type="radio" name="answer3" value="1">
<label>Strongly Disagree</label>
</div>
</div>
<div class="question">
<h1> Are you enjoying your independence?</h1>
<div class="options">
<label>Strongly Agree</label>
<input type="radio" name="answer4" value="5">
<input type="radio" name="answer4" value="4">
<input type="radio" name="answer4" value="3">
<input type="radio" name="answer4" value="2">
<input type="radio" name="answer4" value="1">
<label>Strongly Disagree</label>
</div>
</div>
<div class="question">
<h1>Do you frequently find yourself burned out with work or school?</h1>
<div class="options">
<label>Strongly Agree</label>
<input type="radio" name="answer5" value="1">
<input type="radio" name="answer5" value="2">
<input type="radio" name="answer5" value="3">
<input type="radio" name="answer5" value="4">
<input type="radio" name="answer5" value="5">
<label>Strongly Disagree</label>
</div>
</div>
<div class="question">
<h1>Does your family annoy you?</h1>
<div class="options">
<label>Strongly Agree</label>
<input type="radio" name="answer6" value="1">
<input type="radio" name="answer6" value="2">
<input type="radio" name="answer6" value="3">
<input type="radio" name="answer6" value="3">
<input type="radio" name="answer6" value="5">
<label>Strongly Disagree</label>
</div>
</div>
<div class="question">
<h1> Is is clear why you get out of bed everyday?</h1>
<div class="options">
<label>Strongly Agree</label>
<input type="radio" name="answer7" value="5">
<input type="radio" name="answer7" value="4">
<input type="radio" name="answer7" value="3">
<input type="radio" name="answer7" value="2">
<input type="radio" name="answer7" value="1">
<label>Strongly Disagree</label>
</div>
</div>
<div class="question">
<h1> Are you motivated to work or to go to school?</h1>
<div class="options">
<label>Strongly Agree</label>
<input type="radio" name="answer8" value="5">
<input type="radio" name="answer8" value="4">
<input type="radio" name="answer8" value="3">
<input type="radio" name="answer8" value="2">
<input type="radio" name="answer8" value="1">
<label>Strongly Disagree</label>
</div>
</div>
<div class="question">
<h1>Does your goal inspires you?</h1>
<div class="options">
<label>Strongly Agree</label>
<input type="radio" name="answer9" value="5">
<input type="radio" name="answer9" value="4">
<input type="radio" name="answer9" value="3">
<input type="radio" name="answer9" value="2">
<input type="radio" name="answer9" value="1">
<label>Strongly Disagree</label>
</div>
</div>
<div class="question">
<h1>Do you seek out new challenges?</h1>
<div class="options">
<label>Strongly Agree</label>
<input type="radio" name="answer10" value="5">
<input type="radio" name="answer10" value="4">
<input type="radio" name="answer10" value="3">
<input type="radio" name="answer10" value="2">
<input type="radio" name="answer10" value="1">
<label>Strongly Disagree</label>
</div>
</div>
<button class="button" type="submit" name="click" onclick=resetForm >Submit</button>
</form>
</section>
<footer class="footer">
Copyrights@FACE
</footer>
</body>
</html>