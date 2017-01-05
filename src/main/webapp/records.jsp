<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Records</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <table class="table table-bordered">
        <thead>
        <tr>
            <th>id</th>
            <th>name</th>
            <th>surname</th>
            <th>birthday</th>
            <th>phone number</th>
            <th>mail</th>
            <th>country</th>
            <th>city</th>
        </tr>
        </thead>

        <c:forEach items="${records}" var="record">

            <tr>
                <td>${record.id}</td>
                <td>${record.name}</td>
                <td>${record.surname}</td>
                <td>${record.birthday}</td>
                <td>${record.phoneNumber}</td>
                <td>${record.mail}</td>
                <td>${record.country}</td>
                <td>${record.city}</td>

            </tr>

        </c:forEach>

    </table>

    <form action="add_record.jsp">
        <div class="form-group">
            <button type="submit" class="btn btn-default">Add</button>
        </div>
    </form>
</div>
</body>
</html>