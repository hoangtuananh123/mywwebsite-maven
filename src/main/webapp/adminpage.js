
var element1= document.querySelector('.suathongtin');
var element2= document.querySelector('.editdanhmuc');
var element3= document.querySelector('.addsp');
var element4= document.querySelector('.editsp');
var element5= document.querySelector('.deletesp');

function suathongtin(){

        element1.style.display="block";
        element2.style.display="none";
        element3.style.display="none";
        element4.style.display="none";
        element5.style.display="none";


}
function editdanhmuc(){
        element1.style.display="none";
        element2.style.display="block";
        element3.style.display="none";
        element4.style.display="none";
        element5.style.display="none";
  }
  function addsp(){
  
        element1.style.display="none";
        element2.style.display="none";
        element3.style.display="block";
        element4.style.display="none";
        element5.style.display="none";
  }
  function editsp(){

        element1.style.display="none";
        element2.style.display="none";
        element3.style.display="none";
        element4.style.display="block";
        element5.style.display="none";
  }
  function deletesp(){

        element1.style.display="none";
        element2.style.display="none";
        element3.style.display="none";
        element4.style.display="none";
        element5.style.display="block";
  }
