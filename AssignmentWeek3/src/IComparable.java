public interface IComparable {
    int compareTo(FileInfo o1, FileInfo o2);
}

class CompareFileName implements IComparable {
    public int compareTo(FileInfo o1, FileInfo o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class CompareSize implements IComparable {
    public int compareTo(FileInfo o1, FileInfo o2) {
        return o1.getSize() - (o2.getSize());
    }
}

class CompareModifiedDate implements IComparable {
    public int compareTo(FileInfo o1, FileInfo o2) {
        return o1.getModifiedDate().compareTo(o2.getModifiedDate());
    }
}

class CompareFileType implements IComparable {
    public int compareTo(FileInfo o1, FileInfo o2) {
        return o1.getType().compareTo(o2.getType());
    }
}




