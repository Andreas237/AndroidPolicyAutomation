// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.adjust.sdk;

import android.os.*;
import java.lang.ref.WeakReference;

// Referenced classes of package com.adjust.sdk:
//			RequestHandler, ActivityPackage

private static final class RequestHandler$InternalHandler extends Handler
{

	public void handleMessage(Message message)
	{
		super.handleMessage(message);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #30  <Method void Handler.handleMessage(Message)>
		RequestHandler requesthandler = (RequestHandler)requestHandlerReference.get();
	//    3    5:aload_0         
	//    4    6:getfield        #25  <Field WeakReference requestHandlerReference>
	//    5    9:invokevirtual   #34  <Method Object WeakReference.get()>
	//    6   12:checkcast       #6   <Class RequestHandler>
	//    7   15:astore_2        
		if(requesthandler == null)
	//*   8   16:aload_2         
	//*   9   17:ifnonnull       21
			return;
	//   10   20:return          
		if(message.arg1 != 0x11ad0)
	//*  11   21:aload_1         
	//*  12   22:getfield        #39  <Field int Message.arg1>
	//*  13   25:ldc1            #10  <Int 0x11ad0>
	//*  14   27:icmpeq          31
		{
			return;
	//   15   30:return          
		} else
		{
			RequestHandler.access$000(requesthandler, (ActivityPackage)message.obj);
	//   16   31:aload_2         
	//   17   32:aload_1         
	//   18   33:getfield        #43  <Field Object Message.obj>
	//   19   36:checkcast       #45  <Class ActivityPackage>
	//   20   39:invokestatic    #49  <Method void RequestHandler.access$000(RequestHandler, ActivityPackage)>
			return;
	//   21   42:return          
		}
	}

	private static final int SEND = 0x11ad0;
	private final WeakReference requestHandlerReference;

	protected RequestHandler$InternalHandler(Looper looper, RequestHandler requesthandler)
	{
		super(looper);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void Handler(Looper)>
		requestHandlerReference = new WeakReference(((Object) (requesthandler)));
	//    3    5:aload_0         
	//    4    6:new             #20  <Class WeakReference>
	//    5    9:dup             
	//    6   10:aload_2         
	//    7   11:invokespecial   #23  <Method void WeakReference(Object)>
	//    8   14:putfield        #25  <Field WeakReference requestHandlerReference>
	//    9   17:return          
	}
}
