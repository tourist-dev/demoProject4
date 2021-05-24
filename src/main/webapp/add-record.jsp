<%--
  Created by IntelliJ IDEA.
  User: sameer
  Date: 24/05/21
  Time: 12:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add record</title>
</head>
<body>
    <form action="add-record" method="post">
        ID: <input type="text" name="id">
        Policy number: <input type="text" name="pnum">
        Policy Effective Date: <input type="text" name="peffdate">
        Policy Expiry Date: <input type="text" name="pexpdate">
        Payment option: <input type="text" name="payment">
        Total Amount: <input type="text" name="total">
        Active: <input type="text" name="active">
        Created Date: <input type="text" name="date">
        <input type="submit">
    </form>
</body>
</html>
