// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.utils;


public class Base64Coder
{

	private Base64Coder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	public static byte[] decode(String s)
	{
		return decode(s.toCharArray());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method char[] String.toCharArray()>
	//    2    4:invokestatic    #29  <Method byte[] decode(char[])>
	//    3    7:areturn         
	}

	public static byte[] decode(char ac[])
	{
		int i = ac.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_1        
		int l = i;
	//    3    3:iload_1         
	//    4    4:istore_3        
		if(i % 4 != 0)
	//*   5    5:iload_1         
	//*   6    6:iconst_4        
	//*   7    7:irem            
	//*   8    8:ifeq            21
			throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");
	//    9   11:new             #31  <Class IllegalArgumentException>
	//   10   14:dup             
	//   11   15:ldc1            #33  <String "Length of Base64 encoded input string is not a multiple of 4.">
	//   12   17:invokespecial   #36  <Method void IllegalArgumentException(String)>
	//   13   20:athrow          
		for(; l > 0 && ac[l - 1] == '='; l--);
	//   14   21:iload_3         
	//   15   22:ifle            42
	//   16   25:aload_0         
	//   17   26:iload_3         
	//   18   27:iconst_1        
	//   19   28:isub            
	//   20   29:caload          
	//   21   30:bipush          61
	//   22   32:icmpne          42
	//   23   35:iload_3         
	//   24   36:iconst_1        
	//   25   37:isub            
	//   26   38:istore_3        
	//*  27   39:goto            21
		int j1 = (l * 3) / 4;
	//   28   42:iload_3         
	//   29   43:iconst_3        
	//   30   44:imul            
	//   31   45:iconst_4        
	//   32   46:idiv            
	//   33   47:istore          7
		byte abyte0[] = new byte[j1];
	//   34   49:iload           7
	//   35   51:newarray        byte[]
	//   36   53:astore          10
		i = 0;
	//   37   55:iconst_0        
	//   38   56:istore_1        
		int i1 = 0;
	//   39   57:iconst_0        
	//   40   58:istore          4
		while(i < l) 
	//*  41   60:iload_1         
	//*  42   61:iload_3         
	//*  43   62:icmpge          324
		{
			int j = i + 1;
	//   44   65:iload_1         
	//   45   66:iconst_1        
	//   46   67:iadd            
	//   47   68:istore_2        
			char c2 = ac[i];
	//   48   69:aload_0         
	//   49   70:iload_1         
	//   50   71:caload          
	//   51   72:istore          8
			i = j + 1;
	//   52   74:iload_2         
	//   53   75:iconst_1        
	//   54   76:iadd            
	//   55   77:istore_1        
			char c3 = ac[j];
	//   56   78:aload_0         
	//   57   79:iload_2         
	//   58   80:caload          
	//   59   81:istore          9
			char c1 = 'A';
	//   60   83:bipush          65
	//   61   85:istore          6
			char c;
			if(i < l)
	//*  62   87:iload_1         
	//*  63   88:iload_3         
	//*  64   89:icmpge          104
			{
				j = i + 1;
	//   65   92:iload_1         
	//   66   93:iconst_1        
	//   67   94:iadd            
	//   68   95:istore_2        
				c = ac[i];
	//   69   96:aload_0         
	//   70   97:iload_1         
	//   71   98:caload          
	//   72   99:istore          5
			} else
	//*  73  101:goto            110
			{
				j = i;
	//   74  104:iload_1         
	//   75  105:istore_2        
				c = 'A';
	//   76  106:bipush          65
	//   77  108:istore          5
			}
			i = j;
	//   78  110:iload_2         
	//   79  111:istore_1        
			if(j < l)
	//*  80  112:iload_2         
	//*  81  113:iload_3         
	//*  82  114:icmpge          126
			{
				c1 = ac[j];
	//   83  117:aload_0         
	//   84  118:iload_2         
	//   85  119:caload          
	//   86  120:istore          6
				i = j + 1;
	//   87  122:iload_2         
	//   88  123:iconst_1        
	//   89  124:iadd            
	//   90  125:istore_1        
			}
			if(c2 <= '\177' && c3 <= '\177' && c <= '\177' && c1 <= '\177')
	//*  91  126:iload           8
	//*  92  128:bipush          127
	//*  93  130:icmpgt          314
	//*  94  133:iload           9
	//*  95  135:bipush          127
	//*  96  137:icmpgt          314
	//*  97  140:iload           5
	//*  98  142:bipush          127
	//*  99  144:icmpgt          314
	//* 100  147:iload           6
	//* 101  149:bipush          127
	//* 102  151:icmple          157
	//* 103  154:goto            314
			{
				c2 = ((char) (b[c2]));
	//  104  157:getstatic       #14  <Field byte[] b>
	//  105  160:iload           8
	//  106  162:baload          
	//  107  163:istore          8
				c3 = ((char) (b[c3]));
	//  108  165:getstatic       #14  <Field byte[] b>
	//  109  168:iload           9
	//  110  170:baload          
	//  111  171:istore          9
				c = ((char) (b[c]));
	//  112  173:getstatic       #14  <Field byte[] b>
	//  113  176:iload           5
	//  114  178:baload          
	//  115  179:istore          5
				c1 = ((char) (b[c1]));
	//  116  181:getstatic       #14  <Field byte[] b>
	//  117  184:iload           6
	//  118  186:baload          
	//  119  187:istore          6
				if(c2 >= 0 && c3 >= 0 && c >= 0 && c1 >= 0)
	//* 120  189:iload           8
	//* 121  191:iflt            304
	//* 122  194:iload           9
	//* 123  196:iflt            304
	//* 124  199:iload           5
	//* 125  201:iflt            304
	//* 126  204:iload           6
	//* 127  206:ifge            212
	//* 128  209:goto            304
				{
					int k = i1 + 1;
	//  129  212:iload           4
	//  130  214:iconst_1        
	//  131  215:iadd            
	//  132  216:istore_2        
					abyte0[i1] = (byte)(c2 << 2 | c3 >>> 4);
	//  133  217:aload           10
	//  134  219:iload           4
	//  135  221:iload           8
	//  136  223:iconst_2        
	//  137  224:ishl            
	//  138  225:iload           9
	//  139  227:iconst_4        
	//  140  228:iushr           
	//  141  229:ior             
	//  142  230:int2byte        
	//  143  231:bastore         
					if(k < j1)
	//* 144  232:iload_2         
	//* 145  233:iload           7
	//* 146  235:icmpge          266
					{
						i1 = k + 1;
	//  147  238:iload_2         
	//  148  239:iconst_1        
	//  149  240:iadd            
	//  150  241:istore          4
						abyte0[k] = (byte)((c3 & 0xf) << 4 | c >>> 2);
	//  151  243:aload           10
	//  152  245:iload_2         
	//  153  246:iload           9
	//  154  248:bipush          15
	//  155  250:iand            
	//  156  251:iconst_4        
	//  157  252:ishl            
	//  158  253:iload           5
	//  159  255:iconst_2        
	//  160  256:iushr           
	//  161  257:ior             
	//  162  258:int2byte        
	//  163  259:bastore         
						k = i1;
	//  164  260:iload           4
	//  165  262:istore_2        
					}
	//* 166  263:goto            266
					if(k < j1)
	//* 167  266:iload_2         
	//* 168  267:iload           7
	//* 169  269:icmpge          298
					{
						i1 = k + 1;
	//  170  272:iload_2         
	//  171  273:iconst_1        
	//  172  274:iadd            
	//  173  275:istore          4
						abyte0[k] = (byte)((c & 3) << 6 | c1);
	//  174  277:aload           10
	//  175  279:iload_2         
	//  176  280:iload           5
	//  177  282:iconst_3        
	//  178  283:iand            
	//  179  284:bipush          6
	//  180  286:ishl            
	//  181  287:iload           6
	//  182  289:ior             
	//  183  290:int2byte        
	//  184  291:bastore         
						k = i1;
	//  185  292:iload           4
	//  186  294:istore_2        
					}
	//* 187  295:goto            298
					i1 = k;
	//  188  298:iload_2         
	//  189  299:istore          4
				} else
	//* 190  301:goto            60
				{
					throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
	//  191  304:new             #31  <Class IllegalArgumentException>
	//  192  307:dup             
	//  193  308:ldc1            #38  <String "Illegal character in Base64 encoded data.">
	//  194  310:invokespecial   #36  <Method void IllegalArgumentException(String)>
	//  195  313:athrow          
				}
			} else
			{
				throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
	//  196  314:new             #31  <Class IllegalArgumentException>
	//  197  317:dup             
	//  198  318:ldc1            #38  <String "Illegal character in Base64 encoded data.">
	//  199  320:invokespecial   #36  <Method void IllegalArgumentException(String)>
	//  200  323:athrow          
			}
		}
		return abyte0;
	//  201  324:aload           10
	//  202  326:areturn         
	}

	public static String decodeString(String s)
	{
		return new String(decode(s));
	//    0    0:new             #22  <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokestatic    #42  <Method byte[] decode(String)>
	//    4    8:invokespecial   #45  <Method void String(byte[])>
	//    5   11:areturn         
	}

	public static char[] encode(byte abyte0[])
	{
		return encode(abyte0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:arraylength     
	//    3    3:invokestatic    #50  <Method char[] encode(byte[], int)>
	//    4    6:areturn         
	}

	public static char[] encode(byte abyte0[], int i)
	{
		int l1 = (i * 4 + 2) / 3;
	//    0    0:iload_1         
	//    1    1:iconst_4        
	//    2    2:imul            
	//    3    3:iconst_2        
	//    4    4:iadd            
	//    5    5:iconst_3        
	//    6    6:idiv            
	//    7    7:istore          9
		char ac[] = new char[((i + 2) / 3) * 4];
	//    8    9:iload_1         
	//    9   10:iconst_2        
	//   10   11:iadd            
	//   11   12:iconst_3        
	//   12   13:idiv            
	//   13   14:iconst_4        
	//   14   15:imul            
	//   15   16:newarray        char[]
	//   16   18:astore          11
		int j = 0;
	//   17   20:iconst_0        
	//   18   21:istore          4
		for(int k = j; j < i; k++)
	//*  19   23:iload           4
	//*  20   25:istore          5
	//*  21   27:iload           4
	//*  22   29:iload_1         
	//*  23   30:icmpge          238
		{
			int l = j + 1;
	//   24   33:iload           4
	//   25   35:iconst_1        
	//   26   36:iadd            
	//   27   37:istore          6
			int i2 = abyte0[j] & 0xff;
	//   28   39:aload_0         
	//   29   40:iload           4
	//   30   42:baload          
	//   31   43:sipush          255
	//   32   46:iand            
	//   33   47:istore          10
			if(l < i)
	//*  34   49:iload           6
	//*  35   51:iload_1         
	//*  36   52:icmpge          74
			{
				j = l + 1;
	//   37   55:iload           6
	//   38   57:iconst_1        
	//   39   58:iadd            
	//   40   59:istore          4
				l = abyte0[l] & 0xff;
	//   41   61:aload_0         
	//   42   62:iload           6
	//   43   64:baload          
	//   44   65:sipush          255
	//   45   68:iand            
	//   46   69:istore          6
			} else
	//*  47   71:goto            81
			{
				j = l;
	//   48   74:iload           6
	//   49   76:istore          4
				l = 0;
	//   50   78:iconst_0        
	//   51   79:istore          6
			}
			int i1;
			if(j < i)
	//*  52   81:iload           4
	//*  53   83:iload_1         
	//*  54   84:icmpge          110
			{
				int j1 = j + 1;
	//   55   87:iload           4
	//   56   89:iconst_1        
	//   57   90:iadd            
	//   58   91:istore          8
				i1 = abyte0[j] & 0xff;
	//   59   93:aload_0         
	//   60   94:iload           4
	//   61   96:baload          
	//   62   97:sipush          255
	//   63  100:iand            
	//   64  101:istore          7
				j = j1;
	//   65  103:iload           8
	//   66  105:istore          4
			} else
	//*  67  107:goto            113
			{
				i1 = 0;
	//   68  110:iconst_0        
	//   69  111:istore          7
			}
			int k1 = k + 1;
	//   70  113:iload           5
	//   71  115:iconst_1        
	//   72  116:iadd            
	//   73  117:istore          8
			ac[k] = a[i2 >>> 2];
	//   74  119:aload           11
	//   75  121:iload           5
	//   76  123:getstatic       #12  <Field char[] a>
	//   77  126:iload           10
	//   78  128:iconst_2        
	//   79  129:iushr           
	//   80  130:caload          
	//   81  131:castore         
			k = k1 + 1;
	//   82  132:iload           8
	//   83  134:iconst_1        
	//   84  135:iadd            
	//   85  136:istore          5
			ac[k1] = a[(i2 & 3) << 4 | l >>> 4];
	//   86  138:aload           11
	//   87  140:iload           8
	//   88  142:getstatic       #12  <Field char[] a>
	//   89  145:iload           10
	//   90  147:iconst_3        
	//   91  148:iand            
	//   92  149:iconst_4        
	//   93  150:ishl            
	//   94  151:iload           6
	//   95  153:iconst_4        
	//   96  154:iushr           
	//   97  155:ior             
	//   98  156:caload          
	//   99  157:castore         
			byte byte0 = 61;
	//  100  158:bipush          61
	//  101  160:istore_3        
			char c;
			if(k < l1)
	//* 102  161:iload           5
	//* 103  163:iload           9
	//* 104  165:icmpge          189
				c = a[(l & 0xf) << 2 | i1 >>> 6];
	//  105  168:getstatic       #12  <Field char[] a>
	//  106  171:iload           6
	//  107  173:bipush          15
	//  108  175:iand            
	//  109  176:iconst_2        
	//  110  177:ishl            
	//  111  178:iload           7
	//  112  180:bipush          6
	//  113  182:iushr           
	//  114  183:ior             
	//  115  184:caload          
	//  116  185:istore_2        
			else
	//* 117  186:goto            192
				c = '=';
	//  118  189:bipush          61
	//  119  191:istore_2        
			ac[k] = c;
	//  120  192:aload           11
	//  121  194:iload           5
	//  122  196:iload_2         
	//  123  197:castore         
			k++;
	//  124  198:iload           5
	//  125  200:iconst_1        
	//  126  201:iadd            
	//  127  202:istore          5
			c = ((char) (byte0));
	//  128  204:iload_3         
	//  129  205:istore_2        
			if(k < l1)
	//* 130  206:iload           5
	//* 131  208:iload           9
	//* 132  210:icmpge          223
				c = a[i1 & 0x3f];
	//  133  213:getstatic       #12  <Field char[] a>
	//  134  216:iload           7
	//  135  218:bipush          63
	//  136  220:iand            
	//  137  221:caload          
	//  138  222:istore_2        
			ac[k] = c;
	//  139  223:aload           11
	//  140  225:iload           5
	//  141  227:iload_2         
	//  142  228:castore         
		}

	//  143  229:iload           5
	//  144  231:iconst_1        
	//  145  232:iadd            
	//  146  233:istore          5
	//* 147  235:goto            27
		return ac;
	//  148  238:aload           11
	//  149  240:areturn         
	}

	public static String encodeString(String s)
	{
		return new String(encode(s.getBytes()));
	//    0    0:new             #22  <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #55  <Method byte[] String.getBytes()>
	//    4    8:invokestatic    #57  <Method char[] encode(byte[])>
	//    5   11:invokespecial   #60  <Method void String(char[])>
	//    6   14:areturn         
	}

	private static char a[];
	private static byte b[];

	static 
	{
		a = new char[64];
	//    0    0:bipush          64
	//    1    2:newarray        char[]
	//    2    4:putstatic       #12  <Field char[] a>
		boolean flag = false;
	//    3    7:iconst_0        
	//    4    8:istore_3        
		char c = 'A';
	//    5    9:bipush          65
	//    6   11:istore_0        
		int i;
		for(i = 0; c <= 'Z'; i++)
	//*   7   12:iconst_0        
	//*   8   13:istore_1        
	//*   9   14:iload_0         
	//*  10   15:bipush          90
	//*  11   17:icmpgt          38
		{
			a[i] = c;
	//   12   20:getstatic       #12  <Field char[] a>
	//   13   23:iload_1         
	//   14   24:iload_0         
	//   15   25:castore         
			c++;
	//   16   26:iload_0         
	//   17   27:iconst_1        
	//   18   28:iadd            
	//   19   29:int2char        
	//   20   30:istore_0        
		}

	//   21   31:iload_1         
	//   22   32:iconst_1        
	//   23   33:iadd            
	//   24   34:istore_1        
	//*  25   35:goto            14
		for(char c1 = 'a'; c1 <= 'z';)
	//*  26   38:bipush          97
	//*  27   40:istore_0        
	//*  28   41:iload_0         
	//*  29   42:bipush          122
	//*  30   44:icmpgt          65
		{
			a[i] = c1;
	//   31   47:getstatic       #12  <Field char[] a>
	//   32   50:iload_1         
	//   33   51:iload_0         
	//   34   52:castore         
			c1++;
	//   35   53:iload_0         
	//   36   54:iconst_1        
	//   37   55:iadd            
	//   38   56:int2char        
	//   39   57:istore_0        
			i++;
	//   40   58:iload_1         
	//   41   59:iconst_1        
	//   42   60:iadd            
	//   43   61:istore_1        
		}

	//*  44   62:goto            41
		for(char c2 = '0'; c2 <= '9';)
	//*  45   65:bipush          48
	//*  46   67:istore_0        
	//*  47   68:iload_0         
	//*  48   69:bipush          57
	//*  49   71:icmpgt          92
		{
			a[i] = c2;
	//   50   74:getstatic       #12  <Field char[] a>
	//   51   77:iload_1         
	//   52   78:iload_0         
	//   53   79:castore         
			c2++;
	//   54   80:iload_0         
	//   55   81:iconst_1        
	//   56   82:iadd            
	//   57   83:int2char        
	//   58   84:istore_0        
			i++;
	//   59   85:iload_1         
	//   60   86:iconst_1        
	//   61   87:iadd            
	//   62   88:istore_1        
		}

	//*  63   89:goto            68
		a[i] = '+';
	//   64   92:getstatic       #12  <Field char[] a>
	//   65   95:iload_1         
	//   66   96:bipush          43
	//   67   98:castore         
		a[i + 1] = '/';
	//   68   99:getstatic       #12  <Field char[] a>
	//   69  102:iload_1         
	//   70  103:iconst_1        
	//   71  104:iadd            
	//   72  105:bipush          47
	//   73  107:castore         
		b = new byte[128];
	//   74  108:sipush          128
	//   75  111:newarray        byte[]
	//   76  113:putstatic       #14  <Field byte[] b>
		i = 0;
	//   77  116:iconst_0        
	//   78  117:istore_1        
		int j;
		do
		{
			j = ((int) (flag));
	//   79  118:iload_3         
	//   80  119:istore_2        
			if(i >= b.length)
				break;
	//   81  120:iload_1         
	//   82  121:getstatic       #14  <Field byte[] b>
	//   83  124:arraylength     
	//   84  125:icmpge          141
			b[i] = -1;
	//   85  128:getstatic       #14  <Field byte[] b>
	//   86  131:iload_1         
	//   87  132:iconst_m1       
	//   88  133:bastore         
			i++;
	//   89  134:iload_1         
	//   90  135:iconst_1        
	//   91  136:iadd            
	//   92  137:istore_1        
		} while(true);
	//   93  138:goto            118
		for(; j < 64; j++)
	//*  94  141:iload_2         
	//*  95  142:bipush          64
	//*  96  144:icmpge          165
			b[a[j]] = (byte)j;
	//   97  147:getstatic       #14  <Field byte[] b>
	//   98  150:getstatic       #12  <Field char[] a>
	//   99  153:iload_2         
	//  100  154:caload          
	//  101  155:iload_2         
	//  102  156:int2byte        
	//  103  157:bastore         

	//  104  158:iload_2         
	//  105  159:iconst_1        
	//  106  160:iadd            
	//  107  161:istore_2        
	//* 108  162:goto            141
	//* 109  165:return          
	}
}
