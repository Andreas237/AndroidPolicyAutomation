// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

// Referenced classes of package com.google.android.exoplayer2.audio:
//			AudioTimestampPoller

private static final class AudioTimestampPoller$AudioTimestampV19
{

	public long getTimestampPositionFrames()
	{
		return lastTimestampPositionFrames;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field long lastTimestampPositionFrames>
	//    2    4:lreturn         
	}

	public long getTimestampSystemTimeUs()
	{
		return audioTimestamp.nanoTime / 1000L;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field AudioTimestamp audioTimestamp>
	//    2    4:getfield        #39  <Field long AudioTimestamp.nanoTime>
	//    3    7:ldc2w           #40  <Long 1000L>
	//    4   10:ldiv            
	//    5   11:lreturn         
	}

	public boolean maybeUpdateTimestamp()
	{
		boolean flag = audioTrack.getTimestamp(audioTimestamp);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field AudioTrack audioTrack>
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field AudioTimestamp audioTimestamp>
	//    4    8:invokevirtual   #49  <Method boolean AudioTrack.getTimestamp(AudioTimestamp)>
	//    5   11:istore_1        
		if(flag)
	//*   6   12:iload_1         
	//*   7   13:ifeq            61
		{
			long l = audioTimestamp.framePosition;
	//    8   16:aload_0         
	//    9   17:getfield        #30  <Field AudioTimestamp audioTimestamp>
	//   10   20:getfield        #52  <Field long AudioTimestamp.framePosition>
	//   11   23:lstore_2        
			if(lastTimestampRawPositionFrames > l)
	//*  12   24:aload_0         
	//*  13   25:getfield        #54  <Field long lastTimestampRawPositionFrames>
	//*  14   28:lload_2         
	//*  15   29:lcmp            
	//*  16   30:ifle            43
				rawTimestampFramePositionWrapCount = rawTimestampFramePositionWrapCount + 1L;
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:getfield        #56  <Field long rawTimestampFramePositionWrapCount>
	//   20   38:lconst_1        
	//   21   39:ladd            
	//   22   40:putfield        #56  <Field long rawTimestampFramePositionWrapCount>
			lastTimestampRawPositionFrames = l;
	//   23   43:aload_0         
	//   24   44:lload_2         
	//   25   45:putfield        #54  <Field long lastTimestampRawPositionFrames>
			lastTimestampPositionFrames = l + (rawTimestampFramePositionWrapCount << 32);
	//   26   48:aload_0         
	//   27   49:lload_2         
	//   28   50:aload_0         
	//   29   51:getfield        #56  <Field long rawTimestampFramePositionWrapCount>
	//   30   54:bipush          32
	//   31   56:lshl            
	//   32   57:ladd            
	//   33   58:putfield        #35  <Field long lastTimestampPositionFrames>
		}
		return flag;
	//   34   61:iload_1         
	//   35   62:ireturn         
	}

	private final AudioTimestamp audioTimestamp = new AudioTimestamp();
	private final AudioTrack audioTrack;
	private long lastTimestampPositionFrames;
	private long lastTimestampRawPositionFrames;
	private long rawTimestampFramePositionWrapCount;

	public AudioTimestampPoller$AudioTimestampV19(AudioTrack audiotrack)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		audioTrack = audiotrack;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field AudioTrack audioTrack>
	//    5    9:aload_0         
	//    6   10:new             #27  <Class AudioTimestamp>
	//    7   13:dup             
	//    8   14:invokespecial   #28  <Method void AudioTimestamp()>
	//    9   17:putfield        #30  <Field AudioTimestamp audioTimestamp>
	//   10   20:return          
	}
}
