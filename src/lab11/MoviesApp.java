package lab11;

import java.util.LinkedList;
import java.util.Scanner;

public class MoviesApp extends MoviesIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		LinkedList<Movie> list = new LinkedList<>();
		LinkedList<String> userChoiceOfCategory = new LinkedList<>();
		boolean yesNo;
		System.out.println("Welcome to the Movie List Application");
		for (int i = 0; i <=100; i++) {
			list.add(getMovie(i));
		}
		System.out.println("There are 100 movies in this list.");
		do {
			System.out.println("What category are you interested in?");
			System.out.println("Choices: \n1.animated\n2.comedy\n3.drama\n4.horror\n5.musical\n6.scifi");
			int userInput = scnr.nextInt();
			scnr.nextLine();
			String category = "x";
			switch (userInput) {
			case 1:
				category = "animated";
				break;
			case 2:
				category = "comedy";
				break;
			case 3:
				category = "drama";
				break;
			case 4:
				category = "horror";
				break;
			case 5:
				category = "musical";
				break;
			case 6:
				category = "scifi";
				break;
			default:
				System.out.println("No such category!");
				break;
			}
			userChoiceOfCategory = findCategory(list, category);
			userChoiceOfCategory.sort(null);
			for (int i = 0; i < userChoiceOfCategory.size(); i++) {
				System.out.println(userChoiceOfCategory.get(i));
			}
			yesNo = Validator.getYesNo(scnr, "Do you want to continue?(y/n)");
		} while (yesNo);
		System.out.println("Thanks for using the application!");
		scnr.close();

	}

	public static LinkedList<String> findCategory(LinkedList<Movie> lists, String category) {
		LinkedList<String> title = new LinkedList<>();
		for (Movie m : lists) {
			if (m.getCategory().equalsIgnoreCase(category)) {
				title.add(m.getTitle());
			}

		}
		return title;
	}

}
