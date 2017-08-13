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
					<div class="12u">
						<section id="content">
							<div class="img">
								<img src="<c:url value="/resources/images/hot-tea.jpg"/>"
									height="600" width="400" alt="Topli napici" />

								<div class="desc">Topla domaća kafa</div>
							</div>

							<div class="img">
								<img src="<c:url value="/resources/images/krompir.jpg"/>"
									height="600" width="400" alt="Pita od krompira" />

								<div class="desc">Slana pita od krompira</div>
							</div>
							<div class="img">
								<img src="<c:url value="/resources/images/pieblack.jpg"/>"
									height="300" width="400" alt="Pita sa višnjama" />

								<div class="desc">Pita sa višnjama </div>
							</div>

							<div class="img">
								<img src="<c:url value="/resources/images/mleko1.jpg"/>"
									height="600" width="400" alt="Jogurt" />

								<div class="desc">Jogurt</div>
							</div>

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