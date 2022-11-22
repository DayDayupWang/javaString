public class StringBuilderDemo01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println("sb:" + sb);
        sb.append("hello").append(" world").append(" java");
        System.out.println("sb:" + sb);
    }

}