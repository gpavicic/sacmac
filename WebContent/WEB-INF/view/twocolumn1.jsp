<%@ page language="java" contentType="text/html" pageEncoding="utf-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<!--
	Synchronous by TEMPLATED
    templated.co @templatedco
    Released for free under the Creative Commons Attribution 3.0 license (templated.co/license)
-->
<html>
<head>
<title>Synchronous by TEMPLATED</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<link href='http://fonts.googleapis.com/css?family=Lato:300,400,700,900'
	rel='stylesheet' type='text/css'>
<!--[if lte IE 8]><script src="js/html5shiv.js"></script><![endif]-->
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="resources/js/skel.min.js"></script>
<script src="resources/js/skel-panels.min.js"></script>
<script src="resources/js/init.js"></script>


<link rel="stylesheet" href="resources/css/skel-noscript.css" />
<link rel="stylesheet" href="resources/css/style.css" />
<link rel="stylesheet" href="resources/css/style-1000px.css" />
<link rel="stylesheet" href="resources/css/style-desktop.css" />
<link rel="stylesheet" href="resources/css/style-mobile.css" />

</head>
<body>
	<div id="wrapper">

		<!-- Header -->
		<jsp:include page="/WEB-INF/view/header.jsp" />
		<!-- /Header -->

		<div id="page">
			<div class="container">
				<div class="row">
					<div class="3u">
						<section id="sidebard2">
							<header>
								<h2>${msg}</h2>
							</header>
							<ul class="style1">
								<li class="first"><span class="fa fa-check"></span><a
									href="#">Jabuka pita</a></li>
								<li><span class="fa fa-check"></span><a href="#">Višnja
										pita</a></li>
								<li><span class="fa fa-check"></span><a href="#">Bundeva
										pita</a></li>
							</ul>
							<a href="galerija" class="button">Slike</a>
						</section>
					</div>


					<div class="9u skel-cell-important">
						<section id="content">
							<header>
								<h2>${msg}</h2>
							</header>
							<p>Ukoliko poželite bilo koju slatku pitu možemo vam je
								dostaviti ukoliko se nalazi na opštinama sa početne strane.
								Ukoliko niste na pomenutim opštinama cena dostave je 200 din.</p>
							<p>Ukoliko je cena porudžbine veća od 1500 dinara dostava je
								besplatna.</p>

						</section>
					</div>
				</div>

			</div>
		</div>


		<!-- Footer -->
		<jsp:include page="/WEB-INF/view/footer.jsp" />
		<!-- /Footer -->

	</div>
</body>
</html>