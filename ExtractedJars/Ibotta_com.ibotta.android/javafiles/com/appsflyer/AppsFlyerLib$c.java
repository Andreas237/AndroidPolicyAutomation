// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appsflyer;

import android.content.Context;
import com.appsflyer.cache.CacheManager;
import com.appsflyer.cache.RequestCacheData;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.appsflyer:
//			AppsFlyerLib, AFLogger

final class AppsFlyerLib$c
	implements Runnable
{

	public final void run()
	{
		if(AppsFlyerLib._mth02CB(_fld0971))
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field AppsFlyerLib _fld0971>
	//*   2    4:invokestatic    #35  <Method boolean AppsFlyerLib._mth02CB(AppsFlyerLib)>
	//*   3    7:ifeq            11
			return;
	//    4   10:return          
		AppsFlyerLib._mth02CA(_fld0971, System.currentTimeMillis());
	//    5   11:aload_0         
	//    6   12:getfield        #18  <Field AppsFlyerLib _fld0971>
	//    7   15:invokestatic    #41  <Method long System.currentTimeMillis()>
	//    8   18:invokestatic    #45  <Method long AppsFlyerLib._mth02CA(AppsFlyerLib, long)>
	//    9   21:pop2            
		if(_fld02CB == null)
	//*  10   22:aload_0         
	//*  11   23:getfield        #23  <Field WeakReference _fld02CB>
	//*  12   26:ifnonnull       30
			return;
	//   13   29:return          
		AppsFlyerLib._mth02CA(_fld0971, true);
	//   14   30:aload_0         
	//   15   31:getfield        #18  <Field AppsFlyerLib _fld0971>
	//   16   34:iconst_1        
	//   17   35:invokestatic    #48  <Method boolean AppsFlyerLib._mth02CA(AppsFlyerLib, boolean)>
	//   18   38:pop             
		String s = AppsFlyerLib._mth0971("AppsFlyerKey");
	//   19   39:ldc1            #50  <String "AppsFlyerKey">
	//   20   41:invokestatic    #53  <Method String AppsFlyerLib._mth0971(String)>
	//   21   44:astore          6
		WeakReference weakreference = _fld02CB;
	//   22   46:aload_0         
	//   23   47:getfield        #23  <Field WeakReference _fld02CB>
	//   24   50:astore          5
		weakreference;
	//   25   52:aload           5
		JVM INSTR monitorenter ;
	//   26   54:monitorenter    
		Iterator iterator = CacheManager.getInstance().getCachedRequests((Context)((Reference) (_fld02CB)).get()).iterator();
	//   27   55:invokestatic    #59  <Method CacheManager CacheManager.getInstance()>
	//   28   58:aload_0         
	//   29   59:getfield        #23  <Field WeakReference _fld02CB>
	//   30   62:invokevirtual   #65  <Method Object Reference.get()>
	//   31   65:checkcast       #67  <Class Context>
	//   32   68:invokevirtual   #71  <Method List CacheManager.getCachedRequests(Context)>
	//   33   71:invokeinterface #77  <Method Iterator List.iterator()>
	//   34   76:astore          7
_L1:
		RequestCacheData requestcachedata;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_237;
	//   35   78:aload           7
	//   36   80:invokeinterface #83  <Method boolean Iterator.hasNext()>
	//   37   85:ifeq            237
		requestcachedata = (RequestCacheData)iterator.next();
	//   38   88:aload           7
	//   39   90:invokeinterface #86  <Method Object Iterator.next()>
	//   40   95:checkcast       #88  <Class RequestCacheData>
	//   41   98:astore          8
		StringBuilder stringbuilder = new StringBuilder("resending request: ");
	//   42  100:new             #90  <Class StringBuilder>
	//   43  103:dup             
	//   44  104:ldc1            #92  <String "resending request: ">
	//   45  106:invokespecial   #95  <Method void StringBuilder(String)>
	//   46  109:astore          9
		stringbuilder.append(requestcachedata.getRequestURL());
	//   47  111:aload           9
	//   48  113:aload           8
	//   49  115:invokevirtual   #99  <Method String RequestCacheData.getRequestURL()>
	//   50  118:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   51  121:pop             
		AFLogger.afInfoLog(((Object) (stringbuilder)).toString());
	//   52  122:aload           9
	//   53  124:invokevirtual   #106 <Method String Object.toString()>
	//   54  127:invokestatic    #111 <Method void AFLogger.afInfoLog(String)>
		long l = System.currentTimeMillis();
	//   55  130:invokestatic    #41  <Method long System.currentTimeMillis()>
	//   56  133:lstore_1        
		long l1 = Long.parseLong(requestcachedata.getCacheKey(), 10);
	//   57  134:aload           8
	//   58  136:invokevirtual   #114 <Method String RequestCacheData.getCacheKey()>
	//   59  139:bipush          10
	//   60  141:invokestatic    #120 <Method long Long.parseLong(String, int)>
	//   61  144:lstore_3        
		AppsFlyerLib appsflyerlib = _fld0971;
	//   62  145:aload_0         
	//   63  146:getfield        #18  <Field AppsFlyerLib _fld0971>
	//   64  149:astore          9
		StringBuilder stringbuilder1 = new StringBuilder();
	//   65  151:new             #90  <Class StringBuilder>
	//   66  154:dup             
	//   67  155:invokespecial   #121 <Method void StringBuilder()>
	//   68  158:astore          10
		stringbuilder1.append(requestcachedata.getRequestURL());
	//   69  160:aload           10
	//   70  162:aload           8
	//   71  164:invokevirtual   #99  <Method String RequestCacheData.getRequestURL()>
	//   72  167:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   73  170:pop             
		stringbuilder1.append("&isCachedRequest=true&timeincache=");
	//   74  171:aload           10
	//   75  173:ldc1            #123 <String "&isCachedRequest=true&timeincache=">
	//   76  175:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   77  178:pop             
		stringbuilder1.append(Long.toString((l - l1) / 1000L));
	//   78  179:aload           10
	//   79  181:lload_1         
	//   80  182:lload_3         
	//   81  183:lsub            
	//   82  184:ldc2w           #124 <Long 1000L>
	//   83  187:ldiv            
	//   84  188:invokestatic    #128 <Method String Long.toString(long)>
	//   85  191:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   86  194:pop             
		AppsFlyerLib._mth02CB(appsflyerlib, ((Object) (stringbuilder1)).toString(), requestcachedata.getPostData(), s, _fld02CB, requestcachedata.getCacheKey(), false);
	//   87  195:aload           9
	//   88  197:aload           10
	//   89  199:invokevirtual   #106 <Method String Object.toString()>
	//   90  202:aload           8
	//   91  204:invokevirtual   #131 <Method String RequestCacheData.getPostData()>
	//   92  207:aload           6
	//   93  209:aload_0         
	//   94  210:getfield        #23  <Field WeakReference _fld02CB>
	//   95  213:aload           8
	//   96  215:invokevirtual   #114 <Method String RequestCacheData.getCacheKey()>
	//   97  218:iconst_0        
	//   98  219:invokestatic    #134 <Method void AppsFlyerLib._mth02CB(AppsFlyerLib, String, String, String, WeakReference, String, boolean)>
		  goto _L1
	//*  99  222:goto            78
		Exception exception1;
		exception1;
	//  100  225:astore          8
		AFLogger.afErrorLog("Failed to resend cached request", ((Throwable) (exception1)));
	//  101  227:ldc1            #136 <String "Failed to resend cached request">
	//  102  229:aload           8
	//  103  231:invokestatic    #140 <Method void AFLogger.afErrorLog(String, Throwable)>
		  goto _L1
	//* 104  234:goto            78
		weakreference;
	//  105  237:aload           5
		JVM INSTR monitorexit ;
	//  106  239:monitorexit     
		break MISSING_BLOCK_LABEL_265;
	//  107  240:goto            265
		Exception exception;
		exception;
	//  108  243:astore          6
		weakreference;
	//  109  245:aload           5
		JVM INSTR monitorexit ;
	//  110  247:monitorexit     
		throw exception;
	//  111  248:aload           6
	//  112  250:athrow          
		Object obj;
		obj;
	//  113  251:astore          5
		break MISSING_BLOCK_LABEL_295;
	//  114  253:goto            295
		obj;
	//  115  256:astore          5
		AFLogger.afErrorLog("failed to check cache. ", ((Throwable) (obj)));
	//  116  258:ldc1            #142 <String "failed to check cache. ">
	//  117  260:aload           5
	//  118  262:invokestatic    #140 <Method void AFLogger.afErrorLog(String, Throwable)>
		AppsFlyerLib._mth02CA(_fld0971, false);
	//  119  265:aload_0         
	//  120  266:getfield        #18  <Field AppsFlyerLib _fld0971>
	//  121  269:iconst_0        
	//  122  270:invokestatic    #48  <Method boolean AppsFlyerLib._mth02CA(AppsFlyerLib, boolean)>
	//  123  273:pop             
		AppsFlyerLib._mth02CE(_fld0971).shutdown();
	//  124  274:aload_0         
	//  125  275:getfield        #18  <Field AppsFlyerLib _fld0971>
	//  126  278:invokestatic    #146 <Method ScheduledExecutorService AppsFlyerLib._mth02CE(AppsFlyerLib)>
	//  127  281:invokeinterface #151 <Method void ScheduledExecutorService.shutdown()>
		AppsFlyerLib._mth0971(_fld0971);
	//  128  286:aload_0         
	//  129  287:getfield        #18  <Field AppsFlyerLib _fld0971>
	//  130  290:invokestatic    #153 <Method ScheduledExecutorService AppsFlyerLib._mth0971(AppsFlyerLib)>
	//  131  293:pop             
		return;
	//  132  294:return          
		AppsFlyerLib._mth02CA(_fld0971, false);
	//  133  295:aload_0         
	//  134  296:getfield        #18  <Field AppsFlyerLib _fld0971>
	//  135  299:iconst_0        
	//  136  300:invokestatic    #48  <Method boolean AppsFlyerLib._mth02CA(AppsFlyerLib, boolean)>
	//  137  303:pop             
		throw obj;
	//  138  304:aload           5
	//  139  306:athrow          
	}

	private WeakReference _fld02CB;
	private AppsFlyerLib _fld0971;

	public AppsFlyerLib$c(AppsFlyerLib appsflyerlib, Context context)
	{
		_fld0971 = appsflyerlib;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field AppsFlyerLib _fld0971>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
		_fld02CB = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #23  <Field WeakReference _fld02CB>
		_fld02CB = new WeakReference(((Object) (context)));
	//    8   14:aload_0         
	//    9   15:new             #25  <Class WeakReference>
	//   10   18:dup             
	//   11   19:aload_2         
	//   12   20:invokespecial   #28  <Method void WeakReference(Object)>
	//   13   23:putfield        #23  <Field WeakReference _fld02CB>
	//   14   26:return          
	}
}
