package me.spy.ui;

import javax.swing.*;

public class FrameManager {

    MainFrame mainFrame = new MainFrame();
    CytoidFrame cytoidFrame = new CytoidFrame();
    ArcaeaFrame arcaeaFrame = new ArcaeaFrame();

    public FrameManager() {

    }

    public MainFrame getMainFrame(){
        return mainFrame;
    }

    public CytoidFrame getCytoidFrame(){
        return cytoidFrame;
    }

    public ArcaeaFrame getArcaeaFrame(){
        return arcaeaFrame;
    }


}
