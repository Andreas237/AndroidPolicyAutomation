// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.PlaybackParameters;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.exoplayer2.audio:
//			AudioAttributes

public interface AudioSink
{
	public static final class ConfigurationException extends Exception
	{

		public ConfigurationException(String s)
		{
			super(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void Exception(String)>
		//    3    5:return          
		}

		public ConfigurationException(Throwable throwable)
		{
			super(throwable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #15  <Method void Exception(Throwable)>
		//    3    5:return          
		}
	}

	public static final class InitializationException extends Exception
	{

		public final int audioTrackState;

		public InitializationException(int i, int j, int k, int l)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #13  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #16  <Method void StringBuilder()>
		//    3    7:astore          5
			stringbuilder.append("AudioTrack init failed: ");
		//    4    9:aload           5
		//    5   11:ldc1            #18  <String "AudioTrack init failed: ">
		//    6   13:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
		//    7   16:pop             
			stringbuilder.append(i);
		//    8   17:aload           5
		//    9   19:iload_1         
		//   10   20:invokevirtual   #25  <Method StringBuilder StringBuilder.append(int)>
		//   11   23:pop             
			stringbuilder.append(", Config(");
		//   12   24:aload           5
		//   13   26:ldc1            #27  <String ", Config(">
		//   14   28:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
		//   15   31:pop             
			stringbuilder.append(j);
		//   16   32:aload           5
		//   17   34:iload_2         
		//   18   35:invokevirtual   #25  <Method StringBuilder StringBuilder.append(int)>
		//   19   38:pop             
			stringbuilder.append(", ");
		//   20   39:aload           5
		//   21   41:ldc1            #29  <String ", ">
		//   22   43:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
		//   23   46:pop             
			stringbuilder.append(k);
		//   24   47:aload           5
		//   25   49:iload_3         
		//   26   50:invokevirtual   #25  <Method StringBuilder StringBuilder.append(int)>
		//   27   53:pop             
			stringbuilder.append(", ");
		//   28   54:aload           5
		//   29   56:ldc1            #29  <String ", ">
		//   30   58:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
		//   31   61:pop             
			stringbuilder.append(l);
		//   32   62:aload           5
		//   33   64:iload           4
		//   34   66:invokevirtual   #25  <Method StringBuilder StringBuilder.append(int)>
		//   35   69:pop             
			stringbuilder.append(")");
		//   36   70:aload           5
		//   37   72:ldc1            #31  <String ")">
		//   38   74:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
		//   39   77:pop             
			super(stringbuilder.toString());
		//   40   78:aload_0         
		//   41   79:aload           5
		//   42   81:invokevirtual   #35  <Method String StringBuilder.toString()>
		//   43   84:invokespecial   #38  <Method void Exception(String)>
			audioTrackState = i;
		//   44   87:aload_0         
		//   45   88:iload_1         
		//   46   89:putfield        #40  <Field int audioTrackState>
		//   47   92:return          
		}
	}

	public static interface Listener
	{

		public abstract void onAudioSessionId(int i);

		public abstract void onPositionDiscontinuity();

		public abstract void onUnderrun(int i, long l, long l1);
	}

	public static final class WriteException extends Exception
	{

		public final int errorCode;

		public WriteException(int i)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #13  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #16  <Method void StringBuilder()>
		//    3    7:astore_2        
			stringbuilder.append("AudioTrack write failed: ");
		//    4    8:aload_2         
		//    5    9:ldc1            #18  <String "AudioTrack write failed: ">
		//    6   11:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(i);
		//    8   15:aload_2         
		//    9   16:iload_1         
		//   10   17:invokevirtual   #25  <Method StringBuilder StringBuilder.append(int)>
		//   11   20:pop             
			super(stringbuilder.toString());
		//   12   21:aload_0         
		//   13   22:aload_2         
		//   14   23:invokevirtual   #29  <Method String StringBuilder.toString()>
		//   15   26:invokespecial   #32  <Method void Exception(String)>
			errorCode = i;
		//   16   29:aload_0         
		//   17   30:iload_1         
		//   18   31:putfield        #34  <Field int errorCode>
		//   19   34:return          
		}
	}


	public abstract void configure(int i, int j, int k, int l, int ai[], int i1, int j1)
		throws ConfigurationException;

	public abstract void disableTunneling();

	public abstract void enableTunnelingV21(int i);

	public abstract long getCurrentPositionUs(boolean flag);

	public abstract PlaybackParameters getPlaybackParameters();

	public abstract boolean handleBuffer(ByteBuffer bytebuffer, long l)
		throws InitializationException, WriteException;

	public abstract void handleDiscontinuity();

	public abstract boolean hasPendingData();

	public abstract boolean isEncodingSupported(int i);

	public abstract boolean isEnded();

	public abstract void pause();

	public abstract void play();

	public abstract void playToEndOfStream()
		throws WriteException;

	public abstract void release();

	public abstract void reset();

	public abstract void setAudioAttributes(AudioAttributes audioattributes);

	public abstract void setAudioSessionId(int i);

	public abstract void setListener(Listener listener);

	public abstract PlaybackParameters setPlaybackParameters(PlaybackParameters playbackparameters);

	public abstract void setVolume(float f);

	public static final long CURRENT_POSITION_NOT_SET = 0x0L;
}
