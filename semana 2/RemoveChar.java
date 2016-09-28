class RemoveChar{
  public static void main(String[] args){
    missingChar("Robocop", 3);

    //receive command line argument if available
    if(args.length>=2){
	    missingChar(args[0], Integer.parseInt(args[1]));
    }
  }


  private static void missingChar(String str, int n) {

    if(n < str.length()){
      String a = str.substring(0,n);
      String b = str.substring(n+1);


      // print result here
      System.out.println(a.concat(b));
    }
    else{
      System.out.println("Nothing to cut");
    }

}
}
