# Algorithm: Employee Payroll System Using HashMap



##### 1.Start the program.

###### &#x20;   Create a HashMap<Integer, Employee> to store employee details, where:

###### &#x20;   Key = Employee ID 

###### &#x20;   Value = Employee object 

###### &#x20;   Display the main menu:

###### &#x20;      Add Employee

###### &#x20;      View Employee 

###### &#x20;      Update Employee 

###### &#x20;      Delete Employee  

###### &#x20;      Display All Employees

###### &#x20;      Exit

###### &#x20;      Read the user's choice.

##### If Add Employee:

###### &#x20;   Enter Employee ID, Name, Basic Salary, Allowance, and Deduction.

##### 2.Calculate:

###### &#x20;   Gross Salary = Basic Salary + Allowance 

###### &#x20;   Net Salary = Gross Salary − Deduction

###### &#x20;   Create an Employee object.

###### &#x20;   Store it in the HashMap using Employee ID as the key.

##### 3.If View Employee:

###### &#x20;   Enter Employee ID.

###### &#x20;   Check whether the ID exists in the HashMap.

###### &#x20;   If found, display the employee details and net salary.

###### &#x20;   Otherwise, display "Employee not found."

##### 4.If Update Employee:

###### &#x20;   Enter Employee ID.

###### &#x20;   Check whether the employee exists.

###### &#x20;   If found, update the employee details.

###### &#x20;   Recalculate Gross Salary and Net Salary.

###### &#x20;   Save the updated object in the HashMap.

##### 5.If Delete Employee:

###### &#x20;   Enter Employee ID.

###### &#x20;   Remove the employee from the HashMap.

###### &#x20;   Display a success or failure message.

###### &#x20;   If Display All Employees:

###### &#x20;   Traverse the HashMap using values() or entrySet().

###### &#x20;   Display the details of every employee.

##### 6.If Exit:

###### &#x20;   Stop the program.

###### Otherwise:

###### &#x20;   Display "Invalid Choice."

###### &#x20;   End the program

