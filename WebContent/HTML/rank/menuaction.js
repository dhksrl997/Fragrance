/*window.addEventListener("load", function () {

    const body = document.querySelector("body");
    const subMenu = body.querySelector(".sub-menu");
    const subMenus = body.querySelectorAll(".sub-menu a");
    const mainMenu = body.querySelector(".main-menu ul");
    const mainMenus = body.querySelectorAll(".main-menu a");
    
    
    // var focus = new Focus(mainMenu);

    // const focus = new Focus(".main-menu ul");
    // mainMenu.onmouseover = focus.in;
    // mainMenu.onmouseout = focus.out;

    // const focus1 = new Focus(".sub-menu ul");
    // subMenu.onmouseover = focus1.in;
    // subMenu.onmouseout = focus1.out;

    mainMenu.onmouseover = function(e){
        // e.preventDefault();
         console.log(e.target.innerText);
        
        if(e.target.nodeName != "A")
        return;

        for(var i=0; i<mainMenus.length; i++){
            mainMenus[i].classList.remove("show");
        }
        e.target.classList.add("show");
        subMenu.classList.remove("d-none");
    };

    mainMenu.onmouseout = function(e){
        // e.preventDefault();
        // console.log(e.target);

        if(e.target.nodeName != "A")
        return;

        for(var i=0; i<mainMenus.length; i++){
            mainMenus[i].classList.add("show");
        }
        e.target.classList.add("show");
       
        // subMenu.classList.add("d-none");

    };


    subMenu.onmouseover = function(e){
        e.preventDefault();
        // console.log(e.target);

        if(e.target.nodeName != "A")
        return;

        for(var i=0; i<subMenus.length; i++){
            subMenus[i].classList.remove("show");
        }
        e.target.classList.add("show");

    };
    // subMenuArea.onmouseover = function(e){
    //     e.preventDefault();
    //     // console.log(e.target);

    //     if(e.target.nodeName != "A")
    //     return;

    //     for(var i=0; i<subMenus.length; i++){
    //         subMenus[i].classList.add("show");
    //     }
    //     e.target.classList.add("show");

    // };

    // subMenu.onmouseout = function(e){
    //     e.preventDefault();
    //     // console.log(e.target);

    //     if(e.target.nodeName != "A")
    //     return;

    //     for(var i=0; i<subMenus.length; i++){
    //         subMenus[i].classList.add("show");
    //     }
    //     e.target.classList.add("show");

    // };

    subMenu.onclick = function (e) {
        e.preventDefault();
        // console.log(e.target.nodeName);

        if (e.target.nodeName != "A")
            return;

        for (var i = 0; i < subMenus.length; i++) {
            subMenus[i].classList.remove("show");
        }
        e.target.classList.add("show");
        // e.target.classList.add("move");

    }
});*/