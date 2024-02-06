public class Computer {

    private int storage;
    private String model;

    public Computer(int storage){
        this.storage = storage;
    }

    public int getStorage(){
        return storage;
    }

    public String setModel(String newModel){
        this.model = newModel;
        return model;
    }

    public int addStorage(int extraStorage ){
        System.out.println("How much storage do you want to add??");
        this.storage += extraStorage;
        return storage;
    }

    public void printMessage(String msg){
        if (model != null){
            System.out.println(msg);
        }
    }

}
