package polibook;

public class EsempioPB {

    public static void main(String[] args) {
        Utente mark;

        // NO!!!
//		mark.nickname="mark";
//		mark.nome="Mark";
//		mark.cognome="Zucc";
//		mark.email="mark@polito.it";

        //Use the Constructor
        mark=new Utente("Mark", "Zucc", "mark", "mark@polito.it");
        mark.mostra();
        System.out.println("Creato oggetto: "+mark.getNickname());
        Utente francesco=mark;
        francesco.mostra();
        //ALIASING: copy of the reference, not the value
        francesco.setNome("Francesco");
        francesco.mostra();
        mark.mostra();
        //garbage collection: allows JVM to reclaim the memory
        //taken from previous objects that it's not more reachable
        //difference with C: you don't need to use free()
        mark.scriviMessaggio("Test");
        mark.scriviMessaggio("Test numero 2");
        mark.stampaMessaggi();
    }

}
