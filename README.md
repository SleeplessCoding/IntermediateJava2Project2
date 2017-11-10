# IntermediateJava2Project2

This is a JFrame GUI application which will allow for a user to input sales rep ID, First name, Last name, Total sold (office supplies, books, and paper), select a sales district (North, South, East, or West), and a preferred means of contact. There will be validation in the user input and a button that saves the user input as variable data. We will also create a quit button that closes the program when selected.


Swing Components used:
JFrame – application base window, includes close button, includes minimize button, and large window button. 
JLabel – to label all text input boxes as well as the combobox’s used 
JComboBox – First one is for district selection of North, South, East or West. Second is used to select form of preferred contact (phone, email). These are drop down menus and I selected this because I prefer the appearance and optimization of space in comparison to JRadioButtons or JCheckBoxs. 
JTextField – For every variable that will be stored from user input I used the JTextField. These come after the JLabels and receive user input such as String or int data.
JButton – This is used for our Enter button that will echo the user input and store the input as variable data. It is also used for our Quit button, which will close the program. This can be linked to a JOptionPane confirmation in case they do not want to close the program. 



Pseudocode:

Application Start

Ask user for Sales ID

User enters sales id into text field

Ask user for district

User selects north, south, east, or west from drop down menu

Ask user for first name

User inputs first name into text field

Ask user for last name 

User inputs last name into text field

Ask user for preferred means of contact and contact info

User select form of preferred contact from drop down menu

User inputs contact info into text field

Ask user for office supplies total, book sales total, and paper sales total

User inputs office supplies total, book sales total, paper sales total

User selects Enter when all fields are filled

IF fields are not ALL complete

Display required fields prompt

User completes form

IF data types do not match

Prompt user for correct data type

User inputs correct data

Else IF all fields are complete is true

Store user text field input as variable values

Create file to store user variables

Get user variable value for Sales ID and WRITE to txt file

Get user variable value for first name and WRITE to txt file

Get user variable value for last name and WRITE to txt file

Get user variable value for supplies total and WRITE to txt file

Get user variable value for books total and WRITE to txt file

Get user variable value for paper total and WRITE to txt file

Get user variable value for district and WRITE to txt file

Get user variable value for preferred contact info and WRITE to txt file

WRITE new line to prepare for appended data

Close/save file

Display “data saved” confirmation prompt

User clicks ok

Clear all text fields for new data

If user enters new data and saves again APPEND new data below first line of data 

User selects Quit Button

Ask user if they are sure they want to quit without saving

IF user selects YES

Exit application

Else user selects NO/Cancel

Application resumes

User clicks EVALUATE button

Program READS accounts.txt

IF accounts.txt line 1 is NULL prompt user

Else

Creates Tokens for each line variable

Array checks line token values for Supplies, Books and Paper 

Values are added to get SUM

IF line total SUM >= 8000 

Create stars.txt

IF already exists clears stars.txt of all data

Append line data to stars.txt

READ next line

Array checks line token values for Supplies, Books and Paper

Values are added to get SUM

IF line total SUM >= 8000

Append line to stars.txt

DO until array reaches line with NULL data

Close stars.txt

Prompt user “Stars have been updated”

***** NEW CONTENT IP 4 *******

User clicks DISPLAY button

Jtextbox is cleared

READS stars.txt

Counts stars.txt array value

Sets arraylist value as representative count

Displays representative count

FOR each line in stars.txt

Append arraylitst value to Jtextbox on program interface as one line

Do this until stars.txt arraylist value is null

IF stars.txt is empty prompt user “unable to display stars”
