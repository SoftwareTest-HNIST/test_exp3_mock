import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OutHotelTest {
    private Mockery context=new Mockery();
    private IData IData=null;
    private OutHotel oh=null;
    @Before
    public  void setUp()throws Exception
    {
        IData= context.mock(IData.class);
        oh=new OutHotel(IData);
        context.checking(new Expectations(){{
            oneOf(IData).in_Out_Room(701,"EMPTY");
            will(returnValue("701 退房成功！"));
        }});
    }
    @Test
    public void testOut(){
        assertEquals("701 退房成功！",oh.out(701));
    }
}
