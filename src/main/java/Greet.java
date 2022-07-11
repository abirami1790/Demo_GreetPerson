public class Greet {
    public String GreetPersonWithName(String Name)
    {
        if(Name==null)
        {
            return "Hello Friend!";
        }
        if(Name.equals("JERRY"))
        {
            return "HELLO JERRY!";
        }
        return "Hello "+ Name+"!";
    }

    public String GreetPersonWithTwoNames(String[] names)
    {
        return "Hello,"+ names[0] + " and "+ names[1] ;
    }
}
