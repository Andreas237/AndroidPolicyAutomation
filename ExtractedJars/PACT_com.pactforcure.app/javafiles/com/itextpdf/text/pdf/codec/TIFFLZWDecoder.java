// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.codec;

import com.itextpdf.text.error_messages.MessageLocalization;

public class TIFFLZWDecoder
{

	public TIFFLZWDecoder(int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		data = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #30  <Field byte[] data>
		bitsToGet = 9;
	//    5    9:aload_0         
	//    6   10:bipush          9
	//    7   12:putfield        #32  <Field int bitsToGet>
		nextData = 0;
	//    8   15:aload_0         
	//    9   16:iconst_0        
	//   10   17:putfield        #34  <Field int nextData>
		nextBits = 0;
	//   11   20:aload_0         
	//   12   21:iconst_0        
	//   13   22:putfield        #36  <Field int nextBits>
	//   14   25:aload_0         
	//   15   26:iconst_4        
	//   16   27:newarray        int[]
	//   17   29:dup             
	//   18   30:iconst_0        
	//   19   31:sipush          511
	//   20   34:iastore         
	//   21   35:dup             
	//   22   36:iconst_1        
	//   23   37:sipush          1023
	//   24   40:iastore         
	//   25   41:dup             
	//   26   42:iconst_2        
	//   27   43:sipush          2047
	//   28   46:iastore         
	//   29   47:dup             
	//   30   48:iconst_3        
	//   31   49:sipush          4095
	//   32   52:iastore         
	//   33   53:putfield        #38  <Field int[] andTable>
		w = i;
	//   34   56:aload_0         
	//   35   57:iload_1         
	//   36   58:putfield        #40  <Field int w>
		predictor = j;
	//   37   61:aload_0         
	//   38   62:iload_2         
	//   39   63:putfield        #42  <Field int predictor>
		samplesPerPixel = k;
	//   40   66:aload_0         
	//   41   67:iload_3         
	//   42   68:putfield        #44  <Field int samplesPerPixel>
	//   43   71:return          
	}

	public void addStringToTable(byte abyte0[])
	{
		byte abyte1[][] = stringTable;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field byte[][] stringTable>
	//    2    4:astore_3        
		int i = tableIndex;
	//    3    5:aload_0         
	//    4    6:getfield        #51  <Field int tableIndex>
	//    5    9:istore_2        
		tableIndex = i + 1;
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #51  <Field int tableIndex>
		abyte1[i] = abyte0;
	//   11   17:aload_3         
	//   12   18:iload_2         
	//   13   19:aload_1         
	//   14   20:aastore         
		if(tableIndex == 511)
	//*  15   21:aload_0         
	//*  16   22:getfield        #51  <Field int tableIndex>
	//*  17   25:sipush          511
	//*  18   28:icmpne          38
		{
			bitsToGet = 10;
	//   19   31:aload_0         
	//   20   32:bipush          10
	//   21   34:putfield        #32  <Field int bitsToGet>
		} else
	//*  22   37:return          
		{
			if(tableIndex == 1023)
	//*  23   38:aload_0         
	//*  24   39:getfield        #51  <Field int tableIndex>
	//*  25   42:sipush          1023
	//*  26   45:icmpne          55
			{
				bitsToGet = 11;
	//   27   48:aload_0         
	//   28   49:bipush          11
	//   29   51:putfield        #32  <Field int bitsToGet>
				return;
	//   30   54:return          
			}
			if(tableIndex == 2047)
	//*  31   55:aload_0         
	//*  32   56:getfield        #51  <Field int tableIndex>
	//*  33   59:sipush          2047
	//*  34   62:icmpne          37
			{
				bitsToGet = 12;
	//   35   65:aload_0         
	//   36   66:bipush          12
	//   37   68:putfield        #32  <Field int bitsToGet>
				return;
	//   38   71:return          
			}
		}
	}

	public void addStringToTable(byte abyte0[], byte byte0)
	{
		int i = abyte0.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		byte byte1 = ((byte) (new byte[i + 1]));
	//    3    3:iload_3         
	//    4    4:iconst_1        
	//    5    5:iadd            
	//    6    6:newarray        byte[]
	//    7    8:astore          4
		System.arraycopy(((Object) (abyte0)), 0, ((Object) (byte1)), 0, i);
	//    8   10:aload_1         
	//    9   11:iconst_0        
	//   10   12:aload           4
	//   11   14:iconst_0        
	//   12   15:iload_3         
	//   13   16:invokestatic    #58  <Method void System.arraycopy(Object, int, Object, int, int)>
		byte1[i] = byte0;
	//   14   19:aload           4
	//   15   21:iload_3         
	//   16   22:iload_2         
	//   17   23:bastore         
		abyte0 = ((byte []) (stringTable));
	//   18   24:aload_0         
	//   19   25:getfield        #49  <Field byte[][] stringTable>
	//   20   28:astore_1        
		i = tableIndex;
	//   21   29:aload_0         
	//   22   30:getfield        #51  <Field int tableIndex>
	//   23   33:istore_3        
		tableIndex = i + 1;
	//   24   34:aload_0         
	//   25   35:iload_3         
	//   26   36:iconst_1        
	//   27   37:iadd            
	//   28   38:putfield        #51  <Field int tableIndex>
		abyte0[i] = byte1;
	//   29   41:aload_1         
	//   30   42:iload_3         
	//   31   43:aload           4
	//   32   45:aastore         
		if(tableIndex == 511)
	//*  33   46:aload_0         
	//*  34   47:getfield        #51  <Field int tableIndex>
	//*  35   50:sipush          511
	//*  36   53:icmpne          63
		{
			bitsToGet = 10;
	//   37   56:aload_0         
	//   38   57:bipush          10
	//   39   59:putfield        #32  <Field int bitsToGet>
		} else
	//*  40   62:return          
		{
			if(tableIndex == 1023)
	//*  41   63:aload_0         
	//*  42   64:getfield        #51  <Field int tableIndex>
	//*  43   67:sipush          1023
	//*  44   70:icmpne          80
			{
				bitsToGet = 11;
	//   45   73:aload_0         
	//   46   74:bipush          11
	//   47   76:putfield        #32  <Field int bitsToGet>
				return;
	//   48   79:return          
			}
			if(tableIndex == 2047)
	//*  49   80:aload_0         
	//*  50   81:getfield        #51  <Field int tableIndex>
	//*  51   84:sipush          2047
	//*  52   87:icmpne          62
			{
				bitsToGet = 12;
	//   53   90:aload_0         
	//   54   91:bipush          12
	//   55   93:putfield        #32  <Field int bitsToGet>
				return;
	//   56   96:return          
			}
		}
	}

	public byte[] composeString(byte abyte0[], byte byte0)
	{
		int i = abyte0.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		byte abyte1[] = new byte[i + 1];
	//    3    3:iload_3         
	//    4    4:iconst_1        
	//    5    5:iadd            
	//    6    6:newarray        byte[]
	//    7    8:astore          4
		System.arraycopy(((Object) (abyte0)), 0, ((Object) (abyte1)), 0, i);
	//    8   10:aload_1         
	//    9   11:iconst_0        
	//   10   12:aload           4
	//   11   14:iconst_0        
	//   12   15:iload_3         
	//   13   16:invokestatic    #58  <Method void System.arraycopy(Object, int, Object, int, int)>
		abyte1[i] = byte0;
	//   14   19:aload           4
	//   15   21:iload_3         
	//   16   22:iload_2         
	//   17   23:bastore         
		return abyte1;
	//   18   24:aload           4
	//   19   26:areturn         
	}

	public byte[] decode(byte abyte0[], byte abyte1[], int i)
	{
		int j;
		if(abyte0[0] == 0 && abyte0[1] == 1)
	//*   0    0:aload_1         
	//*   1    1:iconst_0        
	//*   2    2:baload          
	//*   3    3:ifne            30
	//*   4    6:aload_1         
	//*   5    7:iconst_1        
	//*   6    8:baload          
	//*   7    9:iconst_1        
	//*   8   10:icmpne          30
			throw new UnsupportedOperationException(MessageLocalization.getComposedMessage("tiff.5.0.style.lzw.codes.are.not.supported", new Object[0]));
	//    9   13:new             #64  <Class UnsupportedOperationException>
	//   10   16:dup             
	//   11   17:ldc1            #66  <String "tiff.5.0.style.lzw.codes.are.not.supported">
	//   12   19:iconst_0        
	//   13   20:anewarray       Object[]
	//   14   23:invokestatic    #72  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   15   26:invokespecial   #75  <Method void UnsupportedOperationException(String)>
	//   16   29:athrow          
		initializeStringTable();
	//   17   30:aload_0         
	//   18   31:invokevirtual   #78  <Method void initializeStringTable()>
		data = abyte0;
	//   19   34:aload_0         
	//   20   35:aload_1         
	//   21   36:putfield        #30  <Field byte[] data>
		h = i;
	//   22   39:aload_0         
	//   23   40:iload_3         
	//   24   41:putfield        #80  <Field int h>
		uncompData = abyte1;
	//   25   44:aload_0         
	//   26   45:aload_2         
	//   27   46:putfield        #82  <Field byte[] uncompData>
		bytePointer = 0;
	//   28   49:aload_0         
	//   29   50:iconst_0        
	//   30   51:putfield        #84  <Field int bytePointer>
		bitPointer = 0;
	//   31   54:aload_0         
	//   32   55:iconst_0        
	//   33   56:putfield        #86  <Field int bitPointer>
		dstIndex = 0;
	//   34   59:aload_0         
	//   35   60:iconst_0        
	//   36   61:putfield        #88  <Field int dstIndex>
		nextData = 0;
	//   37   64:aload_0         
	//   38   65:iconst_0        
	//   39   66:putfield        #34  <Field int nextData>
		nextBits = 0;
	//   40   69:aload_0         
	//   41   70:iconst_0        
	//   42   71:putfield        #36  <Field int nextBits>
		j = 0;
	//   43   74:iconst_0        
	//   44   75:istore          4
_L10:
		int k = getNextCode();
	//   45   77:aload_0         
	//   46   78:invokevirtual   #92  <Method int getNextCode()>
	//   47   81:istore          5
		if(k == 257 || dstIndex >= abyte1.length) goto _L2; else goto _L1
	//   48   83:iload           5
	//   49   85:sipush          257
	//   50   88:icmpeq          126
	//   51   91:aload_0         
	//   52   92:getfield        #88  <Field int dstIndex>
	//   53   95:aload_2         
	//   54   96:arraylength     
	//   55   97:icmpge          126
_L1:
		if(k != 256) goto _L4; else goto _L3
	//   56  100:iload           5
	//   57  102:sipush          256
	//   58  105:icmpne          227
_L3:
		initializeStringTable();
	//   59  108:aload_0         
	//   60  109:invokevirtual   #78  <Method void initializeStringTable()>
		j = getNextCode();
	//   61  112:aload_0         
	//   62  113:invokevirtual   #92  <Method int getNextCode()>
	//   63  116:istore          4
		if(j != 257) goto _L5; else goto _L2
	//   64  118:iload           4
	//   65  120:sipush          257
	//   66  123:icmpne          213
_L2:
		if(predictor != 2) goto _L7; else goto _L6
	//   67  126:aload_0         
	//   68  127:getfield        #42  <Field int predictor>
	//   69  130:iconst_2        
	//   70  131:icmpne          313
_L6:
		j = 0;
	//   71  134:iconst_0        
	//   72  135:istore          4
_L8:
		if(j >= i)
			break; /* Loop/switch isn't completed */
	//   73  137:iload           4
	//   74  139:iload_3         
	//   75  140:icmpge          313
		int l = samplesPerPixel * (w * j + 1);
	//   76  143:aload_0         
	//   77  144:getfield        #44  <Field int samplesPerPixel>
	//   78  147:aload_0         
	//   79  148:getfield        #40  <Field int w>
	//   80  151:iload           4
	//   81  153:imul            
	//   82  154:iconst_1        
	//   83  155:iadd            
	//   84  156:imul            
	//   85  157:istore          6
		for(k = samplesPerPixel; k < w * samplesPerPixel; k++)
	//*  86  159:aload_0         
	//*  87  160:getfield        #44  <Field int samplesPerPixel>
	//*  88  163:istore          5
	//*  89  165:iload           5
	//*  90  167:aload_0         
	//*  91  168:getfield        #40  <Field int w>
	//*  92  171:aload_0         
	//*  93  172:getfield        #44  <Field int samplesPerPixel>
	//*  94  175:imul            
	//*  95  176:icmpge          304
		{
			abyte1[l] = (byte)(abyte1[l] + abyte1[l - samplesPerPixel]);
	//   96  179:aload_2         
	//   97  180:iload           6
	//   98  182:aload_2         
	//   99  183:iload           6
	//  100  185:baload          
	//  101  186:aload_2         
	//  102  187:iload           6
	//  103  189:aload_0         
	//  104  190:getfield        #44  <Field int samplesPerPixel>
	//  105  193:isub            
	//  106  194:baload          
	//  107  195:iadd            
	//  108  196:int2byte        
	//  109  197:bastore         
			l++;
	//  110  198:iload           6
	//  111  200:iconst_1        
	//  112  201:iadd            
	//  113  202:istore          6
		}

	//  114  204:iload           5
	//  115  206:iconst_1        
	//  116  207:iadd            
	//  117  208:istore          5
	//* 118  210:goto            165
	//* 119  213:aload_0         
	//* 120  214:aload_0         
	//* 121  215:getfield        #49  <Field byte[][] stringTable>
	//* 122  218:iload           4
	//* 123  220:aaload          
	//* 124  221:invokevirtual   #95  <Method void writeString(byte[])>
	//* 125  224:goto            77
	//* 126  227:iload           5
	//* 127  229:aload_0         
	//* 128  230:getfield        #51  <Field int tableIndex>
	//* 129  233:icmpge          270
	//* 130  236:aload_0         
	//* 131  237:getfield        #49  <Field byte[][] stringTable>
	//* 132  240:iload           5
	//* 133  242:aaload          
	//* 134  243:astore_1        
	//* 135  244:aload_0         
	//* 136  245:aload_1         
	//* 137  246:invokevirtual   #95  <Method void writeString(byte[])>
	//* 138  249:aload_0         
	//* 139  250:aload_0         
	//* 140  251:getfield        #49  <Field byte[][] stringTable>
	//* 141  254:iload           4
	//* 142  256:aaload          
	//* 143  257:aload_1         
	//* 144  258:iconst_0        
	//* 145  259:baload          
	//* 146  260:invokevirtual   #97  <Method void addStringToTable(byte[], byte)>
	//* 147  263:iload           5
	//* 148  265:istore          4
	//* 149  267:goto            77
	//* 150  270:aload_0         
	//* 151  271:getfield        #49  <Field byte[][] stringTable>
	//* 152  274:iload           4
	//* 153  276:aaload          
	//* 154  277:astore_1        
	//* 155  278:aload_0         
	//* 156  279:aload_1         
	//* 157  280:aload_1         
	//* 158  281:iconst_0        
	//* 159  282:baload          
	//* 160  283:invokevirtual   #99  <Method byte[] composeString(byte[], byte)>
	//* 161  286:astore_1        
	//* 162  287:aload_0         
	//* 163  288:aload_1         
	//* 164  289:invokevirtual   #95  <Method void writeString(byte[])>
	//* 165  292:aload_0         
	//* 166  293:aload_1         
	//* 167  294:invokevirtual   #101 <Method void addStringToTable(byte[])>
	//* 168  297:iload           5
	//* 169  299:istore          4
	//* 170  301:goto            77
		j++;
	//  171  304:iload           4
	//  172  306:iconst_1        
	//  173  307:iadd            
	//  174  308:istore          4
		continue; /* Loop/switch isn't completed */
	//  175  310:goto            137
_L5:
		writeString(stringTable[j]);
		continue; /* Loop/switch isn't completed */
_L4:
		if(k < tableIndex)
		{
			abyte0 = stringTable[k];
			writeString(abyte0);
			addStringToTable(stringTable[j], abyte0[0]);
			j = k;
		} else
		{
			abyte0 = stringTable[j];
			abyte0 = composeString(abyte0, abyte0[0]);
			writeString(abyte0);
			addStringToTable(abyte0);
			j = k;
		}
		continue; /* Loop/switch isn't completed */
		if(true) goto _L8; else goto _L7
_L7:
		return abyte1;
	//  176  313:aload_2         
	//  177  314:areturn         
		if(true) goto _L10; else goto _L9
_L9:
	}

	public int getNextCode()
	{
		int i;
		int j;
		int k;
		int l;
		try
		{
			i = nextData;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int nextData>
	//    2    4:istore_1        
			byte abyte0[] = data;
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field byte[] data>
	//    5    9:astore          5
			j = bytePointer;
	//    6   11:aload_0         
	//    7   12:getfield        #84  <Field int bytePointer>
	//    8   15:istore_2        
			bytePointer = j + 1;
	//    9   16:aload_0         
	//   10   17:iload_2         
	//   11   18:iconst_1        
	//   12   19:iadd            
	//   13   20:putfield        #84  <Field int bytePointer>
			nextData = i << 8 | abyte0[j] & 0xff;
	//   14   23:aload_0         
	//   15   24:iload_1         
	//   16   25:bipush          8
	//   17   27:ishl            
	//   18   28:aload           5
	//   19   30:iload_2         
	//   20   31:baload          
	//   21   32:sipush          255
	//   22   35:iand            
	//   23   36:ior             
	//   24   37:putfield        #34  <Field int nextData>
			nextBits = nextBits + 8;
	//   25   40:aload_0         
	//   26   41:aload_0         
	//   27   42:getfield        #36  <Field int nextBits>
	//   28   45:bipush          8
	//   29   47:iadd            
	//   30   48:putfield        #36  <Field int nextBits>
			if(nextBits < bitsToGet)
	//*  31   51:aload_0         
	//*  32   52:getfield        #36  <Field int nextBits>
	//*  33   55:aload_0         
	//*  34   56:getfield        #32  <Field int bitsToGet>
	//*  35   59:icmpge          113
			{
				i = nextData;
	//   36   62:aload_0         
	//   37   63:getfield        #34  <Field int nextData>
	//   38   66:istore_1        
				byte abyte1[] = data;
	//   39   67:aload_0         
	//   40   68:getfield        #30  <Field byte[] data>
	//   41   71:astore          5
				j = bytePointer;
	//   42   73:aload_0         
	//   43   74:getfield        #84  <Field int bytePointer>
	//   44   77:istore_2        
				bytePointer = j + 1;
	//   45   78:aload_0         
	//   46   79:iload_2         
	//   47   80:iconst_1        
	//   48   81:iadd            
	//   49   82:putfield        #84  <Field int bytePointer>
				nextData = i << 8 | abyte1[j] & 0xff;
	//   50   85:aload_0         
	//   51   86:iload_1         
	//   52   87:bipush          8
	//   53   89:ishl            
	//   54   90:aload           5
	//   55   92:iload_2         
	//   56   93:baload          
	//   57   94:sipush          255
	//   58   97:iand            
	//   59   98:ior             
	//   60   99:putfield        #34  <Field int nextData>
				nextBits = nextBits + 8;
	//   61  102:aload_0         
	//   62  103:aload_0         
	//   63  104:getfield        #36  <Field int nextBits>
	//   64  107:bipush          8
	//   65  109:iadd            
	//   66  110:putfield        #36  <Field int nextBits>
			}
			i = nextData;
	//   67  113:aload_0         
	//   68  114:getfield        #34  <Field int nextData>
	//   69  117:istore_1        
			j = nextBits;
	//   70  118:aload_0         
	//   71  119:getfield        #36  <Field int nextBits>
	//   72  122:istore_2        
			k = bitsToGet;
	//   73  123:aload_0         
	//   74  124:getfield        #32  <Field int bitsToGet>
	//   75  127:istore_3        
			l = andTable[bitsToGet - 9];
	//   76  128:aload_0         
	//   77  129:getfield        #38  <Field int[] andTable>
	//   78  132:aload_0         
	//   79  133:getfield        #32  <Field int bitsToGet>
	//   80  136:bipush          9
	//   81  138:isub            
	//   82  139:iaload          
	//   83  140:istore          4
			nextBits = nextBits - bitsToGet;
	//   84  142:aload_0         
	//   85  143:aload_0         
	//   86  144:getfield        #36  <Field int nextBits>
	//   87  147:aload_0         
	//   88  148:getfield        #32  <Field int bitsToGet>
	//   89  151:isub            
	//   90  152:putfield        #36  <Field int nextBits>
		}
	//*  91  155:iload_1         
	//*  92  156:iload_2         
	//*  93  157:iload_3         
	//*  94  158:isub            
	//*  95  159:ishr            
	//*  96  160:iload           4
	//*  97  162:iand            
	//*  98  163:ireturn         
		catch(ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
	//*  99  164:astore          5
		{
			return 257;
	//  100  166:sipush          257
	//  101  169:ireturn         
		}
		return i >> j - k & l;
	}

	public void initializeStringTable()
	{
		stringTable = new byte[4096][];
	//    0    0:aload_0         
	//    1    1:sipush          4096
	//    2    4:anewarray       byte[][]
	//    3    7:putfield        #49  <Field byte[][] stringTable>
		for(int i = 0; i < 256; i++)
	//*   4   10:iconst_0        
	//*   5   11:istore_1        
	//*   6   12:iload_1         
	//*   7   13:sipush          256
	//*   8   16:icmpge          45
		{
			stringTable[i] = new byte[1];
	//    9   19:aload_0         
	//   10   20:getfield        #49  <Field byte[][] stringTable>
	//   11   23:iload_1         
	//   12   24:iconst_1        
	//   13   25:newarray        byte[]
	//   14   27:aastore         
			stringTable[i][0] = (byte)i;
	//   15   28:aload_0         
	//   16   29:getfield        #49  <Field byte[][] stringTable>
	//   17   32:iload_1         
	//   18   33:aaload          
	//   19   34:iconst_0        
	//   20   35:iload_1         
	//   21   36:int2byte        
	//   22   37:bastore         
		}

	//   23   38:iload_1         
	//   24   39:iconst_1        
	//   25   40:iadd            
	//   26   41:istore_1        
	//*  27   42:goto            12
		tableIndex = 258;
	//   28   45:aload_0         
	//   29   46:sipush          258
	//   30   49:putfield        #51  <Field int tableIndex>
		bitsToGet = 9;
	//   31   52:aload_0         
	//   32   53:bipush          9
	//   33   55:putfield        #32  <Field int bitsToGet>
	//   34   58:return          
	}

	public void writeString(byte abyte0[])
	{
		int j = uncompData.length - dstIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field byte[] uncompData>
	//    2    4:arraylength     
	//    3    5:aload_0         
	//    4    6:getfield        #88  <Field int dstIndex>
	//    5    9:isub            
	//    6   10:istore_3        
		int i = j;
	//    7   11:iload_3         
	//    8   12:istore_2        
		if(abyte0.length < j)
	//*   9   13:aload_1         
	//*  10   14:arraylength     
	//*  11   15:iload_3         
	//*  12   16:icmpge          22
			i = abyte0.length;
	//   13   19:aload_1         
	//   14   20:arraylength     
	//   15   21:istore_2        
		System.arraycopy(((Object) (abyte0)), 0, ((Object) (uncompData)), dstIndex, i);
	//   16   22:aload_1         
	//   17   23:iconst_0        
	//   18   24:aload_0         
	//   19   25:getfield        #82  <Field byte[] uncompData>
	//   20   28:aload_0         
	//   21   29:getfield        #88  <Field int dstIndex>
	//   22   32:iload_2         
	//   23   33:invokestatic    #58  <Method void System.arraycopy(Object, int, Object, int, int)>
		dstIndex = dstIndex + i;
	//   24   36:aload_0         
	//   25   37:aload_0         
	//   26   38:getfield        #88  <Field int dstIndex>
	//   27   41:iload_2         
	//   28   42:iadd            
	//   29   43:putfield        #88  <Field int dstIndex>
	//   30   46:return          
	}

	int andTable[] = {
		511, 1023, 2047, 4095
	};
	int bitPointer;
	int bitsToGet;
	int bytePointer;
	byte data[];
	int dstIndex;
	int h;
	int nextBits;
	int nextData;
	int predictor;
	int samplesPerPixel;
	byte stringTable[][];
	int tableIndex;
	byte uncompData[];
	int w;
}
