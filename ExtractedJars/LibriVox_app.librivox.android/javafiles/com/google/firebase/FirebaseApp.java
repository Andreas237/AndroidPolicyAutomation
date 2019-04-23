// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.firebase;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.g.a;
import android.util.Log;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.al;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.util.q;
import com.google.firebase.a.c;
import com.google.firebase.components.b;
import com.google.firebase.components.o;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.firebase:
//			e, h, d, b, 
//			f, c

public class FirebaseApp
{

	private FirebaseApp(Context context, String s1, h h1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #100 <Class AtomicBoolean>
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:invokespecial   #103 <Method void AtomicBoolean(boolean)>
	//    7   13:putfield        #105 <Field AtomicBoolean o>
	//    8   16:aload_0         
	//    9   17:new             #100 <Class AtomicBoolean>
	//   10   20:dup             
	//   11   21:invokespecial   #106 <Method void AtomicBoolean()>
	//   12   24:putfield        #108 <Field AtomicBoolean p>
	//   13   27:aload_0         
	//   14   28:new             #110 <Class CopyOnWriteArrayList>
	//   15   31:dup             
	//   16   32:invokespecial   #111 <Method void CopyOnWriteArrayList()>
	//   17   35:putfield        #113 <Field List r>
	//   18   38:aload_0         
	//   19   39:new             #110 <Class CopyOnWriteArrayList>
	//   20   42:dup             
	//   21   43:invokespecial   #111 <Method void CopyOnWriteArrayList()>
	//   22   46:putfield        #115 <Field List s>
	//   23   49:aload_0         
	//   24   50:new             #110 <Class CopyOnWriteArrayList>
	//   25   53:dup             
	//   26   54:invokespecial   #111 <Method void CopyOnWriteArrayList()>
	//   27   57:putfield        #117 <Field List t>
		i = (Context)am.a(((Object) (context)));
	//   28   60:aload_0         
	//   29   61:aload_1         
	//   30   62:invokestatic    #122 <Method Object am.a(Object)>
	//   31   65:checkcast       #124 <Class Context>
	//   32   68:putfield        #126 <Field Context i>
		j = am.a(s1);
	//   33   71:aload_0         
	//   34   72:aload_2         
	//   35   73:invokestatic    #129 <Method String am.a(String)>
	//   36   76:putfield        #131 <Field String j>
		k = (h)am.a(((Object) (h1)));
	//   37   79:aload_0         
	//   38   80:aload_3         
	//   39   81:invokestatic    #122 <Method Object am.a(Object)>
	//   40   84:checkcast       #133 <Class h>
	//   41   87:putfield        #135 <Field h k>
		u = ((com.google.firebase.c) (new com.google.firebase.c.a()));
	//   42   90:aload_0         
	//   43   91:new             #137 <Class com.google.firebase.c.a>
	//   44   94:dup             
	//   45   95:invokespecial   #138 <Method void com.google.firebase.c.a()>
	//   46   98:putfield        #140 <Field com.google.firebase.c u>
		m = context.getSharedPreferences("com.google.firebase.common.prefs", 0);
	//   47  101:aload_0         
	//   48  102:aload_1         
	//   49  103:ldc1            #142 <String "com.google.firebase.common.prefs">
	//   50  105:iconst_0        
	//   51  106:invokevirtual   #146 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   52  109:putfield        #148 <Field SharedPreferences m>
	//   53  112:aload_0         
	//   54  113:new             #100 <Class AtomicBoolean>
	//   55  116:dup             
	//   56  117:aload_0         
	//   57  118:invokespecial   #151 <Method boolean f()>
	//   58  121:invokespecial   #103 <Method void AtomicBoolean(boolean)>
	//   59  124:putfield        #153 <Field AtomicBoolean q>
		s1 = ((String) (com.google.firebase.components.b.a(context).a()));
	//   60  127:aload_1         
	//   61  128:invokestatic    #158 <Method b b.a(Context)>
	//   62  131:invokevirtual   #161 <Method List b.a()>
	//   63  134:astore_2        
		l = new o(h, ((Iterable) (s1)), new com.google.firebase.components.a[] {
			com.google.firebase.components.a.a(((Object) (context)), android/content/Context, new Class[0]), com.google.firebase.components.a.a(((Object) (this)), com/google/firebase/FirebaseApp, new Class[0]), com.google.firebase.components.a.a(((Object) (h1)), com/google/firebase/h, new Class[0])
		});
	//   64  135:aload_0         
	//   65  136:new             #163 <Class o>
	//   66  139:dup             
	//   67  140:getstatic       #91  <Field Executor h>
	//   68  143:aload_2         
	//   69  144:iconst_3        
	//   70  145:anewarray       com.google.firebase.components.a[]
	//   71  148:dup             
	//   72  149:iconst_0        
	//   73  150:aload_1         
	//   74  151:ldc1            #124 <Class Context>
	//   75  153:iconst_0        
	//   76  154:anewarray       Class[]
	//   77  157:invokestatic    #170 <Method com.google.firebase.components.a com.google.firebase.components.a.a(Object, Class, Class[])>
	//   78  160:aastore         
	//   79  161:dup             
	//   80  162:iconst_1        
	//   81  163:aload_0         
	//   82  164:ldc1            #2   <Class FirebaseApp>
	//   83  166:iconst_0        
	//   84  167:anewarray       Class[]
	//   85  170:invokestatic    #170 <Method com.google.firebase.components.a com.google.firebase.components.a.a(Object, Class, Class[])>
	//   86  173:aastore         
	//   87  174:dup             
	//   88  175:iconst_2        
	//   89  176:aload_3         
	//   90  177:ldc1            #133 <Class h>
	//   91  179:iconst_0        
	//   92  180:anewarray       Class[]
	//   93  183:invokestatic    #170 <Method com.google.firebase.components.a com.google.firebase.components.a.a(Object, Class, Class[])>
	//   94  186:aastore         
	//   95  187:invokespecial   #173 <Method void o(Executor, Iterable, com.google.firebase.components.a[])>
	//   96  190:putfield        #175 <Field o l>
		n = (c)l.a(com/google/firebase/a/c);
	//   97  193:aload_0         
	//   98  194:aload_0         
	//   99  195:getfield        #175 <Field o l>
	//  100  198:ldc1            #177 <Class c>
	//  101  200:invokevirtual   #180 <Method Object o.a(Class)>
	//  102  203:checkcast       #177 <Class c>
	//  103  206:putfield        #182 <Field c n>
	//  104  209:return          
	}

	public static FirebaseApp a(Context context)
	{
label0:
		{
			synchronized(g)
	//*   0    0:getstatic       #84  <Field Object g>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
			{
				if(!a.containsKey("[DEFAULT]"))
					break label0;
	//    4    6:getstatic       #96  <Field Map a>
	//    5    9:ldc1            #185 <String "[DEFAULT]">
	//    6   11:invokeinterface #191 <Method boolean Map.containsKey(Object)>
	//    7   16:ifeq            27
				context = ((Context) (getInstance()));
	//    8   19:invokestatic    #195 <Method FirebaseApp getInstance()>
	//    9   22:astore_0        
			}
	//   10   23:aload_1         
	//   11   24:monitorexit     
			return ((FirebaseApp) (context));
	//   12   25:aload_0         
	//   13   26:areturn         
		}
		h h1 = com.google.firebase.h.a(context);
	//   14   27:aload_0         
	//   15   28:invokestatic    #198 <Method h com.google.firebase.h.a(Context)>
	//   16   31:astore_2        
		if(h1 != null)
			break MISSING_BLOCK_LABEL_48;
	//   17   32:aload_2         
	//   18   33:ifnonnull       48
		Log.d("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
	//   19   36:ldc1            #200 <String "FirebaseApp">
	//   20   38:ldc1            #202 <String "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.">
	//   21   40:invokestatic    #207 <Method int Log.d(String, String)>
	//   22   43:pop             
		obj;
	//   23   44:aload_1         
		JVM INSTR monitorexit ;
	//   24   45:monitorexit     
		return null;
	//   25   46:aconst_null     
	//   26   47:areturn         
		context = ((Context) (a(context, h1)));
	//   27   48:aload_0         
	//   28   49:aload_2         
	//   29   50:invokestatic    #210 <Method FirebaseApp a(Context, h)>
	//   30   53:astore_0        
		obj;
	//   31   54:aload_1         
		JVM INSTR monitorexit ;
	//   32   55:monitorexit     
		return ((FirebaseApp) (context));
	//   33   56:aload_0         
	//   34   57:areturn         
		context;
	//   35   58:astore_0        
		obj;
	//   36   59:aload_1         
		JVM INSTR monitorexit ;
	//   37   60:monitorexit     
		throw context;
	//   38   61:aload_0         
	//   39   62:athrow          
	}

	public static FirebaseApp a(Context context, h h1)
	{
		return a(context, h1, "[DEFAULT]");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #185 <String "[DEFAULT]">
	//    3    4:invokestatic    #213 <Method FirebaseApp a(Context, h, String)>
	//    4    7:areturn         
	}

	public static FirebaseApp a(Context context, h h1, String s1)
	{
		com.google.firebase.d.a(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #218 <Method void com.google.firebase.d.a(Context)>
		s1 = s1.trim();
	//    2    4:aload_2         
	//    3    5:invokevirtual   #222 <Method String String.trim()>
	//    4    8:astore_2        
		if(context.getApplicationContext() != null)
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #226 <Method Context Context.getApplicationContext()>
	//*   7   13:ifnonnull       19
	//*   8   16:goto            24
			context = context.getApplicationContext();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #226 <Method Context Context.getApplicationContext()>
	//   11   23:astore_0        
		Object obj = g;
	//   12   24:getstatic       #84  <Field Object g>
	//   13   27:astore          4
		obj;
	//   14   29:aload           4
		JVM INSTR monitorenter ;
	//   15   31:monitorenter    
		boolean flag;
		StringBuilder stringbuilder;
		if(!a.containsKey(((Object) (s1))))
	//*  16   32:getstatic       #96  <Field Map a>
	//*  17   35:aload_2         
	//*  18   36:invokeinterface #191 <Method boolean Map.containsKey(Object)>
	//*  19   41:ifne            128
			flag = true;
	//   20   44:iconst_1        
	//   21   45:istore_3        
		else
	//*  22   46:goto            49
	//*  23   49:new             #228 <Class StringBuilder>
	//*  24   52:dup             
	//*  25   53:ldc1            #230 <String "FirebaseApp name ">
	//*  26   55:invokespecial   #233 <Method void StringBuilder(String)>
	//*  27   58:astore          5
	//*  28   60:aload           5
	//*  29   62:aload_2         
	//*  30   63:invokevirtual   #237 <Method StringBuilder StringBuilder.append(String)>
	//*  31   66:pop             
	//*  32   67:aload           5
	//*  33   69:ldc1            #239 <String " already exists!">
	//*  34   71:invokevirtual   #237 <Method StringBuilder StringBuilder.append(String)>
	//*  35   74:pop             
	//*  36   75:iload_3         
	//*  37   76:aload           5
	//*  38   78:invokevirtual   #242 <Method String StringBuilder.toString()>
	//*  39   81:invokestatic    #245 <Method void am.a(boolean, Object)>
	//*  40   84:aload_0         
	//*  41   85:ldc1            #247 <String "Application context cannot be null.">
	//*  42   87:invokestatic    #250 <Method Object am.a(Object, Object)>
	//*  43   90:pop             
	//*  44   91:new             #2   <Class FirebaseApp>
	//*  45   94:dup             
	//*  46   95:aload_0         
	//*  47   96:aload_2         
	//*  48   97:aload_1         
	//*  49   98:invokespecial   #252 <Method void FirebaseApp(Context, String, h)>
	//*  50  101:astore_0        
	//*  51  102:getstatic       #96  <Field Map a>
	//*  52  105:aload_2         
	//*  53  106:aload_0         
	//*  54  107:invokeinterface #255 <Method Object Map.put(Object, Object)>
	//*  55  112:pop             
	//*  56  113:aload           4
	//*  57  115:monitorexit     
	//*  58  116:aload_0         
	//*  59  117:invokespecial   #257 <Method void h()>
	//*  60  120:aload_0         
	//*  61  121:areturn         
	//*  62  122:astore_0        
	//*  63  123:aload           4
	//*  64  125:monitorexit     
	//*  65  126:aload_0         
	//*  66  127:athrow          
			flag = false;
	//   67  128:iconst_0        
	//   68  129:istore_3        
		stringbuilder = new StringBuilder("FirebaseApp name ");
		stringbuilder.append(s1);
		stringbuilder.append(" already exists!");
		am.a(flag, ((Object) (stringbuilder.toString())));
		am.a(((Object) (context)), "Application context cannot be null.");
		context = ((Context) (new FirebaseApp(context, s1, h1)));
		a.put(((Object) (s1)), ((Object) (context)));
		obj;
		JVM INSTR monitorexit ;
		((FirebaseApp) (context)).h();
		return ((FirebaseApp) (context));
		context;
		obj;
		JVM INSTR monitorexit ;
		throw context;
	//*  69  130:goto            49
	}

	static void a(FirebaseApp firebaseapp)
	{
		firebaseapp.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #257 <Method void h()>
	//    2    4:return          
	}

	static void a(FirebaseApp firebaseapp, boolean flag)
	{
		firebaseapp.a(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #261 <Method void a(boolean)>
	//    3    5:return          
	}

	private static void a(Class class1, Object obj, Iterable iterable, boolean flag)
	{
		Iterator iterator = iterable.iterator();
	//    0    0:aload_2         
	//    1    1:invokeinterface #276 <Method Iterator Iterable.iterator()>
	//    2    6:astore          5
_L5:
		if(!iterator.hasNext()) goto _L2; else goto _L1
	//    3    8:aload           5
	//    4   10:invokeinterface #281 <Method boolean Iterator.hasNext()>
	//    5   15:ifeq            276
_L1:
		iterable = ((Iterable) ((String)iterator.next()));
	//    6   18:aload           5
	//    7   20:invokeinterface #285 <Method Object Iterator.next()>
	//    8   25:checkcast       #45  <Class String>
	//    9   28:astore_2        
		if(!flag) goto _L4; else goto _L3
	//   10   29:iload_3         
	//   11   30:ifeq            45
_L3:
		if(!e.contains(((Object) (iterable)))) goto _L5; else goto _L4
	//   12   33:getstatic       #73  <Field List e>
	//   13   36:aload_2         
	//   14   37:invokeinterface #290 <Method boolean List.contains(Object)>
	//   15   42:ifeq            8
_L4:
		Method method = Class.forName(((String) (iterable))).getMethod("getInstance", new Class[] {
			class1
		});
	//   16   45:aload_2         
	//   17   46:invokestatic    #294 <Method Class Class.forName(String)>
	//   18   49:ldc2            #295 <String "getInstance">
	//   19   52:iconst_1        
	//   20   53:anewarray       Class[]
	//   21   56:dup             
	//   22   57:iconst_0        
	//   23   58:aload_0         
	//   24   59:aastore         
	//   25   60:invokevirtual   #299 <Method Method Class.getMethod(String, Class[])>
	//   26   63:astore          6
		int i1 = method.getModifiers();
	//   27   65:aload           6
	//   28   67:invokevirtual   #305 <Method int Method.getModifiers()>
	//   29   70:istore          4
		if(Modifier.isPublic(i1) && Modifier.isStatic(i1))
	//*  30   72:iload           4
	//*  31   74:invokestatic    #311 <Method boolean Modifier.isPublic(int)>
	//*  32   77:ifeq            8
	//*  33   80:iload           4
	//*  34   82:invokestatic    #314 <Method boolean Modifier.isStatic(int)>
	//*  35   85:ifeq            8
			method.invoke(((Object) (null)), new Object[] {
				obj
			});
	//   36   88:aload           6
	//   37   90:aconst_null     
	//   38   91:iconst_1        
	//   39   92:anewarray       Object[]
	//   40   95:dup             
	//   41   96:iconst_0        
	//   42   97:aload_1         
	//   43   98:aastore         
	//   44   99:invokevirtual   #318 <Method Object Method.invoke(Object, Object[])>
	//   45  102:pop             
		  goto _L5
	//*  46  103:goto            8
		Object obj1;
		obj1;
	//   47  106:astore          6
		StringBuilder stringbuilder1 = new StringBuilder("Failed to initialize ");
	//   48  108:new             #228 <Class StringBuilder>
	//   49  111:dup             
	//   50  112:ldc2            #320 <String "Failed to initialize ">
	//   51  115:invokespecial   #233 <Method void StringBuilder(String)>
	//   52  118:astore          7
		stringbuilder1.append(((String) (iterable)));
	//   53  120:aload           7
	//   54  122:aload_2         
	//   55  123:invokevirtual   #237 <Method StringBuilder StringBuilder.append(String)>
	//   56  126:pop             
		Log.wtf("FirebaseApp", stringbuilder1.toString(), ((Throwable) (obj1)));
	//   57  127:ldc1            #200 <String "FirebaseApp">
	//   58  129:aload           7
	//   59  131:invokevirtual   #242 <Method String StringBuilder.toString()>
	//   60  134:aload           6
	//   61  136:invokestatic    #324 <Method int Log.wtf(String, String, Throwable)>
	//   62  139:pop             
		  goto _L5
	//*  63  140:goto            8
		iterable;
	//   64  143:astore_2        
		Log.wtf("FirebaseApp", "Firebase API initialization failure.", ((Throwable) (iterable)));
	//   65  144:ldc1            #200 <String "FirebaseApp">
	//   66  146:ldc2            #326 <String "Firebase API initialization failure.">
	//   67  149:aload_2         
	//   68  150:invokestatic    #324 <Method int Log.wtf(String, String, Throwable)>
	//   69  153:pop             
		  goto _L5
	//*  70  154:goto            8
_L7:
		class1 = ((Class) (new StringBuilder()));
	//   71  157:new             #228 <Class StringBuilder>
	//   72  160:dup             
	//   73  161:invokespecial   #327 <Method void StringBuilder()>
	//   74  164:astore_0        
		((StringBuilder) (class1)).append(((String) (iterable)));
	//   75  165:aload_0         
	//   76  166:aload_2         
	//   77  167:invokevirtual   #237 <Method StringBuilder StringBuilder.append(String)>
	//   78  170:pop             
		((StringBuilder) (class1)).append("#getInstance has been removed by Proguard. Add keep rule to prevent it.");
	//   79  171:aload_0         
	//   80  172:ldc2            #329 <String "#getInstance has been removed by Proguard. Add keep rule to prevent it.">
	//   81  175:invokevirtual   #237 <Method StringBuilder StringBuilder.append(String)>
	//   82  178:pop             
		throw new IllegalStateException(((StringBuilder) (class1)).toString());
	//   83  179:new             #331 <Class IllegalStateException>
	//   84  182:dup             
	//   85  183:aload_0         
	//   86  184:invokevirtual   #242 <Method String StringBuilder.toString()>
	//   87  187:invokespecial   #332 <Method void IllegalStateException(String)>
	//   88  190:athrow          
_L6:
		if(!f.contains(((Object) (iterable))))
	//*  89  191:getstatic       #79  <Field Set f>
	//*  90  194:aload_2         
	//*  91  195:invokeinterface #335 <Method boolean Set.contains(Object)>
	//*  92  200:ifne            242
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   93  203:new             #228 <Class StringBuilder>
	//   94  206:dup             
	//   95  207:invokespecial   #327 <Method void StringBuilder()>
	//   96  210:astore          6
			stringbuilder.append(((String) (iterable)));
	//   97  212:aload           6
	//   98  214:aload_2         
	//   99  215:invokevirtual   #237 <Method StringBuilder StringBuilder.append(String)>
	//  100  218:pop             
			stringbuilder.append(" is not linked. Skipping initialization.");
	//  101  219:aload           6
	//  102  221:ldc2            #337 <String " is not linked. Skipping initialization.">
	//  103  224:invokevirtual   #237 <Method StringBuilder StringBuilder.append(String)>
	//  104  227:pop             
			Log.d("FirebaseApp", stringbuilder.toString());
	//  105  228:ldc1            #200 <String "FirebaseApp">
	//  106  230:aload           6
	//  107  232:invokevirtual   #242 <Method String StringBuilder.toString()>
	//  108  235:invokestatic    #207 <Method int Log.d(String, String)>
	//  109  238:pop             
		} else
	//* 110  239:goto            8
		{
			class1 = ((Class) (new StringBuilder()));
	//  111  242:new             #228 <Class StringBuilder>
	//  112  245:dup             
	//  113  246:invokespecial   #327 <Method void StringBuilder()>
	//  114  249:astore_0        
			((StringBuilder) (class1)).append(((String) (iterable)));
	//  115  250:aload_0         
	//  116  251:aload_2         
	//  117  252:invokevirtual   #237 <Method StringBuilder StringBuilder.append(String)>
	//  118  255:pop             
			((StringBuilder) (class1)).append(" is missing, but is required. Check if it has been removed by Proguard.");
	//  119  256:aload_0         
	//  120  257:ldc2            #339 <String " is missing, but is required. Check if it has been removed by Proguard.">
	//  121  260:invokevirtual   #237 <Method StringBuilder StringBuilder.append(String)>
	//  122  263:pop             
			throw new IllegalStateException(((StringBuilder) (class1)).toString());
	//  123  264:new             #331 <Class IllegalStateException>
	//  124  267:dup             
	//  125  268:aload_0         
	//  126  269:invokevirtual   #242 <Method String StringBuilder.toString()>
	//  127  272:invokespecial   #332 <Method void IllegalStateException(String)>
	//  128  275:athrow          
		}
		  goto _L5
_L2:
		return;
	//  129  276:return          
		stringbuilder;
	//  130  277:astore          6
		  goto _L6
	//* 131  279:goto            191
		class1;
	//  132  282:astore_0        
		  goto _L7
	//* 133  283:goto            157
	}

	private void a(boolean flag)
	{
		Log.d("FirebaseApp", "Notifying background state change listeners.");
	//    0    0:ldc1            #200 <String "FirebaseApp">
	//    1    2:ldc2            #341 <String "Notifying background state change listeners.">
	//    2    5:invokestatic    #207 <Method int Log.d(String, String)>
	//    3    8:pop             
		for(Iterator iterator = s.iterator(); iterator.hasNext(); ((com.google.firebase.b)iterator.next()).a(flag));
	//    4    9:aload_0         
	//    5   10:getfield        #115 <Field List s>
	//    6   13:invokeinterface #342 <Method Iterator List.iterator()>
	//    7   18:astore_2        
	//    8   19:aload_2         
	//    9   20:invokeinterface #281 <Method boolean Iterator.hasNext()>
	//   10   25:ifeq            46
	//   11   28:aload_2         
	//   12   29:invokeinterface #285 <Method Object Iterator.next()>
	//   13   34:checkcast       #344 <Class com.google.firebase.b>
	//   14   37:iload_1         
	//   15   38:invokeinterface #345 <Method void com.google.firebase.b.a(boolean)>
	//*  16   43:goto            19
	//   17   46:return          
	}

	static AtomicBoolean b(FirebaseApp firebaseapp)
	{
		return firebaseapp.o;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field AtomicBoolean o>
	//    2    4:areturn         
	}

	static Object e()
	{
		return g;
	//    0    0:getstatic       #84  <Field Object g>
	//    1    3:areturn         
	}

	private boolean f()
	{
		if(m.contains("firebase_data_collection_default_enabled"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #148 <Field SharedPreferences m>
	//*   2    4:ldc2            #350 <String "firebase_data_collection_default_enabled">
	//*   3    7:invokeinterface #355 <Method boolean SharedPreferences.contains(String)>
	//*   4   12:ifeq            29
			return m.getBoolean("firebase_data_collection_default_enabled", true);
	//    5   15:aload_0         
	//    6   16:getfield        #148 <Field SharedPreferences m>
	//    7   19:ldc2            #350 <String "firebase_data_collection_default_enabled">
	//    8   22:iconst_1        
	//    9   23:invokeinterface #359 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   10   28:ireturn         
		boolean flag;
		Object obj;
		try
		{
			obj = ((Object) (i.getPackageManager()));
	//   11   29:aload_0         
	//   12   30:getfield        #126 <Field Context i>
	//   13   33:invokevirtual   #363 <Method PackageManager Context.getPackageManager()>
	//   14   36:astore_2        
		}
	//*  15   37:aload_2         
	//*  16   38:ifnull          93
	//*  17   41:aload_2         
	//*  18   42:aload_0         
	//*  19   43:getfield        #126 <Field Context i>
	//*  20   46:invokevirtual   #366 <Method String Context.getPackageName()>
	//*  21   49:sipush          128
	//*  22   52:invokevirtual   #372 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//*  23   55:astore_2        
	//*  24   56:aload_2         
	//*  25   57:ifnull          93
	//*  26   60:aload_2         
	//*  27   61:getfield        #378 <Field Bundle ApplicationInfo.metaData>
	//*  28   64:ifnull          93
	//*  29   67:aload_2         
	//*  30   68:getfield        #378 <Field Bundle ApplicationInfo.metaData>
	//*  31   71:ldc2            #350 <String "firebase_data_collection_default_enabled">
	//*  32   74:invokevirtual   #382 <Method boolean Bundle.containsKey(String)>
	//*  33   77:ifeq            93
	//*  34   80:aload_2         
	//*  35   81:getfield        #378 <Field Bundle ApplicationInfo.metaData>
	//*  36   84:ldc2            #350 <String "firebase_data_collection_default_enabled">
	//*  37   87:invokevirtual   #384 <Method boolean Bundle.getBoolean(String)>
	//*  38   90:istore_1        
	//*  39   91:iload_1         
	//*  40   92:ireturn         
	//*  41   93:iconst_1        
	//*  42   94:ireturn         
		catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
	//*  43   95:astore_2        
		{
			return true;
	//   44   96:iconst_1        
	//   45   97:ireturn         
		}
		if(obj == null)
			break MISSING_BLOCK_LABEL_93;
		obj = ((Object) (((PackageManager) (obj)).getApplicationInfo(i.getPackageName(), 128)));
		if(obj == null)
			break MISSING_BLOCK_LABEL_93;
		if(((ApplicationInfo) (obj)).metaData == null || !((ApplicationInfo) (obj)).metaData.containsKey("firebase_data_collection_default_enabled"))
			break MISSING_BLOCK_LABEL_93;
		flag = ((ApplicationInfo) (obj)).metaData.getBoolean("firebase_data_collection_default_enabled");
		return flag;
		return true;
	}

	private void g()
	{
		am.a(p.get() ^ true, "FirebaseApp was deleted");
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field AtomicBoolean p>
	//    2    4:invokevirtual   #387 <Method boolean AtomicBoolean.get()>
	//    3    7:iconst_1        
	//    4    8:ixor            
	//    5    9:ldc2            #389 <String "FirebaseApp was deleted">
	//    6   12:invokestatic    #245 <Method void am.a(boolean, Object)>
	//    7   15:return          
	}

	public static FirebaseApp getInstance()
	{
		Object obj = g;
	//    0    0:getstatic       #84  <Field Object g>
	//    1    3:astore_0        
		obj;
	//    2    4:aload_0         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		FirebaseApp firebaseapp = (FirebaseApp)a.get("[DEFAULT]");
	//    4    6:getstatic       #96  <Field Map a>
	//    5    9:ldc1            #185 <String "[DEFAULT]">
	//    6   11:invokeinterface #391 <Method Object Map.get(Object)>
	//    7   16:checkcast       #2   <Class FirebaseApp>
	//    8   19:astore_1        
		if(firebaseapp == null)
			break MISSING_BLOCK_LABEL_28;
	//    9   20:aload_1         
	//   10   21:ifnull          28
		obj;
	//   11   24:aload_0         
		JVM INSTR monitorexit ;
	//   12   25:monitorexit     
		return firebaseapp;
	//   13   26:aload_1         
	//   14   27:areturn         
		StringBuilder stringbuilder = new StringBuilder("Default FirebaseApp is not initialized in this process ");
	//   15   28:new             #228 <Class StringBuilder>
	//   16   31:dup             
	//   17   32:ldc2            #393 <String "Default FirebaseApp is not initialized in this process ">
	//   18   35:invokespecial   #233 <Method void StringBuilder(String)>
	//   19   38:astore_1        
		stringbuilder.append(com.google.android.gms.common.util.q.a());
	//   20   39:aload_1         
	//   21   40:invokestatic    #397 <Method String q.a()>
	//   22   43:invokevirtual   #237 <Method StringBuilder StringBuilder.append(String)>
	//   23   46:pop             
		stringbuilder.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
	//   24   47:aload_1         
	//   25   48:ldc2            #399 <String ". Make sure to call FirebaseApp.initializeApp(Context) first.">
	//   26   51:invokevirtual   #237 <Method StringBuilder StringBuilder.append(String)>
	//   27   54:pop             
		throw new IllegalStateException(stringbuilder.toString());
	//   28   55:new             #331 <Class IllegalStateException>
	//   29   58:dup             
	//   30   59:aload_1         
	//   31   60:invokevirtual   #242 <Method String StringBuilder.toString()>
	//   32   63:invokespecial   #332 <Method void IllegalStateException(String)>
	//   33   66:athrow          
		Exception exception;
		exception;
	//   34   67:astore_1        
		obj;
	//   35   68:aload_0         
		JVM INSTR monitorexit ;
	//   36   69:monitorexit     
		throw exception;
	//   37   70:aload_1         
	//   38   71:athrow          
	}

	private void h()
	{
		boolean flag = android.support.v4.a.c.b(i);
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field Context i>
	//    2    4:invokestatic    #404 <Method boolean android.support.v4.a.c.b(Context)>
	//    3    7:istore_1        
		if(flag)
	//*   4    8:iload_1         
	//*   5    9:ifeq            22
			com.google.firebase.f.a(i);
	//    6   12:aload_0         
	//    7   13:getfield        #126 <Field Context i>
	//    8   16:invokestatic    #407 <Method void com.google.firebase.f.a(Context)>
		else
	//*   9   19:goto            33
			l.a(d());
	//   10   22:aload_0         
	//   11   23:getfield        #175 <Field o l>
	//   12   26:aload_0         
	//   13   27:invokevirtual   #409 <Method boolean d()>
	//   14   30:invokevirtual   #410 <Method void o.a(boolean)>
		a(com/google/firebase/FirebaseApp, ((Object) (this)), ((Iterable) (b)), flag);
	//   15   33:ldc1            #2   <Class FirebaseApp>
	//   16   35:aload_0         
	//   17   36:getstatic       #57  <Field List b>
	//   18   39:iload_1         
	//   19   40:invokestatic    #412 <Method void a(Class, Object, Iterable, boolean)>
		if(d())
	//*  20   43:aload_0         
	//*  21   44:invokevirtual   #409 <Method boolean d()>
	//*  22   47:ifeq            73
		{
			a(com/google/firebase/FirebaseApp, ((Object) (this)), ((Iterable) (c)), flag);
	//   23   50:ldc1            #2   <Class FirebaseApp>
	//   24   52:aload_0         
	//   25   53:getstatic       #67  <Field List c>
	//   26   56:iload_1         
	//   27   57:invokestatic    #412 <Method void a(Class, Object, Iterable, boolean)>
			a(android/content/Context, ((Object) (i)), ((Iterable) (d)), flag);
	//   28   60:ldc1            #124 <Class Context>
	//   29   62:aload_0         
	//   30   63:getfield        #126 <Field Context i>
	//   31   66:getstatic       #71  <Field List d>
	//   32   69:iload_1         
	//   33   70:invokestatic    #412 <Method void a(Class, Object, Iterable, boolean)>
		}
	//   34   73:return          
	}

	public Context a()
	{
		g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #414 <Method void g()>
		return i;
	//    2    4:aload_0         
	//    3    5:getfield        #126 <Field Context i>
	//    4    8:areturn         
	}

	public Object a(Class class1)
	{
		g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #414 <Method void g()>
		return l.a(class1);
	//    2    4:aload_0         
	//    3    5:getfield        #175 <Field o l>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #180 <Method Object o.a(Class)>
	//    6   12:areturn         
	}

	public String b()
	{
		g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #414 <Method void g()>
		return j;
	//    2    4:aload_0         
	//    3    5:getfield        #131 <Field String j>
	//    4    8:areturn         
	}

	public h c()
	{
		g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #414 <Method void g()>
		return k;
	//    2    4:aload_0         
	//    3    5:getfield        #135 <Field h k>
	//    4    8:areturn         
	}

	public boolean d()
	{
		return "[DEFAULT]".equals(((Object) (b())));
	//    0    0:ldc1            #185 <String "[DEFAULT]">
	//    1    2:aload_0         
	//    2    3:invokevirtual   #417 <Method String b()>
	//    3    6:invokevirtual   #420 <Method boolean String.equals(Object)>
	//    4    9:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof FirebaseApp))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class FirebaseApp>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return j.equals(((Object) (((FirebaseApp)obj).b())));
	//    5    9:aload_0         
	//    6   10:getfield        #131 <Field String j>
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class FirebaseApp>
	//    9   17:invokevirtual   #417 <Method String b()>
	//   10   20:invokevirtual   #420 <Method boolean String.equals(Object)>
	//   11   23:ireturn         
	}

	public int hashCode()
	{
		return j.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field String j>
	//    2    4:invokevirtual   #423 <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public boolean isDataCollectionDefaultEnabled()
	{
		g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #414 <Method void g()>
		return q.get();
	//    2    4:aload_0         
	//    3    5:getfield        #153 <Field AtomicBoolean q>
	//    4    8:invokevirtual   #387 <Method boolean AtomicBoolean.get()>
	//    5   11:ireturn         
	}

	public String toString()
	{
		return ak.a(((Object) (this))).a("name", ((Object) (j))).a("options", ((Object) (k))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #429 <Method al ak.a(Object)>
	//    2    4:ldc2            #431 <String "name">
	//    3    7:aload_0         
	//    4    8:getfield        #131 <Field String j>
	//    5   11:invokevirtual   #436 <Method al al.a(String, Object)>
	//    6   14:ldc2            #438 <String "options">
	//    7   17:aload_0         
	//    8   18:getfield        #135 <Field h k>
	//    9   21:invokevirtual   #436 <Method al al.a(String, Object)>
	//   10   24:invokevirtual   #439 <Method String al.toString()>
	//   11   27:areturn         
	}

	static final Map a = new a();
	private static final List b = Arrays.asList(((Object []) (new String[] {
		"com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId"
	})));
	private static final List c = Collections.singletonList("com.google.firebase.crash.FirebaseCrash");
	private static final List d = Arrays.asList(((Object []) (new String[] {
		"com.google.android.gms.measurement.AppMeasurement"
	})));
	private static final List e = Arrays.asList(((Object []) (new String[0])));
	private static final Set f = Collections.emptySet();
	private static final Object g = new Object();
	private static final Executor h = new e((byte)0);
	private final Context i;
	private final String j;
	private final h k;
	private final o l;
	private final SharedPreferences m;
	private final c n;
	private final AtomicBoolean o = new AtomicBoolean(false);
	private final AtomicBoolean p = new AtomicBoolean();
	private final AtomicBoolean q = new AtomicBoolean(f());
	private final List r = new CopyOnWriteArrayList();
	private final List s = new CopyOnWriteArrayList();
	private final List t = new CopyOnWriteArrayList();
	private com.google.firebase.c u;

	static 
	{
	//    0    0:iconst_2        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #47  <String "com.google.firebase.auth.FirebaseAuth">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #49  <String "com.google.firebase.iid.FirebaseInstanceId">
	//    9   13:aastore         
	//   10   14:invokestatic    #55  <Method List Arrays.asList(Object[])>
	//   11   17:putstatic       #57  <Field List b>
	//   12   20:ldc1            #59  <String "com.google.firebase.crash.FirebaseCrash">
	//   13   22:invokestatic    #65  <Method List Collections.singletonList(Object)>
	//   14   25:putstatic       #67  <Field List c>
	//   15   28:iconst_1        
	//   16   29:anewarray       String[]
	//   17   32:dup             
	//   18   33:iconst_0        
	//   19   34:ldc1            #69  <String "com.google.android.gms.measurement.AppMeasurement">
	//   20   36:aastore         
	//   21   37:invokestatic    #55  <Method List Arrays.asList(Object[])>
	//   22   40:putstatic       #71  <Field List d>
	//   23   43:iconst_0        
	//   24   44:anewarray       String[]
	//   25   47:invokestatic    #55  <Method List Arrays.asList(Object[])>
	//   26   50:putstatic       #73  <Field List e>
	//   27   53:invokestatic    #77  <Method Set Collections.emptySet()>
	//   28   56:putstatic       #79  <Field Set f>
	//   29   59:new             #4   <Class Object>
	//   30   62:dup             
	//   31   63:invokespecial   #82  <Method void Object()>
	//   32   66:putstatic       #84  <Field Object g>
	//   33   69:new             #86  <Class e>
	//   34   72:dup             
	//   35   73:iconst_0        
	//   36   74:invokespecial   #89  <Method void e(byte)>
	//   37   77:putstatic       #91  <Field Executor h>
	//   38   80:new             #93  <Class a>
	//   39   83:dup             
	//   40   84:invokespecial   #94  <Method void a()>
	//   41   87:putstatic       #96  <Field Map a>
	//*  42   90:return          
	}
}
