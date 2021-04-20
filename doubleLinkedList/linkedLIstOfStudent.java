package doubleLinkedList;

import java.util.Scanner;

public class linkedLIstOfStudent {

    Node first;
    Node end;
    Scanner in = new Scanner(System.in);

    public void creatNode(){
     System.out.println("start to creat a node");
        System.out.println("enter students registration no");
        int reg = in.nextInt();
        System.out.println("enter students mark");
        float mark = in.nextFloat();
        Node newNode = new Node(reg,mark);
        if(first == null) {
          end = newNode;
          first = end;

        }
        else {
            first.prev = newNode;
            newNode.next = first;
        }
        first = newNode;
    }
    public void insertAtTheBeginning(){
        System.out.println("start inserting of Nodes in the beginning");
            System.out.println("enter students registration no");
            int reg = in.nextInt();
            System.out.println("enter students mark");
            float mark = in.nextFloat();
            Node newNode = new Node(reg, mark);
            newNode.next = first;

            if(first == null){
                end = newNode;
                first = end;

            }
            else {
                first.prev = newNode;
                newNode.next = first;
            }
            first = newNode;
    }
    public void insertEndOfList(){
        System.out.println("enter new node at the end");

            System.out.println("enter students registration no");
            int reg = in.nextInt();
            System.out.println("enter students mark");
            float mark = in.nextFloat();
            Node newNode = new Node(reg, mark);


            if(first == null){
                first = newNode;
                end = first;
            }
            else{
                end.next = newNode;
                newNode.prev = end;
            }
            end = newNode;

    }
    public void insertAtPosition(){

        if(first==null){
            System.out.println("you can only insert at the beginning");
            System.out.println("enter students registration no");
            int reg = in.nextInt();
            System.out.println("enter students mark");
            float mark = in.nextFloat();
            Node newNode = new Node(reg, mark);
            if(first == null){
                end = newNode;
                first = end;
            }
            else {
                first.prev = newNode;
            }
            first = newNode;
        }
        else{
        System.out.println("Enter the position number which you want to insert");

        int position = in.nextInt();
            Node temp = first;
        for(int i= 1;i<=position;i++) {
            if(temp == null) {
                System.out.println("the position you enter does not exist please enter again");
               break;
            }
            else if(i == position-1){
                if(temp == end){
                    insertEndOfList();
                    break;
                }
                System.out.println("enter students registration no");
                int reg = in.nextInt();
                System.out.println("enter students mark");
                float mark = in.nextFloat();
                Node newNode = new Node(reg, mark);
                Node curr = temp.next;
                temp.next = newNode;
                newNode.next = curr;
                curr.prev = newNode;
                newNode.prev = temp;
            }
            temp = temp.next;
        }
        }
    }
    public void delBeg(){

        if(first == null)
            System.out.println("the link is empty");
        else if(first.next ==null){
            first = end =null;
            System.out.println("the link is now empty ");
        }

        else {
            Node temp = first.next;
            temp.prev = null;
            first = temp;
            System.out.println("first Node is deleted successfully");
        }
    }
    public void delEnd(){
        if(first == null){
            System.out.println("the link is empty");
        }
        else if(first.next ==null){
            first = end =null;
            System.out.println("the link now empty ");
        }
        else {
            Node temp = end.prev;
            temp.next = null;
            end = null;
            end = temp;
            System.out.println("last Node is deleted successfully");
        }
    }
    public void delAny(){
        if(first==null){
            System.out.println("link is empty");
        }
        else{
            System.out.println("Enter the delete position");
            int delPos = in.nextInt();
            if(delPos==1)
                delBeg();
            else{
            Node temp =first;
            for(int i = 1;i< delPos;i++){
                if(temp == null){
                    System.out.println("out of list");
                    break;
                }
                if(temp == end){
                    delEnd();
                    break;
                }
                    temp = temp.next;
            }
            Node nextNode = temp.next;
            Node prevNode = temp.prev;
            prevNode.next = nextNode;
            nextNode.prev = prevNode;
            System.out.println("the required Node is deleted successfully ");
        }}

    }
    public void search(){
        System.out.println("Enter the required registration number:");
        int regNo = in.nextInt();
        Node curr = first;
        while(curr!=null){
            if(regNo == curr.regd_no){
                System.out.println("present student registration number: "+curr.getRegd_no()+" and mark is: "+curr.getMark());
                break;
            }
            curr = curr.next;
             if(curr==null){
                System.out.println("not present");
                break;
            }
             curr = curr.next;
        }
    }

    public void displayFrontToEnd(){
         Node curr = first;
         while(curr!=null){
             System.out.println("student registration number is:"+curr.getRegd_no()+" and mark is: "+curr.getMark());
             curr = curr.next;
         }
    }
    public void displayEndToFront(){
        Node last = end;
        while(last!=null){
            System.out.println("student registration number is:"+last.getRegd_no()+" and mark is: "+last.getMark());
            last = last.prev;
        }
    }
}
