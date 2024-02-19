package prototype_pattern;

public class Main {

	public static void main(String[] args) {
		Document clonedResume = DocumentManager.getDocument("Resume");
		Document clonedCoverLetter = DocumentManager.getDocument("CoverLetter");
		
		//prepare for google
		clonedResume.filledContent("This resume is prepare for google");
		clonedCoverLetter.filledContent("This cover-letter is prepare for google");
		
		clonedResume.displayContent();
		clonedCoverLetter.displayContent();
		
		System.out.println("#######################");
		
		//prepare for amazon
		clonedResume.filledContent("This resume is prepare for amazon");
		clonedCoverLetter.filledContent("This cover-letter is prepare for amazon");
		
		clonedResume.displayContent();
		clonedCoverLetter.displayContent();
	}

}
