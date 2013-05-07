<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.admin1-resources"/>

<link href="/Ciber/css/style.css" rel="stylesheet" type="text/css">
<div id="right-content"> 
<div class="wrap-left">
Sales Account: New Sales Accounts</div>
<div id="feed_wraps">
      <div class="feed_image_wraps"><img src="/Ciber/images/feedback.png" width="22" height="18"><br>
      <a href="#">Feedback </a></div>
      <div class="feed_image_wraps"><img src="/Ciber/images/abot.png" width="23" height="18"><br>
      <a href="#">About</a></div>
      <div class="feed_image_wraps"><img src="/Ciber/images/help.png" width="22" height="18"><br>
      <a href="#">Help</a></div>
    </div>

    <div id="inner-right">
   
<form:form action="${pageContext.request.contextPath}/saveAdmin1" method="POST" modelAttribute="admin1">

<table width="98%" border="0" style="margin:0px 0 30px 0">
<tr>
<td class="main-text1"><strong>Use the following form to create a news sales account.<br/> (<span class="star">*</span> indicates a required field ) </strong></td>
<td>
<table border="0" align="right">
<tr>
<td><a href="${pageContext.request.contextPath}/adminlist" target="main"><img src="/Ciber/images/back.png"  width="100" height="32" border="0"></a></td>
<td> &nbsp;</td>
<td><a href="editsale.html" target="main"><img src="/Ciber/images/save.png" width="100"  height="32" border="0"></a></td>
<td> &nbsp;</td>

<td><a href="${pageContext.request.contextPath}/adminlist" target="main"><img src="/Ciber/images/cancel.png"   width="100" height="32" border="0"></a></td>


</tr>
</table>
</td>
</tr>
<tr>
<td colspan="2" bgcolor="#ebebeb">
<div style="height:250px;overflow-y:scroll;">
<table width="100%" border="0" cellspacing="0">
  <tr align="right" valign="top">
    <td>


 <table  border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td align="right" background="/Ciber/images/company.png" width="162">&nbsp;</td>
          <td align="right">&nbsp;</td> 
          <td align="center">( <span class="star">*</span> indicates require field)</td>
          <td align="right" >&nbsp;</td>
        </tr>
        <tr>
          <td align="right" class="main-text">&nbsp;</td>
          <td width="10">&nbsp;</td>
          <td>&nbsp;</td>
        
        </tr>
        <tr>
          <td align="right" class="main-text"><span class="star">*</span>ID</span></td>
          <td>&nbsp;</td>
         
          <td>
          <form:input id="admin1_id" path="id" class="input1"/></td>
          </tr>
          
          
           <tr>
          <td align="right" class="main-text"><span class="star">*</span>UserName</span></td>
          <td>&nbsp;</td>
          <td>
           <form:input id="admin1_username" path="username" class="input1"/></td>
        
          </tr>
          
          
          
          
        <tr class="row_height">
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td align="right" class="main-text"><span class="star">*</span> password: </td>
          <td>&nbsp;</td>
       
           <td>
           <form:input id="admin1_password" path="password" class="input1"/></td>
        </tr>
        <tr class="row_height">
          <td class="row_height">&nbsp;</td>
          <td class="row_height">&nbsp;</td>
          <td class="row_height">&nbsp;</td>
          </tr>
        <tr>
          <td align="right" class="main-text"><span class="star">*</span>Confirm Password: </td>
          <td>&nbsp;</td>
           
         
         
       <td>
           <form:input id="admin1_password" path="password" class="input1"/></td>
          
        </tr>
        <tr class="row_height">
          <td align="right" class="main-text">&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td align="right" class="main-text"><span class="star">*</span>Role</td>
          <td>&nbsp;</td>
         
          
           <td>
           <form:input id="admin1_role" path="role" class="input1"/></td>
         
        </tr>
        <tr class="row_height">
          <td align="right" class="main-text">&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td align="right" class="main-text"><span class="star">*</span>Location </td>
          
          
          <td>&nbsp;</td>
        
          
            <td>
            
           <form:input id="admin1_location" path="location" class="input1"/>
           
           
    </td>
    
   
        </tr>
        
      </table>

</td>
    <td>

 

</td>
</tr>
<span class="inputbutton"><input class="savebutton" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/></span>
			
		</form:form>
		
   
</table>
</div>
</td>
</tr>
</table>
</div>
</div>
