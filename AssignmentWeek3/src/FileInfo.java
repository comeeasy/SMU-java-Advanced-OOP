import java.util.Date;

public class FileInfo {
    private String name = "";
    private String type = "";
    private int size = -1;
    private Date modifiedDate = null;

    public FileInfo(String name, String type, int size, Date modied) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.modifiedDate = modied;
    }

    public String getName() {return name;}
    public String getType() {return type;}
    public int getSize() {return size;}
    public Date getModifiedDate() {return modifiedDate;}

    @Override
    public String toString() {
        return "name='" + name + '\n' +
                "type='" + type + '\n' +
                "size=" + size + '\n' +
                "modifiedDate=" + modifiedDate;
    }
}
