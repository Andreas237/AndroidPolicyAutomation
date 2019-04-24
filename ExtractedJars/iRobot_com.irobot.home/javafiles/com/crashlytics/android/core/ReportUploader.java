// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import b.a.a.a.a.b.h;
import b.a.a.a.c;
import b.a.a.a.l;
import java.io.File;
import java.util.*;

// Referenced classes of package com.crashlytics.android.core:
//			SessionReport, CrashlyticsController, InvalidSessionReport, NativeSessionReport, 
//			CreateReportRequest, CreateReportSpiCall, Report

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

		public abstract File[] getNativeReportFiles();
	}

	static interface SendCheck
	{

		public abstract boolean canSendReports();
	}

	private class Worker extends h
	{

		private void attemptUploadWithRetry()
		{
			int i;
			Object obj;
			obj = ((Object) (c.g()));
		//    0    0:invokestatic    #34  <Method l c.g()>
		//    1    3:astore          4
			StringBuilder stringbuilder = new StringBuilder();
		//    2    5:new             #36  <Class StringBuilder>
		//    3    8:dup             
		//    4    9:invokespecial   #37  <Method void StringBuilder()>
		//    5   12:astore          5
			stringbuilder.append("Starting report processing in ");
		//    6   14:aload           5
		//    7   16:ldc1            #39  <String "Starting report processing in ">
		//    8   18:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
		//    9   21:pop             
			stringbuilder.append(delay);
		//   10   22:aload           5
		//   11   24:aload_0         
		//   12   25:getfield        #22  <Field float delay>
		//   13   28:invokevirtual   #46  <Method StringBuilder StringBuilder.append(float)>
		//   14   31:pop             
			stringbuilder.append(" second(s)...");
		//   15   32:aload           5
		//   16   34:ldc1            #48  <String " second(s)...">
		//   17   36:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
		//   18   39:pop             
			((l) (obj)).a("CrashlyticsCore", stringbuilder.toString());
		//   19   40:aload           4
		//   20   42:ldc1            #50  <String "CrashlyticsCore">
		//   21   44:aload           5
		//   22   46:invokevirtual   #54  <Method String StringBuilder.toString()>
		//   23   49:invokeinterface #60  <Method void l.a(String, String)>
			if(delay > 0.0F)
		//*  24   54:aload_0         
		//*  25   55:getfield        #22  <Field float delay>
		//*  26   58:fconst_0        
		//*  27   59:fcmpl           
		//*  28   60:ifle            84
				try
				{
					Thread.sleep((long)(delay * 1000F));
		//   29   63:aload_0         
		//   30   64:getfield        #22  <Field float delay>
		//   31   67:ldc1            #61  <Float 1000F>
		//   32   69:fmul            
		//   33   70:f2l             
		//   34   71:invokestatic    #67  <Method void Thread.sleep(long)>
				}
		//*  35   74:goto            84
		//*  36   77:invokestatic    #71  <Method Thread Thread.currentThread()>
		//*  37   80:invokevirtual   #74  <Method void Thread.interrupt()>
		//*  38   83:return          
		//*  39   84:aload_0         
		//*  40   85:getfield        #17  <Field ReportUploader this$0>
		//*  41   88:invokevirtual   #78  <Method List ReportUploader.findReports()>
		//*  42   91:astore          4
		//*  43   93:aload_0         
		//*  44   94:getfield        #17  <Field ReportUploader this$0>
		//*  45   97:invokestatic    #82  <Method ReportUploader$HandlingExceptionCheck ReportUploader.access$100(ReportUploader)>
		//*  46  100:invokeinterface #88  <Method boolean ReportUploader$HandlingExceptionCheck.isHandlingException()>
		//*  47  105:ifeq            109
		//*  48  108:return          
		//*  49  109:aload           4
		//*  50  111:invokeinterface #93  <Method boolean List.isEmpty()>
		//*  51  116:ifne            226
		//*  52  119:aload_0         
		//*  53  120:getfield        #24  <Field ReportUploader$SendCheck sendCheck>
		//*  54  123:invokeinterface #98  <Method boolean ReportUploader$SendCheck.canSendReports()>
		//*  55  128:ifne            226
		//*  56  131:invokestatic    #34  <Method l c.g()>
		//*  57  134:astore          5
		//*  58  136:new             #36  <Class StringBuilder>
		//*  59  139:dup             
		//*  60  140:invokespecial   #37  <Method void StringBuilder()>
		//*  61  143:astore          6
		//*  62  145:aload           6
		//*  63  147:ldc1            #100 <String "User declined to send. Removing ">
		//*  64  149:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
		//*  65  152:pop             
		//*  66  153:aload           6
		//*  67  155:aload           4
		//*  68  157:invokeinterface #104 <Method int List.size()>
		//*  69  162:invokevirtual   #107 <Method StringBuilder StringBuilder.append(int)>
		//*  70  165:pop             
		//*  71  166:aload           6
		//*  72  168:ldc1            #109 <String " Report(s).">
		//*  73  170:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
		//*  74  173:pop             
		//*  75  174:aload           5
		//*  76  176:ldc1            #50  <String "CrashlyticsCore">
		//*  77  178:aload           6
		//*  78  180:invokevirtual   #54  <Method String StringBuilder.toString()>
		//*  79  183:invokeinterface #60  <Method void l.a(String, String)>
		//*  80  188:aload           4
		//*  81  190:invokeinterface #113 <Method Iterator List.iterator()>
		//*  82  195:astore          4
		//*  83  197:aload           4
		//*  84  199:invokeinterface #118 <Method boolean Iterator.hasNext()>
		//*  85  204:ifeq            225
		//*  86  207:aload           4
		//*  87  209:invokeinterface #122 <Method Object Iterator.next()>
		//*  88  214:checkcast       #124 <Class Report>
		//*  89  217:invokeinterface #127 <Method void Report.remove()>
		//*  90  222:goto            197
		//*  91  225:return          
		//*  92  226:iconst_0        
		//*  93  227:istore_1        
		//*  94  228:aload           4
		//*  95  230:invokeinterface #93  <Method boolean List.isEmpty()>
		//*  96  235:ifne            464
		//*  97  238:aload_0         
		//*  98  239:getfield        #17  <Field ReportUploader this$0>
		//*  99  242:invokestatic    #82  <Method ReportUploader$HandlingExceptionCheck ReportUploader.access$100(ReportUploader)>
		//* 100  245:invokeinterface #88  <Method boolean ReportUploader$HandlingExceptionCheck.isHandlingException()>
		//* 101  250:ifeq            254
		//* 102  253:return          
		//* 103  254:invokestatic    #34  <Method l c.g()>
		//* 104  257:astore          5
		//* 105  259:new             #36  <Class StringBuilder>
		//* 106  262:dup             
		//* 107  263:invokespecial   #37  <Method void StringBuilder()>
		//* 108  266:astore          6
		//* 109  268:aload           6
		//* 110  270:ldc1            #129 <String "Attempting to send ">
		//* 111  272:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
		//* 112  275:pop             
		//* 113  276:aload           6
		//* 114  278:aload           4
		//* 115  280:invokeinterface #104 <Method int List.size()>
		//* 116  285:invokevirtual   #107 <Method StringBuilder StringBuilder.append(int)>
		//* 117  288:pop             
		//* 118  289:aload           6
		//* 119  291:ldc1            #131 <String " report(s)">
		//* 120  293:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
		//* 121  296:pop             
		//* 122  297:aload           5
		//* 123  299:ldc1            #50  <String "CrashlyticsCore">
		//* 124  301:aload           6
		//* 125  303:invokevirtual   #54  <Method String StringBuilder.toString()>
		//* 126  306:invokeinterface #60  <Method void l.a(String, String)>
		//* 127  311:aload           4
		//* 128  313:invokeinterface #113 <Method Iterator List.iterator()>
		//* 129  318:astore          4
		//* 130  320:aload           4
		//* 131  322:invokeinterface #118 <Method boolean Iterator.hasNext()>
		//* 132  327:ifeq            355
		//* 133  330:aload           4
		//* 134  332:invokeinterface #122 <Method Object Iterator.next()>
		//* 135  337:checkcast       #124 <Class Report>
		//* 136  340:astore          5
		//* 137  342:aload_0         
		//* 138  343:getfield        #17  <Field ReportUploader this$0>
		//* 139  346:aload           5
		//* 140  348:invokevirtual   #135 <Method boolean ReportUploader.forceUpload(Report)>
		//* 141  351:pop             
		//* 142  352:goto            320
		//* 143  355:aload_0         
		//* 144  356:getfield        #17  <Field ReportUploader this$0>
		//* 145  359:invokevirtual   #78  <Method List ReportUploader.findReports()>
		//* 146  362:astore          5
		//* 147  364:aload           5
		//* 148  366:astore          4
		//* 149  368:aload           5
		//* 150  370:invokeinterface #93  <Method boolean List.isEmpty()>
		//* 151  375:ifne            228
		//* 152  378:invokestatic    #139 <Method short[] ReportUploader.access$200()>
		//* 153  381:iload_1         
		//* 154  382:invokestatic    #139 <Method short[] ReportUploader.access$200()>
		//* 155  385:arraylength     
		//* 156  386:iconst_1        
		//* 157  387:isub            
		//* 158  388:invokestatic    #145 <Method int Math.min(int, int)>
		//* 159  391:saload          
		//* 160  392:i2l             
		//* 161  393:lstore_2        
		//* 162  394:invokestatic    #34  <Method l c.g()>
		//* 163  397:astore          4
		//* 164  399:new             #36  <Class StringBuilder>
		//* 165  402:dup             
		//* 166  403:invokespecial   #37  <Method void StringBuilder()>
		//* 167  406:astore          6
		//* 168  408:aload           6
		//* 169  410:ldc1            #147 <String "Report submisson: scheduling delayed retry in ">
		//* 170  412:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
		//* 171  415:pop             
		//* 172  416:aload           6
		//* 173  418:lload_2         
		//* 174  419:invokevirtual   #150 <Method StringBuilder StringBuilder.append(long)>
		//* 175  422:pop             
		//* 176  423:aload           6
		//* 177  425:ldc1            #152 <String " seconds">
		//* 178  427:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
		//* 179  430:pop             
		//* 180  431:aload           4
		//* 181  433:ldc1            #50  <String "CrashlyticsCore">
		//* 182  435:aload           6
		//* 183  437:invokevirtual   #54  <Method String StringBuilder.toString()>
		//* 184  440:invokeinterface #60  <Method void l.a(String, String)>
		//* 185  445:lload_2         
		//* 186  446:ldc2w           #153 <Long 1000L>
		//* 187  449:lmul            
		//* 188  450:invokestatic    #67  <Method void Thread.sleep(long)>
		//* 189  453:iload_1         
		//* 190  454:iconst_1        
		//* 191  455:iadd            
		//* 192  456:istore_1        
		//* 193  457:aload           5
		//* 194  459:astore          4
		//* 195  461:goto            228
		//* 196  464:return          
				// Misplaced declaration of an exception variable
				catch(InterruptedException interruptedexception)
				{
					Thread.currentThread().interrupt();
					return;
				}
			obj = ((Object) (findReports()));
			if(handlingExceptionCheck.isHandlingException())
				return;
			if(!((List) (obj)).isEmpty() && !sendCheck.canSendReports())
			{
				l l2 = c.g();
				StringBuilder stringbuilder1 = new StringBuilder();
				stringbuilder1.append("User declined to send. Removing ");
				stringbuilder1.append(((List) (obj)).size());
				stringbuilder1.append(" Report(s).");
				l2.a("CrashlyticsCore", stringbuilder1.toString());
				for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((Report)((Iterator) (obj)).next()).remove());
				return;
			}
			i = 0;
_L2:
			long l1;
			Object obj1;
			if(((List) (obj)).isEmpty())
				break; /* Loop/switch isn't completed */
			if(handlingExceptionCheck.isHandlingException())
				return;
			obj1 = ((Object) (c.g()));
			StringBuilder stringbuilder2 = new StringBuilder();
			stringbuilder2.append("Attempting to send ");
			stringbuilder2.append(((List) (obj)).size());
			stringbuilder2.append(" report(s)");
			((l) (obj1)).a("CrashlyticsCore", stringbuilder2.toString());
			for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); forceUpload(((Report) (obj1))))
				obj1 = ((Object) ((Report)((Iterator) (obj)).next()));

			obj1 = ((Object) (findReports()));
			obj = obj1;
			if(((List) (obj1)).isEmpty())
				continue; /* Loop/switch isn't completed */
			l1 = ReportUploader.RETRY_INTERVALS[Math.min(i, ReportUploader.RETRY_INTERVALS.length - 1)];
			obj = ((Object) (c.g()));
			stringbuilder2 = new StringBuilder();
			stringbuilder2.append("Report submisson: scheduling delayed retry in ");
			stringbuilder2.append(l1);
			stringbuilder2.append(" seconds");
			((l) (obj)).a("CrashlyticsCore", stringbuilder2.toString());
			Thread.sleep(l1 * 1000L);
			i++;
			obj = obj1;
			if(true) goto _L2; else goto _L1
_L1:
			InterruptedException interruptedexception;
		//* 197  465:astore          4
		//* 198  467:goto            77
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
				c.g().e("CrashlyticsCore", "An unexpected error occurred while attempting to upload crash reports.", ((Throwable) (exception)));
		//    4    8:invokestatic    #34  <Method l c.g()>
		//    5   11:ldc1            #50  <String "CrashlyticsCore">
		//    6   13:ldc1            #161 <String "An unexpected error occurred while attempting to upload crash reports.">
		//    7   15:aload_1         
		//    8   16:invokeinterface #165 <Method void l.e(String, String, Throwable)>
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
		//    4    6:invokespecial   #20  <Method void h()>
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
		if(createreportspicall == null)
	//*   7   15:aload_2         
	//*   8   16:ifnonnull       29
		{
			throw new IllegalArgumentException("createReportCall must not be null.");
	//    9   19:new             #67  <Class IllegalArgumentException>
	//   10   22:dup             
	//   11   23:ldc1            #69  <String "createReportCall must not be null.">
	//   12   25:invokespecial   #72  <Method void IllegalArgumentException(String)>
	//   13   28:athrow          
		} else
		{
			createReportCall = createreportspicall;
	//   14   29:aload_0         
	//   15   30:aload_2         
	//   16   31:putfield        #74  <Field CreateReportSpiCall createReportCall>
			apiKey = s;
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:putfield        #76  <Field String apiKey>
			reportFilesProvider = reportfilesprovider;
	//   20   39:aload_0         
	//   21   40:aload_3         
	//   22   41:putfield        #78  <Field ReportUploader$ReportFilesProvider reportFilesProvider>
			handlingExceptionCheck = handlingexceptioncheck;
	//   23   44:aload_0         
	//   24   45:aload           4
	//   25   47:putfield        #80  <Field ReportUploader$HandlingExceptionCheck handlingExceptionCheck>
			return;
	//   26   50:return          
		}
	}

	List findReports()
	{
		c.g().a("CrashlyticsCore", "Checking for crash reports...");
	//    0    0:invokestatic    #96  <Method l c.g()>
	//    1    3:ldc1            #98  <String "CrashlyticsCore">
	//    2    5:ldc1            #100 <String "Checking for crash reports...">
	//    3    7:invokeinterface #106 <Method void l.a(String, String)>
		File afile[];
		File afile1[];
		File afile2[];
		synchronized(fileAccessLock)
	//*   4   12:aload_0         
	//*   5   13:getfield        #65  <Field Object fileAccessLock>
	//*   6   16:astore          5
	//*   7   18:aload           5
	//*   8   20:monitorenter    
		{
			afile2 = reportFilesProvider.getCompleteSessionFiles();
	//    9   21:aload_0         
	//   10   22:getfield        #78  <Field ReportUploader$ReportFilesProvider reportFilesProvider>
	//   11   25:invokeinterface #110 <Method File[] ReportUploader$ReportFilesProvider.getCompleteSessionFiles()>
	//   12   30:astore          7
			afile1 = reportFilesProvider.getInvalidSessionFiles();
	//   13   32:aload_0         
	//   14   33:getfield        #78  <Field ReportUploader$ReportFilesProvider reportFilesProvider>
	//   15   36:invokeinterface #113 <Method File[] ReportUploader$ReportFilesProvider.getInvalidSessionFiles()>
	//   16   41:astore          6
			afile = reportFilesProvider.getNativeReportFiles();
	//   17   43:aload_0         
	//   18   44:getfield        #78  <Field ReportUploader$ReportFilesProvider reportFilesProvider>
	//   19   47:invokeinterface #116 <Method File[] ReportUploader$ReportFilesProvider.getNativeReportFiles()>
	//   20   52:astore          4
		}
	//   21   54:aload           5
	//   22   56:monitorexit     
		obj = ((Object) (new LinkedList()));
	//   23   57:new             #118 <Class LinkedList>
	//   24   60:dup             
	//   25   61:invokespecial   #119 <Method void LinkedList()>
	//   26   64:astore          5
		boolean flag = false;
	//   27   66:iconst_0        
	//   28   67:istore_2        
		if(afile2 != null)
	//*  29   68:aload           7
	//*  30   70:ifnull          161
		{
			int i1 = afile2.length;
	//   31   73:aload           7
	//   32   75:arraylength     
	//   33   76:istore_3        
			for(int i = 0; i < i1; i++)
	//*  34   77:iconst_0        
	//*  35   78:istore_1        
	//*  36   79:iload_1         
	//*  37   80:iload_3         
	//*  38   81:icmpge          161
			{
				File file = afile2[i];
	//   39   84:aload           7
	//   40   86:iload_1         
	//   41   87:aaload          
	//   42   88:astore          8
				l l1 = c.g();
	//   43   90:invokestatic    #96  <Method l c.g()>
	//   44   93:astore          9
				StringBuilder stringbuilder = new StringBuilder();
	//   45   95:new             #121 <Class StringBuilder>
	//   46   98:dup             
	//   47   99:invokespecial   #122 <Method void StringBuilder()>
	//   48  102:astore          10
				stringbuilder.append("Found crash report ");
	//   49  104:aload           10
	//   50  106:ldc1            #124 <String "Found crash report ">
	//   51  108:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   52  111:pop             
				stringbuilder.append(file.getPath());
	//   53  112:aload           10
	//   54  114:aload           8
	//   55  116:invokevirtual   #134 <Method String File.getPath()>
	//   56  119:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   57  122:pop             
				l1.a("CrashlyticsCore", stringbuilder.toString());
	//   58  123:aload           9
	//   59  125:ldc1            #98  <String "CrashlyticsCore">
	//   60  127:aload           10
	//   61  129:invokevirtual   #137 <Method String StringBuilder.toString()>
	//   62  132:invokeinterface #106 <Method void l.a(String, String)>
				((List) (obj)).add(((Object) (new SessionReport(file))));
	//   63  137:aload           5
	//   64  139:new             #139 <Class SessionReport>
	//   65  142:dup             
	//   66  143:aload           8
	//   67  145:invokespecial   #142 <Method void SessionReport(File)>
	//   68  148:invokeinterface #148 <Method boolean List.add(Object)>
	//   69  153:pop             
			}

	//   70  154:iload_1         
	//   71  155:iconst_1        
	//   72  156:iadd            
	//   73  157:istore_1        
		}
	//*  74  158:goto            79
		HashMap hashmap = new HashMap();
	//   75  161:new             #150 <Class HashMap>
	//   76  164:dup             
	//   77  165:invokespecial   #151 <Method void HashMap()>
	//   78  168:astore          7
		if(afile1 != null)
	//*  79  170:aload           6
	//*  80  172:ifnull          255
		{
			int j1 = afile1.length;
	//   81  175:aload           6
	//   82  177:arraylength     
	//   83  178:istore_3        
			for(int j = 0; j < j1; j++)
	//*  84  179:iconst_0        
	//*  85  180:istore_1        
	//*  86  181:iload_1         
	//*  87  182:iload_3         
	//*  88  183:icmpge          255
			{
				File file1 = afile1[j];
	//   89  186:aload           6
	//   90  188:iload_1         
	//   91  189:aaload          
	//   92  190:astore          8
				String s1 = CrashlyticsController.getSessionIdFromSessionFile(file1);
	//   93  192:aload           8
	//   94  194:invokestatic    #157 <Method String CrashlyticsController.getSessionIdFromSessionFile(File)>
	//   95  197:astore          9
				if(!((Map) (hashmap)).containsKey(((Object) (s1))))
	//*  96  199:aload           7
	//*  97  201:aload           9
	//*  98  203:invokeinterface #162 <Method boolean Map.containsKey(Object)>
	//*  99  208:ifne            228
					((Map) (hashmap)).put(((Object) (s1)), ((Object) (new LinkedList())));
	//  100  211:aload           7
	//  101  213:aload           9
	//  102  215:new             #118 <Class LinkedList>
	//  103  218:dup             
	//  104  219:invokespecial   #119 <Method void LinkedList()>
	//  105  222:invokeinterface #166 <Method Object Map.put(Object, Object)>
	//  106  227:pop             
				((List)((Map) (hashmap)).get(((Object) (s1)))).add(((Object) (file1)));
	//  107  228:aload           7
	//  108  230:aload           9
	//  109  232:invokeinterface #170 <Method Object Map.get(Object)>
	//  110  237:checkcast       #144 <Class List>
	//  111  240:aload           8
	//  112  242:invokeinterface #148 <Method boolean List.add(Object)>
	//  113  247:pop             
			}

	//  114  248:iload_1         
	//  115  249:iconst_1        
	//  116  250:iadd            
	//  117  251:istore_1        
		}
	//* 118  252:goto            181
		String s;
		Object obj1;
		for(Iterator iterator = ((Map) (hashmap)).keySet().iterator(); iterator.hasNext(); ((List) (obj)).add(((Object) (new InvalidSessionReport(s, (File[])((List) (obj1)).toArray(((Object []) (new File[((List) (obj1)).size()]))))))))
	//* 119  255:aload           7
	//* 120  257:invokeinterface #174 <Method Set Map.keySet()>
	//* 121  262:invokeinterface #180 <Method Iterator Set.iterator()>
	//* 122  267:astore          6
	//* 123  269:aload           6
	//* 124  271:invokeinterface #186 <Method boolean Iterator.hasNext()>
	//* 125  276:ifeq            389
		{
			s = (String)iterator.next();
	//  126  279:aload           6
	//  127  281:invokeinterface #190 <Method Object Iterator.next()>
	//  128  286:checkcast       #192 <Class String>
	//  129  289:astore          8
			obj1 = ((Object) (c.g()));
	//  130  291:invokestatic    #96  <Method l c.g()>
	//  131  294:astore          9
			StringBuilder stringbuilder1 = new StringBuilder();
	//  132  296:new             #121 <Class StringBuilder>
	//  133  299:dup             
	//  134  300:invokespecial   #122 <Method void StringBuilder()>
	//  135  303:astore          10
			stringbuilder1.append("Found invalid session: ");
	//  136  305:aload           10
	//  137  307:ldc1            #194 <String "Found invalid session: ">
	//  138  309:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//  139  312:pop             
			stringbuilder1.append(s);
	//  140  313:aload           10
	//  141  315:aload           8
	//  142  317:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//  143  320:pop             
			((l) (obj1)).a("CrashlyticsCore", stringbuilder1.toString());
	//  144  321:aload           9
	//  145  323:ldc1            #98  <String "CrashlyticsCore">
	//  146  325:aload           10
	//  147  327:invokevirtual   #137 <Method String StringBuilder.toString()>
	//  148  330:invokeinterface #106 <Method void l.a(String, String)>
			obj1 = ((Object) ((List)((Map) (hashmap)).get(((Object) (s)))));
	//  149  335:aload           7
	//  150  337:aload           8
	//  151  339:invokeinterface #170 <Method Object Map.get(Object)>
	//  152  344:checkcast       #144 <Class List>
	//  153  347:astore          9
		}

	//  154  349:aload           5
	//  155  351:new             #196 <Class InvalidSessionReport>
	//  156  354:dup             
	//  157  355:aload           8
	//  158  357:aload           9
	//  159  359:aload           9
	//  160  361:invokeinterface #200 <Method int List.size()>
	//  161  366:anewarray       File[]
	//  162  369:invokeinterface #204 <Method Object[] List.toArray(Object[])>
	//  163  374:checkcast       #206 <Class File[]>
	//  164  377:invokespecial   #209 <Method void InvalidSessionReport(String, File[])>
	//  165  380:invokeinterface #148 <Method boolean List.add(Object)>
	//  166  385:pop             
	//* 167  386:goto            269
		if(afile != null)
	//* 168  389:aload           4
	//* 169  391:ifnull          431
		{
			int k1 = afile.length;
	//  170  394:aload           4
	//  171  396:arraylength     
	//  172  397:istore_3        
			for(int k = ((int) (flag)); k < k1; k++)
	//* 173  398:iload_2         
	//* 174  399:istore_1        
	//* 175  400:iload_1         
	//* 176  401:iload_3         
	//* 177  402:icmpge          431
				((List) (obj)).add(((Object) (new NativeSessionReport(afile[k]))));
	//  178  405:aload           5
	//  179  407:new             #211 <Class NativeSessionReport>
	//  180  410:dup             
	//  181  411:aload           4
	//  182  413:iload_1         
	//  183  414:aaload          
	//  184  415:invokespecial   #212 <Method void NativeSessionReport(File)>
	//  185  418:invokeinterface #148 <Method boolean List.add(Object)>
	//  186  423:pop             

	//  187  424:iload_1         
	//  188  425:iconst_1        
	//  189  426:iadd            
	//  190  427:istore_1        
		}
	//* 191  428:goto            400
		if(((List) (obj)).isEmpty())
	//* 192  431:aload           5
	//* 193  433:invokeinterface #215 <Method boolean List.isEmpty()>
	//* 194  438:ifeq            453
			c.g().a("CrashlyticsCore", "No reports found.");
	//  195  441:invokestatic    #96  <Method l c.g()>
	//  196  444:ldc1            #98  <String "CrashlyticsCore">
	//  197  446:ldc1            #217 <String "No reports found.">
	//  198  448:invokeinterface #106 <Method void l.a(String, String)>
		return ((List) (obj));
	//  199  453:aload           5
	//  200  455:areturn         
		exception;
	//  201  456:astore          4
		obj;
	//  202  458:aload           5
		JVM INSTR monitorexit ;
	//  203  460:monitorexit     
		throw exception;
	//  204  461:aload           4
	//  205  463:athrow          
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
		l l1;
		StringBuilder stringbuilder;
		CreateReportRequest createreportrequest = new CreateReportRequest(apiKey, report);
	//    7   11:new             #225 <Class CreateReportRequest>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:getfield        #76  <Field String apiKey>
	//   11   19:aload_1         
	//   12   20:invokespecial   #228 <Method void CreateReportRequest(String, Report)>
	//   13   23:astore          5
		flag2 = createReportCall.invoke(createreportrequest);
	//   14   25:aload_0         
	//   15   26:getfield        #74  <Field CreateReportSpiCall createReportCall>
	//   16   29:aload           5
	//   17   31:invokeinterface #234 <Method boolean CreateReportSpiCall.invoke(CreateReportRequest)>
	//   18   36:istore          4
		l1 = c.g();
	//   19   38:invokestatic    #96  <Method l c.g()>
	//   20   41:astore          7
		stringbuilder = new StringBuilder();
	//   21   43:new             #121 <Class StringBuilder>
	//   22   46:dup             
	//   23   47:invokespecial   #122 <Method void StringBuilder()>
	//   24   50:astore          8
		stringbuilder.append("Crashlytics report upload ");
	//   25   52:aload           8
	//   26   54:ldc1            #236 <String "Crashlytics report upload ">
	//   27   56:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   28   59:pop             
		boolean flag;
		Object obj;
		if(flag2)
	//*  29   60:iload           4
	//*  30   62:ifeq            187
			obj = "complete: ";
	//   31   65:ldc1            #238 <String "complete: ">
	//   32   67:astore          5
		else
	//*  33   69:goto            72
	//*  34   72:aload           8
	//*  35   74:aload           5
	//*  36   76:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//*  37   79:pop             
	//*  38   80:aload           8
	//*  39   82:aload_1         
	//*  40   83:invokeinterface #243 <Method String Report.getIdentifier()>
	//*  41   88:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//*  42   91:pop             
	//*  43   92:aload           7
	//*  44   94:ldc1            #98  <String "CrashlyticsCore">
	//*  45   96:aload           8
	//*  46   98:invokevirtual   #137 <Method String StringBuilder.toString()>
	//*  47  101:invokeinterface #246 <Method void l.c(String, String)>
	//*  48  106:iload_3         
	//*  49  107:istore_2        
	//*  50  108:iload           4
	//*  51  110:ifeq            177
	//*  52  113:aload_1         
	//*  53  114:invokeinterface #249 <Method void Report.remove()>
	//*  54  119:iconst_1        
	//*  55  120:istore_2        
	//*  56  121:goto            177
	//*  57  124:astore_1        
	//*  58  125:goto            182
	//*  59  128:astore          5
	//*  60  130:invokestatic    #96  <Method l c.g()>
	//*  61  133:astore          7
	//*  62  135:new             #121 <Class StringBuilder>
	//*  63  138:dup             
	//*  64  139:invokespecial   #122 <Method void StringBuilder()>
	//*  65  142:astore          8
	//*  66  144:aload           8
	//*  67  146:ldc1            #251 <String "Error occurred sending report ">
	//*  68  148:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//*  69  151:pop             
	//*  70  152:aload           8
	//*  71  154:aload_1         
	//*  72  155:invokevirtual   #254 <Method StringBuilder StringBuilder.append(Object)>
	//*  73  158:pop             
	//*  74  159:aload           7
	//*  75  161:ldc1            #98  <String "CrashlyticsCore">
	//*  76  163:aload           8
	//*  77  165:invokevirtual   #137 <Method String StringBuilder.toString()>
	//*  78  168:aload           5
	//*  79  170:invokeinterface #258 <Method void l.e(String, String, Throwable)>
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
	//   90  187:ldc2            #260 <String "FAILED: ">
	//   91  190:astore          5
		stringbuilder.append(((String) (obj)));
		stringbuilder.append(report.getIdentifier());
		l1.c("CrashlyticsCore", stringbuilder.toString());
		flag = flag1;
		if(!flag2)
			break MISSING_BLOCK_LABEL_177;
		report.remove();
		flag = true;
		break MISSING_BLOCK_LABEL_177;
		report;
		break MISSING_BLOCK_LABEL_182;
		obj;
		l l2 = c.g();
		StringBuilder stringbuilder1 = new StringBuilder();
		stringbuilder1.append("Error occurred sending report ");
		stringbuilder1.append(((Object) (report)));
		l2.e("CrashlyticsCore", stringbuilder1.toString(), ((Throwable) (obj)));
		flag = flag1;
		obj1;
		JVM INSTR monitorexit ;
		return flag;
		obj1;
		JVM INSTR monitorexit ;
		throw report;
	//*  92  192:goto            72
	}

	boolean isUploading()
	{
		return uploadThread != null;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field Thread uploadThread>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
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
		c.g().a("CrashlyticsCore", "Report upload has already been started.");
	//    5    9:invokestatic    #96  <Method l c.g()>
	//    6   12:ldc1            #98  <String "CrashlyticsCore">
	//    7   14:ldc2            #265 <String "Report upload has already been started.">
	//    8   17:invokeinterface #106 <Method void l.a(String, String)>
		this;
	//    9   22:aload_0         
		JVM INSTR monitorexit ;
	//   10   23:monitorexit     
		return;
	//   11   24:return          
		uploadThread = new Thread(((Runnable) (new Worker(f, sendcheck))), "Crashlytics Report Uploader");
	//   12   25:aload_0         
	//   13   26:new             #267 <Class Thread>
	//   14   29:dup             
	//   15   30:new             #18  <Class ReportUploader$Worker>
	//   16   33:dup             
	//   17   34:aload_0         
	//   18   35:fload_1         
	//   19   36:aload_2         
	//   20   37:invokespecial   #270 <Method void ReportUploader$Worker(ReportUploader, float, ReportUploader$SendCheck)>
	//   21   40:ldc2            #272 <String "Crashlytics Report Uploader">
	//   22   43:invokespecial   #275 <Method void Thread(Runnable, String)>
	//   23   46:putfield        #84  <Field Thread uploadThread>
		uploadThread.start();
	//   24   49:aload_0         
	//   25   50:getfield        #84  <Field Thread uploadThread>
	//   26   53:invokevirtual   #278 <Method void Thread.start()>
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
	//    1    1:getfield        #80  <Field ReportUploader$HandlingExceptionCheck handlingExceptionCheck>
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
