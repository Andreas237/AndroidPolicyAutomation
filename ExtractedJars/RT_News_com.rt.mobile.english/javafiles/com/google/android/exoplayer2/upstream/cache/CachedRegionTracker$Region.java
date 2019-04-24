// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream.cache;


// Referenced classes of package com.google.android.exoplayer2.upstream.cache:
//			CachedRegionTracker

private static class CachedRegionTracker$Region
	implements Comparable
{

	public int compareTo(CachedRegionTracker$Region cachedregiontracker$region)
	{
		if(startOffset < cachedregiontracker$region.startOffset)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field long startOffset>
	//*   2    4:aload_1         
	//*   3    5:getfield        #22  <Field long startOffset>
	//*   4    8:lcmp            
	//*   5    9:ifge            14
			return -1;
	//    6   12:iconst_m1       
	//    7   13:ireturn         
		return startOffset != cachedregiontracker$region.startOffset ? 1 : 0;
	//    8   14:aload_0         
	//    9   15:getfield        #22  <Field long startOffset>
	//   10   18:aload_1         
	//   11   19:getfield        #22  <Field long startOffset>
	//   12   22:lcmp            
	//   13   23:ifne            28
	//   14   26:iconst_0        
	//   15   27:ireturn         
	//   16   28:iconst_1        
	//   17   29:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((CachedRegionTracker$Region)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class CachedRegionTracker$Region>
	//    3    5:invokevirtual   #32  <Method int compareTo(CachedRegionTracker$Region)>
	//    4    8:ireturn         
	}

	public long endOffset;
	public int endOffsetIndex;
	public long startOffset;

	public CachedRegionTracker$Region(long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		startOffset = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #22  <Field long startOffset>
		endOffset = l1;
	//    5    9:aload_0         
	//    6   10:lload_3         
	//    7   11:putfield        #24  <Field long endOffset>
	//    8   14:return          
	}
}
