public class Strin1 {
    public static void main(String[] args) {
        String firstName = "Sita";
        String lastName = "Ramam";
        String fullName = firstName+ " " +lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());

        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
    }
}
