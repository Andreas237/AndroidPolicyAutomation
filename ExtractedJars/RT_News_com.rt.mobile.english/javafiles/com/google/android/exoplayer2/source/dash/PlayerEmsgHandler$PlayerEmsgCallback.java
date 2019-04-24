// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash;


// Referenced classes of package com.google.android.exoplayer2.source.dash:
//			PlayerEmsgHandler

public static interface PlayerEmsgHandler$PlayerEmsgCallback
{

	public abstract void onDashLiveMediaPresentationEndSignalEncountered();

	public abstract void onDashManifestPublishTimeExpired(long l);

	public abstract void onDashManifestRefreshRequested();
}
