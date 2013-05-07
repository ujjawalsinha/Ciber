<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Cadreon Audience Marketplace</title>
<link href="/Ciber/css/style.css" rel="stylesheet" type="text/css">
<script src="SpryAssets/SpryTabbedPanels.js" type="text/javascript"></script>
<link href="SpryAssets/SpryTabbedPanels.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="js/jquery.min.js"></script>

<script type="text/javascript" src="js/ddaccordion.js">

/***********************************************
* Accordion Content script- (c) Dynamic Drive DHTML code library (www.dynamicdrive.com)
* Visit http://www.dynamicDrive.com for hundreds of DHTML scripts
* This notice must stay intact for legal use
***********************************************/

</script>

<script type="text/javascript">

ddaccordion.init({
	headerclass: "headerbar", //Shared CSS class name of headers group
	contentclass: "submenu", //Shared CSS class name of contents group
	revealtype: "mouseover", //Reveal content when user clicks or onmouseover the header? Valid value: "click", "clickgo", or "mouseover"
	mouseoverdelay: 100, //if revealtype="mouseover", set delay in milliseconds before header expands onMouseover
	collapseprev: true, //Collapse previous content (so only one open at any time)? true/false
	defaultexpanded: [7], //index of content(s) open by default [index1, index2, etc] [] denotes no content
	onemustopen: false, //Specify whether at least one header should be open always (so never all headers closed)
	animatedefault: false, //Should contents open by default be animated into view?
	persiststate: true, //persist state of opened contents within browser session?
	toggleclass: ["", "selected"], //Two CSS classes to be applied to the header when it's collapsed and expanded, respectively ["class1", "class2"]
	togglehtml: ["", "", ""], //Additional HTML added to the header when it's collapsed and expanded, respectively  ["position", "html1", "html2"] (see docs)
	animatespeed: "normal", //speed of animation: integer in milliseconds (ie: 200), or keywords "fast", "normal", or "slow"
	oninit:function(headers, expandedindices){ //custom code to run when headers have initalized
		//do nothing
	},
	onopenclose:function(header, index, state, isuseractivated){ //custom code to run whenever a header is opened or closed
		//do nothing
	}
})

</script>

<style type="text/css">

.urbangreymenu{
width: 200px; /*width of menu*/
float:left;
margin-left:-10px;
}

.urbangreymenu .headerbar{
font: bold 13px Verdana;
color: white;
 no-repeat 8px 10px;/*last 2 values are the x and y coordinates of bullet image*/
margin-bottom: 0; /*bottom spacing between header and rest of content*/
margin-top: 1px; /*bottom spacing between header and rest of content*/
text-transform: uppercase;
/*background:url(images/hover_tab.jpg) no-repeat;
*/
background:url(images/left_menu2.jpg);
height:35px;
padding: 7px 0 7px 0px; /*31px is left indentation of header text*/
}

.urbangreymenu .headerbar a{
text-decoration: none;
color:#FFF;
background:url(images/left_menu2.jpg);
/*background:url(images/hover_tab.jpg) no-repeat;
*/
height:25px;
display: block;

margin:0px 0px 0px -30px; padding:15px 25px  18px -10px;
}

.urbangreymenu ul{
list-style-type: none;
background-color:#F60;
margin-left:-30px;float:left;
padding: 0; width:225px;
margin-bottom: 0; /*bottom spacing between each UL and rest of content*/
}

.urbangreymenu ul li{
 /*bottom spacing between menu items*/
margin-left:10px;

}

.urbangreymenu ul li a{
font: normal 13px Arial;
color: black;
display: block;
padding: 5px 0;
background-color:#FC9;
padding-left: 8px; /*link text is indented 8px*/
text-decoration: none;
}

.urbangreymenu ul li a:visited{
color: #000000;
}

.urbangreymenu ul li a:hover{ /*hover state CSS*/
color:#FFF;
/*background:url(images/hover_tab.jpg) no-repeat;
*/
background-color:#F90;
font-style:italic;
}

</style>


</head>

<body>

<div id="main">
  <div id="header">
  <div id="header_center">
    <div id="header_left">
      <div id="logo"><a href="index.html"><img src="images/loginleft.jpg" width="397" height="98" border="0"></a></div>
    </div>
    <div id="header_right">
      <div id="right-head"><img src="images/loginleft.png" width="180" height="98" border="0"></div>
    </div>
    <div id="menu-tab">
      <div class="menutext">Welcome: ujjawal.sinha@map-global.com</div>
      <div class="menutext">You are logged in as: Ciber Super Administrator</div>
      <div id="right-menu"><a href="#"><img src="images/home_button.png" width="76" height="37" border="0"></a><a href="#"><img src="images/logout.png" width="87" height="37" border="0"></a></div>
    </div>
    </div>
  </div>
  <div id="inner-main-bg">
    <div id="left_menu_wraps">
      <div id="left_menu_tab"></div>
      <div id="left_menu_bg"><span class="left_headtext">Please select a task below:</span>
        <div class="left_inner"><ul>
		
		
		
           
            <div class="urbangreymenu">
          <span class="headerbar"><a href="${pageContext.request.contextPath}/adminlist" target="main"><img src="images/accounts.png" width="28" height="24" border="0" style="margin-right:10px;">Admin</a></span>
          <ul class="submenu">
            <li><a href="${pageContext.request.contextPath}/adminlist" target="main">Maintenance</a></li>
            
            
            <li><a href="#">Refresh ST IO Spent table</a></li>
            <li><a href="#">Load File</a></li>
			<li><a href="#">RT Mapping</a></li>
			<li><a href="#">Review error record</a></li>
			
			
			<li><a href="${pageContext.request.contextPath}/tranSearch" target="main">MTD IO Spend Report </a></li>
			     
          </ul>
		  
		  
		  
		  
             <span class="headerbar"><a href="#"></a></span>
          <ul class="submenu">
           
           
          </ul>
          
        </div>
              <br />




        </ul>
        
        
        </div>
        <div id="left_copywraps">
        <div align="center"> <a href="#"><img src="images/tech_support.png" width="120" height="25" border="0"></a></div>
<br>
         <div align="center"> Copyright 2013 Cadreon LLC.<br>
 Ciber Oracle Version  V_1.0</div>
        </div>
      </div>
      <div id="left_menu_fot"></div>
    </div>
   
<iframe src="${pageContext.request.contextPath}/adminlist" style="width:80%;height:450px;background-image:none;background-color:#ffffff;float:right;"   frameborder="0"  scrolling="no" name="main">
</iframe>
   
</div>
</div>
</div>
<script type="text/javascript">
var TabbedPanels1 = new Spry.Widget.TabbedPanels("TabbedPanels1");
</script>
</body>
</html>
