public class OdtDocConverter extends DocConverter{
    public OdtDocConverter() {
        super("odt");
    }

    public void save(String fileName) {
        System.out.println(fileName + "." + this.getExtension() + " 로 변환하여 저장합니다.");
    }
}