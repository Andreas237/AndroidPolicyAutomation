// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.reward.mediation;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.a;
import com.google.android.gms.ads.mediation.b;

// Referenced classes of package com.google.android.gms.ads.reward.mediation:
//			a

public interface MediationRewardedVideoAdAdapter
	extends b
{

	public abstract void initialize(Context context, a a, String s, com.google.android.gms.ads.reward.mediation.a a1, Bundle bundle, Bundle bundle1);

	public abstract boolean isInitialized();

	public abstract void loadAd(a a, Bundle bundle, Bundle bundle1);

	public abstract void showVideo();

	public static final String CUSTOM_EVENT_SERVER_PARAMETER_FIELD = "parameter";
}
