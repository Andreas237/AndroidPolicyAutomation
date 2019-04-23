// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.util;

import java.util.Comparator;

// Referenced classes of package com.google.android.exoplayer.util:
//			SlidingPercentile

static final class SlidingPercentile$1
	implements Comparator
{

	public int compare(mple mple, mple mple1)
	{
		return mple.index - mple1.index;
	//    0    0:aload_1         
	//    1    1:getfield        #22  <Field int SlidingPercentile$Sample.index>
	//    2    4:aload_2         
	//    3    5:getfield        #22  <Field int SlidingPercentile$Sample.index>
	//    4    8:isub            
	//    5    9:ireturn         
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

	SlidingPercentile$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
