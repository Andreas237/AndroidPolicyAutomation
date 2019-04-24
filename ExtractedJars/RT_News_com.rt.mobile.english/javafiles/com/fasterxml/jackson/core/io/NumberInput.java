// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.io;

import java.math.BigDecimal;

public final class NumberInput
{

	public NumberInput()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
	//    2    4:return          
	}

	private static NumberFormatException _badBD(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #42  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #43  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Value \"");
	//    4    8:aload_1         
	//    5    9:ldc1            #45  <String "Value \"">
	//    6   11:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(s);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		stringbuilder.append("\" can not be represented as BigDecimal");
	//   12   21:aload_1         
	//   13   22:ldc1            #51  <String "\" can not be represented as BigDecimal">
	//   14   24:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		return new NumberFormatException(stringbuilder.toString());
	//   16   28:new             #53  <Class NumberFormatException>
	//   17   31:dup             
	//   18   32:aload_1         
	//   19   33:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   20   36:invokespecial   #60  <Method void NumberFormatException(String)>
	//   21   39:areturn         
	}

	public static boolean inLongRange(String s, boolean flag)
	{
		String s1;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            12
			s1 = MIN_LONG_STR_NO_SIGN;
	//    2    4:getstatic       #30  <Field String MIN_LONG_STR_NO_SIGN>
	//    3    7:astore          5
		else
	//*   4    9:goto            17
			s1 = MAX_LONG_STR;
	//    5   12:getstatic       #34  <Field String MAX_LONG_STR>
	//    6   15:astore          5
		int k = s1.length();
	//    7   17:aload           5
	//    8   19:invokevirtual   #66  <Method int String.length()>
	//    9   22:istore_3        
		int i = s.length();
	//   10   23:aload_0         
	//   11   24:invokevirtual   #66  <Method int String.length()>
	//   12   27:istore_2        
		if(i < k)
	//*  13   28:iload_2         
	//*  14   29:iload_3         
	//*  15   30:icmpge          35
			return true;
	//   16   33:iconst_1        
	//   17   34:ireturn         
		if(i > k)
	//*  18   35:iload_2         
	//*  19   36:iload_3         
	//*  20   37:icmple          42
			return false;
	//   21   40:iconst_0        
	//   22   41:ireturn         
		for(int j = 0; j < k; j++)
	//*  23   42:iconst_0        
	//*  24   43:istore_2        
	//*  25   44:iload_2         
	//*  26   45:iload_3         
	//*  27   46:icmpge          84
		{
			int l = s.charAt(j) - s1.charAt(j);
	//   28   49:aload_0         
	//   29   50:iload_2         
	//   30   51:invokevirtual   #70  <Method char String.charAt(int)>
	//   31   54:aload           5
	//   32   56:iload_2         
	//   33   57:invokevirtual   #70  <Method char String.charAt(int)>
	//   34   60:isub            
	//   35   61:istore          4
			if(l != 0)
	//*  36   63:iload           4
	//*  37   65:ifeq            77
				return l < 0;
	//   38   68:iload           4
	//   39   70:ifge            75
	//   40   73:iconst_1        
	//   41   74:ireturn         
	//   42   75:iconst_0        
	//   43   76:ireturn         
		}

	//   44   77:iload_2         
	//   45   78:iconst_1        
	//   46   79:iadd            
	//   47   80:istore_2        
	//*  48   81:goto            44
		return true;
	//   49   84:iconst_1        
	//   50   85:ireturn         
	}

	public static boolean inLongRange(char ac[], int i, int j, boolean flag)
	{
		String s;
		if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            12
			s = MIN_LONG_STR_NO_SIGN;
	//    2    4:getstatic       #30  <Field String MIN_LONG_STR_NO_SIGN>
	//    3    7:astore          6
		else
	//*   4    9:goto            17
			s = MAX_LONG_STR;
	//    5   12:getstatic       #34  <Field String MAX_LONG_STR>
	//    6   15:astore          6
		int k = s.length();
	//    7   17:aload           6
	//    8   19:invokevirtual   #66  <Method int String.length()>
	//    9   22:istore          4
		if(j < k)
	//*  10   24:iload_2         
	//*  11   25:iload           4
	//*  12   27:icmpge          32
			return true;
	//   13   30:iconst_1        
	//   14   31:ireturn         
		if(j > k)
	//*  15   32:iload_2         
	//*  16   33:iload           4
	//*  17   35:icmple          40
			return false;
	//   18   38:iconst_0        
	//   19   39:ireturn         
		for(j = 0; j < k; j++)
	//*  20   40:iconst_0        
	//*  21   41:istore_2        
	//*  22   42:iload_2         
	//*  23   43:iload           4
	//*  24   45:icmpge          83
		{
			int l = ac[i + j] - s.charAt(j);
	//   25   48:aload_0         
	//   26   49:iload_1         
	//   27   50:iload_2         
	//   28   51:iadd            
	//   29   52:caload          
	//   30   53:aload           6
	//   31   55:iload_2         
	//   32   56:invokevirtual   #70  <Method char String.charAt(int)>
	//   33   59:isub            
	//   34   60:istore          5
			if(l != 0)
	//*  35   62:iload           5
	//*  36   64:ifeq            76
				return l < 0;
	//   37   67:iload           5
	//   38   69:ifge            74
	//   39   72:iconst_1        
	//   40   73:ireturn         
	//   41   74:iconst_0        
	//   42   75:ireturn         
		}

	//   43   76:iload_2         
	//   44   77:iconst_1        
	//   45   78:iadd            
	//   46   79:istore_2        
	//*  47   80:goto            42
		return true;
	//   48   83:iconst_1        
	//   49   84:ireturn         
	}

	public static double parseAsDouble(String s, double d)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return d;
	//    2    4:dload_1         
	//    3    5:dreturn         
		s = s.trim();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #76  <Method String String.trim()>
	//    6   10:astore_0        
		if(s.length() == 0)
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #66  <Method int String.length()>
	//*   9   15:ifne            20
			return d;
	//   10   18:dload_1         
	//   11   19:dreturn         
		double d1;
		try
		{
			d1 = parseDouble(s);
	//   12   20:aload_0         
	//   13   21:invokestatic    #80  <Method double parseDouble(String)>
	//   14   24:dstore_3        
		}
	//*  15   25:dload_3         
	//*  16   26:dreturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  17   27:astore_0        
		{
			return d;
	//   18   28:dload_1         
	//   19   29:dreturn         
		}
		return d1;
	}

	public static int parseAsInt(String s, int i)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return i;
	//    2    4:iload_1         
	//    3    5:ireturn         
		String s1 = s.trim();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #76  <Method String String.trim()>
	//    6   10:astore          9
		int i1 = s1.length();
	//    7   12:aload           9
	//    8   14:invokevirtual   #66  <Method int String.length()>
	//    9   17:istore          6
		if(i1 == 0)
	//*  10   19:iload           6
	//*  11   21:ifne            26
			return i;
	//   12   24:iload_1         
	//   13   25:ireturn         
		boolean flag = false;
	//   14   26:iconst_0        
	//   15   27:istore          7
		int l = i1;
	//   16   29:iload           6
	//   17   31:istore          5
		int j = ((int) (flag));
	//   18   33:iload           7
	//   19   35:istore          4
		s = s1;
	//   20   37:aload           9
	//   21   39:astore_0        
		if(i1 > 0)
	//*  22   40:iload           6
	//*  23   42:ifle            108
		{
			char c1 = s1.charAt(0);
	//   24   45:aload           9
	//   25   47:iconst_0        
	//   26   48:invokevirtual   #70  <Method char String.charAt(int)>
	//   27   51:istore          8
			if(c1 == '+')
	//*  28   53:iload           8
	//*  29   55:bipush          43
	//*  30   57:icmpne          80
			{
				s = s1.substring(1);
	//   31   60:aload           9
	//   32   62:iconst_1        
	//   33   63:invokevirtual   #28  <Method String String.substring(int)>
	//   34   66:astore_0        
				l = s.length();
	//   35   67:aload_0         
	//   36   68:invokevirtual   #66  <Method int String.length()>
	//   37   71:istore          5
				j = ((int) (flag));
	//   38   73:iload           7
	//   39   75:istore          4
			} else
	//*  40   77:goto            108
			{
				l = i1;
	//   41   80:iload           6
	//   42   82:istore          5
				j = ((int) (flag));
	//   43   84:iload           7
	//   44   86:istore          4
				s = s1;
	//   45   88:aload           9
	//   46   90:astore_0        
				if(c1 == '-')
	//*  47   91:iload           8
	//*  48   93:bipush          45
	//*  49   95:icmpne          108
				{
					j = 1;
	//   50   98:iconst_1        
	//   51   99:istore          4
					s = s1;
	//   52  101:aload           9
	//   53  103:astore_0        
					l = i1;
	//   54  104:iload           6
	//   55  106:istore          5
				}
			}
		}
		while(j < l) 
	//*  56  108:iload           4
	//*  57  110:iload           5
	//*  58  112:icmpge          157
		{
			char c = s.charAt(j);
	//   59  115:aload_0         
	//   60  116:iload           4
	//   61  118:invokevirtual   #70  <Method char String.charAt(int)>
	//   62  121:istore          6
			if(c <= '9' && c >= '0')
	//*  63  123:iload           6
	//*  64  125:bipush          57
	//*  65  127:icmpgt          149
	//*  66  130:iload           6
	//*  67  132:bipush          48
	//*  68  134:icmpge          140
	//*  69  137:goto            149
			{
				j++;
	//   70  140:iload           4
	//   71  142:iconst_1        
	//   72  143:iadd            
	//   73  144:istore          4
			} else
	//*  74  146:goto            108
			{
				double d;
				int k;
				try
				{
					d = parseDouble(s);
	//   75  149:aload_0         
	//   76  150:invokestatic    #80  <Method double parseDouble(String)>
	//   77  153:dstore_2        
				}
	//*  78  154:dload_2         
	//*  79  155:d2i             
	//*  80  156:ireturn         
	//*  81  157:aload_0         
	//*  82  158:invokestatic    #88  <Method int Integer.parseInt(String)>
	//*  83  161:istore          4
	//*  84  163:iload           4
	//*  85  165:ireturn         
				// Misplaced declaration of an exception variable
				catch(String s)
	//*  86  166:astore_0        
				{
					return i;
	//   87  167:iload_1         
	//   88  168:ireturn         
				}
				return (int)d;
			}
		}
		try
		{
			k = Integer.parseInt(s);
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  89  169:astore_0        
		{
			return i;
	//   90  170:iload_1         
	//   91  171:ireturn         
		}
		return k;
	}

	public static long parseAsLong(String s, long l)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return l;
	//    2    4:lload_1         
	//    3    5:lreturn         
		String s1 = s.trim();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #76  <Method String String.trim()>
	//    6   10:astore          12
		int k = s1.length();
	//    7   12:aload           12
	//    8   14:invokevirtual   #66  <Method int String.length()>
	//    9   17:istore          7
		if(k == 0)
	//*  10   19:iload           7
	//*  11   21:ifne            26
			return l;
	//   12   24:lload_1         
	//   13   25:lreturn         
		boolean flag = false;
	//   14   26:iconst_0        
	//   15   27:istore          8
		int j = k;
	//   16   29:iload           7
	//   17   31:istore          6
		int i = ((int) (flag));
	//   18   33:iload           8
	//   19   35:istore          5
		s = s1;
	//   20   37:aload           12
	//   21   39:astore_0        
		if(k > 0)
	//*  22   40:iload           7
	//*  23   42:ifle            108
		{
			char c1 = s1.charAt(0);
	//   24   45:aload           12
	//   25   47:iconst_0        
	//   26   48:invokevirtual   #70  <Method char String.charAt(int)>
	//   27   51:istore          9
			if(c1 == '+')
	//*  28   53:iload           9
	//*  29   55:bipush          43
	//*  30   57:icmpne          80
			{
				s = s1.substring(1);
	//   31   60:aload           12
	//   32   62:iconst_1        
	//   33   63:invokevirtual   #28  <Method String String.substring(int)>
	//   34   66:astore_0        
				j = s.length();
	//   35   67:aload_0         
	//   36   68:invokevirtual   #66  <Method int String.length()>
	//   37   71:istore          6
				i = ((int) (flag));
	//   38   73:iload           8
	//   39   75:istore          5
			} else
	//*  40   77:goto            108
			{
				j = k;
	//   41   80:iload           7
	//   42   82:istore          6
				i = ((int) (flag));
	//   43   84:iload           8
	//   44   86:istore          5
				s = s1;
	//   45   88:aload           12
	//   46   90:astore_0        
				if(c1 == '-')
	//*  47   91:iload           9
	//*  48   93:bipush          45
	//*  49   95:icmpne          108
				{
					i = 1;
	//   50   98:iconst_1        
	//   51   99:istore          5
					s = s1;
	//   52  101:aload           12
	//   53  103:astore_0        
					j = k;
	//   54  104:iload           7
	//   55  106:istore          6
				}
			}
		}
		while(i < j) 
	//*  56  108:iload           5
	//*  57  110:iload           6
	//*  58  112:icmpge          157
		{
			char c = s.charAt(i);
	//   59  115:aload_0         
	//   60  116:iload           5
	//   61  118:invokevirtual   #70  <Method char String.charAt(int)>
	//   62  121:istore          7
			if(c <= '9' && c >= '0')
	//*  63  123:iload           7
	//*  64  125:bipush          57
	//*  65  127:icmpgt          149
	//*  66  130:iload           7
	//*  67  132:bipush          48
	//*  68  134:icmpge          140
	//*  69  137:goto            149
			{
				i++;
	//   70  140:iload           5
	//   71  142:iconst_1        
	//   72  143:iadd            
	//   73  144:istore          5
			} else
	//*  74  146:goto            108
			{
				double d;
				long l1;
				try
				{
					d = parseDouble(s);
	//   75  149:aload_0         
	//   76  150:invokestatic    #80  <Method double parseDouble(String)>
	//   77  153:dstore_3        
				}
	//*  78  154:dload_3         
	//*  79  155:d2l             
	//*  80  156:lreturn         
	//*  81  157:aload_0         
	//*  82  158:invokestatic    #96  <Method long Long.parseLong(String)>
	//*  83  161:lstore          10
	//*  84  163:lload           10
	//*  85  165:lreturn         
				// Misplaced declaration of an exception variable
				catch(String s)
	//*  86  166:astore_0        
				{
					return l;
	//   87  167:lload_1         
	//   88  168:lreturn         
				}
				return (long)d;
			}
		}
		try
		{
			l1 = Long.parseLong(s);
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  89  169:astore_0        
		{
			return l;
	//   90  170:lload_1         
	//   91  171:lreturn         
		}
		return l1;
	}

	public static BigDecimal parseBigDecimal(String s)
		throws NumberFormatException
	{
		NumberFormatException numberformatexception;
		BigDecimal bigdecimal;
		try
		{
			bigdecimal = new BigDecimal(s);
	//    0    0:new             #100 <Class BigDecimal>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #101 <Method void BigDecimal(String)>
	//    4    8:astore_1        
		}
	//*   5    9:aload_1         
	//*   6   10:areturn         
	//*   7   11:aload_0         
	//*   8   12:invokestatic    #103 <Method NumberFormatException _badBD(String)>
	//*   9   15:athrow          
		// Misplaced declaration of an exception variable
		catch(NumberFormatException numberformatexception)
		{
			throw _badBD(s);
		}
		return bigdecimal;
	//*  10   16:astore_1        
	//*  11   17:goto            11
	}

	public static BigDecimal parseBigDecimal(char ac[])
		throws NumberFormatException
	{
		return parseBigDecimal(ac, 0, ac.length);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:arraylength     
	//    4    4:invokestatic    #108 <Method BigDecimal parseBigDecimal(char[], int, int)>
	//    5    7:areturn         
	}

	public static BigDecimal parseBigDecimal(char ac[], int i, int j)
		throws NumberFormatException
	{
		NumberFormatException numberformatexception;
		BigDecimal bigdecimal;
		try
		{
			bigdecimal = new BigDecimal(ac, i, j);
	//    0    0:new             #100 <Class BigDecimal>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #111 <Method void BigDecimal(char[], int, int)>
	//    6   10:astore_3        
		}
	//*   7   11:aload_3         
	//*   8   12:areturn         
	//*   9   13:new             #20  <Class String>
	//*  10   16:dup             
	//*  11   17:aload_0         
	//*  12   18:iload_1         
	//*  13   19:iload_2         
	//*  14   20:invokespecial   #112 <Method void String(char[], int, int)>
	//*  15   23:invokestatic    #103 <Method NumberFormatException _badBD(String)>
	//*  16   26:athrow          
		// Misplaced declaration of an exception variable
		catch(NumberFormatException numberformatexception)
		{
			throw _badBD(new String(ac, i, j));
		}
		return bigdecimal;
	//*  17   27:astore_3        
	//*  18   28:goto            13
	}

	public static double parseDouble(String s)
		throws NumberFormatException
	{
		if("2.2250738585072012e-308".equals(((Object) (s))))
	//*   0    0:ldc1            #14  <String "2.2250738585072012e-308">
	//*   1    2:aload_0         
	//*   2    3:invokevirtual   #116 <Method boolean String.equals(Object)>
	//*   3    6:ifeq            13
			return 4.9406564584124654E-324D;
	//    4    9:ldc2w           #117 <Double 4.9406564584124654E-324D>
	//    5   12:dreturn         
		else
			return Double.parseDouble(s);
	//    6   13:aload_0         
	//    7   14:invokestatic    #121 <Method double Double.parseDouble(String)>
	//    8   17:dreturn         
	}

	public static int parseInt(String s)
	{
label0:
		{
			int i;
			boolean flag;
label1:
			{
				flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
				i = ((int) (s.charAt(0)));
	//    2    2:aload_0         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #70  <Method char String.charAt(int)>
	//    5    7:istore_1        
				int j1 = s.length();
	//    6    8:aload_0         
	//    7    9:invokevirtual   #66  <Method int String.length()>
	//    8   12:istore          5
				byte byte0 = 1;
	//    9   14:iconst_1        
	//   10   15:istore_3        
				if(i == '-')
	//*  11   16:iload_1         
	//*  12   17:bipush          45
	//*  13   19:icmpne          24
					flag = true;
	//   14   22:iconst_1        
	//   15   23:istore_2        
				if(flag)
	//*  16   24:iload_2         
	//*  17   25:ifeq            60
				{
					if(j1 != 1 && j1 <= 10)
	//*  18   28:iload           5
	//*  19   30:iconst_1        
	//*  20   31:icmpeq          55
	//*  21   34:iload           5
	//*  22   36:bipush          10
	//*  23   38:icmple          44
	//*  24   41:goto            55
					{
						i = ((int) (s.charAt(1)));
	//   25   44:aload_0         
	//   26   45:iconst_1        
	//   27   46:invokevirtual   #70  <Method char String.charAt(int)>
	//   28   49:istore_1        
						byte0 = 2;
	//   29   50:iconst_2        
	//   30   51:istore_3        
					} else
	//*  31   52:goto            72
					{
						return Integer.parseInt(s);
	//   32   55:aload_0         
	//   33   56:invokestatic    #88  <Method int Integer.parseInt(String)>
	//   34   59:ireturn         
					}
				} else
				if(j1 > 9)
	//*  35   60:iload           5
	//*  36   62:bipush          9
	//*  37   64:icmple          72
					return Integer.parseInt(s);
	//   38   67:aload_0         
	//   39   68:invokestatic    #88  <Method int Integer.parseInt(String)>
	//   40   71:ireturn         
				if(i > '9' || i < '0')
	//*  41   72:iload_1         
	//*  42   73:bipush          57
	//*  43   75:icmpgt          279
	//*  44   78:iload_1         
	//*  45   79:bipush          48
	//*  46   81:icmpge          87
					break label0;
	//   47   84:goto            279
				int i1 = i - 48;
	//   48   87:iload_1         
	//   49   88:bipush          48
	//   50   90:isub            
	//   51   91:istore          4
				i = i1;
	//   52   93:iload           4
	//   53   95:istore_1        
				if(byte0 >= j1)
					break label1;
	//   54   96:iload_3         
	//   55   97:iload           5
	//   56   99:icmpge          268
				int k1 = byte0 + 1;
	//   57  102:iload_3         
	//   58  103:iconst_1        
	//   59  104:iadd            
	//   60  105:istore          6
				i = ((int) (s.charAt(((int) (byte0)))));
	//   61  107:aload_0         
	//   62  108:iload_3         
	//   63  109:invokevirtual   #70  <Method char String.charAt(int)>
	//   64  112:istore_1        
				if(i <= 57 && i >= 48)
	//*  65  113:iload_1         
	//*  66  114:bipush          57
	//*  67  116:icmpgt          263
	//*  68  119:iload_1         
	//*  69  120:bipush          48
	//*  70  122:icmpge          128
	//*  71  125:goto            263
				{
					int j = i1 * 10 + (i - 48);
	//   72  128:iload           4
	//   73  130:bipush          10
	//   74  132:imul            
	//   75  133:iload_1         
	//   76  134:bipush          48
	//   77  136:isub            
	//   78  137:iadd            
	//   79  138:istore_3        
					i = j;
	//   80  139:iload_3         
	//   81  140:istore_1        
					if(k1 >= j1)
						break label1;
	//   82  141:iload           6
	//   83  143:iload           5
	//   84  145:icmpge          268
					i1 = k1 + 1;
	//   85  148:iload           6
	//   86  150:iconst_1        
	//   87  151:iadd            
	//   88  152:istore          4
					i = ((int) (s.charAt(k1)));
	//   89  154:aload_0         
	//   90  155:iload           6
	//   91  157:invokevirtual   #70  <Method char String.charAt(int)>
	//   92  160:istore_1        
					if(i <= 57 && i >= 48)
	//*  93  161:iload_1         
	//*  94  162:bipush          57
	//*  95  164:icmpgt          258
	//*  96  167:iload_1         
	//*  97  168:bipush          48
	//*  98  170:icmpge          176
	//*  99  173:goto            258
					{
						j = j * 10 + (i - 48);
	//  100  176:iload_3         
	//  101  177:bipush          10
	//  102  179:imul            
	//  103  180:iload_1         
	//  104  181:bipush          48
	//  105  183:isub            
	//  106  184:iadd            
	//  107  185:istore_3        
						i = j;
	//  108  186:iload_3         
	//  109  187:istore_1        
						if(i1 >= j1)
							break label1;
	//  110  188:iload           4
	//  111  190:iload           5
	//  112  192:icmpge          268
						i = j;
	//  113  195:iload_3         
	//  114  196:istore_1        
						do
						{
							int k = i1 + 1;
	//  115  197:iload           4
	//  116  199:iconst_1        
	//  117  200:iadd            
	//  118  201:istore_3        
							i1 = ((int) (s.charAt(i1)));
	//  119  202:aload_0         
	//  120  203:iload           4
	//  121  205:invokevirtual   #70  <Method char String.charAt(int)>
	//  122  208:istore          4
							if(i1 <= '9' && i1 >= '0')
	//* 123  210:iload           4
	//* 124  212:bipush          57
	//* 125  214:icmpgt          253
	//* 126  217:iload           4
	//* 127  219:bipush          48
	//* 128  221:icmpge          227
	//* 129  224:goto            253
							{
								i = i * 10 + (i1 - 48);
	//  130  227:iload_1         
	//  131  228:bipush          10
	//  132  230:imul            
	//  133  231:iload           4
	//  134  233:bipush          48
	//  135  235:isub            
	//  136  236:iadd            
	//  137  237:istore_1        
								if(k >= j1)
	//* 138  238:iload_3         
	//* 139  239:iload           5
	//* 140  241:icmplt          247
									break label1;
	//  141  244:goto            268
								i1 = k;
	//  142  247:iload_3         
	//  143  248:istore          4
							} else
	//* 144  250:goto            197
							{
								return Integer.parseInt(s);
	//  145  253:aload_0         
	//  146  254:invokestatic    #88  <Method int Integer.parseInt(String)>
	//  147  257:ireturn         
							}
						} while(true);
					} else
					{
						return Integer.parseInt(s);
	//  148  258:aload_0         
	//  149  259:invokestatic    #88  <Method int Integer.parseInt(String)>
	//  150  262:ireturn         
					}
				} else
				{
					return Integer.parseInt(s);
	//  151  263:aload_0         
	//  152  264:invokestatic    #88  <Method int Integer.parseInt(String)>
	//  153  267:ireturn         
				}
			}
			int l = i;
	//  154  268:iload_1         
	//  155  269:istore_3        
			if(flag)
	//* 156  270:iload_2         
	//* 157  271:ifeq            277
				l = -i;
	//  158  274:iload_1         
	//  159  275:ineg            
	//  160  276:istore_3        
			return l;
	//  161  277:iload_3         
	//  162  278:ireturn         
		}
		return Integer.parseInt(s);
	//  163  279:aload_0         
	//  164  280:invokestatic    #88  <Method int Integer.parseInt(String)>
	//  165  283:ireturn         
	}

	public static int parseInt(char ac[], int i, int j)
	{
		int k1 = ac[i] - 48;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:caload          
	//    3    3:bipush          48
	//    4    5:isub            
	//    5    6:istore          6
		int k = k1;
	//    6    8:iload           6
	//    7   10:istore_3        
		int j1 = i;
	//    8   11:iload_1         
	//    9   12:istore          5
		int i1 = j;
	//   10   14:iload_2         
	//   11   15:istore          4
		if(j > 4)
	//*  12   17:iload_2         
	//*  13   18:iconst_4        
	//*  14   19:icmple          182
		{
			k = i + 1;
	//   15   22:iload_1         
	//   16   23:iconst_1        
	//   17   24:iadd            
	//   18   25:istore_3        
			i = ((int) (ac[k]));
	//   19   26:aload_0         
	//   20   27:iload_3         
	//   21   28:caload          
	//   22   29:istore_1        
			i1 = k + 1;
	//   23   30:iload_3         
	//   24   31:iconst_1        
	//   25   32:iadd            
	//   26   33:istore          4
			k = ((int) (ac[i1]));
	//   27   35:aload_0         
	//   28   36:iload           4
	//   29   38:caload          
	//   30   39:istore_3        
			j1 = i1 + 1;
	//   31   40:iload           4
	//   32   42:iconst_1        
	//   33   43:iadd            
	//   34   44:istore          5
			i1 = ((int) (ac[j1]));
	//   35   46:aload_0         
	//   36   47:iload           5
	//   37   49:caload          
	//   38   50:istore          4
			int l1 = j1 + 1;
	//   39   52:iload           5
	//   40   54:iconst_1        
	//   41   55:iadd            
	//   42   56:istore          7
			i = (((k1 * 10 + (i - 48)) * 10 + (k - 48)) * 10 + (i1 - 48)) * 10 + (ac[l1] - 48);
	//   43   58:iload           6
	//   44   60:bipush          10
	//   45   62:imul            
	//   46   63:iload_1         
	//   47   64:bipush          48
	//   48   66:isub            
	//   49   67:iadd            
	//   50   68:bipush          10
	//   51   70:imul            
	//   52   71:iload_3         
	//   53   72:bipush          48
	//   54   74:isub            
	//   55   75:iadd            
	//   56   76:bipush          10
	//   57   78:imul            
	//   58   79:iload           4
	//   59   81:bipush          48
	//   60   83:isub            
	//   61   84:iadd            
	//   62   85:bipush          10
	//   63   87:imul            
	//   64   88:aload_0         
	//   65   89:iload           7
	//   66   91:caload          
	//   67   92:bipush          48
	//   68   94:isub            
	//   69   95:iadd            
	//   70   96:istore_1        
			j -= 4;
	//   71   97:iload_2         
	//   72   98:iconst_4        
	//   73   99:isub            
	//   74  100:istore_2        
			k = i;
	//   75  101:iload_1         
	//   76  102:istore_3        
			j1 = l1;
	//   77  103:iload           7
	//   78  105:istore          5
			i1 = j;
	//   79  107:iload_2         
	//   80  108:istore          4
			if(j > 4)
	//*  81  110:iload_2         
	//*  82  111:iconst_4        
	//*  83  112:icmple          182
			{
				k = l1 + 1;
	//   84  115:iload           7
	//   85  117:iconst_1        
	//   86  118:iadd            
	//   87  119:istore_3        
				j = ((int) (ac[k]));
	//   88  120:aload_0         
	//   89  121:iload_3         
	//   90  122:caload          
	//   91  123:istore_2        
				i1 = k + 1;
	//   92  124:iload_3         
	//   93  125:iconst_1        
	//   94  126:iadd            
	//   95  127:istore          4
				k = ((int) (ac[i1]));
	//   96  129:aload_0         
	//   97  130:iload           4
	//   98  132:caload          
	//   99  133:istore_3        
				i1++;
	//  100  134:iload           4
	//  101  136:iconst_1        
	//  102  137:iadd            
	//  103  138:istore          4
				return (((i * 10 + (j - 48)) * 10 + (k - 48)) * 10 + (ac[i1] - 48)) * 10 + (ac[i1 + 1] - 48);
	//  104  140:iload_1         
	//  105  141:bipush          10
	//  106  143:imul            
	//  107  144:iload_2         
	//  108  145:bipush          48
	//  109  147:isub            
	//  110  148:iadd            
	//  111  149:bipush          10
	//  112  151:imul            
	//  113  152:iload_3         
	//  114  153:bipush          48
	//  115  155:isub            
	//  116  156:iadd            
	//  117  157:bipush          10
	//  118  159:imul            
	//  119  160:aload_0         
	//  120  161:iload           4
	//  121  163:caload          
	//  122  164:bipush          48
	//  123  166:isub            
	//  124  167:iadd            
	//  125  168:bipush          10
	//  126  170:imul            
	//  127  171:aload_0         
	//  128  172:iload           4
	//  129  174:iconst_1        
	//  130  175:iadd            
	//  131  176:caload          
	//  132  177:bipush          48
	//  133  179:isub            
	//  134  180:iadd            
	//  135  181:ireturn         
			}
		}
		i = k;
	//  136  182:iload_3         
	//  137  183:istore_1        
		if(i1 > 1)
	//* 138  184:iload           4
	//* 139  186:iconst_1        
	//* 140  187:icmple          256
		{
			j1++;
	//  141  190:iload           5
	//  142  192:iconst_1        
	//  143  193:iadd            
	//  144  194:istore          5
			j = k * 10 + (ac[j1] - 48);
	//  145  196:iload_3         
	//  146  197:bipush          10
	//  147  199:imul            
	//  148  200:aload_0         
	//  149  201:iload           5
	//  150  203:caload          
	//  151  204:bipush          48
	//  152  206:isub            
	//  153  207:iadd            
	//  154  208:istore_2        
			i = j;
	//  155  209:iload_2         
	//  156  210:istore_1        
			if(i1 > 2)
	//* 157  211:iload           4
	//* 158  213:iconst_2        
	//* 159  214:icmple          256
			{
				int l = j1 + 1;
	//  160  217:iload           5
	//  161  219:iconst_1        
	//  162  220:iadd            
	//  163  221:istore_3        
				j = j * 10 + (ac[l] - 48);
	//  164  222:iload_2         
	//  165  223:bipush          10
	//  166  225:imul            
	//  167  226:aload_0         
	//  168  227:iload_3         
	//  169  228:caload          
	//  170  229:bipush          48
	//  171  231:isub            
	//  172  232:iadd            
	//  173  233:istore_2        
				i = j;
	//  174  234:iload_2         
	//  175  235:istore_1        
				if(i1 > 3)
	//* 176  236:iload           4
	//* 177  238:iconst_3        
	//* 178  239:icmple          256
					i = j * 10 + (ac[l + 1] - 48);
	//  179  242:iload_2         
	//  180  243:bipush          10
	//  181  245:imul            
	//  182  246:aload_0         
	//  183  247:iload_3         
	//  184  248:iconst_1        
	//  185  249:iadd            
	//  186  250:caload          
	//  187  251:bipush          48
	//  188  253:isub            
	//  189  254:iadd            
	//  190  255:istore_1        
			}
		}
		return i;
	//  191  256:iload_1         
	//  192  257:ireturn         
	}

	public static long parseLong(String s)
	{
		if(s.length() <= 9)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #66  <Method int String.length()>
	//*   2    4:bipush          9
	//*   3    6:icmpgt          15
			return (long)parseInt(s);
	//    4    9:aload_0         
	//    5   10:invokestatic    #123 <Method int parseInt(String)>
	//    6   13:i2l             
	//    7   14:lreturn         
		else
			return Long.parseLong(s);
	//    8   15:aload_0         
	//    9   16:invokestatic    #96  <Method long Long.parseLong(String)>
	//   10   19:lreturn         
	}

	public static long parseLong(char ac[], int i, int j)
	{
		j -= 9;
	//    0    0:iload_2         
	//    1    1:bipush          9
	//    2    3:isub            
	//    3    4:istore_2        
		return (long)parseInt(ac, i, j) * 0x3b9aca00L + (long)parseInt(ac, i + j, 9);
	//    4    5:aload_0         
	//    5    6:iload_1         
	//    6    7:iload_2         
	//    7    8:invokestatic    #126 <Method int parseInt(char[], int, int)>
	//    8   11:i2l             
	//    9   12:ldc2w           #7   <Long 0x3b9aca00L>
	//   10   15:lmul            
	//   11   16:aload_0         
	//   12   17:iload_1         
	//   13   18:iload_2         
	//   14   19:iadd            
	//   15   20:bipush          9
	//   16   22:invokestatic    #126 <Method int parseInt(char[], int, int)>
	//   17   25:i2l             
	//   18   26:ladd            
	//   19   27:lreturn         
	}

	static final long L_BILLION = 0x3b9aca00L;
	static final String MAX_LONG_STR = String.valueOf(0xffffffffL);
	static final String MIN_LONG_STR_NO_SIGN = String.valueOf(0x0L).substring(1);
	public static final String NASTY_SMALL_DOUBLE = "2.2250738585072012e-308";

	static 
	{
	//    0    0:ldc2w           #17  <Long 0x0L>
	//    1    3:invokestatic    #24  <Method String String.valueOf(long)>
	//    2    6:iconst_1        
	//    3    7:invokevirtual   #28  <Method String String.substring(int)>
	//    4   10:putstatic       #30  <Field String MIN_LONG_STR_NO_SIGN>
	//    5   13:ldc2w           #31  <Long 0xffffffffL>
	//    6   16:invokestatic    #24  <Method String String.valueOf(long)>
	//    7   19:putstatic       #34  <Field String MAX_LONG_STR>
	//*   8   22:return          
	}
}
