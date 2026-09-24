package OOPS;

public class child extends parents{

    public child(int id, String name) {
        super(id, name);
    }




    @Override
    public void eye() {
        System.out.println("pink");
    }

    public void smile(){
        System.out.println("cute");
    }
}
