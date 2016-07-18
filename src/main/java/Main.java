/**
 * Created by Erik_Hegedus on 7/14/2016.
 */
import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {

        get("/hello/:name", (req,res) -> {
            String name = req.params("name");
            return "Hello " + name;
        });

        get("/helloworld", (req, res) -> {
            return "Hello World!";
        });

        get("/rectangle", (req, res) -> {
            int x=Integer.parseInt(req.queryParams("x"));
            int y=Integer.parseInt(req.queryParams("y"));
            return "Kerület: " + 2*(x+y) + "  "+ "Terület: " + (x*y);
        });
    }
}
