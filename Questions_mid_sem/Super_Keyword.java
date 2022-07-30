package Questions_Mid_Sem;

class Animal {

    Animal() {
        System.out.println("Animal is created");
    }
}

class Dog extends Animal{
    Dog()
    {
        System.out.println("Dog is created");
    }
}

class Main
{
    public static void main(String[]args)
    {
        Dog obj = new Dog();
    }
}
