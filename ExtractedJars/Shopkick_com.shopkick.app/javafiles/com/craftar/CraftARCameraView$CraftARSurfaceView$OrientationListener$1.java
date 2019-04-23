// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CraftARCameraView

class CraftARCameraView$CraftARSurfaceView$OrientationListener$1
	implements CameraThread.DisplayOrientationCallback
{

	public void onDisplayOrientationUpdated(int i)
	{
		CraftARCameraView.CraftARSurfaceView.OrientationListener.access$202(CraftARCameraView.CraftARSurfaceView.OrientationListener.this, i);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field CraftARCameraView$CraftARSurfaceView$OrientationListener this$2>
	//    2    4:iload_1         
	//    3    5:invokestatic    #32  <Method int CraftARCameraView$CraftARSurfaceView$OrientationListener.access$202(CraftARCameraView$CraftARSurfaceView$OrientationListener, int)>
	//    4    8:pop             
		executeOnce = true;
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field CraftARCameraView$CraftARSurfaceView$OrientationListener this$2>
	//    7   13:iconst_1        
	//    8   14:putfield        #36  <Field boolean CraftARCameraView$CraftARSurfaceView$OrientationListener.executeOnce>
	//    9   17:return          
	}

	final CraftARCameraView.CraftARSurfaceView.OrientationListener this$2;

	CraftARCameraView$CraftARSurfaceView$OrientationListener$1()
	{
		this$2 = CraftARCameraView.CraftARSurfaceView.OrientationListener.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field CraftARCameraView$CraftARSurfaceView$OrientationListener this$2>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #26  <Method void Object()>
	//    5    9:return          
	}
}
