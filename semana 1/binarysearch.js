var numeros = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20];
var pesquisa = 21, inicio = 0, fim = numeros.length, meio = fim/2;

while(inicio <= fim){
  if(numeros[meio] == pesquisa){
    console.log("Numero encontrado na posicao " + meio);
    return;
  }
  if(pesquisa > numeros[meio]){
    inicio = meio +1;
    meio = Math.floor(((fim - inicio) / 2) + inicio);
    //console.log(numeros[meio]);
    //console.log(meio);
  }
  else {
    fim = meio -1 ;
    meio = Math.floor(((fim - inicio) / 2) + inicio);
    //console.log(numeros[meio]);
    //console.log(meio);
  }


}

if(numeros[meio] == pesquisa){
  console.log("Numero encontrado na posicao " + meio);
  return;
}

console.log("numero nao encontrado");
