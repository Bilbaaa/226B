import java.util.Comparator;


public class SchoolComparator implements Comparator<Team> {


    @Override
    public int compare(Team o1, Team o2) {
        return o2.getSchool().compareTo(o1.getSchool());
    }

}


