// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.subrip;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
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
		if(i != -1 && cues[i] != null)
	//*   7   11:iload_3         
	//*   8   12:iconst_m1       
	//*   9   13:icmpeq          38
	//*  10   16:aload_0         
	//*  11   17:getfield        #17  <Field Cue[] cues>
	//*  12   20:iload_3         
	//*  13   21:aaload          
	//*  14   22:ifnonnull       28
	//*  15   25:goto            38
			return Collections.singletonList(((Object) (cues[i])));
	//   16   28:aload_0         
	//   17   29:getfield        #17  <Field Cue[] cues>
	//   18   32:iload_3         
	//   19   33:aaload          
	//   20   34:invokestatic    #34  <Method List Collections.singletonList(Object)>
	//   21   37:areturn         
		else
			return Collections.emptyList();
	//   22   38:invokestatic    #38  <Method List Collections.emptyList()>
	//   23   41:areturn         
	}

	public long getEventTime(int i)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
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
		flag = flag1;
	//   11   17:iload_3         
	//   12   18:istore_2        
		if(i < cueTimesUs.length)
	//*  13   19:iload_1         
	//*  14   20:aload_0         
	//*  15   21:getfield        #19  <Field long[] cueTimesUs>
	//*  16   24:arraylength     
	//*  17   25:icmpge          30
			flag = true;
	//   18   28:iconst_1        
	//   19   29:istore_2        
		Assertions.checkArgument(flag);
	//   20   30:iload_2         
	//   21   31:invokestatic    #48  <Method void Assertions.checkArgument(boolean)>
		return cueTimesUs[i];
	//   22   34:aload_0         
	//   23   35:getfield        #19  <Field long[] cueTimesUs>
	//   24   38:iload_1         
	//   25   39:laload          
	//   26   40:lreturn         
	}

	public int getEventTimeCount()
	{
		return cueTimesUs.length;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field long[] cueTimesUs>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	public int getNextEventTimeIndex(long l)
	{
		int i = Util.binarySearchCeil(cueTimesUs, l, false, false);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field long[] cueTimesUs>
	//    2    4:lload_1         
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:invokestatic    #55  <Method int Util.binarySearchCeil(long[], long, boolean, boolean)>
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
