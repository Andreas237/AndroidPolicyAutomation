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
	//*   7   13:ifge            104
		{
			bytearraybuilder.append(117);
	//    8   16:aload_3         
	//    9   17:bipush          117
	//   10   19:invokevirtual   #63  <Method void ByteArrayBuilder.append(int)>
			if(i > 255)
	//*  11   22:iload_1         
	//*  12   23:sipush          255
	//*  13   26:icmple          66
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
	//*  36   63:goto            78
			{
				bytearraybuilder.append(48);
	//   37   66:aload_3         
	//   38   67:bipush          48
	//   39   69:invokevirtual   #63  <Method void ByteArrayBuilder.append(int)>
				bytearraybuilder.append(48);
	//   40   72:aload_3         
	//   41   73:bipush          48
	//   42   75:invokevirtual   #63  <Method void ByteArrayBuilder.append(int)>
			}
			bytearraybuilder.append(((int) (HB[i >> 4])));
	//   43   78:aload_3         
	//   44   79:getstatic       #41  <Field byte[] HB>
	//   45   82:iload_1         
	//   46   83:iconst_4        
	//   47   84:ishr            
	//   48   85:baload          
	//   49   86:invokevirtual   #63  <Method void ByteArrayBuilder.append(int)>
			bytearraybuilder.append(((int) (HB[i & 0xf])));
	//   50   89:aload_3         
	//   51   90:getstatic       #41  <Field byte[] HB>
	//   52   93:iload_1         
	//   53   94:bipush          15
	//   54   96:iand            
	//   55   97:baload          
	//   56   98:invokevirtual   #63  <Method void ByteArrayBuilder.append(int)>
		} else
	//*  57  101:goto            110
		{
			bytearraybuilder.append(((int) ((byte)j)));
	//   58  104:aload_3         
	//   59  105:iload_2         
	//   60  106:int2byte        
	//   61  107:invokevirtual   #63  <Method void ByteArrayBuilder.append(int)>
		}
		return bytearraybuilder.getCurrentSegmentLength();
	//   62  110:aload_3         
	//   63  111:invokevirtual   #67  <Method int ByteArrayBuilder.getCurrentSegmentLength()>
	//   64  114:ireturn         
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
		if(j >= 56320 && j <= 57343)
	//*   0    0:iload_1         
	//*   1    1:ldc1            #15  <Int 56320>
	//*   2    3:icmplt          31
	//*   3    6:iload_1         
	//*   4    7:ldc1            #17  <Int 57343>
	//*   5    9:icmple          15
	//*   6   12:goto            31
		{
			return 0x10000 + (i - 55296 << 10) + (j - 56320);
	//    7   15:ldc1            #73  <Int 0x10000>
	//    8   17:iload_0         
	//    9   18:ldc1            #11  <Int 55296>
	//   10   20:isub            
	//   11   21:bipush          10
	//   12   23:ishl            
	//   13   24:iadd            
	//   14   25:iload_1         
	//   15   26:ldc1            #15  <Int 56320>
	//   16   28:isub            
	//   17   29:iadd            
	//   18   30:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   19   31:new             #75  <Class StringBuilder>
	//   20   34:dup             
	//   21   35:invokespecial   #76  <Method void StringBuilder()>
	//   22   38:astore_2        
			stringbuilder.append("Broken surrogate pair: first char 0x");
	//   23   39:aload_2         
	//   24   40:ldc1            #78  <String "Broken surrogate pair: first char 0x">
	//   25   42:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   26   45:pop             
			stringbuilder.append(Integer.toHexString(i));
	//   27   46:aload_2         
	//   28   47:iload_0         
	//   29   48:invokestatic    #87  <Method String Integer.toHexString(int)>
	//   30   51:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   31   54:pop             
			stringbuilder.append(", second 0x");
	//   32   55:aload_2         
	//   33   56:ldc1            #89  <String ", second 0x">
	//   34   58:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   35   61:pop             
			stringbuilder.append(Integer.toHexString(j));
	//   36   62:aload_2         
	//   37   63:iload_1         
	//   38   64:invokestatic    #87  <Method String Integer.toHexString(int)>
	//   39   67:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   40   70:pop             
			stringbuilder.append("; illegal combination");
	//   41   71:aload_2         
	//   42   72:ldc1            #91  <String "; illegal combination">
	//   43   74:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   44   77:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   45   78:new             #93  <Class IllegalArgumentException>
	//   46   81:dup             
	//   47   82:aload_2         
	//   48   83:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   49   86:invokespecial   #100 <Method void IllegalArgumentException(String)>
	//   50   89:athrow          
		}
	}

	private static void _illegal(int i)
	{
		throw new IllegalArgumentException(UTF8Writer.illegalSurrogateDesc(i));
	//    0    0:new             #93  <Class IllegalArgumentException>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:invokestatic    #106 <Method String UTF8Writer.illegalSurrogateDesc(int)>
	//    4    8:invokespecial   #100 <Method void IllegalArgumentException(String)>
	//    5   11:athrow          
	}

	public static JsonStringEncoder getInstance()
	{
		Object obj = ((Object) ((SoftReference)_threadEncoder.get()));
	//    0    0:getstatic       #48  <Field ThreadLocal _threadEncoder>
	//    1    3:invokevirtual   #112 <Method Object ThreadLocal.get()>
	//    2    6:checkcast       #114 <Class SoftReference>
	//    3    9:astore_0        
		if(obj == null)
	//*   4   10:aload_0         
	//*   5   11:ifnonnull       19
			obj = null;
	//    6   14:aconst_null     
	//    7   15:astore_0        
		else
	//*   8   16:goto            27
			obj = ((Object) ((JsonStringEncoder)((SoftReference) (obj)).get()));
	//    9   19:aload_0         
	//   10   20:invokevirtual   #115 <Method Object SoftReference.get()>
	//   11   23:checkcast       #2   <Class JsonStringEncoder>
	//   12   26:astore_0        
		Object obj1 = obj;
	//   13   27:aload_0         
	//   14   28:astore_1        
		if(obj == null)
	//*  15   29:aload_0         
	//*  16   30:ifnonnull       55
		{
			obj1 = ((Object) (new JsonStringEncoder()));
	//   17   33:new             #2   <Class JsonStringEncoder>
	//   18   36:dup             
	//   19   37:invokespecial   #116 <Method void JsonStringEncoder()>
	//   20   40:astore_1        
			_threadEncoder.set(((Object) (new SoftReference(obj1))));
	//   21   41:getstatic       #48  <Field ThreadLocal _threadEncoder>
	//   22   44:new             #114 <Class SoftReference>
	//   23   47:dup             
	//   24   48:aload_1         
	//   25   49:invokespecial   #119 <Method void SoftReference(Object)>
	//   26   52:invokevirtual   #122 <Method void ThreadLocal.set(Object)>
		}
		return ((JsonStringEncoder) (obj1));
	//   27   55:aload_1         
	//   28   56:areturn         
	}

	public byte[] encodeAsUTF8(String s)
	{
		ByteArrayBuilder bytearraybuilder = _bytes;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field ByteArrayBuilder _bytes>
	//    2    4:astore          10
		ByteArrayBuilder bytearraybuilder1 = bytearraybuilder;
	//    3    6:aload           10
	//    4    8:astore          11
		if(bytearraybuilder == null)
	//*   5   10:aload           10
	//*   6   12:ifnonnull       31
		{
			bytearraybuilder1 = new ByteArrayBuilder(((com.fasterxml.jackson.core.util.BufferRecycler) (null)));
	//    7   15:new             #56  <Class ByteArrayBuilder>
	//    8   18:dup             
	//    9   19:aconst_null     
	//   10   20:invokespecial   #129 <Method void ByteArrayBuilder(com.fasterxml.jackson.core.util.BufferRecycler)>
	//   11   23:astore          11
			_bytes = bytearraybuilder1;
	//   12   25:aload_0         
	//   13   26:aload           11
	//   14   28:putfield        #126 <Field ByteArrayBuilder _bytes>
		}
		int i2 = s.length();
	//   15   31:aload_1         
	//   16   32:invokevirtual   #134 <Method int String.length()>
	//   17   35:istore          9
		byte abyte0[] = bytearraybuilder1.resetAndGetFirstSegment();
	//   18   37:aload           11
	//   19   39:invokevirtual   #137 <Method byte[] ByteArrayBuilder.resetAndGetFirstSegment()>
	//   20   42:astore          10
		int l = abyte0.length;
	//   21   44:aload           10
	//   22   46:arraylength     
	//   23   47:istore          5
		int j = 0;
	//   24   49:iconst_0        
	//   25   50:istore_3        
		int i = j;
	//   26   51:iload_3         
	//   27   52:istore_2        
		int k;
label0:
		do
		{
			k = i;
	//   28   53:iload_2         
	//   29   54:istore          4
			if(j >= i2)
				break;
	//   30   56:iload_3         
	//   31   57:iload           9
	//   32   59:icmpge          551
			k = j + 1;
	//   33   62:iload_3         
	//   34   63:iconst_1        
	//   35   64:iadd            
	//   36   65:istore          4
			int j1 = ((int) (s.charAt(j)));
	//   37   67:aload_1         
	//   38   68:iload_3         
	//   39   69:invokevirtual   #141 <Method char String.charAt(int)>
	//   40   72:istore          7
			int i1 = l;
	//   41   74:iload           5
	//   42   76:istore          6
			j = i;
	//   43   78:iload_2         
	//   44   79:istore_3        
			l = j1;
	//   45   80:iload           7
	//   46   82:istore          5
			do
			{
				if(l > 127)
					break;
	//   47   84:iload           5
	//   48   86:bipush          127
	//   49   88:icmpgt          163
				j1 = j;
	//   50   91:iload_3         
	//   51   92:istore          7
				i = i1;
	//   52   94:iload           6
	//   53   96:istore_2        
				if(j >= i1)
	//*  54   97:iload_3         
	//*  55   98:iload           6
	//*  56  100:icmplt          117
				{
					abyte0 = bytearraybuilder1.finishCurrentSegment();
	//   57  103:aload           11
	//   58  105:invokevirtual   #144 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//   59  108:astore          10
					i = abyte0.length;
	//   60  110:aload           10
	//   61  112:arraylength     
	//   62  113:istore_2        
					j1 = 0;
	//   63  114:iconst_0        
	//   64  115:istore          7
				}
				j = j1 + 1;
	//   65  117:iload           7
	//   66  119:iconst_1        
	//   67  120:iadd            
	//   68  121:istore_3        
				abyte0[j1] = (byte)l;
	//   69  122:aload           10
	//   70  124:iload           7
	//   71  126:iload           5
	//   72  128:int2byte        
	//   73  129:bastore         
				if(k >= i2)
	//*  74  130:iload           4
	//*  75  132:iload           9
	//*  76  134:icmplt          143
				{
					k = j;
	//   77  137:iload_3         
	//   78  138:istore          4
					break label0;
	//   79  140:goto            551
				}
				l = ((int) (s.charAt(k)));
	//   80  143:aload_1         
	//   81  144:iload           4
	//   82  146:invokevirtual   #141 <Method char String.charAt(int)>
	//   83  149:istore          5
				k++;
	//   84  151:iload           4
	//   85  153:iconst_1        
	//   86  154:iadd            
	//   87  155:istore          4
				i1 = i;
	//   88  157:iload_2         
	//   89  158:istore          6
			} while(true);
	//   90  160:goto            84
			j1 = j;
	//   91  163:iload_3         
	//   92  164:istore          7
			i = i1;
	//   93  166:iload           6
	//   94  168:istore_2        
			if(j >= i1)
	//*  95  169:iload_3         
	//*  96  170:iload           6
	//*  97  172:icmplt          189
			{
				abyte0 = bytearraybuilder1.finishCurrentSegment();
	//   98  175:aload           11
	//   99  177:invokevirtual   #144 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//  100  180:astore          10
				i = abyte0.length;
	//  101  182:aload           10
	//  102  184:arraylength     
	//  103  185:istore_2        
				j1 = 0;
	//  104  186:iconst_0        
	//  105  187:istore          7
			}
			if(l < 2048)
	//* 106  189:iload           5
	//* 107  191:sipush          2048
	//* 108  194:icmpge          224
			{
				abyte0[j1] = (byte)(0xc0 | l >> 6);
	//  109  197:aload           10
	//  110  199:iload           7
	//  111  201:sipush          192
	//  112  204:iload           5
	//  113  206:bipush          6
	//  114  208:ishr            
	//  115  209:ior             
	//  116  210:int2byte        
	//  117  211:bastore         
				j = j1 + 1;
	//  118  212:iload           7
	//  119  214:iconst_1        
	//  120  215:iadd            
	//  121  216:istore_3        
				i1 = l;
	//  122  217:iload           5
	//  123  219:istore          6
			} else
	//* 124  221:goto            499
			if(l >= 55296 && l <= 57343)
	//* 125  224:iload           5
	//* 126  226:ldc1            #11  <Int 55296>
	//* 127  228:icmplt          419
	//* 128  231:iload           5
	//* 129  233:ldc1            #17  <Int 57343>
	//* 130  235:icmple          241
	//* 131  238:goto            419
			{
				if(l > 56319)
	//* 132  241:iload           5
	//* 133  243:ldc1            #13  <Int 56319>
	//* 134  245:icmple          253
					_illegal(l);
	//  135  248:iload           5
	//  136  250:invokestatic    #146 <Method void _illegal(int)>
				if(k >= i2)
	//* 137  253:iload           4
	//* 138  255:iload           9
	//* 139  257:icmplt          265
					_illegal(l);
	//  140  260:iload           5
	//  141  262:invokestatic    #146 <Method void _illegal(int)>
				i1 = _convert(l, ((int) (s.charAt(k))));
	//  142  265:iload           5
	//  143  267:aload_1         
	//  144  268:iload           4
	//  145  270:invokevirtual   #141 <Method char String.charAt(int)>
	//  146  273:invokestatic    #148 <Method int _convert(int, int)>
	//  147  276:istore          6
				if(i1 > 0x10ffff)
	//* 148  278:iload           6
	//* 149  280:ldc1            #149 <Int 0x10ffff>
	//* 150  282:icmple          290
					_illegal(i1);
	//  151  285:iload           6
	//  152  287:invokestatic    #146 <Method void _illegal(int)>
				int k1 = j1 + 1;
	//  153  290:iload           7
	//  154  292:iconst_1        
	//  155  293:iadd            
	//  156  294:istore          8
				abyte0[j1] = (byte)(0xf0 | i1 >> 18);
	//  157  296:aload           10
	//  158  298:iload           7
	//  159  300:sipush          240
	//  160  303:iload           6
	//  161  305:bipush          18
	//  162  307:ishr            
	//  163  308:ior             
	//  164  309:int2byte        
	//  165  310:bastore         
				j = i;
	//  166  311:iload_2         
	//  167  312:istore_3        
				l = k1;
	//  168  313:iload           8
	//  169  315:istore          5
				if(k1 >= i)
	//* 170  317:iload           8
	//* 171  319:iload_2         
	//* 172  320:icmplt          337
				{
					abyte0 = bytearraybuilder1.finishCurrentSegment();
	//  173  323:aload           11
	//  174  325:invokevirtual   #144 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//  175  328:astore          10
					j = abyte0.length;
	//  176  330:aload           10
	//  177  332:arraylength     
	//  178  333:istore_3        
					l = 0;
	//  179  334:iconst_0        
	//  180  335:istore          5
				}
				j1 = l + 1;
	//  181  337:iload           5
	//  182  339:iconst_1        
	//  183  340:iadd            
	//  184  341:istore          7
				abyte0[l] = (byte)(i1 >> 12 & 0x3f | 0x80);
	//  185  343:aload           10
	//  186  345:iload           5
	//  187  347:iload           6
	//  188  349:bipush          12
	//  189  351:ishr            
	//  190  352:bipush          63
	//  191  354:iand            
	//  192  355:sipush          128
	//  193  358:ior             
	//  194  359:int2byte        
	//  195  360:bastore         
				l = j1;
	//  196  361:iload           7
	//  197  363:istore          5
				i = j;
	//  198  365:iload_3         
	//  199  366:istore_2        
				if(j1 >= j)
	//* 200  367:iload           7
	//* 201  369:iload_3         
	//* 202  370:icmplt          387
				{
					abyte0 = bytearraybuilder1.finishCurrentSegment();
	//  203  373:aload           11
	//  204  375:invokevirtual   #144 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//  205  378:astore          10
					i = abyte0.length;
	//  206  380:aload           10
	//  207  382:arraylength     
	//  208  383:istore_2        
					l = 0;
	//  209  384:iconst_0        
	//  210  385:istore          5
				}
				abyte0[l] = (byte)(i1 >> 6 & 0x3f | 0x80);
	//  211  387:aload           10
	//  212  389:iload           5
	//  213  391:iload           6
	//  214  393:bipush          6
	//  215  395:ishr            
	//  216  396:bipush          63
	//  217  398:iand            
	//  218  399:sipush          128
	//  219  402:ior             
	//  220  403:int2byte        
	//  221  404:bastore         
				j = l + 1;
	//  222  405:iload           5
	//  223  407:iconst_1        
	//  224  408:iadd            
	//  225  409:istore_3        
				k++;
	//  226  410:iload           4
	//  227  412:iconst_1        
	//  228  413:iadd            
	//  229  414:istore          4
			} else
	//* 230  416:goto            499
			{
				int l1 = j1 + 1;
	//  231  419:iload           7
	//  232  421:iconst_1        
	//  233  422:iadd            
	//  234  423:istore          8
				abyte0[j1] = (byte)(0xe0 | l >> 12);
	//  235  425:aload           10
	//  236  427:iload           7
	//  237  429:sipush          224
	//  238  432:iload           5
	//  239  434:bipush          12
	//  240  436:ishr            
	//  241  437:ior             
	//  242  438:int2byte        
	//  243  439:bastore         
				j = i;
	//  244  440:iload_2         
	//  245  441:istore_3        
				i1 = l1;
	//  246  442:iload           8
	//  247  444:istore          6
				if(l1 >= i)
	//* 248  446:iload           8
	//* 249  448:iload_2         
	//* 250  449:icmplt          466
				{
					abyte0 = bytearraybuilder1.finishCurrentSegment();
	//  251  452:aload           11
	//  252  454:invokevirtual   #144 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//  253  457:astore          10
					j = abyte0.length;
	//  254  459:aload           10
	//  255  461:arraylength     
	//  256  462:istore_3        
					i1 = 0;
	//  257  463:iconst_0        
	//  258  464:istore          6
				}
				j1 = i1 + 1;
	//  259  466:iload           6
	//  260  468:iconst_1        
	//  261  469:iadd            
	//  262  470:istore          7
				abyte0[i1] = (byte)(l >> 6 & 0x3f | 0x80);
	//  263  472:aload           10
	//  264  474:iload           6
	//  265  476:iload           5
	//  266  478:bipush          6
	//  267  480:ishr            
	//  268  481:bipush          63
	//  269  483:iand            
	//  270  484:sipush          128
	//  271  487:ior             
	//  272  488:int2byte        
	//  273  489:bastore         
				i = j;
	//  274  490:iload_3         
	//  275  491:istore_2        
				j = j1;
	//  276  492:iload           7
	//  277  494:istore_3        
				i1 = l;
	//  278  495:iload           5
	//  279  497:istore          6
			}
			j1 = j;
	//  280  499:iload_3         
	//  281  500:istore          7
			l = i;
	//  282  502:iload_2         
	//  283  503:istore          5
			if(j >= i)
	//* 284  505:iload_3         
	//* 285  506:iload_2         
	//* 286  507:icmplt          525
			{
				abyte0 = bytearraybuilder1.finishCurrentSegment();
	//  287  510:aload           11
	//  288  512:invokevirtual   #144 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//  289  515:astore          10
				l = abyte0.length;
	//  290  517:aload           10
	//  291  519:arraylength     
	//  292  520:istore          5
				j1 = 0;
	//  293  522:iconst_0        
	//  294  523:istore          7
			}
			abyte0[j1] = (byte)(i1 & 0x3f | 0x80);
	//  295  525:aload           10
	//  296  527:iload           7
	//  297  529:iload           6
	//  298  531:bipush          63
	//  299  533:iand            
	//  300  534:sipush          128
	//  301  537:ior             
	//  302  538:int2byte        
	//  303  539:bastore         
			j = k;
	//  304  540:iload           4
	//  305  542:istore_3        
			i = j1 + 1;
	//  306  543:iload           7
	//  307  545:iconst_1        
	//  308  546:iadd            
	//  309  547:istore_2        
		} while(true);
	//  310  548:goto            53
		return _bytes.completeAndCoalesce(k);
	//  311  551:aload_0         
	//  312  552:getfield        #126 <Field ByteArrayBuilder _bytes>
	//  313  555:iload           4
	//  314  557:invokevirtual   #153 <Method byte[] ByteArrayBuilder.completeAndCoalesce(int)>
	//  315  560:areturn         
	}

	public void quoteAsString(CharSequence charsequence, StringBuilder stringbuilder)
	{
		int ai[] = CharTypes.get7BitOutputEscapes();
	//    0    0:invokestatic    #159 <Method int[] CharTypes.get7BitOutputEscapes()>
	//    1    3:astore          9
		int l = ai.length;
	//    2    5:aload           9
	//    3    7:arraylength     
	//    4    8:istore          6
		int i1 = charsequence.length();
	//    5   10:aload_1         
	//    6   11:invokeinterface #162 <Method int CharSequence.length()>
	//    7   16:istore          7
		int i = 0;
	//    8   18:iconst_0        
	//    9   19:istore          4
label0:
		do
		{
			int k;
			if(i < i1)
	//*  10   21:iload           4
	//*  11   23:iload           7
	//*  12   25:icmpge          143
				do
				{
					char c = charsequence.charAt(i);
	//   13   28:aload_1         
	//   14   29:iload           4
	//   15   31:invokeinterface #163 <Method char CharSequence.charAt(int)>
	//   16   36:istore_3        
					if(c < l && ai[c] != 0)
	//*  17   37:iload_3         
	//*  18   38:iload           6
	//*  19   40:icmpge          120
	//*  20   43:aload           9
	//*  21   45:iload_3         
	//*  22   46:iaload          
	//*  23   47:ifeq            120
					{
						int j = ((int) (charsequence.charAt(i)));
	//   24   50:aload_1         
	//   25   51:iload           4
	//   26   53:invokeinterface #163 <Method char CharSequence.charAt(int)>
	//   27   58:istore          5
						int j1 = ai[j];
	//   28   60:aload           9
	//   29   62:iload           5
	//   30   64:iaload          
	//   31   65:istore          8
						if(j1 < 0)
	//*  32   67:iload           8
	//*  33   69:ifge            87
							j = _appendNumeric(j, _qbuf);
	//   34   72:aload_0         
	//   35   73:iload           5
	//   36   75:aload_0         
	//   37   76:getfield        #52  <Field char[] _qbuf>
	//   38   79:invokespecial   #165 <Method int _appendNumeric(int, char[])>
	//   39   82:istore          5
						else
	//*  40   84:goto            99
							j = _appendNamed(j1, _qbuf);
	//   41   87:aload_0         
	//   42   88:iload           8
	//   43   90:aload_0         
	//   44   91:getfield        #52  <Field char[] _qbuf>
	//   45   94:invokespecial   #167 <Method int _appendNamed(int, char[])>
	//   46   97:istore          5
						stringbuilder.append(_qbuf, 0, j);
	//   47   99:aload_2         
	//   48  100:aload_0         
	//   49  101:getfield        #52  <Field char[] _qbuf>
	//   50  104:iconst_0        
	//   51  105:iload           5
	//   52  107:invokevirtual   #170 <Method StringBuilder StringBuilder.append(char[], int, int)>
	//   53  110:pop             
						i++;
	//   54  111:iload           4
	//   55  113:iconst_1        
	//   56  114:iadd            
	//   57  115:istore          4
						continue label0;
	//   58  117:goto            21
					}
					stringbuilder.append(c);
	//   59  120:aload_2         
	//   60  121:iload_3         
	//   61  122:invokevirtual   #173 <Method StringBuilder StringBuilder.append(char)>
	//   62  125:pop             
					k = i + 1;
	//   63  126:iload           4
	//   64  128:iconst_1        
	//   65  129:iadd            
	//   66  130:istore          5
					i = k;
	//   67  132:iload           5
	//   68  134:istore          4
				} while(k < i1);
	//   69  136:iload           5
	//   70  138:iload           7
	//   71  140:icmplt          28
			return;
	//   72  143:return          
		} while(true);
	}

	public char[] quoteAsString(String s)
	{
		TextBuffer textbuffer = _text;
	//    0    0:aload_0         
	//    1    1:getfield        #176 <Field TextBuffer _text>
	//    2    4:astore          9
		TextBuffer textbuffer1 = textbuffer;
	//    3    6:aload           9
	//    4    8:astore          10
		if(textbuffer == null)
	//*   5   10:aload           9
	//*   6   12:ifnonnull       31
		{
			textbuffer1 = new TextBuffer(((com.fasterxml.jackson.core.util.BufferRecycler) (null)));
	//    7   15:new             #178 <Class TextBuffer>
	//    8   18:dup             
	//    9   19:aconst_null     
	//   10   20:invokespecial   #179 <Method void TextBuffer(com.fasterxml.jackson.core.util.BufferRecycler)>
	//   11   23:astore          10
			_text = textbuffer1;
	//   12   25:aload_0         
	//   13   26:aload           10
	//   14   28:putfield        #176 <Field TextBuffer _text>
		}
		char ac[] = textbuffer1.emptyAndGetCurrentSegment();
	//   15   31:aload           10
	//   16   33:invokevirtual   #182 <Method char[] TextBuffer.emptyAndGetCurrentSegment()>
	//   17   36:astore          9
		int ai[] = CharTypes.get7BitOutputEscapes();
	//   18   38:invokestatic    #159 <Method int[] CharTypes.get7BitOutputEscapes()>
	//   19   41:astore          12
		int i1 = ai.length;
	//   20   43:aload           12
	//   21   45:arraylength     
	//   22   46:istore          7
		int j1 = s.length();
	//   23   48:aload_1         
	//   24   49:invokevirtual   #134 <Method int String.length()>
	//   25   52:istore          8
		int j = 0;
	//   26   54:iconst_0        
	//   27   55:istore          4
		int i = j;
	//   28   57:iload           4
	//   29   59:istore_3        
label0:
		do
		{
			int k = i;
	//   30   60:iload_3         
	//   31   61:istore          5
			if(j < j1)
	//*  32   63:iload           4
	//*  33   65:iload           8
	//*  34   67:icmpge          291
				do
				{
					char c = s.charAt(j);
	//   35   70:aload_1         
	//   36   71:iload           4
	//   37   73:invokevirtual   #141 <Method char String.charAt(int)>
	//   38   76:istore_2        
					if(c < i1 && ai[c] != 0)
	//*  39   77:iload_2         
	//*  40   78:iload           7
	//*  41   80:icmpge          230
	//*  42   83:aload           12
	//*  43   85:iload_2         
	//*  44   86:iaload          
	//*  45   87:ifeq            230
					{
						k = ((int) (s.charAt(j)));
	//   46   90:aload_1         
	//   47   91:iload           4
	//   48   93:invokevirtual   #141 <Method char String.charAt(int)>
	//   49   96:istore          5
						int l = ai[k];
	//   50   98:aload           12
	//   51  100:iload           5
	//   52  102:iaload          
	//   53  103:istore          6
						if(l < 0)
	//*  54  105:iload           6
	//*  55  107:ifge            125
							k = _appendNumeric(k, _qbuf);
	//   56  110:aload_0         
	//   57  111:iload           5
	//   58  113:aload_0         
	//   59  114:getfield        #52  <Field char[] _qbuf>
	//   60  117:invokespecial   #165 <Method int _appendNumeric(int, char[])>
	//   61  120:istore          5
						else
	//*  62  122:goto            137
							k = _appendNamed(l, _qbuf);
	//   63  125:aload_0         
	//   64  126:iload           6
	//   65  128:aload_0         
	//   66  129:getfield        #52  <Field char[] _qbuf>
	//   67  132:invokespecial   #167 <Method int _appendNamed(int, char[])>
	//   68  135:istore          5
						l = i + k;
	//   69  137:iload_3         
	//   70  138:iload           5
	//   71  140:iadd            
	//   72  141:istore          6
						if(l > ac.length)
	//*  73  143:iload           6
	//*  74  145:aload           9
	//*  75  147:arraylength     
	//*  76  148:icmple          205
						{
							l = ac.length - i;
	//   77  151:aload           9
	//   78  153:arraylength     
	//   79  154:iload_3         
	//   80  155:isub            
	//   81  156:istore          6
							if(l > 0)
	//*  82  158:iload           6
	//*  83  160:ifle            176
								System.arraycopy(((Object) (_qbuf)), 0, ((Object) (ac)), i, l);
	//   84  163:aload_0         
	//   85  164:getfield        #52  <Field char[] _qbuf>
	//   86  167:iconst_0        
	//   87  168:aload           9
	//   88  170:iload_3         
	//   89  171:iload           6
	//   90  173:invokestatic    #188 <Method void System.arraycopy(Object, int, Object, int, int)>
							ac = textbuffer1.finishCurrentSegment();
	//   91  176:aload           10
	//   92  178:invokevirtual   #190 <Method char[] TextBuffer.finishCurrentSegment()>
	//   93  181:astore          9
							i = k - l;
	//   94  183:iload           5
	//   95  185:iload           6
	//   96  187:isub            
	//   97  188:istore_3        
							System.arraycopy(((Object) (_qbuf)), l, ((Object) (ac)), 0, i);
	//   98  189:aload_0         
	//   99  190:getfield        #52  <Field char[] _qbuf>
	//  100  193:iload           6
	//  101  195:aload           9
	//  102  197:iconst_0        
	//  103  198:iload_3         
	//  104  199:invokestatic    #188 <Method void System.arraycopy(Object, int, Object, int, int)>
						} else
	//* 105  202:goto            221
						{
							System.arraycopy(((Object) (_qbuf)), 0, ((Object) (ac)), i, k);
	//  106  205:aload_0         
	//  107  206:getfield        #52  <Field char[] _qbuf>
	//  108  209:iconst_0        
	//  109  210:aload           9
	//  110  212:iload_3         
	//  111  213:iload           5
	//  112  215:invokestatic    #188 <Method void System.arraycopy(Object, int, Object, int, int)>
							i = l;
	//  113  218:iload           6
	//  114  220:istore_3        
						}
						j++;
	//  115  221:iload           4
	//  116  223:iconst_1        
	//  117  224:iadd            
	//  118  225:istore          4
						continue label0;
	//  119  227:goto            60
					}
					k = i;
	//  120  230:iload_3         
	//  121  231:istore          5
					char ac1[] = ac;
	//  122  233:aload           9
	//  123  235:astore          11
					if(i >= ac.length)
	//* 124  237:iload_3         
	//* 125  238:aload           9
	//* 126  240:arraylength     
	//* 127  241:icmplt          254
					{
						ac1 = textbuffer1.finishCurrentSegment();
	//  128  244:aload           10
	//  129  246:invokevirtual   #190 <Method char[] TextBuffer.finishCurrentSegment()>
	//  130  249:astore          11
						k = 0;
	//  131  251:iconst_0        
	//  132  252:istore          5
					}
					i = k + 1;
	//  133  254:iload           5
	//  134  256:iconst_1        
	//  135  257:iadd            
	//  136  258:istore_3        
					ac1[k] = c;
	//  137  259:aload           11
	//  138  261:iload           5
	//  139  263:iload_2         
	//  140  264:castore         
					j++;
	//  141  265:iload           4
	//  142  267:iconst_1        
	//  143  268:iadd            
	//  144  269:istore          4
					if(j >= j1)
	//* 145  271:iload           4
	//* 146  273:iload           8
	//* 147  275:icmplt          284
					{
						k = i;
	//  148  278:iload_3         
	//  149  279:istore          5
						break;
	//  150  281:goto            291
					}
					ac = ac1;
	//  151  284:aload           11
	//  152  286:astore          9
				} while(true);
	//  153  288:goto            70
			textbuffer1.setCurrentLength(k);
	//  154  291:aload           10
	//  155  293:iload           5
	//  156  295:invokevirtual   #193 <Method void TextBuffer.setCurrentLength(int)>
			return textbuffer1.contentsAsArray();
	//  157  298:aload           10
	//  158  300:invokevirtual   #196 <Method char[] TextBuffer.contentsAsArray()>
	//  159  303:areturn         
		} while(true);
	}

	public byte[] quoteAsUTF8(String s)
	{
		ByteArrayBuilder bytearraybuilder = _bytes;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field ByteArrayBuilder _bytes>
	//    2    4:astore          8
		ByteArrayBuilder bytearraybuilder1 = bytearraybuilder;
	//    3    6:aload           8
	//    4    8:astore          10
		if(bytearraybuilder == null)
	//*   5   10:aload           8
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
		int j1 = s.length();
	//   15   31:aload_1         
	//   16   32:invokevirtual   #134 <Method int String.length()>
	//   17   35:istore          6
		byte abyte2[] = bytearraybuilder1.resetAndGetFirstSegment();
	//   18   37:aload           10
	//   19   39:invokevirtual   #137 <Method byte[] ByteArrayBuilder.resetAndGetFirstSegment()>
	//   20   42:astore          9
		int j = 0;
	//   21   44:iconst_0        
	//   22   45:istore_3        
		int i = j;
	//   23   46:iload_3         
	//   24   47:istore_2        
		int l;
label0:
		do
		{
			l = i;
	//   25   48:iload_2         
	//   26   49:istore          4
			if(j >= j1)
				break;
	//   27   51:iload_3         
	//   28   52:iload           6
	//   29   54:icmpge          573
			int ai[] = CharTypes.get7BitOutputEscapes();
	//   30   57:invokestatic    #159 <Method int[] CharTypes.get7BitOutputEscapes()>
	//   31   60:astore          11
			do
			{
				char c = s.charAt(j);
	//   32   62:aload_1         
	//   33   63:iload_3         
	//   34   64:invokevirtual   #141 <Method char String.charAt(int)>
	//   35   67:istore          5
				if(c > '\177' || ai[c] != 0)
	//*  36   69:iload           5
	//*  37   71:bipush          127
	//*  38   73:icmpgt          147
	//*  39   76:aload           11
	//*  40   78:iload           5
	//*  41   80:iaload          
	//*  42   81:ifeq            87
					break;
	//   43   84:goto            147
				l = i;
	//   44   87:iload_2         
	//   45   88:istore          4
				byte abyte0[] = abyte2;
	//   46   90:aload           9
	//   47   92:astore          8
				if(i >= abyte2.length)
	//*  48   94:iload_2         
	//*  49   95:aload           9
	//*  50   97:arraylength     
	//*  51   98:icmplt          111
				{
					abyte0 = bytearraybuilder1.finishCurrentSegment();
	//   52  101:aload           10
	//   53  103:invokevirtual   #144 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//   54  106:astore          8
					l = 0;
	//   55  108:iconst_0        
	//   56  109:istore          4
				}
				i = l + 1;
	//   57  111:iload           4
	//   58  113:iconst_1        
	//   59  114:iadd            
	//   60  115:istore_2        
				abyte0[l] = (byte)c;
	//   61  116:aload           8
	//   62  118:iload           4
	//   63  120:iload           5
	//   64  122:int2byte        
	//   65  123:bastore         
				j++;
	//   66  124:iload_3         
	//   67  125:iconst_1        
	//   68  126:iadd            
	//   69  127:istore_3        
				if(j >= j1)
	//*  70  128:iload_3         
	//*  71  129:iload           6
	//*  72  131:icmplt          140
				{
					l = i;
	//   73  134:iload_2         
	//   74  135:istore          4
					break label0;
	//   75  137:goto            573
				}
				abyte2 = abyte0;
	//   76  140:aload           8
	//   77  142:astore          9
			} while(true);
	//   78  144:goto            62
			int i1 = i;
	//   79  147:iload_2         
	//   80  148:istore          5
			byte abyte1[] = abyte2;
	//   81  150:aload           9
	//   82  152:astore          8
			if(i >= abyte2.length)
	//*  83  154:iload_2         
	//*  84  155:aload           9
	//*  85  157:arraylength     
	//*  86  158:icmplt          171
			{
				abyte1 = bytearraybuilder1.finishCurrentSegment();
	//   87  161:aload           10
	//   88  163:invokevirtual   #144 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//   89  166:astore          8
				i1 = 0;
	//   90  168:iconst_0        
	//   91  169:istore          5
			}
			l = j + 1;
	//   92  171:iload_3         
	//   93  172:iconst_1        
	//   94  173:iadd            
	//   95  174:istore          4
			int k1 = ((int) (s.charAt(j)));
	//   96  176:aload_1         
	//   97  177:iload_3         
	//   98  178:invokevirtual   #141 <Method char String.charAt(int)>
	//   99  181:istore          7
			if(k1 <= 127)
	//* 100  183:iload           7
	//* 101  185:bipush          127
	//* 102  187:icmpgt          219
			{
				i = _appendByte(k1, ai[k1], bytearraybuilder1, i1);
	//  103  190:aload_0         
	//  104  191:iload           7
	//  105  193:aload           11
	//  106  195:iload           7
	//  107  197:iaload          
	//  108  198:aload           10
	//  109  200:iload           5
	//  110  202:invokespecial   #199 <Method int _appendByte(int, int, ByteArrayBuilder, int)>
	//  111  205:istore_2        
				abyte2 = bytearraybuilder1.getCurrentSegment();
	//  112  206:aload           10
	//  113  208:invokevirtual   #202 <Method byte[] ByteArrayBuilder.getCurrentSegment()>
	//  114  211:astore          9
			} else
	//* 115  213:iload           4
	//* 116  215:istore_3        
	//* 117  216:goto            48
			{
				int k;
				if(k1 <= 2047)
	//* 118  219:iload           7
	//* 119  221:sipush          2047
	//* 120  224:icmpgt          260
				{
					abyte1[i1] = (byte)(0xc0 | k1 >> 6);
	//  121  227:aload           8
	//  122  229:iload           5
	//  123  231:sipush          192
	//  124  234:iload           7
	//  125  236:bipush          6
	//  126  238:ishr            
	//  127  239:ior             
	//  128  240:int2byte        
	//  129  241:bastore         
					k = k1 & 0x3f | 0x80;
	//  130  242:iload           7
	//  131  244:bipush          63
	//  132  246:iand            
	//  133  247:sipush          128
	//  134  250:ior             
	//  135  251:istore_3        
					i = i1 + 1;
	//  136  252:iload           5
	//  137  254:iconst_1        
	//  138  255:iadd            
	//  139  256:istore_2        
				} else
	//* 140  257:goto            534
				if(k1 >= 55296 && k1 <= 57343)
	//* 141  260:iload           7
	//* 142  262:ldc1            #11  <Int 55296>
	//* 143  264:icmplt          451
	//* 144  267:iload           7
	//* 145  269:ldc1            #17  <Int 57343>
	//* 146  271:icmple          277
	//* 147  274:goto            451
				{
					if(k1 > 56319)
	//* 148  277:iload           7
	//* 149  279:ldc1            #13  <Int 56319>
	//* 150  281:icmple          289
						_illegal(k1);
	//  151  284:iload           7
	//  152  286:invokestatic    #146 <Method void _illegal(int)>
					if(l >= j1)
	//* 153  289:iload           4
	//* 154  291:iload           6
	//* 155  293:icmplt          301
						_illegal(k1);
	//  156  296:iload           7
	//  157  298:invokestatic    #146 <Method void _illegal(int)>
					k1 = _convert(k1, ((int) (s.charAt(l))));
	//  158  301:iload           7
	//  159  303:aload_1         
	//  160  304:iload           4
	//  161  306:invokevirtual   #141 <Method char String.charAt(int)>
	//  162  309:invokestatic    #148 <Method int _convert(int, int)>
	//  163  312:istore          7
					if(k1 > 0x10ffff)
	//* 164  314:iload           7
	//* 165  316:ldc1            #149 <Int 0x10ffff>
	//* 166  318:icmple          326
						_illegal(k1);
	//  167  321:iload           7
	//  168  323:invokestatic    #146 <Method void _illegal(int)>
					k = i1 + 1;
	//  169  326:iload           5
	//  170  328:iconst_1        
	//  171  329:iadd            
	//  172  330:istore_3        
					abyte1[i1] = (byte)(0xf0 | k1 >> 18);
	//  173  331:aload           8
	//  174  333:iload           5
	//  175  335:sipush          240
	//  176  338:iload           7
	//  177  340:bipush          18
	//  178  342:ishr            
	//  179  343:ior             
	//  180  344:int2byte        
	//  181  345:bastore         
					abyte2 = abyte1;
	//  182  346:aload           8
	//  183  348:astore          9
					i = k;
	//  184  350:iload_3         
	//  185  351:istore_2        
					if(k >= abyte1.length)
	//* 186  352:iload_3         
	//* 187  353:aload           8
	//* 188  355:arraylength     
	//* 189  356:icmplt          368
					{
						abyte2 = bytearraybuilder1.finishCurrentSegment();
	//  190  359:aload           10
	//  191  361:invokevirtual   #144 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//  192  364:astore          9
						i = 0;
	//  193  366:iconst_0        
	//  194  367:istore_2        
					}
					k = i + 1;
	//  195  368:iload_2         
	//  196  369:iconst_1        
	//  197  370:iadd            
	//  198  371:istore_3        
					abyte2[i] = (byte)(k1 >> 12 & 0x3f | 0x80);
	//  199  372:aload           9
	//  200  374:iload_2         
	//  201  375:iload           7
	//  202  377:bipush          12
	//  203  379:ishr            
	//  204  380:bipush          63
	//  205  382:iand            
	//  206  383:sipush          128
	//  207  386:ior             
	//  208  387:int2byte        
	//  209  388:bastore         
					i = k;
	//  210  389:iload_3         
	//  211  390:istore_2        
					abyte1 = abyte2;
	//  212  391:aload           9
	//  213  393:astore          8
					if(k >= abyte2.length)
	//* 214  395:iload_3         
	//* 215  396:aload           9
	//* 216  398:arraylength     
	//* 217  399:icmplt          411
					{
						abyte1 = bytearraybuilder1.finishCurrentSegment();
	//  218  402:aload           10
	//  219  404:invokevirtual   #144 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//  220  407:astore          8
						i = 0;
	//  221  409:iconst_0        
	//  222  410:istore_2        
					}
					abyte1[i] = (byte)(k1 >> 6 & 0x3f | 0x80);
	//  223  411:aload           8
	//  224  413:iload_2         
	//  225  414:iload           7
	//  226  416:bipush          6
	//  227  418:ishr            
	//  228  419:bipush          63
	//  229  421:iand            
	//  230  422:sipush          128
	//  231  425:ior             
	//  232  426:int2byte        
	//  233  427:bastore         
					k = k1 & 0x3f | 0x80;
	//  234  428:iload           7
	//  235  430:bipush          63
	//  236  432:iand            
	//  237  433:sipush          128
	//  238  436:ior             
	//  239  437:istore_3        
					i++;
	//  240  438:iload_2         
	//  241  439:iconst_1        
	//  242  440:iadd            
	//  243  441:istore_2        
					l++;
	//  244  442:iload           4
	//  245  444:iconst_1        
	//  246  445:iadd            
	//  247  446:istore          4
				} else
	//* 248  448:goto            534
				{
					k = i1 + 1;
	//  249  451:iload           5
	//  250  453:iconst_1        
	//  251  454:iadd            
	//  252  455:istore_3        
					abyte1[i1] = (byte)(0xe0 | k1 >> 12);
	//  253  456:aload           8
	//  254  458:iload           5
	//  255  460:sipush          224
	//  256  463:iload           7
	//  257  465:bipush          12
	//  258  467:ishr            
	//  259  468:ior             
	//  260  469:int2byte        
	//  261  470:bastore         
					abyte2 = abyte1;
	//  262  471:aload           8
	//  263  473:astore          9
					i = k;
	//  264  475:iload_3         
	//  265  476:istore_2        
					if(k >= abyte1.length)
	//* 266  477:iload_3         
	//* 267  478:aload           8
	//* 268  480:arraylength     
	//* 269  481:icmplt          493
					{
						abyte2 = bytearraybuilder1.finishCurrentSegment();
	//  270  484:aload           10
	//  271  486:invokevirtual   #144 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//  272  489:astore          9
						i = 0;
	//  273  491:iconst_0        
	//  274  492:istore_2        
					}
					k = i + 1;
	//  275  493:iload_2         
	//  276  494:iconst_1        
	//  277  495:iadd            
	//  278  496:istore_3        
					abyte2[i] = (byte)(k1 >> 6 & 0x3f | 0x80);
	//  279  497:aload           9
	//  280  499:iload_2         
	//  281  500:iload           7
	//  282  502:bipush          6
	//  283  504:ishr            
	//  284  505:bipush          63
	//  285  507:iand            
	//  286  508:sipush          128
	//  287  511:ior             
	//  288  512:int2byte        
	//  289  513:bastore         
					i1 = k1 & 0x3f | 0x80;
	//  290  514:iload           7
	//  291  516:bipush          63
	//  292  518:iand            
	//  293  519:sipush          128
	//  294  522:ior             
	//  295  523:istore          5
					abyte1 = abyte2;
	//  296  525:aload           9
	//  297  527:astore          8
					i = k;
	//  298  529:iload_3         
	//  299  530:istore_2        
					k = i1;
	//  300  531:iload           5
	//  301  533:istore_3        
				}
				i1 = i;
	//  302  534:iload_2         
	//  303  535:istore          5
				abyte2 = abyte1;
	//  304  537:aload           8
	//  305  539:astore          9
				if(i >= abyte1.length)
	//* 306  541:iload_2         
	//* 307  542:aload           8
	//* 308  544:arraylength     
	//* 309  545:icmplt          558
				{
					abyte2 = bytearraybuilder1.finishCurrentSegment();
	//  310  548:aload           10
	//  311  550:invokevirtual   #144 <Method byte[] ByteArrayBuilder.finishCurrentSegment()>
	//  312  553:astore          9
					i1 = 0;
	//  313  555:iconst_0        
	//  314  556:istore          5
				}
				abyte2[i1] = (byte)k;
	//  315  558:aload           9
	//  316  560:iload           5
	//  317  562:iload_3         
	//  318  563:int2byte        
	//  319  564:bastore         
				i = i1 + 1;
	//  320  565:iload           5
	//  321  567:iconst_1        
	//  322  568:iadd            
	//  323  569:istore_2        
			}
			j = l;
		} while(true);
	//  324  570:goto            213
		return _bytes.completeAndCoalesce(l);
	//  325  573:aload_0         
	//  326  574:getfield        #126 <Field ByteArrayBuilder _bytes>
	//  327  577:iload           4
	//  328  579:invokevirtual   #153 <Method byte[] ByteArrayBuilder.completeAndCoalesce(int)>
	//  329  582:areturn         
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
