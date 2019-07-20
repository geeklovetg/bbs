
$(function(){
	$("#login_submit").click(function(){
		$.ajax({
		    url:"login.do",//请求的url地址
		    dataType:"json",//返回的格式为json
		    async:true,//请求是否异步，默认true异步，这是ajax的特性
		    data:{"name":$("#name").val(),"pwd":$("#pwd").val()},//参数值
		    type:"POST",//请求的方式
		    success:function(msg){console.log(msg)}//请求成功的处理
		});
	});
});


