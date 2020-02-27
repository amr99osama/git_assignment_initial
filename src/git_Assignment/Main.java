package git_Assignment;

import java.util.Scanner;

public class Main {
    private static ISubscriber subscribers [] = {
            new SimpleSubscriber(),
            new ReallySimpleSubscriber(),
            new sphereArea(),
    };
    public static void main(String[] args) {
        System.out.println("Enter Your Radius here :");
        Topic mathTopic = new Topic();
        for (ISubscriber sub : subscribers) {
            mathTopic.addSubscriber(sub);
        }
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        mathTopic.dispatchEvent(input);
    }
}