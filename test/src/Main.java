import mdTekwill.myClass;

public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello Cristina!");
      //  System.out.println("Hello world!");
       // myClass test = new myClass();
       // test.PrintWord();

        ContBancar FirstCont = new ContBancar("00077779999", 2.0);
        System.out.println("first Cont:" + FirstCont.getAccount_number());
        System.out.println("Sold:" + FirstCont.getSold());

        FirstCont.setAccount_number("1111111111111111");
        FirstCont.setSold(1111111.33333);

        System.out.println("Edited Cont:" + FirstCont.getAccount_number());
        System.out.println("Edited Sold:" + FirstCont.getSold());
    }

}
