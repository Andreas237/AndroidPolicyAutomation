// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.log;

import java.io.PrintStream;

// Referenced classes of package com.itextpdf.text.log:
//			Logger, Level

public class SysoLogger
	implements Logger
{

	public SysoLogger()
	{
		this(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #15  <Method void SysoLogger(int)>
	//    3    5:return          
	}

	public SysoLogger(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		shorten = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #20  <Field int shorten>
	//    5    9:return          
	}

	protected SysoLogger(String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		shorten = i;
	//    2    4:aload_0         
	//    3    5:iload_2         
	//    4    6:putfield        #20  <Field int shorten>
		name = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #23  <Field String name>
	//    8   14:return          
	}

	private String shorten(String s)
	{
		String s1 = s;
	//    0    0:aload_1         
	//    1    1:astore          4
		if(shorten != 0)
	//*   2    3:aload_0         
	//*   3    4:getfield        #20  <Field int shorten>
	//*   4    7:ifeq            119
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5   10:new             #26  <Class StringBuilder>
	//    6   13:dup             
	//    7   14:invokespecial   #27  <Method void StringBuilder()>
	//    8   17:astore          5
			s1 = s;
	//    9   19:aload_1         
	//   10   20:astore          4
			int i = s.indexOf('.');
	//   11   22:aload_1         
	//   12   23:bipush          46
	//   13   25:invokevirtual   #33  <Method int String.indexOf(int)>
	//   14   28:istore_2        
			while(i != -1) 
	//*  15   29:iload_2         
	//*  16   30:iconst_m1       
	//*  17   31:icmpeq          94
			{
				int j;
				if(i < shorten)
	//*  18   34:iload_2         
	//*  19   35:aload_0         
	//*  20   36:getfield        #20  <Field int shorten>
	//*  21   39:icmpge          86
					j = i;
	//   22   42:iload_2         
	//   23   43:istore_3        
				else
	//*  24   44:aload           5
	//*  25   46:aload           4
	//*  26   48:iconst_0        
	//*  27   49:iload_3         
	//*  28   50:invokevirtual   #37  <Method String String.substring(int, int)>
	//*  29   53:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//*  30   56:pop             
	//*  31   57:aload           5
	//*  32   59:bipush          46
	//*  33   61:invokevirtual   #44  <Method StringBuilder StringBuilder.append(char)>
	//*  34   64:pop             
	//*  35   65:aload           4
	//*  36   67:iload_2         
	//*  37   68:iconst_1        
	//*  38   69:iadd            
	//*  39   70:invokevirtual   #47  <Method String String.substring(int)>
	//*  40   73:astore          4
	//*  41   75:aload           4
	//*  42   77:bipush          46
	//*  43   79:invokevirtual   #33  <Method int String.indexOf(int)>
	//*  44   82:istore_2        
	//*  45   83:goto            29
					j = shorten;
	//   46   86:aload_0         
	//   47   87:getfield        #20  <Field int shorten>
	//   48   90:istore_3        
				stringbuilder.append(s1.substring(0, j));
				stringbuilder.append('.');
				s1 = s1.substring(i + 1);
				i = s1.indexOf('.');
			}
	//*  49   91:goto            44
			stringbuilder.append(s.substring(s.lastIndexOf('.') + 1));
	//   50   94:aload           5
	//   51   96:aload_1         
	//   52   97:aload_1         
	//   53   98:bipush          46
	//   54  100:invokevirtual   #50  <Method int String.lastIndexOf(int)>
	//   55  103:iconst_1        
	//   56  104:iadd            
	//   57  105:invokevirtual   #47  <Method String String.substring(int)>
	//   58  108:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   59  111:pop             
			s1 = stringbuilder.toString();
	//   60  112:aload           5
	//   61  114:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   62  117:astore          4
		}
		return s1;
	//   63  119:aload           4
	//   64  121:areturn         
	}

	public void debug(String s)
	{
		System.out.println(String.format("%s DEBUG %s", new Object[] {
			shorten(name), s
		}));
	//    0    0:getstatic       #62  <Field PrintStream System.out>
	//    1    3:ldc1            #64  <String "%s DEBUG %s">
	//    2    5:iconst_2        
	//    3    6:anewarray       Object[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:getfield        #23  <Field String name>
	//    9   16:invokespecial   #66  <Method String shorten(String)>
	//   10   19:aastore         
	//   11   20:dup             
	//   12   21:iconst_1        
	//   13   22:aload_1         
	//   14   23:aastore         
	//   15   24:invokestatic    #70  <Method String String.format(String, Object[])>
	//   16   27:invokevirtual   #75  <Method void PrintStream.println(String)>
	//   17   30:return          
	}

	public void error(String s)
	{
		System.out.println(String.format("%s ERROR %s", new Object[] {
			name, s
		}));
	//    0    0:getstatic       #62  <Field PrintStream System.out>
	//    1    3:ldc1            #78  <String "%s ERROR %s">
	//    2    5:iconst_2        
	//    3    6:anewarray       Object[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:aload_0         
	//    7   12:getfield        #23  <Field String name>
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:aload_1         
	//   12   19:aastore         
	//   13   20:invokestatic    #70  <Method String String.format(String, Object[])>
	//   14   23:invokevirtual   #75  <Method void PrintStream.println(String)>
	//   15   26:return          
	}

	public void error(String s, Exception exception)
	{
		System.out.println(String.format("%s ERROR %s", new Object[] {
			name, s
		}));
	//    0    0:getstatic       #62  <Field PrintStream System.out>
	//    1    3:ldc1            #78  <String "%s ERROR %s">
	//    2    5:iconst_2        
	//    3    6:anewarray       Object[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:aload_0         
	//    7   12:getfield        #23  <Field String name>
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:aload_1         
	//   12   19:aastore         
	//   13   20:invokestatic    #70  <Method String String.format(String, Object[])>
	//   14   23:invokevirtual   #75  <Method void PrintStream.println(String)>
		exception.printStackTrace(System.out);
	//   15   26:aload_2         
	//   16   27:getstatic       #62  <Field PrintStream System.out>
	//   17   30:invokevirtual   #85  <Method void Exception.printStackTrace(PrintStream)>
	//   18   33:return          
	}

	public Logger getLogger(Class class1)
	{
		return ((Logger) (new SysoLogger(class1.getName(), shorten)));
	//    0    0:new             #2   <Class SysoLogger>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #92  <Method String Class.getName()>
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field int shorten>
	//    6   12:invokespecial   #94  <Method void SysoLogger(String, int)>
	//    7   15:areturn         
	}

	public Logger getLogger(String s)
	{
		return ((Logger) (new SysoLogger("[itext]", 0)));
	//    0    0:new             #2   <Class SysoLogger>
	//    1    3:dup             
	//    2    4:ldc1            #99  <String "[itext]">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #94  <Method void SysoLogger(String, int)>
	//    5   10:areturn         
	}

	public void info(String s)
	{
		System.out.println(String.format("%s INFO  %s", new Object[] {
			shorten(name), s
		}));
	//    0    0:getstatic       #62  <Field PrintStream System.out>
	//    1    3:ldc1            #102 <String "%s INFO  %s">
	//    2    5:iconst_2        
	//    3    6:anewarray       Object[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:getfield        #23  <Field String name>
	//    9   16:invokespecial   #66  <Method String shorten(String)>
	//   10   19:aastore         
	//   11   20:dup             
	//   12   21:iconst_1        
	//   13   22:aload_1         
	//   14   23:aastore         
	//   15   24:invokestatic    #70  <Method String String.format(String, Object[])>
	//   16   27:invokevirtual   #75  <Method void PrintStream.println(String)>
	//   17   30:return          
	}

	public boolean isLogging(Level level)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void trace(String s)
	{
		System.out.println(String.format("%s TRACE %s", new Object[] {
			shorten(name), s
		}));
	//    0    0:getstatic       #62  <Field PrintStream System.out>
	//    1    3:ldc1            #107 <String "%s TRACE %s">
	//    2    5:iconst_2        
	//    3    6:anewarray       Object[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:getfield        #23  <Field String name>
	//    9   16:invokespecial   #66  <Method String shorten(String)>
	//   10   19:aastore         
	//   11   20:dup             
	//   12   21:iconst_1        
	//   13   22:aload_1         
	//   14   23:aastore         
	//   15   24:invokestatic    #70  <Method String String.format(String, Object[])>
	//   16   27:invokevirtual   #75  <Method void PrintStream.println(String)>
	//   17   30:return          
	}

	public void warn(String s)
	{
		System.out.println(String.format("%s WARN  %s", new Object[] {
			shorten(name), s
		}));
	//    0    0:getstatic       #62  <Field PrintStream System.out>
	//    1    3:ldc1            #110 <String "%s WARN  %s">
	//    2    5:iconst_2        
	//    3    6:anewarray       Object[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:getfield        #23  <Field String name>
	//    9   16:invokespecial   #66  <Method String shorten(String)>
	//   10   19:aastore         
	//   11   20:dup             
	//   12   21:iconst_1        
	//   13   22:aload_1         
	//   14   23:aastore         
	//   15   24:invokestatic    #70  <Method String String.format(String, Object[])>
	//   16   27:invokevirtual   #75  <Method void PrintStream.println(String)>
	//   17   30:return          
	}

	private String name;
	private final int shorten;
}
