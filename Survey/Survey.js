function validateForm() {
    // Perform your form validation here
    var name = document.getElementById("name").value;
    var email = document.getElementById("email").value;
    
    // You can add more validation logic as needed
    
    // Display a popup with selected values
    var popupContent = "Name: " + name + "\n";
    popupContent += "Email: " + email + "\n";
    
    alert("Selected values:\n" + popupContent);
    
    // Reset the form
    document.getElementById("survey-form").reset();
}
