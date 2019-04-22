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
import bo.app.*;
import com.appboy.configuration.AppboyConfig;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.events.ContentCardsUpdatedEvent;
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
	//    1    1:invokespecial   #530 <Method void Object()>
		z = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #542 <Field boolean z>
		long l1 = System.nanoTime();
	//    5    9:invokestatic    #548 <Method long System.nanoTime()>
	//    6   12:lstore_2        
		AppboyLogger.d(l, "Braze SDK Initializing");
	//    7   13:getstatic       #152 <Field String l>
	//    8   16:ldc2            #550 <String "Braze SDK Initializing">
	//    9   19:invokestatic    #553 <Method int AppboyLogger.d(String, String)>
	//   10   22:pop             
		Object obj = ((Object) (new bb("singleton_event_manager_parallel_executor_identifier")));
	//   11   23:new             #555 <Class bb>
	//   12   26:dup             
	//   13   27:ldc2            #557 <String "singleton_event_manager_parallel_executor_identifier">
	//   14   30:invokespecial   #560 <Method void bb(String)>
	//   15   33:astore          6
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
	//   16   35:aload           6
	//   17   37:new             #10  <Class Appboy$1>
	//   18   40:dup             
	//   19   41:aload_0         
	//   20   42:invokespecial   #563 <Method void Appboy$1(Appboy)>
	//   21   45:invokeinterface #569 <Method void Executor.execute(Runnable)>
		q = context.getApplicationContext();
	//   22   50:aload_0         
	//   23   51:aload_1         
	//   24   52:invokevirtual   #575 <Method Context Context.getApplicationContext()>
	//   25   55:putfield        #577 <Field Context q>
	//   26   58:aload_0         
	//   27   59:new             #579 <Class bz>
	//   28   62:dup             
	//   29   63:invokespecial   #580 <Method void bz()>
	//   30   66:putfield        #582 <Field bz s>
		AppboyLogger.setTestUserDeviceLoggingManager(s);
	//   31   69:aload_0         
	//   32   70:getfield        #582 <Field bz s>
	//   33   73:invokestatic    #586 <Method void AppboyLogger.setTestUserDeviceLoggingManager(bz)>
		String s1 = Build.MODEL;
	//   34   76:getstatic       #591 <Field String Build.MODEL>
	//   35   79:astore          7
		if(s1 != null && n.contains(((Object) (s1.toLowerCase(Locale.US)))))
	//*  36   81:aload           7
	//*  37   83:ifnull          151
	//*  38   86:getstatic       #520 <Field Set n>
	//*  39   89:aload           7
	//*  40   91:getstatic       #597 <Field Locale Locale.US>
	//*  41   94:invokevirtual   #601 <Method String String.toLowerCase(Locale)>
	//*  42   97:invokeinterface #607 <Method boolean Set.contains(Object)>
	//*  43  102:ifeq            151
		{
			String s2 = l;
	//   44  105:getstatic       #152 <Field String l>
	//   45  108:astore          8
			StringBuilder stringbuilder = new StringBuilder();
	//   46  110:new             #609 <Class StringBuilder>
	//   47  113:dup             
	//   48  114:invokespecial   #610 <Method void StringBuilder()>
	//   49  117:astore          9
			stringbuilder.append("Device build model matches a known crawler. Enabling mock network request mode. Device model: ");
	//   50  119:aload           9
	//   51  121:ldc2            #612 <String "Device build model matches a known crawler. Enabling mock network request mode. Device model: ">
	//   52  124:invokevirtual   #616 <Method StringBuilder StringBuilder.append(String)>
	//   53  127:pop             
			stringbuilder.append(s1);
	//   54  128:aload           9
	//   55  130:aload           7
	//   56  132:invokevirtual   #616 <Method StringBuilder StringBuilder.append(String)>
	//   57  135:pop             
			AppboyLogger.i(s2, stringbuilder.toString());
	//   58  136:aload           8
	//   59  138:aload           9
	//   60  140:invokevirtual   #620 <Method String StringBuilder.toString()>
	//   61  143:invokestatic    #622 <Method int AppboyLogger.i(String, String)>
	//   62  146:pop             
			enableMockAppboyNetworkRequestsAndDropEventsMode();
	//   63  147:invokestatic    #626 <Method boolean enableMockAppboyNetworkRequestsAndDropEventsMode()>
	//   64  150:pop             
		}
		y = ((IAppboyImageLoader) (new AppboyLruImageLoader(q)));
	//   65  151:aload_0         
	//   66  152:new             #628 <Class AppboyLruImageLoader>
	//   67  155:dup             
	//   68  156:aload_0         
	//   69  157:getfield        #577 <Field Context q>
	//   70  160:invokespecial   #630 <Method void AppboyLruImageLoader(Context)>
	//   71  163:putfield        #632 <Field IAppboyImageLoader y>
		i = new AppboyConfigurationProvider(q);
	//   72  166:aload_0         
	//   73  167:new             #634 <Class AppboyConfigurationProvider>
	//   74  170:dup             
	//   75  171:aload_0         
	//   76  172:getfield        #577 <Field Context q>
	//   77  175:invokespecial   #635 <Method void AppboyConfigurationProvider(Context)>
	//   78  178:putfield        #637 <Field AppboyConfigurationProvider i>
		if(!StringUtils.isNullOrBlank(i.getCustomEndpoint()))
	//*  79  181:aload_0         
	//*  80  182:getfield        #637 <Field AppboyConfigurationProvider i>
	//*  81  185:invokevirtual   #640 <Method String AppboyConfigurationProvider.getCustomEndpoint()>
	//*  82  188:invokestatic    #646 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  83  191:ifne            205
			a(i.getCustomEndpoint());
	//   84  194:aload_0         
	//   85  195:aload_0         
	//   86  196:getfield        #637 <Field AppboyConfigurationProvider i>
	//   87  199:invokevirtual   #640 <Method String AppboyConfigurationProvider.getCustomEndpoint()>
	//   88  202:invokespecial   #648 <Method void a(String)>
		v = new l(q);
	//   89  205:aload_0         
	//   90  206:new             #650 <Class l>
	//   91  209:dup             
	//   92  210:aload_0         
	//   93  211:getfield        #577 <Field Context q>
	//   94  214:invokespecial   #651 <Method void l(Context)>
	//   95  217:putfield        #653 <Field l v>
		w = new bj(q);
	//   96  220:aload_0         
	//   97  221:new             #655 <Class bj>
	//   98  224:dup             
	//   99  225:aload_0         
	//  100  226:getfield        #577 <Field Context q>
	//  101  229:invokespecial   #656 <Method void bj(Context)>
	//  102  232:putfield        #658 <Field bj w>
		r = new ac(((Executor) (obj)), G);
	//  103  235:aload_0         
	//  104  236:new             #660 <Class ac>
	//  105  239:dup             
	//  106  240:aload           6
	//  107  242:getstatic       #662 <Field dw G>
	//  108  245:invokespecial   #665 <Method void ac(Executor, dw)>
	//  109  248:putfield        #667 <Field ac r>
		j = ((bx) (new by(q, i)));
	//  110  251:aload_0         
	//  111  252:new             #669 <Class by>
	//  112  255:dup             
	//  113  256:aload_0         
	//  114  257:getfield        #577 <Field Context q>
	//  115  260:aload_0         
	//  116  261:getfield        #637 <Field AppboyConfigurationProvider i>
	//  117  264:invokespecial   #672 <Method void by(Context, AppboyConfigurationProvider)>
	//  118  267:putfield        #674 <Field bx j>
		((Executor) (obj)).execute(new Runnable(context) {

			public void run()
			{
				if(b.i.isFirebaseCloudMessagingRegistrationEnabled())
			//*   0    0:aload_0         
			//*   1    1:getfield        #18  <Field Appboy b>
			//*   2    4:getfield        #29  <Field AppboyConfigurationProvider Appboy.i>
			//*   3    7:invokevirtual   #35  <Method boolean AppboyConfigurationProvider.isFirebaseCloudMessagingRegistrationEnabled()>
			//*   4   10:ifeq            81
				{
					if(bs.a(Appboy.a(b), b.i))
			//*   5   13:aload_0         
			//*   6   14:getfield        #18  <Field Appboy b>
			//*   7   17:invokestatic    #38  <Method Context Appboy.a(Appboy)>
			//*   8   20:aload_0         
			//*   9   21:getfield        #18  <Field Appboy b>
			//*  10   24:getfield        #29  <Field AppboyConfigurationProvider Appboy.i>
			//*  11   27:invokestatic    #43  <Method boolean bs.a(Context, AppboyConfigurationProvider)>
			//*  12   30:ifeq            69
					{
						AppboyLogger.i(Appboy.b(), "Firebase Cloud Messaging found. Setting up Firebase Cloud Messaging.");
			//   13   33:invokestatic    #46  <Method String Appboy.b()>
			//   14   36:ldc1            #48  <String "Firebase Cloud Messaging found. Setting up Firebase Cloud Messaging.">
			//   15   38:invokestatic    #53  <Method int AppboyLogger.i(String, String)>
			//   16   41:pop             
						(new bs(a)).a(b.i.getFirebaseCloudMessagingSenderIdKey());
			//   17   42:new             #40  <Class bs>
			//   18   45:dup             
			//   19   46:aload_0         
			//   20   47:getfield        #20  <Field Context a>
			//   21   50:invokespecial   #54  <Method void bs(Context)>
			//   22   53:aload_0         
			//   23   54:getfield        #18  <Field Appboy b>
			//   24   57:getfield        #29  <Field AppboyConfigurationProvider Appboy.i>
			//   25   60:invokevirtual   #57  <Method String AppboyConfigurationProvider.getFirebaseCloudMessagingSenderIdKey()>
			//   26   63:invokevirtual   #60  <Method void bs.a(String)>
					} else
			//*  27   66:goto            90
					{
						AppboyLogger.e(Appboy.b(), "Firebase Cloud Messaging requirements not met. Braze will not register for Firebase Cloud Messaging.");
			//   28   69:invokestatic    #46  <Method String Appboy.b()>
			//   29   72:ldc1            #62  <String "Firebase Cloud Messaging requirements not met. Braze will not register for Firebase Cloud Messaging.">
			//   30   74:invokestatic    #65  <Method int AppboyLogger.e(String, String)>
			//   31   77:pop             
					}
				} else
			//*  32   78:goto            90
				{
					AppboyLogger.i(Appboy.b(), "Automatic Firebase Cloud Messaging registration not enabled in configuration. Braze will not register for Firebase Cloud Messaging.");
			//   33   81:invokestatic    #46  <Method String Appboy.b()>
			//   34   84:ldc1            #67  <String "Automatic Firebase Cloud Messaging registration not enabled in configuration. Braze will not register for Firebase Cloud Messaging.">
			//   35   86:invokestatic    #53  <Method int AppboyLogger.i(String, String)>
			//   36   89:pop             
				}
				if(b.i.isAdmMessagingRegistrationEnabled())
			//*  37   90:aload_0         
			//*  38   91:getfield        #18  <Field Appboy b>
			//*  39   94:getfield        #29  <Field AppboyConfigurationProvider Appboy.i>
			//*  40   97:invokevirtual   #70  <Method boolean AppboyConfigurationProvider.isAdmMessagingRegistrationEnabled()>
			//*  41  100:ifeq            160
				{
					if(bi.a(Appboy.a(b)))
			//*  42  103:aload_0         
			//*  43  104:getfield        #18  <Field Appboy b>
			//*  44  107:invokestatic    #38  <Method Context Appboy.a(Appboy)>
			//*  45  110:invokestatic    #75  <Method boolean bi.a(Context)>
			//*  46  113:ifeq            150
					{
						AppboyLogger.i(Appboy.b(), "Amazon Device Messaging found. Setting up Amazon Device Messaging");
			//   47  116:invokestatic    #46  <Method String Appboy.b()>
			//   48  119:ldc1            #77  <String "Amazon Device Messaging found. Setting up Amazon Device Messaging">
			//   49  121:invokestatic    #53  <Method int AppboyLogger.i(String, String)>
			//   50  124:pop             
						(new bi(Appboy.a(b), b.j)).a();
			//   51  125:new             #72  <Class bi>
			//   52  128:dup             
			//   53  129:aload_0         
			//   54  130:getfield        #18  <Field Appboy b>
			//   55  133:invokestatic    #38  <Method Context Appboy.a(Appboy)>
			//   56  136:aload_0         
			//   57  137:getfield        #18  <Field Appboy b>
			//   58  140:getfield        #81  <Field bx Appboy.j>
			//   59  143:invokespecial   #84  <Method void bi(Context, bx)>
			//   60  146:invokevirtual   #86  <Method void bi.a()>
						return;
			//   61  149:return          
					} else
					{
						AppboyLogger.e(Appboy.b(), "ADM manifest requirements not met. Braze will not register for ADM.");
			//   62  150:invokestatic    #46  <Method String Appboy.b()>
			//   63  153:ldc1            #88  <String "ADM manifest requirements not met. Braze will not register for ADM.">
			//   64  155:invokestatic    #65  <Method int AppboyLogger.e(String, String)>
			//   65  158:pop             
						return;
			//   66  159:return          
					}
				} else
				{
					AppboyLogger.i(Appboy.b(), "Automatic ADM registration not enabled in configuration. Braze will not register for ADM.");
			//   67  160:invokestatic    #46  <Method String Appboy.b()>
			//   68  163:ldc1            #90  <String "Automatic ADM registration not enabled in configuration. Braze will not register for ADM.">
			//   69  165:invokestatic    #53  <Method int AppboyLogger.i(String, String)>
			//   70  168:pop             
					return;
			//   71  169:return          
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
	//  119  270:aload           6
	//  120  272:new             #16  <Class Appboy$12>
	//  121  275:dup             
	//  122  276:aload_0         
	//  123  277:aload_1         
	//  124  278:invokespecial   #677 <Method void Appboy$12(Appboy, Context)>
	//  125  281:invokeinterface #569 <Method void Executor.execute(Runnable)>
		context = ((Context) (new ay("Appboy-User-Dependency-Thread")));
	//  126  286:new             #679 <Class ay>
	//  127  289:dup             
	//  128  290:ldc2            #681 <String "Appboy-User-Dependency-Thread">
	//  129  293:invokespecial   #682 <Method void ay(String)>
	//  130  296:astore_1        
		x = new ba(((ad) (r)));
	//  131  297:aload_0         
	//  132  298:new             #684 <Class ba>
	//  133  301:dup             
	//  134  302:aload_0         
	//  135  303:getfield        #667 <Field ac r>
	//  136  306:invokespecial   #687 <Method void ba(ad)>
	//  137  309:putfield        #689 <Field ba x>
		((ay) (context)).a(((Thread.UncaughtExceptionHandler) (x)));
	//  138  312:aload_1         
	//  139  313:aload_0         
	//  140  314:getfield        #689 <Field ba x>
	//  141  317:invokevirtual   #692 <Method void ay.a(Thread$UncaughtExceptionHandler)>
		k = new bc("singleton_user_dependency_parallel_executor_identifier", ((java.util.concurrent.ThreadFactory) (context)));
	//  142  320:aload_0         
	//  143  321:new             #694 <Class bc>
	//  144  324:dup             
	//  145  325:ldc2            #696 <String "singleton_user_dependency_parallel_executor_identifier">
	//  146  328:aload_1         
	//  147  329:invokespecial   #699 <Method void bc(String, java.util.concurrent.ThreadFactory)>
	//  148  332:putfield        #701 <Field bc k>
		k.submit(new Runnable() {

			public void run()
			{
				AppboyLogger.v(Appboy.b(), "Starting up a new user dependency manager");
			//    0    0:invokestatic    #25  <Method String Appboy.b()>
			//    1    3:ldc1            #27  <String "Starting up a new user dependency manager">
			//    2    5:invokestatic    #33  <Method int AppboyLogger.v(String, String)>
			//    3    8:pop             
				eq eq1 = new eq(Appboy.a(a), Appboy.b(a), a.i, ((ad) (Appboy.c(a))), Appboy.d(a), a.j, Appboy.c(), Appboy.d(), Appboy.e(a));
			//    4    9:new             #35  <Class eq>
			//    5   12:dup             
			//    6   13:aload_0         
			//    7   14:getfield        #16  <Field Appboy a>
			//    8   17:invokestatic    #38  <Method Context Appboy.a(Appboy)>
			//    9   20:aload_0         
			//   10   21:getfield        #16  <Field Appboy a>
			//   11   24:invokestatic    #41  <Method l Appboy.b(Appboy)>
			//   12   27:aload_0         
			//   13   28:getfield        #16  <Field Appboy a>
			//   14   31:getfield        #45  <Field AppboyConfigurationProvider Appboy.i>
			//   15   34:aload_0         
			//   16   35:getfield        #16  <Field Appboy a>
			//   17   38:invokestatic    #49  <Method ac Appboy.c(Appboy)>
			//   18   41:aload_0         
			//   19   42:getfield        #16  <Field Appboy a>
			//   20   45:invokestatic    #53  <Method bj Appboy.d(Appboy)>
			//   21   48:aload_0         
			//   22   49:getfield        #16  <Field Appboy a>
			//   23   52:getfield        #57  <Field bx Appboy.j>
			//   24   55:invokestatic    #60  <Method boolean Appboy.c()>
			//   25   58:invokestatic    #62  <Method boolean Appboy.d()>
			//   26   61:aload_0         
			//   27   62:getfield        #16  <Field Appboy a>
			//   28   65:invokestatic    #66  <Method bz Appboy.e(Appboy)>
			//   29   68:invokespecial   #69  <Method void eq(Context, l, AppboyConfigurationProvider, ad, bj, bx, boolean, boolean, bz)>
			//   30   71:astore_1        
				Appboy.a(a, eq1);
			//   31   72:aload_0         
			//   32   73:getfield        #16  <Field Appboy a>
			//   33   76:aload_1         
			//   34   77:invokestatic    #72  <Method void Appboy.a(Appboy, eq)>
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
	//  149  335:aload_0         
	//  150  336:getfield        #701 <Field bc k>
	//  151  339:new             #40  <Class Appboy$23>
	//  152  342:dup             
	//  153  343:aload_0         
	//  154  344:invokespecial   #702 <Method void Appboy$23(Appboy)>
	//  155  347:invokevirtual   #706 <Method Future bc.submit(Runnable)>
	//  156  350:pop             
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
	//  157  351:aload           6
	//  158  353:new             #52  <Class Appboy$29>
	//  159  356:dup             
	//  160  357:aload_0         
	//  161  358:invokespecial   #707 <Method void Appboy$29(Appboy)>
	//  162  361:invokeinterface #569 <Method void Executor.execute(Runnable)>
		long l2 = System.nanoTime();
	//  163  366:invokestatic    #548 <Method long System.nanoTime()>
	//  164  369:lstore          4
		context = ((Context) (l));
	//  165  371:getstatic       #152 <Field String l>
	//  166  374:astore_1        
		obj = ((Object) (new StringBuilder()));
	//  167  375:new             #609 <Class StringBuilder>
	//  168  378:dup             
	//  169  379:invokespecial   #610 <Method void StringBuilder()>
	//  170  382:astore          6
		((StringBuilder) (obj)).append("Appboy loaded in ");
	//  171  384:aload           6
	//  172  386:ldc2            #709 <String "Appboy loaded in ">
	//  173  389:invokevirtual   #616 <Method StringBuilder StringBuilder.append(String)>
	//  174  392:pop             
		((StringBuilder) (obj)).append(TimeUnit.MILLISECONDS.convert(l2 - l1, TimeUnit.NANOSECONDS));
	//  175  393:aload           6
	//  176  395:getstatic       #715 <Field TimeUnit TimeUnit.MILLISECONDS>
	//  177  398:lload           4
	//  178  400:lload_2         
	//  179  401:lsub            
	//  180  402:getstatic       #718 <Field TimeUnit TimeUnit.NANOSECONDS>
	//  181  405:invokevirtual   #722 <Method long TimeUnit.convert(long, TimeUnit)>
	//  182  408:invokevirtual   #725 <Method StringBuilder StringBuilder.append(long)>
	//  183  411:pop             
		((StringBuilder) (obj)).append(" ms.");
	//  184  412:aload           6
	//  185  414:ldc2            #727 <String " ms.">
	//  186  417:invokevirtual   #616 <Method StringBuilder StringBuilder.append(String)>
	//  187  420:pop             
		AppboyLogger.d(((String) (context)), ((StringBuilder) (obj)).toString());
	//  188  421:aload_1         
	//  189  422:aload           6
	//  190  424:invokevirtual   #620 <Method String StringBuilder.toString()>
	//  191  427:invokestatic    #553 <Method int AppboyLogger.d(String, String)>
	//  192  430:pop             
	//  193  431:return          
	}

	static Context a(Appboy appboy)
	{
		return appboy.q;
	//    0    0:aload_0         
	//    1    1:getfield        #577 <Field Context q>
	//    2    4:areturn         
	}

	private static dw a(Context context)
	{
		if(G == null)
	//*   0    0:getstatic       #662 <Field dw G>
	//*   1    3:ifnonnull       17
			G = new dw(context);
	//    2    6:new             #733 <Class dw>
	//    3    9:dup             
	//    4   10:aload_0         
	//    5   11:invokespecial   #734 <Method void dw(Context)>
	//    6   14:putstatic       #662 <Field dw G>
		return G;
	//    7   17:getstatic       #662 <Field dw G>
	//    8   20:areturn         
	}

	private void a(eq eq1)
	{
		b = eq1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #737 <Field eq b>
		g = eq1.d();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #742 <Method bo eq.d()>
	//    6   10:putfield        #744 <Field bo g>
		k.a(((bo.app.bt) (g)));
	//    7   13:aload_0         
	//    8   14:getfield        #701 <Field bc k>
	//    9   17:aload_0         
	//   10   18:getfield        #744 <Field bo g>
	//   11   21:invokevirtual   #747 <Method void bc.a(bo.app.bt)>
		f = eq1.a();
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #750 <Method dx eq.a()>
	//   15   29:putfield        #752 <Field dx f>
		d = eq1.l();
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #755 <Method gf eq.l()>
	//   19   37:putfield        #757 <Field gf d>
		e = eq1.m();
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:invokevirtual   #760 <Method bl eq.m()>
	//   23   45:putfield        #762 <Field bl e>
		h = eq1.n();
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:invokevirtual   #765 <Method dn eq.n()>
	//   27   53:putfield        #767 <Field dn h>
		t = new AppboyUser(eq1.g(), ((bo.app.bt) (g)), v.a(), eq1.j(), f);
	//   28   56:aload_0         
	//   29   57:new             #769 <Class AppboyUser>
	//   30   60:dup             
	//   31   61:aload_1         
	//   32   62:invokevirtual   #772 <Method ea eq.g()>
	//   33   65:aload_0         
	//   34   66:getfield        #744 <Field bo g>
	//   35   69:aload_0         
	//   36   70:getfield        #653 <Field l v>
	//   37   73:invokevirtual   #774 <Method String l.a()>
	//   38   76:aload_1         
	//   39   77:invokevirtual   #777 <Method bo.app.bw eq.j()>
	//   40   80:aload_0         
	//   41   81:getfield        #752 <Field dx f>
	//   42   84:invokespecial   #780 <Method void AppboyUser(ea, bo.app.bt, String, bo.app.bw, dx)>
	//   43   87:putfield        #782 <Field AppboyUser t>
		eq1.c().a(eq1.f());
	//   44   90:aload_1         
	//   45   91:invokevirtual   #785 <Method ab eq.c()>
	//   46   94:aload_1         
	//   47   95:invokevirtual   #788 <Method ac eq.f()>
	//   48   98:invokevirtual   #793 <Method void ab.a(ac)>
		eq1.e().a();
	//   49  101:aload_1         
	//   50  102:invokevirtual   #796 <Method n eq.e()>
	//   51  105:invokevirtual   #800 <Method void n.a()>
		a = ((ad) (eq1.f()));
	//   52  108:aload_0         
	//   53  109:aload_1         
	//   54  110:invokevirtual   #788 <Method ac eq.f()>
	//   55  113:putfield        #802 <Field ad a>
		x.a(a);
	//   56  116:aload_0         
	//   57  117:getfield        #689 <Field ba x>
	//   58  120:aload_0         
	//   59  121:getfield        #802 <Field ad a>
	//   60  124:invokevirtual   #804 <Method void ba.a(ad)>
		u = eq1.h();
	//   61  127:aload_0         
	//   62  128:aload_1         
	//   63  129:invokevirtual   #807 <Method ThreadPoolExecutor eq.h()>
	//   64  132:putfield        #809 <Field ThreadPoolExecutor u>
		c = eq1.i();
	//   65  135:aload_0         
	//   66  136:aload_1         
	//   67  137:invokevirtual   #812 <Method dr eq.i()>
	//   68  140:putfield        #814 <Field dr c>
		d = eq1.l();
	//   69  143:aload_0         
	//   70  144:aload_1         
	//   71  145:invokevirtual   #755 <Method gf eq.l()>
	//   72  148:putfield        #757 <Field gf d>
		eq1.k().a(((Executor) (u)), ((bo.app.t) (eq1.e())));
	//   73  151:aload_1         
	//   74  152:invokevirtual   #817 <Method bk eq.k()>
	//   75  155:aload_0         
	//   76  156:getfield        #809 <Field ThreadPoolExecutor u>
	//   77  159:aload_1         
	//   78  160:invokevirtual   #796 <Method n eq.e()>
	//   79  163:invokevirtual   #822 <Method void bk.a(Executor, bo.app.t)>
		s.a(((bo.app.bt) (g)));
	//   80  166:aload_0         
	//   81  167:getfield        #582 <Field bz s>
	//   82  170:aload_0         
	//   83  171:getfield        #744 <Field bo g>
	//   84  174:invokevirtual   #823 <Method void bz.a(bo.app.bt)>
		s.a(f.k());
	//   85  177:aload_0         
	//   86  178:getfield        #582 <Field bz s>
	//   87  181:aload_0         
	//   88  182:getfield        #752 <Field dx f>
	//   89  185:invokevirtual   #827 <Method boolean dx.k()>
	//   90  188:invokevirtual   #830 <Method void bz.a(boolean)>
	//   91  191:return          
	}

	static void a(Appboy appboy, eq eq1)
	{
		appboy.a(eq1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #833 <Method void a(eq)>
	//    3    5:return          
	}

	static void a(Appboy appboy, Throwable throwable)
	{
		appboy.a(throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #837 <Method void a(Throwable)>
	//    3    5:return          
	}

	private void a(String s1)
	{
		synchronized(A)
	//*   0    0:getstatic       #532 <Field Object A>
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
	//    4    6:new             #50  <Class Appboy$28>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #840 <Method void Appboy$28(Appboy, String)>
	//    9   15:invokestatic    #844 <Method void setAppboyEndpointProvider(IAppboyEndpointProvider)>
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
	//    1    1:getfield        #802 <Field ad a>
	//    2    4:aload_1         
	//    3    5:ldc2            #848 <Class Throwable>
	//    4    8:invokeinterface #853 <Method void ad.a(Object, Class)>
			return;
	//    5   13:return          
		}
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
	//*   6   14:astore_1        
		{
			AppboyLogger.e(l, "Failed to log throwable.", throwable);
	//    7   15:getstatic       #152 <Field String l>
	//    8   18:ldc2            #855 <String "Failed to log throwable.">
	//    9   21:aload_1         
	//   10   22:invokestatic    #858 <Method int AppboyLogger.e(String, String, Throwable)>
	//   11   25:pop             
		}
	//   12   26:return          
	}

	static l b(Appboy appboy)
	{
		return appboy.v;
	//    0    0:aload_0         
	//    1    1:getfield        #653 <Field l v>
	//    2    4:areturn         
	}

	static String b()
	{
		return l;
	//    0    0:getstatic       #152 <Field String l>
	//    1    3:areturn         
	}

	private void b(boolean flag)
	{
		k.submit(new Runnable(flag) {

			public void run()
			{
				b.g.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field Appboy b>
			//    2    4:getfield        #29  <Field bo Appboy.g>
			//    3    7:aload_0         
			//    4    8:getfield        #20  <Field boolean a>
			//    5   11:invokevirtual   #33  <Method void bo.a(boolean)>
				b.b.b().a(a);
			//    6   14:aload_0         
			//    7   15:getfield        #18  <Field Appboy b>
			//    8   18:getfield        #36  <Field eq Appboy.b>
			//    9   21:invokevirtual   #41  <Method q eq.b()>
			//   10   24:aload_0         
			//   11   25:getfield        #20  <Field boolean a>
			//   12   28:invokevirtual   #44  <Method void q.a(boolean)>
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
	//    1    1:getfield        #701 <Field bc k>
	//    2    4:new             #48  <Class Appboy$27>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokespecial   #862 <Method void Appboy$27(Appboy, boolean)>
	//    7   13:invokevirtual   #706 <Method Future bc.submit(Runnable)>
	//    8   16:pop             
	//    9   17:return          
	}

	static ac c(Appboy appboy)
	{
		return appboy.r;
	//    0    0:aload_0         
	//    1    1:getfield        #667 <Field ac r>
	//    2    4:areturn         
	}

	static boolean c()
	{
		return D;
	//    0    0:getstatic       #534 <Field boolean D>
	//    1    3:ireturn         
	}

	public static void clearAppboyEndpointProvider()
	{
		synchronized(A)
	//*   0    0:getstatic       #532 <Field Object A>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			B = null;
	//    4    6:aconst_null     
	//    5    7:putstatic       #866 <Field IAppboyEndpointProvider B>
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
		if(p != null)
			break MISSING_BLOCK_LABEL_111;
	//    0    0:getstatic       #528 <Field Appboy p>
	//    1    3:ifnonnull       111
		if(F)
			break MISSING_BLOCK_LABEL_98;
	//    2    6:getstatic       #538 <Field boolean F>
	//    3    9:ifne            98
		com/appboy/Appboy;
	//    4   12:ldc1            #2   <Class Appboy>
		JVM INSTR monitorenter ;
	//    5   14:monitorenter    
		if(p != null || F)
			break MISSING_BLOCK_LABEL_76;
	//    6   15:getstatic       #528 <Field Appboy p>
	//    7   18:ifnonnull       76
	//    8   21:getstatic       #538 <Field boolean F>
	//    9   24:ifne            76
		context = ((Context) (new m(context.getApplicationContext())));
	//   10   27:new             #870 <Class m>
	//   11   30:dup             
	//   12   31:aload_0         
	//   13   32:invokevirtual   #575 <Method Context Context.getApplicationContext()>
	//   14   35:invokespecial   #871 <Method void m(Context)>
	//   15   38:astore_0        
		if(appboyconfig == null)
			break MISSING_BLOCK_LABEL_57;
	//   16   39:aload_1         
	//   17   40:ifnull          57
		F = true;
	//   18   43:iconst_1        
	//   19   44:putstatic       #538 <Field boolean F>
		((m) (context)).a(appboyconfig);
	//   20   47:aload_0         
	//   21   48:aload_1         
	//   22   49:invokevirtual   #874 <Method void m.a(AppboyConfig)>
		com/appboy/Appboy;
	//   23   52:ldc1            #2   <Class Appboy>
		JVM INSTR monitorexit ;
	//   24   54:monitorexit     
		return true;
	//   25   55:iconst_1        
	//   26   56:ireturn         
		AppboyLogger.i(l, "Appboy.configure() called with a null config; Clearing all configuration values.");
	//   27   57:getstatic       #152 <Field String l>
	//   28   60:ldc2            #876 <String "Appboy.configure() called with a null config; Clearing all configuration values.">
	//   29   63:invokestatic    #622 <Method int AppboyLogger.i(String, String)>
	//   30   66:pop             
		((m) (context)).a();
	//   31   67:aload_0         
	//   32   68:invokevirtual   #877 <Method void m.a()>
		com/appboy/Appboy;
	//   33   71:ldc1            #2   <Class Appboy>
		JVM INSTR monitorexit ;
	//   34   73:monitorexit     
		return true;
	//   35   74:iconst_1        
	//   36   75:ireturn         
		AppboyLogger.i(l, "Appboy.configure() can only be called once during the lifetime of the singleton.");
	//   37   76:getstatic       #152 <Field String l>
	//   38   79:ldc2            #879 <String "Appboy.configure() can only be called once during the lifetime of the singleton.">
	//   39   82:invokestatic    #622 <Method int AppboyLogger.i(String, String)>
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
		AppboyLogger.w(l, "Appboy.configure() can only be called once during the lifetime of the singleton.");
	//   49   98:getstatic       #152 <Field String l>
	//   50  101:ldc2            #879 <String "Appboy.configure() can only be called once during the lifetime of the singleton.">
	//   51  104:invokestatic    #881 <Method int AppboyLogger.w(String, String)>
	//   52  107:pop             
		break MISSING_BLOCK_LABEL_121;
	//   53  108:goto            121
		AppboyLogger.w(l, "Appboy.configure() must be called before the first call to Appboy.getInstance()");
	//   54  111:getstatic       #152 <Field String l>
	//   55  114:ldc2            #883 <String "Appboy.configure() must be called before the first call to Appboy.getInstance()">
	//   56  117:invokestatic    #881 <Method int AppboyLogger.w(String, String)>
	//   57  120:pop             
		return false;
	//   58  121:iconst_0        
	//   59  122:ireturn         
	}

	static bj d(Appboy appboy)
	{
		return appboy.w;
	//    0    0:aload_0         
	//    1    1:getfield        #658 <Field bj w>
	//    2    4:areturn         
	}

	static boolean d()
	{
		return E;
	//    0    0:getstatic       #536 <Field boolean E>
	//    1    3:ireturn         
	}

	public static void disableSdk(Context context)
	{
		a(context).a(true);
	//    0    0:aload_0         
	//    1    1:invokestatic    #887 <Method dw a(Context)>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #888 <Method void dw.a(boolean)>
		AppboyLogger.w(l, "Stopping the SDK instance.");
	//    4    8:getstatic       #152 <Field String l>
	//    5   11:ldc2            #890 <String "Stopping the SDK instance.">
	//    6   14:invokestatic    #881 <Method int AppboyLogger.w(String, String)>
	//    7   17:pop             
		h();
	//    8   18:invokestatic    #892 <Method void h()>
		AppboyLogger.w(l, "Disabling all network requests");
	//    9   21:getstatic       #152 <Field String l>
	//   10   24:ldc2            #894 <String "Disabling all network requests">
	//   11   27:invokestatic    #881 <Method int AppboyLogger.w(String, String)>
	//   12   30:pop             
		setOutboundNetworkRequestsOffline(true);
	//   13   31:iconst_1        
	//   14   32:invokestatic    #897 <Method void setOutboundNetworkRequestsOffline(boolean)>
	//   15   35:return          
	}

	static bz e(Appboy appboy)
	{
		return appboy.s;
	//    0    0:aload_0         
	//    1    1:getfield        #582 <Field bz s>
	//    2    4:areturn         
	}

	static Set e()
	{
		return m;
	//    0    0:getstatic       #510 <Field Set m>
	//    1    3:areturn         
	}

	public static boolean enableMockAppboyNetworkRequestsAndDropEventsMode()
	{
		if(p != null)
			break MISSING_BLOCK_LABEL_67;
	//    0    0:getstatic       #528 <Field Appboy p>
	//    1    3:ifnonnull       67
		com/appboy/Appboy;
	//    2    6:ldc1            #2   <Class Appboy>
		JVM INSTR monitorenter ;
	//    3    8:monitorenter    
		if(p != null)
			break MISSING_BLOCK_LABEL_55;
	//    4    9:getstatic       #528 <Field Appboy p>
	//    5   12:ifnonnull       55
		if(!D)
			break MISSING_BLOCK_LABEL_36;
	//    6   15:getstatic       #534 <Field boolean D>
	//    7   18:ifeq            36
		AppboyLogger.i(l, "Appboy network requests already being mocked. Note that events dispatched in this mode are dropped.");
	//    8   21:getstatic       #152 <Field String l>
	//    9   24:ldc2            #901 <String "Appboy network requests already being mocked. Note that events dispatched in this mode are dropped.">
	//   10   27:invokestatic    #622 <Method int AppboyLogger.i(String, String)>
	//   11   30:pop             
		com/appboy/Appboy;
	//   12   31:ldc1            #2   <Class Appboy>
		JVM INSTR monitorexit ;
	//   13   33:monitorexit     
		return true;
	//   14   34:iconst_1        
	//   15   35:ireturn         
		AppboyLogger.i(l, "Appboy network requests will be mocked. Events dispatched in this mode will be dropped.");
	//   16   36:getstatic       #152 <Field String l>
	//   17   39:ldc2            #903 <String "Appboy network requests will be mocked. Events dispatched in this mode will be dropped.">
	//   18   42:invokestatic    #622 <Method int AppboyLogger.i(String, String)>
	//   19   45:pop             
		D = true;
	//   20   46:iconst_1        
	//   21   47:putstatic       #534 <Field boolean D>
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
		AppboyLogger.e(l, "Attempt to enable mocking Braze network requests had no effect since getInstance() has already been called.");
	//   34   67:getstatic       #152 <Field String l>
	//   35   70:ldc2            #905 <String "Attempt to enable mocking Braze network requests had no effect since getInstance() has already been called.">
	//   36   73:invokestatic    #907 <Method int AppboyLogger.e(String, String)>
	//   37   76:pop             
		return false;
	//   38   77:iconst_0        
	//   39   78:ireturn         
	}

	public static void enableSdk(Context context)
	{
		AppboyLogger.w(l, "Setting SDK to enabled.");
	//    0    0:getstatic       #152 <Field String l>
	//    1    3:ldc2            #910 <String "Setting SDK to enabled.">
	//    2    6:invokestatic    #881 <Method int AppboyLogger.w(String, String)>
	//    3    9:pop             
		a(context).a(false);
	//    4   10:aload_0         
	//    5   11:invokestatic    #887 <Method dw a(Context)>
	//    6   14:iconst_0        
	//    7   15:invokevirtual   #888 <Method void dw.a(boolean)>
		AppboyLogger.w(l, "Enabling all network requests");
	//    8   18:getstatic       #152 <Field String l>
	//    9   21:ldc2            #912 <String "Enabling all network requests">
	//   10   24:invokestatic    #881 <Method int AppboyLogger.w(String, String)>
	//   11   27:pop             
		setOutboundNetworkRequestsOffline(false);
	//   12   28:iconst_0        
	//   13   29:invokestatic    #897 <Method void setOutboundNetworkRequestsOffline(boolean)>
	//   14   32:return          
	}

	private ContentCardsUpdatedEvent f()
	{
		if(i())
	//*   0    0:invokestatic    #916 <Method boolean i()>
	//*   1    3:ifeq            8
			return null;
	//    2    6:aconst_null     
	//    3    7:areturn         
		ContentCardsUpdatedEvent contentcardsupdatedevent;
		try
		{
			contentcardsupdatedevent = (ContentCardsUpdatedEvent)k.submit(new Callable() {

				public ContentCardsUpdatedEvent a()
				{
					return a.h.a();
				//    0    0:aload_0         
				//    1    1:getfield        #18  <Field Appboy a>
				//    2    4:getfield        #26  <Field dn Appboy.h>
				//    3    7:invokevirtual   #30  <Method ContentCardsUpdatedEvent dn.a()>
				//    4   10:areturn         
				}

				public Object call()
				{
					return ((Object) (a()));
				//    0    0:aload_0         
				//    1    1:invokevirtual   #33  <Method ContentCardsUpdatedEvent a()>
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
	//    4    8:aload_0         
	//    5    9:getfield        #701 <Field bc k>
	//    6   12:new             #44  <Class Appboy$25>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokespecial   #917 <Method void Appboy$25(Appboy)>
	//   10   20:invokevirtual   #920 <Method Future bc.submit(Callable)>
	//   11   23:invokeinterface #926 <Method Object Future.get()>
	//   12   28:checkcast       #928 <Class ContentCardsUpdatedEvent>
	//   13   31:astore_1        
		}
	//*  14   32:aload_1         
	//*  15   33:areturn         
		catch(Exception exception)
	//*  16   34:astore_1        
		{
			AppboyLogger.w(l, "Failed to retrieve the cached ContentCardsUpdatedEvent.", ((Throwable) (exception)));
	//   17   35:getstatic       #152 <Field String l>
	//   18   38:ldc2            #930 <String "Failed to retrieve the cached ContentCardsUpdatedEvent.">
	//   19   41:aload_1         
	//   20   42:invokestatic    #932 <Method int AppboyLogger.w(String, String, Throwable)>
	//   21   45:pop             
			a(((Throwable) (exception)));
	//   22   46:aload_0         
	//   23   47:aload_1         
	//   24   48:invokespecial   #837 <Method void a(Throwable)>
			return null;
	//   25   51:aconst_null     
	//   26   52:areturn         
		}
		return contentcardsupdatedevent;
	}

	static void f(Appboy appboy)
	{
		appboy.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #934 <Method void g()>
	//    2    4:return          
	}

	static AppboyUser g(Appboy appboy)
	{
		return appboy.t;
	//    0    0:aload_0         
	//    1    1:getfield        #782 <Field AppboyUser t>
	//    2    4:areturn         
	}

	private void g()
	{
		Iterator iterator = o.iterator();
	//    0    0:getstatic       #526 <Field Set o>
	//    1    3:invokeinterface #939 <Method Iterator Set.iterator()>
	//    2    8:astore_2        
		boolean flag = true;
	//    3    9:iconst_1        
	//    4   10:istore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//    5   11:aload_2         
	//    6   12:invokeinterface #944 <Method boolean Iterator.hasNext()>
	//    7   17:ifeq            96
			String s1 = (String)iterator.next();
	//    8   20:aload_2         
	//    9   21:invokeinterface #947 <Method Object Iterator.next()>
	//   10   26:checkcast       #156 <Class String>
	//   11   29:astore_3        
			if(!PermissionUtils.hasPermission(q, s1))
	//*  12   30:aload_0         
	//*  13   31:getfield        #577 <Field Context q>
	//*  14   34:aload_3         
	//*  15   35:invokestatic    #953 <Method boolean PermissionUtils.hasPermission(Context, String)>
	//*  16   38:ifne            11
			{
				String s2 = l;
	//   17   41:getstatic       #152 <Field String l>
	//   18   44:astore          4
				StringBuilder stringbuilder = new StringBuilder();
	//   19   46:new             #609 <Class StringBuilder>
	//   20   49:dup             
	//   21   50:invokespecial   #610 <Method void StringBuilder()>
	//   22   53:astore          5
				stringbuilder.append("The Braze SDK requires the permission ");
	//   23   55:aload           5
	//   24   57:ldc2            #955 <String "The Braze SDK requires the permission ">
	//   25   60:invokevirtual   #616 <Method StringBuilder StringBuilder.append(String)>
	//   26   63:pop             
				stringbuilder.append(s1);
	//   27   64:aload           5
	//   28   66:aload_3         
	//   29   67:invokevirtual   #616 <Method StringBuilder StringBuilder.append(String)>
	//   30   70:pop             
				stringbuilder.append(". Check your app manifest.");
	//   31   71:aload           5
	//   32   73:ldc2            #957 <String ". Check your app manifest.">
	//   33   76:invokevirtual   #616 <Method StringBuilder StringBuilder.append(String)>
	//   34   79:pop             
				AppboyLogger.e(s2, stringbuilder.toString());
	//   35   80:aload           4
	//   36   82:aload           5
	//   37   84:invokevirtual   #620 <Method String StringBuilder.toString()>
	//   38   87:invokestatic    #907 <Method int AppboyLogger.e(String, String)>
	//   39   90:pop             
				flag = false;
	//   40   91:iconst_0        
	//   41   92:istore_1        
			}
		} while(true);
	//   42   93:goto            11
		if(i.getAppboyApiKey().toString().equals(""))
	//*  43   96:aload_0         
	//*  44   97:getfield        #637 <Field AppboyConfigurationProvider i>
	//*  45  100:invokevirtual   #961 <Method ch AppboyConfigurationProvider.getAppboyApiKey()>
	//*  46  103:invokevirtual   #964 <Method String ch.toString()>
	//*  47  106:ldc2            #966 <String "">
	//*  48  109:invokevirtual   #969 <Method boolean String.equals(Object)>
	//*  49  112:ifeq            127
		{
			AppboyLogger.e(l, "The Braze SDK requires a non-empty API key. Check your appboy.xml or AppboyConfig.");
	//   50  115:getstatic       #152 <Field String l>
	//   51  118:ldc2            #971 <String "The Braze SDK requires a non-empty API key. Check your appboy.xml or AppboyConfig.">
	//   52  121:invokestatic    #907 <Method int AppboyLogger.e(String, String)>
	//   53  124:pop             
			flag = false;
	//   54  125:iconst_0        
	//   55  126:istore_1        
		}
		if(!flag)
	//*  56  127:iload_1         
	//*  57  128:ifne            141
			AppboyLogger.e(l, "The Braze SDK is not integrated correctly. Please visit https://www.braze.com/documentation/Android");
	//   58  131:getstatic       #152 <Field String l>
	//   59  134:ldc2            #973 <String "The Braze SDK is not integrated correctly. Please visit https://www.braze.com/documentation/Android">
	//   60  137:invokestatic    #907 <Method int AppboyLogger.e(String, String)>
	//   61  140:pop             
	//   62  141:return          
	}

	public static Uri getAppboyApiEndpoint(Uri uri)
	{
		Object obj = A;
	//    0    0:getstatic       #532 <Field Object A>
	//    1    3:astore_1        
		obj;
	//    2    4:aload_1         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		Object obj1 = ((Object) (B));
	//    4    6:getstatic       #866 <Field IAppboyEndpointProvider B>
	//    5    9:astore_2        
		if(obj1 == null) goto _L2; else goto _L1
	//    6   10:aload_2         
	//    7   11:ifnull          42
_L1:
		obj1 = ((Object) (B.getApiEndpoint(uri)));
	//    8   14:getstatic       #866 <Field IAppboyEndpointProvider B>
	//    9   17:aload_0         
	//   10   18:invokeinterface #980 <Method Uri IAppboyEndpointProvider.getApiEndpoint(Uri)>
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
		AppboyLogger.e(l, "Caught exception trying to get a Braze API endpoint from the AppboyEndpointProvider. Using the original URI");
	//   18   32:getstatic       #152 <Field String l>
	//   19   35:ldc2            #982 <String "Caught exception trying to get a Braze API endpoint from the AppboyEndpointProvider. Using the original URI">
	//   20   38:invokestatic    #907 <Method int AppboyLogger.e(String, String)>
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
		return C;
	//    0    0:getstatic       #986 <Field IAppboyNotificationFactory C>
	//    1    3:areturn         
	}

	public static Appboy getInstance(Context context)
	{
		if(p != null && !p.z) goto _L2; else goto _L1
	//    0    0:getstatic       #528 <Field Appboy p>
	//    1    3:ifnull          15
	//    2    6:getstatic       #528 <Field Appboy p>
	//    3    9:getfield        #542 <Field boolean z>
	//    4   12:ifeq            39
_L1:
		com/appboy/Appboy;
	//    5   15:ldc1            #2   <Class Appboy>
		JVM INSTR monitorenter ;
	//    6   17:monitorenter    
		if(p == null || p.z)
	//*   7   18:getstatic       #528 <Field Appboy p>
	//*   8   21:ifnull          43
	//*   9   24:getstatic       #528 <Field Appboy p>
	//*  10   27:getfield        #542 <Field boolean z>
	//*  11   30:ifeq            36
			break MISSING_BLOCK_LABEL_43;
	//   12   33:goto            43
		com/appboy/Appboy;
	//   13   36:ldc1            #2   <Class Appboy>
		JVM INSTR monitorexit ;
	//   14   38:monitorexit     
_L2:
		return p;
	//   15   39:getstatic       #528 <Field Appboy p>
	//   16   42:areturn         
		setOutboundNetworkRequestsOffline(a(context).a());
	//   17   43:aload_0         
	//   18   44:invokestatic    #887 <Method dw a(Context)>
	//   19   47:invokevirtual   #990 <Method boolean dw.a()>
	//   20   50:invokestatic    #897 <Method void setOutboundNetworkRequestsOffline(boolean)>
		p = new Appboy(context);
	//   21   53:new             #2   <Class Appboy>
	//   22   56:dup             
	//   23   57:aload_0         
	//   24   58:invokespecial   #991 <Method void Appboy(Context)>
	//   25   61:putstatic       #528 <Field Appboy p>
		context = ((Context) (p));
	//   26   64:getstatic       #528 <Field Appboy p>
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
		return E;
	//    0    0:getstatic       #536 <Field boolean E>
	//    1    3:ireturn         
	}

	static IAppboyImageLoader h(Appboy appboy)
	{
		return appboy.y;
	//    0    0:aload_0         
	//    1    1:getfield        #632 <Field IAppboyImageLoader y>
	//    2    4:areturn         
	}

	private static void h()
	{
		AppboyLogger.i(l, "Shutting down all queued work on the Braze SDK");
	//    0    0:getstatic       #152 <Field String l>
	//    1    3:ldc2            #995 <String "Shutting down all queued work on the Braze SDK">
	//    2    6:invokestatic    #622 <Method int AppboyLogger.i(String, String)>
	//    3    9:pop             
		com/appboy/Appboy;
	//    4   10:ldc1            #2   <Class Appboy>
		JVM INSTR monitorenter ;
	//    5   12:monitorenter    
		eq eq1;
		if(p == null)
			break MISSING_BLOCK_LABEL_109;
	//    6   13:getstatic       #528 <Field Appboy p>
	//    7   16:ifnull          109
		if(p.k != null)
	//*   8   19:getstatic       #528 <Field Appboy p>
	//*   9   22:getfield        #701 <Field bc k>
	//*  10   25:ifnull          48
		{
			AppboyLogger.d(l, "Shutting down the user dependency executor");
	//   11   28:getstatic       #152 <Field String l>
	//   12   31:ldc2            #997 <String "Shutting down the user dependency executor">
	//   13   34:invokestatic    #553 <Method int AppboyLogger.d(String, String)>
	//   14   37:pop             
			p.k.shutdownNow();
	//   15   38:getstatic       #528 <Field Appboy p>
	//   16   41:getfield        #701 <Field bc k>
	//   17   44:invokevirtual   #1001 <Method java.util.List bc.shutdownNow()>
	//   18   47:pop             
		}
		eq1 = p.b;
	//   19   48:getstatic       #528 <Field Appboy p>
	//   20   51:getfield        #737 <Field eq b>
	//   21   54:astore_0        
		if(eq1 == null)
			break MISSING_BLOCK_LABEL_102;
	//   22   55:aload_0         
	//   23   56:ifnull          102
		if(eq1.b() != null)
	//*  24   59:aload_0         
	//*  25   60:invokevirtual   #1004 <Method q eq.b()>
	//*  26   63:ifnull          74
			eq1.b().a(true);
	//   27   66:aload_0         
	//   28   67:invokevirtual   #1004 <Method q eq.b()>
	//   29   70:iconst_1        
	//   30   71:invokevirtual   #1007 <Method void q.a(boolean)>
		if(eq1.k() != null)
	//*  31   74:aload_0         
	//*  32   75:invokevirtual   #817 <Method bk eq.k()>
	//*  33   78:ifnull          88
			eq1.k().a();
	//   34   81:aload_0         
	//   35   82:invokevirtual   #817 <Method bk eq.k()>
	//   36   85:invokevirtual   #1008 <Method void bk.a()>
		if(eq1.m() != null)
	//*  37   88:aload_0         
	//*  38   89:invokevirtual   #760 <Method bl eq.m()>
	//*  39   92:ifnull          102
			eq1.m().b();
	//   40   95:aload_0         
	//   41   96:invokevirtual   #760 <Method bl eq.m()>
	//   42   99:invokevirtual   #1012 <Method void bl.b()>
		p.z = true;
	//   43  102:getstatic       #528 <Field Appboy p>
	//   44  105:iconst_1        
	//   45  106:putfield        #542 <Field boolean z>
		com/appboy/Appboy;
	//   46  109:ldc1            #2   <Class Appboy>
		JVM INSTR monitorexit ;
	//   47  111:monitorexit     
		return;
	//   48  112:return          
		Exception exception;
		exception;
	//   49  113:astore_0        
		com/appboy/Appboy;
	//   50  114:ldc1            #2   <Class Appboy>
		JVM INSTR monitorexit ;
	//   51  116:monitorexit     
		try
		{
			throw exception;
	//   52  117:aload_0         
	//   53  118:athrow          
		}
		catch(Exception exception1)
	//*  54  119:astore_0        
		{
			AppboyLogger.w(l, "Failed to shutdown queued work on the Braze SDK.", ((Throwable) (exception1)));
	//   55  120:getstatic       #152 <Field String l>
	//   56  123:ldc2            #1014 <String "Failed to shutdown queued work on the Braze SDK.">
	//   57  126:aload_0         
	//   58  127:invokestatic    #932 <Method int AppboyLogger.w(String, String, Throwable)>
	//   59  130:pop             
		}
		return;
	//   60  131:return          
	}

	private static boolean i()
	{
		if(G == null)
	//*   0    0:getstatic       #662 <Field dw G>
	//*   1    3:ifnonnull       18
		{
			AppboyLogger.d(l, "SDK enablement provider was null. Returning SDK as enabled.");
	//    2    6:getstatic       #152 <Field String l>
	//    3    9:ldc2            #1016 <String "SDK enablement provider was null. Returning SDK as enabled.">
	//    4   12:invokestatic    #553 <Method int AppboyLogger.d(String, String)>
	//    5   15:pop             
			return false;
	//    6   16:iconst_0        
	//    7   17:ireturn         
		}
		boolean flag = G.a();
	//    8   18:getstatic       #662 <Field dw G>
	//    9   21:invokevirtual   #990 <Method boolean dw.a()>
	//   10   24:istore_0        
		if(flag)
	//*  11   25:iload_0         
	//*  12   26:ifeq            39
			AppboyLogger.w(l, "SDK is disabled. Not performing action on SDK.");
	//   13   29:getstatic       #152 <Field String l>
	//   14   32:ldc2            #1018 <String "SDK is disabled. Not performing action on SDK.">
	//   15   35:invokestatic    #881 <Method int AppboyLogger.w(String, String)>
	//   16   38:pop             
		return flag;
	//   17   39:iload_0         
	//   18   40:ireturn         
	}

	public static void setAppboyEndpointProvider(IAppboyEndpointProvider iappboyendpointprovider)
	{
		synchronized(A)
	//*   0    0:getstatic       #532 <Field Object A>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			B = iappboyendpointprovider;
	//    4    6:aload_0         
	//    5    7:putstatic       #866 <Field IAppboyEndpointProvider B>
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
		AppboyLogger.d(l, "Custom Braze notification factory set");
	//    0    0:getstatic       #152 <Field String l>
	//    1    3:ldc2            #1022 <String "Custom Braze notification factory set">
	//    2    6:invokestatic    #553 <Method int AppboyLogger.d(String, String)>
	//    3    9:pop             
		C = iappboynotificationfactory;
	//    4   10:aload_0         
	//    5   11:putstatic       #986 <Field IAppboyNotificationFactory C>
	//    6   14:return          
	}

	public static void setOutboundNetworkRequestsOffline(boolean flag)
	{
		String s2 = l;
	//    0    0:getstatic       #152 <Field String l>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #609 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #610 <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("Appboy outbound network requests are now ");
	//    6   12:aload_3         
	//    7   13:ldc2            #1024 <String "Appboy outbound network requests are now ">
	//    8   16:invokevirtual   #616 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		String s1;
		if(flag)
	//*  10   20:iload_0         
	//*  11   21:ifeq            31
			s1 = "disabled";
	//   12   24:ldc2            #1026 <String "disabled">
	//   13   27:astore_1        
		else
	//*  14   28:goto            35
			s1 = "enabled";
	//   15   31:ldc2            #1028 <String "enabled">
	//   16   34:astore_1        
		stringbuilder.append(s1);
	//   17   35:aload_3         
	//   18   36:aload_1         
	//   19   37:invokevirtual   #616 <Method StringBuilder StringBuilder.append(String)>
	//   20   40:pop             
		AppboyLogger.i(s2, stringbuilder.toString());
	//   21   41:aload_2         
	//   22   42:aload_3         
	//   23   43:invokevirtual   #620 <Method String StringBuilder.toString()>
	//   24   46:invokestatic    #622 <Method int AppboyLogger.i(String, String)>
	//   25   49:pop             
		com/appboy/Appboy;
	//   26   50:ldc1            #2   <Class Appboy>
		JVM INSTR monitorenter ;
	//   27   52:monitorenter    
		E = flag;
	//   28   53:iload_0         
	//   29   54:putstatic       #536 <Field boolean E>
		if(p != null)
	//*  30   57:getstatic       #528 <Field Appboy p>
	//*  31   60:ifnull          70
			p.b(flag);
	//   32   63:getstatic       #528 <Field Appboy p>
	//   33   66:iload_0         
	//   34   67:invokespecial   #1030 <Method void b(boolean)>
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
		h();
	//    0    0:invokestatic    #892 <Method void h()>
		try
		{
			ge.a(context);
	//    1    3:aload_0         
	//    2    4:invokestatic    #1035 <Method void ge.a(Context)>
			AppboyLruImageLoader.deleteStoredData(context);
	//    3    7:aload_0         
	//    4    8:invokestatic    #1038 <Method void AppboyLruImageLoader.deleteStoredData(Context)>
		}
	//*   5   11:goto            26
		catch(Exception exception)
	//*   6   14:astore_3        
		{
			AppboyLogger.w(l, "Failed to delete data from the internal storage cache.", ((Throwable) (exception)));
	//    7   15:getstatic       #152 <Field String l>
	//    8   18:ldc2            #1040 <String "Failed to delete data from the internal storage cache.">
	//    9   21:aload_3         
	//   10   22:invokestatic    #932 <Method int AppboyLogger.w(String, String, Throwable)>
	//   11   25:pop             
		}
		try
		{
			dl.a(context);
	//   12   26:aload_0         
	//   13   27:invokestatic    #1043 <Method void dl.a(Context)>
		}
	//*  14   30:goto            45
		catch(Exception exception1)
	//*  15   33:astore_3        
		{
			AppboyLogger.w(l, "Failed to delete Braze database files for the Braze SDK.", ((Throwable) (exception1)));
	//   16   34:getstatic       #152 <Field String l>
	//   17   37:ldc2            #1045 <String "Failed to delete Braze database files for the Braze SDK.">
	//   18   40:aload_3         
	//   19   41:invokestatic    #932 <Method int AppboyLogger.w(String, String, Throwable)>
	//   20   44:pop             
		}
		context = ((Context) (new File(context.getApplicationInfo().dataDir, "shared_prefs")));
	//   21   45:new             #1047 <Class File>
	//   22   48:dup             
	//   23   49:aload_0         
	//   24   50:invokevirtual   #1051 <Method ApplicationInfo Context.getApplicationInfo()>
	//   25   53:getfield        #1056 <Field String ApplicationInfo.dataDir>
	//   26   56:ldc2            #1058 <String "shared_prefs">
	//   27   59:invokespecial   #1061 <Method void File(String, String)>
	//   28   62:astore_0        
		if(!((File) (context)).exists() || !((File) (context)).isDirectory()) goto _L2; else goto _L1
	//   29   63:aload_0         
	//   30   64:invokevirtual   #1064 <Method boolean File.exists()>
	//   31   67:ifeq            170
	//   32   70:aload_0         
	//   33   71:invokevirtual   #1067 <Method boolean File.isDirectory()>
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
	//   36   78:new             #30  <Class Appboy$19>
	//   37   81:dup             
	//   38   82:invokespecial   #1068 <Method void Appboy$19()>
	//   39   85:invokevirtual   #1072 <Method File[] File.listFiles(FilenameFilter)>
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
		String s1 = l;
	//   53  103:getstatic       #152 <Field String l>
	//   54  106:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//   55  108:new             #609 <Class StringBuilder>
	//   56  111:dup             
	//   57  112:invokespecial   #610 <Method void StringBuilder()>
	//   58  115:astore          5
		stringbuilder.append("Deleting shared prefs file at: ");
	//   59  117:aload           5
	//   60  119:ldc2            #1074 <String "Deleting shared prefs file at: ">
	//   61  122:invokevirtual   #616 <Method StringBuilder StringBuilder.append(String)>
	//   62  125:pop             
		stringbuilder.append(file.getAbsolutePath());
	//   63  126:aload           5
	//   64  128:aload_3         
	//   65  129:invokevirtual   #1077 <Method String File.getAbsolutePath()>
	//   66  132:invokevirtual   #616 <Method StringBuilder StringBuilder.append(String)>
	//   67  135:pop             
		AppboyLogger.v(s1, stringbuilder.toString());
	//   68  136:aload           4
	//   69  138:aload           5
	//   70  140:invokevirtual   #620 <Method String StringBuilder.toString()>
	//   71  143:invokestatic    #1079 <Method int AppboyLogger.v(String, String)>
	//   72  146:pop             
		AppboyFileUtils.deleteFileOrDirectory(file);
	//   73  147:aload_3         
	//   74  148:invokestatic    #1085 <Method void AppboyFileUtils.deleteFileOrDirectory(File)>
		i1++;
	//   75  151:iload_1         
	//   76  152:iconst_1        
	//   77  153:iadd            
	//   78  154:istore_1        
		if(true) goto _L3; else goto _L2
	//   79  155:goto            94
		context;
	//   80  158:astore_0        
		AppboyLogger.w(l, "Failed to delete shared preference data for the Braze SDK.", ((Throwable) (context)));
	//   81  159:getstatic       #152 <Field String l>
	//   82  162:ldc2            #1087 <String "Failed to delete shared preference data for the Braze SDK.">
	//   83  165:aload_0         
	//   84  166:invokestatic    #932 <Method int AppboyLogger.w(String, String, Throwable)>
	//   85  169:pop             
_L2:
	//   86  170:return          
	}

	void a()
	{
		if(i())
	//*   0    0:invokestatic    #916 <Method boolean i()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			k.submit(new Runnable() {

				public void run()
				{
					try
					{
						if(a.e != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #16  <Field Appboy a>
				//*   2    4:getfield        #26  <Field bl Appboy.e>
				//*   3    7:ifnull          21
						{
							a.e.a();
				//    4   10:aload_0         
				//    5   11:getfield        #16  <Field Appboy a>
				//    6   14:getfield        #26  <Field bl Appboy.e>
				//    7   17:invokevirtual   #29  <Method void bl.a()>
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
	//    4    8:getfield        #701 <Field bc k>
	//    5   11:new             #46  <Class Appboy$26>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:invokespecial   #1088 <Method void Appboy$26(Appboy)>
	//    9   19:invokevirtual   #706 <Method Future bc.submit(Runnable)>
	//   10   22:pop             
			return;
	//   11   23:return          
		}
	}

	void a(cd cd)
	{
		if(i())
	//*   0    0:invokestatic    #916 <Method boolean i()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			k.submit(new Runnable(cd) {

				public void run()
				{
					try
					{
						if(b.e != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #18  <Field Appboy b>
				//*   2    4:getfield        #31  <Field bl Appboy.e>
				//*   3    7:ifnull          25
						{
							b.e.a(a);
				//    4   10:aload_0         
				//    5   11:getfield        #18  <Field Appboy b>
				//    6   14:getfield        #31  <Field bl Appboy.e>
				//    7   17:aload_0         
				//    8   18:getfield        #20  <Field cd a>
				//    9   21:invokevirtual   #34  <Method void bl.a(cd)>
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

				final cd a;
				final Appboy b;

			
			{
				b = Appboy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field Appboy b>
				a = cd;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field cd a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #701 <Field bc k>
	//    5   11:new             #34  <Class Appboy$20>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #1092 <Method void Appboy$20(Appboy, cd)>
	//   10   20:invokevirtual   #706 <Method Future bc.submit(Runnable)>
	//   11   23:pop             
			return;
	//   12   24:return          
		}
	}

	void a(String s1, x x1)
	{
		if(i())
	//*   0    0:invokestatic    #916 <Method boolean i()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			k.submit(new Runnable(s1, x1) {

				public void run()
				{
					try
					{
						if(c.e != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #20  <Field Appboy c>
				//*   2    4:getfield        #35  <Field bl Appboy.e>
				//*   3    7:ifnull          29
						{
							c.e.b(a, b);
				//    4   10:aload_0         
				//    5   11:getfield        #20  <Field Appboy c>
				//    6   14:getfield        #35  <Field bl Appboy.e>
				//    7   17:aload_0         
				//    8   18:getfield        #22  <Field String a>
				//    9   21:aload_0         
				//   10   22:getfield        #24  <Field x b>
				//   11   25:invokevirtual   #39  <Method void bl.b(String, x)>
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
				final x b;
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
				b = x1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field x b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #701 <Field bc k>
	//    5   11:new             #38  <Class Appboy$22>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokespecial   #1096 <Method void Appboy$22(Appboy, String, x)>
	//   11   21:invokevirtual   #706 <Method Future bc.submit(Runnable)>
	//   12   24:pop             
			return;
	//   13   25:return          
		}
	}

	void a(String s1, String s2)
	{
		if(i())
	//*   0    0:invokestatic    #916 <Method boolean i()>
	//*   1    3:ifeq            7
			return;
	//    2    6:return          
		if(StringUtils.isNullOrBlank(s1))
	//*   3    7:aload_1         
	//*   4    8:invokestatic    #646 <Method boolean StringUtils.isNullOrBlank(String)>
	//*   5   11:ifeq            70
		{
			String s3 = l;
	//    6   14:getstatic       #152 <Field String l>
	//    7   17:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//    8   18:new             #609 <Class StringBuilder>
	//    9   21:dup             
	//   10   22:invokespecial   #610 <Method void StringBuilder()>
	//   11   25:astore          4
			stringbuilder.append("Cannot add null or blank card json to storage. Returning. User id: ");
	//   12   27:aload           4
	//   13   29:ldc2            #1098 <String "Cannot add null or blank card json to storage. Returning. User id: ">
	//   14   32:invokevirtual   #616 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:pop             
			stringbuilder.append(s2);
	//   16   36:aload           4
	//   17   38:aload_2         
	//   18   39:invokevirtual   #616 <Method StringBuilder StringBuilder.append(String)>
	//   19   42:pop             
			stringbuilder.append(" Serialized json: ");
	//   20   43:aload           4
	//   21   45:ldc2            #1100 <String " Serialized json: ">
	//   22   48:invokevirtual   #616 <Method StringBuilder StringBuilder.append(String)>
	//   23   51:pop             
			stringbuilder.append(s1);
	//   24   52:aload           4
	//   25   54:aload_1         
	//   26   55:invokevirtual   #616 <Method StringBuilder StringBuilder.append(String)>
	//   27   58:pop             
			AppboyLogger.w(s3, stringbuilder.toString());
	//   28   59:aload_3         
	//   29   60:aload           4
	//   30   62:invokevirtual   #620 <Method String StringBuilder.toString()>
	//   31   65:invokestatic    #881 <Method int AppboyLogger.w(String, String)>
	//   32   68:pop             
			return;
	//   33   69:return          
		} else
		{
			k.submit(new Runnable(s1, s2) {

				public void run()
				{
					try
					{
						cq cq1 = new cq(a);
				//    0    0:new             #32  <Class cq>
				//    1    3:dup             
				//    2    4:aload_0         
				//    3    5:getfield        #21  <Field String a>
				//    4    8:invokespecial   #35  <Method void cq(String)>
				//    5   11:astore_1        
						c.h.a(cq1, b);
				//    6   12:aload_0         
				//    7   13:getfield        #19  <Field Appboy c>
				//    8   16:getfield        #39  <Field dn Appboy.h>
				//    9   19:aload_1         
				//   10   20:aload_0         
				//   11   21:getfield        #23  <Field String b>
				//   12   24:invokevirtual   #44  <Method ContentCardsUpdatedEvent dn.a(cq, String)>
				//   13   27:pop             
						return;
				//   14   28:return          
					}
					catch(Exception exception)
				//*  15   29:astore_1        
					{
						String s4 = Appboy.b();
				//   16   30:invokestatic    #47  <Method String Appboy.b()>
				//   17   33:astore_2        
						StringBuilder stringbuilder1 = new StringBuilder();
				//   18   34:new             #49  <Class StringBuilder>
				//   19   37:dup             
				//   20   38:invokespecial   #50  <Method void StringBuilder()>
				//   21   41:astore_3        
						stringbuilder1.append("Failed to update ContentCard storage provider with single card update. User id: ");
				//   22   42:aload_3         
				//   23   43:ldc1            #52  <String "Failed to update ContentCard storage provider with single card update. User id: ">
				//   24   45:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
				//   25   48:pop             
						stringbuilder1.append(b);
				//   26   49:aload_3         
				//   27   50:aload_0         
				//   28   51:getfield        #23  <Field String b>
				//   29   54:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
				//   30   57:pop             
						stringbuilder1.append(" Serialized json: ");
				//   31   58:aload_3         
				//   32   59:ldc1            #58  <String " Serialized json: ">
				//   33   61:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
				//   34   64:pop             
						stringbuilder1.append(a);
				//   35   65:aload_3         
				//   36   66:aload_0         
				//   37   67:getfield        #21  <Field String a>
				//   38   70:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
				//   39   73:pop             
						AppboyLogger.e(s4, stringbuilder1.toString(), ((Throwable) (exception)));
				//   40   74:aload_2         
				//   41   75:aload_3         
				//   42   76:invokevirtual   #61  <Method String StringBuilder.toString()>
				//   43   79:aload_1         
				//   44   80:invokestatic    #67  <Method int AppboyLogger.e(String, String, Throwable)>
				//   45   83:pop             
						return;
				//   46   84:return          
					}
				}

				final String a;
				final String b;
				final Appboy c;

			
			{
				c = Appboy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field Appboy c>
				a = s1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String a>
				b = s2;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #23  <Field String b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #26  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//   34   70:aload_0         
	//   35   71:getfield        #701 <Field bc k>
	//   36   74:new             #42  <Class Appboy$24>
	//   37   77:dup             
	//   38   78:aload_0         
	//   39   79:aload_1         
	//   40   80:aload_2         
	//   41   81:invokespecial   #1103 <Method void Appboy$24(Appboy, String, String)>
	//   42   84:invokevirtual   #706 <Method Future bc.submit(Runnable)>
	//   43   87:pop             
			return;
	//   44   88:return          
		}
	}

	void a(boolean flag)
	{
		if(i())
	//*   0    0:invokestatic    #916 <Method boolean i()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			k.submit(new Runnable(flag) {

				public void run()
				{
					try
					{
						if(b.e != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #18  <Field Appboy b>
				//*   2    4:getfield        #31  <Field bl Appboy.e>
				//*   3    7:ifnull          25
						{
							b.e.b(a);
				//    4   10:aload_0         
				//    5   11:getfield        #18  <Field Appboy b>
				//    6   14:getfield        #31  <Field bl Appboy.e>
				//    7   17:aload_0         
				//    8   18:getfield        #20  <Field boolean a>
				//    9   21:invokevirtual   #35  <Method void bl.b(boolean)>
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
	//    4    8:getfield        #701 <Field bc k>
	//    5   11:new             #36  <Class Appboy$21>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:invokespecial   #1104 <Method void Appboy$21(Appboy, boolean)>
	//   10   20:invokevirtual   #706 <Method Future bc.submit(Runnable)>
	//   11   23:pop             
			return;
	//   12   24:return          
		}
	}

	public void changeUser(String s1)
	{
		if(i())
	//*   0    0:invokestatic    #916 <Method boolean i()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			k.submit(new Runnable(s1) {

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
				//*  70  137:invokestatic    #84  <Method l Appboy.b(Appboy)>
				//*  71  140:aload_0         
				//*  72  141:getfield        #21  <Field String a>
				//*  73  144:invokevirtual   #88  <Method void l.b(String)>
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
				//* 121  237:invokestatic    #106 <Method long eb.a()>
				//* 122  240:invokespecial   #109 <Method void FeedUpdatedEvent(java.util.List, String, boolean, long)>
				//* 123  243:astore_1        
				//* 124  244:aload_0         
				//* 125  245:getfield        #19  <Field Appboy b>
				//* 126  248:invokestatic    #113 <Method ac Appboy.c(Appboy)>
				//* 127  251:aload_1         
				//* 128  252:ldc1            #98  <Class FeedUpdatedEvent>
				//* 129  254:invokevirtual   #118 <Method void ac.a(Object, Class)>
				//* 130  257:aload_0         
				//* 131  258:getfield        #19  <Field Appboy b>
				//* 132  261:getfield        #121 <Field bo Appboy.g>
				//* 133  264:invokevirtual   #125 <Method void bo.c()>
				//* 134  267:aload_0         
				//* 135  268:getfield        #19  <Field Appboy b>
				//* 136  271:invokestatic    #84  <Method l Appboy.b(Appboy)>
				//* 137  274:aload_0         
				//* 138  275:getfield        #21  <Field String a>
				//* 139  278:invokevirtual   #126 <Method void l.a(String)>
				//* 140  281:aload_0         
				//* 141  282:getfield        #19  <Field Appboy b>
				//* 142  285:getfield        #129 <Field eq Appboy.b>
				//* 143  288:astore_1        
				//* 144  289:new             #131 <Class eq>
				//* 145  292:dup             
				//* 146  293:aload_0         
				//* 147  294:getfield        #19  <Field Appboy b>
				//* 148  297:invokestatic    #134 <Method Context Appboy.a(Appboy)>
				//* 149  300:aload_0         
				//* 150  301:getfield        #19  <Field Appboy b>
				//* 151  304:invokestatic    #84  <Method l Appboy.b(Appboy)>
				//* 152  307:aload_0         
				//* 153  308:getfield        #19  <Field Appboy b>
				//* 154  311:getfield        #137 <Field AppboyConfigurationProvider Appboy.i>
				//* 155  314:aload_0         
				//* 156  315:getfield        #19  <Field Appboy b>
				//* 157  318:invokestatic    #113 <Method ac Appboy.c(Appboy)>
				//* 158  321:aload_0         
				//* 159  322:getfield        #19  <Field Appboy b>
				//* 160  325:invokestatic    #141 <Method bj Appboy.d(Appboy)>
				//* 161  328:aload_0         
				//* 162  329:getfield        #19  <Field Appboy b>
				//* 163  332:getfield        #145 <Field bx Appboy.j>
				//* 164  335:invokestatic    #148 <Method boolean Appboy.c()>
				//* 165  338:invokestatic    #150 <Method boolean Appboy.d()>
				//* 166  341:aload_0         
				//* 167  342:getfield        #19  <Field Appboy b>
				//* 168  345:invokestatic    #153 <Method bz Appboy.e(Appboy)>
				//* 169  348:invokespecial   #156 <Method void eq(Context, l, AppboyConfigurationProvider, ad, bj, bx, boolean, boolean, bz)>
				//* 170  351:astore_2        
				//* 171  352:aload_0         
				//* 172  353:getfield        #19  <Field Appboy b>
				//* 173  356:aload_2         
				//* 174  357:invokestatic    #159 <Method void Appboy.a(Appboy, eq)>
				//* 175  360:aload_0         
				//* 176  361:getfield        #19  <Field Appboy b>
				//* 177  364:getfield        #129 <Field eq Appboy.b>
				//* 178  367:invokevirtual   #162 <Method ea eq.g()>
				//* 179  370:invokevirtual   #166 <Method void ea.d()>
				//* 180  373:aload_0         
				//* 181  374:getfield        #19  <Field Appboy b>
				//* 182  377:getfield        #121 <Field bo Appboy.g>
				//* 183  380:invokevirtual   #169 <Method cf bo.a()>
				//* 184  383:pop             
				//* 185  384:aload_0         
				//* 186  385:getfield        #19  <Field Appboy b>
				//* 187  388:getfield        #121 <Field bo Appboy.g>
				//* 188  391:new             #171 <Class bo.app.cm$a>
				//* 189  394:dup             
				//* 190  395:invokespecial   #172 <Method void bo.app.cm$a()>
				//* 191  398:invokevirtual   #175 <Method bo.app.cm$a bo.app.cm$a.a()>
				//* 192  401:invokevirtual   #178 <Method void bo.a(bo.app.cm$a)>
				//* 193  404:aload_0         
				//* 194  405:getfield        #19  <Field Appboy b>
				//* 195  408:iconst_0        
				//* 196  409:invokevirtual   #182 <Method void Appboy.requestContentCardsRefresh(boolean)>
				//* 197  412:aload_1         
				//* 198  413:invokevirtual   #185 <Method void eq.o()>
				//* 199  416:return          
					catch(Exception exception)
				//* 200  417:astore_1        
					{
						String s3 = Appboy.b();
				//  201  418:invokestatic    #37  <Method String Appboy.b()>
				//  202  421:astore_2        
						StringBuilder stringbuilder3 = new StringBuilder();
				//  203  422:new             #62  <Class StringBuilder>
				//  204  425:dup             
				//  205  426:invokespecial   #63  <Method void StringBuilder()>
				//  206  429:astore_3        
						stringbuilder3.append("Failed to set external id to: ");
				//  207  430:aload_3         
				//  208  431:ldc1            #187 <String "Failed to set external id to: ">
				//  209  433:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
				//  210  436:pop             
						stringbuilder3.append(a);
				//  211  437:aload_3         
				//  212  438:aload_0         
				//  213  439:getfield        #21  <Field String a>
				//  214  442:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
				//  215  445:pop             
						AppboyLogger.w(s3, stringbuilder3.toString(), ((Throwable) (exception)));
				//  216  446:aload_2         
				//  217  447:aload_3         
				//  218  448:invokevirtual   #74  <Method String StringBuilder.toString()>
				//  219  451:aload_1         
				//  220  452:invokestatic    #191 <Method int AppboyLogger.w(String, String, Throwable)>
				//  221  455:pop             
						Appboy.a(b, ((Throwable) (exception)));
				//  222  456:aload_0         
				//  223  457:getfield        #19  <Field Appboy b>
				//  224  460:aload_1         
				//  225  461:invokestatic    #194 <Method void Appboy.a(Appboy, Throwable)>
						return;
				//  226  464:return          
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
					obj = ((Object) (new FeedUpdatedEvent(((java.util.List) (new ArrayList())), a, false, eb.a())));
					Appboy.c(b).a(obj, com/appboy/events/FeedUpdatedEvent);
					b.g.c();
					Appboy.b(b).a(a);
					eq eq1 = b.b;
					eq eq2 = new eq(Appboy.a(b), Appboy.b(b), b.i, ((ad) (Appboy.c(b))), Appboy.d(b), b.j, Appboy.c(), Appboy.d(), Appboy.e(b));
					Appboy.a(b, eq2);
					b.b.g().d();
					b.g.a();
					b.g.a((new bo.app.cm.a()).a());
					b.requestContentCardsRefresh(false);
					eq1.o();
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
	//    4    8:getfield        #701 <Field bc k>
	//    5   11:new             #22  <Class Appboy$15>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #1106 <Method void Appboy$15(Appboy, String)>
	//   10   20:invokevirtual   #706 <Method Future bc.submit(Runnable)>
	//   11   23:pop             
			return;
	//   12   24:return          
		}
	}

	public void closeSession(Activity activity)
	{
		if(i())
	//*   0    0:invokestatic    #916 <Method boolean i()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			k.submit(new Runnable(activity) {

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
					cf cf1 = b.g.b(a);
				//    8   17:aload_0         
				//    9   18:getfield        #19  <Field Appboy b>
				//   10   21:getfield        #43  <Field bo Appboy.g>
				//   11   24:aload_0         
				//   12   25:getfield        #21  <Field Activity a>
				//   13   28:invokevirtual   #48  <Method cf bo.b(Activity)>
				//   14   31:astore_1        
					if(cf1 != null)
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
							stringbuilder.append(((Object) (cf1.a())));
				//   27   55:aload_3         
				//   28   56:aload_1         
				//   29   57:invokevirtual   #62  <Method bo.app.cg cf.a()>
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
	//    4    8:getfield        #701 <Field bc k>
	//    5   11:new             #58  <Class Appboy$31>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #1111 <Method void Appboy$31(Appboy, Activity)>
	//   10   20:invokevirtual   #706 <Method Future bc.submit(Runnable)>
	//   11   23:pop             
			return;
	//   12   24:return          
		}
	}

	public IInAppMessage deserializeInAppMessageString(String s1)
	{
		return ej.a(s1, ((bo.app.bt) (g)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #744 <Field bo g>
	//    3    5:invokestatic    #1118 <Method IInAppMessage ej.a(String, bo.app.bt)>
	//    4    8:areturn         
	}

	public IAppboyImageLoader getAppboyImageLoader()
	{
		if(y == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #632 <Field IAppboyImageLoader y>
	//*   2    4:ifnonnull       32
		{
			AppboyLogger.d(l, "The Image Loader was null. Creating a new Image Loader and returning it.");
	//    3    7:getstatic       #152 <Field String l>
	//    4   10:ldc2            #1122 <String "The Image Loader was null. Creating a new Image Loader and returning it.">
	//    5   13:invokestatic    #553 <Method int AppboyLogger.d(String, String)>
	//    6   16:pop             
			y = ((IAppboyImageLoader) (new AppboyLruImageLoader(q)));
	//    7   17:aload_0         
	//    8   18:new             #628 <Class AppboyLruImageLoader>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:getfield        #577 <Field Context q>
	//   12   26:invokespecial   #630 <Method void AppboyLruImageLoader(Context)>
	//   13   29:putfield        #632 <Field IAppboyImageLoader y>
		}
		return y;
	//   14   32:aload_0         
	//   15   33:getfield        #632 <Field IAppboyImageLoader y>
	//   16   36:areturn         
	}

	public String getAppboyPushMessageRegistrationId()
	{
		if(i())
	//*   0    0:invokestatic    #916 <Method boolean i()>
	//*   1    3:ifeq            10
			return "";
	//    2    6:ldc2            #966 <String "">
	//    3    9:areturn         
		String s1;
		try
		{
			s1 = j.a();
	//    4   10:aload_0         
	//    5   11:getfield        #674 <Field bx j>
	//    6   14:invokeinterface #1126 <Method String bx.a()>
	//    7   19:astore_1        
		}
	//*   8   20:aload_1         
	//*   9   21:areturn         
		catch(Exception exception)
	//*  10   22:astore_1        
		{
			AppboyLogger.w(l, "Failed to get the registration ID.", ((Throwable) (exception)));
	//   11   23:getstatic       #152 <Field String l>
	//   12   26:ldc2            #1128 <String "Failed to get the registration ID.">
	//   13   29:aload_1         
	//   14   30:invokestatic    #932 <Method int AppboyLogger.w(String, String, Throwable)>
	//   15   33:pop             
			a(((Throwable) (exception)));
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:invokespecial   #837 <Method void a(Throwable)>
			return null;
	//   19   39:aconst_null     
	//   20   40:areturn         
		}
		return s1;
	}

	public int getContentCardCount()
	{
		if(i())
	//*   0    0:invokestatic    #916 <Method boolean i()>
	//*   1    3:ifeq            8
			return -1;
	//    2    6:iconst_m1       
	//    3    7:ireturn         
		ContentCardsUpdatedEvent contentcardsupdatedevent = f();
	//    4    8:aload_0         
	//    5    9:invokespecial   #1132 <Method ContentCardsUpdatedEvent f()>
	//    6   12:astore_1        
		if(contentcardsupdatedevent != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          22
		{
			return contentcardsupdatedevent.getCardCount();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #1135 <Method int ContentCardsUpdatedEvent.getCardCount()>
	//   11   21:ireturn         
		} else
		{
			AppboyLogger.w(l, "The ContentCardsUpdatedEvent was null. Returning the default value for the card count.");
	//   12   22:getstatic       #152 <Field String l>
	//   13   25:ldc2            #1137 <String "The ContentCardsUpdatedEvent was null. Returning the default value for the card count.">
	//   14   28:invokestatic    #881 <Method int AppboyLogger.w(String, String)>
	//   15   31:pop             
			return -1;
	//   16   32:iconst_m1       
	//   17   33:ireturn         
		}
	}

	public int getContentCardUnviewedCount()
	{
		if(i())
	//*   0    0:invokestatic    #916 <Method boolean i()>
	//*   1    3:ifeq            8
			return -1;
	//    2    6:iconst_m1       
	//    3    7:ireturn         
		ContentCardsUpdatedEvent contentcardsupdatedevent = f();
	//    4    8:aload_0         
	//    5    9:invokespecial   #1132 <Method ContentCardsUpdatedEvent f()>
	//    6   12:astore_1        
		if(contentcardsupdatedevent != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          22
		{
			return contentcardsupdatedevent.getUnviewedCardCount();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #1141 <Method int ContentCardsUpdatedEvent.getUnviewedCardCount()>
	//   11   21:ireturn         
		} else
		{
			AppboyLogger.w(l, "The ContentCardsUpdatedEvent was null. Returning the default value for the unviewed card count.");
	//   12   22:getstatic       #152 <Field String l>
	//   13   25:ldc2            #1143 <String "The ContentCardsUpdatedEvent was null. Returning the default value for the unviewed card count.">
	//   14   28:invokestatic    #881 <Method int AppboyLogger.w(String, String)>
	//   15   31:pop             
			return -1;
	//   16   32:iconst_m1       
	//   17   33:ireturn         
		}
	}

	public long getContentCardsLastUpdatedInSecondsFromEpoch()
	{
		if(i())
	//*   0    0:invokestatic    #916 <Method boolean i()>
	//*   1    3:ifeq            10
			return -1L;
	//    2    6:ldc2w           #1145 <Long -1L>
	//    3    9:lreturn         
		ContentCardsUpdatedEvent contentcardsupdatedevent = f();
	//    4   10:aload_0         
	//    5   11:invokespecial   #1132 <Method ContentCardsUpdatedEvent f()>
	//    6   14:astore_1        
		if(contentcardsupdatedevent != null)
	//*   7   15:aload_1         
	//*   8   16:ifnull          24
		{
			return contentcardsupdatedevent.getLastUpdatedInSecondsFromEpoch();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #1149 <Method long ContentCardsUpdatedEvent.getLastUpdatedInSecondsFromEpoch()>
	//   11   23:lreturn         
		} else
		{
			AppboyLogger.w(l, "The ContentCardsUpdatedEvent was null. Returning the default value for the last update timestamp.");
	//   12   24:getstatic       #152 <Field String l>
	//   13   27:ldc2            #1151 <String "The ContentCardsUpdatedEvent was null. Returning the default value for the last update timestamp.">
	//   14   30:invokestatic    #881 <Method int AppboyLogger.w(String, String)>
	//   15   33:pop             
			return -1L;
	//   16   34:ldc2w           #1145 <Long -1L>
	//   17   37:lreturn         
		}
	}

	public AppboyUser getCurrentUser()
	{
		AppboyUser appboyuser;
		try
		{
			appboyuser = (AppboyUser)k.submit(new Callable() {

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
	//    1    1:getfield        #701 <Field bc k>
	//    2    4:new             #24  <Class Appboy$16>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #1154 <Method void Appboy$16(Appboy)>
	//    6   12:invokevirtual   #920 <Method Future bc.submit(Callable)>
	//    7   15:invokeinterface #926 <Method Object Future.get()>
	//    8   20:checkcast       #769 <Class AppboyUser>
	//    9   23:astore_1        
		}
	//*  10   24:aload_1         
	//*  11   25:areturn         
		catch(Exception exception)
	//*  12   26:astore_1        
		{
			AppboyLogger.w(l, "Failed to retrieve the current user.", ((Throwable) (exception)));
	//   13   27:getstatic       #152 <Field String l>
	//   14   30:ldc2            #1156 <String "Failed to retrieve the current user.">
	//   15   33:aload_1         
	//   16   34:invokestatic    #932 <Method int AppboyLogger.w(String, String, Throwable)>
	//   17   37:pop             
			a(((Throwable) (exception)));
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:invokespecial   #837 <Method void a(Throwable)>
			return null;
	//   21   43:aconst_null     
	//   22   44:areturn         
		}
		return appboyuser;
	}

	public String getDeviceId()
	{
		return w.a();
	//    0    0:aload_0         
	//    1    1:getfield        #658 <Field bj w>
	//    2    4:invokevirtual   #1158 <Method String bj.a()>
	//    3    7:areturn         
	}

	public String getInstallTrackingId()
	{
		if(i())
	//*   0    0:invokestatic    #916 <Method boolean i()>
	//*   1    3:ifeq            10
			return "";
	//    2    6:ldc2            #966 <String "">
	//    3    9:areturn         
		else
			return w.a();
	//    4   10:aload_0         
	//    5   11:getfield        #658 <Field bj w>
	//    6   14:invokevirtual   #1158 <Method String bj.a()>
	//    7   17:areturn         
	}

	public void logContentCardsDisplayed()
	{
		if(i())
	//*   0    0:invokestatic    #916 <Method boolean i()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			k.submit(new Runnable() {

				public void run()
				{
					try
					{
						a.g.a(((bo.app.cc) (ci.i())));
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field Appboy a>
				//    2    4:getfield        #27  <Field bo Appboy.g>
				//    3    7:invokestatic    #33  <Method ci ci.i()>
				//    4   10:invokevirtual   #38  <Method boolean bo.a(bo.app.cc)>
				//    5   13:pop             
						return;
				//    6   14:return          
					}
					catch(Exception exception)
				//*   7   15:astore_1        
					{
						AppboyLogger.w(Appboy.b(), "Failed to log that Content Cards was displayed.", ((Throwable) (exception)));
				//    8   16:invokestatic    #42  <Method String Appboy.b()>
				//    9   19:ldc1            #44  <String "Failed to log that Content Cards was displayed.">
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
	//    4    8:getfield        #701 <Field bc k>
	//    5   11:new             #72  <Class Appboy$7>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:invokespecial   #1161 <Method void Appboy$7(Appboy)>
	//    9   19:invokevirtual   #706 <Method Future bc.submit(Runnable)>
	//   10   22:pop             
			return;
	//   11   23:return          
		}
	}

	public void logCustomEvent(String s1)
	{
		logCustomEvent(s1, ((AppboyProperties) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #1165 <Method void logCustomEvent(String, AppboyProperties)>
	//    4    6:return          
	}

	public void logCustomEvent(String s1, AppboyProperties appboyproperties)
	{
		if(i())
	//*   0    0:invokestatic    #916 <Method boolean i()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			k.submit(new Runnable(s1, appboyproperties) {

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
				//    8   12:getfield        #36  <Field dx Appboy.f>
				//    9   15:invokestatic    #42  <Method boolean ValidationUtils.isValidLogCustomEventInput(String, dx)>
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
				//*  57   94:invokestatic    #74  <Method ci ci.a(String, AppboyProperties)>
				//*  58   97:astore_3        
				//*  59   98:aload_2         
				//*  60   99:astore_1        
				//*  61  100:aload_0         
				//*  62  101:getfield        #21  <Field Appboy c>
				//*  63  104:getfield        #78  <Field bo Appboy.g>
				//*  64  107:aload_3         
				//*  65  108:invokevirtual   #83  <Method boolean bo.a(bo.app.cc)>
				//*  66  111:ifeq            188
				//*  67  114:aload_2         
				//*  68  115:astore_1        
				//*  69  116:aload_0         
				//*  70  117:getfield        #21  <Field Appboy c>
				//*  71  120:getfield        #87  <Field gf Appboy.d>
				//*  72  123:new             #89  <Class fq>
				//*  73  126:dup             
				//*  74  127:aload_2         
				//*  75  128:aload_0         
				//*  76  129:getfield        #25  <Field AppboyProperties b>
				//*  77  132:aload_3         
				//*  78  133:invokespecial   #92  <Method void fq(String, AppboyProperties, bo.app.cc)>
				//*  79  136:invokevirtual   #97  <Method void gf.a(bo.app.fr)>
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
					obj = ((Object) (ci.a(s3, b)));
					s2 = s3;
					if(!c.g.a(((bo.app.cc) (obj))))
						break MISSING_BLOCK_LABEL_188;
					s2 = s3;
					c.d.a(((bo.app.fr) (new fq(s3, b, ((bo.app.cc) (obj))))));
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
	//    4    8:getfield        #701 <Field bc k>
	//    5   11:new             #62  <Class Appboy$33>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokespecial   #1168 <Method void Appboy$33(Appboy, String, AppboyProperties)>
	//   11   21:invokevirtual   #706 <Method Future bc.submit(Runnable)>
	//   12   24:pop             
			return;
	//   13   25:return          
		}
	}

	public void logFeedCardClick(String s1)
	{
		if(i())
	//*   0    0:invokestatic    #916 <Method boolean i()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			k.submit(new Runnable(s1) {

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
				//*  11   24:getfield        #49  <Field bo Appboy.g>
				//*  12   27:aload_0         
				//*  13   28:getfield        #21  <Field String a>
				//*  14   31:invokestatic    #55  <Method ci ci.d(String)>
				//*  15   34:invokevirtual   #60  <Method boolean bo.a(bo.app.cc)>
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
					b.g.a(((bo.app.cc) (ci.d(a))));
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
	//    4    8:getfield        #701 <Field bc k>
	//    5   11:new             #28  <Class Appboy$18>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #1170 <Method void Appboy$18(Appboy, String)>
	//   10   20:invokevirtual   #706 <Method Future bc.submit(Runnable)>
	//   11   23:pop             
			return;
	//   12   24:return          
		}
	}

	public void logFeedCardImpression(String s1)
	{
		if(i())
	//*   0    0:invokestatic    #916 <Method boolean i()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			k.submit(new Runnable(s1) {

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
				//*  11   24:getfield        #49  <Field bo Appboy.g>
				//*  12   27:aload_0         
				//*  13   28:getfield        #21  <Field String a>
				//*  14   31:invokestatic    #55  <Method ci ci.c(String)>
				//*  15   34:invokevirtual   #60  <Method boolean bo.a(bo.app.cc)>
				//*  16   37:pop             
				//*  17   38:aload_0         
				//*  18   39:getfield        #19  <Field Appboy b>
				//*  19   42:getfield        #63  <Field dr Appboy.c>
				//*  20   45:aload_0         
				//*  21   46:getfield        #21  <Field String a>
				//*  22   49:invokevirtual   #67  <Method void dr.b(String)>
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
					b.g.a(((bo.app.cc) (ci.c(a))));
					b.c.b(a);
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
	//    4    8:getfield        #701 <Field bc k>
	//    5   11:new             #26  <Class Appboy$17>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #1172 <Method void Appboy$17(Appboy, String)>
	//   10   20:invokevirtual   #706 <Method Future bc.submit(Runnable)>
	//   11   23:pop             
			return;
	//   12   24:return          
		}
	}

	public void logFeedDisplayed()
	{
		if(i())
	//*   0    0:invokestatic    #916 <Method boolean i()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			k.submit(new Runnable() {

				public void run()
				{
					try
					{
						a.g.a(((bo.app.cc) (ci.j())));
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field Appboy a>
				//    2    4:getfield        #27  <Field bo Appboy.g>
				//    3    7:invokestatic    #33  <Method ci ci.j()>
				//    4   10:invokevirtual   #38  <Method boolean bo.a(bo.app.cc)>
				//    5   13:pop             
						return;
				//    6   14:return          
					}
					catch(Exception exception)
				//*   7   15:astore_1        
					{
						AppboyLogger.w(Appboy.b(), "Failed to log that the feed was displayed.", ((Throwable) (exception)));
				//    8   16:invokestatic    #42  <Method String Appboy.b()>
				//    9   19:ldc1            #44  <String "Failed to log that the feed was displayed.">
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
	//    4    8:getfield        #701 <Field bc k>
	//    5   11:new             #74  <Class Appboy$8>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:invokespecial   #1174 <Method void Appboy$8(Appboy)>
	//    9   19:invokevirtual   #706 <Method Future bc.submit(Runnable)>
	//   10   22:pop             
			return;
	//   11   23:return          
		}
	}

	public void logFeedbackDisplayed()
	{
		if(i())
	//*   0    0:invokestatic    #916 <Method boolean i()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			k.submit(new Runnable() {

				public void run()
				{
					try
					{
						a.g.a(((bo.app.cc) (ci.k())));
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field Appboy a>
				//    2    4:getfield        #27  <Field bo Appboy.g>
				//    3    7:invokestatic    #33  <Method ci ci.k()>
				//    4   10:invokevirtual   #38  <Method boolean bo.a(bo.app.cc)>
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
	//    4    8:getfield        #701 <Field bc k>
	//    5   11:new             #76  <Class Appboy$9>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:invokespecial   #1176 <Method void Appboy$9(Appboy)>
	//    9   19:invokevirtual   #706 <Method Future bc.submit(Runnable)>
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
	//    5    5:invokevirtual   #1181 <Method void logPurchase(String, String, BigDecimal, int)>
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
	//    6    7:invokevirtual   #1184 <Method void logPurchase(String, String, BigDecimal, int, AppboyProperties)>
	//    7   10:return          
	}

	public void logPurchase(String s1, String s2, BigDecimal bigdecimal, int i1, AppboyProperties appboyproperties)
	{
		if(i())
	//*   0    0:invokestatic    #916 <Method boolean i()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			k.submit(new Runnable(s1, s2, bigdecimal, i1, appboyproperties) {

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
				//*  61  104:getfield        #90  <Field dx Appboy.f>
				//*  62  107:invokestatic    #58  <Method Set Appboy.e()>
				//*  63  110:invokestatic    #96  <Method boolean ValidationUtils.isValidLogPurchaseInput(String, String, BigDecimal, int, dx, Set)>
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
				//*  87  151:invokestatic    #107 <Method ci ci.a(String, String, BigDecimal, int, AppboyProperties)>
				//*  88  154:astore_3        
				//*  89  155:aload_2         
				//*  90  156:astore_1        
				//*  91  157:aload_0         
				//*  92  158:getfield        #26  <Field Appboy f>
				//*  93  161:getfield        #111 <Field bo Appboy.g>
				//*  94  164:aload_3         
				//*  95  165:invokevirtual   #116 <Method boolean bo.a(bo.app.cc)>
				//*  96  168:ifeq            245
				//*  97  171:aload_2         
				//*  98  172:astore_1        
				//*  99  173:aload_0         
				//* 100  174:getfield        #26  <Field Appboy f>
				//* 101  177:getfield        #119 <Field gf Appboy.d>
				//* 102  180:new             #121 <Class fv>
				//* 103  183:dup             
				//* 104  184:aload_2         
				//* 105  185:aload_0         
				//* 106  186:getfield        #36  <Field AppboyProperties e>
				//* 107  189:aload_3         
				//* 108  190:invokespecial   #124 <Method void fv(String, AppboyProperties, bo.app.cc)>
				//* 109  193:invokevirtual   #129 <Method void gf.a(bo.app.fr)>
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
					obj = ((Object) (ci.a(s4, ((String) (obj)), c, d, e)));
					s3 = s4;
					if(!f.g.a(((bo.app.cc) (obj))))
						break MISSING_BLOCK_LABEL_245;
					s3 = s4;
					f.d.a(((bo.app.fr) (new fv(s4, e, ((bo.app.cc) (obj))))));
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
	//    4    8:getfield        #701 <Field bc k>
	//    5   11:new             #64  <Class Appboy$34>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:aload_3         
	//   11   19:iload           4
	//   12   21:aload           5
	//   13   23:invokespecial   #1187 <Method void Appboy$34(Appboy, String, String, BigDecimal, int, AppboyProperties)>
	//   14   26:invokevirtual   #706 <Method Future bc.submit(Runnable)>
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
	//    6    7:invokevirtual   #1184 <Method void logPurchase(String, String, BigDecimal, int, AppboyProperties)>
	//    7   10:return          
	}

	public void logPushDeliveryEvent(String s1)
	{
		if(i())
	//*   0    0:invokestatic    #916 <Method boolean i()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			k.submit(new Runnable(s1) {

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
				//*  11   24:getfield        #49  <Field bo Appboy.g>
				//*  12   27:aload_0         
				//*  13   28:getfield        #21  <Field String a>
				//*  14   31:invokestatic    #55  <Method ci ci.j(String)>
				//*  15   34:invokevirtual   #60  <Method boolean bo.a(bo.app.cc)>
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
					b.g.a(((bo.app.cc) (ci.j(a))));
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
	//    4    8:getfield        #701 <Field bc k>
	//    5   11:new             #66  <Class Appboy$4>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #1190 <Method void Appboy$4(Appboy, String)>
	//   10   20:invokevirtual   #706 <Method Future bc.submit(Runnable)>
	//   11   23:pop             
			return;
	//   12   24:return          
		}
	}

	public void logPushNotificationActionClicked(String s1, String s2)
	{
		if(i())
	//*   0    0:invokestatic    #916 <Method boolean i()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			k.submit(new Runnable(s1, s2) {

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
				//*  20   44:getfield        #54  <Field bo Appboy.g>
				//*  21   47:aload_0         
				//*  22   48:getfield        #22  <Field String a>
				//*  23   51:aload_0         
				//*  24   52:getfield        #24  <Field String b>
				//*  25   55:invokestatic    #59  <Method ci ci.c(String, String)>
				//*  26   58:invokevirtual   #64  <Method boolean bo.a(bo.app.cc)>
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
					c.g.a(((bo.app.cc) (ci.c(a, b))));
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
	//    4    8:getfield        #701 <Field bc k>
	//    5   11:new             #68  <Class Appboy$5>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokespecial   #1192 <Method void Appboy$5(Appboy, String, String)>
	//   11   21:invokevirtual   #706 <Method Future bc.submit(Runnable)>
	//   12   24:pop             
			return;
	//   13   25:return          
		}
	}

	public void logPushNotificationOpened(Intent intent)
	{
		if(i())
	//*   0    0:invokestatic    #916 <Method boolean i()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			k.submit(new Runnable(intent) {

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
						b.g.a((new bo.app.cm.a()).b());
				//   52  109:aload_0         
				//   53  110:getfield        #19  <Field Appboy b>
				//   54  113:getfield        #87  <Field bo Appboy.g>
				//   55  116:new             #89  <Class bo.app.cm$a>
				//   56  119:dup             
				//   57  120:invokespecial   #90  <Method void bo.app.cm$a()>
				//   58  123:invokevirtual   #93  <Method bo.app.cm$a bo.app.cm$a.b()>
				//   59  126:invokevirtual   #98  <Method void bo.a(bo.app.cm$a)>
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
	//    4    8:getfield        #701 <Field bc k>
	//    5   11:new             #54  <Class Appboy$3>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #1197 <Method void Appboy$3(Appboy, Intent)>
	//   10   20:invokevirtual   #706 <Method Future bc.submit(Runnable)>
	//   11   23:pop             
			return;
	//   12   24:return          
		}
	}

	public void logPushNotificationOpened(String s1)
	{
		if(i())
	//*   0    0:invokestatic    #916 <Method boolean i()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			k.submit(new Runnable(s1) {

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
				//*  11   24:getfield        #49  <Field bo Appboy.g>
				//*  12   27:aload_0         
				//*  13   28:getfield        #21  <Field String a>
				//*  14   31:invokestatic    #54  <Method ci ci.b(String)>
				//*  15   34:invokevirtual   #59  <Method boolean bo.a(bo.app.cc)>
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
					b.g.a(((bo.app.cc) (ci.b(a))));
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
	//    4    8:getfield        #701 <Field bc k>
	//    5   11:new             #32  <Class Appboy$2>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #1198 <Method void Appboy$2(Appboy, String)>
	//   10   20:invokevirtual   #706 <Method Future bc.submit(Runnable)>
	//   11   23:pop             
			return;
	//   12   24:return          
		}
	}

	public void logPushStoryPageClicked(String s1, String s2)
	{
		if(i())
	//*   0    0:invokestatic    #916 <Method boolean i()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			k.submit(new Runnable(s1, s2) {

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
				//*  13   28:getfield        #52  <Field bo Appboy.g>
				//*  14   31:aload_0         
				//*  15   32:getfield        #22  <Field String a>
				//*  16   35:aload_0         
				//*  17   36:getfield        #24  <Field String b>
				//*  18   39:invokestatic    #57  <Method ci ci.b(String, String)>
				//*  19   42:invokevirtual   #62  <Method boolean bo.a(bo.app.cc)>
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
					c.g.a(((bo.app.cc) (ci.b(a, b))));
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
	//    4    8:getfield        #701 <Field bc k>
	//    5   11:new             #70  <Class Appboy$6>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokespecial   #1200 <Method void Appboy$6(Appboy, String, String)>
	//   11   21:invokevirtual   #706 <Method Future bc.submit(Runnable)>
	//   12   24:pop             
			return;
	//   13   25:return          
		}
	}

	public void openSession(Activity activity)
	{
		if(i())
	//*   0    0:invokestatic    #916 <Method boolean i()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			k.submit(new Runnable(activity) {

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
				//*  10   21:getfield        #43  <Field bo Appboy.g>
				//*  11   24:aload_0         
				//*  12   25:getfield        #21  <Field Activity a>
				//*  13   28:invokevirtual   #48  <Method cf bo.a(Activity)>
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
	//    4    8:getfield        #701 <Field bc k>
	//    5   11:new             #56  <Class Appboy$30>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #1202 <Method void Appboy$30(Appboy, Activity)>
	//   10   20:invokevirtual   #706 <Method Future bc.submit(Runnable)>
	//   11   23:pop             
			return;
	//   12   24:return          
		}
	}

	public void registerAppboyPushMessages(String s1)
	{
		if(i())
	//*   0    0:invokestatic    #916 <Method boolean i()>
	//*   1    3:ifeq            7
			return;
	//    2    6:return          
		if(StringUtils.isNullOrBlank(s1))
	//*   3    7:aload_1         
	//*   4    8:invokestatic    #646 <Method boolean StringUtils.isNullOrBlank(String)>
	//*   5   11:ifeq            25
		{
			AppboyLogger.w(l, "Push registration ID must not be null or blank. Not registering for push messages from Appboy.");
	//    6   14:getstatic       #152 <Field String l>
	//    7   17:ldc2            #1205 <String "Push registration ID must not be null or blank. Not registering for push messages from Appboy.">
	//    8   20:invokestatic    #881 <Method int AppboyLogger.w(String, String)>
	//    9   23:pop             
			return;
	//   10   24:return          
		}
		try
		{
			String s2 = l;
	//   11   25:getstatic       #152 <Field String l>
	//   12   28:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   13   29:new             #609 <Class StringBuilder>
	//   14   32:dup             
	//   15   33:invokespecial   #610 <Method void StringBuilder()>
	//   16   36:astore_3        
			stringbuilder.append("Push token ");
	//   17   37:aload_3         
	//   18   38:ldc2            #1207 <String "Push token ">
	//   19   41:invokevirtual   #616 <Method StringBuilder StringBuilder.append(String)>
	//   20   44:pop             
			stringbuilder.append(s1);
	//   21   45:aload_3         
	//   22   46:aload_1         
	//   23   47:invokevirtual   #616 <Method StringBuilder StringBuilder.append(String)>
	//   24   50:pop             
			stringbuilder.append(" registered and immediately being flushed.");
	//   25   51:aload_3         
	//   26   52:ldc2            #1209 <String " registered and immediately being flushed.">
	//   27   55:invokevirtual   #616 <Method StringBuilder StringBuilder.append(String)>
	//   28   58:pop             
			AppboyLogger.i(s2, stringbuilder.toString());
	//   29   59:aload_2         
	//   30   60:aload_3         
	//   31   61:invokevirtual   #620 <Method String StringBuilder.toString()>
	//   32   64:invokestatic    #622 <Method int AppboyLogger.i(String, String)>
	//   33   67:pop             
			j.a(s1);
	//   34   68:aload_0         
	//   35   69:getfield        #674 <Field bx j>
	//   36   72:aload_1         
	//   37   73:invokeinterface #1210 <Method void bx.a(String)>
			requestImmediateDataFlush();
	//   38   78:aload_0         
	//   39   79:invokevirtual   #1213 <Method void requestImmediateDataFlush()>
			return;
	//   40   82:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s1)
	//*  41   83:astore_1        
		{
			AppboyLogger.w(l, "Failed to set the registration ID.", ((Throwable) (s1)));
	//   42   84:getstatic       #152 <Field String l>
	//   43   87:ldc2            #1215 <String "Failed to set the registration ID.">
	//   44   90:aload_1         
	//   45   91:invokestatic    #932 <Method int AppboyLogger.w(String, String, Throwable)>
	//   46   94:pop             
		}
		a(((Throwable) (s1)));
	//   47   95:aload_0         
	//   48   96:aload_1         
	//   49   97:invokespecial   #837 <Method void a(Throwable)>
		return;
	//   50  100:return          
	}

	public void removeSingleSubscription(IEventSubscriber ieventsubscriber, Class class1)
	{
		try
		{
			r.c(ieventsubscriber, class1);
	//    0    0:aload_0         
	//    1    1:getfield        #667 <Field ac r>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #1220 <Method boolean ac.c(IEventSubscriber, Class)>
	//    5    9:pop             
			return;
	//    6   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(IEventSubscriber ieventsubscriber)
	//*   7   11:astore_1        
		{
			String s1 = l;
	//    8   12:getstatic       #152 <Field String l>
	//    9   15:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   10   16:new             #609 <Class StringBuilder>
	//   11   19:dup             
	//   12   20:invokespecial   #610 <Method void StringBuilder()>
	//   13   23:astore          4
			stringbuilder.append("Failed to remove ");
	//   14   25:aload           4
	//   15   27:ldc2            #1222 <String "Failed to remove ">
	//   16   30:invokevirtual   #616 <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
			stringbuilder.append(class1.getName());
	//   18   34:aload           4
	//   19   36:aload_2         
	//   20   37:invokevirtual   #1227 <Method String Class.getName()>
	//   21   40:invokevirtual   #616 <Method StringBuilder StringBuilder.append(String)>
	//   22   43:pop             
			stringbuilder.append(" subscriber.");
	//   23   44:aload           4
	//   24   46:ldc2            #1229 <String " subscriber.">
	//   25   49:invokevirtual   #616 <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
			AppboyLogger.w(s1, stringbuilder.toString(), ((Throwable) (ieventsubscriber)));
	//   27   53:aload_3         
	//   28   54:aload           4
	//   29   56:invokevirtual   #620 <Method String StringBuilder.toString()>
	//   30   59:aload_1         
	//   31   60:invokestatic    #932 <Method int AppboyLogger.w(String, String, Throwable)>
	//   32   63:pop             
			a(((Throwable) (ieventsubscriber)));
	//   33   64:aload_0         
	//   34   65:aload_1         
	//   35   66:invokespecial   #837 <Method void a(Throwable)>
			return;
	//   36   69:return          
		}
	}

	public void requestContentCardsRefresh(boolean flag)
	{
		if(i())
	//*   0    0:invokestatic    #916 <Method boolean i()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			k.submit(new Runnable(flag) {

				public void run()
				{
					try
					{
						if(a)
				//*   0    0:aload_0         
				//*   1    1:getfield        #21  <Field boolean a>
				//*   2    4:ifeq            30
						{
							Appboy.c(b).a(((Object) (b.h.a())), com/appboy/events/ContentCardsUpdatedEvent);
				//    3    7:aload_0         
				//    4    8:getfield        #19  <Field Appboy b>
				//    5   11:invokestatic    #32  <Method ac Appboy.c(Appboy)>
				//    6   14:aload_0         
				//    7   15:getfield        #19  <Field Appboy b>
				//    8   18:getfield        #36  <Field dn Appboy.h>
				//    9   21:invokevirtual   #41  <Method ContentCardsUpdatedEvent dn.a()>
				//   10   24:ldc1            #43  <Class ContentCardsUpdatedEvent>
				//   11   26:invokevirtual   #48  <Method void ac.a(Object, Class)>
							return;
				//   12   29:return          
						}
					}
				//*  13   30:aload_0         
				//*  14   31:getfield        #19  <Field Appboy b>
				//*  15   34:getfield        #52  <Field bo Appboy.g>
				//*  16   37:aload_0         
				//*  17   38:getfield        #19  <Field Appboy b>
				//*  18   41:getfield        #36  <Field dn Appboy.h>
				//*  19   44:invokevirtual   #55  <Method long dn.b()>
				//*  20   47:aload_0         
				//*  21   48:getfield        #19  <Field Appboy b>
				//*  22   51:getfield        #36  <Field dn Appboy.h>
				//*  23   54:invokevirtual   #57  <Method long dn.c()>
				//*  24   57:invokevirtual   #62  <Method void bo.a(long, long)>
				//*  25   60:return          
					catch(Exception exception)
				//*  26   61:astore_1        
					{
						String s1 = Appboy.b();
				//   27   62:invokestatic    #65  <Method String Appboy.b()>
				//   28   65:astore_2        
						StringBuilder stringbuilder = new StringBuilder();
				//   29   66:new             #67  <Class StringBuilder>
				//   30   69:dup             
				//   31   70:invokespecial   #68  <Method void StringBuilder()>
				//   32   73:astore_3        
						stringbuilder.append("Failed to request Content Cards refresh. Requesting from cache: ");
				//   33   74:aload_3         
				//   34   75:ldc1            #70  <String "Failed to request Content Cards refresh. Requesting from cache: ">
				//   35   77:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
				//   36   80:pop             
						stringbuilder.append(a);
				//   37   81:aload_3         
				//   38   82:aload_0         
				//   39   83:getfield        #21  <Field boolean a>
				//   40   86:invokevirtual   #77  <Method StringBuilder StringBuilder.append(boolean)>
				//   41   89:pop             
						AppboyLogger.w(s1, stringbuilder.toString(), ((Throwable) (exception)));
				//   42   90:aload_2         
				//   43   91:aload_3         
				//   44   92:invokevirtual   #80  <Method String StringBuilder.toString()>
				//   45   95:aload_1         
				//   46   96:invokestatic    #86  <Method int AppboyLogger.w(String, String, Throwable)>
				//   47   99:pop             
						Appboy.a(b, ((Throwable) (exception)));
				//   48  100:aload_0         
				//   49  101:getfield        #19  <Field Appboy b>
				//   50  104:aload_1         
				//   51  105:invokestatic    #89  <Method void Appboy.a(Appboy, Throwable)>
						return;
				//   52  108:return          
					}
					b.g.a(b.h.b(), b.h.c());
					return;
				}

				final boolean a;
				final Appboy b;

			
			{
				b = Appboy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field Appboy b>
				a = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field boolean a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #701 <Field bc k>
	//    5   11:new             #18  <Class Appboy$13>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:invokespecial   #1233 <Method void Appboy$13(Appboy, boolean)>
	//   10   20:invokevirtual   #706 <Method Future bc.submit(Runnable)>
	//   11   23:pop             
			return;
	//   12   24:return          
		}
	}

	public void requestFeedRefresh()
	{
		if(i())
	//*   0    0:invokestatic    #916 <Method boolean i()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			k.submit(new Runnable() {

				public void run()
				{
					try
					{
						a.g.a((new bo.app.cm.a()).a());
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field Appboy a>
				//    2    4:getfield        #27  <Field bo Appboy.g>
				//    3    7:new             #29  <Class bo.app.cm$a>
				//    4   10:dup             
				//    5   11:invokespecial   #30  <Method void bo.app.cm$a()>
				//    6   14:invokevirtual   #33  <Method bo.app.cm$a bo.app.cm$a.a()>
				//    7   17:invokevirtual   #38  <Method void bo.a(bo.app.cm$a)>
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
	//    4    8:getfield        #701 <Field bc k>
	//    5   11:new             #14  <Class Appboy$11>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:invokespecial   #1235 <Method void Appboy$11(Appboy)>
	//    9   19:invokevirtual   #706 <Method Future bc.submit(Runnable)>
	//   10   22:pop             
			return;
	//   11   23:return          
		}
	}

	public void requestFeedRefreshFromCache()
	{
		if(i())
	//*   0    0:invokestatic    #916 <Method boolean i()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			k.submit(new Runnable() {

				public void run()
				{
					try
					{
						Appboy.c(a).a(((Object) (a.c.a())), com/appboy/events/FeedUpdatedEvent);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field Appboy a>
				//    2    4:invokestatic    #27  <Method ac Appboy.c(Appboy)>
				//    3    7:aload_0         
				//    4    8:getfield        #17  <Field Appboy a>
				//    5   11:getfield        #30  <Field dr Appboy.c>
				//    6   14:invokevirtual   #35  <Method FeedUpdatedEvent dr.a()>
				//    7   17:ldc1            #37  <Class FeedUpdatedEvent>
				//    8   19:invokevirtual   #42  <Method void ac.a(Object, Class)>
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
	//    4    8:getfield        #701 <Field bc k>
	//    5   11:new             #12  <Class Appboy$10>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:invokespecial   #1237 <Method void Appboy$10(Appboy)>
	//    9   19:invokevirtual   #706 <Method Future bc.submit(Runnable)>
	//   10   22:pop             
			return;
	//   11   23:return          
		}
	}

	public void requestImmediateDataFlush()
	{
		if(i())
	//*   0    0:invokestatic    #916 <Method boolean i()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			k.submit(new Runnable() {

				public void run()
				{
					try
					{
						a.g.d();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field Appboy a>
				//    2    4:getfield        #27  <Field bo Appboy.g>
				//    3    7:invokevirtual   #32  <Method void bo.d()>
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
	//    4    8:getfield        #701 <Field bc k>
	//    5   11:new             #20  <Class Appboy$14>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:invokespecial   #1238 <Method void Appboy$14(Appboy)>
	//    9   19:invokevirtual   #706 <Method Future bc.submit(Runnable)>
	//   10   22:pop             
			return;
	//   11   23:return          
		}
	}

	public void setAppboyImageLoader(IAppboyImageLoader iappboyimageloader)
	{
		if(y == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #632 <Field IAppboyImageLoader y>
	//*   2    4:ifnonnull       18
		{
			AppboyLogger.w(l, "The Image Loader cannot be set to null. Doing nothing.");
	//    3    7:getstatic       #152 <Field String l>
	//    4   10:ldc2            #1242 <String "The Image Loader cannot be set to null. Doing nothing.">
	//    5   13:invokestatic    #881 <Method int AppboyLogger.w(String, String)>
	//    6   16:pop             
			return;
	//    7   17:return          
		} else
		{
			y = iappboyimageloader;
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:putfield        #632 <Field IAppboyImageLoader y>
			return;
	//   11   23:return          
		}
	}

	public void submitFeedback(String s1, String s2, boolean flag)
	{
		if(i())
	//*   0    0:invokestatic    #916 <Method boolean i()>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			k.submit(new Runnable(s1, s2, flag) {

				public void run()
				{
					try
					{
						d.g.a(a, b, c);
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field Appboy d>
				//    2    4:getfield        #39  <Field bo Appboy.g>
				//    3    7:aload_0         
				//    4    8:getfield        #24  <Field String a>
				//    5   11:aload_0         
				//    6   12:getfield        #26  <Field String b>
				//    7   15:aload_0         
				//    8   16:getfield        #28  <Field boolean c>
				//    9   19:invokevirtual   #43  <Method void bo.a(String, String, boolean)>
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
	//    4    8:getfield        #701 <Field bc k>
	//    5   11:new             #60  <Class Appboy$32>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:iload_3         
	//   11   19:invokespecial   #1248 <Method void Appboy$32(Appboy, String, String, boolean)>
	//   12   22:invokevirtual   #706 <Method Future bc.submit(Runnable)>
	//   13   25:pop             
			return;
	//   14   26:return          
		}
	}

	public void subscribeToContentCardsUpdates(IEventSubscriber ieventsubscriber)
	{
		try
		{
			r.a(ieventsubscriber, com/appboy/events/ContentCardsUpdatedEvent);
	//    0    0:aload_0         
	//    1    1:getfield        #667 <Field ac r>
	//    2    4:aload_1         
	//    3    5:ldc2            #928 <Class ContentCardsUpdatedEvent>
	//    4    8:invokevirtual   #1252 <Method boolean ac.a(IEventSubscriber, Class)>
	//    5   11:pop             
			return;
	//    6   12:return          
		}
		// Misplaced declaration of an exception variable
		catch(IEventSubscriber ieventsubscriber)
	//*   7   13:astore_1        
		{
			AppboyLogger.w(l, "Failed to add subscriber for Content Cards updates.", ((Throwable) (ieventsubscriber)));
	//    8   14:getstatic       #152 <Field String l>
	//    9   17:ldc2            #1254 <String "Failed to add subscriber for Content Cards updates.">
	//   10   20:aload_1         
	//   11   21:invokestatic    #932 <Method int AppboyLogger.w(String, String, Throwable)>
	//   12   24:pop             
		}
		a(((Throwable) (ieventsubscriber)));
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokespecial   #837 <Method void a(Throwable)>
	//   16   30:return          
	}

	public void subscribeToFeedUpdates(IEventSubscriber ieventsubscriber)
	{
		try
		{
			r.a(ieventsubscriber, com/appboy/events/FeedUpdatedEvent);
	//    0    0:aload_0         
	//    1    1:getfield        #667 <Field ac r>
	//    2    4:aload_1         
	//    3    5:ldc2            #1258 <Class FeedUpdatedEvent>
	//    4    8:invokevirtual   #1252 <Method boolean ac.a(IEventSubscriber, Class)>
	//    5   11:pop             
			return;
	//    6   12:return          
		}
		// Misplaced declaration of an exception variable
		catch(IEventSubscriber ieventsubscriber)
	//*   7   13:astore_1        
		{
			AppboyLogger.w(l, "Failed to add subscriber for feed updates.", ((Throwable) (ieventsubscriber)));
	//    8   14:getstatic       #152 <Field String l>
	//    9   17:ldc2            #1260 <String "Failed to add subscriber for feed updates.">
	//   10   20:aload_1         
	//   11   21:invokestatic    #932 <Method int AppboyLogger.w(String, String, Throwable)>
	//   12   24:pop             
		}
		a(((Throwable) (ieventsubscriber)));
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokespecial   #837 <Method void a(Throwable)>
	//   16   30:return          
	}

	public void subscribeToFeedbackRequestEvents(IEventSubscriber ieventsubscriber, IEventSubscriber ieventsubscriber1)
	{
		if(ieventsubscriber == null)
			break MISSING_BLOCK_LABEL_19;
	//    0    0:aload_1         
	//    1    1:ifnull          19
		r.a(ieventsubscriber, com/appboy/events/SubmitFeedbackSucceeded);
	//    2    4:aload_0         
	//    3    5:getfield        #667 <Field ac r>
	//    4    8:aload_1         
	//    5    9:ldc2            #1265 <Class SubmitFeedbackSucceeded>
	//    6   12:invokevirtual   #1252 <Method boolean ac.a(IEventSubscriber, Class)>
	//    7   15:pop             
	//*   8   16:goto            19
		if(ieventsubscriber1 != null)
	//*   9   19:aload_2         
	//*  10   20:ifnull          52
		{
			try
			{
				r.a(ieventsubscriber1, com/appboy/events/SubmitFeedbackFailed);
	//   11   23:aload_0         
	//   12   24:getfield        #667 <Field ac r>
	//   13   27:aload_2         
	//   14   28:ldc2            #1267 <Class SubmitFeedbackFailed>
	//   15   31:invokevirtual   #1252 <Method boolean ac.a(IEventSubscriber, Class)>
	//   16   34:pop             
				return;
	//   17   35:return          
			}
	//*  18   36:getstatic       #152 <Field String l>
	//*  19   39:ldc2            #1269 <String "Failed to add subscribers for feedback request events.">
	//*  20   42:aload_1         
	//*  21   43:invokestatic    #932 <Method int AppboyLogger.w(String, String, Throwable)>
	//*  22   46:pop             
	//*  23   47:aload_0         
	//*  24   48:aload_1         
	//*  25   49:invokespecial   #837 <Method void a(Throwable)>
	//*  26   52:return          
			// Misplaced declaration of an exception variable
			catch(IEventSubscriber ieventsubscriber)
			{
				AppboyLogger.w(l, "Failed to add subscribers for feedback request events.", ((Throwable) (ieventsubscriber)));
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
			r.a(ieventsubscriber, com/appboy/events/InAppMessageEvent);
	//    0    0:aload_0         
	//    1    1:getfield        #667 <Field ac r>
	//    2    4:aload_1         
	//    3    5:ldc2            #1273 <Class InAppMessageEvent>
	//    4    8:invokevirtual   #1252 <Method boolean ac.a(IEventSubscriber, Class)>
	//    5   11:pop             
			return;
	//    6   12:return          
		}
		// Misplaced declaration of an exception variable
		catch(IEventSubscriber ieventsubscriber)
	//*   7   13:astore_1        
		{
			AppboyLogger.w(l, "Failed to add subscriber to new in-app messages.", ((Throwable) (ieventsubscriber)));
	//    8   14:getstatic       #152 <Field String l>
	//    9   17:ldc2            #1275 <String "Failed to add subscriber to new in-app messages.">
	//   10   20:aload_1         
	//   11   21:invokestatic    #932 <Method int AppboyLogger.w(String, String, Throwable)>
	//   12   24:pop             
		}
		a(((Throwable) (ieventsubscriber)));
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokespecial   #837 <Method void a(Throwable)>
	//   16   30:return          
	}

	private static final Object A = new Object();
	private static volatile IAppboyEndpointProvider B;
	private static volatile IAppboyNotificationFactory C;
	private static volatile boolean D = false;
	private static volatile boolean E = false;
	private static volatile boolean F = false;
	private static volatile dw G;
	private static final String l = AppboyLogger.getAppboyLogTag(com/appboy/Appboy);
	private static final Set m = new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
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
	private static final Set n = new HashSet(((java.util.Collection) (Collections.singletonList("calypso appcrawler"))));
	private static final Set o = new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
		"android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET"
	}))))));
	private static volatile Appboy p = null;
	volatile ad a;
	volatile eq b;
	volatile dr c;
	volatile gf d;
	volatile bl e;
	volatile dx f;
	volatile bo g;
	volatile dn h;
	final AppboyConfigurationProvider i;
	final bx j;
	final bc k;
	private final Context q;
	private final ac r;
	private final bz s = new bz();
	private volatile AppboyUser t;
	private volatile ThreadPoolExecutor u;
	private final l v;
	private final bj w;
	private final ba x;
	private IAppboyImageLoader y;
	private volatile boolean z;

	static 
	{
	//    0    0:ldc1            #2   <Class Appboy>
	//    1    2:invokestatic    #150 <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #152 <Field String l>
	//    3    8:new             #154 <Class HashSet>
	//    4   11:dup             
	//    5   12:sipush          171
	//    6   15:anewarray       String[]
	//    7   18:dup             
	//    8   19:iconst_0        
	//    9   20:ldc1            #158 <String "AED">
	//   10   22:aastore         
	//   11   23:dup             
	//   12   24:iconst_1        
	//   13   25:ldc1            #160 <String "AFN">
	//   14   27:aastore         
	//   15   28:dup             
	//   16   29:iconst_2        
	//   17   30:ldc1            #162 <String "ALL">
	//   18   32:aastore         
	//   19   33:dup             
	//   20   34:iconst_3        
	//   21   35:ldc1            #164 <String "AMD">
	//   22   37:aastore         
	//   23   38:dup             
	//   24   39:iconst_4        
	//   25   40:ldc1            #166 <String "ANG">
	//   26   42:aastore         
	//   27   43:dup             
	//   28   44:iconst_5        
	//   29   45:ldc1            #168 <String "AOA">
	//   30   47:aastore         
	//   31   48:dup             
	//   32   49:bipush          6
	//   33   51:ldc1            #170 <String "ARS">
	//   34   53:aastore         
	//   35   54:dup             
	//   36   55:bipush          7
	//   37   57:ldc1            #172 <String "AUD">
	//   38   59:aastore         
	//   39   60:dup             
	//   40   61:bipush          8
	//   41   63:ldc1            #174 <String "AWG">
	//   42   65:aastore         
	//   43   66:dup             
	//   44   67:bipush          9
	//   45   69:ldc1            #176 <String "AZN">
	//   46   71:aastore         
	//   47   72:dup             
	//   48   73:bipush          10
	//   49   75:ldc1            #178 <String "BAM">
	//   50   77:aastore         
	//   51   78:dup             
	//   52   79:bipush          11
	//   53   81:ldc1            #180 <String "BBD">
	//   54   83:aastore         
	//   55   84:dup             
	//   56   85:bipush          12
	//   57   87:ldc1            #182 <String "BDT">
	//   58   89:aastore         
	//   59   90:dup             
	//   60   91:bipush          13
	//   61   93:ldc1            #184 <String "BGN">
	//   62   95:aastore         
	//   63   96:dup             
	//   64   97:bipush          14
	//   65   99:ldc1            #186 <String "BHD">
	//   66  101:aastore         
	//   67  102:dup             
	//   68  103:bipush          15
	//   69  105:ldc1            #188 <String "BIF">
	//   70  107:aastore         
	//   71  108:dup             
	//   72  109:bipush          16
	//   73  111:ldc1            #190 <String "BMD">
	//   74  113:aastore         
	//   75  114:dup             
	//   76  115:bipush          17
	//   77  117:ldc1            #192 <String "BND">
	//   78  119:aastore         
	//   79  120:dup             
	//   80  121:bipush          18
	//   81  123:ldc1            #194 <String "BOB">
	//   82  125:aastore         
	//   83  126:dup             
	//   84  127:bipush          19
	//   85  129:ldc1            #196 <String "BRL">
	//   86  131:aastore         
	//   87  132:dup             
	//   88  133:bipush          20
	//   89  135:ldc1            #198 <String "BSD">
	//   90  137:aastore         
	//   91  138:dup             
	//   92  139:bipush          21
	//   93  141:ldc1            #200 <String "BTC">
	//   94  143:aastore         
	//   95  144:dup             
	//   96  145:bipush          22
	//   97  147:ldc1            #202 <String "BTN">
	//   98  149:aastore         
	//   99  150:dup             
	//  100  151:bipush          23
	//  101  153:ldc1            #204 <String "BWP">
	//  102  155:aastore         
	//  103  156:dup             
	//  104  157:bipush          24
	//  105  159:ldc1            #206 <String "BYR">
	//  106  161:aastore         
	//  107  162:dup             
	//  108  163:bipush          25
	//  109  165:ldc1            #208 <String "BZD">
	//  110  167:aastore         
	//  111  168:dup             
	//  112  169:bipush          26
	//  113  171:ldc1            #210 <String "CAD">
	//  114  173:aastore         
	//  115  174:dup             
	//  116  175:bipush          27
	//  117  177:ldc1            #212 <String "CDF">
	//  118  179:aastore         
	//  119  180:dup             
	//  120  181:bipush          28
	//  121  183:ldc1            #214 <String "CHF">
	//  122  185:aastore         
	//  123  186:dup             
	//  124  187:bipush          29
	//  125  189:ldc1            #216 <String "CLF">
	//  126  191:aastore         
	//  127  192:dup             
	//  128  193:bipush          30
	//  129  195:ldc1            #218 <String "CLP">
	//  130  197:aastore         
	//  131  198:dup             
	//  132  199:bipush          31
	//  133  201:ldc1            #220 <String "CNY">
	//  134  203:aastore         
	//  135  204:dup             
	//  136  205:bipush          32
	//  137  207:ldc1            #222 <String "COP">
	//  138  209:aastore         
	//  139  210:dup             
	//  140  211:bipush          33
	//  141  213:ldc1            #224 <String "CRC">
	//  142  215:aastore         
	//  143  216:dup             
	//  144  217:bipush          34
	//  145  219:ldc1            #226 <String "CUC">
	//  146  221:aastore         
	//  147  222:dup             
	//  148  223:bipush          35
	//  149  225:ldc1            #228 <String "CUP">
	//  150  227:aastore         
	//  151  228:dup             
	//  152  229:bipush          36
	//  153  231:ldc1            #230 <String "CVE">
	//  154  233:aastore         
	//  155  234:dup             
	//  156  235:bipush          37
	//  157  237:ldc1            #232 <String "CZK">
	//  158  239:aastore         
	//  159  240:dup             
	//  160  241:bipush          38
	//  161  243:ldc1            #234 <String "DJF">
	//  162  245:aastore         
	//  163  246:dup             
	//  164  247:bipush          39
	//  165  249:ldc1            #236 <String "DKK">
	//  166  251:aastore         
	//  167  252:dup             
	//  168  253:bipush          40
	//  169  255:ldc1            #238 <String "DOP">
	//  170  257:aastore         
	//  171  258:dup             
	//  172  259:bipush          41
	//  173  261:ldc1            #240 <String "DZD">
	//  174  263:aastore         
	//  175  264:dup             
	//  176  265:bipush          42
	//  177  267:ldc1            #242 <String "EEK">
	//  178  269:aastore         
	//  179  270:dup             
	//  180  271:bipush          43
	//  181  273:ldc1            #244 <String "EGP">
	//  182  275:aastore         
	//  183  276:dup             
	//  184  277:bipush          44
	//  185  279:ldc1            #246 <String "ERN">
	//  186  281:aastore         
	//  187  282:dup             
	//  188  283:bipush          45
	//  189  285:ldc1            #248 <String "ETB">
	//  190  287:aastore         
	//  191  288:dup             
	//  192  289:bipush          46
	//  193  291:ldc1            #250 <String "EUR">
	//  194  293:aastore         
	//  195  294:dup             
	//  196  295:bipush          47
	//  197  297:ldc1            #252 <String "FJD">
	//  198  299:aastore         
	//  199  300:dup             
	//  200  301:bipush          48
	//  201  303:ldc1            #254 <String "FKP">
	//  202  305:aastore         
	//  203  306:dup             
	//  204  307:bipush          49
	//  205  309:ldc2            #256 <String "GBP">
	//  206  312:aastore         
	//  207  313:dup             
	//  208  314:bipush          50
	//  209  316:ldc2            #258 <String "GEL">
	//  210  319:aastore         
	//  211  320:dup             
	//  212  321:bipush          51
	//  213  323:ldc2            #260 <String "GGP">
	//  214  326:aastore         
	//  215  327:dup             
	//  216  328:bipush          52
	//  217  330:ldc2            #262 <String "GHS">
	//  218  333:aastore         
	//  219  334:dup             
	//  220  335:bipush          53
	//  221  337:ldc2            #264 <String "GIP">
	//  222  340:aastore         
	//  223  341:dup             
	//  224  342:bipush          54
	//  225  344:ldc2            #266 <String "GMD">
	//  226  347:aastore         
	//  227  348:dup             
	//  228  349:bipush          55
	//  229  351:ldc2            #268 <String "GNF">
	//  230  354:aastore         
	//  231  355:dup             
	//  232  356:bipush          56
	//  233  358:ldc2            #270 <String "GTQ">
	//  234  361:aastore         
	//  235  362:dup             
	//  236  363:bipush          57
	//  237  365:ldc2            #272 <String "GYD">
	//  238  368:aastore         
	//  239  369:dup             
	//  240  370:bipush          58
	//  241  372:ldc2            #274 <String "HKD">
	//  242  375:aastore         
	//  243  376:dup             
	//  244  377:bipush          59
	//  245  379:ldc2            #276 <String "HNL">
	//  246  382:aastore         
	//  247  383:dup             
	//  248  384:bipush          60
	//  249  386:ldc2            #278 <String "HRK">
	//  250  389:aastore         
	//  251  390:dup             
	//  252  391:bipush          61
	//  253  393:ldc2            #280 <String "HTG">
	//  254  396:aastore         
	//  255  397:dup             
	//  256  398:bipush          62
	//  257  400:ldc2            #282 <String "HUF">
	//  258  403:aastore         
	//  259  404:dup             
	//  260  405:bipush          63
	//  261  407:ldc2            #284 <String "IDR">
	//  262  410:aastore         
	//  263  411:dup             
	//  264  412:bipush          64
	//  265  414:ldc2            #286 <String "ILS">
	//  266  417:aastore         
	//  267  418:dup             
	//  268  419:bipush          65
	//  269  421:ldc2            #288 <String "IMP">
	//  270  424:aastore         
	//  271  425:dup             
	//  272  426:bipush          66
	//  273  428:ldc2            #290 <String "INR">
	//  274  431:aastore         
	//  275  432:dup             
	//  276  433:bipush          67
	//  277  435:ldc2            #292 <String "IQD">
	//  278  438:aastore         
	//  279  439:dup             
	//  280  440:bipush          68
	//  281  442:ldc2            #294 <String "IRR">
	//  282  445:aastore         
	//  283  446:dup             
	//  284  447:bipush          69
	//  285  449:ldc2            #296 <String "ISK">
	//  286  452:aastore         
	//  287  453:dup             
	//  288  454:bipush          70
	//  289  456:ldc2            #298 <String "JEP">
	//  290  459:aastore         
	//  291  460:dup             
	//  292  461:bipush          71
	//  293  463:ldc2            #300 <String "JMD">
	//  294  466:aastore         
	//  295  467:dup             
	//  296  468:bipush          72
	//  297  470:ldc2            #302 <String "JOD">
	//  298  473:aastore         
	//  299  474:dup             
	//  300  475:bipush          73
	//  301  477:ldc2            #304 <String "JPY">
	//  302  480:aastore         
	//  303  481:dup             
	//  304  482:bipush          74
	//  305  484:ldc2            #306 <String "KES">
	//  306  487:aastore         
	//  307  488:dup             
	//  308  489:bipush          75
	//  309  491:ldc2            #308 <String "KGS">
	//  310  494:aastore         
	//  311  495:dup             
	//  312  496:bipush          76
	//  313  498:ldc2            #310 <String "KHR">
	//  314  501:aastore         
	//  315  502:dup             
	//  316  503:bipush          77
	//  317  505:ldc2            #312 <String "KMF">
	//  318  508:aastore         
	//  319  509:dup             
	//  320  510:bipush          78
	//  321  512:ldc2            #314 <String "KPW">
	//  322  515:aastore         
	//  323  516:dup             
	//  324  517:bipush          79
	//  325  519:ldc2            #316 <String "KRW">
	//  326  522:aastore         
	//  327  523:dup             
	//  328  524:bipush          80
	//  329  526:ldc2            #318 <String "KWD">
	//  330  529:aastore         
	//  331  530:dup             
	//  332  531:bipush          81
	//  333  533:ldc2            #320 <String "KYD">
	//  334  536:aastore         
	//  335  537:dup             
	//  336  538:bipush          82
	//  337  540:ldc2            #322 <String "KZT">
	//  338  543:aastore         
	//  339  544:dup             
	//  340  545:bipush          83
	//  341  547:ldc2            #324 <String "LAK">
	//  342  550:aastore         
	//  343  551:dup             
	//  344  552:bipush          84
	//  345  554:ldc2            #326 <String "LBP">
	//  346  557:aastore         
	//  347  558:dup             
	//  348  559:bipush          85
	//  349  561:ldc2            #328 <String "LKR">
	//  350  564:aastore         
	//  351  565:dup             
	//  352  566:bipush          86
	//  353  568:ldc2            #330 <String "LRD">
	//  354  571:aastore         
	//  355  572:dup             
	//  356  573:bipush          87
	//  357  575:ldc2            #332 <String "LSL">
	//  358  578:aastore         
	//  359  579:dup             
	//  360  580:bipush          88
	//  361  582:ldc2            #334 <String "LTL">
	//  362  585:aastore         
	//  363  586:dup             
	//  364  587:bipush          89
	//  365  589:ldc2            #336 <String "LVL">
	//  366  592:aastore         
	//  367  593:dup             
	//  368  594:bipush          90
	//  369  596:ldc2            #338 <String "LYD">
	//  370  599:aastore         
	//  371  600:dup             
	//  372  601:bipush          91
	//  373  603:ldc2            #340 <String "MAD">
	//  374  606:aastore         
	//  375  607:dup             
	//  376  608:bipush          92
	//  377  610:ldc2            #342 <String "MDL">
	//  378  613:aastore         
	//  379  614:dup             
	//  380  615:bipush          93
	//  381  617:ldc2            #344 <String "MGA">
	//  382  620:aastore         
	//  383  621:dup             
	//  384  622:bipush          94
	//  385  624:ldc2            #346 <String "MKD">
	//  386  627:aastore         
	//  387  628:dup             
	//  388  629:bipush          95
	//  389  631:ldc2            #348 <String "MMK">
	//  390  634:aastore         
	//  391  635:dup             
	//  392  636:bipush          96
	//  393  638:ldc2            #350 <String "MNT">
	//  394  641:aastore         
	//  395  642:dup             
	//  396  643:bipush          97
	//  397  645:ldc2            #352 <String "MOP">
	//  398  648:aastore         
	//  399  649:dup             
	//  400  650:bipush          98
	//  401  652:ldc2            #354 <String "MRO">
	//  402  655:aastore         
	//  403  656:dup             
	//  404  657:bipush          99
	//  405  659:ldc2            #356 <String "MTL">
	//  406  662:aastore         
	//  407  663:dup             
	//  408  664:bipush          100
	//  409  666:ldc2            #358 <String "MUR">
	//  410  669:aastore         
	//  411  670:dup             
	//  412  671:bipush          101
	//  413  673:ldc2            #360 <String "MVR">
	//  414  676:aastore         
	//  415  677:dup             
	//  416  678:bipush          102
	//  417  680:ldc2            #362 <String "MWK">
	//  418  683:aastore         
	//  419  684:dup             
	//  420  685:bipush          103
	//  421  687:ldc2            #364 <String "MXN">
	//  422  690:aastore         
	//  423  691:dup             
	//  424  692:bipush          104
	//  425  694:ldc2            #366 <String "MYR">
	//  426  697:aastore         
	//  427  698:dup             
	//  428  699:bipush          105
	//  429  701:ldc2            #368 <String "MZN">
	//  430  704:aastore         
	//  431  705:dup             
	//  432  706:bipush          106
	//  433  708:ldc2            #370 <String "NAD">
	//  434  711:aastore         
	//  435  712:dup             
	//  436  713:bipush          107
	//  437  715:ldc2            #372 <String "NGN">
	//  438  718:aastore         
	//  439  719:dup             
	//  440  720:bipush          108
	//  441  722:ldc2            #374 <String "NIO">
	//  442  725:aastore         
	//  443  726:dup             
	//  444  727:bipush          109
	//  445  729:ldc2            #376 <String "NOK">
	//  446  732:aastore         
	//  447  733:dup             
	//  448  734:bipush          110
	//  449  736:ldc2            #378 <String "NPR">
	//  450  739:aastore         
	//  451  740:dup             
	//  452  741:bipush          111
	//  453  743:ldc2            #380 <String "NZD">
	//  454  746:aastore         
	//  455  747:dup             
	//  456  748:bipush          112
	//  457  750:ldc2            #382 <String "OMR">
	//  458  753:aastore         
	//  459  754:dup             
	//  460  755:bipush          113
	//  461  757:ldc2            #384 <String "PAB">
	//  462  760:aastore         
	//  463  761:dup             
	//  464  762:bipush          114
	//  465  764:ldc2            #386 <String "PEN">
	//  466  767:aastore         
	//  467  768:dup             
	//  468  769:bipush          115
	//  469  771:ldc2            #388 <String "PGK">
	//  470  774:aastore         
	//  471  775:dup             
	//  472  776:bipush          116
	//  473  778:ldc2            #390 <String "PHP">
	//  474  781:aastore         
	//  475  782:dup             
	//  476  783:bipush          117
	//  477  785:ldc2            #392 <String "PKR">
	//  478  788:aastore         
	//  479  789:dup             
	//  480  790:bipush          118
	//  481  792:ldc2            #394 <String "PLN">
	//  482  795:aastore         
	//  483  796:dup             
	//  484  797:bipush          119
	//  485  799:ldc2            #396 <String "PYG">
	//  486  802:aastore         
	//  487  803:dup             
	//  488  804:bipush          120
	//  489  806:ldc2            #398 <String "QAR">
	//  490  809:aastore         
	//  491  810:dup             
	//  492  811:bipush          121
	//  493  813:ldc2            #400 <String "RON">
	//  494  816:aastore         
	//  495  817:dup             
	//  496  818:bipush          122
	//  497  820:ldc2            #402 <String "RSD">
	//  498  823:aastore         
	//  499  824:dup             
	//  500  825:bipush          123
	//  501  827:ldc2            #404 <String "RUB">
	//  502  830:aastore         
	//  503  831:dup             
	//  504  832:bipush          124
	//  505  834:ldc2            #406 <String "RWF">
	//  506  837:aastore         
	//  507  838:dup             
	//  508  839:bipush          125
	//  509  841:ldc2            #408 <String "SAR">
	//  510  844:aastore         
	//  511  845:dup             
	//  512  846:bipush          126
	//  513  848:ldc2            #410 <String "SBD">
	//  514  851:aastore         
	//  515  852:dup             
	//  516  853:bipush          127
	//  517  855:ldc2            #412 <String "SCR">
	//  518  858:aastore         
	//  519  859:dup             
	//  520  860:sipush          128
	//  521  863:ldc2            #414 <String "SDG">
	//  522  866:aastore         
	//  523  867:dup             
	//  524  868:sipush          129
	//  525  871:ldc2            #416 <String "SEK">
	//  526  874:aastore         
	//  527  875:dup             
	//  528  876:sipush          130
	//  529  879:ldc2            #418 <String "SGD">
	//  530  882:aastore         
	//  531  883:dup             
	//  532  884:sipush          131
	//  533  887:ldc2            #420 <String "SHP">
	//  534  890:aastore         
	//  535  891:dup             
	//  536  892:sipush          132
	//  537  895:ldc2            #422 <String "SLL">
	//  538  898:aastore         
	//  539  899:dup             
	//  540  900:sipush          133
	//  541  903:ldc2            #424 <String "SOS">
	//  542  906:aastore         
	//  543  907:dup             
	//  544  908:sipush          134
	//  545  911:ldc2            #426 <String "SRD">
	//  546  914:aastore         
	//  547  915:dup             
	//  548  916:sipush          135
	//  549  919:ldc2            #428 <String "STD">
	//  550  922:aastore         
	//  551  923:dup             
	//  552  924:sipush          136
	//  553  927:ldc2            #430 <String "SVC">
	//  554  930:aastore         
	//  555  931:dup             
	//  556  932:sipush          137
	//  557  935:ldc2            #432 <String "SYP">
	//  558  938:aastore         
	//  559  939:dup             
	//  560  940:sipush          138
	//  561  943:ldc2            #434 <String "SZL">
	//  562  946:aastore         
	//  563  947:dup             
	//  564  948:sipush          139
	//  565  951:ldc2            #436 <String "THB">
	//  566  954:aastore         
	//  567  955:dup             
	//  568  956:sipush          140
	//  569  959:ldc2            #438 <String "TJS">
	//  570  962:aastore         
	//  571  963:dup             
	//  572  964:sipush          141
	//  573  967:ldc2            #440 <String "TMT">
	//  574  970:aastore         
	//  575  971:dup             
	//  576  972:sipush          142
	//  577  975:ldc2            #442 <String "TND">
	//  578  978:aastore         
	//  579  979:dup             
	//  580  980:sipush          143
	//  581  983:ldc2            #444 <String "TOP">
	//  582  986:aastore         
	//  583  987:dup             
	//  584  988:sipush          144
	//  585  991:ldc2            #446 <String "TRY">
	//  586  994:aastore         
	//  587  995:dup             
	//  588  996:sipush          145
	//  589  999:ldc2            #448 <String "TTD">
	//  590 1002:aastore         
	//  591 1003:dup             
	//  592 1004:sipush          146
	//  593 1007:ldc2            #450 <String "TWD">
	//  594 1010:aastore         
	//  595 1011:dup             
	//  596 1012:sipush          147
	//  597 1015:ldc2            #452 <String "TZS">
	//  598 1018:aastore         
	//  599 1019:dup             
	//  600 1020:sipush          148
	//  601 1023:ldc2            #454 <String "UAH">
	//  602 1026:aastore         
	//  603 1027:dup             
	//  604 1028:sipush          149
	//  605 1031:ldc2            #456 <String "UGX">
	//  606 1034:aastore         
	//  607 1035:dup             
	//  608 1036:sipush          150
	//  609 1039:ldc2            #458 <String "USD">
	//  610 1042:aastore         
	//  611 1043:dup             
	//  612 1044:sipush          151
	//  613 1047:ldc2            #460 <String "UYU">
	//  614 1050:aastore         
	//  615 1051:dup             
	//  616 1052:sipush          152
	//  617 1055:ldc2            #462 <String "UZS">
	//  618 1058:aastore         
	//  619 1059:dup             
	//  620 1060:sipush          153
	//  621 1063:ldc2            #464 <String "VEF">
	//  622 1066:aastore         
	//  623 1067:dup             
	//  624 1068:sipush          154
	//  625 1071:ldc2            #466 <String "VND">
	//  626 1074:aastore         
	//  627 1075:dup             
	//  628 1076:sipush          155
	//  629 1079:ldc2            #468 <String "VUV">
	//  630 1082:aastore         
	//  631 1083:dup             
	//  632 1084:sipush          156
	//  633 1087:ldc2            #470 <String "WST">
	//  634 1090:aastore         
	//  635 1091:dup             
	//  636 1092:sipush          157
	//  637 1095:ldc2            #472 <String "XAF">
	//  638 1098:aastore         
	//  639 1099:dup             
	//  640 1100:sipush          158
	//  641 1103:ldc2            #474 <String "XAG">
	//  642 1106:aastore         
	//  643 1107:dup             
	//  644 1108:sipush          159
	//  645 1111:ldc2            #476 <String "XAU">
	//  646 1114:aastore         
	//  647 1115:dup             
	//  648 1116:sipush          160
	//  649 1119:ldc2            #478 <String "XCD">
	//  650 1122:aastore         
	//  651 1123:dup             
	//  652 1124:sipush          161
	//  653 1127:ldc2            #480 <String "XDR">
	//  654 1130:aastore         
	//  655 1131:dup             
	//  656 1132:sipush          162
	//  657 1135:ldc2            #482 <String "XOF">
	//  658 1138:aastore         
	//  659 1139:dup             
	//  660 1140:sipush          163
	//  661 1143:ldc2            #484 <String "XPD">
	//  662 1146:aastore         
	//  663 1147:dup             
	//  664 1148:sipush          164
	//  665 1151:ldc2            #486 <String "XPF">
	//  666 1154:aastore         
	//  667 1155:dup             
	//  668 1156:sipush          165
	//  669 1159:ldc2            #488 <String "XPT">
	//  670 1162:aastore         
	//  671 1163:dup             
	//  672 1164:sipush          166
	//  673 1167:ldc2            #490 <String "YER">
	//  674 1170:aastore         
	//  675 1171:dup             
	//  676 1172:sipush          167
	//  677 1175:ldc2            #492 <String "ZAR">
	//  678 1178:aastore         
	//  679 1179:dup             
	//  680 1180:sipush          168
	//  681 1183:ldc2            #494 <String "ZMK">
	//  682 1186:aastore         
	//  683 1187:dup             
	//  684 1188:sipush          169
	//  685 1191:ldc2            #496 <String "ZMW">
	//  686 1194:aastore         
	//  687 1195:dup             
	//  688 1196:sipush          170
	//  689 1199:ldc2            #498 <String "ZWL">
	//  690 1202:aastore         
	//  691 1203:invokestatic    #504 <Method java.util.List Arrays.asList(Object[])>
	//  692 1206:invokespecial   #508 <Method void HashSet(java.util.Collection)>
	//  693 1209:putstatic       #510 <Field Set m>
	//  694 1212:new             #154 <Class HashSet>
	//  695 1215:dup             
	//  696 1216:ldc2            #512 <String "calypso appcrawler">
	//  697 1219:invokestatic    #518 <Method java.util.List Collections.singletonList(Object)>
	//  698 1222:invokespecial   #508 <Method void HashSet(java.util.Collection)>
	//  699 1225:putstatic       #520 <Field Set n>
	//  700 1228:new             #154 <Class HashSet>
	//  701 1231:dup             
	//  702 1232:iconst_2        
	//  703 1233:anewarray       String[]
	//  704 1236:dup             
	//  705 1237:iconst_0        
	//  706 1238:ldc2            #522 <String "android.permission.ACCESS_NETWORK_STATE">
	//  707 1241:aastore         
	//  708 1242:dup             
	//  709 1243:iconst_1        
	//  710 1244:ldc2            #524 <String "android.permission.INTERNET">
	//  711 1247:aastore         
	//  712 1248:invokestatic    #504 <Method java.util.List Arrays.asList(Object[])>
	//  713 1251:invokespecial   #508 <Method void HashSet(java.util.Collection)>
	//  714 1254:putstatic       #526 <Field Set o>
	//  715 1257:aconst_null     
	//  716 1258:putstatic       #528 <Field Appboy p>
	//  717 1261:new             #4   <Class Object>
	//  718 1264:dup             
	//  719 1265:invokespecial   #530 <Method void Object()>
	//  720 1268:putstatic       #532 <Field Object A>
	//  721 1271:iconst_0        
	//  722 1272:putstatic       #534 <Field boolean D>
	//  723 1275:iconst_0        
	//  724 1276:putstatic       #536 <Field boolean E>
	//  725 1279:iconst_0        
	//  726 1280:putstatic       #538 <Field boolean F>
	//* 727 1283:return          
	}
}
