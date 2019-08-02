package apithree.demo;

public class Student {
    private Long Id;
    private String studentName;
    private int studentNumber;

    public Student(String studentName, int studentNumber) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
    }
    private Student(){}

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
    @Override
    public String toString() {
        return  "Student{"+
                "id=" + Id +
                ",studentName='" + studentName +'\'' +
                ",studentNumber='"+ studentNumber + '}';
    }
}
