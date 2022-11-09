package interfaces;
import records.Request;
import records.Response;
public interface Handler {
    Response handleRequest(Request request);
}
