import java.math.BigDecimal;


public class JavaMain {
    public static void main(String[] args) {
        //Урок 1. Пункт 10. Различие instanceof для Groovy и Java
        System.out.println("Пункт 10");
        Object str = "hmm";
        System.out.println(str instanceof Integer); //false

        //Урок 2. Пункт 3. Использование методов add, divide и multiply
        BigDecimal decimal1 = new BigDecimal(1.5);
        BigDecimal decimal2 = new BigDecimal(1.5);

        System.out.println("\tusing methods\n" + decimal1 + "/" + decimal2 + " = " + decimal1.divide(decimal2));
        System.out.println(decimal1 + " * " + decimal2 + " = " + decimal1.multiply(decimal2));
        System.out.println(decimal1 + " + " + decimal2 + " = " + decimal1.add(decimal2));

        //System.out.println(decimal1 + decimal2);
    }
}
