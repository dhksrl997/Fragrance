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
							<li><a href="list?c=m">Men</a></li>
							<li><a href="list?c=w">Women</a></li>
							<li><a href="list?c=u">UNISEX</a></li>
							<li><a href="list?c=s">Solid</a></li>
							<li><a href="list?c=r">Rollerballs</a></li>
						</ul>
					</section>

				</section>
				<section class="banner">
					<div class="banner-slide">
						<img src="../../images/banner2.png" width="1240px" height="500px">
					</div>
					<div class="banner-slide">
						<img src="../../images/dior.png" width="1240px" height="500px">
					</div>
					<div class="banner-slide">
						<img src="../../images/Lancome-Miracle.png" width="1240px"
							height="500px">
					</div>
					<div class="banner-slide">
						<img src="../../images/Dior-JenniferLarwens.jpg" width="1240px"
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
								<c:set var="i" value="${i+1 }"/>
									<tr>
										<td>${i }</td>
										<td class="table-img"><img width="160px" height="140px"
											src="../../images/${list.img }"></td>
										<td><a href="detail?id=${list.itemnums}">${list.name }</a></td>
										<td>${list.brand }</td>
										<td>${list.size }</td>
										<td>${list.scent }</td>
										<fmt:formatNumber type="number" maxFractionDigits="3" value="${list.price }" var="price"/>
										<td>${price }</td>
										<td>${list.maleLike+list.femaleLike}</td>
									</tr>
							</c:forEach>
						</tbody>
					</table>

					<div class="pager">
						<ul>
							<li><a class="orange" href="">1</a></li>
							<li><a href="">2</a></li>
							<li><a href="">3</a></li>
							<li><a href="">4</a></li>
							<li><a href="">5</a></li>
						</ul>
					</div>
				</section>
			</main>