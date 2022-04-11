public class DP implements IData {
    private static String[][] rooms;

    @Override
    public void iniRooms() {
        rooms = new String[10][12];
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[0].length; j++) {
                rooms[i][j] = "empty";
            }
        }
    }

    @Override
    public String in_Out_Room(int roomNo, String name) {
        return null;
    }


    /**
     * 修改后MainRun类中的command方法
     */
    @Override
    public String command(String comm, int roomNo, String name) {
        if ("search".equalsIgnoreCase(comm)) {
            return search();
        } else if ("in".equalsIgnoreCase(comm)) {
            try {
                if (validRoomNo(roomNo)) {
                    return in(roomNo, name);
                } else {
                    return "房间号错!";
                }
            } catch (Exception e) {
                return "房间号错!";
            }
        } else if ("out".equalsIgnoreCase(comm)) {
            if (validRoomNo(roomNo)) {
                return out(roomNo);
            } else {
                return "房间号错!";
            }
        } else if ("exit".equalsIgnoreCase(comm)) {
            return "程序退出...";
        } else {
            return "命令输入错误,请重新输入:";
        }
    }

    @Override
    public String getStation(int roomNo) {
        return rooms[(roomNo / 100) - 1][(roomNo % 100) - 1];
    }


    @Override
    public void Search() {

    }

    public int roomNo(int roomNo) {
        if ("empty".equals(rooms[(roomNo / 100) - 1][(roomNo % 100) - 1])) {
            return roomNo;
        } else {
            return 0;
        }
    }

    @Override
    public String search() {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[0].length; j++) {
                if (j + 1 < 10) {
                    System.out.print(i + 1 + "0" + (j + 1) + "\t\t");
                } else {
                    System.out.print(i + 1 + "" + (j + 1) + "\t\t");
                }
            }
            System.out.println();
            for (int j = 0; j < rooms[0].length; j++) {
                System.out.print(rooms[i][j] + "\t");
            }
            System.out.println();
        }
        return null;
    }

    public static String[][] getRoom() {
        return rooms;
    }

    private static boolean validRoomNo(int roomNo) {
        if ((roomNo / 100 > 10) || (roomNo % 100 < 1)) {
            return false;
        } else {
            return true;
        }
    }

    public static String in(int roomNo, String name) {
        int room = (roomNo % 100) - 1;
        if (isEmpty(roomNo)) {
            getRoom()[(roomNo / 100) - 1][room] = name;
            return name + "成功入住" + roomNo + "房间! ";
        } else
            return "该房间已经有客人入住！";
    }

    public static boolean isEmpty(int roomNo) {
        if ("EMPTY".equals(getRoom()[(roomNo / 100) - 1][(roomNo % 100) - 1]))
            return true;
        else
            return false;
    }

    public static String out(int roomNo) {
        if (isEmpty(roomNo)) {
            return "该房间没有客人入住，退房失败！";
        } else {
            getRoom()[(roomNo / 100) - 1][(roomNo % 100) - 1] = "EMPTY";
            return roomNo + "退房成功!";
        }
    }
}
