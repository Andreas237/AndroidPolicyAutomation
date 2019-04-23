// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.b.b;
import com.google.android.gms.common.b.c;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.gms.internal.ads:
//			qj, zzbbi, aag, p, 
//			bwk, m, qk, qh, 
//			qg, zv, apz, aak, 
//			qi

public final class qf
	implements qj
{

	private qf(Context context)
	{
		this(context, zzbbi.a());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #40  <Method zzbbi zzbbi.a()>
	//    3    5:invokespecial   #43  <Method void qf(Context, zzbbi)>
	//    4    8:return          
	}

	private qf(Context context, zzbbi zzbbi1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		d = new Object();
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #27  <Method void Object()>
	//    6   12:putfield        #45  <Field Object d>
		f = new WeakHashMap();
	//    7   15:aload_0         
	//    8   16:new             #47  <Class WeakHashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #48  <Method void WeakHashMap()>
	//   11   23:putfield        #50  <Field WeakHashMap f>
		g = Executors.newCachedThreadPool();
	//   12   26:aload_0         
	//   13   27:invokestatic    #56  <Method ExecutorService Executors.newCachedThreadPool()>
	//   14   30:putfield        #58  <Field ExecutorService g>
		Context context1 = context;
	//   15   33:aload_1         
	//   16   34:astore_3        
		if(context.getApplicationContext() != null)
	//*  17   35:aload_1         
	//*  18   36:invokevirtual   #64  <Method Context Context.getApplicationContext()>
	//*  19   39:ifnull          47
			context1 = context.getApplicationContext();
	//   20   42:aload_1         
	//   21   43:invokevirtual   #64  <Method Context Context.getApplicationContext()>
	//   22   46:astore_3        
		e = context1;
	//   23   47:aload_0         
	//   24   48:aload_3         
	//   25   49:putfield        #66  <Field Context e>
		h = zzbbi1;
	//   26   52:aload_0         
	//   27   53:aload_2         
	//   28   54:putfield        #68  <Field zzbbi h>
	//   29   57:return          
	}

	private final android.net.Uri.Builder a(String s, String s1, String s2, int i)
	{
		boolean flag;
		String s3;
		try
		{
			flag = com.google.android.gms.common.b.c.a(e).a();
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Context e>
	//    2    4:invokestatic    #76  <Method b c.a(Context)>
	//    3    7:invokevirtual   #81  <Method boolean b.a()>
	//    4   10:istore          5
		}
	//*   5   12:goto            27
		catch(Throwable throwable)
	//*   6   15:astore          6
		{
			com.google.android.gms.internal.ads.aag.b("Error fetching instant app info", throwable);
	//    7   17:ldc1            #83  <String "Error fetching instant app info">
	//    8   19:aload           6
	//    9   21:invokestatic    #88  <Method void com.google.android.gms.internal.ads.aag.b(String, Throwable)>
			flag = false;
	//   10   24:iconst_0        
	//   11   25:istore          5
		}
		s3 = "unknown";
	//   12   27:ldc1            #90  <String "unknown">
	//   13   29:astore          6
		String s4 = e.getPackageName();
	//   14   31:aload_0         
	//   15   32:getfield        #66  <Field Context e>
	//   16   35:invokevirtual   #94  <Method String Context.getPackageName()>
	//   17   38:astore          7
		s3 = s4;
	//   18   40:aload           7
	//   19   42:astore          6
		  goto _L1
	//*  20   44:goto            52
_L3:
		aag.e("Cannot obtain package name, proceeding.");
	//   21   47:ldc1            #96  <String "Cannot obtain package name, proceeding.">
	//   22   49:invokestatic    #99  <Method void aag.e(String)>
_L1:
		android.net.Uri.Builder builder = (new android.net.Uri.Builder()).scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(flag)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", android.os.Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(android.os.Build.VERSION.SDK_INT));
	//   23   52:new             #101 <Class android.net.Uri$Builder>
	//   24   55:dup             
	//   25   56:invokespecial   #102 <Method void android.net.Uri$Builder()>
	//   26   59:ldc1            #104 <String "https">
	//   27   61:invokevirtual   #108 <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
	//   28   64:ldc1            #110 <String "//pagead2.googlesyndication.com/pagead/gen_204">
	//   29   66:invokevirtual   #113 <Method android.net.Uri$Builder android.net.Uri$Builder.path(String)>
	//   30   69:ldc1            #115 <String "is_aia">
	//   31   71:iload           5
	//   32   73:invokestatic    #121 <Method String Boolean.toString(boolean)>
	//   33   76:invokevirtual   #125 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   34   79:ldc1            #127 <String "id">
	//   35   81:ldc1            #129 <String "gmob-apps-report-exception">
	//   36   83:invokevirtual   #125 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   37   86:ldc1            #131 <String "os">
	//   38   88:getstatic       #137 <Field String android.os.Build$VERSION.RELEASE>
	//   39   91:invokevirtual   #125 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   40   94:ldc1            #139 <String "api">
	//   41   96:getstatic       #143 <Field int android.os.Build$VERSION.SDK_INT>
	//   42   99:invokestatic    #149 <Method String String.valueOf(int)>
	//   43  102:invokevirtual   #125 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   44  105:astore          8
		String s6 = Build.MANUFACTURER;
	//   45  107:getstatic       #154 <Field String Build.MANUFACTURER>
	//   46  110:astore          9
		String s5 = Build.MODEL;
	//   47  112:getstatic       #157 <Field String Build.MODEL>
	//   48  115:astore          7
		if(!s5.startsWith(s6))
	//*  49  117:aload           7
	//*  50  119:aload           9
	//*  51  121:invokevirtual   #161 <Method boolean String.startsWith(String)>
	//*  52  124:ifeq            130
	//*  53  127:goto            189
		{
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s6))).length() + 1 + String.valueOf(((Object) (s5))).length());
	//   54  130:new             #163 <Class StringBuilder>
	//   55  133:dup             
	//   56  134:aload           9
	//   57  136:invokestatic    #166 <Method String String.valueOf(Object)>
	//   58  139:invokevirtual   #170 <Method int String.length()>
	//   59  142:iconst_1        
	//   60  143:iadd            
	//   61  144:aload           7
	//   62  146:invokestatic    #166 <Method String String.valueOf(Object)>
	//   63  149:invokevirtual   #170 <Method int String.length()>
	//   64  152:iadd            
	//   65  153:invokespecial   #173 <Method void StringBuilder(int)>
	//   66  156:astore          10
			stringbuilder.append(s6);
	//   67  158:aload           10
	//   68  160:aload           9
	//   69  162:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   70  165:pop             
			stringbuilder.append(" ");
	//   71  166:aload           10
	//   72  168:ldc1            #179 <String " ">
	//   73  170:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   74  173:pop             
			stringbuilder.append(s5);
	//   75  174:aload           10
	//   76  176:aload           7
	//   77  178:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   78  181:pop             
			s5 = stringbuilder.toString();
	//   79  182:aload           10
	//   80  184:invokevirtual   #181 <Method String StringBuilder.toString()>
	//   81  187:astore          7
		}
		s = ((String) (builder.appendQueryParameter("device", s5).appendQueryParameter("js", h.a).appendQueryParameter("appid", s3).appendQueryParameter("exceptiontype", s).appendQueryParameter("stacktrace", s1).appendQueryParameter("eids", TextUtils.join(",", ((Iterable) (p.a())))).appendQueryParameter("exceptionkey", s2).appendQueryParameter("cl", "230840877").appendQueryParameter("rc", "dev").appendQueryParameter("session_id", bwk.f()).appendQueryParameter("sampling_rate", Integer.toString(i))));
	//   82  189:aload           8
	//   83  191:ldc1            #183 <String "device">
	//   84  193:aload           7
	//   85  195:invokevirtual   #125 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   86  198:ldc1            #185 <String "js">
	//   87  200:aload_0         
	//   88  201:getfield        #68  <Field zzbbi h>
	//   89  204:getfield        #187 <Field String zzbbi.a>
	//   90  207:invokevirtual   #125 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   91  210:ldc1            #189 <String "appid">
	//   92  212:aload           6
	//   93  214:invokevirtual   #125 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   94  217:ldc1            #191 <String "exceptiontype">
	//   95  219:aload_1         
	//   96  220:invokevirtual   #125 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   97  223:ldc1            #193 <String "stacktrace">
	//   98  225:aload_2         
	//   99  226:invokevirtual   #125 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//  100  229:ldc1            #195 <String "eids">
	//  101  231:ldc1            #197 <String ",">
	//  102  233:invokestatic    #202 <Method java.util.List p.a()>
	//  103  236:invokestatic    #208 <Method String TextUtils.join(CharSequence, Iterable)>
	//  104  239:invokevirtual   #125 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//  105  242:ldc1            #210 <String "exceptionkey">
	//  106  244:aload_3         
	//  107  245:invokevirtual   #125 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//  108  248:ldc1            #212 <String "cl">
	//  109  250:ldc1            #214 <String "230840877">
	//  110  252:invokevirtual   #125 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//  111  255:ldc1            #216 <String "rc">
	//  112  257:ldc1            #218 <String "dev">
	//  113  259:invokevirtual   #125 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//  114  262:ldc1            #220 <String "session_id">
	//  115  264:invokestatic    #224 <Method String bwk.f()>
	//  116  267:invokevirtual   #125 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//  117  270:ldc1            #226 <String "sampling_rate">
	//  118  272:iload           4
	//  119  274:invokestatic    #230 <Method String Integer.toString(int)>
	//  120  277:invokevirtual   #125 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//  121  280:astore_1        
		s1 = ((String) (p.cJ));
	//  122  281:getstatic       #234 <Field e p.cJ>
	//  123  284:astore_2        
		return ((android.net.Uri.Builder) (s)).appendQueryParameter("pb_tm", String.valueOf(bwk.e().a(((e) (s1)))));
	//  124  285:aload_1         
	//  125  286:ldc1            #236 <String "pb_tm">
	//  126  288:invokestatic    #239 <Method m bwk.e()>
	//  127  291:aload_2         
	//  128  292:invokevirtual   #244 <Method Object m.a(e)>
	//  129  295:invokestatic    #166 <Method String String.valueOf(Object)>
	//  130  298:invokevirtual   #125 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//  131  301:areturn         
		Throwable throwable1;
		throwable1;
	//  132  302:astore          7
		if(true) goto _L3; else goto _L2
	//  133  304:goto            47
_L2:
	}

	public static qj a(Context context)
	{
		Object obj = a;
	//    0    0:getstatic       #29  <Field Object a>
	//    1    3:astore_1        
		obj;
	//    2    4:aload_1         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		if(b != null)
			break MISSING_BLOCK_LABEL_56;
	//    4    6:getstatic       #31  <Field qj b>
	//    5    9:ifnonnull       56
		e e1 = com.google.android.gms.internal.ads.p.c;
	//    6   12:getstatic       #247 <Field e com.google.android.gms.internal.ads.p.c>
	//    7   15:astore_2        
		if(((Boolean)bwk.e().a(e1)).booleanValue())
	//*   8   16:invokestatic    #239 <Method m bwk.e()>
	//*   9   19:aload_2         
	//*  10   20:invokevirtual   #244 <Method Object m.a(e)>
	//*  11   23:checkcast       #117 <Class Boolean>
	//*  12   26:invokevirtual   #250 <Method boolean Boolean.booleanValue()>
	//*  13   29:ifeq            46
		{
			b = ((qj) (new qf(context)));
	//   14   32:new             #2   <Class qf>
	//   15   35:dup             
	//   16   36:aload_0         
	//   17   37:invokespecial   #252 <Method void qf(Context)>
	//   18   40:putstatic       #31  <Field qj b>
			break MISSING_BLOCK_LABEL_56;
	//   19   43:goto            56
		}
		b = ((qj) (new qk()));
	//   20   46:new             #254 <Class qk>
	//   21   49:dup             
	//   22   50:invokespecial   #255 <Method void qk()>
	//   23   53:putstatic       #31  <Field qj b>
		obj;
	//   24   56:aload_1         
		JVM INSTR monitorexit ;
	//   25   57:monitorexit     
		return b;
	//   26   58:getstatic       #31  <Field qj b>
	//   27   61:areturn         
		context;
	//   28   62:astore_0        
		obj;
	//   29   63:aload_1         
		JVM INSTR monitorexit ;
	//   30   64:monitorexit     
		throw context;
	//   31   65:aload_0         
	//   32   66:athrow          
	}

	public static qj a(Context context, zzbbi zzbbi1)
	{
		Object obj = a;
	//    0    0:getstatic       #29  <Field Object a>
	//    1    3:astore_2        
		obj;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		Object obj1;
		if(c != null)
			break MISSING_BLOCK_LABEL_130;
	//    4    6:getstatic       #33  <Field qj c>
	//    5    9:ifnonnull       130
		obj1 = ((Object) (com.google.android.gms.internal.ads.p.c));
	//    6   12:getstatic       #247 <Field e com.google.android.gms.internal.ads.p.c>
	//    7   15:astore_3        
		if(!((Boolean)bwk.e().a(((e) (obj1)))).booleanValue())
			break MISSING_BLOCK_LABEL_120;
	//    8   16:invokestatic    #239 <Method m bwk.e()>
	//    9   19:aload_3         
	//   10   20:invokevirtual   #244 <Method Object m.a(e)>
	//   11   23:checkcast       #117 <Class Boolean>
	//   12   26:invokevirtual   #250 <Method boolean Boolean.booleanValue()>
	//   13   29:ifeq            120
		zzbbi1 = ((zzbbi) (new qf(context, zzbbi1)));
	//   14   32:new             #2   <Class qf>
	//   15   35:dup             
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:invokespecial   #43  <Method void qf(Context, zzbbi)>
	//   19   41:astore_1        
		obj1 = ((Object) (Looper.getMainLooper().getThread()));
	//   20   42:invokestatic    #262 <Method Looper Looper.getMainLooper()>
	//   21   45:invokevirtual   #266 <Method Thread Looper.getThread()>
	//   22   48:astore_3        
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_99;
	//   23   49:aload_3         
	//   24   50:ifnull          99
		synchronized(((qf) (zzbbi1)).d)
	//*  25   53:aload_1         
	//*  26   54:getfield        #45  <Field Object d>
	//*  27   57:astore_0        
	//*  28   58:aload_0         
	//*  29   59:monitorenter    
		{
			((qf) (zzbbi1)).f.put(obj1, ((Object) (Boolean.valueOf(true))));
	//   30   60:aload_1         
	//   31   61:getfield        #50  <Field WeakHashMap f>
	//   32   64:aload_3         
	//   33   65:iconst_1        
	//   34   66:invokestatic    #269 <Method Boolean Boolean.valueOf(boolean)>
	//   35   69:invokevirtual   #273 <Method Object WeakHashMap.put(Object, Object)>
	//   36   72:pop             
		}
	//   37   73:aload_0         
	//   38   74:monitorexit     
		((Thread) (obj1)).setUncaughtExceptionHandler(((Thread.UncaughtExceptionHandler) (new qh(((qf) (zzbbi1)), ((Thread) (obj1)).getUncaughtExceptionHandler()))));
	//   39   75:aload_3         
	//   40   76:new             #275 <Class qh>
	//   41   79:dup             
	//   42   80:aload_1         
	//   43   81:aload_3         
	//   44   82:invokevirtual   #281 <Method Thread$UncaughtExceptionHandler Thread.getUncaughtExceptionHandler()>
	//   45   85:invokespecial   #284 <Method void qh(qf, Thread$UncaughtExceptionHandler)>
	//   46   88:invokevirtual   #288 <Method void Thread.setUncaughtExceptionHandler(Thread$UncaughtExceptionHandler)>
		break MISSING_BLOCK_LABEL_99;
	//   47   91:goto            99
		zzbbi1;
	//   48   94:astore_1        
		context;
	//   49   95:aload_0         
		JVM INSTR monitorexit ;
	//   50   96:monitorexit     
		throw zzbbi1;
	//   51   97:aload_1         
	//   52   98:athrow          
		Thread.setDefaultUncaughtExceptionHandler(((Thread.UncaughtExceptionHandler) (new qg(((qf) (zzbbi1)), Thread.getDefaultUncaughtExceptionHandler()))));
	//   53   99:new             #290 <Class qg>
	//   54  102:dup             
	//   55  103:aload_1         
	//   56  104:invokestatic    #293 <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
	//   57  107:invokespecial   #294 <Method void qg(qf, Thread$UncaughtExceptionHandler)>
	//   58  110:invokestatic    #297 <Method void Thread.setDefaultUncaughtExceptionHandler(Thread$UncaughtExceptionHandler)>
		c = ((qj) (zzbbi1));
	//   59  113:aload_1         
	//   60  114:putstatic       #33  <Field qj c>
		break MISSING_BLOCK_LABEL_130;
	//   61  117:goto            130
		c = ((qj) (new qk()));
	//   62  120:new             #254 <Class qk>
	//   63  123:dup             
	//   64  124:invokespecial   #255 <Method void qk()>
	//   65  127:putstatic       #33  <Field qj c>
		obj;
	//   66  130:aload_2         
		JVM INSTR monitorexit ;
	//   67  131:monitorexit     
		return c;
	//   68  132:getstatic       #33  <Field qj c>
	//   69  135:areturn         
		context;
	//   70  136:astore_0        
		obj;
	//   71  137:aload_2         
		JVM INSTR monitorexit ;
	//   72  138:monitorexit     
		throw context;
	//   73  139:aload_0         
	//   74  140:athrow          
	}

	protected final void a(Thread thread, Throwable throwable)
	{
		boolean flag;
label0:
		{
			boolean flag2 = true;
	//    0    0:iconst_1        
	//    1    1:istore          6
			if(throwable != null)
	//*   2    3:aload_2         
	//*   3    4:ifnull          136
			{
				thread = ((Thread) (throwable));
	//    4    7:aload_2         
	//    5    8:astore_1        
				flag = false;
	//    6    9:iconst_0        
	//    7   10:istore_3        
				boolean flag1;
				int i;
				for(flag1 = false; thread != null; flag1 = ((boolean) (i)))
	//*   8   11:iconst_0        
	//*   9   12:istore          4
	//*  10   14:aload_1         
	//*  11   15:ifnull          121
				{
					StackTraceElement astacktraceelement[] = ((Throwable) (thread)).getStackTrace();
	//   12   18:aload_1         
	//   13   19:invokevirtual   #302 <Method StackTraceElement[] Throwable.getStackTrace()>
	//   14   22:astore          9
					int j = astacktraceelement.length;
	//   15   24:aload           9
	//   16   26:arraylength     
	//   17   27:istore          8
					i = ((int) (flag));
	//   18   29:iload_3         
	//   19   30:istore          5
					boolean flag3 = false;
	//   20   32:iconst_0        
	//   21   33:istore          7
					flag = flag1;
	//   22   35:iload           4
	//   23   37:istore_3        
					flag1 = ((boolean) (i));
	//   24   38:iload           5
	//   25   40:istore          4
					for(i = ((int) (flag3)); i < j; i++)
	//*  26   42:iload           7
	//*  27   44:istore          5
	//*  28   46:iload           5
	//*  29   48:iload           8
	//*  30   50:icmpge          103
					{
						StackTraceElement stacktraceelement = astacktraceelement[i];
	//   31   53:aload           9
	//   32   55:iload           5
	//   33   57:aaload          
	//   34   58:astore          10
						if(com.google.android.gms.internal.ads.zv.b(stacktraceelement.getClassName()))
	//*  35   60:aload           10
	//*  36   62:invokevirtual   #307 <Method String StackTraceElement.getClassName()>
	//*  37   65:invokestatic    #311 <Method boolean com.google.android.gms.internal.ads.zv.b(String)>
	//*  38   68:ifeq            74
							flag1 = true;
	//   39   71:iconst_1        
	//   40   72:istore          4
						if(((Object)this).getClass().getName().equals(((Object) (stacktraceelement.getClassName()))))
	//*  41   74:aload_0         
	//*  42   75:invokevirtual   #315 <Method Class Object.getClass()>
	//*  43   78:invokevirtual   #320 <Method String Class.getName()>
	//*  44   81:aload           10
	//*  45   83:invokevirtual   #307 <Method String StackTraceElement.getClassName()>
	//*  46   86:invokevirtual   #324 <Method boolean String.equals(Object)>
	//*  47   89:ifeq            94
							flag = true;
	//   48   92:iconst_1        
	//   49   93:istore_3        
					}

	//   50   94:iload           5
	//   51   96:iconst_1        
	//   52   97:iadd            
	//   53   98:istore          5
	//*  54  100:goto            46
					thread = ((Thread) (((Throwable) (thread)).getCause()));
	//   55  103:aload_1         
	//   56  104:invokevirtual   #328 <Method Throwable Throwable.getCause()>
	//   57  107:astore_1        
					i = ((int) (flag));
	//   58  108:iload_3         
	//   59  109:istore          5
					flag = flag1;
	//   60  111:iload           4
	//   61  113:istore_3        
				}

	//   62  114:iload           5
	//   63  116:istore          4
	//*  64  118:goto            14
				if(flag && !flag1)
	//*  65  121:iload_3         
	//*  66  122:ifeq            136
	//*  67  125:iload           4
	//*  68  127:ifne            136
				{
					flag = flag2;
	//   69  130:iload           6
	//   70  132:istore_3        
					break label0;
	//   71  133:goto            138
				}
			}
			flag = false;
	//   72  136:iconst_0        
	//   73  137:istore_3        
		}
		if(flag)
	//*  74  138:iload_3         
	//*  75  139:ifeq            151
			a(throwable, "", 1.0F);
	//   76  142:aload_0         
	//   77  143:aload_2         
	//   78  144:ldc2            #330 <String "">
	//   79  147:fconst_1        
	//   80  148:invokevirtual   #333 <Method void a(Throwable, String, float)>
	//   81  151:return          
	}

	public final void a(Throwable throwable, String s)
	{
		a(throwable, s, 1.0F);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:fconst_1        
	//    4    4:invokevirtual   #333 <Method void a(Throwable, String, float)>
	//    5    7:return          
	}

	public final void a(Throwable throwable, String s, float f1)
	{
		if(zv.a(throwable) == null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #337 <Method Throwable zv.a(Throwable)>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		String s1 = ((Object) (throwable)).getClass().getName();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #315 <Method Class Object.getClass()>
	//    6   12:invokevirtual   #320 <Method String Class.getName()>
	//    7   15:astore          11
		StringWriter stringwriter = new StringWriter();
	//    8   17:new             #339 <Class StringWriter>
	//    9   20:dup             
	//   10   21:invokespecial   #340 <Method void StringWriter()>
	//   11   24:astore          12
		apz.a(throwable, new PrintWriter(((java.io.Writer) (stringwriter))));
	//   12   26:aload_1         
	//   13   27:new             #342 <Class PrintWriter>
	//   14   30:dup             
	//   15   31:aload           12
	//   16   33:invokespecial   #345 <Method void PrintWriter(java.io.Writer)>
	//   17   36:invokestatic    #350 <Method void apz.a(Throwable, PrintWriter)>
		throwable = ((Throwable) (stringwriter.toString()));
	//   18   39:aload           12
	//   19   41:invokevirtual   #351 <Method String StringWriter.toString()>
	//   20   44:astore_1        
		double d1 = Math.random();
	//   21   45:invokestatic    #357 <Method double Math.random()>
	//   22   48:dstore          4
		double d2 = f1;
	//   23   50:fload_3         
	//   24   51:f2d             
	//   25   52:dstore          6
		boolean flag1 = false;
	//   26   54:iconst_0        
	//   27   55:istore          10
		int j = 1;
	//   28   57:iconst_1        
	//   29   58:istore          9
		boolean flag;
		if(d1 < d2)
	//*  30   60:dload           4
	//*  31   62:dload           6
	//*  32   64:dcmpg           
	//*  33   65:ifge            74
			flag = true;
	//   34   68:iconst_1        
	//   35   69:istore          8
		else
	//*  36   71:goto            77
			flag = false;
	//   37   74:iconst_0        
	//   38   75:istore          8
		if(f1 > 0.0F)
	//*  39   77:fload_3         
	//*  40   78:fconst_0        
	//*  41   79:fcmpl           
	//*  42   80:ifle            89
			j = (int)(1.0F / f1);
	//   43   83:fconst_1        
	//   44   84:fload_3         
	//   45   85:fdiv            
	//   46   86:f2i             
	//   47   87:istore          9
		if(flag)
	//*  48   89:iload           8
	//*  49   91:ifeq            196
		{
			ArrayList arraylist = new ArrayList();
	//   50   94:new             #359 <Class ArrayList>
	//   51   97:dup             
	//   52   98:invokespecial   #360 <Method void ArrayList()>
	//   53  101:astore          12
			arraylist.add(((Object) (a(s1, ((String) (throwable)), s, j).toString())));
	//   54  103:aload           12
	//   55  105:aload_0         
	//   56  106:aload           11
	//   57  108:aload_1         
	//   58  109:aload_2         
	//   59  110:iload           9
	//   60  112:invokespecial   #362 <Method android.net.Uri$Builder a(String, String, String, int)>
	//   61  115:invokevirtual   #363 <Method String android.net.Uri$Builder.toString()>
	//   62  118:invokevirtual   #366 <Method boolean ArrayList.add(Object)>
	//   63  121:pop             
			throwable = ((Throwable) ((ArrayList)arraylist));
	//   64  122:aload           12
	//   65  124:checkcast       #359 <Class ArrayList>
	//   66  127:astore_1        
			j = ((ArrayList) (throwable)).size();
	//   67  128:aload_1         
	//   68  129:invokevirtual   #369 <Method int ArrayList.size()>
	//   69  132:istore          9
			for(int i = ((int) (flag1)); i < j;)
	//*  70  134:iload           10
	//*  71  136:istore          8
	//*  72  138:iload           8
	//*  73  140:iload           9
	//*  74  142:icmpge          196
			{
				s = ((String) (((ArrayList) (throwable)).get(i)));
	//   75  145:aload_1         
	//   76  146:iload           8
	//   77  148:invokevirtual   #373 <Method Object ArrayList.get(int)>
	//   78  151:astore_2        
				i++;
	//   79  152:iload           8
	//   80  154:iconst_1        
	//   81  155:iadd            
	//   82  156:istore          8
				s = (String)s;
	//   83  158:aload_2         
	//   84  159:checkcast       #145 <Class String>
	//   85  162:astore_2        
				aak aak1 = new aak();
	//   86  163:new             #375 <Class aak>
	//   87  166:dup             
	//   88  167:invokespecial   #376 <Method void aak()>
	//   89  170:astore          11
				g.submit(((Runnable) (new qi(this, aak1, s))));
	//   90  172:aload_0         
	//   91  173:getfield        #58  <Field ExecutorService g>
	//   92  176:new             #378 <Class qi>
	//   93  179:dup             
	//   94  180:aload_0         
	//   95  181:aload           11
	//   96  183:aload_2         
	//   97  184:invokespecial   #381 <Method void qi(qf, aak, String)>
	//   98  187:invokeinterface #387 <Method java.util.concurrent.Future ExecutorService.submit(Runnable)>
	//   99  192:pop             
			}

		}
	//* 100  193:goto            138
	//  101  196:return          
	}

	private static final Object a = new Object();
	private static qj b = null;
	private static qj c = null;
	private final Object d;
	private final Context e;
	private final WeakHashMap f;
	private final ExecutorService g;
	private final zzbbi h;

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void Object()>
	//    3    7:putstatic       #29  <Field Object a>
	//    4   10:aconst_null     
	//    5   11:putstatic       #31  <Field qj b>
	//    6   14:aconst_null     
	//    7   15:putstatic       #33  <Field qj c>
	//*   8   18:return          
	}
}
