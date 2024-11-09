package librarian.utils;

/**
 *
 * @author Miltiadis Parcharidis 011873
 */
public class User {

    private static int userid;
    private static String name;
    private static String surname;
    private static int role;
    private static Object exception;

    public User() {
    }

    public User(int useridInput, String nameInput, String surnameInput, int roleInput) {
        userid = useridInput;
        name = nameInput;
        surname = surnameInput;
        role = roleInput;
    }

    public static int getRole() {
        return role;
    }

    public static void setRole(int roleInput) {
        role = roleInput;
    }

    public static String getSurname() {
        return surname;
    }

    public static void setSurname(String surnameInput) {
        surname = surnameInput;
    }

    public static void setException(Object exception) {
        User.exception = exception;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String nameInput) {
        name = nameInput;
    }

    public static int getUserid() {
        return userid;
    }

    public static void setUserid(int useridInput) {
        userid = useridInput;
    }

    public static Object getException() {
        return exception;
    }

}
