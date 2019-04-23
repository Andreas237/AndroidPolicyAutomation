// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.util;


// Referenced classes of package com.google.android.exoplayer.util:
//			NalUnitUtil

public static final class NalUnitUtil$SpsData
{

	public final boolean deltaPicOrderAlwaysZeroFlag;
	public final boolean frameMbsOnlyFlag;
	public final int frameNumLength;
	public final int height;
	public final int picOrderCntLsbLength;
	public final int picOrderCountType;
	public final float pixelWidthAspectRatio;
	public final boolean separateColorPlaneFlag;
	public final int seqParameterSetId;
	public final int width;

	public NalUnitUtil$SpsData(int i, int j, int k, float f, boolean flag, boolean flag1, int l, 
			int i1, int j1, boolean flag2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		seqParameterSetId = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #27  <Field int seqParameterSetId>
		width = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #29  <Field int width>
		height = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #31  <Field int height>
		pixelWidthAspectRatio = f;
	//   11   19:aload_0         
	//   12   20:fload           4
	//   13   22:putfield        #33  <Field float pixelWidthAspectRatio>
		separateColorPlaneFlag = flag;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #35  <Field boolean separateColorPlaneFlag>
		frameMbsOnlyFlag = flag1;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #37  <Field boolean frameMbsOnlyFlag>
		frameNumLength = l;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #39  <Field int frameNumLength>
		picOrderCountType = i1;
	//   23   43:aload_0         
	//   24   44:iload           8
	//   25   46:putfield        #41  <Field int picOrderCountType>
		picOrderCntLsbLength = j1;
	//   26   49:aload_0         
	//   27   50:iload           9
	//   28   52:putfield        #43  <Field int picOrderCntLsbLength>
		deltaPicOrderAlwaysZeroFlag = flag2;
	//   29   55:aload_0         
	//   30   56:iload           10
	//   31   58:putfield        #45  <Field boolean deltaPicOrderAlwaysZeroFlag>
	//   32   61:return          
	}
}
