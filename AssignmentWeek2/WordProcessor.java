import java.util.Map;
import java.util.HashMap;

public class WordProcessor {
    private ISpellChecker spellChecker;
    private Map<String, DocConverter> docConverters;
    private String fileName;

    public WordProcessor(String fileName) {
        this.docConverters = new HashMap<String, DocConverter>();
        this.fileName = fileName;
    }

    public void addDocConverter(DocConverter converter) {
        this.docConverters.put(converter.getExtension(), converter);
    }

    public void convertDocTo(String ext) {
        try {
            this.docConverters.get(ext).save(this.fileName);
        }
        catch(NullPointerException e) {
            System.out.println(ext + "파일 형식을 지원하는 DocConverter가 없습니다.");
        }

    }

    public void setSpellChecker(ISpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void checkSpelling() {
        this.spellChecker.check();
    }
}