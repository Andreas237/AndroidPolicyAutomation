// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.api.player;

import java.util.List;

// Referenced classes of package com.google.ads.interactivemedia.v3.api.player:
//			ContentProgressProvider

public interface VideoStreamPlayer
	extends ContentProgressProvider
{
	public static interface VideoStreamPlayerCallback
	{

		public abstract void onUserTextReceived(String s);
	}


	public abstract void addCallback(VideoStreamPlayerCallback videostreamplayercallback);

	public abstract void loadUrl(String s, List list);

	public abstract void onAdBreakEnded();

	public abstract void onAdBreakStarted();

	public abstract void removeCallback(VideoStreamPlayerCallback videostreamplayercallback);
}
