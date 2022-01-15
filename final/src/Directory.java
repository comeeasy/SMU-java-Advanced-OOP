
public class Directory extends IFile{
    private int fileSize;
    private IFile[] files;
    private int idx;

    public Directory(String dirName) {
        super(dirName, 0);
        this.fileSize = 0;
        this.files = new IFile[10];
        this.idx = 0;
    }

    public IFile getFile(int index) {
        return files[index];
    }

    public int getSize() {
        return fileSize;
    }

    public void addFile(File file) {
        this.files[idx++] = file;
        this.setSize(this.getSize() + (file.getSize()));
    }

    public void removeFile(IFile f) {
        for(int i=0; i<idx; ++i) {
            if (files[i].equals(f)) {
                files[i] = null;
            }
        }
    }

    public String toString() {
        return "Directory: " + getName() + "크기: " + getSize();
    }

    public void copy(IFile f, boolean replace) {
        if (replace == true) {

        }
    }
}
