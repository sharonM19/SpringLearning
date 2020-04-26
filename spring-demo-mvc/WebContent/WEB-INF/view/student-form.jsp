<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<style>
   .error {color:red}
</style>

<body>
<h1>Student Registration Form</h1>


<br><br>
<form:form action="processForm" modelAttribute="student" >
First Name : <form:input path="firstName" />

<br><br>
Last Name(*) : <form:input path="lastName" />
               <form:errors path="lastName" cssClass="error"></form:errors>
<br><br>
Country : <form:select path="country">
             <form:option value="Brazil" label="Brazil" />
             <form:option value="India" label="India" />
             <form:option value="USA" label="USA" />
             <form:option value="UK" label="UK" />

         </form:select>
         
<br><br>

Favourite Lang : 

      Java <form:radiobutton path="favouriteLang" value="Java"/>
      C# <form:radiobutton path="favouriteLang" value="C#"/>
      PHP <form:radiobutton path="favouriteLang" value="PHP"/>

<br><br>

Operating Systems : 
     Linux : <form:checkbox path="operatingSystems" value="Linux"/>
     MAC OS : <form:checkbox path="operatingSystems" value="MAC OS "/>
     MS Windows : <form:checkbox path="operatingSystems" value="MS Windows"/>
     
     
<input type="submit" value="Submit" />

</form:form>
</body>


</html>