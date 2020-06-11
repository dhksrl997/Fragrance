<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<main class="main">
	<section class="content-container result">

		<section class="search-result margin">
			<h1>${param.query }에 대한 향수 검색결과</h1>
			<c:forEach var="i" items="${item }">
				
					<div class="search-item-list">
						<div class="search-img">
							<a href="detail?id=${i.itemnums }"><img src="/images/${i.img }" width="200px" height="200px" alt=""></a>
						</div>
						<div class="search-innerbox">
							<div class="search-item-title"><a href="detail?id=${i.itemnums }"><span class="font-size">품명</span>:${i.name }</a></div>
							<div class="search-item-content"><a href="detail?id=${i.itemnums }"><span class="font-size">소개</span>: ${i.content }, ${i.tag },
								${i.price }, ${i.type}</a></div>
						</div>
					</div>
				
			</c:forEach>
		</section>

		<section class="search-result margin2">
		
			<h1>${param.query }에 대한 기사 검색결과</h1>
			<c:forEach var="c" items="${celeb }" >
				
					<div class="search-item-list2">
						<div class="search-item-title2"><span class="font-size">제목</span>:${c.title }<span class="font-size">작성자</span> : ${c.writerId }</div>
						<div class="search-item-content2"><span class="font-size">소개</span>:${c.content},<br>좋아요 : ${c.like}<br>조회수 : ${c.hit}<br>연예인 : ${c.celeb}</div>
					</div>
				
			</c:forEach>
		</section>
	</section>
</main>

