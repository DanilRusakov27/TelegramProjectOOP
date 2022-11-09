package classes;
import interfaces.Reader;
import records.Request;
import java.util.Scanner;
public class RequestReader implements Reader {
    private final Scanner inputScanner = new Scanner(System.in);

    @Override
    public Request read() {
        return new Request(inputScanner.nextLine());
    }
}
