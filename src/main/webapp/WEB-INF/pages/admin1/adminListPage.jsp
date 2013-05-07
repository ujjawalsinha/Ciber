<link href="/Ciber/css/style.css" rel="stylesheet" type="text/css">
<script>

function SelectAllCheckboxes(spanChk){
alert(spanChk.value);

document.url =" ${pageContext.request.contextPath}/confirmDeleteAdmin1?idKey=spanChk.value&";

}
function hideCheckedRows() {
alert(this);
    var checkboxes = document.getElementsByName("chk");
    alert(checkboxes.value);
    var checkboxes_to_remove = new Array();
    var count = 0;
    for (var i = 0; i < checkboxes.length; i++) {
        if (checkboxes[i].checked == true) {
            checkboxes_to_remove[count++] = checkboxes[i];
        }
    }
    for (var i = 0; i < checkboxes_to_remove.length; i++) {
        cbx = checkboxes_to_remove[i];
        // parentNode.parentNode.parentNode is the <tr>
        // parentNode.parentNode is the <td> containing the checkbox
        cbx.parentNode.parentNode.parentNode.removeChild(
                                          cbx.parentNode.parentNode);
    }
}
</script>


<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.admin1-resources"/>


<table width="98%" border="0" style="margin:20px 0 30px 0'">
<tr>
<td class="main-text1"><strong>The following table lists all your admin  accounts .<br/> To edit, highlight a super administrator's name, and  choose the Edit button </strong></td>
<td>
<table border="0">
<tr>
<td><a href="${pageContext.request.contextPath}/newAdmin1" target="main"><img src="/Ciber/images/create_acc.png"  width="120" height="37" border="0"></a></td>
<td><a href="editsale.html" target="main"><img src="/Ciber/images/edit_acc.png" width="120"  height="37" border="0"></a></td>
<td><a href="deactive.html" target="main"><img src="/Ciber/images/dec_acc.png"   width="120" height="37" border="0"></a></td>
<td><a href="javascript:hideCheckedRows(this)" target="main"><img src="/Ciber/images/delete_acc.png"  width="120" height="37" border="0"></a></td>

</tr>
</table>
</td>
</tr>
<tr>
<td colspan="2">

<table width="100%" border="0">
  <tr>
  <td class="theading">Delete </td>
    <td class="theading"><fmt:message key="admin1.id.title"/> </td>
    <td class="theading"><fmt:message key="admin1.username.title"/></td>
    <td class="theading"><fmt:message key="admin1.password.title"/></td>
    <td class="theading"><fmt:message key="admin1.role.title"/></td>
    <td class="theading"><fmt:message key="admin1.location.title"/></td>
    
  </tr>
  <c:forEach items="${admin1s}" var="current" varStatus="i">
  <tr class="trow" onMouseOver="this.className='highlight'" onMouseOut="this.className='trow'">
  <td>
  	<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/deleteAdmin1?idKey=${current.id}&"><img src="images/icons/delete.gif" /></a>
  </td>
    <td>${current.id}</td>
    <td>${current.username}</td>
    <td> ${current.password} </td>
    <td>${current.role}</td>
    <td>${current.location}</td>
    
  </tr>
  </c:forEach>
 
 
</table>
</td>
</tr>
</table>
