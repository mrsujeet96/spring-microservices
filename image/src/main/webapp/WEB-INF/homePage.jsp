
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<htm >
<head></head>
<body style="background-color: #95f5d0">
<div>
    <div>
        <h3>Upload Multiple Files</h3>
        <form id="uploadFiles" name="uploadFiles" method="post" action="/uploadFiles" encType="multipart/form-data">
            <div><input type="file" name="files" multiple required /></div>
            <div><br></div>
            <div>  <button type="submit"  onclick="gotToHome()"  >Submit</button></div>
        </form>
    </div>

</div>
<div>
    <h3>List of Documents</h3>

    <table>
        <thead>

        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Download Link</th>
        </tr>
        </thead>

        <tbody>

        <c:forEach var="docs" items="${doc }">
            <tr>
                <td>${doc.doc_id}</td>
                <td>${doc.docName}</td>
                <td><a href="/downloadFile/+${doc.id}">Download</a></td>
            </tr>
        </c:forEach>

        </tbody>

    </table>

</div>
</body>


</div>
<script>
    function gotToHome(){
        window.location.href="/downloadFile/{fileId}"
    }
</script>
</htm>


