// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.BackgroundPriorityRunnable;
import java.io.File;
import java.util.*;

// Referenced classes of package com.crashlytics.android.core:
//			SessionReport, CrashlyticsController, InvalidSessionReport, CreateReportRequest, 
//			CreateReportSpiCall, Report

class ReportUploader
{
	static final class AlwaysSendCheck
		implements SendCheck
	{

		public boolean canSendReports()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		AlwaysSendCheck()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	static interface HandlingExceptionCheck
	{

		public abstract boolean isHandlingException();
	}

	static interface ReportFilesProvider
	{

		public abstract File[] getCompleteSessionFiles();

		public abstract File[] getInvalidSessionFiles();
	}

	static interface SendCheck
	{

		public abstract boolean canSendReports();
	}

	private class Worker extends BackgroundPriorityRunnable
	{

		private void attemptUploadWithRetry()
		{
			InterruptedException interruptedexception;
			Object obj = ((Object) (Fabric.getLogger()));
		//    0    0:invokestatic    #34  <Method Logger Fabric.getLogger()>
		//    1    3:astore          5
			StringBuilder stringbuilder = new StringBuilder();
		//    2    5:new             #36  <Class StringBuilder>
		//    3    8:dup             
		//    4    9:invokespecial   #37  <Method void StringBuilder()>
		//    5   12:astore          6
			stringbuilder.append("Starting report processing in ");
		//    6   14:aload           6
		//    7   16:ldc1            #39  <String "Starting report processing in ">
		//    8   18:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
		//    9   21:pop             
			stringbuilder.append(delay);
		//   10   22:aload           6
		//   11   24:aload_0         
		//   12   25:getfield        #22  <Field float delay>
		//   13   28:invokevirtual   #46  <Method StringBuilder StringBuilder.append(float)>
		//   14   31:pop             
			stringbuilder.append(" second(s)...");
		//   15   32:aload           6
		//   16   34:ldc1            #48  <String " second(s)...">
		//   17   36:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
		//   18   39:pop             
			((Logger) (obj)).d("CrashlyticsCore", stringbuilder.toString());
		//   19   40:aload           5
		//   20   42:ldc1            #50  <String "CrashlyticsCore">
		//   21   44:aload           6
		//   22   46:invokevirtual   #54  <Method String StringBuilder.toString()>
		//   23   49:invokeinterface #60  <Method void Logger.d(String, String)>
			float f = delay;
		//   24   54:aload_0         
		//   25   55:getfield        #22  <Field float delay>
		//   26   58:fstore_1        
			if(f > 0.0F)
		//*  27   59:fload_1         
		//*  28   60:fconst_0        
		//*  29   61:fcmpl           
		//*  30   62:ifle            85
			{
				long l = (long)(f * 1000F);
		//   31   65:fload_1         
		//   32   66:ldc1            #61  <Float 1000F>
		//   33   68:fmul            
		//   34   69:f2l             
		//   35   70:lstore_3        
				try
				{
					Thread.sleep(l);
		//   36   71:lload_3         
		//   37   72:invokestatic    #67  <Method void Thread.sleep(long)>
				}
		//*  38   75:goto            85
		//*  39   78:invokestatic    #71  <Method Thread Thread.currentThread()>
		//*  40   81:invokevirtual   #74  <Method void Thread.interrupt()>
		//*  41   84:return          
		//*  42   85:aload_0         
		//*  43   86:getfield        #17  <Field ReportUploader this$0>
		//*  44   89:invokevirtual   #78  <Method List ReportUploader.findReports()>
		//*  45   92:astore          5
		//*  46   94:aload_0         
		//*  47   95:getfield        #17  <Field ReportUploader this$0>
		//*  48   98:invokestatic    #82  <Method ReportUploader$HandlingExceptionCheck ReportUploader.access$100(ReportUploader)>
		//*  49  101:invokeinterface #88  <Method boolean ReportUploader$HandlingExceptionCheck.isHandlingException()>
		//*  50  106:ifeq            110
		//*  51  109:return          
		//*  52  110:aload           5
		//*  53  112:invokeinterface #93  <Method boolean List.isEmpty()>
		//*  54  117:ifne            227
		//*  55  120:aload_0         
		//*  56  121:getfield        #24  <Field ReportUploader$SendCheck sendCheck>
		//*  57  124:invokeinterface #98  <Method boolean ReportUploader$SendCheck.canSendReports()>
		//*  58  129:ifne            227
		//*  59  132:invokestatic    #34  <Method Logger Fabric.getLogger()>
		//*  60  135:astore          6
		//*  61  137:new             #36  <Class StringBuilder>
		//*  62  140:dup             
		//*  63  141:invokespecial   #37  <Method void StringBuilder()>
		//*  64  144:astore          7
		//*  65  146:aload           7
		//*  66  148:ldc1            #100 <String "User declined to send. Removing ">
		//*  67  150:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
		//*  68  153:pop             
		//*  69  154:aload           7
		//*  70  156:aload           5
		//*  71  158:invokeinterface #104 <Method int List.size()>
		//*  72  163:invokevirtual   #107 <Method StringBuilder StringBuilder.append(int)>
		//*  73  166:pop             
		//*  74  167:aload           7
		//*  75  169:ldc1            #109 <String " Report(s).">
		//*  76  171:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
		//*  77  174:pop             
		//*  78  175:aload           6
		//*  79  177:ldc1            #50  <String "CrashlyticsCore">
		//*  80  179:aload           7
		//*  81  181:invokevirtual   #54  <Method String StringBuilder.toString()>
		//*  82  184:invokeinterface #60  <Method void Logger.d(String, String)>
		//*  83  189:aload           5
		//*  84  191:invokeinterface #113 <Method Iterator List.iterator()>
		//*  85  196:astore          5
		//*  86  198:aload           5
		//*  87  200:invokeinterface #118 <Method boolean Iterator.hasNext()>
		//*  88  205:ifeq            226
		//*  89  208:aload           5
		//*  90  210:invokeinterface #122 <Method Object Iterator.next()>
		//*  91  215:checkcast       #124 <Class Report>
		//*  92  218:invokeinterface #127 <Method void Report.remove()>
		//*  93  223:goto            198
		//*  94  226:return          
		//*  95  227:iconst_0        
		//*  96  228:istore_2        
		//*  97  229:aload           5
		//*  98  231:invokeinterface #93  <Method boolean List.isEmpty()>
		//*  99  236:ifne            472
		//* 100  239:aload_0         
		//* 101  240:getfield        #17  <Field ReportUploader this$0>
		//* 102  243:invokestatic    #82  <Method ReportUploader$HandlingExceptionCheck ReportUploader.access$100(ReportUploader)>
		//* 103  246:invokeinterface #88  <Method boolean ReportUploader$HandlingExceptionCheck.isHandlingException()>
		//* 104  251:ifeq            255
		//* 105  254:return          
		//* 106  255:invokestatic    #34  <Method Logger Fabric.getLogger()>
		//* 107  258:astore          6
		//* 108  260:new             #36  <Class StringBuilder>
		//* 109  263:dup             
		//* 110  264:invokespecial   #37  <Method void StringBuilder()>
		//* 111  267:astore          7
		//* 112  269:aload           7
		//* 113  271:ldc1            #129 <String "Attempting to send ">
		//* 114  273:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
		//* 115  276:pop             
		//* 116  277:aload           7
		//* 117  279:aload           5
		//* 118  281:invokeinterface #104 <Method int List.size()>
		//* 119  286:invokevirtual   #107 <Method StringBuilder StringBuilder.append(int)>
		//* 120  289:pop             
		//* 121  290:aload           7
		//* 122  292:ldc1            #131 <String " report(s)">
		//* 123  294:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
		//* 124  297:pop             
		//* 125  298:aload           6
		//* 126  300:ldc1            #50  <String "CrashlyticsCore">
		//* 127  302:aload           7
		//* 128  304:invokevirtual   #54  <Method String StringBuilder.toString()>
		//* 129  307:invokeinterface #60  <Method void Logger.d(String, String)>
		//* 130  312:aload           5
		//* 131  314:invokeinterface #113 <Method Iterator List.iterator()>
		//* 132  319:astore          5
		//* 133  321:aload           5
		//* 134  323:invokeinterface #118 <Method boolean Iterator.hasNext()>
		//* 135  328:ifeq            356
		//* 136  331:aload           5
		//* 137  333:invokeinterface #122 <Method Object Iterator.next()>
		//* 138  338:checkcast       #124 <Class Report>
		//* 139  341:astore          6
		//* 140  343:aload_0         
		//* 141  344:getfield        #17  <Field ReportUploader this$0>
		//* 142  347:aload           6
		//* 143  349:invokevirtual   #135 <Method boolean ReportUploader.forceUpload(Report)>
		//* 144  352:pop             
		//* 145  353:goto            321
		//* 146  356:aload_0         
		//* 147  357:getfield        #17  <Field ReportUploader this$0>
		//* 148  360:invokevirtual   #78  <Method List ReportUploader.findReports()>
		//* 149  363:astore          6
		//* 150  365:aload           6
		//* 151  367:astore          5
		//* 152  369:aload           6
		//* 153  371:invokeinterface #93  <Method boolean List.isEmpty()>
		//* 154  376:ifne            229
		//* 155  379:invokestatic    #139 <Method short[] ReportUploader.access$200()>
		//* 156  382:iload_2         
		//* 157  383:invokestatic    #139 <Method short[] ReportUploader.access$200()>
		//* 158  386:arraylength     
		//* 159  387:iconst_1        
		//* 160  388:isub            
		//* 161  389:invokestatic    #145 <Method int Math.min(int, int)>
		//* 162  392:saload          
		//* 163  393:i2l             
		//* 164  394:lstore_3        
		//* 165  395:invokestatic    #34  <Method Logger Fabric.getLogger()>
		//* 166  398:astore          5
		//* 167  400:new             #36  <Class StringBuilder>
		//* 168  403:dup             
		//* 169  404:invokespecial   #37  <Method void StringBuilder()>
		//* 170  407:astore          7
		//* 171  409:aload           7
		//* 172  411:ldc1            #147 <String "Report submisson: scheduling delayed retry in ">
		//* 173  413:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
		//* 174  416:pop             
		//* 175  417:aload           7
		//* 176  419:lload_3         
		//* 177  420:invokevirtual   #150 <Method StringBuilder StringBuilder.append(long)>
		//* 178  423:pop             
		//* 179  424:aload           7
		//* 180  426:ldc1            #152 <String " seconds">
		//* 181  428:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
		//* 182  431:pop             
		//* 183  432:aload           5
		//* 184  434:ldc1            #50  <String "CrashlyticsCore">
		//* 185  436:aload           7
		//* 186  438:invokevirtual   #54  <Method String StringBuilder.toString()>
		//* 187  441:invokeinterface #60  <Method void Logger.d(String, String)>
		//* 188  446:lload_3         
		//* 189  447:ldc2w           #153 <Long 1000L>
		//* 190  450:lmul            
		//* 191  451:invokestatic    #67  <Method void Thread.sleep(long)>
		//* 192  454:iload_2         
		//* 193  455:iconst_1        
		//* 194  456:iadd            
		//* 195  457:istore_2        
		//* 196  458:aload           6
		//* 197  460:astore          5
		//* 198  462:goto            229
		//* 199  465:invokestatic    #71  <Method Thread Thread.currentThread()>
		//* 200  468:invokevirtual   #74  <Method void Thread.interrupt()>
		//* 201  471:return          
		//* 202  472:return          
				// Misplaced declaration of an exception variable
				catch(InterruptedException interruptedexception)
				{
					Thread.currentThread().interrupt();
					return;
				}
			}
			obj = ((Object) (findReports()));
			if(handlingExceptionCheck.isHandlingException())
				return;
			if(!((List) (obj)).isEmpty() && !sendCheck.canSendReports())
			{
				Logger logger = Fabric.getLogger();
				StringBuilder stringbuilder1 = new StringBuilder();
				stringbuilder1.append("User declined to send. Removing ");
				stringbuilder1.append(((List) (obj)).size());
				stringbuilder1.append(" Report(s).");
				logger.d("CrashlyticsCore", stringbuilder1.toString());
				for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((Report)((Iterator) (obj)).next()).remove());
				return;
			}
			int i = 0;
			do
			{
				if(((List) (obj)).isEmpty())
					break;
				if(handlingExceptionCheck.isHandlingException())
					return;
				Object obj1 = ((Object) (Fabric.getLogger()));
				StringBuilder stringbuilder2 = new StringBuilder();
				stringbuilder2.append("Attempting to send ");
				stringbuilder2.append(((List) (obj)).size());
				stringbuilder2.append(" report(s)");
				((Logger) (obj1)).d("CrashlyticsCore", stringbuilder2.toString());
				for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); forceUpload(((Report) (obj1))))
					obj1 = ((Object) ((Report)((Iterator) (obj)).next()));

				obj1 = ((Object) (findReports()));
				obj = obj1;
				if(((List) (obj1)).isEmpty())
					continue;
				long l1 = ReportUploader.RETRY_INTERVALS[Math.min(i, ReportUploader.RETRY_INTERVALS.length - 1)];
				obj = ((Object) (Fabric.getLogger()));
				stringbuilder2 = new StringBuilder();
				stringbuilder2.append("Report submisson: scheduling delayed retry in ");
				stringbuilder2.append(l1);
				stringbuilder2.append(" seconds");
				((Logger) (obj)).d("CrashlyticsCore", stringbuilder2.toString());
				try
				{
					Thread.sleep(l1 * 1000L);
				}
		//* 203  473:astore          5
		//* 204  475:goto            78
				// Misplaced declaration of an exception variable
				catch(InterruptedException interruptedexception)
				{
					Thread.currentThread().interrupt();
					return;
				}
				i++;
				obj = obj1;
			} while(true);
		//* 205  478:astore          5
		//* 206  480:goto            465
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
		//    4    8:invokestatic    #34  <Method Logger Fabric.getLogger()>
		//    5   11:ldc1            #50  <String "CrashlyticsCore">
		//    6   13:ldc1            #161 <String "An unexpected error occurred while attempting to upload crash reports.">
		//    7   15:aload_1         
		//    8   16:invokeinterface #165 <Method void Logger.e(String, String, Throwable)>
			}
			uploadThread = null;
		//    9   21:aload_0         
		//   10   22:getfield        #17  <Field ReportUploader this$0>
		//   11   25:aconst_null     
		//   12   26:invokestatic    #169 <Method Thread ReportUploader.access$002(ReportUploader, Thread)>
		//   13   29:pop             
		//   14   30:return          
		}

		private final float delay;
		private final SendCheck sendCheck;
		final ReportUploader this$0;

		Worker(float f, SendCheck sendcheck)
		{
			this$0 = ReportUploader.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field ReportUploader this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void BackgroundPriorityRunnable()>
			delay = f;
		//    5    9:aload_0         
		//    6   10:fload_2         
		//    7   11:putfield        #22  <Field float delay>
			sendCheck = sendcheck;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #24  <Field ReportUploader$SendCheck sendCheck>
		//   11   19:return          
		}
	}


	public ReportUploader(String s, CreateReportSpiCall createreportspicall, ReportFilesProvider reportfilesprovider, HandlingExceptionCheck handlingexceptioncheck)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #63  <Method void Object()>
	//    6   12:putfield        #65  <Field Object fileAccessLock>
		if(createreportspicall != null)
	//*   7   15:aload_2         
	//*   8   16:ifnull          41
		{
			createReportCall = createreportspicall;
	//    9   19:aload_0         
	//   10   20:aload_2         
	//   11   21:putfield        #67  <Field CreateReportSpiCall createReportCall>
			apiKey = s;
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:putfield        #69  <Field String apiKey>
			reportFilesProvider = reportfilesprovider;
	//   15   29:aload_0         
	//   16   30:aload_3         
	//   17   31:putfield        #71  <Field ReportUploader$ReportFilesProvider reportFilesProvider>
			handlingExceptionCheck = handlingexceptioncheck;
	//   18   34:aload_0         
	//   19   35:aload           4
	//   20   37:putfield        #73  <Field ReportUploader$HandlingExceptionCheck handlingExceptionCheck>
			return;
	//   21   40:return          
		} else
		{
			throw new IllegalArgumentException("createReportCall must not be null.");
	//   22   41:new             #75  <Class IllegalArgumentException>
	//   23   44:dup             
	//   24   45:ldc1            #77  <String "createReportCall must not be null.">
	//   25   47:invokespecial   #80  <Method void IllegalArgumentException(String)>
	//   26   50:athrow          
		}
	}

	List findReports()
	{
		Fabric.getLogger().d("CrashlyticsCore", "Checking for crash reports...");
	//    0    0:invokestatic    #96  <Method Logger Fabric.getLogger()>
	//    1    3:ldc1            #98  <String "CrashlyticsCore">
	//    2    5:ldc1            #100 <String "Checking for crash reports...">
	//    3    7:invokeinterface #106 <Method void Logger.d(String, String)>
		File afile[];
		File afile1[];
		synchronized(fileAccessLock)
	//*   4   12:aload_0         
	//*   5   13:getfield        #65  <Field Object fileAccessLock>
	//*   6   16:astore          4
	//*   7   18:aload           4
	//*   8   20:monitorenter    
		{
			afile1 = reportFilesProvider.getCompleteSessionFiles();
	//    9   21:aload_0         
	//   10   22:getfield        #71  <Field ReportUploader$ReportFilesProvider reportFilesProvider>
	//   11   25:invokeinterface #110 <Method File[] ReportUploader$ReportFilesProvider.getCompleteSessionFiles()>
	//   12   30:astore          6
			afile = reportFilesProvider.getInvalidSessionFiles();
	//   13   32:aload_0         
	//   14   33:getfield        #71  <Field ReportUploader$ReportFilesProvider reportFilesProvider>
	//   15   36:invokeinterface #113 <Method File[] ReportUploader$ReportFilesProvider.getInvalidSessionFiles()>
	//   16   41:astore          5
		}
	//   17   43:aload           4
	//   18   45:monitorexit     
		obj = ((Object) (new LinkedList()));
	//   19   46:new             #115 <Class LinkedList>
	//   20   49:dup             
	//   21   50:invokespecial   #116 <Method void LinkedList()>
	//   22   53:astore          4
		boolean flag = false;
	//   23   55:iconst_0        
	//   24   56:istore_2        
		if(afile1 != null)
	//*  25   57:aload           6
	//*  26   59:ifnull          150
		{
			int k = afile1.length;
	//   27   62:aload           6
	//   28   64:arraylength     
	//   29   65:istore_3        
			for(int i = 0; i < k; i++)
	//*  30   66:iconst_0        
	//*  31   67:istore_1        
	//*  32   68:iload_1         
	//*  33   69:iload_3         
	//*  34   70:icmpge          150
			{
				File file = afile1[i];
	//   35   73:aload           6
	//   36   75:iload_1         
	//   37   76:aaload          
	//   38   77:astore          7
				Logger logger = Fabric.getLogger();
	//   39   79:invokestatic    #96  <Method Logger Fabric.getLogger()>
	//   40   82:astore          8
				StringBuilder stringbuilder = new StringBuilder();
	//   41   84:new             #118 <Class StringBuilder>
	//   42   87:dup             
	//   43   88:invokespecial   #119 <Method void StringBuilder()>
	//   44   91:astore          9
				stringbuilder.append("Found crash report ");
	//   45   93:aload           9
	//   46   95:ldc1            #121 <String "Found crash report ">
	//   47   97:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   48  100:pop             
				stringbuilder.append(file.getPath());
	//   49  101:aload           9
	//   50  103:aload           7
	//   51  105:invokevirtual   #131 <Method String File.getPath()>
	//   52  108:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   53  111:pop             
				logger.d("CrashlyticsCore", stringbuilder.toString());
	//   54  112:aload           8
	//   55  114:ldc1            #98  <String "CrashlyticsCore">
	//   56  116:aload           9
	//   57  118:invokevirtual   #134 <Method String StringBuilder.toString()>
	//   58  121:invokeinterface #106 <Method void Logger.d(String, String)>
				((List) (obj)).add(((Object) (new SessionReport(file))));
	//   59  126:aload           4
	//   60  128:new             #136 <Class SessionReport>
	//   61  131:dup             
	//   62  132:aload           7
	//   63  134:invokespecial   #139 <Method void SessionReport(File)>
	//   64  137:invokeinterface #145 <Method boolean List.add(Object)>
	//   65  142:pop             
			}

	//   66  143:iload_1         
	//   67  144:iconst_1        
	//   68  145:iadd            
	//   69  146:istore_1        
		}
	//*  70  147:goto            68
		HashMap hashmap = new HashMap();
	//   71  150:new             #147 <Class HashMap>
	//   72  153:dup             
	//   73  154:invokespecial   #148 <Method void HashMap()>
	//   74  157:astore          6
		if(afile != null)
	//*  75  159:aload           5
	//*  76  161:ifnull          244
		{
			int l = afile.length;
	//   77  164:aload           5
	//   78  166:arraylength     
	//   79  167:istore_3        
			for(int j = ((int) (flag)); j < l; j++)
	//*  80  168:iload_2         
	//*  81  169:istore_1        
	//*  82  170:iload_1         
	//*  83  171:iload_3         
	//*  84  172:icmpge          244
			{
				File file1 = afile[j];
	//   85  175:aload           5
	//   86  177:iload_1         
	//   87  178:aaload          
	//   88  179:astore          7
				String s1 = CrashlyticsController.getSessionIdFromSessionFile(file1);
	//   89  181:aload           7
	//   90  183:invokestatic    #154 <Method String CrashlyticsController.getSessionIdFromSessionFile(File)>
	//   91  186:astore          8
				if(!((Map) (hashmap)).containsKey(((Object) (s1))))
	//*  92  188:aload           6
	//*  93  190:aload           8
	//*  94  192:invokeinterface #159 <Method boolean Map.containsKey(Object)>
	//*  95  197:ifne            217
					((Map) (hashmap)).put(((Object) (s1)), ((Object) (new LinkedList())));
	//   96  200:aload           6
	//   97  202:aload           8
	//   98  204:new             #115 <Class LinkedList>
	//   99  207:dup             
	//  100  208:invokespecial   #116 <Method void LinkedList()>
	//  101  211:invokeinterface #163 <Method Object Map.put(Object, Object)>
	//  102  216:pop             
				((List)((Map) (hashmap)).get(((Object) (s1)))).add(((Object) (file1)));
	//  103  217:aload           6
	//  104  219:aload           8
	//  105  221:invokeinterface #167 <Method Object Map.get(Object)>
	//  106  226:checkcast       #141 <Class List>
	//  107  229:aload           7
	//  108  231:invokeinterface #145 <Method boolean List.add(Object)>
	//  109  236:pop             
			}

	//  110  237:iload_1         
	//  111  238:iconst_1        
	//  112  239:iadd            
	//  113  240:istore_1        
		}
	//* 114  241:goto            170
		String s;
		Object obj1;
		for(Iterator iterator = ((Map) (hashmap)).keySet().iterator(); iterator.hasNext(); ((List) (obj)).add(((Object) (new InvalidSessionReport(s, (File[])((List) (obj1)).toArray(((Object []) (new File[((List) (obj1)).size()]))))))))
	//* 115  244:aload           6
	//* 116  246:invokeinterface #171 <Method Set Map.keySet()>
	//* 117  251:invokeinterface #177 <Method Iterator Set.iterator()>
	//* 118  256:astore          5
	//* 119  258:aload           5
	//* 120  260:invokeinterface #183 <Method boolean Iterator.hasNext()>
	//* 121  265:ifeq            378
		{
			s = (String)iterator.next();
	//  122  268:aload           5
	//  123  270:invokeinterface #187 <Method Object Iterator.next()>
	//  124  275:checkcast       #189 <Class String>
	//  125  278:astore          7
			obj1 = ((Object) (Fabric.getLogger()));
	//  126  280:invokestatic    #96  <Method Logger Fabric.getLogger()>
	//  127  283:astore          8
			StringBuilder stringbuilder1 = new StringBuilder();
	//  128  285:new             #118 <Class StringBuilder>
	//  129  288:dup             
	//  130  289:invokespecial   #119 <Method void StringBuilder()>
	//  131  292:astore          9
			stringbuilder1.append("Found invalid session: ");
	//  132  294:aload           9
	//  133  296:ldc1            #191 <String "Found invalid session: ">
	//  134  298:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//  135  301:pop             
			stringbuilder1.append(s);
	//  136  302:aload           9
	//  137  304:aload           7
	//  138  306:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//  139  309:pop             
			((Logger) (obj1)).d("CrashlyticsCore", stringbuilder1.toString());
	//  140  310:aload           8
	//  141  312:ldc1            #98  <String "CrashlyticsCore">
	//  142  314:aload           9
	//  143  316:invokevirtual   #134 <Method String StringBuilder.toString()>
	//  144  319:invokeinterface #106 <Method void Logger.d(String, String)>
			obj1 = ((Object) ((List)((Map) (hashmap)).get(((Object) (s)))));
	//  145  324:aload           6
	//  146  326:aload           7
	//  147  328:invokeinterface #167 <Method Object Map.get(Object)>
	//  148  333:checkcast       #141 <Class List>
	//  149  336:astore          8
		}

	//  150  338:aload           4
	//  151  340:new             #193 <Class InvalidSessionReport>
	//  152  343:dup             
	//  153  344:aload           7
	//  154  346:aload           8
	//  155  348:aload           8
	//  156  350:invokeinterface #197 <Method int List.size()>
	//  157  355:anewarray       File[]
	//  158  358:invokeinterface #201 <Method Object[] List.toArray(Object[])>
	//  159  363:checkcast       #203 <Class File[]>
	//  160  366:invokespecial   #206 <Method void InvalidSessionReport(String, File[])>
	//  161  369:invokeinterface #145 <Method boolean List.add(Object)>
	//  162  374:pop             
	//* 163  375:goto            258
		if(((List) (obj)).isEmpty())
	//* 164  378:aload           4
	//* 165  380:invokeinterface #209 <Method boolean List.isEmpty()>
	//* 166  385:ifeq            400
			Fabric.getLogger().d("CrashlyticsCore", "No reports found.");
	//  167  388:invokestatic    #96  <Method Logger Fabric.getLogger()>
	//  168  391:ldc1            #98  <String "CrashlyticsCore">
	//  169  393:ldc1            #211 <String "No reports found.">
	//  170  395:invokeinterface #106 <Method void Logger.d(String, String)>
		return ((List) (obj));
	//  171  400:aload           4
	//  172  402:areturn         
		exception;
	//  173  403:astore          5
		obj;
	//  174  405:aload           4
		JVM INSTR monitorexit ;
	//  175  407:monitorexit     
		throw exception;
	//  176  408:aload           5
	//  177  410:athrow          
	}

	boolean forceUpload(Report report)
	{
		Object obj1 = fileAccessLock;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Object fileAccessLock>
	//    2    4:astore          6
		obj1;
	//    3    6:aload           6
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		boolean flag1 = false;
	//    5    9:iconst_0        
	//    6   10:istore_3        
		boolean flag2;
		Logger logger;
		StringBuilder stringbuilder;
		CreateReportRequest createreportrequest = new CreateReportRequest(apiKey, report);
	//    7   11:new             #219 <Class CreateReportRequest>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:getfield        #69  <Field String apiKey>
	//   11   19:aload_1         
	//   12   20:invokespecial   #222 <Method void CreateReportRequest(String, Report)>
	//   13   23:astore          5
		flag2 = createReportCall.invoke(createreportrequest);
	//   14   25:aload_0         
	//   15   26:getfield        #67  <Field CreateReportSpiCall createReportCall>
	//   16   29:aload           5
	//   17   31:invokeinterface #228 <Method boolean CreateReportSpiCall.invoke(CreateReportRequest)>
	//   18   36:istore          4
		logger = Fabric.getLogger();
	//   19   38:invokestatic    #96  <Method Logger Fabric.getLogger()>
	//   20   41:astore          7
		stringbuilder = new StringBuilder();
	//   21   43:new             #118 <Class StringBuilder>
	//   22   46:dup             
	//   23   47:invokespecial   #119 <Method void StringBuilder()>
	//   24   50:astore          8
		stringbuilder.append("Crashlytics report upload ");
	//   25   52:aload           8
	//   26   54:ldc1            #230 <String "Crashlytics report upload ">
	//   27   56:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   28   59:pop             
		boolean flag;
		Object obj;
		if(flag2)
	//*  29   60:iload           4
	//*  30   62:ifeq            187
			obj = "complete: ";
	//   31   65:ldc1            #232 <String "complete: ">
	//   32   67:astore          5
		else
	//*  33   69:goto            72
	//*  34   72:aload           8
	//*  35   74:aload           5
	//*  36   76:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//*  37   79:pop             
	//*  38   80:aload           8
	//*  39   82:aload_1         
	//*  40   83:invokeinterface #237 <Method String Report.getIdentifier()>
	//*  41   88:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//*  42   91:pop             
	//*  43   92:aload           7
	//*  44   94:ldc1            #98  <String "CrashlyticsCore">
	//*  45   96:aload           8
	//*  46   98:invokevirtual   #134 <Method String StringBuilder.toString()>
	//*  47  101:invokeinterface #240 <Method void Logger.i(String, String)>
	//*  48  106:iload_3         
	//*  49  107:istore_2        
	//*  50  108:iload           4
	//*  51  110:ifeq            177
	//*  52  113:aload_1         
	//*  53  114:invokeinterface #243 <Method void Report.remove()>
	//*  54  119:iconst_1        
	//*  55  120:istore_2        
	//*  56  121:goto            177
	//*  57  124:astore_1        
	//*  58  125:goto            182
	//*  59  128:astore          5
	//*  60  130:invokestatic    #96  <Method Logger Fabric.getLogger()>
	//*  61  133:astore          7
	//*  62  135:new             #118 <Class StringBuilder>
	//*  63  138:dup             
	//*  64  139:invokespecial   #119 <Method void StringBuilder()>
	//*  65  142:astore          8
	//*  66  144:aload           8
	//*  67  146:ldc1            #245 <String "Error occurred sending report ">
	//*  68  148:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//*  69  151:pop             
	//*  70  152:aload           8
	//*  71  154:aload_1         
	//*  72  155:invokevirtual   #248 <Method StringBuilder StringBuilder.append(Object)>
	//*  73  158:pop             
	//*  74  159:aload           7
	//*  75  161:ldc1            #98  <String "CrashlyticsCore">
	//*  76  163:aload           8
	//*  77  165:invokevirtual   #134 <Method String StringBuilder.toString()>
	//*  78  168:aload           5
	//*  79  170:invokeinterface #252 <Method void Logger.e(String, String, Throwable)>
	//*  80  175:iload_3         
	//*  81  176:istore_2        
	//*  82  177:aload           6
	//*  83  179:monitorexit     
	//*  84  180:iload_2         
	//*  85  181:ireturn         
	//*  86  182:aload           6
	//*  87  184:monitorexit     
	//*  88  185:aload_1         
	//*  89  186:athrow          
			obj = "FAILED: ";
	//   90  187:ldc1            #254 <String "FAILED: ">
	//   91  189:astore          5
		stringbuilder.append(((String) (obj)));
		stringbuilder.append(report.getIdentifier());
		logger.i("CrashlyticsCore", stringbuilder.toString());
		flag = flag1;
		if(!flag2)
			break MISSING_BLOCK_LABEL_177;
		report.remove();
		flag = true;
		break MISSING_BLOCK_LABEL_177;
		report;
		break MISSING_BLOCK_LABEL_182;
		obj;
		Logger logger1 = Fabric.getLogger();
		StringBuilder stringbuilder1 = new StringBuilder();
		stringbuilder1.append("Error occurred sending report ");
		stringbuilder1.append(((Object) (report)));
		logger1.e("CrashlyticsCore", stringbuilder1.toString(), ((Throwable) (obj)));
		flag = flag1;
		obj1;
		JVM INSTR monitorexit ;
		return flag;
		obj1;
		JVM INSTR monitorexit ;
		throw report;
	//*  92  191:goto            72
	}

	public void uploadReports(float f, SendCheck sendcheck)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(uploadThread == null)
			break MISSING_BLOCK_LABEL_25;
	//    2    2:aload_0         
	//    3    3:getfield        #84  <Field Thread uploadThread>
	//    4    6:ifnull          25
		Fabric.getLogger().d("CrashlyticsCore", "Report upload has already been started.");
	//    5    9:invokestatic    #96  <Method Logger Fabric.getLogger()>
	//    6   12:ldc1            #98  <String "CrashlyticsCore">
	//    7   14:ldc2            #258 <String "Report upload has already been started.">
	//    8   17:invokeinterface #106 <Method void Logger.d(String, String)>
		this;
	//    9   22:aload_0         
		JVM INSTR monitorexit ;
	//   10   23:monitorexit     
		return;
	//   11   24:return          
		uploadThread = new Thread(((Runnable) (new Worker(f, sendcheck))), "Crashlytics Report Uploader");
	//   12   25:aload_0         
	//   13   26:new             #260 <Class Thread>
	//   14   29:dup             
	//   15   30:new             #18  <Class ReportUploader$Worker>
	//   16   33:dup             
	//   17   34:aload_0         
	//   18   35:fload_1         
	//   19   36:aload_2         
	//   20   37:invokespecial   #263 <Method void ReportUploader$Worker(ReportUploader, float, ReportUploader$SendCheck)>
	//   21   40:ldc2            #265 <String "Crashlytics Report Uploader">
	//   22   43:invokespecial   #268 <Method void Thread(Runnable, String)>
	//   23   46:putfield        #84  <Field Thread uploadThread>
		uploadThread.start();
	//   24   49:aload_0         
	//   25   50:getfield        #84  <Field Thread uploadThread>
	//   26   53:invokevirtual   #271 <Method void Thread.start()>
		this;
	//   27   56:aload_0         
		JVM INSTR monitorexit ;
	//   28   57:monitorexit     
		return;
	//   29   58:return          
		sendcheck;
	//   30   59:astore_2        
	//*  31   60:aload_0         
		throw sendcheck;
	//   32   61:monitorexit     
	//   33   62:aload_2         
	//   34   63:athrow          
	}

	static final Map HEADER_INVALID_CLS_FILE = Collections.singletonMap("X-CRASHLYTICS-INVALID-SESSION", "1");
	private static final short RETRY_INTERVALS[] = {
		10, 20, 30, 60, 120, 300
	};
	private final String apiKey;
	private final CreateReportSpiCall createReportCall;
	private final Object fileAccessLock = new Object();
	private final HandlingExceptionCheck handlingExceptionCheck;
	private final ReportFilesProvider reportFilesProvider;
	private Thread uploadThread;

	static 
	{
	//    0    0:ldc1            #40  <String "X-CRASHLYTICS-INVALID-SESSION">
	//    1    2:ldc1            #42  <String "1">
	//    2    4:invokestatic    #48  <Method Map Collections.singletonMap(Object, Object)>
	//    3    7:putstatic       #50  <Field Map HEADER_INVALID_CLS_FILE>
	//    4   10:bipush          6
	//    5   12:newarray        short[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:ldc1            #51  <Int 10>
	//    9   18:sastore         
	//   10   19:dup             
	//   11   20:iconst_1        
	//   12   21:ldc1            #52  <Int 20>
	//   13   23:sastore         
	//   14   24:dup             
	//   15   25:iconst_2        
	//   16   26:ldc1            #53  <Int 30>
	//   17   28:sastore         
	//   18   29:dup             
	//   19   30:iconst_3        
	//   20   31:ldc1            #54  <Int 60>
	//   21   33:sastore         
	//   22   34:dup             
	//   23   35:iconst_4        
	//   24   36:ldc1            #55  <Int 120>
	//   25   38:sastore         
	//   26   39:dup             
	//   27   40:iconst_5        
	//   28   41:ldc1            #56  <Int 300>
	//   29   43:sastore         
	//   30   44:putstatic       #58  <Field short[] RETRY_INTERVALS>
	//*  31   47:return          
	}


/*
	static Thread access$002(ReportUploader reportuploader, Thread thread)
	{
		reportuploader.uploadThread = thread;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #84  <Field Thread uploadThread>
		return thread;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static HandlingExceptionCheck access$100(ReportUploader reportuploader)
	{
		return reportuploader.handlingExceptionCheck;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field ReportUploader$HandlingExceptionCheck handlingExceptionCheck>
	//    2    4:areturn         
	}

*/


/*
	static short[] access$200()
	{
		return RETRY_INTERVALS;
	//    0    0:getstatic       #58  <Field short[] RETRY_INTERVALS>
	//    1    3:areturn         
	}

*/
}
