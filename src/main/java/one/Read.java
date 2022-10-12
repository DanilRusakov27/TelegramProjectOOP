package one;
import interfaces.GetData;

import java.util.Scanner;
public class Read implements GetData {
    public Read(){};
    String inputData;
    public void writeData() {
        Scanner data = new Scanner(System.in);
        inputData = data.nextLine();
    };

}
