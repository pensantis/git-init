var numeros = [1,5,10,23,12,25,30,2,7,8];
var ordenado = [];
var aux = 0;

//numeros.pop();
console.log(numeros);

ordenado.push(numeros[numeros.length -1]);
numeros.pop();

while (numeros.length > 0) {
  ordenado.push(numeros[numeros.length -1]);
  numeros.pop();

  for(var i = ordenado.length - 1; i > 0; i--){
    if(ordenado[i] < ordenado [i-1]){
      aux = ordenado[i];
      ordenado[i] = ordenado[i-1];
      ordenado[i-1] = aux;
    }
  }

}

console.log(ordenado);
