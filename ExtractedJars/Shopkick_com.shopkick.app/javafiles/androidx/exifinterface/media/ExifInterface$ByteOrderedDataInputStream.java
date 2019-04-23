// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.exifinterface.media;

import android.util.Log;
import java.io.*;
import java.nio.ByteOrder;

// Referenced classes of package androidx.exifinterface.media:
//			ExifInterface

private static class ExifInterface$ByteOrderedDataInputStream extends InputStream
	implements DataInput
{

	public int available()
		throws IOException
	{
		return mDataInputStream.available();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field DataInputStream mDataInputStream>
	//    2    4:invokevirtual   #47  <Method int DataInputStream.available()>
	//    3    7:ireturn         
	}

	public int peek()
	{
		return mPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field int mPosition>
	//    2    4:ireturn         
	}

	public int read()
		throws IOException
	{
		mPosition = mPosition + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #51  <Field int mPosition>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #51  <Field int mPosition>
		return mDataInputStream.read();
	//    6   10:aload_0         
	//    7   11:getfield        #43  <Field DataInputStream mDataInputStream>
	//    8   14:invokevirtual   #66  <Method int DataInputStream.read()>
	//    9   17:ireturn         
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		i = mDataInputStream.read(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field DataInputStream mDataInputStream>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #69  <Method int DataInputStream.read(byte[], int, int)>
	//    6   10:istore_2        
		mPosition = mPosition + i;
	//    7   11:aload_0         
	//    8   12:aload_0         
	//    9   13:getfield        #51  <Field int mPosition>
	//   10   16:iload_2         
	//   11   17:iadd            
	//   12   18:putfield        #51  <Field int mPosition>
		return i;
	//   13   21:iload_2         
	//   14   22:ireturn         
	}

	public boolean readBoolean()
		throws IOException
	{
		mPosition = mPosition + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #51  <Field int mPosition>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #51  <Field int mPosition>
		return mDataInputStream.readBoolean();
	//    6   10:aload_0         
	//    7   11:getfield        #43  <Field DataInputStream mDataInputStream>
	//    8   14:invokevirtual   #73  <Method boolean DataInputStream.readBoolean()>
	//    9   17:ireturn         
	}

	public byte readByte()
		throws IOException
	{
		mPosition = mPosition + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #51  <Field int mPosition>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #51  <Field int mPosition>
		if(mPosition <= mLength)
	//*   6   10:aload_0         
	//*   7   11:getfield        #51  <Field int mPosition>
	//*   8   14:aload_0         
	//*   9   15:getfield        #49  <Field int mLength>
	//*  10   18:icmpgt          44
		{
			int i = mDataInputStream.read();
	//   11   21:aload_0         
	//   12   22:getfield        #43  <Field DataInputStream mDataInputStream>
	//   13   25:invokevirtual   #66  <Method int DataInputStream.read()>
	//   14   28:istore_1        
			if(i >= 0)
	//*  15   29:iload_1         
	//*  16   30:iflt            36
				return (byte)i;
	//   17   33:iload_1         
	//   18   34:int2byte        
	//   19   35:ireturn         
			else
				throw new EOFException();
	//   20   36:new             #77  <Class EOFException>
	//   21   39:dup             
	//   22   40:invokespecial   #78  <Method void EOFException()>
	//   23   43:athrow          
		} else
		{
			throw new EOFException();
	//   24   44:new             #77  <Class EOFException>
	//   25   47:dup             
	//   26   48:invokespecial   #78  <Method void EOFException()>
	//   27   51:athrow          
		}
	}

	public char readChar()
		throws IOException
	{
		mPosition = mPosition + 2;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #51  <Field int mPosition>
	//    3    5:iconst_2        
	//    4    6:iadd            
	//    5    7:putfield        #51  <Field int mPosition>
		return mDataInputStream.readChar();
	//    6   10:aload_0         
	//    7   11:getfield        #43  <Field DataInputStream mDataInputStream>
	//    8   14:invokevirtual   #82  <Method char DataInputStream.readChar()>
	//    9   17:ireturn         
	}

	public double readDouble()
		throws IOException
	{
		return Double.longBitsToDouble(readLong());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #88  <Method long readLong()>
	//    2    4:invokestatic    #94  <Method double Double.longBitsToDouble(long)>
	//    3    7:dreturn         
	}

	public float readFloat()
		throws IOException
	{
		return Float.intBitsToFloat(readInt());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #99  <Method int readInt()>
	//    2    4:invokestatic    #105 <Method float Float.intBitsToFloat(int)>
	//    3    7:freturn         
	}

	public void readFully(byte abyte0[])
		throws IOException
	{
		mPosition = mPosition + abyte0.length;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #51  <Field int mPosition>
	//    3    5:aload_1         
	//    4    6:arraylength     
	//    5    7:iadd            
	//    6    8:putfield        #51  <Field int mPosition>
		if(mPosition <= mLength)
	//*   7   11:aload_0         
	//*   8   12:getfield        #51  <Field int mPosition>
	//*   9   15:aload_0         
	//*  10   16:getfield        #49  <Field int mLength>
	//*  11   19:icmpgt          49
		{
			if(mDataInputStream.read(abyte0, 0, abyte0.length) == abyte0.length)
	//*  12   22:aload_0         
	//*  13   23:getfield        #43  <Field DataInputStream mDataInputStream>
	//*  14   26:aload_1         
	//*  15   27:iconst_0        
	//*  16   28:aload_1         
	//*  17   29:arraylength     
	//*  18   30:invokevirtual   #69  <Method int DataInputStream.read(byte[], int, int)>
	//*  19   33:aload_1         
	//*  20   34:arraylength     
	//*  21   35:icmpne          39
				return;
	//   22   38:return          
			else
				throw new IOException("Couldn't read up to the length of buffer");
	//   23   39:new             #33  <Class IOException>
	//   24   42:dup             
	//   25   43:ldc1            #108 <String "Couldn't read up to the length of buffer">
	//   26   45:invokespecial   #111 <Method void IOException(String)>
	//   27   48:athrow          
		} else
		{
			throw new EOFException();
	//   28   49:new             #77  <Class EOFException>
	//   29   52:dup             
	//   30   53:invokespecial   #78  <Method void EOFException()>
	//   31   56:athrow          
		}
	}

	public void readFully(byte abyte0[], int i, int j)
		throws IOException
	{
		mPosition = mPosition + j;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #51  <Field int mPosition>
	//    3    5:iload_3         
	//    4    6:iadd            
	//    5    7:putfield        #51  <Field int mPosition>
		if(mPosition <= mLength)
	//*   6   10:aload_0         
	//*   7   11:getfield        #51  <Field int mPosition>
	//*   8   14:aload_0         
	//*   9   15:getfield        #49  <Field int mLength>
	//*  10   18:icmpgt          46
		{
			if(mDataInputStream.read(abyte0, i, j) == j)
	//*  11   21:aload_0         
	//*  12   22:getfield        #43  <Field DataInputStream mDataInputStream>
	//*  13   25:aload_1         
	//*  14   26:iload_2         
	//*  15   27:iload_3         
	//*  16   28:invokevirtual   #69  <Method int DataInputStream.read(byte[], int, int)>
	//*  17   31:iload_3         
	//*  18   32:icmpne          36
				return;
	//   19   35:return          
			else
				throw new IOException("Couldn't read up to the length of buffer");
	//   20   36:new             #33  <Class IOException>
	//   21   39:dup             
	//   22   40:ldc1            #108 <String "Couldn't read up to the length of buffer">
	//   23   42:invokespecial   #111 <Method void IOException(String)>
	//   24   45:athrow          
		} else
		{
			throw new EOFException();
	//   25   46:new             #77  <Class EOFException>
	//   26   49:dup             
	//   27   50:invokespecial   #78  <Method void EOFException()>
	//   28   53:athrow          
		}
	}

	public int readInt()
		throws IOException
	{
		mPosition = mPosition + 4;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #51  <Field int mPosition>
	//    3    5:iconst_4        
	//    4    6:iadd            
	//    5    7:putfield        #51  <Field int mPosition>
		if(mPosition <= mLength)
	//*   6   10:aload_0         
	//*   7   11:getfield        #51  <Field int mPosition>
	//*   8   14:aload_0         
	//*   9   15:getfield        #49  <Field int mLength>
	//*  10   18:icmpgt          171
		{
			int i = mDataInputStream.read();
	//   11   21:aload_0         
	//   12   22:getfield        #43  <Field DataInputStream mDataInputStream>
	//   13   25:invokevirtual   #66  <Method int DataInputStream.read()>
	//   14   28:istore_1        
			int j = mDataInputStream.read();
	//   15   29:aload_0         
	//   16   30:getfield        #43  <Field DataInputStream mDataInputStream>
	//   17   33:invokevirtual   #66  <Method int DataInputStream.read()>
	//   18   36:istore_2        
			int k = mDataInputStream.read();
	//   19   37:aload_0         
	//   20   38:getfield        #43  <Field DataInputStream mDataInputStream>
	//   21   41:invokevirtual   #66  <Method int DataInputStream.read()>
	//   22   44:istore_3        
			int l = mDataInputStream.read();
	//   23   45:aload_0         
	//   24   46:getfield        #43  <Field DataInputStream mDataInputStream>
	//   25   49:invokevirtual   #66  <Method int DataInputStream.read()>
	//   26   52:istore          4
			if((i | j | k | l) >= 0)
	//*  27   54:iload_1         
	//*  28   55:iload_2         
	//*  29   56:ior             
	//*  30   57:iload_3         
	//*  31   58:ior             
	//*  32   59:iload           4
	//*  33   61:ior             
	//*  34   62:iflt            163
			{
				ByteOrder byteorder = mByteOrder;
	//   35   65:aload_0         
	//   36   66:getfield        #37  <Field ByteOrder mByteOrder>
	//   37   69:astore          5
				if(byteorder == LITTLE_ENDIAN)
	//*  38   71:aload           5
	//*  39   73:getstatic       #25  <Field ByteOrder LITTLE_ENDIAN>
	//*  40   76:if_acmpne       97
					return (l << 24) + (k << 16) + (j << 8) + i;
	//   41   79:iload           4
	//   42   81:bipush          24
	//   43   83:ishl            
	//   44   84:iload_3         
	//   45   85:bipush          16
	//   46   87:ishl            
	//   47   88:iadd            
	//   48   89:iload_2         
	//   49   90:bipush          8
	//   50   92:ishl            
	//   51   93:iadd            
	//   52   94:iload_1         
	//   53   95:iadd            
	//   54   96:ireturn         
				if(byteorder == BIG_ENDIAN)
	//*  55   97:aload           5
	//*  56   99:getstatic       #28  <Field ByteOrder BIG_ENDIAN>
	//*  57  102:if_acmpne       123
				{
					return (i << 24) + (j << 16) + (k << 8) + l;
	//   58  105:iload_1         
	//   59  106:bipush          24
	//   60  108:ishl            
	//   61  109:iload_2         
	//   62  110:bipush          16
	//   63  112:ishl            
	//   64  113:iadd            
	//   65  114:iload_3         
	//   66  115:bipush          8
	//   67  117:ishl            
	//   68  118:iadd            
	//   69  119:iload           4
	//   70  121:iadd            
	//   71  122:ireturn         
				} else
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   72  123:new             #114 <Class StringBuilder>
	//   73  126:dup             
	//   74  127:invokespecial   #115 <Method void StringBuilder()>
	//   75  130:astore          5
					stringbuilder.append("Invalid byte order: ");
	//   76  132:aload           5
	//   77  134:ldc1            #117 <String "Invalid byte order: ">
	//   78  136:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   79  139:pop             
					stringbuilder.append(((Object) (mByteOrder)));
	//   80  140:aload           5
	//   81  142:aload_0         
	//   82  143:getfield        #37  <Field ByteOrder mByteOrder>
	//   83  146:invokevirtual   #124 <Method StringBuilder StringBuilder.append(Object)>
	//   84  149:pop             
					throw new IOException(stringbuilder.toString());
	//   85  150:new             #33  <Class IOException>
	//   86  153:dup             
	//   87  154:aload           5
	//   88  156:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   89  159:invokespecial   #111 <Method void IOException(String)>
	//   90  162:athrow          
				}
			} else
			{
				throw new EOFException();
	//   91  163:new             #77  <Class EOFException>
	//   92  166:dup             
	//   93  167:invokespecial   #78  <Method void EOFException()>
	//   94  170:athrow          
			}
		} else
		{
			throw new EOFException();
	//   95  171:new             #77  <Class EOFException>
	//   96  174:dup             
	//   97  175:invokespecial   #78  <Method void EOFException()>
	//   98  178:athrow          
		}
	}

	public String readLine()
		throws IOException
	{
		Log.d("ExifInterface", "Currently unsupported");
	//    0    0:ldc1            #131 <String "ExifInterface">
	//    1    2:ldc1            #133 <String "Currently unsupported">
	//    2    4:invokestatic    #139 <Method int Log.d(String, String)>
	//    3    7:pop             
		return null;
	//    4    8:aconst_null     
	//    5    9:areturn         
	}

	public long readLong()
		throws IOException
	{
		mPosition = mPosition + 8;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #51  <Field int mPosition>
	//    3    5:bipush          8
	//    4    7:iadd            
	//    5    8:putfield        #51  <Field int mPosition>
		if(mPosition <= mLength)
	//*   6   11:aload_0         
	//*   7   12:getfield        #51  <Field int mPosition>
	//*   8   15:aload_0         
	//*   9   16:getfield        #49  <Field int mLength>
	//*  10   19:icmpgt          284
		{
			int i = mDataInputStream.read();
	//   11   22:aload_0         
	//   12   23:getfield        #43  <Field DataInputStream mDataInputStream>
	//   13   26:invokevirtual   #66  <Method int DataInputStream.read()>
	//   14   29:istore_1        
			int j = mDataInputStream.read();
	//   15   30:aload_0         
	//   16   31:getfield        #43  <Field DataInputStream mDataInputStream>
	//   17   34:invokevirtual   #66  <Method int DataInputStream.read()>
	//   18   37:istore_2        
			int k = mDataInputStream.read();
	//   19   38:aload_0         
	//   20   39:getfield        #43  <Field DataInputStream mDataInputStream>
	//   21   42:invokevirtual   #66  <Method int DataInputStream.read()>
	//   22   45:istore_3        
			int l = mDataInputStream.read();
	//   23   46:aload_0         
	//   24   47:getfield        #43  <Field DataInputStream mDataInputStream>
	//   25   50:invokevirtual   #66  <Method int DataInputStream.read()>
	//   26   53:istore          4
			int i1 = mDataInputStream.read();
	//   27   55:aload_0         
	//   28   56:getfield        #43  <Field DataInputStream mDataInputStream>
	//   29   59:invokevirtual   #66  <Method int DataInputStream.read()>
	//   30   62:istore          5
			int j1 = mDataInputStream.read();
	//   31   64:aload_0         
	//   32   65:getfield        #43  <Field DataInputStream mDataInputStream>
	//   33   68:invokevirtual   #66  <Method int DataInputStream.read()>
	//   34   71:istore          6
			int k1 = mDataInputStream.read();
	//   35   73:aload_0         
	//   36   74:getfield        #43  <Field DataInputStream mDataInputStream>
	//   37   77:invokevirtual   #66  <Method int DataInputStream.read()>
	//   38   80:istore          7
			int l1 = mDataInputStream.read();
	//   39   82:aload_0         
	//   40   83:getfield        #43  <Field DataInputStream mDataInputStream>
	//   41   86:invokevirtual   #66  <Method int DataInputStream.read()>
	//   42   89:istore          8
			if((i | j | k | l | i1 | j1 | k1 | l1) >= 0)
	//*  43   91:iload_1         
	//*  44   92:iload_2         
	//*  45   93:ior             
	//*  46   94:iload_3         
	//*  47   95:ior             
	//*  48   96:iload           4
	//*  49   98:ior             
	//*  50   99:iload           5
	//*  51  101:ior             
	//*  52  102:iload           6
	//*  53  104:ior             
	//*  54  105:iload           7
	//*  55  107:ior             
	//*  56  108:iload           8
	//*  57  110:ior             
	//*  58  111:iflt            276
			{
				ByteOrder byteorder = mByteOrder;
	//   59  114:aload_0         
	//   60  115:getfield        #37  <Field ByteOrder mByteOrder>
	//   61  118:astore          9
				if(byteorder == LITTLE_ENDIAN)
	//*  62  120:aload           9
	//*  63  122:getstatic       #25  <Field ByteOrder LITTLE_ENDIAN>
	//*  64  125:if_acmpne       178
					return ((long)l1 << 56) + ((long)k1 << 48) + ((long)j1 << 40) + ((long)i1 << 32) + ((long)l << 24) + ((long)k << 16) + ((long)j << 8) + (long)i;
	//   65  128:iload           8
	//   66  130:i2l             
	//   67  131:bipush          56
	//   68  133:lshl            
	//   69  134:iload           7
	//   70  136:i2l             
	//   71  137:bipush          48
	//   72  139:lshl            
	//   73  140:ladd            
	//   74  141:iload           6
	//   75  143:i2l             
	//   76  144:bipush          40
	//   77  146:lshl            
	//   78  147:ladd            
	//   79  148:iload           5
	//   80  150:i2l             
	//   81  151:bipush          32
	//   82  153:lshl            
	//   83  154:ladd            
	//   84  155:iload           4
	//   85  157:i2l             
	//   86  158:bipush          24
	//   87  160:lshl            
	//   88  161:ladd            
	//   89  162:iload_3         
	//   90  163:i2l             
	//   91  164:bipush          16
	//   92  166:lshl            
	//   93  167:ladd            
	//   94  168:iload_2         
	//   95  169:i2l             
	//   96  170:bipush          8
	//   97  172:lshl            
	//   98  173:ladd            
	//   99  174:iload_1         
	//  100  175:i2l             
	//  101  176:ladd            
	//  102  177:lreturn         
				if(byteorder == BIG_ENDIAN)
	//* 103  178:aload           9
	//* 104  180:getstatic       #28  <Field ByteOrder BIG_ENDIAN>
	//* 105  183:if_acmpne       236
				{
					return ((long)i << 56) + ((long)j << 48) + ((long)k << 40) + ((long)l << 32) + ((long)i1 << 24) + ((long)j1 << 16) + ((long)k1 << 8) + (long)l1;
	//  106  186:iload_1         
	//  107  187:i2l             
	//  108  188:bipush          56
	//  109  190:lshl            
	//  110  191:iload_2         
	//  111  192:i2l             
	//  112  193:bipush          48
	//  113  195:lshl            
	//  114  196:ladd            
	//  115  197:iload_3         
	//  116  198:i2l             
	//  117  199:bipush          40
	//  118  201:lshl            
	//  119  202:ladd            
	//  120  203:iload           4
	//  121  205:i2l             
	//  122  206:bipush          32
	//  123  208:lshl            
	//  124  209:ladd            
	//  125  210:iload           5
	//  126  212:i2l             
	//  127  213:bipush          24
	//  128  215:lshl            
	//  129  216:ladd            
	//  130  217:iload           6
	//  131  219:i2l             
	//  132  220:bipush          16
	//  133  222:lshl            
	//  134  223:ladd            
	//  135  224:iload           7
	//  136  226:i2l             
	//  137  227:bipush          8
	//  138  229:lshl            
	//  139  230:ladd            
	//  140  231:iload           8
	//  141  233:i2l             
	//  142  234:ladd            
	//  143  235:lreturn         
				} else
				{
					StringBuilder stringbuilder = new StringBuilder();
	//  144  236:new             #114 <Class StringBuilder>
	//  145  239:dup             
	//  146  240:invokespecial   #115 <Method void StringBuilder()>
	//  147  243:astore          9
					stringbuilder.append("Invalid byte order: ");
	//  148  245:aload           9
	//  149  247:ldc1            #117 <String "Invalid byte order: ">
	//  150  249:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//  151  252:pop             
					stringbuilder.append(((Object) (mByteOrder)));
	//  152  253:aload           9
	//  153  255:aload_0         
	//  154  256:getfield        #37  <Field ByteOrder mByteOrder>
	//  155  259:invokevirtual   #124 <Method StringBuilder StringBuilder.append(Object)>
	//  156  262:pop             
					throw new IOException(stringbuilder.toString());
	//  157  263:new             #33  <Class IOException>
	//  158  266:dup             
	//  159  267:aload           9
	//  160  269:invokevirtual   #128 <Method String StringBuilder.toString()>
	//  161  272:invokespecial   #111 <Method void IOException(String)>
	//  162  275:athrow          
				}
			} else
			{
				throw new EOFException();
	//  163  276:new             #77  <Class EOFException>
	//  164  279:dup             
	//  165  280:invokespecial   #78  <Method void EOFException()>
	//  166  283:athrow          
			}
		} else
		{
			throw new EOFException();
	//  167  284:new             #77  <Class EOFException>
	//  168  287:dup             
	//  169  288:invokespecial   #78  <Method void EOFException()>
	//  170  291:athrow          
		}
	}

	public short readShort()
		throws IOException
	{
		mPosition = mPosition + 2;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #51  <Field int mPosition>
	//    3    5:iconst_2        
	//    4    6:iadd            
	//    5    7:putfield        #51  <Field int mPosition>
		if(mPosition <= mLength)
	//*   6   10:aload_0         
	//*   7   11:getfield        #51  <Field int mPosition>
	//*   8   14:aload_0         
	//*   9   15:getfield        #49  <Field int mLength>
	//*  10   18:icmpgt          122
		{
			int i = mDataInputStream.read();
	//   11   21:aload_0         
	//   12   22:getfield        #43  <Field DataInputStream mDataInputStream>
	//   13   25:invokevirtual   #66  <Method int DataInputStream.read()>
	//   14   28:istore_1        
			int j = mDataInputStream.read();
	//   15   29:aload_0         
	//   16   30:getfield        #43  <Field DataInputStream mDataInputStream>
	//   17   33:invokevirtual   #66  <Method int DataInputStream.read()>
	//   18   36:istore_2        
			if((i | j) >= 0)
	//*  19   37:iload_1         
	//*  20   38:iload_2         
	//*  21   39:ior             
	//*  22   40:iflt            114
			{
				ByteOrder byteorder = mByteOrder;
	//   23   43:aload_0         
	//   24   44:getfield        #37  <Field ByteOrder mByteOrder>
	//   25   47:astore_3        
				if(byteorder == LITTLE_ENDIAN)
	//*  26   48:aload_3         
	//*  27   49:getstatic       #25  <Field ByteOrder LITTLE_ENDIAN>
	//*  28   52:if_acmpne       63
					return (short)((j << 8) + i);
	//   29   55:iload_2         
	//   30   56:bipush          8
	//   31   58:ishl            
	//   32   59:iload_1         
	//   33   60:iadd            
	//   34   61:int2short       
	//   35   62:ireturn         
				if(byteorder == BIG_ENDIAN)
	//*  36   63:aload_3         
	//*  37   64:getstatic       #28  <Field ByteOrder BIG_ENDIAN>
	//*  38   67:if_acmpne       78
				{
					return (short)((i << 8) + j);
	//   39   70:iload_1         
	//   40   71:bipush          8
	//   41   73:ishl            
	//   42   74:iload_2         
	//   43   75:iadd            
	//   44   76:int2short       
	//   45   77:ireturn         
				} else
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   46   78:new             #114 <Class StringBuilder>
	//   47   81:dup             
	//   48   82:invokespecial   #115 <Method void StringBuilder()>
	//   49   85:astore_3        
					stringbuilder.append("Invalid byte order: ");
	//   50   86:aload_3         
	//   51   87:ldc1            #117 <String "Invalid byte order: ">
	//   52   89:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   53   92:pop             
					stringbuilder.append(((Object) (mByteOrder)));
	//   54   93:aload_3         
	//   55   94:aload_0         
	//   56   95:getfield        #37  <Field ByteOrder mByteOrder>
	//   57   98:invokevirtual   #124 <Method StringBuilder StringBuilder.append(Object)>
	//   58  101:pop             
					throw new IOException(stringbuilder.toString());
	//   59  102:new             #33  <Class IOException>
	//   60  105:dup             
	//   61  106:aload_3         
	//   62  107:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   63  110:invokespecial   #111 <Method void IOException(String)>
	//   64  113:athrow          
				}
			} else
			{
				throw new EOFException();
	//   65  114:new             #77  <Class EOFException>
	//   66  117:dup             
	//   67  118:invokespecial   #78  <Method void EOFException()>
	//   68  121:athrow          
			}
		} else
		{
			throw new EOFException();
	//   69  122:new             #77  <Class EOFException>
	//   70  125:dup             
	//   71  126:invokespecial   #78  <Method void EOFException()>
	//   72  129:athrow          
		}
	}

	public String readUTF()
		throws IOException
	{
		mPosition = mPosition + 2;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #51  <Field int mPosition>
	//    3    5:iconst_2        
	//    4    6:iadd            
	//    5    7:putfield        #51  <Field int mPosition>
		return mDataInputStream.readUTF();
	//    6   10:aload_0         
	//    7   11:getfield        #43  <Field DataInputStream mDataInputStream>
	//    8   14:invokevirtual   #144 <Method String DataInputStream.readUTF()>
	//    9   17:areturn         
	}

	public int readUnsignedByte()
		throws IOException
	{
		mPosition = mPosition + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #51  <Field int mPosition>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #51  <Field int mPosition>
		return mDataInputStream.readUnsignedByte();
	//    6   10:aload_0         
	//    7   11:getfield        #43  <Field DataInputStream mDataInputStream>
	//    8   14:invokevirtual   #147 <Method int DataInputStream.readUnsignedByte()>
	//    9   17:ireturn         
	}

	public long readUnsignedInt()
		throws IOException
	{
		return (long)readInt() & 0xffffffffL;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #99  <Method int readInt()>
	//    2    4:i2l             
	//    3    5:ldc2w           #149 <Long 0xffffffffL>
	//    4    8:land            
	//    5    9:lreturn         
	}

	public int readUnsignedShort()
		throws IOException
	{
		mPosition = mPosition + 2;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #51  <Field int mPosition>
	//    3    5:iconst_2        
	//    4    6:iadd            
	//    5    7:putfield        #51  <Field int mPosition>
		if(mPosition <= mLength)
	//*   6   10:aload_0         
	//*   7   11:getfield        #51  <Field int mPosition>
	//*   8   14:aload_0         
	//*   9   15:getfield        #49  <Field int mLength>
	//*  10   18:icmpgt          120
		{
			int i = mDataInputStream.read();
	//   11   21:aload_0         
	//   12   22:getfield        #43  <Field DataInputStream mDataInputStream>
	//   13   25:invokevirtual   #66  <Method int DataInputStream.read()>
	//   14   28:istore_1        
			int j = mDataInputStream.read();
	//   15   29:aload_0         
	//   16   30:getfield        #43  <Field DataInputStream mDataInputStream>
	//   17   33:invokevirtual   #66  <Method int DataInputStream.read()>
	//   18   36:istore_2        
			if((i | j) >= 0)
	//*  19   37:iload_1         
	//*  20   38:iload_2         
	//*  21   39:ior             
	//*  22   40:iflt            112
			{
				ByteOrder byteorder = mByteOrder;
	//   23   43:aload_0         
	//   24   44:getfield        #37  <Field ByteOrder mByteOrder>
	//   25   47:astore_3        
				if(byteorder == LITTLE_ENDIAN)
	//*  26   48:aload_3         
	//*  27   49:getstatic       #25  <Field ByteOrder LITTLE_ENDIAN>
	//*  28   52:if_acmpne       62
					return (j << 8) + i;
	//   29   55:iload_2         
	//   30   56:bipush          8
	//   31   58:ishl            
	//   32   59:iload_1         
	//   33   60:iadd            
	//   34   61:ireturn         
				if(byteorder == BIG_ENDIAN)
	//*  35   62:aload_3         
	//*  36   63:getstatic       #28  <Field ByteOrder BIG_ENDIAN>
	//*  37   66:if_acmpne       76
				{
					return (i << 8) + j;
	//   38   69:iload_1         
	//   39   70:bipush          8
	//   40   72:ishl            
	//   41   73:iload_2         
	//   42   74:iadd            
	//   43   75:ireturn         
				} else
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   44   76:new             #114 <Class StringBuilder>
	//   45   79:dup             
	//   46   80:invokespecial   #115 <Method void StringBuilder()>
	//   47   83:astore_3        
					stringbuilder.append("Invalid byte order: ");
	//   48   84:aload_3         
	//   49   85:ldc1            #117 <String "Invalid byte order: ">
	//   50   87:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   51   90:pop             
					stringbuilder.append(((Object) (mByteOrder)));
	//   52   91:aload_3         
	//   53   92:aload_0         
	//   54   93:getfield        #37  <Field ByteOrder mByteOrder>
	//   55   96:invokevirtual   #124 <Method StringBuilder StringBuilder.append(Object)>
	//   56   99:pop             
					throw new IOException(stringbuilder.toString());
	//   57  100:new             #33  <Class IOException>
	//   58  103:dup             
	//   59  104:aload_3         
	//   60  105:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   61  108:invokespecial   #111 <Method void IOException(String)>
	//   62  111:athrow          
				}
			} else
			{
				throw new EOFException();
	//   63  112:new             #77  <Class EOFException>
	//   64  115:dup             
	//   65  116:invokespecial   #78  <Method void EOFException()>
	//   66  119:athrow          
			}
		} else
		{
			throw new EOFException();
	//   67  120:new             #77  <Class EOFException>
	//   68  123:dup             
	//   69  124:invokespecial   #78  <Method void EOFException()>
	//   70  127:athrow          
		}
	}

	public void seek(long l)
		throws IOException
	{
		int i = mPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field int mPosition>
	//    2    4:istore_3        
		if((long)i > l)
	//*   3    5:iload_3         
	//*   4    6:i2l             
	//*   5    7:lload_1         
	//*   6    8:lcmp            
	//*   7    9:ifle            38
		{
			mPosition = 0;
	//    8   12:aload_0         
	//    9   13:iconst_0        
	//   10   14:putfield        #51  <Field int mPosition>
			mDataInputStream.reset();
	//   11   17:aload_0         
	//   12   18:getfield        #43  <Field DataInputStream mDataInputStream>
	//   13   21:invokevirtual   #156 <Method void DataInputStream.reset()>
			mDataInputStream.mark(mLength);
	//   14   24:aload_0         
	//   15   25:getfield        #43  <Field DataInputStream mDataInputStream>
	//   16   28:aload_0         
	//   17   29:getfield        #49  <Field int mLength>
	//   18   32:invokevirtual   #55  <Method void DataInputStream.mark(int)>
		} else
	//*  19   35:goto            43
		{
			l -= i;
	//   20   38:lload_1         
	//   21   39:iload_3         
	//   22   40:i2l             
	//   23   41:lsub            
	//   24   42:lstore_1        
		}
		i = (int)l;
	//   25   43:lload_1         
	//   26   44:l2i             
	//   27   45:istore_3        
		if(skipBytes(i) == i)
	//*  28   46:aload_0         
	//*  29   47:iload_3         
	//*  30   48:invokevirtual   #160 <Method int skipBytes(int)>
	//*  31   51:iload_3         
	//*  32   52:icmpne          56
			return;
	//   33   55:return          
		else
			throw new IOException("Couldn't seek up to the byteCount");
	//   34   56:new             #33  <Class IOException>
	//   35   59:dup             
	//   36   60:ldc1            #162 <String "Couldn't seek up to the byteCount">
	//   37   62:invokespecial   #111 <Method void IOException(String)>
	//   38   65:athrow          
	}

	public void setByteOrder(ByteOrder byteorder)
	{
		mByteOrder = byteorder;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field ByteOrder mByteOrder>
	//    3    5:return          
	}

	public int skipBytes(int i)
		throws IOException
	{
		int j = Math.min(i, mLength - mPosition);
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #49  <Field int mLength>
	//    3    5:aload_0         
	//    4    6:getfield        #51  <Field int mPosition>
	//    5    9:isub            
	//    6   10:invokestatic    #170 <Method int Math.min(int, int)>
	//    7   13:istore_2        
		for(i = 0; i < j; i += mDataInputStream.skipBytes(j - i));
	//    8   14:iconst_0        
	//    9   15:istore_1        
	//   10   16:iload_1         
	//   11   17:iload_2         
	//   12   18:icmpge          37
	//   13   21:iload_1         
	//   14   22:aload_0         
	//   15   23:getfield        #43  <Field DataInputStream mDataInputStream>
	//   16   26:iload_2         
	//   17   27:iload_1         
	//   18   28:isub            
	//   19   29:invokevirtual   #171 <Method int DataInputStream.skipBytes(int)>
	//   20   32:iadd            
	//   21   33:istore_1        
	//*  22   34:goto            16
		mPosition = mPosition + i;
	//   23   37:aload_0         
	//   24   38:aload_0         
	//   25   39:getfield        #51  <Field int mPosition>
	//   26   42:iload_1         
	//   27   43:iadd            
	//   28   44:putfield        #51  <Field int mPosition>
		return i;
	//   29   47:iload_1         
	//   30   48:ireturn         
	}

	private static final ByteOrder BIG_ENDIAN;
	private static final ByteOrder LITTLE_ENDIAN;
	private ByteOrder mByteOrder;
	private DataInputStream mDataInputStream;
	final int mLength;
	int mPosition;

	static 
	{
		LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
	//    0    0:getstatic       #24  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//    1    3:putstatic       #25  <Field ByteOrder LITTLE_ENDIAN>
		BIG_ENDIAN = ByteOrder.BIG_ENDIAN;
	//    2    6:getstatic       #27  <Field ByteOrder ByteOrder.BIG_ENDIAN>
	//    3    9:putstatic       #28  <Field ByteOrder BIG_ENDIAN>
	//*   4   12:return          
	}

	public ExifInterface$ByteOrderedDataInputStream(InputStream inputstream)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void InputStream()>
		mByteOrder = ByteOrder.BIG_ENDIAN;
	//    2    4:aload_0         
	//    3    5:getstatic       #27  <Field ByteOrder ByteOrder.BIG_ENDIAN>
	//    4    8:putfield        #37  <Field ByteOrder mByteOrder>
		mDataInputStream = new DataInputStream(inputstream);
	//    5   11:aload_0         
	//    6   12:new             #39  <Class DataInputStream>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokespecial   #41  <Method void DataInputStream(InputStream)>
	//   10   20:putfield        #43  <Field DataInputStream mDataInputStream>
		mLength = mDataInputStream.available();
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:getfield        #43  <Field DataInputStream mDataInputStream>
	//   14   28:invokevirtual   #47  <Method int DataInputStream.available()>
	//   15   31:putfield        #49  <Field int mLength>
		mPosition = 0;
	//   16   34:aload_0         
	//   17   35:iconst_0        
	//   18   36:putfield        #51  <Field int mPosition>
		mDataInputStream.mark(mLength);
	//   19   39:aload_0         
	//   20   40:getfield        #43  <Field DataInputStream mDataInputStream>
	//   21   43:aload_0         
	//   22   44:getfield        #49  <Field int mLength>
	//   23   47:invokevirtual   #55  <Method void DataInputStream.mark(int)>
	//   24   50:return          
	}

	public ExifInterface$ByteOrderedDataInputStream(byte abyte0[])
		throws IOException
	{
		this(((InputStream) (new ByteArrayInputStream(abyte0))));
	//    0    0:aload_0         
	//    1    1:new             #59  <Class ByteArrayInputStream>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #61  <Method void ByteArrayInputStream(byte[])>
	//    5    9:invokespecial   #62  <Method void ExifInterface$ByteOrderedDataInputStream(InputStream)>
	//    6   12:return          
	}
}
