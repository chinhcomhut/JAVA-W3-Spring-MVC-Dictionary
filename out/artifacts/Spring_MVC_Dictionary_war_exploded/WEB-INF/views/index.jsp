<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 10/19/2019
  Time: 9:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Input English </title>
</head>
<body>
<h1>Dictionary</h1>
<form method="post"action="/dictionary">
    <fieldset>
        <legend>Input English to translate </legend>
        <label>English:</label>
        <label><input type="text"name="english"placeholder="Enter the word"></label>
        <label><input type="submit"id="submit"value="TRANSLATE"></label>
    </fieldset>
</form>

</body>
</html>
