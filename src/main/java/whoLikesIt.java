public class whoLikesIt {

    public static String whoLikesIt(String... names) {
        if(names.length == 0)return "no one likes this";
        if(names.length == 1)return names[names.length-1]+" likes this";

        String res = "";
        for (int i = 0; i < names.length-1 ; i++) {
            res += names[i]+" and ";
        }
        res += names[names.length-1];
        return res + " like this";


    }
}
