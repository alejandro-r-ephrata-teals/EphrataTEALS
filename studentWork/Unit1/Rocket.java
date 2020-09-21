package studentWork.Unit1;

/**
 * Prints ASCII images, such as a rocket, to the console.
 * 
 * @author [YOUR NAME HERE]
 */
public class Rocket {

    /*
     * ROCKET LAB INSTRUCTIONS
     * 
     * 1. Write a program that prints the following pictures to
     * the console. Consider how static methods and procedural
     * decomposition can be used for this program.
     * 
     *    /\
     *   /  \
     *  /    \
     *  \    /
     *   \  /
     *    \/
     *  \    /
     *   \  /
     *    \/
     *    /\
     *   /  \
     *  /    \
     *    /\
     *   /  \
     *  /    \
     * +------+
     * |      |
     * |      |
     * +------+
     * |United|
     * |States|
     * +------+
     * |      |
     * |      |
     * +------+
     *    /\
     *   /  \
     *  /    \
     * 
     * Extra: If you finish early, try any of the below challenges:
     * A. Make a new picture using the shapes from this lab.
     * B. Create a static method to draw a new shape (ex: circle).
     *    Use it to draw a new picture.
     * C. Make your own ASCII art! Use Pikachu for inspiration or
     *    find examples online.
     * 
     * SUBMIT YOUR LAB!
     * git add -A
     * git commit -m "Unit 1 Rocket lab"
     * git push origin master
     */

    public static void main(String[] args) {
        // The code below is just to get you started.
        UpArrow();
        DownArrow();
        DownArrow();
        UpArrow();
        UpArrow();
        Box();
        System.out.println("+------+");
        System.out.println("|United|");
        System.out.println("|States|");
        System.out.println("+------+");
        Box();
        UpArrow();

    }
    public static void UpArrow() {
        System.out.println("/ \\");
        System.out.println("/  \\");
        System.out.println("/   \\");
    }
    public static void DownArrow() {
        System.out.println("\\  /");
        System.out.println("\\ /");
        System.out.println("\\/");
    }
    public static void Box() {
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
    }
}
