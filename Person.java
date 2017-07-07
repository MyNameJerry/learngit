public class Person{
	
    private String name;
    
    private Integer age;

    public Person(String name,Integer age){

	this.name = name;
	this.age = age;
    }
    
    public sayHello (){
	
	System.out.ptintln("Hello" + name);
    }

    public static void main(String[] args){

    	Person person = new Person("Jerry",17);
    }
}

