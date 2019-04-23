// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.util;

import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.util:
//			ManifestFetcher

public static interface ManifestFetcher$EventListener
{

	public abstract void onManifestError(IOException ioexception);

	public abstract void onManifestRefreshStarted();

	public abstract void onManifestRefreshed();
}
