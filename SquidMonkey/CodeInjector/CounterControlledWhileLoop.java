import java.util.Scanner;

public class CounterControlledWhileLoop {
    public static void main(String[] args) {

        String name,namesOver20="",namesStartingWithA ="";
        int count=0,totalLength=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");
        name = input.nextLine();

        while(count<10){
            System.out.println("Enter your name:");
            name = input.nextLine();

            //if(name.length()<3){
             //   System.out.println("Enter your name previous too short:");
              //  name = input.nextLine();
            //}

            if(name.length()>20){
                namesOver20+=name+"\n";
            }

            if(name.charAt(0)=='A'){
                namesStartingWithA+=name+"\n";
            }

            count++;

        }
        System.out.println("Your names over 20 are:" + namesOver20 + "\nnamesStarting with a" + namesStartingWithA +
                "\nAverage length of names " + String.format("%.0f",totalLength/10f));
    }
}
