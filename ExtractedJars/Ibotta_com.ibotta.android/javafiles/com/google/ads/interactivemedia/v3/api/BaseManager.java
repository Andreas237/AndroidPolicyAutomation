// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.api;

import com.google.ads.interactivemedia.v3.api.player.AdProgressProvider;

// Referenced classes of package com.google.ads.interactivemedia.v3.api:
//			Ad, AdsRenderingSettings

public interface BaseManager
	extends AdProgressProvider
{

	public abstract void addAdErrorListener(AdErrorEvent.AdErrorListener aderrorlistener);

	public abstract void addAdEventListener(AdEvent.AdEventListener adeventlistener);

	public abstract void destroy();

	public abstract Ad getCurrentAd();

	public abstract void init();

	public abstract void init(AdsRenderingSettings adsrenderingsettings);

	public abstract boolean isCustomPlaybackUsed();

	public abstract void removeAdErrorListener(AdErrorEvent.AdErrorListener aderrorlistener);

	public abstract void removeAdEventListener(AdEvent.AdEventListener adeventlistener);
}
