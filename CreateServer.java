
const express = require("express");

const createServer = (pool, port=3000) => {
  const app = express();
  
  // Add your solution here
 
  const server = app.listen(port, () =>
    console.log("[server] listening on port ${port}")
  );
  return {
    app,
    close: () => new Promise(resolve => {
      server.close(() => {
        resolve();
        console.log("[server] closed");
      })
    }),
  };
};
module.exports = {createServer};
    