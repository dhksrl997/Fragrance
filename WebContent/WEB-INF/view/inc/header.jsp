<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<header id="header">
		<h1 class="d-none">헤더</h1>

		<section class="header-menu">

			<nav class="search">
				<h1 class="d-none">검색폼</h1>
				<form>
					<fieldset>
						<div>
							<legend class="d-none">검색폼</legend>

							<input type="text" name="query"> <i class="fas fa-search"
								style="z-index: 999px;"> <input class="search-form"
								type="submit" value="검색"></i>
						</div>
					</fieldset>
				</form>
			</nav>

			<nav class="logo">
				<h1>
					<a href="/index"><img src="../../images/logo-img.png" /></a>
				</h1>
			</nav>

			<nav class="member-menu">
				<h1 class="d-none">로그인메뉴</h1>
				<ul>
					<li><a href="/login">로그인</a></li>
					<li><a href="/login">회원가입</a></li>
				</ul>
			</nav>
		</section>

		<section class="main-category">
			<h1 class="d-none">메인 메뉴</h1>
			<nav class="main-menu">
				<h1 class="d-none">메인 메뉴</h1>
				<ul>

					<li><a href="/HTML/rank/rankIndex">Rank</a></li>
					<li><a href="/HTML/celeb/celeb.jsp">Celeb</a></li>
					<li><a href="/HTMl/rec/recomm.jsp">Recomm.</a></li>
				</ul>
			</nav>
		</section>
	</header>