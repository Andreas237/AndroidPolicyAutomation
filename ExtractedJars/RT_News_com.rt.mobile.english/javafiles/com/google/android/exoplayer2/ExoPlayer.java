// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import android.os.Looper;
import com.google.android.exoplayer2.source.MediaSource;

// Referenced classes of package com.google.android.exoplayer2:
//			Player, PlayerMessage, SeekParameters

public interface ExoPlayer
	extends Player
{
	public static interface EventListener
		extends Player.EventListener
	{
	}

	public static interface ExoPlayerComponent
		extends PlayerMessage.Target
	{
	}

	public static final class ExoPlayerMessage
	{

		public final Object message;
		public final int messageType;
		public final PlayerMessage.Target target;

		public ExoPlayerMessage(PlayerMessage.Target target1, int i, Object obj)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			target = target1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field PlayerMessage$Target target>
			messageType = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #23  <Field int messageType>
			message = obj;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #25  <Field Object message>
		//   11   19:return          
		}
	}


	public transient abstract void blockingSendMessages(ExoPlayerMessage aexoplayermessage[]);

	public abstract PlayerMessage createMessage(PlayerMessage.Target target);

	public abstract Looper getPlaybackLooper();

	public abstract void prepare(MediaSource mediasource);

	public abstract void prepare(MediaSource mediasource, boolean flag, boolean flag1);

	public transient abstract void sendMessages(ExoPlayerMessage aexoplayermessage[]);

	public abstract void setSeekParameters(SeekParameters seekparameters);

	public static final int REPEAT_MODE_ALL = 2;
	public static final int REPEAT_MODE_OFF = 0;
	public static final int REPEAT_MODE_ONE = 1;
	public static final int STATE_BUFFERING = 2;
	public static final int STATE_ENDED = 4;
	public static final int STATE_IDLE = 1;
	public static final int STATE_READY = 3;
}
