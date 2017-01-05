var isNameValid = false;
var isSurnameValid = false;
var isBirthdayValid = false;
var isPhoneNumberValid = false;
var isMailValid = false;
var isCountryValid = false;
var isCityValid = false;


document.getElementById("name").onchange = function() { validName()};
document.getElementById("surname").onchange = function() {validSurname()};
document.getElementById("birthday").onchange = function() { validBirthday()};
document.getElementById("phone_number").onchange = function() {validPhoneNumber()};
document.getElementById("mail").onchange = function() {validMail()};
document.getElementById("country").onchange = function() {validCountry()};
document.getElementById("city").onchange = function() {validCity()};


function validName(){
    var name = document.getElementById("name").value;
    var regex = new RegExp("^[A-Za-z]{3,20}$");
    if(regex.test(name)){
        document.getElementById("div_name").className = "form-group has-success has-feedback";
        isNameValid = true;
    }else{
        document.getElementById("div_name").className = "form-group has-error has-feedback";
        isNameValid = false;

    }
    makeButtonDisable();
}

function validSurname(){
    var surname = document.getElementById("surname").value;
    var regex = new RegExp("^[A-Za-z]{5,20}$");
    if(regex.test(surname)){
        document.getElementById("div_surname").className = "form-group has-success has-feedback";
        isSurnameValid = true;
    }else{
        document.getElementById("div_surname").className = "form-group has-error has-feedback";
        isSurnameValid = false;
    }
    makeButtonDisable();
}

function validBirthday(){
    var birthday = document.getElementById("birthday").value;
    var regex = new RegExp("^[0-9]{4}-[0-9]{2}-[0-9]{2}$");
    if(regex.test(birthday)){
        document.getElementById("div_birthday").className = "form-group has-success has-feedback";
        isBirthdayValid = true;
    }else{
        document.getElementById("div_birthday").className = "form-group has-error has-feedback";
        isBirthdayValid = false;
    }
    makeButtonDisable();
}

function validPhoneNumber(){
    var phoneNumber = document.getElementById("phone_number").value;
    var regex = new RegExp("^[0-9]{10}$");
    if(regex.test(phoneNumber)){
        document.getElementById("div_phone_number").className = "form-group has-success has-feedback";
        isPhoneNumberValid = true;
    }else{
        document.getElementById("div_phone_number").className = "form-group has-error has-feedback";
        isPhoneNumberValid = false;
    }
    makeButtonDisable();
}

function validMail(){
    var mail = document.getElementById("mail").value;
    var regex = new RegExp("^[A-Za-z0-9]{5,20}@[A-Za-z]{3,5}\\.[A-Za-z]{2,3}$");
    if(regex.test(mail)){
        document.getElementById("div_mail").className = "form-group has-success has-feedback";
        isMailValid = true;
    }else{
        document.getElementById("div_mail").className = "form-group has-error has-feedback";
        isMailValid = false;
    }
    makeButtonDisable();
}

function validCountry(){
    var country = document.getElementById("country").value;
    var regex = new RegExp("^[A-Za-z]{3,20}$");
    if(regex.test(country)){
        document.getElementById("div_country").className = "form-group has-success has-feedback";
        isCountryValid = true;
    }else{
        document.getElementById("div_country").className = "form-group has-error has-feedback";
        isCountryValid = false;
    }
    makeButtonDisable();
}

function validCity(){
    var city = document.getElementById("city").value;
    var regex = new RegExp("^[A-Za-z]{3,20}$");
    if(regex.test(city)){
        document.getElementById("div_city").className = "form-group has-success has-feedback";
        isCityValid = true;
    }else{
        document.getElementById("div_city").className = "form-group has-error has-feedback";
        isCityValid = false;
    }
    makeButtonDisable();
}


function makeButtonDisable(){
    if(isNameValid && isSurnameValid && isBirthdayValid && isPhoneNumberValid && isMailValid && isCountryValid && isCityValid){
        document.getElementById("add_button").disabled = false;
    }else{
        document.getElementById("add_button").disabled = true;
    }
}