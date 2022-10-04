package one;

import interfaces.Output_data;
public class Out implements Output_data {
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

