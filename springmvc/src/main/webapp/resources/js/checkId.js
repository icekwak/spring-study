/**
 * 
 */
$(document).ready(function(){
	var idc = 1; // 아이디 중복 = 1, 사용 가능한 아이디 = 0
	
	$("#user_id").on("focus", function(){
		idc = 1;
		$("#IDchk_0").hide();
		$("#IDchk_1").hide();
	});
	
	// 아이디 중복확인
	$("#user_id").on("blur", function(){
		
		var user_id = $("#user_id").val();
		
		$.ajax({
			type: "POST",
			url: "/member/api/listId",
			data: user_id,
			contentType: "application/json; charset=utf-8",
			dataType: "json",
			success: function(response){
				
				if(response === 1){
					idc = 1;
					$("#IDchk_1").show();
				}else{
					idc = 0;
					$("#IDchk_0").show();
				}
				
			},
			error: function(){
				alert("error checkId.js");
			}
		});
		
	});
    
});