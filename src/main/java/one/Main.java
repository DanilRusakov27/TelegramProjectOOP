package one;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Write messageIN = new Write();
        messageIN.writeData();

        Data data = new Data(messageIN.inputData);
        Out messageOUT=new Out(data.data);
        messageOUT.outData();

    }

}

