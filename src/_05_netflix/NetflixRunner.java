package _05_netflix;

public class NetflixRunner {
	public static void main(String[] args) {
		Movie lastJedi = new Movie("The Last Jedi", 3);
		Movie httyd = new Movie("How to Train Your Dragon 2", 5);
		Movie timeTravelAndTimeSkip = new Movie("Endgame",4);
		Movie notAMovie = new Movie("The 100", 6);
		Movie dunyayiKurtaranAdam = new Movie("Dünyayı Kurtaran Adam", 0);
		System.out.println(dunyayiKurtaranAdam.getTicketPrice());
		NetflixQueue netflix = new NetflixQueue();
		netflix.addMovie(lastJedi);
		netflix.addMovie(httyd);
		netflix.addMovie(timeTravelAndTimeSkip);
		netflix.addMovie(notAMovie);
		netflix.addMovie(dunyayiKurtaranAdam);
		System.out.println("The best movie in this queue is " + netflix.getMovieWithRatingNumber(0));
		System.out.println("The second best movie in this queue is " + netflix.getMovieWithRatingNumber(1));
	}

}
