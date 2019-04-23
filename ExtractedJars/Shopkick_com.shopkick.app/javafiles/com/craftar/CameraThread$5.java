// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CameraThread, CLog

class CameraThread$5
	implements Runnable
{

	public void run()
	{
		CLog.d("run focusInternal");
	//    0    0:ldc1            #32  <String "run focusInternal">
	//    1    2:invokestatic    #38  <Method void CLog.d(String)>
		CameraThread.access$600(CameraThread.this, val$autofocus, val$focusPeriodMS);
	//    2    5:aload_0         
	//    3    6:getfield        #21  <Field CameraThread this$0>
	//    4    9:aload_0         
	//    5   10:getfield        #23  <Field boolean val$autofocus>
	//    6   13:aload_0         
	//    7   14:getfield        #25  <Field int val$focusPeriodMS>
	//    8   17:invokestatic    #41  <Method void CameraThread.access$600(CameraThread, boolean, int)>
	//    9   20:return          
	}

	final CameraThread this$0;
	final boolean val$autofocus;
	final int val$focusPeriodMS;

	CameraThread$5()
	{
		this$0 = final_camerathread;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field CameraThread this$0>
		val$autofocus = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #23  <Field boolean val$autofocus>
		val$focusPeriodMS = I.this;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #25  <Field int val$focusPeriodMS>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
