package polibook;

public class Utente {

    //Attributes (private -> encapsulation)
    //Information Hiding
    private String nome;
    private String cognome;
    private final String nickname;
    private String email;

    //Associations
    private Messaggio[] messaggi;
    private int prossimoIndice=0;

    //Constant
    static final int MAX_NUM_MESSAGI=100;

    //Constructor (CTOR)
    public Utente(String nome, String cognome, String nickname, String email) {
        this.nome=nome;
        this.cognome=cognome;
        this.nickname=nickname;
        this.email=email;

        //this: the object which is been built

        messaggi=new Messaggio[MAX_NUM_MESSAGI];
    }

    // Methods
    public void mostra() {
        System.out.println("Nome: "+this.nome+", "+"Cognome: "+this.cognome+" ("+this.nickname+")");
    }

    // getter (get a value inside an object)
    public String getNickname() {
        return this.nickname;
    }

    //setter (set a value inside an object)
    public void setNome(String name) {
        this.nome=name;
    }

    public void scriviMessaggio(String testo) {
        //1. Create the message with the indicated text
        long ts=System.currentTimeMillis();
        Messaggio msg=new Messaggio(testo, ts,this);

        //2. You do have to link it with the association
        this.messaggi[this.prossimoIndice]=msg;
        prossimoIndice++;
    }

    public void stampaMessaggi() {

        for(int i=0; i<messaggi.length; i++) {
            Messaggio m=messaggi[i];
            if(m==null) break;
            //System.out.println("testo: "+m.getTesto());
            //System.out.println("timestamp: "+m.getTimestamp());ù
            //Or with the delegation principle
            System.out.println(m.versioneStringa());
        }

    }

}