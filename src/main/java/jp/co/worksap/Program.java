package jp.co.worksap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zuo on 15-2-14.
 */
public class Program {

    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        List<User> users = new ArrayList<>();
        for (;;i++) {
		    User u = new User("ABC", i);
            System.out.println(u);
            users.add(u);
        }
    }

	public static class User {
		private String name;
		private int age;
		public User(String name, int age) {
			this.name = name;
			this.age = age;
		}

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
