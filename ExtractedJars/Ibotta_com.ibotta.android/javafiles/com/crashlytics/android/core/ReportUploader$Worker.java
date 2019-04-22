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
//			ReportUploader, Report

private class ReportUploader$Worker extends BackgroundPriorityRunnable
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
		if(ReportUploader.access$100(ReportUploader.this).isHandlingException())
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
			if(ReportUploader.access$100(ReportUploader.this).isHandlingException())
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
			long l1 = ReportUploader.access$200()[Math.min(i, ReportUploader.access$200().length - 1)];
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
		ReportUploader.access$002(ReportUploader.this, ((Thread) (null)));
	//    9   21:aload_0         
	//   10   22:getfield        #17  <Field ReportUploader this$0>
	//   11   25:aconst_null     
	//   12   26:invokestatic    #169 <Method Thread ReportUploader.access$002(ReportUploader, Thread)>
	//   13   29:pop             
	//   14   30:return          
	}

	private final float delay;
	private final ck sendCheck;
	final ReportUploader this$0;

	ReportUploader$Worker(float f, ck ck)
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
		sendCheck = ck;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #24  <Field ReportUploader$SendCheck sendCheck>
	//   11   19:return          
	}
}
