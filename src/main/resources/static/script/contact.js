/* Form validation */

document.querySelector("button").addEventListener("click", function () {

    let name = document.forms["contact"]["name"].value;
    let email = document.forms["contact"]["email"].value;
    let message = document.forms["contact"]["message"].value;

    if (name === "" && email === "" && message === "") {
        alert("Udfyld venligst felterne!");
    } else if (name !== "" && email !== "" && message !== "") {
        alert("Din besked er sendt til os! Vi vender tilbage hurtigst muligt!")
    } else if (name === "" && email === "" && message !== "") {
        alert("Du mangler at indtaste dit navn og din mail")
    } else if (name === "" && email !== "" && message !== "") {
        alert("Indtast venligst dit navn")
    } else if (name !== "" && email === "" && message !== "") {
        alert("Indtast venligst din mail")
    } else if (name !== "" && email !== "" && message === "") {
        alert("Du mangler at skrive beskeden!")
    }
});