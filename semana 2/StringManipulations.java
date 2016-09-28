class StringManipulations{
  public static void main(String[] args){
    String str = "http://www.academiadecodigo.org";

    String domain = str.substring(str.indexOf("w")); // www.academiadecodigo.org
    String aux = str.substring(str.indexOf("a"), str.lastIndexOf("o")-1);
    String academia = aux.substring(0, aux.lastIndexOf("a") + 1);
    String de = aux.substring(aux.lastIndexOf("a") + 1, aux.lastIndexOf("a")+ 3);
    String codigo = aux.substring(aux.lastIndexOf("c"));
    char a = academia.charAt(0);
    char b = codigo.charAt(0);


    String name = "< " + Character.toUpperCase(a) + academia.substring(1) + " " + de + " " + Character.toUpperCase(b) + codigo.substring(1) + "_ >";   // < Academia de Codigo_ >

// print the following message at the end
// I am a Code Cadet at < Academia de Codigo_ >, www.academiadecodigo.org
    System.out.println("I am a Code Cadet at " + name + ", " + domain);
  }
}
