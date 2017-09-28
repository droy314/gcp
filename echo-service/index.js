const express = require('express')
const app = express()
app.all("/", function (req, resp){
	console.log('Received reques for ', req.path, ' with method ' , req.method)
	req.pipe(resp);
})

var port = process.env.PORT || 8080
app.listen(port, function() {
	console.log("Listening on port ", port)
})