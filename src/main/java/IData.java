public interface IData {
    public void iniRooms();

    public String getStation(int roomNo);

    public String command(String comm, int roomNo, String name);
}
