import java.util.*;
public class Arraylists{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> playlist = new ArrayList<>();
        System.out.print("My first song: ");
        String firstSong = scanner.nextLine();
        playlist.add(firstSong);
        System.out.print("My second song: ");
        String secondSong = scanner.nextLine();
        playlist.add(secondSong);
        System.out.print("My third song: ");
        String thirdSong = scanner.nextLine();
        playlist.add(thirdSong);
        playlist.remove(1);
        System.out.println("Song at index 1: " + playlist.get(1));
        System.out.println("Contains Animal? " +
                           playlist.contains("Animal"));
        System.out.println("Playlist: " + playlist);
        scanner.close();
    }
}