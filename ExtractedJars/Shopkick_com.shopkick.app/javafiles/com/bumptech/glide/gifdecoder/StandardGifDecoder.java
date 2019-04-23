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
	//    1    1:invokespecial   #64  <Method void Object()>
		pct = new int[256];
	//    2    4:aload_0         
	//    3    5:sipush          256
	//    4    8:newarray        int[]
	//    5   10:putfield        #66  <Field int[] pct>
		bitmapConfig = android.graphics.Bitmap.Config.ARGB_8888;
	//    6   13:aload_0         
	//    7   14:getstatic       #71  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//    8   17:putfield        #73  <Field android.graphics.Bitmap$Config bitmapConfig>
		bitmapProvider = bitmapprovider;
	//    9   20:aload_0         
	//   10   21:aload_1         
	//   11   22:putfield        #75  <Field GifDecoder$BitmapProvider bitmapProvider>
		header = new GifHeader();
	//   12   25:aload_0         
	//   13   26:new             #77  <Class GifHeader>
	//   14   29:dup             
	//   15   30:invokespecial   #78  <Method void GifHeader()>
	//   16   33:putfield        #80  <Field GifHeader header>
	//   17   36:return          
	}

	public StandardGifDecoder(GifDecoder.BitmapProvider bitmapprovider, GifHeader gifheader, ByteBuffer bytebuffer)
	{
		this(bitmapprovider, gifheader, bytebuffer, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_1        
	//    5    5:invokespecial   #85  <Method void StandardGifDecoder(GifDecoder$BitmapProvider, GifHeader, ByteBuffer, int)>
	//    6    8:return          
	}

	public StandardGifDecoder(GifDecoder.BitmapProvider bitmapprovider, GifHeader gifheader, ByteBuffer bytebuffer, int i)
	{
		this(bitmapprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #87  <Method void StandardGifDecoder(GifDecoder$BitmapProvider)>
		setData(gifheader, bytebuffer, i);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:iload           4
	//    7   10:invokevirtual   #91  <Method void setData(GifHeader, ByteBuffer, int)>
	//    8   13:return          
	}

	private int averageColorsNear(int i, int j, int k)
	{
		int j2 = i;
	//    0    0:iload_1         
	//    1    1:istore          9
		int l1 = 0;
	//    2    3:iconst_0        
	//    3    4:istore          8
		int k1 = l1;
	//    4    6:iload           8
	//    5    8:istore          7
		int j1 = k1;
	//    6   10:iload           7
	//    7   12:istore          6
		int i1 = j1;
	//    8   14:iload           6
	//    9   16:istore          5
		int l;
		int l2;
		for(l = i1; j2 < sampleSize + i; l = l2)
	//*  10   18:iload           5
	//*  11   20:istore          4
	//*  12   22:iload           9
	//*  13   24:aload_0         
	//*  14   25:getfield        #95  <Field int sampleSize>
	//*  15   28:iload_1         
	//*  16   29:iadd            
	//*  17   30:icmpge          186
		{
			byte abyte0[] = mainPixels;
	//   18   33:aload_0         
	//   19   34:getfield        #97  <Field byte[] mainPixels>
	//   20   37:astore          16
			if(j2 >= abyte0.length || j2 >= j)
				break;
	//   21   39:iload           9
	//   22   41:aload           16
	//   23   43:arraylength     
	//   24   44:icmpge          186
	//   25   47:iload           9
	//   26   49:iload_2         
	//   27   50:icmpge          186
			l2 = ((int) (abyte0[j2]));
	//   28   53:aload           16
	//   29   55:iload           9
	//   30   57:baload          
	//   31   58:istore          10
			int j5 = act[l2 & 0xff];
	//   32   60:aload_0         
	//   33   61:getfield        #99  <Field int[] act>
	//   34   64:iload           10
	//   35   66:sipush          255
	//   36   69:iand            
	//   37   70:iaload          
	//   38   71:istore          15
			int l4 = l1;
	//   39   73:iload           8
	//   40   75:istore          14
			int j4 = k1;
	//   41   77:iload           7
	//   42   79:istore          13
			int l3 = j1;
	//   43   81:iload           6
	//   44   83:istore          12
			int j3 = i1;
	//   45   85:iload           5
	//   46   87:istore          11
			l2 = l;
	//   47   89:iload           4
	//   48   91:istore          10
			if(j5 != 0)
	//*  49   93:iload           15
	//*  50   95:ifeq            157
			{
				l4 = l1 + (j5 >> 24 & 0xff);
	//   51   98:iload           8
	//   52  100:iload           15
	//   53  102:bipush          24
	//   54  104:ishr            
	//   55  105:sipush          255
	//   56  108:iand            
	//   57  109:iadd            
	//   58  110:istore          14
				j4 = k1 + (j5 >> 16 & 0xff);
	//   59  112:iload           7
	//   60  114:iload           15
	//   61  116:bipush          16
	//   62  118:ishr            
	//   63  119:sipush          255
	//   64  122:iand            
	//   65  123:iadd            
	//   66  124:istore          13
				l3 = j1 + (j5 >> 8 & 0xff);
	//   67  126:iload           6
	//   68  128:iload           15
	//   69  130:bipush          8
	//   70  132:ishr            
	//   71  133:sipush          255
	//   72  136:iand            
	//   73  137:iadd            
	//   74  138:istore          12
				j3 = i1 + (j5 & 0xff);
	//   75  140:iload           5
	//   76  142:iload           15
	//   77  144:sipush          255
	//   78  147:iand            
	//   79  148:iadd            
	//   80  149:istore          11
				l2 = l + 1;
	//   81  151:iload           4
	//   82  153:iconst_1        
	//   83  154:iadd            
	//   84  155:istore          10
			}
			j2++;
	//   85  157:iload           9
	//   86  159:iconst_1        
	//   87  160:iadd            
	//   88  161:istore          9
			l1 = l4;
	//   89  163:iload           14
	//   90  165:istore          8
			k1 = j4;
	//   91  167:iload           13
	//   92  169:istore          7
			j1 = l3;
	//   93  171:iload           12
	//   94  173:istore          6
			i1 = j3;
	//   95  175:iload           11
	//   96  177:istore          5
		}

	//   97  179:iload           10
	//   98  181:istore          4
	//*  99  183:goto            22
		int k4 = i + k;
	//  100  186:iload_1         
	//  101  187:iload_3         
	//  102  188:iadd            
	//  103  189:istore          13
		i = k4;
	//  104  191:iload           13
	//  105  193:istore_1        
		int i3 = l1;
	//  106  194:iload           8
	//  107  196:istore          10
		while(i < sampleSize + k4) 
	//* 108  198:iload_1         
	//* 109  199:aload_0         
	//* 110  200:getfield        #95  <Field int sampleSize>
	//* 111  203:iload           13
	//* 112  205:iadd            
	//* 113  206:icmpge          352
		{
			byte abyte1[] = mainPixels;
	//  114  209:aload_0         
	//  115  210:getfield        #97  <Field byte[] mainPixels>
	//  116  213:astore          16
			if(i >= abyte1.length || i >= j)
				break;
	//  117  215:iload_1         
	//  118  216:aload           16
	//  119  218:arraylength     
	//  120  219:icmpge          352
	//  121  222:iload_1         
	//  122  223:iload_2         
	//  123  224:icmpge          352
			k = ((int) (abyte1[i]));
	//  124  227:aload           16
	//  125  229:iload_1         
	//  126  230:baload          
	//  127  231:istore_3        
			int i5 = act[k & 0xff];
	//  128  232:aload_0         
	//  129  233:getfield        #99  <Field int[] act>
	//  130  236:iload_3         
	//  131  237:sipush          255
	//  132  240:iand            
	//  133  241:iaload          
	//  134  242:istore          14
			int i4 = i3;
	//  135  244:iload           10
	//  136  246:istore          12
			int k3 = k1;
	//  137  248:iload           7
	//  138  250:istore          11
			int k2 = j1;
	//  139  252:iload           6
	//  140  254:istore          9
			int i2 = i1;
	//  141  256:iload           5
	//  142  258:istore          8
			k = l;
	//  143  260:iload           4
	//  144  262:istore_3        
			if(i5 != 0)
	//* 145  263:iload           14
	//* 146  265:ifeq            326
			{
				i4 = i3 + (i5 >> 24 & 0xff);
	//  147  268:iload           10
	//  148  270:iload           14
	//  149  272:bipush          24
	//  150  274:ishr            
	//  151  275:sipush          255
	//  152  278:iand            
	//  153  279:iadd            
	//  154  280:istore          12
				k3 = k1 + (i5 >> 16 & 0xff);
	//  155  282:iload           7
	//  156  284:iload           14
	//  157  286:bipush          16
	//  158  288:ishr            
	//  159  289:sipush          255
	//  160  292:iand            
	//  161  293:iadd            
	//  162  294:istore          11
				k2 = j1 + (i5 >> 8 & 0xff);
	//  163  296:iload           6
	//  164  298:iload           14
	//  165  300:bipush          8
	//  166  302:ishr            
	//  167  303:sipush          255
	//  168  306:iand            
	//  169  307:iadd            
	//  170  308:istore          9
				i2 = i1 + (i5 & 0xff);
	//  171  310:iload           5
	//  172  312:iload           14
	//  173  314:sipush          255
	//  174  317:iand            
	//  175  318:iadd            
	//  176  319:istore          8
				k = l + 1;
	//  177  321:iload           4
	//  178  323:iconst_1        
	//  179  324:iadd            
	//  180  325:istore_3        
			}
			i++;
	//  181  326:iload_1         
	//  182  327:iconst_1        
	//  183  328:iadd            
	//  184  329:istore_1        
			i3 = i4;
	//  185  330:iload           12
	//  186  332:istore          10
			k1 = k3;
	//  187  334:iload           11
	//  188  336:istore          7
			j1 = k2;
	//  189  338:iload           9
	//  190  340:istore          6
			i1 = i2;
	//  191  342:iload           8
	//  192  344:istore          5
			l = k;
	//  193  346:iload_3         
	//  194  347:istore          4
		}
	//* 195  349:goto            198
		if(l == 0)
	//* 196  352:iload           4
	//* 197  354:ifne            359
			return 0;
	//  198  357:iconst_0        
	//  199  358:ireturn         
		else
			return i3 / l << 24 | k1 / l << 16 | j1 / l << 8 | i1 / l;
	//  200  359:iload           10
	//  201  361:iload           4
	//  202  363:idiv            
	//  203  364:bipush          24
	//  204  366:ishl            
	//  205  367:iload           7
	//  206  369:iload           4
	//  207  371:idiv            
	//  208  372:bipush          16
	//  209  374:ishl            
	//  210  375:ior             
	//  211  376:iload           6
	//  212  378:iload           4
	//  213  380:idiv            
	//  214  381:bipush          8
	//  215  383:ishl            
	//  216  384:ior             
	//  217  385:iload           5
	//  218  387:iload           4
	//  219  389:idiv            
	//  220  390:ior             
	//  221  391:ireturn         
	}

	private void copyCopyIntoScratchRobust(GifFrame gifframe)
	{
		int ai[] = mainScratch;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field int[] mainScratch>
	//    2    4:astore          24
		int l2 = gifframe.ih / sampleSize;
	//    3    6:aload_1         
	//    4    7:getfield        #109 <Field int GifFrame.ih>
	//    5   10:aload_0         
	//    6   11:getfield        #95  <Field int sampleSize>
	//    7   14:idiv            
	//    8   15:istore          12
		int k2 = gifframe.iy / sampleSize;
	//    9   17:aload_1         
	//   10   18:getfield        #112 <Field int GifFrame.iy>
	//   11   21:aload_0         
	//   12   22:getfield        #95  <Field int sampleSize>
	//   13   25:idiv            
	//   14   26:istore          11
		int j2 = gifframe.iw / sampleSize;
	//   15   28:aload_1         
	//   16   29:getfield        #115 <Field int GifFrame.iw>
	//   17   32:aload_0         
	//   18   33:getfield        #95  <Field int sampleSize>
	//   19   36:idiv            
	//   20   37:istore          10
		int l3 = gifframe.ix / sampleSize;
	//   21   39:aload_1         
	//   22   40:getfield        #118 <Field int GifFrame.ix>
	//   23   43:aload_0         
	//   24   44:getfield        #95  <Field int sampleSize>
	//   25   47:idiv            
	//   26   48:istore          16
		boolean flag1;
		if(framePointer == 0)
	//*  27   50:aload_0         
	//*  28   51:getfield        #120 <Field int framePointer>
	//*  29   54:ifne            63
			flag1 = true;
	//   30   57:iconst_1        
	//   31   58:istore          9
		else
	//*  32   60:goto            66
			flag1 = false;
	//   33   63:iconst_0        
	//   34   64:istore          9
		int i4 = sampleSize;
	//   35   66:aload_0         
	//   36   67:getfield        #95  <Field int sampleSize>
	//   37   70:istore          17
		int j4 = downsampledWidth;
	//   38   72:aload_0         
	//   39   73:getfield        #122 <Field int downsampledWidth>
	//   40   76:istore          18
		int k4 = downsampledHeight;
	//   41   78:aload_0         
	//   42   79:getfield        #124 <Field int downsampledHeight>
	//   43   82:istore          19
		byte abyte0[] = mainPixels;
	//   44   84:aload_0         
	//   45   85:getfield        #97  <Field byte[] mainPixels>
	//   46   88:astore          25
		int ai1[] = act;
	//   47   90:aload_0         
	//   48   91:getfield        #99  <Field int[] act>
	//   49   94:astore          26
		Boolean boolean1 = isFirstFrameTransparent;
	//   50   96:aload_0         
	//   51   97:getfield        #126 <Field Boolean isFirstFrameTransparent>
	//   52  100:astore          22
		int k1 = 8;
	//   53  102:bipush          8
	//   54  104:istore          6
		int j = 0;
	//   55  106:iconst_0        
	//   56  107:istore_3        
		int l1 = 1;
	//   57  108:iconst_1        
	//   58  109:istore          7
		for(int j1 = 0; j1 < l2;)
	//*  59  111:iconst_0        
	//*  60  112:istore          5
	//*  61  114:iload           5
	//*  62  116:iload           12
	//*  63  118:icmpge          520
		{
			int i;
			int i2;
			if(gifframe.interlace)
	//*  64  121:aload_1         
	//*  65  122:getfield        #129 <Field boolean GifFrame.interlace>
	//*  66  125:ifeq            233
			{
				i = j;
	//   67  128:iload_3         
	//   68  129:istore_2        
				i2 = l1;
	//   69  130:iload           7
	//   70  132:istore          8
				int k = k1;
	//   71  134:iload           6
	//   72  136:istore          4
				if(j >= l2)
	//*  73  138:iload_3         
	//*  74  139:iload           12
	//*  75  141:icmplt          211
				{
					i2 = l1 + 1;
	//   76  144:iload           7
	//   77  146:iconst_1        
	//   78  147:iadd            
	//   79  148:istore          8
					switch(i2)
	//*  80  150:iload           8
					{
	//*  81  152:tableswitch     2 4: default 180
	//	               2 205
	//	               3 197
	//	               4 189
					default:
						i = j;
	//   82  180:iload_3         
	//   83  181:istore_2        
						k = k1;
	//   84  182:iload           6
	//   85  184:istore          4
						break;

	//*  86  186:goto            211
					case 4: // '\004'
						k = 2;
	//   87  189:iconst_2        
	//   88  190:istore          4
						i = 1;
	//   89  192:iconst_1        
	//   90  193:istore_2        
						break;

	//*  91  194:goto            211
					case 3: // '\003'
						i = 2;
	//   92  197:iconst_2        
	//   93  198:istore_2        
						k = 4;
	//   94  199:iconst_4        
	//   95  200:istore          4
						break;

	//*  96  202:goto            211
					case 2: // '\002'
						i = 4;
	//   97  205:iconst_4        
	//   98  206:istore_2        
						k = k1;
	//   99  207:iload           6
	//  100  209:istore          4
						break;
					}
				}
				k1 = i + k;
	//  101  211:iload_2         
	//  102  212:iload           4
	//  103  214:iadd            
	//  104  215:istore          6
				j = i;
	//  105  217:iload_2         
	//  106  218:istore_3        
				i = k1;
	//  107  219:iload           6
	//  108  221:istore_2        
				l1 = i2;
	//  109  222:iload           8
	//  110  224:istore          7
				i2 = k;
	//  111  226:iload           4
	//  112  228:istore          8
			} else
	//* 113  230:goto            242
			{
				i = j;
	//  114  233:iload_3         
	//  115  234:istore_2        
				j = j1;
	//  116  235:iload           5
	//  117  237:istore_3        
				i2 = k1;
	//  118  238:iload           6
	//  119  240:istore          8
			}
			j += k2;
	//  120  242:iload_3         
	//  121  243:iload           11
	//  122  245:iadd            
	//  123  246:istore_3        
			boolean flag;
			if(i4 == 1)
	//* 124  247:iload           17
	//* 125  249:iconst_1        
	//* 126  250:icmpne          259
				flag = true;
	//  127  253:iconst_1        
	//  128  254:istore          4
			else
	//* 129  256:goto            262
				flag = false;
	//  130  259:iconst_0        
	//  131  260:istore          4
			if(j < k4)
	//* 132  262:iload_3         
	//* 133  263:iload           19
	//* 134  265:icmpge          505
			{
				j *= j4;
	//  135  268:iload_3         
	//  136  269:iload           18
	//  137  271:imul            
	//  138  272:istore_3        
				int i3 = j + l3;
	//  139  273:iload_3         
	//  140  274:iload           16
	//  141  276:iadd            
	//  142  277:istore          13
				k1 = i3 + j2;
	//  143  279:iload           13
	//  144  281:iload           10
	//  145  283:iadd            
	//  146  284:istore          6
				int j3 = j + j4;
	//  147  286:iload_3         
	//  148  287:iload           18
	//  149  289:iadd            
	//  150  290:istore          14
				j = k1;
	//  151  292:iload           6
	//  152  294:istore_3        
				if(j3 < k1)
	//* 153  295:iload           14
	//* 154  297:iload           6
	//* 155  299:icmpge          305
					j = j3;
	//  156  302:iload           14
	//  157  304:istore_3        
				j3 = j1 * i4 * gifframe.iw;
	//  158  305:iload           5
	//  159  307:iload           17
	//  160  309:imul            
	//  161  310:aload_1         
	//  162  311:getfield        #115 <Field int GifFrame.iw>
	//  163  314:imul            
	//  164  315:istore          14
				if(flag)
	//* 165  317:iload           4
	//* 166  319:ifeq            412
				{
					for(int l = i3; l < j;)
	//* 167  322:iload           13
	//* 168  324:istore          4
	//* 169  326:iload           4
	//* 170  328:iload_3         
	//* 171  329:icmpge          409
					{
						k1 = ai1[abyte0[j3] & 0xff];
	//  172  332:aload           26
	//  173  334:aload           25
	//  174  336:iload           14
	//  175  338:baload          
	//  176  339:sipush          255
	//  177  342:iand            
	//  178  343:iaload          
	//  179  344:istore          6
						Boolean boolean2;
						if(k1 != 0)
	//* 180  346:iload           6
	//* 181  348:ifeq            365
						{
							ai[l] = k1;
	//  182  351:aload           24
	//  183  353:iload           4
	//  184  355:iload           6
	//  185  357:iastore         
							boolean2 = boolean1;
	//  186  358:aload           22
	//  187  360:astore          23
						} else
	//* 188  362:goto            389
						{
							boolean2 = boolean1;
	//  189  365:aload           22
	//  190  367:astore          23
							if(flag1)
	//* 191  369:iload           9
	//* 192  371:ifeq            389
							{
								boolean2 = boolean1;
	//  193  374:aload           22
	//  194  376:astore          23
								if(boolean1 == null)
	//* 195  378:aload           22
	//* 196  380:ifnonnull       389
									boolean2 = Boolean.valueOf(true);
	//  197  383:iconst_1        
	//  198  384:invokestatic    #135 <Method Boolean Boolean.valueOf(boolean)>
	//  199  387:astore          23
							}
						}
						j3 += i4;
	//  200  389:iload           14
	//  201  391:iload           17
	//  202  393:iadd            
	//  203  394:istore          14
						l++;
	//  204  396:iload           4
	//  205  398:iconst_1        
	//  206  399:iadd            
	//  207  400:istore          4
						boolean1 = boolean2;
	//  208  402:aload           23
	//  209  404:astore          22
					}

				} else
	//* 210  406:goto            326
	//* 211  409:goto            505
				{
					int k3 = i3;
	//  212  412:iload           13
	//  213  414:istore          15
					k1 = j3;
	//  214  416:iload           14
	//  215  418:istore          6
					for(int i1 = j; k3 < i1; k3++)
	//* 216  420:iload_3         
	//* 217  421:istore          4
	//* 218  423:iload           15
	//* 219  425:iload           4
	//* 220  427:icmpge          502
					{
						int l4 = averageColorsNear(k1, (j - i3) * i4 + j3, gifframe.iw);
	//  221  430:aload_0         
	//  222  431:iload           6
	//  223  433:iload_3         
	//  224  434:iload           13
	//  225  436:isub            
	//  226  437:iload           17
	//  227  439:imul            
	//  228  440:iload           14
	//  229  442:iadd            
	//  230  443:aload_1         
	//  231  444:getfield        #115 <Field int GifFrame.iw>
	//  232  447:invokespecial   #137 <Method int averageColorsNear(int, int, int)>
	//  233  450:istore          20
						if(l4 != 0)
	//* 234  452:iload           20
	//* 235  454:ifeq            467
							ai[k3] = l4;
	//  236  457:aload           24
	//  237  459:iload           15
	//  238  461:iload           20
	//  239  463:iastore         
						else
	//* 240  464:goto            486
						if(flag1 && boolean1 == null)
	//* 241  467:iload           9
	//* 242  469:ifeq            486
	//* 243  472:aload           22
	//* 244  474:ifnonnull       486
							boolean1 = Boolean.valueOf(true);
	//  245  477:iconst_1        
	//  246  478:invokestatic    #135 <Method Boolean Boolean.valueOf(boolean)>
	//  247  481:astore          22
	//* 248  483:goto            486
						k1 += i4;
	//  249  486:iload           6
	//  250  488:iload           17
	//  251  490:iadd            
	//  252  491:istore          6
					}

	//  253  493:iload           15
	//  254  495:iconst_1        
	//  255  496:iadd            
	//  256  497:istore          15
				}
			}
	//* 257  499:goto            423
	//* 258  502:goto            505
			j1++;
	//  259  505:iload           5
	//  260  507:iconst_1        
	//  261  508:iadd            
	//  262  509:istore          5
			j = i;
	//  263  511:iload_2         
	//  264  512:istore_3        
			k1 = i2;
	//  265  513:iload           8
	//  266  515:istore          6
		}

	//* 267  517:goto            114
		if(isFirstFrameTransparent == null)
	//* 268  520:aload_0         
	//* 269  521:getfield        #126 <Field Boolean isFirstFrameTransparent>
	//* 270  524:ifnonnull       554
		{
			boolean flag2;
			if(boolean1 == null)
	//* 271  527:aload           22
	//* 272  529:ifnonnull       538
				flag2 = false;
	//  273  532:iconst_0        
	//  274  533:istore          21
			else
	//* 275  535:goto            545
				flag2 = boolean1.booleanValue();
	//  276  538:aload           22
	//  277  540:invokevirtual   #141 <Method boolean Boolean.booleanValue()>
	//  278  543:istore          21
			isFirstFrameTransparent = Boolean.valueOf(flag2);
	//  279  545:aload_0         
	//  280  546:iload           21
	//  281  548:invokestatic    #135 <Method Boolean Boolean.valueOf(boolean)>
	//  282  551:putfield        #126 <Field Boolean isFirstFrameTransparent>
		}
	//  283  554:return          
	}

	private void copyIntoScratchFast(GifFrame gifframe)
	{
		GifFrame gifframe1 = gifframe;
	//    0    0:aload_1         
	//    1    1:astore          17
		int ai[] = mainScratch;
	//    2    3:aload_0         
	//    3    4:getfield        #104 <Field int[] mainScratch>
	//    4    7:astore          18
		int l1 = gifframe1.ih;
	//    5    9:aload           17
	//    6   11:getfield        #109 <Field int GifFrame.ih>
	//    7   14:istore          10
		int i2 = gifframe1.iy;
	//    8   16:aload           17
	//    9   18:getfield        #112 <Field int GifFrame.iy>
	//   10   21:istore          11
		int j2 = gifframe1.iw;
	//   11   23:aload           17
	//   12   25:getfield        #115 <Field int GifFrame.iw>
	//   13   28:istore          12
		int k2 = gifframe1.ix;
	//   14   30:aload           17
	//   15   32:getfield        #118 <Field int GifFrame.ix>
	//   16   35:istore          13
		boolean flag;
		if(framePointer == 0)
	//*  17   37:aload_0         
	//*  18   38:getfield        #120 <Field int framePointer>
	//*  19   41:ifne            49
			flag = true;
	//   20   44:iconst_1        
	//   21   45:istore_2        
		else
	//*  22   46:goto            51
			flag = false;
	//   23   49:iconst_0        
	//   24   50:istore_2        
		int l2 = downsampledWidth;
	//   25   51:aload_0         
	//   26   52:getfield        #122 <Field int downsampledWidth>
	//   27   55:istore          14
		byte abyte0[] = mainPixels;
	//   28   57:aload_0         
	//   29   58:getfield        #97  <Field byte[] mainPixels>
	//   30   61:astore          17
		int ai1[] = act;
	//   31   63:aload_0         
	//   32   64:getfield        #99  <Field int[] act>
	//   33   67:astore          19
		int i = 0;
	//   34   69:iconst_0        
	//   35   70:istore_3        
		int k = -1;
	//   36   71:iconst_m1       
	//   37   72:istore          5
		for(; i < l1; i++)
	//*  38   74:iload_3         
	//*  39   75:iload           10
	//*  40   77:icmpge          222
		{
			int j = (i + i2) * l2;
	//   41   80:iload_3         
	//   42   81:iload           11
	//   43   83:iadd            
	//   44   84:iload           14
	//   45   86:imul            
	//   46   87:istore          4
			int i1 = j + k2;
	//   47   89:iload           4
	//   48   91:iload           13
	//   49   93:iadd            
	//   50   94:istore          7
			int l = i1 + j2;
	//   51   96:iload           7
	//   52   98:iload           12
	//   53  100:iadd            
	//   54  101:istore          6
			int j1 = j + l2;
	//   55  103:iload           4
	//   56  105:iload           14
	//   57  107:iadd            
	//   58  108:istore          8
			j = l;
	//   59  110:iload           6
	//   60  112:istore          4
			if(j1 < l)
	//*  61  114:iload           8
	//*  62  116:iload           6
	//*  63  118:icmpge          125
				j = j1;
	//   64  121:iload           8
	//   65  123:istore          4
			l = gifframe.iw * i;
	//   66  125:aload_1         
	//   67  126:getfield        #115 <Field int GifFrame.iw>
	//   68  129:iload_3         
	//   69  130:imul            
	//   70  131:istore          6
			while(i1 < j) 
	//*  71  133:iload           7
	//*  72  135:iload           4
	//*  73  137:icmpge          215
			{
				byte byte0 = abyte0[l];
	//   74  140:aload           17
	//   75  142:iload           6
	//   76  144:baload          
	//   77  145:istore          9
				int i3 = byte0 & 0xff;
	//   78  147:iload           9
	//   79  149:sipush          255
	//   80  152:iand            
	//   81  153:istore          15
				int k1 = k;
	//   82  155:iload           5
	//   83  157:istore          8
				if(i3 != k)
	//*  84  159:iload           15
	//*  85  161:iload           5
	//*  86  163:icmpeq          196
				{
					k1 = ai1[i3];
	//   87  166:aload           19
	//   88  168:iload           15
	//   89  170:iaload          
	//   90  171:istore          8
					if(k1 != 0)
	//*  91  173:iload           8
	//*  92  175:ifeq            192
					{
						ai[i1] = k1;
	//   93  178:aload           18
	//   94  180:iload           7
	//   95  182:iload           8
	//   96  184:iastore         
						k1 = k;
	//   97  185:iload           5
	//   98  187:istore          8
					} else
	//*  99  189:goto            196
					{
						k1 = ((int) (byte0));
	//  100  192:iload           9
	//  101  194:istore          8
					}
				}
				l++;
	//  102  196:iload           6
	//  103  198:iconst_1        
	//  104  199:iadd            
	//  105  200:istore          6
				i1++;
	//  106  202:iload           7
	//  107  204:iconst_1        
	//  108  205:iadd            
	//  109  206:istore          7
				k = k1;
	//  110  208:iload           8
	//  111  210:istore          5
			}
		}

	//  112  212:goto            133
	//  113  215:iload_3         
	//  114  216:iconst_1        
	//  115  217:iadd            
	//  116  218:istore_3        
	//* 117  219:goto            74
		boolean flag1;
		if(isFirstFrameTransparent == null && flag && k != -1)
	//* 118  222:aload_0         
	//* 119  223:getfield        #126 <Field Boolean isFirstFrameTransparent>
	//* 120  226:ifnonnull       245
	//* 121  229:iload_2         
	//* 122  230:ifeq            245
	//* 123  233:iload           5
	//* 124  235:iconst_m1       
	//* 125  236:icmpeq          245
			flag1 = true;
	//  126  239:iconst_1        
	//  127  240:istore          16
		else
	//* 128  242:goto            248
			flag1 = false;
	//  129  245:iconst_0        
	//  130  246:istore          16
		isFirstFrameTransparent = Boolean.valueOf(flag1);
	//  131  248:aload_0         
	//  132  249:iload           16
	//  133  251:invokestatic    #135 <Method Boolean Boolean.valueOf(boolean)>
	//  134  254:putfield        #126 <Field Boolean isFirstFrameTransparent>
	//  135  257:return          
	}

	private void decodeBitmapData(GifFrame gifframe)
	{
		StandardGifDecoder standardgifdecoder = this;
	//    0    0:aload_0         
	//    1    1:astore          24
		if(gifframe != null)
	//*   2    3:aload_1         
	//*   3    4:ifnull          20
			standardgifdecoder.rawData.position(gifframe.bufferFrameStart);
	//    4    7:aload           24
	//    5    9:getfield        #145 <Field ByteBuffer rawData>
	//    6   12:aload_1         
	//    7   13:getfield        #148 <Field int GifFrame.bufferFrameStart>
	//    8   16:invokevirtual   #154 <Method java.nio.Buffer ByteBuffer.position(int)>
	//    9   19:pop             
		int j3;
		if(gifframe == null)
	//*  10   20:aload_1         
	//*  11   21:ifnonnull       46
		{
			j3 = standardgifdecoder.header.width * standardgifdecoder.header.height;
	//   12   24:aload           24
	//   13   26:getfield        #80  <Field GifHeader header>
	//   14   29:getfield        #157 <Field int GifHeader.width>
	//   15   32:aload           24
	//   16   34:getfield        #80  <Field GifHeader header>
	//   17   37:getfield        #160 <Field int GifHeader.height>
	//   18   40:imul            
	//   19   41:istore          15
		} else
	//*  20   43:goto            59
		{
			int i = gifframe.iw;
	//   21   46:aload_1         
	//   22   47:getfield        #115 <Field int GifFrame.iw>
	//   23   50:istore_3        
			j3 = gifframe.ih * i;
	//   24   51:aload_1         
	//   25   52:getfield        #109 <Field int GifFrame.ih>
	//   26   55:iload_3         
	//   27   56:imul            
	//   28   57:istore          15
		}
		gifframe = ((GifFrame) (standardgifdecoder.mainPixels));
	//   29   59:aload           24
	//   30   61:getfield        #97  <Field byte[] mainPixels>
	//   31   64:astore_1        
		if(gifframe == null || gifframe.length < j3)
	//*  32   65:aload_1         
	//*  33   66:ifnull          76
	//*  34   69:aload_1         
	//*  35   70:arraylength     
	//*  36   71:iload           15
	//*  37   73:icmpge          93
			standardgifdecoder.mainPixels = standardgifdecoder.bitmapProvider.obtainByteArray(j3);
	//   38   76:aload           24
	//   39   78:aload           24
	//   40   80:getfield        #75  <Field GifDecoder$BitmapProvider bitmapProvider>
	//   41   83:iload           15
	//   42   85:invokeinterface #166 <Method byte[] GifDecoder$BitmapProvider.obtainByteArray(int)>
	//   43   90:putfield        #97  <Field byte[] mainPixels>
		byte abyte0[] = standardgifdecoder.mainPixels;
	//   44   93:aload           24
	//   45   95:getfield        #97  <Field byte[] mainPixels>
	//   46   98:astore          25
		if(standardgifdecoder.prefix == null)
	//*  47  100:aload           24
	//*  48  102:getfield        #168 <Field short[] prefix>
	//*  49  105:ifnonnull       118
			standardgifdecoder.prefix = new short[4096];
	//   50  108:aload           24
	//   51  110:sipush          4096
	//   52  113:newarray        short[]
	//   53  115:putfield        #168 <Field short[] prefix>
		short aword0[] = standardgifdecoder.prefix;
	//   54  118:aload           24
	//   55  120:getfield        #168 <Field short[] prefix>
	//   56  123:astore          26
		if(standardgifdecoder.suffix == null)
	//*  57  125:aload           24
	//*  58  127:getfield        #170 <Field byte[] suffix>
	//*  59  130:ifnonnull       143
			standardgifdecoder.suffix = new byte[4096];
	//   60  133:aload           24
	//   61  135:sipush          4096
	//   62  138:newarray        byte[]
	//   63  140:putfield        #170 <Field byte[] suffix>
		byte abyte1[] = standardgifdecoder.suffix;
	//   64  143:aload           24
	//   65  145:getfield        #170 <Field byte[] suffix>
	//   66  148:astore          27
		if(standardgifdecoder.pixelStack == null)
	//*  67  150:aload           24
	//*  68  152:getfield        #172 <Field byte[] pixelStack>
	//*  69  155:ifnonnull       168
			standardgifdecoder.pixelStack = new byte[4097];
	//   70  158:aload           24
	//   71  160:sipush          4097
	//   72  163:newarray        byte[]
	//   73  165:putfield        #172 <Field byte[] pixelStack>
		byte abyte2[] = standardgifdecoder.pixelStack;
	//   74  168:aload           24
	//   75  170:getfield        #172 <Field byte[] pixelStack>
	//   76  173:astore          28
		int j = readByte();
	//   77  175:aload_0         
	//   78  176:invokespecial   #176 <Method int readByte()>
	//   79  179:istore_3        
		int j5 = 1 << j;
	//   80  180:iconst_1        
	//   81  181:iload_3         
	//   82  182:ishl            
	//   83  183:istore          23
		int k3 = j5 + 2;
	//   84  185:iload           23
	//   85  187:iconst_2        
	//   86  188:iadd            
	//   87  189:istore          16
		int i4 = j + 1;
	//   88  191:iload_3         
	//   89  192:iconst_1        
	//   90  193:iadd            
	//   91  194:istore          18
		int l3 = (1 << i4) - 1;
	//   92  196:iconst_1        
	//   93  197:iload           18
	//   94  199:ishl            
	//   95  200:iconst_1        
	//   96  201:isub            
	//   97  202:istore          17
		boolean flag = false;
	//   98  204:iconst_0        
	//   99  205:istore          19
		for(j = 0; j < j5; j++)
	//* 100  207:iconst_0        
	//* 101  208:istore_3        
	//* 102  209:iload_3         
	//* 103  210:iload           23
	//* 104  212:icmpge          233
		{
			aword0[j] = 0;
	//  105  215:aload           26
	//  106  217:iload_3         
	//  107  218:iconst_0        
	//  108  219:sastore         
			abyte1[j] = (byte)j;
	//  109  220:aload           27
	//  110  222:iload_3         
	//  111  223:iload_3         
	//  112  224:int2byte        
	//  113  225:bastore         
		}

	//  114  226:iload_3         
	//  115  227:iconst_1        
	//  116  228:iadd            
	//  117  229:istore_3        
	//* 118  230:goto            209
		byte abyte3[] = standardgifdecoder.block;
	//  119  233:aload           24
	//  120  235:getfield        #178 <Field byte[] block>
	//  121  238:astore          29
		int l = i4;
	//  122  240:iload           18
	//  123  242:istore          5
		int k1 = k3;
	//  124  244:iload           16
	//  125  246:istore          8
		int i2 = l3;
	//  126  248:iload           17
	//  127  250:istore          10
		int j2 = 0;
	//  128  252:iconst_0        
	//  129  253:istore          11
		int l1 = j2;
	//  130  255:iload           11
	//  131  257:istore          9
		int i3 = l1;
	//  132  259:iload           9
	//  133  261:istore          14
		int l2 = i3;
	//  134  263:iload           14
	//  135  265:istore          13
		int k = l2;
	//  136  267:iload           13
	//  137  269:istore          4
		int j1 = k;
	//  138  271:iload           4
	//  139  273:istore          7
		int k2 = j1;
	//  140  275:iload           7
	//  141  277:istore          12
		int i1 = -1;
	//  142  279:iconst_m1       
	//  143  280:istore          6
		j = ((int) (flag));
	//  144  282:iload           19
	//  145  284:istore_3        
		gifframe = ((GifFrame) (standardgifdecoder));
	//  146  285:aload           24
	//  147  287:astore_1        
label0:
		do
		{
			if(j >= j3)
				break;
	//  148  288:iload_3         
	//  149  289:iload           15
	//  150  291:icmpge          844
			int j4 = j2;
	//  151  294:iload           11
	//  152  296:istore          19
			if(j2 == 0)
	//* 153  298:iload           11
	//* 154  300:ifne            325
			{
				j4 = readBlock();
	//  155  303:aload_0         
	//  156  304:invokespecial   #181 <Method int readBlock()>
	//  157  307:istore          19
				if(j4 <= 0)
	//* 158  309:iload           19
	//* 159  311:ifgt            322
				{
					gifframe.status = 3;
	//  160  314:aload_1         
	//  161  315:iconst_3        
	//  162  316:putfield        #183 <Field int status>
					break;
	//  163  319:goto            844
				}
				l2 = 0;
	//  164  322:iconst_0        
	//  165  323:istore          13
			}
			i3 += (abyte3[l2] & 0xff) << l1;
	//  166  325:iload           14
	//  167  327:aload           29
	//  168  329:iload           13
	//  169  331:baload          
	//  170  332:sipush          255
	//  171  335:iand            
	//  172  336:iload           9
	//  173  338:ishl            
	//  174  339:iadd            
	//  175  340:istore          14
			int k4 = l2 + 1;
	//  176  342:iload           13
	//  177  344:iconst_1        
	//  178  345:iadd            
	//  179  346:istore          20
			int l4 = j4 - 1;
	//  180  348:iload           19
	//  181  350:iconst_1        
	//  182  351:isub            
	//  183  352:istore          21
			l2 = l1 + 8;
	//  184  354:iload           9
	//  185  356:bipush          8
	//  186  358:iadd            
	//  187  359:istore          13
			l1 = i1;
	//  188  361:iload           6
	//  189  363:istore          9
			i1 = j1;
	//  190  365:iload           7
	//  191  367:istore          6
			j2 = k1;
	//  192  369:iload           8
	//  193  371:istore          11
			j1 = k;
	//  194  373:iload           4
	//  195  375:istore          7
			k1 = i1;
	//  196  377:iload           6
	//  197  379:istore          8
			k = j2;
	//  198  381:iload           11
	//  199  383:istore          4
			i1 = j;
	//  200  385:iload_3         
	//  201  386:istore          6
			j = l1;
	//  202  388:iload           9
	//  203  390:istore_3        
			j2 = i4;
	//  204  391:iload           18
	//  205  393:istore          11
			l1 = l2;
	//  206  395:iload           13
	//  207  397:istore          9
			do
			{
				if(l1 < l)
					break;
	//  208  399:iload           9
	//  209  401:iload           5
	//  210  403:icmplt          801
				l2 = i3 & i2;
	//  211  406:iload           14
	//  212  408:iload           10
	//  213  410:iand            
	//  214  411:istore          13
				i3 >>= l;
	//  215  413:iload           14
	//  216  415:iload           5
	//  217  417:ishr            
	//  218  418:istore          14
				l1 -= l;
	//  219  420:iload           9
	//  220  422:iload           5
	//  221  424:isub            
	//  222  425:istore          9
				if(l2 == j5)
	//* 223  427:iload           13
	//* 224  429:iload           23
	//* 225  431:icmpne          451
				{
					l = j2;
	//  226  434:iload           11
	//  227  436:istore          5
					k = k3;
	//  228  438:iload           16
	//  229  440:istore          4
					i2 = l3;
	//  230  442:iload           17
	//  231  444:istore          10
					j = -1;
	//  232  446:iconst_m1       
	//  233  447:istore_3        
					continue;
	//  234  448:goto            399
				}
				if(l2 == j5 + 1)
	//* 235  451:iload           13
	//* 236  453:iload           23
	//* 237  455:iconst_1        
	//* 238  456:iadd            
	//* 239  457:icmpne          501
				{
					l2 = i1;
	//  240  460:iload           6
	//  241  462:istore          13
					j4 = k;
	//  242  464:iload           4
	//  243  466:istore          19
					i1 = j;
	//  244  468:iload_3         
	//  245  469:istore          6
					i4 = j2;
	//  246  471:iload           11
	//  247  473:istore          18
					j = l2;
	//  248  475:iload           13
	//  249  477:istore_3        
					j2 = l4;
	//  250  478:iload           21
	//  251  480:istore          11
					l2 = k4;
	//  252  482:iload           20
	//  253  484:istore          13
					k = j1;
	//  254  486:iload           7
	//  255  488:istore          4
					j1 = k1;
	//  256  490:iload           8
	//  257  492:istore          7
					k1 = j4;
	//  258  494:iload           19
	//  259  496:istore          8
					continue label0;
	//  260  498:goto            288
				}
				if(j == -1)
	//* 261  501:iload_3         
	//* 262  502:iconst_m1       
	//* 263  503:icmpne          539
				{
					abyte0[j1] = abyte1[l2];
	//  264  506:aload           25
	//  265  508:iload           7
	//  266  510:aload           27
	//  267  512:iload           13
	//  268  514:baload          
	//  269  515:bastore         
					j1++;
	//  270  516:iload           7
	//  271  518:iconst_1        
	//  272  519:iadd            
	//  273  520:istore          7
					i1++;
	//  274  522:iload           6
	//  275  524:iconst_1        
	//  276  525:iadd            
	//  277  526:istore          6
					j = l2;
	//  278  528:iload           13
	//  279  530:istore_3        
					k1 = j;
	//  280  531:iload_3         
	//  281  532:istore          8
					gifframe = ((GifFrame) (this));
	//  282  534:aload_0         
	//  283  535:astore_1        
				} else
	//* 284  536:goto            399
				{
					i4 = k;
	//  285  539:iload           4
	//  286  541:istore          18
					if(l2 >= i4)
	//* 287  543:iload           13
	//* 288  545:iload           18
	//* 289  547:icmplt          570
					{
						abyte2[k2] = (byte)k1;
	//  290  550:aload           28
	//  291  552:iload           12
	//  292  554:iload           8
	//  293  556:int2byte        
	//  294  557:bastore         
						k = k2 + 1;
	//  295  558:iload           12
	//  296  560:iconst_1        
	//  297  561:iadd            
	//  298  562:istore          4
						k1 = j;
	//  299  564:iload_3         
	//  300  565:istore          8
					} else
	//* 301  567:goto            578
					{
						k1 = l2;
	//  302  570:iload           13
	//  303  572:istore          8
						k = k2;
	//  304  574:iload           12
	//  305  576:istore          4
					}
					for(; k1 >= j5; k1 = ((int) (aword0[k1])))
	//* 306  578:iload           8
	//* 307  580:iload           23
	//* 308  582:icmplt          611
					{
						abyte2[k] = abyte1[k1];
	//  309  585:aload           28
	//  310  587:iload           4
	//  311  589:aload           27
	//  312  591:iload           8
	//  313  593:baload          
	//  314  594:bastore         
						k++;
	//  315  595:iload           4
	//  316  597:iconst_1        
	//  317  598:iadd            
	//  318  599:istore          4
					}

	//  319  601:aload           26
	//  320  603:iload           8
	//  321  605:saload          
	//  322  606:istore          8
	//* 323  608:goto            578
					int i5 = abyte1[k1] & 0xff;
	//  324  611:aload           27
	//  325  613:iload           8
	//  326  615:baload          
	//  327  616:sipush          255
	//  328  619:iand            
	//  329  620:istore          22
					byte byte0 = (byte)i5;
	//  330  622:iload           22
	//  331  624:int2byte        
	//  332  625:istore_2        
					abyte0[j1] = byte0;
	//  333  626:aload           25
	//  334  628:iload           7
	//  335  630:iload_2         
	//  336  631:bastore         
					j1++;
	//  337  632:iload           7
	//  338  634:iconst_1        
	//  339  635:iadd            
	//  340  636:istore          7
					for(i1++; k > 0; i1++)
	//* 341  638:iload           6
	//* 342  640:iconst_1        
	//* 343  641:iadd            
	//* 344  642:istore          6
	//* 345  644:iload           4
	//* 346  646:ifle            680
					{
						k--;
	//  347  649:iload           4
	//  348  651:iconst_1        
	//  349  652:isub            
	//  350  653:istore          4
						abyte0[j1] = abyte2[k];
	//  351  655:aload           25
	//  352  657:iload           7
	//  353  659:aload           28
	//  354  661:iload           4
	//  355  663:baload          
	//  356  664:bastore         
						j1++;
	//  357  665:iload           7
	//  358  667:iconst_1        
	//  359  668:iadd            
	//  360  669:istore          7
					}

	//  361  671:iload           6
	//  362  673:iconst_1        
	//  363  674:iadd            
	//  364  675:istore          6
	//* 365  677:goto            644
					k1 = i4;
	//  366  680:iload           18
	//  367  682:istore          8
					k2 = l;
	//  368  684:iload           5
	//  369  686:istore          12
					j4 = i2;
	//  370  688:iload           10
	//  371  690:istore          19
					if(i4 < 4096)
	//* 372  692:iload           18
	//* 373  694:sipush          4096
	//* 374  697:icmpge          769
					{
						aword0[i4] = (short)j;
	//  375  700:aload           26
	//  376  702:iload           18
	//  377  704:iload_3         
	//  378  705:int2short       
	//  379  706:sastore         
						abyte1[i4] = byte0;
	//  380  707:aload           27
	//  381  709:iload           18
	//  382  711:iload_2         
	//  383  712:bastore         
						j = i4 + 1;
	//  384  713:iload           18
	//  385  715:iconst_1        
	//  386  716:iadd            
	//  387  717:istore_3        
						k1 = j;
	//  388  718:iload_3         
	//  389  719:istore          8
						k2 = l;
	//  390  721:iload           5
	//  391  723:istore          12
						j4 = i2;
	//  392  725:iload           10
	//  393  727:istore          19
						if((j & i2) == 0)
	//* 394  729:iload_3         
	//* 395  730:iload           10
	//* 396  732:iand            
	//* 397  733:ifne            769
						{
							k1 = j;
	//  398  736:iload_3         
	//  399  737:istore          8
							k2 = l;
	//  400  739:iload           5
	//  401  741:istore          12
							j4 = i2;
	//  402  743:iload           10
	//  403  745:istore          19
							if(j < 4096)
	//* 404  747:iload_3         
	//* 405  748:sipush          4096
	//* 406  751:icmpge          769
							{
								k2 = l + 1;
	//  407  754:iload           5
	//  408  756:iconst_1        
	//  409  757:iadd            
	//  410  758:istore          12
								j4 = i2 + j;
	//  411  760:iload           10
	//  412  762:iload_3         
	//  413  763:iadd            
	//  414  764:istore          19
								k1 = j;
	//  415  766:iload_3         
	//  416  767:istore          8
							}
						}
					}
					j = l2;
	//  417  769:iload           13
	//  418  771:istore_3        
					l2 = i5;
	//  419  772:iload           22
	//  420  774:istore          13
					gifframe = ((GifFrame) (this));
	//  421  776:aload_0         
	//  422  777:astore_1        
					l = k2;
	//  423  778:iload           12
	//  424  780:istore          5
					k2 = k;
	//  425  782:iload           4
	//  426  784:istore          12
					i2 = j4;
	//  427  786:iload           19
	//  428  788:istore          10
					k = k1;
	//  429  790:iload           8
	//  430  792:istore          4
					k1 = l2;
	//  431  794:iload           13
	//  432  796:istore          8
				}
			} while(true);
	//  433  798:goto            399
			l2 = i1;
	//  434  801:iload           6
	//  435  803:istore          13
			j4 = k;
	//  436  805:iload           4
	//  437  807:istore          19
			i1 = j;
	//  438  809:iload_3         
	//  439  810:istore          6
			gifframe = ((GifFrame) (this));
	//  440  812:aload_0         
	//  441  813:astore_1        
			i4 = j2;
	//  442  814:iload           11
	//  443  816:istore          18
			j = l2;
	//  444  818:iload           13
	//  445  820:istore_3        
			j2 = l4;
	//  446  821:iload           21
	//  447  823:istore          11
			l2 = k4;
	//  448  825:iload           20
	//  449  827:istore          13
			k = j1;
	//  450  829:iload           7
	//  451  831:istore          4
			j1 = k1;
	//  452  833:iload           8
	//  453  835:istore          7
			k1 = j4;
	//  454  837:iload           19
	//  455  839:istore          8
		} while(true);
	//  456  841:goto            288
		Arrays.fill(abyte0, k, j3, (byte)0);
	//  457  844:aload           25
	//  458  846:iload           4
	//  459  848:iload           15
	//  460  850:iconst_0        
	//  461  851:invokestatic    #189 <Method void Arrays.fill(byte[], int, int, byte)>
	//  462  854:return          
	}

	private GifHeaderParser getHeaderParser()
	{
		if(parser == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #193 <Field GifHeaderParser parser>
	//*   2    4:ifnonnull       18
			parser = new GifHeaderParser();
	//    3    7:aload_0         
	//    4    8:new             #195 <Class GifHeaderParser>
	//    5   11:dup             
	//    6   12:invokespecial   #196 <Method void GifHeaderParser()>
	//    7   15:putfield        #193 <Field GifHeaderParser parser>
		return parser;
	//    8   18:aload_0         
	//    9   19:getfield        #193 <Field GifHeaderParser parser>
	//   10   22:areturn         
	}

	private Bitmap getNextBitmap()
	{
		Object obj = ((Object) (isFirstFrameTransparent));
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field Boolean isFirstFrameTransparent>
	//    2    4:astore_1        
		if(obj != null && !((Boolean) (obj)).booleanValue())
	//*   3    5:aload_1         
	//*   4    6:ifnull          27
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #141 <Method boolean Boolean.booleanValue()>
	//*   7   13:ifeq            19
	//*   8   16:goto            27
			obj = ((Object) (bitmapConfig));
	//    9   19:aload_0         
	//   10   20:getfield        #73  <Field android.graphics.Bitmap$Config bitmapConfig>
	//   11   23:astore_1        
		else
	//*  12   24:goto            31
			obj = ((Object) (android.graphics.Bitmap.Config.ARGB_8888));
	//   13   27:getstatic       #71  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   14   30:astore_1        
		obj = ((Object) (bitmapProvider.obtain(downsampledWidth, downsampledHeight, ((android.graphics.Bitmap.Config) (obj)))));
	//   15   31:aload_0         
	//   16   32:getfield        #75  <Field GifDecoder$BitmapProvider bitmapProvider>
	//   17   35:aload_0         
	//   18   36:getfield        #122 <Field int downsampledWidth>
	//   19   39:aload_0         
	//   20   40:getfield        #124 <Field int downsampledHeight>
	//   21   43:aload_1         
	//   22   44:invokeinterface #202 <Method Bitmap GifDecoder$BitmapProvider.obtain(int, int, android.graphics.Bitmap$Config)>
	//   23   49:astore_1        
		((Bitmap) (obj)).setHasAlpha(true);
	//   24   50:aload_1         
	//   25   51:iconst_1        
	//   26   52:invokevirtual   #208 <Method void Bitmap.setHasAlpha(boolean)>
		return ((Bitmap) (obj));
	//   27   55:aload_1         
	//   28   56:areturn         
	}

	private int readBlock()
	{
		int i = readByte();
	//    0    0:aload_0         
	//    1    1:invokespecial   #176 <Method int readByte()>
	//    2    4:istore_1        
		if(i <= 0)
	//*   3    5:iload_1         
	//*   4    6:ifgt            11
		{
			return i;
	//    5    9:iload_1         
	//    6   10:ireturn         
		} else
		{
			ByteBuffer bytebuffer = rawData;
	//    7   11:aload_0         
	//    8   12:getfield        #145 <Field ByteBuffer rawData>
	//    9   15:astore_2        
			bytebuffer.get(block, 0, Math.min(i, bytebuffer.remaining()));
	//   10   16:aload_2         
	//   11   17:aload_0         
	//   12   18:getfield        #178 <Field byte[] block>
	//   13   21:iconst_0        
	//   14   22:iload_1         
	//   15   23:aload_2         
	//   16   24:invokevirtual   #211 <Method int ByteBuffer.remaining()>
	//   17   27:invokestatic    #217 <Method int Math.min(int, int)>
	//   18   30:invokevirtual   #221 <Method ByteBuffer ByteBuffer.get(byte[], int, int)>
	//   19   33:pop             
			return i;
	//   20   34:iload_1         
	//   21   35:ireturn         
		}
	}

	private int readByte()
	{
		return rawData.get() & 0xff;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field ByteBuffer rawData>
	//    2    4:invokevirtual   #224 <Method byte ByteBuffer.get()>
	//    3    7:sipush          255
	//    4   10:iand            
	//    5   11:ireturn         
	}

	private Bitmap setPixels(GifFrame gifframe, GifFrame gifframe1)
	{
		int ai[] = mainScratch;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field int[] mainScratch>
	//    2    4:astore          10
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		if(gifframe1 == null)
	//*   5    8:aload_2         
	//*   6    9:ifnonnull       45
		{
			Bitmap bitmap = previousImage;
	//    7   12:aload_0         
	//    8   13:getfield        #228 <Field Bitmap previousImage>
	//    9   16:astore          11
			if(bitmap != null)
	//*  10   18:aload           11
	//*  11   20:ifnull          34
				bitmapProvider.release(bitmap);
	//   12   23:aload_0         
	//   13   24:getfield        #75  <Field GifDecoder$BitmapProvider bitmapProvider>
	//   14   27:aload           11
	//   15   29:invokeinterface #232 <Method void GifDecoder$BitmapProvider.release(Bitmap)>
			previousImage = null;
	//   16   34:aload_0         
	//   17   35:aconst_null     
	//   18   36:putfield        #228 <Field Bitmap previousImage>
			Arrays.fill(ai, 0);
	//   19   39:aload           10
	//   20   41:iconst_0        
	//   21   42:invokestatic    #235 <Method void Arrays.fill(int[], int)>
		}
		if(gifframe1 != null && gifframe1.dispose == 3 && previousImage == null)
	//*  22   45:aload_2         
	//*  23   46:ifnull          70
	//*  24   49:aload_2         
	//*  25   50:getfield        #238 <Field int GifFrame.dispose>
	//*  26   53:iconst_3        
	//*  27   54:icmpne          70
	//*  28   57:aload_0         
	//*  29   58:getfield        #228 <Field Bitmap previousImage>
	//*  30   61:ifnonnull       70
			Arrays.fill(ai, 0);
	//   31   64:aload           10
	//   32   66:iconst_0        
	//   33   67:invokestatic    #235 <Method void Arrays.fill(int[], int)>
		if(gifframe1 != null && gifframe1.dispose > 0)
	//*  34   70:aload_2         
	//*  35   71:ifnull          304
	//*  36   74:aload_2         
	//*  37   75:getfield        #238 <Field int GifFrame.dispose>
	//*  38   78:ifle            304
			if(gifframe1.dispose == 2)
	//*  39   81:aload_2         
	//*  40   82:getfield        #238 <Field int GifFrame.dispose>
	//*  41   85:iconst_2        
	//*  42   86:icmpne          267
			{
				int j;
				if(!gifframe.transparency)
	//*  43   89:aload_1         
	//*  44   90:getfield        #241 <Field boolean GifFrame.transparency>
	//*  45   93:ifne            135
				{
					j = header.bgColor;
	//   46   96:aload_0         
	//   47   97:getfield        #80  <Field GifHeader header>
	//   48  100:getfield        #244 <Field int GifHeader.bgColor>
	//   49  103:istore          4
					if(gifframe.lct != null && header.bgIndex == gifframe.transIndex)
	//*  50  105:aload_1         
	//*  51  106:getfield        #247 <Field int[] GifFrame.lct>
	//*  52  109:ifnull          132
	//*  53  112:aload_0         
	//*  54  113:getfield        #80  <Field GifHeader header>
	//*  55  116:getfield        #250 <Field int GifHeader.bgIndex>
	//*  56  119:aload_1         
	//*  57  120:getfield        #253 <Field int GifFrame.transIndex>
	//*  58  123:icmpne          132
						j = i;
	//   59  126:iload_3         
	//   60  127:istore          4
				} else
	//*  61  129:goto            156
	//*  62  132:goto            156
				{
					j = i;
	//   63  135:iload_3         
	//   64  136:istore          4
					if(framePointer == 0)
	//*  65  138:aload_0         
	//*  66  139:getfield        #120 <Field int framePointer>
	//*  67  142:ifne            156
					{
						isFirstFrameTransparent = Boolean.valueOf(true);
	//   68  145:aload_0         
	//   69  146:iconst_1        
	//   70  147:invokestatic    #135 <Method Boolean Boolean.valueOf(boolean)>
	//   71  150:putfield        #126 <Field Boolean isFirstFrameTransparent>
						j = i;
	//   72  153:iload_3         
	//   73  154:istore          4
					}
				}
				int j1 = gifframe1.ih / sampleSize;
	//   74  156:aload_2         
	//   75  157:getfield        #109 <Field int GifFrame.ih>
	//   76  160:aload_0         
	//   77  161:getfield        #95  <Field int sampleSize>
	//   78  164:idiv            
	//   79  165:istore          7
				i = gifframe1.iy / sampleSize;
	//   80  167:aload_2         
	//   81  168:getfield        #112 <Field int GifFrame.iy>
	//   82  171:aload_0         
	//   83  172:getfield        #95  <Field int sampleSize>
	//   84  175:idiv            
	//   85  176:istore_3        
				int k1 = gifframe1.iw / sampleSize;
	//   86  177:aload_2         
	//   87  178:getfield        #115 <Field int GifFrame.iw>
	//   88  181:aload_0         
	//   89  182:getfield        #95  <Field int sampleSize>
	//   90  185:idiv            
	//   91  186:istore          8
				int k = gifframe1.ix / sampleSize;
	//   92  188:aload_2         
	//   93  189:getfield        #118 <Field int GifFrame.ix>
	//   94  192:aload_0         
	//   95  193:getfield        #95  <Field int sampleSize>
	//   96  196:idiv            
	//   97  197:istore          5
				int l1 = downsampledWidth;
	//   98  199:aload_0         
	//   99  200:getfield        #122 <Field int downsampledWidth>
	//  100  203:istore          9
				int i1 = i * l1 + k;
	//  101  205:iload_3         
	//  102  206:iload           9
	//  103  208:imul            
	//  104  209:iload           5
	//  105  211:iadd            
	//  106  212:istore          6
				for(i = i1; i < j1 * l1 + i1; i += downsampledWidth)
	//* 107  214:iload           6
	//* 108  216:istore_3        
	//* 109  217:iload_3         
	//* 110  218:iload           7
	//* 111  220:iload           9
	//* 112  222:imul            
	//* 113  223:iload           6
	//* 114  225:iadd            
	//* 115  226:icmpge          304
				{
					for(int l = i; l < i + k1; l++)
	//* 116  229:iload_3         
	//* 117  230:istore          5
	//* 118  232:iload           5
	//* 119  234:iload_3         
	//* 120  235:iload           8
	//* 121  237:iadd            
	//* 122  238:icmpge          257
						ai[l] = j;
	//  123  241:aload           10
	//  124  243:iload           5
	//  125  245:iload           4
	//  126  247:iastore         

	//  127  248:iload           5
	//  128  250:iconst_1        
	//  129  251:iadd            
	//  130  252:istore          5
				}

	//  131  254:goto            232
	//  132  257:iload_3         
	//  133  258:aload_0         
	//  134  259:getfield        #122 <Field int downsampledWidth>
	//  135  262:iadd            
	//  136  263:istore_3        
			} else
	//* 137  264:goto            217
			if(gifframe1.dispose == 3)
	//* 138  267:aload_2         
	//* 139  268:getfield        #238 <Field int GifFrame.dispose>
	//* 140  271:iconst_3        
	//* 141  272:icmpne          304
			{
				gifframe1 = ((GifFrame) (previousImage));
	//  142  275:aload_0         
	//  143  276:getfield        #228 <Field Bitmap previousImage>
	//  144  279:astore_2        
				if(gifframe1 != null)
	//* 145  280:aload_2         
	//* 146  281:ifnull          304
				{
					i = downsampledWidth;
	//  147  284:aload_0         
	//  148  285:getfield        #122 <Field int downsampledWidth>
	//  149  288:istore_3        
					((Bitmap) (gifframe1)).getPixels(ai, 0, i, 0, 0, i, downsampledHeight);
	//  150  289:aload_2         
	//  151  290:aload           10
	//  152  292:iconst_0        
	//  153  293:iload_3         
	//  154  294:iconst_0        
	//  155  295:iconst_0        
	//  156  296:iload_3         
	//  157  297:aload_0         
	//  158  298:getfield        #124 <Field int downsampledHeight>
	//  159  301:invokevirtual   #257 <Method void Bitmap.getPixels(int[], int, int, int, int, int, int)>
				}
			}
		decodeBitmapData(gifframe);
	//  160  304:aload_0         
	//  161  305:aload_1         
	//  162  306:invokespecial   #259 <Method void decodeBitmapData(GifFrame)>
		if(!gifframe.interlace && sampleSize == 1)
	//* 163  309:aload_1         
	//* 164  310:getfield        #129 <Field boolean GifFrame.interlace>
	//* 165  313:ifne            335
	//* 166  316:aload_0         
	//* 167  317:getfield        #95  <Field int sampleSize>
	//* 168  320:iconst_1        
	//* 169  321:icmpeq          327
	//* 170  324:goto            335
			copyIntoScratchFast(gifframe);
	//  171  327:aload_0         
	//  172  328:aload_1         
	//  173  329:invokespecial   #261 <Method void copyIntoScratchFast(GifFrame)>
		else
	//* 174  332:goto            340
			copyCopyIntoScratchRobust(gifframe);
	//  175  335:aload_0         
	//  176  336:aload_1         
	//  177  337:invokespecial   #263 <Method void copyCopyIntoScratchRobust(GifFrame)>
		if(savePrevious && (gifframe.dispose == 0 || gifframe.dispose == 1))
	//* 178  340:aload_0         
	//* 179  341:getfield        #265 <Field boolean savePrevious>
	//* 180  344:ifeq            402
	//* 181  347:aload_1         
	//* 182  348:getfield        #238 <Field int GifFrame.dispose>
	//* 183  351:ifeq            362
	//* 184  354:aload_1         
	//* 185  355:getfield        #238 <Field int GifFrame.dispose>
	//* 186  358:iconst_1        
	//* 187  359:icmpne          402
		{
			if(previousImage == null)
	//* 188  362:aload_0         
	//* 189  363:getfield        #228 <Field Bitmap previousImage>
	//* 190  366:ifnonnull       377
				previousImage = getNextBitmap();
	//  191  369:aload_0         
	//  192  370:aload_0         
	//  193  371:invokespecial   #267 <Method Bitmap getNextBitmap()>
	//  194  374:putfield        #228 <Field Bitmap previousImage>
			gifframe = ((GifFrame) (previousImage));
	//  195  377:aload_0         
	//  196  378:getfield        #228 <Field Bitmap previousImage>
	//  197  381:astore_1        
			i = downsampledWidth;
	//  198  382:aload_0         
	//  199  383:getfield        #122 <Field int downsampledWidth>
	//  200  386:istore_3        
			((Bitmap) (gifframe)).setPixels(ai, 0, i, 0, 0, i, downsampledHeight);
	//  201  387:aload_1         
	//  202  388:aload           10
	//  203  390:iconst_0        
	//  204  391:iload_3         
	//  205  392:iconst_0        
	//  206  393:iconst_0        
	//  207  394:iload_3         
	//  208  395:aload_0         
	//  209  396:getfield        #124 <Field int downsampledHeight>
	//  210  399:invokevirtual   #269 <Method void Bitmap.setPixels(int[], int, int, int, int, int, int)>
		}
		gifframe = ((GifFrame) (getNextBitmap()));
	//  211  402:aload_0         
	//  212  403:invokespecial   #267 <Method Bitmap getNextBitmap()>
	//  213  406:astore_1        
		i = downsampledWidth;
	//  214  407:aload_0         
	//  215  408:getfield        #122 <Field int downsampledWidth>
	//  216  411:istore_3        
		((Bitmap) (gifframe)).setPixels(ai, 0, i, 0, 0, i, downsampledHeight);
	//  217  412:aload_1         
	//  218  413:aload           10
	//  219  415:iconst_0        
	//  220  416:iload_3         
	//  221  417:iconst_0        
	//  222  418:iconst_0        
	//  223  419:iload_3         
	//  224  420:aload_0         
	//  225  421:getfield        #124 <Field int downsampledHeight>
	//  226  424:invokevirtual   #269 <Method void Bitmap.setPixels(int[], int, int, int, int, int, int)>
		return ((Bitmap) (gifframe));
	//  227  427:aload_1         
	//  228  428:areturn         
	}

	public void advance()
	{
		framePointer = (framePointer + 1) % header.frameCount;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #120 <Field int framePointer>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:aload_0         
	//    6    8:getfield        #80  <Field GifHeader header>
	//    7   11:getfield        #273 <Field int GifHeader.frameCount>
	//    8   14:irem            
	//    9   15:putfield        #120 <Field int framePointer>
	//   10   18:return          
	}

	public void clear()
	{
		header = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #80  <Field GifHeader header>
		int ai[] = ((int []) (mainPixels));
	//    3    5:aload_0         
	//    4    6:getfield        #97  <Field byte[] mainPixels>
	//    5    9:astore_1        
		if(ai != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          24
			bitmapProvider.release(((byte []) (ai)));
	//    8   14:aload_0         
	//    9   15:getfield        #75  <Field GifDecoder$BitmapProvider bitmapProvider>
	//   10   18:aload_1         
	//   11   19:invokeinterface #277 <Method void GifDecoder$BitmapProvider.release(byte[])>
		ai = mainScratch;
	//   12   24:aload_0         
	//   13   25:getfield        #104 <Field int[] mainScratch>
	//   14   28:astore_1        
		if(ai != null)
	//*  15   29:aload_1         
	//*  16   30:ifnull          43
			bitmapProvider.release(ai);
	//   17   33:aload_0         
	//   18   34:getfield        #75  <Field GifDecoder$BitmapProvider bitmapProvider>
	//   19   37:aload_1         
	//   20   38:invokeinterface #280 <Method void GifDecoder$BitmapProvider.release(int[])>
		Bitmap bitmap = previousImage;
	//   21   43:aload_0         
	//   22   44:getfield        #228 <Field Bitmap previousImage>
	//   23   47:astore_1        
		if(bitmap != null)
	//*  24   48:aload_1         
	//*  25   49:ifnull          62
			bitmapProvider.release(bitmap);
	//   26   52:aload_0         
	//   27   53:getfield        #75  <Field GifDecoder$BitmapProvider bitmapProvider>
	//   28   56:aload_1         
	//   29   57:invokeinterface #232 <Method void GifDecoder$BitmapProvider.release(Bitmap)>
		previousImage = null;
	//   30   62:aload_0         
	//   31   63:aconst_null     
	//   32   64:putfield        #228 <Field Bitmap previousImage>
		rawData = null;
	//   33   67:aload_0         
	//   34   68:aconst_null     
	//   35   69:putfield        #145 <Field ByteBuffer rawData>
		isFirstFrameTransparent = null;
	//   36   72:aload_0         
	//   37   73:aconst_null     
	//   38   74:putfield        #126 <Field Boolean isFirstFrameTransparent>
		bitmap = ((Bitmap) (block));
	//   39   77:aload_0         
	//   40   78:getfield        #178 <Field byte[] block>
	//   41   81:astore_1        
		if(bitmap != null)
	//*  42   82:aload_1         
	//*  43   83:ifnull          96
			bitmapProvider.release(((byte []) (bitmap)));
	//   44   86:aload_0         
	//   45   87:getfield        #75  <Field GifDecoder$BitmapProvider bitmapProvider>
	//   46   90:aload_1         
	//   47   91:invokeinterface #277 <Method void GifDecoder$BitmapProvider.release(byte[])>
	//   48   96:return          
	}

	public int getByteSize()
	{
		return rawData.limit() + mainPixels.length + mainScratch.length * 4;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field ByteBuffer rawData>
	//    2    4:invokevirtual   #284 <Method int ByteBuffer.limit()>
	//    3    7:aload_0         
	//    4    8:getfield        #97  <Field byte[] mainPixels>
	//    5   11:arraylength     
	//    6   12:iadd            
	//    7   13:aload_0         
	//    8   14:getfield        #104 <Field int[] mainScratch>
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
	//    1    1:getfield        #120 <Field int framePointer>
	//    2    4:ireturn         
	}

	public ByteBuffer getData()
	{
		return rawData;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field ByteBuffer rawData>
	//    2    4:areturn         
	}

	public int getDelay(int i)
	{
		if(i >= 0 && i < header.frameCount)
	//*   0    0:iload_1         
	//*   1    1:iflt            35
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #80  <Field GifHeader header>
	//*   5    9:getfield        #273 <Field int GifHeader.frameCount>
	//*   6   12:icmpge          35
			return ((GifFrame)header.frames.get(i)).delay;
	//    7   15:aload_0         
	//    8   16:getfield        #80  <Field GifHeader header>
	//    9   19:getfield        #293 <Field List GifHeader.frames>
	//   10   22:iload_1         
	//   11   23:invokeinterface #298 <Method Object List.get(int)>
	//   12   28:checkcast       #106 <Class GifFrame>
	//   13   31:getfield        #301 <Field int GifFrame.delay>
	//   14   34:ireturn         
		else
			return -1;
	//   15   35:iconst_m1       
	//   16   36:ireturn         
	}

	public int getFrameCount()
	{
		return header.frameCount;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field GifHeader header>
	//    2    4:getfield        #273 <Field int GifHeader.frameCount>
	//    3    7:ireturn         
	}

	public int getHeight()
	{
		return header.height;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field GifHeader header>
	//    2    4:getfield        #160 <Field int GifHeader.height>
	//    3    7:ireturn         
	}

	public int getLoopCount()
	{
		if(header.loopCount == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field GifHeader header>
	//*   2    4:getfield        #308 <Field int GifHeader.loopCount>
	//*   3    7:iconst_m1       
	//*   4    8:icmpne          13
			return 1;
	//    5   11:iconst_1        
	//    6   12:ireturn         
		else
			return header.loopCount;
	//    7   13:aload_0         
	//    8   14:getfield        #80  <Field GifHeader header>
	//    9   17:getfield        #308 <Field int GifHeader.loopCount>
	//   10   20:ireturn         
	}

	public int getNetscapeLoopCount()
	{
		return header.loopCount;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field GifHeader header>
	//    2    4:getfield        #308 <Field int GifHeader.loopCount>
	//    3    7:ireturn         
	}

	public int getNextDelay()
	{
		if(header.frameCount > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field GifHeader header>
	//*   2    4:getfield        #273 <Field int GifHeader.frameCount>
	//*   3    7:ifle            28
		{
			int i = framePointer;
	//    4   10:aload_0         
	//    5   11:getfield        #120 <Field int framePointer>
	//    6   14:istore_1        
			if(i >= 0)
	//*   7   15:iload_1         
	//*   8   16:ifge            22
	//*   9   19:goto            28
				return getDelay(i);
	//   10   22:aload_0         
	//   11   23:iload_1         
	//   12   24:invokevirtual   #313 <Method int getDelay(int)>
	//   13   27:ireturn         
		}
		return 0;
	//   14   28:iconst_0        
	//   15   29:ireturn         
	}

	public Bitmap getNextFrame()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(header.frameCount <= 0 || framePointer < 0)
	//*   2    2:aload_0         
	//*   3    3:getfield        #80  <Field GifHeader header>
	//*   4    6:getfield        #273 <Field int GifHeader.frameCount>
	//*   5    9:ifle            19
	//*   6   12:aload_0         
	//*   7   13:getfield        #120 <Field int framePointer>
	//*   8   16:ifge            92
		{
			if(Log.isLoggable(TAG, 3))
	//*   9   19:getstatic       #316 <Field String TAG>
	//*  10   22:iconst_3        
	//*  11   23:invokestatic    #322 <Method boolean Log.isLoggable(String, int)>
	//*  12   26:ifeq            87
			{
				String s = TAG;
	//   13   29:getstatic       #316 <Field String TAG>
	//   14   32:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//   15   33:new             #324 <Class StringBuilder>
	//   16   36:dup             
	//   17   37:invokespecial   #325 <Method void StringBuilder()>
	//   18   40:astore_3        
				stringbuilder.append("Unable to decode frame, frameCount=");
	//   19   41:aload_3         
	//   20   42:ldc2            #327 <String "Unable to decode frame, frameCount=">
	//   21   45:invokevirtual   #331 <Method StringBuilder StringBuilder.append(String)>
	//   22   48:pop             
				stringbuilder.append(header.frameCount);
	//   23   49:aload_3         
	//   24   50:aload_0         
	//   25   51:getfield        #80  <Field GifHeader header>
	//   26   54:getfield        #273 <Field int GifHeader.frameCount>
	//   27   57:invokevirtual   #334 <Method StringBuilder StringBuilder.append(int)>
	//   28   60:pop             
				stringbuilder.append(", framePointer=");
	//   29   61:aload_3         
	//   30   62:ldc2            #336 <String ", framePointer=">
	//   31   65:invokevirtual   #331 <Method StringBuilder StringBuilder.append(String)>
	//   32   68:pop             
				stringbuilder.append(framePointer);
	//   33   69:aload_3         
	//   34   70:aload_0         
	//   35   71:getfield        #120 <Field int framePointer>
	//   36   74:invokevirtual   #334 <Method StringBuilder StringBuilder.append(int)>
	//   37   77:pop             
				Log.d(s, stringbuilder.toString());
	//   38   78:aload_2         
	//   39   79:aload_3         
	//   40   80:invokevirtual   #340 <Method String StringBuilder.toString()>
	//   41   83:invokestatic    #344 <Method int Log.d(String, String)>
	//   42   86:pop             
			}
			status = 1;
	//   43   87:aload_0         
	//   44   88:iconst_1        
	//   45   89:putfield        #183 <Field int status>
		}
		if(status != 1 && status != 2) goto _L2; else goto _L1
	//   46   92:aload_0         
	//   47   93:getfield        #183 <Field int status>
	//   48   96:iconst_1        
	//   49   97:icmpeq          342
	//   50  100:aload_0         
	//   51  101:getfield        #183 <Field int status>
	//   52  104:iconst_2        
	//   53  105:icmpne          111
	//*  54  108:goto            342
_L2:
		int i;
		GifFrame gifframe;
		status = 0;
	//   55  111:aload_0         
	//   56  112:iconst_0        
	//   57  113:putfield        #183 <Field int status>
		if(block == null)
	//*  58  116:aload_0         
	//*  59  117:getfield        #178 <Field byte[] block>
	//*  60  120:ifnonnull       139
			block = bitmapProvider.obtainByteArray(255);
	//   61  123:aload_0         
	//   62  124:aload_0         
	//   63  125:getfield        #75  <Field GifDecoder$BitmapProvider bitmapProvider>
	//   64  128:sipush          255
	//   65  131:invokeinterface #166 <Method byte[] GifDecoder$BitmapProvider.obtainByteArray(int)>
	//   66  136:putfield        #178 <Field byte[] block>
		gifframe = (GifFrame)header.frames.get(framePointer);
	//   67  139:aload_0         
	//   68  140:getfield        #80  <Field GifHeader header>
	//   69  143:getfield        #293 <Field List GifHeader.frames>
	//   70  146:aload_0         
	//   71  147:getfield        #120 <Field int framePointer>
	//   72  150:invokeinterface #298 <Method Object List.get(int)>
	//   73  155:checkcast       #106 <Class GifFrame>
	//   74  158:astore          4
		i = framePointer - 1;
	//   75  160:aload_0         
	//   76  161:getfield        #120 <Field int framePointer>
	//   77  164:iconst_1        
	//   78  165:isub            
	//   79  166:istore_1        
		if(i < 0) goto _L4; else goto _L3
	//   80  167:iload_1         
	//   81  168:iflt            399
_L3:
		Object obj = ((Object) ((GifFrame)header.frames.get(i)));
	//   82  171:aload_0         
	//   83  172:getfield        #80  <Field GifHeader header>
	//   84  175:getfield        #293 <Field List GifHeader.frames>
	//   85  178:iload_1         
	//   86  179:invokeinterface #298 <Method Object List.get(int)>
	//   87  184:checkcast       #106 <Class GifFrame>
	//   88  187:astore_2        
	//*  89  188:goto            191
_L6:
		int ai[];
		if(gifframe.lct != null)
	//*  90  191:aload           4
	//*  91  193:getfield        #247 <Field int[] GifFrame.lct>
	//*  92  196:ifnull          208
		{
			ai = gifframe.lct;
	//   93  199:aload           4
	//   94  201:getfield        #247 <Field int[] GifFrame.lct>
	//   95  204:astore_3        
			break MISSING_BLOCK_LABEL_216;
	//   96  205:goto            216
		}
		ai = header.gct;
	//   97  208:aload_0         
	//   98  209:getfield        #80  <Field GifHeader header>
	//   99  212:getfield        #347 <Field int[] GifHeader.gct>
	//  100  215:astore_3        
		act = ai;
	//  101  216:aload_0         
	//  102  217:aload_3         
	//  103  218:putfield        #99  <Field int[] act>
		if(act != null)
			break MISSING_BLOCK_LABEL_285;
	//  104  221:aload_0         
	//  105  222:getfield        #99  <Field int[] act>
	//  106  225:ifnonnull       285
		if(Log.isLoggable(TAG, 3))
	//* 107  228:getstatic       #316 <Field String TAG>
	//* 108  231:iconst_3        
	//* 109  232:invokestatic    #322 <Method boolean Log.isLoggable(String, int)>
	//* 110  235:ifeq            276
		{
			obj = ((Object) (TAG));
	//  111  238:getstatic       #316 <Field String TAG>
	//  112  241:astore_2        
			StringBuilder stringbuilder1 = new StringBuilder();
	//  113  242:new             #324 <Class StringBuilder>
	//  114  245:dup             
	//  115  246:invokespecial   #325 <Method void StringBuilder()>
	//  116  249:astore_3        
			stringbuilder1.append("No valid color table found for frame #");
	//  117  250:aload_3         
	//  118  251:ldc2            #349 <String "No valid color table found for frame #">
	//  119  254:invokevirtual   #331 <Method StringBuilder StringBuilder.append(String)>
	//  120  257:pop             
			stringbuilder1.append(framePointer);
	//  121  258:aload_3         
	//  122  259:aload_0         
	//  123  260:getfield        #120 <Field int framePointer>
	//  124  263:invokevirtual   #334 <Method StringBuilder StringBuilder.append(int)>
	//  125  266:pop             
			Log.d(((String) (obj)), stringbuilder1.toString());
	//  126  267:aload_2         
	//  127  268:aload_3         
	//  128  269:invokevirtual   #340 <Method String StringBuilder.toString()>
	//  129  272:invokestatic    #344 <Method int Log.d(String, String)>
	//  130  275:pop             
		}
		status = 1;
	//  131  276:aload_0         
	//  132  277:iconst_1        
	//  133  278:putfield        #183 <Field int status>
		this;
	//  134  281:aload_0         
		JVM INSTR monitorexit ;
	//  135  282:monitorexit     
		return null;
	//  136  283:aconst_null     
	//  137  284:areturn         
		if(gifframe.transparency)
	//* 138  285:aload           4
	//* 139  287:getfield        #241 <Field boolean GifFrame.transparency>
	//* 140  290:ifeq            330
		{
			System.arraycopy(((Object) (act)), 0, ((Object) (pct)), 0, act.length);
	//  141  293:aload_0         
	//  142  294:getfield        #99  <Field int[] act>
	//  143  297:iconst_0        
	//  144  298:aload_0         
	//  145  299:getfield        #66  <Field int[] pct>
	//  146  302:iconst_0        
	//  147  303:aload_0         
	//  148  304:getfield        #99  <Field int[] act>
	//  149  307:arraylength     
	//  150  308:invokestatic    #355 <Method void System.arraycopy(Object, int, Object, int, int)>
			act = pct;
	//  151  311:aload_0         
	//  152  312:aload_0         
	//  153  313:getfield        #66  <Field int[] pct>
	//  154  316:putfield        #99  <Field int[] act>
			act[gifframe.transIndex] = 0;
	//  155  319:aload_0         
	//  156  320:getfield        #99  <Field int[] act>
	//  157  323:aload           4
	//  158  325:getfield        #253 <Field int GifFrame.transIndex>
	//  159  328:iconst_0        
	//  160  329:iastore         
		}
		obj = ((Object) (setPixels(gifframe, ((GifFrame) (obj)))));
	//  161  330:aload_0         
	//  162  331:aload           4
	//  163  333:aload_2         
	//  164  334:invokespecial   #357 <Method Bitmap setPixels(GifFrame, GifFrame)>
	//  165  337:astore_2        
		this;
	//  166  338:aload_0         
		JVM INSTR monitorexit ;
	//  167  339:monitorexit     
		return ((Bitmap) (obj));
	//  168  340:aload_2         
	//  169  341:areturn         
_L1:
		if(Log.isLoggable(TAG, 3))
	//* 170  342:getstatic       #316 <Field String TAG>
	//* 171  345:iconst_3        
	//* 172  346:invokestatic    #322 <Method boolean Log.isLoggable(String, int)>
	//* 173  349:ifeq            390
		{
			obj = ((Object) (TAG));
	//  174  352:getstatic       #316 <Field String TAG>
	//  175  355:astore_2        
			StringBuilder stringbuilder2 = new StringBuilder();
	//  176  356:new             #324 <Class StringBuilder>
	//  177  359:dup             
	//  178  360:invokespecial   #325 <Method void StringBuilder()>
	//  179  363:astore_3        
			stringbuilder2.append("Unable to decode frame, status=");
	//  180  364:aload_3         
	//  181  365:ldc2            #359 <String "Unable to decode frame, status=">
	//  182  368:invokevirtual   #331 <Method StringBuilder StringBuilder.append(String)>
	//  183  371:pop             
			stringbuilder2.append(status);
	//  184  372:aload_3         
	//  185  373:aload_0         
	//  186  374:getfield        #183 <Field int status>
	//  187  377:invokevirtual   #334 <Method StringBuilder StringBuilder.append(int)>
	//  188  380:pop             
			Log.d(((String) (obj)), stringbuilder2.toString());
	//  189  381:aload_2         
	//  190  382:aload_3         
	//  191  383:invokevirtual   #340 <Method String StringBuilder.toString()>
	//  192  386:invokestatic    #344 <Method int Log.d(String, String)>
	//  193  389:pop             
		}
		this;
	//  194  390:aload_0         
		JVM INSTR monitorexit ;
	//  195  391:monitorexit     
		return null;
	//  196  392:aconst_null     
	//  197  393:areturn         
		obj;
	//  198  394:astore_2        
	//* 199  395:aload_0         
		throw obj;
	//  200  396:monitorexit     
	//  201  397:aload_2         
	//  202  398:athrow          
_L4:
		obj = null;
	//  203  399:aconst_null     
	//  204  400:astore_2        
		if(true) goto _L6; else goto _L5
	//  205  401:goto            191
_L5:
	}

	public int getStatus()
	{
		return status;
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field int status>
	//    2    4:ireturn         
	}

	public int getTotalIterationCount()
	{
		if(header.loopCount == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field GifHeader header>
	//*   2    4:getfield        #308 <Field int GifHeader.loopCount>
	//*   3    7:iconst_m1       
	//*   4    8:icmpne          13
			return 1;
	//    5   11:iconst_1        
	//    6   12:ireturn         
		if(header.loopCount == 0)
	//*   7   13:aload_0         
	//*   8   14:getfield        #80  <Field GifHeader header>
	//*   9   17:getfield        #308 <Field int GifHeader.loopCount>
	//*  10   20:ifne            25
			return 0;
	//   11   23:iconst_0        
	//   12   24:ireturn         
		else
			return header.loopCount + 1;
	//   13   25:aload_0         
	//   14   26:getfield        #80  <Field GifHeader header>
	//   15   29:getfield        #308 <Field int GifHeader.loopCount>
	//   16   32:iconst_1        
	//   17   33:iadd            
	//   18   34:ireturn         
	}

	public int getWidth()
	{
		return header.width;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field GifHeader header>
	//    2    4:getfield        #157 <Field int GifHeader.width>
	//    3    7:ireturn         
	}

	public int read(InputStream inputstream, int i)
	{
		if(inputstream == null)
			break MISSING_BLOCK_LABEL_95;
	//    0    0:aload_1         
	//    1    1:ifnull          95
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
	//   11   21:new             #368 <Class ByteArrayOutputStream>
	//   12   24:dup             
	//   13   25:iload_2         
	//   14   26:invokespecial   #371 <Method void ByteArrayOutputStream(int)>
	//   15   29:astore_3        
		abyte0 = new byte[16384];
	//   16   30:sipush          16384
	//   17   33:newarray        byte[]
	//   18   35:astore          4
_L1:
		i = inputstream.read(abyte0, 0, abyte0.length);
	//   19   37:aload_1         
	//   20   38:aload           4
	//   21   40:iconst_0        
	//   22   41:aload           4
	//   23   43:arraylength     
	//   24   44:invokevirtual   #376 <Method int InputStream.read(byte[], int, int)>
	//   25   47:istore_2        
		if(i == -1)
			break MISSING_BLOCK_LABEL_64;
	//   26   48:iload_2         
	//   27   49:iconst_m1       
	//   28   50:icmpeq          64
		bytearrayoutputstream.write(abyte0, 0, i);
	//   29   53:aload_3         
	//   30   54:aload           4
	//   31   56:iconst_0        
	//   32   57:iload_2         
	//   33   58:invokevirtual   #380 <Method void ByteArrayOutputStream.write(byte[], int, int)>
		  goto _L1
	//*  34   61:goto            37
		try
		{
			bytearrayoutputstream.flush();
	//   35   64:aload_3         
	//   36   65:invokevirtual   #383 <Method void ByteArrayOutputStream.flush()>
			read(bytearrayoutputstream.toByteArray());
	//   37   68:aload_0         
	//   38   69:aload_3         
	//   39   70:invokevirtual   #387 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   40   73:invokevirtual   #390 <Method int read(byte[])>
	//   41   76:pop             
		}
	//*  42   77:goto            100
		catch(IOException ioexception)
	//*  43   80:astore_3        
		{
			Log.w(TAG, "Error reading data from stream", ((Throwable) (ioexception)));
	//   44   81:getstatic       #316 <Field String TAG>
	//   45   84:ldc2            #392 <String "Error reading data from stream">
	//   46   87:aload_3         
	//   47   88:invokestatic    #396 <Method int Log.w(String, String, Throwable)>
	//   48   91:pop             
		}
		break MISSING_BLOCK_LABEL_100;
	//   49   92:goto            100
		status = 2;
	//   50   95:aload_0         
	//   51   96:iconst_2        
	//   52   97:putfield        #183 <Field int status>
		if(inputstream != null)
	//*  53  100:aload_1         
	//*  54  101:ifnull          123
			try
			{
				inputstream.close();
	//   55  104:aload_1         
	//   56  105:invokevirtual   #399 <Method void InputStream.close()>
			}
	//*  57  108:goto            123
			// Misplaced declaration of an exception variable
			catch(InputStream inputstream)
	//*  58  111:astore_1        
			{
				Log.w(TAG, "Error closing stream", ((Throwable) (inputstream)));
	//   59  112:getstatic       #316 <Field String TAG>
	//   60  115:ldc2            #401 <String "Error closing stream">
	//   61  118:aload_1         
	//   62  119:invokestatic    #396 <Method int Log.w(String, String, Throwable)>
	//   63  122:pop             
			}
		return status;
	//   64  123:aload_0         
	//   65  124:getfield        #183 <Field int status>
	//   66  127:ireturn         
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
	//    4    4:invokespecial   #403 <Method GifHeaderParser getHeaderParser()>
	//    5    7:aload_1         
	//    6    8:invokevirtual   #406 <Method GifHeaderParser GifHeaderParser.setData(byte[])>
	//    7   11:invokevirtual   #410 <Method GifHeader GifHeaderParser.parseHeader()>
	//    8   14:putfield        #80  <Field GifHeader header>
		if(abyte0 == null)
			break MISSING_BLOCK_LABEL_30;
	//    9   17:aload_1         
	//   10   18:ifnull          30
		setData(header, abyte0);
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #80  <Field GifHeader header>
	//   14   26:aload_1         
	//   15   27:invokevirtual   #413 <Method void setData(GifHeader, byte[])>
		int i = status;
	//   16   30:aload_0         
	//   17   31:getfield        #183 <Field int status>
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
	//    2    2:putfield        #120 <Field int framePointer>
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
	//    6    6:invokevirtual   #91  <Method void setData(GifHeader, ByteBuffer, int)>
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
		if(i <= 0)
			break MISSING_BLOCK_LABEL_175;
	//    2    2:iload_3         
	//    3    3:ifle            175
		i = Integer.highestOneBit(i);
	//    4    6:iload_3         
	//    5    7:invokestatic    #420 <Method int Integer.highestOneBit(int)>
	//    6   10:istore_3        
		status = 0;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #183 <Field int status>
		header = gifheader;
	//   10   16:aload_0         
	//   11   17:aload_1         
	//   12   18:putfield        #80  <Field GifHeader header>
		framePointer = -1;
	//   13   21:aload_0         
	//   14   22:iconst_m1       
	//   15   23:putfield        #120 <Field int framePointer>
		rawData = bytebuffer.asReadOnlyBuffer();
	//   16   26:aload_0         
	//   17   27:aload_2         
	//   18   28:invokevirtual   #423 <Method ByteBuffer ByteBuffer.asReadOnlyBuffer()>
	//   19   31:putfield        #145 <Field ByteBuffer rawData>
		rawData.position(0);
	//   20   34:aload_0         
	//   21   35:getfield        #145 <Field ByteBuffer rawData>
	//   22   38:iconst_0        
	//   23   39:invokevirtual   #154 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   24   42:pop             
		rawData.order(ByteOrder.LITTLE_ENDIAN);
	//   25   43:aload_0         
	//   26   44:getfield        #145 <Field ByteBuffer rawData>
	//   27   47:getstatic       #429 <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//   28   50:invokevirtual   #433 <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   29   53:pop             
		savePrevious = false;
	//   30   54:aload_0         
	//   31   55:iconst_0        
	//   32   56:putfield        #265 <Field boolean savePrevious>
		bytebuffer = ((ByteBuffer) (gifheader.frames.iterator()));
	//   33   59:aload_1         
	//   34   60:getfield        #293 <Field List GifHeader.frames>
	//   35   63:invokeinterface #437 <Method Iterator List.iterator()>
	//   36   68:astore_2        
		do
		{
			if(!((Iterator) (bytebuffer)).hasNext())
				break;
	//   37   69:aload_2         
	//   38   70:invokeinterface #442 <Method boolean Iterator.hasNext()>
	//   39   75:ifeq            99
			if(((GifFrame)((Iterator) (bytebuffer)).next()).dispose != 3)
				continue;
	//   40   78:aload_2         
	//   41   79:invokeinterface #446 <Method Object Iterator.next()>
	//   42   84:checkcast       #106 <Class GifFrame>
	//   43   87:getfield        #238 <Field int GifFrame.dispose>
	//   44   90:iconst_3        
	//   45   91:icmpne          69
			savePrevious = true;
	//   46   94:aload_0         
	//   47   95:iconst_1        
	//   48   96:putfield        #265 <Field boolean savePrevious>
			break;
		} while(true);
		sampleSize = i;
	//   49   99:aload_0         
	//   50  100:iload_3         
	//   51  101:putfield        #95  <Field int sampleSize>
		downsampledWidth = gifheader.width / i;
	//   52  104:aload_0         
	//   53  105:aload_1         
	//   54  106:getfield        #157 <Field int GifHeader.width>
	//   55  109:iload_3         
	//   56  110:idiv            
	//   57  111:putfield        #122 <Field int downsampledWidth>
		downsampledHeight = gifheader.height / i;
	//   58  114:aload_0         
	//   59  115:aload_1         
	//   60  116:getfield        #160 <Field int GifHeader.height>
	//   61  119:iload_3         
	//   62  120:idiv            
	//   63  121:putfield        #124 <Field int downsampledHeight>
		mainPixels = bitmapProvider.obtainByteArray(gifheader.width * gifheader.height);
	//   64  124:aload_0         
	//   65  125:aload_0         
	//   66  126:getfield        #75  <Field GifDecoder$BitmapProvider bitmapProvider>
	//   67  129:aload_1         
	//   68  130:getfield        #157 <Field int GifHeader.width>
	//   69  133:aload_1         
	//   70  134:getfield        #160 <Field int GifHeader.height>
	//   71  137:imul            
	//   72  138:invokeinterface #166 <Method byte[] GifDecoder$BitmapProvider.obtainByteArray(int)>
	//   73  143:putfield        #97  <Field byte[] mainPixels>
		mainScratch = bitmapProvider.obtainIntArray(downsampledWidth * downsampledHeight);
	//   74  146:aload_0         
	//   75  147:aload_0         
	//   76  148:getfield        #75  <Field GifDecoder$BitmapProvider bitmapProvider>
	//   77  151:aload_0         
	//   78  152:getfield        #122 <Field int downsampledWidth>
	//   79  155:aload_0         
	//   80  156:getfield        #124 <Field int downsampledHeight>
	//   81  159:imul            
	//   82  160:invokeinterface #450 <Method int[] GifDecoder$BitmapProvider.obtainIntArray(int)>
	//   83  165:putfield        #104 <Field int[] mainScratch>
		this;
	//   84  168:aload_0         
		JVM INSTR monitorexit ;
	//   85  169:monitorexit     
		return;
	//   86  170:return          
		gifheader;
	//   87  171:astore_1        
		break MISSING_BLOCK_LABEL_210;
	//   88  172:goto            209
		gifheader = ((GifHeader) (new StringBuilder()));
	//   89  175:new             #324 <Class StringBuilder>
	//   90  178:dup             
	//   91  179:invokespecial   #325 <Method void StringBuilder()>
	//   92  182:astore_1        
		((StringBuilder) (gifheader)).append("Sample size must be >=0, not: ");
	//   93  183:aload_1         
	//   94  184:ldc2            #452 <String "Sample size must be >=0, not: ">
	//   95  187:invokevirtual   #331 <Method StringBuilder StringBuilder.append(String)>
	//   96  190:pop             
		((StringBuilder) (gifheader)).append(i);
	//   97  191:aload_1         
	//   98  192:iload_3         
	//   99  193:invokevirtual   #334 <Method StringBuilder StringBuilder.append(int)>
	//  100  196:pop             
		throw new IllegalArgumentException(((StringBuilder) (gifheader)).toString());
	//  101  197:new             #454 <Class IllegalArgumentException>
	//  102  200:dup             
	//  103  201:aload_1         
	//  104  202:invokevirtual   #340 <Method String StringBuilder.toString()>
	//  105  205:invokespecial   #457 <Method void IllegalArgumentException(String)>
	//  106  208:athrow          
	//* 107  209:aload_0         
		throw gifheader;
	//  108  210:monitorexit     
	//  109  211:aload_1         
	//  110  212:athrow          
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
	//    5    5:invokestatic    #461 <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//    6    8:invokevirtual   #463 <Method void setData(GifHeader, ByteBuffer)>
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

	public void setDefaultBitmapConfig(android.graphics.Bitmap.Config config)
	{
		if(config != android.graphics.Bitmap.Config.ARGB_8888 && config != android.graphics.Bitmap.Config.RGB_565)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #71  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//*   2    4:if_acmpeq       83
	//*   3    7:aload_1         
	//*   4    8:getstatic       #468 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
	//*   5   11:if_acmpne       17
	//*   6   14:goto            83
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    7   17:new             #324 <Class StringBuilder>
	//    8   20:dup             
	//    9   21:invokespecial   #325 <Method void StringBuilder()>
	//   10   24:astore_2        
			stringbuilder.append("Unsupported format: ");
	//   11   25:aload_2         
	//   12   26:ldc2            #470 <String "Unsupported format: ">
	//   13   29:invokevirtual   #331 <Method StringBuilder StringBuilder.append(String)>
	//   14   32:pop             
			stringbuilder.append(((Object) (config)));
	//   15   33:aload_2         
	//   16   34:aload_1         
	//   17   35:invokevirtual   #473 <Method StringBuilder StringBuilder.append(Object)>
	//   18   38:pop             
			stringbuilder.append(", must be one of ");
	//   19   39:aload_2         
	//   20   40:ldc2            #475 <String ", must be one of ">
	//   21   43:invokevirtual   #331 <Method StringBuilder StringBuilder.append(String)>
	//   22   46:pop             
			stringbuilder.append(((Object) (android.graphics.Bitmap.Config.ARGB_8888)));
	//   23   47:aload_2         
	//   24   48:getstatic       #71  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   25   51:invokevirtual   #473 <Method StringBuilder StringBuilder.append(Object)>
	//   26   54:pop             
			stringbuilder.append(" or ");
	//   27   55:aload_2         
	//   28   56:ldc2            #477 <String " or ">
	//   29   59:invokevirtual   #331 <Method StringBuilder StringBuilder.append(String)>
	//   30   62:pop             
			stringbuilder.append(((Object) (android.graphics.Bitmap.Config.RGB_565)));
	//   31   63:aload_2         
	//   32   64:getstatic       #468 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
	//   33   67:invokevirtual   #473 <Method StringBuilder StringBuilder.append(Object)>
	//   34   70:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   35   71:new             #454 <Class IllegalArgumentException>
	//   36   74:dup             
	//   37   75:aload_2         
	//   38   76:invokevirtual   #340 <Method String StringBuilder.toString()>
	//   39   79:invokespecial   #457 <Method void IllegalArgumentException(String)>
	//   40   82:athrow          
		} else
		{
			bitmapConfig = config;
	//   41   83:aload_0         
	//   42   84:aload_1         
	//   43   85:putfield        #73  <Field android.graphics.Bitmap$Config bitmapConfig>
			return;
	//   44   88:return          
		}
	}

	private static final int BYTES_PER_INTEGER = 4;
	private static final int COLOR_TRANSPARENT_BLACK = 0;
	private static final int INITIAL_FRAME_POINTER = -1;
	private static final int MASK_INT_LOWEST_BYTE = 255;
	private static final int MAX_STACK_SIZE = 4096;
	private static final int NULL_CODE = -1;
	private static final String TAG = "StandardGifDecoder";
	private int act[];
	private android.graphics.Bitmap.Config bitmapConfig;
	private final GifDecoder.BitmapProvider bitmapProvider;
	private byte block[];
	private int downsampledHeight;
	private int downsampledWidth;
	private int framePointer;
	private GifHeader header;
	private Boolean isFirstFrameTransparent;
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

	static 
	{
	//    0    0:return          
	}
}
