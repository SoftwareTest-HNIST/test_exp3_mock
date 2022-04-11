/**
 * 为进行MOCK测试修改后的MainRun类
 * update
 */
public class MainRun {
    IData iData;
    private static String[][] rooms;        //表示房间
    public MainRun(IData iData){
        this.iData = iData;
    }

    public MainRun() {}

    public String RunTest(String comm, int roomNo, String name) {
        iniRooms();
        return command(comm, roomNo, name);
    }

    public String command(String comm, int roomNo, String name) {
        return iData.command(comm, roomNo, name);
    }

    public void iniRooms() {
        iData.iniRooms();
    }
    public String[][] getRoom()
    {
        return rooms;
    }
}