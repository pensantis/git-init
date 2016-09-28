class ThreesandFives{
  public static void main(String[] args){
    int value = 20;
    if(args.length>0){
      value = Integer.parseInt(args[0]);
    }
    
    int[] threesOrFives = new int[value];
    int[] thressAndFives = new int[value];
    int i = 0;
    int j = 0;

    while(value > 0){
      if(value % 3 == 0 && value % 5 == 0){
        thressAndFives[i] = value;
        i++;
      }
      else if(value % 3 == 0 || value % 5 == 0){
        threesOrFives[j] = value;
        j++;
      }
      value--;
    }

    for(int a = 0; a < thressAndFives.length; a++){
      if(thressAndFives[a] != 0 ){
        System.out.println(thressAndFives[a]);
      }

    }
    for(int a = 0; a < threesOrFives.length; a++){
      if(threesOrFives[a] != 0){
        System.out.println(threesOrFives[a]);
      }
    }
  }
}
