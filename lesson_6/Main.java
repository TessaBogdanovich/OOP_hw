public class Main {
    public static void main(String[] args) {

        TeacherService teacherService = new TeacherService();
        TeacherView teacherView = new TeacherView();
        TeacherController teacherController = new TeacherController(teacherService, teacherView);

        teacherController.create(
                new Teacher("Иванов", "Иванович", "Иванов", "Физика"));
        teacherController.create(
                new Teacher("Петров", "Петр", "Петрович", "Математика"));
        teacherController.create(
                new Teacher("Александров", "Александ", "Петрович", "Музыка"));

        try {
            teacherController.printConsole();
            System.out.println("===================");
            teacherController.edit(0, "Семенов", "Химия");
            teacherController.printConsole();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}