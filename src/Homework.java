public class Homework {

    /*

    A. Time Complexity

Operation                 | Singly LL | Doubly LL | Stack (LL) | Queue (LL)
--------------------------+-----------+-----------+------------+-----------
Insert at beginning       | O(1)      | O(1)      | O(1)       | O(1)
Insert at end             | O(n)      | O(1)      | O(n)/N/A   | O(1)
Delete from beginning     | O(1)      | O(1)      | O(1)       | O(1)
Delete from end           | O(n)      | O(1)      | O(n)/N/A   | O(n)
Access the middle element | O(n)      | O(n)      | O(n)       | O(n)
Search for a value        | O(n)      | O(n)      | O(n)       | O(n)
Peek at first/top element | O(1)      | O(1)      | O(1)       | O(1)

B. Scenarios

1. Stack (linked list) or Singly Linked List.
Both insert and delete at the front are O(1) because we use head or top directly.

2. Doubly Linked List.
It has next and prev pointers, so we can move forward and backward. also tail helps remove the last node in O(1), while Singly Linked List takes O(n).

3. Queue (linked list).
Insert (enqueue) is O(1) and delete (dequeue) is O(1). Stack is LIFO (last in, first out), so the first print job stays at the bottom. Printer needs FIFO (first in, first out).

C. Sequence (10 -> 20 -> 30 -> 40 -> 50 -> null, no tail)

a.
1. Insert 5 at beginning: O(1)
2. Insert 60 at end: O(n)
3. Delete 30: O(n)
4. Search 40: O(n)
5. Delete last node: O(n)
6. Access middle element: O(n)

b. Operations 2, 3, 4, 5, and 6 need traversal. Operation 1 only changes head.

c. It becomes O(1) because tail and prev give direct access to the last and second-to-last nodes.

d. Operations 2, 3, 4, 5, and 6 become much slower (O(n)). Operation 1 stays fast (O(1)).

     */
}
