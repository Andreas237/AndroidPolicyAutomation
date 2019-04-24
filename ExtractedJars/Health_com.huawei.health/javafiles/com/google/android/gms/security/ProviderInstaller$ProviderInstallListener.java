// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.security;

import android.content.Intent;

// Referenced classes of package com.google.android.gms.security:
//			ProviderInstaller

public static interface ProviderInstaller$ProviderInstallListener
{

	public abstract void onProviderInstallFailed(int i, Intent intent);

	public abstract void onProviderInstalled();
}
