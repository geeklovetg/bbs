$(function() {
	var isEmail = /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
	$("input:not(#register_submit)").blur(function() {
		if ($(this).val() == "") {
			$(this).siblings("span").html("不能为空！");
			$(this).siblings("span").css("visibility", "visible");
			$(this).css("border", "1px solid #f44444");
		} else {
			if ($("#email").val() != "" && !(isEmail.test($("#email").val()))) {
				$("#email").siblings("span").html("邮箱格式错误！");
				$("#email").siblings("span").css("visibility", "visible");
				$("#email").css("border", "1px solid #f44444");
				return;
			}
			$(this).siblings("span").css("visibility", "hidden");
			$(this).css("border", "1px solid #ddd");
		}
	});
});