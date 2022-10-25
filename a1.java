public class a1 {
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
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addlast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("this is empth");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.println(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        a1 a11=new a1();
        a11.addfirst("1");
        a11.addlast("2");
        a11.addfirst("3");
        a11.print();
    }
}
