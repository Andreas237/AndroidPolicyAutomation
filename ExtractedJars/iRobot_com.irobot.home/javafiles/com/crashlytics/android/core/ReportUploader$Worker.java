// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import b.a.a.a.a.b.h;
import b.a.a.a.c;
import b.a.a.a.l;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.crashlytics.android.core:
//			ReportUploader, Report

private class ReportUploader$Worker extends h
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
		if(ReportUploader.access$100(ReportUploader.this).isHandlingException())
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
		if(ReportUploader.access$100(ReportUploader.this).isHandlingException())
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
		l1 = ReportUploader.access$200()[Math.min(i, ReportUploader.access$200().length - 1)];
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
	//    4    6:invokespecial   #20  <Method void h()>
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
