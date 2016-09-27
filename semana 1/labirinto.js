//Criar labirinto de forma recursiva
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

//console.log(lab);

function labirinto(x, y){
  lab[x][y] = 1;

  if(neighbors(x,y)){
    var pos = whereToMove(x,y);
    //console.log(pos);
    x = pos[0];
    y = pos[1];
    //console.log("x" + pos[0] +" y" + pos[1]);
    //console.log("posicao x: " + x + " posicao y:" + y);
    stack.push([x, y]);
    setTimeout(function() {
      labirinto(x,y);
      console.log(lab);
    }, 500);
  }
  else if (stack.length > 1) {
    lab[stack[stack.length -1][0]] [stack[stack.length -1][1]] = 2;
    stack.pop();
    x = stack[stack.length -1][0];
    y = stack[stack.length -1][1];
    //console.log("back x: " + x + " posicao y:" + y);
    setTimeout(function() {
      labirinto(x,y);
      console.log(lab);
    }, 500);
  }
  else {
    return;
  }
}

function neighbors(x, y){
  if(x+1 < rows && lab[x+1][y] == 0){
    return true;
  }
  else if (x-1 >= 0 && lab[x-1][y] == 0) {
    return true;
  }
  else if (y+1 < col && lab[x][y+1] == 0) {
    return true;
  }
  else if (y-1 >= 0 && lab[x][y-1] == 0) {
    return true;
  }
  else {
    return false;
  }

}

function whereToMove(x, y){
  if (x-1 >= 0 && lab[x-1][y] == 0) {
    return [x-1, y];
  }
  else if (y+1 < col && lab[x][y+1] == 0) {
    return [x, y+1];
  }
  else if(x+1 < rows && lab[x+1][y] == 0){
    return [x+1, y];
  }
  else if (y-1 >= 0 && lab[x][y-1] == 0) {
    return [x, y-1];
  }
}

labirinto(5,5);
console.log(lab);
