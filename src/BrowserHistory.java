public class BrowserHistory {
    private Stack backStack;
    private Stack forwardStack;
    private String currentPage;

    public BrowserHistory(){
        backStack=new Stack();
        forwardStack=new Stack();
        currentPage=null;
    }

    void visit(String url){
        if(currentPage!=null){
            backStack.push(currentPage);
        }
        currentPage=url;
        clearStack(forwardStack);
        System.out.println("Visited: " + currentPage);
        }

    public void goBack() {
        if (backStack.isEmpty()) {
            System.out.println("Cannot go back!");
            return;
        }
        if (currentPage != null) {
            forwardStack.push(currentPage);
        }
        currentPage = (String) backStack.peek(); // Önce en üstteki sayfayı al
        backStack.pop();                          // Sonra yığından çıkar
        System.out.println("Went back to: " + currentPage);
    }

                       // İleri gitme
    public void goForward() {
        if (forwardStack.isEmpty()) {
            System.out.println("Cannot go forward!");
            return;
        }
        if (currentPage != null) {
            backStack.push(currentPage);
        }
        currentPage = (String) forwardStack.peek();
        System.out.println("Went forward to: " + currentPage);
    }

    public void displayCurrentPage() {
        if (currentPage == null) {
            System.out.println("No page is currently open.");
        } else {
            System.out.println("Current page: " + currentPage);
        }
    }

    private void clearStack(Stack stack) {
        while (!stack.isEmpty()) {
            stack.pop();
        }
    }

    public void displayHistory() {
        System.out.println("\n========== BROWSER HISTORY ==========");

        System.out.println("Current page: " + currentPage);

        System.out.print("Back stack (top -> bottom): ");
        backStack.display();

        System.out.print("Forward stack (top -> bottom): ");
        forwardStack.display();

        System.out.println("=====================================");
    }
}
