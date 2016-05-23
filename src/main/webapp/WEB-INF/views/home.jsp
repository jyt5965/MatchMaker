<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="include/head.jsp"></jsp:include>
<link href='/resources/css/loginForm.css' rel='stylesheet'
	type='text/css'>
<style type="text/css">
#bg {
	background-image: url('/resources/img/bg.jpg');
	background-repeat: no-repeat;
	background-position: left top;
	height: 755px;
}
</style>
</head>
<body>
	<jsp:include page="include/nav.jsp"></jsp:include>

	<!-- 배경 -->
	<div id="bg">
		<!-- 로그인 폼 -->
		<div id="login-form">
			<div class="logo">
				<font size="8">
					<b>매치메이커</b>
				</font>
			</div>
			<div class="login-block">
				<h1>로그인</h1>
				<input type="text" value="" placeholder="아이디" id="username" /> <input
					type="password" value="" placeholder="비밀번호" id="password" />
				<div align="center">
					<a href="#" class="btn btn-primary">로그인</a> &nbsp &nbsp &nbsp <a
						href="#" class="btn btn-warning">회원가입</a>
				</div>
			</div>
		</div>
	</div>

	<!-- 본문 -->
	<div class="container-fluid">

		<!-- 여백 맞추기 -->
		<!-- 		<div style="height: 440px;"></div> -->

		<div class="row" style="height: 400px; background-color: #dd4814;">
			<div class="col-md-6 col-md-offset-3">
				<div class="page-header">
					<h1>Test</h1>
				</div>
				<h2>Example body text</h2>
				<p>
					Nullam quis risus eget <a href="#">urna mollis ornare</a> vel eu
					leo. Cum sociis natoque penatibus et magnis dis parturient montes,
					nascetur ridiculus mus. Nullam id dolor id nibh ultricies vehicula.
				</p>
			</div>
		</div>
		<div class="row" style="height: 400px;">
			<div class="col-md-6 col-md-offset-3">
				<div class="page-header">
					<h1>Test</h1>
				</div>
				<h2>Example body text</h2>
				<p>
					Nullam quis risus eget <a href="#">urna mollis ornare</a> vel eu
					leo. Cum sociis natoque penatibus et magnis dis parturient montes,
					nascetur ridiculus mus. Nullam id dolor id nibh ultricies vehicula.
				</p>
			</div>
		</div>
		<div class="row" style="height: 400px; background-color: #efb73e;">
			<div class="col-md-6 col-md-offset-3">
				<div class="page-header">
					<h1>Test</h1>
				</div>
				<h2>Example body text</h2>
				<p>
					Nullam quis risus eget <a href="#">urna mollis ornare</a> vel eu
					leo. Cum sociis natoque penatibus et magnis dis parturient montes,
					nascetur ridiculus mus. Nullam id dolor id nibh ultricies vehicula.
				</p>
			</div>
		</div>

		<jsp:include page="include/footer.jsp"></jsp:include>
	</div>
</body>
</html>