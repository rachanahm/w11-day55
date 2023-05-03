import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person {
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
}

class AgeComparator implements Comparator<Person> {
  public int compare(Person p1, Person p2) {
    if (p1.getAge() > p2.getAge()) {
      return 1;
    } else if (p1.getAge() < p2.getAge()) {
      return -1;
    } else {
      return 0;
    }
  }
}

class comparator{
  public static void main(String args[]){
    ArrayList<Person> persons=new ArrayList<Person>();
    persons.add(new Person("rachana",22,5.6));
    persons.add(new Person("amitha",20,5.6));
    Collections.sort(persons, new AgeComparator());
    for(Person person:persons){
      System.out.println(person.getName()+" "+person.getAge()+" "+person.getHeight());
    }
  }
}
