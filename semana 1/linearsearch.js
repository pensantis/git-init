var numeros = [1,5,10,23,12,25,30,2,7,8];
var pesquisa = 3;

for(var i = 0; i < numeros.length; i++){
  if(numeros[i] === pesquisa){
    console.log("Numero encontrado na posicao" + i);
    return;
  }
}
console.log("numero nao encontrado");
