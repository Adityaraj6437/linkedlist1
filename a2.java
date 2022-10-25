public class a2 {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    public void addfirst(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
            newnode.next=head;
            head=newnode;
    }
    public void addlast(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node currnode=head;
        while(currnode.next!=null){
            currnode=currnode.next;
        }
        currnode.next=newnode;
    }
    public void printdata(){
        if(head==null){
            System.out.println("this is empty");
            return;
        }
        Node currnode=head;
        while(currnode!=null){
            System.out.println(currnode.data + "-> ");
            currnode=currnode.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        a2 a21=new a2();
        a21.addfirst("1");
        a21.addlast("2");
        a21.addfirst("3");
        a21.printdata();
    }
}
