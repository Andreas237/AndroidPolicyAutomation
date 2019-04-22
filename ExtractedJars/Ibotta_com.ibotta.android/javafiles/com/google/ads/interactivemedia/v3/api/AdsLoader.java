// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.api;


// Referenced classes of package com.google.ads.interactivemedia.v3.api:
//			ImaSdkSettings, AdsRequest, StreamRequest, AdsManagerLoadedEvent

public interface AdsLoader
{
	public static interface AdsLoadedListener
	{

		public abstract void onAdsManagerLoaded(AdsManagerLoadedEvent adsmanagerloadedevent);
	}


	public abstract void addAdErrorListener(AdErrorEvent.AdErrorListener aderrorlistener);

	public abstract void addAdsLoadedListener(AdsLoadedListener adsloadedlistener);

	public abstract void contentComplete();

	public abstract ImaSdkSettings getSettings();

	public abstract void removeAdErrorListener(AdErrorEvent.AdErrorListener aderrorlistener);

	public abstract void removeAdsLoadedListener(AdsLoadedListener adsloadedlistener);

	public abstract void requestAds(AdsRequest adsrequest);

	public abstract String requestStream(StreamRequest streamrequest);
}
