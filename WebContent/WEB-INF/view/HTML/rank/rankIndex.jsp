<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="../../css/rank/rankstyle.css" type="text/css" rel="stylesheet">
<main class="main">
				<section class="content-container">
					<h1 class="d-none">카테고리</h1>
					<section class="sub-menu">
						<h1 class="d-none">서브메뉴</h1>
						<ul>
							<li><a href="list?c=m">Men</a></li>
							<li><a href="list?c=w">Women</a></li>
							<li><a href="list?c=u">UNISEX</a></li>
							<li><a href="list?c=s">Solid</a></li>
							<li><a href="list?c=r">Rollerballs</a></li>
						</ul>
					</section>

					<section>
						<h1 class="d-none">종목별 카테고리</h1>
						<section class="rank-category">
							<div>Men</div>
							<ul>
								<c:forEach var="i" items="${items }" begin="0" end="0">
									<c:forEach var="i2" items="${i}" begin="0" end="2">
										<li>
											<div>
											<a href="detail?id=${i2.itemnums }">	<img src="../../images/${i2.img }"></a>
											</div>
											<div>${i2.brand }</div>
											<div>${i2.name }</div>
										</li>
									</c:forEach>
								</c:forEach>
							</ul>
						</section>
						<section class="rank-category">
							<div>Women</div>
							<ul>
								<c:forEach var="i" items="${items }" begin="1" end="1">
									<c:forEach var="i2" items="${i}" begin="0" end="2">
										<li>
											<div>
												<img src="../../images/${i2.img }">
											</div>
											<div>${i2.brand }</div>
											<div>${i2.name }</div>
										</li>
									</c:forEach>
								</c:forEach>
							</ul>
						</section>
						<section class="rank-category">
							<div>Unisex</div>
							<ul>
								<c:forEach var="i" items="${items }" begin="2" end="2">
									<c:forEach var="i2" items="${i}" begin="0" end="2">
										<li>
											<div>
												<img src="../../images/${i2.img }">
											</div>
											<div>${i2.brand }</div>
											<div>${i2.name }</div>
										</li>
									</c:forEach>
								</c:forEach>
							</ul>
						</section>
					</section>
				</section>
			</main>