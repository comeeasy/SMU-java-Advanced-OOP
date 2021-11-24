public class NameSorter extends Sorter{
    @Override
    public int compare(Person data1, Person data2) {
        return data1.getName().compareTo(data2.getName());
    }
}
