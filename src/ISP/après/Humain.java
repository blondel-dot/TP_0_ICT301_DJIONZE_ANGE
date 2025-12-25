package ISP.après;

public class Humain implements workable, Eatable {
    public void eat () {
        System.out.println("Humain mange");
    }
    public void work() {
        System.out.println("Humain travaille");

    }
}
