// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamite;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.c.d;
import com.google.android.gms.common.e;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.util.g;
import java.lang.reflect.*;

// Referenced classes of package com.google.android.gms.dynamite:
//			g, h, i, j, 
//			k, l, m, a, 
//			n, q, e, b, 
//			d, f, o, p, 
//			r, c

public final class DynamiteModule
{

	private DynamiteModule(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #78  <Method void Object()>
		n = (Context)am.a(((Object) (context)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #83  <Method Object am.a(Object)>
	//    5    9:checkcast       #85  <Class Context>
	//    6   12:putfield        #87  <Field Context n>
	//    7   15:return          
	}

	public static int a(Context context, String s)
	{
		Object obj;
		context = ((Context) (context.getApplicationContext().getClassLoader()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #96  <Method Context Context.getApplicationContext()>
	//    2    4:invokevirtual   #100 <Method ClassLoader Context.getClassLoader()>
	//    3    7:astore_0        
		obj = ((Object) (new StringBuilder(String.valueOf(((Object) (s))).length() + 61)));
	//    4    8:new             #102 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokestatic    #108 <Method String String.valueOf(Object)>
	//    8   16:invokevirtual   #112 <Method int String.length()>
	//    9   19:bipush          61
	//   10   21:iadd            
	//   11   22:invokespecial   #115 <Method void StringBuilder(int)>
	//   12   25:astore_3        
		((StringBuilder) (obj)).append("com.google.android.gms.dynamite.descriptors.");
	//   13   26:aload_3         
	//   14   27:ldc1            #117 <String "com.google.android.gms.dynamite.descriptors.">
	//   15   29:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		((StringBuilder) (obj)).append(s);
	//   17   33:aload_3         
	//   18   34:aload_1         
	//   19   35:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
		((StringBuilder) (obj)).append(".ModuleDescriptor");
	//   21   39:aload_3         
	//   22   40:ldc1            #123 <String ".ModuleDescriptor">
	//   23   42:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   24   45:pop             
		obj = ((Object) (((ClassLoader) (context)).loadClass(((StringBuilder) (obj)).toString())));
	//   25   46:aload_0         
	//   26   47:aload_3         
	//   27   48:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   28   51:invokevirtual   #133 <Method Class ClassLoader.loadClass(String)>
	//   29   54:astore_3        
		context = ((Context) (((Class) (obj)).getDeclaredField("MODULE_ID")));
	//   30   55:aload_3         
	//   31   56:ldc1            #135 <String "MODULE_ID">
	//   32   58:invokevirtual   #141 <Method Field Class.getDeclaredField(String)>
	//   33   61:astore_0        
		obj = ((Object) (((Class) (obj)).getDeclaredField("MODULE_VERSION")));
	//   34   62:aload_3         
	//   35   63:ldc1            #143 <String "MODULE_VERSION">
	//   36   65:invokevirtual   #141 <Method Field Class.getDeclaredField(String)>
	//   37   68:astore_3        
		if(((Field) (context)).get(((Object) (null))).equals(((Object) (s))))
			break MISSING_BLOCK_LABEL_161;
	//   38   69:aload_0         
	//   39   70:aconst_null     
	//   40   71:invokevirtual   #148 <Method Object Field.get(Object)>
	//   41   74:aload_1         
	//   42   75:invokevirtual   #152 <Method boolean Object.equals(Object)>
	//   43   78:ifne            161
		context = ((Context) (String.valueOf(((Field) (context)).get(((Object) (null))))));
	//   44   81:aload_0         
	//   45   82:aconst_null     
	//   46   83:invokevirtual   #148 <Method Object Field.get(Object)>
	//   47   86:invokestatic    #108 <Method String String.valueOf(Object)>
	//   48   89:astore_0        
		obj = ((Object) (new StringBuilder(String.valueOf(((Object) (context))).length() + 51 + String.valueOf(((Object) (s))).length())));
	//   49   90:new             #102 <Class StringBuilder>
	//   50   93:dup             
	//   51   94:aload_0         
	//   52   95:invokestatic    #108 <Method String String.valueOf(Object)>
	//   53   98:invokevirtual   #112 <Method int String.length()>
	//   54  101:bipush          51
	//   55  103:iadd            
	//   56  104:aload_1         
	//   57  105:invokestatic    #108 <Method String String.valueOf(Object)>
	//   58  108:invokevirtual   #112 <Method int String.length()>
	//   59  111:iadd            
	//   60  112:invokespecial   #115 <Method void StringBuilder(int)>
	//   61  115:astore_3        
		((StringBuilder) (obj)).append("Module descriptor id '");
	//   62  116:aload_3         
	//   63  117:ldc1            #154 <String "Module descriptor id '">
	//   64  119:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   65  122:pop             
		((StringBuilder) (obj)).append(((String) (context)));
	//   66  123:aload_3         
	//   67  124:aload_0         
	//   68  125:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   69  128:pop             
		((StringBuilder) (obj)).append("' didn't match expected id '");
	//   70  129:aload_3         
	//   71  130:ldc1            #156 <String "' didn't match expected id '">
	//   72  132:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   73  135:pop             
		((StringBuilder) (obj)).append(s);
	//   74  136:aload_3         
	//   75  137:aload_1         
	//   76  138:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   77  141:pop             
		((StringBuilder) (obj)).append("'");
	//   78  142:aload_3         
	//   79  143:ldc1            #158 <String "'">
	//   80  145:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   81  148:pop             
		Log.e("DynamiteModule", ((StringBuilder) (obj)).toString());
	//   82  149:ldc1            #160 <String "DynamiteModule">
	//   83  151:aload_3         
	//   84  152:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   85  155:invokestatic    #165 <Method int Log.e(String, String)>
	//   86  158:pop             
		return 0;
	//   87  159:iconst_0        
	//   88  160:ireturn         
		int i1;
		try
		{
			i1 = ((Field) (obj)).getInt(((Object) (null)));
	//   89  161:aload_3         
	//   90  162:aconst_null     
	//   91  163:invokevirtual   #169 <Method int Field.getInt(Object)>
	//   92  166:istore_2        
		}
	//*  93  167:iload_2         
	//*  94  168:ireturn         
	//*  95  169:astore_0        
	//*  96  170:aload_0         
	//*  97  171:invokevirtual   #172 <Method String Exception.getMessage()>
	//*  98  174:invokestatic    #108 <Method String String.valueOf(Object)>
	//*  99  177:astore_0        
	//* 100  178:aload_0         
	//* 101  179:invokevirtual   #112 <Method int String.length()>
	//* 102  182:ifeq            195
	//* 103  185:ldc1            #174 <String "Failed to load module descriptor class: ">
	//* 104  187:aload_0         
	//* 105  188:invokevirtual   #178 <Method String String.concat(String)>
	//* 106  191:astore_0        
	//* 107  192:goto            205
	//* 108  195:new             #104 <Class String>
	//* 109  198:dup             
	//* 110  199:ldc1            #174 <String "Failed to load module descriptor class: ">
	//* 111  201:invokespecial   #181 <Method void String(String)>
	//* 112  204:astore_0        
	//* 113  205:ldc1            #160 <String "DynamiteModule">
	//* 114  207:aload_0         
	//* 115  208:invokestatic    #165 <Method int Log.e(String, String)>
	//* 116  211:pop             
	//* 117  212:iconst_0        
	//* 118  213:ireturn         
	//* 119  214:new             #102 <Class StringBuilder>
	//* 120  217:dup             
	//* 121  218:aload_1         
	//* 122  219:invokestatic    #108 <Method String String.valueOf(Object)>
	//* 123  222:invokevirtual   #112 <Method int String.length()>
	//* 124  225:bipush          45
	//* 125  227:iadd            
	//* 126  228:invokespecial   #115 <Method void StringBuilder(int)>
	//* 127  231:astore_0        
	//* 128  232:aload_0         
	//* 129  233:ldc1            #183 <String "Local module descriptor class for ">
	//* 130  235:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//* 131  238:pop             
	//* 132  239:aload_0         
	//* 133  240:aload_1         
	//* 134  241:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//* 135  244:pop             
	//* 136  245:aload_0         
	//* 137  246:ldc1            #185 <String " not found.">
	//* 138  248:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//* 139  251:pop             
	//* 140  252:ldc1            #160 <String "DynamiteModule">
	//* 141  254:aload_0         
	//* 142  255:invokevirtual   #127 <Method String StringBuilder.toString()>
	//* 143  258:invokestatic    #188 <Method int Log.w(String, String)>
	//* 144  261:pop             
	//* 145  262:iconst_0        
	//* 146  263:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			context = ((Context) (new StringBuilder(String.valueOf(((Object) (s))).length() + 45)));
			((StringBuilder) (context)).append("Local module descriptor class for ");
			((StringBuilder) (context)).append(s);
			((StringBuilder) (context)).append(" not found.");
			Log.w("DynamiteModule", ((StringBuilder) (context)).toString());
			return 0;
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			context = ((Context) (String.valueOf(((Object) (((Exception) (context)).getMessage())))));
			if(((String) (context)).length() != 0)
				context = ((Context) ("Failed to load module descriptor class: ".concat(((String) (context)))));
			else
				context = ((Context) (new String("Failed to load module descriptor class: ")));
			Log.e("DynamiteModule", ((String) (context)));
			return 0;
		}
		return i1;
	//* 147  264:astore_0        
	//* 148  265:goto            214
	}

	public static int a(Context context, String s, boolean flag)
	{
		com/google/android/gms/dynamite/DynamiteModule;
	//    0    0:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Object obj1 = ((Object) (e));
	//    2    3:getstatic       #199 <Field Boolean e>
	//    3    6:astore          6
		Object obj = obj1;
	//    4    8:aload           6
	//    5   10:astore          5
		if(obj1 != null) goto _L2; else goto _L1
	//    6   12:aload           6
	//    7   14:ifnonnull       302
_L1:
		obj1 = ((Object) (context.getApplicationContext().getClassLoader().loadClass(((Class) (com/google/android/gms/dynamite/DynamiteModule$DynamiteLoaderClassLoader)).getName())));
	//    8   17:aload_0         
	//    9   18:invokevirtual   #96  <Method Context Context.getApplicationContext()>
	//   10   21:invokevirtual   #100 <Method ClassLoader Context.getClassLoader()>
	//   11   24:ldc1            #201 <Class DynamiteModule$DynamiteLoaderClassLoader>
	//   12   26:invokevirtual   #204 <Method String Class.getName()>
	//   13   29:invokevirtual   #133 <Method Class ClassLoader.loadClass(String)>
	//   14   32:astore          6
		obj = ((Object) (((Class) (obj1)).getDeclaredField("sClassLoader")));
	//   15   34:aload           6
	//   16   36:ldc1            #206 <String "sClassLoader">
	//   17   38:invokevirtual   #141 <Method Field Class.getDeclaredField(String)>
	//   18   41:astore          5
		obj1;
	//   19   43:aload           6
		JVM INSTR monitorenter ;
	//   20   45:monitorenter    
		ClassLoader classloader = (ClassLoader)((Field) (obj)).get(((Object) (null)));
	//   21   46:aload           5
	//   22   48:aconst_null     
	//   23   49:invokevirtual   #148 <Method Object Field.get(Object)>
	//   24   52:checkcast       #129 <Class ClassLoader>
	//   25   55:astore          7
		if(classloader == null) goto _L4; else goto _L3
	//   26   57:aload           7
	//   27   59:ifnull          91
_L3:
		if(classloader != ClassLoader.getSystemClassLoader()) goto _L6; else goto _L5
	//   28   62:aload           7
	//   29   64:invokestatic    #209 <Method ClassLoader ClassLoader.getSystemClassLoader()>
	//   30   67:if_acmpne       78
_L5:
		obj = ((Object) (Boolean.FALSE));
	//   31   70:getstatic       #214 <Field Boolean Boolean.FALSE>
	//   32   73:astore          5
		  goto _L7
	//*  33   75:goto            212
_L6:
		int i1;
		boolean flag1;
		try
		{
			a(classloader);
	//   34   78:aload           7
	//   35   80:invokestatic    #217 <Method void a(ClassLoader)>
		}
	//*  36   83:getstatic       #220 <Field Boolean Boolean.TRUE>
	//*  37   86:astore          5
	//*  38   88:goto            212
	//*  39   91:ldc1            #222 <String "com.google.android.gms">
	//*  40   93:aload_0         
	//*  41   94:invokevirtual   #96  <Method Context Context.getApplicationContext()>
	//*  42   97:invokevirtual   #225 <Method String Context.getPackageName()>
	//*  43  100:invokevirtual   #226 <Method boolean String.equals(Object)>
	//*  44  103:ifeq            123
	//*  45  106:aload           5
	//*  46  108:aconst_null     
	//*  47  109:invokestatic    #209 <Method ClassLoader ClassLoader.getSystemClassLoader()>
	//*  48  112:invokevirtual   #230 <Method void Field.set(Object, Object)>
	//*  49  115:getstatic       #214 <Field Boolean Boolean.FALSE>
	//*  50  118:astore          5
	//*  51  120:goto            212
	//*  52  123:aload_0         
	//*  53  124:aload_1         
	//*  54  125:iload_2         
	//*  55  126:invokestatic    #232 <Method int c(Context, String, boolean)>
	//*  56  129:istore_3        
	//*  57  130:getstatic       #234 <Field String h>
	//*  58  133:ifnull          190
	//*  59  136:getstatic       #234 <Field String h>
	//*  60  139:invokevirtual   #238 <Method boolean String.isEmpty()>
	//*  61  142:ifeq            148
	//*  62  145:goto            190
	//*  63  148:new             #240 <Class n>
	//*  64  151:dup             
	//*  65  152:getstatic       #234 <Field String h>
	//*  66  155:invokestatic    #209 <Method ClassLoader ClassLoader.getSystemClassLoader()>
	//*  67  158:invokespecial   #243 <Method void n(String, ClassLoader)>
	//*  68  161:astore          7
	//*  69  163:aload           7
	//*  70  165:invokestatic    #217 <Method void a(ClassLoader)>
	//*  71  168:aload           5
	//*  72  170:aconst_null     
	//*  73  171:aload           7
	//*  74  173:invokevirtual   #230 <Method void Field.set(Object, Object)>
	//*  75  176:getstatic       #220 <Field Boolean Boolean.TRUE>
	//*  76  179:putstatic       #199 <Field Boolean e>
	//*  77  182:aload           6
	//*  78  184:monitorexit     
	//*  79  185:ldc1            #2   <Class DynamiteModule>
	//*  80  187:monitorexit     
	//*  81  188:iload_3         
	//*  82  189:ireturn         
	//*  83  190:aload           6
	//*  84  192:monitorexit     
	//*  85  193:ldc1            #2   <Class DynamiteModule>
	//*  86  195:monitorexit     
	//*  87  196:iload_3         
	//*  88  197:ireturn         
	//*  89  198:aload           5
	//*  90  200:aconst_null     
	//*  91  201:invokestatic    #209 <Method ClassLoader ClassLoader.getSystemClassLoader()>
	//*  92  204:invokevirtual   #230 <Method void Field.set(Object, Object)>
	//*  93  207:getstatic       #214 <Field Boolean Boolean.FALSE>
	//*  94  210:astore          5
	//*  95  212:aload           6
	//*  96  214:monitorexit     
	//*  97  215:goto            297
	//*  98  218:astore          5
	//*  99  220:aload           6
	//* 100  222:monitorexit     
	//* 101  223:aload           5
	//* 102  225:athrow          
	//* 103  226:astore          5
	//* 104  228:goto            238
	//* 105  231:astore          5
	//* 106  233:goto            238
	//* 107  236:astore          5
	//* 108  238:aload           5
	//* 109  240:invokestatic    #108 <Method String String.valueOf(Object)>
	//* 110  243:astore          5
	//* 111  245:new             #102 <Class StringBuilder>
	//* 112  248:dup             
	//* 113  249:aload           5
	//* 114  251:invokestatic    #108 <Method String String.valueOf(Object)>
	//* 115  254:invokevirtual   #112 <Method int String.length()>
	//* 116  257:bipush          30
	//* 117  259:iadd            
	//* 118  260:invokespecial   #115 <Method void StringBuilder(int)>
	//* 119  263:astore          6
	//* 120  265:aload           6
	//* 121  267:ldc1            #245 <String "Failed to load module via V2: ">
	//* 122  269:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//* 123  272:pop             
	//* 124  273:aload           6
	//* 125  275:aload           5
	//* 126  277:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//* 127  280:pop             
	//* 128  281:ldc1            #160 <String "DynamiteModule">
	//* 129  283:aload           6
	//* 130  285:invokevirtual   #127 <Method String StringBuilder.toString()>
	//* 131  288:invokestatic    #188 <Method int Log.w(String, String)>
	//* 132  291:pop             
	//* 133  292:getstatic       #214 <Field Boolean Boolean.FALSE>
	//* 134  295:astore          5
	//* 135  297:aload           5
	//* 136  299:putstatic       #199 <Field Boolean e>
	//* 137  302:ldc1            #2   <Class DynamiteModule>
	//* 138  304:monitorexit     
	//* 139  305:aload           5
	//* 140  307:invokevirtual   #248 <Method boolean Boolean.booleanValue()>
	//* 141  310:istore          4
	//* 142  312:iload           4
	//* 143  314:ifeq            371
	//* 144  317:aload_0         
	//* 145  318:aload_1         
	//* 146  319:iload_2         
	//* 147  320:invokestatic    #232 <Method int c(Context, String, boolean)>
	//* 148  323:istore_3        
	//* 149  324:iload_3         
	//* 150  325:ireturn         
	//* 151  326:astore_1        
	//* 152  327:aload_1         
	//* 153  328:invokevirtual   #249 <Method String a.getMessage()>
	//* 154  331:invokestatic    #108 <Method String String.valueOf(Object)>
	//* 155  334:astore_1        
	//* 156  335:aload_1         
	//* 157  336:invokevirtual   #112 <Method int String.length()>
	//* 158  339:ifeq            352
	//* 159  342:ldc1            #251 <String "Failed to retrieve remote module version: ">
	//* 160  344:aload_1         
	//* 161  345:invokevirtual   #178 <Method String String.concat(String)>
	//* 162  348:astore_1        
	//* 163  349:goto            362
	//* 164  352:new             #104 <Class String>
	//* 165  355:dup             
	//* 166  356:ldc1            #251 <String "Failed to retrieve remote module version: ">
	//* 167  358:invokespecial   #181 <Method void String(String)>
	//* 168  361:astore_1        
	//* 169  362:ldc1            #160 <String "DynamiteModule">
	//* 170  364:aload_1         
	//* 171  365:invokestatic    #188 <Method int Log.w(String, String)>
	//* 172  368:pop             
	//* 173  369:iconst_0        
	//* 174  370:ireturn         
	//* 175  371:aload_0         
	//* 176  372:aload_1         
	//* 177  373:iload_2         
	//* 178  374:invokestatic    #253 <Method int b(Context, String, boolean)>
	//* 179  377:istore_3        
	//* 180  378:iload_3         
	//* 181  379:ireturn         
	//* 182  380:astore_1        
	//* 183  381:ldc1            #2   <Class DynamiteModule>
	//* 184  383:monitorexit     
	//* 185  384:aload_1         
	//* 186  385:athrow          
	//* 187  386:astore_1        
	//* 188  387:aload_0         
	//* 189  388:aload_1         
	//* 190  389:invokestatic    #258 <Method boolean g.a(Context, Throwable)>
	//* 191  392:pop             
	//* 192  393:aload_1         
	//* 193  394:athrow          
		catch(a a1) { }
	//  194  395:astore          5
		obj = ((Object) (Boolean.TRUE));
		  goto _L7
_L4:
		if(!"com.google.android.gms".equals(((Object) (context.getApplicationContext().getPackageName())))) goto _L9; else goto _L8
_L8:
		((Field) (obj)).set(((Object) (null)), ((Object) (ClassLoader.getSystemClassLoader())));
		obj = ((Object) (Boolean.FALSE));
		  goto _L7
_L9:
		i1 = c(context, s, flag);
		if(h == null || h.isEmpty())
			break MISSING_BLOCK_LABEL_190;
		n n1 = new n(h, ClassLoader.getSystemClassLoader());
		a(((ClassLoader) (n1)));
		((Field) (obj)).set(((Object) (null)), ((Object) (n1)));
		e = Boolean.TRUE;
		obj1;
		JVM INSTR monitorexit ;
		com/google/android/gms/dynamite/DynamiteModule;
		JVM INSTR monitorexit ;
		return i1;
		obj1;
		JVM INSTR monitorexit ;
		com/google/android/gms/dynamite/DynamiteModule;
		JVM INSTR monitorexit ;
		return i1;
_L12:
		((Field) (obj)).set(((Object) (null)), ((Object) (ClassLoader.getSystemClassLoader())));
		obj = ((Object) (Boolean.FALSE));
_L7:
		obj1;
		JVM INSTR monitorexit ;
		  goto _L10
		obj;
		obj1;
		JVM INSTR monitorexit ;
		try
		{
			throw obj;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
		obj = ((Object) (String.valueOf(obj)));
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(obj).length() + 30);
		stringbuilder.append("Failed to load module via V2: ");
		stringbuilder.append(((String) (obj)));
		Log.w("DynamiteModule", stringbuilder.toString());
		obj = ((Object) (Boolean.FALSE));
_L10:
		e = ((Boolean) (obj));
_L2:
		com/google/android/gms/dynamite/DynamiteModule;
		JVM INSTR monitorexit ;
		flag1 = ((Boolean) (obj)).booleanValue();
		if(!flag1)
			break MISSING_BLOCK_LABEL_371;
		i1 = c(context, s, flag);
		return i1;
		s;
		s = String.valueOf(((Object) (((a) (s)).getMessage())));
		if(s.length() != 0)
		{
			s = "Failed to retrieve remote module version: ".concat(s);
			break MISSING_BLOCK_LABEL_362;
		}
		s = new String("Failed to retrieve remote module version: ");
		Log.w("DynamiteModule", s);
		return 0;
		i1 = b(context, s, flag);
		return i1;
		s;
		com/google/android/gms/dynamite/DynamiteModule;
		JVM INSTR monitorexit ;
		try
		{
			throw s;
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			com.google.android.gms.common.util.g.a(context, ((Throwable) (s)));
		}
		throw s;
	//* 195  397:goto            83
		a a2;
		a2;
	//  196  400:astore          7
		if(true) goto _L12; else goto _L11
	//  197  402:goto            198
_L11:
	}

	private static Context a(Context context, String s, int i1, Cursor cursor, q q1)
	{
		try
		{
			com.google.android.gms.c.d.a(((Object) (null)));
	//    0    0:aconst_null     
	//    1    1:invokestatic    #264 <Method com.google.android.gms.c.a d.a(Object)>
	//    2    4:pop             
			if(b().booleanValue())
	//*   3    5:invokestatic    #267 <Method Boolean b()>
	//*   4    8:invokevirtual   #248 <Method boolean Boolean.booleanValue()>
	//*   5   11:ifeq            44
			{
				Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
	//    6   14:ldc1            #160 <String "DynamiteModule">
	//    7   16:ldc2            #269 <String "Dynamite loader version >= 2, using loadModule2NoCrashUtils">
	//    8   19:invokestatic    #272 <Method int Log.v(String, String)>
	//    9   22:pop             
				context = ((Context) (q1.b(com.google.android.gms.c.d.a(((Object) (context))), s, i1, com.google.android.gms.c.d.a(((Object) (cursor))))));
	//   10   23:aload           4
	//   11   25:aload_0         
	//   12   26:invokestatic    #264 <Method com.google.android.gms.c.a d.a(Object)>
	//   13   29:aload_1         
	//   14   30:iload_2         
	//   15   31:aload_3         
	//   16   32:invokestatic    #264 <Method com.google.android.gms.c.a d.a(Object)>
	//   17   35:invokeinterface #277 <Method com.google.android.gms.c.a q.b(com.google.android.gms.c.a, String, int, com.google.android.gms.c.a)>
	//   18   40:astore_0        
				break MISSING_BLOCK_LABEL_71;
	//   19   41:goto            71
			}
		}
	//*  20   44:ldc1            #160 <String "DynamiteModule">
	//*  21   46:ldc2            #279 <String "Dynamite loader version < 2, falling back to loadModule2">
	//*  22   49:invokestatic    #188 <Method int Log.w(String, String)>
	//*  23   52:pop             
	//*  24   53:aload           4
	//*  25   55:aload_0         
	//*  26   56:invokestatic    #264 <Method com.google.android.gms.c.a d.a(Object)>
	//*  27   59:aload_1         
	//*  28   60:iload_2         
	//*  29   61:aload_3         
	//*  30   62:invokestatic    #264 <Method com.google.android.gms.c.a d.a(Object)>
	//*  31   65:invokeinterface #281 <Method com.google.android.gms.c.a q.a(com.google.android.gms.c.a, String, int, com.google.android.gms.c.a)>
	//*  32   70:astore_0        
	//*  33   71:aload_0         
	//*  34   72:invokestatic    #284 <Method Object d.a(com.google.android.gms.c.a)>
	//*  35   75:checkcast       #85  <Class Context>
	//*  36   78:astore_0        
	//*  37   79:aload_0         
	//*  38   80:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  39   81:astore_0        
		{
			context = ((Context) (String.valueOf(((Object) (((Exception) (context)).toString())))));
	//   40   82:aload_0         
	//   41   83:invokevirtual   #285 <Method String Exception.toString()>
	//   42   86:invokestatic    #108 <Method String String.valueOf(Object)>
	//   43   89:astore_0        
			if(((String) (context)).length() != 0)
	//*  44   90:aload_0         
	//*  45   91:invokevirtual   #112 <Method int String.length()>
	//*  46   94:ifeq            108
				context = ((Context) ("Failed to load DynamiteLoader: ".concat(((String) (context)))));
	//   47   97:ldc2            #287 <String "Failed to load DynamiteLoader: ">
	//   48  100:aload_0         
	//   49  101:invokevirtual   #178 <Method String String.concat(String)>
	//   50  104:astore_0        
			else
	//*  51  105:goto            119
				context = ((Context) (new String("Failed to load DynamiteLoader: ")));
	//   52  108:new             #104 <Class String>
	//   53  111:dup             
	//   54  112:ldc2            #287 <String "Failed to load DynamiteLoader: ">
	//   55  115:invokespecial   #181 <Method void String(String)>
	//   56  118:astore_0        
			Log.e("DynamiteModule", ((String) (context)));
	//   57  119:ldc1            #160 <String "DynamiteModule">
	//   58  121:aload_0         
	//   59  122:invokestatic    #165 <Method int Log.e(String, String)>
	//   60  125:pop             
			return null;
	//   61  126:aconst_null     
	//   62  127:areturn         
		}
		Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
		context = ((Context) (q1.a(com.google.android.gms.c.d.a(((Object) (context))), s, i1, com.google.android.gms.c.d.a(((Object) (cursor))))));
		context = (Context)com.google.android.gms.c.d.a(((com.google.android.gms.c.a) (context)));
		return context;
	}

	public static DynamiteModule a(Context context, b b1, String s)
	{
		com.google.android.gms.dynamite.e e1;
		com.google.android.gms.dynamite.e e2;
		e1 = (com.google.android.gms.dynamite.e)j.get();
	//    0    0:getstatic       #40  <Field ThreadLocal j>
	//    1    3:invokevirtual   #291 <Method Object ThreadLocal.get()>
	//    2    6:checkcast       #293 <Class com.google.android.gms.dynamite.e>
	//    3    9:astore          6
		e2 = new com.google.android.gms.dynamite.e(((com.google.android.gms.dynamite.g) (null)));
	//    4   11:new             #293 <Class com.google.android.gms.dynamite.e>
	//    5   14:dup             
	//    6   15:aconst_null     
	//    7   16:invokespecial   #296 <Method void com.google.android.gms.dynamite.e(com.google.android.gms.dynamite.g)>
	//    8   19:astore          7
		j.set(((Object) (e2)));
	//    9   21:getstatic       #40  <Field ThreadLocal j>
	//   10   24:aload           7
	//   11   26:invokevirtual   #299 <Method void ThreadLocal.set(Object)>
		com.google.android.gms.dynamite.d d1;
		d1 = b1.a(context, s, k);
	//   12   29:aload_1         
	//   13   30:aload_0         
	//   14   31:aload_2         
	//   15   32:getstatic       #45  <Field c k>
	//   16   35:invokeinterface #304 <Method com.google.android.gms.dynamite.d b.a(Context, String, c)>
	//   17   40:astore          8
		int i1 = d1.a;
	//   18   42:aload           8
	//   19   44:getfield        #308 <Field int d.a>
	//   20   47:istore_3        
		int i2 = d1.b;
	//   21   48:aload           8
	//   22   50:getfield        #310 <Field int d.b>
	//   23   53:istore          4
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 68 + String.valueOf(((Object) (s))).length());
	//   24   55:new             #102 <Class StringBuilder>
	//   25   58:dup             
	//   26   59:aload_2         
	//   27   60:invokestatic    #108 <Method String String.valueOf(Object)>
	//   28   63:invokevirtual   #112 <Method int String.length()>
	//   29   66:bipush          68
	//   30   68:iadd            
	//   31   69:aload_2         
	//   32   70:invokestatic    #108 <Method String String.valueOf(Object)>
	//   33   73:invokevirtual   #112 <Method int String.length()>
	//   34   76:iadd            
	//   35   77:invokespecial   #115 <Method void StringBuilder(int)>
	//   36   80:astore          5
		stringbuilder.append("Considering local module ");
	//   37   82:aload           5
	//   38   84:ldc2            #312 <String "Considering local module ">
	//   39   87:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   40   90:pop             
		stringbuilder.append(s);
	//   41   91:aload           5
	//   42   93:aload_2         
	//   43   94:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   44   97:pop             
		stringbuilder.append(":");
	//   45   98:aload           5
	//   46  100:ldc2            #314 <String ":">
	//   47  103:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   48  106:pop             
		stringbuilder.append(i1);
	//   49  107:aload           5
	//   50  109:iload_3         
	//   51  110:invokevirtual   #317 <Method StringBuilder StringBuilder.append(int)>
	//   52  113:pop             
		stringbuilder.append(" and remote module ");
	//   53  114:aload           5
	//   54  116:ldc2            #319 <String " and remote module ">
	//   55  119:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   56  122:pop             
		stringbuilder.append(s);
	//   57  123:aload           5
	//   58  125:aload_2         
	//   59  126:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   60  129:pop             
		stringbuilder.append(":");
	//   61  130:aload           5
	//   62  132:ldc2            #314 <String ":">
	//   63  135:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   64  138:pop             
		stringbuilder.append(i2);
	//   65  139:aload           5
	//   66  141:iload           4
	//   67  143:invokevirtual   #317 <Method StringBuilder StringBuilder.append(int)>
	//   68  146:pop             
		Log.i("DynamiteModule", stringbuilder.toString());
	//   69  147:ldc1            #160 <String "DynamiteModule">
	//   70  149:aload           5
	//   71  151:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   72  154:invokestatic    #321 <Method int Log.i(String, String)>
	//   73  157:pop             
		if(d1.c == 0 || d1.c == -1 && d1.a == 0 || d1.c == 1 && d1.b == 0)
			break MISSING_BLOCK_LABEL_475;
	//   74  158:aload           8
	//   75  160:getfield        #323 <Field int d.c>
	//   76  163:ifeq            475
	//   77  166:aload           8
	//   78  168:getfield        #323 <Field int d.c>
	//   79  171:iconst_m1       
	//   80  172:icmpne          183
	//   81  175:aload           8
	//   82  177:getfield        #308 <Field int d.a>
	//   83  180:ifeq            475
	//   84  183:aload           8
	//   85  185:getfield        #323 <Field int d.c>
	//   86  188:iconst_1        
	//   87  189:icmpne          200
	//   88  192:aload           8
	//   89  194:getfield        #310 <Field int d.b>
	//   90  197:ifeq            475
		if(d1.c != -1)
			break MISSING_BLOCK_LABEL_243;
	//   91  200:aload           8
	//   92  202:getfield        #323 <Field int d.c>
	//   93  205:iconst_m1       
	//   94  206:icmpne          243
		context = ((Context) (c(context, s)));
	//   95  209:aload_0         
	//   96  210:aload_2         
	//   97  211:invokestatic    #326 <Method DynamiteModule c(Context, String)>
	//   98  214:astore_0        
		if(e2.a != null)
	//*  99  215:aload           7
	//* 100  217:getfield        #329 <Field Cursor e.a>
	//* 101  220:ifnull          233
			e2.a.close();
	//  102  223:aload           7
	//  103  225:getfield        #329 <Field Cursor e.a>
	//  104  228:invokeinterface #334 <Method void Cursor.close()>
		j.set(((Object) (e1)));
	//  105  233:getstatic       #40  <Field ThreadLocal j>
	//  106  236:aload           6
	//  107  238:invokevirtual   #299 <Method void ThreadLocal.set(Object)>
		return ((DynamiteModule) (context));
	//  108  241:aload_0         
	//  109  242:areturn         
		int j1 = d1.c;
	//  110  243:aload           8
	//  111  245:getfield        #323 <Field int d.c>
	//  112  248:istore_3        
		if(j1 != 1)
			break MISSING_BLOCK_LABEL_432;
	//  113  249:iload_3         
	//  114  250:iconst_1        
	//  115  251:icmpne          432
		Object obj = ((Object) (a(context, s, d1.b)));
	//  116  254:aload_0         
	//  117  255:aload_2         
	//  118  256:aload           8
	//  119  258:getfield        #310 <Field int d.b>
	//  120  261:invokestatic    #337 <Method DynamiteModule a(Context, String, int)>
	//  121  264:astore          5
		if(e2.a != null)
	//* 122  266:aload           7
	//* 123  268:getfield        #329 <Field Cursor e.a>
	//* 124  271:ifnull          284
			e2.a.close();
	//  125  274:aload           7
	//  126  276:getfield        #329 <Field Cursor e.a>
	//  127  279:invokeinterface #334 <Method void Cursor.close()>
		j.set(((Object) (e1)));
	//  128  284:getstatic       #40  <Field ThreadLocal j>
	//  129  287:aload           6
	//  130  289:invokevirtual   #299 <Method void ThreadLocal.set(Object)>
		return ((DynamiteModule) (obj));
	//  131  292:aload           5
	//  132  294:areturn         
		a a1;
		a1;
	//  133  295:astore          9
		obj = ((Object) (String.valueOf(((Object) (a1.getMessage())))));
	//  134  297:aload           9
	//  135  299:invokevirtual   #249 <Method String a.getMessage()>
	//  136  302:invokestatic    #108 <Method String String.valueOf(Object)>
	//  137  305:astore          5
		if(((String) (obj)).length() != 0)
	//* 138  307:aload           5
	//* 139  309:invokevirtual   #112 <Method int String.length()>
	//* 140  312:ifeq            328
		{
			obj = ((Object) ("Failed to load remote module: ".concat(((String) (obj)))));
	//  141  315:ldc2            #339 <String "Failed to load remote module: ">
	//  142  318:aload           5
	//  143  320:invokevirtual   #178 <Method String String.concat(String)>
	//  144  323:astore          5
			break MISSING_BLOCK_LABEL_340;
	//  145  325:goto            340
		}
		obj = ((Object) (new String("Failed to load remote module: ")));
	//  146  328:new             #104 <Class String>
	//  147  331:dup             
	//  148  332:ldc2            #339 <String "Failed to load remote module: ">
	//  149  335:invokespecial   #181 <Method void String(String)>
	//  150  338:astore          5
		Log.w("DynamiteModule", ((String) (obj)));
	//  151  340:ldc1            #160 <String "DynamiteModule">
	//  152  342:aload           5
	//  153  344:invokestatic    #188 <Method int Log.w(String, String)>
	//  154  347:pop             
		if(d1.a == 0 || b1.a(context, s, ((c) (new f(d1.a, 0)))).c != -1)
			break MISSING_BLOCK_LABEL_418;
	//  155  348:aload           8
	//  156  350:getfield        #308 <Field int d.a>
	//  157  353:ifeq            418
	//  158  356:aload_1         
	//  159  357:aload_0         
	//  160  358:aload_2         
	//  161  359:new             #341 <Class f>
	//  162  362:dup             
	//  163  363:aload           8
	//  164  365:getfield        #308 <Field int d.a>
	//  165  368:iconst_0        
	//  166  369:invokespecial   #344 <Method void f(int, int)>
	//  167  372:invokeinterface #304 <Method com.google.android.gms.dynamite.d b.a(Context, String, c)>
	//  168  377:getfield        #323 <Field int d.c>
	//  169  380:iconst_m1       
	//  170  381:icmpne          418
		context = ((Context) (c(context, s)));
	//  171  384:aload_0         
	//  172  385:aload_2         
	//  173  386:invokestatic    #326 <Method DynamiteModule c(Context, String)>
	//  174  389:astore_0        
		if(e2.a != null)
	//* 175  390:aload           7
	//* 176  392:getfield        #329 <Field Cursor e.a>
	//* 177  395:ifnull          408
			e2.a.close();
	//  178  398:aload           7
	//  179  400:getfield        #329 <Field Cursor e.a>
	//  180  403:invokeinterface #334 <Method void Cursor.close()>
		j.set(((Object) (e1)));
	//  181  408:getstatic       #40  <Field ThreadLocal j>
	//  182  411:aload           6
	//  183  413:invokevirtual   #299 <Method void ThreadLocal.set(Object)>
		return ((DynamiteModule) (context));
	//  184  416:aload_0         
	//  185  417:areturn         
		throw new a("Remote load failed. No local fallback found.", ((Throwable) (a1)), ((com.google.android.gms.dynamite.g) (null)));
	//  186  418:new             #197 <Class a>
	//  187  421:dup             
	//  188  422:ldc2            #346 <String "Remote load failed. No local fallback found.">
	//  189  425:aload           9
	//  190  427:aconst_null     
	//  191  428:invokespecial   #349 <Method void a(String, Throwable, com.google.android.gms.dynamite.g)>
	//  192  431:athrow          
		int k1 = d1.c;
	//  193  432:aload           8
	//  194  434:getfield        #323 <Field int d.c>
	//  195  437:istore_3        
		context = ((Context) (new StringBuilder(47)));
	//  196  438:new             #102 <Class StringBuilder>
	//  197  441:dup             
	//  198  442:bipush          47
	//  199  444:invokespecial   #115 <Method void StringBuilder(int)>
	//  200  447:astore_0        
		((StringBuilder) (context)).append("VersionPolicy returned invalid code:");
	//  201  448:aload_0         
	//  202  449:ldc2            #351 <String "VersionPolicy returned invalid code:">
	//  203  452:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//  204  455:pop             
		((StringBuilder) (context)).append(k1);
	//  205  456:aload_0         
	//  206  457:iload_3         
	//  207  458:invokevirtual   #317 <Method StringBuilder StringBuilder.append(int)>
	//  208  461:pop             
		throw new a(((StringBuilder) (context)).toString(), ((com.google.android.gms.dynamite.g) (null)));
	//  209  462:new             #197 <Class a>
	//  210  465:dup             
	//  211  466:aload_0         
	//  212  467:invokevirtual   #127 <Method String StringBuilder.toString()>
	//  213  470:aconst_null     
	//  214  471:invokespecial   #354 <Method void a(String, com.google.android.gms.dynamite.g)>
	//  215  474:athrow          
		int l1 = d1.a;
	//  216  475:aload           8
	//  217  477:getfield        #308 <Field int d.a>
	//  218  480:istore_3        
		int j2 = d1.b;
	//  219  481:aload           8
	//  220  483:getfield        #310 <Field int d.b>
	//  221  486:istore          4
		context = ((Context) (new StringBuilder(91)));
	//  222  488:new             #102 <Class StringBuilder>
	//  223  491:dup             
	//  224  492:bipush          91
	//  225  494:invokespecial   #115 <Method void StringBuilder(int)>
	//  226  497:astore_0        
		((StringBuilder) (context)).append("No acceptable module found. Local version is ");
	//  227  498:aload_0         
	//  228  499:ldc2            #356 <String "No acceptable module found. Local version is ">
	//  229  502:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//  230  505:pop             
		((StringBuilder) (context)).append(l1);
	//  231  506:aload_0         
	//  232  507:iload_3         
	//  233  508:invokevirtual   #317 <Method StringBuilder StringBuilder.append(int)>
	//  234  511:pop             
		((StringBuilder) (context)).append(" and remote version is ");
	//  235  512:aload_0         
	//  236  513:ldc2            #358 <String " and remote version is ">
	//  237  516:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//  238  519:pop             
		((StringBuilder) (context)).append(j2);
	//  239  520:aload_0         
	//  240  521:iload           4
	//  241  523:invokevirtual   #317 <Method StringBuilder StringBuilder.append(int)>
	//  242  526:pop             
		((StringBuilder) (context)).append(".");
	//  243  527:aload_0         
	//  244  528:ldc2            #360 <String ".">
	//  245  531:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//  246  534:pop             
		throw new a(((StringBuilder) (context)).toString(), ((com.google.android.gms.dynamite.g) (null)));
	//  247  535:new             #197 <Class a>
	//  248  538:dup             
	//  249  539:aload_0         
	//  250  540:invokevirtual   #127 <Method String StringBuilder.toString()>
	//  251  543:aconst_null     
	//  252  544:invokespecial   #354 <Method void a(String, com.google.android.gms.dynamite.g)>
	//  253  547:athrow          
		context;
	//  254  548:astore_0        
		if(e2.a != null)
	//* 255  549:aload           7
	//* 256  551:getfield        #329 <Field Cursor e.a>
	//* 257  554:ifnull          567
			e2.a.close();
	//  258  557:aload           7
	//  259  559:getfield        #329 <Field Cursor e.a>
	//  260  562:invokeinterface #334 <Method void Cursor.close()>
		j.set(((Object) (e1)));
	//  261  567:getstatic       #40  <Field ThreadLocal j>
	//  262  570:aload           6
	//  263  572:invokevirtual   #299 <Method void ThreadLocal.set(Object)>
		throw context;
	//  264  575:aload_0         
	//  265  576:athrow          
	}

	private static DynamiteModule a(Context context, String s, int i1)
	{
		com/google/android/gms/dynamite/DynamiteModule;
	//    0    0:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Boolean boolean1 = e;
	//    2    3:getstatic       #199 <Field Boolean e>
	//    3    6:astore_3        
		com/google/android/gms/dynamite/DynamiteModule;
	//    4    7:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//    5    9:monitorexit     
		if(boolean1 == null)
			break MISSING_BLOCK_LABEL_35;
	//    6   10:aload_3         
	//    7   11:ifnull          35
		if(boolean1.booleanValue())
	//*   8   14:aload_3         
	//*   9   15:invokevirtual   #248 <Method boolean Boolean.booleanValue()>
	//*  10   18:ifeq            28
			return c(context, s, i1);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:iload_2         
	//   14   24:invokestatic    #362 <Method DynamiteModule c(Context, String, int)>
	//   15   27:areturn         
		else
			return b(context, s, i1);
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:iload_2         
	//   19   31:invokestatic    #364 <Method DynamiteModule b(Context, String, int)>
	//   20   34:areturn         
		throw new a("Failed to determine which loading route to use.", ((com.google.android.gms.dynamite.g) (null)));
	//   21   35:new             #197 <Class a>
	//   22   38:dup             
	//   23   39:ldc2            #366 <String "Failed to determine which loading route to use.">
	//   24   42:aconst_null     
	//   25   43:invokespecial   #354 <Method void a(String, com.google.android.gms.dynamite.g)>
	//   26   46:athrow          
		s;
	//   27   47:astore_1        
		com/google/android/gms/dynamite/DynamiteModule;
	//   28   48:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   29   50:monitorexit     
		try
		{
			throw s;
	//   30   51:aload_1         
	//   31   52:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  32   53:astore_1        
		{
			com.google.android.gms.common.util.g.a(context, ((Throwable) (s)));
	//   33   54:aload_0         
	//   34   55:aload_1         
	//   35   56:invokestatic    #258 <Method boolean g.a(Context, Throwable)>
	//   36   59:pop             
		}
		throw s;
	//   37   60:aload_1         
	//   38   61:athrow          
	}

	private static o a(Context context)
	{
		com/google/android/gms/dynamite/DynamiteModule;
	//    0    0:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(f == null)
			break MISSING_BLOCK_LABEL_18;
	//    2    3:getstatic       #369 <Field o f>
	//    3    6:ifnull          18
		context = ((Context) (f));
	//    4    9:getstatic       #369 <Field o f>
	//    5   12:astore_0        
		com/google/android/gms/dynamite/DynamiteModule;
	//    6   13:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//    7   15:monitorexit     
		return ((o) (context));
	//    8   16:aload_0         
	//    9   17:areturn         
		if(com.google.android.gms.common.e.b().a(context) == 0)
			break MISSING_BLOCK_LABEL_33;
	//   10   18:invokestatic    #374 <Method e e.b()>
	//   11   21:aload_0         
	//   12   22:invokevirtual   #377 <Method int e.a(Context)>
	//   13   25:ifeq            33
		com/google/android/gms/dynamite/DynamiteModule;
	//   14   28:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   15   30:monitorexit     
		return null;
	//   16   31:aconst_null     
	//   17   32:areturn         
		context = ((Context) ((IBinder)context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance()));
	//   18   33:aload_0         
	//   19   34:ldc1            #222 <String "com.google.android.gms">
	//   20   36:iconst_3        
	//   21   37:invokevirtual   #381 <Method Context Context.createPackageContext(String, int)>
	//   22   40:invokevirtual   #100 <Method ClassLoader Context.getClassLoader()>
	//   23   43:ldc2            #383 <String "com.google.android.gms.chimera.container.DynamiteLoaderImpl">
	//   24   46:invokevirtual   #133 <Method Class ClassLoader.loadClass(String)>
	//   25   49:invokevirtual   #386 <Method Object Class.newInstance()>
	//   26   52:checkcast       #388 <Class IBinder>
	//   27   55:astore_0        
		if(context == null)
	//*  28   56:aload_0         
	//*  29   57:ifnonnull       65
		{
			context = null;
	//   30   60:aconst_null     
	//   31   61:astore_0        
			break MISSING_BLOCK_LABEL_99;
	//   32   62:goto            99
		}
		android.os.IInterface iinterface = ((IBinder) (context)).queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
	//   33   65:aload_0         
	//   34   66:ldc2            #390 <String "com.google.android.gms.dynamite.IDynamiteLoader">
	//   35   69:invokeinterface #394 <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   36   74:astore_1        
		if(iinterface instanceof o)
	//*  37   75:aload_1         
	//*  38   76:instanceof      #396 <Class o>
	//*  39   79:ifeq            90
		{
			context = ((Context) ((o)iinterface));
	//   40   82:aload_1         
	//   41   83:checkcast       #396 <Class o>
	//   42   86:astore_0        
			break MISSING_BLOCK_LABEL_99;
	//   43   87:goto            99
		}
		context = ((Context) (new p(((IBinder) (context)))));
	//   44   90:new             #398 <Class p>
	//   45   93:dup             
	//   46   94:aload_0         
	//   47   95:invokespecial   #401 <Method void p(IBinder)>
	//   48   98:astore_0        
		if(context == null)
			break MISSING_BLOCK_LABEL_157;
	//   49   99:aload_0         
	//   50  100:ifnull          157
		f = ((o) (context));
	//   51  103:aload_0         
	//   52  104:putstatic       #369 <Field o f>
		com/google/android/gms/dynamite/DynamiteModule;
	//   53  107:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   54  109:monitorexit     
		return ((o) (context));
	//   55  110:aload_0         
	//   56  111:areturn         
		context;
	//   57  112:astore_0        
		context = ((Context) (String.valueOf(((Object) (((Exception) (context)).getMessage())))));
	//   58  113:aload_0         
	//   59  114:invokevirtual   #172 <Method String Exception.getMessage()>
	//   60  117:invokestatic    #108 <Method String String.valueOf(Object)>
	//   61  120:astore_0        
		if(((String) (context)).length() != 0)
	//*  62  121:aload_0         
	//*  63  122:invokevirtual   #112 <Method int String.length()>
	//*  64  125:ifeq            139
		{
			context = ((Context) ("Failed to load IDynamiteLoader from GmsCore: ".concat(((String) (context)))));
	//   65  128:ldc2            #403 <String "Failed to load IDynamiteLoader from GmsCore: ">
	//   66  131:aload_0         
	//   67  132:invokevirtual   #178 <Method String String.concat(String)>
	//   68  135:astore_0        
			break MISSING_BLOCK_LABEL_150;
	//   69  136:goto            150
		}
		context = ((Context) (new String("Failed to load IDynamiteLoader from GmsCore: ")));
	//   70  139:new             #104 <Class String>
	//   71  142:dup             
	//   72  143:ldc2            #403 <String "Failed to load IDynamiteLoader from GmsCore: ">
	//   73  146:invokespecial   #181 <Method void String(String)>
	//   74  149:astore_0        
		Log.e("DynamiteModule", ((String) (context)));
	//   75  150:ldc1            #160 <String "DynamiteModule">
	//   76  152:aload_0         
	//   77  153:invokestatic    #165 <Method int Log.e(String, String)>
	//   78  156:pop             
		com/google/android/gms/dynamite/DynamiteModule;
	//   79  157:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   80  159:monitorexit     
		return null;
	//   81  160:aconst_null     
	//   82  161:areturn         
		context;
	//   83  162:astore_0        
		com/google/android/gms/dynamite/DynamiteModule;
	//   84  163:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   85  165:monitorexit     
		throw context;
	//   86  166:aload_0         
	//   87  167:athrow          
	}

	private static void a(ClassLoader classloader)
	{
		classloader = ((ClassLoader) ((IBinder)classloader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0])));
	//    0    0:aload_0         
	//    1    1:ldc2            #411 <String "com.google.android.gms.dynamiteloader.DynamiteLoaderV2">
	//    2    4:invokevirtual   #133 <Method Class ClassLoader.loadClass(String)>
	//    3    7:iconst_0        
	//    4    8:anewarray       Class[]
	//    5   11:invokevirtual   #415 <Method Constructor Class.getConstructor(Class[])>
	//    6   14:iconst_0        
	//    7   15:anewarray       Object[]
	//    8   18:invokevirtual   #420 <Method Object Constructor.newInstance(Object[])>
	//    9   21:checkcast       #388 <Class IBinder>
	//   10   24:astore_0        
		if(classloader == null)
	//*  11   25:aload_0         
	//*  12   26:ifnonnull       34
		{
			classloader = null;
	//   13   29:aconst_null     
	//   14   30:astore_0        
			break MISSING_BLOCK_LABEL_68;
	//   15   31:goto            68
		}
		android.os.IInterface iinterface = ((IBinder) (classloader)).queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
	//   16   34:aload_0         
	//   17   35:ldc2            #422 <String "com.google.android.gms.dynamite.IDynamiteLoaderV2">
	//   18   38:invokeinterface #394 <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   19   43:astore_1        
		if(iinterface instanceof q)
	//*  20   44:aload_1         
	//*  21   45:instanceof      #274 <Class q>
	//*  22   48:ifeq            59
		{
			classloader = ((ClassLoader) ((q)iinterface));
	//   23   51:aload_1         
	//   24   52:checkcast       #274 <Class q>
	//   25   55:astore_0        
			break MISSING_BLOCK_LABEL_68;
	//   26   56:goto            68
		}
		classloader = ((ClassLoader) (new r(((IBinder) (classloader)))));
	//   27   59:new             #424 <Class r>
	//   28   62:dup             
	//   29   63:aload_0         
	//   30   64:invokespecial   #425 <Method void r(IBinder)>
	//   31   67:astore_0        
		g = ((q) (classloader));
	//   32   68:aload_0         
	//   33   69:putstatic       #427 <Field q g>
		return;
	//   34   72:return          
		classloader;
	//   35   73:astore_0        
		break MISSING_BLOCK_LABEL_90;
	//   36   74:goto            90
		classloader;
	//   37   77:astore_0        
		break MISSING_BLOCK_LABEL_90;
	//   38   78:goto            90
		classloader;
	//   39   81:astore_0        
		break MISSING_BLOCK_LABEL_90;
	//   40   82:goto            90
		classloader;
	//   41   85:astore_0        
		break MISSING_BLOCK_LABEL_90;
	//   42   86:goto            90
		classloader;
	//   43   89:astore_0        
		throw new a("Failed to instantiate dynamite loader", ((Throwable) (classloader)), ((com.google.android.gms.dynamite.g) (null)));
	//   44   90:new             #197 <Class a>
	//   45   93:dup             
	//   46   94:ldc2            #429 <String "Failed to instantiate dynamite loader">
	//   47   97:aload_0         
	//   48   98:aconst_null     
	//   49   99:invokespecial   #349 <Method void a(String, Throwable, com.google.android.gms.dynamite.g)>
	//   50  102:athrow          
	}

	public static int b(Context context, String s)
	{
		return a(context, s, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokestatic    #432 <Method int a(Context, String, boolean)>
	//    4    6:ireturn         
	}

	private static int b(Context context, String s, boolean flag)
	{
		o o1 = a(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #436 <Method o a(Context)>
	//    2    4:astore          4
		if(o1 == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       13
			return 0;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		int i1;
		try
		{
			if(o1.a() >= 2)
	//*   7   13:aload           4
	//*   8   15:invokeinterface #438 <Method int o.a()>
	//*   9   20:iconst_2        
	//*  10   21:icmplt          38
				return o1.b(com.google.android.gms.c.d.a(((Object) (context))), s, flag);
	//   11   24:aload           4
	//   12   26:aload_0         
	//   13   27:invokestatic    #264 <Method com.google.android.gms.c.a d.a(Object)>
	//   14   30:aload_1         
	//   15   31:iload_2         
	//   16   32:invokeinterface #441 <Method int o.b(com.google.android.gms.c.a, String, boolean)>
	//   17   37:ireturn         
			Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
	//   18   38:ldc1            #160 <String "DynamiteModule">
	//   19   40:ldc2            #443 <String "IDynamite loader version < 2, falling back to getModuleVersion2">
	//   20   43:invokestatic    #188 <Method int Log.w(String, String)>
	//   21   46:pop             
			i1 = o1.a(com.google.android.gms.c.d.a(((Object) (context))), s, flag);
	//   22   47:aload           4
	//   23   49:aload_0         
	//   24   50:invokestatic    #264 <Method com.google.android.gms.c.a d.a(Object)>
	//   25   53:aload_1         
	//   26   54:iload_2         
	//   27   55:invokeinterface #445 <Method int o.a(com.google.android.gms.c.a, String, boolean)>
	//   28   60:istore_3        
		}
	//*  29   61:iload_3         
	//*  30   62:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  31   63:astore_0        
		{
			context = ((Context) (String.valueOf(((Object) (((RemoteException) (context)).getMessage())))));
	//   32   64:aload_0         
	//   33   65:invokevirtual   #446 <Method String RemoteException.getMessage()>
	//   34   68:invokestatic    #108 <Method String String.valueOf(Object)>
	//   35   71:astore_0        
			if(((String) (context)).length() != 0)
	//*  36   72:aload_0         
	//*  37   73:invokevirtual   #112 <Method int String.length()>
	//*  38   76:ifeq            89
				context = ((Context) ("Failed to retrieve remote module version: ".concat(((String) (context)))));
	//   39   79:ldc1            #251 <String "Failed to retrieve remote module version: ">
	//   40   81:aload_0         
	//   41   82:invokevirtual   #178 <Method String String.concat(String)>
	//   42   85:astore_0        
			else
	//*  43   86:goto            99
				context = ((Context) (new String("Failed to retrieve remote module version: ")));
	//   44   89:new             #104 <Class String>
	//   45   92:dup             
	//   46   93:ldc1            #251 <String "Failed to retrieve remote module version: ">
	//   47   95:invokespecial   #181 <Method void String(String)>
	//   48   98:astore_0        
			Log.w("DynamiteModule", ((String) (context)));
	//   49   99:ldc1            #160 <String "DynamiteModule">
	//   50  101:aload_0         
	//   51  102:invokestatic    #188 <Method int Log.w(String, String)>
	//   52  105:pop             
			return 0;
	//   53  106:iconst_0        
	//   54  107:ireturn         
		}
		return i1;
	}

	private static DynamiteModule b(Context context, String s, int i1)
	{
		Object obj;
		obj = ((Object) (new StringBuilder(String.valueOf(((Object) (s))).length() + 51)));
	//    0    0:new             #102 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokestatic    #108 <Method String String.valueOf(Object)>
	//    4    8:invokevirtual   #112 <Method int String.length()>
	//    5   11:bipush          51
	//    6   13:iadd            
	//    7   14:invokespecial   #115 <Method void StringBuilder(int)>
	//    8   17:astore_3        
		((StringBuilder) (obj)).append("Selected remote version of ");
	//    9   18:aload_3         
	//   10   19:ldc2            #448 <String "Selected remote version of ">
	//   11   22:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
		((StringBuilder) (obj)).append(s);
	//   13   26:aload_3         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
		((StringBuilder) (obj)).append(", version >= ");
	//   17   32:aload_3         
	//   18   33:ldc2            #450 <String ", version >= ">
	//   19   36:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
		((StringBuilder) (obj)).append(i1);
	//   21   40:aload_3         
	//   22   41:iload_2         
	//   23   42:invokevirtual   #317 <Method StringBuilder StringBuilder.append(int)>
	//   24   45:pop             
		Log.i("DynamiteModule", ((StringBuilder) (obj)).toString());
	//   25   46:ldc1            #160 <String "DynamiteModule">
	//   26   48:aload_3         
	//   27   49:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   28   52:invokestatic    #321 <Method int Log.i(String, String)>
	//   29   55:pop             
		obj = ((Object) (a(context)));
	//   30   56:aload_0         
	//   31   57:invokestatic    #436 <Method o a(Context)>
	//   32   60:astore_3        
		if(obj == null)
			break MISSING_BLOCK_LABEL_161;
	//   33   61:aload_3         
	//   34   62:ifnull          161
label0:
		{
			if(((o) (obj)).a() >= 2)
	//*  35   65:aload_3         
	//*  36   66:invokeinterface #438 <Method int o.a()>
	//*  37   71:iconst_2        
	//*  38   72:icmplt          91
			{
				context = ((Context) (((o) (obj)).b(com.google.android.gms.c.d.a(((Object) (context))), s, i1)));
	//   39   75:aload_3         
	//   40   76:aload_0         
	//   41   77:invokestatic    #264 <Method com.google.android.gms.c.a d.a(Object)>
	//   42   80:aload_1         
	//   43   81:iload_2         
	//   44   82:invokeinterface #453 <Method com.google.android.gms.c.a o.b(com.google.android.gms.c.a, String, int)>
	//   45   87:astore_0        
				break label0;
	//   46   88:goto            113
			}
			try
			{
				Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
	//   47   91:ldc1            #160 <String "DynamiteModule">
	//   48   93:ldc2            #455 <String "Dynamite loader version < 2, falling back to createModuleContext">
	//   49   96:invokestatic    #188 <Method int Log.w(String, String)>
	//   50   99:pop             
				context = ((Context) (((o) (obj)).a(com.google.android.gms.c.d.a(((Object) (context))), s, i1)));
	//   51  100:aload_3         
	//   52  101:aload_0         
	//   53  102:invokestatic    #264 <Method com.google.android.gms.c.a d.a(Object)>
	//   54  105:aload_1         
	//   55  106:iload_2         
	//   56  107:invokeinterface #457 <Method com.google.android.gms.c.a o.a(com.google.android.gms.c.a, String, int)>
	//   57  112:astore_0        
			}
	//*  58  113:aload_0         
	//*  59  114:invokestatic    #284 <Method Object d.a(com.google.android.gms.c.a)>
	//*  60  117:ifnull          135
	//*  61  120:new             #2   <Class DynamiteModule>
	//*  62  123:dup             
	//*  63  124:aload_0         
	//*  64  125:invokestatic    #284 <Method Object d.a(com.google.android.gms.c.a)>
	//*  65  128:checkcast       #85  <Class Context>
	//*  66  131:invokespecial   #459 <Method void DynamiteModule(Context)>
	//*  67  134:areturn         
	//*  68  135:new             #197 <Class a>
	//*  69  138:dup             
	//*  70  139:ldc2            #461 <String "Failed to load remote module.">
	//*  71  142:aconst_null     
	//*  72  143:invokespecial   #354 <Method void a(String, com.google.android.gms.dynamite.g)>
	//*  73  146:athrow          
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  74  147:astore_0        
			{
				throw new a("Failed to load remote module.", ((Throwable) (context)), ((com.google.android.gms.dynamite.g) (null)));
	//   75  148:new             #197 <Class a>
	//   76  151:dup             
	//   77  152:ldc2            #461 <String "Failed to load remote module.">
	//   78  155:aload_0         
	//   79  156:aconst_null     
	//   80  157:invokespecial   #349 <Method void a(String, Throwable, com.google.android.gms.dynamite.g)>
	//   81  160:athrow          
			}
		}
		if(com.google.android.gms.c.d.a(((com.google.android.gms.c.a) (context))) != null)
			return new DynamiteModule((Context)com.google.android.gms.c.d.a(((com.google.android.gms.c.a) (context))));
		else
			throw new a("Failed to load remote module.", ((com.google.android.gms.dynamite.g) (null)));
		throw new a("Failed to create IDynamiteLoader.", ((com.google.android.gms.dynamite.g) (null)));
	//   82  161:new             #197 <Class a>
	//   83  164:dup             
	//   84  165:ldc2            #463 <String "Failed to create IDynamiteLoader.">
	//   85  168:aconst_null     
	//   86  169:invokespecial   #354 <Method void a(String, com.google.android.gms.dynamite.g)>
	//   87  172:athrow          
	}

	private static Boolean b()
	{
		com/google/android/gms/dynamite/DynamiteModule;
	//    0    0:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		boolean flag;
		Exception exception;
		if(i >= 2)
	//*   2    3:getstatic       #465 <Field int i>
	//*   3    6:iconst_2        
	//*   4    7:icmplt          29
			flag = true;
	//    5   10:iconst_1        
	//    6   11:istore_0        
		else
	//*   7   12:goto            15
	//*   8   15:ldc1            #2   <Class DynamiteModule>
	//*   9   17:monitorexit     
	//*  10   18:iload_0         
	//*  11   19:invokestatic    #468 <Method Boolean Boolean.valueOf(boolean)>
	//*  12   22:areturn         
	//*  13   23:astore_1        
	//*  14   24:ldc1            #2   <Class DynamiteModule>
	//*  15   26:monitorexit     
	//*  16   27:aload_1         
	//*  17   28:athrow          
			flag = false;
	//   18   29:iconst_0        
	//   19   30:istore_0        
		com/google/android/gms/dynamite/DynamiteModule;
		JVM INSTR monitorexit ;
		return Boolean.valueOf(flag);
		exception;
		com/google/android/gms/dynamite/DynamiteModule;
		JVM INSTR monitorexit ;
		throw exception;
	//*  20   31:goto            15
	}

	private static int c(Context context, String s, boolean flag)
	{
		com.google.android.gms.dynamite.e e1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		ContentResolver contentresolver = context.getContentResolver();
	//    2    3:aload_0         
	//    3    4:invokevirtual   #472 <Method ContentResolver Context.getContentResolver()>
	//    4    7:astore          6
		int i1;
		int j1;
		StringBuilder stringbuilder;
		if(flag)
	//*   5    9:iload_2         
	//*   6   10:ifeq            298
			context = "api_force_staging";
	//    7   13:ldc2            #474 <String "api_force_staging">
	//    8   16:astore_0        
		else
	//*   9   17:goto            20
	//*  10   20:new             #102 <Class StringBuilder>
	//*  11   23:dup             
	//*  12   24:aload_0         
	//*  13   25:invokestatic    #108 <Method String String.valueOf(Object)>
	//*  14   28:invokevirtual   #112 <Method int String.length()>
	//*  15   31:bipush          42
	//*  16   33:iadd            
	//*  17   34:aload_1         
	//*  18   35:invokestatic    #108 <Method String String.valueOf(Object)>
	//*  19   38:invokevirtual   #112 <Method int String.length()>
	//*  20   41:iadd            
	//*  21   42:invokespecial   #115 <Method void StringBuilder(int)>
	//*  22   45:astore          7
	//*  23   47:aload           7
	//*  24   49:ldc2            #476 <String "content://com.google.android.gms.chimera/">
	//*  25   52:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//*  26   55:pop             
	//*  27   56:aload           7
	//*  28   58:aload_0         
	//*  29   59:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//*  30   62:pop             
	//*  31   63:aload           7
	//*  32   65:ldc2            #478 <String "/">
	//*  33   68:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//*  34   71:pop             
	//*  35   72:aload           7
	//*  36   74:aload_1         
	//*  37   75:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//*  38   78:pop             
	//*  39   79:aload           6
	//*  40   81:aload           7
	//*  41   83:invokevirtual   #127 <Method String StringBuilder.toString()>
	//*  42   86:invokestatic    #484 <Method Uri Uri.parse(String)>
	//*  43   89:aconst_null     
	//*  44   90:aconst_null     
	//*  45   91:aconst_null     
	//*  46   92:aconst_null     
	//*  47   93:invokevirtual   #490 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//*  48   96:astore_0        
	//*  49   97:aload_0         
	//*  50   98:ifnull          224
	//*  51  101:aload_0         
	//*  52  102:invokeinterface #493 <Method boolean Cursor.moveToFirst()>
	//*  53  107:ifeq            224
	//*  54  110:aload_0         
	//*  55  111:iconst_0        
	//*  56  112:invokeinterface #496 <Method int Cursor.getInt(int)>
	//*  57  117:istore_3        
	//*  58  118:aload_0         
	//*  59  119:astore_1        
	//*  60  120:iload_3         
	//*  61  121:ifle            212
	//*  62  124:ldc1            #2   <Class DynamiteModule>
	//*  63  126:monitorenter    
	//*  64  127:aload_0         
	//*  65  128:iconst_2        
	//*  66  129:invokeinterface #500 <Method String Cursor.getString(int)>
	//*  67  134:putstatic       #234 <Field String h>
	//*  68  137:aload_0         
	//*  69  138:ldc2            #502 <String "loaderVersion">
	//*  70  141:invokeinterface #506 <Method int Cursor.getColumnIndex(String)>
	//*  71  146:istore          4
	//*  72  148:iload           4
	//*  73  150:iflt            164
	//*  74  153:aload_0         
	//*  75  154:iload           4
	//*  76  156:invokeinterface #496 <Method int Cursor.getInt(int)>
	//*  77  161:putstatic       #465 <Field int i>
	//*  78  164:ldc1            #2   <Class DynamiteModule>
	//*  79  166:monitorexit     
	//*  80  167:getstatic       #40  <Field ThreadLocal j>
	//*  81  170:invokevirtual   #291 <Method Object ThreadLocal.get()>
	//*  82  173:checkcast       #293 <Class com.google.android.gms.dynamite.e>
	//*  83  176:astore          5
	//*  84  178:aload_0         
	//*  85  179:astore_1        
	//*  86  180:aload           5
	//*  87  182:ifnull          212
	//*  88  185:aload_0         
	//*  89  186:astore_1        
	//*  90  187:aload           5
	//*  91  189:getfield        #329 <Field Cursor e.a>
	//*  92  192:ifnonnull       212
	//*  93  195:aload           5
	//*  94  197:aload_0         
	//*  95  198:putfield        #329 <Field Cursor e.a>
	//*  96  201:aconst_null     
	//*  97  202:astore_1        
	//*  98  203:goto            212
	//*  99  206:astore_1        
	//* 100  207:ldc1            #2   <Class DynamiteModule>
	//* 101  209:monitorexit     
	//* 102  210:aload_1         
	//* 103  211:athrow          
	//* 104  212:aload_1         
	//* 105  213:ifnull          222
	//* 106  216:aload_1         
	//* 107  217:invokeinterface #334 <Method void Cursor.close()>
	//* 108  222:iload_3         
	//* 109  223:ireturn         
	//* 110  224:ldc1            #160 <String "DynamiteModule">
	//* 111  226:ldc2            #508 <String "Failed to retrieve remote module version.">
	//* 112  229:invokestatic    #188 <Method int Log.w(String, String)>
	//* 113  232:pop             
	//* 114  233:new             #197 <Class a>
	//* 115  236:dup             
	//* 116  237:ldc2            #510 <String "Failed to connect to dynamite module ContentResolver.">
	//* 117  240:aconst_null     
	//* 118  241:invokespecial   #354 <Method void a(String, com.google.android.gms.dynamite.g)>
	//* 119  244:athrow          
	//* 120  245:astore_1        
	//* 121  246:goto            286
	//* 122  249:astore_1        
	//* 123  250:goto            263
	//* 124  253:astore_1        
	//* 125  254:aload           5
	//* 126  256:astore_0        
	//* 127  257:goto            286
	//* 128  260:astore_1        
	//* 129  261:aconst_null     
	//* 130  262:astore_0        
	//* 131  263:aload_1         
	//* 132  264:instanceof      #197 <Class a>
	//* 133  267:ifeq            272
	//* 134  270:aload_1         
	//* 135  271:athrow          
	//* 136  272:new             #197 <Class a>
	//* 137  275:dup             
	//* 138  276:ldc2            #512 <String "V2 version check failed">
	//* 139  279:aload_1         
	//* 140  280:aconst_null     
	//* 141  281:invokespecial   #349 <Method void a(String, Throwable, com.google.android.gms.dynamite.g)>
	//* 142  284:athrow          
	//* 143  285:astore_1        
	//* 144  286:aload_0         
	//* 145  287:ifnull          296
	//* 146  290:aload_0         
	//* 147  291:invokeinterface #334 <Method void Cursor.close()>
	//* 148  296:aload_1         
	//* 149  297:athrow          
			context = "api";
	//  150  298:ldc2            #514 <String "api">
	//  151  301:astore_0        
		stringbuilder = new StringBuilder(String.valueOf(((Object) (context))).length() + 42 + String.valueOf(((Object) (s))).length());
		stringbuilder.append("content://com.google.android.gms.chimera/");
		stringbuilder.append(((String) (context)));
		stringbuilder.append("/");
		stringbuilder.append(s);
		context = ((Context) (contentresolver.query(Uri.parse(stringbuilder.toString()), ((String []) (null)), ((String) (null)), ((String []) (null)), ((String) (null)))));
		if(context == null)
			break MISSING_BLOCK_LABEL_224;
		if(!((Cursor) (context)).moveToFirst())
			break MISSING_BLOCK_LABEL_224;
		i1 = ((Cursor) (context)).getInt(0);
		s = ((String) (context));
		if(i1 <= 0)
			break MISSING_BLOCK_LABEL_212;
		com/google/android/gms/dynamite/DynamiteModule;
		JVM INSTR monitorenter ;
		h = ((Cursor) (context)).getString(2);
		j1 = ((Cursor) (context)).getColumnIndex("loaderVersion");
		if(j1 < 0)
			break MISSING_BLOCK_LABEL_164;
		i = ((Cursor) (context)).getInt(j1);
		com/google/android/gms/dynamite/DynamiteModule;
		JVM INSTR monitorexit ;
		e1 = (com.google.android.gms.dynamite.e)j.get();
		s = ((String) (context));
		if(e1 == null)
			break MISSING_BLOCK_LABEL_212;
		s = ((String) (context));
		if(e1.a != null)
			break MISSING_BLOCK_LABEL_212;
		e1.a = ((Cursor) (context));
		s = null;
		break MISSING_BLOCK_LABEL_212;
		s;
		com/google/android/gms/dynamite/DynamiteModule;
		JVM INSTR monitorexit ;
		try
		{
			throw s;
		}
		// Misplaced declaration of an exception variable
		catch(String s) { }
		break MISSING_BLOCK_LABEL_263;
		if(s != null)
			((Cursor) (s)).close();
		return i1;
		Log.w("DynamiteModule", "Failed to retrieve remote module version.");
		throw new a("Failed to connect to dynamite module ContentResolver.", ((com.google.android.gms.dynamite.g) (null)));
		s;
		break MISSING_BLOCK_LABEL_286;
		s;
		context = ((Context) (e1));
		break MISSING_BLOCK_LABEL_286;
		s;
		context = null;
		if(s instanceof a)
			throw s;
		else
			throw new a("V2 version check failed", ((Throwable) (s)), ((com.google.android.gms.dynamite.g) (null)));
		s;
		if(context != null)
			((Cursor) (context)).close();
		throw s;
	//* 152  302:goto            20
	}

	private static DynamiteModule c(Context context, String s)
	{
		s = String.valueOf(((Object) (s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #108 <Method String String.valueOf(Object)>
	//    2    4:astore_1        
		if(s.length() != 0)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #112 <Method int String.length()>
	//*   5    9:ifeq            23
			s = "Selected local version of ".concat(s);
	//    6   12:ldc2            #516 <String "Selected local version of ">
	//    7   15:aload_1         
	//    8   16:invokevirtual   #178 <Method String String.concat(String)>
	//    9   19:astore_1        
		else
	//*  10   20:goto            34
			s = new String("Selected local version of ");
	//   11   23:new             #104 <Class String>
	//   12   26:dup             
	//   13   27:ldc2            #516 <String "Selected local version of ">
	//   14   30:invokespecial   #181 <Method void String(String)>
	//   15   33:astore_1        
		Log.i("DynamiteModule", s);
	//   16   34:ldc1            #160 <String "DynamiteModule">
	//   17   36:aload_1         
	//   18   37:invokestatic    #321 <Method int Log.i(String, String)>
	//   19   40:pop             
		return new DynamiteModule(context.getApplicationContext());
	//   20   41:new             #2   <Class DynamiteModule>
	//   21   44:dup             
	//   22   45:aload_0         
	//   23   46:invokevirtual   #96  <Method Context Context.getApplicationContext()>
	//   24   49:invokespecial   #459 <Method void DynamiteModule(Context)>
	//   25   52:areturn         
	}

	private static DynamiteModule c(Context context, String s, int i1)
	{
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 51);
	//    0    0:new             #102 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokestatic    #108 <Method String String.valueOf(Object)>
	//    4    8:invokevirtual   #112 <Method int String.length()>
	//    5   11:bipush          51
	//    6   13:iadd            
	//    7   14:invokespecial   #115 <Method void StringBuilder(int)>
	//    8   17:astore_3        
		stringbuilder.append("Selected remote version of ");
	//    9   18:aload_3         
	//   10   19:ldc2            #448 <String "Selected remote version of ">
	//   11   22:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
		stringbuilder.append(s);
	//   13   26:aload_3         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
		stringbuilder.append(", version >= ");
	//   17   32:aload_3         
	//   18   33:ldc2            #450 <String ", version >= ">
	//   19   36:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
		stringbuilder.append(i1);
	//   21   40:aload_3         
	//   22   41:iload_2         
	//   23   42:invokevirtual   #317 <Method StringBuilder StringBuilder.append(int)>
	//   24   45:pop             
		Log.i("DynamiteModule", stringbuilder.toString());
	//   25   46:ldc1            #160 <String "DynamiteModule">
	//   26   48:aload_3         
	//   27   49:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   28   52:invokestatic    #321 <Method int Log.i(String, String)>
	//   29   55:pop             
		com/google/android/gms/dynamite/DynamiteModule;
	//   30   56:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorenter ;
	//   31   58:monitorenter    
		q q1 = g;
	//   32   59:getstatic       #427 <Field q g>
	//   33   62:astore_3        
		com/google/android/gms/dynamite/DynamiteModule;
	//   34   63:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   35   65:monitorexit     
		if(q1 != null)
	//*  36   66:aload_3         
	//*  37   67:ifnull          147
		{
			com.google.android.gms.dynamite.e e1 = (com.google.android.gms.dynamite.e)j.get();
	//   38   70:getstatic       #40  <Field ThreadLocal j>
	//   39   73:invokevirtual   #291 <Method Object ThreadLocal.get()>
	//   40   76:checkcast       #293 <Class com.google.android.gms.dynamite.e>
	//   41   79:astore          4
			if(e1 != null && e1.a != null)
	//*  42   81:aload           4
	//*  43   83:ifnull          135
	//*  44   86:aload           4
	//*  45   88:getfield        #329 <Field Cursor e.a>
	//*  46   91:ifnull          135
			{
				context = a(context.getApplicationContext(), s, i1, e1.a, q1);
	//   47   94:aload_0         
	//   48   95:invokevirtual   #96  <Method Context Context.getApplicationContext()>
	//   49   98:aload_1         
	//   50   99:iload_2         
	//   51  100:aload           4
	//   52  102:getfield        #329 <Field Cursor e.a>
	//   53  105:aload_3         
	//   54  106:invokestatic    #518 <Method Context a(Context, String, int, Cursor, q)>
	//   55  109:astore_0        
				if(context != null)
	//*  56  110:aload_0         
	//*  57  111:ifnull          123
					return new DynamiteModule(context);
	//   58  114:new             #2   <Class DynamiteModule>
	//   59  117:dup             
	//   60  118:aload_0         
	//   61  119:invokespecial   #459 <Method void DynamiteModule(Context)>
	//   62  122:areturn         
				else
					throw new a("Failed to get module context", ((com.google.android.gms.dynamite.g) (null)));
	//   63  123:new             #197 <Class a>
	//   64  126:dup             
	//   65  127:ldc2            #520 <String "Failed to get module context">
	//   66  130:aconst_null     
	//   67  131:invokespecial   #354 <Method void a(String, com.google.android.gms.dynamite.g)>
	//   68  134:athrow          
			} else
			{
				throw new a("No result cursor", ((com.google.android.gms.dynamite.g) (null)));
	//   69  135:new             #197 <Class a>
	//   70  138:dup             
	//   71  139:ldc2            #522 <String "No result cursor">
	//   72  142:aconst_null     
	//   73  143:invokespecial   #354 <Method void a(String, com.google.android.gms.dynamite.g)>
	//   74  146:athrow          
			}
		} else
		{
			throw new a("DynamiteLoaderV2 was not cached.", ((com.google.android.gms.dynamite.g) (null)));
	//   75  147:new             #197 <Class a>
	//   76  150:dup             
	//   77  151:ldc2            #524 <String "DynamiteLoaderV2 was not cached.">
	//   78  154:aconst_null     
	//   79  155:invokespecial   #354 <Method void a(String, com.google.android.gms.dynamite.g)>
	//   80  158:athrow          
		}
		context;
	//   81  159:astore_0        
		com/google/android/gms/dynamite/DynamiteModule;
	//   82  160:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   83  162:monitorexit     
		throw context;
	//   84  163:aload_0         
	//   85  164:athrow          
	}

	public final Context a()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field Context n>
	//    2    4:areturn         
	}

	public final IBinder a(String s)
	{
		IBinder ibinder = (IBinder)n.getClassLoader().loadClass(s).newInstance();
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field Context n>
	//    2    4:invokevirtual   #100 <Method ClassLoader Context.getClassLoader()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #133 <Method Class ClassLoader.loadClass(String)>
	//    5   11:invokevirtual   #386 <Method Object Class.newInstance()>
	//    6   14:checkcast       #388 <Class IBinder>
	//    7   17:astore_2        
		return ibinder;
	//    8   18:aload_2         
	//    9   19:areturn         
		Object obj;
		obj;
	//   10   20:astore_2        
		break MISSING_BLOCK_LABEL_29;
	//   11   21:goto            29
		obj;
	//   12   24:astore_2        
		break MISSING_BLOCK_LABEL_29;
	//   13   25:goto            29
		obj;
	//   14   28:astore_2        
		s = String.valueOf(((Object) (s)));
	//   15   29:aload_1         
	//   16   30:invokestatic    #108 <Method String String.valueOf(Object)>
	//   17   33:astore_1        
		if(s.length() != 0)
	//*  18   34:aload_1         
	//*  19   35:invokevirtual   #112 <Method int String.length()>
	//*  20   38:ifeq            52
			s = "Failed to instantiate module class: ".concat(s);
	//   21   41:ldc2            #527 <String "Failed to instantiate module class: ">
	//   22   44:aload_1         
	//   23   45:invokevirtual   #178 <Method String String.concat(String)>
	//   24   48:astore_1        
		else
	//*  25   49:goto            63
			s = new String("Failed to instantiate module class: ");
	//   26   52:new             #104 <Class String>
	//   27   55:dup             
	//   28   56:ldc2            #527 <String "Failed to instantiate module class: ">
	//   29   59:invokespecial   #181 <Method void String(String)>
	//   30   62:astore_1        
		throw new a(s, ((Throwable) (obj)), ((com.google.android.gms.dynamite.g) (null)));
	//   31   63:new             #197 <Class a>
	//   32   66:dup             
	//   33   67:aload_1         
	//   34   68:aload_2         
	//   35   69:aconst_null     
	//   36   70:invokespecial   #349 <Method void a(String, Throwable, com.google.android.gms.dynamite.g)>
	//   37   73:athrow          
	}

	public static final b a = new h();
	public static final b b = new j();
	public static final b c = new k();
	public static final b d = new l();
	private static Boolean e;
	private static o f;
	private static q g;
	private static String h;
	private static int i = -1;
	private static final ThreadLocal j = new ThreadLocal();
	private static final c k = new com.google.android.gms.dynamite.g();
	private static final b l = new i();
	private static final b m = new m();
	private final Context n;

	static 
	{
	//    0    0:new             #35  <Class ThreadLocal>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void ThreadLocal()>
	//    3    7:putstatic       #40  <Field ThreadLocal j>
	//    4   10:new             #42  <Class com.google.android.gms.dynamite.g>
	//    5   13:dup             
	//    6   14:invokespecial   #43  <Method void com.google.android.gms.dynamite.g()>
	//    7   17:putstatic       #45  <Field c k>
	//    8   20:new             #47  <Class h>
	//    9   23:dup             
	//   10   24:invokespecial   #48  <Method void h()>
	//   11   27:putstatic       #50  <Field b a>
	//   12   30:new             #52  <Class i>
	//   13   33:dup             
	//   14   34:invokespecial   #53  <Method void i()>
	//   15   37:putstatic       #55  <Field b l>
	//   16   40:new             #57  <Class j>
	//   17   43:dup             
	//   18   44:invokespecial   #58  <Method void j()>
	//   19   47:putstatic       #60  <Field b b>
	//   20   50:new             #62  <Class k>
	//   21   53:dup             
	//   22   54:invokespecial   #63  <Method void k()>
	//   23   57:putstatic       #65  <Field b c>
	//   24   60:new             #67  <Class l>
	//   25   63:dup             
	//   26   64:invokespecial   #68  <Method void l()>
	//   27   67:putstatic       #70  <Field b d>
	//   28   70:new             #72  <Class m>
	//   29   73:dup             
	//   30   74:invokespecial   #73  <Method void m()>
	//   31   77:putstatic       #75  <Field b m>
	//*  32   80:return          
	}
}
