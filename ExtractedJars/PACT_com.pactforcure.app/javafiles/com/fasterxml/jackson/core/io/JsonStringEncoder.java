// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.lang.ref.SoftReference;

// Referenced classes of package com.fasterxml.jackson.core.io:
//			CharTypes, UTF8Writer

public final class JsonStringEncoder
{

	public JsonStringEncoder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:bipush          6
	//    4    7:newarray        char[]
	//    5    9:putfield        #52  <Field char[] _qbuf>
		_qbuf[0] = '\\';
	//    6   12:aload_0         
	//    7   13:getfield        #52  <Field char[] _qbuf>
	//    8   16:iconst_0        
	//    9   17:bipush          92
	//   10   19:castore         
		_qbuf[2] = '0';
	//   11   20:aload_0         
	//   12   21:getfield        #52  <Field char[] _qbuf>
	//   13   24:iconst_2        
	//   14   25:bipush          48
	//   15   27:castore         
		_qbuf[3] = '0';
	//   16   28:aload_0         
	//   17   29:getfield        #52  <Field char[] _qbuf>
	//   18   32:iconst_3        
	//   19   33:bipush          48
	//   20   35:castore         
	//   21   36:return          
	}

	private int _appendByte(int i, int j, ByteArrayBuilder bytearraybuilder, int k)
	{
		bytearraybuilder.setCurrentSegmentLength(k);
	//    0    0:aload_3         
	//    1    1:iload           4
	//    2    3:invokevirtual   #60  <Method void ByteArrayBuilder.setCurrentSegmentLength(int)>
		bytearraybuilder.append(92);
	//    3    6:aload_3         
	//    4    7:bipush          92
	//    5    9:invokevirtual   #63  <Method void ByteArrayBuilder.append(int)>
		if(j < 0)
	//*   6   12:iload_2         
	//*   7   13:ifge            106
		{
			bytearraybuilder.append(117);
	//    8   16:aload_3         
	//    9   17:bipush          117
	//   10   19:invokevirtual   #63  <Method void ByteArrayBuilder.append(int)>
			if(i > 255)
	//*  11   22:iload_1         
	//*  12   23:sipush          255
	//*  13   26:icmple          91
			{
				j = i >> 8;
	//   14   29:iload_1         
	//   15   30:bipush          8
	//   16   32:ishr            
	//   17   33:istore_2        
				bytearraybuilder.append(((int) (HB[j >> 4])));
	//   18   34:aload_3         
	//   19   35:getstatic       #41  <Field byte[] HB>
	//   20   38:iload_2         
	//   21   39:iconst_4        
	//   22   40:ishr            
	//   23   41:baload          
	//   24   42:invokevirtual   #63  <Method void ByteArrayBuilder.append(int)>
				bytearraybuilder.append(((int) (HB[j & 0xf])));
	//   25   45:aload_3         
	//   26   46:getstatic       #41  <Field byte[] HB>
	//   27   49:iload_2         
	//   28   50:bipush          15
	//   29   52:iand            
	//   30   53:baload          
	//   31   54:invokevirtual   #63  <Method void ByteArrayBuilder.append(int)>
				i &= 0xff;
	//   32   57:iload_1         
	//   33   58:sipush          255
	//   34   61:iand            
	//   35   62:istore_1        
			} else
	//*  36   63:aload_3         
	//*  37   64:getstatic       #41  <Field byte[] HB>
	//*  38   67:iload_1         
	//*  39   68:iconst_4        
	//*  40   69:ishr            
	//*  41   70:baload          
	//*  42   71:invokevirtual   #63  <Method void ByteArrayBuilder.append(int)>
	//*  43   74:aload_3         
	//*  44   75:getstatic       #41  <Field byte[] HB>
	//*  45   78:iload_1         
	//*  46   79:bipush          15
	//*  47   81:iand            
	//*  48   82:baload          
	//*  49   83:invokevirtual   #63  <Method void ByteArrayBuilder.append(int)>
	//*  50   86:aload_3         
	//*  51   87:invokevirtual   #67  <Method int ByteArrayBuilder.getCurrentSegmentLength()>
	//*  52   90:ireturn         
			{
				bytearraybuilder.append(48);
	//   53   91:aload_3         
	//   54   92:bipush          48
	//   55   94:invokevirtual   #63  <Method void ByteArrayBuilder.append(int)>
				bytearraybuilder.append(48);
	//   56   97:aload_3         
	//   57   98:bipush          48
	//   58  100:invokevirtual   #63  <Method void ByteArrayBuilder.append(int)>
			}
			bytearraybuilder.append(((int) (HB[i >> 4])));
			bytearraybuilder.append(((int) (HB[i & 0xf])));
		} else
	//*  59  103:goto            63
		{
			bytearraybuilder.append(((int) ((byte)j)));
	//   60  106:aload_3         
	//   61  107:iload_2         
	//   62  108:int2byte        
	//   63  109:invokevirtual   #63  <Method void ByteArrayBuilder.append(int)>
		}
		return bytearraybuilder.getCurrentSegmentLength();
	//*  64  112:goto            86
	}

	private int _appendNamed(int i, char ac[])
	{
		ac[1] = (char)i;
	//    0    0:aload_2         
	//    1    1:iconst_1        
	//    2    2:iload_1         
	//    3    3:int2char        
	//    4    4:castore         
		return 2;
	//    5    5:iconst_2        
	//    6    6:ireturn         
	}

	private int _appendNumeric(int i, char ac[])
	{
		ac[1] = 'u';
	//    0    0:aload_2         
	//    1    1:iconst_1        
	//    2    2:bipush          117
	//    3    4:castore         
		ac[4] = HC[i >> 4];
	//    4    5:aload_2         
	//    5    6:iconst_4        
	//    6    7:getstatic       #35  <Field char[] HC>
	//    7   10:iload_1         
	//    8   11:iconst_4        
	//    9   12:ishr            
	//   10   13:caload          
	//   11   14:castore         
		ac[5] = HC[i & 0xf];
	//   12   15:aload_2         
	//   13   16:iconst_5        
	//   14   17:getstatic       #35  <Field char[] HC>
	//   15   20:iload_1         
	//   16   21:bipush          15
	//   17   23:iand            
	//   18   24:caload          
	//   19   25:castore         
		return 6;
	//   20   26:bipush          6
	//   21   28:ireturn         
	}

	private static int _convert(int i, int j)
	{
		if(j < 56320 || j > 57343)
	//*   0    0:iload_1         
	//*   1    1:ldc1            #15  <Int 56320>
	//*   2    3:icmplt          12
	//*   3    6:iload_1         
	//*   4    7:ldc1            #17  <Int 57343>
	//*   5    9:icmple          59
			throw new IllegalArgumentException((new StringBuilder()).append("Broken surrogate pair: first char 0x").append(Integer.toHexString(i)).append(", second 0x").append(Integer.toHexString(j)).append("; illegal combination").toString());
	//    6   12:new             #74  <Class IllegalArgumentException>
	//    7   15:dup             
	//    8   16:new             #76  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #77  <Method void StringBuilder()>
	//   11   23:ldc1            #79  <String "Broken surrogate pair: first char 0x">
	//   12   25:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   13   28:iload_0         
	//   14   29:invokestatic    #88  <Method String Integer.toHexString(int)>
	//   15   32:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   16   35:ldc1            #90  <String ", second 0x">
	//   17   37:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   18   40:iload_1         
	//   19   41:invokestatic    #88  <Method String Integer.toHexString(int)>
	//   20   44:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   21   47:ldc1            #92  <String "; illegal combination">
	//   22   49:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   23   52:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   24   55:invokespecial   #99  <Method void IllegalArgumentException(String)>
	//   25   58:athrow          
		else
			return 0x10000 + (i - 55296 << 10) + (j - 56320);
	//   26   59:ldc1            #100 <Int 0x10000>
	//   27   61:iload_0         
	//   28   62:ldc1            #11  <Int 55296>
	//   29   64:isub            
	//   30   65:bipush          10
	//   31   67:ishl            
	//   32   68:iadd            
	//   33   69:iload_1         
	//   34   70:ldc1            #15  <Int 56320>
	//   35   72:isub            
	//   36   73:iadd            
	//   37   74:ireturn         
	}

	private static void _illegal(int i)
	{
		throw new IllegalArgumentException(UTF8Writer.illegalSurrogateDesc(i));
	//    0    0:new             #74  <Class IllegalArgumentException>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:invokestatic    #106 <Method String UTF8Writer.illegalSurrogateDesc(int)>
	//    4    8:invokespecial   #99  <Method void IllegalArgumentException(String)>
	//    5   11:athrow          
	}

	public static JsonStringEncoder getInstance()
	{
		Object obj = ((Object) ((SoftReference)_threadEncoder.get()));
	//    0    0:getstatic       #48  <Field ThreadLocal _threadEncoder>
	//    1    3:invokevirtual   #112 <Method Object ThreadLocal.get()>
	//    2    6:checkcast       #114 <Class SoftReference>
	//    3    9:astore_0        
		Object obj1;
		if(obj == null)
	//*   4   10:aload_0         
	//*   5   11:ifnonnull       46
			obj = null;
	//    6   14:aconst_null     
	//    7   15:astore_0        
		else
	//*   8   16:aload_0         
	//*   9   17:astore_1        
	//*  10   18:aload_0         
	//*  11   19:ifnonnull       44
	//*  12   22:new             #2   <Class JsonStringEncoder>
	//*  13   25:dup             
	//*  14   26:invokespecial   #115 <Method void JsonStringEncoder()>
	//*  15   29:astore_1        
	//*  16   30:getstatic       #48  <Field ThreadLocal _threadEncoder>
	//*  17   33:new             #114 <Class SoftReference>
	//*  18   36:dup             
	//*  19   37:aload_1         
	//*  20   38:invokespecial   #118 <Method void SoftReference(Object)>
	//*  21   41:invokevirtual   #121 <Method void ThreadLocal.set(Object)>
	//*  22   44:aload_1         
	//*  23   45:areturn         
			obj = ((Object) ((JsonStringEncoder)((SoftReference) (obj)).get()));
	//   24   46:aload_0         
	//   25   47:invokevirtual   #122 <Method Object SoftReference.get()>
	//   26   50:checkcast       #2   <Class JsonStringEncoder>
	//   27   53:astore_0        
		obj1 = obj;
		if(obj == null)
		{
			obj1 = ((Object) (new JsonStringEncoder()));
			_threadEncoder.set(((Object) (new SoftReference(obj1))));
		}
		return ((JsonStringEncoder) (obj1));
	//*  28   54:goto            16
	}

	public byte[] encodeAsUTF8(String s)
	{
		int i;
		int j;
		int k;
		int j2;
		byte abyte0[];
		ByteArrayBuilder bytearraybuilder1;
		ByteArrayBuilder bytearraybuilder = _bytes;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field ByteArrayBuilder _bytes>
	//    2    4:astore          9
		bytearraybuilder1 = bytearraybuilder;
	//    3    6:aload           9
	//    4    8:astore          10
		if(bytearraybuilder == null)
	//*   5   10:aload           9
	//*   6   12:ifnonnull       31
		{
			bytearraybuilder1 = new ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler) (null)));
	//    7   15:new             #56  <Class ByteArrayBuilder>
	//    8   18:dup             
	//    9   19:aconst_null     
	//   10   20:invokespecial   #129 <Method void ByteArrayBuilder(com.fasterxml.jackson.core.util.BufferRecycler)>
	//   11   23:astore          10
			_bytes = bytearraybuilder1;
	//   12   25:aload_0         
	//   13   26:aload           10
	//   14   28:putfield        #126 <Field ByteArrayBuilder _bytes>
		}
		j2 = s.length();
	//   15   31:aload_1         
	//   16   32:invokevirtual   #134 <Method int String.length()>
	//   17   35:istore          8
		i = 0;
	//   18   37:iconst_0        
	//   19   38:istore_2        
		abyte0 = bytearraybuilder1.resetAndGetFirstSegment();
	//   20   39:aload           10
	//   21   41:invokevirtual   #137 <Method byte[] ByteArrayBuilder.resetAndGetFirstSegment()>
	//   22   44:astore          9
		k = abyte0.length;
	//   23   46:aload           9
	//   24   48:arraylength     
	//   25   49:istore          4
		j = 0;
	//   26   51:iconst_0        
	//   27   52:istore_3        
_L7:
		if(j >= j2) goto _L2; else goto _L1
	//   28   53:iload_3         
	//   29   54:iload           8
	//   30   56:icmpge          564
_L1:
		int l;
		l = ((int) (s.charAt(j)));
	//   31   59:aload_1         
	//   32   60:iload_3         
	//   33   61:invokevirtual   #141 <Method char String.charAt(int)>
	//   34   64:istore          5
		j++;
	//   35   66:iload_3         
	//   36   67:iconst_1        
	//   37   68:iadd            
	//   38   69:istore_3        
_L5:
		int i1;
		if(l > 127)
			break; /* Loop/switch isn't completed */
	//   39   70:iload           5
	//   40   72:bipush          127
	//   41   74:icmpgt          151
		i1 = k;
	//   42   77:iload           4
	//   43   79:istore          6
		int l1 = i;
	//   44   81:iload_2         
	//   45   82:istore          7
		if(i >= k)
	//*  46   84:iload_2         
	//*  47   85:iload           4
	//*  48   87:icmplt          105
		{
			abyte0 = bytearraybuilder1.finishCurrentSegment();
	//   49   90:aload           10
	//   50   92:invokevirtual   #144 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//   51   95:astore          9
			i1 = abyte0.length;
	//   52   97:aload           9
	//   53   99:arraylength     
	//   54  100:istore          6
			l1 = 0;
	//   55  102:iconst_0        
	//   56  103:istore          7
		}
		i = l1 + 1;
	//   57  105:iload           7
	//   58  107:iconst_1        
	//   59  108:iadd            
	//   60  109:istore_2        
		abyte0[l1] = (byte)l;
	//   61  110:aload           9
	//   62  112:iload           7
	//   63  114:iload           5
	//   64  116:int2byte        
	//   65  117:bastore         
		if(j < j2) goto _L3; else goto _L2
	//   66  118:iload_3         
	//   67  119:iload           8
	//   68  121:icmplt          133
_L2:
		return _bytes.completeAndCoalesce(i);
	//   69  124:aload_0         
	//   70  125:getfield        #126 <Field ByteArrayBuilder _bytes>
	//   71  128:iload_2         
	//   72  129:invokevirtual   #148 <Method byte[] ByteArrayBuilder.completeAndCoalesce(int)>
	//   73  132:areturn         
_L3:
		l = ((int) (s.charAt(j)));
	//   74  133:aload_1         
	//   75  134:iload_3         
	//   76  135:invokevirtual   #141 <Method char String.charAt(int)>
	//   77  138:istore          5
		j++;
	//   78  140:iload_3         
	//   79  141:iconst_1        
	//   80  142:iadd            
	//   81  143:istore_3        
		k = i1;
	//   82  144:iload           6
	//   83  146:istore          4
		if(true) goto _L5; else goto _L4
	//   84  148:goto            70
_L4:
		int j1;
		int i2;
		if(i >= k)
	//*  85  151:iload_2         
	//*  86  152:iload           4
	//*  87  154:icmplt          551
		{
			abyte0 = bytearraybuilder1.finishCurrentSegment();
	//   88  157:aload           10
	//   89  159:invokevirtual   #144 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//   90  162:astore          9
			i = abyte0.length;
	//   91  164:aload           9
	//   92  166:arraylength     
	//   93  167:istore_2        
			k = 0;
	//   94  168:iconst_0        
	//   95  169:istore          4
		} else
	//*  96  171:iload           5
	//*  97  173:sipush          2048
	//*  98  176:icmpge          277
	//*  99  179:iload           4
	//* 100  181:iconst_1        
	//* 101  182:iadd            
	//* 102  183:istore          7
	//* 103  185:aload           9
	//* 104  187:iload           4
	//* 105  189:iload           5
	//* 106  191:bipush          6
	//* 107  193:ishr            
	//* 108  194:sipush          192
	//* 109  197:ior             
	//* 110  198:int2byte        
	//* 111  199:bastore         
	//* 112  200:iload_3         
	//* 113  201:istore          6
	//* 114  203:iload           7
	//* 115  205:istore          4
	//* 116  207:iload_2         
	//* 117  208:istore_3        
	//* 118  209:iload           6
	//* 119  211:istore_2        
	//* 120  212:iload           5
	//* 121  214:istore          6
	//* 122  216:iload_3         
	//* 123  217:istore          5
	//* 124  219:iload           4
	//* 125  221:istore          7
	//* 126  223:iload           4
	//* 127  225:iload_3         
	//* 128  226:icmplt          244
	//* 129  229:aload           10
	//* 130  231:invokevirtual   #144 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//* 131  234:astore          9
	//* 132  236:aload           9
	//* 133  238:arraylength     
	//* 134  239:istore          5
	//* 135  241:iconst_0        
	//* 136  242:istore          7
	//* 137  244:aload           9
	//* 138  246:iload           7
	//* 139  248:iload           6
	//* 140  250:bipush          63
	//* 141  252:iand            
	//* 142  253:sipush          128
	//* 143  256:ior             
	//* 144  257:int2byte        
	//* 145  258:bastore         
	//* 146  259:iload           7
	//* 147  261:iconst_1        
	//* 148  262:iadd            
	//* 149  263:istore          6
	//* 150  265:iload_2         
	//* 151  266:istore_3        
	//* 152  267:iload           5
	//* 153  269:istore          4
	//* 154  271:iload           6
	//* 155  273:istore_2        
	//* 156  274:goto            53
	//* 157  277:iload           5
	//* 158  279:ldc1            #11  <Int 55296>
	//* 159  281:icmplt          291
	//* 160  284:iload           5
	//* 161  286:ldc1            #17  <Int 57343>
	//* 162  288:icmple          380
	//* 163  291:iload           4
	//* 164  293:iconst_1        
	//* 165  294:iadd            
	//* 166  295:istore          7
	//* 167  297:aload           9
	//* 168  299:iload           4
	//* 169  301:iload           5
	//* 170  303:bipush          12
	//* 171  305:ishr            
	//* 172  306:sipush          224
	//* 173  309:ior             
	//* 174  310:int2byte        
	//* 175  311:bastore         
	//* 176  312:iload_2         
	//* 177  313:istore          4
	//* 178  315:iload           7
	//* 179  317:istore          6
	//* 180  319:iload           7
	//* 181  321:iload_2         
	//* 182  322:icmplt          340
	//* 183  325:aload           10
	//* 184  327:invokevirtual   #144 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//* 185  330:astore          9
	//* 186  332:aload           9
	//* 187  334:arraylength     
	//* 188  335:istore          4
	//* 189  337:iconst_0        
	//* 190  338:istore          6
	//* 191  340:aload           9
	//* 192  342:iload           6
	//* 193  344:iload           5
	//* 194  346:bipush          6
	//* 195  348:ishr            
	//* 196  349:bipush          63
	//* 197  351:iand            
	//* 198  352:sipush          128
	//* 199  355:ior             
	//* 200  356:int2byte        
	//* 201  357:bastore         
	//* 202  358:iload           6
	//* 203  360:iconst_1        
	//* 204  361:iadd            
	//* 205  362:istore          7
	//* 206  364:iload_3         
	//* 207  365:istore_2        
	//* 208  366:iload           5
	//* 209  368:istore          6
	//* 210  370:iload           4
	//* 211  372:istore_3        
	//* 212  373:iload           7
	//* 213  375:istore          4
	//* 214  377:goto            216
	//* 215  380:iload           5
	//* 216  382:ldc1            #13  <Int 56319>
	//* 217  384:icmple          392
	//* 218  387:iload           5
	//* 219  389:invokestatic    #150 <Method void _illegal(int)>
	//* 220  392:iload_3         
	//* 221  393:iload           8
	//* 222  395:icmplt          403
	//* 223  398:iload           5
	//* 224  400:invokestatic    #150 <Method void _illegal(int)>
	//* 225  403:iload_3         
	//* 226  404:iconst_1        
	//* 227  405:iadd            
	//* 228  406:istore          7
	//* 229  408:iload           5
	//* 230  410:aload_1         
	//* 231  411:iload_3         
	//* 232  412:invokevirtual   #141 <Method char String.charAt(int)>
	//* 233  415:invokestatic    #152 <Method int _convert(int, int)>
	//* 234  418:istore          6
	//* 235  420:iload           6
	//* 236  422:ldc1            #153 <Int 0x10ffff>
	//* 237  424:icmple          432
	//* 238  427:iload           6
	//* 239  429:invokestatic    #150 <Method void _illegal(int)>
	//* 240  432:iload           4
	//* 241  434:iconst_1        
	//* 242  435:iadd            
	//* 243  436:istore          5
	//* 244  438:aload           9
	//* 245  440:iload           4
	//* 246  442:iload           6
	//* 247  444:bipush          18
	//* 248  446:ishr            
	//* 249  447:sipush          240
	//* 250  450:ior             
	//* 251  451:int2byte        
	//* 252  452:bastore         
	//* 253  453:iload_2         
	//* 254  454:istore_3        
	//* 255  455:iload           5
	//* 256  457:istore          4
	//* 257  459:iload           5
	//* 258  461:iload_2         
	//* 259  462:icmplt          479
	//* 260  465:aload           10
	//* 261  467:invokevirtual   #144 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//* 262  470:astore          9
	//* 263  472:aload           9
	//* 264  474:arraylength     
	//* 265  475:istore_3        
	//* 266  476:iconst_0        
	//* 267  477:istore          4
	//* 268  479:iload           4
	//* 269  481:iconst_1        
	//* 270  482:iadd            
	//* 271  483:istore_2        
	//* 272  484:aload           9
	//* 273  486:iload           4
	//* 274  488:iload           6
	//* 275  490:bipush          12
	//* 276  492:ishr            
	//* 277  493:bipush          63
	//* 278  495:iand            
	//* 279  496:sipush          128
	//* 280  499:ior             
	//* 281  500:int2byte        
	//* 282  501:bastore         
	//* 283  502:iload_2         
	//* 284  503:iload_3         
	//* 285  504:icmplt          548
	//* 286  507:aload           10
	//* 287  509:invokevirtual   #144 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//* 288  512:astore          9
	//* 289  514:aload           9
	//* 290  516:arraylength     
	//* 291  517:istore_3        
	//* 292  518:iconst_0        
	//* 293  519:istore_2        
	//* 294  520:aload           9
	//* 295  522:iload_2         
	//* 296  523:iload           6
	//* 297  525:bipush          6
	//* 298  527:ishr            
	//* 299  528:bipush          63
	//* 300  530:iand            
	//* 301  531:sipush          128
	//* 302  534:ior             
	//* 303  535:int2byte        
	//* 304  536:bastore         
	//* 305  537:iload_2         
	//* 306  538:iconst_1        
	//* 307  539:iadd            
	//* 308  540:istore          4
	//* 309  542:iload           7
	//* 310  544:istore_2        
	//* 311  545:goto            216
	//* 312  548:goto            520
		{
			int k1 = i;
	//  313  551:iload_2         
	//  314  552:istore          6
			i = k;
	//  315  554:iload           4
	//  316  556:istore_2        
			k = k1;
	//  317  557:iload           6
	//  318  559:istore          4
		}
		if(l >= 2048)
			break; /* Loop/switch isn't completed */
		i2 = k + 1;
		abyte0[k] = (byte)(l >> 6 | 0xc0);
		j1 = j;
		k = i2;
		j = i;
		i = j1;
		j1 = l;
		l = j;
		i2 = k;
		if(k >= j)
		{
			abyte0 = bytearraybuilder1.finishCurrentSegment();
			l = abyte0.length;
			i2 = 0;
		}
		abyte0[i2] = (byte)(j1 & 0x3f | 0x80);
		j1 = i2 + 1;
		j = i;
		k = l;
		i = j1;
		if(true) goto _L7; else goto _L6
_L6:
		if(l < 55296 || l > 57343)
		{
			i2 = k + 1;
			abyte0[k] = (byte)(l >> 12 | 0xe0);
			k = i;
			j1 = i2;
			if(i2 >= i)
			{
				abyte0 = bytearraybuilder1.finishCurrentSegment();
				k = abyte0.length;
				j1 = 0;
			}
			abyte0[j1] = (byte)(l >> 6 & 0x3f | 0x80);
			i2 = j1 + 1;
			i = j;
			j1 = l;
			j = k;
			k = i2;
		} else
		{
			if(l > 56319)
				_illegal(l);
			if(j >= j2)
				_illegal(l);
			i2 = j + 1;
			j1 = _convert(l, ((int) (s.charAt(j))));
			if(j1 > 0x10ffff)
				_illegal(j1);
			l = k + 1;
			abyte0[k] = (byte)(j1 >> 18 | 0xf0);
			j = i;
			k = l;
			if(l >= i)
			{
				abyte0 = bytearraybuilder1.finishCurrentSegment();
				j = abyte0.length;
				k = 0;
			}
			i = k + 1;
			abyte0[k] = (byte)(j1 >> 12 & 0x3f | 0x80);
			if(i >= j)
			{
				abyte0 = bytearraybuilder1.finishCurrentSegment();
				j = abyte0.length;
				i = 0;
			}
			abyte0[i] = (byte)(j1 >> 6 & 0x3f | 0x80);
			k = i + 1;
			i = i2;
		}
		break MISSING_BLOCK_LABEL_216;
		if(true) goto _L7; else goto _L8
_L8:
	//* 319  561:goto            171
	//* 320  564:goto            124
	}

	public char[] quoteAsString(String s)
	{
		int i;
		int j;
		int l;
		int i1;
		char ac[];
		TextBuffer textbuffer1;
		int ai[];
		TextBuffer textbuffer = _text;
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field TextBuffer _text>
	//    2    4:astore          9
		textbuffer1 = textbuffer;
	//    3    6:aload           9
	//    4    8:astore          10
		if(textbuffer == null)
	//*   5   10:aload           9
	//*   6   12:ifnonnull       31
		{
			textbuffer1 = new TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler) (null)));
	//    7   15:new             #159 <Class TextBuffer>
	//    8   18:dup             
	//    9   19:aconst_null     
	//   10   20:invokespecial   #160 <Method void TextBuffer(com.fasterxml.jackson.core.util.BufferRecycler)>
	//   11   23:astore          10
			_text = textbuffer1;
	//   12   25:aload_0         
	//   13   26:aload           10
	//   14   28:putfield        #157 <Field TextBuffer _text>
		}
		ac = textbuffer1.emptyAndGetCurrentSegment();
	//   15   31:aload           10
	//   16   33:invokevirtual   #163 <Method char[] TextBuffer.emptyAndGetCurrentSegment()>
	//   17   36:astore          9
		ai = CharTypes.get7BitOutputEscapes();
	//   18   38:invokestatic    #167 <Method int[] CharTypes.get7BitOutputEscapes()>
	//   19   41:astore          12
		l = ai.length;
	//   20   43:aload           12
	//   21   45:arraylength     
	//   22   46:istore          6
		j = 0;
	//   23   48:iconst_0        
	//   24   49:istore          4
		i1 = s.length();
	//   25   51:aload_1         
	//   26   52:invokevirtual   #134 <Method int String.length()>
	//   27   55:istore          7
		i = 0;
	//   28   57:iconst_0        
	//   29   58:istore_3        
_L3:
		int k = i;
	//   30   59:iload_3         
	//   31   60:istore          5
		if(j >= i1) goto _L2; else goto _L1
	//   32   62:iload           4
	//   33   64:iload           7
	//   34   66:icmpge          242
_L1:
label0:
		{
			char c = s.charAt(j);
	//   35   69:aload_1         
	//   36   70:iload           4
	//   37   72:invokevirtual   #141 <Method char String.charAt(int)>
	//   38   75:istore_2        
			if(c >= l || ai[c] == 0)
				break label0;
	//   39   76:iload_2         
	//   40   77:iload           6
	//   41   79:icmpge          191
	//   42   82:aload           12
	//   43   84:iload_2         
	//   44   85:iaload          
	//   45   86:ifeq            191
			k = ((int) (s.charAt(j)));
	//   46   89:aload_1         
	//   47   90:iload           4
	//   48   92:invokevirtual   #141 <Method char String.charAt(int)>
	//   49   95:istore          5
			int j1 = ai[k];
	//   50   97:aload           12
	//   51   99:iload           5
	//   52  101:iaload          
	//   53  102:istore          8
			char ac1[];
			if(j1 < 0)
	//*  54  104:iload           8
	//*  55  106:ifge            262
				k = _appendNumeric(k, _qbuf);
	//   56  109:aload_0         
	//   57  110:iload           5
	//   58  112:aload_0         
	//   59  113:getfield        #52  <Field char[] _qbuf>
	//   60  116:invokespecial   #169 <Method int _appendNumeric(int, char[])>
	//   61  119:istore          5
			else
	//*  62  121:iload_3         
	//*  63  122:iload           5
	//*  64  124:iadd            
	//*  65  125:aload           9
	//*  66  127:arraylength     
	//*  67  128:icmple          277
	//*  68  131:aload           9
	//*  69  133:arraylength     
	//*  70  134:iload_3         
	//*  71  135:isub            
	//*  72  136:istore          8
	//*  73  138:iload           8
	//*  74  140:ifle            156
	//*  75  143:aload_0         
	//*  76  144:getfield        #52  <Field char[] _qbuf>
	//*  77  147:iconst_0        
	//*  78  148:aload           9
	//*  79  150:iload_3         
	//*  80  151:iload           8
	//*  81  153:invokestatic    #175 <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  82  156:aload           10
	//*  83  158:invokevirtual   #177 <Method char[] TextBuffer.finishCurrentSegment()>
	//*  84  161:astore          9
	//*  85  163:iload           5
	//*  86  165:iload           8
	//*  87  167:isub            
	//*  88  168:istore_3        
	//*  89  169:aload_0         
	//*  90  170:getfield        #52  <Field char[] _qbuf>
	//*  91  173:iload           8
	//*  92  175:aload           9
	//*  93  177:iconst_0        
	//*  94  178:iload_3         
	//*  95  179:invokestatic    #175 <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  96  182:iload           4
	//*  97  184:iconst_1        
	//*  98  185:iadd            
	//*  99  186:istore          4
	//* 100  188:goto            59
	//* 101  191:iload_3         
	//* 102  192:istore          5
	//* 103  194:aload           9
	//* 104  196:astore          11
	//* 105  198:iload_3         
	//* 106  199:aload           9
	//* 107  201:arraylength     
	//* 108  202:icmplt          215
	//* 109  205:aload           10
	//* 110  207:invokevirtual   #177 <Method char[] TextBuffer.finishCurrentSegment()>
	//* 111  210:astore          11
	//* 112  212:iconst_0        
	//* 113  213:istore          5
	//* 114  215:iload           5
	//* 115  217:iconst_1        
	//* 116  218:iadd            
	//* 117  219:istore_3        
	//* 118  220:aload           11
	//* 119  222:iload           5
	//* 120  224:iload_2         
	//* 121  225:castore         
	//* 122  226:iload           4
	//* 123  228:iconst_1        
	//* 124  229:iadd            
	//* 125  230:istore          4
	//* 126  232:iload           4
	//* 127  234:iload           7
	//* 128  236:icmplt          255
	//* 129  239:iload_3         
	//* 130  240:istore          5
	//* 131  242:aload           10
	//* 132  244:iload           5
	//* 133  246:invokevirtual   #180 <Method void TextBuffer.setCurrentLength(int)>
	//* 134  249:aload           10
	//* 135  251:invokevirtual   #183 <Method char[] TextBuffer.contentsAsArray()>
	//* 136  254:areturn         
	//* 137  255:aload           11
	//* 138  257:astore          9
	//* 139  259:goto            69
				k = _appendNamed(j1, _qbuf);
	//  140  262:aload_0         
	//  141  263:iload           8
	//  142  265:aload_0         
	//  143  266:getfield        #52  <Field char[] _qbuf>
	//  144  269:invokespecial   #185 <Method int _appendNamed(int, char[])>
	//  145  272:istore          5
			if(i + k > ac.length)
			{
				j1 = ac.length - i;
				if(j1 > 0)
					System.arraycopy(((Object) (_qbuf)), 0, ((Object) (ac)), i, j1);
				ac = textbuffer1.finishCurrentSegment();
				i = k - j1;
				System.arraycopy(((Object) (_qbuf)), j1, ((Object) (ac)), 0, i);
			} else
	//* 146  274:goto            121
			{
				System.arraycopy(((Object) (_qbuf)), 0, ((Object) (ac)), i, k);
	//  147  277:aload_0         
	//  148  278:getfield        #52  <Field char[] _qbuf>
	//  149  281:iconst_0        
	//  150  282:aload           9
	//  151  284:iload_3         
	//  152  285:iload           5
	//  153  287:invokestatic    #175 <Method void System.arraycopy(Object, int, Object, int, int)>
				i += k;
	//  154  290:iload_3         
	//  155  291:iload           5
	//  156  293:iadd            
	//  157  294:istore_3        
			}
			j++;
		}
		if(true) goto _L3; else goto _L2
	//  158  295:goto            182
		k = i;
		ac1 = ac;
		if(i >= ac.length)
		{
			ac1 = textbuffer1.finishCurrentSegment();
			k = 0;
		}
		i = k + 1;
		ac1[k] = c;
		j++;
		if(j < i1)
			break MISSING_BLOCK_LABEL_255;
		k = i;
_L2:
		textbuffer1.setCurrentLength(k);
		return textbuffer1.contentsAsArray();
		ac = ac1;
		  goto _L1
	}

	public byte[] quoteAsUTF8(String s)
	{
		int i;
		int j;
		int i1;
		byte abyte0[];
		ByteArrayBuilder bytearraybuilder1;
		ByteArrayBuilder bytearraybuilder = _bytes;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field ByteArrayBuilder _bytes>
	//    2    4:astore          7
		bytearraybuilder1 = bytearraybuilder;
	//    3    6:aload           7
	//    4    8:astore          9
		if(bytearraybuilder == null)
	//*   5   10:aload           7
	//*   6   12:ifnonnull       31
		{
			bytearraybuilder1 = new ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler) (null)));
	//    7   15:new             #56  <Class ByteArrayBuilder>
	//    8   18:dup             
	//    9   19:aconst_null     
	//   10   20:invokespecial   #129 <Method void ByteArrayBuilder(com.fasterxml.jackson.core.util.BufferRecycler)>
	//   11   23:astore          9
			_bytes = bytearraybuilder1;
	//   12   25:aload_0         
	//   13   26:aload           9
	//   14   28:putfield        #126 <Field ByteArrayBuilder _bytes>
		}
		j = 0;
	//   15   31:iconst_0        
	//   16   32:istore_3        
		i1 = s.length();
	//   17   33:aload_1         
	//   18   34:invokevirtual   #134 <Method int String.length()>
	//   19   37:istore          6
		i = 0;
	//   20   39:iconst_0        
	//   21   40:istore_2        
		abyte0 = bytearraybuilder1.resetAndGetFirstSegment();
	//   22   41:aload           9
	//   23   43:invokevirtual   #137 <Method byte[] ByteArrayBuilder.resetAndGetFirstSegment()>
	//   24   46:astore          7
_L8:
		int k = i;
	//   25   48:iload_2         
	//   26   49:istore          4
		if(j >= i1) goto _L2; else goto _L1
	//   27   51:iload_3         
	//   28   52:iload           6
	//   29   54:icmpge          212
_L1:
		byte abyte1[];
		int ai[];
		ai = CharTypes.get7BitOutputEscapes();
	//   30   57:invokestatic    #167 <Method int[] CharTypes.get7BitOutputEscapes()>
	//   31   60:astore          10
		abyte1 = abyte0;
	//   32   62:aload           7
	//   33   64:astore          8
_L6:
		int l;
		l = ((int) (s.charAt(j)));
	//   34   66:aload_1         
	//   35   67:iload_3         
	//   36   68:invokevirtual   #141 <Method char String.charAt(int)>
	//   37   71:istore          5
		if(l > 127 || ai[l] != 0)
	//*  38   73:iload           5
	//*  39   75:bipush          127
	//*  40   77:icmpgt          88
	//*  41   80:aload           10
	//*  42   82:iload           5
	//*  43   84:iaload          
	//*  44   85:ifeq            162
		{
			abyte0 = abyte1;
	//   45   88:aload           8
	//   46   90:astore          7
			k = i;
	//   47   92:iload_2         
	//   48   93:istore          4
			if(i >= abyte1.length)
	//*  49   95:iload_2         
	//*  50   96:aload           8
	//*  51   98:arraylength     
	//*  52   99:icmplt          112
			{
				abyte0 = bytearraybuilder1.finishCurrentSegment();
	//   53  102:aload           9
	//   54  104:invokevirtual   #144 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//   55  107:astore          7
				k = 0;
	//   56  109:iconst_0        
	//   57  110:istore          4
			}
			i = j + 1;
	//   58  112:iload_3         
	//   59  113:iconst_1        
	//   60  114:iadd            
	//   61  115:istore_2        
			l = ((int) (s.charAt(j)));
	//   62  116:aload_1         
	//   63  117:iload_3         
	//   64  118:invokevirtual   #141 <Method char String.charAt(int)>
	//   65  121:istore          5
			if(l > 127)
				break; /* Loop/switch isn't completed */
	//   66  123:iload           5
	//   67  125:bipush          127
	//   68  127:icmpgt          229
			k = _appendByte(l, ai[l], bytearraybuilder1, k);
	//   69  130:aload_0         
	//   70  131:iload           5
	//   71  133:aload           10
	//   72  135:iload           5
	//   73  137:iaload          
	//   74  138:aload           9
	//   75  140:iload           4
	//   76  142:invokespecial   #188 <Method int _appendByte(int, int, ByteArrayBuilder, int)>
	//   77  145:istore          4
			abyte0 = bytearraybuilder1.getCurrentSegment();
	//   78  147:aload           9
	//   79  149:invokevirtual   #191 <Method byte[] ByteArrayBuilder.getCurrentSegment()>
	//   80  152:astore          7
			j = i;
	//   81  154:iload_2         
	//   82  155:istore_3        
			i = k;
	//   83  156:iload           4
	//   84  158:istore_2        
			continue; /* Loop/switch isn't completed */
	//   85  159:goto            48
		}
		abyte0 = abyte1;
	//   86  162:aload           8
	//   87  164:astore          7
		k = i;
	//   88  166:iload_2         
	//   89  167:istore          4
		if(i >= abyte1.length)
	//*  90  169:iload_2         
	//*  91  170:aload           8
	//*  92  172:arraylength     
	//*  93  173:icmplt          186
		{
			abyte0 = bytearraybuilder1.finishCurrentSegment();
	//   94  176:aload           9
	//   95  178:invokevirtual   #144 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//   96  181:astore          7
			k = 0;
	//   97  183:iconst_0        
	//   98  184:istore          4
		}
		i = k + 1;
	//   99  186:iload           4
	//  100  188:iconst_1        
	//  101  189:iadd            
	//  102  190:istore_2        
		abyte0[k] = (byte)l;
	//  103  191:aload           7
	//  104  193:iload           4
	//  105  195:iload           5
	//  106  197:int2byte        
	//  107  198:bastore         
		j++;
	//  108  199:iload_3         
	//  109  200:iconst_1        
	//  110  201:iadd            
	//  111  202:istore_3        
		if(j < i1) goto _L4; else goto _L3
	//  112  203:iload_3         
	//  113  204:iload           6
	//  114  206:icmplt          222
_L3:
		k = i;
	//  115  209:iload_2         
	//  116  210:istore          4
_L2:
		return _bytes.completeAndCoalesce(k);
	//  117  212:aload_0         
	//  118  213:getfield        #126 <Field ByteArrayBuilder _bytes>
	//  119  216:iload           4
	//  120  218:invokevirtual   #148 <Method byte[] ByteArrayBuilder.completeAndCoalesce(int)>
	//  121  221:areturn         
_L4:
		abyte1 = abyte0;
	//  122  222:aload           7
	//  123  224:astore          8
		if(true) goto _L6; else goto _L5
	//  124  226:goto            66
_L5:
		if(l > 2047)
			break; /* Loop/switch isn't completed */
	//  125  229:iload           5
	//  126  231:sipush          2047
	//  127  234:icmpgt          322
		abyte0[k] = (byte)(l >> 6 | 0xc0);
	//  128  237:aload           7
	//  129  239:iload           4
	//  130  241:iload           5
	//  131  243:bipush          6
	//  132  245:ishr            
	//  133  246:sipush          192
	//  134  249:ior             
	//  135  250:int2byte        
	//  136  251:bastore         
		l = l & 0x3f | 0x80;
	//  137  252:iload           5
	//  138  254:bipush          63
	//  139  256:iand            
	//  140  257:sipush          128
	//  141  260:ior             
	//  142  261:istore          5
		j = k + 1;
	//  143  263:iload           4
	//  144  265:iconst_1        
	//  145  266:iadd            
	//  146  267:istore_3        
		k = l;
	//  147  268:iload           5
	//  148  270:istore          4
_L9:
		byte abyte2[] = abyte0;
	//  149  272:aload           7
	//  150  274:astore          8
		l = j;
	//  151  276:iload_3         
	//  152  277:istore          5
		if(j >= abyte0.length)
	//* 153  279:iload_3         
	//* 154  280:aload           7
	//* 155  282:arraylength     
	//* 156  283:icmplt          296
		{
			abyte2 = bytearraybuilder1.finishCurrentSegment();
	//  157  286:aload           9
	//  158  288:invokevirtual   #144 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//  159  291:astore          8
			l = 0;
	//  160  293:iconst_0        
	//  161  294:istore          5
		}
		abyte2[l] = (byte)k;
	//  162  296:aload           8
	//  163  298:iload           5
	//  164  300:iload           4
	//  165  302:int2byte        
	//  166  303:bastore         
		k = l + 1;
	//  167  304:iload           5
	//  168  306:iconst_1        
	//  169  307:iadd            
	//  170  308:istore          4
		j = i;
	//  171  310:iload_2         
	//  172  311:istore_3        
		abyte0 = abyte2;
	//  173  312:aload           8
	//  174  314:astore          7
		i = k;
	//  175  316:iload           4
	//  176  318:istore_2        
		if(true) goto _L8; else goto _L7
	//  177  319:goto            48
_L7:
		if(l < 55296 || l > 57343)
	//* 178  322:iload           5
	//* 179  324:ldc1            #11  <Int 55296>
	//* 180  326:icmplt          336
	//* 181  329:iload           5
	//* 182  331:ldc1            #17  <Int 57343>
	//* 183  333:icmple          407
		{
			j = k + 1;
	//  184  336:iload           4
	//  185  338:iconst_1        
	//  186  339:iadd            
	//  187  340:istore_3        
			abyte0[k] = (byte)(l >> 12 | 0xe0);
	//  188  341:aload           7
	//  189  343:iload           4
	//  190  345:iload           5
	//  191  347:bipush          12
	//  192  349:ishr            
	//  193  350:sipush          224
	//  194  353:ior             
	//  195  354:int2byte        
	//  196  355:bastore         
			if(j >= abyte0.length)
	//* 197  356:iload_3         
	//* 198  357:aload           7
	//* 199  359:arraylength     
	//* 200  360:icmplt          583
			{
				abyte0 = bytearraybuilder1.finishCurrentSegment();
	//  201  363:aload           9
	//  202  365:invokevirtual   #144 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//  203  368:astore          7
				j = 0;
	//  204  370:iconst_0        
	//  205  371:istore_3        
			}
			abyte0[j] = (byte)(l >> 6 & 0x3f | 0x80);
	//  206  372:aload           7
	//  207  374:iload_3         
	//  208  375:iload           5
	//  209  377:bipush          6
	//  210  379:ishr            
	//  211  380:bipush          63
	//  212  382:iand            
	//  213  383:sipush          128
	//  214  386:ior             
	//  215  387:int2byte        
	//  216  388:bastore         
			k = l & 0x3f | 0x80;
	//  217  389:iload           5
	//  218  391:bipush          63
	//  219  393:iand            
	//  220  394:sipush          128
	//  221  397:ior             
	//  222  398:istore          4
			j++;
	//  223  400:iload_3         
	//  224  401:iconst_1        
	//  225  402:iadd            
	//  226  403:istore_3        
		} else
	//* 227  404:goto            272
		{
			if(l > 56319)
	//* 228  407:iload           5
	//* 229  409:ldc1            #13  <Int 56319>
	//* 230  411:icmple          419
				_illegal(l);
	//  231  414:iload           5
	//  232  416:invokestatic    #150 <Method void _illegal(int)>
			if(i >= i1)
	//* 233  419:iload_2         
	//* 234  420:iload           6
	//* 235  422:icmplt          430
				_illegal(l);
	//  236  425:iload           5
	//  237  427:invokestatic    #150 <Method void _illegal(int)>
			j = i + 1;
	//  238  430:iload_2         
	//  239  431:iconst_1        
	//  240  432:iadd            
	//  241  433:istore_3        
			l = _convert(l, ((int) (s.charAt(i))));
	//  242  434:iload           5
	//  243  436:aload_1         
	//  244  437:iload_2         
	//  245  438:invokevirtual   #141 <Method char String.charAt(int)>
	//  246  441:invokestatic    #152 <Method int _convert(int, int)>
	//  247  444:istore          5
			if(l > 0x10ffff)
	//* 248  446:iload           5
	//* 249  448:ldc1            #153 <Int 0x10ffff>
	//* 250  450:icmple          458
				_illegal(l);
	//  251  453:iload           5
	//  252  455:invokestatic    #150 <Method void _illegal(int)>
			i = k + 1;
	//  253  458:iload           4
	//  254  460:iconst_1        
	//  255  461:iadd            
	//  256  462:istore_2        
			abyte0[k] = (byte)(l >> 18 | 0xf0);
	//  257  463:aload           7
	//  258  465:iload           4
	//  259  467:iload           5
	//  260  469:bipush          18
	//  261  471:ishr            
	//  262  472:sipush          240
	//  263  475:ior             
	//  264  476:int2byte        
	//  265  477:bastore         
			if(i >= abyte0.length)
	//* 266  478:iload_2         
	//* 267  479:aload           7
	//* 268  481:arraylength     
	//* 269  482:icmplt          580
			{
				abyte0 = bytearraybuilder1.finishCurrentSegment();
	//  270  485:aload           9
	//  271  487:invokevirtual   #144 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//  272  490:astore          7
				i = 0;
	//  273  492:iconst_0        
	//  274  493:istore_2        
			}
			k = i + 1;
	//  275  494:iload_2         
	//  276  495:iconst_1        
	//  277  496:iadd            
	//  278  497:istore          4
			abyte0[i] = (byte)(l >> 12 & 0x3f | 0x80);
	//  279  499:aload           7
	//  280  501:iload_2         
	//  281  502:iload           5
	//  282  504:bipush          12
	//  283  506:ishr            
	//  284  507:bipush          63
	//  285  509:iand            
	//  286  510:sipush          128
	//  287  513:ior             
	//  288  514:int2byte        
	//  289  515:bastore         
			if(k >= abyte0.length)
	//* 290  516:iload           4
	//* 291  518:aload           7
	//* 292  520:arraylength     
	//* 293  521:icmplt          574
			{
				abyte0 = bytearraybuilder1.finishCurrentSegment();
	//  294  524:aload           9
	//  295  526:invokevirtual   #144 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//  296  529:astore          7
				i = 0;
	//  297  531:iconst_0        
	//  298  532:istore_2        
			} else
	//* 299  533:aload           7
	//* 300  535:iload_2         
	//* 301  536:iload           5
	//* 302  538:bipush          6
	//* 303  540:ishr            
	//* 304  541:bipush          63
	//* 305  543:iand            
	//* 306  544:sipush          128
	//* 307  547:ior             
	//* 308  548:int2byte        
	//* 309  549:bastore         
	//* 310  550:iload           5
	//* 311  552:bipush          63
	//* 312  554:iand            
	//* 313  555:sipush          128
	//* 314  558:ior             
	//* 315  559:istore          4
	//* 316  561:iload_2         
	//* 317  562:iconst_1        
	//* 318  563:iadd            
	//* 319  564:istore          5
	//* 320  566:iload_3         
	//* 321  567:istore_2        
	//* 322  568:iload           5
	//* 323  570:istore_3        
	//* 324  571:goto            272
			{
				i = k;
	//  325  574:iload           4
	//  326  576:istore_2        
			}
			abyte0[i] = (byte)(l >> 6 & 0x3f | 0x80);
			k = l & 0x3f | 0x80;
			l = i + 1;
			i = j;
			j = l;
		}
		  goto _L9
		if(true) goto _L8; else goto _L10
_L10:
	//* 327  577:goto            533
	//* 328  580:goto            494
	//* 329  583:goto            372
	}

	private static final byte HB[] = CharTypes.copyHexBytes();
	private static final char HC[] = CharTypes.copyHexChars();
	private static final int SURR1_FIRST = 55296;
	private static final int SURR1_LAST = 56319;
	private static final int SURR2_FIRST = 56320;
	private static final int SURR2_LAST = 57343;
	protected static final ThreadLocal _threadEncoder = new ThreadLocal();
	protected ByteArrayBuilder _bytes;
	protected final char _qbuf[] = new char[6];
	protected TextBuffer _text;

	static 
	{
	//    0    0:invokestatic    #33  <Method char[] CharTypes.copyHexChars()>
	//    1    3:putstatic       #35  <Field char[] HC>
	//    2    6:invokestatic    #39  <Method byte[] CharTypes.copyHexBytes()>
	//    3    9:putstatic       #41  <Field byte[] HB>
	//    4   12:new             #43  <Class ThreadLocal>
	//    5   15:dup             
	//    6   16:invokespecial   #46  <Method void ThreadLocal()>
	//    7   19:putstatic       #48  <Field ThreadLocal _threadEncoder>
	//*   8   22:return          
	}
}
