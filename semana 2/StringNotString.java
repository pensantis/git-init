class StringNotString{
  public static void main(String[] args){
    changeString("nttesting");

  }

  public static void changeString(String str){
    if(str.startsWith("not")){
      System.out.println(str);
    }
    else{
      System.out.println("not".concat(str));
    }
  }
}
