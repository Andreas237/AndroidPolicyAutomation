// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.drm;

import android.os.*;

// Referenced classes of package com.google.android.exoplayer.drm:
//			StreamingDrmSessionManager, KeysExpiredException

private class StreamingDrmSessionManager$MediaDrmHandler extends Handler
{

	public void handleMessage(Message message)
	{
		if(StreamingDrmSessionManager.access$200(StreamingDrmSessionManager.this) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field StreamingDrmSessionManager this$0>
	//*   2    4:invokestatic    #26  <Method int StreamingDrmSessionManager.access$200(StreamingDrmSessionManager)>
	//*   3    7:ifeq            114
		{
			if(StreamingDrmSessionManager.access$300(StreamingDrmSessionManager.this) != 3 && StreamingDrmSessionManager.access$300(StreamingDrmSessionManager.this) != 4)
	//*   4   10:aload_0         
	//*   5   11:getfield        #16  <Field StreamingDrmSessionManager this$0>
	//*   6   14:invokestatic    #29  <Method int StreamingDrmSessionManager.access$300(StreamingDrmSessionManager)>
	//*   7   17:iconst_3        
	//*   8   18:icmpeq          33
	//*   9   21:aload_0         
	//*  10   22:getfield        #16  <Field StreamingDrmSessionManager this$0>
	//*  11   25:invokestatic    #29  <Method int StreamingDrmSessionManager.access$300(StreamingDrmSessionManager)>
	//*  12   28:iconst_4        
	//*  13   29:icmpeq          33
				return;
	//   14   32:return          
			switch(message.what)
	//*  15   33:aload_1         
	//*  16   34:getfield        #35  <Field int Message.what>
			{
	//*  17   37:tableswitch     1 3: default 64
	//	               1 97
	//	               2 89
	//	               3 65
			default:
				return;
	//   18   64:return          

			case 3: // '\003'
				StreamingDrmSessionManager.access$302(StreamingDrmSessionManager.this, 3);
	//   19   65:aload_0         
	//   20   66:getfield        #16  <Field StreamingDrmSessionManager this$0>
	//   21   69:iconst_3        
	//   22   70:invokestatic    #39  <Method int StreamingDrmSessionManager.access$302(StreamingDrmSessionManager, int)>
	//   23   73:pop             
				StreamingDrmSessionManager.access$500(StreamingDrmSessionManager.this, ((Exception) (new KeysExpiredException())));
	//   24   74:aload_0         
	//   25   75:getfield        #16  <Field StreamingDrmSessionManager this$0>
	//   26   78:new             #41  <Class KeysExpiredException>
	//   27   81:dup             
	//   28   82:invokespecial   #44  <Method void KeysExpiredException()>
	//   29   85:invokestatic    #48  <Method void StreamingDrmSessionManager.access$500(StreamingDrmSessionManager, Exception)>
				return;
	//   30   88:return          

			case 2: // '\002'
				StreamingDrmSessionManager.access$400(StreamingDrmSessionManager.this);
	//   31   89:aload_0         
	//   32   90:getfield        #16  <Field StreamingDrmSessionManager this$0>
	//   33   93:invokestatic    #52  <Method void StreamingDrmSessionManager.access$400(StreamingDrmSessionManager)>
				return;
	//   34   96:return          

			case 1: // '\001'
				StreamingDrmSessionManager.access$302(StreamingDrmSessionManager.this, 3);
	//   35   97:aload_0         
	//   36   98:getfield        #16  <Field StreamingDrmSessionManager this$0>
	//   37  101:iconst_3        
	//   38  102:invokestatic    #39  <Method int StreamingDrmSessionManager.access$302(StreamingDrmSessionManager, int)>
	//   39  105:pop             
				StreamingDrmSessionManager.access$600(StreamingDrmSessionManager.this);
	//   40  106:aload_0         
	//   41  107:getfield        #16  <Field StreamingDrmSessionManager this$0>
	//   42  110:invokestatic    #55  <Method void StreamingDrmSessionManager.access$600(StreamingDrmSessionManager)>
				return;
	//   43  113:return          
			}
		} else
		{
			return;
	//   44  114:return          
		}
	}

	final StreamingDrmSessionManager this$0;

	public StreamingDrmSessionManager$MediaDrmHandler(Looper looper)
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
