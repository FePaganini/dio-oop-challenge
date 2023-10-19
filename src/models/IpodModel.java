package models;

import interfaces.IApple;
import interfaces.IMusicPlayer;

public class IpodModel implements IMusicPlayer, IApple{

    @Override
    public void syncWithITunes() {
        System.out.println("Synchronize with iTunes");
    }

    @Override
    public void playMusic() {
        System.out.println("Play music");
    }

    @Override
    public void selectMusic() {
        System.out.println("Select music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stop music");
    }
    
}
