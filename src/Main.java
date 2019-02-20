public class Main {

    public static void main(String[] args) {
        Student stud=new Student();
        System.out.println(stud.getName());
        stud.setName("Hank");
        System.out.println(stud.getName());
        System.out.println(stud.getId());
        stud.setId("107021047");
        System.out.println(stud.getId());
        System.out.println(stud.getDept());
        stud.setDept("SIE");
        System.out.println(stud.getDept());
        System.out.println(stud.getTutor());
        stud.setTutor("123123");
        System.out.println(stud.getTutor());
    }
}
