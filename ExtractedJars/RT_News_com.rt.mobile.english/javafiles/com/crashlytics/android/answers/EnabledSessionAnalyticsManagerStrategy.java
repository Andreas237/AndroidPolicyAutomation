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
//			EventFilter, SessionAnalyticsFilesSender, AnswersRetryFilesSender, SamplingEventFilter, 
//			SessionEventMetadata

class EnabledSessionAnalyticsManagerStrategy
	implements SessionAnalyticsManagerStrategy
{

	public EnabledSessionAnalyticsManagerStrategy(Kit kit1, Context context1, ScheduledExecutorService scheduledexecutorservice, SessionAnalyticsFilesManager sessionanalyticsfilesmanager, HttpRequestFactory httprequestfactory, SessionEventMetadata sessioneventmetadata)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #41  <Class AtomicReference>
	//    4    8:dup             
	//    5    9:invokespecial   #42  <Method void AtomicReference()>
	//    6   12:putfield        #44  <Field AtomicReference rolloverFutureRef>
		apiKey = new ApiKey();
	//    7   15:aload_0         
	//    8   16:new             #46  <Class ApiKey>
	//    9   19:dup             
	//   10   20:invokespecial   #47  <Method void ApiKey()>
	//   11   23:putfield        #49  <Field ApiKey apiKey>
		eventFilter = ((EventFilter) (new KeepAllEventFilter()));
	//   12   26:aload_0         
	//   13   27:new             #51  <Class KeepAllEventFilter>
	//   14   30:dup             
	//   15   31:invokespecial   #52  <Method void KeepAllEventFilter()>
	//   16   34:putfield        #54  <Field EventFilter eventFilter>
		customEventsEnabled = true;
	//   17   37:aload_0         
	//   18   38:iconst_1        
	//   19   39:putfield        #56  <Field boolean customEventsEnabled>
		predefinedEventsEnabled = true;
	//   20   42:aload_0         
	//   21   43:iconst_1        
	//   22   44:putfield        #58  <Field boolean predefinedEventsEnabled>
		rolloverIntervalSeconds = -1;
	//   23   47:aload_0         
	//   24   48:iconst_m1       
	//   25   49:putfield        #60  <Field int rolloverIntervalSeconds>
		kit = kit1;
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:putfield        #62  <Field Kit kit>
		context = context1;
	//   29   57:aload_0         
	//   30   58:aload_2         
	//   31   59:putfield        #64  <Field Context context>
		executorService = scheduledexecutorservice;
	//   32   62:aload_0         
	//   33   63:aload_3         
	//   34   64:putfield        #66  <Field ScheduledExecutorService executorService>
		filesManager = sessionanalyticsfilesmanager;
	//   35   67:aload_0         
	//   36   68:aload           4
	//   37   70:putfield        #68  <Field SessionAnalyticsFilesManager filesManager>
		httpRequestFactory = httprequestfactory;
	//   38   73:aload_0         
	//   39   74:aload           5
	//   40   76:putfield        #70  <Field HttpRequestFactory httpRequestFactory>
		metadata = sessioneventmetadata;
	//   41   79:aload_0         
	//   42   80:aload           6
	//   43   82:putfield        #72  <Field SessionEventMetadata metadata>
	//   44   85:return          
	}

	public void cancelTimeBasedFileRollOver()
	{
		if(rolloverFutureRef.get() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field AtomicReference rolloverFutureRef>
	//*   2    4:invokevirtual   #78  <Method Object AtomicReference.get()>
	//*   3    7:ifnull          44
		{
			CommonUtils.logControlled(context, "Cancelling time-based rollover because no events are currently being generated.");
	//    4   10:aload_0         
	//    5   11:getfield        #64  <Field Context context>
	//    6   14:ldc1            #80  <String "Cancelling time-based rollover because no events are currently being generated.">
	//    7   16:invokestatic    #86  <Method void CommonUtils.logControlled(Context, String)>
			((ScheduledFuture)rolloverFutureRef.get()).cancel(false);
	//    8   19:aload_0         
	//    9   20:getfield        #44  <Field AtomicReference rolloverFutureRef>
	//   10   23:invokevirtual   #78  <Method Object AtomicReference.get()>
	//   11   26:checkcast       #88  <Class ScheduledFuture>
	//   12   29:iconst_0        
	//   13   30:invokeinterface #92  <Method boolean ScheduledFuture.cancel(boolean)>
	//   14   35:pop             
			rolloverFutureRef.set(((Object) (null)));
	//   15   36:aload_0         
	//   16   37:getfield        #44  <Field AtomicReference rolloverFutureRef>
	//   17   40:aconst_null     
	//   18   41:invokevirtual   #96  <Method void AtomicReference.set(Object)>
		}
	//   19   44:return          
	}

	public void deleteAllEvents()
	{
		filesManager.deleteAllEventsFiles();
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field SessionAnalyticsFilesManager filesManager>
	//    2    4:invokevirtual   #102 <Method void SessionAnalyticsFilesManager.deleteAllEventsFiles()>
	//    3    7:return          
	}

	public void processEvent(SessionEvent.Builder builder)
	{
		builder = ((SessionEvent.Builder) (builder.build(metadata)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #72  <Field SessionEventMetadata metadata>
	//    3    5:invokevirtual   #112 <Method SessionEvent SessionEvent$Builder.build(SessionEventMetadata)>
	//    4    8:astore_1        
		if(!customEventsEnabled && SessionEvent.Type.CUSTOM.equals(((Object) (((SessionEvent) (builder)).type))))
	//*   5    9:aload_0         
	//*   6   10:getfield        #56  <Field boolean customEventsEnabled>
	//*   7   13:ifne            67
	//*   8   16:getstatic       #118 <Field SessionEvent$Type SessionEvent$Type.CUSTOM>
	//*   9   19:aload_1         
	//*  10   20:getfield        #123 <Field SessionEvent$Type SessionEvent.type>
	//*  11   23:invokevirtual   #127 <Method boolean SessionEvent$Type.equals(Object)>
	//*  12   26:ifeq            67
		{
			Logger logger = Fabric.getLogger();
	//   13   29:invokestatic    #133 <Method Logger Fabric.getLogger()>
	//   14   32:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   15   33:new             #135 <Class StringBuilder>
	//   16   36:dup             
	//   17   37:invokespecial   #136 <Method void StringBuilder()>
	//   18   40:astore_3        
			stringbuilder.append("Custom events tracking disabled - skipping event: ");
	//   19   41:aload_3         
	//   20   42:ldc1            #138 <String "Custom events tracking disabled - skipping event: ">
	//   21   44:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   22   47:pop             
			stringbuilder.append(((Object) (builder)));
	//   23   48:aload_3         
	//   24   49:aload_1         
	//   25   50:invokevirtual   #145 <Method StringBuilder StringBuilder.append(Object)>
	//   26   53:pop             
			logger.d("Answers", stringbuilder.toString());
	//   27   54:aload_2         
	//   28   55:ldc1            #147 <String "Answers">
	//   29   57:aload_3         
	//   30   58:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   31   61:invokeinterface #157 <Method void Logger.d(String, String)>
			return;
	//   32   66:return          
		}
		if(!predefinedEventsEnabled && SessionEvent.Type.PREDEFINED.equals(((Object) (((SessionEvent) (builder)).type))))
	//*  33   67:aload_0         
	//*  34   68:getfield        #58  <Field boolean predefinedEventsEnabled>
	//*  35   71:ifne            125
	//*  36   74:getstatic       #160 <Field SessionEvent$Type SessionEvent$Type.PREDEFINED>
	//*  37   77:aload_1         
	//*  38   78:getfield        #123 <Field SessionEvent$Type SessionEvent.type>
	//*  39   81:invokevirtual   #127 <Method boolean SessionEvent$Type.equals(Object)>
	//*  40   84:ifeq            125
		{
			Logger logger1 = Fabric.getLogger();
	//   41   87:invokestatic    #133 <Method Logger Fabric.getLogger()>
	//   42   90:astore_2        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   43   91:new             #135 <Class StringBuilder>
	//   44   94:dup             
	//   45   95:invokespecial   #136 <Method void StringBuilder()>
	//   46   98:astore_3        
			stringbuilder1.append("Predefined events tracking disabled - skipping event: ");
	//   47   99:aload_3         
	//   48  100:ldc1            #162 <String "Predefined events tracking disabled - skipping event: ">
	//   49  102:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   50  105:pop             
			stringbuilder1.append(((Object) (builder)));
	//   51  106:aload_3         
	//   52  107:aload_1         
	//   53  108:invokevirtual   #145 <Method StringBuilder StringBuilder.append(Object)>
	//   54  111:pop             
			logger1.d("Answers", stringbuilder1.toString());
	//   55  112:aload_2         
	//   56  113:ldc1            #147 <String "Answers">
	//   57  115:aload_3         
	//   58  116:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   59  119:invokeinterface #157 <Method void Logger.d(String, String)>
			return;
	//   60  124:return          
		}
		if(eventFilter.skipEvent(((SessionEvent) (builder))))
	//*  61  125:aload_0         
	//*  62  126:getfield        #54  <Field EventFilter eventFilter>
	//*  63  129:aload_1         
	//*  64  130:invokeinterface #168 <Method boolean EventFilter.skipEvent(SessionEvent)>
	//*  65  135:ifeq            176
		{
			Logger logger2 = Fabric.getLogger();
	//   66  138:invokestatic    #133 <Method Logger Fabric.getLogger()>
	//   67  141:astore_2        
			StringBuilder stringbuilder2 = new StringBuilder();
	//   68  142:new             #135 <Class StringBuilder>
	//   69  145:dup             
	//   70  146:invokespecial   #136 <Method void StringBuilder()>
	//   71  149:astore_3        
			stringbuilder2.append("Skipping filtered event: ");
	//   72  150:aload_3         
	//   73  151:ldc1            #170 <String "Skipping filtered event: ">
	//   74  153:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   75  156:pop             
			stringbuilder2.append(((Object) (builder)));
	//   76  157:aload_3         
	//   77  158:aload_1         
	//   78  159:invokevirtual   #145 <Method StringBuilder StringBuilder.append(Object)>
	//   79  162:pop             
			logger2.d("Answers", stringbuilder2.toString());
	//   80  163:aload_2         
	//   81  164:ldc1            #147 <String "Answers">
	//   82  166:aload_3         
	//   83  167:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   84  170:invokeinterface #157 <Method void Logger.d(String, String)>
			return;
	//   85  175:return          
		}
		try
		{
			filesManager.writeEvent(((Object) (builder)));
	//   86  176:aload_0         
	//   87  177:getfield        #68  <Field SessionAnalyticsFilesManager filesManager>
	//   88  180:aload_1         
	//   89  181:invokevirtual   #173 <Method void SessionAnalyticsFilesManager.writeEvent(Object)>
		}
	//*  90  184:goto            230
		catch(IOException ioexception)
	//*  91  187:astore_2        
		{
			Logger logger3 = Fabric.getLogger();
	//   92  188:invokestatic    #133 <Method Logger Fabric.getLogger()>
	//   93  191:astore_3        
			StringBuilder stringbuilder3 = new StringBuilder();
	//   94  192:new             #135 <Class StringBuilder>
	//   95  195:dup             
	//   96  196:invokespecial   #136 <Method void StringBuilder()>
	//   97  199:astore          4
			stringbuilder3.append("Failed to write event: ");
	//   98  201:aload           4
	//   99  203:ldc1            #175 <String "Failed to write event: ">
	//  100  205:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//  101  208:pop             
			stringbuilder3.append(((Object) (builder)));
	//  102  209:aload           4
	//  103  211:aload_1         
	//  104  212:invokevirtual   #145 <Method StringBuilder StringBuilder.append(Object)>
	//  105  215:pop             
			logger3.e("Answers", stringbuilder3.toString(), ((Throwable) (ioexception)));
	//  106  216:aload_3         
	//  107  217:ldc1            #147 <String "Answers">
	//  108  219:aload           4
	//  109  221:invokevirtual   #151 <Method String StringBuilder.toString()>
	//  110  224:aload_2         
	//  111  225:invokeinterface #179 <Method void Logger.e(String, String, Throwable)>
		}
		scheduleTimeBasedRollOverIfNeeded();
	//  112  230:aload_0         
	//  113  231:invokevirtual   #182 <Method void scheduleTimeBasedRollOverIfNeeded()>
	//  114  234:return          
	}

	public boolean rollFileOver()
	{
		boolean flag;
		try
		{
			flag = filesManager.rollFileOver();
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field SessionAnalyticsFilesManager filesManager>
	//    2    4:invokevirtual   #186 <Method boolean SessionAnalyticsFilesManager.rollFileOver()>
	//    3    7:istore_1        
		}
	//*   4    8:iload_1         
	//*   5    9:ireturn         
		catch(IOException ioexception)
	//*   6   10:astore_2        
		{
			CommonUtils.logControlledError(context, "Failed to roll file over.", ((Throwable) (ioexception)));
	//    7   11:aload_0         
	//    8   12:getfield        #64  <Field Context context>
	//    9   15:ldc1            #188 <String "Failed to roll file over.">
	//   10   17:aload_2         
	//   11   18:invokestatic    #192 <Method void CommonUtils.logControlledError(Context, String, Throwable)>
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
	//*   1    1:getfield        #44  <Field AtomicReference rolloverFutureRef>
	//*   2    4:invokevirtual   #78  <Method Object AtomicReference.get()>
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
	//   11   24:new             #198 <Class TimeBasedFileRollOverRunnable>
	//   12   27:dup             
	//   13   28:aload_0         
	//   14   29:getfield        #64  <Field Context context>
	//   15   32:aload_0         
	//   16   33:invokespecial   #201 <Method void TimeBasedFileRollOverRunnable(Context, io.fabric.sdk.android.services.events.FileRollOverManager)>
	//   17   36:astore          6
			Context context1 = context;
	//   18   38:aload_0         
	//   19   39:getfield        #64  <Field Context context>
	//   20   42:astore          7
			StringBuilder stringbuilder = new StringBuilder();
	//   21   44:new             #135 <Class StringBuilder>
	//   22   47:dup             
	//   23   48:invokespecial   #136 <Method void StringBuilder()>
	//   24   51:astore          8
			stringbuilder.append("Scheduling time based file roll over every ");
	//   25   53:aload           8
	//   26   55:ldc1            #203 <String "Scheduling time based file roll over every ">
	//   27   57:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   28   60:pop             
			stringbuilder.append(l1);
	//   29   61:aload           8
	//   30   63:lload_3         
	//   31   64:invokevirtual   #206 <Method StringBuilder StringBuilder.append(long)>
	//   32   67:pop             
			stringbuilder.append(" seconds");
	//   33   68:aload           8
	//   34   70:ldc1            #208 <String " seconds">
	//   35   72:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   36   75:pop             
			CommonUtils.logControlled(context1, stringbuilder.toString());
	//   37   76:aload           7
	//   38   78:aload           8
	//   39   80:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   40   83:invokestatic    #86  <Method void CommonUtils.logControlled(Context, String)>
			try
			{
				rolloverFutureRef.set(((Object) (executorService.scheduleAtFixedRate(((Runnable) (timebasedfilerolloverrunnable)), l, l1, TimeUnit.SECONDS))));
	//   41   86:aload_0         
	//   42   87:getfield        #44  <Field AtomicReference rolloverFutureRef>
	//   43   90:aload_0         
	//   44   91:getfield        #66  <Field ScheduledExecutorService executorService>
	//   45   94:aload           6
	//   46   96:lload_1         
	//   47   97:lload_3         
	//   48   98:getstatic       #214 <Field TimeUnit TimeUnit.SECONDS>
	//   49  101:invokeinterface #220 <Method ScheduledFuture ScheduledExecutorService.scheduleAtFixedRate(Runnable, long, long, TimeUnit)>
	//   50  106:invokevirtual   #96  <Method void AtomicReference.set(Object)>
				return;
	//   51  109:return          
			}
			catch(RejectedExecutionException rejectedexecutionexception)
	//*  52  110:astore          6
			{
				CommonUtils.logControlledError(context, "Failed to schedule time based file roll over", ((Throwable) (rejectedexecutionexception)));
	//   53  112:aload_0         
	//   54  113:getfield        #64  <Field Context context>
	//   55  116:ldc1            #222 <String "Failed to schedule time based file roll over">
	//   56  118:aload           6
	//   57  120:invokestatic    #192 <Method void CommonUtils.logControlledError(Context, String, Throwable)>
			}
		}
	//   58  123:return          
	}

	public void scheduleTimeBasedRollOverIfNeeded()
	{
		boolean flag;
		if(rolloverIntervalSeconds != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field int rolloverIntervalSeconds>
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
	//   13   21:getfield        #60  <Field int rolloverIntervalSeconds>
	//   14   24:i2l             
	//   15   25:aload_0         
	//   16   26:getfield        #60  <Field int rolloverIntervalSeconds>
	//   17   29:i2l             
	//   18   30:invokevirtual   #224 <Method void scheduleTimeBasedFileRollOver(long, long)>
	//   19   33:return          
	}

	public void sendEvents()
	{
		int j;
		List list;
		if(filesSender == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #229 <Field FilesSender filesSender>
	//*   2    4:ifnonnull       17
		{
			CommonUtils.logControlled(context, "skipping files send because we don't yet know the target endpoint");
	//    3    7:aload_0         
	//    4    8:getfield        #64  <Field Context context>
	//    5   11:ldc1            #231 <String "skipping files send because we don't yet know the target endpoint">
	//    6   13:invokestatic    #86  <Method void CommonUtils.logControlled(Context, String)>
			return;
	//    7   16:return          
		}
		CommonUtils.logControlled(context, "Sending all files");
	//    8   17:aload_0         
	//    9   18:getfield        #64  <Field Context context>
	//   10   21:ldc1            #233 <String "Sending all files">
	//   11   23:invokestatic    #86  <Method void CommonUtils.logControlled(Context, String)>
		list = filesManager.getBatchOfFilesToSend();
	//   12   26:aload_0         
	//   13   27:getfield        #68  <Field SessionAnalyticsFilesManager filesManager>
	//   14   30:invokevirtual   #237 <Method List SessionAnalyticsFilesManager.getBatchOfFilesToSend()>
	//   15   33:astore          5
		j = 0;
	//   16   35:iconst_0        
	//   17   36:istore_2        
_L5:
		int i;
		int k;
		i = j;
	//   18   37:iload_2         
	//   19   38:istore_1        
		k = j;
	//   20   39:iload_2         
	//   21   40:istore_3        
		if(list.size() <= 0) goto _L2; else goto _L1
	//   22   41:aload           5
	//   23   43:invokeinterface #243 <Method int List.size()>
	//   24   48:ifle            200
_L1:
		i = j;
	//   25   51:iload_2         
	//   26   52:istore_1        
		CommonUtils.logControlled(context, String.format(Locale.US, "attempt to send batch of %d files", new Object[] {
			Integer.valueOf(list.size())
		}));
	//   27   53:aload_0         
	//   28   54:getfield        #64  <Field Context context>
	//   29   57:getstatic       #249 <Field Locale Locale.US>
	//   30   60:ldc1            #251 <String "attempt to send batch of %d files">
	//   31   62:iconst_1        
	//   32   63:anewarray       Object[]
	//   33   66:dup             
	//   34   67:iconst_0        
	//   35   68:aload           5
	//   36   70:invokeinterface #243 <Method int List.size()>
	//   37   75:invokestatic    #257 <Method Integer Integer.valueOf(int)>
	//   38   78:aastore         
	//   39   79:invokestatic    #263 <Method String String.format(Locale, String, Object[])>
	//   40   82:invokestatic    #86  <Method void CommonUtils.logControlled(Context, String)>
		i = j;
	//   41   85:iload_2         
	//   42   86:istore_1        
		boolean flag = filesSender.send(list);
	//   43   87:aload_0         
	//   44   88:getfield        #229 <Field FilesSender filesSender>
	//   45   91:aload           5
	//   46   93:invokeinterface #269 <Method boolean FilesSender.send(List)>
	//   47   98:istore          4
		k = j;
	//   48  100:iload_2         
	//   49  101:istore_3        
		if(!flag) goto _L4; else goto _L3
	//   50  102:iload           4
	//   51  104:ifeq            212
_L3:
		i = j;
	//   52  107:iload_2         
	//   53  108:istore_1        
		k = j + list.size();
	//   54  109:iload_2         
	//   55  110:aload           5
	//   56  112:invokeinterface #243 <Method int List.size()>
	//   57  117:iadd            
	//   58  118:istore_3        
		i = k;
	//   59  119:iload_3         
	//   60  120:istore_1        
		filesManager.deleteSentFiles(list);
	//   61  121:aload_0         
	//   62  122:getfield        #68  <Field SessionAnalyticsFilesManager filesManager>
	//   63  125:aload           5
	//   64  127:invokevirtual   #273 <Method void SessionAnalyticsFilesManager.deleteSentFiles(List)>
		  goto _L4
	//*  65  130:goto            212
_L6:
		i = k;
	//   66  133:iload_3         
	//   67  134:istore_1        
		list = filesManager.getBatchOfFilesToSend();
	//   68  135:aload_0         
	//   69  136:getfield        #68  <Field SessionAnalyticsFilesManager filesManager>
	//   70  139:invokevirtual   #237 <Method List SessionAnalyticsFilesManager.getBatchOfFilesToSend()>
	//   71  142:astore          5
		j = k;
	//   72  144:iload_3         
	//   73  145:istore_2        
		  goto _L5
	//*  74  146:goto            37
		Exception exception;
		exception;
	//   75  149:astore          5
		Context context1 = context;
	//   76  151:aload_0         
	//   77  152:getfield        #64  <Field Context context>
	//   78  155:astore          6
		StringBuilder stringbuilder = new StringBuilder();
	//   79  157:new             #135 <Class StringBuilder>
	//   80  160:dup             
	//   81  161:invokespecial   #136 <Method void StringBuilder()>
	//   82  164:astore          7
		stringbuilder.append("Failed to send batch of analytics files to server: ");
	//   83  166:aload           7
	//   84  168:ldc2            #275 <String "Failed to send batch of analytics files to server: ">
	//   85  171:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   86  174:pop             
		stringbuilder.append(exception.getMessage());
	//   87  175:aload           7
	//   88  177:aload           5
	//   89  179:invokevirtual   #278 <Method String Exception.getMessage()>
	//   90  182:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   91  185:pop             
		CommonUtils.logControlledError(context1, stringbuilder.toString(), ((Throwable) (exception)));
	//   92  186:aload           6
	//   93  188:aload           7
	//   94  190:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   95  193:aload           5
	//   96  195:invokestatic    #192 <Method void CommonUtils.logControlledError(Context, String, Throwable)>
		k = i;
	//   97  198:iload_1         
	//   98  199:istore_3        
_L2:
		if(k == 0)
	//*  99  200:iload_3         
	//* 100  201:ifne            211
			filesManager.deleteOldestInRollOverIfOverMax();
	//  101  204:aload_0         
	//  102  205:getfield        #68  <Field SessionAnalyticsFilesManager filesManager>
	//  103  208:invokevirtual   #281 <Method void SessionAnalyticsFilesManager.deleteOldestInRollOverIfOverMax()>
		return;
	//  104  211:return          
_L4:
		if(flag) goto _L6; else goto _L2
	//  105  212:iload           4
	//  106  214:ifne            133
	//* 107  217:goto            200
	}

	public void setAnalyticsSettingsData(AnalyticsSettingsData analyticssettingsdata, String s)
	{
		filesSender = ((FilesSender) (AnswersRetryFilesSender.build(new SessionAnalyticsFilesSender(kit, s, analyticssettingsdata.analyticsURL, httpRequestFactory, apiKey.getValue(context)))));
	//    0    0:aload_0         
	//    1    1:new             #285 <Class SessionAnalyticsFilesSender>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field Kit kit>
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:getfield        #291 <Field String AnalyticsSettingsData.analyticsURL>
	//    8   14:aload_0         
	//    9   15:getfield        #70  <Field HttpRequestFactory httpRequestFactory>
	//   10   18:aload_0         
	//   11   19:getfield        #49  <Field ApiKey apiKey>
	//   12   22:aload_0         
	//   13   23:getfield        #64  <Field Context context>
	//   14   26:invokevirtual   #295 <Method String ApiKey.getValue(Context)>
	//   15   29:invokespecial   #298 <Method void SessionAnalyticsFilesSender(Kit, String, String, HttpRequestFactory, String)>
	//   16   32:invokestatic    #303 <Method AnswersRetryFilesSender AnswersRetryFilesSender.build(SessionAnalyticsFilesSender)>
	//   17   35:putfield        #229 <Field FilesSender filesSender>
		filesManager.setAnalyticsSettingsData(analyticssettingsdata);
	//   18   38:aload_0         
	//   19   39:getfield        #68  <Field SessionAnalyticsFilesManager filesManager>
	//   20   42:aload_1         
	//   21   43:invokevirtual   #306 <Method void SessionAnalyticsFilesManager.setAnalyticsSettingsData(AnalyticsSettingsData)>
		customEventsEnabled = analyticssettingsdata.trackCustomEvents;
	//   22   46:aload_0         
	//   23   47:aload_1         
	//   24   48:getfield        #309 <Field boolean AnalyticsSettingsData.trackCustomEvents>
	//   25   51:putfield        #56  <Field boolean customEventsEnabled>
		Logger logger = Fabric.getLogger();
	//   26   54:invokestatic    #133 <Method Logger Fabric.getLogger()>
	//   27   57:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   28   58:new             #135 <Class StringBuilder>
	//   29   61:dup             
	//   30   62:invokespecial   #136 <Method void StringBuilder()>
	//   31   65:astore          4
		stringbuilder.append("Custom event tracking ");
	//   32   67:aload           4
	//   33   69:ldc2            #311 <String "Custom event tracking ">
	//   34   72:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   35   75:pop             
		if(customEventsEnabled)
	//*  36   76:aload_0         
	//*  37   77:getfield        #56  <Field boolean customEventsEnabled>
	//*  38   80:ifeq            90
			s = "enabled";
	//   39   83:ldc2            #313 <String "enabled">
	//   40   86:astore_2        
		else
	//*  41   87:goto            94
			s = "disabled";
	//   42   90:ldc2            #315 <String "disabled">
	//   43   93:astore_2        
		stringbuilder.append(s);
	//   44   94:aload           4
	//   45   96:aload_2         
	//   46   97:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   47  100:pop             
		logger.d("Answers", stringbuilder.toString());
	//   48  101:aload_3         
	//   49  102:ldc1            #147 <String "Answers">
	//   50  104:aload           4
	//   51  106:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   52  109:invokeinterface #157 <Method void Logger.d(String, String)>
		predefinedEventsEnabled = analyticssettingsdata.trackPredefinedEvents;
	//   53  114:aload_0         
	//   54  115:aload_1         
	//   55  116:getfield        #318 <Field boolean AnalyticsSettingsData.trackPredefinedEvents>
	//   56  119:putfield        #58  <Field boolean predefinedEventsEnabled>
		logger = Fabric.getLogger();
	//   57  122:invokestatic    #133 <Method Logger Fabric.getLogger()>
	//   58  125:astore_3        
		stringbuilder = new StringBuilder();
	//   59  126:new             #135 <Class StringBuilder>
	//   60  129:dup             
	//   61  130:invokespecial   #136 <Method void StringBuilder()>
	//   62  133:astore          4
		stringbuilder.append("Predefined event tracking ");
	//   63  135:aload           4
	//   64  137:ldc2            #320 <String "Predefined event tracking ">
	//   65  140:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   66  143:pop             
		if(predefinedEventsEnabled)
	//*  67  144:aload_0         
	//*  68  145:getfield        #58  <Field boolean predefinedEventsEnabled>
	//*  69  148:ifeq            158
			s = "enabled";
	//   70  151:ldc2            #313 <String "enabled">
	//   71  154:astore_2        
		else
	//*  72  155:goto            162
			s = "disabled";
	//   73  158:ldc2            #315 <String "disabled">
	//   74  161:astore_2        
		stringbuilder.append(s);
	//   75  162:aload           4
	//   76  164:aload_2         
	//   77  165:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   78  168:pop             
		logger.d("Answers", stringbuilder.toString());
	//   79  169:aload_3         
	//   80  170:ldc1            #147 <String "Answers">
	//   81  172:aload           4
	//   82  174:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   83  177:invokeinterface #157 <Method void Logger.d(String, String)>
		if(analyticssettingsdata.samplingRate > 1)
	//*  84  182:aload_1         
	//*  85  183:getfield        #323 <Field int AnalyticsSettingsData.samplingRate>
	//*  86  186:iconst_1        
	//*  87  187:icmple          218
		{
			Fabric.getLogger().d("Answers", "Event sampling enabled");
	//   88  190:invokestatic    #133 <Method Logger Fabric.getLogger()>
	//   89  193:ldc1            #147 <String "Answers">
	//   90  195:ldc2            #325 <String "Event sampling enabled">
	//   91  198:invokeinterface #157 <Method void Logger.d(String, String)>
			eventFilter = ((EventFilter) (new SamplingEventFilter(analyticssettingsdata.samplingRate)));
	//   92  203:aload_0         
	//   93  204:new             #327 <Class SamplingEventFilter>
	//   94  207:dup             
	//   95  208:aload_1         
	//   96  209:getfield        #323 <Field int AnalyticsSettingsData.samplingRate>
	//   97  212:invokespecial   #330 <Method void SamplingEventFilter(int)>
	//   98  215:putfield        #54  <Field EventFilter eventFilter>
		}
		rolloverIntervalSeconds = analyticssettingsdata.flushIntervalSeconds;
	//   99  218:aload_0         
	//  100  219:aload_1         
	//  101  220:getfield        #333 <Field int AnalyticsSettingsData.flushIntervalSeconds>
	//  102  223:putfield        #60  <Field int rolloverIntervalSeconds>
		scheduleTimeBasedFileRollOver(0L, rolloverIntervalSeconds);
	//  103  226:aload_0         
	//  104  227:lconst_0        
	//  105  228:aload_0         
	//  106  229:getfield        #60  <Field int rolloverIntervalSeconds>
	//  107  232:i2l             
	//  108  233:invokevirtual   #224 <Method void scheduleTimeBasedFileRollOver(long, long)>
	//  109  236:return          
	}

	static final int UNDEFINED_ROLLOVER_INTERVAL_SECONDS = -1;
	ApiKey apiKey;
	private final Context context;
	boolean customEventsEnabled;
	EventFilter eventFilter;
	private final ScheduledExecutorService executorService;
	private final SessionAnalyticsFilesManager filesManager;
	FilesSender filesSender;
	private final HttpRequestFactory httpRequestFactory;
	private final Kit kit;
	final SessionEventMetadata metadata;
	boolean predefinedEventsEnabled;
	private final AtomicReference rolloverFutureRef = new AtomicReference();
	volatile int rolloverIntervalSeconds;
}
