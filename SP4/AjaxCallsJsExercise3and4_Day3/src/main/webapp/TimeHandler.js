/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//declare variable to touch DOM-structure
var showTime = document.getElementById("showTime");


var date = new Date();//now it takes the browsers timezone
var hour = date.getHours();
var min = date.getMinutes();
var sec = date.getSeconds();


showTime.innerHTML = "The current time is: " + hour + ":" + min + ":" + sec;
console.log(showTime);

