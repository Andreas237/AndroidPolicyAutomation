// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.dash.mpd;

import java.util.List;

// Referenced classes of package com.google.android.exoplayer.dash.mpd:
//			SegmentBase, RangedUri, Representation

public static class SegmentBase$SegmentList extends Base
{

	public int getLastSegmentNum(long l)
	{
		return (startNumber + mediaSegments.size()) - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int startNumber>
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field List mediaSegments>
	//    4    8:invokeinterface #32  <Method int List.size()>
	//    5   13:iadd            
	//    6   14:iconst_1        
	//    7   15:isub            
	//    8   16:ireturn         
	}

	public RangedUri getSegmentUrl(Representation representation, int i)
	{
		return (RangedUri)mediaSegments.get(i - startNumber);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field List mediaSegments>
	//    2    4:iload_2         
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field int startNumber>
	//    5    9:isub            
	//    6   10:invokeinterface #38  <Method Object List.get(int)>
	//    7   15:checkcast       #40  <Class RangedUri>
	//    8   18:areturn         
	}

	public boolean isExplicit()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	final List mediaSegments;

	public SegmentBase$SegmentList(RangedUri rangeduri, long l, long l1, int i, long l2, List list, List list1)
	{
		super(rangeduri, l, l1, i, l2, list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:lload           4
	//    4    5:iload           6
	//    5    7:lload           7
	//    6    9:aload           9
	//    7   11:invokespecial   #15  <Method void SegmentBase$MultiSegmentBase(RangedUri, long, long, int, long, List)>
		mediaSegments = list1;
	//    8   14:aload_0         
	//    9   15:aload           10
	//   10   17:putfield        #17  <Field List mediaSegments>
	//   11   20:return          
	}
}
