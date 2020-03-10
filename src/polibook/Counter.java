package polibook;

public class Counter {

    private int value;

    public Counter reset() {
        this.value=0;
        return this;
    }

    public Counter increment(int by) {
        this.value+=by;
        return this;
    }

    public Counter decrement(int by) {
        this.value-=by;
        return this;
    }

    public Counter print() {
        System.out.println(this.value);
        return this;
    }

    public Counter then() {
        return this;
    }

    public Counter afterThat() {
        return this;
    }

    public Counter andAlso() {
        return this;
    }

}
