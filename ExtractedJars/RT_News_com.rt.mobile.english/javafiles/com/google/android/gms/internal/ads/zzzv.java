// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.customtabs.CustomTabsIntent;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.mediation.*;
import com.google.android.gms.common.util.PlatformVersion;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzane, zzoh, zzzw, zzang, 
//			zzakk, zzzx, zzajm

public final class zzzv
	implements MediationInterstitialAdapter
{

	public zzzv()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	static MediationInterstitialListener zza(zzzv zzzv1)
	{
		return zzzv1.zzbvq;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field MediationInterstitialListener zzbvq>
	//    2    4:areturn         
	}

	static Activity zzb(zzzv zzzv1)
	{
		return zzzv1.zzbvp;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Activity zzbvp>
	//    2    4:areturn         
	}

	public final void onDestroy()
	{
		zzane.zzck("Destroying AdMobCustomTabsAdapter adapter.");
	//    0    0:ldc1            #29  <String "Destroying AdMobCustomTabsAdapter adapter.">
	//    1    2:invokestatic    #35  <Method void zzane.zzck(String)>
	//    2    5:return          
	}

	public final void onPause()
	{
		zzane.zzck("Pausing AdMobCustomTabsAdapter adapter.");
	//    0    0:ldc1            #38  <String "Pausing AdMobCustomTabsAdapter adapter.">
	//    1    2:invokestatic    #35  <Method void zzane.zzck(String)>
	//    2    5:return          
	}

	public final void onResume()
	{
		zzane.zzck("Resuming AdMobCustomTabsAdapter adapter.");
	//    0    0:ldc1            #41  <String "Resuming AdMobCustomTabsAdapter adapter.">
	//    1    2:invokestatic    #35  <Method void zzane.zzck(String)>
	//    2    5:return          
	}

	public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationinterstitiallistener, Bundle bundle, MediationAdRequest mediationadrequest, Bundle bundle1)
	{
		zzbvq = mediationinterstitiallistener;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #22  <Field MediationInterstitialListener zzbvq>
		if(zzbvq == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #22  <Field MediationInterstitialListener zzbvq>
	//*   5    9:ifnonnull       18
		{
			zzane.zzdk("Listener not set for mediation. Returning.");
	//    6   12:ldc1            #45  <String "Listener not set for mediation. Returning.">
	//    7   14:invokestatic    #48  <Method void zzane.zzdk(String)>
			return;
	//    8   17:return          
		}
		if(!(context instanceof Activity))
	//*   9   18:aload_1         
	//*  10   19:instanceof      #50  <Class Activity>
	//*  11   22:ifne            42
		{
			zzane.zzdk("AdMobCustomTabs can only work with Activity context. Bailing out.");
	//   12   25:ldc1            #52  <String "AdMobCustomTabs can only work with Activity context. Bailing out.">
	//   13   27:invokestatic    #48  <Method void zzane.zzdk(String)>
			zzbvq.onAdFailedToLoad(((MediationInterstitialAdapter) (this)), 0);
	//   14   30:aload_0         
	//   15   31:getfield        #22  <Field MediationInterstitialListener zzbvq>
	//   16   34:aload_0         
	//   17   35:iconst_0        
	//   18   36:invokeinterface #58  <Method void MediationInterstitialListener.onAdFailedToLoad(MediationInterstitialAdapter, int)>
			return;
	//   19   41:return          
		}
		boolean flag;
		if(PlatformVersion.isAtLeastIceCreamSandwichMR1() && zzoh.zzh(context))
	//*  20   42:invokestatic    #64  <Method boolean PlatformVersion.isAtLeastIceCreamSandwichMR1()>
	//*  21   45:ifeq            61
	//*  22   48:aload_1         
	//*  23   49:invokestatic    #70  <Method boolean zzoh.zzh(Context)>
	//*  24   52:ifeq            61
			flag = true;
	//   25   55:iconst_1        
	//   26   56:istore          6
		else
	//*  27   58:goto            64
			flag = false;
	//   28   61:iconst_0        
	//   29   62:istore          6
		if(!flag)
	//*  30   64:iload           6
	//*  31   66:ifne            86
		{
			zzane.zzdk("Default browser does not support custom tabs. Bailing out.");
	//   32   69:ldc1            #72  <String "Default browser does not support custom tabs. Bailing out.">
	//   33   71:invokestatic    #48  <Method void zzane.zzdk(String)>
			zzbvq.onAdFailedToLoad(((MediationInterstitialAdapter) (this)), 0);
	//   34   74:aload_0         
	//   35   75:getfield        #22  <Field MediationInterstitialListener zzbvq>
	//   36   78:aload_0         
	//   37   79:iconst_0        
	//   38   80:invokeinterface #58  <Method void MediationInterstitialListener.onAdFailedToLoad(MediationInterstitialAdapter, int)>
			return;
	//   39   85:return          
		}
		mediationinterstitiallistener = ((MediationInterstitialListener) (bundle.getString("tab_url")));
	//   40   86:aload_3         
	//   41   87:ldc1            #74  <String "tab_url">
	//   42   89:invokevirtual   #80  <Method String Bundle.getString(String)>
	//   43   92:astore_2        
		if(TextUtils.isEmpty(((CharSequence) (mediationinterstitiallistener))))
	//*  44   93:aload_2         
	//*  45   94:invokestatic    #86  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  46   97:ifeq            117
		{
			zzane.zzdk("The tab_url retrieved from mediation metadata is empty. Bailing out.");
	//   47  100:ldc1            #88  <String "The tab_url retrieved from mediation metadata is empty. Bailing out.">
	//   48  102:invokestatic    #48  <Method void zzane.zzdk(String)>
			zzbvq.onAdFailedToLoad(((MediationInterstitialAdapter) (this)), 0);
	//   49  105:aload_0         
	//   50  106:getfield        #22  <Field MediationInterstitialListener zzbvq>
	//   51  109:aload_0         
	//   52  110:iconst_0        
	//   53  111:invokeinterface #58  <Method void MediationInterstitialListener.onAdFailedToLoad(MediationInterstitialAdapter, int)>
			return;
	//   54  116:return          
		} else
		{
			zzbvp = (Activity)context;
	//   55  117:aload_0         
	//   56  118:aload_1         
	//   57  119:checkcast       #50  <Class Activity>
	//   58  122:putfield        #26  <Field Activity zzbvp>
			mUri = Uri.parse(((String) (mediationinterstitiallistener)));
	//   59  125:aload_0         
	//   60  126:aload_2         
	//   61  127:invokestatic    #94  <Method Uri Uri.parse(String)>
	//   62  130:putfield        #96  <Field Uri mUri>
			zzbvq.onAdLoaded(((MediationInterstitialAdapter) (this)));
	//   63  133:aload_0         
	//   64  134:getfield        #22  <Field MediationInterstitialListener zzbvq>
	//   65  137:aload_0         
	//   66  138:invokeinterface #100 <Method void MediationInterstitialListener.onAdLoaded(MediationInterstitialAdapter)>
			return;
	//   67  143:return          
		}
	}

	public final void showInterstitial()
	{
		Object obj = ((Object) ((new android.support.customtabs.CustomTabsIntent.Builder()).build()));
	//    0    0:new             #103 <Class android.support.customtabs.CustomTabsIntent$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #104 <Method void android.support.customtabs.CustomTabsIntent$Builder()>
	//    3    7:invokevirtual   #108 <Method CustomTabsIntent android.support.customtabs.CustomTabsIntent$Builder.build()>
	//    4   10:astore_1        
		((CustomTabsIntent) (obj)).intent.setData(mUri);
	//    5   11:aload_1         
	//    6   12:getfield        #114 <Field Intent CustomTabsIntent.intent>
	//    7   15:aload_0         
	//    8   16:getfield        #96  <Field Uri mUri>
	//    9   19:invokevirtual   #120 <Method Intent Intent.setData(Uri)>
	//   10   22:pop             
		obj = ((Object) (new AdOverlayInfoParcel(new zzc(((CustomTabsIntent) (obj)).intent), ((zzjd) (null)), ((com.google.android.gms.ads.internal.overlay.zzn) (new zzzw(this))), ((com.google.android.gms.ads.internal.overlay.zzt) (null)), new zzang(0, 0, false))));
	//   11   23:new             #122 <Class AdOverlayInfoParcel>
	//   12   26:dup             
	//   13   27:new             #124 <Class zzc>
	//   14   30:dup             
	//   15   31:aload_1         
	//   16   32:getfield        #114 <Field Intent CustomTabsIntent.intent>
	//   17   35:invokespecial   #127 <Method void zzc(Intent)>
	//   18   38:aconst_null     
	//   19   39:new             #129 <Class zzzw>
	//   20   42:dup             
	//   21   43:aload_0         
	//   22   44:invokespecial   #132 <Method void zzzw(zzzv)>
	//   23   47:aconst_null     
	//   24   48:new             #134 <Class zzang>
	//   25   51:dup             
	//   26   52:iconst_0        
	//   27   53:iconst_0        
	//   28   54:iconst_0        
	//   29   55:invokespecial   #137 <Method void zzang(int, int, boolean)>
	//   30   58:invokespecial   #140 <Method void AdOverlayInfoParcel(zzc, zzjd, com.google.android.gms.ads.internal.overlay.zzn, com.google.android.gms.ads.internal.overlay.zzt, zzang)>
	//   31   61:astore_1        
		zzakk.zzcrm.post(((Runnable) (new zzzx(this, ((AdOverlayInfoParcel) (obj))))));
	//   32   62:getstatic       #146 <Field Handler zzakk.zzcrm>
	//   33   65:new             #148 <Class zzzx>
	//   34   68:dup             
	//   35   69:aload_0         
	//   36   70:aload_1         
	//   37   71:invokespecial   #151 <Method void zzzx(zzzv, AdOverlayInfoParcel)>
	//   38   74:invokevirtual   #157 <Method boolean Handler.post(Runnable)>
	//   39   77:pop             
		zzbv.zzeo().zzqc();
	//   40   78:invokestatic    #163 <Method zzajm zzbv.zzeo()>
	//   41   81:invokevirtual   #168 <Method void zzajm.zzqc()>
	//   42   84:return          
	}

	private Uri mUri;
	private Activity zzbvp;
	private MediationInterstitialListener zzbvq;
}
