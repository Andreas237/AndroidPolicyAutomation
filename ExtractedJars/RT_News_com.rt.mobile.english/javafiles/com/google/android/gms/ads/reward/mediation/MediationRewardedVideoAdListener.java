// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.reward.mediation;

import android.os.Bundle;
import com.google.android.gms.ads.reward.RewardItem;

// Referenced classes of package com.google.android.gms.ads.reward.mediation:
//			MediationRewardedVideoAdAdapter

public interface MediationRewardedVideoAdListener
{

	public abstract void onAdClicked(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter);

	public abstract void onAdClosed(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter);

	public abstract void onAdFailedToLoad(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter, int i);

	public abstract void onAdLeftApplication(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter);

	public abstract void onAdLoaded(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter);

	public abstract void onAdOpened(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter);

	public abstract void onInitializationFailed(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter, int i);

	public abstract void onInitializationSucceeded(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter);

	public abstract void onRewarded(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter, RewardItem rewarditem);

	public abstract void onVideoCompleted(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter);

	public abstract void onVideoStarted(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter);

	public abstract void zzc(Bundle bundle);
}
