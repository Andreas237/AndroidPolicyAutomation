// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.mp3;


final class ConstantBitrateSeeker
	implements Mp3Extractor.Seeker
{

	public ConstantBitrateSeeker(long l, int i, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		firstFramePosition = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #20  <Field long firstFramePosition>
		bitrate = i;
	//    5    9:aload_0         
	//    6   10:iload_3         
	//    7   11:putfield        #22  <Field int bitrate>
		l = -1L;
	//    8   14:ldc2w           #23  <Long -1L>
	//    9   17:lstore_1        
		if(l1 != -1L)
	//*  10   18:lload           4
	//*  11   20:ldc2w           #23  <Long -1L>
	//*  12   23:lcmp            
	//*  13   24:ifne            30
	//*  14   27:goto            37
			l = getTimeUs(l1);
	//   15   30:aload_0         
	//   16   31:lload           4
	//   17   33:invokevirtual   #28  <Method long getTimeUs(long)>
	//   18   36:lstore_1        
		durationUs = l;
	//   19   37:aload_0         
	//   20   38:lload_1         
	//   21   39:putfield        #30  <Field long durationUs>
	//   22   42:return          
	}

	public long getDurationUs()
	{
		return durationUs;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field long durationUs>
	//    2    4:lreturn         
	}

	public long getPosition(long l)
	{
		if(durationUs == -1L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field long durationUs>
	//*   2    4:ldc2w           #23  <Long -1L>
	//*   3    7:lcmp            
	//*   4    8:ifne            13
		{
			return 0L;
	//    5   11:lconst_0        
	//    6   12:lreturn         
		} else
		{
			long l1 = firstFramePosition;
	//    7   13:aload_0         
	//    8   14:getfield        #20  <Field long firstFramePosition>
	//    9   17:lstore_3        
			return (l * (long)bitrate) / 0x7a1200L + l1;
	//   10   18:lload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #22  <Field int bitrate>
	//   13   23:i2l             
	//   14   24:lmul            
	//   15   25:ldc2w           #35  <Long 0x7a1200L>
	//   16   28:ldiv            
	//   17   29:lload_3         
	//   18   30:ladd            
	//   19   31:lreturn         
		}
	}

	public long getTimeUs(long l)
	{
		return (Math.max(0L, l - firstFramePosition) * 0xf4240L * 8L) / (long)bitrate;
	//    0    0:lconst_0        
	//    1    1:lload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #20  <Field long firstFramePosition>
	//    4    6:lsub            
	//    5    7:invokestatic    #42  <Method long Math.max(long, long)>
	//    6   10:ldc2w           #43  <Long 0xf4240L>
	//    7   13:lmul            
	//    8   14:ldc2w           #45  <Long 8L>
	//    9   17:lmul            
	//   10   18:aload_0         
	//   11   19:getfield        #22  <Field int bitrate>
	//   12   22:i2l             
	//   13   23:ldiv            
	//   14   24:lreturn         
	}

	public boolean isSeekable()
	{
		return durationUs != -1L;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field long durationUs>
	//    2    4:ldc2w           #23  <Long -1L>
	//    3    7:lcmp            
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	private static final int BITS_PER_BYTE = 8;
	private final int bitrate;
	private final long durationUs;
	private final long firstFramePosition;
}
