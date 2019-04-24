// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;


// Referenced classes of package com.google.android.exoplayer2:
//			Timeline

public final class IllegalSeekPositionException extends IllegalStateException
{

	public IllegalSeekPositionException(Timeline timeline1, int i, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void IllegalStateException()>
		timeline = timeline1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field Timeline timeline>
		windowIndex = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #19  <Field int windowIndex>
		positionMs = l;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #21  <Field long positionMs>
	//   11   19:return          
	}

	public final long positionMs;
	public final Timeline timeline;
	public final int windowIndex;
}
