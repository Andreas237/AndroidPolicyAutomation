// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.events;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package io.fabric.sdk.android.services.events:
//			EventsStrategy, EventsFilesManager, TimeBasedFileRollOverRunnable, FilesSender

public abstract class EnabledEventsStrategy
	implements EventsStrategy
{

	public EnabledEventsStrategy(Context context1, ScheduledExecutorService scheduledexecutorservice, EventsFilesManager eventsfilesmanager)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		rolloverIntervalSeconds = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #28  <Field int rolloverIntervalSeconds>
		context = context1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #30  <Field Context context>
		executorService = scheduledexecutorservice;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #32  <Field ScheduledExecutorService executorService>
		filesManager = eventsfilesmanager;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #34  <Field EventsFilesManager filesManager>
	//   14   24:aload_0         
	//   15   25:new             #36  <Class AtomicReference>
	//   16   28:dup             
	//   17   29:invokespecial   #37  <Method void AtomicReference()>
	//   18   32:putfield        #39  <Field AtomicReference scheduledRolloverFutureRef>
	//   19   35:return          
	}

	public void cancelTimeBasedFileRollOver()
	{
		if(scheduledRolloverFutureRef.get() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field AtomicReference scheduledRolloverFutureRef>
	//*   2    4:invokevirtual   #47  <Method Object AtomicReference.get()>
	//*   3    7:ifnull          44
		{
			CommonUtils.logControlled(context, "Cancelling time-based rollover because no events are currently being generated.");
	//    4   10:aload_0         
	//    5   11:getfield        #30  <Field Context context>
	//    6   14:ldc1            #49  <String "Cancelling time-based rollover because no events are currently being generated.">
	//    7   16:invokestatic    #55  <Method void CommonUtils.logControlled(Context, String)>
			((ScheduledFuture)scheduledRolloverFutureRef.get()).cancel(false);
	//    8   19:aload_0         
	//    9   20:getfield        #39  <Field AtomicReference scheduledRolloverFutureRef>
	//   10   23:invokevirtual   #47  <Method Object AtomicReference.get()>
	//   11   26:checkcast       #57  <Class ScheduledFuture>
	//   12   29:iconst_0        
	//   13   30:invokeinterface #61  <Method boolean ScheduledFuture.cancel(boolean)>
	//   14   35:pop             
			scheduledRolloverFutureRef.set(((Object) (null)));
	//   15   36:aload_0         
	//   16   37:getfield        #39  <Field AtomicReference scheduledRolloverFutureRef>
	//   17   40:aconst_null     
	//   18   41:invokevirtual   #65  <Method void AtomicReference.set(Object)>
		}
	//   19   44:return          
	}

	protected void configureRollover(int i)
	{
		rolloverIntervalSeconds = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #28  <Field int rolloverIntervalSeconds>
		scheduleTimeBasedFileRollOver(0L, rolloverIntervalSeconds);
	//    3    5:aload_0         
	//    4    6:lconst_0        
	//    5    7:aload_0         
	//    6    8:getfield        #28  <Field int rolloverIntervalSeconds>
	//    7   11:i2l             
	//    8   12:invokevirtual   #71  <Method void scheduleTimeBasedFileRollOver(long, long)>
	//    9   15:return          
	}

	public void deleteAllEvents()
	{
		filesManager.deleteAllEventsFiles();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field EventsFilesManager filesManager>
	//    2    4:invokevirtual   #77  <Method void EventsFilesManager.deleteAllEventsFiles()>
	//    3    7:return          
	}

	public int getRollover()
	{
		return rolloverIntervalSeconds;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int rolloverIntervalSeconds>
	//    2    4:ireturn         
	}

	public void recordEvent(Object obj)
	{
		CommonUtils.logControlled(context, obj.toString());
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Context context>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #86  <Method String Object.toString()>
	//    4    8:invokestatic    #55  <Method void CommonUtils.logControlled(Context, String)>
		try
		{
			filesManager.writeEvent(obj);
	//    5   11:aload_0         
	//    6   12:getfield        #34  <Field EventsFilesManager filesManager>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #89  <Method void EventsFilesManager.writeEvent(Object)>
		}
	//*   9   19:aload_0         
	//*  10   20:invokevirtual   #92  <Method void scheduleTimeBasedRollOverIfNeeded()>
	//*  11   23:return          
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  12   24:astore_1        
		{
			CommonUtils.logControlledError(context, "Failed to write event.", ((Throwable) (obj)));
	//   13   25:aload_0         
	//   14   26:getfield        #30  <Field Context context>
	//   15   29:ldc1            #94  <String "Failed to write event.">
	//   16   31:aload_1         
	//   17   32:invokestatic    #98  <Method void CommonUtils.logControlledError(Context, String, Throwable)>
		}
		scheduleTimeBasedRollOverIfNeeded();
	//*  18   35:goto            19
	}

	public boolean rollFileOver()
	{
		boolean flag;
		try
		{
			flag = filesManager.rollFileOver();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field EventsFilesManager filesManager>
	//    2    4:invokevirtual   #103 <Method boolean EventsFilesManager.rollFileOver()>
	//    3    7:istore_1        
		}
	//*   4    8:iload_1         
	//*   5    9:ireturn         
		catch(IOException ioexception)
	//*   6   10:astore_2        
		{
			CommonUtils.logControlledError(context, "Failed to roll file over.", ((Throwable) (ioexception)));
	//    7   11:aload_0         
	//    8   12:getfield        #30  <Field Context context>
	//    9   15:ldc1            #105 <String "Failed to roll file over.">
	//   10   17:aload_2         
	//   11   18:invokestatic    #98  <Method void CommonUtils.logControlledError(Context, String, Throwable)>
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
		if(scheduledRolloverFutureRef.get() == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field AtomicReference scheduledRolloverFutureRef>
	//*   2    4:invokevirtual   #47  <Method Object AtomicReference.get()>
	//*   3    7:ifnonnull       87
			flag = true;
	//    4   10:iconst_1        
	//    5   11:istore          5
		else
	//*   6   13:iload           5
	//*   7   15:ifeq            86
	//*   8   18:new             #109 <Class TimeBasedFileRollOverRunnable>
	//*   9   21:dup             
	//*  10   22:aload_0         
	//*  11   23:getfield        #30  <Field Context context>
	//*  12   26:aload_0         
	//*  13   27:invokespecial   #112 <Method void TimeBasedFileRollOverRunnable(Context, FileRollOverManager)>
	//*  14   30:astore          6
	//*  15   32:aload_0         
	//*  16   33:getfield        #30  <Field Context context>
	//*  17   36:new             #114 <Class StringBuilder>
	//*  18   39:dup             
	//*  19   40:invokespecial   #115 <Method void StringBuilder()>
	//*  20   43:ldc1            #117 <String "Scheduling time based file roll over every ">
	//*  21   45:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//*  22   48:lload_3         
	//*  23   49:invokevirtual   #124 <Method StringBuilder StringBuilder.append(long)>
	//*  24   52:ldc1            #126 <String " seconds">
	//*  25   54:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//*  26   57:invokevirtual   #127 <Method String StringBuilder.toString()>
	//*  27   60:invokestatic    #55  <Method void CommonUtils.logControlled(Context, String)>
	//*  28   63:aload_0         
	//*  29   64:getfield        #39  <Field AtomicReference scheduledRolloverFutureRef>
	//*  30   67:aload_0         
	//*  31   68:getfield        #32  <Field ScheduledExecutorService executorService>
	//*  32   71:aload           6
	//*  33   73:lload_1         
	//*  34   74:lload_3         
	//*  35   75:getstatic       #133 <Field TimeUnit TimeUnit.SECONDS>
	//*  36   78:invokeinterface #139 <Method ScheduledFuture ScheduledExecutorService.scheduleAtFixedRate(Runnable, long, long, TimeUnit)>
	//*  37   83:invokevirtual   #65  <Method void AtomicReference.set(Object)>
	//*  38   86:return          
			flag = false;
	//   39   87:iconst_0        
	//   40   88:istore          5
		if(!flag)
			break MISSING_BLOCK_LABEL_86;
		timebasedfilerolloverrunnable = new TimeBasedFileRollOverRunnable(context, ((FileRollOverManager) (this)));
		CommonUtils.logControlled(context, (new StringBuilder()).append("Scheduling time based file roll over every ").append(l1).append(" seconds").toString());
		scheduledRolloverFutureRef.set(((Object) (executorService.scheduleAtFixedRate(((Runnable) (timebasedfilerolloverrunnable)), l, l1, TimeUnit.SECONDS))));
		return;
	//*  41   90:goto            13
		RejectedExecutionException rejectedexecutionexception;
		rejectedexecutionexception;
	//   42   93:astore          6
		CommonUtils.logControlledError(context, "Failed to schedule time based file roll over", ((Throwable) (rejectedexecutionexception)));
	//   43   95:aload_0         
	//   44   96:getfield        #30  <Field Context context>
	//   45   99:ldc1            #141 <String "Failed to schedule time based file roll over">
	//   46  101:aload           6
	//   47  103:invokestatic    #98  <Method void CommonUtils.logControlledError(Context, String, Throwable)>
		return;
	//   48  106:return          
	}

	public void scheduleTimeBasedRollOverIfNeeded()
	{
		boolean flag;
		if(rolloverIntervalSeconds != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field int rolloverIntervalSeconds>
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
	//*  10   16:getfield        #28  <Field int rolloverIntervalSeconds>
	//*  11   19:i2l             
	//*  12   20:aload_0         
	//*  13   21:getfield        #28  <Field int rolloverIntervalSeconds>
	//*  14   24:i2l             
	//*  15   25:invokevirtual   #71  <Method void scheduleTimeBasedFileRollOver(long, long)>
	//*  16   28:return          
			flag = false;
	//   17   29:iconst_0        
	//   18   30:istore_1        
		if(flag)
			scheduleTimeBasedFileRollOver(rolloverIntervalSeconds, rolloverIntervalSeconds);
	//*  19   31:goto            10
	}

	void sendAndCleanUpIfSuccess()
	{
		FilesSender filessender = getFilesSender();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #148 <Method FilesSender getFilesSender()>
	//    2    4:astore          6
		if(filessender != null) goto _L2; else goto _L1
	//    3    6:aload           6
	//    4    8:ifnonnull       21
_L1:
		CommonUtils.logControlled(context, "skipping files send because we don't yet know the target endpoint");
	//    5   11:aload_0         
	//    6   12:getfield        #30  <Field Context context>
	//    7   15:ldc1            #150 <String "skipping files send because we don't yet know the target endpoint">
	//    8   17:invokestatic    #55  <Method void CommonUtils.logControlled(Context, String)>
_L6:
		return;
	//    9   20:return          
_L2:
		int j;
		List list;
		CommonUtils.logControlled(context, "Sending all files");
	//   10   21:aload_0         
	//   11   22:getfield        #30  <Field Context context>
	//   12   25:ldc1            #152 <String "Sending all files">
	//   13   27:invokestatic    #55  <Method void CommonUtils.logControlled(Context, String)>
		j = 0;
	//   14   30:iconst_0        
	//   15   31:istore_2        
		list = filesManager.getBatchOfFilesToSend();
	//   16   32:aload_0         
	//   17   33:getfield        #34  <Field EventsFilesManager filesManager>
	//   18   36:invokevirtual   #156 <Method List EventsFilesManager.getBatchOfFilesToSend()>
	//   19   39:astore          5
_L7:
		int i;
		int k;
		k = j;
	//   20   41:iload_2         
	//   21   42:istore_3        
		i = j;
	//   22   43:iload_2         
	//   23   44:istore_1        
		if(list.size() <= 0) goto _L4; else goto _L3
	//   24   45:aload           5
	//   25   47:invokeinterface #161 <Method int List.size()>
	//   26   52:ifle            137
_L3:
		i = j;
	//   27   55:iload_2         
	//   28   56:istore_1        
		CommonUtils.logControlled(context, String.format(Locale.US, "attempt to send batch of %d files", new Object[] {
			Integer.valueOf(list.size())
		}));
	//   29   57:aload_0         
	//   30   58:getfield        #30  <Field Context context>
	//   31   61:getstatic       #167 <Field Locale Locale.US>
	//   32   64:ldc1            #169 <String "attempt to send batch of %d files">
	//   33   66:iconst_1        
	//   34   67:anewarray       Object[]
	//   35   70:dup             
	//   36   71:iconst_0        
	//   37   72:aload           5
	//   38   74:invokeinterface #161 <Method int List.size()>
	//   39   79:invokestatic    #175 <Method Integer Integer.valueOf(int)>
	//   40   82:aastore         
	//   41   83:invokestatic    #181 <Method String String.format(Locale, String, Object[])>
	//   42   86:invokestatic    #55  <Method void CommonUtils.logControlled(Context, String)>
		i = j;
	//   43   89:iload_2         
	//   44   90:istore_1        
		boolean flag = filessender.send(list);
	//   45   91:aload           6
	//   46   93:aload           5
	//   47   95:invokeinterface #187 <Method boolean FilesSender.send(List)>
	//   48  100:istore          4
		k = j;
	//   49  102:iload_2         
	//   50  103:istore_3        
		if(!flag)
			break MISSING_BLOCK_LABEL_132;
	//   51  104:iload           4
	//   52  106:ifeq            132
		i = j;
	//   53  109:iload_2         
	//   54  110:istore_1        
		k = j + list.size();
	//   55  111:iload_2         
	//   56  112:aload           5
	//   57  114:invokeinterface #161 <Method int List.size()>
	//   58  119:iadd            
	//   59  120:istore_3        
		i = k;
	//   60  121:iload_3         
	//   61  122:istore_1        
		filesManager.deleteSentFiles(list);
	//   62  123:aload_0         
	//   63  124:getfield        #34  <Field EventsFilesManager filesManager>
	//   64  127:aload           5
	//   65  129:invokevirtual   #191 <Method void EventsFilesManager.deleteSentFiles(List)>
		if(flag) goto _L5; else goto _L4
	//   66  132:iload           4
	//   67  134:ifne            149
_L4:
		if(k == 0)
	//*  68  137:iload_3         
	//*  69  138:ifne            20
		{
			filesManager.deleteOldestInRollOverIfOverMax();
	//   70  141:aload_0         
	//   71  142:getfield        #34  <Field EventsFilesManager filesManager>
	//   72  145:invokevirtual   #194 <Method void EventsFilesManager.deleteOldestInRollOverIfOverMax()>
			return;
	//   73  148:return          
		}
		  goto _L6
_L5:
		i = k;
	//   74  149:iload_3         
	//   75  150:istore_1        
		list = filesManager.getBatchOfFilesToSend();
	//   76  151:aload_0         
	//   77  152:getfield        #34  <Field EventsFilesManager filesManager>
	//   78  155:invokevirtual   #156 <Method List EventsFilesManager.getBatchOfFilesToSend()>
	//   79  158:astore          5
		j = k;
	//   80  160:iload_3         
	//   81  161:istore_2        
		  goto _L7
	//*  82  162:goto            41
		Exception exception;
		exception;
	//   83  165:astore          5
		CommonUtils.logControlledError(context, (new StringBuilder()).append("Failed to send batch of analytics files to server: ").append(exception.getMessage()).toString(), ((Throwable) (exception)));
	//   84  167:aload_0         
	//   85  168:getfield        #30  <Field Context context>
	//   86  171:new             #114 <Class StringBuilder>
	//   87  174:dup             
	//   88  175:invokespecial   #115 <Method void StringBuilder()>
	//   89  178:ldc1            #196 <String "Failed to send batch of analytics files to server: ">
	//   90  180:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   91  183:aload           5
	//   92  185:invokevirtual   #199 <Method String Exception.getMessage()>
	//   93  188:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   94  191:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   95  194:aload           5
	//   96  196:invokestatic    #98  <Method void CommonUtils.logControlledError(Context, String, Throwable)>
		k = i;
	//   97  199:iload_1         
	//   98  200:istore_3        
		  goto _L4
	//*  99  201:goto            137
	}

	public void sendEvents()
	{
		sendAndCleanUpIfSuccess();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #202 <Method void sendAndCleanUpIfSuccess()>
	//    2    4:return          
	}

	static final int UNDEFINED_ROLLOVER_INTERVAL_SECONDS = -1;
	protected final Context context;
	final ScheduledExecutorService executorService;
	protected final EventsFilesManager filesManager;
	volatile int rolloverIntervalSeconds;
	final AtomicReference scheduledRolloverFutureRef = new AtomicReference();
}
