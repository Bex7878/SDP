public class Main {
    public static void main(String[] args) {
        //SRP
        User user = new User("Bex", "beksultan040405@gmail.com");
        EmailValidator validator = new EmailValidator();
        System.out.println("SRP:");
        if (validator.isValid(user.getEmail())) {
            System.out.println(user.getName() + "'s email is valid.");
        } else {
            System.out.println(user.getName() + "'s email is invalid.");
        }

        //OSP
        Shape rectangle = new Rectangle(5, 3);
        Shape circle = new Circle(4);
        System.out.println("OSP:");
        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Circle area: " + circle.area());
        //LSP
        System.out.println("LSP:");
        Bird sparrow = new Sparrow();
        ((Flyable) sparrow).fly();

        Bird penguin = new Penguin();
        penguin.eat();

        //ISP
        Workable humanWorker = new HumanWorker();
        Workable robotWorker = new RobotWorker();
        System.out.println("ISP:");
        humanWorker.work();
        ((Eatable) humanWorker).eat();

        robotWorker.work();

        //DIP
        Switchable light = new Light();
        Button button = new Button(light);
        System.out.println("DIP:");
        button.press();
        button.release();
    }
}
