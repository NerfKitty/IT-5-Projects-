 class peso extends currency{
    
    public double converter (double value){
        double con = value * 55.10;
        System.out.println("The value of your dollar amount to peso is: "+ con);
        return con;
    }

    public void message(){
        System.out.println("Successfully converted.");
    }
}
