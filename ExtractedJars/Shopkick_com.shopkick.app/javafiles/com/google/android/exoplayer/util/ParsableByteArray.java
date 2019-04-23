// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.util;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

// Referenced classes of package com.google.android.exoplayer.util:
//			ParsableBitArray, Assertions

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
		limit = data.length;
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:getfield        #17  <Field byte[] data>
	//    9   16:arraylength     
	//   10   17:putfield        #19  <Field int limit>
	//   11   20:return          
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
		byte abyte0[] = data;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] data>
	//    2    4:astore_1        
		if(abyte0 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return abyte0.length;
	//    7   11:aload_1         
	//    8   12:arraylength     
	//    9   13:ireturn         
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

	public void readBytes(ParsableBitArray parsablebitarray, int i)
	{
		readBytes(parsablebitarray.data, 0, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #32  <Field byte[] ParsableBitArray.data>
	//    3    5:iconst_0        
	//    4    6:iload_2         
	//    5    7:invokevirtual   #35  <Method void readBytes(byte[], int, int)>
		parsablebitarray.setPosition(0);
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #38  <Method void ParsableBitArray.setPosition(int)>
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
	//    6   10:invokevirtual   #45  <Method ByteBuffer ByteBuffer.put(byte[], int, int)>
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
	//    7   11:invokestatic    #51  <Method void System.arraycopy(Object, int, Object, int, int)>
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
	//    1    1:invokevirtual   #57  <Method long readLong()>
	//    2    4:invokestatic    #63  <Method double Double.longBitsToDouble(long)>
	//    3    7:dreturn         
	}

	public float readFloat()
	{
		return Float.intBitsToFloat(readInt());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #68  <Method int readInt()>
	//    2    4:invokestatic    #74  <Method float Float.intBitsToFloat(int)>
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
		int j = position;
	//   15   23:aload_0         
	//   16   24:getfield        #25  <Field int position>
	//   17   27:istore_2        
		position = j + 1;
	//   18   28:aload_0         
	//   19   29:iload_2         
	//   20   30:iconst_1        
	//   21   31:iadd            
	//   22   32:putfield        #25  <Field int position>
		j = ((int) (abyte0[j]));
	//   23   35:aload           5
	//   24   37:iload_2         
	//   25   38:baload          
	//   26   39:istore_2        
		int k = position;
	//   27   40:aload_0         
	//   28   41:getfield        #25  <Field int position>
	//   29   44:istore_3        
		position = k + 1;
	//   30   45:aload_0         
	//   31   46:iload_3         
	//   32   47:iconst_1        
	//   33   48:iadd            
	//   34   49:putfield        #25  <Field int position>
		k = ((int) (abyte0[k]));
	//   35   52:aload           5
	//   36   54:iload_3         
	//   37   55:baload          
	//   38   56:istore_3        
		int l = position;
	//   39   57:aload_0         
	//   40   58:getfield        #25  <Field int position>
	//   41   61:istore          4
		position = l + 1;
	//   42   63:aload_0         
	//   43   64:iload           4
	//   44   66:iconst_1        
	//   45   67:iadd            
	//   46   68:putfield        #25  <Field int position>
		return abyte0[l] & 0xff | ((i & 0xff) << 24 | (j & 0xff) << 16 | (k & 0xff) << 8);
	//   47   71:aload           5
	//   48   73:iload           4
	//   49   75:baload          
	//   50   76:sipush          255
	//   51   79:iand            
	//   52   80:iload_1         
	//   53   81:sipush          255
	//   54   84:iand            
	//   55   85:bipush          24
	//   56   87:ishl            
	//   57   88:iload_2         
	//   58   89:sipush          255
	//   59   92:iand            
	//   60   93:bipush          16
	//   61   95:ishl            
	//   62   96:ior             
	//   63   97:iload_3         
	//   64   98:sipush          255
	//   65  101:iand            
	//   66  102:bipush          8
	//   67  104:ishl            
	//   68  105:ior             
	//   69  106:ior             
	//   70  107:ireturn         
	}

	public String readLine()
	{
		if(bytesLeft() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #78  <Method int bytesLeft()>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		int i = position;
	//    5    9:aload_0         
	//    6   10:getfield        #25  <Field int position>
	//    7   13:istore_1        
		do
		{
			if(i >= limit)
				break;
	//    8   14:iload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #19  <Field int limit>
	//   11   19:icmpge          50
			byte abyte0[] = data;
	//   12   22:aload_0         
	//   13   23:getfield        #17  <Field byte[] data>
	//   14   26:astore_3        
			if(abyte0[i] == 10 || abyte0[i] == 13)
				break;
	//   15   27:aload_3         
	//   16   28:iload_1         
	//   17   29:baload          
	//   18   30:bipush          10
	//   19   32:icmpeq          50
	//   20   35:aload_3         
	//   21   36:iload_1         
	//   22   37:baload          
	//   23   38:bipush          13
	//   24   40:icmpeq          50
			i++;
	//   25   43:iload_1         
	//   26   44:iconst_1        
	//   27   45:iadd            
	//   28   46:istore_1        
		} while(true);
	//   29   47:goto            14
		int j = position;
	//   30   50:aload_0         
	//   31   51:getfield        #25  <Field int position>
	//   32   54:istore_2        
		if(i - j >= 3)
	//*  33   55:iload_1         
	//*  34   56:iload_2         
	//*  35   57:isub            
	//*  36   58:iconst_3        
	//*  37   59:icmplt          102
		{
			byte abyte1[] = data;
	//   38   62:aload_0         
	//   39   63:getfield        #17  <Field byte[] data>
	//   40   66:astore_3        
			if(abyte1[j] == -17 && abyte1[j + 1] == -69 && abyte1[j + 2] == -65)
	//*  41   67:aload_3         
	//*  42   68:iload_2         
	//*  43   69:baload          
	//*  44   70:bipush          -17
	//*  45   72:icmpne          102
	//*  46   75:aload_3         
	//*  47   76:iload_2         
	//*  48   77:iconst_1        
	//*  49   78:iadd            
	//*  50   79:baload          
	//*  51   80:bipush          -69
	//*  52   82:icmpne          102
	//*  53   85:aload_3         
	//*  54   86:iload_2         
	//*  55   87:iconst_2        
	//*  56   88:iadd            
	//*  57   89:baload          
	//*  58   90:bipush          -65
	//*  59   92:icmpne          102
				position = j + 3;
	//   60   95:aload_0         
	//   61   96:iload_2         
	//   62   97:iconst_3        
	//   63   98:iadd            
	//   64   99:putfield        #25  <Field int position>
		}
		byte abyte2[] = data;
	//   65  102:aload_0         
	//   66  103:getfield        #17  <Field byte[] data>
	//   67  106:astore_3        
		j = position;
	//   68  107:aload_0         
	//   69  108:getfield        #25  <Field int position>
	//   70  111:istore_2        
		String s = new String(abyte2, j, i - j);
	//   71  112:new             #80  <Class String>
	//   72  115:dup             
	//   73  116:aload_3         
	//   74  117:iload_2         
	//   75  118:iload_1         
	//   76  119:iload_2         
	//   77  120:isub            
	//   78  121:invokespecial   #82  <Method void String(byte[], int, int)>
	//   79  124:astore_3        
		position = i;
	//   80  125:aload_0         
	//   81  126:iload_1         
	//   82  127:putfield        #25  <Field int position>
		i = position;
	//   83  130:aload_0         
	//   84  131:getfield        #25  <Field int position>
	//   85  134:istore_1        
		j = limit;
	//   86  135:aload_0         
	//   87  136:getfield        #19  <Field int limit>
	//   88  139:istore_2        
		if(i == j)
	//*  89  140:iload_1         
	//*  90  141:iload_2         
	//*  91  142:icmpne          147
			return s;
	//   92  145:aload_3         
	//   93  146:areturn         
		if(data[i] == 13)
	//*  94  147:aload_0         
	//*  95  148:getfield        #17  <Field byte[] data>
	//*  96  151:iload_1         
	//*  97  152:baload          
	//*  98  153:bipush          13
	//*  99  155:icmpne          175
		{
			position = i + 1;
	//  100  158:aload_0         
	//  101  159:iload_1         
	//  102  160:iconst_1        
	//  103  161:iadd            
	//  104  162:putfield        #25  <Field int position>
			if(position == j)
	//* 105  165:aload_0         
	//* 106  166:getfield        #25  <Field int position>
	//* 107  169:iload_2         
	//* 108  170:icmpne          175
				return s;
	//  109  173:aload_3         
	//  110  174:areturn         
		}
		byte abyte3[] = data;
	//  111  175:aload_0         
	//  112  176:getfield        #17  <Field byte[] data>
	//  113  179:astore          4
		i = position;
	//  114  181:aload_0         
	//  115  182:getfield        #25  <Field int position>
	//  116  185:istore_1        
		if(abyte3[i] == 10)
	//* 117  186:aload           4
	//* 118  188:iload_1         
	//* 119  189:baload          
	//* 120  190:bipush          10
	//* 121  192:icmpne          202
			position = i + 1;
	//  122  195:aload_0         
	//  123  196:iload_1         
	//  124  197:iconst_1        
	//  125  198:iadd            
	//  126  199:putfield        #25  <Field int position>
		return s;
	//  127  202:aload_3         
	//  128  203:areturn         
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
		int j = position;
	//   15   23:aload_0         
	//   16   24:getfield        #25  <Field int position>
	//   17   27:istore_2        
		position = j + 1;
	//   18   28:aload_0         
	//   19   29:iload_2         
	//   20   30:iconst_1        
	//   21   31:iadd            
	//   22   32:putfield        #25  <Field int position>
		j = ((int) (abyte0[j]));
	//   23   35:aload           5
	//   24   37:iload_2         
	//   25   38:baload          
	//   26   39:istore_2        
		int k = position;
	//   27   40:aload_0         
	//   28   41:getfield        #25  <Field int position>
	//   29   44:istore_3        
		position = k + 1;
	//   30   45:aload_0         
	//   31   46:iload_3         
	//   32   47:iconst_1        
	//   33   48:iadd            
	//   34   49:putfield        #25  <Field int position>
		k = ((int) (abyte0[k]));
	//   35   52:aload           5
	//   36   54:iload_3         
	//   37   55:baload          
	//   38   56:istore_3        
		int l = position;
	//   39   57:aload_0         
	//   40   58:getfield        #25  <Field int position>
	//   41   61:istore          4
		position = l + 1;
	//   42   63:aload_0         
	//   43   64:iload           4
	//   44   66:iconst_1        
	//   45   67:iadd            
	//   46   68:putfield        #25  <Field int position>
		return (abyte0[l] & 0xff) << 24 | (i & 0xff | (j & 0xff) << 8 | (k & 0xff) << 16);
	//   47   71:aload           5
	//   48   73:iload           4
	//   49   75:baload          
	//   50   76:sipush          255
	//   51   79:iand            
	//   52   80:bipush          24
	//   53   82:ishl            
	//   54   83:iload_1         
	//   55   84:sipush          255
	//   56   87:iand            
	//   57   88:iload_2         
	//   58   89:sipush          255
	//   59   92:iand            
	//   60   93:bipush          8
	//   61   95:ishl            
	//   62   96:ior             
	//   63   97:iload_3         
	//   64   98:sipush          255
	//   65  101:iand            
	//   66  102:bipush          16
	//   67  104:ishl            
	//   68  105:ior             
	//   69  106:ior             
	//   70  107:ireturn         
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
		int j = position;
	//   15   23:aload_0         
	//   16   24:getfield        #25  <Field int position>
	//   17   27:istore_2        
		position = j + 1;
	//   18   28:aload_0         
	//   19   29:iload_2         
	//   20   30:iconst_1        
	//   21   31:iadd            
	//   22   32:putfield        #25  <Field int position>
		j = ((int) (abyte0[j]));
	//   23   35:aload           4
	//   24   37:iload_2         
	//   25   38:baload          
	//   26   39:istore_2        
		int k = position;
	//   27   40:aload_0         
	//   28   41:getfield        #25  <Field int position>
	//   29   44:istore_3        
		position = k + 1;
	//   30   45:aload_0         
	//   31   46:iload_3         
	//   32   47:iconst_1        
	//   33   48:iadd            
	//   34   49:putfield        #25  <Field int position>
		return (abyte0[k] & 0xff) << 16 | (i & 0xff | (j & 0xff) << 8);
	//   35   52:aload           4
	//   36   54:iload_3         
	//   37   55:baload          
	//   38   56:sipush          255
	//   39   59:iand            
	//   40   60:bipush          16
	//   41   62:ishl            
	//   42   63:iload_1         
	//   43   64:sipush          255
	//   44   67:iand            
	//   45   68:iload_2         
	//   46   69:sipush          255
	//   47   72:iand            
	//   48   73:bipush          8
	//   49   75:ishl            
	//   50   76:ior             
	//   51   77:ior             
	//   52   78:ireturn         
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
		i = position;
	//   16   24:aload_0         
	//   17   25:getfield        #25  <Field int position>
	//   18   28:istore_1        
		position = i + 1;
	//   19   29:aload_0         
	//   20   30:iload_1         
	//   21   31:iconst_1        
	//   22   32:iadd            
	//   23   33:putfield        #25  <Field int position>
		long l1 = abyte0[i];
	//   24   36:aload           16
	//   25   38:iload_1         
	//   26   39:baload          
	//   27   40:i2l             
	//   28   41:lstore          4
		i = position;
	//   29   43:aload_0         
	//   30   44:getfield        #25  <Field int position>
	//   31   47:istore_1        
		position = i + 1;
	//   32   48:aload_0         
	//   33   49:iload_1         
	//   34   50:iconst_1        
	//   35   51:iadd            
	//   36   52:putfield        #25  <Field int position>
		long l2 = abyte0[i];
	//   37   55:aload           16
	//   38   57:iload_1         
	//   39   58:baload          
	//   40   59:i2l             
	//   41   60:lstore          6
		i = position;
	//   42   62:aload_0         
	//   43   63:getfield        #25  <Field int position>
	//   44   66:istore_1        
		position = i + 1;
	//   45   67:aload_0         
	//   46   68:iload_1         
	//   47   69:iconst_1        
	//   48   70:iadd            
	//   49   71:putfield        #25  <Field int position>
		long l3 = abyte0[i];
	//   50   74:aload           16
	//   51   76:iload_1         
	//   52   77:baload          
	//   53   78:i2l             
	//   54   79:lstore          8
		i = position;
	//   55   81:aload_0         
	//   56   82:getfield        #25  <Field int position>
	//   57   85:istore_1        
		position = i + 1;
	//   58   86:aload_0         
	//   59   87:iload_1         
	//   60   88:iconst_1        
	//   61   89:iadd            
	//   62   90:putfield        #25  <Field int position>
		long l4 = abyte0[i];
	//   63   93:aload           16
	//   64   95:iload_1         
	//   65   96:baload          
	//   66   97:i2l             
	//   67   98:lstore          10
		i = position;
	//   68  100:aload_0         
	//   69  101:getfield        #25  <Field int position>
	//   70  104:istore_1        
		position = i + 1;
	//   71  105:aload_0         
	//   72  106:iload_1         
	//   73  107:iconst_1        
	//   74  108:iadd            
	//   75  109:putfield        #25  <Field int position>
		long l5 = abyte0[i];
	//   76  112:aload           16
	//   77  114:iload_1         
	//   78  115:baload          
	//   79  116:i2l             
	//   80  117:lstore          12
		i = position;
	//   81  119:aload_0         
	//   82  120:getfield        #25  <Field int position>
	//   83  123:istore_1        
		position = i + 1;
	//   84  124:aload_0         
	//   85  125:iload_1         
	//   86  126:iconst_1        
	//   87  127:iadd            
	//   88  128:putfield        #25  <Field int position>
		long l6 = abyte0[i];
	//   89  131:aload           16
	//   90  133:iload_1         
	//   91  134:baload          
	//   92  135:i2l             
	//   93  136:lstore          14
		i = position;
	//   94  138:aload_0         
	//   95  139:getfield        #25  <Field int position>
	//   96  142:istore_1        
		position = i + 1;
	//   97  143:aload_0         
	//   98  144:iload_1         
	//   99  145:iconst_1        
	//  100  146:iadd            
	//  101  147:putfield        #25  <Field int position>
		return l & 255L | (l1 & 255L) << 8 | (l2 & 255L) << 16 | (l3 & 255L) << 24 | (l4 & 255L) << 32 | (l5 & 255L) << 40 | (l6 & 255L) << 48 | (255L & (long)abyte0[i]) << 56;
	//  102  150:lload_2         
	//  103  151:ldc2w           #86  <Long 255L>
	//  104  154:land            
	//  105  155:lload           4
	//  106  157:ldc2w           #86  <Long 255L>
	//  107  160:land            
	//  108  161:bipush          8
	//  109  163:lshl            
	//  110  164:lor             
	//  111  165:lload           6
	//  112  167:ldc2w           #86  <Long 255L>
	//  113  170:land            
	//  114  171:bipush          16
	//  115  173:lshl            
	//  116  174:lor             
	//  117  175:lload           8
	//  118  177:ldc2w           #86  <Long 255L>
	//  119  180:land            
	//  120  181:bipush          24
	//  121  183:lshl            
	//  122  184:lor             
	//  123  185:lload           10
	//  124  187:ldc2w           #86  <Long 255L>
	//  125  190:land            
	//  126  191:bipush          32
	//  127  193:lshl            
	//  128  194:lor             
	//  129  195:lload           12
	//  130  197:ldc2w           #86  <Long 255L>
	//  131  200:land            
	//  132  201:bipush          40
	//  133  203:lshl            
	//  134  204:lor             
	//  135  205:lload           14
	//  136  207:ldc2w           #86  <Long 255L>
	//  137  210:land            
	//  138  211:bipush          48
	//  139  213:lshl            
	//  140  214:lor             
	//  141  215:ldc2w           #86  <Long 255L>
	//  142  218:aload           16
	//  143  220:iload_1         
	//  144  221:baload          
	//  145  222:i2l             
	//  146  223:land            
	//  147  224:bipush          56
	//  148  226:lshl            
	//  149  227:lor             
	//  150  228:lreturn         
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
		int j = position;
	//   15   21:aload_0         
	//   16   22:getfield        #25  <Field int position>
	//   17   25:istore_2        
		position = j + 1;
	//   18   26:aload_0         
	//   19   27:iload_2         
	//   20   28:iconst_1        
	//   21   29:iadd            
	//   22   30:putfield        #25  <Field int position>
		return (short)((abyte0[j] & 0xff) << 8 | i & 0xff);
	//   23   33:aload_3         
	//   24   34:iload_2         
	//   25   35:baload          
	//   26   36:sipush          255
	//   27   39:iand            
	//   28   40:bipush          8
	//   29   42:ishl            
	//   30   43:iload_1         
	//   31   44:sipush          255
	//   32   47:iand            
	//   33   48:ior             
	//   34   49:int2short       
	//   35   50:ireturn         
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
		i = position;
	//   16   24:aload_0         
	//   17   25:getfield        #25  <Field int position>
	//   18   28:istore_1        
		position = i + 1;
	//   19   29:aload_0         
	//   20   30:iload_1         
	//   21   31:iconst_1        
	//   22   32:iadd            
	//   23   33:putfield        #25  <Field int position>
		long l1 = abyte0[i];
	//   24   36:aload           8
	//   25   38:iload_1         
	//   26   39:baload          
	//   27   40:i2l             
	//   28   41:lstore          4
		i = position;
	//   29   43:aload_0         
	//   30   44:getfield        #25  <Field int position>
	//   31   47:istore_1        
		position = i + 1;
	//   32   48:aload_0         
	//   33   49:iload_1         
	//   34   50:iconst_1        
	//   35   51:iadd            
	//   36   52:putfield        #25  <Field int position>
		long l2 = abyte0[i];
	//   37   55:aload           8
	//   38   57:iload_1         
	//   39   58:baload          
	//   40   59:i2l             
	//   41   60:lstore          6
		i = position;
	//   42   62:aload_0         
	//   43   63:getfield        #25  <Field int position>
	//   44   66:istore_1        
		position = i + 1;
	//   45   67:aload_0         
	//   46   68:iload_1         
	//   47   69:iconst_1        
	//   48   70:iadd            
	//   49   71:putfield        #25  <Field int position>
		return l & 255L | (l1 & 255L) << 8 | (l2 & 255L) << 16 | (255L & (long)abyte0[i]) << 24;
	//   50   74:lload_2         
	//   51   75:ldc2w           #86  <Long 255L>
	//   52   78:land            
	//   53   79:lload           4
	//   54   81:ldc2w           #86  <Long 255L>
	//   55   84:land            
	//   56   85:bipush          8
	//   57   87:lshl            
	//   58   88:lor             
	//   59   89:lload           6
	//   60   91:ldc2w           #86  <Long 255L>
	//   61   94:land            
	//   62   95:bipush          16
	//   63   97:lshl            
	//   64   98:lor             
	//   65   99:ldc2w           #86  <Long 255L>
	//   66  102:aload           8
	//   67  104:iload_1         
	//   68  105:baload          
	//   69  106:i2l             
	//   70  107:land            
	//   71  108:bipush          24
	//   72  110:lshl            
	//   73  111:lor             
	//   74  112:lreturn         
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
		int j = position;
	//   15   23:aload_0         
	//   16   24:getfield        #25  <Field int position>
	//   17   27:istore_2        
		position = j + 1;
	//   18   28:aload_0         
	//   19   29:iload_2         
	//   20   30:iconst_1        
	//   21   31:iadd            
	//   22   32:putfield        #25  <Field int position>
		j = ((int) (abyte0[j]));
	//   23   35:aload           4
	//   24   37:iload_2         
	//   25   38:baload          
	//   26   39:istore_2        
		int k = position;
	//   27   40:aload_0         
	//   28   41:getfield        #25  <Field int position>
	//   29   44:istore_3        
		position = k + 1;
	//   30   45:aload_0         
	//   31   46:iload_3         
	//   32   47:iconst_1        
	//   33   48:iadd            
	//   34   49:putfield        #25  <Field int position>
		return (abyte0[k] & 0xff) << 16 | (i & 0xff | (j & 0xff) << 8);
	//   35   52:aload           4
	//   36   54:iload_3         
	//   37   55:baload          
	//   38   56:sipush          255
	//   39   59:iand            
	//   40   60:bipush          16
	//   41   62:ishl            
	//   42   63:iload_1         
	//   43   64:sipush          255
	//   44   67:iand            
	//   45   68:iload_2         
	//   46   69:sipush          255
	//   47   72:iand            
	//   48   73:bipush          8
	//   49   75:ishl            
	//   50   76:ior             
	//   51   77:ior             
	//   52   78:ireturn         
	}

	public int readLittleEndianUnsignedIntToInt()
	{
		int i = readLittleEndianInt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #94  <Method int readLittleEndianInt()>
	//    2    4:istore_1        
		if(i >= 0)
	//*   3    5:iload_1         
	//*   4    6:iflt            11
		{
			return i;
	//    5    9:iload_1         
	//    6   10:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    7   11:new             #96  <Class StringBuilder>
	//    8   14:dup             
	//    9   15:invokespecial   #97  <Method void StringBuilder()>
	//   10   18:astore_2        
			stringbuilder.append("Top bit not zero: ");
	//   11   19:aload_2         
	//   12   20:ldc1            #99  <String "Top bit not zero: ">
	//   13   22:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   14   25:pop             
			stringbuilder.append(i);
	//   15   26:aload_2         
	//   16   27:iload_1         
	//   17   28:invokevirtual   #106 <Method StringBuilder StringBuilder.append(int)>
	//   18   31:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   19   32:new             #108 <Class IllegalStateException>
	//   20   35:dup             
	//   21   36:aload_2         
	//   22   37:invokevirtual   #111 <Method String StringBuilder.toString()>
	//   23   40:invokespecial   #114 <Method void IllegalStateException(String)>
	//   24   43:athrow          
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
		int j = position;
	//   15   21:aload_0         
	//   16   22:getfield        #25  <Field int position>
	//   17   25:istore_2        
		position = j + 1;
	//   18   26:aload_0         
	//   19   27:iload_2         
	//   20   28:iconst_1        
	//   21   29:iadd            
	//   22   30:putfield        #25  <Field int position>
		return (abyte0[j] & 0xff) << 8 | i & 0xff;
	//   23   33:aload_3         
	//   24   34:iload_2         
	//   25   35:baload          
	//   26   36:sipush          255
	//   27   39:iand            
	//   28   40:bipush          8
	//   29   42:ishl            
	//   30   43:iload_1         
	//   31   44:sipush          255
	//   32   47:iand            
	//   33   48:ior             
	//   34   49:ireturn         
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
		i = position;
	//   16   24:aload_0         
	//   17   25:getfield        #25  <Field int position>
	//   18   28:istore_1        
		position = i + 1;
	//   19   29:aload_0         
	//   20   30:iload_1         
	//   21   31:iconst_1        
	//   22   32:iadd            
	//   23   33:putfield        #25  <Field int position>
		long l1 = abyte0[i];
	//   24   36:aload           16
	//   25   38:iload_1         
	//   26   39:baload          
	//   27   40:i2l             
	//   28   41:lstore          4
		i = position;
	//   29   43:aload_0         
	//   30   44:getfield        #25  <Field int position>
	//   31   47:istore_1        
		position = i + 1;
	//   32   48:aload_0         
	//   33   49:iload_1         
	//   34   50:iconst_1        
	//   35   51:iadd            
	//   36   52:putfield        #25  <Field int position>
		long l2 = abyte0[i];
	//   37   55:aload           16
	//   38   57:iload_1         
	//   39   58:baload          
	//   40   59:i2l             
	//   41   60:lstore          6
		i = position;
	//   42   62:aload_0         
	//   43   63:getfield        #25  <Field int position>
	//   44   66:istore_1        
		position = i + 1;
	//   45   67:aload_0         
	//   46   68:iload_1         
	//   47   69:iconst_1        
	//   48   70:iadd            
	//   49   71:putfield        #25  <Field int position>
		long l3 = abyte0[i];
	//   50   74:aload           16
	//   51   76:iload_1         
	//   52   77:baload          
	//   53   78:i2l             
	//   54   79:lstore          8
		i = position;
	//   55   81:aload_0         
	//   56   82:getfield        #25  <Field int position>
	//   57   85:istore_1        
		position = i + 1;
	//   58   86:aload_0         
	//   59   87:iload_1         
	//   60   88:iconst_1        
	//   61   89:iadd            
	//   62   90:putfield        #25  <Field int position>
		long l4 = abyte0[i];
	//   63   93:aload           16
	//   64   95:iload_1         
	//   65   96:baload          
	//   66   97:i2l             
	//   67   98:lstore          10
		i = position;
	//   68  100:aload_0         
	//   69  101:getfield        #25  <Field int position>
	//   70  104:istore_1        
		position = i + 1;
	//   71  105:aload_0         
	//   72  106:iload_1         
	//   73  107:iconst_1        
	//   74  108:iadd            
	//   75  109:putfield        #25  <Field int position>
		long l5 = abyte0[i];
	//   76  112:aload           16
	//   77  114:iload_1         
	//   78  115:baload          
	//   79  116:i2l             
	//   80  117:lstore          12
		i = position;
	//   81  119:aload_0         
	//   82  120:getfield        #25  <Field int position>
	//   83  123:istore_1        
		position = i + 1;
	//   84  124:aload_0         
	//   85  125:iload_1         
	//   86  126:iconst_1        
	//   87  127:iadd            
	//   88  128:putfield        #25  <Field int position>
		long l6 = abyte0[i];
	//   89  131:aload           16
	//   90  133:iload_1         
	//   91  134:baload          
	//   92  135:i2l             
	//   93  136:lstore          14
		i = position;
	//   94  138:aload_0         
	//   95  139:getfield        #25  <Field int position>
	//   96  142:istore_1        
		position = i + 1;
	//   97  143:aload_0         
	//   98  144:iload_1         
	//   99  145:iconst_1        
	//  100  146:iadd            
	//  101  147:putfield        #25  <Field int position>
		return (l & 255L) << 56 | (l1 & 255L) << 48 | (l2 & 255L) << 40 | (l3 & 255L) << 32 | (l4 & 255L) << 24 | (l5 & 255L) << 16 | (l6 & 255L) << 8 | 255L & (long)abyte0[i];
	//  102  150:lload_2         
	//  103  151:ldc2w           #86  <Long 255L>
	//  104  154:land            
	//  105  155:bipush          56
	//  106  157:lshl            
	//  107  158:lload           4
	//  108  160:ldc2w           #86  <Long 255L>
	//  109  163:land            
	//  110  164:bipush          48
	//  111  166:lshl            
	//  112  167:lor             
	//  113  168:lload           6
	//  114  170:ldc2w           #86  <Long 255L>
	//  115  173:land            
	//  116  174:bipush          40
	//  117  176:lshl            
	//  118  177:lor             
	//  119  178:lload           8
	//  120  180:ldc2w           #86  <Long 255L>
	//  121  183:land            
	//  122  184:bipush          32
	//  123  186:lshl            
	//  124  187:lor             
	//  125  188:lload           10
	//  126  190:ldc2w           #86  <Long 255L>
	//  127  193:land            
	//  128  194:bipush          24
	//  129  196:lshl            
	//  130  197:lor             
	//  131  198:lload           12
	//  132  200:ldc2w           #86  <Long 255L>
	//  133  203:land            
	//  134  204:bipush          16
	//  135  206:lshl            
	//  136  207:lor             
	//  137  208:lload           14
	//  138  210:ldc2w           #86  <Long 255L>
	//  139  213:land            
	//  140  214:bipush          8
	//  141  216:lshl            
	//  142  217:lor             
	//  143  218:ldc2w           #86  <Long 255L>
	//  144  221:aload           16
	//  145  223:iload_1         
	//  146  224:baload          
	//  147  225:i2l             
	//  148  226:land            
	//  149  227:lor             
	//  150  228:lreturn         
	}

	public String readNullTerminatedString()
	{
		if(bytesLeft() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #78  <Method int bytesLeft()>
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
		int j = position;
	//   22   38:aload_0         
	//   23   39:getfield        #25  <Field int position>
	//   24   42:istore_2        
		String s = new String(data, j, i - j, Charset.defaultCharset());
	//   25   43:new             #80  <Class String>
	//   26   46:dup             
	//   27   47:aload_0         
	//   28   48:getfield        #17  <Field byte[] data>
	//   29   51:iload_2         
	//   30   52:iload_1         
	//   31   53:iload_2         
	//   32   54:isub            
	//   33   55:invokestatic    #122 <Method Charset Charset.defaultCharset()>
	//   34   58:invokespecial   #125 <Method void String(byte[], int, int, Charset)>
	//   35   61:astore_3        
		position = i;
	//   36   62:aload_0         
	//   37   63:iload_1         
	//   38   64:putfield        #25  <Field int position>
		i = position;
	//   39   67:aload_0         
	//   40   68:getfield        #25  <Field int position>
	//   41   71:istore_1        
		if(i == limit)
	//*  42   72:iload_1         
	//*  43   73:aload_0         
	//*  44   74:getfield        #19  <Field int limit>
	//*  45   77:icmpne          82
		{
			return s;
	//   46   80:aload_3         
	//   47   81:areturn         
		} else
		{
			position = i + 1;
	//   48   82:aload_0         
	//   49   83:iload_1         
	//   50   84:iconst_1        
	//   51   85:iadd            
	//   52   86:putfield        #25  <Field int position>
			return s;
	//   53   89:aload_3         
	//   54   90:areturn         
		}
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
		int j = position;
	//   15   21:aload_0         
	//   16   22:getfield        #25  <Field int position>
	//   17   25:istore_2        
		position = j + 1;
	//   18   26:aload_0         
	//   19   27:iload_2         
	//   20   28:iconst_1        
	//   21   29:iadd            
	//   22   30:putfield        #25  <Field int position>
		return (short)(abyte0[j] & 0xff | (i & 0xff) << 8);
	//   23   33:aload_3         
	//   24   34:iload_2         
	//   25   35:baload          
	//   26   36:sipush          255
	//   27   39:iand            
	//   28   40:iload_1         
	//   29   41:sipush          255
	//   30   44:iand            
	//   31   45:bipush          8
	//   32   47:ishl            
	//   33   48:ior             
	//   34   49:int2short       
	//   35   50:ireturn         
	}

	public String readString(int i)
	{
		return readString(i, Charset.defaultCharset());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #122 <Method Charset Charset.defaultCharset()>
	//    3    5:invokevirtual   #131 <Method String readString(int, Charset)>
	//    4    8:areturn         
	}

	public String readString(int i, Charset charset)
	{
		charset = ((Charset) (new String(data, position, i, charset)));
	//    0    0:new             #80  <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field byte[] data>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field int position>
	//    6   12:iload_1         
	//    7   13:aload_2         
	//    8   14:invokespecial   #125 <Method void String(byte[], int, int, Charset)>
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
	//    1    1:invokevirtual   #135 <Method int readUnsignedByte()>
	//    2    4:bipush          21
	//    3    6:ishl            
	//    4    7:aload_0         
	//    5    8:invokevirtual   #135 <Method int readUnsignedByte()>
	//    6   11:bipush          14
	//    7   13:ishl            
	//    8   14:ior             
	//    9   15:aload_0         
	//   10   16:invokevirtual   #135 <Method int readUnsignedByte()>
	//   11   19:bipush          7
	//   12   21:ishl            
	//   13   22:ior             
	//   14   23:aload_0         
	//   15   24:invokevirtual   #135 <Method int readUnsignedByte()>
	//   16   27:ior             
	//   17   28:ireturn         
	}

	public long readUTF8EncodedLong()
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
				if(((long)k & l) == 0L)
	//*  17   25:iload_3         
	//*  18   26:i2l             
	//*  19   27:lload           4
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
		if(i != 0)
	//*  52   78:iload_1         
	//*  53   79:ifeq            181
		{
			while(j < i) 
	//*  54   82:iload_2         
	//*  55   83:iload_1         
	//*  56   84:icmpge          168
			{
				byte byte0 = data[position + j];
	//   57   87:aload_0         
	//   58   88:getfield        #17  <Field byte[] data>
	//   59   91:aload_0         
	//   60   92:getfield        #25  <Field int position>
	//   61   95:iload_2         
	//   62   96:iadd            
	//   63   97:baload          
	//   64   98:istore_3        
				if((byte0 & 0xc0) == 128)
	//*  65   99:iload_3         
	//*  66  100:sipush          192
	//*  67  103:iand            
	//*  68  104:sipush          128
	//*  69  107:icmpne          130
				{
					l = l << 6 | (long)(byte0 & 0x3f);
	//   70  110:lload           4
	//   71  112:bipush          6
	//   72  114:lshl            
	//   73  115:iload_3         
	//   74  116:bipush          63
	//   75  118:iand            
	//   76  119:i2l             
	//   77  120:lor             
	//   78  121:lstore          4
					j++;
	//   79  123:iload_2         
	//   80  124:iconst_1        
	//   81  125:iadd            
	//   82  126:istore_2        
				} else
	//*  83  127:goto            82
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   84  130:new             #96  <Class StringBuilder>
	//   85  133:dup             
	//   86  134:invokespecial   #97  <Method void StringBuilder()>
	//   87  137:astore          6
					stringbuilder.append("Invalid UTF-8 sequence continuation byte: ");
	//   88  139:aload           6
	//   89  141:ldc1            #138 <String "Invalid UTF-8 sequence continuation byte: ">
	//   90  143:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   91  146:pop             
					stringbuilder.append(l);
	//   92  147:aload           6
	//   93  149:lload           4
	//   94  151:invokevirtual   #141 <Method StringBuilder StringBuilder.append(long)>
	//   95  154:pop             
					throw new NumberFormatException(stringbuilder.toString());
	//   96  155:new             #143 <Class NumberFormatException>
	//   97  158:dup             
	//   98  159:aload           6
	//   99  161:invokevirtual   #111 <Method String StringBuilder.toString()>
	//  100  164:invokespecial   #144 <Method void NumberFormatException(String)>
	//  101  167:athrow          
				}
			}
			position = position + i;
	//  102  168:aload_0         
	//  103  169:aload_0         
	//  104  170:getfield        #25  <Field int position>
	//  105  173:iload_1         
	//  106  174:iadd            
	//  107  175:putfield        #25  <Field int position>
			return l;
	//  108  178:lload           4
	//  109  180:lreturn         
		} else
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//  110  181:new             #96  <Class StringBuilder>
	//  111  184:dup             
	//  112  185:invokespecial   #97  <Method void StringBuilder()>
	//  113  188:astore          6
			stringbuilder1.append("Invalid UTF-8 sequence first byte: ");
	//  114  190:aload           6
	//  115  192:ldc1            #146 <String "Invalid UTF-8 sequence first byte: ">
	//  116  194:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//  117  197:pop             
			stringbuilder1.append(l);
	//  118  198:aload           6
	//  119  200:lload           4
	//  120  202:invokevirtual   #141 <Method StringBuilder StringBuilder.append(long)>
	//  121  205:pop             
			throw new NumberFormatException(stringbuilder1.toString());
	//  122  206:new             #143 <Class NumberFormatException>
	//  123  209:dup             
	//  124  210:aload           6
	//  125  212:invokevirtual   #111 <Method String StringBuilder.toString()>
	//  126  215:invokespecial   #144 <Method void NumberFormatException(String)>
	//  127  218:athrow          
		}
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
		int j = position;
	//   15   21:aload_0         
	//   16   22:getfield        #25  <Field int position>
	//   17   25:istore_2        
		position = j + 1;
	//   18   26:aload_0         
	//   19   27:iload_2         
	//   20   28:iconst_1        
	//   21   29:iadd            
	//   22   30:putfield        #25  <Field int position>
		j = ((int) (abyte0[j]));
	//   23   33:aload_3         
	//   24   34:iload_2         
	//   25   35:baload          
	//   26   36:istore_2        
		position = position + 2;
	//   27   37:aload_0         
	//   28   38:aload_0         
	//   29   39:getfield        #25  <Field int position>
	//   30   42:iconst_2        
	//   31   43:iadd            
	//   32   44:putfield        #25  <Field int position>
		return j & 0xff | (i & 0xff) << 8;
	//   33   47:iload_2         
	//   34   48:sipush          255
	//   35   51:iand            
	//   36   52:iload_1         
	//   37   53:sipush          255
	//   38   56:iand            
	//   39   57:bipush          8
	//   40   59:ishl            
	//   41   60:ior             
	//   42   61:ireturn         
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
		i = position;
	//   16   24:aload_0         
	//   17   25:getfield        #25  <Field int position>
	//   18   28:istore_1        
		position = i + 1;
	//   19   29:aload_0         
	//   20   30:iload_1         
	//   21   31:iconst_1        
	//   22   32:iadd            
	//   23   33:putfield        #25  <Field int position>
		long l1 = abyte0[i];
	//   24   36:aload           8
	//   25   38:iload_1         
	//   26   39:baload          
	//   27   40:i2l             
	//   28   41:lstore          4
		i = position;
	//   29   43:aload_0         
	//   30   44:getfield        #25  <Field int position>
	//   31   47:istore_1        
		position = i + 1;
	//   32   48:aload_0         
	//   33   49:iload_1         
	//   34   50:iconst_1        
	//   35   51:iadd            
	//   36   52:putfield        #25  <Field int position>
		long l2 = abyte0[i];
	//   37   55:aload           8
	//   38   57:iload_1         
	//   39   58:baload          
	//   40   59:i2l             
	//   41   60:lstore          6
		i = position;
	//   42   62:aload_0         
	//   43   63:getfield        #25  <Field int position>
	//   44   66:istore_1        
		position = i + 1;
	//   45   67:aload_0         
	//   46   68:iload_1         
	//   47   69:iconst_1        
	//   48   70:iadd            
	//   49   71:putfield        #25  <Field int position>
		return (l & 255L) << 24 | (l1 & 255L) << 16 | (l2 & 255L) << 8 | 255L & (long)abyte0[i];
	//   50   74:lload_2         
	//   51   75:ldc2w           #86  <Long 255L>
	//   52   78:land            
	//   53   79:bipush          24
	//   54   81:lshl            
	//   55   82:lload           4
	//   56   84:ldc2w           #86  <Long 255L>
	//   57   87:land            
	//   58   88:bipush          16
	//   59   90:lshl            
	//   60   91:lor             
	//   61   92:lload           6
	//   62   94:ldc2w           #86  <Long 255L>
	//   63   97:land            
	//   64   98:bipush          8
	//   65  100:lshl            
	//   66  101:lor             
	//   67  102:ldc2w           #86  <Long 255L>
	//   68  105:aload           8
	//   69  107:iload_1         
	//   70  108:baload          
	//   71  109:i2l             
	//   72  110:land            
	//   73  111:lor             
	//   74  112:lreturn         
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
		int j = position;
	//   15   23:aload_0         
	//   16   24:getfield        #25  <Field int position>
	//   17   27:istore_2        
		position = j + 1;
	//   18   28:aload_0         
	//   19   29:iload_2         
	//   20   30:iconst_1        
	//   21   31:iadd            
	//   22   32:putfield        #25  <Field int position>
		j = ((int) (abyte0[j]));
	//   23   35:aload           4
	//   24   37:iload_2         
	//   25   38:baload          
	//   26   39:istore_2        
		int k = position;
	//   27   40:aload_0         
	//   28   41:getfield        #25  <Field int position>
	//   29   44:istore_3        
		position = k + 1;
	//   30   45:aload_0         
	//   31   46:iload_3         
	//   32   47:iconst_1        
	//   33   48:iadd            
	//   34   49:putfield        #25  <Field int position>
		return abyte0[k] & 0xff | ((i & 0xff) << 16 | (j & 0xff) << 8);
	//   35   52:aload           4
	//   36   54:iload_3         
	//   37   55:baload          
	//   38   56:sipush          255
	//   39   59:iand            
	//   40   60:iload_1         
	//   41   61:sipush          255
	//   42   64:iand            
	//   43   65:bipush          16
	//   44   67:ishl            
	//   45   68:iload_2         
	//   46   69:sipush          255
	//   47   72:iand            
	//   48   73:bipush          8
	//   49   75:ishl            
	//   50   76:ior             
	//   51   77:ior             
	//   52   78:ireturn         
	}

	public int readUnsignedIntToInt()
	{
		int i = readInt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #68  <Method int readInt()>
	//    2    4:istore_1        
		if(i >= 0)
	//*   3    5:iload_1         
	//*   4    6:iflt            11
		{
			return i;
	//    5    9:iload_1         
	//    6   10:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    7   11:new             #96  <Class StringBuilder>
	//    8   14:dup             
	//    9   15:invokespecial   #97  <Method void StringBuilder()>
	//   10   18:astore_2        
			stringbuilder.append("Top bit not zero: ");
	//   11   19:aload_2         
	//   12   20:ldc1            #99  <String "Top bit not zero: ">
	//   13   22:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   14   25:pop             
			stringbuilder.append(i);
	//   15   26:aload_2         
	//   16   27:iload_1         
	//   17   28:invokevirtual   #106 <Method StringBuilder StringBuilder.append(int)>
	//   18   31:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   19   32:new             #108 <Class IllegalStateException>
	//   20   35:dup             
	//   21   36:aload_2         
	//   22   37:invokevirtual   #111 <Method String StringBuilder.toString()>
	//   23   40:invokespecial   #114 <Method void IllegalStateException(String)>
	//   24   43:athrow          
		}
	}

	public long readUnsignedLongToLong()
	{
		long l = readLong();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #57  <Method long readLong()>
	//    2    4:lstore_1        
		if(l >= 0L)
	//*   3    5:lload_1         
	//*   4    6:lconst_0        
	//*   5    7:lcmp            
	//*   6    8:iflt            13
		{
			return l;
	//    7   11:lload_1         
	//    8   12:lreturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    9   13:new             #96  <Class StringBuilder>
	//   10   16:dup             
	//   11   17:invokespecial   #97  <Method void StringBuilder()>
	//   12   20:astore_3        
			stringbuilder.append("Top bit not zero: ");
	//   13   21:aload_3         
	//   14   22:ldc1            #99  <String "Top bit not zero: ">
	//   15   24:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   16   27:pop             
			stringbuilder.append(l);
	//   17   28:aload_3         
	//   18   29:lload_1         
	//   19   30:invokevirtual   #141 <Method StringBuilder StringBuilder.append(long)>
	//   20   33:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   21   34:new             #108 <Class IllegalStateException>
	//   22   37:dup             
	//   23   38:aload_3         
	//   24   39:invokevirtual   #111 <Method String StringBuilder.toString()>
	//   25   42:invokespecial   #114 <Method void IllegalStateException(String)>
	//   26   45:athrow          
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
		int j = position;
	//   15   21:aload_0         
	//   16   22:getfield        #25  <Field int position>
	//   17   25:istore_2        
		position = j + 1;
	//   18   26:aload_0         
	//   19   27:iload_2         
	//   20   28:iconst_1        
	//   21   29:iadd            
	//   22   30:putfield        #25  <Field int position>
		return abyte0[j] & 0xff | (i & 0xff) << 8;
	//   23   33:aload_3         
	//   24   34:iload_2         
	//   25   35:baload          
	//   26   36:sipush          255
	//   27   39:iand            
	//   28   40:iload_1         
	//   29   41:sipush          255
	//   30   44:iand            
	//   31   45:bipush          8
	//   32   47:ishl            
	//   33   48:ior             
	//   34   49:ireturn         
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
	//*   1    1:invokevirtual   #155 <Method int capacity()>
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
	//   14   23:invokevirtual   #157 <Method void reset(byte[], int)>
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
	//   13   21:invokestatic    #164 <Method void Assertions.checkArgument(boolean)>
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
	//   12   20:invokestatic    #164 <Method void Assertions.checkArgument(boolean)>
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
	//    5    7:invokevirtual   #166 <Method void setPosition(int)>
	//    6   10:return          
	}

	public byte data[];
	private int limit;
	private int position;
}
