package lab11;

public class Movie extends MoviesIO{
	
	private String title;
	private String category;
	private int number;
	
	public Movie(String title, String category) {
		this.title=title;
		this.category=category;
	}
	public Movie() {
		
	}
	public Movie(int number,String title, String category) {
		this.title=title;
		this.category=category;
	}
	public void setNumber(int number) {
		this.number=number;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public void setCategory(String category) {
		this.category=category;
	}
	public int getNumber() {
		return this.number;
	}	
	public String getTitle() {
		return this.title;
	}
	public String getCategory() {
		return this.category;
	}
	@Override
	public String toString() {

		return String.format("Movie: Number=%d,Title=%s,Category=%s]",number,title,category);
	}

}
