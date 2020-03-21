package users;

import com.IT.utils.QAUtils;

import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserFactory {
    private static ResourceBundle user = ResourceBundle.getBundle("user");

    public static User getValidUser() {
        return new User(
                user.getString("userName"),
                user.getString("password"),
                user.getString("email")
        );
    }
    public static List<User> getUsers(int count) {
        List<User> collect = Stream.generate(() -> new User(
                user.getString("userName"),
                user.getString("password"),
                user.getString("email")))
                .limit(count)
                .collect(Collectors.toList());
        return collect;
    }
    public static List<User> getRandomUsers(int count) {

        List<User> collect = Stream.generate(() -> new User(
                QAUtils.getRandomString(15),
                QAUtils.getRandomString(10),
                QAUtils.getRandomString(12)+"@gmail.com"))
                .limit(count)
                .collect(Collectors.toList());
        return collect;
    }

}



