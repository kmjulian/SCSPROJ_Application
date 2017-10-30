var pg = require('pg');
var format = require('pg-format');
var PGUSER = 'postgres';
var PGDATABASE = 'postgres';
var PGPASSWORD = 'Saddssdsdda1';
var age = 732;

var config = {
	user: PGUSER,
	database: PGDATABASE,
	password: PGPASSWORD,
	max: 10,
	idleTimeoutMillis: 30000

}


var my_json = json1;

var jsons = [json0, json1, json2, json3, json4, json5, json6, json7, json8, json9, json10, json11, json12, json13, json14, json15, json16, json17, json18, json19, json20, json21, json22, json23];

var origins = my_json["origin_addresses"];
var destinations = my_json["destination_addresses"];

var pool = new pg.Pool(config);
var myClient;

var table_name = 'histories';

var days = ['Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday'];

pool.connect(function (err, client, done) {
	if (err) console.log(err);
	myClient = client;
	for (var g = 0; g < days.length; g++) {
		for (var h = 0; h < jsons.length; h++) {
			for (var i = 0; i < origins.length; i++) {
				var origin = origins[i];
				var branch = jsons[h]["rows"][i];
				
				for (var j = 0; j < destinations.length; j++) {
					var destination = destinations[j];
					var stem = branch["elements"][j];
					
					if (origin == destination) {
						distance = 0;
						duration = 0;
					} else {
						var distance = stem["TravelTime"]["value"] + Math.floor((getRandomArbitrary(0, 1) * 300));
						var duration = stem["TravelTime"]["value"] + Math.floor((getRandomArbitrary(0, 1) * 300));	
					}
					
					var day = days[g];
					var hour = h;
					

					var insertQuery = format('INSERT INTO %I VALUES (%L, %L, %L, %L, %L, %L)', 
						table_name, origin, destination, day, hour, traveltime);	
				
					console.log(insertQuery);

					myClient.query(insertQuery, function (err, result) {
						if (err) {
							console.log(err);
						}
						// console.log(result.rows[0]);
						
					})

				}
			}
		}
	}
		
console.log('done');




	
})

function getRandomArbitrary(min, max) {
    return Math.random() * (max - min) + min;
}





