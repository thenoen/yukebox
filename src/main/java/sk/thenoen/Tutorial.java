package sk.thenoen;

import uk.co.caprica.vlcj.component.AudioMediaPlayerComponent;
import uk.co.caprica.vlcj.player.MediaPlayer;
import uk.co.caprica.vlcj.player.MediaPlayerEventAdapter;

public class Tutorial {

	private final AudioMediaPlayerComponent mediaPlayerComponent;

	public void play(String arg) {
		Tutorial tutorial = new Tutorial();
		tutorial.start(arg);
	}

	public Tutorial() {
		mediaPlayerComponent = new AudioMediaPlayerComponent();
		mediaPlayerComponent.getMediaPlayer().addMediaPlayerEventListener(new MediaPlayerEventAdapter() {
			@Override
			public void stopped(MediaPlayer mediaPlayer) {
				exit(0);
			}

			@Override
			public void finished(MediaPlayer mediaPlayer) {
				exit(0);
			}

			@Override
			public void error(MediaPlayer mediaPlayer) {
				exit(1);
			}
		});
	}

	private void start(String mrl) {
		mediaPlayerComponent.getMediaPlayer().playMedia(mrl);
	}

	private void exit(int result) {
		mediaPlayerComponent.release();
		System.exit(result);
	}
}
