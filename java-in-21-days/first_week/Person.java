class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void printPerson() {
        System.out.print("Hi, my name is " + name + ".");
        System.out.println(" I am " + age + " years old.");
        this.printDash(10);
    }

    void printDash(int nums) {
        for (int count = 0; count < nums; count++) {
            System.out.print("- ");
        }
        System.out.println();
    }
    public static void main (String args[]) {
        Person person;

        person = new Person("Laura", 20);
        person.printPerson();

        person = new Person("Tommy", 3);
        person.printPerson();
    }
}