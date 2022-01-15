import java.util.ArrayList;

public class CompressedFile extends IFile{
    private int compressedRate;
    private IFile[] files = null;
    private int fileIdx;

    public CompressedFile(String name, int compressedRate) {
        super(name, 0);
        this.compressedRate = compressedRate;
        this.files = new IFile[10];
        this.fileIdx = 0;
    }

    public void addFile(File file) {
        this.files[fileIdx] = file;
        this.setSize(this.getSize() + (file.getSize()));
    }

    public IFile getFile(int index) {
        return files[index];
    }

    public void removeFile(IFile f) {
        this.files.remove(f);
    }

    public void uncompress() {
        this.setSize(getSize() * (100 / (100 - compressedRate)));
    }

    public void compress() {
        this.setSize(getSize() * ((100 - compressedRate / 100)));
    }

    public String toString() {
        return "파일: " + getName() + "크기: " + getSize();
    }
}
