import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
	
	private TextPanel textPanel;
	private ToolBar toolBar;

	public MainFrame() {
		super("Hello World");

		setLayout(new BorderLayout());

		toolBar = new ToolBar();
		textPanel = new TextPanel();
		
		toolBar.setStringListener(new StringListener() {
			public void textEmitted(String text) {
				textPanel.appendText(text);			
			}		
		});
		
		add(toolBar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
