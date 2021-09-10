public class PdfDocConverter extends DocConverter {
    public PdfDocConverter() {
        super("pdf");
    }

    public void save(String fileName) {
        System.out.println(fileName + "." + this.getExtension() + " 로 변환하여 저장합니다.");
    }
}