
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(2);
		head.next = new ListNode(3);
//		System.out.println(get(head, 0).val);
//		System.out.println(get(head, 1).val);

		ListNode newhead = appendHead(head, 1);

		ListNode newtail = appendTail(newhead, 4);
		ListNode newremove = remove(newtail, 2);
		System.out.println(length(newremove));
		System.out.println(get(newtail, 0).val);
		System.out.println(get(newtail, 1).val);
		System.out.println(get(newtail, 2).val);
		//System.out.println(get(newtail, 3).val);

	}

	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			this.val = x;
		}
	}

	public static ListNode remove(ListNode head, int value) {
		if (head == null)
			return null;
		else if (head.val == value)
			return head.next;
		ListNode cur = head;
		while (cur.next != null && cur.next.val != value) {
			cur = cur.next;
		}
		if (cur.next != null) {
			cur.next = cur.next.next;
		}

		return head;
	}

	public static ListNode appendTail(ListNode head, int value) {
		ListNode newTail = new ListNode(value);
		ListNode prev = head;
		while (prev.next != null) {
			prev = prev.next;
		}
		prev.next = newTail;
		return head;
	}

	public static ListNode appendHead(ListNode head, int value) {
		ListNode newHead = new ListNode(value);
		newHead.next = head;
		return newHead;
	}

	public static ListNode get(ListNode head, int index) {
		while (index > 0 && head != null) {
			head = head.next;
			index--;
		}
		return head;
	}

	public static int length(ListNode head) {
		if (head == null)
			return 0;
		int len = 0;
		while (head != null) {
			len++;
			head = head.next;
		}
		return len;
	}

}
