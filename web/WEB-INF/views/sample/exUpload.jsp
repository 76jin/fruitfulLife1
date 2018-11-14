<%--
  Created by IntelliJ IDEA.
  User: kjlee
  Date: 2018. 11. 14.
  Time: PM 2:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ExUpload</title>
</head>
<body>
    <form action="/sample/exUploadPost" method="post"
          enctype="multipart/form-data" >

        <div>
            <input type="file" name="files">
        </div>
        <div>
            <input type="file" name="files">
        </div>
        <div>
            <input type="file" name="files">
        </div>
        <div>
            <input type="file" name="files">
        </div>
        <div>
            <input type="file" name="files">
        </div>
        <div>
            <input type="submit">
        </div>

    </form>
</body>
</html>
