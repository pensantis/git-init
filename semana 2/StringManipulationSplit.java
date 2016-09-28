class StringManipulationSplit{
  public static void main(String[] args){
    String str = "http://www.academiadecodigo.org";

    String domain = str.split("/")[2];
    String acd = str.split("\\.")[1];
    String[] nomes = {acd.substring(0, acd.lastIndexOf("a") + 1),
                    acd.substring(acd.lastIndexOf("a")+1, acd.lastIndexOf("e")+1),
                    acd.substring(acd.lastIndexOf("c"))};

    nomes[0] = nomes[0].replaceFirst("a", "A");
    nomes[2] = nomes[2].replaceFirst("c", "C");

    String name = "< " + nomes[0] + " " + nomes[1] + " " + nomes[2] + "_ >, ";

    System.out.println("I am a code cadet at " + name + domain);
  }
}
