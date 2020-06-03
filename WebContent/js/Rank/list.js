window.addEventListener("load", function(){

    const banner = document.querySelector(".banner");
    const SHOWING_CLASS = "showing";
    const firstSlide = banner.querySelector(".banner-slide:first-child");
    const pager = document.querySelector(".pager ul");
    const pagerIndex = pager.querySelectorAll("a");


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
  


    // pager.onclick = function(e){
    //     e.preventDefault();
    //     console.log(e.target);

    //     if(e.target.nodeName != "A")
    //     return;

    //     for(var i=0; i<pagerIndex.length; i++){
    //         pagerIndex[i].classList.add("orange");//
    //     }
    //     e.target.classList.add("orange");

    // };

  

});