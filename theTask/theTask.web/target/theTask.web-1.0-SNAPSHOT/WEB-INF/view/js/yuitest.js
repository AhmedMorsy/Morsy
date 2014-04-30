
YUI().use(
		'io-base',
		'node',
		function(Y) {

			Y.on('domready', function() {

				var button = Y.one("#saveEmp");

				button.on("click", function(e) {
					var successDiv = Y.one("#successDiv");
					var failDiv = Y.one("#failDiv");
					var fname = document.getElementById("firstName")
							.getAttribute("value");

					var lname = document.getElementById("lastName")
							.getAttribute("value");

					var salary = document.getElementById("salary")
							.getAttribute("value");

					var url = '/index?firstName=' + fname + '&lastName='
							+ lname + '&salary=' + salary;

					Y.io(url, {
						method : 'POST',
						on : {
							success : function(id, result) {

								successDiv.append(result.responseText);
								successDiv.removeClass('hidden');

							},
							failure : function(id, result) {
								failDiv.append(result.responseText);
								failDiv.removeClass('hidden');
							},
							end : function(id, result) {

							}
						}
					});
				});

			});
		});
