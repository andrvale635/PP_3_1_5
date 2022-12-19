let currentUser = "";

fetch("http://localhost:8080/api/users/current").then(
    res => {
        res.json().then(
            data => {
                if (data != null) {
                    currentUser = data;
                    console.log(currentUser);
                    showOneUser(currentUser);
                }
            }
        )
    })

function showOneUser(event) {

    let temp = "";
    console.log(event);
    temp += "<tr>"
    temp += "<td>" + event.id + "</td>"
    temp += "<td>" + event.username + "</td>"
    temp += "<td>" + event.name + "</td>"
    temp += "<td>" + event.age + "</td>"
    temp += "<td>" + event.password + "</td>"
    temp += "<td>" + getRoles(event.roles) + "</td>"
    temp += "</tr>"
    document.getElementById("oneUserBody").innerHTML = temp;
}

function getRoles(list) {
    let userRoles = [];
    for (let role of list) {
        if (role == 2 || role.id == 2) {
            userRoles.push("ADMIN");
        }
        if (role == 1 || role.id == 1) {
            userRoles.push("USER");
        }
    }
    return userRoles.join(" , ");
}