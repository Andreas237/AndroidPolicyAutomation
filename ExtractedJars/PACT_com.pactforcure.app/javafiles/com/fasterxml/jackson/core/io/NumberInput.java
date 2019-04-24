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
		return new NumberFormatException((new StringBuilder()).append("Value \"").append(s).append("\" can not be represented as BigDecimal").toString());
	//    0    0:new             #42  <Class NumberFormatException>
	//    1    3:dup             
	//    2    4:new             #44  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #45  <Method void StringBuilder()>
	//    5   11:ldc1            #47  <String "Value \"">
	//    6   13:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_0         
	//    8   17:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:ldc1            #53  <String "\" can not be represented as BigDecimal">
	//   10   22:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   12   28:invokespecial   #60  <Method void NumberFormatException(String)>
	//   13   31:areturn         
	}

	public static boolean inLongRange(String s, boolean flag)
	{
		int i;
		int j;
		String s1;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            27
			s1 = MIN_LONG_STR_NO_SIGN;
	//    2    4:getstatic       #30  <Field String MIN_LONG_STR_NO_SIGN>
	//    3    7:astore          5
		else
	//*   4    9:aload           5
	//*   5   11:invokevirtual   #66  <Method int String.length()>
	//*   6   14:istore_3        
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #66  <Method int String.length()>
	//*   9   19:istore_2        
	//*  10   20:iload_2         
	//*  11   21:iload_3         
	//*  12   22:icmpge          35
	//*  13   25:iconst_1        
	//*  14   26:ireturn         
			s1 = MAX_LONG_STR;
	//   15   27:getstatic       #34  <Field String MAX_LONG_STR>
	//   16   30:astore          5
		j = s1.length();
		i = s.length();
		if(i >= j) goto _L2; else goto _L1
_L1:
		return true;
	//*  17   32:goto            9
_L2:
		if(i > j)
	//*  18   35:iload_2         
	//*  19   36:iload_3         
	//*  20   37:icmple          42
			return false;
	//   21   40:iconst_0        
	//   22   41:ireturn         
		i = 0;
	//   23   42:iconst_0        
	//   24   43:istore_2        
		do
		{
			if(i < j)
	//*  25   44:iload_2         
	//*  26   45:iload_3         
	//*  27   46:icmpge          25
			{
label0:
				{
					int k = s.charAt(i) - s1.charAt(i);
	//   28   49:aload_0         
	//   29   50:iload_2         
	//   30   51:invokevirtual   #70  <Method char String.charAt(int)>
	//   31   54:aload           5
	//   32   56:iload_2         
	//   33   57:invokevirtual   #70  <Method char String.charAt(int)>
	//   34   60:isub            
	//   35   61:istore          4
					if(k == 0)
						break label0;
	//   36   63:iload           4
	//   37   65:ifeq            75
					if(k >= 0)
	//*  38   68:iload           4
	//*  39   70:iflt            25
						return false;
	//   40   73:iconst_0        
	//   41   74:ireturn         
				}
			}
			if(true)
				continue;
			i++;
	//   42   75:iload_2         
	//   43   76:iconst_1        
	//   44   77:iadd            
	//   45   78:istore_2        
		} while(true);
	//   46   79:goto            44
		if(true) goto _L1; else goto _L3
_L3:
	}

	public static boolean inLongRange(char ac[], int i, int j, boolean flag)
	{
		int k;
		String s;
		if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            24
			s = MIN_LONG_STR_NO_SIGN;
	//    2    4:getstatic       #30  <Field String MIN_LONG_STR_NO_SIGN>
	//    3    7:astore          6
		else
	//*   4    9:aload           6
	//*   5   11:invokevirtual   #66  <Method int String.length()>
	//*   6   14:istore          4
	//*   7   16:iload_2         
	//*   8   17:iload           4
	//*   9   19:icmpge          32
	//*  10   22:iconst_1        
	//*  11   23:ireturn         
			s = MAX_LONG_STR;
	//   12   24:getstatic       #34  <Field String MAX_LONG_STR>
	//   13   27:astore          6
		k = s.length();
		if(j >= k) goto _L2; else goto _L1
_L1:
		return true;
	//*  14   29:goto            9
_L2:
		if(j > k)
	//*  15   32:iload_2         
	//*  16   33:iload           4
	//*  17   35:icmple          40
			return false;
	//   18   38:iconst_0        
	//   19   39:ireturn         
		j = 0;
	//   20   40:iconst_0        
	//   21   41:istore_2        
		do
		{
			if(j < k)
	//*  22   42:iload_2         
	//*  23   43:iload           4
	//*  24   45:icmpge          22
			{
label0:
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
					if(l == 0)
						break label0;
	//   35   62:iload           5
	//   36   64:ifeq            74
					if(l >= 0)
	//*  37   67:iload           5
	//*  38   69:iflt            22
						return false;
	//   39   72:iconst_0        
	//   40   73:ireturn         
				}
			}
			if(true)
				continue;
			j++;
	//   41   74:iload_2         
	//   42   75:iconst_1        
	//   43   76:iadd            
	//   44   77:istore_2        
		} while(true);
	//   45   78:goto            42
		if(true) goto _L1; else goto _L3
_L3:
	}

	public static double parseAsDouble(String s, double d)
	{
		if(s != null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
	//*   2    4:dload_1         
	//*   3    5:dreturn         
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #76  <Method String String.trim()>
	//*   6   10:astore_0        
			if((s = s.trim()).length() != 0)
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #66  <Method int String.length()>
	//*   9   15:ifeq            4
			{
				double d1;
				try
				{
					d1 = parseDouble(s);
	//   10   18:aload_0         
	//   11   19:invokestatic    #80  <Method double parseDouble(String)>
	//   12   22:dstore_3        
				}
	//*  13   23:dload_3         
	//*  14   24:dreturn         
				// Misplaced declaration of an exception variable
				catch(String s)
	//*  15   25:astore_0        
				{
					return d;
	//   16   26:dload_1         
	//   17   27:dreturn         
				}
				return d1;
			}
		return d;
	}

	public static int parseAsInt(String s, int i)
	{
		if(s != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnonnull       6
_L1:
		return i;
	//    2    4:iload_1         
	//    3    5:ireturn         
_L2:
		int l;
		String s1;
		s1 = s.trim();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #76  <Method String String.trim()>
	//    6   10:astore          9
		l = s1.length();
	//    7   12:aload           9
	//    8   14:invokevirtual   #66  <Method int String.length()>
	//    9   17:istore          6
		if(l == 0) goto _L1; else goto _L3
	//   10   19:iload           6
	//   11   21:ifeq            4
_L3:
		break MISSING_BLOCK_LABEL_24;
	//*  12   24:iconst_0        
	//*  13   25:istore          7
	//*  14   27:iload           7
	//*  15   29:istore          4
	//*  16   31:iload           6
	//*  17   33:istore          5
	//*  18   35:aload           9
	//*  19   37:astore_0        
	//*  20   38:iload           6
	//*  21   40:ifge            75
	//*  22   43:aload           9
	//*  23   45:iconst_0        
	//*  24   46:invokevirtual   #70  <Method char String.charAt(int)>
	//*  25   49:istore          8
	//*  26   51:iload           8
	//*  27   53:bipush          43
	//*  28   55:icmpne          112
	//*  29   58:aload           9
	//*  30   60:iconst_1        
	//*  31   61:invokevirtual   #28  <Method String String.substring(int)>
	//*  32   64:astore_0        
	//*  33   65:aload_0         
	//*  34   66:invokevirtual   #66  <Method int String.length()>
	//*  35   69:istore          5
	//*  36   71:iload           7
	//*  37   73:istore          4
	//*  38   75:iload           4
	//*  39   77:iload           5
	//*  40   79:icmpge          157
	//*  41   82:aload_0         
	//*  42   83:iload           4
	//*  43   85:invokevirtual   #70  <Method char String.charAt(int)>
	//*  44   88:istore          6
	//*  45   90:iload           6
	//*  46   92:bipush          57
	//*  47   94:icmpgt          104
	//*  48   97:iload           6
	//*  49   99:bipush          48
	//*  50  101:icmpge          148
	//*  51  104:aload_0         
	//*  52  105:invokestatic    #80  <Method double parseDouble(String)>
	//*  53  108:dstore_2        
	//*  54  109:dload_2         
	//*  55  110:d2i             
	//*  56  111:ireturn         
		j = ((int) (flag));
	//   57  112:iload           7
	//   58  114:istore          4
		k = l;
	//   59  116:iload           6
	//   60  118:istore          5
		s = s1;
	//   61  120:aload           9
	//   62  122:astore_0        
		if(c == '-')
	//*  63  123:iload           8
	//*  64  125:bipush          45
	//*  65  127:icmpne          75
		{
			j = 0 + 1;
	//   66  130:iconst_0        
	//   67  131:iconst_1        
	//   68  132:iadd            
	//   69  133:istore          4
			k = l;
	//   70  135:iload           6
	//   71  137:istore          5
			s = s1;
	//   72  139:aload           9
	//   73  141:astore_0        
		}
		continue;
	//   74  142:goto            75
		boolean flag = false;
		int j = ((int) (flag));
		int k = l;
		s = s1;
		char c;
		if(l < 0)
		{
			c = s1.charAt(0);
			if(c != '+')
				break MISSING_BLOCK_LABEL_112;
			s = s1.substring(1);
			k = s.length();
			j = ((int) (flag));
		}
		do
		{
			if(j >= k)
				break;
			l = ((int) (s.charAt(j)));
			if(l > 57 || l < 48)
			{
				double d;
				try
				{
					d = parseDouble(s);
				}
				// Misplaced declaration of an exception variable
				catch(String s)
	//*  75  145:astore_0        
				{
					return i;
	//   76  146:iload_1         
	//   77  147:ireturn         
				}
				return (int)d;
			}
			j++;
	//   78  148:iload           4
	//   79  150:iconst_1        
	//   80  151:iadd            
	//   81  152:istore          4
		} while(true);
	//   82  154:goto            75
		try
		{
			j = Integer.parseInt(s);
	//   83  157:aload_0         
	//   84  158:invokestatic    #88  <Method int Integer.parseInt(String)>
	//   85  161:istore          4
		}
	//*  86  163:iload           4
	//*  87  165:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  88  166:astore_0        
		{
			return i;
	//   89  167:iload_1         
	//   90  168:ireturn         
		}
		return j;
	}

	public static long parseAsLong(String s, long l)
	{
		if(s != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnonnull       6
_L1:
		return l;
	//    2    4:lload_1         
	//    3    5:lreturn         
_L2:
		int k;
		String s1;
		s1 = s.trim();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #76  <Method String String.trim()>
	//    6   10:astore          12
		k = s1.length();
	//    7   12:aload           12
	//    8   14:invokevirtual   #66  <Method int String.length()>
	//    9   17:istore          7
		if(k == 0) goto _L1; else goto _L3
	//   10   19:iload           7
	//   11   21:ifeq            4
_L3:
		break MISSING_BLOCK_LABEL_24;
	//*  12   24:iconst_0        
	//*  13   25:istore          8
	//*  14   27:iload           8
	//*  15   29:istore          5
	//*  16   31:iload           7
	//*  17   33:istore          6
	//*  18   35:aload           12
	//*  19   37:astore_0        
	//*  20   38:iload           7
	//*  21   40:ifge            75
	//*  22   43:aload           12
	//*  23   45:iconst_0        
	//*  24   46:invokevirtual   #70  <Method char String.charAt(int)>
	//*  25   49:istore          9
	//*  26   51:iload           9
	//*  27   53:bipush          43
	//*  28   55:icmpne          112
	//*  29   58:aload           12
	//*  30   60:iconst_1        
	//*  31   61:invokevirtual   #28  <Method String String.substring(int)>
	//*  32   64:astore_0        
	//*  33   65:aload_0         
	//*  34   66:invokevirtual   #66  <Method int String.length()>
	//*  35   69:istore          6
	//*  36   71:iload           8
	//*  37   73:istore          5
	//*  38   75:iload           5
	//*  39   77:iload           6
	//*  40   79:icmpge          157
	//*  41   82:aload_0         
	//*  42   83:iload           5
	//*  43   85:invokevirtual   #70  <Method char String.charAt(int)>
	//*  44   88:istore          7
	//*  45   90:iload           7
	//*  46   92:bipush          57
	//*  47   94:icmpgt          104
	//*  48   97:iload           7
	//*  49   99:bipush          48
	//*  50  101:icmpge          148
	//*  51  104:aload_0         
	//*  52  105:invokestatic    #80  <Method double parseDouble(String)>
	//*  53  108:dstore_3        
	//*  54  109:dload_3         
	//*  55  110:d2l             
	//*  56  111:lreturn         
		i = ((int) (flag));
	//   57  112:iload           8
	//   58  114:istore          5
		j = k;
	//   59  116:iload           7
	//   60  118:istore          6
		s = s1;
	//   61  120:aload           12
	//   62  122:astore_0        
		if(c == '-')
	//*  63  123:iload           9
	//*  64  125:bipush          45
	//*  65  127:icmpne          75
		{
			i = 0 + 1;
	//   66  130:iconst_0        
	//   67  131:iconst_1        
	//   68  132:iadd            
	//   69  133:istore          5
			j = k;
	//   70  135:iload           7
	//   71  137:istore          6
			s = s1;
	//   72  139:aload           12
	//   73  141:astore_0        
		}
		continue;
	//   74  142:goto            75
		boolean flag = false;
		int i = ((int) (flag));
		int j = k;
		s = s1;
		char c;
		if(k < 0)
		{
			c = s1.charAt(0);
			if(c != '+')
				break MISSING_BLOCK_LABEL_112;
			s = s1.substring(1);
			j = s.length();
			i = ((int) (flag));
		}
		do
		{
			if(i >= j)
				break;
			k = ((int) (s.charAt(i)));
			if(k > 57 || k < 48)
			{
				double d;
				try
				{
					d = parseDouble(s);
				}
				// Misplaced declaration of an exception variable
				catch(String s)
	//*  75  145:astore_0        
				{
					return l;
	//   76  146:lload_1         
	//   77  147:lreturn         
				}
				return (long)d;
			}
			i++;
	//   78  148:iload           5
	//   79  150:iconst_1        
	//   80  151:iadd            
	//   81  152:istore          5
		} while(true);
	//   82  154:goto            75
		long l1;
		try
		{
			l1 = Long.parseLong(s);
	//   83  157:aload_0         
	//   84  158:invokestatic    #96  <Method long Long.parseLong(String)>
	//   85  161:lstore          10
		}
	//*  86  163:lload           10
	//*  87  165:lreturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  88  166:astore_0        
		{
			return l;
	//   89  167:lload_1         
	//   90  168:lreturn         
		}
		return l1;
	}

	public static BigDecimal parseBigDecimal(String s)
		throws NumberFormatException
	{
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
		catch(NumberFormatException numberformatexception)
	//*   7   11:astore_1        
		{
			throw _badBD(s);
	//    8   12:aload_0         
	//    9   13:invokestatic    #103 <Method NumberFormatException _badBD(String)>
	//   10   16:athrow          
		}
		return bigdecimal;
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
		catch(NumberFormatException numberformatexception)
	//*   9   13:astore_3        
		{
			throw _badBD(new String(ac, i, j));
	//   10   14:new             #20  <Class String>
	//   11   17:dup             
	//   12   18:aload_0         
	//   13   19:iload_1         
	//   14   20:iload_2         
	//   15   21:invokespecial   #112 <Method void String(char[], int, int)>
	//   16   24:invokestatic    #103 <Method NumberFormatException _badBD(String)>
	//   17   27:athrow          
		}
		return bigdecimal;
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
		int i;
		boolean flag;
		int l1;
		flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		i = ((int) (s.charAt(0)));
	//    2    3:aload_0         
	//    3    4:iconst_0        
	//    4    5:invokevirtual   #70  <Method char String.charAt(int)>
	//    5    8:istore_1        
		l1 = s.length();
	//    6    9:aload_0         
	//    7   10:invokevirtual   #66  <Method int String.length()>
	//    8   13:istore          6
		if(i == '-')
	//*   9   15:iload_1         
	//*  10   16:bipush          45
	//*  11   18:icmpne          24
			flag = true;
	//   12   21:iconst_1        
	//   13   22:istore          4
		if(!flag) goto _L2; else goto _L1
	//   14   24:iload           4
	//   15   26:ifeq            76
_L1:
		if(l1 != 1 && l1 <= 10) goto _L4; else goto _L3
	//   16   29:iload           6
	//   17   31:iconst_1        
	//   18   32:icmpeq          42
	//   19   35:iload           6
	//   20   37:bipush          10
	//   21   39:icmple          49
_L3:
		int j = Integer.parseInt(s);
	//   22   42:aload_0         
	//   23   43:invokestatic    #88  <Method int Integer.parseInt(String)>
	//   24   46:istore_2        
_L6:
		return j;
	//   25   47:iload_2         
	//   26   48:ireturn         
_L4:
		j = 1 + 1;
	//   27   49:iconst_1        
	//   28   50:iconst_1        
	//   29   51:iadd            
	//   30   52:istore_2        
		i = ((int) (s.charAt(1)));
	//   31   53:aload_0         
	//   32   54:iconst_1        
	//   33   55:invokevirtual   #70  <Method char String.charAt(int)>
	//   34   58:istore_1        
		break MISSING_BLOCK_LABEL_59;
	//*  35   59:iload_1         
	//*  36   60:bipush          57
	//*  37   62:icmpgt          71
	//*  38   65:iload_1         
	//*  39   66:bipush          48
	//*  40   68:icmpge          88
	//*  41   71:aload_0         
	//*  42   72:invokestatic    #88  <Method int Integer.parseInt(String)>
	//*  43   75:ireturn         
_L2:
		if(l1 > 9)
	//*  44   76:iload           6
	//*  45   78:bipush          9
	//*  46   80:icmple          271
			return Integer.parseInt(s);
	//   47   83:aload_0         
	//   48   84:invokestatic    #88  <Method int Integer.parseInt(String)>
	//   49   87:ireturn         
		break MISSING_BLOCK_LABEL_271;
_L7:
		if(i > '9' || i < '0')
			return Integer.parseInt(s);
		int j1 = i - 48;
	//   50   88:iload_1         
	//   51   89:bipush          48
	//   52   91:isub            
	//   53   92:istore          5
		i = j1;
	//   54   94:iload           5
	//   55   96:istore_1        
		int k = j;
	//   56   97:iload_2         
	//   57   98:istore_3        
		if(j < l1)
	//*  58   99:iload_2         
	//*  59  100:iload           6
	//*  60  102:icmpge          261
		{
			int i2 = j + 1;
	//   61  105:iload_2         
	//   62  106:iconst_1        
	//   63  107:iadd            
	//   64  108:istore          7
			i = ((int) (s.charAt(j)));
	//   65  110:aload_0         
	//   66  111:iload_2         
	//   67  112:invokevirtual   #70  <Method char String.charAt(int)>
	//   68  115:istore_1        
			if(i > 57 || i < 48)
	//*  69  116:iload_1         
	//*  70  117:bipush          57
	//*  71  119:icmpgt          128
	//*  72  122:iload_1         
	//*  73  123:bipush          48
	//*  74  125:icmpge          133
				return Integer.parseInt(s);
	//   75  128:aload_0         
	//   76  129:invokestatic    #88  <Method int Integer.parseInt(String)>
	//   77  132:ireturn         
			int l = j1 * 10 + (i - 48);
	//   78  133:iload           5
	//   79  135:bipush          10
	//   80  137:imul            
	//   81  138:iload_1         
	//   82  139:bipush          48
	//   83  141:isub            
	//   84  142:iadd            
	//   85  143:istore_3        
			i = l;
	//   86  144:iload_3         
	//   87  145:istore_1        
			if(i2 < l1)
	//*  88  146:iload           7
	//*  89  148:iload           6
	//*  90  150:icmpge          261
			{
				j = i2 + 1;
	//   91  153:iload           7
	//   92  155:iconst_1        
	//   93  156:iadd            
	//   94  157:istore_2        
				i = ((int) (s.charAt(i2)));
	//   95  158:aload_0         
	//   96  159:iload           7
	//   97  161:invokevirtual   #70  <Method char String.charAt(int)>
	//   98  164:istore_1        
				if(i > 57 || i < 48)
	//*  99  165:iload_1         
	//* 100  166:bipush          57
	//* 101  168:icmpgt          177
	//* 102  171:iload_1         
	//* 103  172:bipush          48
	//* 104  174:icmpge          182
					return Integer.parseInt(s);
	//  105  177:aload_0         
	//  106  178:invokestatic    #88  <Method int Integer.parseInt(String)>
	//  107  181:ireturn         
				int k1 = l * 10 + (i - 48);
	//  108  182:iload_3         
	//  109  183:bipush          10
	//  110  185:imul            
	//  111  186:iload_1         
	//  112  187:bipush          48
	//  113  189:isub            
	//  114  190:iadd            
	//  115  191:istore          5
				i = k1;
	//  116  193:iload           5
	//  117  195:istore_1        
				l = j;
	//  118  196:iload_2         
	//  119  197:istore_3        
				if(j < l1)
	//* 120  198:iload_2         
	//* 121  199:iload           6
	//* 122  201:icmpge          261
				{
					i = j;
	//  123  204:iload_2         
	//  124  205:istore_1        
					j = k1;
	//  125  206:iload           5
	//  126  208:istore_2        
					int i1;
					do
					{
						i1 = i + 1;
	//  127  209:iload_1         
	//  128  210:iconst_1        
	//  129  211:iadd            
	//  130  212:istore_3        
						i = ((int) (s.charAt(i)));
	//  131  213:aload_0         
	//  132  214:iload_1         
	//  133  215:invokevirtual   #70  <Method char String.charAt(int)>
	//  134  218:istore_1        
						if(i > 57 || i < 48)
	//* 135  219:iload_1         
	//* 136  220:bipush          57
	//* 137  222:icmpgt          231
	//* 138  225:iload_1         
	//* 139  226:bipush          48
	//* 140  228:icmpge          236
							return Integer.parseInt(s);
	//  141  231:aload_0         
	//  142  232:invokestatic    #88  <Method int Integer.parseInt(String)>
	//  143  235:ireturn         
						k1 = j * 10 + (i - 48);
	//  144  236:iload_2         
	//  145  237:bipush          10
	//  146  239:imul            
	//  147  240:iload_1         
	//  148  241:bipush          48
	//  149  243:isub            
	//  150  244:iadd            
	//  151  245:istore          5
						j = k1;
	//  152  247:iload           5
	//  153  249:istore_2        
						i = i1;
	//  154  250:iload_3         
	//  155  251:istore_1        
					} while(i1 < l1);
	//  156  252:iload_3         
	//  157  253:iload           6
	//  158  255:icmplt          209
					i = k1;
	//  159  258:iload           5
	//  160  260:istore_1        
				}
			}
		}
		j = i;
	//  161  261:iload_1         
	//  162  262:istore_2        
		if(flag)
	//* 163  263:iload           4
	//* 164  265:ifeq            47
			return -i;
	//  165  268:iload_1         
	//  166  269:ineg            
	//  167  270:ireturn         
		if(true) goto _L6; else goto _L5
_L5:
		j = 1;
	//  168  271:iconst_1        
	//  169  272:istore_2        
		  goto _L7
	//* 170  273:goto            59
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
		long l = parseInt(ac, i, j);
	//    4    5:aload_0         
	//    5    6:iload_1         
	//    6    7:iload_2         
	//    7    8:invokestatic    #126 <Method int parseInt(char[], int, int)>
	//    8   11:i2l             
	//    9   12:lstore_3        
		return (long)parseInt(ac, i + j, 9) + l * 0x3b9aca00L;
	//   10   13:aload_0         
	//   11   14:iload_1         
	//   12   15:iload_2         
	//   13   16:iadd            
	//   14   17:bipush          9
	//   15   19:invokestatic    #126 <Method int parseInt(char[], int, int)>
	//   16   22:i2l             
	//   17   23:lload_3         
	//   18   24:ldc2w           #7   <Long 0x3b9aca00L>
	//   19   27:lmul            
	//   20   28:ladd            
	//   21   29:lreturn         
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
