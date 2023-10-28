<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>login page</title>
<%@include file="templates/imports-top.jsp"%>
<style type="text/css">
.login,
.image {
  min-height: 100vh;
}

.bg-image {
  background-image: url('https://mdbcdn.b-cdn.net/img/Photos/Slides/img%20(27).webp');
  background-size: cover;
  background-position: center center;
}

</style>

</head>
<body>
	<%@include file="templates/header/header.jsp"%>
	<div class="container-fluid">
    <div class="row no-gutter">
        <!-- The image half -->
        <div class="col-md-6 d-none d-md-flex bg-image"></div>

        <!-- The content half -->
        <div class="col-md-6 bg-light">
            <div class="login d-flex align-items-center py-5">

                <!-- Demo content-->
                <div class="container">
                    <div class="row">
                        <div class="col-lg-10 col-xl-7 mx-auto">
                            <h3 class="display-4">Login Here</h3>
                            <br>
                      
                            <form>
                                <div class="form-group mb-3">
                                    <input id="inputEmail" type="email" placeholder="Email address" required="" autofocus="" class="form-control rounded-pill border-0 shadow-sm px-4">
                                </div>
                                <div class="form-group mb-3">
                                    <input id="inputPassword" type="password" placeholder="Password" required="" class="form-control rounded-pill border-0 shadow-sm px-4 text-primary">
                                </div> 
                                <br>                        
                                <button type="submit" class="btn btn-primary btn-block text-uppercase mb-2 rounded-pill shadow-sm">Sign in</button>
                         
                            </form>
                        </div>
                    </div>
                </div><!-- End -->

            </div>
        </div><!-- End -->

    </div>
</div>
	
	<%@include file="templates/footer/footer.jsp"%>
</body>
</html>