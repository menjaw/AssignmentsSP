/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*ASSIGNMENT 3*/
//declare variable to touch DOM-structure
var showTime = document.getElementById("showTime");

var date = new Date();//now it takes the browsers timezone
var hour = date.getHours();
var min = date.getMinutes();
var sec = date.getSeconds();

showTime.innerHTML = "The current time is: " + hour + ":" + min + ":" + sec;
console.log(showTime);

/*ASSIGNMENT 4*/
//var heartDirection = document.getElementById("heartDirection");

//var north = document.getElementById("north");
//var south= document.getElementById("south");
//var east = document.getElementById("east");
//var west = document.getElementById("west");

document.getElementById("north").onclick = function() {myFunction()};
function myFunction() {
    document.getElementById("heartDirections").innerHTML = "North";
};

document.getElementById("north").onclick = function() {myFunction()};
function myFunction() {
    document.getElementById("heartDirections").innerHTML = "South";
};

document.getElementById("north").onclick = function() {myFunction()};
function myFunction() {
    document.getElementById("heartDirections").innerHTML = "East";
};

document.getElementById("north").onclick = function() {myFunction()};
function myFunction() {
    document.getElementById("heartDirections").innerHTML = "West";
};
 






