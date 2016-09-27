//bubble sort
var numeros = [1,5,10,23,12,25,30,2,7,8];
var aux1 = 0, aux2 = numeros.length;

while (aux2 > 0) {
  for(var i = 0; i < aux2; i++){
    if(numeros[i] > numeros [i+1]){
      aux1 = numeros[i];
      numeros[i] = numeros[i+1];
      numeros[i+1] = aux1;
    }
  }
  aux2--;
}

console.log(numeros);
