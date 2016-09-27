//selection sort
var numeros = [1,5,10,23,12,25,30,2,7,8];
var aux1 = 0;

//primeiro ciclo for corre todos os arrays
for(var i = 0; i < numeros.length - 1; i++){
  //este ciclo for corre o array da posicao i+1 ate ao final e compara os valores
  for(var j = i+1; j < numeros.length; j++){
    if(numeros[i] > numeros[j]){
      aux1 = numeros[i];
      numeros[i] = numeros[j];
      numeros[j] = aux1;
    }
  }
}

console.log(numeros);
