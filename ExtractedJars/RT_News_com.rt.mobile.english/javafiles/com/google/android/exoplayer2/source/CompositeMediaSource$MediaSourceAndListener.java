// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;


// Referenced classes of package com.google.android.exoplayer2.source:
//			CompositeMediaSource, MediaSourceEventListener, MediaSource

private static final class CompositeMediaSource$MediaSourceAndListener
{

	public final MediaSourceEventListener eventListener;
	public final MediaSource.SourceInfoRefreshListener listener;
	public final MediaSource mediaSource;

	public CompositeMediaSource$MediaSourceAndListener(MediaSource mediasource, MediaSource.SourceInfoRefreshListener sourceinforefreshlistener, MediaSourceEventListener mediasourceeventlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		mediaSource = mediasource;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field MediaSource mediaSource>
		listener = sourceinforefreshlistener;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field MediaSource$SourceInfoRefreshListener listener>
		eventListener = mediasourceeventlistener;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #24  <Field MediaSourceEventListener eventListener>
	//   11   19:return          
	}
}
