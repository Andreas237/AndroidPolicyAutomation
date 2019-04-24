// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.reward;


// Referenced classes of package com.google.android.gms.ads.reward:
//			RewardItem

public interface RewardedVideoAdListener
{

	public abstract void onRewarded(RewardItem rewarditem);

	public abstract void onRewardedVideoAdClosed();

	public abstract void onRewardedVideoAdFailedToLoad(int i);

	public abstract void onRewardedVideoAdLeftApplication();

	public abstract void onRewardedVideoAdLoaded();

	public abstract void onRewardedVideoAdOpened();

	public abstract void onRewardedVideoCompleted();

	public abstract void onRewardedVideoStarted();
}
