// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.dash.mpd;

import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.dash.DashSegmentIndex;

// Referenced classes of package com.google.android.exoplayer.dash.mpd:
//			Representation, RangedUri

public static class Representation$MultiSegmentRepresentation extends Representation
	implements DashSegmentIndex
{

	public long getDurationUs(int i, long l)
	{
		return segmentBase.getSegmentDurationUs(i, l);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SegmentBase$MultiSegmentBase segmentBase>
	//    2    4:iload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #24  <Method long SegmentBase$MultiSegmentBase.getSegmentDurationUs(int, long)>
	//    5    9:lreturn         
	}

	public int getFirstSegmentNum()
	{
		return segmentBase.getFirstSegmentNum();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SegmentBase$MultiSegmentBase segmentBase>
	//    2    4:invokevirtual   #28  <Method int SegmentBase$MultiSegmentBase.getFirstSegmentNum()>
	//    3    7:ireturn         
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

	public int getLastSegmentNum(long l)
	{
		return segmentBase.getLastSegmentNum(l);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SegmentBase$MultiSegmentBase segmentBase>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #36  <Method int SegmentBase$MultiSegmentBase.getLastSegmentNum(long)>
	//    4    8:ireturn         
	}

	public int getSegmentNum(long l, long l1)
	{
		return segmentBase.getSegmentNum(l, l1);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SegmentBase$MultiSegmentBase segmentBase>
	//    2    4:lload_1         
	//    3    5:lload_3         
	//    4    6:invokevirtual   #40  <Method int SegmentBase$MultiSegmentBase.getSegmentNum(long, long)>
	//    5    9:ireturn         
	}

	public RangedUri getSegmentUrl(int i)
	{
		return segmentBase.getSegmentUrl(((Representation) (this)), i);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SegmentBase$MultiSegmentBase segmentBase>
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #45  <Method RangedUri SegmentBase$MultiSegmentBase.getSegmentUrl(Representation, int)>
	//    5    9:areturn         
	}

	public long getTimeUs(int i)
	{
		return segmentBase.getSegmentTimeUs(i);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SegmentBase$MultiSegmentBase segmentBase>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #50  <Method long SegmentBase$MultiSegmentBase.getSegmentTimeUs(int)>
	//    4    8:lreturn         
	}

	public boolean isExplicit()
	{
		return segmentBase.isExplicit();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SegmentBase$MultiSegmentBase segmentBase>
	//    2    4:invokevirtual   #54  <Method boolean SegmentBase$MultiSegmentBase.isExplicit()>
	//    3    7:ireturn         
	}

	private final SegmentBase.MultiSegmentBase segmentBase;

	public Representation$MultiSegmentRepresentation(String s, long l, Format format, SegmentBase.MultiSegmentBase multisegmentbase, String s1, String s2)
	{
		super(s, l, format, s2, ((SegmentBase) (multisegmentbase)), s1, ((Representation._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:aload           4
	//    4    5:aload           7
	//    5    7:aload           5
	//    6    9:aload           6
	//    7   11:aconst_null     
	//    8   12:invokespecial   #14  <Method void Representation(String, long, Format, String, SegmentBase, String, Representation$1)>
		segmentBase = multisegmentbase;
	//    9   15:aload_0         
	//   10   16:aload           5
	//   11   18:putfield        #16  <Field SegmentBase$MultiSegmentBase segmentBase>
	//   12   21:return          
	}
}
