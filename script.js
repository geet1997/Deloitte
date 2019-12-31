function display()
{
var num1 = prompt("Enter first number: ","12");
var num2 = prompt("Enter second number: ","122");
var result = parseInt(num1)+parseInt(num2);
alert("The sum of two numbers are :" +result);
}
function demo()
{ var Istrue = confirm ("Do you wish to continue?");
if (Istrue==true){
	alert ("Your request has been submitted");
}
else {
		alert ("Your request has been cancelled");
	}
}
function displaygreetings (msg)
{
	if ( msg == null){
	msg = "Good Night";}
	alert (msg);
	
	}