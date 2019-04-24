// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import java.io.IOException;
import java.lang.annotation.Annotation;

// Referenced classes of package com.google.android.exoplayer2.source:
//			MergingMediaSource

public static final class MergingMediaSource$IllegalMergeException extends IOException
{
	public static interface Reason
		extends Annotation
	{
	}


	public static final int REASON_PERIOD_COUNT_MISMATCH = 0;
	public final int reason;

	public MergingMediaSource$IllegalMergeException(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void IOException()>
		reason = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #21  <Field int reason>
	//    5    9:return          
	}
}
