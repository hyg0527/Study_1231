public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("clone succeeded! develop branch");

        Develop.run();
    }
}

class Add {
    public static int add(int x, int y) {
        return x + y;
    }
}