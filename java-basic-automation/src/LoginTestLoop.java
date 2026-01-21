public class LoginTestLoop {
    public static void main(String[] args) {
        String[] users = {"admin", "user1", "user2"};

        for (String user : users) {
            System.out.println("Run login test with " + user);
        }
    }
}
