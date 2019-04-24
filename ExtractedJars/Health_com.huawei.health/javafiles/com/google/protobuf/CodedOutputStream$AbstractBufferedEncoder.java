// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;


// Referenced classes of package com.google.protobuf:
//			CodedOutputStream, WireFormat, UnsafeUtil

static abstract class CodedOutputStream$AbstractBufferedEncoder extends CodedOutputStream
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
		if(CodedOutputStream.access$100())
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
		if(CodedOutputStream.access$100())
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

	CodedOutputStream$AbstractBufferedEncoder(int i)
	{
		super(((CodedOutputStream._cls1) (null)));
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
