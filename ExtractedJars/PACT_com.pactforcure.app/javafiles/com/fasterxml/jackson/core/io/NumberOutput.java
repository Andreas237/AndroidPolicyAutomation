// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.io;


public final class NumberOutput
{

	public NumberOutput()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #115 <Method void Object()>
	//    2    4:return          
	}

	private static int calcLongStrLength(long l)
	{
		int i = 10;
	//    0    0:bipush          10
	//    1    2:istore_2        
		long l1 = TEN_BILLION_L;
	//    2    3:getstatic       #37  <Field long TEN_BILLION_L>
	//    3    6:lstore_3        
		do
		{
			if(l < l1 || i == 19)
	//*   4    7:lload_0         
	//*   5    8:lload_3         
	//*   6    9:lcmp            
	//*   7   10:iflt            19
	//*   8   13:iload_2         
	//*   9   14:bipush          19
	//*  10   16:icmpne          21
				return i;
	//   11   19:iload_2         
	//   12   20:ireturn         
			i++;
	//   13   21:iload_2         
	//   14   22:iconst_1        
	//   15   23:iadd            
	//   16   24:istore_2        
			l1 = (l1 << 3) + (l1 << 1);
	//   17   25:lload_3         
	//   18   26:iconst_3        
	//   19   27:lshl            
	//   20   28:lload_3         
	//   21   29:iconst_1        
	//   22   30:lshl            
	//   23   31:ladd            
	//   24   32:lstore_3        
		} while(true);
	//   25   33:goto            7
	}

	private static int full3(int i, byte abyte0[], int j)
	{
		int l = i << 2;
	//    0    0:iload_0         
	//    1    1:iconst_2        
	//    2    2:ishl            
	//    3    3:istore          4
		i = j + 1;
	//    4    5:iload_2         
	//    5    6:iconst_1        
	//    6    7:iadd            
	//    7    8:istore_0        
		byte abyte1[] = FULL_TRIPLETS_B;
	//    8    9:getstatic       #65  <Field byte[] FULL_TRIPLETS_B>
	//    9   12:astore          5
		int k = l + 1;
	//   10   14:iload           4
	//   11   16:iconst_1        
	//   12   17:iadd            
	//   13   18:istore_3        
		abyte0[j] = abyte1[l];
	//   14   19:aload_1         
	//   15   20:iload_2         
	//   16   21:aload           5
	//   17   23:iload           4
	//   18   25:baload          
	//   19   26:bastore         
		j = i + 1;
	//   20   27:iload_0         
	//   21   28:iconst_1        
	//   22   29:iadd            
	//   23   30:istore_2        
		abyte0[i] = FULL_TRIPLETS_B[k];
	//   24   31:aload_1         
	//   25   32:iload_0         
	//   26   33:getstatic       #65  <Field byte[] FULL_TRIPLETS_B>
	//   27   36:iload_3         
	//   28   37:baload          
	//   29   38:bastore         
		abyte0[j] = FULL_TRIPLETS_B[k + 1];
	//   30   39:aload_1         
	//   31   40:iload_2         
	//   32   41:getstatic       #65  <Field byte[] FULL_TRIPLETS_B>
	//   33   44:iload_3         
	//   34   45:iconst_1        
	//   35   46:iadd            
	//   36   47:baload          
	//   37   48:bastore         
		return j + 1;
	//   38   49:iload_2         
	//   39   50:iconst_1        
	//   40   51:iadd            
	//   41   52:ireturn         
	}

	private static int full3(int i, char ac[], int j)
	{
		int l = i << 2;
	//    0    0:iload_0         
	//    1    1:iconst_2        
	//    2    2:ishl            
	//    3    3:istore          4
		i = j + 1;
	//    4    5:iload_2         
	//    5    6:iconst_1        
	//    6    7:iadd            
	//    7    8:istore_0        
		char ac1[] = FULL_3;
	//    8    9:getstatic       #63  <Field char[] FULL_3>
	//    9   12:astore          5
		int k = l + 1;
	//   10   14:iload           4
	//   11   16:iconst_1        
	//   12   17:iadd            
	//   13   18:istore_3        
		ac[j] = ac1[l];
	//   14   19:aload_1         
	//   15   20:iload_2         
	//   16   21:aload           5
	//   17   23:iload           4
	//   18   25:caload          
	//   19   26:castore         
		j = i + 1;
	//   20   27:iload_0         
	//   21   28:iconst_1        
	//   22   29:iadd            
	//   23   30:istore_2        
		ac[i] = FULL_3[k];
	//   24   31:aload_1         
	//   25   32:iload_0         
	//   26   33:getstatic       #63  <Field char[] FULL_3>
	//   27   36:iload_3         
	//   28   37:caload          
	//   29   38:castore         
		ac[j] = FULL_3[k + 1];
	//   30   39:aload_1         
	//   31   40:iload_2         
	//   32   41:getstatic       #63  <Field char[] FULL_3>
	//   33   44:iload_3         
	//   34   45:iconst_1        
	//   35   46:iadd            
	//   36   47:caload          
	//   37   48:castore         
		return j + 1;
	//   38   49:iload_2         
	//   39   50:iconst_1        
	//   40   51:iadd            
	//   41   52:ireturn         
	}

	private static int leading3(int i, byte abyte0[], int j)
	{
		i <<= 2;
	//    0    0:iload_0         
	//    1    1:iconst_2        
	//    2    2:ishl            
	//    3    3:istore_0        
		char ac[] = LEAD_3;
	//    4    4:getstatic       #61  <Field char[] LEAD_3>
	//    5    7:astore          5
		int k = i + 1;
	//    6    9:iload_0         
	//    7   10:iconst_1        
	//    8   11:iadd            
	//    9   12:istore_3        
		char c = ac[i];
	//   10   13:aload           5
	//   11   15:iload_0         
	//   12   16:caload          
	//   13   17:istore          4
		i = j;
	//   14   19:iload_2         
	//   15   20:istore_0        
		if(c != 0)
	//*  16   21:iload           4
	//*  17   23:ifeq            36
		{
			abyte0[j] = (byte)c;
	//   18   26:aload_1         
	//   19   27:iload_2         
	//   20   28:iload           4
	//   21   30:int2byte        
	//   22   31:bastore         
			i = j + 1;
	//   23   32:iload_2         
	//   24   33:iconst_1        
	//   25   34:iadd            
	//   26   35:istore_0        
		}
		c = LEAD_3[k];
	//   27   36:getstatic       #61  <Field char[] LEAD_3>
	//   28   39:iload_3         
	//   29   40:caload          
	//   30   41:istore          4
		j = i;
	//   31   43:iload_0         
	//   32   44:istore_2        
		if(c != 0)
	//*  33   45:iload           4
	//*  34   47:ifeq            60
		{
			abyte0[i] = (byte)c;
	//   35   50:aload_1         
	//   36   51:iload_0         
	//   37   52:iload           4
	//   38   54:int2byte        
	//   39   55:bastore         
			j = i + 1;
	//   40   56:iload_0         
	//   41   57:iconst_1        
	//   42   58:iadd            
	//   43   59:istore_2        
		}
		abyte0[j] = (byte)LEAD_3[k + 1];
	//   44   60:aload_1         
	//   45   61:iload_2         
	//   46   62:getstatic       #61  <Field char[] LEAD_3>
	//   47   65:iload_3         
	//   48   66:iconst_1        
	//   49   67:iadd            
	//   50   68:caload          
	//   51   69:int2byte        
	//   52   70:bastore         
		return j + 1;
	//   53   71:iload_2         
	//   54   72:iconst_1        
	//   55   73:iadd            
	//   56   74:ireturn         
	}

	private static int leading3(int i, char ac[], int j)
	{
		i <<= 2;
	//    0    0:iload_0         
	//    1    1:iconst_2        
	//    2    2:ishl            
	//    3    3:istore_0        
		char ac1[] = LEAD_3;
	//    4    4:getstatic       #61  <Field char[] LEAD_3>
	//    5    7:astore          5
		int k = i + 1;
	//    6    9:iload_0         
	//    7   10:iconst_1        
	//    8   11:iadd            
	//    9   12:istore          4
		char c = ac1[i];
	//   10   14:aload           5
	//   11   16:iload_0         
	//   12   17:caload          
	//   13   18:istore_3        
		i = j;
	//   14   19:iload_2         
	//   15   20:istore_0        
		if(c != 0)
	//*  16   21:iload_3         
	//*  17   22:ifeq            33
		{
			ac[j] = c;
	//   18   25:aload_1         
	//   19   26:iload_2         
	//   20   27:iload_3         
	//   21   28:castore         
			i = j + 1;
	//   22   29:iload_2         
	//   23   30:iconst_1        
	//   24   31:iadd            
	//   25   32:istore_0        
		}
		c = LEAD_3[k];
	//   26   33:getstatic       #61  <Field char[] LEAD_3>
	//   27   36:iload           4
	//   28   38:caload          
	//   29   39:istore_3        
		j = i;
	//   30   40:iload_0         
	//   31   41:istore_2        
		if(c != 0)
	//*  32   42:iload_3         
	//*  33   43:ifeq            54
		{
			ac[i] = c;
	//   34   46:aload_1         
	//   35   47:iload_0         
	//   36   48:iload_3         
	//   37   49:castore         
			j = i + 1;
	//   38   50:iload_0         
	//   39   51:iconst_1        
	//   40   52:iadd            
	//   41   53:istore_2        
		}
		ac[j] = LEAD_3[k + 1];
	//   42   54:aload_1         
	//   43   55:iload_2         
	//   44   56:getstatic       #61  <Field char[] LEAD_3>
	//   45   59:iload           4
	//   46   61:iconst_1        
	//   47   62:iadd            
	//   48   63:caload          
	//   49   64:castore         
		return j + 1;
	//   50   65:iload_2         
	//   51   66:iconst_1        
	//   52   67:iadd            
	//   53   68:ireturn         
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
	//*   5    6:ifge            36
		{
			if(i == 0x80000000)
	//*   6    9:iload_0         
	//*   7   10:ldc1            #123 <Int 0x80000000>
	//*   8   12:icmpne          23
				return outputLong(i, abyte0, j);
	//    9   15:iload_0         
	//   10   16:i2l             
	//   11   17:aload_1         
	//   12   18:iload_2         
	//   13   19:invokestatic    #127 <Method int outputLong(long, byte[], int)>
	//   14   22:ireturn         
			abyte0[j] = 45;
	//   15   23:aload_1         
	//   16   24:iload_2         
	//   17   25:bipush          45
	//   18   27:bastore         
			l = -i;
	//   19   28:iload_0         
	//   20   29:ineg            
	//   21   30:istore          4
			k = j + 1;
	//   22   32:iload_2         
	//   23   33:iconst_1        
	//   24   34:iadd            
	//   25   35:istore_3        
		}
		if(l < MILLION)
	//*  26   36:iload           4
	//*  27   38:getstatic       #30  <Field int MILLION>
	//*  28   41:icmpge          114
		{
			if(l < 1000)
	//*  29   44:iload           4
	//*  30   46:sipush          1000
	//*  31   49:icmpge          85
			{
				if(l < 10)
	//*  32   52:iload           4
	//*  33   54:bipush          10
	//*  34   56:icmpge          74
				{
					abyte0[k] = (byte)(l + 48);
	//   35   59:aload_1         
	//   36   60:iload_3         
	//   37   61:iload           4
	//   38   63:bipush          48
	//   39   65:iadd            
	//   40   66:int2byte        
	//   41   67:bastore         
					i = k + 1;
	//   42   68:iload_3         
	//   43   69:iconst_1        
	//   44   70:iadd            
	//   45   71:istore_0        
				} else
	//*  46   72:iload_0         
	//*  47   73:ireturn         
				{
					i = leading3(l, abyte0, k);
	//   48   74:iload           4
	//   49   76:aload_1         
	//   50   77:iload_3         
	//   51   78:invokestatic    #129 <Method int leading3(int, byte[], int)>
	//   52   81:istore_0        
				}
			} else
	//*  53   82:goto            72
			{
				i = l / 1000;
	//   54   85:iload           4
	//   55   87:sipush          1000
	//   56   90:idiv            
	//   57   91:istore_0        
				i = full3(l - i * 1000, abyte0, leading3(i, abyte0, k));
	//   58   92:iload           4
	//   59   94:iload_0         
	//   60   95:sipush          1000
	//   61   98:imul            
	//   62   99:isub            
	//   63  100:aload_1         
	//   64  101:iload_0         
	//   65  102:aload_1         
	//   66  103:iload_3         
	//   67  104:invokestatic    #129 <Method int leading3(int, byte[], int)>
	//   68  107:invokestatic    #131 <Method int full3(int, byte[], int)>
	//   69  110:istore_0        
			}
			return i;
		}
	//*  70  111:goto            72
		boolean flag;
		if(l >= BILLION)
	//*  71  114:iload           4
	//*  72  116:getstatic       #33  <Field int BILLION>
	//*  73  119:icmplt          215
			flag = true;
	//   74  122:iconst_1        
	//   75  123:istore          5
		else
	//*  76  125:iload           4
	//*  77  127:istore_0        
	//*  78  128:iload_3         
	//*  79  129:istore_2        
	//*  80  130:iload           5
	//*  81  132:ifeq            164
	//*  82  135:iload           4
	//*  83  137:getstatic       #33  <Field int BILLION>
	//*  84  140:isub            
	//*  85  141:istore_0        
	//*  86  142:iload_0         
	//*  87  143:getstatic       #33  <Field int BILLION>
	//*  88  146:icmplt          221
	//*  89  149:iload_0         
	//*  90  150:getstatic       #33  <Field int BILLION>
	//*  91  153:isub            
	//*  92  154:istore_0        
	//*  93  155:aload_1         
	//*  94  156:iload_3         
	//*  95  157:bipush          50
	//*  96  159:bastore         
	//*  97  160:iload_3         
	//*  98  161:iconst_1        
	//*  99  162:iadd            
	//* 100  163:istore_2        
	//* 101  164:iload_0         
	//* 102  165:sipush          1000
	//* 103  168:idiv            
	//* 104  169:istore_3        
	//* 105  170:iload_3         
	//* 106  171:sipush          1000
	//* 107  174:idiv            
	//* 108  175:istore          4
	//* 109  177:iload           5
	//* 110  179:ifeq            233
	//* 111  182:iload           4
	//* 112  184:aload_1         
	//* 113  185:iload_2         
	//* 114  186:invokestatic    #131 <Method int full3(int, byte[], int)>
	//* 115  189:istore_2        
	//* 116  190:iload_0         
	//* 117  191:iload_3         
	//* 118  192:sipush          1000
	//* 119  195:imul            
	//* 120  196:isub            
	//* 121  197:aload_1         
	//* 122  198:iload_3         
	//* 123  199:iload           4
	//* 124  201:sipush          1000
	//* 125  204:imul            
	//* 126  205:isub            
	//* 127  206:aload_1         
	//* 128  207:iload_2         
	//* 129  208:invokestatic    #131 <Method int full3(int, byte[], int)>
	//* 130  211:invokestatic    #131 <Method int full3(int, byte[], int)>
	//* 131  214:ireturn         
			flag = false;
	//  132  215:iconst_0        
	//  133  216:istore          5
		i = l;
		j = k;
		if(flag)
		{
			i = l - BILLION;
			if(i >= BILLION)
			{
				i -= BILLION;
				abyte0[k] = 50;
				j = k + 1;
			} else
	//* 134  218:goto            125
			{
				abyte0[k] = 49;
	//  135  221:aload_1         
	//  136  222:iload_3         
	//  137  223:bipush          49
	//  138  225:bastore         
				j = k + 1;
	//  139  226:iload_3         
	//  140  227:iconst_1        
	//  141  228:iadd            
	//  142  229:istore_2        
			}
		}
		k = i / 1000;
		l = k / 1000;
		if(flag)
			j = full3(l, abyte0, j);
		else
	//* 143  230:goto            164
			j = leading3(l, abyte0, j);
	//  144  233:iload           4
	//  145  235:aload_1         
	//  146  236:iload_2         
	//  147  237:invokestatic    #129 <Method int leading3(int, byte[], int)>
	//  148  240:istore_2        
		return full3(i - k * 1000, abyte0, full3(k - l * 1000, abyte0, j));
	//* 149  241:goto            190
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
	//*   5    6:ifge            36
		{
			if(i == 0x80000000)
	//*   6    9:iload_0         
	//*   7   10:ldc1            #123 <Int 0x80000000>
	//*   8   12:icmpne          23
				return outputLong(i, ac, j);
	//    9   15:iload_0         
	//   10   16:i2l             
	//   11   17:aload_1         
	//   12   18:iload_2         
	//   13   19:invokestatic    #134 <Method int outputLong(long, char[], int)>
	//   14   22:ireturn         
			ac[j] = '-';
	//   15   23:aload_1         
	//   16   24:iload_2         
	//   17   25:bipush          45
	//   18   27:castore         
			l = -i;
	//   19   28:iload_0         
	//   20   29:ineg            
	//   21   30:istore          4
			k = j + 1;
	//   22   32:iload_2         
	//   23   33:iconst_1        
	//   24   34:iadd            
	//   25   35:istore_3        
		}
		if(l < MILLION)
	//*  26   36:iload           4
	//*  27   38:getstatic       #30  <Field int MILLION>
	//*  28   41:icmpge          114
		{
			if(l < 1000)
	//*  29   44:iload           4
	//*  30   46:sipush          1000
	//*  31   49:icmpge          85
			{
				if(l < 10)
	//*  32   52:iload           4
	//*  33   54:bipush          10
	//*  34   56:icmpge          74
				{
					ac[k] = (char)(l + 48);
	//   35   59:aload_1         
	//   36   60:iload_3         
	//   37   61:iload           4
	//   38   63:bipush          48
	//   39   65:iadd            
	//   40   66:int2char        
	//   41   67:castore         
					i = k + 1;
	//   42   68:iload_3         
	//   43   69:iconst_1        
	//   44   70:iadd            
	//   45   71:istore_0        
				} else
	//*  46   72:iload_0         
	//*  47   73:ireturn         
				{
					i = leading3(l, ac, k);
	//   48   74:iload           4
	//   49   76:aload_1         
	//   50   77:iload_3         
	//   51   78:invokestatic    #136 <Method int leading3(int, char[], int)>
	//   52   81:istore_0        
				}
			} else
	//*  53   82:goto            72
			{
				i = l / 1000;
	//   54   85:iload           4
	//   55   87:sipush          1000
	//   56   90:idiv            
	//   57   91:istore_0        
				i = full3(l - i * 1000, ac, leading3(i, ac, k));
	//   58   92:iload           4
	//   59   94:iload_0         
	//   60   95:sipush          1000
	//   61   98:imul            
	//   62   99:isub            
	//   63  100:aload_1         
	//   64  101:iload_0         
	//   65  102:aload_1         
	//   66  103:iload_3         
	//   67  104:invokestatic    #136 <Method int leading3(int, char[], int)>
	//   68  107:invokestatic    #138 <Method int full3(int, char[], int)>
	//   69  110:istore_0        
			}
			return i;
		}
	//*  70  111:goto            72
		boolean flag;
		if(l >= BILLION)
	//*  71  114:iload           4
	//*  72  116:getstatic       #33  <Field int BILLION>
	//*  73  119:icmplt          215
			flag = true;
	//   74  122:iconst_1        
	//   75  123:istore          5
		else
	//*  76  125:iload           4
	//*  77  127:istore_0        
	//*  78  128:iload_3         
	//*  79  129:istore_2        
	//*  80  130:iload           5
	//*  81  132:ifeq            164
	//*  82  135:iload           4
	//*  83  137:getstatic       #33  <Field int BILLION>
	//*  84  140:isub            
	//*  85  141:istore_0        
	//*  86  142:iload_0         
	//*  87  143:getstatic       #33  <Field int BILLION>
	//*  88  146:icmplt          221
	//*  89  149:iload_0         
	//*  90  150:getstatic       #33  <Field int BILLION>
	//*  91  153:isub            
	//*  92  154:istore_0        
	//*  93  155:aload_1         
	//*  94  156:iload_3         
	//*  95  157:bipush          50
	//*  96  159:castore         
	//*  97  160:iload_3         
	//*  98  161:iconst_1        
	//*  99  162:iadd            
	//* 100  163:istore_2        
	//* 101  164:iload_0         
	//* 102  165:sipush          1000
	//* 103  168:idiv            
	//* 104  169:istore_3        
	//* 105  170:iload_3         
	//* 106  171:sipush          1000
	//* 107  174:idiv            
	//* 108  175:istore          4
	//* 109  177:iload           5
	//* 110  179:ifeq            233
	//* 111  182:iload           4
	//* 112  184:aload_1         
	//* 113  185:iload_2         
	//* 114  186:invokestatic    #138 <Method int full3(int, char[], int)>
	//* 115  189:istore_2        
	//* 116  190:iload_0         
	//* 117  191:iload_3         
	//* 118  192:sipush          1000
	//* 119  195:imul            
	//* 120  196:isub            
	//* 121  197:aload_1         
	//* 122  198:iload_3         
	//* 123  199:iload           4
	//* 124  201:sipush          1000
	//* 125  204:imul            
	//* 126  205:isub            
	//* 127  206:aload_1         
	//* 128  207:iload_2         
	//* 129  208:invokestatic    #138 <Method int full3(int, char[], int)>
	//* 130  211:invokestatic    #138 <Method int full3(int, char[], int)>
	//* 131  214:ireturn         
			flag = false;
	//  132  215:iconst_0        
	//  133  216:istore          5
		i = l;
		j = k;
		if(flag)
		{
			i = l - BILLION;
			if(i >= BILLION)
			{
				i -= BILLION;
				ac[k] = '2';
				j = k + 1;
			} else
	//* 134  218:goto            125
			{
				ac[k] = '1';
	//  135  221:aload_1         
	//  136  222:iload_3         
	//  137  223:bipush          49
	//  138  225:castore         
				j = k + 1;
	//  139  226:iload_3         
	//  140  227:iconst_1        
	//  141  228:iadd            
	//  142  229:istore_2        
			}
		}
		k = i / 1000;
		l = k / 1000;
		if(flag)
			j = full3(l, ac, j);
		else
	//* 143  230:goto            164
			j = leading3(l, ac, j);
	//  144  233:iload           4
	//  145  235:aload_1         
	//  146  236:iload_2         
	//  147  237:invokestatic    #136 <Method int leading3(int, char[], int)>
	//  148  240:istore_2        
		return full3(i - k * 1000, ac, full3(k - l * 1000, ac, j));
	//* 149  241:goto            190
	}

	public static int outputLong(long l, byte abyte0[], int i)
	{
		int k;
		int k1;
		long l2;
		if(l < 0L)
	//*   0    0:lload_0         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifge            143
		{
			if(l > MIN_INT_AS_LONG)
	//*   4    6:lload_0         
	//*   5    7:getstatic       #45  <Field long MIN_INT_AS_LONG>
	//*   6   10:lcmp            
	//*   7   11:ifle            22
				return outputInt((int)l, abyte0, i);
	//    8   14:lload_0         
	//    9   15:l2i             
	//   10   16:aload_2         
	//   11   17:iload_3         
	//   12   18:invokestatic    #140 <Method int outputInt(int, byte[], int)>
	//   13   21:ireturn         
			if(l == 0x0L)
	//*  14   22:lload_0         
	//*  15   23:ldc2w           #50  <Long 0x0L>
	//*  16   26:lcmp            
	//*  17   27:ifne            75
			{
				int i1 = SMALLEST_LONG.length();
	//   18   30:getstatic       #59  <Field String SMALLEST_LONG>
	//   19   33:invokevirtual   #144 <Method int String.length()>
	//   20   36:istore          5
				for(int j = 0; j < i1;)
	//*  21   38:iconst_0        
	//*  22   39:istore          4
	//*  23   41:iload           4
	//*  24   43:iload           5
	//*  25   45:icmpge          73
				{
					abyte0[i] = (byte)SMALLEST_LONG.charAt(j);
	//   26   48:aload_2         
	//   27   49:iload_3         
	//   28   50:getstatic       #59  <Field String SMALLEST_LONG>
	//   29   53:iload           4
	//   30   55:invokevirtual   #148 <Method char String.charAt(int)>
	//   31   58:int2byte        
	//   32   59:bastore         
					j++;
	//   33   60:iload           4
	//   34   62:iconst_1        
	//   35   63:iadd            
	//   36   64:istore          4
					i++;
	//   37   66:iload_3         
	//   38   67:iconst_1        
	//   39   68:iadd            
	//   40   69:istore_3        
				}

	//*  41   70:goto            41
				return i;
	//   42   73:iload_3         
	//   43   74:ireturn         
			}
			abyte0[i] = 45;
	//   44   75:aload_2         
	//   45   76:iload_3         
	//   46   77:bipush          45
	//   47   79:bastore         
			l2 = -l;
	//   48   80:lload_0         
	//   49   81:lneg            
	//   50   82:lstore          8
			k = i + 1;
	//   51   84:iload_3         
	//   52   85:iconst_1        
	//   53   86:iadd            
	//   54   87:istore          4
		} else
	//*  55   89:iload           4
	//*  56   91:lload           8
	//*  57   93:invokestatic    #150 <Method int calcLongStrLength(long)>
	//*  58   96:iadd            
	//*  59   97:istore          6
	//*  60   99:iload           6
	//*  61  101:istore_3        
	//*  62  102:lload           8
	//*  63  104:getstatic       #49  <Field long MAX_INT_AS_LONG>
	//*  64  107:lcmp            
	//*  65  108:ifle            165
	//*  66  111:iload_3         
	//*  67  112:iconst_3        
	//*  68  113:isub            
	//*  69  114:istore_3        
	//*  70  115:lload           8
	//*  71  117:getstatic       #41  <Field long THOUSAND_L>
	//*  72  120:ldiv            
	//*  73  121:lstore_0        
	//*  74  122:lload           8
	//*  75  124:getstatic       #41  <Field long THOUSAND_L>
	//*  76  127:lload_0         
	//*  77  128:lmul            
	//*  78  129:lsub            
	//*  79  130:l2i             
	//*  80  131:aload_2         
	//*  81  132:iload_3         
	//*  82  133:invokestatic    #131 <Method int full3(int, byte[], int)>
	//*  83  136:pop             
	//*  84  137:lload_0         
	//*  85  138:lstore          8
	//*  86  140:goto            102
		{
			l2 = l;
	//   87  143:lload_0         
	//   88  144:lstore          8
			k = i;
	//   89  146:iload_3         
	//   90  147:istore          4
			if(l <= MAX_INT_AS_LONG)
	//*  91  149:lload_0         
	//*  92  150:getstatic       #49  <Field long MAX_INT_AS_LONG>
	//*  93  153:lcmp            
	//*  94  154:ifgt            89
				return outputInt((int)l, abyte0, i);
	//   95  157:lload_0         
	//   96  158:l2i             
	//   97  159:aload_2         
	//   98  160:iload_3         
	//   99  161:invokestatic    #140 <Method int outputInt(int, byte[], int)>
	//  100  164:ireturn         
		}
		k1 = k + calcLongStrLength(l2);
		i = k1;
		for(; l2 > MAX_INT_AS_LONG; l2 = l)
		{
			i -= 3;
			l = l2 / THOUSAND_L;
			full3((int)(l2 - THOUSAND_L * l), abyte0, i);
		}

		int l1 = (int)l2;
	//  101  165:lload           8
	//  102  167:l2i             
	//  103  168:istore          7
		int j1 = i;
	//  104  170:iload_3         
	//  105  171:istore          5
		for(i = l1; i >= 1000; i = l1)
	//* 106  173:iload           7
	//* 107  175:istore_3        
	//* 108  176:iload_3         
	//* 109  177:sipush          1000
	//* 110  180:icmplt          217
		{
			j1 -= 3;
	//  111  183:iload           5
	//  112  185:iconst_3        
	//  113  186:isub            
	//  114  187:istore          5
			l1 = i / 1000;
	//  115  189:iload_3         
	//  116  190:sipush          1000
	//  117  193:idiv            
	//  118  194:istore          7
			full3(i - l1 * 1000, abyte0, j1);
	//  119  196:iload_3         
	//  120  197:iload           7
	//  121  199:sipush          1000
	//  122  202:imul            
	//  123  203:isub            
	//  124  204:aload_2         
	//  125  205:iload           5
	//  126  207:invokestatic    #131 <Method int full3(int, byte[], int)>
	//  127  210:pop             
		}

	//  128  211:iload           7
	//  129  213:istore_3        
	//* 130  214:goto            176
		leading3(i, abyte0, k);
	//  131  217:iload_3         
	//  132  218:aload_2         
	//  133  219:iload           4
	//  134  221:invokestatic    #129 <Method int leading3(int, byte[], int)>
	//  135  224:pop             
		return k1;
	//  136  225:iload           6
	//  137  227:ireturn         
	}

	public static int outputLong(long l, char ac[], int i)
	{
		int k;
		int j1;
		long l1;
		if(l < 0L)
	//*   0    0:lload_0         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifge            122
		{
			if(l > MIN_INT_AS_LONG)
	//*   4    6:lload_0         
	//*   5    7:getstatic       #45  <Field long MIN_INT_AS_LONG>
	//*   6   10:lcmp            
	//*   7   11:ifle            22
				return outputInt((int)l, ac, i);
	//    8   14:lload_0         
	//    9   15:l2i             
	//   10   16:aload_2         
	//   11   17:iload_3         
	//   12   18:invokestatic    #152 <Method int outputInt(int, char[], int)>
	//   13   21:ireturn         
			if(l == 0x0L)
	//*  14   22:lload_0         
	//*  15   23:ldc2w           #50  <Long 0x0L>
	//*  16   26:lcmp            
	//*  17   27:ifne            54
			{
				int j = SMALLEST_LONG.length();
	//   18   30:getstatic       #59  <Field String SMALLEST_LONG>
	//   19   33:invokevirtual   #144 <Method int String.length()>
	//   20   36:istore          4
				SMALLEST_LONG.getChars(0, j, ac, i);
	//   21   38:getstatic       #59  <Field String SMALLEST_LONG>
	//   22   41:iconst_0        
	//   23   42:iload           4
	//   24   44:aload_2         
	//   25   45:iload_3         
	//   26   46:invokevirtual   #156 <Method void String.getChars(int, int, char[], int)>
				return i + j;
	//   27   49:iload_3         
	//   28   50:iload           4
	//   29   52:iadd            
	//   30   53:ireturn         
			}
			ac[i] = '-';
	//   31   54:aload_2         
	//   32   55:iload_3         
	//   33   56:bipush          45
	//   34   58:castore         
			l1 = -l;
	//   35   59:lload_0         
	//   36   60:lneg            
	//   37   61:lstore          8
			k = i + 1;
	//   38   63:iload_3         
	//   39   64:iconst_1        
	//   40   65:iadd            
	//   41   66:istore          4
		} else
	//*  42   68:iload           4
	//*  43   70:lload           8
	//*  44   72:invokestatic    #150 <Method int calcLongStrLength(long)>
	//*  45   75:iadd            
	//*  46   76:istore          6
	//*  47   78:iload           6
	//*  48   80:istore_3        
	//*  49   81:lload           8
	//*  50   83:getstatic       #49  <Field long MAX_INT_AS_LONG>
	//*  51   86:lcmp            
	//*  52   87:ifle            144
	//*  53   90:iload_3         
	//*  54   91:iconst_3        
	//*  55   92:isub            
	//*  56   93:istore_3        
	//*  57   94:lload           8
	//*  58   96:getstatic       #41  <Field long THOUSAND_L>
	//*  59   99:ldiv            
	//*  60  100:lstore_0        
	//*  61  101:lload           8
	//*  62  103:getstatic       #41  <Field long THOUSAND_L>
	//*  63  106:lload_0         
	//*  64  107:lmul            
	//*  65  108:lsub            
	//*  66  109:l2i             
	//*  67  110:aload_2         
	//*  68  111:iload_3         
	//*  69  112:invokestatic    #138 <Method int full3(int, char[], int)>
	//*  70  115:pop             
	//*  71  116:lload_0         
	//*  72  117:lstore          8
	//*  73  119:goto            81
		{
			l1 = l;
	//   74  122:lload_0         
	//   75  123:lstore          8
			k = i;
	//   76  125:iload_3         
	//   77  126:istore          4
			if(l <= MAX_INT_AS_LONG)
	//*  78  128:lload_0         
	//*  79  129:getstatic       #49  <Field long MAX_INT_AS_LONG>
	//*  80  132:lcmp            
	//*  81  133:ifgt            68
				return outputInt((int)l, ac, i);
	//   82  136:lload_0         
	//   83  137:l2i             
	//   84  138:aload_2         
	//   85  139:iload_3         
	//   86  140:invokestatic    #152 <Method int outputInt(int, char[], int)>
	//   87  143:ireturn         
		}
		j1 = k + calcLongStrLength(l1);
		i = j1;
		for(; l1 > MAX_INT_AS_LONG; l1 = l)
		{
			i -= 3;
			l = l1 / THOUSAND_L;
			full3((int)(l1 - THOUSAND_L * l), ac, i);
		}

		int k1 = (int)l1;
	//   88  144:lload           8
	//   89  146:l2i             
	//   90  147:istore          7
		int i1 = i;
	//   91  149:iload_3         
	//   92  150:istore          5
		for(i = k1; i >= 1000; i = k1)
	//*  93  152:iload           7
	//*  94  154:istore_3        
	//*  95  155:iload_3         
	//*  96  156:sipush          1000
	//*  97  159:icmplt          196
		{
			i1 -= 3;
	//   98  162:iload           5
	//   99  164:iconst_3        
	//  100  165:isub            
	//  101  166:istore          5
			k1 = i / 1000;
	//  102  168:iload_3         
	//  103  169:sipush          1000
	//  104  172:idiv            
	//  105  173:istore          7
			full3(i - k1 * 1000, ac, i1);
	//  106  175:iload_3         
	//  107  176:iload           7
	//  108  178:sipush          1000
	//  109  181:imul            
	//  110  182:isub            
	//  111  183:aload_2         
	//  112  184:iload           5
	//  113  186:invokestatic    #138 <Method int full3(int, char[], int)>
	//  114  189:pop             
		}

	//  115  190:iload           7
	//  116  192:istore_3        
	//* 117  193:goto            155
		leading3(i, ac, k);
	//  118  196:iload_3         
	//  119  197:aload_2         
	//  120  198:iload           4
	//  121  200:invokestatic    #136 <Method int leading3(int, char[], int)>
	//  122  203:pop             
		return j1;
	//  123  204:iload           6
	//  124  206:ireturn         
	}

	public static String toString(double d)
	{
		return Double.toString(d);
	//    0    0:dload_0         
	//    1    1:invokestatic    #162 <Method String Double.toString(double)>
	//    2    4:areturn         
	}

	public static String toString(float f)
	{
		return Float.toString(f);
	//    0    0:fload_0         
	//    1    1:invokestatic    #167 <Method String Float.toString(float)>
	//    2    4:areturn         
	}

	public static String toString(int i)
	{
		if(i < sSmallIntStrs.length)
	//*   0    0:iload_0         
	//*   1    1:getstatic       #89  <Field String[] sSmallIntStrs>
	//*   2    4:arraylength     
	//*   3    5:icmpge          37
		{
			if(i >= 0)
	//*   4    8:iload_0         
	//*   5    9:iflt            18
				return sSmallIntStrs[i];
	//    6   12:getstatic       #89  <Field String[] sSmallIntStrs>
	//    7   15:iload_0         
	//    8   16:aaload          
	//    9   17:areturn         
			int j = -i - 1;
	//   10   18:iload_0         
	//   11   19:ineg            
	//   12   20:iconst_1        
	//   13   21:isub            
	//   14   22:istore_1        
			if(j < sSmallIntStrs2.length)
	//*  15   23:iload_1         
	//*  16   24:getstatic       #111 <Field String[] sSmallIntStrs2>
	//*  17   27:arraylength     
	//*  18   28:icmpge          37
				return sSmallIntStrs2[j];
	//   19   31:getstatic       #111 <Field String[] sSmallIntStrs2>
	//   20   34:iload_1         
	//   21   35:aaload          
	//   22   36:areturn         
		}
		return Integer.toString(i);
	//   23   37:iload_0         
	//   24   38:invokestatic    #172 <Method String Integer.toString(int)>
	//   25   41:areturn         
	}

	public static String toString(long l)
	{
		if(l <= 0x7fffffffL && l >= 0x80000000L)
	//*   0    0:lload_0         
	//*   1    1:ldc2w           #46  <Long 0x7fffffffL>
	//*   2    4:lcmp            
	//*   3    5:ifgt            22
	//*   4    8:lload_0         
	//*   5    9:ldc2w           #42  <Long 0x80000000L>
	//*   6   12:lcmp            
	//*   7   13:iflt            22
			return toString((int)l);
	//    8   16:lload_0         
	//    9   17:l2i             
	//   10   18:invokestatic    #173 <Method String toString(int)>
	//   11   21:areturn         
		else
			return Long.toString(l);
	//   12   22:lload_0         
	//   13   23:invokestatic    #177 <Method String Long.toString(long)>
	//   14   26:areturn         
	}

	private static int BILLION = 0x3b9aca00;
	private static final char FULL_3[];
	private static final byte FULL_TRIPLETS_B[];
	private static final char LEAD_3[];
	private static long MAX_INT_AS_LONG = 0x7fffffffL;
	private static int MILLION = 0xf4240;
	private static long MIN_INT_AS_LONG = 0x80000000L;
	private static final char NC = 0;
	static final String SMALLEST_LONG = String.valueOf(0x0L);
	private static long TEN_BILLION_L = 0x540be400L;
	private static long THOUSAND_L = 1000L;
	private static final String sSmallIntStrs[] = {
		"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", 
		"10"
	};
	private static final String sSmallIntStrs2[] = {
		"-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"
	};

	static 
	{
	//    0    0:ldc1            #28  <Int 0xf4240>
	//    1    2:putstatic       #30  <Field int MILLION>
	//    2    5:ldc1            #31  <Int 0x3b9aca00>
	//    3    7:putstatic       #33  <Field int BILLION>
	//    4   10:ldc2w           #34  <Long 0x540be400L>
	//    5   13:putstatic       #37  <Field long TEN_BILLION_L>
	//    6   16:ldc2w           #38  <Long 1000L>
	//    7   19:putstatic       #41  <Field long THOUSAND_L>
	//    8   22:ldc2w           #42  <Long 0x80000000L>
	//    9   25:putstatic       #45  <Field long MIN_INT_AS_LONG>
	//   10   28:ldc2w           #46  <Long 0x7fffffffL>
	//   11   31:putstatic       #49  <Field long MAX_INT_AS_LONG>
	//   12   34:ldc2w           #50  <Long 0x0L>
	//   13   37:invokestatic    #57  <Method String String.valueOf(long)>
	//   14   40:putstatic       #59  <Field String SMALLEST_LONG>
		LEAD_3 = new char[4000];
	//   15   43:sipush          4000
	//   16   46:newarray        char[]
	//   17   48:putstatic       #61  <Field char[] LEAD_3>
		FULL_3 = new char[4000];
	//   18   51:sipush          4000
	//   19   54:newarray        char[]
	//   20   56:putstatic       #63  <Field char[] FULL_3>
		int l = 0;
	//   21   59:iconst_0        
	//   22   60:istore          7
		for(int i = 0; i < 10; i++)
	//*  23   62:iconst_0        
	//*  24   63:istore          5
	//*  25   65:iload           5
	//*  26   67:bipush          10
	//*  27   69:icmpge          228
		{
			char c2 = (char)(i + 48);
	//   28   72:iload           5
	//   29   74:bipush          48
	//   30   76:iadd            
	//   31   77:int2char        
	//   32   78:istore_2        
			char c;
			char c1;
			char c3;
			int k;
			if(i == 0)
	//*  33   79:iload           5
	//*  34   81:ifne            200
				c = '\0';
	//   35   84:iconst_0        
	//   36   85:istore_0        
			else
	//*  37   86:iconst_0        
	//*  38   87:istore          6
	//*  39   89:iload           6
	//*  40   91:bipush          10
	//*  41   93:icmpge          219
	//*  42   96:iload           6
	//*  43   98:bipush          48
	//*  44  100:iadd            
	//*  45  101:int2char        
	//*  46  102:istore_3        
	//*  47  103:iload           5
	//*  48  105:ifne            205
	//*  49  108:iload           6
	//*  50  110:ifne            205
	//*  51  113:iconst_0        
	//*  52  114:istore_1        
	//*  53  115:iconst_0        
	//*  54  116:istore          8
	//*  55  118:iload           8
	//*  56  120:bipush          10
	//*  57  122:icmpge          210
	//*  58  125:iload           8
	//*  59  127:bipush          48
	//*  60  129:iadd            
	//*  61  130:int2char        
	//*  62  131:istore          4
	//*  63  133:getstatic       #61  <Field char[] LEAD_3>
	//*  64  136:iload           7
	//*  65  138:iload_0         
	//*  66  139:castore         
	//*  67  140:getstatic       #61  <Field char[] LEAD_3>
	//*  68  143:iload           7
	//*  69  145:iconst_1        
	//*  70  146:iadd            
	//*  71  147:iload_1         
	//*  72  148:castore         
	//*  73  149:getstatic       #61  <Field char[] LEAD_3>
	//*  74  152:iload           7
	//*  75  154:iconst_2        
	//*  76  155:iadd            
	//*  77  156:iload           4
	//*  78  158:castore         
	//*  79  159:getstatic       #63  <Field char[] FULL_3>
	//*  80  162:iload           7
	//*  81  164:iload_2         
	//*  82  165:castore         
	//*  83  166:getstatic       #63  <Field char[] FULL_3>
	//*  84  169:iload           7
	//*  85  171:iconst_1        
	//*  86  172:iadd            
	//*  87  173:iload_3         
	//*  88  174:castore         
	//*  89  175:getstatic       #63  <Field char[] FULL_3>
	//*  90  178:iload           7
	//*  91  180:iconst_2        
	//*  92  181:iadd            
	//*  93  182:iload           4
	//*  94  184:castore         
	//*  95  185:iload           7
	//*  96  187:iconst_4        
	//*  97  188:iadd            
	//*  98  189:istore          7
	//*  99  191:iload           8
	//* 100  193:iconst_1        
	//* 101  194:iadd            
	//* 102  195:istore          8
	//* 103  197:goto            118
				c = c2;
	//  104  200:iload_2         
	//  105  201:istore_0        
			for(k = 0; k < 10; k++)
			{
				c3 = (char)(k + 48);
				int i1;
				if(i == 0 && k == 0)
					c1 = '\0';
				else
	//* 106  202:goto            86
					c1 = c3;
	//  107  205:iload_3         
	//  108  206:istore_1        
				for(i1 = 0; i1 < 10; i1++)
				{
					char c4 = (char)(i1 + 48);
					LEAD_3[l] = c;
					LEAD_3[l + 1] = c1;
					LEAD_3[l + 2] = c4;
					FULL_3[l] = c2;
					FULL_3[l + 1] = c3;
					FULL_3[l + 2] = c4;
					l += 4;
				}

			}

	//  109  207:goto            115
	//  110  210:iload           6
	//  111  212:iconst_1        
	//  112  213:iadd            
	//  113  214:istore          6
		}

	//  114  216:goto            89
	//  115  219:iload           5
	//  116  221:iconst_1        
	//  117  222:iadd            
	//  118  223:istore          5
	//* 119  225:goto            65
		FULL_TRIPLETS_B = new byte[4000];
	//  120  228:sipush          4000
	//  121  231:newarray        byte[]
	//  122  233:putstatic       #65  <Field byte[] FULL_TRIPLETS_B>
		for(int j = 0; j < 4000; j++)
	//* 123  236:iconst_0        
	//* 124  237:istore          5
	//* 125  239:iload           5
	//* 126  241:sipush          4000
	//* 127  244:icmpge          269
			FULL_TRIPLETS_B[j] = (byte)FULL_3[j];
	//  128  247:getstatic       #65  <Field byte[] FULL_TRIPLETS_B>
	//  129  250:iload           5
	//  130  252:getstatic       #63  <Field char[] FULL_3>
	//  131  255:iload           5
	//  132  257:caload          
	//  133  258:int2byte        
	//  134  259:bastore         

	//  135  260:iload           5
	//  136  262:iconst_1        
	//  137  263:iadd            
	//  138  264:istore          5
	//* 139  266:goto            239
	//  140  269:bipush          11
	//  141  271:anewarray       String[]
	//  142  274:dup             
	//  143  275:iconst_0        
	//  144  276:ldc1            #67  <String "0">
	//  145  278:aastore         
	//  146  279:dup             
	//  147  280:iconst_1        
	//  148  281:ldc1            #69  <String "1">
	//  149  283:aastore         
	//  150  284:dup             
	//  151  285:iconst_2        
	//  152  286:ldc1            #71  <String "2">
	//  153  288:aastore         
	//  154  289:dup             
	//  155  290:iconst_3        
	//  156  291:ldc1            #73  <String "3">
	//  157  293:aastore         
	//  158  294:dup             
	//  159  295:iconst_4        
	//  160  296:ldc1            #75  <String "4">
	//  161  298:aastore         
	//  162  299:dup             
	//  163  300:iconst_5        
	//  164  301:ldc1            #77  <String "5">
	//  165  303:aastore         
	//  166  304:dup             
	//  167  305:bipush          6
	//  168  307:ldc1            #79  <String "6">
	//  169  309:aastore         
	//  170  310:dup             
	//  171  311:bipush          7
	//  172  313:ldc1            #81  <String "7">
	//  173  315:aastore         
	//  174  316:dup             
	//  175  317:bipush          8
	//  176  319:ldc1            #83  <String "8">
	//  177  321:aastore         
	//  178  322:dup             
	//  179  323:bipush          9
	//  180  325:ldc1            #85  <String "9">
	//  181  327:aastore         
	//  182  328:dup             
	//  183  329:bipush          10
	//  184  331:ldc1            #87  <String "10">
	//  185  333:aastore         
	//  186  334:putstatic       #89  <Field String[] sSmallIntStrs>
	//  187  337:bipush          10
	//  188  339:anewarray       String[]
	//  189  342:dup             
	//  190  343:iconst_0        
	//  191  344:ldc1            #91  <String "-1">
	//  192  346:aastore         
	//  193  347:dup             
	//  194  348:iconst_1        
	//  195  349:ldc1            #93  <String "-2">
	//  196  351:aastore         
	//  197  352:dup             
	//  198  353:iconst_2        
	//  199  354:ldc1            #95  <String "-3">
	//  200  356:aastore         
	//  201  357:dup             
	//  202  358:iconst_3        
	//  203  359:ldc1            #97  <String "-4">
	//  204  361:aastore         
	//  205  362:dup             
	//  206  363:iconst_4        
	//  207  364:ldc1            #99  <String "-5">
	//  208  366:aastore         
	//  209  367:dup             
	//  210  368:iconst_5        
	//  211  369:ldc1            #101 <String "-6">
	//  212  371:aastore         
	//  213  372:dup             
	//  214  373:bipush          6
	//  215  375:ldc1            #103 <String "-7">
	//  216  377:aastore         
	//  217  378:dup             
	//  218  379:bipush          7
	//  219  381:ldc1            #105 <String "-8">
	//  220  383:aastore         
	//  221  384:dup             
	//  222  385:bipush          8
	//  223  387:ldc1            #107 <String "-9">
	//  224  389:aastore         
	//  225  390:dup             
	//  226  391:bipush          9
	//  227  393:ldc1            #109 <String "-10">
	//  228  395:aastore         
	//  229  396:putstatic       #111 <Field String[] sSmallIntStrs2>
	//* 230  399:return          
	}
}
