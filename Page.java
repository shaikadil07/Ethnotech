class Page {
    String data;      
    Page next;     
    public Page(String data) {
        this.data = data;
        this.next = null; 
    }
}
class BrowsingHistory{
    Page head; 
    public BrowsingHistory() {
        this.head = null;
    }
    public void addPage(String data) {
        Page newPage = new Page(data); 
        newPage.next = head;           
        head = newPage;               
    }
    public void delete(String data){
        if(head==null){
            System.out.println("the history is empty");
        }
        if(head.data.equals(data)){
            head=head.next;
            System.out.println("deleted page"+data);
        }
        Page curr=head;
        Page prev=null;
        while(curr!=null && !curr.data.equals(data)){
            prev=curr;
            curr=curr.next;
        }
        if(curr==null){
            System.out.println(data+"page not found!!!");
        }
        prev.next=curr.next;
        System.out.println("deleted page"+data);
    }
    public void search(String data){
        Page curr=head;
        while(curr!=null){
            if(curr.data.equals(data)){
                System.out.println("founded "+data);
                return;
            }
            curr=curr.next;
        }
        System.out.println("Not found "+data);
    }
    public void displayHistory() {
        System.out.println("-------BROWSING HISTORY---------");
        Page current = head; 
        while (current != null) {
            System.out.println(current.data );
            current = current.next;
        }
        System.out.println("null");
        System.out.println("-------------X------------");
    }
}
public class SinglyLinkedList{
    public static void main(String args[]){
        BrowsingHistory hist=new BrowsingHistory();
        hist.addPage("geeks for geeks ");
        hist.addPage("Google news");
        hist.addPage("Weather report");
        hist.addPage("chatgpt");
        hist.addPage("claude ai");
        hist.displayHistory();
        hist.delete("chatgpt");
        hist.search("Google news");
        hist.search("chatgpt");
        hist.displayHistory();
    }
}