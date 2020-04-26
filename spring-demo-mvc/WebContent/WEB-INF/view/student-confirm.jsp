<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<h1>Student Confirmation</h1>

<body>

the student confirmed is ${student.firstName} ${student.lastName}
<br><br>
country selected is ${student.country }
<br><br>
Favourite lang : ${student.favouriteLang }
<br><br>
<ul>
    <c:forEach var="temp" items="${student.operatingSystems}">
        <li> 
        ${temp}
        </li>
    </c:forEach>
</ul>

</body>


</html>