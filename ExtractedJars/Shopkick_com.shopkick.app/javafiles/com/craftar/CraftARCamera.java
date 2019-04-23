// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import java.util.List;

// Referenced classes of package com.craftar:
//			CraftARQueryImage, CraftARError

public abstract class CraftARCamera
{
	public static interface CraftARCameraCallbacks
	{

		public abstract void onPictureTaken(CraftARQueryImage craftarqueryimage);

		public abstract void onPreviewFrame(CraftARQueryImage craftarqueryimage);

		public abstract void onTakePictureFailed(CraftARError craftarerror);
	}


	public CraftARCamera()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public abstract CraftARCameraCallbacks getCameraHandler();

	public abstract List getSupportedFlashModes();

	public abstract List getSupportedPictureSizes();

	public abstract void restartCapture();

	public abstract void setAutoFocusOnTouch(boolean flag);

	public abstract void setCameraHandler(CraftARCameraCallbacks craftarcameracallbacks);

	public abstract boolean setFlashMode(String s);

	public abstract void setPictureSize(android.hardware.Camera.Size size);

	public abstract void stopCapture();

	public abstract void takePicture();

	public abstract void triggerAutoFocus();
}
