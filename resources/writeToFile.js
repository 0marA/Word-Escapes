import fs from "fs";

let rawdata = fs.readFileSync("dictionary.json");
let student = JSON.parse(rawdata);
let data = Object.keys(student);

var file = fs.createWriteStream("array.txt");
file.on("error", function (err) {
});
data.forEach(function (v) {
  file.write(v + "\n");
});
file.end();
