// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.ApiKey;
import io.fabric.sdk.android.services.common.BackgroundPriorityRunnable;
import java.io.File;
import java.io.FilenameFilter;
import java.util.*;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsCore, SessionReport, CreateReportRequest, CreateReportSpiCall, 
//			Report, CrashlyticsUncaughtExceptionHandler

class ReportUploader
{
	private class Worker extends BackgroundPriorityRunnable
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
				long l = ReportUploader.RETRY_INTERVALS[Math.min(i, ReportUploader.RETRY_INTERVALS.length - 1)];
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
			uploadThread = null;
		//    9   21:aload_0         
		//   10   22:getfield        #15  <Field ReportUploader this$0>
		//   11   25:aconst_null     
		//   12   26:invokestatic    #169 <Method Thread ReportUploader.access$002(ReportUploader, Thread)>
		//   13   29:pop             
		//   14   30:return          
		}

		private final float delay;
		final ReportUploader this$0;

		Worker(float f)
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


	public ReportUploader(CreateReportSpiCall createreportspicall)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #56  <Method void Object()>
	//    6   12:putfield        #58  <Field Object fileAccessLock>
		if(createreportspicall == null)
	//*   7   15:aload_1         
	//*   8   16:ifnonnull       29
		{
			throw new IllegalArgumentException("createReportCall must not be null.");
	//    9   19:new             #60  <Class IllegalArgumentException>
	//   10   22:dup             
	//   11   23:ldc1            #62  <String "createReportCall must not be null.">
	//   12   25:invokespecial   #65  <Method void IllegalArgumentException(String)>
	//   13   28:athrow          
		} else
		{
			createReportCall = createreportspicall;
	//   14   29:aload_0         
	//   15   30:aload_1         
	//   16   31:putfield        #67  <Field CreateReportSpiCall createReportCall>
			return;
	//   17   34:return          
		}
	}

	List findReports()
	{
		Fabric.getLogger().d("CrashlyticsCore", "Checking for crash reports...");
	//    0    0:invokestatic    #81  <Method Logger Fabric.getLogger()>
	//    1    3:ldc1            #83  <String "CrashlyticsCore">
	//    2    5:ldc1            #85  <String "Checking for crash reports...">
	//    3    7:invokeinterface #91  <Method void Logger.d(String, String)>
		File afile[];
		synchronized(fileAccessLock)
	//*   4   12:aload_0         
	//*   5   13:getfield        #58  <Field Object fileAccessLock>
	//*   6   16:astore          4
	//*   7   18:aload           4
	//*   8   20:monitorenter    
		{
			afile = CrashlyticsCore.getInstance().getSdkDirectory().listFiles(crashFileFilter);
	//    9   21:invokestatic    #97  <Method CrashlyticsCore CrashlyticsCore.getInstance()>
	//   10   24:invokevirtual   #101 <Method File CrashlyticsCore.getSdkDirectory()>
	//   11   27:getstatic       #33  <Field FilenameFilter crashFileFilter>
	//   12   30:invokevirtual   #107 <Method File[] File.listFiles(FilenameFilter)>
	//   13   33:astore_3        
		}
	//   14   34:aload           4
	//   15   36:monitorexit     
		obj = ((Object) (new LinkedList()));
	//   16   37:new             #109 <Class LinkedList>
	//   17   40:dup             
	//   18   41:invokespecial   #110 <Method void LinkedList()>
	//   19   44:astore          4
		int j = afile.length;
	//   20   46:aload_3         
	//   21   47:arraylength     
	//   22   48:istore_2        
		for(int i = 0; i < j; i++)
	//*  23   49:iconst_0        
	//*  24   50:istore_1        
	//*  25   51:iload_1         
	//*  26   52:iload_2         
	//*  27   53:icmpge          132
		{
			File file = afile[i];
	//   28   56:aload_3         
	//   29   57:iload_1         
	//   30   58:aaload          
	//   31   59:astore          5
			Logger logger = Fabric.getLogger();
	//   32   61:invokestatic    #81  <Method Logger Fabric.getLogger()>
	//   33   64:astore          6
			StringBuilder stringbuilder = new StringBuilder();
	//   34   66:new             #112 <Class StringBuilder>
	//   35   69:dup             
	//   36   70:invokespecial   #113 <Method void StringBuilder()>
	//   37   73:astore          7
			stringbuilder.append("Found crash report ");
	//   38   75:aload           7
	//   39   77:ldc1            #115 <String "Found crash report ">
	//   40   79:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//   41   82:pop             
			stringbuilder.append(file.getPath());
	//   42   83:aload           7
	//   43   85:aload           5
	//   44   87:invokevirtual   #123 <Method String File.getPath()>
	//   45   90:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//   46   93:pop             
			logger.d("CrashlyticsCore", stringbuilder.toString());
	//   47   94:aload           6
	//   48   96:ldc1            #83  <String "CrashlyticsCore">
	//   49   98:aload           7
	//   50  100:invokevirtual   #126 <Method String StringBuilder.toString()>
	//   51  103:invokeinterface #91  <Method void Logger.d(String, String)>
			((List) (obj)).add(((Object) (new SessionReport(file))));
	//   52  108:aload           4
	//   53  110:new             #128 <Class SessionReport>
	//   54  113:dup             
	//   55  114:aload           5
	//   56  116:invokespecial   #131 <Method void SessionReport(File)>
	//   57  119:invokeinterface #137 <Method boolean List.add(Object)>
	//   58  124:pop             
		}

	//   59  125:iload_1         
	//   60  126:iconst_1        
	//   61  127:iadd            
	//   62  128:istore_1        
	//*  63  129:goto            51
		if(((List) (obj)).isEmpty())
	//*  64  132:aload           4
	//*  65  134:invokeinterface #141 <Method boolean List.isEmpty()>
	//*  66  139:ifeq            154
			Fabric.getLogger().d("CrashlyticsCore", "No reports found.");
	//   67  142:invokestatic    #81  <Method Logger Fabric.getLogger()>
	//   68  145:ldc1            #83  <String "CrashlyticsCore">
	//   69  147:ldc1            #143 <String "No reports found.">
	//   70  149:invokeinterface #91  <Method void Logger.d(String, String)>
		return ((List) (obj));
	//   71  154:aload           4
	//   72  156:areturn         
		exception;
	//   73  157:astore_3        
		obj;
	//   74  158:aload           4
		JVM INSTR monitorexit ;
	//   75  160:monitorexit     
		throw exception;
	//   76  161:aload_3         
	//   77  162:athrow          
	}

	boolean forceUpload(Report report)
	{
		Object obj2 = fileAccessLock;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Object fileAccessLock>
	//    2    4:astore          6
		obj2;
	//    3    6:aload           6
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		boolean flag1 = false;
	//    5    9:iconst_0        
	//    6   10:istore_3        
		boolean flag2;
		Logger logger;
		StringBuilder stringbuilder;
		Object obj = ((Object) (CrashlyticsCore.getInstance().getContext()));
	//    7   11:invokestatic    #97  <Method CrashlyticsCore CrashlyticsCore.getInstance()>
	//    8   14:invokevirtual   #153 <Method android.content.Context CrashlyticsCore.getContext()>
	//    9   17:astore          5
		obj = ((Object) (new CreateReportRequest((new ApiKey()).getValue(((android.content.Context) (obj))), report)));
	//   10   19:new             #155 <Class CreateReportRequest>
	//   11   22:dup             
	//   12   23:new             #157 <Class ApiKey>
	//   13   26:dup             
	//   14   27:invokespecial   #158 <Method void ApiKey()>
	//   15   30:aload           5
	//   16   32:invokevirtual   #162 <Method String ApiKey.getValue(android.content.Context)>
	//   17   35:aload_1         
	//   18   36:invokespecial   #165 <Method void CreateReportRequest(String, Report)>
	//   19   39:astore          5
		flag2 = createReportCall.invoke(((CreateReportRequest) (obj)));
	//   20   41:aload_0         
	//   21   42:getfield        #67  <Field CreateReportSpiCall createReportCall>
	//   22   45:aload           5
	//   23   47:invokeinterface #171 <Method boolean CreateReportSpiCall.invoke(CreateReportRequest)>
	//   24   52:istore          4
		logger = Fabric.getLogger();
	//   25   54:invokestatic    #81  <Method Logger Fabric.getLogger()>
	//   26   57:astore          7
		stringbuilder = new StringBuilder();
	//   27   59:new             #112 <Class StringBuilder>
	//   28   62:dup             
	//   29   63:invokespecial   #113 <Method void StringBuilder()>
	//   30   66:astore          8
		stringbuilder.append("Crashlytics report upload ");
	//   31   68:aload           8
	//   32   70:ldc1            #173 <String "Crashlytics report upload ">
	//   33   72:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//   34   75:pop             
		boolean flag;
		Object obj1;
		if(flag2)
	//*  35   76:iload           4
	//*  36   78:ifeq            204
			obj1 = "complete: ";
	//   37   81:ldc1            #175 <String "complete: ">
	//   38   83:astore          5
		else
	//*  39   85:goto            88
	//*  40   88:aload           8
	//*  41   90:aload           5
	//*  42   92:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//*  43   95:pop             
	//*  44   96:aload           8
	//*  45   98:aload_1         
	//*  46   99:invokeinterface #180 <Method String Report.getFileName()>
	//*  47  104:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//*  48  107:pop             
	//*  49  108:aload           7
	//*  50  110:ldc1            #83  <String "CrashlyticsCore">
	//*  51  112:aload           8
	//*  52  114:invokevirtual   #126 <Method String StringBuilder.toString()>
	//*  53  117:invokeinterface #183 <Method void Logger.i(String, String)>
	//*  54  122:iload_3         
	//*  55  123:istore_2        
	//*  56  124:iload           4
	//*  57  126:ifeq            194
	//*  58  129:aload_1         
	//*  59  130:invokeinterface #186 <Method boolean Report.remove()>
	//*  60  135:pop             
	//*  61  136:iconst_1        
	//*  62  137:istore_2        
	//*  63  138:goto            194
	//*  64  141:astore_1        
	//*  65  142:goto            199
	//*  66  145:astore          5
	//*  67  147:invokestatic    #81  <Method Logger Fabric.getLogger()>
	//*  68  150:astore          7
	//*  69  152:new             #112 <Class StringBuilder>
	//*  70  155:dup             
	//*  71  156:invokespecial   #113 <Method void StringBuilder()>
	//*  72  159:astore          8
	//*  73  161:aload           8
	//*  74  163:ldc1            #188 <String "Error occurred sending report ">
	//*  75  165:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//*  76  168:pop             
	//*  77  169:aload           8
	//*  78  171:aload_1         
	//*  79  172:invokevirtual   #191 <Method StringBuilder StringBuilder.append(Object)>
	//*  80  175:pop             
	//*  81  176:aload           7
	//*  82  178:ldc1            #83  <String "CrashlyticsCore">
	//*  83  180:aload           8
	//*  84  182:invokevirtual   #126 <Method String StringBuilder.toString()>
	//*  85  185:aload           5
	//*  86  187:invokeinterface #195 <Method void Logger.e(String, String, Throwable)>
	//*  87  192:iload_3         
	//*  88  193:istore_2        
	//*  89  194:aload           6
	//*  90  196:monitorexit     
	//*  91  197:iload_2         
	//*  92  198:ireturn         
	//*  93  199:aload           6
	//*  94  201:monitorexit     
	//*  95  202:aload_1         
	//*  96  203:athrow          
			obj1 = "FAILED: ";
	//   97  204:ldc1            #197 <String "FAILED: ">
	//   98  206:astore          5
		stringbuilder.append(((String) (obj1)));
		stringbuilder.append(report.getFileName());
		logger.i("CrashlyticsCore", stringbuilder.toString());
		flag = flag1;
		if(!flag2)
			break MISSING_BLOCK_LABEL_194;
		report.remove();
		flag = true;
		break MISSING_BLOCK_LABEL_194;
		report;
		break MISSING_BLOCK_LABEL_199;
		obj1;
		Logger logger1 = Fabric.getLogger();
		StringBuilder stringbuilder1 = new StringBuilder();
		stringbuilder1.append("Error occurred sending report ");
		stringbuilder1.append(((Object) (report)));
		logger1.e("CrashlyticsCore", stringbuilder1.toString(), ((Throwable) (obj1)));
		flag = flag1;
		obj2;
		JVM INSTR monitorexit ;
		return flag;
		obj2;
		JVM INSTR monitorexit ;
		throw report;
	//*  99  208:goto            88
	}

	boolean isUploading()
	{
		return uploadThread != null;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field Thread uploadThread>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public void uploadReports()
	{
		uploadReports(0.0F);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:invokevirtual   #202 <Method void uploadReports(float)>
	//    3    5:return          
	}

	public void uploadReports(float f)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(uploadThread == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #71  <Field Thread uploadThread>
	//*   4    6:ifnonnull       38
		{
			uploadThread = new Thread(((Runnable) (new Worker(f))), "Crashlytics Report Uploader");
	//    5    9:aload_0         
	//    6   10:new             #204 <Class Thread>
	//    7   13:dup             
	//    8   14:new             #8   <Class ReportUploader$Worker>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:fload_1         
	//   12   20:invokespecial   #207 <Method void ReportUploader$Worker(ReportUploader, float)>
	//   13   23:ldc1            #209 <String "Crashlytics Report Uploader">
	//   14   25:invokespecial   #212 <Method void Thread(Runnable, String)>
	//   15   28:putfield        #71  <Field Thread uploadThread>
			uploadThread.start();
	//   16   31:aload_0         
	//   17   32:getfield        #71  <Field Thread uploadThread>
	//   18   35:invokevirtual   #215 <Method void Thread.start()>
		}
		this;
	//   19   38:aload_0         
		JVM INSTR monitorexit ;
	//   20   39:monitorexit     
		return;
	//   21   40:return          
		Exception exception;
		exception;
	//   22   41:astore_2        
	//*  23   42:aload_0         
		throw exception;
	//   24   43:monitorexit     
	//   25   44:aload_2         
	//   26   45:athrow          
	}

	private static final String CLS_FILE_EXT = ".cls";
	static final Map HEADER_INVALID_CLS_FILE = Collections.singletonMap("X-CRASHLYTICS-INVALID-SESSION", "1");
	private static final short RETRY_INTERVALS[] = {
		10, 20, 30, 60, 120, 300
	};
	private static final FilenameFilter crashFileFilter = new FilenameFilter() {

		public boolean accept(File file, String s)
		{
			return s.endsWith(".cls") && !s.contains("Session");
		//    0    0:aload_2         
		//    1    1:ldc1            #17  <String ".cls">
		//    2    3:invokevirtual   #23  <Method boolean String.endsWith(String)>
		//    3    6:ifeq            20
		//    4    9:aload_2         
		//    5   10:ldc1            #25  <String "Session">
		//    6   12:invokevirtual   #29  <Method boolean String.contains(CharSequence)>
		//    7   15:ifne            20
		//    8   18:iconst_1        
		//    9   19:ireturn         
		//   10   20:iconst_0        
		//   11   21:ireturn         
		}

	}
;
	private final CreateReportSpiCall createReportCall;
	private final Object fileAccessLock = new Object();
	private Thread uploadThread;

	static 
	{
	//    0    0:new             #6   <Class ReportUploader$1>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void ReportUploader$1()>
	//    3    7:putstatic       #33  <Field FilenameFilter crashFileFilter>
	//    4   10:ldc1            #35  <String "X-CRASHLYTICS-INVALID-SESSION">
	//    5   12:ldc1            #37  <String "1">
	//    6   14:invokestatic    #43  <Method Map Collections.singletonMap(Object, Object)>
	//    7   17:putstatic       #45  <Field Map HEADER_INVALID_CLS_FILE>
	//    8   20:bipush          6
	//    9   22:newarray        short[]
	//   10   24:dup             
	//   11   25:iconst_0        
	//   12   26:ldc1            #46  <Int 10>
	//   13   28:sastore         
	//   14   29:dup             
	//   15   30:iconst_1        
	//   16   31:ldc1            #47  <Int 20>
	//   17   33:sastore         
	//   18   34:dup             
	//   19   35:iconst_2        
	//   20   36:ldc1            #48  <Int 30>
	//   21   38:sastore         
	//   22   39:dup             
	//   23   40:iconst_3        
	//   24   41:ldc1            #49  <Int 60>
	//   25   43:sastore         
	//   26   44:dup             
	//   27   45:iconst_4        
	//   28   46:ldc1            #50  <Int 120>
	//   29   48:sastore         
	//   30   49:dup             
	//   31   50:iconst_5        
	//   32   51:ldc1            #51  <Int 300>
	//   33   53:sastore         
	//   34   54:putstatic       #53  <Field short[] RETRY_INTERVALS>
	//*  35   57:return          
	}


/*
	static Thread access$002(ReportUploader reportuploader, Thread thread)
	{
		reportuploader.uploadThread = thread;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #71  <Field Thread uploadThread>
		return thread;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static short[] access$100()
	{
		return RETRY_INTERVALS;
	//    0    0:getstatic       #53  <Field short[] RETRY_INTERVALS>
	//    1    3:areturn         
	}

*/
}
