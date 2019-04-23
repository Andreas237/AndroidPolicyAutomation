// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.dash.mpd;

import com.google.android.exoplayer.dash.DashSegmentIndex;

// Referenced classes of package com.google.android.exoplayer.dash.mpd:
//			RangedUri

final class DashSingleSegmentIndex
	implements DashSegmentIndex
{

	public DashSingleSegmentIndex(RangedUri rangeduri)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		uri = rangeduri;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field RangedUri uri>
	//    5    9:return          
	}

	public long getDurationUs(int i, long l)
	{
		return l;
	//    0    0:lload_2         
	//    1    1:lreturn         
	}

	public int getFirstSegmentNum()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getLastSegmentNum(long l)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getSegmentNum(long l, long l1)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public RangedUri getSegmentUrl(int i)
	{
		return uri;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field RangedUri uri>
	//    2    4:areturn         
	}

	public long getTimeUs(int i)
	{
		return 0L;
	//    0    0:lconst_0        
	//    1    1:lreturn         
	}

	public boolean isExplicit()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private final RangedUri uri;
}
