// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.reward;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;

// Referenced classes of package com.google.android.gms.ads.reward:
//			RewardedVideoAdListener

public interface RewardedVideoAd
{

	public abstract void destroy();

	public abstract void destroy(Context context);

	public abstract String getMediationAdapterClassName();

	public abstract RewardedVideoAdListener getRewardedVideoAdListener();

	public abstract String getUserId();

	public abstract boolean isLoaded();

	public abstract void loadAd(String s, AdRequest adrequest);

	public abstract void loadAd(String s, PublisherAdRequest publisheradrequest);

	public abstract void pause();

	public abstract void pause(Context context);

	public abstract void resume();

	public abstract void resume(Context context);

	public abstract void setImmersiveMode(boolean flag);

	public abstract void setRewardedVideoAdListener(RewardedVideoAdListener rewardedvideoadlistener);

	public abstract void setUserId(String s);

	public abstract void show();
}
