public class StringCalculator {
    public int add(String numbers) {

        if(numbers.isEmpty()) {
            return 0;
        }

        int sum = 0;

        String[] split = numbers.split(",");

        for(String stringNumber : split) {
            if(stringNumber.isEmpty() == false) {
                sum += Integer.parseInt(stringNumber);
            }
        }

        return sum;
    }
}
