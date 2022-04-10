/**
 * 为进行MOCK测试修改后的MainRun类
 * 
 */
public class MainRun {
    private IData iData;

    public MainRun() {
    }

    public MainRun(IData iData) {
        this.iData = iData;
    }

    public String command(String comm, int roomNo, String name) {
        return iData.command(comm, roomNo, name);
    }
}
