// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.adjust.sdk;

import android.os.*;
import java.lang.ref.WeakReference;

// Referenced classes of package com.adjust.sdk:
//			PackageHandler, ActivityPackage

private static final class PackageHandler$InternalHandler extends Handler
{

	public void handleMessage(Message message)
	{
		super.handleMessage(message);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #36  <Method void Handler.handleMessage(Message)>
		PackageHandler packagehandler = (PackageHandler)packageHandlerReference.get();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field WeakReference packageHandlerReference>
	//    5    9:invokevirtual   #40  <Method Object WeakReference.get()>
	//    6   12:checkcast       #6   <Class PackageHandler>
	//    7   15:astore_2        
		if(packagehandler == null)
	//*   8   16:aload_2         
	//*   9   17:ifnonnull       21
			return;
	//   10   20:return          
		switch(message.arg1)
	//*  11   21:aload_1         
	//*  12   22:getfield        #45  <Field int Message.arg1>
		{
	//*  13   25:tableswitch     1 4: default 56
	//	               1 79
	//	               2 67
	//	               3 62
	//	               4 57
		default:
			return;
	//   14   56:return          

		case 4: // '\004'
			PackageHandler.access$200(packagehandler);
	//   15   57:aload_2         
	//   16   58:invokestatic    #49  <Method void PackageHandler.access$200(PackageHandler)>
			return;
	//   17   61:return          

		case 3: // '\003'
			PackageHandler.access$300(packagehandler);
	//   18   62:aload_2         
	//   19   63:invokestatic    #52  <Method void PackageHandler.access$300(PackageHandler)>
			return;
	//   20   66:return          

		case 2: // '\002'
			PackageHandler.access$100(packagehandler, (ActivityPackage)message.obj);
	//   21   67:aload_2         
	//   22   68:aload_1         
	//   23   69:getfield        #56  <Field Object Message.obj>
	//   24   72:checkcast       #58  <Class ActivityPackage>
	//   25   75:invokestatic    #62  <Method void PackageHandler.access$100(PackageHandler, ActivityPackage)>
			return;
	//   26   78:return          

		case 1: // '\001'
			PackageHandler.access$000(packagehandler);
	//   27   79:aload_2         
	//   28   80:invokestatic    #65  <Method void PackageHandler.access$000(PackageHandler)>
			return;
	//   29   83:return          
		}
	}

	private static final int ADD = 2;
	private static final int INIT = 1;
	private static final int SEND_FIRST = 4;
	private static final int SEND_NEXT = 3;
	private final WeakReference packageHandlerReference;

	protected PackageHandler$InternalHandler(Looper looper, PackageHandler packagehandler)
	{
		super(looper);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #24  <Method void Handler(Looper)>
		packageHandlerReference = new WeakReference(((Object) (packagehandler)));
	//    3    5:aload_0         
	//    4    6:new             #26  <Class WeakReference>
	//    5    9:dup             
	//    6   10:aload_2         
	//    7   11:invokespecial   #29  <Method void WeakReference(Object)>
	//    8   14:putfield        #31  <Field WeakReference packageHandlerReference>
	//    9   17:return          
	}
}
