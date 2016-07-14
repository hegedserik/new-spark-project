/**
 * Created by Erik_Hegedus on 7/14/2016.
 */
import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}
