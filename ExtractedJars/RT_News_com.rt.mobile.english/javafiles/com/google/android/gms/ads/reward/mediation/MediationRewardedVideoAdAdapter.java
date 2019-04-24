// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.reward.mediation;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationAdapter;

// Referenced classes of package com.google.android.gms.ads.reward.mediation:
//			MediationRewardedVideoAdListener

public interface MediationRewardedVideoAdAdapter
	extends MediationAdapter
{

	public abstract void initialize(Context context, MediationAdRequest mediationadrequest, String s, MediationRewardedVideoAdListener mediationrewardedvideoadlistener, Bundle bundle, Bundle bundle1);

	public abstract boolean isInitialized();

	public abstract void loadAd(MediationAdRequest mediationadrequest, Bundle bundle, Bundle bundle1);

	public abstract void showVideo();

	public static final String CUSTOM_EVENT_SERVER_PARAMETER_FIELD = "parameter";
}
