// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.drm;

import android.os.Message;

// Referenced classes of package com.google.android.exoplayer2.drm:
//			DefaultDrmSessionManager, ExoMediaDrm

private class DefaultDrmSessionManager$MediaDrmEventListener
	implements ExoMediaDrm.OnEventListener
{

	public void onEvent(ExoMediaDrm exomediadrm, byte abyte0[], int i, int j, byte abyte1[])
	{
		if(DefaultDrmSessionManager.access$300(DefaultDrmSessionManager.this) == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field DefaultDrmSessionManager this$0>
	//*   2    4:invokestatic    #29  <Method int DefaultDrmSessionManager.access$300(DefaultDrmSessionManager)>
	//*   3    7:ifne            25
			mediaDrmHandler.obtainMessage(i, ((Object) (abyte0))).sendToTarget();
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field DefaultDrmSessionManager this$0>
	//    6   14:getfield        #33  <Field DefaultDrmSessionManager$MediaDrmHandler DefaultDrmSessionManager.mediaDrmHandler>
	//    7   17:iload_3         
	//    8   18:aload_2         
	//    9   19:invokevirtual   #39  <Method Message DefaultDrmSessionManager$MediaDrmHandler.obtainMessage(int, Object)>
	//   10   22:invokevirtual   #44  <Method void Message.sendToTarget()>
	//   11   25:return          
	}

	final DefaultDrmSessionManager this$0;

	private DefaultDrmSessionManager$MediaDrmEventListener()
	{
		this$0 = DefaultDrmSessionManager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field DefaultDrmSessionManager this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}

	DefaultDrmSessionManager$MediaDrmEventListener(DefaultDrmSessionManager._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void DefaultDrmSessionManager$MediaDrmEventListener(DefaultDrmSessionManager)>
	//    3    5:return          
	}
}
