// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;


// Referenced classes of package com.google.android.exoplayer:
//			TimeRange

public static final class TimeRange$StaticTimeRange
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
	//*   6    8:ifnull          57
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #26  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #26  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((TimeRange$StaticTimeRange)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class TimeRange$StaticTimeRange>
	//   16   28:astore_1        
			return ((TimeRange$StaticTimeRange) (obj)).startTimeUs == startTimeUs && ((TimeRange$StaticTimeRange) (obj)).endTimeUs == endTimeUs;
	//   17   29:aload_1         
	//   18   30:getfield        #17  <Field long startTimeUs>
	//   19   33:aload_0         
	//   20   34:getfield        #17  <Field long startTimeUs>
	//   21   37:lcmp            
	//   22   38:ifne            55
	//   23   41:aload_1         
	//   24   42:getfield        #19  <Field long endTimeUs>
	//   25   45:aload_0         
	//   26   46:getfield        #19  <Field long endTimeUs>
	//   27   49:lcmp            
	//   28   50:ifne            55
	//   29   53:iconst_1        
	//   30   54:ireturn         
	//   31   55:iconst_0        
	//   32   56:ireturn         
		} else
		{
			return false;
	//   33   57:iconst_0        
	//   34   58:ireturn         
		}
	}

	public long[] getCurrentBoundsMs(long al[])
	{
		al = getCurrentBoundsUs(al);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #31  <Method long[] getCurrentBoundsUs(long[])>
	//    3    5:astore_1        
		al[0] = al[0] / 1000L;
	//    4    6:aload_1         
	//    5    7:iconst_0        
	//    6    8:aload_1         
	//    7    9:iconst_0        
	//    8   10:laload          
	//    9   11:ldc2w           #32  <Long 1000L>
	//   10   14:ldiv            
	//   11   15:lastore         
		al[1] = al[1] / 1000L;
	//   12   16:aload_1         
	//   13   17:iconst_1        
	//   14   18:aload_1         
	//   15   19:iconst_1        
	//   16   20:laload          
	//   17   21:ldc2w           #32  <Long 1000L>
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
	//*   1    1:ifnull          12
			{
				al1 = al;
	//    2    4:aload_1         
	//    3    5:astore_2        
				if(al.length >= 2)
					break label0;
	//    4    6:aload_1         
	//    5    7:arraylength     
	//    6    8:iconst_2        
	//    7    9:icmpge          16
			}
			al1 = new long[2];
	//    8   12:iconst_2        
	//    9   13:newarray        long[]
	//   10   15:astore_2        
		}
		al1[0] = startTimeUs;
	//   11   16:aload_2         
	//   12   17:iconst_0        
	//   13   18:aload_0         
	//   14   19:getfield        #17  <Field long startTimeUs>
	//   15   22:lastore         
		al1[1] = endTimeUs;
	//   16   23:aload_2         
	//   17   24:iconst_1        
	//   18   25:aload_0         
	//   19   26:getfield        #19  <Field long endTimeUs>
	//   20   29:lastore         
		return al1;
	//   21   30:aload_2         
	//   22   31:areturn         
	}

	public int hashCode()
	{
		return (527 + (int)startTimeUs) * 31 + (int)endTimeUs;
	//    0    0:sipush          527
	//    1    3:aload_0         
	//    2    4:getfield        #17  <Field long startTimeUs>
	//    3    7:l2i             
	//    4    8:iadd            
	//    5    9:bipush          31
	//    6   11:imul            
	//    7   12:aload_0         
	//    8   13:getfield        #19  <Field long endTimeUs>
	//    9   16:l2i             
	//   10   17:iadd            
	//   11   18:ireturn         
	}

	public boolean isStatic()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private final long endTimeUs;
	private final long startTimeUs;

	public TimeRange$StaticTimeRange(long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		startTimeUs = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #17  <Field long startTimeUs>
		endTimeUs = l1;
	//    5    9:aload_0         
	//    6   10:lload_3         
	//    7   11:putfield        #19  <Field long endTimeUs>
	//    8   14:return          
	}
}
