// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import java.util.*;

// Referenced classes of package bo.app:
//			u, eb, ct, bt

public class bz
{

	public bz()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		d = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #34  <Field boolean d>
	//    5    9:aload_0         
	//    6   10:new             #4   <Class Object>
	//    7   13:dup             
	//    8   14:invokespecial   #32  <Method void Object()>
	//    9   17:putfield        #36  <Field Object e>
	//   10   20:aload_0         
	//   11   21:new             #38  <Class ArrayList>
	//   12   24:dup             
	//   13   25:bipush          32
	//   14   27:invokespecial   #41  <Method void ArrayList(int)>
	//   15   30:putfield        #43  <Field List b>
	//   16   33:return          
	}

	static String b(String s, String s1, Throwable throwable)
	{
		if(StringUtils.isNullOrBlank(s))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #51  <Method boolean StringUtils.isNullOrBlank(String)>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		if(StringUtils.isNullOrBlank(s1) && (throwable == null || StringUtils.isNullOrBlank(throwable.getMessage())))
	//*   5    9:aload_1         
	//*   6   10:invokestatic    #51  <Method boolean StringUtils.isNullOrBlank(String)>
	//*   7   13:ifeq            32
	//*   8   16:aload_2         
	//*   9   17:ifnull          30
	//*  10   20:aload_2         
	//*  11   21:invokevirtual   #57  <Method String Throwable.getMessage()>
	//*  12   24:invokestatic    #51  <Method boolean StringUtils.isNullOrBlank(String)>
	//*  13   27:ifeq            32
			return null;
	//   14   30:aconst_null     
	//   15   31:areturn         
		Object obj = ((Object) (new StringBuilder()));
	//   16   32:new             #59  <Class StringBuilder>
	//   17   35:dup             
	//   18   36:invokespecial   #60  <Method void StringBuilder()>
	//   19   39:astore_3        
		((StringBuilder) (obj)).append(c());
	//   20   40:aload_3         
	//   21   41:invokestatic    #62  <Method String c()>
	//   22   44:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
		((StringBuilder) (obj)).append(" ");
	//   24   48:aload_3         
	//   25   49:ldc1            #68  <String " ">
	//   26   51:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   27   54:pop             
		((StringBuilder) (obj)).append(s);
	//   28   55:aload_3         
	//   29   56:aload_0         
	//   30   57:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   31   60:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   32   61:aload_3         
	//   33   62:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   34   65:astore_3        
		s = ((String) (obj));
	//   35   66:aload_3         
	//   36   67:astore_0        
		if(s1 != null)
	//*  37   68:aload_1         
	//*  38   69:ifnull          104
		{
			s = ((String) (new StringBuilder()));
	//   39   72:new             #59  <Class StringBuilder>
	//   40   75:dup             
	//   41   76:invokespecial   #60  <Method void StringBuilder()>
	//   42   79:astore_0        
			((StringBuilder) (s)).append(((String) (obj)));
	//   43   80:aload_0         
	//   44   81:aload_3         
	//   45   82:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   46   85:pop             
			((StringBuilder) (s)).append(": ");
	//   47   86:aload_0         
	//   48   87:ldc1            #73  <String ": ">
	//   49   89:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   50   92:pop             
			((StringBuilder) (s)).append(s1);
	//   51   93:aload_0         
	//   52   94:aload_1         
	//   53   95:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   54   98:pop             
			s = ((StringBuilder) (s)).toString();
	//   55   99:aload_0         
	//   56  100:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   57  103:astore_0        
		}
		s1 = s;
	//   58  104:aload_0         
	//   59  105:astore_1        
		if(throwable != null)
	//*  60  106:aload_2         
	//*  61  107:ifnull          145
		{
			s1 = ((String) (new StringBuilder()));
	//   62  110:new             #59  <Class StringBuilder>
	//   63  113:dup             
	//   64  114:invokespecial   #60  <Method void StringBuilder()>
	//   65  117:astore_1        
			((StringBuilder) (s1)).append(s);
	//   66  118:aload_1         
	//   67  119:aload_0         
	//   68  120:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   69  123:pop             
			((StringBuilder) (s1)).append(": ");
	//   70  124:aload_1         
	//   71  125:ldc1            #73  <String ": ">
	//   72  127:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   73  130:pop             
			((StringBuilder) (s1)).append(throwable.getMessage());
	//   74  131:aload_1         
	//   75  132:aload_2         
	//   76  133:invokevirtual   #57  <Method String Throwable.getMessage()>
	//   77  136:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   78  139:pop             
			s1 = ((StringBuilder) (s1)).toString();
	//   79  140:aload_1         
	//   80  141:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   81  144:astore_1        
		}
		return s1.substring(0, Math.min(s1.length(), 1000));
	//   82  145:aload_1         
	//   83  146:iconst_0        
	//   84  147:aload_1         
	//   85  148:invokevirtual   #79  <Method int String.length()>
	//   86  151:sipush          1000
	//   87  154:invokestatic    #85  <Method int Math.min(int, int)>
	//   88  157:invokevirtual   #89  <Method String String.substring(int, int)>
	//   89  160:areturn         
	}

	private static String c()
	{
		return eb.a(new Date(), u.c);
	//    0    0:new             #92  <Class Date>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void Date()>
	//    3    7:getstatic       #98  <Field u u.c>
	//    4   10:invokestatic    #103 <Method String eb.a(Date, u)>
	//    5   13:areturn         
	}

	private boolean d()
	{
		StackTraceElement astacktraceelement[] = (new Throwable()).getStackTrace();
	//    0    0:new             #53  <Class Throwable>
	//    1    3:dup             
	//    2    4:invokespecial   #105 <Method void Throwable()>
	//    3    7:invokevirtual   #109 <Method StackTraceElement[] Throwable.getStackTrace()>
	//    4   10:astore          5
		if(astacktraceelement != null)
	//*   5   12:aload           5
	//*   6   14:ifnull          118
		{
			if(astacktraceelement.length == 0)
	//*   7   17:aload           5
	//*   8   19:arraylength     
	//*   9   20:ifne            25
				return true;
	//   10   23:iconst_1        
	//   11   24:ireturn         
			Object obj = ((Object) (astacktraceelement[1]));
	//   12   25:aload           5
	//   13   27:iconst_1        
	//   14   28:aaload          
	//   15   29:astore          7
			String s = ((StackTraceElement) (obj)).getMethodName();
	//   16   31:aload           7
	//   17   33:invokevirtual   #114 <Method String StackTraceElement.getMethodName()>
	//   18   36:astore          6
			obj = ((Object) (((StackTraceElement) (obj)).getClassName()));
	//   19   38:aload           7
	//   20   40:invokevirtual   #117 <Method String StackTraceElement.getClassName()>
	//   21   43:astore          7
			int l = astacktraceelement.length;
	//   22   45:aload           5
	//   23   47:arraylength     
	//   24   48:istore          4
			int i = 0;
	//   25   50:iconst_0        
	//   26   51:istore_1        
			int j;
			int k;
			for(j = 0; i < l; j = k)
	//*  27   52:iconst_0        
	//*  28   53:istore_2        
	//*  29   54:iload_1         
	//*  30   55:iload           4
	//*  31   57:icmpge          109
			{
				StackTraceElement stacktraceelement = astacktraceelement[i];
	//   32   60:aload           5
	//   33   62:iload_1         
	//   34   63:aaload          
	//   35   64:astore          8
				k = j;
	//   36   66:iload_2         
	//   37   67:istore_3        
				if(stacktraceelement.getClassName().equals(obj))
	//*  38   68:aload           8
	//*  39   70:invokevirtual   #117 <Method String StackTraceElement.getClassName()>
	//*  40   73:aload           7
	//*  41   75:invokevirtual   #121 <Method boolean String.equals(Object)>
	//*  42   78:ifeq            100
				{
					k = j;
	//   43   81:iload_2         
	//   44   82:istore_3        
					if(stacktraceelement.getMethodName().equals(((Object) (s))))
	//*  45   83:aload           8
	//*  46   85:invokevirtual   #114 <Method String StackTraceElement.getMethodName()>
	//*  47   88:aload           6
	//*  48   90:invokevirtual   #121 <Method boolean String.equals(Object)>
	//*  49   93:ifeq            100
						k = j + 1;
	//   50   96:iload_2         
	//   51   97:iconst_1        
	//   52   98:iadd            
	//   53   99:istore_3        
				}
				i++;
	//   54  100:iload_1         
	//   55  101:iconst_1        
	//   56  102:iadd            
	//   57  103:istore_1        
			}

	//   58  104:iload_3         
	//   59  105:istore_2        
	//*  60  106:goto            54
			return j != 1;
	//   61  109:iload_2         
	//   62  110:iconst_1        
	//   63  111:icmpeq          116
	//   64  114:iconst_1        
	//   65  115:ireturn         
	//   66  116:iconst_0        
	//   67  117:ireturn         
		} else
		{
			return true;
	//   68  118:iconst_1        
	//   69  119:ireturn         
		}
	}

	public void a(bt bt1)
	{
		f = bt1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #124 <Field bt f>
	//    3    5:return          
	}

	public void a(ct ct1)
	{
		a(ct1.k());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #130 <Method boolean ct.k()>
	//    3    5:invokevirtual   #133 <Method void a(boolean)>
	//    4    8:return          
	}

	public void a(String s, String s1, Throwable throwable)
	{
		if(!d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field boolean d>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(s1 != null && (s1.contains("device_logs") || s1.contains("test_user_data")))
	//*   4    8:aload_2         
	//*   5    9:ifnull          31
	//*   6   12:aload_2         
	//*   7   13:ldc1            #137 <String "device_logs">
	//*   8   15:invokevirtual   #141 <Method boolean String.contains(CharSequence)>
	//*   9   18:ifne            30
	//*  10   21:aload_2         
	//*  11   22:ldc1            #143 <String "test_user_data">
	//*  12   24:invokevirtual   #141 <Method boolean String.contains(CharSequence)>
	//*  13   27:ifeq            31
			return;
	//   14   30:return          
		if(d())
	//*  15   31:aload_0         
	//*  16   32:invokespecial   #145 <Method boolean d()>
	//*  17   35:ifeq            39
			return;
	//   18   38:return          
		Object obj = e;
	//   19   39:aload_0         
	//   20   40:getfield        #36  <Field Object e>
	//   21   43:astore          4
		obj;
	//   22   45:aload           4
		JVM INSTR monitorenter ;
	//   23   47:monitorenter    
		if(b.size() >= 32)
	//*  24   48:aload_0         
	//*  25   49:getfield        #43  <Field List b>
	//*  26   52:invokeinterface #150 <Method int List.size()>
	//*  27   57:bipush          32
	//*  28   59:icmplt          66
			b();
	//   29   62:aload_0         
	//   30   63:invokevirtual   #152 <Method void b()>
		if(b.isEmpty() || c == 0L)
	//*  31   66:aload_0         
	//*  32   67:getfield        #43  <Field List b>
	//*  33   70:invokeinterface #155 <Method boolean List.isEmpty()>
	//*  34   75:ifne            87
	//*  35   78:aload_0         
	//*  36   79:getfield        #157 <Field long c>
	//*  37   82:lconst_0        
	//*  38   83:lcmp            
	//*  39   84:ifne            94
			c = eb.a();
	//   40   87:aload_0         
	//   41   88:invokestatic    #160 <Method long eb.a()>
	//   42   91:putfield        #157 <Field long c>
		s = b(s, s1, throwable);
	//   43   94:aload_1         
	//   44   95:aload_2         
	//   45   96:aload_3         
	//   46   97:invokestatic    #162 <Method String b(String, String, Throwable)>
	//   47  100:astore_1        
		if(s == null)
			break MISSING_BLOCK_LABEL_116;
	//   48  101:aload_1         
	//   49  102:ifnull          116
		b.add(((Object) (s)));
	//   50  105:aload_0         
	//   51  106:getfield        #43  <Field List b>
	//   52  109:aload_1         
	//   53  110:invokeinterface #165 <Method boolean List.add(Object)>
	//   54  115:pop             
		obj;
	//   55  116:aload           4
		JVM INSTR monitorexit ;
	//   56  118:monitorexit     
		return;
	//   57  119:return          
		s;
	//   58  120:astore_1        
		obj;
	//   59  121:aload           4
		JVM INSTR monitorexit ;
	//   60  123:monitorexit     
		throw s;
	//   61  124:aload_1         
	//   62  125:athrow          
	}

	public void a(boolean flag)
	{
		Object obj = e;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Object e>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(flag)
			break MISSING_BLOCK_LABEL_23;
	//    5    7:iload_1         
	//    6    8:ifne            23
		b.clear();
	//    7   11:aload_0         
	//    8   12:getfield        #43  <Field List b>
	//    9   15:invokeinterface #169 <Method void List.clear()>
		break MISSING_BLOCK_LABEL_33;
	//   10   20:goto            33
		AppboyLogger.i(a, "Test user device logging is enabled.", false);
	//   11   23:getstatic       #28  <Field String a>
	//   12   26:ldc1            #171 <String "Test user device logging is enabled.">
	//   13   28:iconst_0        
	//   14   29:invokestatic    #175 <Method int AppboyLogger.i(String, String, boolean)>
	//   15   32:pop             
		obj;
	//   16   33:aload_2         
		JVM INSTR monitorexit ;
	//   17   34:monitorexit     
		d = flag;
	//   18   35:aload_0         
	//   19   36:iload_1         
	//   20   37:putfield        #34  <Field boolean d>
		return;
	//   21   40:return          
		Exception exception;
		exception;
	//   22   41:astore_3        
		obj;
	//   23   42:aload_2         
		JVM INSTR monitorexit ;
	//   24   43:monitorexit     
		throw exception;
	//   25   44:aload_3         
	//   26   45:athrow          
	}

	public boolean a()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field boolean d>
	//    2    4:ireturn         
	}

	void b()
	{
		Object obj = e;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Object e>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		ArrayList arraylist;
		if(f == null)
			break MISSING_BLOCK_LABEL_74;
	//    5    7:aload_0         
	//    6    8:getfield        #124 <Field bt f>
	//    7   11:ifnull          74
		arraylist = new ArrayList();
	//    8   14:new             #38  <Class ArrayList>
	//    9   17:dup             
	//   10   18:invokespecial   #176 <Method void ArrayList()>
	//   11   21:astore_2        
		for(Iterator iterator = b.iterator(); iterator.hasNext(); ((List) (arraylist)).add(((Object) ((String)iterator.next()))));
	//   12   22:aload_0         
	//   13   23:getfield        #43  <Field List b>
	//   14   26:invokeinterface #180 <Method Iterator List.iterator()>
	//   15   31:astore_3        
	//   16   32:aload_3         
	//   17   33:invokeinterface #185 <Method boolean Iterator.hasNext()>
	//   18   38:ifeq            60
	//   19   41:aload_2         
	//   20   42:aload_3         
	//   21   43:invokeinterface #189 <Method Object Iterator.next()>
	//   22   48:checkcast       #75  <Class String>
	//   23   51:invokeinterface #165 <Method boolean List.add(Object)>
	//   24   56:pop             
	//*  25   57:goto            32
		f.a(((List) (arraylist)), c);
	//   26   60:aload_0         
	//   27   61:getfield        #124 <Field bt f>
	//   28   64:aload_2         
	//   29   65:aload_0         
	//   30   66:getfield        #157 <Field long c>
	//   31   69:invokeinterface #194 <Method void bt.a(List, long)>
		b.clear();
	//   32   74:aload_0         
	//   33   75:getfield        #43  <Field List b>
	//   34   78:invokeinterface #169 <Method void List.clear()>
		c = 0L;
	//   35   83:aload_0         
	//   36   84:lconst_0        
	//   37   85:putfield        #157 <Field long c>
		obj;
	//   38   88:aload_1         
		JVM INSTR monitorexit ;
	//   39   89:monitorexit     
		return;
	//   40   90:return          
		Exception exception;
		exception;
	//   41   91:astore_2        
		obj;
	//   42   92:aload_1         
		JVM INSTR monitorexit ;
	//   43   93:monitorexit     
		throw exception;
	//   44   94:aload_2         
	//   45   95:athrow          
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/bz);
	private final List b = new ArrayList(32);
	private long c;
	private boolean d;
	private final Object e = new Object();
	private bt f;

	static 
	{
	//    0    0:ldc1            #2   <Class bz>
	//    1    2:invokestatic    #26  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #28  <Field String a>
	//*   3    8:return          
	}
}
