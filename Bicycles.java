
class Bicycle{

  static int cadence=0;
  static int gear=0;
  static int speed=0;

 public Bicycle(int cadence,int gear,int speed){

  this.cadence=cadence;
  this.gear=gear;
  this.speed=speed;

 }

 public void printStates(){

  System.out.println("Cadence: "+cadence);
  System.out.println("Gear: "+gear);
  System.out.println("Speed: "+speed);

 }

 public static void changeCadence(int nc){

  cadence=nc;

 }

 public static void changeGear(int ng){

   gear=ng;
 }

 public static void speedUp(int su){

   int va=su+=speed;
 }

 public static void applyBrakes(int ab){

   int vf=speed-=ab;
 }

}

public class Bicycles {

    public static void main(String[] args){

      Bicycle bike1 = new Bicycle(10,20,30);
      Bicycle bike2 = new Bicycle(15,25,35);

      bike1.printStates();
      bike2.printStates();

      bike1.changeCadence(10);
      bike1.changeGear(5);
      bike1.speedUp(30);
      bike1.applyBrakes(5);

      bike1.printStates();
      bike2.printStates();
    }
}
