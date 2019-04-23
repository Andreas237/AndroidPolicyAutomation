// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import android.hardware.Camera;

// Referenced classes of package com.craftar:
//			CameraThread, CLog

private class CameraThread$AutoFocusCB
	implements android.hardware.Camera$AutoFocusCallback
{

	public void onAutoFocus(boolean flag, Camera camera)
	{
		android.hardware.Camera.Parameters parameters1 = camera.getParameters();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #33  <Method android.hardware.Camera$Parameters Camera.getParameters()>
	//    2    4:astore          4
		android.hardware.Camera.Parameters parameters = parameters1;
	//    3    6:aload           4
	//    4    8:astore_3        
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*   5    9:getstatic       #39  <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   12:bipush          14
	//*   7   14:icmplt          55
		{
			parameters = parameters1;
	//    8   17:aload           4
	//    9   19:astore_3        
			if(parameters1.isAutoExposureLockSupported())
	//*  10   20:aload           4
	//*  11   22:invokevirtual   #45  <Method boolean android.hardware.Camera$Parameters.isAutoExposureLockSupported()>
	//*  12   25:ifeq            55
			{
				parameters1.setAutoExposureLock(true);
	//   13   28:aload           4
	//   14   30:iconst_1        
	//   15   31:invokevirtual   #49  <Method void android.hardware.Camera$Parameters.setAutoExposureLock(boolean)>
				camera.setParameters(parameters1);
	//   16   34:aload_2         
	//   17   35:aload           4
	//   18   37:invokevirtual   #53  <Method void Camera.setParameters(android.hardware.Camera$Parameters)>
				parameters = camera.getParameters();
	//   19   40:aload_2         
	//   20   41:invokevirtual   #33  <Method android.hardware.Camera$Parameters Camera.getParameters()>
	//   21   44:astore_3        
				parameters.setAutoExposureLock(false);
	//   22   45:aload_3         
	//   23   46:iconst_0        
	//   24   47:invokevirtual   #49  <Method void android.hardware.Camera$Parameters.setAutoExposureLock(boolean)>
				camera.setParameters(parameters);
	//   25   50:aload_2         
	//   26   51:aload_3         
	//   27   52:invokevirtual   #53  <Method void Camera.setParameters(android.hardware.Camera$Parameters)>
			}
		}
		if(CameraThread.access$1800(CameraThread.this) != null)
	//*  28   55:aload_0         
	//*  29   56:getfield        #15  <Field CameraThread this$0>
	//*  30   59:invokestatic    #57  <Method String CameraThread.access$1800(CameraThread)>
	//*  31   62:ifnull          90
		{
			parameters.setFocusMode(CameraThread.access$1800(CameraThread.this));
	//   32   65:aload_3         
	//   33   66:aload_0         
	//   34   67:getfield        #15  <Field CameraThread this$0>
	//   35   70:invokestatic    #57  <Method String CameraThread.access$1800(CameraThread)>
	//   36   73:invokevirtual   #61  <Method void android.hardware.Camera$Parameters.setFocusMode(String)>
			CameraThread.access$000(CameraThread.this).setParameters(parameters);
	//   37   76:aload_0         
	//   38   77:getfield        #15  <Field CameraThread this$0>
	//   39   80:invokestatic    #65  <Method Camera CameraThread.access$000(CameraThread)>
	//   40   83:aload_3         
	//   41   84:invokevirtual   #53  <Method void Camera.setParameters(android.hardware.Camera$Parameters)>
		} else
	//*  42   87:goto            95
		{
			CLog.e("Focus mode not set");
	//   43   90:ldc1            #67  <String "Focus mode not set">
	//   44   92:invokestatic    #72  <Method void CLog.e(String)>
		}
		CLog.v("focused!");
	//   45   95:ldc1            #74  <String "focused!">
	//   46   97:invokestatic    #77  <Method void CLog.v(String)>
	//   47  100:return          
	}

	final CameraThread this$0;

	private CameraThread$AutoFocusCB()
	{
		this$0 = CameraThread.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field CameraThread this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	CameraThread$AutoFocusCB(CameraThread._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void CameraThread$AutoFocusCB(CameraThread)>
	//    3    5:return          
	}
}
