<%@ page language="java" contentType="text/html" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-2">
<title></title>
</head>
<body>

	<!-- Footer Wrapper -->
	<div id="footer-wrapper">
		<footer id="footer" class="container">
		<div class="row">
			<div class="3u">
				<img src="<c:url value="/resources/images/hot-tea.jpg"/>"
					height="330" width="300" />
			</div>
			<div class="6u">
				<!-- About -->
				<section> <a href="welcome" id="logo"> <%-- <h2>
						<img src="<c:url value="/resources/images/pieblack.jpg "/>"
							height="75" width="75" />
					</h2> --%>
				</a> <!-- <a href="index" class="button alt icon fa-arrow-circle-right">Početak
					stranice </a> --> </section>

				<!-- Contact -->
				<section>
				<h2>SAČ MAČ</h2>
				<div>
					<div class="row">
						<div class="6u">
							<dl class="contact">
								<!-- <dt>Twitter</dt>
								<dd>
									<a href="#">sacmac@sacmac.rs</a>
								</dd> -->
								<dt>Facebook</dt>
								<dd>
									<a href="#">facebook.com/sacmac</a>
								</dd>
								<dt>Email</dt>
								<dd>
									<a href='mailto:office@sacmac.rs'>office@sacmac.rs</a>
								</dd>
							</dl>
						</div>
						<div class="6u">
							<dl class="contact">
								<dt>Adresa</dt>
								<dd>
									Neka Adresa 80 <br /> 11070 Beograd, Srbija<br />

								</dd>
								<dt>Tel</dt>
								<dd>+381 11 563 799999</dd>
							</dl>
						</div>
					</div>
				</div>
				</section>

			</div>
		</div>
		</footer>
	</div>

	<!-- Copyright -->
	<div id="copyright">
		<div class="container">
			&copy; Sač mač <a href='mailto:office@sacmac.rs'>office@sacmac.rs</a>
		</div>
	</div>
</body>
</html>