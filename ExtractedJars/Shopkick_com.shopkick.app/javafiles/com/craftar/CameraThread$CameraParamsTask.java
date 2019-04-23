// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CameraThread

public static interface CameraThread$CameraParamsTask
{

	public abstract void onDone();

	public abstract void updateCameraParams(android.hardware.Camera.Parameters parameters);
}
