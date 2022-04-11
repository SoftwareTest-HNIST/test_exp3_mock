import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InHotelTest {
    private Mockery context=new Mockery();
    private IData iData=null;
    private TestinHotel oh=null;
    public String name="zengkang";
    public int roomNo=701;
    @Before
    public void setUp() throws Exception
    {
        iData=context.mock(IData.class);
        oh=new TestinHotel(iData);
        context.checking(new Expectations()
        {{
            oneOf(iData).in_Out_Room(roomNo,name);
            will(returnValue(name+"成功入住"+roomNo+"房间"));
        }});
    }
    @Test
    public void testOut(){
        assertEquals(name+"成功入住"+roomNo+"房间",oh.in(roomNo,name));
    }
}
