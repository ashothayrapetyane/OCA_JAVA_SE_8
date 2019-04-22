public class RuntimEx {
    public static void main(String[] args) {
        Printable printable = null;
        BlackInk blackInk = new BlackInk();
        printable = (Printable) blackInk;
    }

}

class Ink {}
interface Printable {} //change interface to class -> compile error
class ColorInk extends Ink {}
class BlackInk extends Ink {}



