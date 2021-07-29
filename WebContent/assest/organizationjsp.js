var $ = jQuery;
$(document).ready(function(){
	$('#add_certificate').click(function(){
		var count = $('#certificatecount').val();
		if(count<=4){
			$('#certificate').append("<br><input type=file name=add["+count+"] size=30>");
			count++;
			$('#certificatecount').val(count);
		}else{
			alert("Can add only 5 certificate");
		}
	});
});