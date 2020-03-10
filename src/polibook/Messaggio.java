package polibook;

public class Messaggio {

    // Attributes
    private String testo;
    private long timestamp;

    //Associations
    private Utente autore; //max mult=1

    public Messaggio(String testo, long timestamp, Utente autore) {
        this.testo=testo;
        this.timestamp=timestamp;
        this.autore=autore;
        //because you have to give a Utente to the constructor
        //it's guaranteed max mult=1
    }

    /* Not suggested because of encapsulation
    public String getTesto() {
        return this.testo;
    }

    public long getTimestamp() {
        return this.timestamp;
    }
    */

    public String versioneStringa() {
        return this.testo+"\n ["+this.timestamp+"]";
    }

}
