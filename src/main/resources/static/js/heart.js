// // Get all elements with the class "heartIcon"
var heartIcons = document.querySelectorAll("#heartIcon");


// Loop through each heart icon and attach the click event handler
heartIcons.forEach(heartIcon => {
heartIcon.addEventListener("click", () => {
heartIcon.classList.toggle("liked");
if (heartIcon.classList.contains("bx-heart")) {
heartIcon.classList.remove("bx-heart");
heartIcon.classList.add("bxs-heart");
heartIcon.style.color = "#f35625";
} else {
heartIcon.classList.remove("bxs-heart");
heartIcon.classList.add("bx-heart");
heartIcon.style.color = "gray";
}
})
})


const section = document.querySelector("section")
// pop-up for booking
const book = document.querySelectorAll(".book")
const overlay1 = document.querySelector(".overlay1")
const cancel1 = document.querySelector(".cancel1")




book.forEach(booking => {
booking.addEventListener("click", () => section.classList.add("popup"))
overlay1.addEventListener("click", () => section.classList.remove("popup"))
cancel1.addEventListener("click", () => section.classList.remove("popup"))
})




//form submit
const searchbtn = document.querySelector(".searchbtn")
searchbtn.addEventListener("click", ()=>{
document.getElementById('searchForm').submit();
})



