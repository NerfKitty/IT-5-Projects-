public class euro extends currency{
    public double converter (double value){
        double con = value * 0.09;
        System.out.println("The value of your dollar amount to euro is: "+ con);
        return con;
    }
}
