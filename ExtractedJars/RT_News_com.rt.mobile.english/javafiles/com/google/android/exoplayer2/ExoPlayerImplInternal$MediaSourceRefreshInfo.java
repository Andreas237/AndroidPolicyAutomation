// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.MediaSource;

// Referenced classes of package com.google.android.exoplayer2:
//			ExoPlayerImplInternal, Timeline

private static final class ExoPlayerImplInternal$MediaSourceRefreshInfo
{

	public final Object manifest;
	public final MediaSource source;
	public final Timeline timeline;

	public ExoPlayerImplInternal$MediaSourceRefreshInfo(MediaSource mediasource, Timeline timeline1, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		source = mediasource;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field MediaSource source>
		timeline = timeline1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field Timeline timeline>
		manifest = obj;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #24  <Field Object manifest>
	//   11   19:return          
	}
}
