public class Main {
    public static void main(String[] args) {
        Classes employee1 = new Classes();
        employee1.setId(1);
        employee1.setTitle("Mr");
        employee1.setFirstName(("Abdul"));
        employee1.setSurname(("DevLab"));

        System.out.println(employee1.getMailingName());
        System.out.println(employee1.getMailingName(true));
        System.out.println(employee1.getMailingName(false));
        Classes employee2 = new Classes(2,"Manager");

        Department financeDept = new Department("Finance", "Abduldevlab");

        financeDept.getManagerName();
    }
}
