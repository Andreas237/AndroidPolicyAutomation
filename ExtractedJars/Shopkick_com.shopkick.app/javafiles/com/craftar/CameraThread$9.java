// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CameraThread

class CameraThread$9
	implements Runnable
{

	public void run()
	{
		CameraThread.access$1000(CameraThread.this, val$texID);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field CameraThread this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field int val$texID>
	//    4    8:invokestatic    #29  <Method void CameraThread.access$1000(CameraThread, int)>
	//    5   11:return          
	}

	final CameraThread this$0;
	final int val$texID;

	CameraThread$9()
	{
		this$0 = final_camerathread;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field CameraThread this$0>
		val$texID = I.this;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #21  <Field int val$texID>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
