// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.PlaybackParameters;

// Referenced classes of package com.google.android.exoplayer2.util:
//			MediaClock, Clock

public final class StandaloneMediaClock
	implements MediaClock
{

	public StandaloneMediaClock(Clock clock1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		clock = clock1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Clock clock>
		playbackParameters = PlaybackParameters.DEFAULT;
	//    5    9:aload_0         
	//    6   10:getstatic       #27  <Field PlaybackParameters PlaybackParameters.DEFAULT>
	//    7   13:putfield        #29  <Field PlaybackParameters playbackParameters>
	//    8   16:return          
	}

	public PlaybackParameters getPlaybackParameters()
	{
		return playbackParameters;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field PlaybackParameters playbackParameters>
	//    2    4:areturn         
	}

	public long getPositionUs()
	{
		long l = baseUs;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field long baseUs>
	//    2    4:lstore_1        
		if(started)
	//*   3    5:aload_0         
	//*   4    6:getfield        #38  <Field boolean started>
	//*   5    9:ifeq            57
		{
			long l1 = clock.elapsedRealtime() - baseElapsedMs;
	//    6   12:aload_0         
	//    7   13:getfield        #22  <Field Clock clock>
	//    8   16:invokeinterface #43  <Method long Clock.elapsedRealtime()>
	//    9   21:aload_0         
	//   10   22:getfield        #45  <Field long baseElapsedMs>
	//   11   25:lsub            
	//   12   26:lstore_3        
			if(playbackParameters.speed == 1.0F)
	//*  13   27:aload_0         
	//*  14   28:getfield        #29  <Field PlaybackParameters playbackParameters>
	//*  15   31:getfield        #49  <Field float PlaybackParameters.speed>
	//*  16   34:fconst_1        
	//*  17   35:fcmpl           
	//*  18   36:ifne            46
				return l + C.msToUs(l1);
	//   19   39:lload_1         
	//   20   40:lload_3         
	//   21   41:invokestatic    #55  <Method long C.msToUs(long)>
	//   22   44:ladd            
	//   23   45:lreturn         
			else
				return l + playbackParameters.getMediaTimeUsForPlayoutTimeMs(l1);
	//   24   46:lload_1         
	//   25   47:aload_0         
	//   26   48:getfield        #29  <Field PlaybackParameters playbackParameters>
	//   27   51:lload_3         
	//   28   52:invokevirtual   #58  <Method long PlaybackParameters.getMediaTimeUsForPlayoutTimeMs(long)>
	//   29   55:ladd            
	//   30   56:lreturn         
		} else
		{
			return l;
	//   31   57:lload_1         
	//   32   58:lreturn         
		}
	}

	public void resetPosition(long l)
	{
		baseUs = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #36  <Field long baseUs>
		if(started)
	//*   3    5:aload_0         
	//*   4    6:getfield        #38  <Field boolean started>
	//*   5    9:ifeq            25
			baseElapsedMs = clock.elapsedRealtime();
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #22  <Field Clock clock>
	//    9   17:invokeinterface #43  <Method long Clock.elapsedRealtime()>
	//   10   22:putfield        #45  <Field long baseElapsedMs>
	//   11   25:return          
	}

	public PlaybackParameters setPlaybackParameters(PlaybackParameters playbackparameters)
	{
		if(started)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field boolean started>
	//*   2    4:ifeq            15
			resetPosition(getPositionUs());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #64  <Method long getPositionUs()>
	//    6   12:invokevirtual   #66  <Method void resetPosition(long)>
		playbackParameters = playbackparameters;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #29  <Field PlaybackParameters playbackParameters>
		return playbackparameters;
	//   10   20:aload_1         
	//   11   21:areturn         
	}

	public void start()
	{
		if(!started)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field boolean started>
	//*   2    4:ifne            25
		{
			baseElapsedMs = clock.elapsedRealtime();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #22  <Field Clock clock>
	//    6   12:invokeinterface #43  <Method long Clock.elapsedRealtime()>
	//    7   17:putfield        #45  <Field long baseElapsedMs>
			started = true;
	//    8   20:aload_0         
	//    9   21:iconst_1        
	//   10   22:putfield        #38  <Field boolean started>
		}
	//   11   25:return          
	}

	public void stop()
	{
		if(started)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field boolean started>
	//*   2    4:ifeq            20
		{
			resetPosition(getPositionUs());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #64  <Method long getPositionUs()>
	//    6   12:invokevirtual   #66  <Method void resetPosition(long)>
			started = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #38  <Field boolean started>
		}
	//   10   20:return          
	}

	private long baseElapsedMs;
	private long baseUs;
	private final Clock clock;
	private PlaybackParameters playbackParameters;
	private boolean started;
}
