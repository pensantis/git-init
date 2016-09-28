class HelloWorld {

  public static void main(String[] args){
    int y;
    int z = 0;

    y = 10;
    z += y;

    System.out.println("a = " + z + "\nb = " + z);

    int x = 11;

    System.out.println(11.5/2);

    // using literals
    String a = "Java";
    String b = "Java";
    //b = "js";
    System.out.println(a == b); // True, it is the same object, GO WITH THIS ONE

    // using the constructor
    String c = new String("Java");
    String d = new String("Java");

    System.out.println(c == d); // False, they are different objects

    System.out.println(c.equals(d));

  }

}
