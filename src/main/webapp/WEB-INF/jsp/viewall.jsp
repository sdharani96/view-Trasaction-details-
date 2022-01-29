<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Transactions Details</title>
</head>
<style>
    th{ 
        color:#fff;
            }
</style>
<body>
<h1>Transactions</h1>

	<table class="table table-striped">
    <tr  class="bg-info">
        <th>First</th>
        <th>Last</th>
        <th>Email</th>
    </tr>

    <tbody id="myTable">

    </tbody>
</table>
	<script>
	var myArray = []


	$.ajax({
		method:'GET',
		url:'https://reqres.in/api/users',
		success:function(response){
			myArray = response.data
			buildTable(myArray)
			console.log(myArray)
		}
	})



	function buildTable(data){
		var table = document.getElementById('myTable')

		for (var i = 0; i < data.length; i++){
			var row = `<tr>
							<td>${data[i].}</td>
							<td>${data[i].}</td>
							<td>${data[i].}</td>
					  </tr>`
			table.innerHTML += row


		}
	}

</script> 
	
	
</body>
</html>