package patronescreacionales;

/**
 *
 * @author sergio
 */
public class OperacionSingleton {
    
    private static OperacionSingleton instancia;
    int a;
    int b;

    public OperacionSingleton(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    
}
