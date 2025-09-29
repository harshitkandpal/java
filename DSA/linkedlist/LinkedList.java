
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}


public class LinkedList {
    Node head;
    
    public void insert(int data){
        Node newNode =  new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next=newNode;

    }

    public void delete(){
        if(head == null) return;
        if(head.next == null){ head = null; return;}
        Node temp = head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.display();   // 10 20 30 

        list.delete();
        list.display();   // 10 20
    }
}
