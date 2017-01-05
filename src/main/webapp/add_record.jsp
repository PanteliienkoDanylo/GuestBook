<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Add record</title>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>

<body>

<div class="container">

    <form action="controllerServlet" method="get" class="form-horizontal">
        <input type="hidden" name="command" value="add_record"/>

        <div id="div_name" class="form-group">
            <label class="control-label col-sm-2" for="name">Name:</label>
            <div class="col-sm-10">
                <input type="text" id="name" name="name" class="form-control" placeholder="Enter name"/>
            </div>
        </div>

        <div id="div_surname" class="form-group">
            <label class="control-label col-sm-2" for="name">Surname:</label>
            <div class="col-sm-10">
                <input type="text" id="surname" name="surname" class="form-control" placeholder="Enter surname"/>
            </div>
        </div>

        <div id="div_birthday" class="form-group">
            <label class="control-label col-sm-2" for="birthday">Birthday:</label>
            <div class="col-sm-10">
                <input type="date" id="birthday" name="birthday" class="form-control" placeholder="Enter birthday"/>
            </div>
        </div>


        <div id="div_phone_number" class="form-group">
            <label class="control-label col-sm-2" for="name">Phone number:</label>
            <div class="col-sm-10">
                <input type="text" id="phone_number" name="phone_number" class="form-control" placeholder="Enter phone number"/>
            </div>
        </div>

        <div id="div_mail" class="form-group">
            <label class="control-label col-sm-2" for="name">Mail:</label>
            <div class="col-sm-10">
                <input type="text" id="mail" name="mail" class="form-control" placeholder="Enter mail"/>
            </div>
        </div>

        <div id="div_country" class="form-group">
            <label class="control-label col-sm-2" for="name">Country:</label>
            <div class="col-sm-10">
                <input type="text" id="country" name="country" class="form-control" placeholder="Enter country"/>
            </div>
        </div>

        <div id="div_city" class="form-group">
            <label class="control-label col-sm-2" for="name">City:</label>
            <div class="col-sm-10">
                <input type="text" id="city" name="city" class="form-control" placeholder="Enter city"/>
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <input type="submit" id="add_button" class="btn btn-default" value="Submit" disabled/>
            </div>
        </div>

    </form>

</div>

    <script src="js/validation.js"></script>

</body>

</html>