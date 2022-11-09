package classes;
import records.Request;
import records.Response;
import interfaces.Handler;
public class RequestHandler implements Handler {
    public Response handleRequest(Request request) {
        return new Response(request.data());
    }
}