document.getElementById("eye").onclick = function(){
    var password = document.querySelector("#password")
    var eye = document.querySelector("#eye")

    if(password.type === "password"){
        password.type = "text"
        eye.style.color = "black"
    }
    else{
        password.type = "password"
        eye.style.color = "rgb(152, 149, 149)"
    }
}
