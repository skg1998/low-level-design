package prototype_pattern;

public class Resume implements Document{
	private String content;
	
	public Resume() {
		this.content = "Default content is set for resume";
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
		return new Resume();
	}

}
