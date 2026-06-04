import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Social_Media{
    static class Post {
        String text;
        Post prev, next;
        Post(String text) {
            this.text = text;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many posts do you want to add:");
        int count = Integer.parseInt(scanner.nextLine().trim());
        if (count <= 0) {
            System.out.println("No posts to display.");
            return;
        }
        List<Post> posts = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter post " + i + ": ");
            String text = scanner.nextLine();
            posts.add(new Post(text));
        }
        Post first = buildCircularFeed(posts);
        printFeed(first, count);
    }
    private static Post buildCircularFeed(List<Post> posts) {
        Post first = null;
        Post previous = null;

        for (Post post : posts) {
            if (first == null) {
                first = post;
            }
            if (previous != null) {
                previous.next = post;
                post.prev = previous;
            }
            previous = post;
        }
        if (first != null && previous != null) {
            previous.next = first;
            first.prev = previous;
        }
        return first;
    }
    private static void printFeed(Post current, int count) {
        if (current == null) {
            System.out.println("Feed is empty.");
            return;
        }

        System.out.println("\nPosts in the linked feed:");
        Post temp = current;
        for (int i = 0; i < count; i++) {
            System.out.println("Post " + (i + 1) + ": " + temp.text);
            temp = temp.next;
        }
        System.out.println("\nCurrent: " + current.text);
        System.out.println("Next: " + current.next.text);
        System.out.println("Previous: " + current.prev.text);
    }
}