package Assignment_03;

public class AccessModifierExample {

    // Variables with different access modifiers

    public String publicVariable = "Public Variable";
    private String privateVariable = "private Variable";
    protected String protectedVariable = "protected Variable";
    String defaultVar = "Default (package-private) Variable";

    // Method with Different access modifiers

    public void publicMethod() {
        System.out.println("This is a Public Method");
    }

    private void privateMethod(){
        System.out.println("This is a Private Method");
    }

    protected void protectedMethod(){
        System.out.println("This is a Protected Method");
    }

    void defaultMethod(){
        System.out.println("This is a Default (Package-Private) Method");
    }

    // Main Method to run

    public static void main(String[] args) {
        AccessModifierExample Obj = new AccessModifierExample();

        // Access all Variable

        System.out.println(Obj.publicVariable);
        System.out.println(Obj.privateVariable);
        System.out.println(Obj.protectedVariable);
        System.out.println(Obj.defaultVar);

        // call all Method

        Obj.publicMethod();
        Obj.privateMethod();
        Obj.protectedMethod();
        Obj.defaultMethod();



    }


}
