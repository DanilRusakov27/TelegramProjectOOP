package classes;
import interfaces.Writer;
import records.Response;
public class ResponseWriter implements Writer {
    @Override
    public void write(Response response){
        System.out.println(response.data());
    }

}


