const express = require('express');
const app = express();

const users = [
    { id: 1, name: 'John' },
    { id: 2, name: 'Jane' },
    { id: 3, name: 'Bob' }
];

app.get('/users/:id', (req, res) => {
    const user = users.find(u => u.id === parseInt(req.params.id));
    res.json(user);
});

app.listen(3000, () => {
    console.log('Server listening on port 3000');
});
