class FrontBack{
  public static void main(String[] args) {

      frontBack("heisenberg");

      //receive command line argument if available
      if(args.length>0){
        frontBack(args[0]);
      }
  }

  private static void frontBack(String str) {
    char aux = str.charAt(0);
    char aux2 = str.charAt(str.length() -1);




    System.out.println(aux2 + str.substring(1, str.length()-1) + aux);

  }
}
