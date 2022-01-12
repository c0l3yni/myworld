public class Earth {
    public static void main(String[] args) {
        Human tom;

        tom = new Human();
        tom.age = 5;
        tom.eyeColor = "brown";
        tom.heightInInches = 72;
        tom.name = "Tom Smith";

        tom.speak();

        Human joe;

        joe = new Human();
        joe.age = 83;
        joe.eyeColor = "purple";
        joe.heightInInches = 123;
        joe.name = "Joe Goldberg";

        joe.speak();
    }
}