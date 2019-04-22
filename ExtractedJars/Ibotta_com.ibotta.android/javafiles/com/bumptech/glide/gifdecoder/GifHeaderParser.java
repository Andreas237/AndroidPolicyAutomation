// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.gifdecoder;

import android.util.Log;
import java.nio.*;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.bumptech.glide.gifdecoder:
//			GifHeader, GifFrame

public class GifHeaderParser
{

	public GifHeaderParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:sipush          256
	//    4    8:newarray        byte[]
	//    5   10:putfield        #18  <Field byte[] block>
		blockSize = 0;
	//    6   13:aload_0         
	//    7   14:iconst_0        
	//    8   15:putfield        #20  <Field int blockSize>
	//    9   18:return          
	}

	private boolean err()
	{
		return header.status != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field GifHeader header>
	//    2    4:getfield        #30  <Field int GifHeader.status>
	//    3    7:ifeq            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	private int read()
	{
		Exception exception;
		byte byte0;
		try
		{
			byte0 = rawData.get();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ByteBuffer rawData>
	//    2    4:invokevirtual   #42  <Method byte ByteBuffer.get()>
	//    3    7:istore_1        
		}
	//*   4    8:iload_1         
	//*   5    9:sipush          255
	//*   6   12:iand            
	//*   7   13:ireturn         
	//*   8   14:aload_0         
	//*   9   15:getfield        #25  <Field GifHeader header>
	//*  10   18:iconst_1        
	//*  11   19:putfield        #30  <Field int GifHeader.status>
	//*  12   22:iconst_0        
	//*  13   23:ireturn         
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			header.status = 1;
			return 0;
		}
		return byte0 & 0xff;
	//*  14   24:astore_2        
	//*  15   25:goto            14
	}

	private void readBitmap()
	{
		header.currentFrame.ix = readShort();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field GifHeader header>
	//    2    4:getfield        #47  <Field GifFrame GifHeader.currentFrame>
	//    3    7:aload_0         
	//    4    8:invokespecial   #50  <Method int readShort()>
	//    5   11:putfield        #55  <Field int GifFrame.ix>
		header.currentFrame.iy = readShort();
	//    6   14:aload_0         
	//    7   15:getfield        #25  <Field GifHeader header>
	//    8   18:getfield        #47  <Field GifFrame GifHeader.currentFrame>
	//    9   21:aload_0         
	//   10   22:invokespecial   #50  <Method int readShort()>
	//   11   25:putfield        #58  <Field int GifFrame.iy>
		header.currentFrame.iw = readShort();
	//   12   28:aload_0         
	//   13   29:getfield        #25  <Field GifHeader header>
	//   14   32:getfield        #47  <Field GifFrame GifHeader.currentFrame>
	//   15   35:aload_0         
	//   16   36:invokespecial   #50  <Method int readShort()>
	//   17   39:putfield        #61  <Field int GifFrame.iw>
		header.currentFrame.ih = readShort();
	//   18   42:aload_0         
	//   19   43:getfield        #25  <Field GifHeader header>
	//   20   46:getfield        #47  <Field GifFrame GifHeader.currentFrame>
	//   21   49:aload_0         
	//   22   50:invokespecial   #50  <Method int readShort()>
	//   23   53:putfield        #64  <Field int GifFrame.ih>
		int i = read();
	//   24   56:aload_0         
	//   25   57:invokespecial   #66  <Method int read()>
	//   26   60:istore_2        
		boolean flag1 = false;
	//   27   61:iconst_0        
	//   28   62:istore          4
		boolean flag;
		if((i & 0x80) != 0)
	//*  29   64:iload_2         
	//*  30   65:sipush          128
	//*  31   68:iand            
	//*  32   69:ifeq            77
			flag = true;
	//   33   72:iconst_1        
	//   34   73:istore_1        
		else
	//*  35   74:goto            79
			flag = false;
	//   36   77:iconst_0        
	//   37   78:istore_1        
		int j = (int)Math.pow(2D, (i & 7) + 1);
	//   38   79:ldc2w           #67  <Double 2D>
	//   39   82:iload_2         
	//   40   83:bipush          7
	//   41   85:iand            
	//   42   86:iconst_1        
	//   43   87:iadd            
	//   44   88:i2d             
	//   45   89:invokestatic    #74  <Method double Math.pow(double, double)>
	//   46   92:d2i             
	//   47   93:istore_3        
		GifFrame gifframe = header.currentFrame;
	//   48   94:aload_0         
	//   49   95:getfield        #25  <Field GifHeader header>
	//   50   98:getfield        #47  <Field GifFrame GifHeader.currentFrame>
	//   51  101:astore          5
		if((i & 0x40) != 0)
	//*  52  103:iload_2         
	//*  53  104:bipush          64
	//*  54  106:iand            
	//*  55  107:ifeq            113
			flag1 = true;
	//   56  110:iconst_1        
	//   57  111:istore          4
		gifframe.interlace = flag1;
	//   58  113:aload           5
	//   59  115:iload           4
	//   60  117:putfield        #78  <Field boolean GifFrame.interlace>
		if(flag)
	//*  61  120:iload_1         
	//*  62  121:ifeq            142
			header.currentFrame.lct = readColorTable(j);
	//   63  124:aload_0         
	//   64  125:getfield        #25  <Field GifHeader header>
	//   65  128:getfield        #47  <Field GifFrame GifHeader.currentFrame>
	//   66  131:aload_0         
	//   67  132:iload_3         
	//   68  133:invokespecial   #82  <Method int[] readColorTable(int)>
	//   69  136:putfield        #86  <Field int[] GifFrame.lct>
		else
	//*  70  139:goto            153
			header.currentFrame.lct = null;
	//   71  142:aload_0         
	//   72  143:getfield        #25  <Field GifHeader header>
	//   73  146:getfield        #47  <Field GifFrame GifHeader.currentFrame>
	//   74  149:aconst_null     
	//   75  150:putfield        #86  <Field int[] GifFrame.lct>
		header.currentFrame.bufferFrameStart = rawData.position();
	//   76  153:aload_0         
	//   77  154:getfield        #25  <Field GifHeader header>
	//   78  157:getfield        #47  <Field GifFrame GifHeader.currentFrame>
	//   79  160:aload_0         
	//   80  161:getfield        #36  <Field ByteBuffer rawData>
	//   81  164:invokevirtual   #89  <Method int ByteBuffer.position()>
	//   82  167:putfield        #92  <Field int GifFrame.bufferFrameStart>
		skipImageData();
	//   83  170:aload_0         
	//   84  171:invokespecial   #95  <Method void skipImageData()>
		if(err())
	//*  85  174:aload_0         
	//*  86  175:invokespecial   #97  <Method boolean err()>
	//*  87  178:ifeq            182
		{
			return;
	//   88  181:return          
		} else
		{
			GifHeader gifheader = header;
	//   89  182:aload_0         
	//   90  183:getfield        #25  <Field GifHeader header>
	//   91  186:astore          5
			gifheader.frameCount = gifheader.frameCount + 1;
	//   92  188:aload           5
	//   93  190:aload           5
	//   94  192:getfield        #100 <Field int GifHeader.frameCount>
	//   95  195:iconst_1        
	//   96  196:iadd            
	//   97  197:putfield        #100 <Field int GifHeader.frameCount>
			header.frames.add(((Object) (header.currentFrame)));
	//   98  200:aload_0         
	//   99  201:getfield        #25  <Field GifHeader header>
	//  100  204:getfield        #104 <Field List GifHeader.frames>
	//  101  207:aload_0         
	//  102  208:getfield        #25  <Field GifHeader header>
	//  103  211:getfield        #47  <Field GifFrame GifHeader.currentFrame>
	//  104  214:invokeinterface #110 <Method boolean List.add(Object)>
	//  105  219:pop             
			return;
	//  106  220:return          
		}
	}

	private void readBlock()
	{
		blockSize = read();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #66  <Method int read()>
	//    3    5:putfield        #20  <Field int blockSize>
		if(blockSize <= 0) goto _L2; else goto _L1
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field int blockSize>
	//    6   12:ifle            150
_L1:
		int i;
		int j;
		j = 0;
	//    7   15:iconst_0        
	//    8   16:istore_2        
		i = 0;
	//    9   17:iconst_0        
	//   10   18:istore_1        
_L3:
		int k = i;
	//   11   19:iload_1         
	//   12   20:istore_3        
		if(j >= blockSize)
			break; /* Loop/switch isn't completed */
	//   13   21:iload_2         
	//   14   22:aload_0         
	//   15   23:getfield        #20  <Field int blockSize>
	//   16   26:icmpge          150
		k = i;
	//   17   29:iload_1         
	//   18   30:istore_3        
		i = blockSize - j;
	//   19   31:aload_0         
	//   20   32:getfield        #20  <Field int blockSize>
	//   21   35:iload_2         
	//   22   36:isub            
	//   23   37:istore_1        
		k = i;
	//   24   38:iload_1         
	//   25   39:istore_3        
		rawData.get(block, j, i);
	//   26   40:aload_0         
	//   27   41:getfield        #36  <Field ByteBuffer rawData>
	//   28   44:aload_0         
	//   29   45:getfield        #18  <Field byte[] block>
	//   30   48:iload_2         
	//   31   49:iload_1         
	//   32   50:invokevirtual   #114 <Method ByteBuffer ByteBuffer.get(byte[], int, int)>
	//   33   53:pop             
		j += i;
	//   34   54:iload_2         
	//   35   55:iload_1         
	//   36   56:iadd            
	//   37   57:istore_2        
		if(true) goto _L3; else goto _L2
	//   38   58:goto            19
		Exception exception;
		exception;
	//   39   61:astore          4
		if(Log.isLoggable("GifHeaderParser", 3))
	//*  40   63:ldc1            #116 <String "GifHeaderParser">
	//*  41   65:iconst_3        
	//*  42   66:invokestatic    #122 <Method boolean Log.isLoggable(String, int)>
	//*  43   69:ifeq            142
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   44   72:new             #124 <Class StringBuilder>
	//   45   75:dup             
	//   46   76:invokespecial   #125 <Method void StringBuilder()>
	//   47   79:astore          5
			stringbuilder.append("Error Reading Block n: ");
	//   48   81:aload           5
	//   49   83:ldc1            #127 <String "Error Reading Block n: ">
	//   50   85:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   51   88:pop             
			stringbuilder.append(j);
	//   52   89:aload           5
	//   53   91:iload_2         
	//   54   92:invokevirtual   #134 <Method StringBuilder StringBuilder.append(int)>
	//   55   95:pop             
			stringbuilder.append(" count: ");
	//   56   96:aload           5
	//   57   98:ldc1            #136 <String " count: ">
	//   58  100:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   59  103:pop             
			stringbuilder.append(k);
	//   60  104:aload           5
	//   61  106:iload_3         
	//   62  107:invokevirtual   #134 <Method StringBuilder StringBuilder.append(int)>
	//   63  110:pop             
			stringbuilder.append(" blockSize: ");
	//   64  111:aload           5
	//   65  113:ldc1            #138 <String " blockSize: ">
	//   66  115:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   67  118:pop             
			stringbuilder.append(blockSize);
	//   68  119:aload           5
	//   69  121:aload_0         
	//   70  122:getfield        #20  <Field int blockSize>
	//   71  125:invokevirtual   #134 <Method StringBuilder StringBuilder.append(int)>
	//   72  128:pop             
			Log.d("GifHeaderParser", stringbuilder.toString(), ((Throwable) (exception)));
	//   73  129:ldc1            #116 <String "GifHeaderParser">
	//   74  131:aload           5
	//   75  133:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   76  136:aload           4
	//   77  138:invokestatic    #146 <Method int Log.d(String, String, Throwable)>
	//   78  141:pop             
		}
		header.status = 1;
	//   79  142:aload_0         
	//   80  143:getfield        #25  <Field GifHeader header>
	//   81  146:iconst_1        
	//   82  147:putfield        #30  <Field int GifHeader.status>
_L2:
	//   83  150:return          
	}

	private int[] readColorTable(int i)
	{
		int ai[];
		byte abyte0[];
		abyte0 = new byte[i * 3];
	//    0    0:iload_1         
	//    1    1:iconst_3        
	//    2    2:imul            
	//    3    3:newarray        byte[]
	//    4    5:astore          8
		ai = null;
	//    5    7:aconst_null     
	//    6    8:astore          6
		int ai1[];
		rawData.get(abyte0);
	//    7   10:aload_0         
	//    8   11:getfield        #36  <Field ByteBuffer rawData>
	//    9   14:aload           8
	//   10   16:invokevirtual   #152 <Method ByteBuffer ByteBuffer.get(byte[])>
	//   11   19:pop             
		ai1 = new int[256];
	//   12   20:sipush          256
	//   13   23:newarray        int[]
	//   14   25:astore          7
		int j = 0;
	//   15   27:iconst_0        
	//   16   28:istore_2        
		int k = 0;
	//   17   29:iconst_0        
	//   18   30:istore_3        
		do
		{
			ai = ai1;
	//   19   31:aload           7
	//   20   33:astore          6
			if(j >= i)
				break;
	//   21   35:iload_2         
	//   22   36:iload_1         
	//   23   37:icmpge          135
			int l = k + 1;
	//   24   40:iload_3         
	//   25   41:iconst_1        
	//   26   42:iadd            
	//   27   43:istore          4
			k = ((int) (abyte0[k]));
	//   28   45:aload           8
	//   29   47:iload_3         
	//   30   48:baload          
	//   31   49:istore_3        
			int i1 = l + 1;
	//   32   50:iload           4
	//   33   52:iconst_1        
	//   34   53:iadd            
	//   35   54:istore          5
			ai1[j] = (k & 0xff) << 16 | 0xff000000 | (abyte0[l] & 0xff) << 8 | abyte0[i1] & 0xff;
	//   36   56:aload           7
	//   37   58:iload_2         
	//   38   59:iload_3         
	//   39   60:sipush          255
	//   40   63:iand            
	//   41   64:bipush          16
	//   42   66:ishl            
	//   43   67:ldc1            #153 <Int 0xff000000>
	//   44   69:ior             
	//   45   70:aload           8
	//   46   72:iload           4
	//   47   74:baload          
	//   48   75:sipush          255
	//   49   78:iand            
	//   50   79:bipush          8
	//   51   81:ishl            
	//   52   82:ior             
	//   53   83:aload           8
	//   54   85:iload           5
	//   55   87:baload          
	//   56   88:sipush          255
	//   57   91:iand            
	//   58   92:ior             
	//   59   93:iastore         
			k = i1 + 1;
	//   60   94:iload           5
	//   61   96:iconst_1        
	//   62   97:iadd            
	//   63   98:istore_3        
			j++;
	//   64   99:iload_2         
	//   65  100:iconst_1        
	//   66  101:iadd            
	//   67  102:istore_2        
		} while(true);
	//   68  103:goto            31
		break MISSING_BLOCK_LABEL_135;
		BufferUnderflowException bufferunderflowexception;
		bufferunderflowexception;
	//   69  106:astore          7
		if(Log.isLoggable("GifHeaderParser", 3))
	//*  70  108:ldc1            #116 <String "GifHeaderParser">
	//*  71  110:iconst_3        
	//*  72  111:invokestatic    #122 <Method boolean Log.isLoggable(String, int)>
	//*  73  114:ifeq            127
			Log.d("GifHeaderParser", "Format Error Reading Color Table", ((Throwable) (bufferunderflowexception)));
	//   74  117:ldc1            #116 <String "GifHeaderParser">
	//   75  119:ldc1            #155 <String "Format Error Reading Color Table">
	//   76  121:aload           7
	//   77  123:invokestatic    #146 <Method int Log.d(String, String, Throwable)>
	//   78  126:pop             
		header.status = 1;
	//   79  127:aload_0         
	//   80  128:getfield        #25  <Field GifHeader header>
	//   81  131:iconst_1        
	//   82  132:putfield        #30  <Field int GifHeader.status>
		return ai;
	//   83  135:aload           6
	//   84  137:areturn         
	}

	private void readContents()
	{
		readContents(0x7fffffff);
	//    0    0:aload_0         
	//    1    1:ldc1            #158 <Int 0x7fffffff>
	//    2    3:invokespecial   #161 <Method void readContents(int)>
	//    3    6:return          
	}

	private void readContents(int i)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		do
		{
			if(flag || err() || header.frameCount > i)
				break;
	//    2    2:iload_2         
	//    3    3:ifne            246
	//    4    6:aload_0         
	//    5    7:invokespecial   #97  <Method boolean err()>
	//    6   10:ifne            246
	//    7   13:aload_0         
	//    8   14:getfield        #25  <Field GifHeader header>
	//    9   17:getfield        #100 <Field int GifHeader.frameCount>
	//   10   20:iload_1         
	//   11   21:icmpgt          246
			int j = read();
	//   12   24:aload_0         
	//   13   25:invokespecial   #66  <Method int read()>
	//   14   28:istore_3        
			if(j != 33)
	//*  15   29:iload_3         
	//*  16   30:bipush          33
	//*  17   32:icmpeq          94
			{
				if(j != 44)
	//*  18   35:iload_3         
	//*  19   36:bipush          44
	//*  20   38:icmpeq          63
				{
					if(j != 59)
	//*  21   41:iload_3         
	//*  22   42:bipush          59
	//*  23   44:icmpeq          58
						header.status = 1;
	//   24   47:aload_0         
	//   25   48:getfield        #25  <Field GifHeader header>
	//   26   51:iconst_1        
	//   27   52:putfield        #30  <Field int GifHeader.status>
					else
	//*  28   55:goto            2
						flag = true;
	//   29   58:iconst_1        
	//   30   59:istore_2        
				} else
	//*  31   60:goto            2
				{
					if(header.currentFrame == null)
	//*  32   63:aload_0         
	//*  33   64:getfield        #25  <Field GifHeader header>
	//*  34   67:getfield        #47  <Field GifFrame GifHeader.currentFrame>
	//*  35   70:ifnonnull       87
						header.currentFrame = new GifFrame();
	//   36   73:aload_0         
	//   37   74:getfield        #25  <Field GifHeader header>
	//   38   77:new             #52  <Class GifFrame>
	//   39   80:dup             
	//   40   81:invokespecial   #162 <Method void GifFrame()>
	//   41   84:putfield        #47  <Field GifFrame GifHeader.currentFrame>
					readBitmap();
	//   42   87:aload_0         
	//   43   88:invokespecial   #164 <Method void readBitmap()>
				}
				continue;
	//   44   91:goto            2
			}
			j = read();
	//   45   94:aload_0         
	//   46   95:invokespecial   #66  <Method int read()>
	//   47   98:istore_3        
			if(j != 1)
	//*  48   99:iload_3         
	//*  49  100:iconst_1        
	//*  50  101:icmpeq          239
			{
				if(j != 249)
	//*  51  104:iload_3         
	//*  52  105:sipush          249
	//*  53  108:icmpeq          218
				{
					switch(j)
	//*  54  111:iload_3         
					{
	//*  55  112:tableswitch     254 255: default 136
	//	               254 211
	//	               255 143
					default:
						skip();
	//   56  136:aload_0         
	//   57  137:invokespecial   #167 <Method void skip()>
						break;

	//*  58  140:goto            2
					case 255: 
						readBlock();
	//   59  143:aload_0         
	//   60  144:invokespecial   #169 <Method void readBlock()>
						StringBuilder stringbuilder = new StringBuilder();
	//   61  147:new             #124 <Class StringBuilder>
	//   62  150:dup             
	//   63  151:invokespecial   #125 <Method void StringBuilder()>
	//   64  154:astore          4
						for(int k = 0; k < 11; k++)
	//*  65  156:iconst_0        
	//*  66  157:istore_3        
	//*  67  158:iload_3         
	//*  68  159:bipush          11
	//*  69  161:icmpge          184
							stringbuilder.append((char)block[k]);
	//   70  164:aload           4
	//   71  166:aload_0         
	//   72  167:getfield        #18  <Field byte[] block>
	//   73  170:iload_3         
	//   74  171:baload          
	//   75  172:int2char        
	//   76  173:invokevirtual   #172 <Method StringBuilder StringBuilder.append(char)>
	//   77  176:pop             

	//   78  177:iload_3         
	//   79  178:iconst_1        
	//   80  179:iadd            
	//   81  180:istore_3        
	//*  82  181:goto            158
						if(stringbuilder.toString().equals("NETSCAPE2.0"))
	//*  83  184:aload           4
	//*  84  186:invokevirtual   #142 <Method String StringBuilder.toString()>
	//*  85  189:ldc1            #174 <String "NETSCAPE2.0">
	//*  86  191:invokevirtual   #179 <Method boolean String.equals(Object)>
	//*  87  194:ifeq            204
							readNetscapeExt();
	//   88  197:aload_0         
	//   89  198:invokespecial   #182 <Method void readNetscapeExt()>
						else
	//*  90  201:goto            2
							skip();
	//   91  204:aload_0         
	//   92  205:invokespecial   #167 <Method void skip()>
						break;

	//*  93  208:goto            2
					case 254: 
						skip();
	//   94  211:aload_0         
	//   95  212:invokespecial   #167 <Method void skip()>
						break;
					}
				} else
	//*  96  215:goto            2
				{
					header.currentFrame = new GifFrame();
	//   97  218:aload_0         
	//   98  219:getfield        #25  <Field GifHeader header>
	//   99  222:new             #52  <Class GifFrame>
	//  100  225:dup             
	//  101  226:invokespecial   #162 <Method void GifFrame()>
	//  102  229:putfield        #47  <Field GifFrame GifHeader.currentFrame>
					readGraphicControlExt();
	//  103  232:aload_0         
	//  104  233:invokespecial   #185 <Method void readGraphicControlExt()>
				}
			} else
	//* 105  236:goto            2
			{
				skip();
	//  106  239:aload_0         
	//  107  240:invokespecial   #167 <Method void skip()>
			}
		} while(true);
	//* 108  243:goto            2
	//  109  246:return          
	}

	private void readGraphicControlExt()
	{
		read();
	//    0    0:aload_0         
	//    1    1:invokespecial   #66  <Method int read()>
	//    2    4:pop             
		int i = read();
	//    3    5:aload_0         
	//    4    6:invokespecial   #66  <Method int read()>
	//    5    9:istore_1        
		header.currentFrame.dispose = (i & 0x1c) >> 2;
	//    6   10:aload_0         
	//    7   11:getfield        #25  <Field GifHeader header>
	//    8   14:getfield        #47  <Field GifFrame GifHeader.currentFrame>
	//    9   17:iload_1         
	//   10   18:bipush          28
	//   11   20:iand            
	//   12   21:iconst_2        
	//   13   22:ishr            
	//   14   23:putfield        #188 <Field int GifFrame.dispose>
		int j = header.currentFrame.dispose;
	//   15   26:aload_0         
	//   16   27:getfield        #25  <Field GifHeader header>
	//   17   30:getfield        #47  <Field GifFrame GifHeader.currentFrame>
	//   18   33:getfield        #188 <Field int GifFrame.dispose>
	//   19   36:istore_2        
		boolean flag = true;
	//   20   37:iconst_1        
	//   21   38:istore_3        
		if(j == 0)
	//*  22   39:iload_2         
	//*  23   40:ifne            54
			header.currentFrame.dispose = 1;
	//   24   43:aload_0         
	//   25   44:getfield        #25  <Field GifHeader header>
	//   26   47:getfield        #47  <Field GifFrame GifHeader.currentFrame>
	//   27   50:iconst_1        
	//   28   51:putfield        #188 <Field int GifFrame.dispose>
		GifFrame gifframe = header.currentFrame;
	//   29   54:aload_0         
	//   30   55:getfield        #25  <Field GifHeader header>
	//   31   58:getfield        #47  <Field GifFrame GifHeader.currentFrame>
	//   32   61:astore          4
		if((i & 1) == 0)
	//*  33   63:iload_1         
	//*  34   64:iconst_1        
	//*  35   65:iand            
	//*  36   66:ifeq            72
	//*  37   69:goto            74
			flag = false;
	//   38   72:iconst_0        
	//   39   73:istore_3        
		gifframe.transparency = flag;
	//   40   74:aload           4
	//   41   76:iload_3         
	//   42   77:putfield        #191 <Field boolean GifFrame.transparency>
		j = readShort();
	//   43   80:aload_0         
	//   44   81:invokespecial   #50  <Method int readShort()>
	//   45   84:istore_2        
		i = j;
	//   46   85:iload_2         
	//   47   86:istore_1        
		if(j < 2)
	//*  48   87:iload_2         
	//*  49   88:iconst_2        
	//*  50   89:icmpge          95
			i = 10;
	//   51   92:bipush          10
	//   52   94:istore_1        
		header.currentFrame.delay = i * 10;
	//   53   95:aload_0         
	//   54   96:getfield        #25  <Field GifHeader header>
	//   55   99:getfield        #47  <Field GifFrame GifHeader.currentFrame>
	//   56  102:iload_1         
	//   57  103:bipush          10
	//   58  105:imul            
	//   59  106:putfield        #194 <Field int GifFrame.delay>
		header.currentFrame.transIndex = read();
	//   60  109:aload_0         
	//   61  110:getfield        #25  <Field GifHeader header>
	//   62  113:getfield        #47  <Field GifFrame GifHeader.currentFrame>
	//   63  116:aload_0         
	//   64  117:invokespecial   #66  <Method int read()>
	//   65  120:putfield        #197 <Field int GifFrame.transIndex>
		read();
	//   66  123:aload_0         
	//   67  124:invokespecial   #66  <Method int read()>
	//   68  127:pop             
	//   69  128:return          
	}

	private void readHeader()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #124 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #125 <Method void StringBuilder()>
	//    3    7:astore_2        
		for(int i = 0; i < 6; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:bipush          6
	//*   8   13:icmpge          33
			stringbuilder.append((char)read());
	//    9   16:aload_2         
	//   10   17:aload_0         
	//   11   18:invokespecial   #66  <Method int read()>
	//   12   21:int2char        
	//   13   22:invokevirtual   #172 <Method StringBuilder StringBuilder.append(char)>
	//   14   25:pop             

	//   15   26:iload_1         
	//   16   27:iconst_1        
	//   17   28:iadd            
	//   18   29:istore_1        
	//*  19   30:goto            10
		if(!stringbuilder.toString().startsWith("GIF"))
	//*  20   33:aload_2         
	//*  21   34:invokevirtual   #142 <Method String StringBuilder.toString()>
	//*  22   37:ldc1            #200 <String "GIF">
	//*  23   39:invokevirtual   #204 <Method boolean String.startsWith(String)>
	//*  24   42:ifne            54
		{
			header.status = 1;
	//   25   45:aload_0         
	//   26   46:getfield        #25  <Field GifHeader header>
	//   27   49:iconst_1        
	//   28   50:putfield        #30  <Field int GifHeader.status>
			return;
	//   29   53:return          
		}
		readLSD();
	//   30   54:aload_0         
	//   31   55:invokespecial   #207 <Method void readLSD()>
		if(header.gctFlag && !err())
	//*  32   58:aload_0         
	//*  33   59:getfield        #25  <Field GifHeader header>
	//*  34   62:getfield        #210 <Field boolean GifHeader.gctFlag>
	//*  35   65:ifeq            113
	//*  36   68:aload_0         
	//*  37   69:invokespecial   #97  <Method boolean err()>
	//*  38   72:ifne            113
		{
			GifHeader gifheader = header;
	//   39   75:aload_0         
	//   40   76:getfield        #25  <Field GifHeader header>
	//   41   79:astore_2        
			gifheader.gct = readColorTable(gifheader.gctSize);
	//   42   80:aload_2         
	//   43   81:aload_0         
	//   44   82:aload_2         
	//   45   83:getfield        #213 <Field int GifHeader.gctSize>
	//   46   86:invokespecial   #82  <Method int[] readColorTable(int)>
	//   47   89:putfield        #216 <Field int[] GifHeader.gct>
			gifheader = header;
	//   48   92:aload_0         
	//   49   93:getfield        #25  <Field GifHeader header>
	//   50   96:astore_2        
			gifheader.bgColor = gifheader.gct[header.bgIndex];
	//   51   97:aload_2         
	//   52   98:aload_2         
	//   53   99:getfield        #216 <Field int[] GifHeader.gct>
	//   54  102:aload_0         
	//   55  103:getfield        #25  <Field GifHeader header>
	//   56  106:getfield        #219 <Field int GifHeader.bgIndex>
	//   57  109:iaload          
	//   58  110:putfield        #222 <Field int GifHeader.bgColor>
		}
	//   59  113:return          
	}

	private void readLSD()
	{
		header.width = readShort();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field GifHeader header>
	//    2    4:aload_0         
	//    3    5:invokespecial   #50  <Method int readShort()>
	//    4    8:putfield        #225 <Field int GifHeader.width>
		header.height = readShort();
	//    5   11:aload_0         
	//    6   12:getfield        #25  <Field GifHeader header>
	//    7   15:aload_0         
	//    8   16:invokespecial   #50  <Method int readShort()>
	//    9   19:putfield        #228 <Field int GifHeader.height>
		int i = read();
	//   10   22:aload_0         
	//   11   23:invokespecial   #66  <Method int read()>
	//   12   26:istore_1        
		GifHeader gifheader = header;
	//   13   27:aload_0         
	//   14   28:getfield        #25  <Field GifHeader header>
	//   15   31:astore_3        
		boolean flag;
		if((i & 0x80) != 0)
	//*  16   32:iload_1         
	//*  17   33:sipush          128
	//*  18   36:iand            
	//*  19   37:ifeq            45
			flag = true;
	//   20   40:iconst_1        
	//   21   41:istore_2        
		else
	//*  22   42:goto            47
			flag = false;
	//   23   45:iconst_0        
	//   24   46:istore_2        
		gifheader.gctFlag = flag;
	//   25   47:aload_3         
	//   26   48:iload_2         
	//   27   49:putfield        #210 <Field boolean GifHeader.gctFlag>
		header.gctSize = (int)Math.pow(2D, (i & 7) + 1);
	//   28   52:aload_0         
	//   29   53:getfield        #25  <Field GifHeader header>
	//   30   56:ldc2w           #67  <Double 2D>
	//   31   59:iload_1         
	//   32   60:bipush          7
	//   33   62:iand            
	//   34   63:iconst_1        
	//   35   64:iadd            
	//   36   65:i2d             
	//   37   66:invokestatic    #74  <Method double Math.pow(double, double)>
	//   38   69:d2i             
	//   39   70:putfield        #213 <Field int GifHeader.gctSize>
		header.bgIndex = read();
	//   40   73:aload_0         
	//   41   74:getfield        #25  <Field GifHeader header>
	//   42   77:aload_0         
	//   43   78:invokespecial   #66  <Method int read()>
	//   44   81:putfield        #219 <Field int GifHeader.bgIndex>
		header.pixelAspect = read();
	//   45   84:aload_0         
	//   46   85:getfield        #25  <Field GifHeader header>
	//   47   88:aload_0         
	//   48   89:invokespecial   #66  <Method int read()>
	//   49   92:putfield        #231 <Field int GifHeader.pixelAspect>
	//   50   95:return          
	}

	private void readNetscapeExt()
	{
		do
		{
			readBlock();
	//    0    0:aload_0         
	//    1    1:invokespecial   #169 <Method void readBlock()>
			byte abyte0[] = block;
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field byte[] block>
	//    4    8:astore_3        
			if(abyte0[0] == 1)
	//*   5    9:aload_3         
	//*   6   10:iconst_0        
	//*   7   11:baload          
	//*   8   12:iconst_1        
	//*   9   13:icmpne          45
			{
				byte byte0 = abyte0[1];
	//   10   16:aload_3         
	//   11   17:iconst_1        
	//   12   18:baload          
	//   13   19:istore_1        
				byte byte1 = abyte0[2];
	//   14   20:aload_3         
	//   15   21:iconst_2        
	//   16   22:baload          
	//   17   23:istore_2        
				header.loopCount = (byte1 & 0xff) << 8 | byte0 & 0xff;
	//   18   24:aload_0         
	//   19   25:getfield        #25  <Field GifHeader header>
	//   20   28:iload_2         
	//   21   29:sipush          255
	//   22   32:iand            
	//   23   33:bipush          8
	//   24   35:ishl            
	//   25   36:iload_1         
	//   26   37:sipush          255
	//   27   40:iand            
	//   28   41:ior             
	//   29   42:putfield        #234 <Field int GifHeader.loopCount>
			}
		} while(blockSize > 0 && !err());
	//   30   45:aload_0         
	//   31   46:getfield        #20  <Field int blockSize>
	//   32   49:ifle            59
	//   33   52:aload_0         
	//   34   53:invokespecial   #97  <Method boolean err()>
	//   35   56:ifeq            0
	//   36   59:return          
	}

	private int readShort()
	{
		return ((int) (rawData.getShort()));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ByteBuffer rawData>
	//    2    4:invokevirtual   #238 <Method short ByteBuffer.getShort()>
	//    3    7:ireturn         
	}

	private void reset()
	{
		rawData = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #36  <Field ByteBuffer rawData>
		Arrays.fill(block, (byte)0);
	//    3    5:aload_0         
	//    4    6:getfield        #18  <Field byte[] block>
	//    5    9:iconst_0        
	//    6   10:invokestatic    #245 <Method void Arrays.fill(byte[], byte)>
		header = new GifHeader();
	//    7   13:aload_0         
	//    8   14:new             #27  <Class GifHeader>
	//    9   17:dup             
	//   10   18:invokespecial   #246 <Method void GifHeader()>
	//   11   21:putfield        #25  <Field GifHeader header>
		blockSize = 0;
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:putfield        #20  <Field int blockSize>
	//   15   29:return          
	}

	private void skip()
	{
		int i;
		do
		{
			i = read();
	//    0    0:aload_0         
	//    1    1:invokespecial   #66  <Method int read()>
	//    2    4:istore_1        
			int j = Math.min(rawData.position() + i, rawData.limit());
	//    3    5:aload_0         
	//    4    6:getfield        #36  <Field ByteBuffer rawData>
	//    5    9:invokevirtual   #89  <Method int ByteBuffer.position()>
	//    6   12:iload_1         
	//    7   13:iadd            
	//    8   14:aload_0         
	//    9   15:getfield        #36  <Field ByteBuffer rawData>
	//   10   18:invokevirtual   #249 <Method int ByteBuffer.limit()>
	//   11   21:invokestatic    #253 <Method int Math.min(int, int)>
	//   12   24:istore_2        
			rawData.position(j);
	//   13   25:aload_0         
	//   14   26:getfield        #36  <Field ByteBuffer rawData>
	//   15   29:iload_2         
	//   16   30:invokevirtual   #256 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   17   33:pop             
		} while(i > 0);
	//   18   34:iload_1         
	//   19   35:ifgt            0
	//   20   38:return          
	}

	private void skipImageData()
	{
		read();
	//    0    0:aload_0         
	//    1    1:invokespecial   #66  <Method int read()>
	//    2    4:pop             
		skip();
	//    3    5:aload_0         
	//    4    6:invokespecial   #167 <Method void skip()>
	//    5    9:return          
	}

	public void clear()
	{
		rawData = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #36  <Field ByteBuffer rawData>
		header = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #25  <Field GifHeader header>
	//    6   10:return          
	}

	public GifHeader parseHeader()
	{
		if(rawData != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field ByteBuffer rawData>
	//*   2    4:ifnull          57
		{
			if(err())
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #97  <Method boolean err()>
	//*   5   11:ifeq            19
				return header;
	//    6   14:aload_0         
	//    7   15:getfield        #25  <Field GifHeader header>
	//    8   18:areturn         
			readHeader();
	//    9   19:aload_0         
	//   10   20:invokespecial   #262 <Method void readHeader()>
			if(!err())
	//*  11   23:aload_0         
	//*  12   24:invokespecial   #97  <Method boolean err()>
	//*  13   27:ifne            52
			{
				readContents();
	//   14   30:aload_0         
	//   15   31:invokespecial   #264 <Method void readContents()>
				if(header.frameCount < 0)
	//*  16   34:aload_0         
	//*  17   35:getfield        #25  <Field GifHeader header>
	//*  18   38:getfield        #100 <Field int GifHeader.frameCount>
	//*  19   41:ifge            52
					header.status = 1;
	//   20   44:aload_0         
	//   21   45:getfield        #25  <Field GifHeader header>
	//   22   48:iconst_1        
	//   23   49:putfield        #30  <Field int GifHeader.status>
			}
			return header;
	//   24   52:aload_0         
	//   25   53:getfield        #25  <Field GifHeader header>
	//   26   56:areturn         
		} else
		{
			throw new IllegalStateException("You must call setData() before parseHeader()");
	//   27   57:new             #266 <Class IllegalStateException>
	//   28   60:dup             
	//   29   61:ldc2            #268 <String "You must call setData() before parseHeader()">
	//   30   64:invokespecial   #271 <Method void IllegalStateException(String)>
	//   31   67:athrow          
		}
	}

	public GifHeaderParser setData(ByteBuffer bytebuffer)
	{
		reset();
	//    0    0:aload_0         
	//    1    1:invokespecial   #275 <Method void reset()>
		rawData = bytebuffer.asReadOnlyBuffer();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #279 <Method ByteBuffer ByteBuffer.asReadOnlyBuffer()>
	//    5    9:putfield        #36  <Field ByteBuffer rawData>
		rawData.position(0);
	//    6   12:aload_0         
	//    7   13:getfield        #36  <Field ByteBuffer rawData>
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #256 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   10   20:pop             
		rawData.order(ByteOrder.LITTLE_ENDIAN);
	//   11   21:aload_0         
	//   12   22:getfield        #36  <Field ByteBuffer rawData>
	//   13   25:getstatic       #285 <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//   14   28:invokevirtual   #289 <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   15   31:pop             
		return this;
	//   16   32:aload_0         
	//   17   33:areturn         
	}

	public GifHeaderParser setData(byte abyte0[])
	{
		if(abyte0 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
		{
			setData(ByteBuffer.wrap(abyte0));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #294 <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//    5    9:invokevirtual   #296 <Method GifHeaderParser setData(ByteBuffer)>
	//    6   12:pop             
			return this;
	//    7   13:aload_0         
	//    8   14:areturn         
		} else
		{
			rawData = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #36  <Field ByteBuffer rawData>
			header.status = 2;
	//   12   20:aload_0         
	//   13   21:getfield        #25  <Field GifHeader header>
	//   14   24:iconst_2        
	//   15   25:putfield        #30  <Field int GifHeader.status>
			return this;
	//   16   28:aload_0         
	//   17   29:areturn         
		}
	}

	private final byte block[] = new byte[256];
	private int blockSize;
	private GifHeader header;
	private ByteBuffer rawData;
}
