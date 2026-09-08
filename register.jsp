<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Profile (JSP)</title>
    <style>
        body { font-family: sans-serif; margin: 30px; background: #f4f4f9; }
        .card { background: white; padding: 20px; border-radius: 8px; box-shadow: 0 2px 4px rgba(0,0,0,0.1); }
        .badge { background: #007bff; color: white; padding: 4px 8px; border-radius: 4px; }
    </style>
</head>
<body>

    <div class="card">
        <h1>User Profile</h1>
        <p><strong>Name:</strong> ${username}</p>
        <p><strong>Role:</strong> <span class="badge">${role}</span></p>

        <h3>Recent Activity</h3>
        <ul>
            <c:forEach var="activity" items="${activities}">
                <li>${activity}</li>
            </c:forEach>
        </ul>
    </div>

</body>
</html>
