// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import android.hardware.Camera;

// Referenced classes of package com.craftar:
//			CameraThread, CLog

class CameraThread$1
	implements Runnable
{

	public void run()
	{
		CLog.d("OPENING CAMERA!!!!");
	//    0    0:ldc1            #26  <String "OPENING CAMERA!!!!">
	//    1    2:invokestatic    #32  <Method void CLog.d(String)>
		try
		{
			CameraThread.access$002(CameraThread.this, Camera.open());
	//    2    5:aload_0         
	//    3    6:getfield        #17  <Field CameraThread this$0>
	//    4    9:invokestatic    #38  <Method Camera Camera.open()>
	//    5   12:invokestatic    #42  <Method Camera CameraThread.access$002(CameraThread, Camera)>
	//    6   15:pop             
		}
	//*   7   16:goto            24
		catch(Exception exception)
	//*   8   19:astore_1        
		{
			exception.printStackTrace();
	//    9   20:aload_1         
	//   10   21:invokevirtual   #45  <Method void Exception.printStackTrace()>
		}
		mOpeningCamera = false;
	//   11   24:aload_0         
	//   12   25:getfield        #17  <Field CameraThread this$0>
	//   13   28:iconst_0        
	//   14   29:putfield        #49  <Field boolean CameraThread.mOpeningCamera>
	//   15   32:return          
	}

	final CameraThread this$0;

	CameraThread$1()
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
