class ThreesandFives{
  public static void main(String[] args){
    int value = 20;
    if(args.length>0){
      value = Integer.parseInt(args[0]);
    }

    int size1 = ((6 * value)/15);
    int size2 = value / 15;

    if(value % 15 > 5 && value % 15 != 8){
      size1++;
    }
    if(value % 15 == 12){
      size1++;
    }

    //System.out.println(size1 + " " + size3);
    //System.out.println(value % 3);

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

      System.out.println(threesOrFives[a]);

    }
  }
}
