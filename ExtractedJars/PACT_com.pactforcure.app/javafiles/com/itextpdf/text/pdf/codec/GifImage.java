// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.codec;

import com.itextpdf.text.*;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.pdf.*;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;

public class GifImage
{
	static class GifFrame
	{

		Image image;
		int ix;
		int iy;

		GifFrame()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}
	}


	public GifImage(InputStream inputstream)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void Object()>
		block = new byte[256];
	//    2    4:aload_0         
	//    3    5:sipush          256
	//    4    8:newarray        byte[]
	//    5   10:putfield        #60  <Field byte[] block>
		blockSize = 0;
	//    6   13:aload_0         
	//    7   14:iconst_0        
	//    8   15:putfield        #62  <Field int blockSize>
		dispose = 0;
	//    9   18:aload_0         
	//   10   19:iconst_0        
	//   11   20:putfield        #64  <Field int dispose>
		transparency = false;
	//   12   23:aload_0         
	//   13   24:iconst_0        
	//   14   25:putfield        #66  <Field boolean transparency>
		delay = 0;
	//   15   28:aload_0         
	//   16   29:iconst_0        
	//   17   30:putfield        #68  <Field int delay>
		frames = new ArrayList();
	//   18   33:aload_0         
	//   19   34:new             #70  <Class ArrayList>
	//   20   37:dup             
	//   21   38:invokespecial   #71  <Method void ArrayList()>
	//   22   41:putfield        #73  <Field ArrayList frames>
		process(inputstream);
	//   23   44:aload_0         
	//   24   45:aload_1         
	//   25   46:invokevirtual   #76  <Method void process(InputStream)>
	//   26   49:return          
	}

	public GifImage(String s)
		throws IOException
	{
		this(Utilities.toURL(s));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #85  <Method URL Utilities.toURL(String)>
	//    3    5:invokespecial   #88  <Method void GifImage(URL)>
	//    4    8:return          
	}

	public GifImage(URL url)
		throws IOException
	{
		URL url1;
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void Object()>
		block = new byte[256];
	//    2    4:aload_0         
	//    3    5:sipush          256
	//    4    8:newarray        byte[]
	//    5   10:putfield        #60  <Field byte[] block>
		blockSize = 0;
	//    6   13:aload_0         
	//    7   14:iconst_0        
	//    8   15:putfield        #62  <Field int blockSize>
		dispose = 0;
	//    9   18:aload_0         
	//   10   19:iconst_0        
	//   11   20:putfield        #64  <Field int dispose>
		transparency = false;
	//   12   23:aload_0         
	//   13   24:iconst_0        
	//   14   25:putfield        #66  <Field boolean transparency>
		delay = 0;
	//   15   28:aload_0         
	//   16   29:iconst_0        
	//   17   30:putfield        #68  <Field int delay>
		frames = new ArrayList();
	//   18   33:aload_0         
	//   19   34:new             #70  <Class ArrayList>
	//   20   37:dup             
	//   21   38:invokespecial   #71  <Method void ArrayList()>
	//   22   41:putfield        #73  <Field ArrayList frames>
		fromUrl = url;
	//   23   44:aload_0         
	//   24   45:aload_1         
	//   25   46:putfield        #90  <Field URL fromUrl>
		url1 = null;
	//   26   49:aconst_null     
	//   27   50:astore_3        
		url = ((URL) (url.openStream()));
	//   28   51:aload_1         
	//   29   52:invokevirtual   #96  <Method InputStream URL.openStream()>
	//   30   55:astore_1        
		url1 = url;
	//   31   56:aload_1         
	//   32   57:astore_3        
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//   33   58:new             #98  <Class ByteArrayOutputStream>
	//   34   61:dup             
	//   35   62:invokespecial   #99  <Method void ByteArrayOutputStream()>
	//   36   65:astore          4
		url1 = url;
	//   37   67:aload_1         
	//   38   68:astore_3        
		byte abyte0[] = new byte[1024];
	//   39   69:sipush          1024
	//   40   72:newarray        byte[]
	//   41   74:astore          5
_L2:
		url1 = url;
	//   42   76:aload_1         
	//   43   77:astore_3        
		int i = ((InputStream) (url)).read(abyte0);
	//   44   78:aload_1         
	//   45   79:aload           5
	//   46   81:invokevirtual   #105 <Method int InputStream.read(byte[])>
	//   47   84:istore_2        
		if(i == -1)
			break; /* Loop/switch isn't completed */
	//   48   85:iload_2         
	//   49   86:iconst_m1       
	//   50   87:icmpeq          115
		url1 = url;
	//   51   90:aload_1         
	//   52   91:astore_3        
		bytearrayoutputstream.write(abyte0, 0, i);
	//   53   92:aload           4
	//   54   94:aload           5
	//   55   96:iconst_0        
	//   56   97:iload_2         
	//   57   98:invokevirtual   #109 <Method void ByteArrayOutputStream.write(byte[], int, int)>
		if(true) goto _L2; else goto _L1
	//   58  101:goto            76
		url;
	//   59  104:astore_1        
_L4:
		if(url1 != null)
	//*  60  105:aload_3         
	//*  61  106:ifnull          113
			((InputStream) (url1)).close();
	//   62  109:aload_3         
	//   63  110:invokevirtual   #112 <Method void InputStream.close()>
		throw url;
	//   64  113:aload_1         
	//   65  114:athrow          
_L1:
		url1 = url;
	//   66  115:aload_1         
	//   67  116:astore_3        
		((InputStream) (url)).close();
	//   68  117:aload_1         
	//   69  118:invokevirtual   #112 <Method void InputStream.close()>
		url1 = url;
	//   70  121:aload_1         
	//   71  122:astore_3        
		url = ((URL) (new ByteArrayInputStream(bytearrayoutputstream.toByteArray())));
	//   72  123:new             #114 <Class ByteArrayInputStream>
	//   73  126:dup             
	//   74  127:aload           4
	//   75  129:invokevirtual   #118 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   76  132:invokespecial   #121 <Method void ByteArrayInputStream(byte[])>
	//   77  135:astore_1        
		bytearrayoutputstream.flush();
	//   78  136:aload           4
	//   79  138:invokevirtual   #124 <Method void ByteArrayOutputStream.flush()>
		bytearrayoutputstream.close();
	//   80  141:aload           4
	//   81  143:invokevirtual   #125 <Method void ByteArrayOutputStream.close()>
		process(((InputStream) (url)));
	//   82  146:aload_0         
	//   83  147:aload_1         
	//   84  148:invokevirtual   #76  <Method void process(InputStream)>
		if(url != null)
	//*  85  151:aload_1         
	//*  86  152:ifnull          159
			((InputStream) (url)).close();
	//   87  155:aload_1         
	//   88  156:invokevirtual   #112 <Method void InputStream.close()>
		return;
	//   89  159:return          
		Exception exception;
		exception;
	//   90  160:astore          4
		url1 = url;
	//   91  162:aload_1         
	//   92  163:astore_3        
		url = ((URL) (exception));
	//   93  164:aload           4
	//   94  166:astore_1        
		if(true) goto _L4; else goto _L3
	//   95  167:goto            105
_L3:
	}

	public GifImage(byte abyte0[])
		throws IOException
	{
		Object obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void Object()>
		block = new byte[256];
	//    2    4:aload_0         
	//    3    5:sipush          256
	//    4    8:newarray        byte[]
	//    5   10:putfield        #60  <Field byte[] block>
		blockSize = 0;
	//    6   13:aload_0         
	//    7   14:iconst_0        
	//    8   15:putfield        #62  <Field int blockSize>
		dispose = 0;
	//    9   18:aload_0         
	//   10   19:iconst_0        
	//   11   20:putfield        #64  <Field int dispose>
		transparency = false;
	//   12   23:aload_0         
	//   13   24:iconst_0        
	//   14   25:putfield        #66  <Field boolean transparency>
		delay = 0;
	//   15   28:aload_0         
	//   16   29:iconst_0        
	//   17   30:putfield        #68  <Field int delay>
		frames = new ArrayList();
	//   18   33:aload_0         
	//   19   34:new             #70  <Class ArrayList>
	//   20   37:dup             
	//   21   38:invokespecial   #71  <Method void ArrayList()>
	//   22   41:putfield        #73  <Field ArrayList frames>
		fromData = abyte0;
	//   23   44:aload_0         
	//   24   45:aload_1         
	//   25   46:putfield        #127 <Field byte[] fromData>
		obj = null;
	//   26   49:aconst_null     
	//   27   50:astore_3        
		abyte0 = ((byte []) (new ByteArrayInputStream(abyte0)));
	//   28   51:new             #114 <Class ByteArrayInputStream>
	//   29   54:dup             
	//   30   55:aload_1         
	//   31   56:invokespecial   #121 <Method void ByteArrayInputStream(byte[])>
	//   32   59:astore_1        
		process(((InputStream) (abyte0)));
	//   33   60:aload_0         
	//   34   61:aload_1         
	//   35   62:invokevirtual   #76  <Method void process(InputStream)>
		if(abyte0 != null)
	//*  36   65:aload_1         
	//*  37   66:ifnull          73
			((InputStream) (abyte0)).close();
	//   38   69:aload_1         
	//   39   70:invokevirtual   #112 <Method void InputStream.close()>
		return;
	//   40   73:return          
		Exception exception;
		exception;
	//   41   74:astore_2        
		abyte0 = ((byte []) (obj));
	//   42   75:aload_3         
	//   43   76:astore_1        
_L2:
		if(abyte0 != null)
	//*  44   77:aload_1         
	//*  45   78:ifnull          85
			((InputStream) (abyte0)).close();
	//   46   81:aload_1         
	//   47   82:invokevirtual   #112 <Method void InputStream.close()>
		throw exception;
	//   48   85:aload_2         
	//   49   86:athrow          
		exception;
	//   50   87:astore_2        
		if(true) goto _L2; else goto _L1
_L1:
	//*  51   88:goto            77
	}

	protected static int newBpc(int i)
	{
		int j = i;
	//    0    0:iload_0         
	//    1    1:istore_1        
		switch(i)
	//*   2    2:iload_0         
		{
	//*   3    3:tableswitch     1 4: default 32
	//	               1 35
	//	               2 35
	//	               3 37
	//	               4 35
		default:
			j = 8;
	//    4   32:bipush          8
	//    5   34:istore_1        
			// fall through

		case 1: // '\001'
		case 2: // '\002'
		case 4: // '\004'
			return j;
	//    6   35:iload_1         
	//    7   36:ireturn         

		case 3: // '\003'
			return 4;
	//    8   37:iconst_4        
	//    9   38:ireturn         
		}
	}

	protected boolean decodeImageData()
		throws IOException
	{
		int j;
		int k;
		int l;
		int i1;
		int j1;
		int k1;
		int l1;
		int i2;
		int l2;
		int i3;
		int j3;
		int k3;
		int l3;
		int i4;
		int j4;
		int j5;
		int k5;
		int l5;
		int i6;
		j5 = iw;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field int iw>
	//    2    4:istore          19
		k5 = ih;
	//    3    6:aload_0         
	//    4    7:getfield        #135 <Field int ih>
	//    5   10:istore          20
		if(prefix == null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #137 <Field short[] prefix>
	//*   8   16:ifnonnull       28
			prefix = new short[4096];
	//    9   19:aload_0         
	//   10   20:sipush          4096
	//   11   23:newarray        short[]
	//   12   25:putfield        #137 <Field short[] prefix>
		if(suffix == null)
	//*  13   28:aload_0         
	//*  14   29:getfield        #139 <Field byte[] suffix>
	//*  15   32:ifnonnull       44
			suffix = new byte[4096];
	//   16   35:aload_0         
	//   17   36:sipush          4096
	//   18   39:newarray        byte[]
	//   19   41:putfield        #139 <Field byte[] suffix>
		if(pixelStack == null)
	//*  20   44:aload_0         
	//*  21   45:getfield        #141 <Field byte[] pixelStack>
	//*  22   48:ifnonnull       60
			pixelStack = new byte[4097];
	//   23   51:aload_0         
	//   24   52:sipush          4097
	//   25   55:newarray        byte[]
	//   26   57:putfield        #141 <Field byte[] pixelStack>
		m_line_stride = (iw * m_bpc + 7) / 8;
	//   27   60:aload_0         
	//   28   61:aload_0         
	//   29   62:getfield        #133 <Field int iw>
	//   30   65:aload_0         
	//   31   66:getfield        #143 <Field int m_bpc>
	//   32   69:imul            
	//   33   70:bipush          7
	//   34   72:iadd            
	//   35   73:bipush          8
	//   36   75:idiv            
	//   37   76:putfield        #145 <Field int m_line_stride>
		m_out = new byte[m_line_stride * ih];
	//   38   79:aload_0         
	//   39   80:aload_0         
	//   40   81:getfield        #145 <Field int m_line_stride>
	//   41   84:aload_0         
	//   42   85:getfield        #135 <Field int ih>
	//   43   88:imul            
	//   44   89:newarray        byte[]
	//   45   91:putfield        #147 <Field byte[] m_out>
		i3 = 1;
	//   46   94:iconst_1        
	//   47   95:istore          11
		if(interlace)
	//*  48   97:aload_0         
	//*  49   98:getfield        #149 <Field boolean interlace>
	//*  50  101:ifeq            180
			l = 8;
	//   51  104:bipush          8
	//   52  106:istore_3        
		else
	//*  53  107:iconst_0        
	//*  54  108:istore          4
	//*  55  110:iconst_0        
	//*  56  111:istore          13
	//*  57  113:aload_0         
	//*  58  114:getfield        #151 <Field DataInputStream in>
	//*  59  117:invokevirtual   #156 <Method int DataInputStream.read()>
	//*  60  120:istore          21
	//*  61  122:iconst_1        
	//*  62  123:iload           21
	//*  63  125:ishl            
	//*  64  126:istore          22
	//*  65  128:iload           22
	//*  66  130:iconst_2        
	//*  67  131:iadd            
	//*  68  132:istore          14
	//*  69  134:iconst_m1       
	//*  70  135:istore_2        
	//*  71  136:iload           21
	//*  72  138:iconst_1        
	//*  73  139:iadd            
	//*  74  140:istore          6
	//*  75  142:iconst_1        
	//*  76  143:iload           6
	//*  77  145:ishl            
	//*  78  146:iconst_1        
	//*  79  147:isub            
	//*  80  148:istore          5
	//*  81  150:iconst_0        
	//*  82  151:istore_1        
	//*  83  152:iload_1         
	//*  84  153:iload           22
	//*  85  155:icmpge          185
	//*  86  158:aload_0         
	//*  87  159:getfield        #137 <Field short[] prefix>
	//*  88  162:iload_1         
	//*  89  163:iconst_0        
	//*  90  164:sastore         
	//*  91  165:aload_0         
	//*  92  166:getfield        #139 <Field byte[] suffix>
	//*  93  169:iload_1         
	//*  94  170:iload_1         
	//*  95  171:int2byte        
	//*  96  172:bastore         
	//*  97  173:iload_1         
	//*  98  174:iconst_1        
	//*  99  175:iadd            
	//* 100  176:istore_1        
	//* 101  177:goto            152
			l = 1;
	//  102  180:iconst_1        
	//  103  181:istore_3        
		i1 = 0;
		k3 = 0;
		l5 = in.read();
		i6 = 1 << l5;
		l3 = i6 + 2;
		k = -1;
		k1 = l5 + 1;
		j1 = (1 << k1) - 1;
		for(int i = 0; i < i6; i++)
		{
			prefix[i] = 0;
			suffix[i] = (byte)i;
		}

	//* 104  182:goto            107
		j3 = 0;
	//  105  185:iconst_0        
	//  106  186:istore          12
		i4 = 0;
	//  107  188:iconst_0        
	//  108  189:istore          15
		l2 = 0;
	//  109  191:iconst_0        
	//  110  192:istore          10
		l1 = 0;
	//  111  194:iconst_0        
	//  112  195:istore          7
		i2 = 0;
	//  113  197:iconst_0        
	//  114  198:istore          8
		j4 = 0;
	//  115  200:iconst_0        
	//  116  201:istore          16
		j = 0;
	//  117  203:iconst_0        
	//  118  204:istore_1        
_L3:
		while(j4 < j5 * k5) 
	//* 119  205:iload           16
	//* 120  207:iload           19
	//* 121  209:iload           20
	//* 122  211:imul            
	//* 123  212:icmpge          837
		{
label0:
			{
				if(j != 0)
					break MISSING_BLOCK_LABEL_839;
	//  124  215:iload_1         
	//  125  216:ifne            839
				if(l1 >= k1)
					break label0;
	//  126  219:iload           7
	//  127  221:iload           6
	//  128  223:icmpge          292
				int j2 = l2;
	//  129  226:iload           10
	//  130  228:istore          9
				if(l2 == 0)
	//* 131  230:iload           10
	//* 132  232:ifne            251
				{
					j2 = readBlock();
	//  133  235:aload_0         
	//  134  236:invokevirtual   #159 <Method int readBlock()>
	//  135  239:istore          9
					if(j2 <= 0)
	//* 136  241:iload           9
	//* 137  243:ifgt            248
						return true;
	//  138  246:iconst_1        
	//  139  247:ireturn         
					j3 = 0;
	//  140  248:iconst_0        
	//  141  249:istore          12
				}
				i2 += (block[j3] & 0xff) << l1;
	//  142  251:iload           8
	//  143  253:aload_0         
	//  144  254:getfield        #60  <Field byte[] block>
	//  145  257:iload           12
	//  146  259:baload          
	//  147  260:sipush          255
	//  148  263:iand            
	//  149  264:iload           7
	//  150  266:ishl            
	//  151  267:iadd            
	//  152  268:istore          8
				l1 += 8;
	//  153  270:iload           7
	//  154  272:bipush          8
	//  155  274:iadd            
	//  156  275:istore          7
				j3++;
	//  157  277:iload           12
	//  158  279:iconst_1        
	//  159  280:iadd            
	//  160  281:istore          12
				l2 = j2 - 1;
	//  161  283:iload           9
	//  162  285:iconst_1        
	//  163  286:isub            
	//  164  287:istore          10
			}
		}
		  goto _L1
	//* 165  289:goto            205
		int k2;
		int k4;
		int l4;
		k2 = i2 & j1;
	//  166  292:iload           8
	//  167  294:iload           5
	//  168  296:iand            
	//  169  297:istore          9
		k4 = i2 >> k1;
	//  170  299:iload           8
	//  171  301:iload           6
	//  172  303:ishr            
	//  173  304:istore          17
		l4 = l1 - k1;
	//  174  306:iload           7
	//  175  308:iload           6
	//  176  310:isub            
	//  177  311:istore          18
		if(k2 > l3) goto _L1; else goto _L2
	//  178  313:iload           9
	//  179  315:iload           14
	//  180  317:icmpgt          837
_L2:
		if(k2 == i6 + 1)
	//* 181  320:iload           9
	//* 182  322:iload           22
	//* 183  324:iconst_1        
	//* 184  325:iadd            
	//* 185  326:icmpne          331
			return false;
	//  186  329:iconst_0        
	//  187  330:ireturn         
		if(k2 == i6)
	//* 188  331:iload           9
	//* 189  333:iload           22
	//* 190  335:icmpne          371
		{
			k1 = l5 + 1;
	//  191  338:iload           21
	//  192  340:iconst_1        
	//  193  341:iadd            
	//  194  342:istore          6
			j1 = (1 << k1) - 1;
	//  195  344:iconst_1        
	//  196  345:iload           6
	//  197  347:ishl            
	//  198  348:iconst_1        
	//  199  349:isub            
	//  200  350:istore          5
			l3 = i6 + 2;
	//  201  352:iload           22
	//  202  354:iconst_2        
	//  203  355:iadd            
	//  204  356:istore          14
			k = -1;
	//  205  358:iconst_m1       
	//  206  359:istore_2        
			l1 = l4;
	//  207  360:iload           18
	//  208  362:istore          7
			i2 = k4;
	//  209  364:iload           17
	//  210  366:istore          8
		} else
	//* 211  368:goto            205
		{
label1:
			{
				if(k != -1)
					break label1;
	//  212  371:iload_2         
	//  213  372:iconst_m1       
	//  214  373:icmpne          411
				pixelStack[j] = suffix[k2];
	//  215  376:aload_0         
	//  216  377:getfield        #141 <Field byte[] pixelStack>
	//  217  380:iload_1         
	//  218  381:aload_0         
	//  219  382:getfield        #139 <Field byte[] suffix>
	//  220  385:iload           9
	//  221  387:baload          
	//  222  388:bastore         
				k = k2;
	//  223  389:iload           9
	//  224  391:istore_2        
				j++;
	//  225  392:iload_1         
	//  226  393:iconst_1        
	//  227  394:iadd            
	//  228  395:istore_1        
				l1 = l4;
	//  229  396:iload           18
	//  230  398:istore          7
				i2 = k4;
	//  231  400:iload           17
	//  232  402:istore          8
				i4 = k2;
	//  233  404:iload           9
	//  234  406:istore          15
			}
		}
		  goto _L3
	//* 235  408:goto            205
		l1 = k2;
	//  236  411:iload           9
	//  237  413:istore          7
		i2 = j;
	//  238  415:iload_1         
	//  239  416:istore          8
		if(k2 == l3)
	//* 240  418:iload           9
	//* 241  420:iload           14
	//* 242  422:icmpne          442
		{
			pixelStack[j] = (byte)i4;
	//  243  425:aload_0         
	//  244  426:getfield        #141 <Field byte[] pixelStack>
	//  245  429:iload_1         
	//  246  430:iload           15
	//  247  432:int2byte        
	//  248  433:bastore         
			l1 = k;
	//  249  434:iload_2         
	//  250  435:istore          7
			i2 = j + 1;
	//  251  437:iload_1         
	//  252  438:iconst_1        
	//  253  439:iadd            
	//  254  440:istore          8
		}
		while(l1 > i6) 
	//* 255  442:iload           7
	//* 256  444:iload           22
	//* 257  446:icmple          481
		{
			pixelStack[i2] = suffix[l1];
	//  258  449:aload_0         
	//  259  450:getfield        #141 <Field byte[] pixelStack>
	//  260  453:iload           8
	//  261  455:aload_0         
	//  262  456:getfield        #139 <Field byte[] suffix>
	//  263  459:iload           7
	//  264  461:baload          
	//  265  462:bastore         
			l1 = ((int) (prefix[l1]));
	//  266  463:aload_0         
	//  267  464:getfield        #137 <Field short[] prefix>
	//  268  467:iload           7
	//  269  469:saload          
	//  270  470:istore          7
			i2++;
	//  271  472:iload           8
	//  272  474:iconst_1        
	//  273  475:iadd            
	//  274  476:istore          8
		}
	//* 275  478:goto            442
		i4 = suffix[l1] & 0xff;
	//  276  481:aload_0         
	//  277  482:getfield        #139 <Field byte[] suffix>
	//  278  485:iload           7
	//  279  487:baload          
	//  280  488:sipush          255
	//  281  491:iand            
	//  282  492:istore          15
		if(l3 >= 4096)
	//* 283  494:iload           14
	//* 284  496:sipush          4096
	//* 285  499:icmplt          504
			return false;
	//  286  502:iconst_0        
	//  287  503:ireturn         
		byte abyte0[] = pixelStack;
	//  288  504:aload_0         
	//  289  505:getfield        #141 <Field byte[] pixelStack>
	//  290  508:astore          23
		l1 = i2 + 1;
	//  291  510:iload           8
	//  292  512:iconst_1        
	//  293  513:iadd            
	//  294  514:istore          7
		abyte0[i2] = (byte)i4;
	//  295  516:aload           23
	//  296  518:iload           8
	//  297  520:iload           15
	//  298  522:int2byte        
	//  299  523:bastore         
		prefix[l3] = (short)k;
	//  300  524:aload_0         
	//  301  525:getfield        #137 <Field short[] prefix>
	//  302  528:iload           14
	//  303  530:iload_2         
	//  304  531:int2short       
	//  305  532:sastore         
		suffix[l3] = (byte)i4;
	//  306  533:aload_0         
	//  307  534:getfield        #139 <Field byte[] suffix>
	//  308  537:iload           14
	//  309  539:iload           15
	//  310  541:int2byte        
	//  311  542:bastore         
		l3++;
	//  312  543:iload           14
	//  313  545:iconst_1        
	//  314  546:iadd            
	//  315  547:istore          14
		j = j1;
	//  316  549:iload           5
	//  317  551:istore_1        
		k = k1;
	//  318  552:iload           6
	//  319  554:istore_2        
		if((l3 & j1) == 0)
	//* 320  555:iload           14
	//* 321  557:iload           5
	//* 322  559:iand            
	//* 323  560:ifne            588
		{
			j = j1;
	//  324  563:iload           5
	//  325  565:istore_1        
			k = k1;
	//  326  566:iload           6
	//  327  568:istore_2        
			if(l3 < 4096)
	//* 328  569:iload           14
	//* 329  571:sipush          4096
	//* 330  574:icmpge          588
			{
				k = k1 + 1;
	//  331  577:iload           6
	//  332  579:iconst_1        
	//  333  580:iadd            
	//  334  581:istore_2        
				j = j1 + l3;
	//  335  582:iload           5
	//  336  584:iload           14
	//  337  586:iadd            
	//  338  587:istore_1        
			}
		}
		j1 = l1;
	//  339  588:iload           7
	//  340  590:istore          5
		i2 = k4;
	//  341  592:iload           17
	//  342  594:istore          8
		k1 = k;
	//  343  596:iload_2         
	//  344  597:istore          6
		k4 = j;
	//  345  599:iload_1         
	//  346  600:istore          17
		l1 = l4;
	//  347  602:iload           18
	//  348  604:istore          7
_L11:
		j1--;
	//  349  606:iload           5
	//  350  608:iconst_1        
	//  351  609:isub            
	//  352  610:istore          5
		j4++;
	//  353  612:iload           16
	//  354  614:iconst_1        
	//  355  615:iadd            
	//  356  616:istore          16
		setPixel(k3, i1, ((int) (pixelStack[j1])));
	//  357  618:aload_0         
	//  358  619:iload           13
	//  359  621:iload           4
	//  360  623:aload_0         
	//  361  624:getfield        #141 <Field byte[] pixelStack>
	//  362  627:iload           5
	//  363  629:baload          
	//  364  630:invokevirtual   #163 <Method void setPixel(int, int, int)>
		k = k3 + 1;
	//  365  633:iload           13
	//  366  635:iconst_1        
	//  367  636:iadd            
	//  368  637:istore_2        
		j = i1;
	//  369  638:iload           4
	//  370  640:istore_1        
		k3 = k;
	//  371  641:iload_2         
	//  372  642:istore          13
		if(k < iw)
			break MISSING_BLOCK_LABEL_817;
	//  373  644:iload_2         
	//  374  645:aload_0         
	//  375  646:getfield        #133 <Field int iw>
	//  376  649:icmplt          817
		k3 = 0;
	//  377  652:iconst_0        
	//  378  653:istore          13
		l4 = 0;
	//  379  655:iconst_0        
	//  380  656:istore          18
		k = i1 + l;
	//  381  658:iload           4
	//  382  660:iload_3         
	//  383  661:iadd            
	//  384  662:istore_2        
		j = k;
	//  385  663:iload_2         
	//  386  664:istore_1        
		if(k < ih)
			break MISSING_BLOCK_LABEL_817;
	//  387  665:iload_2         
	//  388  666:aload_0         
	//  389  667:getfield        #135 <Field int ih>
	//  390  670:icmplt          817
		if(!interlace)
			break MISSING_BLOCK_LABEL_790;
	//  391  673:aload_0         
	//  392  674:getfield        #149 <Field boolean interlace>
	//  393  677:ifeq            790
		i1 = i3;
	//  394  680:iload           11
	//  395  682:istore          4
_L9:
		i3 = i1 + 1;
	//  396  684:iload           4
	//  397  686:iconst_1        
	//  398  687:iadd            
	//  399  688:istore          11
		i3;
	//  400  690:iload           11
		JVM INSTR tableswitch 2 4: default 720
	//	               2 769
	//	               3 776
	//	               4 783;
	//  401  692:tableswitch     2 4: default 720
	//	               2 769
	//	               3 776
	//	               4 783
		   goto _L4 _L5 _L6 _L7
_L7:
		break MISSING_BLOCK_LABEL_783;
_L4:
		k = ih - 1;
	//  402  720:aload_0         
	//  403  721:getfield        #135 <Field int ih>
	//  404  724:iconst_1        
	//  405  725:isub            
	//  406  726:istore_2        
		j = 0;
	//  407  727:iconst_0        
	//  408  728:istore_1        
_L10:
		l = j;
	//  409  729:iload_1         
	//  410  730:istore_3        
		i1 = i3;
	//  411  731:iload           11
	//  412  733:istore          4
		if(k >= ih) goto _L9; else goto _L8
	//  413  735:iload_2         
	//  414  736:aload_0         
	//  415  737:getfield        #135 <Field int ih>
	//  416  740:icmpge          684
_L8:
		k3 = j1;
	//  417  743:iload           5
	//  418  745:istore          13
		j1 = k4;
	//  419  747:iload           17
	//  420  749:istore          5
		l = j;
	//  421  751:iload_1         
	//  422  752:istore_3        
		i1 = k;
	//  423  753:iload_2         
	//  424  754:istore          4
		k = k2;
	//  425  756:iload           9
	//  426  758:istore_2        
		j = k3;
	//  427  759:iload           13
	//  428  761:istore_1        
		k3 = l4;
	//  429  762:iload           18
	//  430  764:istore          13
		  goto _L3
	//* 431  766:goto            205
_L5:
		k = 4;
	//  432  769:iconst_4        
	//  433  770:istore_2        
		j = l;
	//  434  771:iload_3         
	//  435  772:istore_1        
		  goto _L10
	//* 436  773:goto            729
_L6:
		k = 2;
	//  437  776:iconst_2        
	//  438  777:istore_2        
		j = 4;
	//  439  778:iconst_4        
	//  440  779:istore_1        
		  goto _L10
	//* 441  780:goto            729
		k = 1;
	//  442  783:iconst_1        
	//  443  784:istore_2        
		j = 2;
	//  444  785:iconst_2        
	//  445  786:istore_1        
		  goto _L10
	//* 446  787:goto            729
		i1 = ih - 1;
	//  447  790:aload_0         
	//  448  791:getfield        #135 <Field int ih>
	//  449  794:iconst_1        
	//  450  795:isub            
	//  451  796:istore          4
		l = 0;
	//  452  798:iconst_0        
	//  453  799:istore_3        
		j = j1;
	//  454  800:iload           5
	//  455  802:istore_1        
		j1 = k4;
	//  456  803:iload           17
	//  457  805:istore          5
		k = k2;
	//  458  807:iload           9
	//  459  809:istore_2        
		k3 = l4;
	//  460  810:iload           18
	//  461  812:istore          13
		  goto _L3
	//* 462  814:goto            205
		int i5 = j1;
	//  463  817:iload           5
	//  464  819:istore          18
		j1 = k4;
	//  465  821:iload           17
	//  466  823:istore          5
		i1 = j;
	//  467  825:iload_1         
	//  468  826:istore          4
		k = k2;
	//  469  828:iload           9
	//  470  830:istore_2        
		j = i5;
	//  471  831:iload           18
	//  472  833:istore_1        
		  goto _L3
	//* 473  834:goto            205
_L1:
		return false;
	//  474  837:iconst_0        
	//  475  838:ireturn         
		k4 = j1;
	//  476  839:iload           5
	//  477  841:istore          17
		k2 = k;
	//  478  843:iload_2         
	//  479  844:istore          9
		j1 = j;
	//  480  846:iload_1         
	//  481  847:istore          5
		  goto _L11
	//* 482  849:goto            606
	}

	public int getFrameCount()
	{
		return frames.size();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field ArrayList frames>
	//    2    4:invokevirtual   #167 <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public int[] getFramePosition(int i)
	{
		GifFrame gifframe = (GifFrame)frames.get(i - 1);
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field ArrayList frames>
	//    2    4:iload_1         
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//    6   10:checkcast       #6   <Class GifImage$GifFrame>
	//    7   13:astore_2        
		return (new int[] {
			gifframe.ix, gifframe.iy
		});
	//    8   14:iconst_2        
	//    9   15:newarray        int[]
	//   10   17:dup             
	//   11   18:iconst_0        
	//   12   19:aload_2         
	//   13   20:getfield        #175 <Field int GifImage$GifFrame.ix>
	//   14   23:iastore         
	//   15   24:dup             
	//   16   25:iconst_1        
	//   17   26:aload_2         
	//   18   27:getfield        #177 <Field int GifImage$GifFrame.iy>
	//   19   30:iastore         
	//   20   31:areturn         
	}

	public Image getImage(int i)
	{
		return ((GifFrame)frames.get(i - 1)).image;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field ArrayList frames>
	//    2    4:iload_1         
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//    6   10:checkcast       #6   <Class GifImage$GifFrame>
	//    7   13:getfield        #183 <Field Image GifImage$GifFrame.image>
	//    8   16:areturn         
	}

	public int[] getLogicalScreen()
	{
		return (new int[] {
			width, height
		});
	//    0    0:iconst_2        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:aload_0         
	//    5    6:getfield        #187 <Field int width>
	//    6    9:iastore         
	//    7   10:dup             
	//    8   11:iconst_1        
	//    9   12:aload_0         
	//   10   13:getfield        #189 <Field int height>
	//   11   16:iastore         
	//   12   17:areturn         
	}

	void process(InputStream inputstream)
		throws IOException
	{
		in = new DataInputStream(((InputStream) (new BufferedInputStream(inputstream))));
	//    0    0:aload_0         
	//    1    1:new             #153 <Class DataInputStream>
	//    2    4:dup             
	//    3    5:new             #191 <Class BufferedInputStream>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #193 <Method void BufferedInputStream(InputStream)>
	//    7   13:invokespecial   #194 <Method void DataInputStream(InputStream)>
	//    8   16:putfield        #151 <Field DataInputStream in>
		readHeader();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #197 <Method void readHeader()>
		readContents();
	//   11   23:aload_0         
	//   12   24:invokevirtual   #200 <Method void readContents()>
		if(frames.isEmpty())
	//*  13   27:aload_0         
	//*  14   28:getfield        #73  <Field ArrayList frames>
	//*  15   31:invokevirtual   #203 <Method boolean ArrayList.isEmpty()>
	//*  16   34:ifeq            54
			throw new IOException(MessageLocalization.getComposedMessage("the.file.does.not.contain.any.valid.image", new Object[0]));
	//   17   37:new             #55  <Class IOException>
	//   18   40:dup             
	//   19   41:ldc1            #205 <String "the.file.does.not.contain.any.valid.image">
	//   20   43:iconst_0        
	//   21   44:anewarray       Object[]
	//   22   47:invokestatic    #211 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   23   50:invokespecial   #213 <Method void IOException(String)>
	//   24   53:athrow          
		else
			return;
	//   25   54:return          
	}

	protected int readBlock()
		throws IOException
	{
		blockSize = in.read();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #151 <Field DataInputStream in>
	//    3    5:invokevirtual   #156 <Method int DataInputStream.read()>
	//    4    8:putfield        #62  <Field int blockSize>
		if(blockSize <= 0)
	//*   5   11:aload_0         
	//*   6   12:getfield        #62  <Field int blockSize>
	//*   7   15:ifgt            25
		{
			blockSize = 0;
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:putfield        #62  <Field int blockSize>
			return 0;
	//   11   23:iconst_0        
	//   12   24:ireturn         
		} else
		{
			blockSize = in.read(block, 0, blockSize);
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #151 <Field DataInputStream in>
	//   16   30:aload_0         
	//   17   31:getfield        #60  <Field byte[] block>
	//   18   34:iconst_0        
	//   19   35:aload_0         
	//   20   36:getfield        #62  <Field int blockSize>
	//   21   39:invokevirtual   #216 <Method int DataInputStream.read(byte[], int, int)>
	//   22   42:putfield        #62  <Field int blockSize>
			return blockSize;
	//   23   45:aload_0         
	//   24   46:getfield        #62  <Field int blockSize>
	//   25   49:ireturn         
		}
	}

	protected byte[] readColorTable(int i)
		throws IOException
	{
		byte abyte0[] = new byte[(1 << newBpc(i)) * 3];
	//    0    0:iconst_1        
	//    1    1:iload_1         
	//    2    2:invokestatic    #220 <Method int newBpc(int)>
	//    3    5:ishl            
	//    4    6:iconst_3        
	//    5    7:imul            
	//    6    8:newarray        byte[]
	//    7   10:astore_2        
		in.readFully(abyte0, 0, (1 << i) * 3);
	//    8   11:aload_0         
	//    9   12:getfield        #151 <Field DataInputStream in>
	//   10   15:aload_2         
	//   11   16:iconst_0        
	//   12   17:iconst_1        
	//   13   18:iload_1         
	//   14   19:ishl            
	//   15   20:iconst_3        
	//   16   21:imul            
	//   17   22:invokevirtual   #223 <Method void DataInputStream.readFully(byte[], int, int)>
		return abyte0;
	//   18   25:aload_2         
	//   19   26:areturn         
	}

	protected void readContents()
		throws IOException
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		do
		{
			if(!flag)
	//*   2    2:iload_1         
	//*   3    3:ifne            110
			{
				switch(in.read())
	//*   4    6:aload_0         
	//*   5    7:getfield        #151 <Field DataInputStream in>
	//*   6   10:invokevirtual   #156 <Method int DataInputStream.read()>
				{
	//*   7   13:lookupswitch    2: default 40
	//	               33: 52
	//	               44: 45
				default:
					flag = true;
	//    8   40:iconst_1        
	//    9   41:istore_1        
					break;

	//*  10   42:goto            2
				case 44: // ','
					readImage();
	//   11   45:aload_0         
	//   12   46:invokevirtual   #226 <Method void readImage()>
					break;

	//*  13   49:goto            2
				case 33: // '!'
					switch(in.read())
	//*  14   52:aload_0         
	//*  15   53:getfield        #151 <Field DataInputStream in>
	//*  16   56:invokevirtual   #156 <Method int DataInputStream.read()>
					{
	//*  17   59:lookupswitch    2: default 84
	//	               249: 91
	//	               255: 98
					default:
						skip();
	//   18   84:aload_0         
	//   19   85:invokevirtual   #229 <Method void skip()>
						break;

	//*  20   88:goto            2
					case 249: 
						readGraphicControlExt();
	//   21   91:aload_0         
	//   22   92:invokevirtual   #232 <Method void readGraphicControlExt()>
						break;

	//*  23   95:goto            2
					case 255: 
						readBlock();
	//   24   98:aload_0         
	//   25   99:invokevirtual   #159 <Method int readBlock()>
	//   26  102:pop             
						skip();
	//   27  103:aload_0         
	//   28  104:invokevirtual   #229 <Method void skip()>
						break;
					}
					break;
				}
				if(true)
					continue;
	//   29  107:goto            2
			}
			return;
	//   30  110:return          
		} while(true);
	}

	protected void readGraphicControlExt()
		throws IOException
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		in.read();
	//    2    2:aload_0         
	//    3    3:getfield        #151 <Field DataInputStream in>
	//    4    6:invokevirtual   #156 <Method int DataInputStream.read()>
	//    5    9:pop             
		int i = in.read();
	//    6   10:aload_0         
	//    7   11:getfield        #151 <Field DataInputStream in>
	//    8   14:invokevirtual   #156 <Method int DataInputStream.read()>
	//    9   17:istore_1        
		dispose = (i & 0x1c) >> 2;
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:bipush          28
	//   13   22:iand            
	//   14   23:iconst_2        
	//   15   24:ishr            
	//   16   25:putfield        #64  <Field int dispose>
		if(dispose == 0)
	//*  17   28:aload_0         
	//*  18   29:getfield        #64  <Field int dispose>
	//*  19   32:ifne            40
			dispose = 1;
	//   20   35:aload_0         
	//   21   36:iconst_1        
	//   22   37:putfield        #64  <Field int dispose>
		if((i & 1) == 0)
	//*  23   40:iload_1         
	//*  24   41:iconst_1        
	//*  25   42:iand            
	//*  26   43:ifeq            82
	//*  27   46:aload_0         
	//*  28   47:iload_2         
	//*  29   48:putfield        #66  <Field boolean transparency>
	//*  30   51:aload_0         
	//*  31   52:aload_0         
	//*  32   53:invokevirtual   #235 <Method int readShort()>
	//*  33   56:bipush          10
	//*  34   58:imul            
	//*  35   59:putfield        #68  <Field int delay>
	//*  36   62:aload_0         
	//*  37   63:aload_0         
	//*  38   64:getfield        #151 <Field DataInputStream in>
	//*  39   67:invokevirtual   #156 <Method int DataInputStream.read()>
	//*  40   70:putfield        #237 <Field int transIndex>
	//*  41   73:aload_0         
	//*  42   74:getfield        #151 <Field DataInputStream in>
	//*  43   77:invokevirtual   #156 <Method int DataInputStream.read()>
	//*  44   80:pop             
	//*  45   81:return          
			flag = false;
	//   46   82:iconst_0        
	//   47   83:istore_2        
		transparency = flag;
		delay = readShort() * 10;
		transIndex = in.read();
		in.read();
	//*  48   84:goto            46
	}

	protected void readHeader()
		throws IOException
	{
		StringBuilder stringbuilder = new StringBuilder("");
	//    0    0:new             #239 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #241 <String "">
	//    3    6:invokespecial   #242 <Method void StringBuilder(String)>
	//    4    9:astore_2        
		for(int i = 0; i < 6; i++)
	//*   5   10:iconst_0        
	//*   6   11:istore_1        
	//*   7   12:iload_1         
	//*   8   13:bipush          6
	//*   9   15:icmpge          38
			stringbuilder.append((char)in.read());
	//   10   18:aload_2         
	//   11   19:aload_0         
	//   12   20:getfield        #151 <Field DataInputStream in>
	//   13   23:invokevirtual   #156 <Method int DataInputStream.read()>
	//   14   26:int2char        
	//   15   27:invokevirtual   #246 <Method StringBuilder StringBuilder.append(char)>
	//   16   30:pop             

	//   17   31:iload_1         
	//   18   32:iconst_1        
	//   19   33:iadd            
	//   20   34:istore_1        
	//*  21   35:goto            12
		if(!stringbuilder.toString().startsWith("GIF8"))
	//*  22   38:aload_2         
	//*  23   39:invokevirtual   #250 <Method String StringBuilder.toString()>
	//*  24   42:ldc1            #252 <String "GIF8">
	//*  25   44:invokevirtual   #258 <Method boolean String.startsWith(String)>
	//*  26   47:ifne            68
			throw new IOException(MessageLocalization.getComposedMessage("gif.signature.nor.found", new Object[0]));
	//   27   50:new             #55  <Class IOException>
	//   28   53:dup             
	//   29   54:ldc2            #260 <String "gif.signature.nor.found">
	//   30   57:iconst_0        
	//   31   58:anewarray       Object[]
	//   32   61:invokestatic    #211 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   33   64:invokespecial   #213 <Method void IOException(String)>
	//   34   67:athrow          
		readLSD();
	//   35   68:aload_0         
	//   36   69:invokevirtual   #263 <Method void readLSD()>
		if(gctFlag)
	//*  37   72:aload_0         
	//*  38   73:getfield        #265 <Field boolean gctFlag>
	//*  39   76:ifeq            91
			m_global_table = readColorTable(m_gbpc);
	//   40   79:aload_0         
	//   41   80:aload_0         
	//   42   81:aload_0         
	//   43   82:getfield        #267 <Field int m_gbpc>
	//   44   85:invokevirtual   #269 <Method byte[] readColorTable(int)>
	//   45   88:putfield        #271 <Field byte[] m_global_table>
	//   46   91:return          
	}

	protected void readImage()
		throws IOException
	{
		ix = readShort();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #235 <Method int readShort()>
	//    3    5:putfield        #274 <Field int ix>
		iy = readShort();
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #235 <Method int readShort()>
	//    7   13:putfield        #275 <Field int iy>
		iw = readShort();
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #235 <Method int readShort()>
	//   11   21:putfield        #133 <Field int iw>
		ih = readShort();
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:invokevirtual   #235 <Method int readShort()>
	//   15   29:putfield        #135 <Field int ih>
		int i = in.read();
	//   16   32:aload_0         
	//   17   33:getfield        #151 <Field DataInputStream in>
	//   18   36:invokevirtual   #156 <Method int DataInputStream.read()>
	//   19   39:istore_1        
		boolean flag;
		ImgRaw imgraw;
		Object obj;
		PdfDictionary pdfdictionary;
		if((i & 0x80) != 0)
	//*  20   40:iload_1         
	//*  21   41:sipush          128
	//*  22   44:iand            
	//*  23   45:ifeq            412
			flag = true;
	//   24   48:iconst_1        
	//   25   49:istore_2        
		else
	//*  26   50:aload_0         
	//*  27   51:iload_2         
	//*  28   52:putfield        #277 <Field boolean lctFlag>
	//*  29   55:iload_1         
	//*  30   56:bipush          64
	//*  31   58:iand            
	//*  32   59:ifeq            417
	//*  33   62:iconst_1        
	//*  34   63:istore_2        
	//*  35   64:aload_0         
	//*  36   65:iload_2         
	//*  37   66:putfield        #149 <Field boolean interlace>
	//*  38   69:aload_0         
	//*  39   70:iconst_2        
	//*  40   71:iload_1         
	//*  41   72:bipush          7
	//*  42   74:iand            
	//*  43   75:ishl            
	//*  44   76:putfield        #279 <Field int lctSize>
	//*  45   79:aload_0         
	//*  46   80:aload_0         
	//*  47   81:getfield        #267 <Field int m_gbpc>
	//*  48   84:invokestatic    #220 <Method int newBpc(int)>
	//*  49   87:putfield        #143 <Field int m_bpc>
	//*  50   90:aload_0         
	//*  51   91:getfield        #277 <Field boolean lctFlag>
	//*  52   94:ifeq            422
	//*  53   97:aload_0         
	//*  54   98:aload_0         
	//*  55   99:iload_1         
	//*  56  100:bipush          7
	//*  57  102:iand            
	//*  58  103:iconst_1        
	//*  59  104:iadd            
	//*  60  105:invokevirtual   #269 <Method byte[] readColorTable(int)>
	//*  61  108:putfield        #281 <Field byte[] m_curr_table>
	//*  62  111:aload_0         
	//*  63  112:iload_1         
	//*  64  113:bipush          7
	//*  65  115:iand            
	//*  66  116:iconst_1        
	//*  67  117:iadd            
	//*  68  118:invokestatic    #220 <Method int newBpc(int)>
	//*  69  121:putfield        #143 <Field int m_bpc>
	//*  70  124:aload_0         
	//*  71  125:getfield        #66  <Field boolean transparency>
	//*  72  128:ifeq            150
	//*  73  131:aload_0         
	//*  74  132:getfield        #237 <Field int transIndex>
	//*  75  135:aload_0         
	//*  76  136:getfield        #281 <Field byte[] m_curr_table>
	//*  77  139:arraylength     
	//*  78  140:iconst_3        
	//*  79  141:idiv            
	//*  80  142:icmplt          150
	//*  81  145:aload_0         
	//*  82  146:iconst_0        
	//*  83  147:putfield        #66  <Field boolean transparency>
	//*  84  150:aload_0         
	//*  85  151:getfield        #66  <Field boolean transparency>
	//*  86  154:ifeq            192
	//*  87  157:aload_0         
	//*  88  158:getfield        #143 <Field int m_bpc>
	//*  89  161:iconst_1        
	//*  90  162:icmpne          192
	//*  91  165:bipush          12
	//*  92  167:newarray        byte[]
	//*  93  169:astore_3        
	//*  94  170:aload_0         
	//*  95  171:getfield        #281 <Field byte[] m_curr_table>
	//*  96  174:iconst_0        
	//*  97  175:aload_3         
	//*  98  176:iconst_0        
	//*  99  177:bipush          6
	//* 100  179:invokestatic    #287 <Method void System.arraycopy(Object, int, Object, int, int)>
	//* 101  182:aload_0         
	//* 102  183:aload_3         
	//* 103  184:putfield        #281 <Field byte[] m_curr_table>
	//* 104  187:aload_0         
	//* 105  188:iconst_2        
	//* 106  189:putfield        #143 <Field int m_bpc>
	//* 107  192:aload_0         
	//* 108  193:invokevirtual   #289 <Method boolean decodeImageData()>
	//* 109  196:ifne            203
	//* 110  199:aload_0         
	//* 111  200:invokevirtual   #229 <Method void skip()>
	//* 112  203:new             #291 <Class ImgRaw>
	//* 113  206:dup             
	//* 114  207:aload_0         
	//* 115  208:getfield        #133 <Field int iw>
	//* 116  211:aload_0         
	//* 117  212:getfield        #135 <Field int ih>
	//* 118  215:iconst_1        
	//* 119  216:aload_0         
	//* 120  217:getfield        #143 <Field int m_bpc>
	//* 121  220:aload_0         
	//* 122  221:getfield        #147 <Field byte[] m_out>
	//* 123  224:invokespecial   #294 <Method void ImgRaw(int, int, int, int, byte[])>
	//* 124  227:astore_3        
	//* 125  228:new             #296 <Class PdfArray>
	//* 126  231:dup             
	//* 127  232:invokespecial   #297 <Method void PdfArray()>
	//* 128  235:astore          4
	//* 129  237:aload           4
	//* 130  239:getstatic       #303 <Field PdfName PdfName.INDEXED>
	//* 131  242:invokevirtual   #307 <Method boolean PdfArray.add(com.itextpdf.text.pdf.PdfObject)>
	//* 132  245:pop             
	//* 133  246:aload           4
	//* 134  248:getstatic       #310 <Field PdfName PdfName.DEVICERGB>
	//* 135  251:invokevirtual   #307 <Method boolean PdfArray.add(com.itextpdf.text.pdf.PdfObject)>
	//* 136  254:pop             
	//* 137  255:aload           4
	//* 138  257:new             #312 <Class PdfNumber>
	//* 139  260:dup             
	//* 140  261:aload_0         
	//* 141  262:getfield        #281 <Field byte[] m_curr_table>
	//* 142  265:arraylength     
	//* 143  266:iconst_3        
	//* 144  267:idiv            
	//* 145  268:iconst_1        
	//* 146  269:isub            
	//* 147  270:invokespecial   #315 <Method void PdfNumber(int)>
	//* 148  273:invokevirtual   #307 <Method boolean PdfArray.add(com.itextpdf.text.pdf.PdfObject)>
	//* 149  276:pop             
	//* 150  277:aload           4
	//* 151  279:new             #317 <Class PdfString>
	//* 152  282:dup             
	//* 153  283:aload_0         
	//* 154  284:getfield        #281 <Field byte[] m_curr_table>
	//* 155  287:invokespecial   #318 <Method void PdfString(byte[])>
	//* 156  290:invokevirtual   #307 <Method boolean PdfArray.add(com.itextpdf.text.pdf.PdfObject)>
	//* 157  293:pop             
	//* 158  294:new             #320 <Class PdfDictionary>
	//* 159  297:dup             
	//* 160  298:invokespecial   #321 <Method void PdfDictionary()>
	//* 161  301:astore          5
	//* 162  303:aload           5
	//* 163  305:getstatic       #324 <Field PdfName PdfName.COLORSPACE>
	//* 164  308:aload           4
	//* 165  310:invokevirtual   #328 <Method void PdfDictionary.put(PdfName, com.itextpdf.text.pdf.PdfObject)>
	//* 166  313:aload_3         
	//* 167  314:aload           5
	//* 168  316:invokevirtual   #334 <Method void Image.setAdditional(PdfDictionary)>
	//* 169  319:aload_0         
	//* 170  320:getfield        #66  <Field boolean transparency>
	//* 171  323:ifeq            347
	//* 172  326:aload_3         
	//* 173  327:iconst_2        
	//* 174  328:newarray        int[]
	//* 175  330:dup             
	//* 176  331:iconst_0        
	//* 177  332:aload_0         
	//* 178  333:getfield        #237 <Field int transIndex>
	//* 179  336:iastore         
	//* 180  337:dup             
	//* 181  338:iconst_1        
	//* 182  339:aload_0         
	//* 183  340:getfield        #237 <Field int transIndex>
	//* 184  343:iastore         
	//* 185  344:invokevirtual   #338 <Method void Image.setTransparency(int[])>
	//* 186  347:aload_3         
	//* 187  348:iconst_3        
	//* 188  349:invokevirtual   #341 <Method void Image.setOriginalType(int)>
	//* 189  352:aload_3         
	//* 190  353:aload_0         
	//* 191  354:getfield        #127 <Field byte[] fromData>
	//* 192  357:invokevirtual   #344 <Method void Image.setOriginalData(byte[])>
	//* 193  360:aload_3         
	//* 194  361:aload_0         
	//* 195  362:getfield        #90  <Field URL fromUrl>
	//* 196  365:invokevirtual   #347 <Method void Image.setUrl(URL)>
	//* 197  368:new             #6   <Class GifImage$GifFrame>
	//* 198  371:dup             
	//* 199  372:invokespecial   #348 <Method void GifImage$GifFrame()>
	//* 200  375:astore          4
	//* 201  377:aload           4
	//* 202  379:aload_3         
	//* 203  380:putfield        #183 <Field Image GifImage$GifFrame.image>
	//* 204  383:aload           4
	//* 205  385:aload_0         
	//* 206  386:getfield        #274 <Field int ix>
	//* 207  389:putfield        #175 <Field int GifImage$GifFrame.ix>
	//* 208  392:aload           4
	//* 209  394:aload_0         
	//* 210  395:getfield        #275 <Field int iy>
	//* 211  398:putfield        #177 <Field int GifImage$GifFrame.iy>
	//* 212  401:aload_0         
	//* 213  402:getfield        #73  <Field ArrayList frames>
	//* 214  405:aload           4
	//* 215  407:invokevirtual   #351 <Method boolean ArrayList.add(Object)>
	//* 216  410:pop             
	//* 217  411:return          
			flag = false;
	//  218  412:iconst_0        
	//  219  413:istore_2        
		lctFlag = flag;
		if((i & 0x40) != 0)
			flag = true;
		else
	//* 220  414:goto            50
			flag = false;
	//  221  417:iconst_0        
	//  222  418:istore_2        
		interlace = flag;
		lctSize = 2 << (i & 7);
		m_bpc = newBpc(m_gbpc);
		if(lctFlag)
		{
			m_curr_table = readColorTable((i & 7) + 1);
			m_bpc = newBpc((i & 7) + 1);
		} else
	//* 223  419:goto            64
		{
			m_curr_table = m_global_table;
	//  224  422:aload_0         
	//  225  423:aload_0         
	//  226  424:getfield        #271 <Field byte[] m_global_table>
	//  227  427:putfield        #281 <Field byte[] m_curr_table>
		}
		if(transparency && transIndex >= m_curr_table.length / 3)
			transparency = false;
		if(transparency && m_bpc == 1)
		{
			byte abyte0[] = new byte[12];
			System.arraycopy(((Object) (m_curr_table)), 0, ((Object) (abyte0)), 0, 6);
			m_curr_table = abyte0;
			m_bpc = 2;
		}
		if(!decodeImageData())
			skip();
		imgraw = new ImgRaw(iw, ih, 1, m_bpc, m_out);
		obj = ((Object) (new PdfArray()));
		((PdfArray) (obj)).add(((com.itextpdf.text.pdf.PdfObject) (PdfName.INDEXED)));
		((PdfArray) (obj)).add(((com.itextpdf.text.pdf.PdfObject) (PdfName.DEVICERGB)));
		((PdfArray) (obj)).add(((com.itextpdf.text.pdf.PdfObject) (new PdfNumber(m_curr_table.length / 3 - 1))));
		((PdfArray) (obj)).add(((com.itextpdf.text.pdf.PdfObject) (new PdfString(m_curr_table))));
		pdfdictionary = new PdfDictionary();
		pdfdictionary.put(PdfName.COLORSPACE, ((com.itextpdf.text.pdf.PdfObject) (obj)));
		((Image) (imgraw)).setAdditional(pdfdictionary);
		if(transparency)
			((Image) (imgraw)).setTransparency(new int[] {
				transIndex, transIndex
			});
		((Image) (imgraw)).setOriginalType(3);
		((Image) (imgraw)).setOriginalData(fromData);
		((Image) (imgraw)).setUrl(fromUrl);
		obj = ((Object) (new GifFrame()));
		obj.image = ((Image) (imgraw));
		obj.ix = ix;
		obj.iy = iy;
		frames.add(obj);
		return;
	//* 228  430:goto            124
		Exception exception;
		exception;
	//  229  433:astore_3        
_L2:
		throw new ExceptionConverter(exception);
	//  230  434:new             #353 <Class ExceptionConverter>
	//  231  437:dup             
	//  232  438:aload_3         
	//  233  439:invokespecial   #356 <Method void ExceptionConverter(Exception)>
	//  234  442:athrow          
		exception;
	//  235  443:astore_3        
		if(true) goto _L2; else goto _L1
_L1:
	//* 236  444:goto            434
	}

	protected void readLSD()
		throws IOException
	{
		width = readShort();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #235 <Method int readShort()>
	//    3    5:putfield        #187 <Field int width>
		height = readShort();
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #235 <Method int readShort()>
	//    7   13:putfield        #189 <Field int height>
		int i = in.read();
	//    8   16:aload_0         
	//    9   17:getfield        #151 <Field DataInputStream in>
	//   10   20:invokevirtual   #156 <Method int DataInputStream.read()>
	//   11   23:istore_1        
		boolean flag;
		if((i & 0x80) != 0)
	//*  12   24:iload_1         
	//*  13   25:sipush          128
	//*  14   28:iand            
	//*  15   29:ifeq            72
			flag = true;
	//   16   32:iconst_1        
	//   17   33:istore_2        
		else
	//*  18   34:aload_0         
	//*  19   35:iload_2         
	//*  20   36:putfield        #265 <Field boolean gctFlag>
	//*  21   39:aload_0         
	//*  22   40:iload_1         
	//*  23   41:bipush          7
	//*  24   43:iand            
	//*  25   44:iconst_1        
	//*  26   45:iadd            
	//*  27   46:putfield        #267 <Field int m_gbpc>
	//*  28   49:aload_0         
	//*  29   50:aload_0         
	//*  30   51:getfield        #151 <Field DataInputStream in>
	//*  31   54:invokevirtual   #156 <Method int DataInputStream.read()>
	//*  32   57:putfield        #358 <Field int bgIndex>
	//*  33   60:aload_0         
	//*  34   61:aload_0         
	//*  35   62:getfield        #151 <Field DataInputStream in>
	//*  36   65:invokevirtual   #156 <Method int DataInputStream.read()>
	//*  37   68:putfield        #360 <Field int pixelAspect>
	//*  38   71:return          
			flag = false;
	//   39   72:iconst_0        
	//   40   73:istore_2        
		gctFlag = flag;
		m_gbpc = (i & 7) + 1;
		bgIndex = in.read();
		pixelAspect = in.read();
	//*  41   74:goto            34
	}

	protected int readShort()
		throws IOException
	{
		return in.read() | in.read() << 8;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field DataInputStream in>
	//    2    4:invokevirtual   #156 <Method int DataInputStream.read()>
	//    3    7:aload_0         
	//    4    8:getfield        #151 <Field DataInputStream in>
	//    5   11:invokevirtual   #156 <Method int DataInputStream.read()>
	//    6   14:bipush          8
	//    7   16:ishl            
	//    8   17:ior             
	//    9   18:ireturn         
	}

	protected void resetFrame()
	{
	//    0    0:return          
	}

	protected void setPixel(int i, int j, int k)
	{
		if(m_bpc == 8)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field int m_bpc>
	//*   2    4:bipush          8
	//*   3    6:icmpne          29
		{
			int l = iw;
	//    4    9:aload_0         
	//    5   10:getfield        #133 <Field int iw>
	//    6   13:istore          4
			m_out[i + l * j] = (byte)k;
	//    7   15:aload_0         
	//    8   16:getfield        #147 <Field byte[] m_out>
	//    9   19:iload_1         
	//   10   20:iload           4
	//   11   22:iload_2         
	//   12   23:imul            
	//   13   24:iadd            
	//   14   25:iload_3         
	//   15   26:int2byte        
	//   16   27:bastore         
			return;
	//   17   28:return          
		} else
		{
			j = m_line_stride * j + i / (8 / m_bpc);
	//   18   29:aload_0         
	//   19   30:getfield        #145 <Field int m_line_stride>
	//   20   33:iload_2         
	//   21   34:imul            
	//   22   35:iload_1         
	//   23   36:bipush          8
	//   24   38:aload_0         
	//   25   39:getfield        #143 <Field int m_bpc>
	//   26   42:idiv            
	//   27   43:idiv            
	//   28   44:iadd            
	//   29   45:istore_2        
			int i1 = m_bpc;
	//   30   46:aload_0         
	//   31   47:getfield        #143 <Field int m_bpc>
	//   32   50:istore          4
			int j1 = 8 / m_bpc;
	//   33   52:bipush          8
	//   34   54:aload_0         
	//   35   55:getfield        #143 <Field int m_bpc>
	//   36   58:idiv            
	//   37   59:istore          5
			int k1 = m_bpc;
	//   38   61:aload_0         
	//   39   62:getfield        #143 <Field int m_bpc>
	//   40   65:istore          6
			byte abyte0[] = m_out;
	//   41   67:aload_0         
	//   42   68:getfield        #147 <Field byte[] m_out>
	//   43   71:astore          7
			abyte0[j] = (byte)(abyte0[j] | k << 8 - i1 * (i % j1) - k1);
	//   44   73:aload           7
	//   45   75:iload_2         
	//   46   76:aload           7
	//   47   78:iload_2         
	//   48   79:baload          
	//   49   80:iload_3         
	//   50   81:bipush          8
	//   51   83:iload           4
	//   52   85:iload_1         
	//   53   86:iload           5
	//   54   88:irem            
	//   55   89:imul            
	//   56   90:isub            
	//   57   91:iload           6
	//   58   93:isub            
	//   59   94:ishl            
	//   60   95:ior             
	//   61   96:int2byte        
	//   62   97:bastore         
			return;
	//   63   98:return          
		}
	}

	protected void skip()
		throws IOException
	{
		do
			readBlock();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #159 <Method int readBlock()>
	//    2    4:pop             
		while(blockSize > 0);
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field int blockSize>
	//    5    9:ifgt            0
	//    6   12:return          
	}

	protected static final int MaxStackSize = 4096;
	protected int bgColor;
	protected int bgIndex;
	protected byte block[];
	protected int blockSize;
	protected int delay;
	protected int dispose;
	protected ArrayList frames;
	protected byte fromData[];
	protected URL fromUrl;
	protected boolean gctFlag;
	protected int height;
	protected int ih;
	protected DataInputStream in;
	protected boolean interlace;
	protected int iw;
	protected int ix;
	protected int iy;
	protected boolean lctFlag;
	protected int lctSize;
	protected int m_bpc;
	protected byte m_curr_table[];
	protected int m_gbpc;
	protected byte m_global_table[];
	protected int m_line_stride;
	protected byte m_local_table[];
	protected byte m_out[];
	protected int pixelAspect;
	protected byte pixelStack[];
	protected byte pixels[];
	protected short prefix[];
	protected byte suffix[];
	protected int transIndex;
	protected boolean transparency;
	protected int width;
}
