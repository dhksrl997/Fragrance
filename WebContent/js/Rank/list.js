window.addEventListener("load", function(){

    const banner = document.querySelector(".banner");
    const SHOWING_CLASS = "showing";
    const firstSlide = banner.querySelector(".banner-slide:first-child");
    const pager = document.querySelector(".pager ul");
    const pagerIndex = pager.querySelectorAll("a");
    const body = document.querySelector("#body");
    const list = body.querySelector(".list");


    // firstSlide.classList.add(SHOWING_CLASS);
    function slide(){
        const currentSlide = banner.querySelector(`.${SHOWING_CLASS}`);
         
        if(currentSlide){
            currentSlide.classList.remove(SHOWING_CLASS);
            const nextSlide = currentSlide.nextElementSibling;
            if(nextSlide){
                nextSlide.classList.add(SHOWING_CLASS);
            }else{
                firstSlide.classList.add(SHOWING_CLASS);
            }
        }else{
            firstSlide.classList.add(SHOWING_CLASS);
        }
    }

    slide();
    setInterval(slide,3000);
    
    function mouseWheel(e){
        console.log(e);
    };
    


  

});