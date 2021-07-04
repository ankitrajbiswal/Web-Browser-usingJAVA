package web.browser;

import javax.swing.*;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.*;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class WebBrowser extends JFrame implements Runnable{

    private WebEngine webEngine;
    private JFXPanel panel;
    
    public void run() {
        setTitle("A R Browser");
        setVisible(true);
        setBounds(0,0,1950, 1080);
        
        panel = new JFXPanel();
        add(panel);
        
        Platform.runLater(() -> {
            WebView view = new WebView();
            view.getEngine().load("https://www.bing.com/");

            panel.setScene(new Scene(view));
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new WebBrowser());
    }

}
