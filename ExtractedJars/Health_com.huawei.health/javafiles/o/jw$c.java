// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package o:
//			jw

final class jw$c
{

	static void a(jw$c jw$c1, String as[])
		throws IOException
	{
		jw$c1.b(as);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #42  <Method void b(String[])>
	//    3    5:return          
	}

	static long[] a(jw$c jw$c1)
	{
		return jw$c1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field long[] b>
	//    2    4:areturn         
	}

	static long b(jw$c jw$c1)
	{
		return jw$c1.f;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field long f>
	//    2    4:lreturn         
	}

	private void b(String as[])
		throws IOException
	{
		if(as.length != jw.d(a))
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:aload_0         
	//*   3    3:getfield        #22  <Field jw a>
	//*   4    6:invokestatic    #30  <Method int jw.d(jw)>
	//*   5    9:icmpeq          18
			throw e(as);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokespecial   #52  <Method IOException e(String[])>
	//    9   17:athrow          
		int i = 0;
	//   10   18:iconst_0        
	//   11   19:istore_2        
		do
		{
			try
			{
				if(i >= as.length)
					break;
	//   12   20:iload_2         
	//   13   21:aload_1         
	//   14   22:arraylength     
	//   15   23:icmpge          45
				b[i] = Long.parseLong(as[i]);
	//   16   26:aload_0         
	//   17   27:getfield        #32  <Field long[] b>
	//   18   30:iload_2         
	//   19   31:aload_1         
	//   20   32:iload_2         
	//   21   33:aaload          
	//   22   34:invokestatic    #58  <Method long Long.parseLong(String)>
	//   23   37:lastore         
			}
	//*  24   38:iload_2         
	//*  25   39:iconst_1        
	//*  26   40:iadd            
	//*  27   41:istore_2        
	//*  28   42:goto            20
	//*  29   45:return          
			catch(NumberFormatException numberformatexception)
	//*  30   46:astore_3        
			{
				throw e(as);
	//   31   47:aload_0         
	//   32   48:aload_1         
	//   33   49:invokespecial   #52  <Method IOException e(String[])>
	//   34   52:athrow          
			}
			i++;
		} while(true);
	}

	static String c(jw$c jw$c1)
	{
		return jw$c1.e;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String e>
	//    2    4:areturn         
	}

	static jw$b c(jw$c jw$c1, jw$b jw$b)
	{
		jw$c1.c = jw$b;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #62  <Field jw$b c>
		return jw$b;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static long d(jw$c jw$c1, long l)
	{
		jw$c1.f = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #47  <Field long f>
		return l;
	//    3    5:lload_1         
	//    4    6:lreturn         
	}

	static boolean d(jw$c jw$c1)
	{
		return jw$c1.d;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field boolean d>
	//    2    4:ireturn         
	}

	private IOException e(String as[])
		throws IOException
	{
		throw new IOException((new StringBuilder()).append("unexpected journal line: ").append(Arrays.toString(((Object []) (as)))).toString());
	//    0    0:new             #39  <Class IOException>
	//    1    3:dup             
	//    2    4:new             #68  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #69  <Method void StringBuilder()>
	//    5   11:ldc1            #71  <String "unexpected journal line: ">
	//    6   13:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_1         
	//    8   17:invokestatic    #81  <Method String Arrays.toString(Object[])>
	//    9   20:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   11   26:invokespecial   #87  <Method void IOException(String)>
	//   12   29:athrow          
	}

	static jw$b e(jw$c jw$c1)
	{
		return jw$c1.c;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field jw$b c>
	//    2    4:areturn         
	}

	static boolean e(jw$c jw$c1, boolean flag)
	{
		jw$c1.d = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #66  <Field boolean d>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	public String a()
		throws IOException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #68  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void StringBuilder()>
	//    3    7:astore          5
		long al[] = b;
	//    4    9:aload_0         
	//    5   10:getfield        #32  <Field long[] b>
	//    6   13:astore          6
		int j = al.length;
	//    7   15:aload           6
	//    8   17:arraylength     
	//    9   18:istore_2        
		for(int i = 0; i < j; i++)
	//*  10   19:iconst_0        
	//*  11   20:istore_1        
	//*  12   21:iload_1         
	//*  13   22:iload_2         
	//*  14   23:icmpge          50
		{
			long l = al[i];
	//   15   26:aload           6
	//   16   28:iload_1         
	//   17   29:laload          
	//   18   30:lstore_3        
			stringbuilder.append(' ').append(l);
	//   19   31:aload           5
	//   20   33:bipush          32
	//   21   35:invokevirtual   #92  <Method StringBuilder StringBuilder.append(char)>
	//   22   38:lload_3         
	//   23   39:invokevirtual   #95  <Method StringBuilder StringBuilder.append(long)>
	//   24   42:pop             
		}

	//   25   43:iload_1         
	//   26   44:iconst_1        
	//   27   45:iadd            
	//   28   46:istore_1        
	//*  29   47:goto            21
		return stringbuilder.toString();
	//   30   50:aload           5
	//   31   52:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   32   55:areturn         
	}

	public File b(int i)
	{
		return new File(jw.g(a), (new StringBuilder()).append(e).append(".").append(i).append(".tmp").toString());
	//    0    0:new             #98  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field jw a>
	//    4    8:invokestatic    #102 <Method File jw.g(jw)>
	//    5   11:new             #68  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #69  <Method void StringBuilder()>
	//    8   18:aload_0         
	//    9   19:getfield        #27  <Field String e>
	//   10   22:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:ldc1            #104 <String ".">
	//   12   27:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:iload_1         
	//   14   31:invokevirtual   #107 <Method StringBuilder StringBuilder.append(int)>
	//   15   34:ldc1            #109 <String ".tmp">
	//   16   36:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   17   39:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   18   42:invokespecial   #112 <Method void File(File, String)>
	//   19   45:areturn         
	}

	public File e(int i)
	{
		return new File(jw.g(a), (new StringBuilder()).append(e).append(".").append(i).toString());
	//    0    0:new             #98  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field jw a>
	//    4    8:invokestatic    #102 <Method File jw.g(jw)>
	//    5   11:new             #68  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #69  <Method void StringBuilder()>
	//    8   18:aload_0         
	//    9   19:getfield        #27  <Field String e>
	//   10   22:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:ldc1            #104 <String ".">
	//   12   27:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:iload_1         
	//   14   31:invokevirtual   #107 <Method StringBuilder StringBuilder.append(int)>
	//   15   34:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   16   37:invokespecial   #112 <Method void File(File, String)>
	//   17   40:areturn         
	}

	final jw a;
	private final long b[];
	private jw$b c;
	private boolean d;
	private final String e;
	private long f;

	private jw$c(jw jw1, String s)
	{
		a = jw1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field jw a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #25  <Method void Object()>
		e = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field String e>
		b = new long[jw.d(jw1)];
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokestatic    #30  <Method int jw.d(jw)>
	//   11   19:newarray        long[]
	//   12   21:putfield        #32  <Field long[] b>
	//   13   24:return          
	}

	jw$c(jw jw1, String s, jw$a jw$a)
	{
		this(jw1, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #36  <Method void jw$c(jw, String)>
	//    4    6:return          
	}
}
