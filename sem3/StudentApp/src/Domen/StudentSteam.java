package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup> {

    private List<StudentGroup> steam;
    private Integer idSteam;

    public StudentSteam(List<StudentGroup> steam, Integer idSteam) {
        this.steam = steam;
        this.idSteam = idSteam;
    }

    public List<StudentGroup> getSteam() {
        return steam;
    }

    public void setSteam(List<StudentGroup> steam) {
        this.steam = steam;
    }

    // public Integer getIdGroup() {
    //     return idGroup;
    // }

    // public void setIdGroup(Integer idGroup) {
    //     this.idGroup = idGroup;
    // }

     @Override
    public String toString() {
        return "StudentSteam{" +
                "steam=" + steam +
                ", idSteam=" + idSteam +
                '}';
    }

    @Override
    public Iterator<StudentGroup> iterator() {
       return new Iterator<StudentGroup>() {

        private int counter;

        @Override
        public boolean hasNext() {

            if(counter<steam.size())
            {
                return true;
            }
            else
            {
                return false;
            }            
        }

        @Override
        public StudentGroup next() {            
            return steam.get(counter++);
        }
        
       };
        
    }

}
