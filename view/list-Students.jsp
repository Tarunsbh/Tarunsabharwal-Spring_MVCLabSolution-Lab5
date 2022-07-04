<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, inital-scale=1, shrink-to-fit=no">

<!-- BootStap CSS -->

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">
<meta charset="UTF-8">
<title>View Student Repository</title>

</head>
<body>
	<div class="container">
		<h3>View Student Repository</h3>
		<hr>

		<!-- Add a search form -->

		<!--  Add a button -->
		<a href="/studentmanagement/student/showFormForAdd"
			class="btn btn-primary btn-sm mb-3">Add New Student Data</a>
		<table class="table -tablebordered table-striped">
			<thead class="thead-dark">
				<tr>
					<th>Name</th>
					<th>Department</th>
					<th>Country</th>
					<th>Action</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${Students}" var="tempStudent">
					<tr>
						<td><c:out value="${tempStudent.name}" /></td>
						<td><c:out value="${tempStudent.department}" /></td>
						<td><c:out value="${tempStudent.country}" /></td>
						<td><input type="hidden" name="id" value="${tempStudent.id}" />

							<!-- Add "Update" button --> <a
							href="/studentmanagement/student/showFormForUpdate?studentId=${tempStudent.id}"
							class="btn btn-info btn-sm">Update</a> <!-- Add Delete button -->
							<a
							href="/studentmanagement/student/delete?studentId=${tempStudent.id}"
							class="btn btn-danger btn-sm"
							onclick="if(!(confirm('Are you sure you want to delete this Studentdetails?')))return false">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>



</body>
</html>