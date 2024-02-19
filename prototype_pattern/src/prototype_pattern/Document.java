package prototype_pattern;

public interface Document {
	public void filledContent(String content);
	public void displayContent();
	public Document clone();
}
