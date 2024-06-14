package conhecendo_collections_java.hierarquia;

public class Box<T> {
    //T == type
    private T t;

    public void setT(T t) {
        this.t = t;
    }
    public T getT() {
        return t;
    }
}
