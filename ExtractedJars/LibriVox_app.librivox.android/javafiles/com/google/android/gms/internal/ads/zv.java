// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.a.d;
import com.google.android.gms.ads.a.e;
import com.google.android.gms.ads.c.b;
import com.google.android.gms.ads.g;
import com.google.android.gms.ads.j;
import com.google.android.gms.common.util.o;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.internal.ads:
//			p, bwk, m, zy, 
//			zzwf, ql, aag, zw

public final class zv
{

	public zv()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method void Object()>
	//    2    4:return          
	}

	public static int a(Context context, int i)
	{
		return a(context.getResources().getDisplayMetrics(), i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method Resources Context.getResources()>
	//    2    4:invokevirtual   #76  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    3    7:iload_1         
	//    4    8:invokestatic    #79  <Method int a(DisplayMetrics, int)>
	//    5   11:ireturn         
	}

	public static int a(DisplayMetrics displaymetrics, int i)
	{
		return (int)TypedValue.applyDimension(1, i, displaymetrics);
	//    0    0:iconst_1        
	//    1    1:iload_1         
	//    2    2:i2f             
	//    3    3:aload_0         
	//    4    4:invokestatic    #85  <Method float TypedValue.applyDimension(int, float, DisplayMetrics)>
	//    5    7:f2i             
	//    6    8:ireturn         
	}

	public static String a(Context context)
	{
		context = ((Context) (context.getContentResolver()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #90  <Method android.content.ContentResolver Context.getContentResolver()>
	//    2    4:astore_0        
		if(context == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       14
			context = null;
	//    5    9:aconst_null     
	//    6   10:astore_0        
		else
	//*   7   11:goto            21
			context = ((Context) (android.provider.Settings.Secure.getString(((android.content.ContentResolver) (context)), "android_id")));
	//    8   14:aload_0         
	//    9   15:ldc1            #92  <String "android_id">
	//   10   17:invokestatic    #98  <Method String android.provider.Settings$Secure.getString(android.content.ContentResolver, String)>
	//   11   20:astore_0        
		if(context == null || a())
	//*  12   21:aload_0         
	//*  13   22:ifnull          31
	//*  14   25:invokestatic    #101 <Method boolean a()>
	//*  15   28:ifeq            34
			context = "emulator";
	//   16   31:ldc1            #103 <String "emulator">
	//   17   33:astore_0        
		return a(((String) (context)));
	//   18   34:aload_0         
	//   19   35:invokestatic    #106 <Method String a(String)>
	//   20   38:areturn         
	}

	public static String a(String s)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
_L2:
		if(i >= 2)
			break; /* Loop/switch isn't completed */
	//    2    2:iload_1         
	//    3    3:iconst_2        
	//    4    4:icmpge          58
		Object obj;
		obj = ((Object) (MessageDigest.getInstance("MD5")));
	//    5    7:ldc1            #112 <String "MD5">
	//    6    9:invokestatic    #118 <Method MessageDigest MessageDigest.getInstance(String)>
	//    7   12:astore_2        
		((MessageDigest) (obj)).update(s.getBytes());
	//    8   13:aload_2         
	//    9   14:aload_0         
	//   10   15:invokevirtual   #124 <Method byte[] String.getBytes()>
	//   11   18:invokevirtual   #128 <Method void MessageDigest.update(byte[])>
		obj = ((Object) (String.format(Locale.US, "%032X", new Object[] {
			new BigInteger(1, ((MessageDigest) (obj)).digest())
		})));
	//   12   21:getstatic       #134 <Field Locale Locale.US>
	//   13   24:ldc1            #136 <String "%032X">
	//   14   26:iconst_1        
	//   15   27:anewarray       Object[]
	//   16   30:dup             
	//   17   31:iconst_0        
	//   18   32:new             #138 <Class BigInteger>
	//   19   35:dup             
	//   20   36:iconst_1        
	//   21   37:aload_2         
	//   22   38:invokevirtual   #141 <Method byte[] MessageDigest.digest()>
	//   23   41:invokespecial   #144 <Method void BigInteger(int, byte[])>
	//   24   44:aastore         
	//   25   45:invokestatic    #148 <Method String String.format(Locale, String, Object[])>
	//   26   48:astore_2        
		return ((String) (obj));
	//   27   49:aload_2         
	//   28   50:areturn         
_L3:
		i++;
	//   29   51:iload_1         
	//   30   52:iconst_1        
	//   31   53:iadd            
	//   32   54:istore_1        
		if(true) goto _L2; else goto _L1
	//   33   55:goto            2
_L1:
		return null;
	//   34   58:aconst_null     
	//   35   59:areturn         
		NoSuchAlgorithmException nosuchalgorithmexception;
		nosuchalgorithmexception;
	//   36   60:astore_2        
		  goto _L3
	//*  37   61:goto            51
		s;
	//   38   64:astore_0        
		return null;
	//   39   65:aconst_null     
	//   40   66:areturn         
	}

	public static String a(StackTraceElement astacktraceelement[], String s)
	{
label0:
		{
			int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
			do
			{
				int l = i + 1;
	//    2    2:iload_2         
	//    3    3:iconst_1        
	//    4    4:iadd            
	//    5    5:istore_3        
				if(l >= astacktraceelement.length)
					break;
	//    6    6:iload_3         
	//    7    7:aload_0         
	//    8    8:arraylength     
	//    9    9:icmpge          118
				StackTraceElement stacktraceelement = astacktraceelement[i];
	//   10   12:aload_0         
	//   11   13:iload_2         
	//   12   14:aaload          
	//   13   15:astore          4
				String s1 = stacktraceelement.getClassName();
	//   14   17:aload           4
	//   15   19:invokevirtual   #154 <Method String StackTraceElement.getClassName()>
	//   16   22:astore          5
				if("loadAd".equalsIgnoreCase(stacktraceelement.getMethodName()) && (b.equalsIgnoreCase(s1) || c.equalsIgnoreCase(s1) || d.equalsIgnoreCase(s1) || e.equalsIgnoreCase(s1) || f.equalsIgnoreCase(s1) || g.equalsIgnoreCase(s1)))
	//*  17   24:ldc1            #156 <String "loadAd">
	//*  18   26:aload           4
	//*  19   28:invokevirtual   #159 <Method String StackTraceElement.getMethodName()>
	//*  20   31:invokevirtual   #163 <Method boolean String.equalsIgnoreCase(String)>
	//*  21   34:ifeq            113
	//*  22   37:getstatic       #40  <Field String b>
	//*  23   40:aload           5
	//*  24   42:invokevirtual   #163 <Method boolean String.equalsIgnoreCase(String)>
	//*  25   45:ifne            103
	//*  26   48:getstatic       #44  <Field String c>
	//*  27   51:aload           5
	//*  28   53:invokevirtual   #163 <Method boolean String.equalsIgnoreCase(String)>
	//*  29   56:ifne            103
	//*  30   59:getstatic       #48  <Field String d>
	//*  31   62:aload           5
	//*  32   64:invokevirtual   #163 <Method boolean String.equalsIgnoreCase(String)>
	//*  33   67:ifne            103
	//*  34   70:getstatic       #52  <Field String e>
	//*  35   73:aload           5
	//*  36   75:invokevirtual   #163 <Method boolean String.equalsIgnoreCase(String)>
	//*  37   78:ifne            103
	//*  38   81:getstatic       #56  <Field String f>
	//*  39   84:aload           5
	//*  40   86:invokevirtual   #163 <Method boolean String.equalsIgnoreCase(String)>
	//*  41   89:ifne            103
	//*  42   92:getstatic       #60  <Field String g>
	//*  43   95:aload           5
	//*  44   97:invokevirtual   #163 <Method boolean String.equalsIgnoreCase(String)>
	//*  45  100:ifeq            113
				{
					astacktraceelement = ((StackTraceElement []) (astacktraceelement[l].getClassName()));
	//   46  103:aload_0         
	//   47  104:iload_3         
	//   48  105:aaload          
	//   49  106:invokevirtual   #154 <Method String StackTraceElement.getClassName()>
	//   50  109:astore_0        
					break label0;
	//   51  110:goto            120
				}
				i = l;
	//   52  113:iload_3         
	//   53  114:istore_2        
			} while(true);
	//   54  115:goto            2
			astacktraceelement = null;
	//   55  118:aconst_null     
	//   56  119:astore_0        
		}
		if(s != null)
	//*  57  120:aload_1         
	//*  58  121:ifnull          224
		{
			StringTokenizer stringtokenizer = new StringTokenizer(s, ".");
	//   59  124:new             #165 <Class StringTokenizer>
	//   60  127:dup             
	//   61  128:aload_1         
	//   62  129:ldc1            #167 <String ".">
	//   63  131:invokespecial   #170 <Method void StringTokenizer(String, String)>
	//   64  134:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   65  136:new             #172 <Class StringBuilder>
	//   66  139:dup             
	//   67  140:invokespecial   #173 <Method void StringBuilder()>
	//   68  143:astore          5
			int k = 2;
	//   69  145:iconst_2        
	//   70  146:istore_2        
			if(stringtokenizer.hasMoreElements())
	//*  71  147:aload           4
	//*  72  149:invokevirtual   #176 <Method boolean StringTokenizer.hasMoreElements()>
	//*  73  152:ifeq            210
			{
				stringbuilder.append(stringtokenizer.nextToken());
	//   74  155:aload           5
	//   75  157:aload           4
	//   76  159:invokevirtual   #179 <Method String StringTokenizer.nextToken()>
	//   77  162:invokevirtual   #183 <Method StringBuilder StringBuilder.append(String)>
	//   78  165:pop             
				for(; k > 0 && stringtokenizer.hasMoreElements(); k--)
	//*  79  166:iload_2         
	//*  80  167:ifle            204
	//*  81  170:aload           4
	//*  82  172:invokevirtual   #176 <Method boolean StringTokenizer.hasMoreElements()>
	//*  83  175:ifeq            204
				{
					stringbuilder.append(".");
	//   84  178:aload           5
	//   85  180:ldc1            #167 <String ".">
	//   86  182:invokevirtual   #183 <Method StringBuilder StringBuilder.append(String)>
	//   87  185:pop             
					stringbuilder.append(stringtokenizer.nextToken());
	//   88  186:aload           5
	//   89  188:aload           4
	//   90  190:invokevirtual   #179 <Method String StringTokenizer.nextToken()>
	//   91  193:invokevirtual   #183 <Method StringBuilder StringBuilder.append(String)>
	//   92  196:pop             
				}

	//   93  197:iload_2         
	//   94  198:iconst_1        
	//   95  199:isub            
	//   96  200:istore_2        
	//*  97  201:goto            166
				s = stringbuilder.toString();
	//   98  204:aload           5
	//   99  206:invokevirtual   #186 <Method String StringBuilder.toString()>
	//  100  209:astore_1        
			}
			if(astacktraceelement != null && !((String) (astacktraceelement)).contains(((CharSequence) (s))))
	//* 101  210:aload_0         
	//* 102  211:ifnull          224
	//* 103  214:aload_0         
	//* 104  215:aload_1         
	//* 105  216:invokevirtual   #190 <Method boolean String.contains(CharSequence)>
	//* 106  219:ifne            224
				return ((String) (astacktraceelement));
	//  107  222:aload_0         
	//  108  223:areturn         
		}
		return null;
	//  109  224:aconst_null     
	//  110  225:areturn         
	}

	public static Throwable a(Throwable throwable)
	{
		Object obj = ((Object) (com.google.android.gms.internal.ads.p.e));
	//    0    0:getstatic       #196 <Field com.google.android.gms.internal.ads.e com.google.android.gms.internal.ads.p.e>
	//    1    3:astore          5
		if(((Boolean)com.google.android.gms.internal.ads.bwk.e().a(((com.google.android.gms.internal.ads.e) (obj)))).booleanValue())
	//*   2    5:invokestatic    #201 <Method m com.google.android.gms.internal.ads.bwk.e()>
	//*   3    8:aload           5
	//*   4   10:invokevirtual   #206 <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//*   5   13:checkcast       #208 <Class Boolean>
	//*   6   16:invokevirtual   #211 <Method boolean Boolean.booleanValue()>
	//*   7   19:ifeq            24
			return throwable;
	//    8   22:aload_0         
	//    9   23:areturn         
		obj = ((Object) (new LinkedList()));
	//   10   24:new             #213 <Class LinkedList>
	//   11   27:dup             
	//   12   28:invokespecial   #214 <Method void LinkedList()>
	//   13   31:astore          5
		for(; throwable != null; throwable = throwable.getCause())
	//*  14   33:aload_0         
	//*  15   34:ifnull          51
			((LinkedList) (obj)).push(((Object) (throwable)));
	//   16   37:aload           5
	//   17   39:aload_0         
	//   18   40:invokevirtual   #218 <Method void LinkedList.push(Object)>

	//   19   43:aload_0         
	//   20   44:invokevirtual   #224 <Method Throwable Throwable.getCause()>
	//   21   47:astore_0        
	//*  22   48:goto            33
		throwable = null;
	//   23   51:aconst_null     
	//   24   52:astore_0        
		do
		{
			if(((LinkedList) (obj)).isEmpty())
				break;
	//   25   53:aload           5
	//   26   55:invokevirtual   #227 <Method boolean LinkedList.isEmpty()>
	//   27   58:ifne            301
			Throwable throwable1 = (Throwable)((LinkedList) (obj)).pop();
	//   28   61:aload           5
	//   29   63:invokevirtual   #231 <Method Object LinkedList.pop()>
	//   30   66:checkcast       #220 <Class Throwable>
	//   31   69:astore          7
			StackTraceElement astacktraceelement[] = throwable1.getStackTrace();
	//   32   71:aload           7
	//   33   73:invokevirtual   #235 <Method StackTraceElement[] Throwable.getStackTrace()>
	//   34   76:astore          8
			ArrayList arraylist = new ArrayList();
	//   35   78:new             #237 <Class ArrayList>
	//   36   81:dup             
	//   37   82:invokespecial   #238 <Method void ArrayList()>
	//   38   85:astore          6
			arraylist.add(((Object) (new StackTraceElement(((Object) (throwable1)).getClass().getName(), "<filtered>", "<filtered>", 1))));
	//   39   87:aload           6
	//   40   89:new             #151 <Class StackTraceElement>
	//   41   92:dup             
	//   42   93:aload           7
	//   43   95:invokevirtual   #242 <Method Class Object.getClass()>
	//   44   98:invokevirtual   #38  <Method String Class.getName()>
	//   45  101:ldc1            #244 <String "<filtered>">
	//   46  103:ldc1            #244 <String "<filtered>">
	//   47  105:iconst_1        
	//   48  106:invokespecial   #247 <Method void StackTraceElement(String, String, String, int)>
	//   49  109:invokevirtual   #251 <Method boolean ArrayList.add(Object)>
	//   50  112:pop             
			int k = astacktraceelement.length;
	//   51  113:aload           8
	//   52  115:arraylength     
	//   53  116:istore          4
			int i = 0;
	//   54  118:iconst_0        
	//   55  119:istore_1        
			boolean flag = false;
	//   56  120:iconst_0        
	//   57  121:istore_2        
			for(; i < k; i++)
	//*  58  122:iload_1         
	//*  59  123:iload           4
	//*  60  125:icmpge          244
			{
				StackTraceElement stacktraceelement = astacktraceelement[i];
	//   61  128:aload           8
	//   62  130:iload_1         
	//   63  131:aaload          
	//   64  132:astore          9
				if(b(stacktraceelement.getClassName()))
	//*  65  134:aload           9
	//*  66  136:invokevirtual   #154 <Method String StackTraceElement.getClassName()>
	//*  67  139:invokestatic    #253 <Method boolean b(String)>
	//*  68  142:ifeq            158
				{
					arraylist.add(((Object) (stacktraceelement)));
	//   69  145:aload           6
	//   70  147:aload           9
	//   71  149:invokevirtual   #251 <Method boolean ArrayList.add(Object)>
	//   72  152:pop             
					flag = true;
	//   73  153:iconst_1        
	//   74  154:istore_2        
					continue;
	//   75  155:goto            237
				}
				String s = stacktraceelement.getClassName();
	//   76  158:aload           9
	//   77  160:invokevirtual   #154 <Method String StackTraceElement.getClassName()>
	//   78  163:astore          10
				boolean flag1;
				if(!TextUtils.isEmpty(((CharSequence) (s))) && (s.startsWith("android.") || s.startsWith("java.")))
	//*  79  165:aload           10
	//*  80  167:invokestatic    #257 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  81  170:ifne            200
	//*  82  173:aload           10
	//*  83  175:ldc2            #259 <String "android.">
	//*  84  178:invokevirtual   #262 <Method boolean String.startsWith(String)>
	//*  85  181:ifne            195
	//*  86  184:aload           10
	//*  87  186:ldc2            #264 <String "java.">
	//*  88  189:invokevirtual   #262 <Method boolean String.startsWith(String)>
	//*  89  192:ifeq            200
					flag1 = true;
	//   90  195:iconst_1        
	//   91  196:istore_3        
				else
	//*  92  197:goto            202
					flag1 = false;
	//   93  200:iconst_0        
	//   94  201:istore_3        
				if(flag1)
	//*  95  202:iload_3         
	//*  96  203:ifeq            217
					arraylist.add(((Object) (stacktraceelement)));
	//   97  206:aload           6
	//   98  208:aload           9
	//   99  210:invokevirtual   #251 <Method boolean ArrayList.add(Object)>
	//  100  213:pop             
				else
	//* 101  214:goto            237
					arraylist.add(((Object) (new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1))));
	//  102  217:aload           6
	//  103  219:new             #151 <Class StackTraceElement>
	//  104  222:dup             
	//  105  223:ldc1            #244 <String "<filtered>">
	//  106  225:ldc1            #244 <String "<filtered>">
	//  107  227:ldc1            #244 <String "<filtered>">
	//  108  229:iconst_1        
	//  109  230:invokespecial   #247 <Method void StackTraceElement(String, String, String, int)>
	//  110  233:invokevirtual   #251 <Method boolean ArrayList.add(Object)>
	//  111  236:pop             
			}

	//  112  237:iload_1         
	//  113  238:iconst_1        
	//  114  239:iadd            
	//  115  240:istore_1        
	//* 116  241:goto            122
			if(flag)
	//* 117  244:iload_2         
	//* 118  245:ifeq            53
			{
				if(throwable == null)
	//* 119  248:aload_0         
	//* 120  249:ifnonnull       268
					throwable = new Throwable(throwable1.getMessage());
	//  121  252:new             #220 <Class Throwable>
	//  122  255:dup             
	//  123  256:aload           7
	//  124  258:invokevirtual   #267 <Method String Throwable.getMessage()>
	//  125  261:invokespecial   #270 <Method void Throwable(String)>
	//  126  264:astore_0        
				else
	//* 127  265:goto            282
					throwable = new Throwable(throwable1.getMessage(), throwable);
	//  128  268:new             #220 <Class Throwable>
	//  129  271:dup             
	//  130  272:aload           7
	//  131  274:invokevirtual   #267 <Method String Throwable.getMessage()>
	//  132  277:aload_0         
	//  133  278:invokespecial   #273 <Method void Throwable(String, Throwable)>
	//  134  281:astore_0        
				throwable.setStackTrace((StackTraceElement[])arraylist.toArray(((Object []) (new StackTraceElement[0]))));
	//  135  282:aload_0         
	//  136  283:aload           6
	//  137  285:iconst_0        
	//  138  286:anewarray       StackTraceElement[]
	//  139  289:invokevirtual   #277 <Method Object[] ArrayList.toArray(Object[])>
	//  140  292:checkcast       #279 <Class StackTraceElement[]>
	//  141  295:invokevirtual   #283 <Method void Throwable.setStackTrace(StackTraceElement[])>
			}
		} while(true);
	//  142  298:goto            53
		return throwable;
	//  143  301:aload_0         
	//  144  302:areturn         
	}

	public static void a(Context context, String s, String s1, Bundle bundle, boolean flag, zy zy1)
	{
		if(flag)
	//*   0    0:iload           4
	//*   1    2:ifeq            114
		{
			Context context1 = context.getApplicationContext();
	//    2    5:aload_0         
	//    3    6:invokevirtual   #288 <Method Context Context.getApplicationContext()>
	//    4    9:astore          8
			Object obj = ((Object) (context1));
	//    5   11:aload           8
	//    6   13:astore          7
			if(context1 == null)
	//*   7   15:aload           8
	//*   8   17:ifnonnull       23
				obj = ((Object) (context));
	//    9   20:aload_0         
	//   10   21:astore          7
			bundle.putString("os", android.os.Build.VERSION.RELEASE);
	//   11   23:aload_3         
	//   12   24:ldc2            #290 <String "os">
	//   13   27:getstatic       #295 <Field String android.os.Build$VERSION.RELEASE>
	//   14   30:invokevirtual   #300 <Method void Bundle.putString(String, String)>
			bundle.putString("api", String.valueOf(android.os.Build.VERSION.SDK_INT));
	//   15   33:aload_3         
	//   16   34:ldc2            #302 <String "api">
	//   17   37:getstatic       #306 <Field int android.os.Build$VERSION.SDK_INT>
	//   18   40:invokestatic    #310 <Method String String.valueOf(int)>
	//   19   43:invokevirtual   #300 <Method void Bundle.putString(String, String)>
			bundle.putString("appid", ((Context) (obj)).getPackageName());
	//   20   46:aload_3         
	//   21   47:ldc2            #312 <String "appid">
	//   22   50:aload           7
	//   23   52:invokevirtual   #315 <Method String Context.getPackageName()>
	//   24   55:invokevirtual   #300 <Method void Bundle.putString(String, String)>
			obj = ((Object) (s));
	//   25   58:aload_1         
	//   26   59:astore          7
			if(s == null)
	//*  27   61:aload_1         
	//*  28   62:ifnonnull       105
			{
				int i = com.google.android.gms.common.e.b().d(context);
	//   29   65:invokestatic    #320 <Method com.google.android.gms.common.e com.google.android.gms.common.e.b()>
	//   30   68:aload_0         
	//   31   69:invokevirtual   #323 <Method int com.google.android.gms.common.e.d(Context)>
	//   32   72:istore          6
				context = ((Context) (new StringBuilder(20)));
	//   33   74:new             #172 <Class StringBuilder>
	//   34   77:dup             
	//   35   78:bipush          20
	//   36   80:invokespecial   #326 <Method void StringBuilder(int)>
	//   37   83:astore_0        
				((StringBuilder) (context)).append(i);
	//   38   84:aload_0         
	//   39   85:iload           6
	//   40   87:invokevirtual   #329 <Method StringBuilder StringBuilder.append(int)>
	//   41   90:pop             
				((StringBuilder) (context)).append(".14300000");
	//   42   91:aload_0         
	//   43   92:ldc2            #331 <String ".14300000">
	//   44   95:invokevirtual   #183 <Method StringBuilder StringBuilder.append(String)>
	//   45   98:pop             
				obj = ((Object) (((StringBuilder) (context)).toString()));
	//   46   99:aload_0         
	//   47  100:invokevirtual   #186 <Method String StringBuilder.toString()>
	//   48  103:astore          7
			}
			bundle.putString("js", ((String) (obj)));
	//   49  105:aload_3         
	//   50  106:ldc2            #333 <String "js">
	//   51  109:aload           7
	//   52  111:invokevirtual   #300 <Method void Bundle.putString(String, String)>
		}
		context = ((Context) ((new android.net.Uri.Builder()).scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", s1)));
	//   53  114:new             #335 <Class android.net.Uri$Builder>
	//   54  117:dup             
	//   55  118:invokespecial   #336 <Method void android.net.Uri$Builder()>
	//   56  121:ldc2            #338 <String "https">
	//   57  124:invokevirtual   #342 <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
	//   58  127:ldc2            #344 <String "//pagead2.googlesyndication.com/pagead/gen_204">
	//   59  130:invokevirtual   #347 <Method android.net.Uri$Builder android.net.Uri$Builder.path(String)>
	//   60  133:ldc2            #349 <String "id">
	//   61  136:aload_2         
	//   62  137:invokevirtual   #353 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   63  140:astore_0        
		for(s = ((String) (bundle.keySet().iterator())); ((Iterator) (s)).hasNext(); ((android.net.Uri.Builder) (context)).appendQueryParameter(s1, bundle.getString(s1)))
	//*  64  141:aload_3         
	//*  65  142:invokevirtual   #357 <Method Set Bundle.keySet()>
	//*  66  145:invokeinterface #363 <Method Iterator Set.iterator()>
	//*  67  150:astore_1        
	//*  68  151:aload_1         
	//*  69  152:invokeinterface #368 <Method boolean Iterator.hasNext()>
	//*  70  157:ifeq            184
			s1 = (String)((Iterator) (s)).next();
	//   71  160:aload_1         
	//   72  161:invokeinterface #371 <Method Object Iterator.next()>
	//   73  166:checkcast       #120 <Class String>
	//   74  169:astore_2        

	//   75  170:aload_0         
	//   76  171:aload_2         
	//   77  172:aload_3         
	//   78  173:aload_2         
	//   79  174:invokevirtual   #373 <Method String Bundle.getString(String)>
	//   80  177:invokevirtual   #353 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   81  180:pop             
	//*  82  181:goto            151
		zy1.a(((android.net.Uri.Builder) (context)).toString());
	//   83  184:aload           5
	//   84  186:aload_0         
	//   85  187:invokevirtual   #374 <Method String android.net.Uri$Builder.toString()>
	//   86  190:invokeinterface #378 <Method void zy.a(String)>
	//   87  195:return          
	}

	private final void a(ViewGroup viewgroup, zzwf zzwf1, String s, int i, int k)
	{
		if(viewgroup.getChildCount() != 0)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #385 <Method int ViewGroup.getChildCount()>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			Context context = viewgroup.getContext();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #388 <Method Context ViewGroup.getContext()>
	//    6   12:astore          6
			TextView textview = new TextView(context);
	//    7   14:new             #390 <Class TextView>
	//    8   17:dup             
	//    9   18:aload           6
	//   10   20:invokespecial   #393 <Method void TextView(Context)>
	//   11   23:astore          7
			textview.setGravity(17);
	//   12   25:aload           7
	//   13   27:bipush          17
	//   14   29:invokevirtual   #396 <Method void TextView.setGravity(int)>
			textview.setText(((CharSequence) (s)));
	//   15   32:aload           7
	//   16   34:aload_3         
	//   17   35:invokevirtual   #400 <Method void TextView.setText(CharSequence)>
			textview.setTextColor(i);
	//   18   38:aload           7
	//   19   40:iload           4
	//   20   42:invokevirtual   #403 <Method void TextView.setTextColor(int)>
			textview.setBackgroundColor(k);
	//   21   45:aload           7
	//   22   47:iload           5
	//   23   49:invokevirtual   #406 <Method void TextView.setBackgroundColor(int)>
			s = ((String) (new FrameLayout(context)));
	//   24   52:new             #408 <Class FrameLayout>
	//   25   55:dup             
	//   26   56:aload           6
	//   27   58:invokespecial   #409 <Method void FrameLayout(Context)>
	//   28   61:astore_3        
			((FrameLayout) (s)).setBackgroundColor(i);
	//   29   62:aload_3         
	//   30   63:iload           4
	//   31   65:invokevirtual   #410 <Method void FrameLayout.setBackgroundColor(int)>
			i = a(context, 3);
	//   32   68:aload           6
	//   33   70:iconst_3        
	//   34   71:invokestatic    #412 <Method int a(Context, int)>
	//   35   74:istore          4
			((FrameLayout) (s)).addView(((android.view.View) (textview)), ((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(zzwf1.f - i, zzwf1.c - i, 17))));
	//   36   76:aload_3         
	//   37   77:aload           7
	//   38   79:new             #414 <Class android.widget.FrameLayout$LayoutParams>
	//   39   82:dup             
	//   40   83:aload_2         
	//   41   84:getfield        #418 <Field int zzwf.f>
	//   42   87:iload           4
	//   43   89:isub            
	//   44   90:aload_2         
	//   45   91:getfield        #420 <Field int zzwf.c>
	//   46   94:iload           4
	//   47   96:isub            
	//   48   97:bipush          17
	//   49   99:invokespecial   #423 <Method void android.widget.FrameLayout$LayoutParams(int, int, int)>
	//   50  102:invokevirtual   #427 <Method void FrameLayout.addView(android.view.View, android.view.ViewGroup$LayoutParams)>
			viewgroup.addView(((android.view.View) (s)), zzwf1.f, zzwf1.c);
	//   51  105:aload_1         
	//   52  106:aload_3         
	//   53  107:aload_2         
	//   54  108:getfield        #418 <Field int zzwf.f>
	//   55  111:aload_2         
	//   56  112:getfield        #420 <Field int zzwf.c>
	//   57  115:invokevirtual   #430 <Method void ViewGroup.addView(android.view.View, int, int)>
			return;
	//   58  118:return          
		}
	}

	public static void a(boolean flag, HttpURLConnection httpurlconnection, String s)
	{
		httpurlconnection.setConnectTimeout(60000);
	//    0    0:aload_1         
	//    1    1:ldc2            #432 <Int 60000>
	//    2    4:invokevirtual   #437 <Method void HttpURLConnection.setConnectTimeout(int)>
		httpurlconnection.setInstanceFollowRedirects(true);
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:invokevirtual   #441 <Method void HttpURLConnection.setInstanceFollowRedirects(boolean)>
		httpurlconnection.setReadTimeout(60000);
	//    6   12:aload_1         
	//    7   13:ldc2            #432 <Int 60000>
	//    8   16:invokevirtual   #444 <Method void HttpURLConnection.setReadTimeout(int)>
		if(s != null)
	//*   9   19:aload_2         
	//*  10   20:ifnull          31
			httpurlconnection.setRequestProperty("User-Agent", s);
	//   11   23:aload_1         
	//   12   24:ldc2            #446 <String "User-Agent">
	//   13   27:aload_2         
	//   14   28:invokevirtual   #449 <Method void HttpURLConnection.setRequestProperty(String, String)>
		httpurlconnection.setUseCaches(false);
	//   15   31:aload_1         
	//   16   32:iconst_0        
	//   17   33:invokevirtual   #452 <Method void HttpURLConnection.setUseCaches(boolean)>
	//   18   36:return          
	}

	public static boolean a()
	{
		return Build.DEVICE.startsWith("generic");
	//    0    0:getstatic       #457 <Field String Build.DEVICE>
	//    1    3:ldc2            #459 <String "generic">
	//    2    6:invokevirtual   #262 <Method boolean String.startsWith(String)>
	//    3    9:ireturn         
	}

	public static int b(Context context, int i)
	{
		context = ((Context) (((WindowManager)context.getSystemService("window")).getDefaultDisplay()));
	//    0    0:aload_0         
	//    1    1:ldc2            #461 <String "window">
	//    2    4:invokevirtual   #465 <Method Object Context.getSystemService(String)>
	//    3    7:checkcast       #467 <Class WindowManager>
	//    4   10:invokeinterface #471 <Method Display WindowManager.getDefaultDisplay()>
	//    5   15:astore_0        
		DisplayMetrics displaymetrics = new DisplayMetrics();
	//    6   16:new             #473 <Class DisplayMetrics>
	//    7   19:dup             
	//    8   20:invokespecial   #474 <Method void DisplayMetrics()>
	//    9   23:astore_2        
		((Display) (context)).getMetrics(displaymetrics);
	//   10   24:aload_0         
	//   11   25:aload_2         
	//   12   26:invokevirtual   #480 <Method void Display.getMetrics(DisplayMetrics)>
		return b(displaymetrics, i);
	//   13   29:aload_2         
	//   14   30:iload_1         
	//   15   31:invokestatic    #482 <Method int b(DisplayMetrics, int)>
	//   16   34:ireturn         
	}

	public static int b(DisplayMetrics displaymetrics, int i)
	{
		return Math.round((float)i / displaymetrics.density);
	//    0    0:iload_1         
	//    1    1:i2f             
	//    2    2:aload_0         
	//    3    3:getfield        #486 <Field float DisplayMetrics.density>
	//    4    6:fdiv            
	//    5    7:invokestatic    #492 <Method int Math.round(float)>
	//    6   10:ireturn         
	}

	public static String b(Context context)
	{
		context = ((Context) (context.getContentResolver()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #90  <Method android.content.ContentResolver Context.getContentResolver()>
	//    2    4:astore_0        
		if(context == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return android.provider.Settings.Secure.getString(((android.content.ContentResolver) (context)), "android_id");
	//    7   11:aload_0         
	//    8   12:ldc1            #92  <String "android_id">
	//    9   14:invokestatic    #98  <Method String android.provider.Settings$Secure.getString(android.content.ContentResolver, String)>
	//   10   17:areturn         
	}

	public static boolean b()
	{
		return Looper.myLooper() == Looper.getMainLooper();
	//    0    0:invokestatic    #495 <Method Looper Looper.myLooper()>
	//    1    3:invokestatic    #24  <Method Looper Looper.getMainLooper()>
	//    2    6:if_acmpne       11
	//    3    9:iconst_1        
	//    4   10:ireturn         
	//    5   11:iconst_0        
	//    6   12:ireturn         
	}

	public static boolean b(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #257 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		com.google.android.gms.internal.ads.e e1 = p.f;
	//    5    9:getstatic       #499 <Field com.google.android.gms.internal.ads.e p.f>
	//    6   12:astore_2        
		if(s.startsWith((String)com.google.android.gms.internal.ads.bwk.e().a(e1)))
	//*   7   13:aload_0         
	//*   8   14:invokestatic    #201 <Method m com.google.android.gms.internal.ads.bwk.e()>
	//*   9   17:aload_2         
	//*  10   18:invokevirtual   #206 <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//*  11   21:checkcast       #120 <Class String>
	//*  12   24:invokevirtual   #262 <Method boolean String.startsWith(String)>
	//*  13   27:ifeq            32
			return true;
	//   14   30:iconst_1        
	//   15   31:ireturn         
		boolean flag;
		try
		{
			flag = Class.forName(s).isAnnotationPresent(com/google/android/gms/internal/ads/ql);
	//   16   32:aload_0         
	//   17   33:invokestatic    #503 <Method Class Class.forName(String)>
	//   18   36:ldc2            #505 <Class ql>
	//   19   39:invokevirtual   #509 <Method boolean Class.isAnnotationPresent(Class)>
	//   20   42:istore_1        
		}
	//*  21   43:iload_1         
	//*  22   44:ireturn         
		catch(Exception exception)
	//*  23   45:astore_2        
		{
			s = String.valueOf(((Object) (s)));
	//   24   46:aload_0         
	//   25   47:invokestatic    #512 <Method String String.valueOf(Object)>
	//   26   50:astore_0        
			if(s.length() != 0)
	//*  27   51:aload_0         
	//*  28   52:invokevirtual   #515 <Method int String.length()>
	//*  29   55:ifeq            69
				s = "Fail to check class type for class ".concat(s);
	//   30   58:ldc2            #517 <String "Fail to check class type for class ">
	//   31   61:aload_0         
	//   32   62:invokevirtual   #520 <Method String String.concat(String)>
	//   33   65:astore_0        
			else
	//*  34   66:goto            80
				s = new String("Fail to check class type for class ");
	//   35   69:new             #120 <Class String>
	//   36   72:dup             
	//   37   73:ldc2            #517 <String "Fail to check class type for class ">
	//   38   76:invokespecial   #521 <Method void String(String)>
	//   39   79:astore_0        
			aag.a(s, ((Throwable) (exception)));
	//   40   80:aload_0         
	//   41   81:aload_2         
	//   42   82:invokestatic    #525 <Method void aag.a(String, Throwable)>
			return false;
	//   43   85:iconst_0        
	//   44   86:ireturn         
		}
		return flag;
	}

	public static String c()
	{
		int i;
		Object obj;
		byte abyte0[];
		byte abyte1[];
		obj = ((Object) (UUID.randomUUID()));
	//    0    0:invokestatic    #531 <Method UUID UUID.randomUUID()>
	//    1    3:astore_1        
		abyte0 = BigInteger.valueOf(((UUID) (obj)).getLeastSignificantBits()).toByteArray();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #535 <Method long UUID.getLeastSignificantBits()>
	//    4    8:invokestatic    #538 <Method BigInteger BigInteger.valueOf(long)>
	//    5   11:invokevirtual   #541 <Method byte[] BigInteger.toByteArray()>
	//    6   14:astore_3        
		abyte1 = BigInteger.valueOf(((UUID) (obj)).getMostSignificantBits()).toByteArray();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #544 <Method long UUID.getMostSignificantBits()>
	//    9   19:invokestatic    #538 <Method BigInteger BigInteger.valueOf(long)>
	//   10   22:invokevirtual   #541 <Method byte[] BigInteger.toByteArray()>
	//   11   25:astore          4
		obj = ((Object) ((new BigInteger(1, abyte0)).toString()));
	//   12   27:new             #138 <Class BigInteger>
	//   13   30:dup             
	//   14   31:iconst_1        
	//   15   32:aload_3         
	//   16   33:invokespecial   #144 <Method void BigInteger(int, byte[])>
	//   17   36:invokevirtual   #545 <Method String BigInteger.toString()>
	//   18   39:astore_1        
		i = 0;
	//   19   40:iconst_0        
	//   20   41:istore_0        
_L2:
		if(i >= 2)
			break; /* Loop/switch isn't completed */
	//   21   42:iload_0         
	//   22   43:iconst_2        
	//   23   44:icmpge          106
		Object obj1;
		obj1 = ((Object) (MessageDigest.getInstance("MD5")));
	//   24   47:ldc1            #112 <String "MD5">
	//   25   49:invokestatic    #118 <Method MessageDigest MessageDigest.getInstance(String)>
	//   26   52:astore_2        
		((MessageDigest) (obj1)).update(abyte0);
	//   27   53:aload_2         
	//   28   54:aload_3         
	//   29   55:invokevirtual   #128 <Method void MessageDigest.update(byte[])>
		((MessageDigest) (obj1)).update(abyte1);
	//   30   58:aload_2         
	//   31   59:aload           4
	//   32   61:invokevirtual   #128 <Method void MessageDigest.update(byte[])>
		byte abyte2[] = new byte[8];
	//   33   64:bipush          8
	//   34   66:newarray        byte[]
	//   35   68:astore          5
		System.arraycopy(((Object) (((MessageDigest) (obj1)).digest())), 0, ((Object) (abyte2)), 0, 8);
	//   36   70:aload_2         
	//   37   71:invokevirtual   #141 <Method byte[] MessageDigest.digest()>
	//   38   74:iconst_0        
	//   39   75:aload           5
	//   40   77:iconst_0        
	//   41   78:bipush          8
	//   42   80:invokestatic    #551 <Method void System.arraycopy(Object, int, Object, int, int)>
		obj1 = ((Object) ((new BigInteger(1, abyte2)).toString()));
	//   43   83:new             #138 <Class BigInteger>
	//   44   86:dup             
	//   45   87:iconst_1        
	//   46   88:aload           5
	//   47   90:invokespecial   #144 <Method void BigInteger(int, byte[])>
	//   48   93:invokevirtual   #545 <Method String BigInteger.toString()>
	//   49   96:astore_2        
		obj = obj1;
	//   50   97:aload_2         
	//   51   98:astore_1        
_L3:
		i++;
	//   52   99:iload_0         
	//   53  100:iconst_1        
	//   54  101:iadd            
	//   55  102:istore_0        
		if(true) goto _L2; else goto _L1
	//   56  103:goto            42
_L1:
		return ((String) (obj));
	//   57  106:aload_1         
	//   58  107:areturn         
		NoSuchAlgorithmException nosuchalgorithmexception;
		nosuchalgorithmexception;
	//   59  108:astore_2        
		  goto _L3
	//*  60  109:goto            99
	}

	public static boolean c(Context context)
	{
		int i = com.google.android.gms.common.e.b().b(context, 0xbdfcb8);
	//    0    0:invokestatic    #320 <Method com.google.android.gms.common.e com.google.android.gms.common.e.b()>
	//    1    3:aload_0         
	//    2    4:ldc2            #553 <Int 0xbdfcb8>
	//    3    7:invokevirtual   #555 <Method int com.google.android.gms.common.e.b(Context, int)>
	//    4   10:istore_1        
		return i == 0 || i == 2;
	//    5   11:iload_1         
	//    6   12:ifeq            25
	//    7   15:iload_1         
	//    8   16:iconst_2        
	//    9   17:icmpne          23
	//   10   20:goto            25
	//   11   23:iconst_0        
	//   12   24:ireturn         
	//   13   25:iconst_1        
	//   14   26:ireturn         
	}

	public static boolean c(Context context, int i)
	{
		return com.google.android.gms.common.e.b().b(context, i) == 0;
	//    0    0:invokestatic    #320 <Method com.google.android.gms.common.e com.google.android.gms.common.e.b()>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokevirtual   #555 <Method int com.google.android.gms.common.e.b(Context, int)>
	//    4    8:ifne            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public static boolean d(Context context)
	{
		if(context.getResources().getConfiguration().orientation != 2)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #70  <Method Resources Context.getResources()>
	//*   2    4:invokevirtual   #560 <Method Configuration Resources.getConfiguration()>
	//*   3    7:getfield        #565 <Field int Configuration.orientation>
	//*   4   10:iconst_2        
	//*   5   11:icmpeq          16
			return false;
	//    6   14:iconst_0        
	//    7   15:ireturn         
		context = ((Context) (context.getResources().getDisplayMetrics()));
	//    8   16:aload_0         
	//    9   17:invokevirtual   #70  <Method Resources Context.getResources()>
	//   10   20:invokevirtual   #76  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   11   23:astore_0        
		return (int)((float)((DisplayMetrics) (context)).heightPixels / ((DisplayMetrics) (context)).density) < 600;
	//   12   24:aload_0         
	//   13   25:getfield        #568 <Field int DisplayMetrics.heightPixels>
	//   14   28:i2f             
	//   15   29:aload_0         
	//   16   30:getfield        #486 <Field float DisplayMetrics.density>
	//   17   33:fdiv            
	//   18   34:f2i             
	//   19   35:sipush          600
	//   20   38:icmpge          43
	//   21   41:iconst_1        
	//   22   42:ireturn         
	//   23   43:iconst_0        
	//   24   44:ireturn         
	}

	public static boolean e(Context context)
	{
		DisplayMetrics displaymetrics = context.getResources().getDisplayMetrics();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method Resources Context.getResources()>
	//    2    4:invokevirtual   #76  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    3    7:astore          5
		context = ((Context) (((WindowManager)context.getSystemService("window")).getDefaultDisplay()));
	//    4    9:aload_0         
	//    5   10:ldc2            #461 <String "window">
	//    6   13:invokevirtual   #465 <Method Object Context.getSystemService(String)>
	//    7   16:checkcast       #467 <Class WindowManager>
	//    8   19:invokeinterface #471 <Method Display WindowManager.getDefaultDisplay()>
	//    9   24:astore_0        
		int i;
		int k;
		int l;
		int i1;
		if(o.d())
	//*  10   25:invokestatic    #575 <Method boolean o.d()>
	//*  11   28:ifeq            52
		{
			((Display) (context)).getRealMetrics(displaymetrics);
	//   12   31:aload_0         
	//   13   32:aload           5
	//   14   34:invokevirtual   #578 <Method void Display.getRealMetrics(DisplayMetrics)>
			i = displaymetrics.heightPixels;
	//   15   37:aload           5
	//   16   39:getfield        #568 <Field int DisplayMetrics.heightPixels>
	//   17   42:istore_1        
			k = displaymetrics.widthPixels;
	//   18   43:aload           5
	//   19   45:getfield        #581 <Field int DisplayMetrics.widthPixels>
	//   20   48:istore_2        
		} else
	//*  21   49:goto            108
		{
			try
			{
				i = ((Integer)((Class) (android/view/Display)).getMethod("getRawHeight", new Class[0]).invoke(((Object) (context)), new Object[0])).intValue();
	//   22   52:ldc2            #476 <Class Display>
	//   23   55:ldc2            #583 <String "getRawHeight">
	//   24   58:iconst_0        
	//   25   59:anewarray       Class[]
	//   26   62:invokevirtual   #587 <Method Method Class.getMethod(String, Class[])>
	//   27   65:aload_0         
	//   28   66:iconst_0        
	//   29   67:anewarray       Object[]
	//   30   70:invokevirtual   #593 <Method Object Method.invoke(Object, Object[])>
	//   31   73:checkcast       #595 <Class Integer>
	//   32   76:invokevirtual   #598 <Method int Integer.intValue()>
	//   33   79:istore_1        
				k = ((Integer)((Class) (android/view/Display)).getMethod("getRawWidth", new Class[0]).invoke(((Object) (context)), new Object[0])).intValue();
	//   34   80:ldc2            #476 <Class Display>
	//   35   83:ldc2            #600 <String "getRawWidth">
	//   36   86:iconst_0        
	//   37   87:anewarray       Class[]
	//   38   90:invokevirtual   #587 <Method Method Class.getMethod(String, Class[])>
	//   39   93:aload_0         
	//   40   94:iconst_0        
	//   41   95:anewarray       Object[]
	//   42   98:invokevirtual   #593 <Method Object Method.invoke(Object, Object[])>
	//   43  101:checkcast       #595 <Class Integer>
	//   44  104:invokevirtual   #598 <Method int Integer.intValue()>
	//   45  107:istore_2        
			}
	//*  46  108:aload_0         
	//*  47  109:aload           5
	//*  48  111:invokevirtual   #480 <Method void Display.getMetrics(DisplayMetrics)>
	//*  49  114:aload           5
	//*  50  116:getfield        #568 <Field int DisplayMetrics.heightPixels>
	//*  51  119:istore_3        
	//*  52  120:aload           5
	//*  53  122:getfield        #581 <Field int DisplayMetrics.widthPixels>
	//*  54  125:istore          4
	//*  55  127:iload_3         
	//*  56  128:iload_1         
	//*  57  129:icmpne          140
	//*  58  132:iload           4
	//*  59  134:iload_2         
	//*  60  135:icmpne          140
	//*  61  138:iconst_1        
	//*  62  139:ireturn         
	//*  63  140:iconst_0        
	//*  64  141:ireturn         
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  65  142:astore_0        
			{
				return false;
	//   66  143:iconst_0        
	//   67  144:ireturn         
			}
		}
		((Display) (context)).getMetrics(displaymetrics);
		l = displaymetrics.heightPixels;
		i1 = displaymetrics.widthPixels;
		return l == i && i1 == k;
	}

	public static int f(Context context)
	{
		int i = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method Resources Context.getResources()>
	//    2    4:ldc2            #603 <String "navigation_bar_width">
	//    3    7:ldc2            #605 <String "dimen">
	//    4   10:ldc2            #607 <String "android">
	//    5   13:invokevirtual   #611 <Method int Resources.getIdentifier(String, String, String)>
	//    6   16:istore_1        
		if(i > 0)
	//*   7   17:iload_1         
	//*   8   18:ifle            30
			return context.getResources().getDimensionPixelSize(i);
	//    9   21:aload_0         
	//   10   22:invokevirtual   #70  <Method Resources Context.getResources()>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #615 <Method int Resources.getDimensionPixelSize(int)>
	//   13   29:ireturn         
		else
			return 0;
	//   14   30:iconst_0        
	//   15   31:ireturn         
	}

	public final void a(Context context, String s, String s1, Bundle bundle, boolean flag)
	{
		a(context, s, s1, bundle, true, ((zy) (new zw(this))));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:iconst_1        
	//    5    6:new             #618 <Class zw>
	//    6    9:dup             
	//    7   10:aload_0         
	//    8   11:invokespecial   #621 <Method void zw(zv)>
	//    9   14:invokestatic    #623 <Method void a(Context, String, String, Bundle, boolean, zy)>
	//   10   17:return          
	}

	public final void a(ViewGroup viewgroup, zzwf zzwf1, String s)
	{
		a(viewgroup, zzwf1, s, 0xff000000, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:ldc2            #625 <Int 0xff000000>
	//    5    7:iconst_m1       
	//    6    8:invokespecial   #627 <Method void a(ViewGroup, zzwf, String, int, int)>
	//    7   11:return          
	}

	public final void a(ViewGroup viewgroup, zzwf zzwf1, String s, String s1)
	{
		com.google.android.gms.internal.ads.aag.e(s1);
	//    0    0:aload           4
	//    1    2:invokestatic    #630 <Method void com.google.android.gms.internal.ads.aag.e(String)>
		a(viewgroup, zzwf1, s, 0xffff0000, 0xff000000);
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:aload_2         
	//    5    8:aload_3         
	//    6    9:ldc2            #631 <Int 0xffff0000>
	//    7   12:ldc2            #625 <Int 0xff000000>
	//    8   15:invokespecial   #627 <Method void a(ViewGroup, zzwf, String, int, int)>
	//    9   18:return          
	}

	public static final Handler a = new Handler(Looper.getMainLooper());
	private static final String b = ((Class) (com/google/android/gms/ads/g)).getName();
	private static final String c = ((Class) (com/google/android/gms/ads/j)).getName();
	private static final String d = ((Class) (com/google/android/gms/ads/a/d)).getName();
	private static final String e = ((Class) (com/google/android/gms/ads/a/e)).getName();
	private static final String f = ((Class) (com/google/android/gms/ads/c/b)).getName();
	private static final String g = ((Class) (com/google/android/gms/ads/b)).getName();

	static 
	{
	//    0    0:new             #18  <Class Handler>
	//    1    3:dup             
	//    2    4:invokestatic    #24  <Method Looper Looper.getMainLooper()>
	//    3    7:invokespecial   #28  <Method void Handler(Looper)>
	//    4   10:putstatic       #30  <Field Handler a>
	//    5   13:ldc1            #32  <Class g>
	//    6   15:invokevirtual   #38  <Method String Class.getName()>
	//    7   18:putstatic       #40  <Field String b>
	//    8   21:ldc1            #42  <Class j>
	//    9   23:invokevirtual   #38  <Method String Class.getName()>
	//   10   26:putstatic       #44  <Field String c>
	//   11   29:ldc1            #46  <Class d>
	//   12   31:invokevirtual   #38  <Method String Class.getName()>
	//   13   34:putstatic       #48  <Field String d>
	//   14   37:ldc1            #50  <Class e>
	//   15   39:invokevirtual   #38  <Method String Class.getName()>
	//   16   42:putstatic       #52  <Field String e>
	//   17   45:ldc1            #54  <Class b>
	//   18   47:invokevirtual   #38  <Method String Class.getName()>
	//   19   50:putstatic       #56  <Field String f>
	//   20   53:ldc1            #58  <Class com.google.android.gms.ads.b>
	//   21   55:invokevirtual   #38  <Method String Class.getName()>
	//   22   58:putstatic       #60  <Field String g>
	//*  23   61:return          
	}
}
