package one;

import interfaces.OutputData;
public class Out implements OutputData {
    public String outputData;
   ;
    public Out(String data)
    {
        outputData = data;
    }
    public void outData(){
        System.out.println(outputData);
    }

}

