/**
 * User: Brent Baker
 * Date: 10/23/13
 * Time: 11:29 AM
 */
public class AnimalPlay {

    public static void main(String[] args){

        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("Dog: " + sparky.tryToFly());
        System.out.println("Bird: " + tweety.tryToFly());

        // This allows dynamic changes for flyingType
        sparky.setFlyingAbility(new ItFlys());
        System.out.println("Dog: " + sparky.tryToFly());
    }

}
