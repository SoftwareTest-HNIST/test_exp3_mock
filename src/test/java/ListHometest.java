import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;

public class ListHometest {
    private Mockery context = new Mockery();
    public IData iData = null;
    private ListHome LHome = null;

    @Test
    public void LHtest() {
        iData = context.mock(IData.class);
        LHome = new ListHome(iData);
        context.checking(new Expectations() {
            {
                oneOf(iData).Search();
            }
        });
    }
}
