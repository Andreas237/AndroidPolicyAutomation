// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.util;

import java.util.Comparator;

// Referenced classes of package com.google.android.exoplayer2.util:
//			SlidingPercentile

static final class SlidingPercentile$2
	implements Comparator
{

	public int compare(mple mple, mple mple1)
	{
		if(mple.value < mple1.value)
	//*   0    0:aload_1         
	//*   1    1:getfield        #22  <Field float SlidingPercentile$Sample.value>
	//*   2    4:aload_2         
	//*   3    5:getfield        #22  <Field float SlidingPercentile$Sample.value>
	//*   4    8:fcmpg           
	//*   5    9:ifge            14
			return -1;
	//    6   12:iconst_m1       
	//    7   13:ireturn         
		return mple1.value >= mple.value ? 0 : 1;
	//    8   14:aload_2         
	//    9   15:getfield        #22  <Field float SlidingPercentile$Sample.value>
	//   10   18:aload_1         
	//   11   19:getfield        #22  <Field float SlidingPercentile$Sample.value>
	//   12   22:fcmpg           
	//   13   23:ifge            28
	//   14   26:iconst_1        
	//   15   27:ireturn         
	//   16   28:iconst_0        
	//   17   29:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((mple)obj, (mple)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #18  <Class SlidingPercentile$Sample>
	//    3    5:aload_2         
	//    4    6:checkcast       #18  <Class SlidingPercentile$Sample>
	//    5    9:invokevirtual   #25  <Method int compare(SlidingPercentile$Sample, SlidingPercentile$Sample)>
	//    6   12:ireturn         
	}

	SlidingPercentile$2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
