public class WordGames {
    //variabili d'istanza
    String word;
    String name;
    String surname;

// metodi
    public void addHelloWord(String word){
        this.word = word;
        System.out.println(word);
    }
    public void getFullName(String name, String surname){
        this.name = name;
        this.surname = surname;
        System.out.println(name + " - " + surname);
    }


}
