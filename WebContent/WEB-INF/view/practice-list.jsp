<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>


<head>
	<title> Songs to Practice List</title>
</head>
<body>
<div id="wrapper">
		<div id="header">
			<h2> Practice List</h2>
			<hr>
		</div>
	</div>
	
	
		<table>
			<tr>
				<th> Listing Number  </th>
				<th> Song Title  </th>
				<th> Artist    </th>
			</tr>
			
			<hr>
			
			<!--  Loop over and print list of CD's -->
				<c:forEach var="tempCD" items="${songList}">
					<tr>
					<th> ${tempCD.songDiscListing} </th>
					<th> ${tempCD.songTitle} </th>
					<th> ${tempCD.artist}  </th>
				</tr>
				</c:forEach>
		
		</table>

</body>

</html>