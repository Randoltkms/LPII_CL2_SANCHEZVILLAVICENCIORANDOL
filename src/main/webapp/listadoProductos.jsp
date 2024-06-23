<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="java.util.*" %>
    <%@page import="model.TblProductocl2" %>
    
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>
 
  
    
<!DOCTYPE htm>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de Clientes</title>
</head>
<body bgcolor="#c5dec9">
<h1  align="center">Listado de Producto Registrados en BD</h1>

<h2 align="center">
<a href="RegistrarProducto.jsp" style="text-decoration: none;color:blue;">Registrar Producto</a>
</h2>
<table border="2" align="center">

<tr>
<td>NombreProducto</td>
<td>Precio de venta</td>
<td>Precio de compra</td>
<td>Estado de Compra</td>
<td>Describe</td>

<td colspan="2" align="center">Acciones</td>
</tr>

<%
List<TblProductocl2> ListadoProducto=(List<TblProductocl2>)request.getAttribute("listadoproductos");
//aplicamos una condicion..
if(ListadoProducto!=null){
	//aplicamos un bucle for..
	for(TblProductocl2 lis:ListadoProducto){
		%>
		<tr>
		<td><%=lis.getIdproductocl2()%></td>
		<td><%=lis.getNombrecl2() %></td>
		<td><%=lis.getPrecioventacl2() %></td>
		<td><%=lis.getPreciocompcl2() %></td>
		<td><%=lis.getEstadocl2() %></td>
		<td><%=lis.getDescripcl2() %></td>
		
	
	    <td><a href="ControladorProducto?accion=Modificar&cod=<%=lis.getIdproductocl2()%>">Actualizar</a></td>
		
		</tr>
		
		
	<%	
	}   //fin del bucle for...
	%>
	<%
}  //fin de la condicion ...

%>
</table>
</body>
</html>