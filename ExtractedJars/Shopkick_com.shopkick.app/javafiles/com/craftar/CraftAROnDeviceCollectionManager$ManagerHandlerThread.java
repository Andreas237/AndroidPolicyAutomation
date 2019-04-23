// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import android.os.Handler;
import android.os.HandlerThread;

// Referenced classes of package com.craftar:
//			CraftAROnDeviceCollectionManager

class CraftAROnDeviceCollectionManager$ManagerHandlerThread extends HandlerThread
{

	public void start()
	{
		super.start();
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void HandlerThread.start()>
		CraftAROnDeviceCollectionManager.access$602(CraftAROnDeviceCollectionManager.this, new Handler(getLooper()));
	//    2    4:aload_0         
	//    3    5:getfield        #13  <Field CraftAROnDeviceCollectionManager this$0>
	//    4    8:new             #23  <Class Handler>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #27  <Method android.os.Looper getLooper()>
	//    8   16:invokespecial   #30  <Method void Handler(android.os.Looper)>
	//    9   19:invokestatic    #34  <Method Handler CraftAROnDeviceCollectionManager.access$602(CraftAROnDeviceCollectionManager, Handler)>
	//   10   22:pop             
	//   11   23:return          
	}

	final CraftAROnDeviceCollectionManager this$0;

	public CraftAROnDeviceCollectionManager$ManagerHandlerThread(String s)
	{
		this$0 = CraftAROnDeviceCollectionManager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field CraftAROnDeviceCollectionManager this$0>
		super(s);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #16  <Method void HandlerThread(String)>
	//    6   10:return          
	}
}
