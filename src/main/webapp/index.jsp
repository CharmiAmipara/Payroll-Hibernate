<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<link rel="stylesheet" href="payrollMavenCss.css">
</head>
<body>
	<div class="container">
		<div class="header">
            <h1>Login</h1>
        </div>
        <div class="subheader">
        	<h4><a href="ShowDetail.jsp">Show Detail</a></h4>
        </div>
        
		<div class="detail">
            <form action="payrollLogin" method="post" >
                <div class="data-container">
                	<div class="data">
                        <label for="eid"> Employee Id</label><br>
                        <input type="text" name="eid" class="btn" placeholder="  Enter Employee Id">
                    </div>
                    <div class="data">
                        <label for="name"> Name</label><br>
                        <input type="text" name="name" class="btn" placeholder="  Enter Name">
                    </div>
                    <div class="data">
                        <label for="des"> Designation</label><br>
                        <input type="text" name="des" class="btn" placeholder="  Enter Designation">
                    </div>
                    <div class="data">
                        <label for="salary"> Salary</label><br>
                        <input type="number" name="salary" class="btn" placeholder="  Enter Salary">
                    </div>
                    <div class="data">
                        <label for="email"> Email Id</label><br>
                        <input type="email" name="email" class="btn" placeholder="  Enter Email Id">
                    </div>
                    <div class="data">
                        <label for="name"> Password</label><br>
                        <input type="password" name="password" class="btn" placeholder="  Enter Password">
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
