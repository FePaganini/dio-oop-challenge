package models;

import interfaces.IApple;
import interfaces.IInternet;
import interfaces.IMusicPlayer;
import interfaces.IPhone;

public class IphoneModel implements IApple, IInternet,IMusicPlayer, IPhone {

    @Override
    public void makeCall() {
        System.out.println("Make a call");
    }

    @Override
    public void answerCall() {
        System.out.println("Answer call");
    }

    @Override
    public void listenVoiceMail() {
        System.out.println("Listen to voice mail");
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

    @Override
    public void showPage() {
        System.out.println("Show page");
    }

    @Override
    public void refreshPage() {
        System.out.println("Refresh page");
    }

    @Override
    public void createNewTab() {
        System.out.println("Create new tab");
    }

    @Override
    public void syncWithITunes() {
        System.out.println("Synchronize with iTunes");
    }
    
}
