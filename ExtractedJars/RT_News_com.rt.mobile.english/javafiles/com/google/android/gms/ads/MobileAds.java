// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.internal.ads.zzmb;
import com.google.android.gms.internal.ads.zzmd;

public class MobileAds
{
	public static final class Settings
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

		public final Settings setGoogleAnalyticsEnabled(boolean flag)
		{
			return this;
		//    0    0:aload_0         
		//    1    1:areturn         
		}

		public final Settings setTrackingId(String s)
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

		public Settings()
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


	private MobileAds()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static RewardedVideoAd getRewardedVideoAdInstance(Context context)
	{
		return zzmb.zziv().getRewardedVideoAdInstance(context);
	//    0    0:invokestatic    #20  <Method zzmb zzmb.zziv()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #22  <Method RewardedVideoAd zzmb.getRewardedVideoAdInstance(Context)>
	//    3    7:areturn         
	}

	public static void initialize(Context context)
	{
		initialize(context, ((String) (null)), ((Settings) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:invokestatic    #27  <Method void initialize(Context, String, MobileAds$Settings)>
	//    4    6:return          
	}

	public static void initialize(Context context, String s)
	{
		initialize(context, s, ((Settings) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #27  <Method void initialize(Context, String, MobileAds$Settings)>
	//    4    6:return          
	}

	public static void initialize(Context context, String s, Settings settings)
	{
		zzmb zzmb1 = zzmb.zziv();
	//    0    0:invokestatic    #20  <Method zzmb zzmb.zziv()>
	//    1    3:astore_3        
		if(settings == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       13
			settings = null;
	//    4    8:aconst_null     
	//    5    9:astore_2        
		else
	//*   6   10:goto            18
			settings = ((Settings) (settings.zzbb()));
	//    7   13:aload_2         
	//    8   14:invokevirtual   #37  <Method zzmd MobileAds$Settings.zzbb()>
	//    9   17:astore_2        
		zzmb1.zza(context, s, ((zzmd) (settings)));
	//   10   18:aload_3         
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:aload_2         
	//   14   22:invokevirtual   #41  <Method void zzmb.zza(Context, String, zzmd)>
	//   15   25:return          
	}

	public static void openDebugMenu(Context context, String s)
	{
		zzmb.zziv().openDebugMenu(context, s);
	//    0    0:invokestatic    #20  <Method zzmb zzmb.zziv()>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokevirtual   #45  <Method void zzmb.openDebugMenu(Context, String)>
	//    4    8:return          
	}

	public static void setAppMuted(boolean flag)
	{
		zzmb.zziv().setAppMuted(flag);
	//    0    0:invokestatic    #20  <Method zzmb zzmb.zziv()>
	//    1    3:iload_0         
	//    2    4:invokevirtual   #49  <Method void zzmb.setAppMuted(boolean)>
	//    3    7:return          
	}

	public static void setAppVolume(float f)
	{
		zzmb.zziv().setAppVolume(f);
	//    0    0:invokestatic    #20  <Method zzmb zzmb.zziv()>
	//    1    3:fload_0         
	//    2    4:invokevirtual   #53  <Method void zzmb.setAppVolume(float)>
	//    3    7:return          
	}
}
