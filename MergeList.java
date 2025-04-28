
class ListNode {
	int data;
	ListNode next;

	ListNode(int data) {
		this.data = data;
		this.next = null;
	}
}

class MergeList {
	ListNode mergeTwoSortedList (ListNode firstList, ListNode secondList) {
	   ListNode dummy=new ListNode(0);
		ListNode curr=dummy;
		while(firstList!=null && secondList!=null)
		{
			if(firstList.data <=secondList.data)
			{
				curr.next=firstList;
				firstList=firstList.next;
			}
			else if(secondList.data<firstList.data)
			{
				curr.next=secondList;
				secondList=secondList.next;
				
			}
			
			curr=curr.next;
		}
		if(firstList!=null)
		{
			curr.next=firstList;
			
		}
		else if(secondList!=null)
		{
			curr.next=secondList;
			
		}
		return dummy.next;
	}
}