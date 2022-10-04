package one;
import interfaces.Get_data;

import java.util.Scanner;
public class Write implements Get_data {
    public  Write(){};
    String inputData;
    public void writeData() {
        Scanner data = new Scanner(System.in);
        inputData = data.nextLine();
    };

}
