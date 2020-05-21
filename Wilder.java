package classTestWCS;

public class Wilder {

    //Attributes
    private String firstName;
    private boolean aware;

    //Constructors
    public Wilder(String firstName, boolean aware){
        this.firstName = firstName;
        this.aware = aware;
    }

    //Getters
    public String getFirstName(){
        return this.firstName;
    }
    public boolean isAware(){
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
        if (isAware()){
            return "Je m'appelle " + getFirstName() +  " et je suis aware.";
        }else
        {
            return "Je m'appelle " + this.firstName +  " et je ne suis pas aware.";
        }
    }
}
