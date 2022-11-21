<%@ page pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<html>
	<head>
		<title>책 수정</title>
	</head>
	<body>
		<h1>책 수정</h1>
		<form method="POST">	<!-- 포스트로 전달하지만 아직 받는거 없음 컨트롤러에서 GET은 그냥 표시만 -->
			<p>제목: <input type="text" name="title" value="${data.title }"/></p>
			<p>카테고리: <input type="text" name="category" value="${data.category }"/></p>
			<p>가격: <input type="text" name="price" value="${data.price }"/></p>
			<p><input type="submit" value="저장"/></p>
		</form>
	</body>
</html>