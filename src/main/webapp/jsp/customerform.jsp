<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<div align="center">
	<h1>Add New Customer</h1>
	<form:form method="post" action="saveCustomer">  
		<table>  
			  <tr>  
			      <td>CustomerId : </td> 
			      <td><form:input path="customerId" /></td>
			  </tr>  
			  <tr>  
			     <td>Customer Name :</td>  
			     <td><form:input path="name" /></td>
			  </tr> 
			  <tr>  
			     <td>Country :</td>  
			     <td><form:input path="country" /></td>
			  </tr> 
			  <tr>  
			     <td>State :</td>  
			     <td><form:input path="state" /></td>
			  </tr> 
			  <tr>  
			     <td>Address :</td>  
			     <td><form:input path="addr" /></td>
			  </tr> 
			  <tr>  
			     <td>Postal Code :</td>  
			     <td><form:input path="postalcode" /></td>
			  </tr> 
			  <tr>  
			     <td>User CId :</td>  
			     <td><form:input path="userId" /></td>
			  </tr> 
			  	  
			  <tr>  
			    <td> </td>  
			    <td><input type="submit" value="Save" /></td>
			 </tr>
				  
		</table>  
	</form:form>  
</div>
<table align="center">
	<tr>
		<td style="font-style: italic; color: blue;">message : ${msg}</td>
	</tr>
</table>
		