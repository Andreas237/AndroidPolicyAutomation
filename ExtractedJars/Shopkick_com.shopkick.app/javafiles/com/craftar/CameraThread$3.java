// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CameraThread

class CameraThread$3
	implements Runnable
{

	public void run()
	{
		CameraThread.access$300(CameraThread.this);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field CameraThread this$0>
	//    2    4:invokestatic    #24  <Method void CameraThread.access$300(CameraThread)>
		CameraThread.access$402(CameraThread.this, false);
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field CameraThread this$0>
	//    5   11:iconst_0        
	//    6   12:invokestatic    #28  <Method boolean CameraThread.access$402(CameraThread, boolean)>
	//    7   15:pop             
	//    8   16:return          
	}

	final CameraThread this$0;

	CameraThread$3()
	{
		this$0 = CameraThread.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field CameraThread this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
