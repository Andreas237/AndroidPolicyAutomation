// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.dvb;

import android.util.SparseArray;

// Referenced classes of package com.google.android.exoplayer2.text.dvb:
//			DvbParser

private static final class DvbParser$PageComposition
{

	public final SparseArray regions;
	public final int state;
	public final int timeOutSecs;
	public final int version;

	public DvbParser$PageComposition(int i, int j, int k, SparseArray sparsearray)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		timeOutSecs = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #21  <Field int timeOutSecs>
		version = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #23  <Field int version>
		state = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #25  <Field int state>
		regions = sparsearray;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #27  <Field SparseArray regions>
	//   14   25:return          
	}
}
