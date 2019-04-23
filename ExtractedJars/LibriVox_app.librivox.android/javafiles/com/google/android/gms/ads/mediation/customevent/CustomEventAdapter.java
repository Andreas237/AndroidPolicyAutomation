// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.a;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.e;
import com.google.android.gms.ads.mediation.f;
import com.google.android.gms.ads.mediation.j;
import com.google.android.gms.internal.ads.aag;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//			CustomEventBanner, CustomEventInterstitial, CustomEventNative, b, 
//			c, d

public final class CustomEventAdapter
	implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter
{

	public CustomEventAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}

	private static Object a(String s)
	{
		Object obj;
		try
		{
			obj = Class.forName(s).newInstance();
	//    0    0:aload_0         
	//    1    1:invokestatic    #33  <Method Class Class.forName(String)>
	//    2    4:invokevirtual   #37  <Method Object Class.newInstance()>
	//    3    7:astore_1        
		}
	//*   4    8:aload_1         
	//*   5    9:areturn         
		catch(Throwable throwable)
	//*   6   10:astore_1        
		{
			String s1 = throwable.getMessage();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #41  <Method String Throwable.getMessage()>
	//    9   15:astore_1        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 46 + String.valueOf(((Object) (s1))).length());
	//   10   16:new             #43  <Class StringBuilder>
	//   11   19:dup             
	//   12   20:aload_0         
	//   13   21:invokestatic    #49  <Method String String.valueOf(Object)>
	//   14   24:invokevirtual   #53  <Method int String.length()>
	//   15   27:bipush          46
	//   16   29:iadd            
	//   17   30:aload_1         
	//   18   31:invokestatic    #49  <Method String String.valueOf(Object)>
	//   19   34:invokevirtual   #53  <Method int String.length()>
	//   20   37:iadd            
	//   21   38:invokespecial   #56  <Method void StringBuilder(int)>
	//   22   41:astore_2        
			stringbuilder.append("Could not instantiate custom event adapter: ");
	//   23   42:aload_2         
	//   24   43:ldc1            #58  <String "Could not instantiate custom event adapter: ">
	//   25   45:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   26   48:pop             
			stringbuilder.append(s);
	//   27   49:aload_2         
	//   28   50:aload_0         
	//   29   51:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   30   54:pop             
			stringbuilder.append(". ");
	//   31   55:aload_2         
	//   32   56:ldc1            #64  <String ". ">
	//   33   58:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   34   61:pop             
			stringbuilder.append(s1);
	//   35   62:aload_2         
	//   36   63:aload_1         
	//   37   64:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   38   67:pop             
			aag.e(stringbuilder.toString());
	//   39   68:aload_2         
	//   40   69:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   41   72:invokestatic    #73  <Method void aag.e(String)>
			return ((Object) (null));
	//   42   75:aconst_null     
	//   43   76:areturn         
		}
		return obj;
	}

	public final View getBannerView()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field View a>
	//    2    4:areturn         
	}

	public final void onDestroy()
	{
		Object obj = ((Object) (b));
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field CustomEventBanner b>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			((CustomEventBanner) (obj)).a();
	//    5    9:aload_1         
	//    6   10:invokeinterface #84  <Method void com.google.android.gms.ads.mediation.customevent.CustomEventBanner.a()>
		obj = ((Object) (c));
	//    7   15:aload_0         
	//    8   16:getfield        #86  <Field CustomEventInterstitial c>
	//    9   19:astore_1        
		if(obj != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          30
			((CustomEventInterstitial) (obj)).a();
	//   12   24:aload_1         
	//   13   25:invokeinterface #89  <Method void com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial.a()>
		obj = ((Object) (d));
	//   14   30:aload_0         
	//   15   31:getfield        #91  <Field CustomEventNative d>
	//   16   34:astore_1        
		if(obj != null)
	//*  17   35:aload_1         
	//*  18   36:ifnull          45
			((CustomEventNative) (obj)).a();
	//   19   39:aload_1         
	//   20   40:invokeinterface #94  <Method void com.google.android.gms.ads.mediation.customevent.CustomEventNative.a()>
	//   21   45:return          
	}

	public final void onPause()
	{
		Object obj = ((Object) (b));
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field CustomEventBanner b>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			((CustomEventBanner) (obj)).b();
	//    5    9:aload_1         
	//    6   10:invokeinterface #97  <Method void CustomEventBanner.b()>
		obj = ((Object) (c));
	//    7   15:aload_0         
	//    8   16:getfield        #86  <Field CustomEventInterstitial c>
	//    9   19:astore_1        
		if(obj != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          30
			((CustomEventInterstitial) (obj)).b();
	//   12   24:aload_1         
	//   13   25:invokeinterface #98  <Method void CustomEventInterstitial.b()>
		obj = ((Object) (d));
	//   14   30:aload_0         
	//   15   31:getfield        #91  <Field CustomEventNative d>
	//   16   34:astore_1        
		if(obj != null)
	//*  17   35:aload_1         
	//*  18   36:ifnull          45
			((CustomEventNative) (obj)).b();
	//   19   39:aload_1         
	//   20   40:invokeinterface #99  <Method void CustomEventNative.b()>
	//   21   45:return          
	}

	public final void onResume()
	{
		Object obj = ((Object) (b));
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field CustomEventBanner b>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			((CustomEventBanner) (obj)).c();
	//    5    9:aload_1         
	//    6   10:invokeinterface #102 <Method void CustomEventBanner.c()>
		obj = ((Object) (c));
	//    7   15:aload_0         
	//    8   16:getfield        #86  <Field CustomEventInterstitial c>
	//    9   19:astore_1        
		if(obj != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          30
			((CustomEventInterstitial) (obj)).c();
	//   12   24:aload_1         
	//   13   25:invokeinterface #103 <Method void CustomEventInterstitial.c()>
		obj = ((Object) (d));
	//   14   30:aload_0         
	//   15   31:getfield        #91  <Field CustomEventNative d>
	//   16   34:astore_1        
		if(obj != null)
	//*  17   35:aload_1         
	//*  18   36:ifnull          45
			((CustomEventNative) (obj)).c();
	//   19   39:aload_1         
	//   20   40:invokeinterface #104 <Method void CustomEventNative.c()>
	//   21   45:return          
	}

	public final void requestBannerAd(Context context, d d1, Bundle bundle, com.google.android.gms.ads.f f1, a a1, Bundle bundle1)
	{
		b = (CustomEventBanner)a(bundle.getString("class_name"));
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:ldc1            #108 <String "class_name">
	//    3    4:invokevirtual   #114 <Method String Bundle.getString(String)>
	//    4    7:invokestatic    #116 <Method Object a(String)>
	//    5   10:checkcast       #82  <Class CustomEventBanner>
	//    6   13:putfield        #80  <Field CustomEventBanner b>
		if(b == null)
	//*   7   16:aload_0         
	//*   8   17:getfield        #80  <Field CustomEventBanner b>
	//*   9   20:ifnonnull       32
		{
			d1.a(((MediationBannerAdapter) (this)), 0);
	//   10   23:aload_2         
	//   11   24:aload_0         
	//   12   25:iconst_0        
	//   13   26:invokeinterface #121 <Method void d.a(MediationBannerAdapter, int)>
			return;
	//   14   31:return          
		}
		if(bundle1 == null)
	//*  15   32:aload           6
	//*  16   34:ifnonnull       43
			bundle1 = null;
	//   17   37:aconst_null     
	//   18   38:astore          6
		else
	//*  19   40:goto            56
			bundle1 = bundle1.getBundle(bundle.getString("class_name"));
	//   20   43:aload           6
	//   21   45:aload_3         
	//   22   46:ldc1            #108 <String "class_name">
	//   23   48:invokevirtual   #114 <Method String Bundle.getString(String)>
	//   24   51:invokevirtual   #125 <Method Bundle Bundle.getBundle(String)>
	//   25   54:astore          6
		b.requestBannerAd(context, ((com.google.android.gms.ads.mediation.customevent.e) (new b(this, d1))), bundle.getString("parameter"), f1, a1, bundle1);
	//   26   56:aload_0         
	//   27   57:getfield        #80  <Field CustomEventBanner b>
	//   28   60:aload_1         
	//   29   61:new             #127 <Class b>
	//   30   64:dup             
	//   31   65:aload_0         
	//   32   66:aload_2         
	//   33   67:invokespecial   #130 <Method void b(CustomEventAdapter, d)>
	//   34   70:aload_3         
	//   35   71:ldc1            #132 <String "parameter">
	//   36   73:invokevirtual   #114 <Method String Bundle.getString(String)>
	//   37   76:aload           4
	//   38   78:aload           5
	//   39   80:aload           6
	//   40   82:invokeinterface #135 <Method void CustomEventBanner.requestBannerAd(Context, com.google.android.gms.ads.mediation.customevent.e, String, com.google.android.gms.ads.f, a, Bundle)>
	//   41   87:return          
	}

	public final void requestInterstitialAd(Context context, e e1, Bundle bundle, a a1, Bundle bundle1)
	{
		c = (CustomEventInterstitial)a(bundle.getString("class_name"));
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:ldc1            #108 <String "class_name">
	//    3    4:invokevirtual   #114 <Method String Bundle.getString(String)>
	//    4    7:invokestatic    #116 <Method Object a(String)>
	//    5   10:checkcast       #88  <Class CustomEventInterstitial>
	//    6   13:putfield        #86  <Field CustomEventInterstitial c>
		if(c == null)
	//*   7   16:aload_0         
	//*   8   17:getfield        #86  <Field CustomEventInterstitial c>
	//*   9   20:ifnonnull       32
		{
			e1.a(((MediationInterstitialAdapter) (this)), 0);
	//   10   23:aload_2         
	//   11   24:aload_0         
	//   12   25:iconst_0        
	//   13   26:invokeinterface #142 <Method void e.a(MediationInterstitialAdapter, int)>
			return;
	//   14   31:return          
		}
		if(bundle1 == null)
	//*  15   32:aload           5
	//*  16   34:ifnonnull       43
			bundle1 = null;
	//   17   37:aconst_null     
	//   18   38:astore          5
		else
	//*  19   40:goto            56
			bundle1 = bundle1.getBundle(bundle.getString("class_name"));
	//   20   43:aload           5
	//   21   45:aload_3         
	//   22   46:ldc1            #108 <String "class_name">
	//   23   48:invokevirtual   #114 <Method String Bundle.getString(String)>
	//   24   51:invokevirtual   #125 <Method Bundle Bundle.getBundle(String)>
	//   25   54:astore          5
		c.requestInterstitialAd(context, ((g) (new c(this, this, e1))), bundle.getString("parameter"), a1, bundle1);
	//   26   56:aload_0         
	//   27   57:getfield        #86  <Field CustomEventInterstitial c>
	//   28   60:aload_1         
	//   29   61:new             #144 <Class c>
	//   30   64:dup             
	//   31   65:aload_0         
	//   32   66:aload_0         
	//   33   67:aload_2         
	//   34   68:invokespecial   #147 <Method void c(CustomEventAdapter, CustomEventAdapter, e)>
	//   35   71:aload_3         
	//   36   72:ldc1            #132 <String "parameter">
	//   37   74:invokevirtual   #114 <Method String Bundle.getString(String)>
	//   38   77:aload           4
	//   39   79:aload           5
	//   40   81:invokeinterface #150 <Method void CustomEventInterstitial.requestInterstitialAd(Context, g, String, a, Bundle)>
	//   41   86:return          
	}

	public final void requestNativeAd(Context context, f f1, Bundle bundle, j j, Bundle bundle1)
	{
		d = (CustomEventNative)a(bundle.getString("class_name"));
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:ldc1            #108 <String "class_name">
	//    3    4:invokevirtual   #114 <Method String Bundle.getString(String)>
	//    4    7:invokestatic    #116 <Method Object a(String)>
	//    5   10:checkcast       #93  <Class CustomEventNative>
	//    6   13:putfield        #91  <Field CustomEventNative d>
		if(d == null)
	//*   7   16:aload_0         
	//*   8   17:getfield        #91  <Field CustomEventNative d>
	//*   9   20:ifnonnull       32
		{
			f1.a(((MediationNativeAdapter) (this)), 0);
	//   10   23:aload_2         
	//   11   24:aload_0         
	//   12   25:iconst_0        
	//   13   26:invokeinterface #157 <Method void f.a(MediationNativeAdapter, int)>
			return;
	//   14   31:return          
		}
		if(bundle1 == null)
	//*  15   32:aload           5
	//*  16   34:ifnonnull       43
			bundle1 = null;
	//   17   37:aconst_null     
	//   18   38:astore          5
		else
	//*  19   40:goto            56
			bundle1 = bundle1.getBundle(bundle.getString("class_name"));
	//   20   43:aload           5
	//   21   45:aload_3         
	//   22   46:ldc1            #108 <String "class_name">
	//   23   48:invokevirtual   #114 <Method String Bundle.getString(String)>
	//   24   51:invokevirtual   #125 <Method Bundle Bundle.getBundle(String)>
	//   25   54:astore          5
		d.requestNativeAd(context, ((h) (new com.google.android.gms.ads.mediation.customevent.d(this, f1))), bundle.getString("parameter"), j, bundle1);
	//   26   56:aload_0         
	//   27   57:getfield        #91  <Field CustomEventNative d>
	//   28   60:aload_1         
	//   29   61:new             #159 <Class com.google.android.gms.ads.mediation.customevent.d>
	//   30   64:dup             
	//   31   65:aload_0         
	//   32   66:aload_2         
	//   33   67:invokespecial   #162 <Method void com.google.android.gms.ads.mediation.customevent.d(CustomEventAdapter, f)>
	//   34   70:aload_3         
	//   35   71:ldc1            #132 <String "parameter">
	//   36   73:invokevirtual   #114 <Method String Bundle.getString(String)>
	//   37   76:aload           4
	//   38   78:aload           5
	//   39   80:invokeinterface #165 <Method void CustomEventNative.requestNativeAd(Context, h, String, j, Bundle)>
	//   40   85:return          
	}

	public final void showInterstitial()
	{
		c.showInterstitial();
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field CustomEventInterstitial c>
	//    2    4:invokeinterface #168 <Method void CustomEventInterstitial.showInterstitial()>
	//    3    9:return          
	}

	private View a;
	private CustomEventBanner b;
	private CustomEventInterstitial c;
	private CustomEventNative d;
}
