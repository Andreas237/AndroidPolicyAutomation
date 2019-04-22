// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.reward.zza;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzjd;
import com.google.android.gms.internal.ads.zzma;

// Referenced classes of package com.google.android.gms.ads:
//			AdRequest, AdListener

public final class InterstitialAd
{

	public InterstitialAd(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		zzuv = new zzma(context);
	//    2    4:aload_0         
	//    3    5:new             #13  <Class zzma>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #15  <Method void zzma(Context)>
	//    7   13:putfield        #17  <Field zzma zzuv>
		Preconditions.checkNotNull(((Object) (context)), "Context cannot be null");
	//    8   16:aload_1         
	//    9   17:ldc1            #19  <String "Context cannot be null">
	//   10   19:invokestatic    #25  <Method Object Preconditions.checkNotNull(Object, Object)>
	//   11   22:pop             
	//   12   23:return          
	}

	public final AdListener getAdListener()
	{
		return zzuv.getAdListener();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzma zzuv>
	//    2    4:invokevirtual   #30  <Method AdListener zzma.getAdListener()>
	//    3    7:areturn         
	}

	public final String getAdUnitId()
	{
		return zzuv.getAdUnitId();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzma zzuv>
	//    2    4:invokevirtual   #34  <Method String zzma.getAdUnitId()>
	//    3    7:areturn         
	}

	public final String getMediationAdapterClassName()
	{
		return zzuv.getMediationAdapterClassName();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzma zzuv>
	//    2    4:invokevirtual   #37  <Method String zzma.getMediationAdapterClassName()>
	//    3    7:areturn         
	}

	public final boolean isLoaded()
	{
		return zzuv.isLoaded();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzma zzuv>
	//    2    4:invokevirtual   #41  <Method boolean zzma.isLoaded()>
	//    3    7:ireturn         
	}

	public final boolean isLoading()
	{
		return zzuv.isLoading();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzma zzuv>
	//    2    4:invokevirtual   #44  <Method boolean zzma.isLoading()>
	//    3    7:ireturn         
	}

	public final void loadAd(AdRequest adrequest)
	{
		zzuv.zza(adrequest.zzay());
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzma zzuv>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #55  <Method com.google.android.gms.internal.ads.zzlw AdRequest.zzay()>
	//    4    8:invokevirtual   #59  <Method void zzma.zza(com.google.android.gms.internal.ads.zzlw)>
	//    5   11:return          
	}

	public final void setAdListener(AdListener adlistener)
	{
		zzuv.setAdListener(adlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzma zzuv>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #64  <Method void zzma.setAdListener(AdListener)>
		if(adlistener != null && (adlistener instanceof zzjd))
	//*   4    8:aload_1         
	//*   5    9:ifnull          31
	//*   6   12:aload_1         
	//*   7   13:instanceof      #66  <Class zzjd>
	//*   8   16:ifeq            31
		{
			zzuv.zza((zzjd)adlistener);
	//    9   19:aload_0         
	//   10   20:getfield        #17  <Field zzma zzuv>
	//   11   23:aload_1         
	//   12   24:checkcast       #66  <Class zzjd>
	//   13   27:invokevirtual   #69  <Method void zzma.zza(zzjd)>
			return;
	//   14   30:return          
		}
		if(adlistener == null)
	//*  15   31:aload_1         
	//*  16   32:ifnonnull       43
			zzuv.zza(((zzjd) (null)));
	//   17   35:aload_0         
	//   18   36:getfield        #17  <Field zzma zzuv>
	//   19   39:aconst_null     
	//   20   40:invokevirtual   #69  <Method void zzma.zza(zzjd)>
	//   21   43:return          
	}

	public final void setAdUnitId(String s)
	{
		zzuv.setAdUnitId(s);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzma zzuv>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #73  <Method void zzma.setAdUnitId(String)>
	//    4    8:return          
	}

	public final void setImmersiveMode(boolean flag)
	{
		zzuv.setImmersiveMode(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzma zzuv>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #77  <Method void zzma.setImmersiveMode(boolean)>
	//    4    8:return          
	}

	public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedvideoadlistener)
	{
		zzuv.setRewardedVideoAdListener(rewardedvideoadlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzma zzuv>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #81  <Method void zzma.setRewardedVideoAdListener(RewardedVideoAdListener)>
	//    4    8:return          
	}

	public final void show()
	{
		zzuv.show();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzma zzuv>
	//    2    4:invokevirtual   #84  <Method void zzma.show()>
	//    3    7:return          
	}

	public final void zza(zza zza1)
	{
		zzuv.zza(zza1);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzma zzuv>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #87  <Method void zzma.zza(zza)>
	//    4    8:return          
	}

	public final void zza(boolean flag)
	{
		zzuv.zza(true);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzma zzuv>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #89  <Method void zzma.zza(boolean)>
	//    4    8:return          
	}

	public final Bundle zzba()
	{
		return zzuv.zzba();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzma zzuv>
	//    2    4:invokevirtual   #93  <Method Bundle zzma.zzba()>
	//    3    7:areturn         
	}

	private final zzma zzuv;
}
