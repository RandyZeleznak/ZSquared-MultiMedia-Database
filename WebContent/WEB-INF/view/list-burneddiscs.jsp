
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTTYPE html>
<html>

<head>
		<title> List of Burned Disks </title>
		<!--  Reference style sheets for this app -->
		<link type="text/css"
			   rel="stylesheet"
			   href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>


<body>
	<div id="wrapper">
		<div id="header">
			<h2> List of Burned Compact Disks </h2>	
		</div>
	</div>
		
		<input type="button" value="Add Disk"
			onclick="window.location.href='addToCDList'; return false;"
			class="add-button"
			/>
		
			<!--  Add Table heading here -->
			<table>
				<tr>
					<th> Disk Name        </th>
					<th> Artist    </th>
				</tr>
				
				<div id="container">
					<div id="content"> 
				
				<!--  Loop over and print list of CD's -->
				<c:forEach var="tempCD" items="${burnedDiscs}">
				
				<!--  Construct an "showLink" link  with disc id -->
					<c:url var="showLink" value="/practiceList">
				<!--  		<c:param name="id" value="${tempCD.id}"/> -->
					</c:url>
				
					<tr>
					<th> <a href="${showLink}">${tempCD.discName}</a> </th>
					<th> ${tempCD.artist}  </th>
				</tr>
				</c:forEach>
					 </div>
				</div>
			</table>
	



</body>











</html>