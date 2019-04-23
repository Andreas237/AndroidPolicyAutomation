// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.drm;


// Referenced classes of package com.google.android.exoplayer.drm:
//			StreamingDrmSessionManager

class StreamingDrmSessionManager$1
	implements Runnable
{

	public void run()
	{
		StreamingDrmSessionManager.access$100(StreamingDrmSessionManager.this).onDrmKeysLoaded();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field StreamingDrmSessionManager this$0>
	//    2    4:invokestatic    #26  <Method StreamingDrmSessionManager$EventListener StreamingDrmSessionManager.access$100(StreamingDrmSessionManager)>
	//    3    7:invokeinterface #31  <Method void StreamingDrmSessionManager$EventListener.onDrmKeysLoaded()>
	//    4   12:return          
	}

	final StreamingDrmSessionManager this$0;

	StreamingDrmSessionManager$1()
	{
		this$0 = StreamingDrmSessionManager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field StreamingDrmSessionManager this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
