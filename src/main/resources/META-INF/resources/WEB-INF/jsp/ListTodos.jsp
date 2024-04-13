<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>List of Todos</title>
</head>
<body>
    <h1>Your email is ${email}</h1>
    <h1>Your message is ${todos}</h1>
<c:forEach items="${todos}" var="todo" >
</c:forEach>
</body>
</html>
