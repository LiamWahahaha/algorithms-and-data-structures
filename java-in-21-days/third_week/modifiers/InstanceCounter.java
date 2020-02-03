class InstanceCounter {
    // a class variable
    private static int instanceCount = 0;

    // a class method
    protected static int instanceCount() {
        return instanceCount;
    }

    private static void incrementCount() {
        ++instanceCount;
    }

    InstanceCounter() {
        InstanceCounter.incrementCount();
    }
}

class InstanceCounterTester extends InstanceCounter {
    public static void main(String args[]) {
        for (int index = 0; index < 10; index++) {
            new InstanceCounter();
        }
        System.out.println("made: " + InstanceCounter.instanceCount());
    }
}