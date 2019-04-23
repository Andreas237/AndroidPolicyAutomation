// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import bo.app.*;
import com.appboy.configuration.AppboyConfig;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.events.FeedUpdatedEvent;
import com.appboy.events.IEventSubscriber;
import com.appboy.events.InAppMessageEvent;
import com.appboy.events.SubmitFeedbackFailed;
import com.appboy.events.SubmitFeedbackSucceeded;
import com.appboy.lrucache.AppboyLruImageLoader;
import com.appboy.models.IInAppMessage;
import com.appboy.models.outgoing.AppboyProperties;
import com.appboy.support.AppboyFileUtils;
import com.appboy.support.AppboyLogger;
import com.appboy.support.PermissionUtils;
import com.appboy.support.StringUtils;
import com.appboy.support.ValidationUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.*;
import org.json.JSONException;

// Referenced classes of package com.appboy:
//			IAppboy, IAppboyUnitySupport, AppboyUser, IAppboyEndpointProvider, 
//			IAppboyNotificationFactory, IAppboyImageLoader

public class Appboy
	implements IAppboy, IAppboyUnitySupport
{

	Appboy(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #520 <Method void Object()>
		y = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #532 <Field boolean y>
		long l1 = System.nanoTime();
	//    5    9:invokestatic    #538 <Method long System.nanoTime()>
	//    6   12:lstore_2        
		AppboyLogger.d(k, "Braze SDK Initializing");
	//    7   13:getstatic       #142 <Field String k>
	//    8   16:ldc2            #540 <String "Braze SDK Initializing">
	//    9   19:invokestatic    #543 <Method int AppboyLogger.d(String, String)>
	//   10   22:pop             
		p = context.getApplicationContext();
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #549 <Method Context Context.getApplicationContext()>
	//   14   28:putfield        #551 <Field Context p>
	//   15   31:aload_0         
	//   16   32:new             #553 <Class br>
	//   17   35:dup             
	//   18   36:invokespecial   #554 <Method void br()>
	//   19   39:putfield        #556 <Field br r>
		AppboyLogger.setTestUserDeviceLoggingManager(r);
	//   20   42:aload_0         
	//   21   43:getfield        #556 <Field br r>
	//   22   46:invokestatic    #560 <Method void AppboyLogger.setTestUserDeviceLoggingManager(br)>
		Object obj = ((Object) (Build.MODEL));
	//   23   49:getstatic       #565 <Field String Build.MODEL>
	//   24   52:astore          6
		if(obj != null && m.contains(((Object) (((String) (obj)).toLowerCase(Locale.US)))))
	//*  25   54:aload           6
	//*  26   56:ifnull          124
	//*  27   59:getstatic       #510 <Field Set m>
	//*  28   62:aload           6
	//*  29   64:getstatic       #571 <Field Locale Locale.US>
	//*  30   67:invokevirtual   #575 <Method String String.toLowerCase(Locale)>
	//*  31   70:invokeinterface #581 <Method boolean Set.contains(Object)>
	//*  32   75:ifeq            124
		{
			String s1 = k;
	//   33   78:getstatic       #142 <Field String k>
	//   34   81:astore          7
			StringBuilder stringbuilder = new StringBuilder();
	//   35   83:new             #583 <Class StringBuilder>
	//   36   86:dup             
	//   37   87:invokespecial   #584 <Method void StringBuilder()>
	//   38   90:astore          8
			stringbuilder.append("Device build model matches a known crawler. Enabling mock network request mode. Device model: ");
	//   39   92:aload           8
	//   40   94:ldc2            #586 <String "Device build model matches a known crawler. Enabling mock network request mode. Device model: ">
	//   41   97:invokevirtual   #590 <Method StringBuilder StringBuilder.append(String)>
	//   42  100:pop             
			stringbuilder.append(((String) (obj)));
	//   43  101:aload           8
	//   44  103:aload           6
	//   45  105:invokevirtual   #590 <Method StringBuilder StringBuilder.append(String)>
	//   46  108:pop             
			AppboyLogger.i(s1, stringbuilder.toString());
	//   47  109:aload           7
	//   48  111:aload           8
	//   49  113:invokevirtual   #594 <Method String StringBuilder.toString()>
	//   50  116:invokestatic    #596 <Method int AppboyLogger.i(String, String)>
	//   51  119:pop             
			enableMockAppboyNetworkRequestsAndDropEventsMode();
	//   52  120:invokestatic    #600 <Method boolean enableMockAppboyNetworkRequestsAndDropEventsMode()>
	//   53  123:pop             
		}
		x = ((IAppboyImageLoader) (new AppboyLruImageLoader(p)));
	//   54  124:aload_0         
	//   55  125:new             #602 <Class AppboyLruImageLoader>
	//   56  128:dup             
	//   57  129:aload_0         
	//   58  130:getfield        #551 <Field Context p>
	//   59  133:invokespecial   #604 <Method void AppboyLruImageLoader(Context)>
	//   60  136:putfield        #606 <Field IAppboyImageLoader x>
		obj = ((Object) (new ThreadPoolExecutor(dz.a(), dz.b(), dz.c(), TimeUnit.SECONDS, dz.d(), ((java.util.concurrent.RejectedExecutionHandler) (new java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy())))));
	//   61  139:new             #608 <Class ThreadPoolExecutor>
	//   62  142:dup             
	//   63  143:invokestatic    #613 <Method int dz.a()>
	//   64  146:invokestatic    #615 <Method int dz.b()>
	//   65  149:invokestatic    #617 <Method long dz.c()>
	//   66  152:getstatic       #623 <Field TimeUnit TimeUnit.SECONDS>
	//   67  155:invokestatic    #626 <Method java.util.concurrent.BlockingQueue dz.d()>
	//   68  158:new             #628 <Class java.util.concurrent.ThreadPoolExecutor$DiscardOldestPolicy>
	//   69  161:dup             
	//   70  162:invokespecial   #629 <Method void java.util.concurrent.ThreadPoolExecutor$DiscardOldestPolicy()>
	//   71  165:invokespecial   #632 <Method void ThreadPoolExecutor(int, int, long, TimeUnit, java.util.concurrent.BlockingQueue, java.util.concurrent.RejectedExecutionHandler)>
	//   72  168:astore          6
		((Executor) (obj)).execute(new Runnable() {

			public void run()
			{
				AppboyLogger.checkForSystemLogLevelProperty();
			//    0    0:invokestatic    #26  <Method void AppboyLogger.checkForSystemLogLevelProperty()>
			//    1    3:return          
			}

			final Appboy a;

			
			{
				a = Appboy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field Appboy a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   73  170:aload           6
	//   74  172:new             #10  <Class Appboy$1>
	//   75  175:dup             
	//   76  176:aload_0         
	//   77  177:invokespecial   #635 <Method void Appboy$1(Appboy)>
	//   78  180:invokeinterface #641 <Method void Executor.execute(Runnable)>
		h = new AppboyConfigurationProvider(p);
	//   79  185:aload_0         
	//   80  186:new             #643 <Class AppboyConfigurationProvider>
	//   81  189:dup             
	//   82  190:aload_0         
	//   83  191:getfield        #551 <Field Context p>
	//   84  194:invokespecial   #644 <Method void AppboyConfigurationProvider(Context)>
	//   85  197:putfield        #646 <Field AppboyConfigurationProvider h>
		if(!StringUtils.isNullOrBlank(h.getCustomEndpoint()))
	//*  86  200:aload_0         
	//*  87  201:getfield        #646 <Field AppboyConfigurationProvider h>
	//*  88  204:invokevirtual   #649 <Method String AppboyConfigurationProvider.getCustomEndpoint()>
	//*  89  207:invokestatic    #655 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  90  210:ifne            224
			a(h.getCustomEndpoint());
	//   91  213:aload_0         
	//   92  214:aload_0         
	//   93  215:getfield        #646 <Field AppboyConfigurationProvider h>
	//   94  218:invokevirtual   #649 <Method String AppboyConfigurationProvider.getCustomEndpoint()>
	//   95  221:invokespecial   #658 <Method void a(String)>
		u = new i(p);
	//   96  224:aload_0         
	//   97  225:new             #660 <Class i>
	//   98  228:dup             
	//   99  229:aload_0         
	//  100  230:getfield        #551 <Field Context p>
	//  101  233:invokespecial   #661 <Method void i(Context)>
	//  102  236:putfield        #663 <Field i u>
		v = new ba(p);
	//  103  239:aload_0         
	//  104  240:new             #665 <Class ba>
	//  105  243:dup             
	//  106  244:aload_0         
	//  107  245:getfield        #551 <Field Context p>
	//  108  248:invokespecial   #666 <Method void ba(Context)>
	//  109  251:putfield        #668 <Field ba v>
		q = new z(((Executor) (obj)), F);
	//  110  254:aload_0         
	//  111  255:new             #670 <Class z>
	//  112  258:dup             
	//  113  259:aload           6
	//  114  261:getstatic       #672 <Field dg F>
	//  115  264:invokespecial   #675 <Method void z(Executor, dg)>
	//  116  267:putfield        #677 <Field z q>
		i = ((bp) (new bq(p, h)));
	//  117  270:aload_0         
	//  118  271:new             #679 <Class bq>
	//  119  274:dup             
	//  120  275:aload_0         
	//  121  276:getfield        #551 <Field Context p>
	//  122  279:aload_0         
	//  123  280:getfield        #646 <Field AppboyConfigurationProvider h>
	//  124  283:invokespecial   #682 <Method void bq(Context, AppboyConfigurationProvider)>
	//  125  286:putfield        #684 <Field bp i>
		((Executor) (obj)).execute(new Runnable(context) {

			public void run()
			{
				if(b.h.isFirebaseCloudMessagingRegistrationEnabled())
			//*   0    0:aload_0         
			//*   1    1:getfield        #18  <Field Appboy b>
			//*   2    4:getfield        #29  <Field AppboyConfigurationProvider Appboy.h>
			//*   3    7:invokevirtual   #35  <Method boolean AppboyConfigurationProvider.isFirebaseCloudMessagingRegistrationEnabled()>
			//*   4   10:ifeq            81
				{
					if(bj.a(Appboy.a(b), b.h))
			//*   5   13:aload_0         
			//*   6   14:getfield        #18  <Field Appboy b>
			//*   7   17:invokestatic    #38  <Method Context Appboy.a(Appboy)>
			//*   8   20:aload_0         
			//*   9   21:getfield        #18  <Field Appboy b>
			//*  10   24:getfield        #29  <Field AppboyConfigurationProvider Appboy.h>
			//*  11   27:invokestatic    #43  <Method boolean bj.a(Context, AppboyConfigurationProvider)>
			//*  12   30:ifeq            69
					{
						AppboyLogger.i(Appboy.b(), "Firebase Cloud Messaging found. Setting up Firebase Cloud Messaging.");
			//   13   33:invokestatic    #46  <Method String Appboy.b()>
			//   14   36:ldc1            #48  <String "Firebase Cloud Messaging found. Setting up Firebase Cloud Messaging.">
			//   15   38:invokestatic    #54  <Method int AppboyLogger.i(String, String)>
			//   16   41:pop             
						(new bj(a)).a(b.h.getFirebaseCloudMessagingSenderIdKey());
			//   17   42:new             #40  <Class bj>
			//   18   45:dup             
			//   19   46:aload_0         
			//   20   47:getfield        #20  <Field Context a>
			//   21   50:invokespecial   #55  <Method void bj(Context)>
			//   22   53:aload_0         
			//   23   54:getfield        #18  <Field Appboy b>
			//   24   57:getfield        #29  <Field AppboyConfigurationProvider Appboy.h>
			//   25   60:invokevirtual   #58  <Method String AppboyConfigurationProvider.getFirebaseCloudMessagingSenderIdKey()>
			//   26   63:invokevirtual   #61  <Method void bj.a(String)>
					} else
			//*  27   66:goto            90
					{
						AppboyLogger.e(Appboy.b(), "Firebase Cloud Messaging requirements not met. Braze will not register for Firebase Cloud Messaging.");
			//   28   69:invokestatic    #46  <Method String Appboy.b()>
			//   29   72:ldc1            #63  <String "Firebase Cloud Messaging requirements not met. Braze will not register for Firebase Cloud Messaging.">
			//   30   74:invokestatic    #66  <Method int AppboyLogger.e(String, String)>
			//   31   77:pop             
					}
				} else
			//*  32   78:goto            90
				{
					AppboyLogger.i(Appboy.b(), "Automatic Firebase Cloud Messaging registration not enabled in configuration. Braze will not register for Firebase Cloud Messaging.");
			//   33   81:invokestatic    #46  <Method String Appboy.b()>
			//   34   84:ldc1            #68  <String "Automatic Firebase Cloud Messaging registration not enabled in configuration. Braze will not register for Firebase Cloud Messaging.">
			//   35   86:invokestatic    #54  <Method int AppboyLogger.i(String, String)>
			//   36   89:pop             
				}
				if(b.h.isGcmMessagingRegistrationEnabled())
			//*  37   90:aload_0         
			//*  38   91:getfield        #18  <Field Appboy b>
			//*  39   94:getfield        #29  <Field AppboyConfigurationProvider Appboy.h>
			//*  40   97:invokevirtual   #71  <Method boolean AppboyConfigurationProvider.isGcmMessagingRegistrationEnabled()>
			//*  41  100:ifeq            208
				{
					if(bk.a(Appboy.a(b), b.h))
			//*  42  103:aload_0         
			//*  43  104:getfield        #18  <Field Appboy b>
			//*  44  107:invokestatic    #38  <Method Context Appboy.a(Appboy)>
			//*  45  110:aload_0         
			//*  46  111:getfield        #18  <Field Appboy b>
			//*  47  114:getfield        #29  <Field AppboyConfigurationProvider Appboy.h>
			//*  48  117:invokestatic    #74  <Method boolean bk.a(Context, AppboyConfigurationProvider)>
			//*  49  120:ifeq            196
					{
						AppboyLogger.i(Appboy.b(), "Google Cloud Messaging found. Setting up Google Cloud Messaging");
			//   50  123:invokestatic    #46  <Method String Appboy.b()>
			//   51  126:ldc1            #76  <String "Google Cloud Messaging found. Setting up Google Cloud Messaging">
			//   52  128:invokestatic    #54  <Method int AppboyLogger.i(String, String)>
			//   53  131:pop             
						bk bk1 = new bk(Appboy.a(b), b.i);
			//   54  132:new             #73  <Class bk>
			//   55  135:dup             
			//   56  136:aload_0         
			//   57  137:getfield        #18  <Field Appboy b>
			//   58  140:invokestatic    #38  <Method Context Appboy.a(Appboy)>
			//   59  143:aload_0         
			//   60  144:getfield        #18  <Field Appboy b>
			//   61  147:getfield        #79  <Field bp com.appboy.Appboy.i>
			//   62  150:invokespecial   #82  <Method void bk(Context, bp)>
			//   63  153:astore_1        
						String s2 = b.h.getGcmSenderId();
			//   64  154:aload_0         
			//   65  155:getfield        #18  <Field Appboy b>
			//   66  158:getfield        #29  <Field AppboyConfigurationProvider Appboy.h>
			//   67  161:invokevirtual   #85  <Method String AppboyConfigurationProvider.getGcmSenderId()>
			//   68  164:astore_2        
						if(s2 != null)
			//*  69  165:aload_2         
			//*  70  166:ifnull          184
							bk1.a(new String[] {
								s2
							});
			//   71  169:aload_1         
			//   72  170:iconst_1        
			//   73  171:anewarray       String[]
			//   74  174:dup             
			//   75  175:iconst_0        
			//   76  176:aload_2         
			//   77  177:aastore         
			//   78  178:invokevirtual   #90  <Method void bk.a(String[])>
						else
			//*  79  181:goto            217
							AppboyLogger.e(Appboy.b(), "GCM Sender Id not found, not registering with GCM Server");
			//   80  184:invokestatic    #46  <Method String Appboy.b()>
			//   81  187:ldc1            #92  <String "GCM Sender Id not found, not registering with GCM Server">
			//   82  189:invokestatic    #66  <Method int AppboyLogger.e(String, String)>
			//   83  192:pop             
					} else
			//*  84  193:goto            217
					{
						AppboyLogger.e(Appboy.b(), "GCM manifest requirements not met. Braze will not register for GCM.");
			//   85  196:invokestatic    #46  <Method String Appboy.b()>
			//   86  199:ldc1            #94  <String "GCM manifest requirements not met. Braze will not register for GCM.">
			//   87  201:invokestatic    #66  <Method int AppboyLogger.e(String, String)>
			//   88  204:pop             
					}
				} else
			//*  89  205:goto            217
				{
					AppboyLogger.i(Appboy.b(), "Automatic GCM registration not enabled in configuration. Braze will not register for GCM.");
			//   90  208:invokestatic    #46  <Method String Appboy.b()>
			//   91  211:ldc1            #96  <String "Automatic GCM registration not enabled in configuration. Braze will not register for GCM.">
			//   92  213:invokestatic    #54  <Method int AppboyLogger.i(String, String)>
			//   93  216:pop             
				}
				if(b.h.isAdmMessagingRegistrationEnabled())
			//*  94  217:aload_0         
			//*  95  218:getfield        #18  <Field Appboy b>
			//*  96  221:getfield        #29  <Field AppboyConfigurationProvider Appboy.h>
			//*  97  224:invokevirtual   #99  <Method boolean AppboyConfigurationProvider.isAdmMessagingRegistrationEnabled()>
			//*  98  227:ifeq            287
				{
					if(az.a(Appboy.a(b)))
			//*  99  230:aload_0         
			//* 100  231:getfield        #18  <Field Appboy b>
			//* 101  234:invokestatic    #38  <Method Context Appboy.a(Appboy)>
			//* 102  237:invokestatic    #104 <Method boolean az.a(Context)>
			//* 103  240:ifeq            277
					{
						AppboyLogger.i(Appboy.b(), "Amazon Device Messaging found. Setting up Amazon Device Messaging");
			//  104  243:invokestatic    #46  <Method String Appboy.b()>
			//  105  246:ldc1            #106 <String "Amazon Device Messaging found. Setting up Amazon Device Messaging">
			//  106  248:invokestatic    #54  <Method int AppboyLogger.i(String, String)>
			//  107  251:pop             
						(new az(Appboy.a(b), b.i)).a();
			//  108  252:new             #101 <Class az>
			//  109  255:dup             
			//  110  256:aload_0         
			//  111  257:getfield        #18  <Field Appboy b>
			//  112  260:invokestatic    #38  <Method Context Appboy.a(Appboy)>
			//  113  263:aload_0         
			//  114  264:getfield        #18  <Field Appboy b>
			//  115  267:getfield        #79  <Field bp com.appboy.Appboy.i>
			//  116  270:invokespecial   #107 <Method void az(Context, bp)>
			//  117  273:invokevirtual   #109 <Method void az.a()>
						return;
			//  118  276:return          
					} else
					{
						AppboyLogger.e(Appboy.b(), "ADM manifest requirements not met. Braze will not register for ADM.");
			//  119  277:invokestatic    #46  <Method String Appboy.b()>
			//  120  280:ldc1            #111 <String "ADM manifest requirements not met. Braze will not register for ADM.">
			//  121  282:invokestatic    #66  <Method int AppboyLogger.e(String, String)>
			//  122  285:pop             
						return;
			//  123  286:return          
					}
				} else
				{
					AppboyLogger.i(Appboy.b(), "Automatic ADM registration not enabled in configuration. Braze will not register for ADM.");
			//  124  287:invokestatic    #46  <Method String Appboy.b()>
			//  125  290:ldc1            #113 <String "Automatic ADM registration not enabled in configuration. Braze will not register for ADM.">
			//  126  292:invokestatic    #54  <Method int AppboyLogger.i(String, String)>
			//  127  295:pop             
					return;
			//  128  296:return          
				}
			}

			final Context a;
			final Appboy b;

			
			{
				b = Appboy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field Appboy b>
				a = context;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field Context a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//  126  289:aload           6
	//  127  291:new             #16  <Class Appboy$12>
	//  128  294:dup             
	//  129  295:aload_0         
	//  130  296:aload_1         
	//  131  297:invokespecial   #687 <Method void Appboy$12(Appboy, Context)>
	//  132  300:invokeinterface #641 <Method void Executor.execute(Runnable)>
		context = ((Context) (new ar("Appboy-User-Dependency-Thread")));
	//  133  305:new             #689 <Class ar>
	//  134  308:dup             
	//  135  309:ldc2            #691 <String "Appboy-User-Dependency-Thread">
	//  136  312:invokespecial   #693 <Method void ar(String)>
	//  137  315:astore_1        
		w = new as(((aa) (q)));
	//  138  316:aload_0         
	//  139  317:new             #695 <Class as>
	//  140  320:dup             
	//  141  321:aload_0         
	//  142  322:getfield        #677 <Field z q>
	//  143  325:invokespecial   #698 <Method void as(aa)>
	//  144  328:putfield        #700 <Field as w>
		((ar) (context)).a(((Thread.UncaughtExceptionHandler) (w)));
	//  145  331:aload_1         
	//  146  332:aload_0         
	//  147  333:getfield        #700 <Field as w>
	//  148  336:invokevirtual   #703 <Method void ar.a(Thread$UncaughtExceptionHandler)>
		j = new at(((java.util.concurrent.ThreadFactory) (context)));
	//  149  339:aload_0         
	//  150  340:new             #705 <Class at>
	//  151  343:dup             
	//  152  344:aload_1         
	//  153  345:invokespecial   #708 <Method void at(java.util.concurrent.ThreadFactory)>
	//  154  348:putfield        #710 <Field at j>
		j.submit(new Runnable() {

			public void run()
			{
				AppboyLogger.v(Appboy.b(), "Starting up a new user dependency manager");
			//    0    0:invokestatic    #25  <Method String Appboy.b()>
			//    1    3:ldc1            #27  <String "Starting up a new user dependency manager">
			//    2    5:invokestatic    #33  <Method int AppboyLogger.v(String, String)>
			//    3    8:pop             
				ea ea1 = new ea(Appboy.a(a), Appboy.b(a), a.h, ((aa) (Appboy.c(a))), Appboy.d(a), a.i, Appboy.c(), Appboy.d(), Appboy.e(a));
			//    4    9:new             #35  <Class ea>
			//    5   12:dup             
			//    6   13:aload_0         
			//    7   14:getfield        #16  <Field Appboy a>
			//    8   17:invokestatic    #38  <Method Context Appboy.a(Appboy)>
			//    9   20:aload_0         
			//   10   21:getfield        #16  <Field Appboy a>
			//   11   24:invokestatic    #41  <Method i Appboy.b(Appboy)>
			//   12   27:aload_0         
			//   13   28:getfield        #16  <Field Appboy a>
			//   14   31:getfield        #45  <Field AppboyConfigurationProvider Appboy.h>
			//   15   34:aload_0         
			//   16   35:getfield        #16  <Field Appboy a>
			//   17   38:invokestatic    #49  <Method z Appboy.c(Appboy)>
			//   18   41:aload_0         
			//   19   42:getfield        #16  <Field Appboy a>
			//   20   45:invokestatic    #53  <Method ba Appboy.d(Appboy)>
			//   21   48:aload_0         
			//   22   49:getfield        #16  <Field Appboy a>
			//   23   52:getfield        #57  <Field bp com.appboy.Appboy.i>
			//   24   55:invokestatic    #60  <Method boolean Appboy.c()>
			//   25   58:invokestatic    #62  <Method boolean Appboy.d()>
			//   26   61:aload_0         
			//   27   62:getfield        #16  <Field Appboy a>
			//   28   65:invokestatic    #66  <Method br Appboy.e(Appboy)>
			//   29   68:invokespecial   #69  <Method void ea(Context, i, AppboyConfigurationProvider, aa, ba, bp, boolean, boolean, br)>
			//   30   71:astore_1        
				Appboy.a(a, ea1);
			//   31   72:aload_0         
			//   32   73:getfield        #16  <Field Appboy a>
			//   33   76:aload_1         
			//   34   77:invokestatic    #72  <Method void Appboy.a(Appboy, ea)>
			//   35   80:return          
			}

			final Appboy a;

			
			{
				a = Appboy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field Appboy a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  155  351:aload_0         
	//  156  352:getfield        #710 <Field at j>
	//  157  355:new             #38  <Class Appboy$22>
	//  158  358:dup             
	//  159  359:aload_0         
	//  160  360:invokespecial   #711 <Method void Appboy$22(Appboy)>
	//  161  363:invokevirtual   #715 <Method Future at.submit(Runnable)>
	//  162  366:pop             
		((Executor) (obj)).execute(new Runnable() {

			public void run()
			{
				Appboy.f(a);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field Appboy a>
			//    2    4:invokestatic    #24  <Method void Appboy.f(Appboy)>
			//    3    7:return          
			}

			final Appboy a;

			
			{
				a = Appboy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field Appboy a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  163  367:aload           6
	//  164  369:new             #44  <Class Appboy$25>
	//  165  372:dup             
	//  166  373:aload_0         
	//  167  374:invokespecial   #716 <Method void Appboy$25(Appboy)>
	//  168  377:invokeinterface #641 <Method void Executor.execute(Runnable)>
		long l2 = System.nanoTime();
	//  169  382:invokestatic    #538 <Method long System.nanoTime()>
	//  170  385:lstore          4
		context = ((Context) (k));
	//  171  387:getstatic       #142 <Field String k>
	//  172  390:astore_1        
		obj = ((Object) (new StringBuilder()));
	//  173  391:new             #583 <Class StringBuilder>
	//  174  394:dup             
	//  175  395:invokespecial   #584 <Method void StringBuilder()>
	//  176  398:astore          6
		((StringBuilder) (obj)).append("Appboy loaded in ");
	//  177  400:aload           6
	//  178  402:ldc2            #718 <String "Appboy loaded in ">
	//  179  405:invokevirtual   #590 <Method StringBuilder StringBuilder.append(String)>
	//  180  408:pop             
		((StringBuilder) (obj)).append(TimeUnit.MILLISECONDS.convert(l2 - l1, TimeUnit.NANOSECONDS));
	//  181  409:aload           6
	//  182  411:getstatic       #721 <Field TimeUnit TimeUnit.MILLISECONDS>
	//  183  414:lload           4
	//  184  416:lload_2         
	//  185  417:lsub            
	//  186  418:getstatic       #724 <Field TimeUnit TimeUnit.NANOSECONDS>
	//  187  421:invokevirtual   #728 <Method long TimeUnit.convert(long, TimeUnit)>
	//  188  424:invokevirtual   #731 <Method StringBuilder StringBuilder.append(long)>
	//  189  427:pop             
		((StringBuilder) (obj)).append(" ms.");
	//  190  428:aload           6
	//  191  430:ldc2            #733 <String " ms.">
	//  192  433:invokevirtual   #590 <Method StringBuilder StringBuilder.append(String)>
	//  193  436:pop             
		AppboyLogger.d(((String) (context)), ((StringBuilder) (obj)).toString());
	//  194  437:aload_1         
	//  195  438:aload           6
	//  196  440:invokevirtual   #594 <Method String StringBuilder.toString()>
	//  197  443:invokestatic    #543 <Method int AppboyLogger.d(String, String)>
	//  198  446:pop             
	//  199  447:return          
	}

	static Context a(Appboy appboy)
	{
		return appboy.p;
	//    0    0:aload_0         
	//    1    1:getfield        #551 <Field Context p>
	//    2    4:areturn         
	}

	private static dg a(Context context)
	{
		if(F == null)
	//*   0    0:getstatic       #672 <Field dg F>
	//*   1    3:ifnonnull       17
			F = new dg(context);
	//    2    6:new             #738 <Class dg>
	//    3    9:dup             
	//    4   10:aload_0         
	//    5   11:invokespecial   #739 <Method void dg(Context)>
	//    6   14:putstatic       #672 <Field dg F>
		return F;
	//    7   17:getstatic       #672 <Field dg F>
	//    8   20:areturn         
	}

	private void a(ea ea1)
	{
		b = ea1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #742 <Field ea b>
		g = ea1.d();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #747 <Method bf ea.d()>
	//    6   10:putfield        #749 <Field bf g>
		f = ea1.a();
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #752 <Method dh ea.a()>
	//   10   18:putfield        #754 <Field dh f>
		d = ea1.l();
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #757 <Method fp ea.l()>
	//   14   26:putfield        #759 <Field fp d>
		e = ea1.m();
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #762 <Method bc ea.m()>
	//   18   34:putfield        #764 <Field bc e>
		s = new AppboyUser(ea1.g(), g, u.a(), ea1.j(), f);
	//   19   37:aload_0         
	//   20   38:new             #766 <Class AppboyUser>
	//   21   41:dup             
	//   22   42:aload_1         
	//   23   43:invokevirtual   #769 <Method dj ea.g()>
	//   24   46:aload_0         
	//   25   47:getfield        #749 <Field bf g>
	//   26   50:aload_0         
	//   27   51:getfield        #663 <Field i u>
	//   28   54:invokevirtual   #771 <Method String i.a()>
	//   29   57:aload_1         
	//   30   58:invokevirtual   #774 <Method bo ea.j()>
	//   31   61:aload_0         
	//   32   62:getfield        #754 <Field dh f>
	//   33   65:invokespecial   #777 <Method void AppboyUser(dj, bf, String, bo, dh)>
	//   34   68:putfield        #779 <Field AppboyUser s>
		ea1.c().a(ea1.f());
	//   35   71:aload_1         
	//   36   72:invokevirtual   #782 <Method y ea.c()>
	//   37   75:aload_1         
	//   38   76:invokevirtual   #785 <Method z ea.f()>
	//   39   79:invokevirtual   #790 <Method void y.a(z)>
		ea1.e().a();
	//   40   82:aload_1         
	//   41   83:invokevirtual   #793 <Method k ea.e()>
	//   42   86:invokevirtual   #797 <Method void k.a()>
		a = ((aa) (ea1.f()));
	//   43   89:aload_0         
	//   44   90:aload_1         
	//   45   91:invokevirtual   #785 <Method z ea.f()>
	//   46   94:putfield        #799 <Field aa a>
		w.a(a);
	//   47   97:aload_0         
	//   48   98:getfield        #700 <Field as w>
	//   49  101:aload_0         
	//   50  102:getfield        #799 <Field aa a>
	//   51  105:invokevirtual   #801 <Method void as.a(aa)>
		t = ea1.h();
	//   52  108:aload_0         
	//   53  109:aload_1         
	//   54  110:invokevirtual   #804 <Method ThreadPoolExecutor ea.h()>
	//   55  113:putfield        #806 <Field ThreadPoolExecutor t>
		c = ea1.i();
	//   56  116:aload_0         
	//   57  117:aload_1         
	//   58  118:invokevirtual   #809 <Method dc ea.i()>
	//   59  121:putfield        #811 <Field dc c>
		d = ea1.l();
	//   60  124:aload_0         
	//   61  125:aload_1         
	//   62  126:invokevirtual   #757 <Method fp ea.l()>
	//   63  129:putfield        #759 <Field fp d>
		ea1.k().a(((Executor) (t)), ((bo.app.q) (ea1.e())));
	//   64  132:aload_1         
	//   65  133:invokevirtual   #814 <Method bb ea.k()>
	//   66  136:aload_0         
	//   67  137:getfield        #806 <Field ThreadPoolExecutor t>
	//   68  140:aload_1         
	//   69  141:invokevirtual   #793 <Method k ea.e()>
	//   70  144:invokevirtual   #819 <Method void bb.a(Executor, bo.app.q)>
		r.a(((bo.app.bl) (g)));
	//   71  147:aload_0         
	//   72  148:getfield        #556 <Field br r>
	//   73  151:aload_0         
	//   74  152:getfield        #749 <Field bf g>
	//   75  155:invokevirtual   #822 <Method void br.a(bo.app.bl)>
		r.a(f.o());
	//   76  158:aload_0         
	//   77  159:getfield        #556 <Field br r>
	//   78  162:aload_0         
	//   79  163:getfield        #754 <Field dh f>
	//   80  166:invokevirtual   #826 <Method boolean dh.o()>
	//   81  169:invokevirtual   #829 <Method void br.a(boolean)>
	//   82  172:return          
	}

	static void a(Appboy appboy, ea ea1)
	{
		appboy.a(ea1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #832 <Method void a(ea)>
	//    3    5:return          
	}

	static void a(Appboy appboy, Throwable throwable)
	{
		appboy.a(throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #836 <Method void a(Throwable)>
	//    3    5:return          
	}

	private void a(String s1)
	{
		synchronized(z)
	//*   0    0:getstatic       #522 <Field Object z>
	//*   1    3:astore_2        
	//*   2    4:aload_2         
	//*   3    5:monitorenter    
		{
			setAppboyEndpointProvider(new IAppboyEndpointProvider(s1) {

				public Uri getApiEndpoint(Uri uri)
				{
					return uri.buildUpon().encodedAuthority(a).build();
				//    0    0:aload_1         
				//    1    1:invokevirtual   #32  <Method android.net.Uri$Builder Uri.buildUpon()>
				//    2    4:aload_0         
				//    3    5:getfield        #20  <Field String a>
				//    4    8:invokevirtual   #38  <Method android.net.Uri$Builder android.net.Uri$Builder.encodedAuthority(String)>
				//    5   11:invokevirtual   #42  <Method Uri android.net.Uri$Builder.build()>
				//    6   14:areturn         
				}

				final String a;
				final Appboy b;

			
			{
				b = Appboy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field Appboy b>
				a = s1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field String a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    4    6:new             #42  <Class Appboy$24>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #839 <Method void Appboy$24(Appboy, String)>
	//    9   15:invokestatic    #843 <Method void setAppboyEndpointProvider(IAppboyEndpointProvider)>
		}
	//   10   18:aload_2         
	//   11   19:monitorexit     
		return;
	//   12   20:return          
		s1;
	//   13   21:astore_1        
		obj;
	//   14   22:aload_2         
		JVM INSTR monitorexit ;
	//   15   23:monitorexit     
		throw s1;
	//   16   24:aload_1         
	//   17   25:athrow          
	}

	private void a(Throwable throwable)
	{
		try
		{
			a.a(((Object) (throwable)), java/lang/Throwable);
	//    0    0:aload_0         
	//    1    1:getfield        #799 <Field aa a>
	//    2    4:aload_1         
	//    3    5:ldc2            #847 <Class Throwable>
	//    4    8:invokeinterface #852 <Method void aa.a(Object, Class)>
			return;
	//    5   13:return          
		}
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
	//*   6   14:astore_1        
		{
			AppboyLogger.e(k, "Failed to log throwable.", throwable);
	//    7   15:getstatic       #142 <Field String k>
	//    8   18:ldc2            #854 <String "Failed to log throwable.">
	//    9   21:aload_1         
	//   10   22:invokestatic    #857 <Method int AppboyLogger.e(String, String, Throwable)>
	//   11   25:pop             
		}
	//   12   26:return          
	}

	static i b(Appboy appboy)
	{
		return appboy.u;
	//    0    0:aload_0         
	//    1    1:getfield        #663 <Field i u>
	//    2    4:areturn         
	}

	static String b()
	{
		return k;
	//    0    0:getstatic       #142 <Field String k>
	//    1    3:areturn         
	}

	private void b(boolean flag)
	{
		j.submit(new Runnable(flag) {

			public void run()
			{
				b.g.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field Appboy b>
			//    2    4:getfield        #29  <Field bf Appboy.g>
			//    3    7:aload_0         
			//    4    8:getfield        #20  <Field boolean a>
			//    5   11:invokevirtual   #33  <Method void bf.a(boolean)>
				b.b.b().a(a);
			//    6   14:aload_0         
			//    7   15:getfield        #18  <Field Appboy b>
			//    8   18:getfield        #36  <Field ea Appboy.b>
			//    9   21:invokevirtual   #41  <Method n ea.b()>
			//   10   24:aload_0         
			//   11   25:getfield        #20  <Field boolean a>
			//   12   28:invokevirtual   #44  <Method void n.a(boolean)>
				if(Appboy.h(b) != null)
			//*  13   31:aload_0         
			//*  14   32:getfield        #18  <Field Appboy b>
			//*  15   35:invokestatic    #48  <Method IAppboyImageLoader Appboy.h(Appboy)>
			//*  16   38:ifnull          94
				{
					String s1 = Appboy.b();
			//   17   41:invokestatic    #51  <Method String Appboy.b()>
			//   18   44:astore_1        
					StringBuilder stringbuilder = new StringBuilder();
			//   19   45:new             #53  <Class StringBuilder>
			//   20   48:dup             
			//   21   49:invokespecial   #54  <Method void StringBuilder()>
			//   22   52:astore_2        
					stringbuilder.append("Setting the image loader deny network downloads to ");
			//   23   53:aload_2         
			//   24   54:ldc1            #56  <String "Setting the image loader deny network downloads to ">
			//   25   56:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
			//   26   59:pop             
					stringbuilder.append(a);
			//   27   60:aload_2         
			//   28   61:aload_0         
			//   29   62:getfield        #20  <Field boolean a>
			//   30   65:invokevirtual   #63  <Method StringBuilder StringBuilder.append(boolean)>
			//   31   68:pop             
					AppboyLogger.d(s1, stringbuilder.toString());
			//   32   69:aload_1         
			//   33   70:aload_2         
			//   34   71:invokevirtual   #66  <Method String StringBuilder.toString()>
			//   35   74:invokestatic    #72  <Method int AppboyLogger.d(String, String)>
			//   36   77:pop             
					Appboy.h(b).setOffline(a);
			//   37   78:aload_0         
			//   38   79:getfield        #18  <Field Appboy b>
			//   39   82:invokestatic    #48  <Method IAppboyImageLoader Appboy.h(Appboy)>
			//   40   85:aload_0         
			//   41   86:getfield        #20  <Field boolean a>
			//   42   89:invokeinterface #77  <Method void IAppboyImageLoader.setOffline(boolean)>
				}
			//   43   94:return          
			}

			final boolean a;
			final Appboy b;

			
			{
				b = Appboy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field Appboy b>
				a = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #20  <Field boolean a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #710 <Field at j>
	//    2    4:new             #40  <Class Appboy$23>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokespecial   #861 <Method void Appboy$23(Appboy, boolean)>
	//    7   13:invokevirtual   #715 <Method Future at.submit(Runnable)>
	//    8   16:pop             
	//    9   17:return          
	}

	static z c(Appboy appboy)
	{
		return appboy.q;
	//    0    0:aload_0         
	//    1    1:getfield        #677 <Field z q>
	//    2    4:areturn         
	}

	static boolean c()
	{
		return C;
	//    0    0:getstatic       #524 <Field boolean C>
	//    1    3:ireturn         
	}

	public static void clearAppboyEndpointProvider()
	{
		synchronized(z)
	//*   0    0:getstatic       #522 <Field Object z>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			A = null;
	//    4    6:aconst_null     
	//    5    7:putstatic       #865 <Field IAppboyEndpointProvider A>
		}
	//    6   10:aload_0         
	//    7   11:monitorexit     
		return;
	//    8   12:return          
		exception;
	//    9   13:astore_1        
		obj;
	//   10   14:aload_0         
		JVM INSTR monitorexit ;
	//   11   15:monitorexit     
		throw exception;
	//   12   16:aload_1         
	//   13   17:athrow          
	}

	public static boolean configure(Context context, AppboyConfig appboyconfig)
	{
		if(o != null)
			break MISSING_BLOCK_LABEL_111;
	//    0    0:getstatic       #518 <Field Appboy o>
	//    1    3:ifnonnull       111
		if(E)
			break MISSING_BLOCK_LABEL_98;
	//    2    6:getstatic       #528 <Field boolean E>
	//    3    9:ifne            98
		com/appboy/Appboy;
	//    4   12:ldc1            #2   <Class Appboy>
		JVM INSTR monitorenter ;
	//    5   14:monitorenter    
		if(o != null || E)
			break MISSING_BLOCK_LABEL_76;
	//    6   15:getstatic       #518 <Field Appboy o>
	//    7   18:ifnonnull       76
	//    8   21:getstatic       #528 <Field boolean E>
	//    9   24:ifne            76
		context = ((Context) (new j(context.getApplicationContext())));
	//   10   27:new             #869 <Class j>
	//   11   30:dup             
	//   12   31:aload_0         
	//   13   32:invokevirtual   #549 <Method Context Context.getApplicationContext()>
	//   14   35:invokespecial   #870 <Method void j(Context)>
	//   15   38:astore_0        
		if(appboyconfig == null)
			break MISSING_BLOCK_LABEL_57;
	//   16   39:aload_1         
	//   17   40:ifnull          57
		E = true;
	//   18   43:iconst_1        
	//   19   44:putstatic       #528 <Field boolean E>
		((j) (context)).a(appboyconfig);
	//   20   47:aload_0         
	//   21   48:aload_1         
	//   22   49:invokevirtual   #873 <Method void j.a(AppboyConfig)>
		com/appboy/Appboy;
	//   23   52:ldc1            #2   <Class Appboy>
		JVM INSTR monitorexit ;
	//   24   54:monitorexit     
		return true;
	//   25   55:iconst_1        
	//   26   56:ireturn         
		AppboyLogger.i(k, "Appboy.configure() called with a null config; Clearing all configuration values.");
	//   27   57:getstatic       #142 <Field String k>
	//   28   60:ldc2            #875 <String "Appboy.configure() called with a null config; Clearing all configuration values.">
	//   29   63:invokestatic    #596 <Method int AppboyLogger.i(String, String)>
	//   30   66:pop             
		((j) (context)).a();
	//   31   67:aload_0         
	//   32   68:invokevirtual   #876 <Method void j.a()>
		com/appboy/Appboy;
	//   33   71:ldc1            #2   <Class Appboy>
		JVM INSTR monitorexit ;
	//   34   73:monitorexit     
		return true;
	//   35   74:iconst_1        
	//   36   75:ireturn         
		AppboyLogger.i(k, "Appboy.configure() can only be called once during the lifetime of the singleton.");
	//   37   76:getstatic       #142 <Field String k>
	//   38   79:ldc2            #878 <String "Appboy.configure() can only be called once during the lifetime of the singleton.">
	//   39   82:invokestatic    #596 <Method int AppboyLogger.i(String, String)>
	//   40   85:pop             
		com/appboy/Appboy;
	//   41   86:ldc1            #2   <Class Appboy>
		JVM INSTR monitorexit ;
	//   42   88:monitorexit     
		break MISSING_BLOCK_LABEL_121;
	//   43   89:goto            121
		context;
	//   44   92:astore_0        
		com/appboy/Appboy;
	//   45   93:ldc1            #2   <Class Appboy>
		JVM INSTR monitorexit ;
	//   46   95:monitorexit     
		throw context;
	//   47   96:aload_0         
	//   48   97:athrow          
		AppboyLogger.w(k, "Appboy.configure() can only be called once during the lifetime of the singleton.");
	//   49   98:getstatic       #142 <Field String k>
	//   50  101:ldc2            #878 <String "Appboy.configure() can only be called once during the lifetime of the singleton.">
	//   51  104:invokestatic    #880 <Method int AppboyLogger.w(String, String)>
	//   52  107:pop             
		break MISSING_BLOCK_LABEL_121;
	//   53  108:goto            121
		AppboyLogger.w(k, "Appboy.configure() must be called before the first call to Appboy.getInstance()");
	//   54  111:getstatic       #142 <Field String k>
	//   55  114:ldc2            #882 <String "Appboy.configure() must be called before the first call to Appboy.getInstance()">
	//   56  117:invokestatic    #880 <Method int AppboyLogger.w(String, String)>
	//   57  120:pop             
		return false;
	//   58  121:iconst_0        
	//   59  122:ireturn         
	}

	static ba d(Appboy appboy)
	{
		return appboy.v;
	//    0    0:aload_0         
	//    1    1:getfield        #668 <Field ba v>
	//    2    4:areturn         
	}

	static boolean d()
	{
		return D;
	//    0    0:getstatic       #526 <Field boolean D>
	//    1    3:ireturn         
	}

	public static void disableSdk(Context context)
	{
		a(context).a(true);
	//    0    0:aload_0         
	//    1    1:invokestatic    #886 <Method dg a(Context)>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #887 <Method void dg.a(boolean)>
		Log.w(k, "Stopping the SDK instance.");
	//    4    8:getstatic       #142 <Field String k>
	//    5   11:ldc2            #889 <String "Stopping the SDK instance.">
	//    6   14:invokestatic    #892 <Method int Log.w(String, String)>
	//    7   17:pop             
		g();
	//    8   18:invokestatic    #894 <Method void g()>
		AppboyLogger.w(k, "Disabling all network requests");
	//    9   21:getstatic       #142 <Field String k>
	//   10   24:ldc2            #896 <String "Disabling all network requests">
	//   11   27:invokestatic    #880 <Method int AppboyLogger.w(String, String)>
	//   12   30:pop             
		setOutboundNetworkRequestsOffline(true);
	//   13   31:iconst_1        
	//   14   32:invokestatic    #899 <Method void setOutboundNetworkRequestsOffline(boolean)>
	//   15   35:return          
	}

	static br e(Appboy appboy)
	{
		return appboy.r;
	//    0    0:aload_0         
	//    1    1:getfield        #556 <Field br r>
	//    2    4:areturn         
	}

	static Set e()
	{
		return l;
	//    0    0:getstatic       #500 <Field Set l>
	//    1    3:areturn         
	}

	public static boolean enableMockAppboyNetworkRequestsAndDropEventsMode()
	{
		if(o != null)
			break MISSING_BLOCK_LABEL_67;
	//    0    0:getstatic       #518 <Field Appboy o>
	//    1    3:ifnonnull       67
		com/appboy/Appboy;
	//    2    6:ldc1            #2   <Class Appboy>
		JVM INSTR monitorenter ;
	//    3    8:monitorenter    
		if(o != null)
			break MISSING_BLOCK_LABEL_55;
	//    4    9:getstatic       #518 <Field Appboy o>
	//    5   12:ifnonnull       55
		if(!C)
			break MISSING_BLOCK_LABEL_36;
	//    6   15:getstatic       #524 <Field boolean C>
	//    7   18:ifeq            36
		AppboyLogger.i(k, "Appboy network requests already being mocked. Note that events dispatched in this mode are dropped.");
	//    8   21:getstatic       #142 <Field String k>
	//    9   24:ldc2            #903 <String "Appboy network requests already being mocked. Note that events dispatched in this mode are dropped.">
	//   10   27:invokestatic    #596 <Method int AppboyLogger.i(String, String)>
	//   11   30:pop             
		com/appboy/Appboy;
	//   12   31:ldc1            #2   <Class Appboy>
		JVM INSTR monitorexit ;
	//   13   33:monitorexit     
		return true;
	//   14   34:iconst_1        
	//   15   35:ireturn         
		AppboyLogger.i(k, "Appboy network requests will be mocked. Events dispatched in this mode will be dropped.");
	//   16   36:getstatic       #142 <Field String k>
	//   17   39:ldc2            #905 <String "Appboy network requests will be mocked. Events dispatched in this mode will be dropped.">
	//   18   42:invokestatic    #596 <Method int AppboyLogger.i(String, String)>
	//   19   45:pop             
		C = true;
	//   20   46:iconst_1        
	//   21   47:putstatic       #524 <Field boolean C>
		com/appboy/Appboy;
	//   22   50:ldc1            #2   <Class Appboy>
		JVM INSTR monitorexit ;
	//   23   52:monitorexit     
		return true;
	//   24   53:iconst_1        
	//   25   54:ireturn         
		com/appboy/Appboy;
	//   26   55:ldc1            #2   <Class Appboy>
		JVM INSTR monitorexit ;
	//   27   57:monitorexit     
		break MISSING_BLOCK_LABEL_67;
	//   28   58:goto            67
		Exception exception;
		exception;
	//   29   61:astore_0        
		com/appboy/Appboy;
	//   30   62:ldc1            #2   <Class Appboy>
		JVM INSTR monitorexit ;
	//   31   64:monitorexit     
		throw exception;
	//   32   65:aload_0         
	//   33   66:athrow          
		AppboyLogger.e(k, "Attempt to enable mocking Braze network requests had no effect since getInstance() has already been called.");
	//   34   67:getstatic       #142 <Field String k>
	//   35   70:ldc2            #907 <String "Attempt to enable mocking Braze network requests had no effect since getInstance() has already been called.">
	//   36   73:invokestatic    #909 <Method int AppboyLogger.e(String, String)>
	//   37   76:pop             
		return false;
	//   38   77:iconst_0        
	//   39   78:ireturn         
	}

	public static void enableSdk(Context context)
	{
		Log.w(k, "Setting SDK to enabled.");
	//    0    0:getstatic       #142 <Field String k>
	//    1    3:ldc2            #912 <String "Setting SDK to enabled.">
	//    2    6:invokestatic    #892 <Method int Log.w(String, String)>
	//    3    9:pop             
		a(context).a(false);
	//    4   10:aload_0         
	//    5   11:invokestatic    #886 <Method dg a(Context)>
	//    6   14:iconst_0        
	//    7   15:invokevirtual   #887 <Method void dg.a(boolean)>
		AppboyLogger.w(k, "Enabling all network requests");
	//    8   18:getstatic       #142 <Field String k>
	//    9   21:ldc2            #914 <String "Enabling all network requests">
	//   10   24:invokestatic    #880 <Method int AppboyLogger.w(String, String)>
	//   11   27:pop             
		setOutboundNetworkRequestsOffline(false);
	//   12   28:iconst_0        
	//   13   29:invokestatic    #899 <Method void setOutboundNetworkRequestsOffline(boolean)>
	//   14   32:return          
	}

	private void f()
	{
		Iterator iterator = n.iterator();
	//    0    0:getstatic       #516 <Field Set n>
	//    1    3:invokeinterface #918 <Method Iterator Set.iterator()>
	//    2    8:astore_3        
		boolean flag = true;
	//    3    9:iconst_1        
	//    4   10:istore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//    5   11:aload_3         
	//    6   12:invokeinterface #923 <Method boolean Iterator.hasNext()>
	//    7   17:ifeq            99
			String s1 = (String)iterator.next();
	//    8   20:aload_3         
	//    9   21:invokeinterface #927 <Method Object Iterator.next()>
	//   10   26:checkcast       #146 <Class String>
	//   11   29:astore          4
			if(!PermissionUtils.hasPermission(p, s1))
	//*  12   31:aload_0         
	//*  13   32:getfield        #551 <Field Context p>
	//*  14   35:aload           4
	//*  15   37:invokestatic    #933 <Method boolean PermissionUtils.hasPermission(Context, String)>
	//*  16   40:ifne            11
			{
				String s2 = k;
	//   17   43:getstatic       #142 <Field String k>
	//   18   46:astore          5
				StringBuilder stringbuilder = new StringBuilder();
	//   19   48:new             #583 <Class StringBuilder>
	//   20   51:dup             
	//   21   52:invokespecial   #584 <Method void StringBuilder()>
	//   22   55:astore          6
				stringbuilder.append("The Braze SDK requires the permission ");
	//   23   57:aload           6
	//   24   59:ldc2            #935 <String "The Braze SDK requires the permission ">
	//   25   62:invokevirtual   #590 <Method StringBuilder StringBuilder.append(String)>
	//   26   65:pop             
				stringbuilder.append(s1);
	//   27   66:aload           6
	//   28   68:aload           4
	//   29   70:invokevirtual   #590 <Method StringBuilder StringBuilder.append(String)>
	//   30   73:pop             
				stringbuilder.append(". Check your app manifest.");
	//   31   74:aload           6
	//   32   76:ldc2            #937 <String ". Check your app manifest.">
	//   33   79:invokevirtual   #590 <Method StringBuilder StringBuilder.append(String)>
	//   34   82:pop             
				AppboyLogger.e(s2, stringbuilder.toString());
	//   35   83:aload           5
	//   36   85:aload           6
	//   37   87:invokevirtual   #594 <Method String StringBuilder.toString()>
	//   38   90:invokestatic    #909 <Method int AppboyLogger.e(String, String)>
	//   39   93:pop             
				flag = false;
	//   40   94:iconst_0        
	//   41   95:istore_1        
			}
		} while(true);
	//   42   96:goto            11
		if(h.getAppboyApiKey().toString().equals(""))
	//*  43   99:aload_0         
	//*  44  100:getfield        #646 <Field AppboyConfigurationProvider h>
	//*  45  103:invokevirtual   #941 <Method cb AppboyConfigurationProvider.getAppboyApiKey()>
	//*  46  106:invokevirtual   #944 <Method String cb.toString()>
	//*  47  109:ldc2            #946 <String "">
	//*  48  112:invokevirtual   #949 <Method boolean String.equals(Object)>
	//*  49  115:ifeq            130
		{
			AppboyLogger.e(k, "The Braze SDK requires a non-empty API key. Check your appboy.xml or AppboyConfig.");
	//   50  118:getstatic       #142 <Field String k>
	//   51  121:ldc2            #951 <String "The Braze SDK requires a non-empty API key. Check your appboy.xml or AppboyConfig.">
	//   52  124:invokestatic    #909 <Method int AppboyLogger.e(String, String)>
	//   53  127:pop             
			flag = false;
	//   54  128:iconst_0        
	//   55  129:istore_1        
		}
		boolean flag1 = flag;
	//   56  130:iload_1         
	//   57  131:istore_2        
		if(h.isFirebaseCloudMessagingRegistrationEnabled())
	//*  58  132:aload_0         
	//*  59  133:getfield        #646 <Field AppboyConfigurationProvider h>
	//*  60  136:invokevirtual   #954 <Method boolean AppboyConfigurationProvider.isFirebaseCloudMessagingRegistrationEnabled()>
	//*  61  139:ifeq            166
		{
			flag1 = flag;
	//   62  142:iload_1         
	//   63  143:istore_2        
			if(h.isGcmMessagingRegistrationEnabled())
	//*  64  144:aload_0         
	//*  65  145:getfield        #646 <Field AppboyConfigurationProvider h>
	//*  66  148:invokevirtual   #957 <Method boolean AppboyConfigurationProvider.isGcmMessagingRegistrationEnabled()>
	//*  67  151:ifeq            166
			{
				AppboyLogger.e(k, "Both Firebase Cloud Messaging and Google Cloud Messaging automatic push registration are enabled. It is recommended to only have one automatic push registration active.");
	//   68  154:getstatic       #142 <Field String k>
	//   69  157:ldc2            #959 <String "Both Firebase Cloud Messaging and Google Cloud Messaging automatic push registration are enabled. It is recommended to only have one automatic push registration active.">
	//   70  160:invokestatic    #909 <Method int AppboyLogger.e(String, String)>
	//   71  163:pop             
				flag1 = false;
	//   72  164:iconst_0        
	//   73  165:istore_2        
			}
		}
		if(!flag1)
	//*  74  166:iload_2         
	//*  75  167:ifne            180
			AppboyLogger.e(k, "The Braze SDK is not integrated correctly. Please visit https://www.braze.com/documentation/Android");
	//   76  170:getstatic       #142 <Field String k>
	//   77  173:ldc2            #961 <String "The Braze SDK is not integrated correctly. Please visit https://www.braze.com/documentation/Android">
	//   78  176:invokestatic    #909 <Method int AppboyLogger.e(String, String)>
	//   79  179:pop             
	//   80  180:return          
	}

	static void f(Appboy appboy)
	{
		appboy.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #963 <Method void f()>
	//    2    4:return          
	}

	static AppboyUser g(Appboy appboy)
	{
		return appboy.s;
	//    0    0:aload_0         
	//    1    1:getfield        #779 <Field AppboyUser s>
	//    2    4:areturn         
	}

	private static void g()
	{
		AppboyLogger.i(k, "Shutting down all queued work on the Braze SDK");
	//    0    0:getstatic       #142 <Field String k>
	//    1    3:ldc2            #966 <String "Shutting down all queued work on the Braze SDK">
	//    2    6:invokestatic    #596 <Method int AppboyLogger.i(String, String)>
	//    3    9:pop             
		com/appboy/Appboy;
	//    4   10:ldc1            #2   <Class Appboy>
		JVM INSTR monitorenter ;
	//    5   12:monitorenter    
		ea ea1;
		if(o == null)
			break MISSING_BLOCK_LABEL_125;
	//    6   13:getstatic       #518 <Field Appboy o>
	//    7   16:ifnull          125
		if(o.j != null)
	//*   8   19:getstatic       #518 <Field Appboy o>
	//*   9   22:getfield        #710 <Field at j>
	//*  10   25:ifnull          48
		{
			AppboyLogger.d(k, "Shutting down the user dependency executor");
	//   11   28:getstatic       #142 <Field String k>
	//   12   31:ldc2            #968 <String "Shutting down the user dependency executor">
	//   13   34:invokestatic    #543 <Method int AppboyLogger.d(String, String)>
	//   14   37:pop             
			o.j.shutdownNow();
	//   15   38:getstatic       #518 <Field Appboy o>
	//   16   41:getfield        #710 <Field at j>
	//   17   44:invokevirtual   #972 <Method java.util.List at.shutdownNow()>
	//   18   47:pop             
		}
		ea1 = o.b;
	//   19   48:getstatic       #518 <Field Appboy o>
	//   20   51:getfield        #742 <Field ea b>
	//   21   54:astore_0        
		if(ea1 == null)
			break MISSING_BLOCK_LABEL_118;
	//   22   55:aload_0         
	//   23   56:ifnull          118
		if(ea1.b() != null)
	//*  24   59:aload_0         
	//*  25   60:invokevirtual   #975 <Method n ea.b()>
	//*  26   63:ifnull          74
			ea1.b().a(true);
	//   27   66:aload_0         
	//   28   67:invokevirtual   #975 <Method n ea.b()>
	//   29   70:iconst_1        
	//   30   71:invokevirtual   #978 <Method void n.a(boolean)>
		if(ea1.k() != null)
	//*  31   74:aload_0         
	//*  32   75:invokevirtual   #814 <Method bb ea.k()>
	//*  33   78:ifnull          88
			ea1.k().a();
	//   34   81:aload_0         
	//   35   82:invokevirtual   #814 <Method bb ea.k()>
	//   36   85:invokevirtual   #979 <Method void bb.a()>
		if(ea1.m() != null)
	//*  37   88:aload_0         
	//*  38   89:invokevirtual   #762 <Method bc ea.m()>
	//*  39   92:ifnull          102
			ea1.m().b();
	//   40   95:aload_0         
	//   41   96:invokevirtual   #762 <Method bc ea.m()>
	//   42   99:invokevirtual   #983 <Method void bc.b()>
		if(ea1.j() != null)
	//*  43  102:aload_0         
	//*  44  103:invokevirtual   #774 <Method bo ea.j()>
	//*  45  106:ifnull          118
			ea1.j().a();
	//   46  109:aload_0         
	//   47  110:invokevirtual   #774 <Method bo ea.j()>
	//   48  113:invokeinterface #986 <Method void bo.a()>
		o.y = true;
	//   49  118:getstatic       #518 <Field Appboy o>
	//   50  121:iconst_1        
	//   51  122:putfield        #532 <Field boolean y>
		com/appboy/Appboy;
	//   52  125:ldc1            #2   <Class Appboy>
		JVM INSTR monitorexit ;
	//   53  127:monitorexit     
		return;
	//   54  128:return          
		Exception exception;
		exception;
	//   55  129:astore_0        
		com/appboy/Appboy;
	//   56  130:ldc1            #2   <Class Appboy>
		JVM INSTR monitorexit ;
	//   57  132:monitorexit     
		try
		{
			throw exception;
	//   58  133:aload_0         
	//   59  134:athrow          
		}
		catch(Exception exception1)
	//*  60  135:astore_0        
		{
			AppboyLogger.w(k, "Failed to shutdown queued work on the Braze SDK.", ((Throwable) (exception1)));
	//   61  136:getstatic       #142 <Field String k>
	//   62  139:ldc2            #988 <String "Failed to shutdown queued work on the Braze SDK.">
	//   63  142:aload_0         
	//   64  143:invokestatic    #990 <Method int AppboyLogger.w(String, String, Throwable)>
	//   65  146:pop             
		}
		return;
	//   66  147:return          
	}

	public static Uri getAppboyApiEndpoint(Uri uri)
	{
		Object obj = z;
	//    0    0:getstatic       #522 <Field Object z>
	//    1    3:astore_1        
		obj;
	//    2    4:aload_1         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		Object obj1 = ((Object) (A));
	//    4    6:getstatic       #865 <Field IAppboyEndpointProvider A>
	//    5    9:astore_2        
		if(obj1 == null) goto _L2; else goto _L1
	//    6   10:aload_2         
	//    7   11:ifnull          42
_L1:
		obj1 = ((Object) (A.getApiEndpoint(uri)));
	//    8   14:getstatic       #865 <Field IAppboyEndpointProvider A>
	//    9   17:aload_0         
	//   10   18:invokeinterface #997 <Method Uri IAppboyEndpointProvider.getApiEndpoint(Uri)>
	//   11   23:astore_2        
		if(obj1 == null) goto _L2; else goto _L3
	//   12   24:aload_2         
	//   13   25:ifnull          42
	//*  14   28:aload_1         
	//*  15   29:monitorexit     
_L3:
		return ((Uri) (obj1));
	//   16   30:aload_2         
	//   17   31:areturn         
_L5:
		AppboyLogger.e(k, "Caught exception trying to get a Braze API endpoint from the AppboyEndpointProvider. Using the original URI");
	//   18   32:getstatic       #142 <Field String k>
	//   19   35:ldc2            #999 <String "Caught exception trying to get a Braze API endpoint from the AppboyEndpointProvider. Using the original URI">
	//   20   38:invokestatic    #909 <Method int AppboyLogger.e(String, String)>
	//   21   41:pop             
_L2:
		obj;
	//   22   42:aload_1         
		JVM INSTR monitorexit ;
	//   23   43:monitorexit     
		return uri;
	//   24   44:aload_0         
	//   25   45:areturn         
		uri;
	//   26   46:astore_0        
		obj;
	//   27   47:aload_1         
		JVM INSTR monitorexit ;
	//   28   48:monitorexit     
		throw uri;
	//   29   49:aload_0         
	//   30   50:athrow          
		Exception exception;
		exception;
	//   31   51:astore_2        
		if(true) goto _L5; else goto _L4
_L4:
	//*  32   52:goto            32
	}

	public static IAppboyNotificationFactory getCustomAppboyNotificationFactory()
	{
		return B;
	//    0    0:getstatic       #1003 <Field IAppboyNotificationFactory B>
	//    1    3:areturn         
	}

	public static Appboy getInstance(Context context)
	{
		if(o != null && !o.y) goto _L2; else goto _L1
	//    0    0:getstatic       #518 <Field Appboy o>
	//    1    3:ifnull          15
	//    2    6:getstatic       #518 <Field Appboy o>
	//    3    9:getfield        #532 <Field boolean y>
	//    4   12:ifeq            39
_L1:
		com/appboy/Appboy;
	//    5   15:ldc1            #2   <Class Appboy>
		JVM INSTR monitorenter ;
	//    6   17:monitorenter    
		if(o == null || o.y)
	//*   7   18:getstatic       #518 <Field Appboy o>
	//*   8   21:ifnull          43
	//*   9   24:getstatic       #518 <Field Appboy o>
	//*  10   27:getfield        #532 <Field boolean y>
	//*  11   30:ifeq            36
			break MISSING_BLOCK_LABEL_43;
	//   12   33:goto            43
		com/appboy/Appboy;
	//   13   36:ldc1            #2   <Class Appboy>
		JVM INSTR monitorexit ;
	//   14   38:monitorexit     
_L2:
		return o;
	//   15   39:getstatic       #518 <Field Appboy o>
	//   16   42:areturn         
		setOutboundNetworkRequestsOffline(a(context).a());
	//   17   43:aload_0         
	//   18   44:invokestatic    #886 <Method dg a(Context)>
	//   19   47:invokevirtual   #1007 <Method boolean dg.a()>
	//   20   50:invokestatic    #899 <Method void setOutboundNetworkRequestsOffline(boolean)>
		o = new Appboy(context);
	//   21   53:new             #2   <Class Appboy>
	//   22   56:dup             
	//   23   57:aload_0         
	//   24   58:invokespecial   #1008 <Method void Appboy(Context)>
	//   25   61:putstatic       #518 <Field Appboy o>
		context = ((Context) (o));
	//   26   64:getstatic       #518 <Field Appboy o>
	//   27   67:astore_0        
		com/appboy/Appboy;
	//   28   68:ldc1            #2   <Class Appboy>
		JVM INSTR monitorexit ;
	//   29   70:monitorexit     
		return ((Appboy) (context));
	//   30   71:aload_0         
	//   31   72:areturn         
		context;
	//   32   73:astore_0        
		com/appboy/Appboy;
	//   33   74:ldc1            #2   <Class Appboy>
		JVM INSTR monitorexit ;
	//   34   76:monitorexit     
		throw context;
	//   35   77:aload_0         
	//   36   78:athrow          
	}

	public static boolean getOutboundNetworkRequestsOffline()
	{
		return D;
	//    0    0:getstatic       #526 <Field boolean D>
	//    1    3:ireturn         
	}

	static IAppboyImageLoader h(Appboy appboy)
	{
		return appboy.x;
	//    0    0:aload_0         
	//    1    1:getfield        #606 <Field IAppboyImageLoader x>
	//    2    4:areturn         
	}

	private static boolean h()
	{
		if(F == null)
	//*   0    0:getstatic       #672 <Field dg F>
	//*   1    3:ifnonnull       18
		{
			AppboyLogger.d(k, "SDK enablement provider was null. Returning SDK as enabled.");
	//    2    6:getstatic       #142 <Field String k>
	//    3    9:ldc2            #1012 <String "SDK enablement provider was null. Returning SDK as enabled.">
	//    4   12:invokestatic    #543 <Method int AppboyLogger.d(String, String)>
	//    5   15:pop             
			return false;
	//    6   16:iconst_0        
	//    7   17:ireturn         
		}
		boolean flag = F.a();
	//    8   18:getstatic       #672 <Field dg F>
	//    9   21:invokevirtual   #1007 <Method boolean dg.a()>
	//   10   24:istore_0        
		if(flag)
	//*  11   25:iload_0         
	//*  12   26:ifeq            39
			AppboyLogger.w(k, "SDK is disabled. Not performing action on SDK.");
	//   13   29:getstatic       #142 <Field String k>
	//   14   32:ldc2            #1014 <String "SDK is disabled. Not performing action on SDK.">
	//   15   35:invokestatic    #880 <Method int AppboyLogger.w(String, String)>
	//   16   38:pop             
		return flag;
	//   17   39:iload_0         
	//   18   40:ireturn         
	}

	public static void setAppboyEndpointProvider(IAppboyEndpointProvider iappboyendpointprovider)
	{
		synchronized(z)
	//*   0    0:getstatic       #522 <Field Object z>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			A = iappboyendpointprovider;
	//    4    6:aload_0         
	//    5    7:putstatic       #865 <Field IAppboyEndpointProvider A>
		}
	//    6   10:aload_1         
	//    7   11:monitorexit     
		return;
	//    8   12:return          
		iappboyendpointprovider;
	//    9   13:astore_0        
		obj;
	//   10   14:aload_1         
		JVM INSTR monitorexit ;
	//   11   15:monitorexit     
		throw iappboyendpointprovider;
	//   12   16:aload_0         
	//   13   17:athrow          
	}

	public static void setCustomAppboyNotificationFactory(IAppboyNotificationFactory iappboynotificationfactory)
	{
		AppboyLogger.d(k, "Custom Braze notification factory set");
	//    0    0:getstatic       #142 <Field String k>
	//    1    3:ldc2            #1018 <String "Custom Braze notification factory set">
	//    2    6:invokestatic    #543 <Method int AppboyLogger.d(String, String)>
	//    3    9:pop             
		B = iappboynotificationfactory;
	//    4   10:aload_0         
	//    5   11:putstatic       #1003 <Field IAppboyNotificationFactory B>
	//    6   14:return          
	}

	public static void setOutboundNetworkRequestsOffline(boolean flag)
	{
		String s2 = k;
	//    0    0:getstatic       #142 <Field String k>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #583 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #584 <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("Appboy outbound network requests are now ");
	//    6   12:aload_3         
	//    7   13:ldc2            #1020 <String "Appboy outbound network requests are now ">
	//    8   16:invokevirtual   #590 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		String s1;
		if(flag)
	//*  10   20:iload_0         
	//*  11   21:ifeq            31
			s1 = "disabled";
	//   12   24:ldc2            #1022 <String "disabled">
	//   13   27:astore_1        
		else
	//*  14   28:goto            35
			s1 = "enabled";
	//   15   31:ldc2            #1024 <String "enabled">
	//   16   34:astore_1        
		stringbuilder.append(s1);
	//   17   35:aload_3         
	//   18   36:aload_1         
	//   19   37:invokevirtual   #590 <Method StringBuilder StringBuilder.append(String)>
	//   20   40:pop             
		AppboyLogger.i(s2, stringbuilder.toString());
	//   21   41:aload_2         
	//   22   42:aload_3         
	//   23   43:invokevirtual   #594 <Method String StringBuilder.toString()>
	//   24   46:invokestatic    #596 <Method int AppboyLogger.i(String, String)>
	//   25   49:pop             
		com/appboy/Appboy;
	//   26   50:ldc1            #2   <Class Appboy>
		JVM INSTR monitorenter ;
	//   27   52:monitorenter    
		D = flag;
	//   28   53:iload_0         
	//   29   54:putstatic       #526 <Field boolean D>
		if(o != null)
	//*  30   57:getstatic       #518 <Field Appboy o>
	//*  31   60:ifnull          70
			o.b(flag);
	//   32   63:getstatic       #518 <Field Appboy o>
	//   33   66:iload_0         
	//   34   67:invokespecial   #1026 <Method void b(boolean)>
		com/appboy/Appboy;
	//   35   70:ldc1            #2   <Class Appboy>
		JVM INSTR monitorexit ;
	//   36   72:monitorexit     
		return;
	//   37   73:return          
		Exception exception;
		exception;
	//   38   74:astore_1        
		com/appboy/Appboy;
	//   39   75:ldc1            #2   <Class Appboy>
		JVM INSTR monitorexit ;
	//   40   77:monitorexit     
		throw exception;
	//   41   78:aload_1         
	//   42   79:athrow          
	}

	public static void wipeData(Context context)
	{
		g();
	//    0    0:invokestatic    #894 <Method void g()>
		try
		{
			fo.a(context);
	//    1    3:aload_0         
	//    2    4:invokestatic    #1031 <Method void fo.a(Context)>
			AppboyLruImageLoader.deleteStoredData(context);
	//    3    7:aload_0         
	//    4    8:invokestatic    #1034 <Method void AppboyLruImageLoader.deleteStoredData(Context)>
		}
	//*   5   11:goto            26
		catch(Exception exception)
	//*   6   14:astore_3        
		{
			AppboyLogger.w(k, "Failed to delete data from the internal storage cache.", ((Throwable) (exception)));
	//    7   15:getstatic       #142 <Field String k>
	//    8   18:ldc2            #1036 <String "Failed to delete data from the internal storage cache.">
	//    9   21:aload_3         
	//   10   22:invokestatic    #990 <Method int AppboyLogger.w(String, String, Throwable)>
	//   11   25:pop             
		}
		try
		{
			cx.a(context);
	//   12   26:aload_0         
	//   13   27:invokestatic    #1039 <Method void cx.a(Context)>
		}
	//*  14   30:goto            45
		catch(Exception exception1)
	//*  15   33:astore_3        
		{
			AppboyLogger.w(k, "Failed to delete Braze database files for the Braze SDK.", ((Throwable) (exception1)));
	//   16   34:getstatic       #142 <Field String k>
	//   17   37:ldc2            #1041 <String "Failed to delete Braze database files for the Braze SDK.">
	//   18   40:aload_3         
	//   19   41:invokestatic    #990 <Method int AppboyLogger.w(String, String, Throwable)>
	//   20   44:pop             
		}
		context = ((Context) (new File(context.getApplicationInfo().dataDir, "shared_prefs")));
	//   21   45:new             #1043 <Class File>
	//   22   48:dup             
	//   23   49:aload_0         
	//   24   50:invokevirtual   #1047 <Method ApplicationInfo Context.getApplicationInfo()>
	//   25   53:getfield        #1052 <Field String ApplicationInfo.dataDir>
	//   26   56:ldc2            #1054 <String "shared_prefs">
	//   27   59:invokespecial   #1057 <Method void File(String, String)>
	//   28   62:astore_0        
		if(!((File) (context)).exists() || !((File) (context)).isDirectory()) goto _L2; else goto _L1
	//   29   63:aload_0         
	//   30   64:invokevirtual   #1060 <Method boolean File.exists()>
	//   31   67:ifeq            170
	//   32   70:aload_0         
	//   33   71:invokevirtual   #1063 <Method boolean File.isDirectory()>
	//   34   74:ifeq            170
_L1:
		int j1;
		context = ((Context) (((File) (context)).listFiles(new FilenameFilter() {

			public boolean accept(File file1, String s2)
			{
				return s2.startsWith("com.appboy");
			//    0    0:aload_2         
			//    1    1:ldc1            #20  <String "com.appboy">
			//    2    3:invokevirtual   #26  <Method boolean String.startsWith(String)>
			//    3    6:ireturn         
			}

		}
)));
	//   35   77:aload_0         
	//   36   78:new             #26  <Class Appboy$17>
	//   37   81:dup             
	//   38   82:invokespecial   #1064 <Method void Appboy$17()>
	//   39   85:invokevirtual   #1068 <Method File[] File.listFiles(FilenameFilter)>
	//   40   88:astore_0        
		j1 = context.length;
	//   41   89:aload_0         
	//   42   90:arraylength     
	//   43   91:istore_2        
		int i1 = 0;
	//   44   92:iconst_0        
	//   45   93:istore_1        
_L3:
		File file;
		if(i1 >= j1)
			break; /* Loop/switch isn't completed */
	//   46   94:iload_1         
	//   47   95:iload_2         
	//   48   96:icmpge          170
		file = ((File) (context[i1]));
	//   49   99:aload_0         
	//   50  100:iload_1         
	//   51  101:aaload          
	//   52  102:astore_3        
		String s1 = k;
	//   53  103:getstatic       #142 <Field String k>
	//   54  106:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//   55  108:new             #583 <Class StringBuilder>
	//   56  111:dup             
	//   57  112:invokespecial   #584 <Method void StringBuilder()>
	//   58  115:astore          5
		stringbuilder.append("Deleting shared prefs file at: ");
	//   59  117:aload           5
	//   60  119:ldc2            #1070 <String "Deleting shared prefs file at: ">
	//   61  122:invokevirtual   #590 <Method StringBuilder StringBuilder.append(String)>
	//   62  125:pop             
		stringbuilder.append(file.getAbsolutePath());
	//   63  126:aload           5
	//   64  128:aload_3         
	//   65  129:invokevirtual   #1073 <Method String File.getAbsolutePath()>
	//   66  132:invokevirtual   #590 <Method StringBuilder StringBuilder.append(String)>
	//   67  135:pop             
		AppboyLogger.v(s1, stringbuilder.toString());
	//   68  136:aload           4
	//   69  138:aload           5
	//   70  140:invokevirtual   #594 <Method String StringBuilder.toString()>
	//   71  143:invokestatic    #1075 <Method int AppboyLogger.v(String, String)>
	//   72  146:pop             
		AppboyFileUtils.deleteFileOrDirectory(file);
	//   73  147:aload_3         
	//   74  148:invokestatic    #1081 <Method void AppboyFileUtils.deleteFileOrDirectory(File)>
		i1++;
	//   75  151:iload_1         
	//   76  152:iconst_1        
	//   77  153:iadd            
	//   78  154:istore_1        
		if(true) goto _L3; else goto _L2
	//   79  155:goto            94
		context;
	//   80  158:astore_0        
		AppboyLogger.w(k, "Failed to delete shared preference data for the Braze SDK.", ((Throwable) (context)));
	//   81  159:getstatic       #142 <Field String k>
	//   82  162:ldc2            #1083 <String "Failed to delete shared preference data for the Braze SDK.">
	//   83  165:aload_0         
	//   84  166:invokestatic    #990 <Method int AppboyLogger.w(String, String, Throwable)>
	//   85  169:pop             
_L2:
	//   86  170:return          
	}

	void a()
	{
		if(h())
	//*   0    0:invokestatic    #1085 <Method boolean h()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			j.submit(new Runnable() {

				public void run()
				{
					try
					{
						if(a.e != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #16  <Field Appboy a>
				//*   2    4:getfield        #26  <Field bc Appboy.e>
				//*   3    7:ifnull          21
						{
							a.e.a();
				//    4   10:aload_0         
				//    5   11:getfield        #16  <Field Appboy a>
				//    6   14:getfield        #26  <Field bc Appboy.e>
				//    7   17:invokevirtual   #29  <Method void bc.a()>
							return;
				//    8   20:return          
						}
					}
				//*   9   21:invokestatic    #33  <Method String Appboy.b()>
				//*  10   24:ldc1            #35  <String "Geofence manager was null. Not initializing geofences.">
				//*  11   26:invokestatic    #41  <Method int AppboyLogger.d(String, String)>
				//*  12   29:pop             
				//*  13   30:return          
					catch(Exception exception)
				//*  14   31:astore_1        
					{
						AppboyLogger.w(Appboy.b(), "Failed to initialize geofences with the geofence manager.", ((Throwable) (exception)));
				//   15   32:invokestatic    #33  <Method String Appboy.b()>
				//   16   35:ldc1            #43  <String "Failed to initialize geofences with the geofence manager.">
				//   17   37:aload_1         
				//   18   38:invokestatic    #47  <Method int AppboyLogger.w(String, String, Throwable)>
				//   19   41:pop             
						Appboy.a(a, ((Throwable) (exception)));
				//   20   42:aload_0         
				//   21   43:getfield        #16  <Field Appboy a>
				//   22   46:aload_1         
				//   23   47:invokestatic    #50  <Method void Appboy.a(Appboy, Throwable)>
						return;
				//   24   50:return          
					}
					AppboyLogger.d(Appboy.b(), "Geofence manager was null. Not initializing geofences.");
					return;
				}

				final Appboy a;

			
			{
				a = Appboy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field Appboy a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #710 <Field at j>
	//    5   11:new             #36  <Class Appboy$21>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:invokespecial   #1086 <Method void Appboy$21(Appboy)>
	//    9   19:invokevirtual   #715 <Method Future at.submit(Runnable)>
	//   10   22:pop             
			return;
	//   11   23:return          
		}
	}

	void a(bv bv)
	{
		if(h())
	//*   0    0:invokestatic    #1085 <Method boolean h()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			j.submit(new Runnable(bv) {

				public void run()
				{
					try
					{
						if(b.e != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #18  <Field Appboy b>
				//*   2    4:getfield        #31  <Field bc Appboy.e>
				//*   3    7:ifnull          25
						{
							b.e.a(a);
				//    4   10:aload_0         
				//    5   11:getfield        #18  <Field Appboy b>
				//    6   14:getfield        #31  <Field bc Appboy.e>
				//    7   17:aload_0         
				//    8   18:getfield        #20  <Field bv a>
				//    9   21:invokevirtual   #34  <Method void bc.a(bv)>
							return;
				//   10   24:return          
						}
					}
				//*  11   25:invokestatic    #37  <Method String Appboy.b()>
				//*  12   28:ldc1            #39  <String "Geofence manager was null. Not requesting geofence refresh.">
				//*  13   30:invokestatic    #45  <Method int AppboyLogger.d(String, String)>
				//*  14   33:pop             
				//*  15   34:return          
					catch(Exception exception)
				//*  16   35:astore_1        
					{
						AppboyLogger.w(Appboy.b(), "Failed to request geofence refresh.", ((Throwable) (exception)));
				//   17   36:invokestatic    #37  <Method String Appboy.b()>
				//   18   39:ldc1            #47  <String "Failed to request geofence refresh.">
				//   19   41:aload_1         
				//   20   42:invokestatic    #51  <Method int AppboyLogger.w(String, String, Throwable)>
				//   21   45:pop             
						Appboy.a(b, ((Throwable) (exception)));
				//   22   46:aload_0         
				//   23   47:getfield        #18  <Field Appboy b>
				//   24   50:aload_1         
				//   25   51:invokestatic    #54  <Method void Appboy.a(Appboy, Throwable)>
						return;
				//   26   54:return          
					}
					AppboyLogger.d(Appboy.b(), "Geofence manager was null. Not requesting geofence refresh.");
					return;
				}

				final bv a;
				final Appboy b;

			
			{
				b = Appboy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field Appboy b>
				a = bv;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field bv a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #710 <Field at j>
	//    5   11:new             #28  <Class Appboy$18>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #1090 <Method void Appboy$18(Appboy, bv)>
	//   10   20:invokevirtual   #715 <Method Future at.submit(Runnable)>
	//   11   23:pop             
			return;
	//   12   24:return          
		}
	}

	void a(String s1, u u1)
	{
		if(h())
	//*   0    0:invokestatic    #1085 <Method boolean h()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			j.submit(new Runnable(s1, u1) {

				public void run()
				{
					try
					{
						if(c.e != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #20  <Field Appboy c>
				//*   2    4:getfield        #35  <Field bc Appboy.e>
				//*   3    7:ifnull          29
						{
							c.e.b(a, b);
				//    4   10:aload_0         
				//    5   11:getfield        #20  <Field Appboy c>
				//    6   14:getfield        #35  <Field bc Appboy.e>
				//    7   17:aload_0         
				//    8   18:getfield        #22  <Field String a>
				//    9   21:aload_0         
				//   10   22:getfield        #24  <Field u b>
				//   11   25:invokevirtual   #39  <Method void bc.b(String, u)>
							return;
				//   12   28:return          
						}
					}
				//*  13   29:invokestatic    #42  <Method String Appboy.b()>
				//*  14   32:ldc1            #44  <String "Geofence manager was null. Not posting geofence report">
				//*  15   34:invokestatic    #50  <Method int AppboyLogger.d(String, String)>
				//*  16   37:pop             
				//*  17   38:return          
					catch(Exception exception)
				//*  18   39:astore_1        
					{
						AppboyLogger.w(Appboy.b(), "Failed to post geofence report.", ((Throwable) (exception)));
				//   19   40:invokestatic    #42  <Method String Appboy.b()>
				//   20   43:ldc1            #52  <String "Failed to post geofence report.">
				//   21   45:aload_1         
				//   22   46:invokestatic    #56  <Method int AppboyLogger.w(String, String, Throwable)>
				//   23   49:pop             
						Appboy.a(c, ((Throwable) (exception)));
				//   24   50:aload_0         
				//   25   51:getfield        #20  <Field Appboy c>
				//   26   54:aload_1         
				//   27   55:invokestatic    #59  <Method void Appboy.a(Appboy, Throwable)>
						return;
				//   28   58:return          
					}
					AppboyLogger.d(Appboy.b(), "Geofence manager was null. Not posting geofence report");
					return;
				}

				final String a;
				final u b;
				final Appboy c;

			
			{
				c = Appboy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field Appboy c>
				a = s1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field String a>
				b = u1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field u b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #710 <Field at j>
	//    5   11:new             #34  <Class Appboy$20>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokespecial   #1094 <Method void Appboy$20(Appboy, String, u)>
	//   11   21:invokevirtual   #715 <Method Future at.submit(Runnable)>
	//   12   24:pop             
			return;
	//   13   25:return          
		}
	}

	void a(boolean flag)
	{
		if(h())
	//*   0    0:invokestatic    #1085 <Method boolean h()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			j.submit(new Runnable(flag) {

				public void run()
				{
					try
					{
						if(b.e != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #18  <Field Appboy b>
				//*   2    4:getfield        #31  <Field bc Appboy.e>
				//*   3    7:ifnull          25
						{
							b.e.b(a);
				//    4   10:aload_0         
				//    5   11:getfield        #18  <Field Appboy b>
				//    6   14:getfield        #31  <Field bc Appboy.e>
				//    7   17:aload_0         
				//    8   18:getfield        #20  <Field boolean a>
				//    9   21:invokevirtual   #35  <Method void bc.b(boolean)>
							return;
				//   10   24:return          
						}
					}
				//*  11   25:invokestatic    #38  <Method String Appboy.b()>
				//*  12   28:ldc1            #40  <String "Geofence manager was null. Not requesting geofence refresh.">
				//*  13   30:invokestatic    #46  <Method int AppboyLogger.d(String, String)>
				//*  14   33:pop             
				//*  15   34:return          
					catch(Exception exception)
				//*  16   35:astore_1        
					{
						String s1 = Appboy.b();
				//   17   36:invokestatic    #38  <Method String Appboy.b()>
				//   18   39:astore_2        
						StringBuilder stringbuilder = new StringBuilder();
				//   19   40:new             #48  <Class StringBuilder>
				//   20   43:dup             
				//   21   44:invokespecial   #49  <Method void StringBuilder()>
				//   22   47:astore_3        
						stringbuilder.append("Failed to request geofence refresh with rate limit ignore: ");
				//   23   48:aload_3         
				//   24   49:ldc1            #51  <String "Failed to request geofence refresh with rate limit ignore: ">
				//   25   51:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
				//   26   54:pop             
						stringbuilder.append(a);
				//   27   55:aload_3         
				//   28   56:aload_0         
				//   29   57:getfield        #20  <Field boolean a>
				//   30   60:invokevirtual   #58  <Method StringBuilder StringBuilder.append(boolean)>
				//   31   63:pop             
						AppboyLogger.w(s1, stringbuilder.toString(), ((Throwable) (exception)));
				//   32   64:aload_2         
				//   33   65:aload_3         
				//   34   66:invokevirtual   #61  <Method String StringBuilder.toString()>
				//   35   69:aload_1         
				//   36   70:invokestatic    #65  <Method int AppboyLogger.w(String, String, Throwable)>
				//   37   73:pop             
						Appboy.a(b, ((Throwable) (exception)));
				//   38   74:aload_0         
				//   39   75:getfield        #18  <Field Appboy b>
				//   40   78:aload_1         
				//   41   79:invokestatic    #68  <Method void Appboy.a(Appboy, Throwable)>
						return;
				//   42   82:return          
					}
					AppboyLogger.d(Appboy.b(), "Geofence manager was null. Not requesting geofence refresh.");
					return;
				}

				final boolean a;
				final Appboy b;

			
			{
				b = Appboy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field Appboy b>
				a = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #20  <Field boolean a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #710 <Field at j>
	//    5   11:new             #30  <Class Appboy$19>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:invokespecial   #1095 <Method void Appboy$19(Appboy, boolean)>
	//   10   20:invokevirtual   #715 <Method Future at.submit(Runnable)>
	//   11   23:pop             
			return;
	//   12   24:return          
		}
	}

	public void changeUser(String s1)
	{
		if(h())
	//*   0    0:invokestatic    #1085 <Method boolean h()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			j.submit(new Runnable(s1) {

				public void run()
				{
					Object obj;
					try
					{
						if(StringUtils.isNullOrEmpty(a))
				//*   0    0:aload_0         
				//*   1    1:getfield        #21  <Field String a>
				//*   2    4:invokestatic    #34  <Method boolean StringUtils.isNullOrEmpty(String)>
				//*   3    7:ifeq            20
						{
							AppboyLogger.e(Appboy.b(), "ArgumentException: userId passed to changeUser was null or empty. The current user will remain the active user.");
				//    4   10:invokestatic    #37  <Method String Appboy.b()>
				//    5   13:ldc1            #39  <String "ArgumentException: userId passed to changeUser was null or empty. The current user will remain the active user.">
				//    6   15:invokestatic    #45  <Method int AppboyLogger.e(String, String)>
				//    7   18:pop             
							return;
				//    8   19:return          
						}
					}
				//*   9   20:aload_0         
				//*  10   21:getfield        #19  <Field Appboy b>
				//*  11   24:invokestatic    #49  <Method AppboyUser Appboy.g(Appboy)>
				//*  12   27:invokevirtual   #54  <Method String AppboyUser.getUserId()>
				//*  13   30:astore_1        
				//*  14   31:aload_1         
				//*  15   32:aload_0         
				//*  16   33:getfield        #21  <Field String a>
				//*  17   36:invokevirtual   #60  <Method boolean String.equals(Object)>
				//*  18   39:ifeq            87
				//*  19   42:invokestatic    #37  <Method String Appboy.b()>
				//*  20   45:astore_1        
				//*  21   46:new             #62  <Class StringBuilder>
				//*  22   49:dup             
				//*  23   50:invokespecial   #63  <Method void StringBuilder()>
				//*  24   53:astore_2        
				//*  25   54:aload_2         
				//*  26   55:ldc1            #65  <String "Received request to change current user ">
				//*  27   57:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
				//*  28   60:pop             
				//*  29   61:aload_2         
				//*  30   62:aload_0         
				//*  31   63:getfield        #21  <Field String a>
				//*  32   66:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
				//*  33   69:pop             
				//*  34   70:aload_2         
				//*  35   71:ldc1            #71  <String " to the same user id. Doing nothing.">
				//*  36   73:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
				//*  37   76:pop             
				//*  38   77:aload_1         
				//*  39   78:aload_2         
				//*  40   79:invokevirtual   #74  <Method String StringBuilder.toString()>
				//*  41   82:invokestatic    #77  <Method int AppboyLogger.i(String, String)>
				//*  42   85:pop             
				//*  43   86:return          
				//*  44   87:aload_1         
				//*  45   88:ldc1            #79  <String "">
				//*  46   90:invokevirtual   #60  <Method boolean String.equals(Object)>
				//*  47   93:ifeq            164
				//*  48   96:invokestatic    #37  <Method String Appboy.b()>
				//*  49   99:astore_1        
				//*  50  100:new             #62  <Class StringBuilder>
				//*  51  103:dup             
				//*  52  104:invokespecial   #63  <Method void StringBuilder()>
				//*  53  107:astore_2        
				//*  54  108:aload_2         
				//*  55  109:ldc1            #81  <String "Changing anonymous user to ">
				//*  56  111:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
				//*  57  114:pop             
				//*  58  115:aload_2         
				//*  59  116:aload_0         
				//*  60  117:getfield        #21  <Field String a>
				//*  61  120:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
				//*  62  123:pop             
				//*  63  124:aload_1         
				//*  64  125:aload_2         
				//*  65  126:invokevirtual   #74  <Method String StringBuilder.toString()>
				//*  66  129:invokestatic    #77  <Method int AppboyLogger.i(String, String)>
				//*  67  132:pop             
				//*  68  133:aload_0         
				//*  69  134:getfield        #19  <Field Appboy b>
				//*  70  137:invokestatic    #84  <Method i Appboy.b(Appboy)>
				//*  71  140:aload_0         
				//*  72  141:getfield        #21  <Field String a>
				//*  73  144:invokevirtual   #88  <Method void i.b(String)>
				//*  74  147:aload_0         
				//*  75  148:getfield        #19  <Field Appboy b>
				//*  76  151:invokestatic    #49  <Method AppboyUser Appboy.g(Appboy)>
				//*  77  154:aload_0         
				//*  78  155:getfield        #21  <Field String a>
				//*  79  158:invokevirtual   #90  <Method void AppboyUser.a(String)>
				//*  80  161:goto            257
				//*  81  164:invokestatic    #37  <Method String Appboy.b()>
				//*  82  167:astore_2        
				//*  83  168:new             #62  <Class StringBuilder>
				//*  84  171:dup             
				//*  85  172:invokespecial   #63  <Method void StringBuilder()>
				//*  86  175:astore_3        
				//*  87  176:aload_3         
				//*  88  177:ldc1            #92  <String "Changing current user ">
				//*  89  179:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
				//*  90  182:pop             
				//*  91  183:aload_3         
				//*  92  184:aload_1         
				//*  93  185:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
				//*  94  188:pop             
				//*  95  189:aload_3         
				//*  96  190:ldc1            #94  <String " to new user ">
				//*  97  192:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
				//*  98  195:pop             
				//*  99  196:aload_3         
				//* 100  197:aload_0         
				//* 101  198:getfield        #21  <Field String a>
				//* 102  201:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
				//* 103  204:pop             
				//* 104  205:aload_3         
				//* 105  206:ldc1            #96  <String ".">
				//* 106  208:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
				//* 107  211:pop             
				//* 108  212:aload_2         
				//* 109  213:aload_3         
				//* 110  214:invokevirtual   #74  <Method String StringBuilder.toString()>
				//* 111  217:invokestatic    #77  <Method int AppboyLogger.i(String, String)>
				//* 112  220:pop             
				//* 113  221:new             #98  <Class FeedUpdatedEvent>
				//* 114  224:dup             
				//* 115  225:new             #100 <Class ArrayList>
				//* 116  228:dup             
				//* 117  229:invokespecial   #101 <Method void ArrayList()>
				//* 118  232:aload_0         
				//* 119  233:getfield        #21  <Field String a>
				//* 120  236:iconst_0        
				//* 121  237:invokestatic    #106 <Method long dl.a()>
				//* 122  240:invokespecial   #109 <Method void FeedUpdatedEvent(java.util.List, String, boolean, long)>
				//* 123  243:astore_1        
				//* 124  244:aload_0         
				//* 125  245:getfield        #19  <Field Appboy b>
				//* 126  248:invokestatic    #113 <Method z Appboy.c(Appboy)>
				//* 127  251:aload_1         
				//* 128  252:ldc1            #98  <Class FeedUpdatedEvent>
				//* 129  254:invokevirtual   #118 <Method void z.a(Object, Class)>
				//* 130  257:aload_0         
				//* 131  258:getfield        #19  <Field Appboy b>
				//* 132  261:getfield        #121 <Field bf Appboy.g>
				//* 133  264:invokevirtual   #125 <Method void bf.c()>
				//* 134  267:aload_0         
				//* 135  268:getfield        #19  <Field Appboy b>
				//* 136  271:invokestatic    #84  <Method i Appboy.b(Appboy)>
				//* 137  274:aload_0         
				//* 138  275:getfield        #21  <Field String a>
				//* 139  278:invokevirtual   #126 <Method void i.a(String)>
				//* 140  281:aload_0         
				//* 141  282:getfield        #19  <Field Appboy b>
				//* 142  285:getfield        #129 <Field ea Appboy.b>
				//* 143  288:astore_1        
				//* 144  289:new             #131 <Class ea>
				//* 145  292:dup             
				//* 146  293:aload_0         
				//* 147  294:getfield        #19  <Field Appboy b>
				//* 148  297:invokestatic    #134 <Method Context Appboy.a(Appboy)>
				//* 149  300:aload_0         
				//* 150  301:getfield        #19  <Field Appboy b>
				//* 151  304:invokestatic    #84  <Method i Appboy.b(Appboy)>
				//* 152  307:aload_0         
				//* 153  308:getfield        #19  <Field Appboy b>
				//* 154  311:getfield        #138 <Field AppboyConfigurationProvider Appboy.h>
				//* 155  314:aload_0         
				//* 156  315:getfield        #19  <Field Appboy b>
				//* 157  318:invokestatic    #113 <Method z Appboy.c(Appboy)>
				//* 158  321:aload_0         
				//* 159  322:getfield        #19  <Field Appboy b>
				//* 160  325:invokestatic    #142 <Method ba Appboy.d(Appboy)>
				//* 161  328:aload_0         
				//* 162  329:getfield        #19  <Field Appboy b>
				//* 163  332:getfield        #145 <Field bp com.appboy.Appboy.i>
				//* 164  335:invokestatic    #148 <Method boolean Appboy.c()>
				//* 165  338:invokestatic    #150 <Method boolean Appboy.d()>
				//* 166  341:aload_0         
				//* 167  342:getfield        #19  <Field Appboy b>
				//* 168  345:invokestatic    #153 <Method br Appboy.e(Appboy)>
				//* 169  348:invokespecial   #156 <Method void ea(Context, i, AppboyConfigurationProvider, aa, ba, bp, boolean, boolean, br)>
				//* 170  351:astore_2        
				//* 171  352:aload_0         
				//* 172  353:getfield        #19  <Field Appboy b>
				//* 173  356:aload_2         
				//* 174  357:invokestatic    #159 <Method void Appboy.a(Appboy, ea)>
				//* 175  360:aload_0         
				//* 176  361:getfield        #19  <Field Appboy b>
				//* 177  364:getfield        #129 <Field ea Appboy.b>
				//* 178  367:invokevirtual   #162 <Method dj ea.g()>
				//* 179  370:invokevirtual   #166 <Method void dj.d()>
				//* 180  373:aload_0         
				//* 181  374:getfield        #19  <Field Appboy b>
				//* 182  377:getfield        #121 <Field bf Appboy.g>
				//* 183  380:invokevirtual   #169 <Method by bf.a()>
				//* 184  383:pop             
				//* 185  384:aload_0         
				//* 186  385:getfield        #19  <Field Appboy b>
				//* 187  388:getfield        #121 <Field bf Appboy.g>
				//* 188  391:new             #171 <Class bo.app.cg$a>
				//* 189  394:dup             
				//* 190  395:invokespecial   #172 <Method void bo.app.cg$a()>
				//* 191  398:invokevirtual   #175 <Method bo.app.cg$a bo.app.cg$a.a()>
				//* 192  401:invokevirtual   #178 <Method void bf.a(bo.app.cg$a)>
				//* 193  404:aload_1         
				//* 194  405:invokevirtual   #181 <Method void ea.n()>
				//* 195  408:return          
					catch(Exception exception)
				//* 196  409:astore_1        
					{
						String s3 = Appboy.b();
				//  197  410:invokestatic    #37  <Method String Appboy.b()>
				//  198  413:astore_2        
						StringBuilder stringbuilder3 = new StringBuilder();
				//  199  414:new             #62  <Class StringBuilder>
				//  200  417:dup             
				//  201  418:invokespecial   #63  <Method void StringBuilder()>
				//  202  421:astore_3        
						stringbuilder3.append("Failed to set external id to: ");
				//  203  422:aload_3         
				//  204  423:ldc1            #183 <String "Failed to set external id to: ">
				//  205  425:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
				//  206  428:pop             
						stringbuilder3.append(a);
				//  207  429:aload_3         
				//  208  430:aload_0         
				//  209  431:getfield        #21  <Field String a>
				//  210  434:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
				//  211  437:pop             
						AppboyLogger.w(s3, stringbuilder3.toString(), ((Throwable) (exception)));
				//  212  438:aload_2         
				//  213  439:aload_3         
				//  214  440:invokevirtual   #74  <Method String StringBuilder.toString()>
				//  215  443:aload_1         
				//  216  444:invokestatic    #187 <Method int AppboyLogger.w(String, String, Throwable)>
				//  217  447:pop             
						Appboy.a(b, ((Throwable) (exception)));
				//  218  448:aload_0         
				//  219  449:getfield        #19  <Field Appboy b>
				//  220  452:aload_1         
				//  221  453:invokestatic    #190 <Method void Appboy.a(Appboy, Throwable)>
						return;
				//  222  456:return          
					}
					obj = ((Object) (Appboy.g(b).getUserId()));
					if(((String) (obj)).equals(((Object) (a))))
					{
						obj = ((Object) (Appboy.b()));
						StringBuilder stringbuilder = new StringBuilder();
						stringbuilder.append("Received request to change current user ");
						stringbuilder.append(a);
						stringbuilder.append(" to the same user id. Doing nothing.");
						AppboyLogger.i(((String) (obj)), stringbuilder.toString());
						return;
					}
					if(((String) (obj)).equals(""))
					{
						obj = ((Object) (Appboy.b()));
						StringBuilder stringbuilder1 = new StringBuilder();
						stringbuilder1.append("Changing anonymous user to ");
						stringbuilder1.append(a);
						AppboyLogger.i(((String) (obj)), stringbuilder1.toString());
						Appboy.b(b).b(a);
						Appboy.g(b).a(a);
						break MISSING_BLOCK_LABEL_257;
					}
					String s2 = Appboy.b();
					StringBuilder stringbuilder2 = new StringBuilder();
					stringbuilder2.append("Changing current user ");
					stringbuilder2.append(((String) (obj)));
					stringbuilder2.append(" to new user ");
					stringbuilder2.append(a);
					stringbuilder2.append(".");
					AppboyLogger.i(s2, stringbuilder2.toString());
					obj = ((Object) (new FeedUpdatedEvent(((java.util.List) (new ArrayList())), a, false, dl.a())));
					Appboy.c(b).a(obj, com/appboy/events/FeedUpdatedEvent);
					b.g.c();
					Appboy.b(b).a(a);
					ea ea1 = b.b;
					ea ea2 = new ea(Appboy.a(b), Appboy.b(b), b.h, ((aa) (Appboy.c(b))), Appboy.d(b), b.i, Appboy.c(), Appboy.d(), Appboy.e(b));
					Appboy.a(b, ea2);
					b.b.g().d();
					b.g.a();
					b.g.a((new bo.app.cg.a()).a());
					ea1.n();
					return;
				}

				final String a;
				final Appboy b;

			
			{
				b = Appboy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field Appboy b>
				a = s1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #710 <Field at j>
	//    5   11:new             #18  <Class Appboy$13>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #1097 <Method void Appboy$13(Appboy, String)>
	//   10   20:invokevirtual   #715 <Method Future at.submit(Runnable)>
	//   11   23:pop             
			return;
	//   12   24:return          
		}
	}

	public void closeSession(Activity activity)
	{
		if(h())
	//*   0    0:invokestatic    #1085 <Method boolean h()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			j.submit(new Runnable(activity) {

				public void run()
				{
					if(a == null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #21  <Field Activity a>
				//*   2    4:ifnonnull       17
					{
						AppboyLogger.w(Appboy.b(), "Cannot close session with null activity.");
				//    3    7:invokestatic    #31  <Method String Appboy.b()>
				//    4   10:ldc1            #33  <String "Cannot close session with null activity.">
				//    5   12:invokestatic    #39  <Method int AppboyLogger.w(String, String)>
				//    6   15:pop             
						return;
				//    7   16:return          
					}
					by by1 = b.g.b(a);
				//    8   17:aload_0         
				//    9   18:getfield        #19  <Field Appboy b>
				//   10   21:getfield        #43  <Field bf Appboy.g>
				//   11   24:aload_0         
				//   12   25:getfield        #21  <Field Activity a>
				//   13   28:invokevirtual   #48  <Method by bf.b(Activity)>
				//   14   31:astore_1        
					if(by1 != null)
				//*  15   32:aload_1         
				//*  16   33:ifnull          93
						try
						{
							String s1 = Appboy.b();
				//   17   36:invokestatic    #31  <Method String Appboy.b()>
				//   18   39:astore_2        
							StringBuilder stringbuilder = new StringBuilder();
				//   19   40:new             #50  <Class StringBuilder>
				//   20   43:dup             
				//   21   44:invokespecial   #51  <Method void StringBuilder()>
				//   22   47:astore_3        
							stringbuilder.append("Closed session with ID: ");
				//   23   48:aload_3         
				//   24   49:ldc1            #53  <String "Closed session with ID: ">
				//   25   51:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
				//   26   54:pop             
							stringbuilder.append(((Object) (by1.a())));
				//   27   55:aload_3         
				//   28   56:aload_1         
				//   29   57:invokevirtual   #62  <Method bo.app.ca by.a()>
				//   30   60:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
				//   31   63:pop             
							AppboyLogger.i(s1, stringbuilder.toString());
				//   32   64:aload_2         
				//   33   65:aload_3         
				//   34   66:invokevirtual   #68  <Method String StringBuilder.toString()>
				//   35   69:invokestatic    #71  <Method int AppboyLogger.i(String, String)>
				//   36   72:pop             
							return;
				//   37   73:return          
						}
						catch(Exception exception)
				//*  38   74:astore_1        
						{
							AppboyLogger.w(Appboy.b(), "Failed to close session.", ((Throwable) (exception)));
				//   39   75:invokestatic    #31  <Method String Appboy.b()>
				//   40   78:ldc1            #73  <String "Failed to close session.">
				//   41   80:aload_1         
				//   42   81:invokestatic    #76  <Method int AppboyLogger.w(String, String, Throwable)>
				//   43   84:pop             
							Appboy.a(b, ((Throwable) (exception)));
				//   44   85:aload_0         
				//   45   86:getfield        #19  <Field Appboy b>
				//   46   89:aload_1         
				//   47   90:invokestatic    #79  <Method void Appboy.a(Appboy, Throwable)>
						}
					return;
				//   48   93:return          
				}

				final Activity a;
				final Appboy b;

			
			{
				b = Appboy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field Appboy b>
				a = activity;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Activity a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #710 <Field at j>
	//    5   11:new             #48  <Class Appboy$27>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #1102 <Method void Appboy$27(Appboy, Activity)>
	//   10   20:invokevirtual   #715 <Method Future at.submit(Runnable)>
	//   11   23:pop             
			return;
	//   12   24:return          
		}
	}

	public IInAppMessage deserializeInAppMessageString(String s1)
	{
		return ds.a(s1, ((bo.app.bl) (g)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #749 <Field bf g>
	//    3    5:invokestatic    #1109 <Method IInAppMessage ds.a(String, bo.app.bl)>
	//    4    8:areturn         
	}

	public IAppboyImageLoader getAppboyImageLoader()
	{
		if(x == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #606 <Field IAppboyImageLoader x>
	//*   2    4:ifnonnull       32
		{
			AppboyLogger.d(k, "The Image Loader was null. Creating a new Image Loader and returning it.");
	//    3    7:getstatic       #142 <Field String k>
	//    4   10:ldc2            #1113 <String "The Image Loader was null. Creating a new Image Loader and returning it.">
	//    5   13:invokestatic    #543 <Method int AppboyLogger.d(String, String)>
	//    6   16:pop             
			x = ((IAppboyImageLoader) (new AppboyLruImageLoader(p)));
	//    7   17:aload_0         
	//    8   18:new             #602 <Class AppboyLruImageLoader>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:getfield        #551 <Field Context p>
	//   12   26:invokespecial   #604 <Method void AppboyLruImageLoader(Context)>
	//   13   29:putfield        #606 <Field IAppboyImageLoader x>
		}
		return x;
	//   14   32:aload_0         
	//   15   33:getfield        #606 <Field IAppboyImageLoader x>
	//   16   36:areturn         
	}

	public String getAppboyPushMessageRegistrationId()
	{
		String s1;
		try
		{
			s1 = i.a();
	//    0    0:aload_0         
	//    1    1:getfield        #684 <Field bp i>
	//    2    4:invokeinterface #1117 <Method String bp.a()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(Exception exception)
	//*   6   12:astore_1        
		{
			AppboyLogger.w(k, "Failed to get the registration ID.", ((Throwable) (exception)));
	//    7   13:getstatic       #142 <Field String k>
	//    8   16:ldc2            #1119 <String "Failed to get the registration ID.">
	//    9   19:aload_1         
	//   10   20:invokestatic    #990 <Method int AppboyLogger.w(String, String, Throwable)>
	//   11   23:pop             
			a(((Throwable) (exception)));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokespecial   #836 <Method void a(Throwable)>
			return null;
	//   15   29:aconst_null     
	//   16   30:areturn         
		}
		return s1;
	}

	public AppboyUser getCurrentUser()
	{
		AppboyUser appboyuser;
		try
		{
			appboyuser = (AppboyUser)j.submit(new Callable() {

				public AppboyUser a()
				{
					return Appboy.g(a);
				//    0    0:aload_0         
				//    1    1:getfield        #18  <Field Appboy a>
				//    2    4:invokestatic    #26  <Method AppboyUser Appboy.g(Appboy)>
				//    3    7:areturn         
				}

				public Object call()
				{
					return ((Object) (a()));
				//    0    0:aload_0         
				//    1    1:invokevirtual   #30  <Method AppboyUser a()>
				//    2    4:areturn         
				}

				final Appboy a;

			
			{
				a = Appboy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field Appboy a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
			}
).get();
	//    0    0:aload_0         
	//    1    1:getfield        #710 <Field at j>
	//    2    4:new             #20  <Class Appboy$14>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #1122 <Method void Appboy$14(Appboy)>
	//    6   12:invokevirtual   #1125 <Method Future at.submit(Callable)>
	//    7   15:invokeinterface #1130 <Method Object Future.get()>
	//    8   20:checkcast       #766 <Class AppboyUser>
	//    9   23:astore_1        
		}
	//*  10   24:aload_1         
	//*  11   25:areturn         
		catch(Exception exception)
	//*  12   26:astore_1        
		{
			AppboyLogger.w(k, "Failed to retrieve the current user.", ((Throwable) (exception)));
	//   13   27:getstatic       #142 <Field String k>
	//   14   30:ldc2            #1132 <String "Failed to retrieve the current user.">
	//   15   33:aload_1         
	//   16   34:invokestatic    #990 <Method int AppboyLogger.w(String, String, Throwable)>
	//   17   37:pop             
			a(((Throwable) (exception)));
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:invokespecial   #836 <Method void a(Throwable)>
			return null;
	//   21   43:aconst_null     
	//   22   44:areturn         
		}
		return appboyuser;
	}

	public String getDeviceId()
	{
		return v.a();
	//    0    0:aload_0         
	//    1    1:getfield        #668 <Field ba v>
	//    2    4:invokevirtual   #1134 <Method String ba.a()>
	//    3    7:areturn         
	}

	public String getInstallTrackingId()
	{
		return v.a();
	//    0    0:aload_0         
	//    1    1:getfield        #668 <Field ba v>
	//    2    4:invokevirtual   #1134 <Method String ba.a()>
	//    3    7:areturn         
	}

	public void logCustomEvent(String s1)
	{
		logCustomEvent(s1, ((AppboyProperties) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #1139 <Method void logCustomEvent(String, AppboyProperties)>
	//    4    6:return          
	}

	public void logCustomEvent(String s1, AppboyProperties appboyproperties)
	{
		if(h())
	//*   0    0:invokestatic    #1085 <Method boolean h()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			j.submit(new Runnable(s1, appboyproperties) {

				public void run()
				{
					String s2;
					String s3;
					s3 = a;
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field String a>
				//    2    4:astore_2        
					s2 = s3;
				//    3    5:aload_2         
				//    4    6:astore_1        
					if(ValidationUtils.isValidLogCustomEventInput(s3, c.f))
						break MISSING_BLOCK_LABEL_80;
				//    5    7:aload_2         
				//    6    8:aload_0         
				//    7    9:getfield        #21  <Field Appboy c>
				//    8   12:getfield        #36  <Field dh Appboy.f>
				//    9   15:invokestatic    #42  <Method boolean ValidationUtils.isValidLogCustomEventInput(String, dh)>
				//   10   18:ifne            80
					s2 = s3;
				//   11   21:aload_2         
				//   12   22:astore_1        
					Object obj = ((Object) (Appboy.b()));
				//   13   23:invokestatic    #45  <Method String Appboy.b()>
				//   14   26:astore_3        
					s2 = s3;
				//   15   27:aload_2         
				//   16   28:astore_1        
					StringBuilder stringbuilder = new StringBuilder();
				//   17   29:new             #47  <Class StringBuilder>
				//   18   32:dup             
				//   19   33:invokespecial   #48  <Method void StringBuilder()>
				//   20   36:astore          4
					s2 = s3;
				//   21   38:aload_2         
				//   22   39:astore_1        
					stringbuilder.append("Log custom event input ");
				//   23   40:aload           4
				//   24   42:ldc1            #50  <String "Log custom event input ">
				//   25   44:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
				//   26   47:pop             
					s2 = s3;
				//   27   48:aload_2         
				//   28   49:astore_1        
					stringbuilder.append(s3);
				//   29   50:aload           4
				//   30   52:aload_2         
				//   31   53:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
				//   32   56:pop             
					s2 = s3;
				//   33   57:aload_2         
				//   34   58:astore_1        
					stringbuilder.append(" was invalid. Not logging custom event to Appboy.");
				//   35   59:aload           4
				//   36   61:ldc1            #56  <String " was invalid. Not logging custom event to Appboy.">
				//   37   63:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
				//   38   66:pop             
					s2 = s3;
				//   39   67:aload_2         
				//   40   68:astore_1        
					try
					{
						AppboyLogger.w(((String) (obj)), stringbuilder.toString());
				//   41   69:aload_3         
				//   42   70:aload           4
				//   43   72:invokevirtual   #59  <Method String StringBuilder.toString()>
				//   44   75:invokestatic    #65  <Method int AppboyLogger.w(String, String)>
				//   45   78:pop             
						return;
				//   46   79:return          
					}
				//*  47   80:aload_2         
				//*  48   81:astore_1        
				//*  49   82:aload_2         
				//*  50   83:invokestatic    #69  <Method String ValidationUtils.ensureAppboyFieldLength(String)>
				//*  51   86:astore_2        
				//*  52   87:aload_2         
				//*  53   88:astore_1        
				//*  54   89:aload_2         
				//*  55   90:aload_0         
				//*  56   91:getfield        #25  <Field AppboyProperties b>
				//*  57   94:invokestatic    #74  <Method cc cc.a(String, AppboyProperties)>
				//*  58   97:astore_3        
				//*  59   98:aload_2         
				//*  60   99:astore_1        
				//*  61  100:aload_0         
				//*  62  101:getfield        #21  <Field Appboy c>
				//*  63  104:getfield        #78  <Field bf Appboy.g>
				//*  64  107:aload_3         
				//*  65  108:invokevirtual   #83  <Method boolean bf.a(bo.app.bu)>
				//*  66  111:ifeq            188
				//*  67  114:aload_2         
				//*  68  115:astore_1        
				//*  69  116:aload_0         
				//*  70  117:getfield        #21  <Field Appboy c>
				//*  71  120:getfield        #87  <Field fp Appboy.d>
				//*  72  123:new             #89  <Class fa>
				//*  73  126:dup             
				//*  74  127:aload_2         
				//*  75  128:aload_0         
				//*  76  129:getfield        #25  <Field AppboyProperties b>
				//*  77  132:aload_3         
				//*  78  133:invokespecial   #92  <Method void fa(String, AppboyProperties, bo.app.bu)>
				//*  79  136:invokevirtual   #97  <Method void fp.a(bo.app.fb)>
				//*  80  139:return          
					catch(Exception exception)
				//*  81  140:astore_2        
					{
						String s4 = Appboy.b();
				//   82  141:invokestatic    #45  <Method String Appboy.b()>
				//   83  144:astore_3        
						StringBuilder stringbuilder1 = new StringBuilder();
				//   84  145:new             #47  <Class StringBuilder>
				//   85  148:dup             
				//   86  149:invokespecial   #48  <Method void StringBuilder()>
				//   87  152:astore          4
						stringbuilder1.append("Failed to log custom event: ");
				//   88  154:aload           4
				//   89  156:ldc1            #99  <String "Failed to log custom event: ">
				//   90  158:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
				//   91  161:pop             
						stringbuilder1.append(s2);
				//   92  162:aload           4
				//   93  164:aload_1         
				//   94  165:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
				//   95  168:pop             
						AppboyLogger.w(s4, stringbuilder1.toString(), ((Throwable) (exception)));
				//   96  169:aload_3         
				//   97  170:aload           4
				//   98  172:invokevirtual   #59  <Method String StringBuilder.toString()>
				//   99  175:aload_2         
				//  100  176:invokestatic    #102 <Method int AppboyLogger.w(String, String, Throwable)>
				//  101  179:pop             
						Appboy.a(c, ((Throwable) (exception)));
				//  102  180:aload_0         
				//  103  181:getfield        #21  <Field Appboy c>
				//  104  184:aload_2         
				//  105  185:invokestatic    #105 <Method void Appboy.a(Appboy, Throwable)>
					}
					break MISSING_BLOCK_LABEL_188;
					s2 = s3;
					s3 = ValidationUtils.ensureAppboyFieldLength(s3);
					s2 = s3;
					obj = ((Object) (cc.a(s3, b)));
					s2 = s3;
					if(!c.g.a(((bo.app.bu) (obj))))
						break MISSING_BLOCK_LABEL_188;
					s2 = s3;
					c.d.a(((bo.app.fb) (new fa(s3, b, ((bo.app.bu) (obj))))));
					return;
				//  106  188:return          
				}

				final String a;
				final AppboyProperties b;
				final Appboy c;

			
			{
				c = Appboy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field Appboy c>
				a = s1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field String a>
				b = appboyproperties;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field AppboyProperties b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #710 <Field at j>
	//    5   11:new             #52  <Class Appboy$29>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokespecial   #1142 <Method void Appboy$29(Appboy, String, AppboyProperties)>
	//   11   21:invokevirtual   #715 <Method Future at.submit(Runnable)>
	//   12   24:pop             
			return;
	//   13   25:return          
		}
	}

	public void logFeedCardClick(String s1)
	{
		if(h())
	//*   0    0:invokestatic    #1085 <Method boolean h()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			j.submit(new Runnable(s1) {

				public void run()
				{
					try
					{
						if(StringUtils.isNullOrBlank(a))
				//*   0    0:aload_0         
				//*   1    1:getfield        #21  <Field String a>
				//*   2    4:invokestatic    #34  <Method boolean StringUtils.isNullOrBlank(String)>
				//*   3    7:ifeq            20
						{
							AppboyLogger.e(Appboy.b(), "Card ID cannot be null or blank.");
				//    4   10:invokestatic    #37  <Method String Appboy.b()>
				//    5   13:ldc1            #39  <String "Card ID cannot be null or blank.">
				//    6   15:invokestatic    #45  <Method int AppboyLogger.e(String, String)>
				//    7   18:pop             
							return;
				//    8   19:return          
						}
					}
				//*   9   20:aload_0         
				//*  10   21:getfield        #19  <Field Appboy b>
				//*  11   24:getfield        #49  <Field bf Appboy.g>
				//*  12   27:aload_0         
				//*  13   28:getfield        #21  <Field String a>
				//*  14   31:invokestatic    #55  <Method cc cc.d(String)>
				//*  15   34:invokevirtual   #60  <Method boolean bf.a(bo.app.bu)>
				//*  16   37:pop             
				//*  17   38:return          
					catch(Exception exception)
				//*  18   39:astore_1        
					{
						String s2 = Appboy.b();
				//   19   40:invokestatic    #37  <Method String Appboy.b()>
				//   20   43:astore_2        
						StringBuilder stringbuilder = new StringBuilder();
				//   21   44:new             #62  <Class StringBuilder>
				//   22   47:dup             
				//   23   48:invokespecial   #63  <Method void StringBuilder()>
				//   24   51:astore_3        
						stringbuilder.append("Failed to log feed card clicked. Card id: ");
				//   25   52:aload_3         
				//   26   53:ldc1            #65  <String "Failed to log feed card clicked. Card id: ">
				//   27   55:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
				//   28   58:pop             
						stringbuilder.append(a);
				//   29   59:aload_3         
				//   30   60:aload_0         
				//   31   61:getfield        #21  <Field String a>
				//   32   64:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
				//   33   67:pop             
						AppboyLogger.w(s2, stringbuilder.toString(), ((Throwable) (exception)));
				//   34   68:aload_2         
				//   35   69:aload_3         
				//   36   70:invokevirtual   #72  <Method String StringBuilder.toString()>
				//   37   73:aload_1         
				//   38   74:invokestatic    #76  <Method int AppboyLogger.w(String, String, Throwable)>
				//   39   77:pop             
						Appboy.a(b, ((Throwable) (exception)));
				//   40   78:aload_0         
				//   41   79:getfield        #19  <Field Appboy b>
				//   42   82:aload_1         
				//   43   83:invokestatic    #79  <Method void Appboy.a(Appboy, Throwable)>
						return;
				//   44   86:return          
					}
					b.g.a(((bo.app.bu) (cc.d(a))));
					return;
				}

				final String a;
				final Appboy b;

			
			{
				b = Appboy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field Appboy b>
				a = s1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #710 <Field at j>
	//    5   11:new             #24  <Class Appboy$16>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #1144 <Method void Appboy$16(Appboy, String)>
	//   10   20:invokevirtual   #715 <Method Future at.submit(Runnable)>
	//   11   23:pop             
			return;
	//   12   24:return          
		}
	}

	public void logFeedCardImpression(String s1)
	{
		if(h())
	//*   0    0:invokestatic    #1085 <Method boolean h()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			j.submit(new Runnable(s1) {

				public void run()
				{
					try
					{
						if(StringUtils.isNullOrBlank(a))
				//*   0    0:aload_0         
				//*   1    1:getfield        #21  <Field String a>
				//*   2    4:invokestatic    #34  <Method boolean StringUtils.isNullOrBlank(String)>
				//*   3    7:ifeq            20
						{
							AppboyLogger.e(Appboy.b(), "Card ID cannot be null or blank.");
				//    4   10:invokestatic    #37  <Method String Appboy.b()>
				//    5   13:ldc1            #39  <String "Card ID cannot be null or blank.">
				//    6   15:invokestatic    #45  <Method int AppboyLogger.e(String, String)>
				//    7   18:pop             
							return;
				//    8   19:return          
						}
					}
				//*   9   20:aload_0         
				//*  10   21:getfield        #19  <Field Appboy b>
				//*  11   24:getfield        #49  <Field bf Appboy.g>
				//*  12   27:aload_0         
				//*  13   28:getfield        #21  <Field String a>
				//*  14   31:invokestatic    #55  <Method cc cc.c(String)>
				//*  15   34:invokevirtual   #60  <Method boolean bf.a(bo.app.bu)>
				//*  16   37:pop             
				//*  17   38:aload_0         
				//*  18   39:getfield        #19  <Field Appboy b>
				//*  19   42:getfield        #63  <Field dc Appboy.c>
				//*  20   45:aload_0         
				//*  21   46:getfield        #21  <Field String a>
				//*  22   49:invokevirtual   #67  <Method void dc.a(String)>
				//*  23   52:return          
					catch(Exception exception)
				//*  24   53:astore_1        
					{
						String s2 = Appboy.b();
				//   25   54:invokestatic    #37  <Method String Appboy.b()>
				//   26   57:astore_2        
						StringBuilder stringbuilder = new StringBuilder();
				//   27   58:new             #69  <Class StringBuilder>
				//   28   61:dup             
				//   29   62:invokespecial   #70  <Method void StringBuilder()>
				//   30   65:astore_3        
						stringbuilder.append("Failed to log feed card impression. Card id: ");
				//   31   66:aload_3         
				//   32   67:ldc1            #72  <String "Failed to log feed card impression. Card id: ">
				//   33   69:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
				//   34   72:pop             
						stringbuilder.append(a);
				//   35   73:aload_3         
				//   36   74:aload_0         
				//   37   75:getfield        #21  <Field String a>
				//   38   78:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
				//   39   81:pop             
						AppboyLogger.w(s2, stringbuilder.toString(), ((Throwable) (exception)));
				//   40   82:aload_2         
				//   41   83:aload_3         
				//   42   84:invokevirtual   #79  <Method String StringBuilder.toString()>
				//   43   87:aload_1         
				//   44   88:invokestatic    #83  <Method int AppboyLogger.w(String, String, Throwable)>
				//   45   91:pop             
						Appboy.a(b, ((Throwable) (exception)));
				//   46   92:aload_0         
				//   47   93:getfield        #19  <Field Appboy b>
				//   48   96:aload_1         
				//   49   97:invokestatic    #86  <Method void Appboy.a(Appboy, Throwable)>
						return;
				//   50  100:return          
					}
					b.g.a(((bo.app.bu) (cc.c(a))));
					b.c.a(a);
					return;
				}

				final String a;
				final Appboy b;

			
			{
				b = Appboy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field Appboy b>
				a = s1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #710 <Field at j>
	//    5   11:new             #22  <Class Appboy$15>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #1146 <Method void Appboy$15(Appboy, String)>
	//   10   20:invokevirtual   #715 <Method Future at.submit(Runnable)>
	//   11   23:pop             
			return;
	//   12   24:return          
		}
	}

	public void logFeedDisplayed()
	{
		if(h())
	//*   0    0:invokestatic    #1085 <Method boolean h()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			j.submit(new Runnable() {

				public void run()
				{
					try
					{
						a.g.a(((bo.app.bu) (cc.g())));
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field Appboy a>
				//    2    4:getfield        #27  <Field bf Appboy.g>
				//    3    7:invokestatic    #32  <Method cc cc.g()>
				//    4   10:invokevirtual   #37  <Method boolean bf.a(bo.app.bu)>
				//    5   13:pop             
						return;
				//    6   14:return          
					}
					catch(Exception exception)
				//*   7   15:astore_1        
					{
						AppboyLogger.w(Appboy.b(), "Failed to log that the feed was displayed.", ((Throwable) (exception)));
				//    8   16:invokestatic    #41  <Method String Appboy.b()>
				//    9   19:ldc1            #43  <String "Failed to log that the feed was displayed.">
				//   10   21:aload_1         
				//   11   22:invokestatic    #49  <Method int AppboyLogger.w(String, String, Throwable)>
				//   12   25:pop             
						Appboy.a(a, ((Throwable) (exception)));
				//   13   26:aload_0         
				//   14   27:getfield        #17  <Field Appboy a>
				//   15   30:aload_1         
				//   16   31:invokestatic    #52  <Method void Appboy.a(Appboy, Throwable)>
						return;
				//   17   34:return          
					}
				}

				final Appboy a;

			
			{
				a = Appboy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field Appboy a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #710 <Field at j>
	//    5   11:new             #64  <Class Appboy$7>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:invokespecial   #1148 <Method void Appboy$7(Appboy)>
	//    9   19:invokevirtual   #715 <Method Future at.submit(Runnable)>
	//   10   22:pop             
			return;
	//   11   23:return          
		}
	}

	public void logFeedbackDisplayed()
	{
		if(h())
	//*   0    0:invokestatic    #1085 <Method boolean h()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			j.submit(new Runnable() {

				public void run()
				{
					try
					{
						a.g.a(((bo.app.bu) (cc.h())));
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field Appboy a>
				//    2    4:getfield        #27  <Field bf Appboy.g>
				//    3    7:invokestatic    #33  <Method cc cc.h()>
				//    4   10:invokevirtual   #38  <Method boolean bf.a(bo.app.bu)>
				//    5   13:pop             
						return;
				//    6   14:return          
					}
					catch(Exception exception)
				//*   7   15:astore_1        
					{
						AppboyLogger.w(Appboy.b(), "Failed to log that feedback was displayed.", ((Throwable) (exception)));
				//    8   16:invokestatic    #42  <Method String Appboy.b()>
				//    9   19:ldc1            #44  <String "Failed to log that feedback was displayed.">
				//   10   21:aload_1         
				//   11   22:invokestatic    #50  <Method int AppboyLogger.w(String, String, Throwable)>
				//   12   25:pop             
						Appboy.a(a, ((Throwable) (exception)));
				//   13   26:aload_0         
				//   14   27:getfield        #17  <Field Appboy a>
				//   15   30:aload_1         
				//   16   31:invokestatic    #53  <Method void Appboy.a(Appboy, Throwable)>
						return;
				//   17   34:return          
					}
				}

				final Appboy a;

			
			{
				a = Appboy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field Appboy a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #710 <Field at j>
	//    5   11:new             #66  <Class Appboy$8>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:invokespecial   #1150 <Method void Appboy$8(Appboy)>
	//    9   19:invokevirtual   #715 <Method Future at.submit(Runnable)>
	//   10   22:pop             
			return;
	//   11   23:return          
		}
	}

	public void logPurchase(String s1, String s2, BigDecimal bigdecimal)
	{
		logPurchase(s1, s2, bigdecimal, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_1        
	//    5    5:invokevirtual   #1155 <Method void logPurchase(String, String, BigDecimal, int)>
	//    6    8:return          
	}

	public void logPurchase(String s1, String s2, BigDecimal bigdecimal, int i1)
	{
		logPurchase(s1, s2, bigdecimal, i1, ((AppboyProperties) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:aconst_null     
	//    6    7:invokevirtual   #1158 <Method void logPurchase(String, String, BigDecimal, int, AppboyProperties)>
	//    7   10:return          
	}

	public void logPurchase(String s1, String s2, BigDecimal bigdecimal, int i1, AppboyProperties appboyproperties)
	{
		if(h())
	//*   0    0:invokestatic    #1085 <Method boolean h()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			j.submit(new Runnable(s1, s2, bigdecimal, i1, appboyproperties) {

				public void run()
				{
					String s3;
					String s4;
					Object obj;
					s4 = a;
				//    0    0:aload_0         
				//    1    1:getfield        #28  <Field String a>
				//    2    4:astore_2        
					obj = ((Object) (b));
				//    3    5:aload_0         
				//    4    6:getfield        #30  <Field String b>
				//    5    9:astore_3        
					if(obj != null)
						break MISSING_BLOCK_LABEL_75;
				//    6   10:aload_3         
				//    7   11:ifnonnull       75
					s3 = s4;
				//    8   14:aload_2         
				//    9   15:astore_1        
					obj = ((Object) (Appboy.b()));
				//   10   16:invokestatic    #46  <Method String Appboy.b()>
				//   11   19:astore_3        
					s3 = s4;
				//   12   20:aload_2         
				//   13   21:astore_1        
					StringBuilder stringbuilder = new StringBuilder();
				//   14   22:new             #48  <Class StringBuilder>
				//   15   25:dup             
				//   16   26:invokespecial   #49  <Method void StringBuilder()>
				//   17   29:astore          4
					s3 = s4;
				//   18   31:aload_2         
				//   19   32:astore_1        
					stringbuilder.append("The currencyCode is null. Expected one of ");
				//   20   33:aload           4
				//   21   35:ldc1            #51  <String "The currencyCode is null. Expected one of ">
				//   22   37:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
				//   23   40:pop             
					s3 = s4;
				//   24   41:aload_2         
				//   25   42:astore_1        
					stringbuilder.append(((Object) (Appboy.e())));
				//   26   43:aload           4
				//   27   45:invokestatic    #58  <Method Set Appboy.e()>
				//   28   48:invokevirtual   #61  <Method StringBuilder StringBuilder.append(Object)>
				//   29   51:pop             
					s3 = s4;
				//   30   52:aload_2         
				//   31   53:astore_1        
					stringbuilder.append(". Not logging in-app purchase to Appboy.");
				//   32   54:aload           4
				//   33   56:ldc1            #63  <String ". Not logging in-app purchase to Appboy.">
				//   34   58:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
				//   35   61:pop             
					s3 = s4;
				//   36   62:aload_2         
				//   37   63:astore_1        
					try
					{
						AppboyLogger.w(((String) (obj)), stringbuilder.toString());
				//   38   64:aload_3         
				//   39   65:aload           4
				//   40   67:invokevirtual   #66  <Method String StringBuilder.toString()>
				//   41   70:invokestatic    #72  <Method int AppboyLogger.w(String, String)>
				//   42   73:pop             
						return;
				//   43   74:return          
					}
				//*  44   75:aload_2         
				//*  45   76:astore_1        
				//*  46   77:aload_3         
				//*  47   78:invokevirtual   #77  <Method String String.trim()>
				//*  48   81:getstatic       #83  <Field Locale Locale.US>
				//*  49   84:invokevirtual   #87  <Method String String.toUpperCase(Locale)>
				//*  50   87:astore_3        
				//*  51   88:aload_2         
				//*  52   89:astore_1        
				//*  53   90:aload_2         
				//*  54   91:aload_3         
				//*  55   92:aload_0         
				//*  56   93:getfield        #32  <Field BigDecimal c>
				//*  57   96:aload_0         
				//*  58   97:getfield        #34  <Field int d>
				//*  59  100:aload_0         
				//*  60  101:getfield        #26  <Field Appboy f>
				//*  61  104:getfield        #90  <Field dh Appboy.f>
				//*  62  107:invokestatic    #58  <Method Set Appboy.e()>
				//*  63  110:invokestatic    #96  <Method boolean ValidationUtils.isValidLogPurchaseInput(String, String, BigDecimal, int, dh, Set)>
				//*  64  113:ifne            128
				//*  65  116:aload_2         
				//*  66  117:astore_1        
				//*  67  118:invokestatic    #46  <Method String Appboy.b()>
				//*  68  121:ldc1            #98  <String "Log purchase input was invalid. Not logging in-app purchase to Appboy.">
				//*  69  123:invokestatic    #72  <Method int AppboyLogger.w(String, String)>
				//*  70  126:pop             
				//*  71  127:return          
				//*  72  128:aload_2         
				//*  73  129:astore_1        
				//*  74  130:aload_2         
				//*  75  131:invokestatic    #102 <Method String ValidationUtils.ensureAppboyFieldLength(String)>
				//*  76  134:astore_2        
				//*  77  135:aload_2         
				//*  78  136:astore_1        
				//*  79  137:aload_2         
				//*  80  138:aload_3         
				//*  81  139:aload_0         
				//*  82  140:getfield        #32  <Field BigDecimal c>
				//*  83  143:aload_0         
				//*  84  144:getfield        #34  <Field int d>
				//*  85  147:aload_0         
				//*  86  148:getfield        #36  <Field AppboyProperties e>
				//*  87  151:invokestatic    #107 <Method cc cc.a(String, String, BigDecimal, int, AppboyProperties)>
				//*  88  154:astore_3        
				//*  89  155:aload_2         
				//*  90  156:astore_1        
				//*  91  157:aload_0         
				//*  92  158:getfield        #26  <Field Appboy f>
				//*  93  161:getfield        #111 <Field bf Appboy.g>
				//*  94  164:aload_3         
				//*  95  165:invokevirtual   #116 <Method boolean bf.a(bo.app.bu)>
				//*  96  168:ifeq            245
				//*  97  171:aload_2         
				//*  98  172:astore_1        
				//*  99  173:aload_0         
				//* 100  174:getfield        #26  <Field Appboy f>
				//* 101  177:getfield        #119 <Field fp Appboy.d>
				//* 102  180:new             #121 <Class ff>
				//* 103  183:dup             
				//* 104  184:aload_2         
				//* 105  185:aload_0         
				//* 106  186:getfield        #36  <Field AppboyProperties e>
				//* 107  189:aload_3         
				//* 108  190:invokespecial   #124 <Method void ff(String, AppboyProperties, bo.app.bu)>
				//* 109  193:invokevirtual   #129 <Method void fp.a(bo.app.fb)>
				//* 110  196:return          
					catch(Exception exception)
				//* 111  197:astore_2        
					{
						String s5 = Appboy.b();
				//  112  198:invokestatic    #46  <Method String Appboy.b()>
				//  113  201:astore_3        
						StringBuilder stringbuilder1 = new StringBuilder();
				//  114  202:new             #48  <Class StringBuilder>
				//  115  205:dup             
				//  116  206:invokespecial   #49  <Method void StringBuilder()>
				//  117  209:astore          4
						stringbuilder1.append("Failed to log purchase event of ");
				//  118  211:aload           4
				//  119  213:ldc1            #131 <String "Failed to log purchase event of ">
				//  120  215:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
				//  121  218:pop             
						stringbuilder1.append(s3);
				//  122  219:aload           4
				//  123  221:aload_1         
				//  124  222:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
				//  125  225:pop             
						AppboyLogger.w(s5, stringbuilder1.toString(), ((Throwable) (exception)));
				//  126  226:aload_3         
				//  127  227:aload           4
				//  128  229:invokevirtual   #66  <Method String StringBuilder.toString()>
				//  129  232:aload_2         
				//  130  233:invokestatic    #134 <Method int AppboyLogger.w(String, String, Throwable)>
				//  131  236:pop             
						Appboy.a(f, ((Throwable) (exception)));
				//  132  237:aload_0         
				//  133  238:getfield        #26  <Field Appboy f>
				//  134  241:aload_2         
				//  135  242:invokestatic    #137 <Method void Appboy.a(Appboy, Throwable)>
					}
					break MISSING_BLOCK_LABEL_245;
					s3 = s4;
					obj = ((Object) (((String) (obj)).trim().toUpperCase(Locale.US)));
					s3 = s4;
					if(ValidationUtils.isValidLogPurchaseInput(s4, ((String) (obj)), c, d, f.f, Appboy.e()))
						break MISSING_BLOCK_LABEL_128;
					s3 = s4;
					AppboyLogger.w(Appboy.b(), "Log purchase input was invalid. Not logging in-app purchase to Appboy.");
					return;
					s3 = s4;
					s4 = ValidationUtils.ensureAppboyFieldLength(s4);
					s3 = s4;
					obj = ((Object) (cc.a(s4, ((String) (obj)), c, d, e)));
					s3 = s4;
					if(!f.g.a(((bo.app.bu) (obj))))
						break MISSING_BLOCK_LABEL_245;
					s3 = s4;
					f.d.a(((bo.app.fb) (new ff(s4, e, ((bo.app.bu) (obj))))));
					return;
				//  136  245:return          
				}

				final String a;
				final String b;
				final BigDecimal c;
				final int d;
				final AppboyProperties e;
				final Appboy f;

			
			{
				f = Appboy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field Appboy f>
				a = s1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field String a>
				b = s2;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field String b>
				c = bigdecimal;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #32  <Field BigDecimal c>
				d = i1;
			//   12   21:aload_0         
			//   13   22:iload           5
			//   14   24:putfield        #34  <Field int d>
				e = appboyproperties;
			//   15   27:aload_0         
			//   16   28:aload           6
			//   17   30:putfield        #36  <Field AppboyProperties e>
				super();
			//   18   33:aload_0         
			//   19   34:invokespecial   #39  <Method void Object()>
			//   20   37:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #710 <Field at j>
	//    5   11:new             #56  <Class Appboy$30>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:aload_3         
	//   11   19:iload           4
	//   12   21:aload           5
	//   13   23:invokespecial   #1161 <Method void Appboy$30(Appboy, String, String, BigDecimal, int, AppboyProperties)>
	//   14   26:invokevirtual   #715 <Method Future at.submit(Runnable)>
	//   15   29:pop             
			return;
	//   16   30:return          
		}
	}

	public void logPurchase(String s1, String s2, BigDecimal bigdecimal, AppboyProperties appboyproperties)
	{
		logPurchase(s1, s2, bigdecimal, 1, appboyproperties);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_1        
	//    5    5:aload           4
	//    6    7:invokevirtual   #1158 <Method void logPurchase(String, String, BigDecimal, int, AppboyProperties)>
	//    7   10:return          
	}

	public void logPushDeliveryEvent(String s1)
	{
		j.submit(new Runnable(s1) {

			public void run()
			{
				try
				{
					if(StringUtils.isNullOrBlank(a))
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field String a>
			//*   2    4:invokestatic    #34  <Method boolean StringUtils.isNullOrBlank(String)>
			//*   3    7:ifeq            20
					{
						AppboyLogger.w(Appboy.b(), "Campaign ID cannot be null or blank for push delivery event.");
			//    4   10:invokestatic    #37  <Method String Appboy.b()>
			//    5   13:ldc1            #39  <String "Campaign ID cannot be null or blank for push delivery event.">
			//    6   15:invokestatic    #45  <Method int AppboyLogger.w(String, String)>
			//    7   18:pop             
						return;
			//    8   19:return          
					}
				}
			//*   9   20:aload_0         
			//*  10   21:getfield        #19  <Field Appboy b>
			//*  11   24:getfield        #49  <Field bf Appboy.g>
			//*  12   27:aload_0         
			//*  13   28:getfield        #21  <Field String a>
			//*  14   31:invokestatic    #55  <Method cc cc.f(String)>
			//*  15   34:invokevirtual   #60  <Method boolean bf.a(bo.app.bu)>
			//*  16   37:pop             
			//*  17   38:return          
				catch(Exception exception)
			//*  18   39:astore_1        
				{
					AppboyLogger.w(Appboy.b(), "Failed to log push delivery event.", ((Throwable) (exception)));
			//   19   40:invokestatic    #37  <Method String Appboy.b()>
			//   20   43:ldc1            #62  <String "Failed to log push delivery event.">
			//   21   45:aload_1         
			//   22   46:invokestatic    #65  <Method int AppboyLogger.w(String, String, Throwable)>
			//   23   49:pop             
					Appboy.a(b, ((Throwable) (exception)));
			//   24   50:aload_0         
			//   25   51:getfield        #19  <Field Appboy b>
			//   26   54:aload_1         
			//   27   55:invokestatic    #68  <Method void Appboy.a(Appboy, Throwable)>
					return;
			//   28   58:return          
				}
				b.g.a(((bo.app.bu) (cc.f(a))));
				return;
			}

			final String a;
			final Appboy b;

			
			{
				b = Appboy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field Appboy b>
				a = s1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #710 <Field at j>
	//    2    4:new             #58  <Class Appboy$4>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #1164 <Method void Appboy$4(Appboy, String)>
	//    7   13:invokevirtual   #715 <Method Future at.submit(Runnable)>
	//    8   16:pop             
	//    9   17:return          
	}

	public void logPushNotificationActionClicked(String s1, String s2)
	{
		if(h())
	//*   0    0:invokestatic    #1085 <Method boolean h()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			j.submit(new Runnable(s1, s2) {

				public void run()
				{
					try
					{
						if(StringUtils.isNullOrBlank(a))
				//*   0    0:aload_0         
				//*   1    1:getfield        #22  <Field String a>
				//*   2    4:invokestatic    #37  <Method boolean StringUtils.isNullOrBlank(String)>
				//*   3    7:ifeq            20
						{
							AppboyLogger.w(Appboy.b(), "Campaign ID cannot be null or blank. Not logging push notification action clicked.");
				//    4   10:invokestatic    #40  <Method String Appboy.b()>
				//    5   13:ldc1            #42  <String "Campaign ID cannot be null or blank. Not logging push notification action clicked.">
				//    6   15:invokestatic    #48  <Method int AppboyLogger.w(String, String)>
				//    7   18:pop             
							return;
				//    8   19:return          
						}
					}
				//*   9   20:aload_0         
				//*  10   21:getfield        #24  <Field String b>
				//*  11   24:invokestatic    #37  <Method boolean StringUtils.isNullOrBlank(String)>
				//*  12   27:ifeq            40
				//*  13   30:invokestatic    #40  <Method String Appboy.b()>
				//*  14   33:ldc1            #50  <String "Action ID cannot be null or blank">
				//*  15   35:invokestatic    #48  <Method int AppboyLogger.w(String, String)>
				//*  16   38:pop             
				//*  17   39:return          
				//*  18   40:aload_0         
				//*  19   41:getfield        #20  <Field Appboy c>
				//*  20   44:getfield        #54  <Field bf Appboy.g>
				//*  21   47:aload_0         
				//*  22   48:getfield        #22  <Field String a>
				//*  23   51:aload_0         
				//*  24   52:getfield        #24  <Field String b>
				//*  25   55:invokestatic    #59  <Method cc cc.c(String, String)>
				//*  26   58:invokevirtual   #64  <Method boolean bf.a(bo.app.bu)>
				//*  27   61:pop             
				//*  28   62:return          
					catch(Exception exception)
				//*  29   63:astore_1        
					{
						AppboyLogger.w(Appboy.b(), "Failed to log push notification action clicked.", ((Throwable) (exception)));
				//   30   64:invokestatic    #40  <Method String Appboy.b()>
				//   31   67:ldc1            #66  <String "Failed to log push notification action clicked.">
				//   32   69:aload_1         
				//   33   70:invokestatic    #69  <Method int AppboyLogger.w(String, String, Throwable)>
				//   34   73:pop             
						Appboy.a(c, ((Throwable) (exception)));
				//   35   74:aload_0         
				//   36   75:getfield        #20  <Field Appboy c>
				//   37   78:aload_1         
				//   38   79:invokestatic    #72  <Method void Appboy.a(Appboy, Throwable)>
						return;
				//   39   82:return          
					}
					if(StringUtils.isNullOrBlank(b))
					{
						AppboyLogger.w(Appboy.b(), "Action ID cannot be null or blank");
						return;
					}
					c.g.a(((bo.app.bu) (cc.c(a, b))));
					return;
				}

				final String a;
				final String b;
				final Appboy c;

			
			{
				c = Appboy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field Appboy c>
				a = s1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field String a>
				b = s2;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field String b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #710 <Field at j>
	//    5   11:new             #60  <Class Appboy$5>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokespecial   #1168 <Method void Appboy$5(Appboy, String, String)>
	//   11   21:invokevirtual   #715 <Method Future at.submit(Runnable)>
	//   12   24:pop             
			return;
	//   13   25:return          
		}
	}

	public void logPushNotificationOpened(Intent intent)
	{
		if(h())
	//*   0    0:invokestatic    #1085 <Method boolean h()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			j.submit(new Runnable(intent) {

				public void run()
				{
					String s1 = a.getStringExtra("cid");
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field Intent a>
				//    2    4:ldc1            #30  <String "cid">
				//    3    6:invokevirtual   #36  <Method String Intent.getStringExtra(String)>
				//    4    9:astore_1        
					if(!StringUtils.isNullOrBlank(s1))
				//*   5   10:aload_1         
				//*   6   11:invokestatic    #42  <Method boolean StringUtils.isNullOrBlank(String)>
				//*   7   14:ifne            62
					{
						String s2 = Appboy.b();
				//    8   17:invokestatic    #45  <Method String Appboy.b()>
				//    9   20:astore_2        
						StringBuilder stringbuilder = new StringBuilder();
				//   10   21:new             #47  <Class StringBuilder>
				//   11   24:dup             
				//   12   25:invokespecial   #48  <Method void StringBuilder()>
				//   13   28:astore_3        
						stringbuilder.append("Logging push click to Appboy. Campaign Id: ");
				//   14   29:aload_3         
				//   15   30:ldc1            #50  <String "Logging push click to Appboy. Campaign Id: ">
				//   16   32:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
				//   17   35:pop             
						stringbuilder.append(s1);
				//   18   36:aload_3         
				//   19   37:aload_1         
				//   20   38:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
				//   21   41:pop             
						AppboyLogger.i(s2, stringbuilder.toString());
				//   22   42:aload_2         
				//   23   43:aload_3         
				//   24   44:invokevirtual   #57  <Method String StringBuilder.toString()>
				//   25   47:invokestatic    #63  <Method int AppboyLogger.i(String, String)>
				//   26   50:pop             
						b.logPushNotificationOpened(s1);
				//   27   51:aload_0         
				//   28   52:getfield        #19  <Field Appboy b>
				//   29   55:aload_1         
				//   30   56:invokevirtual   #66  <Method void Appboy.logPushNotificationOpened(String)>
						break MISSING_BLOCK_LABEL_71;
				//   31   59:goto            71
					}
					AppboyLogger.i(Appboy.b(), "No campaign Id associated with this notification. Not logging push click to Appboy.");
				//   32   62:invokestatic    #45  <Method String Appboy.b()>
				//   33   65:ldc1            #68  <String "No campaign Id associated with this notification. Not logging push click to Appboy.">
				//   34   67:invokestatic    #63  <Method int AppboyLogger.i(String, String)>
				//   35   70:pop             
					if(a.hasExtra("ab_push_fetch_test_triggers_key") && a.getStringExtra("ab_push_fetch_test_triggers_key").equals("true"))
				//*  36   71:aload_0         
				//*  37   72:getfield        #21  <Field Intent a>
				//*  38   75:ldc1            #70  <String "ab_push_fetch_test_triggers_key">
				//*  39   77:invokevirtual   #73  <Method boolean Intent.hasExtra(String)>
				//*  40   80:ifeq            141
				//*  41   83:aload_0         
				//*  42   84:getfield        #21  <Field Intent a>
				//*  43   87:ldc1            #70  <String "ab_push_fetch_test_triggers_key">
				//*  44   89:invokevirtual   #36  <Method String Intent.getStringExtra(String)>
				//*  45   92:ldc1            #75  <String "true">
				//*  46   94:invokevirtual   #81  <Method boolean String.equals(Object)>
				//*  47   97:ifeq            141
					{
						AppboyLogger.i(Appboy.b(), "Push contained key for fetching test triggers, fetching triggers.");
				//   48  100:invokestatic    #45  <Method String Appboy.b()>
				//   49  103:ldc1            #83  <String "Push contained key for fetching test triggers, fetching triggers.">
				//   50  105:invokestatic    #63  <Method int AppboyLogger.i(String, String)>
				//   51  108:pop             
						b.g.a((new bo.app.cg.a()).b());
				//   52  109:aload_0         
				//   53  110:getfield        #19  <Field Appboy b>
				//   54  113:getfield        #87  <Field bf Appboy.g>
				//   55  116:new             #89  <Class bo.app.cg$a>
				//   56  119:dup             
				//   57  120:invokespecial   #90  <Method void bo.app.cg$a()>
				//   58  123:invokevirtual   #93  <Method bo.app.cg$a bo.app.cg$a.b()>
				//   59  126:invokevirtual   #98  <Method void bf.a(bo.app.cg$a)>
						return;
				//   60  129:return          
					}
					break MISSING_BLOCK_LABEL_141;
					Exception exception;
					exception;
				//   61  130:astore_1        
					AppboyLogger.w(Appboy.b(), "Error logging push notification", ((Throwable) (exception)));
				//   62  131:invokestatic    #45  <Method String Appboy.b()>
				//   63  134:ldc1            #100 <String "Error logging push notification">
				//   64  136:aload_1         
				//   65  137:invokestatic    #104 <Method int AppboyLogger.w(String, String, Throwable)>
				//   66  140:pop             
				//   67  141:return          
				}

				final Intent a;
				final Appboy b;

			
			{
				b = Appboy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field Appboy b>
				a = intent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Intent a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #710 <Field at j>
	//    5   11:new             #54  <Class Appboy$3>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #1173 <Method void Appboy$3(Appboy, Intent)>
	//   10   20:invokevirtual   #715 <Method Future at.submit(Runnable)>
	//   11   23:pop             
			return;
	//   12   24:return          
		}
	}

	public void logPushNotificationOpened(String s1)
	{
		if(h())
	//*   0    0:invokestatic    #1085 <Method boolean h()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			j.submit(new Runnable(s1) {

				public void run()
				{
					try
					{
						if(StringUtils.isNullOrBlank(a))
				//*   0    0:aload_0         
				//*   1    1:getfield        #21  <Field String a>
				//*   2    4:invokestatic    #34  <Method boolean StringUtils.isNullOrBlank(String)>
				//*   3    7:ifeq            20
						{
							AppboyLogger.w(Appboy.b(), "Campaign ID cannot be null or blank. Not logging push notification opened.");
				//    4   10:invokestatic    #37  <Method String Appboy.b()>
				//    5   13:ldc1            #39  <String "Campaign ID cannot be null or blank. Not logging push notification opened.">
				//    6   15:invokestatic    #45  <Method int AppboyLogger.w(String, String)>
				//    7   18:pop             
							return;
				//    8   19:return          
						}
					}
				//*   9   20:aload_0         
				//*  10   21:getfield        #19  <Field Appboy b>
				//*  11   24:getfield        #49  <Field bf Appboy.g>
				//*  12   27:aload_0         
				//*  13   28:getfield        #21  <Field String a>
				//*  14   31:invokestatic    #54  <Method cc cc.b(String)>
				//*  15   34:invokevirtual   #59  <Method boolean bf.a(bo.app.bu)>
				//*  16   37:pop             
				//*  17   38:return          
					catch(Exception exception)
				//*  18   39:astore_1        
					{
						AppboyLogger.w(Appboy.b(), "Failed to log opened push.", ((Throwable) (exception)));
				//   19   40:invokestatic    #37  <Method String Appboy.b()>
				//   20   43:ldc1            #61  <String "Failed to log opened push.">
				//   21   45:aload_1         
				//   22   46:invokestatic    #64  <Method int AppboyLogger.w(String, String, Throwable)>
				//   23   49:pop             
						Appboy.a(b, ((Throwable) (exception)));
				//   24   50:aload_0         
				//   25   51:getfield        #19  <Field Appboy b>
				//   26   54:aload_1         
				//   27   55:invokestatic    #67  <Method void Appboy.a(Appboy, Throwable)>
						return;
				//   28   58:return          
					}
					b.g.a(((bo.app.bu) (cc.b(a))));
					return;
				}

				final String a;
				final Appboy b;

			
			{
				b = Appboy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field Appboy b>
				a = s1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #710 <Field at j>
	//    5   11:new             #32  <Class Appboy$2>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #1174 <Method void Appboy$2(Appboy, String)>
	//   10   20:invokevirtual   #715 <Method Future at.submit(Runnable)>
	//   11   23:pop             
			return;
	//   12   24:return          
		}
	}

	public void logPushStoryPageClicked(String s1, String s2)
	{
		if(h())
	//*   0    0:invokestatic    #1085 <Method boolean h()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			j.submit(new Runnable(s1, s2) {

				public void run()
				{
					try
					{
						if(!ValidationUtils.isValidPushStoryClickInput(a, b))
				//*   0    0:aload_0         
				//*   1    1:getfield        #22  <Field String a>
				//*   2    4:aload_0         
				//*   3    5:getfield        #24  <Field String b>
				//*   4    8:invokestatic    #37  <Method boolean ValidationUtils.isValidPushStoryClickInput(String, String)>
				//*   5   11:ifne            24
						{
							AppboyLogger.w(Appboy.b(), "Push story page click input was invalid. Not logging in-app purchase to Appboy.");
				//    6   14:invokestatic    #40  <Method String Appboy.b()>
				//    7   17:ldc1            #42  <String "Push story page click input was invalid. Not logging in-app purchase to Appboy.">
				//    8   19:invokestatic    #48  <Method int AppboyLogger.w(String, String)>
				//    9   22:pop             
							return;
				//   10   23:return          
						}
					}
				//*  11   24:aload_0         
				//*  12   25:getfield        #20  <Field Appboy c>
				//*  13   28:getfield        #52  <Field bf Appboy.g>
				//*  14   31:aload_0         
				//*  15   32:getfield        #22  <Field String a>
				//*  16   35:aload_0         
				//*  17   36:getfield        #24  <Field String b>
				//*  18   39:invokestatic    #57  <Method cc cc.b(String, String)>
				//*  19   42:invokevirtual   #62  <Method boolean bf.a(bo.app.bu)>
				//*  20   45:pop             
				//*  21   46:return          
					catch(Exception exception)
				//*  22   47:astore_1        
					{
						String s3 = Appboy.b();
				//   23   48:invokestatic    #40  <Method String Appboy.b()>
				//   24   51:astore_2        
						StringBuilder stringbuilder = new StringBuilder();
				//   25   52:new             #64  <Class StringBuilder>
				//   26   55:dup             
				//   27   56:invokespecial   #65  <Method void StringBuilder()>
				//   28   59:astore_3        
						stringbuilder.append("Failed to log push story page clicked for page id: ");
				//   29   60:aload_3         
				//   30   61:ldc1            #67  <String "Failed to log push story page clicked for page id: ">
				//   31   63:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
				//   32   66:pop             
						stringbuilder.append(b);
				//   33   67:aload_3         
				//   34   68:aload_0         
				//   35   69:getfield        #24  <Field String b>
				//   36   72:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
				//   37   75:pop             
						stringbuilder.append(" cid: ");
				//   38   76:aload_3         
				//   39   77:ldc1            #73  <String " cid: ">
				//   40   79:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
				//   41   82:pop             
						stringbuilder.append(a);
				//   42   83:aload_3         
				//   43   84:aload_0         
				//   44   85:getfield        #22  <Field String a>
				//   45   88:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
				//   46   91:pop             
						AppboyLogger.w(s3, stringbuilder.toString(), ((Throwable) (exception)));
				//   47   92:aload_2         
				//   48   93:aload_3         
				//   49   94:invokevirtual   #76  <Method String StringBuilder.toString()>
				//   50   97:aload_1         
				//   51   98:invokestatic    #79  <Method int AppboyLogger.w(String, String, Throwable)>
				//   52  101:pop             
						Appboy.a(c, ((Throwable) (exception)));
				//   53  102:aload_0         
				//   54  103:getfield        #20  <Field Appboy c>
				//   55  106:aload_1         
				//   56  107:invokestatic    #82  <Method void Appboy.a(Appboy, Throwable)>
						return;
				//   57  110:return          
					}
					c.g.a(((bo.app.bu) (cc.b(a, b))));
					return;
				}

				final String a;
				final String b;
				final Appboy c;

			
			{
				c = Appboy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field Appboy c>
				a = s1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field String a>
				b = s2;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field String b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #710 <Field at j>
	//    5   11:new             #62  <Class Appboy$6>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokespecial   #1176 <Method void Appboy$6(Appboy, String, String)>
	//   11   21:invokevirtual   #715 <Method Future at.submit(Runnable)>
	//   12   24:pop             
			return;
	//   13   25:return          
		}
	}

	public void openSession(Activity activity)
	{
		if(h())
	//*   0    0:invokestatic    #1085 <Method boolean h()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			j.submit(new Runnable(activity) {

				public void run()
				{
					try
					{
						if(a == null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #21  <Field Activity a>
				//*   2    4:ifnonnull       17
						{
							AppboyLogger.w(Appboy.b(), "Cannot open session with null activity.");
				//    3    7:invokestatic    #31  <Method String Appboy.b()>
				//    4   10:ldc1            #33  <String "Cannot open session with null activity.">
				//    5   12:invokestatic    #39  <Method int AppboyLogger.w(String, String)>
				//    6   15:pop             
							return;
				//    7   16:return          
						}
					}
				//*   8   17:aload_0         
				//*   9   18:getfield        #19  <Field Appboy b>
				//*  10   21:getfield        #43  <Field bf Appboy.g>
				//*  11   24:aload_0         
				//*  12   25:getfield        #21  <Field Activity a>
				//*  13   28:invokevirtual   #48  <Method by bf.a(Activity)>
				//*  14   31:pop             
				//*  15   32:return          
					catch(Exception exception)
				//*  16   33:astore_1        
					{
						AppboyLogger.e(Appboy.b(), "Failed to open session.", ((Throwable) (exception)));
				//   17   34:invokestatic    #31  <Method String Appboy.b()>
				//   18   37:ldc1            #50  <String "Failed to open session.">
				//   19   39:aload_1         
				//   20   40:invokestatic    #54  <Method int AppboyLogger.e(String, String, Throwable)>
				//   21   43:pop             
						Appboy.a(b, ((Throwable) (exception)));
				//   22   44:aload_0         
				//   23   45:getfield        #19  <Field Appboy b>
				//   24   48:aload_1         
				//   25   49:invokestatic    #57  <Method void Appboy.a(Appboy, Throwable)>
						return;
				//   26   52:return          
					}
					b.g.a(a);
					return;
				}

				final Activity a;
				final Appboy b;

			
			{
				b = Appboy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field Appboy b>
				a = activity;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Activity a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #710 <Field at j>
	//    5   11:new             #46  <Class Appboy$26>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #1178 <Method void Appboy$26(Appboy, Activity)>
	//   10   20:invokevirtual   #715 <Method Future at.submit(Runnable)>
	//   11   23:pop             
			return;
	//   12   24:return          
		}
	}

	public void registerAppboyPushMessages(String s1)
	{
		if(h())
	//*   0    0:invokestatic    #1085 <Method boolean h()>
	//*   1    3:ifeq            7
			return;
	//    2    6:return          
		if(StringUtils.isNullOrBlank(s1))
	//*   3    7:aload_1         
	//*   4    8:invokestatic    #655 <Method boolean StringUtils.isNullOrBlank(String)>
	//*   5   11:ifeq            25
		{
			AppboyLogger.w(k, "Push registration ID must not be null or blank. Not registering for push messages from Appboy.");
	//    6   14:getstatic       #142 <Field String k>
	//    7   17:ldc2            #1181 <String "Push registration ID must not be null or blank. Not registering for push messages from Appboy.">
	//    8   20:invokestatic    #880 <Method int AppboyLogger.w(String, String)>
	//    9   23:pop             
			return;
	//   10   24:return          
		}
		try
		{
			String s2 = k;
	//   11   25:getstatic       #142 <Field String k>
	//   12   28:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   13   29:new             #583 <Class StringBuilder>
	//   14   32:dup             
	//   15   33:invokespecial   #584 <Method void StringBuilder()>
	//   16   36:astore_3        
			stringbuilder.append("Push token ");
	//   17   37:aload_3         
	//   18   38:ldc2            #1183 <String "Push token ">
	//   19   41:invokevirtual   #590 <Method StringBuilder StringBuilder.append(String)>
	//   20   44:pop             
			stringbuilder.append(s1);
	//   21   45:aload_3         
	//   22   46:aload_1         
	//   23   47:invokevirtual   #590 <Method StringBuilder StringBuilder.append(String)>
	//   24   50:pop             
			stringbuilder.append(" registered and immediately being flushed.");
	//   25   51:aload_3         
	//   26   52:ldc2            #1185 <String " registered and immediately being flushed.">
	//   27   55:invokevirtual   #590 <Method StringBuilder StringBuilder.append(String)>
	//   28   58:pop             
			AppboyLogger.i(s2, stringbuilder.toString());
	//   29   59:aload_2         
	//   30   60:aload_3         
	//   31   61:invokevirtual   #594 <Method String StringBuilder.toString()>
	//   32   64:invokestatic    #596 <Method int AppboyLogger.i(String, String)>
	//   33   67:pop             
			i.a(s1);
	//   34   68:aload_0         
	//   35   69:getfield        #684 <Field bp i>
	//   36   72:aload_1         
	//   37   73:invokeinterface #1186 <Method void bp.a(String)>
			requestImmediateDataFlush();
	//   38   78:aload_0         
	//   39   79:invokevirtual   #1189 <Method void requestImmediateDataFlush()>
			return;
	//   40   82:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s1)
	//*  41   83:astore_1        
		{
			AppboyLogger.w(k, "Failed to set the registration ID.", ((Throwable) (s1)));
	//   42   84:getstatic       #142 <Field String k>
	//   43   87:ldc2            #1191 <String "Failed to set the registration ID.">
	//   44   90:aload_1         
	//   45   91:invokestatic    #990 <Method int AppboyLogger.w(String, String, Throwable)>
	//   46   94:pop             
		}
		a(((Throwable) (s1)));
	//   47   95:aload_0         
	//   48   96:aload_1         
	//   49   97:invokespecial   #836 <Method void a(Throwable)>
		return;
	//   50  100:return          
	}

	public void removeSingleSubscription(IEventSubscriber ieventsubscriber, Class class1)
	{
		try
		{
			q.b(ieventsubscriber, class1);
	//    0    0:aload_0         
	//    1    1:getfield        #677 <Field z q>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #1196 <Method boolean z.b(IEventSubscriber, Class)>
	//    5    9:pop             
			return;
	//    6   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(IEventSubscriber ieventsubscriber)
	//*   7   11:astore_1        
		{
			String s1 = k;
	//    8   12:getstatic       #142 <Field String k>
	//    9   15:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   10   16:new             #583 <Class StringBuilder>
	//   11   19:dup             
	//   12   20:invokespecial   #584 <Method void StringBuilder()>
	//   13   23:astore          4
			stringbuilder.append("Failed to remove ");
	//   14   25:aload           4
	//   15   27:ldc2            #1198 <String "Failed to remove ">
	//   16   30:invokevirtual   #590 <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
			stringbuilder.append(class1.getName());
	//   18   34:aload           4
	//   19   36:aload_2         
	//   20   37:invokevirtual   #1203 <Method String Class.getName()>
	//   21   40:invokevirtual   #590 <Method StringBuilder StringBuilder.append(String)>
	//   22   43:pop             
			stringbuilder.append(" subscriber.");
	//   23   44:aload           4
	//   24   46:ldc2            #1205 <String " subscriber.">
	//   25   49:invokevirtual   #590 <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
			AppboyLogger.w(s1, stringbuilder.toString(), ((Throwable) (ieventsubscriber)));
	//   27   53:aload_3         
	//   28   54:aload           4
	//   29   56:invokevirtual   #594 <Method String StringBuilder.toString()>
	//   30   59:aload_1         
	//   31   60:invokestatic    #990 <Method int AppboyLogger.w(String, String, Throwable)>
	//   32   63:pop             
			a(((Throwable) (ieventsubscriber)));
	//   33   64:aload_0         
	//   34   65:aload_1         
	//   35   66:invokespecial   #836 <Method void a(Throwable)>
			return;
	//   36   69:return          
		}
	}

	public void requestFeedRefresh()
	{
		if(h())
	//*   0    0:invokestatic    #1085 <Method boolean h()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			j.submit(new Runnable() {

				public void run()
				{
					try
					{
						a.g.a((new bo.app.cg.a()).a());
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field Appboy a>
				//    2    4:getfield        #27  <Field bf Appboy.g>
				//    3    7:new             #29  <Class bo.app.cg$a>
				//    4   10:dup             
				//    5   11:invokespecial   #30  <Method void bo.app.cg$a()>
				//    6   14:invokevirtual   #33  <Method bo.app.cg$a bo.app.cg$a.a()>
				//    7   17:invokevirtual   #38  <Method void bf.a(bo.app.cg$a)>
						return;
				//    8   20:return          
					}
					catch(Exception exception)
				//*   9   21:astore_1        
					{
						AppboyLogger.w(Appboy.b(), "Failed to request refresh of feed.", ((Throwable) (exception)));
				//   10   22:invokestatic    #42  <Method String Appboy.b()>
				//   11   25:ldc1            #44  <String "Failed to request refresh of feed.">
				//   12   27:aload_1         
				//   13   28:invokestatic    #50  <Method int AppboyLogger.w(String, String, Throwable)>
				//   14   31:pop             
						Appboy.a(a, ((Throwable) (exception)));
				//   15   32:aload_0         
				//   16   33:getfield        #17  <Field Appboy a>
				//   17   36:aload_1         
				//   18   37:invokestatic    #53  <Method void Appboy.a(Appboy, Throwable)>
						return;
				//   19   40:return          
					}
				}

				final Appboy a;

			
			{
				a = Appboy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field Appboy a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #710 <Field at j>
	//    5   11:new             #12  <Class Appboy$10>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:invokespecial   #1209 <Method void Appboy$10(Appboy)>
	//    9   19:invokevirtual   #715 <Method Future at.submit(Runnable)>
	//   10   22:pop             
			return;
	//   11   23:return          
		}
	}

	public void requestFeedRefreshFromCache()
	{
		if(h())
	//*   0    0:invokestatic    #1085 <Method boolean h()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			j.submit(new Runnable() {

				public void run()
				{
					try
					{
						Appboy.c(a).a(((Object) (a.c.a())), com/appboy/events/FeedUpdatedEvent);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field Appboy a>
				//    2    4:invokestatic    #27  <Method z Appboy.c(Appboy)>
				//    3    7:aload_0         
				//    4    8:getfield        #17  <Field Appboy a>
				//    5   11:getfield        #30  <Field dc Appboy.c>
				//    6   14:invokevirtual   #35  <Method FeedUpdatedEvent dc.a()>
				//    7   17:ldc1            #37  <Class FeedUpdatedEvent>
				//    8   19:invokevirtual   #42  <Method void z.a(Object, Class)>
						return;
				//    9   22:return          
					}
					catch(JSONException jsonexception)
				//*  10   23:astore_1        
					{
						AppboyLogger.w(Appboy.b(), "Failed to retrieve and publish feed from offline cache.", ((Throwable) (jsonexception)));
				//   11   24:invokestatic    #46  <Method String Appboy.b()>
				//   12   27:ldc1            #48  <String "Failed to retrieve and publish feed from offline cache.">
				//   13   29:aload_1         
				//   14   30:invokestatic    #54  <Method int AppboyLogger.w(String, String, Throwable)>
				//   15   33:pop             
					}
				//   16   34:return          
				}

				final Appboy a;

			
			{
				a = Appboy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field Appboy a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #710 <Field at j>
	//    5   11:new             #68  <Class Appboy$9>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:invokespecial   #1211 <Method void Appboy$9(Appboy)>
	//    9   19:invokevirtual   #715 <Method Future at.submit(Runnable)>
	//   10   22:pop             
			return;
	//   11   23:return          
		}
	}

	public void requestImmediateDataFlush()
	{
		if(h())
	//*   0    0:invokestatic    #1085 <Method boolean h()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			j.submit(new Runnable() {

				public void run()
				{
					try
					{
						a.g.d();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field Appboy a>
				//    2    4:getfield        #27  <Field bf Appboy.g>
				//    3    7:invokevirtual   #32  <Method void bf.d()>
						return;
				//    4   10:return          
					}
					catch(Exception exception)
				//*   5   11:astore_1        
					{
						AppboyLogger.w(Appboy.b(), "Failed to request data flush.", ((Throwable) (exception)));
				//    6   12:invokestatic    #36  <Method String Appboy.b()>
				//    7   15:ldc1            #38  <String "Failed to request data flush.">
				//    8   17:aload_1         
				//    9   18:invokestatic    #44  <Method int AppboyLogger.w(String, String, Throwable)>
				//   10   21:pop             
						Appboy.a(a, ((Throwable) (exception)));
				//   11   22:aload_0         
				//   12   23:getfield        #17  <Field Appboy a>
				//   13   26:aload_1         
				//   14   27:invokestatic    #47  <Method void Appboy.a(Appboy, Throwable)>
						return;
				//   15   30:return          
					}
				}

				final Appboy a;

			
			{
				a = Appboy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field Appboy a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #710 <Field at j>
	//    5   11:new             #14  <Class Appboy$11>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:invokespecial   #1212 <Method void Appboy$11(Appboy)>
	//    9   19:invokevirtual   #715 <Method Future at.submit(Runnable)>
	//   10   22:pop             
			return;
	//   11   23:return          
		}
	}

	public void setAppboyImageLoader(IAppboyImageLoader iappboyimageloader)
	{
		if(x == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #606 <Field IAppboyImageLoader x>
	//*   2    4:ifnonnull       18
		{
			AppboyLogger.w(k, "The Image Loader cannot be set to null. Doing nothing.");
	//    3    7:getstatic       #142 <Field String k>
	//    4   10:ldc2            #1216 <String "The Image Loader cannot be set to null. Doing nothing.">
	//    5   13:invokestatic    #880 <Method int AppboyLogger.w(String, String)>
	//    6   16:pop             
			return;
	//    7   17:return          
		} else
		{
			x = iappboyimageloader;
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:putfield        #606 <Field IAppboyImageLoader x>
			return;
	//   11   23:return          
		}
	}

	public void submitFeedback(String s1, String s2, boolean flag)
	{
		if(h())
	//*   0    0:invokestatic    #1085 <Method boolean h()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			j.submit(new Runnable(s1, s2, flag) {

				public void run()
				{
					try
					{
						d.g.a(a, b, c);
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field Appboy d>
				//    2    4:getfield        #39  <Field bf Appboy.g>
				//    3    7:aload_0         
				//    4    8:getfield        #24  <Field String a>
				//    5   11:aload_0         
				//    6   12:getfield        #26  <Field String b>
				//    7   15:aload_0         
				//    8   16:getfield        #28  <Field boolean c>
				//    9   19:invokevirtual   #43  <Method void bf.a(String, String, boolean)>
						return;
				//   10   22:return          
					}
					catch(Exception exception)
				//*  11   23:astore_1        
					{
						String s3 = Appboy.b();
				//   12   24:invokestatic    #46  <Method String Appboy.b()>
				//   13   27:astore_2        
						StringBuilder stringbuilder = new StringBuilder();
				//   14   28:new             #48  <Class StringBuilder>
				//   15   31:dup             
				//   16   32:invokespecial   #49  <Method void StringBuilder()>
				//   17   35:astore_3        
						stringbuilder.append("Failed to submit feedback: ");
				//   18   36:aload_3         
				//   19   37:ldc1            #51  <String "Failed to submit feedback: ">
				//   20   39:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
				//   21   42:pop             
						stringbuilder.append(b);
				//   22   43:aload_3         
				//   23   44:aload_0         
				//   24   45:getfield        #26  <Field String b>
				//   25   48:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
				//   26   51:pop             
						AppboyLogger.w(s3, stringbuilder.toString(), ((Throwable) (exception)));
				//   27   52:aload_2         
				//   28   53:aload_3         
				//   29   54:invokevirtual   #58  <Method String StringBuilder.toString()>
				//   30   57:aload_1         
				//   31   58:invokestatic    #64  <Method int AppboyLogger.w(String, String, Throwable)>
				//   32   61:pop             
						Appboy.a(d, ((Throwable) (exception)));
				//   33   62:aload_0         
				//   34   63:getfield        #22  <Field Appboy d>
				//   35   66:aload_1         
				//   36   67:invokestatic    #67  <Method void Appboy.a(Appboy, Throwable)>
						return;
				//   37   70:return          
					}
				}

				final String a;
				final String b;
				final boolean c;
				final Appboy d;

			
			{
				d = Appboy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field Appboy d>
				a = s1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field String a>
				b = s2;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field String b>
				c = flag;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #28  <Field boolean c>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #31  <Method void Object()>
			//   14   25:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #710 <Field at j>
	//    5   11:new             #50  <Class Appboy$28>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:iload_3         
	//   11   19:invokespecial   #1221 <Method void Appboy$28(Appboy, String, String, boolean)>
	//   12   22:invokevirtual   #715 <Method Future at.submit(Runnable)>
	//   13   25:pop             
			return;
	//   14   26:return          
		}
	}

	public void subscribeToFeedUpdates(IEventSubscriber ieventsubscriber)
	{
		try
		{
			q.a(ieventsubscriber, com/appboy/events/FeedUpdatedEvent);
	//    0    0:aload_0         
	//    1    1:getfield        #677 <Field z q>
	//    2    4:aload_1         
	//    3    5:ldc2            #1225 <Class FeedUpdatedEvent>
	//    4    8:invokevirtual   #1227 <Method boolean z.a(IEventSubscriber, Class)>
	//    5   11:pop             
			return;
	//    6   12:return          
		}
		// Misplaced declaration of an exception variable
		catch(IEventSubscriber ieventsubscriber)
	//*   7   13:astore_1        
		{
			AppboyLogger.w(k, "Failed to add subscriber for feed updates.", ((Throwable) (ieventsubscriber)));
	//    8   14:getstatic       #142 <Field String k>
	//    9   17:ldc2            #1229 <String "Failed to add subscriber for feed updates.">
	//   10   20:aload_1         
	//   11   21:invokestatic    #990 <Method int AppboyLogger.w(String, String, Throwable)>
	//   12   24:pop             
		}
		a(((Throwable) (ieventsubscriber)));
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokespecial   #836 <Method void a(Throwable)>
	//   16   30:return          
	}

	public void subscribeToFeedbackRequestEvents(IEventSubscriber ieventsubscriber, IEventSubscriber ieventsubscriber1)
	{
		if(ieventsubscriber == null)
			break MISSING_BLOCK_LABEL_19;
	//    0    0:aload_1         
	//    1    1:ifnull          19
		q.a(ieventsubscriber, com/appboy/events/SubmitFeedbackSucceeded);
	//    2    4:aload_0         
	//    3    5:getfield        #677 <Field z q>
	//    4    8:aload_1         
	//    5    9:ldc2            #1234 <Class SubmitFeedbackSucceeded>
	//    6   12:invokevirtual   #1227 <Method boolean z.a(IEventSubscriber, Class)>
	//    7   15:pop             
	//*   8   16:goto            19
		if(ieventsubscriber1 != null)
	//*   9   19:aload_2         
	//*  10   20:ifnull          52
		{
			try
			{
				q.a(ieventsubscriber1, com/appboy/events/SubmitFeedbackFailed);
	//   11   23:aload_0         
	//   12   24:getfield        #677 <Field z q>
	//   13   27:aload_2         
	//   14   28:ldc2            #1236 <Class SubmitFeedbackFailed>
	//   15   31:invokevirtual   #1227 <Method boolean z.a(IEventSubscriber, Class)>
	//   16   34:pop             
				return;
	//   17   35:return          
			}
	//*  18   36:getstatic       #142 <Field String k>
	//*  19   39:ldc2            #1238 <String "Failed to add subscribers for feedback request events.">
	//*  20   42:aload_1         
	//*  21   43:invokestatic    #990 <Method int AppboyLogger.w(String, String, Throwable)>
	//*  22   46:pop             
	//*  23   47:aload_0         
	//*  24   48:aload_1         
	//*  25   49:invokespecial   #836 <Method void a(Throwable)>
	//*  26   52:return          
			// Misplaced declaration of an exception variable
			catch(IEventSubscriber ieventsubscriber)
			{
				AppboyLogger.w(k, "Failed to add subscribers for feedback request events.", ((Throwable) (ieventsubscriber)));
			}
			a(((Throwable) (ieventsubscriber)));
		}
		return;
	//*  27   53:astore_1        
	//*  28   54:goto            36
	}

	public void subscribeToNewInAppMessages(IEventSubscriber ieventsubscriber)
	{
		try
		{
			q.a(ieventsubscriber, com/appboy/events/InAppMessageEvent);
	//    0    0:aload_0         
	//    1    1:getfield        #677 <Field z q>
	//    2    4:aload_1         
	//    3    5:ldc2            #1242 <Class InAppMessageEvent>
	//    4    8:invokevirtual   #1227 <Method boolean z.a(IEventSubscriber, Class)>
	//    5   11:pop             
			return;
	//    6   12:return          
		}
		// Misplaced declaration of an exception variable
		catch(IEventSubscriber ieventsubscriber)
	//*   7   13:astore_1        
		{
			AppboyLogger.w(k, "Failed to add subscriber to new in-app messages.", ((Throwable) (ieventsubscriber)));
	//    8   14:getstatic       #142 <Field String k>
	//    9   17:ldc2            #1244 <String "Failed to add subscriber to new in-app messages.">
	//   10   20:aload_1         
	//   11   21:invokestatic    #990 <Method int AppboyLogger.w(String, String, Throwable)>
	//   12   24:pop             
		}
		a(((Throwable) (ieventsubscriber)));
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokespecial   #836 <Method void a(Throwable)>
	//   16   30:return          
	}

	private static volatile IAppboyEndpointProvider A;
	private static volatile IAppboyNotificationFactory B;
	private static volatile boolean C = false;
	private static volatile boolean D = false;
	private static volatile boolean E = false;
	private static volatile dg F;
	private static final String k = AppboyLogger.getAppboyLogTag(com/appboy/Appboy);
	private static final Set l = new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
		"AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", 
		"BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL", 
		"BSD", "BTC", "BTN", "BWP", "BYR", "BZD", "CAD", "CDF", "CHF", "CLF", 
		"CLP", "CNY", "COP", "CRC", "CUC", "CUP", "CVE", "CZK", "DJF", "DKK", 
		"DOP", "DZD", "EEK", "EGP", "ERN", "ETB", "EUR", "FJD", "FKP", "GBP", 
		"GEL", "GGP", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", 
		"HRK", "HTG", "HUF", "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", 
		"JEP", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF", "KPW", "KRW", 
		"KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LRD", "LSL", "LTL", "LVL", 
		"LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRO", "MTL", 
		"MUR", "MVR", "MWK", "MXN", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", 
		"NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG", 
		"QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SDG", "SEK", 
		"SGD", "SHP", "SLL", "SOS", "SRD", "STD", "SVC", "SYP", "SZL", "THB", 
		"TJS", "TMT", "TND", "TOP", "TRY", "TTD", "TWD", "TZS", "UAH", "UGX", 
		"USD", "UYU", "UZS", "VEF", "VND", "VUV", "WST", "XAF", "XAG", "XAU", 
		"XCD", "XDR", "XOF", "XPD", "XPF", "XPT", "YER", "ZAR", "ZMK", "ZMW", 
		"ZWL"
	}))))));
	private static final Set m = new HashSet(((java.util.Collection) (Collections.singletonList("calypso appcrawler"))));
	private static final Set n = new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
		"android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET"
	}))))));
	private static volatile Appboy o = null;
	private static final Object z = new Object();
	volatile aa a;
	volatile ea b;
	volatile dc c;
	volatile fp d;
	volatile bc e;
	volatile dh f;
	volatile bf g;
	final AppboyConfigurationProvider h;
	final bp i;
	final at j;
	private final Context p;
	private final z q;
	private final br r = new br();
	private volatile AppboyUser s;
	private volatile ThreadPoolExecutor t;
	private final i u;
	private final ba v;
	private final as w;
	private IAppboyImageLoader x;
	private volatile boolean y;

	static 
	{
	//    0    0:ldc1            #2   <Class Appboy>
	//    1    2:invokestatic    #140 <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #142 <Field String k>
	//    3    8:new             #144 <Class HashSet>
	//    4   11:dup             
	//    5   12:sipush          171
	//    6   15:anewarray       String[]
	//    7   18:dup             
	//    8   19:iconst_0        
	//    9   20:ldc1            #148 <String "AED">
	//   10   22:aastore         
	//   11   23:dup             
	//   12   24:iconst_1        
	//   13   25:ldc1            #150 <String "AFN">
	//   14   27:aastore         
	//   15   28:dup             
	//   16   29:iconst_2        
	//   17   30:ldc1            #152 <String "ALL">
	//   18   32:aastore         
	//   19   33:dup             
	//   20   34:iconst_3        
	//   21   35:ldc1            #154 <String "AMD">
	//   22   37:aastore         
	//   23   38:dup             
	//   24   39:iconst_4        
	//   25   40:ldc1            #156 <String "ANG">
	//   26   42:aastore         
	//   27   43:dup             
	//   28   44:iconst_5        
	//   29   45:ldc1            #158 <String "AOA">
	//   30   47:aastore         
	//   31   48:dup             
	//   32   49:bipush          6
	//   33   51:ldc1            #160 <String "ARS">
	//   34   53:aastore         
	//   35   54:dup             
	//   36   55:bipush          7
	//   37   57:ldc1            #162 <String "AUD">
	//   38   59:aastore         
	//   39   60:dup             
	//   40   61:bipush          8
	//   41   63:ldc1            #164 <String "AWG">
	//   42   65:aastore         
	//   43   66:dup             
	//   44   67:bipush          9
	//   45   69:ldc1            #166 <String "AZN">
	//   46   71:aastore         
	//   47   72:dup             
	//   48   73:bipush          10
	//   49   75:ldc1            #168 <String "BAM">
	//   50   77:aastore         
	//   51   78:dup             
	//   52   79:bipush          11
	//   53   81:ldc1            #170 <String "BBD">
	//   54   83:aastore         
	//   55   84:dup             
	//   56   85:bipush          12
	//   57   87:ldc1            #172 <String "BDT">
	//   58   89:aastore         
	//   59   90:dup             
	//   60   91:bipush          13
	//   61   93:ldc1            #174 <String "BGN">
	//   62   95:aastore         
	//   63   96:dup             
	//   64   97:bipush          14
	//   65   99:ldc1            #176 <String "BHD">
	//   66  101:aastore         
	//   67  102:dup             
	//   68  103:bipush          15
	//   69  105:ldc1            #178 <String "BIF">
	//   70  107:aastore         
	//   71  108:dup             
	//   72  109:bipush          16
	//   73  111:ldc1            #180 <String "BMD">
	//   74  113:aastore         
	//   75  114:dup             
	//   76  115:bipush          17
	//   77  117:ldc1            #182 <String "BND">
	//   78  119:aastore         
	//   79  120:dup             
	//   80  121:bipush          18
	//   81  123:ldc1            #184 <String "BOB">
	//   82  125:aastore         
	//   83  126:dup             
	//   84  127:bipush          19
	//   85  129:ldc1            #186 <String "BRL">
	//   86  131:aastore         
	//   87  132:dup             
	//   88  133:bipush          20
	//   89  135:ldc1            #188 <String "BSD">
	//   90  137:aastore         
	//   91  138:dup             
	//   92  139:bipush          21
	//   93  141:ldc1            #190 <String "BTC">
	//   94  143:aastore         
	//   95  144:dup             
	//   96  145:bipush          22
	//   97  147:ldc1            #192 <String "BTN">
	//   98  149:aastore         
	//   99  150:dup             
	//  100  151:bipush          23
	//  101  153:ldc1            #194 <String "BWP">
	//  102  155:aastore         
	//  103  156:dup             
	//  104  157:bipush          24
	//  105  159:ldc1            #196 <String "BYR">
	//  106  161:aastore         
	//  107  162:dup             
	//  108  163:bipush          25
	//  109  165:ldc1            #198 <String "BZD">
	//  110  167:aastore         
	//  111  168:dup             
	//  112  169:bipush          26
	//  113  171:ldc1            #200 <String "CAD">
	//  114  173:aastore         
	//  115  174:dup             
	//  116  175:bipush          27
	//  117  177:ldc1            #202 <String "CDF">
	//  118  179:aastore         
	//  119  180:dup             
	//  120  181:bipush          28
	//  121  183:ldc1            #204 <String "CHF">
	//  122  185:aastore         
	//  123  186:dup             
	//  124  187:bipush          29
	//  125  189:ldc1            #206 <String "CLF">
	//  126  191:aastore         
	//  127  192:dup             
	//  128  193:bipush          30
	//  129  195:ldc1            #208 <String "CLP">
	//  130  197:aastore         
	//  131  198:dup             
	//  132  199:bipush          31
	//  133  201:ldc1            #210 <String "CNY">
	//  134  203:aastore         
	//  135  204:dup             
	//  136  205:bipush          32
	//  137  207:ldc1            #212 <String "COP">
	//  138  209:aastore         
	//  139  210:dup             
	//  140  211:bipush          33
	//  141  213:ldc1            #214 <String "CRC">
	//  142  215:aastore         
	//  143  216:dup             
	//  144  217:bipush          34
	//  145  219:ldc1            #216 <String "CUC">
	//  146  221:aastore         
	//  147  222:dup             
	//  148  223:bipush          35
	//  149  225:ldc1            #218 <String "CUP">
	//  150  227:aastore         
	//  151  228:dup             
	//  152  229:bipush          36
	//  153  231:ldc1            #220 <String "CVE">
	//  154  233:aastore         
	//  155  234:dup             
	//  156  235:bipush          37
	//  157  237:ldc1            #222 <String "CZK">
	//  158  239:aastore         
	//  159  240:dup             
	//  160  241:bipush          38
	//  161  243:ldc1            #224 <String "DJF">
	//  162  245:aastore         
	//  163  246:dup             
	//  164  247:bipush          39
	//  165  249:ldc1            #226 <String "DKK">
	//  166  251:aastore         
	//  167  252:dup             
	//  168  253:bipush          40
	//  169  255:ldc1            #228 <String "DOP">
	//  170  257:aastore         
	//  171  258:dup             
	//  172  259:bipush          41
	//  173  261:ldc1            #230 <String "DZD">
	//  174  263:aastore         
	//  175  264:dup             
	//  176  265:bipush          42
	//  177  267:ldc1            #232 <String "EEK">
	//  178  269:aastore         
	//  179  270:dup             
	//  180  271:bipush          43
	//  181  273:ldc1            #234 <String "EGP">
	//  182  275:aastore         
	//  183  276:dup             
	//  184  277:bipush          44
	//  185  279:ldc1            #236 <String "ERN">
	//  186  281:aastore         
	//  187  282:dup             
	//  188  283:bipush          45
	//  189  285:ldc1            #238 <String "ETB">
	//  190  287:aastore         
	//  191  288:dup             
	//  192  289:bipush          46
	//  193  291:ldc1            #240 <String "EUR">
	//  194  293:aastore         
	//  195  294:dup             
	//  196  295:bipush          47
	//  197  297:ldc1            #242 <String "FJD">
	//  198  299:aastore         
	//  199  300:dup             
	//  200  301:bipush          48
	//  201  303:ldc1            #244 <String "FKP">
	//  202  305:aastore         
	//  203  306:dup             
	//  204  307:bipush          49
	//  205  309:ldc1            #246 <String "GBP">
	//  206  311:aastore         
	//  207  312:dup             
	//  208  313:bipush          50
	//  209  315:ldc1            #248 <String "GEL">
	//  210  317:aastore         
	//  211  318:dup             
	//  212  319:bipush          51
	//  213  321:ldc1            #250 <String "GGP">
	//  214  323:aastore         
	//  215  324:dup             
	//  216  325:bipush          52
	//  217  327:ldc1            #252 <String "GHS">
	//  218  329:aastore         
	//  219  330:dup             
	//  220  331:bipush          53
	//  221  333:ldc1            #254 <String "GIP">
	//  222  335:aastore         
	//  223  336:dup             
	//  224  337:bipush          54
	//  225  339:ldc2            #256 <String "GMD">
	//  226  342:aastore         
	//  227  343:dup             
	//  228  344:bipush          55
	//  229  346:ldc2            #258 <String "GNF">
	//  230  349:aastore         
	//  231  350:dup             
	//  232  351:bipush          56
	//  233  353:ldc2            #260 <String "GTQ">
	//  234  356:aastore         
	//  235  357:dup             
	//  236  358:bipush          57
	//  237  360:ldc2            #262 <String "GYD">
	//  238  363:aastore         
	//  239  364:dup             
	//  240  365:bipush          58
	//  241  367:ldc2            #264 <String "HKD">
	//  242  370:aastore         
	//  243  371:dup             
	//  244  372:bipush          59
	//  245  374:ldc2            #266 <String "HNL">
	//  246  377:aastore         
	//  247  378:dup             
	//  248  379:bipush          60
	//  249  381:ldc2            #268 <String "HRK">
	//  250  384:aastore         
	//  251  385:dup             
	//  252  386:bipush          61
	//  253  388:ldc2            #270 <String "HTG">
	//  254  391:aastore         
	//  255  392:dup             
	//  256  393:bipush          62
	//  257  395:ldc2            #272 <String "HUF">
	//  258  398:aastore         
	//  259  399:dup             
	//  260  400:bipush          63
	//  261  402:ldc2            #274 <String "IDR">
	//  262  405:aastore         
	//  263  406:dup             
	//  264  407:bipush          64
	//  265  409:ldc2            #276 <String "ILS">
	//  266  412:aastore         
	//  267  413:dup             
	//  268  414:bipush          65
	//  269  416:ldc2            #278 <String "IMP">
	//  270  419:aastore         
	//  271  420:dup             
	//  272  421:bipush          66
	//  273  423:ldc2            #280 <String "INR">
	//  274  426:aastore         
	//  275  427:dup             
	//  276  428:bipush          67
	//  277  430:ldc2            #282 <String "IQD">
	//  278  433:aastore         
	//  279  434:dup             
	//  280  435:bipush          68
	//  281  437:ldc2            #284 <String "IRR">
	//  282  440:aastore         
	//  283  441:dup             
	//  284  442:bipush          69
	//  285  444:ldc2            #286 <String "ISK">
	//  286  447:aastore         
	//  287  448:dup             
	//  288  449:bipush          70
	//  289  451:ldc2            #288 <String "JEP">
	//  290  454:aastore         
	//  291  455:dup             
	//  292  456:bipush          71
	//  293  458:ldc2            #290 <String "JMD">
	//  294  461:aastore         
	//  295  462:dup             
	//  296  463:bipush          72
	//  297  465:ldc2            #292 <String "JOD">
	//  298  468:aastore         
	//  299  469:dup             
	//  300  470:bipush          73
	//  301  472:ldc2            #294 <String "JPY">
	//  302  475:aastore         
	//  303  476:dup             
	//  304  477:bipush          74
	//  305  479:ldc2            #296 <String "KES">
	//  306  482:aastore         
	//  307  483:dup             
	//  308  484:bipush          75
	//  309  486:ldc2            #298 <String "KGS">
	//  310  489:aastore         
	//  311  490:dup             
	//  312  491:bipush          76
	//  313  493:ldc2            #300 <String "KHR">
	//  314  496:aastore         
	//  315  497:dup             
	//  316  498:bipush          77
	//  317  500:ldc2            #302 <String "KMF">
	//  318  503:aastore         
	//  319  504:dup             
	//  320  505:bipush          78
	//  321  507:ldc2            #304 <String "KPW">
	//  322  510:aastore         
	//  323  511:dup             
	//  324  512:bipush          79
	//  325  514:ldc2            #306 <String "KRW">
	//  326  517:aastore         
	//  327  518:dup             
	//  328  519:bipush          80
	//  329  521:ldc2            #308 <String "KWD">
	//  330  524:aastore         
	//  331  525:dup             
	//  332  526:bipush          81
	//  333  528:ldc2            #310 <String "KYD">
	//  334  531:aastore         
	//  335  532:dup             
	//  336  533:bipush          82
	//  337  535:ldc2            #312 <String "KZT">
	//  338  538:aastore         
	//  339  539:dup             
	//  340  540:bipush          83
	//  341  542:ldc2            #314 <String "LAK">
	//  342  545:aastore         
	//  343  546:dup             
	//  344  547:bipush          84
	//  345  549:ldc2            #316 <String "LBP">
	//  346  552:aastore         
	//  347  553:dup             
	//  348  554:bipush          85
	//  349  556:ldc2            #318 <String "LKR">
	//  350  559:aastore         
	//  351  560:dup             
	//  352  561:bipush          86
	//  353  563:ldc2            #320 <String "LRD">
	//  354  566:aastore         
	//  355  567:dup             
	//  356  568:bipush          87
	//  357  570:ldc2            #322 <String "LSL">
	//  358  573:aastore         
	//  359  574:dup             
	//  360  575:bipush          88
	//  361  577:ldc2            #324 <String "LTL">
	//  362  580:aastore         
	//  363  581:dup             
	//  364  582:bipush          89
	//  365  584:ldc2            #326 <String "LVL">
	//  366  587:aastore         
	//  367  588:dup             
	//  368  589:bipush          90
	//  369  591:ldc2            #328 <String "LYD">
	//  370  594:aastore         
	//  371  595:dup             
	//  372  596:bipush          91
	//  373  598:ldc2            #330 <String "MAD">
	//  374  601:aastore         
	//  375  602:dup             
	//  376  603:bipush          92
	//  377  605:ldc2            #332 <String "MDL">
	//  378  608:aastore         
	//  379  609:dup             
	//  380  610:bipush          93
	//  381  612:ldc2            #334 <String "MGA">
	//  382  615:aastore         
	//  383  616:dup             
	//  384  617:bipush          94
	//  385  619:ldc2            #336 <String "MKD">
	//  386  622:aastore         
	//  387  623:dup             
	//  388  624:bipush          95
	//  389  626:ldc2            #338 <String "MMK">
	//  390  629:aastore         
	//  391  630:dup             
	//  392  631:bipush          96
	//  393  633:ldc2            #340 <String "MNT">
	//  394  636:aastore         
	//  395  637:dup             
	//  396  638:bipush          97
	//  397  640:ldc2            #342 <String "MOP">
	//  398  643:aastore         
	//  399  644:dup             
	//  400  645:bipush          98
	//  401  647:ldc2            #344 <String "MRO">
	//  402  650:aastore         
	//  403  651:dup             
	//  404  652:bipush          99
	//  405  654:ldc2            #346 <String "MTL">
	//  406  657:aastore         
	//  407  658:dup             
	//  408  659:bipush          100
	//  409  661:ldc2            #348 <String "MUR">
	//  410  664:aastore         
	//  411  665:dup             
	//  412  666:bipush          101
	//  413  668:ldc2            #350 <String "MVR">
	//  414  671:aastore         
	//  415  672:dup             
	//  416  673:bipush          102
	//  417  675:ldc2            #352 <String "MWK">
	//  418  678:aastore         
	//  419  679:dup             
	//  420  680:bipush          103
	//  421  682:ldc2            #354 <String "MXN">
	//  422  685:aastore         
	//  423  686:dup             
	//  424  687:bipush          104
	//  425  689:ldc2            #356 <String "MYR">
	//  426  692:aastore         
	//  427  693:dup             
	//  428  694:bipush          105
	//  429  696:ldc2            #358 <String "MZN">
	//  430  699:aastore         
	//  431  700:dup             
	//  432  701:bipush          106
	//  433  703:ldc2            #360 <String "NAD">
	//  434  706:aastore         
	//  435  707:dup             
	//  436  708:bipush          107
	//  437  710:ldc2            #362 <String "NGN">
	//  438  713:aastore         
	//  439  714:dup             
	//  440  715:bipush          108
	//  441  717:ldc2            #364 <String "NIO">
	//  442  720:aastore         
	//  443  721:dup             
	//  444  722:bipush          109
	//  445  724:ldc2            #366 <String "NOK">
	//  446  727:aastore         
	//  447  728:dup             
	//  448  729:bipush          110
	//  449  731:ldc2            #368 <String "NPR">
	//  450  734:aastore         
	//  451  735:dup             
	//  452  736:bipush          111
	//  453  738:ldc2            #370 <String "NZD">
	//  454  741:aastore         
	//  455  742:dup             
	//  456  743:bipush          112
	//  457  745:ldc2            #372 <String "OMR">
	//  458  748:aastore         
	//  459  749:dup             
	//  460  750:bipush          113
	//  461  752:ldc2            #374 <String "PAB">
	//  462  755:aastore         
	//  463  756:dup             
	//  464  757:bipush          114
	//  465  759:ldc2            #376 <String "PEN">
	//  466  762:aastore         
	//  467  763:dup             
	//  468  764:bipush          115
	//  469  766:ldc2            #378 <String "PGK">
	//  470  769:aastore         
	//  471  770:dup             
	//  472  771:bipush          116
	//  473  773:ldc2            #380 <String "PHP">
	//  474  776:aastore         
	//  475  777:dup             
	//  476  778:bipush          117
	//  477  780:ldc2            #382 <String "PKR">
	//  478  783:aastore         
	//  479  784:dup             
	//  480  785:bipush          118
	//  481  787:ldc2            #384 <String "PLN">
	//  482  790:aastore         
	//  483  791:dup             
	//  484  792:bipush          119
	//  485  794:ldc2            #386 <String "PYG">
	//  486  797:aastore         
	//  487  798:dup             
	//  488  799:bipush          120
	//  489  801:ldc2            #388 <String "QAR">
	//  490  804:aastore         
	//  491  805:dup             
	//  492  806:bipush          121
	//  493  808:ldc2            #390 <String "RON">
	//  494  811:aastore         
	//  495  812:dup             
	//  496  813:bipush          122
	//  497  815:ldc2            #392 <String "RSD">
	//  498  818:aastore         
	//  499  819:dup             
	//  500  820:bipush          123
	//  501  822:ldc2            #394 <String "RUB">
	//  502  825:aastore         
	//  503  826:dup             
	//  504  827:bipush          124
	//  505  829:ldc2            #396 <String "RWF">
	//  506  832:aastore         
	//  507  833:dup             
	//  508  834:bipush          125
	//  509  836:ldc2            #398 <String "SAR">
	//  510  839:aastore         
	//  511  840:dup             
	//  512  841:bipush          126
	//  513  843:ldc2            #400 <String "SBD">
	//  514  846:aastore         
	//  515  847:dup             
	//  516  848:bipush          127
	//  517  850:ldc2            #402 <String "SCR">
	//  518  853:aastore         
	//  519  854:dup             
	//  520  855:sipush          128
	//  521  858:ldc2            #404 <String "SDG">
	//  522  861:aastore         
	//  523  862:dup             
	//  524  863:sipush          129
	//  525  866:ldc2            #406 <String "SEK">
	//  526  869:aastore         
	//  527  870:dup             
	//  528  871:sipush          130
	//  529  874:ldc2            #408 <String "SGD">
	//  530  877:aastore         
	//  531  878:dup             
	//  532  879:sipush          131
	//  533  882:ldc2            #410 <String "SHP">
	//  534  885:aastore         
	//  535  886:dup             
	//  536  887:sipush          132
	//  537  890:ldc2            #412 <String "SLL">
	//  538  893:aastore         
	//  539  894:dup             
	//  540  895:sipush          133
	//  541  898:ldc2            #414 <String "SOS">
	//  542  901:aastore         
	//  543  902:dup             
	//  544  903:sipush          134
	//  545  906:ldc2            #416 <String "SRD">
	//  546  909:aastore         
	//  547  910:dup             
	//  548  911:sipush          135
	//  549  914:ldc2            #418 <String "STD">
	//  550  917:aastore         
	//  551  918:dup             
	//  552  919:sipush          136
	//  553  922:ldc2            #420 <String "SVC">
	//  554  925:aastore         
	//  555  926:dup             
	//  556  927:sipush          137
	//  557  930:ldc2            #422 <String "SYP">
	//  558  933:aastore         
	//  559  934:dup             
	//  560  935:sipush          138
	//  561  938:ldc2            #424 <String "SZL">
	//  562  941:aastore         
	//  563  942:dup             
	//  564  943:sipush          139
	//  565  946:ldc2            #426 <String "THB">
	//  566  949:aastore         
	//  567  950:dup             
	//  568  951:sipush          140
	//  569  954:ldc2            #428 <String "TJS">
	//  570  957:aastore         
	//  571  958:dup             
	//  572  959:sipush          141
	//  573  962:ldc2            #430 <String "TMT">
	//  574  965:aastore         
	//  575  966:dup             
	//  576  967:sipush          142
	//  577  970:ldc2            #432 <String "TND">
	//  578  973:aastore         
	//  579  974:dup             
	//  580  975:sipush          143
	//  581  978:ldc2            #434 <String "TOP">
	//  582  981:aastore         
	//  583  982:dup             
	//  584  983:sipush          144
	//  585  986:ldc2            #436 <String "TRY">
	//  586  989:aastore         
	//  587  990:dup             
	//  588  991:sipush          145
	//  589  994:ldc2            #438 <String "TTD">
	//  590  997:aastore         
	//  591  998:dup             
	//  592  999:sipush          146
	//  593 1002:ldc2            #440 <String "TWD">
	//  594 1005:aastore         
	//  595 1006:dup             
	//  596 1007:sipush          147
	//  597 1010:ldc2            #442 <String "TZS">
	//  598 1013:aastore         
	//  599 1014:dup             
	//  600 1015:sipush          148
	//  601 1018:ldc2            #444 <String "UAH">
	//  602 1021:aastore         
	//  603 1022:dup             
	//  604 1023:sipush          149
	//  605 1026:ldc2            #446 <String "UGX">
	//  606 1029:aastore         
	//  607 1030:dup             
	//  608 1031:sipush          150
	//  609 1034:ldc2            #448 <String "USD">
	//  610 1037:aastore         
	//  611 1038:dup             
	//  612 1039:sipush          151
	//  613 1042:ldc2            #450 <String "UYU">
	//  614 1045:aastore         
	//  615 1046:dup             
	//  616 1047:sipush          152
	//  617 1050:ldc2            #452 <String "UZS">
	//  618 1053:aastore         
	//  619 1054:dup             
	//  620 1055:sipush          153
	//  621 1058:ldc2            #454 <String "VEF">
	//  622 1061:aastore         
	//  623 1062:dup             
	//  624 1063:sipush          154
	//  625 1066:ldc2            #456 <String "VND">
	//  626 1069:aastore         
	//  627 1070:dup             
	//  628 1071:sipush          155
	//  629 1074:ldc2            #458 <String "VUV">
	//  630 1077:aastore         
	//  631 1078:dup             
	//  632 1079:sipush          156
	//  633 1082:ldc2            #460 <String "WST">
	//  634 1085:aastore         
	//  635 1086:dup             
	//  636 1087:sipush          157
	//  637 1090:ldc2            #462 <String "XAF">
	//  638 1093:aastore         
	//  639 1094:dup             
	//  640 1095:sipush          158
	//  641 1098:ldc2            #464 <String "XAG">
	//  642 1101:aastore         
	//  643 1102:dup             
	//  644 1103:sipush          159
	//  645 1106:ldc2            #466 <String "XAU">
	//  646 1109:aastore         
	//  647 1110:dup             
	//  648 1111:sipush          160
	//  649 1114:ldc2            #468 <String "XCD">
	//  650 1117:aastore         
	//  651 1118:dup             
	//  652 1119:sipush          161
	//  653 1122:ldc2            #470 <String "XDR">
	//  654 1125:aastore         
	//  655 1126:dup             
	//  656 1127:sipush          162
	//  657 1130:ldc2            #472 <String "XOF">
	//  658 1133:aastore         
	//  659 1134:dup             
	//  660 1135:sipush          163
	//  661 1138:ldc2            #474 <String "XPD">
	//  662 1141:aastore         
	//  663 1142:dup             
	//  664 1143:sipush          164
	//  665 1146:ldc2            #476 <String "XPF">
	//  666 1149:aastore         
	//  667 1150:dup             
	//  668 1151:sipush          165
	//  669 1154:ldc2            #478 <String "XPT">
	//  670 1157:aastore         
	//  671 1158:dup             
	//  672 1159:sipush          166
	//  673 1162:ldc2            #480 <String "YER">
	//  674 1165:aastore         
	//  675 1166:dup             
	//  676 1167:sipush          167
	//  677 1170:ldc2            #482 <String "ZAR">
	//  678 1173:aastore         
	//  679 1174:dup             
	//  680 1175:sipush          168
	//  681 1178:ldc2            #484 <String "ZMK">
	//  682 1181:aastore         
	//  683 1182:dup             
	//  684 1183:sipush          169
	//  685 1186:ldc2            #486 <String "ZMW">
	//  686 1189:aastore         
	//  687 1190:dup             
	//  688 1191:sipush          170
	//  689 1194:ldc2            #488 <String "ZWL">
	//  690 1197:aastore         
	//  691 1198:invokestatic    #494 <Method java.util.List Arrays.asList(Object[])>
	//  692 1201:invokespecial   #498 <Method void HashSet(java.util.Collection)>
	//  693 1204:putstatic       #500 <Field Set l>
	//  694 1207:new             #144 <Class HashSet>
	//  695 1210:dup             
	//  696 1211:ldc2            #502 <String "calypso appcrawler">
	//  697 1214:invokestatic    #508 <Method java.util.List Collections.singletonList(Object)>
	//  698 1217:invokespecial   #498 <Method void HashSet(java.util.Collection)>
	//  699 1220:putstatic       #510 <Field Set m>
	//  700 1223:new             #144 <Class HashSet>
	//  701 1226:dup             
	//  702 1227:iconst_2        
	//  703 1228:anewarray       String[]
	//  704 1231:dup             
	//  705 1232:iconst_0        
	//  706 1233:ldc2            #512 <String "android.permission.ACCESS_NETWORK_STATE">
	//  707 1236:aastore         
	//  708 1237:dup             
	//  709 1238:iconst_1        
	//  710 1239:ldc2            #514 <String "android.permission.INTERNET">
	//  711 1242:aastore         
	//  712 1243:invokestatic    #494 <Method java.util.List Arrays.asList(Object[])>
	//  713 1246:invokespecial   #498 <Method void HashSet(java.util.Collection)>
	//  714 1249:putstatic       #516 <Field Set n>
	//  715 1252:aconst_null     
	//  716 1253:putstatic       #518 <Field Appboy o>
	//  717 1256:new             #4   <Class Object>
	//  718 1259:dup             
	//  719 1260:invokespecial   #520 <Method void Object()>
	//  720 1263:putstatic       #522 <Field Object z>
	//  721 1266:iconst_0        
	//  722 1267:putstatic       #524 <Field boolean C>
	//  723 1270:iconst_0        
	//  724 1271:putstatic       #526 <Field boolean D>
	//  725 1274:iconst_0        
	//  726 1275:putstatic       #528 <Field boolean E>
	//* 727 1278:return          
	}
}
