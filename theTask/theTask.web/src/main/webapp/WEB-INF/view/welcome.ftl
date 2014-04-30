<#import "spring.ftl" as spring>

<html>
<head>

<style>
	#header{
			
			
	
			background-color: #000000;
	

			height: 200px;
			border: 1px solid;
			padding-left: 1%;
			padding-top: 0%;
					
		}
		
		#title{
			margin-bottom: 0;
			color: red;
			color: #C0C0C0;
			padding-top: 3%;
			padding-left: 0.5%;
			
		}
		
		#container{
		
			width:100%; 
			height: 100%;
		}

		#content{
			width: 85%;
			background-color: #C0C0C0;
			height:2119px;
			float: left;
			padding-left: 1.5%;
			padding-right: 1.5%;			
		}
		
		#menu{
			height:2119px;
			background-color:#505050;
			width:12%;float:left;
		}
		
		#navigation{
		text-align: center;
		background-color: #505050;
		}
</style>

<title>Welcome</title>
</head>
<body>
	<div id="container">
		<div id="header">
			<h1 id="title">Welcome</h1>
		</div>
		<div id="menu"></div>
		<div id="content">
		
		<h2><p> welcome ${emp.firstName} ${emp.lastName}.</p></h2>
			<div id="navigation">
				
			</div>
		</div>
	</div>
	
</body>
	
</html>