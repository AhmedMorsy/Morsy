YUI().use(
		'io-base',
		'node',
		function(Y) {

			Y.on('domready', function() {

				var button = Y.one("#saveEmp");

				button.on("click", function(e) {
					var resultDiv = Y.one("#resultDiv");

					var formdiv = Y.one("#formDiv");
					// var failDiv = Y.one("#failDiv");

					var form = document.forms['subForm'];

					var firstName = form.elements['firstName'].value;
					var lastName = form.elements['lastName'].value;
					var salary = form.elements['salary'].value;

					// var fname = document.getElementById("fname")
					// .getAttribute("value");
					//
					// var lname = document.getElementById("lname")
					// .getAttribute("value");
					//
					// var salary = document.getElementById("salary")
					// .getAttribute("value");
					//
					
					var stringRegEx = /^[^\\\/&0-9]*$/;
					var numRegEx = /^[0-9]*$/;
					
					if(firstName.match(stringRegEx)){
						if(lastName.match(stringRegEx)){
							if(salary.match(numRegEx)){
								
								
								var url = '/addemp?firstName=' + firstName + '&lastName='
								+ lastName + '&salary=' + salary;

						Y.io(url, {
							method : 'POST',
							on : {
								success : function(id, result) {

									resultDiv.setHTML(result.responseText);
									var successDiv = Y.one("#successDiv");
									if (successDiv != null) {
										successDiv.removeClass('hidden');
										formdiv.addClass('hidden');
									} else {
										var failDiv = Y.one("#failDiv");
										failDiv.removeClass('hidden');
										formdiv.addClass('hidden');
									}

								},
								failure : function(id, result) {
									

								},
								end : function(id, result) {

								}
							}
						});
								
							}else{
								alert( "Please enter a valid Salary." );
							}
						}else{
							alert( "Please enter a valid Last Name." );
						}
					}else{
						alert( "Please enter a valid First Name." );
					}
					
					
				});

			});
		});
