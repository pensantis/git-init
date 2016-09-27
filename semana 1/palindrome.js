//recursivo
function palindrome(str){
  if(str.length<=1){
    return true;
  }
  if(str[0] != str[str.length -1]){
    return false;
  }
  //console.log(str.substring(1, str.length -1));
  return palindrome(str.substring(1, str.length -1));
}

console.log(palindrome("salas"));


//iterativo

function iterativa(palavra){
  var inicial = 0;
  var final = palavra.length - 1;

  while(inicial < final){
    if(palavra[inicial] != palavra[final]){
      return false;
    }
    inicial++;
    final--;
  }
  return true;

}

console.log(iterativa("salas"));
