YUI().use('io-base', 'node', function(Y) {

	Y.on('domready', function() {

		var button = Y.one("#getEmp");
		//button.set('disabled', true);
		
		

		button.on("click", function(e) {
			var resultDiv = Y.one("#resultDiv");

			var formdiv = Y.one("#formDiv");
			// var failDiv = Y.one("#failDiv");

			var form = document.forms['subForm'];

			var id = form.elements['id'].value;
			
			if(id == null || id == ""){
				alert( "ID is required." );
			}else{
					if(isNaN(id)){
						alert( "please enter a valid ID." );
					}else{
						var url = '/getbyid?id=' + id;

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
									failDiv.setHTML(result.responseText);

								},
								end : function(id, result) {

								}
							}
						});
					}
				}
			

	
		});

	});
});
