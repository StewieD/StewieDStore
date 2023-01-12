<%@page import="model.KhachHang"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Stewie Store</title>
<link rel="icon" type="image/x.icon"
	href="https://cdn-icons-png.flaticon.com/512/3711/3711392.png">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
	integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js"
	integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V"
	crossorigin="anonymous"></script>
<%
String absolutePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
		+ request.getContextPath();
%>
</head>
<body>
	<!-- Navbar -->
	<%@include file="header.jsp"%>
	<!-- End Navbar -->
	<!-- Page content -->
	<div class="container">
		<div class="row">
			<div class="col-lg-3 ">
				<!-- Menu Left -->
				<%@include file="leftmenu.jsp"%>
				<!-- End Menu Left -->
			</div>
			<div class="col-lg-9">
				<!-- Slider and Product -->
				<div id="carouselExampleIndicators" class="carousel slide"
					data-bs-ride="true">
					<div class="carousel-indicators">
						<button type="button" data-bs-target="#carouselExampleIndicators"
							data-bs-slide-to="0" class="active" aria-current="true"
							aria-label="Slide 1"></button>
						<button type="button" data-bs-target="#carouselExampleIndicators"
							data-bs-slide-to="1" aria-label="Slide 2"></button>
						<button type="button" data-bs-target="#carouselExampleIndicators"
							data-bs-slide-to="2" aria-label="Slide 3"></button>
					</div>
					<div class="carousel-inner">
						<div class="carousel-item active">
							<img src="img/slider/Untitled design (5).png"
								class="d-block w-100" alt="slider">
						</div>
						<div class="carousel-item">
							<img src="img/slider/Untitled design (3).png"
								class="d-block w-100" alt="slider">
						</div>
						<div class="carousel-item">
							<img src="img/slider/Untitled design (4).png"
								class="d-block w-100" alt="slider">
						</div>
					</div>
					<button class="carousel-control-prev" type="button"
						data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
						<span class="carousel-control-prev-icon" aria-hidden="true"></span>
						<span class="visually-hidden">Previous</span>
					</button>
					<button class="carousel-control-next" type="button"
						data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
						<span class="carousel-control-next-icon" aria-hidden="true"></span>
						<span class="visually-hidden">Next</span>
					</button>
				</div>
			</div>
		</div>
		<!-- End Slider and Product -->
		<!-- Product -->

		<div class="row" style="margin-top: 20px;">
			<div class="col-lg-2 col-md-3 mb-4 col-6">
				<div class="card h-80" style="width: 12rem;">
					<img
						src="https://cdn0.fahasa.com/media/catalog/product/n/x/nxbtre_full_29022022_050212.jpg"
						class="card-img-top" alt="...">
					<div class="card-body">
						<h5 class="card-title">Card title</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-outline-dark">More Info</a>
					</div>
				</div>
			</div>
			<div class="col-lg-2 col-md-3 mb-4 col-6 ">
				<div class="card h-80" style="width: 12rem;">
					<img
						src="https://cdn0.fahasa.com/media/catalog/product/q/q/qqqqqb_aghi-ch_p-v_-_-qu_-tr_m-n_m_1_1.jpg"
						class="card-img-top" alt="...">
					<div class="card-body">
						<h5 class="card-title">Card title</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-outline-dark">More Info</a>
					</div>
				</div>
			</div>
			<div class="col-lg-2 col-md-3 mb-4 col-6">
				<div class="card h-80" style="width: 12rem;">
					<img
						src="https://cdn0.fahasa.com/media/catalog/product/c/h/chu-thuat-hoi-chien-_-tap-0---bia-1_2_2.jpg"
						class="card-img-top" alt="...">
					<div class="card-body">
						<h5 class="card-title">Card title</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-outline-dark">More Info</a>
					</div>
				</div>
			</div>
			<div class="col-lg-2 col-md-3 mb-4 col-6">
				<div class="card h-80" style="width: 12rem;">
					<img
						src="https://cdn0.fahasa.com/media/catalog/product/b/i/birdmen---tap-15.jpg"
						class="card-img-top" alt="...">
					<div class="card-body">
						<h5 class="card-title">Card title</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-outline-dark">More Info</a>
					</div>
				</div>
			</div>
			<div class="col-lg-2 col-md-3 mb-4 col-6">
				<div class="card h-80" style="width: 12rem;">
					<img
						src="https://cdn0.fahasa.com/media/catalog/product/k/a/kaguya-sama---cuoc-chien-to-tinh---tap-9.jpg"
						class="card-img-top" alt="...">
					<div class="card-body">
						<h5 class="card-title">Card title</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-outline-dark">More Info</a>
					</div>
				</div>
			</div>
			<div class="col-lg-2 col-md-3 mb-4 col-6">
				<div class="card h-80" style="width: 12rem;">
					<img
						src="https://cdn0.fahasa.com/media/catalog/product/n/x/nxbtre_full_08262022_112614.jpg"
						class="card-img-top" alt="...">
					<div class="card-body">
						<h5 class="card-title">Card title</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-outline-dark">More Info</a>
					</div>
				</div>
			</div>
		</div>
		<!-- End Product -->
	</div>
	<!-- End Page content -->
	<!-- Footer -->
	<jsp:include page="footer.jsp" />
	<!-- End Footer -->
</body>
</html>