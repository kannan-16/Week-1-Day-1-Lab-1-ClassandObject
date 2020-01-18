<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/Week-1-Day-1-Lab-1/assets/style.css"/>
</head>
<body>
<header class="header">
<img class="logo" src="/Week-1-Day-1-Lab-1/assets/Logo.svg" alt="logo"></img>
</header>
<div class="output">
Your name is ${person.getName()} and your age as of today is <h1>${age.getYears()} years ${age.getMonths()} month ${age.getDays()} days</h1>Based on your date of birth we found that your zodiac sign is <h1>${astro}</h1>Based on your answers to the questions which we have given we could say that <h1>${message}</h1>
Now based on your type. It time now to identify the love of your life. Your future wife would be a <h1>${match}</h1>
</div>
<footer class="footer">
Copyrights@FACE
</footer>
</body>
</html>