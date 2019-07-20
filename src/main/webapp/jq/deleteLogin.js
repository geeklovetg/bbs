$(function(){
	$("#deleteLogin").click(function(){
		$(this).parent().css("display","none");
		$("#bg").removeClass("mask_layer").css({"width":0+"px","height":0+"px"});
	});
});