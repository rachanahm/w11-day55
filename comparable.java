import java.util.ArrayList;
import java.util.Collections;
class Person implements Comparable<Person>{
  String name;
  int age;
  double height;
  Person(String name,int age,double height){
    this.name=name;
    this.age=age;
    this.height=height;
  }
  String getName(){
    return name;
  }
  int getAge(){
    return age;
  }
  double getHeight(){
    return height;
  }
  public int compareTo(Person p){
    if(this.age>p.getAge()){
      return 1;
    }
    else if(this.age<p.getAge()){
      return -1;
    }
    else{
      return 0;
    }
  }
}
class comparable{
  public static void main(String args[]){
    ArrayList<Person> persons=new ArrayList<Person>();
   persons.add(new Person("rachana",22,5.6));
   persons.add(new Person("amitha",20,5.6));
   Collections.sort(persons);
    for(Person person:persons){
      System.out.println(person.getName()+" "+person.getAge()+" "+person.getHeight());
    }
  }
}