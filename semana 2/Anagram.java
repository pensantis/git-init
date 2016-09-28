class Anagram{
  public static void main(String[] args){
    String word1 = "sil ent";
    String word2 = "listen";

    System.out.println(isAnagram(word1, word2));
    //System.out.println(word1.charAt(0));

  }

  private static boolean isAnagram(String a, String b){
    a = a.replace(" ", "");
    b = b.replace(" ", "");
    int cont = 0;


    if(a.length() == b.length()){
      for(int i= 0; i <a.length(); i++){
        for(int j=0; j < a.length(); j++){
          if(a.charAt(i) == b.charAt(j)){
            cont++;
          }
        }
      }
    }

    if(cont == a.length()){
      return true;
    }
    else{
      return false;
    }

  }
}
