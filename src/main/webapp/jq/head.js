$(function(){
	var width=document.body.clientWidth;
	var height=document.body.clientHeight;
	$("#navigation ul li").click(function(){
		$("#navigation ul li").removeClass("navigation_border");
		$("#seek").removeClass("navigation_border");
		$(this).addClass("navigation_border").siblings("li").removeClass("navigation_border");
		$("#seek").removeClass("navigation_border");
	});
	$("#login").click(function(){
		$("#deleteLogin").parent().css("display","block");
		$("#bg").addClass("mask_layer").css({"width":width+"px","height":height+"px"});
	});
	$("#bg").click(function(){
		$("#deleteLogin").parent().css("display","none");
		$(this).removeClass("mask_layer").css({"width":0+"px","height":0+"px"});
	});
	var timer;
	$("#ui").click(function(){
		clearTimeout(timer);
		timer=setTimeout(function(){
			$("#ui").siblings("div").css("width",$("#ui").width()+"px").slideToggle();
		},200);
	});
	
});