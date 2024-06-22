/*Formatting Using Java Printf()/
public class formated_print {
    public static void main(String[] args) {
        //%d---->for integer
        //%n---->for new line
        //%s---->for string
        //%S---->for string value in upper case
        //%f---->for float
        //%.2f---->for float printed with 2 digits after the decimal point
        //%b---->for boolean
        //%B---->for boolean value in upper case(TRUE)
        //%c---->for character
        //Hours: %tH  Minutes: %tM Seconds: %tS
    /* SimpleDateFormat ft
             = new SimpleDateFormat("dd-MM-yyyy");

     String str = ft.format(new Date());
     System.out.println("Formatted Date : " + str);*/
        int i=5;
        float f=28755.84787f;
        double d=3.568650d;
        boolean b=false;
        String s ="dadada";
        System.out.printf("Int value %d\n",i);//Int value 5
        System.out.printf("float value %.2f%n",f);//float value 28755.85
        System.out.printf("String value %S%n",s);//String value DADADA
        System.out.printf("double value %.3f%n",d);//double value 3.569
    }
}
