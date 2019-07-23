$(function() {
	setInterval(function(){
		if($(document).scrollTop()>=$(document).height()/2){
			$("#BacktoTop").show();
		}else{
			$("#BacktoTop").hide();
		}
	},100);
	$("#BacktoTop").mouseenter(function(){
		$("#BacktoTop img").fadeOut();
	});
	$("#BacktoTop").mouseleave(function(){
		$("#BacktoTop img").fadeIn();
	});
});