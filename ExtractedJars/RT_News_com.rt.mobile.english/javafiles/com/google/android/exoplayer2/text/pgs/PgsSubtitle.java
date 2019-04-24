// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.pgs;

import com.google.android.exoplayer2.text.Subtitle;
import java.util.List;

final class PgsSubtitle
	implements Subtitle
{

	public PgsSubtitle(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		cues = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field List cues>
	//    5    9:return          
	}

	public List getCues(long l)
	{
		return cues;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field List cues>
	//    2    4:areturn         
	}

	public long getEventTime(int i)
	{
		return 0L;
	//    0    0:lconst_0        
	//    1    1:lreturn         
	}

	public int getEventTimeCount()
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public int getNextEventTimeIndex(long l)
	{
		return -1;
	//    0    0:iconst_m1       
	//    1    1:ireturn         
	}

	private final List cues;
}
