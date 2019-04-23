// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.mp4;


// Referenced classes of package com.google.android.exoplayer.extractor.mp4:
//			FixedSampleSizeRechunker

public static final class FixedSampleSizeRechunker$Results
{

	public final int flags[];
	public final int maximumSize;
	public final long offsets[];
	public final int sizes[];
	public final long timestamps[];

	public FixedSampleSizeRechunker$Results(long al[], int ai[], int i, long al1[], int ai1[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		offsets = al;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field long[] offsets>
		sizes = ai;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field int[] sizes>
		maximumSize = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #26  <Field int maximumSize>
		timestamps = al1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #28  <Field long[] timestamps>
		flags = ai1;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #30  <Field int[] flags>
	//   17   31:return          
	}
}
