// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.flv;

import java.util.List;

// Referenced classes of package com.google.android.exoplayer.extractor.flv:
//			VideoTagPayloadReader

private static final class VideoTagPayloadReader$AvcSequenceHeaderData
{

	public final int height;
	public final List initializationData;
	public final int nalUnitLengthFieldLength;
	public final float pixelWidthAspectRatio;
	public final int width;

	public VideoTagPayloadReader$AvcSequenceHeaderData(List list, int i, int j, int k, float f)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		initializationData = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field List initializationData>
		nalUnitLengthFieldLength = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #25  <Field int nalUnitLengthFieldLength>
		pixelWidthAspectRatio = f;
	//    8   14:aload_0         
	//    9   15:fload           5
	//   10   17:putfield        #27  <Field float pixelWidthAspectRatio>
		width = j;
	//   11   20:aload_0         
	//   12   21:iload_3         
	//   13   22:putfield        #29  <Field int width>
		height = k;
	//   14   25:aload_0         
	//   15   26:iload           4
	//   16   28:putfield        #31  <Field int height>
	//   17   31:return          
	}
}
