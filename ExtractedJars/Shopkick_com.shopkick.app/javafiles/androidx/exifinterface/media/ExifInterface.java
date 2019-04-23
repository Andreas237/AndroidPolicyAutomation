// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.exifinterface.media;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.util.Log;
import android.util.Pair;
import java.io.*;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExifInterface
{
	private static class ByteOrderedDataInputStream extends InputStream
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

		public ByteOrderedDataInputStream(InputStream inputstream)
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

		public ByteOrderedDataInputStream(byte abyte0[])
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

	private static class ByteOrderedDataOutputStream extends FilterOutputStream
	{

		public void setByteOrder(ByteOrder byteorder)
		{
			mByteOrder = byteorder;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #20  <Field ByteOrder mByteOrder>
		//    3    5:return          
		}

		public void write(byte abyte0[])
			throws IOException
		{
			mOutputStream.write(abyte0);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field OutputStream mOutputStream>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #31  <Method void OutputStream.write(byte[])>
		//    4    8:return          
		}

		public void write(byte abyte0[], int i, int j)
			throws IOException
		{
			mOutputStream.write(abyte0, i, j);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field OutputStream mOutputStream>
		//    2    4:aload_1         
		//    3    5:iload_2         
		//    4    6:iload_3         
		//    5    7:invokevirtual   #35  <Method void OutputStream.write(byte[], int, int)>
		//    6   10:return          
		}

		public void writeByte(int i)
			throws IOException
		{
			mOutputStream.write(i);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field OutputStream mOutputStream>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #39  <Method void OutputStream.write(int)>
		//    4    8:return          
		}

		public void writeInt(int i)
			throws IOException
		{
			if(mByteOrder == ByteOrder.LITTLE_ENDIAN)
		//*   0    0:aload_0         
		//*   1    1:getfield        #20  <Field ByteOrder mByteOrder>
		//*   2    4:getstatic       #45  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
		//*   3    7:if_acmpne       70
			{
				mOutputStream.write(i >>> 0 & 0xff);
		//    4   10:aload_0         
		//    5   11:getfield        #18  <Field OutputStream mOutputStream>
		//    6   14:iload_1         
		//    7   15:iconst_0        
		//    8   16:iushr           
		//    9   17:sipush          255
		//   10   20:iand            
		//   11   21:invokevirtual   #39  <Method void OutputStream.write(int)>
				mOutputStream.write(i >>> 8 & 0xff);
		//   12   24:aload_0         
		//   13   25:getfield        #18  <Field OutputStream mOutputStream>
		//   14   28:iload_1         
		//   15   29:bipush          8
		//   16   31:iushr           
		//   17   32:sipush          255
		//   18   35:iand            
		//   19   36:invokevirtual   #39  <Method void OutputStream.write(int)>
				mOutputStream.write(i >>> 16 & 0xff);
		//   20   39:aload_0         
		//   21   40:getfield        #18  <Field OutputStream mOutputStream>
		//   22   43:iload_1         
		//   23   44:bipush          16
		//   24   46:iushr           
		//   25   47:sipush          255
		//   26   50:iand            
		//   27   51:invokevirtual   #39  <Method void OutputStream.write(int)>
				mOutputStream.write(i >>> 24 & 0xff);
		//   28   54:aload_0         
		//   29   55:getfield        #18  <Field OutputStream mOutputStream>
		//   30   58:iload_1         
		//   31   59:bipush          24
		//   32   61:iushr           
		//   33   62:sipush          255
		//   34   65:iand            
		//   35   66:invokevirtual   #39  <Method void OutputStream.write(int)>
				return;
		//   36   69:return          
			}
			if(mByteOrder == ByteOrder.BIG_ENDIAN)
		//*  37   70:aload_0         
		//*  38   71:getfield        #20  <Field ByteOrder mByteOrder>
		//*  39   74:getstatic       #48  <Field ByteOrder ByteOrder.BIG_ENDIAN>
		//*  40   77:if_acmpne       139
			{
				mOutputStream.write(i >>> 24 & 0xff);
		//   41   80:aload_0         
		//   42   81:getfield        #18  <Field OutputStream mOutputStream>
		//   43   84:iload_1         
		//   44   85:bipush          24
		//   45   87:iushr           
		//   46   88:sipush          255
		//   47   91:iand            
		//   48   92:invokevirtual   #39  <Method void OutputStream.write(int)>
				mOutputStream.write(i >>> 16 & 0xff);
		//   49   95:aload_0         
		//   50   96:getfield        #18  <Field OutputStream mOutputStream>
		//   51   99:iload_1         
		//   52  100:bipush          16
		//   53  102:iushr           
		//   54  103:sipush          255
		//   55  106:iand            
		//   56  107:invokevirtual   #39  <Method void OutputStream.write(int)>
				mOutputStream.write(i >>> 8 & 0xff);
		//   57  110:aload_0         
		//   58  111:getfield        #18  <Field OutputStream mOutputStream>
		//   59  114:iload_1         
		//   60  115:bipush          8
		//   61  117:iushr           
		//   62  118:sipush          255
		//   63  121:iand            
		//   64  122:invokevirtual   #39  <Method void OutputStream.write(int)>
				mOutputStream.write(i >>> 0 & 0xff);
		//   65  125:aload_0         
		//   66  126:getfield        #18  <Field OutputStream mOutputStream>
		//   67  129:iload_1         
		//   68  130:iconst_0        
		//   69  131:iushr           
		//   70  132:sipush          255
		//   71  135:iand            
		//   72  136:invokevirtual   #39  <Method void OutputStream.write(int)>
			}
		//   73  139:return          
		}

		public void writeShort(short word0)
			throws IOException
		{
			if(mByteOrder == ByteOrder.LITTLE_ENDIAN)
		//*   0    0:aload_0         
		//*   1    1:getfield        #20  <Field ByteOrder mByteOrder>
		//*   2    4:getstatic       #45  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
		//*   3    7:if_acmpne       40
			{
				mOutputStream.write(word0 >>> 0 & 0xff);
		//    4   10:aload_0         
		//    5   11:getfield        #18  <Field OutputStream mOutputStream>
		//    6   14:iload_1         
		//    7   15:iconst_0        
		//    8   16:iushr           
		//    9   17:sipush          255
		//   10   20:iand            
		//   11   21:invokevirtual   #39  <Method void OutputStream.write(int)>
				mOutputStream.write(word0 >>> 8 & 0xff);
		//   12   24:aload_0         
		//   13   25:getfield        #18  <Field OutputStream mOutputStream>
		//   14   28:iload_1         
		//   15   29:bipush          8
		//   16   31:iushr           
		//   17   32:sipush          255
		//   18   35:iand            
		//   19   36:invokevirtual   #39  <Method void OutputStream.write(int)>
				return;
		//   20   39:return          
			}
			if(mByteOrder == ByteOrder.BIG_ENDIAN)
		//*  21   40:aload_0         
		//*  22   41:getfield        #20  <Field ByteOrder mByteOrder>
		//*  23   44:getstatic       #48  <Field ByteOrder ByteOrder.BIG_ENDIAN>
		//*  24   47:if_acmpne       79
			{
				mOutputStream.write(word0 >>> 8 & 0xff);
		//   25   50:aload_0         
		//   26   51:getfield        #18  <Field OutputStream mOutputStream>
		//   27   54:iload_1         
		//   28   55:bipush          8
		//   29   57:iushr           
		//   30   58:sipush          255
		//   31   61:iand            
		//   32   62:invokevirtual   #39  <Method void OutputStream.write(int)>
				mOutputStream.write(word0 >>> 0 & 0xff);
		//   33   65:aload_0         
		//   34   66:getfield        #18  <Field OutputStream mOutputStream>
		//   35   69:iload_1         
		//   36   70:iconst_0        
		//   37   71:iushr           
		//   38   72:sipush          255
		//   39   75:iand            
		//   40   76:invokevirtual   #39  <Method void OutputStream.write(int)>
			}
		//   41   79:return          
		}

		public void writeUnsignedInt(long l)
			throws IOException
		{
			writeInt((int)l);
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:l2i             
		//    3    3:invokevirtual   #54  <Method void writeInt(int)>
		//    4    6:return          
		}

		public void writeUnsignedShort(int i)
			throws IOException
		{
			writeShort((short)i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:int2short       
		//    3    3:invokevirtual   #57  <Method void writeShort(short)>
		//    4    6:return          
		}

		private ByteOrder mByteOrder;
		private final OutputStream mOutputStream;

		public ByteOrderedDataOutputStream(OutputStream outputstream, ByteOrder byteorder)
		{
			super(outputstream);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #16  <Method void FilterOutputStream(OutputStream)>
			mOutputStream = outputstream;
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:putfield        #18  <Field OutputStream mOutputStream>
			mByteOrder = byteorder;
		//    6   10:aload_0         
		//    7   11:aload_2         
		//    8   12:putfield        #20  <Field ByteOrder mByteOrder>
		//    9   15:return          
		}
	}

	private static class ExifAttribute
	{

		public static ExifAttribute createByte(String s)
		{
			if(s.length() == 1 && s.charAt(0) >= '0' && s.charAt(0) <= '1')
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #32  <Method int String.length()>
		//*   2    4:iconst_1        
		//*   3    5:icmpne          56
		//*   4    8:aload_0         
		//*   5    9:iconst_0        
		//*   6   10:invokevirtual   #36  <Method char String.charAt(int)>
		//*   7   13:bipush          48
		//*   8   15:icmplt          56
		//*   9   18:aload_0         
		//*  10   19:iconst_0        
		//*  11   20:invokevirtual   #36  <Method char String.charAt(int)>
		//*  12   23:bipush          49
		//*  13   25:icmpgt          56
			{
				byte abyte0[] = new byte[1];
		//   14   28:iconst_1        
		//   15   29:newarray        byte[]
		//   16   31:astore_1        
				abyte0[0] = (byte)(s.charAt(0) - 48);
		//   17   32:aload_1         
		//   18   33:iconst_0        
		//   19   34:aload_0         
		//   20   35:iconst_0        
		//   21   36:invokevirtual   #36  <Method char String.charAt(int)>
		//   22   39:bipush          48
		//   23   41:isub            
		//   24   42:int2byte        
		//   25   43:bastore         
				return new ExifAttribute(1, abyte0.length, abyte0);
		//   26   44:new             #2   <Class ExifInterface$ExifAttribute>
		//   27   47:dup             
		//   28   48:iconst_1        
		//   29   49:aload_1         
		//   30   50:arraylength     
		//   31   51:aload_1         
		//   32   52:invokespecial   #38  <Method void ExifInterface$ExifAttribute(int, int, byte[])>
		//   33   55:areturn         
			} else
			{
				s = ((String) (s.getBytes(ExifInterface.ASCII)));
		//   34   56:aload_0         
		//   35   57:getstatic       #42  <Field Charset ExifInterface.ASCII>
		//   36   60:invokevirtual   #46  <Method byte[] String.getBytes(Charset)>
		//   37   63:astore_0        
				return new ExifAttribute(1, s.length, ((byte []) (s)));
		//   38   64:new             #2   <Class ExifInterface$ExifAttribute>
		//   39   67:dup             
		//   40   68:iconst_1        
		//   41   69:aload_0         
		//   42   70:arraylength     
		//   43   71:aload_0         
		//   44   72:invokespecial   #38  <Method void ExifInterface$ExifAttribute(int, int, byte[])>
		//   45   75:areturn         
			}
		}

		public static ExifAttribute createDouble(double d, ByteOrder byteorder)
		{
			return createDouble(new double[] {
				d
			}, byteorder);
		//    0    0:iconst_1        
		//    1    1:newarray        double[]
		//    2    3:dup             
		//    3    4:iconst_0        
		//    4    5:dload_0         
		//    5    6:dastore         
		//    6    7:aload_2         
		//    7    8:invokestatic    #51  <Method ExifInterface$ExifAttribute createDouble(double[], ByteOrder)>
		//    8   11:areturn         
		}

		public static ExifAttribute createDouble(double ad[], ByteOrder byteorder)
		{
			ByteBuffer bytebuffer = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[12] * ad.length]);
		//    0    0:getstatic       #55  <Field int[] ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT>
		//    1    3:bipush          12
		//    2    5:iaload          
		//    3    6:aload_0         
		//    4    7:arraylength     
		//    5    8:imul            
		//    6    9:newarray        byte[]
		//    7   11:invokestatic    #61  <Method ByteBuffer ByteBuffer.wrap(byte[])>
		//    8   14:astore          4
			bytebuffer.order(byteorder);
		//    9   16:aload           4
		//   10   18:aload_1         
		//   11   19:invokevirtual   #65  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
		//   12   22:pop             
			int j = ad.length;
		//   13   23:aload_0         
		//   14   24:arraylength     
		//   15   25:istore_3        
			for(int i = 0; i < j; i++)
		//*  16   26:iconst_0        
		//*  17   27:istore_2        
		//*  18   28:iload_2         
		//*  19   29:iload_3         
		//*  20   30:icmpge          49
				bytebuffer.putDouble(ad[i]);
		//   21   33:aload           4
		//   22   35:aload_0         
		//   23   36:iload_2         
		//   24   37:daload          
		//   25   38:invokevirtual   #69  <Method ByteBuffer ByteBuffer.putDouble(double)>
		//   26   41:pop             

		//   27   42:iload_2         
		//   28   43:iconst_1        
		//   29   44:iadd            
		//   30   45:istore_2        
		//*  31   46:goto            28
			return new ExifAttribute(12, ad.length, bytebuffer.array());
		//   32   49:new             #2   <Class ExifInterface$ExifAttribute>
		//   33   52:dup             
		//   34   53:bipush          12
		//   35   55:aload_0         
		//   36   56:arraylength     
		//   37   57:aload           4
		//   38   59:invokevirtual   #73  <Method byte[] ByteBuffer.array()>
		//   39   62:invokespecial   #38  <Method void ExifInterface$ExifAttribute(int, int, byte[])>
		//   40   65:areturn         
		}

		public static ExifAttribute createSLong(int i, ByteOrder byteorder)
		{
			return createSLong(new int[] {
				i
			}, byteorder);
		//    0    0:iconst_1        
		//    1    1:newarray        int[]
		//    2    3:dup             
		//    3    4:iconst_0        
		//    4    5:iload_0         
		//    5    6:iastore         
		//    6    7:aload_1         
		//    7    8:invokestatic    #78  <Method ExifInterface$ExifAttribute createSLong(int[], ByteOrder)>
		//    8   11:areturn         
		}

		public static ExifAttribute createSLong(int ai[], ByteOrder byteorder)
		{
			ByteBuffer bytebuffer = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[9] * ai.length]);
		//    0    0:getstatic       #55  <Field int[] ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT>
		//    1    3:bipush          9
		//    2    5:iaload          
		//    3    6:aload_0         
		//    4    7:arraylength     
		//    5    8:imul            
		//    6    9:newarray        byte[]
		//    7   11:invokestatic    #61  <Method ByteBuffer ByteBuffer.wrap(byte[])>
		//    8   14:astore          4
			bytebuffer.order(byteorder);
		//    9   16:aload           4
		//   10   18:aload_1         
		//   11   19:invokevirtual   #65  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
		//   12   22:pop             
			int j = ai.length;
		//   13   23:aload_0         
		//   14   24:arraylength     
		//   15   25:istore_3        
			for(int i = 0; i < j; i++)
		//*  16   26:iconst_0        
		//*  17   27:istore_2        
		//*  18   28:iload_2         
		//*  19   29:iload_3         
		//*  20   30:icmpge          49
				bytebuffer.putInt(ai[i]);
		//   21   33:aload           4
		//   22   35:aload_0         
		//   23   36:iload_2         
		//   24   37:iaload          
		//   25   38:invokevirtual   #82  <Method ByteBuffer ByteBuffer.putInt(int)>
		//   26   41:pop             

		//   27   42:iload_2         
		//   28   43:iconst_1        
		//   29   44:iadd            
		//   30   45:istore_2        
		//*  31   46:goto            28
			return new ExifAttribute(9, ai.length, bytebuffer.array());
		//   32   49:new             #2   <Class ExifInterface$ExifAttribute>
		//   33   52:dup             
		//   34   53:bipush          9
		//   35   55:aload_0         
		//   36   56:arraylength     
		//   37   57:aload           4
		//   38   59:invokevirtual   #73  <Method byte[] ByteBuffer.array()>
		//   39   62:invokespecial   #38  <Method void ExifInterface$ExifAttribute(int, int, byte[])>
		//   40   65:areturn         
		}

		public static ExifAttribute createSRational(Rational rational, ByteOrder byteorder)
		{
			return createSRational(new Rational[] {
				rational
			}, byteorder);
		//    0    0:iconst_1        
		//    1    1:anewarray       Rational[]
		//    2    4:dup             
		//    3    5:iconst_0        
		//    4    6:aload_0         
		//    5    7:aastore         
		//    6    8:aload_1         
		//    7    9:invokestatic    #89  <Method ExifInterface$ExifAttribute createSRational(ExifInterface$Rational[], ByteOrder)>
		//    8   12:areturn         
		}

		public static ExifAttribute createSRational(Rational arational[], ByteOrder byteorder)
		{
			ByteBuffer bytebuffer = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[10] * arational.length]);
		//    0    0:getstatic       #55  <Field int[] ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT>
		//    1    3:bipush          10
		//    2    5:iaload          
		//    3    6:aload_0         
		//    4    7:arraylength     
		//    5    8:imul            
		//    6    9:newarray        byte[]
		//    7   11:invokestatic    #61  <Method ByteBuffer ByteBuffer.wrap(byte[])>
		//    8   14:astore          4
			bytebuffer.order(byteorder);
		//    9   16:aload           4
		//   10   18:aload_1         
		//   11   19:invokevirtual   #65  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
		//   12   22:pop             
			int j = arational.length;
		//   13   23:aload_0         
		//   14   24:arraylength     
		//   15   25:istore_3        
			for(int i = 0; i < j; i++)
		//*  16   26:iconst_0        
		//*  17   27:istore_2        
		//*  18   28:iload_2         
		//*  19   29:iload_3         
		//*  20   30:icmpge          66
			{
				byteorder = ((ByteOrder) (arational[i]));
		//   21   33:aload_0         
		//   22   34:iload_2         
		//   23   35:aaload          
		//   24   36:astore_1        
				bytebuffer.putInt((int)((Rational) (byteorder)).numerator);
		//   25   37:aload           4
		//   26   39:aload_1         
		//   27   40:getfield        #93  <Field long ExifInterface$Rational.numerator>
		//   28   43:l2i             
		//   29   44:invokevirtual   #82  <Method ByteBuffer ByteBuffer.putInt(int)>
		//   30   47:pop             
				bytebuffer.putInt((int)((Rational) (byteorder)).denominator);
		//   31   48:aload           4
		//   32   50:aload_1         
		//   33   51:getfield        #96  <Field long ExifInterface$Rational.denominator>
		//   34   54:l2i             
		//   35   55:invokevirtual   #82  <Method ByteBuffer ByteBuffer.putInt(int)>
		//   36   58:pop             
			}

		//   37   59:iload_2         
		//   38   60:iconst_1        
		//   39   61:iadd            
		//   40   62:istore_2        
		//*  41   63:goto            28
			return new ExifAttribute(10, arational.length, bytebuffer.array());
		//   42   66:new             #2   <Class ExifInterface$ExifAttribute>
		//   43   69:dup             
		//   44   70:bipush          10
		//   45   72:aload_0         
		//   46   73:arraylength     
		//   47   74:aload           4
		//   48   76:invokevirtual   #73  <Method byte[] ByteBuffer.array()>
		//   49   79:invokespecial   #38  <Method void ExifInterface$ExifAttribute(int, int, byte[])>
		//   50   82:areturn         
		}

		public static ExifAttribute createString(String s)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #99  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #100 <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append(s);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
		//    7   13:pop             
			stringbuilder.append('\0');
		//    8   14:aload_1         
		//    9   15:iconst_0        
		//   10   16:invokevirtual   #107 <Method StringBuilder StringBuilder.append(char)>
		//   11   19:pop             
			s = ((String) (stringbuilder.toString().getBytes(ExifInterface.ASCII)));
		//   12   20:aload_1         
		//   13   21:invokevirtual   #111 <Method String StringBuilder.toString()>
		//   14   24:getstatic       #42  <Field Charset ExifInterface.ASCII>
		//   15   27:invokevirtual   #46  <Method byte[] String.getBytes(Charset)>
		//   16   30:astore_0        
			return new ExifAttribute(2, s.length, ((byte []) (s)));
		//   17   31:new             #2   <Class ExifInterface$ExifAttribute>
		//   18   34:dup             
		//   19   35:iconst_2        
		//   20   36:aload_0         
		//   21   37:arraylength     
		//   22   38:aload_0         
		//   23   39:invokespecial   #38  <Method void ExifInterface$ExifAttribute(int, int, byte[])>
		//   24   42:areturn         
		}

		public static ExifAttribute createULong(long l, ByteOrder byteorder)
		{
			return createULong(new long[] {
				l
			}, byteorder);
		//    0    0:iconst_1        
		//    1    1:newarray        long[]
		//    2    3:dup             
		//    3    4:iconst_0        
		//    4    5:lload_0         
		//    5    6:lastore         
		//    6    7:aload_2         
		//    7    8:invokestatic    #116 <Method ExifInterface$ExifAttribute createULong(long[], ByteOrder)>
		//    8   11:areturn         
		}

		public static ExifAttribute createULong(long al[], ByteOrder byteorder)
		{
			ByteBuffer bytebuffer = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[4] * al.length]);
		//    0    0:getstatic       #55  <Field int[] ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT>
		//    1    3:iconst_4        
		//    2    4:iaload          
		//    3    5:aload_0         
		//    4    6:arraylength     
		//    5    7:imul            
		//    6    8:newarray        byte[]
		//    7   10:invokestatic    #61  <Method ByteBuffer ByteBuffer.wrap(byte[])>
		//    8   13:astore          4
			bytebuffer.order(byteorder);
		//    9   15:aload           4
		//   10   17:aload_1         
		//   11   18:invokevirtual   #65  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
		//   12   21:pop             
			int j = al.length;
		//   13   22:aload_0         
		//   14   23:arraylength     
		//   15   24:istore_3        
			for(int i = 0; i < j; i++)
		//*  16   25:iconst_0        
		//*  17   26:istore_2        
		//*  18   27:iload_2         
		//*  19   28:iload_3         
		//*  20   29:icmpge          49
				bytebuffer.putInt((int)al[i]);
		//   21   32:aload           4
		//   22   34:aload_0         
		//   23   35:iload_2         
		//   24   36:laload          
		//   25   37:l2i             
		//   26   38:invokevirtual   #82  <Method ByteBuffer ByteBuffer.putInt(int)>
		//   27   41:pop             

		//   28   42:iload_2         
		//   29   43:iconst_1        
		//   30   44:iadd            
		//   31   45:istore_2        
		//*  32   46:goto            27
			return new ExifAttribute(4, al.length, bytebuffer.array());
		//   33   49:new             #2   <Class ExifInterface$ExifAttribute>
		//   34   52:dup             
		//   35   53:iconst_4        
		//   36   54:aload_0         
		//   37   55:arraylength     
		//   38   56:aload           4
		//   39   58:invokevirtual   #73  <Method byte[] ByteBuffer.array()>
		//   40   61:invokespecial   #38  <Method void ExifInterface$ExifAttribute(int, int, byte[])>
		//   41   64:areturn         
		}

		public static ExifAttribute createURational(Rational rational, ByteOrder byteorder)
		{
			return createURational(new Rational[] {
				rational
			}, byteorder);
		//    0    0:iconst_1        
		//    1    1:anewarray       Rational[]
		//    2    4:dup             
		//    3    5:iconst_0        
		//    4    6:aload_0         
		//    5    7:aastore         
		//    6    8:aload_1         
		//    7    9:invokestatic    #119 <Method ExifInterface$ExifAttribute createURational(ExifInterface$Rational[], ByteOrder)>
		//    8   12:areturn         
		}

		public static ExifAttribute createURational(Rational arational[], ByteOrder byteorder)
		{
			ByteBuffer bytebuffer = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[5] * arational.length]);
		//    0    0:getstatic       #55  <Field int[] ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT>
		//    1    3:iconst_5        
		//    2    4:iaload          
		//    3    5:aload_0         
		//    4    6:arraylength     
		//    5    7:imul            
		//    6    8:newarray        byte[]
		//    7   10:invokestatic    #61  <Method ByteBuffer ByteBuffer.wrap(byte[])>
		//    8   13:astore          4
			bytebuffer.order(byteorder);
		//    9   15:aload           4
		//   10   17:aload_1         
		//   11   18:invokevirtual   #65  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
		//   12   21:pop             
			int j = arational.length;
		//   13   22:aload_0         
		//   14   23:arraylength     
		//   15   24:istore_3        
			for(int i = 0; i < j; i++)
		//*  16   25:iconst_0        
		//*  17   26:istore_2        
		//*  18   27:iload_2         
		//*  19   28:iload_3         
		//*  20   29:icmpge          65
			{
				byteorder = ((ByteOrder) (arational[i]));
		//   21   32:aload_0         
		//   22   33:iload_2         
		//   23   34:aaload          
		//   24   35:astore_1        
				bytebuffer.putInt((int)((Rational) (byteorder)).numerator);
		//   25   36:aload           4
		//   26   38:aload_1         
		//   27   39:getfield        #93  <Field long ExifInterface$Rational.numerator>
		//   28   42:l2i             
		//   29   43:invokevirtual   #82  <Method ByteBuffer ByteBuffer.putInt(int)>
		//   30   46:pop             
				bytebuffer.putInt((int)((Rational) (byteorder)).denominator);
		//   31   47:aload           4
		//   32   49:aload_1         
		//   33   50:getfield        #96  <Field long ExifInterface$Rational.denominator>
		//   34   53:l2i             
		//   35   54:invokevirtual   #82  <Method ByteBuffer ByteBuffer.putInt(int)>
		//   36   57:pop             
			}

		//   37   58:iload_2         
		//   38   59:iconst_1        
		//   39   60:iadd            
		//   40   61:istore_2        
		//*  41   62:goto            27
			return new ExifAttribute(5, arational.length, bytebuffer.array());
		//   42   65:new             #2   <Class ExifInterface$ExifAttribute>
		//   43   68:dup             
		//   44   69:iconst_5        
		//   45   70:aload_0         
		//   46   71:arraylength     
		//   47   72:aload           4
		//   48   74:invokevirtual   #73  <Method byte[] ByteBuffer.array()>
		//   49   77:invokespecial   #38  <Method void ExifInterface$ExifAttribute(int, int, byte[])>
		//   50   80:areturn         
		}

		public static ExifAttribute createUShort(int i, ByteOrder byteorder)
		{
			return createUShort(new int[] {
				i
			}, byteorder);
		//    0    0:iconst_1        
		//    1    1:newarray        int[]
		//    2    3:dup             
		//    3    4:iconst_0        
		//    4    5:iload_0         
		//    5    6:iastore         
		//    6    7:aload_1         
		//    7    8:invokestatic    #122 <Method ExifInterface$ExifAttribute createUShort(int[], ByteOrder)>
		//    8   11:areturn         
		}

		public static ExifAttribute createUShort(int ai[], ByteOrder byteorder)
		{
			ByteBuffer bytebuffer = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[3] * ai.length]);
		//    0    0:getstatic       #55  <Field int[] ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT>
		//    1    3:iconst_3        
		//    2    4:iaload          
		//    3    5:aload_0         
		//    4    6:arraylength     
		//    5    7:imul            
		//    6    8:newarray        byte[]
		//    7   10:invokestatic    #61  <Method ByteBuffer ByteBuffer.wrap(byte[])>
		//    8   13:astore          4
			bytebuffer.order(byteorder);
		//    9   15:aload           4
		//   10   17:aload_1         
		//   11   18:invokevirtual   #65  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
		//   12   21:pop             
			int j = ai.length;
		//   13   22:aload_0         
		//   14   23:arraylength     
		//   15   24:istore_3        
			for(int i = 0; i < j; i++)
		//*  16   25:iconst_0        
		//*  17   26:istore_2        
		//*  18   27:iload_2         
		//*  19   28:iload_3         
		//*  20   29:icmpge          49
				bytebuffer.putShort((short)ai[i]);
		//   21   32:aload           4
		//   22   34:aload_0         
		//   23   35:iload_2         
		//   24   36:iaload          
		//   25   37:int2short       
		//   26   38:invokevirtual   #126 <Method ByteBuffer ByteBuffer.putShort(short)>
		//   27   41:pop             

		//   28   42:iload_2         
		//   29   43:iconst_1        
		//   30   44:iadd            
		//   31   45:istore_2        
		//*  32   46:goto            27
			return new ExifAttribute(3, ai.length, bytebuffer.array());
		//   33   49:new             #2   <Class ExifInterface$ExifAttribute>
		//   34   52:dup             
		//   35   53:iconst_3        
		//   36   54:aload_0         
		//   37   55:arraylength     
		//   38   56:aload           4
		//   39   58:invokevirtual   #73  <Method byte[] ByteBuffer.array()>
		//   40   61:invokespecial   #38  <Method void ExifInterface$ExifAttribute(int, int, byte[])>
		//   41   64:areturn         
		}

		public double getDoubleValue(ByteOrder byteorder)
		{
			byteorder = ((ByteOrder) (getValue(byteorder)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #132 <Method Object getValue(ByteOrder)>
		//    3    5:astore_1        
			if(byteorder != null)
		//*   4    6:aload_1         
		//*   5    7:ifnull          168
			{
				if(byteorder instanceof String)
		//*   6   10:aload_1         
		//*   7   11:instanceof      #28  <Class String>
		//*   8   14:ifeq            25
					return Double.parseDouble((String)byteorder);
		//    9   17:aload_1         
		//   10   18:checkcast       #28  <Class String>
		//   11   21:invokestatic    #138 <Method double Double.parseDouble(String)>
		//   12   24:dreturn         
				if(byteorder instanceof long[])
		//*  13   25:aload_1         
		//*  14   26:instanceof      #140 <Class long[]>
		//*  15   29:ifeq            58
				{
					byteorder = ((ByteOrder) ((long[])byteorder));
		//   16   32:aload_1         
		//   17   33:checkcast       #140 <Class long[]>
		//   18   36:astore_1        
					if(byteorder.length == 1)
		//*  19   37:aload_1         
		//*  20   38:arraylength     
		//*  21   39:iconst_1        
		//*  22   40:icmpne          48
						return (double)byteorder[0];
		//   23   43:aload_1         
		//   24   44:iconst_0        
		//   25   45:laload          
		//   26   46:l2d             
		//   27   47:dreturn         
					else
						throw new NumberFormatException("There are more than one component");
		//   28   48:new             #142 <Class NumberFormatException>
		//   29   51:dup             
		//   30   52:ldc1            #144 <String "There are more than one component">
		//   31   54:invokespecial   #147 <Method void NumberFormatException(String)>
		//   32   57:athrow          
				}
				if(byteorder instanceof int[])
		//*  33   58:aload_1         
		//*  34   59:instanceof      #148 <Class int[]>
		//*  35   62:ifeq            91
				{
					byteorder = ((ByteOrder) ((int[])byteorder));
		//   36   65:aload_1         
		//   37   66:checkcast       #148 <Class int[]>
		//   38   69:astore_1        
					if(byteorder.length == 1)
		//*  39   70:aload_1         
		//*  40   71:arraylength     
		//*  41   72:iconst_1        
		//*  42   73:icmpne          81
						return (double)byteorder[0];
		//   43   76:aload_1         
		//   44   77:iconst_0        
		//   45   78:iaload          
		//   46   79:i2d             
		//   47   80:dreturn         
					else
						throw new NumberFormatException("There are more than one component");
		//   48   81:new             #142 <Class NumberFormatException>
		//   49   84:dup             
		//   50   85:ldc1            #144 <String "There are more than one component">
		//   51   87:invokespecial   #147 <Method void NumberFormatException(String)>
		//   52   90:athrow          
				}
				if(byteorder instanceof double[])
		//*  53   91:aload_1         
		//*  54   92:instanceof      #150 <Class double[]>
		//*  55   95:ifeq            123
				{
					byteorder = ((ByteOrder) ((double[])byteorder));
		//   56   98:aload_1         
		//   57   99:checkcast       #150 <Class double[]>
		//   58  102:astore_1        
					if(byteorder.length == 1)
		//*  59  103:aload_1         
		//*  60  104:arraylength     
		//*  61  105:iconst_1        
		//*  62  106:icmpne          113
						return byteorder[0];
		//   63  109:aload_1         
		//   64  110:iconst_0        
		//   65  111:daload          
		//   66  112:dreturn         
					else
						throw new NumberFormatException("There are more than one component");
		//   67  113:new             #142 <Class NumberFormatException>
		//   68  116:dup             
		//   69  117:ldc1            #144 <String "There are more than one component">
		//   70  119:invokespecial   #147 <Method void NumberFormatException(String)>
		//   71  122:athrow          
				}
				if(byteorder instanceof Rational[])
		//*  72  123:aload_1         
		//*  73  124:instanceof      #152 <Class ExifInterface$Rational[]>
		//*  74  127:ifeq            158
				{
					byteorder = ((ByteOrder) ((Rational[])byteorder));
		//   75  130:aload_1         
		//   76  131:checkcast       #152 <Class ExifInterface$Rational[]>
		//   77  134:astore_1        
					if(byteorder.length == 1)
		//*  78  135:aload_1         
		//*  79  136:arraylength     
		//*  80  137:iconst_1        
		//*  81  138:icmpne          148
						return ((Rational) (byteorder[0])).calculate();
		//   82  141:aload_1         
		//   83  142:iconst_0        
		//   84  143:aaload          
		//   85  144:invokevirtual   #156 <Method double ExifInterface$Rational.calculate()>
		//   86  147:dreturn         
					else
						throw new NumberFormatException("There are more than one component");
		//   87  148:new             #142 <Class NumberFormatException>
		//   88  151:dup             
		//   89  152:ldc1            #144 <String "There are more than one component">
		//   90  154:invokespecial   #147 <Method void NumberFormatException(String)>
		//   91  157:athrow          
				} else
				{
					throw new NumberFormatException("Couldn't find a double value");
		//   92  158:new             #142 <Class NumberFormatException>
		//   93  161:dup             
		//   94  162:ldc1            #158 <String "Couldn't find a double value">
		//   95  164:invokespecial   #147 <Method void NumberFormatException(String)>
		//   96  167:athrow          
				}
			} else
			{
				throw new NumberFormatException("NULL can't be converted to a double value");
		//   97  168:new             #142 <Class NumberFormatException>
		//   98  171:dup             
		//   99  172:ldc1            #160 <String "NULL can't be converted to a double value">
		//  100  174:invokespecial   #147 <Method void NumberFormatException(String)>
		//  101  177:athrow          
			}
		}

		public int getIntValue(ByteOrder byteorder)
		{
			byteorder = ((ByteOrder) (getValue(byteorder)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #132 <Method Object getValue(ByteOrder)>
		//    3    5:astore_1        
			if(byteorder != null)
		//*   4    6:aload_1         
		//*   5    7:ifnull          100
			{
				if(byteorder instanceof String)
		//*   6   10:aload_1         
		//*   7   11:instanceof      #28  <Class String>
		//*   8   14:ifeq            25
					return Integer.parseInt((String)byteorder);
		//    9   17:aload_1         
		//   10   18:checkcast       #28  <Class String>
		//   11   21:invokestatic    #168 <Method int Integer.parseInt(String)>
		//   12   24:ireturn         
				if(byteorder instanceof long[])
		//*  13   25:aload_1         
		//*  14   26:instanceof      #140 <Class long[]>
		//*  15   29:ifeq            58
				{
					byteorder = ((ByteOrder) ((long[])byteorder));
		//   16   32:aload_1         
		//   17   33:checkcast       #140 <Class long[]>
		//   18   36:astore_1        
					if(byteorder.length == 1)
		//*  19   37:aload_1         
		//*  20   38:arraylength     
		//*  21   39:iconst_1        
		//*  22   40:icmpne          48
						return (int)byteorder[0];
		//   23   43:aload_1         
		//   24   44:iconst_0        
		//   25   45:laload          
		//   26   46:l2i             
		//   27   47:ireturn         
					else
						throw new NumberFormatException("There are more than one component");
		//   28   48:new             #142 <Class NumberFormatException>
		//   29   51:dup             
		//   30   52:ldc1            #144 <String "There are more than one component">
		//   31   54:invokespecial   #147 <Method void NumberFormatException(String)>
		//   32   57:athrow          
				}
				if(byteorder instanceof int[])
		//*  33   58:aload_1         
		//*  34   59:instanceof      #148 <Class int[]>
		//*  35   62:ifeq            90
				{
					byteorder = ((ByteOrder) ((int[])byteorder));
		//   36   65:aload_1         
		//   37   66:checkcast       #148 <Class int[]>
		//   38   69:astore_1        
					if(byteorder.length == 1)
		//*  39   70:aload_1         
		//*  40   71:arraylength     
		//*  41   72:iconst_1        
		//*  42   73:icmpne          80
						return byteorder[0];
		//   43   76:aload_1         
		//   44   77:iconst_0        
		//   45   78:iaload          
		//   46   79:ireturn         
					else
						throw new NumberFormatException("There are more than one component");
		//   47   80:new             #142 <Class NumberFormatException>
		//   48   83:dup             
		//   49   84:ldc1            #144 <String "There are more than one component">
		//   50   86:invokespecial   #147 <Method void NumberFormatException(String)>
		//   51   89:athrow          
				} else
				{
					throw new NumberFormatException("Couldn't find a integer value");
		//   52   90:new             #142 <Class NumberFormatException>
		//   53   93:dup             
		//   54   94:ldc1            #170 <String "Couldn't find a integer value">
		//   55   96:invokespecial   #147 <Method void NumberFormatException(String)>
		//   56   99:athrow          
				}
			} else
			{
				throw new NumberFormatException("NULL can't be converted to a integer value");
		//   57  100:new             #142 <Class NumberFormatException>
		//   58  103:dup             
		//   59  104:ldc1            #172 <String "NULL can't be converted to a integer value">
		//   60  106:invokespecial   #147 <Method void NumberFormatException(String)>
		//   61  109:athrow          
			}
		}

		public String getStringValue(ByteOrder byteorder)
		{
			Object obj = getValue(byteorder);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #132 <Method Object getValue(ByteOrder)>
		//    3    5:astore          7
			if(obj == null)
		//*   4    7:aload           7
		//*   5    9:ifnonnull       14
				return null;
		//    6   12:aconst_null     
		//    7   13:areturn         
			if(obj instanceof String)
		//*   8   14:aload           7
		//*   9   16:instanceof      #28  <Class String>
		//*  10   19:ifeq            28
				return (String)obj;
		//   11   22:aload           7
		//   12   24:checkcast       #28  <Class String>
		//   13   27:areturn         
			byteorder = ((ByteOrder) (new StringBuilder()));
		//   14   28:new             #99  <Class StringBuilder>
		//   15   31:dup             
		//   16   32:invokespecial   #100 <Method void StringBuilder()>
		//   17   35:astore_1        
			boolean flag2 = obj instanceof long[];
		//   18   36:aload           7
		//   19   38:instanceof      #140 <Class long[]>
		//   20   41:istore          6
			int i1 = 0;
		//   21   43:iconst_0        
		//   22   44:istore_3        
			boolean flag = false;
		//   23   45:iconst_0        
		//   24   46:istore          4
			boolean flag1 = false;
		//   25   48:iconst_0        
		//   26   49:istore          5
			int i = 0;
		//   27   51:iconst_0        
		//   28   52:istore_2        
			if(flag2)
		//*  29   53:iload           6
		//*  30   55:ifeq            111
			{
				obj = ((Object) ((long[])obj));
		//   31   58:aload           7
		//   32   60:checkcast       #140 <Class long[]>
		//   33   63:astore          7
				do
				{
					if(i >= obj.length)
						break;
		//   34   65:iload_2         
		//   35   66:aload           7
		//   36   68:arraylength     
		//   37   69:icmpge          106
					((StringBuilder) (byteorder)).append(obj[i]);
		//   38   72:aload_1         
		//   39   73:aload           7
		//   40   75:iload_2         
		//   41   76:laload          
		//   42   77:invokevirtual   #177 <Method StringBuilder StringBuilder.append(long)>
		//   43   80:pop             
					i1 = i + 1;
		//   44   81:iload_2         
		//   45   82:iconst_1        
		//   46   83:iadd            
		//   47   84:istore_3        
					i = i1;
		//   48   85:iload_3         
		//   49   86:istore_2        
					if(i1 != obj.length)
		//*  50   87:iload_3         
		//*  51   88:aload           7
		//*  52   90:arraylength     
		//*  53   91:icmpeq          65
					{
						((StringBuilder) (byteorder)).append(",");
		//   54   94:aload_1         
		//   55   95:ldc1            #179 <String ",">
		//   56   97:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
		//   57  100:pop             
						i = i1;
		//   58  101:iload_3         
		//   59  102:istore_2        
					}
				} while(true);
		//   60  103:goto            65
				return ((StringBuilder) (byteorder)).toString();
		//   61  106:aload_1         
		//   62  107:invokevirtual   #111 <Method String StringBuilder.toString()>
		//   63  110:areturn         
			}
			if(obj instanceof int[])
		//*  64  111:aload           7
		//*  65  113:instanceof      #148 <Class int[]>
		//*  66  116:ifeq            174
			{
				obj = ((Object) ((int[])obj));
		//   67  119:aload           7
		//   68  121:checkcast       #148 <Class int[]>
		//   69  124:astore          7
				int j = i1;
		//   70  126:iload_3         
		//   71  127:istore_2        
				do
				{
					if(j >= obj.length)
						break;
		//   72  128:iload_2         
		//   73  129:aload           7
		//   74  131:arraylength     
		//   75  132:icmpge          169
					((StringBuilder) (byteorder)).append(obj[j]);
		//   76  135:aload_1         
		//   77  136:aload           7
		//   78  138:iload_2         
		//   79  139:iaload          
		//   80  140:invokevirtual   #182 <Method StringBuilder StringBuilder.append(int)>
		//   81  143:pop             
					int j1 = j + 1;
		//   82  144:iload_2         
		//   83  145:iconst_1        
		//   84  146:iadd            
		//   85  147:istore_3        
					j = j1;
		//   86  148:iload_3         
		//   87  149:istore_2        
					if(j1 != obj.length)
		//*  88  150:iload_3         
		//*  89  151:aload           7
		//*  90  153:arraylength     
		//*  91  154:icmpeq          128
					{
						((StringBuilder) (byteorder)).append(",");
		//   92  157:aload_1         
		//   93  158:ldc1            #179 <String ",">
		//   94  160:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
		//   95  163:pop             
						j = j1;
		//   96  164:iload_3         
		//   97  165:istore_2        
					}
				} while(true);
		//   98  166:goto            128
				return ((StringBuilder) (byteorder)).toString();
		//   99  169:aload_1         
		//  100  170:invokevirtual   #111 <Method String StringBuilder.toString()>
		//  101  173:areturn         
			}
			if(obj instanceof double[])
		//* 102  174:aload           7
		//* 103  176:instanceof      #150 <Class double[]>
		//* 104  179:ifeq            238
			{
				obj = ((Object) ((double[])obj));
		//  105  182:aload           7
		//  106  184:checkcast       #150 <Class double[]>
		//  107  187:astore          7
				int k = ((int) (flag));
		//  108  189:iload           4
		//  109  191:istore_2        
				do
				{
					if(k >= obj.length)
						break;
		//  110  192:iload_2         
		//  111  193:aload           7
		//  112  195:arraylength     
		//  113  196:icmpge          233
					((StringBuilder) (byteorder)).append(obj[k]);
		//  114  199:aload_1         
		//  115  200:aload           7
		//  116  202:iload_2         
		//  117  203:daload          
		//  118  204:invokevirtual   #185 <Method StringBuilder StringBuilder.append(double)>
		//  119  207:pop             
					int k1 = k + 1;
		//  120  208:iload_2         
		//  121  209:iconst_1        
		//  122  210:iadd            
		//  123  211:istore_3        
					k = k1;
		//  124  212:iload_3         
		//  125  213:istore_2        
					if(k1 != obj.length)
		//* 126  214:iload_3         
		//* 127  215:aload           7
		//* 128  217:arraylength     
		//* 129  218:icmpeq          192
					{
						((StringBuilder) (byteorder)).append(",");
		//  130  221:aload_1         
		//  131  222:ldc1            #179 <String ",">
		//  132  224:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
		//  133  227:pop             
						k = k1;
		//  134  228:iload_3         
		//  135  229:istore_2        
					}
				} while(true);
		//  136  230:goto            192
				return ((StringBuilder) (byteorder)).toString();
		//  137  233:aload_1         
		//  138  234:invokevirtual   #111 <Method String StringBuilder.toString()>
		//  139  237:areturn         
			}
			if(obj instanceof Rational[])
		//* 140  238:aload           7
		//* 141  240:instanceof      #152 <Class ExifInterface$Rational[]>
		//* 142  243:ifeq            324
			{
				Rational arational[] = (Rational[])obj;
		//  143  246:aload           7
		//  144  248:checkcast       #152 <Class ExifInterface$Rational[]>
		//  145  251:astore          7
				int l = ((int) (flag1));
		//  146  253:iload           5
		//  147  255:istore_2        
				do
				{
					if(l >= arational.length)
						break;
		//  148  256:iload_2         
		//  149  257:aload           7
		//  150  259:arraylength     
		//  151  260:icmpge          319
					((StringBuilder) (byteorder)).append(arational[l].numerator);
		//  152  263:aload_1         
		//  153  264:aload           7
		//  154  266:iload_2         
		//  155  267:aaload          
		//  156  268:getfield        #93  <Field long ExifInterface$Rational.numerator>
		//  157  271:invokevirtual   #177 <Method StringBuilder StringBuilder.append(long)>
		//  158  274:pop             
					((StringBuilder) (byteorder)).append('/');
		//  159  275:aload_1         
		//  160  276:bipush          47
		//  161  278:invokevirtual   #107 <Method StringBuilder StringBuilder.append(char)>
		//  162  281:pop             
					((StringBuilder) (byteorder)).append(arational[l].denominator);
		//  163  282:aload_1         
		//  164  283:aload           7
		//  165  285:iload_2         
		//  166  286:aaload          
		//  167  287:getfield        #96  <Field long ExifInterface$Rational.denominator>
		//  168  290:invokevirtual   #177 <Method StringBuilder StringBuilder.append(long)>
		//  169  293:pop             
					int l1 = l + 1;
		//  170  294:iload_2         
		//  171  295:iconst_1        
		//  172  296:iadd            
		//  173  297:istore_3        
					l = l1;
		//  174  298:iload_3         
		//  175  299:istore_2        
					if(l1 != arational.length)
		//* 176  300:iload_3         
		//* 177  301:aload           7
		//* 178  303:arraylength     
		//* 179  304:icmpeq          256
					{
						((StringBuilder) (byteorder)).append(",");
		//  180  307:aload_1         
		//  181  308:ldc1            #179 <String ",">
		//  182  310:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
		//  183  313:pop             
						l = l1;
		//  184  314:iload_3         
		//  185  315:istore_2        
					}
				} while(true);
		//  186  316:goto            256
				return ((StringBuilder) (byteorder)).toString();
		//  187  319:aload_1         
		//  188  320:invokevirtual   #111 <Method String StringBuilder.toString()>
		//  189  323:areturn         
			} else
			{
				return null;
		//  190  324:aconst_null     
		//  191  325:areturn         
			}
		}

		Object getValue(ByteOrder byteorder)
		{
			ByteOrderedDataInputStream byteordereddatainputstream = new ByteOrderedDataInputStream(bytes);
		//    0    0:new             #189 <Class ExifInterface$ByteOrderedDataInputStream>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #23  <Field byte[] bytes>
		//    4    8:invokespecial   #192 <Method void ExifInterface$ByteOrderedDataInputStream(byte[])>
		//    5   11:astore          14
			Object obj = ((Object) (byteordereddatainputstream));
		//    6   13:aload           14
		//    7   15:astore          13
			byteordereddatainputstream.setByteOrder(byteorder);
		//    8   17:aload           14
		//    9   19:aload_1         
		//   10   20:invokevirtual   #196 <Method void ExifInterface$ByteOrderedDataInputStream.setByteOrder(ByteOrder)>
			obj = ((Object) (byteordereddatainputstream));
		//   11   23:aload           14
		//   12   25:astore          13
			int j = format;
		//   13   27:aload_0         
		//   14   28:getfield        #19  <Field int format>
		//   15   31:istore          12
			int i;
			byte byte0;
			boolean flag;
			boolean flag1;
			boolean flag2;
			boolean flag3;
			boolean flag4;
			boolean flag5;
			boolean flag6;
			boolean flag7;
			flag1 = true;
		//   16   33:iconst_1        
		//   17   34:istore          5
			byte0 = 0;
		//   18   36:iconst_0        
		//   19   37:istore_3        
			flag2 = false;
		//   20   38:iconst_0        
		//   21   39:istore          6
			flag3 = false;
		//   22   41:iconst_0        
		//   23   42:istore          7
			flag4 = false;
		//   24   44:iconst_0        
		//   25   45:istore          8
			flag5 = false;
		//   26   47:iconst_0        
		//   27   48:istore          9
			flag6 = false;
		//   28   50:iconst_0        
		//   29   51:istore          10
			flag7 = false;
		//   30   53:iconst_0        
		//   31   54:istore          11
			flag = false;
		//   32   56:iconst_0        
		//   33   57:istore          4
			i = 0;
		//   34   59:iconst_0        
		//   35   60:istore_2        
			j;
		//   36   61:iload           12
			JVM INSTR tableswitch 1 12: default 1091
		//		               1 857
		//		               2 677
		//		               3 611
		//		               4 545
		//		               5 466
		//		               6 857
		//		               7 677
		//		               8 400
		//		               9 334
		//		               10 253
		//		               11 187
		//		               12 124;
		//   37   63:tableswitch     1 12: default 1091
		//		               1 857
		//		               2 677
		//		               3 611
		//		               4 545
		//		               5 466
		//		               6 857
		//		               7 677
		//		               8 400
		//		               9 334
		//		               10 253
		//		               11 187
		//		               12 124
			   goto _L1 _L2 _L3 _L4 _L5 _L6 _L2 _L3 _L7 _L8 _L9 _L10 _L11
_L11:
			obj = ((Object) (byteordereddatainputstream));
		//   38  124:aload           14
		//   39  126:astore          13
			byteorder = ((ByteOrder) (new double[numberOfComponents]));
		//   40  128:aload_0         
		//   41  129:getfield        #21  <Field int numberOfComponents>
		//   42  132:newarray        double[]
		//   43  134:astore_1        
_L13:
			obj = ((Object) (byteordereddatainputstream));
		//   44  135:aload           14
		//   45  137:astore          13
			if(i >= numberOfComponents)
				break; /* Loop/switch isn't completed */
		//   46  139:iload_2         
		//   47  140:aload_0         
		//   48  141:getfield        #21  <Field int numberOfComponents>
		//   49  144:icmpge          166
			obj = ((Object) (byteordereddatainputstream));
		//   50  147:aload           14
		//   51  149:astore          13
			byteorder[i] = byteordereddatainputstream.readDouble();
		//   52  151:aload_1         
		//   53  152:iload_2         
		//   54  153:aload           14
		//   55  155:invokevirtual   #199 <Method double ExifInterface$ByteOrderedDataInputStream.readDouble()>
		//   56  158:dastore         
			i++;
		//   57  159:iload_2         
		//   58  160:iconst_1        
		//   59  161:iadd            
		//   60  162:istore_2        
			if(true) goto _L13; else goto _L12
		//   61  163:goto            135
_L12:
			try
			{
				byteordereddatainputstream.close();
		//   62  166:aload           14
		//   63  168:invokevirtual   #202 <Method void ExifInterface$ByteOrderedDataInputStream.close()>
			}
		//*  64  171:aload_1         
		//*  65  172:areturn         
			// Misplaced declaration of an exception variable
			catch(Object obj)
		//*  66  173:astore          13
			{
				Log.e("ExifInterface", "IOException occurred while closing InputStream", ((Throwable) (obj)));
		//   67  175:ldc1            #204 <String "ExifInterface">
		//   68  177:ldc1            #206 <String "IOException occurred while closing InputStream">
		//   69  179:aload           13
		//   70  181:invokestatic    #212 <Method int Log.e(String, String, Throwable)>
		//   71  184:pop             
				return ((Object) (byteorder));
		//   72  185:aload_1         
		//   73  186:areturn         
			}
			return ((Object) (byteorder));
_L10:
			obj = ((Object) (byteordereddatainputstream));
		//   74  187:aload           14
		//   75  189:astore          13
			byteorder = ((ByteOrder) (new double[numberOfComponents]));
		//   76  191:aload_0         
		//   77  192:getfield        #21  <Field int numberOfComponents>
		//   78  195:newarray        double[]
		//   79  197:astore_1        
			i = ((int) (byte0));
		//   80  198:iload_3         
		//   81  199:istore_2        
_L15:
			obj = ((Object) (byteordereddatainputstream));
		//   82  200:aload           14
		//   83  202:astore          13
			if(i >= numberOfComponents)
				break; /* Loop/switch isn't completed */
		//   84  204:iload_2         
		//   85  205:aload_0         
		//   86  206:getfield        #21  <Field int numberOfComponents>
		//   87  209:icmpge          232
			obj = ((Object) (byteordereddatainputstream));
		//   88  212:aload           14
		//   89  214:astore          13
			byteorder[i] = byteordereddatainputstream.readFloat();
		//   90  216:aload_1         
		//   91  217:iload_2         
		//   92  218:aload           14
		//   93  220:invokevirtual   #216 <Method float ExifInterface$ByteOrderedDataInputStream.readFloat()>
		//   94  223:f2d             
		//   95  224:dastore         
			i++;
		//   96  225:iload_2         
		//   97  226:iconst_1        
		//   98  227:iadd            
		//   99  228:istore_2        
			if(true) goto _L15; else goto _L14
		//  100  229:goto            200
_L14:
			try
			{
				byteordereddatainputstream.close();
		//  101  232:aload           14
		//  102  234:invokevirtual   #202 <Method void ExifInterface$ByteOrderedDataInputStream.close()>
			}
		//* 103  237:aload_1         
		//* 104  238:areturn         
			// Misplaced declaration of an exception variable
			catch(Object obj)
		//* 105  239:astore          13
			{
				Log.e("ExifInterface", "IOException occurred while closing InputStream", ((Throwable) (obj)));
		//  106  241:ldc1            #204 <String "ExifInterface">
		//  107  243:ldc1            #206 <String "IOException occurred while closing InputStream">
		//  108  245:aload           13
		//  109  247:invokestatic    #212 <Method int Log.e(String, String, Throwable)>
		//  110  250:pop             
				return ((Object) (byteorder));
		//  111  251:aload_1         
		//  112  252:areturn         
			}
			return ((Object) (byteorder));
_L9:
			obj = ((Object) (byteordereddatainputstream));
		//  113  253:aload           14
		//  114  255:astore          13
			byteorder = ((ByteOrder) (new Rational[numberOfComponents]));
		//  115  257:aload_0         
		//  116  258:getfield        #21  <Field int numberOfComponents>
		//  117  261:anewarray       Rational[]
		//  118  264:astore_1        
			i = ((int) (flag2));
		//  119  265:iload           6
		//  120  267:istore_2        
_L17:
			obj = ((Object) (byteordereddatainputstream));
		//  121  268:aload           14
		//  122  270:astore          13
			if(i >= numberOfComponents)
				break; /* Loop/switch isn't completed */
		//  123  272:iload_2         
		//  124  273:aload_0         
		//  125  274:getfield        #21  <Field int numberOfComponents>
		//  126  277:icmpge          313
			obj = ((Object) (byteordereddatainputstream));
		//  127  280:aload           14
		//  128  282:astore          13
			byteorder[i] = ((/*<invalid signature>*/java.lang.Object) (new Rational(byteordereddatainputstream.readInt(), byteordereddatainputstream.readInt())));
		//  129  284:aload_1         
		//  130  285:iload_2         
		//  131  286:new             #86  <Class ExifInterface$Rational>
		//  132  289:dup             
		//  133  290:aload           14
		//  134  292:invokevirtual   #219 <Method int ExifInterface$ByteOrderedDataInputStream.readInt()>
		//  135  295:i2l             
		//  136  296:aload           14
		//  137  298:invokevirtual   #219 <Method int ExifInterface$ByteOrderedDataInputStream.readInt()>
		//  138  301:i2l             
		//  139  302:invokespecial   #222 <Method void ExifInterface$Rational(long, long)>
		//  140  305:aastore         
			i++;
		//  141  306:iload_2         
		//  142  307:iconst_1        
		//  143  308:iadd            
		//  144  309:istore_2        
			if(true) goto _L17; else goto _L16
		//  145  310:goto            268
_L16:
			try
			{
				byteordereddatainputstream.close();
		//  146  313:aload           14
		//  147  315:invokevirtual   #202 <Method void ExifInterface$ByteOrderedDataInputStream.close()>
			}
		//* 148  318:aload_1         
		//* 149  319:areturn         
			// Misplaced declaration of an exception variable
			catch(Object obj)
		//* 150  320:astore          13
			{
				Log.e("ExifInterface", "IOException occurred while closing InputStream", ((Throwable) (obj)));
		//  151  322:ldc1            #204 <String "ExifInterface">
		//  152  324:ldc1            #206 <String "IOException occurred while closing InputStream">
		//  153  326:aload           13
		//  154  328:invokestatic    #212 <Method int Log.e(String, String, Throwable)>
		//  155  331:pop             
				return ((Object) (byteorder));
		//  156  332:aload_1         
		//  157  333:areturn         
			}
			return ((Object) (byteorder));
_L8:
			obj = ((Object) (byteordereddatainputstream));
		//  158  334:aload           14
		//  159  336:astore          13
			byteorder = ((ByteOrder) (new int[numberOfComponents]));
		//  160  338:aload_0         
		//  161  339:getfield        #21  <Field int numberOfComponents>
		//  162  342:newarray        int[]
		//  163  344:astore_1        
			i = ((int) (flag3));
		//  164  345:iload           7
		//  165  347:istore_2        
_L19:
			obj = ((Object) (byteordereddatainputstream));
		//  166  348:aload           14
		//  167  350:astore          13
			if(i >= numberOfComponents)
				break; /* Loop/switch isn't completed */
		//  168  352:iload_2         
		//  169  353:aload_0         
		//  170  354:getfield        #21  <Field int numberOfComponents>
		//  171  357:icmpge          379
			obj = ((Object) (byteordereddatainputstream));
		//  172  360:aload           14
		//  173  362:astore          13
			byteorder[i] = byteordereddatainputstream.readInt();
		//  174  364:aload_1         
		//  175  365:iload_2         
		//  176  366:aload           14
		//  177  368:invokevirtual   #219 <Method int ExifInterface$ByteOrderedDataInputStream.readInt()>
		//  178  371:iastore         
			i++;
		//  179  372:iload_2         
		//  180  373:iconst_1        
		//  181  374:iadd            
		//  182  375:istore_2        
			if(true) goto _L19; else goto _L18
		//  183  376:goto            348
_L18:
			try
			{
				byteordereddatainputstream.close();
		//  184  379:aload           14
		//  185  381:invokevirtual   #202 <Method void ExifInterface$ByteOrderedDataInputStream.close()>
			}
		//* 186  384:aload_1         
		//* 187  385:areturn         
			// Misplaced declaration of an exception variable
			catch(Object obj)
		//* 188  386:astore          13
			{
				Log.e("ExifInterface", "IOException occurred while closing InputStream", ((Throwable) (obj)));
		//  189  388:ldc1            #204 <String "ExifInterface">
		//  190  390:ldc1            #206 <String "IOException occurred while closing InputStream">
		//  191  392:aload           13
		//  192  394:invokestatic    #212 <Method int Log.e(String, String, Throwable)>
		//  193  397:pop             
				return ((Object) (byteorder));
		//  194  398:aload_1         
		//  195  399:areturn         
			}
			return ((Object) (byteorder));
_L7:
			obj = ((Object) (byteordereddatainputstream));
		//  196  400:aload           14
		//  197  402:astore          13
			byteorder = ((ByteOrder) (new int[numberOfComponents]));
		//  198  404:aload_0         
		//  199  405:getfield        #21  <Field int numberOfComponents>
		//  200  408:newarray        int[]
		//  201  410:astore_1        
			i = ((int) (flag4));
		//  202  411:iload           8
		//  203  413:istore_2        
_L21:
			obj = ((Object) (byteordereddatainputstream));
		//  204  414:aload           14
		//  205  416:astore          13
			if(i >= numberOfComponents)
				break; /* Loop/switch isn't completed */
		//  206  418:iload_2         
		//  207  419:aload_0         
		//  208  420:getfield        #21  <Field int numberOfComponents>
		//  209  423:icmpge          445
			obj = ((Object) (byteordereddatainputstream));
		//  210  426:aload           14
		//  211  428:astore          13
			byteorder[i] = ((int) (byteordereddatainputstream.readShort()));
		//  212  430:aload_1         
		//  213  431:iload_2         
		//  214  432:aload           14
		//  215  434:invokevirtual   #226 <Method short ExifInterface$ByteOrderedDataInputStream.readShort()>
		//  216  437:iastore         
			i++;
		//  217  438:iload_2         
		//  218  439:iconst_1        
		//  219  440:iadd            
		//  220  441:istore_2        
			if(true) goto _L21; else goto _L20
		//  221  442:goto            414
_L20:
			try
			{
				byteordereddatainputstream.close();
		//  222  445:aload           14
		//  223  447:invokevirtual   #202 <Method void ExifInterface$ByteOrderedDataInputStream.close()>
			}
		//* 224  450:aload_1         
		//* 225  451:areturn         
			// Misplaced declaration of an exception variable
			catch(Object obj)
		//* 226  452:astore          13
			{
				Log.e("ExifInterface", "IOException occurred while closing InputStream", ((Throwable) (obj)));
		//  227  454:ldc1            #204 <String "ExifInterface">
		//  228  456:ldc1            #206 <String "IOException occurred while closing InputStream">
		//  229  458:aload           13
		//  230  460:invokestatic    #212 <Method int Log.e(String, String, Throwable)>
		//  231  463:pop             
				return ((Object) (byteorder));
		//  232  464:aload_1         
		//  233  465:areturn         
			}
			return ((Object) (byteorder));
_L6:
			obj = ((Object) (byteordereddatainputstream));
		//  234  466:aload           14
		//  235  468:astore          13
			byteorder = ((ByteOrder) (new Rational[numberOfComponents]));
		//  236  470:aload_0         
		//  237  471:getfield        #21  <Field int numberOfComponents>
		//  238  474:anewarray       Rational[]
		//  239  477:astore_1        
			i = ((int) (flag5));
		//  240  478:iload           9
		//  241  480:istore_2        
_L23:
			obj = ((Object) (byteordereddatainputstream));
		//  242  481:aload           14
		//  243  483:astore          13
			if(i >= numberOfComponents)
				break; /* Loop/switch isn't completed */
		//  244  485:iload_2         
		//  245  486:aload_0         
		//  246  487:getfield        #21  <Field int numberOfComponents>
		//  247  490:icmpge          524
			obj = ((Object) (byteordereddatainputstream));
		//  248  493:aload           14
		//  249  495:astore          13
			byteorder[i] = ((/*<invalid signature>*/java.lang.Object) (new Rational(byteordereddatainputstream.readUnsignedInt(), byteordereddatainputstream.readUnsignedInt())));
		//  250  497:aload_1         
		//  251  498:iload_2         
		//  252  499:new             #86  <Class ExifInterface$Rational>
		//  253  502:dup             
		//  254  503:aload           14
		//  255  505:invokevirtual   #230 <Method long ExifInterface$ByteOrderedDataInputStream.readUnsignedInt()>
		//  256  508:aload           14
		//  257  510:invokevirtual   #230 <Method long ExifInterface$ByteOrderedDataInputStream.readUnsignedInt()>
		//  258  513:invokespecial   #222 <Method void ExifInterface$Rational(long, long)>
		//  259  516:aastore         
			i++;
		//  260  517:iload_2         
		//  261  518:iconst_1        
		//  262  519:iadd            
		//  263  520:istore_2        
			if(true) goto _L23; else goto _L22
		//  264  521:goto            481
_L22:
			try
			{
				byteordereddatainputstream.close();
		//  265  524:aload           14
		//  266  526:invokevirtual   #202 <Method void ExifInterface$ByteOrderedDataInputStream.close()>
			}
		//* 267  529:aload_1         
		//* 268  530:areturn         
			// Misplaced declaration of an exception variable
			catch(Object obj)
		//* 269  531:astore          13
			{
				Log.e("ExifInterface", "IOException occurred while closing InputStream", ((Throwable) (obj)));
		//  270  533:ldc1            #204 <String "ExifInterface">
		//  271  535:ldc1            #206 <String "IOException occurred while closing InputStream">
		//  272  537:aload           13
		//  273  539:invokestatic    #212 <Method int Log.e(String, String, Throwable)>
		//  274  542:pop             
				return ((Object) (byteorder));
		//  275  543:aload_1         
		//  276  544:areturn         
			}
			return ((Object) (byteorder));
_L5:
			obj = ((Object) (byteordereddatainputstream));
		//  277  545:aload           14
		//  278  547:astore          13
			byteorder = ((ByteOrder) (new long[numberOfComponents]));
		//  279  549:aload_0         
		//  280  550:getfield        #21  <Field int numberOfComponents>
		//  281  553:newarray        long[]
		//  282  555:astore_1        
			i = ((int) (flag6));
		//  283  556:iload           10
		//  284  558:istore_2        
_L25:
			obj = ((Object) (byteordereddatainputstream));
		//  285  559:aload           14
		//  286  561:astore          13
			if(i >= numberOfComponents)
				break; /* Loop/switch isn't completed */
		//  287  563:iload_2         
		//  288  564:aload_0         
		//  289  565:getfield        #21  <Field int numberOfComponents>
		//  290  568:icmpge          590
			obj = ((Object) (byteordereddatainputstream));
		//  291  571:aload           14
		//  292  573:astore          13
			byteorder[i] = byteordereddatainputstream.readUnsignedInt();
		//  293  575:aload_1         
		//  294  576:iload_2         
		//  295  577:aload           14
		//  296  579:invokevirtual   #230 <Method long ExifInterface$ByteOrderedDataInputStream.readUnsignedInt()>
		//  297  582:lastore         
			i++;
		//  298  583:iload_2         
		//  299  584:iconst_1        
		//  300  585:iadd            
		//  301  586:istore_2        
			if(true) goto _L25; else goto _L24
		//  302  587:goto            559
_L24:
			try
			{
				byteordereddatainputstream.close();
		//  303  590:aload           14
		//  304  592:invokevirtual   #202 <Method void ExifInterface$ByteOrderedDataInputStream.close()>
			}
		//* 305  595:aload_1         
		//* 306  596:areturn         
			// Misplaced declaration of an exception variable
			catch(Object obj)
		//* 307  597:astore          13
			{
				Log.e("ExifInterface", "IOException occurred while closing InputStream", ((Throwable) (obj)));
		//  308  599:ldc1            #204 <String "ExifInterface">
		//  309  601:ldc1            #206 <String "IOException occurred while closing InputStream">
		//  310  603:aload           13
		//  311  605:invokestatic    #212 <Method int Log.e(String, String, Throwable)>
		//  312  608:pop             
				return ((Object) (byteorder));
		//  313  609:aload_1         
		//  314  610:areturn         
			}
			return ((Object) (byteorder));
_L4:
			obj = ((Object) (byteordereddatainputstream));
		//  315  611:aload           14
		//  316  613:astore          13
			byteorder = ((ByteOrder) (new int[numberOfComponents]));
		//  317  615:aload_0         
		//  318  616:getfield        #21  <Field int numberOfComponents>
		//  319  619:newarray        int[]
		//  320  621:astore_1        
			i = ((int) (flag7));
		//  321  622:iload           11
		//  322  624:istore_2        
_L27:
			obj = ((Object) (byteordereddatainputstream));
		//  323  625:aload           14
		//  324  627:astore          13
			if(i >= numberOfComponents)
				break; /* Loop/switch isn't completed */
		//  325  629:iload_2         
		//  326  630:aload_0         
		//  327  631:getfield        #21  <Field int numberOfComponents>
		//  328  634:icmpge          656
			obj = ((Object) (byteordereddatainputstream));
		//  329  637:aload           14
		//  330  639:astore          13
			byteorder[i] = byteordereddatainputstream.readUnsignedShort();
		//  331  641:aload_1         
		//  332  642:iload_2         
		//  333  643:aload           14
		//  334  645:invokevirtual   #233 <Method int ExifInterface$ByteOrderedDataInputStream.readUnsignedShort()>
		//  335  648:iastore         
			i++;
		//  336  649:iload_2         
		//  337  650:iconst_1        
		//  338  651:iadd            
		//  339  652:istore_2        
			if(true) goto _L27; else goto _L26
		//  340  653:goto            625
_L26:
			try
			{
				byteordereddatainputstream.close();
		//  341  656:aload           14
		//  342  658:invokevirtual   #202 <Method void ExifInterface$ByteOrderedDataInputStream.close()>
			}
		//* 343  661:aload_1         
		//* 344  662:areturn         
			// Misplaced declaration of an exception variable
			catch(Object obj)
		//* 345  663:astore          13
			{
				Log.e("ExifInterface", "IOException occurred while closing InputStream", ((Throwable) (obj)));
		//  346  665:ldc1            #204 <String "ExifInterface">
		//  347  667:ldc1            #206 <String "IOException occurred while closing InputStream">
		//  348  669:aload           13
		//  349  671:invokestatic    #212 <Method int Log.e(String, String, Throwable)>
		//  350  674:pop             
				return ((Object) (byteorder));
		//  351  675:aload_1         
		//  352  676:areturn         
			}
			return ((Object) (byteorder));
_L3:
			i = ((int) (flag));
		//  353  677:iload           4
		//  354  679:istore_2        
			obj = ((Object) (byteordereddatainputstream));
		//  355  680:aload           14
		//  356  682:astore          13
			if(numberOfComponents < ExifInterface.EXIF_ASCII_PREFIX.length) goto _L29; else goto _L28
		//  357  684:aload_0         
		//  358  685:getfield        #21  <Field int numberOfComponents>
		//  359  688:getstatic       #236 <Field byte[] ExifInterface.EXIF_ASCII_PREFIX>
		//  360  691:arraylength     
		//  361  692:icmplt          751
_L28:
			i = 0;
		//  362  695:iconst_0        
		//  363  696:istore_2        
_L45:
			byte0 = ((byte) (flag1));
		//  364  697:iload           5
		//  365  699:istore_3        
			obj = ((Object) (byteordereddatainputstream));
		//  366  700:aload           14
		//  367  702:astore          13
			if(i >= ExifInterface.EXIF_ASCII_PREFIX.length) goto _L31; else goto _L30
		//  368  704:iload_2         
		//  369  705:getstatic       #236 <Field byte[] ExifInterface.EXIF_ASCII_PREFIX>
		//  370  708:arraylength     
		//  371  709:icmpge          735
_L30:
			obj = ((Object) (byteordereddatainputstream));
		//  372  712:aload           14
		//  373  714:astore          13
			if(bytes[i] == ExifInterface.EXIF_ASCII_PREFIX[i]) goto _L33; else goto _L32
		//  374  716:aload_0         
		//  375  717:getfield        #23  <Field byte[] bytes>
		//  376  720:iload_2         
		//  377  721:baload          
		//  378  722:getstatic       #236 <Field byte[] ExifInterface.EXIF_ASCII_PREFIX>
		//  379  725:iload_2         
		//  380  726:baload          
		//  381  727:icmpeq          1094
_L32:
			byte0 = 0;
		//  382  730:iconst_0        
		//  383  731:istore_3        
		//* 384  732:goto            735
_L31:
			i = ((int) (flag));
		//  385  735:iload           4
		//  386  737:istore_2        
			if(!byte0) goto _L29; else goto _L34
		//  387  738:iload_3         
		//  388  739:ifeq            751
_L34:
			obj = ((Object) (byteordereddatainputstream));
		//  389  742:aload           14
		//  390  744:astore          13
			i = ExifInterface.EXIF_ASCII_PREFIX.length;
		//  391  746:getstatic       #236 <Field byte[] ExifInterface.EXIF_ASCII_PREFIX>
		//  392  749:arraylength     
		//  393  750:istore_2        
_L29:
			obj = ((Object) (byteordereddatainputstream));
		//  394  751:aload           14
		//  395  753:astore          13
			byteorder = ((ByteOrder) (new StringBuilder()));
		//  396  755:new             #99  <Class StringBuilder>
		//  397  758:dup             
		//  398  759:invokespecial   #100 <Method void StringBuilder()>
		//  399  762:astore_1        
_L46:
			obj = ((Object) (byteordereddatainputstream));
		//  400  763:aload           14
		//  401  765:astore          13
			if(i >= numberOfComponents) goto _L36; else goto _L35
		//  402  767:iload_2         
		//  403  768:aload_0         
		//  404  769:getfield        #21  <Field int numberOfComponents>
		//  405  772:icmpge          827
_L35:
			obj = ((Object) (byteordereddatainputstream));
		//  406  775:aload           14
		//  407  777:astore          13
			byte0 = bytes[i];
		//  408  779:aload_0         
		//  409  780:getfield        #23  <Field byte[] bytes>
		//  410  783:iload_2         
		//  411  784:baload          
		//  412  785:istore_3        
			if(byte0 != 0) goto _L37; else goto _L36
		//  413  786:iload_3         
		//  414  787:ifne            793
		//* 415  790:goto            827
_L37:
			if(byte0 < 32) goto _L39; else goto _L38
		//  416  793:iload_3         
		//  417  794:bipush          32
		//  418  796:icmplt          813
_L38:
			obj = ((Object) (byteordereddatainputstream));
		//  419  799:aload           14
		//  420  801:astore          13
			((StringBuilder) (byteorder)).append((char)byte0);
		//  421  803:aload_1         
		//  422  804:iload_3         
		//  423  805:int2char        
		//  424  806:invokevirtual   #107 <Method StringBuilder StringBuilder.append(char)>
		//  425  809:pop             
			  goto _L40
		//* 426  810:goto            1101
_L39:
			obj = ((Object) (byteordereddatainputstream));
		//  427  813:aload           14
		//  428  815:astore          13
			((StringBuilder) (byteorder)).append('?');
		//  429  817:aload_1         
		//  430  818:bipush          63
		//  431  820:invokevirtual   #107 <Method StringBuilder StringBuilder.append(char)>
		//  432  823:pop             
			  goto _L40
		//* 433  824:goto            1101
_L36:
			obj = ((Object) (byteordereddatainputstream));
		//  434  827:aload           14
		//  435  829:astore          13
			byteorder = ((ByteOrder) (((StringBuilder) (byteorder)).toString()));
		//  436  831:aload_1         
		//  437  832:invokevirtual   #111 <Method String StringBuilder.toString()>
		//  438  835:astore_1        
			try
			{
				byteordereddatainputstream.close();
		//  439  836:aload           14
		//  440  838:invokevirtual   #202 <Method void ExifInterface$ByteOrderedDataInputStream.close()>
			}
		//* 441  841:aload_1         
		//* 442  842:areturn         
			// Misplaced declaration of an exception variable
			catch(Object obj)
		//* 443  843:astore          13
			{
				Log.e("ExifInterface", "IOException occurred while closing InputStream", ((Throwable) (obj)));
		//  444  845:ldc1            #204 <String "ExifInterface">
		//  445  847:ldc1            #206 <String "IOException occurred while closing InputStream">
		//  446  849:aload           13
		//  447  851:invokestatic    #212 <Method int Log.e(String, String, Throwable)>
		//  448  854:pop             
				return ((Object) (byteorder));
		//  449  855:aload_1         
		//  450  856:areturn         
			}
			return ((Object) (byteorder));
_L2:
			obj = ((Object) (byteordereddatainputstream));
		//  451  857:aload           14
		//  452  859:astore          13
			if(bytes.length != 1)
				break MISSING_BLOCK_LABEL_946;
		//  453  861:aload_0         
		//  454  862:getfield        #23  <Field byte[] bytes>
		//  455  865:arraylength     
		//  456  866:iconst_1        
		//  457  867:icmpne          946
			obj = ((Object) (byteordereddatainputstream));
		//  458  870:aload           14
		//  459  872:astore          13
			if(bytes[0] < 0)
				break MISSING_BLOCK_LABEL_946;
		//  460  874:aload_0         
		//  461  875:getfield        #23  <Field byte[] bytes>
		//  462  878:iconst_0        
		//  463  879:baload          
		//  464  880:iflt            946
			obj = ((Object) (byteordereddatainputstream));
		//  465  883:aload           14
		//  466  885:astore          13
			if(bytes[0] > 1)
				break MISSING_BLOCK_LABEL_946;
		//  467  887:aload_0         
		//  468  888:getfield        #23  <Field byte[] bytes>
		//  469  891:iconst_0        
		//  470  892:baload          
		//  471  893:iconst_1        
		//  472  894:icmpgt          946
			obj = ((Object) (byteordereddatainputstream));
		//  473  897:aload           14
		//  474  899:astore          13
			byteorder = ((ByteOrder) (new String(new char[] {
				(char)(bytes[0] + 48)
			})));
		//  475  901:new             #28  <Class String>
		//  476  904:dup             
		//  477  905:iconst_1        
		//  478  906:newarray        char[]
		//  479  908:dup             
		//  480  909:iconst_0        
		//  481  910:aload_0         
		//  482  911:getfield        #23  <Field byte[] bytes>
		//  483  914:iconst_0        
		//  484  915:baload          
		//  485  916:bipush          48
		//  486  918:iadd            
		//  487  919:int2char        
		//  488  920:castore         
		//  489  921:invokespecial   #239 <Method void String(char[])>
		//  490  924:astore_1        
			try
			{
				byteordereddatainputstream.close();
		//  491  925:aload           14
		//  492  927:invokevirtual   #202 <Method void ExifInterface$ByteOrderedDataInputStream.close()>
			}
		//* 493  930:aload_1         
		//* 494  931:areturn         
			// Misplaced declaration of an exception variable
			catch(Object obj)
		//* 495  932:astore          13
			{
				Log.e("ExifInterface", "IOException occurred while closing InputStream", ((Throwable) (obj)));
		//  496  934:ldc1            #204 <String "ExifInterface">
		//  497  936:ldc1            #206 <String "IOException occurred while closing InputStream">
		//  498  938:aload           13
		//  499  940:invokestatic    #212 <Method int Log.e(String, String, Throwable)>
		//  500  943:pop             
				return ((Object) (byteorder));
		//  501  944:aload_1         
		//  502  945:areturn         
			}
			return ((Object) (byteorder));
			obj = ((Object) (byteordereddatainputstream));
		//  503  946:aload           14
		//  504  948:astore          13
			byteorder = ((ByteOrder) (new String(bytes, ExifInterface.ASCII)));
		//  505  950:new             #28  <Class String>
		//  506  953:dup             
		//  507  954:aload_0         
		//  508  955:getfield        #23  <Field byte[] bytes>
		//  509  958:getstatic       #42  <Field Charset ExifInterface.ASCII>
		//  510  961:invokespecial   #242 <Method void String(byte[], Charset)>
		//  511  964:astore_1        
			try
			{
				byteordereddatainputstream.close();
		//  512  965:aload           14
		//  513  967:invokevirtual   #202 <Method void ExifInterface$ByteOrderedDataInputStream.close()>
			}
		//* 514  970:aload_1         
		//* 515  971:areturn         
			// Misplaced declaration of an exception variable
			catch(Object obj)
		//* 516  972:astore          13
			{
				Log.e("ExifInterface", "IOException occurred while closing InputStream", ((Throwable) (obj)));
		//  517  974:ldc1            #204 <String "ExifInterface">
		//  518  976:ldc1            #206 <String "IOException occurred while closing InputStream">
		//  519  978:aload           13
		//  520  980:invokestatic    #212 <Method int Log.e(String, String, Throwable)>
		//  521  983:pop             
				return ((Object) (byteorder));
		//  522  984:aload_1         
		//  523  985:areturn         
			}
			return ((Object) (byteorder));
_L1:
			try
			{
				byteordereddatainputstream.close();
		//  524  986:aload           14
		//  525  988:invokevirtual   #202 <Method void ExifInterface$ByteOrderedDataInputStream.close()>
			}
		//* 526  991:aconst_null     
		//* 527  992:areturn         
			// Misplaced declaration of an exception variable
			catch(ByteOrder byteorder)
		//* 528  993:astore_1        
			{
				Log.e("ExifInterface", "IOException occurred while closing InputStream", ((Throwable) (byteorder)));
		//  529  994:ldc1            #204 <String "ExifInterface">
		//  530  996:ldc1            #206 <String "IOException occurred while closing InputStream">
		//  531  998:aload_1         
		//  532  999:invokestatic    #212 <Method int Log.e(String, String, Throwable)>
		//  533 1002:pop             
				return ((Object) (null));
		//  534 1003:aconst_null     
		//  535 1004:areturn         
			}
			return ((Object) (null));
			obj;
		//  536 1005:astore          13
			Object obj1;
			byteorder = ((ByteOrder) (byteordereddatainputstream));
		//  537 1007:aload           14
		//  538 1009:astore_1        
			obj1 = obj;
		//  539 1010:aload           13
		//  540 1012:astore          14
			  goto _L41
		//* 541 1014:goto            1028
			byteorder;
		//  542 1017:astore_1        
			obj = null;
		//  543 1018:aconst_null     
		//  544 1019:astore          13
			  goto _L42
		//* 545 1021:goto            1064
			obj1;
		//  546 1024:astore          14
			byteorder = null;
		//  547 1026:aconst_null     
		//  548 1027:astore_1        
_L41:
			obj = ((Object) (byteorder));
		//  549 1028:aload_1         
		//  550 1029:astore          13
			Log.w("ExifInterface", "IOException occurred during reading a value", ((Throwable) (obj1)));
		//  551 1031:ldc1            #204 <String "ExifInterface">
		//  552 1033:ldc1            #244 <String "IOException occurred during reading a value">
		//  553 1035:aload           14
		//  554 1037:invokestatic    #247 <Method int Log.w(String, String, Throwable)>
		//  555 1040:pop             
			if(byteorder == null) goto _L44; else goto _L43
		//  556 1041:aload_1         
		//  557 1042:ifnull          1061
_L43:
			((ByteOrderedDataInputStream) (byteorder)).close();
		//  558 1045:aload_1         
		//  559 1046:invokevirtual   #202 <Method void ExifInterface$ByteOrderedDataInputStream.close()>
			return ((Object) (null));
		//  560 1049:aconst_null     
		//  561 1050:areturn         
			byteorder;
		//  562 1051:astore_1        
			Log.e("ExifInterface", "IOException occurred while closing InputStream", ((Throwable) (byteorder)));
		//  563 1052:ldc1            #204 <String "ExifInterface">
		//  564 1054:ldc1            #206 <String "IOException occurred while closing InputStream">
		//  565 1056:aload_1         
		//  566 1057:invokestatic    #212 <Method int Log.e(String, String, Throwable)>
		//  567 1060:pop             
_L44:
			return ((Object) (null));
		//  568 1061:aconst_null     
		//  569 1062:areturn         
			byteorder;
		//  570 1063:astore_1        
_L42:
			if(obj != null)
		//* 571 1064:aload           13
		//* 572 1066:ifnull          1089
				try
				{
					((ByteOrderedDataInputStream) (obj)).close();
		//  573 1069:aload           13
		//  574 1071:invokevirtual   #202 <Method void ExifInterface$ByteOrderedDataInputStream.close()>
				}
		//* 575 1074:goto            1089
				catch(IOException ioexception)
		//* 576 1077:astore          13
				{
					Log.e("ExifInterface", "IOException occurred while closing InputStream", ((Throwable) (ioexception)));
		//  577 1079:ldc1            #204 <String "ExifInterface">
		//  578 1081:ldc1            #206 <String "IOException occurred while closing InputStream">
		//  579 1083:aload           13
		//  580 1085:invokestatic    #212 <Method int Log.e(String, String, Throwable)>
		//  581 1088:pop             
				}
			throw byteorder;
		//  582 1089:aload_1         
		//  583 1090:athrow          
		//* 584 1091:goto            986
_L33:
			i++;
		//  585 1094:iload_2         
		//  586 1095:iconst_1        
		//  587 1096:iadd            
		//  588 1097:istore_2        
			  goto _L45
		//* 589 1098:goto            697
_L40:
			i++;
		//  590 1101:iload_2         
		//  591 1102:iconst_1        
		//  592 1103:iadd            
		//  593 1104:istore_2        
			  goto _L46
		//* 594 1105:goto            763
		}

		public int size()
		{
			return ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[format] * numberOfComponents;
		//    0    0:getstatic       #55  <Field int[] ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT>
		//    1    3:aload_0         
		//    2    4:getfield        #19  <Field int format>
		//    3    7:iaload          
		//    4    8:aload_0         
		//    5    9:getfield        #21  <Field int numberOfComponents>
		//    6   12:imul            
		//    7   13:ireturn         
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #99  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #100 <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("(");
		//    4    8:aload_1         
		//    5    9:ldc1            #250 <String "(">
		//    6   11:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(ExifInterface.IFD_FORMAT_NAMES[format]);
		//    8   15:aload_1         
		//    9   16:getstatic       #254 <Field String[] ExifInterface.IFD_FORMAT_NAMES>
		//   10   19:aload_0         
		//   11   20:getfield        #19  <Field int format>
		//   12   23:aaload          
		//   13   24:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
		//   14   27:pop             
			stringbuilder.append(", data length:");
		//   15   28:aload_1         
		//   16   29:ldc2            #256 <String ", data length:">
		//   17   32:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
		//   18   35:pop             
			stringbuilder.append(bytes.length);
		//   19   36:aload_1         
		//   20   37:aload_0         
		//   21   38:getfield        #23  <Field byte[] bytes>
		//   22   41:arraylength     
		//   23   42:invokevirtual   #182 <Method StringBuilder StringBuilder.append(int)>
		//   24   45:pop             
			stringbuilder.append(")");
		//   25   46:aload_1         
		//   26   47:ldc2            #258 <String ")">
		//   27   50:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
		//   28   53:pop             
			return stringbuilder.toString();
		//   29   54:aload_1         
		//   30   55:invokevirtual   #111 <Method String StringBuilder.toString()>
		//   31   58:areturn         
		}

		public final byte bytes[];
		public final int format;
		public final int numberOfComponents;

		ExifAttribute(int i, int j, byte abyte0[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			format = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #19  <Field int format>
			numberOfComponents = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #21  <Field int numberOfComponents>
			bytes = abyte0;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #23  <Field byte[] bytes>
		//   11   19:return          
		}
	}

	static class ExifTag
	{

		boolean isFormatCompatible(int i)
		{
			int j = primaryFormat;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field int primaryFormat>
		//    2    4:istore_2        
			if(j != 7)
		//*   3    5:iload_2         
		//*   4    6:bipush          7
		//*   5    8:icmpeq          109
			{
				if(i == 7)
		//*   6   11:iload_1         
		//*   7   12:bipush          7
		//*   8   14:icmpne          19
					return true;
		//    9   17:iconst_1        
		//   10   18:ireturn         
				if(j != i)
		//*  11   19:iload_2         
		//*  12   20:iload_1         
		//*  13   21:icmpeq          107
				{
					int k = secondaryFormat;
		//   14   24:aload_0         
		//   15   25:getfield        #26  <Field int secondaryFormat>
		//   16   28:istore_3        
					if(k == i)
		//*  17   29:iload_3         
		//*  18   30:iload_1         
		//*  19   31:icmpne          36
						return true;
		//   20   34:iconst_1        
		//   21   35:ireturn         
					if((j == 4 || k == 4) && i == 3)
		//*  22   36:iload_2         
		//*  23   37:iconst_4        
		//*  24   38:icmpeq          46
		//*  25   41:iload_3         
		//*  26   42:iconst_4        
		//*  27   43:icmpne          53
		//*  28   46:iload_1         
		//*  29   47:iconst_3        
		//*  30   48:icmpne          53
						return true;
		//   31   51:iconst_1        
		//   32   52:ireturn         
					if((primaryFormat == 9 || secondaryFormat == 9) && i == 8)
		//*  33   53:aload_0         
		//*  34   54:getfield        #24  <Field int primaryFormat>
		//*  35   57:bipush          9
		//*  36   59:icmpeq          71
		//*  37   62:aload_0         
		//*  38   63:getfield        #26  <Field int secondaryFormat>
		//*  39   66:bipush          9
		//*  40   68:icmpne          79
		//*  41   71:iload_1         
		//*  42   72:bipush          8
		//*  43   74:icmpne          79
						return true;
		//   44   77:iconst_1        
		//   45   78:ireturn         
					return (primaryFormat == 12 || secondaryFormat == 12) && i == 11;
		//   46   79:aload_0         
		//   47   80:getfield        #24  <Field int primaryFormat>
		//   48   83:bipush          12
		//   49   85:icmpeq          97
		//   50   88:aload_0         
		//   51   89:getfield        #26  <Field int secondaryFormat>
		//   52   92:bipush          12
		//   53   94:icmpne          105
		//   54   97:iload_1         
		//   55   98:bipush          11
		//   56  100:icmpne          105
		//   57  103:iconst_1        
		//   58  104:ireturn         
		//   59  105:iconst_0        
		//   60  106:ireturn         
				} else
				{
					return true;
		//   61  107:iconst_1        
		//   62  108:ireturn         
				}
			} else
			{
				return true;
		//   63  109:iconst_1        
		//   64  110:ireturn         
			}
		}

		public final String name;
		public final int number;
		public final int primaryFormat;
		public final int secondaryFormat;

		ExifTag(String s, int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			name = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field String name>
			number = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #22  <Field int number>
			primaryFormat = j;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #24  <Field int primaryFormat>
			secondaryFormat = -1;
		//   11   19:aload_0         
		//   12   20:iconst_m1       
		//   13   21:putfield        #26  <Field int secondaryFormat>
		//   14   24:return          
		}

		ExifTag(String s, int i, int j, int k)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			name = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field String name>
			number = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #22  <Field int number>
			primaryFormat = j;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #24  <Field int primaryFormat>
			secondaryFormat = k;
		//   11   19:aload_0         
		//   12   20:iload           4
		//   13   22:putfield        #26  <Field int secondaryFormat>
		//   14   25:return          
		}
	}

	public static interface IfdType
		extends Annotation
	{
	}

	private static class Rational
	{

		public double calculate()
		{
			return (double)numerator / (double)denominator;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field long numerator>
		//    2    4:l2d             
		//    3    5:aload_0         
		//    4    6:getfield        #27  <Field long denominator>
		//    5    9:l2d             
		//    6   10:ddiv            
		//    7   11:dreturn         
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #33  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #34  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append(numerator);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #25  <Field long numerator>
		//    7   13:invokevirtual   #38  <Method StringBuilder StringBuilder.append(long)>
		//    8   16:pop             
			stringbuilder.append("/");
		//    9   17:aload_1         
		//   10   18:ldc1            #40  <String "/">
		//   11   20:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
		//   12   23:pop             
			stringbuilder.append(denominator);
		//   13   24:aload_1         
		//   14   25:aload_0         
		//   15   26:getfield        #27  <Field long denominator>
		//   16   29:invokevirtual   #38  <Method StringBuilder StringBuilder.append(long)>
		//   17   32:pop             
			return stringbuilder.toString();
		//   18   33:aload_1         
		//   19   34:invokevirtual   #45  <Method String StringBuilder.toString()>
		//   20   37:areturn         
		}

		public final long denominator;
		public final long numerator;

		Rational(double d)
		{
			this((long)(d * 10000D), 10000L);
		//    0    0:aload_0         
		//    1    1:dload_1         
		//    2    2:ldc2w           #13  <Double 10000D>
		//    3    5:dmul            
		//    4    6:d2l             
		//    5    7:ldc2w           #15  <Long 10000L>
		//    6   10:invokespecial   #19  <Method void ExifInterface$Rational(long, long)>
		//    7   13:return          
		}

		Rational(long l, long l1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			if(l1 == 0L)
		//*   2    4:lload_3         
		//*   3    5:lconst_0        
		//*   4    6:lcmp            
		//*   5    7:ifne            21
			{
				numerator = 0L;
		//    6   10:aload_0         
		//    7   11:lconst_0        
		//    8   12:putfield        #25  <Field long numerator>
				denominator = 1L;
		//    9   15:aload_0         
		//   10   16:lconst_1        
		//   11   17:putfield        #27  <Field long denominator>
				return;
		//   12   20:return          
			} else
			{
				numerator = l;
		//   13   21:aload_0         
		//   14   22:lload_1         
		//   15   23:putfield        #25  <Field long numerator>
				denominator = l1;
		//   16   26:aload_0         
		//   17   27:lload_3         
		//   18   28:putfield        #27  <Field long denominator>
				return;
		//   19   31:return          
			}
		}
	}


	public ExifInterface(InputStream inputstream)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #1144 <Method void Object()>
		ExifTag aexiftag[][] = EXIF_TAGS;
	//    2    4:getstatic       #1052 <Field ExifInterface$ExifTag[][] EXIF_TAGS>
	//    3    7:astore_2        
		mAttributes = new HashMap[aexiftag.length];
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:arraylength     
	//    7   11:anewarray       HashMap[]
	//    8   14:putfield        #1146 <Field HashMap[] mAttributes>
		mAttributesOffsets = ((Set) (new HashSet(aexiftag.length)));
	//    9   17:aload_0         
	//   10   18:new             #1066 <Class HashSet>
	//   11   21:dup             
	//   12   22:aload_2         
	//   13   23:arraylength     
	//   14   24:invokespecial   #1149 <Method void HashSet(int)>
	//   15   27:putfield        #1151 <Field Set mAttributesOffsets>
		mExifByteOrder = ByteOrder.BIG_ENDIAN;
	//   16   30:aload_0         
	//   17   31:getstatic       #1156 <Field ByteOrder ByteOrder.BIG_ENDIAN>
	//   18   34:putfield        #1158 <Field ByteOrder mExifByteOrder>
		if(inputstream != null)
	//*  19   37:aload_1         
	//*  20   38:ifnull          75
		{
			mFilename = null;
	//   21   41:aload_0         
	//   22   42:aconst_null     
	//   23   43:putfield        #1160 <Field String mFilename>
			if(inputstream instanceof android.content.res.AssetManager.AssetInputStream)
	//*  24   46:aload_1         
	//*  25   47:instanceof      #1162 <Class android.content.res.AssetManager$AssetInputStream>
	//*  26   50:ifeq            64
				mAssetInputStream = (android.content.res.AssetManager.AssetInputStream)inputstream;
	//   27   53:aload_0         
	//   28   54:aload_1         
	//   29   55:checkcast       #1162 <Class android.content.res.AssetManager$AssetInputStream>
	//   30   58:putfield        #1164 <Field android.content.res.AssetManager$AssetInputStream mAssetInputStream>
			else
	//*  31   61:goto            69
				mAssetInputStream = null;
	//   32   64:aload_0         
	//   33   65:aconst_null     
	//   34   66:putfield        #1164 <Field android.content.res.AssetManager$AssetInputStream mAssetInputStream>
			loadAttributes(inputstream);
	//   35   69:aload_0         
	//   36   70:aload_1         
	//   37   71:invokespecial   #1167 <Method void loadAttributes(InputStream)>
			return;
	//   38   74:return          
		} else
		{
			throw new IllegalArgumentException("inputStream cannot be null");
	//   39   75:new             #1169 <Class IllegalArgumentException>
	//   40   78:dup             
	//   41   79:ldc2            #1171 <String "inputStream cannot be null">
	//   42   82:invokespecial   #1172 <Method void IllegalArgumentException(String)>
	//   43   85:athrow          
		}
	}

	public ExifInterface(String s)
		throws IOException
	{
		Object obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #1144 <Method void Object()>
		ExifTag aexiftag[][] = EXIF_TAGS;
	//    2    4:getstatic       #1052 <Field ExifInterface$ExifTag[][] EXIF_TAGS>
	//    3    7:astore_2        
		mAttributes = new HashMap[aexiftag.length];
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:arraylength     
	//    7   11:anewarray       HashMap[]
	//    8   14:putfield        #1146 <Field HashMap[] mAttributes>
		mAttributesOffsets = ((Set) (new HashSet(aexiftag.length)));
	//    9   17:aload_0         
	//   10   18:new             #1066 <Class HashSet>
	//   11   21:dup             
	//   12   22:aload_2         
	//   13   23:arraylength     
	//   14   24:invokespecial   #1149 <Method void HashSet(int)>
	//   15   27:putfield        #1151 <Field Set mAttributesOffsets>
		mExifByteOrder = ByteOrder.BIG_ENDIAN;
	//   16   30:aload_0         
	//   17   31:getstatic       #1156 <Field ByteOrder ByteOrder.BIG_ENDIAN>
	//   18   34:putfield        #1158 <Field ByteOrder mExifByteOrder>
		if(s == null)
			break MISSING_BLOCK_LABEL_85;
	//   19   37:aload_1         
	//   20   38:ifnull          85
		obj = null;
	//   21   41:aconst_null     
	//   22   42:astore_3        
		mAssetInputStream = null;
	//   23   43:aload_0         
	//   24   44:aconst_null     
	//   25   45:putfield        #1164 <Field android.content.res.AssetManager$AssetInputStream mAssetInputStream>
		mFilename = s;
	//   26   48:aload_0         
	//   27   49:aload_1         
	//   28   50:putfield        #1160 <Field String mFilename>
		s = ((String) (new FileInputStream(s)));
	//   29   53:new             #1176 <Class FileInputStream>
	//   30   56:dup             
	//   31   57:aload_1         
	//   32   58:invokespecial   #1177 <Method void FileInputStream(String)>
	//   33   61:astore_1        
		loadAttributes(((InputStream) (s)));
	//   34   62:aload_0         
	//   35   63:aload_1         
	//   36   64:invokespecial   #1167 <Method void loadAttributes(InputStream)>
		closeQuietly(((Closeable) (s)));
	//   37   67:aload_1         
	//   38   68:invokestatic    #1181 <Method void closeQuietly(Closeable)>
		return;
	//   39   71:return          
		Exception exception;
		exception;
	//   40   72:astore_2        
		break MISSING_BLOCK_LABEL_79;
	//   41   73:goto            79
		exception;
	//   42   76:astore_2        
		s = ((String) (obj));
	//   43   77:aload_3         
	//   44   78:astore_1        
		closeQuietly(((Closeable) (s)));
	//   45   79:aload_1         
	//   46   80:invokestatic    #1181 <Method void closeQuietly(Closeable)>
		throw exception;
	//   47   83:aload_2         
	//   48   84:athrow          
		throw new IllegalArgumentException("filename cannot be null");
	//   49   85:new             #1169 <Class IllegalArgumentException>
	//   50   88:dup             
	//   51   89:ldc2            #1183 <String "filename cannot be null">
	//   52   92:invokespecial   #1172 <Method void IllegalArgumentException(String)>
	//   53   95:athrow          
	}

	private void addDefaultValuesForCompatibility()
	{
		String s = getAttribute("DateTimeOriginal");
	//    0    0:aload_0         
	//    1    1:ldc2            #415 <String "DateTimeOriginal">
	//    2    4:invokevirtual   #1188 <Method String getAttribute(String)>
	//    3    7:astore_1        
		if(s != null && getAttribute("DateTime") == null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          39
	//*   6   12:aload_0         
	//*   7   13:ldc2            #409 <String "DateTime">
	//*   8   16:invokevirtual   #1188 <Method String getAttribute(String)>
	//*   9   19:ifnonnull       39
			mAttributes[0].put("DateTime", ((Object) (ExifAttribute.createString(s))));
	//   10   22:aload_0         
	//   11   23:getfield        #1146 <Field HashMap[] mAttributes>
	//   12   26:iconst_0        
	//   13   27:aaload          
	//   14   28:ldc2            #409 <String "DateTime">
	//   15   31:aload_1         
	//   16   32:invokestatic    #1192 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createString(String)>
	//   17   35:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//   18   38:pop             
		if(getAttribute("ImageWidth") == null)
	//*  19   39:aload_0         
	//*  20   40:ldc2            #598 <String "ImageWidth">
	//*  21   43:invokevirtual   #1188 <Method String getAttribute(String)>
	//*  22   46:ifnonnull       70
			mAttributes[0].put("ImageWidth", ((Object) (ExifAttribute.createULong(0L, mExifByteOrder))));
	//   23   49:aload_0         
	//   24   50:getfield        #1146 <Field HashMap[] mAttributes>
	//   25   53:iconst_0        
	//   26   54:aaload          
	//   27   55:ldc2            #598 <String "ImageWidth">
	//   28   58:lconst_0        
	//   29   59:aload_0         
	//   30   60:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   31   63:invokestatic    #1196 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createULong(long, ByteOrder)>
	//   32   66:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//   33   69:pop             
		if(getAttribute("ImageLength") == null)
	//*  34   70:aload_0         
	//*  35   71:ldc2            #592 <String "ImageLength">
	//*  36   74:invokevirtual   #1188 <Method String getAttribute(String)>
	//*  37   77:ifnonnull       101
			mAttributes[0].put("ImageLength", ((Object) (ExifAttribute.createULong(0L, mExifByteOrder))));
	//   38   80:aload_0         
	//   39   81:getfield        #1146 <Field HashMap[] mAttributes>
	//   40   84:iconst_0        
	//   41   85:aaload          
	//   42   86:ldc2            #592 <String "ImageLength">
	//   43   89:lconst_0        
	//   44   90:aload_0         
	//   45   91:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   46   94:invokestatic    #1196 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createULong(long, ByteOrder)>
	//   47   97:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//   48  100:pop             
		if(getAttribute("Orientation") == null)
	//*  49  101:aload_0         
	//*  50  102:ldc2            #680 <String "Orientation">
	//*  51  105:invokevirtual   #1188 <Method String getAttribute(String)>
	//*  52  108:ifnonnull       132
			mAttributes[0].put("Orientation", ((Object) (ExifAttribute.createULong(0L, mExifByteOrder))));
	//   53  111:aload_0         
	//   54  112:getfield        #1146 <Field HashMap[] mAttributes>
	//   55  115:iconst_0        
	//   56  116:aaload          
	//   57  117:ldc2            #680 <String "Orientation">
	//   58  120:lconst_0        
	//   59  121:aload_0         
	//   60  122:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   61  125:invokestatic    #1196 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createULong(long, ByteOrder)>
	//   62  128:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//   63  131:pop             
		if(getAttribute("LightSource") == null)
	//*  64  132:aload_0         
	//*  65  133:ldc2            #638 <String "LightSource">
	//*  66  136:invokevirtual   #1188 <Method String getAttribute(String)>
	//*  67  139:ifnonnull       163
			mAttributes[1].put("LightSource", ((Object) (ExifAttribute.createULong(0L, mExifByteOrder))));
	//   68  142:aload_0         
	//   69  143:getfield        #1146 <Field HashMap[] mAttributes>
	//   70  146:iconst_1        
	//   71  147:aaload          
	//   72  148:ldc2            #638 <String "LightSource">
	//   73  151:lconst_0        
	//   74  152:aload_0         
	//   75  153:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   76  156:invokestatic    #1196 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createULong(long, ByteOrder)>
	//   77  159:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//   78  162:pop             
	//   79  163:return          
	}

	private static void closeQuietly(Closeable closeable)
	{
		if(closeable != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          14
			try
			{
				closeable.close();
	//    2    4:aload_0         
	//    3    5:invokeinterface #1205 <Method void Closeable.close()>
				return;
	//    4   10:return          
			}
			// Misplaced declaration of an exception variable
			catch(Closeable closeable)
	//*   5   11:astore_0        
			{
				throw closeable;
	//    6   12:aload_0         
	//    7   13:athrow          
			}
	//*   8   14:return          
			// Misplaced declaration of an exception variable
			catch(Closeable closeable)
	//*   9   15:astore_0        
			{
				return;
	//   10   16:return          
			}
		else
			return;
	}

	private String convertDecimalDegree(double d)
	{
		long l = (long)d;
	//    0    0:dload_1         
	//    1    1:d2l             
	//    2    2:lstore_3        
		d -= l;
	//    3    3:dload_1         
	//    4    4:lload_3         
	//    5    5:l2d             
	//    6    6:dsub            
	//    7    7:dstore_1        
		long l1 = (long)(d * 60D);
	//    8    8:dload_1         
	//    9    9:ldc2w           #1208 <Double 60D>
	//   10   12:dmul            
	//   11   13:d2l             
	//   12   14:lstore          5
		long l2 = Math.round((d - (double)l1 / 60D) * 3600D * 10000000D);
	//   13   16:dload_1         
	//   14   17:lload           5
	//   15   19:l2d             
	//   16   20:ldc2w           #1208 <Double 60D>
	//   17   23:ddiv            
	//   18   24:dsub            
	//   19   25:ldc2w           #1210 <Double 3600D>
	//   20   28:dmul            
	//   21   29:ldc2w           #1212 <Double 10000000D>
	//   22   32:dmul            
	//   23   33:invokestatic    #1219 <Method long Math.round(double)>
	//   24   36:lstore          7
		StringBuilder stringbuilder = new StringBuilder();
	//   25   38:new             #1221 <Class StringBuilder>
	//   26   41:dup             
	//   27   42:invokespecial   #1222 <Method void StringBuilder()>
	//   28   45:astore          9
		stringbuilder.append(l);
	//   29   47:aload           9
	//   30   49:lload_3         
	//   31   50:invokevirtual   #1226 <Method StringBuilder StringBuilder.append(long)>
	//   32   53:pop             
		stringbuilder.append("/1,");
	//   33   54:aload           9
	//   34   56:ldc2            #1228 <String "/1,">
	//   35   59:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   36   62:pop             
		stringbuilder.append(l1);
	//   37   63:aload           9
	//   38   65:lload           5
	//   39   67:invokevirtual   #1226 <Method StringBuilder StringBuilder.append(long)>
	//   40   70:pop             
		stringbuilder.append("/1,");
	//   41   71:aload           9
	//   42   73:ldc2            #1228 <String "/1,">
	//   43   76:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   44   79:pop             
		stringbuilder.append(l2);
	//   45   80:aload           9
	//   46   82:lload           7
	//   47   84:invokevirtual   #1226 <Method StringBuilder StringBuilder.append(long)>
	//   48   87:pop             
		stringbuilder.append("/10000000");
	//   49   88:aload           9
	//   50   90:ldc2            #1233 <String "/10000000">
	//   51   93:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   52   96:pop             
		return stringbuilder.toString();
	//   53   97:aload           9
	//   54   99:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//   55  102:areturn         
	}

	private static double convertRationalLatLonToDouble(String s, String s1)
	{
		double d;
		s = ((String) (s.split(",", -1)));
	//    0    0:aload_0         
	//    1    1:ldc2            #1245 <String ",">
	//    2    4:iconst_m1       
	//    3    5:invokevirtual   #1249 <Method String[] String.split(String, int)>
	//    4    8:astore_0        
		String as[] = ((String) (s[0])).split("/", -1);
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:aaload          
	//    8   12:ldc2            #1251 <String "/">
	//    9   15:iconst_m1       
	//   10   16:invokevirtual   #1249 <Method String[] String.split(String, int)>
	//   11   19:astore          8
		d = Double.parseDouble(as[0].trim()) / Double.parseDouble(as[1].trim());
	//   12   21:aload           8
	//   13   23:iconst_0        
	//   14   24:aaload          
	//   15   25:invokevirtual   #1254 <Method String String.trim()>
	//   16   28:invokestatic    #1260 <Method double Double.parseDouble(String)>
	//   17   31:aload           8
	//   18   33:iconst_1        
	//   19   34:aaload          
	//   20   35:invokevirtual   #1254 <Method String String.trim()>
	//   21   38:invokestatic    #1260 <Method double Double.parseDouble(String)>
	//   22   41:ddiv            
	//   23   42:dstore_2        
		as = ((String) (s[1])).split("/", -1);
	//   24   43:aload_0         
	//   25   44:iconst_1        
	//   26   45:aaload          
	//   27   46:ldc2            #1251 <String "/">
	//   28   49:iconst_m1       
	//   29   50:invokevirtual   #1249 <Method String[] String.split(String, int)>
	//   30   53:astore          8
		double d1 = Double.parseDouble(as[0].trim()) / Double.parseDouble(as[1].trim());
	//   31   55:aload           8
	//   32   57:iconst_0        
	//   33   58:aaload          
	//   34   59:invokevirtual   #1254 <Method String String.trim()>
	//   35   62:invokestatic    #1260 <Method double Double.parseDouble(String)>
	//   36   65:aload           8
	//   37   67:iconst_1        
	//   38   68:aaload          
	//   39   69:invokevirtual   #1254 <Method String String.trim()>
	//   40   72:invokestatic    #1260 <Method double Double.parseDouble(String)>
	//   41   75:ddiv            
	//   42   76:dstore          4
		s = ((String) (((String) (s[2])).split("/", -1)));
	//   43   78:aload_0         
	//   44   79:iconst_2        
	//   45   80:aaload          
	//   46   81:ldc2            #1251 <String "/">
	//   47   84:iconst_m1       
	//   48   85:invokevirtual   #1249 <Method String[] String.split(String, int)>
	//   49   88:astore_0        
		double d2 = Double.parseDouble(((String) (s[0])).trim()) / Double.parseDouble(((String) (s[1])).trim());
	//   50   89:aload_0         
	//   51   90:iconst_0        
	//   52   91:aaload          
	//   53   92:invokevirtual   #1254 <Method String String.trim()>
	//   54   95:invokestatic    #1260 <Method double Double.parseDouble(String)>
	//   55   98:aload_0         
	//   56   99:iconst_1        
	//   57  100:aaload          
	//   58  101:invokevirtual   #1254 <Method String String.trim()>
	//   59  104:invokestatic    #1260 <Method double Double.parseDouble(String)>
	//   60  107:ddiv            
	//   61  108:dstore          6
		d = d + d1 / 60D + d2 / 3600D;
	//   62  110:dload_2         
	//   63  111:dload           4
	//   64  113:ldc2w           #1208 <Double 60D>
	//   65  116:ddiv            
	//   66  117:dadd            
	//   67  118:dload           6
	//   68  120:ldc2w           #1210 <Double 3600D>
	//   69  123:ddiv            
	//   70  124:dadd            
	//   71  125:dstore_2        
		if(s1.equals("S") || s1.equals("W"))
	//*  72  126:aload_1         
	//*  73  127:ldc1            #194 <String "S">
	//*  74  129:invokevirtual   #1264 <Method boolean String.equals(Object)>
	//*  75  132:ifne            177
	//*  76  135:aload_1         
	//*  77  136:ldc1            #232 <String "W">
	//*  78  138:invokevirtual   #1264 <Method boolean String.equals(Object)>
	//*  79  141:ifeq            147
			break MISSING_BLOCK_LABEL_177;
	//   80  144:goto            177
		if(s1.equals("N"))
			break MISSING_BLOCK_LABEL_175;
	//   81  147:aload_1         
	//   82  148:ldc1            #120 <String "N">
	//   83  150:invokevirtual   #1264 <Method boolean String.equals(Object)>
	//   84  153:ifne            175
		if(s1.equals("E"))
	//*  85  156:aload_1         
	//*  86  157:ldc1            #229 <String "E">
	//*  87  159:invokevirtual   #1264 <Method boolean String.equals(Object)>
	//*  88  162:ifeq            167
			return d;
	//   89  165:dload_2         
	//   90  166:dreturn         
		try
		{
			throw new IllegalArgumentException();
	//   91  167:new             #1169 <Class IllegalArgumentException>
	//   92  170:dup             
	//   93  171:invokespecial   #1265 <Method void IllegalArgumentException()>
	//   94  174:athrow          
		}
	//*  95  175:dload_2         
	//*  96  176:dreturn         
	//*  97  177:dload_2         
	//*  98  178:dneg            
	//*  99  179:dreturn         
	//* 100  180:new             #1169 <Class IllegalArgumentException>
	//* 101  183:dup             
	//* 102  184:invokespecial   #1265 <Method void IllegalArgumentException()>
	//* 103  187:athrow          
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			throw new IllegalArgumentException();
		}
		return d;
		return -d;
	//* 104  188:astore_0        
	//* 105  189:goto            180
	}

	private static long[] convertToLongArray(Object obj)
	{
		if(obj instanceof int[])
	//*   0    0:aload_0         
	//*   1    1:instanceof      #1268 <Class int[]>
	//*   2    4:ifeq            41
		{
			obj = ((Object) ((int[])obj));
	//    3    7:aload_0         
	//    4    8:checkcast       #1268 <Class int[]>
	//    5   11:astore_0        
			long al[] = new long[obj.length];
	//    6   12:aload_0         
	//    7   13:arraylength     
	//    8   14:newarray        long[]
	//    9   16:astore_2        
			for(int i = 0; i < obj.length; i++)
	//*  10   17:iconst_0        
	//*  11   18:istore_1        
	//*  12   19:iload_1         
	//*  13   20:aload_0         
	//*  14   21:arraylength     
	//*  15   22:icmpge          39
				al[i] = obj[i];
	//   16   25:aload_2         
	//   17   26:iload_1         
	//   18   27:aload_0         
	//   19   28:iload_1         
	//   20   29:iaload          
	//   21   30:i2l             
	//   22   31:lastore         

	//   23   32:iload_1         
	//   24   33:iconst_1        
	//   25   34:iadd            
	//   26   35:istore_1        
	//*  27   36:goto            19
			return al;
	//   28   39:aload_2         
	//   29   40:areturn         
		}
		if(obj instanceof long[])
	//*  30   41:aload_0         
	//*  31   42:instanceof      #1270 <Class long[]>
	//*  32   45:ifeq            53
			return (long[])obj;
	//   33   48:aload_0         
	//   34   49:checkcast       #1270 <Class long[]>
	//   35   52:areturn         
		else
			return null;
	//   36   53:aconst_null     
	//   37   54:areturn         
	}

	private static int copy(InputStream inputstream, OutputStream outputstream)
		throws IOException
	{
		byte abyte0[] = new byte[8192];
	//    0    0:sipush          8192
	//    1    3:newarray        byte[]
	//    2    5:astore          4
		int i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_2        
		do
		{
			int j = inputstream.read(abyte0);
	//    5    9:aload_0         
	//    6   10:aload           4
	//    7   12:invokevirtual   #1278 <Method int InputStream.read(byte[])>
	//    8   15:istore_3        
			if(j != -1)
	//*   9   16:iload_3         
	//*  10   17:iconst_m1       
	//*  11   18:icmpeq          36
			{
				i += j;
	//   12   21:iload_2         
	//   13   22:iload_3         
	//   14   23:iadd            
	//   15   24:istore_2        
				outputstream.write(abyte0, 0, j);
	//   16   25:aload_1         
	//   17   26:aload           4
	//   18   28:iconst_0        
	//   19   29:iload_3         
	//   20   30:invokevirtual   #1284 <Method void OutputStream.write(byte[], int, int)>
			} else
	//*  21   33:goto            9
			{
				return i;
	//   22   36:iload_2         
	//   23   37:ireturn         
			}
		} while(true);
	}

	private ExifAttribute getExifAttribute(String s)
	{
		String s1 = s;
	//    0    0:aload_1         
	//    1    1:astore_3        
		if("ISOSpeedRatings".equals(((Object) (s))))
	//*   2    2:ldc2            #616 <String "ISOSpeedRatings">
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #1264 <Method boolean String.equals(Object)>
	//*   5    9:ifeq            16
			s1 = "PhotographicSensitivity";
	//    6   12:ldc2            #683 <String "PhotographicSensitivity">
	//    7   15:astore_3        
		for(int i = 0; i < EXIF_TAGS.length; i++)
	//*   8   16:iconst_0        
	//*   9   17:istore_2        
	//*  10   18:iload_2         
	//*  11   19:getstatic       #1052 <Field ExifInterface$ExifTag[][] EXIF_TAGS>
	//*  12   22:arraylength     
	//*  13   23:icmpge          53
		{
			s = ((String) ((ExifAttribute)mAttributes[i].get(((Object) (s1)))));
	//   14   26:aload_0         
	//   15   27:getfield        #1146 <Field HashMap[] mAttributes>
	//   16   30:iload_2         
	//   17   31:aaload          
	//   18   32:aload_3         
	//   19   33:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//   20   36:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//   21   39:astore_1        
			if(s != null)
	//*  22   40:aload_1         
	//*  23   41:ifnull          46
				return ((ExifAttribute) (s));
	//   24   44:aload_1         
	//   25   45:areturn         
		}

	//   26   46:iload_2         
	//   27   47:iconst_1        
	//   28   48:iadd            
	//   29   49:istore_2        
	//*  30   50:goto            18
		return null;
	//   31   53:aconst_null     
	//   32   54:areturn         
	}

	private void getJpegAttributes(ByteOrderedDataInputStream byteordereddatainputstream, int i, int j)
		throws IOException
	{
		int k;
		byteordereddatainputstream.setByteOrder(ByteOrder.BIG_ENDIAN);
	//    0    0:aload_1         
	//    1    1:getstatic       #1156 <Field ByteOrder ByteOrder.BIG_ENDIAN>
	//    2    4:invokevirtual   #1297 <Method void ExifInterface$ByteOrderedDataInputStream.setByteOrder(ByteOrder)>
		byteordereddatainputstream.seek(i);
	//    3    7:aload_1         
	//    4    8:iload_2         
	//    5    9:i2l             
	//    6   10:invokevirtual   #1301 <Method void ExifInterface$ByteOrderedDataInputStream.seek(long)>
		k = ((int) (byteordereddatainputstream.readByte()));
	//    7   13:aload_1         
	//    8   14:invokevirtual   #1305 <Method byte ExifInterface$ByteOrderedDataInputStream.readByte()>
	//    9   17:istore          4
		if(k != -1) goto _L2; else goto _L1
	//   10   19:iload           4
	//   11   21:iconst_m1       
	//   12   22:icmpne          660
_L1:
		if(byteordereddatainputstream.readByte() != -40) goto _L4; else goto _L3
	//   13   25:aload_1         
	//   14   26:invokevirtual   #1305 <Method byte ExifInterface$ByteOrderedDataInputStream.readByte()>
	//   15   29:bipush          -40
	//   16   31:icmpne          618
_L3:
		i = i + 1 + 1;
	//   17   34:iload_2         
	//   18   35:iconst_1        
	//   19   36:iadd            
	//   20   37:iconst_1        
	//   21   38:iadd            
	//   22   39:istore_2        
_L30:
		k = ((int) (byteordereddatainputstream.readByte()));
	//   23   40:aload_1         
	//   24   41:invokevirtual   #1305 <Method byte ExifInterface$ByteOrderedDataInputStream.readByte()>
	//   25   44:istore          4
		if(k != -1) goto _L6; else goto _L5
	//   26   46:iload           4
	//   27   48:iconst_m1       
	//   28   49:icmpne          576
_L5:
		byte byte0 = byteordereddatainputstream.readByte();
	//   29   52:aload_1         
	//   30   53:invokevirtual   #1305 <Method byte ExifInterface$ByteOrderedDataInputStream.readByte()>
	//   31   56:istore          6
		if(byte0 != -39 && byte0 != -38) goto _L8; else goto _L7
	//   32   58:iload           6
	//   33   60:bipush          -39
	//   34   62:icmpeq          567
	//   35   65:iload           6
	//   36   67:bipush          -38
	//   37   69:icmpne          75
	//*  38   72:goto            567
_L8:
		int l;
		l = byteordereddatainputstream.readUnsignedShort() - 2;
	//   39   75:aload_1         
	//   40   76:invokevirtual   #1309 <Method int ExifInterface$ByteOrderedDataInputStream.readUnsignedShort()>
	//   41   79:iconst_2        
	//   42   80:isub            
	//   43   81:istore          5
		k = i + 1 + 1 + 2;
	//   44   83:iload_2         
	//   45   84:iconst_1        
	//   46   85:iadd            
	//   47   86:iconst_1        
	//   48   87:iadd            
	//   49   88:iconst_2        
	//   50   89:iadd            
	//   51   90:istore          4
		if(l < 0) goto _L10; else goto _L9
	//   52   92:iload           5
	//   53   94:iflt            556
_L9:
		if(byte0 == -31) goto _L12; else goto _L11
	//   54   97:iload           6
	//   55   99:bipush          -31
	//   56  101:icmpeq          383
_L11:
		if(byte0 == -2) goto _L14; else goto _L13
	//   57  104:iload           6
	//   58  106:bipush          -2
	//   59  108:icmpeq          312
_L13:
		byte0;
	//   60  111:iload           6
		JVM INSTR tableswitch -64 -61: default 144
	//	               -64 234
	//	               -63 234
	//	               -62 234
	//	               -61 234;
	//   61  113:tableswitch     -64 -61: default 144
	//	               -64 234
	//	               -63 234
	//	               -62 234
	//	               -61 234
		   goto _L15 _L16 _L16 _L16 _L16
_L15:
		byte0;
	//   62  144:iload           6
		JVM INSTR tableswitch -59 -57: default 172
	//	               -59 234
	//	               -58 234
	//	               -57 234;
	//   63  146:tableswitch     -59 -57: default 172
	//	               -59 234
	//	               -58 234
	//	               -57 234
		   goto _L17 _L16 _L16 _L16
_L17:
		byte0;
	//   64  172:iload           6
		JVM INSTR tableswitch -55 -53: default 200
	//	               -55 234
	//	               -54 234
	//	               -53 234;
	//   65  174:tableswitch     -55 -53: default 200
	//	               -55 234
	//	               -54 234
	//	               -53 234
		   goto _L18 _L16 _L16 _L16
_L18:
		byte0;
	//   66  200:iload           6
		JVM INSTR tableswitch -51 -49: default 228
	//	               -51 234
	//	               -50 234
	//	               -49 234;
	//   67  202:tableswitch     -51 -49: default 228
	//	               -51 234
	//	               -50 234
	//	               -49 234
		   goto _L19 _L16 _L16 _L16
_L19:
		i = l;
	//   68  228:iload           5
	//   69  230:istore_2        
		  goto _L20
	//*  70  231:goto            480
_L16:
		if(byteordereddatainputstream.skipBytes(1) == 1)
	//*  71  234:aload_1         
	//*  72  235:iconst_1        
	//*  73  236:invokevirtual   #1313 <Method int ExifInterface$ByteOrderedDataInputStream.skipBytes(int)>
	//*  74  239:iconst_1        
	//*  75  240:icmpne          301
		{
			mAttributes[j].put("ImageLength", ((Object) (ExifAttribute.createULong(byteordereddatainputstream.readUnsignedShort(), mExifByteOrder))));
	//   76  243:aload_0         
	//   77  244:getfield        #1146 <Field HashMap[] mAttributes>
	//   78  247:iload_3         
	//   79  248:aaload          
	//   80  249:ldc2            #592 <String "ImageLength">
	//   81  252:aload_1         
	//   82  253:invokevirtual   #1309 <Method int ExifInterface$ByteOrderedDataInputStream.readUnsignedShort()>
	//   83  256:i2l             
	//   84  257:aload_0         
	//   85  258:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   86  261:invokestatic    #1196 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createULong(long, ByteOrder)>
	//   87  264:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//   88  267:pop             
			mAttributes[j].put("ImageWidth", ((Object) (ExifAttribute.createULong(byteordereddatainputstream.readUnsignedShort(), mExifByteOrder))));
	//   89  268:aload_0         
	//   90  269:getfield        #1146 <Field HashMap[] mAttributes>
	//   91  272:iload_3         
	//   92  273:aaload          
	//   93  274:ldc2            #598 <String "ImageWidth">
	//   94  277:aload_1         
	//   95  278:invokevirtual   #1309 <Method int ExifInterface$ByteOrderedDataInputStream.readUnsignedShort()>
	//   96  281:i2l             
	//   97  282:aload_0         
	//   98  283:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   99  286:invokestatic    #1196 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createULong(long, ByteOrder)>
	//  100  289:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//  101  292:pop             
			i = l - 5;
	//  102  293:iload           5
	//  103  295:iconst_5        
	//  104  296:isub            
	//  105  297:istore_2        
		} else
	//* 106  298:goto            480
		{
			throw new IOException("Invalid SOFx");
	//  107  301:new             #1142 <Class IOException>
	//  108  304:dup             
	//  109  305:ldc2            #1315 <String "Invalid SOFx">
	//  110  308:invokespecial   #1316 <Method void IOException(String)>
	//  111  311:athrow          
		}
		  goto _L20
_L14:
		byte abyte0[] = new byte[l];
	//  112  312:iload           5
	//  113  314:newarray        byte[]
	//  114  316:astore          7
		if(byteordereddatainputstream.read(abyte0) == l)
	//* 115  318:aload_1         
	//* 116  319:aload           7
	//* 117  321:invokevirtual   #1317 <Method int ExifInterface$ByteOrderedDataInputStream.read(byte[])>
	//* 118  324:iload           5
	//* 119  326:icmpne          372
		{
			if(getAttribute("UserComment") == null)
	//* 120  329:aload_0         
	//* 121  330:ldc2            #822 <String "UserComment">
	//* 122  333:invokevirtual   #1188 <Method String getAttribute(String)>
	//* 123  336:ifnonnull       367
				mAttributes[1].put("UserComment", ((Object) (ExifAttribute.createString(new String(abyte0, ASCII)))));
	//  124  339:aload_0         
	//  125  340:getfield        #1146 <Field HashMap[] mAttributes>
	//  126  343:iconst_1        
	//  127  344:aaload          
	//  128  345:ldc2            #822 <String "UserComment">
	//  129  348:new             #926 <Class String>
	//  130  351:dup             
	//  131  352:aload           7
	//  132  354:getstatic       #1085 <Field Charset ASCII>
	//  133  357:invokespecial   #1320 <Method void String(byte[], Charset)>
	//  134  360:invokestatic    #1192 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createString(String)>
	//  135  363:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//  136  366:pop             
			i = 0;
	//  137  367:iconst_0        
	//  138  368:istore_2        
		} else
	//* 139  369:goto            480
		{
			throw new IOException("Invalid exif");
	//  140  372:new             #1142 <Class IOException>
	//  141  375:dup             
	//  142  376:ldc2            #1322 <String "Invalid exif">
	//  143  379:invokespecial   #1316 <Method void IOException(String)>
	//  144  382:athrow          
		}
		  goto _L20
_L12:
		if(l >= 6) goto _L22; else goto _L21
	//  145  383:iload           5
	//  146  385:bipush          6
	//  147  387:icmpge          396
_L21:
		i = l;
	//  148  390:iload           5
	//  149  392:istore_2        
		  goto _L20
	//* 150  393:goto            480
_L22:
		byte abyte1[] = new byte[6];
	//  151  396:bipush          6
	//  152  398:newarray        byte[]
	//  153  400:astore          7
		if(byteordereddatainputstream.read(abyte1) != 6) goto _L24; else goto _L23
	//  154  402:aload_1         
	//  155  403:aload           7
	//  156  405:invokevirtual   #1317 <Method int ExifInterface$ByteOrderedDataInputStream.read(byte[])>
	//  157  408:bipush          6
	//  158  410:icmpne          545
_L23:
		k += 6;
	//  159  413:iload           4
	//  160  415:bipush          6
	//  161  417:iadd            
	//  162  418:istore          4
		i = l - 6;
	//  163  420:iload           5
	//  164  422:bipush          6
	//  165  424:isub            
	//  166  425:istore_2        
		if(Arrays.equals(abyte1, IDENTIFIER_EXIF_APP1)) goto _L25; else goto _L20
	//  167  426:aload           7
	//  168  428:getstatic       #1093 <Field byte[] IDENTIFIER_EXIF_APP1>
	//  169  431:invokestatic    #1325 <Method boolean Arrays.equals(byte[], byte[])>
	//  170  434:ifne            440
	//* 171  437:goto            480
_L25:
		if(i <= 0) goto _L27; else goto _L26
	//  172  440:iload_2         
	//  173  441:ifle            534
_L26:
		mExifOffset = k;
	//  174  444:aload_0         
	//  175  445:iload           4
	//  176  447:putfield        #1327 <Field int mExifOffset>
		abyte1 = new byte[i];
	//  177  450:iload_2         
	//  178  451:newarray        byte[]
	//  179  453:astore          7
		if(byteordereddatainputstream.read(abyte1) != i) goto _L29; else goto _L28
	//  180  455:aload_1         
	//  181  456:aload           7
	//  182  458:invokevirtual   #1317 <Method int ExifInterface$ByteOrderedDataInputStream.read(byte[])>
	//  183  461:iload_2         
	//  184  462:icmpne          523
_L28:
		k += i;
	//  185  465:iload           4
	//  186  467:iload_2         
	//  187  468:iadd            
	//  188  469:istore          4
		readExifSegment(abyte1, j);
	//  189  471:aload_0         
	//  190  472:aload           7
	//  191  474:iload_3         
	//  192  475:invokespecial   #1331 <Method void readExifSegment(byte[], int)>
		i = 0;
	//  193  478:iconst_0        
	//  194  479:istore_2        
_L20:
		if(i >= 0)
	//* 195  480:iload_2         
	//* 196  481:iflt            512
		{
			if(byteordereddatainputstream.skipBytes(i) == i)
	//* 197  484:aload_1         
	//* 198  485:iload_2         
	//* 199  486:invokevirtual   #1313 <Method int ExifInterface$ByteOrderedDataInputStream.skipBytes(int)>
	//* 200  489:iload_2         
	//* 201  490:icmpne          501
				i = k + i;
	//  202  493:iload           4
	//  203  495:iload_2         
	//  204  496:iadd            
	//  205  497:istore_2        
			else
	//* 206  498:goto            40
				throw new IOException("Invalid JPEG segment");
	//  207  501:new             #1142 <Class IOException>
	//  208  504:dup             
	//  209  505:ldc2            #1333 <String "Invalid JPEG segment">
	//  210  508:invokespecial   #1316 <Method void IOException(String)>
	//  211  511:athrow          
		} else
		{
			throw new IOException("Invalid length");
	//  212  512:new             #1142 <Class IOException>
	//  213  515:dup             
	//  214  516:ldc2            #1335 <String "Invalid length">
	//  215  519:invokespecial   #1316 <Method void IOException(String)>
	//  216  522:athrow          
		}
		  goto _L30
_L29:
		throw new IOException("Invalid exif");
	//  217  523:new             #1142 <Class IOException>
	//  218  526:dup             
	//  219  527:ldc2            #1322 <String "Invalid exif">
	//  220  530:invokespecial   #1316 <Method void IOException(String)>
	//  221  533:athrow          
_L27:
		throw new IOException("Invalid exif");
	//  222  534:new             #1142 <Class IOException>
	//  223  537:dup             
	//  224  538:ldc2            #1322 <String "Invalid exif">
	//  225  541:invokespecial   #1316 <Method void IOException(String)>
	//  226  544:athrow          
_L24:
		throw new IOException("Invalid exif");
	//  227  545:new             #1142 <Class IOException>
	//  228  548:dup             
	//  229  549:ldc2            #1322 <String "Invalid exif">
	//  230  552:invokespecial   #1316 <Method void IOException(String)>
	//  231  555:athrow          
_L10:
		throw new IOException("Invalid length");
	//  232  556:new             #1142 <Class IOException>
	//  233  559:dup             
	//  234  560:ldc2            #1335 <String "Invalid length">
	//  235  563:invokespecial   #1316 <Method void IOException(String)>
	//  236  566:athrow          
_L7:
		byteordereddatainputstream.setByteOrder(mExifByteOrder);
	//  237  567:aload_1         
	//  238  568:aload_0         
	//  239  569:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//  240  572:invokevirtual   #1297 <Method void ExifInterface$ByteOrderedDataInputStream.setByteOrder(ByteOrder)>
		return;
	//  241  575:return          
_L6:
		byteordereddatainputstream = ((ByteOrderedDataInputStream) (new StringBuilder()));
	//  242  576:new             #1221 <Class StringBuilder>
	//  243  579:dup             
	//  244  580:invokespecial   #1222 <Method void StringBuilder()>
	//  245  583:astore_1        
		((StringBuilder) (byteordereddatainputstream)).append("Invalid marker:");
	//  246  584:aload_1         
	//  247  585:ldc2            #1337 <String "Invalid marker:">
	//  248  588:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//  249  591:pop             
		((StringBuilder) (byteordereddatainputstream)).append(Integer.toHexString(k & 0xff));
	//  250  592:aload_1         
	//  251  593:iload           4
	//  252  595:sipush          255
	//  253  598:iand            
	//  254  599:invokestatic    #1341 <Method String Integer.toHexString(int)>
	//  255  602:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//  256  605:pop             
		throw new IOException(((StringBuilder) (byteordereddatainputstream)).toString());
	//  257  606:new             #1142 <Class IOException>
	//  258  609:dup             
	//  259  610:aload_1         
	//  260  611:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//  261  614:invokespecial   #1316 <Method void IOException(String)>
	//  262  617:athrow          
_L4:
		byteordereddatainputstream = ((ByteOrderedDataInputStream) (new StringBuilder()));
	//  263  618:new             #1221 <Class StringBuilder>
	//  264  621:dup             
	//  265  622:invokespecial   #1222 <Method void StringBuilder()>
	//  266  625:astore_1        
		((StringBuilder) (byteordereddatainputstream)).append("Invalid marker: ");
	//  267  626:aload_1         
	//  268  627:ldc2            #1343 <String "Invalid marker: ">
	//  269  630:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//  270  633:pop             
		((StringBuilder) (byteordereddatainputstream)).append(Integer.toHexString(k & 0xff));
	//  271  634:aload_1         
	//  272  635:iload           4
	//  273  637:sipush          255
	//  274  640:iand            
	//  275  641:invokestatic    #1341 <Method String Integer.toHexString(int)>
	//  276  644:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//  277  647:pop             
		throw new IOException(((StringBuilder) (byteordereddatainputstream)).toString());
	//  278  648:new             #1142 <Class IOException>
	//  279  651:dup             
	//  280  652:aload_1         
	//  281  653:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//  282  656:invokespecial   #1316 <Method void IOException(String)>
	//  283  659:athrow          
_L2:
		byteordereddatainputstream = ((ByteOrderedDataInputStream) (new StringBuilder()));
	//  284  660:new             #1221 <Class StringBuilder>
	//  285  663:dup             
	//  286  664:invokespecial   #1222 <Method void StringBuilder()>
	//  287  667:astore_1        
		((StringBuilder) (byteordereddatainputstream)).append("Invalid marker: ");
	//  288  668:aload_1         
	//  289  669:ldc2            #1343 <String "Invalid marker: ">
	//  290  672:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//  291  675:pop             
		((StringBuilder) (byteordereddatainputstream)).append(Integer.toHexString(k & 0xff));
	//  292  676:aload_1         
	//  293  677:iload           4
	//  294  679:sipush          255
	//  295  682:iand            
	//  296  683:invokestatic    #1341 <Method String Integer.toHexString(int)>
	//  297  686:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//  298  689:pop             
		throw new IOException(((StringBuilder) (byteordereddatainputstream)).toString());
	//  299  690:new             #1142 <Class IOException>
	//  300  693:dup             
	//  301  694:aload_1         
	//  302  695:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//  303  698:invokespecial   #1316 <Method void IOException(String)>
	//  304  701:athrow          
	}

	private int getMimeType(BufferedInputStream bufferedinputstream)
		throws IOException
	{
		bufferedinputstream.mark(5000);
	//    0    0:aload_1         
	//    1    1:sipush          5000
	//    2    4:invokevirtual   #1350 <Method void BufferedInputStream.mark(int)>
		byte abyte0[] = new byte[5000];
	//    3    7:sipush          5000
	//    4   10:newarray        byte[]
	//    5   12:astore_2        
		bufferedinputstream.read(abyte0);
	//    6   13:aload_1         
	//    7   14:aload_2         
	//    8   15:invokevirtual   #1351 <Method int BufferedInputStream.read(byte[])>
	//    9   18:pop             
		bufferedinputstream.reset();
	//   10   19:aload_1         
	//   11   20:invokevirtual   #1354 <Method void BufferedInputStream.reset()>
		if(isJpegFormat(abyte0))
	//*  12   23:aload_2         
	//*  13   24:invokestatic    #1358 <Method boolean isJpegFormat(byte[])>
	//*  14   27:ifeq            32
			return 4;
	//   15   30:iconst_4        
	//   16   31:ireturn         
		if(isRafFormat(abyte0))
	//*  17   32:aload_0         
	//*  18   33:aload_2         
	//*  19   34:invokespecial   #1361 <Method boolean isRafFormat(byte[])>
	//*  20   37:ifeq            43
			return 9;
	//   21   40:bipush          9
	//   22   42:ireturn         
		if(isOrfFormat(abyte0))
	//*  23   43:aload_0         
	//*  24   44:aload_2         
	//*  25   45:invokespecial   #1364 <Method boolean isOrfFormat(byte[])>
	//*  26   48:ifeq            54
			return 7;
	//   27   51:bipush          7
	//   28   53:ireturn         
		return !isRw2Format(abyte0) ? 0 : 10;
	//   29   54:aload_0         
	//   30   55:aload_2         
	//   31   56:invokespecial   #1367 <Method boolean isRw2Format(byte[])>
	//   32   59:ifeq            65
	//   33   62:bipush          10
	//   34   64:ireturn         
	//   35   65:iconst_0        
	//   36   66:ireturn         
	}

	private void getOrfAttributes(ByteOrderedDataInputStream byteordereddatainputstream)
		throws IOException
	{
		getRawAttributes(byteordereddatainputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #1372 <Method void getRawAttributes(ExifInterface$ByteOrderedDataInputStream)>
		byteordereddatainputstream = ((ByteOrderedDataInputStream) ((ExifAttribute)mAttributes[1].get("MakerNote")));
	//    3    5:aload_0         
	//    4    6:getfield        #1146 <Field HashMap[] mAttributes>
	//    5    9:iconst_1        
	//    6   10:aaload          
	//    7   11:ldc2            #644 <String "MakerNote">
	//    8   14:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//    9   17:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//   10   20:astore_1        
		if(byteordereddatainputstream != null)
	//*  11   21:aload_1         
	//*  12   22:ifnull          401
		{
			byteordereddatainputstream = new ByteOrderedDataInputStream(((ExifAttribute) (byteordereddatainputstream)).bytes);
	//   13   25:new             #6   <Class ExifInterface$ByteOrderedDataInputStream>
	//   14   28:dup             
	//   15   29:aload_1         
	//   16   30:getfield        #1375 <Field byte[] ExifInterface$ExifAttribute.bytes>
	//   17   33:invokespecial   #1378 <Method void ExifInterface$ByteOrderedDataInputStream(byte[])>
	//   18   36:astore_1        
			byteordereddatainputstream.setByteOrder(mExifByteOrder);
	//   19   37:aload_1         
	//   20   38:aload_0         
	//   21   39:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   22   42:invokevirtual   #1297 <Method void ExifInterface$ByteOrderedDataInputStream.setByteOrder(ByteOrder)>
			byte abyte0[] = new byte[ORF_MAKER_NOTE_HEADER_1.length];
	//   23   45:getstatic       #920 <Field byte[] ORF_MAKER_NOTE_HEADER_1>
	//   24   48:arraylength     
	//   25   49:newarray        byte[]
	//   26   51:astore          6
			byteordereddatainputstream.readFully(abyte0);
	//   27   53:aload_1         
	//   28   54:aload           6
	//   29   56:invokevirtual   #1381 <Method void ExifInterface$ByteOrderedDataInputStream.readFully(byte[])>
			byteordereddatainputstream.seek(0L);
	//   30   59:aload_1         
	//   31   60:lconst_0        
	//   32   61:invokevirtual   #1301 <Method void ExifInterface$ByteOrderedDataInputStream.seek(long)>
			byte abyte1[] = new byte[ORF_MAKER_NOTE_HEADER_2.length];
	//   33   64:getstatic       #924 <Field byte[] ORF_MAKER_NOTE_HEADER_2>
	//   34   67:arraylength     
	//   35   68:newarray        byte[]
	//   36   70:astore          7
			byteordereddatainputstream.readFully(abyte1);
	//   37   72:aload_1         
	//   38   73:aload           7
	//   39   75:invokevirtual   #1381 <Method void ExifInterface$ByteOrderedDataInputStream.readFully(byte[])>
			if(Arrays.equals(abyte0, ORF_MAKER_NOTE_HEADER_1))
	//*  40   78:aload           6
	//*  41   80:getstatic       #920 <Field byte[] ORF_MAKER_NOTE_HEADER_1>
	//*  42   83:invokestatic    #1325 <Method boolean Arrays.equals(byte[], byte[])>
	//*  43   86:ifeq            99
				byteordereddatainputstream.seek(8L);
	//   44   89:aload_1         
	//   45   90:ldc2w           #1382 <Long 8L>
	//   46   93:invokevirtual   #1301 <Method void ExifInterface$ByteOrderedDataInputStream.seek(long)>
			else
	//*  47   96:goto            117
			if(Arrays.equals(abyte1, ORF_MAKER_NOTE_HEADER_2))
	//*  48   99:aload           7
	//*  49  101:getstatic       #924 <Field byte[] ORF_MAKER_NOTE_HEADER_2>
	//*  50  104:invokestatic    #1325 <Method boolean Arrays.equals(byte[], byte[])>
	//*  51  107:ifeq            117
				byteordereddatainputstream.seek(12L);
	//   52  110:aload_1         
	//   53  111:ldc2w           #1384 <Long 12L>
	//   54  114:invokevirtual   #1301 <Method void ExifInterface$ByteOrderedDataInputStream.seek(long)>
			readImageFileDirectory(byteordereddatainputstream, 6);
	//   55  117:aload_0         
	//   56  118:aload_1         
	//   57  119:bipush          6
	//   58  121:invokespecial   #1389 <Method void readImageFileDirectory(ExifInterface$ByteOrderedDataInputStream, int)>
			byteordereddatainputstream = ((ByteOrderedDataInputStream) ((ExifAttribute)mAttributes[7].get("PreviewImageStart")));
	//   59  124:aload_0         
	//   60  125:getfield        #1146 <Field HashMap[] mAttributes>
	//   61  128:bipush          7
	//   62  130:aaload          
	//   63  131:ldc2            #674 <String "PreviewImageStart">
	//   64  134:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//   65  137:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//   66  140:astore_1        
			ExifAttribute exifattribute = (ExifAttribute)mAttributes[7].get("PreviewImageLength");
	//   67  141:aload_0         
	//   68  142:getfield        #1146 <Field HashMap[] mAttributes>
	//   69  145:bipush          7
	//   70  147:aaload          
	//   71  148:ldc2            #671 <String "PreviewImageLength">
	//   72  151:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//   73  154:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//   74  157:astore          6
			if(byteordereddatainputstream != null && exifattribute != null)
	//*  75  159:aload_1         
	//*  76  160:ifnull          197
	//*  77  163:aload           6
	//*  78  165:ifnull          197
			{
				mAttributes[5].put("JPEGInterchangeFormat", ((Object) (byteordereddatainputstream)));
	//   79  168:aload_0         
	//   80  169:getfield        #1146 <Field HashMap[] mAttributes>
	//   81  172:iconst_5        
	//   82  173:aaload          
	//   83  174:ldc2            #620 <String "JPEGInterchangeFormat">
	//   84  177:aload_1         
	//   85  178:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//   86  181:pop             
				mAttributes[5].put("JPEGInterchangeFormatLength", ((Object) (exifattribute)));
	//   87  182:aload_0         
	//   88  183:getfield        #1146 <Field HashMap[] mAttributes>
	//   89  186:iconst_5        
	//   90  187:aaload          
	//   91  188:ldc2            #623 <String "JPEGInterchangeFormatLength">
	//   92  191:aload           6
	//   93  193:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//   94  196:pop             
			}
			byteordereddatainputstream = ((ByteOrderedDataInputStream) ((ExifAttribute)mAttributes[8].get("AspectFrame")));
	//   95  197:aload_0         
	//   96  198:getfield        #1146 <Field HashMap[] mAttributes>
	//   97  201:bipush          8
	//   98  203:aaload          
	//   99  204:ldc2            #662 <String "AspectFrame">
	//  100  207:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//  101  210:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//  102  213:astore_1        
			if(byteordereddatainputstream != null)
	//* 103  214:aload_1         
	//* 104  215:ifnull          401
			{
				byteordereddatainputstream = ((ByteOrderedDataInputStream) ((int[])((ExifAttribute) (byteordereddatainputstream)).getValue(mExifByteOrder)));
	//  105  218:aload_1         
	//  106  219:aload_0         
	//  107  220:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//  108  223:invokevirtual   #1393 <Method Object ExifInterface$ExifAttribute.getValue(ByteOrder)>
	//  109  226:checkcast       #1268 <Class int[]>
	//  110  229:astore_1        
				if(byteordereddatainputstream != null && byteordereddatainputstream.length == 4)
	//* 111  230:aload_1         
	//* 112  231:ifnull          360
	//* 113  234:aload_1         
	//* 114  235:arraylength     
	//* 115  236:iconst_4        
	//* 116  237:icmpeq          243
	//* 117  240:goto            360
				{
					if(byteordereddatainputstream[2] > byteordereddatainputstream[0] && byteordereddatainputstream[3] > byteordereddatainputstream[1])
	//* 118  243:aload_1         
	//* 119  244:iconst_2        
	//* 120  245:iaload          
	//* 121  246:aload_1         
	//* 122  247:iconst_0        
	//* 123  248:iaload          
	//* 124  249:icmple          401
	//* 125  252:aload_1         
	//* 126  253:iconst_3        
	//* 127  254:iaload          
	//* 128  255:aload_1         
	//* 129  256:iconst_1        
	//* 130  257:iaload          
	//* 131  258:icmple          401
					{
						int l = (byteordereddatainputstream[2] - byteordereddatainputstream[0]) + 1;
	//  132  261:aload_1         
	//  133  262:iconst_2        
	//  134  263:iaload          
	//  135  264:aload_1         
	//  136  265:iconst_0        
	//  137  266:iaload          
	//  138  267:isub            
	//  139  268:iconst_1        
	//  140  269:iadd            
	//  141  270:istore          5
						int k = (byteordereddatainputstream[3] - byteordereddatainputstream[1]) + 1;
	//  142  272:aload_1         
	//  143  273:iconst_3        
	//  144  274:iaload          
	//  145  275:aload_1         
	//  146  276:iconst_1        
	//  147  277:iaload          
	//  148  278:isub            
	//  149  279:iconst_1        
	//  150  280:iadd            
	//  151  281:istore          4
						int j = l;
	//  152  283:iload           5
	//  153  285:istore_3        
						int i = k;
	//  154  286:iload           4
	//  155  288:istore_2        
						if(l < k)
	//* 156  289:iload           5
	//* 157  291:iload           4
	//* 158  293:icmpge          311
						{
							j = l + k;
	//  159  296:iload           5
	//  160  298:iload           4
	//  161  300:iadd            
	//  162  301:istore_3        
							i = j - k;
	//  163  302:iload_3         
	//  164  303:iload           4
	//  165  305:isub            
	//  166  306:istore_2        
							j -= i;
	//  167  307:iload_3         
	//  168  308:iload_2         
	//  169  309:isub            
	//  170  310:istore_3        
						}
						byteordereddatainputstream = ((ByteOrderedDataInputStream) (ExifAttribute.createUShort(j, mExifByteOrder)));
	//  171  311:iload_3         
	//  172  312:aload_0         
	//  173  313:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//  174  316:invokestatic    #1397 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createUShort(int, ByteOrder)>
	//  175  319:astore_1        
						ExifAttribute exifattribute1 = ExifAttribute.createUShort(i, mExifByteOrder);
	//  176  320:iload_2         
	//  177  321:aload_0         
	//  178  322:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//  179  325:invokestatic    #1397 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createUShort(int, ByteOrder)>
	//  180  328:astore          6
						mAttributes[0].put("ImageWidth", ((Object) (byteordereddatainputstream)));
	//  181  330:aload_0         
	//  182  331:getfield        #1146 <Field HashMap[] mAttributes>
	//  183  334:iconst_0        
	//  184  335:aaload          
	//  185  336:ldc2            #598 <String "ImageWidth">
	//  186  339:aload_1         
	//  187  340:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//  188  343:pop             
						mAttributes[0].put("ImageLength", ((Object) (exifattribute1)));
	//  189  344:aload_0         
	//  190  345:getfield        #1146 <Field HashMap[] mAttributes>
	//  191  348:iconst_0        
	//  192  349:aaload          
	//  193  350:ldc2            #592 <String "ImageLength">
	//  194  353:aload           6
	//  195  355:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//  196  358:pop             
						return;
	//  197  359:return          
					}
				} else
				{
					StringBuilder stringbuilder = new StringBuilder();
	//  198  360:new             #1221 <Class StringBuilder>
	//  199  363:dup             
	//  200  364:invokespecial   #1222 <Method void StringBuilder()>
	//  201  367:astore          6
					stringbuilder.append("Invalid aspect frame values. frame=");
	//  202  369:aload           6
	//  203  371:ldc2            #1399 <String "Invalid aspect frame values. frame=">
	//  204  374:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//  205  377:pop             
					stringbuilder.append(Arrays.toString(((int []) (byteordereddatainputstream))));
	//  206  378:aload           6
	//  207  380:aload_1         
	//  208  381:invokestatic    #1402 <Method String Arrays.toString(int[])>
	//  209  384:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//  210  387:pop             
					Log.w("ExifInterface", stringbuilder.toString());
	//  211  388:ldc2            #364 <String "ExifInterface">
	//  212  391:aload           6
	//  213  393:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//  214  396:invokestatic    #1408 <Method int Log.w(String, String)>
	//  215  399:pop             
					return;
	//  216  400:return          
				}
			}
		}
	//  217  401:return          
	}

	private void getRafAttributes(ByteOrderedDataInputStream byteordereddatainputstream)
		throws IOException
	{
		byteordereddatainputstream.skipBytes(84);
	//    0    0:aload_1         
	//    1    1:bipush          84
	//    2    3:invokevirtual   #1313 <Method int ExifInterface$ByteOrderedDataInputStream.skipBytes(int)>
	//    3    6:pop             
		byte abyte0[] = new byte[4];
	//    4    7:iconst_4        
	//    5    8:newarray        byte[]
	//    6   10:astore          6
		byte abyte1[] = new byte[4];
	//    7   12:iconst_4        
	//    8   13:newarray        byte[]
	//    9   15:astore          7
		byteordereddatainputstream.read(abyte0);
	//   10   17:aload_1         
	//   11   18:aload           6
	//   12   20:invokevirtual   #1317 <Method int ExifInterface$ByteOrderedDataInputStream.read(byte[])>
	//   13   23:pop             
		byteordereddatainputstream.skipBytes(4);
	//   14   24:aload_1         
	//   15   25:iconst_4        
	//   16   26:invokevirtual   #1313 <Method int ExifInterface$ByteOrderedDataInputStream.skipBytes(int)>
	//   17   29:pop             
		byteordereddatainputstream.read(abyte1);
	//   18   30:aload_1         
	//   19   31:aload           7
	//   20   33:invokevirtual   #1317 <Method int ExifInterface$ByteOrderedDataInputStream.read(byte[])>
	//   21   36:pop             
		int i = ByteBuffer.wrap(abyte0).getInt();
	//   22   37:aload           6
	//   23   39:invokestatic    #1415 <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//   24   42:invokevirtual   #1418 <Method int ByteBuffer.getInt()>
	//   25   45:istore_2        
		int k = ByteBuffer.wrap(abyte1).getInt();
	//   26   46:aload           7
	//   27   48:invokestatic    #1415 <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//   28   51:invokevirtual   #1418 <Method int ByteBuffer.getInt()>
	//   29   54:istore_3        
		getJpegAttributes(byteordereddatainputstream, i, 5);
	//   30   55:aload_0         
	//   31   56:aload_1         
	//   32   57:iload_2         
	//   33   58:iconst_5        
	//   34   59:invokespecial   #1420 <Method void getJpegAttributes(ExifInterface$ByteOrderedDataInputStream, int, int)>
		byteordereddatainputstream.seek(k);
	//   35   62:aload_1         
	//   36   63:iload_3         
	//   37   64:i2l             
	//   38   65:invokevirtual   #1301 <Method void ExifInterface$ByteOrderedDataInputStream.seek(long)>
		byteordereddatainputstream.setByteOrder(ByteOrder.BIG_ENDIAN);
	//   39   68:aload_1         
	//   40   69:getstatic       #1156 <Field ByteOrder ByteOrder.BIG_ENDIAN>
	//   41   72:invokevirtual   #1297 <Method void ExifInterface$ByteOrderedDataInputStream.setByteOrder(ByteOrder)>
		k = byteordereddatainputstream.readInt();
	//   42   75:aload_1         
	//   43   76:invokevirtual   #1423 <Method int ExifInterface$ByteOrderedDataInputStream.readInt()>
	//   44   79:istore_3        
		for(int j = 0; j < k; j++)
	//*  45   80:iconst_0        
	//*  46   81:istore_2        
	//*  47   82:iload_2         
	//*  48   83:iload_3         
	//*  49   84:icmpge          183
		{
			int l = byteordereddatainputstream.readUnsignedShort();
	//   50   87:aload_1         
	//   51   88:invokevirtual   #1309 <Method int ExifInterface$ByteOrderedDataInputStream.readUnsignedShort()>
	//   52   91:istore          4
			int i1 = byteordereddatainputstream.readUnsignedShort();
	//   53   93:aload_1         
	//   54   94:invokevirtual   #1309 <Method int ExifInterface$ByteOrderedDataInputStream.readUnsignedShort()>
	//   55   97:istore          5
			if(l == TAG_RAF_IMAGE_SIZE.number)
	//*  56   99:iload           4
	//*  57  101:getstatic       #1041 <Field ExifInterface$ExifTag TAG_RAF_IMAGE_SIZE>
	//*  58  104:getfield        #1117 <Field int ExifInterface$ExifTag.number>
	//*  59  107:icmpne          169
			{
				j = ((int) (byteordereddatainputstream.readShort()));
	//   60  110:aload_1         
	//   61  111:invokevirtual   #1427 <Method short ExifInterface$ByteOrderedDataInputStream.readShort()>
	//   62  114:istore_2        
				short word0 = byteordereddatainputstream.readShort();
	//   63  115:aload_1         
	//   64  116:invokevirtual   #1427 <Method short ExifInterface$ByteOrderedDataInputStream.readShort()>
	//   65  119:istore_3        
				byteordereddatainputstream = ((ByteOrderedDataInputStream) (ExifAttribute.createUShort(j, mExifByteOrder)));
	//   66  120:iload_2         
	//   67  121:aload_0         
	//   68  122:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   69  125:invokestatic    #1397 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createUShort(int, ByteOrder)>
	//   70  128:astore_1        
				ExifAttribute exifattribute = ExifAttribute.createUShort(((int) (word0)), mExifByteOrder);
	//   71  129:iload_3         
	//   72  130:aload_0         
	//   73  131:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   74  134:invokestatic    #1397 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createUShort(int, ByteOrder)>
	//   75  137:astore          6
				mAttributes[0].put("ImageLength", ((Object) (byteordereddatainputstream)));
	//   76  139:aload_0         
	//   77  140:getfield        #1146 <Field HashMap[] mAttributes>
	//   78  143:iconst_0        
	//   79  144:aaload          
	//   80  145:ldc2            #592 <String "ImageLength">
	//   81  148:aload_1         
	//   82  149:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//   83  152:pop             
				mAttributes[0].put("ImageWidth", ((Object) (exifattribute)));
	//   84  153:aload_0         
	//   85  154:getfield        #1146 <Field HashMap[] mAttributes>
	//   86  157:iconst_0        
	//   87  158:aaload          
	//   88  159:ldc2            #598 <String "ImageWidth">
	//   89  162:aload           6
	//   90  164:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//   91  167:pop             
				return;
	//   92  168:return          
			}
			byteordereddatainputstream.skipBytes(i1);
	//   93  169:aload_1         
	//   94  170:iload           5
	//   95  172:invokevirtual   #1313 <Method int ExifInterface$ByteOrderedDataInputStream.skipBytes(int)>
	//   96  175:pop             
		}

	//   97  176:iload_2         
	//   98  177:iconst_1        
	//   99  178:iadd            
	//  100  179:istore_2        
	//* 101  180:goto            82
	//  102  183:return          
	}

	private void getRawAttributes(ByteOrderedDataInputStream byteordereddatainputstream)
		throws IOException
	{
		parseTiffHeaders(byteordereddatainputstream, byteordereddatainputstream.available());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #1430 <Method int ExifInterface$ByteOrderedDataInputStream.available()>
	//    4    6:invokespecial   #1433 <Method void parseTiffHeaders(ExifInterface$ByteOrderedDataInputStream, int)>
		readImageFileDirectory(byteordereddatainputstream, 0);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:invokespecial   #1389 <Method void readImageFileDirectory(ExifInterface$ByteOrderedDataInputStream, int)>
		updateImageSizeValues(byteordereddatainputstream, 0);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:iconst_0        
	//   12   18:invokespecial   #1436 <Method void updateImageSizeValues(ExifInterface$ByteOrderedDataInputStream, int)>
		updateImageSizeValues(byteordereddatainputstream, 5);
	//   13   21:aload_0         
	//   14   22:aload_1         
	//   15   23:iconst_5        
	//   16   24:invokespecial   #1436 <Method void updateImageSizeValues(ExifInterface$ByteOrderedDataInputStream, int)>
		updateImageSizeValues(byteordereddatainputstream, 4);
	//   17   27:aload_0         
	//   18   28:aload_1         
	//   19   29:iconst_4        
	//   20   30:invokespecial   #1436 <Method void updateImageSizeValues(ExifInterface$ByteOrderedDataInputStream, int)>
		validateImages(((InputStream) (byteordereddatainputstream)));
	//   21   33:aload_0         
	//   22   34:aload_1         
	//   23   35:invokespecial   #1439 <Method void validateImages(InputStream)>
		if(mMimeType == 8)
	//*  24   38:aload_0         
	//*  25   39:getfield        #1441 <Field int mMimeType>
	//*  26   42:bipush          8
	//*  27   44:icmpne          136
		{
			byteordereddatainputstream = ((ByteOrderedDataInputStream) ((ExifAttribute)mAttributes[1].get("MakerNote")));
	//   28   47:aload_0         
	//   29   48:getfield        #1146 <Field HashMap[] mAttributes>
	//   30   51:iconst_1        
	//   31   52:aaload          
	//   32   53:ldc2            #644 <String "MakerNote">
	//   33   56:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//   34   59:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//   35   62:astore_1        
			if(byteordereddatainputstream != null)
	//*  36   63:aload_1         
	//*  37   64:ifnull          136
			{
				byteordereddatainputstream = new ByteOrderedDataInputStream(((ExifAttribute) (byteordereddatainputstream)).bytes);
	//   38   67:new             #6   <Class ExifInterface$ByteOrderedDataInputStream>
	//   39   70:dup             
	//   40   71:aload_1         
	//   41   72:getfield        #1375 <Field byte[] ExifInterface$ExifAttribute.bytes>
	//   42   75:invokespecial   #1378 <Method void ExifInterface$ByteOrderedDataInputStream(byte[])>
	//   43   78:astore_1        
				byteordereddatainputstream.setByteOrder(mExifByteOrder);
	//   44   79:aload_1         
	//   45   80:aload_0         
	//   46   81:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   47   84:invokevirtual   #1297 <Method void ExifInterface$ByteOrderedDataInputStream.setByteOrder(ByteOrder)>
				byteordereddatainputstream.seek(6L);
	//   48   87:aload_1         
	//   49   88:ldc2w           #1442 <Long 6L>
	//   50   91:invokevirtual   #1301 <Method void ExifInterface$ByteOrderedDataInputStream.seek(long)>
				readImageFileDirectory(byteordereddatainputstream, 9);
	//   51   94:aload_0         
	//   52   95:aload_1         
	//   53   96:bipush          9
	//   54   98:invokespecial   #1389 <Method void readImageFileDirectory(ExifInterface$ByteOrderedDataInputStream, int)>
				byteordereddatainputstream = ((ByteOrderedDataInputStream) ((ExifAttribute)mAttributes[9].get("ColorSpace")));
	//   55  101:aload_0         
	//   56  102:getfield        #1146 <Field HashMap[] mAttributes>
	//   57  105:bipush          9
	//   58  107:aaload          
	//   59  108:ldc2            #388 <String "ColorSpace">
	//   60  111:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//   61  114:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//   62  117:astore_1        
				if(byteordereddatainputstream != null)
	//*  63  118:aload_1         
	//*  64  119:ifnull          136
					mAttributes[1].put("ColorSpace", ((Object) (byteordereddatainputstream)));
	//   65  122:aload_0         
	//   66  123:getfield        #1146 <Field HashMap[] mAttributes>
	//   67  126:iconst_1        
	//   68  127:aaload          
	//   69  128:ldc2            #388 <String "ColorSpace">
	//   70  131:aload_1         
	//   71  132:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//   72  135:pop             
			}
		}
	//   73  136:return          
	}

	private void getRw2Attributes(ByteOrderedDataInputStream byteordereddatainputstream)
		throws IOException
	{
		getRawAttributes(byteordereddatainputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #1372 <Method void getRawAttributes(ExifInterface$ByteOrderedDataInputStream)>
		if((ExifAttribute)mAttributes[0].get("JpgFromRaw") != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #1146 <Field HashMap[] mAttributes>
	//*   5    9:iconst_0        
	//*   6   10:aaload          
	//*   7   11:ldc2            #720 <String "JpgFromRaw">
	//*   8   14:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//*   9   17:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//*  10   20:ifnull          33
			getJpegAttributes(byteordereddatainputstream, mRw2JpgFromRawOffset, 5);
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #1446 <Field int mRw2JpgFromRawOffset>
	//   15   29:iconst_5        
	//   16   30:invokespecial   #1420 <Method void getJpegAttributes(ExifInterface$ByteOrderedDataInputStream, int, int)>
		byteordereddatainputstream = ((ByteOrderedDataInputStream) ((ExifAttribute)mAttributes[0].get("ISO")));
	//   17   33:aload_0         
	//   18   34:getfield        #1146 <Field HashMap[] mAttributes>
	//   19   37:iconst_0        
	//   20   38:aaload          
	//   21   39:ldc2            #717 <String "ISO">
	//   22   42:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//   23   45:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//   24   48:astore_1        
		ExifAttribute exifattribute = (ExifAttribute)mAttributes[1].get("PhotographicSensitivity");
	//   25   49:aload_0         
	//   26   50:getfield        #1146 <Field HashMap[] mAttributes>
	//   27   53:iconst_1        
	//   28   54:aaload          
	//   29   55:ldc2            #683 <String "PhotographicSensitivity">
	//   30   58:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//   31   61:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//   32   64:astore_2        
		if(byteordereddatainputstream != null && exifattribute == null)
	//*  33   65:aload_1         
	//*  34   66:ifnull          87
	//*  35   69:aload_2         
	//*  36   70:ifnonnull       87
			mAttributes[1].put("PhotographicSensitivity", ((Object) (byteordereddatainputstream)));
	//   37   73:aload_0         
	//   38   74:getfield        #1146 <Field HashMap[] mAttributes>
	//   39   77:iconst_1        
	//   40   78:aaload          
	//   41   79:ldc2            #683 <String "PhotographicSensitivity">
	//   42   82:aload_1         
	//   43   83:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//   44   86:pop             
	//   45   87:return          
	}

	private static Pair guessDataFormat(String s)
	{
		boolean flag = s.contains(",");
	//    0    0:aload_0         
	//    1    1:ldc2            #1245 <String ",">
	//    2    4:invokevirtual   #1452 <Method boolean String.contains(CharSequence)>
	//    3    7:istore          4
		int i = 1;
	//    4    9:iconst_1        
	//    5   10:istore_1        
		if(flag)
	//*   6   11:iload           4
	//*   7   13:ifeq            273
		{
			String as[] = s.split(",", -1);
	//    8   16:aload_0         
	//    9   17:ldc2            #1245 <String ",">
	//   10   20:iconst_m1       
	//   11   21:invokevirtual   #1249 <Method String[] String.split(String, int)>
	//   12   24:astore          10
			Pair pair = guessDataFormat(as[0]);
	//   13   26:aload           10
	//   14   28:iconst_0        
	//   15   29:aaload          
	//   16   30:invokestatic    #1454 <Method Pair guessDataFormat(String)>
	//   17   33:astore          9
			s = ((String) (pair));
	//   18   35:aload           9
	//   19   37:astore_0        
			if(((Integer)pair.first).intValue() == 2)
	//*  20   38:aload           9
	//*  21   40:getfield        #1460 <Field Object Pair.first>
	//*  22   43:checkcast       #891 <Class Integer>
	//*  23   46:invokevirtual   #1463 <Method int Integer.intValue()>
	//*  24   49:iconst_2        
	//*  25   50:icmpne          56
				return pair;
	//   26   53:aload           9
	//   27   55:areturn         
			for(; i < as.length; i++)
	//*  28   56:iload_1         
	//*  29   57:aload           10
	//*  30   59:arraylength     
	//*  31   60:icmpge          271
			{
				Pair pair1 = guessDataFormat(as[i]);
	//   32   63:aload           10
	//   33   65:iload_1         
	//   34   66:aaload          
	//   35   67:invokestatic    #1454 <Method Pair guessDataFormat(String)>
	//   36   70:astore          9
				int j;
				if(!((Integer)pair1.first).equals(((Pair) (s)).first) && !((Integer)pair1.second).equals(((Pair) (s)).first))
	//*  37   72:aload           9
	//*  38   74:getfield        #1460 <Field Object Pair.first>
	//*  39   77:checkcast       #891 <Class Integer>
	//*  40   80:aload_0         
	//*  41   81:getfield        #1460 <Field Object Pair.first>
	//*  42   84:invokevirtual   #1464 <Method boolean Integer.equals(Object)>
	//*  43   87:ifne            116
	//*  44   90:aload           9
	//*  45   92:getfield        #1467 <Field Object Pair.second>
	//*  46   95:checkcast       #891 <Class Integer>
	//*  47   98:aload_0         
	//*  48   99:getfield        #1460 <Field Object Pair.first>
	//*  49  102:invokevirtual   #1464 <Method boolean Integer.equals(Object)>
	//*  50  105:ifeq            111
	//*  51  108:goto            116
					j = -1;
	//   52  111:iconst_m1       
	//   53  112:istore_2        
				else
	//*  54  113:goto            127
					j = ((Integer)((Pair) (s)).first).intValue();
	//   55  116:aload_0         
	//   56  117:getfield        #1460 <Field Object Pair.first>
	//   57  120:checkcast       #891 <Class Integer>
	//   58  123:invokevirtual   #1463 <Method int Integer.intValue()>
	//   59  126:istore_2        
				int k;
				if(((Integer)((Pair) (s)).second).intValue() != -1 && (((Integer)pair1.first).equals(((Pair) (s)).second) || ((Integer)pair1.second).equals(((Pair) (s)).second)))
	//*  60  127:aload_0         
	//*  61  128:getfield        #1467 <Field Object Pair.second>
	//*  62  131:checkcast       #891 <Class Integer>
	//*  63  134:invokevirtual   #1463 <Method int Integer.intValue()>
	//*  64  137:iconst_m1       
	//*  65  138:icmpeq          191
	//*  66  141:aload           9
	//*  67  143:getfield        #1460 <Field Object Pair.first>
	//*  68  146:checkcast       #891 <Class Integer>
	//*  69  149:aload_0         
	//*  70  150:getfield        #1467 <Field Object Pair.second>
	//*  71  153:invokevirtual   #1464 <Method boolean Integer.equals(Object)>
	//*  72  156:ifne            177
	//*  73  159:aload           9
	//*  74  161:getfield        #1467 <Field Object Pair.second>
	//*  75  164:checkcast       #891 <Class Integer>
	//*  76  167:aload_0         
	//*  77  168:getfield        #1467 <Field Object Pair.second>
	//*  78  171:invokevirtual   #1464 <Method boolean Integer.equals(Object)>
	//*  79  174:ifeq            191
					k = ((Integer)((Pair) (s)).second).intValue();
	//   80  177:aload_0         
	//   81  178:getfield        #1467 <Field Object Pair.second>
	//   82  181:checkcast       #891 <Class Integer>
	//   83  184:invokevirtual   #1463 <Method int Integer.intValue()>
	//   84  187:istore_3        
				else
	//*  85  188:goto            193
					k = -1;
	//   86  191:iconst_m1       
	//   87  192:istore_3        
				if(j == -1 && k == -1)
	//*  88  193:iload_2         
	//*  89  194:iconst_m1       
	//*  90  195:icmpne          219
	//*  91  198:iload_3         
	//*  92  199:iconst_m1       
	//*  93  200:icmpne          219
					return new Pair(((Object) (Integer.valueOf(2))), ((Object) (Integer.valueOf(-1))));
	//   94  203:new             #1456 <Class Pair>
	//   95  206:dup             
	//   96  207:iconst_2        
	//   97  208:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//   98  211:iconst_m1       
	//   99  212:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//  100  215:invokespecial   #1470 <Method void Pair(Object, Object)>
	//  101  218:areturn         
				if(j == -1)
	//* 102  219:iload_2         
	//* 103  220:iconst_m1       
	//* 104  221:icmpne          243
				{
					s = ((String) (new Pair(((Object) (Integer.valueOf(k))), ((Object) (Integer.valueOf(-1))))));
	//  105  224:new             #1456 <Class Pair>
	//  106  227:dup             
	//  107  228:iload_3         
	//  108  229:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//  109  232:iconst_m1       
	//  110  233:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//  111  236:invokespecial   #1470 <Method void Pair(Object, Object)>
	//  112  239:astore_0        
					continue;
	//  113  240:goto            264
				}
				if(k == -1)
	//* 114  243:iload_3         
	//* 115  244:iconst_m1       
	//* 116  245:icmpne          264
					s = ((String) (new Pair(((Object) (Integer.valueOf(j))), ((Object) (Integer.valueOf(-1))))));
	//  117  248:new             #1456 <Class Pair>
	//  118  251:dup             
	//  119  252:iload_2         
	//  120  253:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//  121  256:iconst_m1       
	//  122  257:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//  123  260:invokespecial   #1470 <Method void Pair(Object, Object)>
	//  124  263:astore_0        
			}

	//  125  264:iload_1         
	//  126  265:iconst_1        
	//  127  266:iadd            
	//  128  267:istore_1        
	//* 129  268:goto            56
			return ((Pair) (s));
	//  130  271:aload_0         
	//  131  272:areturn         
		}
		if(!s.contains("/")) goto _L2; else goto _L1
	//  132  273:aload_0         
	//  133  274:ldc2            #1251 <String "/">
	//  134  277:invokevirtual   #1452 <Method boolean String.contains(CharSequence)>
	//  135  280:ifeq            401
_L1:
		s = ((String) (s.split("/", -1)));
	//  136  283:aload_0         
	//  137  284:ldc2            #1251 <String "/">
	//  138  287:iconst_m1       
	//  139  288:invokevirtual   #1249 <Method String[] String.split(String, int)>
	//  140  291:astore_0        
		if(s.length != 2) goto _L4; else goto _L3
	//  141  292:aload_0         
	//  142  293:arraylength     
	//  143  294:iconst_2        
	//  144  295:icmpne          385
_L3:
		long l;
		long l1;
		l = (long)Double.parseDouble(((String) (s[0])));
	//  145  298:aload_0         
	//  146  299:iconst_0        
	//  147  300:aaload          
	//  148  301:invokestatic    #1260 <Method double Double.parseDouble(String)>
	//  149  304:d2l             
	//  150  305:lstore          5
		l1 = (long)Double.parseDouble(((String) (s[1])));
	//  151  307:aload_0         
	//  152  308:iconst_1        
	//  153  309:aaload          
	//  154  310:invokestatic    #1260 <Method double Double.parseDouble(String)>
	//  155  313:d2l             
	//  156  314:lstore          7
		if(l >= 0L && l1 >= 0L) goto _L6; else goto _L5
	//  157  316:lload           5
	//  158  318:lconst_0        
	//  159  319:lcmp            
	//  160  320:iflt            366
	//  161  323:lload           7
	//  162  325:lconst_0        
	//  163  326:lcmp            
	//  164  327:ifge            548
	//* 165  330:goto            366
_L8:
		return new Pair(((Object) (Integer.valueOf(10))), ((Object) (Integer.valueOf(5))));
	//  166  333:new             #1456 <Class Pair>
	//  167  336:dup             
	//  168  337:bipush          10
	//  169  339:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//  170  342:iconst_5        
	//  171  343:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//  172  346:invokespecial   #1470 <Method void Pair(Object, Object)>
	//  173  349:areturn         
_L7:
		return new Pair(((Object) (Integer.valueOf(5))), ((Object) (Integer.valueOf(-1))));
	//  174  350:new             #1456 <Class Pair>
	//  175  353:dup             
	//  176  354:iconst_5        
	//  177  355:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//  178  358:iconst_m1       
	//  179  359:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//  180  362:invokespecial   #1470 <Method void Pair(Object, Object)>
	//  181  365:areturn         
_L5:
		s = ((String) (new Pair(((Object) (Integer.valueOf(10))), ((Object) (Integer.valueOf(-1))))));
	//  182  366:new             #1456 <Class Pair>
	//  183  369:dup             
	//  184  370:bipush          10
	//  185  372:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//  186  375:iconst_m1       
	//  187  376:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//  188  379:invokespecial   #1470 <Method void Pair(Object, Object)>
	//  189  382:astore_0        
		return ((Pair) (s));
	//  190  383:aload_0         
	//  191  384:areturn         
_L4:
		return new Pair(((Object) (Integer.valueOf(2))), ((Object) (Integer.valueOf(-1))));
	//  192  385:new             #1456 <Class Pair>
	//  193  388:dup             
	//  194  389:iconst_2        
	//  195  390:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//  196  393:iconst_m1       
	//  197  394:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//  198  397:invokespecial   #1470 <Method void Pair(Object, Object)>
	//  199  400:areturn         
_L2:
		Object obj;
		try
		{
			obj = ((Object) (Long.valueOf(Long.parseLong(s))));
	//  200  401:aload_0         
	//  201  402:invokestatic    #1476 <Method long Long.parseLong(String)>
	//  202  405:invokestatic    #1479 <Method Long Long.valueOf(long)>
	//  203  408:astore          9
			if(((Long) (obj)).longValue() >= 0L && ((Long) (obj)).longValue() <= 65535L)
	//* 204  410:aload           9
	//* 205  412:invokevirtual   #1483 <Method long Long.longValue()>
	//* 206  415:lconst_0        
	//* 207  416:lcmp            
	//* 208  417:iflt            448
	//* 209  420:aload           9
	//* 210  422:invokevirtual   #1483 <Method long Long.longValue()>
	//* 211  425:ldc2w           #1484 <Long 65535L>
	//* 212  428:lcmp            
	//* 213  429:ifgt            448
				return new Pair(((Object) (Integer.valueOf(3))), ((Object) (Integer.valueOf(4))));
	//  214  432:new             #1456 <Class Pair>
	//  215  435:dup             
	//  216  436:iconst_3        
	//  217  437:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//  218  440:iconst_4        
	//  219  441:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//  220  444:invokespecial   #1470 <Method void Pair(Object, Object)>
	//  221  447:areturn         
			if(((Long) (obj)).longValue() < 0L)
	//* 222  448:aload           9
	//* 223  450:invokevirtual   #1483 <Method long Long.longValue()>
	//* 224  453:lconst_0        
	//* 225  454:lcmp            
	//* 226  455:ifge            475
				return new Pair(((Object) (Integer.valueOf(9))), ((Object) (Integer.valueOf(-1))));
	//  227  458:new             #1456 <Class Pair>
	//  228  461:dup             
	//  229  462:bipush          9
	//  230  464:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//  231  467:iconst_m1       
	//  232  468:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//  233  471:invokespecial   #1470 <Method void Pair(Object, Object)>
	//  234  474:areturn         
			obj = ((Object) (new Pair(((Object) (Integer.valueOf(4))), ((Object) (Integer.valueOf(-1))))));
	//  235  475:new             #1456 <Class Pair>
	//  236  478:dup             
	//  237  479:iconst_4        
	//  238  480:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//  239  483:iconst_m1       
	//  240  484:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//  241  487:invokespecial   #1470 <Method void Pair(Object, Object)>
	//  242  490:astore          9
		}
	//* 243  492:aload           9
	//* 244  494:areturn         
	//* 245  495:aload_0         
	//* 246  496:invokestatic    #1260 <Method double Double.parseDouble(String)>
	//* 247  499:pop2            
	//* 248  500:new             #1456 <Class Pair>
	//* 249  503:dup             
	//* 250  504:bipush          12
	//* 251  506:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//* 252  509:iconst_m1       
	//* 253  510:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//* 254  513:invokespecial   #1470 <Method void Pair(Object, Object)>
	//* 255  516:astore_0        
	//* 256  517:aload_0         
	//* 257  518:areturn         
	//* 258  519:new             #1456 <Class Pair>
	//* 259  522:dup             
	//* 260  523:iconst_2        
	//* 261  524:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//* 262  527:iconst_m1       
	//* 263  528:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//* 264  531:invokespecial   #1470 <Method void Pair(Object, Object)>
	//* 265  534:areturn         
	//* 266  535:astore_0        
	//* 267  536:goto            385
		// Misplaced declaration of an exception variable
		catch(NumberFormatException numberformatexception)
		{
			try
			{
				Double.parseDouble(s);
				s = ((String) (new Pair(((Object) (Integer.valueOf(12))), ((Object) (Integer.valueOf(-1))))));
			}
	//* 268  539:astore          9
	//* 269  541:goto            495
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				return new Pair(((Object) (Integer.valueOf(2))), ((Object) (Integer.valueOf(-1))));
			}
			return ((Pair) (s));
		}
		return ((Pair) (obj));
		s;
		NumberFormatException numberformatexception;
		if(true) goto _L4; else goto _L6
	//* 270  544:astore_0        
	//* 271  545:goto            519
_L6:
		if(l <= 0x7fffffffL && l1 <= 0x7fffffffL) goto _L8; else goto _L7
	//  272  548:lload           5
	//  273  550:ldc2w           #1486 <Long 0x7fffffffL>
	//  274  553:lcmp            
	//  275  554:ifgt            350
	//  276  557:lload           7
	//  277  559:ldc2w           #1486 <Long 0x7fffffffL>
	//  278  562:lcmp            
	//  279  563:ifle            333
	//* 280  566:goto            350
	}

	private void handleThumbnailFromJfif(ByteOrderedDataInputStream byteordereddatainputstream, HashMap hashmap)
		throws IOException
	{
		ExifAttribute exifattribute = (ExifAttribute)hashmap.get("JPEGInterchangeFormat");
	//    0    0:aload_2         
	//    1    1:ldc2            #620 <String "JPEGInterchangeFormat">
	//    2    4:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//    3    7:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//    4   10:astore          7
		hashmap = ((HashMap) ((ExifAttribute)hashmap.get("JPEGInterchangeFormatLength")));
	//    5   12:aload_2         
	//    6   13:ldc2            #623 <String "JPEGInterchangeFormatLength">
	//    7   16:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//    8   19:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//    9   22:astore_2        
		if(exifattribute != null && hashmap != null)
	//*  10   23:aload           7
	//*  11   25:ifnull          181
	//*  12   28:aload_2         
	//*  13   29:ifnull          181
		{
			int j = exifattribute.getIntValue(mExifByteOrder);
	//   14   32:aload           7
	//   15   34:aload_0         
	//   16   35:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   17   38:invokevirtual   #1495 <Method int ExifInterface$ExifAttribute.getIntValue(ByteOrder)>
	//   18   41:istore          4
			int k = Math.min(((ExifAttribute) (hashmap)).getIntValue(mExifByteOrder), byteordereddatainputstream.available() - j);
	//   19   43:aload_2         
	//   20   44:aload_0         
	//   21   45:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   22   48:invokevirtual   #1495 <Method int ExifInterface$ExifAttribute.getIntValue(ByteOrder)>
	//   23   51:aload_1         
	//   24   52:invokevirtual   #1430 <Method int ExifInterface$ByteOrderedDataInputStream.available()>
	//   25   55:iload           4
	//   26   57:isub            
	//   27   58:invokestatic    #1499 <Method int Math.min(int, int)>
	//   28   61:istore          5
			int l = mMimeType;
	//   29   63:aload_0         
	//   30   64:getfield        #1441 <Field int mMimeType>
	//   31   67:istore          6
			int i;
			if(l != 4 && l != 9 && l != 10)
	//*  32   69:iload           6
	//*  33   71:iconst_4        
	//*  34   72:icmpeq          113
	//*  35   75:iload           6
	//*  36   77:bipush          9
	//*  37   79:icmpeq          113
	//*  38   82:iload           6
	//*  39   84:bipush          10
	//*  40   86:icmpne          92
	//*  41   89:goto            113
			{
				i = j;
	//   42   92:iload           4
	//   43   94:istore_3        
				if(l == 7)
	//*  44   95:iload           6
	//*  45   97:bipush          7
	//*  46   99:icmpne          121
					i = j + mOrfMakerNoteOffset;
	//   47  102:iload           4
	//   48  104:aload_0         
	//   49  105:getfield        #1501 <Field int mOrfMakerNoteOffset>
	//   50  108:iadd            
	//   51  109:istore_3        
			} else
	//*  52  110:goto            121
			{
				i = j + mExifOffset;
	//   53  113:iload           4
	//   54  115:aload_0         
	//   55  116:getfield        #1327 <Field int mExifOffset>
	//   56  119:iadd            
	//   57  120:istore_3        
			}
			if(i > 0 && k > 0)
	//*  58  121:iload_3         
	//*  59  122:ifle            181
	//*  60  125:iload           5
	//*  61  127:ifle            181
			{
				mHasThumbnail = true;
	//   62  130:aload_0         
	//   63  131:iconst_1        
	//   64  132:putfield        #1503 <Field boolean mHasThumbnail>
				mThumbnailOffset = i;
	//   65  135:aload_0         
	//   66  136:iload_3         
	//   67  137:putfield        #1505 <Field int mThumbnailOffset>
				mThumbnailLength = k;
	//   68  140:aload_0         
	//   69  141:iload           5
	//   70  143:putfield        #1507 <Field int mThumbnailLength>
				if(mFilename == null && mAssetInputStream == null)
	//*  71  146:aload_0         
	//*  72  147:getfield        #1160 <Field String mFilename>
	//*  73  150:ifnonnull       181
	//*  74  153:aload_0         
	//*  75  154:getfield        #1164 <Field android.content.res.AssetManager$AssetInputStream mAssetInputStream>
	//*  76  157:ifnonnull       181
				{
					hashmap = ((HashMap) (new byte[k]));
	//   77  160:iload           5
	//   78  162:newarray        byte[]
	//   79  164:astore_2        
					byteordereddatainputstream.seek(i);
	//   80  165:aload_1         
	//   81  166:iload_3         
	//   82  167:i2l             
	//   83  168:invokevirtual   #1301 <Method void ExifInterface$ByteOrderedDataInputStream.seek(long)>
					byteordereddatainputstream.readFully(((byte []) (hashmap)));
	//   84  171:aload_1         
	//   85  172:aload_2         
	//   86  173:invokevirtual   #1381 <Method void ExifInterface$ByteOrderedDataInputStream.readFully(byte[])>
					mThumbnailBytes = ((byte []) (hashmap));
	//   87  176:aload_0         
	//   88  177:aload_2         
	//   89  178:putfield        #1509 <Field byte[] mThumbnailBytes>
				}
			}
		}
	//   90  181:return          
	}

	private void handleThumbnailFromStrips(ByteOrderedDataInputStream byteordereddatainputstream, HashMap hashmap)
		throws IOException
	{
		ExifAttribute exifattribute = (ExifAttribute)hashmap.get("StripOffsets");
	//    0    0:aload_2         
	//    1    1:ldc2            #774 <String "StripOffsets">
	//    2    4:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//    3    7:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//    4   10:astore          10
		ExifAttribute exifattribute1 = (ExifAttribute)hashmap.get("StripByteCounts");
	//    5   12:aload_2         
	//    6   13:ldc2            #771 <String "StripByteCounts">
	//    7   16:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//    8   19:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//    9   22:astore          11
		if(exifattribute != null && exifattribute1 != null)
	//*  10   24:aload           10
	//*  11   26:ifnull          263
	//*  12   29:aload           11
	//*  13   31:ifnull          263
		{
			hashmap = ((HashMap) (convertToLongArray(exifattribute.getValue(mExifByteOrder))));
	//   14   34:aload           10
	//   15   36:aload_0         
	//   16   37:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   17   40:invokevirtual   #1393 <Method Object ExifInterface$ExifAttribute.getValue(ByteOrder)>
	//   18   43:invokestatic    #1512 <Method long[] convertToLongArray(Object)>
	//   19   46:astore_2        
			long al[] = convertToLongArray(exifattribute1.getValue(mExifByteOrder));
	//   20   47:aload           11
	//   21   49:aload_0         
	//   22   50:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   23   53:invokevirtual   #1393 <Method Object ExifInterface$ExifAttribute.getValue(ByteOrder)>
	//   24   56:invokestatic    #1512 <Method long[] convertToLongArray(Object)>
	//   25   59:astore          10
			if(hashmap == null)
	//*  26   61:aload_2         
	//*  27   62:ifnonnull       76
			{
				Log.w("ExifInterface", "stripOffsets should not be null.");
	//   28   65:ldc2            #364 <String "ExifInterface">
	//   29   68:ldc2            #1514 <String "stripOffsets should not be null.">
	//   30   71:invokestatic    #1408 <Method int Log.w(String, String)>
	//   31   74:pop             
				return;
	//   32   75:return          
			}
			if(al == null)
	//*  33   76:aload           10
	//*  34   78:ifnonnull       92
			{
				Log.w("ExifInterface", "stripByteCounts should not be null.");
	//   35   81:ldc2            #364 <String "ExifInterface">
	//   36   84:ldc2            #1516 <String "stripByteCounts should not be null.">
	//   37   87:invokestatic    #1408 <Method int Log.w(String, String)>
	//   38   90:pop             
				return;
	//   39   91:return          
			}
			int k = al.length;
	//   40   92:aload           10
	//   41   94:arraylength     
	//   42   95:istore          4
			long l1 = 0L;
	//   43   97:lconst_0        
	//   44   98:lstore          8
			for(int i = 0; i < k; i++)
	//*  45  100:iconst_0        
	//*  46  101:istore_3        
	//*  47  102:iload_3         
	//*  48  103:iload           4
	//*  49  105:icmpge          124
				l1 += al[i];
	//   50  108:lload           8
	//   51  110:aload           10
	//   52  112:iload_3         
	//   53  113:laload          
	//   54  114:ladd            
	//   55  115:lstore          8

	//   56  117:iload_3         
	//   57  118:iconst_1        
	//   58  119:iadd            
	//   59  120:istore_3        
	//*  60  121:goto            102
			byte abyte0[] = new byte[(int)l1];
	//   61  124:lload           8
	//   62  126:l2i             
	//   63  127:newarray        byte[]
	//   64  129:astore          11
			boolean flag1 = false;
	//   65  131:iconst_0        
	//   66  132:istore          6
			boolean flag = flag1;
	//   67  134:iload           6
	//   68  136:istore_3        
			k = ((int) (flag));
	//   69  137:iload_3         
	//   70  138:istore          4
			int l = ((int) (flag));
	//   71  140:iload_3         
	//   72  141:istore          5
			for(int j = ((int) (flag1)); j < hashmap.length; j++)
	//*  73  143:iload           6
	//*  74  145:istore_3        
	//*  75  146:iload_3         
	//*  76  147:aload_2         
	//*  77  148:arraylength     
	//*  78  149:icmpge          245
			{
				int j1 = (int)hashmap[j];
	//   79  152:aload_2         
	//   80  153:iload_3         
	//   81  154:laload          
	//   82  155:l2i             
	//   83  156:istore          7
				int i1 = (int)al[j];
	//   84  158:aload           10
	//   85  160:iload_3         
	//   86  161:laload          
	//   87  162:l2i             
	//   88  163:istore          6
				j1 -= l;
	//   89  165:iload           7
	//   90  167:iload           5
	//   91  169:isub            
	//   92  170:istore          7
				if(j1 < 0)
	//*  93  172:iload           7
	//*  94  174:ifge            187
					Log.d("ExifInterface", "Invalid strip offset value");
	//   95  177:ldc2            #364 <String "ExifInterface">
	//   96  180:ldc2            #1518 <String "Invalid strip offset value">
	//   97  183:invokestatic    #1521 <Method int Log.d(String, String)>
	//   98  186:pop             
				byteordereddatainputstream.seek(j1);
	//   99  187:aload_1         
	//  100  188:iload           7
	//  101  190:i2l             
	//  102  191:invokevirtual   #1301 <Method void ExifInterface$ByteOrderedDataInputStream.seek(long)>
				byte abyte1[] = new byte[i1];
	//  103  194:iload           6
	//  104  196:newarray        byte[]
	//  105  198:astore          12
				byteordereddatainputstream.read(abyte1);
	//  106  200:aload_1         
	//  107  201:aload           12
	//  108  203:invokevirtual   #1317 <Method int ExifInterface$ByteOrderedDataInputStream.read(byte[])>
	//  109  206:pop             
				l = l + j1 + i1;
	//  110  207:iload           5
	//  111  209:iload           7
	//  112  211:iadd            
	//  113  212:iload           6
	//  114  214:iadd            
	//  115  215:istore          5
				System.arraycopy(((Object) (abyte1)), 0, ((Object) (abyte0)), k, abyte1.length);
	//  116  217:aload           12
	//  117  219:iconst_0        
	//  118  220:aload           11
	//  119  222:iload           4
	//  120  224:aload           12
	//  121  226:arraylength     
	//  122  227:invokestatic    #1527 <Method void System.arraycopy(Object, int, Object, int, int)>
				k += abyte1.length;
	//  123  230:iload           4
	//  124  232:aload           12
	//  125  234:arraylength     
	//  126  235:iadd            
	//  127  236:istore          4
			}

	//  128  238:iload_3         
	//  129  239:iconst_1        
	//  130  240:iadd            
	//  131  241:istore_3        
	//* 132  242:goto            146
			mHasThumbnail = true;
	//  133  245:aload_0         
	//  134  246:iconst_1        
	//  135  247:putfield        #1503 <Field boolean mHasThumbnail>
			mThumbnailBytes = abyte0;
	//  136  250:aload_0         
	//  137  251:aload           11
	//  138  253:putfield        #1509 <Field byte[] mThumbnailBytes>
			mThumbnailLength = abyte0.length;
	//  139  256:aload_0         
	//  140  257:aload           11
	//  141  259:arraylength     
	//  142  260:putfield        #1507 <Field int mThumbnailLength>
		}
	//  143  263:return          
	}

	private static boolean isJpegFormat(byte abyte0[])
		throws IOException
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		do
		{
			byte abyte1[] = JPEG_SIGNATURE;
	//    2    2:getstatic       #913 <Field byte[] JPEG_SIGNATURE>
	//    3    5:astore_2        
			if(i < abyte1.length)
	//*   4    6:iload_1         
	//*   5    7:aload_2         
	//*   6    8:arraylength     
	//*   7    9:icmpge          30
			{
				if(abyte0[i] != abyte1[i])
	//*   8   12:aload_0         
	//*   9   13:iload_1         
	//*  10   14:baload          
	//*  11   15:aload_2         
	//*  12   16:iload_1         
	//*  13   17:baload          
	//*  14   18:icmpeq          23
					return false;
	//   15   21:iconst_0        
	//   16   22:ireturn         
				i++;
	//   17   23:iload_1         
	//   18   24:iconst_1        
	//   19   25:iadd            
	//   20   26:istore_1        
			} else
	//*  21   27:goto            2
			{
				return true;
	//   22   30:iconst_1        
	//   23   31:ireturn         
			}
		} while(true);
	}

	private boolean isOrfFormat(byte abyte0[])
		throws IOException
	{
		abyte0 = ((byte []) (new ByteOrderedDataInputStream(abyte0)));
	//    0    0:new             #6   <Class ExifInterface$ByteOrderedDataInputStream>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #1378 <Method void ExifInterface$ByteOrderedDataInputStream(byte[])>
	//    4    8:astore_1        
		mExifByteOrder = readByteOrder(((ByteOrderedDataInputStream) (abyte0)));
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #1531 <Method ByteOrder readByteOrder(ExifInterface$ByteOrderedDataInputStream)>
	//    9   15:putfield        #1158 <Field ByteOrder mExifByteOrder>
		((ByteOrderedDataInputStream) (abyte0)).setByteOrder(mExifByteOrder);
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   13   23:invokevirtual   #1297 <Method void ExifInterface$ByteOrderedDataInputStream.setByteOrder(ByteOrder)>
		short word0 = ((ByteOrderedDataInputStream) (abyte0)).readShort();
	//   14   26:aload_1         
	//   15   27:invokevirtual   #1427 <Method short ExifInterface$ByteOrderedDataInputStream.readShort()>
	//   16   30:istore_2        
		((ByteOrderedDataInputStream) (abyte0)).close();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #1532 <Method void ExifInterface$ByteOrderedDataInputStream.close()>
		return word0 == 20306 || word0 == 21330;
	//   19   35:iload_2         
	//   20   36:sipush          20306
	//   21   39:icmpeq          54
	//   22   42:iload_2         
	//   23   43:sipush          21330
	//   24   46:icmpne          52
	//   25   49:goto            54
	//   26   52:iconst_0        
	//   27   53:ireturn         
	//   28   54:iconst_1        
	//   29   55:ireturn         
	}

	private boolean isRafFormat(byte abyte0[])
		throws IOException
	{
		byte abyte1[] = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
	//    0    0:ldc2            #319 <String "FUJIFILMCCD-RAW">
	//    1    3:invokestatic    #1536 <Method Charset Charset.defaultCharset()>
	//    2    6:invokevirtual   #1091 <Method byte[] String.getBytes(Charset)>
	//    3    9:astore_3        
		for(int i = 0; i < abyte1.length; i++)
	//*   4   10:iconst_0        
	//*   5   11:istore_2        
	//*   6   12:iload_2         
	//*   7   13:aload_3         
	//*   8   14:arraylength     
	//*   9   15:icmpge          36
			if(abyte0[i] != abyte1[i])
	//*  10   18:aload_1         
	//*  11   19:iload_2         
	//*  12   20:baload          
	//*  13   21:aload_3         
	//*  14   22:iload_2         
	//*  15   23:baload          
	//*  16   24:icmpeq          29
				return false;
	//   17   27:iconst_0        
	//   18   28:ireturn         

	//   19   29:iload_2         
	//   20   30:iconst_1        
	//   21   31:iadd            
	//   22   32:istore_2        
	//*  23   33:goto            12
		return true;
	//   24   36:iconst_1        
	//   25   37:ireturn         
	}

	private boolean isRw2Format(byte abyte0[])
		throws IOException
	{
		abyte0 = ((byte []) (new ByteOrderedDataInputStream(abyte0)));
	//    0    0:new             #6   <Class ExifInterface$ByteOrderedDataInputStream>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #1378 <Method void ExifInterface$ByteOrderedDataInputStream(byte[])>
	//    4    8:astore_1        
		mExifByteOrder = readByteOrder(((ByteOrderedDataInputStream) (abyte0)));
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #1531 <Method ByteOrder readByteOrder(ExifInterface$ByteOrderedDataInputStream)>
	//    9   15:putfield        #1158 <Field ByteOrder mExifByteOrder>
		((ByteOrderedDataInputStream) (abyte0)).setByteOrder(mExifByteOrder);
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   13   23:invokevirtual   #1297 <Method void ExifInterface$ByteOrderedDataInputStream.setByteOrder(ByteOrder)>
		short word0 = ((ByteOrderedDataInputStream) (abyte0)).readShort();
	//   14   26:aload_1         
	//   15   27:invokevirtual   #1427 <Method short ExifInterface$ByteOrderedDataInputStream.readShort()>
	//   16   30:istore_2        
		((ByteOrderedDataInputStream) (abyte0)).close();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #1532 <Method void ExifInterface$ByteOrderedDataInputStream.close()>
		return word0 == 85;
	//   19   35:iload_2         
	//   20   36:bipush          85
	//   21   38:icmpne          43
	//   22   41:iconst_1        
	//   23   42:ireturn         
	//   24   43:iconst_0        
	//   25   44:ireturn         
	}

	private boolean isSupportedDataType(HashMap hashmap)
		throws IOException
	{
		ExifAttribute exifattribute = (ExifAttribute)hashmap.get("BitsPerSample");
	//    0    0:aload_1         
	//    1    1:ldc2            #373 <String "BitsPerSample">
	//    2    4:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//    3    7:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//    4   10:astore_3        
		if(exifattribute != null)
	//*   5   11:aload_3         
	//*   6   12:ifnull          104
		{
			int ai[] = (int[])exifattribute.getValue(mExifByteOrder);
	//    7   15:aload_3         
	//    8   16:aload_0         
	//    9   17:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   10   20:invokevirtual   #1393 <Method Object ExifInterface$ExifAttribute.getValue(ByteOrder)>
	//   11   23:checkcast       #1268 <Class int[]>
	//   12   26:astore_3        
			if(Arrays.equals(BITS_PER_SAMPLE_RGB, ai))
	//*  13   27:getstatic       #907 <Field int[] BITS_PER_SAMPLE_RGB>
	//*  14   30:aload_3         
	//*  15   31:invokestatic    #1541 <Method boolean Arrays.equals(int[], int[])>
	//*  16   34:ifeq            39
				return true;
	//   17   37:iconst_1        
	//   18   38:ireturn         
			if(mMimeType == 3)
	//*  19   39:aload_0         
	//*  20   40:getfield        #1441 <Field int mMimeType>
	//*  21   43:iconst_3        
	//*  22   44:icmpne          104
			{
				hashmap = ((HashMap) ((ExifAttribute)hashmap.get("PhotometricInterpretation")));
	//   23   47:aload_1         
	//   24   48:ldc2            #686 <String "PhotometricInterpretation">
	//   25   51:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//   26   54:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//   27   57:astore_1        
				if(hashmap != null)
	//*  28   58:aload_1         
	//*  29   59:ifnull          104
				{
					int i = ((ExifAttribute) (hashmap)).getIntValue(mExifByteOrder);
	//   30   62:aload_1         
	//   31   63:aload_0         
	//   32   64:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   33   67:invokevirtual   #1495 <Method int ExifInterface$ExifAttribute.getIntValue(ByteOrder)>
	//   34   70:istore_2        
					if(i == 1 && Arrays.equals(ai, BITS_PER_SAMPLE_GREYSCALE_2) || i == 6 && Arrays.equals(ai, BITS_PER_SAMPLE_RGB))
	//*  35   71:iload_2         
	//*  36   72:iconst_1        
	//*  37   73:icmpne          86
	//*  38   76:aload_3         
	//*  39   77:getstatic       #911 <Field int[] BITS_PER_SAMPLE_GREYSCALE_2>
	//*  40   80:invokestatic    #1541 <Method boolean Arrays.equals(int[], int[])>
	//*  41   83:ifne            102
	//*  42   86:iload_2         
	//*  43   87:bipush          6
	//*  44   89:icmpne          104
	//*  45   92:aload_3         
	//*  46   93:getstatic       #907 <Field int[] BITS_PER_SAMPLE_RGB>
	//*  47   96:invokestatic    #1541 <Method boolean Arrays.equals(int[], int[])>
	//*  48   99:ifeq            104
						return true;
	//   49  102:iconst_1        
	//   50  103:ireturn         
				}
			}
		}
		return false;
	//   51  104:iconst_0        
	//   52  105:ireturn         
	}

	private boolean isThumbnail(HashMap hashmap)
		throws IOException
	{
		ExifAttribute exifattribute = (ExifAttribute)hashmap.get("ImageLength");
	//    0    0:aload_1         
	//    1    1:ldc2            #592 <String "ImageLength">
	//    2    4:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//    3    7:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//    4   10:astore          4
		hashmap = ((HashMap) ((ExifAttribute)hashmap.get("ImageWidth")));
	//    5   12:aload_1         
	//    6   13:ldc2            #598 <String "ImageWidth">
	//    7   16:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//    8   19:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//    9   22:astore_1        
		if(exifattribute != null && hashmap != null)
	//*  10   23:aload           4
	//*  11   25:ifnull          67
	//*  12   28:aload_1         
	//*  13   29:ifnull          67
		{
			int i = exifattribute.getIntValue(mExifByteOrder);
	//   14   32:aload           4
	//   15   34:aload_0         
	//   16   35:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   17   38:invokevirtual   #1495 <Method int ExifInterface$ExifAttribute.getIntValue(ByteOrder)>
	//   18   41:istore_2        
			int j = ((ExifAttribute) (hashmap)).getIntValue(mExifByteOrder);
	//   19   42:aload_1         
	//   20   43:aload_0         
	//   21   44:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   22   47:invokevirtual   #1495 <Method int ExifInterface$ExifAttribute.getIntValue(ByteOrder)>
	//   23   50:istore_3        
			if(i <= 512 && j <= 512)
	//*  24   51:iload_2         
	//*  25   52:sipush          512
	//*  26   55:icmpgt          67
	//*  27   58:iload_3         
	//*  28   59:sipush          512
	//*  29   62:icmpgt          67
				return true;
	//   30   65:iconst_1        
	//   31   66:ireturn         
		}
		return false;
	//   32   67:iconst_0        
	//   33   68:ireturn         
	}

	private void loadAttributes(InputStream inputstream)
		throws IOException
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
_L2:
		if(i >= EXIF_TAGS.length)
			break; /* Loop/switch isn't completed */
	//    2    2:iload_2         
	//    3    3:getstatic       #1052 <Field ExifInterface$ExifTag[][] EXIF_TAGS>
	//    4    6:arraylength     
	//    5    7:icmpge          30
		mAttributes[i] = new HashMap();
	//    6   10:aload_0         
	//    7   11:getfield        #1146 <Field HashMap[] mAttributes>
	//    8   14:iload_2         
	//    9   15:new             #1060 <Class HashMap>
	//   10   18:dup             
	//   11   19:invokespecial   #1073 <Method void HashMap()>
	//   12   22:aastore         
		i++;
	//   13   23:iload_2         
	//   14   24:iconst_1        
	//   15   25:iadd            
	//   16   26:istore_2        
		if(true) goto _L2; else goto _L1
	//   17   27:goto            2
_L1:
		inputstream = ((InputStream) (new BufferedInputStream(inputstream, 5000)));
	//   18   30:new             #1347 <Class BufferedInputStream>
	//   19   33:dup             
	//   20   34:aload_1         
	//   21   35:sipush          5000
	//   22   38:invokespecial   #1545 <Method void BufferedInputStream(InputStream, int)>
	//   23   41:astore_1        
		mMimeType = getMimeType((BufferedInputStream)inputstream);
	//   24   42:aload_0         
	//   25   43:aload_0         
	//   26   44:aload_1         
	//   27   45:checkcast       #1347 <Class BufferedInputStream>
	//   28   48:invokespecial   #1547 <Method int getMimeType(BufferedInputStream)>
	//   29   51:putfield        #1441 <Field int mMimeType>
		inputstream = ((InputStream) (new ByteOrderedDataInputStream(inputstream)));
	//   30   54:new             #6   <Class ExifInterface$ByteOrderedDataInputStream>
	//   31   57:dup             
	//   32   58:aload_1         
	//   33   59:invokespecial   #1549 <Method void ExifInterface$ByteOrderedDataInputStream(InputStream)>
	//   34   62:astore_1        
		mMimeType;
	//   35   63:aload_0         
	//   36   64:getfield        #1441 <Field int mMimeType>
		JVM INSTR tableswitch 0 11: default 204
	//	               0 162
	//	               1 162
	//	               2 162
	//	               3 162
	//	               4 152
	//	               5 162
	//	               6 162
	//	               7 144
	//	               8 162
	//	               9 136
	//	               10 128
	//	               11 162;
	//   37   67:tableswitch     0 11: default 204
	//	               0 162
	//	               1 162
	//	               2 162
	//	               3 162
	//	               4 152
	//	               5 162
	//	               6 162
	//	               7 144
	//	               8 162
	//	               9 136
	//	               10 128
	//	               11 162
		   goto _L3 _L4 _L4 _L4 _L4 _L5 _L4 _L4 _L6 _L4 _L7 _L8 _L4
_L3:
		break; /* Loop/switch isn't completed */
_L8:
		getRw2Attributes(((ByteOrderedDataInputStream) (inputstream)));
	//   38  128:aload_0         
	//   39  129:aload_1         
	//   40  130:invokespecial   #1551 <Method void getRw2Attributes(ExifInterface$ByteOrderedDataInputStream)>
		break; /* Loop/switch isn't completed */
	//   41  133:goto            167
_L7:
		try
		{
			getRafAttributes(((ByteOrderedDataInputStream) (inputstream)));
	//   42  136:aload_0         
	//   43  137:aload_1         
	//   44  138:invokespecial   #1553 <Method void getRafAttributes(ExifInterface$ByteOrderedDataInputStream)>
			break; /* Loop/switch isn't completed */
	//   45  141:goto            167
		}
	//*  46  144:aload_0         
	//*  47  145:aload_1         
	//*  48  146:invokespecial   #1555 <Method void getOrfAttributes(ExifInterface$ByteOrderedDataInputStream)>
	//*  49  149:goto            167
	//*  50  152:aload_0         
	//*  51  153:aload_1         
	//*  52  154:iconst_0        
	//*  53  155:iconst_0        
	//*  54  156:invokespecial   #1420 <Method void getJpegAttributes(ExifInterface$ByteOrderedDataInputStream, int, int)>
	//*  55  159:goto            167
	//*  56  162:aload_0         
	//*  57  163:aload_1         
	//*  58  164:invokespecial   #1372 <Method void getRawAttributes(ExifInterface$ByteOrderedDataInputStream)>
	//*  59  167:aload_0         
	//*  60  168:aload_1         
	//*  61  169:invokespecial   #1558 <Method void setThumbnailData(ExifInterface$ByteOrderedDataInputStream)>
	//*  62  172:aload_0         
	//*  63  173:iconst_1        
	//*  64  174:putfield        #1560 <Field boolean mIsSupportedFile>
	//*  65  177:goto            189
	//*  66  180:astore_1        
	//*  67  181:goto            194
	//*  68  184:aload_0         
	//*  69  185:iconst_0        
	//*  70  186:putfield        #1560 <Field boolean mIsSupportedFile>
	//*  71  189:aload_0         
	//*  72  190:invokespecial   #1562 <Method void addDefaultValuesForCompatibility()>
	//*  73  193:return          
	//*  74  194:aload_0         
	//*  75  195:invokespecial   #1562 <Method void addDefaultValuesForCompatibility()>
	//*  76  198:aload_1         
	//*  77  199:athrow          
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream) { }
	//   78  200:astore_1        
		break MISSING_BLOCK_LABEL_184;
	//   79  201:goto            184
_L6:
		getOrfAttributes(((ByteOrderedDataInputStream) (inputstream)));
		break; /* Loop/switch isn't completed */
_L5:
		getJpegAttributes(((ByteOrderedDataInputStream) (inputstream)), 0, 0);
		break; /* Loop/switch isn't completed */
_L4:
		getRawAttributes(((ByteOrderedDataInputStream) (inputstream)));
		setThumbnailData(((ByteOrderedDataInputStream) (inputstream)));
		mIsSupportedFile = true;
		break MISSING_BLOCK_LABEL_189;
		inputstream;
		break MISSING_BLOCK_LABEL_194;
		mIsSupportedFile = false;
		addDefaultValuesForCompatibility();
		return;
		addDefaultValuesForCompatibility();
		throw inputstream;
	//*  80  204:goto            167
	}

	private void parseTiffHeaders(ByteOrderedDataInputStream byteordereddatainputstream, int i)
		throws IOException
	{
		mExifByteOrder = readByteOrder(byteordereddatainputstream);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokespecial   #1531 <Method ByteOrder readByteOrder(ExifInterface$ByteOrderedDataInputStream)>
	//    4    6:putfield        #1158 <Field ByteOrder mExifByteOrder>
		byteordereddatainputstream.setByteOrder(mExifByteOrder);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//    8   14:invokevirtual   #1297 <Method void ExifInterface$ByteOrderedDataInputStream.setByteOrder(ByteOrder)>
		int j = byteordereddatainputstream.readUnsignedShort();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #1309 <Method int ExifInterface$ByteOrderedDataInputStream.readUnsignedShort()>
	//   11   21:istore_3        
		int k = mMimeType;
	//   12   22:aload_0         
	//   13   23:getfield        #1441 <Field int mMimeType>
	//   14   26:istore          4
		if(k != 7 && k != 10 && j != 42)
	//*  15   28:iload           4
	//*  16   30:bipush          7
	//*  17   32:icmpeq          88
	//*  18   35:iload           4
	//*  19   37:bipush          10
	//*  20   39:icmpeq          88
	//*  21   42:iload_3         
	//*  22   43:bipush          42
	//*  23   45:icmpne          51
	//*  24   48:goto            88
		{
			byteordereddatainputstream = ((ByteOrderedDataInputStream) (new StringBuilder()));
	//   25   51:new             #1221 <Class StringBuilder>
	//   26   54:dup             
	//   27   55:invokespecial   #1222 <Method void StringBuilder()>
	//   28   58:astore_1        
			((StringBuilder) (byteordereddatainputstream)).append("Invalid start code: ");
	//   29   59:aload_1         
	//   30   60:ldc2            #1564 <String "Invalid start code: ">
	//   31   63:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   32   66:pop             
			((StringBuilder) (byteordereddatainputstream)).append(Integer.toHexString(j));
	//   33   67:aload_1         
	//   34   68:iload_3         
	//   35   69:invokestatic    #1341 <Method String Integer.toHexString(int)>
	//   36   72:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   37   75:pop             
			throw new IOException(((StringBuilder) (byteordereddatainputstream)).toString());
	//   38   76:new             #1142 <Class IOException>
	//   39   79:dup             
	//   40   80:aload_1         
	//   41   81:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//   42   84:invokespecial   #1316 <Method void IOException(String)>
	//   43   87:athrow          
		}
		j = byteordereddatainputstream.readInt();
	//   44   88:aload_1         
	//   45   89:invokevirtual   #1423 <Method int ExifInterface$ByteOrderedDataInputStream.readInt()>
	//   46   92:istore_3        
		if(j >= 8 && j < i)
	//*  47   93:iload_3         
	//*  48   94:bipush          8
	//*  49   96:icmplt          158
	//*  50   99:iload_3         
	//*  51  100:iload_2         
	//*  52  101:icmpge          158
		{
			i = j - 8;
	//   53  104:iload_3         
	//   54  105:bipush          8
	//   55  107:isub            
	//   56  108:istore_2        
			if(i > 0)
	//*  57  109:iload_2         
	//*  58  110:ifle            157
			{
				if(byteordereddatainputstream.skipBytes(i) == i)
	//*  59  113:aload_1         
	//*  60  114:iload_2         
	//*  61  115:invokevirtual   #1313 <Method int ExifInterface$ByteOrderedDataInputStream.skipBytes(int)>
	//*  62  118:iload_2         
	//*  63  119:icmpne          123
				{
					return;
	//   64  122:return          
				} else
				{
					byteordereddatainputstream = ((ByteOrderedDataInputStream) (new StringBuilder()));
	//   65  123:new             #1221 <Class StringBuilder>
	//   66  126:dup             
	//   67  127:invokespecial   #1222 <Method void StringBuilder()>
	//   68  130:astore_1        
					((StringBuilder) (byteordereddatainputstream)).append("Couldn't jump to first Ifd: ");
	//   69  131:aload_1         
	//   70  132:ldc2            #1566 <String "Couldn't jump to first Ifd: ">
	//   71  135:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   72  138:pop             
					((StringBuilder) (byteordereddatainputstream)).append(i);
	//   73  139:aload_1         
	//   74  140:iload_2         
	//   75  141:invokevirtual   #1569 <Method StringBuilder StringBuilder.append(int)>
	//   76  144:pop             
					throw new IOException(((StringBuilder) (byteordereddatainputstream)).toString());
	//   77  145:new             #1142 <Class IOException>
	//   78  148:dup             
	//   79  149:aload_1         
	//   80  150:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//   81  153:invokespecial   #1316 <Method void IOException(String)>
	//   82  156:athrow          
				}
			} else
			{
				return;
	//   83  157:return          
			}
		} else
		{
			byteordereddatainputstream = ((ByteOrderedDataInputStream) (new StringBuilder()));
	//   84  158:new             #1221 <Class StringBuilder>
	//   85  161:dup             
	//   86  162:invokespecial   #1222 <Method void StringBuilder()>
	//   87  165:astore_1        
			((StringBuilder) (byteordereddatainputstream)).append("Invalid first Ifd offset: ");
	//   88  166:aload_1         
	//   89  167:ldc2            #1571 <String "Invalid first Ifd offset: ">
	//   90  170:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   91  173:pop             
			((StringBuilder) (byteordereddatainputstream)).append(j);
	//   92  174:aload_1         
	//   93  175:iload_3         
	//   94  176:invokevirtual   #1569 <Method StringBuilder StringBuilder.append(int)>
	//   95  179:pop             
			throw new IOException(((StringBuilder) (byteordereddatainputstream)).toString());
	//   96  180:new             #1142 <Class IOException>
	//   97  183:dup             
	//   98  184:aload_1         
	//   99  185:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//  100  188:invokespecial   #1316 <Method void IOException(String)>
	//  101  191:athrow          
		}
	}

	private void printAttributes()
	{
		for(int i = 0; i < mAttributes.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #1146 <Field HashMap[] mAttributes>
	//*   5    7:arraylength     
	//*   6    8:icmpge          219
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    7   11:new             #1221 <Class StringBuilder>
	//    8   14:dup             
	//    9   15:invokespecial   #1222 <Method void StringBuilder()>
	//   10   18:astore_2        
			stringbuilder.append("The size of tag group[");
	//   11   19:aload_2         
	//   12   20:ldc2            #1574 <String "The size of tag group[">
	//   13   23:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   14   26:pop             
			stringbuilder.append(i);
	//   15   27:aload_2         
	//   16   28:iload_1         
	//   17   29:invokevirtual   #1569 <Method StringBuilder StringBuilder.append(int)>
	//   18   32:pop             
			stringbuilder.append("]: ");
	//   19   33:aload_2         
	//   20   34:ldc2            #1576 <String "]: ">
	//   21   37:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   22   40:pop             
			stringbuilder.append(mAttributes[i].size());
	//   23   41:aload_2         
	//   24   42:aload_0         
	//   25   43:getfield        #1146 <Field HashMap[] mAttributes>
	//   26   46:iload_1         
	//   27   47:aaload          
	//   28   48:invokevirtual   #1579 <Method int HashMap.size()>
	//   29   51:invokevirtual   #1569 <Method StringBuilder StringBuilder.append(int)>
	//   30   54:pop             
			Log.d("ExifInterface", stringbuilder.toString());
	//   31   55:ldc2            #364 <String "ExifInterface">
	//   32   58:aload_2         
	//   33   59:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//   34   62:invokestatic    #1521 <Method int Log.d(String, String)>
	//   35   65:pop             
			StringBuilder stringbuilder1;
			for(Iterator iterator = mAttributes[i].entrySet().iterator(); iterator.hasNext(); Log.d("ExifInterface", stringbuilder1.toString()))
	//*  36   66:aload_0         
	//*  37   67:getfield        #1146 <Field HashMap[] mAttributes>
	//*  38   70:iload_1         
	//*  39   71:aaload          
	//*  40   72:invokevirtual   #1583 <Method Set HashMap.entrySet()>
	//*  41   75:invokeinterface #1589 <Method Iterator Set.iterator()>
	//*  42   80:astore_2        
	//*  43   81:aload_2         
	//*  44   82:invokeinterface #1595 <Method boolean Iterator.hasNext()>
	//*  45   87:ifeq            212
			{
				java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   46   90:aload_2         
	//   47   91:invokeinterface #1599 <Method Object Iterator.next()>
	//   48   96:checkcast       #1601 <Class java.util.Map$Entry>
	//   49   99:astore_3        
				ExifAttribute exifattribute = (ExifAttribute)entry.getValue();
	//   50  100:aload_3         
	//   51  101:invokeinterface #1603 <Method Object java.util.Map$Entry.getValue()>
	//   52  106:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//   53  109:astore          4
				stringbuilder1 = new StringBuilder();
	//   54  111:new             #1221 <Class StringBuilder>
	//   55  114:dup             
	//   56  115:invokespecial   #1222 <Method void StringBuilder()>
	//   57  118:astore          5
				stringbuilder1.append("tagName: ");
	//   58  120:aload           5
	//   59  122:ldc2            #1605 <String "tagName: ">
	//   60  125:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   61  128:pop             
				stringbuilder1.append((String)entry.getKey());
	//   62  129:aload           5
	//   63  131:aload_3         
	//   64  132:invokeinterface #1608 <Method Object java.util.Map$Entry.getKey()>
	//   65  137:checkcast       #926 <Class String>
	//   66  140:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   67  143:pop             
				stringbuilder1.append(", tagType: ");
	//   68  144:aload           5
	//   69  146:ldc2            #1610 <String ", tagType: ">
	//   70  149:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   71  152:pop             
				stringbuilder1.append(exifattribute.toString());
	//   72  153:aload           5
	//   73  155:aload           4
	//   74  157:invokevirtual   #1611 <Method String ExifInterface$ExifAttribute.toString()>
	//   75  160:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   76  163:pop             
				stringbuilder1.append(", tagValue: '");
	//   77  164:aload           5
	//   78  166:ldc2            #1613 <String ", tagValue: '">
	//   79  169:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   80  172:pop             
				stringbuilder1.append(exifattribute.getStringValue(mExifByteOrder));
	//   81  173:aload           5
	//   82  175:aload           4
	//   83  177:aload_0         
	//   84  178:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   85  181:invokevirtual   #1617 <Method String ExifInterface$ExifAttribute.getStringValue(ByteOrder)>
	//   86  184:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   87  187:pop             
				stringbuilder1.append("'");
	//   88  188:aload           5
	//   89  190:ldc2            #1619 <String "'">
	//   90  193:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   91  196:pop             
			}

	//   92  197:ldc2            #364 <String "ExifInterface">
	//   93  200:aload           5
	//   94  202:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//   95  205:invokestatic    #1521 <Method int Log.d(String, String)>
	//   96  208:pop             
		}

	//   97  209:goto            81
	//   98  212:iload_1         
	//   99  213:iconst_1        
	//  100  214:iadd            
	//  101  215:istore_1        
	//* 102  216:goto            2
	//  103  219:return          
	}

	private ByteOrder readByteOrder(ByteOrderedDataInputStream byteordereddatainputstream)
		throws IOException
	{
		short word0 = byteordereddatainputstream.readShort();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #1427 <Method short ExifInterface$ByteOrderedDataInputStream.readShort()>
	//    2    4:istore_2        
		if(word0 != 18761)
	//*   3    5:iload_2         
	//*   4    6:sipush          18761
	//*   5    9:icmpeq          60
		{
			if(word0 == 19789)
	//*   6   12:iload_2         
	//*   7   13:sipush          19789
	//*   8   16:icmpne          23
			{
				return ByteOrder.BIG_ENDIAN;
	//    9   19:getstatic       #1156 <Field ByteOrder ByteOrder.BIG_ENDIAN>
	//   10   22:areturn         
			} else
			{
				byteordereddatainputstream = ((ByteOrderedDataInputStream) (new StringBuilder()));
	//   11   23:new             #1221 <Class StringBuilder>
	//   12   26:dup             
	//   13   27:invokespecial   #1222 <Method void StringBuilder()>
	//   14   30:astore_1        
				((StringBuilder) (byteordereddatainputstream)).append("Invalid byte order: ");
	//   15   31:aload_1         
	//   16   32:ldc2            #1621 <String "Invalid byte order: ">
	//   17   35:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
				((StringBuilder) (byteordereddatainputstream)).append(Integer.toHexString(((int) (word0))));
	//   19   39:aload_1         
	//   20   40:iload_2         
	//   21   41:invokestatic    #1341 <Method String Integer.toHexString(int)>
	//   22   44:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
				throw new IOException(((StringBuilder) (byteordereddatainputstream)).toString());
	//   24   48:new             #1142 <Class IOException>
	//   25   51:dup             
	//   26   52:aload_1         
	//   27   53:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//   28   56:invokespecial   #1316 <Method void IOException(String)>
	//   29   59:athrow          
			}
		} else
		{
			return ByteOrder.LITTLE_ENDIAN;
	//   30   60:getstatic       #1624 <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//   31   63:areturn         
		}
	}

	private void readExifSegment(byte abyte0[], int i)
		throws IOException
	{
		ByteOrderedDataInputStream byteordereddatainputstream = new ByteOrderedDataInputStream(abyte0);
	//    0    0:new             #6   <Class ExifInterface$ByteOrderedDataInputStream>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #1378 <Method void ExifInterface$ByteOrderedDataInputStream(byte[])>
	//    4    8:astore_3        
		parseTiffHeaders(byteordereddatainputstream, abyte0.length);
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:aload_1         
	//    8   12:arraylength     
	//    9   13:invokespecial   #1433 <Method void parseTiffHeaders(ExifInterface$ByteOrderedDataInputStream, int)>
		readImageFileDirectory(byteordereddatainputstream, i);
	//   10   16:aload_0         
	//   11   17:aload_3         
	//   12   18:iload_2         
	//   13   19:invokespecial   #1389 <Method void readImageFileDirectory(ExifInterface$ByteOrderedDataInputStream, int)>
	//   14   22:return          
	}

	private void readImageFileDirectory(ByteOrderedDataInputStream byteordereddatainputstream, int i)
		throws IOException
	{
label0:
		{
			mAttributesOffsets.add(((Object) (Integer.valueOf(byteordereddatainputstream.mPosition))));
	//    0    0:aload_0         
	//    1    1:getfield        #1151 <Field Set mAttributesOffsets>
	//    2    4:aload_1         
	//    3    5:getfield        #1627 <Field int ExifInterface$ByteOrderedDataInputStream.mPosition>
	//    4    8:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//    5   11:invokeinterface #1630 <Method boolean Set.add(Object)>
	//    6   16:pop             
			if(byteordereddatainputstream.mPosition + 2 > byteordereddatainputstream.mLength)
	//*   7   17:aload_1         
	//*   8   18:getfield        #1627 <Field int ExifInterface$ByteOrderedDataInputStream.mPosition>
	//*   9   21:iconst_2        
	//*  10   22:iadd            
	//*  11   23:aload_1         
	//*  12   24:getfield        #1633 <Field int ExifInterface$ByteOrderedDataInputStream.mLength>
	//*  13   27:icmple          31
				return;
	//   14   30:return          
			short word0 = byteordereddatainputstream.readShort();
	//   15   31:aload_1         
	//   16   32:invokevirtual   #1427 <Method short ExifInterface$ByteOrderedDataInputStream.readShort()>
	//   17   35:istore          5
			if(byteordereddatainputstream.mPosition + word0 * 12 > byteordereddatainputstream.mLength)
				break label0;
	//   18   37:aload_1         
	//   19   38:getfield        #1627 <Field int ExifInterface$ByteOrderedDataInputStream.mPosition>
	//   20   41:iload           5
	//   21   43:bipush          12
	//   22   45:imul            
	//   23   46:iadd            
	//   24   47:aload_1         
	//   25   48:getfield        #1633 <Field int ExifInterface$ByteOrderedDataInputStream.mLength>
	//   26   51:icmpgt          1319
			if(word0 <= 0)
	//*  27   54:iload           5
	//*  28   56:ifgt            60
				return;
	//   29   59:return          
			short word1 = 0;
	//   30   60:iconst_0        
	//   31   61:istore          6
label1:
			do
			{
				int j;
				boolean flag;
				int l;
				int k1;
				int l1;
				long l2;
				long l4;
				Object obj;
label2:
				{
					k1 = i;
	//   32   63:iload_2         
	//   33   64:istore          9
					if(word1 >= word0)
						break label1;
	//   34   66:iload           6
	//   35   68:iload           5
	//   36   70:icmpge          1154
					l1 = byteordereddatainputstream.readUnsignedShort();
	//   37   73:aload_1         
	//   38   74:invokevirtual   #1309 <Method int ExifInterface$ByteOrderedDataInputStream.readUnsignedShort()>
	//   39   77:istore          10
					int i1 = byteordereddatainputstream.readUnsignedShort();
	//   40   79:aload_1         
	//   41   80:invokevirtual   #1309 <Method int ExifInterface$ByteOrderedDataInputStream.readUnsignedShort()>
	//   42   83:istore          8
					l = byteordereddatainputstream.readInt();
	//   43   85:aload_1         
	//   44   86:invokevirtual   #1423 <Method int ExifInterface$ByteOrderedDataInputStream.readInt()>
	//   45   89:istore          7
					l4 = (long)byteordereddatainputstream.peek() + 4L;
	//   46   91:aload_1         
	//   47   92:invokevirtual   #1636 <Method int ExifInterface$ByteOrderedDataInputStream.peek()>
	//   48   95:i2l             
	//   49   96:ldc2w           #1637 <Long 4L>
	//   50   99:ladd            
	//   51  100:lstore          13
					obj = ((Object) ((ExifTag)sExifTagMapsForReading[k1].get(((Object) (Integer.valueOf(l1))))));
	//   52  102:getstatic       #1062 <Field HashMap[] sExifTagMapsForReading>
	//   53  105:iload           9
	//   54  107:aaload          
	//   55  108:iload           10
	//   56  110:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//   57  113:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//   58  116:checkcast       #15  <Class ExifInterface$ExifTag>
	//   59  119:astore          17
					if(obj == null)
	//*  60  121:aload           17
	//*  61  123:ifnonnull       167
					{
						StringBuilder stringbuilder = new StringBuilder();
	//   62  126:new             #1221 <Class StringBuilder>
	//   63  129:dup             
	//   64  130:invokespecial   #1222 <Method void StringBuilder()>
	//   65  133:astore          18
						stringbuilder.append("Skip the tag entry since tag number is not defined: ");
	//   66  135:aload           18
	//   67  137:ldc2            #1640 <String "Skip the tag entry since tag number is not defined: ">
	//   68  140:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   69  143:pop             
						stringbuilder.append(l1);
	//   70  144:aload           18
	//   71  146:iload           10
	//   72  148:invokevirtual   #1569 <Method StringBuilder StringBuilder.append(int)>
	//   73  151:pop             
						Log.w("ExifInterface", stringbuilder.toString());
	//   74  152:ldc2            #364 <String "ExifInterface">
	//   75  155:aload           18
	//   76  157:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//   77  160:invokestatic    #1408 <Method int Log.w(String, String)>
	//   78  163:pop             
					} else
	//*  79  164:goto            394
					if(i1 > 0 && i1 < IFD_FORMAT_BYTES_PER_FORMAT.length)
	//*  80  167:iload           8
	//*  81  169:ifle            356
	//*  82  172:iload           8
	//*  83  174:getstatic       #956 <Field int[] IFD_FORMAT_BYTES_PER_FORMAT>
	//*  84  177:arraylength     
	//*  85  178:icmplt          184
	//*  86  181:goto            356
					{
						if(!((ExifTag) (obj)).isFormatCompatible(i1))
	//*  87  184:aload           17
	//*  88  186:iload           8
	//*  89  188:invokevirtual   #1644 <Method boolean ExifInterface$ExifTag.isFormatCompatible(int)>
	//*  90  191:ifne            259
						{
							StringBuilder stringbuilder1 = new StringBuilder();
	//   91  194:new             #1221 <Class StringBuilder>
	//   92  197:dup             
	//   93  198:invokespecial   #1222 <Method void StringBuilder()>
	//   94  201:astore          18
							stringbuilder1.append("Skip the tag entry since data format (");
	//   95  203:aload           18
	//   96  205:ldc2            #1646 <String "Skip the tag entry since data format (">
	//   97  208:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   98  211:pop             
							stringbuilder1.append(IFD_FORMAT_NAMES[i1]);
	//   99  212:aload           18
	//  100  214:getstatic       #954 <Field String[] IFD_FORMAT_NAMES>
	//  101  217:iload           8
	//  102  219:aaload          
	//  103  220:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//  104  223:pop             
							stringbuilder1.append(") is unexpected for tag: ");
	//  105  224:aload           18
	//  106  226:ldc2            #1648 <String ") is unexpected for tag: ">
	//  107  229:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//  108  232:pop             
							stringbuilder1.append(((ExifTag) (obj)).name);
	//  109  233:aload           18
	//  110  235:aload           17
	//  111  237:getfield        #1124 <Field String ExifInterface$ExifTag.name>
	//  112  240:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//  113  243:pop             
							Log.w("ExifInterface", stringbuilder1.toString());
	//  114  244:ldc2            #364 <String "ExifInterface">
	//  115  247:aload           18
	//  116  249:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//  117  252:invokestatic    #1408 <Method int Log.w(String, String)>
	//  118  255:pop             
						} else
	//* 119  256:goto            394
						{
							j = i1;
	//  120  259:iload           8
	//  121  261:istore_3        
							if(i1 == 7)
	//* 122  262:iload           8
	//* 123  264:bipush          7
	//* 124  266:icmpne          275
								j = ((ExifTag) (obj)).primaryFormat;
	//  125  269:aload           17
	//  126  271:getfield        #1651 <Field int ExifInterface$ExifTag.primaryFormat>
	//  127  274:istore_3        
							l2 = (long)l * (long)IFD_FORMAT_BYTES_PER_FORMAT[j];
	//  128  275:iload           7
	//  129  277:i2l             
	//  130  278:getstatic       #956 <Field int[] IFD_FORMAT_BYTES_PER_FORMAT>
	//  131  281:iload_3         
	//  132  282:iaload          
	//  133  283:i2l             
	//  134  284:lmul            
	//  135  285:lstore          11
							if(l2 >= 0L && l2 <= 0x7fffffffL)
	//* 136  287:lload           11
	//* 137  289:lconst_0        
	//* 138  290:lcmp            
	//* 139  291:iflt            312
	//* 140  294:lload           11
	//* 141  296:ldc2w           #1486 <Long 0x7fffffffL>
	//* 142  299:lcmp            
	//* 143  300:ifle            306
	//* 144  303:goto            312
							{
								flag = true;
	//  145  306:iconst_1        
	//  146  307:istore          4
							} else
	//* 147  309:goto            403
							{
								StringBuilder stringbuilder2 = new StringBuilder();
	//  148  312:new             #1221 <Class StringBuilder>
	//  149  315:dup             
	//  150  316:invokespecial   #1222 <Method void StringBuilder()>
	//  151  319:astore          18
								stringbuilder2.append("Skip the tag entry since the number of components is invalid: ");
	//  152  321:aload           18
	//  153  323:ldc2            #1653 <String "Skip the tag entry since the number of components is invalid: ">
	//  154  326:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//  155  329:pop             
								stringbuilder2.append(l);
	//  156  330:aload           18
	//  157  332:iload           7
	//  158  334:invokevirtual   #1569 <Method StringBuilder StringBuilder.append(int)>
	//  159  337:pop             
								Log.w("ExifInterface", stringbuilder2.toString());
	//  160  338:ldc2            #364 <String "ExifInterface">
	//  161  341:aload           18
	//  162  343:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//  163  346:invokestatic    #1408 <Method int Log.w(String, String)>
	//  164  349:pop             
								flag = false;
	//  165  350:iconst_0        
	//  166  351:istore          4
							}
							break label2;
	//  167  353:goto            403
						}
					} else
					{
						StringBuilder stringbuilder3 = new StringBuilder();
	//  168  356:new             #1221 <Class StringBuilder>
	//  169  359:dup             
	//  170  360:invokespecial   #1222 <Method void StringBuilder()>
	//  171  363:astore          18
						stringbuilder3.append("Skip the tag entry since data format is invalid: ");
	//  172  365:aload           18
	//  173  367:ldc2            #1655 <String "Skip the tag entry since data format is invalid: ">
	//  174  370:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//  175  373:pop             
						stringbuilder3.append(i1);
	//  176  374:aload           18
	//  177  376:iload           8
	//  178  378:invokevirtual   #1569 <Method StringBuilder StringBuilder.append(int)>
	//  179  381:pop             
						Log.w("ExifInterface", stringbuilder3.toString());
	//  180  382:ldc2            #364 <String "ExifInterface">
	//  181  385:aload           18
	//  182  387:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//  183  390:invokestatic    #1408 <Method int Log.w(String, String)>
	//  184  393:pop             
					}
					l2 = 0L;
	//  185  394:lconst_0        
	//  186  395:lstore          11
					flag = false;
	//  187  397:iconst_0        
	//  188  398:istore          4
					j = i1;
	//  189  400:iload           8
	//  190  402:istore_3        
				}
label3:
				{
					if(!flag)
	//* 191  403:iload           4
	//* 192  405:ifne            417
					{
						byteordereddatainputstream.seek(l4);
	//  193  408:aload_1         
	//  194  409:lload           13
	//  195  411:invokevirtual   #1301 <Method void ExifInterface$ByteOrderedDataInputStream.seek(long)>
						break label3;
	//  196  414:goto            1144
					}
					if(l2 > 4L)
	//* 197  417:lload           11
	//* 198  419:ldc2w           #1637 <Long 4L>
	//* 199  422:lcmp            
	//* 200  423:ifle            700
					{
						int k = byteordereddatainputstream.readInt();
	//  201  426:aload_1         
	//  202  427:invokevirtual   #1423 <Method int ExifInterface$ByteOrderedDataInputStream.readInt()>
	//  203  430:istore          4
						int j1 = mMimeType;
	//  204  432:aload_0         
	//  205  433:getfield        #1441 <Field int mMimeType>
	//  206  436:istore          8
						if(j1 == 7)
	//* 207  438:iload           8
	//* 208  440:bipush          7
	//* 209  442:icmpne          594
						{
							if("MakerNote".equals(((Object) (((ExifTag) (obj)).name))))
	//* 210  445:ldc2            #644 <String "MakerNote">
	//* 211  448:aload           17
	//* 212  450:getfield        #1124 <Field String ExifInterface$ExifTag.name>
	//* 213  453:invokevirtual   #1264 <Method boolean String.equals(Object)>
	//* 214  456:ifeq            468
								mOrfMakerNoteOffset = k;
	//  215  459:aload_0         
	//  216  460:iload           4
	//  217  462:putfield        #1501 <Field int mOrfMakerNoteOffset>
							else
	//* 218  465:goto            621
							if(k1 == 6 && "ThumbnailImage".equals(((Object) (((ExifTag) (obj)).name))))
	//* 219  468:iload           9
	//* 220  470:bipush          6
	//* 221  472:icmpne          591
	//* 222  475:ldc2            #677 <String "ThumbnailImage">
	//* 223  478:aload           17
	//* 224  480:getfield        #1124 <Field String ExifInterface$ExifTag.name>
	//* 225  483:invokevirtual   #1264 <Method boolean String.equals(Object)>
	//* 226  486:ifeq            588
							{
								mOrfThumbnailOffset = k;
	//  227  489:aload_0         
	//  228  490:iload           4
	//  229  492:putfield        #1657 <Field int mOrfThumbnailOffset>
								mOrfThumbnailLength = l;
	//  230  495:aload_0         
	//  231  496:iload           7
	//  232  498:putfield        #1659 <Field int mOrfThumbnailLength>
								ExifAttribute exifattribute = ExifAttribute.createUShort(6, mExifByteOrder);
	//  233  501:bipush          6
	//  234  503:aload_0         
	//  235  504:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//  236  507:invokestatic    #1397 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createUShort(int, ByteOrder)>
	//  237  510:astore          18
								ExifAttribute exifattribute2 = ExifAttribute.createULong(mOrfThumbnailOffset, mExifByteOrder);
	//  238  512:aload_0         
	//  239  513:getfield        #1657 <Field int mOrfThumbnailOffset>
	//  240  516:i2l             
	//  241  517:aload_0         
	//  242  518:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//  243  521:invokestatic    #1196 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createULong(long, ByteOrder)>
	//  244  524:astore          19
								ExifAttribute exifattribute3 = ExifAttribute.createULong(mOrfThumbnailLength, mExifByteOrder);
	//  245  526:aload_0         
	//  246  527:getfield        #1659 <Field int mOrfThumbnailLength>
	//  247  530:i2l             
	//  248  531:aload_0         
	//  249  532:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//  250  535:invokestatic    #1196 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createULong(long, ByteOrder)>
	//  251  538:astore          20
								mAttributes[4].put("Compression", ((Object) (exifattribute)));
	//  252  540:aload_0         
	//  253  541:getfield        #1146 <Field HashMap[] mAttributes>
	//  254  544:iconst_4        
	//  255  545:aaload          
	//  256  546:ldc2            #397 <String "Compression">
	//  257  549:aload           18
	//  258  551:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//  259  554:pop             
								mAttributes[4].put("JPEGInterchangeFormat", ((Object) (exifattribute2)));
	//  260  555:aload_0         
	//  261  556:getfield        #1146 <Field HashMap[] mAttributes>
	//  262  559:iconst_4        
	//  263  560:aaload          
	//  264  561:ldc2            #620 <String "JPEGInterchangeFormat">
	//  265  564:aload           19
	//  266  566:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//  267  569:pop             
								mAttributes[4].put("JPEGInterchangeFormatLength", ((Object) (exifattribute3)));
	//  268  570:aload_0         
	//  269  571:getfield        #1146 <Field HashMap[] mAttributes>
	//  270  574:iconst_4        
	//  271  575:aaload          
	//  272  576:ldc2            #623 <String "JPEGInterchangeFormatLength">
	//  273  579:aload           20
	//  274  581:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//  275  584:pop             
							}
						} else
	//* 276  585:goto            621
	//* 277  588:goto            621
	//* 278  591:goto            621
						if(j1 == 10 && "JpgFromRaw".equals(((Object) (((ExifTag) (obj)).name))))
	//* 279  594:iload           8
	//* 280  596:bipush          10
	//* 281  598:icmpne          621
	//* 282  601:ldc2            #720 <String "JpgFromRaw">
	//* 283  604:aload           17
	//* 284  606:getfield        #1124 <Field String ExifInterface$ExifTag.name>
	//* 285  609:invokevirtual   #1264 <Method boolean String.equals(Object)>
	//* 286  612:ifeq            621
							mRw2JpgFromRawOffset = k;
	//  287  615:aload_0         
	//  288  616:iload           4
	//  289  618:putfield        #1446 <Field int mRw2JpgFromRawOffset>
						long l5 = k;
	//  290  621:iload           4
	//  291  623:i2l             
	//  292  624:lstore          15
						j1 = byteordereddatainputstream.mLength;
	//  293  626:aload_1         
	//  294  627:getfield        #1633 <Field int ExifInterface$ByteOrderedDataInputStream.mLength>
	//  295  630:istore          8
						if(l5 + l2 <= (long)j1)
	//* 296  632:lload           15
	//* 297  634:lload           11
	//* 298  636:ladd            
	//* 299  637:iload           8
	//* 300  639:i2l             
	//* 301  640:lcmp            
	//* 302  641:ifgt            653
						{
							byteordereddatainputstream.seek(l5);
	//  303  644:aload_1         
	//  304  645:lload           15
	//  305  647:invokevirtual   #1301 <Method void ExifInterface$ByteOrderedDataInputStream.seek(long)>
						} else
	//* 306  650:goto            700
						{
							obj = ((Object) (new StringBuilder()));
	//  307  653:new             #1221 <Class StringBuilder>
	//  308  656:dup             
	//  309  657:invokespecial   #1222 <Method void StringBuilder()>
	//  310  660:astore          17
							((StringBuilder) (obj)).append("Skip the tag entry since data offset is invalid: ");
	//  311  662:aload           17
	//  312  664:ldc2            #1661 <String "Skip the tag entry since data offset is invalid: ">
	//  313  667:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//  314  670:pop             
							((StringBuilder) (obj)).append(k);
	//  315  671:aload           17
	//  316  673:iload           4
	//  317  675:invokevirtual   #1569 <Method StringBuilder StringBuilder.append(int)>
	//  318  678:pop             
							Log.w("ExifInterface", ((StringBuilder) (obj)).toString());
	//  319  679:ldc2            #364 <String "ExifInterface">
	//  320  682:aload           17
	//  321  684:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//  322  687:invokestatic    #1408 <Method int Log.w(String, String)>
	//  323  690:pop             
							byteordereddatainputstream.seek(l4);
	//  324  691:aload_1         
	//  325  692:lload           13
	//  326  694:invokevirtual   #1301 <Method void ExifInterface$ByteOrderedDataInputStream.seek(long)>
							break label3;
	//  327  697:goto            1144
						}
					}
					Integer integer = (Integer)sExifPointerTagMap.get(((Object) (Integer.valueOf(l1))));
	//  328  700:getstatic       #1075 <Field HashMap sExifPointerTagMap>
	//  329  703:iload           10
	//  330  705:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//  331  708:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//  332  711:checkcast       #891 <Class Integer>
	//  333  714:astore          18
					if(integer != null)
	//* 334  716:aload           18
	//* 335  718:ifnull          984
					{
						l2 = -1L;
	//  336  721:ldc2w           #1662 <Long -1L>
	//  337  724:lstore          11
						switch(j)
	//* 338  726:iload_3         
						{
	//* 339  727:lookupswitch    5: default 776
	//	               3: 808
	//	               4: 799
	//	               8: 789
	//	               9: 779
	//	               13: 779
	//* 340  776:goto            815
						case 9: // '\t'
						case 13: // '\r'
							l2 = byteordereddatainputstream.readInt();
	//  341  779:aload_1         
	//  342  780:invokevirtual   #1423 <Method int ExifInterface$ByteOrderedDataInputStream.readInt()>
	//  343  783:i2l             
	//  344  784:lstore          11
							break;

	//* 345  786:goto            815
						case 8: // '\b'
							l2 = byteordereddatainputstream.readShort();
	//  346  789:aload_1         
	//  347  790:invokevirtual   #1427 <Method short ExifInterface$ByteOrderedDataInputStream.readShort()>
	//  348  793:i2l             
	//  349  794:lstore          11
							break;

	//* 350  796:goto            815
						case 4: // '\004'
							l2 = byteordereddatainputstream.readUnsignedInt();
	//  351  799:aload_1         
	//  352  800:invokevirtual   #1666 <Method long ExifInterface$ByteOrderedDataInputStream.readUnsignedInt()>
	//  353  803:lstore          11
							break;

	//* 354  805:goto            815
						case 3: // '\003'
							l2 = byteordereddatainputstream.readUnsignedShort();
	//  355  808:aload_1         
	//  356  809:invokevirtual   #1309 <Method int ExifInterface$ByteOrderedDataInputStream.readUnsignedShort()>
	//  357  812:i2l             
	//  358  813:lstore          11
							break;
						}
						if(l2 > 0L && l2 < (long)byteordereddatainputstream.mLength)
	//* 359  815:lload           11
	//* 360  817:lconst_0        
	//* 361  818:lcmp            
	//* 362  819:ifle            937
	//* 363  822:lload           11
	//* 364  824:aload_1         
	//* 365  825:getfield        #1633 <Field int ExifInterface$ByteOrderedDataInputStream.mLength>
	//* 366  828:i2l             
	//* 367  829:lcmp            
	//* 368  830:ifge            937
						{
							if(!mAttributesOffsets.contains(((Object) (Integer.valueOf((int)l2)))))
	//* 369  833:aload_0         
	//* 370  834:getfield        #1151 <Field Set mAttributesOffsets>
	//* 371  837:lload           11
	//* 372  839:l2i             
	//* 373  840:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//* 374  843:invokeinterface #1668 <Method boolean Set.contains(Object)>
	//* 375  848:ifne            870
							{
								byteordereddatainputstream.seek(l2);
	//  376  851:aload_1         
	//  377  852:lload           11
	//  378  854:invokevirtual   #1301 <Method void ExifInterface$ByteOrderedDataInputStream.seek(long)>
								readImageFileDirectory(byteordereddatainputstream, integer.intValue());
	//  379  857:aload_0         
	//  380  858:aload_1         
	//  381  859:aload           18
	//  382  861:invokevirtual   #1463 <Method int Integer.intValue()>
	//  383  864:invokespecial   #1389 <Method void readImageFileDirectory(ExifInterface$ByteOrderedDataInputStream, int)>
							} else
	//* 384  867:goto            975
							{
								obj = ((Object) (new StringBuilder()));
	//  385  870:new             #1221 <Class StringBuilder>
	//  386  873:dup             
	//  387  874:invokespecial   #1222 <Method void StringBuilder()>
	//  388  877:astore          17
								((StringBuilder) (obj)).append("Skip jump into the IFD since it has already been read: IfdType ");
	//  389  879:aload           17
	//  390  881:ldc2            #1670 <String "Skip jump into the IFD since it has already been read: IfdType ">
	//  391  884:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//  392  887:pop             
								((StringBuilder) (obj)).append(((Object) (integer)));
	//  393  888:aload           17
	//  394  890:aload           18
	//  395  892:invokevirtual   #1673 <Method StringBuilder StringBuilder.append(Object)>
	//  396  895:pop             
								((StringBuilder) (obj)).append(" (at ");
	//  397  896:aload           17
	//  398  898:ldc2            #1675 <String " (at ">
	//  399  901:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//  400  904:pop             
								((StringBuilder) (obj)).append(l2);
	//  401  905:aload           17
	//  402  907:lload           11
	//  403  909:invokevirtual   #1226 <Method StringBuilder StringBuilder.append(long)>
	//  404  912:pop             
								((StringBuilder) (obj)).append(")");
	//  405  913:aload           17
	//  406  915:ldc2            #1677 <String ")">
	//  407  918:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//  408  921:pop             
								Log.w("ExifInterface", ((StringBuilder) (obj)).toString());
	//  409  922:ldc2            #364 <String "ExifInterface">
	//  410  925:aload           17
	//  411  927:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//  412  930:invokestatic    #1408 <Method int Log.w(String, String)>
	//  413  933:pop             
							}
						} else
	//* 414  934:goto            975
						{
							obj = ((Object) (new StringBuilder()));
	//  415  937:new             #1221 <Class StringBuilder>
	//  416  940:dup             
	//  417  941:invokespecial   #1222 <Method void StringBuilder()>
	//  418  944:astore          17
							((StringBuilder) (obj)).append("Skip jump into the IFD since its offset is invalid: ");
	//  419  946:aload           17
	//  420  948:ldc2            #1679 <String "Skip jump into the IFD since its offset is invalid: ">
	//  421  951:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//  422  954:pop             
							((StringBuilder) (obj)).append(l2);
	//  423  955:aload           17
	//  424  957:lload           11
	//  425  959:invokevirtual   #1226 <Method StringBuilder StringBuilder.append(long)>
	//  426  962:pop             
							Log.w("ExifInterface", ((StringBuilder) (obj)).toString());
	//  427  963:ldc2            #364 <String "ExifInterface">
	//  428  966:aload           17
	//  429  968:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//  430  971:invokestatic    #1408 <Method int Log.w(String, String)>
	//  431  974:pop             
						}
						byteordereddatainputstream.seek(l4);
	//  432  975:aload_1         
	//  433  976:lload           13
	//  434  978:invokevirtual   #1301 <Method void ExifInterface$ByteOrderedDataInputStream.seek(long)>
					} else
	//* 435  981:goto            1144
					{
						byte abyte0[] = new byte[(int)l2];
	//  436  984:lload           11
	//  437  986:l2i             
	//  438  987:newarray        byte[]
	//  439  989:astore          18
						byteordereddatainputstream.readFully(abyte0);
	//  440  991:aload_1         
	//  441  992:aload           18
	//  442  994:invokevirtual   #1381 <Method void ExifInterface$ByteOrderedDataInputStream.readFully(byte[])>
						ExifAttribute exifattribute1 = new ExifAttribute(j, l, abyte0);
	//  443  997:new             #12  <Class ExifInterface$ExifAttribute>
	//  444 1000:dup             
	//  445 1001:iload_3         
	//  446 1002:iload           7
	//  447 1004:aload           18
	//  448 1006:invokespecial   #1682 <Method void ExifInterface$ExifAttribute(int, int, byte[])>
	//  449 1009:astore          18
						mAttributes[i].put(((Object) (((ExifTag) (obj)).name)), ((Object) (exifattribute1)));
	//  450 1011:aload_0         
	//  451 1012:getfield        #1146 <Field HashMap[] mAttributes>
	//  452 1015:iload_2         
	//  453 1016:aaload          
	//  454 1017:aload           17
	//  455 1019:getfield        #1124 <Field String ExifInterface$ExifTag.name>
	//  456 1022:aload           18
	//  457 1024:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//  458 1027:pop             
						if("DNGVersion".equals(((Object) (((ExifTag) (obj)).name))))
	//* 459 1028:ldc2            #427 <String "DNGVersion">
	//* 460 1031:aload           17
	//* 461 1033:getfield        #1124 <Field String ExifInterface$ExifTag.name>
	//* 462 1036:invokevirtual   #1264 <Method boolean String.equals(Object)>
	//* 463 1039:ifeq            1047
							mMimeType = 3;
	//  464 1042:aload_0         
	//  465 1043:iconst_3        
	//  466 1044:putfield        #1441 <Field int mMimeType>
						if(("Make".equals(((Object) (((ExifTag) (obj)).name))) || "Model".equals(((Object) (((ExifTag) (obj)).name)))) && exifattribute1.getStringValue(mExifByteOrder).contains("PENTAX") || "Compression".equals(((Object) (((ExifTag) (obj)).name))) && exifattribute1.getIntValue(mExifByteOrder) == 65535)
	//* 467 1047:ldc2            #641 <String "Make">
	//* 468 1050:aload           17
	//* 469 1052:getfield        #1124 <Field String ExifInterface$ExifTag.name>
	//* 470 1055:invokevirtual   #1264 <Method boolean String.equals(Object)>
	//* 471 1058:ifne            1075
	//* 472 1061:ldc2            #653 <String "Model">
	//* 473 1064:aload           17
	//* 474 1066:getfield        #1124 <Field String ExifInterface$ExifTag.name>
	//* 475 1069:invokevirtual   #1264 <Method boolean String.equals(Object)>
	//* 476 1072:ifeq            1093
	//* 477 1075:aload           18
	//* 478 1077:aload_0         
	//* 479 1078:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//* 480 1081:invokevirtual   #1617 <Method String ExifInterface$ExifAttribute.getStringValue(ByteOrder)>
	//* 481 1084:ldc2            #306 <String "PENTAX">
	//* 482 1087:invokevirtual   #1452 <Method boolean String.contains(CharSequence)>
	//* 483 1090:ifne            1121
	//* 484 1093:ldc2            #397 <String "Compression">
	//* 485 1096:aload           17
	//* 486 1098:getfield        #1124 <Field String ExifInterface$ExifTag.name>
	//* 487 1101:invokevirtual   #1264 <Method boolean String.equals(Object)>
	//* 488 1104:ifeq            1127
	//* 489 1107:aload           18
	//* 490 1109:aload_0         
	//* 491 1110:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//* 492 1113:invokevirtual   #1495 <Method int ExifInterface$ExifAttribute.getIntValue(ByteOrder)>
	//* 493 1116:ldc1            #41  <Int 65535>
	//* 494 1118:icmpne          1127
							mMimeType = 8;
	//  495 1121:aload_0         
	//  496 1122:bipush          8
	//  497 1124:putfield        #1441 <Field int mMimeType>
						if((long)byteordereddatainputstream.peek() != l4)
	//* 498 1127:aload_1         
	//* 499 1128:invokevirtual   #1636 <Method int ExifInterface$ByteOrderedDataInputStream.peek()>
	//* 500 1131:i2l             
	//* 501 1132:lload           13
	//* 502 1134:lcmp            
	//* 503 1135:ifeq            1144
							byteordereddatainputstream.seek(l4);
	//  504 1138:aload_1         
	//  505 1139:lload           13
	//  506 1141:invokevirtual   #1301 <Method void ExifInterface$ByteOrderedDataInputStream.seek(long)>
					}
				}
				word1++;
	//  507 1144:iload           6
	//  508 1146:iconst_1        
	//  509 1147:iadd            
	//  510 1148:int2short       
	//  511 1149:istore          6
			} while(true);
	//  512 1151:goto            63
			if(byteordereddatainputstream.peek() + 4 <= byteordereddatainputstream.mLength)
	//* 513 1154:aload_1         
	//* 514 1155:invokevirtual   #1636 <Method int ExifInterface$ByteOrderedDataInputStream.peek()>
	//* 515 1158:iconst_4        
	//* 516 1159:iadd            
	//* 517 1160:aload_1         
	//* 518 1161:getfield        #1633 <Field int ExifInterface$ByteOrderedDataInputStream.mLength>
	//* 519 1164:icmpgt          1318
			{
				i = byteordereddatainputstream.readInt();
	//  520 1167:aload_1         
	//  521 1168:invokevirtual   #1423 <Method int ExifInterface$ByteOrderedDataInputStream.readInt()>
	//  522 1171:istore_2        
				long l3 = i;
	//  523 1172:iload_2         
	//  524 1173:i2l             
	//  525 1174:lstore          11
				if(l3 > 0L && i < byteordereddatainputstream.mLength)
	//* 526 1176:lload           11
	//* 527 1178:lconst_0        
	//* 528 1179:lcmp            
	//* 529 1180:ifle            1285
	//* 530 1183:iload_2         
	//* 531 1184:aload_1         
	//* 532 1185:getfield        #1633 <Field int ExifInterface$ByteOrderedDataInputStream.mLength>
	//* 533 1188:icmpge          1285
				{
					if(!mAttributesOffsets.contains(((Object) (Integer.valueOf(i)))))
	//* 534 1191:aload_0         
	//* 535 1192:getfield        #1151 <Field Set mAttributesOffsets>
	//* 536 1195:iload_2         
	//* 537 1196:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//* 538 1199:invokeinterface #1668 <Method boolean Set.contains(Object)>
	//* 539 1204:ifne            1251
					{
						byteordereddatainputstream.seek(l3);
	//  540 1207:aload_1         
	//  541 1208:lload           11
	//  542 1210:invokevirtual   #1301 <Method void ExifInterface$ByteOrderedDataInputStream.seek(long)>
						if(mAttributes[4].isEmpty())
	//* 543 1213:aload_0         
	//* 544 1214:getfield        #1146 <Field HashMap[] mAttributes>
	//* 545 1217:iconst_4        
	//* 546 1218:aaload          
	//* 547 1219:invokevirtual   #1685 <Method boolean HashMap.isEmpty()>
	//* 548 1222:ifeq            1232
						{
							readImageFileDirectory(byteordereddatainputstream, 4);
	//  549 1225:aload_0         
	//  550 1226:aload_1         
	//  551 1227:iconst_4        
	//  552 1228:invokespecial   #1389 <Method void readImageFileDirectory(ExifInterface$ByteOrderedDataInputStream, int)>
							return;
	//  553 1231:return          
						}
						if(mAttributes[5].isEmpty())
	//* 554 1232:aload_0         
	//* 555 1233:getfield        #1146 <Field HashMap[] mAttributes>
	//* 556 1236:iconst_5        
	//* 557 1237:aaload          
	//* 558 1238:invokevirtual   #1685 <Method boolean HashMap.isEmpty()>
	//* 559 1241:ifeq            1318
						{
							readImageFileDirectory(byteordereddatainputstream, 5);
	//  560 1244:aload_0         
	//  561 1245:aload_1         
	//  562 1246:iconst_5        
	//  563 1247:invokespecial   #1389 <Method void readImageFileDirectory(ExifInterface$ByteOrderedDataInputStream, int)>
							return;
	//  564 1250:return          
						}
					} else
					{
						byteordereddatainputstream = ((ByteOrderedDataInputStream) (new StringBuilder()));
	//  565 1251:new             #1221 <Class StringBuilder>
	//  566 1254:dup             
	//  567 1255:invokespecial   #1222 <Method void StringBuilder()>
	//  568 1258:astore_1        
						((StringBuilder) (byteordereddatainputstream)).append("Stop reading file since re-reading an IFD may cause an infinite loop: ");
	//  569 1259:aload_1         
	//  570 1260:ldc2            #1687 <String "Stop reading file since re-reading an IFD may cause an infinite loop: ">
	//  571 1263:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//  572 1266:pop             
						((StringBuilder) (byteordereddatainputstream)).append(i);
	//  573 1267:aload_1         
	//  574 1268:iload_2         
	//  575 1269:invokevirtual   #1569 <Method StringBuilder StringBuilder.append(int)>
	//  576 1272:pop             
						Log.w("ExifInterface", ((StringBuilder) (byteordereddatainputstream)).toString());
	//  577 1273:ldc2            #364 <String "ExifInterface">
	//  578 1276:aload_1         
	//  579 1277:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//  580 1280:invokestatic    #1408 <Method int Log.w(String, String)>
	//  581 1283:pop             
						return;
	//  582 1284:return          
					}
				} else
				{
					byteordereddatainputstream = ((ByteOrderedDataInputStream) (new StringBuilder()));
	//  583 1285:new             #1221 <Class StringBuilder>
	//  584 1288:dup             
	//  585 1289:invokespecial   #1222 <Method void StringBuilder()>
	//  586 1292:astore_1        
					((StringBuilder) (byteordereddatainputstream)).append("Stop reading file since a wrong offset may cause an infinite loop: ");
	//  587 1293:aload_1         
	//  588 1294:ldc2            #1689 <String "Stop reading file since a wrong offset may cause an infinite loop: ">
	//  589 1297:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//  590 1300:pop             
					((StringBuilder) (byteordereddatainputstream)).append(i);
	//  591 1301:aload_1         
	//  592 1302:iload_2         
	//  593 1303:invokevirtual   #1569 <Method StringBuilder StringBuilder.append(int)>
	//  594 1306:pop             
					Log.w("ExifInterface", ((StringBuilder) (byteordereddatainputstream)).toString());
	//  595 1307:ldc2            #364 <String "ExifInterface">
	//  596 1310:aload_1         
	//  597 1311:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//  598 1314:invokestatic    #1408 <Method int Log.w(String, String)>
	//  599 1317:pop             
				}
			}
			return;
	//  600 1318:return          
		}
	//  601 1319:return          
	}

	private void removeAttribute(String s)
	{
		for(int i = 0; i < EXIF_TAGS.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:getstatic       #1052 <Field ExifInterface$ExifTag[][] EXIF_TAGS>
	//*   4    6:arraylength     
	//*   5    7:icmpge          28
			mAttributes[i].remove(((Object) (s)));
	//    6   10:aload_0         
	//    7   11:getfield        #1146 <Field HashMap[] mAttributes>
	//    8   14:iload_2         
	//    9   15:aaload          
	//   10   16:aload_1         
	//   11   17:invokevirtual   #1693 <Method Object HashMap.remove(Object)>
	//   12   20:pop             

	//   13   21:iload_2         
	//   14   22:iconst_1        
	//   15   23:iadd            
	//   16   24:istore_2        
	//*  17   25:goto            2
	//   18   28:return          
	}

	private void retrieveJpegImageSize(ByteOrderedDataInputStream byteordereddatainputstream, int i)
		throws IOException
	{
		ExifAttribute exifattribute = (ExifAttribute)mAttributes[i].get("ImageLength");
	//    0    0:aload_0         
	//    1    1:getfield        #1146 <Field HashMap[] mAttributes>
	//    2    4:iload_2         
	//    3    5:aaload          
	//    4    6:ldc2            #592 <String "ImageLength">
	//    5    9:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//    6   12:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//    7   15:astore_3        
		ExifAttribute exifattribute2 = (ExifAttribute)mAttributes[i].get("ImageWidth");
	//    8   16:aload_0         
	//    9   17:getfield        #1146 <Field HashMap[] mAttributes>
	//   10   20:iload_2         
	//   11   21:aaload          
	//   12   22:ldc2            #598 <String "ImageWidth">
	//   13   25:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//   14   28:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//   15   31:astore          4
		if(exifattribute == null || exifattribute2 == null)
	//*  16   33:aload_3         
	//*  17   34:ifnull          42
	//*  18   37:aload           4
	//*  19   39:ifnonnull       76
		{
			ExifAttribute exifattribute1 = (ExifAttribute)mAttributes[i].get("JPEGInterchangeFormat");
	//   20   42:aload_0         
	//   21   43:getfield        #1146 <Field HashMap[] mAttributes>
	//   22   46:iload_2         
	//   23   47:aaload          
	//   24   48:ldc2            #620 <String "JPEGInterchangeFormat">
	//   25   51:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//   26   54:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//   27   57:astore_3        
			if(exifattribute1 != null)
	//*  28   58:aload_3         
	//*  29   59:ifnull          76
				getJpegAttributes(byteordereddatainputstream, exifattribute1.getIntValue(mExifByteOrder), i);
	//   30   62:aload_0         
	//   31   63:aload_1         
	//   32   64:aload_3         
	//   33   65:aload_0         
	//   34   66:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   35   69:invokevirtual   #1495 <Method int ExifInterface$ExifAttribute.getIntValue(ByteOrder)>
	//   36   72:iload_2         
	//   37   73:invokespecial   #1420 <Method void getJpegAttributes(ExifInterface$ByteOrderedDataInputStream, int, int)>
		}
	//   38   76:return          
	}

	private void saveJpegAttributes(InputStream inputstream, OutputStream outputstream)
		throws IOException
	{
		inputstream = ((InputStream) (new DataInputStream(inputstream)));
	//    0    0:new             #1698 <Class DataInputStream>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #1699 <Method void DataInputStream(InputStream)>
	//    4    8:astore_1        
		outputstream = ((OutputStream) (new ByteOrderedDataOutputStream(outputstream, ByteOrder.BIG_ENDIAN)));
	//    5    9:new             #9   <Class ExifInterface$ByteOrderedDataOutputStream>
	//    6   12:dup             
	//    7   13:aload_2         
	//    8   14:getstatic       #1156 <Field ByteOrder ByteOrder.BIG_ENDIAN>
	//    9   17:invokespecial   #1702 <Method void ExifInterface$ByteOrderedDataOutputStream(OutputStream, ByteOrder)>
	//   10   20:astore_2        
		if(((DataInputStream) (inputstream)).readByte() != -1) goto _L2; else goto _L1
	//   11   21:aload_1         
	//   12   22:invokevirtual   #1703 <Method byte DataInputStream.readByte()>
	//   13   25:iconst_m1       
	//   14   26:icmpne          417
_L1:
		((ByteOrderedDataOutputStream) (outputstream)).writeByte(-1);
	//   15   29:aload_2         
	//   16   30:iconst_m1       
	//   17   31:invokevirtual   #1706 <Method void ExifInterface$ByteOrderedDataOutputStream.writeByte(int)>
		if(((DataInputStream) (inputstream)).readByte() != -40) goto _L4; else goto _L3
	//   18   34:aload_1         
	//   19   35:invokevirtual   #1703 <Method byte DataInputStream.readByte()>
	//   20   38:bipush          -40
	//   21   40:icmpne          406
_L3:
		byte abyte0[];
		((ByteOrderedDataOutputStream) (outputstream)).writeByte(-40);
	//   22   43:aload_2         
	//   23   44:bipush          -40
	//   24   46:invokevirtual   #1706 <Method void ExifInterface$ByteOrderedDataOutputStream.writeByte(int)>
		((ByteOrderedDataOutputStream) (outputstream)).writeByte(-1);
	//   25   49:aload_2         
	//   26   50:iconst_m1       
	//   27   51:invokevirtual   #1706 <Method void ExifInterface$ByteOrderedDataOutputStream.writeByte(int)>
		((ByteOrderedDataOutputStream) (outputstream)).writeByte(-31);
	//   28   54:aload_2         
	//   29   55:bipush          -31
	//   30   57:invokevirtual   #1706 <Method void ExifInterface$ByteOrderedDataOutputStream.writeByte(int)>
		writeExifSegment(((ByteOrderedDataOutputStream) (outputstream)), 6);
	//   31   60:aload_0         
	//   32   61:aload_2         
	//   33   62:bipush          6
	//   34   64:invokespecial   #1710 <Method int writeExifSegment(ExifInterface$ByteOrderedDataOutputStream, int)>
	//   35   67:pop             
		abyte0 = new byte[4096];
	//   36   68:sipush          4096
	//   37   71:newarray        byte[]
	//   38   73:astore          5
_L14:
		if(((DataInputStream) (inputstream)).readByte() != -1) goto _L6; else goto _L5
	//   39   75:aload_1         
	//   40   76:invokevirtual   #1703 <Method byte DataInputStream.readByte()>
	//   41   79:iconst_m1       
	//   42   80:icmpne          395
_L5:
		int i = ((int) (((DataInputStream) (inputstream)).readByte()));
	//   43   83:aload_1         
	//   44   84:invokevirtual   #1703 <Method byte DataInputStream.readByte()>
	//   45   87:istore_3        
		if(i == -31) goto _L8; else goto _L7
	//   46   88:iload_3         
	//   47   89:bipush          -31
	//   48   91:icmpeq          214
_L7:
		i;
	//   49   94:iload_3         
		JVM INSTR tableswitch -39 -38: default 116
	//	               -39 197
	//	               -38 197;
	//   50   95:tableswitch     -39 -38: default 116
	//	               -39 197
	//	               -38 197
		   goto _L9 _L10 _L10
_L9:
		((ByteOrderedDataOutputStream) (outputstream)).writeByte(-1);
	//   51  116:aload_2         
	//   52  117:iconst_m1       
	//   53  118:invokevirtual   #1706 <Method void ExifInterface$ByteOrderedDataOutputStream.writeByte(int)>
		((ByteOrderedDataOutputStream) (outputstream)).writeByte(i);
	//   54  121:aload_2         
	//   55  122:iload_3         
	//   56  123:invokevirtual   #1706 <Method void ExifInterface$ByteOrderedDataOutputStream.writeByte(int)>
		i = ((DataInputStream) (inputstream)).readUnsignedShort();
	//   57  126:aload_1         
	//   58  127:invokevirtual   #1711 <Method int DataInputStream.readUnsignedShort()>
	//   59  130:istore_3        
		((ByteOrderedDataOutputStream) (outputstream)).writeUnsignedShort(i);
	//   60  131:aload_2         
	//   61  132:iload_3         
	//   62  133:invokevirtual   #1714 <Method void ExifInterface$ByteOrderedDataOutputStream.writeUnsignedShort(int)>
		i -= 2;
	//   63  136:iload_3         
	//   64  137:iconst_2        
	//   65  138:isub            
	//   66  139:istore_3        
		if(i < 0) goto _L12; else goto _L11
	//   67  140:iload_3         
	//   68  141:iflt            186
_L11:
		if(i <= 0) goto _L14; else goto _L13
	//   69  144:iload_3         
	//   70  145:ifle            75
_L13:
		int j = ((DataInputStream) (inputstream)).read(abyte0, 0, Math.min(i, abyte0.length));
	//   71  148:aload_1         
	//   72  149:aload           5
	//   73  151:iconst_0        
	//   74  152:iload_3         
	//   75  153:aload           5
	//   76  155:arraylength     
	//   77  156:invokestatic    #1499 <Method int Math.min(int, int)>
	//   78  159:invokevirtual   #1717 <Method int DataInputStream.read(byte[], int, int)>
	//   79  162:istore          4
		if(j < 0) goto _L14; else goto _L15
	//   80  164:iload           4
	//   81  166:iflt            75
_L15:
		((ByteOrderedDataOutputStream) (outputstream)).write(abyte0, 0, j);
	//   82  169:aload_2         
	//   83  170:aload           5
	//   84  172:iconst_0        
	//   85  173:iload           4
	//   86  175:invokevirtual   #1718 <Method void ExifInterface$ByteOrderedDataOutputStream.write(byte[], int, int)>
		i -= j;
	//   87  178:iload_3         
	//   88  179:iload           4
	//   89  181:isub            
	//   90  182:istore_3        
		  goto _L11
	//*  91  183:goto            144
_L12:
		throw new IOException("Invalid length");
	//   92  186:new             #1142 <Class IOException>
	//   93  189:dup             
	//   94  190:ldc2            #1335 <String "Invalid length">
	//   95  193:invokespecial   #1316 <Method void IOException(String)>
	//   96  196:athrow          
_L10:
		((ByteOrderedDataOutputStream) (outputstream)).writeByte(-1);
	//   97  197:aload_2         
	//   98  198:iconst_m1       
	//   99  199:invokevirtual   #1706 <Method void ExifInterface$ByteOrderedDataOutputStream.writeByte(int)>
		((ByteOrderedDataOutputStream) (outputstream)).writeByte(i);
	//  100  202:aload_2         
	//  101  203:iload_3         
	//  102  204:invokevirtual   #1706 <Method void ExifInterface$ByteOrderedDataOutputStream.writeByte(int)>
		copy(inputstream, outputstream);
	//  103  207:aload_1         
	//  104  208:aload_2         
	//  105  209:invokestatic    #1720 <Method int copy(InputStream, OutputStream)>
	//  106  212:pop             
		return;
	//  107  213:return          
_L8:
		j = ((DataInputStream) (inputstream)).readUnsignedShort() - 2;
	//  108  214:aload_1         
	//  109  215:invokevirtual   #1711 <Method int DataInputStream.readUnsignedShort()>
	//  110  218:iconst_2        
	//  111  219:isub            
	//  112  220:istore          4
		if(j < 0) goto _L17; else goto _L16
	//  113  222:iload           4
	//  114  224:iflt            384
_L16:
		byte abyte1[] = new byte[6];
	//  115  227:bipush          6
	//  116  229:newarray        byte[]
	//  117  231:astore          6
		if(j < 6) goto _L19; else goto _L18
	//  118  233:iload           4
	//  119  235:bipush          6
	//  120  237:icmplt          302
_L18:
		if(((DataInputStream) (inputstream)).read(abyte1) != 6) goto _L21; else goto _L20
	//  121  240:aload_1         
	//  122  241:aload           6
	//  123  243:invokevirtual   #1721 <Method int DataInputStream.read(byte[])>
	//  124  246:bipush          6
	//  125  248:icmpne          291
_L20:
		if(!Arrays.equals(abyte1, IDENTIFIER_EXIF_APP1)) goto _L19; else goto _L22
	//  126  251:aload           6
	//  127  253:getstatic       #1093 <Field byte[] IDENTIFIER_EXIF_APP1>
	//  128  256:invokestatic    #1325 <Method boolean Arrays.equals(byte[], byte[])>
	//  129  259:ifeq            302
_L22:
		i = j - 6;
	//  130  262:iload           4
	//  131  264:bipush          6
	//  132  266:isub            
	//  133  267:istore_3        
		if(((DataInputStream) (inputstream)).skipBytes(i) != i)
	//* 134  268:aload_1         
	//* 135  269:iload_3         
	//* 136  270:invokevirtual   #1722 <Method int DataInputStream.skipBytes(int)>
	//* 137  273:iload_3         
	//* 138  274:icmpne          280
	//* 139  277:goto            75
			throw new IOException("Invalid length");
	//  140  280:new             #1142 <Class IOException>
	//  141  283:dup             
	//  142  284:ldc2            #1335 <String "Invalid length">
	//  143  287:invokespecial   #1316 <Method void IOException(String)>
	//  144  290:athrow          
		  goto _L14
_L21:
		throw new IOException("Invalid exif");
	//  145  291:new             #1142 <Class IOException>
	//  146  294:dup             
	//  147  295:ldc2            #1322 <String "Invalid exif">
	//  148  298:invokespecial   #1316 <Method void IOException(String)>
	//  149  301:athrow          
_L19:
		((ByteOrderedDataOutputStream) (outputstream)).writeByte(-1);
	//  150  302:aload_2         
	//  151  303:iconst_m1       
	//  152  304:invokevirtual   #1706 <Method void ExifInterface$ByteOrderedDataOutputStream.writeByte(int)>
		((ByteOrderedDataOutputStream) (outputstream)).writeByte(i);
	//  153  307:aload_2         
	//  154  308:iload_3         
	//  155  309:invokevirtual   #1706 <Method void ExifInterface$ByteOrderedDataOutputStream.writeByte(int)>
		((ByteOrderedDataOutputStream) (outputstream)).writeUnsignedShort(j + 2);
	//  156  312:aload_2         
	//  157  313:iload           4
	//  158  315:iconst_2        
	//  159  316:iadd            
	//  160  317:invokevirtual   #1714 <Method void ExifInterface$ByteOrderedDataOutputStream.writeUnsignedShort(int)>
		i = j;
	//  161  320:iload           4
	//  162  322:istore_3        
		if(j >= 6)
	//* 163  323:iload           4
	//* 164  325:bipush          6
	//* 165  327:icmplt          342
		{
			i = j - 6;
	//  166  330:iload           4
	//  167  332:bipush          6
	//  168  334:isub            
	//  169  335:istore_3        
			((ByteOrderedDataOutputStream) (outputstream)).write(abyte1);
	//  170  336:aload_2         
	//  171  337:aload           6
	//  172  339:invokevirtual   #1724 <Method void ExifInterface$ByteOrderedDataOutputStream.write(byte[])>
		}
_L25:
		if(i <= 0) goto _L14; else goto _L23
	//  173  342:iload_3         
	//  174  343:ifle            75
_L23:
		j = ((DataInputStream) (inputstream)).read(abyte0, 0, Math.min(i, abyte0.length));
	//  175  346:aload_1         
	//  176  347:aload           5
	//  177  349:iconst_0        
	//  178  350:iload_3         
	//  179  351:aload           5
	//  180  353:arraylength     
	//  181  354:invokestatic    #1499 <Method int Math.min(int, int)>
	//  182  357:invokevirtual   #1717 <Method int DataInputStream.read(byte[], int, int)>
	//  183  360:istore          4
		if(j < 0) goto _L14; else goto _L24
	//  184  362:iload           4
	//  185  364:iflt            75
_L24:
		((ByteOrderedDataOutputStream) (outputstream)).write(abyte0, 0, j);
	//  186  367:aload_2         
	//  187  368:aload           5
	//  188  370:iconst_0        
	//  189  371:iload           4
	//  190  373:invokevirtual   #1718 <Method void ExifInterface$ByteOrderedDataOutputStream.write(byte[], int, int)>
		i -= j;
	//  191  376:iload_3         
	//  192  377:iload           4
	//  193  379:isub            
	//  194  380:istore_3        
		  goto _L25
	//* 195  381:goto            342
_L17:
		throw new IOException("Invalid length");
	//  196  384:new             #1142 <Class IOException>
	//  197  387:dup             
	//  198  388:ldc2            #1335 <String "Invalid length">
	//  199  391:invokespecial   #1316 <Method void IOException(String)>
	//  200  394:athrow          
_L6:
		throw new IOException("Invalid marker");
	//  201  395:new             #1142 <Class IOException>
	//  202  398:dup             
	//  203  399:ldc2            #1726 <String "Invalid marker">
	//  204  402:invokespecial   #1316 <Method void IOException(String)>
	//  205  405:athrow          
_L4:
		throw new IOException("Invalid marker");
	//  206  406:new             #1142 <Class IOException>
	//  207  409:dup             
	//  208  410:ldc2            #1726 <String "Invalid marker">
	//  209  413:invokespecial   #1316 <Method void IOException(String)>
	//  210  416:athrow          
_L2:
		throw new IOException("Invalid marker");
	//  211  417:new             #1142 <Class IOException>
	//  212  420:dup             
	//  213  421:ldc2            #1726 <String "Invalid marker">
	//  214  424:invokespecial   #1316 <Method void IOException(String)>
	//  215  427:athrow          
	}

	private void setThumbnailData(ByteOrderedDataInputStream byteordereddatainputstream)
		throws IOException
	{
		HashMap hashmap = mAttributes[4];
	//    0    0:aload_0         
	//    1    1:getfield        #1146 <Field HashMap[] mAttributes>
	//    2    4:iconst_4        
	//    3    5:aaload          
	//    4    6:astore_3        
		ExifAttribute exifattribute = (ExifAttribute)hashmap.get("Compression");
	//    5    7:aload_3         
	//    6    8:ldc2            #397 <String "Compression">
	//    7   11:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//    8   14:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//    9   17:astore          4
		if(exifattribute != null)
	//*  10   19:aload           4
	//*  11   21:ifnull          95
		{
			mThumbnailCompression = exifattribute.getIntValue(mExifByteOrder);
	//   12   24:aload_0         
	//   13   25:aload           4
	//   14   27:aload_0         
	//   15   28:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   16   31:invokevirtual   #1495 <Method int ExifInterface$ExifAttribute.getIntValue(ByteOrder)>
	//   17   34:putfield        #1728 <Field int mThumbnailCompression>
			int i = mThumbnailCompression;
	//   18   37:aload_0         
	//   19   38:getfield        #1728 <Field int mThumbnailCompression>
	//   20   41:istore_2        
			if(i != 1)
	//*  21   42:iload_2         
	//*  22   43:iconst_1        
	//*  23   44:icmpeq          80
				switch(i)
	//*  24   47:iload_2         
				{
	//*  25   48:tableswitch     6 7: default 72
	//	               6 73
	//	               7 80
				default:
					return;
	//   26   72:return          

				case 6: // '\006'
					handleThumbnailFromJfif(byteordereddatainputstream, hashmap);
	//   27   73:aload_0         
	//   28   74:aload_1         
	//   29   75:aload_3         
	//   30   76:invokespecial   #1730 <Method void handleThumbnailFromJfif(ExifInterface$ByteOrderedDataInputStream, HashMap)>
					return;
	//   31   79:return          

				case 7: // '\007'
					break;
				}
			if(isSupportedDataType(hashmap))
	//*  32   80:aload_0         
	//*  33   81:aload_3         
	//*  34   82:invokespecial   #1732 <Method boolean isSupportedDataType(HashMap)>
	//*  35   85:ifeq            107
			{
				handleThumbnailFromStrips(byteordereddatainputstream, hashmap);
	//   36   88:aload_0         
	//   37   89:aload_1         
	//   38   90:aload_3         
	//   39   91:invokespecial   #1734 <Method void handleThumbnailFromStrips(ExifInterface$ByteOrderedDataInputStream, HashMap)>
				return;
	//   40   94:return          
			}
		} else
		{
			mThumbnailCompression = 6;
	//   41   95:aload_0         
	//   42   96:bipush          6
	//   43   98:putfield        #1728 <Field int mThumbnailCompression>
			handleThumbnailFromJfif(byteordereddatainputstream, hashmap);
	//   44  101:aload_0         
	//   45  102:aload_1         
	//   46  103:aload_3         
	//   47  104:invokespecial   #1730 <Method void handleThumbnailFromJfif(ExifInterface$ByteOrderedDataInputStream, HashMap)>
		}
	//   48  107:return          
	}

	private void swapBasedOnImageSize(int i, int j)
		throws IOException
	{
		if(!mAttributes[i].isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #1146 <Field HashMap[] mAttributes>
	//*   2    4:iload_1         
	//*   3    5:aaload          
	//*   4    6:invokevirtual   #1685 <Method boolean HashMap.isEmpty()>
	//*   5    9:ifne            198
		{
			if(mAttributes[j].isEmpty())
	//*   6   12:aload_0         
	//*   7   13:getfield        #1146 <Field HashMap[] mAttributes>
	//*   8   16:iload_2         
	//*   9   17:aaload          
	//*  10   18:invokevirtual   #1685 <Method boolean HashMap.isEmpty()>
	//*  11   21:ifeq            25
				return;
	//   12   24:return          
			ExifAttribute exifattribute = (ExifAttribute)mAttributes[i].get("ImageLength");
	//   13   25:aload_0         
	//   14   26:getfield        #1146 <Field HashMap[] mAttributes>
	//   15   29:iload_1         
	//   16   30:aaload          
	//   17   31:ldc2            #592 <String "ImageLength">
	//   18   34:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//   19   37:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//   20   40:astore          7
			ExifAttribute exifattribute1 = (ExifAttribute)mAttributes[i].get("ImageWidth");
	//   21   42:aload_0         
	//   22   43:getfield        #1146 <Field HashMap[] mAttributes>
	//   23   46:iload_1         
	//   24   47:aaload          
	//   25   48:ldc2            #598 <String "ImageWidth">
	//   26   51:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//   27   54:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//   28   57:astore          8
			ExifAttribute exifattribute2 = (ExifAttribute)mAttributes[j].get("ImageLength");
	//   29   59:aload_0         
	//   30   60:getfield        #1146 <Field HashMap[] mAttributes>
	//   31   63:iload_2         
	//   32   64:aaload          
	//   33   65:ldc2            #592 <String "ImageLength">
	//   34   68:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//   35   71:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//   36   74:astore          9
			ExifAttribute exifattribute3 = (ExifAttribute)mAttributes[j].get("ImageWidth");
	//   37   76:aload_0         
	//   38   77:getfield        #1146 <Field HashMap[] mAttributes>
	//   39   80:iload_2         
	//   40   81:aaload          
	//   41   82:ldc2            #598 <String "ImageWidth">
	//   42   85:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//   43   88:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//   44   91:astore          10
			if(exifattribute != null)
	//*  45   93:aload           7
	//*  46   95:ifnull          197
			{
				if(exifattribute1 == null)
	//*  47   98:aload           8
	//*  48  100:ifnonnull       104
					return;
	//   49  103:return          
				if(exifattribute2 != null)
	//*  50  104:aload           9
	//*  51  106:ifnull          197
				{
					if(exifattribute3 == null)
	//*  52  109:aload           10
	//*  53  111:ifnonnull       115
						return;
	//   54  114:return          
					int k = exifattribute.getIntValue(mExifByteOrder);
	//   55  115:aload           7
	//   56  117:aload_0         
	//   57  118:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   58  121:invokevirtual   #1495 <Method int ExifInterface$ExifAttribute.getIntValue(ByteOrder)>
	//   59  124:istore_3        
					int l = exifattribute1.getIntValue(mExifByteOrder);
	//   60  125:aload           8
	//   61  127:aload_0         
	//   62  128:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   63  131:invokevirtual   #1495 <Method int ExifInterface$ExifAttribute.getIntValue(ByteOrder)>
	//   64  134:istore          4
					int i1 = exifattribute2.getIntValue(mExifByteOrder);
	//   65  136:aload           9
	//   66  138:aload_0         
	//   67  139:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   68  142:invokevirtual   #1495 <Method int ExifInterface$ExifAttribute.getIntValue(ByteOrder)>
	//   69  145:istore          5
					int j1 = exifattribute3.getIntValue(mExifByteOrder);
	//   70  147:aload           10
	//   71  149:aload_0         
	//   72  150:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   73  153:invokevirtual   #1495 <Method int ExifInterface$ExifAttribute.getIntValue(ByteOrder)>
	//   74  156:istore          6
					if(k < i1 && l < j1)
	//*  75  158:iload_3         
	//*  76  159:iload           5
	//*  77  161:icmpge          197
	//*  78  164:iload           4
	//*  79  166:iload           6
	//*  80  168:icmpge          197
					{
						HashMap ahashmap[] = mAttributes;
	//   81  171:aload_0         
	//   82  172:getfield        #1146 <Field HashMap[] mAttributes>
	//   83  175:astore          7
						HashMap hashmap = ahashmap[i];
	//   84  177:aload           7
	//   85  179:iload_1         
	//   86  180:aaload          
	//   87  181:astore          8
						ahashmap[i] = ahashmap[j];
	//   88  183:aload           7
	//   89  185:iload_1         
	//   90  186:aload           7
	//   91  188:iload_2         
	//   92  189:aaload          
	//   93  190:aastore         
						ahashmap[j] = hashmap;
	//   94  191:aload           7
	//   95  193:iload_2         
	//   96  194:aload           8
	//   97  196:aastore         
					}
				}
			}
			return;
	//   98  197:return          
		} else
		{
			return;
	//   99  198:return          
		}
	}

	private boolean updateAttribute(String s, ExifAttribute exifattribute)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag = false;
	//    2    2:iconst_0        
	//    3    3:istore          4
		for(; i < EXIF_TAGS.length; i++)
	//*   4    5:iload_3         
	//*   5    6:getstatic       #1052 <Field ExifInterface$ExifTag[][] EXIF_TAGS>
	//*   6    9:arraylength     
	//*   7   10:icmpge          48
			if(mAttributes[i].containsKey(((Object) (s))))
	//*   8   13:aload_0         
	//*   9   14:getfield        #1146 <Field HashMap[] mAttributes>
	//*  10   17:iload_3         
	//*  11   18:aaload          
	//*  12   19:aload_1         
	//*  13   20:invokevirtual   #1741 <Method boolean HashMap.containsKey(Object)>
	//*  14   23:ifeq            41
			{
				mAttributes[i].put(((Object) (s)), ((Object) (exifattribute)));
	//   15   26:aload_0         
	//   16   27:getfield        #1146 <Field HashMap[] mAttributes>
	//   17   30:iload_3         
	//   18   31:aaload          
	//   19   32:aload_1         
	//   20   33:aload_2         
	//   21   34:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//   22   37:pop             
				flag = true;
	//   23   38:iconst_1        
	//   24   39:istore          4
			}

	//   25   41:iload_3         
	//   26   42:iconst_1        
	//   27   43:iadd            
	//   28   44:istore_3        
	//*  29   45:goto            5
		return flag;
	//   30   48:iload           4
	//   31   50:ireturn         
	}

	private void updateImageSizeValues(ByteOrderedDataInputStream byteordereddatainputstream, int i)
		throws IOException
	{
		ExifAttribute exifattribute1;
		ExifAttribute exifattribute2;
		ExifAttribute exifattribute3;
		ExifAttribute exifattribute4;
label0:
		{
			int ai[];
label1:
			{
				ai = ((int []) ((ExifAttribute)mAttributes[i].get("DefaultCropSize")));
	//    0    0:aload_0         
	//    1    1:getfield        #1146 <Field HashMap[] mAttributes>
	//    2    4:iload_2         
	//    3    5:aaload          
	//    4    6:ldc2            #418 <String "DefaultCropSize">
	//    5    9:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//    6   12:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//    7   15:astore          7
				exifattribute1 = (ExifAttribute)mAttributes[i].get("SensorTopBorder");
	//    8   17:aload_0         
	//    9   18:getfield        #1146 <Field HashMap[] mAttributes>
	//   10   21:iload_2         
	//   11   22:aaload          
	//   12   23:ldc2            #732 <String "SensorTopBorder">
	//   13   26:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//   14   29:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//   15   32:astore          8
				exifattribute2 = (ExifAttribute)mAttributes[i].get("SensorLeftBorder");
	//   16   34:aload_0         
	//   17   35:getfield        #1146 <Field HashMap[] mAttributes>
	//   18   38:iload_2         
	//   19   39:aaload          
	//   20   40:ldc2            #726 <String "SensorLeftBorder">
	//   21   43:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//   22   46:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//   23   49:astore          9
				exifattribute3 = (ExifAttribute)mAttributes[i].get("SensorBottomBorder");
	//   24   51:aload_0         
	//   25   52:getfield        #1146 <Field HashMap[] mAttributes>
	//   26   55:iload_2         
	//   27   56:aaload          
	//   28   57:ldc2            #723 <String "SensorBottomBorder">
	//   29   60:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//   30   63:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//   31   66:astore          10
				exifattribute4 = (ExifAttribute)mAttributes[i].get("SensorRightBorder");
	//   32   68:aload_0         
	//   33   69:getfield        #1146 <Field HashMap[] mAttributes>
	//   34   72:iload_2         
	//   35   73:aaload          
	//   36   74:ldc2            #729 <String "SensorRightBorder">
	//   37   77:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//   38   80:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//   39   83:astore          11
				if(ai == null)
					break label0;
	//   40   85:aload           7
	//   41   87:ifnull          316
				if(((ExifAttribute) (ai)).format == 5)
	//*  42   90:aload           7
	//*  43   92:getfield        #1744 <Field int ExifInterface$ExifAttribute.format>
	//*  44   95:iconst_5        
	//*  45   96:icmpne          194
				{
					ai = ((int []) ((Rational[])((ExifAttribute) (ai)).getValue(mExifByteOrder)));
	//   46   99:aload           7
	//   47  101:aload_0         
	//   48  102:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   49  105:invokevirtual   #1393 <Method Object ExifInterface$ExifAttribute.getValue(ByteOrder)>
	//   50  108:checkcast       #1746 <Class ExifInterface$Rational[]>
	//   51  111:astore          7
					if(ai != null && ai.length == 2)
	//*  52  113:aload           7
	//*  53  115:ifnull          156
	//*  54  118:aload           7
	//*  55  120:arraylength     
	//*  56  121:iconst_2        
	//*  57  122:icmpeq          128
	//*  58  125:goto            156
					{
						byteordereddatainputstream = ((ByteOrderedDataInputStream) (ExifAttribute.createURational(((Rational) (ai[0])), mExifByteOrder)));
	//   59  128:aload           7
	//   60  130:iconst_0        
	//   61  131:aaload          
	//   62  132:aload_0         
	//   63  133:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   64  136:invokestatic    #1750 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createURational(ExifInterface$Rational, ByteOrder)>
	//   65  139:astore_1        
						ai = ((int []) (ExifAttribute.createURational(((Rational) (ai[1])), mExifByteOrder)));
	//   66  140:aload           7
	//   67  142:iconst_1        
	//   68  143:aaload          
	//   69  144:aload_0         
	//   70  145:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   71  148:invokestatic    #1750 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createURational(ExifInterface$Rational, ByteOrder)>
	//   72  151:astore          7
					} else
	//*  73  153:goto            248
					{
						byteordereddatainputstream = ((ByteOrderedDataInputStream) (new StringBuilder()));
	//   74  156:new             #1221 <Class StringBuilder>
	//   75  159:dup             
	//   76  160:invokespecial   #1222 <Method void StringBuilder()>
	//   77  163:astore_1        
						((StringBuilder) (byteordereddatainputstream)).append("Invalid crop size values. cropSize=");
	//   78  164:aload_1         
	//   79  165:ldc2            #1752 <String "Invalid crop size values. cropSize=">
	//   80  168:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   81  171:pop             
						((StringBuilder) (byteordereddatainputstream)).append(Arrays.toString(((Object []) (ai))));
	//   82  172:aload_1         
	//   83  173:aload           7
	//   84  175:invokestatic    #1755 <Method String Arrays.toString(Object[])>
	//   85  178:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   86  181:pop             
						Log.w("ExifInterface", ((StringBuilder) (byteordereddatainputstream)).toString());
	//   87  182:ldc2            #364 <String "ExifInterface">
	//   88  185:aload_1         
	//   89  186:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//   90  189:invokestatic    #1408 <Method int Log.w(String, String)>
	//   91  192:pop             
						return;
	//   92  193:return          
					}
				} else
				{
					ai = (int[])((ExifAttribute) (ai)).getValue(mExifByteOrder);
	//   93  194:aload           7
	//   94  196:aload_0         
	//   95  197:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   96  200:invokevirtual   #1393 <Method Object ExifInterface$ExifAttribute.getValue(ByteOrder)>
	//   97  203:checkcast       #1268 <Class int[]>
	//   98  206:astore          7
					if(ai == null || ai.length != 2)
	//*  99  208:aload           7
	//* 100  210:ifnull          278
	//* 101  213:aload           7
	//* 102  215:arraylength     
	//* 103  216:iconst_2        
	//* 104  217:icmpeq          223
						break label1;
	//  105  220:goto            278
					byteordereddatainputstream = ((ByteOrderedDataInputStream) (ExifAttribute.createUShort(ai[0], mExifByteOrder)));
	//  106  223:aload           7
	//  107  225:iconst_0        
	//  108  226:iaload          
	//  109  227:aload_0         
	//  110  228:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//  111  231:invokestatic    #1397 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createUShort(int, ByteOrder)>
	//  112  234:astore_1        
					ai = ((int []) (ExifAttribute.createUShort(ai[1], mExifByteOrder)));
	//  113  235:aload           7
	//  114  237:iconst_1        
	//  115  238:iaload          
	//  116  239:aload_0         
	//  117  240:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//  118  243:invokestatic    #1397 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createUShort(int, ByteOrder)>
	//  119  246:astore          7
				}
				mAttributes[i].put("ImageWidth", ((Object) (byteordereddatainputstream)));
	//  120  248:aload_0         
	//  121  249:getfield        #1146 <Field HashMap[] mAttributes>
	//  122  252:iload_2         
	//  123  253:aaload          
	//  124  254:ldc2            #598 <String "ImageWidth">
	//  125  257:aload_1         
	//  126  258:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//  127  261:pop             
				mAttributes[i].put("ImageLength", ((Object) (ai)));
	//  128  262:aload_0         
	//  129  263:getfield        #1146 <Field HashMap[] mAttributes>
	//  130  266:iload_2         
	//  131  267:aaload          
	//  132  268:ldc2            #592 <String "ImageLength">
	//  133  271:aload           7
	//  134  273:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//  135  276:pop             
				return;
	//  136  277:return          
			}
			byteordereddatainputstream = ((ByteOrderedDataInputStream) (new StringBuilder()));
	//  137  278:new             #1221 <Class StringBuilder>
	//  138  281:dup             
	//  139  282:invokespecial   #1222 <Method void StringBuilder()>
	//  140  285:astore_1        
			((StringBuilder) (byteordereddatainputstream)).append("Invalid crop size values. cropSize=");
	//  141  286:aload_1         
	//  142  287:ldc2            #1752 <String "Invalid crop size values. cropSize=">
	//  143  290:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//  144  293:pop             
			((StringBuilder) (byteordereddatainputstream)).append(Arrays.toString(ai));
	//  145  294:aload_1         
	//  146  295:aload           7
	//  147  297:invokestatic    #1402 <Method String Arrays.toString(int[])>
	//  148  300:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//  149  303:pop             
			Log.w("ExifInterface", ((StringBuilder) (byteordereddatainputstream)).toString());
	//  150  304:ldc2            #364 <String "ExifInterface">
	//  151  307:aload_1         
	//  152  308:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//  153  311:invokestatic    #1408 <Method int Log.w(String, String)>
	//  154  314:pop             
			return;
	//  155  315:return          
		}
		if(exifattribute1 != null && exifattribute2 != null && exifattribute3 != null && exifattribute4 != null)
	//* 156  316:aload           8
	//* 157  318:ifnull          448
	//* 158  321:aload           9
	//* 159  323:ifnull          448
	//* 160  326:aload           10
	//* 161  328:ifnull          448
	//* 162  331:aload           11
	//* 163  333:ifnull          448
		{
			int j = exifattribute1.getIntValue(mExifByteOrder);
	//  164  336:aload           8
	//  165  338:aload_0         
	//  166  339:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//  167  342:invokevirtual   #1495 <Method int ExifInterface$ExifAttribute.getIntValue(ByteOrder)>
	//  168  345:istore_3        
			int k = exifattribute3.getIntValue(mExifByteOrder);
	//  169  346:aload           10
	//  170  348:aload_0         
	//  171  349:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//  172  352:invokevirtual   #1495 <Method int ExifInterface$ExifAttribute.getIntValue(ByteOrder)>
	//  173  355:istore          4
			int l = exifattribute4.getIntValue(mExifByteOrder);
	//  174  357:aload           11
	//  175  359:aload_0         
	//  176  360:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//  177  363:invokevirtual   #1495 <Method int ExifInterface$ExifAttribute.getIntValue(ByteOrder)>
	//  178  366:istore          5
			int i1 = exifattribute2.getIntValue(mExifByteOrder);
	//  179  368:aload           9
	//  180  370:aload_0         
	//  181  371:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//  182  374:invokevirtual   #1495 <Method int ExifInterface$ExifAttribute.getIntValue(ByteOrder)>
	//  183  377:istore          6
			if(k > j && l > i1)
	//* 184  379:iload           4
	//* 185  381:iload_3         
	//* 186  382:icmple          454
	//* 187  385:iload           5
	//* 188  387:iload           6
	//* 189  389:icmple          454
			{
				byteordereddatainputstream = ((ByteOrderedDataInputStream) (ExifAttribute.createUShort(k - j, mExifByteOrder)));
	//  190  392:iload           4
	//  191  394:iload_3         
	//  192  395:isub            
	//  193  396:aload_0         
	//  194  397:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//  195  400:invokestatic    #1397 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createUShort(int, ByteOrder)>
	//  196  403:astore_1        
				ExifAttribute exifattribute = ExifAttribute.createUShort(l - i1, mExifByteOrder);
	//  197  404:iload           5
	//  198  406:iload           6
	//  199  408:isub            
	//  200  409:aload_0         
	//  201  410:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//  202  413:invokestatic    #1397 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createUShort(int, ByteOrder)>
	//  203  416:astore          7
				mAttributes[i].put("ImageLength", ((Object) (byteordereddatainputstream)));
	//  204  418:aload_0         
	//  205  419:getfield        #1146 <Field HashMap[] mAttributes>
	//  206  422:iload_2         
	//  207  423:aaload          
	//  208  424:ldc2            #592 <String "ImageLength">
	//  209  427:aload_1         
	//  210  428:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//  211  431:pop             
				mAttributes[i].put("ImageWidth", ((Object) (exifattribute)));
	//  212  432:aload_0         
	//  213  433:getfield        #1146 <Field HashMap[] mAttributes>
	//  214  436:iload_2         
	//  215  437:aaload          
	//  216  438:ldc2            #598 <String "ImageWidth">
	//  217  441:aload           7
	//  218  443:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//  219  446:pop             
				return;
	//  220  447:return          
			}
		} else
		{
			retrieveJpegImageSize(byteordereddatainputstream, i);
	//  221  448:aload_0         
	//  222  449:aload_1         
	//  223  450:iload_2         
	//  224  451:invokespecial   #1757 <Method void retrieveJpegImageSize(ExifInterface$ByteOrderedDataInputStream, int)>
		}
	//  225  454:return          
	}

	private void validateImages(InputStream inputstream)
		throws IOException
	{
		swapBasedOnImageSize(0, 5);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iconst_5        
	//    3    3:invokespecial   #1759 <Method void swapBasedOnImageSize(int, int)>
		swapBasedOnImageSize(0, 4);
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:iconst_4        
	//    7    9:invokespecial   #1759 <Method void swapBasedOnImageSize(int, int)>
		swapBasedOnImageSize(5, 4);
	//    8   12:aload_0         
	//    9   13:iconst_5        
	//   10   14:iconst_4        
	//   11   15:invokespecial   #1759 <Method void swapBasedOnImageSize(int, int)>
		inputstream = ((InputStream) ((ExifAttribute)mAttributes[1].get("PixelXDimension")));
	//   12   18:aload_0         
	//   13   19:getfield        #1146 <Field HashMap[] mAttributes>
	//   14   22:iconst_1        
	//   15   23:aaload          
	//   16   24:ldc2            #689 <String "PixelXDimension">
	//   17   27:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//   18   30:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//   19   33:astore_1        
		ExifAttribute exifattribute = (ExifAttribute)mAttributes[1].get("PixelYDimension");
	//   20   34:aload_0         
	//   21   35:getfield        #1146 <Field HashMap[] mAttributes>
	//   22   38:iconst_1        
	//   23   39:aaload          
	//   24   40:ldc2            #692 <String "PixelYDimension">
	//   25   43:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//   26   46:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//   27   49:astore_2        
		if(inputstream != null && exifattribute != null)
	//*  28   50:aload_1         
	//*  29   51:ifnull          86
	//*  30   54:aload_2         
	//*  31   55:ifnull          86
		{
			mAttributes[0].put("ImageWidth", ((Object) (inputstream)));
	//   32   58:aload_0         
	//   33   59:getfield        #1146 <Field HashMap[] mAttributes>
	//   34   62:iconst_0        
	//   35   63:aaload          
	//   36   64:ldc2            #598 <String "ImageWidth">
	//   37   67:aload_1         
	//   38   68:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//   39   71:pop             
			mAttributes[0].put("ImageLength", ((Object) (exifattribute)));
	//   40   72:aload_0         
	//   41   73:getfield        #1146 <Field HashMap[] mAttributes>
	//   42   76:iconst_0        
	//   43   77:aaload          
	//   44   78:ldc2            #592 <String "ImageLength">
	//   45   81:aload_2         
	//   46   82:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//   47   85:pop             
		}
		if(mAttributes[4].isEmpty() && isThumbnail(mAttributes[5]))
	//*  48   86:aload_0         
	//*  49   87:getfield        #1146 <Field HashMap[] mAttributes>
	//*  50   90:iconst_4        
	//*  51   91:aaload          
	//*  52   92:invokevirtual   #1685 <Method boolean HashMap.isEmpty()>
	//*  53   95:ifeq            132
	//*  54   98:aload_0         
	//*  55   99:aload_0         
	//*  56  100:getfield        #1146 <Field HashMap[] mAttributes>
	//*  57  103:iconst_5        
	//*  58  104:aaload          
	//*  59  105:invokespecial   #1761 <Method boolean isThumbnail(HashMap)>
	//*  60  108:ifeq            132
		{
			inputstream = ((InputStream) (mAttributes));
	//   61  111:aload_0         
	//   62  112:getfield        #1146 <Field HashMap[] mAttributes>
	//   63  115:astore_1        
			inputstream[4] = inputstream[5];
	//   64  116:aload_1         
	//   65  117:iconst_4        
	//   66  118:aload_1         
	//   67  119:iconst_5        
	//   68  120:aaload          
	//   69  121:aastore         
			inputstream[5] = ((/*<invalid signature>*/java.lang.Object) (new HashMap()));
	//   70  122:aload_1         
	//   71  123:iconst_5        
	//   72  124:new             #1060 <Class HashMap>
	//   73  127:dup             
	//   74  128:invokespecial   #1073 <Method void HashMap()>
	//   75  131:aastore         
		}
		if(!isThumbnail(mAttributes[4]))
	//*  76  132:aload_0         
	//*  77  133:aload_0         
	//*  78  134:getfield        #1146 <Field HashMap[] mAttributes>
	//*  79  137:iconst_4        
	//*  80  138:aaload          
	//*  81  139:invokespecial   #1761 <Method boolean isThumbnail(HashMap)>
	//*  82  142:ifne            155
			Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
	//   83  145:ldc2            #364 <String "ExifInterface">
	//   84  148:ldc2            #1763 <String "No image meets the size requirements of a thumbnail image.">
	//   85  151:invokestatic    #1521 <Method int Log.d(String, String)>
	//   86  154:pop             
	//   87  155:return          
	}

	private int writeExifSegment(ByteOrderedDataOutputStream byteordereddataoutputstream, int i)
		throws IOException
	{
		Object obj = ((Object) (EXIF_TAGS));
	//    0    0:getstatic       #1052 <Field ExifInterface$ExifTag[][] EXIF_TAGS>
	//    1    3:astore          9
		int ai[] = new int[obj.length];
	//    2    5:aload           9
	//    3    7:arraylength     
	//    4    8:newarray        int[]
	//    5   10:astore          8
		obj = ((Object) (new int[obj.length]));
	//    6   12:aload           9
	//    7   14:arraylength     
	//    8   15:newarray        int[]
	//    9   17:astore          9
		ExifTag aexiftag[] = EXIF_POINTER_TAGS;
	//   10   19:getstatic       #1054 <Field ExifInterface$ExifTag[] EXIF_POINTER_TAGS>
	//   11   22:astore          10
		int k1 = aexiftag.length;
	//   12   24:aload           10
	//   13   26:arraylength     
	//   14   27:istore          5
		for(int j = 0; j < k1; j++)
	//*  15   29:iconst_0        
	//*  16   30:istore          4
	//*  17   32:iload           4
	//*  18   34:iload           5
	//*  19   36:icmpge          60
			removeAttribute(aexiftag[j].name);
	//   20   39:aload_0         
	//   21   40:aload           10
	//   22   42:iload           4
	//   23   44:aaload          
	//   24   45:getfield        #1124 <Field String ExifInterface$ExifTag.name>
	//   25   48:invokespecial   #1765 <Method void removeAttribute(String)>

	//   26   51:iload           4
	//   27   53:iconst_1        
	//   28   54:iadd            
	//   29   55:istore          4
	//*  30   57:goto            32
		removeAttribute(JPEG_INTERCHANGE_FORMAT_TAG.name);
	//   31   60:aload_0         
	//   32   61:getstatic       #1056 <Field ExifInterface$ExifTag JPEG_INTERCHANGE_FORMAT_TAG>
	//   33   64:getfield        #1124 <Field String ExifInterface$ExifTag.name>
	//   34   67:invokespecial   #1765 <Method void removeAttribute(String)>
		removeAttribute(JPEG_INTERCHANGE_FORMAT_LENGTH_TAG.name);
	//   35   70:aload_0         
	//   36   71:getstatic       #1058 <Field ExifInterface$ExifTag JPEG_INTERCHANGE_FORMAT_LENGTH_TAG>
	//   37   74:getfield        #1124 <Field String ExifInterface$ExifTag.name>
	//   38   77:invokespecial   #1765 <Method void removeAttribute(String)>
		for(int k = 0; k < EXIF_TAGS.length; k++)
	//*  39   80:iconst_0        
	//*  40   81:istore          4
	//*  41   83:iload           4
	//*  42   85:getstatic       #1052 <Field ExifInterface$ExifTag[][] EXIF_TAGS>
	//*  43   88:arraylength     
	//*  44   89:icmpge          180
		{
			Object aobj[] = mAttributes[k].entrySet().toArray();
	//   45   92:aload_0         
	//   46   93:getfield        #1146 <Field HashMap[] mAttributes>
	//   47   96:iload           4
	//   48   98:aaload          
	//   49   99:invokevirtual   #1583 <Method Set HashMap.entrySet()>
	//   50  102:invokeinterface #1769 <Method Object[] Set.toArray()>
	//   51  107:astore          10
			int i2 = aobj.length;
	//   52  109:aload           10
	//   53  111:arraylength     
	//   54  112:istore          6
			for(k1 = 0; k1 < i2; k1++)
	//*  55  114:iconst_0        
	//*  56  115:istore          5
	//*  57  117:iload           5
	//*  58  119:iload           6
	//*  59  121:icmpge          171
			{
				java.util.Map.Entry entry = (java.util.Map.Entry)aobj[k1];
	//   60  124:aload           10
	//   61  126:iload           5
	//   62  128:aaload          
	//   63  129:checkcast       #1601 <Class java.util.Map$Entry>
	//   64  132:astore          11
				if(entry.getValue() == null)
	//*  65  134:aload           11
	//*  66  136:invokeinterface #1603 <Method Object java.util.Map$Entry.getValue()>
	//*  67  141:ifnonnull       162
					mAttributes[k].remove(entry.getKey());
	//   68  144:aload_0         
	//   69  145:getfield        #1146 <Field HashMap[] mAttributes>
	//   70  148:iload           4
	//   71  150:aaload          
	//   72  151:aload           11
	//   73  153:invokeinterface #1608 <Method Object java.util.Map$Entry.getKey()>
	//   74  158:invokevirtual   #1693 <Method Object HashMap.remove(Object)>
	//   75  161:pop             
			}

	//   76  162:iload           5
	//   77  164:iconst_1        
	//   78  165:iadd            
	//   79  166:istore          5
		}

	//   80  168:goto            117
	//   81  171:iload           4
	//   82  173:iconst_1        
	//   83  174:iadd            
	//   84  175:istore          4
	//*  85  177:goto            83
		if(!mAttributes[1].isEmpty())
	//*  86  180:aload_0         
	//*  87  181:getfield        #1146 <Field HashMap[] mAttributes>
	//*  88  184:iconst_1        
	//*  89  185:aaload          
	//*  90  186:invokevirtual   #1685 <Method boolean HashMap.isEmpty()>
	//*  91  189:ifne            218
			mAttributes[0].put(((Object) (EXIF_POINTER_TAGS[1].name)), ((Object) (ExifAttribute.createULong(0L, mExifByteOrder))));
	//   92  192:aload_0         
	//   93  193:getfield        #1146 <Field HashMap[] mAttributes>
	//   94  196:iconst_0        
	//   95  197:aaload          
	//   96  198:getstatic       #1054 <Field ExifInterface$ExifTag[] EXIF_POINTER_TAGS>
	//   97  201:iconst_1        
	//   98  202:aaload          
	//   99  203:getfield        #1124 <Field String ExifInterface$ExifTag.name>
	//  100  206:lconst_0        
	//  101  207:aload_0         
	//  102  208:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//  103  211:invokestatic    #1196 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createULong(long, ByteOrder)>
	//  104  214:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//  105  217:pop             
		if(!mAttributes[2].isEmpty())
	//* 106  218:aload_0         
	//* 107  219:getfield        #1146 <Field HashMap[] mAttributes>
	//* 108  222:iconst_2        
	//* 109  223:aaload          
	//* 110  224:invokevirtual   #1685 <Method boolean HashMap.isEmpty()>
	//* 111  227:ifne            256
			mAttributes[0].put(((Object) (EXIF_POINTER_TAGS[2].name)), ((Object) (ExifAttribute.createULong(0L, mExifByteOrder))));
	//  112  230:aload_0         
	//  113  231:getfield        #1146 <Field HashMap[] mAttributes>
	//  114  234:iconst_0        
	//  115  235:aaload          
	//  116  236:getstatic       #1054 <Field ExifInterface$ExifTag[] EXIF_POINTER_TAGS>
	//  117  239:iconst_2        
	//  118  240:aaload          
	//  119  241:getfield        #1124 <Field String ExifInterface$ExifTag.name>
	//  120  244:lconst_0        
	//  121  245:aload_0         
	//  122  246:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//  123  249:invokestatic    #1196 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createULong(long, ByteOrder)>
	//  124  252:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//  125  255:pop             
		if(!mAttributes[3].isEmpty())
	//* 126  256:aload_0         
	//* 127  257:getfield        #1146 <Field HashMap[] mAttributes>
	//* 128  260:iconst_3        
	//* 129  261:aaload          
	//* 130  262:invokevirtual   #1685 <Method boolean HashMap.isEmpty()>
	//* 131  265:ifne            294
			mAttributes[1].put(((Object) (EXIF_POINTER_TAGS[3].name)), ((Object) (ExifAttribute.createULong(0L, mExifByteOrder))));
	//  132  268:aload_0         
	//  133  269:getfield        #1146 <Field HashMap[] mAttributes>
	//  134  272:iconst_1        
	//  135  273:aaload          
	//  136  274:getstatic       #1054 <Field ExifInterface$ExifTag[] EXIF_POINTER_TAGS>
	//  137  277:iconst_3        
	//  138  278:aaload          
	//  139  279:getfield        #1124 <Field String ExifInterface$ExifTag.name>
	//  140  282:lconst_0        
	//  141  283:aload_0         
	//  142  284:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//  143  287:invokestatic    #1196 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createULong(long, ByteOrder)>
	//  144  290:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//  145  293:pop             
		if(mHasThumbnail)
	//* 146  294:aload_0         
	//* 147  295:getfield        #1503 <Field boolean mHasThumbnail>
	//* 148  298:ifeq            353
		{
			mAttributes[4].put(((Object) (JPEG_INTERCHANGE_FORMAT_TAG.name)), ((Object) (ExifAttribute.createULong(0L, mExifByteOrder))));
	//  149  301:aload_0         
	//  150  302:getfield        #1146 <Field HashMap[] mAttributes>
	//  151  305:iconst_4        
	//  152  306:aaload          
	//  153  307:getstatic       #1056 <Field ExifInterface$ExifTag JPEG_INTERCHANGE_FORMAT_TAG>
	//  154  310:getfield        #1124 <Field String ExifInterface$ExifTag.name>
	//  155  313:lconst_0        
	//  156  314:aload_0         
	//  157  315:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//  158  318:invokestatic    #1196 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createULong(long, ByteOrder)>
	//  159  321:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//  160  324:pop             
			mAttributes[4].put(((Object) (JPEG_INTERCHANGE_FORMAT_LENGTH_TAG.name)), ((Object) (ExifAttribute.createULong(mThumbnailLength, mExifByteOrder))));
	//  161  325:aload_0         
	//  162  326:getfield        #1146 <Field HashMap[] mAttributes>
	//  163  329:iconst_4        
	//  164  330:aaload          
	//  165  331:getstatic       #1058 <Field ExifInterface$ExifTag JPEG_INTERCHANGE_FORMAT_LENGTH_TAG>
	//  166  334:getfield        #1124 <Field String ExifInterface$ExifTag.name>
	//  167  337:aload_0         
	//  168  338:getfield        #1507 <Field int mThumbnailLength>
	//  169  341:i2l             
	//  170  342:aload_0         
	//  171  343:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//  172  346:invokestatic    #1196 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createULong(long, ByteOrder)>
	//  173  349:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//  174  352:pop             
		}
		for(int l = 0; l < EXIF_TAGS.length; l++)
	//* 175  353:iconst_0        
	//* 176  354:istore          4
	//* 177  356:iload           4
	//* 178  358:getstatic       #1052 <Field ExifInterface$ExifTag[][] EXIF_TAGS>
	//* 179  361:arraylength     
	//* 180  362:icmpge          456
		{
			Iterator iterator1 = mAttributes[l].entrySet().iterator();
	//  181  365:aload_0         
	//  182  366:getfield        #1146 <Field HashMap[] mAttributes>
	//  183  369:iload           4
	//  184  371:aaload          
	//  185  372:invokevirtual   #1583 <Method Set HashMap.entrySet()>
	//  186  375:invokeinterface #1589 <Method Iterator Set.iterator()>
	//  187  380:astore          10
			k1 = 0;
	//  188  382:iconst_0        
	//  189  383:istore          5
			do
			{
				if(!iterator1.hasNext())
					break;
	//  190  385:aload           10
	//  191  387:invokeinterface #1595 <Method boolean Iterator.hasNext()>
	//  192  392:ifeq            434
				int j2 = ((ExifAttribute)((java.util.Map.Entry)iterator1.next()).getValue()).size();
	//  193  395:aload           10
	//  194  397:invokeinterface #1599 <Method Object Iterator.next()>
	//  195  402:checkcast       #1601 <Class java.util.Map$Entry>
	//  196  405:invokeinterface #1603 <Method Object java.util.Map$Entry.getValue()>
	//  197  410:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//  198  413:invokevirtual   #1770 <Method int ExifInterface$ExifAttribute.size()>
	//  199  416:istore          6
				if(j2 > 4)
	//* 200  418:iload           6
	//* 201  420:iconst_4        
	//* 202  421:icmple          385
					k1 += j2;
	//  203  424:iload           5
	//  204  426:iload           6
	//  205  428:iadd            
	//  206  429:istore          5
			} while(true);
	//  207  431:goto            385
			obj[l] = obj[l] + k1;
	//  208  434:aload           9
	//  209  436:iload           4
	//  210  438:aload           9
	//  211  440:iload           4
	//  212  442:iaload          
	//  213  443:iload           5
	//  214  445:iadd            
	//  215  446:iastore         
		}

	//  216  447:iload           4
	//  217  449:iconst_1        
	//  218  450:iadd            
	//  219  451:istore          4
	//* 220  453:goto            356
		int i1 = 8;
	//  221  456:bipush          8
	//  222  458:istore          4
		for(k1 = 0; k1 < EXIF_TAGS.length;)
	//* 223  460:iconst_0        
	//* 224  461:istore          5
	//* 225  463:iload           5
	//* 226  465:getstatic       #1052 <Field ExifInterface$ExifTag[][] EXIF_TAGS>
	//* 227  468:arraylength     
	//* 228  469:icmpge          537
		{
			int k2 = i1;
	//  229  472:iload           4
	//  230  474:istore          6
			if(!mAttributes[k1].isEmpty())
	//* 231  476:aload_0         
	//* 232  477:getfield        #1146 <Field HashMap[] mAttributes>
	//* 233  480:iload           5
	//* 234  482:aaload          
	//* 235  483:invokevirtual   #1685 <Method boolean HashMap.isEmpty()>
	//* 236  486:ifne            524
			{
				ai[k1] = i1;
	//  237  489:aload           8
	//  238  491:iload           5
	//  239  493:iload           4
	//  240  495:iastore         
				k2 = i1 + (mAttributes[k1].size() * 12 + 2 + 4 + obj[k1]);
	//  241  496:iload           4
	//  242  498:aload_0         
	//  243  499:getfield        #1146 <Field HashMap[] mAttributes>
	//  244  502:iload           5
	//  245  504:aaload          
	//  246  505:invokevirtual   #1579 <Method int HashMap.size()>
	//  247  508:bipush          12
	//  248  510:imul            
	//  249  511:iconst_2        
	//  250  512:iadd            
	//  251  513:iconst_4        
	//  252  514:iadd            
	//  253  515:aload           9
	//  254  517:iload           5
	//  255  519:iaload          
	//  256  520:iadd            
	//  257  521:iadd            
	//  258  522:istore          6
			}
			k1++;
	//  259  524:iload           5
	//  260  526:iconst_1        
	//  261  527:iadd            
	//  262  528:istore          5
			i1 = k2;
	//  263  530:iload           6
	//  264  532:istore          4
		}

	//* 265  534:goto            463
		k1 = i1;
	//  266  537:iload           4
	//  267  539:istore          5
		if(mHasThumbnail)
	//* 268  541:aload_0         
	//* 269  542:getfield        #1503 <Field boolean mHasThumbnail>
	//* 270  545:ifeq            591
		{
			mAttributes[4].put(((Object) (JPEG_INTERCHANGE_FORMAT_TAG.name)), ((Object) (ExifAttribute.createULong(i1, mExifByteOrder))));
	//  271  548:aload_0         
	//  272  549:getfield        #1146 <Field HashMap[] mAttributes>
	//  273  552:iconst_4        
	//  274  553:aaload          
	//  275  554:getstatic       #1056 <Field ExifInterface$ExifTag JPEG_INTERCHANGE_FORMAT_TAG>
	//  276  557:getfield        #1124 <Field String ExifInterface$ExifTag.name>
	//  277  560:iload           4
	//  278  562:i2l             
	//  279  563:aload_0         
	//  280  564:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//  281  567:invokestatic    #1196 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createULong(long, ByteOrder)>
	//  282  570:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//  283  573:pop             
			mThumbnailOffset = i + i1;
	//  284  574:aload_0         
	//  285  575:iload_2         
	//  286  576:iload           4
	//  287  578:iadd            
	//  288  579:putfield        #1505 <Field int mThumbnailOffset>
			k1 = i1 + mThumbnailLength;
	//  289  582:iload           4
	//  290  584:aload_0         
	//  291  585:getfield        #1507 <Field int mThumbnailLength>
	//  292  588:iadd            
	//  293  589:istore          5
		}
		int l2 = k1 + 8;
	//  294  591:iload           5
	//  295  593:bipush          8
	//  296  595:iadd            
	//  297  596:istore          6
		if(!mAttributes[1].isEmpty())
	//* 298  598:aload_0         
	//* 299  599:getfield        #1146 <Field HashMap[] mAttributes>
	//* 300  602:iconst_1        
	//* 301  603:aaload          
	//* 302  604:invokevirtual   #1685 <Method boolean HashMap.isEmpty()>
	//* 303  607:ifne            640
			mAttributes[0].put(((Object) (EXIF_POINTER_TAGS[1].name)), ((Object) (ExifAttribute.createULong(ai[1], mExifByteOrder))));
	//  304  610:aload_0         
	//  305  611:getfield        #1146 <Field HashMap[] mAttributes>
	//  306  614:iconst_0        
	//  307  615:aaload          
	//  308  616:getstatic       #1054 <Field ExifInterface$ExifTag[] EXIF_POINTER_TAGS>
	//  309  619:iconst_1        
	//  310  620:aaload          
	//  311  621:getfield        #1124 <Field String ExifInterface$ExifTag.name>
	//  312  624:aload           8
	//  313  626:iconst_1        
	//  314  627:iaload          
	//  315  628:i2l             
	//  316  629:aload_0         
	//  317  630:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//  318  633:invokestatic    #1196 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createULong(long, ByteOrder)>
	//  319  636:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//  320  639:pop             
		if(!mAttributes[2].isEmpty())
	//* 321  640:aload_0         
	//* 322  641:getfield        #1146 <Field HashMap[] mAttributes>
	//* 323  644:iconst_2        
	//* 324  645:aaload          
	//* 325  646:invokevirtual   #1685 <Method boolean HashMap.isEmpty()>
	//* 326  649:ifne            682
			mAttributes[0].put(((Object) (EXIF_POINTER_TAGS[2].name)), ((Object) (ExifAttribute.createULong(ai[2], mExifByteOrder))));
	//  327  652:aload_0         
	//  328  653:getfield        #1146 <Field HashMap[] mAttributes>
	//  329  656:iconst_0        
	//  330  657:aaload          
	//  331  658:getstatic       #1054 <Field ExifInterface$ExifTag[] EXIF_POINTER_TAGS>
	//  332  661:iconst_2        
	//  333  662:aaload          
	//  334  663:getfield        #1124 <Field String ExifInterface$ExifTag.name>
	//  335  666:aload           8
	//  336  668:iconst_2        
	//  337  669:iaload          
	//  338  670:i2l             
	//  339  671:aload_0         
	//  340  672:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//  341  675:invokestatic    #1196 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createULong(long, ByteOrder)>
	//  342  678:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//  343  681:pop             
		if(!mAttributes[3].isEmpty())
	//* 344  682:aload_0         
	//* 345  683:getfield        #1146 <Field HashMap[] mAttributes>
	//* 346  686:iconst_3        
	//* 347  687:aaload          
	//* 348  688:invokevirtual   #1685 <Method boolean HashMap.isEmpty()>
	//* 349  691:ifne            724
			mAttributes[1].put(((Object) (EXIF_POINTER_TAGS[3].name)), ((Object) (ExifAttribute.createULong(ai[3], mExifByteOrder))));
	//  350  694:aload_0         
	//  351  695:getfield        #1146 <Field HashMap[] mAttributes>
	//  352  698:iconst_1        
	//  353  699:aaload          
	//  354  700:getstatic       #1054 <Field ExifInterface$ExifTag[] EXIF_POINTER_TAGS>
	//  355  703:iconst_3        
	//  356  704:aaload          
	//  357  705:getfield        #1124 <Field String ExifInterface$ExifTag.name>
	//  358  708:aload           8
	//  359  710:iconst_3        
	//  360  711:iaload          
	//  361  712:i2l             
	//  362  713:aload_0         
	//  363  714:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//  364  717:invokestatic    #1196 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createULong(long, ByteOrder)>
	//  365  720:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//  366  723:pop             
		byteordereddataoutputstream.writeUnsignedShort(l2);
	//  367  724:aload_1         
	//  368  725:iload           6
	//  369  727:invokevirtual   #1714 <Method void ExifInterface$ByteOrderedDataOutputStream.writeUnsignedShort(int)>
		byteordereddataoutputstream.write(IDENTIFIER_EXIF_APP1);
	//  370  730:aload_1         
	//  371  731:getstatic       #1093 <Field byte[] IDENTIFIER_EXIF_APP1>
	//  372  734:invokevirtual   #1724 <Method void ExifInterface$ByteOrderedDataOutputStream.write(byte[])>
		short word0;
		if(mExifByteOrder == ByteOrder.BIG_ENDIAN)
	//* 373  737:aload_0         
	//* 374  738:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//* 375  741:getstatic       #1156 <Field ByteOrder ByteOrder.BIG_ENDIAN>
	//* 376  744:if_acmpne       754
			word0 = 19789;
	//  377  747:sipush          19789
	//  378  750:istore_3        
		else
	//* 379  751:goto            758
			word0 = 18761;
	//  380  754:sipush          18761
	//  381  757:istore_3        
		byteordereddataoutputstream.writeShort(word0);
	//  382  758:aload_1         
	//  383  759:iload_3         
	//  384  760:invokevirtual   #1774 <Method void ExifInterface$ByteOrderedDataOutputStream.writeShort(short)>
		byteordereddataoutputstream.setByteOrder(mExifByteOrder);
	//  385  763:aload_1         
	//  386  764:aload_0         
	//  387  765:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//  388  768:invokevirtual   #1775 <Method void ExifInterface$ByteOrderedDataOutputStream.setByteOrder(ByteOrder)>
		byteordereddataoutputstream.writeUnsignedShort(42);
	//  389  771:aload_1         
	//  390  772:bipush          42
	//  391  774:invokevirtual   #1714 <Method void ExifInterface$ByteOrderedDataOutputStream.writeUnsignedShort(int)>
		byteordereddataoutputstream.writeUnsignedInt(8L);
	//  392  777:aload_1         
	//  393  778:ldc2w           #1382 <Long 8L>
	//  394  781:invokevirtual   #1778 <Method void ExifInterface$ByteOrderedDataOutputStream.writeUnsignedInt(long)>
label0:
		for(i = 0; i < EXIF_TAGS.length; i++)
	//* 395  784:iconst_0        
	//* 396  785:istore_2        
	//* 397  786:iload_2         
	//* 398  787:getstatic       #1052 <Field ExifInterface$ExifTag[][] EXIF_TAGS>
	//* 399  790:arraylength     
	//* 400  791:icmpge          1119
		{
			if(mAttributes[i].isEmpty())
				continue;
	//  401  794:aload_0         
	//  402  795:getfield        #1146 <Field HashMap[] mAttributes>
	//  403  798:iload_2         
	//  404  799:aaload          
	//  405  800:invokevirtual   #1685 <Method boolean HashMap.isEmpty()>
	//  406  803:ifne            1112
			byteordereddataoutputstream.writeUnsignedShort(mAttributes[i].size());
	//  407  806:aload_1         
	//  408  807:aload_0         
	//  409  808:getfield        #1146 <Field HashMap[] mAttributes>
	//  410  811:iload_2         
	//  411  812:aaload          
	//  412  813:invokevirtual   #1579 <Method int HashMap.size()>
	//  413  816:invokevirtual   #1714 <Method void ExifInterface$ByteOrderedDataOutputStream.writeUnsignedShort(int)>
			int j1 = ai[i] + 2 + mAttributes[i].size() * 12 + 4;
	//  414  819:aload           8
	//  415  821:iload_2         
	//  416  822:iaload          
	//  417  823:iconst_2        
	//  418  824:iadd            
	//  419  825:aload_0         
	//  420  826:getfield        #1146 <Field HashMap[] mAttributes>
	//  421  829:iload_2         
	//  422  830:aaload          
	//  423  831:invokevirtual   #1579 <Method int HashMap.size()>
	//  424  834:bipush          12
	//  425  836:imul            
	//  426  837:iadd            
	//  427  838:iconst_4        
	//  428  839:iadd            
	//  429  840:istore          4
			Iterator iterator = mAttributes[i].entrySet().iterator();
	//  430  842:aload_0         
	//  431  843:getfield        #1146 <Field HashMap[] mAttributes>
	//  432  846:iload_2         
	//  433  847:aaload          
	//  434  848:invokevirtual   #1583 <Method Set HashMap.entrySet()>
	//  435  851:invokeinterface #1589 <Method Iterator Set.iterator()>
	//  436  856:astore          9
			do
			{
				if(!iterator.hasNext())
					break;
	//  437  858:aload           9
	//  438  860:invokeinterface #1595 <Method boolean Iterator.hasNext()>
	//  439  865:ifeq            1004
				Object obj1 = ((Object) ((java.util.Map.Entry)iterator.next()));
	//  440  868:aload           9
	//  441  870:invokeinterface #1599 <Method Object Iterator.next()>
	//  442  875:checkcast       #1601 <Class java.util.Map$Entry>
	//  443  878:astore          10
				int i3 = ((ExifTag)sExifTagMapsForWriting[i].get(((java.util.Map.Entry) (obj1)).getKey())).number;
	//  444  880:getstatic       #1064 <Field HashMap[] sExifTagMapsForWriting>
	//  445  883:iload_2         
	//  446  884:aaload          
	//  447  885:aload           10
	//  448  887:invokeinterface #1608 <Method Object java.util.Map$Entry.getKey()>
	//  449  892:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//  450  895:checkcast       #15  <Class ExifInterface$ExifTag>
	//  451  898:getfield        #1117 <Field int ExifInterface$ExifTag.number>
	//  452  901:istore          7
				obj1 = ((Object) ((ExifAttribute)((java.util.Map.Entry) (obj1)).getValue()));
	//  453  903:aload           10
	//  454  905:invokeinterface #1603 <Method Object java.util.Map$Entry.getValue()>
	//  455  910:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//  456  913:astore          10
				int l1 = ((ExifAttribute) (obj1)).size();
	//  457  915:aload           10
	//  458  917:invokevirtual   #1770 <Method int ExifInterface$ExifAttribute.size()>
	//  459  920:istore          5
				byteordereddataoutputstream.writeUnsignedShort(i3);
	//  460  922:aload_1         
	//  461  923:iload           7
	//  462  925:invokevirtual   #1714 <Method void ExifInterface$ByteOrderedDataOutputStream.writeUnsignedShort(int)>
				byteordereddataoutputstream.writeUnsignedShort(((ExifAttribute) (obj1)).format);
	//  463  928:aload_1         
	//  464  929:aload           10
	//  465  931:getfield        #1744 <Field int ExifInterface$ExifAttribute.format>
	//  466  934:invokevirtual   #1714 <Method void ExifInterface$ByteOrderedDataOutputStream.writeUnsignedShort(int)>
				byteordereddataoutputstream.writeInt(((ExifAttribute) (obj1)).numberOfComponents);
	//  467  937:aload_1         
	//  468  938:aload           10
	//  469  940:getfield        #1781 <Field int ExifInterface$ExifAttribute.numberOfComponents>
	//  470  943:invokevirtual   #1784 <Method void ExifInterface$ByteOrderedDataOutputStream.writeInt(int)>
				if(l1 > 4)
	//* 471  946:iload           5
	//* 472  948:iconst_4        
	//* 473  949:icmple          969
				{
					byteordereddataoutputstream.writeUnsignedInt(j1);
	//  474  952:aload_1         
	//  475  953:iload           4
	//  476  955:i2l             
	//  477  956:invokevirtual   #1778 <Method void ExifInterface$ByteOrderedDataOutputStream.writeUnsignedInt(long)>
					j1 += l1;
	//  478  959:iload           4
	//  479  961:iload           5
	//  480  963:iadd            
	//  481  964:istore          4
				} else
	//* 482  966:goto            858
				{
					byteordereddataoutputstream.write(((ExifAttribute) (obj1)).bytes);
	//  483  969:aload_1         
	//  484  970:aload           10
	//  485  972:getfield        #1375 <Field byte[] ExifInterface$ExifAttribute.bytes>
	//  486  975:invokevirtual   #1724 <Method void ExifInterface$ByteOrderedDataOutputStream.write(byte[])>
					if(l1 < 4)
	//* 487  978:iload           5
	//* 488  980:iconst_4        
	//* 489  981:icmpge          858
						while(l1 < 4) 
	//* 490  984:iload           5
	//* 491  986:iconst_4        
	//* 492  987:icmpge          858
						{
							byteordereddataoutputstream.writeByte(0);
	//  493  990:aload_1         
	//  494  991:iconst_0        
	//  495  992:invokevirtual   #1706 <Method void ExifInterface$ByteOrderedDataOutputStream.writeByte(int)>
							l1++;
	//  496  995:iload           5
	//  497  997:iconst_1        
	//  498  998:iadd            
	//  499  999:istore          5
						}
				}
			} while(true);
	//  500 1001:goto            984
			if(i == 0 && !mAttributes[4].isEmpty())
	//* 501 1004:iload_2         
	//* 502 1005:ifne            1032
	//* 503 1008:aload_0         
	//* 504 1009:getfield        #1146 <Field HashMap[] mAttributes>
	//* 505 1012:iconst_4        
	//* 506 1013:aaload          
	//* 507 1014:invokevirtual   #1685 <Method boolean HashMap.isEmpty()>
	//* 508 1017:ifne            1032
				byteordereddataoutputstream.writeUnsignedInt(ai[4]);
	//  509 1020:aload_1         
	//  510 1021:aload           8
	//  511 1023:iconst_4        
	//  512 1024:iaload          
	//  513 1025:i2l             
	//  514 1026:invokevirtual   #1778 <Method void ExifInterface$ByteOrderedDataOutputStream.writeUnsignedInt(long)>
			else
	//* 515 1029:goto            1037
				byteordereddataoutputstream.writeUnsignedInt(0L);
	//  516 1032:aload_1         
	//  517 1033:lconst_0        
	//  518 1034:invokevirtual   #1778 <Method void ExifInterface$ByteOrderedDataOutputStream.writeUnsignedInt(long)>
			iterator = mAttributes[i].entrySet().iterator();
	//  519 1037:aload_0         
	//  520 1038:getfield        #1146 <Field HashMap[] mAttributes>
	//  521 1041:iload_2         
	//  522 1042:aaload          
	//  523 1043:invokevirtual   #1583 <Method Set HashMap.entrySet()>
	//  524 1046:invokeinterface #1589 <Method Iterator Set.iterator()>
	//  525 1051:astore          9
			do
			{
				ExifAttribute exifattribute;
				do
				{
					if(!iterator.hasNext())
						continue label0;
	//  526 1053:aload           9
	//  527 1055:invokeinterface #1595 <Method boolean Iterator.hasNext()>
	//  528 1060:ifeq            1112
					exifattribute = (ExifAttribute)((java.util.Map.Entry)iterator.next()).getValue();
	//  529 1063:aload           9
	//  530 1065:invokeinterface #1599 <Method Object Iterator.next()>
	//  531 1070:checkcast       #1601 <Class java.util.Map$Entry>
	//  532 1073:invokeinterface #1603 <Method Object java.util.Map$Entry.getValue()>
	//  533 1078:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//  534 1081:astore          10
				} while(exifattribute.bytes.length <= 4);
	//  535 1083:aload           10
	//  536 1085:getfield        #1375 <Field byte[] ExifInterface$ExifAttribute.bytes>
	//  537 1088:arraylength     
	//  538 1089:iconst_4        
	//  539 1090:icmple          1053
				byteordereddataoutputstream.write(exifattribute.bytes, 0, exifattribute.bytes.length);
	//  540 1093:aload_1         
	//  541 1094:aload           10
	//  542 1096:getfield        #1375 <Field byte[] ExifInterface$ExifAttribute.bytes>
	//  543 1099:iconst_0        
	//  544 1100:aload           10
	//  545 1102:getfield        #1375 <Field byte[] ExifInterface$ExifAttribute.bytes>
	//  546 1105:arraylength     
	//  547 1106:invokevirtual   #1718 <Method void ExifInterface$ByteOrderedDataOutputStream.write(byte[], int, int)>
			} while(true);
	//  548 1109:goto            1053
		}

	//  549 1112:iload_2         
	//  550 1113:iconst_1        
	//  551 1114:iadd            
	//  552 1115:istore_2        
	//* 553 1116:goto            786
		if(mHasThumbnail)
	//* 554 1119:aload_0         
	//* 555 1120:getfield        #1503 <Field boolean mHasThumbnail>
	//* 556 1123:ifeq            1134
			byteordereddataoutputstream.write(getThumbnailBytes());
	//  557 1126:aload_1         
	//  558 1127:aload_0         
	//  559 1128:invokevirtual   #1788 <Method byte[] getThumbnailBytes()>
	//  560 1131:invokevirtual   #1724 <Method void ExifInterface$ByteOrderedDataOutputStream.write(byte[])>
		byteordereddataoutputstream.setByteOrder(ByteOrder.BIG_ENDIAN);
	//  561 1134:aload_1         
	//  562 1135:getstatic       #1156 <Field ByteOrder ByteOrder.BIG_ENDIAN>
	//  563 1138:invokevirtual   #1775 <Method void ExifInterface$ByteOrderedDataOutputStream.setByteOrder(ByteOrder)>
		return l2;
	//  564 1141:iload           6
	//  565 1143:ireturn         
	}

	public void flipHorizontally()
	{
		byte byte0 = 1;
	//    0    0:iconst_1        
	//    1    1:istore_1        
		switch(getAttributeInt("Orientation", 1))
	//*   2    2:aload_0         
	//*   3    3:ldc2            #680 <String "Orientation">
	//*   4    6:iconst_1        
	//*   5    7:invokevirtual   #1793 <Method int getAttributeInt(String, int)>
		{
	//*   6   10:tableswitch     1 8: default 56
	//	               1 94
	//	               2 96
	//	               3 89
	//	               4 84
	//	               5 78
	//	               6 73
	//	               7 67
	//	               8 61
		default:
			byte0 = 0;
	//    7   56:iconst_0        
	//    8   57:istore_1        
			break;

	//*   9   58:goto            96
		case 8: // '\b'
			byte0 = 7;
	//   10   61:bipush          7
	//   11   63:istore_1        
			break;

	//*  12   64:goto            96
		case 7: // '\007'
			byte0 = 8;
	//   13   67:bipush          8
	//   14   69:istore_1        
			break;

	//*  15   70:goto            96
		case 6: // '\006'
			byte0 = 5;
	//   16   73:iconst_5        
	//   17   74:istore_1        
			break;

	//*  18   75:goto            96
		case 5: // '\005'
			byte0 = 6;
	//   19   78:bipush          6
	//   20   80:istore_1        
			break;

	//*  21   81:goto            96
		case 4: // '\004'
			byte0 = 3;
	//   22   84:iconst_3        
	//   23   85:istore_1        
			break;

	//*  24   86:goto            96
		case 3: // '\003'
			byte0 = 4;
	//   25   89:iconst_4        
	//   26   90:istore_1        
			break;

	//*  27   91:goto            96
		case 1: // '\001'
			byte0 = 2;
	//   28   94:iconst_2        
	//   29   95:istore_1        
			break;

		case 2: // '\002'
			break;
		}
		setAttribute("Orientation", Integer.toString(((int) (byte0))));
	//   30   96:aload_0         
	//   31   97:ldc2            #680 <String "Orientation">
	//   32  100:iload_1         
	//   33  101:invokestatic    #1795 <Method String Integer.toString(int)>
	//   34  104:invokevirtual   #1799 <Method void setAttribute(String, String)>
	//   35  107:return          
	}

	public void flipVertically()
	{
		byte byte0 = 1;
	//    0    0:iconst_1        
	//    1    1:istore_1        
		switch(getAttributeInt("Orientation", 1))
	//*   2    2:aload_0         
	//*   3    3:ldc2            #680 <String "Orientation">
	//*   4    6:iconst_1        
	//*   5    7:invokevirtual   #1793 <Method int getAttributeInt(String, int)>
		{
	//*   6   10:tableswitch     1 8: default 56
	//	               1 94
	//	               2 89
	//	               3 84
	//	               4 96
	//	               5 78
	//	               6 72
	//	               7 66
	//	               8 61
		default:
			byte0 = 0;
	//    7   56:iconst_0        
	//    8   57:istore_1        
			break;

	//*   9   58:goto            96
		case 8: // '\b'
			byte0 = 5;
	//   10   61:iconst_5        
	//   11   62:istore_1        
			break;

	//*  12   63:goto            96
		case 7: // '\007'
			byte0 = 6;
	//   13   66:bipush          6
	//   14   68:istore_1        
			break;

	//*  15   69:goto            96
		case 6: // '\006'
			byte0 = 7;
	//   16   72:bipush          7
	//   17   74:istore_1        
			break;

	//*  18   75:goto            96
		case 5: // '\005'
			byte0 = 8;
	//   19   78:bipush          8
	//   20   80:istore_1        
			break;

	//*  21   81:goto            96
		case 3: // '\003'
			byte0 = 2;
	//   22   84:iconst_2        
	//   23   85:istore_1        
			break;

	//*  24   86:goto            96
		case 2: // '\002'
			byte0 = 3;
	//   25   89:iconst_3        
	//   26   90:istore_1        
			break;

	//*  27   91:goto            96
		case 1: // '\001'
			byte0 = 4;
	//   28   94:iconst_4        
	//   29   95:istore_1        
			break;

		case 4: // '\004'
			break;
		}
		setAttribute("Orientation", Integer.toString(((int) (byte0))));
	//   30   96:aload_0         
	//   31   97:ldc2            #680 <String "Orientation">
	//   32  100:iload_1         
	//   33  101:invokestatic    #1795 <Method String Integer.toString(int)>
	//   34  104:invokevirtual   #1799 <Method void setAttribute(String, String)>
	//   35  107:return          
	}

	public double getAltitude(double d)
	{
		double d1 = getAttributeDouble("GPSAltitude", -1D);
	//    0    0:aload_0         
	//    1    1:ldc2            #487 <String "GPSAltitude">
	//    2    4:ldc2w           #1803 <Double -1D>
	//    3    7:invokevirtual   #1808 <Method double getAttributeDouble(String, double)>
	//    4   10:dstore_3        
		int j = getAttributeInt("GPSAltitudeRef", -1);
	//    5   11:aload_0         
	//    6   12:ldc2            #490 <String "GPSAltitudeRef">
	//    7   15:iconst_m1       
	//    8   16:invokevirtual   #1793 <Method int getAttributeInt(String, int)>
	//    9   19:istore          6
		if(d1 >= 0.0D && j >= 0)
	//*  10   21:dload_3         
	//*  11   22:dconst_0        
	//*  12   23:dcmpl           
	//*  13   24:iflt            50
	//*  14   27:iload           6
	//*  15   29:iflt            50
		{
			int i = 1;
	//   16   32:iconst_1        
	//   17   33:istore          5
			if(j == 1)
	//*  18   35:iload           6
	//*  19   37:iconst_1        
	//*  20   38:icmpne          44
				i = -1;
	//   21   41:iconst_m1       
	//   22   42:istore          5
			return d1 * (double)i;
	//   23   44:dload_3         
	//   24   45:iload           5
	//   25   47:i2d             
	//   26   48:dmul            
	//   27   49:dreturn         
		} else
		{
			return d;
	//   28   50:dload_1         
	//   29   51:dreturn         
		}
	}

	public String getAttribute(String s)
	{
		Object obj = ((Object) (getExifAttribute(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #1810 <Method ExifInterface$ExifAttribute getExifAttribute(String)>
	//    3    5:astore_2        
		if(obj != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          248
		{
			if(!sTagSetForCompatibility.contains(((Object) (s))))
	//*   6   10:getstatic       #1071 <Field HashSet sTagSetForCompatibility>
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #1811 <Method boolean HashSet.contains(Object)>
	//*   9   17:ifne            29
				return ((ExifAttribute) (obj)).getStringValue(mExifByteOrder);
	//   10   20:aload_2         
	//   11   21:aload_0         
	//   12   22:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   13   25:invokevirtual   #1617 <Method String ExifInterface$ExifAttribute.getStringValue(ByteOrder)>
	//   14   28:areturn         
			if(s.equals("GPSTimeStamp"))
	//*  15   29:aload_1         
	//*  16   30:ldc2            #574 <String "GPSTimeStamp">
	//*  17   33:invokevirtual   #1264 <Method boolean String.equals(Object)>
	//*  18   36:ifeq            234
			{
				if(((ExifAttribute) (obj)).format != 5 && ((ExifAttribute) (obj)).format != 10)
	//*  19   39:aload_2         
	//*  20   40:getfield        #1744 <Field int ExifInterface$ExifAttribute.format>
	//*  21   43:iconst_5        
	//*  22   44:icmpeq          94
	//*  23   47:aload_2         
	//*  24   48:getfield        #1744 <Field int ExifInterface$ExifAttribute.format>
	//*  25   51:bipush          10
	//*  26   53:icmpeq          94
				{
					s = ((String) (new StringBuilder()));
	//   27   56:new             #1221 <Class StringBuilder>
	//   28   59:dup             
	//   29   60:invokespecial   #1222 <Method void StringBuilder()>
	//   30   63:astore_1        
					((StringBuilder) (s)).append("GPS Timestamp format is not rational. format=");
	//   31   64:aload_1         
	//   32   65:ldc2            #1813 <String "GPS Timestamp format is not rational. format=">
	//   33   68:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   34   71:pop             
					((StringBuilder) (s)).append(((ExifAttribute) (obj)).format);
	//   35   72:aload_1         
	//   36   73:aload_2         
	//   37   74:getfield        #1744 <Field int ExifInterface$ExifAttribute.format>
	//   38   77:invokevirtual   #1569 <Method StringBuilder StringBuilder.append(int)>
	//   39   80:pop             
					Log.w("ExifInterface", ((StringBuilder) (s)).toString());
	//   40   81:ldc2            #364 <String "ExifInterface">
	//   41   84:aload_1         
	//   42   85:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//   43   88:invokestatic    #1408 <Method int Log.w(String, String)>
	//   44   91:pop             
					return null;
	//   45   92:aconst_null     
	//   46   93:areturn         
				}
				s = ((String) ((Rational[])((ExifAttribute) (obj)).getValue(mExifByteOrder)));
	//   47   94:aload_2         
	//   48   95:aload_0         
	//   49   96:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   50   99:invokevirtual   #1393 <Method Object ExifInterface$ExifAttribute.getValue(ByteOrder)>
	//   51  102:checkcast       #1746 <Class ExifInterface$Rational[]>
	//   52  105:astore_1        
				if(s != null && s.length == 3)
	//*  53  106:aload_1         
	//*  54  107:ifnull          196
	//*  55  110:aload_1         
	//*  56  111:arraylength     
	//*  57  112:iconst_3        
	//*  58  113:icmpeq          119
	//*  59  116:goto            196
				{
					return String.format("%02d:%02d:%02d", new Object[] {
						Integer.valueOf((int)((float)((Rational) (s[0])).numerator / (float)((Rational) (s[0])).denominator)), Integer.valueOf((int)((float)((Rational) (s[1])).numerator / (float)((Rational) (s[1])).denominator)), Integer.valueOf((int)((float)((Rational) (s[2])).numerator / (float)((Rational) (s[2])).denominator))
					});
	//   60  119:ldc2            #1815 <String "%02d:%02d:%02d">
	//   61  122:iconst_3        
	//   62  123:anewarray       Object[]
	//   63  126:dup             
	//   64  127:iconst_0        
	//   65  128:aload_1         
	//   66  129:iconst_0        
	//   67  130:aaload          
	//   68  131:getfield        #1819 <Field long ExifInterface$Rational.numerator>
	//   69  134:l2f             
	//   70  135:aload_1         
	//   71  136:iconst_0        
	//   72  137:aaload          
	//   73  138:getfield        #1822 <Field long ExifInterface$Rational.denominator>
	//   74  141:l2f             
	//   75  142:fdiv            
	//   76  143:f2i             
	//   77  144:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//   78  147:aastore         
	//   79  148:dup             
	//   80  149:iconst_1        
	//   81  150:aload_1         
	//   82  151:iconst_1        
	//   83  152:aaload          
	//   84  153:getfield        #1819 <Field long ExifInterface$Rational.numerator>
	//   85  156:l2f             
	//   86  157:aload_1         
	//   87  158:iconst_1        
	//   88  159:aaload          
	//   89  160:getfield        #1822 <Field long ExifInterface$Rational.denominator>
	//   90  163:l2f             
	//   91  164:fdiv            
	//   92  165:f2i             
	//   93  166:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//   94  169:aastore         
	//   95  170:dup             
	//   96  171:iconst_2        
	//   97  172:aload_1         
	//   98  173:iconst_2        
	//   99  174:aaload          
	//  100  175:getfield        #1819 <Field long ExifInterface$Rational.numerator>
	//  101  178:l2f             
	//  102  179:aload_1         
	//  103  180:iconst_2        
	//  104  181:aaload          
	//  105  182:getfield        #1822 <Field long ExifInterface$Rational.denominator>
	//  106  185:l2f             
	//  107  186:fdiv            
	//  108  187:f2i             
	//  109  188:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//  110  191:aastore         
	//  111  192:invokestatic    #1825 <Method String String.format(String, Object[])>
	//  112  195:areturn         
				} else
				{
					obj = ((Object) (new StringBuilder()));
	//  113  196:new             #1221 <Class StringBuilder>
	//  114  199:dup             
	//  115  200:invokespecial   #1222 <Method void StringBuilder()>
	//  116  203:astore_2        
					((StringBuilder) (obj)).append("Invalid GPS Timestamp array. array=");
	//  117  204:aload_2         
	//  118  205:ldc2            #1827 <String "Invalid GPS Timestamp array. array=">
	//  119  208:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//  120  211:pop             
					((StringBuilder) (obj)).append(Arrays.toString(((Object []) (s))));
	//  121  212:aload_2         
	//  122  213:aload_1         
	//  123  214:invokestatic    #1755 <Method String Arrays.toString(Object[])>
	//  124  217:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//  125  220:pop             
					Log.w("ExifInterface", ((StringBuilder) (obj)).toString());
	//  126  221:ldc2            #364 <String "ExifInterface">
	//  127  224:aload_2         
	//  128  225:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//  129  228:invokestatic    #1408 <Method int Log.w(String, String)>
	//  130  231:pop             
					return null;
	//  131  232:aconst_null     
	//  132  233:areturn         
				}
			}
			try
			{
				s = Double.toString(((ExifAttribute) (obj)).getDoubleValue(mExifByteOrder));
	//  133  234:aload_2         
	//  134  235:aload_0         
	//  135  236:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//  136  239:invokevirtual   #1831 <Method double ExifInterface$ExifAttribute.getDoubleValue(ByteOrder)>
	//  137  242:invokestatic    #1833 <Method String Double.toString(double)>
	//  138  245:astore_1        
			}
	//* 139  246:aload_1         
	//* 140  247:areturn         
	//* 141  248:aconst_null     
	//* 142  249:areturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//* 143  250:astore_1        
			{
				return null;
	//  144  251:aconst_null     
	//  145  252:areturn         
			}
			return s;
		} else
		{
			return null;
		}
	}

	public double getAttributeDouble(String s, double d)
	{
		s = ((String) (getExifAttribute(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #1810 <Method ExifInterface$ExifAttribute getExifAttribute(String)>
	//    3    5:astore_1        
		if(s == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       12
			return d;
	//    6   10:dload_2         
	//    7   11:dreturn         
		double d1;
		try
		{
			d1 = ((ExifAttribute) (s)).getDoubleValue(mExifByteOrder);
	//    8   12:aload_1         
	//    9   13:aload_0         
	//   10   14:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   11   17:invokevirtual   #1831 <Method double ExifInterface$ExifAttribute.getDoubleValue(ByteOrder)>
	//   12   20:dstore          4
		}
	//*  13   22:dload           4
	//*  14   24:dreturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  15   25:astore_1        
		{
			return d;
	//   16   26:dload_2         
	//   17   27:dreturn         
		}
		return d1;
	}

	public int getAttributeInt(String s, int i)
	{
		s = ((String) (getExifAttribute(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #1810 <Method ExifInterface$ExifAttribute getExifAttribute(String)>
	//    3    5:astore_1        
		if(s == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       12
			return i;
	//    6   10:iload_2         
	//    7   11:ireturn         
		int j;
		try
		{
			j = ((ExifAttribute) (s)).getIntValue(mExifByteOrder);
	//    8   12:aload_1         
	//    9   13:aload_0         
	//   10   14:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   11   17:invokevirtual   #1495 <Method int ExifInterface$ExifAttribute.getIntValue(ByteOrder)>
	//   12   20:istore_3        
		}
	//*  13   21:iload_3         
	//*  14   22:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  15   23:astore_1        
		{
			return i;
	//   16   24:iload_2         
	//   17   25:ireturn         
		}
		return j;
	}

	public long getDateTime()
	{
		long l1;
		Object obj = ((Object) (getAttribute("DateTime")));
	//    0    0:aload_0         
	//    1    1:ldc2            #409 <String "DateTime">
	//    2    4:invokevirtual   #1188 <Method String getAttribute(String)>
	//    3    7:astore          5
		if(obj == null)
			break MISSING_BLOCK_LABEL_114;
	//    4    9:aload           5
	//    5   11:ifnull          114
		if(!sNonZeroTimePattern.matcher(((CharSequence) (obj))).matches())
	//*   6   14:getstatic       #1134 <Field Pattern sNonZeroTimePattern>
	//*   7   17:aload           5
	//*   8   19:invokevirtual   #1842 <Method Matcher Pattern.matcher(CharSequence)>
	//*   9   22:invokevirtual   #1847 <Method boolean Matcher.matches()>
	//*  10   25:ifne            32
			return -1L;
	//   11   28:ldc2w           #1662 <Long -1L>
	//   12   31:lreturn         
		ParsePosition parseposition = new ParsePosition(0);
	//   13   32:new             #1849 <Class ParsePosition>
	//   14   35:dup             
	//   15   36:iconst_0        
	//   16   37:invokespecial   #1850 <Method void ParsePosition(int)>
	//   17   40:astore          6
		long l;
		try
		{
			obj = ((Object) (sFormatter.parse(((String) (obj)), parseposition)));
	//   18   42:getstatic       #1102 <Field SimpleDateFormat sFormatter>
	//   19   45:aload           5
	//   20   47:aload           6
	//   21   49:invokevirtual   #1854 <Method Date SimpleDateFormat.parse(String, ParsePosition)>
	//   22   52:astore          5
		}
	//*  23   54:aload           5
	//*  24   56:ifnonnull       63
	//*  25   59:ldc2w           #1662 <Long -1L>
	//*  26   62:lreturn         
	//*  27   63:aload           5
	//*  28   65:invokevirtual   #1859 <Method long Date.getTime()>
	//*  29   68:lstore_3        
	//*  30   69:aload_0         
	//*  31   70:ldc2            #792 <String "SubSecTime">
	//*  32   73:invokevirtual   #1188 <Method String getAttribute(String)>
	//*  33   76:astore          5
	//*  34   78:lload_3         
	//*  35   79:lstore_1        
	//*  36   80:aload           5
	//*  37   82:ifnull          112
	//*  38   85:aload           5
	//*  39   87:invokestatic    #1476 <Method long Long.parseLong(String)>
	//*  40   90:lstore_1        
	//*  41   91:lload_1         
	//*  42   92:ldc2w           #1860 <Long 1000L>
	//*  43   95:lcmp            
	//*  44   96:ifle            108
	//*  45   99:lload_1         
	//*  46  100:ldc2w           #1862 <Long 10L>
	//*  47  103:ldiv            
	//*  48  104:lstore_1        
	//*  49  105:goto            91
	//*  50  108:lload_3         
	//*  51  109:lload_1         
	//*  52  110:ladd            
	//*  53  111:lstore_1        
	//*  54  112:lload_1         
	//*  55  113:lreturn         
	//*  56  114:ldc2w           #1662 <Long -1L>
	//*  57  117:lreturn         
		catch(IllegalArgumentException illegalargumentexception)
	//*  58  118:astore          5
		{
			return -1L;
	//   59  120:ldc2w           #1662 <Long -1L>
	//   60  123:lreturn         
		}
		if(obj == null)
			return -1L;
		l1 = ((Date) (obj)).getTime();
		obj = ((Object) (getAttribute("SubSecTime")));
		l = l1;
		if(obj == null)
			break MISSING_BLOCK_LABEL_112;
		l = Long.parseLong(((String) (obj)));
_L2:
		if(l <= 1000L)
			break; /* Loop/switch isn't completed */
		l /= 10L;
		if(true) goto _L2; else goto _L1
_L1:
		l = l1 + l;
		return l;
		return -1L;
		NumberFormatException numberformatexception;
		numberformatexception;
	//   61  124:astore          5
		return l1;
	//   62  126:lload_3         
	//   63  127:lreturn         
	}

	public long getGpsDateTime()
	{
		Object obj = ((Object) (getAttribute("GPSDateStamp")));
	//    0    0:aload_0         
	//    1    1:ldc2            #496 <String "GPSDateStamp">
	//    2    4:invokevirtual   #1188 <Method String getAttribute(String)>
	//    3    7:astore_3        
		Object obj1 = ((Object) (getAttribute("GPSTimeStamp")));
	//    4    8:aload_0         
	//    5    9:ldc2            #574 <String "GPSTimeStamp">
	//    6   12:invokevirtual   #1188 <Method String getAttribute(String)>
	//    7   15:astore          4
		if(obj == null || obj1 == null)
			break MISSING_BLOCK_LABEL_130;
	//    8   17:aload_3         
	//    9   18:ifnull          130
	//   10   21:aload           4
	//   11   23:ifnull          130
		if(!sNonZeroTimePattern.matcher(((CharSequence) (obj))).matches() && !sNonZeroTimePattern.matcher(((CharSequence) (obj1))).matches())
	//*  12   26:getstatic       #1134 <Field Pattern sNonZeroTimePattern>
	//*  13   29:aload_3         
	//*  14   30:invokevirtual   #1842 <Method Matcher Pattern.matcher(CharSequence)>
	//*  15   33:invokevirtual   #1847 <Method boolean Matcher.matches()>
	//*  16   36:ifne            57
	//*  17   39:getstatic       #1134 <Field Pattern sNonZeroTimePattern>
	//*  18   42:aload           4
	//*  19   44:invokevirtual   #1842 <Method Matcher Pattern.matcher(CharSequence)>
	//*  20   47:invokevirtual   #1847 <Method boolean Matcher.matches()>
	//*  21   50:ifne            57
			return -1L;
	//   22   53:ldc2w           #1662 <Long -1L>
	//   23   56:lreturn         
		StringBuilder stringbuilder = new StringBuilder();
	//   24   57:new             #1221 <Class StringBuilder>
	//   25   60:dup             
	//   26   61:invokespecial   #1222 <Method void StringBuilder()>
	//   27   64:astore          5
		stringbuilder.append(((String) (obj)));
	//   28   66:aload           5
	//   29   68:aload_3         
	//   30   69:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   31   72:pop             
		stringbuilder.append(' ');
	//   32   73:aload           5
	//   33   75:bipush          32
	//   34   77:invokevirtual   #1867 <Method StringBuilder StringBuilder.append(char)>
	//   35   80:pop             
		stringbuilder.append(((String) (obj1)));
	//   36   81:aload           5
	//   37   83:aload           4
	//   38   85:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   39   88:pop             
		obj = ((Object) (stringbuilder.toString()));
	//   40   89:aload           5
	//   41   91:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//   42   94:astore_3        
		obj1 = ((Object) (new ParsePosition(0)));
	//   43   95:new             #1849 <Class ParsePosition>
	//   44   98:dup             
	//   45   99:iconst_0        
	//   46  100:invokespecial   #1850 <Method void ParsePosition(int)>
	//   47  103:astore          4
		long l;
		try
		{
			obj = ((Object) (sFormatter.parse(((String) (obj)), ((ParsePosition) (obj1)))));
	//   48  105:getstatic       #1102 <Field SimpleDateFormat sFormatter>
	//   49  108:aload_3         
	//   50  109:aload           4
	//   51  111:invokevirtual   #1854 <Method Date SimpleDateFormat.parse(String, ParsePosition)>
	//   52  114:astore_3        
		}
	//*  53  115:aload_3         
	//*  54  116:ifnonnull       123
	//*  55  119:ldc2w           #1662 <Long -1L>
	//*  56  122:lreturn         
	//*  57  123:aload_3         
	//*  58  124:invokevirtual   #1859 <Method long Date.getTime()>
	//*  59  127:lstore_1        
	//*  60  128:lload_1         
	//*  61  129:lreturn         
	//*  62  130:ldc2w           #1662 <Long -1L>
	//*  63  133:lreturn         
		catch(IllegalArgumentException illegalargumentexception)
	//*  64  134:astore_3        
		{
			return -1L;
	//   65  135:ldc2w           #1662 <Long -1L>
	//   66  138:lreturn         
		}
		if(obj == null)
			return -1L;
		l = ((Date) (obj)).getTime();
		return l;
		return -1L;
	}

	public boolean getLatLong(float af[])
	{
		double ad[] = getLatLong();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1872 <Method double[] getLatLong()>
	//    2    4:astore_2        
		if(ad == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       11
		{
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		} else
		{
			af[0] = (float)ad[0];
	//    7   11:aload_1         
	//    8   12:iconst_0        
	//    9   13:aload_2         
	//   10   14:iconst_0        
	//   11   15:daload          
	//   12   16:d2f             
	//   13   17:fastore         
			af[1] = (float)ad[1];
	//   14   18:aload_1         
	//   15   19:iconst_1        
	//   16   20:aload_2         
	//   17   21:iconst_1        
	//   18   22:daload          
	//   19   23:d2f             
	//   20   24:fastore         
			return true;
	//   21   25:iconst_1        
	//   22   26:ireturn         
		}
	}

	public double[] getLatLong()
	{
		String s;
		String s1;
		String s2;
		String s3;
		s = getAttribute("GPSLatitude");
	//    0    0:aload_0         
	//    1    1:ldc2            #541 <String "GPSLatitude">
	//    2    4:invokevirtual   #1188 <Method String getAttribute(String)>
	//    3    7:astore          5
		s1 = getAttribute("GPSLatitudeRef");
	//    4    9:aload_0         
	//    5   10:ldc2            #544 <String "GPSLatitudeRef">
	//    6   13:invokevirtual   #1188 <Method String getAttribute(String)>
	//    7   16:astore          6
		s2 = getAttribute("GPSLongitude");
	//    8   18:aload_0         
	//    9   19:ldc2            #547 <String "GPSLongitude">
	//   10   22:invokevirtual   #1188 <Method String getAttribute(String)>
	//   11   25:astore          7
		s3 = getAttribute("GPSLongitudeRef");
	//   12   27:aload_0         
	//   13   28:ldc2            #550 <String "GPSLongitudeRef">
	//   14   31:invokevirtual   #1188 <Method String getAttribute(String)>
	//   15   34:astore          8
		if(s == null || s1 == null || s2 == null || s3 == null) goto _L2; else goto _L1
	//   16   36:aload           5
	//   17   38:ifnull          150
	//   18   41:aload           6
	//   19   43:ifnull          150
	//   20   46:aload           7
	//   21   48:ifnull          150
	//   22   51:aload           8
	//   23   53:ifnull          150
_L1:
		double d;
		double d1;
		d = convertRationalLatLonToDouble(s, s1);
	//   24   56:aload           5
	//   25   58:aload           6
	//   26   60:invokestatic    #1875 <Method double convertRationalLatLonToDouble(String, String)>
	//   27   63:dstore_1        
		d1 = convertRationalLatLonToDouble(s2, s3);
	//   28   64:aload           7
	//   29   66:aload           8
	//   30   68:invokestatic    #1875 <Method double convertRationalLatLonToDouble(String, String)>
	//   31   71:dstore_3        
		return (new double[] {
			d, d1
		});
	//   32   72:iconst_2        
	//   33   73:newarray        double[]
	//   34   75:dup             
	//   35   76:iconst_0        
	//   36   77:dload_1         
	//   37   78:dastore         
	//   38   79:dup             
	//   39   80:iconst_1        
	//   40   81:dload_3         
	//   41   82:dastore         
	//   42   83:areturn         
_L4:
		StringBuilder stringbuilder = new StringBuilder();
	//   43   84:new             #1221 <Class StringBuilder>
	//   44   87:dup             
	//   45   88:invokespecial   #1222 <Method void StringBuilder()>
	//   46   91:astore          9
		stringbuilder.append("Latitude/longitude values are not parseable. ");
	//   47   93:aload           9
	//   48   95:ldc2            #1877 <String "Latitude/longitude values are not parseable. ">
	//   49   98:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   50  101:pop             
		stringbuilder.append(String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", new Object[] {
			s, s1, s2, s3
		}));
	//   51  102:aload           9
	//   52  104:ldc2            #1879 <String "latValue=%s, latRef=%s, lngValue=%s, lngRef=%s">
	//   53  107:iconst_4        
	//   54  108:anewarray       Object[]
	//   55  111:dup             
	//   56  112:iconst_0        
	//   57  113:aload           5
	//   58  115:aastore         
	//   59  116:dup             
	//   60  117:iconst_1        
	//   61  118:aload           6
	//   62  120:aastore         
	//   63  121:dup             
	//   64  122:iconst_2        
	//   65  123:aload           7
	//   66  125:aastore         
	//   67  126:dup             
	//   68  127:iconst_3        
	//   69  128:aload           8
	//   70  130:aastore         
	//   71  131:invokestatic    #1825 <Method String String.format(String, Object[])>
	//   72  134:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   73  137:pop             
		Log.w("ExifInterface", stringbuilder.toString());
	//   74  138:ldc2            #364 <String "ExifInterface">
	//   75  141:aload           9
	//   76  143:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//   77  146:invokestatic    #1408 <Method int Log.w(String, String)>
	//   78  149:pop             
_L2:
		return null;
	//   79  150:aconst_null     
	//   80  151:areturn         
		IllegalArgumentException illegalargumentexception;
		illegalargumentexception;
	//   81  152:astore          9
		if(true) goto _L4; else goto _L3
	//   82  154:goto            84
_L3:
	}

	public int getRotationDegrees()
	{
		switch(getAttributeInt("Orientation", 1))
	//*   0    0:aload_0         
	//*   1    1:ldc2            #680 <String "Orientation">
	//*   2    4:iconst_1        
	//*   3    5:invokevirtual   #1793 <Method int getAttributeInt(String, int)>
		{
	//*   4    8:tableswitch     3 8: default 48
	//	               3 57
	//	               4 57
	//	               5 53
	//	               6 50
	//	               7 50
	//	               8 53
		default:
			return 0;
	//    5   48:iconst_0        
	//    6   49:ireturn         

		case 6: // '\006'
		case 7: // '\007'
			return 90;
	//    7   50:bipush          90
	//    8   52:ireturn         

		case 5: // '\005'
		case 8: // '\b'
			return 270;
	//    9   53:sipush          270
	//   10   56:ireturn         

		case 3: // '\003'
		case 4: // '\004'
			return 180;
	//   11   57:sipush          180
	//   12   60:ireturn         
		}
	}

	public byte[] getThumbnail()
	{
		int i = mThumbnailCompression;
	//    0    0:aload_0         
	//    1    1:getfield        #1728 <Field int mThumbnailCompression>
	//    2    4:istore_1        
		if(i != 6 && i != 7)
	//*   3    5:iload_1         
	//*   4    6:bipush          6
	//*   5    8:icmpeq          22
	//*   6   11:iload_1         
	//*   7   12:bipush          7
	//*   8   14:icmpne          20
	//*   9   17:goto            22
			return null;
	//   10   20:aconst_null     
	//   11   21:areturn         
		else
			return getThumbnailBytes();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #1788 <Method byte[] getThumbnailBytes()>
	//   14   26:areturn         
	}

	public Bitmap getThumbnailBitmap()
	{
		if(!mHasThumbnail)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1503 <Field boolean mHasThumbnail>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		if(mThumbnailBytes == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #1509 <Field byte[] mThumbnailBytes>
	//*   7   13:ifnonnull       24
			mThumbnailBytes = getThumbnailBytes();
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #1788 <Method byte[] getThumbnailBytes()>
	//   11   21:putfield        #1509 <Field byte[] mThumbnailBytes>
		int i = mThumbnailCompression;
	//   12   24:aload_0         
	//   13   25:getfield        #1728 <Field int mThumbnailCompression>
	//   14   28:istore_1        
		if(i != 6 && i != 7)
	//*  15   29:iload_1         
	//*  16   30:bipush          6
	//*  17   32:icmpeq          187
	//*  18   35:iload_1         
	//*  19   36:bipush          7
	//*  20   38:icmpne          44
	//*  21   41:goto            187
		{
			if(i == 1)
	//*  22   44:iload_1         
	//*  23   45:iconst_1        
	//*  24   46:icmpne          185
			{
				int ai[] = new int[mThumbnailBytes.length / 3];
	//   25   49:aload_0         
	//   26   50:getfield        #1509 <Field byte[] mThumbnailBytes>
	//   27   53:arraylength     
	//   28   54:iconst_3        
	//   29   55:idiv            
	//   30   56:newarray        int[]
	//   31   58:astore_3        
				for(int j = 0; j < ai.length; j++)
	//*  32   59:iconst_0        
	//*  33   60:istore_1        
	//*  34   61:iload_1         
	//*  35   62:aload_3         
	//*  36   63:arraylength     
	//*  37   64:icmpge          113
				{
					byte abyte0[] = mThumbnailBytes;
	//   38   67:aload_0         
	//   39   68:getfield        #1509 <Field byte[] mThumbnailBytes>
	//   40   71:astore          4
					int l = j * 3;
	//   41   73:iload_1         
	//   42   74:iconst_3        
	//   43   75:imul            
	//   44   76:istore_2        
					ai[j] = (abyte0[l] << 16) + 0 + (abyte0[l + 1] << 8) + abyte0[l + 2];
	//   45   77:aload_3         
	//   46   78:iload_1         
	//   47   79:aload           4
	//   48   81:iload_2         
	//   49   82:baload          
	//   50   83:bipush          16
	//   51   85:ishl            
	//   52   86:iconst_0        
	//   53   87:iadd            
	//   54   88:aload           4
	//   55   90:iload_2         
	//   56   91:iconst_1        
	//   57   92:iadd            
	//   58   93:baload          
	//   59   94:bipush          8
	//   60   96:ishl            
	//   61   97:iadd            
	//   62   98:aload           4
	//   63  100:iload_2         
	//   64  101:iconst_2        
	//   65  102:iadd            
	//   66  103:baload          
	//   67  104:iadd            
	//   68  105:iastore         
				}

	//   69  106:iload_1         
	//   70  107:iconst_1        
	//   71  108:iadd            
	//   72  109:istore_1        
	//*  73  110:goto            61
				ExifAttribute exifattribute = (ExifAttribute)mAttributes[4].get("ImageLength");
	//   74  113:aload_0         
	//   75  114:getfield        #1146 <Field HashMap[] mAttributes>
	//   76  117:iconst_4        
	//   77  118:aaload          
	//   78  119:ldc2            #592 <String "ImageLength">
	//   79  122:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//   80  125:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//   81  128:astore          4
				ExifAttribute exifattribute1 = (ExifAttribute)mAttributes[4].get("ImageWidth");
	//   82  130:aload_0         
	//   83  131:getfield        #1146 <Field HashMap[] mAttributes>
	//   84  134:iconst_4        
	//   85  135:aaload          
	//   86  136:ldc2            #598 <String "ImageWidth">
	//   87  139:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//   88  142:checkcast       #12  <Class ExifInterface$ExifAttribute>
	//   89  145:astore          5
				if(exifattribute != null && exifattribute1 != null)
	//*  90  147:aload           4
	//*  91  149:ifnull          185
	//*  92  152:aload           5
	//*  93  154:ifnull          185
				{
					int k = exifattribute.getIntValue(mExifByteOrder);
	//   94  157:aload           4
	//   95  159:aload_0         
	//   96  160:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//   97  163:invokevirtual   #1495 <Method int ExifInterface$ExifAttribute.getIntValue(ByteOrder)>
	//   98  166:istore_1        
					return Bitmap.createBitmap(ai, exifattribute1.getIntValue(mExifByteOrder), k, android.graphics.Bitmap.Config.ARGB_8888);
	//   99  167:aload_3         
	//  100  168:aload           5
	//  101  170:aload_0         
	//  102  171:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//  103  174:invokevirtual   #1495 <Method int ExifInterface$ExifAttribute.getIntValue(ByteOrder)>
	//  104  177:iload_1         
	//  105  178:getstatic       #1889 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//  106  181:invokestatic    #1895 <Method Bitmap Bitmap.createBitmap(int[], int, int, android.graphics.Bitmap$Config)>
	//  107  184:areturn         
				}
			}
			return null;
	//  108  185:aconst_null     
	//  109  186:areturn         
		} else
		{
			return BitmapFactory.decodeByteArray(mThumbnailBytes, 0, mThumbnailLength);
	//  110  187:aload_0         
	//  111  188:getfield        #1509 <Field byte[] mThumbnailBytes>
	//  112  191:iconst_0        
	//  113  192:aload_0         
	//  114  193:getfield        #1507 <Field int mThumbnailLength>
	//  115  196:invokestatic    #1901 <Method Bitmap BitmapFactory.decodeByteArray(byte[], int, int)>
	//  116  199:areturn         
		}
	}

	public byte[] getThumbnailBytes()
	{
		if(!mHasThumbnail)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1503 <Field boolean mHasThumbnail>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		byte abyte0[] = mThumbnailBytes;
	//    5    9:aload_0         
	//    6   10:getfield        #1509 <Field byte[] mThumbnailBytes>
	//    7   13:astore_1        
		if(abyte0 != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          20
			return abyte0;
	//   10   18:aload_1         
	//   11   19:areturn         
		Object obj;
		if(mAssetInputStream == null)
			break MISSING_BLOCK_LABEL_78;
	//   12   20:aload_0         
	//   13   21:getfield        #1164 <Field android.content.res.AssetManager$AssetInputStream mAssetInputStream>
	//   14   24:ifnull          78
		obj = ((Object) (mAssetInputStream));
	//   15   27:aload_0         
	//   16   28:getfield        #1164 <Field android.content.res.AssetManager$AssetInputStream mAssetInputStream>
	//   17   31:astore_1        
		Object obj2;
		Object obj3;
		obj3 = obj;
	//   18   32:aload_1         
	//   19   33:astore_3        
		obj2 = obj;
	//   20   34:aload_1         
	//   21   35:astore_2        
		if(!((InputStream) (obj)).markSupported())
			break MISSING_BLOCK_LABEL_54;
	//   22   36:aload_1         
	//   23   37:invokevirtual   #1904 <Method boolean InputStream.markSupported()>
	//   24   40:ifeq            54
		obj3 = obj;
	//   25   43:aload_1         
	//   26   44:astore_3        
		obj2 = obj;
	//   27   45:aload_1         
	//   28   46:astore_2        
		((InputStream) (obj)).reset();
	//   29   47:aload_1         
	//   30   48:invokevirtual   #1905 <Method void InputStream.reset()>
		break MISSING_BLOCK_LABEL_102;
	//   31   51:goto            102
		obj3 = obj;
	//   32   54:aload_1         
	//   33   55:astore_3        
		obj2 = obj;
	//   34   56:aload_1         
	//   35   57:astore_2        
		Log.d("ExifInterface", "Cannot read thumbnail from inputstream without mark/reset support");
	//   36   58:ldc2            #364 <String "ExifInterface">
	//   37   61:ldc2            #1907 <String "Cannot read thumbnail from inputstream without mark/reset support">
	//   38   64:invokestatic    #1521 <Method int Log.d(String, String)>
	//   39   67:pop             
		closeQuietly(((Closeable) (obj)));
	//   40   68:aload_1         
	//   41   69:invokestatic    #1181 <Method void closeQuietly(Closeable)>
		return null;
	//   42   72:aconst_null     
	//   43   73:areturn         
	//*  44   74:astore_1        
	//*  45   75:goto            225
		if(mFilename != null)
	//*  46   78:aload_0         
	//*  47   79:getfield        #1160 <Field String mFilename>
	//*  48   82:ifnull          100
		{
			obj = ((Object) (new FileInputStream(mFilename)));
	//   49   85:new             #1176 <Class FileInputStream>
	//   50   88:dup             
	//   51   89:aload_0         
	//   52   90:getfield        #1160 <Field String mFilename>
	//   53   93:invokespecial   #1177 <Method void FileInputStream(String)>
	//   54   96:astore_1        
			break MISSING_BLOCK_LABEL_102;
	//   55   97:goto            102
		}
		obj = null;
	//   56  100:aconst_null     
	//   57  101:astore_1        
		if(obj == null)
			break MISSING_BLOCK_LABEL_204;
	//   58  102:aload_1         
	//   59  103:ifnull          204
		obj3 = obj;
	//   60  106:aload_1         
	//   61  107:astore_3        
		obj2 = obj;
	//   62  108:aload_1         
	//   63  109:astore_2        
		if(((InputStream) (obj)).skip(mThumbnailOffset) != (long)mThumbnailOffset)
			break MISSING_BLOCK_LABEL_189;
	//   64  110:aload_1         
	//   65  111:aload_0         
	//   66  112:getfield        #1505 <Field int mThumbnailOffset>
	//   67  115:i2l             
	//   68  116:invokevirtual   #1911 <Method long InputStream.skip(long)>
	//   69  119:aload_0         
	//   70  120:getfield        #1505 <Field int mThumbnailOffset>
	//   71  123:i2l             
	//   72  124:lcmp            
	//   73  125:ifne            189
		obj3 = obj;
	//   74  128:aload_1         
	//   75  129:astore_3        
		obj2 = obj;
	//   76  130:aload_1         
	//   77  131:astore_2        
		byte abyte1[] = new byte[mThumbnailLength];
	//   78  132:aload_0         
	//   79  133:getfield        #1507 <Field int mThumbnailLength>
	//   80  136:newarray        byte[]
	//   81  138:astore          4
		obj3 = obj;
	//   82  140:aload_1         
	//   83  141:astore_3        
		obj2 = obj;
	//   84  142:aload_1         
	//   85  143:astore_2        
		if(((InputStream) (obj)).read(abyte1) != mThumbnailLength)
			break MISSING_BLOCK_LABEL_174;
	//   86  144:aload_1         
	//   87  145:aload           4
	//   88  147:invokevirtual   #1278 <Method int InputStream.read(byte[])>
	//   89  150:aload_0         
	//   90  151:getfield        #1507 <Field int mThumbnailLength>
	//   91  154:icmpne          174
		obj3 = obj;
	//   92  157:aload_1         
	//   93  158:astore_3        
		obj2 = obj;
	//   94  159:aload_1         
	//   95  160:astore_2        
		mThumbnailBytes = abyte1;
	//   96  161:aload_0         
	//   97  162:aload           4
	//   98  164:putfield        #1509 <Field byte[] mThumbnailBytes>
		closeQuietly(((Closeable) (obj)));
	//   99  167:aload_1         
	//  100  168:invokestatic    #1181 <Method void closeQuietly(Closeable)>
		return abyte1;
	//  101  171:aload           4
	//  102  173:areturn         
		obj3 = obj;
	//  103  174:aload_1         
	//  104  175:astore_3        
		obj2 = obj;
	//  105  176:aload_1         
	//  106  177:astore_2        
		try
		{
			throw new IOException("Corrupted image");
	//  107  178:new             #1142 <Class IOException>
	//  108  181:dup             
	//  109  182:ldc2            #1913 <String "Corrupted image">
	//  110  185:invokespecial   #1316 <Method void IOException(String)>
	//  111  188:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
		break MISSING_BLOCK_LABEL_225;
		obj3 = obj;
	//  112  189:aload_1         
	//  113  190:astore_3        
		obj2 = obj;
	//  114  191:aload_1         
	//  115  192:astore_2        
		throw new IOException("Corrupted image");
	//  116  193:new             #1142 <Class IOException>
	//  117  196:dup             
	//  118  197:ldc2            #1913 <String "Corrupted image">
	//  119  200:invokespecial   #1316 <Method void IOException(String)>
	//  120  203:athrow          
		obj3 = obj;
	//  121  204:aload_1         
	//  122  205:astore_3        
		obj2 = obj;
	//  123  206:aload_1         
	//  124  207:astore_2        
		throw new FileNotFoundException();
	//  125  208:new             #1915 <Class FileNotFoundException>
	//  126  211:dup             
	//  127  212:invokespecial   #1916 <Method void FileNotFoundException()>
	//  128  215:athrow          
		Object obj1;
		obj1;
	//  129  216:astore_1        
		obj2 = null;
	//  130  217:aconst_null     
	//  131  218:astore_2        
		break MISSING_BLOCK_LABEL_245;
	//  132  219:goto            245
		obj1;
	//  133  222:astore_1        
		obj3 = null;
	//  134  223:aconst_null     
	//  135  224:astore_3        
		obj2 = obj3;
	//  136  225:aload_3         
	//  137  226:astore_2        
		Log.d("ExifInterface", "Encountered exception while getting thumbnail", ((Throwable) (obj1)));
	//  138  227:ldc2            #364 <String "ExifInterface">
	//  139  230:ldc2            #1918 <String "Encountered exception while getting thumbnail">
	//  140  233:aload_1         
	//  141  234:invokestatic    #1921 <Method int Log.d(String, String, Throwable)>
	//  142  237:pop             
		closeQuietly(((Closeable) (obj3)));
	//  143  238:aload_3         
	//  144  239:invokestatic    #1181 <Method void closeQuietly(Closeable)>
		return null;
	//  145  242:aconst_null     
	//  146  243:areturn         
		obj1;
	//  147  244:astore_1        
		closeQuietly(((Closeable) (obj2)));
	//  148  245:aload_2         
	//  149  246:invokestatic    #1181 <Method void closeQuietly(Closeable)>
		throw obj1;
	//  150  249:aload_1         
	//  151  250:athrow          
	}

	public long[] getThumbnailRange()
	{
		if(!mHasThumbnail)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1503 <Field boolean mHasThumbnail>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return (new long[] {
				(long)mThumbnailOffset, (long)mThumbnailLength
			});
	//    5    9:iconst_2        
	//    6   10:newarray        long[]
	//    7   12:dup             
	//    8   13:iconst_0        
	//    9   14:aload_0         
	//   10   15:getfield        #1505 <Field int mThumbnailOffset>
	//   11   18:i2l             
	//   12   19:lastore         
	//   13   20:dup             
	//   14   21:iconst_1        
	//   15   22:aload_0         
	//   16   23:getfield        #1507 <Field int mThumbnailLength>
	//   17   26:i2l             
	//   18   27:lastore         
	//   19   28:areturn         
	}

	public boolean hasThumbnail()
	{
		return mHasThumbnail;
	//    0    0:aload_0         
	//    1    1:getfield        #1503 <Field boolean mHasThumbnail>
	//    2    4:ireturn         
	}

	public boolean isFlipped()
	{
		int i = getAttributeInt("Orientation", 1);
	//    0    0:aload_0         
	//    1    1:ldc2            #680 <String "Orientation">
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #1793 <Method int getAttributeInt(String, int)>
	//    4    8:istore_1        
		if(i != 2 && i != 7)
	//*   5    9:iload_1         
	//*   6   10:iconst_2        
	//*   7   11:icmpeq          46
	//*   8   14:iload_1         
	//*   9   15:bipush          7
	//*  10   17:icmpeq          46
			switch(i)
	//*  11   20:iload_1         
			{
	//*  12   21:tableswitch     4 5: default 44
	//	               4 46
	//	               5 46
			default:
				return false;
	//   13   44:iconst_0        
	//   14   45:ireturn         

			case 4: // '\004'
			case 5: // '\005'
				break;
			}
		return true;
	//   15   46:iconst_1        
	//   16   47:ireturn         
	}

	public boolean isThumbnailCompressed()
	{
		int i = mThumbnailCompression;
	//    0    0:aload_0         
	//    1    1:getfield        #1728 <Field int mThumbnailCompression>
	//    2    4:istore_1        
		return i == 6 || i == 7;
	//    3    5:iload_1         
	//    4    6:bipush          6
	//    5    8:icmpeq          22
	//    6   11:iload_1         
	//    7   12:bipush          7
	//    8   14:icmpne          20
	//    9   17:goto            22
	//   10   20:iconst_0        
	//   11   21:ireturn         
	//   12   22:iconst_1        
	//   13   23:ireturn         
	}

	public void resetOrientation()
	{
		setAttribute("Orientation", Integer.toString(1));
	//    0    0:aload_0         
	//    1    1:ldc2            #680 <String "Orientation">
	//    2    4:iconst_1        
	//    3    5:invokestatic    #1795 <Method String Integer.toString(int)>
	//    4    8:invokevirtual   #1799 <Method void setAttribute(String, String)>
	//    5   11:return          
	}

	public void rotate(int i)
	{
		if(i % 90 == 0)
	//*   0    0:iload_1         
	//*   1    1:bipush          90
	//*   2    3:irem            
	//*   3    4:ifne            172
		{
			int l = getAttributeInt("Orientation", 1);
	//    4    7:aload_0         
	//    5    8:ldc2            #680 <String "Orientation">
	//    6   11:iconst_1        
	//    7   12:invokevirtual   #1793 <Method int getAttributeInt(String, int)>
	//    8   15:istore          5
			boolean flag1 = ROTATION_ORDER.contains(((Object) (Integer.valueOf(l))));
	//    9   17:getstatic       #903 <Field List ROTATION_ORDER>
	//   10   20:iload           5
	//   11   22:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//   12   25:invokeinterface #1931 <Method boolean List.contains(Object)>
	//   13   30:istore          6
			int k = 0;
	//   14   32:iconst_0        
	//   15   33:istore_3        
			boolean flag = false;
	//   16   34:iconst_0        
	//   17   35:istore          4
			int j = 0;
	//   18   37:iconst_0        
	//   19   38:istore_2        
			if(flag1)
	//*  20   39:iload           6
	//*  21   41:ifeq            94
			{
				k = (ROTATION_ORDER.indexOf(((Object) (Integer.valueOf(l)))) + i / 90) % 4;
	//   22   44:getstatic       #903 <Field List ROTATION_ORDER>
	//   23   47:iload           5
	//   24   49:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//   25   52:invokeinterface #1935 <Method int List.indexOf(Object)>
	//   26   57:iload_1         
	//   27   58:bipush          90
	//   28   60:idiv            
	//   29   61:iadd            
	//   30   62:iconst_4        
	//   31   63:irem            
	//   32   64:istore_3        
				i = j;
	//   33   65:iload_2         
	//   34   66:istore_1        
				if(k < 0)
	//*  35   67:iload_3         
	//*  36   68:ifge            73
					i = 4;
	//   37   71:iconst_4        
	//   38   72:istore_1        
				j = ((Integer)ROTATION_ORDER.get(k + i)).intValue();
	//   39   73:getstatic       #903 <Field List ROTATION_ORDER>
	//   40   76:iload_3         
	//   41   77:iload_1         
	//   42   78:iadd            
	//   43   79:invokeinterface #1938 <Method Object List.get(int)>
	//   44   84:checkcast       #891 <Class Integer>
	//   45   87:invokevirtual   #1463 <Method int Integer.intValue()>
	//   46   90:istore_2        
			} else
	//*  47   91:goto            160
			{
				j = ((int) (flag));
	//   48   94:iload           4
	//   49   96:istore_2        
				if(FLIPPED_ROTATION_ORDER.contains(((Object) (Integer.valueOf(l)))))
	//*  50   97:getstatic       #905 <Field List FLIPPED_ROTATION_ORDER>
	//*  51  100:iload           5
	//*  52  102:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//*  53  105:invokeinterface #1931 <Method boolean List.contains(Object)>
	//*  54  110:ifeq            160
				{
					j = (FLIPPED_ROTATION_ORDER.indexOf(((Object) (Integer.valueOf(l)))) + i / 90) % 4;
	//   55  113:getstatic       #905 <Field List FLIPPED_ROTATION_ORDER>
	//   56  116:iload           5
	//   57  118:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//   58  121:invokeinterface #1935 <Method int List.indexOf(Object)>
	//   59  126:iload_1         
	//   60  127:bipush          90
	//   61  129:idiv            
	//   62  130:iadd            
	//   63  131:iconst_4        
	//   64  132:irem            
	//   65  133:istore_2        
					i = k;
	//   66  134:iload_3         
	//   67  135:istore_1        
					if(j < 0)
	//*  68  136:iload_2         
	//*  69  137:ifge            142
						i = 4;
	//   70  140:iconst_4        
	//   71  141:istore_1        
					j = ((Integer)FLIPPED_ROTATION_ORDER.get(j + i)).intValue();
	//   72  142:getstatic       #905 <Field List FLIPPED_ROTATION_ORDER>
	//   73  145:iload_2         
	//   74  146:iload_1         
	//   75  147:iadd            
	//   76  148:invokeinterface #1938 <Method Object List.get(int)>
	//   77  153:checkcast       #891 <Class Integer>
	//   78  156:invokevirtual   #1463 <Method int Integer.intValue()>
	//   79  159:istore_2        
				}
			}
			setAttribute("Orientation", Integer.toString(j));
	//   80  160:aload_0         
	//   81  161:ldc2            #680 <String "Orientation">
	//   82  164:iload_2         
	//   83  165:invokestatic    #1795 <Method String Integer.toString(int)>
	//   84  168:invokevirtual   #1799 <Method void setAttribute(String, String)>
			return;
	//   85  171:return          
		} else
		{
			throw new IllegalArgumentException("degree should be a multiple of 90");
	//   86  172:new             #1169 <Class IllegalArgumentException>
	//   87  175:dup             
	//   88  176:ldc2            #1940 <String "degree should be a multiple of 90">
	//   89  179:invokespecial   #1172 <Method void IllegalArgumentException(String)>
	//   90  182:athrow          
		}
	}

	public void saveAttributes()
		throws IOException
	{
		Object obj;
		File file;
		if(!mIsSupportedFile || mMimeType != 4)
			break MISSING_BLOCK_LABEL_219;
	//    0    0:aload_0         
	//    1    1:getfield        #1560 <Field boolean mIsSupportedFile>
	//    2    4:ifeq            219
	//    3    7:aload_0         
	//    4    8:getfield        #1441 <Field int mMimeType>
	//    5   11:iconst_4        
	//    6   12:icmpne          219
		if(mFilename == null)
			break MISSING_BLOCK_LABEL_208;
	//    7   15:aload_0         
	//    8   16:getfield        #1160 <Field String mFilename>
	//    9   19:ifnull          208
		mThumbnailBytes = getThumbnail();
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:invokevirtual   #1943 <Method byte[] getThumbnail()>
	//   13   27:putfield        #1509 <Field byte[] mThumbnailBytes>
		StringBuilder stringbuilder = new StringBuilder();
	//   14   30:new             #1221 <Class StringBuilder>
	//   15   33:dup             
	//   16   34:invokespecial   #1222 <Method void StringBuilder()>
	//   17   37:astore_1        
		stringbuilder.append(mFilename);
	//   18   38:aload_1         
	//   19   39:aload_0         
	//   20   40:getfield        #1160 <Field String mFilename>
	//   21   43:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   22   46:pop             
		stringbuilder.append(".tmp");
	//   23   47:aload_1         
	//   24   48:ldc2            #1945 <String ".tmp">
	//   25   51:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   26   54:pop             
		file = new File(stringbuilder.toString());
	//   27   55:new             #1947 <Class File>
	//   28   58:dup             
	//   29   59:aload_1         
	//   30   60:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//   31   63:invokespecial   #1948 <Method void File(String)>
	//   32   66:astore          5
		if(!(new File(mFilename)).renameTo(file))
			break MISSING_BLOCK_LABEL_170;
	//   33   68:new             #1947 <Class File>
	//   34   71:dup             
	//   35   72:aload_0         
	//   36   73:getfield        #1160 <Field String mFilename>
	//   37   76:invokespecial   #1948 <Method void File(String)>
	//   38   79:aload           5
	//   39   81:invokevirtual   #1952 <Method boolean File.renameTo(File)>
	//   40   84:ifeq            170
		obj = null;
	//   41   87:aconst_null     
	//   42   88:astore_2        
		FileInputStream fileinputstream = new FileInputStream(file);
	//   43   89:new             #1176 <Class FileInputStream>
	//   44   92:dup             
	//   45   93:aload           5
	//   46   95:invokespecial   #1955 <Method void FileInputStream(File)>
	//   47   98:astore_3        
		FileOutputStream fileoutputstream = new FileOutputStream(mFilename);
	//   48   99:new             #1957 <Class FileOutputStream>
	//   49  102:dup             
	//   50  103:aload_0         
	//   51  104:getfield        #1160 <Field String mFilename>
	//   52  107:invokespecial   #1958 <Method void FileOutputStream(String)>
	//   53  110:astore          4
		saveJpegAttributes(((InputStream) (fileinputstream)), ((OutputStream) (fileoutputstream)));
	//   54  112:aload_0         
	//   55  113:aload_3         
	//   56  114:aload           4
	//   57  116:invokespecial   #1960 <Method void saveJpegAttributes(InputStream, OutputStream)>
		closeQuietly(((Closeable) (fileinputstream)));
	//   58  119:aload_3         
	//   59  120:invokestatic    #1181 <Method void closeQuietly(Closeable)>
		closeQuietly(((Closeable) (fileoutputstream)));
	//   60  123:aload           4
	//   61  125:invokestatic    #1181 <Method void closeQuietly(Closeable)>
		file.delete();
	//   62  128:aload           5
	//   63  130:invokevirtual   #1963 <Method boolean File.delete()>
	//   64  133:pop             
		mThumbnailBytes = null;
	//   65  134:aload_0         
	//   66  135:aconst_null     
	//   67  136:putfield        #1509 <Field byte[] mThumbnailBytes>
		return;
	//   68  139:return          
		Exception exception;
		exception;
	//   69  140:astore_1        
		obj = ((Object) (fileoutputstream));
	//   70  141:aload           4
	//   71  143:astore_2        
		break MISSING_BLOCK_LABEL_154;
	//   72  144:goto            154
		exception;
	//   73  147:astore_1        
		break MISSING_BLOCK_LABEL_154;
	//   74  148:goto            154
		exception;
	//   75  151:astore_1        
		fileinputstream = null;
	//   76  152:aconst_null     
	//   77  153:astore_3        
		closeQuietly(((Closeable) (fileinputstream)));
	//   78  154:aload_3         
	//   79  155:invokestatic    #1181 <Method void closeQuietly(Closeable)>
		closeQuietly(((Closeable) (obj)));
	//   80  158:aload_2         
	//   81  159:invokestatic    #1181 <Method void closeQuietly(Closeable)>
		file.delete();
	//   82  162:aload           5
	//   83  164:invokevirtual   #1963 <Method boolean File.delete()>
	//   84  167:pop             
		throw exception;
	//   85  168:aload_1         
	//   86  169:athrow          
		StringBuilder stringbuilder1 = new StringBuilder();
	//   87  170:new             #1221 <Class StringBuilder>
	//   88  173:dup             
	//   89  174:invokespecial   #1222 <Method void StringBuilder()>
	//   90  177:astore_1        
		stringbuilder1.append("Could not rename to ");
	//   91  178:aload_1         
	//   92  179:ldc2            #1965 <String "Could not rename to ">
	//   93  182:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   94  185:pop             
		stringbuilder1.append(file.getAbsolutePath());
	//   95  186:aload_1         
	//   96  187:aload           5
	//   97  189:invokevirtual   #1968 <Method String File.getAbsolutePath()>
	//   98  192:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   99  195:pop             
		throw new IOException(stringbuilder1.toString());
	//  100  196:new             #1142 <Class IOException>
	//  101  199:dup             
	//  102  200:aload_1         
	//  103  201:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//  104  204:invokespecial   #1316 <Method void IOException(String)>
	//  105  207:athrow          
		throw new IOException("ExifInterface does not support saving attributes for the current input.");
	//  106  208:new             #1142 <Class IOException>
	//  107  211:dup             
	//  108  212:ldc2            #1970 <String "ExifInterface does not support saving attributes for the current input.">
	//  109  215:invokespecial   #1316 <Method void IOException(String)>
	//  110  218:athrow          
		throw new IOException("ExifInterface only supports saving attributes on JPEG formats.");
	//  111  219:new             #1142 <Class IOException>
	//  112  222:dup             
	//  113  223:ldc2            #1972 <String "ExifInterface only supports saving attributes on JPEG formats.">
	//  114  226:invokespecial   #1316 <Method void IOException(String)>
	//  115  229:athrow          
	}

	public void setAltitude(double d)
	{
		String s;
		if(d >= 0.0D)
	//*   0    0:dload_1         
	//*   1    1:dconst_0        
	//*   2    2:dcmpl           
	//*   3    3:iflt            13
			s = "0";
	//    4    6:ldc2            #1976 <String "0">
	//    5    9:astore_3        
		else
	//*   6   10:goto            17
			s = "1";
	//    7   13:ldc2            #1978 <String "1">
	//    8   16:astore_3        
		setAttribute("GPSAltitude", (new Rational(Math.abs(d))).toString());
	//    9   17:aload_0         
	//   10   18:ldc2            #487 <String "GPSAltitude">
	//   11   21:new             #21  <Class ExifInterface$Rational>
	//   12   24:dup             
	//   13   25:dload_1         
	//   14   26:invokestatic    #1981 <Method double Math.abs(double)>
	//   15   29:invokespecial   #1983 <Method void ExifInterface$Rational(double)>
	//   16   32:invokevirtual   #1984 <Method String ExifInterface$Rational.toString()>
	//   17   35:invokevirtual   #1799 <Method void setAttribute(String, String)>
		setAttribute("GPSAltitudeRef", s);
	//   18   38:aload_0         
	//   19   39:ldc2            #490 <String "GPSAltitudeRef">
	//   20   42:aload_3         
	//   21   43:invokevirtual   #1799 <Method void setAttribute(String, String)>
	//   22   46:return          
	}

	public void setAttribute(String s, String s1)
	{
		String s3 = s1;
	//    0    0:aload_2         
	//    1    1:astore          7
		String s2;
		if("ISOSpeedRatings".equals(((Object) (s))))
	//*   2    3:ldc2            #616 <String "ISOSpeedRatings">
	//*   3    6:aload_1         
	//*   4    7:invokevirtual   #1264 <Method boolean String.equals(Object)>
	//*   5   10:ifeq            21
			s2 = "PhotographicSensitivity";
	//    6   13:ldc2            #683 <String "PhotographicSensitivity">
	//    7   16:astore          6
		else
	//*   8   18:goto            24
			s2 = s;
	//    9   21:aload_1         
	//   10   22:astore          6
		int i = 1;
	//   11   24:iconst_1        
	//   12   25:istore_3        
		s = s3;
	//   13   26:aload           7
	//   14   28:astore_1        
		if(s3 != null)
	//*  15   29:aload           7
	//*  16   31:ifnull          272
		{
			s = s3;
	//   17   34:aload           7
	//   18   36:astore_1        
			if(sTagSetForCompatibility.contains(((Object) (s2))))
	//*  19   37:getstatic       #1071 <Field HashSet sTagSetForCompatibility>
	//*  20   40:aload           6
	//*  21   42:invokevirtual   #1811 <Method boolean HashSet.contains(Object)>
	//*  22   45:ifeq            272
				if(s2.equals("GPSTimeStamp"))
	//*  23   48:aload           6
	//*  24   50:ldc2            #574 <String "GPSTimeStamp">
	//*  25   53:invokevirtual   #1264 <Method boolean String.equals(Object)>
	//*  26   56:ifeq            204
				{
					s = ((String) (sGpsTimestampPattern.matcher(((CharSequence) (s3)))));
	//   27   59:getstatic       #1138 <Field Pattern sGpsTimestampPattern>
	//   28   62:aload           7
	//   29   64:invokevirtual   #1842 <Method Matcher Pattern.matcher(CharSequence)>
	//   30   67:astore_1        
					if(!((Matcher) (s)).find())
	//*  31   68:aload_1         
	//*  32   69:invokevirtual   #1987 <Method boolean Matcher.find()>
	//*  33   72:ifne            125
					{
						s = ((String) (new StringBuilder()));
	//   34   75:new             #1221 <Class StringBuilder>
	//   35   78:dup             
	//   36   79:invokespecial   #1222 <Method void StringBuilder()>
	//   37   82:astore_1        
						((StringBuilder) (s)).append("Invalid value for ");
	//   38   83:aload_1         
	//   39   84:ldc2            #1989 <String "Invalid value for ">
	//   40   87:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   41   90:pop             
						((StringBuilder) (s)).append(s2);
	//   42   91:aload_1         
	//   43   92:aload           6
	//   44   94:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   45   97:pop             
						((StringBuilder) (s)).append(" : ");
	//   46   98:aload_1         
	//   47   99:ldc2            #1991 <String " : ">
	//   48  102:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   49  105:pop             
						((StringBuilder) (s)).append(s3);
	//   50  106:aload_1         
	//   51  107:aload           7
	//   52  109:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   53  112:pop             
						Log.w("ExifInterface", ((StringBuilder) (s)).toString());
	//   54  113:ldc2            #364 <String "ExifInterface">
	//   55  116:aload_1         
	//   56  117:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//   57  120:invokestatic    #1408 <Method int Log.w(String, String)>
	//   58  123:pop             
						return;
	//   59  124:return          
					}
					s1 = ((String) (new StringBuilder()));
	//   60  125:new             #1221 <Class StringBuilder>
	//   61  128:dup             
	//   62  129:invokespecial   #1222 <Method void StringBuilder()>
	//   63  132:astore_2        
					((StringBuilder) (s1)).append(Integer.parseInt(((Matcher) (s)).group(1)));
	//   64  133:aload_2         
	//   65  134:aload_1         
	//   66  135:iconst_1        
	//   67  136:invokevirtual   #1994 <Method String Matcher.group(int)>
	//   68  139:invokestatic    #1998 <Method int Integer.parseInt(String)>
	//   69  142:invokevirtual   #1569 <Method StringBuilder StringBuilder.append(int)>
	//   70  145:pop             
					((StringBuilder) (s1)).append("/1,");
	//   71  146:aload_2         
	//   72  147:ldc2            #1228 <String "/1,">
	//   73  150:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   74  153:pop             
					((StringBuilder) (s1)).append(Integer.parseInt(((Matcher) (s)).group(2)));
	//   75  154:aload_2         
	//   76  155:aload_1         
	//   77  156:iconst_2        
	//   78  157:invokevirtual   #1994 <Method String Matcher.group(int)>
	//   79  160:invokestatic    #1998 <Method int Integer.parseInt(String)>
	//   80  163:invokevirtual   #1569 <Method StringBuilder StringBuilder.append(int)>
	//   81  166:pop             
					((StringBuilder) (s1)).append("/1,");
	//   82  167:aload_2         
	//   83  168:ldc2            #1228 <String "/1,">
	//   84  171:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   85  174:pop             
					((StringBuilder) (s1)).append(Integer.parseInt(((Matcher) (s)).group(3)));
	//   86  175:aload_2         
	//   87  176:aload_1         
	//   88  177:iconst_3        
	//   89  178:invokevirtual   #1994 <Method String Matcher.group(int)>
	//   90  181:invokestatic    #1998 <Method int Integer.parseInt(String)>
	//   91  184:invokevirtual   #1569 <Method StringBuilder StringBuilder.append(int)>
	//   92  187:pop             
					((StringBuilder) (s1)).append("/1");
	//   93  188:aload_2         
	//   94  189:ldc2            #2000 <String "/1">
	//   95  192:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   96  195:pop             
					s = ((StringBuilder) (s1)).toString();
	//   97  196:aload_2         
	//   98  197:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//   99  200:astore_1        
				} else
	//* 100  201:goto            272
				{
					try
					{
						s = (new Rational(Double.parseDouble(s1))).toString();
	//  101  204:new             #21  <Class ExifInterface$Rational>
	//  102  207:dup             
	//  103  208:aload_2         
	//  104  209:invokestatic    #1260 <Method double Double.parseDouble(String)>
	//  105  212:invokespecial   #1983 <Method void ExifInterface$Rational(double)>
	//  106  215:invokevirtual   #1984 <Method String ExifInterface$Rational.toString()>
	//  107  218:astore_1        
					}
	//* 108  219:goto            272
	//* 109  222:new             #1221 <Class StringBuilder>
	//* 110  225:dup             
	//* 111  226:invokespecial   #1222 <Method void StringBuilder()>
	//* 112  229:astore_1        
	//* 113  230:aload_1         
	//* 114  231:ldc2            #1989 <String "Invalid value for ">
	//* 115  234:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//* 116  237:pop             
	//* 117  238:aload_1         
	//* 118  239:aload           6
	//* 119  241:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//* 120  244:pop             
	//* 121  245:aload_1         
	//* 122  246:ldc2            #1991 <String " : ">
	//* 123  249:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//* 124  252:pop             
	//* 125  253:aload_1         
	//* 126  254:aload           7
	//* 127  256:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//* 128  259:pop             
	//* 129  260:ldc2            #364 <String "ExifInterface">
	//* 130  263:aload_1         
	//* 131  264:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//* 132  267:invokestatic    #1408 <Method int Log.w(String, String)>
	//* 133  270:pop             
	//* 134  271:return          
	//* 135  272:iconst_0        
	//* 136  273:istore          5
	//* 137  275:iload           5
	//* 138  277:getstatic       #1052 <Field ExifInterface$ExifTag[][] EXIF_TAGS>
	//* 139  280:arraylength     
	//* 140  281:icmpge          1356
	//* 141  284:iload           5
	//* 142  286:iconst_4        
	//* 143  287:icmpne          300
	//* 144  290:aload_0         
	//* 145  291:getfield        #1503 <Field boolean mHasThumbnail>
	//* 146  294:ifne            300
	//* 147  297:goto            1347
	//* 148  300:getstatic       #1064 <Field HashMap[] sExifTagMapsForWriting>
	//* 149  303:iload           5
	//* 150  305:aaload          
	//* 151  306:aload           6
	//* 152  308:invokevirtual   #1290 <Method Object HashMap.get(Object)>
	//* 153  311:checkcast       #15  <Class ExifInterface$ExifTag>
	//* 154  314:astore_2        
	//* 155  315:aload_2         
	//* 156  316:ifnull          1347
	//* 157  319:aload_1         
	//* 158  320:ifnonnull       339
	//* 159  323:aload_0         
	//* 160  324:getfield        #1146 <Field HashMap[] mAttributes>
	//* 161  327:iload           5
	//* 162  329:aaload          
	//* 163  330:aload           6
	//* 164  332:invokevirtual   #1693 <Method Object HashMap.remove(Object)>
	//* 165  335:pop             
	//* 166  336:goto            1347
	//* 167  339:aload_1         
	//* 168  340:invokestatic    #1454 <Method Pair guessDataFormat(String)>
	//* 169  343:astore          8
	//* 170  345:aload_2         
	//* 171  346:getfield        #1651 <Field int ExifInterface$ExifTag.primaryFormat>
	//* 172  349:aload           8
	//* 173  351:getfield        #1460 <Field Object Pair.first>
	//* 174  354:checkcast       #891 <Class Integer>
	//* 175  357:invokevirtual   #1463 <Method int Integer.intValue()>
	//* 176  360:icmpeq          716
	//* 177  363:aload_2         
	//* 178  364:getfield        #1651 <Field int ExifInterface$ExifTag.primaryFormat>
	//* 179  367:aload           8
	//* 180  369:getfield        #1467 <Field Object Pair.second>
	//* 181  372:checkcast       #891 <Class Integer>
	//* 182  375:invokevirtual   #1463 <Method int Integer.intValue()>
	//* 183  378:icmpne          384
	//* 184  381:goto            716
	//* 185  384:aload_2         
	//* 186  385:getfield        #2003 <Field int ExifInterface$ExifTag.secondaryFormat>
	//* 187  388:iconst_m1       
	//* 188  389:icmpeq          437
	//* 189  392:aload_2         
	//* 190  393:getfield        #2003 <Field int ExifInterface$ExifTag.secondaryFormat>
	//* 191  396:aload           8
	//* 192  398:getfield        #1460 <Field Object Pair.first>
	//* 193  401:checkcast       #891 <Class Integer>
	//* 194  404:invokevirtual   #1463 <Method int Integer.intValue()>
	//* 195  407:icmpeq          428
	//* 196  410:aload_2         
	//* 197  411:getfield        #2003 <Field int ExifInterface$ExifTag.secondaryFormat>
	//* 198  414:aload           8
	//* 199  416:getfield        #1467 <Field Object Pair.second>
	//* 200  419:checkcast       #891 <Class Integer>
	//* 201  422:invokevirtual   #1463 <Method int Integer.intValue()>
	//* 202  425:icmpne          437
	//* 203  428:aload_2         
	//* 204  429:getfield        #2003 <Field int ExifInterface$ExifTag.secondaryFormat>
	//* 205  432:istore          4
	//* 206  434:goto            722
	//* 207  437:aload_2         
	//* 208  438:getfield        #1651 <Field int ExifInterface$ExifTag.primaryFormat>
	//* 209  441:iload_3         
	//* 210  442:icmpeq          707
	//* 211  445:aload_2         
	//* 212  446:getfield        #1651 <Field int ExifInterface$ExifTag.primaryFormat>
	//* 213  449:bipush          7
	//* 214  451:icmpeq          707
	//* 215  454:aload_2         
	//* 216  455:getfield        #1651 <Field int ExifInterface$ExifTag.primaryFormat>
	//* 217  458:iconst_2        
	//* 218  459:icmpne          465
	//* 219  462:goto            707
	//* 220  465:new             #1221 <Class StringBuilder>
	//* 221  468:dup             
	//* 222  469:invokespecial   #1222 <Method void StringBuilder()>
	//* 223  472:astore          7
	//* 224  474:aload           7
	//* 225  476:ldc2            #2005 <String "Given tag (">
	//* 226  479:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//* 227  482:pop             
	//* 228  483:aload           7
	//* 229  485:aload           6
	//* 230  487:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//* 231  490:pop             
	//* 232  491:aload           7
	//* 233  493:ldc2            #2007 <String ") value didn't match with one of expected ">
	//* 234  496:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//* 235  499:pop             
	//* 236  500:aload           7
	//* 237  502:ldc2            #2009 <String "formats: ">
	//* 238  505:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//* 239  508:pop             
	//* 240  509:aload           7
	//* 241  511:getstatic       #954 <Field String[] IFD_FORMAT_NAMES>
	//* 242  514:aload_2         
	//* 243  515:getfield        #1651 <Field int ExifInterface$ExifTag.primaryFormat>
	//* 244  518:aaload          
	//* 245  519:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//* 246  522:pop             
	//* 247  523:aload_2         
	//* 248  524:getfield        #2003 <Field int ExifInterface$ExifTag.secondaryFormat>
	//* 249  527:iconst_m1       
	//* 250  528:icmpne          538
	//* 251  531:ldc2            #928 <String "">
	//* 252  534:astore_2        
	//* 253  535:goto            576
	//* 254  538:new             #1221 <Class StringBuilder>
	//* 255  541:dup             
	//* 256  542:invokespecial   #1222 <Method void StringBuilder()>
	//* 257  545:astore          9
	//* 258  547:aload           9
	//* 259  549:ldc2            #2011 <String ", ">
	//* 260  552:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//* 261  555:pop             
	//* 262  556:aload           9
	//* 263  558:getstatic       #954 <Field String[] IFD_FORMAT_NAMES>
	//* 264  561:aload_2         
	//* 265  562:getfield        #2003 <Field int ExifInterface$ExifTag.secondaryFormat>
	//* 266  565:aaload          
	//* 267  566:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//* 268  569:pop             
	//* 269  570:aload           9
	//* 270  572:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//* 271  575:astore_2        
	//* 272  576:aload           7
	//* 273  578:aload_2         
	//* 274  579:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//* 275  582:pop             
	//* 276  583:aload           7
	//* 277  585:ldc2            #2013 <String " (guess: ">
	//* 278  588:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//* 279  591:pop             
	//* 280  592:aload           7
	//* 281  594:getstatic       #954 <Field String[] IFD_FORMAT_NAMES>
	//* 282  597:aload           8
	//* 283  599:getfield        #1460 <Field Object Pair.first>
	//* 284  602:checkcast       #891 <Class Integer>
	//* 285  605:invokevirtual   #1463 <Method int Integer.intValue()>
	//* 286  608:aaload          
	//* 287  609:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//* 288  612:pop             
	//* 289  613:aload           8
	//* 290  615:getfield        #1467 <Field Object Pair.second>
	//* 291  618:checkcast       #891 <Class Integer>
	//* 292  621:invokevirtual   #1463 <Method int Integer.intValue()>
	//* 293  624:iconst_m1       
	//* 294  625:icmpne          635
	//* 295  628:ldc2            #928 <String "">
	//* 296  631:astore_2        
	//* 297  632:goto            676
	//* 298  635:new             #1221 <Class StringBuilder>
	//* 299  638:dup             
	//* 300  639:invokespecial   #1222 <Method void StringBuilder()>
	//* 301  642:astore_2        
	//* 302  643:aload_2         
	//* 303  644:ldc2            #2011 <String ", ">
	//* 304  647:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//* 305  650:pop             
	//* 306  651:aload_2         
	//* 307  652:getstatic       #954 <Field String[] IFD_FORMAT_NAMES>
	//* 308  655:aload           8
	//* 309  657:getfield        #1467 <Field Object Pair.second>
	//* 310  660:checkcast       #891 <Class Integer>
	//* 311  663:invokevirtual   #1463 <Method int Integer.intValue()>
	//* 312  666:aaload          
	//* 313  667:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//* 314  670:pop             
	//* 315  671:aload_2         
	//* 316  672:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//* 317  675:astore_2        
	//* 318  676:aload           7
	//* 319  678:aload_2         
	//* 320  679:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//* 321  682:pop             
	//* 322  683:aload           7
	//* 323  685:ldc2            #1677 <String ")">
	//* 324  688:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//* 325  691:pop             
	//* 326  692:ldc2            #364 <String "ExifInterface">
	//* 327  695:aload           7
	//* 328  697:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//* 329  700:invokestatic    #1408 <Method int Log.w(String, String)>
	//* 330  703:pop             
	//* 331  704:goto            1347
	//* 332  707:aload_2         
	//* 333  708:getfield        #1651 <Field int ExifInterface$ExifTag.primaryFormat>
	//* 334  711:istore          4
	//* 335  713:goto            722
	//* 336  716:aload_2         
	//* 337  717:getfield        #1651 <Field int ExifInterface$ExifTag.primaryFormat>
	//* 338  720:istore          4
	//* 339  722:iload           4
	//* 340  724:tableswitch     1 12: default 788
	//	               1 1327
	//	               2 1307
	//	               3 1236
	//	               4 1165
	//	               5 1068
	//	               6 788
	//	               7 1307
	//	               8 788
	//	               9 1001
	//	               10 896
	//	               11 788
	//	               12 825
	//* 341  788:new             #1221 <Class StringBuilder>
	//* 342  791:dup             
	//* 343  792:invokespecial   #1222 <Method void StringBuilder()>
	//* 344  795:astore_2        
	//* 345  796:aload_2         
	//* 346  797:ldc2            #2015 <String "Data format isn't one of expected formats: ">
	//* 347  800:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//* 348  803:pop             
	//* 349  804:aload_2         
	//* 350  805:iload           4
	//* 351  807:invokevirtual   #1569 <Method StringBuilder StringBuilder.append(int)>
	//* 352  810:pop             
	//* 353  811:ldc2            #364 <String "ExifInterface">
	//* 354  814:aload_2         
	//* 355  815:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//* 356  818:invokestatic    #1408 <Method int Log.w(String, String)>
	//* 357  821:pop             
	//* 358  822:goto            1347
	//* 359  825:aload_1         
	//* 360  826:ldc2            #1245 <String ",">
	//* 361  829:iconst_m1       
	//* 362  830:invokevirtual   #1249 <Method String[] String.split(String, int)>
	//* 363  833:astore_2        
	//* 364  834:aload_2         
	//* 365  835:arraylength     
	//* 366  836:newarray        double[]
	//* 367  838:astore          7
	//* 368  840:iconst_0        
	//* 369  841:istore          4
	//* 370  843:iload           4
	//* 371  845:aload_2         
	//* 372  846:arraylength     
	//* 373  847:icmpge          871
	//* 374  850:aload           7
	//* 375  852:iload           4
	//* 376  854:aload_2         
	//* 377  855:iload           4
	//* 378  857:aaload          
	//* 379  858:invokestatic    #1260 <Method double Double.parseDouble(String)>
	//* 380  861:dastore         
	//* 381  862:iload           4
	//* 382  864:iconst_1        
	//* 383  865:iadd            
	//* 384  866:istore          4
	//* 385  868:goto            843
	//* 386  871:aload_0         
	//* 387  872:getfield        #1146 <Field HashMap[] mAttributes>
	//* 388  875:iload           5
	//* 389  877:aaload          
	//* 390  878:aload           6
	//* 391  880:aload           7
	//* 392  882:aload_0         
	//* 393  883:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//* 394  886:invokestatic    #2019 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createDouble(double[], ByteOrder)>
	//* 395  889:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//* 396  892:pop             
	//* 397  893:goto            1347
	//* 398  896:aload_1         
	//* 399  897:ldc2            #1245 <String ",">
	//* 400  900:iconst_m1       
	//* 401  901:invokevirtual   #1249 <Method String[] String.split(String, int)>
	//* 402  904:astore_2        
	//* 403  905:aload_2         
	//* 404  906:arraylength     
	//* 405  907:anewarray       Rational[]
	//* 406  910:astore          7
	//* 407  912:iconst_0        
	//* 408  913:istore          4
	//* 409  915:iload           4
	//* 410  917:aload_2         
	//* 411  918:arraylength     
	//* 412  919:icmpge          974
	//* 413  922:aload_2         
	//* 414  923:iload           4
	//* 415  925:aaload          
	//* 416  926:ldc2            #1251 <String "/">
	//* 417  929:iconst_m1       
	//* 418  930:invokevirtual   #1249 <Method String[] String.split(String, int)>
	//* 419  933:astore          8
	//* 420  935:aload           7
	//* 421  937:iload           4
	//* 422  939:new             #21  <Class ExifInterface$Rational>
	//* 423  942:dup             
	//* 424  943:aload           8
	//* 425  945:iconst_0        
	//* 426  946:aaload          
	//* 427  947:invokestatic    #1260 <Method double Double.parseDouble(String)>
	//* 428  950:d2l             
	//* 429  951:aload           8
	//* 430  953:iload_3         
	//* 431  954:aaload          
	//* 432  955:invokestatic    #1260 <Method double Double.parseDouble(String)>
	//* 433  958:d2l             
	//* 434  959:invokespecial   #2022 <Method void ExifInterface$Rational(long, long)>
	//* 435  962:aastore         
	//* 436  963:iload           4
	//* 437  965:iconst_1        
	//* 438  966:iadd            
	//* 439  967:istore          4
	//* 440  969:iconst_1        
	//* 441  970:istore_3        
	//* 442  971:goto            915
	//* 443  974:aload_0         
	//* 444  975:getfield        #1146 <Field HashMap[] mAttributes>
	//* 445  978:iload           5
	//* 446  980:aaload          
	//* 447  981:aload           6
	//* 448  983:aload           7
	//* 449  985:aload_0         
	//* 450  986:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//* 451  989:invokestatic    #2026 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createSRational(ExifInterface$Rational[], ByteOrder)>
	//* 452  992:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//* 453  995:pop             
	//* 454  996:iconst_1        
	//* 455  997:istore_3        
	//* 456  998:goto            1347
	//* 457 1001:aload_1         
	//* 458 1002:ldc2            #1245 <String ",">
	//* 459 1005:iconst_m1       
	//* 460 1006:invokevirtual   #1249 <Method String[] String.split(String, int)>
	//* 461 1009:astore_2        
	//* 462 1010:aload_2         
	//* 463 1011:arraylength     
	//* 464 1012:newarray        int[]
	//* 465 1014:astore          7
	//* 466 1016:iconst_0        
	//* 467 1017:istore_3        
	//* 468 1018:iload_3         
	//* 469 1019:aload_2         
	//* 470 1020:arraylength     
	//* 471 1021:icmpge          1041
	//* 472 1024:aload           7
	//* 473 1026:iload_3         
	//* 474 1027:aload_2         
	//* 475 1028:iload_3         
	//* 476 1029:aaload          
	//* 477 1030:invokestatic    #1998 <Method int Integer.parseInt(String)>
	//* 478 1033:iastore         
	//* 479 1034:iload_3         
	//* 480 1035:iconst_1        
	//* 481 1036:iadd            
	//* 482 1037:istore_3        
	//* 483 1038:goto            1018
	//* 484 1041:aload_0         
	//* 485 1042:getfield        #1146 <Field HashMap[] mAttributes>
	//* 486 1045:iload           5
	//* 487 1047:aaload          
	//* 488 1048:aload           6
	//* 489 1050:aload           7
	//* 490 1052:aload_0         
	//* 491 1053:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//* 492 1056:invokestatic    #2030 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createSLong(int[], ByteOrder)>
	//* 493 1059:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//* 494 1062:pop             
	//* 495 1063:iconst_1        
	//* 496 1064:istore_3        
	//* 497 1065:goto            1347
	//* 498 1068:aload_1         
	//* 499 1069:ldc2            #1245 <String ",">
	//* 500 1072:iconst_m1       
	//* 501 1073:invokevirtual   #1249 <Method String[] String.split(String, int)>
	//* 502 1076:astore_2        
	//* 503 1077:aload_2         
	//* 504 1078:arraylength     
	//* 505 1079:anewarray       Rational[]
	//* 506 1082:astore          7
	//* 507 1084:iconst_0        
	//* 508 1085:istore_3        
	//* 509 1086:iload_3         
	//* 510 1087:aload_2         
	//* 511 1088:arraylength     
	//* 512 1089:icmpge          1138
	//* 513 1092:aload_2         
	//* 514 1093:iload_3         
	//* 515 1094:aaload          
	//* 516 1095:ldc2            #1251 <String "/">
	//* 517 1098:iconst_m1       
	//* 518 1099:invokevirtual   #1249 <Method String[] String.split(String, int)>
	//* 519 1102:astore          8
	//* 520 1104:aload           7
	//* 521 1106:iload_3         
	//* 522 1107:new             #21  <Class ExifInterface$Rational>
	//* 523 1110:dup             
	//* 524 1111:aload           8
	//* 525 1113:iconst_0        
	//* 526 1114:aaload          
	//* 527 1115:invokestatic    #1260 <Method double Double.parseDouble(String)>
	//* 528 1118:d2l             
	//* 529 1119:aload           8
	//* 530 1121:iconst_1        
	//* 531 1122:aaload          
	//* 532 1123:invokestatic    #1260 <Method double Double.parseDouble(String)>
	//* 533 1126:d2l             
	//* 534 1127:invokespecial   #2022 <Method void ExifInterface$Rational(long, long)>
	//* 535 1130:aastore         
	//* 536 1131:iload_3         
	//* 537 1132:iconst_1        
	//* 538 1133:iadd            
	//* 539 1134:istore_3        
	//* 540 1135:goto            1086
	//* 541 1138:iconst_1        
	//* 542 1139:istore_3        
	//* 543 1140:aload_0         
	//* 544 1141:getfield        #1146 <Field HashMap[] mAttributes>
	//* 545 1144:iload           5
	//* 546 1146:aaload          
	//* 547 1147:aload           6
	//* 548 1149:aload           7
	//* 549 1151:aload_0         
	//* 550 1152:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//* 551 1155:invokestatic    #2032 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createURational(ExifInterface$Rational[], ByteOrder)>
	//* 552 1158:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//* 553 1161:pop             
	//* 554 1162:goto            1347
	//* 555 1165:aload_1         
	//* 556 1166:ldc2            #1245 <String ",">
	//* 557 1169:iconst_m1       
	//* 558 1170:invokevirtual   #1249 <Method String[] String.split(String, int)>
	//* 559 1173:astore_2        
	//* 560 1174:aload_2         
	//* 561 1175:arraylength     
	//* 562 1176:newarray        long[]
	//* 563 1178:astore          7
	//* 564 1180:iconst_0        
	//* 565 1181:istore          4
	//* 566 1183:iload           4
	//* 567 1185:aload_2         
	//* 568 1186:arraylength     
	//* 569 1187:icmpge          1211
	//* 570 1190:aload           7
	//* 571 1192:iload           4
	//* 572 1194:aload_2         
	//* 573 1195:iload           4
	//* 574 1197:aaload          
	//* 575 1198:invokestatic    #1476 <Method long Long.parseLong(String)>
	//* 576 1201:lastore         
	//* 577 1202:iload           4
	//* 578 1204:iconst_1        
	//* 579 1205:iadd            
	//* 580 1206:istore          4
	//* 581 1208:goto            1183
	//* 582 1211:aload_0         
	//* 583 1212:getfield        #1146 <Field HashMap[] mAttributes>
	//* 584 1215:iload           5
	//* 585 1217:aaload          
	//* 586 1218:aload           6
	//* 587 1220:aload           7
	//* 588 1222:aload_0         
	//* 589 1223:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//* 590 1226:invokestatic    #2035 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createULong(long[], ByteOrder)>
	//* 591 1229:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//* 592 1232:pop             
	//* 593 1233:goto            1347
	//* 594 1236:aload_1         
	//* 595 1237:ldc2            #1245 <String ",">
	//* 596 1240:iconst_m1       
	//* 597 1241:invokevirtual   #1249 <Method String[] String.split(String, int)>
	//* 598 1244:astore_2        
	//* 599 1245:aload_2         
	//* 600 1246:arraylength     
	//* 601 1247:newarray        int[]
	//* 602 1249:astore          7
	//* 603 1251:iconst_0        
	//* 604 1252:istore          4
	//* 605 1254:iload           4
	//* 606 1256:aload_2         
	//* 607 1257:arraylength     
	//* 608 1258:icmpge          1282
	//* 609 1261:aload           7
	//* 610 1263:iload           4
	//* 611 1265:aload_2         
	//* 612 1266:iload           4
	//* 613 1268:aaload          
	//* 614 1269:invokestatic    #1998 <Method int Integer.parseInt(String)>
	//* 615 1272:iastore         
	//* 616 1273:iload           4
	//* 617 1275:iconst_1        
	//* 618 1276:iadd            
	//* 619 1277:istore          4
	//* 620 1279:goto            1254
	//* 621 1282:aload_0         
	//* 622 1283:getfield        #1146 <Field HashMap[] mAttributes>
	//* 623 1286:iload           5
	//* 624 1288:aaload          
	//* 625 1289:aload           6
	//* 626 1291:aload           7
	//* 627 1293:aload_0         
	//* 628 1294:getfield        #1158 <Field ByteOrder mExifByteOrder>
	//* 629 1297:invokestatic    #2037 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createUShort(int[], ByteOrder)>
	//* 630 1300:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//* 631 1303:pop             
	//* 632 1304:goto            1347
	//* 633 1307:aload_0         
	//* 634 1308:getfield        #1146 <Field HashMap[] mAttributes>
	//* 635 1311:iload           5
	//* 636 1313:aaload          
	//* 637 1314:aload           6
	//* 638 1316:aload_1         
	//* 639 1317:invokestatic    #1192 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createString(String)>
	//* 640 1320:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//* 641 1323:pop             
	//* 642 1324:goto            1347
	//* 643 1327:aload_0         
	//* 644 1328:getfield        #1146 <Field HashMap[] mAttributes>
	//* 645 1331:iload           5
	//* 646 1333:aaload          
	//* 647 1334:aload           6
	//* 648 1336:aload_1         
	//* 649 1337:invokestatic    #2040 <Method ExifInterface$ExifAttribute ExifInterface$ExifAttribute.createByte(String)>
	//* 650 1340:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	//* 651 1343:pop             
	//* 652 1344:goto            1347
	//* 653 1347:iload           5
	//* 654 1349:iconst_1        
	//* 655 1350:iadd            
	//* 656 1351:istore          5
	//* 657 1353:goto            275
	//* 658 1356:return          
					// Misplaced declaration of an exception variable
					catch(String s)
					{
						s = ((String) (new StringBuilder()));
						((StringBuilder) (s)).append("Invalid value for ");
						((StringBuilder) (s)).append(s2);
						((StringBuilder) (s)).append(" : ");
						((StringBuilder) (s)).append(s3);
						Log.w("ExifInterface", ((StringBuilder) (s)).toString());
						return;
					}
				}
		}
		for(int k1 = 0; k1 < EXIF_TAGS.length; k1++)
		{
			if(k1 == 4 && !mHasThumbnail)
				continue;
			s1 = ((String) ((ExifTag)sExifTagMapsForWriting[k1].get(((Object) (s2)))));
			if(s1 == null)
				continue;
			if(s == null)
			{
				mAttributes[k1].remove(((Object) (s2)));
				continue;
			}
			Pair pair = guessDataFormat(s);
			int j;
			if(((ExifTag) (s1)).primaryFormat != ((Integer)pair.first).intValue() && ((ExifTag) (s1)).primaryFormat != ((Integer)pair.second).intValue())
			{
				if(((ExifTag) (s1)).secondaryFormat != -1 && (((ExifTag) (s1)).secondaryFormat == ((Integer)pair.first).intValue() || ((ExifTag) (s1)).secondaryFormat == ((Integer)pair.second).intValue()))
				{
					j = ((ExifTag) (s1)).secondaryFormat;
				} else
				{
					if(((ExifTag) (s1)).primaryFormat != i && ((ExifTag) (s1)).primaryFormat != 7 && ((ExifTag) (s1)).primaryFormat != 2)
					{
						StringBuilder stringbuilder = new StringBuilder();
						stringbuilder.append("Given tag (");
						stringbuilder.append(s2);
						stringbuilder.append(") value didn't match with one of expected ");
						stringbuilder.append("formats: ");
						stringbuilder.append(IFD_FORMAT_NAMES[((ExifTag) (s1)).primaryFormat]);
						if(((ExifTag) (s1)).secondaryFormat == -1)
						{
							s1 = "";
						} else
						{
							StringBuilder stringbuilder1 = new StringBuilder();
							stringbuilder1.append(", ");
							stringbuilder1.append(IFD_FORMAT_NAMES[((ExifTag) (s1)).secondaryFormat]);
							s1 = stringbuilder1.toString();
						}
						stringbuilder.append(s1);
						stringbuilder.append(" (guess: ");
						stringbuilder.append(IFD_FORMAT_NAMES[((Integer)pair.first).intValue()]);
						if(((Integer)pair.second).intValue() == -1)
						{
							s1 = "";
						} else
						{
							s1 = ((String) (new StringBuilder()));
							((StringBuilder) (s1)).append(", ");
							((StringBuilder) (s1)).append(IFD_FORMAT_NAMES[((Integer)pair.second).intValue()]);
							s1 = ((StringBuilder) (s1)).toString();
						}
						stringbuilder.append(s1);
						stringbuilder.append(")");
						Log.w("ExifInterface", stringbuilder.toString());
						continue;
					}
					j = ((ExifTag) (s1)).primaryFormat;
				}
			} else
			{
				j = ((ExifTag) (s1)).primaryFormat;
			}
			switch(j)
			{
			case 6: // '\006'
			case 8: // '\b'
			case 11: // '\013'
			default:
				s1 = ((String) (new StringBuilder()));
				((StringBuilder) (s1)).append("Data format isn't one of expected formats: ");
				((StringBuilder) (s1)).append(j);
				Log.w("ExifInterface", ((StringBuilder) (s1)).toString());
				break;

			case 12: // '\f'
				s1 = ((String) (s.split(",", -1)));
				double ad[] = new double[s1.length];
				for(int k = 0; k < s1.length; k++)
					ad[k] = Double.parseDouble(((String) (s1[k])));

				mAttributes[k1].put(((Object) (s2)), ((Object) (ExifAttribute.createDouble(ad, mExifByteOrder))));
				break;

			case 10: // '\n'
				s1 = ((String) (s.split(",", -1)));
				Rational arational[] = new Rational[s1.length];
				for(int l = 0; l < s1.length;)
				{
					String as[] = ((String) (s1[l])).split("/", -1);
					arational[l] = new Rational((long)Double.parseDouble(as[0]), (long)Double.parseDouble(as[i]));
					l++;
					i = 1;
				}

				mAttributes[k1].put(((Object) (s2)), ((Object) (ExifAttribute.createSRational(arational, mExifByteOrder))));
				i = 1;
				break;

			case 9: // '\t'
				s1 = ((String) (s.split(",", -1)));
				int ai[] = new int[s1.length];
				for(i = 0; i < s1.length; i++)
					ai[i] = Integer.parseInt(((String) (s1[i])));

				mAttributes[k1].put(((Object) (s2)), ((Object) (ExifAttribute.createSLong(ai, mExifByteOrder))));
				i = 1;
				break;

			case 5: // '\005'
				s1 = ((String) (s.split(",", -1)));
				Rational arational1[] = new Rational[s1.length];
				for(i = 0; i < s1.length; i++)
				{
					String as1[] = ((String) (s1[i])).split("/", -1);
					arational1[i] = new Rational((long)Double.parseDouble(as1[0]), (long)Double.parseDouble(as1[1]));
				}

				i = 1;
				mAttributes[k1].put(((Object) (s2)), ((Object) (ExifAttribute.createURational(arational1, mExifByteOrder))));
				break;

			case 4: // '\004'
				s1 = ((String) (s.split(",", -1)));
				long al[] = new long[s1.length];
				for(int i1 = 0; i1 < s1.length; i1++)
					al[i1] = Long.parseLong(((String) (s1[i1])));

				mAttributes[k1].put(((Object) (s2)), ((Object) (ExifAttribute.createULong(al, mExifByteOrder))));
				break;

			case 3: // '\003'
				s1 = ((String) (s.split(",", -1)));
				int ai1[] = new int[s1.length];
				for(int j1 = 0; j1 < s1.length; j1++)
					ai1[j1] = Integer.parseInt(((String) (s1[j1])));

				mAttributes[k1].put(((Object) (s2)), ((Object) (ExifAttribute.createUShort(ai1, mExifByteOrder))));
				break;

			case 2: // '\002'
			case 7: // '\007'
				mAttributes[k1].put(((Object) (s2)), ((Object) (ExifAttribute.createString(s))));
				break;

			case 1: // '\001'
				mAttributes[k1].put(((Object) (s2)), ((Object) (ExifAttribute.createByte(s))));
				break;
			}
		}

	//* 659 1357:astore_1        
	//* 660 1358:goto            222
	}

	public void setDateTime(long l)
	{
		setAttribute("DateTime", sFormatter.format(new Date(l)));
	//    0    0:aload_0         
	//    1    1:ldc2            #409 <String "DateTime">
	//    2    4:getstatic       #1102 <Field SimpleDateFormat sFormatter>
	//    3    7:new             #1856 <Class Date>
	//    4   10:dup             
	//    5   11:lload_1         
	//    6   12:invokespecial   #2043 <Method void Date(long)>
	//    7   15:invokevirtual   #2046 <Method String SimpleDateFormat.format(Date)>
	//    8   18:invokevirtual   #1799 <Method void setAttribute(String, String)>
		setAttribute("SubSecTime", Long.toString(l % 1000L));
	//    9   21:aload_0         
	//   10   22:ldc2            #792 <String "SubSecTime">
	//   11   25:lload_1         
	//   12   26:ldc2w           #1860 <Long 1000L>
	//   13   29:lrem            
	//   14   30:invokestatic    #2049 <Method String Long.toString(long)>
	//   15   33:invokevirtual   #1799 <Method void setAttribute(String, String)>
	//   16   36:return          
	}

	public void setGpsInfo(Location location)
	{
		if(location == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			setAttribute("GPSProcessingMethod", location.getProvider());
	//    3    5:aload_0         
	//    4    6:ldc2            #559 <String "GPSProcessingMethod">
	//    5    9:aload_1         
	//    6   10:invokevirtual   #2056 <Method String Location.getProvider()>
	//    7   13:invokevirtual   #1799 <Method void setAttribute(String, String)>
			setLatLong(location.getLatitude(), location.getLongitude());
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #2060 <Method double Location.getLatitude()>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #2063 <Method double Location.getLongitude()>
	//   13   25:invokevirtual   #2067 <Method void setLatLong(double, double)>
			setAltitude(location.getAltitude());
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #2069 <Method double Location.getAltitude()>
	//   17   33:invokevirtual   #2071 <Method void setAltitude(double)>
			setAttribute("GPSSpeedRef", "K");
	//   18   36:aload_0         
	//   19   37:ldc2            #568 <String "GPSSpeedRef">
	//   20   40:ldc1            #116 <String "K">
	//   21   42:invokevirtual   #1799 <Method void setAttribute(String, String)>
			setAttribute("GPSSpeed", (new Rational((location.getSpeed() * (float)TimeUnit.HOURS.toSeconds(1L)) / 1000F)).toString());
	//   22   45:aload_0         
	//   23   46:ldc2            #565 <String "GPSSpeed">
	//   24   49:new             #21  <Class ExifInterface$Rational>
	//   25   52:dup             
	//   26   53:aload_1         
	//   27   54:invokevirtual   #2075 <Method float Location.getSpeed()>
	//   28   57:getstatic       #2081 <Field TimeUnit TimeUnit.HOURS>
	//   29   60:lconst_1        
	//   30   61:invokevirtual   #2084 <Method long TimeUnit.toSeconds(long)>
	//   31   64:l2f             
	//   32   65:fmul            
	//   33   66:ldc2            #2085 <Float 1000F>
	//   34   69:fdiv            
	//   35   70:f2d             
	//   36   71:invokespecial   #1983 <Method void ExifInterface$Rational(double)>
	//   37   74:invokevirtual   #1984 <Method String ExifInterface$Rational.toString()>
	//   38   77:invokevirtual   #1799 <Method void setAttribute(String, String)>
			location = ((Location) (sFormatter.format(new Date(location.getTime())).split("\\s+", -1)));
	//   39   80:getstatic       #1102 <Field SimpleDateFormat sFormatter>
	//   40   83:new             #1856 <Class Date>
	//   41   86:dup             
	//   42   87:aload_1         
	//   43   88:invokevirtual   #2086 <Method long Location.getTime()>
	//   44   91:invokespecial   #2043 <Method void Date(long)>
	//   45   94:invokevirtual   #2046 <Method String SimpleDateFormat.format(Date)>
	//   46   97:ldc2            #2088 <String "\\s+">
	//   47  100:iconst_m1       
	//   48  101:invokevirtual   #1249 <Method String[] String.split(String, int)>
	//   49  104:astore_1        
			setAttribute("GPSDateStamp", ((String) (location[0])));
	//   50  105:aload_0         
	//   51  106:ldc2            #496 <String "GPSDateStamp">
	//   52  109:aload_1         
	//   53  110:iconst_0        
	//   54  111:aaload          
	//   55  112:invokevirtual   #1799 <Method void setAttribute(String, String)>
			setAttribute("GPSTimeStamp", ((String) (location[1])));
	//   56  115:aload_0         
	//   57  116:ldc2            #574 <String "GPSTimeStamp">
	//   58  119:aload_1         
	//   59  120:iconst_1        
	//   60  121:aaload          
	//   61  122:invokevirtual   #1799 <Method void setAttribute(String, String)>
			return;
	//   62  125:return          
		}
	}

	public void setLatLong(double d, double d1)
	{
		if(d >= -90D && d <= 90D && !Double.isNaN(d))
	//*   0    0:dload_1         
	//*   1    1:ldc2w           #2089 <Double -90D>
	//*   2    4:dcmpg           
	//*   3    5:iflt            176
	//*   4    8:dload_1         
	//*   5    9:ldc2w           #2091 <Double 90D>
	//*   6   12:dcmpl           
	//*   7   13:ifgt            176
	//*   8   16:dload_1         
	//*   9   17:invokestatic    #2096 <Method boolean Double.isNaN(double)>
	//*  10   20:ifne            176
		{
			if(d1 >= -180D && d1 <= 180D && !Double.isNaN(d1))
	//*  11   23:dload_3         
	//*  12   24:ldc2w           #2097 <Double -180D>
	//*  13   27:dcmpg           
	//*  14   28:iflt            129
	//*  15   31:dload_3         
	//*  16   32:ldc2w           #2099 <Double 180D>
	//*  17   35:dcmpl           
	//*  18   36:ifgt            129
	//*  19   39:dload_3         
	//*  20   40:invokestatic    #2096 <Method boolean Double.isNaN(double)>
	//*  21   43:ifne            129
			{
				String s;
				if(d >= 0.0D)
	//*  22   46:dload_1         
	//*  23   47:dconst_0        
	//*  24   48:dcmpl           
	//*  25   49:iflt            59
					s = "N";
	//   26   52:ldc1            #120 <String "N">
	//   27   54:astore          5
				else
	//*  28   56:goto            63
					s = "S";
	//   29   59:ldc1            #194 <String "S">
	//   30   61:astore          5
				setAttribute("GPSLatitudeRef", s);
	//   31   63:aload_0         
	//   32   64:ldc2            #544 <String "GPSLatitudeRef">
	//   33   67:aload           5
	//   34   69:invokevirtual   #1799 <Method void setAttribute(String, String)>
				setAttribute("GPSLatitude", convertDecimalDegree(Math.abs(d)));
	//   35   72:aload_0         
	//   36   73:ldc2            #541 <String "GPSLatitude">
	//   37   76:aload_0         
	//   38   77:dload_1         
	//   39   78:invokestatic    #1981 <Method double Math.abs(double)>
	//   40   81:invokespecial   #2102 <Method String convertDecimalDegree(double)>
	//   41   84:invokevirtual   #1799 <Method void setAttribute(String, String)>
				if(d1 >= 0.0D)
	//*  42   87:dload_3         
	//*  43   88:dconst_0        
	//*  44   89:dcmpl           
	//*  45   90:iflt            100
					s = "E";
	//   46   93:ldc1            #229 <String "E">
	//   47   95:astore          5
				else
	//*  48   97:goto            104
					s = "W";
	//   49  100:ldc1            #232 <String "W">
	//   50  102:astore          5
				setAttribute("GPSLongitudeRef", s);
	//   51  104:aload_0         
	//   52  105:ldc2            #550 <String "GPSLongitudeRef">
	//   53  108:aload           5
	//   54  110:invokevirtual   #1799 <Method void setAttribute(String, String)>
				setAttribute("GPSLongitude", convertDecimalDegree(Math.abs(d1)));
	//   55  113:aload_0         
	//   56  114:ldc2            #547 <String "GPSLongitude">
	//   57  117:aload_0         
	//   58  118:dload_3         
	//   59  119:invokestatic    #1981 <Method double Math.abs(double)>
	//   60  122:invokespecial   #2102 <Method String convertDecimalDegree(double)>
	//   61  125:invokevirtual   #1799 <Method void setAttribute(String, String)>
				return;
	//   62  128:return          
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   63  129:new             #1221 <Class StringBuilder>
	//   64  132:dup             
	//   65  133:invokespecial   #1222 <Method void StringBuilder()>
	//   66  136:astore          5
				stringbuilder.append("Longitude value ");
	//   67  138:aload           5
	//   68  140:ldc2            #2104 <String "Longitude value ">
	//   69  143:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   70  146:pop             
				stringbuilder.append(d1);
	//   71  147:aload           5
	//   72  149:dload_3         
	//   73  150:invokevirtual   #2107 <Method StringBuilder StringBuilder.append(double)>
	//   74  153:pop             
				stringbuilder.append(" is not valid.");
	//   75  154:aload           5
	//   76  156:ldc2            #2109 <String " is not valid.">
	//   77  159:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   78  162:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
	//   79  163:new             #1169 <Class IllegalArgumentException>
	//   80  166:dup             
	//   81  167:aload           5
	//   82  169:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//   83  172:invokespecial   #1172 <Method void IllegalArgumentException(String)>
	//   84  175:athrow          
			}
		} else
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   85  176:new             #1221 <Class StringBuilder>
	//   86  179:dup             
	//   87  180:invokespecial   #1222 <Method void StringBuilder()>
	//   88  183:astore          5
			stringbuilder1.append("Latitude value ");
	//   89  185:aload           5
	//   90  187:ldc2            #2111 <String "Latitude value ">
	//   91  190:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//   92  193:pop             
			stringbuilder1.append(d);
	//   93  194:aload           5
	//   94  196:dload_1         
	//   95  197:invokevirtual   #2107 <Method StringBuilder StringBuilder.append(double)>
	//   96  200:pop             
			stringbuilder1.append(" is not valid.");
	//   97  201:aload           5
	//   98  203:ldc2            #2109 <String " is not valid.">
	//   99  206:invokevirtual   #1231 <Method StringBuilder StringBuilder.append(String)>
	//  100  209:pop             
			throw new IllegalArgumentException(stringbuilder1.toString());
	//  101  210:new             #1169 <Class IllegalArgumentException>
	//  102  213:dup             
	//  103  214:aload           5
	//  104  216:invokevirtual   #1237 <Method String StringBuilder.toString()>
	//  105  219:invokespecial   #1172 <Method void IllegalArgumentException(String)>
	//  106  222:athrow          
		}
	}

	public static final short ALTITUDE_ABOVE_SEA_LEVEL = 0;
	public static final short ALTITUDE_BELOW_SEA_LEVEL = 1;
	static final Charset ASCII;
	public static final int BITS_PER_SAMPLE_GREYSCALE_1[] = {
		4
	};
	public static final int BITS_PER_SAMPLE_GREYSCALE_2[] = {
		8
	};
	public static final int BITS_PER_SAMPLE_RGB[] = {
		8, 8, 8
	};
	static final short BYTE_ALIGN_II = 18761;
	static final short BYTE_ALIGN_MM = 19789;
	public static final int COLOR_SPACE_S_RGB = 1;
	public static final int COLOR_SPACE_UNCALIBRATED = 65535;
	public static final short CONTRAST_HARD = 2;
	public static final short CONTRAST_NORMAL = 0;
	public static final short CONTRAST_SOFT = 1;
	public static final int DATA_DEFLATE_ZIP = 8;
	public static final int DATA_HUFFMAN_COMPRESSED = 2;
	public static final int DATA_JPEG = 6;
	public static final int DATA_JPEG_COMPRESSED = 7;
	public static final int DATA_LOSSY_JPEG = 34892;
	public static final int DATA_PACK_BITS_COMPRESSED = 32773;
	public static final int DATA_UNCOMPRESSED = 1;
	private static final boolean DEBUG = false;
	static final byte EXIF_ASCII_PREFIX[] = {
		65, 83, 67, 73, 73, 0, 0, 0
	};
	private static final ExifTag EXIF_POINTER_TAGS[] = {
		new ExifTag("SubIFDPointer", 330, 4), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("InteroperabilityIFDPointer", 40965, 4), new ExifTag("CameraSettingsIFDPointer", 8224, 1), new ExifTag("ImageProcessingIFDPointer", 8256, 1)
	};
	static final ExifTag EXIF_TAGS[][];
	public static final short EXPOSURE_MODE_AUTO = 0;
	public static final short EXPOSURE_MODE_AUTO_BRACKET = 2;
	public static final short EXPOSURE_MODE_MANUAL = 1;
	public static final short EXPOSURE_PROGRAM_ACTION = 6;
	public static final short EXPOSURE_PROGRAM_APERTURE_PRIORITY = 3;
	public static final short EXPOSURE_PROGRAM_CREATIVE = 5;
	public static final short EXPOSURE_PROGRAM_LANDSCAPE_MODE = 8;
	public static final short EXPOSURE_PROGRAM_MANUAL = 1;
	public static final short EXPOSURE_PROGRAM_NORMAL = 2;
	public static final short EXPOSURE_PROGRAM_NOT_DEFINED = 0;
	public static final short EXPOSURE_PROGRAM_PORTRAIT_MODE = 7;
	public static final short EXPOSURE_PROGRAM_SHUTTER_PRIORITY = 4;
	public static final short FILE_SOURCE_DSC = 3;
	public static final short FILE_SOURCE_OTHER = 0;
	public static final short FILE_SOURCE_REFLEX_SCANNER = 2;
	public static final short FILE_SOURCE_TRANSPARENT_SCANNER = 1;
	public static final short FLAG_FLASH_FIRED = 1;
	public static final short FLAG_FLASH_MODE_AUTO = 24;
	public static final short FLAG_FLASH_MODE_COMPULSORY_FIRING = 8;
	public static final short FLAG_FLASH_MODE_COMPULSORY_SUPPRESSION = 16;
	public static final short FLAG_FLASH_NO_FLASH_FUNCTION = 32;
	public static final short FLAG_FLASH_RED_EYE_SUPPORTED = 64;
	public static final short FLAG_FLASH_RETURN_LIGHT_DETECTED = 6;
	public static final short FLAG_FLASH_RETURN_LIGHT_NOT_DETECTED = 4;
	private static final List FLIPPED_ROTATION_ORDER = Arrays.asList(((Object []) (new Integer[] {
		Integer.valueOf(2), Integer.valueOf(7), Integer.valueOf(4), Integer.valueOf(5)
	})));
	public static final short FORMAT_CHUNKY = 1;
	public static final short FORMAT_PLANAR = 2;
	public static final short GAIN_CONTROL_HIGH_GAIN_DOWN = 4;
	public static final short GAIN_CONTROL_HIGH_GAIN_UP = 2;
	public static final short GAIN_CONTROL_LOW_GAIN_DOWN = 3;
	public static final short GAIN_CONTROL_LOW_GAIN_UP = 1;
	public static final short GAIN_CONTROL_NONE = 0;
	public static final String GPS_DIRECTION_MAGNETIC = "M";
	public static final String GPS_DIRECTION_TRUE = "T";
	public static final String GPS_DISTANCE_KILOMETERS = "K";
	public static final String GPS_DISTANCE_MILES = "M";
	public static final String GPS_DISTANCE_NAUTICAL_MILES = "N";
	public static final String GPS_MEASUREMENT_2D = "2";
	public static final String GPS_MEASUREMENT_3D = "3";
	public static final short GPS_MEASUREMENT_DIFFERENTIAL_CORRECTED = 1;
	public static final String GPS_MEASUREMENT_INTERRUPTED = "V";
	public static final String GPS_MEASUREMENT_IN_PROGRESS = "A";
	public static final short GPS_MEASUREMENT_NO_DIFFERENTIAL = 0;
	public static final String GPS_SPEED_KILOMETERS_PER_HOUR = "K";
	public static final String GPS_SPEED_KNOTS = "N";
	public static final String GPS_SPEED_MILES_PER_HOUR = "M";
	static final byte IDENTIFIER_EXIF_APP1[];
	private static final ExifTag IFD_EXIF_TAGS[] = {
		new ExifTag("ExposureTime", 33434, 5), new ExifTag("FNumber", 33437, 5), new ExifTag("ExposureProgram", 34850, 3), new ExifTag("SpectralSensitivity", 34852, 2), new ExifTag("PhotographicSensitivity", 34855, 3), new ExifTag("OECF", 34856, 7), new ExifTag("ExifVersion", 36864, 2), new ExifTag("DateTimeOriginal", 36867, 2), new ExifTag("DateTimeDigitized", 36868, 2), new ExifTag("ComponentsConfiguration", 37121, 7), 
		new ExifTag("CompressedBitsPerPixel", 37122, 5), new ExifTag("ShutterSpeedValue", 37377, 10), new ExifTag("ApertureValue", 37378, 5), new ExifTag("BrightnessValue", 37379, 10), new ExifTag("ExposureBiasValue", 37380, 10), new ExifTag("MaxApertureValue", 37381, 5), new ExifTag("SubjectDistance", 37382, 5), new ExifTag("MeteringMode", 37383, 3), new ExifTag("LightSource", 37384, 3), new ExifTag("Flash", 37385, 3), 
		new ExifTag("FocalLength", 37386, 5), new ExifTag("SubjectArea", 37396, 3), new ExifTag("MakerNote", 37500, 7), new ExifTag("UserComment", 37510, 7), new ExifTag("SubSecTime", 37520, 2), new ExifTag("SubSecTimeOriginal", 37521, 2), new ExifTag("SubSecTimeDigitized", 37522, 2), new ExifTag("FlashpixVersion", 40960, 7), new ExifTag("ColorSpace", 40961, 3), new ExifTag("PixelXDimension", 40962, 3, 4), 
		new ExifTag("PixelYDimension", 40963, 3, 4), new ExifTag("RelatedSoundFile", 40964, 2), new ExifTag("InteroperabilityIFDPointer", 40965, 4), new ExifTag("FlashEnergy", 41483, 5), new ExifTag("SpatialFrequencyResponse", 41484, 7), new ExifTag("FocalPlaneXResolution", 41486, 5), new ExifTag("FocalPlaneYResolution", 41487, 5), new ExifTag("FocalPlaneResolutionUnit", 41488, 3), new ExifTag("SubjectLocation", 41492, 3), new ExifTag("ExposureIndex", 41493, 5), 
		new ExifTag("SensingMethod", 41495, 3), new ExifTag("FileSource", 41728, 7), new ExifTag("SceneType", 41729, 7), new ExifTag("CFAPattern", 41730, 7), new ExifTag("CustomRendered", 41985, 3), new ExifTag("ExposureMode", 41986, 3), new ExifTag("WhiteBalance", 41987, 3), new ExifTag("DigitalZoomRatio", 41988, 5), new ExifTag("FocalLengthIn35mmFilm", 41989, 3), new ExifTag("SceneCaptureType", 41990, 3), 
		new ExifTag("GainControl", 41991, 3), new ExifTag("Contrast", 41992, 3), new ExifTag("Saturation", 41993, 3), new ExifTag("Sharpness", 41994, 3), new ExifTag("DeviceSettingDescription", 41995, 7), new ExifTag("SubjectDistanceRange", 41996, 3), new ExifTag("ImageUniqueID", 42016, 2), new ExifTag("DNGVersion", 50706, 1), new ExifTag("DefaultCropSize", 50720, 3, 4)
	};
	private static final int IFD_FORMAT_BYTE = 1;
	static final int IFD_FORMAT_BYTES_PER_FORMAT[] = {
		0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 
		8, 4, 8, 1
	};
	private static final int IFD_FORMAT_DOUBLE = 12;
	private static final int IFD_FORMAT_IFD = 13;
	static final String IFD_FORMAT_NAMES[] = {
		"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", 
		"SRATIONAL", "SINGLE", "DOUBLE"
	};
	private static final int IFD_FORMAT_SBYTE = 6;
	private static final int IFD_FORMAT_SINGLE = 11;
	private static final int IFD_FORMAT_SLONG = 9;
	private static final int IFD_FORMAT_SRATIONAL = 10;
	private static final int IFD_FORMAT_SSHORT = 8;
	private static final int IFD_FORMAT_STRING = 2;
	private static final int IFD_FORMAT_ULONG = 4;
	private static final int IFD_FORMAT_UNDEFINED = 7;
	private static final int IFD_FORMAT_URATIONAL = 5;
	private static final int IFD_FORMAT_USHORT = 3;
	private static final ExifTag IFD_GPS_TAGS[] = {
		new ExifTag("GPSVersionID", 0, 1), new ExifTag("GPSLatitudeRef", 1, 2), new ExifTag("GPSLatitude", 2, 5), new ExifTag("GPSLongitudeRef", 3, 2), new ExifTag("GPSLongitude", 4, 5), new ExifTag("GPSAltitudeRef", 5, 1), new ExifTag("GPSAltitude", 6, 5), new ExifTag("GPSTimeStamp", 7, 5), new ExifTag("GPSSatellites", 8, 2), new ExifTag("GPSStatus", 9, 2), 
		new ExifTag("GPSMeasureMode", 10, 2), new ExifTag("GPSDOP", 11, 5), new ExifTag("GPSSpeedRef", 12, 2), new ExifTag("GPSSpeed", 13, 5), new ExifTag("GPSTrackRef", 14, 2), new ExifTag("GPSTrack", 15, 5), new ExifTag("GPSImgDirectionRef", 16, 2), new ExifTag("GPSImgDirection", 17, 5), new ExifTag("GPSMapDatum", 18, 2), new ExifTag("GPSDestLatitudeRef", 19, 2), 
		new ExifTag("GPSDestLatitude", 20, 5), new ExifTag("GPSDestLongitudeRef", 21, 2), new ExifTag("GPSDestLongitude", 22, 5), new ExifTag("GPSDestBearingRef", 23, 2), new ExifTag("GPSDestBearing", 24, 5), new ExifTag("GPSDestDistanceRef", 25, 2), new ExifTag("GPSDestDistance", 26, 5), new ExifTag("GPSProcessingMethod", 27, 7), new ExifTag("GPSAreaInformation", 28, 7), new ExifTag("GPSDateStamp", 29, 2), 
		new ExifTag("GPSDifferential", 30, 3)
	};
	private static final ExifTag IFD_INTEROPERABILITY_TAGS[] = {
		new ExifTag("InteroperabilityIndex", 1, 2)
	};
	private static final int IFD_OFFSET = 8;
	private static final ExifTag IFD_THUMBNAIL_TAGS[] = {
		new ExifTag("NewSubfileType", 254, 4), new ExifTag("SubfileType", 255, 4), new ExifTag("ThumbnailImageWidth", 256, 3, 4), new ExifTag("ThumbnailImageLength", 257, 3, 4), new ExifTag("BitsPerSample", 258, 3), new ExifTag("Compression", 259, 3), new ExifTag("PhotometricInterpretation", 262, 3), new ExifTag("ImageDescription", 270, 2), new ExifTag("Make", 271, 2), new ExifTag("Model", 272, 2), 
		new ExifTag("StripOffsets", 273, 3, 4), new ExifTag("Orientation", 274, 3), new ExifTag("SamplesPerPixel", 277, 3), new ExifTag("RowsPerStrip", 278, 3, 4), new ExifTag("StripByteCounts", 279, 3, 4), new ExifTag("XResolution", 282, 5), new ExifTag("YResolution", 283, 5), new ExifTag("PlanarConfiguration", 284, 3), new ExifTag("ResolutionUnit", 296, 3), new ExifTag("TransferFunction", 301, 3), 
		new ExifTag("Software", 305, 2), new ExifTag("DateTime", 306, 2), new ExifTag("Artist", 315, 2), new ExifTag("WhitePoint", 318, 5), new ExifTag("PrimaryChromaticities", 319, 5), new ExifTag("SubIFDPointer", 330, 4), new ExifTag("JPEGInterchangeFormat", 513, 4), new ExifTag("JPEGInterchangeFormatLength", 514, 4), new ExifTag("YCbCrCoefficients", 529, 5), new ExifTag("YCbCrSubSampling", 530, 3), 
		new ExifTag("YCbCrPositioning", 531, 3), new ExifTag("ReferenceBlackWhite", 532, 5), new ExifTag("Copyright", 33432, 2), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("DNGVersion", 50706, 1), new ExifTag("DefaultCropSize", 50720, 3, 4)
	};
	private static final ExifTag IFD_TIFF_TAGS[] = {
		new ExifTag("NewSubfileType", 254, 4), new ExifTag("SubfileType", 255, 4), new ExifTag("ImageWidth", 256, 3, 4), new ExifTag("ImageLength", 257, 3, 4), new ExifTag("BitsPerSample", 258, 3), new ExifTag("Compression", 259, 3), new ExifTag("PhotometricInterpretation", 262, 3), new ExifTag("ImageDescription", 270, 2), new ExifTag("Make", 271, 2), new ExifTag("Model", 272, 2), 
		new ExifTag("StripOffsets", 273, 3, 4), new ExifTag("Orientation", 274, 3), new ExifTag("SamplesPerPixel", 277, 3), new ExifTag("RowsPerStrip", 278, 3, 4), new ExifTag("StripByteCounts", 279, 3, 4), new ExifTag("XResolution", 282, 5), new ExifTag("YResolution", 283, 5), new ExifTag("PlanarConfiguration", 284, 3), new ExifTag("ResolutionUnit", 296, 3), new ExifTag("TransferFunction", 301, 3), 
		new ExifTag("Software", 305, 2), new ExifTag("DateTime", 306, 2), new ExifTag("Artist", 315, 2), new ExifTag("WhitePoint", 318, 5), new ExifTag("PrimaryChromaticities", 319, 5), new ExifTag("SubIFDPointer", 330, 4), new ExifTag("JPEGInterchangeFormat", 513, 4), new ExifTag("JPEGInterchangeFormatLength", 514, 4), new ExifTag("YCbCrCoefficients", 529, 5), new ExifTag("YCbCrSubSampling", 530, 3), 
		new ExifTag("YCbCrPositioning", 531, 3), new ExifTag("ReferenceBlackWhite", 532, 5), new ExifTag("Copyright", 33432, 2), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("SensorTopBorder", 4, 4), new ExifTag("SensorLeftBorder", 5, 4), new ExifTag("SensorBottomBorder", 6, 4), new ExifTag("SensorRightBorder", 7, 4), new ExifTag("ISO", 23, 3), 
		new ExifTag("JpgFromRaw", 46, 7)
	};
	private static final int IFD_TYPE_EXIF = 1;
	private static final int IFD_TYPE_GPS = 2;
	private static final int IFD_TYPE_INTEROPERABILITY = 3;
	private static final int IFD_TYPE_ORF_CAMERA_SETTINGS = 7;
	private static final int IFD_TYPE_ORF_IMAGE_PROCESSING = 8;
	private static final int IFD_TYPE_ORF_MAKER_NOTE = 6;
	private static final int IFD_TYPE_PEF = 9;
	static final int IFD_TYPE_PREVIEW = 5;
	static final int IFD_TYPE_PRIMARY = 0;
	static final int IFD_TYPE_THUMBNAIL = 4;
	private static final int IMAGE_TYPE_ARW = 1;
	private static final int IMAGE_TYPE_CR2 = 2;
	private static final int IMAGE_TYPE_DNG = 3;
	private static final int IMAGE_TYPE_JPEG = 4;
	private static final int IMAGE_TYPE_NEF = 5;
	private static final int IMAGE_TYPE_NRW = 6;
	private static final int IMAGE_TYPE_ORF = 7;
	private static final int IMAGE_TYPE_PEF = 8;
	private static final int IMAGE_TYPE_RAF = 9;
	private static final int IMAGE_TYPE_RW2 = 10;
	private static final int IMAGE_TYPE_SRW = 11;
	private static final int IMAGE_TYPE_UNKNOWN = 0;
	private static final ExifTag JPEG_INTERCHANGE_FORMAT_LENGTH_TAG = new ExifTag("JPEGInterchangeFormatLength", 514, 4);
	private static final ExifTag JPEG_INTERCHANGE_FORMAT_TAG = new ExifTag("JPEGInterchangeFormat", 513, 4);
	static final byte JPEG_SIGNATURE[] = {
		-1, -40, -1
	};
	public static final String LATITUDE_NORTH = "N";
	public static final String LATITUDE_SOUTH = "S";
	public static final short LIGHT_SOURCE_CLOUDY_WEATHER = 10;
	public static final short LIGHT_SOURCE_COOL_WHITE_FLUORESCENT = 14;
	public static final short LIGHT_SOURCE_D50 = 23;
	public static final short LIGHT_SOURCE_D55 = 20;
	public static final short LIGHT_SOURCE_D65 = 21;
	public static final short LIGHT_SOURCE_D75 = 22;
	public static final short LIGHT_SOURCE_DAYLIGHT = 1;
	public static final short LIGHT_SOURCE_DAYLIGHT_FLUORESCENT = 12;
	public static final short LIGHT_SOURCE_DAY_WHITE_FLUORESCENT = 13;
	public static final short LIGHT_SOURCE_FINE_WEATHER = 9;
	public static final short LIGHT_SOURCE_FLASH = 4;
	public static final short LIGHT_SOURCE_FLUORESCENT = 2;
	public static final short LIGHT_SOURCE_ISO_STUDIO_TUNGSTEN = 24;
	public static final short LIGHT_SOURCE_OTHER = 255;
	public static final short LIGHT_SOURCE_SHADE = 11;
	public static final short LIGHT_SOURCE_STANDARD_LIGHT_A = 17;
	public static final short LIGHT_SOURCE_STANDARD_LIGHT_B = 18;
	public static final short LIGHT_SOURCE_STANDARD_LIGHT_C = 19;
	public static final short LIGHT_SOURCE_TUNGSTEN = 3;
	public static final short LIGHT_SOURCE_UNKNOWN = 0;
	public static final short LIGHT_SOURCE_WARM_WHITE_FLUORESCENT = 16;
	public static final short LIGHT_SOURCE_WHITE_FLUORESCENT = 15;
	public static final String LONGITUDE_EAST = "E";
	public static final String LONGITUDE_WEST = "W";
	static final byte MARKER = -1;
	static final byte MARKER_APP1 = -31;
	private static final byte MARKER_COM = -2;
	static final byte MARKER_EOI = -39;
	private static final byte MARKER_SOF0 = -64;
	private static final byte MARKER_SOF1 = -63;
	private static final byte MARKER_SOF10 = -54;
	private static final byte MARKER_SOF11 = -53;
	private static final byte MARKER_SOF13 = -51;
	private static final byte MARKER_SOF14 = -50;
	private static final byte MARKER_SOF15 = -49;
	private static final byte MARKER_SOF2 = -62;
	private static final byte MARKER_SOF3 = -61;
	private static final byte MARKER_SOF5 = -59;
	private static final byte MARKER_SOF6 = -58;
	private static final byte MARKER_SOF7 = -57;
	private static final byte MARKER_SOF9 = -55;
	private static final byte MARKER_SOI = -40;
	private static final byte MARKER_SOS = -38;
	private static final int MAX_THUMBNAIL_SIZE = 512;
	public static final short METERING_MODE_AVERAGE = 1;
	public static final short METERING_MODE_CENTER_WEIGHT_AVERAGE = 2;
	public static final short METERING_MODE_MULTI_SPOT = 4;
	public static final short METERING_MODE_OTHER = 255;
	public static final short METERING_MODE_PARTIAL = 6;
	public static final short METERING_MODE_PATTERN = 5;
	public static final short METERING_MODE_SPOT = 3;
	public static final short METERING_MODE_UNKNOWN = 0;
	private static final ExifTag ORF_CAMERA_SETTINGS_TAGS[] = {
		new ExifTag("PreviewImageStart", 257, 4), new ExifTag("PreviewImageLength", 258, 4)
	};
	private static final ExifTag ORF_IMAGE_PROCESSING_TAGS[] = {
		new ExifTag("AspectFrame", 4371, 3)
	};
	private static final byte ORF_MAKER_NOTE_HEADER_1[] = {
		79, 76, 89, 77, 80, 0
	};
	private static final int ORF_MAKER_NOTE_HEADER_1_SIZE = 8;
	private static final byte ORF_MAKER_NOTE_HEADER_2[] = {
		79, 76, 89, 77, 80, 85, 83, 0, 73, 73
	};
	private static final int ORF_MAKER_NOTE_HEADER_2_SIZE = 12;
	private static final ExifTag ORF_MAKER_NOTE_TAGS[] = {
		new ExifTag("ThumbnailImage", 256, 7), new ExifTag("CameraSettingsIFDPointer", 8224, 4), new ExifTag("ImageProcessingIFDPointer", 8256, 4)
	};
	private static final short ORF_SIGNATURE_1 = 20306;
	private static final short ORF_SIGNATURE_2 = 21330;
	public static final int ORIENTATION_FLIP_HORIZONTAL = 2;
	public static final int ORIENTATION_FLIP_VERTICAL = 4;
	public static final int ORIENTATION_NORMAL = 1;
	public static final int ORIENTATION_ROTATE_180 = 3;
	public static final int ORIENTATION_ROTATE_270 = 8;
	public static final int ORIENTATION_ROTATE_90 = 6;
	public static final int ORIENTATION_TRANSPOSE = 5;
	public static final int ORIENTATION_TRANSVERSE = 7;
	public static final int ORIENTATION_UNDEFINED = 0;
	public static final int ORIGINAL_RESOLUTION_IMAGE = 0;
	private static final int PEF_MAKER_NOTE_SKIP_SIZE = 6;
	private static final String PEF_SIGNATURE = "PENTAX";
	private static final ExifTag PEF_TAGS[] = {
		new ExifTag("ColorSpace", 55, 3)
	};
	public static final int PHOTOMETRIC_INTERPRETATION_BLACK_IS_ZERO = 1;
	public static final int PHOTOMETRIC_INTERPRETATION_RGB = 2;
	public static final int PHOTOMETRIC_INTERPRETATION_WHITE_IS_ZERO = 0;
	public static final int PHOTOMETRIC_INTERPRETATION_YCBCR = 6;
	private static final int RAF_INFO_SIZE = 160;
	private static final int RAF_JPEG_LENGTH_VALUE_SIZE = 4;
	private static final int RAF_OFFSET_TO_JPEG_IMAGE_OFFSET = 84;
	private static final String RAF_SIGNATURE = "FUJIFILMCCD-RAW";
	public static final int REDUCED_RESOLUTION_IMAGE = 1;
	public static final short RENDERED_PROCESS_CUSTOM = 1;
	public static final short RENDERED_PROCESS_NORMAL = 0;
	public static final short RESOLUTION_UNIT_CENTIMETERS = 3;
	public static final short RESOLUTION_UNIT_INCHES = 2;
	private static final List ROTATION_ORDER = Arrays.asList(((Object []) (new Integer[] {
		Integer.valueOf(1), Integer.valueOf(6), Integer.valueOf(3), Integer.valueOf(8)
	})));
	private static final short RW2_SIGNATURE = 85;
	public static final short SATURATION_HIGH = 0;
	public static final short SATURATION_LOW = 0;
	public static final short SATURATION_NORMAL = 0;
	public static final short SCENE_CAPTURE_TYPE_LANDSCAPE = 1;
	public static final short SCENE_CAPTURE_TYPE_NIGHT = 3;
	public static final short SCENE_CAPTURE_TYPE_PORTRAIT = 2;
	public static final short SCENE_CAPTURE_TYPE_STANDARD = 0;
	public static final short SCENE_TYPE_DIRECTLY_PHOTOGRAPHED = 1;
	public static final short SENSITIVITY_TYPE_ISO_SPEED = 3;
	public static final short SENSITIVITY_TYPE_REI = 2;
	public static final short SENSITIVITY_TYPE_REI_AND_ISO = 6;
	public static final short SENSITIVITY_TYPE_SOS = 1;
	public static final short SENSITIVITY_TYPE_SOS_AND_ISO = 5;
	public static final short SENSITIVITY_TYPE_SOS_AND_REI = 4;
	public static final short SENSITIVITY_TYPE_SOS_AND_REI_AND_ISO = 7;
	public static final short SENSITIVITY_TYPE_UNKNOWN = 0;
	public static final short SENSOR_TYPE_COLOR_SEQUENTIAL = 5;
	public static final short SENSOR_TYPE_COLOR_SEQUENTIAL_LINEAR = 8;
	public static final short SENSOR_TYPE_NOT_DEFINED = 1;
	public static final short SENSOR_TYPE_ONE_CHIP = 2;
	public static final short SENSOR_TYPE_THREE_CHIP = 4;
	public static final short SENSOR_TYPE_TRILINEAR = 7;
	public static final short SENSOR_TYPE_TWO_CHIP = 3;
	public static final short SHARPNESS_HARD = 2;
	public static final short SHARPNESS_NORMAL = 0;
	public static final short SHARPNESS_SOFT = 1;
	private static final int SIGNATURE_CHECK_SIZE = 5000;
	static final byte START_CODE = 42;
	public static final short SUBJECT_DISTANCE_RANGE_CLOSE_VIEW = 2;
	public static final short SUBJECT_DISTANCE_RANGE_DISTANT_VIEW = 3;
	public static final short SUBJECT_DISTANCE_RANGE_MACRO = 1;
	public static final short SUBJECT_DISTANCE_RANGE_UNKNOWN = 0;
	private static final String TAG = "ExifInterface";
	public static final String TAG_APERTURE_VALUE = "ApertureValue";
	public static final String TAG_ARTIST = "Artist";
	public static final String TAG_BITS_PER_SAMPLE = "BitsPerSample";
	public static final String TAG_BODY_SERIAL_NUMBER = "BodySerialNumber";
	public static final String TAG_BRIGHTNESS_VALUE = "BrightnessValue";
	public static final String TAG_CAMARA_OWNER_NAME = "CameraOwnerName";
	public static final String TAG_CFA_PATTERN = "CFAPattern";
	public static final String TAG_COLOR_SPACE = "ColorSpace";
	public static final String TAG_COMPONENTS_CONFIGURATION = "ComponentsConfiguration";
	public static final String TAG_COMPRESSED_BITS_PER_PIXEL = "CompressedBitsPerPixel";
	public static final String TAG_COMPRESSION = "Compression";
	public static final String TAG_CONTRAST = "Contrast";
	public static final String TAG_COPYRIGHT = "Copyright";
	public static final String TAG_CUSTOM_RENDERED = "CustomRendered";
	public static final String TAG_DATETIME = "DateTime";
	public static final String TAG_DATETIME_DIGITIZED = "DateTimeDigitized";
	public static final String TAG_DATETIME_ORIGINAL = "DateTimeOriginal";
	public static final String TAG_DEFAULT_CROP_SIZE = "DefaultCropSize";
	public static final String TAG_DEVICE_SETTING_DESCRIPTION = "DeviceSettingDescription";
	public static final String TAG_DIGITAL_ZOOM_RATIO = "DigitalZoomRatio";
	public static final String TAG_DNG_VERSION = "DNGVersion";
	private static final String TAG_EXIF_IFD_POINTER = "ExifIFDPointer";
	public static final String TAG_EXIF_VERSION = "ExifVersion";
	public static final String TAG_EXPOSURE_BIAS_VALUE = "ExposureBiasValue";
	public static final String TAG_EXPOSURE_INDEX = "ExposureIndex";
	public static final String TAG_EXPOSURE_MODE = "ExposureMode";
	public static final String TAG_EXPOSURE_PROGRAM = "ExposureProgram";
	public static final String TAG_EXPOSURE_TIME = "ExposureTime";
	public static final String TAG_FILE_SOURCE = "FileSource";
	public static final String TAG_FLASH = "Flash";
	public static final String TAG_FLASHPIX_VERSION = "FlashpixVersion";
	public static final String TAG_FLASH_ENERGY = "FlashEnergy";
	public static final String TAG_FOCAL_LENGTH = "FocalLength";
	public static final String TAG_FOCAL_LENGTH_IN_35MM_FILM = "FocalLengthIn35mmFilm";
	public static final String TAG_FOCAL_PLANE_RESOLUTION_UNIT = "FocalPlaneResolutionUnit";
	public static final String TAG_FOCAL_PLANE_X_RESOLUTION = "FocalPlaneXResolution";
	public static final String TAG_FOCAL_PLANE_Y_RESOLUTION = "FocalPlaneYResolution";
	public static final String TAG_F_NUMBER = "FNumber";
	public static final String TAG_GAIN_CONTROL = "GainControl";
	public static final String TAG_GAMMA = "Gamma";
	public static final String TAG_GPS_ALTITUDE = "GPSAltitude";
	public static final String TAG_GPS_ALTITUDE_REF = "GPSAltitudeRef";
	public static final String TAG_GPS_AREA_INFORMATION = "GPSAreaInformation";
	public static final String TAG_GPS_DATESTAMP = "GPSDateStamp";
	public static final String TAG_GPS_DEST_BEARING = "GPSDestBearing";
	public static final String TAG_GPS_DEST_BEARING_REF = "GPSDestBearingRef";
	public static final String TAG_GPS_DEST_DISTANCE = "GPSDestDistance";
	public static final String TAG_GPS_DEST_DISTANCE_REF = "GPSDestDistanceRef";
	public static final String TAG_GPS_DEST_LATITUDE = "GPSDestLatitude";
	public static final String TAG_GPS_DEST_LATITUDE_REF = "GPSDestLatitudeRef";
	public static final String TAG_GPS_DEST_LONGITUDE = "GPSDestLongitude";
	public static final String TAG_GPS_DEST_LONGITUDE_REF = "GPSDestLongitudeRef";
	public static final String TAG_GPS_DIFFERENTIAL = "GPSDifferential";
	public static final String TAG_GPS_DOP = "GPSDOP";
	public static final String TAG_GPS_H_POSITIONING_ERROR = "GPSHPositioningError";
	public static final String TAG_GPS_IMG_DIRECTION = "GPSImgDirection";
	public static final String TAG_GPS_IMG_DIRECTION_REF = "GPSImgDirectionRef";
	private static final String TAG_GPS_INFO_IFD_POINTER = "GPSInfoIFDPointer";
	public static final String TAG_GPS_LATITUDE = "GPSLatitude";
	public static final String TAG_GPS_LATITUDE_REF = "GPSLatitudeRef";
	public static final String TAG_GPS_LONGITUDE = "GPSLongitude";
	public static final String TAG_GPS_LONGITUDE_REF = "GPSLongitudeRef";
	public static final String TAG_GPS_MAP_DATUM = "GPSMapDatum";
	public static final String TAG_GPS_MEASURE_MODE = "GPSMeasureMode";
	public static final String TAG_GPS_PROCESSING_METHOD = "GPSProcessingMethod";
	public static final String TAG_GPS_SATELLITES = "GPSSatellites";
	public static final String TAG_GPS_SPEED = "GPSSpeed";
	public static final String TAG_GPS_SPEED_REF = "GPSSpeedRef";
	public static final String TAG_GPS_STATUS = "GPSStatus";
	public static final String TAG_GPS_TIMESTAMP = "GPSTimeStamp";
	public static final String TAG_GPS_TRACK = "GPSTrack";
	public static final String TAG_GPS_TRACK_REF = "GPSTrackRef";
	public static final String TAG_GPS_VERSION_ID = "GPSVersionID";
	private static final String TAG_HAS_THUMBNAIL = "HasThumbnail";
	public static final String TAG_IMAGE_DESCRIPTION = "ImageDescription";
	public static final String TAG_IMAGE_LENGTH = "ImageLength";
	public static final String TAG_IMAGE_UNIQUE_ID = "ImageUniqueID";
	public static final String TAG_IMAGE_WIDTH = "ImageWidth";
	private static final String TAG_INTEROPERABILITY_IFD_POINTER = "InteroperabilityIFDPointer";
	public static final String TAG_INTEROPERABILITY_INDEX = "InteroperabilityIndex";
	public static final String TAG_ISO_SPEED = "ISOSpeed";
	public static final String TAG_ISO_SPEED_LATITUDE_YYY = "ISOSpeedLatitudeyyy";
	public static final String TAG_ISO_SPEED_LATITUDE_ZZZ = "ISOSpeedLatitudezzz";
	public static final String TAG_ISO_SPEED_RATINGS = "ISOSpeedRatings";
	public static final String TAG_JPEG_INTERCHANGE_FORMAT = "JPEGInterchangeFormat";
	public static final String TAG_JPEG_INTERCHANGE_FORMAT_LENGTH = "JPEGInterchangeFormatLength";
	public static final String TAG_LENS_MAKE = "LensMake";
	public static final String TAG_LENS_MODEL = "LensModel";
	public static final String TAG_LENS_SERIAL_NUMBER = "LensSerialNumber";
	public static final String TAG_LENS_SPECIFICATION = "LensSpecification";
	public static final String TAG_LIGHT_SOURCE = "LightSource";
	public static final String TAG_MAKE = "Make";
	public static final String TAG_MAKER_NOTE = "MakerNote";
	public static final String TAG_MAX_APERTURE_VALUE = "MaxApertureValue";
	public static final String TAG_METERING_MODE = "MeteringMode";
	public static final String TAG_MODEL = "Model";
	public static final String TAG_NEW_SUBFILE_TYPE = "NewSubfileType";
	public static final String TAG_OECF = "OECF";
	public static final String TAG_ORF_ASPECT_FRAME = "AspectFrame";
	private static final String TAG_ORF_CAMERA_SETTINGS_IFD_POINTER = "CameraSettingsIFDPointer";
	private static final String TAG_ORF_IMAGE_PROCESSING_IFD_POINTER = "ImageProcessingIFDPointer";
	public static final String TAG_ORF_PREVIEW_IMAGE_LENGTH = "PreviewImageLength";
	public static final String TAG_ORF_PREVIEW_IMAGE_START = "PreviewImageStart";
	public static final String TAG_ORF_THUMBNAIL_IMAGE = "ThumbnailImage";
	public static final String TAG_ORIENTATION = "Orientation";
	public static final String TAG_PHOTOGRAPHIC_SENSITIVITY = "PhotographicSensitivity";
	public static final String TAG_PHOTOMETRIC_INTERPRETATION = "PhotometricInterpretation";
	public static final String TAG_PIXEL_X_DIMENSION = "PixelXDimension";
	public static final String TAG_PIXEL_Y_DIMENSION = "PixelYDimension";
	public static final String TAG_PLANAR_CONFIGURATION = "PlanarConfiguration";
	public static final String TAG_PRIMARY_CHROMATICITIES = "PrimaryChromaticities";
	private static final ExifTag TAG_RAF_IMAGE_SIZE = new ExifTag("StripOffsets", 273, 3);
	public static final String TAG_RECOMMENDED_EXPOSURE_INDEX = "RecommendedExposureIndex";
	public static final String TAG_REFERENCE_BLACK_WHITE = "ReferenceBlackWhite";
	public static final String TAG_RELATED_SOUND_FILE = "RelatedSoundFile";
	public static final String TAG_RESOLUTION_UNIT = "ResolutionUnit";
	public static final String TAG_ROWS_PER_STRIP = "RowsPerStrip";
	public static final String TAG_RW2_ISO = "ISO";
	public static final String TAG_RW2_JPG_FROM_RAW = "JpgFromRaw";
	public static final String TAG_RW2_SENSOR_BOTTOM_BORDER = "SensorBottomBorder";
	public static final String TAG_RW2_SENSOR_LEFT_BORDER = "SensorLeftBorder";
	public static final String TAG_RW2_SENSOR_RIGHT_BORDER = "SensorRightBorder";
	public static final String TAG_RW2_SENSOR_TOP_BORDER = "SensorTopBorder";
	public static final String TAG_SAMPLES_PER_PIXEL = "SamplesPerPixel";
	public static final String TAG_SATURATION = "Saturation";
	public static final String TAG_SCENE_CAPTURE_TYPE = "SceneCaptureType";
	public static final String TAG_SCENE_TYPE = "SceneType";
	public static final String TAG_SENSING_METHOD = "SensingMethod";
	public static final String TAG_SENSITIVITY_TYPE = "SensitivityType";
	public static final String TAG_SHARPNESS = "Sharpness";
	public static final String TAG_SHUTTER_SPEED_VALUE = "ShutterSpeedValue";
	public static final String TAG_SOFTWARE = "Software";
	public static final String TAG_SPATIAL_FREQUENCY_RESPONSE = "SpatialFrequencyResponse";
	public static final String TAG_SPECTRAL_SENSITIVITY = "SpectralSensitivity";
	public static final String TAG_STANDARD_OUTPUT_SENSITIVITY = "StandardOutputSensitivity";
	public static final String TAG_STRIP_BYTE_COUNTS = "StripByteCounts";
	public static final String TAG_STRIP_OFFSETS = "StripOffsets";
	public static final String TAG_SUBFILE_TYPE = "SubfileType";
	public static final String TAG_SUBJECT_AREA = "SubjectArea";
	public static final String TAG_SUBJECT_DISTANCE = "SubjectDistance";
	public static final String TAG_SUBJECT_DISTANCE_RANGE = "SubjectDistanceRange";
	public static final String TAG_SUBJECT_LOCATION = "SubjectLocation";
	public static final String TAG_SUBSEC_TIME = "SubSecTime";
	public static final String TAG_SUBSEC_TIME_DIGITIZED = "SubSecTimeDigitized";
	public static final String TAG_SUBSEC_TIME_ORIGINAL = "SubSecTimeOriginal";
	private static final String TAG_SUB_IFD_POINTER = "SubIFDPointer";
	private static final String TAG_THUMBNAIL_DATA = "ThumbnailData";
	public static final String TAG_THUMBNAIL_IMAGE_LENGTH = "ThumbnailImageLength";
	public static final String TAG_THUMBNAIL_IMAGE_WIDTH = "ThumbnailImageWidth";
	private static final String TAG_THUMBNAIL_LENGTH = "ThumbnailLength";
	private static final String TAG_THUMBNAIL_OFFSET = "ThumbnailOffset";
	public static final String TAG_TRANSFER_FUNCTION = "TransferFunction";
	public static final String TAG_USER_COMMENT = "UserComment";
	public static final String TAG_WHITE_BALANCE = "WhiteBalance";
	public static final String TAG_WHITE_POINT = "WhitePoint";
	public static final String TAG_X_RESOLUTION = "XResolution";
	public static final String TAG_Y_CB_CR_COEFFICIENTS = "YCbCrCoefficients";
	public static final String TAG_Y_CB_CR_POSITIONING = "YCbCrPositioning";
	public static final String TAG_Y_CB_CR_SUB_SAMPLING = "YCbCrSubSampling";
	public static final String TAG_Y_RESOLUTION = "YResolution";
	public static final int WHITEBALANCE_AUTO = 0;
	public static final int WHITEBALANCE_MANUAL = 1;
	public static final short WHITE_BALANCE_AUTO = 0;
	public static final short WHITE_BALANCE_MANUAL = 1;
	public static final short Y_CB_CR_POSITIONING_CENTERED = 1;
	public static final short Y_CB_CR_POSITIONING_CO_SITED = 2;
	private static final HashMap sExifPointerTagMap;
	private static final HashMap sExifTagMapsForReading[];
	private static final HashMap sExifTagMapsForWriting[];
	private static SimpleDateFormat sFormatter;
	private static final Pattern sGpsTimestampPattern = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
	private static final Pattern sNonZeroTimePattern = Pattern.compile(".*[1-9].*");
	private static final HashSet sTagSetForCompatibility = new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
		"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"
	}))))));
	private final android.content.res.AssetManager.AssetInputStream mAssetInputStream;
	private final HashMap mAttributes[];
	private Set mAttributesOffsets;
	private ByteOrder mExifByteOrder;
	private int mExifOffset;
	private final String mFilename;
	private boolean mHasThumbnail;
	private boolean mIsSupportedFile;
	private int mMimeType;
	private int mOrfMakerNoteOffset;
	private int mOrfThumbnailLength;
	private int mOrfThumbnailOffset;
	private int mRw2JpgFromRawOffset;
	private byte mThumbnailBytes[];
	private int mThumbnailCompression;
	private int mThumbnailLength;
	private int mThumbnailOffset;

	static 
	{
	//    0    0:iconst_4        
	//    1    1:anewarray       Integer[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:iconst_1        
	//    5    7:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:bipush          6
	//   10   15:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//   11   18:aastore         
	//   12   19:dup             
	//   13   20:iconst_2        
	//   14   21:iconst_3        
	//   15   22:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//   16   25:aastore         
	//   17   26:dup             
	//   18   27:iconst_3        
	//   19   28:bipush          8
	//   20   30:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//   21   33:aastore         
	//   22   34:invokestatic    #901 <Method List Arrays.asList(Object[])>
	//   23   37:putstatic       #903 <Field List ROTATION_ORDER>
	//   24   40:iconst_4        
	//   25   41:anewarray       Integer[]
	//   26   44:dup             
	//   27   45:iconst_0        
	//   28   46:iconst_2        
	//   29   47:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//   30   50:aastore         
	//   31   51:dup             
	//   32   52:iconst_1        
	//   33   53:bipush          7
	//   34   55:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//   35   58:aastore         
	//   36   59:dup             
	//   37   60:iconst_2        
	//   38   61:iconst_4        
	//   39   62:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//   40   65:aastore         
	//   41   66:dup             
	//   42   67:iconst_3        
	//   43   68:iconst_5        
	//   44   69:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	//   45   72:aastore         
	//   46   73:invokestatic    #901 <Method List Arrays.asList(Object[])>
	//   47   76:putstatic       #905 <Field List FLIPPED_ROTATION_ORDER>
	//   48   79:iconst_3        
	//   49   80:newarray        int[]
	//   50   82:dup             
	//   51   83:iconst_0        
	//   52   84:bipush          8
	//   53   86:iastore         
	//   54   87:dup             
	//   55   88:iconst_1        
	//   56   89:bipush          8
	//   57   91:iastore         
	//   58   92:dup             
	//   59   93:iconst_2        
	//   60   94:bipush          8
	//   61   96:iastore         
	//   62   97:putstatic       #907 <Field int[] BITS_PER_SAMPLE_RGB>
	//   63  100:iconst_1        
	//   64  101:newarray        int[]
	//   65  103:dup             
	//   66  104:iconst_0        
	//   67  105:iconst_4        
	//   68  106:iastore         
	//   69  107:putstatic       #909 <Field int[] BITS_PER_SAMPLE_GREYSCALE_1>
	//   70  110:iconst_1        
	//   71  111:newarray        int[]
	//   72  113:dup             
	//   73  114:iconst_0        
	//   74  115:bipush          8
	//   75  117:iastore         
	//   76  118:putstatic       #911 <Field int[] BITS_PER_SAMPLE_GREYSCALE_2>
	//   77  121:iconst_3        
	//   78  122:newarray        byte[]
	//   79  124:dup             
	//   80  125:iconst_0        
	//   81  126:ldc1            #235 <Int -1>
	//   82  128:bastore         
	//   83  129:dup             
	//   84  130:iconst_1        
	//   85  131:ldc2            #269 <Int -40>
	//   86  134:bastore         
	//   87  135:dup             
	//   88  136:iconst_2        
	//   89  137:ldc1            #235 <Int -1>
	//   90  139:bastore         
	//   91  140:putstatic       #913 <Field byte[] JPEG_SIGNATURE>
	//   92  143:bipush          6
	//   93  145:newarray        byte[]
	//   94  147:dup             
	//   95  148:iconst_0        
	//   96  149:ldc2            #914 <Int 79>
	//   97  152:bastore         
	//   98  153:dup             
	//   99  154:iconst_1        
	//  100  155:ldc2            #915 <Int 76>
	//  101  158:bastore         
	//  102  159:dup             
	//  103  160:iconst_2        
	//  104  161:ldc2            #916 <Int 89>
	//  105  164:bastore         
	//  106  165:dup             
	//  107  166:iconst_3        
	//  108  167:ldc2            #917 <Int 77>
	//  109  170:bastore         
	//  110  171:dup             
	//  111  172:iconst_4        
	//  112  173:ldc2            #918 <Int 80>
	//  113  176:bastore         
	//  114  177:dup             
	//  115  178:iconst_5        
	//  116  179:ldc1            #25  <Int 0>
	//  117  181:bastore         
	//  118  182:putstatic       #920 <Field byte[] ORF_MAKER_NOTE_HEADER_1>
	//  119  185:bipush          10
	//  120  187:newarray        byte[]
	//  121  189:dup             
	//  122  190:iconst_0        
	//  123  191:ldc2            #914 <Int 79>
	//  124  194:bastore         
	//  125  195:dup             
	//  126  196:iconst_1        
	//  127  197:ldc2            #915 <Int 76>
	//  128  200:bastore         
	//  129  201:dup             
	//  130  202:iconst_2        
	//  131  203:ldc2            #916 <Int 89>
	//  132  206:bastore         
	//  133  207:dup             
	//  134  208:iconst_3        
	//  135  209:ldc2            #917 <Int 77>
	//  136  212:bastore         
	//  137  213:dup             
	//  138  214:iconst_4        
	//  139  215:ldc2            #918 <Int 80>
	//  140  218:bastore         
	//  141  219:dup             
	//  142  220:iconst_5        
	//  143  221:ldc2            #327 <Int 85>
	//  144  224:bastore         
	//  145  225:dup             
	//  146  226:bipush          6
	//  147  228:ldc2            #921 <Int 83>
	//  148  231:bastore         
	//  149  232:dup             
	//  150  233:bipush          7
	//  151  235:ldc1            #25  <Int 0>
	//  152  237:bastore         
	//  153  238:dup             
	//  154  239:bipush          8
	//  155  241:ldc2            #922 <Int 73>
	//  156  244:bastore         
	//  157  245:dup             
	//  158  246:bipush          9
	//  159  248:ldc2            #922 <Int 73>
	//  160  251:bastore         
	//  161  252:putstatic       #924 <Field byte[] ORF_MAKER_NOTE_HEADER_2>
	//  162  255:bipush          13
	//  163  257:anewarray       String[]
	//  164  260:dup             
	//  165  261:iconst_0        
	//  166  262:ldc2            #928 <String "">
	//  167  265:aastore         
	//  168  266:dup             
	//  169  267:iconst_1        
	//  170  268:ldc2            #930 <String "BYTE">
	//  171  271:aastore         
	//  172  272:dup             
	//  173  273:iconst_2        
	//  174  274:ldc2            #932 <String "STRING">
	//  175  277:aastore         
	//  176  278:dup             
	//  177  279:iconst_3        
	//  178  280:ldc2            #934 <String "USHORT">
	//  179  283:aastore         
	//  180  284:dup             
	//  181  285:iconst_4        
	//  182  286:ldc2            #936 <String "ULONG">
	//  183  289:aastore         
	//  184  290:dup             
	//  185  291:iconst_5        
	//  186  292:ldc2            #938 <String "URATIONAL">
	//  187  295:aastore         
	//  188  296:dup             
	//  189  297:bipush          6
	//  190  299:ldc2            #940 <String "SBYTE">
	//  191  302:aastore         
	//  192  303:dup             
	//  193  304:bipush          7
	//  194  306:ldc2            #942 <String "UNDEFINED">
	//  195  309:aastore         
	//  196  310:dup             
	//  197  311:bipush          8
	//  198  313:ldc2            #944 <String "SSHORT">
	//  199  316:aastore         
	//  200  317:dup             
	//  201  318:bipush          9
	//  202  320:ldc2            #946 <String "SLONG">
	//  203  323:aastore         
	//  204  324:dup             
	//  205  325:bipush          10
	//  206  327:ldc2            #948 <String "SRATIONAL">
	//  207  330:aastore         
	//  208  331:dup             
	//  209  332:bipush          11
	//  210  334:ldc2            #950 <String "SINGLE">
	//  211  337:aastore         
	//  212  338:dup             
	//  213  339:bipush          12
	//  214  341:ldc2            #952 <String "DOUBLE">
	//  215  344:aastore         
	//  216  345:putstatic       #954 <Field String[] IFD_FORMAT_NAMES>
	//  217  348:bipush          14
	//  218  350:newarray        int[]
	//  219  352:dup             
	//  220  353:iconst_0        
	//  221  354:iconst_0        
	//  222  355:iastore         
	//  223  356:dup             
	//  224  357:iconst_1        
	//  225  358:iconst_1        
	//  226  359:iastore         
	//  227  360:dup             
	//  228  361:iconst_2        
	//  229  362:iconst_1        
	//  230  363:iastore         
	//  231  364:dup             
	//  232  365:iconst_3        
	//  233  366:iconst_2        
	//  234  367:iastore         
	//  235  368:dup             
	//  236  369:iconst_4        
	//  237  370:iconst_4        
	//  238  371:iastore         
	//  239  372:dup             
	//  240  373:iconst_5        
	//  241  374:bipush          8
	//  242  376:iastore         
	//  243  377:dup             
	//  244  378:bipush          6
	//  245  380:iconst_1        
	//  246  381:iastore         
	//  247  382:dup             
	//  248  383:bipush          7
	//  249  385:iconst_1        
	//  250  386:iastore         
	//  251  387:dup             
	//  252  388:bipush          8
	//  253  390:iconst_2        
	//  254  391:iastore         
	//  255  392:dup             
	//  256  393:bipush          9
	//  257  395:iconst_4        
	//  258  396:iastore         
	//  259  397:dup             
	//  260  398:bipush          10
	//  261  400:bipush          8
	//  262  402:iastore         
	//  263  403:dup             
	//  264  404:bipush          11
	//  265  406:iconst_4        
	//  266  407:iastore         
	//  267  408:dup             
	//  268  409:bipush          12
	//  269  411:bipush          8
	//  270  413:iastore         
	//  271  414:dup             
	//  272  415:bipush          13
	//  273  417:iconst_1        
	//  274  418:iastore         
	//  275  419:putstatic       #956 <Field int[] IFD_FORMAT_BYTES_PER_FORMAT>
	//  276  422:bipush          8
	//  277  424:newarray        byte[]
	//  278  426:dup             
	//  279  427:iconst_0        
	//  280  428:ldc2            #957 <Int 65>
	//  281  431:bastore         
	//  282  432:dup             
	//  283  433:iconst_1        
	//  284  434:ldc2            #921 <Int 83>
	//  285  437:bastore         
	//  286  438:dup             
	//  287  439:iconst_2        
	//  288  440:ldc2            #958 <Int 67>
	//  289  443:bastore         
	//  290  444:dup             
	//  291  445:iconst_3        
	//  292  446:ldc2            #922 <Int 73>
	//  293  449:bastore         
	//  294  450:dup             
	//  295  451:iconst_4        
	//  296  452:ldc2            #922 <Int 73>
	//  297  455:bastore         
	//  298  456:dup             
	//  299  457:iconst_5        
	//  300  458:ldc1            #25  <Int 0>
	//  301  460:bastore         
	//  302  461:dup             
	//  303  462:bipush          6
	//  304  464:ldc1            #25  <Int 0>
	//  305  466:bastore         
	//  306  467:dup             
	//  307  468:bipush          7
	//  308  470:ldc1            #25  <Int 0>
	//  309  472:bastore         
	//  310  473:putstatic       #960 <Field byte[] EXIF_ASCII_PREFIX>
	//  311  476:bipush          41
	//  312  478:anewarray       ExifTag[]
	//  313  481:dup             
	//  314  482:iconst_0        
	//  315  483:new             #15  <Class ExifInterface$ExifTag>
	//  316  486:dup             
	//  317  487:ldc2            #656 <String "NewSubfileType">
	//  318  490:sipush          254
	//  319  493:iconst_4        
	//  320  494:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  321  497:aastore         
	//  322  498:dup             
	//  323  499:iconst_1        
	//  324  500:new             #15  <Class ExifInterface$ExifTag>
	//  325  503:dup             
	//  326  504:ldc2            #777 <String "SubfileType">
	//  327  507:sipush          255
	//  328  510:iconst_4        
	//  329  511:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  330  514:aastore         
	//  331  515:dup             
	//  332  516:iconst_2        
	//  333  517:new             #15  <Class ExifInterface$ExifTag>
	//  334  520:dup             
	//  335  521:ldc2            #598 <String "ImageWidth">
	//  336  524:sipush          256
	//  337  527:iconst_3        
	//  338  528:iconst_4        
	//  339  529:invokespecial   #967 <Method void ExifInterface$ExifTag(String, int, int, int)>
	//  340  532:aastore         
	//  341  533:dup             
	//  342  534:iconst_3        
	//  343  535:new             #15  <Class ExifInterface$ExifTag>
	//  344  538:dup             
	//  345  539:ldc2            #592 <String "ImageLength">
	//  346  542:sipush          257
	//  347  545:iconst_3        
	//  348  546:iconst_4        
	//  349  547:invokespecial   #967 <Method void ExifInterface$ExifTag(String, int, int, int)>
	//  350  550:aastore         
	//  351  551:dup             
	//  352  552:iconst_4        
	//  353  553:new             #15  <Class ExifInterface$ExifTag>
	//  354  556:dup             
	//  355  557:ldc2            #373 <String "BitsPerSample">
	//  356  560:sipush          258
	//  357  563:iconst_3        
	//  358  564:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  359  567:aastore         
	//  360  568:dup             
	//  361  569:iconst_5        
	//  362  570:new             #15  <Class ExifInterface$ExifTag>
	//  363  573:dup             
	//  364  574:ldc2            #397 <String "Compression">
	//  365  577:sipush          259
	//  366  580:iconst_3        
	//  367  581:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  368  584:aastore         
	//  369  585:dup             
	//  370  586:bipush          6
	//  371  588:new             #15  <Class ExifInterface$ExifTag>
	//  372  591:dup             
	//  373  592:ldc2            #686 <String "PhotometricInterpretation">
	//  374  595:sipush          262
	//  375  598:iconst_3        
	//  376  599:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  377  602:aastore         
	//  378  603:dup             
	//  379  604:bipush          7
	//  380  606:new             #15  <Class ExifInterface$ExifTag>
	//  381  609:dup             
	//  382  610:ldc2            #589 <String "ImageDescription">
	//  383  613:sipush          270
	//  384  616:iconst_2        
	//  385  617:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  386  620:aastore         
	//  387  621:dup             
	//  388  622:bipush          8
	//  389  624:new             #15  <Class ExifInterface$ExifTag>
	//  390  627:dup             
	//  391  628:ldc2            #641 <String "Make">
	//  392  631:sipush          271
	//  393  634:iconst_2        
	//  394  635:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  395  638:aastore         
	//  396  639:dup             
	//  397  640:bipush          9
	//  398  642:new             #15  <Class ExifInterface$ExifTag>
	//  399  645:dup             
	//  400  646:ldc2            #653 <String "Model">
	//  401  649:sipush          272
	//  402  652:iconst_2        
	//  403  653:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  404  656:aastore         
	//  405  657:dup             
	//  406  658:bipush          10
	//  407  660:new             #15  <Class ExifInterface$ExifTag>
	//  408  663:dup             
	//  409  664:ldc2            #774 <String "StripOffsets">
	//  410  667:sipush          273
	//  411  670:iconst_3        
	//  412  671:iconst_4        
	//  413  672:invokespecial   #967 <Method void ExifInterface$ExifTag(String, int, int, int)>
	//  414  675:aastore         
	//  415  676:dup             
	//  416  677:bipush          11
	//  417  679:new             #15  <Class ExifInterface$ExifTag>
	//  418  682:dup             
	//  419  683:ldc2            #680 <String "Orientation">
	//  420  686:sipush          274
	//  421  689:iconst_3        
	//  422  690:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  423  693:aastore         
	//  424  694:dup             
	//  425  695:bipush          12
	//  426  697:new             #15  <Class ExifInterface$ExifTag>
	//  427  700:dup             
	//  428  701:ldc2            #735 <String "SamplesPerPixel">
	//  429  704:sipush          277
	//  430  707:iconst_3        
	//  431  708:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  432  711:aastore         
	//  433  712:dup             
	//  434  713:bipush          13
	//  435  715:new             #15  <Class ExifInterface$ExifTag>
	//  436  718:dup             
	//  437  719:ldc2            #714 <String "RowsPerStrip">
	//  438  722:sipush          278
	//  439  725:iconst_3        
	//  440  726:iconst_4        
	//  441  727:invokespecial   #967 <Method void ExifInterface$ExifTag(String, int, int, int)>
	//  442  730:aastore         
	//  443  731:dup             
	//  444  732:bipush          14
	//  445  734:new             #15  <Class ExifInterface$ExifTag>
	//  446  737:dup             
	//  447  738:ldc2            #771 <String "StripByteCounts">
	//  448  741:sipush          279
	//  449  744:iconst_3        
	//  450  745:iconst_4        
	//  451  746:invokespecial   #967 <Method void ExifInterface$ExifTag(String, int, int, int)>
	//  452  749:aastore         
	//  453  750:dup             
	//  454  751:bipush          15
	//  455  753:new             #15  <Class ExifInterface$ExifTag>
	//  456  756:dup             
	//  457  757:ldc2            #831 <String "XResolution">
	//  458  760:sipush          282
	//  459  763:iconst_5        
	//  460  764:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  461  767:aastore         
	//  462  768:dup             
	//  463  769:bipush          16
	//  464  771:new             #15  <Class ExifInterface$ExifTag>
	//  465  774:dup             
	//  466  775:ldc2            #843 <String "YResolution">
	//  467  778:sipush          283
	//  468  781:iconst_5        
	//  469  782:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  470  785:aastore         
	//  471  786:dup             
	//  472  787:bipush          17
	//  473  789:new             #15  <Class ExifInterface$ExifTag>
	//  474  792:dup             
	//  475  793:ldc2            #695 <String "PlanarConfiguration">
	//  476  796:sipush          284
	//  477  799:iconst_3        
	//  478  800:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  479  803:aastore         
	//  480  804:dup             
	//  481  805:bipush          18
	//  482  807:new             #15  <Class ExifInterface$ExifTag>
	//  483  810:dup             
	//  484  811:ldc2            #711 <String "ResolutionUnit">
	//  485  814:sipush          296
	//  486  817:iconst_3        
	//  487  818:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  488  821:aastore         
	//  489  822:dup             
	//  490  823:bipush          19
	//  491  825:new             #15  <Class ExifInterface$ExifTag>
	//  492  828:dup             
	//  493  829:ldc2            #819 <String "TransferFunction">
	//  494  832:sipush          301
	//  495  835:iconst_3        
	//  496  836:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  497  839:aastore         
	//  498  840:dup             
	//  499  841:bipush          20
	//  500  843:new             #15  <Class ExifInterface$ExifTag>
	//  501  846:dup             
	//  502  847:ldc2            #759 <String "Software">
	//  503  850:sipush          305
	//  504  853:iconst_2        
	//  505  854:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  506  857:aastore         
	//  507  858:dup             
	//  508  859:bipush          21
	//  509  861:new             #15  <Class ExifInterface$ExifTag>
	//  510  864:dup             
	//  511  865:ldc2            #409 <String "DateTime">
	//  512  868:sipush          306
	//  513  871:iconst_2        
	//  514  872:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  515  875:aastore         
	//  516  876:dup             
	//  517  877:bipush          22
	//  518  879:new             #15  <Class ExifInterface$ExifTag>
	//  519  882:dup             
	//  520  883:ldc2            #370 <String "Artist">
	//  521  886:sipush          315
	//  522  889:iconst_2        
	//  523  890:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  524  893:aastore         
	//  525  894:dup             
	//  526  895:bipush          23
	//  527  897:new             #15  <Class ExifInterface$ExifTag>
	//  528  900:dup             
	//  529  901:ldc2            #828 <String "WhitePoint">
	//  530  904:sipush          318
	//  531  907:iconst_5        
	//  532  908:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  533  911:aastore         
	//  534  912:dup             
	//  535  913:bipush          24
	//  536  915:new             #15  <Class ExifInterface$ExifTag>
	//  537  918:dup             
	//  538  919:ldc2            #698 <String "PrimaryChromaticities">
	//  539  922:sipush          319
	//  540  925:iconst_5        
	//  541  926:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  542  929:aastore         
	//  543  930:dup             
	//  544  931:bipush          25
	//  545  933:new             #15  <Class ExifInterface$ExifTag>
	//  546  936:dup             
	//  547  937:ldc2            #801 <String "SubIFDPointer">
	//  548  940:sipush          330
	//  549  943:iconst_4        
	//  550  944:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  551  947:aastore         
	//  552  948:dup             
	//  553  949:bipush          26
	//  554  951:new             #15  <Class ExifInterface$ExifTag>
	//  555  954:dup             
	//  556  955:ldc2            #620 <String "JPEGInterchangeFormat">
	//  557  958:sipush          513
	//  558  961:iconst_4        
	//  559  962:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  560  965:aastore         
	//  561  966:dup             
	//  562  967:bipush          27
	//  563  969:new             #15  <Class ExifInterface$ExifTag>
	//  564  972:dup             
	//  565  973:ldc2            #623 <String "JPEGInterchangeFormatLength">
	//  566  976:sipush          514
	//  567  979:iconst_4        
	//  568  980:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  569  983:aastore         
	//  570  984:dup             
	//  571  985:bipush          28
	//  572  987:new             #15  <Class ExifInterface$ExifTag>
	//  573  990:dup             
	//  574  991:ldc2            #834 <String "YCbCrCoefficients">
	//  575  994:sipush          529
	//  576  997:iconst_5        
	//  577  998:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  578 1001:aastore         
	//  579 1002:dup             
	//  580 1003:bipush          29
	//  581 1005:new             #15  <Class ExifInterface$ExifTag>
	//  582 1008:dup             
	//  583 1009:ldc2            #840 <String "YCbCrSubSampling">
	//  584 1012:sipush          530
	//  585 1015:iconst_3        
	//  586 1016:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  587 1019:aastore         
	//  588 1020:dup             
	//  589 1021:bipush          30
	//  590 1023:new             #15  <Class ExifInterface$ExifTag>
	//  591 1026:dup             
	//  592 1027:ldc2            #837 <String "YCbCrPositioning">
	//  593 1030:sipush          531
	//  594 1033:iconst_3        
	//  595 1034:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  596 1037:aastore         
	//  597 1038:dup             
	//  598 1039:bipush          31
	//  599 1041:new             #15  <Class ExifInterface$ExifTag>
	//  600 1044:dup             
	//  601 1045:ldc2            #705 <String "ReferenceBlackWhite">
	//  602 1048:sipush          532
	//  603 1051:iconst_5        
	//  604 1052:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  605 1055:aastore         
	//  606 1056:dup             
	//  607 1057:bipush          32
	//  608 1059:new             #15  <Class ExifInterface$ExifTag>
	//  609 1062:dup             
	//  610 1063:ldc2            #403 <String "Copyright">
	//  611 1066:ldc2            #968 <Int 33432>
	//  612 1069:iconst_2        
	//  613 1070:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  614 1073:aastore         
	//  615 1074:dup             
	//  616 1075:bipush          33
	//  617 1077:new             #15  <Class ExifInterface$ExifTag>
	//  618 1080:dup             
	//  619 1081:ldc2            #430 <String "ExifIFDPointer">
	//  620 1084:ldc2            #969 <Int 34665>
	//  621 1087:iconst_4        
	//  622 1088:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  623 1091:aastore         
	//  624 1092:dup             
	//  625 1093:bipush          34
	//  626 1095:new             #15  <Class ExifInterface$ExifTag>
	//  627 1098:dup             
	//  628 1099:ldc2            #538 <String "GPSInfoIFDPointer">
	//  629 1102:ldc2            #970 <Int 34853>
	//  630 1105:iconst_4        
	//  631 1106:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  632 1109:aastore         
	//  633 1110:dup             
	//  634 1111:bipush          35
	//  635 1113:new             #15  <Class ExifInterface$ExifTag>
	//  636 1116:dup             
	//  637 1117:ldc2            #732 <String "SensorTopBorder">
	//  638 1120:iconst_4        
	//  639 1121:iconst_4        
	//  640 1122:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  641 1125:aastore         
	//  642 1126:dup             
	//  643 1127:bipush          36
	//  644 1129:new             #15  <Class ExifInterface$ExifTag>
	//  645 1132:dup             
	//  646 1133:ldc2            #726 <String "SensorLeftBorder">
	//  647 1136:iconst_5        
	//  648 1137:iconst_4        
	//  649 1138:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  650 1141:aastore         
	//  651 1142:dup             
	//  652 1143:bipush          37
	//  653 1145:new             #15  <Class ExifInterface$ExifTag>
	//  654 1148:dup             
	//  655 1149:ldc2            #723 <String "SensorBottomBorder">
	//  656 1152:bipush          6
	//  657 1154:iconst_4        
	//  658 1155:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  659 1158:aastore         
	//  660 1159:dup             
	//  661 1160:bipush          38
	//  662 1162:new             #15  <Class ExifInterface$ExifTag>
	//  663 1165:dup             
	//  664 1166:ldc2            #729 <String "SensorRightBorder">
	//  665 1169:bipush          7
	//  666 1171:iconst_4        
	//  667 1172:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  668 1175:aastore         
	//  669 1176:dup             
	//  670 1177:bipush          39
	//  671 1179:new             #15  <Class ExifInterface$ExifTag>
	//  672 1182:dup             
	//  673 1183:ldc2            #717 <String "ISO">
	//  674 1186:bipush          23
	//  675 1188:iconst_3        
	//  676 1189:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  677 1192:aastore         
	//  678 1193:dup             
	//  679 1194:bipush          40
	//  680 1196:new             #15  <Class ExifInterface$ExifTag>
	//  681 1199:dup             
	//  682 1200:ldc2            #720 <String "JpgFromRaw">
	//  683 1203:bipush          46
	//  684 1205:bipush          7
	//  685 1207:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  686 1210:aastore         
	//  687 1211:putstatic       #972 <Field ExifInterface$ExifTag[] IFD_TIFF_TAGS>
	//  688 1214:bipush          59
	//  689 1216:anewarray       ExifTag[]
	//  690 1219:dup             
	//  691 1220:iconst_0        
	//  692 1221:new             #15  <Class ExifInterface$ExifTag>
	//  693 1224:dup             
	//  694 1225:ldc2            #448 <String "ExposureTime">
	//  695 1228:ldc2            #973 <Int 33434>
	//  696 1231:iconst_5        
	//  697 1232:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  698 1235:aastore         
	//  699 1236:dup             
	//  700 1237:iconst_1        
	//  701 1238:new             #15  <Class ExifInterface$ExifTag>
	//  702 1241:dup             
	//  703 1242:ldc2            #478 <String "FNumber">
	//  704 1245:ldc2            #974 <Int 33437>
	//  705 1248:iconst_5        
	//  706 1249:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  707 1252:aastore         
	//  708 1253:dup             
	//  709 1254:iconst_2        
	//  710 1255:new             #15  <Class ExifInterface$ExifTag>
	//  711 1258:dup             
	//  712 1259:ldc2            #445 <String "ExposureProgram">
	//  713 1262:ldc2            #975 <Int 34850>
	//  714 1265:iconst_3        
	//  715 1266:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  716 1269:aastore         
	//  717 1270:dup             
	//  718 1271:iconst_3        
	//  719 1272:new             #15  <Class ExifInterface$ExifTag>
	//  720 1275:dup             
	//  721 1276:ldc2            #765 <String "SpectralSensitivity">
	//  722 1279:ldc2            #976 <Int 34852>
	//  723 1282:iconst_2        
	//  724 1283:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  725 1286:aastore         
	//  726 1287:dup             
	//  727 1288:iconst_4        
	//  728 1289:new             #15  <Class ExifInterface$ExifTag>
	//  729 1292:dup             
	//  730 1293:ldc2            #683 <String "PhotographicSensitivity">
	//  731 1296:ldc2            #977 <Int 34855>
	//  732 1299:iconst_3        
	//  733 1300:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  734 1303:aastore         
	//  735 1304:dup             
	//  736 1305:iconst_5        
	//  737 1306:new             #15  <Class ExifInterface$ExifTag>
	//  738 1309:dup             
	//  739 1310:ldc2            #659 <String "OECF">
	//  740 1313:ldc2            #978 <Int 34856>
	//  741 1316:bipush          7
	//  742 1318:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  743 1321:aastore         
	//  744 1322:dup             
	//  745 1323:bipush          6
	//  746 1325:new             #15  <Class ExifInterface$ExifTag>
	//  747 1328:dup             
	//  748 1329:ldc2            #433 <String "ExifVersion">
	//  749 1332:ldc2            #979 <Int 36864>
	//  750 1335:iconst_2        
	//  751 1336:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  752 1339:aastore         
	//  753 1340:dup             
	//  754 1341:bipush          7
	//  755 1343:new             #15  <Class ExifInterface$ExifTag>
	//  756 1346:dup             
	//  757 1347:ldc2            #415 <String "DateTimeOriginal">
	//  758 1350:ldc2            #980 <Int 36867>
	//  759 1353:iconst_2        
	//  760 1354:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  761 1357:aastore         
	//  762 1358:dup             
	//  763 1359:bipush          8
	//  764 1361:new             #15  <Class ExifInterface$ExifTag>
	//  765 1364:dup             
	//  766 1365:ldc2            #412 <String "DateTimeDigitized">
	//  767 1368:ldc2            #981 <Int 36868>
	//  768 1371:iconst_2        
	//  769 1372:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  770 1375:aastore         
	//  771 1376:dup             
	//  772 1377:bipush          9
	//  773 1379:new             #15  <Class ExifInterface$ExifTag>
	//  774 1382:dup             
	//  775 1383:ldc2            #391 <String "ComponentsConfiguration">
	//  776 1386:ldc2            #982 <Int 37121>
	//  777 1389:bipush          7
	//  778 1391:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  779 1394:aastore         
	//  780 1395:dup             
	//  781 1396:bipush          10
	//  782 1398:new             #15  <Class ExifInterface$ExifTag>
	//  783 1401:dup             
	//  784 1402:ldc2            #394 <String "CompressedBitsPerPixel">
	//  785 1405:ldc2            #983 <Int 37122>
	//  786 1408:iconst_5        
	//  787 1409:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  788 1412:aastore         
	//  789 1413:dup             
	//  790 1414:bipush          11
	//  791 1416:new             #15  <Class ExifInterface$ExifTag>
	//  792 1419:dup             
	//  793 1420:ldc2            #756 <String "ShutterSpeedValue">
	//  794 1423:ldc2            #984 <Int 37377>
	//  795 1426:bipush          10
	//  796 1428:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  797 1431:aastore         
	//  798 1432:dup             
	//  799 1433:bipush          12
	//  800 1435:new             #15  <Class ExifInterface$ExifTag>
	//  801 1438:dup             
	//  802 1439:ldc2            #367 <String "ApertureValue">
	//  803 1442:ldc2            #985 <Int 37378>
	//  804 1445:iconst_5        
	//  805 1446:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  806 1449:aastore         
	//  807 1450:dup             
	//  808 1451:bipush          13
	//  809 1453:new             #15  <Class ExifInterface$ExifTag>
	//  810 1456:dup             
	//  811 1457:ldc2            #379 <String "BrightnessValue">
	//  812 1460:ldc2            #986 <Int 37379>
	//  813 1463:bipush          10
	//  814 1465:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  815 1468:aastore         
	//  816 1469:dup             
	//  817 1470:bipush          14
	//  818 1472:new             #15  <Class ExifInterface$ExifTag>
	//  819 1475:dup             
	//  820 1476:ldc2            #436 <String "ExposureBiasValue">
	//  821 1479:ldc2            #987 <Int 37380>
	//  822 1482:bipush          10
	//  823 1484:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  824 1487:aastore         
	//  825 1488:dup             
	//  826 1489:bipush          15
	//  827 1491:new             #15  <Class ExifInterface$ExifTag>
	//  828 1494:dup             
	//  829 1495:ldc2            #647 <String "MaxApertureValue">
	//  830 1498:ldc2            #988 <Int 37381>
	//  831 1501:iconst_5        
	//  832 1502:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  833 1505:aastore         
	//  834 1506:dup             
	//  835 1507:bipush          16
	//  836 1509:new             #15  <Class ExifInterface$ExifTag>
	//  837 1512:dup             
	//  838 1513:ldc2            #783 <String "SubjectDistance">
	//  839 1516:ldc2            #989 <Int 37382>
	//  840 1519:iconst_5        
	//  841 1520:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  842 1523:aastore         
	//  843 1524:dup             
	//  844 1525:bipush          17
	//  845 1527:new             #15  <Class ExifInterface$ExifTag>
	//  846 1530:dup             
	//  847 1531:ldc2            #650 <String "MeteringMode">
	//  848 1534:ldc2            #990 <Int 37383>
	//  849 1537:iconst_3        
	//  850 1538:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  851 1541:aastore         
	//  852 1542:dup             
	//  853 1543:bipush          18
	//  854 1545:new             #15  <Class ExifInterface$ExifTag>
	//  855 1548:dup             
	//  856 1549:ldc2            #638 <String "LightSource">
	//  857 1552:ldc2            #991 <Int 37384>
	//  858 1555:iconst_3        
	//  859 1556:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  860 1559:aastore         
	//  861 1560:dup             
	//  862 1561:bipush          19
	//  863 1563:new             #15  <Class ExifInterface$ExifTag>
	//  864 1566:dup             
	//  865 1567:ldc2            #454 <String "Flash">
	//  866 1570:ldc2            #992 <Int 37385>
	//  867 1573:iconst_3        
	//  868 1574:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  869 1577:aastore         
	//  870 1578:dup             
	//  871 1579:bipush          20
	//  872 1581:new             #15  <Class ExifInterface$ExifTag>
	//  873 1584:dup             
	//  874 1585:ldc2            #463 <String "FocalLength">
	//  875 1588:ldc2            #993 <Int 37386>
	//  876 1591:iconst_5        
	//  877 1592:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  878 1595:aastore         
	//  879 1596:dup             
	//  880 1597:bipush          21
	//  881 1599:new             #15  <Class ExifInterface$ExifTag>
	//  882 1602:dup             
	//  883 1603:ldc2            #780 <String "SubjectArea">
	//  884 1606:ldc2            #994 <Int 37396>
	//  885 1609:iconst_3        
	//  886 1610:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  887 1613:aastore         
	//  888 1614:dup             
	//  889 1615:bipush          22
	//  890 1617:new             #15  <Class ExifInterface$ExifTag>
	//  891 1620:dup             
	//  892 1621:ldc2            #644 <String "MakerNote">
	//  893 1624:ldc2            #995 <Int 37500>
	//  894 1627:bipush          7
	//  895 1629:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  896 1632:aastore         
	//  897 1633:dup             
	//  898 1634:bipush          23
	//  899 1636:new             #15  <Class ExifInterface$ExifTag>
	//  900 1639:dup             
	//  901 1640:ldc2            #822 <String "UserComment">
	//  902 1643:ldc2            #996 <Int 37510>
	//  903 1646:bipush          7
	//  904 1648:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  905 1651:aastore         
	//  906 1652:dup             
	//  907 1653:bipush          24
	//  908 1655:new             #15  <Class ExifInterface$ExifTag>
	//  909 1658:dup             
	//  910 1659:ldc2            #792 <String "SubSecTime">
	//  911 1662:ldc2            #997 <Int 37520>
	//  912 1665:iconst_2        
	//  913 1666:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  914 1669:aastore         
	//  915 1670:dup             
	//  916 1671:bipush          25
	//  917 1673:new             #15  <Class ExifInterface$ExifTag>
	//  918 1676:dup             
	//  919 1677:ldc2            #798 <String "SubSecTimeOriginal">
	//  920 1680:ldc2            #998 <Int 37521>
	//  921 1683:iconst_2        
	//  922 1684:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  923 1687:aastore         
	//  924 1688:dup             
	//  925 1689:bipush          26
	//  926 1691:new             #15  <Class ExifInterface$ExifTag>
	//  927 1694:dup             
	//  928 1695:ldc2            #795 <String "SubSecTimeDigitized">
	//  929 1698:ldc2            #999 <Int 37522>
	//  930 1701:iconst_2        
	//  931 1702:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  932 1705:aastore         
	//  933 1706:dup             
	//  934 1707:bipush          27
	//  935 1709:new             #15  <Class ExifInterface$ExifTag>
	//  936 1712:dup             
	//  937 1713:ldc2            #457 <String "FlashpixVersion">
	//  938 1716:ldc2            #1000 <Int 40960>
	//  939 1719:bipush          7
	//  940 1721:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  941 1724:aastore         
	//  942 1725:dup             
	//  943 1726:bipush          28
	//  944 1728:new             #15  <Class ExifInterface$ExifTag>
	//  945 1731:dup             
	//  946 1732:ldc2            #388 <String "ColorSpace">
	//  947 1735:ldc2            #1001 <Int 40961>
	//  948 1738:iconst_3        
	//  949 1739:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  950 1742:aastore         
	//  951 1743:dup             
	//  952 1744:bipush          29
	//  953 1746:new             #15  <Class ExifInterface$ExifTag>
	//  954 1749:dup             
	//  955 1750:ldc2            #689 <String "PixelXDimension">
	//  956 1753:ldc2            #1002 <Int 40962>
	//  957 1756:iconst_3        
	//  958 1757:iconst_4        
	//  959 1758:invokespecial   #967 <Method void ExifInterface$ExifTag(String, int, int, int)>
	//  960 1761:aastore         
	//  961 1762:dup             
	//  962 1763:bipush          30
	//  963 1765:new             #15  <Class ExifInterface$ExifTag>
	//  964 1768:dup             
	//  965 1769:ldc2            #692 <String "PixelYDimension">
	//  966 1772:ldc2            #1003 <Int 40963>
	//  967 1775:iconst_3        
	//  968 1776:iconst_4        
	//  969 1777:invokespecial   #967 <Method void ExifInterface$ExifTag(String, int, int, int)>
	//  970 1780:aastore         
	//  971 1781:dup             
	//  972 1782:bipush          31
	//  973 1784:new             #15  <Class ExifInterface$ExifTag>
	//  974 1787:dup             
	//  975 1788:ldc2            #708 <String "RelatedSoundFile">
	//  976 1791:ldc2            #1004 <Int 40964>
	//  977 1794:iconst_2        
	//  978 1795:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  979 1798:aastore         
	//  980 1799:dup             
	//  981 1800:bipush          32
	//  982 1802:new             #15  <Class ExifInterface$ExifTag>
	//  983 1805:dup             
	//  984 1806:ldc2            #601 <String "InteroperabilityIFDPointer">
	//  985 1809:ldc2            #1005 <Int 40965>
	//  986 1812:iconst_4        
	//  987 1813:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  988 1816:aastore         
	//  989 1817:dup             
	//  990 1818:bipush          33
	//  991 1820:new             #15  <Class ExifInterface$ExifTag>
	//  992 1823:dup             
	//  993 1824:ldc2            #460 <String "FlashEnergy">
	//  994 1827:ldc2            #1006 <Int 41483>
	//  995 1830:iconst_5        
	//  996 1831:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	//  997 1834:aastore         
	//  998 1835:dup             
	//  999 1836:bipush          34
	// 1000 1838:new             #15  <Class ExifInterface$ExifTag>
	// 1001 1841:dup             
	// 1002 1842:ldc2            #762 <String "SpatialFrequencyResponse">
	// 1003 1845:ldc2            #1007 <Int 41484>
	// 1004 1848:bipush          7
	// 1005 1850:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1006 1853:aastore         
	// 1007 1854:dup             
	// 1008 1855:bipush          35
	// 1009 1857:new             #15  <Class ExifInterface$ExifTag>
	// 1010 1860:dup             
	// 1011 1861:ldc2            #472 <String "FocalPlaneXResolution">
	// 1012 1864:ldc2            #1008 <Int 41486>
	// 1013 1867:iconst_5        
	// 1014 1868:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1015 1871:aastore         
	// 1016 1872:dup             
	// 1017 1873:bipush          36
	// 1018 1875:new             #15  <Class ExifInterface$ExifTag>
	// 1019 1878:dup             
	// 1020 1879:ldc2            #475 <String "FocalPlaneYResolution">
	// 1021 1882:ldc2            #1009 <Int 41487>
	// 1022 1885:iconst_5        
	// 1023 1886:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1024 1889:aastore         
	// 1025 1890:dup             
	// 1026 1891:bipush          37
	// 1027 1893:new             #15  <Class ExifInterface$ExifTag>
	// 1028 1896:dup             
	// 1029 1897:ldc2            #469 <String "FocalPlaneResolutionUnit">
	// 1030 1900:ldc2            #1010 <Int 41488>
	// 1031 1903:iconst_3        
	// 1032 1904:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1033 1907:aastore         
	// 1034 1908:dup             
	// 1035 1909:bipush          38
	// 1036 1911:new             #15  <Class ExifInterface$ExifTag>
	// 1037 1914:dup             
	// 1038 1915:ldc2            #789 <String "SubjectLocation">
	// 1039 1918:ldc2            #1011 <Int 41492>
	// 1040 1921:iconst_3        
	// 1041 1922:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1042 1925:aastore         
	// 1043 1926:dup             
	// 1044 1927:bipush          39
	// 1045 1929:new             #15  <Class ExifInterface$ExifTag>
	// 1046 1932:dup             
	// 1047 1933:ldc2            #439 <String "ExposureIndex">
	// 1048 1936:ldc2            #1012 <Int 41493>
	// 1049 1939:iconst_5        
	// 1050 1940:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1051 1943:aastore         
	// 1052 1944:dup             
	// 1053 1945:bipush          40
	// 1054 1947:new             #15  <Class ExifInterface$ExifTag>
	// 1055 1950:dup             
	// 1056 1951:ldc2            #747 <String "SensingMethod">
	// 1057 1954:ldc2            #1013 <Int 41495>
	// 1058 1957:iconst_3        
	// 1059 1958:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1060 1961:aastore         
	// 1061 1962:dup             
	// 1062 1963:bipush          41
	// 1063 1965:new             #15  <Class ExifInterface$ExifTag>
	// 1064 1968:dup             
	// 1065 1969:ldc2            #451 <String "FileSource">
	// 1066 1972:ldc2            #1014 <Int 41728>
	// 1067 1975:bipush          7
	// 1068 1977:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1069 1980:aastore         
	// 1070 1981:dup             
	// 1071 1982:bipush          42
	// 1072 1984:new             #15  <Class ExifInterface$ExifTag>
	// 1073 1987:dup             
	// 1074 1988:ldc2            #744 <String "SceneType">
	// 1075 1991:ldc2            #1015 <Int 41729>
	// 1076 1994:bipush          7
	// 1077 1996:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1078 1999:aastore         
	// 1079 2000:dup             
	// 1080 2001:bipush          43
	// 1081 2003:new             #15  <Class ExifInterface$ExifTag>
	// 1082 2006:dup             
	// 1083 2007:ldc2            #385 <String "CFAPattern">
	// 1084 2010:ldc2            #1016 <Int 41730>
	// 1085 2013:bipush          7
	// 1086 2015:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1087 2018:aastore         
	// 1088 2019:dup             
	// 1089 2020:bipush          44
	// 1090 2022:new             #15  <Class ExifInterface$ExifTag>
	// 1091 2025:dup             
	// 1092 2026:ldc2            #406 <String "CustomRendered">
	// 1093 2029:ldc2            #1017 <Int 41985>
	// 1094 2032:iconst_3        
	// 1095 2033:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1096 2036:aastore         
	// 1097 2037:dup             
	// 1098 2038:bipush          45
	// 1099 2040:new             #15  <Class ExifInterface$ExifTag>
	// 1100 2043:dup             
	// 1101 2044:ldc2            #442 <String "ExposureMode">
	// 1102 2047:ldc2            #1018 <Int 41986>
	// 1103 2050:iconst_3        
	// 1104 2051:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1105 2054:aastore         
	// 1106 2055:dup             
	// 1107 2056:bipush          46
	// 1108 2058:new             #15  <Class ExifInterface$ExifTag>
	// 1109 2061:dup             
	// 1110 2062:ldc2            #825 <String "WhiteBalance">
	// 1111 2065:ldc2            #1019 <Int 41987>
	// 1112 2068:iconst_3        
	// 1113 2069:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1114 2072:aastore         
	// 1115 2073:dup             
	// 1116 2074:bipush          47
	// 1117 2076:new             #15  <Class ExifInterface$ExifTag>
	// 1118 2079:dup             
	// 1119 2080:ldc2            #424 <String "DigitalZoomRatio">
	// 1120 2083:ldc2            #1020 <Int 41988>
	// 1121 2086:iconst_5        
	// 1122 2087:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1123 2090:aastore         
	// 1124 2091:dup             
	// 1125 2092:bipush          48
	// 1126 2094:new             #15  <Class ExifInterface$ExifTag>
	// 1127 2097:dup             
	// 1128 2098:ldc2            #466 <String "FocalLengthIn35mmFilm">
	// 1129 2101:ldc2            #1021 <Int 41989>
	// 1130 2104:iconst_3        
	// 1131 2105:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1132 2108:aastore         
	// 1133 2109:dup             
	// 1134 2110:bipush          49
	// 1135 2112:new             #15  <Class ExifInterface$ExifTag>
	// 1136 2115:dup             
	// 1137 2116:ldc2            #741 <String "SceneCaptureType">
	// 1138 2119:ldc2            #1022 <Int 41990>
	// 1139 2122:iconst_3        
	// 1140 2123:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1141 2126:aastore         
	// 1142 2127:dup             
	// 1143 2128:bipush          50
	// 1144 2130:new             #15  <Class ExifInterface$ExifTag>
	// 1145 2133:dup             
	// 1146 2134:ldc2            #481 <String "GainControl">
	// 1147 2137:ldc2            #1023 <Int 41991>
	// 1148 2140:iconst_3        
	// 1149 2141:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1150 2144:aastore         
	// 1151 2145:dup             
	// 1152 2146:bipush          51
	// 1153 2148:new             #15  <Class ExifInterface$ExifTag>
	// 1154 2151:dup             
	// 1155 2152:ldc2            #400 <String "Contrast">
	// 1156 2155:ldc2            #1024 <Int 41992>
	// 1157 2158:iconst_3        
	// 1158 2159:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1159 2162:aastore         
	// 1160 2163:dup             
	// 1161 2164:bipush          52
	// 1162 2166:new             #15  <Class ExifInterface$ExifTag>
	// 1163 2169:dup             
	// 1164 2170:ldc2            #738 <String "Saturation">
	// 1165 2173:ldc2            #1025 <Int 41993>
	// 1166 2176:iconst_3        
	// 1167 2177:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1168 2180:aastore         
	// 1169 2181:dup             
	// 1170 2182:bipush          53
	// 1171 2184:new             #15  <Class ExifInterface$ExifTag>
	// 1172 2187:dup             
	// 1173 2188:ldc2            #753 <String "Sharpness">
	// 1174 2191:ldc2            #1026 <Int 41994>
	// 1175 2194:iconst_3        
	// 1176 2195:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1177 2198:aastore         
	// 1178 2199:dup             
	// 1179 2200:bipush          54
	// 1180 2202:new             #15  <Class ExifInterface$ExifTag>
	// 1181 2205:dup             
	// 1182 2206:ldc2            #421 <String "DeviceSettingDescription">
	// 1183 2209:ldc2            #1027 <Int 41995>
	// 1184 2212:bipush          7
	// 1185 2214:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1186 2217:aastore         
	// 1187 2218:dup             
	// 1188 2219:bipush          55
	// 1189 2221:new             #15  <Class ExifInterface$ExifTag>
	// 1190 2224:dup             
	// 1191 2225:ldc2            #786 <String "SubjectDistanceRange">
	// 1192 2228:ldc2            #1028 <Int 41996>
	// 1193 2231:iconst_3        
	// 1194 2232:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1195 2235:aastore         
	// 1196 2236:dup             
	// 1197 2237:bipush          56
	// 1198 2239:new             #15  <Class ExifInterface$ExifTag>
	// 1199 2242:dup             
	// 1200 2243:ldc2            #595 <String "ImageUniqueID">
	// 1201 2246:ldc2            #1029 <Int 42016>
	// 1202 2249:iconst_2        
	// 1203 2250:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1204 2253:aastore         
	// 1205 2254:dup             
	// 1206 2255:bipush          57
	// 1207 2257:new             #15  <Class ExifInterface$ExifTag>
	// 1208 2260:dup             
	// 1209 2261:ldc2            #427 <String "DNGVersion">
	// 1210 2264:ldc2            #1030 <Int 50706>
	// 1211 2267:iconst_1        
	// 1212 2268:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1213 2271:aastore         
	// 1214 2272:dup             
	// 1215 2273:bipush          58
	// 1216 2275:new             #15  <Class ExifInterface$ExifTag>
	// 1217 2278:dup             
	// 1218 2279:ldc2            #418 <String "DefaultCropSize">
	// 1219 2282:ldc2            #1031 <Int 50720>
	// 1220 2285:iconst_3        
	// 1221 2286:iconst_4        
	// 1222 2287:invokespecial   #967 <Method void ExifInterface$ExifTag(String, int, int, int)>
	// 1223 2290:aastore         
	// 1224 2291:putstatic       #1033 <Field ExifInterface$ExifTag[] IFD_EXIF_TAGS>
	// 1225 2294:bipush          31
	// 1226 2296:anewarray       ExifTag[]
	// 1227 2299:dup             
	// 1228 2300:iconst_0        
	// 1229 2301:new             #15  <Class ExifInterface$ExifTag>
	// 1230 2304:dup             
	// 1231 2305:ldc2            #583 <String "GPSVersionID">
	// 1232 2308:iconst_0        
	// 1233 2309:iconst_1        
	// 1234 2310:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1235 2313:aastore         
	// 1236 2314:dup             
	// 1237 2315:iconst_1        
	// 1238 2316:new             #15  <Class ExifInterface$ExifTag>
	// 1239 2319:dup             
	// 1240 2320:ldc2            #544 <String "GPSLatitudeRef">
	// 1241 2323:iconst_1        
	// 1242 2324:iconst_2        
	// 1243 2325:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1244 2328:aastore         
	// 1245 2329:dup             
	// 1246 2330:iconst_2        
	// 1247 2331:new             #15  <Class ExifInterface$ExifTag>
	// 1248 2334:dup             
	// 1249 2335:ldc2            #541 <String "GPSLatitude">
	// 1250 2338:iconst_2        
	// 1251 2339:iconst_5        
	// 1252 2340:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1253 2343:aastore         
	// 1254 2344:dup             
	// 1255 2345:iconst_3        
	// 1256 2346:new             #15  <Class ExifInterface$ExifTag>
	// 1257 2349:dup             
	// 1258 2350:ldc2            #550 <String "GPSLongitudeRef">
	// 1259 2353:iconst_3        
	// 1260 2354:iconst_2        
	// 1261 2355:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1262 2358:aastore         
	// 1263 2359:dup             
	// 1264 2360:iconst_4        
	// 1265 2361:new             #15  <Class ExifInterface$ExifTag>
	// 1266 2364:dup             
	// 1267 2365:ldc2            #547 <String "GPSLongitude">
	// 1268 2368:iconst_4        
	// 1269 2369:iconst_5        
	// 1270 2370:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1271 2373:aastore         
	// 1272 2374:dup             
	// 1273 2375:iconst_5        
	// 1274 2376:new             #15  <Class ExifInterface$ExifTag>
	// 1275 2379:dup             
	// 1276 2380:ldc2            #490 <String "GPSAltitudeRef">
	// 1277 2383:iconst_5        
	// 1278 2384:iconst_1        
	// 1279 2385:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1280 2388:aastore         
	// 1281 2389:dup             
	// 1282 2390:bipush          6
	// 1283 2392:new             #15  <Class ExifInterface$ExifTag>
	// 1284 2395:dup             
	// 1285 2396:ldc2            #487 <String "GPSAltitude">
	// 1286 2399:bipush          6
	// 1287 2401:iconst_5        
	// 1288 2402:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1289 2405:aastore         
	// 1290 2406:dup             
	// 1291 2407:bipush          7
	// 1292 2409:new             #15  <Class ExifInterface$ExifTag>
	// 1293 2412:dup             
	// 1294 2413:ldc2            #574 <String "GPSTimeStamp">
	// 1295 2416:bipush          7
	// 1296 2418:iconst_5        
	// 1297 2419:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1298 2422:aastore         
	// 1299 2423:dup             
	// 1300 2424:bipush          8
	// 1301 2426:new             #15  <Class ExifInterface$ExifTag>
	// 1302 2429:dup             
	// 1303 2430:ldc2            #562 <String "GPSSatellites">
	// 1304 2433:bipush          8
	// 1305 2435:iconst_2        
	// 1306 2436:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1307 2439:aastore         
	// 1308 2440:dup             
	// 1309 2441:bipush          9
	// 1310 2443:new             #15  <Class ExifInterface$ExifTag>
	// 1311 2446:dup             
	// 1312 2447:ldc2            #571 <String "GPSStatus">
	// 1313 2450:bipush          9
	// 1314 2452:iconst_2        
	// 1315 2453:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1316 2456:aastore         
	// 1317 2457:dup             
	// 1318 2458:bipush          10
	// 1319 2460:new             #15  <Class ExifInterface$ExifTag>
	// 1320 2463:dup             
	// 1321 2464:ldc2            #556 <String "GPSMeasureMode">
	// 1322 2467:bipush          10
	// 1323 2469:iconst_2        
	// 1324 2470:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1325 2473:aastore         
	// 1326 2474:dup             
	// 1327 2475:bipush          11
	// 1328 2477:new             #15  <Class ExifInterface$ExifTag>
	// 1329 2480:dup             
	// 1330 2481:ldc2            #526 <String "GPSDOP">
	// 1331 2484:bipush          11
	// 1332 2486:iconst_5        
	// 1333 2487:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1334 2490:aastore         
	// 1335 2491:dup             
	// 1336 2492:bipush          12
	// 1337 2494:new             #15  <Class ExifInterface$ExifTag>
	// 1338 2497:dup             
	// 1339 2498:ldc2            #568 <String "GPSSpeedRef">
	// 1340 2501:bipush          12
	// 1341 2503:iconst_2        
	// 1342 2504:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1343 2507:aastore         
	// 1344 2508:dup             
	// 1345 2509:bipush          13
	// 1346 2511:new             #15  <Class ExifInterface$ExifTag>
	// 1347 2514:dup             
	// 1348 2515:ldc2            #565 <String "GPSSpeed">
	// 1349 2518:bipush          13
	// 1350 2520:iconst_5        
	// 1351 2521:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1352 2524:aastore         
	// 1353 2525:dup             
	// 1354 2526:bipush          14
	// 1355 2528:new             #15  <Class ExifInterface$ExifTag>
	// 1356 2531:dup             
	// 1357 2532:ldc2            #580 <String "GPSTrackRef">
	// 1358 2535:bipush          14
	// 1359 2537:iconst_2        
	// 1360 2538:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1361 2541:aastore         
	// 1362 2542:dup             
	// 1363 2543:bipush          15
	// 1364 2545:new             #15  <Class ExifInterface$ExifTag>
	// 1365 2548:dup             
	// 1366 2549:ldc2            #577 <String "GPSTrack">
	// 1367 2552:bipush          15
	// 1368 2554:iconst_5        
	// 1369 2555:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1370 2558:aastore         
	// 1371 2559:dup             
	// 1372 2560:bipush          16
	// 1373 2562:new             #15  <Class ExifInterface$ExifTag>
	// 1374 2565:dup             
	// 1375 2566:ldc2            #535 <String "GPSImgDirectionRef">
	// 1376 2569:bipush          16
	// 1377 2571:iconst_2        
	// 1378 2572:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1379 2575:aastore         
	// 1380 2576:dup             
	// 1381 2577:bipush          17
	// 1382 2579:new             #15  <Class ExifInterface$ExifTag>
	// 1383 2582:dup             
	// 1384 2583:ldc2            #532 <String "GPSImgDirection">
	// 1385 2586:bipush          17
	// 1386 2588:iconst_5        
	// 1387 2589:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1388 2592:aastore         
	// 1389 2593:dup             
	// 1390 2594:bipush          18
	// 1391 2596:new             #15  <Class ExifInterface$ExifTag>
	// 1392 2599:dup             
	// 1393 2600:ldc2            #553 <String "GPSMapDatum">
	// 1394 2603:bipush          18
	// 1395 2605:iconst_2        
	// 1396 2606:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1397 2609:aastore         
	// 1398 2610:dup             
	// 1399 2611:bipush          19
	// 1400 2613:new             #15  <Class ExifInterface$ExifTag>
	// 1401 2616:dup             
	// 1402 2617:ldc2            #514 <String "GPSDestLatitudeRef">
	// 1403 2620:bipush          19
	// 1404 2622:iconst_2        
	// 1405 2623:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1406 2626:aastore         
	// 1407 2627:dup             
	// 1408 2628:bipush          20
	// 1409 2630:new             #15  <Class ExifInterface$ExifTag>
	// 1410 2633:dup             
	// 1411 2634:ldc2            #511 <String "GPSDestLatitude">
	// 1412 2637:bipush          20
	// 1413 2639:iconst_5        
	// 1414 2640:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1415 2643:aastore         
	// 1416 2644:dup             
	// 1417 2645:bipush          21
	// 1418 2647:new             #15  <Class ExifInterface$ExifTag>
	// 1419 2650:dup             
	// 1420 2651:ldc2            #520 <String "GPSDestLongitudeRef">
	// 1421 2654:bipush          21
	// 1422 2656:iconst_2        
	// 1423 2657:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1424 2660:aastore         
	// 1425 2661:dup             
	// 1426 2662:bipush          22
	// 1427 2664:new             #15  <Class ExifInterface$ExifTag>
	// 1428 2667:dup             
	// 1429 2668:ldc2            #517 <String "GPSDestLongitude">
	// 1430 2671:bipush          22
	// 1431 2673:iconst_5        
	// 1432 2674:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1433 2677:aastore         
	// 1434 2678:dup             
	// 1435 2679:bipush          23
	// 1436 2681:new             #15  <Class ExifInterface$ExifTag>
	// 1437 2684:dup             
	// 1438 2685:ldc2            #502 <String "GPSDestBearingRef">
	// 1439 2688:bipush          23
	// 1440 2690:iconst_2        
	// 1441 2691:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1442 2694:aastore         
	// 1443 2695:dup             
	// 1444 2696:bipush          24
	// 1445 2698:new             #15  <Class ExifInterface$ExifTag>
	// 1446 2701:dup             
	// 1447 2702:ldc2            #499 <String "GPSDestBearing">
	// 1448 2705:bipush          24
	// 1449 2707:iconst_5        
	// 1450 2708:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1451 2711:aastore         
	// 1452 2712:dup             
	// 1453 2713:bipush          25
	// 1454 2715:new             #15  <Class ExifInterface$ExifTag>
	// 1455 2718:dup             
	// 1456 2719:ldc2            #508 <String "GPSDestDistanceRef">
	// 1457 2722:bipush          25
	// 1458 2724:iconst_2        
	// 1459 2725:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1460 2728:aastore         
	// 1461 2729:dup             
	// 1462 2730:bipush          26
	// 1463 2732:new             #15  <Class ExifInterface$ExifTag>
	// 1464 2735:dup             
	// 1465 2736:ldc2            #505 <String "GPSDestDistance">
	// 1466 2739:bipush          26
	// 1467 2741:iconst_5        
	// 1468 2742:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1469 2745:aastore         
	// 1470 2746:dup             
	// 1471 2747:bipush          27
	// 1472 2749:new             #15  <Class ExifInterface$ExifTag>
	// 1473 2752:dup             
	// 1474 2753:ldc2            #559 <String "GPSProcessingMethod">
	// 1475 2756:bipush          27
	// 1476 2758:bipush          7
	// 1477 2760:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1478 2763:aastore         
	// 1479 2764:dup             
	// 1480 2765:bipush          28
	// 1481 2767:new             #15  <Class ExifInterface$ExifTag>
	// 1482 2770:dup             
	// 1483 2771:ldc2            #493 <String "GPSAreaInformation">
	// 1484 2774:bipush          28
	// 1485 2776:bipush          7
	// 1486 2778:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1487 2781:aastore         
	// 1488 2782:dup             
	// 1489 2783:bipush          29
	// 1490 2785:new             #15  <Class ExifInterface$ExifTag>
	// 1491 2788:dup             
	// 1492 2789:ldc2            #496 <String "GPSDateStamp">
	// 1493 2792:bipush          29
	// 1494 2794:iconst_2        
	// 1495 2795:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1496 2798:aastore         
	// 1497 2799:dup             
	// 1498 2800:bipush          30
	// 1499 2802:new             #15  <Class ExifInterface$ExifTag>
	// 1500 2805:dup             
	// 1501 2806:ldc2            #523 <String "GPSDifferential">
	// 1502 2809:bipush          30
	// 1503 2811:iconst_3        
	// 1504 2812:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1505 2815:aastore         
	// 1506 2816:putstatic       #1035 <Field ExifInterface$ExifTag[] IFD_GPS_TAGS>
	// 1507 2819:iconst_1        
	// 1508 2820:anewarray       ExifTag[]
	// 1509 2823:dup             
	// 1510 2824:iconst_0        
	// 1511 2825:new             #15  <Class ExifInterface$ExifTag>
	// 1512 2828:dup             
	// 1513 2829:ldc2            #604 <String "InteroperabilityIndex">
	// 1514 2832:iconst_1        
	// 1515 2833:iconst_2        
	// 1516 2834:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1517 2837:aastore         
	// 1518 2838:putstatic       #1037 <Field ExifInterface$ExifTag[] IFD_INTEROPERABILITY_TAGS>
	// 1519 2841:bipush          37
	// 1520 2843:anewarray       ExifTag[]
	// 1521 2846:dup             
	// 1522 2847:iconst_0        
	// 1523 2848:new             #15  <Class ExifInterface$ExifTag>
	// 1524 2851:dup             
	// 1525 2852:ldc2            #656 <String "NewSubfileType">
	// 1526 2855:sipush          254
	// 1527 2858:iconst_4        
	// 1528 2859:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1529 2862:aastore         
	// 1530 2863:dup             
	// 1531 2864:iconst_1        
	// 1532 2865:new             #15  <Class ExifInterface$ExifTag>
	// 1533 2868:dup             
	// 1534 2869:ldc2            #777 <String "SubfileType">
	// 1535 2872:sipush          255
	// 1536 2875:iconst_4        
	// 1537 2876:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1538 2879:aastore         
	// 1539 2880:dup             
	// 1540 2881:iconst_2        
	// 1541 2882:new             #15  <Class ExifInterface$ExifTag>
	// 1542 2885:dup             
	// 1543 2886:ldc2            #810 <String "ThumbnailImageWidth">
	// 1544 2889:sipush          256
	// 1545 2892:iconst_3        
	// 1546 2893:iconst_4        
	// 1547 2894:invokespecial   #967 <Method void ExifInterface$ExifTag(String, int, int, int)>
	// 1548 2897:aastore         
	// 1549 2898:dup             
	// 1550 2899:iconst_3        
	// 1551 2900:new             #15  <Class ExifInterface$ExifTag>
	// 1552 2903:dup             
	// 1553 2904:ldc2            #807 <String "ThumbnailImageLength">
	// 1554 2907:sipush          257
	// 1555 2910:iconst_3        
	// 1556 2911:iconst_4        
	// 1557 2912:invokespecial   #967 <Method void ExifInterface$ExifTag(String, int, int, int)>
	// 1558 2915:aastore         
	// 1559 2916:dup             
	// 1560 2917:iconst_4        
	// 1561 2918:new             #15  <Class ExifInterface$ExifTag>
	// 1562 2921:dup             
	// 1563 2922:ldc2            #373 <String "BitsPerSample">
	// 1564 2925:sipush          258
	// 1565 2928:iconst_3        
	// 1566 2929:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1567 2932:aastore         
	// 1568 2933:dup             
	// 1569 2934:iconst_5        
	// 1570 2935:new             #15  <Class ExifInterface$ExifTag>
	// 1571 2938:dup             
	// 1572 2939:ldc2            #397 <String "Compression">
	// 1573 2942:sipush          259
	// 1574 2945:iconst_3        
	// 1575 2946:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1576 2949:aastore         
	// 1577 2950:dup             
	// 1578 2951:bipush          6
	// 1579 2953:new             #15  <Class ExifInterface$ExifTag>
	// 1580 2956:dup             
	// 1581 2957:ldc2            #686 <String "PhotometricInterpretation">
	// 1582 2960:sipush          262
	// 1583 2963:iconst_3        
	// 1584 2964:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1585 2967:aastore         
	// 1586 2968:dup             
	// 1587 2969:bipush          7
	// 1588 2971:new             #15  <Class ExifInterface$ExifTag>
	// 1589 2974:dup             
	// 1590 2975:ldc2            #589 <String "ImageDescription">
	// 1591 2978:sipush          270
	// 1592 2981:iconst_2        
	// 1593 2982:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1594 2985:aastore         
	// 1595 2986:dup             
	// 1596 2987:bipush          8
	// 1597 2989:new             #15  <Class ExifInterface$ExifTag>
	// 1598 2992:dup             
	// 1599 2993:ldc2            #641 <String "Make">
	// 1600 2996:sipush          271
	// 1601 2999:iconst_2        
	// 1602 3000:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1603 3003:aastore         
	// 1604 3004:dup             
	// 1605 3005:bipush          9
	// 1606 3007:new             #15  <Class ExifInterface$ExifTag>
	// 1607 3010:dup             
	// 1608 3011:ldc2            #653 <String "Model">
	// 1609 3014:sipush          272
	// 1610 3017:iconst_2        
	// 1611 3018:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1612 3021:aastore         
	// 1613 3022:dup             
	// 1614 3023:bipush          10
	// 1615 3025:new             #15  <Class ExifInterface$ExifTag>
	// 1616 3028:dup             
	// 1617 3029:ldc2            #774 <String "StripOffsets">
	// 1618 3032:sipush          273
	// 1619 3035:iconst_3        
	// 1620 3036:iconst_4        
	// 1621 3037:invokespecial   #967 <Method void ExifInterface$ExifTag(String, int, int, int)>
	// 1622 3040:aastore         
	// 1623 3041:dup             
	// 1624 3042:bipush          11
	// 1625 3044:new             #15  <Class ExifInterface$ExifTag>
	// 1626 3047:dup             
	// 1627 3048:ldc2            #680 <String "Orientation">
	// 1628 3051:sipush          274
	// 1629 3054:iconst_3        
	// 1630 3055:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1631 3058:aastore         
	// 1632 3059:dup             
	// 1633 3060:bipush          12
	// 1634 3062:new             #15  <Class ExifInterface$ExifTag>
	// 1635 3065:dup             
	// 1636 3066:ldc2            #735 <String "SamplesPerPixel">
	// 1637 3069:sipush          277
	// 1638 3072:iconst_3        
	// 1639 3073:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1640 3076:aastore         
	// 1641 3077:dup             
	// 1642 3078:bipush          13
	// 1643 3080:new             #15  <Class ExifInterface$ExifTag>
	// 1644 3083:dup             
	// 1645 3084:ldc2            #714 <String "RowsPerStrip">
	// 1646 3087:sipush          278
	// 1647 3090:iconst_3        
	// 1648 3091:iconst_4        
	// 1649 3092:invokespecial   #967 <Method void ExifInterface$ExifTag(String, int, int, int)>
	// 1650 3095:aastore         
	// 1651 3096:dup             
	// 1652 3097:bipush          14
	// 1653 3099:new             #15  <Class ExifInterface$ExifTag>
	// 1654 3102:dup             
	// 1655 3103:ldc2            #771 <String "StripByteCounts">
	// 1656 3106:sipush          279
	// 1657 3109:iconst_3        
	// 1658 3110:iconst_4        
	// 1659 3111:invokespecial   #967 <Method void ExifInterface$ExifTag(String, int, int, int)>
	// 1660 3114:aastore         
	// 1661 3115:dup             
	// 1662 3116:bipush          15
	// 1663 3118:new             #15  <Class ExifInterface$ExifTag>
	// 1664 3121:dup             
	// 1665 3122:ldc2            #831 <String "XResolution">
	// 1666 3125:sipush          282
	// 1667 3128:iconst_5        
	// 1668 3129:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1669 3132:aastore         
	// 1670 3133:dup             
	// 1671 3134:bipush          16
	// 1672 3136:new             #15  <Class ExifInterface$ExifTag>
	// 1673 3139:dup             
	// 1674 3140:ldc2            #843 <String "YResolution">
	// 1675 3143:sipush          283
	// 1676 3146:iconst_5        
	// 1677 3147:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1678 3150:aastore         
	// 1679 3151:dup             
	// 1680 3152:bipush          17
	// 1681 3154:new             #15  <Class ExifInterface$ExifTag>
	// 1682 3157:dup             
	// 1683 3158:ldc2            #695 <String "PlanarConfiguration">
	// 1684 3161:sipush          284
	// 1685 3164:iconst_3        
	// 1686 3165:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1687 3168:aastore         
	// 1688 3169:dup             
	// 1689 3170:bipush          18
	// 1690 3172:new             #15  <Class ExifInterface$ExifTag>
	// 1691 3175:dup             
	// 1692 3176:ldc2            #711 <String "ResolutionUnit">
	// 1693 3179:sipush          296
	// 1694 3182:iconst_3        
	// 1695 3183:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1696 3186:aastore         
	// 1697 3187:dup             
	// 1698 3188:bipush          19
	// 1699 3190:new             #15  <Class ExifInterface$ExifTag>
	// 1700 3193:dup             
	// 1701 3194:ldc2            #819 <String "TransferFunction">
	// 1702 3197:sipush          301
	// 1703 3200:iconst_3        
	// 1704 3201:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1705 3204:aastore         
	// 1706 3205:dup             
	// 1707 3206:bipush          20
	// 1708 3208:new             #15  <Class ExifInterface$ExifTag>
	// 1709 3211:dup             
	// 1710 3212:ldc2            #759 <String "Software">
	// 1711 3215:sipush          305
	// 1712 3218:iconst_2        
	// 1713 3219:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1714 3222:aastore         
	// 1715 3223:dup             
	// 1716 3224:bipush          21
	// 1717 3226:new             #15  <Class ExifInterface$ExifTag>
	// 1718 3229:dup             
	// 1719 3230:ldc2            #409 <String "DateTime">
	// 1720 3233:sipush          306
	// 1721 3236:iconst_2        
	// 1722 3237:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1723 3240:aastore         
	// 1724 3241:dup             
	// 1725 3242:bipush          22
	// 1726 3244:new             #15  <Class ExifInterface$ExifTag>
	// 1727 3247:dup             
	// 1728 3248:ldc2            #370 <String "Artist">
	// 1729 3251:sipush          315
	// 1730 3254:iconst_2        
	// 1731 3255:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1732 3258:aastore         
	// 1733 3259:dup             
	// 1734 3260:bipush          23
	// 1735 3262:new             #15  <Class ExifInterface$ExifTag>
	// 1736 3265:dup             
	// 1737 3266:ldc2            #828 <String "WhitePoint">
	// 1738 3269:sipush          318
	// 1739 3272:iconst_5        
	// 1740 3273:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1741 3276:aastore         
	// 1742 3277:dup             
	// 1743 3278:bipush          24
	// 1744 3280:new             #15  <Class ExifInterface$ExifTag>
	// 1745 3283:dup             
	// 1746 3284:ldc2            #698 <String "PrimaryChromaticities">
	// 1747 3287:sipush          319
	// 1748 3290:iconst_5        
	// 1749 3291:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1750 3294:aastore         
	// 1751 3295:dup             
	// 1752 3296:bipush          25
	// 1753 3298:new             #15  <Class ExifInterface$ExifTag>
	// 1754 3301:dup             
	// 1755 3302:ldc2            #801 <String "SubIFDPointer">
	// 1756 3305:sipush          330
	// 1757 3308:iconst_4        
	// 1758 3309:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1759 3312:aastore         
	// 1760 3313:dup             
	// 1761 3314:bipush          26
	// 1762 3316:new             #15  <Class ExifInterface$ExifTag>
	// 1763 3319:dup             
	// 1764 3320:ldc2            #620 <String "JPEGInterchangeFormat">
	// 1765 3323:sipush          513
	// 1766 3326:iconst_4        
	// 1767 3327:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1768 3330:aastore         
	// 1769 3331:dup             
	// 1770 3332:bipush          27
	// 1771 3334:new             #15  <Class ExifInterface$ExifTag>
	// 1772 3337:dup             
	// 1773 3338:ldc2            #623 <String "JPEGInterchangeFormatLength">
	// 1774 3341:sipush          514
	// 1775 3344:iconst_4        
	// 1776 3345:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1777 3348:aastore         
	// 1778 3349:dup             
	// 1779 3350:bipush          28
	// 1780 3352:new             #15  <Class ExifInterface$ExifTag>
	// 1781 3355:dup             
	// 1782 3356:ldc2            #834 <String "YCbCrCoefficients">
	// 1783 3359:sipush          529
	// 1784 3362:iconst_5        
	// 1785 3363:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1786 3366:aastore         
	// 1787 3367:dup             
	// 1788 3368:bipush          29
	// 1789 3370:new             #15  <Class ExifInterface$ExifTag>
	// 1790 3373:dup             
	// 1791 3374:ldc2            #840 <String "YCbCrSubSampling">
	// 1792 3377:sipush          530
	// 1793 3380:iconst_3        
	// 1794 3381:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1795 3384:aastore         
	// 1796 3385:dup             
	// 1797 3386:bipush          30
	// 1798 3388:new             #15  <Class ExifInterface$ExifTag>
	// 1799 3391:dup             
	// 1800 3392:ldc2            #837 <String "YCbCrPositioning">
	// 1801 3395:sipush          531
	// 1802 3398:iconst_3        
	// 1803 3399:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1804 3402:aastore         
	// 1805 3403:dup             
	// 1806 3404:bipush          31
	// 1807 3406:new             #15  <Class ExifInterface$ExifTag>
	// 1808 3409:dup             
	// 1809 3410:ldc2            #705 <String "ReferenceBlackWhite">
	// 1810 3413:sipush          532
	// 1811 3416:iconst_5        
	// 1812 3417:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1813 3420:aastore         
	// 1814 3421:dup             
	// 1815 3422:bipush          32
	// 1816 3424:new             #15  <Class ExifInterface$ExifTag>
	// 1817 3427:dup             
	// 1818 3428:ldc2            #403 <String "Copyright">
	// 1819 3431:ldc2            #968 <Int 33432>
	// 1820 3434:iconst_2        
	// 1821 3435:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1822 3438:aastore         
	// 1823 3439:dup             
	// 1824 3440:bipush          33
	// 1825 3442:new             #15  <Class ExifInterface$ExifTag>
	// 1826 3445:dup             
	// 1827 3446:ldc2            #430 <String "ExifIFDPointer">
	// 1828 3449:ldc2            #969 <Int 34665>
	// 1829 3452:iconst_4        
	// 1830 3453:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1831 3456:aastore         
	// 1832 3457:dup             
	// 1833 3458:bipush          34
	// 1834 3460:new             #15  <Class ExifInterface$ExifTag>
	// 1835 3463:dup             
	// 1836 3464:ldc2            #538 <String "GPSInfoIFDPointer">
	// 1837 3467:ldc2            #970 <Int 34853>
	// 1838 3470:iconst_4        
	// 1839 3471:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1840 3474:aastore         
	// 1841 3475:dup             
	// 1842 3476:bipush          35
	// 1843 3478:new             #15  <Class ExifInterface$ExifTag>
	// 1844 3481:dup             
	// 1845 3482:ldc2            #427 <String "DNGVersion">
	// 1846 3485:ldc2            #1030 <Int 50706>
	// 1847 3488:iconst_1        
	// 1848 3489:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1849 3492:aastore         
	// 1850 3493:dup             
	// 1851 3494:bipush          36
	// 1852 3496:new             #15  <Class ExifInterface$ExifTag>
	// 1853 3499:dup             
	// 1854 3500:ldc2            #418 <String "DefaultCropSize">
	// 1855 3503:ldc2            #1031 <Int 50720>
	// 1856 3506:iconst_3        
	// 1857 3507:iconst_4        
	// 1858 3508:invokespecial   #967 <Method void ExifInterface$ExifTag(String, int, int, int)>
	// 1859 3511:aastore         
	// 1860 3512:putstatic       #1039 <Field ExifInterface$ExifTag[] IFD_THUMBNAIL_TAGS>
	// 1861 3515:new             #15  <Class ExifInterface$ExifTag>
	// 1862 3518:dup             
	// 1863 3519:ldc2            #774 <String "StripOffsets">
	// 1864 3522:sipush          273
	// 1865 3525:iconst_3        
	// 1866 3526:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1867 3529:putstatic       #1041 <Field ExifInterface$ExifTag TAG_RAF_IMAGE_SIZE>
	// 1868 3532:iconst_3        
	// 1869 3533:anewarray       ExifTag[]
	// 1870 3536:dup             
	// 1871 3537:iconst_0        
	// 1872 3538:new             #15  <Class ExifInterface$ExifTag>
	// 1873 3541:dup             
	// 1874 3542:ldc2            #677 <String "ThumbnailImage">
	// 1875 3545:sipush          256
	// 1876 3548:bipush          7
	// 1877 3550:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1878 3553:aastore         
	// 1879 3554:dup             
	// 1880 3555:iconst_1        
	// 1881 3556:new             #15  <Class ExifInterface$ExifTag>
	// 1882 3559:dup             
	// 1883 3560:ldc2            #665 <String "CameraSettingsIFDPointer">
	// 1884 3563:sipush          8224
	// 1885 3566:iconst_4        
	// 1886 3567:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1887 3570:aastore         
	// 1888 3571:dup             
	// 1889 3572:iconst_2        
	// 1890 3573:new             #15  <Class ExifInterface$ExifTag>
	// 1891 3576:dup             
	// 1892 3577:ldc2            #668 <String "ImageProcessingIFDPointer">
	// 1893 3580:sipush          8256
	// 1894 3583:iconst_4        
	// 1895 3584:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1896 3587:aastore         
	// 1897 3588:putstatic       #1043 <Field ExifInterface$ExifTag[] ORF_MAKER_NOTE_TAGS>
	// 1898 3591:iconst_2        
	// 1899 3592:anewarray       ExifTag[]
	// 1900 3595:dup             
	// 1901 3596:iconst_0        
	// 1902 3597:new             #15  <Class ExifInterface$ExifTag>
	// 1903 3600:dup             
	// 1904 3601:ldc2            #674 <String "PreviewImageStart">
	// 1905 3604:sipush          257
	// 1906 3607:iconst_4        
	// 1907 3608:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1908 3611:aastore         
	// 1909 3612:dup             
	// 1910 3613:iconst_1        
	// 1911 3614:new             #15  <Class ExifInterface$ExifTag>
	// 1912 3617:dup             
	// 1913 3618:ldc2            #671 <String "PreviewImageLength">
	// 1914 3621:sipush          258
	// 1915 3624:iconst_4        
	// 1916 3625:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1917 3628:aastore         
	// 1918 3629:putstatic       #1045 <Field ExifInterface$ExifTag[] ORF_CAMERA_SETTINGS_TAGS>
	// 1919 3632:iconst_1        
	// 1920 3633:anewarray       ExifTag[]
	// 1921 3636:dup             
	// 1922 3637:iconst_0        
	// 1923 3638:new             #15  <Class ExifInterface$ExifTag>
	// 1924 3641:dup             
	// 1925 3642:ldc2            #662 <String "AspectFrame">
	// 1926 3645:sipush          4371
	// 1927 3648:iconst_3        
	// 1928 3649:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1929 3652:aastore         
	// 1930 3653:putstatic       #1047 <Field ExifInterface$ExifTag[] ORF_IMAGE_PROCESSING_TAGS>
	// 1931 3656:iconst_1        
	// 1932 3657:anewarray       ExifTag[]
	// 1933 3660:dup             
	// 1934 3661:iconst_0        
	// 1935 3662:new             #15  <Class ExifInterface$ExifTag>
	// 1936 3665:dup             
	// 1937 3666:ldc2            #388 <String "ColorSpace">
	// 1938 3669:bipush          55
	// 1939 3671:iconst_3        
	// 1940 3672:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1941 3675:aastore         
	// 1942 3676:putstatic       #1049 <Field ExifInterface$ExifTag[] PEF_TAGS>
		Object obj = ((Object) (IFD_TIFF_TAGS));
	// 1943 3679:getstatic       #972 <Field ExifInterface$ExifTag[] IFD_TIFF_TAGS>
	// 1944 3682:astore_3        
		EXIF_TAGS = (new ExifTag[][] {
			obj, IFD_EXIF_TAGS, IFD_GPS_TAGS, IFD_INTEROPERABILITY_TAGS, IFD_THUMBNAIL_TAGS, obj, ORF_MAKER_NOTE_TAGS, ORF_CAMERA_SETTINGS_TAGS, ORF_IMAGE_PROCESSING_TAGS, PEF_TAGS
		});
	// 1945 3683:bipush          10
	// 1946 3685:anewarray       ExifTag[][]
	// 1947 3688:dup             
	// 1948 3689:iconst_0        
	// 1949 3690:aload_3         
	// 1950 3691:aastore         
	// 1951 3692:dup             
	// 1952 3693:iconst_1        
	// 1953 3694:getstatic       #1033 <Field ExifInterface$ExifTag[] IFD_EXIF_TAGS>
	// 1954 3697:aastore         
	// 1955 3698:dup             
	// 1956 3699:iconst_2        
	// 1957 3700:getstatic       #1035 <Field ExifInterface$ExifTag[] IFD_GPS_TAGS>
	// 1958 3703:aastore         
	// 1959 3704:dup             
	// 1960 3705:iconst_3        
	// 1961 3706:getstatic       #1037 <Field ExifInterface$ExifTag[] IFD_INTEROPERABILITY_TAGS>
	// 1962 3709:aastore         
	// 1963 3710:dup             
	// 1964 3711:iconst_4        
	// 1965 3712:getstatic       #1039 <Field ExifInterface$ExifTag[] IFD_THUMBNAIL_TAGS>
	// 1966 3715:aastore         
	// 1967 3716:dup             
	// 1968 3717:iconst_5        
	// 1969 3718:aload_3         
	// 1970 3719:aastore         
	// 1971 3720:dup             
	// 1972 3721:bipush          6
	// 1973 3723:getstatic       #1043 <Field ExifInterface$ExifTag[] ORF_MAKER_NOTE_TAGS>
	// 1974 3726:aastore         
	// 1975 3727:dup             
	// 1976 3728:bipush          7
	// 1977 3730:getstatic       #1045 <Field ExifInterface$ExifTag[] ORF_CAMERA_SETTINGS_TAGS>
	// 1978 3733:aastore         
	// 1979 3734:dup             
	// 1980 3735:bipush          8
	// 1981 3737:getstatic       #1047 <Field ExifInterface$ExifTag[] ORF_IMAGE_PROCESSING_TAGS>
	// 1982 3740:aastore         
	// 1983 3741:dup             
	// 1984 3742:bipush          9
	// 1985 3744:getstatic       #1049 <Field ExifInterface$ExifTag[] PEF_TAGS>
	// 1986 3747:aastore         
	// 1987 3748:putstatic       #1052 <Field ExifInterface$ExifTag[][] EXIF_TAGS>
	// 1988 3751:bipush          6
	// 1989 3753:anewarray       ExifTag[]
	// 1990 3756:dup             
	// 1991 3757:iconst_0        
	// 1992 3758:new             #15  <Class ExifInterface$ExifTag>
	// 1993 3761:dup             
	// 1994 3762:ldc2            #801 <String "SubIFDPointer">
	// 1995 3765:sipush          330
	// 1996 3768:iconst_4        
	// 1997 3769:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 1998 3772:aastore         
	// 1999 3773:dup             
	// 2000 3774:iconst_1        
	// 2001 3775:new             #15  <Class ExifInterface$ExifTag>
	// 2002 3778:dup             
	// 2003 3779:ldc2            #430 <String "ExifIFDPointer">
	// 2004 3782:ldc2            #969 <Int 34665>
	// 2005 3785:iconst_4        
	// 2006 3786:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 2007 3789:aastore         
	// 2008 3790:dup             
	// 2009 3791:iconst_2        
	// 2010 3792:new             #15  <Class ExifInterface$ExifTag>
	// 2011 3795:dup             
	// 2012 3796:ldc2            #538 <String "GPSInfoIFDPointer">
	// 2013 3799:ldc2            #970 <Int 34853>
	// 2014 3802:iconst_4        
	// 2015 3803:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 2016 3806:aastore         
	// 2017 3807:dup             
	// 2018 3808:iconst_3        
	// 2019 3809:new             #15  <Class ExifInterface$ExifTag>
	// 2020 3812:dup             
	// 2021 3813:ldc2            #601 <String "InteroperabilityIFDPointer">
	// 2022 3816:ldc2            #1005 <Int 40965>
	// 2023 3819:iconst_4        
	// 2024 3820:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 2025 3823:aastore         
	// 2026 3824:dup             
	// 2027 3825:iconst_4        
	// 2028 3826:new             #15  <Class ExifInterface$ExifTag>
	// 2029 3829:dup             
	// 2030 3830:ldc2            #665 <String "CameraSettingsIFDPointer">
	// 2031 3833:sipush          8224
	// 2032 3836:iconst_1        
	// 2033 3837:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 2034 3840:aastore         
	// 2035 3841:dup             
	// 2036 3842:iconst_5        
	// 2037 3843:new             #15  <Class ExifInterface$ExifTag>
	// 2038 3846:dup             
	// 2039 3847:ldc2            #668 <String "ImageProcessingIFDPointer">
	// 2040 3850:sipush          8256
	// 2041 3853:iconst_1        
	// 2042 3854:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 2043 3857:aastore         
	// 2044 3858:putstatic       #1054 <Field ExifInterface$ExifTag[] EXIF_POINTER_TAGS>
	// 2045 3861:new             #15  <Class ExifInterface$ExifTag>
	// 2046 3864:dup             
	// 2047 3865:ldc2            #620 <String "JPEGInterchangeFormat">
	// 2048 3868:sipush          513
	// 2049 3871:iconst_4        
	// 2050 3872:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 2051 3875:putstatic       #1056 <Field ExifInterface$ExifTag JPEG_INTERCHANGE_FORMAT_TAG>
	// 2052 3878:new             #15  <Class ExifInterface$ExifTag>
	// 2053 3881:dup             
	// 2054 3882:ldc2            #623 <String "JPEGInterchangeFormatLength">
	// 2055 3885:sipush          514
	// 2056 3888:iconst_4        
	// 2057 3889:invokespecial   #964 <Method void ExifInterface$ExifTag(String, int, int)>
	// 2058 3892:putstatic       #1058 <Field ExifInterface$ExifTag JPEG_INTERCHANGE_FORMAT_LENGTH_TAG>
		obj = ((Object) (EXIF_TAGS));
	// 2059 3895:getstatic       #1052 <Field ExifInterface$ExifTag[][] EXIF_TAGS>
	// 2060 3898:astore_3        
		sExifTagMapsForReading = new HashMap[obj.length];
	// 2061 3899:aload_3         
	// 2062 3900:arraylength     
	// 2063 3901:anewarray       HashMap[]
	// 2064 3904:putstatic       #1062 <Field HashMap[] sExifTagMapsForReading>
		sExifTagMapsForWriting = new HashMap[obj.length];
	// 2065 3907:aload_3         
	// 2066 3908:arraylength     
	// 2067 3909:anewarray       HashMap[]
	// 2068 3912:putstatic       #1064 <Field HashMap[] sExifTagMapsForWriting>
	// 2069 3915:new             #1066 <Class HashSet>
	// 2070 3918:dup             
	// 2071 3919:iconst_5        
	// 2072 3920:anewarray       String[]
	// 2073 3923:dup             
	// 2074 3924:iconst_0        
	// 2075 3925:ldc2            #478 <String "FNumber">
	// 2076 3928:aastore         
	// 2077 3929:dup             
	// 2078 3930:iconst_1        
	// 2079 3931:ldc2            #424 <String "DigitalZoomRatio">
	// 2080 3934:aastore         
	// 2081 3935:dup             
	// 2082 3936:iconst_2        
	// 2083 3937:ldc2            #448 <String "ExposureTime">
	// 2084 3940:aastore         
	// 2085 3941:dup             
	// 2086 3942:iconst_3        
	// 2087 3943:ldc2            #783 <String "SubjectDistance">
	// 2088 3946:aastore         
	// 2089 3947:dup             
	// 2090 3948:iconst_4        
	// 2091 3949:ldc2            #574 <String "GPSTimeStamp">
	// 2092 3952:aastore         
	// 2093 3953:invokestatic    #901 <Method List Arrays.asList(Object[])>
	// 2094 3956:invokespecial   #1069 <Method void HashSet(java.util.Collection)>
	// 2095 3959:putstatic       #1071 <Field HashSet sTagSetForCompatibility>
		sExifPointerTagMap = new HashMap();
	// 2096 3962:new             #1060 <Class HashMap>
	// 2097 3965:dup             
	// 2098 3966:invokespecial   #1073 <Method void HashMap()>
	// 2099 3969:putstatic       #1075 <Field HashMap sExifPointerTagMap>
		ASCII = Charset.forName("US-ASCII");
	// 2100 3972:ldc2            #1077 <String "US-ASCII">
	// 2101 3975:invokestatic    #1083 <Method Charset Charset.forName(String)>
	// 2102 3978:putstatic       #1085 <Field Charset ASCII>
		IDENTIFIER_EXIF_APP1 = "Exif\000\0".getBytes(ASCII);
	// 2103 3981:ldc2            #1087 <String "Exif\000\0">
	// 2104 3984:getstatic       #1085 <Field Charset ASCII>
	// 2105 3987:invokevirtual   #1091 <Method byte[] String.getBytes(Charset)>
	// 2106 3990:putstatic       #1093 <Field byte[] IDENTIFIER_EXIF_APP1>
		sFormatter = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
	// 2107 3993:new             #1095 <Class SimpleDateFormat>
	// 2108 3996:dup             
	// 2109 3997:ldc2            #1097 <String "yyyy:MM:dd HH:mm:ss">
	// 2110 4000:invokespecial   #1100 <Method void SimpleDateFormat(String)>
	// 2111 4003:putstatic       #1102 <Field SimpleDateFormat sFormatter>
		sFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
	// 2112 4006:getstatic       #1102 <Field SimpleDateFormat sFormatter>
	// 2113 4009:ldc2            #1104 <String "UTC">
	// 2114 4012:invokestatic    #1110 <Method TimeZone TimeZone.getTimeZone(String)>
	// 2115 4015:invokevirtual   #1114 <Method void SimpleDateFormat.setTimeZone(TimeZone)>
		for(int i = 0; i < EXIF_TAGS.length; i++)
	//*2116 4018:iconst_0        
	//*2117 4019:istore_0        
	//*2118 4020:iload_0         
	//*2119 4021:getstatic       #1052 <Field ExifInterface$ExifTag[][] EXIF_TAGS>
	//*2120 4024:arraylength     
	//*2121 4025:icmpge          4122
		{
			sExifTagMapsForReading[i] = new HashMap();
	// 2122 4028:getstatic       #1062 <Field HashMap[] sExifTagMapsForReading>
	// 2123 4031:iload_0         
	// 2124 4032:new             #1060 <Class HashMap>
	// 2125 4035:dup             
	// 2126 4036:invokespecial   #1073 <Method void HashMap()>
	// 2127 4039:aastore         
			sExifTagMapsForWriting[i] = new HashMap();
	// 2128 4040:getstatic       #1064 <Field HashMap[] sExifTagMapsForWriting>
	// 2129 4043:iload_0         
	// 2130 4044:new             #1060 <Class HashMap>
	// 2131 4047:dup             
	// 2132 4048:invokespecial   #1073 <Method void HashMap()>
	// 2133 4051:aastore         
			ExifTag aexiftag[] = EXIF_TAGS[i];
	// 2134 4052:getstatic       #1052 <Field ExifInterface$ExifTag[][] EXIF_TAGS>
	// 2135 4055:iload_0         
	// 2136 4056:aaload          
	// 2137 4057:astore_3        
			int k = aexiftag.length;
	// 2138 4058:aload_3         
	// 2139 4059:arraylength     
	// 2140 4060:istore_2        
			for(int j = 0; j < k; j++)
	//*2141 4061:iconst_0        
	//*2142 4062:istore_1        
	//*2143 4063:iload_1         
	//*2144 4064:iload_2         
	//*2145 4065:icmpge          4115
			{
				ExifTag exiftag = aexiftag[j];
	// 2146 4068:aload_3         
	// 2147 4069:iload_1         
	// 2148 4070:aaload          
	// 2149 4071:astore          4
				sExifTagMapsForReading[i].put(((Object) (Integer.valueOf(exiftag.number))), ((Object) (exiftag)));
	// 2150 4073:getstatic       #1062 <Field HashMap[] sExifTagMapsForReading>
	// 2151 4076:iload_0         
	// 2152 4077:aaload          
	// 2153 4078:aload           4
	// 2154 4080:getfield        #1117 <Field int ExifInterface$ExifTag.number>
	// 2155 4083:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	// 2156 4086:aload           4
	// 2157 4088:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	// 2158 4091:pop             
				sExifTagMapsForWriting[i].put(((Object) (exiftag.name)), ((Object) (exiftag)));
	// 2159 4092:getstatic       #1064 <Field HashMap[] sExifTagMapsForWriting>
	// 2160 4095:iload_0         
	// 2161 4096:aaload          
	// 2162 4097:aload           4
	// 2163 4099:getfield        #1124 <Field String ExifInterface$ExifTag.name>
	// 2164 4102:aload           4
	// 2165 4104:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	// 2166 4107:pop             
			}

	// 2167 4108:iload_1         
	// 2168 4109:iconst_1        
	// 2169 4110:iadd            
	// 2170 4111:istore_1        
		}

	// 2171 4112:goto            4063
	// 2172 4115:iload_0         
	// 2173 4116:iconst_1        
	// 2174 4117:iadd            
	// 2175 4118:istore_0        
	//*2176 4119:goto            4020
		sExifPointerTagMap.put(((Object) (Integer.valueOf(EXIF_POINTER_TAGS[0].number))), ((Object) (Integer.valueOf(5))));
	// 2177 4122:getstatic       #1075 <Field HashMap sExifPointerTagMap>
	// 2178 4125:getstatic       #1054 <Field ExifInterface$ExifTag[] EXIF_POINTER_TAGS>
	// 2179 4128:iconst_0        
	// 2180 4129:aaload          
	// 2181 4130:getfield        #1117 <Field int ExifInterface$ExifTag.number>
	// 2182 4133:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	// 2183 4136:iconst_5        
	// 2184 4137:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	// 2185 4140:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	// 2186 4143:pop             
		sExifPointerTagMap.put(((Object) (Integer.valueOf(EXIF_POINTER_TAGS[1].number))), ((Object) (Integer.valueOf(1))));
	// 2187 4144:getstatic       #1075 <Field HashMap sExifPointerTagMap>
	// 2188 4147:getstatic       #1054 <Field ExifInterface$ExifTag[] EXIF_POINTER_TAGS>
	// 2189 4150:iconst_1        
	// 2190 4151:aaload          
	// 2191 4152:getfield        #1117 <Field int ExifInterface$ExifTag.number>
	// 2192 4155:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	// 2193 4158:iconst_1        
	// 2194 4159:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	// 2195 4162:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	// 2196 4165:pop             
		sExifPointerTagMap.put(((Object) (Integer.valueOf(EXIF_POINTER_TAGS[2].number))), ((Object) (Integer.valueOf(2))));
	// 2197 4166:getstatic       #1075 <Field HashMap sExifPointerTagMap>
	// 2198 4169:getstatic       #1054 <Field ExifInterface$ExifTag[] EXIF_POINTER_TAGS>
	// 2199 4172:iconst_2        
	// 2200 4173:aaload          
	// 2201 4174:getfield        #1117 <Field int ExifInterface$ExifTag.number>
	// 2202 4177:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	// 2203 4180:iconst_2        
	// 2204 4181:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	// 2205 4184:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	// 2206 4187:pop             
		sExifPointerTagMap.put(((Object) (Integer.valueOf(EXIF_POINTER_TAGS[3].number))), ((Object) (Integer.valueOf(3))));
	// 2207 4188:getstatic       #1075 <Field HashMap sExifPointerTagMap>
	// 2208 4191:getstatic       #1054 <Field ExifInterface$ExifTag[] EXIF_POINTER_TAGS>
	// 2209 4194:iconst_3        
	// 2210 4195:aaload          
	// 2211 4196:getfield        #1117 <Field int ExifInterface$ExifTag.number>
	// 2212 4199:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	// 2213 4202:iconst_3        
	// 2214 4203:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	// 2215 4206:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	// 2216 4209:pop             
		sExifPointerTagMap.put(((Object) (Integer.valueOf(EXIF_POINTER_TAGS[4].number))), ((Object) (Integer.valueOf(7))));
	// 2217 4210:getstatic       #1075 <Field HashMap sExifPointerTagMap>
	// 2218 4213:getstatic       #1054 <Field ExifInterface$ExifTag[] EXIF_POINTER_TAGS>
	// 2219 4216:iconst_4        
	// 2220 4217:aaload          
	// 2221 4218:getfield        #1117 <Field int ExifInterface$ExifTag.number>
	// 2222 4221:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	// 2223 4224:bipush          7
	// 2224 4226:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	// 2225 4229:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	// 2226 4232:pop             
		sExifPointerTagMap.put(((Object) (Integer.valueOf(EXIF_POINTER_TAGS[5].number))), ((Object) (Integer.valueOf(8))));
	// 2227 4233:getstatic       #1075 <Field HashMap sExifPointerTagMap>
	// 2228 4236:getstatic       #1054 <Field ExifInterface$ExifTag[] EXIF_POINTER_TAGS>
	// 2229 4239:iconst_5        
	// 2230 4240:aaload          
	// 2231 4241:getfield        #1117 <Field int ExifInterface$ExifTag.number>
	// 2232 4244:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	// 2233 4247:bipush          8
	// 2234 4249:invokestatic    #895 <Method Integer Integer.valueOf(int)>
	// 2235 4252:invokevirtual   #1121 <Method Object HashMap.put(Object, Object)>
	// 2236 4255:pop             
	// 2237 4256:ldc2            #1126 <String ".*[1-9].*">
	// 2238 4259:invokestatic    #1132 <Method Pattern Pattern.compile(String)>
	// 2239 4262:putstatic       #1134 <Field Pattern sNonZeroTimePattern>
	// 2240 4265:ldc2            #1136 <String "^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$">
	// 2241 4268:invokestatic    #1132 <Method Pattern Pattern.compile(String)>
	// 2242 4271:putstatic       #1138 <Field Pattern sGpsTimestampPattern>
	//*2243 4274:return          
	}
}
