$(function() {
	var timer;
	$("#login").click(function() {
		clearTimeout(timer);
		timer = setTimeout(function() {
			$("#login").siblings("div").slideToggle();
		}, 200);
	});
});