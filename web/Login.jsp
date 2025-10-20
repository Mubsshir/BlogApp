<%-- 
    Document   : Login/LandingPage
    Created on : Oct 18, 2025, 4:44:25 PM
    Author     : Mubsshir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Blogger App</title>
        <link rel="stylesheet" href="styles/login.css">
    </head>
    <body>
        <div class="container">
            <!-- Login Form -->
            <form
                id="loginForm"
                class="fade-in"
                method="post"
                action="saveUser.do"
                >
                <h3 class="success-msg">User Registered Successfully</h3>
                <h2>Please Login to continue</h2>
                <div class="input-group">
                    <input type="text" name="username" id="username" placeholder="Username" required />
                </div>
                <div class="input-group">
                    <input type="password"  name="password" id="password" placeholder="Password" required />
                </div>
                <button type="submit" class="btn">Login</button>
                <div class="switch">
                    Don't have an account? <a id="showRegister">Register</a>
                </div>
            </form>

            <!-- Register Form -->
            <form id="registerForm" class="fade-in" method="post" action="saveUser.do">
                <h2>Register for Blog Application</h2>
                <div class="input-group">
                    <input type="text"  name="username" id="username" placeholder="Username..." required />
                </div>  
                <div class="input-group">
                    <input type="text" name ="fname" id="fname" placeholder="First name...." required />
                </div>
                <div class="input-group">
                    <input type="text"name ="lname" id="lname" placeholder="Last name...." required />
                </div>
                <div class="input-group">
                    <input type="email" name ="email" id="email" placeholder="Email...." required />
                </div>
                <div class="input-group">
                    <input type="tel" name ="phone" id="phone" placeholder="Phone.. " required />
                </div>
                <div class="input-group">
                    <input type="password" name="password" id="password" placeholder="Enter Password" required />
                </div>
                <div class="input-group">
                    <input type="password" name="cpassword" id="cpassword" placeholder="Confirm Password" required />
                </div>
                <button type="submit" class="btn">Sign Up</button>
                <div class="switch">
                    Already have an account? <a id="showLogin">Login</a>
                </div>
                <div class="error-message">

                </div>
            </form>
        </div>
        <script src="scripts/login.js"></script>
    </body>
</html>
