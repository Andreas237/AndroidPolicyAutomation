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
	//    1    1:invokespecial   #64  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:sipush          256
	//    4    8:newarray        byte[]
	//    5   10:putfield        #66  <Field byte[] block>
		blockSize = 0;
	//    6   13:aload_0         
	//    7   14:iconst_0        
	//    8   15:putfield        #68  <Field int blockSize>
	//    9   18:return          
	}

	private boolean err()
	{
		return header.status != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field GifHeader header>
	//    2    4:getfield        #78  <Field int GifHeader.status>
	//    3    7:ifeq            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	private int read()
	{
		byte byte0;
		try
		{
			byte0 = rawData.get();
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field ByteBuffer rawData>
	//    2    4:invokevirtual   #90  <Method byte ByteBuffer.get()>
	//    3    7:istore_1        
		}
	//*   4    8:iload_1         
	//*   5    9:sipush          255
	//*   6   12:iand            
	//*   7   13:ireturn         
		catch(Exception exception)
	//*   8   14:astore_2        
		{
			header.status = 1;
	//    9   15:aload_0         
	//   10   16:getfield        #73  <Field GifHeader header>
	//   11   19:iconst_1        
	//   12   20:putfield        #78  <Field int GifHeader.status>
			return 0;
	//   13   23:iconst_0        
	//   14   24:ireturn         
		}
		return byte0 & 0xff;
	}

	private void readBitmap()
	{
		header.currentFrame.ix = readShort();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field GifHeader header>
	//    2    4:getfield        #95  <Field GifFrame GifHeader.currentFrame>
	//    3    7:aload_0         
	//    4    8:invokespecial   #98  <Method int readShort()>
	//    5   11:putfield        #103 <Field int GifFrame.ix>
		header.currentFrame.iy = readShort();
	//    6   14:aload_0         
	//    7   15:getfield        #73  <Field GifHeader header>
	//    8   18:getfield        #95  <Field GifFrame GifHeader.currentFrame>
	//    9   21:aload_0         
	//   10   22:invokespecial   #98  <Method int readShort()>
	//   11   25:putfield        #106 <Field int GifFrame.iy>
		header.currentFrame.iw = readShort();
	//   12   28:aload_0         
	//   13   29:getfield        #73  <Field GifHeader header>
	//   14   32:getfield        #95  <Field GifFrame GifHeader.currentFrame>
	//   15   35:aload_0         
	//   16   36:invokespecial   #98  <Method int readShort()>
	//   17   39:putfield        #109 <Field int GifFrame.iw>
		header.currentFrame.ih = readShort();
	//   18   42:aload_0         
	//   19   43:getfield        #73  <Field GifHeader header>
	//   20   46:getfield        #95  <Field GifFrame GifHeader.currentFrame>
	//   21   49:aload_0         
	//   22   50:invokespecial   #98  <Method int readShort()>
	//   23   53:putfield        #112 <Field int GifFrame.ih>
		int i = read();
	//   24   56:aload_0         
	//   25   57:invokespecial   #114 <Method int read()>
	//   26   60:istore_2        
		boolean flag;
		if((i & 0x80) != 0)
	//*  27   61:iload_2         
	//*  28   62:sipush          128
	//*  29   65:iand            
	//*  30   66:ifeq            74
			flag = true;
	//   31   69:iconst_1        
	//   32   70:istore_1        
		else
	//*  33   71:goto            76
			flag = false;
	//   34   74:iconst_0        
	//   35   75:istore_1        
		int j = (int)Math.pow(2D, (i & 7) + 1);
	//   36   76:ldc2w           #115 <Double 2D>
	//   37   79:iload_2         
	//   38   80:bipush          7
	//   39   82:iand            
	//   40   83:iconst_1        
	//   41   84:iadd            
	//   42   85:i2d             
	//   43   86:invokestatic    #122 <Method double Math.pow(double, double)>
	//   44   89:d2i             
	//   45   90:istore_3        
		GifFrame gifframe = header.currentFrame;
	//   46   91:aload_0         
	//   47   92:getfield        #73  <Field GifHeader header>
	//   48   95:getfield        #95  <Field GifFrame GifHeader.currentFrame>
	//   49   98:astore          5
		boolean flag1;
		if((i & 0x40) != 0)
	//*  50  100:iload_2         
	//*  51  101:bipush          64
	//*  52  103:iand            
	//*  53  104:ifeq            113
			flag1 = true;
	//   54  107:iconst_1        
	//   55  108:istore          4
		else
	//*  56  110:goto            116
			flag1 = false;
	//   57  113:iconst_0        
	//   58  114:istore          4
		gifframe.interlace = flag1;
	//   59  116:aload           5
	//   60  118:iload           4
	//   61  120:putfield        #126 <Field boolean GifFrame.interlace>
		if(flag)
	//*  62  123:iload_1         
	//*  63  124:ifeq            145
			header.currentFrame.lct = readColorTable(j);
	//   64  127:aload_0         
	//   65  128:getfield        #73  <Field GifHeader header>
	//   66  131:getfield        #95  <Field GifFrame GifHeader.currentFrame>
	//   67  134:aload_0         
	//   68  135:iload_3         
	//   69  136:invokespecial   #130 <Method int[] readColorTable(int)>
	//   70  139:putfield        #134 <Field int[] GifFrame.lct>
		else
	//*  71  142:goto            156
			header.currentFrame.lct = null;
	//   72  145:aload_0         
	//   73  146:getfield        #73  <Field GifHeader header>
	//   74  149:getfield        #95  <Field GifFrame GifHeader.currentFrame>
	//   75  152:aconst_null     
	//   76  153:putfield        #134 <Field int[] GifFrame.lct>
		header.currentFrame.bufferFrameStart = rawData.position();
	//   77  156:aload_0         
	//   78  157:getfield        #73  <Field GifHeader header>
	//   79  160:getfield        #95  <Field GifFrame GifHeader.currentFrame>
	//   80  163:aload_0         
	//   81  164:getfield        #84  <Field ByteBuffer rawData>
	//   82  167:invokevirtual   #137 <Method int ByteBuffer.position()>
	//   83  170:putfield        #140 <Field int GifFrame.bufferFrameStart>
		skipImageData();
	//   84  173:aload_0         
	//   85  174:invokespecial   #143 <Method void skipImageData()>
		if(err())
	//*  86  177:aload_0         
	//*  87  178:invokespecial   #145 <Method boolean err()>
	//*  88  181:ifeq            185
		{
			return;
	//   89  184:return          
		} else
		{
			GifHeader gifheader = header;
	//   90  185:aload_0         
	//   91  186:getfield        #73  <Field GifHeader header>
	//   92  189:astore          5
			gifheader.frameCount = gifheader.frameCount + 1;
	//   93  191:aload           5
	//   94  193:aload           5
	//   95  195:getfield        #148 <Field int GifHeader.frameCount>
	//   96  198:iconst_1        
	//   97  199:iadd            
	//   98  200:putfield        #148 <Field int GifHeader.frameCount>
			header.frames.add(((Object) (header.currentFrame)));
	//   99  203:aload_0         
	//  100  204:getfield        #73  <Field GifHeader header>
	//  101  207:getfield        #152 <Field List GifHeader.frames>
	//  102  210:aload_0         
	//  103  211:getfield        #73  <Field GifHeader header>
	//  104  214:getfield        #95  <Field GifFrame GifHeader.currentFrame>
	//  105  217:invokeinterface #158 <Method boolean List.add(Object)>
	//  106  222:pop             
			return;
	//  107  223:return          
		}
	}

	private int readBlock()
	{
		int i;
		int j;
		blockSize = read();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #114 <Method int read()>
	//    3    5:putfield        #68  <Field int blockSize>
		i = 0;
	//    4    8:iconst_0        
	//    5    9:istore_1        
		boolean flag = false;
	//    6   10:iconst_0        
	//    7   11:istore_3        
		if(blockSize <= 0)
			break MISSING_BLOCK_LABEL_134;
	//    8   12:aload_0         
	//    9   13:getfield        #68  <Field int blockSize>
	//   10   16:ifle            134
		j = 0;
	//   11   19:iconst_0        
	//   12   20:istore_2        
		i = ((int) (flag));
	//   13   21:iload_3         
	//   14   22:istore_1        
_L2:
		int k = j;
	//   15   23:iload_2         
	//   16   24:istore_3        
		if(i >= blockSize)
			break; /* Loop/switch isn't completed */
	//   17   25:iload_1         
	//   18   26:aload_0         
	//   19   27:getfield        #68  <Field int blockSize>
	//   20   30:icmpge          65
		k = j;
	//   21   33:iload_2         
	//   22   34:istore_3        
		j = blockSize - i;
	//   23   35:aload_0         
	//   24   36:getfield        #68  <Field int blockSize>
	//   25   39:iload_1         
	//   26   40:isub            
	//   27   41:istore_2        
		k = j;
	//   28   42:iload_2         
	//   29   43:istore_3        
		rawData.get(block, i, j);
	//   30   44:aload_0         
	//   31   45:getfield        #84  <Field ByteBuffer rawData>
	//   32   48:aload_0         
	//   33   49:getfield        #66  <Field byte[] block>
	//   34   52:iload_1         
	//   35   53:iload_2         
	//   36   54:invokevirtual   #162 <Method ByteBuffer ByteBuffer.get(byte[], int, int)>
	//   37   57:pop             
		i += j;
	//   38   58:iload_1         
	//   39   59:iload_2         
	//   40   60:iadd            
	//   41   61:istore_1        
		if(true) goto _L2; else goto _L1
	//   42   62:goto            23
_L1:
		return i;
	//   43   65:iload_1         
	//   44   66:ireturn         
		Exception exception;
		exception;
	//   45   67:astore          4
		if(Log.isLoggable("GifHeaderParser", 3))
	//*  46   69:ldc1            #51  <String "GifHeaderParser">
	//*  47   71:iconst_3        
	//*  48   72:invokestatic    #168 <Method boolean Log.isLoggable(String, int)>
	//*  49   75:ifeq            126
			Log.d("GifHeaderParser", (new StringBuilder()).append("Error Reading Block n: ").append(i).append(" count: ").append(k).append(" blockSize: ").append(blockSize).toString(), ((Throwable) (exception)));
	//   50   78:ldc1            #51  <String "GifHeaderParser">
	//   51   80:new             #170 <Class StringBuilder>
	//   52   83:dup             
	//   53   84:invokespecial   #171 <Method void StringBuilder()>
	//   54   87:ldc1            #173 <String "Error Reading Block n: ">
	//   55   89:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   56   92:iload_1         
	//   57   93:invokevirtual   #180 <Method StringBuilder StringBuilder.append(int)>
	//   58   96:ldc1            #182 <String " count: ">
	//   59   98:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   60  101:iload_3         
	//   61  102:invokevirtual   #180 <Method StringBuilder StringBuilder.append(int)>
	//   62  105:ldc1            #184 <String " blockSize: ">
	//   63  107:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   64  110:aload_0         
	//   65  111:getfield        #68  <Field int blockSize>
	//   66  114:invokevirtual   #180 <Method StringBuilder StringBuilder.append(int)>
	//   67  117:invokevirtual   #188 <Method String StringBuilder.toString()>
	//   68  120:aload           4
	//   69  122:invokestatic    #192 <Method int Log.d(String, String, Throwable)>
	//   70  125:pop             
		header.status = 1;
	//   71  126:aload_0         
	//   72  127:getfield        #73  <Field GifHeader header>
	//   73  130:iconst_1        
	//   74  131:putfield        #78  <Field int GifHeader.status>
		return i;
	//   75  134:iload_1         
	//   76  135:ireturn         
	}

	private int[] readColorTable(int i)
	{
		byte abyte0[] = new byte[i * 3];
	//    0    0:iload_1         
	//    1    1:iconst_3        
	//    2    2:imul            
	//    3    3:newarray        byte[]
	//    4    5:astore          8
		int j;
		int k;
		int ai[];
		try
		{
			rawData.get(abyte0);
	//    5    7:aload_0         
	//    6    8:getfield        #84  <Field ByteBuffer rawData>
	//    7   11:aload           8
	//    8   13:invokevirtual   #197 <Method ByteBuffer ByteBuffer.get(byte[])>
	//    9   16:pop             
			ai = new int[256];
	//   10   17:sipush          256
	//   11   20:newarray        int[]
	//   12   22:astore          9
		}
	//*  13   24:iconst_0        
	//*  14   25:istore_2        
	//*  15   26:iconst_0        
	//*  16   27:istore_3        
	//*  17   28:iload_2         
	//*  18   29:iload_1         
	//*  19   30:icmpge          113
	//*  20   33:iload_3         
	//*  21   34:iconst_1        
	//*  22   35:iadd            
	//*  23   36:istore          6
	//*  24   38:aload           8
	//*  25   40:iload_3         
	//*  26   41:baload          
	//*  27   42:istore          5
	//*  28   44:iload           6
	//*  29   46:iconst_1        
	//*  30   47:iadd            
	//*  31   48:istore          4
	//*  32   50:aload           8
	//*  33   52:iload           6
	//*  34   54:baload          
	//*  35   55:istore          6
	//*  36   57:iload           4
	//*  37   59:iconst_1        
	//*  38   60:iadd            
	//*  39   61:istore_3        
	//*  40   62:aload           8
	//*  41   64:iload           4
	//*  42   66:baload          
	//*  43   67:istore          7
	//*  44   69:iload_2         
	//*  45   70:iconst_1        
	//*  46   71:iadd            
	//*  47   72:istore          4
	//*  48   74:aload           9
	//*  49   76:iload_2         
	//*  50   77:iload           5
	//*  51   79:sipush          255
	//*  52   82:iand            
	//*  53   83:bipush          16
	//*  54   85:ishl            
	//*  55   86:ldc1            #198 <Int 0xff000000>
	//*  56   88:ior             
	//*  57   89:iload           6
	//*  58   91:sipush          255
	//*  59   94:iand            
	//*  60   95:bipush          8
	//*  61   97:ishl            
	//*  62   98:ior             
	//*  63   99:iload           7
	//*  64  101:sipush          255
	//*  65  104:iand            
	//*  66  105:ior             
	//*  67  106:iastore         
	//*  68  107:iload           4
	//*  69  109:istore_2        
	//*  70  110:goto            28
	//*  71  113:aload           9
	//*  72  115:areturn         
		catch(BufferUnderflowException bufferunderflowexception)
	//*  73  116:astore          8
		{
			if(Log.isLoggable("GifHeaderParser", 3))
	//*  74  118:ldc1            #51  <String "GifHeaderParser">
	//*  75  120:iconst_3        
	//*  76  121:invokestatic    #168 <Method boolean Log.isLoggable(String, int)>
	//*  77  124:ifeq            137
				Log.d("GifHeaderParser", "Format Error Reading Color Table", ((Throwable) (bufferunderflowexception)));
	//   78  127:ldc1            #51  <String "GifHeaderParser">
	//   79  129:ldc1            #200 <String "Format Error Reading Color Table">
	//   80  131:aload           8
	//   81  133:invokestatic    #192 <Method int Log.d(String, String, Throwable)>
	//   82  136:pop             
			header.status = 1;
	//   83  137:aload_0         
	//   84  138:getfield        #73  <Field GifHeader header>
	//   85  141:iconst_1        
	//   86  142:putfield        #78  <Field int GifHeader.status>
			return null;
	//   87  145:aconst_null     
	//   88  146:areturn         
		}
		j = 0;
		k = 0;
		int l;
		for(; j < i; j = l)
		{
			int i1 = k + 1;
			byte byte0 = abyte0[k];
			l = i1 + 1;
			i1 = ((int) (abyte0[i1]));
			k = l + 1;
			byte byte1 = abyte0[l];
			l = j + 1;
			ai[j] = (byte0 & 0xff) << 16 | 0xff000000 | (i1 & 0xff) << 8 | byte1 & 0xff;
		}

		return ai;
	}

	private void readContents()
	{
		readContents(0x7fffffff);
	//    0    0:aload_0         
	//    1    1:ldc1            #202 <Int 0x7fffffff>
	//    2    3:invokespecial   #205 <Method void readContents(int)>
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
	//    3    3:ifne            288
	//    4    6:aload_0         
	//    5    7:invokespecial   #145 <Method boolean err()>
	//    6   10:ifne            288
	//    7   13:aload_0         
	//    8   14:getfield        #73  <Field GifHeader header>
	//    9   17:getfield        #148 <Field int GifHeader.frameCount>
	//   10   20:iload_1         
	//   11   21:icmpgt          288
			switch(read())
	//*  12   24:aload_0         
	//*  13   25:invokespecial   #114 <Method int read()>
			{
	//*  14   28:lookupswitch    4: default 72
	//	               0: 277
	//	               33: 106
	//	               44: 75
	//	               59: 272
	//*  15   72:goto            277
			case 44: // ','
				if(header.currentFrame == null)
	//*  16   75:aload_0         
	//*  17   76:getfield        #73  <Field GifHeader header>
	//*  18   79:getfield        #95  <Field GifFrame GifHeader.currentFrame>
	//*  19   82:ifnonnull       99
					header.currentFrame = new GifFrame();
	//   20   85:aload_0         
	//   21   86:getfield        #73  <Field GifHeader header>
	//   22   89:new             #100 <Class GifFrame>
	//   23   92:dup             
	//   24   93:invokespecial   #206 <Method void GifFrame()>
	//   25   96:putfield        #95  <Field GifFrame GifHeader.currentFrame>
				readBitmap();
	//   26   99:aload_0         
	//   27  100:invokespecial   #208 <Method void readBitmap()>
				continue;
	//   28  103:goto            285

			case 33: // '!'
				switch(read())
	//*  29  106:aload_0         
	//*  30  107:invokespecial   #114 <Method int read()>
				{
	//*  31  110:lookupswitch    4: default 152
	//	               1: 258
	//	               249: 155
	//	               254: 251
	//	               255: 176
	//*  32  152:goto            265
				case 249: 
					header.currentFrame = new GifFrame();
	//   33  155:aload_0         
	//   34  156:getfield        #73  <Field GifHeader header>
	//   35  159:new             #100 <Class GifFrame>
	//   36  162:dup             
	//   37  163:invokespecial   #206 <Method void GifFrame()>
	//   38  166:putfield        #95  <Field GifFrame GifHeader.currentFrame>
					readGraphicControlExt();
	//   39  169:aload_0         
	//   40  170:invokespecial   #211 <Method void readGraphicControlExt()>
					break;

	//*  41  173:goto            285
				case 255: 
					readBlock();
	//   42  176:aload_0         
	//   43  177:invokespecial   #213 <Method int readBlock()>
	//   44  180:pop             
					String s = "";
	//   45  181:ldc1            #215 <String "">
	//   46  183:astore          4
					for(int j = 0; j < 11; j++)
	//*  47  185:iconst_0        
	//*  48  186:istore_3        
	//*  49  187:iload_3         
	//*  50  188:bipush          11
	//*  51  190:icmpge          227
						s = (new StringBuilder()).append(s).append((char)block[j]).toString();
	//   52  193:new             #170 <Class StringBuilder>
	//   53  196:dup             
	//   54  197:invokespecial   #171 <Method void StringBuilder()>
	//   55  200:aload           4
	//   56  202:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   57  205:aload_0         
	//   58  206:getfield        #66  <Field byte[] block>
	//   59  209:iload_3         
	//   60  210:baload          
	//   61  211:int2char        
	//   62  212:invokevirtual   #218 <Method StringBuilder StringBuilder.append(char)>
	//   63  215:invokevirtual   #188 <Method String StringBuilder.toString()>
	//   64  218:astore          4

	//   65  220:iload_3         
	//   66  221:iconst_1        
	//   67  222:iadd            
	//   68  223:istore_3        
	//*  69  224:goto            187
					if(s.equals("NETSCAPE2.0"))
	//*  70  227:aload           4
	//*  71  229:ldc1            #220 <String "NETSCAPE2.0">
	//*  72  231:invokevirtual   #225 <Method boolean String.equals(Object)>
	//*  73  234:ifeq            244
						readNetscapeExt();
	//   74  237:aload_0         
	//   75  238:invokespecial   #228 <Method void readNetscapeExt()>
					else
	//*  76  241:goto            285
						skip();
	//   77  244:aload_0         
	//   78  245:invokespecial   #231 <Method void skip()>
					break;

	//*  79  248:goto            285
				case 254: 
					skip();
	//   80  251:aload_0         
	//   81  252:invokespecial   #231 <Method void skip()>
					break;

	//*  82  255:goto            285
				case 1: // '\001'
					skip();
	//   83  258:aload_0         
	//   84  259:invokespecial   #231 <Method void skip()>
					break;

	//*  85  262:goto            285
				default:
					skip();
	//   86  265:aload_0         
	//   87  266:invokespecial   #231 <Method void skip()>
					break;
				}
				break;

	//*  88  269:goto            285
			case 59: // ';'
				flag = true;
	//   89  272:iconst_1        
	//   90  273:istore_2        
				break;

	//*  91  274:goto            285
			case 0: // '\0'
			default:
				header.status = 1;
	//   92  277:aload_0         
	//   93  278:getfield        #73  <Field GifHeader header>
	//   94  281:iconst_1        
	//   95  282:putfield        #78  <Field int GifHeader.status>
				break;
			}
		} while(true);
	//*  96  285:goto            2
	//   97  288:return          
	}

	private void readGraphicControlExt()
	{
		read();
	//    0    0:aload_0         
	//    1    1:invokespecial   #114 <Method int read()>
	//    2    4:pop             
		int i = read();
	//    3    5:aload_0         
	//    4    6:invokespecial   #114 <Method int read()>
	//    5    9:istore_1        
		header.currentFrame.dispose = (i & 0x1c) >> 2;
	//    6   10:aload_0         
	//    7   11:getfield        #73  <Field GifHeader header>
	//    8   14:getfield        #95  <Field GifFrame GifHeader.currentFrame>
	//    9   17:iload_1         
	//   10   18:bipush          28
	//   11   20:iand            
	//   12   21:iconst_2        
	//   13   22:ishr            
	//   14   23:putfield        #234 <Field int GifFrame.dispose>
		if(header.currentFrame.dispose == 0)
	//*  15   26:aload_0         
	//*  16   27:getfield        #73  <Field GifHeader header>
	//*  17   30:getfield        #95  <Field GifFrame GifHeader.currentFrame>
	//*  18   33:getfield        #234 <Field int GifFrame.dispose>
	//*  19   36:ifne            50
			header.currentFrame.dispose = 1;
	//   20   39:aload_0         
	//   21   40:getfield        #73  <Field GifHeader header>
	//   22   43:getfield        #95  <Field GifFrame GifHeader.currentFrame>
	//   23   46:iconst_1        
	//   24   47:putfield        #234 <Field int GifFrame.dispose>
		GifFrame gifframe = header.currentFrame;
	//   25   50:aload_0         
	//   26   51:getfield        #73  <Field GifHeader header>
	//   27   54:getfield        #95  <Field GifFrame GifHeader.currentFrame>
	//   28   57:astore          4
		boolean flag;
		if((i & 1) != 0)
	//*  29   59:iload_1         
	//*  30   60:iconst_1        
	//*  31   61:iand            
	//*  32   62:ifeq            70
			flag = true;
	//   33   65:iconst_1        
	//   34   66:istore_3        
		else
	//*  35   67:goto            72
			flag = false;
	//   36   70:iconst_0        
	//   37   71:istore_3        
		gifframe.transparency = flag;
	//   38   72:aload           4
	//   39   74:iload_3         
	//   40   75:putfield        #237 <Field boolean GifFrame.transparency>
		int j = readShort();
	//   41   78:aload_0         
	//   42   79:invokespecial   #98  <Method int readShort()>
	//   43   82:istore_2        
		i = j;
	//   44   83:iload_2         
	//   45   84:istore_1        
		if(j < 2)
	//*  46   85:iload_2         
	//*  47   86:iconst_2        
	//*  48   87:icmpge          93
			i = 10;
	//   49   90:bipush          10
	//   50   92:istore_1        
		header.currentFrame.delay = i * 10;
	//   51   93:aload_0         
	//   52   94:getfield        #73  <Field GifHeader header>
	//   53   97:getfield        #95  <Field GifFrame GifHeader.currentFrame>
	//   54  100:iload_1         
	//   55  101:bipush          10
	//   56  103:imul            
	//   57  104:putfield        #240 <Field int GifFrame.delay>
		header.currentFrame.transIndex = read();
	//   58  107:aload_0         
	//   59  108:getfield        #73  <Field GifHeader header>
	//   60  111:getfield        #95  <Field GifFrame GifHeader.currentFrame>
	//   61  114:aload_0         
	//   62  115:invokespecial   #114 <Method int read()>
	//   63  118:putfield        #243 <Field int GifFrame.transIndex>
		read();
	//   64  121:aload_0         
	//   65  122:invokespecial   #114 <Method int read()>
	//   66  125:pop             
	//   67  126:return          
	}

	private void readHeader()
	{
		String s = "";
	//    0    0:ldc1            #215 <String "">
	//    1    2:astore_2        
		for(int i = 0; i < 6; i++)
	//*   2    3:iconst_0        
	//*   3    4:istore_1        
	//*   4    5:iload_1         
	//*   5    6:bipush          6
	//*   6    8:icmpge          41
			s = (new StringBuilder()).append(s).append((char)read()).toString();
	//    7   11:new             #170 <Class StringBuilder>
	//    8   14:dup             
	//    9   15:invokespecial   #171 <Method void StringBuilder()>
	//   10   18:aload_2         
	//   11   19:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   12   22:aload_0         
	//   13   23:invokespecial   #114 <Method int read()>
	//   14   26:int2char        
	//   15   27:invokevirtual   #218 <Method StringBuilder StringBuilder.append(char)>
	//   16   30:invokevirtual   #188 <Method String StringBuilder.toString()>
	//   17   33:astore_2        

	//   18   34:iload_1         
	//   19   35:iconst_1        
	//   20   36:iadd            
	//   21   37:istore_1        
	//*  22   38:goto            5
		if(!s.startsWith("GIF"))
	//*  23   41:aload_2         
	//*  24   42:ldc1            #246 <String "GIF">
	//*  25   44:invokevirtual   #250 <Method boolean String.startsWith(String)>
	//*  26   47:ifne            59
		{
			header.status = 1;
	//   27   50:aload_0         
	//   28   51:getfield        #73  <Field GifHeader header>
	//   29   54:iconst_1        
	//   30   55:putfield        #78  <Field int GifHeader.status>
			return;
	//   31   58:return          
		}
		readLSD();
	//   32   59:aload_0         
	//   33   60:invokespecial   #253 <Method void readLSD()>
		if(header.gctFlag && !err())
	//*  34   63:aload_0         
	//*  35   64:getfield        #73  <Field GifHeader header>
	//*  36   67:getfield        #256 <Field boolean GifHeader.gctFlag>
	//*  37   70:ifeq            120
	//*  38   73:aload_0         
	//*  39   74:invokespecial   #145 <Method boolean err()>
	//*  40   77:ifne            120
		{
			header.gct = readColorTable(header.gctSize);
	//   41   80:aload_0         
	//   42   81:getfield        #73  <Field GifHeader header>
	//   43   84:aload_0         
	//   44   85:aload_0         
	//   45   86:getfield        #73  <Field GifHeader header>
	//   46   89:getfield        #259 <Field int GifHeader.gctSize>
	//   47   92:invokespecial   #130 <Method int[] readColorTable(int)>
	//   48   95:putfield        #262 <Field int[] GifHeader.gct>
			header.bgColor = header.gct[header.bgIndex];
	//   49   98:aload_0         
	//   50   99:getfield        #73  <Field GifHeader header>
	//   51  102:aload_0         
	//   52  103:getfield        #73  <Field GifHeader header>
	//   53  106:getfield        #262 <Field int[] GifHeader.gct>
	//   54  109:aload_0         
	//   55  110:getfield        #73  <Field GifHeader header>
	//   56  113:getfield        #265 <Field int GifHeader.bgIndex>
	//   57  116:iaload          
	//   58  117:putfield        #268 <Field int GifHeader.bgColor>
		}
	//   59  120:return          
	}

	private void readLSD()
	{
		header.width = readShort();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field GifHeader header>
	//    2    4:aload_0         
	//    3    5:invokespecial   #98  <Method int readShort()>
	//    4    8:putfield        #271 <Field int GifHeader.width>
		header.height = readShort();
	//    5   11:aload_0         
	//    6   12:getfield        #73  <Field GifHeader header>
	//    7   15:aload_0         
	//    8   16:invokespecial   #98  <Method int readShort()>
	//    9   19:putfield        #274 <Field int GifHeader.height>
		int i = read();
	//   10   22:aload_0         
	//   11   23:invokespecial   #114 <Method int read()>
	//   12   26:istore_1        
		GifHeader gifheader = header;
	//   13   27:aload_0         
	//   14   28:getfield        #73  <Field GifHeader header>
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
	//   27   49:putfield        #256 <Field boolean GifHeader.gctFlag>
		header.gctSize = (int)Math.pow(2D, (i & 7) + 1);
	//   28   52:aload_0         
	//   29   53:getfield        #73  <Field GifHeader header>
	//   30   56:ldc2w           #115 <Double 2D>
	//   31   59:iload_1         
	//   32   60:bipush          7
	//   33   62:iand            
	//   34   63:iconst_1        
	//   35   64:iadd            
	//   36   65:i2d             
	//   37   66:invokestatic    #122 <Method double Math.pow(double, double)>
	//   38   69:d2i             
	//   39   70:putfield        #259 <Field int GifHeader.gctSize>
		header.bgIndex = read();
	//   40   73:aload_0         
	//   41   74:getfield        #73  <Field GifHeader header>
	//   42   77:aload_0         
	//   43   78:invokespecial   #114 <Method int read()>
	//   44   81:putfield        #265 <Field int GifHeader.bgIndex>
		header.pixelAspect = read();
	//   45   84:aload_0         
	//   46   85:getfield        #73  <Field GifHeader header>
	//   47   88:aload_0         
	//   48   89:invokespecial   #114 <Method int read()>
	//   49   92:putfield        #277 <Field int GifHeader.pixelAspect>
	//   50   95:return          
	}

	private void readNetscapeExt()
	{
		do
		{
			readBlock();
	//    0    0:aload_0         
	//    1    1:invokespecial   #213 <Method int readBlock()>
	//    2    4:pop             
			if(block[0] == 1)
	//*   3    5:aload_0         
	//*   4    6:getfield        #66  <Field byte[] block>
	//*   5    9:iconst_0        
	//*   6   10:baload          
	//*   7   11:iconst_1        
	//*   8   12:icmpne          50
			{
				byte byte0 = block[1];
	//    9   15:aload_0         
	//   10   16:getfield        #66  <Field byte[] block>
	//   11   19:iconst_1        
	//   12   20:baload          
	//   13   21:istore_1        
				byte byte1 = block[2];
	//   14   22:aload_0         
	//   15   23:getfield        #66  <Field byte[] block>
	//   16   26:iconst_2        
	//   17   27:baload          
	//   18   28:istore_2        
				header.loopCount = (byte1 & 0xff) << 8 | byte0 & 0xff;
	//   19   29:aload_0         
	//   20   30:getfield        #73  <Field GifHeader header>
	//   21   33:iload_2         
	//   22   34:sipush          255
	//   23   37:iand            
	//   24   38:bipush          8
	//   25   40:ishl            
	//   26   41:iload_1         
	//   27   42:sipush          255
	//   28   45:iand            
	//   29   46:ior             
	//   30   47:putfield        #280 <Field int GifHeader.loopCount>
			}
		} while(blockSize > 0 && !err());
	//   31   50:aload_0         
	//   32   51:getfield        #68  <Field int blockSize>
	//   33   54:ifle            64
	//   34   57:aload_0         
	//   35   58:invokespecial   #145 <Method boolean err()>
	//   36   61:ifeq            0
	//   37   64:return          
	}

	private int readShort()
	{
		return ((int) (rawData.getShort()));
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field ByteBuffer rawData>
	//    2    4:invokevirtual   #284 <Method short ByteBuffer.getShort()>
	//    3    7:ireturn         
	}

	private void reset()
	{
		rawData = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #84  <Field ByteBuffer rawData>
		Arrays.fill(block, (byte)0);
	//    3    5:aload_0         
	//    4    6:getfield        #66  <Field byte[] block>
	//    5    9:iconst_0        
	//    6   10:invokestatic    #291 <Method void Arrays.fill(byte[], byte)>
		header = new GifHeader();
	//    7   13:aload_0         
	//    8   14:new             #75  <Class GifHeader>
	//    9   17:dup             
	//   10   18:invokespecial   #292 <Method void GifHeader()>
	//   11   21:putfield        #73  <Field GifHeader header>
		blockSize = 0;
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:putfield        #68  <Field int blockSize>
	//   15   29:return          
	}

	private void skip()
	{
		int i;
		do
		{
			i = read();
	//    0    0:aload_0         
	//    1    1:invokespecial   #114 <Method int read()>
	//    2    4:istore_1        
			int j = Math.min(rawData.position() + i, rawData.limit());
	//    3    5:aload_0         
	//    4    6:getfield        #84  <Field ByteBuffer rawData>
	//    5    9:invokevirtual   #137 <Method int ByteBuffer.position()>
	//    6   12:iload_1         
	//    7   13:iadd            
	//    8   14:aload_0         
	//    9   15:getfield        #84  <Field ByteBuffer rawData>
	//   10   18:invokevirtual   #295 <Method int ByteBuffer.limit()>
	//   11   21:invokestatic    #299 <Method int Math.min(int, int)>
	//   12   24:istore_2        
			rawData.position(j);
	//   13   25:aload_0         
	//   14   26:getfield        #84  <Field ByteBuffer rawData>
	//   15   29:iload_2         
	//   16   30:invokevirtual   #302 <Method java.nio.Buffer ByteBuffer.position(int)>
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
	//    1    1:invokespecial   #114 <Method int read()>
	//    2    4:pop             
		skip();
	//    3    5:aload_0         
	//    4    6:invokespecial   #231 <Method void skip()>
	//    5    9:return          
	}

	public void clear()
	{
		rawData = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #84  <Field ByteBuffer rawData>
		header = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #73  <Field GifHeader header>
	//    6   10:return          
	}

	public boolean isAnimated()
	{
		readHeader();
	//    0    0:aload_0         
	//    1    1:invokespecial   #306 <Method void readHeader()>
		if(!err())
	//*   2    4:aload_0         
	//*   3    5:invokespecial   #145 <Method boolean err()>
	//*   4    8:ifne            16
			readContents(2);
	//    5   11:aload_0         
	//    6   12:iconst_2        
	//    7   13:invokespecial   #205 <Method void readContents(int)>
		return header.frameCount > 1;
	//    8   16:aload_0         
	//    9   17:getfield        #73  <Field GifHeader header>
	//   10   20:getfield        #148 <Field int GifHeader.frameCount>
	//   11   23:iconst_1        
	//   12   24:icmple          29
	//   13   27:iconst_1        
	//   14   28:ireturn         
	//   15   29:iconst_0        
	//   16   30:ireturn         
	}

	public GifHeader parseHeader()
	{
		if(rawData == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field ByteBuffer rawData>
	//*   2    4:ifnonnull       18
			throw new IllegalStateException("You must call setData() before parseHeader()");
	//    3    7:new             #310 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #312 <String "You must call setData() before parseHeader()">
	//    6   14:invokespecial   #315 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		if(err())
	//*   8   18:aload_0         
	//*   9   19:invokespecial   #145 <Method boolean err()>
	//*  10   22:ifeq            30
			return header;
	//   11   25:aload_0         
	//   12   26:getfield        #73  <Field GifHeader header>
	//   13   29:areturn         
		readHeader();
	//   14   30:aload_0         
	//   15   31:invokespecial   #306 <Method void readHeader()>
		if(!err())
	//*  16   34:aload_0         
	//*  17   35:invokespecial   #145 <Method boolean err()>
	//*  18   38:ifne            63
		{
			readContents();
	//   19   41:aload_0         
	//   20   42:invokespecial   #317 <Method void readContents()>
			if(header.frameCount < 0)
	//*  21   45:aload_0         
	//*  22   46:getfield        #73  <Field GifHeader header>
	//*  23   49:getfield        #148 <Field int GifHeader.frameCount>
	//*  24   52:ifge            63
				header.status = 1;
	//   25   55:aload_0         
	//   26   56:getfield        #73  <Field GifHeader header>
	//   27   59:iconst_1        
	//   28   60:putfield        #78  <Field int GifHeader.status>
		}
		return header;
	//   29   63:aload_0         
	//   30   64:getfield        #73  <Field GifHeader header>
	//   31   67:areturn         
	}

	public GifHeaderParser setData(ByteBuffer bytebuffer)
	{
		reset();
	//    0    0:aload_0         
	//    1    1:invokespecial   #321 <Method void reset()>
		rawData = bytebuffer.asReadOnlyBuffer();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #325 <Method ByteBuffer ByteBuffer.asReadOnlyBuffer()>
	//    5    9:putfield        #84  <Field ByteBuffer rawData>
		rawData.position(0);
	//    6   12:aload_0         
	//    7   13:getfield        #84  <Field ByteBuffer rawData>
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #302 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   10   20:pop             
		rawData.order(ByteOrder.LITTLE_ENDIAN);
	//   11   21:aload_0         
	//   12   22:getfield        #84  <Field ByteBuffer rawData>
	//   13   25:getstatic       #331 <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//   14   28:invokevirtual   #335 <Method ByteBuffer ByteBuffer.order(ByteOrder)>
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
	//    4    6:invokestatic    #339 <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//    5    9:invokevirtual   #341 <Method GifHeaderParser setData(ByteBuffer)>
	//    6   12:pop             
			return this;
	//    7   13:aload_0         
	//    8   14:areturn         
		} else
		{
			rawData = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #84  <Field ByteBuffer rawData>
			header.status = 2;
	//   12   20:aload_0         
	//   13   21:getfield        #73  <Field GifHeader header>
	//   14   24:iconst_2        
	//   15   25:putfield        #78  <Field int GifHeader.status>
			return this;
	//   16   28:aload_0         
	//   17   29:areturn         
		}
	}

	static final int DEFAULT_FRAME_DELAY = 10;
	private static final int DESCRIPTOR_MASK_INTERLACE_FLAG = 64;
	private static final int DESCRIPTOR_MASK_LCT_FLAG = 128;
	private static final int DESCRIPTOR_MASK_LCT_SIZE = 7;
	private static final int DESCRIPTOR_MASK_RESERVED = 24;
	private static final int DESCRIPTOR_MASK_SORT_FLAG = 32;
	private static final int EXTENSION_INTRODUCER = 33;
	private static final int GCE_DISPOSAL_METHOD_SHIFT = 2;
	private static final int GCE_MASK_DISPOSAL_METHOD = 28;
	private static final int GCE_MASK_RESERVED_BITS = 224;
	private static final int GCE_MASK_TRANSPARENT_COLOR_FLAG = 1;
	private static final int GCE_MASK_USER_INPUT_FLAG = 2;
	private static final int IMAGE_SEPARATOR = 44;
	private static final int LABEL_APPLICATION_EXTENSION = 255;
	private static final int LABEL_COMMENT_EXTENSION = 254;
	private static final int LABEL_GRAPHIC_CONTROL_EXTENSION = 249;
	private static final int LABEL_PLAIN_TEXT_EXTENSION = 1;
	private static final int LSD_MASK_COLOR_RESOLUTION = 112;
	private static final int LSD_MASK_GCT_FLAG = 128;
	private static final int LSD_MASK_GCT_SIZE = 7;
	private static final int LSD_MASK_SORT_FLAG = 8;
	private static final int MASK_INT_LOWEST_BYTE = 255;
	private static final int MAX_BLOCK_SIZE = 256;
	static final int MIN_FRAME_DELAY = 2;
	public static final String TAG = "GifHeaderParser";
	private static final int TRAILER = 59;
	private final byte block[] = new byte[256];
	private int blockSize;
	private GifHeader header;
	private ByteBuffer rawData;
}
