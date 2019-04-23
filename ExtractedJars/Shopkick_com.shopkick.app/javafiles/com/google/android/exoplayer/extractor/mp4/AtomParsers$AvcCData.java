// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.mp4;

import java.util.List;

// Referenced classes of package com.google.android.exoplayer.extractor.mp4:
//			AtomParsers

private static final class AtomParsers$AvcCData
{

	public final List initializationData;
	public final int nalUnitLengthFieldLength;
	public final float pixelWidthAspectRatio;

	public AtomParsers$AvcCData(List list, int i, float f)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		initializationData = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field List initializationData>
		nalUnitLengthFieldLength = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #23  <Field int nalUnitLengthFieldLength>
		pixelWidthAspectRatio = f;
	//    8   14:aload_0         
	//    9   15:fload_3         
	//   10   16:putfield        #25  <Field float pixelWidthAspectRatio>
	//   11   19:return          
	}
}
