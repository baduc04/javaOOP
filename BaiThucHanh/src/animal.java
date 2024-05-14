
abstract class Animal {
    abstract void run();
}

class dog extends Animal {
    void run() {
        System.out.println("hab ");
    }

    public static void main(String args[]) {
        Animal abc = new dog();
        abc.run();
    }
}
