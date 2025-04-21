abstract class Beverage{
    void pour(int qty){
        System.out.println("Pour"+ qty + "ml of beverage");
    }
    abstract void addCondiment();
    
    void stir(){}
    void serve(){
        System.out.println("Serve through waiter");
    }
    
    public void templateMethod(int qty){
        pour(qty);
        addCondiment();
        stir();
        serve();
        
    }
    
}