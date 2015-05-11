/**
 * User: Brent Baker
 * Date: 2/7/15
 * Time: 6:17 PM
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class TestAnimal {

    private final String canFly = "Flying High";
    private final String canNotFly = "I can't fly";


    @Test
    public void testCanFly() {
        Flys flightTest = new ItFlys();
        assertEquals(flightTest.fly(), canFly);
    }

    @Test
    public void testCanNotFly() {
        Flys flightTest = new CantFly();
        assertEquals(canNotFly,flightTest.fly());
    }


    @Test
    public void testAnimal() {
        Animal myAnimal = new Animal();
        myAnimal.setFavFood("Pizza");
        myAnimal.setFlyingAbility(new ItFlys());
        myAnimal.setHeight(5.11);
        myAnimal.setName("Lucy");
        myAnimal.setSound("Hello");
        myAnimal.setSpeed(1.5);
        myAnimal.setWeight(120);

        assertEquals("Pizza", myAnimal.getFavFood());
        assertEquals(canFly, myAnimal.tryToFly());
        assertEquals(5.11, myAnimal.getHeight(),0);
        assertEquals("Lucy", myAnimal.getName());
        assertEquals("Hello", myAnimal.getSound());
        assertEquals(1.5, myAnimal.getSpeed(),0);
        assertEquals(120, myAnimal.getWeight(),0);
    }

    @Test
    public void testDog() {
        Animal sparky = new Dog();
        assertEquals(canNotFly, sparky.tryToFly());
        sparky.setFlyingAbility(new ItFlys());
        assertEquals(canFly, sparky.tryToFly());
    }

    @Test
    public void testBird() {
        Animal tweety = new Bird();
        assertEquals(canFly, tweety.tryToFly());

        tweety.setFlyingAbility(new CantFly());
        assertEquals(canNotFly, tweety.tryToFly());
    }
}
