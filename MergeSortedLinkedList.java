/*
  Node is defined as
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class MergeSortedLinkedList {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node dummy=new Node(0);
        Node temp=dummy;
        Node temp1=head1;
        Node temp2=head2;
        while(temp1!=null && temp2!=null)
        {
            if(temp1.data <temp2.data)
            {
                temp.next=temp1;
                temp=temp1;
                temp1=temp1.next;
            }
            else{
                temp.next=temp2;
                temp=temp2;
                temp2=temp2.next;
            }
        }
        while(temp1!=null)
        {
            temp.next=temp1;
            temp=temp1;
            temp1=temp1.next;
        }
         while(temp2!=null)
        {
            temp.next=temp2;
            temp=temp2;
            temp2=temp2.next;
        }
        return dummy.next;
    }
}