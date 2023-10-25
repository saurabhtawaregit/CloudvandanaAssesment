// calculator.js

// Function to clear the display
function clearDisplay() {
    document.getElementById("display").value = "";
}

// Function to append characters to the display
function appendToDisplay(value) {
    document.getElementById("display").value += value;
}

// Function to calculate the result
function calculateResult() {
    const display = document.getElementById("display");
    const expression = display.value;

    try {
        const result = eval(expression);
        if (Number.isFinite(result)) {
            display.value = result;
        } else {
            display.value = "Error";
        }
    } catch (error) {
        display.value = "Error";
    }
}

