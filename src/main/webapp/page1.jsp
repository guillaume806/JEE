

<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 06/09/2023
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<!-- Test de commentaire HTML -->

<jsp:useBean id="titre" type="java.lang.String" scope="request" />

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ include file="/bootstrapImports.html" %>
    <title>Test 01</title>
</head>
<body>
<main>
    <h1>Test 01</h1>
    <hr>
    <p>
        Merci d'être sur la page de test n°01 !
    </p>
    <hr>
    <p>
        Ceci est la  <%= titre %> avec bootstrap
    </p>
    <hr>

</main>
</body>
</html>
