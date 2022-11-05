package classes;
import interfaces.Reader;
import records.Request;
import java.util.Scanner;
public class RequestReader implements Reader {
    @Override
    public Request read() {
        Scanner data = new Scanner(System.in);
        return new Request(data.nextLine());
    }
}
