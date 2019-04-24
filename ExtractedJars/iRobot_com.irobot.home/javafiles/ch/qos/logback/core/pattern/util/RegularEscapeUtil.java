// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.pattern.util;


// Referenced classes of package ch.qos.logback.core.pattern.util:
//			IEscapeUtil

public class RegularEscapeUtil
	implements IEscapeUtil
{

	public RegularEscapeUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public static String basicEscape(String s)
	{
		int l = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #19  <Method int String.length()>
	//    2    4:istore          6
		StringBuffer stringbuffer = new StringBuffer(l);
	//    3    6:new             #21  <Class StringBuffer>
	//    4    9:dup             
	//    5   10:iload           6
	//    6   12:invokespecial   #24  <Method void StringBuffer(int)>
	//    7   15:astore          7
		char c;
		for(int i = 0; i < l; stringbuffer.append(c))
	//*   8   17:iconst_0        
	//*   9   18:istore_3        
	//*  10   19:iload_3         
	//*  11   20:iload           6
	//*  12   22:icmpge          133
		{
			int j = i + 1;
	//   13   25:iload_3         
	//   14   26:iconst_1        
	//   15   27:iadd            
	//   16   28:istore          4
			c = s.charAt(i);
	//   17   30:aload_0         
	//   18   31:iload_3         
	//   19   32:invokevirtual   #28  <Method char String.charAt(int)>
	//   20   35:istore_1        
			if(c == '\\')
	//*  21   36:iload_1         
	//*  22   37:bipush          92
	//*  23   39:icmpne          120
			{
				int k = j + 1;
	//   24   42:iload           4
	//   25   44:iconst_1        
	//   26   45:iadd            
	//   27   46:istore          5
				char c1 = s.charAt(j);
	//   28   48:aload_0         
	//   29   49:iload           4
	//   30   51:invokevirtual   #28  <Method char String.charAt(int)>
	//   31   54:istore_2        
				if(c1 == 'n')
	//*  32   55:iload_2         
	//*  33   56:bipush          110
	//*  34   58:icmpne          70
				{
					c = '\n';
	//   35   61:bipush          10
	//   36   63:istore_1        
					i = k;
	//   37   64:iload           5
	//   38   66:istore_3        
					continue;
	//   39   67:goto            123
				}
				if(c1 == 'r')
	//*  40   70:iload_2         
	//*  41   71:bipush          114
	//*  42   73:icmpne          85
				{
					c = '\r';
	//   43   76:bipush          13
	//   44   78:istore_1        
					i = k;
	//   45   79:iload           5
	//   46   81:istore_3        
					continue;
	//   47   82:goto            123
				}
				if(c1 == 't')
	//*  48   85:iload_2         
	//*  49   86:bipush          116
	//*  50   88:icmpne          100
				{
					c = '\t';
	//   51   91:bipush          9
	//   52   93:istore_1        
					i = k;
	//   53   94:iload           5
	//   54   96:istore_3        
					continue;
	//   55   97:goto            123
				}
				i = k;
	//   56  100:iload           5
	//   57  102:istore_3        
				c = c1;
	//   58  103:iload_2         
	//   59  104:istore_1        
				if(c1 == 'f')
	//*  60  105:iload_2         
	//*  61  106:bipush          102
	//*  62  108:icmpne          123
				{
					c = '\f';
	//   63  111:bipush          12
	//   64  113:istore_1        
					i = k;
	//   65  114:iload           5
	//   66  116:istore_3        
				}
			} else
	//*  67  117:goto            123
			{
				i = j;
	//   68  120:iload           4
	//   69  122:istore_3        
			}
		}

	//   70  123:aload           7
	//   71  125:iload_1         
	//   72  126:invokevirtual   #32  <Method StringBuffer StringBuffer.append(char)>
	//   73  129:pop             
	//*  74  130:goto            19
		return stringbuffer.toString();
	//   75  133:aload           7
	//   76  135:invokevirtual   #36  <Method String StringBuffer.toString()>
	//   77  138:areturn         
	}

	public void escape(String s, StringBuffer stringbuffer, char c, int i)
	{
		while(s.indexOf(((int) (c))) >= 0 || c == '\\') 
	//*   0    0:aload_1         
	//*   1    1:iload_3         
	//*   2    2:invokevirtual   #42  <Method int String.indexOf(int)>
	//*   3    5:iflt            15
		{
			stringbuffer.append(c);
	//    4    8:aload_2         
	//    5    9:iload_3         
	//    6   10:invokevirtual   #32  <Method StringBuffer StringBuffer.append(char)>
	//    7   13:pop             
			return;
	//    8   14:return          
		}
	//    9   15:iload_3         
	//   10   16:bipush          92
	//   11   18:icmpeq          8
		if(c != '_')
	//*  12   21:iload_3         
	//*  13   22:bipush          95
	//*  14   24:icmpeq          139
		{
			if(c != 'n')
	//*  15   27:iload_3         
	//*  16   28:bipush          110
	//*  17   30:icmpeq          130
			{
				if(c != 'r')
	//*  18   33:iload_3         
	//*  19   34:bipush          114
	//*  20   36:icmpeq          124
				{
					if(c != 't')
	//*  21   39:iload_3         
	//*  22   40:bipush          116
	//*  23   42:icmpeq          118
					{
						s = formatEscapeCharsForListing(s);
	//   24   45:aload_0         
	//   25   46:aload_1         
	//   26   47:invokevirtual   #45  <Method String formatEscapeCharsForListing(String)>
	//   27   50:astore_1        
						stringbuffer = ((StringBuffer) (new StringBuilder()));
	//   28   51:new             #47  <Class StringBuilder>
	//   29   54:dup             
	//   30   55:invokespecial   #48  <Method void StringBuilder()>
	//   31   58:astore_2        
						((StringBuilder) (stringbuffer)).append("Illegal char '");
	//   32   59:aload_2         
	//   33   60:ldc1            #50  <String "Illegal char '">
	//   34   62:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   35   65:pop             
						((StringBuilder) (stringbuffer)).append(c);
	//   36   66:aload_2         
	//   37   67:iload_3         
	//   38   68:invokevirtual   #56  <Method StringBuilder StringBuilder.append(char)>
	//   39   71:pop             
						((StringBuilder) (stringbuffer)).append(" at column ");
	//   40   72:aload_2         
	//   41   73:ldc1            #58  <String " at column ">
	//   42   75:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
						((StringBuilder) (stringbuffer)).append(i);
	//   44   79:aload_2         
	//   45   80:iload           4
	//   46   82:invokevirtual   #61  <Method StringBuilder StringBuilder.append(int)>
	//   47   85:pop             
						((StringBuilder) (stringbuffer)).append(". Only \\\\, \\_");
	//   48   86:aload_2         
	//   49   87:ldc1            #63  <String ". Only \\\\, \\_">
	//   50   89:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   51   92:pop             
						((StringBuilder) (stringbuffer)).append(s);
	//   52   93:aload_2         
	//   53   94:aload_1         
	//   54   95:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   55   98:pop             
						((StringBuilder) (stringbuffer)).append(", \\t, \\n, \\r combinations are allowed as escape characters.");
	//   56   99:aload_2         
	//   57  100:ldc1            #65  <String ", \\t, \\n, \\r combinations are allowed as escape characters.">
	//   58  102:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   59  105:pop             
						throw new IllegalArgumentException(((StringBuilder) (stringbuffer)).toString());
	//   60  106:new             #67  <Class IllegalArgumentException>
	//   61  109:dup             
	//   62  110:aload_2         
	//   63  111:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   64  114:invokespecial   #71  <Method void IllegalArgumentException(String)>
	//   65  117:athrow          
					}
					c = '\t';
	//   66  118:bipush          9
	//   67  120:istore_3        
				} else
	//*  68  121:goto            133
				{
					c = '\r';
	//   69  124:bipush          13
	//   70  126:istore_3        
				}
			} else
	//*  71  127:goto            133
			{
				c = '\n';
	//   72  130:bipush          10
	//   73  132:istore_3        
			}
			stringbuffer.append(c);
	//   74  133:aload_2         
	//   75  134:iload_3         
	//   76  135:invokevirtual   #32  <Method StringBuffer StringBuffer.append(char)>
	//   77  138:pop             
		}
	//   78  139:return          
	}

	String formatEscapeCharsForListing(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #47  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void StringBuilder()>
	//    3    7:astore_3        
		for(int i = 0; i < s.length(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #19  <Method int String.length()>
	//*   9   15:icmpge          42
		{
			stringbuilder.append(", \\");
	//   10   18:aload_3         
	//   11   19:ldc1            #73  <String ", \\">
	//   12   21:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   13   24:pop             
			stringbuilder.append(s.charAt(i));
	//   14   25:aload_3         
	//   15   26:aload_1         
	//   16   27:iload_2         
	//   17   28:invokevirtual   #28  <Method char String.charAt(int)>
	//   18   31:invokevirtual   #56  <Method StringBuilder StringBuilder.append(char)>
	//   19   34:pop             
		}

	//   20   35:iload_2         
	//   21   36:iconst_1        
	//   22   37:iadd            
	//   23   38:istore_2        
	//*  24   39:goto            10
		return stringbuilder.toString();
	//   25   42:aload_3         
	//   26   43:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   27   46:areturn         
	}
}
