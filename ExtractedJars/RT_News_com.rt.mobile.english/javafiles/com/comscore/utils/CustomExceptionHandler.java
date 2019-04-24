// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.utils;

import com.comscore.analytics.Core;
import com.comscore.applications.EventType;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;

// Referenced classes of package com.comscore.utils:
//			CSLog, OfflineMeasurementsCache

public class CustomExceptionHandler
	implements Thread.UncaughtExceptionHandler
{

	public CustomExceptionHandler(Core core)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = Thread.getDefaultUncaughtExceptionHandler();
	//    2    4:aload_0         
	//    3    5:invokestatic    #21  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
	//    4    8:putfield        #23  <Field Thread$UncaughtExceptionHandler a>
		b = core;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #25  <Field Core b>
	//    8   16:return          
	}

	private void a(Throwable throwable)
	{
		String s = "";
	//    0    0:ldc1            #31  <String "">
	//    1    2:astore_3        
		StackTraceElement astacktraceelement[] = throwable.getStackTrace();
	//    2    3:aload_1         
	//    3    4:invokevirtual   #37  <Method StackTraceElement[] Throwable.getStackTrace()>
	//    4    7:astore          5
		for(int i = 0; i < astacktraceelement.length && i < 5; i++)
	//*   5    9:iconst_0        
	//*   6   10:istore_2        
	//*   7   11:iload_2         
	//*   8   12:aload           5
	//*   9   14:arraylength     
	//*  10   15:icmpge          173
	//*  11   18:iload_2         
	//*  12   19:iconst_5        
	//*  13   20:icmpge          173
		{
			Object obj = ((Object) (astacktraceelement[i]));
	//   14   23:aload           5
	//   15   25:iload_2         
	//   16   26:aaload          
	//   17   27:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   18   29:new             #39  <Class StringBuilder>
	//   19   32:dup             
	//   20   33:invokespecial   #40  <Method void StringBuilder()>
	//   21   36:astore          6
			stringbuilder.append(((StackTraceElement) (obj)).getFileName());
	//   22   38:aload           6
	//   23   40:aload           4
	//   24   42:invokevirtual   #46  <Method String StackTraceElement.getFileName()>
	//   25   45:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   26   48:pop             
			stringbuilder.append("@");
	//   27   49:aload           6
	//   28   51:ldc1            #52  <String "@">
	//   29   53:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   30   56:pop             
			stringbuilder.append(((StackTraceElement) (obj)).getLineNumber());
	//   31   57:aload           6
	//   32   59:aload           4
	//   33   61:invokevirtual   #56  <Method int StackTraceElement.getLineNumber()>
	//   34   64:invokevirtual   #59  <Method StringBuilder StringBuilder.append(int)>
	//   35   67:pop             
			stringbuilder.append("|");
	//   36   68:aload           6
	//   37   70:ldc1            #61  <String "|">
	//   38   72:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   39   75:pop             
			stringbuilder.append(((StackTraceElement) (obj)).getClassName());
	//   40   76:aload           6
	//   41   78:aload           4
	//   42   80:invokevirtual   #64  <Method String StackTraceElement.getClassName()>
	//   43   83:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   44   86:pop             
			stringbuilder.append(".");
	//   45   87:aload           6
	//   46   89:ldc1            #66  <String ".">
	//   47   91:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   48   94:pop             
			stringbuilder.append(((StackTraceElement) (obj)).getMethodName());
	//   49   95:aload           6
	//   50   97:aload           4
	//   51   99:invokevirtual   #69  <Method String StackTraceElement.getMethodName()>
	//   52  102:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   53  105:pop             
			obj = ((Object) (stringbuilder.toString()));
	//   54  106:aload           6
	//   55  108:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   56  111:astore          4
			if(s.equals(""))
	//*  57  113:aload_3         
	//*  58  114:ldc1            #31  <String "">
	//*  59  116:invokevirtual   #78  <Method boolean String.equals(Object)>
	//*  60  119:ifeq            128
			{
				s = ((String) (obj));
	//   61  122:aload           4
	//   62  124:astore_3        
			} else
	//*  63  125:goto            166
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   64  128:new             #39  <Class StringBuilder>
	//   65  131:dup             
	//   66  132:invokespecial   #40  <Method void StringBuilder()>
	//   67  135:astore          6
				stringbuilder1.append(s);
	//   68  137:aload           6
	//   69  139:aload_3         
	//   70  140:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   71  143:pop             
				stringbuilder1.append(";");
	//   72  144:aload           6
	//   73  146:ldc1            #80  <String ";">
	//   74  148:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   75  151:pop             
				stringbuilder1.append(((String) (obj)));
	//   76  152:aload           6
	//   77  154:aload           4
	//   78  156:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   79  159:pop             
				s = stringbuilder1.toString();
	//   80  160:aload           6
	//   81  162:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   82  165:astore_3        
			}
		}

	//   83  166:iload_2         
	//   84  167:iconst_1        
	//   85  168:iadd            
	//   86  169:istore_2        
	//*  87  170:goto            11
		HashMap hashmap = new HashMap();
	//   88  173:new             #82  <Class HashMap>
	//   89  176:dup             
	//   90  177:invokespecial   #83  <Method void HashMap()>
	//   91  180:astore          4
		if(!s.equals(""))
	//*  92  182:aload_3         
	//*  93  183:ldc1            #31  <String "">
	//*  94  185:invokevirtual   #78  <Method boolean String.equals(Object)>
	//*  95  188:ifne            219
			try
			{
				hashmap.put("ns_ap_uxc", ((Object) (URLEncoder.encode(s, "UTF-8"))));
	//   96  191:aload           4
	//   97  193:ldc1            #85  <String "ns_ap_uxc">
	//   98  195:aload_3         
	//   99  196:ldc1            #87  <String "UTF-8">
	//  100  198:invokestatic    #93  <Method String URLEncoder.encode(String, String)>
	//  101  201:invokevirtual   #97  <Method Object HashMap.put(Object, Object)>
	//  102  204:pop             
			}
	//* 103  205:goto            219
			catch(UnsupportedEncodingException unsupportedencodingexception)
	//* 104  208:astore_3        
			{
				CSLog.e(((Object) (this)), "Error encoding the URL (ns_ap_uxc)");
	//  105  209:aload_0         
	//  106  210:ldc1            #99  <String "Error encoding the URL (ns_ap_uxc)">
	//  107  212:invokestatic    #105 <Method void CSLog.e(Object, String)>
				CSLog.printStackTrace(((Exception) (unsupportedencodingexception)));
	//  108  215:aload_3         
	//  109  216:invokestatic    #109 <Method void CSLog.printStackTrace(Exception)>
			}
		try
		{
			hashmap.put("ns_ap_uxs", ((Object) (URLEncoder.encode(throwable.toString(), "UTF-8"))));
	//  110  219:aload           4
	//  111  221:ldc1            #111 <String "ns_ap_uxs">
	//  112  223:aload_1         
	//  113  224:invokevirtual   #112 <Method String Throwable.toString()>
	//  114  227:ldc1            #87  <String "UTF-8">
	//  115  229:invokestatic    #93  <Method String URLEncoder.encode(String, String)>
	//  116  232:invokevirtual   #97  <Method Object HashMap.put(Object, Object)>
	//  117  235:pop             
		}
	//* 118  236:goto            250
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
	//* 119  239:astore_1        
		{
			CSLog.e(((Object) (this)), "Error encoding the URL (ns_ap_uxs)");
	//  120  240:aload_0         
	//  121  241:ldc1            #114 <String "Error encoding the URL (ns_ap_uxs)">
	//  122  243:invokestatic    #105 <Method void CSLog.e(Object, String)>
			CSLog.printStackTrace(((Exception) (throwable)));
	//  123  246:aload_1         
	//  124  247:invokestatic    #109 <Method void CSLog.printStackTrace(Exception)>
		}
		b.getOfflineCache().saveApplicationMeasurement(EventType.HIDDEN, hashmap, true);
	//  125  250:aload_0         
	//  126  251:getfield        #25  <Field Core b>
	//  127  254:invokevirtual   #120 <Method OfflineMeasurementsCache Core.getOfflineCache()>
	//  128  257:getstatic       #126 <Field EventType EventType.HIDDEN>
	//  129  260:aload           4
	//  130  262:iconst_1        
	//  131  263:invokevirtual   #132 <Method void OfflineMeasurementsCache.saveApplicationMeasurement(EventType, HashMap, boolean)>
	//  132  266:return          
	}

	public void uncaughtException(Thread thread, Throwable throwable)
	{
		a(throwable);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #136 <Method void a(Throwable)>
		a.uncaughtException(thread, throwable);
	//    3    5:aload_0         
	//    4    6:getfield        #23  <Field Thread$UncaughtExceptionHandler a>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokeinterface #138 <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
	//    8   16:return          
	}

	private Thread.UncaughtExceptionHandler a;
	private Core b;
}
