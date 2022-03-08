package Classes;

/**
 *
 * @author Eslam M.Ashour
 */
public class History {
    public String HistoryID, adminID, Date, description;
    private static final DBInterface DB = new DBInterface();
    //public static final String Activity_ADDED = "Student Has Been Added to the data base";
    public static final String STUDENT_ADDED      = "a  Student    has Been added to the database";
    public static final String INSTRUCTOR_ADDED   = "an instructor Has been added to the database";
    public static final String ADMIN_ADDED        = "an admin      Has Been added to the database";
    public static final String COURSE_ADDED       = "a  course     Has Been added to the database";
    
    public static final String STUDENT_UPDATED    = "a  student    Has Been updated to the database";
    public static final String INSTRUCTOR_UPDATED = "an instructor Has Been Updated to the database";
    public static final String ADMIN_UPDATED      = "an admin      Has Been updated to the database";
    public static final String COURSE_UPDATED     = "a  course     Has Been updated to the database";
    
    public static final String STUDENT_DELETED    = "a  student    Has Been deleted to the database";
    public static final String INSTRUCTOR_DELETED = "an instructor Has Been deleted to the database";
    public static final String ADMIN_DELETED      = "an admin      Has Been deleted to the database";
    public static final String COURSE_DELETED     = "a  course     Has Been deleted to the database";
    

    public History(String HistoryID, String AdminID) {
        this.HistoryID   = HistoryID;
        this.adminID     = AdminID;
        this.description = "Empty..";
    }
    public History()
    {

    }
    public History(String HistoryID, String AdminID, String Description) {
        this.HistoryID   = HistoryID;
        this.adminID     = AdminID;
        this.description = Description;
    }
        /**
         * 
         * @param adminID current UserID
         * @param description Use the final variables defined in this class as static final
         * @return 
         */
    public static boolean historyAdd(String adminID ,String description){
        return DB.newAdminActivity(adminID, description);
    }
    
    public static History[] getAdminHistory(){
        return DB.getAdminHistory();
    }
}