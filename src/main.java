
public class main {
    static public void main(String args[]) {
        int i;
        i = 10;
        System.out.println("Hello Java." + i);

        for (i=1; i < 101; i++) {
            if(i%3 == 0) {
                System.out.printf("Fizz");
            } else if(i%5 == 0) {
                System.out.printf("Buzz");
            } else {
                System.out.println("\n"+i);
            }
        }
    }
}

