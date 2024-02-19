package prototype_pattern;

public class CoverLetter implements Document{
private String content;
	
	public CoverLetter() {
		this.content = "Default content is set for cover letter";
	}
	
	@Override
	public void filledContent(String content) {
		this.content = content;
	}

	@Override
	public void displayContent() {
		System.out.println(this.content);
	}
	
	@Override
	public Document clone() {
		return new CoverLetter();
	}

}
