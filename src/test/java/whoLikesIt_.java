import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class whoLikesIt_ {


    @Test
    public void TestsNoOneLikes() {
        assertEquals("no one likes this", whoLikesIt.whoLikesIt());
    }

    @Test
    public void TestOneLike() {
        assertEquals("Peter likes this", whoLikesIt.whoLikesIt("Peter"));
    }

    @Test
    public void TestTwoLikes() {
        assertEquals("Jacob and Alex like this", whoLikesIt.whoLikesIt("Jacob", "Alex"));
    }

    @Test
    public void TestThreeLikes() {
        assertEquals("Max, John and Mark like this", whoLikesIt.whoLikesIt("Max", "John", "Mark"));
    }

    @Test
    public void TestFourOrMoreNames() {
        assertEquals("Alex, Jacob and 2 others like this", whoLikesIt.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
        assertEquals("Alex, Jacob and 4 others like this", whoLikesIt.whoLikesIt("Alex", "Jacob", "Mark", "Max","Yusef","Martin"));
        assertEquals("Maria, Alex and 5 others like this", whoLikesIt.whoLikesIt("Maria", "Alex", "Jacob", "Mark", "Max","Yusef","Martin"));
    }
}
