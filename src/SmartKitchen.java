import java.awt.image.SampleModel;

public class SmartKitchen {

    private coffeeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWasher dishWasher;

    public SmartKitchen(){
        brewMaster = new coffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public coffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag){
        brewMaster.setHasWorkToDo(coffeeFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}

class coffeeMaker {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("brewing coffee");
            hasWorkToDo = false;
        }
    }
}

    class Refrigerator {
        private boolean hasWorkToDo;

        public void setHasWorkToDo(boolean hasWorkToDo) {
            this.hasWorkToDo = hasWorkToDo;
        }

        public void orderFood() {
            if (hasWorkToDo) {
                System.out.println("food is cooking");
                hasWorkToDo = false;
            }
        }
    }

        class DishWasher {
            private boolean hasWorkToDo;

            public void setHasWorkToDo(boolean hasWorkToDo) {
                this.hasWorkToDo = hasWorkToDo;
            }

            public void doDishes() {
                if (hasWorkToDo) {
                    System.out.println("washing dished");
                    hasWorkToDo = false;
                }
            }

}
