
YUI().use('io-base', 'node', function(Y) {

	Y.on('domready', function() {
		var button = Y.one("#getEmp");
		button.set('disabled', true);
		var idInput = Y.one('#id');
		idInput.on('keyup', function (e) {
		    validId(idInput,button);
		});
	});
});


function validId(input,button) {

	YUI().use('io-base', 'node', function(Y) {
	
		
	var id = input.get('value');
	var validCheck = Y.one('#valid');
	
	var validMsg = Y.one('#validMsg');
	var invalidMsg = Y.one('#invalidMsg');
	
	var invalidString = invalidMsg.get('value');
	var validString = validMsg.get('value');
	
		
		
		
		if (id.trim() != null && id.trim() != "" && !isNaN(id.trim())) {
			button.set('disabled', false);
			validCheck.set('innerHTML',validString);
			
			button.on("click", function(e) {
				var resultDiv = Y.one("#resultDiv");
				
				var formdiv = Y.one("#formDiv");
				// var failDiv = Y.one("#failDiv");

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

			});
		} else {
			button.set('disabled', true);
			validCheck.set('innerHTML',invalidString);
		}

	});
}