// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.common.metaData;

import android.content.Context;
import android.graphics.Bitmap;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.e.a;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.e.f;
import com.startapp.android.publish.adsCommon.k;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.Constants;
import com.startapp.common.a.c;
import com.startapp.common.a.e;
import com.startapp.common.a.g;
import com.startapp.common.c.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.startapp.android.publish.common.metaData:
//			h, g, b, LocationConfig, 
//			d, c

public class MetaData
	implements Serializable
{
	public static class a
		implements com.startapp.common.a.a
	{

		public void a(Bitmap bitmap, int j)
		{
			if(bitmap != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          18
				com.startapp.android.publish.adsCommon.Utils.a.a(a, bitmap, b, ".png");
		//    2    4:aload_0         
		//    3    5:getfield        #19  <Field Context a>
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #21  <Field String b>
		//    7   13:ldc1            #25  <String ".png">
		//    8   15:invokestatic    #30  <Method void com.startapp.android.publish.adsCommon.Utils.a.a(Context, Bitmap, String, String)>
		//    9   18:return          
		}

		Context a;
		String b;

		public a(Context context, String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			a = context;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field Context a>
			b = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #21  <Field String b>
		//    8   14:return          
		}
	}

	public static final class b extends Enum
	{

		public static b valueOf(String s)
		{
			return (b)Enum.valueOf(com/startapp/android/publish/common/metaData/MetaData$b, s);
		//    0    0:ldc1            #2   <Class MetaData$b>
		//    1    2:aload_0         
		//    2    3:invokestatic    #41  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class MetaData$b>
		//    4    9:areturn         
		}

		public static b[] values()
		{
			return (b[])((b []) (d)).clone();
		//    0    0:getstatic       #33  <Field MetaData$b[] d>
		//    1    3:invokevirtual   #48  <Method Object _5B_Lcom.startapp.android.publish.common.metaData.MetaData$b_3B_.clone()>
		//    2    6:checkcast       #44  <Class MetaData$b[]>
		//    3    9:areturn         
		}

		public static final b a;
		public static final b b;
		public static final b c;
		private static final b d[];

		static 
		{
			a = new b("DISABLED", 0);
		//    0    0:new             #2   <Class MetaData$b>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "DISABLED">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void MetaData$b(String, int)>
		//    5   10:putstatic       #23  <Field MetaData$b a>
			b = new b("CONTENT", 1);
		//    6   13:new             #2   <Class MetaData$b>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "CONTENT">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void MetaData$b(String, int)>
		//   11   23:putstatic       #27  <Field MetaData$b b>
			c = new b("FULL", 2);
		//   12   26:new             #2   <Class MetaData$b>
		//   13   29:dup             
		//   14   30:ldc1            #29  <String "FULL">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void MetaData$b(String, int)>
		//   17   36:putstatic       #31  <Field MetaData$b c>
			d = (new b[] {
				a, b, c
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       b[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field MetaData$b a>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #27  <Field MetaData$b b>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #31  <Field MetaData$b c>
		//   31   60:aastore         
		//   32   61:putstatic       #33  <Field MetaData$b[] d>
		//*  33   64:return          
		}

		private b(String s, int j)
		{
			super(s, j);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #35  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	private MetaData()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #124 <Method void Object()>
		SimpleToken = new h();
	//    2    4:aload_0         
	//    3    5:new             #198 <Class h>
	//    4    8:dup             
	//    5    9:invokespecial   #199 <Method void h()>
	//    6   12:putfield        #201 <Field h SimpleToken>
		metaDataHostSecured = DEFAULT_METADATA_HOST;
	//    7   15:aload_0         
	//    8   16:getstatic       #168 <Field String DEFAULT_METADATA_HOST>
	//    9   19:putfield        #203 <Field String metaDataHostSecured>
		adPlatformHostSecured = DEFAULT_AD_PLATFORM_HOST;
	//   10   22:aload_0         
	//   11   23:getstatic       #171 <Field String DEFAULT_AD_PLATFORM_HOST>
	//   12   26:putfield        #205 <Field String adPlatformHostSecured>
		sessionMaxBackgroundTime = 1800;
	//   13   29:aload_0         
	//   14   30:sipush          1800
	//   15   33:putfield        #207 <Field int sessionMaxBackgroundTime>
		profileId = DEFAULT_PROFILE_ID;
	//   16   36:aload_0         
	//   17   37:getstatic       #173 <Field String DEFAULT_PROFILE_ID>
	//   18   40:putfield        #209 <Field String profileId>
		installersList = DEFAULT_INSTALLERS_LIST;
	//   19   43:aload_0         
	//   20   44:getstatic       #145 <Field Set DEFAULT_INSTALLERS_LIST>
	//   21   47:putfield        #211 <Field Set installersList>
		preInstalledPackages = DEFAULT_PRE_INSTALLED_PACKAGES;
	//   22   50:aload_0         
	//   23   51:getstatic       #184 <Field Set DEFAULT_PRE_INSTALLED_PACKAGES>
	//   24   54:putfield        #213 <Field Set preInstalledPackages>
		simpleToken2 = true;
	//   25   57:aload_0         
	//   26   58:iconst_1        
	//   27   59:putfield        #215 <Field boolean simpleToken2>
		alwaysSendToken = true;
	//   28   62:aload_0         
	//   29   63:iconst_1        
	//   30   64:putfield        #217 <Field boolean alwaysSendToken>
		compressionEnabled = false;
	//   31   67:aload_0         
	//   32   68:iconst_0        
	//   33   69:putfield        #219 <Field boolean compressionEnabled>
		btEnabled = false;
	//   34   72:aload_0         
	//   35   73:iconst_0        
	//   36   74:putfield        #221 <Field boolean btEnabled>
		periodicMetaDataEnabled = false;
	//   37   77:aload_0         
	//   38   78:iconst_0        
	//   39   79:putfield        #223 <Field boolean periodicMetaDataEnabled>
		periodicMetaDataIntervalInMinutes = 360;
	//   40   82:aload_0         
	//   41   83:sipush          360
	//   42   86:putfield        #225 <Field int periodicMetaDataIntervalInMinutes>
		periodicInfoEventEnabled = false;
	//   43   89:aload_0         
	//   44   90:iconst_0        
	//   45   91:putfield        #227 <Field boolean periodicInfoEventEnabled>
		periodicInfoEventOnRunTimeEnabled = false;
	//   46   94:aload_0         
	//   47   95:iconst_0        
	//   48   96:putfield        #229 <Field boolean periodicInfoEventOnRunTimeEnabled>
		periodicInfoEventIntervalInMinutes = 360;
	//   49   99:aload_0         
	//   50  100:sipush          360
	//   51  103:putfield        #231 <Field int periodicInfoEventIntervalInMinutes>
		periodicEventIntMin = DEFAULT_PERIODIC_INFOEVENT_INTERVALS;
	//   52  106:aload_0         
	//   53  107:getstatic       #175 <Field int[] DEFAULT_PERIODIC_INFOEVENT_INTERVALS>
	//   54  110:putfield        #233 <Field int[] periodicEventIntMin>
		inAppBrowser = true;
	//   55  113:aload_0         
	//   56  114:iconst_1        
	//   57  115:putfield        #235 <Field boolean inAppBrowser>
		SupportIABViewability = true;
	//   58  118:aload_0         
	//   59  119:iconst_1        
	//   60  120:putfield        #237 <Field boolean SupportIABViewability>
		IABDisplayImpressionDelayInSeconds = 1L;
	//   61  123:aload_0         
	//   62  124:lconst_1        
	//   63  125:putfield        #239 <Field long IABDisplayImpressionDelayInSeconds>
		IABVideoImpressionDelayInSeconds = 2L;
	//   64  128:aload_0         
	//   65  129:ldc2w           #240 <Long 2L>
	//   66  132:putfield        #243 <Field long IABVideoImpressionDelayInSeconds>
		userAgentDelayInSeconds = 5L;
	//   67  135:aload_0         
	//   68  136:ldc2w           #244 <Long 5L>
	//   69  139:putfield        #247 <Field long userAgentDelayInSeconds>
		userAgentEnabled = true;
	//   70  142:aload_0         
	//   71  143:iconst_1        
	//   72  144:putfield        #249 <Field boolean userAgentEnabled>
		sensorsConfig = new com.startapp.android.publish.common.metaData.g();
	//   73  147:aload_0         
	//   74  148:new             #251 <Class com.startapp.android.publish.common.metaData.g>
	//   75  151:dup             
	//   76  152:invokespecial   #252 <Method void com.startapp.android.publish.common.metaData.g()>
	//   77  155:putfield        #254 <Field com.startapp.android.publish.common.metaData.g sensorsConfig>
		btConfig = new com.startapp.android.publish.common.metaData.b();
	//   78  158:aload_0         
	//   79  159:new             #256 <Class com.startapp.android.publish.common.metaData.b>
	//   80  162:dup             
	//   81  163:invokespecial   #257 <Method void com.startapp.android.publish.common.metaData.b()>
	//   82  166:putfield        #259 <Field com.startapp.android.publish.common.metaData.b btConfig>
		assetsBaseUrlSecured = "";
	//   83  169:aload_0         
	//   84  170:ldc1            #20  <String "">
	//   85  172:putfield        #261 <Field String assetsBaseUrlSecured>
		invalidForRetry = ((Set) (new HashSet()));
	//   86  175:aload_0         
	//   87  176:new             #128 <Class HashSet>
	//   88  179:dup             
	//   89  180:invokespecial   #262 <Method void HashSet()>
	//   90  183:putfield        #264 <Field Set invalidForRetry>
		invalidNetworkCodesInfoEvents = DEFAULT_INVALID_NETWORK_CODES_INFO_EVENTS;
	//   91  186:aload_0         
	//   92  187:getstatic       #192 <Field Set DEFAULT_INVALID_NETWORK_CODES_INFO_EVENTS>
	//   93  190:putfield        #266 <Field Set invalidNetworkCodesInfoEvents>
		analytics = new com.startapp.android.publish.adsCommon.e.a();
	//   94  193:aload_0         
	//   95  194:new             #268 <Class a>
	//   96  197:dup             
	//   97  198:invokespecial   #269 <Method void a()>
	//   98  201:putfield        #271 <Field a analytics>
		location = new LocationConfig();
	//   99  204:aload_0         
	//  100  205:new             #273 <Class LocationConfig>
	//  101  208:dup             
	//  102  209:invokespecial   #274 <Method void LocationConfig()>
	//  103  212:putfield        #276 <Field LocationConfig location>
		wfScanEnabled = false;
	//  104  215:aload_0         
	//  105  216:iconst_0        
	//  106  217:putfield        #278 <Field boolean wfScanEnabled>
		loading = false;
	//  107  220:aload_0         
	//  108  221:iconst_0        
	//  109  222:putfield        #280 <Field boolean loading>
		ready = false;
	//  110  225:aload_0         
	//  111  226:iconst_0        
	//  112  227:putfield        #282 <Field boolean ready>
		metaDataListeners = ((List) (new ArrayList()));
	//  113  230:aload_0         
	//  114  231:new             #284 <Class ArrayList>
	//  115  234:dup             
	//  116  235:invokespecial   #285 <Method void ArrayList()>
	//  117  238:putfield        #287 <Field List metaDataListeners>
		metadataUpdateVersion = AdsConstants.h;
	//  118  241:aload_0         
	//  119  242:getstatic       #292 <Field String AdsConstants.h>
	//  120  245:putfield        #294 <Field String metadataUpdateVersion>
		dns = false;
	//  121  248:aload_0         
	//  122  249:iconst_0        
	//  123  250:putfield        #296 <Field boolean dns>
		stopAutoLoadAmount = 3;
	//  124  253:aload_0         
	//  125  254:iconst_3        
	//  126  255:putfield        #298 <Field int stopAutoLoadAmount>
		stopAutoLoadPreCacheAmount = 3;
	//  127  258:aload_0         
	//  128  259:iconst_3        
	//  129  260:putfield        #300 <Field int stopAutoLoadPreCacheAmount>
		trueNetEnabled = false;
	//  130  263:aload_0         
	//  131  264:iconst_0        
	//  132  265:putfield        #302 <Field boolean trueNetEnabled>
		webViewSecured = true;
	//  133  268:aload_0         
	//  134  269:iconst_1        
	//  135  270:putfield        #304 <Field boolean webViewSecured>
	//  136  273:return          
	}

	public static void failedLoading()
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_0        
		synchronized(lock)
	//*   2    2:getstatic       #126 <Field Object lock>
	//*   3    5:astore_1        
	//*   4    6:aload_1         
	//*   5    7:monitorenter    
		{
			if(getInstance().metaDataListeners != null)
	//*   6    8:invokestatic    #309 <Method MetaData getInstance()>
	//*   7   11:getfield        #287 <Field List metaDataListeners>
	//*   8   14:ifnull          42
			{
				obj = ((Object) (new ArrayList(((java.util.Collection) (getInstance().metaDataListeners)))));
	//    9   17:new             #284 <Class ArrayList>
	//   10   20:dup             
	//   11   21:invokestatic    #309 <Method MetaData getInstance()>
	//   12   24:getfield        #287 <Field List metaDataListeners>
	//   13   27:invokespecial   #310 <Method void ArrayList(java.util.Collection)>
	//   14   30:astore_0        
				getInstance().metaDataListeners.clear();
	//   15   31:invokestatic    #309 <Method MetaData getInstance()>
	//   16   34:getfield        #287 <Field List metaDataListeners>
	//   17   37:invokeinterface #315 <Method void List.clear()>
			}
			getInstance().loading = false;
	//   18   42:invokestatic    #309 <Method MetaData getInstance()>
	//   19   45:iconst_0        
	//   20   46:putfield        #280 <Field boolean loading>
		}
	//   21   49:aload_1         
	//   22   50:monitorexit     
		if(obj != null)
	//*  23   51:aload_0         
	//*  24   52:ifnull          93
			for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((com.startapp.android.publish.common.metaData.d)((Iterator) (obj)).next()).b());
	//   25   55:aload_0         
	//   26   56:invokeinterface #319 <Method Iterator List.iterator()>
	//   27   61:astore_0        
	//   28   62:aload_0         
	//   29   63:invokeinterface #325 <Method boolean Iterator.hasNext()>
	//   30   68:ifeq            93
	//   31   71:aload_0         
	//   32   72:invokeinterface #329 <Method Object Iterator.next()>
	//   33   77:checkcast       #331 <Class com.startapp.android.publish.common.metaData.d>
	//   34   80:invokeinterface #333 <Method void com.startapp.android.publish.common.metaData.d.b()>
		break MISSING_BLOCK_LABEL_93;
	//   35   85:goto            62
		exception;
	//   36   88:astore_0        
		obj1;
	//   37   89:aload_1         
		JVM INSTR monitorexit ;
	//   38   90:monitorexit     
		throw exception;
	//   39   91:aload_0         
	//   40   92:athrow          
	//   41   93:return          
	}

	public static String getHostForWebview(String s, int j, boolean flag)
	{
		String s1;
		String s2;
		if(j > 26 || flag)
	//*   0    0:iload_1         
	//*   1    1:bipush          26
	//*   2    3:icmpgt          10
	//*   3    6:iload_2         
	//*   4    7:ifeq            86
			s1 = "https";
	//    5   10:ldc2            #337 <String "https">
	//    6   13:astore_3        
		else
	//*   7   14:aload_0         
	//*   8   15:astore          4
	//*   9   17:aload_0         
	//*  10   18:new             #339 <Class StringBuilder>
	//*  11   21:dup             
	//*  12   22:invokespecial   #340 <Method void StringBuilder()>
	//*  13   25:aload_3         
	//*  14   26:invokevirtual   #344 <Method StringBuilder StringBuilder.append(String)>
	//*  15   29:ldc2            #346 <String "://">
	//*  16   32:invokevirtual   #344 <Method StringBuilder StringBuilder.append(String)>
	//*  17   35:invokevirtual   #350 <Method String StringBuilder.toString()>
	//*  18   38:invokevirtual   #354 <Method boolean String.startsWith(String)>
	//*  19   41:ifne            83
	//*  20   44:aload_0         
	//*  21   45:bipush          58
	//*  22   47:invokevirtual   #358 <Method int String.indexOf(int)>
	//*  23   50:istore_1        
	//*  24   51:aload_0         
	//*  25   52:astore          4
	//*  26   54:iload_1         
	//*  27   55:iconst_m1       
	//*  28   56:icmpeq          83
	//*  29   59:new             #339 <Class StringBuilder>
	//*  30   62:dup             
	//*  31   63:invokespecial   #340 <Method void StringBuilder()>
	//*  32   66:aload_3         
	//*  33   67:invokevirtual   #344 <Method StringBuilder StringBuilder.append(String)>
	//*  34   70:aload_0         
	//*  35   71:iload_1         
	//*  36   72:invokevirtual   #362 <Method String String.substring(int)>
	//*  37   75:invokevirtual   #344 <Method StringBuilder StringBuilder.append(String)>
	//*  38   78:invokevirtual   #350 <Method String StringBuilder.toString()>
	//*  39   81:astore          4
	//*  40   83:aload           4
	//*  41   85:areturn         
			s1 = "http";
	//   42   86:ldc2            #364 <String "http">
	//   43   89:astore_3        
		s2 = s;
		if(!s.startsWith((new StringBuilder()).append(s1).append("://").toString()))
		{
			j = s.indexOf(':');
			s2 = s;
			if(j != -1)
				s2 = (new StringBuilder()).append(s1).append(s.substring(j)).toString();
		}
		return s2;
	//*  44   90:goto            14
	}

	public static MetaData getInstance()
	{
		return instance;
	//    0    0:getstatic       #195 <Field MetaData instance>
	//    1    3:areturn         
	}

	public static Object getLock()
	{
		return lock;
	//    0    0:getstatic       #126 <Field Object lock>
	//    1    3:areturn         
	}

	public static void init(Context context)
	{
		MetaData metadata = (MetaData)e.a(context, "StartappMetadata", com/startapp/android/publish/common/metaData/MetaData);
	//    0    0:aload_0         
	//    1    1:ldc2            #370 <String "StartappMetadata">
	//    2    4:ldc1            #2   <Class MetaData>
	//    3    6:invokestatic    #375 <Method Object e.a(Context, String, Class)>
	//    4    9:checkcast       #2   <Class MetaData>
	//    5   12:astore_2        
		MetaData metadata1 = new MetaData();
	//    6   13:new             #2   <Class MetaData>
	//    7   16:dup             
	//    8   17:invokespecial   #193 <Method void MetaData()>
	//    9   20:astore_3        
		if(metadata != null)
	//*  10   21:aload_2         
	//*  11   22:ifnull          71
		{
			boolean flag = i.a(((Object) (metadata)), ((Object) (metadata1)));
	//   12   25:aload_2         
	//   13   26:aload_3         
	//   14   27:invokestatic    #380 <Method boolean i.a(Object, Object)>
	//   15   30:istore_1        
			if(!metadata.isMetaDataVersionChanged() && flag)
	//*  16   31:aload_2         
	//*  17   32:invokespecial   #383 <Method boolean isMetaDataVersionChanged()>
	//*  18   35:ifne            56
	//*  19   38:iload_1         
	//*  20   39:ifeq            56
				f.a(context, d.k, "MetaData", "", "");
	//   21   42:aload_0         
	//   22   43:getstatic       #389 <Field d d.k>
	//   23   46:ldc2            #391 <String "MetaData">
	//   24   49:ldc1            #20  <String "">
	//   25   51:ldc1            #20  <String "">
	//   26   53:invokestatic    #396 <Method void f.a(Context, d, String, String, String)>
			metadata.initTransientFields();
	//   27   56:aload_2         
	//   28   57:invokespecial   #399 <Method void initTransientFields()>
			instance = metadata;
	//   29   60:aload_2         
	//   30   61:putstatic       #195 <Field MetaData instance>
		} else
	//*  31   64:invokestatic    #309 <Method MetaData getInstance()>
	//*  32   67:invokevirtual   #402 <Method void applyAdPlatformProtocolToHosts()>
	//*  33   70:return          
		{
			instance = metadata1;
	//   34   71:aload_3         
	//   35   72:putstatic       #195 <Field MetaData instance>
		}
		getInstance().applyAdPlatformProtocolToHosts();
	//*  36   75:goto            64
	}

	private void initTransientFields()
	{
		loading = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #280 <Field boolean loading>
		ready = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #282 <Field boolean ready>
		metaDataListeners = ((List) (new ArrayList()));
	//    6   10:aload_0         
	//    7   11:new             #284 <Class ArrayList>
	//    8   14:dup             
	//    9   15:invokespecial   #285 <Method void ArrayList()>
	//   10   18:putfield        #287 <Field List metaDataListeners>
	//   11   21:return          
	}

	private boolean isMetaDataVersionChanged()
	{
		return !AdsConstants.h.equals(((Object) (metadataUpdateVersion)));
	//    0    0:getstatic       #292 <Field String AdsConstants.h>
	//    1    3:aload_0         
	//    2    4:getfield        #294 <Field String metadataUpdateVersion>
	//    3    7:invokevirtual   #406 <Method boolean String.equals(Object)>
	//    4   10:ifne            15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public static void preCacheResources(Context context, String s)
	{
		if(s == null || s.equals("")) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnull          371
	//    2    4:aload_1         
	//    3    5:ldc1            #20  <String "">
	//    4    7:invokevirtual   #406 <Method boolean String.equals(Object)>
	//    5   10:ifne            371
_L1:
		if(!com.startapp.android.publish.adsCommon.Utils.a.a(context, "close_button.png", ".png") && !i.a())
	//*   6   13:aload_0         
	//*   7   14:ldc2            #410 <String "close_button.png">
	//*   8   17:ldc2            #412 <String ".png">
	//*   9   20:invokestatic    #417 <Method boolean com.startapp.android.publish.adsCommon.Utils.a.a(Context, String, String)>
	//*  10   23:ifne            80
	//*  11   26:invokestatic    #419 <Method boolean i.a()>
	//*  12   29:ifne            80
			(new com.startapp.common.a((new StringBuilder()).append(s).append("close_button").append(".png").toString(), ((com.startapp.common.a.a) (new a(context, "close_button"))), 0)).a();
	//   13   32:new             #421 <Class com.startapp.common.a>
	//   14   35:dup             
	//   15   36:new             #339 <Class StringBuilder>
	//   16   39:dup             
	//   17   40:invokespecial   #340 <Method void StringBuilder()>
	//   18   43:aload_1         
	//   19   44:invokevirtual   #344 <Method StringBuilder StringBuilder.append(String)>
	//   20   47:ldc2            #423 <String "close_button">
	//   21   50:invokevirtual   #344 <Method StringBuilder StringBuilder.append(String)>
	//   22   53:ldc2            #412 <String ".png">
	//   23   56:invokevirtual   #344 <Method StringBuilder StringBuilder.append(String)>
	//   24   59:invokevirtual   #350 <Method String StringBuilder.toString()>
	//   25   62:new             #8   <Class MetaData$a>
	//   26   65:dup             
	//   27   66:aload_0         
	//   28   67:ldc2            #423 <String "close_button">
	//   29   70:invokespecial   #425 <Method void MetaData$a(Context, String)>
	//   30   73:iconst_0        
	//   31   74:invokespecial   #428 <Method void com.startapp.common.a(String, com.startapp.common.a$a, int)>
	//   32   77:invokevirtual   #430 <Method void com.startapp.common.a.a()>
		if(i.a(256L))
	//*  33   80:ldc2w           #431 <Long 256L>
	//*  34   83:invokestatic    #435 <Method boolean i.a(long)>
	//*  35   86:ifeq            195
		{
			String as[] = AdsConstants.k;
	//   36   89:getstatic       #438 <Field String[] AdsConstants.k>
	//   37   92:astore          4
			int j1 = as.length;
	//   38   94:aload           4
	//   39   96:arraylength     
	//   40   97:istore_3        
			for(int j = 0; j < j1; j++)
	//*  41   98:iconst_0        
	//*  42   99:istore_2        
	//*  43  100:iload_2         
	//*  44  101:iload_3         
	//*  45  102:icmpge          195
			{
				String s1 = as[j];
	//   46  105:aload           4
	//   47  107:iload_2         
	//   48  108:aaload          
	//   49  109:astore          5
				if(!com.startapp.android.publish.adsCommon.Utils.a.a(context, (new StringBuilder()).append(s1).append(".png").toString(), ".png"))
	//*  50  111:aload_0         
	//*  51  112:new             #339 <Class StringBuilder>
	//*  52  115:dup             
	//*  53  116:invokespecial   #340 <Method void StringBuilder()>
	//*  54  119:aload           5
	//*  55  121:invokevirtual   #344 <Method StringBuilder StringBuilder.append(String)>
	//*  56  124:ldc2            #412 <String ".png">
	//*  57  127:invokevirtual   #344 <Method StringBuilder StringBuilder.append(String)>
	//*  58  130:invokevirtual   #350 <Method String StringBuilder.toString()>
	//*  59  133:ldc2            #412 <String ".png">
	//*  60  136:invokestatic    #417 <Method boolean com.startapp.android.publish.adsCommon.Utils.a.a(Context, String, String)>
	//*  61  139:ifne            188
					(new com.startapp.common.a((new StringBuilder()).append(s).append(s1).append(".png").toString(), ((com.startapp.common.a.a) (new a(context, s1))), 0)).a();
	//   62  142:new             #421 <Class com.startapp.common.a>
	//   63  145:dup             
	//   64  146:new             #339 <Class StringBuilder>
	//   65  149:dup             
	//   66  150:invokespecial   #340 <Method void StringBuilder()>
	//   67  153:aload_1         
	//   68  154:invokevirtual   #344 <Method StringBuilder StringBuilder.append(String)>
	//   69  157:aload           5
	//   70  159:invokevirtual   #344 <Method StringBuilder StringBuilder.append(String)>
	//   71  162:ldc2            #412 <String ".png">
	//   72  165:invokevirtual   #344 <Method StringBuilder StringBuilder.append(String)>
	//   73  168:invokevirtual   #350 <Method String StringBuilder.toString()>
	//   74  171:new             #8   <Class MetaData$a>
	//   75  174:dup             
	//   76  175:aload_0         
	//   77  176:aload           5
	//   78  178:invokespecial   #425 <Method void MetaData$a(Context, String)>
	//   79  181:iconst_0        
	//   80  182:invokespecial   #428 <Method void com.startapp.common.a(String, com.startapp.common.a$a, int)>
	//   81  185:invokevirtual   #430 <Method void com.startapp.common.a.a()>
			}

	//   82  188:iload_2         
	//   83  189:iconst_1        
	//   84  190:iadd            
	//   85  191:istore_2        
		}
	//*  86  192:goto            100
		if(!i.a(64L)) goto _L4; else goto _L3
	//   87  195:ldc2w           #439 <Long 64L>
	//   88  198:invokestatic    #435 <Method boolean i.a(long)>
	//   89  201:ifeq            372
_L3:
		String as1[] = AdsConstants.l;
	//   90  204:getstatic       #443 <Field String[] AdsConstants.l>
	//   91  207:astore          4
		int k1 = as1.length;
	//   92  209:aload           4
	//   93  211:arraylength     
	//   94  212:istore_3        
		for(int l = 0; l < k1; l++)
	//*  95  213:iconst_0        
	//*  96  214:istore_2        
	//*  97  215:iload_2         
	//*  98  216:iload_3         
	//*  99  217:icmpge          310
		{
			String s2 = as1[l];
	//  100  220:aload           4
	//  101  222:iload_2         
	//  102  223:aaload          
	//  103  224:astore          5
			if(!com.startapp.android.publish.adsCommon.Utils.a.a(context, (new StringBuilder()).append(s2).append(".png").toString(), ".png"))
	//* 104  226:aload_0         
	//* 105  227:new             #339 <Class StringBuilder>
	//* 106  230:dup             
	//* 107  231:invokespecial   #340 <Method void StringBuilder()>
	//* 108  234:aload           5
	//* 109  236:invokevirtual   #344 <Method StringBuilder StringBuilder.append(String)>
	//* 110  239:ldc2            #412 <String ".png">
	//* 111  242:invokevirtual   #344 <Method StringBuilder StringBuilder.append(String)>
	//* 112  245:invokevirtual   #350 <Method String StringBuilder.toString()>
	//* 113  248:ldc2            #412 <String ".png">
	//* 114  251:invokestatic    #417 <Method boolean com.startapp.android.publish.adsCommon.Utils.a.a(Context, String, String)>
	//* 115  254:ifne            303
				(new com.startapp.common.a((new StringBuilder()).append(s).append(s2).append(".png").toString(), ((com.startapp.common.a.a) (new a(context, s2))), 0)).a();
	//  116  257:new             #421 <Class com.startapp.common.a>
	//  117  260:dup             
	//  118  261:new             #339 <Class StringBuilder>
	//  119  264:dup             
	//  120  265:invokespecial   #340 <Method void StringBuilder()>
	//  121  268:aload_1         
	//  122  269:invokevirtual   #344 <Method StringBuilder StringBuilder.append(String)>
	//  123  272:aload           5
	//  124  274:invokevirtual   #344 <Method StringBuilder StringBuilder.append(String)>
	//  125  277:ldc2            #412 <String ".png">
	//  126  280:invokevirtual   #344 <Method StringBuilder StringBuilder.append(String)>
	//  127  283:invokevirtual   #350 <Method String StringBuilder.toString()>
	//  128  286:new             #8   <Class MetaData$a>
	//  129  289:dup             
	//  130  290:aload_0         
	//  131  291:aload           5
	//  132  293:invokespecial   #425 <Method void MetaData$a(Context, String)>
	//  133  296:iconst_0        
	//  134  297:invokespecial   #428 <Method void com.startapp.common.a(String, com.startapp.common.a$a, int)>
	//  135  300:invokevirtual   #430 <Method void com.startapp.common.a.a()>
		}

	//  136  303:iload_2         
	//  137  304:iconst_1        
	//  138  305:iadd            
	//  139  306:istore_2        
	//* 140  307:goto            215
		if(!com.startapp.android.publish.adsCommon.Utils.a.a(context, "logo.png", ".png"))
	//* 141  310:aload_0         
	//* 142  311:ldc2            #445 <String "logo.png">
	//* 143  314:ldc2            #412 <String ".png">
	//* 144  317:invokestatic    #417 <Method boolean com.startapp.android.publish.adsCommon.Utils.a.a(Context, String, String)>
	//* 145  320:ifne            371
			(new com.startapp.common.a((new StringBuilder()).append(s).append("logo").append(".png").toString(), ((com.startapp.common.a.a) (new a(context, "logo"))), 0)).a();
	//  146  323:new             #421 <Class com.startapp.common.a>
	//  147  326:dup             
	//  148  327:new             #339 <Class StringBuilder>
	//  149  330:dup             
	//  150  331:invokespecial   #340 <Method void StringBuilder()>
	//  151  334:aload_1         
	//  152  335:invokevirtual   #344 <Method StringBuilder StringBuilder.append(String)>
	//  153  338:ldc2            #447 <String "logo">
	//  154  341:invokevirtual   #344 <Method StringBuilder StringBuilder.append(String)>
	//  155  344:ldc2            #412 <String ".png">
	//  156  347:invokevirtual   #344 <Method StringBuilder StringBuilder.append(String)>
	//  157  350:invokevirtual   #350 <Method String StringBuilder.toString()>
	//  158  353:new             #8   <Class MetaData$a>
	//  159  356:dup             
	//  160  357:aload_0         
	//  161  358:ldc2            #447 <String "logo">
	//  162  361:invokespecial   #425 <Method void MetaData$a(Context, String)>
	//  163  364:iconst_0        
	//  164  365:invokespecial   #428 <Method void com.startapp.common.a(String, com.startapp.common.a$a, int)>
	//  165  368:invokevirtual   #430 <Method void com.startapp.common.a.a()>
_L2:
		return;
	//  166  371:return          
_L4:
		if(i.a(32L))
	//* 167  372:ldc2w           #448 <Long 32L>
	//* 168  375:invokestatic    #435 <Method boolean i.a(long)>
	//* 169  378:ifeq            371
		{
			String as2[] = AdsConstants.l;
	//  170  381:getstatic       #443 <Field String[] AdsConstants.l>
	//  171  384:astore          4
			int l1 = as2.length;
	//  172  386:aload           4
	//  173  388:arraylength     
	//  174  389:istore_3        
			int i1 = 0;
	//  175  390:iconst_0        
	//  176  391:istore_2        
			while(i1 < l1) 
	//* 177  392:iload_2         
	//* 178  393:iload_3         
	//* 179  394:icmpge          371
			{
				String s3 = as2[i1];
	//  180  397:aload           4
	//  181  399:iload_2         
	//  182  400:aaload          
	//  183  401:astore          5
				if(!com.startapp.android.publish.adsCommon.Utils.a.a(context, (new StringBuilder()).append(s3).append(".png").toString(), ".png"))
	//* 184  403:aload_0         
	//* 185  404:new             #339 <Class StringBuilder>
	//* 186  407:dup             
	//* 187  408:invokespecial   #340 <Method void StringBuilder()>
	//* 188  411:aload           5
	//* 189  413:invokevirtual   #344 <Method StringBuilder StringBuilder.append(String)>
	//* 190  416:ldc2            #412 <String ".png">
	//* 191  419:invokevirtual   #344 <Method StringBuilder StringBuilder.append(String)>
	//* 192  422:invokevirtual   #350 <Method String StringBuilder.toString()>
	//* 193  425:ldc2            #412 <String ".png">
	//* 194  428:invokestatic    #417 <Method boolean com.startapp.android.publish.adsCommon.Utils.a.a(Context, String, String)>
	//* 195  431:ifne            480
					(new com.startapp.common.a((new StringBuilder()).append(s).append(s3).append(".png").toString(), ((com.startapp.common.a.a) (new a(context, s3))), 0)).a();
	//  196  434:new             #421 <Class com.startapp.common.a>
	//  197  437:dup             
	//  198  438:new             #339 <Class StringBuilder>
	//  199  441:dup             
	//  200  442:invokespecial   #340 <Method void StringBuilder()>
	//  201  445:aload_1         
	//  202  446:invokevirtual   #344 <Method StringBuilder StringBuilder.append(String)>
	//  203  449:aload           5
	//  204  451:invokevirtual   #344 <Method StringBuilder StringBuilder.append(String)>
	//  205  454:ldc2            #412 <String ".png">
	//  206  457:invokevirtual   #344 <Method StringBuilder StringBuilder.append(String)>
	//  207  460:invokevirtual   #350 <Method String StringBuilder.toString()>
	//  208  463:new             #8   <Class MetaData$a>
	//  209  466:dup             
	//  210  467:aload_0         
	//  211  468:aload           5
	//  212  470:invokespecial   #425 <Method void MetaData$a(Context, String)>
	//  213  473:iconst_0        
	//  214  474:invokespecial   #428 <Method void com.startapp.common.a(String, com.startapp.common.a$a, int)>
	//  215  477:invokevirtual   #430 <Method void com.startapp.common.a.a()>
				i1++;
	//  216  480:iload_2         
	//  217  481:iconst_1        
	//  218  482:iadd            
	//  219  483:istore_2        
			}
		}
		if(true) goto _L2; else goto _L5
	//  220  484:goto            392
_L5:
	}

	private String replaceAdProtocol(String s, String s1)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
			s1 = s.replace("%AdPlatformProtocol%", "1.5");
	//    2    4:aload_1         
	//    3    5:ldc2            #453 <String "%AdPlatformProtocol%">
	//    4    8:ldc2            #455 <String "1.5">
	//    5   11:invokevirtual   #459 <Method String String.replace(CharSequence, CharSequence)>
	//    6   14:astore_2        
		return s1;
	//    7   15:aload_2         
	//    8   16:areturn         
	}

	public static void update(Context context, MetaData metadata)
	{
		Object obj = lock;
	//    0    0:getstatic       #126 <Field Object lock>
	//    1    3:astore_2        
		obj;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		metadata.metaDataListeners = getInstance().metaDataListeners;
	//    4    6:aload_1         
	//    5    7:invokestatic    #309 <Method MetaData getInstance()>
	//    6   10:getfield        #287 <Field List metaDataListeners>
	//    7   13:putfield        #287 <Field List metaDataListeners>
		instance = metadata;
	//    8   16:aload_1         
	//    9   17:putstatic       #195 <Field MetaData instance>
		if(Constants.a().booleanValue())
	//*  10   20:invokestatic    #464 <Method Boolean Constants.a()>
	//*  11   23:invokevirtual   #469 <Method boolean Boolean.booleanValue()>
	//*  12   26:ifeq            44
		{
			g.a(3, "MetaData received:");
	//   13   29:iconst_3        
	//   14   30:ldc2            #471 <String "MetaData received:">
	//   15   33:invokestatic    #476 <Method void g.a(int, String)>
			g.a(3, com.startapp.common.c.b.a(((Object) (metadata))));
	//   16   36:iconst_3        
	//   17   37:aload_1         
	//   18   38:invokestatic    #481 <Method String b.a(Object)>
	//   19   41:invokestatic    #476 <Method void g.a(int, String)>
		}
		getInstance().applyAdPlatformProtocolToHosts();
	//   20   44:invokestatic    #309 <Method MetaData getInstance()>
	//   21   47:invokevirtual   #402 <Method void applyAdPlatformProtocolToHosts()>
		metadata.metadataUpdateVersion = AdsConstants.h;
	//   22   50:aload_1         
	//   23   51:getstatic       #292 <Field String AdsConstants.h>
	//   24   54:putfield        #294 <Field String metadataUpdateVersion>
		e.b(context, "StartappMetadata", ((Serializable) (metadata)));
	//   25   57:aload_0         
	//   26   58:ldc2            #370 <String "StartappMetadata">
	//   27   61:aload_1         
	//   28   62:invokestatic    #484 <Method void e.b(Context, String, Serializable)>
		g.a(3, "MetaData saved:");
	//   29   65:iconst_3        
	//   30   66:ldc2            #486 <String "MetaData saved:">
	//   31   69:invokestatic    #476 <Method void g.a(int, String)>
		getInstance().loading = false;
	//   32   72:invokestatic    #309 <Method MetaData getInstance()>
	//   33   75:iconst_0        
	//   34   76:putfield        #280 <Field boolean loading>
		getInstance().ready = true;
	//   35   79:invokestatic    #309 <Method MetaData getInstance()>
	//   36   82:iconst_1        
	//   37   83:putfield        #282 <Field boolean ready>
		if(getInstance().metaDataListeners != null)
	//*  38   86:invokestatic    #309 <Method MetaData getInstance()>
	//*  39   89:getfield        #287 <Field List metaDataListeners>
	//*  40   92:ifnull          158
		{
			metadata = ((MetaData) (new ArrayList(((java.util.Collection) (getInstance().metaDataListeners)))));
	//   41   95:new             #284 <Class ArrayList>
	//   42   98:dup             
	//   43   99:invokestatic    #309 <Method MetaData getInstance()>
	//   44  102:getfield        #287 <Field List metaDataListeners>
	//   45  105:invokespecial   #310 <Method void ArrayList(java.util.Collection)>
	//   46  108:astore_1        
			getInstance().metaDataListeners.clear();
	//   47  109:invokestatic    #309 <Method MetaData getInstance()>
	//   48  112:getfield        #287 <Field List metaDataListeners>
	//   49  115:invokeinterface #315 <Method void List.clear()>
			for(metadata = ((MetaData) (((List) (metadata)).iterator())); ((Iterator) (metadata)).hasNext(); ((com.startapp.android.publish.common.metaData.d)((Iterator) (metadata)).next()).a());
	//   50  120:aload_1         
	//   51  121:invokeinterface #319 <Method Iterator List.iterator()>
	//   52  126:astore_1        
	//   53  127:aload_1         
	//   54  128:invokeinterface #325 <Method boolean Iterator.hasNext()>
	//   55  133:ifeq            158
	//   56  136:aload_1         
	//   57  137:invokeinterface #329 <Method Object Iterator.next()>
	//   58  142:checkcast       #331 <Class com.startapp.android.publish.common.metaData.d>
	//   59  145:invokeinterface #487 <Method void com.startapp.android.publish.common.metaData.d.a()>
		}
		break MISSING_BLOCK_LABEL_158;
	//   60  150:goto            127
		context;
	//   61  153:astore_0        
		obj;
	//   62  154:aload_2         
		JVM INSTR monitorexit ;
	//   63  155:monitorexit     
		throw context;
	//   64  156:aload_0         
	//   65  157:athrow          
		k.b(context, "totalSessions", Integer.valueOf(k.a(context, "totalSessions", Integer.valueOf(0)).intValue() + 1));
	//   66  158:aload_0         
	//   67  159:ldc2            #489 <String "totalSessions">
	//   68  162:aload_0         
	//   69  163:ldc2            #489 <String "totalSessions">
	//   70  166:iconst_0        
	//   71  167:invokestatic    #190 <Method Integer Integer.valueOf(int)>
	//   72  170:invokestatic    #494 <Method Integer k.a(Context, String, Integer)>
	//   73  173:invokevirtual   #498 <Method int Integer.intValue()>
	//   74  176:iconst_1        
	//   75  177:iadd            
	//   76  178:invokestatic    #190 <Method Integer Integer.valueOf(int)>
	//   77  181:invokestatic    #501 <Method void k.b(Context, String, Integer)>
		task = null;
	//   78  184:aconst_null     
	//   79  185:putstatic       #503 <Field com.startapp.android.publish.common.metaData.c task>
		obj;
	//   80  188:aload_2         
		JVM INSTR monitorexit ;
	//   81  189:monitorexit     
	//   82  190:return          
	}

	public void addMetaDataListener(com.startapp.android.publish.common.metaData.d d1)
	{
		synchronized(lock)
	//*   0    0:getstatic       #126 <Field Object lock>
	//*   1    3:astore_2        
	//*   2    4:aload_2         
	//*   3    5:monitorenter    
		{
			metaDataListeners.add(((Object) (d1)));
	//    4    6:aload_0         
	//    5    7:getfield        #287 <Field List metaDataListeners>
	//    6   10:aload_1         
	//    7   11:invokeinterface #508 <Method boolean List.add(Object)>
	//    8   16:pop             
		}
	//    9   17:aload_2         
	//   10   18:monitorexit     
		return;
	//   11   19:return          
		d1;
	//   12   20:astore_1        
		obj;
	//   13   21:aload_2         
		JVM INSTR monitorexit ;
	//   14   22:monitorexit     
		throw d1;
	//   15   23:aload_1         
	//   16   24:athrow          
	}

	public void applyAdPlatformProtocolToHosts()
	{
		adPlatformHostSecured = replaceAdProtocol(adPlatformHostSecured, DEFAULT_AD_PLATFORM_HOST);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #205 <Field String adPlatformHostSecured>
	//    4    6:getstatic       #171 <Field String DEFAULT_AD_PLATFORM_HOST>
	//    5    9:invokespecial   #510 <Method String replaceAdProtocol(String, String)>
	//    6   12:putfield        #205 <Field String adPlatformHostSecured>
		metaDataHostSecured = replaceAdProtocol(metaDataHostSecured, DEFAULT_METADATA_HOST);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #203 <Field String metaDataHostSecured>
	//   11   21:getstatic       #168 <Field String DEFAULT_METADATA_HOST>
	//   12   24:invokespecial   #510 <Method String replaceAdProtocol(String, String)>
	//   13   27:putfield        #203 <Field String metaDataHostSecured>
	//   14   30:return          
	}

	public boolean canShowAd()
	{
		return !dns;
	//    0    0:aload_0         
	//    1    1:getfield        #296 <Field boolean dns>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public String getAdPlatformHost()
	{
		if(AdsConstants.OVERRIDE_HOST != null)
	//*   0    0:getstatic       #515 <Field String AdsConstants.OVERRIDE_HOST>
	//*   1    3:ifnull          10
			return AdsConstants.OVERRIDE_HOST;
	//    2    6:getstatic       #515 <Field String AdsConstants.OVERRIDE_HOST>
	//    3    9:areturn         
		if(adPlatformHostSecured != null)
	//*   4   10:aload_0         
	//*   5   11:getfield        #205 <Field String adPlatformHostSecured>
	//*   6   14:ifnull          22
			return adPlatformHostSecured;
	//    7   17:aload_0         
	//    8   18:getfield        #205 <Field String adPlatformHostSecured>
	//    9   21:areturn         
		else
			return DEFAULT_AD_PLATFORM_HOST;
	//   10   22:getstatic       #171 <Field String DEFAULT_AD_PLATFORM_HOST>
	//   11   25:areturn         
	}

	public com.startapp.android.publish.adsCommon.e.a getAnalyticsConfig()
	{
		return analytics;
	//    0    0:aload_0         
	//    1    1:getfield        #271 <Field a analytics>
	//    2    4:areturn         
	}

	public String getAssetsBaseUrl()
	{
		if(assetsBaseUrlSecured != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #261 <Field String assetsBaseUrlSecured>
	//*   2    4:ifnull          12
			return assetsBaseUrlSecured;
	//    3    7:aload_0         
	//    4    8:getfield        #261 <Field String assetsBaseUrlSecured>
	//    5   11:areturn         
		else
			return "";
	//    6   12:ldc1            #20  <String "">
	//    7   14:areturn         
	}

	public com.startapp.android.publish.common.metaData.b getBluetoothConfig()
	{
		return btConfig;
	//    0    0:aload_0         
	//    1    1:getfield        #259 <Field com.startapp.android.publish.common.metaData.b btConfig>
	//    2    4:areturn         
	}

	public String getHostForWebview()
	{
		return getHostForWebview(getInstance().getAdPlatformHost(), android.os.Build.VERSION.SDK_INT, webViewSecured);
	//    0    0:invokestatic    #309 <Method MetaData getInstance()>
	//    1    3:invokevirtual   #522 <Method String getAdPlatformHost()>
	//    2    6:getstatic       #527 <Field int android.os.Build$VERSION.SDK_INT>
	//    3    9:aload_0         
	//    4   10:getfield        #304 <Field boolean webViewSecured>
	//    5   13:invokestatic    #529 <Method String getHostForWebview(String, int, boolean)>
	//    6   16:areturn         
	}

	public long getIABDisplayImpressionDelayInSeconds()
	{
		return IABDisplayImpressionDelayInSeconds;
	//    0    0:aload_0         
	//    1    1:getfield        #239 <Field long IABDisplayImpressionDelayInSeconds>
	//    2    4:lreturn         
	}

	public long getIABVideoImpressionDelayInSeconds()
	{
		return IABVideoImpressionDelayInSeconds;
	//    0    0:aload_0         
	//    1    1:getfield        #243 <Field long IABVideoImpressionDelayInSeconds>
	//    2    4:lreturn         
	}

	public b getInAppBrowserPreLoad()
	{
		return inAppBrowserPreLoad;
	//    0    0:aload_0         
	//    1    1:getfield        #536 <Field MetaData$b inAppBrowserPreLoad>
	//    2    4:areturn         
	}

	public Set getInstallersList()
	{
		return installersList;
	//    0    0:aload_0         
	//    1    1:getfield        #211 <Field Set installersList>
	//    2    4:areturn         
	}

	public Set getInvalidForRetry()
	{
		if(invalidForRetry != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #264 <Field Set invalidForRetry>
	//*   2    4:ifnull          12
			return invalidForRetry;
	//    3    7:aload_0         
	//    4    8:getfield        #264 <Field Set invalidForRetry>
	//    5   11:areturn         
		else
			return ((Set) (new HashSet()));
	//    6   12:new             #128 <Class HashSet>
	//    7   15:dup             
	//    8   16:invokespecial   #262 <Method void HashSet()>
	//    9   19:areturn         
	}

	public Set getInvalidNetworkCodesInfoEvents()
	{
		if(invalidNetworkCodesInfoEvents != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #266 <Field Set invalidNetworkCodesInfoEvents>
	//*   2    4:ifnull          12
			return invalidNetworkCodesInfoEvents;
	//    3    7:aload_0         
	//    4    8:getfield        #266 <Field Set invalidNetworkCodesInfoEvents>
	//    5   11:areturn         
		else
			return DEFAULT_INVALID_NETWORK_CODES_INFO_EVENTS;
	//    6   12:getstatic       #192 <Field Set DEFAULT_INVALID_NETWORK_CODES_INFO_EVENTS>
	//    7   15:areturn         
	}

	public LocationConfig getLocationConfig()
	{
		return location;
	//    0    0:aload_0         
	//    1    1:getfield        #276 <Field LocationConfig location>
	//    2    4:areturn         
	}

	public String getMetaDataHost()
	{
		if(AdsConstants.OVERRIDE_HOST != null)
	//*   0    0:getstatic       #515 <Field String AdsConstants.OVERRIDE_HOST>
	//*   1    3:ifnull          10
			return AdsConstants.OVERRIDE_HOST;
	//    2    6:getstatic       #515 <Field String AdsConstants.OVERRIDE_HOST>
	//    3    9:areturn         
		else
			return metaDataHostSecured;
	//    4   10:aload_0         
	//    5   11:getfield        #203 <Field String metaDataHostSecured>
	//    6   14:areturn         
	}

	public int getPeriodicInfoEventIntervalInMinutes(Context context)
	{
		if(periodicEventIntMin == null || periodicEventIntMin.length < 3)
	//*   0    0:aload_0         
	//*   1    1:getfield        #233 <Field int[] periodicEventIntMin>
	//*   2    4:ifnull          16
	//*   3    7:aload_0         
	//*   4    8:getfield        #233 <Field int[] periodicEventIntMin>
	//*   5   11:arraylength     
	//*   6   12:iconst_3        
	//*   7   13:icmpge          23
			periodicEventIntMin = DEFAULT_PERIODIC_INFOEVENT_INTERVALS;
	//    8   16:aload_0         
	//    9   17:getstatic       #175 <Field int[] DEFAULT_PERIODIC_INFOEVENT_INTERVALS>
	//   10   20:putfield        #233 <Field int[] periodicEventIntMin>
		int j;
		if(c.a(context, "android.permission.ACCESS_FINE_LOCATION"))
	//*  11   23:aload_1         
	//*  12   24:ldc2            #550 <String "android.permission.ACCESS_FINE_LOCATION">
	//*  13   27:invokestatic    #555 <Method boolean c.a(Context, String)>
	//*  14   30:ifeq            54
		{
			int l = periodicEventIntMin[0];
	//   15   33:aload_0         
	//   16   34:getfield        #233 <Field int[] periodicEventIntMin>
	//   17   37:iconst_0        
	//   18   38:iaload          
	//   19   39:istore_3        
			j = l;
	//   20   40:iload_3         
	//   21   41:istore_2        
			if(l <= 0)
	//*  22   42:iload_3         
	//*  23   43:ifgt            52
				j = DEFAULT_PERIODIC_INFOEVENT_INTERVALS[0];
	//   24   46:getstatic       #175 <Field int[] DEFAULT_PERIODIC_INFOEVENT_INTERVALS>
	//   25   49:iconst_0        
	//   26   50:iaload          
	//   27   51:istore_2        
		} else
	//*  28   52:iload_2         
	//*  29   53:ireturn         
		if(c.a(context, "android.permission.ACCESS_COARSE_LOCATION"))
	//*  30   54:aload_1         
	//*  31   55:ldc2            #557 <String "android.permission.ACCESS_COARSE_LOCATION">
	//*  32   58:invokestatic    #555 <Method boolean c.a(Context, String)>
	//*  33   61:ifeq            83
		{
			int i1 = periodicEventIntMin[1];
	//   34   64:aload_0         
	//   35   65:getfield        #233 <Field int[] periodicEventIntMin>
	//   36   68:iconst_1        
	//   37   69:iaload          
	//   38   70:istore_3        
			j = i1;
	//   39   71:iload_3         
	//   40   72:istore_2        
			if(i1 <= 0)
	//*  41   73:iload_3         
	//*  42   74:ifgt            52
				return DEFAULT_PERIODIC_INFOEVENT_INTERVALS[1];
	//   43   77:getstatic       #175 <Field int[] DEFAULT_PERIODIC_INFOEVENT_INTERVALS>
	//   44   80:iconst_1        
	//   45   81:iaload          
	//   46   82:ireturn         
		} else
		{
			return periodicEventIntMin[2];
	//   47   83:aload_0         
	//   48   84:getfield        #233 <Field int[] periodicEventIntMin>
	//   49   87:iconst_2        
	//   50   88:iaload          
	//   51   89:ireturn         
		}
		return j;
	}

	public int getPeriodicMetaDataInterval()
	{
		return periodicMetaDataIntervalInMinutes;
	//    0    0:aload_0         
	//    1    1:getfield        #225 <Field int periodicMetaDataIntervalInMinutes>
	//    2    4:ireturn         
	}

	public Set getPreInstalledPackages()
	{
		Set set1 = preInstalledPackages;
	//    0    0:aload_0         
	//    1    1:getfield        #213 <Field Set preInstalledPackages>
	//    2    4:astore_2        
		Set set = set1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(set1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       15
			set = DEFAULT_PRE_INSTALLED_PACKAGES;
	//    7   11:getstatic       #184 <Field Set DEFAULT_PRE_INSTALLED_PACKAGES>
	//    8   14:astore_1        
		return Collections.unmodifiableSet(set);
	//    9   15:aload_1         
	//   10   16:invokestatic    #565 <Method Set Collections.unmodifiableSet(Set)>
	//   11   19:areturn         
	}

	public String getProfileId()
	{
		return profileId;
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field String profileId>
	//    2    4:areturn         
	}

	public com.startapp.android.publish.common.metaData.g getSensorsConfig()
	{
		return sensorsConfig;
	//    0    0:aload_0         
	//    1    1:getfield        #254 <Field com.startapp.android.publish.common.metaData.g sensorsConfig>
	//    2    4:areturn         
	}

	public long getSessionMaxBackgroundTime()
	{
		return TimeUnit.SECONDS.toMillis(sessionMaxBackgroundTime);
	//    0    0:getstatic       #575 <Field TimeUnit TimeUnit.SECONDS>
	//    1    3:aload_0         
	//    2    4:getfield        #207 <Field int sessionMaxBackgroundTime>
	//    3    7:i2l             
	//    4    8:invokevirtual   #579 <Method long TimeUnit.toMillis(long)>
	//    5   11:lreturn         
	}

	public h getSimpleTokenConfig()
	{
		return SimpleToken;
	//    0    0:aload_0         
	//    1    1:getfield        #201 <Field h SimpleToken>
	//    2    4:areturn         
	}

	public int getStopAutoLoadAmount()
	{
		return stopAutoLoadAmount;
	//    0    0:aload_0         
	//    1    1:getfield        #298 <Field int stopAutoLoadAmount>
	//    2    4:ireturn         
	}

	public int getStopAutoLoadPreCacheAmount()
	{
		return stopAutoLoadPreCacheAmount;
	//    0    0:aload_0         
	//    1    1:getfield        #300 <Field int stopAutoLoadPreCacheAmount>
	//    2    4:ireturn         
	}

	public boolean getTrueNetEnabled()
	{
		return trueNetEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #302 <Field boolean trueNetEnabled>
	//    2    4:ireturn         
	}

	public long getUserAgentDelayInSeconds()
	{
		return userAgentDelayInSeconds;
	//    0    0:aload_0         
	//    1    1:getfield        #247 <Field long userAgentDelayInSeconds>
	//    2    4:lreturn         
	}

	public boolean isAlwaysSendToken()
	{
		return alwaysSendToken;
	//    0    0:aload_0         
	//    1    1:getfield        #217 <Field boolean alwaysSendToken>
	//    2    4:ireturn         
	}

	public boolean isCompressionEnabled()
	{
		return compressionEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #219 <Field boolean compressionEnabled>
	//    2    4:ireturn         
	}

	public boolean isInAppBrowser()
	{
		return i.a(256L) && inAppBrowser;
	//    0    0:ldc2w           #431 <Long 256L>
	//    1    3:invokestatic    #435 <Method boolean i.a(long)>
	//    2    6:ifeq            18
	//    3    9:aload_0         
	//    4   10:getfield        #235 <Field boolean inAppBrowser>
	//    5   13:ifeq            18
	//    6   16:iconst_1        
	//    7   17:ireturn         
	//    8   18:iconst_0        
	//    9   19:ireturn         
	}

	public boolean isLoading()
	{
		return loading;
	//    0    0:aload_0         
	//    1    1:getfield        #280 <Field boolean loading>
	//    2    4:ireturn         
	}

	public boolean isPeriodicInfoEventEnabled()
	{
		return periodicInfoEventEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field boolean periodicInfoEventEnabled>
	//    2    4:ireturn         
	}

	public boolean isPeriodicInfoEventOnRunTimeEnabled()
	{
		return periodicInfoEventOnRunTimeEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field boolean periodicInfoEventOnRunTimeEnabled>
	//    2    4:ireturn         
	}

	public boolean isPeriodicMetaDataEnabled()
	{
		return periodicMetaDataEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #223 <Field boolean periodicMetaDataEnabled>
	//    2    4:ireturn         
	}

	public boolean isReady()
	{
		return ready;
	//    0    0:aload_0         
	//    1    1:getfield        #282 <Field boolean ready>
	//    2    4:ireturn         
	}

	public boolean isSimpleToken2()
	{
		return simpleToken2;
	//    0    0:aload_0         
	//    1    1:getfield        #215 <Field boolean simpleToken2>
	//    2    4:ireturn         
	}

	public boolean isSupportIABViewability()
	{
		return SupportIABViewability;
	//    0    0:aload_0         
	//    1    1:getfield        #237 <Field boolean SupportIABViewability>
	//    2    4:ireturn         
	}

	public boolean isUserAgentEnabled()
	{
		return userAgentEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #249 <Field boolean userAgentEnabled>
	//    2    4:ireturn         
	}

	public boolean isWfScanEnabled()
	{
		return wfScanEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #278 <Field boolean wfScanEnabled>
	//    2    4:ireturn         
	}

	public void loadFromServer(Context context, AdPreferences adpreferences, MetaDataRequest.a a1, boolean flag, com.startapp.android.publish.common.metaData.d d1)
	{
		loadFromServer(context, adpreferences, a1, flag, d1, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:iconst_0        
	//    7    9:invokevirtual   #602 <Method void loadFromServer(Context, AdPreferences, MetaDataRequest$a, boolean, com.startapp.android.publish.common.metaData.d, boolean)>
	//    8   12:return          
	}

	public void loadFromServer(Context context, AdPreferences adpreferences, MetaDataRequest.a a1, boolean flag, com.startapp.android.publish.common.metaData.d d1, boolean flag1)
	{
		if(!flag && d1 != null)
	//*   0    0:iload           4
	//*   1    2:ifne            17
	//*   2    5:aload           5
	//*   3    7:ifnull          17
			d1.a();
	//    4   10:aload           5
	//    5   12:invokeinterface #487 <Method void com.startapp.android.publish.common.metaData.d.a()>
		Object obj = lock;
	//    6   17:getstatic       #126 <Field Object lock>
	//    7   20:astore          7
		obj;
	//    8   22:aload           7
		JVM INSTR monitorenter ;
	//    9   24:monitorenter    
		if(getInstance().isReady() && !flag1)
			break MISSING_BLOCK_LABEL_116;
	//   10   25:invokestatic    #309 <Method MetaData getInstance()>
	//   11   28:invokevirtual   #604 <Method boolean isReady()>
	//   12   31:ifeq            39
	//   13   34:iload           6
	//   14   36:ifeq            116
		if(getInstance().isLoading() && !flag1)
			break MISSING_BLOCK_LABEL_94;
	//   15   39:invokestatic    #309 <Method MetaData getInstance()>
	//   16   42:invokevirtual   #606 <Method boolean isLoading()>
	//   17   45:ifeq            53
	//   18   48:iload           6
	//   19   50:ifeq            94
		loading = true;
	//   20   53:aload_0         
	//   21   54:iconst_1        
	//   22   55:putfield        #280 <Field boolean loading>
		ready = false;
	//   23   58:aload_0         
	//   24   59:iconst_0        
	//   25   60:putfield        #282 <Field boolean ready>
		if(task != null)
	//*  26   63:getstatic       #503 <Field com.startapp.android.publish.common.metaData.c task>
	//*  27   66:ifnull          75
			task.b();
	//   28   69:getstatic       #503 <Field com.startapp.android.publish.common.metaData.c task>
	//   29   72:invokevirtual   #609 <Method void com.startapp.android.publish.common.metaData.c.b()>
		task = new com.startapp.android.publish.common.metaData.c(context, adpreferences, a1);
	//   30   75:new             #608 <Class com.startapp.android.publish.common.metaData.c>
	//   31   78:dup             
	//   32   79:aload_1         
	//   33   80:aload_2         
	//   34   81:aload_3         
	//   35   82:invokespecial   #612 <Method void com.startapp.android.publish.common.metaData.c(Context, AdPreferences, MetaDataRequest$a)>
	//   36   85:putstatic       #503 <Field com.startapp.android.publish.common.metaData.c task>
		task.a();
	//   37   88:getstatic       #503 <Field com.startapp.android.publish.common.metaData.c task>
	//   38   91:invokevirtual   #613 <Method void com.startapp.android.publish.common.metaData.c.a()>
		if(!flag || d1 == null)
			break MISSING_BLOCK_LABEL_112;
	//   39   94:iload           4
	//   40   96:ifeq            112
	//   41   99:aload           5
	//   42  101:ifnull          112
		getInstance().addMetaDataListener(d1);
	//   43  104:invokestatic    #309 <Method MetaData getInstance()>
	//   44  107:aload           5
	//   45  109:invokevirtual   #615 <Method void addMetaDataListener(com.startapp.android.publish.common.metaData.d)>
		obj;
	//   46  112:aload           7
		JVM INSTR monitorexit ;
	//   47  114:monitorexit     
		return;
	//   48  115:return          
		obj;
	//   49  116:aload           7
		JVM INSTR monitorexit ;
	//   50  118:monitorexit     
		if(flag && d1 != null)
	//*  51  119:iload           4
	//*  52  121:ifeq            143
	//*  53  124:aload           5
	//*  54  126:ifnull          143
		{
			d1.a();
	//   55  129:aload           5
	//   56  131:invokeinterface #487 <Method void com.startapp.android.publish.common.metaData.d.a()>
			return;
	//   57  136:return          
		} else
	//*  58  137:astore_1        
	//*  59  138:aload           7
	//*  60  140:monitorexit     
	//*  61  141:aload_1         
	//*  62  142:athrow          
		{
			return;
	//   63  143:return          
		}
		context;
		obj;
		JVM INSTR monitorexit ;
		throw context;
	}

	public void removeMetaDataListener(com.startapp.android.publish.common.metaData.d d1)
	{
		synchronized(lock)
	//*   0    0:getstatic       #126 <Field Object lock>
	//*   1    3:astore_2        
	//*   2    4:aload_2         
	//*   3    5:monitorenter    
		{
			metaDataListeners.remove(((Object) (d1)));
	//    4    6:aload_0         
	//    5    7:getfield        #287 <Field List metaDataListeners>
	//    6   10:aload_1         
	//    7   11:invokeinterface #619 <Method boolean List.remove(Object)>
	//    8   16:pop             
		}
	//    9   17:aload_2         
	//   10   18:monitorexit     
		return;
	//   11   19:return          
		d1;
	//   12   20:astore_1        
		obj;
	//   13   21:aload_2         
		JVM INSTR monitorexit ;
	//   14   22:monitorexit     
		throw d1;
	//   15   23:aload_1         
	//   16   24:athrow          
	}

	public void setAlwaysSendToken(boolean flag)
	{
		alwaysSendToken = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #217 <Field boolean alwaysSendToken>
	//    3    5:return          
	}

	public void setCompressionEnabled(boolean flag)
	{
		compressionEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #219 <Field boolean compressionEnabled>
	//    3    5:return          
	}

	public void setInAppBrowser(boolean flag)
	{
		inAppBrowser = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #235 <Field boolean inAppBrowser>
	//    3    5:return          
	}

	public void setInAppBrowserPreLoad(b b1)
	{
		inAppBrowserPreLoad = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #536 <Field MetaData$b inAppBrowserPreLoad>
	//    3    5:return          
	}

	public void setInstallersList(Set set)
	{
		installersList = set;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #211 <Field Set installersList>
	//    3    5:return          
	}

	public void setPeriodicInfoEventEnabled(boolean flag)
	{
		periodicInfoEventEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #227 <Field boolean periodicInfoEventEnabled>
	//    3    5:return          
	}

	public void setPeriodicInfoEventIntervalInMinutes(int j)
	{
		periodicInfoEventIntervalInMinutes = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #231 <Field int periodicInfoEventIntervalInMinutes>
	//    3    5:return          
	}

	public void setPeriodicMetaDataEnabled(boolean flag)
	{
		periodicMetaDataEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #223 <Field boolean periodicMetaDataEnabled>
	//    3    5:return          
	}

	public void setPeriodicMetaDataInterval(int j)
	{
		periodicMetaDataIntervalInMinutes = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #225 <Field int periodicMetaDataIntervalInMinutes>
	//    3    5:return          
	}

	public void setPreInstalledPackages(Set set)
	{
		preInstalledPackages = set;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #213 <Field Set preInstalledPackages>
	//    3    5:return          
	}

	public void setReady(boolean flag)
	{
		ready = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #282 <Field boolean ready>
	//    3    5:return          
	}

	public void setSimpleToken2(boolean flag)
	{
		simpleToken2 = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #215 <Field boolean simpleToken2>
	//    3    5:return          
	}

	protected void setSimpleTokenConfig(h h1)
	{
		SimpleToken = h1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #201 <Field h SimpleToken>
	//    3    5:return          
	}

	public static final String DEFAULT_AD_PLATFORM_HOST = new String(new byte[] {
		104, 116, 116, 112, 115, 58, 47, 47, 114, 101, 
		113, 46, 115, 116, 97, 114, 116, 97, 112, 112, 
		115, 101, 114, 118, 105, 99, 101, 46, 99, 111, 
		109, 47, 49, 46, 53, 47
	});
	public static final boolean DEFAULT_ALWAYS_SEND_TOKEN = true;
	public static final String DEFAULT_ASSETS_BASE_URL_SECURED = "";
	public static final boolean DEFAULT_BT_ENABLED = false;
	public static final boolean DEFAULT_COMPRESSION_ENABLED = false;
	public static final boolean DEFAULT_INAPPBROWSER = true;
	public static final Set DEFAULT_INSTALLERS_LIST;
	public static final Set DEFAULT_INVALID_NETWORK_CODES_INFO_EVENTS = new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new Integer[] {
		Integer.valueOf(204)
	}))))));
	public static final long DEFAULT_LAST_KNOWN_LOCATION_THRESHOLD = 30L;
	public static final String DEFAULT_LOCATION_SOURCE = "API";
	public static final String DEFAULT_METADATA_HOST = new String(new byte[] {
		104, 116, 116, 112, 115, 58, 47, 47, 105, 110, 
		105, 116, 46, 115, 116, 97, 114, 116, 97, 112, 
		112, 115, 101, 114, 118, 105, 99, 101, 46, 99, 
		111, 109, 47, 49, 46, 53, 47
	});
	public static final boolean DEFAULT_PERIODIC_INFOEVENT_ENABLED = false;
	public static final int DEFAULT_PERIODIC_INFOEVENT_INTERVAL = 360;
	public static final int DEFAULT_PERIODIC_INFOEVENT_INTERVALS[] = {
		60, 60, 240
	};
	public static final boolean DEFAULT_PERIODIC_INFOEVENT_ON_RUN_TIME = false;
	public static final boolean DEFAULT_PERIODIC_METADATA_ENABLED = false;
	public static final int DEFAULT_PERIODIC_METADATA_INTERVAL = 360;
	public static final Set DEFAULT_PRE_INSTALLED_PACKAGES = new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
		new String(new byte[] {
			99, 111, 109, 46, 102, 97, 99, 101, 98, 111, 
			111, 107, 46, 107, 97, 116, 97, 110, 97
		}), new String(new byte[] {
			99, 111, 109, 46, 121, 97, 110, 100, 101, 120, 
			46, 98, 114, 111, 119, 115, 101, 114
		})
	}))))));
	public static final String DEFAULT_PROFILE_ID = null;
	public static final int DEFAULT_SESSION_MAX_BACKGROUND_TIME = 1800;
	public static final boolean DEFAULT_SIMPLE_TOKEN_ENABLED = true;
	public static final int DEFAULT_STOP_AUTO_LOAD_AMOUNT = 3;
	public static final int DEFAULT_STOP_AUTO_LOAD_PRE_CAHE_AMOUNT = 3;
	public static final boolean DEFAULT_WF_SCAN_ENABLED = false;
	public static final String KEY_METADATA = "metaData";
	private static transient MetaData instance = new MetaData();
	private static transient Object lock = new Object();
	private static final long serialVersionUID = 1L;
	private static transient com.startapp.android.publish.common.metaData.c task;
	private long IABDisplayImpressionDelayInSeconds;
	private long IABVideoImpressionDelayInSeconds;
	private h SimpleToken;
	private boolean SupportIABViewability;
	public String adPlatformHostSecured;
	private boolean alwaysSendToken;
	public com.startapp.android.publish.adsCommon.e.a analytics;
	private String assetsBaseUrlSecured;
	private com.startapp.android.publish.common.metaData.b btConfig;
	private boolean btEnabled;
	private boolean compressionEnabled;
	private boolean dns;
	private boolean inAppBrowser;
	private b inAppBrowserPreLoad;
	private Set installersList;
	private Set invalidForRetry;
	private Set invalidNetworkCodesInfoEvents;
	private transient boolean loading;
	private LocationConfig location;
	public String metaDataHostSecured;
	private transient List metaDataListeners;
	private String metadataUpdateVersion;
	private int periodicEventIntMin[];
	private boolean periodicInfoEventEnabled;
	private int periodicInfoEventIntervalInMinutes;
	private boolean periodicInfoEventOnRunTimeEnabled;
	private boolean periodicMetaDataEnabled;
	private int periodicMetaDataIntervalInMinutes;
	private Set preInstalledPackages;
	private String profileId;
	private transient boolean ready;
	private com.startapp.android.publish.common.metaData.g sensorsConfig;
	private int sessionMaxBackgroundTime;
	private boolean simpleToken2;
	private int stopAutoLoadAmount;
	private int stopAutoLoadPreCacheAmount;
	private boolean trueNetEnabled;
	private long userAgentDelayInSeconds;
	private boolean userAgentEnabled;
	private boolean webViewSecured;
	private boolean wfScanEnabled;

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #124 <Method void Object()>
	//    3    7:putstatic       #126 <Field Object lock>
		DEFAULT_INSTALLERS_LIST = ((Set) (new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
			Constants.a
		}))))))));
	//    4   10:new             #128 <Class HashSet>
	//    5   13:dup             
	//    6   14:iconst_1        
	//    7   15:anewarray       String[]
	//    8   18:dup             
	//    9   19:iconst_0        
	//   10   20:getstatic       #134 <Field String Constants.a>
	//   11   23:aastore         
	//   12   24:invokestatic    #140 <Method List Arrays.asList(Object[])>
	//   13   27:invokespecial   #143 <Method void HashSet(java.util.Collection)>
	//   14   30:putstatic       #145 <Field Set DEFAULT_INSTALLERS_LIST>
	//   15   33:new             #130 <Class String>
	//   16   36:dup             
	//   17   37:bipush          37
	//   18   39:newarray        byte[]
	//   19   41:dup             
	//   20   42:iconst_0        
	//   21   43:ldc1            #146 <Int 104>
	//   22   45:bastore         
	//   23   46:dup             
	//   24   47:iconst_1        
	//   25   48:ldc1            #147 <Int 116>
	//   26   50:bastore         
	//   27   51:dup             
	//   28   52:iconst_2        
	//   29   53:ldc1            #147 <Int 116>
	//   30   55:bastore         
	//   31   56:dup             
	//   32   57:iconst_3        
	//   33   58:ldc1            #148 <Int 112>
	//   34   60:bastore         
	//   35   61:dup             
	//   36   62:iconst_4        
	//   37   63:ldc1            #149 <Int 115>
	//   38   65:bastore         
	//   39   66:dup             
	//   40   67:iconst_5        
	//   41   68:ldc1            #150 <Int 58>
	//   42   70:bastore         
	//   43   71:dup             
	//   44   72:bipush          6
	//   45   74:ldc1            #151 <Int 47>
	//   46   76:bastore         
	//   47   77:dup             
	//   48   78:bipush          7
	//   49   80:ldc1            #151 <Int 47>
	//   50   82:bastore         
	//   51   83:dup             
	//   52   84:bipush          8
	//   53   86:ldc1            #152 <Int 105>
	//   54   88:bastore         
	//   55   89:dup             
	//   56   90:bipush          9
	//   57   92:ldc1            #153 <Int 110>
	//   58   94:bastore         
	//   59   95:dup             
	//   60   96:bipush          10
	//   61   98:ldc1            #152 <Int 105>
	//   62  100:bastore         
	//   63  101:dup             
	//   64  102:bipush          11
	//   65  104:ldc1            #147 <Int 116>
	//   66  106:bastore         
	//   67  107:dup             
	//   68  108:bipush          12
	//   69  110:ldc1            #154 <Int 46>
	//   70  112:bastore         
	//   71  113:dup             
	//   72  114:bipush          13
	//   73  116:ldc1            #149 <Int 115>
	//   74  118:bastore         
	//   75  119:dup             
	//   76  120:bipush          14
	//   77  122:ldc1            #147 <Int 116>
	//   78  124:bastore         
	//   79  125:dup             
	//   80  126:bipush          15
	//   81  128:ldc1            #155 <Int 97>
	//   82  130:bastore         
	//   83  131:dup             
	//   84  132:bipush          16
	//   85  134:ldc1            #156 <Int 114>
	//   86  136:bastore         
	//   87  137:dup             
	//   88  138:bipush          17
	//   89  140:ldc1            #147 <Int 116>
	//   90  142:bastore         
	//   91  143:dup             
	//   92  144:bipush          18
	//   93  146:ldc1            #155 <Int 97>
	//   94  148:bastore         
	//   95  149:dup             
	//   96  150:bipush          19
	//   97  152:ldc1            #148 <Int 112>
	//   98  154:bastore         
	//   99  155:dup             
	//  100  156:bipush          20
	//  101  158:ldc1            #148 <Int 112>
	//  102  160:bastore         
	//  103  161:dup             
	//  104  162:bipush          21
	//  105  164:ldc1            #149 <Int 115>
	//  106  166:bastore         
	//  107  167:dup             
	//  108  168:bipush          22
	//  109  170:ldc1            #157 <Int 101>
	//  110  172:bastore         
	//  111  173:dup             
	//  112  174:bipush          23
	//  113  176:ldc1            #156 <Int 114>
	//  114  178:bastore         
	//  115  179:dup             
	//  116  180:bipush          24
	//  117  182:ldc1            #158 <Int 118>
	//  118  184:bastore         
	//  119  185:dup             
	//  120  186:bipush          25
	//  121  188:ldc1            #152 <Int 105>
	//  122  190:bastore         
	//  123  191:dup             
	//  124  192:bipush          26
	//  125  194:ldc1            #159 <Int 99>
	//  126  196:bastore         
	//  127  197:dup             
	//  128  198:bipush          27
	//  129  200:ldc1            #157 <Int 101>
	//  130  202:bastore         
	//  131  203:dup             
	//  132  204:bipush          28
	//  133  206:ldc1            #154 <Int 46>
	//  134  208:bastore         
	//  135  209:dup             
	//  136  210:bipush          29
	//  137  212:ldc1            #159 <Int 99>
	//  138  214:bastore         
	//  139  215:dup             
	//  140  216:bipush          30
	//  141  218:ldc1            #160 <Int 111>
	//  142  220:bastore         
	//  143  221:dup             
	//  144  222:bipush          31
	//  145  224:ldc1            #161 <Int 109>
	//  146  226:bastore         
	//  147  227:dup             
	//  148  228:bipush          32
	//  149  230:ldc1            #151 <Int 47>
	//  150  232:bastore         
	//  151  233:dup             
	//  152  234:bipush          33
	//  153  236:ldc1            #162 <Int 49>
	//  154  238:bastore         
	//  155  239:dup             
	//  156  240:bipush          34
	//  157  242:ldc1            #154 <Int 46>
	//  158  244:bastore         
	//  159  245:dup             
	//  160  246:bipush          35
	//  161  248:ldc1            #163 <Int 53>
	//  162  250:bastore         
	//  163  251:dup             
	//  164  252:bipush          36
	//  165  254:ldc1            #151 <Int 47>
	//  166  256:bastore         
	//  167  257:invokespecial   #166 <Method void String(byte[])>
	//  168  260:putstatic       #168 <Field String DEFAULT_METADATA_HOST>
	//  169  263:new             #130 <Class String>
	//  170  266:dup             
	//  171  267:bipush          36
	//  172  269:newarray        byte[]
	//  173  271:dup             
	//  174  272:iconst_0        
	//  175  273:ldc1            #146 <Int 104>
	//  176  275:bastore         
	//  177  276:dup             
	//  178  277:iconst_1        
	//  179  278:ldc1            #147 <Int 116>
	//  180  280:bastore         
	//  181  281:dup             
	//  182  282:iconst_2        
	//  183  283:ldc1            #147 <Int 116>
	//  184  285:bastore         
	//  185  286:dup             
	//  186  287:iconst_3        
	//  187  288:ldc1            #148 <Int 112>
	//  188  290:bastore         
	//  189  291:dup             
	//  190  292:iconst_4        
	//  191  293:ldc1            #149 <Int 115>
	//  192  295:bastore         
	//  193  296:dup             
	//  194  297:iconst_5        
	//  195  298:ldc1            #150 <Int 58>
	//  196  300:bastore         
	//  197  301:dup             
	//  198  302:bipush          6
	//  199  304:ldc1            #151 <Int 47>
	//  200  306:bastore         
	//  201  307:dup             
	//  202  308:bipush          7
	//  203  310:ldc1            #151 <Int 47>
	//  204  312:bastore         
	//  205  313:dup             
	//  206  314:bipush          8
	//  207  316:ldc1            #156 <Int 114>
	//  208  318:bastore         
	//  209  319:dup             
	//  210  320:bipush          9
	//  211  322:ldc1            #157 <Int 101>
	//  212  324:bastore         
	//  213  325:dup             
	//  214  326:bipush          10
	//  215  328:ldc1            #169 <Int 113>
	//  216  330:bastore         
	//  217  331:dup             
	//  218  332:bipush          11
	//  219  334:ldc1            #154 <Int 46>
	//  220  336:bastore         
	//  221  337:dup             
	//  222  338:bipush          12
	//  223  340:ldc1            #149 <Int 115>
	//  224  342:bastore         
	//  225  343:dup             
	//  226  344:bipush          13
	//  227  346:ldc1            #147 <Int 116>
	//  228  348:bastore         
	//  229  349:dup             
	//  230  350:bipush          14
	//  231  352:ldc1            #155 <Int 97>
	//  232  354:bastore         
	//  233  355:dup             
	//  234  356:bipush          15
	//  235  358:ldc1            #156 <Int 114>
	//  236  360:bastore         
	//  237  361:dup             
	//  238  362:bipush          16
	//  239  364:ldc1            #147 <Int 116>
	//  240  366:bastore         
	//  241  367:dup             
	//  242  368:bipush          17
	//  243  370:ldc1            #155 <Int 97>
	//  244  372:bastore         
	//  245  373:dup             
	//  246  374:bipush          18
	//  247  376:ldc1            #148 <Int 112>
	//  248  378:bastore         
	//  249  379:dup             
	//  250  380:bipush          19
	//  251  382:ldc1            #148 <Int 112>
	//  252  384:bastore         
	//  253  385:dup             
	//  254  386:bipush          20
	//  255  388:ldc1            #149 <Int 115>
	//  256  390:bastore         
	//  257  391:dup             
	//  258  392:bipush          21
	//  259  394:ldc1            #157 <Int 101>
	//  260  396:bastore         
	//  261  397:dup             
	//  262  398:bipush          22
	//  263  400:ldc1            #156 <Int 114>
	//  264  402:bastore         
	//  265  403:dup             
	//  266  404:bipush          23
	//  267  406:ldc1            #158 <Int 118>
	//  268  408:bastore         
	//  269  409:dup             
	//  270  410:bipush          24
	//  271  412:ldc1            #152 <Int 105>
	//  272  414:bastore         
	//  273  415:dup             
	//  274  416:bipush          25
	//  275  418:ldc1            #159 <Int 99>
	//  276  420:bastore         
	//  277  421:dup             
	//  278  422:bipush          26
	//  279  424:ldc1            #157 <Int 101>
	//  280  426:bastore         
	//  281  427:dup             
	//  282  428:bipush          27
	//  283  430:ldc1            #154 <Int 46>
	//  284  432:bastore         
	//  285  433:dup             
	//  286  434:bipush          28
	//  287  436:ldc1            #159 <Int 99>
	//  288  438:bastore         
	//  289  439:dup             
	//  290  440:bipush          29
	//  291  442:ldc1            #160 <Int 111>
	//  292  444:bastore         
	//  293  445:dup             
	//  294  446:bipush          30
	//  295  448:ldc1            #161 <Int 109>
	//  296  450:bastore         
	//  297  451:dup             
	//  298  452:bipush          31
	//  299  454:ldc1            #151 <Int 47>
	//  300  456:bastore         
	//  301  457:dup             
	//  302  458:bipush          32
	//  303  460:ldc1            #162 <Int 49>
	//  304  462:bastore         
	//  305  463:dup             
	//  306  464:bipush          33
	//  307  466:ldc1            #154 <Int 46>
	//  308  468:bastore         
	//  309  469:dup             
	//  310  470:bipush          34
	//  311  472:ldc1            #163 <Int 53>
	//  312  474:bastore         
	//  313  475:dup             
	//  314  476:bipush          35
	//  315  478:ldc1            #151 <Int 47>
	//  316  480:bastore         
	//  317  481:invokespecial   #166 <Method void String(byte[])>
	//  318  484:putstatic       #171 <Field String DEFAULT_AD_PLATFORM_HOST>
	//  319  487:aconst_null     
	//  320  488:putstatic       #173 <Field String DEFAULT_PROFILE_ID>
	//  321  491:iconst_3        
	//  322  492:newarray        int[]
	//  323  494:dup             
	//  324  495:iconst_0        
	//  325  496:bipush          60
	//  326  498:iastore         
	//  327  499:dup             
	//  328  500:iconst_1        
	//  329  501:bipush          60
	//  330  503:iastore         
	//  331  504:dup             
	//  332  505:iconst_2        
	//  333  506:sipush          240
	//  334  509:iastore         
	//  335  510:putstatic       #175 <Field int[] DEFAULT_PERIODIC_INFOEVENT_INTERVALS>
	//  336  513:new             #128 <Class HashSet>
	//  337  516:dup             
	//  338  517:iconst_2        
	//  339  518:anewarray       String[]
	//  340  521:dup             
	//  341  522:iconst_0        
	//  342  523:new             #130 <Class String>
	//  343  526:dup             
	//  344  527:bipush          19
	//  345  529:newarray        byte[]
	//  346  531:dup             
	//  347  532:iconst_0        
	//  348  533:ldc1            #159 <Int 99>
	//  349  535:bastore         
	//  350  536:dup             
	//  351  537:iconst_1        
	//  352  538:ldc1            #160 <Int 111>
	//  353  540:bastore         
	//  354  541:dup             
	//  355  542:iconst_2        
	//  356  543:ldc1            #161 <Int 109>
	//  357  545:bastore         
	//  358  546:dup             
	//  359  547:iconst_3        
	//  360  548:ldc1            #154 <Int 46>
	//  361  550:bastore         
	//  362  551:dup             
	//  363  552:iconst_4        
	//  364  553:ldc1            #176 <Int 102>
	//  365  555:bastore         
	//  366  556:dup             
	//  367  557:iconst_5        
	//  368  558:ldc1            #155 <Int 97>
	//  369  560:bastore         
	//  370  561:dup             
	//  371  562:bipush          6
	//  372  564:ldc1            #159 <Int 99>
	//  373  566:bastore         
	//  374  567:dup             
	//  375  568:bipush          7
	//  376  570:ldc1            #157 <Int 101>
	//  377  572:bastore         
	//  378  573:dup             
	//  379  574:bipush          8
	//  380  576:ldc1            #177 <Int 98>
	//  381  578:bastore         
	//  382  579:dup             
	//  383  580:bipush          9
	//  384  582:ldc1            #160 <Int 111>
	//  385  584:bastore         
	//  386  585:dup             
	//  387  586:bipush          10
	//  388  588:ldc1            #160 <Int 111>
	//  389  590:bastore         
	//  390  591:dup             
	//  391  592:bipush          11
	//  392  594:ldc1            #178 <Int 107>
	//  393  596:bastore         
	//  394  597:dup             
	//  395  598:bipush          12
	//  396  600:ldc1            #154 <Int 46>
	//  397  602:bastore         
	//  398  603:dup             
	//  399  604:bipush          13
	//  400  606:ldc1            #178 <Int 107>
	//  401  608:bastore         
	//  402  609:dup             
	//  403  610:bipush          14
	//  404  612:ldc1            #155 <Int 97>
	//  405  614:bastore         
	//  406  615:dup             
	//  407  616:bipush          15
	//  408  618:ldc1            #147 <Int 116>
	//  409  620:bastore         
	//  410  621:dup             
	//  411  622:bipush          16
	//  412  624:ldc1            #155 <Int 97>
	//  413  626:bastore         
	//  414  627:dup             
	//  415  628:bipush          17
	//  416  630:ldc1            #153 <Int 110>
	//  417  632:bastore         
	//  418  633:dup             
	//  419  634:bipush          18
	//  420  636:ldc1            #155 <Int 97>
	//  421  638:bastore         
	//  422  639:invokespecial   #166 <Method void String(byte[])>
	//  423  642:aastore         
	//  424  643:dup             
	//  425  644:iconst_1        
	//  426  645:new             #130 <Class String>
	//  427  648:dup             
	//  428  649:bipush          18
	//  429  651:newarray        byte[]
	//  430  653:dup             
	//  431  654:iconst_0        
	//  432  655:ldc1            #159 <Int 99>
	//  433  657:bastore         
	//  434  658:dup             
	//  435  659:iconst_1        
	//  436  660:ldc1            #160 <Int 111>
	//  437  662:bastore         
	//  438  663:dup             
	//  439  664:iconst_2        
	//  440  665:ldc1            #161 <Int 109>
	//  441  667:bastore         
	//  442  668:dup             
	//  443  669:iconst_3        
	//  444  670:ldc1            #154 <Int 46>
	//  445  672:bastore         
	//  446  673:dup             
	//  447  674:iconst_4        
	//  448  675:ldc1            #179 <Int 121>
	//  449  677:bastore         
	//  450  678:dup             
	//  451  679:iconst_5        
	//  452  680:ldc1            #155 <Int 97>
	//  453  682:bastore         
	//  454  683:dup             
	//  455  684:bipush          6
	//  456  686:ldc1            #153 <Int 110>
	//  457  688:bastore         
	//  458  689:dup             
	//  459  690:bipush          7
	//  460  692:ldc1            #180 <Int 100>
	//  461  694:bastore         
	//  462  695:dup             
	//  463  696:bipush          8
	//  464  698:ldc1            #157 <Int 101>
	//  465  700:bastore         
	//  466  701:dup             
	//  467  702:bipush          9
	//  468  704:ldc1            #181 <Int 120>
	//  469  706:bastore         
	//  470  707:dup             
	//  471  708:bipush          10
	//  472  710:ldc1            #154 <Int 46>
	//  473  712:bastore         
	//  474  713:dup             
	//  475  714:bipush          11
	//  476  716:ldc1            #177 <Int 98>
	//  477  718:bastore         
	//  478  719:dup             
	//  479  720:bipush          12
	//  480  722:ldc1            #156 <Int 114>
	//  481  724:bastore         
	//  482  725:dup             
	//  483  726:bipush          13
	//  484  728:ldc1            #160 <Int 111>
	//  485  730:bastore         
	//  486  731:dup             
	//  487  732:bipush          14
	//  488  734:ldc1            #182 <Int 119>
	//  489  736:bastore         
	//  490  737:dup             
	//  491  738:bipush          15
	//  492  740:ldc1            #149 <Int 115>
	//  493  742:bastore         
	//  494  743:dup             
	//  495  744:bipush          16
	//  496  746:ldc1            #157 <Int 101>
	//  497  748:bastore         
	//  498  749:dup             
	//  499  750:bipush          17
	//  500  752:ldc1            #156 <Int 114>
	//  501  754:bastore         
	//  502  755:invokespecial   #166 <Method void String(byte[])>
	//  503  758:aastore         
	//  504  759:invokestatic    #140 <Method List Arrays.asList(Object[])>
	//  505  762:invokespecial   #143 <Method void HashSet(java.util.Collection)>
	//  506  765:putstatic       #184 <Field Set DEFAULT_PRE_INSTALLED_PACKAGES>
	//  507  768:new             #128 <Class HashSet>
	//  508  771:dup             
	//  509  772:iconst_1        
	//  510  773:anewarray       Integer[]
	//  511  776:dup             
	//  512  777:iconst_0        
	//  513  778:sipush          204
	//  514  781:invokestatic    #190 <Method Integer Integer.valueOf(int)>
	//  515  784:aastore         
	//  516  785:invokestatic    #140 <Method List Arrays.asList(Object[])>
	//  517  788:invokespecial   #143 <Method void HashSet(java.util.Collection)>
	//  518  791:putstatic       #192 <Field Set DEFAULT_INVALID_NETWORK_CODES_INFO_EVENTS>
	//  519  794:new             #2   <Class MetaData>
	//  520  797:dup             
	//  521  798:invokespecial   #193 <Method void MetaData()>
	//  522  801:putstatic       #195 <Field MetaData instance>
	//* 523  804:return          
	}
}
