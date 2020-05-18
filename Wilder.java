package classTestWCS;

public class Wilder {

    //Attributes
    String firstName;
    boolean aware;

    //Constructors
    public Wilder(String firstName, boolean aware){
        this.firstName = firstName;
        this.aware = aware;
    }

    //Getters
    public String getFirstName(){
        return this.firstName;
    }
    public boolean getAware(){
        return this.aware;
    }

    //Setters
    public void setFirsteName(String firstName){
        this.firstName = firstName;
    }
    public void setAware(boolean aware){
        this.aware = aware;
    }

    //method
    public String whoAmI(){
        if (this.aware){
            return "Je m'appelle " + this.firstName +  " et je suis aware.";
        }else
        {
            return "Je m'appelle " + this.firstName +  " et je ne suis pas aware.";
        }
    }
}
