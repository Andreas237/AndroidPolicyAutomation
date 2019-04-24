// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.util;


// Referenced classes of package com.google.android.exoplayer2.util:
//			Assertions, ParsableByteArray

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
		if(byteOffset >= 0 && (byteOffset < byteLimit || byteOffset == byteLimit && bitOffset == 0))
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field int byteOffset>
	//*   2    4:iflt            41
	//*   3    7:aload_0         
	//*   4    8:getfield        #26  <Field int byteOffset>
	//*   5   11:aload_0         
	//*   6   12:getfield        #23  <Field int byteLimit>
	//*   7   15:icmplt          36
	//*   8   18:aload_0         
	//*   9   19:getfield        #26  <Field int byteOffset>
	//*  10   22:aload_0         
	//*  11   23:getfield        #23  <Field int byteLimit>
	//*  12   26:icmpne          41
	//*  13   29:aload_0         
	//*  14   30:getfield        #28  <Field int bitOffset>
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
	//   22   44:invokestatic    #34  <Method void Assertions.checkState(boolean)>
	//   23   47:return          
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

	public void byteAlign()
	{
		if(bitOffset == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field int bitOffset>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			bitOffset = 0;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #28  <Field int bitOffset>
			byteOffset = byteOffset + 1;
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #26  <Field int byteOffset>
	//   10   18:iconst_1        
	//   11   19:iadd            
	//   12   20:putfield        #26  <Field int byteOffset>
			assertValidOffset();
	//   13   23:aload_0         
	//   14   24:invokespecial   #39  <Method void assertValidOffset()>
			return;
	//   15   27:return          
		}
	}

	public int getBytePosition()
	{
		boolean flag;
		if(bitOffset == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field int bitOffset>
	//*   2    4:ifne            12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_1        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_1        
		Assertions.checkState(flag);
	//    8   14:iload_1         
	//    9   15:invokestatic    #34  <Method void Assertions.checkState(boolean)>
		return byteOffset;
	//   10   18:aload_0         
	//   11   19:getfield        #26  <Field int byteOffset>
	//   12   22:ireturn         
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

	public void putInt(int i, int j)
	{
		int k = i;
	//    0    0:iload_1         
	//    1    1:istore_3        
		if(j < 32)
	//*   2    2:iload_2         
	//*   3    3:bipush          32
	//*   4    5:icmpge          16
			k = i & (1 << j) - 1;
	//    5    8:iload_1         
	//    6    9:iconst_1        
	//    7   10:iload_2         
	//    8   11:ishl            
	//    9   12:iconst_1        
	//   10   13:isub            
	//   11   14:iand            
	//   12   15:istore_3        
		int l = Math.min(8 - bitOffset, j);
	//   13   16:bipush          8
	//   14   18:aload_0         
	//   15   19:getfield        #28  <Field int bitOffset>
	//   16   22:isub            
	//   17   23:iload_2         
	//   18   24:invokestatic    #49  <Method int Math.min(int, int)>
	//   19   27:istore          4
		i = 8 - bitOffset - l;
	//   20   29:bipush          8
	//   21   31:aload_0         
	//   22   32:getfield        #28  <Field int bitOffset>
	//   23   35:isub            
	//   24   36:iload           4
	//   25   38:isub            
	//   26   39:istore_1        
		int i1 = bitOffset;
	//   27   40:aload_0         
	//   28   41:getfield        #28  <Field int bitOffset>
	//   29   44:istore          5
		data[byteOffset] = (byte)((65280 >> i1 | (1 << i) - 1) & data[byteOffset]);
	//   30   46:aload_0         
	//   31   47:getfield        #21  <Field byte[] data>
	//   32   50:aload_0         
	//   33   51:getfield        #26  <Field int byteOffset>
	//   34   54:ldc1            #50  <Int 65280>
	//   35   56:iload           5
	//   36   58:ishr            
	//   37   59:iconst_1        
	//   38   60:iload_1         
	//   39   61:ishl            
	//   40   62:iconst_1        
	//   41   63:isub            
	//   42   64:ior             
	//   43   65:aload_0         
	//   44   66:getfield        #21  <Field byte[] data>
	//   45   69:aload_0         
	//   46   70:getfield        #26  <Field int byteOffset>
	//   47   73:baload          
	//   48   74:iand            
	//   49   75:int2byte        
	//   50   76:bastore         
		l = j - l;
	//   51   77:iload_2         
	//   52   78:iload           4
	//   53   80:isub            
	//   54   81:istore          4
		data[byteOffset] = (byte)((k >>> l) << i | data[byteOffset]);
	//   55   83:aload_0         
	//   56   84:getfield        #21  <Field byte[] data>
	//   57   87:aload_0         
	//   58   88:getfield        #26  <Field int byteOffset>
	//   59   91:iload_3         
	//   60   92:iload           4
	//   61   94:iushr           
	//   62   95:iload_1         
	//   63   96:ishl            
	//   64   97:aload_0         
	//   65   98:getfield        #21  <Field byte[] data>
	//   66  101:aload_0         
	//   67  102:getfield        #26  <Field int byteOffset>
	//   68  105:baload          
	//   69  106:ior             
	//   70  107:int2byte        
	//   71  108:bastore         
		for(i = byteOffset + 1; l > 8; i++)
	//*  72  109:aload_0         
	//*  73  110:getfield        #26  <Field int byteOffset>
	//*  74  113:iconst_1        
	//*  75  114:iadd            
	//*  76  115:istore_1        
	//*  77  116:iload           4
	//*  78  118:bipush          8
	//*  79  120:icmple          151
		{
			data[i] = (byte)(k >>> l - 8);
	//   80  123:aload_0         
	//   81  124:getfield        #21  <Field byte[] data>
	//   82  127:iload_1         
	//   83  128:iload_3         
	//   84  129:iload           4
	//   85  131:bipush          8
	//   86  133:isub            
	//   87  134:iushr           
	//   88  135:int2byte        
	//   89  136:bastore         
			l -= 8;
	//   90  137:iload           4
	//   91  139:bipush          8
	//   92  141:isub            
	//   93  142:istore          4
		}

	//   94  144:iload_1         
	//   95  145:iconst_1        
	//   96  146:iadd            
	//   97  147:istore_1        
	//*  98  148:goto            116
		i1 = 8 - l;
	//   99  151:bipush          8
	//  100  153:iload           4
	//  101  155:isub            
	//  102  156:istore          5
		data[i] = (byte)(data[i] & (1 << i1) - 1);
	//  103  158:aload_0         
	//  104  159:getfield        #21  <Field byte[] data>
	//  105  162:iload_1         
	//  106  163:aload_0         
	//  107  164:getfield        #21  <Field byte[] data>
	//  108  167:iload_1         
	//  109  168:baload          
	//  110  169:iconst_1        
	//  111  170:iload           5
	//  112  172:ishl            
	//  113  173:iconst_1        
	//  114  174:isub            
	//  115  175:iand            
	//  116  176:int2byte        
	//  117  177:bastore         
		data[i] = (byte)((k & (1 << l) - 1) << i1 | data[i]);
	//  118  178:aload_0         
	//  119  179:getfield        #21  <Field byte[] data>
	//  120  182:iload_1         
	//  121  183:iload_3         
	//  122  184:iconst_1        
	//  123  185:iload           4
	//  124  187:ishl            
	//  125  188:iconst_1        
	//  126  189:isub            
	//  127  190:iand            
	//  128  191:iload           5
	//  129  193:ishl            
	//  130  194:aload_0         
	//  131  195:getfield        #21  <Field byte[] data>
	//  132  198:iload_1         
	//  133  199:baload          
	//  134  200:ior             
	//  135  201:int2byte        
	//  136  202:bastore         
		skipBits(j);
	//  137  203:aload_0         
	//  138  204:iload_2         
	//  139  205:invokevirtual   #54  <Method void skipBits(int)>
		assertValidOffset();
	//  140  208:aload_0         
	//  141  209:invokespecial   #39  <Method void assertValidOffset()>
	//  142  212:return          
	}

	public boolean readBit()
	{
		boolean flag;
		if((data[byteOffset] & 128 >> bitOffset) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field byte[] data>
	//*   2    4:aload_0         
	//*   3    5:getfield        #26  <Field int byteOffset>
	//*   4    8:baload          
	//*   5    9:sipush          128
	//*   6   12:aload_0         
	//*   7   13:getfield        #28  <Field int bitOffset>
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
	//   17   29:invokevirtual   #59  <Method void skipBit()>
		return flag;
	//   18   32:iload_1         
	//   19   33:ireturn         
	}

	public int readBits(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return 0;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		bitOffset = bitOffset + i;
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:getfield        #28  <Field int bitOffset>
	//    7   11:iload_1         
	//    8   12:iadd            
	//    9   13:putfield        #28  <Field int bitOffset>
		int j;
		int k;
		byte abyte0[];
		for(j = 0; bitOffset > 8; j |= (abyte0[k] & 0xff) << bitOffset)
	//*  10   16:iconst_0        
	//*  11   17:istore_2        
	//*  12   18:aload_0         
	//*  13   19:getfield        #28  <Field int bitOffset>
	//*  14   22:bipush          8
	//*  15   24:icmple          75
		{
			bitOffset = bitOffset - 8;
	//   16   27:aload_0         
	//   17   28:aload_0         
	//   18   29:getfield        #28  <Field int bitOffset>
	//   19   32:bipush          8
	//   20   34:isub            
	//   21   35:putfield        #28  <Field int bitOffset>
			abyte0 = data;
	//   22   38:aload_0         
	//   23   39:getfield        #21  <Field byte[] data>
	//   24   42:astore          5
			k = byteOffset;
	//   25   44:aload_0         
	//   26   45:getfield        #26  <Field int byteOffset>
	//   27   48:istore_3        
			byteOffset = k + 1;
	//   28   49:aload_0         
	//   29   50:iload_3         
	//   30   51:iconst_1        
	//   31   52:iadd            
	//   32   53:putfield        #26  <Field int byteOffset>
		}

	//   33   56:iload_2         
	//   34   57:aload           5
	//   35   59:iload_3         
	//   36   60:baload          
	//   37   61:sipush          255
	//   38   64:iand            
	//   39   65:aload_0         
	//   40   66:getfield        #28  <Field int bitOffset>
	//   41   69:ishl            
	//   42   70:ior             
	//   43   71:istore_2        
	//*  44   72:goto            18
		byte byte0 = data[byteOffset];
	//   45   75:aload_0         
	//   46   76:getfield        #21  <Field byte[] data>
	//   47   79:aload_0         
	//   48   80:getfield        #26  <Field int byteOffset>
	//   49   83:baload          
	//   50   84:istore_3        
		int l = bitOffset;
	//   51   85:aload_0         
	//   52   86:getfield        #28  <Field int bitOffset>
	//   53   89:istore          4
		if(bitOffset == 8)
	//*  54   91:aload_0         
	//*  55   92:getfield        #28  <Field int bitOffset>
	//*  56   95:bipush          8
	//*  57   97:icmpne          115
		{
			bitOffset = 0;
	//   58  100:aload_0         
	//   59  101:iconst_0        
	//   60  102:putfield        #28  <Field int bitOffset>
			byteOffset = byteOffset + 1;
	//   61  105:aload_0         
	//   62  106:aload_0         
	//   63  107:getfield        #26  <Field int byteOffset>
	//   64  110:iconst_1        
	//   65  111:iadd            
	//   66  112:putfield        #26  <Field int byteOffset>
		}
		assertValidOffset();
	//   67  115:aload_0         
	//   68  116:invokespecial   #39  <Method void assertValidOffset()>
		return -1 >>> 32 - i & (j | (byte0 & 0xff) >> 8 - l);
	//   69  119:iconst_m1       
	//   70  120:bipush          32
	//   71  122:iload_1         
	//   72  123:isub            
	//   73  124:iushr           
	//   74  125:iload_2         
	//   75  126:iload_3         
	//   76  127:sipush          255
	//   77  130:iand            
	//   78  131:bipush          8
	//   79  133:iload           4
	//   80  135:isub            
	//   81  136:ishr            
	//   82  137:ior             
	//   83  138:iand            
	//   84  139:ireturn         
	}

	public void readBits(byte abyte0[], int i, int j)
	{
		int k;
		for(k = (j >> 3) + i; i < k; i++)
	//*   0    0:iload_3         
	//*   1    1:iconst_3        
	//*   2    2:ishr            
	//*   3    3:iload_2         
	//*   4    4:iadd            
	//*   5    5:istore          4
	//*   6    7:iload_2         
	//*   7    8:iload           4
	//*   8   10:icmpge          87
		{
			byte abyte1[] = data;
	//    9   13:aload_0         
	//   10   14:getfield        #21  <Field byte[] data>
	//   11   17:astore          7
			int l = byteOffset;
	//   12   19:aload_0         
	//   13   20:getfield        #26  <Field int byteOffset>
	//   14   23:istore          5
			byteOffset = l + 1;
	//   15   25:aload_0         
	//   16   26:iload           5
	//   17   28:iconst_1        
	//   18   29:iadd            
	//   19   30:putfield        #26  <Field int byteOffset>
			abyte0[i] = (byte)(abyte1[l] << bitOffset);
	//   20   33:aload_1         
	//   21   34:iload_2         
	//   22   35:aload           7
	//   23   37:iload           5
	//   24   39:baload          
	//   25   40:aload_0         
	//   26   41:getfield        #28  <Field int bitOffset>
	//   27   44:ishl            
	//   28   45:int2byte        
	//   29   46:bastore         
			l = ((int) (abyte0[i]));
	//   30   47:aload_1         
	//   31   48:iload_2         
	//   32   49:baload          
	//   33   50:istore          5
			abyte0[i] = (byte)((0xff & data[byteOffset]) >> 8 - bitOffset | l);
	//   34   52:aload_1         
	//   35   53:iload_2         
	//   36   54:sipush          255
	//   37   57:aload_0         
	//   38   58:getfield        #21  <Field byte[] data>
	//   39   61:aload_0         
	//   40   62:getfield        #26  <Field int byteOffset>
	//   41   65:baload          
	//   42   66:iand            
	//   43   67:bipush          8
	//   44   69:aload_0         
	//   45   70:getfield        #28  <Field int bitOffset>
	//   46   73:isub            
	//   47   74:ishr            
	//   48   75:iload           5
	//   49   77:ior             
	//   50   78:int2byte        
	//   51   79:bastore         
		}

	//   52   80:iload_2         
	//   53   81:iconst_1        
	//   54   82:iadd            
	//   55   83:istore_2        
	//*  56   84:goto            7
		i = j & 7;
	//   57   87:iload_3         
	//   58   88:bipush          7
	//   59   90:iand            
	//   60   91:istore_2        
		if(i == 0)
	//*  61   92:iload_2         
	//*  62   93:ifne            97
			return;
	//   63   96:return          
		abyte0[k] = (byte)(abyte0[k] & 255 >> i);
	//   64   97:aload_1         
	//   65   98:iload           4
	//   66  100:aload_1         
	//   67  101:iload           4
	//   68  103:baload          
	//   69  104:sipush          255
	//   70  107:iload_2         
	//   71  108:ishr            
	//   72  109:iand            
	//   73  110:int2byte        
	//   74  111:bastore         
		if(bitOffset + i > 8)
	//*  75  112:aload_0         
	//*  76  113:getfield        #28  <Field int bitOffset>
	//*  77  116:iload_2         
	//*  78  117:iadd            
	//*  79  118:bipush          8
	//*  80  120:icmple          180
		{
			j = ((int) (abyte0[k]));
	//   81  123:aload_1         
	//   82  124:iload           4
	//   83  126:baload          
	//   84  127:istore_3        
			byte abyte2[] = data;
	//   85  128:aload_0         
	//   86  129:getfield        #21  <Field byte[] data>
	//   87  132:astore          7
			int i1 = byteOffset;
	//   88  134:aload_0         
	//   89  135:getfield        #26  <Field int byteOffset>
	//   90  138:istore          5
			byteOffset = i1 + 1;
	//   91  140:aload_0         
	//   92  141:iload           5
	//   93  143:iconst_1        
	//   94  144:iadd            
	//   95  145:putfield        #26  <Field int byteOffset>
			abyte0[k] = (byte)(j | (abyte2[i1] & 0xff) << bitOffset);
	//   96  148:aload_1         
	//   97  149:iload           4
	//   98  151:iload_3         
	//   99  152:aload           7
	//  100  154:iload           5
	//  101  156:baload          
	//  102  157:sipush          255
	//  103  160:iand            
	//  104  161:aload_0         
	//  105  162:getfield        #28  <Field int bitOffset>
	//  106  165:ishl            
	//  107  166:ior             
	//  108  167:int2byte        
	//  109  168:bastore         
			bitOffset = bitOffset - 8;
	//  110  169:aload_0         
	//  111  170:aload_0         
	//  112  171:getfield        #28  <Field int bitOffset>
	//  113  174:bipush          8
	//  114  176:isub            
	//  115  177:putfield        #28  <Field int bitOffset>
		}
		bitOffset = bitOffset + i;
	//  116  180:aload_0         
	//  117  181:aload_0         
	//  118  182:getfield        #28  <Field int bitOffset>
	//  119  185:iload_2         
	//  120  186:iadd            
	//  121  187:putfield        #28  <Field int bitOffset>
		j = ((int) (data[byteOffset]));
	//  122  190:aload_0         
	//  123  191:getfield        #21  <Field byte[] data>
	//  124  194:aload_0         
	//  125  195:getfield        #26  <Field int byteOffset>
	//  126  198:baload          
	//  127  199:istore_3        
		int j1 = bitOffset;
	//  128  200:aload_0         
	//  129  201:getfield        #28  <Field int bitOffset>
	//  130  204:istore          5
		byte byte0 = abyte0[k];
	//  131  206:aload_1         
	//  132  207:iload           4
	//  133  209:baload          
	//  134  210:istore          6
		abyte0[k] = (byte)((byte)(((j & 0xff) >> 8 - j1) << 8 - i) | byte0);
	//  135  212:aload_1         
	//  136  213:iload           4
	//  137  215:iload_3         
	//  138  216:sipush          255
	//  139  219:iand            
	//  140  220:bipush          8
	//  141  222:iload           5
	//  142  224:isub            
	//  143  225:ishr            
	//  144  226:bipush          8
	//  145  228:iload_2         
	//  146  229:isub            
	//  147  230:ishl            
	//  148  231:int2byte        
	//  149  232:iload           6
	//  150  234:ior             
	//  151  235:int2byte        
	//  152  236:bastore         
		if(bitOffset == 8)
	//* 153  237:aload_0         
	//* 154  238:getfield        #28  <Field int bitOffset>
	//* 155  241:bipush          8
	//* 156  243:icmpne          261
		{
			bitOffset = 0;
	//  157  246:aload_0         
	//  158  247:iconst_0        
	//  159  248:putfield        #28  <Field int bitOffset>
			byteOffset = byteOffset + 1;
	//  160  251:aload_0         
	//  161  252:aload_0         
	//  162  253:getfield        #26  <Field int byteOffset>
	//  163  256:iconst_1        
	//  164  257:iadd            
	//  165  258:putfield        #26  <Field int byteOffset>
		}
		assertValidOffset();
	//  166  261:aload_0         
	//  167  262:invokespecial   #39  <Method void assertValidOffset()>
	//  168  265:return          
	}

	public void readBytes(byte abyte0[], int i, int j)
	{
		boolean flag;
		if(bitOffset == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field int bitOffset>
	//*   2    4:ifne            13
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore          4
		else
	//*   5   10:goto            16
			flag = false;
	//    6   13:iconst_0        
	//    7   14:istore          4
		Assertions.checkState(flag);
	//    8   16:iload           4
	//    9   18:invokestatic    #34  <Method void Assertions.checkState(boolean)>
		System.arraycopy(((Object) (data)), byteOffset, ((Object) (abyte0)), i, j);
	//   10   21:aload_0         
	//   11   22:getfield        #21  <Field byte[] data>
	//   12   25:aload_0         
	//   13   26:getfield        #26  <Field int byteOffset>
	//   14   29:aload_1         
	//   15   30:iload_2         
	//   16   31:iload_3         
	//   17   32:invokestatic    #69  <Method void System.arraycopy(Object, int, Object, int, int)>
		byteOffset = byteOffset + j;
	//   18   35:aload_0         
	//   19   36:aload_0         
	//   20   37:getfield        #26  <Field int byteOffset>
	//   21   40:iload_3         
	//   22   41:iadd            
	//   23   42:putfield        #26  <Field int byteOffset>
		assertValidOffset();
	//   24   45:aload_0         
	//   25   46:invokespecial   #39  <Method void assertValidOffset()>
	//   26   49:return          
	}

	public void reset(ParsableByteArray parsablebytearray)
	{
		reset(parsablebytearray.data, parsablebytearray.limit());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #74  <Field byte[] ParsableByteArray.data>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #77  <Method int ParsableByteArray.limit()>
	//    5    9:invokevirtual   #79  <Method void reset(byte[], int)>
		setPosition(parsablebytearray.getPosition() * 8);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #81  <Method int ParsableByteArray.getPosition()>
	//    9   17:bipush          8
	//   10   19:imul            
	//   11   20:invokevirtual   #84  <Method void setPosition(int)>
	//   12   23:return          
	}

	public void reset(byte abyte0[])
	{
		reset(abyte0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:arraylength     
	//    4    4:invokevirtual   #79  <Method void reset(byte[], int)>
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
	//   14   22:invokespecial   #39  <Method void assertValidOffset()>
	//   15   25:return          
	}

	public void skipBit()
	{
		int i = bitOffset + 1;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int bitOffset>
	//    2    4:iconst_1        
	//    3    5:iadd            
	//    4    6:istore_1        
		bitOffset = i;
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:putfield        #28  <Field int bitOffset>
		if(i == 8)
	//*   8   12:iload_1         
	//*   9   13:bipush          8
	//*  10   15:icmpne          33
		{
			bitOffset = 0;
	//   11   18:aload_0         
	//   12   19:iconst_0        
	//   13   20:putfield        #28  <Field int bitOffset>
			byteOffset = byteOffset + 1;
	//   14   23:aload_0         
	//   15   24:aload_0         
	//   16   25:getfield        #26  <Field int byteOffset>
	//   17   28:iconst_1        
	//   18   29:iadd            
	//   19   30:putfield        #26  <Field int byteOffset>
		}
		assertValidOffset();
	//   20   33:aload_0         
	//   21   34:invokespecial   #39  <Method void assertValidOffset()>
	//   22   37:return          
	}

	public void skipBits(int i)
	{
		int j = i / 8;
	//    0    0:iload_1         
	//    1    1:bipush          8
	//    2    3:idiv            
	//    3    4:istore_2        
		byteOffset = byteOffset + j;
	//    4    5:aload_0         
	//    5    6:aload_0         
	//    6    7:getfield        #26  <Field int byteOffset>
	//    7   10:iload_2         
	//    8   11:iadd            
	//    9   12:putfield        #26  <Field int byteOffset>
		bitOffset = bitOffset + (i - j * 8);
	//   10   15:aload_0         
	//   11   16:aload_0         
	//   12   17:getfield        #28  <Field int bitOffset>
	//   13   20:iload_1         
	//   14   21:iload_2         
	//   15   22:bipush          8
	//   16   24:imul            
	//   17   25:isub            
	//   18   26:iadd            
	//   19   27:putfield        #28  <Field int bitOffset>
		if(bitOffset > 7)
	//*  20   30:aload_0         
	//*  21   31:getfield        #28  <Field int bitOffset>
	//*  22   34:bipush          7
	//*  23   36:icmple          60
		{
			byteOffset = byteOffset + 1;
	//   24   39:aload_0         
	//   25   40:aload_0         
	//   26   41:getfield        #26  <Field int byteOffset>
	//   27   44:iconst_1        
	//   28   45:iadd            
	//   29   46:putfield        #26  <Field int byteOffset>
			bitOffset = bitOffset - 8;
	//   30   49:aload_0         
	//   31   50:aload_0         
	//   32   51:getfield        #28  <Field int bitOffset>
	//   33   54:bipush          8
	//   34   56:isub            
	//   35   57:putfield        #28  <Field int bitOffset>
		}
		assertValidOffset();
	//   36   60:aload_0         
	//   37   61:invokespecial   #39  <Method void assertValidOffset()>
	//   38   64:return          
	}

	public void skipBytes(int i)
	{
		boolean flag;
		if(bitOffset == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field int bitOffset>
	//*   2    4:ifne            12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		Assertions.checkState(flag);
	//    8   14:iload_2         
	//    9   15:invokestatic    #34  <Method void Assertions.checkState(boolean)>
		byteOffset = byteOffset + i;
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #26  <Field int byteOffset>
	//   13   23:iload_1         
	//   14   24:iadd            
	//   15   25:putfield        #26  <Field int byteOffset>
		assertValidOffset();
	//   16   28:aload_0         
	//   17   29:invokespecial   #39  <Method void assertValidOffset()>
	//   18   32:return          
	}

	private int bitOffset;
	private int byteLimit;
	private int byteOffset;
	public byte data[];
}
