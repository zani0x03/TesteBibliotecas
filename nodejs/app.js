var express = require ('express'); 

var app = express();

var portNumber = 5002

app.get('/hello', function (req, res) {
    res.json({ data: "Hello World" });
});
app.listen(portNumber, function() {
    console.log(`Example app listening on port ${portNumber}!`);
});
