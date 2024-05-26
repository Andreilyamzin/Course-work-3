import java.util.Objects;

public class Student {
    int age;
    String name;

    @Override
    public boolean equals(Object o){
        if ( this == o ){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Student student = (Student) o;
        if (this.age != student.age){
            return false;
        }
        return Objects.equals(this.name,student.name);
    }

    @Override
    public int hashCode(){
        int result = this.age;
        result = 40 * result + (this.name != null ? this.name.hashCode() : 0 );
        return result;
    }
}