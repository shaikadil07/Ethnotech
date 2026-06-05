class Post{
    String data;
    Post next;
    Post prev;
    public Post(String data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class SocialMediaFeed{
    Post head;
    Post tail;
    public SocialMediaFeed(){
        this.head=null;
        this.tail=null;
    }
    public void addPost(String data){
        Post newPost=new Post(data);
        if(head==null && tail==null){
            head=newPost;
            tail=newPost;
        }
        else{
        newPost.next=head;
        head.prev=newPost;
        head=newPost;
        }
    }
    public void deletePost(String data){
        if(head==null){
            System.out.println("feed is empty");
        }
        if(head.data.equals(data)){
            head=head.next;
            head.prev=null;
            return;
        }
        Post curr=head;
        Post previous=null;
        while(curr!=null && !curr.data.equals(data)){
            previous=curr;
            curr=curr.next;
        }
        if(curr==null){
            System.out.println("Post not found");
            return;
        }
        curr=curr.next;
        previous.next=curr;
        curr.prev=previous;

    }
    public void insertSponseredPost(int position,String data){
        if(position<0){
            System.out.println("can't insert add at this position");
        }
        Post newPost=new Post(data);
        if(position==0){
            head.prev=newPost;
            newPost.next=head;
            head=newPost;
        }
        Post curr=head,previous=null;int count=0;

        while(curr!=null && count<position){
           count++;
           previous=curr;
           curr=curr.next;
        }
        

        newPost.next = curr;
        newPost.prev = previous;
        previous.next = newPost;
        curr.prev = newPost;

        System.out.println("posted successfully");
    }
    public void displayFromFirst(){
        Post curr=head;
        System.out.print("null <-->");
        while(curr!=null){
            System.out.print(curr.data+"<-->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public void displayFromLast(){
        Post curr=tail;
        System.out.print("null <-->");
        while(curr!=null){
            System.out.print(curr.data+"<-->");
            curr=curr.prev;
        }
        System.out.println("null");
    }
}
public class SocialMediaFeedNavigation {
    public static void main(String args[]){
        SocialMediaFeed insta=new SocialMediaFeed();
        insta.addPost("peddi song");
        insta.addPost("vb tech update");
        insta.addPost("prank video");
        insta.addPost("home tour");
        insta.insertSponseredPost(2,"flipkart dresses");
        insta.displayFromFirst();
        insta.deletePost("prank video");
        insta.displayFromFirst();
    }
    
}