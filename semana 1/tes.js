var lab = [];
var stack = [];
var rows = 9;
var col = 9;

for (var r = 0; r <rows; r++){
  lab.push([]);
  for(var c =0; c < col; c++){
    lab[r].push(0);
  }
}

lab[0][5]=1;
console.log(lab);
