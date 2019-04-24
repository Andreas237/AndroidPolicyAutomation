// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;


// Referenced classes of package com.google.android.exoplayer2:
//			ExoPlayerImplInternal, Timeline

private static final class ExoPlayerImplInternal$SeekPosition
{

	public final Timeline timeline;
	public final int windowIndex;
	public final long windowPositionUs;

	public ExoPlayerImplInternal$SeekPosition(Timeline timeline1, int i, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		timeline = timeline1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Timeline timeline>
		windowIndex = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #22  <Field int windowIndex>
		windowPositionUs = l;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #24  <Field long windowPositionUs>
	//   11   19:return          
	}
}
