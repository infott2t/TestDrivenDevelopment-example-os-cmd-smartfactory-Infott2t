package org.example;

//작성자 : https://github.com/infott2t
//작성일 : 2023-02-04 토요일.
//인사   : 아무렇게나 사용하셔도 됨니다. 사회적으로.. 도덕적으로..올바르게, 사용. 코드, 재미로 만든것이군요.
//         소스코드는 마음대로, 제가 만들기는 했지만, 마음대로 적어보세요.
//         공부해보세요~. 재미있네요.
//         또, 교회. 다녀보세요. 기독교. 주말에 교회 가면, 잘 안내해줌니다. 저의 코드, 봐 주셔서 감사합니다.


import java.util.Scanner;

public class SmartFactoryEx_Infott2t {
    String commandExitString;

    public SmartFactoryEx_Infott2t() {
        // TODO Auto-generated constructor stub
        System.out.println("TestDrivenDevelopment-example-os-cmd-smartfactory-Infott2t (github.com, @infott2t; https://github.com/infott2t/TestDrivenDevelopment-example-os-cmd-smartfactory-Infott2t)");
        System.out.println("Use Java(https://oracle.com)");

        System.out.println("Let's safely use smartphones,etc. Make good traditioning to self.");
        System.out.println("Enjoy. 'help' or 'help-infott2t'. Open command. and 'exit' String input, outbreak.");
        System.out.println("Let's go there. Church. Jesus Christ. Calling. Social resting place. I like this writing.");
        System.out.println("Thank you, and using. Thank you. Hope good developping. Yours. ... Have a good day~.");
        do {
            System.out.print(">");
            Scanner input = new Scanner(System.in);
            String n = input.next();
            //System.out.println(n);

            if (n.equals("exit")) {
                commandExitString = "exit";
            } else if (n.equals("help")) {
                System.out.println("Command...");
                System.out.println("Let's study programming, JAVA, C#.");
                System.out.println("Have a good day~. Thank you.");
            } else if (n.equals("help-infott2t")) {
                System.out.println("My example TDD(TestDrivenDevelopment), Making... I try. Thank you.");
                //
                // I try making this part~. Thank you.
                //
            } else {
                System.out.println("Ok");
            }

        } while (commandExitString != "exit");
        System.out.println("Thank you, for using. Thank you.");

    }

    public static void main(String[] args) {
        new SmartFactoryEx_Infott2t();
    }

}