/**
 * 저작자 : 
 * 생성이 : 
 * 저작권 :
 * 설명 :
 * 참고 url :  
 */

function Shield(selector){
   //list.js에서 selector 인자를 받는 shield생성자   
   //console.log(selector);
   //console.log(document.querySelector);
   
   this.parent = document.querySelector(selector); 
   //인자 받은것을 parent에 담는다(this는 공유 목적)  
   // console.log(this.parent);
   this.dom = null;
   //dom값의 초기값 null
   
}
   
Shield.prototype = {
   
   show:function(){         
      this.dom = document.createElement("div");
      //this.dom.className = "shield";
      this.dom.style.background = "black";
      this.dom.style.opacity = 0.77;
      this.dom.style.position = "fixed";
      this.dom.style.left = "0px";
      this.dom.style.top = "0px";
      this.dom.style.width = "100%";
      this.dom.style.height = "100%";
      this.dom.style.display = "flex";
      this.dom.style.alignItems = "center";
      this.dom.style.justifyContent = "center";
      // var icon = document.createElement("img");
      // icon.src = "/images/ajax-loader.gif";
      // this.dom.append(icon); // TextNode ..
      console.log("in");
      this.parent.append(this.dom);
   },
   hide:function(){
      if(this.dom == null) return;
      
      this.dom.remove();
   }
};

   
   


/*
function removeShield(selector){
   // shield 를 수거해야 함.
   var parentNode = document.querySelector(selector);
   var shield = parentNode.querySelector(".shield");
   //s.parentElementNode.removeChild(s);
   shield.remove();
   //부모.appendChild(자신) < - > 부모.removeChild(자신)
   //부모.append(자신) < - > 자신.remove()
}

function showShield(selector){   
   var shield = document.createElement("div");       
   shield.className = "shield";
   //shield.style.background = "black";
   //shield.style.opacity = 0.5;
   shield.style.position = "absolute";
   shield.style.left = "0px";
   shield.style.top = "0px";
   shield.style.width = "100%";
   shield.style.height = "100%";
   shield.style.display = "flex";
   shield.style.alignItems = "center";
   shield.style.justifyContent = "center";
   var icon = document.createElement("img");
   icon.src = "/images/ajax-loader.gif";
   shield.append(icon); // TextNode ..
                 
   var hostNode = document.querySelector(selector);
   hostNode.append(shield);
}

*/