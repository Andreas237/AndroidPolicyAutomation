// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.util;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

// Referenced classes of package com.google.android.exoplayer2.util:
//			ParsableBitArray, Util, Assertions

public final class ParsableByteArray
{

	public ParsableByteArray()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public ParsableByteArray(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		data = new byte[i];
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:newarray        byte[]
	//    5    8:putfield        #17  <Field byte[] data>
		limit = i;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:putfield        #19  <Field int limit>
	//    9   16:return          
	}

	public ParsableByteArray(byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		data = abyte0;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field byte[] data>
		limit = abyte0.length;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:arraylength     
	//    8   12:putfield        #19  <Field int limit>
	//    9   15:return          
	}

	public ParsableByteArray(byte abyte0[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		data = abyte0;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field byte[] data>
		limit = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #19  <Field int limit>
	//    8   14:return          
	}

	public int bytesLeft()
	{
		return limit - position;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int limit>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field int position>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	public int capacity()
	{
		if(data == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field byte[] data>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return data.length;
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field byte[] data>
	//    7   13:arraylength     
	//    8   14:ireturn         
	}

	public int getPosition()
	{
		return position;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int position>
	//    2    4:ireturn         
	}

	public int limit()
	{
		return limit;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int limit>
	//    2    4:ireturn         
	}

	public char peekChar()
	{
		return (char)((data[position] & 0xff) << 8 | data[position + 1] & 0xff);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] data>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field int position>
	//    4    8:baload          
	//    5    9:sipush          255
	//    6   12:iand            
	//    7   13:bipush          8
	//    8   15:ishl            
	//    9   16:aload_0         
	//   10   17:getfield        #17  <Field byte[] data>
	//   11   20:aload_0         
	//   12   21:getfield        #25  <Field int position>
	//   13   24:iconst_1        
	//   14   25:iadd            
	//   15   26:baload          
	//   16   27:sipush          255
	//   17   30:iand            
	//   18   31:ior             
	//   19   32:int2char        
	//   20   33:ireturn         
	}

	public int peekUnsignedByte()
	{
		return data[position] & 0xff;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] data>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field int position>
	//    4    8:baload          
	//    5    9:sipush          255
	//    6   12:iand            
	//    7   13:ireturn         
	}

	public void readBytes(ParsableBitArray parsablebitarray, int i)
	{
		readBytes(parsablebitarray.data, 0, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #35  <Field byte[] ParsableBitArray.data>
	//    3    5:iconst_0        
	//    4    6:iload_2         
	//    5    7:invokevirtual   #38  <Method void readBytes(byte[], int, int)>
		parsablebitarray.setPosition(0);
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #41  <Method void ParsableBitArray.setPosition(int)>
	//    9   15:return          
	}

	public void readBytes(ByteBuffer bytebuffer, int i)
	{
		bytebuffer.put(data, position, i);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #17  <Field byte[] data>
	//    3    5:aload_0         
	//    4    6:getfield        #25  <Field int position>
	//    5    9:iload_2         
	//    6   10:invokevirtual   #48  <Method ByteBuffer ByteBuffer.put(byte[], int, int)>
	//    7   13:pop             
		position = position + i;
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #25  <Field int position>
	//   11   19:iload_2         
	//   12   20:iadd            
	//   13   21:putfield        #25  <Field int position>
	//   14   24:return          
	}

	public void readBytes(byte abyte0[], int i, int j)
	{
		System.arraycopy(((Object) (data)), position, ((Object) (abyte0)), i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] data>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field int position>
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:invokestatic    #54  <Method void System.arraycopy(Object, int, Object, int, int)>
		position = position + j;
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #25  <Field int position>
	//   11   19:iload_3         
	//   12   20:iadd            
	//   13   21:putfield        #25  <Field int position>
	//   14   24:return          
	}

	public double readDouble()
	{
		return Double.longBitsToDouble(readLong());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #60  <Method long readLong()>
	//    2    4:invokestatic    #66  <Method double Double.longBitsToDouble(long)>
	//    3    7:dreturn         
	}

	public float readFloat()
	{
		return Float.intBitsToFloat(readInt());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method int readInt()>
	//    2    4:invokestatic    #77  <Method float Float.intBitsToFloat(int)>
	//    3    7:freturn         
	}

	public int readInt()
	{
		byte abyte0[] = data;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] data>
	//    2    4:astore          5
		int i = position;
	//    3    6:aload_0         
	//    4    7:getfield        #25  <Field int position>
	//    5   10:istore_1        
		position = i + 1;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:iconst_1        
	//    9   14:iadd            
	//   10   15:putfield        #25  <Field int position>
		i = ((int) (abyte0[i]));
	//   11   18:aload           5
	//   12   20:iload_1         
	//   13   21:baload          
	//   14   22:istore_1        
		abyte0 = data;
	//   15   23:aload_0         
	//   16   24:getfield        #17  <Field byte[] data>
	//   17   27:astore          5
		int j = position;
	//   18   29:aload_0         
	//   19   30:getfield        #25  <Field int position>
	//   20   33:istore_2        
		position = j + 1;
	//   21   34:aload_0         
	//   22   35:iload_2         
	//   23   36:iconst_1        
	//   24   37:iadd            
	//   25   38:putfield        #25  <Field int position>
		j = ((int) (abyte0[j]));
	//   26   41:aload           5
	//   27   43:iload_2         
	//   28   44:baload          
	//   29   45:istore_2        
		abyte0 = data;
	//   30   46:aload_0         
	//   31   47:getfield        #17  <Field byte[] data>
	//   32   50:astore          5
		int k = position;
	//   33   52:aload_0         
	//   34   53:getfield        #25  <Field int position>
	//   35   56:istore_3        
		position = k + 1;
	//   36   57:aload_0         
	//   37   58:iload_3         
	//   38   59:iconst_1        
	//   39   60:iadd            
	//   40   61:putfield        #25  <Field int position>
		k = ((int) (abyte0[k]));
	//   41   64:aload           5
	//   42   66:iload_3         
	//   43   67:baload          
	//   44   68:istore_3        
		abyte0 = data;
	//   45   69:aload_0         
	//   46   70:getfield        #17  <Field byte[] data>
	//   47   73:astore          5
		int l = position;
	//   48   75:aload_0         
	//   49   76:getfield        #25  <Field int position>
	//   50   79:istore          4
		position = l + 1;
	//   51   81:aload_0         
	//   52   82:iload           4
	//   53   84:iconst_1        
	//   54   85:iadd            
	//   55   86:putfield        #25  <Field int position>
		return (i & 0xff) << 24 | (j & 0xff) << 16 | (k & 0xff) << 8 | abyte0[l] & 0xff;
	//   56   89:iload_1         
	//   57   90:sipush          255
	//   58   93:iand            
	//   59   94:bipush          24
	//   60   96:ishl            
	//   61   97:iload_2         
	//   62   98:sipush          255
	//   63  101:iand            
	//   64  102:bipush          16
	//   65  104:ishl            
	//   66  105:ior             
	//   67  106:iload_3         
	//   68  107:sipush          255
	//   69  110:iand            
	//   70  111:bipush          8
	//   71  113:ishl            
	//   72  114:ior             
	//   73  115:aload           5
	//   74  117:iload           4
	//   75  119:baload          
	//   76  120:sipush          255
	//   77  123:iand            
	//   78  124:ior             
	//   79  125:ireturn         
	}

	public int readInt24()
	{
		byte abyte0[] = data;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] data>
	//    2    4:astore          4
		int i = position;
	//    3    6:aload_0         
	//    4    7:getfield        #25  <Field int position>
	//    5   10:istore_1        
		position = i + 1;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:iconst_1        
	//    9   14:iadd            
	//   10   15:putfield        #25  <Field int position>
		i = ((int) (abyte0[i]));
	//   11   18:aload           4
	//   12   20:iload_1         
	//   13   21:baload          
	//   14   22:istore_1        
		abyte0 = data;
	//   15   23:aload_0         
	//   16   24:getfield        #17  <Field byte[] data>
	//   17   27:astore          4
		int j = position;
	//   18   29:aload_0         
	//   19   30:getfield        #25  <Field int position>
	//   20   33:istore_2        
		position = j + 1;
	//   21   34:aload_0         
	//   22   35:iload_2         
	//   23   36:iconst_1        
	//   24   37:iadd            
	//   25   38:putfield        #25  <Field int position>
		j = ((int) (abyte0[j]));
	//   26   41:aload           4
	//   27   43:iload_2         
	//   28   44:baload          
	//   29   45:istore_2        
		abyte0 = data;
	//   30   46:aload_0         
	//   31   47:getfield        #17  <Field byte[] data>
	//   32   50:astore          4
		int k = position;
	//   33   52:aload_0         
	//   34   53:getfield        #25  <Field int position>
	//   35   56:istore_3        
		position = k + 1;
	//   36   57:aload_0         
	//   37   58:iload_3         
	//   38   59:iconst_1        
	//   39   60:iadd            
	//   40   61:putfield        #25  <Field int position>
		return ((i & 0xff) << 24) >> 8 | (j & 0xff) << 8 | abyte0[k] & 0xff;
	//   41   64:iload_1         
	//   42   65:sipush          255
	//   43   68:iand            
	//   44   69:bipush          24
	//   45   71:ishl            
	//   46   72:bipush          8
	//   47   74:ishr            
	//   48   75:iload_2         
	//   49   76:sipush          255
	//   50   79:iand            
	//   51   80:bipush          8
	//   52   82:ishl            
	//   53   83:ior             
	//   54   84:aload           4
	//   55   86:iload_3         
	//   56   87:baload          
	//   57   88:sipush          255
	//   58   91:iand            
	//   59   92:ior             
	//   60   93:ireturn         
	}

	public String readLine()
	{
		if(bytesLeft() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #82  <Method int bytesLeft()>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		int i;
		for(i = position; i < limit && !Util.isLinebreak(((int) (data[i]))); i++);
	//    5    9:aload_0         
	//    6   10:getfield        #25  <Field int position>
	//    7   13:istore_1        
	//    8   14:iload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #19  <Field int limit>
	//   11   19:icmpge          41
	//   12   22:aload_0         
	//   13   23:getfield        #17  <Field byte[] data>
	//   14   26:iload_1         
	//   15   27:baload          
	//   16   28:invokestatic    #88  <Method boolean Util.isLinebreak(int)>
	//   17   31:ifne            41
	//   18   34:iload_1         
	//   19   35:iconst_1        
	//   20   36:iadd            
	//   21   37:istore_1        
	//*  22   38:goto            14
		if(i - position >= 3 && data[position] == -17 && data[position + 1] == -69 && data[position + 2] == -65)
	//*  23   41:iload_1         
	//*  24   42:aload_0         
	//*  25   43:getfield        #25  <Field int position>
	//*  26   46:isub            
	//*  27   47:iconst_3        
	//*  28   48:icmplt          107
	//*  29   51:aload_0         
	//*  30   52:getfield        #17  <Field byte[] data>
	//*  31   55:aload_0         
	//*  32   56:getfield        #25  <Field int position>
	//*  33   59:baload          
	//*  34   60:bipush          -17
	//*  35   62:icmpne          107
	//*  36   65:aload_0         
	//*  37   66:getfield        #17  <Field byte[] data>
	//*  38   69:aload_0         
	//*  39   70:getfield        #25  <Field int position>
	//*  40   73:iconst_1        
	//*  41   74:iadd            
	//*  42   75:baload          
	//*  43   76:bipush          -69
	//*  44   78:icmpne          107
	//*  45   81:aload_0         
	//*  46   82:getfield        #17  <Field byte[] data>
	//*  47   85:aload_0         
	//*  48   86:getfield        #25  <Field int position>
	//*  49   89:iconst_2        
	//*  50   90:iadd            
	//*  51   91:baload          
	//*  52   92:bipush          -65
	//*  53   94:icmpne          107
			position = position + 3;
	//   54   97:aload_0         
	//   55   98:aload_0         
	//   56   99:getfield        #25  <Field int position>
	//   57  102:iconst_3        
	//   58  103:iadd            
	//   59  104:putfield        #25  <Field int position>
		String s = Util.fromUtf8Bytes(data, position, i - position);
	//   60  107:aload_0         
	//   61  108:getfield        #17  <Field byte[] data>
	//   62  111:aload_0         
	//   63  112:getfield        #25  <Field int position>
	//   64  115:iload_1         
	//   65  116:aload_0         
	//   66  117:getfield        #25  <Field int position>
	//   67  120:isub            
	//   68  121:invokestatic    #92  <Method String Util.fromUtf8Bytes(byte[], int, int)>
	//   69  124:astore_2        
		position = i;
	//   70  125:aload_0         
	//   71  126:iload_1         
	//   72  127:putfield        #25  <Field int position>
		if(position == limit)
	//*  73  130:aload_0         
	//*  74  131:getfield        #25  <Field int position>
	//*  75  134:aload_0         
	//*  76  135:getfield        #19  <Field int limit>
	//*  77  138:icmpne          143
			return s;
	//   78  141:aload_2         
	//   79  142:areturn         
		if(data[position] == 13)
	//*  80  143:aload_0         
	//*  81  144:getfield        #17  <Field byte[] data>
	//*  82  147:aload_0         
	//*  83  148:getfield        #25  <Field int position>
	//*  84  151:baload          
	//*  85  152:bipush          13
	//*  86  154:icmpne          180
		{
			position = position + 1;
	//   87  157:aload_0         
	//   88  158:aload_0         
	//   89  159:getfield        #25  <Field int position>
	//   90  162:iconst_1        
	//   91  163:iadd            
	//   92  164:putfield        #25  <Field int position>
			if(position == limit)
	//*  93  167:aload_0         
	//*  94  168:getfield        #25  <Field int position>
	//*  95  171:aload_0         
	//*  96  172:getfield        #19  <Field int limit>
	//*  97  175:icmpne          180
				return s;
	//   98  178:aload_2         
	//   99  179:areturn         
		}
		if(data[position] == 10)
	//* 100  180:aload_0         
	//* 101  181:getfield        #17  <Field byte[] data>
	//* 102  184:aload_0         
	//* 103  185:getfield        #25  <Field int position>
	//* 104  188:baload          
	//* 105  189:bipush          10
	//* 106  191:icmpne          204
			position = position + 1;
	//  107  194:aload_0         
	//  108  195:aload_0         
	//  109  196:getfield        #25  <Field int position>
	//  110  199:iconst_1        
	//  111  200:iadd            
	//  112  201:putfield        #25  <Field int position>
		return s;
	//  113  204:aload_2         
	//  114  205:areturn         
	}

	public int readLittleEndianInt()
	{
		byte abyte0[] = data;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] data>
	//    2    4:astore          5
		int i = position;
	//    3    6:aload_0         
	//    4    7:getfield        #25  <Field int position>
	//    5   10:istore_1        
		position = i + 1;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:iconst_1        
	//    9   14:iadd            
	//   10   15:putfield        #25  <Field int position>
		i = ((int) (abyte0[i]));
	//   11   18:aload           5
	//   12   20:iload_1         
	//   13   21:baload          
	//   14   22:istore_1        
		abyte0 = data;
	//   15   23:aload_0         
	//   16   24:getfield        #17  <Field byte[] data>
	//   17   27:astore          5
		int j = position;
	//   18   29:aload_0         
	//   19   30:getfield        #25  <Field int position>
	//   20   33:istore_2        
		position = j + 1;
	//   21   34:aload_0         
	//   22   35:iload_2         
	//   23   36:iconst_1        
	//   24   37:iadd            
	//   25   38:putfield        #25  <Field int position>
		j = ((int) (abyte0[j]));
	//   26   41:aload           5
	//   27   43:iload_2         
	//   28   44:baload          
	//   29   45:istore_2        
		abyte0 = data;
	//   30   46:aload_0         
	//   31   47:getfield        #17  <Field byte[] data>
	//   32   50:astore          5
		int k = position;
	//   33   52:aload_0         
	//   34   53:getfield        #25  <Field int position>
	//   35   56:istore_3        
		position = k + 1;
	//   36   57:aload_0         
	//   37   58:iload_3         
	//   38   59:iconst_1        
	//   39   60:iadd            
	//   40   61:putfield        #25  <Field int position>
		k = ((int) (abyte0[k]));
	//   41   64:aload           5
	//   42   66:iload_3         
	//   43   67:baload          
	//   44   68:istore_3        
		abyte0 = data;
	//   45   69:aload_0         
	//   46   70:getfield        #17  <Field byte[] data>
	//   47   73:astore          5
		int l = position;
	//   48   75:aload_0         
	//   49   76:getfield        #25  <Field int position>
	//   50   79:istore          4
		position = l + 1;
	//   51   81:aload_0         
	//   52   82:iload           4
	//   53   84:iconst_1        
	//   54   85:iadd            
	//   55   86:putfield        #25  <Field int position>
		return i & 0xff | (j & 0xff) << 8 | (k & 0xff) << 16 | (abyte0[l] & 0xff) << 24;
	//   56   89:iload_1         
	//   57   90:sipush          255
	//   58   93:iand            
	//   59   94:iload_2         
	//   60   95:sipush          255
	//   61   98:iand            
	//   62   99:bipush          8
	//   63  101:ishl            
	//   64  102:ior             
	//   65  103:iload_3         
	//   66  104:sipush          255
	//   67  107:iand            
	//   68  108:bipush          16
	//   69  110:ishl            
	//   70  111:ior             
	//   71  112:aload           5
	//   72  114:iload           4
	//   73  116:baload          
	//   74  117:sipush          255
	//   75  120:iand            
	//   76  121:bipush          24
	//   77  123:ishl            
	//   78  124:ior             
	//   79  125:ireturn         
	}

	public int readLittleEndianInt24()
	{
		byte abyte0[] = data;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] data>
	//    2    4:astore          4
		int i = position;
	//    3    6:aload_0         
	//    4    7:getfield        #25  <Field int position>
	//    5   10:istore_1        
		position = i + 1;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:iconst_1        
	//    9   14:iadd            
	//   10   15:putfield        #25  <Field int position>
		i = ((int) (abyte0[i]));
	//   11   18:aload           4
	//   12   20:iload_1         
	//   13   21:baload          
	//   14   22:istore_1        
		abyte0 = data;
	//   15   23:aload_0         
	//   16   24:getfield        #17  <Field byte[] data>
	//   17   27:astore          4
		int j = position;
	//   18   29:aload_0         
	//   19   30:getfield        #25  <Field int position>
	//   20   33:istore_2        
		position = j + 1;
	//   21   34:aload_0         
	//   22   35:iload_2         
	//   23   36:iconst_1        
	//   24   37:iadd            
	//   25   38:putfield        #25  <Field int position>
		j = ((int) (abyte0[j]));
	//   26   41:aload           4
	//   27   43:iload_2         
	//   28   44:baload          
	//   29   45:istore_2        
		abyte0 = data;
	//   30   46:aload_0         
	//   31   47:getfield        #17  <Field byte[] data>
	//   32   50:astore          4
		int k = position;
	//   33   52:aload_0         
	//   34   53:getfield        #25  <Field int position>
	//   35   56:istore_3        
		position = k + 1;
	//   36   57:aload_0         
	//   37   58:iload_3         
	//   38   59:iconst_1        
	//   39   60:iadd            
	//   40   61:putfield        #25  <Field int position>
		return i & 0xff | (j & 0xff) << 8 | (abyte0[k] & 0xff) << 16;
	//   41   64:iload_1         
	//   42   65:sipush          255
	//   43   68:iand            
	//   44   69:iload_2         
	//   45   70:sipush          255
	//   46   73:iand            
	//   47   74:bipush          8
	//   48   76:ishl            
	//   49   77:ior             
	//   50   78:aload           4
	//   51   80:iload_3         
	//   52   81:baload          
	//   53   82:sipush          255
	//   54   85:iand            
	//   55   86:bipush          16
	//   56   88:ishl            
	//   57   89:ior             
	//   58   90:ireturn         
	}

	public long readLittleEndianLong()
	{
		byte abyte0[] = data;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] data>
	//    2    4:astore          16
		int i = position;
	//    3    6:aload_0         
	//    4    7:getfield        #25  <Field int position>
	//    5   10:istore_1        
		position = i + 1;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:iconst_1        
	//    9   14:iadd            
	//   10   15:putfield        #25  <Field int position>
		long l = abyte0[i];
	//   11   18:aload           16
	//   12   20:iload_1         
	//   13   21:baload          
	//   14   22:i2l             
	//   15   23:lstore_2        
		abyte0 = data;
	//   16   24:aload_0         
	//   17   25:getfield        #17  <Field byte[] data>
	//   18   28:astore          16
		i = position;
	//   19   30:aload_0         
	//   20   31:getfield        #25  <Field int position>
	//   21   34:istore_1        
		position = i + 1;
	//   22   35:aload_0         
	//   23   36:iload_1         
	//   24   37:iconst_1        
	//   25   38:iadd            
	//   26   39:putfield        #25  <Field int position>
		long l1 = abyte0[i];
	//   27   42:aload           16
	//   28   44:iload_1         
	//   29   45:baload          
	//   30   46:i2l             
	//   31   47:lstore          4
		abyte0 = data;
	//   32   49:aload_0         
	//   33   50:getfield        #17  <Field byte[] data>
	//   34   53:astore          16
		i = position;
	//   35   55:aload_0         
	//   36   56:getfield        #25  <Field int position>
	//   37   59:istore_1        
		position = i + 1;
	//   38   60:aload_0         
	//   39   61:iload_1         
	//   40   62:iconst_1        
	//   41   63:iadd            
	//   42   64:putfield        #25  <Field int position>
		long l2 = abyte0[i];
	//   43   67:aload           16
	//   44   69:iload_1         
	//   45   70:baload          
	//   46   71:i2l             
	//   47   72:lstore          6
		abyte0 = data;
	//   48   74:aload_0         
	//   49   75:getfield        #17  <Field byte[] data>
	//   50   78:astore          16
		i = position;
	//   51   80:aload_0         
	//   52   81:getfield        #25  <Field int position>
	//   53   84:istore_1        
		position = i + 1;
	//   54   85:aload_0         
	//   55   86:iload_1         
	//   56   87:iconst_1        
	//   57   88:iadd            
	//   58   89:putfield        #25  <Field int position>
		long l3 = abyte0[i];
	//   59   92:aload           16
	//   60   94:iload_1         
	//   61   95:baload          
	//   62   96:i2l             
	//   63   97:lstore          8
		abyte0 = data;
	//   64   99:aload_0         
	//   65  100:getfield        #17  <Field byte[] data>
	//   66  103:astore          16
		i = position;
	//   67  105:aload_0         
	//   68  106:getfield        #25  <Field int position>
	//   69  109:istore_1        
		position = i + 1;
	//   70  110:aload_0         
	//   71  111:iload_1         
	//   72  112:iconst_1        
	//   73  113:iadd            
	//   74  114:putfield        #25  <Field int position>
		long l4 = abyte0[i];
	//   75  117:aload           16
	//   76  119:iload_1         
	//   77  120:baload          
	//   78  121:i2l             
	//   79  122:lstore          10
		abyte0 = data;
	//   80  124:aload_0         
	//   81  125:getfield        #17  <Field byte[] data>
	//   82  128:astore          16
		i = position;
	//   83  130:aload_0         
	//   84  131:getfield        #25  <Field int position>
	//   85  134:istore_1        
		position = i + 1;
	//   86  135:aload_0         
	//   87  136:iload_1         
	//   88  137:iconst_1        
	//   89  138:iadd            
	//   90  139:putfield        #25  <Field int position>
		long l5 = abyte0[i];
	//   91  142:aload           16
	//   92  144:iload_1         
	//   93  145:baload          
	//   94  146:i2l             
	//   95  147:lstore          12
		abyte0 = data;
	//   96  149:aload_0         
	//   97  150:getfield        #17  <Field byte[] data>
	//   98  153:astore          16
		i = position;
	//   99  155:aload_0         
	//  100  156:getfield        #25  <Field int position>
	//  101  159:istore_1        
		position = i + 1;
	//  102  160:aload_0         
	//  103  161:iload_1         
	//  104  162:iconst_1        
	//  105  163:iadd            
	//  106  164:putfield        #25  <Field int position>
		long l6 = abyte0[i];
	//  107  167:aload           16
	//  108  169:iload_1         
	//  109  170:baload          
	//  110  171:i2l             
	//  111  172:lstore          14
		abyte0 = data;
	//  112  174:aload_0         
	//  113  175:getfield        #17  <Field byte[] data>
	//  114  178:astore          16
		i = position;
	//  115  180:aload_0         
	//  116  181:getfield        #25  <Field int position>
	//  117  184:istore_1        
		position = i + 1;
	//  118  185:aload_0         
	//  119  186:iload_1         
	//  120  187:iconst_1        
	//  121  188:iadd            
	//  122  189:putfield        #25  <Field int position>
		return l & 255L | (l1 & 255L) << 8 | (l2 & 255L) << 16 | (l3 & 255L) << 24 | (l4 & 255L) << 32 | (l5 & 255L) << 40 | (l6 & 255L) << 48 | ((long)abyte0[i] & 255L) << 56;
	//  123  192:lload_2         
	//  124  193:ldc2w           #96  <Long 255L>
	//  125  196:land            
	//  126  197:lload           4
	//  127  199:ldc2w           #96  <Long 255L>
	//  128  202:land            
	//  129  203:bipush          8
	//  130  205:lshl            
	//  131  206:lor             
	//  132  207:lload           6
	//  133  209:ldc2w           #96  <Long 255L>
	//  134  212:land            
	//  135  213:bipush          16
	//  136  215:lshl            
	//  137  216:lor             
	//  138  217:lload           8
	//  139  219:ldc2w           #96  <Long 255L>
	//  140  222:land            
	//  141  223:bipush          24
	//  142  225:lshl            
	//  143  226:lor             
	//  144  227:lload           10
	//  145  229:ldc2w           #96  <Long 255L>
	//  146  232:land            
	//  147  233:bipush          32
	//  148  235:lshl            
	//  149  236:lor             
	//  150  237:lload           12
	//  151  239:ldc2w           #96  <Long 255L>
	//  152  242:land            
	//  153  243:bipush          40
	//  154  245:lshl            
	//  155  246:lor             
	//  156  247:lload           14
	//  157  249:ldc2w           #96  <Long 255L>
	//  158  252:land            
	//  159  253:bipush          48
	//  160  255:lshl            
	//  161  256:lor             
	//  162  257:aload           16
	//  163  259:iload_1         
	//  164  260:baload          
	//  165  261:i2l             
	//  166  262:ldc2w           #96  <Long 255L>
	//  167  265:land            
	//  168  266:bipush          56
	//  169  268:lshl            
	//  170  269:lor             
	//  171  270:lreturn         
	}

	public short readLittleEndianShort()
	{
		byte abyte0[] = data;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] data>
	//    2    4:astore_3        
		int i = position;
	//    3    5:aload_0         
	//    4    6:getfield        #25  <Field int position>
	//    5    9:istore_1        
		position = i + 1;
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #25  <Field int position>
		i = ((int) (abyte0[i]));
	//   11   17:aload_3         
	//   12   18:iload_1         
	//   13   19:baload          
	//   14   20:istore_1        
		abyte0 = data;
	//   15   21:aload_0         
	//   16   22:getfield        #17  <Field byte[] data>
	//   17   25:astore_3        
		int j = position;
	//   18   26:aload_0         
	//   19   27:getfield        #25  <Field int position>
	//   20   30:istore_2        
		position = j + 1;
	//   21   31:aload_0         
	//   22   32:iload_2         
	//   23   33:iconst_1        
	//   24   34:iadd            
	//   25   35:putfield        #25  <Field int position>
		return (short)(i & 0xff | (abyte0[j] & 0xff) << 8);
	//   26   38:iload_1         
	//   27   39:sipush          255
	//   28   42:iand            
	//   29   43:aload_3         
	//   30   44:iload_2         
	//   31   45:baload          
	//   32   46:sipush          255
	//   33   49:iand            
	//   34   50:bipush          8
	//   35   52:ishl            
	//   36   53:ior             
	//   37   54:int2short       
	//   38   55:ireturn         
	}

	public long readLittleEndianUnsignedInt()
	{
		byte abyte0[] = data;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] data>
	//    2    4:astore          8
		int i = position;
	//    3    6:aload_0         
	//    4    7:getfield        #25  <Field int position>
	//    5   10:istore_1        
		position = i + 1;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:iconst_1        
	//    9   14:iadd            
	//   10   15:putfield        #25  <Field int position>
		long l = abyte0[i];
	//   11   18:aload           8
	//   12   20:iload_1         
	//   13   21:baload          
	//   14   22:i2l             
	//   15   23:lstore_2        
		abyte0 = data;
	//   16   24:aload_0         
	//   17   25:getfield        #17  <Field byte[] data>
	//   18   28:astore          8
		i = position;
	//   19   30:aload_0         
	//   20   31:getfield        #25  <Field int position>
	//   21   34:istore_1        
		position = i + 1;
	//   22   35:aload_0         
	//   23   36:iload_1         
	//   24   37:iconst_1        
	//   25   38:iadd            
	//   26   39:putfield        #25  <Field int position>
		long l1 = abyte0[i];
	//   27   42:aload           8
	//   28   44:iload_1         
	//   29   45:baload          
	//   30   46:i2l             
	//   31   47:lstore          4
		abyte0 = data;
	//   32   49:aload_0         
	//   33   50:getfield        #17  <Field byte[] data>
	//   34   53:astore          8
		i = position;
	//   35   55:aload_0         
	//   36   56:getfield        #25  <Field int position>
	//   37   59:istore_1        
		position = i + 1;
	//   38   60:aload_0         
	//   39   61:iload_1         
	//   40   62:iconst_1        
	//   41   63:iadd            
	//   42   64:putfield        #25  <Field int position>
		long l2 = abyte0[i];
	//   43   67:aload           8
	//   44   69:iload_1         
	//   45   70:baload          
	//   46   71:i2l             
	//   47   72:lstore          6
		abyte0 = data;
	//   48   74:aload_0         
	//   49   75:getfield        #17  <Field byte[] data>
	//   50   78:astore          8
		i = position;
	//   51   80:aload_0         
	//   52   81:getfield        #25  <Field int position>
	//   53   84:istore_1        
		position = i + 1;
	//   54   85:aload_0         
	//   55   86:iload_1         
	//   56   87:iconst_1        
	//   57   88:iadd            
	//   58   89:putfield        #25  <Field int position>
		return l & 255L | (l1 & 255L) << 8 | (l2 & 255L) << 16 | ((long)abyte0[i] & 255L) << 24;
	//   59   92:lload_2         
	//   60   93:ldc2w           #96  <Long 255L>
	//   61   96:land            
	//   62   97:lload           4
	//   63   99:ldc2w           #96  <Long 255L>
	//   64  102:land            
	//   65  103:bipush          8
	//   66  105:lshl            
	//   67  106:lor             
	//   68  107:lload           6
	//   69  109:ldc2w           #96  <Long 255L>
	//   70  112:land            
	//   71  113:bipush          16
	//   72  115:lshl            
	//   73  116:lor             
	//   74  117:aload           8
	//   75  119:iload_1         
	//   76  120:baload          
	//   77  121:i2l             
	//   78  122:ldc2w           #96  <Long 255L>
	//   79  125:land            
	//   80  126:bipush          24
	//   81  128:lshl            
	//   82  129:lor             
	//   83  130:lreturn         
	}

	public int readLittleEndianUnsignedInt24()
	{
		byte abyte0[] = data;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] data>
	//    2    4:astore          4
		int i = position;
	//    3    6:aload_0         
	//    4    7:getfield        #25  <Field int position>
	//    5   10:istore_1        
		position = i + 1;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:iconst_1        
	//    9   14:iadd            
	//   10   15:putfield        #25  <Field int position>
		i = ((int) (abyte0[i]));
	//   11   18:aload           4
	//   12   20:iload_1         
	//   13   21:baload          
	//   14   22:istore_1        
		abyte0 = data;
	//   15   23:aload_0         
	//   16   24:getfield        #17  <Field byte[] data>
	//   17   27:astore          4
		int j = position;
	//   18   29:aload_0         
	//   19   30:getfield        #25  <Field int position>
	//   20   33:istore_2        
		position = j + 1;
	//   21   34:aload_0         
	//   22   35:iload_2         
	//   23   36:iconst_1        
	//   24   37:iadd            
	//   25   38:putfield        #25  <Field int position>
		j = ((int) (abyte0[j]));
	//   26   41:aload           4
	//   27   43:iload_2         
	//   28   44:baload          
	//   29   45:istore_2        
		abyte0 = data;
	//   30   46:aload_0         
	//   31   47:getfield        #17  <Field byte[] data>
	//   32   50:astore          4
		int k = position;
	//   33   52:aload_0         
	//   34   53:getfield        #25  <Field int position>
	//   35   56:istore_3        
		position = k + 1;
	//   36   57:aload_0         
	//   37   58:iload_3         
	//   38   59:iconst_1        
	//   39   60:iadd            
	//   40   61:putfield        #25  <Field int position>
		return i & 0xff | (j & 0xff) << 8 | (abyte0[k] & 0xff) << 16;
	//   41   64:iload_1         
	//   42   65:sipush          255
	//   43   68:iand            
	//   44   69:iload_2         
	//   45   70:sipush          255
	//   46   73:iand            
	//   47   74:bipush          8
	//   48   76:ishl            
	//   49   77:ior             
	//   50   78:aload           4
	//   51   80:iload_3         
	//   52   81:baload          
	//   53   82:sipush          255
	//   54   85:iand            
	//   55   86:bipush          16
	//   56   88:ishl            
	//   57   89:ior             
	//   58   90:ireturn         
	}

	public int readLittleEndianUnsignedIntToInt()
	{
		int i = readLittleEndianInt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #104 <Method int readLittleEndianInt()>
	//    2    4:istore_1        
		if(i < 0)
	//*   3    5:iload_1         
	//*   4    6:ifge            42
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5    9:new             #106 <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #107 <Method void StringBuilder()>
	//    8   16:astore_2        
			stringbuilder.append("Top bit not zero: ");
	//    9   17:aload_2         
	//   10   18:ldc1            #109 <String "Top bit not zero: ">
	//   11   20:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
			stringbuilder.append(i);
	//   13   24:aload_2         
	//   14   25:iload_1         
	//   15   26:invokevirtual   #116 <Method StringBuilder StringBuilder.append(int)>
	//   16   29:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   17   30:new             #118 <Class IllegalStateException>
	//   18   33:dup             
	//   19   34:aload_2         
	//   20   35:invokevirtual   #121 <Method String StringBuilder.toString()>
	//   21   38:invokespecial   #124 <Method void IllegalStateException(String)>
	//   22   41:athrow          
		} else
		{
			return i;
	//   23   42:iload_1         
	//   24   43:ireturn         
		}
	}

	public int readLittleEndianUnsignedShort()
	{
		byte abyte0[] = data;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] data>
	//    2    4:astore_3        
		int i = position;
	//    3    5:aload_0         
	//    4    6:getfield        #25  <Field int position>
	//    5    9:istore_1        
		position = i + 1;
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #25  <Field int position>
		i = ((int) (abyte0[i]));
	//   11   17:aload_3         
	//   12   18:iload_1         
	//   13   19:baload          
	//   14   20:istore_1        
		abyte0 = data;
	//   15   21:aload_0         
	//   16   22:getfield        #17  <Field byte[] data>
	//   17   25:astore_3        
		int j = position;
	//   18   26:aload_0         
	//   19   27:getfield        #25  <Field int position>
	//   20   30:istore_2        
		position = j + 1;
	//   21   31:aload_0         
	//   22   32:iload_2         
	//   23   33:iconst_1        
	//   24   34:iadd            
	//   25   35:putfield        #25  <Field int position>
		return i & 0xff | (abyte0[j] & 0xff) << 8;
	//   26   38:iload_1         
	//   27   39:sipush          255
	//   28   42:iand            
	//   29   43:aload_3         
	//   30   44:iload_2         
	//   31   45:baload          
	//   32   46:sipush          255
	//   33   49:iand            
	//   34   50:bipush          8
	//   35   52:ishl            
	//   36   53:ior             
	//   37   54:ireturn         
	}

	public long readLong()
	{
		byte abyte0[] = data;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] data>
	//    2    4:astore          16
		int i = position;
	//    3    6:aload_0         
	//    4    7:getfield        #25  <Field int position>
	//    5   10:istore_1        
		position = i + 1;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:iconst_1        
	//    9   14:iadd            
	//   10   15:putfield        #25  <Field int position>
		long l = abyte0[i];
	//   11   18:aload           16
	//   12   20:iload_1         
	//   13   21:baload          
	//   14   22:i2l             
	//   15   23:lstore_2        
		abyte0 = data;
	//   16   24:aload_0         
	//   17   25:getfield        #17  <Field byte[] data>
	//   18   28:astore          16
		i = position;
	//   19   30:aload_0         
	//   20   31:getfield        #25  <Field int position>
	//   21   34:istore_1        
		position = i + 1;
	//   22   35:aload_0         
	//   23   36:iload_1         
	//   24   37:iconst_1        
	//   25   38:iadd            
	//   26   39:putfield        #25  <Field int position>
		long l1 = abyte0[i];
	//   27   42:aload           16
	//   28   44:iload_1         
	//   29   45:baload          
	//   30   46:i2l             
	//   31   47:lstore          4
		abyte0 = data;
	//   32   49:aload_0         
	//   33   50:getfield        #17  <Field byte[] data>
	//   34   53:astore          16
		i = position;
	//   35   55:aload_0         
	//   36   56:getfield        #25  <Field int position>
	//   37   59:istore_1        
		position = i + 1;
	//   38   60:aload_0         
	//   39   61:iload_1         
	//   40   62:iconst_1        
	//   41   63:iadd            
	//   42   64:putfield        #25  <Field int position>
		long l2 = abyte0[i];
	//   43   67:aload           16
	//   44   69:iload_1         
	//   45   70:baload          
	//   46   71:i2l             
	//   47   72:lstore          6
		abyte0 = data;
	//   48   74:aload_0         
	//   49   75:getfield        #17  <Field byte[] data>
	//   50   78:astore          16
		i = position;
	//   51   80:aload_0         
	//   52   81:getfield        #25  <Field int position>
	//   53   84:istore_1        
		position = i + 1;
	//   54   85:aload_0         
	//   55   86:iload_1         
	//   56   87:iconst_1        
	//   57   88:iadd            
	//   58   89:putfield        #25  <Field int position>
		long l3 = abyte0[i];
	//   59   92:aload           16
	//   60   94:iload_1         
	//   61   95:baload          
	//   62   96:i2l             
	//   63   97:lstore          8
		abyte0 = data;
	//   64   99:aload_0         
	//   65  100:getfield        #17  <Field byte[] data>
	//   66  103:astore          16
		i = position;
	//   67  105:aload_0         
	//   68  106:getfield        #25  <Field int position>
	//   69  109:istore_1        
		position = i + 1;
	//   70  110:aload_0         
	//   71  111:iload_1         
	//   72  112:iconst_1        
	//   73  113:iadd            
	//   74  114:putfield        #25  <Field int position>
		long l4 = abyte0[i];
	//   75  117:aload           16
	//   76  119:iload_1         
	//   77  120:baload          
	//   78  121:i2l             
	//   79  122:lstore          10
		abyte0 = data;
	//   80  124:aload_0         
	//   81  125:getfield        #17  <Field byte[] data>
	//   82  128:astore          16
		i = position;
	//   83  130:aload_0         
	//   84  131:getfield        #25  <Field int position>
	//   85  134:istore_1        
		position = i + 1;
	//   86  135:aload_0         
	//   87  136:iload_1         
	//   88  137:iconst_1        
	//   89  138:iadd            
	//   90  139:putfield        #25  <Field int position>
		long l5 = abyte0[i];
	//   91  142:aload           16
	//   92  144:iload_1         
	//   93  145:baload          
	//   94  146:i2l             
	//   95  147:lstore          12
		abyte0 = data;
	//   96  149:aload_0         
	//   97  150:getfield        #17  <Field byte[] data>
	//   98  153:astore          16
		i = position;
	//   99  155:aload_0         
	//  100  156:getfield        #25  <Field int position>
	//  101  159:istore_1        
		position = i + 1;
	//  102  160:aload_0         
	//  103  161:iload_1         
	//  104  162:iconst_1        
	//  105  163:iadd            
	//  106  164:putfield        #25  <Field int position>
		long l6 = abyte0[i];
	//  107  167:aload           16
	//  108  169:iload_1         
	//  109  170:baload          
	//  110  171:i2l             
	//  111  172:lstore          14
		abyte0 = data;
	//  112  174:aload_0         
	//  113  175:getfield        #17  <Field byte[] data>
	//  114  178:astore          16
		i = position;
	//  115  180:aload_0         
	//  116  181:getfield        #25  <Field int position>
	//  117  184:istore_1        
		position = i + 1;
	//  118  185:aload_0         
	//  119  186:iload_1         
	//  120  187:iconst_1        
	//  121  188:iadd            
	//  122  189:putfield        #25  <Field int position>
		return (l & 255L) << 56 | (l1 & 255L) << 48 | (l2 & 255L) << 40 | (l3 & 255L) << 32 | (l4 & 255L) << 24 | (l5 & 255L) << 16 | (l6 & 255L) << 8 | (long)abyte0[i] & 255L;
	//  123  192:lload_2         
	//  124  193:ldc2w           #96  <Long 255L>
	//  125  196:land            
	//  126  197:bipush          56
	//  127  199:lshl            
	//  128  200:lload           4
	//  129  202:ldc2w           #96  <Long 255L>
	//  130  205:land            
	//  131  206:bipush          48
	//  132  208:lshl            
	//  133  209:lor             
	//  134  210:lload           6
	//  135  212:ldc2w           #96  <Long 255L>
	//  136  215:land            
	//  137  216:bipush          40
	//  138  218:lshl            
	//  139  219:lor             
	//  140  220:lload           8
	//  141  222:ldc2w           #96  <Long 255L>
	//  142  225:land            
	//  143  226:bipush          32
	//  144  228:lshl            
	//  145  229:lor             
	//  146  230:lload           10
	//  147  232:ldc2w           #96  <Long 255L>
	//  148  235:land            
	//  149  236:bipush          24
	//  150  238:lshl            
	//  151  239:lor             
	//  152  240:lload           12
	//  153  242:ldc2w           #96  <Long 255L>
	//  154  245:land            
	//  155  246:bipush          16
	//  156  248:lshl            
	//  157  249:lor             
	//  158  250:lload           14
	//  159  252:ldc2w           #96  <Long 255L>
	//  160  255:land            
	//  161  256:bipush          8
	//  162  258:lshl            
	//  163  259:lor             
	//  164  260:aload           16
	//  165  262:iload_1         
	//  166  263:baload          
	//  167  264:i2l             
	//  168  265:ldc2w           #96  <Long 255L>
	//  169  268:land            
	//  170  269:lor             
	//  171  270:lreturn         
	}

	public String readNullTerminatedString()
	{
		if(bytesLeft() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #82  <Method int bytesLeft()>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		int i;
		for(i = position; i < limit && data[i] != 0; i++);
	//    5    9:aload_0         
	//    6   10:getfield        #25  <Field int position>
	//    7   13:istore_1        
	//    8   14:iload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #19  <Field int limit>
	//   11   19:icmpge          38
	//   12   22:aload_0         
	//   13   23:getfield        #17  <Field byte[] data>
	//   14   26:iload_1         
	//   15   27:baload          
	//   16   28:ifeq            38
	//   17   31:iload_1         
	//   18   32:iconst_1        
	//   19   33:iadd            
	//   20   34:istore_1        
	//*  21   35:goto            14
		String s = Util.fromUtf8Bytes(data, position, i - position);
	//   22   38:aload_0         
	//   23   39:getfield        #17  <Field byte[] data>
	//   24   42:aload_0         
	//   25   43:getfield        #25  <Field int position>
	//   26   46:iload_1         
	//   27   47:aload_0         
	//   28   48:getfield        #25  <Field int position>
	//   29   51:isub            
	//   30   52:invokestatic    #92  <Method String Util.fromUtf8Bytes(byte[], int, int)>
	//   31   55:astore_2        
		position = i;
	//   32   56:aload_0         
	//   33   57:iload_1         
	//   34   58:putfield        #25  <Field int position>
		if(position < limit)
	//*  35   61:aload_0         
	//*  36   62:getfield        #25  <Field int position>
	//*  37   65:aload_0         
	//*  38   66:getfield        #19  <Field int limit>
	//*  39   69:icmpge          82
			position = position + 1;
	//   40   72:aload_0         
	//   41   73:aload_0         
	//   42   74:getfield        #25  <Field int position>
	//   43   77:iconst_1        
	//   44   78:iadd            
	//   45   79:putfield        #25  <Field int position>
		return s;
	//   46   82:aload_2         
	//   47   83:areturn         
	}

	public String readNullTerminatedString(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            7
			return "";
	//    2    4:ldc1            #129 <String "">
	//    3    6:areturn         
		int j = (position + i) - 1;
	//    4    7:aload_0         
	//    5    8:getfield        #25  <Field int position>
	//    6   11:iload_1         
	//    7   12:iadd            
	//    8   13:iconst_1        
	//    9   14:isub            
	//   10   15:istore_2        
		if(j < limit && data[j] == 0)
	//*  11   16:iload_2         
	//*  12   17:aload_0         
	//*  13   18:getfield        #19  <Field int limit>
	//*  14   21:icmpge          40
	//*  15   24:aload_0         
	//*  16   25:getfield        #17  <Field byte[] data>
	//*  17   28:iload_2         
	//*  18   29:baload          
	//*  19   30:ifne            40
			j = i - 1;
	//   20   33:iload_1         
	//   21   34:iconst_1        
	//   22   35:isub            
	//   23   36:istore_2        
		else
	//*  24   37:goto            42
			j = i;
	//   25   40:iload_1         
	//   26   41:istore_2        
		String s = Util.fromUtf8Bytes(data, position, j);
	//   27   42:aload_0         
	//   28   43:getfield        #17  <Field byte[] data>
	//   29   46:aload_0         
	//   30   47:getfield        #25  <Field int position>
	//   31   50:iload_2         
	//   32   51:invokestatic    #92  <Method String Util.fromUtf8Bytes(byte[], int, int)>
	//   33   54:astore_3        
		position = position + i;
	//   34   55:aload_0         
	//   35   56:aload_0         
	//   36   57:getfield        #25  <Field int position>
	//   37   60:iload_1         
	//   38   61:iadd            
	//   39   62:putfield        #25  <Field int position>
		return s;
	//   40   65:aload_3         
	//   41   66:areturn         
	}

	public short readShort()
	{
		byte abyte0[] = data;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] data>
	//    2    4:astore_3        
		int i = position;
	//    3    5:aload_0         
	//    4    6:getfield        #25  <Field int position>
	//    5    9:istore_1        
		position = i + 1;
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #25  <Field int position>
		i = ((int) (abyte0[i]));
	//   11   17:aload_3         
	//   12   18:iload_1         
	//   13   19:baload          
	//   14   20:istore_1        
		abyte0 = data;
	//   15   21:aload_0         
	//   16   22:getfield        #17  <Field byte[] data>
	//   17   25:astore_3        
		int j = position;
	//   18   26:aload_0         
	//   19   27:getfield        #25  <Field int position>
	//   20   30:istore_2        
		position = j + 1;
	//   21   31:aload_0         
	//   22   32:iload_2         
	//   23   33:iconst_1        
	//   24   34:iadd            
	//   25   35:putfield        #25  <Field int position>
		return (short)((i & 0xff) << 8 | abyte0[j] & 0xff);
	//   26   38:iload_1         
	//   27   39:sipush          255
	//   28   42:iand            
	//   29   43:bipush          8
	//   30   45:ishl            
	//   31   46:aload_3         
	//   32   47:iload_2         
	//   33   48:baload          
	//   34   49:sipush          255
	//   35   52:iand            
	//   36   53:ior             
	//   37   54:int2short       
	//   38   55:ireturn         
	}

	public String readString(int i)
	{
		return readString(i, Charset.forName("UTF-8"));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:ldc1            #133 <String "UTF-8">
	//    3    4:invokestatic    #139 <Method Charset Charset.forName(String)>
	//    4    7:invokevirtual   #142 <Method String readString(int, Charset)>
	//    5   10:areturn         
	}

	public String readString(int i, Charset charset)
	{
		charset = ((Charset) (new String(data, position, i, charset)));
	//    0    0:new             #144 <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field byte[] data>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field int position>
	//    6   12:iload_1         
	//    7   13:aload_2         
	//    8   14:invokespecial   #147 <Method void String(byte[], int, int, Charset)>
	//    9   17:astore_2        
		position = position + i;
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #25  <Field int position>
	//   13   23:iload_1         
	//   14   24:iadd            
	//   15   25:putfield        #25  <Field int position>
		return ((String) (charset));
	//   16   28:aload_2         
	//   17   29:areturn         
	}

	public int readSynchSafeInt()
	{
		return readUnsignedByte() << 21 | readUnsignedByte() << 14 | readUnsignedByte() << 7 | readUnsignedByte();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #151 <Method int readUnsignedByte()>
	//    2    4:bipush          21
	//    3    6:ishl            
	//    4    7:aload_0         
	//    5    8:invokevirtual   #151 <Method int readUnsignedByte()>
	//    6   11:bipush          14
	//    7   13:ishl            
	//    8   14:ior             
	//    9   15:aload_0         
	//   10   16:invokevirtual   #151 <Method int readUnsignedByte()>
	//   11   19:bipush          7
	//   12   21:ishl            
	//   13   22:ior             
	//   14   23:aload_0         
	//   15   24:invokevirtual   #151 <Method int readUnsignedByte()>
	//   16   27:ior             
	//   17   28:ireturn         
	}

	public int readUnsignedByte()
	{
		byte abyte0[] = data;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] data>
	//    2    4:astore_2        
		int i = position;
	//    3    5:aload_0         
	//    4    6:getfield        #25  <Field int position>
	//    5    9:istore_1        
		position = i + 1;
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #25  <Field int position>
		return abyte0[i] & 0xff;
	//   11   17:aload_2         
	//   12   18:iload_1         
	//   13   19:baload          
	//   14   20:sipush          255
	//   15   23:iand            
	//   16   24:ireturn         
	}

	public int readUnsignedFixedPoint1616()
	{
		byte abyte0[] = data;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] data>
	//    2    4:astore_3        
		int i = position;
	//    3    5:aload_0         
	//    4    6:getfield        #25  <Field int position>
	//    5    9:istore_1        
		position = i + 1;
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #25  <Field int position>
		i = ((int) (abyte0[i]));
	//   11   17:aload_3         
	//   12   18:iload_1         
	//   13   19:baload          
	//   14   20:istore_1        
		abyte0 = data;
	//   15   21:aload_0         
	//   16   22:getfield        #17  <Field byte[] data>
	//   17   25:astore_3        
		int j = position;
	//   18   26:aload_0         
	//   19   27:getfield        #25  <Field int position>
	//   20   30:istore_2        
		position = j + 1;
	//   21   31:aload_0         
	//   22   32:iload_2         
	//   23   33:iconst_1        
	//   24   34:iadd            
	//   25   35:putfield        #25  <Field int position>
		j = ((int) (abyte0[j]));
	//   26   38:aload_3         
	//   27   39:iload_2         
	//   28   40:baload          
	//   29   41:istore_2        
		position = position + 2;
	//   30   42:aload_0         
	//   31   43:aload_0         
	//   32   44:getfield        #25  <Field int position>
	//   33   47:iconst_2        
	//   34   48:iadd            
	//   35   49:putfield        #25  <Field int position>
		return (i & 0xff) << 8 | j & 0xff;
	//   36   52:iload_1         
	//   37   53:sipush          255
	//   38   56:iand            
	//   39   57:bipush          8
	//   40   59:ishl            
	//   41   60:iload_2         
	//   42   61:sipush          255
	//   43   64:iand            
	//   44   65:ior             
	//   45   66:ireturn         
	}

	public long readUnsignedInt()
	{
		byte abyte0[] = data;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] data>
	//    2    4:astore          8
		int i = position;
	//    3    6:aload_0         
	//    4    7:getfield        #25  <Field int position>
	//    5   10:istore_1        
		position = i + 1;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:iconst_1        
	//    9   14:iadd            
	//   10   15:putfield        #25  <Field int position>
		long l = abyte0[i];
	//   11   18:aload           8
	//   12   20:iload_1         
	//   13   21:baload          
	//   14   22:i2l             
	//   15   23:lstore_2        
		abyte0 = data;
	//   16   24:aload_0         
	//   17   25:getfield        #17  <Field byte[] data>
	//   18   28:astore          8
		i = position;
	//   19   30:aload_0         
	//   20   31:getfield        #25  <Field int position>
	//   21   34:istore_1        
		position = i + 1;
	//   22   35:aload_0         
	//   23   36:iload_1         
	//   24   37:iconst_1        
	//   25   38:iadd            
	//   26   39:putfield        #25  <Field int position>
		long l1 = abyte0[i];
	//   27   42:aload           8
	//   28   44:iload_1         
	//   29   45:baload          
	//   30   46:i2l             
	//   31   47:lstore          4
		abyte0 = data;
	//   32   49:aload_0         
	//   33   50:getfield        #17  <Field byte[] data>
	//   34   53:astore          8
		i = position;
	//   35   55:aload_0         
	//   36   56:getfield        #25  <Field int position>
	//   37   59:istore_1        
		position = i + 1;
	//   38   60:aload_0         
	//   39   61:iload_1         
	//   40   62:iconst_1        
	//   41   63:iadd            
	//   42   64:putfield        #25  <Field int position>
		long l2 = abyte0[i];
	//   43   67:aload           8
	//   44   69:iload_1         
	//   45   70:baload          
	//   46   71:i2l             
	//   47   72:lstore          6
		abyte0 = data;
	//   48   74:aload_0         
	//   49   75:getfield        #17  <Field byte[] data>
	//   50   78:astore          8
		i = position;
	//   51   80:aload_0         
	//   52   81:getfield        #25  <Field int position>
	//   53   84:istore_1        
		position = i + 1;
	//   54   85:aload_0         
	//   55   86:iload_1         
	//   56   87:iconst_1        
	//   57   88:iadd            
	//   58   89:putfield        #25  <Field int position>
		return (l & 255L) << 24 | (l1 & 255L) << 16 | (l2 & 255L) << 8 | (long)abyte0[i] & 255L;
	//   59   92:lload_2         
	//   60   93:ldc2w           #96  <Long 255L>
	//   61   96:land            
	//   62   97:bipush          24
	//   63   99:lshl            
	//   64  100:lload           4
	//   65  102:ldc2w           #96  <Long 255L>
	//   66  105:land            
	//   67  106:bipush          16
	//   68  108:lshl            
	//   69  109:lor             
	//   70  110:lload           6
	//   71  112:ldc2w           #96  <Long 255L>
	//   72  115:land            
	//   73  116:bipush          8
	//   74  118:lshl            
	//   75  119:lor             
	//   76  120:aload           8
	//   77  122:iload_1         
	//   78  123:baload          
	//   79  124:i2l             
	//   80  125:ldc2w           #96  <Long 255L>
	//   81  128:land            
	//   82  129:lor             
	//   83  130:lreturn         
	}

	public int readUnsignedInt24()
	{
		byte abyte0[] = data;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] data>
	//    2    4:astore          4
		int i = position;
	//    3    6:aload_0         
	//    4    7:getfield        #25  <Field int position>
	//    5   10:istore_1        
		position = i + 1;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:iconst_1        
	//    9   14:iadd            
	//   10   15:putfield        #25  <Field int position>
		i = ((int) (abyte0[i]));
	//   11   18:aload           4
	//   12   20:iload_1         
	//   13   21:baload          
	//   14   22:istore_1        
		abyte0 = data;
	//   15   23:aload_0         
	//   16   24:getfield        #17  <Field byte[] data>
	//   17   27:astore          4
		int j = position;
	//   18   29:aload_0         
	//   19   30:getfield        #25  <Field int position>
	//   20   33:istore_2        
		position = j + 1;
	//   21   34:aload_0         
	//   22   35:iload_2         
	//   23   36:iconst_1        
	//   24   37:iadd            
	//   25   38:putfield        #25  <Field int position>
		j = ((int) (abyte0[j]));
	//   26   41:aload           4
	//   27   43:iload_2         
	//   28   44:baload          
	//   29   45:istore_2        
		abyte0 = data;
	//   30   46:aload_0         
	//   31   47:getfield        #17  <Field byte[] data>
	//   32   50:astore          4
		int k = position;
	//   33   52:aload_0         
	//   34   53:getfield        #25  <Field int position>
	//   35   56:istore_3        
		position = k + 1;
	//   36   57:aload_0         
	//   37   58:iload_3         
	//   38   59:iconst_1        
	//   39   60:iadd            
	//   40   61:putfield        #25  <Field int position>
		return (i & 0xff) << 16 | (j & 0xff) << 8 | abyte0[k] & 0xff;
	//   41   64:iload_1         
	//   42   65:sipush          255
	//   43   68:iand            
	//   44   69:bipush          16
	//   45   71:ishl            
	//   46   72:iload_2         
	//   47   73:sipush          255
	//   48   76:iand            
	//   49   77:bipush          8
	//   50   79:ishl            
	//   51   80:ior             
	//   52   81:aload           4
	//   53   83:iload_3         
	//   54   84:baload          
	//   55   85:sipush          255
	//   56   88:iand            
	//   57   89:ior             
	//   58   90:ireturn         
	}

	public int readUnsignedIntToInt()
	{
		int i = readInt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method int readInt()>
	//    2    4:istore_1        
		if(i < 0)
	//*   3    5:iload_1         
	//*   4    6:ifge            42
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5    9:new             #106 <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #107 <Method void StringBuilder()>
	//    8   16:astore_2        
			stringbuilder.append("Top bit not zero: ");
	//    9   17:aload_2         
	//   10   18:ldc1            #109 <String "Top bit not zero: ">
	//   11   20:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
			stringbuilder.append(i);
	//   13   24:aload_2         
	//   14   25:iload_1         
	//   15   26:invokevirtual   #116 <Method StringBuilder StringBuilder.append(int)>
	//   16   29:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   17   30:new             #118 <Class IllegalStateException>
	//   18   33:dup             
	//   19   34:aload_2         
	//   20   35:invokevirtual   #121 <Method String StringBuilder.toString()>
	//   21   38:invokespecial   #124 <Method void IllegalStateException(String)>
	//   22   41:athrow          
		} else
		{
			return i;
	//   23   42:iload_1         
	//   24   43:ireturn         
		}
	}

	public long readUnsignedLongToLong()
	{
		long l = readLong();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #60  <Method long readLong()>
	//    2    4:lstore_1        
		if(l < 0L)
	//*   3    5:lload_1         
	//*   4    6:lconst_0        
	//*   5    7:lcmp            
	//*   6    8:ifge            44
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    7   11:new             #106 <Class StringBuilder>
	//    8   14:dup             
	//    9   15:invokespecial   #107 <Method void StringBuilder()>
	//   10   18:astore_3        
			stringbuilder.append("Top bit not zero: ");
	//   11   19:aload_3         
	//   12   20:ldc1            #109 <String "Top bit not zero: ">
	//   13   22:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   14   25:pop             
			stringbuilder.append(l);
	//   15   26:aload_3         
	//   16   27:lload_1         
	//   17   28:invokevirtual   #159 <Method StringBuilder StringBuilder.append(long)>
	//   18   31:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   19   32:new             #118 <Class IllegalStateException>
	//   20   35:dup             
	//   21   36:aload_3         
	//   22   37:invokevirtual   #121 <Method String StringBuilder.toString()>
	//   23   40:invokespecial   #124 <Method void IllegalStateException(String)>
	//   24   43:athrow          
		} else
		{
			return l;
	//   25   44:lload_1         
	//   26   45:lreturn         
		}
	}

	public int readUnsignedShort()
	{
		byte abyte0[] = data;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] data>
	//    2    4:astore_3        
		int i = position;
	//    3    5:aload_0         
	//    4    6:getfield        #25  <Field int position>
	//    5    9:istore_1        
		position = i + 1;
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #25  <Field int position>
		i = ((int) (abyte0[i]));
	//   11   17:aload_3         
	//   12   18:iload_1         
	//   13   19:baload          
	//   14   20:istore_1        
		abyte0 = data;
	//   15   21:aload_0         
	//   16   22:getfield        #17  <Field byte[] data>
	//   17   25:astore_3        
		int j = position;
	//   18   26:aload_0         
	//   19   27:getfield        #25  <Field int position>
	//   20   30:istore_2        
		position = j + 1;
	//   21   31:aload_0         
	//   22   32:iload_2         
	//   23   33:iconst_1        
	//   24   34:iadd            
	//   25   35:putfield        #25  <Field int position>
		return (i & 0xff) << 8 | abyte0[j] & 0xff;
	//   26   38:iload_1         
	//   27   39:sipush          255
	//   28   42:iand            
	//   29   43:bipush          8
	//   30   45:ishl            
	//   31   46:aload_3         
	//   32   47:iload_2         
	//   33   48:baload          
	//   34   49:sipush          255
	//   35   52:iand            
	//   36   53:ior             
	//   37   54:ireturn         
	}

	public long readUtf8EncodedLong()
	{
		int i;
		int j;
		long l;
label0:
		{
			l = data[position];
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] data>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field int position>
	//    4    8:baload          
	//    5    9:i2l             
	//    6   10:lstore          4
			i = 7;
	//    7   12:bipush          7
	//    8   14:istore_1        
			do
			{
				j = 1;
	//    9   15:iconst_1        
	//   10   16:istore_2        
				if(i < 0)
					break;
	//   11   17:iload_1         
	//   12   18:iflt            76
				int k = 1 << i;
	//   13   21:iconst_1        
	//   14   22:iload_1         
	//   15   23:ishl            
	//   16   24:istore_3        
				if((l & (long)k) == 0L)
	//*  17   25:lload           4
	//*  18   27:iload_3         
	//*  19   28:i2l             
	//*  20   29:land            
	//*  21   30:lconst_0        
	//*  22   31:lcmp            
	//*  23   32:ifne            69
				{
					if(i < 6)
	//*  24   35:iload_1         
	//*  25   36:bipush          6
	//*  26   38:icmpge          58
					{
						l &= k - 1;
	//   27   41:lload           4
	//   28   43:iload_3         
	//   29   44:iconst_1        
	//   30   45:isub            
	//   31   46:i2l             
	//   32   47:land            
	//   33   48:lstore          4
						i = 7 - i;
	//   34   50:bipush          7
	//   35   52:iload_1         
	//   36   53:isub            
	//   37   54:istore_1        
					} else
	//*  38   55:goto            78
					{
						if(i != 7)
							break;
	//   39   58:iload_1         
	//   40   59:bipush          7
	//   41   61:icmpne          76
						i = 1;
	//   42   64:iconst_1        
	//   43   65:istore_1        
					}
					break label0;
	//   44   66:goto            78
				}
				i--;
	//   45   69:iload_1         
	//   46   70:iconst_1        
	//   47   71:isub            
	//   48   72:istore_1        
			} while(true);
	//   49   73:goto            15
			i = 0;
	//   50   76:iconst_0        
	//   51   77:istore_1        
		}
		long l1 = l;
	//   52   78:lload           4
	//   53   80:lstore          6
		if(i == 0)
	//*  54   82:iload_1         
	//*  55   83:ifne            124
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   56   86:new             #106 <Class StringBuilder>
	//   57   89:dup             
	//   58   90:invokespecial   #107 <Method void StringBuilder()>
	//   59   93:astore          8
			stringbuilder.append("Invalid UTF-8 sequence first byte: ");
	//   60   95:aload           8
	//   61   97:ldc1            #163 <String "Invalid UTF-8 sequence first byte: ">
	//   62   99:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   63  102:pop             
			stringbuilder.append(l);
	//   64  103:aload           8
	//   65  105:lload           4
	//   66  107:invokevirtual   #159 <Method StringBuilder StringBuilder.append(long)>
	//   67  110:pop             
			throw new NumberFormatException(stringbuilder.toString());
	//   68  111:new             #165 <Class NumberFormatException>
	//   69  114:dup             
	//   70  115:aload           8
	//   71  117:invokevirtual   #121 <Method String StringBuilder.toString()>
	//   72  120:invokespecial   #166 <Method void NumberFormatException(String)>
	//   73  123:athrow          
		}
		for(; j < i; j++)
	//*  74  124:iload_2         
	//*  75  125:iload_1         
	//*  76  126:icmpge          210
		{
			byte byte0 = data[position + j];
	//   77  129:aload_0         
	//   78  130:getfield        #17  <Field byte[] data>
	//   79  133:aload_0         
	//   80  134:getfield        #25  <Field int position>
	//   81  137:iload_2         
	//   82  138:iadd            
	//   83  139:baload          
	//   84  140:istore_3        
			if((byte0 & 0xc0) != 128)
	//*  85  141:iload_3         
	//*  86  142:sipush          192
	//*  87  145:iand            
	//*  88  146:sipush          128
	//*  89  149:icmpeq          190
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   90  152:new             #106 <Class StringBuilder>
	//   91  155:dup             
	//   92  156:invokespecial   #107 <Method void StringBuilder()>
	//   93  159:astore          8
				stringbuilder1.append("Invalid UTF-8 sequence continuation byte: ");
	//   94  161:aload           8
	//   95  163:ldc1            #168 <String "Invalid UTF-8 sequence continuation byte: ">
	//   96  165:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   97  168:pop             
				stringbuilder1.append(l1);
	//   98  169:aload           8
	//   99  171:lload           6
	//  100  173:invokevirtual   #159 <Method StringBuilder StringBuilder.append(long)>
	//  101  176:pop             
				throw new NumberFormatException(stringbuilder1.toString());
	//  102  177:new             #165 <Class NumberFormatException>
	//  103  180:dup             
	//  104  181:aload           8
	//  105  183:invokevirtual   #121 <Method String StringBuilder.toString()>
	//  106  186:invokespecial   #166 <Method void NumberFormatException(String)>
	//  107  189:athrow          
			}
			l1 = l1 << 6 | (long)(byte0 & 0x3f);
	//  108  190:lload           6
	//  109  192:bipush          6
	//  110  194:lshl            
	//  111  195:iload_3         
	//  112  196:bipush          63
	//  113  198:iand            
	//  114  199:i2l             
	//  115  200:lor             
	//  116  201:lstore          6
		}

	//  117  203:iload_2         
	//  118  204:iconst_1        
	//  119  205:iadd            
	//  120  206:istore_2        
	//* 121  207:goto            124
		position = position + i;
	//  122  210:aload_0         
	//  123  211:aload_0         
	//  124  212:getfield        #25  <Field int position>
	//  125  215:iload_1         
	//  126  216:iadd            
	//  127  217:putfield        #25  <Field int position>
		return l1;
	//  128  220:lload           6
	//  129  222:lreturn         
	}

	public void reset()
	{
		position = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #25  <Field int position>
		limit = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #19  <Field int limit>
	//    6   10:return          
	}

	public void reset(int i)
	{
		byte abyte0[];
		if(capacity() < i)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #171 <Method int capacity()>
	//*   2    4:iload_1         
	//*   3    5:icmpge          15
			abyte0 = new byte[i];
	//    4    8:iload_1         
	//    5    9:newarray        byte[]
	//    6   11:astore_2        
		else
	//*   7   12:goto            20
			abyte0 = data;
	//    8   15:aload_0         
	//    9   16:getfield        #17  <Field byte[] data>
	//   10   19:astore_2        
		reset(abyte0, i);
	//   11   20:aload_0         
	//   12   21:aload_2         
	//   13   22:iload_1         
	//   14   23:invokevirtual   #173 <Method void reset(byte[], int)>
	//   15   26:return          
	}

	public void reset(byte abyte0[], int i)
	{
		data = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field byte[] data>
		limit = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #19  <Field int limit>
		position = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #25  <Field int position>
	//    9   15:return          
	}

	public void setLimit(int i)
	{
		boolean flag;
		if(i >= 0 && i <= data.length)
	//*   0    0:iload_1         
	//*   1    1:iflt            18
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #17  <Field byte[] data>
	//*   5    9:arraylength     
	//*   6   10:icmpgt          18
			flag = true;
	//    7   13:iconst_1        
	//    8   14:istore_2        
		else
	//*   9   15:goto            20
			flag = false;
	//   10   18:iconst_0        
	//   11   19:istore_2        
		Assertions.checkArgument(flag);
	//   12   20:iload_2         
	//   13   21:invokestatic    #180 <Method void Assertions.checkArgument(boolean)>
		limit = i;
	//   14   24:aload_0         
	//   15   25:iload_1         
	//   16   26:putfield        #19  <Field int limit>
	//   17   29:return          
	}

	public void setPosition(int i)
	{
		boolean flag;
		if(i >= 0 && i <= limit)
	//*   0    0:iload_1         
	//*   1    1:iflt            17
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #19  <Field int limit>
	//*   5    9:icmpgt          17
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
	//   12   20:invokestatic    #180 <Method void Assertions.checkArgument(boolean)>
		position = i;
	//   13   23:aload_0         
	//   14   24:iload_1         
	//   15   25:putfield        #25  <Field int position>
	//   16   28:return          
	}

	public void skipBytes(int i)
	{
		setPosition(position + i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #25  <Field int position>
	//    3    5:iload_1         
	//    4    6:iadd            
	//    5    7:invokevirtual   #182 <Method void setPosition(int)>
	//    6   10:return          
	}

	public byte data[];
	private int limit;
	private int position;
}
