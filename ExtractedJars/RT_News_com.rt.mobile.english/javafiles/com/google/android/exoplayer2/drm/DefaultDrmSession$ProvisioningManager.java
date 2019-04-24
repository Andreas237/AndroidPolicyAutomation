// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.drm;


// Referenced classes of package com.google.android.exoplayer2.drm:
//			DefaultDrmSession

public static interface DefaultDrmSession$ProvisioningManager
{

	public abstract void onProvisionCompleted();

	public abstract void onProvisionError(Exception exception);

	public abstract void provisionRequired(DefaultDrmSession defaultdrmsession);
}
