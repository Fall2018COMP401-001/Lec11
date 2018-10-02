package lec11.ex11;

import java.util.Scanner;

public class MainSpecify {

	public static void main(String[] args) 
			throws NegativeSongLengthException, RatingOutOfRangeException {

		Scanner s = new Scanner(System.in);

		while(s.hasNextLine()) {
			String name = s.nextLine();
			String artist = s.nextLine();
			double length = s.nextDouble();
			int rating = s.nextInt();

			Song a_song = new Song(name, artist, length, rating);

			System.out.println("Created song: " + a_song.toString());
			s.nextLine();
		}
		s.close();
	}

}
