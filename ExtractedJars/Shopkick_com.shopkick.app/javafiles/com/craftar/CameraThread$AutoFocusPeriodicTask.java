// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import android.hardware.Camera;
import android.os.Handler;

// Referenced classes of package com.craftar:
//			CameraThread, CLog

private class CameraThread$AutoFocusPeriodicTask
	implements Runnable
{

	public void run()
	{
		if(CameraThread.access$1500(CameraThread.this) && !CameraThread.access$400(CameraThread.this))
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field CameraThread this$0>
	//*   2    4:invokestatic    #30  <Method boolean CameraThread.access$1500(CameraThread)>
	//*   3    7:ifeq            75
	//*   4   10:aload_0         
	//*   5   11:getfield        #17  <Field CameraThread this$0>
	//*   6   14:invokestatic    #33  <Method boolean CameraThread.access$400(CameraThread)>
	//*   7   17:ifeq            23
	//*   8   20:goto            75
		{
			CLog.v("AutoFocusPeriodicTask(): focus!");
	//    9   23:ldc1            #35  <String "AutoFocusPeriodicTask(): focus!">
	//   10   25:invokestatic    #41  <Method void CLog.v(String)>
			try
			{
				CameraThread.access$000(CameraThread.this).autoFocus(((android.hardware.Camera.AutoFocusCallback) (CameraThread.access$1600(CameraThread.this))));
	//   11   28:aload_0         
	//   12   29:getfield        #17  <Field CameraThread this$0>
	//   13   32:invokestatic    #45  <Method Camera CameraThread.access$000(CameraThread)>
	//   14   35:aload_0         
	//   15   36:getfield        #17  <Field CameraThread this$0>
	//   16   39:invokestatic    #49  <Method CameraThread$AutoFocusCB CameraThread.access$1600(CameraThread)>
	//   17   42:invokevirtual   #55  <Method void Camera.autoFocus(android.hardware.Camera$AutoFocusCallback)>
			}
	//*  18   45:goto            58
			catch(RuntimeException runtimeexception)
	//*  19   48:astore_1        
			{
				CLog.e("Autofocus failed");
	//   20   49:ldc1            #57  <String "Autofocus failed">
	//   21   51:invokestatic    #60  <Method void CLog.e(String)>
				runtimeexception.printStackTrace();
	//   22   54:aload_1         
	//   23   55:invokevirtual   #63  <Method void RuntimeException.printStackTrace()>
			}
			mHandler.postDelayed(((Runnable) (this)), mFocusPeriodMS);
	//   24   58:aload_0         
	//   25   59:getfield        #17  <Field CameraThread this$0>
	//   26   62:getfield        #67  <Field Handler CameraThread.mHandler>
	//   27   65:aload_0         
	//   28   66:aload_0         
	//   29   67:getfield        #22  <Field long mFocusPeriodMS>
	//   30   70:invokevirtual   #73  <Method boolean Handler.postDelayed(Runnable, long)>
	//   31   73:pop             
			return;
	//   32   74:return          
		} else
		{
			CLog.i("Capture finished, not focusing anymore");
	//   33   75:ldc1            #75  <String "Capture finished, not focusing anymore">
	//   34   77:invokestatic    #78  <Method void CLog.i(String)>
			return;
	//   35   80:return          
		}
	}

	private long mFocusPeriodMS;
	final CameraThread this$0;

	public CameraThread$AutoFocusPeriodicTask(int i)
	{
		this$0 = CameraThread.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field CameraThread this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
		mFocusPeriodMS = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:i2l             
	//    8   12:putfield        #22  <Field long mFocusPeriodMS>
	//    9   15:return          
	}
}
