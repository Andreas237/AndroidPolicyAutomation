// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CameraThread

class CameraThread$14
	implements Runnable
{

	public void run()
	{
		setAutoFocus(val$finalAutofocus, val$finalFocusPeriodMS);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field CameraThread this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field boolean val$finalAutofocus>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field int val$finalFocusPeriodMS>
	//    6   12:invokevirtual   #33  <Method void CameraThread.setAutoFocus(boolean, int)>
	//    7   15:return          
	}

	final CameraThread this$0;
	final boolean val$finalAutofocus;
	final int val$finalFocusPeriodMS;

	CameraThread$14()
	{
		this$0 = final_camerathread;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field CameraThread this$0>
		val$finalAutofocus = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #23  <Field boolean val$finalAutofocus>
		val$finalFocusPeriodMS = I.this;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #25  <Field int val$finalFocusPeriodMS>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
