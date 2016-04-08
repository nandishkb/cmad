<html>
<head>
	<script src="scripts/jquery-2.1.3.js"></script>
	<script>
	/* $(document).ready(function() {
		alert("Document Ready");
	}); */

	$.get("rest/user/", function(data) {
		var rowTemplate = $("#templates table").html();
		console.log(rowTemplate);
		for(index in data) {
			var row = rowTemplate.replace("id", data[index].id).replace("name", data[index].name).replace("email", data[index].emailId)
				.replace("joindate", data[index].joinDate).replace("age", data[index].age).replace("state", data[index].state);
			$("#users").append(row);
		}
	});
	</script>
</head>
<body>
<h2>Hello World!</h2>

<div id="templates" style="display:none;">
	<table>
		<tr><td>id</td><td>name</td><td>email</td><td>joindate</td><td>age</td><td>state</td></tr>
	</table>
</div>

<table id="users">
	<tr><td>id</td><td>name</td><td>email</td><td>joindate</td><td>age</td><td>state</td></tr>
</table>
</body>
</html>
