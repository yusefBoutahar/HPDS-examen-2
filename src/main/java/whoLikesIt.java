public class whoLikesIt {

    public static String whoLikesIt(String... names) {
        if(names.length == 0)return "no one likes this";
        if(names.length == 1)return names[0]+" likes this";
        if(names.length == 2)return names[0] + " and " + names[1]+ " like this";
        if(names.length == 3)return names[0]+", "+names[1]+" and "+names[names.length-1]+" like this";
        //if(names.length >= 4)return names[0]+", "+names[1]+" and 2 others like this";



                //assertEquals("Alex, Jacob and 2 others like this", whoLikesIt.whoLikesIt("Alex", "Jacob", "Mark", "Max"));

        String res = "";
        res += names[0]+", "+names[1]+" and "+ (names.length-2);

        return res + " others like this";

    }
}
