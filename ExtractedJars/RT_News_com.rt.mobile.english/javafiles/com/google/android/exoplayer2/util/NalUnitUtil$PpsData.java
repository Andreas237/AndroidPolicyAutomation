// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.util;


// Referenced classes of package com.google.android.exoplayer2.util:
//			NalUnitUtil

public static final class NalUnitUtil$PpsData
{

	public final boolean bottomFieldPicOrderInFramePresentFlag;
	public final int picParameterSetId;
	public final int seqParameterSetId;

	public NalUnitUtil$PpsData(int i, int j, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		picParameterSetId = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #19  <Field int picParameterSetId>
		seqParameterSetId = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #21  <Field int seqParameterSetId>
		bottomFieldPicOrderInFramePresentFlag = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #23  <Field boolean bottomFieldPicOrderInFramePresentFlag>
	//   11   19:return          
	}
}
