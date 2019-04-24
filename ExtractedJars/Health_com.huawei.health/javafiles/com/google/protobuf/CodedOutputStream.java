// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.*;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.protobuf:
//			ByteOutput, UnsafeUtil, ByteString, MessageLite, 
//			LazyFieldLite, Utf8, Internal, WireFormat

public abstract class CodedOutputStream extends ByteOutput
{
	static abstract class AbstractBufferedEncoder extends CodedOutputStream
	{

		final void buffer(byte byte0)
		{
			byte abyte0[] = buffer;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field byte[] buffer>
		//    2    4:astore_3        
			int i = position;
		//    3    5:aload_0         
		//    4    6:getfield        #37  <Field int position>
		//    5    9:istore_2        
			position = i + 1;
		//    6   10:aload_0         
		//    7   11:iload_2         
		//    8   12:iconst_1        
		//    9   13:iadd            
		//   10   14:putfield        #37  <Field int position>
			abyte0[i] = byte0;
		//   11   17:aload_3         
		//   12   18:iload_2         
		//   13   19:iload_1         
		//   14   20:bastore         
			totalBytesWritten = totalBytesWritten + 1;
		//   15   21:aload_0         
		//   16   22:aload_0         
		//   17   23:getfield        #39  <Field int totalBytesWritten>
		//   18   26:iconst_1        
		//   19   27:iadd            
		//   20   28:putfield        #39  <Field int totalBytesWritten>
		//   21   31:return          
		}

		final void bufferFixed32NoTag(int i)
		{
			byte abyte0[] = buffer;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field byte[] buffer>
		//    2    4:astore_3        
			int j = position;
		//    3    5:aload_0         
		//    4    6:getfield        #37  <Field int position>
		//    5    9:istore_2        
			position = j + 1;
		//    6   10:aload_0         
		//    7   11:iload_2         
		//    8   12:iconst_1        
		//    9   13:iadd            
		//   10   14:putfield        #37  <Field int position>
			abyte0[j] = (byte)(i & 0xff);
		//   11   17:aload_3         
		//   12   18:iload_2         
		//   13   19:iload_1         
		//   14   20:sipush          255
		//   15   23:iand            
		//   16   24:int2byte        
		//   17   25:bastore         
			abyte0 = buffer;
		//   18   26:aload_0         
		//   19   27:getfield        #31  <Field byte[] buffer>
		//   20   30:astore_3        
			j = position;
		//   21   31:aload_0         
		//   22   32:getfield        #37  <Field int position>
		//   23   35:istore_2        
			position = j + 1;
		//   24   36:aload_0         
		//   25   37:iload_2         
		//   26   38:iconst_1        
		//   27   39:iadd            
		//   28   40:putfield        #37  <Field int position>
			abyte0[j] = (byte)(i >> 8 & 0xff);
		//   29   43:aload_3         
		//   30   44:iload_2         
		//   31   45:iload_1         
		//   32   46:bipush          8
		//   33   48:ishr            
		//   34   49:sipush          255
		//   35   52:iand            
		//   36   53:int2byte        
		//   37   54:bastore         
			abyte0 = buffer;
		//   38   55:aload_0         
		//   39   56:getfield        #31  <Field byte[] buffer>
		//   40   59:astore_3        
			j = position;
		//   41   60:aload_0         
		//   42   61:getfield        #37  <Field int position>
		//   43   64:istore_2        
			position = j + 1;
		//   44   65:aload_0         
		//   45   66:iload_2         
		//   46   67:iconst_1        
		//   47   68:iadd            
		//   48   69:putfield        #37  <Field int position>
			abyte0[j] = (byte)(i >> 16 & 0xff);
		//   49   72:aload_3         
		//   50   73:iload_2         
		//   51   74:iload_1         
		//   52   75:bipush          16
		//   53   77:ishr            
		//   54   78:sipush          255
		//   55   81:iand            
		//   56   82:int2byte        
		//   57   83:bastore         
			abyte0 = buffer;
		//   58   84:aload_0         
		//   59   85:getfield        #31  <Field byte[] buffer>
		//   60   88:astore_3        
			j = position;
		//   61   89:aload_0         
		//   62   90:getfield        #37  <Field int position>
		//   63   93:istore_2        
			position = j + 1;
		//   64   94:aload_0         
		//   65   95:iload_2         
		//   66   96:iconst_1        
		//   67   97:iadd            
		//   68   98:putfield        #37  <Field int position>
			abyte0[j] = (byte)(i >> 24 & 0xff);
		//   69  101:aload_3         
		//   70  102:iload_2         
		//   71  103:iload_1         
		//   72  104:bipush          24
		//   73  106:ishr            
		//   74  107:sipush          255
		//   75  110:iand            
		//   76  111:int2byte        
		//   77  112:bastore         
			totalBytesWritten = totalBytesWritten + 4;
		//   78  113:aload_0         
		//   79  114:aload_0         
		//   80  115:getfield        #39  <Field int totalBytesWritten>
		//   81  118:iconst_4        
		//   82  119:iadd            
		//   83  120:putfield        #39  <Field int totalBytesWritten>
		//   84  123:return          
		}

		final void bufferFixed64NoTag(long l)
		{
			byte abyte0[] = buffer;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field byte[] buffer>
		//    2    4:astore          4
			int i = position;
		//    3    6:aload_0         
		//    4    7:getfield        #37  <Field int position>
		//    5   10:istore_3        
			position = i + 1;
		//    6   11:aload_0         
		//    7   12:iload_3         
		//    8   13:iconst_1        
		//    9   14:iadd            
		//   10   15:putfield        #37  <Field int position>
			abyte0[i] = (byte)(int)(255L & l);
		//   11   18:aload           4
		//   12   20:iload_3         
		//   13   21:ldc2w           #43  <Long 255L>
		//   14   24:lload_1         
		//   15   25:land            
		//   16   26:l2i             
		//   17   27:int2byte        
		//   18   28:bastore         
			abyte0 = buffer;
		//   19   29:aload_0         
		//   20   30:getfield        #31  <Field byte[] buffer>
		//   21   33:astore          4
			i = position;
		//   22   35:aload_0         
		//   23   36:getfield        #37  <Field int position>
		//   24   39:istore_3        
			position = i + 1;
		//   25   40:aload_0         
		//   26   41:iload_3         
		//   27   42:iconst_1        
		//   28   43:iadd            
		//   29   44:putfield        #37  <Field int position>
			abyte0[i] = (byte)(int)(l >> 8 & 255L);
		//   30   47:aload           4
		//   31   49:iload_3         
		//   32   50:lload_1         
		//   33   51:bipush          8
		//   34   53:lshr            
		//   35   54:ldc2w           #43  <Long 255L>
		//   36   57:land            
		//   37   58:l2i             
		//   38   59:int2byte        
		//   39   60:bastore         
			abyte0 = buffer;
		//   40   61:aload_0         
		//   41   62:getfield        #31  <Field byte[] buffer>
		//   42   65:astore          4
			i = position;
		//   43   67:aload_0         
		//   44   68:getfield        #37  <Field int position>
		//   45   71:istore_3        
			position = i + 1;
		//   46   72:aload_0         
		//   47   73:iload_3         
		//   48   74:iconst_1        
		//   49   75:iadd            
		//   50   76:putfield        #37  <Field int position>
			abyte0[i] = (byte)(int)(l >> 16 & 255L);
		//   51   79:aload           4
		//   52   81:iload_3         
		//   53   82:lload_1         
		//   54   83:bipush          16
		//   55   85:lshr            
		//   56   86:ldc2w           #43  <Long 255L>
		//   57   89:land            
		//   58   90:l2i             
		//   59   91:int2byte        
		//   60   92:bastore         
			abyte0 = buffer;
		//   61   93:aload_0         
		//   62   94:getfield        #31  <Field byte[] buffer>
		//   63   97:astore          4
			i = position;
		//   64   99:aload_0         
		//   65  100:getfield        #37  <Field int position>
		//   66  103:istore_3        
			position = i + 1;
		//   67  104:aload_0         
		//   68  105:iload_3         
		//   69  106:iconst_1        
		//   70  107:iadd            
		//   71  108:putfield        #37  <Field int position>
			abyte0[i] = (byte)(int)(l >> 24 & 255L);
		//   72  111:aload           4
		//   73  113:iload_3         
		//   74  114:lload_1         
		//   75  115:bipush          24
		//   76  117:lshr            
		//   77  118:ldc2w           #43  <Long 255L>
		//   78  121:land            
		//   79  122:l2i             
		//   80  123:int2byte        
		//   81  124:bastore         
			abyte0 = buffer;
		//   82  125:aload_0         
		//   83  126:getfield        #31  <Field byte[] buffer>
		//   84  129:astore          4
			i = position;
		//   85  131:aload_0         
		//   86  132:getfield        #37  <Field int position>
		//   87  135:istore_3        
			position = i + 1;
		//   88  136:aload_0         
		//   89  137:iload_3         
		//   90  138:iconst_1        
		//   91  139:iadd            
		//   92  140:putfield        #37  <Field int position>
			abyte0[i] = (byte)((int)(l >> 32) & 0xff);
		//   93  143:aload           4
		//   94  145:iload_3         
		//   95  146:lload_1         
		//   96  147:bipush          32
		//   97  149:lshr            
		//   98  150:l2i             
		//   99  151:sipush          255
		//  100  154:iand            
		//  101  155:int2byte        
		//  102  156:bastore         
			abyte0 = buffer;
		//  103  157:aload_0         
		//  104  158:getfield        #31  <Field byte[] buffer>
		//  105  161:astore          4
			i = position;
		//  106  163:aload_0         
		//  107  164:getfield        #37  <Field int position>
		//  108  167:istore_3        
			position = i + 1;
		//  109  168:aload_0         
		//  110  169:iload_3         
		//  111  170:iconst_1        
		//  112  171:iadd            
		//  113  172:putfield        #37  <Field int position>
			abyte0[i] = (byte)((int)(l >> 40) & 0xff);
		//  114  175:aload           4
		//  115  177:iload_3         
		//  116  178:lload_1         
		//  117  179:bipush          40
		//  118  181:lshr            
		//  119  182:l2i             
		//  120  183:sipush          255
		//  121  186:iand            
		//  122  187:int2byte        
		//  123  188:bastore         
			abyte0 = buffer;
		//  124  189:aload_0         
		//  125  190:getfield        #31  <Field byte[] buffer>
		//  126  193:astore          4
			i = position;
		//  127  195:aload_0         
		//  128  196:getfield        #37  <Field int position>
		//  129  199:istore_3        
			position = i + 1;
		//  130  200:aload_0         
		//  131  201:iload_3         
		//  132  202:iconst_1        
		//  133  203:iadd            
		//  134  204:putfield        #37  <Field int position>
			abyte0[i] = (byte)((int)(l >> 48) & 0xff);
		//  135  207:aload           4
		//  136  209:iload_3         
		//  137  210:lload_1         
		//  138  211:bipush          48
		//  139  213:lshr            
		//  140  214:l2i             
		//  141  215:sipush          255
		//  142  218:iand            
		//  143  219:int2byte        
		//  144  220:bastore         
			abyte0 = buffer;
		//  145  221:aload_0         
		//  146  222:getfield        #31  <Field byte[] buffer>
		//  147  225:astore          4
			i = position;
		//  148  227:aload_0         
		//  149  228:getfield        #37  <Field int position>
		//  150  231:istore_3        
			position = i + 1;
		//  151  232:aload_0         
		//  152  233:iload_3         
		//  153  234:iconst_1        
		//  154  235:iadd            
		//  155  236:putfield        #37  <Field int position>
			abyte0[i] = (byte)((int)(l >> 56) & 0xff);
		//  156  239:aload           4
		//  157  241:iload_3         
		//  158  242:lload_1         
		//  159  243:bipush          56
		//  160  245:lshr            
		//  161  246:l2i             
		//  162  247:sipush          255
		//  163  250:iand            
		//  164  251:int2byte        
		//  165  252:bastore         
			totalBytesWritten = totalBytesWritten + 8;
		//  166  253:aload_0         
		//  167  254:aload_0         
		//  168  255:getfield        #39  <Field int totalBytesWritten>
		//  169  258:bipush          8
		//  170  260:iadd            
		//  171  261:putfield        #39  <Field int totalBytesWritten>
		//  172  264:return          
		}

		final void bufferInt32NoTag(int i)
		{
			if(i >= 0)
		//*   0    0:iload_1         
		//*   1    1:iflt            10
			{
				bufferUInt32NoTag(i);
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:invokevirtual   #48  <Method void bufferUInt32NoTag(int)>
				return;
		//    5    9:return          
			} else
			{
				bufferUInt64NoTag(i);
		//    6   10:aload_0         
		//    7   11:iload_1         
		//    8   12:i2l             
		//    9   13:invokevirtual   #51  <Method void bufferUInt64NoTag(long)>
				return;
		//   10   16:return          
			}
		}

		final void bufferTag(int i, int j)
		{
			bufferUInt32NoTag(WireFormat.makeTag(i, j));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokestatic    #58  <Method int WireFormat.makeTag(int, int)>
		//    4    6:invokevirtual   #48  <Method void bufferUInt32NoTag(int)>
		//    5    9:return          
		}

		final void bufferUInt32NoTag(int i)
		{
			int j = i;
		//    0    0:iload_1         
		//    1    1:istore_2        
			if(CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS)
		//*   2    2:invokestatic    #62  <Method boolean CodedOutputStream.access$100()>
		//*   3    5:ifeq            113
			{
				long l = position;
		//    4    8:aload_0         
		//    5    9:getfield        #37  <Field int position>
		//    6   12:i2l             
		//    7   13:lstore_3        
				do
				{
					if((i & 0xffffff80) == 0)
		//*   8   14:iload_1         
		//*   9   15:bipush          -128
		//*  10   17:iand            
		//*  11   18:ifne            51
					{
						byte abyte0[] = buffer;
		//   12   21:aload_0         
		//   13   22:getfield        #31  <Field byte[] buffer>
		//   14   25:astore          5
						j = position;
		//   15   27:aload_0         
		//   16   28:getfield        #37  <Field int position>
		//   17   31:istore_2        
						position = j + 1;
		//   18   32:aload_0         
		//   19   33:iload_2         
		//   20   34:iconst_1        
		//   21   35:iadd            
		//   22   36:putfield        #37  <Field int position>
						UnsafeUtil.putByte(abyte0, j, (byte)i);
		//   23   39:aload           5
		//   24   41:iload_2         
		//   25   42:i2l             
		//   26   43:iload_1         
		//   27   44:int2byte        
		//   28   45:invokestatic    #68  <Method void UnsafeUtil.putByte(byte[], long, byte)>
						break;
		//   29   48:goto            93
					}
					byte abyte1[] = buffer;
		//   30   51:aload_0         
		//   31   52:getfield        #31  <Field byte[] buffer>
		//   32   55:astore          5
					j = position;
		//   33   57:aload_0         
		//   34   58:getfield        #37  <Field int position>
		//   35   61:istore_2        
					position = j + 1;
		//   36   62:aload_0         
		//   37   63:iload_2         
		//   38   64:iconst_1        
		//   39   65:iadd            
		//   40   66:putfield        #37  <Field int position>
					UnsafeUtil.putByte(abyte1, j, (byte)(i & 0x7f | 0x80));
		//   41   69:aload           5
		//   42   71:iload_2         
		//   43   72:i2l             
		//   44   73:iload_1         
		//   45   74:bipush          127
		//   46   76:iand            
		//   47   77:sipush          128
		//   48   80:ior             
		//   49   81:int2byte        
		//   50   82:invokestatic    #68  <Method void UnsafeUtil.putByte(byte[], long, byte)>
					i >>>= 7;
		//   51   85:iload_1         
		//   52   86:bipush          7
		//   53   88:iushr           
		//   54   89:istore_1        
				} while(true);
		//   55   90:goto            14
				i = (int)((long)position - l);
		//   56   93:aload_0         
		//   57   94:getfield        #37  <Field int position>
		//   58   97:i2l             
		//   59   98:lload_3         
		//   60   99:lsub            
		//   61  100:l2i             
		//   62  101:istore_1        
				totalBytesWritten = totalBytesWritten + i;
		//   63  102:aload_0         
		//   64  103:aload_0         
		//   65  104:getfield        #39  <Field int totalBytesWritten>
		//   66  107:iload_1         
		//   67  108:iadd            
		//   68  109:putfield        #39  <Field int totalBytesWritten>
				return;
		//   69  112:return          
			}
			do
			{
				if((j & 0xffffff80) == 0)
		//*  70  113:iload_2         
		//*  71  114:bipush          -128
		//*  72  116:iand            
		//*  73  117:ifne            155
				{
					byte abyte2[] = buffer;
		//   74  120:aload_0         
		//   75  121:getfield        #31  <Field byte[] buffer>
		//   76  124:astore          5
					i = position;
		//   77  126:aload_0         
		//   78  127:getfield        #37  <Field int position>
		//   79  130:istore_1        
					position = i + 1;
		//   80  131:aload_0         
		//   81  132:iload_1         
		//   82  133:iconst_1        
		//   83  134:iadd            
		//   84  135:putfield        #37  <Field int position>
					abyte2[i] = (byte)j;
		//   85  138:aload           5
		//   86  140:iload_1         
		//   87  141:iload_2         
		//   88  142:int2byte        
		//   89  143:bastore         
					totalBytesWritten = totalBytesWritten + 1;
		//   90  144:aload_0         
		//   91  145:aload_0         
		//   92  146:getfield        #39  <Field int totalBytesWritten>
		//   93  149:iconst_1        
		//   94  150:iadd            
		//   95  151:putfield        #39  <Field int totalBytesWritten>
					return;
		//   96  154:return          
				}
				byte abyte3[] = buffer;
		//   97  155:aload_0         
		//   98  156:getfield        #31  <Field byte[] buffer>
		//   99  159:astore          5
				i = position;
		//  100  161:aload_0         
		//  101  162:getfield        #37  <Field int position>
		//  102  165:istore_1        
				position = i + 1;
		//  103  166:aload_0         
		//  104  167:iload_1         
		//  105  168:iconst_1        
		//  106  169:iadd            
		//  107  170:putfield        #37  <Field int position>
				abyte3[i] = (byte)(j & 0x7f | 0x80);
		//  108  173:aload           5
		//  109  175:iload_1         
		//  110  176:iload_2         
		//  111  177:bipush          127
		//  112  179:iand            
		//  113  180:sipush          128
		//  114  183:ior             
		//  115  184:int2byte        
		//  116  185:bastore         
				totalBytesWritten = totalBytesWritten + 1;
		//  117  186:aload_0         
		//  118  187:aload_0         
		//  119  188:getfield        #39  <Field int totalBytesWritten>
		//  120  191:iconst_1        
		//  121  192:iadd            
		//  122  193:putfield        #39  <Field int totalBytesWritten>
				j >>>= 7;
		//  123  196:iload_2         
		//  124  197:bipush          7
		//  125  199:iushr           
		//  126  200:istore_2        
			} while(true);
		//  127  201:goto            113
		}

		final void bufferUInt64NoTag(long l)
		{
			long l1 = l;
		//    0    0:lload_1         
		//    1    1:lstore          4
			if(CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS)
		//*   2    3:invokestatic    #62  <Method boolean CodedOutputStream.access$100()>
		//*   3    6:ifeq            121
			{
				l1 = position;
		//    4    9:aload_0         
		//    5   10:getfield        #37  <Field int position>
		//    6   13:i2l             
		//    7   14:lstore          4
				do
				{
					if((-128L & l) == 0L)
		//*   8   16:ldc2w           #69  <Long -128L>
		//*   9   19:lload_1         
		//*  10   20:land            
		//*  11   21:lconst_0        
		//*  12   22:lcmp            
		//*  13   23:ifne            57
					{
						byte abyte0[] = buffer;
		//   14   26:aload_0         
		//   15   27:getfield        #31  <Field byte[] buffer>
		//   16   30:astore          6
						int i = position;
		//   17   32:aload_0         
		//   18   33:getfield        #37  <Field int position>
		//   19   36:istore_3        
						position = i + 1;
		//   20   37:aload_0         
		//   21   38:iload_3         
		//   22   39:iconst_1        
		//   23   40:iadd            
		//   24   41:putfield        #37  <Field int position>
						UnsafeUtil.putByte(abyte0, i, (byte)(int)l);
		//   25   44:aload           6
		//   26   46:iload_3         
		//   27   47:i2l             
		//   28   48:lload_1         
		//   29   49:l2i             
		//   30   50:int2byte        
		//   31   51:invokestatic    #68  <Method void UnsafeUtil.putByte(byte[], long, byte)>
						break;
		//   32   54:goto            100
					}
					byte abyte1[] = buffer;
		//   33   57:aload_0         
		//   34   58:getfield        #31  <Field byte[] buffer>
		//   35   61:astore          6
					int j = position;
		//   36   63:aload_0         
		//   37   64:getfield        #37  <Field int position>
		//   38   67:istore_3        
					position = j + 1;
		//   39   68:aload_0         
		//   40   69:iload_3         
		//   41   70:iconst_1        
		//   42   71:iadd            
		//   43   72:putfield        #37  <Field int position>
					UnsafeUtil.putByte(abyte1, j, (byte)((int)l & 0x7f | 0x80));
		//   44   75:aload           6
		//   45   77:iload_3         
		//   46   78:i2l             
		//   47   79:lload_1         
		//   48   80:l2i             
		//   49   81:bipush          127
		//   50   83:iand            
		//   51   84:sipush          128
		//   52   87:ior             
		//   53   88:int2byte        
		//   54   89:invokestatic    #68  <Method void UnsafeUtil.putByte(byte[], long, byte)>
					l >>>= 7;
		//   55   92:lload_1         
		//   56   93:bipush          7
		//   57   95:lushr           
		//   58   96:lstore_1        
				} while(true);
		//   59   97:goto            16
				int k = (int)((long)position - l1);
		//   60  100:aload_0         
		//   61  101:getfield        #37  <Field int position>
		//   62  104:i2l             
		//   63  105:lload           4
		//   64  107:lsub            
		//   65  108:l2i             
		//   66  109:istore_3        
				totalBytesWritten = totalBytesWritten + k;
		//   67  110:aload_0         
		//   68  111:aload_0         
		//   69  112:getfield        #39  <Field int totalBytesWritten>
		//   70  115:iload_3         
		//   71  116:iadd            
		//   72  117:putfield        #39  <Field int totalBytesWritten>
				return;
		//   73  120:return          
			}
			do
			{
				if((-128L & l1) == 0L)
		//*  74  121:ldc2w           #69  <Long -128L>
		//*  75  124:lload           4
		//*  76  126:land            
		//*  77  127:lconst_0        
		//*  78  128:lcmp            
		//*  79  129:ifne            169
				{
					byte abyte2[] = buffer;
		//   80  132:aload_0         
		//   81  133:getfield        #31  <Field byte[] buffer>
		//   82  136:astore          6
					int i1 = position;
		//   83  138:aload_0         
		//   84  139:getfield        #37  <Field int position>
		//   85  142:istore_3        
					position = i1 + 1;
		//   86  143:aload_0         
		//   87  144:iload_3         
		//   88  145:iconst_1        
		//   89  146:iadd            
		//   90  147:putfield        #37  <Field int position>
					abyte2[i1] = (byte)(int)l1;
		//   91  150:aload           6
		//   92  152:iload_3         
		//   93  153:lload           4
		//   94  155:l2i             
		//   95  156:int2byte        
		//   96  157:bastore         
					totalBytesWritten = totalBytesWritten + 1;
		//   97  158:aload_0         
		//   98  159:aload_0         
		//   99  160:getfield        #39  <Field int totalBytesWritten>
		//  100  163:iconst_1        
		//  101  164:iadd            
		//  102  165:putfield        #39  <Field int totalBytesWritten>
					return;
		//  103  168:return          
				}
				byte abyte3[] = buffer;
		//  104  169:aload_0         
		//  105  170:getfield        #31  <Field byte[] buffer>
		//  106  173:astore          6
				int j1 = position;
		//  107  175:aload_0         
		//  108  176:getfield        #37  <Field int position>
		//  109  179:istore_3        
				position = j1 + 1;
		//  110  180:aload_0         
		//  111  181:iload_3         
		//  112  182:iconst_1        
		//  113  183:iadd            
		//  114  184:putfield        #37  <Field int position>
				abyte3[j1] = (byte)((int)l1 & 0x7f | 0x80);
		//  115  187:aload           6
		//  116  189:iload_3         
		//  117  190:lload           4
		//  118  192:l2i             
		//  119  193:bipush          127
		//  120  195:iand            
		//  121  196:sipush          128
		//  122  199:ior             
		//  123  200:int2byte        
		//  124  201:bastore         
				totalBytesWritten = totalBytesWritten + 1;
		//  125  202:aload_0         
		//  126  203:aload_0         
		//  127  204:getfield        #39  <Field int totalBytesWritten>
		//  128  207:iconst_1        
		//  129  208:iadd            
		//  130  209:putfield        #39  <Field int totalBytesWritten>
				l1 >>>= 7;
		//  131  212:lload           4
		//  132  214:bipush          7
		//  133  216:lushr           
		//  134  217:lstore          4
			} while(true);
		//  135  219:goto            121
		}

		public final int getTotalBytesWritten()
		{
			return totalBytesWritten;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field int totalBytesWritten>
		//    2    4:ireturn         
		}

		public final int spaceLeft()
		{
			throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
		//    0    0:new             #75  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:ldc1            #77  <String "spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.">
		//    3    6:invokespecial   #78  <Method void UnsupportedOperationException(String)>
		//    4    9:athrow          
		}

		final byte buffer[];
		final int limit;
		int position;
		int totalBytesWritten;

		AbstractBufferedEncoder(int i)
		{
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #16  <Method void CodedOutputStream(CodedOutputStream$1)>
			if(i < 0)
		//*   3    5:iload_1         
		//*   4    6:ifge            19
			{
				throw new IllegalArgumentException("bufferSize must be >= 0");
		//    5    9:new             #18  <Class IllegalArgumentException>
		//    6   12:dup             
		//    7   13:ldc1            #20  <String "bufferSize must be >= 0">
		//    8   15:invokespecial   #23  <Method void IllegalArgumentException(String)>
		//    9   18:athrow          
			} else
			{
				buffer = new byte[Math.max(i, 20)];
		//   10   19:aload_0         
		//   11   20:iload_1         
		//   12   21:bipush          20
		//   13   23:invokestatic    #29  <Method int Math.max(int, int)>
		//   14   26:newarray        byte[]
		//   15   28:putfield        #31  <Field byte[] buffer>
				limit = buffer.length;
		//   16   31:aload_0         
		//   17   32:aload_0         
		//   18   33:getfield        #31  <Field byte[] buffer>
		//   19   36:arraylength     
		//   20   37:putfield        #33  <Field int limit>
				return;
		//   21   40:return          
			}
		}
	}

	static class ArrayEncoder extends CodedOutputStream
	{

		public void flush()
		{
		//    0    0:return          
		}

		public final int getTotalBytesWritten()
		{
			return position - offset;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field int position>
		//    2    4:aload_0         
		//    3    5:getfield        #45  <Field int offset>
		//    4    8:isub            
		//    5    9:ireturn         
		}

		public final int spaceLeft()
		{
			return limit - position;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field int limit>
		//    2    4:aload_0         
		//    3    5:getfield        #47  <Field int position>
		//    4    8:isub            
		//    5    9:ireturn         
		}

		public final void write(byte byte0)
			throws IOException
		{
			int i;
			byte abyte0[];
			try
			{
				abyte0 = buffer;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field byte[] buffer>
		//    2    4:astore_3        
				i = position;
		//    3    5:aload_0         
		//    4    6:getfield        #47  <Field int position>
		//    5    9:istore_2        
				position = i + 1;
		//    6   10:aload_0         
		//    7   11:iload_2         
		//    8   12:iconst_1        
		//    9   13:iadd            
		//   10   14:putfield        #47  <Field int position>
			}
		//*  11   17:aload_3         
		//*  12   18:iload_2         
		//*  13   19:iload_1         
		//*  14   20:bastore         
		//*  15   21:return          
			catch(IndexOutOfBoundsException indexoutofboundsexception)
		//*  16   22:astore_3        
			{
				throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
					Integer.valueOf(position), Integer.valueOf(limit), Integer.valueOf(1)
				}), ((Throwable) (indexoutofboundsexception)));
		//   17   23:new             #63  <Class CodedOutputStream$OutOfSpaceException>
		//   18   26:dup             
		//   19   27:ldc1            #65  <String "Pos: %d, limit: %d, len: %d">
		//   20   29:iconst_3        
		//   21   30:anewarray       Object[]
		//   22   33:dup             
		//   23   34:iconst_0        
		//   24   35:aload_0         
		//   25   36:getfield        #47  <Field int position>
		//   26   39:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//   27   42:aastore         
		//   28   43:dup             
		//   29   44:iconst_1        
		//   30   45:aload_0         
		//   31   46:getfield        #49  <Field int limit>
		//   32   49:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//   33   52:aastore         
		//   34   53:dup             
		//   35   54:iconst_2        
		//   36   55:iconst_1        
		//   37   56:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//   38   59:aastore         
		//   39   60:invokestatic    #40  <Method String String.format(String, Object[])>
		//   40   63:aload_3         
		//   41   64:invokespecial   #68  <Method void CodedOutputStream$OutOfSpaceException(String, Throwable)>
		//   42   67:athrow          
			}
			abyte0[i] = byte0;
		}

		public final void write(ByteBuffer bytebuffer)
			throws IOException
		{
			int i = bytebuffer.remaining();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #75  <Method int ByteBuffer.remaining()>
		//    2    4:istore_2        
			try
			{
				bytebuffer.get(buffer, position, i);
		//    3    5:aload_1         
		//    4    6:aload_0         
		//    5    7:getfield        #43  <Field byte[] buffer>
		//    6   10:aload_0         
		//    7   11:getfield        #47  <Field int position>
		//    8   14:iload_2         
		//    9   15:invokevirtual   #79  <Method ByteBuffer ByteBuffer.get(byte[], int, int)>
		//   10   18:pop             
				position = position + i;
		//   11   19:aload_0         
		//   12   20:aload_0         
		//   13   21:getfield        #47  <Field int position>
		//   14   24:iload_2         
		//   15   25:iadd            
		//   16   26:putfield        #47  <Field int position>
				return;
		//   17   29:return          
			}
			// Misplaced declaration of an exception variable
			catch(ByteBuffer bytebuffer)
		//*  18   30:astore_1        
			{
				throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
					Integer.valueOf(position), Integer.valueOf(limit), Integer.valueOf(i)
				}), ((Throwable) (bytebuffer)));
		//   19   31:new             #63  <Class CodedOutputStream$OutOfSpaceException>
		//   20   34:dup             
		//   21   35:ldc1            #65  <String "Pos: %d, limit: %d, len: %d">
		//   22   37:iconst_3        
		//   23   38:anewarray       Object[]
		//   24   41:dup             
		//   25   42:iconst_0        
		//   26   43:aload_0         
		//   27   44:getfield        #47  <Field int position>
		//   28   47:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//   29   50:aastore         
		//   30   51:dup             
		//   31   52:iconst_1        
		//   32   53:aload_0         
		//   33   54:getfield        #49  <Field int limit>
		//   34   57:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//   35   60:aastore         
		//   36   61:dup             
		//   37   62:iconst_2        
		//   38   63:iload_2         
		//   39   64:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//   40   67:aastore         
		//   41   68:invokestatic    #40  <Method String String.format(String, Object[])>
		//   42   71:aload_1         
		//   43   72:invokespecial   #68  <Method void CodedOutputStream$OutOfSpaceException(String, Throwable)>
		//   44   75:athrow          
			}
		}

		public final void write(byte abyte0[], int i, int j)
			throws IOException
		{
			try
			{
				System.arraycopy(((Object) (abyte0)), i, ((Object) (buffer)), position, j);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:aload_0         
		//    3    3:getfield        #43  <Field byte[] buffer>
		//    4    6:aload_0         
		//    5    7:getfield        #47  <Field int position>
		//    6   10:iload_3         
		//    7   11:invokestatic    #85  <Method void System.arraycopy(Object, int, Object, int, int)>
				position = position + j;
		//    8   14:aload_0         
		//    9   15:aload_0         
		//   10   16:getfield        #47  <Field int position>
		//   11   19:iload_3         
		//   12   20:iadd            
		//   13   21:putfield        #47  <Field int position>
				return;
		//   14   24:return          
			}
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
		//*  15   25:astore_1        
			{
				throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
					Integer.valueOf(position), Integer.valueOf(limit), Integer.valueOf(j)
				}), ((Throwable) (abyte0)));
		//   16   26:new             #63  <Class CodedOutputStream$OutOfSpaceException>
		//   17   29:dup             
		//   18   30:ldc1            #65  <String "Pos: %d, limit: %d, len: %d">
		//   19   32:iconst_3        
		//   20   33:anewarray       Object[]
		//   21   36:dup             
		//   22   37:iconst_0        
		//   23   38:aload_0         
		//   24   39:getfield        #47  <Field int position>
		//   25   42:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//   26   45:aastore         
		//   27   46:dup             
		//   28   47:iconst_1        
		//   29   48:aload_0         
		//   30   49:getfield        #49  <Field int limit>
		//   31   52:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//   32   55:aastore         
		//   33   56:dup             
		//   34   57:iconst_2        
		//   35   58:iload_3         
		//   36   59:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//   37   62:aastore         
		//   38   63:invokestatic    #40  <Method String String.format(String, Object[])>
		//   39   66:aload_1         
		//   40   67:invokespecial   #68  <Method void CodedOutputStream$OutOfSpaceException(String, Throwable)>
		//   41   70:athrow          
			}
		}

		public final void writeBool(int i, boolean flag)
			throws IOException
		{
			writeTag(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
			if(flag)
		//*   4    6:iload_2         
		//*   5    7:ifeq            15
				i = 1;
		//    6   10:iconst_1        
		//    7   11:istore_1        
			else
		//*   8   12:goto            17
				i = 0;
		//    9   15:iconst_0        
		//   10   16:istore_1        
			write((byte)i);
		//   11   17:aload_0         
		//   12   18:iload_1         
		//   13   19:int2byte        
		//   14   20:invokevirtual   #93  <Method void write(byte)>
		//   15   23:return          
		}

		public final void writeByteArray(int i, byte abyte0[])
			throws IOException
		{
			writeByteArray(i, abyte0, 0, abyte0.length);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:iconst_0        
		//    4    4:aload_2         
		//    5    5:arraylength     
		//    6    6:invokevirtual   #98  <Method void writeByteArray(int, byte[], int, int)>
		//    7    9:return          
		}

		public final void writeByteArray(int i, byte abyte0[], int j, int k)
			throws IOException
		{
			writeTag(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
			writeByteArrayNoTag(abyte0, j, k);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:iload_3         
		//    7    9:iload           4
		//    8   11:invokevirtual   #101 <Method void writeByteArrayNoTag(byte[], int, int)>
		//    9   14:return          
		}

		public final void writeByteArrayNoTag(byte abyte0[], int i, int j)
			throws IOException
		{
			writeUInt32NoTag(j);
		//    0    0:aload_0         
		//    1    1:iload_3         
		//    2    2:invokevirtual   #105 <Method void writeUInt32NoTag(int)>
			write(abyte0, i, j);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:iload_2         
		//    6    8:iload_3         
		//    7    9:invokevirtual   #107 <Method void write(byte[], int, int)>
		//    8   12:return          
		}

		public final void writeByteBuffer(int i, ByteBuffer bytebuffer)
			throws IOException
		{
			writeTag(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
			writeUInt32NoTag(bytebuffer.capacity());
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #112 <Method int ByteBuffer.capacity()>
		//    7   11:invokevirtual   #105 <Method void writeUInt32NoTag(int)>
			writeRawBytes(bytebuffer);
		//    8   14:aload_0         
		//    9   15:aload_2         
		//   10   16:invokevirtual   #115 <Method void writeRawBytes(ByteBuffer)>
		//   11   19:return          
		}

		public final void writeBytes(int i, ByteString bytestring)
			throws IOException
		{
			writeTag(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
			writeBytesNoTag(bytestring);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #121 <Method void writeBytesNoTag(ByteString)>
		//    7   11:return          
		}

		public final void writeBytesNoTag(ByteString bytestring)
			throws IOException
		{
			writeUInt32NoTag(bytestring.size());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #126 <Method int ByteString.size()>
		//    3    5:invokevirtual   #105 <Method void writeUInt32NoTag(int)>
			bytestring.writeTo(((ByteOutput) (this)));
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:invokevirtual   #130 <Method void ByteString.writeTo(ByteOutput)>
		//    7   13:return          
		}

		public final void writeFixed32(int i, int j)
			throws IOException
		{
			writeTag(i, 5);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_5        
		//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
			writeFixed32NoTag(j);
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:invokevirtual   #134 <Method void writeFixed32NoTag(int)>
		//    7   11:return          
		}

		public final void writeFixed32NoTag(int i)
			throws IOException
		{
			int j;
			byte abyte0[];
			try
			{
				abyte0 = buffer;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field byte[] buffer>
		//    2    4:astore_3        
				j = position;
		//    3    5:aload_0         
		//    4    6:getfield        #47  <Field int position>
		//    5    9:istore_2        
				position = j + 1;
		//    6   10:aload_0         
		//    7   11:iload_2         
		//    8   12:iconst_1        
		//    9   13:iadd            
		//   10   14:putfield        #47  <Field int position>
			}
		//*  11   17:aload_3         
		//*  12   18:iload_2         
		//*  13   19:iload_1         
		//*  14   20:sipush          255
		//*  15   23:iand            
		//*  16   24:int2byte        
		//*  17   25:bastore         
		//*  18   26:aload_0         
		//*  19   27:getfield        #43  <Field byte[] buffer>
		//*  20   30:astore_3        
		//*  21   31:aload_0         
		//*  22   32:getfield        #47  <Field int position>
		//*  23   35:istore_2        
		//*  24   36:aload_0         
		//*  25   37:iload_2         
		//*  26   38:iconst_1        
		//*  27   39:iadd            
		//*  28   40:putfield        #47  <Field int position>
		//*  29   43:aload_3         
		//*  30   44:iload_2         
		//*  31   45:iload_1         
		//*  32   46:bipush          8
		//*  33   48:ishr            
		//*  34   49:sipush          255
		//*  35   52:iand            
		//*  36   53:int2byte        
		//*  37   54:bastore         
		//*  38   55:aload_0         
		//*  39   56:getfield        #43  <Field byte[] buffer>
		//*  40   59:astore_3        
		//*  41   60:aload_0         
		//*  42   61:getfield        #47  <Field int position>
		//*  43   64:istore_2        
		//*  44   65:aload_0         
		//*  45   66:iload_2         
		//*  46   67:iconst_1        
		//*  47   68:iadd            
		//*  48   69:putfield        #47  <Field int position>
		//*  49   72:aload_3         
		//*  50   73:iload_2         
		//*  51   74:iload_1         
		//*  52   75:bipush          16
		//*  53   77:ishr            
		//*  54   78:sipush          255
		//*  55   81:iand            
		//*  56   82:int2byte        
		//*  57   83:bastore         
		//*  58   84:aload_0         
		//*  59   85:getfield        #43  <Field byte[] buffer>
		//*  60   88:astore_3        
		//*  61   89:aload_0         
		//*  62   90:getfield        #47  <Field int position>
		//*  63   93:istore_2        
		//*  64   94:aload_0         
		//*  65   95:iload_2         
		//*  66   96:iconst_1        
		//*  67   97:iadd            
		//*  68   98:putfield        #47  <Field int position>
		//*  69  101:aload_3         
		//*  70  102:iload_2         
		//*  71  103:iload_1         
		//*  72  104:bipush          24
		//*  73  106:ishr            
		//*  74  107:sipush          255
		//*  75  110:iand            
		//*  76  111:int2byte        
		//*  77  112:bastore         
		//*  78  113:return          
			catch(IndexOutOfBoundsException indexoutofboundsexception)
		//*  79  114:astore_3        
			{
				throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
					Integer.valueOf(position), Integer.valueOf(limit), Integer.valueOf(1)
				}), ((Throwable) (indexoutofboundsexception)));
		//   80  115:new             #63  <Class CodedOutputStream$OutOfSpaceException>
		//   81  118:dup             
		//   82  119:ldc1            #65  <String "Pos: %d, limit: %d, len: %d">
		//   83  121:iconst_3        
		//   84  122:anewarray       Object[]
		//   85  125:dup             
		//   86  126:iconst_0        
		//   87  127:aload_0         
		//   88  128:getfield        #47  <Field int position>
		//   89  131:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//   90  134:aastore         
		//   91  135:dup             
		//   92  136:iconst_1        
		//   93  137:aload_0         
		//   94  138:getfield        #49  <Field int limit>
		//   95  141:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//   96  144:aastore         
		//   97  145:dup             
		//   98  146:iconst_2        
		//   99  147:iconst_1        
		//  100  148:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//  101  151:aastore         
		//  102  152:invokestatic    #40  <Method String String.format(String, Object[])>
		//  103  155:aload_3         
		//  104  156:invokespecial   #68  <Method void CodedOutputStream$OutOfSpaceException(String, Throwable)>
		//  105  159:athrow          
			}
			abyte0[j] = (byte)(i & 0xff);
			abyte0 = buffer;
			j = position;
			position = j + 1;
			abyte0[j] = (byte)(i >> 8 & 0xff);
			abyte0 = buffer;
			j = position;
			position = j + 1;
			abyte0[j] = (byte)(i >> 16 & 0xff);
			abyte0 = buffer;
			j = position;
			position = j + 1;
			abyte0[j] = (byte)(i >> 24 & 0xff);
			return;
		}

		public final void writeFixed64(int i, long l)
			throws IOException
		{
			writeTag(i, 1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_1        
		//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
			writeFixed64NoTag(l);
		//    4    6:aload_0         
		//    5    7:lload_2         
		//    6    8:invokevirtual   #140 <Method void writeFixed64NoTag(long)>
		//    7   11:return          
		}

		public final void writeFixed64NoTag(long l)
			throws IOException
		{
			int i;
			byte abyte0[];
			try
			{
				abyte0 = buffer;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field byte[] buffer>
		//    2    4:astore          4
				i = position;
		//    3    6:aload_0         
		//    4    7:getfield        #47  <Field int position>
		//    5   10:istore_3        
				position = i + 1;
		//    6   11:aload_0         
		//    7   12:iload_3         
		//    8   13:iconst_1        
		//    9   14:iadd            
		//   10   15:putfield        #47  <Field int position>
			}
		//*  11   18:aload           4
		//*  12   20:iload_3         
		//*  13   21:lload_1         
		//*  14   22:l2i             
		//*  15   23:sipush          255
		//*  16   26:iand            
		//*  17   27:int2byte        
		//*  18   28:bastore         
		//*  19   29:aload_0         
		//*  20   30:getfield        #43  <Field byte[] buffer>
		//*  21   33:astore          4
		//*  22   35:aload_0         
		//*  23   36:getfield        #47  <Field int position>
		//*  24   39:istore_3        
		//*  25   40:aload_0         
		//*  26   41:iload_3         
		//*  27   42:iconst_1        
		//*  28   43:iadd            
		//*  29   44:putfield        #47  <Field int position>
		//*  30   47:aload           4
		//*  31   49:iload_3         
		//*  32   50:lload_1         
		//*  33   51:bipush          8
		//*  34   53:lshr            
		//*  35   54:l2i             
		//*  36   55:sipush          255
		//*  37   58:iand            
		//*  38   59:int2byte        
		//*  39   60:bastore         
		//*  40   61:aload_0         
		//*  41   62:getfield        #43  <Field byte[] buffer>
		//*  42   65:astore          4
		//*  43   67:aload_0         
		//*  44   68:getfield        #47  <Field int position>
		//*  45   71:istore_3        
		//*  46   72:aload_0         
		//*  47   73:iload_3         
		//*  48   74:iconst_1        
		//*  49   75:iadd            
		//*  50   76:putfield        #47  <Field int position>
		//*  51   79:aload           4
		//*  52   81:iload_3         
		//*  53   82:lload_1         
		//*  54   83:bipush          16
		//*  55   85:lshr            
		//*  56   86:l2i             
		//*  57   87:sipush          255
		//*  58   90:iand            
		//*  59   91:int2byte        
		//*  60   92:bastore         
		//*  61   93:aload_0         
		//*  62   94:getfield        #43  <Field byte[] buffer>
		//*  63   97:astore          4
		//*  64   99:aload_0         
		//*  65  100:getfield        #47  <Field int position>
		//*  66  103:istore_3        
		//*  67  104:aload_0         
		//*  68  105:iload_3         
		//*  69  106:iconst_1        
		//*  70  107:iadd            
		//*  71  108:putfield        #47  <Field int position>
		//*  72  111:aload           4
		//*  73  113:iload_3         
		//*  74  114:lload_1         
		//*  75  115:bipush          24
		//*  76  117:lshr            
		//*  77  118:l2i             
		//*  78  119:sipush          255
		//*  79  122:iand            
		//*  80  123:int2byte        
		//*  81  124:bastore         
		//*  82  125:aload_0         
		//*  83  126:getfield        #43  <Field byte[] buffer>
		//*  84  129:astore          4
		//*  85  131:aload_0         
		//*  86  132:getfield        #47  <Field int position>
		//*  87  135:istore_3        
		//*  88  136:aload_0         
		//*  89  137:iload_3         
		//*  90  138:iconst_1        
		//*  91  139:iadd            
		//*  92  140:putfield        #47  <Field int position>
		//*  93  143:aload           4
		//*  94  145:iload_3         
		//*  95  146:lload_1         
		//*  96  147:bipush          32
		//*  97  149:lshr            
		//*  98  150:l2i             
		//*  99  151:sipush          255
		//* 100  154:iand            
		//* 101  155:int2byte        
		//* 102  156:bastore         
		//* 103  157:aload_0         
		//* 104  158:getfield        #43  <Field byte[] buffer>
		//* 105  161:astore          4
		//* 106  163:aload_0         
		//* 107  164:getfield        #47  <Field int position>
		//* 108  167:istore_3        
		//* 109  168:aload_0         
		//* 110  169:iload_3         
		//* 111  170:iconst_1        
		//* 112  171:iadd            
		//* 113  172:putfield        #47  <Field int position>
		//* 114  175:aload           4
		//* 115  177:iload_3         
		//* 116  178:lload_1         
		//* 117  179:bipush          40
		//* 118  181:lshr            
		//* 119  182:l2i             
		//* 120  183:sipush          255
		//* 121  186:iand            
		//* 122  187:int2byte        
		//* 123  188:bastore         
		//* 124  189:aload_0         
		//* 125  190:getfield        #43  <Field byte[] buffer>
		//* 126  193:astore          4
		//* 127  195:aload_0         
		//* 128  196:getfield        #47  <Field int position>
		//* 129  199:istore_3        
		//* 130  200:aload_0         
		//* 131  201:iload_3         
		//* 132  202:iconst_1        
		//* 133  203:iadd            
		//* 134  204:putfield        #47  <Field int position>
		//* 135  207:aload           4
		//* 136  209:iload_3         
		//* 137  210:lload_1         
		//* 138  211:bipush          48
		//* 139  213:lshr            
		//* 140  214:l2i             
		//* 141  215:sipush          255
		//* 142  218:iand            
		//* 143  219:int2byte        
		//* 144  220:bastore         
		//* 145  221:aload_0         
		//* 146  222:getfield        #43  <Field byte[] buffer>
		//* 147  225:astore          4
		//* 148  227:aload_0         
		//* 149  228:getfield        #47  <Field int position>
		//* 150  231:istore_3        
		//* 151  232:aload_0         
		//* 152  233:iload_3         
		//* 153  234:iconst_1        
		//* 154  235:iadd            
		//* 155  236:putfield        #47  <Field int position>
		//* 156  239:aload           4
		//* 157  241:iload_3         
		//* 158  242:lload_1         
		//* 159  243:bipush          56
		//* 160  245:lshr            
		//* 161  246:l2i             
		//* 162  247:sipush          255
		//* 163  250:iand            
		//* 164  251:int2byte        
		//* 165  252:bastore         
		//* 166  253:return          
			catch(IndexOutOfBoundsException indexoutofboundsexception)
		//* 167  254:astore          4
			{
				throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
					Integer.valueOf(position), Integer.valueOf(limit), Integer.valueOf(1)
				}), ((Throwable) (indexoutofboundsexception)));
		//  168  256:new             #63  <Class CodedOutputStream$OutOfSpaceException>
		//  169  259:dup             
		//  170  260:ldc1            #65  <String "Pos: %d, limit: %d, len: %d">
		//  171  262:iconst_3        
		//  172  263:anewarray       Object[]
		//  173  266:dup             
		//  174  267:iconst_0        
		//  175  268:aload_0         
		//  176  269:getfield        #47  <Field int position>
		//  177  272:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//  178  275:aastore         
		//  179  276:dup             
		//  180  277:iconst_1        
		//  181  278:aload_0         
		//  182  279:getfield        #49  <Field int limit>
		//  183  282:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//  184  285:aastore         
		//  185  286:dup             
		//  186  287:iconst_2        
		//  187  288:iconst_1        
		//  188  289:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//  189  292:aastore         
		//  190  293:invokestatic    #40  <Method String String.format(String, Object[])>
		//  191  296:aload           4
		//  192  298:invokespecial   #68  <Method void CodedOutputStream$OutOfSpaceException(String, Throwable)>
		//  193  301:athrow          
			}
			abyte0[i] = (byte)((int)l & 0xff);
			abyte0 = buffer;
			i = position;
			position = i + 1;
			abyte0[i] = (byte)((int)(l >> 8) & 0xff);
			abyte0 = buffer;
			i = position;
			position = i + 1;
			abyte0[i] = (byte)((int)(l >> 16) & 0xff);
			abyte0 = buffer;
			i = position;
			position = i + 1;
			abyte0[i] = (byte)((int)(l >> 24) & 0xff);
			abyte0 = buffer;
			i = position;
			position = i + 1;
			abyte0[i] = (byte)((int)(l >> 32) & 0xff);
			abyte0 = buffer;
			i = position;
			position = i + 1;
			abyte0[i] = (byte)((int)(l >> 40) & 0xff);
			abyte0 = buffer;
			i = position;
			position = i + 1;
			abyte0[i] = (byte)((int)(l >> 48) & 0xff);
			abyte0 = buffer;
			i = position;
			position = i + 1;
			abyte0[i] = (byte)((int)(l >> 56) & 0xff);
			return;
		}

		public final void writeInt32(int i, int j)
			throws IOException
		{
			writeTag(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
			writeInt32NoTag(j);
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:invokevirtual   #144 <Method void writeInt32NoTag(int)>
		//    7   11:return          
		}

		public final void writeInt32NoTag(int i)
			throws IOException
		{
			if(i >= 0)
		//*   0    0:iload_1         
		//*   1    1:iflt            10
			{
				writeUInt32NoTag(i);
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:invokevirtual   #105 <Method void writeUInt32NoTag(int)>
				return;
		//    5    9:return          
			} else
			{
				writeUInt64NoTag(i);
		//    6   10:aload_0         
		//    7   11:iload_1         
		//    8   12:i2l             
		//    9   13:invokevirtual   #147 <Method void writeUInt64NoTag(long)>
				return;
		//   10   16:return          
			}
		}

		public final void writeLazy(ByteBuffer bytebuffer)
			throws IOException
		{
			write(bytebuffer);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #150 <Method void write(ByteBuffer)>
		//    3    5:return          
		}

		public final void writeLazy(byte abyte0[], int i, int j)
			throws IOException
		{
			write(abyte0, i, j);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:iload_3         
		//    4    4:invokevirtual   #107 <Method void write(byte[], int, int)>
		//    5    7:return          
		}

		public final void writeMessage(int i, MessageLite messagelite)
			throws IOException
		{
			writeTag(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
			writeMessageNoTag(messagelite);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #156 <Method void writeMessageNoTag(MessageLite)>
		//    7   11:return          
		}

		public final void writeMessageNoTag(MessageLite messagelite)
			throws IOException
		{
			writeUInt32NoTag(messagelite.getSerializedSize());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokeinterface #161 <Method int MessageLite.getSerializedSize()>
		//    3    7:invokevirtual   #105 <Method void writeUInt32NoTag(int)>
			messagelite.writeTo(((CodedOutputStream) (this)));
		//    4   10:aload_1         
		//    5   11:aload_0         
		//    6   12:invokeinterface #164 <Method void MessageLite.writeTo(CodedOutputStream)>
		//    7   17:return          
		}

		public final void writeMessageSetExtension(int i, MessageLite messagelite)
			throws IOException
		{
			writeTag(1, 3);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:iconst_3        
		//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
			writeUInt32(2, i);
		//    4    6:aload_0         
		//    5    7:iconst_2        
		//    6    8:iload_1         
		//    7    9:invokevirtual   #168 <Method void writeUInt32(int, int)>
			writeMessage(3, messagelite);
		//    8   12:aload_0         
		//    9   13:iconst_3        
		//   10   14:aload_2         
		//   11   15:invokevirtual   #170 <Method void writeMessage(int, MessageLite)>
			writeTag(1, 4);
		//   12   18:aload_0         
		//   13   19:iconst_1        
		//   14   20:iconst_4        
		//   15   21:invokevirtual   #91  <Method void writeTag(int, int)>
		//   16   24:return          
		}

		public final void writeRawBytes(ByteBuffer bytebuffer)
			throws IOException
		{
			if(bytebuffer.hasArray())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #174 <Method boolean ByteBuffer.hasArray()>
		//*   2    4:ifeq            24
			{
				write(bytebuffer.array(), bytebuffer.arrayOffset(), bytebuffer.capacity());
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:invokevirtual   #178 <Method byte[] ByteBuffer.array()>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #181 <Method int ByteBuffer.arrayOffset()>
		//    8   16:aload_1         
		//    9   17:invokevirtual   #112 <Method int ByteBuffer.capacity()>
		//   10   20:invokevirtual   #107 <Method void write(byte[], int, int)>
				return;
		//   11   23:return          
			} else
			{
				bytebuffer = bytebuffer.duplicate();
		//   12   24:aload_1         
		//   13   25:invokevirtual   #185 <Method ByteBuffer ByteBuffer.duplicate()>
		//   14   28:astore_1        
				bytebuffer.clear();
		//   15   29:aload_1         
		//   16   30:invokevirtual   #189 <Method java.nio.Buffer ByteBuffer.clear()>
		//   17   33:pop             
				write(bytebuffer);
		//   18   34:aload_0         
		//   19   35:aload_1         
		//   20   36:invokevirtual   #150 <Method void write(ByteBuffer)>
				return;
		//   21   39:return          
			}
		}

		public final void writeRawMessageSetExtension(int i, ByteString bytestring)
			throws IOException
		{
			writeTag(1, 3);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:iconst_3        
		//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
			writeUInt32(2, i);
		//    4    6:aload_0         
		//    5    7:iconst_2        
		//    6    8:iload_1         
		//    7    9:invokevirtual   #168 <Method void writeUInt32(int, int)>
			writeBytes(3, bytestring);
		//    8   12:aload_0         
		//    9   13:iconst_3        
		//   10   14:aload_2         
		//   11   15:invokevirtual   #192 <Method void writeBytes(int, ByteString)>
			writeTag(1, 4);
		//   12   18:aload_0         
		//   13   19:iconst_1        
		//   14   20:iconst_4        
		//   15   21:invokevirtual   #91  <Method void writeTag(int, int)>
		//   16   24:return          
		}

		public final void writeString(int i, String s)
			throws IOException
		{
			writeTag(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
			writeStringNoTag(s);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #197 <Method void writeStringNoTag(String)>
		//    7   11:return          
		}

		public final void writeStringNoTag(String s)
			throws IOException
		{
			int i = position;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field int position>
		//    2    4:istore_2        
			int j;
			int k;
			try
			{
				k = computeUInt32SizeNoTag(s.length() * 3);
		//    3    5:aload_1         
		//    4    6:invokevirtual   #202 <Method int String.length()>
		//    5    9:iconst_3        
		//    6   10:imul            
		//    7   11:invokestatic    #206 <Method int computeUInt32SizeNoTag(int)>
		//    8   14:istore          4
				j = computeUInt32SizeNoTag(s.length());
		//    9   16:aload_1         
		//   10   17:invokevirtual   #202 <Method int String.length()>
		//   11   20:invokestatic    #206 <Method int computeUInt32SizeNoTag(int)>
		//   12   23:istore_3        
			}
		//*  13   24:iload_3         
		//*  14   25:iload           4
		//*  15   27:icmpne          79
		//*  16   30:aload_0         
		//*  17   31:iload_2         
		//*  18   32:iload_3         
		//*  19   33:iadd            
		//*  20   34:putfield        #47  <Field int position>
		//*  21   37:aload_1         
		//*  22   38:aload_0         
		//*  23   39:getfield        #43  <Field byte[] buffer>
		//*  24   42:aload_0         
		//*  25   43:getfield        #47  <Field int position>
		//*  26   46:aload_0         
		//*  27   47:invokevirtual   #208 <Method int spaceLeft()>
		//*  28   50:invokestatic    #214 <Method int Utf8.encode(CharSequence, byte[], int, int)>
		//*  29   53:istore          4
		//*  30   55:aload_0         
		//*  31   56:iload_2         
		//*  32   57:putfield        #47  <Field int position>
		//*  33   60:aload_0         
		//*  34   61:iload           4
		//*  35   63:iload_2         
		//*  36   64:isub            
		//*  37   65:iload_3         
		//*  38   66:isub            
		//*  39   67:invokevirtual   #105 <Method void writeUInt32NoTag(int)>
		//*  40   70:aload_0         
		//*  41   71:iload           4
		//*  42   73:putfield        #47  <Field int position>
		//*  43   76:goto            107
		//*  44   79:aload_0         
		//*  45   80:aload_1         
		//*  46   81:invokestatic    #218 <Method int Utf8.encodedLength(CharSequence)>
		//*  47   84:invokevirtual   #105 <Method void writeUInt32NoTag(int)>
		//*  48   87:aload_0         
		//*  49   88:aload_1         
		//*  50   89:aload_0         
		//*  51   90:getfield        #43  <Field byte[] buffer>
		//*  52   93:aload_0         
		//*  53   94:getfield        #47  <Field int position>
		//*  54   97:aload_0         
		//*  55   98:invokevirtual   #208 <Method int spaceLeft()>
		//*  56  101:invokestatic    #214 <Method int Utf8.encode(CharSequence, byte[], int, int)>
		//*  57  104:putfield        #47  <Field int position>
		//*  58  107:return          
			catch(Utf8.UnpairedSurrogateException unpairedsurrogateexception)
		//*  59  108:astore          5
			{
				position = i;
		//   60  110:aload_0         
		//   61  111:iload_2         
		//   62  112:putfield        #47  <Field int position>
				inefficientWriteStringNoTag(s, unpairedsurrogateexception);
		//   63  115:aload_0         
		//   64  116:aload_1         
		//   65  117:aload           5
		//   66  119:invokevirtual   #222 <Method void inefficientWriteStringNoTag(String, Utf8$UnpairedSurrogateException)>
				return;
		//   67  122:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
		//*  68  123:astore_1        
			{
				throw new OutOfSpaceException(((Throwable) (s)));
		//   69  124:new             #63  <Class CodedOutputStream$OutOfSpaceException>
		//   70  127:dup             
		//   71  128:aload_1         
		//   72  129:invokespecial   #225 <Method void CodedOutputStream$OutOfSpaceException(Throwable)>
		//   73  132:athrow          
			}
			if(j != k)
				break MISSING_BLOCK_LABEL_79;
			position = i + j;
			k = Utf8.encode(((CharSequence) (s)), buffer, position, spaceLeft());
			position = i;
			writeUInt32NoTag(k - i - j);
			position = k;
			break MISSING_BLOCK_LABEL_107;
			writeUInt32NoTag(Utf8.encodedLength(((CharSequence) (s))));
			position = Utf8.encode(((CharSequence) (s)), buffer, position, spaceLeft());
		}

		public final void writeTag(int i, int j)
			throws IOException
		{
			writeUInt32NoTag(WireFormat.makeTag(i, j));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokestatic    #231 <Method int WireFormat.makeTag(int, int)>
		//    4    6:invokevirtual   #105 <Method void writeUInt32NoTag(int)>
		//    5    9:return          
		}

		public final void writeUInt32(int i, int j)
			throws IOException
		{
			writeTag(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
			writeUInt32NoTag(j);
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:invokevirtual   #105 <Method void writeUInt32NoTag(int)>
		//    7   11:return          
		}

		public final void writeUInt32NoTag(int i)
			throws IOException
		{
			int j;
			j = i;
		//    0    0:iload_1         
		//    1    1:istore_2        
			if(CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS)
		//*   2    2:invokestatic    #234 <Method boolean CodedOutputStream.access$100()>
		//*   3    5:ifeq            92
			{
				j = i;
		//    4    8:iload_1         
		//    5    9:istore_2        
				if(spaceLeft() >= 10)
		//*   6   10:aload_0         
		//*   7   11:invokevirtual   #208 <Method int spaceLeft()>
		//*   8   14:bipush          10
		//*   9   16:icmplt          92
					do
					{
						if((i & 0xffffff80) == 0)
		//*  10   19:iload_1         
		//*  11   20:bipush          -128
		//*  12   22:iand            
		//*  13   23:ifne            52
						{
							byte abyte0[] = buffer;
		//   14   26:aload_0         
		//   15   27:getfield        #43  <Field byte[] buffer>
		//   16   30:astore_3        
							j = position;
		//   17   31:aload_0         
		//   18   32:getfield        #47  <Field int position>
		//   19   35:istore_2        
							position = j + 1;
		//   20   36:aload_0         
		//   21   37:iload_2         
		//   22   38:iconst_1        
		//   23   39:iadd            
		//   24   40:putfield        #47  <Field int position>
							UnsafeUtil.putByte(abyte0, j, (byte)i);
		//   25   43:aload_3         
		//   26   44:iload_2         
		//   27   45:i2l             
		//   28   46:iload_1         
		//   29   47:int2byte        
		//   30   48:invokestatic    #240 <Method void UnsafeUtil.putByte(byte[], long, byte)>
							return;
		//   31   51:return          
						}
						byte abyte1[] = buffer;
		//   32   52:aload_0         
		//   33   53:getfield        #43  <Field byte[] buffer>
		//   34   56:astore_3        
						j = position;
		//   35   57:aload_0         
		//   36   58:getfield        #47  <Field int position>
		//   37   61:istore_2        
						position = j + 1;
		//   38   62:aload_0         
		//   39   63:iload_2         
		//   40   64:iconst_1        
		//   41   65:iadd            
		//   42   66:putfield        #47  <Field int position>
						UnsafeUtil.putByte(abyte1, j, (byte)(i & 0x7f | 0x80));
		//   43   69:aload_3         
		//   44   70:iload_2         
		//   45   71:i2l             
		//   46   72:iload_1         
		//   47   73:bipush          127
		//   48   75:iand            
		//   49   76:sipush          128
		//   50   79:ior             
		//   51   80:int2byte        
		//   52   81:invokestatic    #240 <Method void UnsafeUtil.putByte(byte[], long, byte)>
						i >>>= 7;
		//   53   84:iload_1         
		//   54   85:bipush          7
		//   55   87:iushr           
		//   56   88:istore_1        
					} while(true);
		//   57   89:goto            19
			}
_L1:
			if((j & 0xffffff80) == 0)
		//*  58   92:iload_2         
		//*  59   93:bipush          -128
		//*  60   95:iand            
		//*  61   96:ifne            122
			{
				byte abyte2[];
				try
				{
					abyte2 = buffer;
		//   62   99:aload_0         
		//   63  100:getfield        #43  <Field byte[] buffer>
		//   64  103:astore_3        
					i = position;
		//   65  104:aload_0         
		//   66  105:getfield        #47  <Field int position>
		//   67  108:istore_1        
					position = i + 1;
		//   68  109:aload_0         
		//   69  110:iload_1         
		//   70  111:iconst_1        
		//   71  112:iadd            
		//   72  113:putfield        #47  <Field int position>
				}
		//*  73  116:aload_3         
		//*  74  117:iload_1         
		//*  75  118:iload_2         
		//*  76  119:int2byte        
		//*  77  120:bastore         
		//*  78  121:return          
		//*  79  122:aload_0         
		//*  80  123:getfield        #43  <Field byte[] buffer>
		//*  81  126:astore_3        
		//*  82  127:aload_0         
		//*  83  128:getfield        #47  <Field int position>
		//*  84  131:istore_1        
		//*  85  132:aload_0         
		//*  86  133:iload_1         
		//*  87  134:iconst_1        
		//*  88  135:iadd            
		//*  89  136:putfield        #47  <Field int position>
		//*  90  139:aload_3         
		//*  91  140:iload_1         
		//*  92  141:iload_2         
		//*  93  142:bipush          127
		//*  94  144:iand            
		//*  95  145:sipush          128
		//*  96  148:ior             
		//*  97  149:int2byte        
		//*  98  150:bastore         
		//*  99  151:iload_2         
		//* 100  152:bipush          7
		//* 101  154:iushr           
		//* 102  155:istore_2        
		//* 103  156:goto            92
				catch(IndexOutOfBoundsException indexoutofboundsexception)
		//* 104  159:astore_3        
				{
					throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
						Integer.valueOf(position), Integer.valueOf(limit), Integer.valueOf(1)
					}), ((Throwable) (indexoutofboundsexception)));
		//  105  160:new             #63  <Class CodedOutputStream$OutOfSpaceException>
		//  106  163:dup             
		//  107  164:ldc1            #65  <String "Pos: %d, limit: %d, len: %d">
		//  108  166:iconst_3        
		//  109  167:anewarray       Object[]
		//  110  170:dup             
		//  111  171:iconst_0        
		//  112  172:aload_0         
		//  113  173:getfield        #47  <Field int position>
		//  114  176:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//  115  179:aastore         
		//  116  180:dup             
		//  117  181:iconst_1        
		//  118  182:aload_0         
		//  119  183:getfield        #49  <Field int limit>
		//  120  186:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//  121  189:aastore         
		//  122  190:dup             
		//  123  191:iconst_2        
		//  124  192:iconst_1        
		//  125  193:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//  126  196:aastore         
		//  127  197:invokestatic    #40  <Method String String.format(String, Object[])>
		//  128  200:aload_3         
		//  129  201:invokespecial   #68  <Method void CodedOutputStream$OutOfSpaceException(String, Throwable)>
		//  130  204:athrow          
				}
				abyte2[i] = (byte)j;
				return;
			}
			abyte2 = buffer;
			i = position;
			position = i + 1;
			abyte2[i] = (byte)(j & 0x7f | 0x80);
			j >>>= 7;
			  goto _L1
		}

		public final void writeUInt64(int i, long l)
			throws IOException
		{
			writeTag(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
			writeUInt64NoTag(l);
		//    4    6:aload_0         
		//    5    7:lload_2         
		//    6    8:invokevirtual   #147 <Method void writeUInt64NoTag(long)>
		//    7   11:return          
		}

		public final void writeUInt64NoTag(long l)
			throws IOException
		{
			long l1;
			l1 = l;
		//    0    0:lload_1         
		//    1    1:lstore          4
			if(CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS)
		//*   2    3:invokestatic    #234 <Method boolean CodedOutputStream.access$100()>
		//*   3    6:ifeq            103
			{
				l1 = l;
		//    4    9:lload_1         
		//    5   10:lstore          4
				if(spaceLeft() >= 10)
		//*   6   12:aload_0         
		//*   7   13:invokevirtual   #208 <Method int spaceLeft()>
		//*   8   16:bipush          10
		//*   9   18:icmplt          103
					do
					{
						if((-128L & l) == 0L)
		//*  10   21:ldc2w           #242 <Long -128L>
		//*  11   24:lload_1         
		//*  12   25:land            
		//*  13   26:lconst_0        
		//*  14   27:lcmp            
		//*  15   28:ifne            60
						{
							byte abyte0[] = buffer;
		//   16   31:aload_0         
		//   17   32:getfield        #43  <Field byte[] buffer>
		//   18   35:astore          6
							int i = position;
		//   19   37:aload_0         
		//   20   38:getfield        #47  <Field int position>
		//   21   41:istore_3        
							position = i + 1;
		//   22   42:aload_0         
		//   23   43:iload_3         
		//   24   44:iconst_1        
		//   25   45:iadd            
		//   26   46:putfield        #47  <Field int position>
							UnsafeUtil.putByte(abyte0, i, (byte)(int)l);
		//   27   49:aload           6
		//   28   51:iload_3         
		//   29   52:i2l             
		//   30   53:lload_1         
		//   31   54:l2i             
		//   32   55:int2byte        
		//   33   56:invokestatic    #240 <Method void UnsafeUtil.putByte(byte[], long, byte)>
							return;
		//   34   59:return          
						}
						byte abyte1[] = buffer;
		//   35   60:aload_0         
		//   36   61:getfield        #43  <Field byte[] buffer>
		//   37   64:astore          6
						int j = position;
		//   38   66:aload_0         
		//   39   67:getfield        #47  <Field int position>
		//   40   70:istore_3        
						position = j + 1;
		//   41   71:aload_0         
		//   42   72:iload_3         
		//   43   73:iconst_1        
		//   44   74:iadd            
		//   45   75:putfield        #47  <Field int position>
						UnsafeUtil.putByte(abyte1, j, (byte)((int)l & 0x7f | 0x80));
		//   46   78:aload           6
		//   47   80:iload_3         
		//   48   81:i2l             
		//   49   82:lload_1         
		//   50   83:l2i             
		//   51   84:bipush          127
		//   52   86:iand            
		//   53   87:sipush          128
		//   54   90:ior             
		//   55   91:int2byte        
		//   56   92:invokestatic    #240 <Method void UnsafeUtil.putByte(byte[], long, byte)>
						l >>>= 7;
		//   57   95:lload_1         
		//   58   96:bipush          7
		//   59   98:lushr           
		//   60   99:lstore_1        
					} while(true);
		//   61  100:goto            21
			}
_L1:
			if((-128L & l1) == 0L)
		//*  62  103:ldc2w           #242 <Long -128L>
		//*  63  106:lload           4
		//*  64  108:land            
		//*  65  109:lconst_0        
		//*  66  110:lcmp            
		//*  67  111:ifne            141
			{
				int k;
				byte abyte2[];
				try
				{
					abyte2 = buffer;
		//   68  114:aload_0         
		//   69  115:getfield        #43  <Field byte[] buffer>
		//   70  118:astore          6
					k = position;
		//   71  120:aload_0         
		//   72  121:getfield        #47  <Field int position>
		//   73  124:istore_3        
					position = k + 1;
		//   74  125:aload_0         
		//   75  126:iload_3         
		//   76  127:iconst_1        
		//   77  128:iadd            
		//   78  129:putfield        #47  <Field int position>
				}
		//*  79  132:aload           6
		//*  80  134:iload_3         
		//*  81  135:lload           4
		//*  82  137:l2i             
		//*  83  138:int2byte        
		//*  84  139:bastore         
		//*  85  140:return          
		//*  86  141:aload_0         
		//*  87  142:getfield        #43  <Field byte[] buffer>
		//*  88  145:astore          6
		//*  89  147:aload_0         
		//*  90  148:getfield        #47  <Field int position>
		//*  91  151:istore_3        
		//*  92  152:aload_0         
		//*  93  153:iload_3         
		//*  94  154:iconst_1        
		//*  95  155:iadd            
		//*  96  156:putfield        #47  <Field int position>
		//*  97  159:aload           6
		//*  98  161:iload_3         
		//*  99  162:lload           4
		//* 100  164:l2i             
		//* 101  165:bipush          127
		//* 102  167:iand            
		//* 103  168:sipush          128
		//* 104  171:ior             
		//* 105  172:int2byte        
		//* 106  173:bastore         
		//* 107  174:lload           4
		//* 108  176:bipush          7
		//* 109  178:lushr           
		//* 110  179:lstore          4
		//* 111  181:goto            103
				catch(IndexOutOfBoundsException indexoutofboundsexception)
		//* 112  184:astore          6
				{
					throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
						Integer.valueOf(position), Integer.valueOf(limit), Integer.valueOf(1)
					}), ((Throwable) (indexoutofboundsexception)));
		//  113  186:new             #63  <Class CodedOutputStream$OutOfSpaceException>
		//  114  189:dup             
		//  115  190:ldc1            #65  <String "Pos: %d, limit: %d, len: %d">
		//  116  192:iconst_3        
		//  117  193:anewarray       Object[]
		//  118  196:dup             
		//  119  197:iconst_0        
		//  120  198:aload_0         
		//  121  199:getfield        #47  <Field int position>
		//  122  202:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//  123  205:aastore         
		//  124  206:dup             
		//  125  207:iconst_1        
		//  126  208:aload_0         
		//  127  209:getfield        #49  <Field int limit>
		//  128  212:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//  129  215:aastore         
		//  130  216:dup             
		//  131  217:iconst_2        
		//  132  218:iconst_1        
		//  133  219:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//  134  222:aastore         
		//  135  223:invokestatic    #40  <Method String String.format(String, Object[])>
		//  136  226:aload           6
		//  137  228:invokespecial   #68  <Method void CodedOutputStream$OutOfSpaceException(String, Throwable)>
		//  138  231:athrow          
				}
				abyte2[k] = (byte)(int)l1;
				return;
			}
			abyte2 = buffer;
			k = position;
			position = k + 1;
			abyte2[k] = (byte)((int)l1 & 0x7f | 0x80);
			l1 >>>= 7;
			  goto _L1
		}

		private final byte buffer[];
		private final int limit;
		private final int offset;
		private int position;

		ArrayEncoder(byte abyte0[], int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #16  <Method void CodedOutputStream(CodedOutputStream$1)>
			if(abyte0 == null)
		//*   3    5:aload_1         
		//*   4    6:ifnonnull       19
				throw new NullPointerException("buffer");
		//    5    9:new             #18  <Class NullPointerException>
		//    6   12:dup             
		//    7   13:ldc1            #19  <String "buffer">
		//    8   15:invokespecial   #22  <Method void NullPointerException(String)>
		//    9   18:athrow          
			if((i | j | abyte0.length - (i + j)) < 0)
		//*  10   19:iload_2         
		//*  11   20:iload_3         
		//*  12   21:ior             
		//*  13   22:aload_1         
		//*  14   23:arraylength     
		//*  15   24:iload_2         
		//*  16   25:iload_3         
		//*  17   26:iadd            
		//*  18   27:isub            
		//*  19   28:ior             
		//*  20   29:ifge            71
			{
				throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[] {
					Integer.valueOf(abyte0.length), Integer.valueOf(i), Integer.valueOf(j)
				}));
		//   21   32:new             #24  <Class IllegalArgumentException>
		//   22   35:dup             
		//   23   36:ldc1            #26  <String "Array range is invalid. Buffer.length=%d, offset=%d, length=%d">
		//   24   38:iconst_3        
		//   25   39:anewarray       Object[]
		//   26   42:dup             
		//   27   43:iconst_0        
		//   28   44:aload_1         
		//   29   45:arraylength     
		//   30   46:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//   31   49:aastore         
		//   32   50:dup             
		//   33   51:iconst_1        
		//   34   52:iload_2         
		//   35   53:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//   36   56:aastore         
		//   37   57:dup             
		//   38   58:iconst_2        
		//   39   59:iload_3         
		//   40   60:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//   41   63:aastore         
		//   42   64:invokestatic    #40  <Method String String.format(String, Object[])>
		//   43   67:invokespecial   #41  <Method void IllegalArgumentException(String)>
		//   44   70:athrow          
			} else
			{
				buffer = abyte0;
		//   45   71:aload_0         
		//   46   72:aload_1         
		//   47   73:putfield        #43  <Field byte[] buffer>
				offset = i;
		//   48   76:aload_0         
		//   49   77:iload_2         
		//   50   78:putfield        #45  <Field int offset>
				position = i;
		//   51   81:aload_0         
		//   52   82:iload_2         
		//   53   83:putfield        #47  <Field int position>
				limit = i + j;
		//   54   86:aload_0         
		//   55   87:iload_2         
		//   56   88:iload_3         
		//   57   89:iadd            
		//   58   90:putfield        #49  <Field int limit>
				return;
		//   59   93:return          
			}
		}
	}

	static final class ByteOutputEncoder extends AbstractBufferedEncoder
	{

		private void doFlush()
			throws IOException
		{
			out.write(buffer, 0, position);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field ByteOutput out>
		//    2    4:aload_0         
		//    3    5:getfield        #31  <Field byte[] buffer>
		//    4    8:iconst_0        
		//    5    9:aload_0         
		//    6   10:getfield        #35  <Field int position>
		//    7   13:invokevirtual   #41  <Method void ByteOutput.write(byte[], int, int)>
			position = 0;
		//    8   16:aload_0         
		//    9   17:iconst_0        
		//   10   18:putfield        #35  <Field int position>
		//   11   21:return          
		}

		private void flushIfNotAvailable(int i)
			throws IOException
		{
			if(limit - position < i)
		//*   0    0:aload_0         
		//*   1    1:getfield        #46  <Field int limit>
		//*   2    4:aload_0         
		//*   3    5:getfield        #35  <Field int position>
		//*   4    8:isub            
		//*   5    9:iload_1         
		//*   6   10:icmpge          17
				doFlush();
		//    7   13:aload_0         
		//    8   14:invokespecial   #48  <Method void doFlush()>
		//    9   17:return          
		}

		public void flush()
			throws IOException
		{
			if(position > 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #35  <Field int position>
		//*   2    4:ifle            11
				doFlush();
		//    3    7:aload_0         
		//    4    8:invokespecial   #48  <Method void doFlush()>
		//    5   11:return          
		}

		public void write(byte byte0)
			throws IOException
		{
			if(position == limit)
		//*   0    0:aload_0         
		//*   1    1:getfield        #35  <Field int position>
		//*   2    4:aload_0         
		//*   3    5:getfield        #46  <Field int limit>
		//*   4    8:icmpne          15
				doFlush();
		//    5   11:aload_0         
		//    6   12:invokespecial   #48  <Method void doFlush()>
			buffer(byte0);
		//    7   15:aload_0         
		//    8   16:iload_1         
		//    9   17:invokevirtual   #52  <Method void buffer(byte)>
		//   10   20:return          
		}

		public void write(ByteBuffer bytebuffer)
			throws IOException
		{
			flush();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #55  <Method void flush()>
			int i = bytebuffer.remaining();
		//    2    4:aload_1         
		//    3    5:invokevirtual   #61  <Method int ByteBuffer.remaining()>
		//    4    8:istore_2        
			out.write(bytebuffer);
		//    5    9:aload_0         
		//    6   10:getfield        #22  <Field ByteOutput out>
		//    7   13:aload_1         
		//    8   14:invokevirtual   #63  <Method void ByteOutput.write(ByteBuffer)>
			totalBytesWritten = totalBytesWritten + i;
		//    9   17:aload_0         
		//   10   18:aload_0         
		//   11   19:getfield        #66  <Field int totalBytesWritten>
		//   12   22:iload_2         
		//   13   23:iadd            
		//   14   24:putfield        #66  <Field int totalBytesWritten>
		//   15   27:return          
		}

		public void write(byte abyte0[], int i, int j)
			throws IOException
		{
			flush();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #55  <Method void flush()>
			out.write(abyte0, i, j);
		//    2    4:aload_0         
		//    3    5:getfield        #22  <Field ByteOutput out>
		//    4    8:aload_1         
		//    5    9:iload_2         
		//    6   10:iload_3         
		//    7   11:invokevirtual   #41  <Method void ByteOutput.write(byte[], int, int)>
			totalBytesWritten = totalBytesWritten + j;
		//    8   14:aload_0         
		//    9   15:aload_0         
		//   10   16:getfield        #66  <Field int totalBytesWritten>
		//   11   19:iload_3         
		//   12   20:iadd            
		//   13   21:putfield        #66  <Field int totalBytesWritten>
		//   14   24:return          
		}

		public void writeBool(int i, boolean flag)
			throws IOException
		{
			flushIfNotAvailable(11);
		//    0    0:aload_0         
		//    1    1:bipush          11
		//    2    3:invokespecial   #70  <Method void flushIfNotAvailable(int)>
			bufferTag(i, 0);
		//    3    6:aload_0         
		//    4    7:iload_1         
		//    5    8:iconst_0        
		//    6    9:invokevirtual   #74  <Method void bufferTag(int, int)>
			if(flag)
		//*   7   12:iload_2         
		//*   8   13:ifeq            21
				i = 1;
		//    9   16:iconst_1        
		//   10   17:istore_1        
			else
		//*  11   18:goto            23
				i = 0;
		//   12   21:iconst_0        
		//   13   22:istore_1        
			buffer((byte)i);
		//   14   23:aload_0         
		//   15   24:iload_1         
		//   16   25:int2byte        
		//   17   26:invokevirtual   #52  <Method void buffer(byte)>
		//   18   29:return          
		}

		public void writeByteArray(int i, byte abyte0[])
			throws IOException
		{
			writeByteArray(i, abyte0, 0, abyte0.length);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:iconst_0        
		//    4    4:aload_2         
		//    5    5:arraylength     
		//    6    6:invokevirtual   #79  <Method void writeByteArray(int, byte[], int, int)>
		//    7    9:return          
		}

		public void writeByteArray(int i, byte abyte0[], int j, int k)
			throws IOException
		{
			writeTag(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #82  <Method void writeTag(int, int)>
			writeByteArrayNoTag(abyte0, j, k);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:iload_3         
		//    7    9:iload           4
		//    8   11:invokevirtual   #85  <Method void writeByteArrayNoTag(byte[], int, int)>
		//    9   14:return          
		}

		public void writeByteArrayNoTag(byte abyte0[], int i, int j)
			throws IOException
		{
			writeUInt32NoTag(j);
		//    0    0:aload_0         
		//    1    1:iload_3         
		//    2    2:invokevirtual   #88  <Method void writeUInt32NoTag(int)>
			write(abyte0, i, j);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:iload_2         
		//    6    8:iload_3         
		//    7    9:invokevirtual   #89  <Method void write(byte[], int, int)>
		//    8   12:return          
		}

		public void writeByteBuffer(int i, ByteBuffer bytebuffer)
			throws IOException
		{
			writeTag(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #82  <Method void writeTag(int, int)>
			writeUInt32NoTag(bytebuffer.capacity());
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #94  <Method int ByteBuffer.capacity()>
		//    7   11:invokevirtual   #88  <Method void writeUInt32NoTag(int)>
			writeRawBytes(bytebuffer);
		//    8   14:aload_0         
		//    9   15:aload_2         
		//   10   16:invokevirtual   #97  <Method void writeRawBytes(ByteBuffer)>
		//   11   19:return          
		}

		public void writeBytes(int i, ByteString bytestring)
			throws IOException
		{
			writeTag(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #82  <Method void writeTag(int, int)>
			writeBytesNoTag(bytestring);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #103 <Method void writeBytesNoTag(ByteString)>
		//    7   11:return          
		}

		public void writeBytesNoTag(ByteString bytestring)
			throws IOException
		{
			writeUInt32NoTag(bytestring.size());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #108 <Method int ByteString.size()>
		//    3    5:invokevirtual   #88  <Method void writeUInt32NoTag(int)>
			bytestring.writeTo(((ByteOutput) (this)));
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:invokevirtual   #112 <Method void ByteString.writeTo(ByteOutput)>
		//    7   13:return          
		}

		public void writeFixed32(int i, int j)
			throws IOException
		{
			flushIfNotAvailable(14);
		//    0    0:aload_0         
		//    1    1:bipush          14
		//    2    3:invokespecial   #70  <Method void flushIfNotAvailable(int)>
			bufferTag(i, 5);
		//    3    6:aload_0         
		//    4    7:iload_1         
		//    5    8:iconst_5        
		//    6    9:invokevirtual   #74  <Method void bufferTag(int, int)>
			bufferFixed32NoTag(j);
		//    7   12:aload_0         
		//    8   13:iload_2         
		//    9   14:invokevirtual   #116 <Method void bufferFixed32NoTag(int)>
		//   10   17:return          
		}

		public void writeFixed32NoTag(int i)
			throws IOException
		{
			flushIfNotAvailable(4);
		//    0    0:aload_0         
		//    1    1:iconst_4        
		//    2    2:invokespecial   #70  <Method void flushIfNotAvailable(int)>
			bufferFixed32NoTag(i);
		//    3    5:aload_0         
		//    4    6:iload_1         
		//    5    7:invokevirtual   #116 <Method void bufferFixed32NoTag(int)>
		//    6   10:return          
		}

		public void writeFixed64(int i, long l)
			throws IOException
		{
			flushIfNotAvailable(18);
		//    0    0:aload_0         
		//    1    1:bipush          18
		//    2    3:invokespecial   #70  <Method void flushIfNotAvailable(int)>
			bufferTag(i, 1);
		//    3    6:aload_0         
		//    4    7:iload_1         
		//    5    8:iconst_1        
		//    6    9:invokevirtual   #74  <Method void bufferTag(int, int)>
			bufferFixed64NoTag(l);
		//    7   12:aload_0         
		//    8   13:lload_2         
		//    9   14:invokevirtual   #123 <Method void bufferFixed64NoTag(long)>
		//   10   17:return          
		}

		public void writeFixed64NoTag(long l)
			throws IOException
		{
			flushIfNotAvailable(8);
		//    0    0:aload_0         
		//    1    1:bipush          8
		//    2    3:invokespecial   #70  <Method void flushIfNotAvailable(int)>
			bufferFixed64NoTag(l);
		//    3    6:aload_0         
		//    4    7:lload_1         
		//    5    8:invokevirtual   #123 <Method void bufferFixed64NoTag(long)>
		//    6   11:return          
		}

		public void writeInt32(int i, int j)
			throws IOException
		{
			flushIfNotAvailable(20);
		//    0    0:aload_0         
		//    1    1:bipush          20
		//    2    3:invokespecial   #70  <Method void flushIfNotAvailable(int)>
			bufferTag(i, 0);
		//    3    6:aload_0         
		//    4    7:iload_1         
		//    5    8:iconst_0        
		//    6    9:invokevirtual   #74  <Method void bufferTag(int, int)>
			bufferInt32NoTag(j);
		//    7   12:aload_0         
		//    8   13:iload_2         
		//    9   14:invokevirtual   #128 <Method void bufferInt32NoTag(int)>
		//   10   17:return          
		}

		public void writeInt32NoTag(int i)
			throws IOException
		{
			if(i >= 0)
		//*   0    0:iload_1         
		//*   1    1:iflt            10
			{
				writeUInt32NoTag(i);
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:invokevirtual   #88  <Method void writeUInt32NoTag(int)>
				return;
		//    5    9:return          
			} else
			{
				writeUInt64NoTag(i);
		//    6   10:aload_0         
		//    7   11:iload_1         
		//    8   12:i2l             
		//    9   13:invokevirtual   #132 <Method void writeUInt64NoTag(long)>
				return;
		//   10   16:return          
			}
		}

		public void writeLazy(ByteBuffer bytebuffer)
			throws IOException
		{
			flush();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #55  <Method void flush()>
			int i = bytebuffer.remaining();
		//    2    4:aload_1         
		//    3    5:invokevirtual   #61  <Method int ByteBuffer.remaining()>
		//    4    8:istore_2        
			out.writeLazy(bytebuffer);
		//    5    9:aload_0         
		//    6   10:getfield        #22  <Field ByteOutput out>
		//    7   13:aload_1         
		//    8   14:invokevirtual   #135 <Method void ByteOutput.writeLazy(ByteBuffer)>
			totalBytesWritten = totalBytesWritten + i;
		//    9   17:aload_0         
		//   10   18:aload_0         
		//   11   19:getfield        #66  <Field int totalBytesWritten>
		//   12   22:iload_2         
		//   13   23:iadd            
		//   14   24:putfield        #66  <Field int totalBytesWritten>
		//   15   27:return          
		}

		public void writeLazy(byte abyte0[], int i, int j)
			throws IOException
		{
			flush();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #55  <Method void flush()>
			out.writeLazy(abyte0, i, j);
		//    2    4:aload_0         
		//    3    5:getfield        #22  <Field ByteOutput out>
		//    4    8:aload_1         
		//    5    9:iload_2         
		//    6   10:iload_3         
		//    7   11:invokevirtual   #137 <Method void ByteOutput.writeLazy(byte[], int, int)>
			totalBytesWritten = totalBytesWritten + j;
		//    8   14:aload_0         
		//    9   15:aload_0         
		//   10   16:getfield        #66  <Field int totalBytesWritten>
		//   11   19:iload_3         
		//   12   20:iadd            
		//   13   21:putfield        #66  <Field int totalBytesWritten>
		//   14   24:return          
		}

		public void writeMessage(int i, MessageLite messagelite)
			throws IOException
		{
			writeTag(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #82  <Method void writeTag(int, int)>
			writeMessageNoTag(messagelite);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #143 <Method void writeMessageNoTag(MessageLite)>
		//    7   11:return          
		}

		public void writeMessageNoTag(MessageLite messagelite)
			throws IOException
		{
			writeUInt32NoTag(messagelite.getSerializedSize());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokeinterface #148 <Method int MessageLite.getSerializedSize()>
		//    3    7:invokevirtual   #88  <Method void writeUInt32NoTag(int)>
			messagelite.writeTo(((CodedOutputStream) (this)));
		//    4   10:aload_1         
		//    5   11:aload_0         
		//    6   12:invokeinterface #151 <Method void MessageLite.writeTo(CodedOutputStream)>
		//    7   17:return          
		}

		public void writeMessageSetExtension(int i, MessageLite messagelite)
			throws IOException
		{
			writeTag(1, 3);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:iconst_3        
		//    3    3:invokevirtual   #82  <Method void writeTag(int, int)>
			writeUInt32(2, i);
		//    4    6:aload_0         
		//    5    7:iconst_2        
		//    6    8:iload_1         
		//    7    9:invokevirtual   #155 <Method void writeUInt32(int, int)>
			writeMessage(3, messagelite);
		//    8   12:aload_0         
		//    9   13:iconst_3        
		//   10   14:aload_2         
		//   11   15:invokevirtual   #157 <Method void writeMessage(int, MessageLite)>
			writeTag(1, 4);
		//   12   18:aload_0         
		//   13   19:iconst_1        
		//   14   20:iconst_4        
		//   15   21:invokevirtual   #82  <Method void writeTag(int, int)>
		//   16   24:return          
		}

		public void writeRawBytes(ByteBuffer bytebuffer)
			throws IOException
		{
			if(bytebuffer.hasArray())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #161 <Method boolean ByteBuffer.hasArray()>
		//*   2    4:ifeq            24
			{
				write(bytebuffer.array(), bytebuffer.arrayOffset(), bytebuffer.capacity());
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:invokevirtual   #165 <Method byte[] ByteBuffer.array()>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #168 <Method int ByteBuffer.arrayOffset()>
		//    8   16:aload_1         
		//    9   17:invokevirtual   #94  <Method int ByteBuffer.capacity()>
		//   10   20:invokevirtual   #89  <Method void write(byte[], int, int)>
				return;
		//   11   23:return          
			} else
			{
				bytebuffer = bytebuffer.duplicate();
		//   12   24:aload_1         
		//   13   25:invokevirtual   #172 <Method ByteBuffer ByteBuffer.duplicate()>
		//   14   28:astore_1        
				bytebuffer.clear();
		//   15   29:aload_1         
		//   16   30:invokevirtual   #176 <Method java.nio.Buffer ByteBuffer.clear()>
		//   17   33:pop             
				write(bytebuffer);
		//   18   34:aload_0         
		//   19   35:aload_1         
		//   20   36:invokevirtual   #177 <Method void write(ByteBuffer)>
				return;
		//   21   39:return          
			}
		}

		public void writeRawMessageSetExtension(int i, ByteString bytestring)
			throws IOException
		{
			writeTag(1, 3);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:iconst_3        
		//    3    3:invokevirtual   #82  <Method void writeTag(int, int)>
			writeUInt32(2, i);
		//    4    6:aload_0         
		//    5    7:iconst_2        
		//    6    8:iload_1         
		//    7    9:invokevirtual   #155 <Method void writeUInt32(int, int)>
			writeBytes(3, bytestring);
		//    8   12:aload_0         
		//    9   13:iconst_3        
		//   10   14:aload_2         
		//   11   15:invokevirtual   #180 <Method void writeBytes(int, ByteString)>
			writeTag(1, 4);
		//   12   18:aload_0         
		//   13   19:iconst_1        
		//   14   20:iconst_4        
		//   15   21:invokevirtual   #82  <Method void writeTag(int, int)>
		//   16   24:return          
		}

		public void writeString(int i, String s)
			throws IOException
		{
			writeTag(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #82  <Method void writeTag(int, int)>
			writeStringNoTag(s);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #185 <Method void writeStringNoTag(String)>
		//    7   11:return          
		}

		public void writeStringNoTag(String s)
			throws IOException
		{
			int i = s.length() * 3;
		//    0    0:aload_1         
		//    1    1:invokevirtual   #194 <Method int String.length()>
		//    2    4:iconst_3        
		//    3    5:imul            
		//    4    6:istore_2        
			int j = computeUInt32SizeNoTag(i);
		//    5    7:iload_2         
		//    6    8:invokestatic    #198 <Method int computeUInt32SizeNoTag(int)>
		//    7   11:istore_3        
			if(j + i > limit)
		//*   8   12:iload_3         
		//*   9   13:iload_2         
		//*  10   14:iadd            
		//*  11   15:aload_0         
		//*  12   16:getfield        #46  <Field int limit>
		//*  13   19:icmple          50
			{
				byte abyte0[] = new byte[i];
		//   14   22:iload_2         
		//   15   23:newarray        byte[]
		//   16   25:astore          5
				i = Utf8.encode(((CharSequence) (s)), abyte0, 0, i);
		//   17   27:aload_1         
		//   18   28:aload           5
		//   19   30:iconst_0        
		//   20   31:iload_2         
		//   21   32:invokestatic    #204 <Method int Utf8.encode(CharSequence, byte[], int, int)>
		//   22   35:istore_2        
				writeUInt32NoTag(i);
		//   23   36:aload_0         
		//   24   37:iload_2         
		//   25   38:invokevirtual   #88  <Method void writeUInt32NoTag(int)>
				writeLazy(abyte0, 0, i);
		//   26   41:aload_0         
		//   27   42:aload           5
		//   28   44:iconst_0        
		//   29   45:iload_2         
		//   30   46:invokevirtual   #205 <Method void writeLazy(byte[], int, int)>
				return;
		//   31   49:return          
			}
			if(j + i > limit - position)
		//*  32   50:iload_3         
		//*  33   51:iload_2         
		//*  34   52:iadd            
		//*  35   53:aload_0         
		//*  36   54:getfield        #46  <Field int limit>
		//*  37   57:aload_0         
		//*  38   58:getfield        #35  <Field int position>
		//*  39   61:isub            
		//*  40   62:icmple          69
				doFlush();
		//   41   65:aload_0         
		//   42   66:invokespecial   #48  <Method void doFlush()>
			i = position;
		//   43   69:aload_0         
		//   44   70:getfield        #35  <Field int position>
		//   45   73:istore_2        
			int k;
			try
			{
				k = computeUInt32SizeNoTag(s.length());
		//   46   74:aload_1         
		//   47   75:invokevirtual   #194 <Method int String.length()>
		//   48   78:invokestatic    #198 <Method int computeUInt32SizeNoTag(int)>
		//   49   81:istore          4
			}
		//*  50   83:iload           4
		//*  51   85:iload_3         
		//*  52   86:icmpne          157
		//*  53   89:aload_0         
		//*  54   90:iload_2         
		//*  55   91:iload           4
		//*  56   93:iadd            
		//*  57   94:putfield        #35  <Field int position>
		//*  58   97:aload_1         
		//*  59   98:aload_0         
		//*  60   99:getfield        #31  <Field byte[] buffer>
		//*  61  102:aload_0         
		//*  62  103:getfield        #35  <Field int position>
		//*  63  106:aload_0         
		//*  64  107:getfield        #46  <Field int limit>
		//*  65  110:aload_0         
		//*  66  111:getfield        #35  <Field int position>
		//*  67  114:isub            
		//*  68  115:invokestatic    #204 <Method int Utf8.encode(CharSequence, byte[], int, int)>
		//*  69  118:istore_3        
		//*  70  119:aload_0         
		//*  71  120:iload_2         
		//*  72  121:putfield        #35  <Field int position>
		//*  73  124:iload_3         
		//*  74  125:iload_2         
		//*  75  126:isub            
		//*  76  127:iload           4
		//*  77  129:isub            
		//*  78  130:istore          4
		//*  79  132:aload_0         
		//*  80  133:iload           4
		//*  81  135:invokevirtual   #208 <Method void bufferUInt32NoTag(int)>
		//*  82  138:aload_0         
		//*  83  139:iload_3         
		//*  84  140:putfield        #35  <Field int position>
		//*  85  143:aload_0         
		//*  86  144:aload_0         
		//*  87  145:getfield        #66  <Field int totalBytesWritten>
		//*  88  148:iload           4
		//*  89  150:iadd            
		//*  90  151:putfield        #66  <Field int totalBytesWritten>
		//*  91  154:goto            194
		//*  92  157:aload_1         
		//*  93  158:invokestatic    #212 <Method int Utf8.encodedLength(CharSequence)>
		//*  94  161:istore_3        
		//*  95  162:aload_0         
		//*  96  163:iload_3         
		//*  97  164:invokevirtual   #208 <Method void bufferUInt32NoTag(int)>
		//*  98  167:aload_0         
		//*  99  168:aload_1         
		//* 100  169:aload_0         
		//* 101  170:getfield        #31  <Field byte[] buffer>
		//* 102  173:aload_0         
		//* 103  174:getfield        #35  <Field int position>
		//* 104  177:iload_3         
		//* 105  178:invokestatic    #204 <Method int Utf8.encode(CharSequence, byte[], int, int)>
		//* 106  181:putfield        #35  <Field int position>
		//* 107  184:aload_0         
		//* 108  185:aload_0         
		//* 109  186:getfield        #66  <Field int totalBytesWritten>
		//* 110  189:iload_3         
		//* 111  190:iadd            
		//* 112  191:putfield        #66  <Field int totalBytesWritten>
		//* 113  194:return          
			catch(Utf8.UnpairedSurrogateException unpairedsurrogateexception)
		//* 114  195:astore          5
			{
				totalBytesWritten = totalBytesWritten - (position - i);
		//  115  197:aload_0         
		//  116  198:aload_0         
		//  117  199:getfield        #66  <Field int totalBytesWritten>
		//  118  202:aload_0         
		//  119  203:getfield        #35  <Field int position>
		//  120  206:iload_2         
		//  121  207:isub            
		//  122  208:isub            
		//  123  209:putfield        #66  <Field int totalBytesWritten>
				position = i;
		//  124  212:aload_0         
		//  125  213:iload_2         
		//  126  214:putfield        #35  <Field int position>
				inefficientWriteStringNoTag(s, unpairedsurrogateexception);
		//  127  217:aload_0         
		//  128  218:aload_1         
		//  129  219:aload           5
		//  130  221:invokevirtual   #216 <Method void inefficientWriteStringNoTag(String, Utf8$UnpairedSurrogateException)>
				return;
		//  131  224:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
		//* 132  225:astore_1        
			{
				throw new OutOfSpaceException(((Throwable) (s)));
		//  133  226:new             #218 <Class CodedOutputStream$OutOfSpaceException>
		//  134  229:dup             
		//  135  230:aload_1         
		//  136  231:invokespecial   #221 <Method void CodedOutputStream$OutOfSpaceException(Throwable)>
		//  137  234:athrow          
			}
			if(k != j)
				break MISSING_BLOCK_LABEL_157;
			position = i + k;
			j = Utf8.encode(((CharSequence) (s)), buffer, position, limit - position);
			position = i;
			k = j - i - k;
			bufferUInt32NoTag(k);
			position = j;
			totalBytesWritten = totalBytesWritten + k;
			break MISSING_BLOCK_LABEL_194;
			j = Utf8.encodedLength(((CharSequence) (s)));
			bufferUInt32NoTag(j);
			position = Utf8.encode(((CharSequence) (s)), buffer, position, j);
			totalBytesWritten = totalBytesWritten + j;
		}

		public void writeTag(int i, int j)
			throws IOException
		{
			writeUInt32NoTag(WireFormat.makeTag(i, j));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokestatic    #227 <Method int WireFormat.makeTag(int, int)>
		//    4    6:invokevirtual   #88  <Method void writeUInt32NoTag(int)>
		//    5    9:return          
		}

		public void writeUInt32(int i, int j)
			throws IOException
		{
			flushIfNotAvailable(20);
		//    0    0:aload_0         
		//    1    1:bipush          20
		//    2    3:invokespecial   #70  <Method void flushIfNotAvailable(int)>
			bufferTag(i, 0);
		//    3    6:aload_0         
		//    4    7:iload_1         
		//    5    8:iconst_0        
		//    6    9:invokevirtual   #74  <Method void bufferTag(int, int)>
			bufferUInt32NoTag(j);
		//    7   12:aload_0         
		//    8   13:iload_2         
		//    9   14:invokevirtual   #208 <Method void bufferUInt32NoTag(int)>
		//   10   17:return          
		}

		public void writeUInt32NoTag(int i)
			throws IOException
		{
			flushIfNotAvailable(10);
		//    0    0:aload_0         
		//    1    1:bipush          10
		//    2    3:invokespecial   #70  <Method void flushIfNotAvailable(int)>
			bufferUInt32NoTag(i);
		//    3    6:aload_0         
		//    4    7:iload_1         
		//    5    8:invokevirtual   #208 <Method void bufferUInt32NoTag(int)>
		//    6   11:return          
		}

		public void writeUInt64(int i, long l)
			throws IOException
		{
			flushIfNotAvailable(20);
		//    0    0:aload_0         
		//    1    1:bipush          20
		//    2    3:invokespecial   #70  <Method void flushIfNotAvailable(int)>
			bufferTag(i, 0);
		//    3    6:aload_0         
		//    4    7:iload_1         
		//    5    8:iconst_0        
		//    6    9:invokevirtual   #74  <Method void bufferTag(int, int)>
			bufferUInt64NoTag(l);
		//    7   12:aload_0         
		//    8   13:lload_2         
		//    9   14:invokevirtual   #231 <Method void bufferUInt64NoTag(long)>
		//   10   17:return          
		}

		public void writeUInt64NoTag(long l)
			throws IOException
		{
			flushIfNotAvailable(10);
		//    0    0:aload_0         
		//    1    1:bipush          10
		//    2    3:invokespecial   #70  <Method void flushIfNotAvailable(int)>
			bufferUInt64NoTag(l);
		//    3    6:aload_0         
		//    4    7:lload_1         
		//    5    8:invokevirtual   #231 <Method void bufferUInt64NoTag(long)>
		//    6   11:return          
		}

		private final ByteOutput out;

		ByteOutputEncoder(ByteOutput byteoutput, int i)
		{
			super(i);
		//    0    0:aload_0         
		//    1    1:iload_2         
		//    2    2:invokespecial   #14  <Method void CodedOutputStream$AbstractBufferedEncoder(int)>
			if(byteoutput == null)
		//*   3    5:aload_1         
		//*   4    6:ifnonnull       19
			{
				throw new NullPointerException("out");
		//    5    9:new             #16  <Class NullPointerException>
		//    6   12:dup             
		//    7   13:ldc1            #17  <String "out">
		//    8   15:invokespecial   #20  <Method void NullPointerException(String)>
		//    9   18:athrow          
			} else
			{
				out = byteoutput;
		//   10   19:aload_0         
		//   11   20:aload_1         
		//   12   21:putfield        #22  <Field ByteOutput out>
				return;
		//   13   24:return          
			}
		}
	}

	static final class HeapNioEncoder extends ArrayEncoder
	{

		public void flush()
		{
			byteBuffer.position(initialPosition + getTotalBytesWritten());
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field ByteBuffer byteBuffer>
		//    2    4:aload_0         
		//    3    5:getfield        #36  <Field int initialPosition>
		//    4    8:aload_0         
		//    5    9:invokevirtual   #42  <Method int getTotalBytesWritten()>
		//    6   12:iadd            
		//    7   13:invokevirtual   #45  <Method java.nio.Buffer ByteBuffer.position(int)>
		//    8   16:pop             
		//    9   17:return          
		}

		private final ByteBuffer byteBuffer;
		private int initialPosition;

		HeapNioEncoder(ByteBuffer bytebuffer)
		{
			super(bytebuffer.array(), bytebuffer.arrayOffset() + bytebuffer.position(), bytebuffer.remaining());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #19  <Method byte[] ByteBuffer.array()>
		//    3    5:aload_1         
		//    4    6:invokevirtual   #23  <Method int ByteBuffer.arrayOffset()>
		//    5    9:aload_1         
		//    6   10:invokevirtual   #26  <Method int ByteBuffer.position()>
		//    7   13:iadd            
		//    8   14:aload_1         
		//    9   15:invokevirtual   #29  <Method int ByteBuffer.remaining()>
		//   10   18:invokespecial   #32  <Method void CodedOutputStream$ArrayEncoder(byte[], int, int)>
			byteBuffer = bytebuffer;
		//   11   21:aload_0         
		//   12   22:aload_1         
		//   13   23:putfield        #34  <Field ByteBuffer byteBuffer>
			initialPosition = bytebuffer.position();
		//   14   26:aload_0         
		//   15   27:aload_1         
		//   16   28:invokevirtual   #26  <Method int ByteBuffer.position()>
		//   17   31:putfield        #36  <Field int initialPosition>
		//   18   34:return          
		}
	}

	public static class OutOfSpaceException extends IOException
	{

		private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
		private static final long serialVersionUID = 0x52ce6e25L;

		OutOfSpaceException()
		{
			super("CodedOutputStream was writing to a flat byte array and ran out of space.");
		//    0    0:aload_0         
		//    1    1:ldc1            #11  <String "CodedOutputStream was writing to a flat byte array and ran out of space.">
		//    2    3:invokespecial   #20  <Method void IOException(String)>
		//    3    6:return          
		}

		OutOfSpaceException(String s)
		{
			super((new StringBuilder()).append("CodedOutputStream was writing to a flat byte array and ran out of space.: ").append(s).toString());
		//    0    0:aload_0         
		//    1    1:new             #23  <Class StringBuilder>
		//    2    4:dup             
		//    3    5:invokespecial   #25  <Method void StringBuilder()>
		//    4    8:ldc1            #27  <String "CodedOutputStream was writing to a flat byte array and ran out of space.: ">
		//    5   10:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
		//    6   13:aload_1         
		//    7   14:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
		//    8   17:invokevirtual   #35  <Method String StringBuilder.toString()>
		//    9   20:invokespecial   #20  <Method void IOException(String)>
		//   10   23:return          
		}

		OutOfSpaceException(String s, Throwable throwable)
		{
			super((new StringBuilder()).append("CodedOutputStream was writing to a flat byte array and ran out of space.: ").append(s).toString(), throwable);
		//    0    0:aload_0         
		//    1    1:new             #23  <Class StringBuilder>
		//    2    4:dup             
		//    3    5:invokespecial   #25  <Method void StringBuilder()>
		//    4    8:ldc1            #27  <String "CodedOutputStream was writing to a flat byte array and ran out of space.: ">
		//    5   10:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
		//    6   13:aload_1         
		//    7   14:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
		//    8   17:invokevirtual   #35  <Method String StringBuilder.toString()>
		//    9   20:aload_2         
		//   10   21:invokespecial   #38  <Method void IOException(String, Throwable)>
		//   11   24:return          
		}

		OutOfSpaceException(Throwable throwable)
		{
			super("CodedOutputStream was writing to a flat byte array and ran out of space.", throwable);
		//    0    0:aload_0         
		//    1    1:ldc1            #11  <String "CodedOutputStream was writing to a flat byte array and ran out of space.">
		//    2    3:aload_1         
		//    3    4:invokespecial   #38  <Method void IOException(String, Throwable)>
		//    4    7:return          
		}
	}

	static final class OutputStreamEncoder extends AbstractBufferedEncoder
	{

		private void doFlush()
			throws IOException
		{
			out.write(buffer, 0, position);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field OutputStream out>
		//    2    4:aload_0         
		//    3    5:getfield        #31  <Field byte[] buffer>
		//    4    8:iconst_0        
		//    5    9:aload_0         
		//    6   10:getfield        #35  <Field int position>
		//    7   13:invokevirtual   #41  <Method void OutputStream.write(byte[], int, int)>
			position = 0;
		//    8   16:aload_0         
		//    9   17:iconst_0        
		//   10   18:putfield        #35  <Field int position>
		//   11   21:return          
		}

		private void flushIfNotAvailable(int i)
			throws IOException
		{
			if(limit - position < i)
		//*   0    0:aload_0         
		//*   1    1:getfield        #46  <Field int limit>
		//*   2    4:aload_0         
		//*   3    5:getfield        #35  <Field int position>
		//*   4    8:isub            
		//*   5    9:iload_1         
		//*   6   10:icmpge          17
				doFlush();
		//    7   13:aload_0         
		//    8   14:invokespecial   #48  <Method void doFlush()>
		//    9   17:return          
		}

		public void flush()
			throws IOException
		{
			if(position > 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #35  <Field int position>
		//*   2    4:ifle            11
				doFlush();
		//    3    7:aload_0         
		//    4    8:invokespecial   #48  <Method void doFlush()>
		//    5   11:return          
		}

		public void write(byte byte0)
			throws IOException
		{
			if(position == limit)
		//*   0    0:aload_0         
		//*   1    1:getfield        #35  <Field int position>
		//*   2    4:aload_0         
		//*   3    5:getfield        #46  <Field int limit>
		//*   4    8:icmpne          15
				doFlush();
		//    5   11:aload_0         
		//    6   12:invokespecial   #48  <Method void doFlush()>
			buffer(byte0);
		//    7   15:aload_0         
		//    8   16:iload_1         
		//    9   17:invokevirtual   #52  <Method void buffer(byte)>
		//   10   20:return          
		}

		public void write(ByteBuffer bytebuffer)
			throws IOException
		{
			int i = bytebuffer.remaining();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #59  <Method int ByteBuffer.remaining()>
		//    2    4:istore_2        
			if(limit - position >= i)
		//*   3    5:aload_0         
		//*   4    6:getfield        #46  <Field int limit>
		//*   5    9:aload_0         
		//*   6   10:getfield        #35  <Field int position>
		//*   7   13:isub            
		//*   8   14:iload_2         
		//*   9   15:icmplt          53
			{
				bytebuffer.get(buffer, position, i);
		//   10   18:aload_1         
		//   11   19:aload_0         
		//   12   20:getfield        #31  <Field byte[] buffer>
		//   13   23:aload_0         
		//   14   24:getfield        #35  <Field int position>
		//   15   27:iload_2         
		//   16   28:invokevirtual   #63  <Method ByteBuffer ByteBuffer.get(byte[], int, int)>
		//   17   31:pop             
				position = position + i;
		//   18   32:aload_0         
		//   19   33:aload_0         
		//   20   34:getfield        #35  <Field int position>
		//   21   37:iload_2         
		//   22   38:iadd            
		//   23   39:putfield        #35  <Field int position>
				totalBytesWritten = totalBytesWritten + i;
		//   24   42:aload_0         
		//   25   43:aload_0         
		//   26   44:getfield        #66  <Field int totalBytesWritten>
		//   27   47:iload_2         
		//   28   48:iadd            
		//   29   49:putfield        #66  <Field int totalBytesWritten>
				return;
		//   30   52:return          
			}
			int j = limit - position;
		//   31   53:aload_0         
		//   32   54:getfield        #46  <Field int limit>
		//   33   57:aload_0         
		//   34   58:getfield        #35  <Field int position>
		//   35   61:isub            
		//   36   62:istore_3        
			bytebuffer.get(buffer, position, j);
		//   37   63:aload_1         
		//   38   64:aload_0         
		//   39   65:getfield        #31  <Field byte[] buffer>
		//   40   68:aload_0         
		//   41   69:getfield        #35  <Field int position>
		//   42   72:iload_3         
		//   43   73:invokevirtual   #63  <Method ByteBuffer ByteBuffer.get(byte[], int, int)>
		//   44   76:pop             
			i -= j;
		//   45   77:iload_2         
		//   46   78:iload_3         
		//   47   79:isub            
		//   48   80:istore_2        
			position = limit;
		//   49   81:aload_0         
		//   50   82:aload_0         
		//   51   83:getfield        #46  <Field int limit>
		//   52   86:putfield        #35  <Field int position>
			totalBytesWritten = totalBytesWritten + j;
		//   53   89:aload_0         
		//   54   90:aload_0         
		//   55   91:getfield        #66  <Field int totalBytesWritten>
		//   56   94:iload_3         
		//   57   95:iadd            
		//   58   96:putfield        #66  <Field int totalBytesWritten>
			doFlush();
		//   59   99:aload_0         
		//   60  100:invokespecial   #48  <Method void doFlush()>
			while(i > limit) 
		//*  61  103:iload_2         
		//*  62  104:aload_0         
		//*  63  105:getfield        #46  <Field int limit>
		//*  64  108:icmple          164
			{
				bytebuffer.get(buffer, 0, limit);
		//   65  111:aload_1         
		//   66  112:aload_0         
		//   67  113:getfield        #31  <Field byte[] buffer>
		//   68  116:iconst_0        
		//   69  117:aload_0         
		//   70  118:getfield        #46  <Field int limit>
		//   71  121:invokevirtual   #63  <Method ByteBuffer ByteBuffer.get(byte[], int, int)>
		//   72  124:pop             
				out.write(buffer, 0, limit);
		//   73  125:aload_0         
		//   74  126:getfield        #22  <Field OutputStream out>
		//   75  129:aload_0         
		//   76  130:getfield        #31  <Field byte[] buffer>
		//   77  133:iconst_0        
		//   78  134:aload_0         
		//   79  135:getfield        #46  <Field int limit>
		//   80  138:invokevirtual   #41  <Method void OutputStream.write(byte[], int, int)>
				i -= limit;
		//   81  141:iload_2         
		//   82  142:aload_0         
		//   83  143:getfield        #46  <Field int limit>
		//   84  146:isub            
		//   85  147:istore_2        
				totalBytesWritten = totalBytesWritten + limit;
		//   86  148:aload_0         
		//   87  149:aload_0         
		//   88  150:getfield        #66  <Field int totalBytesWritten>
		//   89  153:aload_0         
		//   90  154:getfield        #46  <Field int limit>
		//   91  157:iadd            
		//   92  158:putfield        #66  <Field int totalBytesWritten>
			}
		//*  93  161:goto            103
			bytebuffer.get(buffer, 0, i);
		//   94  164:aload_1         
		//   95  165:aload_0         
		//   96  166:getfield        #31  <Field byte[] buffer>
		//   97  169:iconst_0        
		//   98  170:iload_2         
		//   99  171:invokevirtual   #63  <Method ByteBuffer ByteBuffer.get(byte[], int, int)>
		//  100  174:pop             
			position = i;
		//  101  175:aload_0         
		//  102  176:iload_2         
		//  103  177:putfield        #35  <Field int position>
			totalBytesWritten = totalBytesWritten + i;
		//  104  180:aload_0         
		//  105  181:aload_0         
		//  106  182:getfield        #66  <Field int totalBytesWritten>
		//  107  185:iload_2         
		//  108  186:iadd            
		//  109  187:putfield        #66  <Field int totalBytesWritten>
		//  110  190:return          
		}

		public void write(byte abyte0[], int i, int j)
			throws IOException
		{
			if(limit - position >= j)
		//*   0    0:aload_0         
		//*   1    1:getfield        #46  <Field int limit>
		//*   2    4:aload_0         
		//*   3    5:getfield        #35  <Field int position>
		//*   4    8:isub            
		//*   5    9:iload_3         
		//*   6   10:icmplt          48
			{
				System.arraycopy(((Object) (abyte0)), i, ((Object) (buffer)), position, j);
		//    7   13:aload_1         
		//    8   14:iload_2         
		//    9   15:aload_0         
		//   10   16:getfield        #31  <Field byte[] buffer>
		//   11   19:aload_0         
		//   12   20:getfield        #35  <Field int position>
		//   13   23:iload_3         
		//   14   24:invokestatic    #72  <Method void System.arraycopy(Object, int, Object, int, int)>
				position = position + j;
		//   15   27:aload_0         
		//   16   28:aload_0         
		//   17   29:getfield        #35  <Field int position>
		//   18   32:iload_3         
		//   19   33:iadd            
		//   20   34:putfield        #35  <Field int position>
				totalBytesWritten = totalBytesWritten + j;
		//   21   37:aload_0         
		//   22   38:aload_0         
		//   23   39:getfield        #66  <Field int totalBytesWritten>
		//   24   42:iload_3         
		//   25   43:iadd            
		//   26   44:putfield        #66  <Field int totalBytesWritten>
				return;
		//   27   47:return          
			}
			int k = limit - position;
		//   28   48:aload_0         
		//   29   49:getfield        #46  <Field int limit>
		//   30   52:aload_0         
		//   31   53:getfield        #35  <Field int position>
		//   32   56:isub            
		//   33   57:istore          4
			System.arraycopy(((Object) (abyte0)), i, ((Object) (buffer)), position, k);
		//   34   59:aload_1         
		//   35   60:iload_2         
		//   36   61:aload_0         
		//   37   62:getfield        #31  <Field byte[] buffer>
		//   38   65:aload_0         
		//   39   66:getfield        #35  <Field int position>
		//   40   69:iload           4
		//   41   71:invokestatic    #72  <Method void System.arraycopy(Object, int, Object, int, int)>
			i += k;
		//   42   74:iload_2         
		//   43   75:iload           4
		//   44   77:iadd            
		//   45   78:istore_2        
			j -= k;
		//   46   79:iload_3         
		//   47   80:iload           4
		//   48   82:isub            
		//   49   83:istore_3        
			position = limit;
		//   50   84:aload_0         
		//   51   85:aload_0         
		//   52   86:getfield        #46  <Field int limit>
		//   53   89:putfield        #35  <Field int position>
			totalBytesWritten = totalBytesWritten + k;
		//   54   92:aload_0         
		//   55   93:aload_0         
		//   56   94:getfield        #66  <Field int totalBytesWritten>
		//   57   97:iload           4
		//   58   99:iadd            
		//   59  100:putfield        #66  <Field int totalBytesWritten>
			doFlush();
		//   60  103:aload_0         
		//   61  104:invokespecial   #48  <Method void doFlush()>
			if(j <= limit)
		//*  62  107:iload_3         
		//*  63  108:aload_0         
		//*  64  109:getfield        #46  <Field int limit>
		//*  65  112:icmpgt          134
			{
				System.arraycopy(((Object) (abyte0)), i, ((Object) (buffer)), 0, j);
		//   66  115:aload_1         
		//   67  116:iload_2         
		//   68  117:aload_0         
		//   69  118:getfield        #31  <Field byte[] buffer>
		//   70  121:iconst_0        
		//   71  122:iload_3         
		//   72  123:invokestatic    #72  <Method void System.arraycopy(Object, int, Object, int, int)>
				position = j;
		//   73  126:aload_0         
		//   74  127:iload_3         
		//   75  128:putfield        #35  <Field int position>
			} else
		//*  76  131:goto            144
			{
				out.write(abyte0, i, j);
		//   77  134:aload_0         
		//   78  135:getfield        #22  <Field OutputStream out>
		//   79  138:aload_1         
		//   80  139:iload_2         
		//   81  140:iload_3         
		//   82  141:invokevirtual   #41  <Method void OutputStream.write(byte[], int, int)>
			}
			totalBytesWritten = totalBytesWritten + j;
		//   83  144:aload_0         
		//   84  145:aload_0         
		//   85  146:getfield        #66  <Field int totalBytesWritten>
		//   86  149:iload_3         
		//   87  150:iadd            
		//   88  151:putfield        #66  <Field int totalBytesWritten>
		//   89  154:return          
		}

		public void writeBool(int i, boolean flag)
			throws IOException
		{
			flushIfNotAvailable(11);
		//    0    0:aload_0         
		//    1    1:bipush          11
		//    2    3:invokespecial   #76  <Method void flushIfNotAvailable(int)>
			bufferTag(i, 0);
		//    3    6:aload_0         
		//    4    7:iload_1         
		//    5    8:iconst_0        
		//    6    9:invokevirtual   #80  <Method void bufferTag(int, int)>
			if(flag)
		//*   7   12:iload_2         
		//*   8   13:ifeq            21
				i = 1;
		//    9   16:iconst_1        
		//   10   17:istore_1        
			else
		//*  11   18:goto            23
				i = 0;
		//   12   21:iconst_0        
		//   13   22:istore_1        
			buffer((byte)i);
		//   14   23:aload_0         
		//   15   24:iload_1         
		//   16   25:int2byte        
		//   17   26:invokevirtual   #52  <Method void buffer(byte)>
		//   18   29:return          
		}

		public void writeByteArray(int i, byte abyte0[])
			throws IOException
		{
			writeByteArray(i, abyte0, 0, abyte0.length);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:iconst_0        
		//    4    4:aload_2         
		//    5    5:arraylength     
		//    6    6:invokevirtual   #85  <Method void writeByteArray(int, byte[], int, int)>
		//    7    9:return          
		}

		public void writeByteArray(int i, byte abyte0[], int j, int k)
			throws IOException
		{
			writeTag(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #88  <Method void writeTag(int, int)>
			writeByteArrayNoTag(abyte0, j, k);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:iload_3         
		//    7    9:iload           4
		//    8   11:invokevirtual   #91  <Method void writeByteArrayNoTag(byte[], int, int)>
		//    9   14:return          
		}

		public void writeByteArrayNoTag(byte abyte0[], int i, int j)
			throws IOException
		{
			writeUInt32NoTag(j);
		//    0    0:aload_0         
		//    1    1:iload_3         
		//    2    2:invokevirtual   #94  <Method void writeUInt32NoTag(int)>
			write(abyte0, i, j);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:iload_2         
		//    6    8:iload_3         
		//    7    9:invokevirtual   #95  <Method void write(byte[], int, int)>
		//    8   12:return          
		}

		public void writeByteBuffer(int i, ByteBuffer bytebuffer)
			throws IOException
		{
			writeTag(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #88  <Method void writeTag(int, int)>
			writeUInt32NoTag(bytebuffer.capacity());
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #100 <Method int ByteBuffer.capacity()>
		//    7   11:invokevirtual   #94  <Method void writeUInt32NoTag(int)>
			writeRawBytes(bytebuffer);
		//    8   14:aload_0         
		//    9   15:aload_2         
		//   10   16:invokevirtual   #103 <Method void writeRawBytes(ByteBuffer)>
		//   11   19:return          
		}

		public void writeBytes(int i, ByteString bytestring)
			throws IOException
		{
			writeTag(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #88  <Method void writeTag(int, int)>
			writeBytesNoTag(bytestring);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #109 <Method void writeBytesNoTag(ByteString)>
		//    7   11:return          
		}

		public void writeBytesNoTag(ByteString bytestring)
			throws IOException
		{
			writeUInt32NoTag(bytestring.size());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #114 <Method int ByteString.size()>
		//    3    5:invokevirtual   #94  <Method void writeUInt32NoTag(int)>
			bytestring.writeTo(((ByteOutput) (this)));
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:invokevirtual   #118 <Method void ByteString.writeTo(ByteOutput)>
		//    7   13:return          
		}

		public void writeFixed32(int i, int j)
			throws IOException
		{
			flushIfNotAvailable(14);
		//    0    0:aload_0         
		//    1    1:bipush          14
		//    2    3:invokespecial   #76  <Method void flushIfNotAvailable(int)>
			bufferTag(i, 5);
		//    3    6:aload_0         
		//    4    7:iload_1         
		//    5    8:iconst_5        
		//    6    9:invokevirtual   #80  <Method void bufferTag(int, int)>
			bufferFixed32NoTag(j);
		//    7   12:aload_0         
		//    8   13:iload_2         
		//    9   14:invokevirtual   #122 <Method void bufferFixed32NoTag(int)>
		//   10   17:return          
		}

		public void writeFixed32NoTag(int i)
			throws IOException
		{
			flushIfNotAvailable(4);
		//    0    0:aload_0         
		//    1    1:iconst_4        
		//    2    2:invokespecial   #76  <Method void flushIfNotAvailable(int)>
			bufferFixed32NoTag(i);
		//    3    5:aload_0         
		//    4    6:iload_1         
		//    5    7:invokevirtual   #122 <Method void bufferFixed32NoTag(int)>
		//    6   10:return          
		}

		public void writeFixed64(int i, long l)
			throws IOException
		{
			flushIfNotAvailable(18);
		//    0    0:aload_0         
		//    1    1:bipush          18
		//    2    3:invokespecial   #76  <Method void flushIfNotAvailable(int)>
			bufferTag(i, 1);
		//    3    6:aload_0         
		//    4    7:iload_1         
		//    5    8:iconst_1        
		//    6    9:invokevirtual   #80  <Method void bufferTag(int, int)>
			bufferFixed64NoTag(l);
		//    7   12:aload_0         
		//    8   13:lload_2         
		//    9   14:invokevirtual   #129 <Method void bufferFixed64NoTag(long)>
		//   10   17:return          
		}

		public void writeFixed64NoTag(long l)
			throws IOException
		{
			flushIfNotAvailable(8);
		//    0    0:aload_0         
		//    1    1:bipush          8
		//    2    3:invokespecial   #76  <Method void flushIfNotAvailable(int)>
			bufferFixed64NoTag(l);
		//    3    6:aload_0         
		//    4    7:lload_1         
		//    5    8:invokevirtual   #129 <Method void bufferFixed64NoTag(long)>
		//    6   11:return          
		}

		public void writeInt32(int i, int j)
			throws IOException
		{
			flushIfNotAvailable(20);
		//    0    0:aload_0         
		//    1    1:bipush          20
		//    2    3:invokespecial   #76  <Method void flushIfNotAvailable(int)>
			bufferTag(i, 0);
		//    3    6:aload_0         
		//    4    7:iload_1         
		//    5    8:iconst_0        
		//    6    9:invokevirtual   #80  <Method void bufferTag(int, int)>
			bufferInt32NoTag(j);
		//    7   12:aload_0         
		//    8   13:iload_2         
		//    9   14:invokevirtual   #134 <Method void bufferInt32NoTag(int)>
		//   10   17:return          
		}

		public void writeInt32NoTag(int i)
			throws IOException
		{
			if(i >= 0)
		//*   0    0:iload_1         
		//*   1    1:iflt            10
			{
				writeUInt32NoTag(i);
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:invokevirtual   #94  <Method void writeUInt32NoTag(int)>
				return;
		//    5    9:return          
			} else
			{
				writeUInt64NoTag(i);
		//    6   10:aload_0         
		//    7   11:iload_1         
		//    8   12:i2l             
		//    9   13:invokevirtual   #138 <Method void writeUInt64NoTag(long)>
				return;
		//   10   16:return          
			}
		}

		public void writeLazy(ByteBuffer bytebuffer)
			throws IOException
		{
			write(bytebuffer);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #141 <Method void write(ByteBuffer)>
		//    3    5:return          
		}

		public void writeLazy(byte abyte0[], int i, int j)
			throws IOException
		{
			write(abyte0, i, j);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:iload_3         
		//    4    4:invokevirtual   #95  <Method void write(byte[], int, int)>
		//    5    7:return          
		}

		public void writeMessage(int i, MessageLite messagelite)
			throws IOException
		{
			writeTag(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #88  <Method void writeTag(int, int)>
			writeMessageNoTag(messagelite);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #147 <Method void writeMessageNoTag(MessageLite)>
		//    7   11:return          
		}

		public void writeMessageNoTag(MessageLite messagelite)
			throws IOException
		{
			writeUInt32NoTag(messagelite.getSerializedSize());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokeinterface #152 <Method int MessageLite.getSerializedSize()>
		//    3    7:invokevirtual   #94  <Method void writeUInt32NoTag(int)>
			messagelite.writeTo(((CodedOutputStream) (this)));
		//    4   10:aload_1         
		//    5   11:aload_0         
		//    6   12:invokeinterface #155 <Method void MessageLite.writeTo(CodedOutputStream)>
		//    7   17:return          
		}

		public void writeMessageSetExtension(int i, MessageLite messagelite)
			throws IOException
		{
			writeTag(1, 3);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:iconst_3        
		//    3    3:invokevirtual   #88  <Method void writeTag(int, int)>
			writeUInt32(2, i);
		//    4    6:aload_0         
		//    5    7:iconst_2        
		//    6    8:iload_1         
		//    7    9:invokevirtual   #159 <Method void writeUInt32(int, int)>
			writeMessage(3, messagelite);
		//    8   12:aload_0         
		//    9   13:iconst_3        
		//   10   14:aload_2         
		//   11   15:invokevirtual   #161 <Method void writeMessage(int, MessageLite)>
			writeTag(1, 4);
		//   12   18:aload_0         
		//   13   19:iconst_1        
		//   14   20:iconst_4        
		//   15   21:invokevirtual   #88  <Method void writeTag(int, int)>
		//   16   24:return          
		}

		public void writeRawBytes(ByteBuffer bytebuffer)
			throws IOException
		{
			if(bytebuffer.hasArray())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #165 <Method boolean ByteBuffer.hasArray()>
		//*   2    4:ifeq            24
			{
				write(bytebuffer.array(), bytebuffer.arrayOffset(), bytebuffer.capacity());
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:invokevirtual   #169 <Method byte[] ByteBuffer.array()>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #172 <Method int ByteBuffer.arrayOffset()>
		//    8   16:aload_1         
		//    9   17:invokevirtual   #100 <Method int ByteBuffer.capacity()>
		//   10   20:invokevirtual   #95  <Method void write(byte[], int, int)>
				return;
		//   11   23:return          
			} else
			{
				bytebuffer = bytebuffer.duplicate();
		//   12   24:aload_1         
		//   13   25:invokevirtual   #176 <Method ByteBuffer ByteBuffer.duplicate()>
		//   14   28:astore_1        
				bytebuffer.clear();
		//   15   29:aload_1         
		//   16   30:invokevirtual   #180 <Method java.nio.Buffer ByteBuffer.clear()>
		//   17   33:pop             
				write(bytebuffer);
		//   18   34:aload_0         
		//   19   35:aload_1         
		//   20   36:invokevirtual   #141 <Method void write(ByteBuffer)>
				return;
		//   21   39:return          
			}
		}

		public void writeRawMessageSetExtension(int i, ByteString bytestring)
			throws IOException
		{
			writeTag(1, 3);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:iconst_3        
		//    3    3:invokevirtual   #88  <Method void writeTag(int, int)>
			writeUInt32(2, i);
		//    4    6:aload_0         
		//    5    7:iconst_2        
		//    6    8:iload_1         
		//    7    9:invokevirtual   #159 <Method void writeUInt32(int, int)>
			writeBytes(3, bytestring);
		//    8   12:aload_0         
		//    9   13:iconst_3        
		//   10   14:aload_2         
		//   11   15:invokevirtual   #183 <Method void writeBytes(int, ByteString)>
			writeTag(1, 4);
		//   12   18:aload_0         
		//   13   19:iconst_1        
		//   14   20:iconst_4        
		//   15   21:invokevirtual   #88  <Method void writeTag(int, int)>
		//   16   24:return          
		}

		public void writeString(int i, String s)
			throws IOException
		{
			writeTag(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #88  <Method void writeTag(int, int)>
			writeStringNoTag(s);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #188 <Method void writeStringNoTag(String)>
		//    7   11:return          
		}

		public void writeStringNoTag(String s)
			throws IOException
		{
			int i;
			int j;
			j = s.length() * 3;
		//    0    0:aload_1         
		//    1    1:invokevirtual   #197 <Method int String.length()>
		//    2    4:iconst_3        
		//    3    5:imul            
		//    4    6:istore_3        
			i = computeUInt32SizeNoTag(j);
		//    5    7:iload_3         
		//    6    8:invokestatic    #201 <Method int computeUInt32SizeNoTag(int)>
		//    7   11:istore_2        
			if(i + j > limit)
		//*   8   12:iload_2         
		//*   9   13:iload_3         
		//*  10   14:iadd            
		//*  11   15:aload_0         
		//*  12   16:getfield        #46  <Field int limit>
		//*  13   19:icmple          50
			{
				byte abyte0[] = new byte[j];
		//   14   22:iload_3         
		//   15   23:newarray        byte[]
		//   16   25:astore          6
				i = Utf8.encode(((CharSequence) (s)), abyte0, 0, j);
		//   17   27:aload_1         
		//   18   28:aload           6
		//   19   30:iconst_0        
		//   20   31:iload_3         
		//   21   32:invokestatic    #207 <Method int Utf8.encode(CharSequence, byte[], int, int)>
		//   22   35:istore_2        
				writeUInt32NoTag(i);
		//   23   36:aload_0         
		//   24   37:iload_2         
		//   25   38:invokevirtual   #94  <Method void writeUInt32NoTag(int)>
				writeLazy(abyte0, 0, i);
		//   26   41:aload_0         
		//   27   42:aload           6
		//   28   44:iconst_0        
		//   29   45:iload_2         
		//   30   46:invokevirtual   #209 <Method void writeLazy(byte[], int, int)>
				return;
		//   31   49:return          
			}
			int k;
			if(i + j > limit - position)
		//*  32   50:iload_2         
		//*  33   51:iload_3         
		//*  34   52:iadd            
		//*  35   53:aload_0         
		//*  36   54:getfield        #46  <Field int limit>
		//*  37   57:aload_0         
		//*  38   58:getfield        #35  <Field int position>
		//*  39   61:isub            
		//*  40   62:icmple          69
				doFlush();
		//   41   65:aload_0         
		//   42   66:invokespecial   #48  <Method void doFlush()>
			k = computeUInt32SizeNoTag(s.length());
		//   43   69:aload_1         
		//   44   70:invokevirtual   #197 <Method int String.length()>
		//   45   73:invokestatic    #201 <Method int computeUInt32SizeNoTag(int)>
		//   46   76:istore          4
			j = position;
		//   47   78:aload_0         
		//   48   79:getfield        #35  <Field int position>
		//   49   82:istore_3        
			if(k != i)
				break MISSING_BLOCK_LABEL_147;
		//   50   83:iload           4
		//   51   85:iload_2         
		//   52   86:icmpne          147
			int l;
			position = j + k;
		//   53   89:aload_0         
		//   54   90:iload_3         
		//   55   91:iload           4
		//   56   93:iadd            
		//   57   94:putfield        #35  <Field int position>
			l = Utf8.encode(((CharSequence) (s)), buffer, position, limit - position);
		//   58   97:aload_1         
		//   59   98:aload_0         
		//   60   99:getfield        #31  <Field byte[] buffer>
		//   61  102:aload_0         
		//   62  103:getfield        #35  <Field int position>
		//   63  106:aload_0         
		//   64  107:getfield        #46  <Field int limit>
		//   65  110:aload_0         
		//   66  111:getfield        #35  <Field int position>
		//   67  114:isub            
		//   68  115:invokestatic    #207 <Method int Utf8.encode(CharSequence, byte[], int, int)>
		//   69  118:istore          5
			position = j;
		//   70  120:aload_0         
		//   71  121:iload_3         
		//   72  122:putfield        #35  <Field int position>
			i = l - j - k;
		//   73  125:iload           5
		//   74  127:iload_3         
		//   75  128:isub            
		//   76  129:iload           4
		//   77  131:isub            
		//   78  132:istore_2        
			bufferUInt32NoTag(i);
		//   79  133:aload_0         
		//   80  134:iload_2         
		//   81  135:invokevirtual   #212 <Method void bufferUInt32NoTag(int)>
			position = l;
		//   82  138:aload_0         
		//   83  139:iload           5
		//   84  141:putfield        #35  <Field int position>
			break MISSING_BLOCK_LABEL_174;
		//   85  144:goto            174
			i = Utf8.encodedLength(((CharSequence) (s)));
		//   86  147:aload_1         
		//   87  148:invokestatic    #216 <Method int Utf8.encodedLength(CharSequence)>
		//   88  151:istore_2        
			bufferUInt32NoTag(i);
		//   89  152:aload_0         
		//   90  153:iload_2         
		//   91  154:invokevirtual   #212 <Method void bufferUInt32NoTag(int)>
			position = Utf8.encode(((CharSequence) (s)), buffer, position, i);
		//   92  157:aload_0         
		//   93  158:aload_1         
		//   94  159:aload_0         
		//   95  160:getfield        #31  <Field byte[] buffer>
		//   96  163:aload_0         
		//   97  164:getfield        #35  <Field int position>
		//   98  167:iload_2         
		//   99  168:invokestatic    #207 <Method int Utf8.encode(CharSequence, byte[], int, int)>
		//  100  171:putfield        #35  <Field int position>
			totalBytesWritten = totalBytesWritten + i;
		//  101  174:aload_0         
		//  102  175:aload_0         
		//  103  176:getfield        #66  <Field int totalBytesWritten>
		//  104  179:iload_2         
		//  105  180:iadd            
		//  106  181:putfield        #66  <Field int totalBytesWritten>
			break MISSING_BLOCK_LABEL_224;
		//  107  184:goto            224
			Object obj;
			obj;
		//  108  187:astore          6
			try
			{
				totalBytesWritten = totalBytesWritten - (position - j);
		//  109  189:aload_0         
		//  110  190:aload_0         
		//  111  191:getfield        #66  <Field int totalBytesWritten>
		//  112  194:aload_0         
		//  113  195:getfield        #35  <Field int position>
		//  114  198:iload_3         
		//  115  199:isub            
		//  116  200:isub            
		//  117  201:putfield        #66  <Field int totalBytesWritten>
				position = j;
		//  118  204:aload_0         
		//  119  205:iload_3         
		//  120  206:putfield        #35  <Field int position>
				throw obj;
		//  121  209:aload           6
		//  122  211:athrow          
			}
		//* 123  212:astore          6
		//* 124  214:new             #218 <Class CodedOutputStream$OutOfSpaceException>
		//* 125  217:dup             
		//* 126  218:aload           6
		//* 127  220:invokespecial   #221 <Method void CodedOutputStream$OutOfSpaceException(Throwable)>
		//* 128  223:athrow          
		//* 129  224:return          
			catch(Utf8.UnpairedSurrogateException unpairedsurrogateexception)
		//* 130  225:astore          6
			{
				inefficientWriteStringNoTag(s, unpairedsurrogateexception);
		//  131  227:aload_0         
		//  132  228:aload_1         
		//  133  229:aload           6
		//  134  231:invokevirtual   #225 <Method void inefficientWriteStringNoTag(String, Utf8$UnpairedSurrogateException)>
			}
			break MISSING_BLOCK_LABEL_234;
			obj;
			throw new OutOfSpaceException(((Throwable) (obj)));
			return;
		//  135  234:return          
		}

		public void writeTag(int i, int j)
			throws IOException
		{
			writeUInt32NoTag(WireFormat.makeTag(i, j));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokestatic    #231 <Method int WireFormat.makeTag(int, int)>
		//    4    6:invokevirtual   #94  <Method void writeUInt32NoTag(int)>
		//    5    9:return          
		}

		public void writeUInt32(int i, int j)
			throws IOException
		{
			flushIfNotAvailable(20);
		//    0    0:aload_0         
		//    1    1:bipush          20
		//    2    3:invokespecial   #76  <Method void flushIfNotAvailable(int)>
			bufferTag(i, 0);
		//    3    6:aload_0         
		//    4    7:iload_1         
		//    5    8:iconst_0        
		//    6    9:invokevirtual   #80  <Method void bufferTag(int, int)>
			bufferUInt32NoTag(j);
		//    7   12:aload_0         
		//    8   13:iload_2         
		//    9   14:invokevirtual   #212 <Method void bufferUInt32NoTag(int)>
		//   10   17:return          
		}

		public void writeUInt32NoTag(int i)
			throws IOException
		{
			flushIfNotAvailable(10);
		//    0    0:aload_0         
		//    1    1:bipush          10
		//    2    3:invokespecial   #76  <Method void flushIfNotAvailable(int)>
			bufferUInt32NoTag(i);
		//    3    6:aload_0         
		//    4    7:iload_1         
		//    5    8:invokevirtual   #212 <Method void bufferUInt32NoTag(int)>
		//    6   11:return          
		}

		public void writeUInt64(int i, long l)
			throws IOException
		{
			flushIfNotAvailable(20);
		//    0    0:aload_0         
		//    1    1:bipush          20
		//    2    3:invokespecial   #76  <Method void flushIfNotAvailable(int)>
			bufferTag(i, 0);
		//    3    6:aload_0         
		//    4    7:iload_1         
		//    5    8:iconst_0        
		//    6    9:invokevirtual   #80  <Method void bufferTag(int, int)>
			bufferUInt64NoTag(l);
		//    7   12:aload_0         
		//    8   13:lload_2         
		//    9   14:invokevirtual   #235 <Method void bufferUInt64NoTag(long)>
		//   10   17:return          
		}

		public void writeUInt64NoTag(long l)
			throws IOException
		{
			flushIfNotAvailable(10);
		//    0    0:aload_0         
		//    1    1:bipush          10
		//    2    3:invokespecial   #76  <Method void flushIfNotAvailable(int)>
			bufferUInt64NoTag(l);
		//    3    6:aload_0         
		//    4    7:lload_1         
		//    5    8:invokevirtual   #235 <Method void bufferUInt64NoTag(long)>
		//    6   11:return          
		}

		private final OutputStream out;

		OutputStreamEncoder(OutputStream outputstream, int i)
		{
			super(i);
		//    0    0:aload_0         
		//    1    1:iload_2         
		//    2    2:invokespecial   #14  <Method void CodedOutputStream$AbstractBufferedEncoder(int)>
			if(outputstream == null)
		//*   3    5:aload_1         
		//*   4    6:ifnonnull       19
			{
				throw new NullPointerException("out");
		//    5    9:new             #16  <Class NullPointerException>
		//    6   12:dup             
		//    7   13:ldc1            #17  <String "out">
		//    8   15:invokespecial   #20  <Method void NullPointerException(String)>
		//    9   18:athrow          
			} else
			{
				out = outputstream;
		//   10   19:aload_0         
		//   11   20:aload_1         
		//   12   21:putfield        #22  <Field OutputStream out>
				return;
		//   13   24:return          
			}
		}
	}

	static final class SafeDirectNioEncoder extends CodedOutputStream
	{

		private void encode(String s)
			throws IOException
		{
			try
			{
				Utf8.encodeUtf8(((CharSequence) (s)), buffer);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field ByteBuffer buffer>
		//    3    5:invokestatic    #54  <Method void Utf8.encodeUtf8(CharSequence, ByteBuffer)>
				return;
		//    4    8:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
		//*   5    9:astore_1        
			{
				throw new OutOfSpaceException(((Throwable) (s)));
		//    6   10:new             #56  <Class CodedOutputStream$OutOfSpaceException>
		//    7   13:dup             
		//    8   14:aload_1         
		//    9   15:invokespecial   #59  <Method void CodedOutputStream$OutOfSpaceException(Throwable)>
		//   10   18:athrow          
			}
		}

		public void flush()
		{
			originalBuffer.position(buffer.position());
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field ByteBuffer originalBuffer>
		//    2    4:aload_0         
		//    3    5:getfield        #35  <Field ByteBuffer buffer>
		//    4    8:invokevirtual   #39  <Method int ByteBuffer.position()>
		//    5   11:invokevirtual   #65  <Method java.nio.Buffer ByteBuffer.position(int)>
		//    6   14:pop             
		//    7   15:return          
		}

		public int getTotalBytesWritten()
		{
			return buffer.position() - initialPosition;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field ByteBuffer buffer>
		//    2    4:invokevirtual   #39  <Method int ByteBuffer.position()>
		//    3    7:aload_0         
		//    4    8:getfield        #41  <Field int initialPosition>
		//    5   11:isub            
		//    6   12:ireturn         
		}

		public int spaceLeft()
		{
			return buffer.remaining();
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field ByteBuffer buffer>
		//    2    4:invokevirtual   #70  <Method int ByteBuffer.remaining()>
		//    3    7:ireturn         
		}

		public void write(byte byte0)
			throws IOException
		{
			try
			{
				buffer.put(byte0);
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field ByteBuffer buffer>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #78  <Method ByteBuffer ByteBuffer.put(byte)>
		//    4    8:pop             
				return;
		//    5    9:return          
			}
			catch(BufferOverflowException bufferoverflowexception)
		//*   6   10:astore_2        
			{
				throw new OutOfSpaceException(((Throwable) (bufferoverflowexception)));
		//    7   11:new             #56  <Class CodedOutputStream$OutOfSpaceException>
		//    8   14:dup             
		//    9   15:aload_2         
		//   10   16:invokespecial   #59  <Method void CodedOutputStream$OutOfSpaceException(Throwable)>
		//   11   19:athrow          
			}
		}

		public void write(ByteBuffer bytebuffer)
			throws IOException
		{
			try
			{
				buffer.put(bytebuffer);
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field ByteBuffer buffer>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #81  <Method ByteBuffer ByteBuffer.put(ByteBuffer)>
		//    4    8:pop             
				return;
		//    5    9:return          
			}
			// Misplaced declaration of an exception variable
			catch(ByteBuffer bytebuffer)
		//*   6   10:astore_1        
			{
				throw new OutOfSpaceException(((Throwable) (bytebuffer)));
		//    7   11:new             #56  <Class CodedOutputStream$OutOfSpaceException>
		//    8   14:dup             
		//    9   15:aload_1         
		//   10   16:invokespecial   #59  <Method void CodedOutputStream$OutOfSpaceException(Throwable)>
		//   11   19:athrow          
			}
		}

		public void write(byte abyte0[], int i, int j)
			throws IOException
		{
			try
			{
				buffer.put(abyte0, i, j);
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field ByteBuffer buffer>
		//    2    4:aload_1         
		//    3    5:iload_2         
		//    4    6:iload_3         
		//    5    7:invokevirtual   #85  <Method ByteBuffer ByteBuffer.put(byte[], int, int)>
		//    6   10:pop             
				return;
		//    7   11:return          
			}
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
		//*   8   12:astore_1        
			{
				throw new OutOfSpaceException(((Throwable) (abyte0)));
		//    9   13:new             #56  <Class CodedOutputStream$OutOfSpaceException>
		//   10   16:dup             
		//   11   17:aload_1         
		//   12   18:invokespecial   #59  <Method void CodedOutputStream$OutOfSpaceException(Throwable)>
		//   13   21:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
		//*  14   22:astore_1        
			{
				throw new OutOfSpaceException(((Throwable) (abyte0)));
		//   15   23:new             #56  <Class CodedOutputStream$OutOfSpaceException>
		//   16   26:dup             
		//   17   27:aload_1         
		//   18   28:invokespecial   #59  <Method void CodedOutputStream$OutOfSpaceException(Throwable)>
		//   19   31:athrow          
			}
		}

		public void writeBool(int i, boolean flag)
			throws IOException
		{
			writeTag(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
			if(flag)
		//*   4    6:iload_2         
		//*   5    7:ifeq            15
				i = 1;
		//    6   10:iconst_1        
		//    7   11:istore_1        
			else
		//*   8   12:goto            17
				i = 0;
		//    9   15:iconst_0        
		//   10   16:istore_1        
			write((byte)i);
		//   11   17:aload_0         
		//   12   18:iload_1         
		//   13   19:int2byte        
		//   14   20:invokevirtual   #93  <Method void write(byte)>
		//   15   23:return          
		}

		public void writeByteArray(int i, byte abyte0[])
			throws IOException
		{
			writeByteArray(i, abyte0, 0, abyte0.length);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:iconst_0        
		//    4    4:aload_2         
		//    5    5:arraylength     
		//    6    6:invokevirtual   #98  <Method void writeByteArray(int, byte[], int, int)>
		//    7    9:return          
		}

		public void writeByteArray(int i, byte abyte0[], int j, int k)
			throws IOException
		{
			writeTag(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
			writeByteArrayNoTag(abyte0, j, k);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:iload_3         
		//    7    9:iload           4
		//    8   11:invokevirtual   #101 <Method void writeByteArrayNoTag(byte[], int, int)>
		//    9   14:return          
		}

		public void writeByteArrayNoTag(byte abyte0[], int i, int j)
			throws IOException
		{
			writeUInt32NoTag(j);
		//    0    0:aload_0         
		//    1    1:iload_3         
		//    2    2:invokevirtual   #105 <Method void writeUInt32NoTag(int)>
			write(abyte0, i, j);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:iload_2         
		//    6    8:iload_3         
		//    7    9:invokevirtual   #107 <Method void write(byte[], int, int)>
		//    8   12:return          
		}

		public void writeByteBuffer(int i, ByteBuffer bytebuffer)
			throws IOException
		{
			writeTag(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
			writeUInt32NoTag(bytebuffer.capacity());
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #112 <Method int ByteBuffer.capacity()>
		//    7   11:invokevirtual   #105 <Method void writeUInt32NoTag(int)>
			writeRawBytes(bytebuffer);
		//    8   14:aload_0         
		//    9   15:aload_2         
		//   10   16:invokevirtual   #115 <Method void writeRawBytes(ByteBuffer)>
		//   11   19:return          
		}

		public void writeBytes(int i, ByteString bytestring)
			throws IOException
		{
			writeTag(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
			writeBytesNoTag(bytestring);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #121 <Method void writeBytesNoTag(ByteString)>
		//    7   11:return          
		}

		public void writeBytesNoTag(ByteString bytestring)
			throws IOException
		{
			writeUInt32NoTag(bytestring.size());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #126 <Method int ByteString.size()>
		//    3    5:invokevirtual   #105 <Method void writeUInt32NoTag(int)>
			bytestring.writeTo(((ByteOutput) (this)));
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:invokevirtual   #130 <Method void ByteString.writeTo(ByteOutput)>
		//    7   13:return          
		}

		public void writeFixed32(int i, int j)
			throws IOException
		{
			writeTag(i, 5);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_5        
		//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
			writeFixed32NoTag(j);
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:invokevirtual   #134 <Method void writeFixed32NoTag(int)>
		//    7   11:return          
		}

		public void writeFixed32NoTag(int i)
			throws IOException
		{
			try
			{
				buffer.putInt(i);
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field ByteBuffer buffer>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #138 <Method ByteBuffer ByteBuffer.putInt(int)>
		//    4    8:pop             
				return;
		//    5    9:return          
			}
			catch(BufferOverflowException bufferoverflowexception)
		//*   6   10:astore_2        
			{
				throw new OutOfSpaceException(((Throwable) (bufferoverflowexception)));
		//    7   11:new             #56  <Class CodedOutputStream$OutOfSpaceException>
		//    8   14:dup             
		//    9   15:aload_2         
		//   10   16:invokespecial   #59  <Method void CodedOutputStream$OutOfSpaceException(Throwable)>
		//   11   19:athrow          
			}
		}

		public void writeFixed64(int i, long l)
			throws IOException
		{
			writeTag(i, 1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_1        
		//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
			writeFixed64NoTag(l);
		//    4    6:aload_0         
		//    5    7:lload_2         
		//    6    8:invokevirtual   #144 <Method void writeFixed64NoTag(long)>
		//    7   11:return          
		}

		public void writeFixed64NoTag(long l)
			throws IOException
		{
			try
			{
				buffer.putLong(l);
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field ByteBuffer buffer>
		//    2    4:lload_1         
		//    3    5:invokevirtual   #148 <Method ByteBuffer ByteBuffer.putLong(long)>
		//    4    8:pop             
				return;
		//    5    9:return          
			}
			catch(BufferOverflowException bufferoverflowexception)
		//*   6   10:astore_3        
			{
				throw new OutOfSpaceException(((Throwable) (bufferoverflowexception)));
		//    7   11:new             #56  <Class CodedOutputStream$OutOfSpaceException>
		//    8   14:dup             
		//    9   15:aload_3         
		//   10   16:invokespecial   #59  <Method void CodedOutputStream$OutOfSpaceException(Throwable)>
		//   11   19:athrow          
			}
		}

		public void writeInt32(int i, int j)
			throws IOException
		{
			writeTag(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
			writeInt32NoTag(j);
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:invokevirtual   #152 <Method void writeInt32NoTag(int)>
		//    7   11:return          
		}

		public void writeInt32NoTag(int i)
			throws IOException
		{
			if(i >= 0)
		//*   0    0:iload_1         
		//*   1    1:iflt            10
			{
				writeUInt32NoTag(i);
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:invokevirtual   #105 <Method void writeUInt32NoTag(int)>
				return;
		//    5    9:return          
			} else
			{
				writeUInt64NoTag(i);
		//    6   10:aload_0         
		//    7   11:iload_1         
		//    8   12:i2l             
		//    9   13:invokevirtual   #155 <Method void writeUInt64NoTag(long)>
				return;
		//   10   16:return          
			}
		}

		public void writeLazy(ByteBuffer bytebuffer)
			throws IOException
		{
			write(bytebuffer);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #158 <Method void write(ByteBuffer)>
		//    3    5:return          
		}

		public void writeLazy(byte abyte0[], int i, int j)
			throws IOException
		{
			write(abyte0, i, j);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:iload_3         
		//    4    4:invokevirtual   #107 <Method void write(byte[], int, int)>
		//    5    7:return          
		}

		public void writeMessage(int i, MessageLite messagelite)
			throws IOException
		{
			writeTag(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
			writeMessageNoTag(messagelite);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #164 <Method void writeMessageNoTag(MessageLite)>
		//    7   11:return          
		}

		public void writeMessageNoTag(MessageLite messagelite)
			throws IOException
		{
			writeUInt32NoTag(messagelite.getSerializedSize());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokeinterface #169 <Method int MessageLite.getSerializedSize()>
		//    3    7:invokevirtual   #105 <Method void writeUInt32NoTag(int)>
			messagelite.writeTo(((CodedOutputStream) (this)));
		//    4   10:aload_1         
		//    5   11:aload_0         
		//    6   12:invokeinterface #172 <Method void MessageLite.writeTo(CodedOutputStream)>
		//    7   17:return          
		}

		public void writeMessageSetExtension(int i, MessageLite messagelite)
			throws IOException
		{
			writeTag(1, 3);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:iconst_3        
		//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
			writeUInt32(2, i);
		//    4    6:aload_0         
		//    5    7:iconst_2        
		//    6    8:iload_1         
		//    7    9:invokevirtual   #176 <Method void writeUInt32(int, int)>
			writeMessage(3, messagelite);
		//    8   12:aload_0         
		//    9   13:iconst_3        
		//   10   14:aload_2         
		//   11   15:invokevirtual   #178 <Method void writeMessage(int, MessageLite)>
			writeTag(1, 4);
		//   12   18:aload_0         
		//   13   19:iconst_1        
		//   14   20:iconst_4        
		//   15   21:invokevirtual   #91  <Method void writeTag(int, int)>
		//   16   24:return          
		}

		public void writeRawBytes(ByteBuffer bytebuffer)
			throws IOException
		{
			if(bytebuffer.hasArray())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #182 <Method boolean ByteBuffer.hasArray()>
		//*   2    4:ifeq            24
			{
				write(bytebuffer.array(), bytebuffer.arrayOffset(), bytebuffer.capacity());
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:invokevirtual   #186 <Method byte[] ByteBuffer.array()>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #189 <Method int ByteBuffer.arrayOffset()>
		//    8   16:aload_1         
		//    9   17:invokevirtual   #112 <Method int ByteBuffer.capacity()>
		//   10   20:invokevirtual   #107 <Method void write(byte[], int, int)>
				return;
		//   11   23:return          
			} else
			{
				bytebuffer = bytebuffer.duplicate();
		//   12   24:aload_1         
		//   13   25:invokevirtual   #23  <Method ByteBuffer ByteBuffer.duplicate()>
		//   14   28:astore_1        
				bytebuffer.clear();
		//   15   29:aload_1         
		//   16   30:invokevirtual   #193 <Method java.nio.Buffer ByteBuffer.clear()>
		//   17   33:pop             
				write(bytebuffer);
		//   18   34:aload_0         
		//   19   35:aload_1         
		//   20   36:invokevirtual   #158 <Method void write(ByteBuffer)>
				return;
		//   21   39:return          
			}
		}

		public void writeRawMessageSetExtension(int i, ByteString bytestring)
			throws IOException
		{
			writeTag(1, 3);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:iconst_3        
		//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
			writeUInt32(2, i);
		//    4    6:aload_0         
		//    5    7:iconst_2        
		//    6    8:iload_1         
		//    7    9:invokevirtual   #176 <Method void writeUInt32(int, int)>
			writeBytes(3, bytestring);
		//    8   12:aload_0         
		//    9   13:iconst_3        
		//   10   14:aload_2         
		//   11   15:invokevirtual   #196 <Method void writeBytes(int, ByteString)>
			writeTag(1, 4);
		//   12   18:aload_0         
		//   13   19:iconst_1        
		//   14   20:iconst_4        
		//   15   21:invokevirtual   #91  <Method void writeTag(int, int)>
		//   16   24:return          
		}

		public void writeString(int i, String s)
			throws IOException
		{
			writeTag(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
			writeStringNoTag(s);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #201 <Method void writeStringNoTag(String)>
		//    7   11:return          
		}

		public void writeStringNoTag(String s)
			throws IOException
		{
			int i = buffer.position();
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field ByteBuffer buffer>
		//    2    4:invokevirtual   #39  <Method int ByteBuffer.position()>
		//    3    7:istore_2        
			int j;
			int k;
			try
			{
				j = computeUInt32SizeNoTag(s.length() * 3);
		//    4    8:aload_1         
		//    5    9:invokevirtual   #210 <Method int String.length()>
		//    6   12:iconst_3        
		//    7   13:imul            
		//    8   14:invokestatic    #214 <Method int computeUInt32SizeNoTag(int)>
		//    9   17:istore_3        
				k = computeUInt32SizeNoTag(s.length());
		//   10   18:aload_1         
		//   11   19:invokevirtual   #210 <Method int String.length()>
		//   12   22:invokestatic    #214 <Method int computeUInt32SizeNoTag(int)>
		//   13   25:istore          4
			}
		//*  14   27:iload           4
		//*  15   29:iload_3         
		//*  16   30:icmpne          97
		//*  17   33:aload_0         
		//*  18   34:getfield        #35  <Field ByteBuffer buffer>
		//*  19   37:invokevirtual   #39  <Method int ByteBuffer.position()>
		//*  20   40:iload           4
		//*  21   42:iadd            
		//*  22   43:istore_3        
		//*  23   44:aload_0         
		//*  24   45:getfield        #35  <Field ByteBuffer buffer>
		//*  25   48:iload_3         
		//*  26   49:invokevirtual   #65  <Method java.nio.Buffer ByteBuffer.position(int)>
		//*  27   52:pop             
		//*  28   53:aload_0         
		//*  29   54:aload_1         
		//*  30   55:invokespecial   #216 <Method void encode(String)>
		//*  31   58:aload_0         
		//*  32   59:getfield        #35  <Field ByteBuffer buffer>
		//*  33   62:invokevirtual   #39  <Method int ByteBuffer.position()>
		//*  34   65:istore          4
		//*  35   67:aload_0         
		//*  36   68:getfield        #35  <Field ByteBuffer buffer>
		//*  37   71:iload_2         
		//*  38   72:invokevirtual   #65  <Method java.nio.Buffer ByteBuffer.position(int)>
		//*  39   75:pop             
		//*  40   76:aload_0         
		//*  41   77:iload           4
		//*  42   79:iload_3         
		//*  43   80:isub            
		//*  44   81:invokevirtual   #105 <Method void writeUInt32NoTag(int)>
		//*  45   84:aload_0         
		//*  46   85:getfield        #35  <Field ByteBuffer buffer>
		//*  47   88:iload           4
		//*  48   90:invokevirtual   #65  <Method java.nio.Buffer ByteBuffer.position(int)>
		//*  49   93:pop             
		//*  50   94:goto            110
		//*  51   97:aload_0         
		//*  52   98:aload_1         
		//*  53   99:invokestatic    #220 <Method int Utf8.encodedLength(CharSequence)>
		//*  54  102:invokevirtual   #105 <Method void writeUInt32NoTag(int)>
		//*  55  105:aload_0         
		//*  56  106:aload_1         
		//*  57  107:invokespecial   #216 <Method void encode(String)>
		//*  58  110:return          
			catch(Utf8.UnpairedSurrogateException unpairedsurrogateexception)
		//*  59  111:astore          5
			{
				buffer.position(i);
		//   60  113:aload_0         
		//   61  114:getfield        #35  <Field ByteBuffer buffer>
		//   62  117:iload_2         
		//   63  118:invokevirtual   #65  <Method java.nio.Buffer ByteBuffer.position(int)>
		//   64  121:pop             
				inefficientWriteStringNoTag(s, unpairedsurrogateexception);
		//   65  122:aload_0         
		//   66  123:aload_1         
		//   67  124:aload           5
		//   68  126:invokevirtual   #224 <Method void inefficientWriteStringNoTag(String, Utf8$UnpairedSurrogateException)>
				return;
		//   69  129:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
		//*  70  130:astore_1        
			{
				throw new OutOfSpaceException(((Throwable) (s)));
		//   71  131:new             #56  <Class CodedOutputStream$OutOfSpaceException>
		//   72  134:dup             
		//   73  135:aload_1         
		//   74  136:invokespecial   #59  <Method void CodedOutputStream$OutOfSpaceException(Throwable)>
		//   75  139:athrow          
			}
			if(k != j)
				break MISSING_BLOCK_LABEL_97;
			j = buffer.position() + k;
			buffer.position(j);
			encode(s);
			k = buffer.position();
			buffer.position(i);
			writeUInt32NoTag(k - j);
			buffer.position(k);
			break MISSING_BLOCK_LABEL_110;
			writeUInt32NoTag(Utf8.encodedLength(((CharSequence) (s))));
			encode(s);
		}

		public void writeTag(int i, int j)
			throws IOException
		{
			writeUInt32NoTag(WireFormat.makeTag(i, j));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokestatic    #230 <Method int WireFormat.makeTag(int, int)>
		//    4    6:invokevirtual   #105 <Method void writeUInt32NoTag(int)>
		//    5    9:return          
		}

		public void writeUInt32(int i, int j)
			throws IOException
		{
			writeTag(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
			writeUInt32NoTag(j);
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:invokevirtual   #105 <Method void writeUInt32NoTag(int)>
		//    7   11:return          
		}

		public void writeUInt32NoTag(int i)
			throws IOException
		{
_L1:
			if((i & 0xffffff80) == 0)
		//*   0    0:iload_1         
		//*   1    1:bipush          -128
		//*   2    3:iand            
		//*   3    4:ifne            18
				try
				{
					buffer.put((byte)i);
		//    4    7:aload_0         
		//    5    8:getfield        #35  <Field ByteBuffer buffer>
		//    6   11:iload_1         
		//    7   12:int2byte        
		//    8   13:invokevirtual   #78  <Method ByteBuffer ByteBuffer.put(byte)>
		//    9   16:pop             
					return;
		//   10   17:return          
				}
		//*  11   18:aload_0         
		//*  12   19:getfield        #35  <Field ByteBuffer buffer>
		//*  13   22:iload_1         
		//*  14   23:bipush          127
		//*  15   25:iand            
		//*  16   26:sipush          128
		//*  17   29:ior             
		//*  18   30:int2byte        
		//*  19   31:invokevirtual   #78  <Method ByteBuffer ByteBuffer.put(byte)>
		//*  20   34:pop             
		//*  21   35:iload_1         
		//*  22   36:bipush          7
		//*  23   38:iushr           
		//*  24   39:istore_1        
		//*  25   40:goto            0
				catch(BufferOverflowException bufferoverflowexception)
		//*  26   43:astore_2        
				{
					throw new OutOfSpaceException(((Throwable) (bufferoverflowexception)));
		//   27   44:new             #56  <Class CodedOutputStream$OutOfSpaceException>
		//   28   47:dup             
		//   29   48:aload_2         
		//   30   49:invokespecial   #59  <Method void CodedOutputStream$OutOfSpaceException(Throwable)>
		//   31   52:athrow          
				}
			buffer.put((byte)(i & 0x7f | 0x80));
			i >>>= 7;
			  goto _L1
		}

		public void writeUInt64(int i, long l)
			throws IOException
		{
			writeTag(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
			writeUInt64NoTag(l);
		//    4    6:aload_0         
		//    5    7:lload_2         
		//    6    8:invokevirtual   #155 <Method void writeUInt64NoTag(long)>
		//    7   11:return          
		}

		public void writeUInt64NoTag(long l)
			throws IOException
		{
_L1:
			if((-128L & l) == 0L)
		//*   0    0:ldc2w           #232 <Long -128L>
		//*   1    3:lload_1         
		//*   2    4:land            
		//*   3    5:lconst_0        
		//*   4    6:lcmp            
		//*   5    7:ifne            22
				try
				{
					buffer.put((byte)(int)l);
		//    6   10:aload_0         
		//    7   11:getfield        #35  <Field ByteBuffer buffer>
		//    8   14:lload_1         
		//    9   15:l2i             
		//   10   16:int2byte        
		//   11   17:invokevirtual   #78  <Method ByteBuffer ByteBuffer.put(byte)>
		//   12   20:pop             
					return;
		//   13   21:return          
				}
		//*  14   22:aload_0         
		//*  15   23:getfield        #35  <Field ByteBuffer buffer>
		//*  16   26:lload_1         
		//*  17   27:l2i             
		//*  18   28:bipush          127
		//*  19   30:iand            
		//*  20   31:sipush          128
		//*  21   34:ior             
		//*  22   35:int2byte        
		//*  23   36:invokevirtual   #78  <Method ByteBuffer ByteBuffer.put(byte)>
		//*  24   39:pop             
		//*  25   40:lload_1         
		//*  26   41:bipush          7
		//*  27   43:lushr           
		//*  28   44:lstore_1        
		//*  29   45:goto            0
				catch(BufferOverflowException bufferoverflowexception)
		//*  30   48:astore_3        
				{
					throw new OutOfSpaceException(((Throwable) (bufferoverflowexception)));
		//   31   49:new             #56  <Class CodedOutputStream$OutOfSpaceException>
		//   32   52:dup             
		//   33   53:aload_3         
		//   34   54:invokespecial   #59  <Method void CodedOutputStream$OutOfSpaceException(Throwable)>
		//   35   57:athrow          
				}
			buffer.put((byte)((int)l & 0x7f | 0x80));
			l >>>= 7;
			  goto _L1
		}

		private final ByteBuffer buffer;
		private final int initialPosition;
		private final ByteBuffer originalBuffer;

		SafeDirectNioEncoder(ByteBuffer bytebuffer)
		{
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #15  <Method void CodedOutputStream(CodedOutputStream$1)>
			originalBuffer = bytebuffer;
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:putfield        #17  <Field ByteBuffer originalBuffer>
			buffer = bytebuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
		//    6   10:aload_0         
		//    7   11:aload_1         
		//    8   12:invokevirtual   #23  <Method ByteBuffer ByteBuffer.duplicate()>
		//    9   15:getstatic       #29  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
		//   10   18:invokevirtual   #33  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
		//   11   21:putfield        #35  <Field ByteBuffer buffer>
			initialPosition = bytebuffer.position();
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:invokevirtual   #39  <Method int ByteBuffer.position()>
		//   15   29:putfield        #41  <Field int initialPosition>
		//   16   32:return          
		}
	}

	static final class UnsafeDirectNioEncoder extends CodedOutputStream
	{

		private int bufferPos(long l)
		{
			return (int)(l - address);
		//    0    0:lload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #47  <Field long address>
		//    3    5:lsub            
		//    4    6:l2i             
		//    5    7:ireturn         
		}

		static boolean isSupported()
		{
			return UnsafeUtil.hasUnsafeByteBufferOperations();
		//    0    0:invokestatic    #70  <Method boolean UnsafeUtil.hasUnsafeByteBufferOperations()>
		//    1    3:ireturn         
		}

		private void repositionBuffer(long l)
		{
			buffer.position(bufferPos(l));
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field ByteBuffer buffer>
		//    2    4:aload_0         
		//    3    5:lload_1         
		//    4    6:invokespecial   #74  <Method int bufferPos(long)>
		//    5    9:invokevirtual   #77  <Method java.nio.Buffer ByteBuffer.position(int)>
		//    6   12:pop             
		//    7   13:return          
		}

		public void flush()
		{
			originalBuffer.position(bufferPos(position));
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field ByteBuffer originalBuffer>
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:getfield        #62  <Field long position>
		//    5    9:invokespecial   #74  <Method int bufferPos(long)>
		//    6   12:invokevirtual   #77  <Method java.nio.Buffer ByteBuffer.position(int)>
		//    7   15:pop             
		//    8   16:return          
		}

		public int getTotalBytesWritten()
		{
			return (int)(position - initialPosition);
		//    0    0:aload_0         
		//    1    1:getfield        #62  <Field long position>
		//    2    4:aload_0         
		//    3    5:getfield        #52  <Field long initialPosition>
		//    4    8:lsub            
		//    5    9:l2i             
		//    6   10:ireturn         
		}

		public int spaceLeft()
		{
			return (int)(limit - position);
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field long limit>
		//    2    4:aload_0         
		//    3    5:getfield        #62  <Field long position>
		//    4    8:lsub            
		//    5    9:l2i             
		//    6   10:ireturn         
		}

		public void write(byte byte0)
			throws IOException
		{
			if(position >= limit)
		//*   0    0:aload_0         
		//*   1    1:getfield        #62  <Field long position>
		//*   2    4:aload_0         
		//*   3    5:getfield        #56  <Field long limit>
		//*   4    8:lcmp            
		//*   5    9:iflt            56
			{
				throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
					Long.valueOf(position), Long.valueOf(limit), Integer.valueOf(1)
				}));
		//    6   12:new             #87  <Class CodedOutputStream$OutOfSpaceException>
		//    7   15:dup             
		//    8   16:ldc1            #89  <String "Pos: %d, limit: %d, len: %d">
		//    9   18:iconst_3        
		//   10   19:anewarray       Object[]
		//   11   22:dup             
		//   12   23:iconst_0        
		//   13   24:aload_0         
		//   14   25:getfield        #62  <Field long position>
		//   15   28:invokestatic    #97  <Method Long Long.valueOf(long)>
		//   16   31:aastore         
		//   17   32:dup             
		//   18   33:iconst_1        
		//   19   34:aload_0         
		//   20   35:getfield        #56  <Field long limit>
		//   21   38:invokestatic    #97  <Method Long Long.valueOf(long)>
		//   22   41:aastore         
		//   23   42:dup             
		//   24   43:iconst_2        
		//   25   44:iconst_1        
		//   26   45:invokestatic    #102 <Method Integer Integer.valueOf(int)>
		//   27   48:aastore         
		//   28   49:invokestatic    #108 <Method String String.format(String, Object[])>
		//   29   52:invokespecial   #111 <Method void CodedOutputStream$OutOfSpaceException(String)>
		//   30   55:athrow          
			} else
			{
				long l = position;
		//   31   56:aload_0         
		//   32   57:getfield        #62  <Field long position>
		//   33   60:lstore_2        
				position = 1L + l;
		//   34   61:aload_0         
		//   35   62:lconst_1        
		//   36   63:lload_2         
		//   37   64:ladd            
		//   38   65:putfield        #62  <Field long position>
				UnsafeUtil.putByte(l, byte0);
		//   39   68:lload_2         
		//   40   69:iload_1         
		//   41   70:invokestatic    #115 <Method void UnsafeUtil.putByte(long, byte)>
				return;
		//   42   73:return          
			}
		}

		public void write(ByteBuffer bytebuffer)
			throws IOException
		{
			try
			{
				int i = bytebuffer.remaining();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #121 <Method int ByteBuffer.remaining()>
		//    2    4:istore_2        
				repositionBuffer(position);
		//    3    5:aload_0         
		//    4    6:aload_0         
		//    5    7:getfield        #62  <Field long position>
		//    6   10:invokespecial   #123 <Method void repositionBuffer(long)>
				buffer.put(bytebuffer);
		//    7   13:aload_0         
		//    8   14:getfield        #39  <Field ByteBuffer buffer>
		//    9   17:aload_1         
		//   10   18:invokevirtual   #127 <Method ByteBuffer ByteBuffer.put(ByteBuffer)>
		//   11   21:pop             
				position = position + (long)i;
		//   12   22:aload_0         
		//   13   23:aload_0         
		//   14   24:getfield        #62  <Field long position>
		//   15   27:iload_2         
		//   16   28:i2l             
		//   17   29:ladd            
		//   18   30:putfield        #62  <Field long position>
				return;
		//   19   33:return          
			}
			// Misplaced declaration of an exception variable
			catch(ByteBuffer bytebuffer)
		//*  20   34:astore_1        
			{
				throw new OutOfSpaceException(((Throwable) (bytebuffer)));
		//   21   35:new             #87  <Class CodedOutputStream$OutOfSpaceException>
		//   22   38:dup             
		//   23   39:aload_1         
		//   24   40:invokespecial   #130 <Method void CodedOutputStream$OutOfSpaceException(Throwable)>
		//   25   43:athrow          
			}
		}

		public void write(byte abyte0[], int i, int j)
			throws IOException
		{
			if(abyte0 == null || i < 0 || j < 0 || abyte0.length - j < i || limit - (long)j < position)
		//*   0    0:aload_1         
		//*   1    1:ifnull          35
		//*   2    4:iload_2         
		//*   3    5:iflt            35
		//*   4    8:iload_3         
		//*   5    9:iflt            35
		//*   6   12:aload_1         
		//*   7   13:arraylength     
		//*   8   14:iload_3         
		//*   9   15:isub            
		//*  10   16:iload_2         
		//*  11   17:icmplt          35
		//*  12   20:aload_0         
		//*  13   21:getfield        #56  <Field long limit>
		//*  14   24:iload_3         
		//*  15   25:i2l             
		//*  16   26:lsub            
		//*  17   27:aload_0         
		//*  18   28:getfield        #62  <Field long position>
		//*  19   31:lcmp            
		//*  20   32:ifge            93
			{
				if(abyte0 == null)
		//*  21   35:aload_1         
		//*  22   36:ifnonnull       49
					throw new NullPointerException("value");
		//   23   39:new             #133 <Class NullPointerException>
		//   24   42:dup             
		//   25   43:ldc1            #135 <String "value">
		//   26   45:invokespecial   #136 <Method void NullPointerException(String)>
		//   27   48:athrow          
				else
					throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
						Long.valueOf(position), Long.valueOf(limit), Integer.valueOf(j)
					}));
		//   28   49:new             #87  <Class CodedOutputStream$OutOfSpaceException>
		//   29   52:dup             
		//   30   53:ldc1            #89  <String "Pos: %d, limit: %d, len: %d">
		//   31   55:iconst_3        
		//   32   56:anewarray       Object[]
		//   33   59:dup             
		//   34   60:iconst_0        
		//   35   61:aload_0         
		//   36   62:getfield        #62  <Field long position>
		//   37   65:invokestatic    #97  <Method Long Long.valueOf(long)>
		//   38   68:aastore         
		//   39   69:dup             
		//   40   70:iconst_1        
		//   41   71:aload_0         
		//   42   72:getfield        #56  <Field long limit>
		//   43   75:invokestatic    #97  <Method Long Long.valueOf(long)>
		//   44   78:aastore         
		//   45   79:dup             
		//   46   80:iconst_2        
		//   47   81:iload_3         
		//   48   82:invokestatic    #102 <Method Integer Integer.valueOf(int)>
		//   49   85:aastore         
		//   50   86:invokestatic    #108 <Method String String.format(String, Object[])>
		//   51   89:invokespecial   #111 <Method void CodedOutputStream$OutOfSpaceException(String)>
		//   52   92:athrow          
			} else
			{
				UnsafeUtil.copyMemory(abyte0, i, position, j);
		//   53   93:aload_1         
		//   54   94:iload_2         
		//   55   95:i2l             
		//   56   96:aload_0         
		//   57   97:getfield        #62  <Field long position>
		//   58  100:iload_3         
		//   59  101:i2l             
		//   60  102:invokestatic    #140 <Method void UnsafeUtil.copyMemory(byte[], long, long, long)>
				position = position + (long)j;
		//   61  105:aload_0         
		//   62  106:aload_0         
		//   63  107:getfield        #62  <Field long position>
		//   64  110:iload_3         
		//   65  111:i2l             
		//   66  112:ladd            
		//   67  113:putfield        #62  <Field long position>
				return;
		//   68  116:return          
			}
		}

		public void writeBool(int i, boolean flag)
			throws IOException
		{
			writeTag(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #146 <Method void writeTag(int, int)>
			if(flag)
		//*   4    6:iload_2         
		//*   5    7:ifeq            15
				i = 1;
		//    6   10:iconst_1        
		//    7   11:istore_1        
			else
		//*   8   12:goto            17
				i = 0;
		//    9   15:iconst_0        
		//   10   16:istore_1        
			write((byte)i);
		//   11   17:aload_0         
		//   12   18:iload_1         
		//   13   19:int2byte        
		//   14   20:invokevirtual   #148 <Method void write(byte)>
		//   15   23:return          
		}

		public void writeByteArray(int i, byte abyte0[])
			throws IOException
		{
			writeByteArray(i, abyte0, 0, abyte0.length);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:iconst_0        
		//    4    4:aload_2         
		//    5    5:arraylength     
		//    6    6:invokevirtual   #153 <Method void writeByteArray(int, byte[], int, int)>
		//    7    9:return          
		}

		public void writeByteArray(int i, byte abyte0[], int j, int k)
			throws IOException
		{
			writeTag(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #146 <Method void writeTag(int, int)>
			writeByteArrayNoTag(abyte0, j, k);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:iload_3         
		//    7    9:iload           4
		//    8   11:invokevirtual   #156 <Method void writeByteArrayNoTag(byte[], int, int)>
		//    9   14:return          
		}

		public void writeByteArrayNoTag(byte abyte0[], int i, int j)
			throws IOException
		{
			writeUInt32NoTag(j);
		//    0    0:aload_0         
		//    1    1:iload_3         
		//    2    2:invokevirtual   #160 <Method void writeUInt32NoTag(int)>
			write(abyte0, i, j);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:iload_2         
		//    6    8:iload_3         
		//    7    9:invokevirtual   #162 <Method void write(byte[], int, int)>
		//    8   12:return          
		}

		public void writeByteBuffer(int i, ByteBuffer bytebuffer)
			throws IOException
		{
			writeTag(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #146 <Method void writeTag(int, int)>
			writeUInt32NoTag(bytebuffer.capacity());
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #167 <Method int ByteBuffer.capacity()>
		//    7   11:invokevirtual   #160 <Method void writeUInt32NoTag(int)>
			writeRawBytes(bytebuffer);
		//    8   14:aload_0         
		//    9   15:aload_2         
		//   10   16:invokevirtual   #170 <Method void writeRawBytes(ByteBuffer)>
		//   11   19:return          
		}

		public void writeBytes(int i, ByteString bytestring)
			throws IOException
		{
			writeTag(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #146 <Method void writeTag(int, int)>
			writeBytesNoTag(bytestring);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #176 <Method void writeBytesNoTag(ByteString)>
		//    7   11:return          
		}

		public void writeBytesNoTag(ByteString bytestring)
			throws IOException
		{
			writeUInt32NoTag(bytestring.size());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #181 <Method int ByteString.size()>
		//    3    5:invokevirtual   #160 <Method void writeUInt32NoTag(int)>
			bytestring.writeTo(((ByteOutput) (this)));
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:invokevirtual   #185 <Method void ByteString.writeTo(ByteOutput)>
		//    7   13:return          
		}

		public void writeFixed32(int i, int j)
			throws IOException
		{
			writeTag(i, 5);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_5        
		//    3    3:invokevirtual   #146 <Method void writeTag(int, int)>
			writeFixed32NoTag(j);
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:invokevirtual   #189 <Method void writeFixed32NoTag(int)>
		//    7   11:return          
		}

		public void writeFixed32NoTag(int i)
			throws IOException
		{
			buffer.putInt(bufferPos(position), i);
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field ByteBuffer buffer>
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:getfield        #62  <Field long position>
		//    5    9:invokespecial   #74  <Method int bufferPos(long)>
		//    6   12:iload_1         
		//    7   13:invokevirtual   #193 <Method ByteBuffer ByteBuffer.putInt(int, int)>
		//    8   16:pop             
			position = position + 4L;
		//    9   17:aload_0         
		//   10   18:aload_0         
		//   11   19:getfield        #62  <Field long position>
		//   12   22:ldc2w           #194 <Long 4L>
		//   13   25:ladd            
		//   14   26:putfield        #62  <Field long position>
		//   15   29:return          
		}

		public void writeFixed64(int i, long l)
			throws IOException
		{
			writeTag(i, 1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_1        
		//    3    3:invokevirtual   #146 <Method void writeTag(int, int)>
			writeFixed64NoTag(l);
		//    4    6:aload_0         
		//    5    7:lload_2         
		//    6    8:invokevirtual   #200 <Method void writeFixed64NoTag(long)>
		//    7   11:return          
		}

		public void writeFixed64NoTag(long l)
			throws IOException
		{
			buffer.putLong(bufferPos(position), l);
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field ByteBuffer buffer>
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:getfield        #62  <Field long position>
		//    5    9:invokespecial   #74  <Method int bufferPos(long)>
		//    6   12:lload_1         
		//    7   13:invokevirtual   #204 <Method ByteBuffer ByteBuffer.putLong(int, long)>
		//    8   16:pop             
			position = position + 8L;
		//    9   17:aload_0         
		//   10   18:aload_0         
		//   11   19:getfield        #62  <Field long position>
		//   12   22:ldc2w           #205 <Long 8L>
		//   13   25:ladd            
		//   14   26:putfield        #62  <Field long position>
		//   15   29:return          
		}

		public void writeInt32(int i, int j)
			throws IOException
		{
			writeTag(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #146 <Method void writeTag(int, int)>
			writeInt32NoTag(j);
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:invokevirtual   #210 <Method void writeInt32NoTag(int)>
		//    7   11:return          
		}

		public void writeInt32NoTag(int i)
			throws IOException
		{
			if(i >= 0)
		//*   0    0:iload_1         
		//*   1    1:iflt            10
			{
				writeUInt32NoTag(i);
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:invokevirtual   #160 <Method void writeUInt32NoTag(int)>
				return;
		//    5    9:return          
			} else
			{
				writeUInt64NoTag(i);
		//    6   10:aload_0         
		//    7   11:iload_1         
		//    8   12:i2l             
		//    9   13:invokevirtual   #213 <Method void writeUInt64NoTag(long)>
				return;
		//   10   16:return          
			}
		}

		public void writeLazy(ByteBuffer bytebuffer)
			throws IOException
		{
			write(bytebuffer);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #216 <Method void write(ByteBuffer)>
		//    3    5:return          
		}

		public void writeLazy(byte abyte0[], int i, int j)
			throws IOException
		{
			write(abyte0, i, j);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:iload_3         
		//    4    4:invokevirtual   #162 <Method void write(byte[], int, int)>
		//    5    7:return          
		}

		public void writeMessage(int i, MessageLite messagelite)
			throws IOException
		{
			writeTag(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #146 <Method void writeTag(int, int)>
			writeMessageNoTag(messagelite);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #222 <Method void writeMessageNoTag(MessageLite)>
		//    7   11:return          
		}

		public void writeMessageNoTag(MessageLite messagelite)
			throws IOException
		{
			writeUInt32NoTag(messagelite.getSerializedSize());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokeinterface #227 <Method int MessageLite.getSerializedSize()>
		//    3    7:invokevirtual   #160 <Method void writeUInt32NoTag(int)>
			messagelite.writeTo(((CodedOutputStream) (this)));
		//    4   10:aload_1         
		//    5   11:aload_0         
		//    6   12:invokeinterface #230 <Method void MessageLite.writeTo(CodedOutputStream)>
		//    7   17:return          
		}

		public void writeMessageSetExtension(int i, MessageLite messagelite)
			throws IOException
		{
			writeTag(1, 3);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:iconst_3        
		//    3    3:invokevirtual   #146 <Method void writeTag(int, int)>
			writeUInt32(2, i);
		//    4    6:aload_0         
		//    5    7:iconst_2        
		//    6    8:iload_1         
		//    7    9:invokevirtual   #234 <Method void writeUInt32(int, int)>
			writeMessage(3, messagelite);
		//    8   12:aload_0         
		//    9   13:iconst_3        
		//   10   14:aload_2         
		//   11   15:invokevirtual   #236 <Method void writeMessage(int, MessageLite)>
			writeTag(1, 4);
		//   12   18:aload_0         
		//   13   19:iconst_1        
		//   14   20:iconst_4        
		//   15   21:invokevirtual   #146 <Method void writeTag(int, int)>
		//   16   24:return          
		}

		public void writeRawBytes(ByteBuffer bytebuffer)
			throws IOException
		{
			if(bytebuffer.hasArray())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #239 <Method boolean ByteBuffer.hasArray()>
		//*   2    4:ifeq            24
			{
				write(bytebuffer.array(), bytebuffer.arrayOffset(), bytebuffer.capacity());
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:invokevirtual   #243 <Method byte[] ByteBuffer.array()>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #246 <Method int ByteBuffer.arrayOffset()>
		//    8   16:aload_1         
		//    9   17:invokevirtual   #167 <Method int ByteBuffer.capacity()>
		//   10   20:invokevirtual   #162 <Method void write(byte[], int, int)>
				return;
		//   11   23:return          
			} else
			{
				bytebuffer = bytebuffer.duplicate();
		//   12   24:aload_1         
		//   13   25:invokevirtual   #27  <Method ByteBuffer ByteBuffer.duplicate()>
		//   14   28:astore_1        
				bytebuffer.clear();
		//   15   29:aload_1         
		//   16   30:invokevirtual   #250 <Method java.nio.Buffer ByteBuffer.clear()>
		//   17   33:pop             
				write(bytebuffer);
		//   18   34:aload_0         
		//   19   35:aload_1         
		//   20   36:invokevirtual   #216 <Method void write(ByteBuffer)>
				return;
		//   21   39:return          
			}
		}

		public void writeRawMessageSetExtension(int i, ByteString bytestring)
			throws IOException
		{
			writeTag(1, 3);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:iconst_3        
		//    3    3:invokevirtual   #146 <Method void writeTag(int, int)>
			writeUInt32(2, i);
		//    4    6:aload_0         
		//    5    7:iconst_2        
		//    6    8:iload_1         
		//    7    9:invokevirtual   #234 <Method void writeUInt32(int, int)>
			writeBytes(3, bytestring);
		//    8   12:aload_0         
		//    9   13:iconst_3        
		//   10   14:aload_2         
		//   11   15:invokevirtual   #253 <Method void writeBytes(int, ByteString)>
			writeTag(1, 4);
		//   12   18:aload_0         
		//   13   19:iconst_1        
		//   14   20:iconst_4        
		//   15   21:invokevirtual   #146 <Method void writeTag(int, int)>
		//   16   24:return          
		}

		public void writeString(int i, String s)
			throws IOException
		{
			writeTag(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #146 <Method void writeTag(int, int)>
			writeStringNoTag(s);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #258 <Method void writeStringNoTag(String)>
		//    7   11:return          
		}

		public void writeStringNoTag(String s)
			throws IOException
		{
			long l = position;
		//    0    0:aload_0         
		//    1    1:getfield        #62  <Field long position>
		//    2    4:lstore          4
			int i;
			int j;
			try
			{
				i = computeUInt32SizeNoTag(s.length() * 3);
		//    3    6:aload_1         
		//    4    7:invokevirtual   #267 <Method int String.length()>
		//    5   10:iconst_3        
		//    6   11:imul            
		//    7   12:invokestatic    #271 <Method int computeUInt32SizeNoTag(int)>
		//    8   15:istore_2        
				j = computeUInt32SizeNoTag(s.length());
		//    9   16:aload_1         
		//   10   17:invokevirtual   #267 <Method int String.length()>
		//   11   20:invokestatic    #271 <Method int computeUInt32SizeNoTag(int)>
		//   12   23:istore_3        
			}
		//*  13   24:iload_3         
		//*  14   25:iload_2         
		//*  15   26:icmpne          86
		//*  16   29:aload_0         
		//*  17   30:aload_0         
		//*  18   31:getfield        #62  <Field long position>
		//*  19   34:invokespecial   #74  <Method int bufferPos(long)>
		//*  20   37:iload_3         
		//*  21   38:iadd            
		//*  22   39:istore_2        
		//*  23   40:aload_0         
		//*  24   41:getfield        #39  <Field ByteBuffer buffer>
		//*  25   44:iload_2         
		//*  26   45:invokevirtual   #77  <Method java.nio.Buffer ByteBuffer.position(int)>
		//*  27   48:pop             
		//*  28   49:aload_1         
		//*  29   50:aload_0         
		//*  30   51:getfield        #39  <Field ByteBuffer buffer>
		//*  31   54:invokestatic    #277 <Method void Utf8.encodeUtf8(CharSequence, ByteBuffer)>
		//*  32   57:aload_0         
		//*  33   58:getfield        #39  <Field ByteBuffer buffer>
		//*  34   61:invokevirtual   #50  <Method int ByteBuffer.position()>
		//*  35   64:iload_2         
		//*  36   65:isub            
		//*  37   66:istore_2        
		//*  38   67:aload_0         
		//*  39   68:iload_2         
		//*  40   69:invokevirtual   #160 <Method void writeUInt32NoTag(int)>
		//*  41   72:aload_0         
		//*  42   73:aload_0         
		//*  43   74:getfield        #62  <Field long position>
		//*  44   77:iload_2         
		//*  45   78:i2l             
		//*  46   79:ladd            
		//*  47   80:putfield        #62  <Field long position>
		//*  48   83:goto            123
		//*  49   86:aload_1         
		//*  50   87:invokestatic    #281 <Method int Utf8.encodedLength(CharSequence)>
		//*  51   90:istore_2        
		//*  52   91:aload_0         
		//*  53   92:iload_2         
		//*  54   93:invokevirtual   #160 <Method void writeUInt32NoTag(int)>
		//*  55   96:aload_0         
		//*  56   97:aload_0         
		//*  57   98:getfield        #62  <Field long position>
		//*  58  101:invokespecial   #123 <Method void repositionBuffer(long)>
		//*  59  104:aload_1         
		//*  60  105:aload_0         
		//*  61  106:getfield        #39  <Field ByteBuffer buffer>
		//*  62  109:invokestatic    #277 <Method void Utf8.encodeUtf8(CharSequence, ByteBuffer)>
		//*  63  112:aload_0         
		//*  64  113:aload_0         
		//*  65  114:getfield        #62  <Field long position>
		//*  66  117:iload_2         
		//*  67  118:i2l             
		//*  68  119:ladd            
		//*  69  120:putfield        #62  <Field long position>
		//*  70  123:return          
			catch(Utf8.UnpairedSurrogateException unpairedsurrogateexception)
		//*  71  124:astore          6
			{
				position = l;
		//   72  126:aload_0         
		//   73  127:lload           4
		//   74  129:putfield        #62  <Field long position>
				repositionBuffer(position);
		//   75  132:aload_0         
		//   76  133:aload_0         
		//   77  134:getfield        #62  <Field long position>
		//   78  137:invokespecial   #123 <Method void repositionBuffer(long)>
				inefficientWriteStringNoTag(s, unpairedsurrogateexception);
		//   79  140:aload_0         
		//   80  141:aload_1         
		//   81  142:aload           6
		//   82  144:invokevirtual   #285 <Method void inefficientWriteStringNoTag(String, Utf8$UnpairedSurrogateException)>
				return;
		//   83  147:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
		//*  84  148:astore_1        
			{
				throw new OutOfSpaceException(((Throwable) (s)));
		//   85  149:new             #87  <Class CodedOutputStream$OutOfSpaceException>
		//   86  152:dup             
		//   87  153:aload_1         
		//   88  154:invokespecial   #130 <Method void CodedOutputStream$OutOfSpaceException(Throwable)>
		//   89  157:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
		//*  90  158:astore_1        
			{
				throw new OutOfSpaceException(((Throwable) (s)));
		//   91  159:new             #87  <Class CodedOutputStream$OutOfSpaceException>
		//   92  162:dup             
		//   93  163:aload_1         
		//   94  164:invokespecial   #130 <Method void CodedOutputStream$OutOfSpaceException(Throwable)>
		//   95  167:athrow          
			}
			if(j != i)
				break MISSING_BLOCK_LABEL_86;
			i = bufferPos(position) + j;
			buffer.position(i);
			Utf8.encodeUtf8(((CharSequence) (s)), buffer);
			i = buffer.position() - i;
			writeUInt32NoTag(i);
			position = position + (long)i;
			break MISSING_BLOCK_LABEL_123;
			i = Utf8.encodedLength(((CharSequence) (s)));
			writeUInt32NoTag(i);
			repositionBuffer(position);
			Utf8.encodeUtf8(((CharSequence) (s)), buffer);
			position = position + (long)i;
		}

		public void writeTag(int i, int j)
			throws IOException
		{
			writeUInt32NoTag(WireFormat.makeTag(i, j));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokestatic    #291 <Method int WireFormat.makeTag(int, int)>
		//    4    6:invokevirtual   #160 <Method void writeUInt32NoTag(int)>
		//    5    9:return          
		}

		public void writeUInt32(int i, int j)
			throws IOException
		{
			writeTag(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #146 <Method void writeTag(int, int)>
			writeUInt32NoTag(j);
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:invokevirtual   #160 <Method void writeUInt32NoTag(int)>
		//    7   11:return          
		}

		public void writeUInt32NoTag(int i)
			throws IOException
		{
			int j = i;
		//    0    0:iload_1         
		//    1    1:istore_2        
			if(position <= oneVarintLimit)
		//*   2    2:aload_0         
		//*   3    3:getfield        #62  <Field long position>
		//*   4    6:aload_0         
		//*   5    7:getfield        #60  <Field long oneVarintLimit>
		//*   6   10:lcmp            
		//*   7   11:ifgt            73
				do
				{
					if((i & 0xffffff80) == 0)
		//*   8   14:iload_1         
		//*   9   15:bipush          -128
		//*  10   17:iand            
		//*  11   18:ifne            40
					{
						long l = position;
		//   12   21:aload_0         
		//   13   22:getfield        #62  <Field long position>
		//   14   25:lstore_3        
						position = 1L + l;
		//   15   26:aload_0         
		//   16   27:lconst_1        
		//   17   28:lload_3         
		//   18   29:ladd            
		//   19   30:putfield        #62  <Field long position>
						UnsafeUtil.putByte(l, (byte)i);
		//   20   33:lload_3         
		//   21   34:iload_1         
		//   22   35:int2byte        
		//   23   36:invokestatic    #115 <Method void UnsafeUtil.putByte(long, byte)>
						return;
		//   24   39:return          
					}
					long l1 = position;
		//   25   40:aload_0         
		//   26   41:getfield        #62  <Field long position>
		//   27   44:lstore_3        
					position = 1L + l1;
		//   28   45:aload_0         
		//   29   46:lconst_1        
		//   30   47:lload_3         
		//   31   48:ladd            
		//   32   49:putfield        #62  <Field long position>
					UnsafeUtil.putByte(l1, (byte)(i & 0x7f | 0x80));
		//   33   52:lload_3         
		//   34   53:iload_1         
		//   35   54:bipush          127
		//   36   56:iand            
		//   37   57:sipush          128
		//   38   60:ior             
		//   39   61:int2byte        
		//   40   62:invokestatic    #115 <Method void UnsafeUtil.putByte(long, byte)>
					i >>>= 7;
		//   41   65:iload_1         
		//   42   66:bipush          7
		//   43   68:iushr           
		//   44   69:istore_1        
				} while(true);
		//   45   70:goto            14
			while(position < limit) 
		//*  46   73:aload_0         
		//*  47   74:getfield        #62  <Field long position>
		//*  48   77:aload_0         
		//*  49   78:getfield        #56  <Field long limit>
		//*  50   81:lcmp            
		//*  51   82:ifge            144
			{
				if((j & 0xffffff80) == 0)
		//*  52   85:iload_2         
		//*  53   86:bipush          -128
		//*  54   88:iand            
		//*  55   89:ifne            111
				{
					long l2 = position;
		//   56   92:aload_0         
		//   57   93:getfield        #62  <Field long position>
		//   58   96:lstore_3        
					position = 1L + l2;
		//   59   97:aload_0         
		//   60   98:lconst_1        
		//   61   99:lload_3         
		//   62  100:ladd            
		//   63  101:putfield        #62  <Field long position>
					UnsafeUtil.putByte(l2, (byte)j);
		//   64  104:lload_3         
		//   65  105:iload_2         
		//   66  106:int2byte        
		//   67  107:invokestatic    #115 <Method void UnsafeUtil.putByte(long, byte)>
					return;
		//   68  110:return          
				}
				long l3 = position;
		//   69  111:aload_0         
		//   70  112:getfield        #62  <Field long position>
		//   71  115:lstore_3        
				position = 1L + l3;
		//   72  116:aload_0         
		//   73  117:lconst_1        
		//   74  118:lload_3         
		//   75  119:ladd            
		//   76  120:putfield        #62  <Field long position>
				UnsafeUtil.putByte(l3, (byte)(j & 0x7f | 0x80));
		//   77  123:lload_3         
		//   78  124:iload_2         
		//   79  125:bipush          127
		//   80  127:iand            
		//   81  128:sipush          128
		//   82  131:ior             
		//   83  132:int2byte        
		//   84  133:invokestatic    #115 <Method void UnsafeUtil.putByte(long, byte)>
				j >>>= 7;
		//   85  136:iload_2         
		//   86  137:bipush          7
		//   87  139:iushr           
		//   88  140:istore_2        
			}
		//*  89  141:goto            73
			throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
				Long.valueOf(position), Long.valueOf(limit), Integer.valueOf(1)
			}));
		//   90  144:new             #87  <Class CodedOutputStream$OutOfSpaceException>
		//   91  147:dup             
		//   92  148:ldc1            #89  <String "Pos: %d, limit: %d, len: %d">
		//   93  150:iconst_3        
		//   94  151:anewarray       Object[]
		//   95  154:dup             
		//   96  155:iconst_0        
		//   97  156:aload_0         
		//   98  157:getfield        #62  <Field long position>
		//   99  160:invokestatic    #97  <Method Long Long.valueOf(long)>
		//  100  163:aastore         
		//  101  164:dup             
		//  102  165:iconst_1        
		//  103  166:aload_0         
		//  104  167:getfield        #56  <Field long limit>
		//  105  170:invokestatic    #97  <Method Long Long.valueOf(long)>
		//  106  173:aastore         
		//  107  174:dup             
		//  108  175:iconst_2        
		//  109  176:iconst_1        
		//  110  177:invokestatic    #102 <Method Integer Integer.valueOf(int)>
		//  111  180:aastore         
		//  112  181:invokestatic    #108 <Method String String.format(String, Object[])>
		//  113  184:invokespecial   #111 <Method void CodedOutputStream$OutOfSpaceException(String)>
		//  114  187:athrow          
		}

		public void writeUInt64(int i, long l)
			throws IOException
		{
			writeTag(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #146 <Method void writeTag(int, int)>
			writeUInt64NoTag(l);
		//    4    6:aload_0         
		//    5    7:lload_2         
		//    6    8:invokevirtual   #213 <Method void writeUInt64NoTag(long)>
		//    7   11:return          
		}

		public void writeUInt64NoTag(long l)
			throws IOException
		{
			long l1 = l;
		//    0    0:lload_1         
		//    1    1:lstore_3        
			if(position <= oneVarintLimit)
		//*   2    2:aload_0         
		//*   3    3:getfield        #62  <Field long position>
		//*   4    6:aload_0         
		//*   5    7:getfield        #60  <Field long oneVarintLimit>
		//*   6   10:lcmp            
		//*   7   11:ifgt            78
				do
				{
					if((-128L & l) == 0L)
		//*   8   14:ldc2w           #293 <Long -128L>
		//*   9   17:lload_1         
		//*  10   18:land            
		//*  11   19:lconst_0        
		//*  12   20:lcmp            
		//*  13   21:ifne            44
					{
						l1 = position;
		//   14   24:aload_0         
		//   15   25:getfield        #62  <Field long position>
		//   16   28:lstore_3        
						position = 1L + l1;
		//   17   29:aload_0         
		//   18   30:lconst_1        
		//   19   31:lload_3         
		//   20   32:ladd            
		//   21   33:putfield        #62  <Field long position>
						UnsafeUtil.putByte(l1, (byte)(int)l);
		//   22   36:lload_3         
		//   23   37:lload_1         
		//   24   38:l2i             
		//   25   39:int2byte        
		//   26   40:invokestatic    #115 <Method void UnsafeUtil.putByte(long, byte)>
						return;
		//   27   43:return          
					}
					l1 = position;
		//   28   44:aload_0         
		//   29   45:getfield        #62  <Field long position>
		//   30   48:lstore_3        
					position = 1L + l1;
		//   31   49:aload_0         
		//   32   50:lconst_1        
		//   33   51:lload_3         
		//   34   52:ladd            
		//   35   53:putfield        #62  <Field long position>
					UnsafeUtil.putByte(l1, (byte)((int)l & 0x7f | 0x80));
		//   36   56:lload_3         
		//   37   57:lload_1         
		//   38   58:l2i             
		//   39   59:bipush          127
		//   40   61:iand            
		//   41   62:sipush          128
		//   42   65:ior             
		//   43   66:int2byte        
		//   44   67:invokestatic    #115 <Method void UnsafeUtil.putByte(long, byte)>
					l >>>= 7;
		//   45   70:lload_1         
		//   46   71:bipush          7
		//   47   73:lushr           
		//   48   74:lstore_1        
				} while(true);
		//   49   75:goto            14
			while(position < limit) 
		//*  50   78:aload_0         
		//*  51   79:getfield        #62  <Field long position>
		//*  52   82:aload_0         
		//*  53   83:getfield        #56  <Field long limit>
		//*  54   86:lcmp            
		//*  55   87:ifge            154
			{
				if((-128L & l1) == 0L)
		//*  56   90:ldc2w           #293 <Long -128L>
		//*  57   93:lload_3         
		//*  58   94:land            
		//*  59   95:lconst_0        
		//*  60   96:lcmp            
		//*  61   97:ifne            120
				{
					l = position;
		//   62  100:aload_0         
		//   63  101:getfield        #62  <Field long position>
		//   64  104:lstore_1        
					position = 1L + l;
		//   65  105:aload_0         
		//   66  106:lconst_1        
		//   67  107:lload_1         
		//   68  108:ladd            
		//   69  109:putfield        #62  <Field long position>
					UnsafeUtil.putByte(l, (byte)(int)l1);
		//   70  112:lload_1         
		//   71  113:lload_3         
		//   72  114:l2i             
		//   73  115:int2byte        
		//   74  116:invokestatic    #115 <Method void UnsafeUtil.putByte(long, byte)>
					return;
		//   75  119:return          
				}
				l = position;
		//   76  120:aload_0         
		//   77  121:getfield        #62  <Field long position>
		//   78  124:lstore_1        
				position = 1L + l;
		//   79  125:aload_0         
		//   80  126:lconst_1        
		//   81  127:lload_1         
		//   82  128:ladd            
		//   83  129:putfield        #62  <Field long position>
				UnsafeUtil.putByte(l, (byte)((int)l1 & 0x7f | 0x80));
		//   84  132:lload_1         
		//   85  133:lload_3         
		//   86  134:l2i             
		//   87  135:bipush          127
		//   88  137:iand            
		//   89  138:sipush          128
		//   90  141:ior             
		//   91  142:int2byte        
		//   92  143:invokestatic    #115 <Method void UnsafeUtil.putByte(long, byte)>
				l1 >>>= 7;
		//   93  146:lload_3         
		//   94  147:bipush          7
		//   95  149:lushr           
		//   96  150:lstore_3        
			}
		//*  97  151:goto            78
			throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
				Long.valueOf(position), Long.valueOf(limit), Integer.valueOf(1)
			}));
		//   98  154:new             #87  <Class CodedOutputStream$OutOfSpaceException>
		//   99  157:dup             
		//  100  158:ldc1            #89  <String "Pos: %d, limit: %d, len: %d">
		//  101  160:iconst_3        
		//  102  161:anewarray       Object[]
		//  103  164:dup             
		//  104  165:iconst_0        
		//  105  166:aload_0         
		//  106  167:getfield        #62  <Field long position>
		//  107  170:invokestatic    #97  <Method Long Long.valueOf(long)>
		//  108  173:aastore         
		//  109  174:dup             
		//  110  175:iconst_1        
		//  111  176:aload_0         
		//  112  177:getfield        #56  <Field long limit>
		//  113  180:invokestatic    #97  <Method Long Long.valueOf(long)>
		//  114  183:aastore         
		//  115  184:dup             
		//  116  185:iconst_2        
		//  117  186:iconst_1        
		//  118  187:invokestatic    #102 <Method Integer Integer.valueOf(int)>
		//  119  190:aastore         
		//  120  191:invokestatic    #108 <Method String String.format(String, Object[])>
		//  121  194:invokespecial   #111 <Method void CodedOutputStream$OutOfSpaceException(String)>
		//  122  197:athrow          
		}

		private final long address;
		private final ByteBuffer buffer;
		private final long initialPosition;
		private final long limit;
		private final long oneVarintLimit;
		private final ByteBuffer originalBuffer;
		private long position;

		UnsafeDirectNioEncoder(ByteBuffer bytebuffer)
		{
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #19  <Method void CodedOutputStream(CodedOutputStream$1)>
			originalBuffer = bytebuffer;
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:putfield        #21  <Field ByteBuffer originalBuffer>
			buffer = bytebuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
		//    6   10:aload_0         
		//    7   11:aload_1         
		//    8   12:invokevirtual   #27  <Method ByteBuffer ByteBuffer.duplicate()>
		//    9   15:getstatic       #33  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
		//   10   18:invokevirtual   #37  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
		//   11   21:putfield        #39  <Field ByteBuffer buffer>
			address = UnsafeUtil.addressOffset(bytebuffer);
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:invokestatic    #45  <Method long UnsafeUtil.addressOffset(ByteBuffer)>
		//   15   29:putfield        #47  <Field long address>
			initialPosition = address + (long)bytebuffer.position();
		//   16   32:aload_0         
		//   17   33:aload_0         
		//   18   34:getfield        #47  <Field long address>
		//   19   37:aload_1         
		//   20   38:invokevirtual   #50  <Method int ByteBuffer.position()>
		//   21   41:i2l             
		//   22   42:ladd            
		//   23   43:putfield        #52  <Field long initialPosition>
			limit = address + (long)bytebuffer.limit();
		//   24   46:aload_0         
		//   25   47:aload_0         
		//   26   48:getfield        #47  <Field long address>
		//   27   51:aload_1         
		//   28   52:invokevirtual   #54  <Method int ByteBuffer.limit()>
		//   29   55:i2l             
		//   30   56:ladd            
		//   31   57:putfield        #56  <Field long limit>
			oneVarintLimit = limit - 10L;
		//   32   60:aload_0         
		//   33   61:aload_0         
		//   34   62:getfield        #56  <Field long limit>
		//   35   65:ldc2w           #57  <Long 10L>
		//   36   68:lsub            
		//   37   69:putfield        #60  <Field long oneVarintLimit>
			position = initialPosition;
		//   38   72:aload_0         
		//   39   73:aload_0         
		//   40   74:getfield        #52  <Field long initialPosition>
		//   41   77:putfield        #62  <Field long position>
		//   42   80:return          
		}
	}


	private CodedOutputStream()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #69  <Method void ByteOutput()>
	//    2    4:return          
	}


	public static int computeBoolSize(int i, boolean flag)
	{
		return computeTagSize(i) + computeBoolSizeNoTag(flag);
	//    0    0:iload_0         
	//    1    1:invokestatic    #78  <Method int computeTagSize(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #82  <Method int computeBoolSizeNoTag(boolean)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeBoolSizeNoTag(boolean flag)
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public static int computeByteArraySize(int i, byte abyte0[])
	{
		return computeTagSize(i) + computeByteArraySizeNoTag(abyte0);
	//    0    0:iload_0         
	//    1    1:invokestatic    #78  <Method int computeTagSize(int)>
	//    2    4:aload_1         
	//    3    5:invokestatic    #88  <Method int computeByteArraySizeNoTag(byte[])>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeByteArraySizeNoTag(byte abyte0[])
	{
		return computeLengthDelimitedFieldSize(abyte0.length);
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:invokestatic    #91  <Method int computeLengthDelimitedFieldSize(int)>
	//    3    5:ireturn         
	}

	public static int computeByteBufferSize(int i, ByteBuffer bytebuffer)
	{
		return computeTagSize(i) + computeByteBufferSizeNoTag(bytebuffer);
	//    0    0:iload_0         
	//    1    1:invokestatic    #78  <Method int computeTagSize(int)>
	//    2    4:aload_1         
	//    3    5:invokestatic    #97  <Method int computeByteBufferSizeNoTag(ByteBuffer)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeByteBufferSizeNoTag(ByteBuffer bytebuffer)
	{
		return computeLengthDelimitedFieldSize(bytebuffer.capacity());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #103 <Method int ByteBuffer.capacity()>
	//    2    4:invokestatic    #91  <Method int computeLengthDelimitedFieldSize(int)>
	//    3    7:ireturn         
	}

	public static int computeBytesSize(int i, ByteString bytestring)
	{
		return computeTagSize(i) + computeBytesSizeNoTag(bytestring);
	//    0    0:iload_0         
	//    1    1:invokestatic    #78  <Method int computeTagSize(int)>
	//    2    4:aload_1         
	//    3    5:invokestatic    #109 <Method int computeBytesSizeNoTag(ByteString)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeBytesSizeNoTag(ByteString bytestring)
	{
		return computeLengthDelimitedFieldSize(bytestring.size());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #114 <Method int ByteString.size()>
	//    2    4:invokestatic    #91  <Method int computeLengthDelimitedFieldSize(int)>
	//    3    7:ireturn         
	}

	public static int computeDoubleSize(int i, double d)
	{
		return computeTagSize(i) + computeDoubleSizeNoTag(d);
	//    0    0:iload_0         
	//    1    1:invokestatic    #78  <Method int computeTagSize(int)>
	//    2    4:dload_1         
	//    3    5:invokestatic    #120 <Method int computeDoubleSizeNoTag(double)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeDoubleSizeNoTag(double d)
	{
		return 8;
	//    0    0:bipush          8
	//    1    2:ireturn         
	}

	public static int computeEnumSize(int i, int j)
	{
		return computeTagSize(i) + computeEnumSizeNoTag(j);
	//    0    0:iload_0         
	//    1    1:invokestatic    #78  <Method int computeTagSize(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #125 <Method int computeEnumSizeNoTag(int)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeEnumSizeNoTag(int i)
	{
		return computeInt32SizeNoTag(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #128 <Method int computeInt32SizeNoTag(int)>
	//    2    4:ireturn         
	}

	public static int computeFixed32Size(int i, int j)
	{
		return computeTagSize(i) + computeFixed32SizeNoTag(j);
	//    0    0:iload_0         
	//    1    1:invokestatic    #78  <Method int computeTagSize(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #132 <Method int computeFixed32SizeNoTag(int)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeFixed32SizeNoTag(int i)
	{
		return 4;
	//    0    0:iconst_4        
	//    1    1:ireturn         
	}

	public static int computeFixed64Size(int i, long l)
	{
		return computeTagSize(i) + computeFixed64SizeNoTag(l);
	//    0    0:iload_0         
	//    1    1:invokestatic    #78  <Method int computeTagSize(int)>
	//    2    4:lload_1         
	//    3    5:invokestatic    #138 <Method int computeFixed64SizeNoTag(long)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeFixed64SizeNoTag(long l)
	{
		return 8;
	//    0    0:bipush          8
	//    1    2:ireturn         
	}

	public static int computeFloatSize(int i, float f)
	{
		return computeTagSize(i) + computeFloatSizeNoTag(f);
	//    0    0:iload_0         
	//    1    1:invokestatic    #78  <Method int computeTagSize(int)>
	//    2    4:fload_1         
	//    3    5:invokestatic    #144 <Method int computeFloatSizeNoTag(float)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeFloatSizeNoTag(float f)
	{
		return 4;
	//    0    0:iconst_4        
	//    1    1:ireturn         
	}

	public static int computeGroupSize(int i, MessageLite messagelite)
	{
		return computeTagSize(i) * 2 + computeGroupSizeNoTag(messagelite);
	//    0    0:iload_0         
	//    1    1:invokestatic    #78  <Method int computeTagSize(int)>
	//    2    4:iconst_2        
	//    3    5:imul            
	//    4    6:aload_1         
	//    5    7:invokestatic    #150 <Method int computeGroupSizeNoTag(MessageLite)>
	//    6   10:iadd            
	//    7   11:ireturn         
	}

	public static int computeGroupSizeNoTag(MessageLite messagelite)
	{
		return messagelite.getSerializedSize();
	//    0    0:aload_0         
	//    1    1:invokeinterface #156 <Method int MessageLite.getSerializedSize()>
	//    2    6:ireturn         
	}

	public static int computeInt32Size(int i, int j)
	{
		return computeTagSize(i) + computeInt32SizeNoTag(j);
	//    0    0:iload_0         
	//    1    1:invokestatic    #78  <Method int computeTagSize(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #128 <Method int computeInt32SizeNoTag(int)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeInt32SizeNoTag(int i)
	{
		if(i >= 0)
	//*   0    0:iload_0         
	//*   1    1:iflt            9
			return computeUInt32SizeNoTag(i);
	//    2    4:iload_0         
	//    3    5:invokestatic    #160 <Method int computeUInt32SizeNoTag(int)>
	//    4    8:ireturn         
		else
			return 10;
	//    5    9:bipush          10
	//    6   11:ireturn         
	}

	public static int computeInt64Size(int i, long l)
	{
		return computeTagSize(i) + computeInt64SizeNoTag(l);
	//    0    0:iload_0         
	//    1    1:invokestatic    #78  <Method int computeTagSize(int)>
	//    2    4:lload_1         
	//    3    5:invokestatic    #164 <Method int computeInt64SizeNoTag(long)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeInt64SizeNoTag(long l)
	{
		return computeUInt64SizeNoTag(l);
	//    0    0:lload_0         
	//    1    1:invokestatic    #167 <Method int computeUInt64SizeNoTag(long)>
	//    2    4:ireturn         
	}

	public static int computeLazyFieldMessageSetExtensionSize(int i, LazyFieldLite lazyfieldlite)
	{
		return computeTagSize(1) * 2 + computeUInt32Size(2, i) + computeLazyFieldSize(3, lazyfieldlite);
	//    0    0:iconst_1        
	//    1    1:invokestatic    #78  <Method int computeTagSize(int)>
	//    2    4:iconst_2        
	//    3    5:imul            
	//    4    6:iconst_2        
	//    5    7:iload_0         
	//    6    8:invokestatic    #172 <Method int computeUInt32Size(int, int)>
	//    7   11:iadd            
	//    8   12:iconst_3        
	//    9   13:aload_1         
	//   10   14:invokestatic    #175 <Method int computeLazyFieldSize(int, LazyFieldLite)>
	//   11   17:iadd            
	//   12   18:ireturn         
	}

	public static int computeLazyFieldSize(int i, LazyFieldLite lazyfieldlite)
	{
		return computeTagSize(i) + computeLazyFieldSizeNoTag(lazyfieldlite);
	//    0    0:iload_0         
	//    1    1:invokestatic    #78  <Method int computeTagSize(int)>
	//    2    4:aload_1         
	//    3    5:invokestatic    #179 <Method int computeLazyFieldSizeNoTag(LazyFieldLite)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeLazyFieldSizeNoTag(LazyFieldLite lazyfieldlite)
	{
		return computeLengthDelimitedFieldSize(lazyfieldlite.getSerializedSize());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #182 <Method int LazyFieldLite.getSerializedSize()>
	//    2    4:invokestatic    #91  <Method int computeLengthDelimitedFieldSize(int)>
	//    3    7:ireturn         
	}

	static int computeLengthDelimitedFieldSize(int i)
	{
		return computeUInt32SizeNoTag(i) + i;
	//    0    0:iload_0         
	//    1    1:invokestatic    #160 <Method int computeUInt32SizeNoTag(int)>
	//    2    4:iload_0         
	//    3    5:iadd            
	//    4    6:ireturn         
	}

	public static int computeMessageSetExtensionSize(int i, MessageLite messagelite)
	{
		return computeTagSize(1) * 2 + computeUInt32Size(2, i) + computeMessageSize(3, messagelite);
	//    0    0:iconst_1        
	//    1    1:invokestatic    #78  <Method int computeTagSize(int)>
	//    2    4:iconst_2        
	//    3    5:imul            
	//    4    6:iconst_2        
	//    5    7:iload_0         
	//    6    8:invokestatic    #172 <Method int computeUInt32Size(int, int)>
	//    7   11:iadd            
	//    8   12:iconst_3        
	//    9   13:aload_1         
	//   10   14:invokestatic    #186 <Method int computeMessageSize(int, MessageLite)>
	//   11   17:iadd            
	//   12   18:ireturn         
	}

	public static int computeMessageSize(int i, MessageLite messagelite)
	{
		return computeTagSize(i) + computeMessageSizeNoTag(messagelite);
	//    0    0:iload_0         
	//    1    1:invokestatic    #78  <Method int computeTagSize(int)>
	//    2    4:aload_1         
	//    3    5:invokestatic    #189 <Method int computeMessageSizeNoTag(MessageLite)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeMessageSizeNoTag(MessageLite messagelite)
	{
		return computeLengthDelimitedFieldSize(messagelite.getSerializedSize());
	//    0    0:aload_0         
	//    1    1:invokeinterface #156 <Method int MessageLite.getSerializedSize()>
	//    2    6:invokestatic    #91  <Method int computeLengthDelimitedFieldSize(int)>
	//    3    9:ireturn         
	}

	static int computePreferredBufferSize(int i)
	{
		if(i > 4096)
	//*   0    0:iload_0         
	//*   1    1:sipush          4096
	//*   2    4:icmple          11
			return 4096;
	//    3    7:sipush          4096
	//    4   10:ireturn         
		else
			return i;
	//    5   11:iload_0         
	//    6   12:ireturn         
	}

	public static int computeRawMessageSetExtensionSize(int i, ByteString bytestring)
	{
		return computeTagSize(1) * 2 + computeUInt32Size(2, i) + computeBytesSize(3, bytestring);
	//    0    0:iconst_1        
	//    1    1:invokestatic    #78  <Method int computeTagSize(int)>
	//    2    4:iconst_2        
	//    3    5:imul            
	//    4    6:iconst_2        
	//    5    7:iload_0         
	//    6    8:invokestatic    #172 <Method int computeUInt32Size(int, int)>
	//    7   11:iadd            
	//    8   12:iconst_3        
	//    9   13:aload_1         
	//   10   14:invokestatic    #193 <Method int computeBytesSize(int, ByteString)>
	//   11   17:iadd            
	//   12   18:ireturn         
	}

	public static int computeRawVarint32Size(int i)
	{
		return computeUInt32SizeNoTag(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #160 <Method int computeUInt32SizeNoTag(int)>
	//    2    4:ireturn         
	}

	public static int computeRawVarint64Size(long l)
	{
		return computeUInt64SizeNoTag(l);
	//    0    0:lload_0         
	//    1    1:invokestatic    #167 <Method int computeUInt64SizeNoTag(long)>
	//    2    4:ireturn         
	}

	public static int computeSFixed32Size(int i, int j)
	{
		return computeTagSize(i) + computeSFixed32SizeNoTag(j);
	//    0    0:iload_0         
	//    1    1:invokestatic    #78  <Method int computeTagSize(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #199 <Method int computeSFixed32SizeNoTag(int)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeSFixed32SizeNoTag(int i)
	{
		return 4;
	//    0    0:iconst_4        
	//    1    1:ireturn         
	}

	public static int computeSFixed64Size(int i, long l)
	{
		return computeTagSize(i) + computeSFixed64SizeNoTag(l);
	//    0    0:iload_0         
	//    1    1:invokestatic    #78  <Method int computeTagSize(int)>
	//    2    4:lload_1         
	//    3    5:invokestatic    #203 <Method int computeSFixed64SizeNoTag(long)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeSFixed64SizeNoTag(long l)
	{
		return 8;
	//    0    0:bipush          8
	//    1    2:ireturn         
	}

	public static int computeSInt32Size(int i, int j)
	{
		return computeTagSize(i) + computeSInt32SizeNoTag(j);
	//    0    0:iload_0         
	//    1    1:invokestatic    #78  <Method int computeTagSize(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #207 <Method int computeSInt32SizeNoTag(int)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeSInt32SizeNoTag(int i)
	{
		return computeUInt32SizeNoTag(encodeZigZag32(i));
	//    0    0:iload_0         
	//    1    1:invokestatic    #210 <Method int encodeZigZag32(int)>
	//    2    4:invokestatic    #160 <Method int computeUInt32SizeNoTag(int)>
	//    3    7:ireturn         
	}

	public static int computeSInt64Size(int i, long l)
	{
		return computeTagSize(i) + computeSInt64SizeNoTag(l);
	//    0    0:iload_0         
	//    1    1:invokestatic    #78  <Method int computeTagSize(int)>
	//    2    4:lload_1         
	//    3    5:invokestatic    #214 <Method int computeSInt64SizeNoTag(long)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeSInt64SizeNoTag(long l)
	{
		return computeUInt64SizeNoTag(encodeZigZag64(l));
	//    0    0:lload_0         
	//    1    1:invokestatic    #218 <Method long encodeZigZag64(long)>
	//    2    4:invokestatic    #167 <Method int computeUInt64SizeNoTag(long)>
	//    3    7:ireturn         
	}

	public static int computeStringSize(int i, String s)
	{
		return computeTagSize(i) + computeStringSizeNoTag(s);
	//    0    0:iload_0         
	//    1    1:invokestatic    #78  <Method int computeTagSize(int)>
	//    2    4:aload_1         
	//    3    5:invokestatic    #224 <Method int computeStringSizeNoTag(String)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeStringSizeNoTag(String s)
	{
		int i;
		try
		{
			i = Utf8.encodedLength(((CharSequence) (s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #232 <Method int Utf8.encodedLength(CharSequence)>
	//    2    4:istore_1        
		}
	//*   3    5:goto            18
		catch(Utf8.UnpairedSurrogateException unpairedsurrogateexception)
	//*   4    8:astore_2        
		{
			i = s.getBytes(Internal.UTF_8).length;
	//    5    9:aload_0         
	//    6   10:getstatic       #238 <Field java.nio.charset.Charset Internal.UTF_8>
	//    7   13:invokevirtual   #244 <Method byte[] String.getBytes(java.nio.charset.Charset)>
	//    8   16:arraylength     
	//    9   17:istore_1        
		}
		return computeLengthDelimitedFieldSize(i);
	//   10   18:iload_1         
	//   11   19:invokestatic    #91  <Method int computeLengthDelimitedFieldSize(int)>
	//   12   22:ireturn         
	}

	public static int computeTagSize(int i)
	{
		return computeUInt32SizeNoTag(WireFormat.makeTag(i, 0));
	//    0    0:iload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #249 <Method int WireFormat.makeTag(int, int)>
	//    3    5:invokestatic    #160 <Method int computeUInt32SizeNoTag(int)>
	//    4    8:ireturn         
	}

	public static int computeUInt32Size(int i, int j)
	{
		return computeTagSize(i) + computeUInt32SizeNoTag(j);
	//    0    0:iload_0         
	//    1    1:invokestatic    #78  <Method int computeTagSize(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #160 <Method int computeUInt32SizeNoTag(int)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeUInt32SizeNoTag(int i)
	{
		if((i & 0xffffff80) == 0)
	//*   0    0:iload_0         
	//*   1    1:bipush          -128
	//*   2    3:iand            
	//*   3    4:ifne            9
			return 1;
	//    4    7:iconst_1        
	//    5    8:ireturn         
		if((i & 0xffffc000) == 0)
	//*   6    9:iload_0         
	//*   7   10:sipush          -16384
	//*   8   13:iand            
	//*   9   14:ifne            19
			return 2;
	//   10   17:iconst_2        
	//   11   18:ireturn         
		if((0xffe00000 & i) == 0)
	//*  12   19:ldc1            #250 <Int 0xffe00000>
	//*  13   21:iload_0         
	//*  14   22:iand            
	//*  15   23:ifne            28
			return 3;
	//   16   26:iconst_3        
	//   17   27:ireturn         
		return (0xf0000000 & i) != 0 ? 5 : 4;
	//   18   28:ldc1            #251 <Int 0xf0000000>
	//   19   30:iload_0         
	//   20   31:iand            
	//   21   32:ifne            37
	//   22   35:iconst_4        
	//   23   36:ireturn         
	//   24   37:iconst_5        
	//   25   38:ireturn         
	}

	public static int computeUInt64Size(int i, long l)
	{
		return computeTagSize(i) + computeUInt64SizeNoTag(l);
	//    0    0:iload_0         
	//    1    1:invokestatic    #78  <Method int computeTagSize(int)>
	//    2    4:lload_1         
	//    3    5:invokestatic    #167 <Method int computeUInt64SizeNoTag(long)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int computeUInt64SizeNoTag(long l)
	{
		if((-128L & l) == 0L)
	//*   0    0:ldc2w           #253 <Long -128L>
	//*   1    3:lload_0         
	//*   2    4:land            
	//*   3    5:lconst_0        
	//*   4    6:lcmp            
	//*   5    7:ifne            12
			return 1;
	//    6   10:iconst_1        
	//    7   11:ireturn         
		if(l < 0L)
	//*   8   12:lload_0         
	//*   9   13:lconst_0        
	//*  10   14:lcmp            
	//*  11   15:ifge            21
			return 10;
	//   12   18:bipush          10
	//   13   20:ireturn         
		int j = 2;
	//   14   21:iconst_2        
	//   15   22:istore_3        
		long l1 = l;
	//   16   23:lload_0         
	//   17   24:lstore          4
		if((0x0L & l) != 0L)
	//*  18   26:ldc2w           #255 <Long 0x0L>
	//*  19   29:lload_0         
	//*  20   30:land            
	//*  21   31:lconst_0        
	//*  22   32:lcmp            
	//*  23   33:ifeq            46
		{
			j = 2 + 4;
	//   24   36:iconst_2        
	//   25   37:iconst_4        
	//   26   38:iadd            
	//   27   39:istore_3        
			l1 = l >>> 28;
	//   28   40:lload_0         
	//   29   41:bipush          28
	//   30   43:lushr           
	//   31   44:lstore          4
		}
		int i = j;
	//   32   46:iload_3         
	//   33   47:istore_2        
		l = l1;
	//   34   48:lload           4
	//   35   50:lstore_0        
		if((0xffe00000L & l1) != 0L)
	//*  36   51:ldc2w           #257 <Long 0xffe00000L>
	//*  37   54:lload           4
	//*  38   56:land            
	//*  39   57:lconst_0        
	//*  40   58:lcmp            
	//*  41   59:ifeq            72
		{
			i = j + 2;
	//   42   62:iload_3         
	//   43   63:iconst_2        
	//   44   64:iadd            
	//   45   65:istore_2        
			l = l1 >>> 14;
	//   46   66:lload           4
	//   47   68:bipush          14
	//   48   70:lushr           
	//   49   71:lstore_0        
		}
		j = i;
	//   50   72:iload_2         
	//   51   73:istore_3        
		if((-16384L & l) != 0L)
	//*  52   74:ldc2w           #259 <Long -16384L>
	//*  53   77:lload_0         
	//*  54   78:land            
	//*  55   79:lconst_0        
	//*  56   80:lcmp            
	//*  57   81:ifeq            88
			j = i + 1;
	//   58   84:iload_2         
	//   59   85:iconst_1        
	//   60   86:iadd            
	//   61   87:istore_3        
		return j;
	//   62   88:iload_3         
	//   63   89:ireturn         
	}

	public static int encodeZigZag32(int i)
	{
		return i << 1 ^ i >> 31;
	//    0    0:iload_0         
	//    1    1:iconst_1        
	//    2    2:ishl            
	//    3    3:iload_0         
	//    4    4:bipush          31
	//    5    6:ishr            
	//    6    7:ixor            
	//    7    8:ireturn         
	}

	public static long encodeZigZag64(long l)
	{
		return l << 1 ^ l >> 63;
	//    0    0:lload_0         
	//    1    1:iconst_1        
	//    2    2:lshl            
	//    3    3:lload_0         
	//    4    4:bipush          63
	//    5    6:lshr            
	//    6    7:lxor            
	//    7    8:lreturn         
	}

	static CodedOutputStream newInstance(ByteOutput byteoutput, int i)
	{
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            15
			throw new IllegalArgumentException("bufferSize must be positive");
	//    2    4:new             #264 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #266 <String "bufferSize must be positive">
	//    5   11:invokespecial   #269 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		else
			return ((CodedOutputStream) (new ByteOutputEncoder(byteoutput, i)));
	//    7   15:new             #14  <Class CodedOutputStream$ByteOutputEncoder>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:iload_1         
	//   11   21:invokespecial   #272 <Method void CodedOutputStream$ByteOutputEncoder(ByteOutput, int)>
	//   12   24:areturn         
	}

	public static CodedOutputStream newInstance(OutputStream outputstream)
	{
		return newInstance(outputstream, 4096);
	//    0    0:aload_0         
	//    1    1:sipush          4096
	//    2    4:invokestatic    #276 <Method CodedOutputStream newInstance(OutputStream, int)>
	//    3    7:areturn         
	}

	public static CodedOutputStream newInstance(OutputStream outputstream, int i)
	{
		return ((CodedOutputStream) (new OutputStreamEncoder(outputstream, i)));
	//    0    0:new             #23  <Class CodedOutputStream$OutputStreamEncoder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #279 <Method void CodedOutputStream$OutputStreamEncoder(OutputStream, int)>
	//    5    9:areturn         
	}

	public static CodedOutputStream newInstance(ByteBuffer bytebuffer)
	{
		if(bytebuffer.hasArray())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #283 <Method boolean ByteBuffer.hasArray()>
	//*   2    4:ifeq            16
			return ((CodedOutputStream) (new HeapNioEncoder(bytebuffer)));
	//    3    7:new             #17  <Class CodedOutputStream$HeapNioEncoder>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #286 <Method void CodedOutputStream$HeapNioEncoder(ByteBuffer)>
	//    7   15:areturn         
		if(bytebuffer.isDirect() && !bytebuffer.isReadOnly())
	//*   8   16:aload_0         
	//*   9   17:invokevirtual   #289 <Method boolean ByteBuffer.isDirect()>
	//*  10   20:ifeq            46
	//*  11   23:aload_0         
	//*  12   24:invokevirtual   #292 <Method boolean ByteBuffer.isReadOnly()>
	//*  13   27:ifne            46
		{
			if(UnsafeDirectNioEncoder.isSupported())
	//*  14   30:invokestatic    #295 <Method boolean CodedOutputStream$UnsafeDirectNioEncoder.isSupported()>
	//*  15   33:ifeq            41
				return newUnsafeInstance(bytebuffer);
	//   16   36:aload_0         
	//   17   37:invokestatic    #298 <Method CodedOutputStream newUnsafeInstance(ByteBuffer)>
	//   18   40:areturn         
			else
				return newSafeInstance(bytebuffer);
	//   19   41:aload_0         
	//   20   42:invokestatic    #301 <Method CodedOutputStream newSafeInstance(ByteBuffer)>
	//   21   45:areturn         
		} else
		{
			throw new IllegalArgumentException("ByteBuffer is read-only");
	//   22   46:new             #264 <Class IllegalArgumentException>
	//   23   49:dup             
	//   24   50:ldc2            #303 <String "ByteBuffer is read-only">
	//   25   53:invokespecial   #269 <Method void IllegalArgumentException(String)>
	//   26   56:athrow          
		}
	}

	public static CodedOutputStream newInstance(ByteBuffer bytebuffer, int i)
	{
		return newInstance(bytebuffer);
	//    0    0:aload_0         
	//    1    1:invokestatic    #306 <Method CodedOutputStream newInstance(ByteBuffer)>
	//    2    4:areturn         
	}

	public static CodedOutputStream newInstance(byte abyte0[])
	{
		return newInstance(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:arraylength     
	//    4    4:invokestatic    #310 <Method CodedOutputStream newInstance(byte[], int, int)>
	//    5    7:areturn         
	}

	public static CodedOutputStream newInstance(byte abyte0[], int i, int j)
	{
		return ((CodedOutputStream) (new ArrayEncoder(abyte0, i, j)));
	//    0    0:new             #11  <Class CodedOutputStream$ArrayEncoder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #313 <Method void CodedOutputStream$ArrayEncoder(byte[], int, int)>
	//    6   10:areturn         
	}

	static CodedOutputStream newSafeInstance(ByteBuffer bytebuffer)
	{
		return ((CodedOutputStream) (new SafeDirectNioEncoder(bytebuffer)));
	//    0    0:new             #26  <Class CodedOutputStream$SafeDirectNioEncoder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #314 <Method void CodedOutputStream$SafeDirectNioEncoder(ByteBuffer)>
	//    4    8:areturn         
	}

	static CodedOutputStream newUnsafeInstance(ByteBuffer bytebuffer)
	{
		return ((CodedOutputStream) (new UnsafeDirectNioEncoder(bytebuffer)));
	//    0    0:new             #29  <Class CodedOutputStream$UnsafeDirectNioEncoder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #315 <Method void CodedOutputStream$UnsafeDirectNioEncoder(ByteBuffer)>
	//    4    8:areturn         
	}

	public final void checkNoSpaceLeft()
	{
		if(spaceLeft() != 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #319 <Method int spaceLeft()>
	//*   2    4:ifeq            18
			throw new IllegalStateException("Did not write as much data as expected.");
	//    3    7:new             #321 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #323 <String "Did not write as much data as expected.">
	//    6   14:invokespecial   #324 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		else
			return;
	//    8   18:return          
	}

	public abstract void flush()
		throws IOException;

	public abstract int getTotalBytesWritten();

	final void inefficientWriteStringNoTag(String s, Utf8.UnpairedSurrogateException unpairedsurrogateexception)
		throws IOException
	{
		logger.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", ((Throwable) (unpairedsurrogateexception)));
	//    0    0:getstatic       #57  <Field Logger logger>
	//    1    3:getstatic       #338 <Field Level Level.WARNING>
	//    2    6:ldc2            #340 <String "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!">
	//    3    9:aload_2         
	//    4   10:invokevirtual   #344 <Method void Logger.log(Level, String, Throwable)>
		s = ((String) (s.getBytes(Internal.UTF_8)));
	//    5   13:aload_1         
	//    6   14:getstatic       #238 <Field java.nio.charset.Charset Internal.UTF_8>
	//    7   17:invokevirtual   #244 <Method byte[] String.getBytes(java.nio.charset.Charset)>
	//    8   20:astore_1        
		try
		{
			writeUInt32NoTag(s.length);
	//    9   21:aload_0         
	//   10   22:aload_1         
	//   11   23:arraylength     
	//   12   24:invokevirtual   #348 <Method void writeUInt32NoTag(int)>
			writeLazy(((byte []) (s)), 0, s.length);
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:iconst_0        
	//   16   30:aload_1         
	//   17   31:arraylength     
	//   18   32:invokevirtual   #351 <Method void writeLazy(byte[], int, int)>
			return;
	//   19   35:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  20   36:astore_1        
		{
			throw new OutOfSpaceException(((Throwable) (s)));
	//   21   37:new             #20  <Class CodedOutputStream$OutOfSpaceException>
	//   22   40:dup             
	//   23   41:aload_1         
	//   24   42:invokespecial   #354 <Method void CodedOutputStream$OutOfSpaceException(Throwable)>
	//   25   45:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  26   46:astore_1        
		{
			throw s;
	//   27   47:aload_1         
	//   28   48:athrow          
		}
	}

	boolean isSerializationDeterministic()
	{
		return serializationDeterministic;
	//    0    0:aload_0         
	//    1    1:getfield        #358 <Field boolean serializationDeterministic>
	//    2    4:ireturn         
	}

	public abstract int spaceLeft();

	public void useDeterministicSerialization()
	{
		serializationDeterministic = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #358 <Field boolean serializationDeterministic>
	//    3    5:return          
	}

	public abstract void write(byte byte0)
		throws IOException;

	public abstract void write(ByteBuffer bytebuffer)
		throws IOException;

	public abstract void write(byte abyte0[], int i, int j)
		throws IOException;

	public abstract void writeBool(int i, boolean flag)
		throws IOException;

	public final void writeBoolNoTag(boolean flag)
		throws IOException
	{
		int i;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            9
			i = 1;
	//    2    4:iconst_1        
	//    3    5:istore_2        
		else
	//*   4    6:goto            11
			i = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		write((byte)i);
	//    7   11:aload_0         
	//    8   12:iload_2         
	//    9   13:int2byte        
	//   10   14:invokevirtual   #367 <Method void write(byte)>
	//   11   17:return          
	}

	public abstract void writeByteArray(int i, byte abyte0[])
		throws IOException;

	public abstract void writeByteArray(int i, byte abyte0[], int j, int k)
		throws IOException;

	public final void writeByteArrayNoTag(byte abyte0[])
		throws IOException
	{
		writeByteArrayNoTag(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:arraylength     
	//    5    5:invokevirtual   #374 <Method void writeByteArrayNoTag(byte[], int, int)>
	//    6    8:return          
	}

	abstract void writeByteArrayNoTag(byte abyte0[], int i, int j)
		throws IOException;

	public abstract void writeByteBuffer(int i, ByteBuffer bytebuffer)
		throws IOException;

	public abstract void writeBytes(int i, ByteString bytestring)
		throws IOException;

	public abstract void writeBytesNoTag(ByteString bytestring)
		throws IOException;

	public final void writeDouble(int i, double d)
		throws IOException
	{
		writeFixed64(i, Double.doubleToRawLongBits(d));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:dload_2         
	//    3    3:invokestatic    #388 <Method long Double.doubleToRawLongBits(double)>
	//    4    6:invokevirtual   #392 <Method void writeFixed64(int, long)>
	//    5    9:return          
	}

	public final void writeDoubleNoTag(double d)
		throws IOException
	{
		writeFixed64NoTag(Double.doubleToRawLongBits(d));
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:invokestatic    #388 <Method long Double.doubleToRawLongBits(double)>
	//    3    5:invokevirtual   #398 <Method void writeFixed64NoTag(long)>
	//    4    8:return          
	}

	public final void writeEnum(int i, int j)
		throws IOException
	{
		writeInt32(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #403 <Method void writeInt32(int, int)>
	//    4    6:return          
	}

	public final void writeEnumNoTag(int i)
		throws IOException
	{
		writeInt32NoTag(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #407 <Method void writeInt32NoTag(int)>
	//    3    5:return          
	}

	public abstract void writeFixed32(int i, int j)
		throws IOException;

	public abstract void writeFixed32NoTag(int i)
		throws IOException;

	public abstract void writeFixed64(int i, long l)
		throws IOException;

	public abstract void writeFixed64NoTag(long l)
		throws IOException;

	public final void writeFloat(int i, float f)
		throws IOException
	{
		writeFixed32(i, Float.floatToRawIntBits(f));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:fload_2         
	//    3    3:invokestatic    #416 <Method int Float.floatToRawIntBits(float)>
	//    4    6:invokevirtual   #418 <Method void writeFixed32(int, int)>
	//    5    9:return          
	}

	public final void writeFloatNoTag(float f)
		throws IOException
	{
		writeFixed32NoTag(Float.floatToRawIntBits(f));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #416 <Method int Float.floatToRawIntBits(float)>
	//    3    5:invokevirtual   #422 <Method void writeFixed32NoTag(int)>
	//    4    8:return          
	}

	public final void writeGroup(int i, MessageLite messagelite)
		throws IOException
	{
		writeTag(i, 3);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_3        
	//    3    3:invokevirtual   #427 <Method void writeTag(int, int)>
		writeGroupNoTag(messagelite);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #431 <Method void writeGroupNoTag(MessageLite)>
		writeTag(i, 4);
	//    7   11:aload_0         
	//    8   12:iload_1         
	//    9   13:iconst_4        
	//   10   14:invokevirtual   #427 <Method void writeTag(int, int)>
	//   11   17:return          
	}

	public final void writeGroupNoTag(MessageLite messagelite)
		throws IOException
	{
		messagelite.writeTo(this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #435 <Method void MessageLite.writeTo(CodedOutputStream)>
	//    3    7:return          
	}

	public abstract void writeInt32(int i, int j)
		throws IOException;

	public abstract void writeInt32NoTag(int i)
		throws IOException;

	public final void writeInt64(int i, long l)
		throws IOException
	{
		writeUInt64(i, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:lload_2         
	//    3    3:invokevirtual   #439 <Method void writeUInt64(int, long)>
	//    4    6:return          
	}

	public final void writeInt64NoTag(long l)
		throws IOException
	{
		writeUInt64NoTag(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #443 <Method void writeUInt64NoTag(long)>
	//    3    5:return          
	}

	public abstract void writeLazy(ByteBuffer bytebuffer)
		throws IOException;

	public abstract void writeLazy(byte abyte0[], int i, int j)
		throws IOException;

	public abstract void writeMessage(int i, MessageLite messagelite)
		throws IOException;

	public abstract void writeMessageNoTag(MessageLite messagelite)
		throws IOException;

	public abstract void writeMessageSetExtension(int i, MessageLite messagelite)
		throws IOException;

	public final void writeRawByte(byte byte0)
		throws IOException
	{
		write(byte0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #367 <Method void write(byte)>
	//    3    5:return          
	}

	public final void writeRawByte(int i)
		throws IOException
	{
		write((byte)i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:int2byte        
	//    3    3:invokevirtual   #367 <Method void write(byte)>
	//    4    6:return          
	}

	public final void writeRawBytes(ByteString bytestring)
		throws IOException
	{
		bytestring.writeTo(((ByteOutput) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #451 <Method void ByteString.writeTo(ByteOutput)>
	//    3    5:return          
	}

	public abstract void writeRawBytes(ByteBuffer bytebuffer)
		throws IOException;

	public final void writeRawBytes(byte abyte0[])
		throws IOException
	{
		write(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:arraylength     
	//    5    5:invokevirtual   #453 <Method void write(byte[], int, int)>
	//    6    8:return          
	}

	public final void writeRawBytes(byte abyte0[], int i, int j)
		throws IOException
	{
		write(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #453 <Method void write(byte[], int, int)>
	//    5    7:return          
	}

	public final void writeRawLittleEndian32(int i)
		throws IOException
	{
		writeFixed32NoTag(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #422 <Method void writeFixed32NoTag(int)>
	//    3    5:return          
	}

	public final void writeRawLittleEndian64(long l)
		throws IOException
	{
		writeFixed64NoTag(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #398 <Method void writeFixed64NoTag(long)>
	//    3    5:return          
	}

	public abstract void writeRawMessageSetExtension(int i, ByteString bytestring)
		throws IOException;

	public final void writeRawVarint32(int i)
		throws IOException
	{
		writeUInt32NoTag(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #348 <Method void writeUInt32NoTag(int)>
	//    3    5:return          
	}

	public final void writeRawVarint64(long l)
		throws IOException
	{
		writeUInt64NoTag(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #443 <Method void writeUInt64NoTag(long)>
	//    3    5:return          
	}

	public final void writeSFixed32(int i, int j)
		throws IOException
	{
		writeFixed32(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #418 <Method void writeFixed32(int, int)>
	//    4    6:return          
	}

	public final void writeSFixed32NoTag(int i)
		throws IOException
	{
		writeFixed32NoTag(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #422 <Method void writeFixed32NoTag(int)>
	//    3    5:return          
	}

	public final void writeSFixed64(int i, long l)
		throws IOException
	{
		writeFixed64(i, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:lload_2         
	//    3    3:invokevirtual   #392 <Method void writeFixed64(int, long)>
	//    4    6:return          
	}

	public final void writeSFixed64NoTag(long l)
		throws IOException
	{
		writeFixed64NoTag(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #398 <Method void writeFixed64NoTag(long)>
	//    3    5:return          
	}

	public final void writeSInt32(int i, int j)
		throws IOException
	{
		writeUInt32(i, encodeZigZag32(j));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #210 <Method int encodeZigZag32(int)>
	//    4    6:invokevirtual   #466 <Method void writeUInt32(int, int)>
	//    5    9:return          
	}

	public final void writeSInt32NoTag(int i)
		throws IOException
	{
		writeUInt32NoTag(encodeZigZag32(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #210 <Method int encodeZigZag32(int)>
	//    3    5:invokevirtual   #348 <Method void writeUInt32NoTag(int)>
	//    4    8:return          
	}

	public final void writeSInt64(int i, long l)
		throws IOException
	{
		writeUInt64(i, encodeZigZag64(l));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:lload_2         
	//    3    3:invokestatic    #218 <Method long encodeZigZag64(long)>
	//    4    6:invokevirtual   #439 <Method void writeUInt64(int, long)>
	//    5    9:return          
	}

	public final void writeSInt64NoTag(long l)
		throws IOException
	{
		writeUInt64NoTag(encodeZigZag64(l));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #218 <Method long encodeZigZag64(long)>
	//    3    5:invokevirtual   #443 <Method void writeUInt64NoTag(long)>
	//    4    8:return          
	}

	public abstract void writeString(int i, String s)
		throws IOException;

	public abstract void writeStringNoTag(String s)
		throws IOException;

	public abstract void writeTag(int i, int j)
		throws IOException;

	public abstract void writeUInt32(int i, int j)
		throws IOException;

	public abstract void writeUInt32NoTag(int i)
		throws IOException;

	public abstract void writeUInt64(int i, long l)
		throws IOException;

	public abstract void writeUInt64NoTag(long l)
		throws IOException;

	public static final int DEFAULT_BUFFER_SIZE = 4096;
	private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = UnsafeUtil.hasUnsafeArrayOperations();
	public static final int LITTLE_ENDIAN_32_SIZE = 4;
	private static final Logger logger = Logger.getLogger(((Class) (com/google/protobuf/CodedOutputStream)).getName());
	private boolean serializationDeterministic;

	static 
	{
	//    0    0:ldc1            #2   <Class CodedOutputStream>
	//    1    2:invokevirtual   #49  <Method String Class.getName()>
	//    2    5:invokestatic    #55  <Method Logger Logger.getLogger(String)>
	//    3    8:putstatic       #57  <Field Logger logger>
	//    4   11:invokestatic    #63  <Method boolean UnsafeUtil.hasUnsafeArrayOperations()>
	//    5   14:putstatic       #65  <Field boolean HAS_UNSAFE_ARRAY_OPERATIONS>
	//*   6   17:return          
	}


/*
	static boolean access$100()
	{
		return HAS_UNSAFE_ARRAY_OPERATIONS;
	//    0    0:getstatic       #65  <Field boolean HAS_UNSAFE_ARRAY_OPERATIONS>
	//    1    3:ireturn         
	}

*/
}
