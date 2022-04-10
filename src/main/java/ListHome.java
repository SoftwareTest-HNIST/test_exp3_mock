public class ListHome {
    IData iData;
    public ListHome(IData iData){
        this.iData = iData;
    }

    public ListHome() {
    }

    public void search() {
        iData.search();
    }
}
