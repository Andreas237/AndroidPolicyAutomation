// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.util;


// Referenced classes of package com.google.android.exoplayer2.util:
//			Assertions

public final class ParsableNalUnitBitArray
{

	public ParsableNalUnitBitArray(byte abyte0[], int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		reset(abyte0, i, j);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:invokevirtual   #18  <Method void reset(byte[], int, int)>
	//    7   11:return          
	}

	private void assertValidOffset()
	{
		boolean flag;
		if(byteOffset >= 0 && (byteOffset < byteLimit || byteOffset == byteLimit && bitOffset == 0))
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field int byteOffset>
	//*   2    4:iflt            41
	//*   3    7:aload_0         
	//*   4    8:getfield        #22  <Field int byteOffset>
	//*   5   11:aload_0         
	//*   6   12:getfield        #24  <Field int byteLimit>
	//*   7   15:icmplt          36
	//*   8   18:aload_0         
	//*   9   19:getfield        #22  <Field int byteOffset>
	//*  10   22:aload_0         
	//*  11   23:getfield        #24  <Field int byteLimit>
	//*  12   26:icmpne          41
	//*  13   29:aload_0         
	//*  14   30:getfield        #26  <Field int bitOffset>
	//*  15   33:ifne            41
			flag = true;
	//   16   36:iconst_1        
	//   17   37:istore_1        
		else
	//*  18   38:goto            43
			flag = false;
	//   19   41:iconst_0        
	//   20   42:istore_1        
		Assertions.checkState(flag);
	//   21   43:iload_1         
	//   22   44:invokestatic    #32  <Method void Assertions.checkState(boolean)>
	//   23   47:return          
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
	//    5    5:invokevirtual   #38  <Method boolean readBit()>
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
	//   16   24:invokevirtual   #42  <Method int readBits(int)>
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

	private boolean shouldSkipByte(int i)
	{
		return 2 <= i && i < byteLimit && data[i] == 3 && data[i - 2] == 0 && data[i - 1] == 0;
	//    0    0:iconst_2        
	//    1    1:iload_1         
	//    2    2:icmpgt          47
	//    3    5:iload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #24  <Field int byteLimit>
	//    6   10:icmpge          47
	//    7   13:aload_0         
	//    8   14:getfield        #46  <Field byte[] data>
	//    9   17:iload_1         
	//   10   18:baload          
	//   11   19:iconst_3        
	//   12   20:icmpne          47
	//   13   23:aload_0         
	//   14   24:getfield        #46  <Field byte[] data>
	//   15   27:iload_1         
	//   16   28:iconst_2        
	//   17   29:isub            
	//   18   30:baload          
	//   19   31:ifne            47
	//   20   34:aload_0         
	//   21   35:getfield        #46  <Field byte[] data>
	//   22   38:iload_1         
	//   23   39:iconst_1        
	//   24   40:isub            
	//   25   41:baload          
	//   26   42:ifne            47
	//   27   45:iconst_1        
	//   28   46:ireturn         
	//   29   47:iconst_0        
	//   30   48:ireturn         
	}

	public boolean canReadBits(int i)
	{
		int l = byteOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int byteOffset>
	//    2    4:istore          4
		int j = i / 8;
	//    3    6:iload_1         
	//    4    7:bipush          8
	//    5    9:idiv            
	//    6   10:istore_2        
		int k = byteOffset + j;
	//    7   11:aload_0         
	//    8   12:getfield        #22  <Field int byteOffset>
	//    9   15:iload_2         
	//   10   16:iadd            
	//   11   17:istore_3        
		int j1 = (bitOffset + i) - j * 8;
	//   12   18:aload_0         
	//   13   19:getfield        #26  <Field int bitOffset>
	//   14   22:iload_1         
	//   15   23:iadd            
	//   16   24:iload_2         
	//   17   25:bipush          8
	//   18   27:imul            
	//   19   28:isub            
	//   20   29:istore          5
		i = k;
	//   21   31:iload_3         
	//   22   32:istore_1        
		j = j1;
	//   23   33:iload           5
	//   24   35:istore_2        
		if(j1 > 7)
	//*  25   36:iload           5
	//*  26   38:bipush          7
	//*  27   40:icmple          53
		{
			i = k + 1;
	//   28   43:iload_3         
	//   29   44:iconst_1        
	//   30   45:iadd            
	//   31   46:istore_1        
			j = j1 - 8;
	//   32   47:iload           5
	//   33   49:bipush          8
	//   34   51:isub            
	//   35   52:istore_2        
		}
		boolean flag = true;
	//   36   53:iconst_1        
	//   37   54:istore          6
		k = i;
	//   38   56:iload_1         
	//   39   57:istore_3        
		i = l;
	//   40   58:iload           4
	//   41   60:istore_1        
		do
		{
			int i1 = i + 1;
	//   42   61:iload_1         
	//   43   62:iconst_1        
	//   44   63:iadd            
	//   45   64:istore          4
			if(i1 > k || k >= byteLimit)
				break;
	//   46   66:iload           4
	//   47   68:iload_3         
	//   48   69:icmpgt          104
	//   49   72:iload_3         
	//   50   73:aload_0         
	//   51   74:getfield        #24  <Field int byteLimit>
	//   52   77:icmpge          104
			i = i1;
	//   53   80:iload           4
	//   54   82:istore_1        
			if(shouldSkipByte(i1))
	//*  55   83:aload_0         
	//*  56   84:iload           4
	//*  57   86:invokespecial   #49  <Method boolean shouldSkipByte(int)>
	//*  58   89:ifeq            61
			{
				k++;
	//   59   92:iload_3         
	//   60   93:iconst_1        
	//   61   94:iadd            
	//   62   95:istore_3        
				i = i1 + 2;
	//   63   96:iload           4
	//   64   98:iconst_2        
	//   65   99:iadd            
	//   66  100:istore_1        
			}
		} while(true);
	//   67  101:goto            61
		if(k >= byteLimit)
	//*  68  104:iload_3         
	//*  69  105:aload_0         
	//*  70  106:getfield        #24  <Field int byteLimit>
	//*  71  109:icmplt          129
		{
			if(k == byteLimit && j == 0)
	//*  72  112:iload_3         
	//*  73  113:aload_0         
	//*  74  114:getfield        #24  <Field int byteLimit>
	//*  75  117:icmpne          126
	//*  76  120:iload_2         
	//*  77  121:ifne            126
				return true;
	//   78  124:iconst_1        
	//   79  125:ireturn         
			flag = false;
	//   80  126:iconst_0        
	//   81  127:istore          6
		}
		return flag;
	//   82  129:iload           6
	//   83  131:ireturn         
	}

	public boolean canReadExpGolombCodedNum()
	{
		int j = byteOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int byteOffset>
	//    2    4:istore_3        
		int k = bitOffset;
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field int bitOffset>
	//    5    9:istore          4
		boolean flag2 = false;
	//    6   11:iconst_0        
	//    7   12:istore          6
		int i;
		for(i = 0; byteOffset < byteLimit && !readBit(); i++);
	//    8   14:iconst_0        
	//    9   15:istore_1        
	//   10   16:aload_0         
	//   11   17:getfield        #22  <Field int byteOffset>
	//   12   20:aload_0         
	//   13   21:getfield        #24  <Field int byteLimit>
	//   14   24:icmpge          41
	//   15   27:aload_0         
	//   16   28:invokevirtual   #38  <Method boolean readBit()>
	//   17   31:ifne            41
	//   18   34:iload_1         
	//   19   35:iconst_1        
	//   20   36:iadd            
	//   21   37:istore_1        
	//*  22   38:goto            16
		boolean flag;
		if(byteOffset == byteLimit)
	//*  23   41:aload_0         
	//*  24   42:getfield        #22  <Field int byteOffset>
	//*  25   45:aload_0         
	//*  26   46:getfield        #24  <Field int byteLimit>
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
	//   35   61:putfield        #22  <Field int byteOffset>
		bitOffset = k;
	//   36   64:aload_0         
	//   37   65:iload           4
	//   38   67:putfield        #26  <Field int bitOffset>
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
			if(canReadBits(i * 2 + 1))
	//*  45   82:aload_0         
	//*  46   83:iload_1         
	//*  47   84:iconst_2        
	//*  48   85:imul            
	//*  49   86:iconst_1        
	//*  50   87:iadd            
	//*  51   88:invokevirtual   #52  <Method boolean canReadBits(int)>
	//*  52   91:ifeq            97
				flag1 = true;
	//   53   94:iconst_1        
	//   54   95:istore          5
		}
		return flag1;
	//   55   97:iload           5
	//   56   99:ireturn         
	}

	public boolean readBit()
	{
		boolean flag;
		if((data[byteOffset] & 128 >> bitOffset) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field byte[] data>
	//*   2    4:aload_0         
	//*   3    5:getfield        #22  <Field int byteOffset>
	//*   4    8:baload          
	//*   5    9:sipush          128
	//*   6   12:aload_0         
	//*   7   13:getfield        #26  <Field int bitOffset>
	//*   8   16:ishr            
	//*   9   17:iand            
	//*  10   18:ifeq            26
			flag = true;
	//   11   21:iconst_1        
	//   12   22:istore_1        
		else
	//*  13   23:goto            28
			flag = false;
	//   14   26:iconst_0        
	//   15   27:istore_1        
		skipBit();
	//   16   28:aload_0         
	//   17   29:invokevirtual   #55  <Method void skipBit()>
		return flag;
	//   18   32:iload_1         
	//   19   33:ireturn         
	}

	public int readBits(int i)
	{
		bitOffset = bitOffset + i;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #26  <Field int bitOffset>
	//    3    5:iload_1         
	//    4    6:iadd            
	//    5    7:putfield        #26  <Field int bitOffset>
		int j = 0;
	//    6   10:iconst_0        
	//    7   11:istore_2        
		byte byte0;
		do
		{
			int k = bitOffset;
	//    8   12:aload_0         
	//    9   13:getfield        #26  <Field int bitOffset>
	//   10   16:istore          4
			byte0 = 2;
	//   11   18:iconst_2        
	//   12   19:istore_3        
			if(k <= 8)
				break;
	//   13   20:iload           4
	//   14   22:bipush          8
	//   15   24:icmple          94
			bitOffset = bitOffset - 8;
	//   16   27:aload_0         
	//   17   28:aload_0         
	//   18   29:getfield        #26  <Field int bitOffset>
	//   19   32:bipush          8
	//   20   34:isub            
	//   21   35:putfield        #26  <Field int bitOffset>
			j |= (data[byteOffset] & 0xff) << bitOffset;
	//   22   38:iload_2         
	//   23   39:aload_0         
	//   24   40:getfield        #46  <Field byte[] data>
	//   25   43:aload_0         
	//   26   44:getfield        #22  <Field int byteOffset>
	//   27   47:baload          
	//   28   48:sipush          255
	//   29   51:iand            
	//   30   52:aload_0         
	//   31   53:getfield        #26  <Field int bitOffset>
	//   32   56:ishl            
	//   33   57:ior             
	//   34   58:istore_2        
			k = byteOffset;
	//   35   59:aload_0         
	//   36   60:getfield        #22  <Field int byteOffset>
	//   37   63:istore          4
			if(!shouldSkipByte(byteOffset + 1))
	//*  38   65:aload_0         
	//*  39   66:aload_0         
	//*  40   67:getfield        #22  <Field int byteOffset>
	//*  41   70:iconst_1        
	//*  42   71:iadd            
	//*  43   72:invokespecial   #49  <Method boolean shouldSkipByte(int)>
	//*  44   75:ifeq            81
	//*  45   78:goto            83
				byte0 = 1;
	//   46   81:iconst_1        
	//   47   82:istore_3        
			byteOffset = k + byte0;
	//   48   83:aload_0         
	//   49   84:iload           4
	//   50   86:iload_3         
	//   51   87:iadd            
	//   52   88:putfield        #22  <Field int byteOffset>
		} while(true);
	//   53   91:goto            12
		byte byte1 = data[byteOffset];
	//   54   94:aload_0         
	//   55   95:getfield        #46  <Field byte[] data>
	//   56   98:aload_0         
	//   57   99:getfield        #22  <Field int byteOffset>
	//   58  102:baload          
	//   59  103:istore          4
		int l = bitOffset;
	//   60  105:aload_0         
	//   61  106:getfield        #26  <Field int bitOffset>
	//   62  109:istore          5
		if(bitOffset == 8)
	//*  63  111:aload_0         
	//*  64  112:getfield        #26  <Field int bitOffset>
	//*  65  115:bipush          8
	//*  66  117:icmpne          157
		{
			bitOffset = 0;
	//   67  120:aload_0         
	//   68  121:iconst_0        
	//   69  122:putfield        #26  <Field int bitOffset>
			int i1 = byteOffset;
	//   70  125:aload_0         
	//   71  126:getfield        #22  <Field int byteOffset>
	//   72  129:istore          6
			if(!shouldSkipByte(byteOffset + 1))
	//*  73  131:aload_0         
	//*  74  132:aload_0         
	//*  75  133:getfield        #22  <Field int byteOffset>
	//*  76  136:iconst_1        
	//*  77  137:iadd            
	//*  78  138:invokespecial   #49  <Method boolean shouldSkipByte(int)>
	//*  79  141:ifeq            147
	//*  80  144:goto            149
				byte0 = 1;
	//   81  147:iconst_1        
	//   82  148:istore_3        
			byteOffset = i1 + byte0;
	//   83  149:aload_0         
	//   84  150:iload           6
	//   85  152:iload_3         
	//   86  153:iadd            
	//   87  154:putfield        #22  <Field int byteOffset>
		}
		assertValidOffset();
	//   88  157:aload_0         
	//   89  158:invokespecial   #57  <Method void assertValidOffset()>
		return -1 >>> 32 - i & (j | (byte1 & 0xff) >> 8 - l);
	//   90  161:iconst_m1       
	//   91  162:bipush          32
	//   92  164:iload_1         
	//   93  165:isub            
	//   94  166:iushr           
	//   95  167:iload_2         
	//   96  168:iload           4
	//   97  170:sipush          255
	//   98  173:iand            
	//   99  174:bipush          8
	//  100  176:iload           5
	//  101  178:isub            
	//  102  179:ishr            
	//  103  180:ior             
	//  104  181:iand            
	//  105  182:ireturn         
	}

	public int readSignedExpGolombCodedInt()
	{
		int i = readExpGolombCodeNum();
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method int readExpGolombCodeNum()>
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
	//    1    1:invokespecial   #60  <Method int readExpGolombCodeNum()>
	//    2    4:ireturn         
	}

	public void reset(byte abyte0[], int i, int j)
	{
		data = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #46  <Field byte[] data>
		byteOffset = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #22  <Field int byteOffset>
		byteLimit = j;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #24  <Field int byteLimit>
		bitOffset = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #26  <Field int bitOffset>
		assertValidOffset();
	//   12   20:aload_0         
	//   13   21:invokespecial   #57  <Method void assertValidOffset()>
	//   14   24:return          
	}

	public void skipBit()
	{
		int i = bitOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int bitOffset>
	//    2    4:istore_2        
		byte byte0 = 1;
	//    3    5:iconst_1        
	//    4    6:istore_1        
		i++;
	//    5    7:iload_2         
	//    6    8:iconst_1        
	//    7    9:iadd            
	//    8   10:istore_2        
		bitOffset = i;
	//    9   11:aload_0         
	//   10   12:iload_2         
	//   11   13:putfield        #26  <Field int bitOffset>
		if(i == 8)
	//*  12   16:iload_2         
	//*  13   17:bipush          8
	//*  14   19:icmpne          54
		{
			bitOffset = 0;
	//   15   22:aload_0         
	//   16   23:iconst_0        
	//   17   24:putfield        #26  <Field int bitOffset>
			int j = byteOffset;
	//   18   27:aload_0         
	//   19   28:getfield        #22  <Field int byteOffset>
	//   20   31:istore_2        
			if(shouldSkipByte(byteOffset + 1))
	//*  21   32:aload_0         
	//*  22   33:aload_0         
	//*  23   34:getfield        #22  <Field int byteOffset>
	//*  24   37:iconst_1        
	//*  25   38:iadd            
	//*  26   39:invokespecial   #49  <Method boolean shouldSkipByte(int)>
	//*  27   42:ifeq            47
				byte0 = 2;
	//   28   45:iconst_2        
	//   29   46:istore_1        
			byteOffset = j + byte0;
	//   30   47:aload_0         
	//   31   48:iload_2         
	//   32   49:iload_1         
	//   33   50:iadd            
	//   34   51:putfield        #22  <Field int byteOffset>
		}
		assertValidOffset();
	//   35   54:aload_0         
	//   36   55:invokespecial   #57  <Method void assertValidOffset()>
	//   37   58:return          
	}

	public void skipBits(int i)
	{
		int j = byteOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int byteOffset>
	//    2    4:istore_2        
		int l = i / 8;
	//    3    5:iload_1         
	//    4    6:bipush          8
	//    5    8:idiv            
	//    6    9:istore_3        
		byteOffset = byteOffset + l;
	//    7   10:aload_0         
	//    8   11:aload_0         
	//    9   12:getfield        #22  <Field int byteOffset>
	//   10   15:iload_3         
	//   11   16:iadd            
	//   12   17:putfield        #22  <Field int byteOffset>
		bitOffset = bitOffset + (i - l * 8);
	//   13   20:aload_0         
	//   14   21:aload_0         
	//   15   22:getfield        #26  <Field int bitOffset>
	//   16   25:iload_1         
	//   17   26:iload_3         
	//   18   27:bipush          8
	//   19   29:imul            
	//   20   30:isub            
	//   21   31:iadd            
	//   22   32:putfield        #26  <Field int bitOffset>
		i = j;
	//   23   35:iload_2         
	//   24   36:istore_1        
		if(bitOffset > 7)
	//*  25   37:aload_0         
	//*  26   38:getfield        #26  <Field int bitOffset>
	//*  27   41:bipush          7
	//*  28   43:icmple          69
		{
			byteOffset = byteOffset + 1;
	//   29   46:aload_0         
	//   30   47:aload_0         
	//   31   48:getfield        #22  <Field int byteOffset>
	//   32   51:iconst_1        
	//   33   52:iadd            
	//   34   53:putfield        #22  <Field int byteOffset>
			bitOffset = bitOffset - 8;
	//   35   56:aload_0         
	//   36   57:aload_0         
	//   37   58:getfield        #26  <Field int bitOffset>
	//   38   61:bipush          8
	//   39   63:isub            
	//   40   64:putfield        #26  <Field int bitOffset>
			i = j;
	//   41   67:iload_2         
	//   42   68:istore_1        
		}
		do
		{
			int k = i + 1;
	//   43   69:iload_1         
	//   44   70:iconst_1        
	//   45   71:iadd            
	//   46   72:istore_2        
			if(k > byteOffset)
				break;
	//   47   73:iload_2         
	//   48   74:aload_0         
	//   49   75:getfield        #22  <Field int byteOffset>
	//   50   78:icmpgt          108
			i = k;
	//   51   81:iload_2         
	//   52   82:istore_1        
			if(shouldSkipByte(k))
	//*  53   83:aload_0         
	//*  54   84:iload_2         
	//*  55   85:invokespecial   #49  <Method boolean shouldSkipByte(int)>
	//*  56   88:ifeq            69
			{
				byteOffset = byteOffset + 1;
	//   57   91:aload_0         
	//   58   92:aload_0         
	//   59   93:getfield        #22  <Field int byteOffset>
	//   60   96:iconst_1        
	//   61   97:iadd            
	//   62   98:putfield        #22  <Field int byteOffset>
				i = k + 2;
	//   63  101:iload_2         
	//   64  102:iconst_2        
	//   65  103:iadd            
	//   66  104:istore_1        
			}
		} while(true);
	//   67  105:goto            69
		assertValidOffset();
	//   68  108:aload_0         
	//   69  109:invokespecial   #57  <Method void assertValidOffset()>
	//   70  112:return          
	}

	private int bitOffset;
	private int byteLimit;
	private int byteOffset;
	private byte data[];
}
