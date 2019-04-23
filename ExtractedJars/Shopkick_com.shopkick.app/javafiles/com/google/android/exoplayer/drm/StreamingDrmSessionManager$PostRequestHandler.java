// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.drm;

import android.os.*;

// Referenced classes of package com.google.android.exoplayer.drm:
//			StreamingDrmSessionManager, MediaDrmCallback

private class StreamingDrmSessionManager$PostRequestHandler extends Handler
{

	public void handleMessage(Message message)
	{
		message.what;
	//    0    0:aload_1         
	//    1    1:getfield        #30  <Field int Message.what>
		JVM INSTR tableswitch 0 1: default 119
	//	               0 61
	//	               1 31;
	//    2    4:tableswitch     0 1: default 119
	//	               0 61
	//	               1 31
		   goto _L1 _L2 _L3
	//*   3   28:goto            91
_L3:
		Object obj;
		try
		{
			obj = ((Object) (callback.executeKeyRequest(uuid, (ExoMediaDrm.KeyRequest)message.obj)));
	//    4   31:aload_0         
	//    5   32:getfield        #16  <Field StreamingDrmSessionManager this$0>
	//    6   35:getfield        #34  <Field MediaDrmCallback StreamingDrmSessionManager.callback>
	//    7   38:aload_0         
	//    8   39:getfield        #16  <Field StreamingDrmSessionManager this$0>
	//    9   42:getfield        #38  <Field java.util.UUID StreamingDrmSessionManager.uuid>
	//   10   45:aload_1         
	//   11   46:getfield        #42  <Field Object Message.obj>
	//   12   49:checkcast       #44  <Class ExoMediaDrm$KeyRequest>
	//   13   52:invokeinterface #50  <Method byte[] MediaDrmCallback.executeKeyRequest(java.util.UUID, ExoMediaDrm$KeyRequest)>
	//   14   57:astore_2        
		}
	//*  15   58:goto            100
	//*  16   61:aload_0         
	//*  17   62:getfield        #16  <Field StreamingDrmSessionManager this$0>
	//*  18   65:getfield        #34  <Field MediaDrmCallback StreamingDrmSessionManager.callback>
	//*  19   68:aload_0         
	//*  20   69:getfield        #16  <Field StreamingDrmSessionManager this$0>
	//*  21   72:getfield        #38  <Field java.util.UUID StreamingDrmSessionManager.uuid>
	//*  22   75:aload_1         
	//*  23   76:getfield        #42  <Field Object Message.obj>
	//*  24   79:checkcast       #52  <Class ExoMediaDrm$ProvisionRequest>
	//*  25   82:invokeinterface #56  <Method byte[] MediaDrmCallback.executeProvisionRequest(java.util.UUID, ExoMediaDrm$ProvisionRequest)>
	//*  26   87:astore_2        
	//*  27   88:goto            100
	//*  28   91:new             #58  <Class RuntimeException>
	//*  29   94:dup             
	//*  30   95:invokespecial   #61  <Method void RuntimeException()>
	//*  31   98:athrow          
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
	//   32   99:astore_2        
		break; /* Loop/switch isn't completed */
_L2:
		obj = ((Object) (callback.executeProvisionRequest(uuid, (ExoMediaDrm.ProvisionRequest)message.obj)));
		break; /* Loop/switch isn't completed */
_L1:
		throw new RuntimeException();
		postResponseHandler.obtainMessage(message.what, obj).sendToTarget();
	//   33  100:aload_0         
	//   34  101:getfield        #16  <Field StreamingDrmSessionManager this$0>
	//   35  104:getfield        #65  <Field StreamingDrmSessionManager$PostResponseHandler StreamingDrmSessionManager.postResponseHandler>
	//   36  107:aload_1         
	//   37  108:getfield        #30  <Field int Message.what>
	//   38  111:aload_2         
	//   39  112:invokevirtual   #71  <Method Message StreamingDrmSessionManager$PostResponseHandler.obtainMessage(int, Object)>
	//   40  115:invokevirtual   #74  <Method void Message.sendToTarget()>
		return;
	//   41  118:return          
	//*  42  119:goto            28
	}

	final StreamingDrmSessionManager this$0;

	public StreamingDrmSessionManager$PostRequestHandler(Looper looper)
	{
		this$0 = StreamingDrmSessionManager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field StreamingDrmSessionManager this$0>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #19  <Method void Handler(Looper)>
	//    6   10:return          
	}
}
