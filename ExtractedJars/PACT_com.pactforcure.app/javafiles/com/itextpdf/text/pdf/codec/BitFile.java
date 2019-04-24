// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.codec;

import java.io.IOException;
import java.io.OutputStream;

public class BitFile
{

	public BitFile(OutputStream outputstream, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		blocks_ = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #20  <Field boolean blocks_>
		output_ = outputstream;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #22  <Field OutputStream output_>
		blocks_ = flag;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #20  <Field boolean blocks_>
		buffer_ = new byte[256];
	//   11   19:aload_0         
	//   12   20:sipush          256
	//   13   23:newarray        byte[]
	//   14   25:putfield        #24  <Field byte[] buffer_>
		index_ = 0;
	//   15   28:aload_0         
	//   16   29:iconst_0        
	//   17   30:putfield        #26  <Field int index_>
		bitsLeft_ = 8;
	//   18   33:aload_0         
	//   19   34:bipush          8
	//   20   36:putfield        #28  <Field int bitsLeft_>
	//   21   39:return          
	}

	public void flush()
		throws IOException
	{
		int j = index_;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int index_>
	//    2    4:istore_2        
		int i;
		if(bitsLeft_ == 8)
	//*   3    5:aload_0         
	//*   4    6:getfield        #28  <Field int bitsLeft_>
	//*   5    9:bipush          8
	//*   6   11:icmpne          71
			i = 0;
	//    7   14:iconst_0        
	//    8   15:istore_1        
		else
	//*   9   16:iload_2         
	//*  10   17:iload_1         
	//*  11   18:iadd            
	//*  12   19:istore_1        
	//*  13   20:iload_1         
	//*  14   21:ifle            70
	//*  15   24:aload_0         
	//*  16   25:getfield        #20  <Field boolean blocks_>
	//*  17   28:ifeq            39
	//*  18   31:aload_0         
	//*  19   32:getfield        #22  <Field OutputStream output_>
	//*  20   35:iload_1         
	//*  21   36:invokevirtual   #38  <Method void OutputStream.write(int)>
	//*  22   39:aload_0         
	//*  23   40:getfield        #22  <Field OutputStream output_>
	//*  24   43:aload_0         
	//*  25   44:getfield        #24  <Field byte[] buffer_>
	//*  26   47:iconst_0        
	//*  27   48:iload_1         
	//*  28   49:invokevirtual   #41  <Method void OutputStream.write(byte[], int, int)>
	//*  29   52:aload_0         
	//*  30   53:getfield        #24  <Field byte[] buffer_>
	//*  31   56:iconst_0        
	//*  32   57:iconst_0        
	//*  33   58:bastore         
	//*  34   59:aload_0         
	//*  35   60:iconst_0        
	//*  36   61:putfield        #26  <Field int index_>
	//*  37   64:aload_0         
	//*  38   65:bipush          8
	//*  39   67:putfield        #28  <Field int bitsLeft_>
	//*  40   70:return          
			i = 1;
	//   41   71:iconst_1        
	//   42   72:istore_1        
		i = j + i;
		if(i > 0)
		{
			if(blocks_)
				output_.write(i);
			output_.write(buffer_, 0, i);
			buffer_[0] = 0;
			index_ = 0;
			bitsLeft_ = 8;
		}
	//*  43   73:goto            16
	}

	public void writeBits(int i, int j)
		throws IOException
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		int l = j;
	//    2    3:iload_2         
	//    3    4:istore          4
		int k = i;
	//    4    6:iload_1         
	//    5    7:istore_3        
		i = ((int) (flag));
	//    6    8:iload           5
	//    7   10:istore_1        
		do
		{
			if(index_ == 254 && bitsLeft_ == 0 || index_ > 254)
	//*   8   11:aload_0         
	//*   9   12:getfield        #26  <Field int index_>
	//*  10   15:sipush          254
	//*  11   18:icmpne          28
	//*  12   21:aload_0         
	//*  13   22:getfield        #28  <Field int bitsLeft_>
	//*  14   25:ifeq            38
	//*  15   28:aload_0         
	//*  16   29:getfield        #26  <Field int index_>
	//*  17   32:sipush          254
	//*  18   35:icmple          88
			{
				if(blocks_)
	//*  19   38:aload_0         
	//*  20   39:getfield        #20  <Field boolean blocks_>
	//*  21   42:ifeq            55
					output_.write(255);
	//   22   45:aload_0         
	//   23   46:getfield        #22  <Field OutputStream output_>
	//   24   49:sipush          255
	//   25   52:invokevirtual   #38  <Method void OutputStream.write(int)>
				output_.write(buffer_, 0, 255);
	//   26   55:aload_0         
	//   27   56:getfield        #22  <Field OutputStream output_>
	//   28   59:aload_0         
	//   29   60:getfield        #24  <Field byte[] buffer_>
	//   30   63:iconst_0        
	//   31   64:sipush          255
	//   32   67:invokevirtual   #41  <Method void OutputStream.write(byte[], int, int)>
				buffer_[0] = 0;
	//   33   70:aload_0         
	//   34   71:getfield        #24  <Field byte[] buffer_>
	//   35   74:iconst_0        
	//   36   75:iconst_0        
	//   37   76:bastore         
				index_ = 0;
	//   38   77:aload_0         
	//   39   78:iconst_0        
	//   40   79:putfield        #26  <Field int index_>
				bitsLeft_ = 8;
	//   41   82:aload_0         
	//   42   83:bipush          8
	//   43   85:putfield        #28  <Field int bitsLeft_>
			}
			if(l <= bitsLeft_)
	//*  44   88:iload           4
	//*  45   90:aload_0         
	//*  46   91:getfield        #28  <Field int bitsLeft_>
	//*  47   94:icmpgt          225
			{
				if(blocks_)
	//*  48   97:aload_0         
	//*  49   98:getfield        #20  <Field boolean blocks_>
	//*  50  101:ifeq            167
				{
					byte abyte0[] = buffer_;
	//   51  104:aload_0         
	//   52  105:getfield        #24  <Field byte[] buffer_>
	//   53  108:astore          7
					j = index_;
	//   54  110:aload_0         
	//   55  111:getfield        #26  <Field int index_>
	//   56  114:istore_2        
					abyte0[j] = (byte)(abyte0[j] | ((1 << l) - 1 & k) << 8 - bitsLeft_);
	//   57  115:aload           7
	//   58  117:iload_2         
	//   59  118:aload           7
	//   60  120:iload_2         
	//   61  121:baload          
	//   62  122:iconst_1        
	//   63  123:iload           4
	//   64  125:ishl            
	//   65  126:iconst_1        
	//   66  127:isub            
	//   67  128:iload_3         
	//   68  129:iand            
	//   69  130:bipush          8
	//   70  132:aload_0         
	//   71  133:getfield        #28  <Field int bitsLeft_>
	//   72  136:isub            
	//   73  137:ishl            
	//   74  138:ior             
	//   75  139:int2byte        
	//   76  140:bastore         
					i += l;
	//   77  141:iload_1         
	//   78  142:iload           4
	//   79  144:iadd            
	//   80  145:istore_1        
					bitsLeft_ = bitsLeft_ - l;
	//   81  146:aload_0         
	//   82  147:aload_0         
	//   83  148:getfield        #28  <Field int bitsLeft_>
	//   84  151:iload           4
	//   85  153:isub            
	//   86  154:putfield        #28  <Field int bitsLeft_>
					j = 0;
	//   87  157:iconst_0        
	//   88  158:istore_2        
				} else
	//*  89  159:iload_2         
	//*  90  160:istore          4
	//*  91  162:iload_2         
	//*  92  163:ifne            11
	//*  93  166:return          
				{
					byte abyte1[] = buffer_;
	//   94  167:aload_0         
	//   95  168:getfield        #24  <Field byte[] buffer_>
	//   96  171:astore          7
					j = index_;
	//   97  173:aload_0         
	//   98  174:getfield        #26  <Field int index_>
	//   99  177:istore_2        
					abyte1[j] = (byte)(abyte1[j] | ((1 << l) - 1 & k) << bitsLeft_ - l);
	//  100  178:aload           7
	//  101  180:iload_2         
	//  102  181:aload           7
	//  103  183:iload_2         
	//  104  184:baload          
	//  105  185:iconst_1        
	//  106  186:iload           4
	//  107  188:ishl            
	//  108  189:iconst_1        
	//  109  190:isub            
	//  110  191:iload_3         
	//  111  192:iand            
	//  112  193:aload_0         
	//  113  194:getfield        #28  <Field int bitsLeft_>
	//  114  197:iload           4
	//  115  199:isub            
	//  116  200:ishl            
	//  117  201:ior             
	//  118  202:int2byte        
	//  119  203:bastore         
					i += l;
	//  120  204:iload_1         
	//  121  205:iload           4
	//  122  207:iadd            
	//  123  208:istore_1        
					bitsLeft_ = bitsLeft_ - l;
	//  124  209:aload_0         
	//  125  210:aload_0         
	//  126  211:getfield        #28  <Field int bitsLeft_>
	//  127  214:iload           4
	//  128  216:isub            
	//  129  217:putfield        #28  <Field int bitsLeft_>
					j = 0;
	//  130  220:iconst_0        
	//  131  221:istore_2        
				}
			} else
	//* 132  222:goto            159
			if(blocks_)
	//* 133  225:aload_0         
	//* 134  226:getfield        #20  <Field boolean blocks_>
	//* 135  229:ifeq            328
			{
				byte abyte2[] = buffer_;
	//  136  232:aload_0         
	//  137  233:getfield        #24  <Field byte[] buffer_>
	//  138  236:astore          7
				j = index_;
	//  139  238:aload_0         
	//  140  239:getfield        #26  <Field int index_>
	//  141  242:istore_2        
				abyte2[j] = (byte)(abyte2[j] | ((1 << bitsLeft_) - 1 & k) << 8 - bitsLeft_);
	//  142  243:aload           7
	//  143  245:iload_2         
	//  144  246:aload           7
	//  145  248:iload_2         
	//  146  249:baload          
	//  147  250:iconst_1        
	//  148  251:aload_0         
	//  149  252:getfield        #28  <Field int bitsLeft_>
	//  150  255:ishl            
	//  151  256:iconst_1        
	//  152  257:isub            
	//  153  258:iload_3         
	//  154  259:iand            
	//  155  260:bipush          8
	//  156  262:aload_0         
	//  157  263:getfield        #28  <Field int bitsLeft_>
	//  158  266:isub            
	//  159  267:ishl            
	//  160  268:ior             
	//  161  269:int2byte        
	//  162  270:bastore         
				i += bitsLeft_;
	//  163  271:iload_1         
	//  164  272:aload_0         
	//  165  273:getfield        #28  <Field int bitsLeft_>
	//  166  276:iadd            
	//  167  277:istore_1        
				k >>= bitsLeft_;
	//  168  278:iload_3         
	//  169  279:aload_0         
	//  170  280:getfield        #28  <Field int bitsLeft_>
	//  171  283:ishr            
	//  172  284:istore_3        
				j = l - bitsLeft_;
	//  173  285:iload           4
	//  174  287:aload_0         
	//  175  288:getfield        #28  <Field int bitsLeft_>
	//  176  291:isub            
	//  177  292:istore_2        
				abyte2 = buffer_;
	//  178  293:aload_0         
	//  179  294:getfield        #24  <Field byte[] buffer_>
	//  180  297:astore          7
				l = index_ + 1;
	//  181  299:aload_0         
	//  182  300:getfield        #26  <Field int index_>
	//  183  303:iconst_1        
	//  184  304:iadd            
	//  185  305:istore          4
				index_ = l;
	//  186  307:aload_0         
	//  187  308:iload           4
	//  188  310:putfield        #26  <Field int index_>
				abyte2[l] = 0;
	//  189  313:aload           7
	//  190  315:iload           4
	//  191  317:iconst_0        
	//  192  318:bastore         
				bitsLeft_ = 8;
	//  193  319:aload_0         
	//  194  320:bipush          8
	//  195  322:putfield        #28  <Field int bitsLeft_>
			} else
	//* 196  325:goto            159
			{
				j = bitsLeft_;
	//  197  328:aload_0         
	//  198  329:getfield        #28  <Field int bitsLeft_>
	//  199  332:istore_2        
				int i1 = bitsLeft_;
	//  200  333:aload_0         
	//  201  334:getfield        #28  <Field int bitsLeft_>
	//  202  337:istore          5
				byte abyte3[] = buffer_;
	//  203  339:aload_0         
	//  204  340:getfield        #24  <Field byte[] buffer_>
	//  205  343:astore          7
				int j1 = index_;
	//  206  345:aload_0         
	//  207  346:getfield        #26  <Field int index_>
	//  208  349:istore          6
				abyte3[j1] = (byte)(abyte3[j1] | k >>> l - j & (1 << i1) - 1);
	//  209  351:aload           7
	//  210  353:iload           6
	//  211  355:aload           7
	//  212  357:iload           6
	//  213  359:baload          
	//  214  360:iload_3         
	//  215  361:iload           4
	//  216  363:iload_2         
	//  217  364:isub            
	//  218  365:iushr           
	//  219  366:iconst_1        
	//  220  367:iload           5
	//  221  369:ishl            
	//  222  370:iconst_1        
	//  223  371:isub            
	//  224  372:iand            
	//  225  373:ior             
	//  226  374:int2byte        
	//  227  375:bastore         
				j = l - bitsLeft_;
	//  228  376:iload           4
	//  229  378:aload_0         
	//  230  379:getfield        #28  <Field int bitsLeft_>
	//  231  382:isub            
	//  232  383:istore_2        
				i += bitsLeft_;
	//  233  384:iload_1         
	//  234  385:aload_0         
	//  235  386:getfield        #28  <Field int bitsLeft_>
	//  236  389:iadd            
	//  237  390:istore_1        
				abyte3 = buffer_;
	//  238  391:aload_0         
	//  239  392:getfield        #24  <Field byte[] buffer_>
	//  240  395:astore          7
				l = index_ + 1;
	//  241  397:aload_0         
	//  242  398:getfield        #26  <Field int index_>
	//  243  401:iconst_1        
	//  244  402:iadd            
	//  245  403:istore          4
				index_ = l;
	//  246  405:aload_0         
	//  247  406:iload           4
	//  248  408:putfield        #26  <Field int index_>
				abyte3[l] = 0;
	//  249  411:aload           7
	//  250  413:iload           4
	//  251  415:iconst_0        
	//  252  416:bastore         
				bitsLeft_ = 8;
	//  253  417:aload_0         
	//  254  418:bipush          8
	//  255  420:putfield        #28  <Field int bitsLeft_>
			}
			l = j;
		} while(j != 0);
	//* 256  423:goto            159
	}

	int bitsLeft_;
	boolean blocks_;
	byte buffer_[];
	int index_;
	OutputStream output_;
}
