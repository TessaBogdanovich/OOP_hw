
public class StreamComparator implements Comparator<StudentGroup> {
    public StreamComparator() {
    }


    public int compare(StudentGroup o1, StudentGroup o2) {
        int groupCount1 = o1.getStudentList().size();
        int groupCount2 = o2.getStudentList().size();

        return Integer.compare(groupCount1, groupCount2);
    }

    @Override
    public String toString() {
        return "StreamComparator []";
    }

}
