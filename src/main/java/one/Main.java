package one;

public class Main {
    public static void main(String[] args){
        while(true){
        Read messageIN = new Read();
        messageIN.writeData();
        Data data = new Data(messageIN.inputData);
        Out messageOUT=new Out(data.data);
        messageOUT.outData();
        }

    }

}

