package practiceTest1;

class Fruit{
    String name;
    String taste;
    Fruit(){
        
    }
    public void eat(){
        System.out.println("The name of fruit is "+this.name+" and taste is "+this.taste);
    }
}

class Apple extends Fruit{
    public void eat(){
        System.out.println("The taste of an apple is "+ this.taste);
    }
}

class Orange extends Fruit{
    public void eat(){
        System.out.println("The taste of an Orange is "+ this.taste);
    }
}


public class question1
{
	public static void main(String[] args) {
	    Fruit f=new Fruit();
	    f.name="Sapota";
	    f.taste="Sweet";
	    f.eat();
	    Fruit f1=new Apple();
	    f1.name="Apple";
	    f1.taste="Sweet";
	    f1.eat();
		
	}
}