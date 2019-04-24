// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.drm;

import android.os.*;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.drm:
//			DefaultDrmSessionManager, DefaultDrmSession

private class DefaultDrmSessionManager$MediaDrmHandler extends Handler
{

	public void handleMessage(Message message)
	{
		byte abyte0[] = (byte[])message.obj;
	//    0    0:aload_1         
	//    1    1:getfield        #28  <Field Object Message.obj>
	//    2    4:checkcast       #30  <Class byte[]>
	//    3    7:astore_2        
		for(Iterator iterator = DefaultDrmSessionManager.access$200(DefaultDrmSessionManager.this).iterator(); iterator.hasNext();)
	//*   4    8:aload_0         
	//*   5    9:getfield        #16  <Field DefaultDrmSessionManager this$0>
	//*   6   12:invokestatic    #34  <Method List DefaultDrmSessionManager.access$200(DefaultDrmSessionManager)>
	//*   7   15:invokeinterface #40  <Method Iterator List.iterator()>
	//*   8   20:astore_3        
	//*   9   21:aload_3         
	//*  10   22:invokeinterface #46  <Method boolean Iterator.hasNext()>
	//*  11   27:ifeq            60
		{
			DefaultDrmSession defaultdrmsession = (DefaultDrmSession)iterator.next();
	//   12   30:aload_3         
	//   13   31:invokeinterface #50  <Method Object Iterator.next()>
	//   14   36:checkcast       #52  <Class DefaultDrmSession>
	//   15   39:astore          4
			if(defaultdrmsession.hasSessionId(abyte0))
	//*  16   41:aload           4
	//*  17   43:aload_2         
	//*  18   44:invokevirtual   #56  <Method boolean DefaultDrmSession.hasSessionId(byte[])>
	//*  19   47:ifeq            21
			{
				defaultdrmsession.onMediaDrmEvent(message.what);
	//   20   50:aload           4
	//   21   52:aload_1         
	//   22   53:getfield        #60  <Field int Message.what>
	//   23   56:invokevirtual   #64  <Method void DefaultDrmSession.onMediaDrmEvent(int)>
				return;
	//   24   59:return          
			}
		}

	//   25   60:return          
	}

	final DefaultDrmSessionManager this$0;

	public DefaultDrmSessionManager$MediaDrmHandler(Looper looper)
	{
		this$0 = DefaultDrmSessionManager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field DefaultDrmSessionManager this$0>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #19  <Method void Handler(Looper)>
	//    6   10:return          
	}
}
