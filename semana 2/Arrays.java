class Arrays{
  public static void main(String[] args){
    int size = 20;
    if(args.length > 0){
      size = Integer.parseInt(args[0]);

    }
    impares(size);
  }

  public static void impares(int size){
    int[] impares = new int[size];
    for(int i = 0; i < impares.length; i++){
      impares[i] = randoms();
    }

    for(int i =0; i < impares.length; i++){
      System.out.println(impares[i]);
    }
}

  public static int randoms(){
    int i =(int) Math.floor(Math.random() * 101);

    while(i%2 == 0){
      i =(int) Math.floor(Math.random() * 101);
    }
    return i;
  }
}
