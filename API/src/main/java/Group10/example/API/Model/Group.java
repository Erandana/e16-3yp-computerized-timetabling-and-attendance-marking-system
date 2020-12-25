package Group10.example.API.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Document(collation = "Groups")
public class Group {

    @Id
    private String groupID;

    @NotNull(message = "Group Name is mandatory")
    private String groupName;

    private String subject;

    public HashSet<String> studentList = new HashSet<>();

    public HashSet<String>  lecList =  new HashSet<>();

    public HashSet<String> courseList = new HashSet<>();

    public HashSet<String> getCourseList() {
        return courseList;
    }

    public void setCourseList(HashSet<String> courseList) {
        this.courseList = courseList;
    }

    public  HashSet<String> getLecList() {
        return lecList;
    }

    public void setLecList( HashSet<String> lecList) {
        this.lecList = lecList;
    }

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public HashSet<String> getStudentList() {
        return studentList;
    }

    public void setStudentList(HashSet<String>  studentList) {
        this.studentList = studentList;
    }
}
