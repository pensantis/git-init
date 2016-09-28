class SearchInside{
  public static void main(String[] args){
    String str = "Hello World!";

// what to search for, it can be a char or string
    String search = "o";

// check if the string contains the search
    if(str.contains(search)) {

      System.out.println(search + " exists!");

}

// search forward from the beginning or a specified index
  int index = str.indexOf(search);   // ??

// search backwards from the end or a specified index
  int lastIndex = str.lastIndexOf(search, str.length() - 2);  // ??

// when the string does not contain what we want it returns -1

  System.out.println("The first " + search + " is at " + index + " and the last one at " + lastIndex);
  }
}
