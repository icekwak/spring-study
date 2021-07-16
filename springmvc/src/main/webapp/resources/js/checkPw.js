/**
 * 
 */
$(document).ready(function(){
	var pwc = 1; // 비밀번호 유효성 검사 불통 = 1, 통과 = 0
	var eqpw = 1; // 비밀번호 불일치 = 1, 일치 = 0
	
	// 비밀번호 유효성 검사
	$(".user_pw").on("keyup", function(){
		
		var user_pw = $(this).val();
		
		$.ajax({
			type: "POST",
			url: "/member/api/checkPw",
			data: user_pw,
			contentType: "application/json; charset=utf-8",
			dataType: "json",
			success: function(response){
				
				if(response === 1){
					pwc = 1;
					$("#PWchk").show();
				}else{
					pwc = 0;
					$("#PWchk").hide();
				}
				
			},
			error: function(){
			}
		});
		
	});
	
	$(".user_pw").on("focus", function(){
		eqpw = 1;
		$("#eqPw_0").hide();
		$("#eqPw_1").hide();
	});
	
	// 비밀번호 일치 검사
	$("#user_pw2").on("blur", function(){
		
		var user_pw1 = $("#user_pw1").val();
		var user_pw2 = $("#user_pw2").val();
		
		if(user_pw1 === user_pw2){
			eqpw = 0;
			$("#eqPw_0").show();
		}else{
			eqpw = 1;
			$("#eqPw_1").show();
		}
		
	});
    
});