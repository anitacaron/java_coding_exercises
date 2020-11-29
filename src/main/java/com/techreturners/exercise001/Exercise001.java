package com.techreturners.exercise001;

import java.util.List; 

public class Exercise001 {
    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return firstName.charAt(0) + "." + lastName.charAt(0);
    }

    public double addVat(double originalPrice, double vatRate) {
        double scale = Math.pow(10, 2);
        double value = originalPrice * (1 + (vatRate / 100));
        
        return Math.round(value * scale) / scale;
    }

    public String reverse(String sentence) {
        String rev_sentence= "";
        for(int i = sentence.length()-1; i>=0; i--) {
            rev_sentence = rev_sentence + sentence.charAt(i);
        }
        return rev_sentence;
    }

    public int countLinuxUsers(List<User> users) {
        int count_linux_users = 0;
        for (User user : users) {
            if (user.getType() == "Linux") {
                count_linux_users++;
            }
        }

        return count_linux_users;
    }
}
