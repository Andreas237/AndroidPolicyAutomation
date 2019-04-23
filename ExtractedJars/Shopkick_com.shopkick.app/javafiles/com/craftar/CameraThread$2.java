// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CameraThread, CLog

class CameraThread$2
	implements Runnable
{

	public void run()
	{
		CLog.d("running startCaptureInternal");
	//    0    0:ldc1            #31  <String "running startCaptureInternal">
	//    1    2:invokestatic    #37  <Method void CLog.d(String)>
		CameraThread.access$100(CameraThread.this, val$width, val$height);
	//    2    5:aload_0         
	//    3    6:getfield        #20  <Field CameraThread this$0>
	//    4    9:aload_0         
	//    5   10:getfield        #22  <Field int val$width>
	//    6   13:aload_0         
	//    7   14:getfield        #24  <Field int val$height>
	//    8   17:invokestatic    #40  <Method void CameraThread.access$100(CameraThread, int, int)>
		CameraThread.access$202(CameraThread.this, false);
	//    9   20:aload_0         
	//   10   21:getfield        #20  <Field CameraThread this$0>
	//   11   24:iconst_0        
	//   12   25:invokestatic    #44  <Method boolean CameraThread.access$202(CameraThread, boolean)>
	//   13   28:pop             
	//   14   29:return          
	}

	final CameraThread this$0;
	final int val$height;
	final int val$width;

	CameraThread$2()
	{
		this$0 = final_camerathread;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field CameraThread this$0>
		val$width = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #22  <Field int val$width>
		val$height = I.this;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #24  <Field int val$height>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
