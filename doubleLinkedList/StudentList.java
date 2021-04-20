package doubleLinkedList;

import java.util.Scanner;

public class StudentList {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        linkedLIstOfStudent link = new linkedLIstOfStudent();
        System.out.println("press 1 for creating");
        System.out.println("press 2 for inserting at the beginning:");
        System.out.println("press 3 for inserting at the end:");
        System.out.println("press 4 to insert at any position:");
        System.out.println("press 5 to delete from the beginning");
        System.out.println("press 6 to delete from the end");
        System.out.println("press 7 to delete from any position");
        System.out.println("press 8 to search with registration number");
        System.out.println("press 9 to display from front to end");
        System.out.println("press 10 to display from end to front");
        System.out.println("press any key greater than 10 to exist");
        boolean control = true;
        while(control){
            System.out.println("Enter the function key which you want");
            int choice = in.nextInt();
            in.nextLine();
            switch(choice){
                case 1:
                    link.creatNode();
                    break;
                case 2:
                    link.insertAtTheBeginning();
                    break;
                case 3:
                    link.insertEndOfList();
                    break;
                case 4:
                    link.insertAtPosition();
                    break;
                case 5:
                    link.delBeg();
                    break;
                case 6:
                    link.delEnd();
                    break;
                case 7:
                    link.delAny();
                    break;
                case 8:
                    link.search();
                    break;
                case 9:
                    link.displayFrontToEnd();
                    break;
                case 10:
                    link.displayEndToFront();
                    break;
                default:
                    control = false;
                    System.out.println("you get out of the system, Thank you!!");
            }
        }

    }
}
