// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.drm;


// Referenced classes of package com.google.android.exoplayer.drm:
//			StreamingDrmSessionManager

class StreamingDrmSessionManager$2
	implements Runnable
{

	public void run()
	{
		StreamingDrmSessionManager.access$100(StreamingDrmSessionManager.this).onDrmSessionManagerError(val$e);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field StreamingDrmSessionManager this$0>
	//    2    4:invokestatic    #30  <Method StreamingDrmSessionManager$EventListener StreamingDrmSessionManager.access$100(StreamingDrmSessionManager)>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field Exception val$e>
	//    5   11:invokeinterface #35  <Method void StreamingDrmSessionManager$EventListener.onDrmSessionManagerError(Exception)>
	//    6   16:return          
	}

	final StreamingDrmSessionManager this$0;
	final Exception val$e;

	StreamingDrmSessionManager$2()
	{
		this$0 = final_streamingdrmsessionmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field StreamingDrmSessionManager this$0>
		val$e = Exception.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Exception val$e>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
