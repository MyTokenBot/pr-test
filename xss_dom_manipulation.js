const express = require('express');
const app = express();

app.get('/echo', (req, res) => {
    const userInput = req.query.input;
    res.send(`<div>You said: ${userInput}</div>`);
});

app.listen(3000, () => {
    console.log('Server listening on port 3000');
});
