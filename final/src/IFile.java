
public abstract class IFile {
    private String fileName = "";
    private int fileSize = 0;

    public IFile(String fileName, int fileSize) {
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    public String getName() {
        return fileName;
    }

    public int getSize() {return fileSize;}
    public void setSize(int fileSize) {this.fileSize = fileSize;}

    public boolean equals(IFile f) {
        if (getName().equals(f.getName())) {
            return true;
        } else {
            return false;
        }
    }

}
