// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.amap.api.mapcore.util:
//			iz

final class iz$c
{

	static long a(iz$c iz$c1, long l)
	{
		iz$c1.f = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #39  <Field long f>
		return l;
	//    3    5:lload_1         
	//    4    6:lreturn         
	}

	static iz$a a(iz$c iz$c1)
	{
		return iz$c1.e;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field iz$a e>
	//    2    4:areturn         
	}

	static iz$a a(iz$c iz$c1, iz$a iz$a)
	{
		iz$c1.e = iz$a;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #42  <Field iz$a e>
		return iz$a;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static void a(iz$c iz$c1, String as[])
		throws IOException
	{
		iz$c1.a(as);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #49  <Method void a(String[])>
	//    3    5:return          
	}

	private void a(String as[])
		throws IOException
	{
		if(as.length != iz.e(a))
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:aload_0         
	//*   3    3:getfield        #22  <Field iz a>
	//*   4    6:invokestatic    #30  <Method int iz.e(iz)>
	//*   5    9:icmpeq          18
			throw b(as);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokespecial   #55  <Method IOException b(String[])>
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
				c[i] = Long.parseLong(as[i]);
	//   16   26:aload_0         
	//   17   27:getfield        #32  <Field long[] c>
	//   18   30:iload_2         
	//   19   31:aload_1         
	//   20   32:iload_2         
	//   21   33:aaload          
	//   22   34:invokestatic    #61  <Method long Long.parseLong(String)>
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
				throw b(as);
	//   31   47:aload_0         
	//   32   48:aload_1         
	//   33   49:invokespecial   #55  <Method IOException b(String[])>
	//   34   52:athrow          
			}
			i++;
		} while(true);
	}

	static boolean a(iz$c iz$c1, boolean flag)
	{
		iz$c1.d = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #64  <Field boolean d>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private IOException b(String as[])
		throws IOException
	{
		throw new IOException((new StringBuilder()).append("unexpected journal line: ").append(Arrays.toString(((Object []) (as)))).toString());
	//    0    0:new             #46  <Class IOException>
	//    1    3:dup             
	//    2    4:new             #66  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #67  <Method void StringBuilder()>
	//    5   11:ldc1            #69  <String "unexpected journal line: ">
	//    6   13:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_1         
	//    8   17:invokestatic    #79  <Method String Arrays.toString(Object[])>
	//    9   20:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   11   26:invokespecial   #85  <Method void IOException(String)>
	//   12   29:athrow          
	}

	static long[] b(iz$c iz$c1)
	{
		return iz$c1.c;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field long[] c>
	//    2    4:areturn         
	}

	static String c(iz$c iz$c1)
	{
		return iz$c1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String b>
	//    2    4:areturn         
	}

	static boolean d(iz$c iz$c1)
	{
		return iz$c1.d;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field boolean d>
	//    2    4:ireturn         
	}

	static long e(iz$c iz$c1)
	{
		return iz$c1.f;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field long f>
	//    2    4:lreturn         
	}

	public File a(int i)
	{
		return new File(iz.f(a), (new StringBuilder()).append(b).append(".").append(i).toString());
	//    0    0:new             #92  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field iz a>
	//    4    8:invokestatic    #95  <Method File iz.f(iz)>
	//    5   11:new             #66  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #67  <Method void StringBuilder()>
	//    8   18:aload_0         
	//    9   19:getfield        #27  <Field String b>
	//   10   22:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:ldc1            #97  <String ".">
	//   12   27:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:iload_1         
	//   14   31:invokevirtual   #100 <Method StringBuilder StringBuilder.append(int)>
	//   15   34:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   16   37:invokespecial   #103 <Method void File(File, String)>
	//   17   40:areturn         
	}

	public String a()
		throws IOException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #66  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #67  <Method void StringBuilder()>
	//    3    7:astore          5
		long al[] = c;
	//    4    9:aload_0         
	//    5   10:getfield        #32  <Field long[] c>
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
	//   21   35:invokevirtual   #106 <Method StringBuilder StringBuilder.append(char)>
	//   22   38:lload_3         
	//   23   39:invokevirtual   #109 <Method StringBuilder StringBuilder.append(long)>
	//   24   42:pop             
		}

	//   25   43:iload_1         
	//   26   44:iconst_1        
	//   27   45:iadd            
	//   28   46:istore_1        
	//*  29   47:goto            21
		return stringbuilder.toString();
	//   30   50:aload           5
	//   31   52:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   32   55:areturn         
	}

	public File b(int i)
	{
		return new File(iz.f(a), (new StringBuilder()).append(b).append(".").append(i).append(".tmp").toString());
	//    0    0:new             #92  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field iz a>
	//    4    8:invokestatic    #95  <Method File iz.f(iz)>
	//    5   11:new             #66  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #67  <Method void StringBuilder()>
	//    8   18:aload_0         
	//    9   19:getfield        #27  <Field String b>
	//   10   22:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:ldc1            #97  <String ".">
	//   12   27:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:iload_1         
	//   14   31:invokevirtual   #100 <Method StringBuilder StringBuilder.append(int)>
	//   15   34:ldc1            #111 <String ".tmp">
	//   16   36:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   17   39:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   18   42:invokespecial   #103 <Method void File(File, String)>
	//   19   45:areturn         
	}

	final iz a;
	private final String b;
	private final long c[];
	private boolean d;
	private iz$a e;
	private long f;

	private iz$c(iz iz1, String s)
	{
		a = iz1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field iz a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #25  <Method void Object()>
		b = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field String b>
		c = new long[iz.e(iz1)];
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokestatic    #30  <Method int iz.e(iz)>
	//   11   19:newarray        long[]
	//   12   21:putfield        #32  <Field long[] c>
	//   13   24:return          
	}

	iz$c(iz iz1, String s, iz$1 iz$1)
	{
		this(iz1, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #36  <Method void iz$c(iz, String)>
	//    4    6:return          
	}
}
