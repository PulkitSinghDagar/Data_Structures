public class LL {
    Node head;
    class Node{
        String data;
        Node next;
        Node( String data){
            this.data=data;
            this.next=null;
        }
    }
    public void addfirst(String data){
        Node newnode= new Node(data);
        if (head==null){
            head=newnode ;//de
            return;
        }
        newnode=head;
        head=newnode;
    }
    void addlast(String data){
        Node newnode= new Node(data);
                if(head==null){
                    head= newnode;//de
                    return;
                }
        Node Currentnode= head;//we are pointing the current node to head and traversing the current node
        while (Currentnode!=null){
            Currentnode=Currentnode.next;
        }
        Currentnode=Currentnode.next;
    }
    //print the nodes
    void Printlist(){
        Node currentNode=head;
        while (currentNode!=null){
            System.out.println(currentNode.data);
            currentNode=currentNode.next;
        }
        System.out.println("null");
    }
    public void deletefirst(){
        if (head==null){
            System.out.println("empty");
            return;
        }
        head=head.next;
    }
    public void deletelast(){
        if (head==null){
            System.out.println("empty");
            return;
        }
        if (head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while (lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

    public static void main(String[] args) {
        LL list=new LL();
        list.addfirst("this");
        list.Printlist();
    }
}
