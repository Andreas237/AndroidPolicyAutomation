// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			ev

static class ev$a
{

	public char a(int i, boolean flag)
	{
		int j = a.length();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String a>
	//    2    4:invokevirtual   #35  <Method int String.length()>
	//    3    7:istore_3        
		if(flag)
	//*   4    8:iload_2         
	//*   5    9:ifeq            19
			i = j - i;
	//    6   12:iload_3         
	//    7   13:iload_1         
	//    8   14:isub            
	//    9   15:istore_1        
	//*  10   16:goto            19
		return a.charAt(i);
	//   11   19:aload_0         
	//   12   20:getfield        #40  <Field String a>
	//   13   23:iload_1         
	//   14   24:invokevirtual   #45  <Method char String.charAt(int)>
	//   15   27:ireturn         
	}

	public int a(char c1, boolean flag)
	{
		int i = a.length();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String a>
	//    2    4:invokevirtual   #35  <Method int String.length()>
	//    3    7:istore_3        
		c1 = ((char) (a.indexOf(((int) (c1)))));
	//    4    8:aload_0         
	//    5    9:getfield        #40  <Field String a>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #50  <Method int String.indexOf(int)>
	//    8   16:istore_1        
		if(flag)
	//*   9   17:iload_2         
	//*  10   18:ifeq            25
			return i - c1;
	//   11   21:iload_3         
	//   12   22:iload_1         
	//   13   23:isub            
	//   14   24:ireturn         
		else
			return ((int) (c1));
	//   15   25:iload_1         
	//   16   26:ireturn         
	}

	public int a(int i)
	{
		long l = i;
	//    0    0:iload_1         
	//    1    1:i2l             
	//    2    2:lstore_2        
		return (int)((long)b * l + (long)c & 0x7fffffffL);
	//    3    3:aload_0         
	//    4    4:getfield        #27  <Field int b>
	//    5    7:i2l             
	//    6    8:lload_2         
	//    7    9:lmul            
	//    8   10:aload_0         
	//    9   11:getfield        #29  <Field int c>
	//   10   14:i2l             
	//   11   15:ladd            
	//   12   16:ldc2w           #51  <Long 0x7fffffffL>
	//   13   19:land            
	//   14   20:l2i             
	//   15   21:ireturn         
	}

	public String a(int i, String s)
	{
		return a(false, i, s);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iload_1         
	//    3    3:aload_2         
	//    4    4:invokevirtual   #56  <Method String a(boolean, int, String)>
	//    5    7:areturn         
	}

	public String a(String s, int i, int j)
	{
		StringBuffer stringbuffer = new StringBuffer(s);
	//    0    0:new             #58  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #61  <Method void StringBuffer(String)>
	//    4    8:astore          9
		int i1 = s.length();
	//    5   10:aload_1         
	//    6   11:invokevirtual   #35  <Method int String.length()>
	//    7   14:istore          7
		boolean flag = false;
	//    8   16:iconst_0        
	//    9   17:istore          6
		int k = i;
	//   10   19:iload_2         
	//   11   20:istore          5
		for(i = ((int) (flag)); i < j; i++)
	//*  12   22:iload           6
	//*  13   24:istore_2        
	//*  14   25:iload_2         
	//*  15   26:iload_3         
	//*  16   27:icmpge          99
		{
			k = a(k);
	//   17   30:aload_0         
	//   18   31:iload           5
	//   19   33:invokevirtual   #63  <Method int a(int)>
	//   20   36:istore          5
			int l = k % i1;
	//   21   38:iload           5
	//   22   40:iload           7
	//   23   42:irem            
	//   24   43:istore          6
			k = a(k);
	//   25   45:aload_0         
	//   26   46:iload           5
	//   27   48:invokevirtual   #63  <Method int a(int)>
	//   28   51:istore          5
			int j1 = k % i1;
	//   29   53:iload           5
	//   30   55:iload           7
	//   31   57:irem            
	//   32   58:istore          8
			char c1 = stringbuffer.charAt(l);
	//   33   60:aload           9
	//   34   62:iload           6
	//   35   64:invokevirtual   #64  <Method char StringBuffer.charAt(int)>
	//   36   67:istore          4
			stringbuffer.setCharAt(l, stringbuffer.charAt(j1));
	//   37   69:aload           9
	//   38   71:iload           6
	//   39   73:aload           9
	//   40   75:iload           8
	//   41   77:invokevirtual   #64  <Method char StringBuffer.charAt(int)>
	//   42   80:invokevirtual   #68  <Method void StringBuffer.setCharAt(int, char)>
			stringbuffer.setCharAt(j1, c1);
	//   43   83:aload           9
	//   44   85:iload           8
	//   45   87:iload           4
	//   46   89:invokevirtual   #68  <Method void StringBuffer.setCharAt(int, char)>
		}

	//   47   92:iload_2         
	//   48   93:iconst_1        
	//   49   94:iadd            
	//   50   95:istore_2        
	//*  51   96:goto            25
		return stringbuffer.toString();
	//   52   99:aload           9
	//   53  101:invokevirtual   #72  <Method String StringBuffer.toString()>
	//   54  104:areturn         
	}

	public String a(boolean flag, int i, String s)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          8
		StringBuilder stringbuilder = new StringBuilder();
	//    2    3:new             #74  <Class StringBuilder>
	//    3    6:dup             
	//    4    7:invokespecial   #75  <Method void StringBuilder()>
	//    5   10:astore          9
		int k = a.length();
	//    6   12:aload_0         
	//    7   13:getfield        #40  <Field String a>
	//    8   16:invokevirtual   #35  <Method int String.length()>
	//    9   19:istore          5
		int l = s.length();
	//   10   21:aload_3         
	//   11   22:invokevirtual   #35  <Method int String.length()>
	//   12   25:istore          6
		int j = 0;
	//   13   27:iconst_0        
	//   14   28:istore          4
		do
		{
			if(j >= l)
				break;
	//   15   30:iload           4
	//   16   32:iload           6
	//   17   34:icmpge          88
			int i1 = a(s.charAt(j), flag);
	//   18   37:aload_0         
	//   19   38:aload_3         
	//   20   39:iload           4
	//   21   41:invokevirtual   #45  <Method char String.charAt(int)>
	//   22   44:iload_1         
	//   23   45:invokevirtual   #77  <Method int a(char, boolean)>
	//   24   48:istore          7
			if(i1 < 0)
	//*  25   50:iload           7
	//*  26   52:ifge            58
				break;
	//   27   55:goto            88
			stringbuilder.append(a((i1 + i + j) % k, flag));
	//   28   58:aload           9
	//   29   60:aload_0         
	//   30   61:iload           7
	//   31   63:iload_2         
	//   32   64:iadd            
	//   33   65:iload           4
	//   34   67:iadd            
	//   35   68:iload           5
	//   36   70:irem            
	//   37   71:iload_1         
	//   38   72:invokevirtual   #79  <Method char a(int, boolean)>
	//   39   75:invokevirtual   #83  <Method StringBuilder StringBuilder.append(char)>
	//   40   78:pop             
			j++;
	//   41   79:iload           4
	//   42   81:iconst_1        
	//   43   82:iadd            
	//   44   83:istore          4
		} while(true);
	//   45   85:goto            30
		s = ((String) (obj));
	//   46   88:aload           8
	//   47   90:astore_3        
		if(stringbuilder.length() == l)
	//*  48   91:aload           9
	//*  49   93:invokevirtual   #84  <Method int StringBuilder.length()>
	//*  50   96:iload           6
	//*  51   98:icmpne          107
			s = stringbuilder.toString();
	//   52  101:aload           9
	//   53  103:invokevirtual   #85  <Method String StringBuilder.toString()>
	//   54  106:astore_3        
		return s;
	//   55  107:aload_3         
	//   56  108:areturn         
	}

	private String a;
	private int b;
	private int c;

	public ev$a()
	{
		this(11);
	//    0    0:aload_0         
	//    1    1:bipush          11
	//    2    3:invokespecial   #16  <Method void ev$a(int)>
	//    3    6:return          
	}

	public ev$a(int i)
	{
		this("ABCDEFGHIJKLMNOPQRSTUVWXYZ", i);
	//    0    0:aload_0         
	//    1    1:ldc1            #19  <String "ABCDEFGHIJKLMNOPQRSTUVWXYZ">
	//    2    3:iload_1         
	//    3    4:invokespecial   #22  <Method void ev$a(String, int)>
	//    4    7:return          
	}

	public ev$a(String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		b = 0x41c64e6d;
	//    2    4:aload_0         
	//    3    5:ldc1            #25  <Int 0x41c64e6d>
	//    4    7:putfield        #27  <Field int b>
		c = 12345;
	//    5   10:aload_0         
	//    6   11:sipush          12345
	//    7   14:putfield        #29  <Field int c>
		a = a(s, i, s.length());
	//    8   17:aload_0         
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:iload_2         
	//   12   21:aload_1         
	//   13   22:invokevirtual   #35  <Method int String.length()>
	//   14   25:invokevirtual   #38  <Method String a(String, int, int)>
	//   15   28:putfield        #40  <Field String a>
	//   16   31:return          
	}
}
