package new_project;
interface Media{
	void play();
	void stop();
	default void pause() {
		System.out.println("Media paused");
	}
	static void about() {
		System.out.println("This is a media interface");
	}
}

interface AdvanceMedia extends Media{
	void nextTrack();
}
class MusicPlayer implements AdvanceMedia{
	 public void play() {
		 System.out.println("Music Started");
	 }
	 public void stop() {
		 System.out.println("Music stoped");
	 }
	 public void pause() {
		 System.out.println("Music paused");
	 }
	 public void nextTrack() {
		 System.out.println("Next song");
	 }
}
	
public class Interface2 {

	public static void main(String[] args) {
		MusicPlayer musicPlayer = new MusicPlayer();
		musicPlayer.play();
		musicPlayer.nextTrack();
		musicPlayer.pause();
		Media.about();
		musicPlayer.stop();

	}

}
