package CollectionsExamples;

import java.util.LinkedList;

public class LinkedListExaple {
    public static void main(String[] args) {
        LinkedList<String> Playlist=new LinkedList<>();
        Playlist.addFirst("song A");
        Playlist.addLast("Song B");
        Playlist.addLast("Song C");
        Playlist.addFirst("Song D");

//        System.out.println(Playlist.size());
//        System.out.println(Playlist);
        for(int i=0; i<Playlist.size(); i++){
            System.out.println("Songs: "+Playlist.get(i));
        }

        Playlist.removeFirst();
        Playlist.removeLast();

        for(int i=0; i<Playlist.size(); i++){
            System.out.println("Songs: "+Playlist);
        }

    }
}
