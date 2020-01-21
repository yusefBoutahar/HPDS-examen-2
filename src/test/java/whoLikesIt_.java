import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class whoLikesIt_ {


    @Test
    public void TestsNoOneLikes() {
        assertEquals("no one likes this", whoLikesIt.whoLikesIt());
    }

    @Test
    public void TestOneLike() {
        assertEquals("Peter like this", whoLikesIt.whoLikesIt("Peter"));
    }

}
