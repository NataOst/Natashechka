public class Song {

	String artist;
	String title;
	SoundPlayer soundPlayer = new SoundPlayer();

	void setTitle(String title) {
		this.title = title;
	};

	void setArtist(String artist) {
		this.artist = artist;
	}


	void play() {
		soundPlayer.playSound(title);
	}

	public static void main(String[] args) {
		Song t1 = new Song();
		t1.setArtist("MaxKorzh");
		t1.setTitle("Vremya");
		Song t2 = new Song();
		t2.setArtist("MaxBarskih");
		t2.setTitle("SukaLubov");
		t1.play();
		t2.play();
	}

}