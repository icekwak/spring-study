/**
 * 
 */
 $(documnet).ready(function(){
	
	// sign-in click
	$("#sing-in").on("click", function(){
		$("#sing-in").attr("href", "/member/signIn")
	});
	
	// sign-up click
	$("#sing-up").on("click", function(){
		$("#sing-up").attr("href", "/member/signUp")
	});
	
	// sign-out click
	$("#sing-out").on("click", function(){
		$("#sing-out").attr("href", "/member/signOut")
	});
	
});