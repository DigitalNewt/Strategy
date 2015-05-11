/**
 * User: Brent Baker
 * Date: 10/23/13
 * Time: 11:28 AM
 */
public interface Flys {
    String fly();
}

/**
 * Class used if the Animal can fly
 */
class ItFlys implements Flys{

    /**
     * fly method from ItFlys class
     * @return string
     */
    public String fly() {
        return "Flying High";
    }

}

/**
 * Class used if the Animal can't fly
 */
class CantFly implements Flys{

    /**
     * fly method from CantFly class
     * @return string
     */
    public String fly() {
        return "I can't fly";
    }

}
