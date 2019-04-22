// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.api.player;


// Referenced classes of package com.google.ads.interactivemedia.v3.api.player:
//			AdProgressProvider

public interface VideoAdPlayer
	extends AdProgressProvider
{
	public static interface VideoAdPlayerCallback
	{

		public abstract void onEnded();

		public abstract void onError();

		public abstract void onPause();

		public abstract void onPlay();

		public abstract void onResume();

		public abstract void onVolumeChanged(int i);
	}


	public abstract void addCallback(VideoAdPlayerCallback videoadplayercallback);

	public abstract void loadAd(String s);

	public abstract void pauseAd();

	public abstract void playAd();

	public abstract void removeCallback(VideoAdPlayerCallback videoadplayercallback);

	public abstract void resumeAd();

	public abstract void stopAd();
}
