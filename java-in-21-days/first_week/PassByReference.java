class PassByReference {
    int OnetoZero (int arg[]) {
        int count = 0;

        for (int i = 0; i < arg.length; i++) {
            if (arg[i] == 1) {
                count++;
                arg[i] = 0;
            }
        }

        return count;
    }

    void printValues (String msg, int arr[]) {
        System.out.println("\n======================");
        System.out.println(msg);
        System.out.print("Values of the array: [ ");

        for (int idx = 0; idx < arr.length; idx++) {
            System.out.print(arr[idx] + " ");
        }

        System.out.println("]");
        System.out.println("======================\n");
    }

    public static void main (String args[]) {
        int arr[] = {1, 3, 4, 6, 1, 7, 1};
        PassByReference test = new PassByReference();
        int numOnes;

        test.printValues("Create an original array.", arr);
        numOnes = test.OnetoZero(arr);
        System.out.println("Number of Ones = " + numOnes);
        test.printValues("Modify the original array.", arr);
    }
}