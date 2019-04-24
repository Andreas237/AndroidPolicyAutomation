// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.video;


// Referenced classes of package com.google.android.exoplayer2.video:
//			MediaCodecVideoRenderer

protected static final class MediaCodecVideoRenderer$CodecMaxValues
{

	public final int height;
	public final int inputSize;
	public final int width;

	public MediaCodecVideoRenderer$CodecMaxValues(int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		width = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #18  <Field int width>
		height = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #20  <Field int height>
		inputSize = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #22  <Field int inputSize>
	//   11   19:return          
	}
}
