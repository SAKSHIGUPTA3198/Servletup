function validateUser(){
    var rollno = document.getElementById("rollno").value;
    
    var fname = document.getElementById("fname").value;
    var lname = document.getElementById("lname").value;
    var course = document.getElementById("course").value;
    var result = document.getElementById("result").value;
    
    
    if(rollno == ""){
        alert("Rollno can not be blank.");
        return false;
    }else if(fname == ""){
        alert("First name can not be blank.");
        return false;
    }else if(lname == ""){
        alert("Last name can not be blank.");
        return false;
    }else{
        var form = document.getElementById("frm");
        form.action = "add.do";
        form.submit();
    }
}
/*function validateUpdateUser(){
    var username = document.getElementById("username").value;
    
    var firstname = document.getElementById("firstname").value;
    var lastname = document.getElementById("lastname").value;
    var mobilenumber = document.getElementById("mobilenumber").value;
    
    if(username == ""){
        alert("Username can not be blank.");
        return false;
    
    }else{
        var form = document.getElementById("frm");
        form.action = "update.do";
        form.submit();
    }
}*/