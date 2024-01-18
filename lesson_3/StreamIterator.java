import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {
    private final List<StudentGroup> studentGroupList;
    private int counter;
//    переопределяем hasNext
    @Override
    public boolean hasNext() {
        return counter < studentGroupList.size();
    }
    //    переопределяем next
    @Override
    public StudentGroup next() {
        if (!hasNext()) {
            return null;
        }
        else {
            return studentGroupList.get(counter++);
        }
    }
    public void zeroCount () {  // обнуляем counter
        counter = 0;
    }

    public StreamIterator(Stream stream) {
        this.studentGroupList = stream.getStudentGroups();
        zeroCount();
    }

}
