package web_Browser;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.embed.swing.JFXPanel;
import javafx.scene.web.WebView;

/**
 * @author Ankit Raj Biswal
 *
 */
public class web_browser extends JFrame implements Runnable {
	private JFXPanel panel;
	
	public void run(){
		setBounds(0,0,1900,1000); // last two are size of the screen and first two are coordinates for origin
		setVisible(true); // by default the visibility of the frame is hidden, we have to switch it on
		setTitle("A R Browser");
		
		panel=new JFXPanel();
		add(panel);
		
		Platform.runLater(()-> {
		WebView view= new WebView();
		view.getEngine().load("http://www.bing.com");
		
		panel.setScene(new Scene(view));
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new web_browser()); // this will stop a task for a while and then execute it
      
	}

}
//java fx cannot be resolved

//Jar file needed
