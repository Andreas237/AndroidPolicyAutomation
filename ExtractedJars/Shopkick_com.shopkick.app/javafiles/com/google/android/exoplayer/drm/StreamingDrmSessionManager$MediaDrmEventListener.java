// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.drm;


// Referenced classes of package com.google.android.exoplayer.drm:
//			StreamingDrmSessionManager, ExoMediaDrm

private class StreamingDrmSessionManager$MediaDrmEventListener
	implements ExoMediaDrm.OnEventListener
{

	public void onEvent(ExoMediaDrm exomediadrm, byte abyte0[], int i, int j, byte abyte1[])
	{
		mediaDrmHandler.sendEmptyMessage(i);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field StreamingDrmSessionManager this$0>
	//    2    4:getfield        #29  <Field StreamingDrmSessionManager$MediaDrmHandler StreamingDrmSessionManager.mediaDrmHandler>
	//    3    7:iload_3         
	//    4    8:invokevirtual   #35  <Method boolean StreamingDrmSessionManager$MediaDrmHandler.sendEmptyMessage(int)>
	//    5   11:pop             
	//    6   12:return          
	}

	final StreamingDrmSessionManager this$0;

	private StreamingDrmSessionManager$MediaDrmEventListener()
	{
		this$0 = StreamingDrmSessionManager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field StreamingDrmSessionManager this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}

	StreamingDrmSessionManager$MediaDrmEventListener(StreamingDrmSessionManager._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void StreamingDrmSessionManager$MediaDrmEventListener(StreamingDrmSessionManager)>
	//    3    5:return          
	}
}
