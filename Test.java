public class Test {

    public static void main(String[] args) {
        Employee coder = new Coder();
        Employee tester = new Tester();
        Employee manager = new Manager();

        coder.work();
        coder.sleep();

        tester.work();
        tester.sleep();

        manager.work();
        manager.sleep();
    }

    public static void method(Employee emp){
        emp.work();
        emp.sleep();
    }

}
