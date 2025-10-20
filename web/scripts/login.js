const loginForm = document.getElementById("loginForm");
const registerForm = document.getElementById("registerForm");
const showRegister = document.getElementById("showRegister");
const showLogin = document.getElementById("showLogin");
const errorMessage = document.querySelector(".error-message");

const cpassword = document.getElementById("cpassword");
const password = document.getElementById("password");
registerForm.addEventListener("submit", (e) => {
  if (password.value !== cpassword.value) {
    e.preventDefault();
    errorMessage.style.display = "block";
    errorMessage.textContent = "Passwords do not match!";
  }
});

showRegister.addEventListener("click", () => {
  loginForm.style.display = "none";
  registerForm.style.display = "block";
});

showLogin.addEventListener("click", () => {
  registerForm.style.display = "none";
  loginForm.style.display = "block";
});
