public class mainMethod {
    static double peso;
    public static void main(String[] args) {

        currency pesoCurrency = new peso();
        currency euroCurrency = new euro();
        currency yuanCurrency = new yuan();

        pesoCurrency.converter(1);
        euroCurrency.converter(1);
        yuanCurrency.converter(1);

     
    }
}
