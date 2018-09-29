
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {
	Panel p;
	Label output;
	Label l;
	TextField tf;
	TextField tf2;
	Button b;
public MyFrame()
{
	l   = new Label("Name");
    tf  = new TextField(5);
    tf2 = new TextField(5);
    b   = new Button("+");
    p   = new Panel();
    output = new Label();
    b.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String data =tf.getText();
			String iidata =tf2.getText();
			
			int idata=Integer.parseInt(data);
			int bdata=Integer.parseInt(iidata);
			int outdata=idata+bdata;
			output.setText(String.valueOf(outdata));
		}
    	
    });
    p.add(l);
    p.add(tf);
    p.add(tf2);
    p.add(b);
    p.add(output);
    add(p);
addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent e){
		dispose();
	}
});
setSize(300,300);
setTitle(" Hello Java");
setVisible(true);
}
}
