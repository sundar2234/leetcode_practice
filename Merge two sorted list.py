class ListNode:
    def _init_(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode()
        op = dummy
        while list1 and list2:
            if list1.val <= list2.val:
                op.next = list1
                list1 = list1.next
            else:
                op.next = list2
                list2 = list2.next
            op = op.next
        op.next = list1 if list1 else list2
        return dummy.next
