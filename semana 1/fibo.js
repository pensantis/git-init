function fibo(n){
  if(n < 2){
    return n;
  }
  n--;
  return fibo(n) + fibo(n-1);
}

console.log(fibo(6));
