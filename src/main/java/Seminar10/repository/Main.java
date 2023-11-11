//public class Main {
//    public static void main(String[] args) {
//        UserRepository userRepository = new InMemoryUserRepository();
//
//        userRepository.add(new User(1, "Alice"));
//        userRepository.add(new User(2, "Bob"));
//
//        User user = userRepository.getById(1);
//        System.out.println("User.java with ID 1: " + user.getName());
//
//        List<User> allUsers = userRepository.getAll();
//        System.out.println("All Users:");
//        for (User u : allUsers) {
//            System.out.println(u.getId() + ": " + u.getName());
//        }
//
//        userRepository.update(new User(1, "Alicia"));
//
//        userRepository.delete(2);
//    }
//}