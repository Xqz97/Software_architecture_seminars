//public class InMemoryUserRepository implements UserRepository {
//    private List<User> users = new ArrayList<>();
//    private int nextId = 1;
//
//    @Override
//    public User getById(int id) {
//        for (User user : users) {
//            if (user.getId() == id) {
//                return user;
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public List<User> getAll() {
//        return new ArrayList<>(users);
//    }
//
//    @Override
//    public void add(User user) {
//        user.setId(nextId++);
//        users.add(user);
//    }
//
//    @Override
//    public void update(User user) {
//        for (int i = 0; i < users.size(); i++) {
//            if (users.get(i).getId() == user.getId()) {
//                users.set(i, user);
//                return;
//            }
//        }
//    }
//
//    @Override
//    public void delete(int id) {
//        users.removeIf(user -> user.getId() == id);
//    }
//}