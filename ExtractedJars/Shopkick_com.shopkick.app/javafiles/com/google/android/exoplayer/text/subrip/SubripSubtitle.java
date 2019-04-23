// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.text.subrip;

import com.google.android.exoplayer.text.Cue;
import com.google.android.exoplayer.text.Subtitle;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.Util;
import java.util.Collections;
import java.util.List;

final class SubripSubtitle
	implements Subtitle
{

	public SubripSubtitle(Cue acue[], long al[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		cues = acue;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field Cue[] cues>
		cueTimesUs = al;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field long[] cueTimesUs>
	//    8   14:return          
	}

	public List getCues(long l)
	{
		int i = Util.binarySearchFloor(cueTimesUs, l, true, false);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field long[] cueTimesUs>
	//    2    4:lload_1         
	//    3    5:iconst_1        
	//    4    6:iconst_0        
	//    5    7:invokestatic    #28  <Method int Util.binarySearchFloor(long[], long, boolean, boolean)>
	//    6   10:istore_3        
		if(i != -1)
	//*   7   11:iload_3         
	//*   8   12:iconst_m1       
	//*   9   13:icmpeq          40
		{
			Cue acue[] = cues;
	//   10   16:aload_0         
	//   11   17:getfield        #17  <Field Cue[] cues>
	//   12   20:astore          4
			if(acue[i] != null)
	//*  13   22:aload           4
	//*  14   24:iload_3         
	//*  15   25:aaload          
	//*  16   26:ifnonnull       32
	//*  17   29:goto            40
				return Collections.singletonList(((Object) (acue[i])));
	//   18   32:aload           4
	//   19   34:iload_3         
	//   20   35:aaload          
	//   21   36:invokestatic    #34  <Method List Collections.singletonList(Object)>
	//   22   39:areturn         
		}
		return Collections.emptyList();
	//   23   40:invokestatic    #38  <Method List Collections.emptyList()>
	//   24   43:areturn         
	}

	public long getEventTime(int i)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		boolean flag;
		if(i >= 0)
	//*   2    2:iload_1         
	//*   3    3:iflt            11
			flag = true;
	//    4    6:iconst_1        
	//    5    7:istore_2        
		else
	//*   6    8:goto            13
			flag = false;
	//    7   11:iconst_0        
	//    8   12:istore_2        
		Assertions.checkArgument(flag);
	//    9   13:iload_2         
	//   10   14:invokestatic    #48  <Method void Assertions.checkArgument(boolean)>
		if(i < cueTimesUs.length)
	//*  11   17:iload_1         
	//*  12   18:aload_0         
	//*  13   19:getfield        #19  <Field long[] cueTimesUs>
	//*  14   22:arraylength     
	//*  15   23:icmpge          31
			flag = flag1;
	//   16   26:iload_3         
	//   17   27:istore_2        
		else
	//*  18   28:goto            33
			flag = false;
	//   19   31:iconst_0        
	//   20   32:istore_2        
		Assertions.checkArgument(flag);
	//   21   33:iload_2         
	//   22   34:invokestatic    #48  <Method void Assertions.checkArgument(boolean)>
		return cueTimesUs[i];
	//   23   37:aload_0         
	//   24   38:getfield        #19  <Field long[] cueTimesUs>
	//   25   41:iload_1         
	//   26   42:laload          
	//   27   43:lreturn         
	}

	public int getEventTimeCount()
	{
		return cueTimesUs.length;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field long[] cueTimesUs>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	public long getLastEventTime()
	{
		if(getEventTimeCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #54  <Method int getEventTimeCount()>
	//*   2    4:ifne            11
		{
			return -1L;
	//    3    7:ldc2w           #55  <Long -1L>
	//    4   10:lreturn         
		} else
		{
			long al[] = cueTimesUs;
	//    5   11:aload_0         
	//    6   12:getfield        #19  <Field long[] cueTimesUs>
	//    7   15:astore_1        
			return al[al.length - 1];
	//    8   16:aload_1         
	//    9   17:aload_1         
	//   10   18:arraylength     
	//   11   19:iconst_1        
	//   12   20:isub            
	//   13   21:laload          
	//   14   22:lreturn         
		}
	}

	public int getNextEventTimeIndex(long l)
	{
		int i = Util.binarySearchCeil(cueTimesUs, l, false, false);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field long[] cueTimesUs>
	//    2    4:lload_1         
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:invokestatic    #61  <Method int Util.binarySearchCeil(long[], long, boolean, boolean)>
	//    6   10:istore_3        
		if(i < cueTimesUs.length)
	//*   7   11:iload_3         
	//*   8   12:aload_0         
	//*   9   13:getfield        #19  <Field long[] cueTimesUs>
	//*  10   16:arraylength     
	//*  11   17:icmpge          22
			return i;
	//   12   20:iload_3         
	//   13   21:ireturn         
		else
			return -1;
	//   14   22:iconst_m1       
	//   15   23:ireturn         
	}

	private final long cueTimesUs[];
	private final Cue cues[];
}
