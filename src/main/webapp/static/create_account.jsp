<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>

    <head>

        <title>Create_Account</title>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>

    <body>

        <div class="row">

            <div class="col"></div>
            <div class="col-md-4">
                <div class="container" style="margin-top: 50px;">

                    <div class="card">

                        <div class="card-header">
                            <h3>Create Account</h3>
                        </div>

                        <div class="card-body">
                            <form action="/addUser" method="POST">
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Email address</label>
                                    <input type="email" class="form-control" name="email" id="email" aria-describedby="emailHelp" placeholder="Enter email">
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputUsername1">Username</label>
                                    <input type="username" class="form-control" name="username" id="username" placeholder="Username">
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword1">Password <small>*must be at least 8 characters long</small></label>
                                    <input type="password" class="form-control" name="password1" id="password1" placeholder="Password">
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword2">Confirm Password</label>
                                    <input type="password" class="form-control" name="password2" id="password2" placeholder="Cornfirm Password">
                                </div>
                                <button type="submit" class="btn btn-primary">Submit</button>
                            </form>

                            <div class="d-flex justify-content-end">
                                <a href="/login">Already have an account? Login</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col"></div>
        </div>
    </body>

</html>