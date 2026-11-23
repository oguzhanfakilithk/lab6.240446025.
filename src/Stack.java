public class Stack {
    private Node top;

    public Stack(){
        top=null;
    }

    boolean isEmpty(){
        return top==null;
    }

    void push(String value){
        Node newNode=new Node(value);
        if(isEmpty()){
            newNode=top;
        }else{
            newNode.next=top;
            top=newNode;
        }
    }

    void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            top=top.next;
            System.out.println("Pop is succesfull!");
        }
    }

    public String peek(){
        String topdata=top.data;
        return topdata;
    }

    void display(){
        if(isEmpty()){
            System.out.println("Empty!");
        }else{
            Node temp=top;
            while(temp!=null){
                System.out.print(temp.data+ "" + "-->");
                temp=temp.next;
            }
        }
    }
}
