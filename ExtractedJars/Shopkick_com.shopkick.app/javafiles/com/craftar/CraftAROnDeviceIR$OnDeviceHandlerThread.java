// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import android.os.Handler;
import android.os.HandlerThread;

// Referenced classes of package com.craftar:
//			CraftAROnDeviceIR

class CraftAROnDeviceIR$OnDeviceHandlerThread extends HandlerThread
{

	public void start()
	{
		super.start();
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void HandlerThread.start()>
		mHandler = new Handler(getLooper());
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field CraftAROnDeviceIR this$0>
	//    4    8:new             #25  <Class Handler>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #29  <Method android.os.Looper getLooper()>
	//    8   16:invokespecial   #32  <Method void Handler(android.os.Looper)>
	//    9   19:putfield        #36  <Field Handler CraftAROnDeviceIR.mHandler>
		mHandler.post(new Runnable() {

			public void run()
			{
				CraftAROnDeviceIR.access$400(this$0);
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field CraftAROnDeviceIR$OnDeviceHandlerThread this$1>
			//    2    4:getfield        #28  <Field CraftAROnDeviceIR CraftAROnDeviceIR$OnDeviceHandlerThread.this$0>
			//    3    7:invokestatic    #32  <Method void CraftAROnDeviceIR.access$400(CraftAROnDeviceIR)>
			//    4   10:return          
			}

			final CraftAROnDeviceIR.OnDeviceHandlerThread this$1;

			
			{
				this$1 = CraftAROnDeviceIR.OnDeviceHandlerThread.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field CraftAROnDeviceIR$OnDeviceHandlerThread this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   10   22:aload_0         
	//   11   23:getfield        #15  <Field CraftAROnDeviceIR this$0>
	//   12   26:getfield        #36  <Field Handler CraftAROnDeviceIR.mHandler>
	//   13   29:new             #9   <Class CraftAROnDeviceIR$OnDeviceHandlerThread$1>
	//   14   32:dup             
	//   15   33:aload_0         
	//   16   34:invokespecial   #39  <Method void CraftAROnDeviceIR$OnDeviceHandlerThread$1(CraftAROnDeviceIR$OnDeviceHandlerThread)>
	//   17   37:invokevirtual   #43  <Method boolean Handler.post(Runnable)>
	//   18   40:pop             
	//   19   41:return          
	}

	final CraftAROnDeviceIR this$0;

	public CraftAROnDeviceIR$OnDeviceHandlerThread(String s)
	{
		this$0 = CraftAROnDeviceIR.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field CraftAROnDeviceIR this$0>
		super(s);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #18  <Method void HandlerThread(String)>
	//    6   10:return          
	}
}
