<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>EMS - Employee Registration</title>
    <style>
        td, th {
            font-family: arial, sans-serif;
        }
    </style>

</head>
<body style="background-color: #FFFFE0;">
<div style="margin-top:50px; margin-left:250px; height:50px;"><h2>Employee <c:out value="${employee.id != null ? 'Update' : 'Registration' }" /></h2></div>
<%--@elvariable id="employee" type=""--%>
<form:form method="POST" modelAttribute="employee" action="/home" name="employee">
    <table style="vertical-align: center; margin-left:20%;">

        <tr>
            <td><form:hidden path="id"/></td>
        </tr>
        <tr>
            <td>First Name :</td>
            <td><form:input path="firstName" id="fname" /></td>
        </tr>
        <tr>
            <td>MIddle Name :</td>
            <td><form:input path="lastName" id="lname"/></td>
        </tr>

        <tr>
            <td>Email Id :</td>
            <td><form:input path="emailId" id="emailId"/></td>
        </tr>
        <tr>
            <td>Call By Name :</td>
            <td><form:input path="favouriteName" /></td>
        </tr>

        <tr>
            <td>Mobile No :</td>
            <td><form:input path="mobileNo" /></td>
        </tr>
        <tr>
            <td>Mobile No2 :</td>
            <td><form:input path="mobileNo2" /></td>
        </tr>

        <tr>
            <td>businessAddress:</td>
            <td><form:input path="businessAddress" /></td>
        </tr>
        <tr>
            <td>residenceAddress:</td>
            <td><form:input path="residenceAddress" /></td>
        </tr>
        <tr>
            <td>websiteAddress:</td>
            <td><form:input path="websiteAddress" /></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="<c:out value="${employee.id != null ? 'Update' : 'Register' }" />"
                                 >&nbsp;&nbsp; <a href="/list">Employee List</a>&nbsp;
                <c:if test="${employee.id ne null}"><b>|</b>&nbsp;<a href="/registration">Registration</a></c:if>
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>
