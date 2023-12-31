public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("clone succeeded!");
        System.out.println(Add.add(2, 3));
    }
}

class Add {
    public static int add(int x, int y) {
        return x + y;
    }
}