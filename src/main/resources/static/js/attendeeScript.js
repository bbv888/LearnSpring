fetch("/learnspring/api/v1/attendee")
    .then((response) => {
        if (response.ok) {
            return response.json();
        } else {
            throw new Error("NETWORK RESPONSE ERROR");
        }
    })
    .then(data => {
        console.log(data);
        //const anchor=document.querySelector("#attendee");
        //anchor.parentNode.insertBefore(constructTable(data), anchor.nextSibling);
        const container = document.querySelector("#attendeeTable");
        constructTable(data, container);
    })
    .catch((error) => console.error("FETCH ERROR:", error));

function constructTable(data, container) {
    var tr = container.insertRow(-1);
    var col = [];
    for (var i = 0; i < data.length; i++) {
        for (var key in data[i]) {
            if (col.indexOf(key) === -1) {
                col.push(key);
            }
        }
    }

    for (var i = 0; i < col.length; i++) {
        var th = document.createElement("th");      // TABLE HEADER.
        th.innerHTML = col[i];
        tr.appendChild(th);
    }

    for (var i = 0; i < data.length; i++) {

        tr = container.insertRow(-1);

        for (var j = 0; j < col.length; j++) { // ADD JSON DATA TO THE TABLE AS ROWS.
            var tabCell = tr.insertCell(-1);
            tabCell.innerHTML = data[i][col[j]];
        }
    }



/*    for (key in data[0]) {
        container.write('<td>' + key + '</td>');
    }
    container.write("</tr>");
    for (var i = 0; i < data.length; i++) {
        container.write('<tr>');
        for (key in data[i]) {
            container.write('<td>' + data[i][key] + '</td>');
        }
        container.write('</tr>');
    }*/

}
