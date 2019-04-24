// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.os.*;
import android.util.Log;
import com.huawei.feedback.bean.MetadataBundle;
import java.lang.reflect.Field;
import java.util.*;

// Referenced classes of package o:
//			dih, dhu, dhv, dio, 
//			dhw

public class dho
{
	static class b
	{

		public void a(int j)
		{
			b = j;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #16  <Field int b>
		//    3    5:return          
		}

		boolean a(int j, String s)
		{
			if(j < b)
		//*   0    0:iload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #16  <Field int b>
		//*   3    5:icmpge          10
				return false;
		//    4    8:iconst_0        
		//    5    9:ireturn         
			if(c)
		//*   6   10:aload_0         
		//*   7   11:getfield        #18  <Field boolean c>
		//*   8   14:ifeq            22
				return dhu.h(s);
		//    9   17:aload_2         
		//   10   18:invokestatic    #30  <Method boolean dhu.h(String)>
		//   11   21:ireturn         
			else
				return true;
		//   12   22:iconst_1        
		//   13   23:ireturn         
		}

		public void c()
		{
			c = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #18  <Field boolean c>
		//    3    5:return          
		}

		public void e()
		{
			c = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #18  <Field boolean c>
		//    3    5:return          
		}

		private int b;
		private boolean c;

		private b()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
			b = 2;
		//    2    4:aload_0         
		//    3    5:iconst_2        
		//    4    6:putfield        #16  <Field int b>
			c = true;
		//    5    9:aload_0         
		//    6   10:iconst_1        
		//    7   11:putfield        #18  <Field boolean c>
		//    8   14:return          
		}

	}


	public dho()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method void Object()>
	//    2    4:return          
	}

	public static void a()
	{
		Object obj = f;
	//    0    0:getstatic       #73  <Field Object f>
	//    1    3:astore_0        
		obj;
	//    2    4:aload_0         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		a.e();
	//    4    6:getstatic       #56  <Field dih a>
	//    5    9:invokevirtual   #76  <Method void dih.e()>
		a("LogUtil", new Object[] {
			"blockForAnalyze"
		});
	//    6   12:ldc1            #58  <String "LogUtil">
	//    7   14:iconst_1        
	//    8   15:anewarray       Object[]
	//    9   18:dup             
	//   10   19:iconst_0        
	//   11   20:ldc1            #78  <String "blockForAnalyze">
	//   12   22:aastore         
	//   13   23:invokestatic    #81  <Method void a(String, Object[])>
		a.d(false);
	//   14   26:getstatic       #56  <Field dih a>
	//   15   29:iconst_0        
	//   16   30:invokevirtual   #84  <Method void dih.d(boolean)>
		(new Handler(Looper.getMainLooper())).postDelayed(new Runnable() {

			public void run()
			{
				dho.e();
			//    0    0:invokestatic    #19  <Method void dho.e()>
			//    1    3:return          
			}

		}
, 0x493e0L);
	//   17   33:new             #86  <Class Handler>
	//   18   36:dup             
	//   19   37:invokestatic    #92  <Method Looper Looper.getMainLooper()>
	//   20   40:invokespecial   #95  <Method void Handler(Looper)>
	//   21   43:new             #8   <Class dho$4>
	//   22   46:dup             
	//   23   47:invokespecial   #96  <Method void dho$4()>
	//   24   50:ldc2w           #97  <Long 0x493e0L>
	//   25   53:invokevirtual   #102 <Method boolean Handler.postDelayed(Runnable, long)>
	//   26   56:pop             
		obj;
	//   27   57:aload_0         
		JVM INSTR monitorexit ;
	//   28   58:monitorexit     
		return;
	//   29   59:return          
		Exception exception;
		exception;
	//   30   60:astore_1        
	//*  31   61:aload_0         
		throw exception;
	//   32   62:monitorexit     
	//   33   63:aload_1         
	//   34   64:athrow          
	}

	public static void a(Context context, String s)
	{
		Object obj;
		try
		{
			i = context;
	//    0    0:aload_0         
	//    1    1:putstatic       #70  <Field Context i>
			obj = ((Object) (a));
	//    2    4:getstatic       #56  <Field dih a>
	//    3    7:astore_2        
		}
	//*   4    8:aload_2         
	//*   5    9:ifnonnull       13
	//*   6   12:return          
	//*   7   13:new             #40  <Class StringBuilder>
	//*   8   16:dup             
	//*   9   17:invokespecial   #42  <Method void StringBuilder()>
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//*  12   24:ldc1            #111 <String ".BuildConfig">
	//*  13   26:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//*  14   29:invokevirtual   #52  <Method String StringBuilder.toString()>
	//*  15   32:invokestatic    #117 <Method Class Class.forName(String)>
	//*  16   35:astore_2        
	//*  17   36:aload_2         
	//*  18   37:ldc1            #119 <String "VERSION_CODE">
	//*  19   39:invokevirtual   #123 <Method Field Class.getField(String)>
	//*  20   42:aconst_null     
	//*  21   43:invokevirtual   #129 <Method Object Field.get(Object)>
	//*  22   46:checkcast       #131 <Class Integer>
	//*  23   49:invokevirtual   #135 <Method int Integer.intValue()>
	//*  24   52:invokestatic    #138 <Method String Integer.toString(int)>
	//*  25   55:putstatic       #28  <Field String d>
	//*  26   58:aload_2         
	//*  27   59:ldc1            #140 <String "APPLICATION_ID">
	//*  28   61:invokevirtual   #123 <Method Field Class.getField(String)>
	//*  29   64:aconst_null     
	//*  30   65:invokevirtual   #129 <Method Object Field.get(Object)>
	//*  31   68:checkcast       #142 <Class String>
	//*  32   71:putstatic       #32  <Field String b>
	//*  33   74:new             #40  <Class StringBuilder>
	//*  34   77:dup             
	//*  35   78:invokespecial   #42  <Method void StringBuilder()>
	//*  36   81:getstatic       #28  <Field String d>
	//*  37   84:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//*  38   87:ldc1            #48  <String "|">
	//*  39   89:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//*  40   92:invokevirtual   #52  <Method String StringBuilder.toString()>
	//*  41   95:putstatic       #54  <Field String c>
	//*  42   98:aload_2         
	//*  43   99:ldc1            #144 <String "BUILD_TYPE">
	//*  44  101:invokevirtual   #123 <Method Field Class.getField(String)>
	//*  45  104:aconst_null     
	//*  46  105:invokevirtual   #129 <Method Object Field.get(Object)>
	//*  47  108:checkcast       #142 <Class String>
	//*  48  111:astore_2        
	//*  49  112:aload_0         
	//*  50  113:invokestatic    #149 <Method void dhu.e(Context)>
	//*  51  116:aload_2         
	//*  52  117:invokestatic    #152 <Method void dhu.e(String)>
	//*  53  120:invokestatic    #155 <Method boolean dhu.d()>
	//*  54  123:ifeq            138
	//*  55  126:getstatic       #38  <Field dho$b e>
	//*  56  129:invokevirtual   #157 <Method void dho$b.c()>
	//*  57  132:invokestatic    #160 <Method void dhu.s()>
	//*  58  135:goto            147
	//*  59  138:getstatic       #38  <Field dho$b e>
	//*  60  141:invokevirtual   #161 <Method void dho$b.e()>
	//*  61  144:invokestatic    #164 <Method void dhu.u()>
	//*  62  147:invokestatic    #155 <Method boolean dhu.d()>
	//*  63  150:ifne            159
	//*  64  153:invokestatic    #166 <Method boolean dhu.e()>
	//*  65  156:ifeq            169
	//*  66  159:getstatic       #38  <Field dho$b e>
	//*  67  162:iconst_2        
	//*  68  163:invokevirtual   #169 <Method void dho$b.a(int)>
	//*  69  166:goto            176
	//*  70  169:getstatic       #38  <Field dho$b e>
	//*  71  172:iconst_0        
	//*  72  173:invokevirtual   #169 <Method void dho$b.a(int)>
	//*  73  176:new             #6   <Class dho$3>
	//*  74  179:dup             
	//*  75  180:invokespecial   #170 <Method void dho$3()>
	//*  76  183:invokestatic    #173 <Method void dhu.e(dhu$b)>
	//*  77  186:iconst_1        
	//*  78  187:iconst_1        
	//*  79  188:iconst_2        
	//*  80  189:iconst_0        
	//*  81  190:ldc1            #58  <String "LogUtil">
	//*  82  192:iconst_4        
	//*  83  193:anewarray       Object[]
	//*  84  196:dup             
	//*  85  197:iconst_0        
	//*  86  198:ldc1            #175 <String "APP_VERSION:">
	//*  87  200:aastore         
	//*  88  201:dup             
	//*  89  202:iconst_1        
	//*  90  203:getstatic       #28  <Field String d>
	//*  91  206:aastore         
	//*  92  207:dup             
	//*  93  208:iconst_2        
	//*  94  209:ldc1            #177 <String " BUILD_TYPE:">
	//*  95  211:aastore         
	//*  96  212:dup             
	//*  97  213:iconst_3        
	//*  98  214:ldc1            #179 <String "release">
	//*  99  216:aastore         
	//* 100  217:invokestatic    #182 <Method void e(boolean, boolean, int, boolean, String, Object[])>
	//* 101  220:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 102  221:astore_0        
		{
			e(true, false, 4, false, "LogUtil", new Object[] {
				"class not found :", s, ".BuildConfig"
			});
	//  103  222:iconst_1        
	//  104  223:iconst_0        
	//  105  224:iconst_4        
	//  106  225:iconst_0        
	//  107  226:ldc1            #58  <String "LogUtil">
	//  108  228:iconst_3        
	//  109  229:anewarray       Object[]
	//  110  232:dup             
	//  111  233:iconst_0        
	//  112  234:ldc1            #184 <String "class not found :">
	//  113  236:aastore         
	//  114  237:dup             
	//  115  238:iconst_1        
	//  116  239:aload_1         
	//  117  240:aastore         
	//  118  241:dup             
	//  119  242:iconst_2        
	//  120  243:ldc1            #111 <String ".BuildConfig">
	//  121  245:aastore         
	//  122  246:invokestatic    #182 <Method void e(boolean, boolean, int, boolean, String, Object[])>
			return;
	//  123  249:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 124  250:astore_0        
		{
			e(true, false, 4, false, "LogUtil", new Object[] {
				"NoSuchFieldException :", s, ".BuildConfig"
			});
	//  125  251:iconst_1        
	//  126  252:iconst_0        
	//  127  253:iconst_4        
	//  128  254:iconst_0        
	//  129  255:ldc1            #58  <String "LogUtil">
	//  130  257:iconst_3        
	//  131  258:anewarray       Object[]
	//  132  261:dup             
	//  133  262:iconst_0        
	//  134  263:ldc1            #186 <String "NoSuchFieldException :">
	//  135  265:aastore         
	//  136  266:dup             
	//  137  267:iconst_1        
	//  138  268:aload_1         
	//  139  269:aastore         
	//  140  270:dup             
	//  141  271:iconst_2        
	//  142  272:ldc1            #111 <String ".BuildConfig">
	//  143  274:aastore         
	//  144  275:invokestatic    #182 <Method void e(boolean, boolean, int, boolean, String, Object[])>
			return;
	//  145  278:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 146  279:astore_0        
		{
			e(true, false, 4, false, "LogUtil", new Object[] {
				"IllegalAccessException :", s, ".BuildConfig"
			});
	//  147  280:iconst_1        
	//  148  281:iconst_0        
	//  149  282:iconst_4        
	//  150  283:iconst_0        
	//  151  284:ldc1            #58  <String "LogUtil">
	//  152  286:iconst_3        
	//  153  287:anewarray       Object[]
	//  154  290:dup             
	//  155  291:iconst_0        
	//  156  292:ldc1            #188 <String "IllegalAccessException :">
	//  157  294:aastore         
	//  158  295:dup             
	//  159  296:iconst_1        
	//  160  297:aload_1         
	//  161  298:aastore         
	//  162  299:dup             
	//  163  300:iconst_2        
	//  164  301:ldc1            #111 <String ".BuildConfig">
	//  165  303:aastore         
	//  166  304:invokestatic    #182 <Method void e(boolean, boolean, int, boolean, String, Object[])>
			return;
	//  167  307:return          
		}
		if(obj == null)
			return;
		obj = ((Object) (Class.forName((new StringBuilder()).append(s).append(".BuildConfig").toString())));
		d = Integer.toString(((Integer)((Class) (obj)).getField("VERSION_CODE").get(((Object) (null)))).intValue());
		b = (String)((Class) (obj)).getField("APPLICATION_ID").get(((Object) (null)));
		c = (new StringBuilder()).append(d).append("|").toString();
		obj = ((Object) ((String)((Class) (obj)).getField("BUILD_TYPE").get(((Object) (null)))));
		dhu.e(context);
		dhu.e(((String) (obj)));
		if(dhu.d())
		{
			e.c();
			dhu.s();
			break MISSING_BLOCK_LABEL_147;
		}
		e.e();
		dhu.u();
		if(dhu.d() || dhu.e())
		{
			e.a(2);
			break MISSING_BLOCK_LABEL_176;
		}
		e.a(0);
		dhu.e(new dhu.b() {

			public void e()
			{
				dho.d();
			//    0    0:invokestatic    #20  <Method void dho.d()>
			//    1    3:return          
			}

		}
);
		e(true, true, 2, false, "LogUtil", new Object[] {
			"APP_VERSION:", d, " BUILD_TYPE:", "release"
		});
		return;
	}

	public static transient void a(String s, int j, String s1, Object aobj[])
	{
		if(1 != j)
	//*   0    0:iconst_1        
	//*   1    1:iload_1         
	//*   2    2:icmpeq          6
		{
			return;
	//    3    5:return          
		} else
		{
			s1 = ((String) (new dhv(b, d, s1)));
	//    4    6:new             #191 <Class dhv>
	//    5    9:dup             
	//    6   10:getstatic       #32  <Field String b>
	//    7   13:getstatic       #28  <Field String d>
	//    8   16:aload_2         
	//    9   17:invokespecial   #194 <Method void dhv(String, String, String)>
	//   10   20:astore_2        
			((dhv) (s1)).a("M", Arrays.toString(aobj));
	//   11   21:aload_2         
	//   12   22:ldc1            #196 <String "M">
	//   13   24:aload_3         
	//   14   25:invokestatic    #201 <Method String Arrays.toString(Object[])>
	//   15   28:invokevirtual   #204 <Method void dhv.a(String, String)>
			e(true, true, 1, true, "HWWEAR", new Object[] {
				s, ", cont:", ((dhv) (s1)).toString()
			});
	//   16   31:iconst_1        
	//   17   32:iconst_1        
	//   18   33:iconst_1        
	//   19   34:iconst_1        
	//   20   35:ldc1            #206 <String "HWWEAR">
	//   21   37:iconst_3        
	//   22   38:anewarray       Object[]
	//   23   41:dup             
	//   24   42:iconst_0        
	//   25   43:aload_0         
	//   26   44:aastore         
	//   27   45:dup             
	//   28   46:iconst_1        
	//   29   47:ldc1            #208 <String ", cont:">
	//   30   49:aastore         
	//   31   50:dup             
	//   32   51:iconst_2        
	//   33   52:aload_2         
	//   34   53:invokevirtual   #209 <Method String dhv.toString()>
	//   35   56:aastore         
	//   36   57:invokestatic    #182 <Method void e(boolean, boolean, int, boolean, String, Object[])>
			return;
	//   37   60:return          
		}
	}

	public static transient void a(String s, Object aobj[])
	{
		e(true, true, 2, true, s, aobj);
	//    0    0:iconst_1        
	//    1    1:iconst_1        
	//    2    2:iconst_2        
	//    3    3:iconst_1        
	//    4    4:aload_0         
	//    5    5:aload_1         
	//    6    6:invokestatic    #182 <Method void e(boolean, boolean, int, boolean, String, Object[])>
	//    7    9:return          
	}

	public static transient void b(String s, String s1, int j, String s2, Object aobj[])
	{
		if(1 != j)
	//*   0    0:iconst_1        
	//*   1    1:iload_2         
	//*   2    2:icmpeq          6
		{
			return;
	//    3    5:return          
		} else
		{
			s2 = ((String) (new dhv(b, d, s2)));
	//    4    6:new             #191 <Class dhv>
	//    5    9:dup             
	//    6   10:getstatic       #32  <Field String b>
	//    7   13:getstatic       #28  <Field String d>
	//    8   16:aload_3         
	//    9   17:invokespecial   #194 <Method void dhv(String, String, String)>
	//   10   20:astore_3        
			((dhv) (s2)).a("M", Arrays.toString(aobj));
	//   11   21:aload_3         
	//   12   22:ldc1            #196 <String "M">
	//   13   24:aload           4
	//   14   26:invokestatic    #201 <Method String Arrays.toString(Object[])>
	//   15   29:invokevirtual   #204 <Method void dhv.a(String, String)>
			e(true, true, 4, true, "HWWEAR", new Object[] {
				s1, ", ExecptEvtID:", s, ", cont:", ((dhv) (s2)).toString()
			});
	//   16   32:iconst_1        
	//   17   33:iconst_1        
	//   18   34:iconst_4        
	//   19   35:iconst_1        
	//   20   36:ldc1            #206 <String "HWWEAR">
	//   21   38:iconst_5        
	//   22   39:anewarray       Object[]
	//   23   42:dup             
	//   24   43:iconst_0        
	//   25   44:aload_1         
	//   26   45:aastore         
	//   27   46:dup             
	//   28   47:iconst_1        
	//   29   48:ldc1            #212 <String ", ExecptEvtID:">
	//   30   50:aastore         
	//   31   51:dup             
	//   32   52:iconst_2        
	//   33   53:aload_0         
	//   34   54:aastore         
	//   35   55:dup             
	//   36   56:iconst_3        
	//   37   57:ldc1            #208 <String ", cont:">
	//   38   59:aastore         
	//   39   60:dup             
	//   40   61:iconst_4        
	//   41   62:aload_3         
	//   42   63:invokevirtual   #209 <Method String dhv.toString()>
	//   43   66:aastore         
	//   44   67:invokestatic    #182 <Method void e(boolean, boolean, int, boolean, String, Object[])>
			return;
	//   45   70:return          
		}
	}

	public static transient void b(String s, Object aobj[])
	{
		e(true, true, 2, false, s, aobj);
	//    0    0:iconst_1        
	//    1    1:iconst_1        
	//    2    2:iconst_2        
	//    3    3:iconst_0        
	//    4    4:aload_0         
	//    5    5:aload_1         
	//    6    6:invokestatic    #182 <Method void e(boolean, boolean, int, boolean, String, Object[])>
	//    7    9:return          
	}

	public static boolean b()
	{
		return dhu.d();
	//    0    0:invokestatic    #155 <Method boolean dhu.d()>
	//    1    3:ireturn         
	}

	public static transient void c(String s, int j, String s1, Object aobj[])
	{
		if(1 != j)
	//*   0    0:iconst_1        
	//*   1    1:iload_1         
	//*   2    2:icmpeq          6
		{
			return;
	//    3    5:return          
		} else
		{
			s1 = ((String) (new dhv(b, d, s1)));
	//    4    6:new             #191 <Class dhv>
	//    5    9:dup             
	//    6   10:getstatic       #32  <Field String b>
	//    7   13:getstatic       #28  <Field String d>
	//    8   16:aload_2         
	//    9   17:invokespecial   #194 <Method void dhv(String, String, String)>
	//   10   20:astore_2        
			((dhv) (s1)).a("M", Arrays.toString(aobj));
	//   11   21:aload_2         
	//   12   22:ldc1            #196 <String "M">
	//   13   24:aload_3         
	//   14   25:invokestatic    #201 <Method String Arrays.toString(Object[])>
	//   15   28:invokevirtual   #204 <Method void dhv.a(String, String)>
			e(true, true, 2, false, "HWWEAR", new Object[] {
				s, ", cont:", ((dhv) (s1)).toString()
			});
	//   16   31:iconst_1        
	//   17   32:iconst_1        
	//   18   33:iconst_2        
	//   19   34:iconst_0        
	//   20   35:ldc1            #206 <String "HWWEAR">
	//   21   37:iconst_3        
	//   22   38:anewarray       Object[]
	//   23   41:dup             
	//   24   42:iconst_0        
	//   25   43:aload_0         
	//   26   44:aastore         
	//   27   45:dup             
	//   28   46:iconst_1        
	//   29   47:ldc1            #208 <String ", cont:">
	//   30   49:aastore         
	//   31   50:dup             
	//   32   51:iconst_2        
	//   33   52:aload_2         
	//   34   53:invokevirtual   #209 <Method String dhv.toString()>
	//   35   56:aastore         
	//   36   57:invokestatic    #182 <Method void e(boolean, boolean, int, boolean, String, Object[])>
			return;
	//   37   60:return          
		}
	}

	public static transient void c(String s, Object aobj[])
	{
		e(true, true, 0, false, s, aobj);
	//    0    0:iconst_1        
	//    1    1:iconst_1        
	//    2    2:iconst_0        
	//    3    3:iconst_0        
	//    4    4:aload_0         
	//    5    5:aload_1         
	//    6    6:invokestatic    #182 <Method void e(boolean, boolean, int, boolean, String, Object[])>
	//    7    9:return          
	}

	public static void d()
	{
		a.d();
	//    0    0:getstatic       #56  <Field dih a>
	//    1    3:invokevirtual   #214 <Method void dih.d()>
		Log.i("LogUtil", (new StringBuilder()).append("clearLogCache start in process:").append(dio.d()).append(" pid:").append(Process.myPid()).toString());
	//    2    6:ldc1            #58  <String "LogUtil">
	//    3    8:new             #40  <Class StringBuilder>
	//    4   11:dup             
	//    5   12:invokespecial   #42  <Method void StringBuilder()>
	//    6   15:ldc1            #216 <String "clearLogCache start in process:">
	//    7   17:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//    8   20:invokestatic    #220 <Method String dio.d()>
	//    9   23:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   10   26:ldc1            #222 <String " pid:">
	//   11   28:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   12   31:invokestatic    #227 <Method int Process.myPid()>
	//   13   34:invokevirtual   #230 <Method StringBuilder StringBuilder.append(int)>
	//   14   37:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   15   40:invokestatic    #232 <Method int Log.i(String, String)>
	//   16   43:pop             
		dhw.c c1 = dhw.d();
	//   17   44:invokestatic    #237 <Method dhw$c dhw.d()>
	//   18   47:astore_0        
		if(c1 == null)
	//*  19   48:aload_0         
	//*  20   49:ifnonnull       61
		{
			Log.w("LogUtil", "clearLogCache,writeLock null,return");
	//   21   52:ldc1            #58  <String "LogUtil">
	//   22   54:ldc1            #239 <String "clearLogCache,writeLock null,return">
	//   23   56:invokestatic    #242 <Method int Log.w(String, String)>
	//   24   59:pop             
			return;
	//   25   60:return          
		} else
		{
			c1.d();
	//   26   61:aload_0         
	//   27   62:invokevirtual   #245 <Method void dhw$c.d()>
			c1.a();
	//   28   65:aload_0         
	//   29   66:invokevirtual   #247 <Method void dhw$c.a()>
			Log.i("LogUtil", (new StringBuilder()).append("clearLogCache end in process:").append(dio.d()).append(" pid:").append(Process.myPid()).toString());
	//   30   69:ldc1            #58  <String "LogUtil">
	//   31   71:new             #40  <Class StringBuilder>
	//   32   74:dup             
	//   33   75:invokespecial   #42  <Method void StringBuilder()>
	//   34   78:ldc1            #249 <String "clearLogCache end in process:">
	//   35   80:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   36   83:invokestatic    #220 <Method String dio.d()>
	//   37   86:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   38   89:ldc1            #222 <String " pid:">
	//   39   91:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   40   94:invokestatic    #227 <Method int Process.myPid()>
	//   41   97:invokevirtual   #230 <Method StringBuilder StringBuilder.append(int)>
	//   42  100:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   43  103:invokestatic    #232 <Method int Log.i(String, String)>
	//   44  106:pop             
			return;
	//   45  107:return          
		}
	}

	public static transient void d(String s, Object aobj[])
	{
		e(true, true, 1, false, s, aobj);
	//    0    0:iconst_1        
	//    1    1:iconst_1        
	//    2    2:iconst_1        
	//    3    3:iconst_0        
	//    4    4:aload_0         
	//    5    5:aload_1         
	//    6    6:invokestatic    #182 <Method void e(boolean, boolean, int, boolean, String, Object[])>
	//    7    9:return          
	}

	public static void e()
	{
		Object obj = f;
	//    0    0:getstatic       #73  <Field Object f>
	//    1    3:astore_0        
		obj;
	//    2    4:aload_0         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		a("LogUtil", new Object[] {
			"unBlockForAnalyze"
		});
	//    4    6:ldc1            #58  <String "LogUtil">
	//    5    8:iconst_1        
	//    6    9:anewarray       Object[]
	//    7   12:dup             
	//    8   13:iconst_0        
	//    9   14:ldc1            #251 <String "unBlockForAnalyze">
	//   10   16:aastore         
	//   11   17:invokestatic    #81  <Method void a(String, Object[])>
		a.d(true);
	//   12   20:getstatic       #56  <Field dih a>
	//   13   23:iconst_1        
	//   14   24:invokevirtual   #84  <Method void dih.d(boolean)>
		obj;
	//   15   27:aload_0         
		JVM INSTR monitorexit ;
	//   16   28:monitorexit     
		return;
	//   17   29:return          
		Exception exception;
		exception;
	//   18   30:astore_1        
	//*  19   31:aload_0         
		throw exception;
	//   20   32:monitorexit     
	//   21   33:aload_1         
	//   22   34:athrow          
	}

	public static transient void e(int j, String s, Bundle bundle, boolean flag, Object aobj[])
	{
		f(s, aobj);
	//    0    0:aload_1         
	//    1    1:aload           4
	//    2    3:invokestatic    #254 <Method void f(String, Object[])>
		s = ((String) (new MetadataBundle(j, b, d)));
	//    3    6:new             #256 <Class MetadataBundle>
	//    4    9:dup             
	//    5   10:iload_0         
	//    6   11:getstatic       #32  <Field String b>
	//    7   14:getstatic       #28  <Field String d>
	//    8   17:invokespecial   #259 <Method void MetadataBundle(int, String, String)>
	//    9   20:astore_1        
		String s1;
		for(aobj = ((Object []) (bundle.keySet().iterator())); ((Iterator) (aobj)).hasNext(); ((MetadataBundle) (s)).putData(s1, bundle.get(s1).toString()))
	//*  10   21:aload_2         
	//*  11   22:invokevirtual   #265 <Method Set Bundle.keySet()>
	//*  12   25:invokeinterface #271 <Method Iterator Set.iterator()>
	//*  13   30:astore          4
	//*  14   32:aload           4
	//*  15   34:invokeinterface #276 <Method boolean Iterator.hasNext()>
	//*  16   39:ifeq            72
			s1 = (String)((Iterator) (aobj)).next();
	//   17   42:aload           4
	//   18   44:invokeinterface #280 <Method Object Iterator.next()>
	//   19   49:checkcast       #142 <Class String>
	//   20   52:astore          5

	//   21   54:aload_1         
	//   22   55:aload           5
	//   23   57:aload_2         
	//   24   58:aload           5
	//   25   60:invokevirtual   #283 <Method Object Bundle.get(String)>
	//   26   63:invokevirtual   #284 <Method String Object.toString()>
	//   27   66:invokevirtual   #287 <Method void MetadataBundle.putData(String, String)>
	//*  28   69:goto            32
		s = ((MetadataBundle) (s)).toString();
	//   29   72:aload_1         
	//   30   73:invokevirtual   #288 <Method String MetadataBundle.toString()>
	//   31   76:astore_1        
		bundle = new Bundle();
	//   32   77:new             #261 <Class Bundle>
	//   33   80:dup             
	//   34   81:invokespecial   #289 <Method void Bundle()>
	//   35   84:astore_2        
		bundle.putString("MetaData", s);
	//   36   85:aload_2         
	//   37   86:ldc2            #291 <String "MetaData">
	//   38   89:aload_1         
	//   39   90:invokevirtual   #294 <Method void Bundle.putString(String, String)>
		if(flag)
	//*  40   93:iload_3         
	//*  41   94:ifeq            110
			bundle.putString("logwritePath", dhu.f().o());
	//   42   97:aload_2         
	//   43   98:ldc2            #296 <String "logwritePath">
	//   44  101:invokestatic    #299 <Method dhu dhu.f()>
	//   45  104:invokevirtual   #302 <Method String dhu.o()>
	//   46  107:invokevirtual   #294 <Method void Bundle.putString(String, String)>
	//   47  110:return          
	}

	public static transient void e(String s, int j, String s1, Object aobj[])
	{
		if(1 != j)
	//*   0    0:iconst_1        
	//*   1    1:iload_1         
	//*   2    2:icmpeq          6
		{
			return;
	//    3    5:return          
		} else
		{
			s1 = ((String) (new dhv(b, d, s1)));
	//    4    6:new             #191 <Class dhv>
	//    5    9:dup             
	//    6   10:getstatic       #32  <Field String b>
	//    7   13:getstatic       #28  <Field String d>
	//    8   16:aload_2         
	//    9   17:invokespecial   #194 <Method void dhv(String, String, String)>
	//   10   20:astore_2        
			((dhv) (s1)).a("M", Arrays.toString(aobj));
	//   11   21:aload_2         
	//   12   22:ldc1            #196 <String "M">
	//   13   24:aload_3         
	//   14   25:invokestatic    #201 <Method String Arrays.toString(Object[])>
	//   15   28:invokevirtual   #204 <Method void dhv.a(String, String)>
			e(true, true, 3, true, "HWWEAR", new Object[] {
				s, ", cont:", ((dhv) (s1)).toString()
			});
	//   16   31:iconst_1        
	//   17   32:iconst_1        
	//   18   33:iconst_3        
	//   19   34:iconst_1        
	//   20   35:ldc1            #206 <String "HWWEAR">
	//   21   37:iconst_3        
	//   22   38:anewarray       Object[]
	//   23   41:dup             
	//   24   42:iconst_0        
	//   25   43:aload_0         
	//   26   44:aastore         
	//   27   45:dup             
	//   28   46:iconst_1        
	//   29   47:ldc1            #208 <String ", cont:">
	//   30   49:aastore         
	//   31   50:dup             
	//   32   51:iconst_2        
	//   33   52:aload_2         
	//   34   53:invokevirtual   #209 <Method String dhv.toString()>
	//   35   56:aastore         
	//   36   57:invokestatic    #182 <Method void e(boolean, boolean, int, boolean, String, Object[])>
			return;
	//   37   60:return          
		}
	}

	public static transient void e(String s, Object aobj[])
	{
		e(true, true, 3, false, s, aobj);
	//    0    0:iconst_1        
	//    1    1:iconst_1        
	//    2    2:iconst_3        
	//    3    3:iconst_0        
	//    4    4:aload_0         
	//    5    5:aload_1         
	//    6    6:invokestatic    #182 <Method void e(boolean, boolean, int, boolean, String, Object[])>
	//    7    9:return          
	}

	private static transient void e(boolean flag, boolean flag1, int j, boolean flag2, String s, Object aobj[])
	{
		if(!flag)
	//*   0    0:iload_0         
	//*   1    1:ifne            5
			return;
	//    2    4:return          
		if(flag1 && !flag2 && !e.a(j, s))
	//*   3    5:iload_1         
	//*   4    6:ifeq            26
	//*   5    9:iload_3         
	//*   6   10:ifne            26
	//*   7   13:getstatic       #38  <Field dho$b e>
	//*   8   16:iload_2         
	//*   9   17:aload           4
	//*  10   19:invokevirtual   #305 <Method boolean dho$b.a(int, String)>
	//*  11   22:ifne            26
		{
			return;
	//   12   25:return          
		} else
		{
			a.d(j, s, c, aobj, flag2);
	//   13   26:getstatic       #56  <Field dih a>
	//   14   29:iload_2         
	//   15   30:aload           4
	//   16   32:getstatic       #54  <Field String c>
	//   17   35:aload           5
	//   18   37:iload_3         
	//   19   38:invokevirtual   #308 <Method void dih.d(int, String, String, Object[], boolean)>
			return;
	//   20   41:return          
		}
	}

	public static transient void f(String s, Object aobj[])
	{
		e(true, true, 4, false, s, aobj);
	//    0    0:iconst_1        
	//    1    1:iconst_1        
	//    2    2:iconst_4        
	//    3    3:iconst_0        
	//    4    4:aload_0         
	//    5    5:aload_1         
	//    6    6:invokestatic    #182 <Method void e(boolean, boolean, int, boolean, String, Object[])>
	//    7    9:return          
	}

	private static dih a = null;
	private static String b = "UNSETTED_ID";
	private static String c;
	private static String d;
	private static b e = new b();
	private static final Object f = new Object();
	private static Context i = null;

	static 
	{
		d = "UNSETTED";
	//    0    0:ldc1            #26  <String "UNSETTED">
	//    1    2:putstatic       #28  <Field String d>
	//    2    5:ldc1            #30  <String "UNSETTED_ID">
	//    3    7:putstatic       #32  <Field String b>
	//    4   10:new             #10  <Class dho$b>
	//    5   13:dup             
	//    6   14:aconst_null     
	//    7   15:invokespecial   #36  <Method void dho$b(dho$3)>
	//    8   18:putstatic       #38  <Field dho$b e>
		c = (new StringBuilder()).append(d).append("|").toString();
	//    9   21:new             #40  <Class StringBuilder>
	//   10   24:dup             
	//   11   25:invokespecial   #42  <Method void StringBuilder()>
	//   12   28:getstatic       #28  <Field String d>
	//   13   31:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   14   34:ldc1            #48  <String "|">
	//   15   36:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   16   39:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   17   42:putstatic       #54  <Field String c>
	//   18   45:aconst_null     
	//   19   46:putstatic       #56  <Field dih a>
		Log.d("LogUtil", "LOGPRE_TIME_FORMAT yyyyMMdd-HH:mm:ss:SSS|");
	//   20   49:ldc1            #58  <String "LogUtil">
	//   21   51:ldc1            #60  <String "LOGPRE_TIME_FORMAT yyyyMMdd-HH:mm:ss:SSS|">
	//   22   53:invokestatic    #65  <Method int Log.d(String, String)>
	//   23   56:pop             
		a = new dih();
	//   24   57:new             #67  <Class dih>
	//   25   60:dup             
	//   26   61:invokespecial   #68  <Method void dih()>
	//   27   64:putstatic       #56  <Field dih a>
	//   28   67:aconst_null     
	//   29   68:putstatic       #70  <Field Context i>
	//   30   71:new             #4   <Class Object>
	//   31   74:dup             
	//   32   75:invokespecial   #71  <Method void Object()>
	//   33   78:putstatic       #73  <Field Object f>
	//*  34   81:return          
	}
}
