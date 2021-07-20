/**
 * 
 */
 $(document).ready(function(){
	
	// 닉네임 검사
	$("#name").on("focus", function(){
		$("#name-text").text("한글, 영어 대소문자, 숫자만 입력 가능합니다. (글자수 2-10)");
		$("#name-text").css("color", "gray");
	});
	
	$("#name").on("blur", function(){
		var name = $("#name").val();
		
		if(name != ""){
			$.ajax({
				type: "POST",
				url: "/user/api/nameCheck",
				data: name,
				contentType: "application/json; charset=utf-8",
				dataType: "json",
				success: function(chk){
					if(chk === 0){
						$("#name-text").text("사용 가능");
						$("#name-text").css("color", "green");
					}
					else if(chk === -1){
						$("#name-text").text("한글, 영어 대소문자, 숫자만 입력 가능합니다. (글자수 2-10)");
						$("#name-text").css("color", "gray");
					}
					else{
						$("#name-text").text("중복 사용 불가능");
						$("#name-text").css("color", "red");
					}
				},
				error: function(e){
					alert("[nameCheck error]\n" + e);
				}
			});
		}else{
			$("#name-text").text("한글, 영어 대소문자, 숫자만 입력 가능합니다. (글자수 2-10)");
			$("#name-text").css("color", "gray");
		}
	});
	
	// 비밀번호 표시
	$("#password-show").on("click", function(){
		var chkbox = $('input:checkbox[id="password-show"]').is(":checked");
		
		if(chkbox){
			$(".password").attr("type", "text");
		}else{
			$(".password").attr("type", "password");
		}
	});
	
	// 비밀번호 검사
	$(".password").on("focus", function(){
		$("#password-chk-text").text("영어 대소문자, 숫자, 특수문자(@,$,!,%,*,#,?)를 포함하여 작성 (글자수 6-18)");
		$("#password-chk-text").css("color", "gray");
	});
	
	$(".password").on("blur", function(){
		var password = $("#password").val();
		var password_chk = $("#password-chk").val();
		
		if(password != "" && password_chk != ""){
			var password_list = {"pwd" : password, "pwd_chk" : password_chk};
			$.ajax({
				type: "POST",
				url: "/user/api/passwordCheck",
				data: password_list,
				dataType: "json",
				success: function(chk){
					if(chk === 0){
						$("#password-chk-text").text("비밀번호 일치");
						$("#password-chk-text").css("color", "green");
					}
					else if(chk === -1){
						$("#password-chk-text").text("영어 대소문자, 숫자, 특수문자(@,$,!,%,*,#,?)를 포함하여 작성 (글자수 6-18)");
						$("#password-chk-text").css("color", "gray");
					}
					else{
						$("#password-chk-text").text("비밀번호 불일치");
						$("#password-chk-text").css("color", "red");
					}
				},
				error: function(e){
					alert("[passwordCheck error]\n" + e);
				}
			});
		}else{
			$("#password-chk-text").text("영어 대소문자, 숫자, 특수문자(@,$,!,%,*,#,?)를 포함하여 작성 (글자수 6-18)");
			$("#password-chk-text").css("color", "gray");
		}
	});
	
	// 이메일 유효성 및 중복 검사 및
	$("#btn-email-send").on("click", function(){
		var email = $("email").val();
		
		if(email != null){
			$.ajax({
				type: "POST",
				url: "/user/api/emailCheck",
				data: email,
				contentType: "application/json; charset=utf-8",
				dataType: "json",
				success: function(chk){
					if(chk === 0){
						$("#email-chk-text").text("인증번호를 발송하였습니다.");
						$("#email-chk-text").css("color", "green");
					}
					else if(chk === -1){
						$("#email-chk-text").text("이메일 형식을 제대로 적어주세요.");
						$("#email-chk-text").css("color", "gray");
					}
					else{
						$("#email-chk-text").text("이메일 중복");
						$("#email-chk-text").css("color", "red");
					}
				},
				error: function(e){
					alert("[emailCheck error]\n" + e);
				}
			});
		}else{
			$("#email-chk-text").text("이메일 형식을 제대로 적어주세요.");
			$("#email-chk-text").css("color", "gray");
		}
		
	});
	
});