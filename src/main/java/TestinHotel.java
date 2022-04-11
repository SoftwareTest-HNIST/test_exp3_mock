public class TestinHotel extends Empty{
    IData iData;
    public TestinHotel(IData iData)
    { this.iData=iData;}

    public TestinHotel(){}

    public String in(int roomNO,String name)
    { return iData.in_Out_Room(roomNO,name);}
}
