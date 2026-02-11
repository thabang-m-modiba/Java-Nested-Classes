public class Car{
    private String modelName;
    
    public enum DriveMode{
        ECO,
        SPORT,
        OFFROAD
    }

    public Car(String modelName){
        this.modelName = modelName;
    }

    private class Engine{
        void reTune(DriveMode mode){
            switch(mode){
                case ECO -> System.out.println("Engine: Setting fuel injection to match ECO mode.");
                case SPORT -> System.out.println("Engine: Increasing fuel injection for SPORT mode.");
                case OFFROAD -> System.out.println("Engine: Setting fuel injection to match OFFROAD mode.");
                default -> System.out.println("Standard Engine functionality.");
            }
        }
    }

    public void changeMode(DriveMode mode){
        Engine threeLitreEngine = new Engine();
        if(mode == DriveMode.ECO){
            threeLitreEngine.reTune(mode);
        }else if(mode == DriveMode.SPORT){
            threeLitreEngine.reTune(mode);
        }else if(mode == DriveMode.OFFROAD){
            threeLitreEngine.reTune(mode);
        }else{
            System.out.println("Car stucks!!!!!");
        }
    }

    public static void main(String[] args) {
        Car vw = new Car("vw Polo");
        vw.changeMode(DriveMode.ECO);
    }
}