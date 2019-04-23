// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.audio;

import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.SystemClock;

// Referenced classes of package com.google.android.exoplayer.audio:
//			AudioTrack

private static class AudioTrack$AudioTrackUtil
{

	public long getPlaybackHeadPosition()
	{
		if(stopTimestampUs != -1L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field long stopTimestampUs>
	//*   2    4:ldc2w           #32  <Long -1L>
	//*   3    7:lcmp            
	//*   4    8:ifeq            48
		{
			long l = ((SystemClock.elapsedRealtime() * 1000L - stopTimestampUs) * (long)sampleRate) / 0xf4240L;
	//    5   11:invokestatic    #38  <Method long SystemClock.elapsedRealtime()>
	//    6   14:ldc2w           #39  <Long 1000L>
	//    7   17:lmul            
	//    8   18:aload_0         
	//    9   19:getfield        #31  <Field long stopTimestampUs>
	//   10   22:lsub            
	//   11   23:aload_0         
	//   12   24:getfield        #42  <Field int sampleRate>
	//   13   27:i2l             
	//   14   28:lmul            
	//   15   29:ldc2w           #43  <Long 0xf4240L>
	//   16   32:ldiv            
	//   17   33:lstore_2        
			return Math.min(endPlaybackHeadPosition, stopPlaybackHeadPosition + l);
	//   18   34:aload_0         
	//   19   35:getfield        #46  <Field long endPlaybackHeadPosition>
	//   20   38:aload_0         
	//   21   39:getfield        #48  <Field long stopPlaybackHeadPosition>
	//   22   42:lload_2         
	//   23   43:ladd            
	//   24   44:invokestatic    #54  <Method long Math.min(long, long)>
	//   25   47:lreturn         
		}
		int i = audioTrack.getPlayState();
	//   26   48:aload_0         
	//   27   49:getfield        #56  <Field AudioTrack audioTrack>
	//   28   52:invokevirtual   #62  <Method int AudioTrack.getPlayState()>
	//   29   55:istore_1        
		if(i == 1)
	//*  30   56:iload_1         
	//*  31   57:iconst_1        
	//*  32   58:icmpne          63
			return 0L;
	//   33   61:lconst_0        
	//   34   62:lreturn         
		long l2 = 0xffffffffL & (long)audioTrack.getPlaybackHeadPosition();
	//   35   63:ldc2w           #63  <Long 0xffffffffL>
	//   36   66:aload_0         
	//   37   67:getfield        #56  <Field AudioTrack audioTrack>
	//   38   70:invokevirtual   #66  <Method int AudioTrack.getPlaybackHeadPosition()>
	//   39   73:i2l             
	//   40   74:land            
	//   41   75:lstore          4
		long l1 = l2;
	//   42   77:lload           4
	//   43   79:lstore_2        
		if(needsPassthroughWorkaround)
	//*  44   80:aload_0         
	//*  45   81:getfield        #68  <Field boolean needsPassthroughWorkaround>
	//*  46   84:ifeq            115
		{
			if(i == 2 && l2 == 0L)
	//*  47   87:iload_1         
	//*  48   88:iconst_2        
	//*  49   89:icmpne          107
	//*  50   92:lload           4
	//*  51   94:lconst_0        
	//*  52   95:lcmp            
	//*  53   96:ifne            107
				passthroughWorkaroundPauseOffset = lastRawPlaybackHeadPosition;
	//   54   99:aload_0         
	//   55  100:aload_0         
	//   56  101:getfield        #70  <Field long lastRawPlaybackHeadPosition>
	//   57  104:putfield        #72  <Field long passthroughWorkaroundPauseOffset>
			l1 = l2 + passthroughWorkaroundPauseOffset;
	//   58  107:lload           4
	//   59  109:aload_0         
	//   60  110:getfield        #72  <Field long passthroughWorkaroundPauseOffset>
	//   61  113:ladd            
	//   62  114:lstore_2        
		}
		if(lastRawPlaybackHeadPosition > l1)
	//*  63  115:aload_0         
	//*  64  116:getfield        #70  <Field long lastRawPlaybackHeadPosition>
	//*  65  119:lload_2         
	//*  66  120:lcmp            
	//*  67  121:ifle            134
			rawPlaybackHeadWrapCount = rawPlaybackHeadWrapCount + 1L;
	//   68  124:aload_0         
	//   69  125:aload_0         
	//   70  126:getfield        #74  <Field long rawPlaybackHeadWrapCount>
	//   71  129:lconst_1        
	//   72  130:ladd            
	//   73  131:putfield        #74  <Field long rawPlaybackHeadWrapCount>
		lastRawPlaybackHeadPosition = l1;
	//   74  134:aload_0         
	//   75  135:lload_2         
	//   76  136:putfield        #70  <Field long lastRawPlaybackHeadPosition>
		return l1 + (rawPlaybackHeadWrapCount << 32);
	//   77  139:lload_2         
	//   78  140:aload_0         
	//   79  141:getfield        #74  <Field long rawPlaybackHeadWrapCount>
	//   80  144:bipush          32
	//   81  146:lshl            
	//   82  147:ladd            
	//   83  148:lreturn         
	}

	public long getPlaybackHeadPositionUs()
	{
		return (getPlaybackHeadPosition() * 0xf4240L) / (long)sampleRate;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #77  <Method long getPlaybackHeadPosition()>
	//    2    4:ldc2w           #43  <Long 0xf4240L>
	//    3    7:lmul            
	//    4    8:aload_0         
	//    5    9:getfield        #42  <Field int sampleRate>
	//    6   12:i2l             
	//    7   13:ldiv            
	//    8   14:lreturn         
	}

	public float getPlaybackSpeed()
	{
		return 1.0F;
	//    0    0:fconst_1        
	//    1    1:freturn         
	}

	public long getTimestampFramePosition()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #82  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #83  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public long getTimestampNanoTime()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #82  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #83  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public void handleEndOfStream(long l)
	{
		stopPlaybackHeadPosition = getPlaybackHeadPosition();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #77  <Method long getPlaybackHeadPosition()>
	//    3    5:putfield        #48  <Field long stopPlaybackHeadPosition>
		stopTimestampUs = SystemClock.elapsedRealtime() * 1000L;
	//    4    8:aload_0         
	//    5    9:invokestatic    #38  <Method long SystemClock.elapsedRealtime()>
	//    6   12:ldc2w           #39  <Long 1000L>
	//    7   15:lmul            
	//    8   16:putfield        #31  <Field long stopTimestampUs>
		endPlaybackHeadPosition = l;
	//    9   19:aload_0         
	//   10   20:lload_1         
	//   11   21:putfield        #46  <Field long endPlaybackHeadPosition>
		audioTrack.stop();
	//   12   24:aload_0         
	//   13   25:getfield        #56  <Field AudioTrack audioTrack>
	//   14   28:invokevirtual   #89  <Method void AudioTrack.stop()>
	//   15   31:return          
	}

	public void pause()
	{
		if(stopTimestampUs != -1L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field long stopTimestampUs>
	//*   2    4:ldc2w           #32  <Long -1L>
	//*   3    7:lcmp            
	//*   4    8:ifeq            12
		{
			return;
	//    5   11:return          
		} else
		{
			audioTrack.pause();
	//    6   12:aload_0         
	//    7   13:getfield        #56  <Field AudioTrack audioTrack>
	//    8   16:invokevirtual   #92  <Method void AudioTrack.pause()>
			return;
	//    9   19:return          
		}
	}

	public void reconfigure(AudioTrack audiotrack, boolean flag)
	{
		audioTrack = audiotrack;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #56  <Field AudioTrack audioTrack>
		needsPassthroughWorkaround = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #68  <Field boolean needsPassthroughWorkaround>
		stopTimestampUs = -1L;
	//    6   10:aload_0         
	//    7   11:ldc2w           #32  <Long -1L>
	//    8   14:putfield        #31  <Field long stopTimestampUs>
		lastRawPlaybackHeadPosition = 0L;
	//    9   17:aload_0         
	//   10   18:lconst_0        
	//   11   19:putfield        #70  <Field long lastRawPlaybackHeadPosition>
		rawPlaybackHeadWrapCount = 0L;
	//   12   22:aload_0         
	//   13   23:lconst_0        
	//   14   24:putfield        #74  <Field long rawPlaybackHeadWrapCount>
		passthroughWorkaroundPauseOffset = 0L;
	//   15   27:aload_0         
	//   16   28:lconst_0        
	//   17   29:putfield        #72  <Field long passthroughWorkaroundPauseOffset>
		if(audiotrack != null)
	//*  18   32:aload_1         
	//*  19   33:ifnull          44
			sampleRate = audiotrack.getSampleRate();
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:invokevirtual   #97  <Method int AudioTrack.getSampleRate()>
	//   23   41:putfield        #42  <Field int sampleRate>
	//   24   44:return          
	}

	public void setPlaybackParameters(PlaybackParams playbackparams)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #82  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #83  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public boolean updateTimestamp()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected AudioTrack audioTrack;
	private long endPlaybackHeadPosition;
	private long lastRawPlaybackHeadPosition;
	private boolean needsPassthroughWorkaround;
	private long passthroughWorkaroundPauseOffset;
	private long rawPlaybackHeadWrapCount;
	private int sampleRate;
	private long stopPlaybackHeadPosition;
	private long stopTimestampUs;

	private AudioTrack$AudioTrackUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}

	AudioTrack$AudioTrackUtil(AudioTrack._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void AudioTrack$AudioTrackUtil()>
	//    2    4:return          
	}
}
