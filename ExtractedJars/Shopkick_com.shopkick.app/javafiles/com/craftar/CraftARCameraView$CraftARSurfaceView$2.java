// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CraftARCameraView, CLog

class CraftARCameraView$CraftARSurfaceView$2
	implements Runnable
{

	public void run()
	{
		CLog.d("onReadyToSetCameraPreview  PreviewStarted");
	//    0    0:ldc1            #27  <String "onReadyToSetCameraPreview  PreviewStarted">
	//    1    2:invokestatic    #33  <Method void CLog.d(String)>
		onReadyToSetCameraPreviewDisplay();
	//    2    5:aload_0         
	//    3    6:getfield        #20  <Field CraftARCameraView$CraftARSurfaceView this$1>
	//    4    9:invokevirtual   #36  <Method void CraftARCameraView$CraftARSurfaceView.onReadyToSetCameraPreviewDisplay()>
	//    5   12:return          
	}

	final CraftARCameraView.CraftARSurfaceView this$1;

	CraftARCameraView$CraftARSurfaceView$2()
	{
		this$1 = CraftARCameraView.CraftARSurfaceView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field CraftARCameraView$CraftARSurfaceView this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void Object()>
	//    5    9:return          
	}
}
