$(document).ready(function () {

	$('#findButton').click(function () {
		var employeeName = $('#employeeName').val()

		$.ajax({
			url: '/employee/' + employeeName
		}).then(function (data, result, response) {
			$('#name').html(data.name)
			$('#age').html(data.age)
			$('#role').html(data.role)
		}).catch(function (err) {
			alert('Error when trying to retrieve data')
		})
	})

	$('#insertButton').click(function () {
		var employee = {
			name: $('#nameInsert').val(),
			age: $('#ageInsert').val(),
			role: $('#roleInsert').val()
		}

		$.ajax({
			url: '/employee/',
			method: 'POST',
			data: JSON.stringify(employee),
			contentType: "application/json"
		}).then(function (data, result, response) {
			alert('Data saved if success')
		}).catch(function (err) {
			alert('Error when trying to save data')
		})
	})

	$.ajax({
		url: '/employee/',
		method: 'GET',
	}).then(function (data, result, response) {
		var fullTableData = []

		data.forEach(function (each) {
			var tableData = []
			tableData.push(each.name)

			fullTableData.push(tableData)
		})


		$('#employeesTable').dataTable({
			"data": [
				fullTableData
			],
		})
	}).catch(function (err) {
		alert('Error when trying to save data')
	})

})





/*
$(document).ready(function () {
	$('#findButton').click(function () {
		var employeeName = $('#employeeName').val()

		$.ajax({
			url: '/employee/' + employeeName,
			success: function (data, result, response) {
				$('#name').html(data.name)
				$('#age').html(data.age)
				$('#role').html(data.role)
			},
			error: function(err) {
				alert('Error when trying to retrieve data')
			}

		})
	})
})
*/