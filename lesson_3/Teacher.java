import java.util.Comparator;

public class Teacher extends User {

    private Long teacherId;

    public Teacher(String firstName, String secondName) {
        super(firstName, secondName);
    }
    // Getters and setters
    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }
    // сравнение
    public static class TeacherComparator implements Comparator {
        /**
         * @param o1
         * @param o2
         * @return
         */
        

        @Override
        public int compare(StudentGroup o1, StudentGroup o2) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'compare'");
        }
    }
    // toString
    @Override
    public String toString() {
        return "Преподаватель:" +
//                "Id: '" + teacherId +'\'' +                 /* уменьшаем, чтобы компактнее выводились данные*/
                ", Фамилия: '" + super.getFirstName() + '\'' +
                ", Имя: '" + super.getSecondName() + '\'' +
                '}';
    }

}
