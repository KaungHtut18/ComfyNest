const section = document.querySelector("section")

// pop-up for rating
const overlay = document.querySelector(".overlay")
const rate = document.querySelector("#rate")
const cancel = document.querySelector(".cancel")

rate.addEventListener("click", () => section.classList.add("active"))
overlay.addEventListener("click", () => section.classList.remove("active"))
cancel.addEventListener("click", () => section.classList.remove("active"))

// pop-up for booking
const book = document.querySelector(".book")
const overlay1 = document.querySelector(".overlay1")
const cancel1 = document.querySelector(".cancel1")

book.addEventListener("click", () => section.classList.add("popup"))
overlay1.addEventListener("click", () => section.classList.remove("popup"))
cancel1.addEventListener("click", () => section.classList.remove("popup"))

// stars
// select all elements with the "i" tag and store them in a NodeList called "stars"
const stars = document.querySelectorAll(".star i")

// loop through the "stars" NodeList
stars.forEach((star, index1) =>{
    // add an event listener that runs a function when the "click" event is triggered
    star.addEventListener("click", () => {
        // loop through the "stars" NodeList Again
        stars.forEach((star, index2) => {
            // add the "check" class to the clicked star and any stars with a lower index
            // and remove the "active" class from any stars with a higher index
            index1 >= index2 ? star.classList.add("check") : star.classList.remove("check")
        })
    })
})


