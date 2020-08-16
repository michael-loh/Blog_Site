<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">


    <title>Homepage</title>

    <!-- Bootstrap CSS CDN -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
    <!-- Our Custom CSS -->
    <link rel="stylesheet" href="/static/assets/homepage.css">

    <!-- Font Awesome JS -->
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js" integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ" crossorigin="anonymous"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js" integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY" crossorigin="anonymous"></script>

</head>

<body>


    <!-- jQuery CDN - Slim version (=without AJAX) -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <!-- Popper.JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
    <!-- Bootstrap JS -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>



    <!-- top navbar -->
    <nav class="navbar navbar-light bg-light justify-content-between">
        <button type="button" id="sidebarCollapse" class="btn btn-info">
            <i class="fas fa-align-left"></i>
            <span>Toggle Sidebar</span>
        </button>
        <h3>
            Blog Site
        </h3>

        <div class="dropdown">

            <button type="button" class="btn btn-secondary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <i class="fas fa-user"></i>
            </button>

            <div class="dropdown-menu dropdown-menu-right">
                <a class="dropdown-item" href="#">Sign Out</a>
            </div>

        </div>
    </nav>



    <div class="wrapper">

        <!-- Sidebar -->
        <nav id="sidebar" style="background-color: darkslategrey;">
            <div class="list-group list-group-flush" style="padding-top: 75px;">

                <form action="/homepage">
                    <button type="submit" class="list-group-item list-group-item-action-primary" style="background-color: darkslategrey; min-width:250px;">
                        Homepage
                    </button>
                </form>

                <form action="/myBlogs">
                    <button type="submit" class="list-group-item list-group-item-action-primary" style="background-color: cornflowerblue; min-width:250px;">
                        My Page
                    </button>
                </form>

                <form action="/create_blog">
                    <button type="submit" class="list-group-item list-group-item-action-primary" style="background-color: darkslategrey; min-width:250px;">
                        Create Blog
                    </button>
                </form>

                <form action="/search_page">
                    <button type="submit" class="list-group-item list-group-item-action-primary" style="background-color: darkslategrey; min-width:250px;">
                        Search User
                    </button>
                </form>

            </div>
        </nav>
        <!-- Page Content -->
        <div id="content">

            <div class="container-fluid">
                <h1>
                    ${username}
                </h1>
                <c:forEach var="blog" items="${blogs}">
                    <div class="container" style="border: 1px solid black">
                        <p> ${blog.getTitle()} </p>
                        <p> ${blog.getAuthor()} </p>
                        <p> ${blog.getBody()} </p>
                    </div>
                </c:forEach>

            </div>

        </div>

    </div>

    <script>
        $(document).ready(function () {

            $('#sidebarCollapse').on('click', function () {
                $('#sidebar').toggleClass('active');
            });

        });
    </script>

</body>

</html>