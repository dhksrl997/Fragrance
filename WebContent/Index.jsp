<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="/css/reset.css" type="text/css" rel="stylesheet">
    <link href="/css/style.css" type="text/css" rel="stylesheet">
    <title>Fragrance</title>
</head>

<body>
    <!-- -----header menu------------------------------- -->
    <header id="header">
        <section class="header-menu">
            <div class="content-container">
            
                <nav class="search">
                    <h1 class="d-none">검색폼</h1>
                    <form >
                        <fieldset>
                            <div>
                                <legend class="d-none">검색폼</legend>
                                <label>검색</label>
                                <input type="text" name="query">
                                <input type="submit" value="검색">
                            </div>
                        </fieldset>
                    </form>
                </nav>

                <nav class="logo">
                    <h1><a href="/Index"><img src="/images/logo.png"/></a></h1>
                </nav>

                <nav class="member-menu">
                    <h1 class="d-none">로그인메뉴</h1>
                    <ul>
                        <li><a href="">로그인</a></li>
                        <li><a href="">회원가입</a></li>
                    </ul>
                </nav>
            </div>

            <section>
                <h1 class="d-none">메인 메뉴</h1>
                <nav class="main-menu">
                    <h1 class="d-none">메인 메뉴</h1> 
                    <ul>
                        <li><a href="/HTML/rank/rankIndex">Rank</a></li>
                        <li><a href="/HTML/celeb/celeb.html">Celeb</a></li>
                        <li><a href="/HTML/rec/recomm.html">Recomm.</a></li>
                    </ul>
                </nav>
            </section>
        </section>
    </header>
    <!-- --------main banner------------------------------- -->
    <div id="banner">
       <section class="banner-container">
            <h1 class="d-none">banner</h1>
            <img src="/images/MissDior banner.png">   
        </section>
    </div>

    <!-- -------------main------------------------------- -->
    <div id="body">
        <main class="main">
            <h1 class="d-none">카테고리</h1>
          

            <section class="best-item">
                <h1 class="d-none">popularity menu</h1>
                <div>
                    <div>
                    <h2>men 1st item</h2>
                        <section class="best-item-m">
                                <div> <img src= "https://cdn.aritaum.com/UPLOAD/UPLOAD_IMAGE/C020/201904/IMG1556gAJ609870501.jpg?quality=80">
                                    <ul>
                                        <li>상품명: 아티산 블루 EDT</li>
                                        <li>브랜드: 존바바토스</li>
                                        <li>설명:NO.1 남성향수 존바바토스 아티산의 후속작</li>
                                    </ul>
                                </div>
                        </section>
                    </div>
                    <div>
                    <h2>women 1st item</h2>
                        <section class="best-item-w">
                            <div> <img src= "https://cdn.aritaum.com/UPLOAD/UPLOAD_IMAGE/C020/201904/IMG1556YsE612697039.jpg?quality=80">
                                <ul>
                                    <li>상품명: 에끌라 드 아르페쥬 EDP</li>
                                    <li>브랜드: 랑방</li>
                                    <li>설명: 오랜 시간 동안 사랑을 받아오고 있는 대표 향수</li>
                                </ul>
                            </div>
                        </section>
                    </div>
                </div>
                <div>  
                    <div>
                    <h2>Unisex item</h2>
                        <section class="best-item-u">
                            <div> <img src= "https://cdn.aritaum.com/UPLOAD/UPLOAD_IMAGE/C020/201904/IMG1556YsE612697039.jpg?quality=80">
                                <ul>
                                    <li>상품명: 에끌라 드 아르페쥬 EDP</li>
                                    <li>브랜드: 랑방</li>
                                    <li>설명: 오랜 시간 동안 사랑을 받아오고 있는 대표 향수</li>
                                </ul>
                            </div>
                        </section>
                    </div>
                    <div>
                    <h2>etc item</h2>
                        <section class="best-item-e">
                            <div> <img src= "https://cdn.aritaum.com/UPLOAD/UPLOAD_IMAGE/C020/201904/IMG1556YsE612697039.jpg?quality=80">
                                <ul>
                                    <li>상품명: 에끌라 드 아르페쥬 EDP</li>
                                    <li>브랜드: 랑방</li>
                                    <li>설명: 오랜 시간 동안 사랑을 받아오고 있는 대표 향수</li>
                                </ul>
                            </div>
                        </section>
                    </div>
                </div>  
            </section>

            <section class="ad-video">
                <h1 class="d-none">ad video </h1>
                <ul>
                    <li>Commercial video of men 1st item</li>
                    <div class="ad-video-m">
                        <iframe id="main_fullvideo-id" frameborder="0" allowfullscreen="1" 
                            allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" 
                            title="YouTube video player" 
                            width="100%" height="100%" 
                            src="https://www.youtube.com/embed/Ocjdar1yqW8?autoplay=0&rel=0&controls=0&disablekb=1&showinfo=0&start=1&enablejsapi=1&origin=https%3A%2F%2Fdiatv.cjenm.com&widgetid=1">
                        </iframe> 
                    </div>

                    <li>Commercial video of women 1st item</li>
                        <div class="ad-video-w">
                            <iframe id="main_fullvideo-id" frameborder="0" allowfullscreen="1" 
                                allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" 
                                title="YouTube video player" 
                                width="100%" height="100%" 
                                src="https://www.youtube.com/embed/h4s0llOpKrU?autoplay=0&rel=0&controls=0&disablekb=1&showinfo=0&start=1&enablejsapi=1&origin=https%3A%2F%2Fdiatv.cjenm.com&widgetid=1">
                            </iframe>    
                        </div>
                </ul>
            </section>

            <section class="recomm">
                <h1>Rocommendation item</h1>
                <div>
                    <ul>
                        <li>1</li>
                        <li>2</li>
                        <li>3</li>
                    </ul>
                </div>
            </section>
        </main>
    </div>
</body>
<!-- ------------footer------------------------------- -->
<footer id="footer">
    <div class="footer-container">
        Copyright 2020.Group5.All rights reserved.
    </div>
</footer>

</html>