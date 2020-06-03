window.addEventListener("load", function(){
    var main = document.querySelector("#main");
    var gridItems = main.querySelectorAll(".grid-item");
    var close = main.querySelectorAll(".close");
    var description = main.querySelectorAll(".description");
    var img = main.querySelectorAll(".img");
    var like = main.querySelectorAll(".d-like");
    var unlike = main.querySelectorAll(".d-unlike");
    var top =true;
    var shield = new Shield("#main");
//--------------------창열고 닫고 관련------------------------------------------
    img[0].onclick = function(){
        description[0].classList.remove("d-none");
        console.log("start");
        shield.show();
    }
    close[0].onclick = function(){
        description[0].classList.add("d-none");
        shield.hide();
        console.log("close");
    }
   
    img[1].onclick = function(){
        description[1].classList.remove("d-none");
        console.log("start");
        shield.show();
    }
    close[1].onclick = function(){
        description[1].classList.add("d-none");
        console.log("close");
        shield.hide();
    }

    img[2].onclick = function(){
        description[2].classList.remove("d-none");
        console.log("start");
        shield.show();
    }
    close[2].onclick = function(){
        description[2].classList.add("d-none");
        console.log("close");
        shield.hide();
    }

    img[3].onclick = function(){
        description[3].classList.remove("d-none");
        console.log("start");
        shield.show();
    }
    close[3].onclick = function(){
        description[3].classList.add("d-none");
        console.log("close");
        shield.hide();
    }
   
    img[4].onclick = function(){
        description[4].classList.remove("d-none");
        console.log("start");
        shield.show();
    }
    close[4].onclick = function(){
        description[4].classList.add("d-none");
        console.log("close");
        shield.hide();
    }
    img[5].onclick = function(){
        description[5].classList.remove("d-none");
        console.log("start");
        shield.show();
 
    }
    close[5].onclick = function(){
        description[5].classList.add("d-none");
        console.log("close");
        shield.hide();
    }



// //----------------------하트 관련---------------------------
    like[0].onclick = function(){
        top=!top;
        if(!top){
         console.log("like");
         unlike[0].classList.remove("d-none");
         like[0].classList.add("d-none");
         
        }
        else{
         console.log("unlike");
         unlike[0].classList.add("d-none");
         like[0].classList.remove("d-none");
        }
    }

    unlike[0].onclick = function(){
        top=!top;
        if(!top){
         console.log("like");
         unlike[0].classList.remove("d-none");
         like[0].classList.add("d-none");
         
        }
        else{
         console.log("unlike");
         unlike[0].classList.add("d-none");
         like[0].classList.remove("d-none");
        }
    }

    like[1].onclick = function(){
        top=!top;
       if(!top){
        console.log("like");
        unlike[1].classList.remove("d-none");
        like[1].classList.add("d-none");
        
       }
       else{
        console.log("unlike");
        unlike[1].classList.add("d-none");
        like[1].classList.remove("d-none");
       }
    }

    unlike[1].onclick = function(){
        top=!top;
       if(!top){
        console.log("like");
        unlike[1].classList.remove("d-none");
        like[1].classList.add("d-none");
        
       }
       else{
        console.log("unlike");
        unlike[1].classList.add("d-none");
        like[1].classList.remove("d-none");
       }
    }

    like[2].onclick = function(){
        top=!top;
       if(!top){
        console.log("like");
        unlike[2].classList.remove("d-none");
        like[2].classList.add("d-none");
        
       }
       else{
        console.log("unlike");
        unlike[2].classList.add("d-none");
        like[2].classList.remove("d-none");
       }
    }

    unlike[2].onclick = function(){
        top=!top;
       if(!top){
        console.log("like");
        unlike[2].classList.remove("d-none");
        like[2].classList.add("d-none");
        
       }
       else{
        console.log("unlike");
        unlike[2].classList.add("d-none");
        like[2].classList.remove("d-none");
       }
    }

    like[3].onclick = function(){
        top=!top;
       if(!top){
        console.log("like");
        unlike[3].classList.remove("d-none");
        like[3].classList.add("d-none");
        
       }
       else{
        console.log("unlike");
        unlike[3].classList.add("d-none");
        like[3].classList.remove("d-none");
       }
    }

    unlike[3].onclick = function(){
        top=!top;
       if(!top){
        console.log("like");
        unlike[3].classList.remove("d-none");
        like[3].classList.add("d-none");
        
       }
       else{
        console.log("unlike");
        unlike[3].classList.add("d-none");
        like[3].classList.remove("d-none");
       }
    }

    like[4].onclick = function(){
        top=!top;
       if(!top){
        console.log("like");
        unlike[4].classList.remove("d-none");
        like[4].classList.add("d-none");
        
       }
       else{
        console.log("unlike");
        unlike[4].classList.add("d-none");
        like[4].classList.remove("d-none");
       }
    }

    unlike[4].onclick = function(){
        top=!top;
       if(!top){
        console.log("like");
        unlike[4].classList.remove("d-none");
        like[4].classList.add("d-none");
        
       }
       else{
        console.log("unlike");
        unlike[4].classList.add("d-none");
        like[4].classList.remove("d-none");
       }
    }

    like[5].onclick = function(){
        top=!top;
       if(!top){
        console.log("like");
        unlike[5].classList.remove("d-none");
        like[5].classList.add("d-none");
        
       }
       else{
        console.log("unlike");
        unlike[5].classList.add("d-none");
        like[5].classList.remove("d-none");
       }
    }

    unlike[5].onclick = function(){
        top=!top;
       if(!top){
        console.log("like");
        unlike[5].classList.remove("d-none");
        like[5].classList.add("d-none");
        
       }
       else{
        console.log("unlike");
        unlike[5].classList.add("d-none");
        like[5].classList.remove("d-none");
       }
    }

});