let currentTheme=getTheme();

changeTheme(currentTheme)

function changeTheme(){
    document.querySelector("html").classList.add(currentTheme);

    const changeThemeButton=document.querySelector('#theme_change_button');
    changeThemeButton.addEventListener("click",(event)=>{
        const oldTheme=currentTheme;
        console.log("Change theme button clcked");
        
        if(currentTheme==="dark"){
            currentTheme="light";
        }
        else{
            currentTheme="dark";
        }

        //update in local storage
        setTheme(currentTheme);
        //remove the current theme
        document.querySelector("html").classList.remove(oldTheme);
        //set the current theme
        document.querySelector("html").classList.add(currentTheme);

        //change the text of the button
        changeThemeButton.querySelector("span").textContent=currentTheme=='light'?'Dark':'light';
    });
}

//set theme to local storage
function setTheme(theme){
    localStorage.setItem("theme",theme);
}

// get theme from local storage
function getTheme(){
    let theme=localStorage.getItem("theme");
    return theme?theme:"light";
}