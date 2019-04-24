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
		InterruptedException interruptedexception;
		Object obj = ((Object) (Fabric.getLogger()));
	//    0    0:invokestatic    #30  <Method Logger Fabric.getLogger()>
	//    1    3:astore          4
		Object obj1 = ((Object) (new StringBuilder()));
	//    2    5:new             #32  <Class StringBuilder>
	//    3    8:dup             
	//    4    9:invokespecial   #33  <Method void StringBuilder()>
	//    5   12:astore          5
		((StringBuilder) (obj1)).append("Starting report processing in ");
	//    6   14:aload           5
	//    7   16:ldc1            #35  <String "Starting report processing in ">
	//    8   18:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
		((StringBuilder) (obj1)).append(delay);
	//   10   22:aload           5
	//   11   24:aload_0         
	//   12   25:getfield        #20  <Field float delay>
	//   13   28:invokevirtual   #42  <Method StringBuilder StringBuilder.append(float)>
	//   14   31:pop             
		((StringBuilder) (obj1)).append(" second(s)...");
	//   15   32:aload           5
	//   16   34:ldc1            #44  <String " second(s)...">
	//   17   36:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   18   39:pop             
		((Logger) (obj)).d("CrashlyticsCore", ((StringBuilder) (obj1)).toString());
	//   19   40:aload           4
	//   20   42:ldc1            #46  <String "CrashlyticsCore">
	//   21   44:aload           5
	//   22   46:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   23   49:invokeinterface #56  <Method void Logger.d(String, String)>
		if(delay > 0.0F)
	//*  24   54:aload_0         
	//*  25   55:getfield        #20  <Field float delay>
	//*  26   58:fconst_0        
	//*  27   59:fcmpl           
	//*  28   60:ifle            84
			try
			{
				Thread.sleep((long)(delay * 1000F));
	//   29   63:aload_0         
	//   30   64:getfield        #20  <Field float delay>
	//   31   67:ldc1            #57  <Float 1000F>
	//   32   69:fmul            
	//   33   70:f2l             
	//   34   71:invokestatic    #63  <Method void Thread.sleep(long)>
			}
	//*  35   74:goto            84
	//*  36   77:invokestatic    #67  <Method Thread Thread.currentThread()>
	//*  37   80:invokevirtual   #70  <Method void Thread.interrupt()>
	//*  38   83:return          
	//*  39   84:invokestatic    #76  <Method CrashlyticsCore CrashlyticsCore.getInstance()>
	//*  40   87:astore          5
	//*  41   89:aload           5
	//*  42   91:invokevirtual   #80  <Method CrashlyticsUncaughtExceptionHandler CrashlyticsCore.getHandler()>
	//*  43   94:astore          6
	//*  44   96:aload_0         
	//*  45   97:getfield        #15  <Field ReportUploader this$0>
	//*  46  100:invokevirtual   #84  <Method List ReportUploader.findReports()>
	//*  47  103:astore          4
	//*  48  105:aload           6
	//*  49  107:invokevirtual   #90  <Method boolean CrashlyticsUncaughtExceptionHandler.isHandlingException()>
	//*  50  110:ifeq            114
	//*  51  113:return          
	//*  52  114:aload           4
	//*  53  116:invokeinterface #95  <Method boolean List.isEmpty()>
	//*  54  121:ifne            228
	//*  55  124:aload           5
	//*  56  126:invokevirtual   #98  <Method boolean CrashlyticsCore.canSendWithUserApproval()>
	//*  57  129:ifne            228
	//*  58  132:invokestatic    #30  <Method Logger Fabric.getLogger()>
	//*  59  135:astore          5
	//*  60  137:new             #32  <Class StringBuilder>
	//*  61  140:dup             
	//*  62  141:invokespecial   #33  <Method void StringBuilder()>
	//*  63  144:astore          6
	//*  64  146:aload           6
	//*  65  148:ldc1            #100 <String "User declined to send. Removing ">
	//*  66  150:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//*  67  153:pop             
	//*  68  154:aload           6
	//*  69  156:aload           4
	//*  70  158:invokeinterface #104 <Method int List.size()>
	//*  71  163:invokevirtual   #107 <Method StringBuilder StringBuilder.append(int)>
	//*  72  166:pop             
	//*  73  167:aload           6
	//*  74  169:ldc1            #109 <String " Report(s).">
	//*  75  171:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//*  76  174:pop             
	//*  77  175:aload           5
	//*  78  177:ldc1            #46  <String "CrashlyticsCore">
	//*  79  179:aload           6
	//*  80  181:invokevirtual   #50  <Method String StringBuilder.toString()>
	//*  81  184:invokeinterface #56  <Method void Logger.d(String, String)>
	//*  82  189:aload           4
	//*  83  191:invokeinterface #113 <Method Iterator List.iterator()>
	//*  84  196:astore          4
	//*  85  198:aload           4
	//*  86  200:invokeinterface #118 <Method boolean Iterator.hasNext()>
	//*  87  205:ifeq            227
	//*  88  208:aload           4
	//*  89  210:invokeinterface #122 <Method Object Iterator.next()>
	//*  90  215:checkcast       #124 <Class Report>
	//*  91  218:invokeinterface #127 <Method boolean Report.remove()>
	//*  92  223:pop             
	//*  93  224:goto            198
	//*  94  227:return          
	//*  95  228:iconst_0        
	//*  96  229:istore_1        
	//*  97  230:aload           4
	//*  98  232:invokeinterface #95  <Method boolean List.isEmpty()>
	//*  99  237:ifne            470
	//* 100  240:invokestatic    #76  <Method CrashlyticsCore CrashlyticsCore.getInstance()>
	//* 101  243:invokevirtual   #80  <Method CrashlyticsUncaughtExceptionHandler CrashlyticsCore.getHandler()>
	//* 102  246:invokevirtual   #90  <Method boolean CrashlyticsUncaughtExceptionHandler.isHandlingException()>
	//* 103  249:ifeq            253
	//* 104  252:return          
	//* 105  253:invokestatic    #30  <Method Logger Fabric.getLogger()>
	//* 106  256:astore          5
	//* 107  258:new             #32  <Class StringBuilder>
	//* 108  261:dup             
	//* 109  262:invokespecial   #33  <Method void StringBuilder()>
	//* 110  265:astore          6
	//* 111  267:aload           6
	//* 112  269:ldc1            #129 <String "Attempting to send ">
	//* 113  271:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//* 114  274:pop             
	//* 115  275:aload           6
	//* 116  277:aload           4
	//* 117  279:invokeinterface #104 <Method int List.size()>
	//* 118  284:invokevirtual   #107 <Method StringBuilder StringBuilder.append(int)>
	//* 119  287:pop             
	//* 120  288:aload           6
	//* 121  290:ldc1            #131 <String " report(s)">
	//* 122  292:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//* 123  295:pop             
	//* 124  296:aload           5
	//* 125  298:ldc1            #46  <String "CrashlyticsCore">
	//* 126  300:aload           6
	//* 127  302:invokevirtual   #50  <Method String StringBuilder.toString()>
	//* 128  305:invokeinterface #56  <Method void Logger.d(String, String)>
	//* 129  310:aload           4
	//* 130  312:invokeinterface #113 <Method Iterator List.iterator()>
	//* 131  317:astore          4
	//* 132  319:aload           4
	//* 133  321:invokeinterface #118 <Method boolean Iterator.hasNext()>
	//* 134  326:ifeq            354
	//* 135  329:aload           4
	//* 136  331:invokeinterface #122 <Method Object Iterator.next()>
	//* 137  336:checkcast       #124 <Class Report>
	//* 138  339:astore          5
	//* 139  341:aload_0         
	//* 140  342:getfield        #15  <Field ReportUploader this$0>
	//* 141  345:aload           5
	//* 142  347:invokevirtual   #135 <Method boolean ReportUploader.forceUpload(Report)>
	//* 143  350:pop             
	//* 144  351:goto            319
	//* 145  354:aload_0         
	//* 146  355:getfield        #15  <Field ReportUploader this$0>
	//* 147  358:invokevirtual   #84  <Method List ReportUploader.findReports()>
	//* 148  361:astore          5
	//* 149  363:aload           5
	//* 150  365:astore          4
	//* 151  367:aload           5
	//* 152  369:invokeinterface #95  <Method boolean List.isEmpty()>
	//* 153  374:ifne            230
	//* 154  377:invokestatic    #139 <Method short[] ReportUploader.access$100()>
	//* 155  380:iload_1         
	//* 156  381:invokestatic    #139 <Method short[] ReportUploader.access$100()>
	//* 157  384:arraylength     
	//* 158  385:iconst_1        
	//* 159  386:isub            
	//* 160  387:invokestatic    #145 <Method int Math.min(int, int)>
	//* 161  390:saload          
	//* 162  391:i2l             
	//* 163  392:lstore_2        
	//* 164  393:invokestatic    #30  <Method Logger Fabric.getLogger()>
	//* 165  396:astore          4
	//* 166  398:new             #32  <Class StringBuilder>
	//* 167  401:dup             
	//* 168  402:invokespecial   #33  <Method void StringBuilder()>
	//* 169  405:astore          6
	//* 170  407:aload           6
	//* 171  409:ldc1            #147 <String "Report submisson: scheduling delayed retry in ">
	//* 172  411:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//* 173  414:pop             
	//* 174  415:aload           6
	//* 175  417:lload_2         
	//* 176  418:invokevirtual   #150 <Method StringBuilder StringBuilder.append(long)>
	//* 177  421:pop             
	//* 178  422:aload           6
	//* 179  424:ldc1            #152 <String " seconds">
	//* 180  426:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//* 181  429:pop             
	//* 182  430:aload           4
	//* 183  432:ldc1            #46  <String "CrashlyticsCore">
	//* 184  434:aload           6
	//* 185  436:invokevirtual   #50  <Method String StringBuilder.toString()>
	//* 186  439:invokeinterface #56  <Method void Logger.d(String, String)>
	//* 187  444:lload_2         
	//* 188  445:ldc2w           #153 <Long 1000L>
	//* 189  448:lmul            
	//* 190  449:invokestatic    #63  <Method void Thread.sleep(long)>
	//* 191  452:iload_1         
	//* 192  453:iconst_1        
	//* 193  454:iadd            
	//* 194  455:istore_1        
	//* 195  456:aload           5
	//* 196  458:astore          4
	//* 197  460:goto            230
	//* 198  463:invokestatic    #67  <Method Thread Thread.currentThread()>
	//* 199  466:invokevirtual   #70  <Method void Thread.interrupt()>
	//* 200  469:return          
	//* 201  470:return          
			// Misplaced declaration of an exception variable
			catch(InterruptedException interruptedexception)
			{
				Thread.currentThread().interrupt();
				return;
			}
		obj1 = ((Object) (CrashlyticsCore.getInstance()));
		CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler = ((CrashlyticsCore) (obj1)).getHandler();
		obj = ((Object) (findReports()));
		if(crashlyticsuncaughtexceptionhandler.isHandlingException())
			return;
		if(!((List) (obj)).isEmpty() && !((CrashlyticsCore) (obj1)).canSendWithUserApproval())
		{
			Logger logger = Fabric.getLogger();
			StringBuilder stringbuilder = new StringBuilder();
			stringbuilder.append("User declined to send. Removing ");
			stringbuilder.append(((List) (obj)).size());
			stringbuilder.append(" Report(s).");
			logger.d("CrashlyticsCore", stringbuilder.toString());
			for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((Report)((Iterator) (obj)).next()).remove());
			return;
		}
		int i = 0;
		do
		{
			if(((List) (obj)).isEmpty())
				break;
			if(CrashlyticsCore.getInstance().getHandler().isHandlingException())
				return;
			Object obj2 = ((Object) (Fabric.getLogger()));
			StringBuilder stringbuilder1 = new StringBuilder();
			stringbuilder1.append("Attempting to send ");
			stringbuilder1.append(((List) (obj)).size());
			stringbuilder1.append(" report(s)");
			((Logger) (obj2)).d("CrashlyticsCore", stringbuilder1.toString());
			for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); forceUpload(((Report) (obj2))))
				obj2 = ((Object) ((Report)((Iterator) (obj)).next()));

			obj2 = ((Object) (findReports()));
			obj = obj2;
			if(((List) (obj2)).isEmpty())
				continue;
			long l = ReportUploader.access$100()[Math.min(i, ReportUploader.access$100().length - 1)];
			obj = ((Object) (Fabric.getLogger()));
			stringbuilder1 = new StringBuilder();
			stringbuilder1.append("Report submisson: scheduling delayed retry in ");
			stringbuilder1.append(l);
			stringbuilder1.append(" seconds");
			((Logger) (obj)).d("CrashlyticsCore", stringbuilder1.toString());
			try
			{
				Thread.sleep(l * 1000L);
			}
	//* 202  471:astore          4
	//* 203  473:goto            77
			// Misplaced declaration of an exception variable
			catch(InterruptedException interruptedexception)
			{
				Thread.currentThread().interrupt();
				return;
			}
			i++;
			obj = obj2;
		} while(true);
	//* 204  476:astore          4
	//* 205  478:goto            463
	}

	public void onRun()
	{
		try
		{
			attemptUploadWithRetry();
	//    0    0:aload_0         
	//    1    1:invokespecial   #159 <Method void attemptUploadWithRetry()>
		}
	//*   2    4:goto            21
		catch(Exception exception)
	//*   3    7:astore_1        
		{
			Fabric.getLogger().e("CrashlyticsCore", "An unexpected error occurred while attempting to upload crash reports.", ((Throwable) (exception)));
	//    4    8:invokestatic    #30  <Method Logger Fabric.getLogger()>
	//    5   11:ldc1            #46  <String "CrashlyticsCore">
	//    6   13:ldc1            #161 <String "An unexpected error occurred while attempting to upload crash reports.">
	//    7   15:aload_1         
	//    8   16:invokeinterface #165 <Method void Logger.e(String, String, Throwable)>
		}
		ReportUploader.access$002(ReportUploader.this, ((Thread) (null)));
	//    9   21:aload_0         
	//   10   22:getfield        #15  <Field ReportUploader this$0>
	//   11   25:aconst_null     
	//   12   26:invokestatic    #169 <Method Thread ReportUploader.access$002(ReportUploader, Thread)>
	//   13   29:pop             
	//   14   30:return          
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
