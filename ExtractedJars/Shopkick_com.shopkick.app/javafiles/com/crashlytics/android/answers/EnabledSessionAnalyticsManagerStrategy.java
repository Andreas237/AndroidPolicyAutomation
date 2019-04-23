// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import android.content.Context;
import io.fabric.sdk.android.*;
import io.fabric.sdk.android.services.common.ApiKey;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.events.FilesSender;
import io.fabric.sdk.android.services.events.TimeBasedFileRollOverRunnable;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.settings.AnalyticsSettingsData;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.crashlytics.android.answers:
//			SessionAnalyticsManagerStrategy, KeepAllEventFilter, SessionAnalyticsFilesManager, SessionEvent, 
//			EventFilter, FirebaseAnalyticsApiAdapter, SessionAnalyticsFilesSender, AnswersRetryFilesSender, 
//			SamplingEventFilter, SessionEventMetadata

class EnabledSessionAnalyticsManagerStrategy
	implements SessionAnalyticsManagerStrategy
{

	public EnabledSessionAnalyticsManagerStrategy(Kit kit1, Context context1, ScheduledExecutorService scheduledexecutorservice, SessionAnalyticsFilesManager sessionanalyticsfilesmanager, HttpRequestFactory httprequestfactory, SessionEventMetadata sessioneventmetadata, FirebaseAnalyticsApiAdapter firebaseanalyticsapiadapter)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #45  <Class AtomicReference>
	//    4    8:dup             
	//    5    9:invokespecial   #46  <Method void AtomicReference()>
	//    6   12:putfield        #48  <Field AtomicReference rolloverFutureRef>
		apiKey = new ApiKey();
	//    7   15:aload_0         
	//    8   16:new             #50  <Class ApiKey>
	//    9   19:dup             
	//   10   20:invokespecial   #51  <Method void ApiKey()>
	//   11   23:putfield        #53  <Field ApiKey apiKey>
		eventFilter = ((EventFilter) (new KeepAllEventFilter()));
	//   12   26:aload_0         
	//   13   27:new             #55  <Class KeepAllEventFilter>
	//   14   30:dup             
	//   15   31:invokespecial   #56  <Method void KeepAllEventFilter()>
	//   16   34:putfield        #58  <Field EventFilter eventFilter>
		customEventsEnabled = true;
	//   17   37:aload_0         
	//   18   38:iconst_1        
	//   19   39:putfield        #60  <Field boolean customEventsEnabled>
		predefinedEventsEnabled = true;
	//   20   42:aload_0         
	//   21   43:iconst_1        
	//   22   44:putfield        #62  <Field boolean predefinedEventsEnabled>
		rolloverIntervalSeconds = -1;
	//   23   47:aload_0         
	//   24   48:iconst_m1       
	//   25   49:putfield        #64  <Field int rolloverIntervalSeconds>
		forwardToFirebaseAnalyticsEnabled = false;
	//   26   52:aload_0         
	//   27   53:iconst_0        
	//   28   54:putfield        #66  <Field boolean forwardToFirebaseAnalyticsEnabled>
		includePurchaseEventsInForwardedEvents = false;
	//   29   57:aload_0         
	//   30   58:iconst_0        
	//   31   59:putfield        #68  <Field boolean includePurchaseEventsInForwardedEvents>
		kit = kit1;
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:putfield        #70  <Field Kit kit>
		context = context1;
	//   35   67:aload_0         
	//   36   68:aload_2         
	//   37   69:putfield        #72  <Field Context context>
		executorService = scheduledexecutorservice;
	//   38   72:aload_0         
	//   39   73:aload_3         
	//   40   74:putfield        #74  <Field ScheduledExecutorService executorService>
		filesManager = sessionanalyticsfilesmanager;
	//   41   77:aload_0         
	//   42   78:aload           4
	//   43   80:putfield        #76  <Field SessionAnalyticsFilesManager filesManager>
		httpRequestFactory = httprequestfactory;
	//   44   83:aload_0         
	//   45   84:aload           5
	//   46   86:putfield        #78  <Field HttpRequestFactory httpRequestFactory>
		metadata = sessioneventmetadata;
	//   47   89:aload_0         
	//   48   90:aload           6
	//   49   92:putfield        #80  <Field SessionEventMetadata metadata>
		firebaseAnalyticsApiAdapter = firebaseanalyticsapiadapter;
	//   50   95:aload_0         
	//   51   96:aload           7
	//   52   98:putfield        #82  <Field FirebaseAnalyticsApiAdapter firebaseAnalyticsApiAdapter>
	//   53  101:return          
	}

	public void cancelTimeBasedFileRollOver()
	{
		if(rolloverFutureRef.get() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field AtomicReference rolloverFutureRef>
	//*   2    4:invokevirtual   #88  <Method Object AtomicReference.get()>
	//*   3    7:ifnull          44
		{
			CommonUtils.logControlled(context, "Cancelling time-based rollover because no events are currently being generated.");
	//    4   10:aload_0         
	//    5   11:getfield        #72  <Field Context context>
	//    6   14:ldc1            #90  <String "Cancelling time-based rollover because no events are currently being generated.">
	//    7   16:invokestatic    #96  <Method void CommonUtils.logControlled(Context, String)>
			((ScheduledFuture)rolloverFutureRef.get()).cancel(false);
	//    8   19:aload_0         
	//    9   20:getfield        #48  <Field AtomicReference rolloverFutureRef>
	//   10   23:invokevirtual   #88  <Method Object AtomicReference.get()>
	//   11   26:checkcast       #98  <Class ScheduledFuture>
	//   12   29:iconst_0        
	//   13   30:invokeinterface #102 <Method boolean ScheduledFuture.cancel(boolean)>
	//   14   35:pop             
			rolloverFutureRef.set(((Object) (null)));
	//   15   36:aload_0         
	//   16   37:getfield        #48  <Field AtomicReference rolloverFutureRef>
	//   17   40:aconst_null     
	//   18   41:invokevirtual   #106 <Method void AtomicReference.set(Object)>
		}
	//   19   44:return          
	}

	public void deleteAllEvents()
	{
		filesManager.deleteAllEventsFiles();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field SessionAnalyticsFilesManager filesManager>
	//    2    4:invokevirtual   #112 <Method void SessionAnalyticsFilesManager.deleteAllEventsFiles()>
	//    3    7:return          
	}

	public void processEvent(SessionEvent.Builder builder)
	{
		builder = ((SessionEvent.Builder) (builder.build(metadata)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #80  <Field SessionEventMetadata metadata>
	//    3    5:invokevirtual   #124 <Method SessionEvent SessionEvent$Builder.build(SessionEventMetadata)>
	//    4    8:astore_1        
		if(!customEventsEnabled && SessionEvent.Type.CUSTOM.equals(((Object) (((SessionEvent) (builder)).type))))
	//*   5    9:aload_0         
	//*   6   10:getfield        #60  <Field boolean customEventsEnabled>
	//*   7   13:ifne            73
	//*   8   16:getstatic       #130 <Field SessionEvent$Type SessionEvent$Type.CUSTOM>
	//*   9   19:aload_1         
	//*  10   20:getfield        #135 <Field SessionEvent$Type SessionEvent.type>
	//*  11   23:invokevirtual   #139 <Method boolean SessionEvent$Type.equals(Object)>
	//*  12   26:ifeq            73
		{
			Logger logger = Fabric.getLogger();
	//   13   29:invokestatic    #145 <Method Logger Fabric.getLogger()>
	//   14   32:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   15   34:new             #147 <Class StringBuilder>
	//   16   37:dup             
	//   17   38:invokespecial   #148 <Method void StringBuilder()>
	//   18   41:astore          5
			stringbuilder.append("Custom events tracking disabled - skipping event: ");
	//   19   43:aload           5
	//   20   45:ldc1            #150 <String "Custom events tracking disabled - skipping event: ">
	//   21   47:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   22   50:pop             
			stringbuilder.append(((Object) (builder)));
	//   23   51:aload           5
	//   24   53:aload_1         
	//   25   54:invokevirtual   #157 <Method StringBuilder StringBuilder.append(Object)>
	//   26   57:pop             
			logger.d("Answers", stringbuilder.toString());
	//   27   58:aload           4
	//   28   60:ldc1            #159 <String "Answers">
	//   29   62:aload           5
	//   30   64:invokevirtual   #163 <Method String StringBuilder.toString()>
	//   31   67:invokeinterface #169 <Method void Logger.d(String, String)>
			return;
	//   32   72:return          
		}
		if(!predefinedEventsEnabled && SessionEvent.Type.PREDEFINED.equals(((Object) (((SessionEvent) (builder)).type))))
	//*  33   73:aload_0         
	//*  34   74:getfield        #62  <Field boolean predefinedEventsEnabled>
	//*  35   77:ifne            137
	//*  36   80:getstatic       #172 <Field SessionEvent$Type SessionEvent$Type.PREDEFINED>
	//*  37   83:aload_1         
	//*  38   84:getfield        #135 <Field SessionEvent$Type SessionEvent.type>
	//*  39   87:invokevirtual   #139 <Method boolean SessionEvent$Type.equals(Object)>
	//*  40   90:ifeq            137
		{
			Logger logger1 = Fabric.getLogger();
	//   41   93:invokestatic    #145 <Method Logger Fabric.getLogger()>
	//   42   96:astore          4
			StringBuilder stringbuilder1 = new StringBuilder();
	//   43   98:new             #147 <Class StringBuilder>
	//   44  101:dup             
	//   45  102:invokespecial   #148 <Method void StringBuilder()>
	//   46  105:astore          5
			stringbuilder1.append("Predefined events tracking disabled - skipping event: ");
	//   47  107:aload           5
	//   48  109:ldc1            #174 <String "Predefined events tracking disabled - skipping event: ">
	//   49  111:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   50  114:pop             
			stringbuilder1.append(((Object) (builder)));
	//   51  115:aload           5
	//   52  117:aload_1         
	//   53  118:invokevirtual   #157 <Method StringBuilder StringBuilder.append(Object)>
	//   54  121:pop             
			logger1.d("Answers", stringbuilder1.toString());
	//   55  122:aload           4
	//   56  124:ldc1            #159 <String "Answers">
	//   57  126:aload           5
	//   58  128:invokevirtual   #163 <Method String StringBuilder.toString()>
	//   59  131:invokeinterface #169 <Method void Logger.d(String, String)>
			return;
	//   60  136:return          
		}
		if(eventFilter.skipEvent(((SessionEvent) (builder))))
	//*  61  137:aload_0         
	//*  62  138:getfield        #58  <Field EventFilter eventFilter>
	//*  63  141:aload_1         
	//*  64  142:invokeinterface #180 <Method boolean EventFilter.skipEvent(SessionEvent)>
	//*  65  147:ifeq            194
		{
			Logger logger2 = Fabric.getLogger();
	//   66  150:invokestatic    #145 <Method Logger Fabric.getLogger()>
	//   67  153:astore          4
			StringBuilder stringbuilder2 = new StringBuilder();
	//   68  155:new             #147 <Class StringBuilder>
	//   69  158:dup             
	//   70  159:invokespecial   #148 <Method void StringBuilder()>
	//   71  162:astore          5
			stringbuilder2.append("Skipping filtered event: ");
	//   72  164:aload           5
	//   73  166:ldc1            #182 <String "Skipping filtered event: ">
	//   74  168:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   75  171:pop             
			stringbuilder2.append(((Object) (builder)));
	//   76  172:aload           5
	//   77  174:aload_1         
	//   78  175:invokevirtual   #157 <Method StringBuilder StringBuilder.append(Object)>
	//   79  178:pop             
			logger2.d("Answers", stringbuilder2.toString());
	//   80  179:aload           4
	//   81  181:ldc1            #159 <String "Answers">
	//   82  183:aload           5
	//   83  185:invokevirtual   #163 <Method String StringBuilder.toString()>
	//   84  188:invokeinterface #169 <Method void Logger.d(String, String)>
			return;
	//   85  193:return          
		}
		try
		{
			filesManager.writeEvent(((Object) (builder)));
	//   86  194:aload_0         
	//   87  195:getfield        #76  <Field SessionAnalyticsFilesManager filesManager>
	//   88  198:aload_1         
	//   89  199:invokevirtual   #185 <Method void SessionAnalyticsFilesManager.writeEvent(Object)>
		}
	//*  90  202:goto            252
		catch(IOException ioexception)
	//*  91  205:astore          4
		{
			Logger logger3 = Fabric.getLogger();
	//   92  207:invokestatic    #145 <Method Logger Fabric.getLogger()>
	//   93  210:astore          5
			StringBuilder stringbuilder3 = new StringBuilder();
	//   94  212:new             #147 <Class StringBuilder>
	//   95  215:dup             
	//   96  216:invokespecial   #148 <Method void StringBuilder()>
	//   97  219:astore          6
			stringbuilder3.append("Failed to write event: ");
	//   98  221:aload           6
	//   99  223:ldc1            #187 <String "Failed to write event: ">
	//  100  225:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  101  228:pop             
			stringbuilder3.append(((Object) (builder)));
	//  102  229:aload           6
	//  103  231:aload_1         
	//  104  232:invokevirtual   #157 <Method StringBuilder StringBuilder.append(Object)>
	//  105  235:pop             
			logger3.e("Answers", stringbuilder3.toString(), ((Throwable) (ioexception)));
	//  106  236:aload           5
	//  107  238:ldc1            #159 <String "Answers">
	//  108  240:aload           6
	//  109  242:invokevirtual   #163 <Method String StringBuilder.toString()>
	//  110  245:aload           4
	//  111  247:invokeinterface #191 <Method void Logger.e(String, String, Throwable)>
		}
		scheduleTimeBasedRollOverIfNeeded();
	//  112  252:aload_0         
	//  113  253:invokevirtual   #194 <Method void scheduleTimeBasedRollOverIfNeeded()>
		boolean flag;
		if(!SessionEvent.Type.CUSTOM.equals(((Object) (((SessionEvent) (builder)).type))) && !SessionEvent.Type.PREDEFINED.equals(((Object) (((SessionEvent) (builder)).type))))
	//* 114  256:getstatic       #130 <Field SessionEvent$Type SessionEvent$Type.CUSTOM>
	//* 115  259:aload_1         
	//* 116  260:getfield        #135 <Field SessionEvent$Type SessionEvent.type>
	//* 117  263:invokevirtual   #139 <Method boolean SessionEvent$Type.equals(Object)>
	//* 118  266:ifne            290
	//* 119  269:getstatic       #172 <Field SessionEvent$Type SessionEvent$Type.PREDEFINED>
	//* 120  272:aload_1         
	//* 121  273:getfield        #135 <Field SessionEvent$Type SessionEvent.type>
	//* 122  276:invokevirtual   #139 <Method boolean SessionEvent$Type.equals(Object)>
	//* 123  279:ifeq            285
	//* 124  282:goto            290
			flag = false;
	//  125  285:iconst_0        
	//  126  286:istore_2        
		else
	//* 127  287:goto            292
			flag = true;
	//  128  290:iconst_1        
	//  129  291:istore_2        
		boolean flag1 = "purchase".equals(((Object) (((SessionEvent) (builder)).predefinedType)));
	//  130  292:ldc1            #196 <String "purchase">
	//  131  294:aload_1         
	//  132  295:getfield        #200 <Field String SessionEvent.predefinedType>
	//  133  298:invokevirtual   #203 <Method boolean String.equals(Object)>
	//  134  301:istore_3        
		if(forwardToFirebaseAnalyticsEnabled)
	//* 135  302:aload_0         
	//* 136  303:getfield        #66  <Field boolean forwardToFirebaseAnalyticsEnabled>
	//* 137  306:ifeq            383
		{
			if(!flag)
	//* 138  309:iload_2         
	//* 139  310:ifne            314
				return;
	//  140  313:return          
			if(flag1 && !includePurchaseEventsInForwardedEvents)
	//* 141  314:iload_3         
	//* 142  315:ifeq            326
	//* 143  318:aload_0         
	//* 144  319:getfield        #68  <Field boolean includePurchaseEventsInForwardedEvents>
	//* 145  322:ifne            326
				return;
	//  146  325:return          
			try
			{
				firebaseAnalyticsApiAdapter.processEvent(((SessionEvent) (builder)));
	//  147  326:aload_0         
	//  148  327:getfield        #82  <Field FirebaseAnalyticsApiAdapter firebaseAnalyticsApiAdapter>
	//  149  330:aload_1         
	//  150  331:invokevirtual   #208 <Method void FirebaseAnalyticsApiAdapter.processEvent(SessionEvent)>
				return;
	//  151  334:return          
			}
			catch(Exception exception)
	//* 152  335:astore          4
			{
				Logger logger4 = Fabric.getLogger();
	//  153  337:invokestatic    #145 <Method Logger Fabric.getLogger()>
	//  154  340:astore          5
				StringBuilder stringbuilder4 = new StringBuilder();
	//  155  342:new             #147 <Class StringBuilder>
	//  156  345:dup             
	//  157  346:invokespecial   #148 <Method void StringBuilder()>
	//  158  349:astore          6
				stringbuilder4.append("Failed to map event to Firebase: ");
	//  159  351:aload           6
	//  160  353:ldc1            #210 <String "Failed to map event to Firebase: ">
	//  161  355:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  162  358:pop             
				stringbuilder4.append(((Object) (builder)));
	//  163  359:aload           6
	//  164  361:aload_1         
	//  165  362:invokevirtual   #157 <Method StringBuilder StringBuilder.append(Object)>
	//  166  365:pop             
				logger4.e("Answers", stringbuilder4.toString(), ((Throwable) (exception)));
	//  167  366:aload           5
	//  168  368:ldc1            #159 <String "Answers">
	//  169  370:aload           6
	//  170  372:invokevirtual   #163 <Method String StringBuilder.toString()>
	//  171  375:aload           4
	//  172  377:invokeinterface #191 <Method void Logger.e(String, String, Throwable)>
				return;
	//  173  382:return          
			}
		} else
		{
			return;
	//  174  383:return          
		}
	}

	public boolean rollFileOver()
	{
		boolean flag;
		try
		{
			flag = filesManager.rollFileOver();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field SessionAnalyticsFilesManager filesManager>
	//    2    4:invokevirtual   #214 <Method boolean SessionAnalyticsFilesManager.rollFileOver()>
	//    3    7:istore_1        
		}
	//*   4    8:iload_1         
	//*   5    9:ireturn         
		catch(IOException ioexception)
	//*   6   10:astore_2        
		{
			CommonUtils.logControlledError(context, "Failed to roll file over.", ((Throwable) (ioexception)));
	//    7   11:aload_0         
	//    8   12:getfield        #72  <Field Context context>
	//    9   15:ldc1            #216 <String "Failed to roll file over.">
	//   10   17:aload_2         
	//   11   18:invokestatic    #220 <Method void CommonUtils.logControlledError(Context, String, Throwable)>
			return false;
	//   12   21:iconst_0        
	//   13   22:ireturn         
		}
		return flag;
	}

	void scheduleTimeBasedFileRollOver(long l, long l1)
	{
		boolean flag;
		if(rolloverFutureRef.get() == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field AtomicReference rolloverFutureRef>
	//*   2    4:invokevirtual   #88  <Method Object AtomicReference.get()>
	//*   3    7:ifnonnull       16
			flag = true;
	//    4   10:iconst_1        
	//    5   11:istore          5
		else
	//*   6   13:goto            19
			flag = false;
	//    7   16:iconst_0        
	//    8   17:istore          5
		if(flag)
	//*   9   19:iload           5
	//*  10   21:ifeq            123
		{
			TimeBasedFileRollOverRunnable timebasedfilerolloverrunnable = new TimeBasedFileRollOverRunnable(context, ((io.fabric.sdk.android.services.events.FileRollOverManager) (this)));
	//   11   24:new             #226 <Class TimeBasedFileRollOverRunnable>
	//   12   27:dup             
	//   13   28:aload_0         
	//   14   29:getfield        #72  <Field Context context>
	//   15   32:aload_0         
	//   16   33:invokespecial   #229 <Method void TimeBasedFileRollOverRunnable(Context, io.fabric.sdk.android.services.events.FileRollOverManager)>
	//   17   36:astore          6
			Context context1 = context;
	//   18   38:aload_0         
	//   19   39:getfield        #72  <Field Context context>
	//   20   42:astore          7
			StringBuilder stringbuilder = new StringBuilder();
	//   21   44:new             #147 <Class StringBuilder>
	//   22   47:dup             
	//   23   48:invokespecial   #148 <Method void StringBuilder()>
	//   24   51:astore          8
			stringbuilder.append("Scheduling time based file roll over every ");
	//   25   53:aload           8
	//   26   55:ldc1            #231 <String "Scheduling time based file roll over every ">
	//   27   57:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   28   60:pop             
			stringbuilder.append(l1);
	//   29   61:aload           8
	//   30   63:lload_3         
	//   31   64:invokevirtual   #234 <Method StringBuilder StringBuilder.append(long)>
	//   32   67:pop             
			stringbuilder.append(" seconds");
	//   33   68:aload           8
	//   34   70:ldc1            #236 <String " seconds">
	//   35   72:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   36   75:pop             
			CommonUtils.logControlled(context1, stringbuilder.toString());
	//   37   76:aload           7
	//   38   78:aload           8
	//   39   80:invokevirtual   #163 <Method String StringBuilder.toString()>
	//   40   83:invokestatic    #96  <Method void CommonUtils.logControlled(Context, String)>
			try
			{
				rolloverFutureRef.set(((Object) (executorService.scheduleAtFixedRate(((Runnable) (timebasedfilerolloverrunnable)), l, l1, TimeUnit.SECONDS))));
	//   41   86:aload_0         
	//   42   87:getfield        #48  <Field AtomicReference rolloverFutureRef>
	//   43   90:aload_0         
	//   44   91:getfield        #74  <Field ScheduledExecutorService executorService>
	//   45   94:aload           6
	//   46   96:lload_1         
	//   47   97:lload_3         
	//   48   98:getstatic       #242 <Field TimeUnit TimeUnit.SECONDS>
	//   49  101:invokeinterface #248 <Method ScheduledFuture ScheduledExecutorService.scheduleAtFixedRate(Runnable, long, long, TimeUnit)>
	//   50  106:invokevirtual   #106 <Method void AtomicReference.set(Object)>
				return;
	//   51  109:return          
			}
			catch(RejectedExecutionException rejectedexecutionexception)
	//*  52  110:astore          6
			{
				CommonUtils.logControlledError(context, "Failed to schedule time based file roll over", ((Throwable) (rejectedexecutionexception)));
	//   53  112:aload_0         
	//   54  113:getfield        #72  <Field Context context>
	//   55  116:ldc1            #250 <String "Failed to schedule time based file roll over">
	//   56  118:aload           6
	//   57  120:invokestatic    #220 <Method void CommonUtils.logControlledError(Context, String, Throwable)>
			}
		}
	//   58  123:return          
	}

	public void scheduleTimeBasedRollOverIfNeeded()
	{
		boolean flag;
		if(rolloverIntervalSeconds != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field int rolloverIntervalSeconds>
	//*   2    4:iconst_m1       
	//*   3    5:icmpeq          13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_1        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_1        
		if(flag)
	//*   9   15:iload_1         
	//*  10   16:ifeq            33
			scheduleTimeBasedFileRollOver(rolloverIntervalSeconds, rolloverIntervalSeconds);
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:getfield        #64  <Field int rolloverIntervalSeconds>
	//   14   24:i2l             
	//   15   25:aload_0         
	//   16   26:getfield        #64  <Field int rolloverIntervalSeconds>
	//   17   29:i2l             
	//   18   30:invokevirtual   #252 <Method void scheduleTimeBasedFileRollOver(long, long)>
	//   19   33:return          
	}

	public void sendEvents()
	{
		int j;
		List list;
		if(filesSender == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #255 <Field FilesSender filesSender>
	//*   2    4:ifnonnull       18
		{
			CommonUtils.logControlled(context, "skipping files send because we don't yet know the target endpoint");
	//    3    7:aload_0         
	//    4    8:getfield        #72  <Field Context context>
	//    5   11:ldc2            #257 <String "skipping files send because we don't yet know the target endpoint">
	//    6   14:invokestatic    #96  <Method void CommonUtils.logControlled(Context, String)>
			return;
	//    7   17:return          
		}
		CommonUtils.logControlled(context, "Sending all files");
	//    8   18:aload_0         
	//    9   19:getfield        #72  <Field Context context>
	//   10   22:ldc2            #259 <String "Sending all files">
	//   11   25:invokestatic    #96  <Method void CommonUtils.logControlled(Context, String)>
		list = filesManager.getBatchOfFilesToSend();
	//   12   28:aload_0         
	//   13   29:getfield        #76  <Field SessionAnalyticsFilesManager filesManager>
	//   14   32:invokevirtual   #263 <Method List SessionAnalyticsFilesManager.getBatchOfFilesToSend()>
	//   15   35:astore          5
		j = 0;
	//   16   37:iconst_0        
	//   17   38:istore_2        
_L5:
		int i;
		int k;
		i = j;
	//   18   39:iload_2         
	//   19   40:istore_1        
		k = j;
	//   20   41:iload_2         
	//   21   42:istore_3        
		if(list.size() <= 0) goto _L2; else goto _L1
	//   22   43:aload           5
	//   23   45:invokeinterface #269 <Method int List.size()>
	//   24   50:ifle            203
_L1:
		i = j;
	//   25   53:iload_2         
	//   26   54:istore_1        
		CommonUtils.logControlled(context, String.format(Locale.US, "attempt to send batch of %d files", new Object[] {
			Integer.valueOf(list.size())
		}));
	//   27   55:aload_0         
	//   28   56:getfield        #72  <Field Context context>
	//   29   59:getstatic       #275 <Field Locale Locale.US>
	//   30   62:ldc2            #277 <String "attempt to send batch of %d files">
	//   31   65:iconst_1        
	//   32   66:anewarray       Object[]
	//   33   69:dup             
	//   34   70:iconst_0        
	//   35   71:aload           5
	//   36   73:invokeinterface #269 <Method int List.size()>
	//   37   78:invokestatic    #283 <Method Integer Integer.valueOf(int)>
	//   38   81:aastore         
	//   39   82:invokestatic    #287 <Method String String.format(Locale, String, Object[])>
	//   40   85:invokestatic    #96  <Method void CommonUtils.logControlled(Context, String)>
		i = j;
	//   41   88:iload_2         
	//   42   89:istore_1        
		boolean flag = filesSender.send(list);
	//   43   90:aload_0         
	//   44   91:getfield        #255 <Field FilesSender filesSender>
	//   45   94:aload           5
	//   46   96:invokeinterface #293 <Method boolean FilesSender.send(List)>
	//   47  101:istore          4
		k = j;
	//   48  103:iload_2         
	//   49  104:istore_3        
		if(!flag) goto _L4; else goto _L3
	//   50  105:iload           4
	//   51  107:ifeq            215
_L3:
		i = j;
	//   52  110:iload_2         
	//   53  111:istore_1        
		k = j + list.size();
	//   54  112:iload_2         
	//   55  113:aload           5
	//   56  115:invokeinterface #269 <Method int List.size()>
	//   57  120:iadd            
	//   58  121:istore_3        
		i = k;
	//   59  122:iload_3         
	//   60  123:istore_1        
		filesManager.deleteSentFiles(list);
	//   61  124:aload_0         
	//   62  125:getfield        #76  <Field SessionAnalyticsFilesManager filesManager>
	//   63  128:aload           5
	//   64  130:invokevirtual   #297 <Method void SessionAnalyticsFilesManager.deleteSentFiles(List)>
		  goto _L4
	//*  65  133:goto            215
_L6:
		i = k;
	//   66  136:iload_3         
	//   67  137:istore_1        
		list = filesManager.getBatchOfFilesToSend();
	//   68  138:aload_0         
	//   69  139:getfield        #76  <Field SessionAnalyticsFilesManager filesManager>
	//   70  142:invokevirtual   #263 <Method List SessionAnalyticsFilesManager.getBatchOfFilesToSend()>
	//   71  145:astore          5
		j = k;
	//   72  147:iload_3         
	//   73  148:istore_2        
		  goto _L5
	//*  74  149:goto            39
		Exception exception;
		exception;
	//   75  152:astore          5
		Context context1 = context;
	//   76  154:aload_0         
	//   77  155:getfield        #72  <Field Context context>
	//   78  158:astore          6
		StringBuilder stringbuilder = new StringBuilder();
	//   79  160:new             #147 <Class StringBuilder>
	//   80  163:dup             
	//   81  164:invokespecial   #148 <Method void StringBuilder()>
	//   82  167:astore          7
		stringbuilder.append("Failed to send batch of analytics files to server: ");
	//   83  169:aload           7
	//   84  171:ldc2            #299 <String "Failed to send batch of analytics files to server: ">
	//   85  174:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   86  177:pop             
		stringbuilder.append(exception.getMessage());
	//   87  178:aload           7
	//   88  180:aload           5
	//   89  182:invokevirtual   #302 <Method String Exception.getMessage()>
	//   90  185:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   91  188:pop             
		CommonUtils.logControlledError(context1, stringbuilder.toString(), ((Throwable) (exception)));
	//   92  189:aload           6
	//   93  191:aload           7
	//   94  193:invokevirtual   #163 <Method String StringBuilder.toString()>
	//   95  196:aload           5
	//   96  198:invokestatic    #220 <Method void CommonUtils.logControlledError(Context, String, Throwable)>
		k = i;
	//   97  201:iload_1         
	//   98  202:istore_3        
_L2:
		if(k == 0)
	//*  99  203:iload_3         
	//* 100  204:ifne            214
			filesManager.deleteOldestInRollOverIfOverMax();
	//  101  207:aload_0         
	//  102  208:getfield        #76  <Field SessionAnalyticsFilesManager filesManager>
	//  103  211:invokevirtual   #305 <Method void SessionAnalyticsFilesManager.deleteOldestInRollOverIfOverMax()>
		return;
	//  104  214:return          
_L4:
		if(flag) goto _L6; else goto _L2
	//  105  215:iload           4
	//  106  217:ifne            136
	//* 107  220:goto            203
	}

	public void setAnalyticsSettingsData(AnalyticsSettingsData analyticssettingsdata, String s)
	{
		filesSender = ((FilesSender) (AnswersRetryFilesSender.build(new SessionAnalyticsFilesSender(kit, s, analyticssettingsdata.analyticsURL, httpRequestFactory, apiKey.getValue(context)))));
	//    0    0:aload_0         
	//    1    1:new             #309 <Class SessionAnalyticsFilesSender>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #70  <Field Kit kit>
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:getfield        #314 <Field String AnalyticsSettingsData.analyticsURL>
	//    8   14:aload_0         
	//    9   15:getfield        #78  <Field HttpRequestFactory httpRequestFactory>
	//   10   18:aload_0         
	//   11   19:getfield        #53  <Field ApiKey apiKey>
	//   12   22:aload_0         
	//   13   23:getfield        #72  <Field Context context>
	//   14   26:invokevirtual   #318 <Method String ApiKey.getValue(Context)>
	//   15   29:invokespecial   #321 <Method void SessionAnalyticsFilesSender(Kit, String, String, HttpRequestFactory, String)>
	//   16   32:invokestatic    #326 <Method AnswersRetryFilesSender AnswersRetryFilesSender.build(SessionAnalyticsFilesSender)>
	//   17   35:putfield        #255 <Field FilesSender filesSender>
		filesManager.setAnalyticsSettingsData(analyticssettingsdata);
	//   18   38:aload_0         
	//   19   39:getfield        #76  <Field SessionAnalyticsFilesManager filesManager>
	//   20   42:aload_1         
	//   21   43:invokevirtual   #329 <Method void SessionAnalyticsFilesManager.setAnalyticsSettingsData(AnalyticsSettingsData)>
		forwardToFirebaseAnalyticsEnabled = analyticssettingsdata.forwardToFirebaseAnalytics;
	//   22   46:aload_0         
	//   23   47:aload_1         
	//   24   48:getfield        #332 <Field boolean AnalyticsSettingsData.forwardToFirebaseAnalytics>
	//   25   51:putfield        #66  <Field boolean forwardToFirebaseAnalyticsEnabled>
		includePurchaseEventsInForwardedEvents = analyticssettingsdata.includePurchaseEventsInForwardedEvents;
	//   26   54:aload_0         
	//   27   55:aload_1         
	//   28   56:getfield        #333 <Field boolean AnalyticsSettingsData.includePurchaseEventsInForwardedEvents>
	//   29   59:putfield        #68  <Field boolean includePurchaseEventsInForwardedEvents>
		Logger logger = Fabric.getLogger();
	//   30   62:invokestatic    #145 <Method Logger Fabric.getLogger()>
	//   31   65:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   32   66:new             #147 <Class StringBuilder>
	//   33   69:dup             
	//   34   70:invokespecial   #148 <Method void StringBuilder()>
	//   35   73:astore          4
		stringbuilder.append("Firebase analytics forwarding ");
	//   36   75:aload           4
	//   37   77:ldc2            #335 <String "Firebase analytics forwarding ">
	//   38   80:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   39   83:pop             
		if(forwardToFirebaseAnalyticsEnabled)
	//*  40   84:aload_0         
	//*  41   85:getfield        #66  <Field boolean forwardToFirebaseAnalyticsEnabled>
	//*  42   88:ifeq            98
			s = "enabled";
	//   43   91:ldc2            #337 <String "enabled">
	//   44   94:astore_2        
		else
	//*  45   95:goto            102
			s = "disabled";
	//   46   98:ldc2            #339 <String "disabled">
	//   47  101:astore_2        
		stringbuilder.append(s);
	//   48  102:aload           4
	//   49  104:aload_2         
	//   50  105:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   51  108:pop             
		logger.d("Answers", stringbuilder.toString());
	//   52  109:aload_3         
	//   53  110:ldc1            #159 <String "Answers">
	//   54  112:aload           4
	//   55  114:invokevirtual   #163 <Method String StringBuilder.toString()>
	//   56  117:invokeinterface #169 <Method void Logger.d(String, String)>
		logger = Fabric.getLogger();
	//   57  122:invokestatic    #145 <Method Logger Fabric.getLogger()>
	//   58  125:astore_3        
		stringbuilder = new StringBuilder();
	//   59  126:new             #147 <Class StringBuilder>
	//   60  129:dup             
	//   61  130:invokespecial   #148 <Method void StringBuilder()>
	//   62  133:astore          4
		stringbuilder.append("Firebase analytics including purchase events ");
	//   63  135:aload           4
	//   64  137:ldc2            #341 <String "Firebase analytics including purchase events ">
	//   65  140:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   66  143:pop             
		if(includePurchaseEventsInForwardedEvents)
	//*  67  144:aload_0         
	//*  68  145:getfield        #68  <Field boolean includePurchaseEventsInForwardedEvents>
	//*  69  148:ifeq            158
			s = "enabled";
	//   70  151:ldc2            #337 <String "enabled">
	//   71  154:astore_2        
		else
	//*  72  155:goto            162
			s = "disabled";
	//   73  158:ldc2            #339 <String "disabled">
	//   74  161:astore_2        
		stringbuilder.append(s);
	//   75  162:aload           4
	//   76  164:aload_2         
	//   77  165:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   78  168:pop             
		logger.d("Answers", stringbuilder.toString());
	//   79  169:aload_3         
	//   80  170:ldc1            #159 <String "Answers">
	//   81  172:aload           4
	//   82  174:invokevirtual   #163 <Method String StringBuilder.toString()>
	//   83  177:invokeinterface #169 <Method void Logger.d(String, String)>
		customEventsEnabled = analyticssettingsdata.trackCustomEvents;
	//   84  182:aload_0         
	//   85  183:aload_1         
	//   86  184:getfield        #344 <Field boolean AnalyticsSettingsData.trackCustomEvents>
	//   87  187:putfield        #60  <Field boolean customEventsEnabled>
		logger = Fabric.getLogger();
	//   88  190:invokestatic    #145 <Method Logger Fabric.getLogger()>
	//   89  193:astore_3        
		stringbuilder = new StringBuilder();
	//   90  194:new             #147 <Class StringBuilder>
	//   91  197:dup             
	//   92  198:invokespecial   #148 <Method void StringBuilder()>
	//   93  201:astore          4
		stringbuilder.append("Custom event tracking ");
	//   94  203:aload           4
	//   95  205:ldc2            #346 <String "Custom event tracking ">
	//   96  208:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   97  211:pop             
		if(customEventsEnabled)
	//*  98  212:aload_0         
	//*  99  213:getfield        #60  <Field boolean customEventsEnabled>
	//* 100  216:ifeq            226
			s = "enabled";
	//  101  219:ldc2            #337 <String "enabled">
	//  102  222:astore_2        
		else
	//* 103  223:goto            230
			s = "disabled";
	//  104  226:ldc2            #339 <String "disabled">
	//  105  229:astore_2        
		stringbuilder.append(s);
	//  106  230:aload           4
	//  107  232:aload_2         
	//  108  233:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  109  236:pop             
		logger.d("Answers", stringbuilder.toString());
	//  110  237:aload_3         
	//  111  238:ldc1            #159 <String "Answers">
	//  112  240:aload           4
	//  113  242:invokevirtual   #163 <Method String StringBuilder.toString()>
	//  114  245:invokeinterface #169 <Method void Logger.d(String, String)>
		predefinedEventsEnabled = analyticssettingsdata.trackPredefinedEvents;
	//  115  250:aload_0         
	//  116  251:aload_1         
	//  117  252:getfield        #349 <Field boolean AnalyticsSettingsData.trackPredefinedEvents>
	//  118  255:putfield        #62  <Field boolean predefinedEventsEnabled>
		logger = Fabric.getLogger();
	//  119  258:invokestatic    #145 <Method Logger Fabric.getLogger()>
	//  120  261:astore_3        
		stringbuilder = new StringBuilder();
	//  121  262:new             #147 <Class StringBuilder>
	//  122  265:dup             
	//  123  266:invokespecial   #148 <Method void StringBuilder()>
	//  124  269:astore          4
		stringbuilder.append("Predefined event tracking ");
	//  125  271:aload           4
	//  126  273:ldc2            #351 <String "Predefined event tracking ">
	//  127  276:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  128  279:pop             
		if(predefinedEventsEnabled)
	//* 129  280:aload_0         
	//* 130  281:getfield        #62  <Field boolean predefinedEventsEnabled>
	//* 131  284:ifeq            294
			s = "enabled";
	//  132  287:ldc2            #337 <String "enabled">
	//  133  290:astore_2        
		else
	//* 134  291:goto            298
			s = "disabled";
	//  135  294:ldc2            #339 <String "disabled">
	//  136  297:astore_2        
		stringbuilder.append(s);
	//  137  298:aload           4
	//  138  300:aload_2         
	//  139  301:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  140  304:pop             
		logger.d("Answers", stringbuilder.toString());
	//  141  305:aload_3         
	//  142  306:ldc1            #159 <String "Answers">
	//  143  308:aload           4
	//  144  310:invokevirtual   #163 <Method String StringBuilder.toString()>
	//  145  313:invokeinterface #169 <Method void Logger.d(String, String)>
		if(analyticssettingsdata.samplingRate > 1)
	//* 146  318:aload_1         
	//* 147  319:getfield        #354 <Field int AnalyticsSettingsData.samplingRate>
	//* 148  322:iconst_1        
	//* 149  323:icmple          354
		{
			Fabric.getLogger().d("Answers", "Event sampling enabled");
	//  150  326:invokestatic    #145 <Method Logger Fabric.getLogger()>
	//  151  329:ldc1            #159 <String "Answers">
	//  152  331:ldc2            #356 <String "Event sampling enabled">
	//  153  334:invokeinterface #169 <Method void Logger.d(String, String)>
			eventFilter = ((EventFilter) (new SamplingEventFilter(analyticssettingsdata.samplingRate)));
	//  154  339:aload_0         
	//  155  340:new             #358 <Class SamplingEventFilter>
	//  156  343:dup             
	//  157  344:aload_1         
	//  158  345:getfield        #354 <Field int AnalyticsSettingsData.samplingRate>
	//  159  348:invokespecial   #361 <Method void SamplingEventFilter(int)>
	//  160  351:putfield        #58  <Field EventFilter eventFilter>
		}
		rolloverIntervalSeconds = analyticssettingsdata.flushIntervalSeconds;
	//  161  354:aload_0         
	//  162  355:aload_1         
	//  163  356:getfield        #364 <Field int AnalyticsSettingsData.flushIntervalSeconds>
	//  164  359:putfield        #64  <Field int rolloverIntervalSeconds>
		scheduleTimeBasedFileRollOver(0L, rolloverIntervalSeconds);
	//  165  362:aload_0         
	//  166  363:lconst_0        
	//  167  364:aload_0         
	//  168  365:getfield        #64  <Field int rolloverIntervalSeconds>
	//  169  368:i2l             
	//  170  369:invokevirtual   #252 <Method void scheduleTimeBasedFileRollOver(long, long)>
	//  171  372:return          
	}

	static final int UNDEFINED_ROLLOVER_INTERVAL_SECONDS = -1;
	ApiKey apiKey;
	private final Context context;
	boolean customEventsEnabled;
	EventFilter eventFilter;
	private final ScheduledExecutorService executorService;
	private final SessionAnalyticsFilesManager filesManager;
	FilesSender filesSender;
	private final FirebaseAnalyticsApiAdapter firebaseAnalyticsApiAdapter;
	boolean forwardToFirebaseAnalyticsEnabled;
	private final HttpRequestFactory httpRequestFactory;
	boolean includePurchaseEventsInForwardedEvents;
	private final Kit kit;
	final SessionEventMetadata metadata;
	boolean predefinedEventsEnabled;
	private final AtomicReference rolloverFutureRef = new AtomicReference();
	volatile int rolloverIntervalSeconds;
}
