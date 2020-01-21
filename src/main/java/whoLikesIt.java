public class whoLikesIt {

    public static String whoLikesIt(String... names) {
        if(names.length == 0)return "no one likes this";
        if(names.length == 1)return names[0]+" likes this";
        if(names.length == 2)return names[0] + " and " + names[1]+ " like this";
        if(names.length == 3)return names[0]+", "+names[1]+" and "+names[names.length-1]+" like this";

/*
        String res = "";
        for (int i = 0; i < names.length-1 ; i++) {
            res += names[i]+" and ";
        }
        res += names[names.length-1];
        return res + " like this";
*/
        return "";
    }
}
