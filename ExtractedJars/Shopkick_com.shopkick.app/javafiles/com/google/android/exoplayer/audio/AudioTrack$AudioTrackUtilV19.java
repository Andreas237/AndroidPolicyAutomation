// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

// Referenced classes of package com.google.android.exoplayer.audio:
//			AudioTrack

private static class AudioTrack$AudioTrackUtilV19 extends AudioTrack.AudioTrackUtil
{

	public long getTimestampFramePosition()
	{
		return lastTimestampFramePosition;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field long lastTimestampFramePosition>
	//    2    4:lreturn         
	}

	public long getTimestampNanoTime()
	{
		return audioTimestamp.nanoTime;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field AudioTimestamp audioTimestamp>
	//    2    4:getfield        #36  <Field long AudioTimestamp.nanoTime>
	//    3    7:lreturn         
	}

	public void reconfigure(AudioTrack audiotrack, boolean flag)
	{
		super.reconfigure(audiotrack, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #40  <Method void AudioTrack$AudioTrackUtil.reconfigure(AudioTrack, boolean)>
		rawTimestampFramePositionWrapCount = 0L;
	//    4    6:aload_0         
	//    5    7:lconst_0        
	//    6    8:putfield        #42  <Field long rawTimestampFramePositionWrapCount>
		lastRawTimestampFramePosition = 0L;
	//    7   11:aload_0         
	//    8   12:lconst_0        
	//    9   13:putfield        #44  <Field long lastRawTimestampFramePosition>
		lastTimestampFramePosition = 0L;
	//   10   16:aload_0         
	//   11   17:lconst_0        
	//   12   18:putfield        #32  <Field long lastTimestampFramePosition>
	//   13   21:return          
	}

	public boolean updateTimestamp()
	{
		boolean flag = audioTrack.getTimestamp(audioTimestamp);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field AudioTrack audioTrack>
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field AudioTimestamp audioTimestamp>
	//    4    8:invokevirtual   #56  <Method boolean AudioTrack.getTimestamp(AudioTimestamp)>
	//    5   11:istore_1        
		if(flag)
	//*   6   12:iload_1         
	//*   7   13:ifeq            61
		{
			long l = audioTimestamp.framePosition;
	//    8   16:aload_0         
	//    9   17:getfield        #27  <Field AudioTimestamp audioTimestamp>
	//   10   20:getfield        #59  <Field long AudioTimestamp.framePosition>
	//   11   23:lstore_2        
			if(lastRawTimestampFramePosition > l)
	//*  12   24:aload_0         
	//*  13   25:getfield        #44  <Field long lastRawTimestampFramePosition>
	//*  14   28:lload_2         
	//*  15   29:lcmp            
	//*  16   30:ifle            43
				rawTimestampFramePositionWrapCount = rawTimestampFramePositionWrapCount + 1L;
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:getfield        #42  <Field long rawTimestampFramePositionWrapCount>
	//   20   38:lconst_1        
	//   21   39:ladd            
	//   22   40:putfield        #42  <Field long rawTimestampFramePositionWrapCount>
			lastRawTimestampFramePosition = l;
	//   23   43:aload_0         
	//   24   44:lload_2         
	//   25   45:putfield        #44  <Field long lastRawTimestampFramePosition>
			lastTimestampFramePosition = l + (rawTimestampFramePositionWrapCount << 32);
	//   26   48:aload_0         
	//   27   49:lload_2         
	//   28   50:aload_0         
	//   29   51:getfield        #42  <Field long rawTimestampFramePositionWrapCount>
	//   30   54:bipush          32
	//   31   56:lshl            
	//   32   57:ladd            
	//   33   58:putfield        #32  <Field long lastTimestampFramePosition>
		}
		return flag;
	//   34   61:iload_1         
	//   35   62:ireturn         
	}

	private final AudioTimestamp audioTimestamp = new AudioTimestamp();
	private long lastRawTimestampFramePosition;
	private long lastTimestampFramePosition;
	private long rawTimestampFramePositionWrapCount;

	public AudioTrack$AudioTrackUtilV19()
	{
		super(((AudioTrack._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #21  <Method void AudioTrack$AudioTrackUtil(AudioTrack$1)>
	//    3    5:aload_0         
	//    4    6:new             #23  <Class AudioTimestamp>
	//    5    9:dup             
	//    6   10:invokespecial   #25  <Method void AudioTimestamp()>
	//    7   13:putfield        #27  <Field AudioTimestamp audioTimestamp>
	//    8   16:return          
	}
}
