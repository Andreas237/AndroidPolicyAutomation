// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CraftARCamera, CraftARQueryImage, CraftARError

public static interface CraftARCamera$CraftARCameraCallbacks
{

	public abstract void onPictureTaken(CraftARQueryImage craftarqueryimage);

	public abstract void onPreviewFrame(CraftARQueryImage craftarqueryimage);

	public abstract void onTakePictureFailed(CraftARError craftarerror);
}
