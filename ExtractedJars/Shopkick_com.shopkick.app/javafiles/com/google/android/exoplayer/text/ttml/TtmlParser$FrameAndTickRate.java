// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.text.ttml;


// Referenced classes of package com.google.android.exoplayer.text.ttml:
//			TtmlParser

private static final class TtmlParser$FrameAndTickRate
{

	final float effectiveFrameRate;
	final int subFrameRate;
	final int tickRate;

	TtmlParser$FrameAndTickRate(float f, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		effectiveFrameRate = f;
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:putfield        #19  <Field float effectiveFrameRate>
		subFrameRate = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #21  <Field int subFrameRate>
		tickRate = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #23  <Field int tickRate>
	//   11   19:return          
	}
}
