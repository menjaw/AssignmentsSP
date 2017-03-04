/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var map = document.getElementById("svg2");
map.addEventListener("click", function (event) {
    //får printet landekoden ud
    //console.log(event.target.id);


//henter data fra en server på en hjemmeside
    //var url = "http://restcountries.eu/rest/v1/alpha?codes=" + event.target.id; //restcountries REST API bliver brugt her
    var url = "/EuropeContriesAjaxJs_SP4/ProxySolution?codes=" + event.target.id; //request videresendes til proxy server (ProxySolution.java)

    var conf = {method: 'get'};//AJAX er når man kalder



    var promise = fetch(url, conf);
    promise.then(function (response) {

        return response.text();

        console.log(event.target.id);
    }).then(function (text) {
        var country = JSON.parse(text);

        var name = document.getElementById("name");
        var population = document.getElementById("population");
        var area = document.getElementById("area");

        name.innerHTML = "Country: " + country[0].name;
        population.innerHTML = "Area: " + country[0].area + " Kvm";
        area.innerHTML = "Population: " + country[0].population + " Millions";
        //console.log(country);

    });
});


