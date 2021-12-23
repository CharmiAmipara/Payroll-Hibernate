<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<link rel="stylesheet" href="payrollMavenCss.css">
</head>
<body>
	<div class="container">
		<div class="header">
            <h1>Show Detail</h1>
        </div>
        <hr>
		<div class="detail">
            <form action="payrollShow" method="post" >
                <div class="data-container">
                	
                    <div class="data">
                        <label for="email"> Email Id</label><br>
                        <input type="email" name="email" class="btn" placeholder="  Enter Email Id">
                    </div>
                    <div class="data">
                        <label for="name"> Password</label><br>
                        <input type="password" name="password" class="btn" placeholder="  Enter Password">
                    </div>
                    <div class="data">
                        <label for="day"> Working Days</label><br>
                        <input type="text" name="day" class="btn" placeholder="  Enter Working Days">
                    </div>
                    <div class="data">                    
                        <input type="submit" class="sub" value="submit">
                    </div>
                </div>
            </form>
        </div>
	</div>
</body>
</html>
