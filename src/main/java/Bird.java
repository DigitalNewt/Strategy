/**
 * User: Brent Baker
 * Date: 10/23/13
 * Time: 11:27 AM
 */
public class Bird extends Animal{

    /**
     * Bird constructor
     */
    public Bird(){
        super();
        setSound("Tweet");

        // We set the Flys interface polymorphically
        // This sets the behavior as a non-flying Animal
        flyingType = new ItFlys();
    }
}
