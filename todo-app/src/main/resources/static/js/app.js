$(document).ready(function() {
	$('#findButton').click(function() {
		var employeeName = $('#employeeName').val()
		
		$.ajax({
			url: '/employee/' + employeeName
		}).then(function(data) {
			$('#name').html(data.name)
			$('#age').html(data.age)
			$('#role').html(data.role)
		})
	})
})
