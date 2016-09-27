function potencia(base, expoente){
  if(expoente == 0){
    return 1;
  }
  return potencia(base, expoente -1) * base;
}

console.log(potencia(3,2));
