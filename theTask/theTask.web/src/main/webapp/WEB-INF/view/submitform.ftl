<#import "spring.ftl" as spring>

<html>
<head>

<script src="http://yui.yahooapis.com/3.15.0/build/yui/yui-min.js"></script>
<script type="text/javascript" src="<@spring.url '/js/yuitest.js'/>"></script>

<style>

#header {
    background-color: #30425E;
    border: 1px solid;
    height: 200px;
    padding-left: 1%;
    padding-top: 0;
}
#title {
    color: #FFFFFF;
    margin-bottom: 0;
    padding-left: 0.5%;
    padding-top: 3%;
}
#container {
    height: 100%;
    width: 100%;
}
#content {
    background-color: #1F385F;
    float: left;
    height: 2119px;
    padding-left: 1.5%;
    padding-right: 1.5%;
    width: 85%;
}
#menu {
    background-color: #30425E;
    float: left;
    height: 2119px;
    width: 12%;
}
#navigation {
    background-color: #30425E;
    text-align: center;
}
#form {
}
#formDiv {
    padding-left: 576px;
}
.hidden {
    visibility: hidden;
}
a {
    color: #FFFFFF;
    text-decoration: none;
}
.spacing {
    padding-right: 30px;
}

</style>






<title>Welcome</title>
</head>
<body>
	<div id="container">
		<div id="header">
			<h1 id="title">Save a new Employee</h1>
		</div>
		<div id="menu"></div>
		<div id="content">
			
			<div id="navigation">
				<h2><span class="spacing"><a href="/index"><strong>Home</strong></a></span> <span class="spacing"><a href="/getbyid"><strong>Get Employee by Id</strong></a></span> <a href="/addemp"><strong>Add Employee</strong></a></h2>
			</div>
			
			<div id="formDiv">
				<form id="subForm" method="post" action="#">
					<p>
						First Name: <input id="fname" type="text" name="firstName">
					<p>
						Last Name: <input id="lname" type="text" name="lastName">
					<p>
						Salary: <input id="salary" type="text" name="salary"> <input
							id="saveEmp" type="button" name="save" value="Save">
				</form>
				</div>
				<div id="resultDiv">
				
				</div>
				
			</div>
			
	</div>

</body>

</html>