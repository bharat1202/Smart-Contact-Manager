console.log("script is loading");

let currenttheme=getTheme();
changeTheme();


//todo
function changeTheme() {
    //set to web page
    document.querySelector("html").classList.add(currenttheme);
    //+++set the listener to change++++++++
const changethemebutton= document.querySelector('#theme_change')
const oldtheme=currenttheme;
changethemebutton.addEventListener("click",() =>{
    console.log("changetheme button clicked");
    //remove the current theme
    document.querySelector("html").classList.remove(oldtheme);
    if(currenttheme==="dark"){
        currenttheme="light";
    }else{
        currenttheme="dark";

    }
    setTheme(currenttheme);
    //set the current theme
    document.querySelector('html').classList.add(currenttheme);
    //change the text of button
    changethemebutton.querySelector("span").textContent=currenttheme=="light"?"dark":"light";
});
}

//set theme to local storage
function setTheme(theme){

    localStorage.setItem("theme",theme);
}

//get theme from local storage
function getTheme(){
let theme = localStorage.getItem("theme");
if(theme) return theme;
else return "light";
}
