// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.ogg;


// Referenced classes of package com.google.android.exoplayer.extractor.ogg:
//			VorbisUtil

public static final class VorbisUtil$CodeBook
{

	public final int dimensions;
	public final int entries;
	public final boolean isOrdered;
	public final long lengthMap[];
	public final int lookupType;

	public VorbisUtil$CodeBook(int i, int j, long al[], int k, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		dimensions = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #22  <Field int dimensions>
		entries = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #24  <Field int entries>
		lengthMap = al;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #26  <Field long[] lengthMap>
		lookupType = k;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #28  <Field int lookupType>
		isOrdered = flag;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #30  <Field boolean isOrdered>
	//   17   31:return          
	}
}
