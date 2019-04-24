// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package o:
//			dbq, dho

public class dbp
{

	public dbp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public static boolean b()
	{
		if(!d)
	//*   0    0:getstatic       #11  <Field boolean d>
	//*   1    3:ifne            34
		{
			d = true;
	//    2    6:iconst_1        
	//    3    7:putstatic       #11  <Field boolean d>
			if("0".equals(((Object) (c()))))
	//*   4   10:ldc1            #21  <String "0">
	//*   5   12:invokestatic    #25  <Method String c()>
	//*   6   15:invokevirtual   #31  <Method boolean String.equals(Object)>
	//*   7   18:ifeq            28
				a = true;
	//    8   21:iconst_1        
	//    9   22:putstatic       #13  <Field boolean a>
			else
	//*  10   25:goto            34
				a = dbq.b();
	//   11   28:invokestatic    #35  <Method boolean dbq.b()>
	//   12   31:putstatic       #13  <Field boolean a>
		}
		return a;
	//   13   34:getstatic       #13  <Field boolean a>
	//   14   37:ireturn         
	}

	public static String c()
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		Object obj1 = null;
	//    2    3:aconst_null     
	//    3    4:astore          7
		Object obj2 = null;
	//    4    6:aconst_null     
	//    5    7:astore          8
		Object obj3 = null;
	//    6    9:aconst_null     
	//    7   10:astore          9
		String s = null;
	//    8   12:aconst_null     
	//    9   13:astore_0        
		String s1 = s;
	//   10   14:aload_0         
	//   11   15:astore_1        
		String s2 = ((String) (obj));
	//   12   16:aload           6
	//   13   18:astore_2        
		String s3 = ((String) (obj1));
	//   14   19:aload           7
	//   15   21:astore_3        
		String s4 = ((String) (obj2));
	//   16   22:aload           8
	//   17   24:astore          4
		String s5 = ((String) (obj3));
	//   18   26:aload           9
	//   19   28:astore          5
		Class class1;
		try
		{
			class1 = Class.forName("android.os.SystemProperties");
	//   20   30:ldc1            #47  <String "android.os.SystemProperties">
	//   21   32:invokestatic    #53  <Method Class Class.forName(String)>
	//   22   35:astore          10
		}
	//*  23   37:aload_0         
	//*  24   38:astore_1        
	//*  25   39:aload           6
	//*  26   41:astore_2        
	//*  27   42:aload           7
	//*  28   44:astore_3        
	//*  29   45:aload           8
	//*  30   47:astore          4
	//*  31   49:aload           9
	//*  32   51:astore          5
	//*  33   53:aload           10
	//*  34   55:ldc1            #55  <String "get">
	//*  35   57:iconst_1        
	//*  36   58:anewarray       Class[]
	//*  37   61:dup             
	//*  38   62:iconst_0        
	//*  39   63:ldc1            #27  <Class String>
	//*  40   65:aastore         
	//*  41   66:invokevirtual   #59  <Method Method Class.getDeclaredMethod(String, Class[])>
	//*  42   69:aload           10
	//*  43   71:iconst_1        
	//*  44   72:anewarray       Object[]
	//*  45   75:dup             
	//*  46   76:iconst_0        
	//*  47   77:ldc1            #61  <String "ro.secure">
	//*  48   79:aastore         
	//*  49   80:invokevirtual   #67  <Method Object Method.invoke(Object, Object[])>
	//*  50   83:checkcast       #27  <Class String>
	//*  51   86:astore_0        
	//*  52   87:aload_0         
	//*  53   88:astore_1        
	//*  54   89:aload_0         
	//*  55   90:astore_2        
	//*  56   91:aload_0         
	//*  57   92:astore_3        
	//*  58   93:aload_0         
	//*  59   94:astore          4
	//*  60   96:aload_0         
	//*  61   97:astore          5
	//*  62   99:new             #69  <Class StringBuilder>
	//*  63  102:dup             
	//*  64  103:invokespecial   #70  <Method void StringBuilder()>
	//*  65  106:ldc1            #72  <String "getRootProperty, Root Property info: ">
	//*  66  108:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//*  67  111:aload_0         
	//*  68  112:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//*  69  115:invokevirtual   #79  <Method String StringBuilder.toString()>
	//*  70  118:iconst_1        
	//*  71  119:anewarray       Object[]
	//*  72  122:dup             
	//*  73  123:iconst_0        
	//*  74  124:iconst_0        
	//*  75  125:invokestatic    #85  <Method Boolean Boolean.valueOf(boolean)>
	//*  76  128:aastore         
	//*  77  129:invokestatic    #90  <Method void dho.b(String, Object[])>
	//*  78  132:aload_0         
	//*  79  133:areturn         
		catch(ClassNotFoundException classnotfoundexception)
	//*  80  134:astore_0        
		{
			dho.f("getProductConfig, ClassNotFoundException.", new Object[] {
				Boolean.valueOf(false)
			});
	//   81  135:ldc1            #92  <String "getProductConfig, ClassNotFoundException.">
	//   82  137:iconst_1        
	//   83  138:anewarray       Object[]
	//   84  141:dup             
	//   85  142:iconst_0        
	//   86  143:iconst_0        
	//   87  144:invokestatic    #85  <Method Boolean Boolean.valueOf(boolean)>
	//   88  147:aastore         
	//   89  148:invokestatic    #95  <Method void dho.f(String, Object[])>
			return s1;
	//   90  151:aload_1         
	//   91  152:areturn         
		}
		catch(NoSuchMethodException nosuchmethodexception)
	//*  92  153:astore_0        
		{
			dho.f("getProductConfig NoSuchMethodException.", new Object[] {
				Boolean.valueOf(false)
			});
	//   93  154:ldc1            #97  <String "getProductConfig NoSuchMethodException.">
	//   94  156:iconst_1        
	//   95  157:anewarray       Object[]
	//   96  160:dup             
	//   97  161:iconst_0        
	//   98  162:iconst_0        
	//   99  163:invokestatic    #85  <Method Boolean Boolean.valueOf(boolean)>
	//  100  166:aastore         
	//  101  167:invokestatic    #95  <Method void dho.f(String, Object[])>
			return s2;
	//  102  170:aload_2         
	//  103  171:areturn         
		}
		catch(IllegalArgumentException illegalargumentexception)
	//* 104  172:astore_0        
		{
			dho.f("getProductConfig IllegalArgumentException.", new Object[] {
				Boolean.valueOf(false)
			});
	//  105  173:ldc1            #99  <String "getProductConfig IllegalArgumentException.">
	//  106  175:iconst_1        
	//  107  176:anewarray       Object[]
	//  108  179:dup             
	//  109  180:iconst_0        
	//  110  181:iconst_0        
	//  111  182:invokestatic    #85  <Method Boolean Boolean.valueOf(boolean)>
	//  112  185:aastore         
	//  113  186:invokestatic    #95  <Method void dho.f(String, Object[])>
			return s3;
	//  114  189:aload_3         
	//  115  190:areturn         
		}
		catch(IllegalAccessException illegalaccessexception)
	//* 116  191:astore_0        
		{
			dho.f("getProductConfig IllegalAccessException.", new Object[] {
				Boolean.valueOf(false)
			});
	//  117  192:ldc1            #101 <String "getProductConfig IllegalAccessException.">
	//  118  194:iconst_1        
	//  119  195:anewarray       Object[]
	//  120  198:dup             
	//  121  199:iconst_0        
	//  122  200:iconst_0        
	//  123  201:invokestatic    #85  <Method Boolean Boolean.valueOf(boolean)>
	//  124  204:aastore         
	//  125  205:invokestatic    #95  <Method void dho.f(String, Object[])>
			return s4;
	//  126  208:aload           4
	//  127  210:areturn         
		}
		catch(InvocationTargetException invocationtargetexception)
	//* 128  211:astore_0        
		{
			dho.f("getProductConfig InvocationTargetException.", new Object[] {
				Boolean.valueOf(false)
			});
	//  129  212:ldc1            #103 <String "getProductConfig InvocationTargetException.">
	//  130  214:iconst_1        
	//  131  215:anewarray       Object[]
	//  132  218:dup             
	//  133  219:iconst_0        
	//  134  220:iconst_0        
	//  135  221:invokestatic    #85  <Method Boolean Boolean.valueOf(boolean)>
	//  136  224:aastore         
	//  137  225:invokestatic    #95  <Method void dho.f(String, Object[])>
			return s5;
	//  138  228:aload           5
	//  139  230:areturn         
		}
		s1 = s;
		s2 = ((String) (obj));
		s3 = ((String) (obj1));
		s4 = ((String) (obj2));
		s5 = ((String) (obj3));
		s = (String)class1.getDeclaredMethod("get", new Class[] {
			java/lang/String
		}).invoke(((Object) (class1)), new Object[] {
			"ro.secure"
		});
		s1 = s;
		s2 = s;
		s3 = s;
		s4 = s;
		s5 = s;
		dho.b((new StringBuilder()).append("getRootProperty, Root Property info: ").append(s).toString(), new Object[] {
			Boolean.valueOf(false)
		});
		return s;
	}

	private static boolean a = false;
	private static boolean d = false;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:putstatic       #11  <Field boolean d>
	//    2    4:iconst_0        
	//    3    5:putstatic       #13  <Field boolean a>
	//*   4    8:return          
	}
}
