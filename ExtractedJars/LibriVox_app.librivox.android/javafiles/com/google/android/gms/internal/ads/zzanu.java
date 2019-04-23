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
import android.support.c.h;
import android.support.c.j;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.mediation.*;
import com.google.android.gms.common.util.o;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aag, an, ms, zzbbi, 
//			xg, mt, wi

public final class zzanu
	implements MediationInterstitialAdapter
{

	public zzanu()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	static e a(zzanu zzanu1)
	{
		return zzanu1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field e b>
	//    2    4:areturn         
	}

	static Activity b(zzanu zzanu1)
	{
		return zzanu1.a;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Activity a>
	//    2    4:areturn         
	}

	public final void onDestroy()
	{
		aag.b("Destroying AdMobCustomTabsAdapter adapter.");
	//    0    0:ldc1            #27  <String "Destroying AdMobCustomTabsAdapter adapter.">
	//    1    2:invokestatic    #32  <Method void aag.b(String)>
	//    2    5:return          
	}

	public final void onPause()
	{
		aag.b("Pausing AdMobCustomTabsAdapter adapter.");
	//    0    0:ldc1            #35  <String "Pausing AdMobCustomTabsAdapter adapter.">
	//    1    2:invokestatic    #32  <Method void aag.b(String)>
	//    2    5:return          
	}

	public final void onResume()
	{
		aag.b("Resuming AdMobCustomTabsAdapter adapter.");
	//    0    0:ldc1            #38  <String "Resuming AdMobCustomTabsAdapter adapter.">
	//    1    2:invokestatic    #32  <Method void aag.b(String)>
	//    2    5:return          
	}

	public final void requestInterstitialAd(Context context, e e1, Bundle bundle, a a1, Bundle bundle1)
	{
		b = e1;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #21  <Field e b>
		if(b == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #21  <Field e b>
	//*   5    9:ifnonnull       18
		{
			com.google.android.gms.internal.ads.aag.e("Listener not set for mediation. Returning.");
	//    6   12:ldc1            #42  <String "Listener not set for mediation. Returning.">
	//    7   14:invokestatic    #45  <Method void com.google.android.gms.internal.ads.aag.e(String)>
			return;
	//    8   17:return          
		}
		if(!(context instanceof Activity))
	//*   9   18:aload_1         
	//*  10   19:instanceof      #47  <Class Activity>
	//*  11   22:ifne            42
		{
			com.google.android.gms.internal.ads.aag.e("AdMobCustomTabs can only work with Activity context. Bailing out.");
	//   12   25:ldc1            #49  <String "AdMobCustomTabs can only work with Activity context. Bailing out.">
	//   13   27:invokestatic    #45  <Method void com.google.android.gms.internal.ads.aag.e(String)>
			b.a(((MediationInterstitialAdapter) (this)), 0);
	//   14   30:aload_0         
	//   15   31:getfield        #21  <Field e b>
	//   16   34:aload_0         
	//   17   35:iconst_0        
	//   18   36:invokeinterface #54  <Method void e.a(MediationInterstitialAdapter, int)>
			return;
	//   19   41:return          
		}
		boolean flag;
		if(o.b() && com.google.android.gms.internal.ads.an.a(context))
	//*  20   42:invokestatic    #59  <Method boolean o.b()>
	//*  21   45:ifeq            61
	//*  22   48:aload_1         
	//*  23   49:invokestatic    #64  <Method boolean com.google.android.gms.internal.ads.an.a(Context)>
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
			com.google.android.gms.internal.ads.aag.e("Default browser does not support custom tabs. Bailing out.");
	//   32   69:ldc1            #66  <String "Default browser does not support custom tabs. Bailing out.">
	//   33   71:invokestatic    #45  <Method void com.google.android.gms.internal.ads.aag.e(String)>
			b.a(((MediationInterstitialAdapter) (this)), 0);
	//   34   74:aload_0         
	//   35   75:getfield        #21  <Field e b>
	//   36   78:aload_0         
	//   37   79:iconst_0        
	//   38   80:invokeinterface #54  <Method void e.a(MediationInterstitialAdapter, int)>
			return;
	//   39   85:return          
		}
		e1 = ((e) (bundle.getString("tab_url")));
	//   40   86:aload_3         
	//   41   87:ldc1            #68  <String "tab_url">
	//   42   89:invokevirtual   #74  <Method String Bundle.getString(String)>
	//   43   92:astore_2        
		if(TextUtils.isEmpty(((CharSequence) (e1))))
	//*  44   93:aload_2         
	//*  45   94:invokestatic    #80  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  46   97:ifeq            117
		{
			com.google.android.gms.internal.ads.aag.e("The tab_url retrieved from mediation metadata is empty. Bailing out.");
	//   47  100:ldc1            #82  <String "The tab_url retrieved from mediation metadata is empty. Bailing out.">
	//   48  102:invokestatic    #45  <Method void com.google.android.gms.internal.ads.aag.e(String)>
			b.a(((MediationInterstitialAdapter) (this)), 0);
	//   49  105:aload_0         
	//   50  106:getfield        #21  <Field e b>
	//   51  109:aload_0         
	//   52  110:iconst_0        
	//   53  111:invokeinterface #54  <Method void e.a(MediationInterstitialAdapter, int)>
			return;
	//   54  116:return          
		} else
		{
			a = (Activity)context;
	//   55  117:aload_0         
	//   56  118:aload_1         
	//   57  119:checkcast       #47  <Class Activity>
	//   58  122:putfield        #24  <Field Activity a>
			c = Uri.parse(((String) (e1)));
	//   59  125:aload_0         
	//   60  126:aload_2         
	//   61  127:invokestatic    #88  <Method Uri Uri.parse(String)>
	//   62  130:putfield        #90  <Field Uri c>
			b.a(((MediationInterstitialAdapter) (this)));
	//   63  133:aload_0         
	//   64  134:getfield        #21  <Field e b>
	//   65  137:aload_0         
	//   66  138:invokeinterface #93  <Method void e.a(MediationInterstitialAdapter)>
			return;
	//   67  143:return          
		}
	}

	public final void showInterstitial()
	{
		Object obj = ((Object) ((new j()).a()));
	//    0    0:new             #96  <Class j>
	//    1    3:dup             
	//    2    4:invokespecial   #97  <Method void j()>
	//    3    7:invokevirtual   #100 <Method h j.a()>
	//    4   10:astore_1        
		((h) (obj)).a.setData(c);
	//    5   11:aload_1         
	//    6   12:getfield        #105 <Field Intent h.a>
	//    7   15:aload_0         
	//    8   16:getfield        #90  <Field Uri c>
	//    9   19:invokevirtual   #111 <Method Intent Intent.setData(Uri)>
	//   10   22:pop             
		obj = ((Object) (new AdOverlayInfoParcel(new zzc(((h) (obj)).a), ((bvm) (null)), ((com.google.android.gms.ads.internal.overlay.m) (new ms(this))), ((com.google.android.gms.ads.internal.overlay.s) (null)), new zzbbi(0, 0, false))));
	//   11   23:new             #113 <Class AdOverlayInfoParcel>
	//   12   26:dup             
	//   13   27:new             #115 <Class zzc>
	//   14   30:dup             
	//   15   31:aload_1         
	//   16   32:getfield        #105 <Field Intent h.a>
	//   17   35:invokespecial   #118 <Method void zzc(Intent)>
	//   18   38:aconst_null     
	//   19   39:new             #120 <Class ms>
	//   20   42:dup             
	//   21   43:aload_0         
	//   22   44:invokespecial   #123 <Method void ms(zzanu)>
	//   23   47:aconst_null     
	//   24   48:new             #125 <Class zzbbi>
	//   25   51:dup             
	//   26   52:iconst_0        
	//   27   53:iconst_0        
	//   28   54:iconst_0        
	//   29   55:invokespecial   #128 <Method void zzbbi(int, int, boolean)>
	//   30   58:invokespecial   #131 <Method void AdOverlayInfoParcel(zzc, bvm, com.google.android.gms.ads.internal.overlay.m, com.google.android.gms.ads.internal.overlay.s, zzbbi)>
	//   31   61:astore_1        
		com.google.android.gms.internal.ads.xg.a.post(((Runnable) (new mt(this, ((AdOverlayInfoParcel) (obj))))));
	//   32   62:getstatic       #136 <Field Handler com.google.android.gms.internal.ads.xg.a>
	//   33   65:new             #138 <Class mt>
	//   34   68:dup             
	//   35   69:aload_0         
	//   36   70:aload_1         
	//   37   71:invokespecial   #141 <Method void mt(zzanu, AdOverlayInfoParcel)>
	//   38   74:invokevirtual   #147 <Method boolean Handler.post(Runnable)>
	//   39   77:pop             
		aw.i().e();
	//   40   78:invokestatic    #153 <Method wi aw.i()>
	//   41   81:invokevirtual   #157 <Method void com.google.android.gms.internal.ads.wi.e()>
	//   42   84:return          
	}

	private Activity a;
	private e b;
	private Uri c;
}
