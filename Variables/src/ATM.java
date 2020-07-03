import java.util.Scanner;

public class ATM {
    static int bankAcount;
    int acount;

    public void addAcount(int money) {
        bankAcount+=money;
        this.acount+=money;
    }

    public void disAcount(int money) {
        bankAcount-=money;
        this.acount-=money;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM a = new ATM();
        ATM b = new ATM();
        int choice;
        int userMoney;
        do {
            System.out.println("\n메뉴를 선택해주세요.\n1. 입금 / 2. 출금 / 3. 종료");
            System.out.print("You : ");
            choice= sc.nextInt();

            if (choice == 1) {
                System.out.println("\n입금을 선택하셨습니다. 입금하실 계좌를 선택해주세요.");
                System.out.println("1. A계좌 / 2. B계좌");
                System.out.print("You : ");
                choice = sc.nextInt();
                System.out.println("\n" + ((choice == 1) ? "A" : "B") + "계좌를 선택하셨습니다.");
                System.out.println("입금하실 금액을 입력해주세요.");
                System.out.print("You : ");
                userMoney = sc.nextInt();
                if (choice == 1) {
                    a.addAcount(userMoney);
                } else if (choice == 2) {
                    b.addAcount(userMoney);
                }
            } else if (choice == 2) {
                System.out.println("출금을 선택하셨습니다. 출금하실 계좌를 선택해주세요.");
                System.out.println("1. A계좌 / 2. B계좌");
                System.out.print("You : ");
                choice = sc.nextInt();
                System.out.println((choice == 1) ? "A" : "B" + "계좌를 선택하셨습니다.");
                System.out.println("출금하실 금액을 입력해주세요.");
                System.out.print("You : ");
                userMoney = sc.nextInt();
                if (choice == 1) {
                    a.disAcount(userMoney);
                } else if (choice == 2) {
                    b.disAcount(userMoney);
                }
            }
            System.out.println("===========================");
            System.out.println("A 금액 : " + a.acount);
            System.out.println("B 금액 : " + b.acount);
            System.out.println("전체 계좌 금액 : " + bankAcount);
            System.out.println("===========================");

        }while(choice!=3);
    }
}
