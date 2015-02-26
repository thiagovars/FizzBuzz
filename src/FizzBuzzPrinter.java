public class FizzBuzzPrinter {

    public String shout(int number){
        String yeld = "";
        if(number % 3 == 0) {
            if(number % 5 == 0) {
                yeld = "FizzBuzz";
            } else {
                yeld = "Fizz";
            }
        } else if(number %5 == 0){
            yeld = "Buzz";
        } else {
            yeld = String.valueOf(number);
        }
        return yeld;

    }

}
