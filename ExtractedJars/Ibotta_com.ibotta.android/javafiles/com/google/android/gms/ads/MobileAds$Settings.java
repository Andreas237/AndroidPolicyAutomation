// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzmd;

// Referenced classes of package com.google.android.gms.ads:
//			MobileAds

public static final class MobileAds$Settings
{

	public final String getTrackingId()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final boolean isGoogleAnalyticsEnabled()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final MobileAds$Settings setGoogleAnalyticsEnabled(boolean flag)
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public final MobileAds$Settings setTrackingId(String s)
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	final zzmd zzbb()
	{
		return zzuw;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzmd zzuw>
	//    2    4:areturn         
	}

	private final zzmd zzuw = new zzmd();

	public MobileAds$Settings()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #15  <Class zzmd>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void zzmd()>
	//    6   12:putfield        #18  <Field zzmd zzuw>
	//    7   15:return          
	}
}
