<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<main class="main">
	<section class="content-container category-container">
		<h1 class="d-none">카테고리</h1>
		<section class="sub-menu">
			<h1 class="d-none">서브메뉴</h1>
			<ul>
				<li><a href="list?c=m" class="hide show">Men</a></li>
				<li><a href="list?c=w" class="hide show">Women</a></li>
				<li><a href="list?c=u" class="hide show">UNISEX</a></li>
				<li><a href="list?c=s" class="hide show">Solid</a></li>
				<li><a href="list?c=r" class="hide show">Rollerballs</a></li>
			</ul>
		</section>

	</section>
	<section class="banner">
		<div class="banner-slide">
			<img src="../../../../images/banner/banner2.png" width="1240px"
				height="500px">
		</div>
		<div class="banner-slide">
			<img src="../../../../images/banner/dior.png" width="1240px"
				height="500px">
		</div>
		<div class="banner-slide">
			<img src="../../../../images/banner/BleudeChanel-banner.png"
				width="1240px" height="500px">
		</div>
		<div class="banner-slide">
			<img src="../../../../images/banner/chanel-banner.jpg" width="1240px"
				height="500px">
		</div>

	</section>


	<section class="list">
		<table class="list-table">
			<thead>
				<tr>
					<td>번호</td>
					<td>이미지</td>
					<td>제품명</td>
					<td>브랜드</td>
					<td>용량(ml/g)</td>
					<td>향</td>
					<td>가격</td>
					<td>좋아요</td>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="list" items="${list }">
					<c:set var="i" value="${i+1}" />
					<tr>
						<td>${(param.p*10)-10+i }</td>
						<td class="table-img"><a href="detail?id=${list.itemnums }"><img
								width="160px" height="140px" src="../../images/${list.img }"></a></td>
						<td><a href="detail?id=${list.itemnums}">${list.name }</a></td>
						<td>${list.brand }</td>
						<td>${list.size }</td>
						<td>${list.scent }</td>
						<fmt:formatNumber type="number" maxFractionDigits="3"
							value="${list.price }" var="price" />
						<td>${price }</td>
						<td>${list.maleLike+list.femaleLike}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<div class="pager">
			<ul>

				<c:forEach begin="0" end="5">
					<c:set value="${x+1 }" var="x" />
					<c:if test="${param.p==x }">
						<li><a class="orange" href="list?c=${param.c }&p=${x}">${x }</a></li>
					</c:if>
					<c:if test="${param.p!=x }">
						<li><a href="list?c=${param.c }&p=${x}">${x }</a></li>
					</c:if>
				</c:forEach>
			</ul>
		</div>
	</section>
</main>