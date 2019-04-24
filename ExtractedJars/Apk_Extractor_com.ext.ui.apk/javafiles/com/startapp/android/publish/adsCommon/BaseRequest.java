// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.location.Location;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.startapp.android.publish.adsCommon.Utils.NameValueSerializer;
import com.startapp.android.publish.adsCommon.Utils.d;
import com.startapp.android.publish.adsCommon.Utils.e;
import com.startapp.android.publish.adsCommon.Utils.g;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.common.metaData.LocationConfig;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.a.a;
import com.startapp.common.a.b;
import com.startapp.common.a.c;
import com.startapp.common.a.f;
import com.startapp.common.a.h;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// Referenced classes of package com.startapp.android.publish.adsCommon:
//			AdsConstants, k, m

public abstract class BaseRequest
	implements NameValueSerializer
{
	static class a
	{

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #20  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #21  <Method void StringBuilder()>
		//    3    7:astore_3        
			if(a != null)
		//*   4    8:aload_0         
		//*   5    9:getfield        #15  <Field ScanResult a>
		//*   6   12:ifnull          135
			{
				stringbuilder.append(a.SSID).append(',');
		//    7   15:aload_3         
		//    8   16:aload_0         
		//    9   17:getfield        #15  <Field ScanResult a>
		//   10   20:getfield        #27  <Field String ScanResult.SSID>
		//   11   23:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
		//   12   26:bipush          44
		//   13   28:invokevirtual   #34  <Method StringBuilder StringBuilder.append(char)>
		//   14   31:pop             
				stringbuilder.append(a.BSSID).append(',');
		//   15   32:aload_3         
		//   16   33:aload_0         
		//   17   34:getfield        #15  <Field ScanResult a>
		//   18   37:getfield        #37  <Field String ScanResult.BSSID>
		//   19   40:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
		//   20   43:bipush          44
		//   21   45:invokevirtual   #34  <Method StringBuilder StringBuilder.append(char)>
		//   22   48:pop             
				stringbuilder.append(WifiManager.calculateSignalLevel(a.level, 5)).append(',');
		//   23   49:aload_3         
		//   24   50:aload_0         
		//   25   51:getfield        #15  <Field ScanResult a>
		//   26   54:getfield        #41  <Field int ScanResult.level>
		//   27   57:iconst_5        
		//   28   58:invokestatic    #47  <Method int WifiManager.calculateSignalLevel(int, int)>
		//   29   61:invokevirtual   #50  <Method StringBuilder StringBuilder.append(int)>
		//   30   64:bipush          44
		//   31   66:invokevirtual   #34  <Method StringBuilder StringBuilder.append(char)>
		//   32   69:pop             
				stringbuilder.append(a.level).append(',');
		//   33   70:aload_3         
		//   34   71:aload_0         
		//   35   72:getfield        #15  <Field ScanResult a>
		//   36   75:getfield        #41  <Field int ScanResult.level>
		//   37   78:invokevirtual   #50  <Method StringBuilder StringBuilder.append(int)>
		//   38   81:bipush          44
		//   39   83:invokevirtual   #34  <Method StringBuilder StringBuilder.append(char)>
		//   40   86:pop             
				long l = c.a(a);
		//   41   87:aload_0         
		//   42   88:getfield        #15  <Field ScanResult a>
		//   43   91:invokestatic    #55  <Method long c.a(ScanResult)>
		//   44   94:lstore_1        
				if(l != 0L)
		//*  45   95:lload_1         
		//*  46   96:lconst_0        
		//*  47   97:lcmp            
		//*  48   98:ifeq            107
					stringbuilder.append(l);
		//   49  101:aload_3         
		//   50  102:lload_1         
		//   51  103:invokevirtual   #58  <Method StringBuilder StringBuilder.append(long)>
		//   52  106:pop             
				stringbuilder.append(',');
		//   53  107:aload_3         
		//   54  108:bipush          44
		//   55  110:invokevirtual   #34  <Method StringBuilder StringBuilder.append(char)>
		//   56  113:pop             
				CharSequence charsequence = c.b(a);
		//   57  114:aload_0         
		//   58  115:getfield        #15  <Field ScanResult a>
		//   59  118:invokestatic    #62  <Method CharSequence c.b(ScanResult)>
		//   60  121:astore          4
				if(charsequence != null)
		//*  61  123:aload           4
		//*  62  125:ifnull          135
					stringbuilder.append(charsequence);
		//   63  128:aload_3         
		//   64  129:aload           4
		//   65  131:invokevirtual   #65  <Method StringBuilder StringBuilder.append(CharSequence)>
		//   66  134:pop             
			}
			return stringbuilder.toString();
		//   67  135:aload_3         
		//   68  136:invokevirtual   #67  <Method String StringBuilder.toString()>
		//   69  139:areturn         
		}

		private ScanResult a;

		public a(ScanResult scanresult)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
			a = scanresult;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #15  <Field ScanResult a>
		//    5    9:return          
		}
	}


	public BaseRequest()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #80  <Method void Object()>
		parameters = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #82  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #83  <Method void HashMap()>
	//    6   12:putfield        #85  <Field Map parameters>
		sdkVersion = com.startapp.android.publish.adsCommon.AdsConstants.h;
	//    7   15:aload_0         
	//    8   16:getstatic       #90  <Field String com.startapp.android.publish.adsCommon.AdsConstants.h>
	//    9   19:putfield        #92  <Field String sdkVersion>
		sdkFlavor = (new BigInteger(com.startapp.android.publish.adsCommon.AdsConstants.i, 2)).longValue();
	//   10   22:aload_0         
	//   11   23:new             #94  <Class BigInteger>
	//   12   26:dup             
	//   13   27:getstatic       #97  <Field String com.startapp.android.publish.adsCommon.AdsConstants.i>
	//   14   30:iconst_2        
	//   15   31:invokespecial   #100 <Method void BigInteger(String, int)>
	//   16   34:invokevirtual   #104 <Method long BigInteger.longValue()>
	//   17   37:putfield        #106 <Field long sdkFlavor>
		frameworksMap = ((Map) (new TreeMap()));
	//   18   40:aload_0         
	//   19   41:new             #108 <Class TreeMap>
	//   20   44:dup             
	//   21   45:invokespecial   #109 <Method void TreeMap()>
	//   22   48:putfield        #111 <Field Map frameworksMap>
		locations = null;
	//   23   51:aload_0         
	//   24   52:aconst_null     
	//   25   53:putfield        #113 <Field List locations>
		os = "android";
	//   26   56:aload_0         
	//   27   57:ldc1            #13  <String "android">
	//   28   59:putfield        #115 <Field String os>
		sdkId = 3;
	//   29   62:aload_0         
	//   30   63:iconst_3        
	//   31   64:putfield        #117 <Field int sdkId>
	//   32   67:return          
	}

	private void addParams(e e1)
	{
		e1.a("publisherId", ((Object) (publisherId)), false);
	//    0    0:aload_1         
	//    1    1:ldc1            #121 <String "publisherId">
	//    2    3:aload_0         
	//    3    4:getfield        #123 <Field String publisherId>
	//    4    7:iconst_0        
	//    5    8:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("productId", ((Object) (productId)), true);
	//    6   11:aload_1         
	//    7   12:ldc1            #129 <String "productId">
	//    8   14:aload_0         
	//    9   15:getfield        #131 <Field String productId>
	//   10   18:iconst_1        
	//   11   19:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("os", ((Object) (os)), true);
	//   12   22:aload_1         
	//   13   23:ldc1            #132 <String "os">
	//   14   25:aload_0         
	//   15   26:getfield        #115 <Field String os>
	//   16   29:iconst_1        
	//   17   30:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("sdkVersion", ((Object) (sdkVersion)), false);
	//   18   33:aload_1         
	//   19   34:ldc1            #133 <String "sdkVersion">
	//   20   36:aload_0         
	//   21   37:getfield        #92  <Field String sdkVersion>
	//   22   40:iconst_0        
	//   23   41:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("flavor", ((Object) (Long.valueOf(sdkFlavor))), false);
	//   24   44:aload_1         
	//   25   45:ldc1            #135 <String "flavor">
	//   26   47:aload_0         
	//   27   48:getfield        #106 <Field long sdkFlavor>
	//   28   51:invokestatic    #141 <Method Long Long.valueOf(long)>
	//   29   54:iconst_0        
	//   30   55:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		if(frameworksMap != null && !frameworksMap.isEmpty())
	//*  31   58:aload_0         
	//*  32   59:getfield        #111 <Field Map frameworksMap>
	//*  33   62:ifnull          184
	//*  34   65:aload_0         
	//*  35   66:getfield        #111 <Field Map frameworksMap>
	//*  36   69:invokeinterface #147 <Method boolean Map.isEmpty()>
	//*  37   74:ifne            184
		{
			Iterator iterator = frameworksMap.keySet().iterator();
	//   38   77:aload_0         
	//   39   78:getfield        #111 <Field Map frameworksMap>
	//   40   81:invokeinterface #151 <Method Set Map.keySet()>
	//   41   86:invokeinterface #157 <Method Iterator Set.iterator()>
	//   42   91:astore_3        
			String s;
			String s2;
			for(s = ""; iterator.hasNext(); s = (new StringBuilder()).append(s).append(s2).append(":").append((String)frameworksMap.get(((Object) (s2)))).append(";").toString())
	//*  43   92:ldc1            #159 <String "">
	//*  44   94:astore_2        
	//*  45   95:aload_3         
	//*  46   96:invokeinterface #164 <Method boolean Iterator.hasNext()>
	//*  47  101:ifeq            165
				s2 = (String)iterator.next();
	//   48  104:aload_3         
	//   49  105:invokeinterface #168 <Method Object Iterator.next()>
	//   50  110:checkcast       #170 <Class String>
	//   51  113:astore          4

	//   52  115:new             #172 <Class StringBuilder>
	//   53  118:dup             
	//   54  119:invokespecial   #173 <Method void StringBuilder()>
	//   55  122:aload_2         
	//   56  123:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   57  126:aload           4
	//   58  128:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   59  131:ldc1            #179 <String ":">
	//   60  133:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   61  136:aload_0         
	//   62  137:getfield        #111 <Field Map frameworksMap>
	//   63  140:aload           4
	//   64  142:invokeinterface #183 <Method Object Map.get(Object)>
	//   65  147:checkcast       #170 <Class String>
	//   66  150:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   67  153:ldc1            #185 <String ";">
	//   68  155:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   69  158:invokevirtual   #189 <Method String StringBuilder.toString()>
	//   70  161:astore_2        
	//*  71  162:goto            95
			e1.a("frameworksData", ((Object) (s.substring(0, s.length() - 1))), false, false);
	//   72  165:aload_1         
	//   73  166:ldc1            #191 <String "frameworksData">
	//   74  168:aload_2         
	//   75  169:iconst_0        
	//   76  170:aload_2         
	//   77  171:invokevirtual   #195 <Method int String.length()>
	//   78  174:iconst_1        
	//   79  175:isub            
	//   80  176:invokevirtual   #199 <Method String String.substring(int, int)>
	//   81  179:iconst_0        
	//   82  180:iconst_0        
	//   83  181:invokevirtual   #202 <Method void e.a(String, Object, boolean, boolean)>
		}
		e1.a("packageId", ((Object) (packageId)), false);
	//   84  184:aload_1         
	//   85  185:ldc1            #203 <String "packageId">
	//   86  187:aload_0         
	//   87  188:getfield        #205 <Field String packageId>
	//   88  191:iconst_0        
	//   89  192:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("installerPkg", ((Object) (installerPkg)), false);
	//   90  195:aload_1         
	//   91  196:ldc1            #206 <String "installerPkg">
	//   92  198:aload_0         
	//   93  199:getfield        #208 <Field String installerPkg>
	//   94  202:iconst_0        
	//   95  203:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		if(userAdvertisingId == null) goto _L2; else goto _L1
	//   96  206:aload_0         
	//   97  207:getfield        #210 <Field com.startapp.common.a.b$c userAdvertisingId>
	//   98  210:ifnull          822
_L1:
		e1.a("userAdvertisingId", ((Object) (userAdvertisingId.a())), false);
	//   99  213:aload_1         
	//  100  214:ldc1            #211 <String "userAdvertisingId">
	//  101  216:aload_0         
	//  102  217:getfield        #210 <Field com.startapp.common.a.b$c userAdvertisingId>
	//  103  220:invokevirtual   #215 <Method String com.startapp.common.a.b$c.a()>
	//  104  223:iconst_0        
	//  105  224:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		if(userAdvertisingId.b())
	//* 106  227:aload_0         
	//* 107  228:getfield        #210 <Field com.startapp.common.a.b$c userAdvertisingId>
	//* 108  231:invokevirtual   #218 <Method boolean com.startapp.common.a.b$c.b()>
	//* 109  234:ifeq            254
			e1.a("limat", ((Object) (Boolean.valueOf(userAdvertisingId.b()))), false);
	//  110  237:aload_1         
	//  111  238:ldc1            #220 <String "limat">
	//  112  240:aload_0         
	//  113  241:getfield        #210 <Field com.startapp.common.a.b$c userAdvertisingId>
	//  114  244:invokevirtual   #218 <Method boolean com.startapp.common.a.b$c.b()>
	//  115  247:invokestatic    #225 <Method Boolean Boolean.valueOf(boolean)>
	//  116  250:iconst_0        
	//  117  251:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("advertisingIdSource", ((Object) (userAdvertisingId.c())), false);
	//  118  254:aload_1         
	//  119  255:ldc1            #227 <String "advertisingIdSource">
	//  120  257:aload_0         
	//  121  258:getfield        #210 <Field com.startapp.common.a.b$c userAdvertisingId>
	//  122  261:invokevirtual   #230 <Method String com.startapp.common.a.b$c.c()>
	//  123  264:iconst_0        
	//  124  265:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
_L4:
		e1.a("model", ((Object) (model)), false);
	//  125  268:aload_1         
	//  126  269:ldc1            #231 <String "model">
	//  127  271:aload_0         
	//  128  272:getfield        #233 <Field String model>
	//  129  275:iconst_0        
	//  130  276:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("manufacturer", ((Object) (manufacturer)), false);
	//  131  279:aload_1         
	//  132  280:ldc1            #234 <String "manufacturer">
	//  133  282:aload_0         
	//  134  283:getfield        #236 <Field String manufacturer>
	//  135  286:iconst_0        
	//  136  287:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("deviceVersion", ((Object) (deviceVersion)), false);
	//  137  290:aload_1         
	//  138  291:ldc1            #237 <String "deviceVersion">
	//  139  293:aload_0         
	//  140  294:getfield        #239 <Field String deviceVersion>
	//  141  297:iconst_0        
	//  142  298:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("locale", ((Object) (locale)), false);
	//  143  301:aload_1         
	//  144  302:ldc1            #240 <String "locale">
	//  145  304:aload_0         
	//  146  305:getfield        #242 <Field String locale>
	//  147  308:iconst_0        
	//  148  309:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("inputLangs", inputLangs, false);
	//  149  312:aload_1         
	//  150  313:ldc1            #243 <String "inputLangs">
	//  151  315:aload_0         
	//  152  316:getfield        #245 <Field Set inputLangs>
	//  153  319:iconst_0        
	//  154  320:invokevirtual   #248 <Method void e.a(String, Set, boolean)>
		e1.a("isp", ((Object) (isp)), false);
	//  155  323:aload_1         
	//  156  324:ldc1            #249 <String "isp">
	//  157  326:aload_0         
	//  158  327:getfield        #251 <Field String isp>
	//  159  330:iconst_0        
	//  160  331:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("ispName", ((Object) (ispName)), false);
	//  161  334:aload_1         
	//  162  335:ldc1            #252 <String "ispName">
	//  163  337:aload_0         
	//  164  338:getfield        #254 <Field String ispName>
	//  165  341:iconst_0        
	//  166  342:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("netOper", ((Object) (getNetOper())), false);
	//  167  345:aload_1         
	//  168  346:ldc1            #255 <String "netOper">
	//  169  348:aload_0         
	//  170  349:invokevirtual   #258 <Method String getNetOper()>
	//  171  352:iconst_0        
	//  172  353:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("networkOperName", ((Object) (getNetworkOperName())), false);
	//  173  356:aload_1         
	//  174  357:ldc2            #259 <String "networkOperName">
	//  175  360:aload_0         
	//  176  361:invokevirtual   #262 <Method String getNetworkOperName()>
	//  177  364:iconst_0        
	//  178  365:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("cid", ((Object) (getCid())), false);
	//  179  368:aload_1         
	//  180  369:ldc2            #263 <String "cid">
	//  181  372:aload_0         
	//  182  373:invokevirtual   #266 <Method String getCid()>
	//  183  376:iconst_0        
	//  184  377:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("lac", ((Object) (getLac())), false);
	//  185  380:aload_1         
	//  186  381:ldc2            #267 <String "lac">
	//  187  384:aload_0         
	//  188  385:invokevirtual   #270 <Method String getLac()>
	//  189  388:iconst_0        
	//  190  389:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("blat", ((Object) (getBlat())), false);
	//  191  392:aload_1         
	//  192  393:ldc2            #271 <String "blat">
	//  193  396:aload_0         
	//  194  397:invokevirtual   #274 <Method String getBlat()>
	//  195  400:iconst_0        
	//  196  401:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("blon", ((Object) (getBlon())), false);
	//  197  404:aload_1         
	//  198  405:ldc2            #275 <String "blon">
	//  199  408:aload_0         
	//  200  409:invokevirtual   #278 <Method String getBlon()>
	//  201  412:iconst_0        
	//  202  413:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("ssid", ((Object) (getSsid())), false);
	//  203  416:aload_1         
	//  204  417:ldc2            #279 <String "ssid">
	//  205  420:aload_0         
	//  206  421:invokevirtual   #282 <Method String getSsid()>
	//  207  424:iconst_0        
	//  208  425:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("bssid", ((Object) (getBssid())), false);
	//  209  428:aload_1         
	//  210  429:ldc2            #283 <String "bssid">
	//  211  432:aload_0         
	//  212  433:invokevirtual   #286 <Method String getBssid()>
	//  213  436:iconst_0        
	//  214  437:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("wfScanRes", ((Object) (getWfScanRes())), false);
	//  215  440:aload_1         
	//  216  441:ldc2            #287 <String "wfScanRes">
	//  217  444:aload_0         
	//  218  445:invokevirtual   #290 <Method String getWfScanRes()>
	//  219  448:iconst_0        
	//  220  449:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("subPublisherId", ((Object) (subPublisherId)), false);
	//  221  452:aload_1         
	//  222  453:ldc2            #291 <String "subPublisherId">
	//  223  456:aload_0         
	//  224  457:getfield        #293 <Field String subPublisherId>
	//  225  460:iconst_0        
	//  226  461:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("subProductId", ((Object) (subProductId)), false);
	//  227  464:aload_1         
	//  228  465:ldc2            #294 <String "subProductId">
	//  229  468:aload_0         
	//  230  469:getfield        #296 <Field String subProductId>
	//  231  472:iconst_0        
	//  232  473:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("retryCount", ((Object) (retry)), false);
	//  233  476:aload_1         
	//  234  477:ldc2            #298 <String "retryCount">
	//  235  480:aload_0         
	//  236  481:getfield        #300 <Field Integer retry>
	//  237  484:iconst_0        
	//  238  485:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("roaming", ((Object) (isRoaming())), false);
	//  239  488:aload_1         
	//  240  489:ldc2            #301 <String "roaming">
	//  241  492:aload_0         
	//  242  493:invokevirtual   #305 <Method Boolean isRoaming()>
	//  243  496:iconst_0        
	//  244  497:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("deviceIP", ((Object) (getDeviceIP())), false);
	//  245  500:aload_1         
	//  246  501:ldc2            #306 <String "deviceIP">
	//  247  504:aload_0         
	//  248  505:invokevirtual   #309 <Method String getDeviceIP()>
	//  249  508:iconst_0        
	//  250  509:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("grid", ((Object) (getNetworkType())), false);
	//  251  512:aload_1         
	//  252  513:ldc2            #311 <String "grid">
	//  253  516:aload_0         
	//  254  517:invokevirtual   #314 <Method String getNetworkType()>
	//  255  520:iconst_0        
	//  256  521:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("silev", ((Object) (getSignalLevel())), false);
	//  257  524:aload_1         
	//  258  525:ldc2            #316 <String "silev">
	//  259  528:aload_0         
	//  260  529:invokevirtual   #319 <Method String getSignalLevel()>
	//  261  532:iconst_0        
	//  262  533:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("cellSignalLevel", ((Object) (getCellSignalLevel())), false);
	//  263  536:aload_1         
	//  264  537:ldc2            #320 <String "cellSignalLevel">
	//  265  540:aload_0         
	//  266  541:invokevirtual   #323 <Method String getCellSignalLevel()>
	//  267  544:iconst_0        
	//  268  545:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		if(getWifiSignalLevel() != null)
	//* 269  548:aload_0         
	//* 270  549:invokevirtual   #326 <Method String getWifiSignalLevel()>
	//* 271  552:ifnull          567
			e1.a("wifiSignalLevel", ((Object) (getWifiSignalLevel())), false);
	//  272  555:aload_1         
	//  273  556:ldc2            #327 <String "wifiSignalLevel">
	//  274  559:aload_0         
	//  275  560:invokevirtual   #326 <Method String getWifiSignalLevel()>
	//  276  563:iconst_0        
	//  277  564:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		if(getWifiRssiLevel() != null)
	//* 278  567:aload_0         
	//* 279  568:invokevirtual   #330 <Method String getWifiRssiLevel()>
	//* 280  571:ifnull          586
			e1.a("wifiRssiLevel", ((Object) (getWifiRssiLevel())), false);
	//  281  574:aload_1         
	//  282  575:ldc2            #332 <String "wifiRssiLevel">
	//  283  578:aload_0         
	//  284  579:invokevirtual   #330 <Method String getWifiRssiLevel()>
	//  285  582:iconst_0        
	//  286  583:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		if(getCellTimingAdv() != null)
	//* 287  586:aload_0         
	//* 288  587:invokespecial   #335 <Method String getCellTimingAdv()>
	//* 289  590:ifnull          605
			e1.a("cellTimingAdv", ((Object) (getCellTimingAdv())), false);
	//  290  593:aload_1         
	//  291  594:ldc2            #336 <String "cellTimingAdv">
	//  292  597:aload_0         
	//  293  598:invokespecial   #335 <Method String getCellTimingAdv()>
	//  294  601:iconst_0        
	//  295  602:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("outsource", ((Object) (isUnknownSourcesAllowed())), false);
	//  296  605:aload_1         
	//  297  606:ldc2            #338 <String "outsource">
	//  298  609:aload_0         
	//  299  610:invokevirtual   #341 <Method Boolean isUnknownSourcesAllowed()>
	//  300  613:iconst_0        
	//  301  614:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("width", ((Object) (String.valueOf(width))), false);
	//  302  617:aload_1         
	//  303  618:ldc2            #342 <String "width">
	//  304  621:aload_0         
	//  305  622:getfield        #344 <Field int width>
	//  306  625:invokestatic    #347 <Method String String.valueOf(int)>
	//  307  628:iconst_0        
	//  308  629:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("height", ((Object) (String.valueOf(height))), false);
	//  309  632:aload_1         
	//  310  633:ldc2            #348 <String "height">
	//  311  636:aload_0         
	//  312  637:getfield        #350 <Field int height>
	//  313  640:invokestatic    #347 <Method String String.valueOf(int)>
	//  314  643:iconst_0        
	//  315  644:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("density", ((Object) (String.valueOf(density))), false);
	//  316  647:aload_1         
	//  317  648:ldc2            #351 <String "density">
	//  318  651:aload_0         
	//  319  652:getfield        #353 <Field float density>
	//  320  655:invokestatic    #356 <Method String String.valueOf(float)>
	//  321  658:iconst_0        
	//  322  659:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("fgApp", ((Object) (isAppOnForeground())), false);
	//  323  662:aload_1         
	//  324  663:ldc2            #358 <String "fgApp">
	//  325  666:aload_0         
	//  326  667:invokevirtual   #361 <Method Boolean isAppOnForeground()>
	//  327  670:iconst_0        
	//  328  671:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("sdkId", ((Object) (String.valueOf(sdkId))), true);
	//  329  674:aload_1         
	//  330  675:ldc2            #362 <String "sdkId">
	//  331  678:aload_0         
	//  332  679:getfield        #117 <Field int sdkId>
	//  333  682:invokestatic    #347 <Method String String.valueOf(int)>
	//  334  685:iconst_1        
	//  335  686:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("clientSessionId", ((Object) (clientSessionId)), false);
	//  336  689:aload_1         
	//  337  690:ldc2            #363 <String "clientSessionId">
	//  338  693:aload_0         
	//  339  694:getfield        #365 <Field String clientSessionId>
	//  340  697:iconst_0        
	//  341  698:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("appVersion", ((Object) (appVersion)), false);
	//  342  701:aload_1         
	//  343  702:ldc2            #366 <String "appVersion">
	//  344  705:aload_0         
	//  345  706:getfield        #368 <Field String appVersion>
	//  346  709:iconst_0        
	//  347  710:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("appCode", ((Object) (Integer.valueOf(appCode))), false);
	//  348  713:aload_1         
	//  349  714:ldc2            #369 <String "appCode">
	//  350  717:aload_0         
	//  351  718:getfield        #371 <Field int appCode>
	//  352  721:invokestatic    #376 <Method Integer Integer.valueOf(int)>
	//  353  724:iconst_0        
	//  354  725:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("timeSinceBoot", ((Object) (Long.valueOf(getTimeSinceBoot()))), false);
	//  355  728:aload_1         
	//  356  729:ldc2            #378 <String "timeSinceBoot">
	//  357  732:invokestatic    #381 <Method long getTimeSinceBoot()>
	//  358  735:invokestatic    #141 <Method Long Long.valueOf(long)>
	//  359  738:iconst_0        
	//  360  739:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		if(getLocations() != null && getLocations().size() > 0)
	//* 361  742:aload_0         
	//* 362  743:invokevirtual   #385 <Method List getLocations()>
	//* 363  746:ifnull          794
	//* 364  749:aload_0         
	//* 365  750:invokevirtual   #385 <Method List getLocations()>
	//* 366  753:invokeinterface #390 <Method int List.size()>
	//* 367  758:ifle            794
		{
			String s1 = f.a(getLocations());
	//  368  761:aload_0         
	//  369  762:invokevirtual   #385 <Method List getLocations()>
	//  370  765:invokestatic    #395 <Method String f.a(List)>
	//  371  768:astore_2        
			if(s1 != null && !s1.equals(""))
	//* 372  769:aload_2         
	//* 373  770:ifnull          794
	//* 374  773:aload_2         
	//* 375  774:ldc1            #159 <String "">
	//* 376  776:invokevirtual   #399 <Method boolean String.equals(Object)>
	//* 377  779:ifne            794
				e1.a("locations", ((Object) (com.startapp.common.a.a.c(s1))), false);
	//  378  782:aload_1         
	//  379  783:ldc2            #400 <String "locations">
	//  380  786:aload_2         
	//  381  787:invokestatic    #405 <Method String a.c(String)>
	//  382  790:iconst_0        
	//  383  791:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		}
		e1.a("udbg", ((Object) (Boolean.valueOf(usbDebug))), false);
	//  384  794:aload_1         
	//  385  795:ldc2            #407 <String "udbg">
	//  386  798:aload_0         
	//  387  799:getfield        #409 <Field boolean usbDebug>
	//  388  802:invokestatic    #225 <Method Boolean Boolean.valueOf(boolean)>
	//  389  805:iconst_0        
	//  390  806:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		e1.a("pas", ((Object) (personalizedAdsServing)), false);
	//  391  809:aload_1         
	//  392  810:ldc2            #411 <String "pas">
	//  393  813:aload_0         
	//  394  814:getfield        #413 <Field String personalizedAdsServing>
	//  395  817:iconst_0        
	//  396  818:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		return;
	//  397  821:return          
_L2:
		if(androidId != null)
	//* 398  822:aload_0         
	//* 399  823:getfield        #415 <Field String androidId>
	//* 400  826:ifnull          268
			e1.a("userId", ((Object) (androidId)), false);
	//  401  829:aload_1         
	//  402  830:ldc2            #417 <String "userId">
	//  403  833:aload_0         
	//  404  834:getfield        #415 <Field String androidId>
	//  405  837:iconst_0        
	//  406  838:invokevirtual   #128 <Method void e.a(String, Object, boolean)>
		if(true) goto _L4; else goto _L3
	//  407  841:goto            268
_L3:
	}

	private void fillCellLocationDetails(Context context, TelephonyManager telephonymanager)
	{
		if(c.a(context, "android.permission.ACCESS_FINE_LOCATION") || c.a(context, "android.permission.ACCESS_COARSE_LOCATION"))
	//*   0    0:aload_1         
	//*   1    1:ldc2            #421 <String "android.permission.ACCESS_FINE_LOCATION">
	//*   2    4:invokestatic    #426 <Method boolean c.a(Context, String)>
	//*   3    7:ifne            20
	//*   4   10:aload_1         
	//*   5   11:ldc2            #428 <String "android.permission.ACCESS_COARSE_LOCATION">
	//*   6   14:invokestatic    #426 <Method boolean c.a(Context, String)>
	//*   7   17:ifeq            69
		{
			context = ((Context) (telephonymanager.getCellLocation()));
	//    8   20:aload_2         
	//    9   21:invokevirtual   #434 <Method android.telephony.CellLocation TelephonyManager.getCellLocation()>
	//   10   24:astore_1        
			if(context != null)
	//*  11   25:aload_1         
	//*  12   26:ifnull          69
				if(context instanceof GsmCellLocation)
	//*  13   29:aload_1         
	//*  14   30:instanceof      #436 <Class GsmCellLocation>
	//*  15   33:ifeq            70
				{
					context = ((Context) ((GsmCellLocation)context));
	//   16   36:aload_1         
	//   17   37:checkcast       #436 <Class GsmCellLocation>
	//   18   40:astore_1        
					setCid(com.startapp.common.a.a.c(String.valueOf(((GsmCellLocation) (context)).getCid())));
	//   19   41:aload_0         
	//   20   42:aload_1         
	//   21   43:invokevirtual   #438 <Method int GsmCellLocation.getCid()>
	//   22   46:invokestatic    #347 <Method String String.valueOf(int)>
	//   23   49:invokestatic    #405 <Method String a.c(String)>
	//   24   52:invokevirtual   #442 <Method void setCid(String)>
					setLac(com.startapp.common.a.a.c(String.valueOf(((GsmCellLocation) (context)).getLac())));
	//   25   55:aload_0         
	//   26   56:aload_1         
	//   27   57:invokevirtual   #444 <Method int GsmCellLocation.getLac()>
	//   28   60:invokestatic    #347 <Method String String.valueOf(int)>
	//   29   63:invokestatic    #405 <Method String a.c(String)>
	//   30   66:invokevirtual   #447 <Method void setLac(String)>
				} else
	//*  31   69:return          
				if(context instanceof CdmaCellLocation)
	//*  32   70:aload_1         
	//*  33   71:instanceof      #449 <Class CdmaCellLocation>
	//*  34   74:ifeq            69
				{
					context = ((Context) ((CdmaCellLocation)context));
	//   35   77:aload_1         
	//   36   78:checkcast       #449 <Class CdmaCellLocation>
	//   37   81:astore_1        
					setBlat(com.startapp.common.a.a.c(String.valueOf(((CdmaCellLocation) (context)).getBaseStationLatitude())));
	//   38   82:aload_0         
	//   39   83:aload_1         
	//   40   84:invokevirtual   #452 <Method int CdmaCellLocation.getBaseStationLatitude()>
	//   41   87:invokestatic    #347 <Method String String.valueOf(int)>
	//   42   90:invokestatic    #405 <Method String a.c(String)>
	//   43   93:invokevirtual   #455 <Method void setBlat(String)>
					setBlon(com.startapp.common.a.a.c(String.valueOf(((CdmaCellLocation) (context)).getBaseStationLongitude())));
	//   44   96:aload_0         
	//   45   97:aload_1         
	//   46   98:invokevirtual   #458 <Method int CdmaCellLocation.getBaseStationLongitude()>
	//   47  101:invokestatic    #347 <Method String String.valueOf(int)>
	//   48  104:invokestatic    #405 <Method String a.c(String)>
	//   49  107:invokevirtual   #461 <Method void setBlon(String)>
					return;
	//   50  110:return          
				}
		}
	}

	private void fillNetworkOperatorDetails(Context context, TelephonyManager telephonymanager)
	{
		int j = telephonymanager.getPhoneType();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #465 <Method int TelephonyManager.getPhoneType()>
	//    2    4:istore_3        
		if(j != 0 && j != 2)
	//*   3    5:iload_3         
	//*   4    6:ifeq            48
	//*   5    9:iload_3         
	//*   6   10:iconst_2        
	//*   7   11:icmpeq          48
		{
			context = ((Context) (telephonymanager.getNetworkOperator()));
	//    8   14:aload_2         
	//    9   15:invokevirtual   #468 <Method String TelephonyManager.getNetworkOperator()>
	//   10   18:astore_1        
			if(context != null)
	//*  11   19:aload_1         
	//*  12   20:ifnull          31
				setNetOper(com.startapp.common.a.a.c(((String) (context))));
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:invokestatic    #405 <Method String a.c(String)>
	//   16   28:invokevirtual   #471 <Method void setNetOper(String)>
			context = ((Context) (telephonymanager.getNetworkOperatorName()));
	//   17   31:aload_2         
	//   18   32:invokevirtual   #474 <Method String TelephonyManager.getNetworkOperatorName()>
	//   19   35:astore_1        
			if(context != null)
	//*  20   36:aload_1         
	//*  21   37:ifnull          48
				setNetworkOperName(com.startapp.common.a.a.c(((String) (context))));
	//   22   40:aload_0         
	//   23   41:aload_1         
	//   24   42:invokestatic    #405 <Method String a.c(String)>
	//   25   45:invokevirtual   #477 <Method void setNetworkOperName(String)>
		}
	//   26   48:return          
	}

	private void fillSimDetails(TelephonyManager telephonymanager)
	{
		if(telephonymanager.getSimState() == 5)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #482 <Method int TelephonyManager.getSimState()>
	//*   2    4:iconst_5        
	//*   3    5:icmpne          24
		{
			setIsp(telephonymanager.getSimOperator());
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #485 <Method String TelephonyManager.getSimOperator()>
	//    7   13:invokevirtual   #488 <Method void setIsp(String)>
			setIspName(telephonymanager.getSimOperatorName());
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #491 <Method String TelephonyManager.getSimOperatorName()>
	//   11   21:invokevirtual   #494 <Method void setIspName(String)>
		}
	//   12   24:return          
	}

	private void fillWifiDetails(Context context, boolean flag)
	{
		Object obj;
		if(!MetaData.getInstance().isWfScanEnabled())
			break MISSING_BLOCK_LABEL_207;
	//    0    0:invokestatic    #504 <Method MetaData MetaData.getInstance()>
	//    1    3:invokevirtual   #507 <Method boolean MetaData.isWfScanEnabled()>
	//    2    6:ifeq            207
		obj = ((Object) ((WifiManager)context.getSystemService("wifi")));
	//    3    9:aload_1         
	//    4   10:ldc2            #509 <String "wifi">
	//    5   13:invokevirtual   #515 <Method Object Context.getSystemService(String)>
	//    6   16:checkcast       #517 <Class WifiManager>
	//    7   19:astore          4
		if(obj == null)
			break MISSING_BLOCK_LABEL_207;
	//    8   21:aload           4
	//    9   23:ifnull          207
		Object obj1;
		if(!c.a(context, "android.permission.ACCESS_WIFI_STATE"))
			break MISSING_BLOCK_LABEL_207;
	//   10   26:aload_1         
	//   11   27:ldc2            #519 <String "android.permission.ACCESS_WIFI_STATE">
	//   12   30:invokestatic    #426 <Method boolean c.a(Context, String)>
	//   13   33:ifeq            207
		if(!getNetworkType().equals("WIFI"))
			break MISSING_BLOCK_LABEL_109;
	//   14   36:aload_0         
	//   15   37:invokevirtual   #314 <Method String getNetworkType()>
	//   16   40:ldc2            #521 <String "WIFI">
	//   17   43:invokevirtual   #399 <Method boolean String.equals(Object)>
	//   18   46:ifeq            109
		obj1 = ((Object) (((WifiManager) (obj)).getConnectionInfo()));
	//   19   49:aload           4
	//   20   51:invokevirtual   #525 <Method WifiInfo WifiManager.getConnectionInfo()>
	//   21   54:astore          6
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_109;
	//   22   56:aload           6
	//   23   58:ifnull          109
		int j;
		String s;
		try
		{
			setDeviceIP(((WifiInfo) (obj1)));
	//   24   61:aload_0         
	//   25   62:aload           6
	//   26   64:invokevirtual   #529 <Method void setDeviceIP(WifiInfo)>
			s = ((WifiInfo) (obj1)).getSSID();
	//   27   67:aload           6
	//   28   69:invokevirtual   #534 <Method String WifiInfo.getSSID()>
	//   29   72:astore          5
			obj1 = ((Object) (((WifiInfo) (obj1)).getBSSID()));
	//   30   74:aload           6
	//   31   76:invokevirtual   #537 <Method String WifiInfo.getBSSID()>
	//   32   79:astore          6
		}
	//*  33   81:aload           5
	//*  34   83:ifnull          95
	//*  35   86:aload_0         
	//*  36   87:aload           5
	//*  37   89:invokestatic    #405 <Method String a.c(String)>
	//*  38   92:invokevirtual   #540 <Method void setSsid(String)>
	//*  39   95:aload           6
	//*  40   97:ifnull          109
	//*  41  100:aload_0         
	//*  42  101:aload           6
	//*  43  103:invokestatic    #405 <Method String a.c(String)>
	//*  44  106:invokevirtual   #543 <Method void setBssid(String)>
	//*  45  109:iload_2         
	//*  46  110:ifeq            207
	//*  47  113:aload_1         
	//*  48  114:aload           4
	//*  49  116:invokestatic    #546 <Method List c.a(Context, WifiManager)>
	//*  50  119:astore_1        
	//*  51  120:aload_1         
	//*  52  121:ifnull          207
	//*  53  124:aload_1         
	//*  54  125:getstatic       #551 <Field List Collections.EMPTY_LIST>
	//*  55  128:invokeinterface #552 <Method boolean List.equals(Object)>
	//*  56  133:ifne            207
	//*  57  136:new             #554 <Class ArrayList>
	//*  58  139:dup             
	//*  59  140:invokespecial   #555 <Method void ArrayList()>
	//*  60  143:astore          4
	//*  61  145:iconst_0        
	//*  62  146:istore_3        
	//*  63  147:iload_3         
	//*  64  148:iconst_5        
	//*  65  149:aload_1         
	//*  66  150:invokeinterface #390 <Method int List.size()>
	//*  67  155:invokestatic    #561 <Method int Math.min(int, int)>
	//*  68  158:icmpge          193
	//*  69  161:aload           4
	//*  70  163:new             #8   <Class BaseRequest$a>
	//*  71  166:dup             
	//*  72  167:aload_1         
	//*  73  168:iload_3         
	//*  74  169:invokeinterface #564 <Method Object List.get(int)>
	//*  75  174:checkcast       #566 <Class ScanResult>
	//*  76  177:invokespecial   #569 <Method void BaseRequest$a(ScanResult)>
	//*  77  180:invokeinterface #572 <Method boolean List.add(Object)>
	//*  78  185:pop             
	//*  79  186:iload_3         
	//*  80  187:iconst_1        
	//*  81  188:iadd            
	//*  82  189:istore_3        
	//*  83  190:goto            147
	//*  84  193:aload_0         
	//*  85  194:ldc1            #185 <String ";">
	//*  86  196:aload           4
	//*  87  198:invokestatic    #578 <Method String TextUtils.join(CharSequence, Iterable)>
	//*  88  201:invokestatic    #405 <Method String a.c(String)>
	//*  89  204:invokevirtual   #581 <Method void setWfScanRes(String)>
	//*  90  207:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  91  208:astore_1        
		{
			return;
	//   92  209:return          
		}
		if(s == null)
			break MISSING_BLOCK_LABEL_95;
		setSsid(com.startapp.common.a.a.c(s));
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_109;
		setBssid(com.startapp.common.a.a.c(((String) (obj1))));
		if(!flag)
			break MISSING_BLOCK_LABEL_207;
		context = ((Context) (c.a(context, ((WifiManager) (obj)))));
		if(context == null)
			break MISSING_BLOCK_LABEL_207;
		if(((List) (context)).equals(((Object) (Collections.EMPTY_LIST))))
			break MISSING_BLOCK_LABEL_207;
		obj = ((Object) (new ArrayList()));
		j = 0;
_L2:
		if(j >= Math.min(5, ((List) (context)).size()))
			break; /* Loop/switch isn't completed */
		((List) (obj)).add(((Object) (new a((ScanResult)((List) (context)).get(j)))));
		j++;
		if(true) goto _L2; else goto _L1
_L1:
		setWfScanRes(com.startapp.common.a.a.c(TextUtils.join(";", ((Iterable) (obj)))));
	}

	private String getCellTimingAdv()
	{
		return cellTimingAdv;
	//    0    0:aload_0         
	//    1    1:getfield        #583 <Field String cellTimingAdv>
	//    2    4:areturn         
	}

	private static long getTimeSinceBoot()
	{
		return SystemClock.elapsedRealtime();
	//    0    0:invokestatic    #588 <Method long SystemClock.elapsedRealtime()>
	//    1    3:lreturn         
	}

	private void setAndroidId(Context context)
	{
		if(!c.a(context, "com.google.android.gms", 0))
			break MISSING_BLOCK_LABEL_54;
	//    0    0:aload_1         
	//    1    1:ldc2            #594 <String "com.google.android.gms">
	//    2    4:iconst_0        
	//    3    5:invokestatic    #597 <Method boolean c.a(Context, String, int)>
	//    4    8:ifeq            54
		if(Integer.parseInt(Integer.toString(context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode).substring(0, 1)) >= 4)
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #601 <Method PackageManager Context.getPackageManager()>
	//*   7   15:ldc2            #594 <String "com.google.android.gms">
	//*   8   18:iconst_0        
	//*   9   19:invokevirtual   #607 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//*  10   22:getfield        #612 <Field int PackageInfo.versionCode>
	//*  11   25:invokestatic    #614 <Method String Integer.toString(int)>
	//*  12   28:iconst_0        
	//*  13   29:iconst_1        
	//*  14   30:invokevirtual   #199 <Method String String.substring(int, int)>
	//*  15   33:invokestatic    #618 <Method int Integer.parseInt(String)>
	//*  16   36:iconst_4        
	//*  17   37:icmplt          54
			androidId = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
	//   18   40:aload_0         
	//   19   41:aload_1         
	//   20   42:invokevirtual   #622 <Method android.content.ContentResolver Context.getContentResolver()>
	//   21   45:ldc2            #624 <String "android_id">
	//   22   48:invokestatic    #630 <Method String android.provider.Settings$Secure.getString(android.content.ContentResolver, String)>
	//   23   51:putfield        #415 <Field String androidId>
		return;
	//   24   54:return          
		context;
	//   25   55:astore_1        
		return;
	//   26   56:return          
		context;
	//   27   57:astore_1        
	//   28   58:return          
	}

	private void setCellTimingAdv(Context context, TelephonyManager telephonymanager)
	{
		cellTimingAdv = c.b(context, telephonymanager);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #634 <Method String c.b(Context, TelephonyManager)>
	//    4    6:putfield        #583 <Field String cellTimingAdv>
	//    5    9:return          
	}

	private void setNetworkLevels(Context context)
	{
		Object obj;
		try
		{
			obj = ((Object) (com.startapp.common.c.a()));
	//    0    0:invokestatic    #640 <Method com.startapp.common.c com.startapp.common.c.a()>
	//    1    3:astore_2        
		}
	//*   2    4:aload_2         
	//*   3    5:ifnull          106
	//*   4    8:aload_0         
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #642 <Method String com.startapp.common.c.b()>
	//*   7   13:putfield        #644 <Field String cellSignalLevel>
	//*   8   16:aconst_null     
	//*   9   17:astore_2        
	//*  10   18:invokestatic    #504 <Method MetaData MetaData.getInstance()>
	//*  11   21:invokevirtual   #507 <Method boolean MetaData.isWfScanEnabled()>
	//*  12   24:ifeq            36
	//*  13   27:aload_1         
	//*  14   28:aload_0         
	//*  15   29:getfield        #646 <Field String networkType>
	//*  16   32:invokestatic    #651 <Method com.startapp.common.a.h$b h.a(Context, String)>
	//*  17   35:astore_2        
	//*  18   36:aload_2         
	//*  19   37:ifnull          97
	//*  20   40:aload_2         
	//*  21   41:invokevirtual   #654 <Method String com.startapp.common.a.h$b.a()>
	//*  22   44:ifnonnull       72
	//*  23   47:aload_0         
	//*  24   48:aload_2         
	//*  25   49:invokevirtual   #655 <Method String com.startapp.common.a.h$b.c()>
	//*  26   52:putfield        #657 <Field String signalLevel>
	//*  27   55:aload_0         
	//*  28   56:aload_2         
	//*  29   57:invokevirtual   #658 <Method String com.startapp.common.a.h$b.b()>
	//*  30   60:putfield        #660 <Field String wifiRSSILevel>
	//*  31   63:aload_0         
	//*  32   64:aload_2         
	//*  33   65:invokevirtual   #655 <Method String com.startapp.common.a.h$b.c()>
	//*  34   68:putfield        #662 <Field String wifiSignalLevel>
	//*  35   71:return          
	//*  36   72:aload_0         
	//*  37   73:aload_2         
	//*  38   74:invokevirtual   #654 <Method String com.startapp.common.a.h$b.a()>
	//*  39   77:putfield        #657 <Field String signalLevel>
	//*  40   80:aload_0         
	//*  41   81:aload_2         
	//*  42   82:invokevirtual   #654 <Method String com.startapp.common.a.h$b.a()>
	//*  43   85:putfield        #660 <Field String wifiRSSILevel>
	//*  44   88:aload_0         
	//*  45   89:aload_2         
	//*  46   90:invokevirtual   #654 <Method String com.startapp.common.a.h$b.a()>
	//*  47   93:putfield        #662 <Field String wifiSignalLevel>
	//*  48   96:return          
	//*  49   97:aload_0         
	//*  50   98:aload_0         
	//*  51   99:getfield        #644 <Field String cellSignalLevel>
	//*  52  102:putfield        #657 <Field String signalLevel>
	//*  53  105:return          
	//*  54  106:aload_0         
	//*  55  107:ldc2            #664 <String "e106">
	//*  56  110:putfield        #657 <Field String signalLevel>
	//*  57  113:aload_0         
	//*  58  114:ldc2            #664 <String "e106">
	//*  59  117:putfield        #644 <Field String cellSignalLevel>
	//*  60  120:aload_0         
	//*  61  121:ldc2            #664 <String "e106">
	//*  62  124:putfield        #662 <Field String wifiSignalLevel>
	//*  63  127:aload_0         
	//*  64  128:ldc2            #664 <String "e106">
	//*  65  131:putfield        #660 <Field String wifiRSSILevel>
	//*  66  134:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  67  135:astore_1        
		{
			return;
	//   68  136:return          
		}
		if(obj == null)
			break MISSING_BLOCK_LABEL_106;
		cellSignalLevel = ((com.startapp.common.c) (obj)).b();
		obj = null;
		if(MetaData.getInstance().isWfScanEnabled())
			obj = ((Object) (h.a(context, networkType)));
		if(obj == null)
			break MISSING_BLOCK_LABEL_97;
		if(((com.startapp.common.a.h.b) (obj)).a() == null)
		{
			signalLevel = ((com.startapp.common.a.h.b) (obj)).c();
			wifiRSSILevel = ((com.startapp.common.a.h.b) (obj)).b();
			wifiSignalLevel = ((com.startapp.common.a.h.b) (obj)).c();
			return;
		}
		signalLevel = ((com.startapp.common.a.h.b) (obj)).a();
		wifiRSSILevel = ((com.startapp.common.a.h.b) (obj)).a();
		wifiSignalLevel = ((com.startapp.common.a.h.b) (obj)).a();
		return;
		signalLevel = cellSignalLevel;
		return;
		signalLevel = "e106";
		cellSignalLevel = "e106";
		wifiSignalLevel = "e106";
		wifiRSSILevel = "e106";
		return;
	}

	private void setNetworkType(Context context)
	{
		networkType = h.a(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #668 <Method String h.a(Context)>
	//    3    5:putfield        #646 <Field String networkType>
	//    4    8:return          
	}

	public static void setUsingLocation(Context context, boolean flag)
	{
		com.startapp.android.publish.adsCommon.k.b(context, "shared_prefs_using_location", Boolean.valueOf(flag));
	//    0    0:aload_0         
	//    1    1:ldc2            #671 <String "shared_prefs_using_location">
	//    2    4:iload_1         
	//    3    5:invokestatic    #225 <Method Boolean Boolean.valueOf(boolean)>
	//    4    8:invokestatic    #676 <Method void com.startapp.android.publish.adsCommon.k.b(Context, String, Boolean)>
	//    5   11:return          
	}

	public void fillApplicationDetails(Context context, AdPreferences adpreferences)
	{
		fillApplicationDetails(context, adpreferences, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:invokevirtual   #681 <Method void fillApplicationDetails(Context, AdPreferences, boolean)>
	//    5    7:return          
	}

	public void fillApplicationDetails(Context context, AdPreferences adpreferences, boolean flag)
	{
		setPublisherId(adpreferences.getPublisherId());
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #686 <Method String AdPreferences.getPublisherId()>
	//    3    5:invokevirtual   #689 <Method void setPublisherId(String)>
		setProductId(adpreferences.getProductId());
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #692 <Method String AdPreferences.getProductId()>
	//    7   13:invokevirtual   #695 <Method void setProductId(String)>
		frameworksMap = com.startapp.android.publish.adsCommon.k.b(context, "sharedPrefsWrappers", frameworksMap);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:ldc2            #697 <String "sharedPrefsWrappers">
	//   11   21:aload_0         
	//   12   22:getfield        #111 <Field Map frameworksMap>
	//   13   25:invokestatic    #700 <Method Map com.startapp.android.publish.adsCommon.k.b(Context, String, Map)>
	//   14   28:putfield        #111 <Field Map frameworksMap>
		if(!com.startapp.android.publish.adsCommon.AdsConstants.g.booleanValue())
	//*  15   31:getstatic       #703 <Field Boolean com.startapp.android.publish.adsCommon.AdsConstants.g>
	//*  16   34:invokevirtual   #706 <Method boolean Boolean.booleanValue()>
	//*  17   37:ifne            63
		{
			setUserAdvertisingId(b.a().a(context));
	//   18   40:aload_0         
	//   19   41:invokestatic    #711 <Method b b.a()>
	//   20   44:aload_1         
	//   21   45:invokevirtual   #714 <Method com.startapp.common.a.b$c b.a(Context)>
	//   22   48:invokevirtual   #718 <Method void setUserAdvertisingId(com.startapp.common.a.b$c)>
			if(userAdvertisingId == null)
	//*  23   51:aload_0         
	//*  24   52:getfield        #210 <Field com.startapp.common.a.b$c userAdvertisingId>
	//*  25   55:ifnonnull       63
				setAndroidId(context);
	//   26   58:aload_0         
	//   27   59:aload_1         
	//   28   60:invokespecial   #720 <Method void setAndroidId(Context)>
		}
		setPackageId(context.getPackageName());
	//   29   63:aload_0         
	//   30   64:aload_1         
	//   31   65:invokevirtual   #723 <Method String Context.getPackageName()>
	//   32   68:invokevirtual   #726 <Method void setPackageId(String)>
		setInstallerPkg(i.d(context));
	//   33   71:aload_0         
	//   34   72:aload_1         
	//   35   73:invokestatic    #731 <Method String i.d(Context)>
	//   36   76:invokevirtual   #734 <Method void setInstallerPkg(String)>
		setManufacturer(Build.MANUFACTURER);
	//   37   79:aload_0         
	//   38   80:getstatic       #739 <Field String Build.MANUFACTURER>
	//   39   83:invokevirtual   #742 <Method void setManufacturer(String)>
		setModel(Build.MODEL);
	//   40   86:aload_0         
	//   41   87:getstatic       #745 <Field String Build.MODEL>
	//   42   90:invokevirtual   #748 <Method void setModel(String)>
		setDeviceVersion(Integer.toString(android.os.Build.VERSION.SDK_INT));
	//   43   93:aload_0         
	//   44   94:getstatic       #753 <Field int android.os.Build$VERSION.SDK_INT>
	//   45   97:invokestatic    #614 <Method String Integer.toString(int)>
	//   46  100:invokevirtual   #756 <Method void setDeviceVersion(String)>
		setLocale(context.getResources().getConfiguration().locale.toString());
	//   47  103:aload_0         
	//   48  104:aload_1         
	//   49  105:invokevirtual   #760 <Method Resources Context.getResources()>
	//   50  108:invokevirtual   #766 <Method Configuration Resources.getConfiguration()>
	//   51  111:getfield        #771 <Field Locale Configuration.locale>
	//   52  114:invokevirtual   #774 <Method String Locale.toString()>
	//   53  117:invokevirtual   #777 <Method void setLocale(String)>
		setInputLangs(c.b(context));
	//   54  120:aload_0         
	//   55  121:aload_1         
	//   56  122:invokestatic    #780 <Method Set c.b(Context)>
	//   57  125:invokevirtual   #784 <Method void setInputLangs(Set)>
		setWidth(context.getResources().getDisplayMetrics().widthPixels);
	//   58  128:aload_0         
	//   59  129:aload_1         
	//   60  130:invokevirtual   #760 <Method Resources Context.getResources()>
	//   61  133:invokevirtual   #788 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   62  136:getfield        #793 <Field int DisplayMetrics.widthPixels>
	//   63  139:invokevirtual   #797 <Method void setWidth(int)>
		setHeight(context.getResources().getDisplayMetrics().heightPixels);
	//   64  142:aload_0         
	//   65  143:aload_1         
	//   66  144:invokevirtual   #760 <Method Resources Context.getResources()>
	//   67  147:invokevirtual   #788 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   68  150:getfield        #800 <Field int DisplayMetrics.heightPixels>
	//   69  153:invokevirtual   #803 <Method void setHeight(int)>
		setDensity(context.getResources().getDisplayMetrics().density);
	//   70  156:aload_0         
	//   71  157:aload_1         
	//   72  158:invokevirtual   #760 <Method Resources Context.getResources()>
	//   73  161:invokevirtual   #788 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   74  164:getfield        #804 <Field float DisplayMetrics.density>
	//   75  167:invokevirtual   #808 <Method void setDensity(float)>
		setAppOnForeground(context);
	//   76  170:aload_0         
	//   77  171:aload_1         
	//   78  172:invokevirtual   #811 <Method void setAppOnForeground(Context)>
		setSessionId(g.d().a());
	//   79  175:aload_0         
	//   80  176:invokestatic    #816 <Method g g.d()>
	//   81  179:invokevirtual   #817 <Method String g.a()>
	//   82  182:invokevirtual   #820 <Method void setSessionId(String)>
		setUnknownSourcesAllowed(Boolean.valueOf(c.a(context)));
	//   83  185:aload_0         
	//   84  186:aload_1         
	//   85  187:invokestatic    #823 <Method boolean c.a(Context)>
	//   86  190:invokestatic    #225 <Method Boolean Boolean.valueOf(boolean)>
	//   87  193:invokevirtual   #827 <Method void setUnknownSourcesAllowed(Boolean)>
		setRoaming(context);
	//   88  196:aload_0         
	//   89  197:aload_1         
	//   90  198:invokevirtual   #830 <Method void setRoaming(Context)>
		setNetworkType(context);
	//   91  201:aload_0         
	//   92  202:aload_1         
	//   93  203:invokespecial   #832 <Method void setNetworkType(Context)>
		setNetworkLevels(context);
	//   94  206:aload_0         
	//   95  207:aload_1         
	//   96  208:invokespecial   #834 <Method void setNetworkLevels(Context)>
		setAppVersion(c.e(context));
	//   97  211:aload_0         
	//   98  212:aload_1         
	//   99  213:invokestatic    #837 <Method String c.e(Context)>
	//  100  216:invokevirtual   #840 <Method void setAppVersion(String)>
		setAppCode(c.d(context));
	//  101  219:aload_0         
	//  102  220:aload_1         
	//  103  221:invokestatic    #843 <Method int c.d(Context)>
	//  104  224:invokevirtual   #846 <Method void setAppCode(int)>
		adpreferences = ((AdPreferences) ((TelephonyManager)context.getSystemService("phone")));
	//  105  227:aload_1         
	//  106  228:ldc2            #848 <String "phone">
	//  107  231:invokevirtual   #515 <Method Object Context.getSystemService(String)>
	//  108  234:checkcast       #430 <Class TelephonyManager>
	//  109  237:astore_2        
		if(adpreferences != null)
	//* 110  238:aload_2         
	//* 111  239:ifnull          265
			try
			{
				fillSimDetails(((TelephonyManager) (adpreferences)));
	//  112  242:aload_0         
	//  113  243:aload_2         
	//  114  244:invokespecial   #850 <Method void fillSimDetails(TelephonyManager)>
				fillNetworkOperatorDetails(context, ((TelephonyManager) (adpreferences)));
	//  115  247:aload_0         
	//  116  248:aload_1         
	//  117  249:aload_2         
	//  118  250:invokespecial   #852 <Method void fillNetworkOperatorDetails(Context, TelephonyManager)>
				fillCellLocationDetails(context, ((TelephonyManager) (adpreferences)));
	//  119  253:aload_0         
	//  120  254:aload_1         
	//  121  255:aload_2         
	//  122  256:invokespecial   #854 <Method void fillCellLocationDetails(Context, TelephonyManager)>
				setCellTimingAdv(context, ((TelephonyManager) (adpreferences)));
	//  123  259:aload_0         
	//  124  260:aload_1         
	//  125  261:aload_2         
	//  126  262:invokespecial   #856 <Method void setCellTimingAdv(Context, TelephonyManager)>
			}
	//* 127  265:aload_0         
	//* 128  266:aload_1         
	//* 129  267:iload_3         
	//* 130  268:invokespecial   #858 <Method void fillWifiDetails(Context, boolean)>
	//* 131  271:aload_0         
	//* 132  272:aload_1         
	//* 133  273:invokestatic    #860 <Method boolean c.g(Context)>
	//* 134  276:putfield        #409 <Field boolean usbDebug>
	//* 135  279:aload_0         
	//* 136  280:aload_1         
	//* 137  281:ldc2            #862 <String "USER_CONSENT_PERSONALIZED_ADS_SERVING">
	//* 138  284:aconst_null     
	//* 139  285:invokestatic    #865 <Method String com.startapp.android.publish.adsCommon.k.a(Context, String, String)>
	//* 140  288:putfield        #413 <Field String personalizedAdsServing>
	//* 141  291:return          
			// Misplaced declaration of an exception variable
			catch(AdPreferences adpreferences) { }
	//  142  292:astore_2        
		fillWifiDetails(context, flag);
		usbDebug = c.g(context);
		personalizedAdsServing = com.startapp.android.publish.adsCommon.k.a(context, "USER_CONSENT_PERSONALIZED_ADS_SERVING", ((String) (null)));
		return;
	//* 143  293:goto            265
	}

	public void fillLocationDetails(AdPreferences adpreferences, Context context)
	{
		locations = ((List) (new ArrayList()));
	//    0    0:aload_0         
	//    1    1:new             #554 <Class ArrayList>
	//    2    4:dup             
	//    3    5:invokespecial   #555 <Method void ArrayList()>
	//    4    8:putfield        #113 <Field List locations>
		boolean flag1 = false;
	//    5   11:iconst_0        
	//    6   12:istore          4
		boolean flag = flag1;
	//    7   14:iload           4
	//    8   16:istore_3        
		if(adpreferences != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          99
		{
			flag = flag1;
	//   11   21:iload           4
	//   12   23:istore_3        
			if(adpreferences.getLatitude() != null)
	//*  13   24:aload_1         
	//*  14   25:invokevirtual   #871 <Method Double AdPreferences.getLatitude()>
	//*  15   28:ifnull          99
			{
				flag = flag1;
	//   16   31:iload           4
	//   17   33:istore_3        
				if(adpreferences.getLongitude() != null)
	//*  18   34:aload_1         
	//*  19   35:invokevirtual   #874 <Method Double AdPreferences.getLongitude()>
	//*  20   38:ifnull          99
				{
					Location location = new Location("loc");
	//   21   41:new             #876 <Class Location>
	//   22   44:dup             
	//   23   45:ldc2            #878 <String "loc">
	//   24   48:invokespecial   #880 <Method void Location(String)>
	//   25   51:astore          5
					location.setLongitude(adpreferences.getLongitude().doubleValue());
	//   26   53:aload           5
	//   27   55:aload_1         
	//   28   56:invokevirtual   #874 <Method Double AdPreferences.getLongitude()>
	//   29   59:invokevirtual   #886 <Method double Double.doubleValue()>
	//   30   62:invokevirtual   #890 <Method void Location.setLongitude(double)>
					location.setLongitude(adpreferences.getLongitude().doubleValue());
	//   31   65:aload           5
	//   32   67:aload_1         
	//   33   68:invokevirtual   #874 <Method Double AdPreferences.getLongitude()>
	//   34   71:invokevirtual   #886 <Method double Double.doubleValue()>
	//   35   74:invokevirtual   #890 <Method void Location.setLongitude(double)>
					location.setProvider("API");
	//   36   77:aload           5
	//   37   79:ldc2            #892 <String "API">
	//   38   82:invokevirtual   #895 <Method void Location.setProvider(String)>
					locations.add(((Object) (location)));
	//   39   85:aload_0         
	//   40   86:getfield        #113 <Field List locations>
	//   41   89:aload           5
	//   42   91:invokeinterface #572 <Method boolean List.add(Object)>
	//   43   96:pop             
					flag = true;
	//   44   97:iconst_1        
	//   45   98:istore_3        
				}
			}
		}
		com.startapp.android.publish.adsCommon.m.a().h(context);
	//   46   99:invokestatic    #900 <Method m com.startapp.android.publish.adsCommon.m.a()>
	//   47  102:aload_2         
	//   48  103:invokevirtual   #902 <Method void com.startapp.android.publish.adsCommon.m.h(Context)>
		adpreferences = ((AdPreferences) (f.a(context, MetaData.getInstance().getLocationConfig().isFiEnabled(), MetaData.getInstance().getLocationConfig().isCoEnabled())));
	//   49  106:aload_2         
	//   50  107:invokestatic    #504 <Method MetaData MetaData.getInstance()>
	//   51  110:invokevirtual   #906 <Method LocationConfig MetaData.getLocationConfig()>
	//   52  113:invokevirtual   #911 <Method boolean LocationConfig.isFiEnabled()>
	//   53  116:invokestatic    #504 <Method MetaData MetaData.getInstance()>
	//   54  119:invokevirtual   #906 <Method LocationConfig MetaData.getLocationConfig()>
	//   55  122:invokevirtual   #914 <Method boolean LocationConfig.isCoEnabled()>
	//   56  125:invokestatic    #917 <Method List f.a(Context, boolean, boolean)>
	//   57  128:astore_1        
		flag1 = flag;
	//   58  129:iload_3         
	//   59  130:istore          4
		if(adpreferences != null)
	//*  60  132:aload_1         
	//*  61  133:ifnull          162
		{
			flag1 = flag;
	//   62  136:iload_3         
	//   63  137:istore          4
			if(((List) (adpreferences)).size() > 0)
	//*  64  139:aload_1         
	//*  65  140:invokeinterface #390 <Method int List.size()>
	//*  66  145:ifle            162
			{
				locations.addAll(((java.util.Collection) (adpreferences)));
	//   67  148:aload_0         
	//   68  149:getfield        #113 <Field List locations>
	//   69  152:aload_1         
	//   70  153:invokeinterface #921 <Method boolean List.addAll(java.util.Collection)>
	//   71  158:pop             
				flag1 = true;
	//   72  159:iconst_1        
	//   73  160:istore          4
			}
		}
		setUsingLocation(context, flag1);
	//   74  162:aload_2         
	//   75  163:iload           4
	//   76  165:invokestatic    #923 <Method void setUsingLocation(Context, boolean)>
	//   77  168:return          
	}

	public String getAndroidId()
	{
		return androidId;
	//    0    0:aload_0         
	//    1    1:getfield        #415 <Field String androidId>
	//    2    4:areturn         
	}

	public int getAppCode()
	{
		return appCode;
	//    0    0:aload_0         
	//    1    1:getfield        #371 <Field int appCode>
	//    2    4:ireturn         
	}

	public String getAppVersion()
	{
		return appVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #368 <Field String appVersion>
	//    2    4:areturn         
	}

	public String getBlat()
	{
		return blat;
	//    0    0:aload_0         
	//    1    1:getfield        #928 <Field String blat>
	//    2    4:areturn         
	}

	public String getBlon()
	{
		return blon;
	//    0    0:aload_0         
	//    1    1:getfield        #930 <Field String blon>
	//    2    4:areturn         
	}

	public String getBssid()
	{
		return bssid;
	//    0    0:aload_0         
	//    1    1:getfield        #932 <Field String bssid>
	//    2    4:areturn         
	}

	public String getCellSignalLevel()
	{
		return cellSignalLevel;
	//    0    0:aload_0         
	//    1    1:getfield        #644 <Field String cellSignalLevel>
	//    2    4:areturn         
	}

	public String getCid()
	{
		return cid;
	//    0    0:aload_0         
	//    1    1:getfield        #934 <Field String cid>
	//    2    4:areturn         
	}

	public float getDensity()
	{
		return density;
	//    0    0:aload_0         
	//    1    1:getfield        #353 <Field float density>
	//    2    4:freturn         
	}

	public String getDeviceIP()
	{
		return deviceIP;
	//    0    0:aload_0         
	//    1    1:getfield        #938 <Field String deviceIP>
	//    2    4:areturn         
	}

	public String getDeviceVersion()
	{
		return deviceVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #239 <Field String deviceVersion>
	//    2    4:areturn         
	}

	public int getHeight()
	{
		return height;
	//    0    0:aload_0         
	//    1    1:getfield        #350 <Field int height>
	//    2    4:ireturn         
	}

	public Set getInputLangs()
	{
		return inputLangs;
	//    0    0:aload_0         
	//    1    1:getfield        #245 <Field Set inputLangs>
	//    2    4:areturn         
	}

	public String getInstallerPkg()
	{
		return installerPkg;
	//    0    0:aload_0         
	//    1    1:getfield        #208 <Field String installerPkg>
	//    2    4:areturn         
	}

	public String getIsp()
	{
		return isp;
	//    0    0:aload_0         
	//    1    1:getfield        #251 <Field String isp>
	//    2    4:areturn         
	}

	public String getIspName()
	{
		return ispName;
	//    0    0:aload_0         
	//    1    1:getfield        #254 <Field String ispName>
	//    2    4:areturn         
	}

	public String getLac()
	{
		return lac;
	//    0    0:aload_0         
	//    1    1:getfield        #948 <Field String lac>
	//    2    4:areturn         
	}

	public String getLocale()
	{
		return locale;
	//    0    0:aload_0         
	//    1    1:getfield        #242 <Field String locale>
	//    2    4:areturn         
	}

	public List getLocations()
	{
		return locations;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field List locations>
	//    2    4:areturn         
	}

	public String getManufacturer()
	{
		return manufacturer;
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field String manufacturer>
	//    2    4:areturn         
	}

	public String getModel()
	{
		return model;
	//    0    0:aload_0         
	//    1    1:getfield        #233 <Field String model>
	//    2    4:areturn         
	}

	public e getNameValueJson()
	{
		com.startapp.android.publish.adsCommon.Utils.c c1 = new com.startapp.android.publish.adsCommon.Utils.c();
	//    0    0:new             #956 <Class com.startapp.android.publish.adsCommon.Utils.c>
	//    1    3:dup             
	//    2    4:invokespecial   #957 <Method void com.startapp.android.publish.adsCommon.Utils.c()>
	//    3    7:astore_1        
		addParams(((e) (c1)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #959 <Method void addParams(e)>
		return ((e) (c1));
	//    7   13:aload_1         
	//    8   14:areturn         
	}

	public e getNameValueMap()
	{
		d d1 = new d();
	//    0    0:new             #962 <Class d>
	//    1    3:dup             
	//    2    4:invokespecial   #963 <Method void d()>
	//    3    7:astore_1        
		addParams(((e) (d1)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #959 <Method void addParams(e)>
		return ((e) (d1));
	//    7   13:aload_1         
	//    8   14:areturn         
	}

	public String getNetOper()
	{
		return netOper;
	//    0    0:aload_0         
	//    1    1:getfield        #965 <Field String netOper>
	//    2    4:areturn         
	}

	public String getNetworkOperName()
	{
		return networkOperName;
	//    0    0:aload_0         
	//    1    1:getfield        #967 <Field String networkOperName>
	//    2    4:areturn         
	}

	public String getNetworkType()
	{
		return networkType;
	//    0    0:aload_0         
	//    1    1:getfield        #646 <Field String networkType>
	//    2    4:areturn         
	}

	public String getOs()
	{
		return os;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field String os>
	//    2    4:areturn         
	}

	public String getPackageId()
	{
		return packageId;
	//    0    0:aload_0         
	//    1    1:getfield        #205 <Field String packageId>
	//    2    4:areturn         
	}

	public Map getParameters()
	{
		return parameters;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field Map parameters>
	//    2    4:areturn         
	}

	public String getProductId()
	{
		return productId;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field String productId>
	//    2    4:areturn         
	}

	public String getPublisherId()
	{
		return publisherId;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field String publisherId>
	//    2    4:areturn         
	}

	public String getRequestString()
	{
		return ((Object) (getNameValueMap())).toString();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #975 <Method e getNameValueMap()>
	//    2    4:invokevirtual   #976 <Method String Object.toString()>
	//    3    7:areturn         
	}

	public long getSdkFlavor()
	{
		return sdkFlavor;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field long sdkFlavor>
	//    2    4:lreturn         
	}

	public String getSdkVersion()
	{
		return sdkVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field String sdkVersion>
	//    2    4:areturn         
	}

	public String getSessionId()
	{
		if(clientSessionId == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #365 <Field String clientSessionId>
	//*   2    4:ifnonnull       10
			return "";
	//    3    7:ldc1            #159 <String "">
	//    4    9:areturn         
		else
			return clientSessionId;
	//    5   10:aload_0         
	//    6   11:getfield        #365 <Field String clientSessionId>
	//    7   14:areturn         
	}

	public String getSignalLevel()
	{
		return signalLevel;
	//    0    0:aload_0         
	//    1    1:getfield        #657 <Field String signalLevel>
	//    2    4:areturn         
	}

	public String getSsid()
	{
		return ssid;
	//    0    0:aload_0         
	//    1    1:getfield        #981 <Field String ssid>
	//    2    4:areturn         
	}

	public String getSubProductId()
	{
		return subProductId;
	//    0    0:aload_0         
	//    1    1:getfield        #296 <Field String subProductId>
	//    2    4:areturn         
	}

	public String getSubPublisherId()
	{
		return subPublisherId;
	//    0    0:aload_0         
	//    1    1:getfield        #293 <Field String subPublisherId>
	//    2    4:areturn         
	}

	public com.startapp.common.a.b.c getUserAdvertisingId()
	{
		return userAdvertisingId;
	//    0    0:aload_0         
	//    1    1:getfield        #210 <Field com.startapp.common.a.b$c userAdvertisingId>
	//    2    4:areturn         
	}

	public String getWfScanRes()
	{
		return wfScanRes;
	//    0    0:aload_0         
	//    1    1:getfield        #987 <Field String wfScanRes>
	//    2    4:areturn         
	}

	public int getWidth()
	{
		return width;
	//    0    0:aload_0         
	//    1    1:getfield        #344 <Field int width>
	//    2    4:ireturn         
	}

	public String getWifiRssiLevel()
	{
		return wifiRSSILevel;
	//    0    0:aload_0         
	//    1    1:getfield        #660 <Field String wifiRSSILevel>
	//    2    4:areturn         
	}

	public String getWifiSignalLevel()
	{
		return wifiSignalLevel;
	//    0    0:aload_0         
	//    1    1:getfield        #662 <Field String wifiSignalLevel>
	//    2    4:areturn         
	}

	public Boolean isAppOnForeground()
	{
		return appOnForeground;
	//    0    0:aload_0         
	//    1    1:getfield        #990 <Field Boolean appOnForeground>
	//    2    4:areturn         
	}

	public Boolean isRoaming()
	{
		return roaming;
	//    0    0:aload_0         
	//    1    1:getfield        #992 <Field Boolean roaming>
	//    2    4:areturn         
	}

	public Boolean isUnknownSourcesAllowed()
	{
		return unknownSourcesAllowed;
	//    0    0:aload_0         
	//    1    1:getfield        #994 <Field Boolean unknownSourcesAllowed>
	//    2    4:areturn         
	}

	public void setAppCode(int j)
	{
		appCode = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #371 <Field int appCode>
	//    3    5:return          
	}

	public void setAppOnForeground(Context context)
	{
		try
		{
			appOnForeground = Boolean.valueOf(i.e(context));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #996 <Method boolean i.e(Context)>
	//    3    5:invokestatic    #225 <Method Boolean Boolean.valueOf(boolean)>
	//    4    8:putfield        #990 <Field Boolean appOnForeground>
			return;
	//    5   11:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*   6   12:astore_1        
		{
			appOnForeground = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #990 <Field Boolean appOnForeground>
		}
	//   10   18:return          
	}

	public void setAppVersion(String s)
	{
		appVersion = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #368 <Field String appVersion>
	//    3    5:return          
	}

	public void setBlat(String s)
	{
		blat = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #928 <Field String blat>
	//    3    5:return          
	}

	public void setBlon(String s)
	{
		blon = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #930 <Field String blon>
	//    3    5:return          
	}

	public void setBssid(String s)
	{
		bssid = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #932 <Field String bssid>
	//    3    5:return          
	}

	public void setCid(String s)
	{
		cid = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #934 <Field String cid>
	//    3    5:return          
	}

	public void setDensity(float f1)
	{
		density = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #353 <Field float density>
	//    3    5:return          
	}

	public void setDeviceIP(WifiInfo wifiinfo)
	{
		deviceIP = h.a(wifiinfo);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #999 <Method String h.a(WifiInfo)>
	//    3    5:putfield        #938 <Field String deviceIP>
	//    4    8:return          
	}

	public void setDeviceVersion(String s)
	{
		deviceVersion = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #239 <Field String deviceVersion>
	//    3    5:return          
	}

	public void setHeight(int j)
	{
		height = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #350 <Field int height>
	//    3    5:return          
	}

	public void setInputLangs(Set set)
	{
		inputLangs = set;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #245 <Field Set inputLangs>
	//    3    5:return          
	}

	public void setInstallerPkg(String s)
	{
		installerPkg = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #208 <Field String installerPkg>
	//    3    5:return          
	}

	public void setIsp(String s)
	{
		isp = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #251 <Field String isp>
	//    3    5:return          
	}

	public void setIspName(String s)
	{
		ispName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #254 <Field String ispName>
	//    3    5:return          
	}

	public void setLac(String s)
	{
		lac = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #948 <Field String lac>
	//    3    5:return          
	}

	public void setLocale(String s)
	{
		locale = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #242 <Field String locale>
	//    3    5:return          
	}

	public void setLocations(List list)
	{
		locations = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #113 <Field List locations>
	//    3    5:return          
	}

	public void setManufacturer(String s)
	{
		manufacturer = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #236 <Field String manufacturer>
	//    3    5:return          
	}

	public void setModel(String s)
	{
		model = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #233 <Field String model>
	//    3    5:return          
	}

	public void setNetOper(String s)
	{
		netOper = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #965 <Field String netOper>
	//    3    5:return          
	}

	public void setNetworkOperName(String s)
	{
		networkOperName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #967 <Field String networkOperName>
	//    3    5:return          
	}

	public void setPackageId(String s)
	{
		packageId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #205 <Field String packageId>
	//    3    5:return          
	}

	public void setParameters(Map map)
	{
		parameters = map;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #85  <Field Map parameters>
	//    3    5:return          
	}

	public void setProductId(String s)
	{
		productId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #131 <Field String productId>
	//    3    5:return          
	}

	public void setPublisherId(String s)
	{
		publisherId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #123 <Field String publisherId>
	//    3    5:return          
	}

	public void setRetry(int j)
	{
		retry = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #300 <Field Integer retry>
	//    3    5:return          
	}

	public void setRoaming(Context context)
	{
		roaming = h.c(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #1010 <Method Boolean h.c(Context)>
	//    3    5:putfield        #992 <Field Boolean roaming>
	//    4    8:return          
	}

	public void setSdkFlavor(long l)
	{
		sdkFlavor = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #106 <Field long sdkFlavor>
	//    3    5:return          
	}

	public void setSdkVersion(String s)
	{
		sdkVersion = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #92  <Field String sdkVersion>
	//    3    5:return          
	}

	public void setSessionId(String s)
	{
		clientSessionId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #365 <Field String clientSessionId>
	//    3    5:return          
	}

	public void setSsid(String s)
	{
		ssid = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #981 <Field String ssid>
	//    3    5:return          
	}

	public void setSubProductId(String s)
	{
		subProductId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #296 <Field String subProductId>
	//    3    5:return          
	}

	public void setSubPublisherId(String s)
	{
		subPublisherId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #293 <Field String subPublisherId>
	//    3    5:return          
	}

	public void setUnknownSourcesAllowed(Boolean boolean1)
	{
		unknownSourcesAllowed = boolean1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #994 <Field Boolean unknownSourcesAllowed>
	//    3    5:return          
	}

	public void setUserAdvertisingId(com.startapp.common.a.b.c c1)
	{
		userAdvertisingId = c1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #210 <Field com.startapp.common.a.b$c userAdvertisingId>
	//    3    5:return          
	}

	public void setWfScanRes(String s)
	{
		wfScanRes = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #987 <Field String wfScanRes>
	//    3    5:return          
	}

	public void setWidth(int j)
	{
		width = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #344 <Field int width>
	//    3    5:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append("BaseRequest [parameters=").append(((Object) (parameters))).append("]").toString();
	//    0    0:new             #172 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #173 <Method void StringBuilder()>
	//    3    7:ldc2            #1017 <String "BaseRequest [parameters=">
	//    4   10:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//    5   13:aload_0         
	//    6   14:getfield        #85  <Field Map parameters>
	//    7   17:invokevirtual   #1020 <Method StringBuilder StringBuilder.append(Object)>
	//    8   20:ldc2            #1022 <String "]">
	//    9   23:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   10   26:invokevirtual   #189 <Method String StringBuilder.toString()>
	//   11   29:areturn         
	}

	private static final String OS = "android";
	private String androidId;
	private int appCode;
	private Boolean appOnForeground;
	private String appVersion;
	private String blat;
	private String blon;
	private String bssid;
	private String cellSignalLevel;
	private String cellTimingAdv;
	private String cid;
	private String clientSessionId;
	private float density;
	private String deviceIP;
	private String deviceVersion;
	private Map frameworksMap;
	private int height;
	private Set inputLangs;
	private String installerPkg;
	private String isp;
	private String ispName;
	private String lac;
	private String locale;
	private List locations;
	private String manufacturer;
	private String model;
	private String netOper;
	private String networkOperName;
	private String networkType;
	private String os;
	private String packageId;
	private Map parameters;
	private String personalizedAdsServing;
	private String productId;
	private String publisherId;
	protected Integer retry;
	private Boolean roaming;
	private long sdkFlavor;
	private int sdkId;
	private String sdkVersion;
	private String signalLevel;
	private String ssid;
	private String subProductId;
	private String subPublisherId;
	private Boolean unknownSourcesAllowed;
	private boolean usbDebug;
	private com.startapp.common.a.b.c userAdvertisingId;
	private String wfScanRes;
	private int width;
	private String wifiRSSILevel;
	private String wifiSignalLevel;
}
