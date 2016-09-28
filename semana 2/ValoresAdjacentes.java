class ValoresAdjacentes{
  public static void main(String[] args){
    int[] valores = {20, 13, 15, 200, 32, 12};
    int[] diferencas = {Math.abs(valores[0] - valores[1]), 0, 1};

    for(int i =0; i< valores.length - 1; i++){
      if(Math.abs(valores[i] - valores[i+1]) < diferencas[0]){
        diferencas[0] = Math.abs(valores[i] - valores[i+1]);
        diferencas[1] = i;
        diferencas[2] = i+1;
      }
    }

    System.out.println("O menor valor de adjacentes e: " + diferencas[0] + " nas posicoes " + diferencas[1] + " e " + diferencas[2]);
  }
}
