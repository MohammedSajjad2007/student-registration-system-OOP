interface student{
    abstract public void displaydata();
}
interface payment{
    abstract public double calammount(double a);
}
class registration implements student,payment{
    private String id;
    private String name;
    registration(String id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public void displaydata(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
    public double calammount(double a){
        if(a > 300000){
            a = a - (a * 0.05);
            return a;
        }
         else {
             return a;
        }
    }

}
class driver{
    public static void main(String args[]){
       registration r1 = new registration("S001" , "Alex");


        r1.displaydata();
        System.out.println("Discounted price: " + r1.calammount(300000));

    }
}
