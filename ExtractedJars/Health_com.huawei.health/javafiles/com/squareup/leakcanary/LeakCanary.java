// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.squareup.leakcanary;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.format.Formatter;
import android.util.Log;
import com.squareup.leakcanary.internal.DisplayLeakActivity;
import com.squareup.leakcanary.internal.HeapAnalyzerService;
import com.squareup.leakcanary.internal.LeakCanaryInternals;

// Referenced classes of package com.squareup.leakcanary:
//			DisplayLeakService, AndroidRefWatcherBuilder, AndroidExcludedRefs, AnalysisResult, 
//			HeapDump, LeakTrace, RefWatcher, LeakDirectoryProvider

public final class LeakCanary
{

	private LeakCanary()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
		throw new AssertionError();
	//    2    4:new             #10  <Class AssertionError>
	//    3    7:dup             
	//    4    8:invokespecial   #11  <Method void AssertionError()>
	//    5   11:athrow          
	}

	public static void enableDisplayLeakActivity(Context context)
	{
		LeakCanaryInternals.setEnabled(context, com/squareup/leakcanary/internal/DisplayLeakActivity, true);
	//    0    0:aload_0         
	//    1    1:ldc1            #16  <Class DisplayLeakActivity>
	//    2    3:iconst_1        
	//    3    4:invokestatic    #22  <Method void LeakCanaryInternals.setEnabled(Context, Class, boolean)>
	//    4    7:return          
	}

	public static RefWatcher install(Application application)
	{
		return ((AndroidRefWatcherBuilder)refWatcher(((Context) (application))).listenerServiceClass(com/squareup/leakcanary/DisplayLeakService).excludedRefs(AndroidExcludedRefs.createAppDefaults().build())).buildAndInstall();
	//    0    0:aload_0         
	//    1    1:invokestatic    #28  <Method AndroidRefWatcherBuilder refWatcher(Context)>
	//    2    4:ldc1            #30  <Class DisplayLeakService>
	//    3    6:invokevirtual   #36  <Method AndroidRefWatcherBuilder AndroidRefWatcherBuilder.listenerServiceClass(Class)>
	//    4    9:invokestatic    #42  <Method ExcludedRefs$Builder AndroidExcludedRefs.createAppDefaults()>
	//    5   12:invokeinterface #48  <Method ExcludedRefs ExcludedRefs$Builder.build()>
	//    6   17:invokevirtual   #52  <Method RefWatcherBuilder AndroidRefWatcherBuilder.excludedRefs(ExcludedRefs)>
	//    7   20:checkcast       #32  <Class AndroidRefWatcherBuilder>
	//    8   23:invokevirtual   #56  <Method RefWatcher AndroidRefWatcherBuilder.buildAndInstall()>
	//    9   26:areturn         
	}

	public static boolean isInAnalyzerProcess(Context context)
	{
		return LeakCanaryInternals.isInServiceProcess(context, com/squareup/leakcanary/internal/HeapAnalyzerService);
	//    0    0:aload_0         
	//    1    1:ldc1            #60  <Class HeapAnalyzerService>
	//    2    3:invokestatic    #64  <Method boolean LeakCanaryInternals.isInServiceProcess(Context, Class)>
	//    3    6:ireturn         
	}

	public static String leakInfo(Context context, HeapDump heapdump, AnalysisResult analysisresult, boolean flag)
	{
		Object obj = ((Object) (context.getPackageManager()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #74  <Method PackageManager Context.getPackageManager()>
	//    2    4:astore          6
		String s = context.getPackageName();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #78  <Method String Context.getPackageName()>
	//    5   10:astore          5
		try
		{
			obj = ((Object) (((PackageManager) (obj)).getPackageInfo(s, 0)));
	//    6   12:aload           6
	//    7   14:aload           5
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #84  <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   10   20:astore          6
		}
	//*  11   22:goto            35
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  12   25:astore_0        
		{
			throw new RuntimeException(((Throwable) (context)));
	//   13   26:new             #86  <Class RuntimeException>
	//   14   29:dup             
	//   15   30:aload_0         
	//   16   31:invokespecial   #89  <Method void RuntimeException(Throwable)>
	//   17   34:athrow          
		}
		String s1 = ((PackageInfo) (obj)).versionName;
	//   18   35:aload           6
	//   19   37:getfield        #95  <Field String PackageInfo.versionName>
	//   20   40:astore          7
		int i = ((PackageInfo) (obj)).versionCode;
	//   21   42:aload           6
	//   22   44:getfield        #99  <Field int PackageInfo.versionCode>
	//   23   47:istore          4
		s1 = (new StringBuilder()).append("In ").append(s).append(":").append(s1).append(":").append(i).append(".\n").toString();
	//   24   49:new             #101 <Class StringBuilder>
	//   25   52:dup             
	//   26   53:invokespecial   #102 <Method void StringBuilder()>
	//   27   56:ldc1            #104 <String "In ">
	//   28   58:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   29   61:aload           5
	//   30   63:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   31   66:ldc1            #110 <String ":">
	//   32   68:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   33   71:aload           7
	//   34   73:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   35   76:ldc1            #110 <String ":">
	//   36   78:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   37   81:iload           4
	//   38   83:invokevirtual   #113 <Method StringBuilder StringBuilder.append(int)>
	//   39   86:ldc1            #115 <String ".\n">
	//   40   88:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   41   91:invokevirtual   #118 <Method String StringBuilder.toString()>
	//   42   94:astore          7
		obj = "";
	//   43   96:ldc1            #120 <String "">
	//   44   98:astore          6
		if(analysisresult.leakFound)
	//*  45  100:aload_2         
	//*  46  101:getfield        #126 <Field boolean AnalysisResult.leakFound>
	//*  47  104:ifeq            338
		{
			s = s1;
	//   48  107:aload           7
	//   49  109:astore          5
			if(analysisresult.excludedLeak)
	//*  50  111:aload_2         
	//*  51  112:getfield        #129 <Field boolean AnalysisResult.excludedLeak>
	//*  52  115:ifeq            140
				s = (new StringBuilder()).append(s1).append("* EXCLUDED LEAK.\n").toString();
	//   53  118:new             #101 <Class StringBuilder>
	//   54  121:dup             
	//   55  122:invokespecial   #102 <Method void StringBuilder()>
	//   56  125:aload           7
	//   57  127:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   58  130:ldc1            #131 <String "* EXCLUDED LEAK.\n">
	//   59  132:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   60  135:invokevirtual   #118 <Method String StringBuilder.toString()>
	//   61  138:astore          5
			s1 = (new StringBuilder()).append(s).append("* ").append(analysisresult.className).toString();
	//   62  140:new             #101 <Class StringBuilder>
	//   63  143:dup             
	//   64  144:invokespecial   #102 <Method void StringBuilder()>
	//   65  147:aload           5
	//   66  149:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   67  152:ldc1            #133 <String "* ">
	//   68  154:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   69  157:aload_2         
	//   70  158:getfield        #136 <Field String AnalysisResult.className>
	//   71  161:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   72  164:invokevirtual   #118 <Method String StringBuilder.toString()>
	//   73  167:astore          7
			s = s1;
	//   74  169:aload           7
	//   75  171:astore          5
			if(!heapdump.referenceName.equals(""))
	//*  76  173:aload_1         
	//*  77  174:getfield        #141 <Field String HeapDump.referenceName>
	//*  78  177:ldc1            #120 <String "">
	//*  79  179:invokevirtual   #147 <Method boolean String.equals(Object)>
	//*  80  182:ifne            219
				s = (new StringBuilder()).append(s1).append(" (").append(heapdump.referenceName).append(")").toString();
	//   81  185:new             #101 <Class StringBuilder>
	//   82  188:dup             
	//   83  189:invokespecial   #102 <Method void StringBuilder()>
	//   84  192:aload           7
	//   85  194:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   86  197:ldc1            #149 <String " (">
	//   87  199:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   88  202:aload_1         
	//   89  203:getfield        #141 <Field String HeapDump.referenceName>
	//   90  206:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   91  209:ldc1            #151 <String ")">
	//   92  211:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   93  214:invokevirtual   #118 <Method String StringBuilder.toString()>
	//   94  217:astore          5
			s = (new StringBuilder()).append(s).append(" has leaked:\n").append(analysisresult.leakTrace.toString()).append("\n").toString();
	//   95  219:new             #101 <Class StringBuilder>
	//   96  222:dup             
	//   97  223:invokespecial   #102 <Method void StringBuilder()>
	//   98  226:aload           5
	//   99  228:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  100  231:ldc1            #153 <String " has leaked:\n">
	//  101  233:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  102  236:aload_2         
	//  103  237:getfield        #157 <Field LeakTrace AnalysisResult.leakTrace>
	//  104  240:invokevirtual   #160 <Method String LeakTrace.toString()>
	//  105  243:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  106  246:ldc1            #162 <String "\n">
	//  107  248:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  108  251:invokevirtual   #118 <Method String StringBuilder.toString()>
	//  109  254:astore          5
			s1 = (new StringBuilder()).append(s).append("* Retaining: ").append(Formatter.formatShortFileSize(context, analysisresult.retainedHeapSize)).append(".\n").toString();
	//  110  256:new             #101 <Class StringBuilder>
	//  111  259:dup             
	//  112  260:invokespecial   #102 <Method void StringBuilder()>
	//  113  263:aload           5
	//  114  265:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  115  268:ldc1            #164 <String "* Retaining: ">
	//  116  270:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  117  273:aload_0         
	//  118  274:aload_2         
	//  119  275:getfield        #168 <Field long AnalysisResult.retainedHeapSize>
	//  120  278:invokestatic    #174 <Method String Formatter.formatShortFileSize(Context, long)>
	//  121  281:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  122  284:ldc1            #115 <String ".\n">
	//  123  286:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  124  289:invokevirtual   #118 <Method String StringBuilder.toString()>
	//  125  292:astore          7
			context = ((Context) (s1));
	//  126  294:aload           7
	//  127  296:astore_0        
			s = ((String) (obj));
	//  128  297:aload           6
	//  129  299:astore          5
			if(flag)
	//* 130  301:iload_3         
	//* 131  302:ifeq            413
			{
				s = (new StringBuilder()).append("\n* Details:\n").append(analysisresult.leakTrace.toDetailedString()).toString();
	//  132  305:new             #101 <Class StringBuilder>
	//  133  308:dup             
	//  134  309:invokespecial   #102 <Method void StringBuilder()>
	//  135  312:ldc1            #176 <String "\n* Details:\n">
	//  136  314:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  137  317:aload_2         
	//  138  318:getfield        #157 <Field LeakTrace AnalysisResult.leakTrace>
	//  139  321:invokevirtual   #179 <Method String LeakTrace.toDetailedString()>
	//  140  324:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  141  327:invokevirtual   #118 <Method String StringBuilder.toString()>
	//  142  330:astore          5
				context = ((Context) (s1));
	//  143  332:aload           7
	//  144  334:astore_0        
			}
		} else
	//* 145  335:goto            413
		if(analysisresult.failure != null)
	//* 146  338:aload_2         
	//* 147  339:getfield        #183 <Field Throwable AnalysisResult.failure>
	//* 148  342:ifnull          388
		{
			context = ((Context) ((new StringBuilder()).append(s1).append("* FAILURE in 1.5.1 1be44b3:").append(Log.getStackTraceString(analysisresult.failure)).append("\n").toString()));
	//  149  345:new             #101 <Class StringBuilder>
	//  150  348:dup             
	//  151  349:invokespecial   #102 <Method void StringBuilder()>
	//  152  352:aload           7
	//  153  354:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  154  357:ldc1            #185 <String "* FAILURE in 1.5.1 1be44b3:">
	//  155  359:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  156  362:aload_2         
	//  157  363:getfield        #183 <Field Throwable AnalysisResult.failure>
	//  158  366:invokestatic    #191 <Method String Log.getStackTraceString(Throwable)>
	//  159  369:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  160  372:ldc1            #162 <String "\n">
	//  161  374:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  162  377:invokevirtual   #118 <Method String StringBuilder.toString()>
	//  163  380:astore_0        
			s = ((String) (obj));
	//  164  381:aload           6
	//  165  383:astore          5
		} else
	//* 166  385:goto            413
		{
			context = ((Context) ((new StringBuilder()).append(s1).append("* NO LEAK FOUND.\n\n").toString()));
	//  167  388:new             #101 <Class StringBuilder>
	//  168  391:dup             
	//  169  392:invokespecial   #102 <Method void StringBuilder()>
	//  170  395:aload           7
	//  171  397:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  172  400:ldc1            #193 <String "* NO LEAK FOUND.\n\n">
	//  173  402:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  174  405:invokevirtual   #118 <Method String StringBuilder.toString()>
	//  175  408:astore_0        
			s = ((String) (obj));
	//  176  409:aload           6
	//  177  411:astore          5
		}
		obj = ((Object) (s));
	//  178  413:aload           5
	//  179  415:astore          6
		if(flag)
	//* 180  417:iload_3         
	//* 181  418:ifeq            450
			obj = ((Object) ((new StringBuilder()).append(s).append("* Excluded Refs:\n").append(((Object) (heapdump.excludedRefs))).toString()));
	//  182  421:new             #101 <Class StringBuilder>
	//  183  424:dup             
	//  184  425:invokespecial   #102 <Method void StringBuilder()>
	//  185  428:aload           5
	//  186  430:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  187  433:ldc1            #195 <String "* Excluded Refs:\n">
	//  188  435:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  189  438:aload_1         
	//  190  439:getfield        #198 <Field ExcludedRefs HeapDump.excludedRefs>
	//  191  442:invokevirtual   #201 <Method StringBuilder StringBuilder.append(Object)>
	//  192  445:invokevirtual   #118 <Method String StringBuilder.toString()>
	//  193  448:astore          6
		return (new StringBuilder()).append(((String) (context))).append("* Reference Key: ").append(heapdump.referenceKey).append("\n* Device: ").append(Build.MANUFACTURER).append(" ").append(Build.BRAND).append(" ").append(Build.MODEL).append(" ").append(Build.PRODUCT).append("\n* Android Version: ").append(android.os.Build.VERSION.RELEASE).append(" API: ").append(android.os.Build.VERSION.SDK_INT).append(" LeakCanary: ").append("1.5.1").append(" ").append("1be44b3").append("\n* Durations: watch=").append(heapdump.watchDurationMs).append("ms, gc=").append(heapdump.gcDurationMs).append("ms, heap dump=").append(heapdump.heapDumpDurationMs).append("ms, analysis=").append(analysisresult.analysisDurationMs).append("ms\n").append(((String) (obj))).toString();
	//  194  450:new             #101 <Class StringBuilder>
	//  195  453:dup             
	//  196  454:invokespecial   #102 <Method void StringBuilder()>
	//  197  457:aload_0         
	//  198  458:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  199  461:ldc1            #203 <String "* Reference Key: ">
	//  200  463:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  201  466:aload_1         
	//  202  467:getfield        #206 <Field String HeapDump.referenceKey>
	//  203  470:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  204  473:ldc1            #208 <String "\n* Device: ">
	//  205  475:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  206  478:getstatic       #213 <Field String Build.MANUFACTURER>
	//  207  481:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  208  484:ldc1            #215 <String " ">
	//  209  486:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  210  489:getstatic       #218 <Field String Build.BRAND>
	//  211  492:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  212  495:ldc1            #215 <String " ">
	//  213  497:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  214  500:getstatic       #221 <Field String Build.MODEL>
	//  215  503:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  216  506:ldc1            #215 <String " ">
	//  217  508:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  218  511:getstatic       #224 <Field String Build.PRODUCT>
	//  219  514:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  220  517:ldc1            #226 <String "\n* Android Version: ">
	//  221  519:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  222  522:getstatic       #231 <Field String android.os.Build$VERSION.RELEASE>
	//  223  525:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  224  528:ldc1            #233 <String " API: ">
	//  225  530:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  226  533:getstatic       #236 <Field int android.os.Build$VERSION.SDK_INT>
	//  227  536:invokevirtual   #113 <Method StringBuilder StringBuilder.append(int)>
	//  228  539:ldc1            #238 <String " LeakCanary: ">
	//  229  541:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  230  544:ldc1            #240 <String "1.5.1">
	//  231  546:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  232  549:ldc1            #215 <String " ">
	//  233  551:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  234  554:ldc1            #242 <String "1be44b3">
	//  235  556:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  236  559:ldc1            #244 <String "\n* Durations: watch=">
	//  237  561:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  238  564:aload_1         
	//  239  565:getfield        #247 <Field long HeapDump.watchDurationMs>
	//  240  568:invokevirtual   #250 <Method StringBuilder StringBuilder.append(long)>
	//  241  571:ldc1            #252 <String "ms, gc=">
	//  242  573:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  243  576:aload_1         
	//  244  577:getfield        #255 <Field long HeapDump.gcDurationMs>
	//  245  580:invokevirtual   #250 <Method StringBuilder StringBuilder.append(long)>
	//  246  583:ldc2            #257 <String "ms, heap dump=">
	//  247  586:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  248  589:aload_1         
	//  249  590:getfield        #260 <Field long HeapDump.heapDumpDurationMs>
	//  250  593:invokevirtual   #250 <Method StringBuilder StringBuilder.append(long)>
	//  251  596:ldc2            #262 <String "ms, analysis=">
	//  252  599:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  253  602:aload_2         
	//  254  603:getfield        #265 <Field long AnalysisResult.analysisDurationMs>
	//  255  606:invokevirtual   #250 <Method StringBuilder StringBuilder.append(long)>
	//  256  609:ldc2            #267 <String "ms\n">
	//  257  612:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  258  615:aload           6
	//  259  617:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  260  620:invokevirtual   #118 <Method String StringBuilder.toString()>
	//  261  623:areturn         
	}

	public static AndroidRefWatcherBuilder refWatcher(Context context)
	{
		return new AndroidRefWatcherBuilder(context);
	//    0    0:new             #32  <Class AndroidRefWatcherBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #269 <Method void AndroidRefWatcherBuilder(Context)>
	//    4    8:areturn         
	}

	public static void setDisplayLeakActivityDirectoryProvider(LeakDirectoryProvider leakdirectoryprovider)
	{
		DisplayLeakActivity.setLeakDirectoryProvider(leakdirectoryprovider);
	//    0    0:aload_0         
	//    1    1:invokestatic    #274 <Method void DisplayLeakActivity.setLeakDirectoryProvider(LeakDirectoryProvider)>
	//    2    4:return          
	}
}
