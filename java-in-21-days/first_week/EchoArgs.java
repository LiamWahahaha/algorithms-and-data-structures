class EchoArgs {
    public static void main (String args[]) {
        for (int idx = 0; idx < args.length; idx++) {
            System.out.println("Argument " + idx + ": " + args[idx]);
        }
    }
}