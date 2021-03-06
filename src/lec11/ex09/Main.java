package lec11.ex09;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		while(s.hasNextLine()) {
			try {
				String name = s.nextLine();
				String artist = s.nextLine();
				double length = s.nextDouble();
				int rating = s.nextInt();

				Song a_song = new Song(name, artist, length, rating);

				System.out.println("Created song: " + a_song.toString());
				s.nextLine();
			}
			catch (RatingOutOfRangeException e) {
				System.out.println("Rating out of range:" + e.getOutOfRangeRating());
				s.nextLine();
			} 
			catch (NegativeSongLengthException e) {
				System.out.println("Length is negative: " + e.getIllegalLength());
				s.nextLine();
			} 
			catch (RuntimeException e) {
				System.out.println("Runtime exception: " + e.getMessage());
				s.nextLine();
			}
			

		}
		s.close();
	}

}
