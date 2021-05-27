
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTTYPE html>
<html>

<head>
		<title> List of Burned Disks </title>
</head>


<body>

	<div id="wrapper">
		<div id="header">
			<h2> List of Burned Compact Disks </h2>	
		</div>
	</div>
	
	<div id="container">
		<div id="content">
			<!--  Add Table heading here -->
			<table>
				<tr>
					<th> Disk Name        </th>
					<th> Artist    </th>
				</tr>
				
				<!--  Loop over and print list of CD's -->
				<c:forEach var="tempCD" items="${burnedDiscs}">
					<tr>
					<th> ${tempCD.discName} </th>
					<th> ${tempCD.artist}  </th>
				</tr>
				</c:forEach>
			</table>
		</div>
	</div>



</body>











</html>