public class queA {
    public static void main(String[] args) {
        Student ivan = new Student();

        ivan.setGrade(9);
        System.out.println(ivan.getGrade());
    }

    static class Student {
        private int grade;
        private String gradeAndLastName;

        public void setGrade(int grade) {
            this.grade = grade;
        }

        public void setGradeAndLastName(String gradeAndLastName) {
            this.gradeAndLastName = gradeAndLastName;
        }

        public int getGrade() {
            return grade;
        }

        public String getStudent() {
            return gradeAndLastName;
        }
    }
}
