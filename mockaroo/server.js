// server.js

// set up ========================
var express = require('express');
var app = express();             

app.use(express.static(__dirname + '/public'));                 // set the static files location /public/img will be /img for users

app.use(function (req, res, next) {
    res.header('Access-Control-Allow-Origin', '*');
    res.header('Access-Control-Allow-Methods', 'GET, POST, OPTIONS, PUT, PATCH, DELETE');
    res.header('Access-Control-Allow-Headers', 'Origin, X-Requested-With, Content-Type, Accept, access_token');
    next();
});

app.get('*', function (req, res) {
    res.sendfile('./public/index.html');
});

// listen (start app with node server.js) ======================================
var port = process.env.PORT || 8080;
app.listen(port);
console.log("App listening on port 8080");
