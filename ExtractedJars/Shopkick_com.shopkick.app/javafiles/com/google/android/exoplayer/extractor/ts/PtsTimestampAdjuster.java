// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.ts;


public final class PtsTimestampAdjuster
{

	public PtsTimestampAdjuster(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		firstSampleTimestampUs = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #21  <Field long firstSampleTimestampUs>
		lastPts = 0x0L;
	//    5    9:aload_0         
	//    6   10:ldc2w           #22  <Long 0x0L>
	//    7   13:putfield        #25  <Field long lastPts>
	//    8   16:return          
	}

	public static long ptsToUs(long l)
	{
		return (l * 0xf4240L) / 0x15f90L;
	//    0    0:lload_0         
	//    1    1:ldc2w           #29  <Long 0xf4240L>
	//    2    4:lmul            
	//    3    5:ldc2w           #31  <Long 0x15f90L>
	//    4    8:ldiv            
	//    5    9:lreturn         
	}

	public static long usToPts(long l)
	{
		return (l * 0x15f90L) / 0xf4240L;
	//    0    0:lload_0         
	//    1    1:ldc2w           #31  <Long 0x15f90L>
	//    2    4:lmul            
	//    3    5:ldc2w           #29  <Long 0xf4240L>
	//    4    8:ldiv            
	//    5    9:lreturn         
	}

	public long adjustTimestamp(long l)
	{
		long l1 = l;
	//    0    0:lload_1         
	//    1    1:lstore_3        
		if(lastPts != 0x0L)
	//*   2    2:aload_0         
	//*   3    3:getfield        #25  <Field long lastPts>
	//*   4    6:ldc2w           #22  <Long 0x0L>
	//*   5    9:lcmp            
	//*   6   10:ifeq            73
		{
			l1 = (lastPts + 0x0L) / 0x0L;
	//    7   13:aload_0         
	//    8   14:getfield        #25  <Field long lastPts>
	//    9   17:ldc2w           #35  <Long 0x0L>
	//   10   20:ladd            
	//   11   21:ldc2w           #10  <Long 0x0L>
	//   12   24:ldiv            
	//   13   25:lstore_3        
			long l2 = (l1 - 1L) * 0x0L + l;
	//   14   26:lload_3         
	//   15   27:lconst_1        
	//   16   28:lsub            
	//   17   29:ldc2w           #10  <Long 0x0L>
	//   18   32:lmul            
	//   19   33:lload_1         
	//   20   34:ladd            
	//   21   35:lstore          5
			l += l1 * 0x0L;
	//   22   37:lload_1         
	//   23   38:lload_3         
	//   24   39:ldc2w           #10  <Long 0x0L>
	//   25   42:lmul            
	//   26   43:ladd            
	//   27   44:lstore_1        
			l1 = l;
	//   28   45:lload_1         
	//   29   46:lstore_3        
			if(Math.abs(l2 - lastPts) < Math.abs(l - lastPts))
	//*  30   47:lload           5
	//*  31   49:aload_0         
	//*  32   50:getfield        #25  <Field long lastPts>
	//*  33   53:lsub            
	//*  34   54:invokestatic    #41  <Method long Math.abs(long)>
	//*  35   57:lload_1         
	//*  36   58:aload_0         
	//*  37   59:getfield        #25  <Field long lastPts>
	//*  38   62:lsub            
	//*  39   63:invokestatic    #41  <Method long Math.abs(long)>
	//*  40   66:lcmp            
	//*  41   67:ifge            73
				l1 = l2;
	//   42   70:lload           5
	//   43   72:lstore_3        
		}
		l = ptsToUs(l1);
	//   44   73:lload_3         
	//   45   74:invokestatic    #43  <Method long ptsToUs(long)>
	//   46   77:lstore_1        
		if(firstSampleTimestampUs != 0xffffffffL && lastPts == 0x0L)
	//*  47   78:aload_0         
	//*  48   79:getfield        #21  <Field long firstSampleTimestampUs>
	//*  49   82:ldc2w           #7   <Long 0xffffffffL>
	//*  50   85:lcmp            
	//*  51   86:ifeq            110
	//*  52   89:aload_0         
	//*  53   90:getfield        #25  <Field long lastPts>
	//*  54   93:ldc2w           #22  <Long 0x0L>
	//*  55   96:lcmp            
	//*  56   97:ifne            110
			timestampOffsetUs = firstSampleTimestampUs - l;
	//   57  100:aload_0         
	//   58  101:aload_0         
	//   59  102:getfield        #21  <Field long firstSampleTimestampUs>
	//   60  105:lload_1         
	//   61  106:lsub            
	//   62  107:putfield        #45  <Field long timestampOffsetUs>
		lastPts = l1;
	//   63  110:aload_0         
	//   64  111:lload_3         
	//   65  112:putfield        #25  <Field long lastPts>
		return l + timestampOffsetUs;
	//   66  115:lload_1         
	//   67  116:aload_0         
	//   68  117:getfield        #45  <Field long timestampOffsetUs>
	//   69  120:ladd            
	//   70  121:lreturn         
	}

	public boolean isInitialized()
	{
		return lastPts != 0x0L;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field long lastPts>
	//    2    4:ldc2w           #22  <Long 0x0L>
	//    3    7:lcmp            
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public void reset()
	{
		lastPts = 0x0L;
	//    0    0:aload_0         
	//    1    1:ldc2w           #22  <Long 0x0L>
	//    2    4:putfield        #25  <Field long lastPts>
	//    3    7:return          
	}

	public static final long DO_NOT_OFFSET = 0xffffffffL;
	private static final long MAX_PTS_PLUS_ONE = 0x0L;
	private final long firstSampleTimestampUs;
	private volatile long lastPts;
	private long timestampOffsetUs;
}
