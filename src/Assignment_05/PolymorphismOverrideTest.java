public class PolymorphismOverrideTest {
    public static void main(String[] args) {

        Bank Obj = new Bank();
        Bank obj1 = new DBBL();
        Bank obj2 = new BracBank();

        System.out.println("Bank Default Interest Rate: " + Obj.getInterestRate() + "%");
        System.out.println("DBBL Interest Rate: " + obj1.getInterestRate() + "%");
        System.out.println("Brac Bank Interest Rate: " + obj2.getInterestRate() + "%");
    }
}
