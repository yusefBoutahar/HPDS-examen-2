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
        assertEquals("Jacob and Alex like this", whoLikesIt.whoLikesIt("Jacob", "Alex"));    }

}
