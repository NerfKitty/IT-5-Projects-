public class yuan extends currency{
    public double converter (double value){
        double con = value * 7.11;
        System.out.println("The value of your dollar amount to yuan is: "+ con);
        return con;
    }
}
