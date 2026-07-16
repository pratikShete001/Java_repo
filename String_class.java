public class String_class {

    public static void main(String[] args) {
        int strlen;
        String str = "Core java";
        String s1 = "", s2="";

        strlen = str.length();
        System.out.println("Length of String = " + strlen);
        s1 = str.replace("Core", "advance");
        System.out.println("Before replacing: " + str);
        System.out.println("After replacing: " + s1);
        s2 = str.concat(" is programing language");
        System.out.println("Before concate: " + str);
        System.out.println("After concate: " + s2);
    }
}
