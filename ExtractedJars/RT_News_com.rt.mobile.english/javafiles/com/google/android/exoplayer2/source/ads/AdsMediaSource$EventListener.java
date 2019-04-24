// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.source.ads:
//			AdsMediaSource

public static interface AdsMediaSource$EventListener
{

	public abstract void onAdClicked();

	public abstract void onAdLoadError(IOException ioexception);

	public abstract void onAdTapped();

	public abstract void onInternalAdLoadError(RuntimeException runtimeexception);
}
