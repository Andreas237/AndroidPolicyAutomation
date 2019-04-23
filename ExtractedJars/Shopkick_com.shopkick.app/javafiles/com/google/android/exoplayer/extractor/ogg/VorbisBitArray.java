// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.ogg;

import com.google.android.exoplayer.util.Assertions;

final class VorbisBitArray
{

	public VorbisBitArray(byte abyte0[])
	{
		this(abyte0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:arraylength     
	//    4    4:invokespecial   #15  <Method void VorbisBitArray(byte[], int)>
	//    5    7:return          
	}

	public VorbisBitArray(byte abyte0[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		data = abyte0;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field byte[] data>
		limit = i * 8;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:bipush          8
	//    8   13:imul            
	//    9   14:putfield        #23  <Field int limit>
	//   10   17:return          
	}

	public int bitsLeft()
	{
		return limit - getPosition();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int limit>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #28  <Method int getPosition()>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	public int getPosition()
	{
		return byteOffset * 8 + bitOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int byteOffset>
	//    2    4:bipush          8
	//    3    6:imul            
	//    4    7:aload_0         
	//    5    8:getfield        #32  <Field int bitOffset>
	//    6   11:iadd            
	//    7   12:ireturn         
	}

	public int limit()
	{
		return limit;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int limit>
	//    2    4:ireturn         
	}

	public boolean readBit()
	{
		return readBits(1) == 1;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #38  <Method int readBits(int)>
	//    3    5:iconst_1        
	//    4    6:icmpne          11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public int readBits(int i)
	{
		int j = getPosition();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #28  <Method int getPosition()>
	//    2    4:istore_2        
		int k = limit;
	//    3    5:aload_0         
	//    4    6:getfield        #23  <Field int limit>
	//    5    9:istore_3        
		int l1 = 0;
	//    6   10:iconst_0        
	//    7   11:istore          6
		boolean flag;
		if(j + i <= k)
	//*   8   13:iload_2         
	//*   9   14:iload_1         
	//*  10   15:iadd            
	//*  11   16:iload_3         
	//*  12   17:icmpgt          26
			flag = true;
	//   13   20:iconst_1        
	//   14   21:istore          8
		else
	//*  15   23:goto            29
			flag = false;
	//   16   26:iconst_0        
	//   17   27:istore          8
		Assertions.checkState(flag);
	//   18   29:iload           8
	//   19   31:invokestatic    #44  <Method void Assertions.checkState(boolean)>
		if(i == 0)
	//*  20   34:iload_1         
	//*  21   35:ifne            40
			return 0;
	//   22   38:iconst_0        
	//   23   39:ireturn         
		j = bitOffset;
	//   24   40:aload_0         
	//   25   41:getfield        #32  <Field int bitOffset>
	//   26   44:istore_2        
		if(j != 0)
	//*  27   45:iload_2         
	//*  28   46:ifeq            142
		{
			int l = Math.min(i, 8 - j);
	//   29   49:iload_1         
	//   30   50:bipush          8
	//   31   52:iload_2         
	//   32   53:isub            
	//   33   54:invokestatic    #50  <Method int Math.min(int, int)>
	//   34   57:istore          4
			byte abyte0[] = data;
	//   35   59:aload_0         
	//   36   60:getfield        #21  <Field byte[] data>
	//   37   63:astore          11
			int i2 = byteOffset;
	//   38   65:aload_0         
	//   39   66:getfield        #30  <Field int byteOffset>
	//   40   69:istore          7
			k = ((int) (abyte0[i2]));
	//   41   71:aload           11
	//   42   73:iload           7
	//   43   75:baload          
	//   44   76:istore_3        
			j = bitOffset;
	//   45   77:aload_0         
	//   46   78:getfield        #32  <Field int bitOffset>
	//   47   81:istore_2        
			int j1 = 255 >>> 8 - l & k >>> j;
	//   48   82:sipush          255
	//   49   85:bipush          8
	//   50   87:iload           4
	//   51   89:isub            
	//   52   90:iushr           
	//   53   91:iload_3         
	//   54   92:iload_2         
	//   55   93:iushr           
	//   56   94:iand            
	//   57   95:istore          5
			bitOffset = j + l;
	//   58   97:aload_0         
	//   59   98:iload_2         
	//   60   99:iload           4
	//   61  101:iadd            
	//   62  102:putfield        #32  <Field int bitOffset>
			j = l;
	//   63  105:iload           4
	//   64  107:istore_2        
			k = j1;
	//   65  108:iload           5
	//   66  110:istore_3        
			if(bitOffset == 8)
	//*  67  111:aload_0         
	//*  68  112:getfield        #32  <Field int bitOffset>
	//*  69  115:bipush          8
	//*  70  117:icmpne          146
			{
				byteOffset = i2 + 1;
	//   71  120:aload_0         
	//   72  121:iload           7
	//   73  123:iconst_1        
	//   74  124:iadd            
	//   75  125:putfield        #30  <Field int byteOffset>
				bitOffset = 0;
	//   76  128:aload_0         
	//   77  129:iconst_0        
	//   78  130:putfield        #32  <Field int bitOffset>
				j = l;
	//   79  133:iload           4
	//   80  135:istore_2        
				k = j1;
	//   81  136:iload           5
	//   82  138:istore_3        
			}
		} else
	//*  83  139:goto            146
		{
			j = 0;
	//   84  142:iconst_0        
	//   85  143:istore_2        
			k = j;
	//   86  144:iload_2         
	//   87  145:istore_3        
		}
		int j2 = i - j;
	//   88  146:iload_1         
	//   89  147:iload_2         
	//   90  148:isub            
	//   91  149:istore          7
		int k1 = j;
	//   92  151:iload_2         
	//   93  152:istore          5
		int i1 = k;
	//   94  154:iload_3         
	//   95  155:istore          4
		if(j2 > 7)
	//*  96  157:iload           7
	//*  97  159:bipush          7
	//*  98  161:icmple          236
		{
			j2 /= 8;
	//   99  164:iload           7
	//  100  166:bipush          8
	//  101  168:idiv            
	//  102  169:istore          7
			do
			{
				k1 = j;
	//  103  171:iload_2         
	//  104  172:istore          5
				i1 = k;
	//  105  174:iload_3         
	//  106  175:istore          4
				if(l1 >= j2)
					break;
	//  107  177:iload           6
	//  108  179:iload           7
	//  109  181:icmpge          236
				long l2 = k;
	//  110  184:iload_3         
	//  111  185:i2l             
	//  112  186:lstore          9
				byte abyte1[] = data;
	//  113  188:aload_0         
	//  114  189:getfield        #21  <Field byte[] data>
	//  115  192:astore          11
				k = byteOffset;
	//  116  194:aload_0         
	//  117  195:getfield        #30  <Field int byteOffset>
	//  118  198:istore_3        
				byteOffset = k + 1;
	//  119  199:aload_0         
	//  120  200:iload_3         
	//  121  201:iconst_1        
	//  122  202:iadd            
	//  123  203:putfield        #30  <Field int byteOffset>
				k = (int)(l2 | ((long)abyte1[k] & 255L) << j);
	//  124  206:lload           9
	//  125  208:aload           11
	//  126  210:iload_3         
	//  127  211:baload          
	//  128  212:i2l             
	//  129  213:ldc2w           #51  <Long 255L>
	//  130  216:land            
	//  131  217:iload_2         
	//  132  218:lshl            
	//  133  219:lor             
	//  134  220:l2i             
	//  135  221:istore_3        
				j += 8;
	//  136  222:iload_2         
	//  137  223:bipush          8
	//  138  225:iadd            
	//  139  226:istore_2        
				l1++;
	//  140  227:iload           6
	//  141  229:iconst_1        
	//  142  230:iadd            
	//  143  231:istore          6
			} while(true);
	//  144  233:goto            171
		}
		j = i1;
	//  145  236:iload           4
	//  146  238:istore_2        
		if(i > k1)
	//* 147  239:iload_1         
	//* 148  240:iload           5
	//* 149  242:icmple          285
		{
			i -= k1;
	//  150  245:iload_1         
	//  151  246:iload           5
	//  152  248:isub            
	//  153  249:istore_1        
			j = i1 | (255 >>> 8 - i & data[byteOffset]) << k1;
	//  154  250:iload           4
	//  155  252:sipush          255
	//  156  255:bipush          8
	//  157  257:iload_1         
	//  158  258:isub            
	//  159  259:iushr           
	//  160  260:aload_0         
	//  161  261:getfield        #21  <Field byte[] data>
	//  162  264:aload_0         
	//  163  265:getfield        #30  <Field int byteOffset>
	//  164  268:baload          
	//  165  269:iand            
	//  166  270:iload           5
	//  167  272:ishl            
	//  168  273:ior             
	//  169  274:istore_2        
			bitOffset = bitOffset + i;
	//  170  275:aload_0         
	//  171  276:aload_0         
	//  172  277:getfield        #32  <Field int bitOffset>
	//  173  280:iload_1         
	//  174  281:iadd            
	//  175  282:putfield        #32  <Field int bitOffset>
		}
		return j;
	//  176  285:iload_2         
	//  177  286:ireturn         
	}

	public void reset()
	{
		byteOffset = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #30  <Field int byteOffset>
		bitOffset = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #32  <Field int bitOffset>
	//    6   10:return          
	}

	public void setPosition(int i)
	{
		boolean flag;
		if(i < limit && i >= 0)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #23  <Field int limit>
	//*   3    5:icmpge          17
	//*   4    8:iload_1         
	//*   5    9:iflt            17
			flag = true;
	//    6   12:iconst_1        
	//    7   13:istore_2        
		else
	//*   8   14:goto            19
			flag = false;
	//    9   17:iconst_0        
	//   10   18:istore_2        
		Assertions.checkArgument(flag);
	//   11   19:iload_2         
	//   12   20:invokestatic    #58  <Method void Assertions.checkArgument(boolean)>
		byteOffset = i / 8;
	//   13   23:aload_0         
	//   14   24:iload_1         
	//   15   25:bipush          8
	//   16   27:idiv            
	//   17   28:putfield        #30  <Field int byteOffset>
		bitOffset = i - byteOffset * 8;
	//   18   31:aload_0         
	//   19   32:iload_1         
	//   20   33:aload_0         
	//   21   34:getfield        #30  <Field int byteOffset>
	//   22   37:bipush          8
	//   23   39:imul            
	//   24   40:isub            
	//   25   41:putfield        #32  <Field int bitOffset>
	//   26   44:return          
	}

	public void skipBits(int i)
	{
		boolean flag;
		if(getPosition() + i <= limit)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #28  <Method int getPosition()>
	//*   2    4:iload_1         
	//*   3    5:iadd            
	//*   4    6:aload_0         
	//*   5    7:getfield        #23  <Field int limit>
	//*   6   10:icmpgt          18
			flag = true;
	//    7   13:iconst_1        
	//    8   14:istore_2        
		else
	//*   9   15:goto            20
			flag = false;
	//   10   18:iconst_0        
	//   11   19:istore_2        
		Assertions.checkState(flag);
	//   12   20:iload_2         
	//   13   21:invokestatic    #44  <Method void Assertions.checkState(boolean)>
		byteOffset = byteOffset + i / 8;
	//   14   24:aload_0         
	//   15   25:aload_0         
	//   16   26:getfield        #30  <Field int byteOffset>
	//   17   29:iload_1         
	//   18   30:bipush          8
	//   19   32:idiv            
	//   20   33:iadd            
	//   21   34:putfield        #30  <Field int byteOffset>
		bitOffset = bitOffset + i % 8;
	//   22   37:aload_0         
	//   23   38:aload_0         
	//   24   39:getfield        #32  <Field int bitOffset>
	//   25   42:iload_1         
	//   26   43:bipush          8
	//   27   45:irem            
	//   28   46:iadd            
	//   29   47:putfield        #32  <Field int bitOffset>
		i = bitOffset;
	//   30   50:aload_0         
	//   31   51:getfield        #32  <Field int bitOffset>
	//   32   54:istore_1        
		if(i > 7)
	//*  33   55:iload_1         
	//*  34   56:bipush          7
	//*  35   58:icmple          79
		{
			byteOffset = byteOffset + 1;
	//   36   61:aload_0         
	//   37   62:aload_0         
	//   38   63:getfield        #30  <Field int byteOffset>
	//   39   66:iconst_1        
	//   40   67:iadd            
	//   41   68:putfield        #30  <Field int byteOffset>
			bitOffset = i - 8;
	//   42   71:aload_0         
	//   43   72:iload_1         
	//   44   73:bipush          8
	//   45   75:isub            
	//   46   76:putfield        #32  <Field int bitOffset>
		}
	//   47   79:return          
	}

	private int bitOffset;
	private int byteOffset;
	public final byte data[];
	private int limit;
}
