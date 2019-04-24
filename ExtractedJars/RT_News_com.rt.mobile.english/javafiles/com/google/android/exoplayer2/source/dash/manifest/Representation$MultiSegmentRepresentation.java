// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash.manifest;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.dash.DashSegmentIndex;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.source.dash.manifest:
//			Representation, RangedUri

public static class Representation$MultiSegmentRepresentation extends Representation
	implements DashSegmentIndex
{

	public String getCacheKey()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public long getDurationUs(long l, long l1)
	{
		return segmentBase.getSegmentDurationUs(l, l1);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SegmentBase$MultiSegmentBase segmentBase>
	//    2    4:lload_1         
	//    3    5:lload_3         
	//    4    6:invokevirtual   #28  <Method long SegmentBase$MultiSegmentBase.getSegmentDurationUs(long, long)>
	//    5    9:lreturn         
	}

	public long getFirstSegmentNum()
	{
		return segmentBase.getFirstSegmentNum();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SegmentBase$MultiSegmentBase segmentBase>
	//    2    4:invokevirtual   #32  <Method long SegmentBase$MultiSegmentBase.getFirstSegmentNum()>
	//    3    7:lreturn         
	}

	public DashSegmentIndex getIndex()
	{
		return ((DashSegmentIndex) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public RangedUri getIndexUri()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int getSegmentCount(long l)
	{
		return segmentBase.getSegmentCount(l);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SegmentBase$MultiSegmentBase segmentBase>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #40  <Method int SegmentBase$MultiSegmentBase.getSegmentCount(long)>
	//    4    8:ireturn         
	}

	public long getSegmentNum(long l, long l1)
	{
		return segmentBase.getSegmentNum(l, l1);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SegmentBase$MultiSegmentBase segmentBase>
	//    2    4:lload_1         
	//    3    5:lload_3         
	//    4    6:invokevirtual   #43  <Method long SegmentBase$MultiSegmentBase.getSegmentNum(long, long)>
	//    5    9:lreturn         
	}

	public RangedUri getSegmentUrl(long l)
	{
		return segmentBase.getSegmentUrl(((Representation) (this)), l);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SegmentBase$MultiSegmentBase segmentBase>
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:invokevirtual   #48  <Method RangedUri SegmentBase$MultiSegmentBase.getSegmentUrl(Representation, long)>
	//    5    9:areturn         
	}

	public long getTimeUs(long l)
	{
		return segmentBase.getSegmentTimeUs(l);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SegmentBase$MultiSegmentBase segmentBase>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #53  <Method long SegmentBase$MultiSegmentBase.getSegmentTimeUs(long)>
	//    4    8:lreturn         
	}

	public boolean isExplicit()
	{
		return segmentBase.isExplicit();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SegmentBase$MultiSegmentBase segmentBase>
	//    2    4:invokevirtual   #57  <Method boolean SegmentBase$MultiSegmentBase.isExplicit()>
	//    3    7:ireturn         
	}

	private final SegmentBase.MultiSegmentBase segmentBase;

	public Representation$MultiSegmentRepresentation(String s, long l, Format format, String s1, SegmentBase.MultiSegmentBase multisegmentbase, List list)
	{
		super(s, l, format, s1, ((SegmentBase) (multisegmentbase)), list, ((Representation._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:aload           4
	//    4    5:aload           5
	//    5    7:aload           6
	//    6    9:aload           7
	//    7   11:aconst_null     
	//    8   12:invokespecial   #14  <Method void Representation(String, long, Format, String, SegmentBase, List, Representation$1)>
		segmentBase = multisegmentbase;
	//    9   15:aload_0         
	//   10   16:aload           6
	//   11   18:putfield        #16  <Field SegmentBase$MultiSegmentBase segmentBase>
	//   12   21:return          
	}
}
