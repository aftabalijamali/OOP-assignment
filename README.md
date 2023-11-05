# OOP-assignment
Aftab Ali 2k23/MSCS/03

1st program

This program is a basic calculator written in Java. It allows the user to perform simple arithmetic operations such as addition, subtraction, multiplication, and division. Here's a breakdown of how it works in simple language:

The program starts by displaying a message indicating that it's a basic calculator and lists the supported operations: addition (+), subtraction (-), multiplication (*), and division (/).

Then, it asks the user to input an arithmetic expression (for example, '5 + 10').

The input is split into three parts: the first number, the operator, and the second number. If the input doesn't match this format, the program shows an error message and exits.

The program then tries to convert the first and second parts into numerical values (numbers). If the conversion fails (meaning the input contains invalid numbers), it displays an error message and exits.

If the input is valid, the program performs the corresponding arithmetic operation based on the operator (+, -, *, /).

If the operator is division (/) and the second number is 0, the program displays an error message because division by zero is not allowed.

Finally, the program prints the original input expression along with the calculated result.

In summary, this program takes a simple arithmetic expression as input, evaluates it, and displays the result. If the input is not valid or if there are errors during the calculation, appropriate error messages are shown to the user.
Is this conversation helpful so far?
Regenerate



2nd program
This code is a Java program that keeps track of student scores and calculates some statistics. Here's what it does in simpler language:

Input: There is a list of students along with their scores, stored in a string format.
Processing: The program splits the input data into individual student records. For each student, it separates the name and score, calculates total score, average score, highest score, and lowest score among all the students.
Output: The program then prints out the total number of students, the average score of all students, the highest score along with the name of the student who scored it, and the lowest score along with the name of the student who scored it.
In essence, this program analyzes a list of students' scores and provides some basic statistics about their performance.
