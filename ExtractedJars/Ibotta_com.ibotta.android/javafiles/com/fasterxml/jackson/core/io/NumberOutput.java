// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.io;


public final class NumberOutput
{

	private static int _full3(int i, byte abyte0[], int j)
	{
		i = TRIPLET_TO_CHARS[i];
	//    0    0:getstatic       #47  <Field int[] TRIPLET_TO_CHARS>
	//    1    3:iload_0         
	//    2    4:iaload          
	//    3    5:istore_0        
		int k = j + 1;
	//    4    6:iload_2         
	//    5    7:iconst_1        
	//    6    8:iadd            
	//    7    9:istore_3        
		abyte0[j] = (byte)(i >> 16);
	//    8   10:aload_1         
	//    9   11:iload_2         
	//   10   12:iload_0         
	//   11   13:bipush          16
	//   12   15:ishr            
	//   13   16:int2byte        
	//   14   17:bastore         
		j = k + 1;
	//   15   18:iload_3         
	//   16   19:iconst_1        
	//   17   20:iadd            
	//   18   21:istore_2        
		abyte0[k] = (byte)(i >> 8);
	//   19   22:aload_1         
	//   20   23:iload_3         
	//   21   24:iload_0         
	//   22   25:bipush          8
	//   23   27:ishr            
	//   24   28:int2byte        
	//   25   29:bastore         
		abyte0[j] = (byte)i;
	//   26   30:aload_1         
	//   27   31:iload_2         
	//   28   32:iload_0         
	//   29   33:int2byte        
	//   30   34:bastore         
		return j + 1;
	//   31   35:iload_2         
	//   32   36:iconst_1        
	//   33   37:iadd            
	//   34   38:ireturn         
	}

	private static int _full3(int i, char ac[], int j)
	{
		i = TRIPLET_TO_CHARS[i];
	//    0    0:getstatic       #47  <Field int[] TRIPLET_TO_CHARS>
	//    1    3:iload_0         
	//    2    4:iaload          
	//    3    5:istore_0        
		int k = j + 1;
	//    4    6:iload_2         
	//    5    7:iconst_1        
	//    6    8:iadd            
	//    7    9:istore_3        
		ac[j] = (char)(i >> 16);
	//    8   10:aload_1         
	//    9   11:iload_2         
	//   10   12:iload_0         
	//   11   13:bipush          16
	//   12   15:ishr            
	//   13   16:int2char        
	//   14   17:castore         
		j = k + 1;
	//   15   18:iload_3         
	//   16   19:iconst_1        
	//   17   20:iadd            
	//   18   21:istore_2        
		ac[k] = (char)(i >> 8 & 0x7f);
	//   19   22:aload_1         
	//   20   23:iload_3         
	//   21   24:iload_0         
	//   22   25:bipush          8
	//   23   27:ishr            
	//   24   28:bipush          127
	//   25   30:iand            
	//   26   31:int2char        
	//   27   32:castore         
		ac[j] = (char)(i & 0x7f);
	//   28   33:aload_1         
	//   29   34:iload_2         
	//   30   35:iload_0         
	//   31   36:bipush          127
	//   32   38:iand            
	//   33   39:int2char        
	//   34   40:castore         
		return j + 1;
	//   35   41:iload_2         
	//   36   42:iconst_1        
	//   37   43:iadd            
	//   38   44:ireturn         
	}

	private static int _leading3(int i, byte abyte0[], int j)
	{
		int l = TRIPLET_TO_CHARS[i];
	//    0    0:getstatic       #47  <Field int[] TRIPLET_TO_CHARS>
	//    1    3:iload_0         
	//    2    4:iaload          
	//    3    5:istore          4
		int k = j;
	//    4    7:iload_2         
	//    5    8:istore_3        
		if(i > 9)
	//*   6    9:iload_0         
	//*   7   10:bipush          9
	//*   8   12:icmple          52
		{
			if(i > 99)
	//*   9   15:iload_0         
	//*  10   16:bipush          99
	//*  11   18:icmple          37
			{
				i = j + 1;
	//   12   21:iload_2         
	//   13   22:iconst_1        
	//   14   23:iadd            
	//   15   24:istore_0        
				abyte0[j] = (byte)(l >> 16);
	//   16   25:aload_1         
	//   17   26:iload_2         
	//   18   27:iload           4
	//   19   29:bipush          16
	//   20   31:ishr            
	//   21   32:int2byte        
	//   22   33:bastore         
			} else
	//*  23   34:goto            39
			{
				i = j;
	//   24   37:iload_2         
	//   25   38:istore_0        
			}
			k = i + 1;
	//   26   39:iload_0         
	//   27   40:iconst_1        
	//   28   41:iadd            
	//   29   42:istore_3        
			abyte0[i] = (byte)(l >> 8);
	//   30   43:aload_1         
	//   31   44:iload_0         
	//   32   45:iload           4
	//   33   47:bipush          8
	//   34   49:ishr            
	//   35   50:int2byte        
	//   36   51:bastore         
		}
		abyte0[k] = (byte)l;
	//   37   52:aload_1         
	//   38   53:iload_3         
	//   39   54:iload           4
	//   40   56:int2byte        
	//   41   57:bastore         
		return k + 1;
	//   42   58:iload_3         
	//   43   59:iconst_1        
	//   44   60:iadd            
	//   45   61:ireturn         
	}

	private static int _leading3(int i, char ac[], int j)
	{
		int l = TRIPLET_TO_CHARS[i];
	//    0    0:getstatic       #47  <Field int[] TRIPLET_TO_CHARS>
	//    1    3:iload_0         
	//    2    4:iaload          
	//    3    5:istore          4
		int k = j;
	//    4    7:iload_2         
	//    5    8:istore_3        
		if(i > 9)
	//*   6    9:iload_0         
	//*   7   10:bipush          9
	//*   8   12:icmple          55
		{
			if(i > 99)
	//*   9   15:iload_0         
	//*  10   16:bipush          99
	//*  11   18:icmple          37
			{
				i = j + 1;
	//   12   21:iload_2         
	//   13   22:iconst_1        
	//   14   23:iadd            
	//   15   24:istore_0        
				ac[j] = (char)(l >> 16);
	//   16   25:aload_1         
	//   17   26:iload_2         
	//   18   27:iload           4
	//   19   29:bipush          16
	//   20   31:ishr            
	//   21   32:int2char        
	//   22   33:castore         
			} else
	//*  23   34:goto            39
			{
				i = j;
	//   24   37:iload_2         
	//   25   38:istore_0        
			}
			k = i + 1;
	//   26   39:iload_0         
	//   27   40:iconst_1        
	//   28   41:iadd            
	//   29   42:istore_3        
			ac[i] = (char)(l >> 8 & 0x7f);
	//   30   43:aload_1         
	//   31   44:iload_0         
	//   32   45:iload           4
	//   33   47:bipush          8
	//   34   49:ishr            
	//   35   50:bipush          127
	//   36   52:iand            
	//   37   53:int2char        
	//   38   54:castore         
		}
		ac[k] = (char)(l & 0x7f);
	//   39   55:aload_1         
	//   40   56:iload_3         
	//   41   57:iload           4
	//   42   59:bipush          127
	//   43   61:iand            
	//   44   62:int2char        
	//   45   63:castore         
		return k + 1;
	//   46   64:iload_3         
	//   47   65:iconst_1        
	//   48   66:iadd            
	//   49   67:ireturn         
	}

	private static int _outputFullBillion(int i, byte abyte0[], int j)
	{
		int k = i / 1000;
	//    0    0:iload_0         
	//    1    1:sipush          1000
	//    2    4:idiv            
	//    3    5:istore_3        
		int l = k / 1000;
	//    4    6:iload_3         
	//    5    7:sipush          1000
	//    6   10:idiv            
	//    7   11:istore          4
		int ai[] = TRIPLET_TO_CHARS;
	//    8   13:getstatic       #47  <Field int[] TRIPLET_TO_CHARS>
	//    9   16:astore          8
		int i1 = ai[l];
	//   10   18:aload           8
	//   11   20:iload           4
	//   12   22:iaload          
	//   13   23:istore          5
		int j1 = j + 1;
	//   14   25:iload_2         
	//   15   26:iconst_1        
	//   16   27:iadd            
	//   17   28:istore          6
		abyte0[j] = (byte)(i1 >> 16);
	//   18   30:aload_1         
	//   19   31:iload_2         
	//   20   32:iload           5
	//   21   34:bipush          16
	//   22   36:ishr            
	//   23   37:int2byte        
	//   24   38:bastore         
		int k1 = j1 + 1;
	//   25   39:iload           6
	//   26   41:iconst_1        
	//   27   42:iadd            
	//   28   43:istore          7
		abyte0[j1] = (byte)(i1 >> 8);
	//   29   45:aload_1         
	//   30   46:iload           6
	//   31   48:iload           5
	//   32   50:bipush          8
	//   33   52:ishr            
	//   34   53:int2byte        
	//   35   54:bastore         
		j = k1 + 1;
	//   36   55:iload           7
	//   37   57:iconst_1        
	//   38   58:iadd            
	//   39   59:istore_2        
		abyte0[k1] = (byte)i1;
	//   40   60:aload_1         
	//   41   61:iload           7
	//   42   63:iload           5
	//   43   65:int2byte        
	//   44   66:bastore         
		l = ai[k - l * 1000];
	//   45   67:aload           8
	//   46   69:iload_3         
	//   47   70:iload           4
	//   48   72:sipush          1000
	//   49   75:imul            
	//   50   76:isub            
	//   51   77:iaload          
	//   52   78:istore          4
		i1 = j + 1;
	//   53   80:iload_2         
	//   54   81:iconst_1        
	//   55   82:iadd            
	//   56   83:istore          5
		abyte0[j] = (byte)(l >> 16);
	//   57   85:aload_1         
	//   58   86:iload_2         
	//   59   87:iload           4
	//   60   89:bipush          16
	//   61   91:ishr            
	//   62   92:int2byte        
	//   63   93:bastore         
		j1 = i1 + 1;
	//   64   94:iload           5
	//   65   96:iconst_1        
	//   66   97:iadd            
	//   67   98:istore          6
		abyte0[i1] = (byte)(l >> 8);
	//   68  100:aload_1         
	//   69  101:iload           5
	//   70  103:iload           4
	//   71  105:bipush          8
	//   72  107:ishr            
	//   73  108:int2byte        
	//   74  109:bastore         
		j = j1 + 1;
	//   75  110:iload           6
	//   76  112:iconst_1        
	//   77  113:iadd            
	//   78  114:istore_2        
		abyte0[j1] = (byte)l;
	//   79  115:aload_1         
	//   80  116:iload           6
	//   81  118:iload           4
	//   82  120:int2byte        
	//   83  121:bastore         
		i = ai[i - k * 1000];
	//   84  122:aload           8
	//   85  124:iload_0         
	//   86  125:iload_3         
	//   87  126:sipush          1000
	//   88  129:imul            
	//   89  130:isub            
	//   90  131:iaload          
	//   91  132:istore_0        
		k = j + 1;
	//   92  133:iload_2         
	//   93  134:iconst_1        
	//   94  135:iadd            
	//   95  136:istore_3        
		abyte0[j] = (byte)(i >> 16);
	//   96  137:aload_1         
	//   97  138:iload_2         
	//   98  139:iload_0         
	//   99  140:bipush          16
	//  100  142:ishr            
	//  101  143:int2byte        
	//  102  144:bastore         
		j = k + 1;
	//  103  145:iload_3         
	//  104  146:iconst_1        
	//  105  147:iadd            
	//  106  148:istore_2        
		abyte0[k] = (byte)(i >> 8);
	//  107  149:aload_1         
	//  108  150:iload_3         
	//  109  151:iload_0         
	//  110  152:bipush          8
	//  111  154:ishr            
	//  112  155:int2byte        
	//  113  156:bastore         
		abyte0[j] = (byte)i;
	//  114  157:aload_1         
	//  115  158:iload_2         
	//  116  159:iload_0         
	//  117  160:int2byte        
	//  118  161:bastore         
		return j + 1;
	//  119  162:iload_2         
	//  120  163:iconst_1        
	//  121  164:iadd            
	//  122  165:ireturn         
	}

	private static int _outputFullBillion(int i, char ac[], int j)
	{
		int k = i / 1000;
	//    0    0:iload_0         
	//    1    1:sipush          1000
	//    2    4:idiv            
	//    3    5:istore_3        
		int l = k / 1000;
	//    4    6:iload_3         
	//    5    7:sipush          1000
	//    6   10:idiv            
	//    7   11:istore          4
		int ai[] = TRIPLET_TO_CHARS;
	//    8   13:getstatic       #47  <Field int[] TRIPLET_TO_CHARS>
	//    9   16:astore          8
		int i1 = ai[l];
	//   10   18:aload           8
	//   11   20:iload           4
	//   12   22:iaload          
	//   13   23:istore          5
		int j1 = j + 1;
	//   14   25:iload_2         
	//   15   26:iconst_1        
	//   16   27:iadd            
	//   17   28:istore          6
		ac[j] = (char)(i1 >> 16);
	//   18   30:aload_1         
	//   19   31:iload_2         
	//   20   32:iload           5
	//   21   34:bipush          16
	//   22   36:ishr            
	//   23   37:int2char        
	//   24   38:castore         
		int k1 = j1 + 1;
	//   25   39:iload           6
	//   26   41:iconst_1        
	//   27   42:iadd            
	//   28   43:istore          7
		ac[j1] = (char)(i1 >> 8 & 0x7f);
	//   29   45:aload_1         
	//   30   46:iload           6
	//   31   48:iload           5
	//   32   50:bipush          8
	//   33   52:ishr            
	//   34   53:bipush          127
	//   35   55:iand            
	//   36   56:int2char        
	//   37   57:castore         
		j = k1 + 1;
	//   38   58:iload           7
	//   39   60:iconst_1        
	//   40   61:iadd            
	//   41   62:istore_2        
		ac[k1] = (char)(i1 & 0x7f);
	//   42   63:aload_1         
	//   43   64:iload           7
	//   44   66:iload           5
	//   45   68:bipush          127
	//   46   70:iand            
	//   47   71:int2char        
	//   48   72:castore         
		l = ai[k - l * 1000];
	//   49   73:aload           8
	//   50   75:iload_3         
	//   51   76:iload           4
	//   52   78:sipush          1000
	//   53   81:imul            
	//   54   82:isub            
	//   55   83:iaload          
	//   56   84:istore          4
		i1 = j + 1;
	//   57   86:iload_2         
	//   58   87:iconst_1        
	//   59   88:iadd            
	//   60   89:istore          5
		ac[j] = (char)(l >> 16);
	//   61   91:aload_1         
	//   62   92:iload_2         
	//   63   93:iload           4
	//   64   95:bipush          16
	//   65   97:ishr            
	//   66   98:int2char        
	//   67   99:castore         
		j1 = i1 + 1;
	//   68  100:iload           5
	//   69  102:iconst_1        
	//   70  103:iadd            
	//   71  104:istore          6
		ac[i1] = (char)(l >> 8 & 0x7f);
	//   72  106:aload_1         
	//   73  107:iload           5
	//   74  109:iload           4
	//   75  111:bipush          8
	//   76  113:ishr            
	//   77  114:bipush          127
	//   78  116:iand            
	//   79  117:int2char        
	//   80  118:castore         
		j = j1 + 1;
	//   81  119:iload           6
	//   82  121:iconst_1        
	//   83  122:iadd            
	//   84  123:istore_2        
		ac[j1] = (char)(l & 0x7f);
	//   85  124:aload_1         
	//   86  125:iload           6
	//   87  127:iload           4
	//   88  129:bipush          127
	//   89  131:iand            
	//   90  132:int2char        
	//   91  133:castore         
		i = ai[i - k * 1000];
	//   92  134:aload           8
	//   93  136:iload_0         
	//   94  137:iload_3         
	//   95  138:sipush          1000
	//   96  141:imul            
	//   97  142:isub            
	//   98  143:iaload          
	//   99  144:istore_0        
		k = j + 1;
	//  100  145:iload_2         
	//  101  146:iconst_1        
	//  102  147:iadd            
	//  103  148:istore_3        
		ac[j] = (char)(i >> 16);
	//  104  149:aload_1         
	//  105  150:iload_2         
	//  106  151:iload_0         
	//  107  152:bipush          16
	//  108  154:ishr            
	//  109  155:int2char        
	//  110  156:castore         
		j = k + 1;
	//  111  157:iload_3         
	//  112  158:iconst_1        
	//  113  159:iadd            
	//  114  160:istore_2        
		ac[k] = (char)(i >> 8 & 0x7f);
	//  115  161:aload_1         
	//  116  162:iload_3         
	//  117  163:iload_0         
	//  118  164:bipush          8
	//  119  166:ishr            
	//  120  167:bipush          127
	//  121  169:iand            
	//  122  170:int2char        
	//  123  171:castore         
		ac[j] = (char)(i & 0x7f);
	//  124  172:aload_1         
	//  125  173:iload_2         
	//  126  174:iload_0         
	//  127  175:bipush          127
	//  128  177:iand            
	//  129  178:int2char        
	//  130  179:castore         
		return j + 1;
	//  131  180:iload_2         
	//  132  181:iconst_1        
	//  133  182:iadd            
	//  134  183:ireturn         
	}

	private static int _outputSmallestI(byte abyte0[], int i)
	{
		int k = SMALLEST_INT.length();
	//    0    0:getstatic       #38  <Field String SMALLEST_INT>
	//    1    3:invokevirtual   #105 <Method int String.length()>
	//    2    6:istore_3        
		for(int j = 0; j < k;)
	//*   3    7:iconst_0        
	//*   4    8:istore_2        
	//*   5    9:iload_2         
	//*   6   10:iload_3         
	//*   7   11:icmpge          36
		{
			abyte0[i] = (byte)SMALLEST_INT.charAt(j);
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:getstatic       #38  <Field String SMALLEST_INT>
	//   11   19:iload_2         
	//   12   20:invokevirtual   #109 <Method char String.charAt(int)>
	//   13   23:int2byte        
	//   14   24:bastore         
			j++;
	//   15   25:iload_2         
	//   16   26:iconst_1        
	//   17   27:iadd            
	//   18   28:istore_2        
			i++;
	//   19   29:iload_1         
	//   20   30:iconst_1        
	//   21   31:iadd            
	//   22   32:istore_1        
		}

	//*  23   33:goto            9
		return i;
	//   24   36:iload_1         
	//   25   37:ireturn         
	}

	private static int _outputSmallestI(char ac[], int i)
	{
		int j = SMALLEST_INT.length();
	//    0    0:getstatic       #38  <Field String SMALLEST_INT>
	//    1    3:invokevirtual   #105 <Method int String.length()>
	//    2    6:istore_2        
		SMALLEST_INT.getChars(0, j, ac, i);
	//    3    7:getstatic       #38  <Field String SMALLEST_INT>
	//    4   10:iconst_0        
	//    5   11:iload_2         
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:invokevirtual   #114 <Method void String.getChars(int, int, char[], int)>
		return i + j;
	//    9   17:iload_1         
	//   10   18:iload_2         
	//   11   19:iadd            
	//   12   20:ireturn         
	}

	private static int _outputSmallestL(byte abyte0[], int i)
	{
		int k = SMALLEST_LONG.length();
	//    0    0:getstatic       #45  <Field String SMALLEST_LONG>
	//    1    3:invokevirtual   #105 <Method int String.length()>
	//    2    6:istore_3        
		for(int j = 0; j < k;)
	//*   3    7:iconst_0        
	//*   4    8:istore_2        
	//*   5    9:iload_2         
	//*   6   10:iload_3         
	//*   7   11:icmpge          36
		{
			abyte0[i] = (byte)SMALLEST_LONG.charAt(j);
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:getstatic       #45  <Field String SMALLEST_LONG>
	//   11   19:iload_2         
	//   12   20:invokevirtual   #109 <Method char String.charAt(int)>
	//   13   23:int2byte        
	//   14   24:bastore         
			j++;
	//   15   25:iload_2         
	//   16   26:iconst_1        
	//   17   27:iadd            
	//   18   28:istore_2        
			i++;
	//   19   29:iload_1         
	//   20   30:iconst_1        
	//   21   31:iadd            
	//   22   32:istore_1        
		}

	//*  23   33:goto            9
		return i;
	//   24   36:iload_1         
	//   25   37:ireturn         
	}

	private static int _outputSmallestL(char ac[], int i)
	{
		int j = SMALLEST_LONG.length();
	//    0    0:getstatic       #45  <Field String SMALLEST_LONG>
	//    1    3:invokevirtual   #105 <Method int String.length()>
	//    2    6:istore_2        
		SMALLEST_LONG.getChars(0, j, ac, i);
	//    3    7:getstatic       #45  <Field String SMALLEST_LONG>
	//    4   10:iconst_0        
	//    5   11:iload_2         
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:invokevirtual   #114 <Method void String.getChars(int, int, char[], int)>
		return i + j;
	//    9   17:iload_1         
	//   10   18:iload_2         
	//   11   19:iadd            
	//   12   20:ireturn         
	}

	private static int _outputUptoBillion(int i, byte abyte0[], int j)
	{
		if(i < MILLION)
	//*   0    0:iload_0         
	//*   1    1:getstatic       #118 <Field int MILLION>
	//*   2    4:icmpge          41
		{
			if(i < 1000)
	//*   3    7:iload_0         
	//*   4    8:sipush          1000
	//*   5   11:icmpge          21
			{
				return _leading3(i, abyte0, j);
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:iload_2         
	//    9   17:invokestatic    #120 <Method int _leading3(int, byte[], int)>
	//   10   20:ireturn         
			} else
			{
				int k = i / 1000;
	//   11   21:iload_0         
	//   12   22:sipush          1000
	//   13   25:idiv            
	//   14   26:istore_3        
				return _outputUptoMillion(abyte0, j, k, i - k * 1000);
	//   15   27:aload_1         
	//   16   28:iload_2         
	//   17   29:iload_3         
	//   18   30:iload_0         
	//   19   31:iload_3         
	//   20   32:sipush          1000
	//   21   35:imul            
	//   22   36:isub            
	//   23   37:invokestatic    #124 <Method int _outputUptoMillion(byte[], int, int, int)>
	//   24   40:ireturn         
			}
		} else
		{
			int l = i / 1000;
	//   25   41:iload_0         
	//   26   42:sipush          1000
	//   27   45:idiv            
	//   28   46:istore_3        
			int j1 = l / 1000;
	//   29   47:iload_3         
	//   30   48:sipush          1000
	//   31   51:idiv            
	//   32   52:istore          5
			int i1 = _leading3(j1, abyte0, j);
	//   33   54:iload           5
	//   34   56:aload_1         
	//   35   57:iload_2         
	//   36   58:invokestatic    #120 <Method int _leading3(int, byte[], int)>
	//   37   61:istore          4
			int ai[] = TRIPLET_TO_CHARS;
	//   38   63:getstatic       #47  <Field int[] TRIPLET_TO_CHARS>
	//   39   66:astore          7
			j = ai[l - j1 * 1000];
	//   40   68:aload           7
	//   41   70:iload_3         
	//   42   71:iload           5
	//   43   73:sipush          1000
	//   44   76:imul            
	//   45   77:isub            
	//   46   78:iaload          
	//   47   79:istore_2        
			j1 = i1 + 1;
	//   48   80:iload           4
	//   49   82:iconst_1        
	//   50   83:iadd            
	//   51   84:istore          5
			abyte0[i1] = (byte)(j >> 16);
	//   52   86:aload_1         
	//   53   87:iload           4
	//   54   89:iload_2         
	//   55   90:bipush          16
	//   56   92:ishr            
	//   57   93:int2byte        
	//   58   94:bastore         
			int k1 = j1 + 1;
	//   59   95:iload           5
	//   60   97:iconst_1        
	//   61   98:iadd            
	//   62   99:istore          6
			abyte0[j1] = (byte)(j >> 8);
	//   63  101:aload_1         
	//   64  102:iload           5
	//   65  104:iload_2         
	//   66  105:bipush          8
	//   67  107:ishr            
	//   68  108:int2byte        
	//   69  109:bastore         
			i1 = k1 + 1;
	//   70  110:iload           6
	//   71  112:iconst_1        
	//   72  113:iadd            
	//   73  114:istore          4
			abyte0[k1] = (byte)j;
	//   74  116:aload_1         
	//   75  117:iload           6
	//   76  119:iload_2         
	//   77  120:int2byte        
	//   78  121:bastore         
			i = ai[i - l * 1000];
	//   79  122:aload           7
	//   80  124:iload_0         
	//   81  125:iload_3         
	//   82  126:sipush          1000
	//   83  129:imul            
	//   84  130:isub            
	//   85  131:iaload          
	//   86  132:istore_0        
			j = i1 + 1;
	//   87  133:iload           4
	//   88  135:iconst_1        
	//   89  136:iadd            
	//   90  137:istore_2        
			abyte0[i1] = (byte)(i >> 16);
	//   91  138:aload_1         
	//   92  139:iload           4
	//   93  141:iload_0         
	//   94  142:bipush          16
	//   95  144:ishr            
	//   96  145:int2byte        
	//   97  146:bastore         
			l = j + 1;
	//   98  147:iload_2         
	//   99  148:iconst_1        
	//  100  149:iadd            
	//  101  150:istore_3        
			abyte0[j] = (byte)(i >> 8);
	//  102  151:aload_1         
	//  103  152:iload_2         
	//  104  153:iload_0         
	//  105  154:bipush          8
	//  106  156:ishr            
	//  107  157:int2byte        
	//  108  158:bastore         
			abyte0[l] = (byte)i;
	//  109  159:aload_1         
	//  110  160:iload_3         
	//  111  161:iload_0         
	//  112  162:int2byte        
	//  113  163:bastore         
			return l + 1;
	//  114  164:iload_3         
	//  115  165:iconst_1        
	//  116  166:iadd            
	//  117  167:ireturn         
		}
	}

	private static int _outputUptoBillion(int i, char ac[], int j)
	{
		if(i < MILLION)
	//*   0    0:iload_0         
	//*   1    1:getstatic       #118 <Field int MILLION>
	//*   2    4:icmpge          41
		{
			if(i < 1000)
	//*   3    7:iload_0         
	//*   4    8:sipush          1000
	//*   5   11:icmpge          21
			{
				return _leading3(i, ac, j);
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:iload_2         
	//    9   17:invokestatic    #126 <Method int _leading3(int, char[], int)>
	//   10   20:ireturn         
			} else
			{
				int k = i / 1000;
	//   11   21:iload_0         
	//   12   22:sipush          1000
	//   13   25:idiv            
	//   14   26:istore_3        
				return _outputUptoMillion(ac, j, k, i - k * 1000);
	//   15   27:aload_1         
	//   16   28:iload_2         
	//   17   29:iload_3         
	//   18   30:iload_0         
	//   19   31:iload_3         
	//   20   32:sipush          1000
	//   21   35:imul            
	//   22   36:isub            
	//   23   37:invokestatic    #129 <Method int _outputUptoMillion(char[], int, int, int)>
	//   24   40:ireturn         
			}
		} else
		{
			int l = i / 1000;
	//   25   41:iload_0         
	//   26   42:sipush          1000
	//   27   45:idiv            
	//   28   46:istore_3        
			int j1 = l / 1000;
	//   29   47:iload_3         
	//   30   48:sipush          1000
	//   31   51:idiv            
	//   32   52:istore          5
			int i1 = _leading3(j1, ac, j);
	//   33   54:iload           5
	//   34   56:aload_1         
	//   35   57:iload_2         
	//   36   58:invokestatic    #126 <Method int _leading3(int, char[], int)>
	//   37   61:istore          4
			int ai[] = TRIPLET_TO_CHARS;
	//   38   63:getstatic       #47  <Field int[] TRIPLET_TO_CHARS>
	//   39   66:astore          7
			j = ai[l - j1 * 1000];
	//   40   68:aload           7
	//   41   70:iload_3         
	//   42   71:iload           5
	//   43   73:sipush          1000
	//   44   76:imul            
	//   45   77:isub            
	//   46   78:iaload          
	//   47   79:istore_2        
			j1 = i1 + 1;
	//   48   80:iload           4
	//   49   82:iconst_1        
	//   50   83:iadd            
	//   51   84:istore          5
			ac[i1] = (char)(j >> 16);
	//   52   86:aload_1         
	//   53   87:iload           4
	//   54   89:iload_2         
	//   55   90:bipush          16
	//   56   92:ishr            
	//   57   93:int2char        
	//   58   94:castore         
			int k1 = j1 + 1;
	//   59   95:iload           5
	//   60   97:iconst_1        
	//   61   98:iadd            
	//   62   99:istore          6
			ac[j1] = (char)(j >> 8 & 0x7f);
	//   63  101:aload_1         
	//   64  102:iload           5
	//   65  104:iload_2         
	//   66  105:bipush          8
	//   67  107:ishr            
	//   68  108:bipush          127
	//   69  110:iand            
	//   70  111:int2char        
	//   71  112:castore         
			i1 = k1 + 1;
	//   72  113:iload           6
	//   73  115:iconst_1        
	//   74  116:iadd            
	//   75  117:istore          4
			ac[k1] = (char)(j & 0x7f);
	//   76  119:aload_1         
	//   77  120:iload           6
	//   78  122:iload_2         
	//   79  123:bipush          127
	//   80  125:iand            
	//   81  126:int2char        
	//   82  127:castore         
			i = ai[i - l * 1000];
	//   83  128:aload           7
	//   84  130:iload_0         
	//   85  131:iload_3         
	//   86  132:sipush          1000
	//   87  135:imul            
	//   88  136:isub            
	//   89  137:iaload          
	//   90  138:istore_0        
			j = i1 + 1;
	//   91  139:iload           4
	//   92  141:iconst_1        
	//   93  142:iadd            
	//   94  143:istore_2        
			ac[i1] = (char)(i >> 16);
	//   95  144:aload_1         
	//   96  145:iload           4
	//   97  147:iload_0         
	//   98  148:bipush          16
	//   99  150:ishr            
	//  100  151:int2char        
	//  101  152:castore         
			l = j + 1;
	//  102  153:iload_2         
	//  103  154:iconst_1        
	//  104  155:iadd            
	//  105  156:istore_3        
			ac[j] = (char)(i >> 8 & 0x7f);
	//  106  157:aload_1         
	//  107  158:iload_2         
	//  108  159:iload_0         
	//  109  160:bipush          8
	//  110  162:ishr            
	//  111  163:bipush          127
	//  112  165:iand            
	//  113  166:int2char        
	//  114  167:castore         
			ac[l] = (char)(i & 0x7f);
	//  115  168:aload_1         
	//  116  169:iload_3         
	//  117  170:iload_0         
	//  118  171:bipush          127
	//  119  173:iand            
	//  120  174:int2char        
	//  121  175:castore         
			return l + 1;
	//  122  176:iload_3         
	//  123  177:iconst_1        
	//  124  178:iadd            
	//  125  179:ireturn         
		}
	}

	private static int _outputUptoMillion(byte abyte0[], int i, int j, int k)
	{
		int i1 = TRIPLET_TO_CHARS[j];
	//    0    0:getstatic       #47  <Field int[] TRIPLET_TO_CHARS>
	//    1    3:iload_2         
	//    2    4:iaload          
	//    3    5:istore          5
		int l = i;
	//    4    7:iload_1         
	//    5    8:istore          4
		if(j > 9)
	//*   6   10:iload_2         
	//*   7   11:bipush          9
	//*   8   13:icmple          55
		{
			l = i;
	//    9   16:iload_1         
	//   10   17:istore          4
			if(j > 99)
	//*  11   19:iload_2         
	//*  12   20:bipush          99
	//*  13   22:icmple          39
			{
				abyte0[i] = (byte)(i1 >> 16);
	//   14   25:aload_0         
	//   15   26:iload_1         
	//   16   27:iload           5
	//   17   29:bipush          16
	//   18   31:ishr            
	//   19   32:int2byte        
	//   20   33:bastore         
				l = i + 1;
	//   21   34:iload_1         
	//   22   35:iconst_1        
	//   23   36:iadd            
	//   24   37:istore          4
			}
			abyte0[l] = (byte)(i1 >> 8);
	//   25   39:aload_0         
	//   26   40:iload           4
	//   27   42:iload           5
	//   28   44:bipush          8
	//   29   46:ishr            
	//   30   47:int2byte        
	//   31   48:bastore         
			l++;
	//   32   49:iload           4
	//   33   51:iconst_1        
	//   34   52:iadd            
	//   35   53:istore          4
		}
		i = l + 1;
	//   36   55:iload           4
	//   37   57:iconst_1        
	//   38   58:iadd            
	//   39   59:istore_1        
		abyte0[l] = (byte)i1;
	//   40   60:aload_0         
	//   41   61:iload           4
	//   42   63:iload           5
	//   43   65:int2byte        
	//   44   66:bastore         
		j = TRIPLET_TO_CHARS[k];
	//   45   67:getstatic       #47  <Field int[] TRIPLET_TO_CHARS>
	//   46   70:iload_3         
	//   47   71:iaload          
	//   48   72:istore_2        
		k = i + 1;
	//   49   73:iload_1         
	//   50   74:iconst_1        
	//   51   75:iadd            
	//   52   76:istore_3        
		abyte0[i] = (byte)(j >> 16);
	//   53   77:aload_0         
	//   54   78:iload_1         
	//   55   79:iload_2         
	//   56   80:bipush          16
	//   57   82:ishr            
	//   58   83:int2byte        
	//   59   84:bastore         
		i = k + 1;
	//   60   85:iload_3         
	//   61   86:iconst_1        
	//   62   87:iadd            
	//   63   88:istore_1        
		abyte0[k] = (byte)(j >> 8);
	//   64   89:aload_0         
	//   65   90:iload_3         
	//   66   91:iload_2         
	//   67   92:bipush          8
	//   68   94:ishr            
	//   69   95:int2byte        
	//   70   96:bastore         
		abyte0[i] = (byte)j;
	//   71   97:aload_0         
	//   72   98:iload_1         
	//   73   99:iload_2         
	//   74  100:int2byte        
	//   75  101:bastore         
		return i + 1;
	//   76  102:iload_1         
	//   77  103:iconst_1        
	//   78  104:iadd            
	//   79  105:ireturn         
	}

	private static int _outputUptoMillion(char ac[], int i, int j, int k)
	{
		int i1 = TRIPLET_TO_CHARS[j];
	//    0    0:getstatic       #47  <Field int[] TRIPLET_TO_CHARS>
	//    1    3:iload_2         
	//    2    4:iaload          
	//    3    5:istore          5
		int l = i;
	//    4    7:iload_1         
	//    5    8:istore          4
		if(j > 9)
	//*   6   10:iload_2         
	//*   7   11:bipush          9
	//*   8   13:icmple          58
		{
			l = i;
	//    9   16:iload_1         
	//   10   17:istore          4
			if(j > 99)
	//*  11   19:iload_2         
	//*  12   20:bipush          99
	//*  13   22:icmple          39
			{
				ac[i] = (char)(i1 >> 16);
	//   14   25:aload_0         
	//   15   26:iload_1         
	//   16   27:iload           5
	//   17   29:bipush          16
	//   18   31:ishr            
	//   19   32:int2char        
	//   20   33:castore         
				l = i + 1;
	//   21   34:iload_1         
	//   22   35:iconst_1        
	//   23   36:iadd            
	//   24   37:istore          4
			}
			ac[l] = (char)(i1 >> 8 & 0x7f);
	//   25   39:aload_0         
	//   26   40:iload           4
	//   27   42:iload           5
	//   28   44:bipush          8
	//   29   46:ishr            
	//   30   47:bipush          127
	//   31   49:iand            
	//   32   50:int2char        
	//   33   51:castore         
			l++;
	//   34   52:iload           4
	//   35   54:iconst_1        
	//   36   55:iadd            
	//   37   56:istore          4
		}
		i = l + 1;
	//   38   58:iload           4
	//   39   60:iconst_1        
	//   40   61:iadd            
	//   41   62:istore_1        
		ac[l] = (char)(i1 & 0x7f);
	//   42   63:aload_0         
	//   43   64:iload           4
	//   44   66:iload           5
	//   45   68:bipush          127
	//   46   70:iand            
	//   47   71:int2char        
	//   48   72:castore         
		j = TRIPLET_TO_CHARS[k];
	//   49   73:getstatic       #47  <Field int[] TRIPLET_TO_CHARS>
	//   50   76:iload_3         
	//   51   77:iaload          
	//   52   78:istore_2        
		k = i + 1;
	//   53   79:iload_1         
	//   54   80:iconst_1        
	//   55   81:iadd            
	//   56   82:istore_3        
		ac[i] = (char)(j >> 16);
	//   57   83:aload_0         
	//   58   84:iload_1         
	//   59   85:iload_2         
	//   60   86:bipush          16
	//   61   88:ishr            
	//   62   89:int2char        
	//   63   90:castore         
		i = k + 1;
	//   64   91:iload_3         
	//   65   92:iconst_1        
	//   66   93:iadd            
	//   67   94:istore_1        
		ac[k] = (char)(j >> 8 & 0x7f);
	//   68   95:aload_0         
	//   69   96:iload_3         
	//   70   97:iload_2         
	//   71   98:bipush          8
	//   72  100:ishr            
	//   73  101:bipush          127
	//   74  103:iand            
	//   75  104:int2char        
	//   76  105:castore         
		ac[i] = (char)(j & 0x7f);
	//   77  106:aload_0         
	//   78  107:iload_1         
	//   79  108:iload_2         
	//   80  109:bipush          127
	//   81  111:iand            
	//   82  112:int2char        
	//   83  113:castore         
		return i + 1;
	//   84  114:iload_1         
	//   85  115:iconst_1        
	//   86  116:iadd            
	//   87  117:ireturn         
	}

	public static int outputInt(int i, byte abyte0[], int j)
	{
		int l = i;
	//    0    0:iload_0         
	//    1    1:istore          4
		int k = j;
	//    2    3:iload_2         
	//    3    4:istore_3        
		if(i < 0)
	//*   4    5:iload_0         
	//*   5    6:ifge            34
		{
			if(i == 0x80000000)
	//*   6    9:iload_0         
	//*   7   10:ldc1            #30  <Int 0x80000000>
	//*   8   12:icmpne          21
				return _outputSmallestI(abyte0, j);
	//    9   15:aload_1         
	//   10   16:iload_2         
	//   11   17:invokestatic    #132 <Method int _outputSmallestI(byte[], int)>
	//   12   20:ireturn         
			abyte0[j] = 45;
	//   13   21:aload_1         
	//   14   22:iload_2         
	//   15   23:bipush          45
	//   16   25:bastore         
			l = -i;
	//   17   26:iload_0         
	//   18   27:ineg            
	//   19   28:istore          4
			k = j + 1;
	//   20   30:iload_2         
	//   21   31:iconst_1        
	//   22   32:iadd            
	//   23   33:istore_3        
		}
		if(l < MILLION)
	//*  24   34:iload           4
	//*  25   36:getstatic       #118 <Field int MILLION>
	//*  26   39:icmpge          104
			if(l < 1000)
	//*  27   42:iload           4
	//*  28   44:sipush          1000
	//*  29   47:icmpge          78
			{
				if(l < 10)
	//*  30   50:iload           4
	//*  31   52:bipush          10
	//*  32   54:icmpge          70
				{
					abyte0[k] = (byte)(l + 48);
	//   33   57:aload_1         
	//   34   58:iload_3         
	//   35   59:iload           4
	//   36   61:bipush          48
	//   37   63:iadd            
	//   38   64:int2byte        
	//   39   65:bastore         
					return k + 1;
	//   40   66:iload_3         
	//   41   67:iconst_1        
	//   42   68:iadd            
	//   43   69:ireturn         
				} else
				{
					return _leading3(l, abyte0, k);
	//   44   70:iload           4
	//   45   72:aload_1         
	//   46   73:iload_3         
	//   47   74:invokestatic    #120 <Method int _leading3(int, byte[], int)>
	//   48   77:ireturn         
				}
			} else
			{
				i = l / 1000;
	//   49   78:iload           4
	//   50   80:sipush          1000
	//   51   83:idiv            
	//   52   84:istore_0        
				return _full3(l - i * 1000, abyte0, _leading3(i, abyte0, k));
	//   53   85:iload           4
	//   54   87:iload_0         
	//   55   88:sipush          1000
	//   56   91:imul            
	//   57   92:isub            
	//   58   93:aload_1         
	//   59   94:iload_0         
	//   60   95:aload_1         
	//   61   96:iload_3         
	//   62   97:invokestatic    #120 <Method int _leading3(int, byte[], int)>
	//   63  100:invokestatic    #134 <Method int _full3(int, byte[], int)>
	//   64  103:ireturn         
			}
		i = BILLION;
	//   65  104:getstatic       #136 <Field int BILLION>
	//   66  107:istore_0        
		if(l >= i)
	//*  67  108:iload           4
	//*  68  110:iload_0         
	//*  69  111:icmplt          156
		{
			j = l - i;
	//   70  114:iload           4
	//   71  116:iload_0         
	//   72  117:isub            
	//   73  118:istore_2        
			if(j >= i)
	//*  74  119:iload_2         
	//*  75  120:iload_0         
	//*  76  121:icmplt          140
			{
				j -= i;
	//   77  124:iload_2         
	//   78  125:iload_0         
	//   79  126:isub            
	//   80  127:istore_2        
				i = k + 1;
	//   81  128:iload_3         
	//   82  129:iconst_1        
	//   83  130:iadd            
	//   84  131:istore_0        
				abyte0[k] = 50;
	//   85  132:aload_1         
	//   86  133:iload_3         
	//   87  134:bipush          50
	//   88  136:bastore         
			} else
	//*  89  137:goto            149
			{
				i = k + 1;
	//   90  140:iload_3         
	//   91  141:iconst_1        
	//   92  142:iadd            
	//   93  143:istore_0        
				abyte0[k] = 49;
	//   94  144:aload_1         
	//   95  145:iload_3         
	//   96  146:bipush          49
	//   97  148:bastore         
			}
			return _outputFullBillion(j, abyte0, i);
	//   98  149:iload_2         
	//   99  150:aload_1         
	//  100  151:iload_0         
	//  101  152:invokestatic    #138 <Method int _outputFullBillion(int, byte[], int)>
	//  102  155:ireturn         
		} else
		{
			i = l / 1000;
	//  103  156:iload           4
	//  104  158:sipush          1000
	//  105  161:idiv            
	//  106  162:istore_0        
			j = i / 1000;
	//  107  163:iload_0         
	//  108  164:sipush          1000
	//  109  167:idiv            
	//  110  168:istore_2        
			return _full3(l - i * 1000, abyte0, _full3(i - j * 1000, abyte0, _leading3(j, abyte0, k)));
	//  111  169:iload           4
	//  112  171:iload_0         
	//  113  172:sipush          1000
	//  114  175:imul            
	//  115  176:isub            
	//  116  177:aload_1         
	//  117  178:iload_0         
	//  118  179:iload_2         
	//  119  180:sipush          1000
	//  120  183:imul            
	//  121  184:isub            
	//  122  185:aload_1         
	//  123  186:iload_2         
	//  124  187:aload_1         
	//  125  188:iload_3         
	//  126  189:invokestatic    #120 <Method int _leading3(int, byte[], int)>
	//  127  192:invokestatic    #134 <Method int _full3(int, byte[], int)>
	//  128  195:invokestatic    #134 <Method int _full3(int, byte[], int)>
	//  129  198:ireturn         
		}
	}

	public static int outputInt(int i, char ac[], int j)
	{
		int l = i;
	//    0    0:iload_0         
	//    1    1:istore          4
		int k = j;
	//    2    3:iload_2         
	//    3    4:istore_3        
		if(i < 0)
	//*   4    5:iload_0         
	//*   5    6:ifge            34
		{
			if(i == 0x80000000)
	//*   6    9:iload_0         
	//*   7   10:ldc1            #30  <Int 0x80000000>
	//*   8   12:icmpne          21
				return _outputSmallestI(ac, j);
	//    9   15:aload_1         
	//   10   16:iload_2         
	//   11   17:invokestatic    #140 <Method int _outputSmallestI(char[], int)>
	//   12   20:ireturn         
			ac[j] = '-';
	//   13   21:aload_1         
	//   14   22:iload_2         
	//   15   23:bipush          45
	//   16   25:castore         
			l = -i;
	//   17   26:iload_0         
	//   18   27:ineg            
	//   19   28:istore          4
			k = j + 1;
	//   20   30:iload_2         
	//   21   31:iconst_1        
	//   22   32:iadd            
	//   23   33:istore_3        
		}
		if(l < MILLION)
	//*  24   34:iload           4
	//*  25   36:getstatic       #118 <Field int MILLION>
	//*  26   39:icmpge          104
			if(l < 1000)
	//*  27   42:iload           4
	//*  28   44:sipush          1000
	//*  29   47:icmpge          78
			{
				if(l < 10)
	//*  30   50:iload           4
	//*  31   52:bipush          10
	//*  32   54:icmpge          70
				{
					ac[k] = (char)(l + 48);
	//   33   57:aload_1         
	//   34   58:iload_3         
	//   35   59:iload           4
	//   36   61:bipush          48
	//   37   63:iadd            
	//   38   64:int2char        
	//   39   65:castore         
					return k + 1;
	//   40   66:iload_3         
	//   41   67:iconst_1        
	//   42   68:iadd            
	//   43   69:ireturn         
				} else
				{
					return _leading3(l, ac, k);
	//   44   70:iload           4
	//   45   72:aload_1         
	//   46   73:iload_3         
	//   47   74:invokestatic    #126 <Method int _leading3(int, char[], int)>
	//   48   77:ireturn         
				}
			} else
			{
				i = l / 1000;
	//   49   78:iload           4
	//   50   80:sipush          1000
	//   51   83:idiv            
	//   52   84:istore_0        
				return _full3(l - i * 1000, ac, _leading3(i, ac, k));
	//   53   85:iload           4
	//   54   87:iload_0         
	//   55   88:sipush          1000
	//   56   91:imul            
	//   57   92:isub            
	//   58   93:aload_1         
	//   59   94:iload_0         
	//   60   95:aload_1         
	//   61   96:iload_3         
	//   62   97:invokestatic    #126 <Method int _leading3(int, char[], int)>
	//   63  100:invokestatic    #142 <Method int _full3(int, char[], int)>
	//   64  103:ireturn         
			}
		i = BILLION;
	//   65  104:getstatic       #136 <Field int BILLION>
	//   66  107:istore_0        
		if(l >= i)
	//*  67  108:iload           4
	//*  68  110:iload_0         
	//*  69  111:icmplt          156
		{
			j = l - i;
	//   70  114:iload           4
	//   71  116:iload_0         
	//   72  117:isub            
	//   73  118:istore_2        
			if(j >= i)
	//*  74  119:iload_2         
	//*  75  120:iload_0         
	//*  76  121:icmplt          140
			{
				j -= i;
	//   77  124:iload_2         
	//   78  125:iload_0         
	//   79  126:isub            
	//   80  127:istore_2        
				i = k + 1;
	//   81  128:iload_3         
	//   82  129:iconst_1        
	//   83  130:iadd            
	//   84  131:istore_0        
				ac[k] = '2';
	//   85  132:aload_1         
	//   86  133:iload_3         
	//   87  134:bipush          50
	//   88  136:castore         
			} else
	//*  89  137:goto            149
			{
				i = k + 1;
	//   90  140:iload_3         
	//   91  141:iconst_1        
	//   92  142:iadd            
	//   93  143:istore_0        
				ac[k] = '1';
	//   94  144:aload_1         
	//   95  145:iload_3         
	//   96  146:bipush          49
	//   97  148:castore         
			}
			return _outputFullBillion(j, ac, i);
	//   98  149:iload_2         
	//   99  150:aload_1         
	//  100  151:iload_0         
	//  101  152:invokestatic    #144 <Method int _outputFullBillion(int, char[], int)>
	//  102  155:ireturn         
		} else
		{
			i = l / 1000;
	//  103  156:iload           4
	//  104  158:sipush          1000
	//  105  161:idiv            
	//  106  162:istore_0        
			j = i / 1000;
	//  107  163:iload_0         
	//  108  164:sipush          1000
	//  109  167:idiv            
	//  110  168:istore_2        
			return _full3(l - i * 1000, ac, _full3(i - j * 1000, ac, _leading3(j, ac, k)));
	//  111  169:iload           4
	//  112  171:iload_0         
	//  113  172:sipush          1000
	//  114  175:imul            
	//  115  176:isub            
	//  116  177:aload_1         
	//  117  178:iload_0         
	//  118  179:iload_2         
	//  119  180:sipush          1000
	//  120  183:imul            
	//  121  184:isub            
	//  122  185:aload_1         
	//  123  186:iload_2         
	//  124  187:aload_1         
	//  125  188:iload_3         
	//  126  189:invokestatic    #126 <Method int _leading3(int, char[], int)>
	//  127  192:invokestatic    #142 <Method int _full3(int, char[], int)>
	//  128  195:invokestatic    #142 <Method int _full3(int, char[], int)>
	//  129  198:ireturn         
		}
	}

	public static int outputLong(long l, byte abyte0[], int i)
	{
		int j;
		long l1;
		if(l < 0L)
	//*   0    0:lload_0         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifge            53
		{
			if(l > MIN_INT_AS_LONG)
	//*   4    6:lload_0         
	//*   5    7:getstatic       #148 <Field long MIN_INT_AS_LONG>
	//*   6   10:lcmp            
	//*   7   11:ifle            22
				return outputInt((int)l, abyte0, i);
	//    8   14:lload_0         
	//    9   15:l2i             
	//   10   16:aload_2         
	//   11   17:iload_3         
	//   12   18:invokestatic    #150 <Method int outputInt(int, byte[], int)>
	//   13   21:ireturn         
			if(l == 0x0L)
	//*  14   22:lload_0         
	//*  15   23:ldc2w           #39  <Long 0x0L>
	//*  16   26:lcmp            
	//*  17   27:ifne            36
				return _outputSmallestL(abyte0, i);
	//   18   30:aload_2         
	//   19   31:iload_3         
	//   20   32:invokestatic    #152 <Method int _outputSmallestL(byte[], int)>
	//   21   35:ireturn         
			abyte0[i] = 45;
	//   22   36:aload_2         
	//   23   37:iload_3         
	//   24   38:bipush          45
	//   25   40:bastore         
			l1 = -l;
	//   26   41:lload_0         
	//   27   42:lneg            
	//   28   43:lstore          5
			j = i + 1;
	//   29   45:iload_3         
	//   30   46:iconst_1        
	//   31   47:iadd            
	//   32   48:istore          4
		} else
	//*  33   50:goto            75
		{
			l1 = l;
	//   34   53:lload_0         
	//   35   54:lstore          5
			j = i;
	//   36   56:iload_3         
	//   37   57:istore          4
			if(l <= MAX_INT_AS_LONG)
	//*  38   59:lload_0         
	//*  39   60:getstatic       #154 <Field long MAX_INT_AS_LONG>
	//*  40   63:lcmp            
	//*  41   64:ifgt            75
				return outputInt((int)l, abyte0, i);
	//   42   67:lload_0         
	//   43   68:l2i             
	//   44   69:aload_2         
	//   45   70:iload_3         
	//   46   71:invokestatic    #150 <Method int outputInt(int, byte[], int)>
	//   47   74:ireturn         
		}
		l = BILLION_L;
	//   48   75:getstatic       #156 <Field long BILLION_L>
	//   49   78:lstore_0        
		long l2 = l1 / l;
	//   50   79:lload           5
	//   51   81:lload_0         
	//   52   82:ldiv            
	//   53   83:lstore          7
		if(l2 < l)
	//*  54   85:lload           7
	//*  55   87:lload_0         
	//*  56   88:lcmp            
	//*  57   89:ifge            105
		{
			i = _outputUptoBillion((int)l2, abyte0, j);
	//   58   92:lload           7
	//   59   94:l2i             
	//   60   95:aload_2         
	//   61   96:iload           4
	//   62   98:invokestatic    #158 <Method int _outputUptoBillion(int, byte[], int)>
	//   63  101:istore_3        
		} else
	//*  64  102:goto            135
		{
			long l3 = l2 / l;
	//   65  105:lload           7
	//   66  107:lload_0         
	//   67  108:ldiv            
	//   68  109:lstore          9
			i = _leading3((int)l3, abyte0, j);
	//   69  111:lload           9
	//   70  113:l2i             
	//   71  114:aload_2         
	//   72  115:iload           4
	//   73  117:invokestatic    #120 <Method int _leading3(int, byte[], int)>
	//   74  120:istore_3        
			i = _outputFullBillion((int)(l2 - l * l3), abyte0, i);
	//   75  121:lload           7
	//   76  123:lload_0         
	//   77  124:lload           9
	//   78  126:lmul            
	//   79  127:lsub            
	//   80  128:l2i             
	//   81  129:aload_2         
	//   82  130:iload_3         
	//   83  131:invokestatic    #138 <Method int _outputFullBillion(int, byte[], int)>
	//   84  134:istore_3        
		}
		return _outputFullBillion((int)(l1 - l2 * l), abyte0, i);
	//   85  135:lload           5
	//   86  137:lload           7
	//   87  139:lload_0         
	//   88  140:lmul            
	//   89  141:lsub            
	//   90  142:l2i             
	//   91  143:aload_2         
	//   92  144:iload_3         
	//   93  145:invokestatic    #138 <Method int _outputFullBillion(int, byte[], int)>
	//   94  148:ireturn         
	}

	public static int outputLong(long l, char ac[], int i)
	{
		int j;
		long l1;
		if(l < 0L)
	//*   0    0:lload_0         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifge            53
		{
			if(l > MIN_INT_AS_LONG)
	//*   4    6:lload_0         
	//*   5    7:getstatic       #148 <Field long MIN_INT_AS_LONG>
	//*   6   10:lcmp            
	//*   7   11:ifle            22
				return outputInt((int)l, ac, i);
	//    8   14:lload_0         
	//    9   15:l2i             
	//   10   16:aload_2         
	//   11   17:iload_3         
	//   12   18:invokestatic    #161 <Method int outputInt(int, char[], int)>
	//   13   21:ireturn         
			if(l == 0x0L)
	//*  14   22:lload_0         
	//*  15   23:ldc2w           #39  <Long 0x0L>
	//*  16   26:lcmp            
	//*  17   27:ifne            36
				return _outputSmallestL(ac, i);
	//   18   30:aload_2         
	//   19   31:iload_3         
	//   20   32:invokestatic    #163 <Method int _outputSmallestL(char[], int)>
	//   21   35:ireturn         
			ac[i] = '-';
	//   22   36:aload_2         
	//   23   37:iload_3         
	//   24   38:bipush          45
	//   25   40:castore         
			l1 = -l;
	//   26   41:lload_0         
	//   27   42:lneg            
	//   28   43:lstore          5
			j = i + 1;
	//   29   45:iload_3         
	//   30   46:iconst_1        
	//   31   47:iadd            
	//   32   48:istore          4
		} else
	//*  33   50:goto            75
		{
			l1 = l;
	//   34   53:lload_0         
	//   35   54:lstore          5
			j = i;
	//   36   56:iload_3         
	//   37   57:istore          4
			if(l <= MAX_INT_AS_LONG)
	//*  38   59:lload_0         
	//*  39   60:getstatic       #154 <Field long MAX_INT_AS_LONG>
	//*  40   63:lcmp            
	//*  41   64:ifgt            75
				return outputInt((int)l, ac, i);
	//   42   67:lload_0         
	//   43   68:l2i             
	//   44   69:aload_2         
	//   45   70:iload_3         
	//   46   71:invokestatic    #161 <Method int outputInt(int, char[], int)>
	//   47   74:ireturn         
		}
		l = BILLION_L;
	//   48   75:getstatic       #156 <Field long BILLION_L>
	//   49   78:lstore_0        
		long l2 = l1 / l;
	//   50   79:lload           5
	//   51   81:lload_0         
	//   52   82:ldiv            
	//   53   83:lstore          7
		if(l2 < l)
	//*  54   85:lload           7
	//*  55   87:lload_0         
	//*  56   88:lcmp            
	//*  57   89:ifge            105
		{
			i = _outputUptoBillion((int)l2, ac, j);
	//   58   92:lload           7
	//   59   94:l2i             
	//   60   95:aload_2         
	//   61   96:iload           4
	//   62   98:invokestatic    #165 <Method int _outputUptoBillion(int, char[], int)>
	//   63  101:istore_3        
		} else
	//*  64  102:goto            135
		{
			long l3 = l2 / l;
	//   65  105:lload           7
	//   66  107:lload_0         
	//   67  108:ldiv            
	//   68  109:lstore          9
			i = _leading3((int)l3, ac, j);
	//   69  111:lload           9
	//   70  113:l2i             
	//   71  114:aload_2         
	//   72  115:iload           4
	//   73  117:invokestatic    #126 <Method int _leading3(int, char[], int)>
	//   74  120:istore_3        
			i = _outputFullBillion((int)(l2 - l * l3), ac, i);
	//   75  121:lload           7
	//   76  123:lload_0         
	//   77  124:lload           9
	//   78  126:lmul            
	//   79  127:lsub            
	//   80  128:l2i             
	//   81  129:aload_2         
	//   82  130:iload_3         
	//   83  131:invokestatic    #144 <Method int _outputFullBillion(int, char[], int)>
	//   84  134:istore_3        
		}
		return _outputFullBillion((int)(l1 - l2 * l), ac, i);
	//   85  135:lload           5
	//   86  137:lload           7
	//   87  139:lload_0         
	//   88  140:lmul            
	//   89  141:lsub            
	//   90  142:l2i             
	//   91  143:aload_2         
	//   92  144:iload_3         
	//   93  145:invokestatic    #144 <Method int _outputFullBillion(int, char[], int)>
	//   94  148:ireturn         
	}

	public static String toString(double d)
	{
		return Double.toString(d);
	//    0    0:dload_0         
	//    1    1:invokestatic    #171 <Method String Double.toString(double)>
	//    2    4:areturn         
	}

	public static String toString(float f)
	{
		return Float.toString(f);
	//    0    0:fload_0         
	//    1    1:invokestatic    #176 <Method String Float.toString(float)>
	//    2    4:areturn         
	}

	public static String toString(int i)
	{
		String as[] = sSmallIntStrs;
	//    0    0:getstatic       #71  <Field String[] sSmallIntStrs>
	//    1    3:astore_2        
		if(i < as.length)
	//*   2    4:iload_0         
	//*   3    5:aload_2         
	//*   4    6:arraylength     
	//*   5    7:icmpge          37
		{
			if(i >= 0)
	//*   6   10:iload_0         
	//*   7   11:iflt            18
				return as[i];
	//    8   14:aload_2         
	//    9   15:iload_0         
	//   10   16:aaload          
	//   11   17:areturn         
			int j = -i - 1;
	//   12   18:iload_0         
	//   13   19:ineg            
	//   14   20:iconst_1        
	//   15   21:isub            
	//   16   22:istore_1        
			as = sSmallIntStrs2;
	//   17   23:getstatic       #93  <Field String[] sSmallIntStrs2>
	//   18   26:astore_2        
			if(j < as.length)
	//*  19   27:iload_1         
	//*  20   28:aload_2         
	//*  21   29:arraylength     
	//*  22   30:icmpge          37
				return as[j];
	//   23   33:aload_2         
	//   24   34:iload_1         
	//   25   35:aaload          
	//   26   36:areturn         
		}
		return Integer.toString(i);
	//   27   37:iload_0         
	//   28   38:invokestatic    #180 <Method String Integer.toString(int)>
	//   29   41:areturn         
	}

	public static String toString(long l)
	{
		if(l <= 0x7fffffffL && l >= 0x80000000L)
	//*   0    0:lload_0         
	//*   1    1:ldc2w           #13  <Long 0x7fffffffL>
	//*   2    4:lcmp            
	//*   3    5:ifgt            22
	//*   4    8:lload_0         
	//*   5    9:ldc2w           #18  <Long 0x80000000L>
	//*   6   12:lcmp            
	//*   7   13:iflt            22
			return toString((int)l);
	//    8   16:lload_0         
	//    9   17:l2i             
	//   10   18:invokestatic    #181 <Method String toString(int)>
	//   11   21:areturn         
		else
			return Long.toString(l);
	//   12   22:lload_0         
	//   13   23:invokestatic    #185 <Method String Long.toString(long)>
	//   14   26:areturn         
	}

	private static int BILLION = 0x3b9aca00;
	private static long BILLION_L = 0x3b9aca00L;
	private static long MAX_INT_AS_LONG = 0x7fffffffL;
	private static int MILLION = 0xf4240;
	private static long MIN_INT_AS_LONG = 0x80000000L;
	static final String SMALLEST_INT = String.valueOf(0x80000000);
	static final String SMALLEST_LONG = String.valueOf(0x0L);
	private static final int TRIPLET_TO_CHARS[];
	private static final String sSmallIntStrs[] = {
		"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", 
		"10"
	};
	private static final String sSmallIntStrs2[] = {
		"-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"
	};

	static 
	{
	//    0    0:ldc1            #30  <Int 0x80000000>
	//    1    2:invokestatic    #36  <Method String String.valueOf(int)>
	//    2    5:putstatic       #38  <Field String SMALLEST_INT>
	//    3    8:ldc2w           #39  <Long 0x0L>
	//    4   11:invokestatic    #43  <Method String String.valueOf(long)>
	//    5   14:putstatic       #45  <Field String SMALLEST_LONG>
		TRIPLET_TO_CHARS = new int[1000];
	//    6   17:sipush          1000
	//    7   20:newarray        int[]
	//    8   22:putstatic       #47  <Field int[] TRIPLET_TO_CHARS>
		int j = 0;
	//    9   25:iconst_0        
	//   10   26:istore_1        
		int i = 0;
	//   11   27:iconst_0        
	//   12   28:istore_0        
		for(; j < 10; j++)
	//*  13   29:iload_1         
	//*  14   30:bipush          10
	//*  15   32:icmpge          101
		{
			for(int k = 0; k < 10; k++)
	//*  16   35:iconst_0        
	//*  17   36:istore_2        
	//*  18   37:iload_2         
	//*  19   38:bipush          10
	//*  20   40:icmpge          94
			{
				for(int l = 0; l < 10;)
	//*  21   43:iconst_0        
	//*  22   44:istore_3        
	//*  23   45:iload_3         
	//*  24   46:bipush          10
	//*  25   48:icmpge          87
				{
					TRIPLET_TO_CHARS[i] = j + 48 << 16 | k + 48 << 8 | l + 48;
	//   26   51:getstatic       #47  <Field int[] TRIPLET_TO_CHARS>
	//   27   54:iload_0         
	//   28   55:iload_1         
	//   29   56:bipush          48
	//   30   58:iadd            
	//   31   59:bipush          16
	//   32   61:ishl            
	//   33   62:iload_2         
	//   34   63:bipush          48
	//   35   65:iadd            
	//   36   66:bipush          8
	//   37   68:ishl            
	//   38   69:ior             
	//   39   70:iload_3         
	//   40   71:bipush          48
	//   41   73:iadd            
	//   42   74:ior             
	//   43   75:iastore         
					l++;
	//   44   76:iload_3         
	//   45   77:iconst_1        
	//   46   78:iadd            
	//   47   79:istore_3        
					i++;
	//   48   80:iload_0         
	//   49   81:iconst_1        
	//   50   82:iadd            
	//   51   83:istore_0        
				}

			}

	//   52   84:goto            45
	//   53   87:iload_2         
	//   54   88:iconst_1        
	//   55   89:iadd            
	//   56   90:istore_2        
		}

	//   57   91:goto            37
	//   58   94:iload_1         
	//   59   95:iconst_1        
	//   60   96:iadd            
	//   61   97:istore_1        
	//*  62   98:goto            29
	//   63  101:bipush          11
	//   64  103:anewarray       String[]
	//   65  106:dup             
	//   66  107:iconst_0        
	//   67  108:ldc1            #49  <String "0">
	//   68  110:aastore         
	//   69  111:dup             
	//   70  112:iconst_1        
	//   71  113:ldc1            #51  <String "1">
	//   72  115:aastore         
	//   73  116:dup             
	//   74  117:iconst_2        
	//   75  118:ldc1            #53  <String "2">
	//   76  120:aastore         
	//   77  121:dup             
	//   78  122:iconst_3        
	//   79  123:ldc1            #55  <String "3">
	//   80  125:aastore         
	//   81  126:dup             
	//   82  127:iconst_4        
	//   83  128:ldc1            #57  <String "4">
	//   84  130:aastore         
	//   85  131:dup             
	//   86  132:iconst_5        
	//   87  133:ldc1            #59  <String "5">
	//   88  135:aastore         
	//   89  136:dup             
	//   90  137:bipush          6
	//   91  139:ldc1            #61  <String "6">
	//   92  141:aastore         
	//   93  142:dup             
	//   94  143:bipush          7
	//   95  145:ldc1            #63  <String "7">
	//   96  147:aastore         
	//   97  148:dup             
	//   98  149:bipush          8
	//   99  151:ldc1            #65  <String "8">
	//  100  153:aastore         
	//  101  154:dup             
	//  102  155:bipush          9
	//  103  157:ldc1            #67  <String "9">
	//  104  159:aastore         
	//  105  160:dup             
	//  106  161:bipush          10
	//  107  163:ldc1            #69  <String "10">
	//  108  165:aastore         
	//  109  166:putstatic       #71  <Field String[] sSmallIntStrs>
	//  110  169:bipush          10
	//  111  171:anewarray       String[]
	//  112  174:dup             
	//  113  175:iconst_0        
	//  114  176:ldc1            #73  <String "-1">
	//  115  178:aastore         
	//  116  179:dup             
	//  117  180:iconst_1        
	//  118  181:ldc1            #75  <String "-2">
	//  119  183:aastore         
	//  120  184:dup             
	//  121  185:iconst_2        
	//  122  186:ldc1            #77  <String "-3">
	//  123  188:aastore         
	//  124  189:dup             
	//  125  190:iconst_3        
	//  126  191:ldc1            #79  <String "-4">
	//  127  193:aastore         
	//  128  194:dup             
	//  129  195:iconst_4        
	//  130  196:ldc1            #81  <String "-5">
	//  131  198:aastore         
	//  132  199:dup             
	//  133  200:iconst_5        
	//  134  201:ldc1            #83  <String "-6">
	//  135  203:aastore         
	//  136  204:dup             
	//  137  205:bipush          6
	//  138  207:ldc1            #85  <String "-7">
	//  139  209:aastore         
	//  140  210:dup             
	//  141  211:bipush          7
	//  142  213:ldc1            #87  <String "-8">
	//  143  215:aastore         
	//  144  216:dup             
	//  145  217:bipush          8
	//  146  219:ldc1            #89  <String "-9">
	//  147  221:aastore         
	//  148  222:dup             
	//  149  223:bipush          9
	//  150  225:ldc1            #91  <String "-10">
	//  151  227:aastore         
	//  152  228:putstatic       #93  <Field String[] sSmallIntStrs2>
	//* 153  231:return          
	}
}
