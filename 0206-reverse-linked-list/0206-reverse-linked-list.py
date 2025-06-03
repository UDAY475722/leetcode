class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def reverseList(self, head):
        prev = None
        current = head

        while current:
            next_node = current.next   # save next node
            current.next = prev        # reverse pointer
            prev = current             # move prev to current
            current = next_node        # move to next node

        return prev  # new head of reversed list
