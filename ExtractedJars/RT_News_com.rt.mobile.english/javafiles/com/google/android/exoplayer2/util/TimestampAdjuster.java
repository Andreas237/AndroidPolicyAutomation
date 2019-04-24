// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.util;


// Referenced classes of package com.google.android.exoplayer2.util:
//			Assertions

public final class TimestampAdjuster
{

	public TimestampAdjuster(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		lastSampleTimestampUs = 0x1L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #20  <Long 0x1L>
	//    4    8:putfield        #23  <Field long lastSampleTimestampUs>
		setFirstSampleTimestampUs(l);
	//    5   11:aload_0         
	//    6   12:lload_1         
	//    7   13:invokevirtual   #26  <Method void setFirstSampleTimestampUs(long)>
	//    8   16:return          
	}

	public static long ptsToUs(long l)
	{
		return (l * 0xf4240L) / 0x15f90L;
	//    0    0:lload_0         
	//    1    1:ldc2w           #30  <Long 0xf4240L>
	//    2    4:lmul            
	//    3    5:ldc2w           #32  <Long 0x15f90L>
	//    4    8:ldiv            
	//    5    9:lreturn         
	}

	public static long usToPts(long l)
	{
		return (l * 0x15f90L) / 0xf4240L;
	//    0    0:lload_0         
	//    1    1:ldc2w           #32  <Long 0x15f90L>
	//    2    4:lmul            
	//    3    5:ldc2w           #30  <Long 0xf4240L>
	//    4    8:ldiv            
	//    5    9:lreturn         
	}

	public long adjustSampleTimestamp(long l)
	{
		if(l == 0x1L)
	//*   0    0:lload_1         
	//*   1    1:ldc2w           #20  <Long 0x1L>
	//*   2    4:lcmp            
	//*   3    5:ifne            12
			return 0x1L;
	//    4    8:ldc2w           #20  <Long 0x1L>
	//    5   11:lreturn         
		if(lastSampleTimestampUs == 0x1L) goto _L2; else goto _L1
	//    6   12:aload_0         
	//    7   13:getfield        #23  <Field long lastSampleTimestampUs>
	//    8   16:ldc2w           #20  <Long 0x1L>
	//    9   19:lcmp            
	//   10   20:ifeq            31
_L1:
		lastSampleTimestampUs = l;
	//   11   23:aload_0         
	//   12   24:lload_1         
	//   13   25:putfield        #23  <Field long lastSampleTimestampUs>
		  goto _L3
	//*  14   28:goto            65
_L2:
		if(firstSampleTimestampUs != 0xffffffffL)
	//*  15   31:aload_0         
	//*  16   32:getfield        #37  <Field long firstSampleTimestampUs>
	//*  17   35:ldc2w           #7   <Long 0xffffffffL>
	//*  18   38:lcmp            
	//*  19   39:ifeq            52
			timestampOffsetUs = firstSampleTimestampUs - l;
	//   20   42:aload_0         
	//   21   43:aload_0         
	//   22   44:getfield        #37  <Field long firstSampleTimestampUs>
	//   23   47:lload_1         
	//   24   48:lsub            
	//   25   49:putfield        #39  <Field long timestampOffsetUs>
		this;
	//   26   52:aload_0         
		JVM INSTR monitorenter ;
	//   27   53:monitorenter    
		lastSampleTimestampUs = l;
	//   28   54:aload_0         
	//   29   55:lload_1         
	//   30   56:putfield        #23  <Field long lastSampleTimestampUs>
		((Object)this).notifyAll();
	//   31   59:aload_0         
	//   32   60:invokevirtual   #42  <Method void Object.notifyAll()>
		this;
	//   33   63:aload_0         
		JVM INSTR monitorexit ;
	//   34   64:monitorexit     
_L3:
		return l + timestampOffsetUs;
	//   35   65:lload_1         
	//   36   66:aload_0         
	//   37   67:getfield        #39  <Field long timestampOffsetUs>
	//   38   70:ladd            
	//   39   71:lreturn         
		Exception exception;
		exception;
	//   40   72:astore_3        
		this;
	//   41   73:aload_0         
		JVM INSTR monitorexit ;
	//   42   74:monitorexit     
		throw exception;
	//   43   75:aload_3         
	//   44   76:athrow          
	}

	public long adjustTsTimestamp(long l)
	{
		if(l == 0x1L)
	//*   0    0:lload_1         
	//*   1    1:ldc2w           #20  <Long 0x1L>
	//*   2    4:lcmp            
	//*   3    5:ifne            12
			return 0x1L;
	//    4    8:ldc2w           #20  <Long 0x1L>
	//    5   11:lreturn         
		long l1 = l;
	//    6   12:lload_1         
	//    7   13:lstore_3        
		if(lastSampleTimestampUs != 0x1L)
	//*   8   14:aload_0         
	//*   9   15:getfield        #23  <Field long lastSampleTimestampUs>
	//*  10   18:ldc2w           #20  <Long 0x1L>
	//*  11   21:lcmp            
	//*  12   22:ifeq            89
		{
			long l2 = usToPts(lastSampleTimestampUs);
	//   13   25:aload_0         
	//   14   26:getfield        #23  <Field long lastSampleTimestampUs>
	//   15   29:invokestatic    #45  <Method long usToPts(long)>
	//   16   32:lstore          5
			long l3 = (l2 + 0x0L) / 0x0L;
	//   17   34:lload           5
	//   18   36:ldc2w           #46  <Long 0x0L>
	//   19   39:ladd            
	//   20   40:ldc2w           #10  <Long 0x0L>
	//   21   43:ldiv            
	//   22   44:lstore          7
			l1 = l + (l3 - 1L) * 0x0L;
	//   23   46:lload_1         
	//   24   47:lload           7
	//   25   49:lconst_1        
	//   26   50:lsub            
	//   27   51:ldc2w           #10  <Long 0x0L>
	//   28   54:lmul            
	//   29   55:ladd            
	//   30   56:lstore_3        
			l += 0x0L * l3;
	//   31   57:lload_1         
	//   32   58:ldc2w           #10  <Long 0x0L>
	//   33   61:lload           7
	//   34   63:lmul            
	//   35   64:ladd            
	//   36   65:lstore_1        
			if(Math.abs(l1 - l2) >= Math.abs(l - l2))
	//*  37   66:lload_3         
	//*  38   67:lload           5
	//*  39   69:lsub            
	//*  40   70:invokestatic    #52  <Method long Math.abs(long)>
	//*  41   73:lload_1         
	//*  42   74:lload           5
	//*  43   76:lsub            
	//*  44   77:invokestatic    #52  <Method long Math.abs(long)>
	//*  45   80:lcmp            
	//*  46   81:ifge            87
	//*  47   84:goto            89
				l1 = l;
	//   48   87:lload_1         
	//   49   88:lstore_3        
		}
		return adjustSampleTimestamp(ptsToUs(l1));
	//   50   89:aload_0         
	//   51   90:lload_3         
	//   52   91:invokestatic    #54  <Method long ptsToUs(long)>
	//   53   94:invokevirtual   #56  <Method long adjustSampleTimestamp(long)>
	//   54   97:lreturn         
	}

	public long getFirstSampleTimestampUs()
	{
		return firstSampleTimestampUs;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field long firstSampleTimestampUs>
	//    2    4:lreturn         
	}

	public long getLastAdjustedTimestampUs()
	{
		long l1 = lastSampleTimestampUs;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field long lastSampleTimestampUs>
	//    2    4:lstore_3        
		long l = 0x1L;
	//    3    5:ldc2w           #20  <Long 0x1L>
	//    4    8:lstore_1        
		if(l1 != 0x1L)
	//*   5    9:lload_3         
	//*   6   10:ldc2w           #20  <Long 0x1L>
	//*   7   13:lcmp            
	//*   8   14:ifeq            27
			return lastSampleTimestampUs + timestampOffsetUs;
	//    9   17:aload_0         
	//   10   18:getfield        #23  <Field long lastSampleTimestampUs>
	//   11   21:aload_0         
	//   12   22:getfield        #39  <Field long timestampOffsetUs>
	//   13   25:ladd            
	//   14   26:lreturn         
		if(firstSampleTimestampUs != 0xffffffffL)
	//*  15   27:aload_0         
	//*  16   28:getfield        #37  <Field long firstSampleTimestampUs>
	//*  17   31:ldc2w           #7   <Long 0xffffffffL>
	//*  18   34:lcmp            
	//*  19   35:ifeq            43
			l = firstSampleTimestampUs;
	//   20   38:aload_0         
	//   21   39:getfield        #37  <Field long firstSampleTimestampUs>
	//   22   42:lstore_1        
		return l;
	//   23   43:lload_1         
	//   24   44:lreturn         
	}

	public long getTimestampOffsetUs()
	{
		if(firstSampleTimestampUs == 0xffffffffL)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field long firstSampleTimestampUs>
	//*   2    4:ldc2w           #7   <Long 0xffffffffL>
	//*   3    7:lcmp            
	//*   4    8:ifne            13
			return 0L;
	//    5   11:lconst_0        
	//    6   12:lreturn         
		if(lastSampleTimestampUs == 0x1L)
	//*   7   13:aload_0         
	//*   8   14:getfield        #23  <Field long lastSampleTimestampUs>
	//*   9   17:ldc2w           #20  <Long 0x1L>
	//*  10   20:lcmp            
	//*  11   21:ifne            28
			return 0x1L;
	//   12   24:ldc2w           #20  <Long 0x1L>
	//   13   27:lreturn         
		else
			return timestampOffsetUs;
	//   14   28:aload_0         
	//   15   29:getfield        #39  <Field long timestampOffsetUs>
	//   16   32:lreturn         
	}

	public void reset()
	{
		lastSampleTimestampUs = 0x1L;
	//    0    0:aload_0         
	//    1    1:ldc2w           #20  <Long 0x1L>
	//    2    4:putfield        #23  <Field long lastSampleTimestampUs>
	//    3    7:return          
	}

	public void setFirstSampleTimestampUs(long l)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag;
		Exception exception;
		if(lastSampleTimestampUs == 0x1L)
	//*   2    2:aload_0         
	//*   3    3:getfield        #23  <Field long lastSampleTimestampUs>
	//*   4    6:ldc2w           #20  <Long 0x1L>
	//*   5    9:lcmp            
	//*   6   10:ifne            37
			flag = true;
	//    7   13:iconst_1        
	//    8   14:istore_3        
		else
	//*   9   15:goto            18
	//*  10   18:iload_3         
	//*  11   19:invokestatic    #67  <Method void Assertions.checkState(boolean)>
	//*  12   22:aload_0         
	//*  13   23:lload_1         
	//*  14   24:putfield        #37  <Field long firstSampleTimestampUs>
	//*  15   27:aload_0         
	//*  16   28:monitorexit     
	//*  17   29:return          
	//*  18   30:astore          4
	//*  19   32:aload_0         
	//*  20   33:monitorexit     
	//*  21   34:aload           4
	//*  22   36:athrow          
			flag = false;
	//   23   37:iconst_0        
	//   24   38:istore_3        
		Assertions.checkState(flag);
		firstSampleTimestampUs = l;
		this;
		JVM INSTR monitorexit ;
		return;
		exception;
		throw exception;
	//*  25   39:goto            18
	}

	public void waitUntilInitialized()
		throws InterruptedException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		while(lastSampleTimestampUs == 0x1L) 
	//*   2    2:aload_0         
	//*   3    3:getfield        #23  <Field long lastSampleTimestampUs>
	//*   4    6:ldc2w           #20  <Long 0x1L>
	//*   5    9:lcmp            
	//*   6   10:ifne            20
			((Object)this).wait();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #73  <Method void Object.wait()>
	//*   9   17:goto            2
		this;
	//   10   20:aload_0         
		JVM INSTR monitorexit ;
	//   11   21:monitorexit     
		return;
	//   12   22:return          
		Exception exception;
		exception;
	//   13   23:astore_1        
	//*  14   24:aload_0         
		throw exception;
	//   15   25:monitorexit     
	//   16   26:aload_1         
	//   17   27:athrow          
	}

	public static final long DO_NOT_OFFSET = 0xffffffffL;
	private static final long MAX_PTS_PLUS_ONE = 0x0L;
	private long firstSampleTimestampUs;
	private volatile long lastSampleTimestampUs;
	private long timestampOffsetUs;
}
