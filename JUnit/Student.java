import java.util.*;

public class Student {
  
  //give name and age to Student
  
  public Student(String name, int age) {
    //instantiate name and age
  }
  
  public String getName () {
    return this.name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  //write getter and setter for Age
  
 
  public void getOlder() {
    if (this.age < 50)
      this.age += 10;
  }
}
