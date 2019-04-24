// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.nativead;

import android.content.Context;
import com.startapp.android.publish.adsCommon.Ad;
import com.startapp.android.publish.adsCommon.a.b;
import com.startapp.android.publish.adsCommon.a.e;
import com.startapp.android.publish.adsCommon.a.f;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.adsCommon.adinformation.a;
import com.startapp.android.publish.adsCommon.c;
import com.startapp.android.publish.common.model.AdDetails;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.Constants;
import com.startapp.common.a.g;
import com.startapp.common.a.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.startapp.android.publish.ads.nativead:
//			NativeAdDetails, b, NativeAdPreferences

public class StartAppNativeAd extends Ad
	implements NativeAdDetails.a
{
	private class a
		implements AdEventListener
	{

		public AdEventListener a()
		{
			return b;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field AdEventListener b>
		//    2    4:areturn         
		}

		public void onFailedToReceiveAd(Ad ad)
		{
			g.a("StartAppNativeAd", 3, "NativeAd Failed to load");
		//    0    0:ldc1            #32  <String "StartAppNativeAd">
		//    1    2:iconst_3        
		//    2    3:ldc1            #34  <String "NativeAd Failed to load">
		//    3    5:invokestatic    #39  <Method void g.a(String, int, String)>
			a.setErrorMessage(ad.getErrorMessage());
		//    4    8:aload_0         
		//    5    9:getfield        #16  <Field StartAppNativeAd a>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #45  <Method String Ad.getErrorMessage()>
		//    8   16:invokevirtual   #49  <Method void StartAppNativeAd.setErrorMessage(String)>
			if(b != null)
		//*   9   19:aload_0         
		//*  10   20:getfield        #21  <Field AdEventListener b>
		//*  11   23:ifnull          44
			{
				b.onFailedToReceiveAd(((Ad) (a)));
		//   12   26:aload_0         
		//   13   27:getfield        #21  <Field AdEventListener b>
		//   14   30:aload_0         
		//   15   31:getfield        #16  <Field StartAppNativeAd a>
		//   16   34:invokeinterface #51  <Method void AdEventListener.onFailedToReceiveAd(Ad)>
				b = null;
		//   17   39:aload_0         
		//   18   40:aconst_null     
		//   19   41:putfield        #21  <Field AdEventListener b>
			}
			a.isLoading = false;
		//   20   44:aload_0         
		//   21   45:getfield        #16  <Field StartAppNativeAd a>
		//   22   48:iconst_0        
		//   23   49:putfield        #55  <Field boolean StartAppNativeAd.isLoading>
			a.initNativeAdList();
		//   24   52:aload_0         
		//   25   53:getfield        #16  <Field StartAppNativeAd a>
		//   26   56:invokevirtual   #58  <Method void StartAppNativeAd.initNativeAdList()>
		//   27   59:return          
		}

		public void onReceiveAd(Ad ad)
		{
			g.a("StartAppNativeAd", 3, "NativeAd Received");
		//    0    0:ldc1            #32  <String "StartAppNativeAd">
		//    1    2:iconst_3        
		//    2    3:ldc1            #61  <String "NativeAd Received">
		//    3    5:invokestatic    #39  <Method void g.a(String, int, String)>
			a.initNativeAdList();
		//    4    8:aload_0         
		//    5    9:getfield        #16  <Field StartAppNativeAd a>
		//    6   12:invokevirtual   #58  <Method void StartAppNativeAd.initNativeAdList()>
		//    7   15:return          
		}

		final StartAppNativeAd a;
		private AdEventListener b;

		public a(AdEventListener adeventlistener)
		{
			a = StartAppNativeAd.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field StartAppNativeAd a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void Object()>
			b = null;
		//    5    9:aload_0         
		//    6   10:aconst_null     
		//    7   11:putfield        #21  <Field AdEventListener b>
			b = ((AdEventListener) (new com.startapp.android.publish.adsCommon.adListeners.b(adeventlistener)));
		//    8   14:aload_0         
		//    9   15:new             #23  <Class com.startapp.android.publish.adsCommon.adListeners.b>
		//   10   18:dup             
		//   11   19:aload_2         
		//   12   20:invokespecial   #26  <Method void com.startapp.android.publish.adsCommon.adListeners.b(AdEventListener)>
		//   13   23:putfield        #21  <Field AdEventListener b>
		//   14   26:return          
		}
	}

	public static final class b extends Enum
	{

		public static b valueOf(String s)
		{
			return (b)Enum.valueOf(com/startapp/android/publish/ads/nativead/StartAppNativeAd$b, s);
		//    0    0:ldc1            #2   <Class StartAppNativeAd$b>
		//    1    2:aload_0         
		//    2    3:invokestatic    #36  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class StartAppNativeAd$b>
		//    4    9:areturn         
		}

		public static b[] values()
		{
			return (b[])((b []) (c)).clone();
		//    0    0:getstatic       #28  <Field StartAppNativeAd$b[] c>
		//    1    3:invokevirtual   #43  <Method Object _5B_Lcom.startapp.android.publish.ads.nativead.StartAppNativeAd$b_3B_.clone()>
		//    2    6:checkcast       #39  <Class StartAppNativeAd$b[]>
		//    3    9:areturn         
		}

		public static final b a;
		public static final b b;
		private static final b c[];

		static 
		{
			a = new b("LAUNCH_APP", 0);
		//    0    0:new             #2   <Class StartAppNativeAd$b>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "LAUNCH_APP">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void StartAppNativeAd$b(String, int)>
		//    5   10:putstatic       #22  <Field StartAppNativeAd$b a>
			b = new b("OPEN_MARKET", 1);
		//    6   13:new             #2   <Class StartAppNativeAd$b>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "OPEN_MARKET">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void StartAppNativeAd$b(String, int)>
		//   11   23:putstatic       #26  <Field StartAppNativeAd$b b>
			c = (new b[] {
				a, b
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       b[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field StartAppNativeAd$b a>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #26  <Field StartAppNativeAd$b b>
		//   21   41:aastore         
		//   22   42:putstatic       #28  <Field StartAppNativeAd$b[] c>
		//*  23   45:return          
		}

		private b(String s, int j)
		{
			super(s, j);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #30  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public StartAppNativeAd(Context context)
	{
		super(context, com.startapp.android.publish.common.model.AdPreferences.Placement.INAPP_NATIVE);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #41  <Field com.startapp.android.publish.common.model.AdPreferences$Placement com.startapp.android.publish.common.model.AdPreferences$Placement.INAPP_NATIVE>
	//    3    5:invokespecial   #44  <Method void Ad(Context, com.startapp.android.publish.common.model.AdPreferences$Placement)>
		totalObjectsLoaded = 0;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #46  <Field int totalObjectsLoaded>
		listNativeAds = ((List) (new ArrayList()));
	//    7   13:aload_0         
	//    8   14:new             #48  <Class ArrayList>
	//    9   17:dup             
	//   10   18:invokespecial   #51  <Method void ArrayList()>
	//   11   21:putfield        #53  <Field List listNativeAds>
		isLoading = false;
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:putfield        #55  <Field boolean isLoading>
	//   15   29:return          
	}

	private List getAdDetailsList()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #48  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void ArrayList()>
	//    3    7:astore_1        
		if(listNativeAds != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #53  <Field List listNativeAds>
	//*   6   12:ifnull          56
		{
			for(Iterator iterator = listNativeAds.iterator(); iterator.hasNext(); ((List) (arraylist)).add(((Object) (((NativeAdDetails)iterator.next()).b()))));
	//    7   15:aload_0         
	//    8   16:getfield        #53  <Field List listNativeAds>
	//    9   19:invokeinterface #64  <Method Iterator List.iterator()>
	//   10   24:astore_2        
	//   11   25:aload_2         
	//   12   26:invokeinterface #70  <Method boolean Iterator.hasNext()>
	//   13   31:ifeq            56
	//   14   34:aload_1         
	//   15   35:aload_2         
	//   16   36:invokeinterface #74  <Method Object Iterator.next()>
	//   17   41:checkcast       #76  <Class NativeAdDetails>
	//   18   44:invokevirtual   #79  <Method AdDetails com.startapp.android.publish.ads.nativead.NativeAdDetails.b()>
	//   19   47:invokeinterface #83  <Method boolean List.add(Object)>
	//   20   52:pop             
		}
	//*  21   53:goto            25
		return ((List) (arraylist));
	//   22   56:aload_1         
	//   23   57:areturn         
	}

	private NativeAdPreferences getPreferences()
	{
		return preferences;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field NativeAdPreferences preferences>
	//    2    4:areturn         
	}

	public static String getPrivacyImageUrl()
	{
		return com.startapp.android.publish.adsCommon.adinformation.a.b().d();
	//    0    0:invokestatic    #96  <Method a a.b()>
	//    1    3:invokevirtual   #99  <Method String a.d()>
	//    2    6:areturn         
	}

	public static String getPrivacyURL()
	{
		if(com.startapp.android.publish.adsCommon.adinformation.a.b().c() == null)
	//*   0    0:invokestatic    #96  <Method a a.b()>
	//*   1    3:invokevirtual   #103 <Method String a.c()>
	//*   2    6:ifnonnull       12
			return "";
	//    3    9:ldc1            #105 <String "">
	//    4   11:areturn         
		String s = com.startapp.android.publish.adsCommon.adinformation.a.b().c();
	//    5   12:invokestatic    #96  <Method a a.b()>
	//    6   15:invokevirtual   #103 <Method String a.c()>
	//    7   18:astore_0        
		if(s.contains("http://") || s.contains("https://"))
	//*   8   19:aload_0         
	//*   9   20:ldc1            #107 <String "http://">
	//*  10   22:invokevirtual   #113 <Method boolean String.contains(CharSequence)>
	//*  11   25:ifne            37
	//*  12   28:aload_0         
	//*  13   29:ldc1            #115 <String "https://">
	//*  14   31:invokevirtual   #113 <Method boolean String.contains(CharSequence)>
	//*  15   34:ifeq            44
			return com.startapp.android.publish.adsCommon.adinformation.a.b().c();
	//   16   37:invokestatic    #96  <Method a a.b()>
	//   17   40:invokevirtual   #103 <Method String a.c()>
	//   18   43:areturn         
		else
			return (new StringBuilder()).append("https://").append(com.startapp.android.publish.adsCommon.adinformation.a.b().c()).toString();
	//   19   44:new             #117 <Class StringBuilder>
	//   20   47:dup             
	//   21   48:invokespecial   #118 <Method void StringBuilder()>
	//   22   51:ldc1            #115 <String "https://">
	//   23   53:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   24   56:invokestatic    #96  <Method a a.b()>
	//   25   59:invokevirtual   #103 <Method String a.c()>
	//   26   62:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   27   65:invokevirtual   #125 <Method String StringBuilder.toString()>
	//   28   68:areturn         
	}

	private void onNativeAdLoaded()
	{
		g.a("StartAppNativeAd", 3, "Ad Loaded successfully");
	//    0    0:ldc1            #16  <String "StartAppNativeAd">
	//    1    2:iconst_3        
	//    2    3:ldc1            #128 <String "Ad Loaded successfully">
	//    3    5:invokestatic    #133 <Method void g.a(String, int, String)>
		isLoading = false;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #55  <Field boolean isLoading>
		setErrorMessage(((String) (null)));
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:invokevirtual   #137 <Method void setErrorMessage(String)>
		if(adEventDelegate != null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #139 <Field StartAppNativeAd$a adEventDelegate>
	//*  12   22:ifnull          52
		{
			g.a("StartAppNativeAd", 3, "Calling original RecienedAd callback");
	//   13   25:ldc1            #16  <String "StartAppNativeAd">
	//   14   27:iconst_3        
	//   15   28:ldc1            #141 <String "Calling original RecienedAd callback">
	//   16   30:invokestatic    #133 <Method void g.a(String, int, String)>
			AdEventListener adeventlistener = adEventDelegate.a();
	//   17   33:aload_0         
	//   18   34:getfield        #139 <Field StartAppNativeAd$a adEventDelegate>
	//   19   37:invokevirtual   #144 <Method AdEventListener com.startapp.android.publish.ads.nativead.StartAppNativeAd$a.a()>
	//   20   40:astore_1        
			if(adeventlistener != null)
	//*  21   41:aload_1         
	//*  22   42:ifnull          52
				adeventlistener.onReceiveAd(((Ad) (this)));
	//   23   45:aload_1         
	//   24   46:aload_0         
	//   25   47:invokeinterface #150 <Method void AdEventListener.onReceiveAd(Ad)>
		}
	//   26   52:return          
	}

	private void setPreferences(NativeAdPreferences nativeadpreferences)
	{
		preferences = nativeadpreferences;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #89  <Field NativeAdPreferences preferences>
	//    3    5:return          
	}

	public ArrayList getNativeAds()
	{
		return getNativeAds(((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #157 <Method ArrayList getNativeAds(String)>
	//    3    5:areturn         
	}

	public ArrayList getNativeAds(String s)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #48  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void ArrayList()>
	//    3    7:astore_2        
		Object obj = ((Object) (com.startapp.android.publish.adsCommon.a.g.a().b().a(com.startapp.android.publish.common.model.AdPreferences.Placement.INAPP_NATIVE, s)));
	//    4    8:invokestatic    #163 <Method com.startapp.android.publish.adsCommon.a.g com.startapp.android.publish.adsCommon.a.g.a()>
	//    5   11:invokevirtual   #166 <Method e com.startapp.android.publish.adsCommon.a.g.b()>
	//    6   14:getstatic       #41  <Field com.startapp.android.publish.common.model.AdPreferences$Placement com.startapp.android.publish.common.model.AdPreferences$Placement.INAPP_NATIVE>
	//    7   17:aload_1         
	//    8   18:invokevirtual   #171 <Method f e.a(com.startapp.android.publish.common.model.AdPreferences$Placement, String)>
	//    9   21:astore_3        
		if(((f) (obj)).a())
	//*  10   22:aload_3         
	//*  11   23:invokevirtual   #175 <Method boolean f.a()>
	//*  12   26:ifeq            101
		{
			if(listNativeAds != null)
	//*  13   29:aload_0         
	//*  14   30:getfield        #53  <Field List listNativeAds>
	//*  15   33:ifnull          99
			{
				NativeAdDetails nativeaddetails;
				for(obj = ((Object) (listNativeAds.iterator())); ((Iterator) (obj)).hasNext(); arraylist.add(((Object) (nativeaddetails))))
	//*  16   36:aload_0         
	//*  17   37:getfield        #53  <Field List listNativeAds>
	//*  18   40:invokeinterface #64  <Method Iterator List.iterator()>
	//*  19   45:astore_3        
	//*  20   46:aload_3         
	//*  21   47:invokeinterface #70  <Method boolean Iterator.hasNext()>
	//*  22   52:ifeq            82
				{
					nativeaddetails = (NativeAdDetails)((Iterator) (obj)).next();
	//   23   55:aload_3         
	//   24   56:invokeinterface #74  <Method Object Iterator.next()>
	//   25   61:checkcast       #76  <Class NativeAdDetails>
	//   26   64:astore          4
					nativeaddetails.a(s);
	//   27   66:aload           4
	//   28   68:aload_1         
	//   29   69:invokevirtual   #177 <Method void com.startapp.android.publish.ads.nativead.NativeAdDetails.a(String)>
				}

	//   30   72:aload_2         
	//   31   73:aload           4
	//   32   75:invokevirtual   #178 <Method boolean ArrayList.add(Object)>
	//   33   78:pop             
	//*  34   79:goto            46
				com.startapp.android.publish.adsCommon.a.b.a().a(new com.startapp.android.publish.adsCommon.a.a(com.startapp.android.publish.common.model.AdPreferences.Placement.INAPP_NATIVE, s));
	//   35   82:invokestatic    #183 <Method b b.a()>
	//   36   85:new             #185 <Class com.startapp.android.publish.adsCommon.a.a>
	//   37   88:dup             
	//   38   89:getstatic       #41  <Field com.startapp.android.publish.common.model.AdPreferences$Placement com.startapp.android.publish.common.model.AdPreferences$Placement.INAPP_NATIVE>
	//   39   92:aload_1         
	//   40   93:invokespecial   #188 <Method void com.startapp.android.publish.adsCommon.a.a(com.startapp.android.publish.common.model.AdPreferences$Placement, String)>
	//   41   96:invokevirtual   #191 <Method void b.a(com.startapp.android.publish.adsCommon.a.a)>
			}
		} else
	//*  42   99:aload_2         
	//*  43  100:areturn         
		{
			c.a(context, c.a(getAdDetailsList()), s, ((f) (obj)).c());
	//   44  101:aload_0         
	//   45  102:getfield        #195 <Field Context context>
	//   46  105:aload_0         
	//   47  106:invokespecial   #197 <Method List getAdDetailsList()>
	//   48  109:invokestatic    #202 <Method String[] c.a(List)>
	//   49  112:aload_1         
	//   50  113:aload_3         
	//   51  114:invokevirtual   #203 <Method String f.c()>
	//   52  117:invokestatic    #206 <Method void c.a(Context, String[], String, String)>
			if(Constants.a().booleanValue())
	//*  53  120:invokestatic    #211 <Method Boolean Constants.a()>
	//*  54  123:invokevirtual   #216 <Method boolean Boolean.booleanValue()>
	//*  55  126:ifeq            99
			{
				i.a().a(context, ((f) (obj)).b());
	//   56  129:invokestatic    #221 <Method i i.a()>
	//   57  132:aload_0         
	//   58  133:getfield        #195 <Field Context context>
	//   59  136:aload_3         
	//   60  137:invokevirtual   #223 <Method String f.b()>
	//   61  140:invokevirtual   #226 <Method void i.a(Context, String)>
				return arraylist;
	//   62  143:aload_2         
	//   63  144:areturn         
			}
		}
		return arraylist;
	}

	public int getNumberOfAds()
	{
		if(listNativeAds != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field List listNativeAds>
	//*   2    4:ifnull          17
			return listNativeAds.size();
	//    3    7:aload_0         
	//    4    8:getfield        #53  <Field List listNativeAds>
	//    5   11:invokeinterface #232 <Method int List.size()>
	//    6   16:ireturn         
		else
			return 0;
	//    7   17:iconst_0        
	//    8   18:ireturn         
	}

	void initNativeAdList()
	{
		totalObjectsLoaded = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #46  <Field int totalObjectsLoaded>
		if(listNativeAds == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #53  <Field List listNativeAds>
	//*   5    9:ifnonnull       23
			listNativeAds = ((List) (new ArrayList()));
	//    6   12:aload_0         
	//    7   13:new             #48  <Class ArrayList>
	//    8   16:dup             
	//    9   17:invokespecial   #51  <Method void ArrayList()>
	//   10   20:putfield        #53  <Field List listNativeAds>
		listNativeAds.clear();
	//   11   23:aload_0         
	//   12   24:getfield        #53  <Field List listNativeAds>
	//   13   27:invokeinterface #236 <Method void List.clear()>
		if(nativeAd != null && nativeAd.d() != null)
	//*  14   32:aload_0         
	//*  15   33:getfield        #238 <Field com.startapp.android.publish.ads.nativead.b nativeAd>
	//*  16   36:ifnull          115
	//*  17   39:aload_0         
	//*  18   40:getfield        #238 <Field com.startapp.android.publish.ads.nativead.b nativeAd>
	//*  19   43:invokevirtual   #242 <Method List b.d()>
	//*  20   46:ifnull          115
		{
			for(int j = 0; j < nativeAd.d().size(); j++)
	//*  21   49:iconst_0        
	//*  22   50:istore_1        
	//*  23   51:iload_1         
	//*  24   52:aload_0         
	//*  25   53:getfield        #238 <Field com.startapp.android.publish.ads.nativead.b nativeAd>
	//*  26   56:invokevirtual   #242 <Method List b.d()>
	//*  27   59:invokeinterface #232 <Method int List.size()>
	//*  28   64:icmpge          115
			{
				NativeAdDetails nativeaddetails = new NativeAdDetails((AdDetails)nativeAd.d().get(j), getPreferences(), j, ((NativeAdDetails.a) (this)));
	//   29   67:new             #76  <Class NativeAdDetails>
	//   30   70:dup             
	//   31   71:aload_0         
	//   32   72:getfield        #238 <Field com.startapp.android.publish.ads.nativead.b nativeAd>
	//   33   75:invokevirtual   #242 <Method List b.d()>
	//   34   78:iload_1         
	//   35   79:invokeinterface #246 <Method Object List.get(int)>
	//   36   84:checkcast       #248 <Class AdDetails>
	//   37   87:aload_0         
	//   38   88:invokespecial   #250 <Method NativeAdPreferences getPreferences()>
	//   39   91:iload_1         
	//   40   92:aload_0         
	//   41   93:invokespecial   #253 <Method void NativeAdDetails(AdDetails, NativeAdPreferences, int, NativeAdDetails$a)>
	//   42   96:astore_2        
				listNativeAds.add(((Object) (nativeaddetails)));
	//   43   97:aload_0         
	//   44   98:getfield        #53  <Field List listNativeAds>
	//   45  101:aload_2         
	//   46  102:invokeinterface #83  <Method boolean List.add(Object)>
	//   47  107:pop             
			}

	//   48  108:iload_1         
	//   49  109:iconst_1        
	//   50  110:iadd            
	//   51  111:istore_1        
		}
	//*  52  112:goto            51
	//   53  115:return          
	}

	public boolean isBelowMinCPM()
	{
		return nativeAd.isBelowMinCPM();
	//    0    0:aload_0         
	//    1    1:getfield        #238 <Field com.startapp.android.publish.ads.nativead.b nativeAd>
	//    2    4:invokevirtual   #256 <Method boolean b.isBelowMinCPM()>
	//    3    7:ireturn         
	}

	public boolean loadAd()
	{
		return loadAd(new NativeAdPreferences(), ((AdEventListener) (null)));
	//    0    0:aload_0         
	//    1    1:new             #259 <Class NativeAdPreferences>
	//    2    4:dup             
	//    3    5:invokespecial   #260 <Method void NativeAdPreferences()>
	//    4    8:aconst_null     
	//    5    9:invokevirtual   #263 <Method boolean loadAd(NativeAdPreferences, AdEventListener)>
	//    6   12:ireturn         
	}

	public boolean loadAd(NativeAdPreferences nativeadpreferences)
	{
		return loadAd(nativeadpreferences, ((AdEventListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #263 <Method boolean loadAd(NativeAdPreferences, AdEventListener)>
	//    4    6:ireturn         
	}

	public boolean loadAd(NativeAdPreferences nativeadpreferences, AdEventListener adeventlistener)
	{
		g.a("StartAppNativeAd", 3, "Start loading StartAppNativeAd");
	//    0    0:ldc1            #16  <String "StartAppNativeAd">
	//    1    2:iconst_3        
	//    2    3:ldc2            #266 <String "Start loading StartAppNativeAd">
	//    3    6:invokestatic    #133 <Method void g.a(String, int, String)>
		adEventDelegate = new a(adeventlistener);
	//    4    9:aload_0         
	//    5   10:new             #8   <Class StartAppNativeAd$a>
	//    6   13:dup             
	//    7   14:aload_0         
	//    8   15:aload_2         
	//    9   16:invokespecial   #269 <Method void StartAppNativeAd$a(StartAppNativeAd, AdEventListener)>
	//   10   19:putfield        #139 <Field StartAppNativeAd$a adEventDelegate>
		setPreferences(nativeadpreferences);
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:invokespecial   #271 <Method void setPreferences(NativeAdPreferences)>
		if(isLoading)
	//*  14   27:aload_0         
	//*  15   28:getfield        #55  <Field boolean isLoading>
	//*  16   31:ifeq            43
		{
			setErrorMessage("Ad is currently being loaded");
	//   17   34:aload_0         
	//   18   35:ldc2            #273 <String "Ad is currently being loaded">
	//   19   38:invokevirtual   #137 <Method void setErrorMessage(String)>
			return false;
	//   20   41:iconst_0        
	//   21   42:ireturn         
		} else
		{
			isLoading = true;
	//   22   43:aload_0         
	//   23   44:iconst_1        
	//   24   45:putfield        #55  <Field boolean isLoading>
			nativeAd = new com.startapp.android.publish.ads.nativead.b(context, getPreferences());
	//   25   48:aload_0         
	//   26   49:new             #240 <Class com.startapp.android.publish.ads.nativead.b>
	//   27   52:dup             
	//   28   53:aload_0         
	//   29   54:getfield        #195 <Field Context context>
	//   30   57:aload_0         
	//   31   58:invokespecial   #250 <Method NativeAdPreferences getPreferences()>
	//   32   61:invokespecial   #276 <Method void com.startapp.android.publish.ads.nativead.b(Context, NativeAdPreferences)>
	//   33   64:putfield        #238 <Field com.startapp.android.publish.ads.nativead.b nativeAd>
			return nativeAd.load(((AdPreferences) (nativeadpreferences)), ((AdEventListener) (adEventDelegate)));
	//   34   67:aload_0         
	//   35   68:getfield        #238 <Field com.startapp.android.publish.ads.nativead.b nativeAd>
	//   36   71:aload_1         
	//   37   72:aload_0         
	//   38   73:getfield        #139 <Field StartAppNativeAd$a adEventDelegate>
	//   39   76:invokevirtual   #280 <Method boolean b.load(AdPreferences, AdEventListener)>
	//   40   79:ireturn         
		}
	}

	public boolean loadAd(AdEventListener adeventlistener)
	{
		return loadAd(new NativeAdPreferences(), adeventlistener);
	//    0    0:aload_0         
	//    1    1:new             #259 <Class NativeAdPreferences>
	//    2    4:dup             
	//    3    5:invokespecial   #260 <Method void NativeAdPreferences()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #263 <Method boolean loadAd(NativeAdPreferences, AdEventListener)>
	//    6   12:ireturn         
	}

	protected void loadAds(AdPreferences adpreferences, AdEventListener adeventlistener)
	{
	//    0    0:return          
	}

	public void onNativeAdDetailsLoaded(int j)
	{
		totalObjectsLoaded = totalObjectsLoaded + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #46  <Field int totalObjectsLoaded>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #46  <Field int totalObjectsLoaded>
		if(nativeAd.d() != null && totalObjectsLoaded == nativeAd.d().size())
	//*   6   10:aload_0         
	//*   7   11:getfield        #238 <Field com.startapp.android.publish.ads.nativead.b nativeAd>
	//*   8   14:invokevirtual   #242 <Method List b.d()>
	//*   9   17:ifnull          43
	//*  10   20:aload_0         
	//*  11   21:getfield        #46  <Field int totalObjectsLoaded>
	//*  12   24:aload_0         
	//*  13   25:getfield        #238 <Field com.startapp.android.publish.ads.nativead.b nativeAd>
	//*  14   28:invokevirtual   #242 <Method List b.d()>
	//*  15   31:invokeinterface #232 <Method int List.size()>
	//*  16   36:icmpne          43
			onNativeAdLoaded();
	//   17   39:aload_0         
	//   18   40:invokespecial   #287 <Method void onNativeAdLoaded()>
	//   19   43:return          
	}

	public String toString()
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #289 <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #290 <Method void StringBuffer()>
	//    3    7:astore_2        
		stringbuffer.append("\n===== StartAppNativeAd =====\n");
	//    4    8:aload_2         
	//    5    9:ldc2            #292 <String "\n===== StartAppNativeAd =====\n">
	//    6   12:invokevirtual   #295 <Method StringBuffer StringBuffer.append(String)>
	//    7   15:pop             
		for(int j = 0; j < getNumberOfAds(); j++)
	//*   8   16:iconst_0        
	//*   9   17:istore_1        
	//*  10   18:iload_1         
	//*  11   19:aload_0         
	//*  12   20:invokevirtual   #297 <Method int getNumberOfAds()>
	//*  13   23:icmpge          48
			stringbuffer.append(listNativeAds.get(j));
	//   14   26:aload_2         
	//   15   27:aload_0         
	//   16   28:getfield        #53  <Field List listNativeAds>
	//   17   31:iload_1         
	//   18   32:invokeinterface #246 <Method Object List.get(int)>
	//   19   37:invokevirtual   #300 <Method StringBuffer StringBuffer.append(Object)>
	//   20   40:pop             

	//   21   41:iload_1         
	//   22   42:iconst_1        
	//   23   43:iadd            
	//   24   44:istore_1        
	//*  25   45:goto            18
		stringbuffer.append("===== End StartAppNativeAd =====");
	//   26   48:aload_2         
	//   27   49:ldc2            #302 <String "===== End StartAppNativeAd =====">
	//   28   52:invokevirtual   #295 <Method StringBuffer StringBuffer.append(String)>
	//   29   55:pop             
		return stringbuffer.toString();
	//   30   56:aload_2         
	//   31   57:invokevirtual   #303 <Method String StringBuffer.toString()>
	//   32   60:areturn         
	}

	private static final String TAG = "StartAppNativeAd";
	private static final long serialVersionUID = 1L;
	private a adEventDelegate;
	boolean isLoading;
	private List listNativeAds;
	private com.startapp.android.publish.ads.nativead.b nativeAd;
	private NativeAdPreferences preferences;
	private int totalObjectsLoaded;
}
