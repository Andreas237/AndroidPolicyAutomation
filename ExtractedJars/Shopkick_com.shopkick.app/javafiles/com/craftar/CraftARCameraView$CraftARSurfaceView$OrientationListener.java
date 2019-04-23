// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import android.content.Context;
import android.view.*;

// Referenced classes of package com.craftar:
//			CraftARCameraView, CLog, CameraThread

private class CraftARCameraView$CraftARSurfaceView$OrientationListener extends OrientationEventListener
{

	public void onOrientationChanged(int i)
	{
		currentOrientation = ((WindowManager)CraftARCameraView.CraftARSurfaceView.access$100(CraftARCameraView.CraftARSurfaceView.this).getSystemService("window")).getDefaultDisplay().getRotation();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #23  <Field CraftARCameraView$CraftARSurfaceView this$1>
	//    3    5:invokestatic    #39  <Method Context CraftARCameraView$CraftARSurfaceView.access$100(CraftARCameraView$CraftARSurfaceView)>
	//    4    8:ldc1            #41  <String "window">
	//    5   10:invokevirtual   #47  <Method Object Context.getSystemService(String)>
	//    6   13:checkcast       #49  <Class WindowManager>
	//    7   16:invokeinterface #53  <Method Display WindowManager.getDefaultDisplay()>
	//    8   21:invokevirtual   #59  <Method int Display.getRotation()>
	//    9   24:putfield        #61  <Field int currentOrientation>
		if(currentOrientation != lastOrientation)
	//*  10   27:aload_0         
	//*  11   28:getfield        #61  <Field int currentOrientation>
	//*  12   31:aload_0         
	//*  13   32:getfield        #33  <Field int lastOrientation>
	//*  14   35:icmpeq          115
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   15   38:new             #63  <Class StringBuilder>
	//   16   41:dup             
	//   17   42:invokespecial   #66  <Method void StringBuilder()>
	//   18   45:astore_2        
			stringbuilder.append("orientationListener current: ");
	//   19   46:aload_2         
	//   20   47:ldc1            #68  <String "orientationListener current: ">
	//   21   49:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   22   52:pop             
			stringbuilder.append(currentOrientation);
	//   23   53:aload_2         
	//   24   54:aload_0         
	//   25   55:getfield        #61  <Field int currentOrientation>
	//   26   58:invokevirtual   #75  <Method StringBuilder StringBuilder.append(int)>
	//   27   61:pop             
			stringbuilder.append(" last: ");
	//   28   62:aload_2         
	//   29   63:ldc1            #77  <String " last: ">
	//   30   65:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   31   68:pop             
			stringbuilder.append(lastOrientation);
	//   32   69:aload_2         
	//   33   70:aload_0         
	//   34   71:getfield        #33  <Field int lastOrientation>
	//   35   74:invokevirtual   #75  <Method StringBuilder StringBuilder.append(int)>
	//   36   77:pop             
			CLog.d(stringbuilder.toString());
	//   37   78:aload_2         
	//   38   79:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   39   82:invokestatic    #87  <Method void CLog.d(String)>
			if(executeOnce)
	//*  40   85:aload_0         
	//*  41   86:getfield        #28  <Field boolean executeOnce>
	//*  42   89:ifeq            115
			{
				executeOnce = false;
	//   43   92:aload_0         
	//   44   93:iconst_0        
	//   45   94:putfield        #28  <Field boolean executeOnce>
				CraftARCameraView.CraftARSurfaceView.access$300(CraftARCameraView.CraftARSurfaceView.this).setCameraDisplayOrientation(new CameraThread.DisplayOrientationCallback() {

					public void onDisplayOrientationUpdated(int j)
					{
						lastOrientation = j;
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
);
	//   46   97:aload_0         
	//   47   98:getfield        #23  <Field CraftARCameraView$CraftARSurfaceView this$1>
	//   48  101:invokestatic    #91  <Method CameraThread CraftARCameraView$CraftARSurfaceView.access$300(CraftARCameraView$CraftARSurfaceView)>
	//   49  104:new             #12  <Class CraftARCameraView$CraftARSurfaceView$OrientationListener$1>
	//   50  107:dup             
	//   51  108:aload_0         
	//   52  109:invokespecial   #94  <Method void CraftARCameraView$CraftARSurfaceView$OrientationListener$1(CraftARCameraView$CraftARSurfaceView$OrientationListener)>
	//   53  112:invokevirtual   #100 <Method void CameraThread.setCameraDisplayOrientation(CameraThread$DisplayOrientationCallback)>
			}
		}
	//   54  115:return          
	}

	public void resetOrientation()
	{
		lastOrientation = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #33  <Field int lastOrientation>
	//    3    5:return          
	}

	int currentOrientation;
	boolean executeOnce;
	private int lastOrientation;
	final CraftARCameraView.CraftARSurfaceView this$1;


/*
	static int access$202(CraftARCameraView$CraftARSurfaceView$OrientationListener craftarcameraview$craftarsurfaceview$orientationlistener, int i)
	{
		craftarcameraview$craftarsurfaceview$orientationlistener.lastOrientation = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #33  <Field int lastOrientation>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/

	public CraftARCameraView$CraftARSurfaceView$OrientationListener(Context context)
	{
		this$1 = CraftARCameraView.CraftARSurfaceView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field CraftARCameraView$CraftARSurfaceView this$1>
		super(context, 3);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:iconst_3        
	//    6    8:invokespecial   #26  <Method void OrientationEventListener(Context, int)>
		executeOnce = true;
	//    7   11:aload_0         
	//    8   12:iconst_1        
	//    9   13:putfield        #28  <Field boolean executeOnce>
	//   10   16:return          
	}
}
