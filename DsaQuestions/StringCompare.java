public class StringCompare {
    public static void main(String[] args) {
        String name1 = "Ram";
        String name2 = "Ram";
        System.out.println(name1.length());
        System.out.println(name2.length());

        // if(name1.compareTo(name2) == 0){    // 'Compare to' use for large scale 
        //     System.out.println("Both name length size is equal");
        // }else{
        //     System.out.println("Both name length size is not equal ");
        // }
        if(name1 == name2){    
            System.out.println("Both name length size is equal");
        }else{
            System.out.println("Both name length size is not equal ");
        }


    }
}
