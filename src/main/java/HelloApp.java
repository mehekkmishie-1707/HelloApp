public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder names = new StringBuilder();
            int i = 0;
            for (String name : args) {
                names.append(name);
                if (i < args.length - 1) {
                    names.append(", ");
                }
                i++;
            }
            System.out.println("Hello, " + names.toString() + "!");
        }
    }
}
