// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package junit.textui;

import java.io.InputStream;
import java.io.PrintStream;
import junit.b.*;
import junit.runner.Version;
import junit.runner.a;

// Referenced classes of package junit.textui:
//			a

public class TestRunner extends a
{

	public TestRunner()
	{
		this(System.out);
	//    0    0:aload_0         
	//    1    1:getstatic       #14  <Field PrintStream System.out>
	//    2    4:invokespecial   #17  <Method void TestRunner(PrintStream)>
	//    3    7:return          
	}

	public TestRunner(PrintStream printstream)
	{
		this(new junit.textui.a(printstream));
	//    0    0:aload_0         
	//    1    1:new             #20  <Class junit.textui.a>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #21  <Method void junit.textui.a(PrintStream)>
	//    5    9:invokespecial   #24  <Method void TestRunner(junit.textui.a)>
	//    6   12:return          
	}

	public TestRunner(junit.textui.a a1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void a()>
		d = a1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field junit.textui.a d>
	//    5    9:return          
	}

	public static void main(String args[])
	{
		TestRunner testrunner = new TestRunner();
	//    0    0:new             #2   <Class TestRunner>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void TestRunner()>
	//    3    7:astore_1        
		try
		{
			if(!testrunner.a(args).g())
	//*   4    8:aload_1         
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #37  <Method h a(String[])>
	//*   7   13:invokevirtual   #43  <Method boolean h.g()>
	//*   8   16:ifne            23
				System.exit(1);
	//    9   19:iconst_1        
	//   10   20:invokestatic    #47  <Method void System.exit(int)>
			System.exit(0);
	//   11   23:iconst_0        
	//   12   24:invokestatic    #47  <Method void System.exit(int)>
			return;
	//   13   27:return          
		}
		// Misplaced declaration of an exception variable
		catch(String args[])
	//*  14   28:astore_0        
		{
			System.err.println(((Exception) (args)).getMessage());
	//   15   29:getstatic       #50  <Field PrintStream System.err>
	//   16   32:aload_0         
	//   17   33:invokevirtual   #54  <Method String Exception.getMessage()>
	//   18   36:invokevirtual   #60  <Method void PrintStream.println(String)>
		}
		System.exit(2);
	//   19   39:iconst_2        
	//   20   40:invokestatic    #47  <Method void System.exit(int)>
	//   21   43:return          
	}

	protected h a(String s, String s1, boolean flag)
	{
		return a(i.a(f(s).asSubclass(junit/b/e), s1), flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #65  <Method Class f(String)>
	//    4    6:ldc1            #67  <Class e>
	//    5    8:invokevirtual   #73  <Method Class Class.asSubclass(Class)>
	//    6   11:aload_2         
	//    7   12:invokestatic    #78  <Method d i.a(Class, String)>
	//    8   15:iload_3         
	//    9   16:invokevirtual   #81  <Method h a(d, boolean)>
	//   10   19:areturn         
	}

	public h a(d d1, boolean flag)
	{
		h h1 = d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #84  <Method h d()>
	//    2    4:astore          7
		h1.a(((junit.b.g) (d)));
	//    3    6:aload           7
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field junit.textui.a d>
	//    6   12:invokevirtual   #87  <Method void h.a(junit.b.g)>
		long l = System.currentTimeMillis();
	//    7   15:invokestatic    #91  <Method long System.currentTimeMillis()>
	//    8   18:lstore_3        
		d1.b(h1);
	//    9   19:aload_1         
	//   10   20:aload           7
	//   11   22:invokeinterface #97  <Method void d.b(h)>
		long l1 = System.currentTimeMillis();
	//   12   27:invokestatic    #91  <Method long System.currentTimeMillis()>
	//   13   30:lstore          5
		d.a(h1, l1 - l);
	//   14   32:aload_0         
	//   15   33:getfield        #28  <Field junit.textui.a d>
	//   16   36:aload           7
	//   17   38:lload           5
	//   18   40:lload_3         
	//   19   41:lsub            
	//   20   42:invokevirtual   #100 <Method void junit.textui.a.a(h, long)>
		a(flag);
	//   21   45:aload_0         
	//   22   46:iload_2         
	//   23   47:invokevirtual   #103 <Method void a(boolean)>
		return h1;
	//   24   50:aload           7
	//   25   52:areturn         
	}

	public h a(String as[])
	{
		String s1 = "";
	//    0    0:ldc1            #105 <String "">
	//    1    2:astore          6
		boolean flag = false;
	//    2    4:iconst_0        
	//    3    5:istore          4
		String s = "";
	//    4    7:ldc1            #105 <String "">
	//    5    9:astore          5
		for(int j = 0; j < as.length; j++)
	//*   6   11:iconst_0        
	//*   7   12:istore_2        
	//*   8   13:iload_2         
	//*   9   14:aload_1         
	//*  10   15:arraylength     
	//*  11   16:icmpge          188
		{
			if(as[j].equals("-wait"))
	//*  12   19:aload_1         
	//*  13   20:iload_2         
	//*  14   21:aaload          
	//*  15   22:ldc1            #107 <String "-wait">
	//*  16   24:invokevirtual   #113 <Method boolean String.equals(Object)>
	//*  17   27:ifeq            36
			{
				flag = true;
	//   18   30:iconst_1        
	//   19   31:istore          4
				continue;
	//   20   33:goto            181
			}
			if(as[j].equals("-c"))
	//*  21   36:aload_1         
	//*  22   37:iload_2         
	//*  23   38:aaload          
	//*  24   39:ldc1            #115 <String "-c">
	//*  25   41:invokevirtual   #113 <Method boolean String.equals(Object)>
	//*  26   44:ifeq            63
			{
				j++;
	//   27   47:iload_2         
	//   28   48:iconst_1        
	//   29   49:iadd            
	//   30   50:istore_2        
				s = d(as[j]);
	//   31   51:aload_0         
	//   32   52:aload_1         
	//   33   53:iload_2         
	//   34   54:aaload          
	//   35   55:invokevirtual   #118 <Method String d(String)>
	//   36   58:astore          5
				continue;
	//   37   60:goto            181
			}
			if(as[j].equals("-m"))
	//*  38   63:aload_1         
	//*  39   64:iload_2         
	//*  40   65:aaload          
	//*  41   66:ldc1            #120 <String "-m">
	//*  42   68:invokevirtual   #113 <Method boolean String.equals(Object)>
	//*  43   71:ifeq            113
			{
				j++;
	//   44   74:iload_2         
	//   45   75:iconst_1        
	//   46   76:iadd            
	//   47   77:istore_2        
				s1 = as[j];
	//   48   78:aload_1         
	//   49   79:iload_2         
	//   50   80:aaload          
	//   51   81:astore          6
				int k = s1.lastIndexOf('.');
	//   52   83:aload           6
	//   53   85:bipush          46
	//   54   87:invokevirtual   #124 <Method int String.lastIndexOf(int)>
	//   55   90:istore_3        
				s = s1.substring(0, k);
	//   56   91:aload           6
	//   57   93:iconst_0        
	//   58   94:iload_3         
	//   59   95:invokevirtual   #128 <Method String String.substring(int, int)>
	//   60   98:astore          5
				s1 = s1.substring(k + 1);
	//   61  100:aload           6
	//   62  102:iload_3         
	//   63  103:iconst_1        
	//   64  104:iadd            
	//   65  105:invokevirtual   #131 <Method String String.substring(int)>
	//   66  108:astore          6
				continue;
	//   67  110:goto            181
			}
			if(as[j].equals("-v"))
	//*  68  113:aload_1         
	//*  69  114:iload_2         
	//*  70  115:aaload          
	//*  71  116:ldc1            #133 <String "-v">
	//*  72  118:invokevirtual   #113 <Method boolean String.equals(Object)>
	//*  73  121:ifeq            176
			{
				PrintStream printstream = System.err;
	//   74  124:getstatic       #50  <Field PrintStream System.err>
	//   75  127:astore          7
				StringBuilder stringbuilder1 = new StringBuilder();
	//   76  129:new             #135 <Class StringBuilder>
	//   77  132:dup             
	//   78  133:invokespecial   #136 <Method void StringBuilder()>
	//   79  136:astore          8
				stringbuilder1.append("JUnit ");
	//   80  138:aload           8
	//   81  140:ldc1            #138 <String "JUnit ">
	//   82  142:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   83  145:pop             
				stringbuilder1.append(Version.a());
	//   84  146:aload           8
	//   85  148:invokestatic    #146 <Method String Version.a()>
	//   86  151:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   87  154:pop             
				stringbuilder1.append(" by Kent Beck and Erich Gamma");
	//   88  155:aload           8
	//   89  157:ldc1            #148 <String " by Kent Beck and Erich Gamma">
	//   90  159:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   91  162:pop             
				printstream.println(stringbuilder1.toString());
	//   92  163:aload           7
	//   93  165:aload           8
	//   94  167:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   95  170:invokevirtual   #60  <Method void PrintStream.println(String)>
			} else
	//*  96  173:goto            181
			{
				s = as[j];
	//   97  176:aload_1         
	//   98  177:iload_2         
	//   99  178:aaload          
	//  100  179:astore          5
			}
		}

	//  101  181:iload_2         
	//  102  182:iconst_1        
	//  103  183:iadd            
	//  104  184:istore_2        
	//* 105  185:goto            13
		if(s.equals(""))
	//* 106  188:aload           5
	//* 107  190:ldc1            #105 <String "">
	//* 108  192:invokevirtual   #113 <Method boolean String.equals(Object)>
	//* 109  195:ifeq            208
			throw new Exception("Usage: TestRunner [-wait] testCaseName, where name is the name of the TestCase class");
	//  110  198:new             #32  <Class Exception>
	//  111  201:dup             
	//  112  202:ldc1            #153 <String "Usage: TestRunner [-wait] testCaseName, where name is the name of the TestCase class">
	//  113  204:invokespecial   #155 <Method void Exception(String)>
	//  114  207:athrow          
		try
		{
			if(!s1.equals(""))
	//* 115  208:aload           6
	//* 116  210:ldc1            #105 <String "">
	//* 117  212:invokevirtual   #113 <Method boolean String.equals(Object)>
	//* 118  215:ifne            229
				return a(s, s1, flag);
	//  119  218:aload_0         
	//  120  219:aload           5
	//  121  221:aload           6
	//  122  223:iload           4
	//  123  225:invokevirtual   #157 <Method h a(String, String, boolean)>
	//  124  228:areturn         
			as = ((String []) (a(c(s), flag)));
	//  125  229:aload_0         
	//  126  230:aload_0         
	//  127  231:aload           5
	//  128  233:invokevirtual   #161 <Method d c(String)>
	//  129  236:iload           4
	//  130  238:invokevirtual   #81  <Method h a(d, boolean)>
	//  131  241:astore_1        
		}
	//* 132  242:aload_1         
	//* 133  243:areturn         
		// Misplaced declaration of an exception variable
		catch(String as[])
	//* 134  244:astore_1        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//  135  245:new             #135 <Class StringBuilder>
	//  136  248:dup             
	//  137  249:invokespecial   #136 <Method void StringBuilder()>
	//  138  252:astore          5
			stringbuilder.append("Could not create and run test suite: ");
	//  139  254:aload           5
	//  140  256:ldc1            #163 <String "Could not create and run test suite: ">
	//  141  258:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//  142  261:pop             
			stringbuilder.append(((Object) (as)));
	//  143  262:aload           5
	//  144  264:aload_1         
	//  145  265:invokevirtual   #166 <Method StringBuilder StringBuilder.append(Object)>
	//  146  268:pop             
			throw new Exception(stringbuilder.toString());
	//  147  269:new             #32  <Class Exception>
	//  148  272:dup             
	//  149  273:aload           5
	//  150  275:invokevirtual   #151 <Method String StringBuilder.toString()>
	//  151  278:invokespecial   #155 <Method void Exception(String)>
	//  152  281:athrow          
		}
		return ((h) (as));
	}

	public void a(int j, d d1, Throwable throwable)
	{
	//    0    0:return          
	}

	public void a(String s)
	{
	//    0    0:return          
	}

	protected void a(boolean flag)
	{
		if(!flag)
	//*   0    0:iload_1         
	//*   1    1:ifne            5
			return;
	//    2    4:return          
		d.a();
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field junit.textui.a d>
	//    5    9:invokevirtual   #169 <Method void junit.textui.a.a()>
		try
		{
			System.in.read();
	//    6   12:getstatic       #173 <Field InputStream System.in>
	//    7   15:invokevirtual   #179 <Method int InputStream.read()>
	//    8   18:pop             
			return;
	//    9   19:return          
		}
		catch(Exception exception)
	//*  10   20:astore_2        
		{
			return;
	//   11   21:return          
		}
	}

	public void b(String s)
	{
	//    0    0:return          
	}

	protected h d()
	{
		return new h();
	//    0    0:new             #39  <Class h>
	//    1    3:dup             
	//    2    4:invokespecial   #180 <Method void h()>
	//    3    7:areturn         
	}

	protected void e(String s)
	{
		System.err.println(s);
	//    0    0:getstatic       #50  <Field PrintStream System.err>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #60  <Method void PrintStream.println(String)>
		System.exit(1);
	//    3    7:iconst_1        
	//    4    8:invokestatic    #47  <Method void System.exit(int)>
	//    5   11:return          
	}

	private junit.textui.a d;
}
