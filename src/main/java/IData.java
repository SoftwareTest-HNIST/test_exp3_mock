public interface IData {
    public void iniRooms();
    public String in_Out_Room(int roomNo,String name);
    public String search();

    String getStation(int roomNo);

    void Search();

    public String command(String comm, int roomNo, String name);
}
