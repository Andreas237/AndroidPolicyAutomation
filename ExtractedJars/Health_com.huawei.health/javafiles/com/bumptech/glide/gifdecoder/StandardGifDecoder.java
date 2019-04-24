// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.*;

// Referenced classes of package com.bumptech.glide.gifdecoder:
//			GifDecoder, GifHeader, GifFrame, GifHeaderParser

public class StandardGifDecoder
	implements GifDecoder
{

	public StandardGifDecoder(GifDecoder.BitmapProvider bitmapprovider)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method void Object()>
		pct = new int[256];
	//    2    4:aload_0         
	//    3    5:sipush          256
	//    4    8:newarray        int[]
	//    5   10:putfield        #73  <Field int[] pct>
		workBufferSize = 0;
	//    6   13:aload_0         
	//    7   14:iconst_0        
	//    8   15:putfield        #75  <Field int workBufferSize>
		workBufferPosition = 0;
	//    9   18:aload_0         
	//   10   19:iconst_0        
	//   11   20:putfield        #77  <Field int workBufferPosition>
		bitmapProvider = bitmapprovider;
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:putfield        #79  <Field GifDecoder$BitmapProvider bitmapProvider>
		header = new GifHeader();
	//   15   28:aload_0         
	//   16   29:new             #81  <Class GifHeader>
	//   17   32:dup             
	//   18   33:invokespecial   #82  <Method void GifHeader()>
	//   19   36:putfield        #84  <Field GifHeader header>
	//   20   39:return          
	}

	public StandardGifDecoder(GifDecoder.BitmapProvider bitmapprovider, GifHeader gifheader, ByteBuffer bytebuffer)
	{
		this(bitmapprovider, gifheader, bytebuffer, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_1        
	//    5    5:invokespecial   #88  <Method void StandardGifDecoder(GifDecoder$BitmapProvider, GifHeader, ByteBuffer, int)>
	//    6    8:return          
	}

	public StandardGifDecoder(GifDecoder.BitmapProvider bitmapprovider, GifHeader gifheader, ByteBuffer bytebuffer, int i)
	{
		this(bitmapprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #90  <Method void StandardGifDecoder(GifDecoder$BitmapProvider)>
		setData(gifheader, bytebuffer, i);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:iload           4
	//    7   10:invokevirtual   #94  <Method void setData(GifHeader, ByteBuffer, int)>
	//    8   13:return          
	}

	private int averageColorsNear(int i, int j, int k)
	{
		int i2 = 0;
	//    0    0:iconst_0        
	//    1    1:istore          8
		int k1 = 0;
	//    2    3:iconst_0        
	//    3    4:istore          7
		int j1 = 0;
	//    4    6:iconst_0        
	//    5    7:istore          6
		int i1 = 0;
	//    6    9:iconst_0        
	//    7   10:istore          5
		int l = 0;
	//    8   12:iconst_0        
	//    9   13:istore          4
		for(int k2 = i; k2 < sampleSize + i && k2 < mainPixels.length && k2 < j;)
	//*  10   15:iload_1         
	//*  11   16:istore          9
	//*  12   18:iload           9
	//*  13   20:aload_0         
	//*  14   21:getfield        #98  <Field int sampleSize>
	//*  15   24:iload_1         
	//*  16   25:iadd            
	//*  17   26:icmpge          180
	//*  18   29:iload           9
	//*  19   31:aload_0         
	//*  20   32:getfield        #100 <Field byte[] mainPixels>
	//*  21   35:arraylength     
	//*  22   36:icmpge          180
	//*  23   39:iload           9
	//*  24   41:iload_2         
	//*  25   42:icmpge          180
		{
			int i3 = ((int) (mainPixels[k2]));
	//   26   45:aload_0         
	//   27   46:getfield        #100 <Field byte[] mainPixels>
	//   28   49:iload           9
	//   29   51:baload          
	//   30   52:istore          10
			int k5 = act[i3 & 0xff];
	//   31   54:aload_0         
	//   32   55:getfield        #102 <Field int[] act>
	//   33   58:iload           10
	//   34   60:sipush          255
	//   35   63:iand            
	//   36   64:iaload          
	//   37   65:istore          15
			int i5 = i2;
	//   38   67:iload           8
	//   39   69:istore          14
			int k4 = k1;
	//   40   71:iload           7
	//   41   73:istore          13
			int i4 = j1;
	//   42   75:iload           6
	//   43   77:istore          12
			int k3 = i1;
	//   44   79:iload           5
	//   45   81:istore          11
			i3 = l;
	//   46   83:iload           4
	//   47   85:istore          10
			if(k5 != 0)
	//*  48   87:iload           15
	//*  49   89:ifeq            151
			{
				i5 = i2 + (k5 >> 24 & 0xff);
	//   50   92:iload           8
	//   51   94:iload           15
	//   52   96:bipush          24
	//   53   98:ishr            
	//   54   99:sipush          255
	//   55  102:iand            
	//   56  103:iadd            
	//   57  104:istore          14
				k4 = k1 + (k5 >> 16 & 0xff);
	//   58  106:iload           7
	//   59  108:iload           15
	//   60  110:bipush          16
	//   61  112:ishr            
	//   62  113:sipush          255
	//   63  116:iand            
	//   64  117:iadd            
	//   65  118:istore          13
				i4 = j1 + (k5 >> 8 & 0xff);
	//   66  120:iload           6
	//   67  122:iload           15
	//   68  124:bipush          8
	//   69  126:ishr            
	//   70  127:sipush          255
	//   71  130:iand            
	//   72  131:iadd            
	//   73  132:istore          12
				k3 = i1 + (k5 & 0xff);
	//   74  134:iload           5
	//   75  136:iload           15
	//   76  138:sipush          255
	//   77  141:iand            
	//   78  142:iadd            
	//   79  143:istore          11
				i3 = l + 1;
	//   80  145:iload           4
	//   81  147:iconst_1        
	//   82  148:iadd            
	//   83  149:istore          10
			}
			k2++;
	//   84  151:iload           9
	//   85  153:iconst_1        
	//   86  154:iadd            
	//   87  155:istore          9
			i2 = i5;
	//   88  157:iload           14
	//   89  159:istore          8
			k1 = k4;
	//   90  161:iload           13
	//   91  163:istore          7
			j1 = i4;
	//   92  165:iload           12
	//   93  167:istore          6
			i1 = k3;
	//   94  169:iload           11
	//   95  171:istore          5
			l = i3;
	//   96  173:iload           10
	//   97  175:istore          4
		}

	//*  98  177:goto            18
		int l2 = i + k;
	//   99  180:iload_1         
	//  100  181:iload_3         
	//  101  182:iadd            
	//  102  183:istore          9
		int j3 = k1;
	//  103  185:iload           7
	//  104  187:istore          10
		int j4 = i2;
	//  105  189:iload           8
	//  106  191:istore          12
		while(l2 < i + k + sampleSize && l2 < mainPixels.length && l2 < j) 
	//* 107  193:iload           9
	//* 108  195:iload_1         
	//* 109  196:iload_3         
	//* 110  197:iadd            
	//* 111  198:aload_0         
	//* 112  199:getfield        #98  <Field int sampleSize>
	//* 113  202:iadd            
	//* 114  203:icmpge          357
	//* 115  206:iload           9
	//* 116  208:aload_0         
	//* 117  209:getfield        #100 <Field byte[] mainPixels>
	//* 118  212:arraylength     
	//* 119  213:icmpge          357
	//* 120  216:iload           9
	//* 121  218:iload_2         
	//* 122  219:icmpge          357
		{
			int l1 = ((int) (mainPixels[l2]));
	//  123  222:aload_0         
	//  124  223:getfield        #100 <Field byte[] mainPixels>
	//  125  226:iload           9
	//  126  228:baload          
	//  127  229:istore          7
			int l5 = act[l1 & 0xff];
	//  128  231:aload_0         
	//  129  232:getfield        #102 <Field int[] act>
	//  130  235:iload           7
	//  131  237:sipush          255
	//  132  240:iand            
	//  133  241:iaload          
	//  134  242:istore          15
			int j5 = j4;
	//  135  244:iload           12
	//  136  246:istore          14
			int l4 = j3;
	//  137  248:iload           10
	//  138  250:istore          13
			int l3 = j1;
	//  139  252:iload           6
	//  140  254:istore          11
			int j2 = i1;
	//  141  256:iload           5
	//  142  258:istore          8
			l1 = l;
	//  143  260:iload           4
	//  144  262:istore          7
			if(l5 != 0)
	//* 145  264:iload           15
	//* 146  266:ifeq            328
			{
				j5 = j4 + (l5 >> 24 & 0xff);
	//  147  269:iload           12
	//  148  271:iload           15
	//  149  273:bipush          24
	//  150  275:ishr            
	//  151  276:sipush          255
	//  152  279:iand            
	//  153  280:iadd            
	//  154  281:istore          14
				l4 = j3 + (l5 >> 16 & 0xff);
	//  155  283:iload           10
	//  156  285:iload           15
	//  157  287:bipush          16
	//  158  289:ishr            
	//  159  290:sipush          255
	//  160  293:iand            
	//  161  294:iadd            
	//  162  295:istore          13
				l3 = j1 + (l5 >> 8 & 0xff);
	//  163  297:iload           6
	//  164  299:iload           15
	//  165  301:bipush          8
	//  166  303:ishr            
	//  167  304:sipush          255
	//  168  307:iand            
	//  169  308:iadd            
	//  170  309:istore          11
				j2 = i1 + (l5 & 0xff);
	//  171  311:iload           5
	//  172  313:iload           15
	//  173  315:sipush          255
	//  174  318:iand            
	//  175  319:iadd            
	//  176  320:istore          8
				l1 = l + 1;
	//  177  322:iload           4
	//  178  324:iconst_1        
	//  179  325:iadd            
	//  180  326:istore          7
			}
			l2++;
	//  181  328:iload           9
	//  182  330:iconst_1        
	//  183  331:iadd            
	//  184  332:istore          9
			j4 = j5;
	//  185  334:iload           14
	//  186  336:istore          12
			j3 = l4;
	//  187  338:iload           13
	//  188  340:istore          10
			j1 = l3;
	//  189  342:iload           11
	//  190  344:istore          6
			i1 = j2;
	//  191  346:iload           8
	//  192  348:istore          5
			l = l1;
	//  193  350:iload           7
	//  194  352:istore          4
		}
	//* 195  354:goto            193
		if(l == 0)
	//* 196  357:iload           4
	//* 197  359:ifne            364
			return 0;
	//  198  362:iconst_0        
	//  199  363:ireturn         
		else
			return j4 / l << 24 | j3 / l << 16 | j1 / l << 8 | i1 / l;
	//  200  364:iload           12
	//  201  366:iload           4
	//  202  368:idiv            
	//  203  369:bipush          24
	//  204  371:ishl            
	//  205  372:iload           10
	//  206  374:iload           4
	//  207  376:idiv            
	//  208  377:bipush          16
	//  209  379:ishl            
	//  210  380:ior             
	//  211  381:iload           6
	//  212  383:iload           4
	//  213  385:idiv            
	//  214  386:bipush          8
	//  215  388:ishl            
	//  216  389:ior             
	//  217  390:iload           5
	//  218  392:iload           4
	//  219  394:idiv            
	//  220  395:ior             
	//  221  396:ireturn         
	}

	private void decodeBitmapData(GifFrame gifframe)
	{
		workBufferSize = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #75  <Field int workBufferSize>
		workBufferPosition = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #77  <Field int workBufferPosition>
		if(gifframe != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          26
			rawData.position(gifframe.bufferFrameStart);
	//    8   14:aload_0         
	//    9   15:getfield        #107 <Field ByteBuffer rawData>
	//   10   18:aload_1         
	//   11   19:getfield        #112 <Field int GifFrame.bufferFrameStart>
	//   12   22:invokevirtual   #118 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   13   25:pop             
		int i4;
		if(gifframe == null)
	//*  14   26:aload_1         
	//*  15   27:ifnonnull       50
			i4 = header.width * header.height;
	//   16   30:aload_0         
	//   17   31:getfield        #84  <Field GifHeader header>
	//   18   34:getfield        #121 <Field int GifHeader.width>
	//   19   37:aload_0         
	//   20   38:getfield        #84  <Field GifHeader header>
	//   21   41:getfield        #124 <Field int GifHeader.height>
	//   22   44:imul            
	//   23   45:istore          17
		else
	//*  24   47:goto            61
			i4 = gifframe.iw * gifframe.ih;
	//   25   50:aload_1         
	//   26   51:getfield        #127 <Field int GifFrame.iw>
	//   27   54:aload_1         
	//   28   55:getfield        #130 <Field int GifFrame.ih>
	//   29   58:imul            
	//   30   59:istore          17
		if(mainPixels == null || mainPixels.length < i4)
	//*  31   61:aload_0         
	//*  32   62:getfield        #100 <Field byte[] mainPixels>
	//*  33   65:ifnull          78
	//*  34   68:aload_0         
	//*  35   69:getfield        #100 <Field byte[] mainPixels>
	//*  36   72:arraylength     
	//*  37   73:iload           17
	//*  38   75:icmpge          93
			mainPixels = bitmapProvider.obtainByteArray(i4);
	//   39   78:aload_0         
	//   40   79:aload_0         
	//   41   80:getfield        #79  <Field GifDecoder$BitmapProvider bitmapProvider>
	//   42   83:iload           17
	//   43   85:invokeinterface #136 <Method byte[] GifDecoder$BitmapProvider.obtainByteArray(int)>
	//   44   90:putfield        #100 <Field byte[] mainPixels>
		if(prefix == null)
	//*  45   93:aload_0         
	//*  46   94:getfield        #138 <Field short[] prefix>
	//*  47   97:ifnonnull       109
			prefix = new short[4096];
	//   48  100:aload_0         
	//   49  101:sipush          4096
	//   50  104:newarray        short[]
	//   51  106:putfield        #138 <Field short[] prefix>
		if(suffix == null)
	//*  52  109:aload_0         
	//*  53  110:getfield        #140 <Field byte[] suffix>
	//*  54  113:ifnonnull       125
			suffix = new byte[4096];
	//   55  116:aload_0         
	//   56  117:sipush          4096
	//   57  120:newarray        byte[]
	//   58  122:putfield        #140 <Field byte[] suffix>
		if(pixelStack == null)
	//*  59  125:aload_0         
	//*  60  126:getfield        #142 <Field byte[] pixelStack>
	//*  61  129:ifnonnull       141
			pixelStack = new byte[4097];
	//   62  132:aload_0         
	//   63  133:sipush          4097
	//   64  136:newarray        byte[]
	//   65  138:putfield        #142 <Field byte[] pixelStack>
		int l6 = readByte();
	//   66  141:aload_0         
	//   67  142:invokespecial   #146 <Method int readByte()>
	//   68  145:istore          27
		int i7 = 1 << l6;
	//   69  147:iconst_1        
	//   70  148:iload           27
	//   71  150:ishl            
	//   72  151:istore          28
		int i6 = i7 + 2;
	//   73  153:iload           28
	//   74  155:iconst_2        
	//   75  156:iadd            
	//   76  157:istore          24
		int i5 = -1;
	//   77  159:iconst_m1       
	//   78  160:istore          21
		int k5 = l6 + 1;
	//   79  162:iload           27
	//   80  164:iconst_1        
	//   81  165:iadd            
	//   82  166:istore          22
		int l5 = (1 << k5) - 1;
	//   83  168:iconst_1        
	//   84  169:iload           22
	//   85  171:ishl            
	//   86  172:iconst_1        
	//   87  173:isub            
	//   88  174:istore          23
		for(int i = 0; i < i7; i++)
	//*  89  176:iconst_0        
	//*  90  177:istore_2        
	//*  91  178:iload_2         
	//*  92  179:iload           28
	//*  93  181:icmpge          206
		{
			prefix[i] = 0;
	//   94  184:aload_0         
	//   95  185:getfield        #138 <Field short[] prefix>
	//   96  188:iload_2         
	//   97  189:iconst_0        
	//   98  190:sastore         
			suffix[i] = (byte)i;
	//   99  191:aload_0         
	//  100  192:getfield        #140 <Field byte[] suffix>
	//  101  195:iload_2         
	//  102  196:iload_2         
	//  103  197:int2byte        
	//  104  198:bastore         
		}

	//  105  199:iload_2         
	//  106  200:iconst_1        
	//  107  201:iadd            
	//  108  202:istore_2        
	//* 109  203:goto            178
		int i3 = 0;
	//  110  206:iconst_0        
	//  111  207:istore          13
		int k = 0;
	//  112  209:iconst_0        
	//  113  210:istore_3        
		int l = 0;
	//  114  211:iconst_0        
	//  115  212:istore          4
		int k4 = 0;
	//  116  214:iconst_0        
	//  117  215:istore          19
		int l3 = 0;
	//  118  217:iconst_0        
	//  119  218:istore          16
		int k3 = 0;
	//  120  220:iconst_0        
	//  121  221:istore          15
		int l2 = 0;
	//  122  223:iconst_0        
	//  123  224:istore          12
		int l4 = 0;
	//  124  226:iconst_0        
	//  125  227:istore          20
label0:
		do
		{
label1:
			{
				if(l4 >= i4)
					break label1;
	//  126  229:iload           20
	//  127  231:iload           17
	//  128  233:icmpge          894
				int j = l3;
	//  129  236:iload           16
	//  130  238:istore_2        
				if(l3 == 0)
	//* 131  239:iload           16
	//* 132  241:ifne            264
				{
					j = readBlock();
	//  133  244:aload_0         
	//  134  245:invokespecial   #149 <Method int readBlock()>
	//  135  248:istore_2        
					if(j <= 0)
	//* 136  249:iload_2         
	//* 137  250:ifgt            261
					{
						status = 3;
	//  138  253:aload_0         
	//  139  254:iconst_3        
	//  140  255:putfield        #151 <Field int status>
						break label1;
	//  141  258:goto            894
					}
					i3 = 0;
	//  142  261:iconst_0        
	//  143  262:istore          13
				}
				int i1 = l2 + ((block[i3] & 0xff) << k3);
	//  144  264:iload           12
	//  145  266:aload_0         
	//  146  267:getfield        #153 <Field byte[] block>
	//  147  270:iload           13
	//  148  272:baload          
	//  149  273:sipush          255
	//  150  276:iand            
	//  151  277:iload           15
	//  152  279:ishl            
	//  153  280:iadd            
	//  154  281:istore          5
				int k2 = k3 + 8;
	//  155  283:iload           15
	//  156  285:bipush          8
	//  157  287:iadd            
	//  158  288:istore          11
				int j6 = i3 + 1;
	//  159  290:iload           13
	//  160  292:iconst_1        
	//  161  293:iadd            
	//  162  294:istore          25
				int k6 = j - 1;
	//  163  296:iload_2         
	//  164  297:iconst_1        
	//  165  298:isub            
	//  166  299:istore          26
				int j1 = k;
	//  167  301:iload_3         
	//  168  302:istore          6
				k = l;
	//  169  304:iload           4
	//  170  306:istore_3        
				int j2 = k4;
	//  171  307:iload           19
	//  172  309:istore          10
				int j4 = l4;
	//  173  311:iload           20
	//  174  313:istore          18
				j = i5;
	//  175  315:iload           21
	//  176  317:istore_2        
				int i2 = k5;
	//  177  318:iload           22
	//  178  320:istore          9
				int k1 = l5;
	//  179  322:iload           23
	//  180  324:istore          7
				int l1 = i6;
	//  181  326:iload           24
	//  182  328:istore          8
				do
				{
					int j3;
					do
					{
						j3 = k;
	//  183  330:iload_3         
	//  184  331:istore          14
						i6 = l1;
	//  185  333:iload           8
	//  186  335:istore          24
						l5 = k1;
	//  187  337:iload           7
	//  188  339:istore          23
						k5 = i2;
	//  189  341:iload           9
	//  190  343:istore          22
						i5 = j;
	//  191  345:iload_2         
	//  192  346:istore          21
						k3 = k2;
	//  193  348:iload           11
	//  194  350:istore          15
						l3 = k6;
	//  195  352:iload           26
	//  196  354:istore          16
						l4 = j4;
	//  197  356:iload           18
	//  198  358:istore          20
						l2 = i1;
	//  199  360:iload           5
	//  200  362:istore          12
						k4 = j2;
	//  201  364:iload           10
	//  202  366:istore          19
						l = j3;
	//  203  368:iload           14
	//  204  370:istore          4
						i3 = j6;
	//  205  372:iload           25
	//  206  374:istore          13
						k = j1;
	//  207  376:iload           6
	//  208  378:istore_3        
						if(k2 < i2)
							continue label0;
	//  209  379:iload           11
	//  210  381:iload           9
	//  211  383:icmplt          229
						k = i1 & k1;
	//  212  386:iload           5
	//  213  388:iload           7
	//  214  390:iand            
	//  215  391:istore_3        
						l2 = i1 >> i2;
	//  216  392:iload           5
	//  217  394:iload           9
	//  218  396:ishr            
	//  219  397:istore          12
						k3 = k2 - i2;
	//  220  399:iload           11
	//  221  401:iload           9
	//  222  403:isub            
	//  223  404:istore          15
						if(k == i7)
	//* 224  406:iload_3         
	//* 225  407:iload           28
	//* 226  409:icmpne          448
						{
							i2 = l6 + 1;
	//  227  412:iload           27
	//  228  414:iconst_1        
	//  229  415:iadd            
	//  230  416:istore          9
							k1 = (1 << i2) - 1;
	//  231  418:iconst_1        
	//  232  419:iload           9
	//  233  421:ishl            
	//  234  422:iconst_1        
	//  235  423:isub            
	//  236  424:istore          7
							l1 = i7 + 2;
	//  237  426:iload           28
	//  238  428:iconst_2        
	//  239  429:iadd            
	//  240  430:istore          8
							j = -1;
	//  241  432:iconst_m1       
	//  242  433:istore_2        
							k2 = k3;
	//  243  434:iload           15
	//  244  436:istore          11
							i1 = l2;
	//  245  438:iload           12
	//  246  440:istore          5
							k = j3;
	//  247  442:iload           14
	//  248  444:istore_3        
							continue;
	//  249  445:goto            330
						}
						if(k > l1)
	//* 250  448:iload_3         
	//* 251  449:iload           8
	//* 252  451:icmple          500
						{
							status = 3;
	//  253  454:aload_0         
	//  254  455:iconst_3        
	//  255  456:putfield        #151 <Field int status>
							i6 = l1;
	//  256  459:iload           8
	//  257  461:istore          24
							l5 = k1;
	//  258  463:iload           7
	//  259  465:istore          23
							k5 = i2;
	//  260  467:iload           9
	//  261  469:istore          22
							i5 = j;
	//  262  471:iload_2         
	//  263  472:istore          21
							l3 = k6;
	//  264  474:iload           26
	//  265  476:istore          16
							l4 = j4;
	//  266  478:iload           18
	//  267  480:istore          20
							k4 = j2;
	//  268  482:iload           10
	//  269  484:istore          19
							l = j3;
	//  270  486:iload           14
	//  271  488:istore          4
							i3 = j6;
	//  272  490:iload           25
	//  273  492:istore          13
							k = j1;
	//  274  494:iload           6
	//  275  496:istore_3        
							continue label0;
	//  276  497:goto            229
						}
						if(k == i7 + 1)
	//* 277  500:iload_3         
	//* 278  501:iload           28
	//* 279  503:iconst_1        
	//* 280  504:iadd            
	//* 281  505:icmpne          549
						{
							i6 = l1;
	//  282  508:iload           8
	//  283  510:istore          24
							l5 = k1;
	//  284  512:iload           7
	//  285  514:istore          23
							k5 = i2;
	//  286  516:iload           9
	//  287  518:istore          22
							i5 = j;
	//  288  520:iload_2         
	//  289  521:istore          21
							l3 = k6;
	//  290  523:iload           26
	//  291  525:istore          16
							l4 = j4;
	//  292  527:iload           18
	//  293  529:istore          20
							k4 = j2;
	//  294  531:iload           10
	//  295  533:istore          19
							l = j3;
	//  296  535:iload           14
	//  297  537:istore          4
							i3 = j6;
	//  298  539:iload           25
	//  299  541:istore          13
							k = j1;
	//  300  543:iload           6
	//  301  545:istore_3        
							continue label0;
	//  302  546:goto            229
						}
						if(j != -1)
							break;
	//  303  549:iload_2         
	//  304  550:iconst_m1       
	//  305  551:icmpne          594
						gifframe = ((GifFrame) (pixelStack));
	//  306  554:aload_0         
	//  307  555:getfield        #142 <Field byte[] pixelStack>
	//  308  558:astore_1        
						l = j3 + 1;
	//  309  559:iload           14
	//  310  561:iconst_1        
	//  311  562:iadd            
	//  312  563:istore          4
						gifframe[j3] = suffix[k];
	//  313  565:aload_1         
	//  314  566:iload           14
	//  315  568:aload_0         
	//  316  569:getfield        #140 <Field byte[] suffix>
	//  317  572:iload_3         
	//  318  573:baload          
	//  319  574:bastore         
						j = k;
	//  320  575:iload_3         
	//  321  576:istore_2        
						k2 = k3;
	//  322  577:iload           15
	//  323  579:istore          11
						i1 = l2;
	//  324  581:iload           12
	//  325  583:istore          5
						j2 = k;
	//  326  585:iload_3         
	//  327  586:istore          10
						k = l;
	//  328  588:iload           4
	//  329  590:istore_3        
					} while(true);
	//  330  591:goto            330
					l = k;
	//  331  594:iload_3         
	//  332  595:istore          4
					i1 = j3;
	//  333  597:iload           14
	//  334  599:istore          5
					if(k >= l1)
	//* 335  601:iload_3         
	//* 336  602:iload           8
	//* 337  604:icmplt          628
					{
						gifframe = ((GifFrame) (pixelStack));
	//  338  607:aload_0         
	//  339  608:getfield        #142 <Field byte[] pixelStack>
	//  340  611:astore_1        
						i1 = j3 + 1;
	//  341  612:iload           14
	//  342  614:iconst_1        
	//  343  615:iadd            
	//  344  616:istore          5
						gifframe[j3] = (byte)j2;
	//  345  618:aload_1         
	//  346  619:iload           14
	//  347  621:iload           10
	//  348  623:int2byte        
	//  349  624:bastore         
						l = j;
	//  350  625:iload_2         
	//  351  626:istore          4
					}
					while(l >= i7) 
	//* 352  628:iload           4
	//* 353  630:iload           28
	//* 354  632:icmplt          673
					{
						gifframe = ((GifFrame) (pixelStack));
	//  355  635:aload_0         
	//  356  636:getfield        #142 <Field byte[] pixelStack>
	//  357  639:astore_1        
						j2 = i1 + 1;
	//  358  640:iload           5
	//  359  642:iconst_1        
	//  360  643:iadd            
	//  361  644:istore          10
						gifframe[i1] = suffix[l];
	//  362  646:aload_1         
	//  363  647:iload           5
	//  364  649:aload_0         
	//  365  650:getfield        #140 <Field byte[] suffix>
	//  366  653:iload           4
	//  367  655:baload          
	//  368  656:bastore         
						l = ((int) (prefix[l]));
	//  369  657:aload_0         
	//  370  658:getfield        #138 <Field short[] prefix>
	//  371  661:iload           4
	//  372  663:saload          
	//  373  664:istore          4
						i1 = j2;
	//  374  666:iload           10
	//  375  668:istore          5
					}
	//* 376  670:goto            628
					k5 = suffix[l] & 0xff;
	//  377  673:aload_0         
	//  378  674:getfield        #140 <Field byte[] suffix>
	//  379  677:iload           4
	//  380  679:baload          
	//  381  680:sipush          255
	//  382  683:iand            
	//  383  684:istore          22
					gifframe = ((GifFrame) (pixelStack));
	//  384  686:aload_0         
	//  385  687:getfield        #142 <Field byte[] pixelStack>
	//  386  690:astore_1        
					l = i1 + 1;
	//  387  691:iload           5
	//  388  693:iconst_1        
	//  389  694:iadd            
	//  390  695:istore          4
					gifframe[i1] = (byte)k5;
	//  391  697:aload_1         
	//  392  698:iload           5
	//  393  700:iload           22
	//  394  702:int2byte        
	//  395  703:bastore         
					j3 = l1;
	//  396  704:iload           8
	//  397  706:istore          14
					l3 = k1;
	//  398  708:iload           7
	//  399  710:istore          16
					i3 = i2;
	//  400  712:iload           9
	//  401  714:istore          13
					if(l1 < 4096)
	//* 402  716:iload           8
	//* 403  718:sipush          4096
	//* 404  721:icmpge          799
					{
						prefix[l1] = (short)j;
	//  405  724:aload_0         
	//  406  725:getfield        #138 <Field short[] prefix>
	//  407  728:iload           8
	//  408  730:iload_2         
	//  409  731:int2short       
	//  410  732:sastore         
						suffix[l1] = (byte)k5;
	//  411  733:aload_0         
	//  412  734:getfield        #140 <Field byte[] suffix>
	//  413  737:iload           8
	//  414  739:iload           22
	//  415  741:int2byte        
	//  416  742:bastore         
						j = l1 + 1;
	//  417  743:iload           8
	//  418  745:iconst_1        
	//  419  746:iadd            
	//  420  747:istore_2        
						j3 = j;
	//  421  748:iload_2         
	//  422  749:istore          14
						l3 = k1;
	//  423  751:iload           7
	//  424  753:istore          16
						i3 = i2;
	//  425  755:iload           9
	//  426  757:istore          13
						if((j & k1) == 0)
	//* 427  759:iload_2         
	//* 428  760:iload           7
	//* 429  762:iand            
	//* 430  763:ifne            799
						{
							j3 = j;
	//  431  766:iload_2         
	//  432  767:istore          14
							l3 = k1;
	//  433  769:iload           7
	//  434  771:istore          16
							i3 = i2;
	//  435  773:iload           9
	//  436  775:istore          13
							if(j < 4096)
	//* 437  777:iload_2         
	//* 438  778:sipush          4096
	//* 439  781:icmpge          799
							{
								i3 = i2 + 1;
	//  440  784:iload           9
	//  441  786:iconst_1        
	//  442  787:iadd            
	//  443  788:istore          13
								l3 = k1 + j;
	//  444  790:iload           7
	//  445  792:iload_2         
	//  446  793:iadd            
	//  447  794:istore          16
								j3 = j;
	//  448  796:iload_2         
	//  449  797:istore          14
							}
						}
					}
					k4 = k;
	//  450  799:iload_3         
	//  451  800:istore          19
					l4 = j4;
	//  452  802:iload           18
	//  453  804:istore          20
					do
					{
						int j5 = j1;
	//  454  806:iload           6
	//  455  808:istore          21
						l1 = j3;
	//  456  810:iload           14
	//  457  812:istore          8
						k1 = l3;
	//  458  814:iload           16
	//  459  816:istore          7
						i2 = i3;
	//  460  818:iload           13
	//  461  820:istore          9
						j = k4;
	//  462  822:iload           19
	//  463  824:istore_2        
						k2 = k3;
	//  464  825:iload           15
	//  465  827:istore          11
						j4 = l4;
	//  466  829:iload           20
	//  467  831:istore          18
						i1 = l2;
	//  468  833:iload           12
	//  469  835:istore          5
						j2 = k5;
	//  470  837:iload           22
	//  471  839:istore          10
						k = l;
	//  472  841:iload           4
	//  473  843:istore_3        
						j1 = j5;
	//  474  844:iload           21
	//  475  846:istore          6
						if(l <= 0)
							break;
	//  476  848:iload           4
	//  477  850:ifle            330
						gifframe = ((GifFrame) (mainPixels));
	//  478  853:aload_0         
	//  479  854:getfield        #100 <Field byte[] mainPixels>
	//  480  857:astore_1        
						j1 = j5 + 1;
	//  481  858:iload           21
	//  482  860:iconst_1        
	//  483  861:iadd            
	//  484  862:istore          6
						byte abyte0[] = pixelStack;
	//  485  864:aload_0         
	//  486  865:getfield        #142 <Field byte[] pixelStack>
	//  487  868:astore          29
						l--;
	//  488  870:iload           4
	//  489  872:iconst_1        
	//  490  873:isub            
	//  491  874:istore          4
						gifframe[j5] = abyte0[l];
	//  492  876:aload_1         
	//  493  877:iload           21
	//  494  879:aload           29
	//  495  881:iload           4
	//  496  883:baload          
	//  497  884:bastore         
						l4++;
	//  498  885:iload           20
	//  499  887:iconst_1        
	//  500  888:iadd            
	//  501  889:istore          20
					} while(true);
	//  502  891:goto            806
				} while(true);
			}
			for(; k < i4; k++)
	//* 503  894:iload_3         
	//* 504  895:iload           17
	//* 505  897:icmpge          914
				mainPixels[k] = 0;
	//  506  900:aload_0         
	//  507  901:getfield        #100 <Field byte[] mainPixels>
	//  508  904:iload_3         
	//  509  905:iconst_0        
	//  510  906:bastore         

	//  511  907:iload_3         
	//  512  908:iconst_1        
	//  513  909:iadd            
	//  514  910:istore_3        
	//* 515  911:goto            894
			return;
	//  516  914:return          
		} while(true);
	}

	private GifHeaderParser getHeaderParser()
	{
		if(parser == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #157 <Field GifHeaderParser parser>
	//*   2    4:ifnonnull       18
			parser = new GifHeaderParser();
	//    3    7:aload_0         
	//    4    8:new             #159 <Class GifHeaderParser>
	//    5   11:dup             
	//    6   12:invokespecial   #160 <Method void GifHeaderParser()>
	//    7   15:putfield        #157 <Field GifHeaderParser parser>
		return parser;
	//    8   18:aload_0         
	//    9   19:getfield        #157 <Field GifHeaderParser parser>
	//   10   22:areturn         
	}

	private Bitmap getNextBitmap()
	{
		Object obj;
		if(isFirstFrameTransparent)
	//*   0    0:aload_0         
	//*   1    1:getfield        #164 <Field boolean isFirstFrameTransparent>
	//*   2    4:ifeq            14
			obj = ((Object) (android.graphics.Bitmap.Config.ARGB_8888));
	//    3    7:getstatic       #170 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//    4   10:astore_1        
		else
	//*   5   11:goto            18
			obj = ((Object) (android.graphics.Bitmap.Config.RGB_565));
	//    6   14:getstatic       #173 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
	//    7   17:astore_1        
		obj = ((Object) (bitmapProvider.obtain(downsampledWidth, downsampledHeight, ((android.graphics.Bitmap.Config) (obj)))));
	//    8   18:aload_0         
	//    9   19:getfield        #79  <Field GifDecoder$BitmapProvider bitmapProvider>
	//   10   22:aload_0         
	//   11   23:getfield        #175 <Field int downsampledWidth>
	//   12   26:aload_0         
	//   13   27:getfield        #177 <Field int downsampledHeight>
	//   14   30:aload_1         
	//   15   31:invokeinterface #181 <Method Bitmap GifDecoder$BitmapProvider.obtain(int, int, android.graphics.Bitmap$Config)>
	//   16   36:astore_1        
		((Bitmap) (obj)).setHasAlpha(true);
	//   17   37:aload_1         
	//   18   38:iconst_1        
	//   19   39:invokevirtual   #187 <Method void Bitmap.setHasAlpha(boolean)>
		return ((Bitmap) (obj));
	//   20   42:aload_1         
	//   21   43:areturn         
	}

	private int readBlock()
	{
		int i;
		i = readByte();
	//    0    0:aload_0         
	//    1    1:invokespecial   #146 <Method int readByte()>
	//    2    4:istore_1        
		if(i <= 0)
			break MISSING_BLOCK_LABEL_175;
	//    3    5:iload_1         
	//    4    6:ifle            175
		int j;
		if(block == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #153 <Field byte[] block>
	//*   7   13:ifnonnull       32
			block = bitmapProvider.obtainByteArray(255);
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #79  <Field GifDecoder$BitmapProvider bitmapProvider>
	//   11   21:sipush          255
	//   12   24:invokeinterface #136 <Method byte[] GifDecoder$BitmapProvider.obtainByteArray(int)>
	//   13   29:putfield        #153 <Field byte[] block>
		j = workBufferSize - workBufferPosition;
	//   14   32:aload_0         
	//   15   33:getfield        #75  <Field int workBufferSize>
	//   16   36:aload_0         
	//   17   37:getfield        #77  <Field int workBufferPosition>
	//   18   40:isub            
	//   19   41:istore_2        
		if(j >= i)
	//*  20   42:iload_2         
	//*  21   43:iload_1         
	//*  22   44:icmplt          77
		{
			int k;
			try
			{
				System.arraycopy(((Object) (workBuffer)), workBufferPosition, ((Object) (block)), 0, i);
	//   23   47:aload_0         
	//   24   48:getfield        #191 <Field byte[] workBuffer>
	//   25   51:aload_0         
	//   26   52:getfield        #77  <Field int workBufferPosition>
	//   27   55:aload_0         
	//   28   56:getfield        #153 <Field byte[] block>
	//   29   59:iconst_0        
	//   30   60:iload_1         
	//   31   61:invokestatic    #197 <Method void System.arraycopy(Object, int, Object, int, int)>
				workBufferPosition = workBufferPosition + i;
	//   32   64:aload_0         
	//   33   65:aload_0         
	//   34   66:getfield        #77  <Field int workBufferPosition>
	//   35   69:iload_1         
	//   36   70:iadd            
	//   37   71:putfield        #77  <Field int workBufferPosition>
				break MISSING_BLOCK_LABEL_155;
	//   38   74:goto            155
			}
	//*  39   77:aload_0         
	//*  40   78:getfield        #107 <Field ByteBuffer rawData>
	//*  41   81:invokevirtual   #200 <Method int ByteBuffer.remaining()>
	//*  42   84:iload_2         
	//*  43   85:iadd            
	//*  44   86:iload_1         
	//*  45   87:icmplt          150
	//*  46   90:aload_0         
	//*  47   91:getfield        #191 <Field byte[] workBuffer>
	//*  48   94:aload_0         
	//*  49   95:getfield        #77  <Field int workBufferPosition>
	//*  50   98:aload_0         
	//*  51   99:getfield        #153 <Field byte[] block>
	//*  52  102:iconst_0        
	//*  53  103:iload_2         
	//*  54  104:invokestatic    #197 <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  55  107:aload_0         
	//*  56  108:aload_0         
	//*  57  109:getfield        #75  <Field int workBufferSize>
	//*  58  112:putfield        #77  <Field int workBufferPosition>
	//*  59  115:aload_0         
	//*  60  116:invokespecial   #203 <Method void readChunkIfNeeded()>
	//*  61  119:iload_1         
	//*  62  120:iload_2         
	//*  63  121:isub            
	//*  64  122:istore_3        
	//*  65  123:aload_0         
	//*  66  124:getfield        #191 <Field byte[] workBuffer>
	//*  67  127:iconst_0        
	//*  68  128:aload_0         
	//*  69  129:getfield        #153 <Field byte[] block>
	//*  70  132:iload_2         
	//*  71  133:iload_3         
	//*  72  134:invokestatic    #197 <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  73  137:aload_0         
	//*  74  138:aload_0         
	//*  75  139:getfield        #77  <Field int workBufferPosition>
	//*  76  142:iload_3         
	//*  77  143:iadd            
	//*  78  144:putfield        #77  <Field int workBufferPosition>
	//*  79  147:goto            155
	//*  80  150:aload_0         
	//*  81  151:iconst_1        
	//*  82  152:putfield        #151 <Field int status>
	//*  83  155:iload_1         
	//*  84  156:ireturn         
			catch(Exception exception)
	//*  85  157:astore          4
			{
				Log.w(TAG, "Error Reading Block", ((Throwable) (exception)));
	//   86  159:getstatic       #66  <Field String TAG>
	//   87  162:ldc1            #205 <String "Error Reading Block">
	//   88  164:aload           4
	//   89  166:invokestatic    #211 <Method int Log.w(String, String, Throwable)>
	//   90  169:pop             
				status = 1;
	//   91  170:aload_0         
	//   92  171:iconst_1        
	//   93  172:putfield        #151 <Field int status>
			}
			break MISSING_BLOCK_LABEL_175;
		}
		if(rawData.remaining() + j < i)
			break MISSING_BLOCK_LABEL_150;
		System.arraycopy(((Object) (workBuffer)), workBufferPosition, ((Object) (block)), 0, j);
		workBufferPosition = workBufferSize;
		readChunkIfNeeded();
		k = i - j;
		System.arraycopy(((Object) (workBuffer)), 0, ((Object) (block)), j, k);
		workBufferPosition = workBufferPosition + k;
		break MISSING_BLOCK_LABEL_155;
		status = 1;
		return i;
		return i;
	//   94  175:iload_1         
	//   95  176:ireturn         
	}

	private int readByte()
	{
		int i;
		byte abyte0[];
		try
		{
			readChunkIfNeeded();
	//    0    0:aload_0         
	//    1    1:invokespecial   #203 <Method void readChunkIfNeeded()>
			abyte0 = workBuffer;
	//    2    4:aload_0         
	//    3    5:getfield        #191 <Field byte[] workBuffer>
	//    4    8:astore_2        
			i = workBufferPosition;
	//    5    9:aload_0         
	//    6   10:getfield        #77  <Field int workBufferPosition>
	//    7   13:istore_1        
			workBufferPosition = i + 1;
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:iconst_1        
	//   11   17:iadd            
	//   12   18:putfield        #77  <Field int workBufferPosition>
		}
	//*  13   21:aload_2         
	//*  14   22:iload_1         
	//*  15   23:baload          
	//*  16   24:istore_1        
	//*  17   25:iload_1         
	//*  18   26:sipush          255
	//*  19   29:iand            
	//*  20   30:ireturn         
		catch(Exception exception)
	//*  21   31:astore_2        
		{
			status = 1;
	//   22   32:aload_0         
	//   23   33:iconst_1        
	//   24   34:putfield        #151 <Field int status>
			return 0;
	//   25   37:iconst_0        
	//   26   38:ireturn         
		}
		i = ((int) (abyte0[i]));
		return i & 0xff;
	}

	private void readChunkIfNeeded()
	{
		if(workBufferSize > workBufferPosition)
	//*   0    0:aload_0         
	//*   1    1:getfield        #75  <Field int workBufferSize>
	//*   2    4:aload_0         
	//*   3    5:getfield        #77  <Field int workBufferPosition>
	//*   4    8:icmple          12
			return;
	//    5   11:return          
		if(workBuffer == null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #191 <Field byte[] workBuffer>
	//*   8   16:ifnonnull       35
			workBuffer = bitmapProvider.obtainByteArray(16384);
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #79  <Field GifDecoder$BitmapProvider bitmapProvider>
	//   12   24:sipush          16384
	//   13   27:invokeinterface #136 <Method byte[] GifDecoder$BitmapProvider.obtainByteArray(int)>
	//   14   32:putfield        #191 <Field byte[] workBuffer>
		workBufferPosition = 0;
	//   15   35:aload_0         
	//   16   36:iconst_0        
	//   17   37:putfield        #77  <Field int workBufferPosition>
		workBufferSize = Math.min(rawData.remaining(), 16384);
	//   18   40:aload_0         
	//   19   41:aload_0         
	//   20   42:getfield        #107 <Field ByteBuffer rawData>
	//   21   45:invokevirtual   #200 <Method int ByteBuffer.remaining()>
	//   22   48:sipush          16384
	//   23   51:invokestatic    #217 <Method int Math.min(int, int)>
	//   24   54:putfield        #75  <Field int workBufferSize>
		rawData.get(workBuffer, 0, workBufferSize);
	//   25   57:aload_0         
	//   26   58:getfield        #107 <Field ByteBuffer rawData>
	//   27   61:aload_0         
	//   28   62:getfield        #191 <Field byte[] workBuffer>
	//   29   65:iconst_0        
	//   30   66:aload_0         
	//   31   67:getfield        #75  <Field int workBufferSize>
	//   32   70:invokevirtual   #221 <Method ByteBuffer ByteBuffer.get(byte[], int, int)>
	//   33   73:pop             
	//   34   74:return          
	}

	private Bitmap setPixels(GifFrame gifframe, GifFrame gifframe1)
	{
		int ai[] = mainScratch;
	//    0    0:aload_0         
	//    1    1:getfield        #225 <Field int[] mainScratch>
	//    2    4:astore          19
		if(gifframe1 == null)
	//*   3    6:aload_2         
	//*   4    7:ifnonnull       16
			Arrays.fill(ai, 0);
	//    5   10:aload           19
	//    6   12:iconst_0        
	//    7   13:invokestatic    #231 <Method void Arrays.fill(int[], int)>
		if(gifframe1 != null && gifframe1.dispose > 0)
	//*   8   16:aload_2         
	//*   9   17:ifnull          266
	//*  10   20:aload_2         
	//*  11   21:getfield        #234 <Field int GifFrame.dispose>
	//*  12   24:ifle            266
			if(gifframe1.dispose == 2)
	//*  13   27:aload_2         
	//*  14   28:getfield        #234 <Field int GifFrame.dispose>
	//*  15   31:iconst_2        
	//*  16   32:icmpne          227
			{
				int k = 0;
	//   17   35:iconst_0        
	//   18   36:istore          4
				int i;
				if(!gifframe.transparency)
	//*  19   38:aload_1         
	//*  20   39:getfield        #237 <Field boolean GifFrame.transparency>
	//*  21   42:ifne            86
				{
					k = header.bgColor;
	//   22   45:aload_0         
	//   23   46:getfield        #84  <Field GifHeader header>
	//   24   49:getfield        #240 <Field int GifHeader.bgColor>
	//   25   52:istore          4
					i = k;
	//   26   54:iload           4
	//   27   56:istore_3        
					if(gifframe.lct != null)
	//*  28   57:aload_1         
	//*  29   58:getfield        #243 <Field int[] GifFrame.lct>
	//*  30   61:ifnull          104
					{
						i = k;
	//   31   64:iload           4
	//   32   66:istore_3        
						if(header.bgIndex == gifframe.transIndex)
	//*  33   67:aload_0         
	//*  34   68:getfield        #84  <Field GifHeader header>
	//*  35   71:getfield        #246 <Field int GifHeader.bgIndex>
	//*  36   74:aload_1         
	//*  37   75:getfield        #249 <Field int GifFrame.transIndex>
	//*  38   78:icmpne          104
							i = 0;
	//   39   81:iconst_0        
	//   40   82:istore_3        
					}
				} else
	//*  41   83:goto            104
				{
					i = k;
	//   42   86:iload           4
	//   43   88:istore_3        
					if(framePointer == 0)
	//*  44   89:aload_0         
	//*  45   90:getfield        #251 <Field int framePointer>
	//*  46   93:ifne            104
					{
						isFirstFrameTransparent = true;
	//   47   96:aload_0         
	//   48   97:iconst_1        
	//   49   98:putfield        #164 <Field boolean isFirstFrameTransparent>
						i = k;
	//   50  101:iload           4
	//   51  103:istore_3        
					}
				}
				int k2 = gifframe1.ih / sampleSize;
	//   52  104:aload_2         
	//   53  105:getfield        #130 <Field int GifFrame.ih>
	//   54  108:aload_0         
	//   55  109:getfield        #98  <Field int sampleSize>
	//   56  112:idiv            
	//   57  113:istore          7
				k = gifframe1.iy / sampleSize;
	//   58  115:aload_2         
	//   59  116:getfield        #254 <Field int GifFrame.iy>
	//   60  119:aload_0         
	//   61  120:getfield        #98  <Field int sampleSize>
	//   62  123:idiv            
	//   63  124:istore          4
				int i3 = gifframe1.iw / sampleSize;
	//   64  126:aload_2         
	//   65  127:getfield        #127 <Field int GifFrame.iw>
	//   66  130:aload_0         
	//   67  131:getfield        #98  <Field int sampleSize>
	//   68  134:idiv            
	//   69  135:istore          8
				int j1 = gifframe1.ix / sampleSize;
	//   70  137:aload_2         
	//   71  138:getfield        #257 <Field int GifFrame.ix>
	//   72  141:aload_0         
	//   73  142:getfield        #98  <Field int sampleSize>
	//   74  145:idiv            
	//   75  146:istore          5
				int i2 = downsampledWidth * k + j1;
	//   76  148:aload_0         
	//   77  149:getfield        #175 <Field int downsampledWidth>
	//   78  152:iload           4
	//   79  154:imul            
	//   80  155:iload           5
	//   81  157:iadd            
	//   82  158:istore          6
				int k3 = downsampledWidth;
	//   83  160:aload_0         
	//   84  161:getfield        #175 <Field int downsampledWidth>
	//   85  164:istore          9
				for(int l = i2; l < i2 + k3 * k2; l += downsampledWidth)
	//*  86  166:iload           6
	//*  87  168:istore          4
	//*  88  170:iload           4
	//*  89  172:iload           6
	//*  90  174:iload           9
	//*  91  176:iload           7
	//*  92  178:imul            
	//*  93  179:iadd            
	//*  94  180:icmpge          224
				{
					for(int k1 = l; k1 < l + i3; k1++)
	//*  95  183:iload           4
	//*  96  185:istore          5
	//*  97  187:iload           5
	//*  98  189:iload           4
	//*  99  191:iload           8
	//* 100  193:iadd            
	//* 101  194:icmpge          212
						ai[k1] = i;
	//  102  197:aload           19
	//  103  199:iload           5
	//  104  201:iload_3         
	//  105  202:iastore         

	//  106  203:iload           5
	//  107  205:iconst_1        
	//  108  206:iadd            
	//  109  207:istore          5
				}

	//  110  209:goto            187
	//  111  212:iload           4
	//  112  214:aload_0         
	//  113  215:getfield        #175 <Field int downsampledWidth>
	//  114  218:iadd            
	//  115  219:istore          4
			} else
	//* 116  221:goto            170
	//* 117  224:goto            266
			if(gifframe1.dispose == 3 && previousImage != null)
	//* 118  227:aload_2         
	//* 119  228:getfield        #234 <Field int GifFrame.dispose>
	//* 120  231:iconst_3        
	//* 121  232:icmpne          266
	//* 122  235:aload_0         
	//* 123  236:getfield        #259 <Field Bitmap previousImage>
	//* 124  239:ifnull          266
				previousImage.getPixels(ai, 0, downsampledWidth, 0, 0, downsampledWidth, downsampledHeight);
	//  125  242:aload_0         
	//  126  243:getfield        #259 <Field Bitmap previousImage>
	//  127  246:aload           19
	//  128  248:iconst_0        
	//  129  249:aload_0         
	//  130  250:getfield        #175 <Field int downsampledWidth>
	//  131  253:iconst_0        
	//  132  254:iconst_0        
	//  133  255:aload_0         
	//  134  256:getfield        #175 <Field int downsampledWidth>
	//  135  259:aload_0         
	//  136  260:getfield        #177 <Field int downsampledHeight>
	//  137  263:invokevirtual   #263 <Method void Bitmap.getPixels(int[], int, int, int, int, int, int)>
		decodeBitmapData(gifframe);
	//  138  266:aload_0         
	//  139  267:aload_1         
	//  140  268:invokespecial   #265 <Method void decodeBitmapData(GifFrame)>
		int k4 = gifframe.ih / sampleSize;
	//  141  271:aload_1         
	//  142  272:getfield        #130 <Field int GifFrame.ih>
	//  143  275:aload_0         
	//  144  276:getfield        #98  <Field int sampleSize>
	//  145  279:idiv            
	//  146  280:istore          14
		int l4 = gifframe.iy / sampleSize;
	//  147  282:aload_1         
	//  148  283:getfield        #254 <Field int GifFrame.iy>
	//  149  286:aload_0         
	//  150  287:getfield        #98  <Field int sampleSize>
	//  151  290:idiv            
	//  152  291:istore          15
		int i5 = gifframe.iw / sampleSize;
	//  153  293:aload_1         
	//  154  294:getfield        #127 <Field int GifFrame.iw>
	//  155  297:aload_0         
	//  156  298:getfield        #98  <Field int sampleSize>
	//  157  301:idiv            
	//  158  302:istore          16
		int j5 = gifframe.ix / sampleSize;
	//  159  304:aload_1         
	//  160  305:getfield        #257 <Field int GifFrame.ix>
	//  161  308:aload_0         
	//  162  309:getfield        #98  <Field int sampleSize>
	//  163  312:idiv            
	//  164  313:istore          17
		int l3 = 1;
	//  165  315:iconst_1        
	//  166  316:istore          9
		int j2 = 8;
	//  167  318:bipush          8
	//  168  320:istore          6
		int l2 = 0;
	//  169  322:iconst_0        
	//  170  323:istore          7
		boolean flag;
		if(framePointer == 0)
	//* 171  325:aload_0         
	//* 172  326:getfield        #251 <Field int framePointer>
	//* 173  329:ifne            338
			flag = true;
	//  174  332:iconst_1        
	//  175  333:istore          10
		else
	//* 176  335:goto            341
			flag = false;
	//  177  338:iconst_0        
	//  178  339:istore          10
		for(int l1 = 0; l1 < k4;)
	//* 179  341:iconst_0        
	//* 180  342:istore          5
	//* 181  344:iload           5
	//* 182  346:iload           14
	//* 183  348:icmpge          694
		{
			int j = l1;
	//  184  351:iload           5
	//  185  353:istore_3        
			int j3 = l3;
	//  186  354:iload           9
	//  187  356:istore          8
			byte byte1 = ((byte) (j2));
	//  188  358:iload           6
	//  189  360:istore          12
			int i4 = l2;
	//  190  362:iload           7
	//  191  364:istore          11
			if(gifframe.interlace)
	//* 192  366:aload_1         
	//* 193  367:getfield        #268 <Field boolean GifFrame.interlace>
	//* 194  370:ifeq            472
			{
				j3 = l3;
	//  195  373:iload           9
	//  196  375:istore          8
				byte byte0 = ((byte) (j2));
	//  197  377:iload           6
	//  198  379:istore          4
				j = l2;
	//  199  381:iload           7
	//  200  383:istore_3        
				if(l2 >= k4)
	//* 201  384:iload           7
	//* 202  386:iload           14
	//* 203  388:icmplt          456
				{
					j3 = l3 + 1;
	//  204  391:iload           9
	//  205  393:iconst_1        
	//  206  394:iadd            
	//  207  395:istore          8
					switch(j3)
	//* 208  397:iload           8
					{
	//* 209  399:tableswitch     2 4: default 424
	//	               2 434
	//	               3 443
	//	               4 451
					default:
						byte0 = ((byte) (j2));
	//  210  424:iload           6
	//  211  426:istore          4
						j = l2;
	//  212  428:iload           7
	//  213  430:istore_3        
						break;

	//* 214  431:goto            456
					case 2: // '\002'
						j = 4;
	//  215  434:iconst_4        
	//  216  435:istore_3        
						byte0 = ((byte) (j2));
	//  217  436:iload           6
	//  218  438:istore          4
						break;

	//* 219  440:goto            456
					case 3: // '\003'
						j = 2;
	//  220  443:iconst_2        
	//  221  444:istore_3        
						byte0 = 4;
	//  222  445:iconst_4        
	//  223  446:istore          4
						break;

	//* 224  448:goto            456
					case 4: // '\004'
						j = 1;
	//  225  451:iconst_1        
	//  226  452:istore_3        
						byte0 = 2;
	//  227  453:iconst_2        
	//  228  454:istore          4
						break;
					}
				}
				j2 = j;
	//  229  456:iload_3         
	//  230  457:istore          6
				i4 = j + byte0;
	//  231  459:iload_3         
	//  232  460:iload           4
	//  233  462:iadd            
	//  234  463:istore          11
				j = j2;
	//  235  465:iload           6
	//  236  467:istore_3        
				byte1 = byte0;
	//  237  468:iload           4
	//  238  470:istore          12
			}
			j += l4;
	//  239  472:iload_3         
	//  240  473:iload           15
	//  241  475:iadd            
	//  242  476:istore_3        
			if(j < downsampledHeight)
	//* 243  477:iload_3         
	//* 244  478:aload_0         
	//* 245  479:getfield        #177 <Field int downsampledHeight>
	//* 246  482:icmpge          673
			{
				int i1 = j * downsampledWidth;
	//  247  485:iload_3         
	//  248  486:aload_0         
	//  249  487:getfield        #175 <Field int downsampledWidth>
	//  250  490:imul            
	//  251  491:istore          4
				l2 = i1 + j5;
	//  252  493:iload           4
	//  253  495:iload           17
	//  254  497:iadd            
	//  255  498:istore          7
				j = l2 + i5;
	//  256  500:iload           7
	//  257  502:iload           16
	//  258  504:iadd            
	//  259  505:istore_3        
				j2 = j;
	//  260  506:iload_3         
	//  261  507:istore          6
				if(downsampledWidth + i1 < j)
	//* 262  509:aload_0         
	//* 263  510:getfield        #175 <Field int downsampledWidth>
	//* 264  513:iload           4
	//* 265  515:iadd            
	//* 266  516:iload_3         
	//* 267  517:icmpge          529
					j2 = i1 + downsampledWidth;
	//  268  520:iload           4
	//  269  522:aload_0         
	//  270  523:getfield        #175 <Field int downsampledWidth>
	//  271  526:iadd            
	//  272  527:istore          6
				l3 = sampleSize * l1 * gifframe.iw;
	//  273  529:aload_0         
	//  274  530:getfield        #98  <Field int sampleSize>
	//  275  533:iload           5
	//  276  535:imul            
	//  277  536:aload_1         
	//  278  537:getfield        #127 <Field int GifFrame.iw>
	//  279  540:imul            
	//  280  541:istore          9
				int k5 = sampleSize;
	//  281  543:aload_0         
	//  282  544:getfield        #98  <Field int sampleSize>
	//  283  547:istore          18
				i1 = l3;
	//  284  549:iload           9
	//  285  551:istore          4
				j = l2;
	//  286  553:iload           7
	//  287  555:istore_3        
				do
				{
					int j4 = i1;
	//  288  556:iload           4
	//  289  558:istore          13
					i1 = j;
	//  290  560:iload_3         
	//  291  561:istore          4
					if(i1 >= j2)
						break;
	//  292  563:iload           4
	//  293  565:iload           6
	//  294  567:icmpge          673
					if(sampleSize == 1)
	//* 295  570:aload_0         
	//* 296  571:getfield        #98  <Field int sampleSize>
	//* 297  574:iconst_1        
	//* 298  575:icmpne          600
					{
						j = ((int) (mainPixels[j4]));
	//  299  578:aload_0         
	//  300  579:getfield        #100 <Field byte[] mainPixels>
	//  301  582:iload           13
	//  302  584:baload          
	//  303  585:istore_3        
						j = act[j & 0xff];
	//  304  586:aload_0         
	//  305  587:getfield        #102 <Field int[] act>
	//  306  590:iload_3         
	//  307  591:sipush          255
	//  308  594:iand            
	//  309  595:iaload          
	//  310  596:istore_3        
					} else
	//* 311  597:goto            622
					{
						j = averageColorsNear(j4, l3 + (j2 - l2) * k5, gifframe.iw);
	//  312  600:aload_0         
	//  313  601:iload           13
	//  314  603:iload           9
	//  315  605:iload           6
	//  316  607:iload           7
	//  317  609:isub            
	//  318  610:iload           18
	//  319  612:imul            
	//  320  613:iadd            
	//  321  614:aload_1         
	//  322  615:getfield        #127 <Field int GifFrame.iw>
	//  323  618:invokespecial   #270 <Method int averageColorsNear(int, int, int)>
	//  324  621:istore_3        
					}
					if(j != 0)
	//* 325  622:iload_3         
	//* 326  623:ifeq            635
						ai[i1] = j;
	//  327  626:aload           19
	//  328  628:iload           4
	//  329  630:iload_3         
	//  330  631:iastore         
					else
	//* 331  632:goto            652
					if(!isFirstFrameTransparent && flag)
	//* 332  635:aload_0         
	//* 333  636:getfield        #164 <Field boolean isFirstFrameTransparent>
	//* 334  639:ifne            652
	//* 335  642:iload           10
	//* 336  644:ifeq            652
						isFirstFrameTransparent = true;
	//  337  647:aload_0         
	//  338  648:iconst_1        
	//  339  649:putfield        #164 <Field boolean isFirstFrameTransparent>
					j4 += sampleSize;
	//  340  652:iload           13
	//  341  654:aload_0         
	//  342  655:getfield        #98  <Field int sampleSize>
	//  343  658:iadd            
	//  344  659:istore          13
					j = i1 + 1;
	//  345  661:iload           4
	//  346  663:iconst_1        
	//  347  664:iadd            
	//  348  665:istore_3        
					i1 = j4;
	//  349  666:iload           13
	//  350  668:istore          4
				} while(true);
	//  351  670:goto            556
			}
			l1++;
	//  352  673:iload           5
	//  353  675:iconst_1        
	//  354  676:iadd            
	//  355  677:istore          5
			l3 = j3;
	//  356  679:iload           8
	//  357  681:istore          9
			j2 = ((int) (byte1));
	//  358  683:iload           12
	//  359  685:istore          6
			l2 = i4;
	//  360  687:iload           11
	//  361  689:istore          7
		}

	//* 362  691:goto            344
		if(savePrevious && (gifframe.dispose == 0 || gifframe.dispose == 1))
	//* 363  694:aload_0         
	//* 364  695:getfield        #272 <Field boolean savePrevious>
	//* 365  698:ifeq            755
	//* 366  701:aload_1         
	//* 367  702:getfield        #234 <Field int GifFrame.dispose>
	//* 368  705:ifeq            716
	//* 369  708:aload_1         
	//* 370  709:getfield        #234 <Field int GifFrame.dispose>
	//* 371  712:iconst_1        
	//* 372  713:icmpne          755
		{
			if(previousImage == null)
	//* 373  716:aload_0         
	//* 374  717:getfield        #259 <Field Bitmap previousImage>
	//* 375  720:ifnonnull       731
				previousImage = getNextBitmap();
	//  376  723:aload_0         
	//  377  724:aload_0         
	//  378  725:invokespecial   #274 <Method Bitmap getNextBitmap()>
	//  379  728:putfield        #259 <Field Bitmap previousImage>
			previousImage.setPixels(ai, 0, downsampledWidth, 0, 0, downsampledWidth, downsampledHeight);
	//  380  731:aload_0         
	//  381  732:getfield        #259 <Field Bitmap previousImage>
	//  382  735:aload           19
	//  383  737:iconst_0        
	//  384  738:aload_0         
	//  385  739:getfield        #175 <Field int downsampledWidth>
	//  386  742:iconst_0        
	//  387  743:iconst_0        
	//  388  744:aload_0         
	//  389  745:getfield        #175 <Field int downsampledWidth>
	//  390  748:aload_0         
	//  391  749:getfield        #177 <Field int downsampledHeight>
	//  392  752:invokevirtual   #276 <Method void Bitmap.setPixels(int[], int, int, int, int, int, int)>
		}
		gifframe = ((GifFrame) (getNextBitmap()));
	//  393  755:aload_0         
	//  394  756:invokespecial   #274 <Method Bitmap getNextBitmap()>
	//  395  759:astore_1        
		((Bitmap) (gifframe)).setPixels(ai, 0, downsampledWidth, 0, 0, downsampledWidth, downsampledHeight);
	//  396  760:aload_1         
	//  397  761:aload           19
	//  398  763:iconst_0        
	//  399  764:aload_0         
	//  400  765:getfield        #175 <Field int downsampledWidth>
	//  401  768:iconst_0        
	//  402  769:iconst_0        
	//  403  770:aload_0         
	//  404  771:getfield        #175 <Field int downsampledWidth>
	//  405  774:aload_0         
	//  406  775:getfield        #177 <Field int downsampledHeight>
	//  407  778:invokevirtual   #276 <Method void Bitmap.setPixels(int[], int, int, int, int, int, int)>
		return ((Bitmap) (gifframe));
	//  408  781:aload_1         
	//  409  782:areturn         
	}

	public void advance()
	{
		framePointer = (framePointer + 1) % header.frameCount;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #251 <Field int framePointer>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:aload_0         
	//    6    8:getfield        #84  <Field GifHeader header>
	//    7   11:getfield        #280 <Field int GifHeader.frameCount>
	//    8   14:irem            
	//    9   15:putfield        #251 <Field int framePointer>
	//   10   18:return          
	}

	public void clear()
	{
		header = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #84  <Field GifHeader header>
		if(mainPixels != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #100 <Field byte[] mainPixels>
	//*   5    9:ifnull          25
			bitmapProvider.release(mainPixels);
	//    6   12:aload_0         
	//    7   13:getfield        #79  <Field GifDecoder$BitmapProvider bitmapProvider>
	//    8   16:aload_0         
	//    9   17:getfield        #100 <Field byte[] mainPixels>
	//   10   20:invokeinterface #285 <Method void GifDecoder$BitmapProvider.release(byte[])>
		if(mainScratch != null)
	//*  11   25:aload_0         
	//*  12   26:getfield        #225 <Field int[] mainScratch>
	//*  13   29:ifnull          45
			bitmapProvider.release(mainScratch);
	//   14   32:aload_0         
	//   15   33:getfield        #79  <Field GifDecoder$BitmapProvider bitmapProvider>
	//   16   36:aload_0         
	//   17   37:getfield        #225 <Field int[] mainScratch>
	//   18   40:invokeinterface #288 <Method void GifDecoder$BitmapProvider.release(int[])>
		if(previousImage != null)
	//*  19   45:aload_0         
	//*  20   46:getfield        #259 <Field Bitmap previousImage>
	//*  21   49:ifnull          65
			bitmapProvider.release(previousImage);
	//   22   52:aload_0         
	//   23   53:getfield        #79  <Field GifDecoder$BitmapProvider bitmapProvider>
	//   24   56:aload_0         
	//   25   57:getfield        #259 <Field Bitmap previousImage>
	//   26   60:invokeinterface #291 <Method void GifDecoder$BitmapProvider.release(Bitmap)>
		previousImage = null;
	//   27   65:aload_0         
	//   28   66:aconst_null     
	//   29   67:putfield        #259 <Field Bitmap previousImage>
		rawData = null;
	//   30   70:aload_0         
	//   31   71:aconst_null     
	//   32   72:putfield        #107 <Field ByteBuffer rawData>
		isFirstFrameTransparent = false;
	//   33   75:aload_0         
	//   34   76:iconst_0        
	//   35   77:putfield        #164 <Field boolean isFirstFrameTransparent>
		if(block != null)
	//*  36   80:aload_0         
	//*  37   81:getfield        #153 <Field byte[] block>
	//*  38   84:ifnull          100
			bitmapProvider.release(block);
	//   39   87:aload_0         
	//   40   88:getfield        #79  <Field GifDecoder$BitmapProvider bitmapProvider>
	//   41   91:aload_0         
	//   42   92:getfield        #153 <Field byte[] block>
	//   43   95:invokeinterface #285 <Method void GifDecoder$BitmapProvider.release(byte[])>
		if(workBuffer != null)
	//*  44  100:aload_0         
	//*  45  101:getfield        #191 <Field byte[] workBuffer>
	//*  46  104:ifnull          120
			bitmapProvider.release(workBuffer);
	//   47  107:aload_0         
	//   48  108:getfield        #79  <Field GifDecoder$BitmapProvider bitmapProvider>
	//   49  111:aload_0         
	//   50  112:getfield        #191 <Field byte[] workBuffer>
	//   51  115:invokeinterface #285 <Method void GifDecoder$BitmapProvider.release(byte[])>
	//   52  120:return          
	}

	public int getByteSize()
	{
		return rawData.limit() + mainPixels.length + mainScratch.length * 4;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field ByteBuffer rawData>
	//    2    4:invokevirtual   #295 <Method int ByteBuffer.limit()>
	//    3    7:aload_0         
	//    4    8:getfield        #100 <Field byte[] mainPixels>
	//    5   11:arraylength     
	//    6   12:iadd            
	//    7   13:aload_0         
	//    8   14:getfield        #225 <Field int[] mainScratch>
	//    9   17:arraylength     
	//   10   18:iconst_4        
	//   11   19:imul            
	//   12   20:iadd            
	//   13   21:ireturn         
	}

	public int getCurrentFrameIndex()
	{
		return framePointer;
	//    0    0:aload_0         
	//    1    1:getfield        #251 <Field int framePointer>
	//    2    4:ireturn         
	}

	public ByteBuffer getData()
	{
		return rawData;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field ByteBuffer rawData>
	//    2    4:areturn         
	}

	public int getDelay(int i)
	{
		byte byte0 = -1;
	//    0    0:iconst_m1       
	//    1    1:istore_3        
		int j = ((int) (byte0));
	//    2    2:iload_3         
	//    3    3:istore_2        
		if(i >= 0)
	//*   4    4:iload_1         
	//*   5    5:iflt            41
		{
			j = ((int) (byte0));
	//    6    8:iload_3         
	//    7    9:istore_2        
			if(i < header.frameCount)
	//*   8   10:iload_1         
	//*   9   11:aload_0         
	//*  10   12:getfield        #84  <Field GifHeader header>
	//*  11   15:getfield        #280 <Field int GifHeader.frameCount>
	//*  12   18:icmpge          41
				j = ((GifFrame)header.frames.get(i)).delay;
	//   13   21:aload_0         
	//   14   22:getfield        #84  <Field GifHeader header>
	//   15   25:getfield        #304 <Field List GifHeader.frames>
	//   16   28:iload_1         
	//   17   29:invokeinterface #309 <Method Object List.get(int)>
	//   18   34:checkcast       #109 <Class GifFrame>
	//   19   37:getfield        #312 <Field int GifFrame.delay>
	//   20   40:istore_2        
		}
		return j;
	//   21   41:iload_2         
	//   22   42:ireturn         
	}

	public int getFrameCount()
	{
		return header.frameCount;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field GifHeader header>
	//    2    4:getfield        #280 <Field int GifHeader.frameCount>
	//    3    7:ireturn         
	}

	public int getHeight()
	{
		return header.height;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field GifHeader header>
	//    2    4:getfield        #124 <Field int GifHeader.height>
	//    3    7:ireturn         
	}

	public int getLoopCount()
	{
		if(header.loopCount == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field GifHeader header>
	//*   2    4:getfield        #318 <Field int GifHeader.loopCount>
	//*   3    7:iconst_m1       
	//*   4    8:icmpne          13
			return 1;
	//    5   11:iconst_1        
	//    6   12:ireturn         
		else
			return header.loopCount;
	//    7   13:aload_0         
	//    8   14:getfield        #84  <Field GifHeader header>
	//    9   17:getfield        #318 <Field int GifHeader.loopCount>
	//   10   20:ireturn         
	}

	public int getNetscapeLoopCount()
	{
		return header.loopCount;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field GifHeader header>
	//    2    4:getfield        #318 <Field int GifHeader.loopCount>
	//    3    7:ireturn         
	}

	public int getNextDelay()
	{
		if(header.frameCount <= 0 || framePointer < 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field GifHeader header>
	//*   2    4:getfield        #280 <Field int GifHeader.frameCount>
	//*   3    7:ifle            17
	//*   4   10:aload_0         
	//*   5   11:getfield        #251 <Field int framePointer>
	//*   6   14:ifge            19
			return 0;
	//    7   17:iconst_0        
	//    8   18:ireturn         
		else
			return getDelay(framePointer);
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #251 <Field int framePointer>
	//   12   24:invokevirtual   #322 <Method int getDelay(int)>
	//   13   27:ireturn         
	}

	public Bitmap getNextFrame()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(header.frameCount <= 0 || framePointer < 0)
	//*   2    2:aload_0         
	//*   3    3:getfield        #84  <Field GifHeader header>
	//*   4    6:getfield        #280 <Field int GifHeader.frameCount>
	//*   5    9:ifle            19
	//*   6   12:aload_0         
	//*   7   13:getfield        #251 <Field int framePointer>
	//*   8   16:ifge            80
		{
			if(Log.isLoggable(TAG, 3))
	//*   9   19:getstatic       #66  <Field String TAG>
	//*  10   22:iconst_3        
	//*  11   23:invokestatic    #327 <Method boolean Log.isLoggable(String, int)>
	//*  12   26:ifeq            75
				Log.d(TAG, (new StringBuilder()).append("Unable to decode frame, frameCount=").append(header.frameCount).append(", framePointer=").append(framePointer).toString());
	//   13   29:getstatic       #66  <Field String TAG>
	//   14   32:new             #329 <Class StringBuilder>
	//   15   35:dup             
	//   16   36:invokespecial   #330 <Method void StringBuilder()>
	//   17   39:ldc2            #332 <String "Unable to decode frame, frameCount=">
	//   18   42:invokevirtual   #336 <Method StringBuilder StringBuilder.append(String)>
	//   19   45:aload_0         
	//   20   46:getfield        #84  <Field GifHeader header>
	//   21   49:getfield        #280 <Field int GifHeader.frameCount>
	//   22   52:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//   23   55:ldc2            #341 <String ", framePointer=">
	//   24   58:invokevirtual   #336 <Method StringBuilder StringBuilder.append(String)>
	//   25   61:aload_0         
	//   26   62:getfield        #251 <Field int framePointer>
	//   27   65:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//   28   68:invokevirtual   #344 <Method String StringBuilder.toString()>
	//   29   71:invokestatic    #348 <Method int Log.d(String, String)>
	//   30   74:pop             
			status = 1;
	//   31   75:aload_0         
	//   32   76:iconst_1        
	//   33   77:putfield        #151 <Field int status>
		}
		if(status != 1 && status != 2)
			break MISSING_BLOCK_LABEL_140;
	//   34   80:aload_0         
	//   35   81:getfield        #151 <Field int status>
	//   36   84:iconst_1        
	//   37   85:icmpeq          96
	//   38   88:aload_0         
	//   39   89:getfield        #151 <Field int status>
	//   40   92:iconst_2        
	//   41   93:icmpne          140
		if(Log.isLoggable(TAG, 3))
	//*  42   96:getstatic       #66  <Field String TAG>
	//*  43   99:iconst_3        
	//*  44  100:invokestatic    #327 <Method boolean Log.isLoggable(String, int)>
	//*  45  103:ifeq            136
			Log.d(TAG, (new StringBuilder()).append("Unable to decode frame, status=").append(status).toString());
	//   46  106:getstatic       #66  <Field String TAG>
	//   47  109:new             #329 <Class StringBuilder>
	//   48  112:dup             
	//   49  113:invokespecial   #330 <Method void StringBuilder()>
	//   50  116:ldc2            #350 <String "Unable to decode frame, status=">
	//   51  119:invokevirtual   #336 <Method StringBuilder StringBuilder.append(String)>
	//   52  122:aload_0         
	//   53  123:getfield        #151 <Field int status>
	//   54  126:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//   55  129:invokevirtual   #344 <Method String StringBuilder.toString()>
	//   56  132:invokestatic    #348 <Method int Log.d(String, String)>
	//   57  135:pop             
		this;
	//   58  136:aload_0         
		JVM INSTR monitorexit ;
	//   59  137:monitorexit     
		return null;
	//   60  138:aconst_null     
	//   61  139:areturn         
		GifFrame gifframe;
		status = 0;
	//   62  140:aload_0         
	//   63  141:iconst_0        
	//   64  142:putfield        #151 <Field int status>
		gifframe = (GifFrame)header.frames.get(framePointer);
	//   65  145:aload_0         
	//   66  146:getfield        #84  <Field GifHeader header>
	//   67  149:getfield        #304 <Field List GifHeader.frames>
	//   68  152:aload_0         
	//   69  153:getfield        #251 <Field int framePointer>
	//   70  156:invokeinterface #309 <Method Object List.get(int)>
	//   71  161:checkcast       #109 <Class GifFrame>
	//   72  164:astore          4
		Object obj = null;
	//   73  166:aconst_null     
	//   74  167:astore_2        
		int i = framePointer - 1;
	//   75  168:aload_0         
	//   76  169:getfield        #251 <Field int framePointer>
	//   77  172:iconst_1        
	//   78  173:isub            
	//   79  174:istore_1        
		if(i < 0)
			break MISSING_BLOCK_LABEL_196;
	//   80  175:iload_1         
	//   81  176:iflt            196
		obj = ((Object) ((GifFrame)header.frames.get(i)));
	//   82  179:aload_0         
	//   83  180:getfield        #84  <Field GifHeader header>
	//   84  183:getfield        #304 <Field List GifHeader.frames>
	//   85  186:iload_1         
	//   86  187:invokeinterface #309 <Method Object List.get(int)>
	//   87  192:checkcast       #109 <Class GifFrame>
	//   88  195:astore_2        
		int ai[];
		if(gifframe.lct != null)
	//*  89  196:aload           4
	//*  90  198:getfield        #243 <Field int[] GifFrame.lct>
	//*  91  201:ifnull          213
		{
			ai = gifframe.lct;
	//   92  204:aload           4
	//   93  206:getfield        #243 <Field int[] GifFrame.lct>
	//   94  209:astore_3        
			break MISSING_BLOCK_LABEL_221;
	//   95  210:goto            221
		}
		ai = header.gct;
	//   96  213:aload_0         
	//   97  214:getfield        #84  <Field GifHeader header>
	//   98  217:getfield        #353 <Field int[] GifHeader.gct>
	//   99  220:astore_3        
		act = ai;
	//  100  221:aload_0         
	//  101  222:aload_3         
	//  102  223:putfield        #102 <Field int[] act>
		if(act != null)
			break MISSING_BLOCK_LABEL_282;
	//  103  226:aload_0         
	//  104  227:getfield        #102 <Field int[] act>
	//  105  230:ifnonnull       282
		if(Log.isLoggable(TAG, 3))
	//* 106  233:getstatic       #66  <Field String TAG>
	//* 107  236:iconst_3        
	//* 108  237:invokestatic    #327 <Method boolean Log.isLoggable(String, int)>
	//* 109  240:ifeq            273
			Log.d(TAG, (new StringBuilder()).append("No valid color table found for frame #").append(framePointer).toString());
	//  110  243:getstatic       #66  <Field String TAG>
	//  111  246:new             #329 <Class StringBuilder>
	//  112  249:dup             
	//  113  250:invokespecial   #330 <Method void StringBuilder()>
	//  114  253:ldc2            #355 <String "No valid color table found for frame #">
	//  115  256:invokevirtual   #336 <Method StringBuilder StringBuilder.append(String)>
	//  116  259:aload_0         
	//  117  260:getfield        #251 <Field int framePointer>
	//  118  263:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//  119  266:invokevirtual   #344 <Method String StringBuilder.toString()>
	//  120  269:invokestatic    #348 <Method int Log.d(String, String)>
	//  121  272:pop             
		status = 1;
	//  122  273:aload_0         
	//  123  274:iconst_1        
	//  124  275:putfield        #151 <Field int status>
		this;
	//  125  278:aload_0         
		JVM INSTR monitorexit ;
	//  126  279:monitorexit     
		return null;
	//  127  280:aconst_null     
	//  128  281:areturn         
		if(gifframe.transparency)
	//* 129  282:aload           4
	//* 130  284:getfield        #237 <Field boolean GifFrame.transparency>
	//* 131  287:ifeq            327
		{
			System.arraycopy(((Object) (act)), 0, ((Object) (pct)), 0, act.length);
	//  132  290:aload_0         
	//  133  291:getfield        #102 <Field int[] act>
	//  134  294:iconst_0        
	//  135  295:aload_0         
	//  136  296:getfield        #73  <Field int[] pct>
	//  137  299:iconst_0        
	//  138  300:aload_0         
	//  139  301:getfield        #102 <Field int[] act>
	//  140  304:arraylength     
	//  141  305:invokestatic    #197 <Method void System.arraycopy(Object, int, Object, int, int)>
			act = pct;
	//  142  308:aload_0         
	//  143  309:aload_0         
	//  144  310:getfield        #73  <Field int[] pct>
	//  145  313:putfield        #102 <Field int[] act>
			act[gifframe.transIndex] = 0;
	//  146  316:aload_0         
	//  147  317:getfield        #102 <Field int[] act>
	//  148  320:aload           4
	//  149  322:getfield        #249 <Field int GifFrame.transIndex>
	//  150  325:iconst_0        
	//  151  326:iastore         
		}
		obj = ((Object) (setPixels(gifframe, ((GifFrame) (obj)))));
	//  152  327:aload_0         
	//  153  328:aload           4
	//  154  330:aload_2         
	//  155  331:invokespecial   #357 <Method Bitmap setPixels(GifFrame, GifFrame)>
	//  156  334:astore_2        
		this;
	//  157  335:aload_0         
		JVM INSTR monitorexit ;
	//  158  336:monitorexit     
		return ((Bitmap) (obj));
	//  159  337:aload_2         
	//  160  338:areturn         
		Exception exception;
		exception;
	//  161  339:astore_2        
	//* 162  340:aload_0         
		throw exception;
	//  163  341:monitorexit     
	//  164  342:aload_2         
	//  165  343:athrow          
	}

	public int getStatus()
	{
		return status;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field int status>
	//    2    4:ireturn         
	}

	public int getTotalIterationCount()
	{
		if(header.loopCount == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field GifHeader header>
	//*   2    4:getfield        #318 <Field int GifHeader.loopCount>
	//*   3    7:iconst_m1       
	//*   4    8:icmpne          13
			return 1;
	//    5   11:iconst_1        
	//    6   12:ireturn         
		if(header.loopCount == 0)
	//*   7   13:aload_0         
	//*   8   14:getfield        #84  <Field GifHeader header>
	//*   9   17:getfield        #318 <Field int GifHeader.loopCount>
	//*  10   20:ifne            25
			return 0;
	//   11   23:iconst_0        
	//   12   24:ireturn         
		else
			return header.loopCount + 1;
	//   13   25:aload_0         
	//   14   26:getfield        #84  <Field GifHeader header>
	//   15   29:getfield        #318 <Field int GifHeader.loopCount>
	//   16   32:iconst_1        
	//   17   33:iadd            
	//   18   34:ireturn         
	}

	public int getWidth()
	{
		return header.width;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field GifHeader header>
	//    2    4:getfield        #121 <Field int GifHeader.width>
	//    3    7:ireturn         
	}

	public int read(InputStream inputstream, int i)
	{
		if(inputstream == null)
			break MISSING_BLOCK_LABEL_99;
	//    0    0:aload_1         
	//    1    1:ifnull          99
		if(i > 0)
	//*   2    4:iload_2         
	//*   3    5:ifle            17
			i += 4096;
	//    4    8:iload_2         
	//    5    9:sipush          4096
	//    6   12:iadd            
	//    7   13:istore_2        
		else
	//*   8   14:goto            21
			i = 16384;
	//    9   17:sipush          16384
	//   10   20:istore_2        
		ByteArrayOutputStream bytearrayoutputstream;
		byte abyte0[];
		bytearrayoutputstream = new ByteArrayOutputStream(i);
	//   11   21:new             #366 <Class ByteArrayOutputStream>
	//   12   24:dup             
	//   13   25:iload_2         
	//   14   26:invokespecial   #369 <Method void ByteArrayOutputStream(int)>
	//   15   29:astore_3        
		abyte0 = new byte[16384];
	//   16   30:sipush          16384
	//   17   33:newarray        byte[]
	//   18   35:astore          4
_L1:
		i = abyte0.length;
	//   19   37:aload           4
	//   20   39:arraylength     
	//   21   40:istore_2        
		i = inputstream.read(abyte0, 0, 16384);
	//   22   41:aload_1         
	//   23   42:aload           4
	//   24   44:iconst_0        
	//   25   45:sipush          16384
	//   26   48:invokevirtual   #374 <Method int InputStream.read(byte[], int, int)>
	//   27   51:istore_2        
		if(i == -1)
			break MISSING_BLOCK_LABEL_68;
	//   28   52:iload_2         
	//   29   53:iconst_m1       
	//   30   54:icmpeq          68
		bytearrayoutputstream.write(abyte0, 0, i);
	//   31   57:aload_3         
	//   32   58:aload           4
	//   33   60:iconst_0        
	//   34   61:iload_2         
	//   35   62:invokevirtual   #378 <Method void ByteArrayOutputStream.write(byte[], int, int)>
		  goto _L1
	//*  36   65:goto            37
		try
		{
			bytearrayoutputstream.flush();
	//   37   68:aload_3         
	//   38   69:invokevirtual   #381 <Method void ByteArrayOutputStream.flush()>
			read(bytearrayoutputstream.toByteArray());
	//   39   72:aload_0         
	//   40   73:aload_3         
	//   41   74:invokevirtual   #385 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   42   77:invokevirtual   #388 <Method int read(byte[])>
	//   43   80:pop             
		}
	//*  44   81:goto            104
		catch(IOException ioexception)
	//*  45   84:astore_3        
		{
			Log.w(TAG, "Error reading data from stream", ((Throwable) (ioexception)));
	//   46   85:getstatic       #66  <Field String TAG>
	//   47   88:ldc2            #390 <String "Error reading data from stream">
	//   48   91:aload_3         
	//   49   92:invokestatic    #211 <Method int Log.w(String, String, Throwable)>
	//   50   95:pop             
		}
		break MISSING_BLOCK_LABEL_104;
	//   51   96:goto            104
		status = 2;
	//   52   99:aload_0         
	//   53  100:iconst_2        
	//   54  101:putfield        #151 <Field int status>
		if(inputstream != null)
	//*  55  104:aload_1         
	//*  56  105:ifnull          112
			try
			{
				inputstream.close();
	//   57  108:aload_1         
	//   58  109:invokevirtual   #393 <Method void InputStream.close()>
			}
	//*  59  112:goto            127
			// Misplaced declaration of an exception variable
			catch(InputStream inputstream)
	//*  60  115:astore_1        
			{
				Log.w(TAG, "Error closing stream", ((Throwable) (inputstream)));
	//   61  116:getstatic       #66  <Field String TAG>
	//   62  119:ldc2            #395 <String "Error closing stream">
	//   63  122:aload_1         
	//   64  123:invokestatic    #211 <Method int Log.w(String, String, Throwable)>
	//   65  126:pop             
			}
		return status;
	//   66  127:aload_0         
	//   67  128:getfield        #151 <Field int status>
	//   68  131:ireturn         
	}

	public int read(byte abyte0[])
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		header = getHeaderParser().setData(abyte0).parseHeader();
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:invokespecial   #397 <Method GifHeaderParser getHeaderParser()>
	//    5    7:aload_1         
	//    6    8:invokevirtual   #400 <Method GifHeaderParser GifHeaderParser.setData(byte[])>
	//    7   11:invokevirtual   #404 <Method GifHeader GifHeaderParser.parseHeader()>
	//    8   14:putfield        #84  <Field GifHeader header>
		if(abyte0 == null)
			break MISSING_BLOCK_LABEL_30;
	//    9   17:aload_1         
	//   10   18:ifnull          30
		setData(header, abyte0);
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #84  <Field GifHeader header>
	//   14   26:aload_1         
	//   15   27:invokevirtual   #407 <Method void setData(GifHeader, byte[])>
		int i = status;
	//   16   30:aload_0         
	//   17   31:getfield        #151 <Field int status>
	//   18   34:istore_2        
		this;
	//   19   35:aload_0         
		JVM INSTR monitorexit ;
	//   20   36:monitorexit     
		return i;
	//   21   37:iload_2         
	//   22   38:ireturn         
		abyte0;
	//   23   39:astore_1        
	//*  24   40:aload_0         
		throw abyte0;
	//   25   41:monitorexit     
	//   26   42:aload_1         
	//   27   43:athrow          
	}

	public void resetFrameIndex()
	{
		framePointer = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #251 <Field int framePointer>
	//    3    5:return          
	}

	public void setData(GifHeader gifheader, ByteBuffer bytebuffer)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		setData(gifheader, bytebuffer, 1);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:aload_2         
	//    5    5:iconst_1        
	//    6    6:invokevirtual   #94  <Method void setData(GifHeader, ByteBuffer, int)>
		this;
	//    7    9:aload_0         
		JVM INSTR monitorexit ;
	//    8   10:monitorexit     
		return;
	//    9   11:return          
		gifheader;
	//   10   12:astore_1        
	//*  11   13:aload_0         
		throw gifheader;
	//   12   14:monitorexit     
	//   13   15:aload_1         
	//   14   16:athrow          
	}

	public void setData(GifHeader gifheader, ByteBuffer bytebuffer, int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(i > 0)
			break MISSING_BLOCK_LABEL_34;
	//    2    2:iload_3         
	//    3    3:ifgt            34
		throw new IllegalArgumentException((new StringBuilder()).append("Sample size must be >=0, not: ").append(i).toString());
	//    4    6:new             #411 <Class IllegalArgumentException>
	//    5    9:dup             
	//    6   10:new             #329 <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #330 <Method void StringBuilder()>
	//    9   17:ldc2            #413 <String "Sample size must be >=0, not: ">
	//   10   20:invokevirtual   #336 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:iload_3         
	//   12   24:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//   13   27:invokevirtual   #344 <Method String StringBuilder.toString()>
	//   14   30:invokespecial   #416 <Method void IllegalArgumentException(String)>
	//   15   33:athrow          
		i = Integer.highestOneBit(i);
	//   16   34:iload_3         
	//   17   35:invokestatic    #421 <Method int Integer.highestOneBit(int)>
	//   18   38:istore_3        
		status = 0;
	//   19   39:aload_0         
	//   20   40:iconst_0        
	//   21   41:putfield        #151 <Field int status>
		header = gifheader;
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:putfield        #84  <Field GifHeader header>
		isFirstFrameTransparent = false;
	//   25   49:aload_0         
	//   26   50:iconst_0        
	//   27   51:putfield        #164 <Field boolean isFirstFrameTransparent>
		framePointer = -1;
	//   28   54:aload_0         
	//   29   55:iconst_m1       
	//   30   56:putfield        #251 <Field int framePointer>
		rawData = bytebuffer.asReadOnlyBuffer();
	//   31   59:aload_0         
	//   32   60:aload_2         
	//   33   61:invokevirtual   #424 <Method ByteBuffer ByteBuffer.asReadOnlyBuffer()>
	//   34   64:putfield        #107 <Field ByteBuffer rawData>
		rawData.position(0);
	//   35   67:aload_0         
	//   36   68:getfield        #107 <Field ByteBuffer rawData>
	//   37   71:iconst_0        
	//   38   72:invokevirtual   #118 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   39   75:pop             
		rawData.order(ByteOrder.LITTLE_ENDIAN);
	//   40   76:aload_0         
	//   41   77:getfield        #107 <Field ByteBuffer rawData>
	//   42   80:getstatic       #430 <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//   43   83:invokevirtual   #434 <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   44   86:pop             
		savePrevious = false;
	//   45   87:aload_0         
	//   46   88:iconst_0        
	//   47   89:putfield        #272 <Field boolean savePrevious>
		bytebuffer = ((ByteBuffer) (gifheader.frames.iterator()));
	//   48   92:aload_1         
	//   49   93:getfield        #304 <Field List GifHeader.frames>
	//   50   96:invokeinterface #438 <Method Iterator List.iterator()>
	//   51  101:astore_2        
		do
			if(!((Iterator) (bytebuffer)).hasNext())
				break MISSING_BLOCK_LABEL_135;
	//   52  102:aload_2         
	//   53  103:invokeinterface #444 <Method boolean Iterator.hasNext()>
	//   54  108:ifeq            135
		while(((GifFrame)((Iterator) (bytebuffer)).next()).dispose != 3);
	//   55  111:aload_2         
	//   56  112:invokeinterface #448 <Method Object Iterator.next()>
	//   57  117:checkcast       #109 <Class GifFrame>
	//   58  120:getfield        #234 <Field int GifFrame.dispose>
	//   59  123:iconst_3        
	//   60  124:icmpne          212
		savePrevious = true;
	//   61  127:aload_0         
	//   62  128:iconst_1        
	//   63  129:putfield        #272 <Field boolean savePrevious>
	//*  64  132:goto            135
		sampleSize = i;
	//   65  135:aload_0         
	//   66  136:iload_3         
	//   67  137:putfield        #98  <Field int sampleSize>
		downsampledWidth = gifheader.width / i;
	//   68  140:aload_0         
	//   69  141:aload_1         
	//   70  142:getfield        #121 <Field int GifHeader.width>
	//   71  145:iload_3         
	//   72  146:idiv            
	//   73  147:putfield        #175 <Field int downsampledWidth>
		downsampledHeight = gifheader.height / i;
	//   74  150:aload_0         
	//   75  151:aload_1         
	//   76  152:getfield        #124 <Field int GifHeader.height>
	//   77  155:iload_3         
	//   78  156:idiv            
	//   79  157:putfield        #177 <Field int downsampledHeight>
		mainPixels = bitmapProvider.obtainByteArray(gifheader.width * gifheader.height);
	//   80  160:aload_0         
	//   81  161:aload_0         
	//   82  162:getfield        #79  <Field GifDecoder$BitmapProvider bitmapProvider>
	//   83  165:aload_1         
	//   84  166:getfield        #121 <Field int GifHeader.width>
	//   85  169:aload_1         
	//   86  170:getfield        #124 <Field int GifHeader.height>
	//   87  173:imul            
	//   88  174:invokeinterface #136 <Method byte[] GifDecoder$BitmapProvider.obtainByteArray(int)>
	//   89  179:putfield        #100 <Field byte[] mainPixels>
		mainScratch = bitmapProvider.obtainIntArray(downsampledWidth * downsampledHeight);
	//   90  182:aload_0         
	//   91  183:aload_0         
	//   92  184:getfield        #79  <Field GifDecoder$BitmapProvider bitmapProvider>
	//   93  187:aload_0         
	//   94  188:getfield        #175 <Field int downsampledWidth>
	//   95  191:aload_0         
	//   96  192:getfield        #177 <Field int downsampledHeight>
	//   97  195:imul            
	//   98  196:invokeinterface #452 <Method int[] GifDecoder$BitmapProvider.obtainIntArray(int)>
	//   99  201:putfield        #225 <Field int[] mainScratch>
		this;
	//  100  204:aload_0         
		JVM INSTR monitorexit ;
	//  101  205:monitorexit     
		return;
	//  102  206:return          
		gifheader;
	//  103  207:astore_1        
	//* 104  208:aload_0         
		throw gifheader;
	//  105  209:monitorexit     
	//  106  210:aload_1         
	//  107  211:athrow          
	//* 108  212:goto            102
	}

	public void setData(GifHeader gifheader, byte abyte0[])
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		setData(gifheader, ByteBuffer.wrap(abyte0));
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:aload_2         
	//    5    5:invokestatic    #456 <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//    6    8:invokevirtual   #458 <Method void setData(GifHeader, ByteBuffer)>
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		gifheader;
	//   10   14:astore_1        
	//*  11   15:aload_0         
		throw gifheader;
	//   12   16:monitorexit     
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	private static final int BYTES_PER_INTEGER = 4;
	private static final int COLOR_TRANSPARENT_BLACK = 0;
	private static final int INITIAL_FRAME_POINTER = -1;
	private static final int MASK_INT_LOWEST_BYTE = 255;
	private static final int MAX_STACK_SIZE = 4096;
	private static final int NULL_CODE = -1;
	private static final String TAG = ((Class) (com/bumptech/glide/gifdecoder/StandardGifDecoder)).getSimpleName();
	private static final int WORK_BUFFER_SIZE = 16384;
	private int act[];
	private GifDecoder.BitmapProvider bitmapProvider;
	private byte block[];
	private int downsampledHeight;
	private int downsampledWidth;
	private int framePointer;
	private GifHeader header;
	private boolean isFirstFrameTransparent;
	private byte mainPixels[];
	private int mainScratch[];
	private GifHeaderParser parser;
	private final int pct[];
	private byte pixelStack[];
	private short prefix[];
	private Bitmap previousImage;
	private ByteBuffer rawData;
	private int sampleSize;
	private boolean savePrevious;
	private int status;
	private byte suffix[];
	private byte workBuffer[];
	private int workBufferPosition;
	private int workBufferSize;

	static 
	{
	//    0    0:ldc1            #2   <Class StandardGifDecoder>
	//    1    2:invokevirtual   #64  <Method String Class.getSimpleName()>
	//    2    5:putstatic       #66  <Field String TAG>
	//*   3    8:return          
	}
}
