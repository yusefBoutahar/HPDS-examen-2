public class whoLikesIt {

    public static String whoLikesIt(String... names) {
        if(names.length == 0){
            return "no one likes this";
        }else{
            for (int i = 0; i < names.length ; i++) {
                return names[i]+" like this";

            }
        }

        return "";
    }
}
