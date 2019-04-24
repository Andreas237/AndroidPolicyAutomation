// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Timeline;

// Referenced classes of package com.google.android.exoplayer2.source:
//			CompositeMediaSource, MediaSource

class CompositeMediaSource$1
	implements efreshListener
{

	public void onSourceInfoRefreshed(MediaSource mediasource, Timeline timeline, Object obj)
	{
		onChildSourceInfoRefreshed(val$id, mediasource, timeline, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field CompositeMediaSource this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Object val$id>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #32  <Method void CompositeMediaSource.onChildSourceInfoRefreshed(Object, MediaSource, Timeline, Object)>
	//    8   14:return          
	}

	final CompositeMediaSource this$0;
	final Object val$id;

	CompositeMediaSource$1()
	{
		this$0 = final_compositemediasource;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field CompositeMediaSource this$0>
		val$id = Object.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Object val$id>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
