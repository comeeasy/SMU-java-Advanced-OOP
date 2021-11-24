public class AgeSorter extends Sorter {
    @Override
    public int compare(Person data1, Person data2) {
        return data1.getAge() - data2.getAge();
    }
}
