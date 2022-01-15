
public class File extends IFile{

    public File(String fileName, int fileSize) {
        super(fileName, fileSize);
    }

    public String toString() {
        return "파일: " + getName() + "크기: " + getSize();
    }
}
