// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash.manifest;

import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.source.dash.manifest:
//			SegmentBase, RangedUri, Representation

public static class SegmentBase$SegmentList extends Base
{

	public int getSegmentCount(long l)
	{
		return mediaSegments.size();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field List mediaSegments>
	//    2    4:invokeinterface #28  <Method int List.size()>
	//    3    9:ireturn         
	}

	public RangedUri getSegmentUrl(Representation representation, long l)
	{
		return (RangedUri)mediaSegments.get((int)(l - startNumber));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field List mediaSegments>
	//    2    4:lload_2         
	//    3    5:aload_0         
	//    4    6:getfield        #34  <Field long startNumber>
	//    5    9:lsub            
	//    6   10:l2i             
	//    7   11:invokeinterface #38  <Method Object List.get(int)>
	//    8   16:checkcast       #40  <Class RangedUri>
	//    9   19:areturn         
	}

	public boolean isExplicit()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	final List mediaSegments;

	public SegmentBase$SegmentList(RangedUri rangeduri, long l, long l1, long l2, 
			long l3, List list, List list1)
	{
		super(rangeduri, l, l1, l2, l3, list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:lload           4
	//    4    5:lload           6
	//    5    7:lload           8
	//    6    9:aload           10
	//    7   11:invokespecial   #15  <Method void SegmentBase$MultiSegmentBase(RangedUri, long, long, long, long, List)>
		mediaSegments = list1;
	//    8   14:aload_0         
	//    9   15:aload           11
	//   10   17:putfield        #17  <Field List mediaSegments>
	//   11   20:return          
	}
}
