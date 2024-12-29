package Collectionframework;
public class Animal implements Comparable<Animal> {
    int age;
    String name;
    int weight;
    public Animal(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Animal [age=" + age + ", name=" + name + ", weight=" + weight + "]";
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public int getWeight() {
        return weight;
    }
    @Override
    public int compareTo(Animal o) {
        // TODO Auto-generated method stub
        if(this.age==o.age){//agar age same hai toh naem k basis pr sort krdiya
            return this.name.compareTo(o.name);
        }
       return this.age-o.age;
    }
    

    

    
}
