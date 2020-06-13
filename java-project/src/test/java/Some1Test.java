import org.junit.Test;
import org.junit.experimental.categories.Category;
import pckg.Elemeledudki;

import java.util.Optional;

@Category(CategoryA.class)
public class Some1Test {

    @Test
    public void test1() {
        System.out.println("Test1");
    }

    @Test
    public void test2() {
        final Elemeledudki.Elemele elemele = new Elemeledudki.Elemele();
        elemele.setStringOptional(Optional.ofNullable(null));
    }
}
