class SumAverage {
    public static void main (String args[]) {
        int sum = 0;

        for (int idx = 0; idx < args.length; idx++) {
            sum += Integer.parseInt(args[idx]);
        }

        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + (float)sum / (float)args.length);
    }
}