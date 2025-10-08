import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] args) {
        int mark,totalMarks=0,highestMark=0,lowestMark=0,counter=0;
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("enter mark of student " + (counter + 1)+": ");
            mark = input.nextInt();

            if(mark == -1)
                break;

            if(mark>highestMark)
                highestMark=mark;
            else if (mark<highestMark) {
                lowestMark=mark;
            }

            totalMarks+=mark;

            counter++;


        }while (mark!=-1);

        System.out.println(highestMark+" \n"+lowestMark+" \n"+totalMarks);
    }
}
