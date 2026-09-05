package MODULE1;
class Worker {
    String name;
    String address;
    int age;
    int mob;
    float sal;

    Worker(String name, String address, int age, int mob, float sal) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.mob = mob;
        this.sal = sal;
    }

    void printSalary() {
        System.out.println("Salary: " + sal);
    }

    void displayWorker() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Mobile: " + mob);
    }
}

class Officer extends Worker {
    String spl;

    Officer(String name, String address, int age, int mob, float sal, String spl) {
        super(name, address, age, mob, sal);
        this.spl = spl;
    }

    void printSpecialization() {
        System.out.println("Specialization: " + spl);
    }
}

class Managers extends Worker {
    String dep;

    Managers(String name, String address, int age, int mob, float sal, String dep) {
        super(name, address, age, mob, sal);
        this.dep = dep;
    }

    void printDept() {
        System.out.println("Department: " + dep);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {

        Officer o = new Officer(
            "Rahul",
            "Mumbai",
            30,
            987654321,
            45000.0f,
            "Software Development"
        );

        Managers m = new Managers(
            "Anita",
            "Pune",
            40,
            912345678,
            60000.0f,
            "Human Resources"
        );

        System.out.println("OFFICER DETAILS");
        o.displayWorker();
        o.printSalary();
        o.printSpecialization();

        System.out.println("MANAGER DETAILS");
        m.displayWorker();
        m.printSalary();
        m.printDept();
    }
}

