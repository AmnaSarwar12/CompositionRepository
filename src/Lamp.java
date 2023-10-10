public class Lamp {
    //coding excersize
    private String Style;
    private Boolean Battery;
    private int globeRating;

    public Lamp(String style, Boolean battery, int globeRating) {
        Style = style;
        Battery = battery;
        this.globeRating = globeRating;
    }

    public void turnOn(){
        System.out.println("the lamp is turned on");
    }

    public String getStyle() {
        return Style;
    }

    public boolean isBattery(){
        return Battery;
    }

    public int getGlobeRating() {
        return globeRating;
    }
}

 class Bed{
    private String Style;
    private int Pillow;
    private int Sheet;
    private int height;
    private int Quilt;

     public Bed(String style, int pillow, int sheet, int height, int quilt) {
         Style = style;
         Pillow = pillow;
         Sheet = sheet;
         this.height = height;
         Quilt = quilt;
     }

     public String getStyle() {
         return Style;
     }

     public int getPillow() {
         return Pillow;
     }

     public int getSheet() {
         return Sheet;
     }

     public int getHeight() {
         return height;
     }

     public int getQuilt() {
         return Quilt;
     }

     public void make(){
         System.out.println("bed is being made!");
     }
 }

 class Ceiling{
    private int height;
    private int printedColor;

     public Ceiling(int height, int printedColor) {
         this.height = height;
         this.printedColor = printedColor;
     }

     public int getHeight() {
         return height;
     }

     public int getPrintedColor() {
         return printedColor;
     }
 }

 class Wall{
    private String Direction;

     public Wall(String direction) {
         Direction = direction;
     }

     public String getDirection() {
         return Direction;
     }
 }

 class Bedroom{
    private String name;

    private Wall wall1,wall2,wall3,wall4;

    private Ceiling ceiling;
    private Bed bed;

    private Lamp lamp;

     public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
         this.name = name;
         this.wall1 = wall1;
         this.wall2 = wall2;
         this.wall3 = wall3;
         this.wall4 = wall4;
         this.ceiling = ceiling;
         this.bed = bed;
         this.lamp = lamp;
     }

     public Lamp getLamp() {
         return lamp;
     }

     public void makeBed(){
         System.out.println("bed is being made");
         this.bed.make();
     }
 }
