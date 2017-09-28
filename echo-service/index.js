const express = require('express')
const app = express()
app.all("/", function (req, resp){
	req.pipe(resp);
})

var port = process.env.PORT || 8080
app.listen(port, function() {
	console.log("Listening on port ", port)
})