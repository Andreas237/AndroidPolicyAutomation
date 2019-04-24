// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mp4;


// Referenced classes of package com.google.android.exoplayer2.extractor.mp4:
//			FixedSampleSizeRechunker

public static final class FixedSampleSizeRechunker$Results
{

	public final long duration;
	public final int flags[];
	public final int maximumSize;
	public final long offsets[];
	public final int sizes[];
	public final long timestamps[];

	private FixedSampleSizeRechunker$Results(long al[], int ai[], int i, long al1[], int ai1[], long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		offsets = al;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field long[] offsets>
		sizes = ai;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field int[] sizes>
		maximumSize = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #28  <Field int maximumSize>
		timestamps = al1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #30  <Field long[] timestamps>
		flags = ai1;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #32  <Field int[] flags>
		duration = l;
	//   17   31:aload_0         
	//   18   32:lload           6
	//   19   34:putfield        #34  <Field long duration>
	//   20   37:return          
	}

	FixedSampleSizeRechunker$Results(long al[], int ai[], int i, long al1[], int ai1[], long l, 
			FixedSampleSizeRechunker._cls1 _pcls1)
	{
		this(al, ai, i, al1, ai1, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:lload           6
	//    7   10:invokespecial   #38  <Method void FixedSampleSizeRechunker$Results(long[], int[], int, long[], int[], long)>
	//    8   13:return          
	}
}
