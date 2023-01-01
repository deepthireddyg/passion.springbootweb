
//postRequest
function postData(){
  var personname = document.getElementById("PersonName").value;
  var EmailId = document.getElementById("EmailId").value;
  var Price = document.getElementById("Price").value;
  var ProviderName = document.getElementById("ProviderName").value;
  var ProviderStreet = document.getElementById("ProviderStreet").value;
  var ProviderCity = document.getElementById("ProviderCity").value;
  var ProviderState = document.getElementById("ProviderState").value;
  var ProviderZipcode = document.getElementById("ProviderZipcode").value;
  var ProviderRating = document.getElementById("ProviderRating").value;
  var servicename = document.getElementById("servicename").value;
//let data = '{"personname": "' + personname + '", "emailid": "' + emailid + '", "price": ' + price + ', "providername": "' + providername + '", "providerstreet": "' + providerstreet + '", "providercity": "' + providercity + '", "providerstate": "' + providerstate + '", "providerzipcode": "' +providerzipcode + '", "providerrating": ' + providerrating + ', "servicename": "' + servicename  + '"}';
let data =
    '{"personname": "' +
    personname +
    '", "emailid": "' +
    EmailId +
    '", "price": ' +
    Price +
    ', "providername": "' +
    ProviderName +
    '", "providerstreet": "' +
    ProviderStreet +
    '", "providercity": "' +
    ProviderCity +
    '", "providerstate": "' +
    ProviderState +
    '", "providerzipcode": "' +
    ProviderZipcode +
    '","providerrating": ' +
    ProviderRating +
    ',"servicename": "' +
    servicename +
    '"}';

console.log(data);
  const myurl = "http://localhost:8080/searchservices";
  const Http = new XMLHttpRequest();
  const url = myurl;
  Http.open("POST", url);
  Http.setRequestHeader("Accept", "application/json");
  Http.setRequestHeader("Content-Type", "application/json");
  Http.send(data);
  Http.onreadystatechange = (e) => {
    console.log(Http.responseText);
    const obj = JSON.parse(Http.responseText);
    console.log(obj);
    alert(Http.responseText);
    document.getElementById("submissionformid").reset();
  };
}

//getRequest
function getData() {
  //Get Request
  const myurl = "http://localhost:8080/searchservices";
  //console.log(myurl);
  const Http = new XMLHttpRequest();
  const url = myurl;
  Http.open("GET", url);
  Http.send();
  Http.onreadystatechange = (e) => {
    //  console.log(Http.responseText);
    try {
      const obj = JSON.parse(Http.responseText);
      console.log(obj);
      jsontoHTMLTable(obj);
     // sortTable("table", 7);
    } catch (error) {
      console.log(error);
    }
  };
}
function jsontoHTMLTable(list) {
  var cols = [];
  for (var i = 0; i < list.length; i++) {
    for (var k in list[i]) {
      if (cols.indexOf(k) === -1) {
        // Push all keys to the array
        cols.push(k);
      }
    }
  }
  // Create a table element
  var table = document.createElement("table");
  // Create table row tr element of a table
  var tr = table.insertRow(-1);
  for (var i = 0; i < cols.length; i++) {
    // Create the table header th element
    var theader = document.createElement("th");
    theader.innerHTML = cols[i];
    // Append columnName to the table row
    tr.appendChild(theader);
  }
  // Adding the data to the table
  for (var i = 0; i < list.length; i++) {
    // Create a new row
    trow = table.insertRow(-1);
    for (var j = 0; j < cols.length; j++) {
      var cell = trow.insertCell(-1);
      // Inserting the cell at particular place
      cell.innerHTML = list[i][cols[j]];
    }
  }
  // Add the newly created table containing json data
  var el = document.getElementById("table");
  el.innerHTML = "";
  el.appendChild(table);
}







