// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;

import com.google.android.exoplayer.util.Clock;

// Referenced classes of package com.google.android.exoplayer:
//			TimeRange

public static final class TimeRange$DynamicTimeRange
	implements TimeRange
{

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          81
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #36  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #36  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((TimeRange$DynamicTimeRange)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class TimeRange$DynamicTimeRange>
	//   16   28:astore_1        
			return ((TimeRange$DynamicTimeRange) (obj)).minStartTimeUs == minStartTimeUs && ((TimeRange$DynamicTimeRange) (obj)).maxEndTimeUs == maxEndTimeUs && ((TimeRange$DynamicTimeRange) (obj)).elapsedRealtimeAtStartUs == elapsedRealtimeAtStartUs && ((TimeRange$DynamicTimeRange) (obj)).bufferDepthUs == bufferDepthUs;
	//   17   29:aload_1         
	//   18   30:getfield        #21  <Field long minStartTimeUs>
	//   19   33:aload_0         
	//   20   34:getfield        #21  <Field long minStartTimeUs>
	//   21   37:lcmp            
	//   22   38:ifne            79
	//   23   41:aload_1         
	//   24   42:getfield        #23  <Field long maxEndTimeUs>
	//   25   45:aload_0         
	//   26   46:getfield        #23  <Field long maxEndTimeUs>
	//   27   49:lcmp            
	//   28   50:ifne            79
	//   29   53:aload_1         
	//   30   54:getfield        #25  <Field long elapsedRealtimeAtStartUs>
	//   31   57:aload_0         
	//   32   58:getfield        #25  <Field long elapsedRealtimeAtStartUs>
	//   33   61:lcmp            
	//   34   62:ifne            79
	//   35   65:aload_1         
	//   36   66:getfield        #27  <Field long bufferDepthUs>
	//   37   69:aload_0         
	//   38   70:getfield        #27  <Field long bufferDepthUs>
	//   39   73:lcmp            
	//   40   74:ifne            79
	//   41   77:iconst_1        
	//   42   78:ireturn         
	//   43   79:iconst_0        
	//   44   80:ireturn         
		} else
		{
			return false;
	//   45   81:iconst_0        
	//   46   82:ireturn         
		}
	}

	public long[] getCurrentBoundsMs(long al[])
	{
		al = getCurrentBoundsUs(al);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #41  <Method long[] getCurrentBoundsUs(long[])>
	//    3    5:astore_1        
		al[0] = al[0] / 1000L;
	//    4    6:aload_1         
	//    5    7:iconst_0        
	//    6    8:aload_1         
	//    7    9:iconst_0        
	//    8   10:laload          
	//    9   11:ldc2w           #42  <Long 1000L>
	//   10   14:ldiv            
	//   11   15:lastore         
		al[1] = al[1] / 1000L;
	//   12   16:aload_1         
	//   13   17:iconst_1        
	//   14   18:aload_1         
	//   15   19:iconst_1        
	//   16   20:laload          
	//   17   21:ldc2w           #42  <Long 1000L>
	//   18   24:ldiv            
	//   19   25:lastore         
		return al;
	//   20   26:aload_1         
	//   21   27:areturn         
	}

	public long[] getCurrentBoundsUs(long al[])
	{
		long al1[];
label0:
		{
			if(al != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          13
			{
				al1 = al;
	//    2    4:aload_1         
	//    3    5:astore          10
				if(al.length >= 2)
					break label0;
	//    4    7:aload_1         
	//    5    8:arraylength     
	//    6    9:iconst_2        
	//    7   10:icmpge          18
			}
			al1 = new long[2];
	//    8   13:iconst_2        
	//    9   14:newarray        long[]
	//   10   16:astore          10
		}
		long l2 = Math.min(maxEndTimeUs, systemClock.elapsedRealtime() * 1000L - elapsedRealtimeAtStartUs);
	//   11   18:aload_0         
	//   12   19:getfield        #23  <Field long maxEndTimeUs>
	//   13   22:aload_0         
	//   14   23:getfield        #29  <Field Clock systemClock>
	//   15   26:invokeinterface #49  <Method long Clock.elapsedRealtime()>
	//   16   31:ldc2w           #42  <Long 1000L>
	//   17   34:lmul            
	//   18   35:aload_0         
	//   19   36:getfield        #25  <Field long elapsedRealtimeAtStartUs>
	//   20   39:lsub            
	//   21   40:invokestatic    #55  <Method long Math.min(long, long)>
	//   22   43:lstore          6
		long l1 = minStartTimeUs;
	//   23   45:aload_0         
	//   24   46:getfield        #21  <Field long minStartTimeUs>
	//   25   49:lstore          4
		long l3 = bufferDepthUs;
	//   26   51:aload_0         
	//   27   52:getfield        #27  <Field long bufferDepthUs>
	//   28   55:lstore          8
		long l = l1;
	//   29   57:lload           4
	//   30   59:lstore_2        
		if(l3 != -1L)
	//*  31   60:lload           8
	//*  32   62:ldc2w           #56  <Long -1L>
	//*  33   65:lcmp            
	//*  34   66:ifeq            80
			l = Math.max(l1, l2 - l3);
	//   35   69:lload           4
	//   36   71:lload           6
	//   37   73:lload           8
	//   38   75:lsub            
	//   39   76:invokestatic    #60  <Method long Math.max(long, long)>
	//   40   79:lstore_2        
		al1[0] = l;
	//   41   80:aload           10
	//   42   82:iconst_0        
	//   43   83:lload_2         
	//   44   84:lastore         
		al1[1] = l2;
	//   45   85:aload           10
	//   46   87:iconst_1        
	//   47   88:lload           6
	//   48   90:lastore         
		return al1;
	//   49   91:aload           10
	//   50   93:areturn         
	}

	public int hashCode()
	{
		return (((527 + (int)minStartTimeUs) * 31 + (int)maxEndTimeUs) * 31 + (int)elapsedRealtimeAtStartUs) * 31 + (int)bufferDepthUs;
	//    0    0:sipush          527
	//    1    3:aload_0         
	//    2    4:getfield        #21  <Field long minStartTimeUs>
	//    3    7:l2i             
	//    4    8:iadd            
	//    5    9:bipush          31
	//    6   11:imul            
	//    7   12:aload_0         
	//    8   13:getfield        #23  <Field long maxEndTimeUs>
	//    9   16:l2i             
	//   10   17:iadd            
	//   11   18:bipush          31
	//   12   20:imul            
	//   13   21:aload_0         
	//   14   22:getfield        #25  <Field long elapsedRealtimeAtStartUs>
	//   15   25:l2i             
	//   16   26:iadd            
	//   17   27:bipush          31
	//   18   29:imul            
	//   19   30:aload_0         
	//   20   31:getfield        #27  <Field long bufferDepthUs>
	//   21   34:l2i             
	//   22   35:iadd            
	//   23   36:ireturn         
	}

	public boolean isStatic()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private final long bufferDepthUs;
	private final long elapsedRealtimeAtStartUs;
	private final long maxEndTimeUs;
	private final long minStartTimeUs;
	private final Clock systemClock;

	public TimeRange$DynamicTimeRange(long l, long l1, long l2, long l3, Clock clock)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		minStartTimeUs = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #21  <Field long minStartTimeUs>
		maxEndTimeUs = l1;
	//    5    9:aload_0         
	//    6   10:lload_3         
	//    7   11:putfield        #23  <Field long maxEndTimeUs>
		elapsedRealtimeAtStartUs = l2;
	//    8   14:aload_0         
	//    9   15:lload           5
	//   10   17:putfield        #25  <Field long elapsedRealtimeAtStartUs>
		bufferDepthUs = l3;
	//   11   20:aload_0         
	//   12   21:lload           7
	//   13   23:putfield        #27  <Field long bufferDepthUs>
		systemClock = clock;
	//   14   26:aload_0         
	//   15   27:aload           9
	//   16   29:putfield        #29  <Field Clock systemClock>
	//   17   32:return          
	}
}
