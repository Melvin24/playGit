package models;

/**
 * Created by mjo39 on 23/09/15.
 */



import  play.data.validation.Constraints.*;
import play.db.ebean.*;
import java.util.*;

public class Task {

    public Long id;

    @Required
    public String label;

    public static List<Task> all() {
        return new ArrayList<Task>();
    }

    public static void create(Task task) {
    }

    public static void delete(Long id) {
    }

}