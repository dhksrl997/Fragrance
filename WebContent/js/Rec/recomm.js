window.addEventListener("load",function(){
  var main = document.querySelector(".recomm-main");
  var prdlist = main.querySelector(".recomm-tag-prdlist");
  var info = prdlist.querySelector(".prdinfo-wrap");
  var pre = prdlist.querySelector(".moveBtn-pre");
  var next = prdlist.querySelector(".moveBtn-next");
  var infoStyle = window.getComputedStyle(info,null);
  var i= 1;

  pre.onclick= function(){
    if(i==1){
      i=3;
      info.style.transform  = `translateX(-2320px)`;
    }
    else if(i==2){
    info.style.transform  = `translateX(0px)`;
    i--;
    }
    else if(i==3){
    info.style.transform  = `translateX(-1160px)`;
    i--;
    }
  };

  next.onclick= function(){
    if(i==3){
      i=1;
      info.style.transform  = `translateX(0px)`;
    }
    else{
    info.style.transform  = `translateX(${-1160*i}px)`;
    i++;
    }
  };

});