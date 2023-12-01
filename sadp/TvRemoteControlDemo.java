

import java.util.Scanner;

interface Command {
 void execute();
}

class TvOnCommand implements Command {
 private Tv tv;

 public TvOnCommand(Tv tv) {
     this.tv = tv;
 }

 @Override
 public void execute() {
     tv.turnOn();
 }
}

class TvOffCommand implements Command {
 private Tv tv;

 public TvOffCommand(Tv tv) {
     this.tv = tv;
 }

 @Override
 public void execute() {
     tv.turnOff();
 }
}

class Tv {

 private boolean isOn = false;

 public void turnOn() {
     isOn = true;
     System.out.println("TV is ON");
 }

 public void turnOff() {
     isOn = false;
     System.out.println("TV is OFF");
 }

}

class RemoteControl {
 private Command command;

 public void setCommand(Command command) {
     this.command = command;
 }

 public void pressButton() {
     command.execute();
 }
}

public class TvRemoteControlDemo {
 public static void main(String[] args) {
     Tv livingRoomTv = new Tv();
     TvOnCommand tvOn = new TvOnCommand(livingRoomTv);
     TvOffCommand tvOff = new TvOffCommand(livingRoomTv);

     RemoteControl remote = new RemoteControl();

     Scanner scanner = new Scanner(System.in);
     int choice = 0;

     do {
         System.out.println("\nTV Remote Control Menu:");
         System.out.println("1. Turn On TV");
         System.out.println("2. Turn Off TV");

         System.out.println("3. Exit");
         System.out.print("Enter your choice: ");

         if (scanner.hasNextInt()) {
             choice = scanner.nextInt();
             switch (choice) {
                 case 1:
                     remote.setCommand(tvOn);
                     remote.pressButton();
                     break;
                 case 2:
                     remote.setCommand(tvOff);
                     remote.pressButton();
                     break;

                 case 3:
                     System.out.println("Exiting the TV remote control.");
                     break;
                 default:
                     System.out.println("Invalid choice. Please try again.");
             }
         } else {
             System.out.println("Invalid input. Please enter a number.");
             scanner.next();
         }
     } while (choice != 3);

     scanner.close();
 }
}
