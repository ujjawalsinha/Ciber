<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.admin1-resources"/>

<!DOCTYPE html>
<html lang="en">
<head>
	
	<meta charset="utf-8">
	<title>Cadreon Audience Marketplace</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="Cadreon Audience Marketplace.">
	<meta name="author" content="Cadreon">

	<!-- The styles -->
	<link id="bs-css" href="/Ciber/css/bootstrap-cerulean.css" rel="stylesheet">
	<style type="text/css">
	  body {
		padding-bottom: 40px;
	  }
	  .sidebar-nav {
		padding: 9px 0;
	  }
	</style>
	<link href="/Ciber/css/bootstrap-responsive.css" rel="stylesheet">
	<link href="/Ciber/css/charisma-app.css" rel="stylesheet">
	<link href="/Ciber/css/jquery-ui-1.8.21.custom.css" rel="stylesheet">
	<link href='/Ciber/css/fullcalendar.css' rel='stylesheet'>
	<link href='/Ciber/css/fullcalendar.print.css' rel='stylesheet'  media='print'>
	<link href='/Ciber/css/chosen.css' rel='stylesheet'>
	<link href='/Ciber/css/uniform.default.css' rel='stylesheet'>
	<link href='/Ciber/css/colorbox.css' rel='stylesheet'>
	<link href='/Ciber/css/jquery.cleditor.css' rel='stylesheet'>
	<link href='/Ciber/css/jquery.noty.css' rel='stylesheet'>
	<link href='/Ciber/css/noty_theme_default.css' rel='stylesheet'>
	<link href='/Ciber/css/elfinder.min.css' rel='stylesheet'>
	<link href='/Ciber/css/elfinder.theme.css' rel='stylesheet'>
	<link href='/Ciber/css/jquery.iphone.toggle.css' rel='stylesheet'>
	<link href='/Ciber/css/opa-icons.css' rel='stylesheet'>
	<link href='/Ciber/css/uploadify.css' rel='stylesheet'>

	<!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
	<!--[if lt IE 9]>
	  <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	<![endif]-->

	<!-- The fav icon -->
	<link rel="shortcut icon" href="img/favicon.ico">
		
</head>

<body>
		<!-- topbar starts -->
	<div class="navbar">
		<div class="navbar-inner">
			<div class="container-fluid">
				<a class="btn btn-navbar" data-toggle="collapse" data-target=".top-nav.nav-collapse,.sidebar-nav.nav-collapse">
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</a>
				<a class="brand" href="index.html"> <img alt="Charisma Logo" src="img/logo20.png" /> <span>Cadreon Audience Marketplace</span></a>
				
				<!-- theme selector starts -->
				<div class="btn-group pull-right theme-container" >
					<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
						<i class="icon-tint"></i><span class="hidden-phone"> Change Theme / Skin</span>
						<span class="caret"></span>
					</a>
					<ul class="dropdown-menu" id="themes">
						<li><a data-value="classic" href="#"><i class="icon-blank"></i> Classic</a></li>
						<li><a data-value="cerulean" href="#"><i class="icon-blank"></i> Cerulean</a></li>
						<li><a data-value="cyborg" href="#"><i class="icon-blank"></i> Cyborg</a></li>
						<li><a data-value="redy" href="#"><i class="icon-blank"></i> Redy</a></li>
						<li><a data-value="journal" href="#"><i class="icon-blank"></i> Journal</a></li>
						<li><a data-value="simplex" href="#"><i class="icon-blank"></i> Simplex</a></li>
						<li><a data-value="slate" href="#"><i class="icon-blank"></i> Slate</a></li>
						<li><a data-value="spacelab" href="#"><i class="icon-blank"></i> Spacelab</a></li>
						<li><a data-value="united" href="#"><i class="icon-blank"></i> United</a></li>
					</ul>
				</div>
				<!-- theme selector ends -->
				
				<!-- user dropdown starts -->
				<div class="btn-group pull-right" >
					<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
						<i class="icon-user"></i><span class="hidden-phone"> admin</span>
						<span class="caret"></span>
					</a>
					<ul class="dropdown-menu">
						<li><a href="#">Profile</a></li>
						<li class="divider"></li>
						<li><a href="login.html">Logout</a></li>
					</ul>
				</div>
				<!-- user dropdown ends -->
				
				<div class="top-nav nav-collapse">
					<ul class="nav">
						<li><a href="#">Visit Site</a></li>
						<li>
							<form class="navbar-search pull-left">
								<input placeholder="Search" class="search-query span2" name="query" type="text">
							</form>
						</li>
					</ul>
				</div><!--/.nav-collapse -->
			</div>
		</div>
	</div>
	<!-- topbar ends -->
		<div class="container-fluid">
		<div class="row-fluid">
				
			<!-- left menu starts -->
			<div class="span2 main-menu-span">
				<div class="well nav-collapse sidebar-nav">
					<ul class="nav nav-tabs nav-stacked main-menu">
						<li class="nav-header hidden-tablet">Main</li>
						<li><a class="ajax-link" href="main.jsp"><i class="icon-home"></i><span class="hidden-tablet"> Dashboard</span></a></li>
						<li class="nav-header hidden-tablet">Admin</li>
						<li><a class="ajax-link" href="${pageContext.request.contextPath}/AdminList"><i class="icon-align-justify"></i><span class="hidden-tablet"> Admin List</span></a></li>
						<li><a class="ajax-link" href="${pageContext.request.contextPath}/AdminEdit"><i class="icon-align-justify"></i><span class="hidden-tablet">Admin CRUD</span></a></li>
						<li><a href="error.html"><i class="icon-ban-circle"></i><span class="hidden-tablet"> Error Page</span></a></li>
						
					</ul>
					<label id="for-is-ajax" class="hidden-tablet" for="is-ajax"><input id="is-ajax" type="checkbox"> Ajax on menu</label>
				</div><!--/.well -->
			</div><!--/span-->
			<!-- left menu ends -->
			
			<noscript>
				<div class="alert alert-block span10">
					<h4 class="alert-heading">Warning!</h4>
					<p>You need to have <a href="http://en.wikipedia.org/wiki/JavaScript" target="_blank">JavaScript</a> enabled to use this site.</p>
				</div>
			</noscript>
			
			<div id="content" class="span10">
			<!-- content starts -->
			

			<div>
				<ul class="breadcrumb">
					<li>
						<a href="#">Home</a> <span class="divider">/</span>
					</li>
					<li>
						<a href="#">Dashboard</a>
					</li>
				</ul>
			</div>
			
			<div class="row-fluid">
				<div class="box span12">
					<div class="box-header well">
						<h2><i class="icon-info-sign"></i> Introduction</h2>
						<div class="box-icon">
							<a href="#" class="btn btn-setting btn-round"><i class="icon-cog"></i></a>
							<a href="#" class="btn btn-minimize btn-round"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
						<h1>Cadreon</h1>
						<p> creates new custom marketplace by aggregationg immense amonts of Premium through nice perperties into liquid 
inventory pools ,incorporating virtually any source of electronaclly avaialble inventory
</p>
						
						
						<p class="center">
							
						</p>
						<div class="clearfix"></div>
					</div>
				</div>
			</div>
					
			
						
						
			
			
		<hr>

		<div class="modal hide fade" id="myModal">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">×</button>
				<h3>Settings</h3>
			</div>
			<div class="modal-body">
				<p>Here settings can be configured...</p>
			</div>
			<div class="modal-footer">
				<a href="#" class="btn" data-dismiss="modal">Close</a>
				<a href="#" class="btn btn-primary">Save changes</a>
			</div>
		</div>

		<footer>
			<p class="pull-left">&copy; <a href="http://usman.it" target="_blank">Cadreon Audience Marketplace</a> 2013</p>
			<p class="pull-right">Powered by: <a href="http://usman.it/free-responsive-admin-template">Cadreon</a></p>
		</footer>
		
	</div><!--/.fluid-container-->

	<!-- external javascript
	================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->

	<!-- jQuery -->
	<script src="/Ciber/js/jquery-1.7.2.min.js"></script>
	<!-- jQuery UI -->
	<script src="/Ciber/js/jquery-ui-1.8.21.custom.min.js"></script>
	<!-- transition / effect library -->
	<script src="/Ciber/js/bootstrap-transition.js"></script>
	<!-- alert enhancer library -->
	<script src="/Ciber/js/bootstrap-alert.js"></script>
	<!-- modal / dialog library -->
	<script src="/Ciber/js/bootstrap-modal.js"></script>
	<!-- custom dropdown library -->
	<script src="/Ciber/js/bootstrap-dropdown.js"></script>
	<!-- scrolspy library -->
	<script src="/Ciber/js/bootstrap-scrollspy.js"></script>
	<!-- library for creating tabs -->
	<script src="/Ciber/js/bootstrap-tab.js"></script>
	<!-- library for advanced tooltip -->
	<script src="/Ciber/js/bootstrap-tooltip.js"></script>
	<!-- popover effect library -->
	<script src="/Ciber/js/bootstrap-popover.js"></script>
	<!-- button enhancer library -->
	<script src="/Ciber/js/bootstrap-button.js"></script>
	<!-- accordion library (optional, not used in demo) -->
	<script src="/Ciber/js/bootstrap-collapse.js"></script>
	<!-- carousel slideshow library (optional, not used in demo) -->
	<script src="/Ciber/js/bootstrap-carousel.js"></script>
	<!-- autocomplete library -->
	<script src="/Ciber/js/bootstrap-typeahead.js"></script>
	<!-- tour library -->
	<script src="/Ciber/js/bootstrap-tour.js"></script>
	<!-- library for cookie management -->
	<script src="/Ciber/js/jquery.cookie.js"></script>
	<!-- calander plugin -->
	<script src='/Ciber/js/fullcalendar.min.js'></script>
	<!-- data table plugin -->
	<script src='/Ciber/js/jquery.dataTables.min.js'></script>

	<!-- chart libraries start -->
	<script src="/Ciber/js/excanvas.js"></script>
	<script src="/Ciber/js/jquery.flot.min.js"></script>
	<script src="/Ciber/js/jquery.flot.pie.min.js"></script>
	<script src="/Ciber/js/jquery.flot.stack.js"></script>
	<script src="/Ciber/js/jquery.flot.resize.min.js"></script>
	<!-- chart libraries end -->

	<!-- select or dropdown enhancer -->
	<script src="/Ciber/js/jquery.chosen.min.js"></script>
	<!-- checkbox, radio, and file input styler -->
	<script src="/Ciber/js/jquery.uniform.min.js"></script>
	<!-- plugin for gallery image view -->
	<script src="/Ciber/js/jquery.colorbox.min.js"></script>
	<!-- rich text editor library -->
	<script src="/Ciber/js/jquery.cleditor.min.js"></script>
	<!-- notification plugin -->
	<script src="/Ciber/js/jquery.noty.js"></script>
	<!-- file manager library -->
	<script src="/Ciber/js/jquery.elfinder.min.js"></script>
	<!-- star rating plugin -->
	<script src="/Ciber/js/jquery.raty.min.js"></script>
	<!-- for iOS style toggle switch -->
	<script src="/Ciber/js/jquery.iphone.toggle.js"></script>
	<!-- autogrowing textarea plugin -->
	<script src="/Ciber/js/jquery.autogrow-textarea.js"></script>
	<!-- multiple file upload plugin -->
	<script src="/Ciber/js/jquery.uploadify-3.1.min.js"></script>
	<!-- history.js for cross-browser state change on ajax -->
	<script src="/Ciber/js/jquery.history.js"></script>
	<!-- application script for Charisma demo -->
	<script src="/Ciber/js/charisma.js"></script>
	
		
</body>
</html>
