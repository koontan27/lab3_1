import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*String input = JOptionPane.showInputDialog("ใส่ตัวเลข 1","0");
        JOptionPane.showMessageDialog(null,input,"title",JOptionPane.INFORMATION_MESSAGE);*/

        int ans = JOptionPane.showConfirmDialog(null,"วันนี้ซ้อมเปล่า","ซ้อม",JOptionPane.YES_NO_CANCEL_OPTION);

        if(ans == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"เจอกัน 1 ทุ่ม");
        } else {
            JOptionPane.showMessageDialog(null,"เดี๋ยวไล่ออกนะ");
        }

    }
}
