public class Main {
    public static void main(String[] args) {
        User user = new User("John", "Arnesen", "Hej@mail.com");
        UserList userList = new UserList();
        userList.addUser(user);
        User user2 = new User("Arne", "Johnsen", "Hejsa@gmail.com");
        userList.addUser(user2);
        System.out.println(userList);
    }
}
