package librarian.utils;

import javax.sound.sampled.Clip;

/**
 *
 * @author Miltiadis Parcharidis 011873
 */
public class User {

    private static int userid;
    private static String name;
    private static String surname;
    private static int role;
    private static Clip clip;
    private static boolean musicPlaying;

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

    public static Clip getClip() {
        return clip;
    }

    public static void setClip(Clip clip) {
        User.clip = clip;
    }

    public static void clearValues() {
        userid = -1;
        name = null;
        surname = null;
        role = -1;
    }

    public static void playMusic() {
        clip.start();
        setMusicPlaying(true);
    }

    public static void stopMusic() {
        clip.stop();
        setMusicPlaying(false);
    }

    public static boolean isMusicPlaying() {
        return musicPlaying;
    }

    public static void setMusicPlaying(boolean musicPlaying) {
        User.musicPlaying = musicPlaying;
    }

}
