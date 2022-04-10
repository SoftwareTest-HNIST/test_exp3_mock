import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainRunTest {

    private Mockery context = new Mockery();
    private IData iData = null;
    private MainRun mr = null;

    @Before
    public void setUp() throws Exception {
        iData = context.mock(IData.class);
        mr = new MainRun(iData);
        context.checking(new Expectations() {
            {
                oneOf(iData).command("123", 0, "null");
                will(returnValue("命令输入错误,请重新输入:"));
            }
        });
    }

    @Test
    public void command() {
        assertEquals("命令输入错误,请重新输入:", mr.command("123", 0, "null"));
    }

}