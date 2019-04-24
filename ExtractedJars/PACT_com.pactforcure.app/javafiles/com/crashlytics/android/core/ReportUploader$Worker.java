// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.BackgroundPriorityRunnable;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.crashlytics.android.core:
//			ReportUploader, CrashlyticsCore, CrashlyticsUncaughtExceptionHandler, Report

private class ReportUploader$Worker extends BackgroundPriorityRunnable
{

	private void attemptUploadWithRetry()
	{
		Object obj;
		CrashlyticsCore crashlyticscore;
		Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Starting report processing in ").append(delay).append(" second(s)...").toString());
	//    0    0:invokestatic    #30  <Method Logger Fabric.getLogger()>
	//    1    3:ldc1            #32  <String "CrashlyticsCore">
	//    2    5:new             #34  <Class StringBuilder>
	//    3    8:dup             
	//    4    9:invokespecial   #35  <Method void StringBuilder()>
	//    5   12:ldc1            #37  <String "Starting report processing in ">
	//    6   14:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//    7   17:aload_0         
	//    8   18:getfield        #20  <Field float delay>
	//    9   21:invokevirtual   #44  <Method StringBuilder StringBuilder.append(float)>
	//   10   24:ldc1            #46  <String " second(s)...">
	//   11   26:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   12   29:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   13   32:invokeinterface #56  <Method void Logger.d(String, String)>
		CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler;
		if(delay > 0.0F)
	//*  14   37:aload_0         
	//*  15   38:getfield        #20  <Field float delay>
	//*  16   41:fconst_0        
	//*  17   42:fcmpl           
	//*  18   43:ifle            57
			try
			{
				Thread.sleep((long)(delay * 1000F));
	//   19   46:aload_0         
	//   20   47:getfield        #20  <Field float delay>
	//   21   50:ldc1            #57  <Float 1000F>
	//   22   52:fmul            
	//   23   53:f2l             
	//   24   54:invokestatic    #63  <Method void Thread.sleep(long)>
			}
	//*  25   57:invokestatic    #69  <Method CrashlyticsCore CrashlyticsCore.getInstance()>
	//*  26   60:astore          5
	//*  27   62:aload           5
	//*  28   64:invokevirtual   #73  <Method CrashlyticsUncaughtExceptionHandler CrashlyticsCore.getHandler()>
	//*  29   67:astore          6
	//*  30   69:aload_0         
	//*  31   70:getfield        #15  <Field ReportUploader this$0>
	//*  32   73:invokevirtual   #77  <Method List ReportUploader.findReports()>
	//*  33   76:astore          4
	//*  34   78:aload           6
	//*  35   80:invokevirtual   #83  <Method boolean CrashlyticsUncaughtExceptionHandler.isHandlingException()>
	//*  36   83:ifeq            96
	//*  37   86:return          
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  38   87:astore          4
			{
				Thread.currentThread().interrupt();
	//   39   89:invokestatic    #87  <Method Thread Thread.currentThread()>
	//   40   92:invokevirtual   #90  <Method void Thread.interrupt()>
				return;
	//   41   95:return          
			}
		crashlyticscore = CrashlyticsCore.getInstance();
		crashlyticsuncaughtexceptionhandler = crashlyticscore.getHandler();
		obj = ((Object) (findReports()));
		if(!crashlyticsuncaughtexceptionhandler.isHandlingException()) goto _L2; else goto _L1
_L1:
		return;
_L2:
		if(((List) (obj)).isEmpty() || crashlyticscore.canSendWithUserApproval())
			break; /* Loop/switch isn't completed */
	//   42   96:aload           4
	//   43   98:invokeinterface #95  <Method boolean List.isEmpty()>
	//   44  103:ifne            191
	//   45  106:aload           5
	//   46  108:invokevirtual   #98  <Method boolean CrashlyticsCore.canSendWithUserApproval()>
	//   47  111:ifne            191
		Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("User declined to send. Removing ").append(((List) (obj)).size()).append(" Report(s).").toString());
	//   48  114:invokestatic    #30  <Method Logger Fabric.getLogger()>
	//   49  117:ldc1            #32  <String "CrashlyticsCore">
	//   50  119:new             #34  <Class StringBuilder>
	//   51  122:dup             
	//   52  123:invokespecial   #35  <Method void StringBuilder()>
	//   53  126:ldc1            #100 <String "User declined to send. Removing ">
	//   54  128:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   55  131:aload           4
	//   56  133:invokeinterface #104 <Method int List.size()>
	//   57  138:invokevirtual   #107 <Method StringBuilder StringBuilder.append(int)>
	//   58  141:ldc1            #109 <String " Report(s).">
	//   59  143:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   60  146:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   61  149:invokeinterface #56  <Method void Logger.d(String, String)>
		obj = ((Object) (((List) (obj)).iterator()));
	//   62  154:aload           4
	//   63  156:invokeinterface #113 <Method Iterator List.iterator()>
	//   64  161:astore          4
		while(((Iterator) (obj)).hasNext()) 
	//*  65  163:aload           4
	//*  66  165:invokeinterface #118 <Method boolean Iterator.hasNext()>
	//*  67  170:ifeq            86
			((Report)((Iterator) (obj)).next()).remove();
	//   68  173:aload           4
	//   69  175:invokeinterface #122 <Method Object Iterator.next()>
	//   70  180:checkcast       #124 <Class Report>
	//   71  183:invokeinterface #127 <Method void Report.remove()>
		if(true) goto _L1; else goto _L3
	//   72  188:goto            163
_L3:
		int i = 0;
	//   73  191:iconst_0        
	//   74  192:istore_1        
		while(!((List) (obj)).isEmpty() && !CrashlyticsCore.getInstance().getHandler().isHandlingException()) 
	//*  75  193:aload           4
	//*  76  195:invokeinterface #95  <Method boolean List.isEmpty()>
	//*  77  200:ifne            86
	//*  78  203:invokestatic    #69  <Method CrashlyticsCore CrashlyticsCore.getInstance()>
	//*  79  206:invokevirtual   #73  <Method CrashlyticsUncaughtExceptionHandler CrashlyticsCore.getHandler()>
	//*  80  209:invokevirtual   #83  <Method boolean CrashlyticsUncaughtExceptionHandler.isHandlingException()>
	//*  81  212:ifne            86
		{
			Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Attempting to send ").append(((List) (obj)).size()).append(" report(s)").toString());
	//   82  215:invokestatic    #30  <Method Logger Fabric.getLogger()>
	//   83  218:ldc1            #32  <String "CrashlyticsCore">
	//   84  220:new             #34  <Class StringBuilder>
	//   85  223:dup             
	//   86  224:invokespecial   #35  <Method void StringBuilder()>
	//   87  227:ldc1            #129 <String "Attempting to send ">
	//   88  229:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   89  232:aload           4
	//   90  234:invokeinterface #104 <Method int List.size()>
	//   91  239:invokevirtual   #107 <Method StringBuilder StringBuilder.append(int)>
	//   92  242:ldc1            #131 <String " report(s)">
	//   93  244:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   94  247:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   95  250:invokeinterface #56  <Method void Logger.d(String, String)>
			Report report;
			for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); forceUpload(report))
	//*  96  255:aload           4
	//*  97  257:invokeinterface #113 <Method Iterator List.iterator()>
	//*  98  262:astore          4
	//*  99  264:aload           4
	//* 100  266:invokeinterface #118 <Method boolean Iterator.hasNext()>
	//* 101  271:ifeq            299
				report = (Report)((Iterator) (obj)).next();
	//  102  274:aload           4
	//  103  276:invokeinterface #122 <Method Object Iterator.next()>
	//  104  281:checkcast       #124 <Class Report>
	//  105  284:astore          5

	//  106  286:aload_0         
	//  107  287:getfield        #15  <Field ReportUploader this$0>
	//  108  290:aload           5
	//  109  292:invokevirtual   #135 <Method boolean ReportUploader.forceUpload(Report)>
	//  110  295:pop             
	//* 111  296:goto            264
			List list = findReports();
	//  112  299:aload_0         
	//  113  300:getfield        #15  <Field ReportUploader this$0>
	//  114  303:invokevirtual   #77  <Method List ReportUploader.findReports()>
	//  115  306:astore          5
			obj = ((Object) (list));
	//  116  308:aload           5
	//  117  310:astore          4
			if(!list.isEmpty())
	//* 118  312:aload           5
	//* 119  314:invokeinterface #95  <Method boolean List.isEmpty()>
	//* 120  319:ifne            193
			{
				long l = ReportUploader.access$100()[Math.min(i, ReportUploader.access$100().length - 1)];
	//  121  322:invokestatic    #139 <Method short[] ReportUploader.access$100()>
	//  122  325:iload_1         
	//  123  326:invokestatic    #139 <Method short[] ReportUploader.access$100()>
	//  124  329:arraylength     
	//  125  330:iconst_1        
	//  126  331:isub            
	//  127  332:invokestatic    #145 <Method int Math.min(int, int)>
	//  128  335:saload          
	//  129  336:i2l             
	//  130  337:lstore_2        
				Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Report submisson: scheduling delayed retry in ").append(l).append(" seconds").toString());
	//  131  338:invokestatic    #30  <Method Logger Fabric.getLogger()>
	//  132  341:ldc1            #32  <String "CrashlyticsCore">
	//  133  343:new             #34  <Class StringBuilder>
	//  134  346:dup             
	//  135  347:invokespecial   #35  <Method void StringBuilder()>
	//  136  350:ldc1            #147 <String "Report submisson: scheduling delayed retry in ">
	//  137  352:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//  138  355:lload_2         
	//  139  356:invokevirtual   #150 <Method StringBuilder StringBuilder.append(long)>
	//  140  359:ldc1            #152 <String " seconds">
	//  141  361:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//  142  364:invokevirtual   #50  <Method String StringBuilder.toString()>
	//  143  367:invokeinterface #56  <Method void Logger.d(String, String)>
				try
				{
					Thread.sleep(1000L * l);
	//  144  372:ldc2w           #153 <Long 1000L>
	//  145  375:lload_2         
	//  146  376:lmul            
	//  147  377:invokestatic    #63  <Method void Thread.sleep(long)>
				}
	//* 148  380:iload_1         
	//* 149  381:iconst_1        
	//* 150  382:iadd            
	//* 151  383:istore_1        
	//* 152  384:aload           5
	//* 153  386:astore          4
	//* 154  388:goto            193
				catch(InterruptedException interruptedexception)
	//* 155  391:astore          4
				{
					Thread.currentThread().interrupt();
	//  156  393:invokestatic    #87  <Method Thread Thread.currentThread()>
	//  157  396:invokevirtual   #90  <Method void Thread.interrupt()>
					return;
	//  158  399:return          
				}
				i++;
				obj = ((Object) (list));
			}
		}
		if(true) goto _L1; else goto _L4
_L4:
	}

	public void onRun()
	{
		try
		{
			attemptUploadWithRetry();
	//    0    0:aload_0         
	//    1    1:invokespecial   #159 <Method void attemptUploadWithRetry()>
		}
	//*   2    4:aload_0         
	//*   3    5:getfield        #15  <Field ReportUploader this$0>
	//*   4    8:aconst_null     
	//*   5    9:invokestatic    #163 <Method Thread ReportUploader.access$002(ReportUploader, Thread)>
	//*   6   12:pop             
	//*   7   13:return          
		catch(Exception exception)
	//*   8   14:astore_1        
		{
			Fabric.getLogger().e("CrashlyticsCore", "An unexpected error occurred while attempting to upload crash reports.", ((Throwable) (exception)));
	//    9   15:invokestatic    #30  <Method Logger Fabric.getLogger()>
	//   10   18:ldc1            #32  <String "CrashlyticsCore">
	//   11   20:ldc1            #165 <String "An unexpected error occurred while attempting to upload crash reports.">
	//   12   22:aload_1         
	//   13   23:invokeinterface #169 <Method void Logger.e(String, String, Throwable)>
		}
		ReportUploader.access$002(ReportUploader.this, ((Thread) (null)));
	//*  14   28:goto            4
	}

	private final float delay;
	final ReportUploader this$0;

	ReportUploader$Worker(float f)
	{
		this$0 = ReportUploader.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ReportUploader this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void BackgroundPriorityRunnable()>
		delay = f;
	//    5    9:aload_0         
	//    6   10:fload_2         
	//    7   11:putfield        #20  <Field float delay>
	//    8   14:return          
	}
}
