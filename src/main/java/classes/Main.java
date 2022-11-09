package classes;
import records.Request;
import records.Response;

public class Main {
    public static void main(String[] args){
        RequestReader reader = new RequestReader();
        RequestHandler handler = new RequestHandler();
        ResponseWriter writer = new ResponseWriter();

        while (true) {
            Request request = reader.read();
            Response response = handler.handleRequest(request);
            writer.write(response);
        }

    }

}


