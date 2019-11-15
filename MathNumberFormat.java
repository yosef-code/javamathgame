package mathgame1;
import java.text.*;
public class MathNumberFormat {
    private int detect_number;
    private String number;
    private int number_negative;
    public void NumberFormat(int a){
       NumberFormat formatter;
       detect_number = a;
       if(detect_number >= 0){
           formatter = new DecimalFormat("##");
           number = formatter.format(detect_number);
       }else{
           formatter = new DecimalFormat("(-##)");
           number_negative = (detect_number) * -1;
           number = formatter.format(number_negative);
       }
    }
    public String getFormat(){
        return number;
    }
}