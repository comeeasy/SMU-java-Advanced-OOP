public class Sorter {
    private IComparable compare = null;

    public Sorter(IComparable compare) {this.compare = compare;}
    public void setComparable(IComparable compare) {this.compare = compare;}
    public void bubbleSort(FileInfo[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                  if (compare.compareTo(data[j], data[j + 1]) > 0) {
                      FileInfo temp = data[j];
                      data[j] = data[j + 1];
                      data[j + 1] = temp;
                  }
            }
        }
    }
}
