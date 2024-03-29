package work6_14;


import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowRectangle extends JFrame implements ActionListener, AncestorListener {
    JTextField tf_width,tf_length;
    JButton btn_area;
    JTextArea text;
    Rectangle r;
    public WindowRectangle(){
        r=new Rectangle();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel p1=new JPanel();
        p1.add(new JLabel("长度"));
        tf_length=new JTextField(5);
        p1.add(tf_length);
        p1.add(new JLabel("宽度"));
        tf_width=new JTextField(5);
        p1.add(tf_width);
        btn_area=new JButton("计算面积");
        btn_area.addAncestorListener(this);
        p1.add(btn_area);
        this.getContentPane().add(p1,"North");
        text=new JTextArea(5,20);
        this.getContentPane().add(text);
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        try{
            int length=Integer.parseInt(tf_length.getText());
            int width=Integer.parseInt(tf_width.getText());
            r.setLength(length);
            r.setWidth(width);
            if(r.isSquare())
                text.append("正方形的边长:"+length+",面积:"+r.area()+"\n");
            else text.append("长方形的长:"+length+",宽:"+width+",面积:"+r.area()+"\n");
        }
        catch(Exception ex){
            text.append("无法计算面积:"+ex.toString()+"\n");
        }
    }

    @Override
    public void ancestorAdded(AncestorEvent event) {

    }

    @Override
    public void ancestorRemoved(AncestorEvent event) {

    }

    @Override
    public void ancestorMoved(AncestorEvent event) {

    }
}

