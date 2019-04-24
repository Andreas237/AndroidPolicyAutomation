// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import android.content.Context;
import b.a.a.a.a.b.g;
import b.a.a.a.a.b.i;
import b.a.a.a.a.d.f;
import b.a.a.a.a.e.e;
import b.a.a.a.a.g.b;
import b.a.a.a.c;
import b.a.a.a.l;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.crashlytics.android.answers:
//			SessionAnalyticsManagerStrategy, KeepAllEventFilter, SessionAnalyticsFilesManager, SessionEvent, 
//			EventFilter, FirebaseAnalyticsApiAdapter, SessionAnalyticsFilesSender, AnswersRetryFilesSender, 
//			SamplingEventFilter, SessionEventMetadata

class EnabledSessionAnalyticsManagerStrategy
	implements SessionAnalyticsManagerStrategy
{

	public EnabledSessionAnalyticsManagerStrategy(b.a.a.a.i j, Context context1, ScheduledExecutorService scheduledexecutorservice, SessionAnalyticsFilesManager sessionanalyticsfilesmanager, e e, SessionEventMetadata sessioneventmetadata, FirebaseAnalyticsApiAdapter firebaseanalyticsapiadapter)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #45  <Class AtomicReference>
	//    4    8:dup             
	//    5    9:invokespecial   #46  <Method void AtomicReference()>
	//    6   12:putfield        #48  <Field AtomicReference rolloverFutureRef>
		apiKey = new g();
	//    7   15:aload_0         
	//    8   16:new             #50  <Class g>
	//    9   19:dup             
	//   10   20:invokespecial   #51  <Method void g()>
	//   11   23:putfield        #53  <Field g apiKey>
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
		kit = j;
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:putfield        #70  <Field b.a.a.a.i kit>
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
		httpRequestFactory = e;
	//   44   83:aload_0         
	//   45   84:aload           5
	//   46   86:putfield        #78  <Field e httpRequestFactory>
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
			i.a(context, "Cancelling time-based rollover because no events are currently being generated.");
	//    4   10:aload_0         
	//    5   11:getfield        #72  <Field Context context>
	//    6   14:ldc1            #90  <String "Cancelling time-based rollover because no events are currently being generated.">
	//    7   16:invokestatic    #96  <Method void i.a(Context, String)>
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
		SessionEvent sessionevent = builder.build(metadata);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #80  <Field SessionEventMetadata metadata>
	//    3    5:invokevirtual   #124 <Method SessionEvent SessionEvent$Builder.build(SessionEventMetadata)>
	//    4    8:astore          6
		if(customEventsEnabled || !SessionEvent.Type.CUSTOM.equals(((Object) (sessionevent.type)))) goto _L2; else goto _L1
	//    5   10:aload_0         
	//    6   11:getfield        #60  <Field boolean customEventsEnabled>
	//    7   14:ifne            78
	//    8   17:getstatic       #130 <Field SessionEvent$Type SessionEvent$Type.CUSTOM>
	//    9   20:aload           6
	//   10   22:getfield        #135 <Field SessionEvent$Type SessionEvent.type>
	//   11   25:invokevirtual   #139 <Method boolean SessionEvent$Type.equals(Object)>
	//   12   28:ifeq            78
_L1:
		StringBuilder stringbuilder;
		String s;
		builder = ((SessionEvent.Builder) (c.g()));
	//   13   31:invokestatic    #145 <Method l c.g()>
	//   14   34:astore_1        
		stringbuilder = new StringBuilder();
	//   15   35:new             #147 <Class StringBuilder>
	//   16   38:dup             
	//   17   39:invokespecial   #148 <Method void StringBuilder()>
	//   18   42:astore          4
		s = "Custom events tracking disabled - skipping event: ";
	//   19   44:ldc1            #150 <String "Custom events tracking disabled - skipping event: ">
	//   20   46:astore          5
_L4:
		stringbuilder.append(s);
	//   21   48:aload           4
	//   22   50:aload           5
	//   23   52:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   24   55:pop             
		stringbuilder.append(((Object) (sessionevent)));
	//   25   56:aload           4
	//   26   58:aload           6
	//   27   60:invokevirtual   #157 <Method StringBuilder StringBuilder.append(Object)>
	//   28   63:pop             
		((l) (builder)).a("Answers", stringbuilder.toString());
	//   29   64:aload_1         
	//   30   65:ldc1            #159 <String "Answers">
	//   31   67:aload           4
	//   32   69:invokevirtual   #163 <Method String StringBuilder.toString()>
	//   33   72:invokeinterface #168 <Method void l.a(String, String)>
		return;
	//   34   77:return          
_L2:
		if(!predefinedEventsEnabled && SessionEvent.Type.PREDEFINED.equals(((Object) (sessionevent.type))))
	//*  35   78:aload_0         
	//*  36   79:getfield        #62  <Field boolean predefinedEventsEnabled>
	//*  37   82:ifne            119
	//*  38   85:getstatic       #171 <Field SessionEvent$Type SessionEvent$Type.PREDEFINED>
	//*  39   88:aload           6
	//*  40   90:getfield        #135 <Field SessionEvent$Type SessionEvent.type>
	//*  41   93:invokevirtual   #139 <Method boolean SessionEvent$Type.equals(Object)>
	//*  42   96:ifeq            119
		{
			builder = ((SessionEvent.Builder) (c.g()));
	//   43   99:invokestatic    #145 <Method l c.g()>
	//   44  102:astore_1        
			stringbuilder = new StringBuilder();
	//   45  103:new             #147 <Class StringBuilder>
	//   46  106:dup             
	//   47  107:invokespecial   #148 <Method void StringBuilder()>
	//   48  110:astore          4
			s = "Predefined events tracking disabled - skipping event: ";
	//   49  112:ldc1            #173 <String "Predefined events tracking disabled - skipping event: ">
	//   50  114:astore          5
			continue; /* Loop/switch isn't completed */
	//   51  116:goto            48
		}
		if(!eventFilter.skipEvent(sessionevent))
			break; /* Loop/switch isn't completed */
	//   52  119:aload_0         
	//   53  120:getfield        #58  <Field EventFilter eventFilter>
	//   54  123:aload           6
	//   55  125:invokeinterface #179 <Method boolean EventFilter.skipEvent(SessionEvent)>
	//   56  130:ifeq            153
		builder = ((SessionEvent.Builder) (c.g()));
	//   57  133:invokestatic    #145 <Method l c.g()>
	//   58  136:astore_1        
		stringbuilder = new StringBuilder();
	//   59  137:new             #147 <Class StringBuilder>
	//   60  140:dup             
	//   61  141:invokespecial   #148 <Method void StringBuilder()>
	//   62  144:astore          4
		s = "Skipping filtered event: ";
	//   63  146:ldc1            #181 <String "Skipping filtered event: ">
	//   64  148:astore          5
		if(true) goto _L4; else goto _L3
	//   65  150:goto            48
_L3:
		try
		{
			filesManager.writeEvent(((Object) (sessionevent)));
	//   66  153:aload_0         
	//   67  154:getfield        #76  <Field SessionAnalyticsFilesManager filesManager>
	//   68  157:aload           6
	//   69  159:invokevirtual   #184 <Method void SessionAnalyticsFilesManager.writeEvent(Object)>
		}
	//*  70  162:goto            211
		// Misplaced declaration of an exception variable
		catch(SessionEvent.Builder builder)
	//*  71  165:astore_1        
		{
			l l1 = c.g();
	//   72  166:invokestatic    #145 <Method l c.g()>
	//   73  169:astore          4
			StringBuilder stringbuilder1 = new StringBuilder();
	//   74  171:new             #147 <Class StringBuilder>
	//   75  174:dup             
	//   76  175:invokespecial   #148 <Method void StringBuilder()>
	//   77  178:astore          5
			stringbuilder1.append("Failed to write event: ");
	//   78  180:aload           5
	//   79  182:ldc1            #186 <String "Failed to write event: ">
	//   80  184:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   81  187:pop             
			stringbuilder1.append(((Object) (sessionevent)));
	//   82  188:aload           5
	//   83  190:aload           6
	//   84  192:invokevirtual   #157 <Method StringBuilder StringBuilder.append(Object)>
	//   85  195:pop             
			l1.e("Answers", stringbuilder1.toString(), ((Throwable) (builder)));
	//   86  196:aload           4
	//   87  198:ldc1            #159 <String "Answers">
	//   88  200:aload           5
	//   89  202:invokevirtual   #163 <Method String StringBuilder.toString()>
	//   90  205:aload_1         
	//   91  206:invokeinterface #190 <Method void l.e(String, String, Throwable)>
		}
		scheduleTimeBasedRollOverIfNeeded();
	//   92  211:aload_0         
	//   93  212:invokevirtual   #193 <Method void scheduleTimeBasedRollOverIfNeeded()>
		boolean flag;
		if(!SessionEvent.Type.CUSTOM.equals(((Object) (sessionevent.type))) && !SessionEvent.Type.PREDEFINED.equals(((Object) (sessionevent.type))))
	//*  94  215:getstatic       #130 <Field SessionEvent$Type SessionEvent$Type.CUSTOM>
	//*  95  218:aload           6
	//*  96  220:getfield        #135 <Field SessionEvent$Type SessionEvent.type>
	//*  97  223:invokevirtual   #139 <Method boolean SessionEvent$Type.equals(Object)>
	//*  98  226:ifne            251
	//*  99  229:getstatic       #171 <Field SessionEvent$Type SessionEvent$Type.PREDEFINED>
	//* 100  232:aload           6
	//* 101  234:getfield        #135 <Field SessionEvent$Type SessionEvent.type>
	//* 102  237:invokevirtual   #139 <Method boolean SessionEvent$Type.equals(Object)>
	//* 103  240:ifeq            246
	//* 104  243:goto            251
			flag = false;
	//  105  246:iconst_0        
	//  106  247:istore_2        
		else
	//* 107  248:goto            253
			flag = true;
	//  108  251:iconst_1        
	//  109  252:istore_2        
		boolean flag1 = "purchase".equals(((Object) (sessionevent.predefinedType)));
	//  110  253:ldc1            #195 <String "purchase">
	//  111  255:aload           6
	//  112  257:getfield        #199 <Field String SessionEvent.predefinedType>
	//  113  260:invokevirtual   #202 <Method boolean String.equals(Object)>
	//  114  263:istore_3        
		if(forwardToFirebaseAnalyticsEnabled)
	//* 115  264:aload_0         
	//* 116  265:getfield        #66  <Field boolean forwardToFirebaseAnalyticsEnabled>
	//* 117  268:ifeq            344
		{
			if(!flag)
	//* 118  271:iload_2         
	//* 119  272:ifne            276
				return;
	//  120  275:return          
			if(flag1 && !includePurchaseEventsInForwardedEvents)
	//* 121  276:iload_3         
	//* 122  277:ifeq            288
	//* 123  280:aload_0         
	//* 124  281:getfield        #68  <Field boolean includePurchaseEventsInForwardedEvents>
	//* 125  284:ifne            288
				return;
	//  126  287:return          
			l l2;
			try
			{
				firebaseAnalyticsApiAdapter.processEvent(sessionevent);
	//  127  288:aload_0         
	//  128  289:getfield        #82  <Field FirebaseAnalyticsApiAdapter firebaseAnalyticsApiAdapter>
	//  129  292:aload           6
	//  130  294:invokevirtual   #207 <Method void FirebaseAnalyticsApiAdapter.processEvent(SessionEvent)>
				return;
	//  131  297:return          
			}
			// Misplaced declaration of an exception variable
			catch(SessionEvent.Builder builder)
	//* 132  298:astore_1        
			{
				l2 = c.g();
	//  133  299:invokestatic    #145 <Method l c.g()>
	//  134  302:astore          4
			}
			StringBuilder stringbuilder2 = new StringBuilder();
	//  135  304:new             #147 <Class StringBuilder>
	//  136  307:dup             
	//  137  308:invokespecial   #148 <Method void StringBuilder()>
	//  138  311:astore          5
			stringbuilder2.append("Failed to map event to Firebase: ");
	//  139  313:aload           5
	//  140  315:ldc1            #209 <String "Failed to map event to Firebase: ">
	//  141  317:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  142  320:pop             
			stringbuilder2.append(((Object) (sessionevent)));
	//  143  321:aload           5
	//  144  323:aload           6
	//  145  325:invokevirtual   #157 <Method StringBuilder StringBuilder.append(Object)>
	//  146  328:pop             
			l2.e("Answers", stringbuilder2.toString(), ((Throwable) (builder)));
	//  147  329:aload           4
	//  148  331:ldc1            #159 <String "Answers">
	//  149  333:aload           5
	//  150  335:invokevirtual   #163 <Method String StringBuilder.toString()>
	//  151  338:aload_1         
	//  152  339:invokeinterface #190 <Method void l.e(String, String, Throwable)>
		}
		return;
	//  153  344:return          
	}

	public boolean rollFileOver()
	{
		boolean flag;
		try
		{
			flag = filesManager.rollFileOver();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field SessionAnalyticsFilesManager filesManager>
	//    2    4:invokevirtual   #213 <Method boolean SessionAnalyticsFilesManager.rollFileOver()>
	//    3    7:istore_1        
		}
	//*   4    8:iload_1         
	//*   5    9:ireturn         
		catch(IOException ioexception)
	//*   6   10:astore_2        
		{
			i.a(context, "Failed to roll file over.", ((Throwable) (ioexception)));
	//    7   11:aload_0         
	//    8   12:getfield        #72  <Field Context context>
	//    9   15:ldc1            #215 <String "Failed to roll file over.">
	//   10   17:aload_2         
	//   11   18:invokestatic    #218 <Method void i.a(Context, String, Throwable)>
			return false;
	//   12   21:iconst_0        
	//   13   22:ireturn         
		}
		return flag;
	}

	void scheduleTimeBasedFileRollOver(long l1, long l2)
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
			b.a.a.a.a.d.i j = new b.a.a.a.a.d.i(context, ((b.a.a.a.a.d.e) (this)));
	//   11   24:new             #224 <Class b.a.a.a.a.d.i>
	//   12   27:dup             
	//   13   28:aload_0         
	//   14   29:getfield        #72  <Field Context context>
	//   15   32:aload_0         
	//   16   33:invokespecial   #227 <Method void b.a.a.a.a.d.i(Context, b.a.a.a.a.d.e)>
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
	//   26   55:ldc1            #229 <String "Scheduling time based file roll over every ">
	//   27   57:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   28   60:pop             
			stringbuilder.append(l2);
	//   29   61:aload           8
	//   30   63:lload_3         
	//   31   64:invokevirtual   #232 <Method StringBuilder StringBuilder.append(long)>
	//   32   67:pop             
			stringbuilder.append(" seconds");
	//   33   68:aload           8
	//   34   70:ldc1            #234 <String " seconds">
	//   35   72:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   36   75:pop             
			i.a(context1, stringbuilder.toString());
	//   37   76:aload           7
	//   38   78:aload           8
	//   39   80:invokevirtual   #163 <Method String StringBuilder.toString()>
	//   40   83:invokestatic    #96  <Method void i.a(Context, String)>
			try
			{
				rolloverFutureRef.set(((Object) (executorService.scheduleAtFixedRate(((Runnable) (j)), l1, l2, TimeUnit.SECONDS))));
	//   41   86:aload_0         
	//   42   87:getfield        #48  <Field AtomicReference rolloverFutureRef>
	//   43   90:aload_0         
	//   44   91:getfield        #74  <Field ScheduledExecutorService executorService>
	//   45   94:aload           6
	//   46   96:lload_1         
	//   47   97:lload_3         
	//   48   98:getstatic       #240 <Field TimeUnit TimeUnit.SECONDS>
	//   49  101:invokeinterface #246 <Method ScheduledFuture ScheduledExecutorService.scheduleAtFixedRate(Runnable, long, long, TimeUnit)>
	//   50  106:invokevirtual   #106 <Method void AtomicReference.set(Object)>
				return;
	//   51  109:return          
			}
			catch(RejectedExecutionException rejectedexecutionexception)
	//*  52  110:astore          6
			{
				i.a(context, "Failed to schedule time based file roll over", ((Throwable) (rejectedexecutionexception)));
	//   53  112:aload_0         
	//   54  113:getfield        #72  <Field Context context>
	//   55  116:ldc1            #248 <String "Failed to schedule time based file roll over">
	//   56  118:aload           6
	//   57  120:invokestatic    #218 <Method void i.a(Context, String, Throwable)>
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
	//   18   30:invokevirtual   #250 <Method void scheduleTimeBasedFileRollOver(long, long)>
	//   19   33:return          
	}

	public void sendEvents()
	{
		int k;
		List list;
		if(filesSender == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #253 <Field f filesSender>
	//*   2    4:ifnonnull       17
		{
			i.a(context, "skipping files send because we don't yet know the target endpoint");
	//    3    7:aload_0         
	//    4    8:getfield        #72  <Field Context context>
	//    5   11:ldc1            #255 <String "skipping files send because we don't yet know the target endpoint">
	//    6   13:invokestatic    #96  <Method void i.a(Context, String)>
			return;
	//    7   16:return          
		}
		i.a(context, "Sending all files");
	//    8   17:aload_0         
	//    9   18:getfield        #72  <Field Context context>
	//   10   21:ldc2            #257 <String "Sending all files">
	//   11   24:invokestatic    #96  <Method void i.a(Context, String)>
		list = filesManager.getBatchOfFilesToSend();
	//   12   27:aload_0         
	//   13   28:getfield        #76  <Field SessionAnalyticsFilesManager filesManager>
	//   14   31:invokevirtual   #261 <Method List SessionAnalyticsFilesManager.getBatchOfFilesToSend()>
	//   15   34:astore          5
		k = 0;
	//   16   36:iconst_0        
	//   17   37:istore_2        
_L5:
		int j;
		int i1;
		j = k;
	//   18   38:iload_2         
	//   19   39:istore_1        
		i1 = k;
	//   20   40:iload_2         
	//   21   41:istore_3        
		if(list.size() <= 0) goto _L2; else goto _L1
	//   22   42:aload           5
	//   23   44:invokeinterface #267 <Method int List.size()>
	//   24   49:ifle            202
_L1:
		j = k;
	//   25   52:iload_2         
	//   26   53:istore_1        
		i.a(context, String.format(Locale.US, "attempt to send batch of %d files", new Object[] {
			Integer.valueOf(list.size())
		}));
	//   27   54:aload_0         
	//   28   55:getfield        #72  <Field Context context>
	//   29   58:getstatic       #273 <Field Locale Locale.US>
	//   30   61:ldc2            #275 <String "attempt to send batch of %d files">
	//   31   64:iconst_1        
	//   32   65:anewarray       Object[]
	//   33   68:dup             
	//   34   69:iconst_0        
	//   35   70:aload           5
	//   36   72:invokeinterface #267 <Method int List.size()>
	//   37   77:invokestatic    #281 <Method Integer Integer.valueOf(int)>
	//   38   80:aastore         
	//   39   81:invokestatic    #285 <Method String String.format(Locale, String, Object[])>
	//   40   84:invokestatic    #96  <Method void i.a(Context, String)>
		j = k;
	//   41   87:iload_2         
	//   42   88:istore_1        
		boolean flag = filesSender.send(list);
	//   43   89:aload_0         
	//   44   90:getfield        #253 <Field f filesSender>
	//   45   93:aload           5
	//   46   95:invokeinterface #291 <Method boolean f.send(List)>
	//   47  100:istore          4
		i1 = k;
	//   48  102:iload_2         
	//   49  103:istore_3        
		if(!flag) goto _L4; else goto _L3
	//   50  104:iload           4
	//   51  106:ifeq            214
_L3:
		j = k;
	//   52  109:iload_2         
	//   53  110:istore_1        
		i1 = k + list.size();
	//   54  111:iload_2         
	//   55  112:aload           5
	//   56  114:invokeinterface #267 <Method int List.size()>
	//   57  119:iadd            
	//   58  120:istore_3        
		j = i1;
	//   59  121:iload_3         
	//   60  122:istore_1        
		filesManager.deleteSentFiles(list);
	//   61  123:aload_0         
	//   62  124:getfield        #76  <Field SessionAnalyticsFilesManager filesManager>
	//   63  127:aload           5
	//   64  129:invokevirtual   #295 <Method void SessionAnalyticsFilesManager.deleteSentFiles(List)>
		  goto _L4
	//*  65  132:goto            214
_L6:
		j = i1;
	//   66  135:iload_3         
	//   67  136:istore_1        
		list = filesManager.getBatchOfFilesToSend();
	//   68  137:aload_0         
	//   69  138:getfield        #76  <Field SessionAnalyticsFilesManager filesManager>
	//   70  141:invokevirtual   #261 <Method List SessionAnalyticsFilesManager.getBatchOfFilesToSend()>
	//   71  144:astore          5
		k = i1;
	//   72  146:iload_3         
	//   73  147:istore_2        
		  goto _L5
	//*  74  148:goto            38
		Exception exception;
		exception;
	//   75  151:astore          5
		Context context1 = context;
	//   76  153:aload_0         
	//   77  154:getfield        #72  <Field Context context>
	//   78  157:astore          6
		StringBuilder stringbuilder = new StringBuilder();
	//   79  159:new             #147 <Class StringBuilder>
	//   80  162:dup             
	//   81  163:invokespecial   #148 <Method void StringBuilder()>
	//   82  166:astore          7
		stringbuilder.append("Failed to send batch of analytics files to server: ");
	//   83  168:aload           7
	//   84  170:ldc2            #297 <String "Failed to send batch of analytics files to server: ">
	//   85  173:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   86  176:pop             
		stringbuilder.append(exception.getMessage());
	//   87  177:aload           7
	//   88  179:aload           5
	//   89  181:invokevirtual   #300 <Method String Exception.getMessage()>
	//   90  184:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   91  187:pop             
		i.a(context1, stringbuilder.toString(), ((Throwable) (exception)));
	//   92  188:aload           6
	//   93  190:aload           7
	//   94  192:invokevirtual   #163 <Method String StringBuilder.toString()>
	//   95  195:aload           5
	//   96  197:invokestatic    #218 <Method void i.a(Context, String, Throwable)>
		i1 = j;
	//   97  200:iload_1         
	//   98  201:istore_3        
_L2:
		if(i1 == 0)
	//*  99  202:iload_3         
	//* 100  203:ifne            213
			filesManager.deleteOldestInRollOverIfOverMax();
	//  101  206:aload_0         
	//  102  207:getfield        #76  <Field SessionAnalyticsFilesManager filesManager>
	//  103  210:invokevirtual   #303 <Method void SessionAnalyticsFilesManager.deleteOldestInRollOverIfOverMax()>
		return;
	//  104  213:return          
_L4:
		if(flag) goto _L6; else goto _L2
	//  105  214:iload           4
	//  106  216:ifne            135
	//* 107  219:goto            202
	}

	public void setAnalyticsSettingsData(b b1, String s)
	{
		filesSender = ((f) (AnswersRetryFilesSender.build(new SessionAnalyticsFilesSender(kit, s, b1.a, httpRequestFactory, apiKey.a(context)))));
	//    0    0:aload_0         
	//    1    1:new             #307 <Class SessionAnalyticsFilesSender>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #70  <Field b.a.a.a.i kit>
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:getfield        #311 <Field String b.a>
	//    8   14:aload_0         
	//    9   15:getfield        #78  <Field e httpRequestFactory>
	//   10   18:aload_0         
	//   11   19:getfield        #53  <Field g apiKey>
	//   12   22:aload_0         
	//   13   23:getfield        #72  <Field Context context>
	//   14   26:invokevirtual   #314 <Method String g.a(Context)>
	//   15   29:invokespecial   #317 <Method void SessionAnalyticsFilesSender(b.a.a.a.i, String, String, e, String)>
	//   16   32:invokestatic    #322 <Method AnswersRetryFilesSender AnswersRetryFilesSender.build(SessionAnalyticsFilesSender)>
	//   17   35:putfield        #253 <Field f filesSender>
		filesManager.setAnalyticsSettingsData(b1);
	//   18   38:aload_0         
	//   19   39:getfield        #76  <Field SessionAnalyticsFilesManager filesManager>
	//   20   42:aload_1         
	//   21   43:invokevirtual   #325 <Method void SessionAnalyticsFilesManager.setAnalyticsSettingsData(b)>
		forwardToFirebaseAnalyticsEnabled = b1.f;
	//   22   46:aload_0         
	//   23   47:aload_1         
	//   24   48:getfield        #328 <Field boolean b.f>
	//   25   51:putfield        #66  <Field boolean forwardToFirebaseAnalyticsEnabled>
		includePurchaseEventsInForwardedEvents = b1.g;
	//   26   54:aload_0         
	//   27   55:aload_1         
	//   28   56:getfield        #330 <Field boolean b.g>
	//   29   59:putfield        #68  <Field boolean includePurchaseEventsInForwardedEvents>
		l l1 = c.g();
	//   30   62:invokestatic    #145 <Method l c.g()>
	//   31   65:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   32   66:new             #147 <Class StringBuilder>
	//   33   69:dup             
	//   34   70:invokespecial   #148 <Method void StringBuilder()>
	//   35   73:astore          4
		stringbuilder.append("Firebase analytics forwarding ");
	//   36   75:aload           4
	//   37   77:ldc2            #332 <String "Firebase analytics forwarding ">
	//   38   80:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   39   83:pop             
		if(forwardToFirebaseAnalyticsEnabled)
	//*  40   84:aload_0         
	//*  41   85:getfield        #66  <Field boolean forwardToFirebaseAnalyticsEnabled>
	//*  42   88:ifeq            98
			s = "enabled";
	//   43   91:ldc2            #334 <String "enabled">
	//   44   94:astore_2        
		else
	//*  45   95:goto            102
			s = "disabled";
	//   46   98:ldc2            #336 <String "disabled">
	//   47  101:astore_2        
		stringbuilder.append(s);
	//   48  102:aload           4
	//   49  104:aload_2         
	//   50  105:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   51  108:pop             
		l1.a("Answers", stringbuilder.toString());
	//   52  109:aload_3         
	//   53  110:ldc1            #159 <String "Answers">
	//   54  112:aload           4
	//   55  114:invokevirtual   #163 <Method String StringBuilder.toString()>
	//   56  117:invokeinterface #168 <Method void l.a(String, String)>
		l1 = c.g();
	//   57  122:invokestatic    #145 <Method l c.g()>
	//   58  125:astore_3        
		stringbuilder = new StringBuilder();
	//   59  126:new             #147 <Class StringBuilder>
	//   60  129:dup             
	//   61  130:invokespecial   #148 <Method void StringBuilder()>
	//   62  133:astore          4
		stringbuilder.append("Firebase analytics including purchase events ");
	//   63  135:aload           4
	//   64  137:ldc2            #338 <String "Firebase analytics including purchase events ">
	//   65  140:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   66  143:pop             
		if(includePurchaseEventsInForwardedEvents)
	//*  67  144:aload_0         
	//*  68  145:getfield        #68  <Field boolean includePurchaseEventsInForwardedEvents>
	//*  69  148:ifeq            158
			s = "enabled";
	//   70  151:ldc2            #334 <String "enabled">
	//   71  154:astore_2        
		else
	//*  72  155:goto            162
			s = "disabled";
	//   73  158:ldc2            #336 <String "disabled">
	//   74  161:astore_2        
		stringbuilder.append(s);
	//   75  162:aload           4
	//   76  164:aload_2         
	//   77  165:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   78  168:pop             
		l1.a("Answers", stringbuilder.toString());
	//   79  169:aload_3         
	//   80  170:ldc1            #159 <String "Answers">
	//   81  172:aload           4
	//   82  174:invokevirtual   #163 <Method String StringBuilder.toString()>
	//   83  177:invokeinterface #168 <Method void l.a(String, String)>
		customEventsEnabled = b1.h;
	//   84  182:aload_0         
	//   85  183:aload_1         
	//   86  184:getfield        #341 <Field boolean b.h>
	//   87  187:putfield        #60  <Field boolean customEventsEnabled>
		l1 = c.g();
	//   88  190:invokestatic    #145 <Method l c.g()>
	//   89  193:astore_3        
		stringbuilder = new StringBuilder();
	//   90  194:new             #147 <Class StringBuilder>
	//   91  197:dup             
	//   92  198:invokespecial   #148 <Method void StringBuilder()>
	//   93  201:astore          4
		stringbuilder.append("Custom event tracking ");
	//   94  203:aload           4
	//   95  205:ldc2            #343 <String "Custom event tracking ">
	//   96  208:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   97  211:pop             
		if(customEventsEnabled)
	//*  98  212:aload_0         
	//*  99  213:getfield        #60  <Field boolean customEventsEnabled>
	//* 100  216:ifeq            226
			s = "enabled";
	//  101  219:ldc2            #334 <String "enabled">
	//  102  222:astore_2        
		else
	//* 103  223:goto            230
			s = "disabled";
	//  104  226:ldc2            #336 <String "disabled">
	//  105  229:astore_2        
		stringbuilder.append(s);
	//  106  230:aload           4
	//  107  232:aload_2         
	//  108  233:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  109  236:pop             
		l1.a("Answers", stringbuilder.toString());
	//  110  237:aload_3         
	//  111  238:ldc1            #159 <String "Answers">
	//  112  240:aload           4
	//  113  242:invokevirtual   #163 <Method String StringBuilder.toString()>
	//  114  245:invokeinterface #168 <Method void l.a(String, String)>
		predefinedEventsEnabled = b1.i;
	//  115  250:aload_0         
	//  116  251:aload_1         
	//  117  252:getfield        #346 <Field boolean b.i>
	//  118  255:putfield        #62  <Field boolean predefinedEventsEnabled>
		l1 = c.g();
	//  119  258:invokestatic    #145 <Method l c.g()>
	//  120  261:astore_3        
		stringbuilder = new StringBuilder();
	//  121  262:new             #147 <Class StringBuilder>
	//  122  265:dup             
	//  123  266:invokespecial   #148 <Method void StringBuilder()>
	//  124  269:astore          4
		stringbuilder.append("Predefined event tracking ");
	//  125  271:aload           4
	//  126  273:ldc2            #348 <String "Predefined event tracking ">
	//  127  276:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  128  279:pop             
		if(predefinedEventsEnabled)
	//* 129  280:aload_0         
	//* 130  281:getfield        #62  <Field boolean predefinedEventsEnabled>
	//* 131  284:ifeq            294
			s = "enabled";
	//  132  287:ldc2            #334 <String "enabled">
	//  133  290:astore_2        
		else
	//* 134  291:goto            298
			s = "disabled";
	//  135  294:ldc2            #336 <String "disabled">
	//  136  297:astore_2        
		stringbuilder.append(s);
	//  137  298:aload           4
	//  138  300:aload_2         
	//  139  301:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  140  304:pop             
		l1.a("Answers", stringbuilder.toString());
	//  141  305:aload_3         
	//  142  306:ldc1            #159 <String "Answers">
	//  143  308:aload           4
	//  144  310:invokevirtual   #163 <Method String StringBuilder.toString()>
	//  145  313:invokeinterface #168 <Method void l.a(String, String)>
		if(b1.k > 1)
	//* 146  318:aload_1         
	//* 147  319:getfield        #351 <Field int b.k>
	//* 148  322:iconst_1        
	//* 149  323:icmple          354
		{
			c.g().a("Answers", "Event sampling enabled");
	//  150  326:invokestatic    #145 <Method l c.g()>
	//  151  329:ldc1            #159 <String "Answers">
	//  152  331:ldc2            #353 <String "Event sampling enabled">
	//  153  334:invokeinterface #168 <Method void l.a(String, String)>
			eventFilter = ((EventFilter) (new SamplingEventFilter(b1.k)));
	//  154  339:aload_0         
	//  155  340:new             #355 <Class SamplingEventFilter>
	//  156  343:dup             
	//  157  344:aload_1         
	//  158  345:getfield        #351 <Field int b.k>
	//  159  348:invokespecial   #358 <Method void SamplingEventFilter(int)>
	//  160  351:putfield        #58  <Field EventFilter eventFilter>
		}
		rolloverIntervalSeconds = b1.b;
	//  161  354:aload_0         
	//  162  355:aload_1         
	//  163  356:getfield        #361 <Field int b.b>
	//  164  359:putfield        #64  <Field int rolloverIntervalSeconds>
		scheduleTimeBasedFileRollOver(0L, rolloverIntervalSeconds);
	//  165  362:aload_0         
	//  166  363:lconst_0        
	//  167  364:aload_0         
	//  168  365:getfield        #64  <Field int rolloverIntervalSeconds>
	//  169  368:i2l             
	//  170  369:invokevirtual   #250 <Method void scheduleTimeBasedFileRollOver(long, long)>
	//  171  372:return          
	}

	static final int UNDEFINED_ROLLOVER_INTERVAL_SECONDS = -1;
	g apiKey;
	private final Context context;
	boolean customEventsEnabled;
	EventFilter eventFilter;
	private final ScheduledExecutorService executorService;
	private final SessionAnalyticsFilesManager filesManager;
	f filesSender;
	private final FirebaseAnalyticsApiAdapter firebaseAnalyticsApiAdapter;
	boolean forwardToFirebaseAnalyticsEnabled;
	private final e httpRequestFactory;
	boolean includePurchaseEventsInForwardedEvents;
	private final b.a.a.a.i kit;
	final SessionEventMetadata metadata;
	boolean predefinedEventsEnabled;
	private final AtomicReference rolloverFutureRef = new AtomicReference();
	volatile int rolloverIntervalSeconds;
}
