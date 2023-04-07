public class Sephian {
    void status(){
        System.out.println("Sephian is Live Object");
    }
}

class Human extends Sephian{
    @Override
    void status() {
        System.out.println("Human is Live Object");
    }
}

class Man extends Human{
    @Override
    void status() {
        System.out.println("Man is Live Object");
    }
}

class Dilshan extends Man{
    @Override
    void status() {
        System.out.println("Dilshan is Live Object");
    }
}

class Test{
    public static void main(String[] args) {
        Sephian s = new Sephian();
        Sephian h = new Human();
        Sephian m = new Man();
        Sephian d = new Dilshan();
        s.status();
        h.status();
        m.status();
        d.status();
    }
}