// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CameraThread

class CameraThread$12
	implements Runnable
{

	public void run()
	{
		CameraThread camerathread = CameraThread.this;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field CameraThread this$0>
	//    2    4:astore_1        
		CameraThread.access$800(camerathread, CameraThread.access$1300(camerathread));
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:invokestatic    #26  <Method CameraThread$CameraParamsTask CameraThread.access$1300(CameraThread)>
	//    6   10:invokestatic    #30  <Method void CameraThread.access$800(CameraThread, CameraThread$CameraParamsTask)>
	//    7   13:return          
	}

	final CameraThread this$0;

	CameraThread$12()
	{
		this$0 = CameraThread.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field CameraThread this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
