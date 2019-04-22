// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

final class bf
{

	bf(String s, int i, File file)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field String a>
		f = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #27  <Field int f>
		g = file;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #29  <Field File g>
		b = new long[i];
	//   11   19:aload_0         
	//   12   20:iload_2         
	//   13   21:newarray        long[]
	//   14   23:putfield        #31  <Field long[] b>
	//   15   26:return          
	}

	public File a(int i)
	{
		File file = g;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field File g>
	//    2    4:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #35  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #36  <Method void StringBuilder()>
	//    6   12:astore_3        
		stringbuilder.append(a);
	//    7   13:aload_3         
	//    8   14:aload_0         
	//    9   15:getfield        #25  <Field String a>
	//   10   18:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(".");
	//   12   22:aload_3         
	//   13   23:ldc1            #42  <String ".">
	//   14   25:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   15   28:pop             
		stringbuilder.append(i);
	//   16   29:aload_3         
	//   17   30:iload_1         
	//   18   31:invokevirtual   #45  <Method StringBuilder StringBuilder.append(int)>
	//   19   34:pop             
		return new File(file, stringbuilder.toString());
	//   20   35:new             #47  <Class File>
	//   21   38:dup             
	//   22   39:aload_2         
	//   23   40:aload_3         
	//   24   41:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   25   44:invokespecial   #54  <Method void File(File, String)>
	//   26   47:areturn         
	}

	public String a()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #35  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void StringBuilder()>
	//    3    7:astore          5
		long al[] = b;
	//    4    9:aload_0         
	//    5   10:getfield        #31  <Field long[] b>
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
	//*  14   23:icmpge          53
		{
			long l = al[i];
	//   15   26:aload           6
	//   16   28:iload_1         
	//   17   29:laload          
	//   18   30:lstore_3        
			stringbuilder.append(' ');
	//   19   31:aload           5
	//   20   33:bipush          32
	//   21   35:invokevirtual   #57  <Method StringBuilder StringBuilder.append(char)>
	//   22   38:pop             
			stringbuilder.append(l);
	//   23   39:aload           5
	//   24   41:lload_3         
	//   25   42:invokevirtual   #60  <Method StringBuilder StringBuilder.append(long)>
	//   26   45:pop             
		}

	//   27   46:iload_1         
	//   28   47:iconst_1        
	//   29   48:iadd            
	//   30   49:istore_1        
	//*  31   50:goto            21
		return stringbuilder.toString();
	//   32   53:aload           5
	//   33   55:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   34   58:areturn         
	}

	void a(String as[])
	{
		NumberFormatException numberformatexception;
		if(as.length == f)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:aload_0         
	//*   3    3:getfield        #27  <Field int f>
	//*   4    6:icmpne          43
		{
			int i = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
			do
			{
				try
				{
					if(i >= as.length)
						break;
	//    7   11:iload_2         
	//    8   12:aload_1         
	//    9   13:arraylength     
	//   10   14:icmpge          36
					b[i] = Long.parseLong(as[i]);
	//   11   17:aload_0         
	//   12   18:getfield        #31  <Field long[] b>
	//   13   21:iload_2         
	//   14   22:aload_1         
	//   15   23:iload_2         
	//   16   24:aaload          
	//   17   25:invokestatic    #69  <Method long Long.parseLong(String)>
	//   18   28:lastore         
				}
	//*  19   29:iload_2         
	//*  20   30:iconst_1        
	//*  21   31:iadd            
	//*  22   32:istore_2        
	//*  23   33:goto            11
	//*  24   36:return          
	//*  25   37:aload_0         
	//*  26   38:aload_1         
	//*  27   39:invokevirtual   #72  <Method IOException b(String[])>
	//*  28   42:athrow          
	//*  29   43:aload_0         
	//*  30   44:aload_1         
	//*  31   45:invokevirtual   #72  <Method IOException b(String[])>
	//*  32   48:athrow          
				// Misplaced declaration of an exception variable
				catch(NumberFormatException numberformatexception)
				{
					throw b(as);
				}
				i++;
			} while(true);
			return;
		} else
		{
			throw b(as);
		}
	//*  33   49:astore_3        
	//*  34   50:goto            37
	}

	public File b(int i)
	{
		File file = g;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field File g>
	//    2    4:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #35  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #36  <Method void StringBuilder()>
	//    6   12:astore_3        
		stringbuilder.append(a);
	//    7   13:aload_3         
	//    8   14:aload_0         
	//    9   15:getfield        #25  <Field String a>
	//   10   18:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(".");
	//   12   22:aload_3         
	//   13   23:ldc1            #42  <String ".">
	//   14   25:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   15   28:pop             
		stringbuilder.append(i);
	//   16   29:aload_3         
	//   17   30:iload_1         
	//   18   31:invokevirtual   #45  <Method StringBuilder StringBuilder.append(int)>
	//   19   34:pop             
		stringbuilder.append(".tmp");
	//   20   35:aload_3         
	//   21   36:ldc1            #74  <String ".tmp">
	//   22   38:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   23   41:pop             
		return new File(file, stringbuilder.toString());
	//   24   42:new             #47  <Class File>
	//   25   45:dup             
	//   26   46:aload_2         
	//   27   47:aload_3         
	//   28   48:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   29   51:invokespecial   #54  <Method void File(File, String)>
	//   30   54:areturn         
	}

	IOException b(String as[])
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #35  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("unexpected journal line: ");
	//    4    8:aload_2         
	//    5    9:ldc1            #76  <String "unexpected journal line: ">
	//    6   11:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(Arrays.toString(((Object []) (as))));
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokestatic    #81  <Method String Arrays.toString(Object[])>
	//   11   20:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		throw new IOException(stringbuilder.toString());
	//   13   24:new             #83  <Class IOException>
	//   14   27:dup             
	//   15   28:aload_2         
	//   16   29:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   17   32:invokespecial   #86  <Method void IOException(String)>
	//   18   35:athrow          
	}

	final String a;
	final long b[];
	boolean c;
	be.a d;
	long e;
	private int f;
	private File g;
}
