<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:choose>
	<c:when test="${isRow==-1}">
		<script>
			alert("ID가 존재하지 않습니다.");
		</script>
	</c:when>
	<c:when test="${isRow==0}">
		<script>
			alert("비밀번호가 맞지 않습니다.");
		</script>
	</c:when>
</c:choose>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="/css/style.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	<title>SIMLE_ログイン</title>
</head>
<body>

	<div class="jumbotron text-center mb-0">
		<h1>ログイン(logo)</h1>
	</div>
	<nav class="navbar navbar-expand-sm bg-danger navbar-dark mb-5">
	</nav>

	<div class="login-con container text-center">
		<form name="login" method="post">
			<input type="text" name="loginId" class="input-field" placeholder="User name or Email" required>
			<input type="password" name="loginPass" class="input-field" placeholder="Enter Password" required>
			<br>
			<div class="login-btn-danger">
				<button class="btn btn-danger btn-lg btn-block" onclick="send()">Login</button>
			</div>
			<button class="login-btn-second btn btn-outline-secondary btn-sm">SIGN UP</button>
			<button class="login-btn-second btn btn-outline-secondary btn-sm">ID/Password 検索</button>
		</form>
	</div>

	<div class="jumbotron text-center mb-0 mt-5">
		<p>Footer</p>
	</div>

</body>
<script>
   function send(){
	login.action="empLogin";
    login.submit();
   }
</script>
</html>



