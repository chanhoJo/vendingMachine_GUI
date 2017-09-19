import javazoom.jl.decoder.*;
import javazoom.jl.player.*;
import java.io.FileInputStream;

public class Sound {
	
	public void playSound(int choice) {
	      
	      String [] SoundList = {"sound/insertCoin.mp3","sound/outProduct.mp3"};   //노래목록 
	      Player p;
	      System.out.println((choice+1)+"번 소리 재생");
	           try{
	              switch(choice){
	              case 0:
	                 p = new Player(new FileInputStream(SoundList[0]));
	                 p.play();
	                 break;
	              case 1:
	                 p = new Player(new FileInputStream(SoundList[1]));
	                 p.play();
	                 break;
	              } 
	           }catch(Exception e){
	            e.printStackTrace();
	            System.out.println("sound exception");
	           }
	   }
}
