public class Computer {

    private int storage;
    private String model;

    public Computer(int storage){
        this.storage = storage;
    }

    public int getStorage(){
        return storage;
    }

    public void setModel(String newModel){
        this.model = newModel;
    }

    public void addStorage(int extraStorage ){
        System.out.println("How much storage do you want to add??");
        this.storage += extraStorage;
    }

    public void printMessage(){
        if (model != null){
            System.out.println("Your model is " + model);
        }
    }

}
