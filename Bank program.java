abstract class Bank{  
abstract void rateofinterest();  
}  
//In real scenario, implementation is provided by others i.e. unknown by end user  
class panjab extends Bank{  
void rateofinterest(){System.out.println("20%");}  
}  
class ICICI extends Bank{  
void rateofinterest(){System.out.println("30%");}  
}  
//In real scenario, method is called by programmer or user  
class TestAbstraction1{  
public static void main(String args[]){  
Bank s=new panjab();//In a real scenario, object is provided through method, e.g., getShape() method  
s.rateofinterest();
}
}
