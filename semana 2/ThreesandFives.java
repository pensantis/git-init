class ThreesandFives{
  public static void main(String[] args){
    int value = 20;
    if(args.length>0){
      value = Integer.parseInt(args[0]);
    }

    int size1 = (int)((value * 6)/15) + 2;
    int size2 = (int)(value / 15);

    //System.out.println(size1 + " " + size2);

    int[] threesOrFives = new int[size1];
    int[] thressAndFives = new int[size2];
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
    System.out.println("Thress and fives");
    for(int a = 0; a < thressAndFives.length; a++){
      System.out.println(thressAndFives[a]);
    }
    System.out.println("Thress or fives");
    for(int a = 0; a < threesOrFives.length; a++){
      if(threesOrFives[a] != 1){
        System.out.println(threesOrFives[a]);
      }
    }
  }
}
