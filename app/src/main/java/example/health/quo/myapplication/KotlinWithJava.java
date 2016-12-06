package example.health.quo.myapplication;

/**
 * Created by davidmoranmartin on 2/12/16.
 */

public class KotlinWithJava {

    public String getTest() {
        return "Estamos llamando al test " + test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    private String test;

    public KotlinWithJava(String test){ this.test = test; }

}
