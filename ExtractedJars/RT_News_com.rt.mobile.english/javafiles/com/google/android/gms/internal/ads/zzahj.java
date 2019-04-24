// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.RewardedVideoAdListener;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzahf, zzahh, zzagu

public final class zzahj extends zzahf
{

	public zzahj(RewardedVideoAdListener rewardedvideoadlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void zzahf()>
		zzhc = rewardedvideoadlistener;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field RewardedVideoAdListener zzhc>
	//    5    9:return          
	}

	public final RewardedVideoAdListener getRewardedVideoAdListener()
	{
		return zzhc;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field RewardedVideoAdListener zzhc>
	//    2    4:areturn         
	}

	public final void onRewardedVideoAdClosed()
	{
		if(zzhc != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field RewardedVideoAdListener zzhc>
	//*   2    4:ifnull          16
			zzhc.onRewardedVideoAdClosed();
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field RewardedVideoAdListener zzhc>
	//    5   11:invokeinterface #25  <Method void RewardedVideoAdListener.onRewardedVideoAdClosed()>
	//    6   16:return          
	}

	public final void onRewardedVideoAdFailedToLoad(int i)
	{
		if(zzhc != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field RewardedVideoAdListener zzhc>
	//*   2    4:ifnull          17
			zzhc.onRewardedVideoAdFailedToLoad(i);
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field RewardedVideoAdListener zzhc>
	//    5   11:iload_1         
	//    6   12:invokeinterface #29  <Method void RewardedVideoAdListener.onRewardedVideoAdFailedToLoad(int)>
	//    7   17:return          
	}

	public final void onRewardedVideoAdLeftApplication()
	{
		if(zzhc != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field RewardedVideoAdListener zzhc>
	//*   2    4:ifnull          16
			zzhc.onRewardedVideoAdLeftApplication();
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field RewardedVideoAdListener zzhc>
	//    5   11:invokeinterface #32  <Method void RewardedVideoAdListener.onRewardedVideoAdLeftApplication()>
	//    6   16:return          
	}

	public final void onRewardedVideoAdLoaded()
	{
		if(zzhc != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field RewardedVideoAdListener zzhc>
	//*   2    4:ifnull          16
			zzhc.onRewardedVideoAdLoaded();
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field RewardedVideoAdListener zzhc>
	//    5   11:invokeinterface #35  <Method void RewardedVideoAdListener.onRewardedVideoAdLoaded()>
	//    6   16:return          
	}

	public final void onRewardedVideoAdOpened()
	{
		if(zzhc != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field RewardedVideoAdListener zzhc>
	//*   2    4:ifnull          16
			zzhc.onRewardedVideoAdOpened();
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field RewardedVideoAdListener zzhc>
	//    5   11:invokeinterface #38  <Method void RewardedVideoAdListener.onRewardedVideoAdOpened()>
	//    6   16:return          
	}

	public final void onRewardedVideoCompleted()
	{
		if(zzhc != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field RewardedVideoAdListener zzhc>
	//*   2    4:ifnull          16
			zzhc.onRewardedVideoCompleted();
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field RewardedVideoAdListener zzhc>
	//    5   11:invokeinterface #41  <Method void RewardedVideoAdListener.onRewardedVideoCompleted()>
	//    6   16:return          
	}

	public final void onRewardedVideoStarted()
	{
		if(zzhc != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field RewardedVideoAdListener zzhc>
	//*   2    4:ifnull          16
			zzhc.onRewardedVideoStarted();
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field RewardedVideoAdListener zzhc>
	//    5   11:invokeinterface #44  <Method void RewardedVideoAdListener.onRewardedVideoStarted()>
	//    6   16:return          
	}

	public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedvideoadlistener)
	{
		zzhc = rewardedvideoadlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field RewardedVideoAdListener zzhc>
	//    3    5:return          
	}

	public final void zza(zzagu zzagu)
	{
		if(zzhc != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field RewardedVideoAdListener zzhc>
	//*   2    4:ifnull          24
			zzhc.onRewarded(((com.google.android.gms.ads.reward.RewardItem) (new zzahh(zzagu))));
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field RewardedVideoAdListener zzhc>
	//    5   11:new             #49  <Class zzahh>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #51  <Method void zzahh(zzagu)>
	//    9   19:invokeinterface #55  <Method void RewardedVideoAdListener.onRewarded(com.google.android.gms.ads.reward.RewardItem)>
	//   10   24:return          
	}

	private RewardedVideoAdListener zzhc;
}
