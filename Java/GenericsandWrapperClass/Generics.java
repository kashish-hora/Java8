package GenericsandWrapperClass;

public class Generics {
    public static void main(String [] args){
        Dog<String,String> d1=new Dog<>("asdf546","leo");
        Dog<String,Integer> d2=new Dog<>("asdf546",123);

        Dog<Integer,String> d3=new Dog<>(10,"leo");

        System.out.println(d3.getid());
        System.out.println(d3.id.getClass()
.getName());
        
    }
    
}
class Dog<E,V>{
    E id;
    V name;
    public Dog(E id,V name){
        this.id=id;
        this.name=name;

    }
    E getid(){
        return id;
    }
    
}
