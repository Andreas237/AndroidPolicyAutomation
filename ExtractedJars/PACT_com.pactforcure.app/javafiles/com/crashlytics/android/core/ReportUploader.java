// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.BackgroundPriorityRunnable;
import java.io.File;
import java.io.FilenameFilter;
import java.util.*;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsCore, CrashlyticsUncaughtExceptionHandler, SessionReport, InvalidSessionReport, 
//			CreateReportRequest, CreateReportSpiCall, Report

class ReportUploader
{
	private class Worker extends BackgroundPriorityRunnable
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
					long l = ReportUploader.RETRY_INTERVALS[Math.min(i, ReportUploader.RETRY_INTERVALS.length - 1)];
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
			uploadThread = null;
		//*  14   28:goto            4
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


	public ReportUploader(String s, CreateReportSpiCall createreportspicall)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #57  <Method void Object()>
	//    6   12:putfield        #59  <Field Object fileAccessLock>
		if(createreportspicall == null)
	//*   7   15:aload_2         
	//*   8   16:ifnonnull       29
		{
			throw new IllegalArgumentException("createReportCall must not be null.");
	//    9   19:new             #61  <Class IllegalArgumentException>
	//   10   22:dup             
	//   11   23:ldc1            #63  <String "createReportCall must not be null.">
	//   12   25:invokespecial   #66  <Method void IllegalArgumentException(String)>
	//   13   28:athrow          
		} else
		{
			createReportCall = createreportspicall;
	//   14   29:aload_0         
	//   15   30:aload_2         
	//   16   31:putfield        #68  <Field CreateReportSpiCall createReportCall>
			apiKey = s;
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:putfield        #70  <Field String apiKey>
			return;
	//   20   39:return          
		}
	}

	List findReports()
	{
		Fabric.getLogger().d("CrashlyticsCore", "Checking for crash reports...");
	//    0    0:invokestatic    #84  <Method Logger Fabric.getLogger()>
	//    1    3:ldc1            #86  <String "CrashlyticsCore">
	//    2    5:ldc1            #88  <String "Checking for crash reports...">
	//    3    7:invokeinterface #94  <Method void Logger.d(String, String)>
		CrashlyticsCore crashlyticscore = CrashlyticsCore.getInstance();
	//    4   12:invokestatic    #100 <Method CrashlyticsCore CrashlyticsCore.getInstance()>
	//    5   15:astore          5
		CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler = crashlyticscore.getHandler();
	//    6   17:aload           5
	//    7   19:invokevirtual   #104 <Method CrashlyticsUncaughtExceptionHandler CrashlyticsCore.getHandler()>
	//    8   22:astore          4
		File afile[];
		synchronized(fileAccessLock)
	//*   9   24:aload_0         
	//*  10   25:getfield        #59  <Field Object fileAccessLock>
	//*  11   28:astore_3        
	//*  12   29:aload_3         
	//*  13   30:monitorenter    
		{
			afile = crashlyticscore.getSdkDirectory().listFiles(crashFileFilter);
	//   14   31:aload           5
	//   15   33:invokevirtual   #108 <Method File CrashlyticsCore.getSdkDirectory()>
	//   16   36:getstatic       #34  <Field FilenameFilter crashFileFilter>
	//   17   39:invokevirtual   #114 <Method File[] File.listFiles(FilenameFilter)>
	//   18   42:astore          5
			obj1 = ((Object) (crashlyticsuncaughtexceptionhandler.getInvalidFilesDir().listFiles()));
	//   19   44:aload           4
	//   20   46:invokevirtual   #119 <Method File CrashlyticsUncaughtExceptionHandler.getInvalidFilesDir()>
	//   21   49:invokevirtual   #122 <Method File[] File.listFiles()>
	//   22   52:astore          4
		}
	//   23   54:aload_3         
	//   24   55:monitorexit     
		obj = ((Object) (new LinkedList()));
	//   25   56:new             #124 <Class LinkedList>
	//   26   59:dup             
	//   27   60:invokespecial   #125 <Method void LinkedList()>
	//   28   63:astore_3        
		int k = afile.length;
	//   29   64:aload           5
	//   30   66:arraylength     
	//   31   67:istore_2        
		for(int i = 0; i < k; i++)
	//*  32   68:iconst_0        
	//*  33   69:istore_1        
	//*  34   70:iload_1         
	//*  35   71:iload_2         
	//*  36   72:icmpge          144
		{
			File file = afile[i];
	//   37   75:aload           5
	//   38   77:iload_1         
	//   39   78:aaload          
	//   40   79:astore          6
			Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Found crash report ").append(file.getPath()).toString());
	//   41   81:invokestatic    #84  <Method Logger Fabric.getLogger()>
	//   42   84:ldc1            #86  <String "CrashlyticsCore">
	//   43   86:new             #127 <Class StringBuilder>
	//   44   89:dup             
	//   45   90:invokespecial   #128 <Method void StringBuilder()>
	//   46   93:ldc1            #130 <String "Found crash report ">
	//   47   95:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   48   98:aload           6
	//   49  100:invokevirtual   #138 <Method String File.getPath()>
	//   50  103:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   51  106:invokevirtual   #141 <Method String StringBuilder.toString()>
	//   52  109:invokeinterface #94  <Method void Logger.d(String, String)>
			((List) (obj)).add(((Object) (new SessionReport(file))));
	//   53  114:aload_3         
	//   54  115:new             #143 <Class SessionReport>
	//   55  118:dup             
	//   56  119:aload           6
	//   57  121:invokespecial   #146 <Method void SessionReport(File)>
	//   58  124:invokeinterface #152 <Method boolean List.add(Object)>
	//   59  129:pop             
		}

	//   60  130:iload_1         
	//   61  131:iconst_1        
	//   62  132:iadd            
	//   63  133:istore_1        
		break MISSING_BLOCK_LABEL_144;
	//   64  134:goto            70
		obj1;
	//   65  137:astore          4
		obj;
	//   66  139:aload_3         
		JVM INSTR monitorexit ;
	//   67  140:monitorexit     
		throw obj1;
	//   68  141:aload           4
	//   69  143:athrow          
		HashMap hashmap = new HashMap();
	//   70  144:new             #154 <Class HashMap>
	//   71  147:dup             
	//   72  148:invokespecial   #155 <Method void HashMap()>
	//   73  151:astore          5
		if(obj1 != null)
	//*  74  153:aload           4
	//*  75  155:ifnull          238
		{
			int l = obj1.length;
	//   76  158:aload           4
	//   77  160:arraylength     
	//   78  161:istore_2        
			for(int j = 0; j < l; j++)
	//*  79  162:iconst_0        
	//*  80  163:istore_1        
	//*  81  164:iload_1         
	//*  82  165:iload_2         
	//*  83  166:icmpge          238
			{
				File file1 = obj1[j];
	//   84  169:aload           4
	//   85  171:iload_1         
	//   86  172:aaload          
	//   87  173:astore          6
				String s1 = CrashlyticsUncaughtExceptionHandler.getSessionIdFromSessionFile(file1);
	//   88  175:aload           6
	//   89  177:invokestatic    #159 <Method String CrashlyticsUncaughtExceptionHandler.getSessionIdFromSessionFile(File)>
	//   90  180:astore          7
				if(!((Map) (hashmap)).containsKey(((Object) (s1))))
	//*  91  182:aload           5
	//*  92  184:aload           7
	//*  93  186:invokeinterface #164 <Method boolean Map.containsKey(Object)>
	//*  94  191:ifne            211
					((Map) (hashmap)).put(((Object) (s1)), ((Object) (new LinkedList())));
	//   95  194:aload           5
	//   96  196:aload           7
	//   97  198:new             #124 <Class LinkedList>
	//   98  201:dup             
	//   99  202:invokespecial   #125 <Method void LinkedList()>
	//  100  205:invokeinterface #168 <Method Object Map.put(Object, Object)>
	//  101  210:pop             
				((List)((Map) (hashmap)).get(((Object) (s1)))).add(((Object) (file1)));
	//  102  211:aload           5
	//  103  213:aload           7
	//  104  215:invokeinterface #172 <Method Object Map.get(Object)>
	//  105  220:checkcast       #148 <Class List>
	//  106  223:aload           6
	//  107  225:invokeinterface #152 <Method boolean List.add(Object)>
	//  108  230:pop             
			}

	//  109  231:iload_1         
	//  110  232:iconst_1        
	//  111  233:iadd            
	//  112  234:istore_1        
		}
	//* 113  235:goto            164
		String s;
		List list;
		for(Iterator iterator = ((Map) (hashmap)).keySet().iterator(); iterator.hasNext(); ((List) (obj)).add(((Object) (new InvalidSessionReport(s, (File[])list.toArray(((Object []) (new File[list.size()]))))))))
	//* 114  238:aload           5
	//* 115  240:invokeinterface #176 <Method Set Map.keySet()>
	//* 116  245:invokeinterface #182 <Method Iterator Set.iterator()>
	//* 117  250:astore          4
	//* 118  252:aload           4
	//* 119  254:invokeinterface #188 <Method boolean Iterator.hasNext()>
	//* 120  259:ifeq            357
		{
			s = (String)iterator.next();
	//  121  262:aload           4
	//  122  264:invokeinterface #192 <Method Object Iterator.next()>
	//  123  269:checkcast       #194 <Class String>
	//  124  272:astore          6
			Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Found invalid session: ").append(s).toString());
	//  125  274:invokestatic    #84  <Method Logger Fabric.getLogger()>
	//  126  277:ldc1            #86  <String "CrashlyticsCore">
	//  127  279:new             #127 <Class StringBuilder>
	//  128  282:dup             
	//  129  283:invokespecial   #128 <Method void StringBuilder()>
	//  130  286:ldc1            #196 <String "Found invalid session: ">
	//  131  288:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//  132  291:aload           6
	//  133  293:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//  134  296:invokevirtual   #141 <Method String StringBuilder.toString()>
	//  135  299:invokeinterface #94  <Method void Logger.d(String, String)>
			list = (List)((Map) (hashmap)).get(((Object) (s)));
	//  136  304:aload           5
	//  137  306:aload           6
	//  138  308:invokeinterface #172 <Method Object Map.get(Object)>
	//  139  313:checkcast       #148 <Class List>
	//  140  316:astore          7
		}

	//  141  318:aload_3         
	//  142  319:new             #198 <Class InvalidSessionReport>
	//  143  322:dup             
	//  144  323:aload           6
	//  145  325:aload           7
	//  146  327:aload           7
	//  147  329:invokeinterface #202 <Method int List.size()>
	//  148  334:anewarray       File[]
	//  149  337:invokeinterface #206 <Method Object[] List.toArray(Object[])>
	//  150  342:checkcast       #208 <Class File[]>
	//  151  345:invokespecial   #211 <Method void InvalidSessionReport(String, File[])>
	//  152  348:invokeinterface #152 <Method boolean List.add(Object)>
	//  153  353:pop             
	//* 154  354:goto            252
		if(((List) (obj)).isEmpty())
	//* 155  357:aload_3         
	//* 156  358:invokeinterface #214 <Method boolean List.isEmpty()>
	//* 157  363:ifeq            378
			Fabric.getLogger().d("CrashlyticsCore", "No reports found.");
	//  158  366:invokestatic    #84  <Method Logger Fabric.getLogger()>
	//  159  369:ldc1            #86  <String "CrashlyticsCore">
	//  160  371:ldc1            #216 <String "No reports found.">
	//  161  373:invokeinterface #94  <Method void Logger.d(String, String)>
		return ((List) (obj));
	//  162  378:aload_3         
	//  163  379:areturn         
	}

	boolean forceUpload(Report report)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		Object obj = fileAccessLock;
	//    2    2:aload_0         
	//    3    3:getfield        #59  <Field Object fileAccessLock>
	//    4    6:astore          6
		obj;
	//    5    8:aload           6
		JVM INSTR monitorenter ;
	//    6   10:monitorenter    
		boolean flag2;
		Logger logger;
		StringBuilder stringbuilder;
		CreateReportRequest createreportrequest = new CreateReportRequest(apiKey, report);
	//    7   11:new             #224 <Class CreateReportRequest>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:getfield        #70  <Field String apiKey>
	//   11   19:aload_1         
	//   12   20:invokespecial   #227 <Method void CreateReportRequest(String, Report)>
	//   13   23:astore          5
		flag2 = createReportCall.invoke(createreportrequest);
	//   14   25:aload_0         
	//   15   26:getfield        #68  <Field CreateReportSpiCall createReportCall>
	//   16   29:aload           5
	//   17   31:invokeinterface #233 <Method boolean CreateReportSpiCall.invoke(CreateReportRequest)>
	//   18   36:istore          4
		logger = Fabric.getLogger();
	//   19   38:invokestatic    #84  <Method Logger Fabric.getLogger()>
	//   20   41:astore          7
		stringbuilder = (new StringBuilder()).append("Crashlytics report upload ");
	//   21   43:new             #127 <Class StringBuilder>
	//   22   46:dup             
	//   23   47:invokespecial   #128 <Method void StringBuilder()>
	//   24   50:ldc1            #235 <String "Crashlytics report upload ">
	//   25   52:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   26   55:astore          8
		boolean flag;
		String s;
		if(flag2)
	//*  27   57:iload           4
	//*  28   59:ifeq            114
			s = "complete: ";
	//   29   62:ldc1            #237 <String "complete: ">
	//   30   64:astore          5
		else
	//*  31   66:aload           7
	//*  32   68:ldc1            #86  <String "CrashlyticsCore">
	//*  33   70:aload           8
	//*  34   72:aload           5
	//*  35   74:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//*  36   77:aload_1         
	//*  37   78:invokeinterface #242 <Method String Report.getIdentifier()>
	//*  38   83:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//*  39   86:invokevirtual   #141 <Method String StringBuilder.toString()>
	//*  40   89:invokeinterface #245 <Method void Logger.i(String, String)>
	//*  41   94:iload_3         
	//*  42   95:istore_2        
	//*  43   96:iload           4
	//*  44   98:ifeq            109
	//*  45  101:aload_1         
	//*  46  102:invokeinterface #248 <Method void Report.remove()>
	//*  47  107:iconst_1        
	//*  48  108:istore_2        
	//*  49  109:aload           6
	//*  50  111:monitorexit     
	//*  51  112:iload_2         
	//*  52  113:ireturn         
			s = "FAILED: ";
	//   53  114:ldc1            #250 <String "FAILED: ">
	//   54  116:astore          5
		logger.i("CrashlyticsCore", stringbuilder.append(s).append(report.getIdentifier()).toString());
		flag = flag1;
		if(!flag2)
			break MISSING_BLOCK_LABEL_109;
		report.remove();
		flag = true;
_L2:
		obj;
		JVM INSTR monitorexit ;
		return flag;
	//*  55  118:goto            66
		Exception exception;
		exception;
	//   56  121:astore          5
		Fabric.getLogger().e("CrashlyticsCore", (new StringBuilder()).append("Error occurred sending report ").append(((Object) (report))).toString(), ((Throwable) (exception)));
	//   57  123:invokestatic    #84  <Method Logger Fabric.getLogger()>
	//   58  126:ldc1            #86  <String "CrashlyticsCore">
	//   59  128:new             #127 <Class StringBuilder>
	//   60  131:dup             
	//   61  132:invokespecial   #128 <Method void StringBuilder()>
	//   62  135:ldc1            #252 <String "Error occurred sending report ">
	//   63  137:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   64  140:aload_1         
	//   65  141:invokevirtual   #255 <Method StringBuilder StringBuilder.append(Object)>
	//   66  144:invokevirtual   #141 <Method String StringBuilder.toString()>
	//   67  147:aload           5
	//   68  149:invokeinterface #259 <Method void Logger.e(String, String, Throwable)>
		flag = flag1;
	//   69  154:iload_3         
	//   70  155:istore_2        
		if(true) goto _L2; else goto _L1
	//   71  156:goto            109
_L1:
		report;
	//   72  159:astore_1        
		obj;
	//   73  160:aload           6
		JVM INSTR monitorexit ;
	//   74  162:monitorexit     
		throw report;
	//   75  163:aload_1         
	//   76  164:athrow          
	}

	boolean isUploading()
	{
		return uploadThread != null;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field Thread uploadThread>
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
	//    2    2:invokevirtual   #264 <Method void uploadReports(float)>
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
	//*   3    3:getfield        #74  <Field Thread uploadThread>
	//*   4    6:ifnonnull       39
		{
			uploadThread = new Thread(((Runnable) (new Worker(f))), "Crashlytics Report Uploader");
	//    5    9:aload_0         
	//    6   10:new             #266 <Class Thread>
	//    7   13:dup             
	//    8   14:new             #8   <Class ReportUploader$Worker>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:fload_1         
	//   12   20:invokespecial   #269 <Method void ReportUploader$Worker(ReportUploader, float)>
	//   13   23:ldc2            #271 <String "Crashlytics Report Uploader">
	//   14   26:invokespecial   #274 <Method void Thread(Runnable, String)>
	//   15   29:putfield        #74  <Field Thread uploadThread>
			uploadThread.start();
	//   16   32:aload_0         
	//   17   33:getfield        #74  <Field Thread uploadThread>
	//   18   36:invokevirtual   #277 <Method void Thread.start()>
		}
		this;
	//   19   39:aload_0         
		JVM INSTR monitorexit ;
	//   20   40:monitorexit     
		return;
	//   21   41:return          
		Exception exception;
		exception;
	//   22   42:astore_2        
	//*  23   43:aload_0         
		throw exception;
	//   24   44:monitorexit     
	//   25   45:aload_2         
	//   26   46:athrow          
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
	private final String apiKey;
	private final CreateReportSpiCall createReportCall;
	private final Object fileAccessLock = new Object();
	private Thread uploadThread;

	static 
	{
	//    0    0:new             #6   <Class ReportUploader$1>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void ReportUploader$1()>
	//    3    7:putstatic       #34  <Field FilenameFilter crashFileFilter>
	//    4   10:ldc1            #36  <String "X-CRASHLYTICS-INVALID-SESSION">
	//    5   12:ldc1            #38  <String "1">
	//    6   14:invokestatic    #44  <Method Map Collections.singletonMap(Object, Object)>
	//    7   17:putstatic       #46  <Field Map HEADER_INVALID_CLS_FILE>
	//    8   20:bipush          6
	//    9   22:newarray        short[]
	//   10   24:dup             
	//   11   25:iconst_0        
	//   12   26:ldc1            #47  <Int 10>
	//   13   28:sastore         
	//   14   29:dup             
	//   15   30:iconst_1        
	//   16   31:ldc1            #48  <Int 20>
	//   17   33:sastore         
	//   18   34:dup             
	//   19   35:iconst_2        
	//   20   36:ldc1            #49  <Int 30>
	//   21   38:sastore         
	//   22   39:dup             
	//   23   40:iconst_3        
	//   24   41:ldc1            #50  <Int 60>
	//   25   43:sastore         
	//   26   44:dup             
	//   27   45:iconst_4        
	//   28   46:ldc1            #51  <Int 120>
	//   29   48:sastore         
	//   30   49:dup             
	//   31   50:iconst_5        
	//   32   51:ldc1            #52  <Int 300>
	//   33   53:sastore         
	//   34   54:putstatic       #54  <Field short[] RETRY_INTERVALS>
	//*  35   57:return          
	}


/*
	static Thread access$002(ReportUploader reportuploader, Thread thread)
	{
		reportuploader.uploadThread = thread;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #74  <Field Thread uploadThread>
		return thread;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static short[] access$100()
	{
		return RETRY_INTERVALS;
	//    0    0:getstatic       #54  <Field short[] RETRY_INTERVALS>
	//    1    3:areturn         
	}

*/
}
