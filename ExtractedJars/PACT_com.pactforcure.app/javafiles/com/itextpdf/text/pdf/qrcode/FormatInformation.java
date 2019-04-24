// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.qrcode;


// Referenced classes of package com.itextpdf.text.pdf.qrcode:
//			ErrorCorrectionLevel

final class FormatInformation
{

	private FormatInformation(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		errorCorrectionLevel = ErrorCorrectionLevel.forBits(i >> 3 & 3);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iconst_3        
	//    5    7:ishr            
	//    6    8:iconst_3        
	//    7    9:iand            
	//    8   10:invokestatic    #33  <Method ErrorCorrectionLevel ErrorCorrectionLevel.forBits(int)>
	//    9   13:putfield        #35  <Field ErrorCorrectionLevel errorCorrectionLevel>
		dataMask = (byte)(i & 7);
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:bipush          7
	//   13   20:iand            
	//   14   21:int2byte        
	//   15   22:putfield        #37  <Field byte dataMask>
	//   16   25:return          
	}

	static FormatInformation decodeFormatInformation(int i, int j)
	{
		FormatInformation formatinformation = doDecodeFormatInformation(i, j);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #42  <Method FormatInformation doDecodeFormatInformation(int, int)>
	//    3    5:astore_2        
		if(formatinformation != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          12
			return formatinformation;
	//    6   10:aload_2         
	//    7   11:areturn         
		else
			return doDecodeFormatInformation(i ^ 0x5412, j ^ 0x5412);
	//    8   12:iload_0         
	//    9   13:sipush          21522
	//   10   16:ixor            
	//   11   17:iload_1         
	//   12   18:sipush          21522
	//   13   21:ixor            
	//   14   22:invokestatic    #42  <Method FormatInformation doDecodeFormatInformation(int, int)>
	//   15   25:areturn         
	}

	private static FormatInformation doDecodeFormatInformation(int i, int j)
	{
		int j1 = 0x7fffffff;
	//    0    0:ldc1            #43  <Int 0x7fffffff>
	//    1    2:istore          5
		int l = 0;
	//    2    4:iconst_0        
	//    3    5:istore_3        
		for(int k1 = 0; k1 < FORMAT_INFO_DECODE_LOOKUP.length;)
	//*   4    6:iconst_0        
	//*   5    7:istore          6
	//*   6    9:iload           6
	//*   7   11:getstatic       #20  <Field int[][] FORMAT_INFO_DECODE_LOOKUP>
	//*   8   14:arraylength     
	//*   9   15:icmpge          135
		{
			int ai[] = FORMAT_INFO_DECODE_LOOKUP[k1];
	//   10   18:getstatic       #20  <Field int[][] FORMAT_INFO_DECODE_LOOKUP>
	//   11   21:iload           6
	//   12   23:aaload          
	//   13   24:astore          8
			int l1 = ai[0];
	//   14   26:aload           8
	//   15   28:iconst_0        
	//   16   29:iaload          
	//   17   30:istore          7
			if(l1 == i || l1 == j)
	//*  18   32:iload           7
	//*  19   34:iload_0         
	//*  20   35:icmpeq          44
	//*  21   38:iload           7
	//*  22   40:iload_1         
	//*  23   41:icmpne          56
				return new FormatInformation(ai[1]);
	//   24   44:new             #2   <Class FormatInformation>
	//   25   47:dup             
	//   26   48:aload           8
	//   27   50:iconst_1        
	//   28   51:iaload          
	//   29   52:invokespecial   #45  <Method void FormatInformation(int)>
	//   30   55:areturn         
			int i1 = numBitsDiffering(i, l1);
	//   31   56:iload_0         
	//   32   57:iload           7
	//   33   59:invokestatic    #49  <Method int numBitsDiffering(int, int)>
	//   34   62:istore          4
			int k = j1;
	//   35   64:iload           5
	//   36   66:istore_2        
			if(i1 < j1)
	//*  37   67:iload           4
	//*  38   69:iload           5
	//*  39   71:icmpge          82
			{
				l = ai[1];
	//   40   74:aload           8
	//   41   76:iconst_1        
	//   42   77:iaload          
	//   43   78:istore_3        
				k = i1;
	//   44   79:iload           4
	//   45   81:istore_2        
			}
			j1 = k;
	//   46   82:iload_2         
	//   47   83:istore          5
			i1 = l;
	//   48   85:iload_3         
	//   49   86:istore          4
			if(i != j)
	//*  50   88:iload_0         
	//*  51   89:iload_1         
	//*  52   90:icmpeq          123
			{
				l1 = numBitsDiffering(j, l1);
	//   53   93:iload_1         
	//   54   94:iload           7
	//   55   96:invokestatic    #49  <Method int numBitsDiffering(int, int)>
	//   56   99:istore          7
				j1 = k;
	//   57  101:iload_2         
	//   58  102:istore          5
				i1 = l;
	//   59  104:iload_3         
	//   60  105:istore          4
				if(l1 < k)
	//*  61  107:iload           7
	//*  62  109:iload_2         
	//*  63  110:icmpge          123
				{
					i1 = ai[1];
	//   64  113:aload           8
	//   65  115:iconst_1        
	//   66  116:iaload          
	//   67  117:istore          4
					j1 = l1;
	//   68  119:iload           7
	//   69  121:istore          5
				}
			}
			k1++;
	//   70  123:iload           6
	//   71  125:iconst_1        
	//   72  126:iadd            
	//   73  127:istore          6
			l = i1;
	//   74  129:iload           4
	//   75  131:istore_3        
		}

	//*  76  132:goto            9
		if(j1 <= 3)
	//*  77  135:iload           5
	//*  78  137:iconst_3        
	//*  79  138:icmpgt          150
			return new FormatInformation(l);
	//   80  141:new             #2   <Class FormatInformation>
	//   81  144:dup             
	//   82  145:iload_3         
	//   83  146:invokespecial   #45  <Method void FormatInformation(int)>
	//   84  149:areturn         
		else
			return null;
	//   85  150:aconst_null     
	//   86  151:areturn         
	}

	static int numBitsDiffering(int i, int j)
	{
		i ^= j;
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:ixor            
	//    3    3:istore_0        
		return BITS_SET_IN_HALF_BYTE[i & 0xf] + BITS_SET_IN_HALF_BYTE[i >>> 4 & 0xf] + BITS_SET_IN_HALF_BYTE[i >>> 8 & 0xf] + BITS_SET_IN_HALF_BYTE[i >>> 12 & 0xf] + BITS_SET_IN_HALF_BYTE[i >>> 16 & 0xf] + BITS_SET_IN_HALF_BYTE[i >>> 20 & 0xf] + BITS_SET_IN_HALF_BYTE[i >>> 24 & 0xf] + BITS_SET_IN_HALF_BYTE[i >>> 28 & 0xf];
	//    4    4:getstatic       #22  <Field int[] BITS_SET_IN_HALF_BYTE>
	//    5    7:iload_0         
	//    6    8:bipush          15
	//    7   10:iand            
	//    8   11:iaload          
	//    9   12:getstatic       #22  <Field int[] BITS_SET_IN_HALF_BYTE>
	//   10   15:iload_0         
	//   11   16:iconst_4        
	//   12   17:iushr           
	//   13   18:bipush          15
	//   14   20:iand            
	//   15   21:iaload          
	//   16   22:iadd            
	//   17   23:getstatic       #22  <Field int[] BITS_SET_IN_HALF_BYTE>
	//   18   26:iload_0         
	//   19   27:bipush          8
	//   20   29:iushr           
	//   21   30:bipush          15
	//   22   32:iand            
	//   23   33:iaload          
	//   24   34:iadd            
	//   25   35:getstatic       #22  <Field int[] BITS_SET_IN_HALF_BYTE>
	//   26   38:iload_0         
	//   27   39:bipush          12
	//   28   41:iushr           
	//   29   42:bipush          15
	//   30   44:iand            
	//   31   45:iaload          
	//   32   46:iadd            
	//   33   47:getstatic       #22  <Field int[] BITS_SET_IN_HALF_BYTE>
	//   34   50:iload_0         
	//   35   51:bipush          16
	//   36   53:iushr           
	//   37   54:bipush          15
	//   38   56:iand            
	//   39   57:iaload          
	//   40   58:iadd            
	//   41   59:getstatic       #22  <Field int[] BITS_SET_IN_HALF_BYTE>
	//   42   62:iload_0         
	//   43   63:bipush          20
	//   44   65:iushr           
	//   45   66:bipush          15
	//   46   68:iand            
	//   47   69:iaload          
	//   48   70:iadd            
	//   49   71:getstatic       #22  <Field int[] BITS_SET_IN_HALF_BYTE>
	//   50   74:iload_0         
	//   51   75:bipush          24
	//   52   77:iushr           
	//   53   78:bipush          15
	//   54   80:iand            
	//   55   81:iaload          
	//   56   82:iadd            
	//   57   83:getstatic       #22  <Field int[] BITS_SET_IN_HALF_BYTE>
	//   58   86:iload_0         
	//   59   87:bipush          28
	//   60   89:iushr           
	//   61   90:bipush          15
	//   62   92:iand            
	//   63   93:iaload          
	//   64   94:iadd            
	//   65   95:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof FormatInformation)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class FormatInformation>
	//*   2    4:ifne            9
	//*   3    7:iconst_0        
	//*   4    8:ireturn         
	//*   5    9:aload_1         
	//*   6   10:checkcast       #2   <Class FormatInformation>
	//*   7   13:astore_1        
			if(errorCorrectionLevel == ((FormatInformation) (obj = ((Object) ((FormatInformation)obj)))).errorCorrectionLevel && dataMask == ((FormatInformation) (obj)).dataMask)
	//*   8   14:aload_0         
	//*   9   15:getfield        #35  <Field ErrorCorrectionLevel errorCorrectionLevel>
	//*  10   18:aload_1         
	//*  11   19:getfield        #35  <Field ErrorCorrectionLevel errorCorrectionLevel>
	//*  12   22:if_acmpne       7
	//*  13   25:aload_0         
	//*  14   26:getfield        #37  <Field byte dataMask>
	//*  15   29:aload_1         
	//*  16   30:getfield        #37  <Field byte dataMask>
	//*  17   33:icmpne          7
				return true;
	//   18   36:iconst_1        
	//   19   37:ireturn         
		return false;
	}

	byte getDataMask()
	{
		return dataMask;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field byte dataMask>
	//    2    4:ireturn         
	}

	ErrorCorrectionLevel getErrorCorrectionLevel()
	{
		return errorCorrectionLevel;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ErrorCorrectionLevel errorCorrectionLevel>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return errorCorrectionLevel.ordinal() << 3 | dataMask;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ErrorCorrectionLevel errorCorrectionLevel>
	//    2    4:invokevirtual   #60  <Method int ErrorCorrectionLevel.ordinal()>
	//    3    7:iconst_3        
	//    4    8:ishl            
	//    5    9:aload_0         
	//    6   10:getfield        #37  <Field byte dataMask>
	//    7   13:ior             
	//    8   14:ireturn         
	}

	private static final int BITS_SET_IN_HALF_BYTE[] = {
		0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 
		2, 3, 2, 3, 3, 4
	};
	private static final int FORMAT_INFO_DECODE_LOOKUP[][];
	private static final int FORMAT_INFO_MASK_QR = 21522;
	private final byte dataMask;
	private final ErrorCorrectionLevel errorCorrectionLevel;

	static 
	{
		int ai[] = {
			20773, 1
		};
	//    0    0:iconst_2        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:sipush          20773
	//    5    8:iastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:iconst_1        
	//    9   12:iastore         
	//   10   13:astore_0        
		int ai1[] = {
			32170, 10
		};
	//   11   14:iconst_2        
	//   12   15:newarray        int[]
	//   13   17:dup             
	//   14   18:iconst_0        
	//   15   19:sipush          32170
	//   16   22:iastore         
	//   17   23:dup             
	//   18   24:iconst_1        
	//   19   25:bipush          10
	//   20   27:iastore         
	//   21   28:astore_1        
		int ai2[] = {
			26998, 15
		};
	//   22   29:iconst_2        
	//   23   30:newarray        int[]
	//   24   32:dup             
	//   25   33:iconst_0        
	//   26   34:sipush          26998
	//   27   37:iastore         
	//   28   38:dup             
	//   29   39:iconst_1        
	//   30   40:bipush          15
	//   31   42:iastore         
	//   32   43:astore_2        
		int ai3[] = {
			5054, 17
		};
	//   33   44:iconst_2        
	//   34   45:newarray        int[]
	//   35   47:dup             
	//   36   48:iconst_0        
	//   37   49:sipush          5054
	//   38   52:iastore         
	//   39   53:dup             
	//   40   54:iconst_1        
	//   41   55:bipush          17
	//   42   57:iastore         
	//   43   58:astore_3        
		int ai4[] = {
			12392, 25
		};
	//   44   59:iconst_2        
	//   45   60:newarray        int[]
	//   46   62:dup             
	//   47   63:iconst_0        
	//   48   64:sipush          12392
	//   49   67:iastore         
	//   50   68:dup             
	//   51   69:iconst_1        
	//   52   70:bipush          25
	//   53   72:iastore         
	//   54   73:astore          4
		FORMAT_INFO_DECODE_LOOKUP = (new int[][] {
			new int[] {
				21522, 0
			}, ai, new int[] {
				24188, 2
			}, new int[] {
				23371, 3
			}, new int[] {
				17913, 4
			}, new int[] {
				16590, 5
			}, new int[] {
				20375, 6
			}, new int[] {
				19104, 7
			}, new int[] {
				30660, 8
			}, new int[] {
				29427, 9
			}, ai1, new int[] {
				30877, 11
			}, new int[] {
				26159, 12
			}, new int[] {
				25368, 13
			}, new int[] {
				27713, 14
			}, ai2, new int[] {
				5769, 16
			}, ai3, new int[] {
				7399, 18
			}, new int[] {
				6608, 19
			}, new int[] {
				1890, 20
			}, new int[] {
				597, 21
			}, new int[] {
				3340, 22
			}, new int[] {
				2107, 23
			}, new int[] {
				13663, 24
			}, ai4, new int[] {
				16177, 26
			}, new int[] {
				14854, 27
			}, new int[] {
				9396, 28
			}, new int[] {
				8579, 29
			}, new int[] {
				11994, 30
			}, new int[] {
				11245, 31
			}
		});
	//   55   75:bipush          32
	//   56   77:anewarray       int[][]
	//   57   80:dup             
	//   58   81:iconst_0        
	//   59   82:iconst_2        
	//   60   83:newarray        int[]
	//   61   85:dup             
	//   62   86:iconst_0        
	//   63   87:sipush          21522
	//   64   90:iastore         
	//   65   91:dup             
	//   66   92:iconst_1        
	//   67   93:iconst_0        
	//   68   94:iastore         
	//   69   95:aastore         
	//   70   96:dup             
	//   71   97:iconst_1        
	//   72   98:aload_0         
	//   73   99:aastore         
	//   74  100:dup             
	//   75  101:iconst_2        
	//   76  102:iconst_2        
	//   77  103:newarray        int[]
	//   78  105:dup             
	//   79  106:iconst_0        
	//   80  107:sipush          24188
	//   81  110:iastore         
	//   82  111:dup             
	//   83  112:iconst_1        
	//   84  113:iconst_2        
	//   85  114:iastore         
	//   86  115:aastore         
	//   87  116:dup             
	//   88  117:iconst_3        
	//   89  118:iconst_2        
	//   90  119:newarray        int[]
	//   91  121:dup             
	//   92  122:iconst_0        
	//   93  123:sipush          23371
	//   94  126:iastore         
	//   95  127:dup             
	//   96  128:iconst_1        
	//   97  129:iconst_3        
	//   98  130:iastore         
	//   99  131:aastore         
	//  100  132:dup             
	//  101  133:iconst_4        
	//  102  134:iconst_2        
	//  103  135:newarray        int[]
	//  104  137:dup             
	//  105  138:iconst_0        
	//  106  139:sipush          17913
	//  107  142:iastore         
	//  108  143:dup             
	//  109  144:iconst_1        
	//  110  145:iconst_4        
	//  111  146:iastore         
	//  112  147:aastore         
	//  113  148:dup             
	//  114  149:iconst_5        
	//  115  150:iconst_2        
	//  116  151:newarray        int[]
	//  117  153:dup             
	//  118  154:iconst_0        
	//  119  155:sipush          16590
	//  120  158:iastore         
	//  121  159:dup             
	//  122  160:iconst_1        
	//  123  161:iconst_5        
	//  124  162:iastore         
	//  125  163:aastore         
	//  126  164:dup             
	//  127  165:bipush          6
	//  128  167:iconst_2        
	//  129  168:newarray        int[]
	//  130  170:dup             
	//  131  171:iconst_0        
	//  132  172:sipush          20375
	//  133  175:iastore         
	//  134  176:dup             
	//  135  177:iconst_1        
	//  136  178:bipush          6
	//  137  180:iastore         
	//  138  181:aastore         
	//  139  182:dup             
	//  140  183:bipush          7
	//  141  185:iconst_2        
	//  142  186:newarray        int[]
	//  143  188:dup             
	//  144  189:iconst_0        
	//  145  190:sipush          19104
	//  146  193:iastore         
	//  147  194:dup             
	//  148  195:iconst_1        
	//  149  196:bipush          7
	//  150  198:iastore         
	//  151  199:aastore         
	//  152  200:dup             
	//  153  201:bipush          8
	//  154  203:iconst_2        
	//  155  204:newarray        int[]
	//  156  206:dup             
	//  157  207:iconst_0        
	//  158  208:sipush          30660
	//  159  211:iastore         
	//  160  212:dup             
	//  161  213:iconst_1        
	//  162  214:bipush          8
	//  163  216:iastore         
	//  164  217:aastore         
	//  165  218:dup             
	//  166  219:bipush          9
	//  167  221:iconst_2        
	//  168  222:newarray        int[]
	//  169  224:dup             
	//  170  225:iconst_0        
	//  171  226:sipush          29427
	//  172  229:iastore         
	//  173  230:dup             
	//  174  231:iconst_1        
	//  175  232:bipush          9
	//  176  234:iastore         
	//  177  235:aastore         
	//  178  236:dup             
	//  179  237:bipush          10
	//  180  239:aload_1         
	//  181  240:aastore         
	//  182  241:dup             
	//  183  242:bipush          11
	//  184  244:iconst_2        
	//  185  245:newarray        int[]
	//  186  247:dup             
	//  187  248:iconst_0        
	//  188  249:sipush          30877
	//  189  252:iastore         
	//  190  253:dup             
	//  191  254:iconst_1        
	//  192  255:bipush          11
	//  193  257:iastore         
	//  194  258:aastore         
	//  195  259:dup             
	//  196  260:bipush          12
	//  197  262:iconst_2        
	//  198  263:newarray        int[]
	//  199  265:dup             
	//  200  266:iconst_0        
	//  201  267:sipush          26159
	//  202  270:iastore         
	//  203  271:dup             
	//  204  272:iconst_1        
	//  205  273:bipush          12
	//  206  275:iastore         
	//  207  276:aastore         
	//  208  277:dup             
	//  209  278:bipush          13
	//  210  280:iconst_2        
	//  211  281:newarray        int[]
	//  212  283:dup             
	//  213  284:iconst_0        
	//  214  285:sipush          25368
	//  215  288:iastore         
	//  216  289:dup             
	//  217  290:iconst_1        
	//  218  291:bipush          13
	//  219  293:iastore         
	//  220  294:aastore         
	//  221  295:dup             
	//  222  296:bipush          14
	//  223  298:iconst_2        
	//  224  299:newarray        int[]
	//  225  301:dup             
	//  226  302:iconst_0        
	//  227  303:sipush          27713
	//  228  306:iastore         
	//  229  307:dup             
	//  230  308:iconst_1        
	//  231  309:bipush          14
	//  232  311:iastore         
	//  233  312:aastore         
	//  234  313:dup             
	//  235  314:bipush          15
	//  236  316:aload_2         
	//  237  317:aastore         
	//  238  318:dup             
	//  239  319:bipush          16
	//  240  321:iconst_2        
	//  241  322:newarray        int[]
	//  242  324:dup             
	//  243  325:iconst_0        
	//  244  326:sipush          5769
	//  245  329:iastore         
	//  246  330:dup             
	//  247  331:iconst_1        
	//  248  332:bipush          16
	//  249  334:iastore         
	//  250  335:aastore         
	//  251  336:dup             
	//  252  337:bipush          17
	//  253  339:aload_3         
	//  254  340:aastore         
	//  255  341:dup             
	//  256  342:bipush          18
	//  257  344:iconst_2        
	//  258  345:newarray        int[]
	//  259  347:dup             
	//  260  348:iconst_0        
	//  261  349:sipush          7399
	//  262  352:iastore         
	//  263  353:dup             
	//  264  354:iconst_1        
	//  265  355:bipush          18
	//  266  357:iastore         
	//  267  358:aastore         
	//  268  359:dup             
	//  269  360:bipush          19
	//  270  362:iconst_2        
	//  271  363:newarray        int[]
	//  272  365:dup             
	//  273  366:iconst_0        
	//  274  367:sipush          6608
	//  275  370:iastore         
	//  276  371:dup             
	//  277  372:iconst_1        
	//  278  373:bipush          19
	//  279  375:iastore         
	//  280  376:aastore         
	//  281  377:dup             
	//  282  378:bipush          20
	//  283  380:iconst_2        
	//  284  381:newarray        int[]
	//  285  383:dup             
	//  286  384:iconst_0        
	//  287  385:sipush          1890
	//  288  388:iastore         
	//  289  389:dup             
	//  290  390:iconst_1        
	//  291  391:bipush          20
	//  292  393:iastore         
	//  293  394:aastore         
	//  294  395:dup             
	//  295  396:bipush          21
	//  296  398:iconst_2        
	//  297  399:newarray        int[]
	//  298  401:dup             
	//  299  402:iconst_0        
	//  300  403:sipush          597
	//  301  406:iastore         
	//  302  407:dup             
	//  303  408:iconst_1        
	//  304  409:bipush          21
	//  305  411:iastore         
	//  306  412:aastore         
	//  307  413:dup             
	//  308  414:bipush          22
	//  309  416:iconst_2        
	//  310  417:newarray        int[]
	//  311  419:dup             
	//  312  420:iconst_0        
	//  313  421:sipush          3340
	//  314  424:iastore         
	//  315  425:dup             
	//  316  426:iconst_1        
	//  317  427:bipush          22
	//  318  429:iastore         
	//  319  430:aastore         
	//  320  431:dup             
	//  321  432:bipush          23
	//  322  434:iconst_2        
	//  323  435:newarray        int[]
	//  324  437:dup             
	//  325  438:iconst_0        
	//  326  439:sipush          2107
	//  327  442:iastore         
	//  328  443:dup             
	//  329  444:iconst_1        
	//  330  445:bipush          23
	//  331  447:iastore         
	//  332  448:aastore         
	//  333  449:dup             
	//  334  450:bipush          24
	//  335  452:iconst_2        
	//  336  453:newarray        int[]
	//  337  455:dup             
	//  338  456:iconst_0        
	//  339  457:sipush          13663
	//  340  460:iastore         
	//  341  461:dup             
	//  342  462:iconst_1        
	//  343  463:bipush          24
	//  344  465:iastore         
	//  345  466:aastore         
	//  346  467:dup             
	//  347  468:bipush          25
	//  348  470:aload           4
	//  349  472:aastore         
	//  350  473:dup             
	//  351  474:bipush          26
	//  352  476:iconst_2        
	//  353  477:newarray        int[]
	//  354  479:dup             
	//  355  480:iconst_0        
	//  356  481:sipush          16177
	//  357  484:iastore         
	//  358  485:dup             
	//  359  486:iconst_1        
	//  360  487:bipush          26
	//  361  489:iastore         
	//  362  490:aastore         
	//  363  491:dup             
	//  364  492:bipush          27
	//  365  494:iconst_2        
	//  366  495:newarray        int[]
	//  367  497:dup             
	//  368  498:iconst_0        
	//  369  499:sipush          14854
	//  370  502:iastore         
	//  371  503:dup             
	//  372  504:iconst_1        
	//  373  505:bipush          27
	//  374  507:iastore         
	//  375  508:aastore         
	//  376  509:dup             
	//  377  510:bipush          28
	//  378  512:iconst_2        
	//  379  513:newarray        int[]
	//  380  515:dup             
	//  381  516:iconst_0        
	//  382  517:sipush          9396
	//  383  520:iastore         
	//  384  521:dup             
	//  385  522:iconst_1        
	//  386  523:bipush          28
	//  387  525:iastore         
	//  388  526:aastore         
	//  389  527:dup             
	//  390  528:bipush          29
	//  391  530:iconst_2        
	//  392  531:newarray        int[]
	//  393  533:dup             
	//  394  534:iconst_0        
	//  395  535:sipush          8579
	//  396  538:iastore         
	//  397  539:dup             
	//  398  540:iconst_1        
	//  399  541:bipush          29
	//  400  543:iastore         
	//  401  544:aastore         
	//  402  545:dup             
	//  403  546:bipush          30
	//  404  548:iconst_2        
	//  405  549:newarray        int[]
	//  406  551:dup             
	//  407  552:iconst_0        
	//  408  553:sipush          11994
	//  409  556:iastore         
	//  410  557:dup             
	//  411  558:iconst_1        
	//  412  559:bipush          30
	//  413  561:iastore         
	//  414  562:aastore         
	//  415  563:dup             
	//  416  564:bipush          31
	//  417  566:iconst_2        
	//  418  567:newarray        int[]
	//  419  569:dup             
	//  420  570:iconst_0        
	//  421  571:sipush          11245
	//  422  574:iastore         
	//  423  575:dup             
	//  424  576:iconst_1        
	//  425  577:bipush          31
	//  426  579:iastore         
	//  427  580:aastore         
	//  428  581:putstatic       #20  <Field int[][] FORMAT_INFO_DECODE_LOOKUP>
	//  429  584:bipush          16
	//  430  586:newarray        int[]
	//  431  588:dup             
	//  432  589:iconst_0        
	//  433  590:iconst_0        
	//  434  591:iastore         
	//  435  592:dup             
	//  436  593:iconst_1        
	//  437  594:iconst_1        
	//  438  595:iastore         
	//  439  596:dup             
	//  440  597:iconst_2        
	//  441  598:iconst_1        
	//  442  599:iastore         
	//  443  600:dup             
	//  444  601:iconst_3        
	//  445  602:iconst_2        
	//  446  603:iastore         
	//  447  604:dup             
	//  448  605:iconst_4        
	//  449  606:iconst_1        
	//  450  607:iastore         
	//  451  608:dup             
	//  452  609:iconst_5        
	//  453  610:iconst_2        
	//  454  611:iastore         
	//  455  612:dup             
	//  456  613:bipush          6
	//  457  615:iconst_2        
	//  458  616:iastore         
	//  459  617:dup             
	//  460  618:bipush          7
	//  461  620:iconst_3        
	//  462  621:iastore         
	//  463  622:dup             
	//  464  623:bipush          8
	//  465  625:iconst_1        
	//  466  626:iastore         
	//  467  627:dup             
	//  468  628:bipush          9
	//  469  630:iconst_2        
	//  470  631:iastore         
	//  471  632:dup             
	//  472  633:bipush          10
	//  473  635:iconst_2        
	//  474  636:iastore         
	//  475  637:dup             
	//  476  638:bipush          11
	//  477  640:iconst_3        
	//  478  641:iastore         
	//  479  642:dup             
	//  480  643:bipush          12
	//  481  645:iconst_2        
	//  482  646:iastore         
	//  483  647:dup             
	//  484  648:bipush          13
	//  485  650:iconst_3        
	//  486  651:iastore         
	//  487  652:dup             
	//  488  653:bipush          14
	//  489  655:iconst_3        
	//  490  656:iastore         
	//  491  657:dup             
	//  492  658:bipush          15
	//  493  660:iconst_4        
	//  494  661:iastore         
	//  495  662:putstatic       #22  <Field int[] BITS_SET_IN_HALF_BYTE>
	//* 496  665:return          
	}
}
