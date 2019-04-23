// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.util;


// Referenced classes of package com.google.android.exoplayer.util:
//			Assertions

public final class ParsableBitArray
{

	public ParsableBitArray()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public ParsableBitArray(byte abyte0[])
	{
		this(abyte0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:arraylength     
	//    4    4:invokespecial   #19  <Method void ParsableBitArray(byte[], int)>
	//    5    7:return          
	}

	public ParsableBitArray(byte abyte0[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		data = abyte0;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field byte[] data>
		byteLimit = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #23  <Field int byteLimit>
	//    8   14:return          
	}

	private void assertValidOffset()
	{
		boolean flag;
label0:
		{
			int i = byteOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int byteOffset>
	//    2    4:istore_1        
			if(i >= 0)
	//*   3    5:iload_1         
	//*   4    6:iflt            49
			{
				int j = bitOffset;
	//    5    9:aload_0         
	//    6   10:getfield        #28  <Field int bitOffset>
	//    7   13:istore_2        
				if(j >= 0 && j < 8)
	//*   8   14:iload_2         
	//*   9   15:iflt            49
	//*  10   18:iload_2         
	//*  11   19:bipush          8
	//*  12   21:icmpge          49
				{
					int k = byteLimit;
	//   13   24:aload_0         
	//   14   25:getfield        #23  <Field int byteLimit>
	//   15   28:istore_3        
					if(i < k || i == k && j == 0)
	//*  16   29:iload_1         
	//*  17   30:iload_3         
	//*  18   31:icmplt          43
	//*  19   34:iload_1         
	//*  20   35:iload_3         
	//*  21   36:icmpne          49
	//*  22   39:iload_2         
	//*  23   40:ifne            49
					{
						flag = true;
	//   24   43:iconst_1        
	//   25   44:istore          4
						break label0;
	//   26   46:goto            52
					}
				}
			}
			flag = false;
	//   27   49:iconst_0        
	//   28   50:istore          4
		}
		Assertions.checkState(flag);
	//   29   52:iload           4
	//   30   54:invokestatic    #34  <Method void Assertions.checkState(boolean)>
	//   31   57:return          
	}

	private int readExpGolombCodeNum()
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int i;
		for(i = 0; !readBit(); i++);
	//    2    2:iconst_0        
	//    3    3:istore_1        
	//    4    4:aload_0         
	//    5    5:invokevirtual   #40  <Method boolean readBit()>
	//    6    8:ifne            18
	//    7   11:iload_1         
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:istore_1        
	//*  11   15:goto            4
		if(i > 0)
	//*  12   18:iload_1         
	//*  13   19:ifle            28
			j = readBits(i);
	//   14   22:aload_0         
	//   15   23:iload_1         
	//   16   24:invokevirtual   #44  <Method int readBits(int)>
	//   17   27:istore_2        
		return ((1 << i) - 1) + j;
	//   18   28:iconst_1        
	//   19   29:iload_1         
	//   20   30:ishl            
	//   21   31:iconst_1        
	//   22   32:isub            
	//   23   33:iload_2         
	//   24   34:iadd            
	//   25   35:ireturn         
	}

	public int bitsLeft()
	{
		return (byteLimit - byteOffset) * 8 - bitOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int byteLimit>
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field int byteOffset>
	//    4    8:isub            
	//    5    9:bipush          8
	//    6   11:imul            
	//    7   12:aload_0         
	//    8   13:getfield        #28  <Field int bitOffset>
	//    9   16:isub            
	//   10   17:ireturn         
	}

	public boolean canReadExpGolombCodedNum()
	{
		int j = byteOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int byteOffset>
	//    2    4:istore_3        
		int k = bitOffset;
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field int bitOffset>
	//    5    9:istore          4
		boolean flag2 = false;
	//    6   11:iconst_0        
	//    7   12:istore          6
		int i;
		for(i = 0; byteOffset < byteLimit && !readBit(); i++);
	//    8   14:iconst_0        
	//    9   15:istore_1        
	//   10   16:aload_0         
	//   11   17:getfield        #26  <Field int byteOffset>
	//   12   20:aload_0         
	//   13   21:getfield        #23  <Field int byteLimit>
	//   14   24:icmpge          41
	//   15   27:aload_0         
	//   16   28:invokevirtual   #40  <Method boolean readBit()>
	//   17   31:ifne            41
	//   18   34:iload_1         
	//   19   35:iconst_1        
	//   20   36:iadd            
	//   21   37:istore_1        
	//*  22   38:goto            16
		boolean flag;
		if(byteOffset == byteLimit)
	//*  23   41:aload_0         
	//*  24   42:getfield        #26  <Field int byteOffset>
	//*  25   45:aload_0         
	//*  26   46:getfield        #23  <Field int byteLimit>
	//*  27   49:icmpne          57
			flag = true;
	//   28   52:iconst_1        
	//   29   53:istore_2        
		else
	//*  30   54:goto            59
			flag = false;
	//   31   57:iconst_0        
	//   32   58:istore_2        
		byteOffset = j;
	//   33   59:aload_0         
	//   34   60:iload_3         
	//   35   61:putfield        #26  <Field int byteOffset>
		bitOffset = k;
	//   36   64:aload_0         
	//   37   65:iload           4
	//   38   67:putfield        #28  <Field int bitOffset>
		boolean flag1 = flag2;
	//   39   70:iload           6
	//   40   72:istore          5
		if(!flag)
	//*  41   74:iload_2         
	//*  42   75:ifne            97
		{
			flag1 = flag2;
	//   43   78:iload           6
	//   44   80:istore          5
			if(bitsLeft() >= i * 2 + 1)
	//*  45   82:aload_0         
	//*  46   83:invokevirtual   #48  <Method int bitsLeft()>
	//*  47   86:iload_1         
	//*  48   87:iconst_2        
	//*  49   88:imul            
	//*  50   89:iconst_1        
	//*  51   90:iadd            
	//*  52   91:icmplt          97
				flag1 = true;
	//   53   94:iconst_1        
	//   54   95:istore          5
		}
		return flag1;
	//   55   97:iload           5
	//   56   99:ireturn         
	}

	public int getPosition()
	{
		return byteOffset * 8 + bitOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int byteOffset>
	//    2    4:bipush          8
	//    3    6:imul            
	//    4    7:aload_0         
	//    5    8:getfield        #28  <Field int bitOffset>
	//    6   11:iadd            
	//    7   12:ireturn         
	}

	public boolean readBit()
	{
		return readBits(1) == 1;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #44  <Method int readBits(int)>
	//    3    5:iconst_1        
	//    4    6:icmpne          11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public int readBits(int i)
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(i == 0)
	//*   2    2:iload_1         
	//*   3    3:ifne            8
			return 0;
	//    4    6:iconst_0        
	//    5    7:ireturn         
		int k1 = i / 8;
	//    6    8:iload_1         
	//    7    9:bipush          8
	//    8   11:idiv            
	//    9   12:istore          5
		boolean flag = false;
	//   10   14:iconst_0        
	//   11   15:istore          4
		int j = i;
	//   12   17:iload_1         
	//   13   18:istore_2        
		i = ((int) (flag));
	//   14   19:iload           4
	//   15   21:istore_1        
		for(; k < k1; k++)
	//*  16   22:iload_3         
	//*  17   23:iload           5
	//*  18   25:icmpge          134
		{
			int l = bitOffset;
	//   19   28:aload_0         
	//   20   29:getfield        #28  <Field int bitOffset>
	//   21   32:istore          4
			if(l != 0)
	//*  22   34:iload           4
	//*  23   36:ifeq            90
			{
				byte abyte0[] = data;
	//   24   39:aload_0         
	//   25   40:getfield        #21  <Field byte[] data>
	//   26   43:astore          8
				int l1 = byteOffset;
	//   27   45:aload_0         
	//   28   46:getfield        #26  <Field int byteOffset>
	//   29   49:istore          6
				byte byte3 = abyte0[l1];
	//   30   51:aload           8
	//   31   53:iload           6
	//   32   55:baload          
	//   33   56:istore          7
				l = (abyte0[l1 + 1] & 0xff) >>> 8 - l | (byte3 & 0xff) << l;
	//   34   58:aload           8
	//   35   60:iload           6
	//   36   62:iconst_1        
	//   37   63:iadd            
	//   38   64:baload          
	//   39   65:sipush          255
	//   40   68:iand            
	//   41   69:bipush          8
	//   42   71:iload           4
	//   43   73:isub            
	//   44   74:iushr           
	//   45   75:iload           7
	//   46   77:sipush          255
	//   47   80:iand            
	//   48   81:iload           4
	//   49   83:ishl            
	//   50   84:ior             
	//   51   85:istore          4
			} else
	//*  52   87:goto            101
			{
				l = ((int) (data[byteOffset]));
	//   53   90:aload_0         
	//   54   91:getfield        #21  <Field byte[] data>
	//   55   94:aload_0         
	//   56   95:getfield        #26  <Field int byteOffset>
	//   57   98:baload          
	//   58   99:istore          4
			}
			j -= 8;
	//   59  101:iload_2         
	//   60  102:bipush          8
	//   61  104:isub            
	//   62  105:istore_2        
			i |= (0xff & l) << j;
	//   63  106:iload_1         
	//   64  107:sipush          255
	//   65  110:iload           4
	//   66  112:iand            
	//   67  113:iload_2         
	//   68  114:ishl            
	//   69  115:ior             
	//   70  116:istore_1        
			byteOffset = byteOffset + 1;
	//   71  117:aload_0         
	//   72  118:aload_0         
	//   73  119:getfield        #26  <Field int byteOffset>
	//   74  122:iconst_1        
	//   75  123:iadd            
	//   76  124:putfield        #26  <Field int byteOffset>
		}

	//   77  127:iload_3         
	//   78  128:iconst_1        
	//   79  129:iadd            
	//   80  130:istore_3        
	//*  81  131:goto            22
		k = i;
	//   82  134:iload_1         
	//   83  135:istore_3        
		if(j > 0)
	//*  84  136:iload_2         
	//*  85  137:ifle            289
		{
			k = bitOffset + j;
	//   86  140:aload_0         
	//   87  141:getfield        #28  <Field int bitOffset>
	//   88  144:iload_2         
	//   89  145:iadd            
	//   90  146:istore_3        
			j = ((int) ((byte)(255 >> 8 - j)));
	//   91  147:sipush          255
	//   92  150:bipush          8
	//   93  152:iload_2         
	//   94  153:isub            
	//   95  154:ishr            
	//   96  155:int2byte        
	//   97  156:istore_2        
			if(k > 8)
	//*  98  157:iload_3         
	//*  99  158:bipush          8
	//* 100  160:icmple          230
			{
				byte abyte1[] = data;
	//  101  163:aload_0         
	//  102  164:getfield        #21  <Field byte[] data>
	//  103  167:astore          8
				int i1 = byteOffset;
	//  104  169:aload_0         
	//  105  170:getfield        #26  <Field int byteOffset>
	//  106  173:istore          4
				byte byte0 = abyte1[i1];
	//  107  175:aload           8
	//  108  177:iload           4
	//  109  179:baload          
	//  110  180:istore          5
				byte byte2 = abyte1[i1 + 1];
	//  111  182:aload           8
	//  112  184:iload           4
	//  113  186:iconst_1        
	//  114  187:iadd            
	//  115  188:baload          
	//  116  189:istore          6
				byteOffset = i1 + 1;
	//  117  191:aload_0         
	//  118  192:iload           4
	//  119  194:iconst_1        
	//  120  195:iadd            
	//  121  196:putfield        #26  <Field int byteOffset>
				i = j & ((byte2 & 0xff) >> 16 - k | (byte0 & 0xff) << k - 8) | i;
	//  122  199:iload_2         
	//  123  200:iload           6
	//  124  202:sipush          255
	//  125  205:iand            
	//  126  206:bipush          16
	//  127  208:iload_3         
	//  128  209:isub            
	//  129  210:ishr            
	//  130  211:iload           5
	//  131  213:sipush          255
	//  132  216:iand            
	//  133  217:iload_3         
	//  134  218:bipush          8
	//  135  220:isub            
	//  136  221:ishl            
	//  137  222:ior             
	//  138  223:iand            
	//  139  224:iload_1         
	//  140  225:ior             
	//  141  226:istore_1        
			} else
	//* 142  227:goto            279
			{
				byte abyte2[] = data;
	//  143  230:aload_0         
	//  144  231:getfield        #21  <Field byte[] data>
	//  145  234:astore          8
				int j1 = byteOffset;
	//  146  236:aload_0         
	//  147  237:getfield        #26  <Field int byteOffset>
	//  148  240:istore          4
				byte byte1 = abyte2[j1];
	//  149  242:aload           8
	//  150  244:iload           4
	//  151  246:baload          
	//  152  247:istore          5
				if(k == 8)
	//* 153  249:iload_3         
	//* 154  250:bipush          8
	//* 155  252:icmpne          263
					byteOffset = j1 + 1;
	//  156  255:aload_0         
	//  157  256:iload           4
	//  158  258:iconst_1        
	//  159  259:iadd            
	//  160  260:putfield        #26  <Field int byteOffset>
				i = j & (byte1 & 0xff) >> 8 - k | i;
	//  161  263:iload_2         
	//  162  264:iload           5
	//  163  266:sipush          255
	//  164  269:iand            
	//  165  270:bipush          8
	//  166  272:iload_3         
	//  167  273:isub            
	//  168  274:ishr            
	//  169  275:iand            
	//  170  276:iload_1         
	//  171  277:ior             
	//  172  278:istore_1        
			}
			bitOffset = k % 8;
	//  173  279:aload_0         
	//  174  280:iload_3         
	//  175  281:bipush          8
	//  176  283:irem            
	//  177  284:putfield        #28  <Field int bitOffset>
			k = i;
	//  178  287:iload_1         
	//  179  288:istore_3        
		}
		assertValidOffset();
	//  180  289:aload_0         
	//  181  290:invokespecial   #51  <Method void assertValidOffset()>
		return k;
	//  182  293:iload_3         
	//  183  294:ireturn         
	}

	public int readSignedExpGolombCodedInt()
	{
		int i = readExpGolombCodeNum();
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method int readExpGolombCodeNum()>
	//    2    4:istore_2        
		byte byte0;
		if(i % 2 == 0)
	//*   3    5:iload_2         
	//*   4    6:iconst_2        
	//*   5    7:irem            
	//*   6    8:ifne            16
			byte0 = -1;
	//    7   11:iconst_m1       
	//    8   12:istore_1        
		else
	//*   9   13:goto            18
			byte0 = 1;
	//   10   16:iconst_1        
	//   11   17:istore_1        
		return byte0 * ((i + 1) / 2);
	//   12   18:iload_1         
	//   13   19:iload_2         
	//   14   20:iconst_1        
	//   15   21:iadd            
	//   16   22:iconst_2        
	//   17   23:idiv            
	//   18   24:imul            
	//   19   25:ireturn         
	}

	public int readUnsignedExpGolombCodedInt()
	{
		return readExpGolombCodeNum();
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method int readExpGolombCodeNum()>
	//    2    4:ireturn         
	}

	public void reset(byte abyte0[])
	{
		reset(abyte0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:arraylength     
	//    4    4:invokevirtual   #58  <Method void reset(byte[], int)>
	//    5    7:return          
	}

	public void reset(byte abyte0[], int i)
	{
		data = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field byte[] data>
		byteOffset = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #26  <Field int byteOffset>
		bitOffset = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #28  <Field int bitOffset>
		byteLimit = i;
	//    9   15:aload_0         
	//   10   16:iload_2         
	//   11   17:putfield        #23  <Field int byteLimit>
	//   12   20:return          
	}

	public void setPosition(int i)
	{
		byteOffset = i / 8;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:bipush          8
	//    3    4:idiv            
	//    4    5:putfield        #26  <Field int byteOffset>
		bitOffset = i - byteOffset * 8;
	//    5    8:aload_0         
	//    6    9:iload_1         
	//    7   10:aload_0         
	//    8   11:getfield        #26  <Field int byteOffset>
	//    9   14:bipush          8
	//   10   16:imul            
	//   11   17:isub            
	//   12   18:putfield        #28  <Field int bitOffset>
		assertValidOffset();
	//   13   21:aload_0         
	//   14   22:invokespecial   #51  <Method void assertValidOffset()>
	//   15   25:return          
	}

	public void skipBits(int i)
	{
		byteOffset = byteOffset + i / 8;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #26  <Field int byteOffset>
	//    3    5:iload_1         
	//    4    6:bipush          8
	//    5    8:idiv            
	//    6    9:iadd            
	//    7   10:putfield        #26  <Field int byteOffset>
		bitOffset = bitOffset + i % 8;
	//    8   13:aload_0         
	//    9   14:aload_0         
	//   10   15:getfield        #28  <Field int bitOffset>
	//   11   18:iload_1         
	//   12   19:bipush          8
	//   13   21:irem            
	//   14   22:iadd            
	//   15   23:putfield        #28  <Field int bitOffset>
		i = bitOffset;
	//   16   26:aload_0         
	//   17   27:getfield        #28  <Field int bitOffset>
	//   18   30:istore_1        
		if(i > 7)
	//*  19   31:iload_1         
	//*  20   32:bipush          7
	//*  21   34:icmple          55
		{
			byteOffset = byteOffset + 1;
	//   22   37:aload_0         
	//   23   38:aload_0         
	//   24   39:getfield        #26  <Field int byteOffset>
	//   25   42:iconst_1        
	//   26   43:iadd            
	//   27   44:putfield        #26  <Field int byteOffset>
			bitOffset = i - 8;
	//   28   47:aload_0         
	//   29   48:iload_1         
	//   30   49:bipush          8
	//   31   51:isub            
	//   32   52:putfield        #28  <Field int bitOffset>
		}
		assertValidOffset();
	//   33   55:aload_0         
	//   34   56:invokespecial   #51  <Method void assertValidOffset()>
	//   35   59:return          
	}

	private int bitOffset;
	private int byteLimit;
	private int byteOffset;
	public byte data[];
}
