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
	//*   7   13:ifne            59
	//*   8   16:getstatic       #118 <Field SessionEvent$Type SessionEvent$Type.CUSTOM>
	//*   9   19:aload_1         
	//*  10   20:getfield        #123 <Field SessionEvent$Type SessionEvent.type>
	//*  11   23:invokevirtual   #127 <Method boolean SessionEvent$Type.equals(Object)>
	//*  12   26:ifeq            59
		{
			Fabric.getLogger().d("Answers", (new StringBuilder()).append("Custom events tracking disabled - skipping event: ").append(((Object) (builder))).toString());
	//   13   29:invokestatic    #133 <Method Logger Fabric.getLogger()>
	//   14   32:ldc1            #135 <String "Answers">
	//   15   34:new             #137 <Class StringBuilder>
	//   16   37:dup             
	//   17   38:invokespecial   #138 <Method void StringBuilder()>
	//   18   41:ldc1            #140 <String "Custom events tracking disabled - skipping event: ">
	//   19   43:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   20   46:aload_1         
	//   21   47:invokevirtual   #147 <Method StringBuilder StringBuilder.append(Object)>
	//   22   50:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   23   53:invokeinterface #157 <Method void Logger.d(String, String)>
			return;
	//   24   58:return          
		}
		if(!predefinedEventsEnabled && SessionEvent.Type.PREDEFINED.equals(((Object) (((SessionEvent) (builder)).type))))
	//*  25   59:aload_0         
	//*  26   60:getfield        #58  <Field boolean predefinedEventsEnabled>
	//*  27   63:ifne            109
	//*  28   66:getstatic       #160 <Field SessionEvent$Type SessionEvent$Type.PREDEFINED>
	//*  29   69:aload_1         
	//*  30   70:getfield        #123 <Field SessionEvent$Type SessionEvent.type>
	//*  31   73:invokevirtual   #127 <Method boolean SessionEvent$Type.equals(Object)>
	//*  32   76:ifeq            109
		{
			Fabric.getLogger().d("Answers", (new StringBuilder()).append("Predefined events tracking disabled - skipping event: ").append(((Object) (builder))).toString());
	//   33   79:invokestatic    #133 <Method Logger Fabric.getLogger()>
	//   34   82:ldc1            #135 <String "Answers">
	//   35   84:new             #137 <Class StringBuilder>
	//   36   87:dup             
	//   37   88:invokespecial   #138 <Method void StringBuilder()>
	//   38   91:ldc1            #162 <String "Predefined events tracking disabled - skipping event: ">
	//   39   93:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   40   96:aload_1         
	//   41   97:invokevirtual   #147 <Method StringBuilder StringBuilder.append(Object)>
	//   42  100:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   43  103:invokeinterface #157 <Method void Logger.d(String, String)>
			return;
	//   44  108:return          
		}
		if(eventFilter.skipEvent(((SessionEvent) (builder))))
	//*  45  109:aload_0         
	//*  46  110:getfield        #54  <Field EventFilter eventFilter>
	//*  47  113:aload_1         
	//*  48  114:invokeinterface #168 <Method boolean EventFilter.skipEvent(SessionEvent)>
	//*  49  119:ifeq            152
		{
			Fabric.getLogger().d("Answers", (new StringBuilder()).append("Skipping filtered event: ").append(((Object) (builder))).toString());
	//   50  122:invokestatic    #133 <Method Logger Fabric.getLogger()>
	//   51  125:ldc1            #135 <String "Answers">
	//   52  127:new             #137 <Class StringBuilder>
	//   53  130:dup             
	//   54  131:invokespecial   #138 <Method void StringBuilder()>
	//   55  134:ldc1            #170 <String "Skipping filtered event: ">
	//   56  136:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   57  139:aload_1         
	//   58  140:invokevirtual   #147 <Method StringBuilder StringBuilder.append(Object)>
	//   59  143:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   60  146:invokeinterface #157 <Method void Logger.d(String, String)>
			return;
	//   61  151:return          
		}
		try
		{
			filesManager.writeEvent(((Object) (builder)));
	//   62  152:aload_0         
	//   63  153:getfield        #68  <Field SessionAnalyticsFilesManager filesManager>
	//   64  156:aload_1         
	//   65  157:invokevirtual   #173 <Method void SessionAnalyticsFilesManager.writeEvent(Object)>
		}
	//*  66  160:aload_0         
	//*  67  161:invokevirtual   #176 <Method void scheduleTimeBasedRollOverIfNeeded()>
	//*  68  164:return          
		catch(IOException ioexception)
	//*  69  165:astore_2        
		{
			Fabric.getLogger().e("Answers", (new StringBuilder()).append("Failed to write event: ").append(((Object) (builder))).toString(), ((Throwable) (ioexception)));
	//   70  166:invokestatic    #133 <Method Logger Fabric.getLogger()>
	//   71  169:ldc1            #135 <String "Answers">
	//   72  171:new             #137 <Class StringBuilder>
	//   73  174:dup             
	//   74  175:invokespecial   #138 <Method void StringBuilder()>
	//   75  178:ldc1            #178 <String "Failed to write event: ">
	//   76  180:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   77  183:aload_1         
	//   78  184:invokevirtual   #147 <Method StringBuilder StringBuilder.append(Object)>
	//   79  187:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   80  190:aload_2         
	//   81  191:invokeinterface #182 <Method void Logger.e(String, String, Throwable)>
		}
		scheduleTimeBasedRollOverIfNeeded();
	//*  82  196:goto            160
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
		TimeBasedFileRollOverRunnable timebasedfilerolloverrunnable;
		if(rolloverFutureRef.get() == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field AtomicReference rolloverFutureRef>
	//*   2    4:invokevirtual   #78  <Method Object AtomicReference.get()>
	//*   3    7:ifnonnull       87
			flag = true;
	//    4   10:iconst_1        
	//    5   11:istore          5
		else
	//*   6   13:iload           5
	//*   7   15:ifeq            86
	//*   8   18:new             #198 <Class TimeBasedFileRollOverRunnable>
	//*   9   21:dup             
	//*  10   22:aload_0         
	//*  11   23:getfield        #64  <Field Context context>
	//*  12   26:aload_0         
	//*  13   27:invokespecial   #201 <Method void TimeBasedFileRollOverRunnable(Context, io.fabric.sdk.android.services.events.FileRollOverManager)>
	//*  14   30:astore          6
	//*  15   32:aload_0         
	//*  16   33:getfield        #64  <Field Context context>
	//*  17   36:new             #137 <Class StringBuilder>
	//*  18   39:dup             
	//*  19   40:invokespecial   #138 <Method void StringBuilder()>
	//*  20   43:ldc1            #203 <String "Scheduling time based file roll over every ">
	//*  21   45:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//*  22   48:lload_3         
	//*  23   49:invokevirtual   #206 <Method StringBuilder StringBuilder.append(long)>
	//*  24   52:ldc1            #208 <String " seconds">
	//*  25   54:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//*  26   57:invokevirtual   #151 <Method String StringBuilder.toString()>
	//*  27   60:invokestatic    #86  <Method void CommonUtils.logControlled(Context, String)>
	//*  28   63:aload_0         
	//*  29   64:getfield        #44  <Field AtomicReference rolloverFutureRef>
	//*  30   67:aload_0         
	//*  31   68:getfield        #66  <Field ScheduledExecutorService executorService>
	//*  32   71:aload           6
	//*  33   73:lload_1         
	//*  34   74:lload_3         
	//*  35   75:getstatic       #214 <Field TimeUnit TimeUnit.SECONDS>
	//*  36   78:invokeinterface #220 <Method ScheduledFuture ScheduledExecutorService.scheduleAtFixedRate(Runnable, long, long, TimeUnit)>
	//*  37   83:invokevirtual   #96  <Method void AtomicReference.set(Object)>
	//*  38   86:return          
			flag = false;
	//   39   87:iconst_0        
	//   40   88:istore          5
		if(!flag)
			break MISSING_BLOCK_LABEL_86;
		timebasedfilerolloverrunnable = new TimeBasedFileRollOverRunnable(context, ((io.fabric.sdk.android.services.events.FileRollOverManager) (this)));
		CommonUtils.logControlled(context, (new StringBuilder()).append("Scheduling time based file roll over every ").append(l1).append(" seconds").toString());
		rolloverFutureRef.set(((Object) (executorService.scheduleAtFixedRate(((Runnable) (timebasedfilerolloverrunnable)), l, l1, TimeUnit.SECONDS))));
		return;
	//*  41   90:goto            13
		RejectedExecutionException rejectedexecutionexception;
		rejectedexecutionexception;
	//   42   93:astore          6
		CommonUtils.logControlledError(context, "Failed to schedule time based file roll over", ((Throwable) (rejectedexecutionexception)));
	//   43   95:aload_0         
	//   44   96:getfield        #64  <Field Context context>
	//   45   99:ldc1            #222 <String "Failed to schedule time based file roll over">
	//   46  101:aload           6
	//   47  103:invokestatic    #192 <Method void CommonUtils.logControlledError(Context, String, Throwable)>
		return;
	//   48  106:return          
	}

	public void scheduleTimeBasedRollOverIfNeeded()
	{
		boolean flag;
		if(rolloverIntervalSeconds != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field int rolloverIntervalSeconds>
	//*   2    4:iconst_m1       
	//*   3    5:icmpeq          29
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_1        
		else
	//*   6   10:iload_1         
	//*   7   11:ifeq            28
	//*   8   14:aload_0         
	//*   9   15:aload_0         
	//*  10   16:getfield        #60  <Field int rolloverIntervalSeconds>
	//*  11   19:i2l             
	//*  12   20:aload_0         
	//*  13   21:getfield        #60  <Field int rolloverIntervalSeconds>
	//*  14   24:i2l             
	//*  15   25:invokevirtual   #224 <Method void scheduleTimeBasedFileRollOver(long, long)>
	//*  16   28:return          
			flag = false;
	//   17   29:iconst_0        
	//   18   30:istore_1        
		if(flag)
			scheduleTimeBasedFileRollOver(rolloverIntervalSeconds, rolloverIntervalSeconds);
	//*  19   31:goto            10
	}

	public void sendEvents()
	{
		if(filesSender != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field FilesSender filesSender>
	//    2    4:ifnonnull       17
_L1:
		CommonUtils.logControlled(context, "skipping files send because we don't yet know the target endpoint");
	//    3    7:aload_0         
	//    4    8:getfield        #64  <Field Context context>
	//    5   11:ldc1            #231 <String "skipping files send because we don't yet know the target endpoint">
	//    6   13:invokestatic    #86  <Method void CommonUtils.logControlled(Context, String)>
_L6:
		return;
	//    7   16:return          
_L2:
		int j;
		List list;
		CommonUtils.logControlled(context, "Sending all files");
	//    8   17:aload_0         
	//    9   18:getfield        #64  <Field Context context>
	//   10   21:ldc1            #233 <String "Sending all files">
	//   11   23:invokestatic    #86  <Method void CommonUtils.logControlled(Context, String)>
		j = 0;
	//   12   26:iconst_0        
	//   13   27:istore_2        
		list = filesManager.getBatchOfFilesToSend();
	//   14   28:aload_0         
	//   15   29:getfield        #68  <Field SessionAnalyticsFilesManager filesManager>
	//   16   32:invokevirtual   #237 <Method List SessionAnalyticsFilesManager.getBatchOfFilesToSend()>
	//   17   35:astore          5
_L7:
		int i;
		int k;
		k = j;
	//   18   37:iload_2         
	//   19   38:istore_3        
		i = j;
	//   20   39:iload_2         
	//   21   40:istore_1        
		if(list.size() <= 0) goto _L4; else goto _L3
	//   22   41:aload           5
	//   23   43:invokeinterface #243 <Method int List.size()>
	//   24   48:ifle            135
_L3:
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
		if(!flag)
			break MISSING_BLOCK_LABEL_130;
	//   50  102:iload           4
	//   51  104:ifeq            130
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
		if(flag) goto _L5; else goto _L4
	//   65  130:iload           4
	//   66  132:ifne            147
_L4:
		if(k == 0)
	//*  67  135:iload_3         
	//*  68  136:ifne            16
		{
			filesManager.deleteOldestInRollOverIfOverMax();
	//   69  139:aload_0         
	//   70  140:getfield        #68  <Field SessionAnalyticsFilesManager filesManager>
	//   71  143:invokevirtual   #276 <Method void SessionAnalyticsFilesManager.deleteOldestInRollOverIfOverMax()>
			return;
	//   72  146:return          
		}
		  goto _L6
_L5:
		i = k;
	//   73  147:iload_3         
	//   74  148:istore_1        
		list = filesManager.getBatchOfFilesToSend();
	//   75  149:aload_0         
	//   76  150:getfield        #68  <Field SessionAnalyticsFilesManager filesManager>
	//   77  153:invokevirtual   #237 <Method List SessionAnalyticsFilesManager.getBatchOfFilesToSend()>
	//   78  156:astore          5
		j = k;
	//   79  158:iload_3         
	//   80  159:istore_2        
		  goto _L7
	//*  81  160:goto            37
		Exception exception;
		exception;
	//   82  163:astore          5
		CommonUtils.logControlledError(context, (new StringBuilder()).append("Failed to send batch of analytics files to server: ").append(exception.getMessage()).toString(), ((Throwable) (exception)));
	//   83  165:aload_0         
	//   84  166:getfield        #64  <Field Context context>
	//   85  169:new             #137 <Class StringBuilder>
	//   86  172:dup             
	//   87  173:invokespecial   #138 <Method void StringBuilder()>
	//   88  176:ldc2            #278 <String "Failed to send batch of analytics files to server: ">
	//   89  179:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   90  182:aload           5
	//   91  184:invokevirtual   #281 <Method String Exception.getMessage()>
	//   92  187:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   93  190:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   94  193:aload           5
	//   95  195:invokestatic    #192 <Method void CommonUtils.logControlledError(Context, String, Throwable)>
		k = i;
	//   96  198:iload_1         
	//   97  199:istore_3        
		  goto _L4
	//*  98  200:goto            135
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
		StringBuilder stringbuilder = (new StringBuilder()).append("Custom event tracking ");
	//   28   58:new             #137 <Class StringBuilder>
	//   29   61:dup             
	//   30   62:invokespecial   #138 <Method void StringBuilder()>
	//   31   65:ldc2            #311 <String "Custom event tracking ">
	//   32   68:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   33   71:astore          4
		if(customEventsEnabled)
	//*  34   73:aload_0         
	//*  35   74:getfield        #56  <Field boolean customEventsEnabled>
	//*  36   77:ifeq            211
			s = "enabled";
	//   37   80:ldc2            #313 <String "enabled">
	//   38   83:astore_2        
		else
	//*  39   84:aload_3         
	//*  40   85:ldc1            #135 <String "Answers">
	//*  41   87:aload           4
	//*  42   89:aload_2         
	//*  43   90:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//*  44   93:invokevirtual   #151 <Method String StringBuilder.toString()>
	//*  45   96:invokeinterface #157 <Method void Logger.d(String, String)>
	//*  46  101:aload_0         
	//*  47  102:aload_1         
	//*  48  103:getfield        #316 <Field boolean AnalyticsSettingsData.trackPredefinedEvents>
	//*  49  106:putfield        #58  <Field boolean predefinedEventsEnabled>
	//*  50  109:invokestatic    #133 <Method Logger Fabric.getLogger()>
	//*  51  112:astore_3        
	//*  52  113:new             #137 <Class StringBuilder>
	//*  53  116:dup             
	//*  54  117:invokespecial   #138 <Method void StringBuilder()>
	//*  55  120:ldc2            #318 <String "Predefined event tracking ">
	//*  56  123:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//*  57  126:astore          4
	//*  58  128:aload_0         
	//*  59  129:getfield        #58  <Field boolean predefinedEventsEnabled>
	//*  60  132:ifeq            218
	//*  61  135:ldc2            #313 <String "enabled">
	//*  62  138:astore_2        
	//*  63  139:aload_3         
	//*  64  140:ldc1            #135 <String "Answers">
	//*  65  142:aload           4
	//*  66  144:aload_2         
	//*  67  145:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//*  68  148:invokevirtual   #151 <Method String StringBuilder.toString()>
	//*  69  151:invokeinterface #157 <Method void Logger.d(String, String)>
	//*  70  156:aload_1         
	//*  71  157:getfield        #321 <Field int AnalyticsSettingsData.samplingRate>
	//*  72  160:iconst_1        
	//*  73  161:icmple          192
	//*  74  164:invokestatic    #133 <Method Logger Fabric.getLogger()>
	//*  75  167:ldc1            #135 <String "Answers">
	//*  76  169:ldc2            #323 <String "Event sampling enabled">
	//*  77  172:invokeinterface #157 <Method void Logger.d(String, String)>
	//*  78  177:aload_0         
	//*  79  178:new             #325 <Class SamplingEventFilter>
	//*  80  181:dup             
	//*  81  182:aload_1         
	//*  82  183:getfield        #321 <Field int AnalyticsSettingsData.samplingRate>
	//*  83  186:invokespecial   #328 <Method void SamplingEventFilter(int)>
	//*  84  189:putfield        #54  <Field EventFilter eventFilter>
	//*  85  192:aload_0         
	//*  86  193:aload_1         
	//*  87  194:getfield        #331 <Field int AnalyticsSettingsData.flushIntervalSeconds>
	//*  88  197:putfield        #60  <Field int rolloverIntervalSeconds>
	//*  89  200:aload_0         
	//*  90  201:lconst_0        
	//*  91  202:aload_0         
	//*  92  203:getfield        #60  <Field int rolloverIntervalSeconds>
	//*  93  206:i2l             
	//*  94  207:invokevirtual   #224 <Method void scheduleTimeBasedFileRollOver(long, long)>
	//*  95  210:return          
			s = "disabled";
	//   96  211:ldc2            #333 <String "disabled">
	//   97  214:astore_2        
		logger.d("Answers", stringbuilder.append(s).toString());
		predefinedEventsEnabled = analyticssettingsdata.trackPredefinedEvents;
		logger = Fabric.getLogger();
		stringbuilder = (new StringBuilder()).append("Predefined event tracking ");
		if(predefinedEventsEnabled)
			s = "enabled";
		else
	//*  98  215:goto            84
			s = "disabled";
	//   99  218:ldc2            #333 <String "disabled">
	//  100  221:astore_2        
		logger.d("Answers", stringbuilder.append(s).toString());
		if(analyticssettingsdata.samplingRate > 1)
		{
			Fabric.getLogger().d("Answers", "Event sampling enabled");
			eventFilter = ((EventFilter) (new SamplingEventFilter(analyticssettingsdata.samplingRate)));
		}
		rolloverIntervalSeconds = analyticssettingsdata.flushIntervalSeconds;
		scheduleTimeBasedFileRollOver(0L, rolloverIntervalSeconds);
	//* 101  222:goto            139
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
