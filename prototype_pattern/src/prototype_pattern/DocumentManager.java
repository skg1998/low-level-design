package prototype_pattern;

import java.util.HashMap;

public class DocumentManager {
	public static HashMap<String, Document> documentMap = new HashMap<>();
	static {
		documentMap.put("Resume", new Resume());
		documentMap.put("CoverLetter", new CoverLetter());
	}
	
	public static Document getDocument(String documentType) {
		Document document = documentMap.get(documentType);
		return document != null ? document.clone(): null;
	}
}
