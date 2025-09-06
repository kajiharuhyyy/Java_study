public class Main {
    public static void main(String[] args) {
        System.err.println("メソッド呼び出すぞい");
        hello("wii");
        hello("WEEE");
        hello("wooo");
        System.err.println("呼び出したぞい");
    }
    public static void hello(String name) {
        System.err.println(name + "さん");
    }
}
