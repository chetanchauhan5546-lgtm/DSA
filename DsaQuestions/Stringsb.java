public class Stringsb {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Rose");
        System.out.println(sb);
       // sb.insert(2, 'e');
        sb.delete(3, 'e');
        System.out.println(sb);
    }
}
