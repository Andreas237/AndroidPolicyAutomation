// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CameraThread, CraftARError

static interface CameraThread$CameraThreadEventHandler
{

	public abstract void onCameraOpenFailed();

	public abstract void onCameraOpenStuck();

	public abstract void onPictureTaken(byte abyte0[], int i, int j, int k);

	public abstract void onPreviewStarted(int i, int j, int k);

	public abstract void onReadyToSetPreviewDisplay(int i, int j);

	public abstract void takePictureFailed(CraftARError craftarerror);
}
